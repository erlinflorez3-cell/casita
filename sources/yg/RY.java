package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class RY {
    private static final SecureRandom Yd;
    private final AtomicBoolean Kd = new AtomicBoolean(false);
    private Thread Xd;

    static {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(hg.Vd(".$8\"m2# 1-#-1d\t\u001a\u0017($\u0016\u0002\u0010\u001c\u0011\u001b\u0018", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831088138))), (short) (C1607wl.Xd() ^ ((1380920702 ^ 343315413) ^ 1178177630)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            Yd = (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Xd(int i2) {
        return (int) (((Yd.nextInt((1328509933 ^ 66155662) ^ 1289619275) + 80) * i2) / Float.intBitsToFloat(C1499aX.Xd() ^ (-22243092)));
    }

    protected abstract void FK();

    public synchronized void QK() {
        this.Kd.set(true);
        this.Xd = null;
    }

    public synchronized void yK(int i2, int i3) {
        if (this.Xd != null) {
            return;
        }
        this.Kd.set(false);
        this.Xd = new Thread(new pX(this, i2, i3));
        this.Xd.start();
    }
}
