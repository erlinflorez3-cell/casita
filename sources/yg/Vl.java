package yg;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
class Vl {
    public final long Kd;
    public final long Xd;
    public final String Yd;

    public Vl(String str, long j2, long j3) {
        String strWd = Jg.Wd("{$)\u0012f", (short) (OY.Xd() ^ (1699148072 ^ 1699141347)), (short) (OY.Xd() ^ (C1499aX.Xd() ^ (1415351334 ^ (-398982439)))));
        String strXd = ZO.xd("\u001d~", (short) (C1607wl.Xd() ^ (2084017385 ^ 2084018484)), (short) (C1607wl.Xd() ^ (1555365065 ^ 1555337704)));
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 1 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            field.set(this, str);
        } catch (Throwable th) {
        }
        String strUd = C1626yg.Ud("Y\u000f\u000e\u0012k", (short) (C1499aX.Xd() ^ (978470412 ^ (-978480236))), (short) (C1499aX.Xd() ^ (1109098340 ^ (-1109087367))));
        String strWd2 = Ig.wd("A\u001d", (short) (C1580rY.Xd() ^ ((641226855 ^ 267457209) ^ (-701047342))));
        Long lValueOf = Long.valueOf(j2);
        try {
            Class<?> cls2 = Class.forName(strUd);
            Field field2 = 1 != 0 ? cls2.getField(strWd2) : cls2.getDeclaredField(strWd2);
            field2.setAccessible(true);
            field2.set(this, lValueOf);
        } catch (Throwable th2) {
        }
        String strOd = EO.Od("?]R\u001b`", (short) (ZN.Xd() ^ ((1930195574 ^ 875689910) ^ 1195241152)));
        String strQd = C1561oA.Qd("#;", (short) (C1607wl.Xd() ^ (1455792141 ^ 1455805430)));
        Long lValueOf2 = Long.valueOf(j3);
        try {
            Class<?> cls3 = Class.forName(strOd);
            Field field3 = 1 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
            field3.setAccessible(true);
            field3.set(this, lValueOf2);
        } catch (Throwable th3) {
        }
    }
}
