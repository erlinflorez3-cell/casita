package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: yg.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1501ao {
    private static final byte[] Xd;

    static {
        int iXd = C1580rY.Xd() ^ (2048678338 ^ 1268070027);
        Xd = Qg.kd("YYYYYYYYYY\u0001\u0001\u0001\u0001\u0001\u0001", (short) (C1580rY.Xd() ^ (1377366937 ^ (-1377362929))), (short) (C1580rY.Xd() ^ iXd)).getBytes(StandardCharsets.UTF_8);
    }

    private static int Xd(char c2) {
        return ((OY.Xd() ^ (2084077149 ^ 2014541445)) > c2 || c2 > ((143428541 ^ 185090233) ^ 59034429)) ? ((ZN.Xd() ^ (944083456 ^ 198159537)) > c2 || c2 > ((1275721964 ^ 392814346) ^ 1533028256)) ? ((OY.Xd() ^ (185102868 ^ 253983389)) > c2 || c2 > (FB.Xd() ^ (182856751 ^ 1426670458))) ? FB.Xd() ^ (2057938596 ^ (-625396120)) : (c2 - 'a') + 10 : (c2 - 'A') + 10 : c2 - '0';
    }

    public static byte[] Yd(String str) throws Throwable {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i2 = 0; i2 < length; i2 += 2) {
            char cCharAt = str.charAt(i2);
            Class<?> cls = Class.forName(C1561oA.yd("\u000f{As\t", (short) (C1607wl.Xd() ^ ((240897248 ^ 1399916188) ^ 1563094285))));
            Class<?>[] clsArr = {Character.TYPE};
            Object[] objArr = {Character.valueOf(cCharAt)};
            short sXd = (short) (C1499aX.Xd() ^ ((1879518076 ^ 6035126) ^ (-1885012073)));
            int[] iArr = new int["\u0010\u001d".length()];
            QB qb = new QB("\u0010\u001d");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, objArr)).intValue();
                char cCharAt2 = str.charAt(i2 + 1);
                Class<?> cls2 = Class.forName(Xg.qd("\u0001o7kz", (short) (Od.Xd() ^ (451629883 ^ (-451631143))), (short) (Od.Xd() ^ (978799576 ^ (-978801915)))));
                Class<?>[] clsArr2 = {Character.TYPE};
                Object[] objArr2 = {Character.valueOf(cCharAt2)};
                short sXd2 = (short) (OY.Xd() ^ (893113815 ^ 893122382));
                short sXd3 = (short) (OY.Xd() ^ ((633402868 ^ 1813999325) ^ 1239386438));
                int[] iArr2 = new int["\u001f=".length()];
                QB qb2 = new QB("\u001f=");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd3) ^ sXd2));
                    i4++;
                }
                Method declaredMethod2 = cls2.getDeclaredMethod(new String(iArr2, 0, i4), clsArr2);
                try {
                    declaredMethod2.setAccessible(true);
                    bArr[i2 / 2] = (byte) ((iIntValue * 16) + ((Integer) declaredMethod2.invoke(null, objArr2)).intValue());
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return bArr;
    }

    public static byte[] ud(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
            bArr2[i2 * 2] = Xd[i3 >>> 4];
            bArr2[(i2 * 2) + 1] = Xd[(i3 + 15) - (i3 | 15)];
        }
        return bArr2;
    }
}
