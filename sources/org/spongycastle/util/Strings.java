package org.spongycastle.util;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Vector;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes2.dex */
public final class Strings {
    private static String LINE_SEPARATOR = null;

    private static class StringListImpl extends ArrayList<String> implements StringList {
        private StringListImpl() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public void add(int i2, String str) {
            super.add(i2, str);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(String str) {
            return super.add(str);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List, org.spongycastle.util.StringList
        public /* bridge */ /* synthetic */ String get(int i2) {
            return (String) super.get(i2);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public String set(int i2, String str) {
            return (String) super.set(i2, str);
        }

        @Override // org.spongycastle.util.StringList
        public String[] toStringArray() {
            int size = size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 != size; i2++) {
                strArr[i2] = (String) get(i2);
            }
            return strArr;
        }

        @Override // org.spongycastle.util.StringList
        public String[] toStringArray(int i2, int i3) {
            String[] strArr = new String[i3 - i2];
            for (int i4 = i2; i4 != size() && i4 != i3; i4++) {
                strArr[i4 - i2] = (String) get(i4);
            }
            return strArr;
        }
    }

    static {
        try {
            try {
                LINE_SEPARATOR = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.spongycastle.util.Strings.1
                    @Override // java.security.PrivilegedAction
                    public String run() {
                        return System.getProperty("line.separator");
                    }
                });
            } catch (Exception unused) {
                LINE_SEPARATOR = "\n";
            }
        } catch (Exception unused2) {
            LINE_SEPARATOR = String.format("%n", new Object[0]);
        }
    }

