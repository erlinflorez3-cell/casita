package yg;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class VN {
    public static Jl Xd() {
        Object obj;
        String strUd = C1626yg.Ud(";j+@\u0015", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864691055))), (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864695264))));
        String strWd = Ig.wd("e/", (short) (Od.Xd() ^ (56564649 ^ (-56583247))));
        try {
            Class<?> cls = Class.forName(strUd);
            Field field = 0 != 0 ? cls.getField(strWd) : cls.getDeclaredField(strWd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        return (Jl) obj;
    }
}
