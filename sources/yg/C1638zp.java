package yg;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: yg.zp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1638zp {
    public static Jl Xd() {
        Object obj;
        String strUd = C1561oA.ud("\u0019\u0006Kf\b", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (29158754 ^ (-1878583543)))));
        String strYd = C1561oA.yd("Q;", (short) (ZN.Xd() ^ (OY.Xd() ^ (353026629 ^ 287414226))));
        try {
            Class<?> cls = Class.forName(strUd);
            Field field = 0 != 0 ? cls.getField(strYd) : cls.getDeclaredField(strYd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        return (Jl) obj;
    }
}
