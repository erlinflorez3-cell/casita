package yg;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: yg.ju */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1543ju extends Enum {
    private static final /* synthetic */ EnumC1543ju[] Kd;
    public static final EnumC1543ju Yd = null;
    public static final EnumC1543ju ud = null;
    private int Xd;

    static {
        EnumC1543ju enumC1543ju = new EnumC1543ju(C1626yg.Ud("_|>crC", (short) (C1580rY.Xd() ^ (1353785180 ^ (-1353780783))), (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831068745))), 0, (1365715929 ^ 161108803) ^ 1493006590);
        short sXd = (short) (C1633zX.Xd() ^ ((1034555025 ^ 1583678060) ^ (-1674536679)));
        int[] iArr = new int["Eg\u001eAa".length()];
        QB qb = new QB("Eg\u001eAa");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strOd = EO.Od("a\u001c", (short) (C1580rY.Xd() ^ (946641373 ^ (-946638646))));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            field.set(null, enumC1543ju);
        } catch (Throwable th) {
        }
        EnumC1543ju enumC1543ju2 = new EnumC1543ju(C1561oA.Qd("5(-.7.A%%+2\u001e", (short) (Od.Xd() ^ (1110779141 ^ (-1110782757)))), 1, 2036138263 ^ 2036138354);
        short sXd2 = (short) (C1607wl.Xd() ^ ((1239471957 ^ 631640425) ^ 1816562611));
        short sXd3 = (short) (C1607wl.Xd() ^ ((182217778 ^ 554470417) ^ 735104200));
        int[] iArr2 = new int["=,s1=".length()];
        QB qb2 = new QB("=,s1=");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        String strOd2 = C1561oA.od(";)", (short) (ZN.Xd() ^ ((992938027 ^ 1005454805) ^ 12666685)));
        try {
            Class<?> cls2 = Class.forName(str2);
            Field field2 = 0 != 0 ? cls2.getField(strOd2) : cls2.getDeclaredField(strOd2);
            field2.setAccessible(true);
            field2.set(null, enumC1543ju2);
        } catch (Throwable th2) {
        }
        Kd = Yd();
    }

    private EnumC1543ju(String str, int i2, int i3) {
        super(str, i2);
        String strKd = C1561oA.Kd("o^&co", (short) (ZN.Xd() ^ (2051607598 ^ 2051624542)));
        String strZd = Wg.Zd("E\b", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134262586)), (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864689339))));
        Integer numValueOf = Integer.valueOf(i3);
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            field.set(this, numValueOf);
        } catch (Throwable th) {
        }
    }

    private static /* synthetic */ EnumC1543ju[] Yd() {
        Object obj;
        Object obj2;
        EnumC1543ju[] enumC1543juArr = new EnumC1543ju[C1607wl.Xd() ^ (2006801173 ^ 433670349)];
        String strYd = C1561oA.Yd("'\u0016]\u001b'", (short) (C1499aX.Xd() ^ (1828207825 ^ (-1828193684))));
        String strQd = Xg.qd("\u000e\u001a", (short) (OY.Xd() ^ (Od.Xd() ^ (2432674 ^ 1205393237))), (short) (OY.Xd() ^ ((1723857088 ^ 733110143) ^ 1292741345)));
        try {
            Class<?> cls = Class.forName(strYd);
            Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        enumC1543juArr[0] = (EnumC1543ju) obj;
        String strWd = Jg.Wd("Jj\u000b\u001bv", (short) (Od.Xd() ^ ((146143199 ^ 1704448721) ^ (-1830948842))), (short) (Od.Xd() ^ (87015086 ^ (-87000362))));
        String strXd = ZO.xd("f|", (short) (ZN.Xd() ^ (1003078567 ^ 1003077920)), (short) (ZN.Xd() ^ ((793974405 ^ 1276196006) ^ 1665278505)));
        try {
            Class<?> cls2 = Class.forName(strWd);
            Field field2 = 0 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
            field2.setAccessible(true);
            obj2 = field2.get(null);
        } catch (Throwable th2) {
            obj2 = null;
        }
        enumC1543juArr[1] = (EnumC1543ju) obj2;
        return enumC1543juArr;
    }

    @Override // java.lang.Enum
    public String toString() {
        Object obj;
        String strKd = Qg.kd("\nv<w\u0002", (short) (OY.Xd() ^ (C1607wl.Xd() ^ (1579933241 ^ 812628046))), (short) (OY.Xd() ^ ((983296731 ^ 388236783) ^ 767552614)));
        String strVd = hg.Vd("_j", (short) (Od.Xd() ^ ((1334004289 ^ 982715413) ^ (-1963989223))), (short) (Od.Xd() ^ ((1778524835 ^ 2071355284) ^ (-292817442))));
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        return Integer.toString(((Integer) obj).intValue());
    }
}
