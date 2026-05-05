package yg;

import android.util.Pair;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Tl {
    private static final Set<Pair<Long, String>> ud = new LinkedHashSet(0);
    private static final Map<String, String> Yd = new HashMap(0);
    private static final Object Kd = new Object();
    private static Zd Xd = null;

    private Tl() {
    }

    public static String Kd(String str) {
        String str2;
        synchronized (Kd) {
            str2 = Yd.get(str);
        }
        return str2;
    }

    static Pair<Long, String> Xd() {
        synchronized (Kd) {
            if (ud.isEmpty()) {
                return null;
            }
            return ud.iterator().next();
        }
    }

    public static void Yd(long j2, String str) {
        synchronized (Kd) {
            ud.add(new Pair<>(Long.valueOf(j2), str));
            if (Xd == null || !Xd.isAlive()) {
                Xd = new Zd();
                Xd.setPriority(1);
                Xd.start();
            }
        }
    }

    static void od(String str, String str2) {
        synchronized (Kd) {
            Yd.put(str, str2);
        }
    }

    static void ud(Pair<Long, String> pair) {
        synchronized (Kd) {
            ud.remove(pair);
        }
    }
}
