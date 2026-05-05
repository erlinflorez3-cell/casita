package com.facebook.imagepipeline.bitmaps;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.common.references.CloseableReference;
import com.google.common.base.Ascii;
import java.io.IOException;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public class EmptyJpegGenerator {
    private static final byte[] EMPTY_JPEG_PREFIX = {-1, MessagePack.Code.FIXEXT16, -1, MessagePack.Code.STR32, 0, 67, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, MessagePack.Code.NIL, 0, 17, 8};
    private static final byte[] EMPTY_JPEG_SUFFIX = {3, 1, 34, 0, 2, 17, 0, 3, 17, 0, -1, MessagePack.Code.BIN8, 0, Ascii.US, 0, 0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, -1, MessagePack.Code.BIN8, 0, -75, 16, 0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 125, 1, 2, 3, 0, 4, 17, 5, Ascii.DC2, 33, 49, 65, 6, 19, 81, 97, 7, 34, 113, Ascii.DC4, 50, -127, -111, -95, 8, 35, 66, -79, MessagePack.Code.NEVER_USED, Ascii.NAK, 82, MessagePack.Code.INT16, -16, 36, 51, 98, 114, -126, 9, 10, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, 37, 38, 39, 40, 41, 42, 52, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, MessagePack.Code.FALSE, MessagePack.Code.TRUE, MessagePack.Code.BIN8, MessagePack.Code.BIN16, MessagePack.Code.BIN32, MessagePack.Code.EXT8, MessagePack.Code.EXT16, MessagePack.Code.EXT32, MessagePack.Code.FLOAT32, MessagePack.Code.INT32, MessagePack.Code.INT64, MessagePack.Code.FIXEXT1, MessagePack.Code.FIXEXT2, MessagePack.Code.FIXEXT4, MessagePack.Code.FIXEXT8, MessagePack.Code.FIXEXT16, MessagePack.Code.STR8, MessagePack.Code.STR16, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, MessagePack.Code.BIN8, 0, Ascii.US, 1, 0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, -1, MessagePack.Code.BIN8, 0, -75, 17, 0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 119, 0, 1, 2, 3, 17, 4, 5, 33, 49, 6, Ascii.DC2, 65, 81, 7, 97, 113, 19, 34, 50, -127, 8, Ascii.DC4, 66, -111, -95, -79, MessagePack.Code.NEVER_USED, 9, 35, 51, 82, -16, Ascii.NAK, 98, 114, MessagePack.Code.INT16, 10, Ascii.SYN, 36, 52, -31, 37, -15, Ascii.ETB, Ascii.CAN, Ascii.EM, Ascii.SUB, 38, 39, 40, 41, 42, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -126, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, MessagePack.Code.FALSE, MessagePack.Code.TRUE, MessagePack.Code.BIN8, MessagePack.Code.BIN16, MessagePack.Code.BIN32, MessagePack.Code.EXT8, MessagePack.Code.EXT16, MessagePack.Code.EXT32, MessagePack.Code.FLOAT32, MessagePack.Code.INT32, MessagePack.Code.INT64, MessagePack.Code.FIXEXT1, MessagePack.Code.FIXEXT2, MessagePack.Code.FIXEXT4, MessagePack.Code.FIXEXT8, MessagePack.Code.FIXEXT16, MessagePack.Code.STR8, MessagePack.Code.STR16, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, MessagePack.Code.STR16, 0, Ascii.FF, 3, 1, 0, 2, 17, 3, 17, 0, Utf8.REPLACEMENT_BYTE, 0, -114, -118, 40, MessagePack.Code.FIXSTR_PREFIX, Ascii.SI, -1, MessagePack.Code.STR8};
    private final PooledByteBufferFactory mPooledByteBufferFactory;

    public EmptyJpegGenerator(PooledByteBufferFactory pooledByteBufferFactory) {
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
    }

    public CloseableReference<PooledByteBuffer> generate(short s2, short s3) throws Throwable {
        PooledByteBufferOutputStream pooledByteBufferOutputStreamNewOutputStream = null;
        try {
            try {
                PooledByteBufferFactory pooledByteBufferFactory = this.mPooledByteBufferFactory;
                byte[] bArr = EMPTY_JPEG_PREFIX;
                int length = bArr.length;
                byte[] bArr2 = EMPTY_JPEG_SUFFIX;
                pooledByteBufferOutputStreamNewOutputStream = pooledByteBufferFactory.newOutputStream(length + bArr2.length + 4);
                pooledByteBufferOutputStreamNewOutputStream.write(bArr);
                pooledByteBufferOutputStreamNewOutputStream.write((byte) (s3 >> 8));
                pooledByteBufferOutputStreamNewOutputStream.write((byte) ((-1) - (((-1) - s3) | ((-1) - 255))));
                pooledByteBufferOutputStreamNewOutputStream.write((byte) (s2 >> 8));
                pooledByteBufferOutputStreamNewOutputStream.write((byte) ((s2 + 255) - (s2 | 255)));
                pooledByteBufferOutputStreamNewOutputStream.write(bArr2);
                return CloseableReference.of(pooledByteBufferOutputStreamNewOutputStream.toByteBuffer());
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } finally {
            if (pooledByteBufferOutputStreamNewOutputStream != null) {
                pooledByteBufferOutputStreamNewOutputStream.close();
            }
        }
    }
}
