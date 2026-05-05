package com.facetec.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ib implements Serializable, Comparable<ib> {
    final byte[] B;
    transient int V;
    private transient String Z;
    private static char[] I = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ib Code = V(new byte[0]);

    ib(byte[] bArr) {
        this.B = bArr;
    }

    public static ib B(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(str)));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 1;
            bArr[i2] = (byte) ((I(str.charAt(i3)) << 4) + I(str.charAt(i3 + 1)));
        }
        return V(bArr);
    }

    private ib Code(String str) {
        try {
            return V(MessageDigest.getInstance(str).digest(this.B));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    private static int I(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c2)));
        }
        return c2 - '7';
    }

    public static ib V(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        ib ibVar = new ib(str.getBytes(is.V));
        ibVar.Z = str;
        return ibVar;
    }

    public static ib V(byte... bArr) {
        if (bArr != null) {
            return new ib((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int i2 = objectInputStream.readInt();
        if (objectInputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(i2)));
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = objectInputStream.read(bArr, i3, i2 - i3);
            if (i4 == -1) {
                throw new EOFException();
            }
            i3 += i4;
        }
        ib ibVar = new ib(bArr);
        try {
            Field declaredField = ib.class.getDeclaredField("B");
            declaredField.setAccessible(true);
            declaredField.set(this, ibVar.B);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.B.length);
        objectOutputStream.write(this.B);
    }

    public byte B(int i2) {
        return this.B[i2];
    }

    public ib B() {
        return Code("SHA-1");
    }

    public String Code() {
        return ic.Z(this.B);
    }

    void Code(ie ieVar) {
        byte[] bArr = this.B;
        ieVar.Z(bArr, 0, bArr.length);
    }

    public byte[] D() {
        return (byte[]) this.B.clone();
    }

    public String I() {
        byte[] bArr = this.B;
        char[] cArr = new char[bArr.length << 1];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = I;
            int i4 = b2 >> 4;
            cArr[i2] = cArr2[(i4 + 15) - (i4 | 15)];
            i2 += 2;
            cArr[i3] = cArr2[(-1) - (((-1) - b2) | ((-1) - 15))];
        }
        return new String(cArr);
    }

    public boolean I(int i2, ib ibVar, int i3, int i4) {
        return ibVar.Z(0, this.B, 0, i4);
    }

    public ib L() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.B;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b3 = bArr2[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i3] = (byte) (b3 + 32);
                    }
                }
                return new ib(bArr2);
            }
            i2++;
        }
    }

    public int S() {
        return this.B.length;
    }

    public ib V() {
        return Code("SHA-256");
    }

    public ib Z(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.B;
        if (i3 > bArr.length) {
            throw new IllegalArgumentException(new StringBuilder("endIndex > length(").append(this.B.length).append(")").toString());
        }
        int i4 = i3 - i2;
        if (i4 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i2 == 0 && i3 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i2, bArr2, 0, i4);
        return new ib(bArr2);
    }

    public String Z() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.B, is.V);
        this.Z = str2;
        return str2;
    }

    public boolean Z(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0) {
            return false;
        }
        byte[] bArr2 = this.B;
        return i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && is.Z(bArr2, i2, bArr, i3, i4);
    }

    public final boolean Z(ib ibVar) {
        return I(0, ibVar, 0, ibVar.S());
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(ib ibVar) {
        ib ibVar2 = ibVar;
        int iS = S();
        int iS2 = ibVar2.S();
        int iMin = Math.min(iS, iS2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iB = B(i2) & 255;
            int iB2 = (-1) - (((-1) - ibVar2.B(i2)) | ((-1) - 255));
            if (iB != iB2) {
                return iB < iB2 ? -1 : 1;
            }
        }
        if (iS == iS2) {
            return 0;
        }
        return iS < iS2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ib) {
            ib ibVar = (ib) obj;
            int iS = ibVar.S();
            byte[] bArr = this.B;
            if (iS == bArr.length && ibVar.Z(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.V;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.B);
        this.V = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0057, code lost:
    
        r6 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ib.toString():java.lang.String");
    }
}
