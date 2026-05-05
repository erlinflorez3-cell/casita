package com.upokecenter.util;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okio.Utf8;

/* JADX INFO: loaded from: classes5.dex */
public final class DataUtilities {
    private static final int StreamedStringBufferLength = 4096;

    private DataUtilities() {
    }

    public static int CodePointAt(String str, int i2) {
        return CodePointAt(str, i2, 0);
    }

    public static int CodePointAt(String str, int i2, int i3) {
        int i4;
        if (str == null) {
            throw new NullPointerException("str");
        }
        if (i2 >= str.length() || i2 < 0) {
            return -1;
        }
        char cCharAt = str.charAt(i2);
        if ((-1) - ((65535 - cCharAt) | ((-1) - 64512)) == 55296 && (i4 = i2 + 1) < str.length()) {
            char cCharAt2 = str.charAt(i4);
            if ((64512 + cCharAt2) - (64512 | cCharAt2) == 56320) {
                char cCharAt3 = str.charAt(i4);
                return (((cCharAt + 1023) - (cCharAt | 1023)) << 10) + 65536 + ((cCharAt3 + 1023) - (cCharAt3 | 1023));
            }
        }
        if ((-1) - (((-1) - 63488) | (65535 - cCharAt)) != 55296) {
            return cCharAt;
        }
        if (i3 == 0) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        if (i3 == 1) {
            return cCharAt;
        }
        return -1;
    }

    public static int CodePointBefore(String str, int i2) {
        return CodePointBefore(str, i2, 0);
    }

    public static int CodePointBefore(String str, int i2, int i3) {
        int i4;
        if (str == null) {
            throw new NullPointerException("str");
        }
        if (i2 <= 0 || i2 > str.length()) {
            return -1;
        }
        char cCharAt = str.charAt(i2 - 1);
        if ((cCharAt + 64512) - (cCharAt | 64512) == 56320 && i2 - 2 >= 0 && (-1) - (((-1) - 64512) | (65535 - str.charAt(i4))) == 55296) {
            return (((-1) - ((65535 - str.charAt(i4)) | ((-1) - 1023))) << 10) + 65536 + (cCharAt & 1023);
        }
        if ((-1) - (((-1) - 63488) | (65535 - cCharAt)) != 55296) {
            return cCharAt;
        }
        if (i3 == 0) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        if (i3 == 1) {
            return cCharAt;
        }
        return -1;
    }

    public static int CodePointCompare(String str, String str2) {
        int i2;
        int i3;
        boolean z2;
        if (str == null) {
            return str2 == null ? 0 : -1;
        }
        if (str2 == null) {
            return 1;
        }
        int iMin = Math.min(str.length(), str2.length());
        int i4 = 0;
        while (i4 < iMin) {
            int iCharAt = str.charAt(i4);
            int iCharAt2 = str2.charAt(i4);
            if (iCharAt != iCharAt2) {
                if ((iCharAt & 63488) != 55296 && (iCharAt2 + 63488) - (iCharAt2 | 63488) != 55296) {
                    return iCharAt - iCharAt2;
                }
                if ((iCharAt + 64512) - (iCharAt | 64512) == 55296 && (i3 = i4 + 1) < str.length() && (str.charAt(i3) & 64512) == 56320) {
                    iCharAt = (((iCharAt + 1023) - (iCharAt | 1023)) << 10) + 65536 + ((-1) - ((65535 - str.charAt(i3)) | ((-1) - 1023)));
                }
                if ((-1) - (((-1) - iCharAt2) | ((-1) - 64512)) == 55296 && (i2 = i4 + 1) < str2.length()) {
                    char cCharAt = str2.charAt(i2);
                    if ((cCharAt + 64512) - (cCharAt | 64512) == 56320) {
                        iCharAt2 = (((-1) - (((-1) - iCharAt2) | ((-1) - 1023))) << 10) + 65536 + (str2.charAt(i2) & 1023);
                    }
                }
                return iCharAt - iCharAt2;
            }
            if ((63488 & iCharAt) == 55296) {
                int i5 = i4 + 1;
                if (i5 >= str.length() || (-1) - ((65535 - str.charAt(i5)) | ((-1) - 64512)) != 56320) {
                    z2 = false;
                } else {
                    iCharAt = (((-1) - (((-1) - iCharAt) | ((-1) - 1023))) << 10) + 65536 + ((-1) - ((65535 - str.charAt(i5)) | ((-1) - 1023)));
                    z2 = true;
                }
                if (i5 < str2.length() && (-1) - (((-1) - 64512) | (65535 - str2.charAt(i5))) == 56320) {
                    iCharAt2 = ((iCharAt2 & 1023) << 10) + 65536 + ((-1) - ((65535 - str2.charAt(i5)) | ((-1) - 1023)));
                    z2 = true;
                }
                if (iCharAt != iCharAt2) {
                    return iCharAt - iCharAt2;
                }
                if (z2) {
                    i4 = i5;
                }
            }
            i4++;
        }
        if (str.length() == str2.length()) {
            return 0;
        }
        return str.length() < str2.length() ? -1 : 1;
    }

