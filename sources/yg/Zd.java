package yg;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
final class Zd extends Thread {
    private static final int Kd = 27;
    private static final int Xd = 4;
    private static final int Yd = 0;

    Zd() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        for (Pair<Long, String> pairXd = Tl.Xd(); pairXd != null; pairXd = Tl.Xd()) {
            String strXd = Qg.Xd((String) pairXd.second);
            if (strXd != null) {
                Tl.od((String) pairXd.second, strXd);
                C1522gN c1522gN = new C1522gN();
                c1522gN.YY(((Long) pairXd.first).longValue(), strXd);
                Qg.Kd(c1522gN);
            }
            Tl.ud(pairXd);
        }
    }
}
