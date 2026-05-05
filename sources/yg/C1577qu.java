package yg;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: yg.qu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1577qu {
    public static Jl Xd() {
        Object obj;
        String strOd = EO.Od("r\u001a\u0003;6", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (244737418 ^ (-180165644)))));
        String strQd = C1561oA.Qd("s\u0006", (short) (C1499aX.Xd() ^ ((571662707 ^ 424729551) ^ (-994190469))));
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