    public static int CodePointLength(String str) {
        if (str == null) {
            throw new NullPointerException("str");
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            i3++;
            i2 += CodePointAt(str, i2) >= 65536 ? 2 : 1;
        }
        return i3;
    }

    public static byte[] GetUtf8Bytes(String str, boolean z2) {
        return GetUtf8Bytes(str, z2, false);
    }

    public static byte[] GetUtf8Bytes(String str, boolean z2, boolean z3) throws Throwable {
        if (str == null) {
            throw new NullPointerException("str");
        }
        if (!z3 && str.length() == 1) {
            char cCharAt = str.charAt(0);
            if ((-1) - (((-1) - 63488) | (65535 - cCharAt)) == 55296) {
                if (!z2) {
                    throw new IllegalArgumentException("Unpaired surrogate code point");
                }
                cCharAt = Utf8.REPLACEMENT_CHARACTER;
            }
            if (cCharAt <= 128) {
                return new byte[]{(byte) cCharAt};
            }
            if (cCharAt <= 2047) {
                return new byte[]{(byte) ((-1) - (((-1) - ((-1) - (((-1) - (cCharAt >> 6)) | ((-1) - 31)))) & ((-1) - 192))), (byte) (((cCharAt + '?') - (cCharAt | '?')) | 128)};
            }
            int i2 = cCharAt >> '\f';
            int i3 = (i2 + 15) - (i2 | 15);
            return new byte[]{(byte) ((i3 + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY) - (i3 & CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY)), (byte) (((cCharAt >> 6) & 63) | 128), (byte) ((-1) - (((-1) - (cCharAt & '?')) & ((-1) - 128)))};
        }
        if (str.length() == 2) {
            char cCharAt2 = str.charAt(0);
            char cCharAt3 = str.charAt(1);
            if ((cCharAt2 + 64512) - (cCharAt2 | 64512) == 55296 && (cCharAt3 & 64512) == 56320) {
                int i4 = ((cCharAt2 & 1023) << 10) + 65536 + (cCharAt3 & 1023);
                int i5 = i4 >> 18;
                byte b2 = (byte) ((-1) - (((-1) - ((i5 + 7) - (i5 | 7))) & ((-1) - 240)));
                int i6 = i4 >> 12;
                int i7 = (i6 + 63) - (i6 | 63);
                return new byte[]{b2, (byte) ((i7 + 128) - (i7 & 128)), (byte) (((-1) - (((-1) - (i4 >> 6)) | ((-1) - 63))) | 128), (byte) ((i4 & 63) | 128)};
            }
            if (!z3 && cCharAt2 <= 128 && cCharAt3 <= 128) {
                return new byte[]{(byte) cCharAt2, (byte) cCharAt3};
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                if (WriteUtf8(str, 0, str.length(), byteArrayOutputStream2, z2, z3) != 0) {
                    throw new IllegalArgumentException("Unpaired surrogate code point");
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException unused) {
                }
                return byteArray;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                try {
                    throw th;
                } catch (IOException e2) {
                    throw new IllegalArgumentException("I/O error occurred", e2);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static long GetUtf8Length(String str, boolean z2) {
        long j2;
        if (str == null) {
            throw new NullPointerException("str");
        }
        long j3 = 0;
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 127) {
                j2 = 1;
            } else if (cCharAt <= 2047) {
                j2 = 2;
            } else {
                if (cCharAt <= 55295 || cCharAt >= 57344) {
                    j3 += 3;
                } else {
                    if (cCharAt <= 56319) {
                        int i3 = i2 + 1;
                        if (i3 < str.length() && str.charAt(i3) >= 56320 && str.charAt(i3) <= 57343) {
                            j3 += 4;
                            i2 = i3;
                        } else if (!z2) {
                            return -1L;
                        }
                    } else if (!z2) {
                        return -1L;
                    }
                    j3 += 3;
                }
                i2++;
            }
            j3 += j2;
            i2++;
        }
        return j3;
    }

    public static String GetUtf8String(byte[] bArr, int i2, int i3, boolean z2) {
        if (bArr == null) {
            throw new NullPointerException("bytes");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("offset(" + i2 + ") is less than 0");
        }
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("offset(" + i2 + ") is more than " + bArr.length);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("bytesCount(" + i3 + ") is less than 0");
        }
        if (i3 > bArr.length) {
            throw new IllegalArgumentException("bytesCount(" + i3 + ") is more than " + bArr.length);
        }
        if (bArr.length - i2 < i3) {
            throw new IllegalArgumentException("bytes's length minus " + i2 + "(" + (bArr.length - i2) + ") is less than " + i3);
        }
        StringBuilder sb = new StringBuilder();
        if (ReadUtf8FromBytes(bArr, i2, i3, sb, z2) == 0) {
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    public static String GetUtf8String(byte[] bArr, boolean z2) {
        if (bArr == null) {
            throw new NullPointerException("bytes");
        }
        StringBuilder sb = new StringBuilder();
        if (ReadUtf8FromBytes(bArr, 0, bArr.length, sb, z2) == 0) {
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x014a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0142, code lost:
    
        if (r12 == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0144, code lost:
    
        if (r23 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0146, code lost:
    
        r22.append(okio.Utf8.REPLACEMENT_CHARACTER);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0149, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int ReadUtf8(java.io.InputStream r20, int r21, java.lang.StringBuilder r22, boolean r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.util.DataUtilities.ReadUtf8(java.io.InputStream, int, java.lang.StringBuilder, boolean):int");
    }

    public static int ReadUtf8FromBytes(byte[] bArr, int i2, int i3, StringBuilder sb, boolean z2) {
        int i4 = i2;
        if (bArr == null) {
            throw new NullPointerException("data");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("offset(" + i4 + ") is less than 0");
        }
        if (i4 > bArr.length) {
            throw new IllegalArgumentException("offset(" + i4 + ") is more than " + bArr.length);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("bytesCount(" + i3 + ") is less than 0");
        }
        if (i3 > bArr.length) {
            throw new IllegalArgumentException("bytesCount(" + i3 + ") is more than " + bArr.length);
        }
        if (bArr.length - i4 < i3) {
            throw new IllegalArgumentException("data.length minus offset(" + (bArr.length - i4) + ") is less than " + i3);
        }
        if (sb == null) {
            throw new NullPointerException("builder");
        }
        int i5 = i3 + i4;
        while (true) {
            int i6 = 191;
            int i7 = 128;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i4 < i5) {
                byte b2 = bArr[i4];
                int i11 = (-1) - (((-1) - b2) | ((-1) - 255));
                int i12 = i4 + 1;
                if (i8 == 0) {
                    if ((-1) - (((-1) - b2) | ((-1) - 127)) == i11) {
                        sb.append((char) i11);
                    } else if (i11 >= 194 && i11 <= 223) {
                        i10 = (i11 - 192) << 6;
                        i8 = 1;
                    } else if (i11 >= 224 && i11 <= 239) {
                        i7 = i11 == 224 ? 160 : 128;
                        i6 = i11 == 237 ? 159 : 191;
                        i10 = (i11 - 224) << 12;
                        i8 = 2;
                    } else if (i11 >= 240 && i11 <= 244) {
                        i7 = i11 == 240 ? 144 : 128;
                        i6 = i11 == 244 ? 143 : 191;
                        i10 = (i11 - 240) << 18;
                        i8 = 3;
                    } else {
                        if (!z2) {
                            return -1;
                        }
                        sb.append(Utf8.REPLACEMENT_CHARACTER);
                    }
                } else if (i11 >= i7 && i11 <= i6) {
                    i9++;
                    i10 += (i11 - 128) << ((i8 - i9) * 6);
                    if (i9 != i8) {
                        i6 = 191;
                        i7 = 128;
                    } else {
                        if (i10 <= 65535) {
                            sb.append((char) i10);
                        } else {
                            int i13 = i10 - 65536;
                            int i14 = (i13 >> 10) + 55296;
                            int i15 = (i13 & 1023) + Utf8.LOG_SURROGATE_HEADER;
                            sb.append((char) i14);
                            sb.append((char) i15);
                        }
                        i6 = 191;
                        i7 = 128;
                        i8 = 0;
                        i9 = 0;
                        i10 = 0;
                    }
                } else {
                    if (!z2) {
                        return -1;
                    }
                    sb.append(Utf8.REPLACEMENT_CHARACTER);
                }
                i4 = i12;
            }
            if (i8 != 0) {
                if (!z2) {
                    return -1;
                }
                sb.append(Utf8.REPLACEMENT_CHARACTER);
            }
            return 0;
        }
    }

    public static String ReadUtf8ToString(InputStream inputStream) throws IOException {
        return ReadUtf8ToString(inputStream, -1, true);
    }

    public static String ReadUtf8ToString(InputStream inputStream, int i2, boolean z2) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (ReadUtf8(inputStream, i2, sb, z2) != -1) {
            return sb.toString();
        }
        throw new IOException("Unpaired surrogate code point found.", new IllegalArgumentException("Unpaired surrogate code point found."));
    }

    public static String ToLowerCaseAscii(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                        sb.append(cCharAt2);
                    } else {
                        sb.append((char) (cCharAt2 + TokenParser.SP));
                    }
                }
                return sb.toString();
            }
        }
        return str;
    }

    public static String ToUpperCaseAscii(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        sb.append(cCharAt2);
                    } else {
                        sb.append((char) (cCharAt2 - ' '));
                    }
                }
                return sb.toString();
            }
        }
        return str;
    }

    public static int WriteUtf8(String str, int i2, int i3, OutputStream outputStream, boolean z2) throws IOException {
        return WriteUtf8(str, i2, i3, outputStream, z2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int WriteUtf8(java.lang.String r11, int r12, int r13, java.io.OutputStream r14, boolean r15, boolean r16) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.util.DataUtilities.WriteUtf8(java.lang.String, int, int, java.io.OutputStream, boolean, boolean):int");
    }

    public static int WriteUtf8(String str, OutputStream outputStream, boolean z2) throws IOException {
        if (str != null) {
            return WriteUtf8(str, 0, str.length(), outputStream, z2);
        }
        throw new NullPointerException("str");
    }
}
