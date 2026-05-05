package yg;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: yg.hN */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1527hN extends Enum {
    private static final /* synthetic */ EnumC1527hN[] Kd;
    public static final EnumC1527hN Yd = null;
    public static final EnumC1527hN ud = null;
    private int Xd;

    static {
        EnumC1527hN enumC1527hN = new EnumC1527hN(Xg.qd("z\b\u007f{y", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (76356079 ^ (-889477619)))), (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (1310383083 ^ (-226593422))))), 0, 0);
        String strWd = Jg.Wd("u`Lc^", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951477432))), (short) (FB.Xd() ^ (C1580rY.Xd() ^ (1334132745 ^ (-2114725396)))));
        String strXd = ZO.xd("p\u0014", (short) (C1499aX.Xd() ^ ((280280116 ^ 1917235578) ^ (-1660055741))), (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (2081767211 ^ 1066287508))));
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            field.set(null, enumC1527hN);
        } catch (Throwable th) {
        }
        EnumC1527hN enumC1527hN2 = new EnumC1527hN(C1626yg.Ud("nRB\u0016\u0011\u001aH<z8\u000bao", (short) (OY.Xd() ^ (1419151462 ^ 1419153054)), (short) (OY.Xd() ^ ((1323886657 ^ 1716110973) ^ 681667449))), 1, 1);
        String strWd2 = Ig.wd("+ew)T", (short) (FB.Xd() ^ (1141257832 ^ 1141267318)));
        String strOd = EO.Od("Yy", (short) (C1633zX.Xd() ^ ((1011496735 ^ 504465533) ^ (-576436626))));
        try {
            Class<?> cls2 = Class.forName(strWd2);
            Field field2 = 0 != 0 ? cls2.getField(strOd) : cls2.getDeclaredField(strOd);
            field2.setAccessible(true);
            field2.set(null, enumC1527hN2);
        } catch (Throwable th2) {
        }
        Kd = Yd();
    }

    private EnumC1527hN(String str, int i2, int i3) {
        super(str, i2);
        String strQd = C1561oA.Qd("\bt:sX", (short) (FB.Xd() ^ (2104934023 ^ 2104922619)));
        String strZd = C1593ug.zd("\u001b(", (short) (C1607wl.Xd() ^ ((2061368855 ^ 198782104) ^ 1896126435)), (short) (C1607wl.Xd() ^ ((93815604 ^ 1760130007) ^ 1837036937)));
        Integer numValueOf = Integer.valueOf(i3);
        try {
            Class<?> cls = Class.forName(strQd);
            Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            field.set(this, numValueOf);
        } catch (Throwable th) {
        }
    }

    private static /* synthetic */ EnumC1527hN[] Yd() {
        Object obj;
        Object obj2;
        EnumC1527hN[] enumC1527hNArr = new EnumC1527hN[C1499aX.Xd() ^ (-1134257938)];
        String strVd = hg.Vd("M:\u007f9\u001e", (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (1875630444 ^ (-463136957)))), (short) (C1607wl.Xd() ^ ((1778806165 ^ 761308625) ^ 1197913118)));
        String strUd = C1561oA.ud("!+", (short) (Od.Xd() ^ (1615566042 ^ (-1615573483))));
        try {
            Class<?> cls = Class.forName(strVd);
            Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        enumC1527hNArr[0] = (EnumC1527hN) obj;
        String strYd = C1561oA.yd("L9~8%", (short) (C1633zX.Xd() ^ ((1464848877 ^ 339061915) ^ (-1132084930))));
        String strYd2 = C1561oA.Yd("D4", (short) (OY.Xd() ^ ((2141432854 ^ 918391544) ^ 1226721354)));
        try {
            Class<?> cls2 = Class.forName(strYd);
            Field field2 = 0 != 0 ? cls2.getField(strYd2) : cls2.getDeclaredField(strYd2);
            field2.setAccessible(true);
            obj2 = field2.get(null);
        } catch (Throwable th2) {
            obj2 = null;
        }
        enumC1527hNArr[1] = (EnumC1527hN) obj2;
        return enumC1527hNArr;
    }

    @Override // java.lang.Enum
    public String toString() {
        Object obj;
        String strOd = C1561oA.od("0\u001db\u001c\u0001", (short) (OY.Xd() ^ (1989630012 ^ 1989618995)));
        short sXd = (short) (OY.Xd() ^ ((766947906 ^ 1693242056) ^ 1230661645));
        int[] iArr = new int["8E".length()];
        QB qb = new QB("8E");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strOd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        return Integer.toString(((Integer) obj).intValue());
    }
}