    public static char[] asCharArray(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 != length; i2++) {
            byte b2 = bArr[i2];
            cArr[i2] = (char) ((b2 + 255) - (b2 | 255));
        }
        return cArr;
    }

    public static String fromByteArray(byte[] bArr) {
        return new String(asCharArray(bArr));
    }

    public static String fromUTF8ByteArray(byte[] bArr) {
        char c2;
        int i2;
        byte b2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = i5 + 1;
            byte b3 = bArr[i4];
            if ((240 & b3) == 240) {
                i5 += 2;
                i4 += 4;
            } else {
                i4 = (224 & b3) == 224 ? i4 + 3 : (b3 & MessagePack.Code.NIL) == 192 ? i4 + 2 : i4 + 1;
                i5 = i6;
            }
        }
        char[] cArr = new char[i5];
        int i7 = 0;
        while (i3 < bArr.length) {
            byte b4 = bArr[i3];
            if ((b4 + 240) - (240 | b4) == 240) {
                int i8 = ((b4 + 3) - (b4 | 3)) << 18;
                int i9 = ((-1) - (((-1) - bArr[i3 + 1]) | ((-1) - 63))) << 12;
                int i10 = ((-1) - (((-1) - (((i8 + i9) - (i8 & i9)) | (((-1) - (((-1) - bArr[i3 + 2]) | ((-1) - 63))) << 6))) & ((-1) - ((-1) - (((-1) - bArr[i3 + 3]) | ((-1) - 63)))))) - 65536;
                int i11 = i10 >> 10;
                c2 = (char) ((-1) - (((-1) - (i10 & 1023)) & ((-1) - Utf8.LOG_SURROGATE_HEADER)));
                cArr[i7] = (char) ((i11 + 55296) - (i11 & 55296));
                i3 += 4;
                i7++;
            } else if ((-1) - (((-1) - b4) | ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY)) == 224) {
                c2 = (char) (((b4 & Ascii.SI) << 12) | (((-1) - (((-1) - bArr[i3 + 1]) | ((-1) - 63))) << 6) | ((-1) - (((-1) - bArr[i3 + 2]) | ((-1) - 63))));
                i3 += 3;
            } else {
                if ((b4 & MessagePack.Code.INT8) == 208) {
                    i2 = ((b4 + Ascii.US) - (b4 | Ascii.US)) << 6;
                    b2 = bArr[i3 + 1];
                } else if ((b4 + MessagePack.Code.NIL) - (192 | b4) == 192) {
                    i2 = ((-1) - (((-1) - b4) | ((-1) - 31))) << 6;
                    b2 = bArr[i3 + 1];
                } else {
                    c2 = (char) ((-1) - (((-1) - b4) | ((-1) - 255)));
                    i3++;
                }
                int i12 = (b2 + Utf8.REPLACEMENT_BYTE) - (b2 | Utf8.REPLACEMENT_BYTE);
                c2 = (char) ((i2 + i12) - (i2 & i12));
                i3 += 2;
            }
            cArr[i7] = c2;
            i7++;
        }
        return new String(cArr);
    }

    public static String lineSeparator() {
        return LINE_SEPARATOR;
    }

    public static StringList newList() {
        return new StringListImpl();
    }

    public static String[] split(String str, char c2) {
        int i2;
        Vector vector = new Vector();
        boolean z2 = true;
        while (true) {
            if (!z2) {
                break;
            }
            int iIndexOf = str.indexOf(c2);
            if (iIndexOf > 0) {
                vector.addElement(str.substring(0, iIndexOf));
                str = str.substring(iIndexOf + 1);
            } else {
                vector.addElement(str);
                z2 = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i2 = 0; i2 != size; i2++) {
            strArr[i2] = (String) vector.elementAt(i2);
        }
        return strArr;
    }

    public static int toByteArray(String str, byte[] bArr, int i2) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i2 + i3] = (byte) str.charAt(i3);
        }
        return length;
    }

    public static byte[] toByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            bArr[i2] = (byte) str.charAt(i2);
        }
        return bArr;
    }

    public static byte[] toByteArray(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            bArr[i2] = (byte) cArr[i2];
        }
        return bArr;
    }

    public static String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z2 = false;
        for (int i2 = 0; i2 != charArray.length; i2++) {
            char c2 = charArray[i2];
            if ('A' <= c2 && 'Z' >= c2) {
                charArray[i2] = (char) (c2 + TokenParser.SP);
                z2 = true;
            }
        }
        return z2 ? new String(charArray) : str;
    }

    public static void toUTF8ByteArray(char[] cArr, OutputStream outputStream) throws IOException {
        int i2 = 0;
        while (i2 < cArr.length) {
            char c2 = cArr[i2];
            if (c2 < 128) {
                outputStream.write(c2);
            } else if (c2 < 2048) {
                outputStream.write((-1) - (((-1) - (c2 >> 6)) & ((-1) - 192)));
                int i3 = c2 & '?';
                outputStream.write((i3 + 128) - (i3 & 128));
            } else if (c2 < 55296 || c2 > 57343) {
                outputStream.write((-1) - (((-1) - (c2 >> '\f')) & ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY)));
                outputStream.write(((c2 >> 6) & 63) | 128);
                int i4 = (c2 + '?') - (c2 | '?');
                outputStream.write((i4 + 128) - (i4 & 128));
            } else {
                i2++;
                if (i2 >= cArr.length) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                char c3 = cArr[i2];
                if (c2 > 56319) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                int i5 = ((c2 + 1023) - (c2 | 1023)) << 10;
                int i6 = (c3 + 1023) - (c3 | 1023);
                int i7 = ((i5 + i6) - (i5 & i6)) + 65536;
                outputStream.write((-1) - (((-1) - (i7 >> 18)) & ((-1) - 240)));
                outputStream.write((-1) - (((-1) - ((i7 >> 12) & 63)) & ((-1) - 128)));
                int i8 = i7 >> 6;
                outputStream.write((-1) - (((-1) - ((i8 + 63) - (i8 | 63))) & ((-1) - 128)));
                outputStream.write((-1) - (((-1) - (i7 & 63)) & ((-1) - 128)));
            }
            i2++;
        }
    }

    public static byte[] toUTF8ByteArray(String str) {
        return toUTF8ByteArray(str.toCharArray());
    }

    public static byte[] toUTF8ByteArray(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z2 = false;
        for (int i2 = 0; i2 != charArray.length; i2++) {
            char c2 = charArray[i2];
            if ('a' <= c2 && 'z' >= c2) {
                charArray[i2] = (char) (c2 - ' ');
                z2 = true;
            }
        }
        return z2 ? new String(charArray) : str;
    }
}
