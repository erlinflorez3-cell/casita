package com.journeyapps.barcodescanner.camera;

import android.os.Handler;
import android.os.HandlerThread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
class CameraThread {
    private static final String TAG = "CameraThread";
    private static CameraThread instance = null;
    private Handler handler;
    private HandlerThread thread;
    private int openCount = 0;
    private final Object LOCK = new Object();

    private CameraThread() {
    }

    private void checkRunning() {
        synchronized (this.LOCK) {
            if (this.handler == null) {
                if (this.openCount <= 0) {
                    throw new IllegalStateException("CameraThread is not open");
                }
                HandlerThread handlerThread = new HandlerThread(TAG);
                this.thread = handlerThread;
                handlerThread.start();
                this.handler = new Handler(this.thread.getLooper());
            }
        }
    }

    public static CameraThread getInstance() {
        if (instance == null) {
            instance = new CameraThread();
        }
        return instance;
    }

    private void quit() {
        synchronized (this.LOCK) {
            this.thread.quit();
            this.thread = null;
            this.handler = null;
        }
    }

    protected void decrementInstances() {
        synchronized (this.LOCK) {
            int i2 = this.openCount - 1;
            this.openCount = i2;
            if (i2 == 0) {
                quit();
            }
        }
    }

    protected void enqueue(Runnable runnable) {
        synchronized (this.LOCK) {
            checkRunning();
            Handler handler = this.handler;
            Class<?> cls = Class.forName(C1561oA.Qd("_k`mib\\%eh\";S_T[S_", (short) (C1580rY.Xd() ^ (-2415))));
            Class<?>[] clsArr = {Class.forName(C1593ug.zd(")!7#p0&4.u\u001b?9:.0;5", (short) (C1580rY.Xd() ^ (-3657)), (short) (C1580rY.Xd() ^ (-796))))};
            Object[] objArr = {runnable};
            short sXd = (short) (C1499aX.Xd() ^ (-15609));
            int[] iArr = new int["(&))".length()];
            QB qb = new QB("(&))");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    protected void enqueueDelayed(Runnable runnable, long j2) {
        synchronized (this.LOCK) {
            checkRunning();
            Handler handler = this.handler;
            Class<?> cls = Class.forName(C1561oA.Kd("\"0'64/+u8=x\u0014.<3<6D", (short) (Od.Xd() ^ (-24349))));
            Class<?>[] clsArr = {Class.forName(Wg.Zd("]r\u001e\u001f\u0002^i\r\u001c\u0001;t\u0004\"+Bby", (short) (Od.Xd() ^ (-27169)), (short) (Od.Xd() ^ (-22571)))), Long.TYPE};
            Object[] objArr = {runnable, Long.valueOf(j2)};
            short sXd = (short) (C1499aX.Xd() ^ (-169));
            int[] iArr = new int["||\u0002\u0004Tv~t\u000ezz".length()];
            QB qb = new QB("||\u0002\u0004Tv~t\u000ezz");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    protected void incrementAndEnqueue(Runnable runnable) {
        synchronized (this.LOCK) {
            this.openCount++;
            enqueue(runnable);
        }
    }
}
