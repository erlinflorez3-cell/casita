package com.facebook.react.devsupport;

import com.dynatrace.android.agent.Global;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
class MultipartStreamReader {
    private static final String CRLF = "\r\n";
    private final String mBoundary;
    private long mLastProgressEvent;
    private final BufferedSource mSource;

    public interface ChunkListener {
        void onChunkComplete(Map<String, String> map, Buffer buffer, boolean z2) throws IOException;

        void onChunkProgress(Map<String, String> map, long j2, long j3) throws IOException;
    }

    public MultipartStreamReader(BufferedSource bufferedSource, String str) {
        this.mSource = bufferedSource;
        this.mBoundary = str;
    }

    private void emitChunk(Buffer buffer, boolean z2, ChunkListener chunkListener) throws IOException {
        long jIndexOf = buffer.indexOf(ByteString.encodeUtf8("\r\n\r\n"));
        if (jIndexOf == -1) {
            chunkListener.onChunkComplete(null, buffer, z2);
            return;
        }
        Buffer buffer2 = new Buffer();
        Buffer buffer3 = new Buffer();
        buffer.read(buffer2, jIndexOf);
        buffer.skip(r5.size());
        buffer.readAll(buffer3);
        chunkListener.onChunkComplete(parseHeaders(buffer2), buffer3, z2);
    }

    private void emitProgress(Map<String, String> map, long j2, boolean z2, ChunkListener chunkListener) throws IOException {
        if (map == null || chunkListener == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.mLastProgressEvent > 16 || z2) {
            this.mLastProgressEvent = jCurrentTimeMillis;
            chunkListener.onChunkProgress(map, j2, map.get("Content-Length") != null ? Long.parseLong(map.get("Content-Length")) : 0L);
        }
    }

    private Map<String, String> parseHeaders(Buffer buffer) {
        HashMap map = new HashMap();
        for (String str : buffer.readUtf8().split(CRLF)) {
            int iIndexOf = str.indexOf(Global.COLON);
            if (iIndexOf != -1) {
                map.put(str.substring(0, iIndexOf).trim(), str.substring(iIndexOf + 1).trim());
            }
        }
        return map;
    }

    public boolean readAllParts(ChunkListener chunkListener) throws IOException {
        boolean z2;
        ByteString byteStringEncodeUtf8 = ByteString.encodeUtf8("\r\n--" + this.mBoundary + CRLF);
        ByteString byteStringEncodeUtf82 = ByteString.encodeUtf8("\r\n--" + this.mBoundary + "--\r\n");
        ByteString byteStringEncodeUtf83 = ByteString.encodeUtf8("\r\n\r\n");
        Buffer buffer = new Buffer();
        long size = 0;
        long size2 = 0;
        long size3 = 0;
        Map<String, String> headers = null;
        while (true) {
            long jMax = Math.max(size - ((long) byteStringEncodeUtf82.size()), size2);
            long jIndexOf = buffer.indexOf(byteStringEncodeUtf8, jMax);
            if (jIndexOf == -1) {
                jIndexOf = buffer.indexOf(byteStringEncodeUtf82, jMax);
                z2 = true;
            } else {
                z2 = false;
            }
            if (jIndexOf == -1) {
                size = buffer.size();
                if (headers == null) {
                    long jIndexOf2 = buffer.indexOf(byteStringEncodeUtf83, jMax);
                    if (jIndexOf2 >= 0) {
                        this.mSource.read(buffer, jIndexOf2);
                        Buffer buffer2 = new Buffer();
                        buffer.copyTo(buffer2, jMax, jIndexOf2 - jMax);
                        size3 = buffer2.size() + ((long) byteStringEncodeUtf83.size());
                        headers = parseHeaders(buffer2);
                    }
                } else {
                    emitProgress(headers, buffer.size() - size3, false, chunkListener);
                }
                if (this.mSource.read(buffer, 4096) <= 0) {
                    return false;
                }
            } else {
                long j2 = jIndexOf - size2;
                if (size2 > 0) {
                    Buffer buffer3 = new Buffer();
                    buffer.skip(size2);
                    buffer.read(buffer3, j2);
                    emitProgress(headers, buffer3.size() - size3, true, chunkListener);
                    emitChunk(buffer3, z2, chunkListener);
                    size3 = 0;
                    headers = null;
                } else {
                    buffer.skip(jIndexOf);
                }
                if (z2) {
                    return true;
                }
                size2 = byteStringEncodeUtf8.size();
                size = size2;
            }
        }
    }
}
