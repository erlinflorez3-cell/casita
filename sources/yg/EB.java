package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class EB implements OX {
    public static final int Kd = 255;
    public static final int Xd = 2;

    public static void Xd(int i2) {
        if (i2 > (1640702175 ^ 1640701984) || i2 < (OY.Xd() ^ 69929194)) {
            throw new IllegalArgumentException();
        }
    }

    @Override // yg.OX
    public byte[] EY(byte[] bArr) throws Throwable {
        Object[] objArr = {bArr};
        Method method = Class.forName(C1626yg.Ud("\u00184+aR", (short) (OY.Xd() ^ (1363338499 ^ 1363332928)), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831089253))))).getMethod(Ig.wd("\u0010c", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207827327)))), byte[].class);
        try {
            method.setAccessible(true);
            return Arrays.copyOf(bArr, ((Integer) method.invoke(this, objArr)).intValue());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // yg.OX
    public byte[] PY(byte[] bArr, int i2, int i3) throws Throwable {
        Class<?> cls = Class.forName(Jg.Wd("%1a\u0017v", (short) (C1607wl.Xd() ^ ((28520310 ^ 666762411) ^ 638485283)), (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1412237680 ^ (-397833517))))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i3)};
        Method declaredMethod = cls.getDeclaredMethod(ZO.xd("Bh", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (1483691556 ^ (-742282619)))), (short) (FB.Xd() ^ (FB.Xd() ^ (362673217 ^ 1249024439)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
            int i4 = i3 - (i2 % i3);
            int i5 = i2 + i4;
            if (bArr.length != i5) {
                bArr = Arrays.copyOf(bArr, i5);
            }
            Arrays.fill(bArr, i2, bArr.length, (byte) i4);
            return bArr;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // yg.OX
    public int ZY(byte[] bArr) {
        byte b2 = bArr[bArr.length - 1];
        int i2 = b2 & 255;
        for (int i3 = 1; i3 < i2; i3++) {
            if (bArr[(bArr.length - 1) - i3] != b2) {
                throw new IllegalArgumentException();
            }
        }
        return bArr.length - i2;
    }
}
