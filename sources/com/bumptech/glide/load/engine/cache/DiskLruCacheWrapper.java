package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class DiskLruCacheWrapper implements DiskCache {
    private static final int APP_VERSION = 1;
    private static final String TAG = "DiskLruCacheWrapper";
    private static final int VALUE_COUNT = 1;
    private static DiskLruCacheWrapper wrapper = null;
    private final File directory;
    private DiskLruCache diskLruCache;
    private final long maxSize;
    private final DiskCacheWriteLocker writeLocker = new DiskCacheWriteLocker();
    private final SafeKeyGenerator safeKeyGenerator = new SafeKeyGenerator();

    @Deprecated
    protected DiskLruCacheWrapper(File file, long j2) {
        this.directory = file;
        this.maxSize = j2;
    }

    public static DiskCache create(File file, long j2) {
        return new DiskLruCacheWrapper(file, j2);
    }

    @Deprecated
    public static synchronized DiskCache get(File file, long j2) {
        if (wrapper == null) {
            wrapper = new DiskLruCacheWrapper(file, j2);
        }
        return wrapper;
    }

    private synchronized DiskLruCache getDiskCache() throws IOException {
        if (this.diskLruCache == null) {
            this.diskLruCache = DiskLruCache.open(this.directory, 1, 1, this.maxSize);
        }
        return this.diskLruCache;
    }

    private synchronized void resetDiskCache() {
        this.diskLruCache = null;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public synchronized void clear() {
        try {
            try {
                getDiskCache().delete();
            } catch (IOException e2) {
                if (Log.isLoggable(TAG, 5)) {
                }
            }
        } finally {
            resetDiskCache();
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void delete(Key key) {
        try {
            getDiskCache().remove(this.safeKeyGenerator.getSafeKey(key));
        } catch (IOException e2) {
            if (Log.isLoggable(TAG, 5)) {
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public File get(Key key) {
        String safeKey = this.safeKeyGenerator.getSafeKey(key);
        if (Log.isLoggable(TAG, 2)) {
            String str = "Get: Obtained: " + safeKey + " for for Key: " + key;
        }
        File file = null;
        try {
            DiskLruCache.Value value = getDiskCache().get(safeKey);
            if (value == null) {
                return null;
            }
            file = value.getFile(0);
            return file;
        } catch (IOException e2) {
            return Log.isLoggable(TAG, 5) ? file : file;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void put(Key key, DiskCache.Writer writer) {
        DiskLruCache diskCache;
        String safeKey = this.safeKeyGenerator.getSafeKey(key);
        this.writeLocker.acquire(safeKey);
        try {
            if (Log.isLoggable(TAG, 2)) {
                String str = "Put: Obtained: " + safeKey + " for for Key: " + key;
            }
            try {
                diskCache = getDiskCache();
            } catch (IOException e2) {
                if (Log.isLoggable(TAG, 5)) {
                }
            }
            if (diskCache.get(safeKey) != null) {
                return;
            }
            DiskLruCache.Editor editorEdit = diskCache.edit(safeKey);
            if (editorEdit == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + safeKey);
            }
            try {
                if (writer.write(editorEdit.getFile(0))) {
                    editorEdit.commit();
                }
                editorEdit.abortUnlessCommitted();
            } catch (Throwable th) {
                editorEdit.abortUnlessCommitted();
                throw th;
            }
        } finally {
            this.writeLocker.release(safeKey);
        }
    }
}
