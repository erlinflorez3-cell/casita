package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.VolleyLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DiskBasedCache implements Cache {
    private static final int CACHE_MAGIC = 538247942;
    private static final int DEFAULT_DISK_USAGE_BYTES = 5242880;
    static final float HYSTERESIS_FACTOR = 0.9f;
    private final Map<String, CacheHeader> mEntries;
    private final int mMaxCacheSizeInBytes;
    private final FileSupplier mRootDirectorySupplier;
    private long mTotalSize;

    /* JADX INFO: loaded from: classes2.dex */
    static class CacheHeader {
        final List<Header> allResponseHeaders;
        final String etag;
        final String key;
        final long lastModified;
        final long serverDate;
        long size;
        final long softTtl;
        final long ttl;

        CacheHeader(String str, Cache.Entry entry) {
            this(str, entry.etag, entry.serverDate, entry.lastModified, entry.ttl, entry.softTtl, getAllResponseHeaders(entry));
        }

        private CacheHeader(String str, String str2, long j2, long j3, long j4, long j5, List<Header> list) {
            this.key = str;
            this.etag = "".equals(str2) ? null : str2;
            this.serverDate = j2;
            this.lastModified = j3;
            this.ttl = j4;
            this.softTtl = j5;
            this.allResponseHeaders = list;
        }

        private static List<Header> getAllResponseHeaders(Cache.Entry entry) {
            return entry.allResponseHeaders != null ? entry.allResponseHeaders : HttpHeaderParser.toAllHeaderList(entry.responseHeaders);
        }

        static CacheHeader readHeader(CountingInputStream countingInputStream) throws IOException {
            if (DiskBasedCache.readInt(countingInputStream) == DiskBasedCache.CACHE_MAGIC) {
                return new CacheHeader(DiskBasedCache.readString(countingInputStream), DiskBasedCache.readString(countingInputStream), DiskBasedCache.readLong(countingInputStream), DiskBasedCache.readLong(countingInputStream), DiskBasedCache.readLong(countingInputStream), DiskBasedCache.readLong(countingInputStream), DiskBasedCache.readHeaderList(countingInputStream));
            }
            throw new IOException();
        }

        Cache.Entry toCacheEntry(byte[] bArr) {
            Cache.Entry entry = new Cache.Entry();
            entry.data = bArr;
            entry.etag = this.etag;
            entry.serverDate = this.serverDate;
            entry.lastModified = this.lastModified;
            entry.ttl = this.ttl;
            entry.softTtl = this.softTtl;
            entry.responseHeaders = HttpHeaderParser.toHeaderMap(this.allResponseHeaders);
            entry.allResponseHeaders = Collections.unmodifiableList(this.allResponseHeaders);
            return entry;
        }

        boolean writeHeader(OutputStream outputStream) throws Throwable {
            try {
                DiskBasedCache.writeInt(outputStream, DiskBasedCache.CACHE_MAGIC);
                DiskBasedCache.writeString(outputStream, this.key);
                String str = this.etag;
                if (str == null) {
                    str = "";
                }
                DiskBasedCache.writeString(outputStream, str);
                DiskBasedCache.writeLong(outputStream, this.serverDate);
                DiskBasedCache.writeLong(outputStream, this.lastModified);
                DiskBasedCache.writeLong(outputStream, this.ttl);
                DiskBasedCache.writeLong(outputStream, this.softTtl);
                DiskBasedCache.writeHeaderList(this.allResponseHeaders, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e2) {
                VolleyLog.d("%s", e2.toString());
                return false;
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class CountingInputStream extends FilterInputStream {
        private long bytesRead;
        private final long length;

        CountingInputStream(InputStream inputStream, long j2) {
            super(inputStream);
            this.length = j2;
        }

        long bytesRead() {
            return this.bytesRead;
        }

        long bytesRemaining() {
            return this.length - this.bytesRead;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i2 = super.read();
            if (i2 != -1) {
                this.bytesRead++;
            }
            return i2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = super.read(bArr, i2, i3);
            if (i4 != -1) {
                this.bytesRead += (long) i4;
            }
            return i4;
        }
    }

    public interface FileSupplier {
        File get();
    }

    public DiskBasedCache(FileSupplier fileSupplier) {
        this(fileSupplier, DEFAULT_DISK_USAGE_BYTES);
    }

    public DiskBasedCache(FileSupplier fileSupplier, int i2) {
        this.mEntries = new LinkedHashMap(16, 0.75f, true);
        this.mTotalSize = 0L;
        this.mRootDirectorySupplier = fileSupplier;
        this.mMaxCacheSizeInBytes = i2;
    }

    public DiskBasedCache(File file) {
        this(file, DEFAULT_DISK_USAGE_BYTES);
    }

    public DiskBasedCache(final File file, int i2) {
        this.mEntries = new LinkedHashMap(16, 0.75f, true);
        this.mTotalSize = 0L;
        this.mRootDirectorySupplier = new FileSupplier() { // from class: com.android.volley.toolbox.DiskBasedCache.1
            @Override // com.android.volley.toolbox.DiskBasedCache.FileSupplier
            public File get() {
                return file;
            }
        };
        this.mMaxCacheSizeInBytes = i2;
    }

    private String getFilenameForKey(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    private void initializeIfRootDirectoryDeleted() throws Throwable {
        if (this.mRootDirectorySupplier.get().exists()) {
            return;
        }
        VolleyLog.d("Re-initializing cache after external clearing.", new Object[0]);
        this.mEntries.clear();
        this.mTotalSize = 0L;
        initialize();
    }

    private void pruneIfNeeded() throws Throwable {
        if (this.mTotalSize < this.mMaxCacheSizeInBytes) {
            return;
        }
        int i2 = 0;
        if (VolleyLog.DEBUG) {
            VolleyLog.v("Pruning old cache entries.", new Object[0]);
        }
        long j2 = this.mTotalSize;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, CacheHeader>> it = this.mEntries.entrySet().iterator();
        while (it.hasNext()) {
            CacheHeader value = it.next().getValue();
            if (getFileForKey(value.key).delete()) {
                this.mTotalSize -= value.size;
            } else {
                VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", value.key, getFilenameForKey(value.key));
            }
            it.remove();
            i2++;
            if (this.mTotalSize < this.mMaxCacheSizeInBytes * HYSTERESIS_FACTOR) {
                break;
            }
        }
        if (VolleyLog.DEBUG) {
            VolleyLog.v("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.mTotalSize - j2), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    private void putEntry(String str, CacheHeader cacheHeader) {
        if (this.mEntries.containsKey(str)) {
            this.mTotalSize += cacheHeader.size - this.mEntries.get(str).size;
        } else {
            this.mTotalSize += cacheHeader.size;
        }
        this.mEntries.put(str, cacheHeader);
    }

    private static int read(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        if (i2 != -1) {
            return i2;
        }
        throw new EOFException();
    }

    static List<Header> readHeaderList(CountingInputStream countingInputStream) throws IOException {
        int i2 = readInt(countingInputStream);
        if (i2 < 0) {
            throw new IOException("readHeaderList size=" + i2);
        }
        List<Header> listEmptyList = i2 == 0 ? Collections.emptyList() : new ArrayList<>();
        for (int i3 = 0; i3 < i2; i3++) {
            listEmptyList.add(new Header(readString(countingInputStream).intern(), readString(countingInputStream).intern()));
        }
        return listEmptyList;
    }

    static int readInt(InputStream inputStream) throws IOException {
        return (read(inputStream) << 24) | ((-1) - (((-1) - (read(inputStream) | (read(inputStream) << 8))) & ((-1) - (read(inputStream) << 16))));
    }

    static long readLong(InputStream inputStream) throws IOException {
        long j2 = ((-1) - (((-1) - (((-1) - (((-1) - ((-1) - (((-1) - ((long) read(inputStream))) | ((-1) - 255)))) & ((-1) - ((((long) read(inputStream)) & 255) << 8)))) | ((((long) read(inputStream)) & 255) << 16))) & ((-1) - (((-1) - (((-1) - ((long) read(inputStream))) | ((-1) - 255))) << 24)))) | ((((long) read(inputStream)) & 255) << 32);
        long j3 = (((long) read(inputStream)) & 255) << 40;
        long j4 = (j2 + j3) - (j2 & j3);
        long j5 = (((long) read(inputStream)) & 255) << 48;
        long j6 = (j4 + j5) - (j4 & j5);
        long j7 = ((-1) - (((-1) - 255) | ((-1) - ((long) read(inputStream))))) << 56;
        return (j6 + j7) - (j6 & j7);
    }

    static String readString(CountingInputStream countingInputStream) throws IOException {
        return new String(streamToBytes(countingInputStream, readLong(countingInputStream)), "UTF-8");
    }

    private void removeEntry(String str) {
        CacheHeader cacheHeaderRemove = this.mEntries.remove(str);
        if (cacheHeaderRemove != null) {
            this.mTotalSize -= cacheHeaderRemove.size;
        }
    }

    static byte[] streamToBytes(CountingInputStream countingInputStream, long j2) throws IOException {
        long jBytesRemaining = countingInputStream.bytesRemaining();
        if (j2 >= 0 && j2 <= jBytesRemaining) {
            int i2 = (int) j2;
            if (i2 == j2) {
                byte[] bArr = new byte[i2];
                new DataInputStream(countingInputStream).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j2 + ", maxLength=" + jBytesRemaining);
    }

    static void writeHeaderList(List<Header> list, OutputStream outputStream) throws IOException {
        if (list == null) {
            writeInt(outputStream, 0);
            return;
        }
        writeInt(outputStream, list.size());
        for (Header header : list) {
            writeString(outputStream, header.getName());
            writeString(outputStream, header.getValue());
        }
    }

    static void writeInt(OutputStream outputStream, int i2) throws IOException {
        outputStream.write((-1) - (((-1) - i2) | ((-1) - 255)));
        outputStream.write((i2 >> 8) & 255);
        outputStream.write((-1) - (((-1) - (i2 >> 16)) | ((-1) - 255)));
        outputStream.write((i2 >> 24) & 255);
    }

    static void writeLong(OutputStream outputStream, long j2) throws IOException {
        outputStream.write((byte) j2);
        outputStream.write((byte) (j2 >>> 8));
        outputStream.write((byte) (j2 >>> 16));
        outputStream.write((byte) (j2 >>> 24));
        outputStream.write((byte) (j2 >>> 32));
        outputStream.write((byte) (j2 >>> 40));
        outputStream.write((byte) (j2 >>> 48));
        outputStream.write((byte) (j2 >>> 56));
    }

    static void writeString(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        writeLong(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.android.volley.Cache
    public synchronized void clear() {
        File[] fileArrListFiles = this.mRootDirectorySupplier.get().listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }
        this.mEntries.clear();
        this.mTotalSize = 0L;
        VolleyLog.d("Cache cleared.", new Object[0]);
    }

    InputStream createInputStream(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    OutputStream createOutputStream(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    @Override // com.android.volley.Cache
    public synchronized Cache.Entry get(String str) {
        CacheHeader cacheHeader = this.mEntries.get(str);
        if (cacheHeader == null) {
            return null;
        }
        File fileForKey = getFileForKey(str);
        try {
            CountingInputStream countingInputStream = new CountingInputStream(new BufferedInputStream(createInputStream(fileForKey)), fileForKey.length());
            try {
                CacheHeader header = CacheHeader.readHeader(countingInputStream);
                if (TextUtils.equals(str, header.key)) {
                    return cacheHeader.toCacheEntry(streamToBytes(countingInputStream, countingInputStream.bytesRemaining()));
                }
                VolleyLog.d("%s: key=%s, found=%s", fileForKey.getAbsolutePath(), str, header.key);
                removeEntry(str);
                return null;
            } finally {
                countingInputStream.close();
            }
        } catch (IOException e2) {
            VolleyLog.d("%s: %s", fileForKey.getAbsolutePath(), e2.toString());
            remove(str);
            return null;
        }
    }

    public File getFileForKey(String str) {
        return new File(this.mRootDirectorySupplier.get(), getFilenameForKey(str));
    }

    @Override // com.android.volley.Cache
    public synchronized void initialize() {
        long length;
        CountingInputStream countingInputStream;
        File file = this.mRootDirectorySupplier.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                VolleyLog.e("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                length = file2.length();
                countingInputStream = new CountingInputStream(new BufferedInputStream(createInputStream(file2)), length);
            } catch (IOException unused) {
                file2.delete();
            }
            try {
                CacheHeader header = CacheHeader.readHeader(countingInputStream);
                header.size = length;
                putEntry(header.key, header);
                countingInputStream.close();
            } catch (Throwable th) {
                countingInputStream.close();
                throw th;
            }
        }
    }

    @Override // com.android.volley.Cache
    public synchronized void invalidate(String str, boolean z2) {
        Cache.Entry entry = get(str);
        if (entry != null) {
            entry.softTtl = 0L;
            if (z2) {
                entry.ttl = 0L;
            }
            put(str, entry);
        }
    }

    @Override // com.android.volley.Cache
    public synchronized void put(String str, Cache.Entry entry) {
        BufferedOutputStream bufferedOutputStream;
        CacheHeader cacheHeader;
        if (this.mTotalSize + ((long) entry.data.length) <= this.mMaxCacheSizeInBytes || entry.data.length <= this.mMaxCacheSizeInBytes * HYSTERESIS_FACTOR) {
            File fileForKey = getFileForKey(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(createOutputStream(fileForKey));
                cacheHeader = new CacheHeader(str, entry);
            } catch (IOException unused) {
                if (!fileForKey.delete()) {
                    VolleyLog.d("Could not clean up file %s", fileForKey.getAbsolutePath());
                }
                initializeIfRootDirectoryDeleted();
            }
            if (!cacheHeader.writeHeader(bufferedOutputStream)) {
                bufferedOutputStream.close();
                VolleyLog.d("Failed to write header for %s", fileForKey.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(entry.data);
            bufferedOutputStream.close();
            cacheHeader.size = fileForKey.length();
            putEntry(str, cacheHeader);
            pruneIfNeeded();
        }
    }

    @Override // com.android.volley.Cache
    public synchronized void remove(String str) {
        boolean zDelete = getFileForKey(str).delete();
        removeEntry(str);
        if (!zDelete) {
            VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", str, getFilenameForKey(str));
        }
    }
}
