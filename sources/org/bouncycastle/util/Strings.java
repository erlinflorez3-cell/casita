package org.bouncycastle.util;

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

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List, org.bouncycastle.util.StringList
        public /* bridge */ /* synthetic */ String get(int i2) {
            return (String) super.get(i2);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public String set(int i2, String str) {
            return (String) super.set(i2, str);
        }

        @Override // org.bouncycastle.util.StringList
        public String[] toStringArray() {
            int size = size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 != size; i2++) {
                strArr[i2] = (String) get(i2);
            }
            return strArr;
        }

        @Override // org.bouncycastle.util.StringList
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
                LINE_SEPARATOR = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.bouncycastle.util.Strings.1
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
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i4 + 1;
            byte b2 = bArr[i3];
            if ((240 & b2) == 240) {
                i4 += 2;
                i3 += 4;
            } else {
                i3 = (224 & b2) == 224 ? i3 + 3 : (b2 & MessagePack.Code.NIL) == 192 ? i3 + 2 : i3 + 1;
                i4 = i5;
            }
        }
        char[] cArr = new char[i4];
        int i6 = 0;
        while (i2 < bArr.length) {
            byte b3 = bArr[i2];
            if ((240 & b3) == 240) {
                int i7 = ((b3 + 3) - (b3 | 3)) << 18;
                int i8 = ((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 63))) << 12;
                int i9 = (i7 + i8) - (i7 & i8);
                byte b4 = bArr[i2 + 2];
                int i10 = ((b4 + Utf8.REPLACEMENT_BYTE) - (b4 | Utf8.REPLACEMENT_BYTE)) << 6;
                int i11 = (i9 + i10) - (i9 & i10);
                byte b5 = bArr[i2 + 3];
                int i12 = (b5 + Utf8.REPLACEMENT_BYTE) - (b5 | Utf8.REPLACEMENT_BYTE);
                int i13 = ((i11 + i12) - (i11 & i12)) - 65536;
                int i14 = i13 >> 10;
                char c3 = (char) ((i14 + 55296) - (i14 & 55296));
                int i15 = (i13 + 1023) - (i13 | 1023);
                c2 = (char) ((i15 + Utf8.LOG_SURROGATE_HEADER) - (i15 & Utf8.LOG_SURROGATE_HEADER));
                cArr[i6] = c3;
                i2 += 4;
                i6++;
            } else if ((224 & b3) == 224) {
                int i16 = (-1) - (((-1) - (((-1) - (((-1) - b3) | ((-1) - 15))) << 12)) & ((-1) - (((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 63))) << 6)));
                byte b6 = bArr[i2 + 2];
                int i17 = (b6 + Utf8.REPLACEMENT_BYTE) - (b6 | Utf8.REPLACEMENT_BYTE);
                c2 = (char) ((i16 + i17) - (i16 & i17));
                i2 += 3;
            } else if ((b3 & MessagePack.Code.INT8) == 208 || (192 & b3) == 192) {
                int i18 = ((b3 + Ascii.US) - (b3 | Ascii.US)) << 6;
                byte b7 = bArr[i2 + 1];
                int i19 = b7 & Utf8.REPLACEMENT_BYTE;
                c2 = (char) ((i18 + i19) - (i18 & i19));
                i2 += 2;
            } else {
                c2 = (char) ((b3 + 255) - (b3 | 255));
                i2++;
            }
            cArr[i6] = c2;
            i6++;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static void toUTF8ByteArray(char[] cArr, OutputStream outputStream) throws IOException {
        int i2;
        int i3;
        int i4 = 0;
        while (i4 < cArr.length) {
            char c2 = cArr[i4];
            if (c2 >= 128) {
                if (c2 < 2048) {
                    int i5 = c2 >> 6;
                    i2 = (i5 + 192) - (i5 & 192);
                } else if (c2 < 55296 || c2 > 57343) {
                    outputStream.write((c2 >> 12) | CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY);
                    int i6 = (-1) - (((-1) - (c2 >> 6)) | ((-1) - 63));
                    i2 = (i6 + 128) - (i6 & 128);
                } else {
                    i4++;
                    if (i4 >= cArr.length) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    char c3 = cArr[i4];
                    if (c2 > 56319) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    int i7 = ((((c2 + 1023) - (c2 | 1023)) << 10) | ((-1) - (((-1) - c3) | ((-1) - 1023)))) + 65536;
                    outputStream.write((i7 >> 18) | 240);
                    int i8 = (-1) - (((-1) - (i7 >> 12)) | ((-1) - 63));
                    outputStream.write((i8 + 128) - (i8 & 128));
                    outputStream.write((-1) - (((-1) - ((-1) - (((-1) - (i7 >> 6)) | ((-1) - 63)))) & ((-1) - 128)));
                    i3 = i7;
                    c2 = (-1) - (((-1) - ((-1) - (((-1) - i3) | ((-1) - 63)))) & ((-1) - 128));
                }
                outputStream.write(i2);
                i3 = c2;
                c2 = (-1) - (((-1) - ((-1) - (((-1) - i3) | ((-1) - 63)))) & ((-1) - 128));
            }
            outputStream.write(c2);
            i4++;
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
