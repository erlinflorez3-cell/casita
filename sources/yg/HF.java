package yg;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HF {
    protected static final Object Xd = null;

    static {
        Object obj = new Object();
        String strYd = C1561oA.Yd("@/v\u0012\u0011", (short) (OY.Xd() ^ ((1814499528 ^ 227402848) ^ 1638591358)));
        String strQd = Xg.qd("?L", (short) (C1499aX.Xd() ^ (150217774 ^ (-150240182))), (short) (C1499aX.Xd() ^ (124364017 ^ (-124385402))));
        try {
            Class<?> cls = Class.forName(strYd);
            Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
            field.setAccessible(true);
            field.set(null, obj);
        } catch (Throwable th) {
        }
    }
}
