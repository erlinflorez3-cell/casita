package com.facetec.sdk;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
final class m {
    m() {
    }

    static byte[] B(Context context, String str) throws Exception {
        short sXd = (short) (Od.Xd() ^ (-16007));
        short sXd2 = (short) (Od.Xd() ^ (-21689));
        int[] iArr = new int["\nZ\u0006\u00056\u0011A{E\u0013\u0007=#MH.`u\u0001o\u001e\u001aB".length()];
        QB qb = new QB("\nZ\u0006\u00056\u0011A{E\u0013\u0007=#MH.`u\u0001o\u001e\u001aB");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {str};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd("\u0018\u0018\f\u0014r\u0015\u0017\u000fi\u000e\u000f\u0013\u0019", (short) (OY.Xd() ^ 300)), Class.forName(C1561oA.Xd("\"\u001a0\u001ci)\u001f-'n\u001576.4.", (short) (C1499aX.Xd() ^ (-25764)))));
        try {
            method.setAccessible(true);
            FileInputStream fileInputStream = (FileInputStream) method.invoke(context, objArr);
            try {
                return B(fileInputStream);
            } finally {
                fileInputStream.close();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static byte[] B(FileInputStream fileInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[(int) fileInputStream.getChannel().size()];
        while (fileInputStream.available() > 0) {
            byteArrayOutputStream.write(bArr, 0, fileInputStream.read(bArr));
        }
        return byteArrayOutputStream.toByteArray();
    }

    static void I(Context context, String str, byte[] bArr) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 1471);
        short sXd2 = (short) (C1607wl.Xd() ^ 19869);
        int[] iArr = new int["T`Ub^WQ\u001aNYW\\LTY\u0012&QOTDVQ".length()];
        QB qb = new QB("T`Ub^WQ\u001aNYW\\LTY\u0012&QOTDVQ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = {str, 0};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.ud("==19\u001024,\u0015:8375", (short) (ZN.Xd() ^ 11127)), Class.forName(yg.hg.Vd("9/C-x6*6.s\u001885+/'", (short) (ZN.Xd() ^ 2891), (short) (ZN.Xd() ^ 30860))), Integer.TYPE);
        try {
            method.setAccessible(true);
            FileOutputStream fileOutputStream = (FileOutputStream) method.invoke(context, objArr);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void I(File file, byte[] bArr, byte[] bArr2) throws Exception {
        byte[] bArrZ = new bh(bArr).Z(bArr2);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            try {
                fileOutputStream.write(bArrZ);
            } catch (IOException e2) {
                throw e2;
            }
        } finally {
            fileOutputStream.close();
        }
    }

    private static byte[] I(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return B(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }

    static byte[] I(File file, byte[] bArr) throws Exception {
        return new bh(bArr).Code(I(file));
    }

    static byte[] V(Context context, String str, byte[] bArr) throws Exception {
        return new bh(bArr).Code(B(context, str));
    }
}
