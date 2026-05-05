package yg;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: yg.qN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1572qN {
    public static Jl Xd() {
        Object obj;
        String strOd = EO.Od("B\u0002V\u000fb", (short) (FB.Xd() ^ (FB.Xd() ^ (808599303 ^ 1876758651))));
        String strQd = C1561oA.Qd("AK", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951488327)));
        try {
            Class<?> cls = Class.forName(strOd);
            Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        return (Jl) obj;
    }
}
