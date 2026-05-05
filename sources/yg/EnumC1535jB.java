package yg;

import java.lang.reflect.Field;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: yg.jB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1535jB {
    private static final /* synthetic */ EnumC1535jB[] Kd;
    public static final EnumC1535jB Yd = null;
    public static final EnumC1535jB ud = null;
    private int Xd;

    static {
        EnumC1535jB enumC1535jB = new EnumC1535jB(Wg.Zd("g\u000eO\b?bc\u0013Zx@mk\u001ec\r\u0014JKw2d6YD\t4", (short) (C1607wl.Xd() ^ (901986106 ^ 901999535)), (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (-1951491424)))), 0, OY.Xd() ^ 69929244);
        String strXd = C1561oA.Xd("(\u0017^\u001ct", (short) (OY.Xd() ^ ((609692047 ^ 1203181352) ^ 1675643773)));
        String strVd = Wg.vd("sa", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (680812939 ^ (-421345800)))));
        try {
            Class<?> cls = Class.forName(strXd);
            Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
            field.setAccessible(true);
            field.set(null, enumC1535jB);
        } catch (Throwable th) {
        }
        EnumC1535jB enumC1535jB2 = new EnumC1535jB(Qg.kd("$21?\"*,* ,8\u001b#\u0017('2\u0015#\u0013\u0002\u007f", (short) (C1580rY.Xd() ^ ((81265791 ^ 764007903) ^ (-693214205))), (short) (C1580rY.Xd() ^ (1253731444 ^ (-1253731540)))), 1, (593426827 ^ 1175382789) ^ 1699746683);
        String strVd2 = hg.Vd("q^$_6", (short) (C1607wl.Xd() ^ (203697629 ^ 203715921)), (short) (C1607wl.Xd() ^ (639056003 ^ 639052111)));
        String strUd = C1561oA.ud("\\f", (short) (FB.Xd() ^ (1479682893 ^ 1479693104)));
        try {
            Class<?> cls2 = Class.forName(strVd2);
            Field field2 = 0 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
            field2.setAccessible(true);
            field2.set(null, enumC1535jB2);
        } catch (Throwable th2) {
        }
        Kd = Yd();
    }

    private EnumC1535jB(String str, int i2, int i3) {
        String strYd = C1561oA.yd("L9~:\u0019", (short) (FB.Xd() ^ (75490065 ^ 75490001)));
        String strYd2 = C1561oA.Yd("6C", (short) (Od.Xd() ^ (ZN.Xd() ^ (-864691822))));
        Integer numValueOf = Integer.valueOf(i3);
        try {
            Class<?> cls = Class.forName(strYd);
            Field field = 0 != 0 ? cls.getField(strYd2) : cls.getDeclaredField(strYd2);
            field.setAccessible(true);
            field.set(this, numValueOf);
        } catch (Throwable th) {
        }
    }

    private static /* synthetic */ EnumC1535jB[] Yd() {
        Object obj;
        Object obj2;
        EnumC1535jB[] enumC1535jBArr = new EnumC1535jB[912112223 ^ 912112221];
        String strQd = C1561oA.Qd("M:\u007f;\u0012", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (1544315447 ^ (-65223797)))));
        String strZd = C1593ug.zd("\u0014\u0004", (short) (FB.Xd() ^ (111278701 ^ 111257562)), (short) (FB.Xd() ^ ((687987650 ^ 249381441) ^ 668788259)));
        try {
            Class<?> cls = Class.forName(strQd);
            Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        enumC1535jBArr[0] = (EnumC1535jB) obj;
        String strOd = C1561oA.od("kX\u001eY0", (short) (C1499aX.Xd() ^ ((1624574089 ^ 1340896972) ^ (-792291446))));
        short sXd = (short) (C1580rY.Xd() ^ (405272574 ^ (-405246444)));
        int[] iArr = new int[";G".length()];
        QB qb = new QB(";G");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls2 = Class.forName(strOd);
            Field field2 = 0 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
            field2.setAccessible(true);
            obj2 = field2.get(null);
        } catch (Throwable th2) {
            obj2 = null;
        }
        enumC1535jBArr[1] = (EnumC1535jB) obj2;
        return enumC1535jBArr;
    }

    @Override // java.lang.Enum
    public String toString() {
        Object obj;
        short sXd = (short) (Od.Xd() ^ ((1810949576 ^ 82608086) ^ (-1864150149)));
        short sXd2 = (short) (Od.Xd() ^ (289615800 ^ (-289623750)));
        int[] iArr = new int["xg/lE".length()];
        QB qb = new QB("xg/lE");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        int iXd = Od.Xd() ^ (1768855687 ^ (-781396027));
        short sXd3 = (short) (C1499aX.Xd() ^ ((1326793501 ^ 680527447) ^ (-1736774568)));
        short sXd4 = (short) (C1499aX.Xd() ^ iXd);
        int[] iArr2 = new int[";O".length()];
        QB qb2 = new QB(";O");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        return String.valueOf(((Integer) obj).intValue());
    }
}
