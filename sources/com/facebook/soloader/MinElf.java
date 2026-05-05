package com.facebook.soloader;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class MinElf {
    public static final int DT_NEEDED = 1;
    public static final int DT_NULL = 0;
    public static final int DT_STRTAB = 5;
    public static final int ELF_MAGIC = 1179403647;
    public static final int PN_XNUM = 65535;
    public static final int PT_DYNAMIC = 2;
    public static final int PT_LOAD = 1;
    private static final String TAG = "MinElf";

    protected static class ElfError extends UnsatisfiedLinkError {
        ElfError(String str) {
            super(str);
        }
    }

    public interface ISA {
        public static final String AARCH64 = "arm64-v8a";
        public static final String ARM = "armeabi-v7a";
        public static final String X86 = "x86";
        public static final String X86_64 = "x86_64";
    }

    public static String[] extract_DT_NEEDED(ElfByteChannel elfByteChannel) throws IOException {
        return elfByteChannel instanceof ElfFileChannel ? extract_DT_NEEDED_with_retries((ElfFileChannel) elfByteChannel) : extract_DT_NEEDED_no_retries(elfByteChannel);
    }

    public static String[] extract_DT_NEEDED(File file) throws IOException {
        ElfFileChannel elfFileChannel = new ElfFileChannel(file);
        try {
            String[] strArrExtract_DT_NEEDED = extract_DT_NEEDED(elfFileChannel);
            elfFileChannel.close();
            return strArrExtract_DT_NEEDED;
        } catch (Throwable th) {
            try {
                elfFileChannel.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String[] extract_DT_NEEDED_no_retries(ElfByteChannel elfByteChannel) throws IOException {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long j7 = getu32(elfByteChannel, byteBufferAllocate, 0L);
        if (j7 != 1179403647) {
            throw new ElfError("file is not ELF: magic is 0x" + Long.toHexString(j7) + ", it should be " + Long.toHexString(1179403647L));
        }
        boolean z2 = getu8(elfByteChannel, byteBufferAllocate, 4L) == 1;
        if (getu8(elfByteChannel, byteBufferAllocate, 5L) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        long j8 = z2 ? getu32(elfByteChannel, byteBufferAllocate, 28L) : get64(elfByteChannel, byteBufferAllocate, 32L);
        long j9 = z2 ? getu16(elfByteChannel, byteBufferAllocate, 44L) : getu16(elfByteChannel, byteBufferAllocate, 56L);
        int i2 = getu16(elfByteChannel, byteBufferAllocate, z2 ? 42L : 54L);
        if (j9 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            long j10 = z2 ? getu32(elfByteChannel, byteBufferAllocate, 32L) : get64(elfByteChannel, byteBufferAllocate, 40L);
            j9 = z2 ? getu32(elfByteChannel, byteBufferAllocate, j10 + 28) : getu32(elfByteChannel, byteBufferAllocate, j10 + 44);
        }
        long j11 = j8;
        long j12 = 0;
        while (true) {
            if (j12 >= j9) {
                j2 = 0;
                break;
            }
            if ((z2 ? getu32(elfByteChannel, byteBufferAllocate, j11) : getu32(elfByteChannel, byteBufferAllocate, j11)) == 2) {
                j2 = z2 ? getu32(elfByteChannel, byteBufferAllocate, j11 + 4) : get64(elfByteChannel, byteBufferAllocate, j11 + 8);
            } else {
                j11 += (long) i2;
                j12++;
            }
        }
        if (j2 == 0) {
            throw new ElfError("ELF file does not contain dynamic linking information");
        }
        long j13 = j2;
        int i3 = 0;
        long j14 = 0;
        do {
            j3 = z2 ? getu32(elfByteChannel, byteBufferAllocate, j13) : get64(elfByteChannel, byteBufferAllocate, j13);
            if (j3 == 1) {
                if (i3 == Integer.MAX_VALUE) {
                    throw new ElfError("malformed DT_NEEDED section");
                }
                i3++;
            } else if (j3 == 5) {
                j14 = z2 ? getu32(elfByteChannel, byteBufferAllocate, j13 + 4) : get64(elfByteChannel, byteBufferAllocate, j13 + 8);
            }
            j13 += z2 ? 8L : 16L;
        } while (j3 != 0);
        if (j14 == 0) {
            throw new ElfError("Dynamic section string-table not found");
        }
        int i4 = 0;
        while (true) {
            if (i4 >= j9) {
                j4 = 0;
                j5 = 0;
                break;
            }
            if ((z2 ? getu32(elfByteChannel, byteBufferAllocate, j8) : getu32(elfByteChannel, byteBufferAllocate, j8)) == 1) {
                long j15 = z2 ? getu32(elfByteChannel, byteBufferAllocate, j8 + 8) : get64(elfByteChannel, byteBufferAllocate, j8 + 16);
                long j16 = z2 ? getu32(elfByteChannel, byteBufferAllocate, j8 + 20) : get64(elfByteChannel, byteBufferAllocate, j8 + 40);
                if (j15 <= j14 && j14 < j16 + j15) {
                    j5 = (z2 ? getu32(elfByteChannel, byteBufferAllocate, j8 + 4) : get64(elfByteChannel, byteBufferAllocate, j8 + 8)) + (j14 - j15);
                    j4 = 0;
                }
            }
            j8 += (long) i2;
            i4++;
        }
        if (j5 == j4) {
            throw new ElfError("did not find file offset of DT_STRTAB table");
        }
        String[] strArr = new String[i3];
        int i5 = 0;
        do {
            j6 = z2 ? getu32(elfByteChannel, byteBufferAllocate, j2) : get64(elfByteChannel, byteBufferAllocate, j2);
            if (j6 == 1) {
                strArr[i5] = getSz(elfByteChannel, byteBufferAllocate, (z2 ? getu32(elfByteChannel, byteBufferAllocate, j2 + 4) : get64(elfByteChannel, byteBufferAllocate, j2 + 8)) + j5);
                if (i5 == Integer.MAX_VALUE) {
                    throw new ElfError("malformed DT_NEEDED section");
                }
                i5++;
            }
            j2 += z2 ? 8L : 16L;
        } while (j6 != 0);
        if (i5 == i3) {
            return strArr;
        }
        throw new ElfError("malformed DT_NEEDED section");
    }

    private static String[] extract_DT_NEEDED_with_retries(ElfFileChannel elfFileChannel) throws IOException {
        int i2 = 0;
        while (true) {
            try {
                return extract_DT_NEEDED_no_retries(elfFileChannel);
            } catch (ClosedByInterruptException e2) {
                i2++;
                if (i2 > 4) {
                    throw e2;
                }
                Thread.interrupted();
                LogUtil.e(TAG, "retrying extract_DT_NEEDED due to ClosedByInterruptException", e2);
                elfFileChannel.openChannel();
            }
        }
    }

    private static long get64(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j2) throws IOException {
        read(elfByteChannel, byteBuffer, 8, j2);
        return byteBuffer.getLong();
    }

    private static String getSz(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j2) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j3 = 1 + j2;
            short u8Var = getu8(elfByteChannel, byteBuffer, j2);
            if (u8Var == 0) {
                return sb.toString();
            }
            sb.append((char) u8Var);
            j2 = j3;
        }
    }

    private static int getu16(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j2) throws IOException {
        read(elfByteChannel, byteBuffer, 2, j2);
        return (-1) - (((-1) - byteBuffer.getShort()) | ((-1) - 65535));
    }

    private static long getu32(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j2) throws IOException {
        read(elfByteChannel, byteBuffer, 4, j2);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    private static short getu8(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j2) throws IOException {
        read(elfByteChannel, byteBuffer, 1, j2);
        return (short) ((-1) - (((-1) - byteBuffer.get()) | ((-1) - 255)));
    }

    private static void read(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, int i2, long j2) throws IOException {
        int i3;
        byteBuffer.position(0);
        byteBuffer.limit(i2);
        while (byteBuffer.remaining() > 0 && (i3 = elfByteChannel.read(byteBuffer, j2)) != -1) {
            j2 += (long) i3;
        }
        if (byteBuffer.remaining() > 0) {
            throw new ElfError("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
