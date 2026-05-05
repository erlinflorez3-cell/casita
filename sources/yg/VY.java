package yg;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class VY extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            SystemClock.sleep(1L);
            new C1604wF(this).start();
        }
    }
}
