package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: yg.pY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1566pY extends TimerTask {
    private static final int Kd = 60;
    private static final int Xd = 30;
    private static final SecureRandom Yd = null;

    static {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Ig.wd(";dg3\u001f7EK\u000f+$Q\bB\bCh|1\f:p\u0014*:t", (short) (C1607wl.Xd() ^ ((1064721827 ^ 1781845447) ^ 1430423559)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            String strOd = EO.Od("r;Oq\"", (short) (C1607wl.Xd() ^ (915506152 ^ 915532792)));
            String strQd = C1561oA.Qd(")3", (short) (OY.Xd() ^ (946274079 ^ 946263738)));
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
                field.setAccessible(true);
                field.set(null, secureRandom);
            } catch (Throwable th) {
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    C1566pY() {
    }

    private static long Xd() {
        Object obj;
        String strZd = C1593ug.zd("\u0006t<\u007fi", (short) (Od.Xd() ^ (OY.Xd() ^ (794709041 ^ (-729118159)))), (short) (Od.Xd() ^ ((1742160137 ^ 2141746972) ^ (-411000868))));
        String strOd = C1561oA.od("\u0007\u0011", (short) (ZN.Xd() ^ (499581178 ^ 499596053)));
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        return ((long) (((SecureRandom) obj).nextInt((1357062752 ^ 502649643) ^ 1293349239) + 30)) * (294438730330789857L ^ 294438730330788873L);
    }

    public static void Yd() {
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        Yd();
        new Timer().schedule(new C1566pY(), Xd());
    }
}
