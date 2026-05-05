package yg;

import android.os.SystemClock;

/* JADX INFO: renamed from: yg.wF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1604wF extends Thread {
    final /* synthetic */ VY Xd;

    C1604wF(VY vy) {
        this.Xd = vy;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            SystemClock.sleep(ZN.Yd() ^ (4088580289489058490L ^ 631133767693666210L));
        }
    }
}
