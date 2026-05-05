package com.rnmaps.maps;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1633zX;
import yg.EO;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class ImageUtil {
    public static Bitmap convert(String str) throws Throwable {
        String strSubstring = str.substring(str.indexOf(EO.Od("u", (short) (C1633zX.Xd() ^ (-16892)))) + 1);
        Class<?> cls = Class.forName(C1561oA.Qd("=I>KG@:\u0003IG;=}\u0011/@1\u0001}", (short) (Od.Xd() ^ (-12926))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (OY.Xd() ^ 20624);
        short sXd2 = (short) (OY.Xd() ^ 30935);
        int[] iArr = new int["6.D0}=3A;\u0003)KJBHB".length()];
        QB qb = new QB("6.D0}=3A;\u0003)KJBHB");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {strSubstring, 0};
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.od(";;8C77", (short) (Od.Xd() ^ (-12940))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String convert(Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Class<?> cls = Class.forName(C1561oA.Kd("\u0013!\u0018'% \u001cf//%)k\u0001!4'xw", (short) (C1633zX.Xd() ^ (-8443))));
        Class<?>[] clsArr = {byte[].class, Integer.TYPE};
        Object[] objArr = {byteArray, 0};
        short sXd = (short) (ZN.Xd() ^ 25501);
        short sXd2 = (short) (ZN.Xd() ^ 10470);
        int[] iArr = new int["<[>\u0002%{4e\u0017\u0010<h[j".length()];
        QB qb = new QB("<[>\u0002%{4e\u0017\u0010<h[j");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
