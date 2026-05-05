package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class VX {
    public final EnumC1557nF Kd;
    public final long Xd;
    public final byte[] Yd;

    public VX(long j2, long j3, byte[] bArr) throws Throwable {
        String strWd = Ig.wd("o\u0011\bR\u001b", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (584994429 ^ (-653594039)))));
        String strOd = EO.Od("kQ", (short) (Od.Xd() ^ ((1314912857 ^ 756062638) ^ (-1666147076))));
        Long lValueOf = Long.valueOf(j2);
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 1 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            field.set(this, lValueOf);
        } catch (Throwable th) {
        }
        Class<?> cls2 = Class.forName(C1561oA.Qd(";(m-\u0004", (short) (Od.Xd() ^ ((10379013 ^ 1379124925) ^ (-1387127937)))));
        Class<?>[] clsArr = {Long.TYPE};
        Object[] objArr = {Long.valueOf(j3)};
        Method declaredMethod = cls2.getDeclaredMethod(C1593ug.zd("ER", (short) (C1499aX.Xd() ^ (761069269 ^ (-761066961))), (short) (C1499aX.Xd() ^ (948150545 ^ (-948148802)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            EnumC1557nF enumC1557nF = (EnumC1557nF) declaredMethod.invoke(null, objArr);
            String strOd2 = C1561oA.od("xe+RS", (short) (Od.Xd() ^ ((1795322359 ^ 212776836) ^ (-1739384692))));
            short sXd = (short) (C1633zX.Xd() ^ (1752626868 ^ (-1752625924)));
            int[] iArr = new int["Zt".length()];
            QB qb = new QB("Zt");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls3 = Class.forName(strOd2);
                Field field2 = 1 != 0 ? cls3.getField(str) : cls3.getDeclaredField(str);
                field2.setAccessible(true);
                field2.set(this, enumC1557nF);
            } catch (Throwable th2) {
            }
            String strZd = Wg.Zd("g\u000eQrq", (short) (C1499aX.Xd() ^ ((475468410 ^ 1339048362) ^ (-1401384223))), (short) (C1499aX.Xd() ^ ((1972964727 ^ 1739813768) ^ (-304748824))));
            short sXd2 = (short) (FB.Xd() ^ (1332675081 ^ 1332693375));
            int[] iArr2 = new int["gs".length()];
            QB qb2 = new QB("gs");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                i3++;
            }
            String str2 = new String(iArr2, 0, i3);
            try {
                Class<?> cls4 = Class.forName(strZd);
                Field field3 = 1 != 0 ? cls4.getField(str2) : cls4.getDeclaredField(str2);
                field3.setAccessible(true);
                field3.set(this, bArr);
            } catch (Throwable th3) {
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public Pu iK() throws Throwable {
        Object obj;
        String strVd = Wg.vd(" \u000fV\u007f\u0003", (short) (Od.Xd() ^ (C1633zX.Xd() ^ (196951431 ^ 2146187094))));
        int iXd = C1607wl.Xd() ^ (-1849952693);
        short sXd = (short) (C1580rY.Xd() ^ (1055167474 ^ (-1055176044)));
        short sXd2 = (short) (C1580rY.Xd() ^ iXd);
        int[] iArr = new int["y\u0004".length()];
        QB qb = new QB("y\u0004");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strVd);
            Field field = 1 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        Object[] objArr = {(byte[]) obj};
        Constructor<?> constructor = Class.forName(hg.Vd("bO\u00156Z", (short) (C1633zX.Xd() ^ ((449921425 ^ 1728829868) ^ (-2111478785))), (short) (C1633zX.Xd() ^ (764918535 ^ (-764909067))))).getConstructor(byte[].class);
        try {
            constructor.setAccessible(true);
            return (Pu) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
