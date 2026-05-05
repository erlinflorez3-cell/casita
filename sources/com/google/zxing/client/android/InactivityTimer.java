package com.google.zxing.client.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public final class InactivityTimer {
    private static final long INACTIVITY_DELAY_MS = 300000;
    private static final String TAG = "InactivityTimer";
    private Runnable callback;
    private final Context context;
    private boolean onBattery;
    private boolean registered = false;
    private final BroadcastReceiver powerStatusReceiver = new PowerStatusReceiver();
    private Handler handler = new Handler();

    /* JADX INFO: Access modifiers changed from: private */
    final class PowerStatusReceiver extends BroadcastReceiver {
        private PowerStatusReceiver() {
        }

        /* JADX INFO: renamed from: lambda$onReceive$0$com-google-zxing-client-android-InactivityTimer$PowerStatusReceiver, reason: not valid java name */
        /* synthetic */ void m7798x4df57f73(boolean z2) throws Throwable {
            InactivityTimer.this.onBattery(z2);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            short sXd = (short) (C1499aX.Xd() ^ (-17202));
            int[] iArr = new int["L3taEa~~^fl=vp\u0014(\u0005\u0012M)l\u0003voW!nJ- 5[z#z(T".length()];
            QB qb = new QB("L3taEa~~^fl=vp\u0014(\u0005\u0012M)l\u0003voW!nJ- 5[z#z(T");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            if (new String(iArr, 0, i2).equals(intent.getAction())) {
                final boolean z2 = intent.getIntExtra(EO.Od("\u0016bo\b\n\\-", (short) (OY.Xd() ^ 13895)), -1) <= 0;
                Handler handler = InactivityTimer.this.handler;
                Runnable runnable = new Runnable() { // from class: com.google.zxing.client.android.InactivityTimer$PowerStatusReceiver$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f$0.m7798x4df57f73(z2);
                    }
                };
                Class<?> cls = Class.forName(C1561oA.Qd("R^S`\\UO\u0018X[\u0015.FRGNFR", (short) (OY.Xd() ^ 156)));
                Class<?>[] clsArr = new Class[1];
                short sXd2 = (short) (C1633zX.Xd() ^ (-10392));
                short sXd3 = (short) (C1633zX.Xd() ^ (-24266));
                int[] iArr2 = new int["\u001c\u0014*\u0016c#\u0019'!h\u000e2,-!#.(".length()];
                QB qb2 = new QB("\u001c\u0014*\u0016c#\u0019'!h\u000e2,-!#.(");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr = {runnable};
                Method method = cls.getMethod(C1561oA.od(" \u001e!!", (short) (FB.Xd() ^ 23308)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    public InactivityTimer(Context context, Runnable runnable) {
        this.context = context;
        this.callback = runnable;
    }

    private void cancelCallback() {
        this.handler.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBattery(boolean z2) throws Throwable {
        this.onBattery = z2;
        if (this.registered) {
            activity();
        }
    }

    private void registerReceiver() throws Throwable {
        if (this.registered) {
            return;
        }
        Context context = this.context;
        Object[] objArr = {this.powerStatusReceiver, new IntentFilter(C1561oA.Kd("gul{ytp;w}\u0005v\u0001\bBvy\f\u0002\t\tI^^rses{\u0003gmguonn", (short) (C1580rY.Xd() ^ (-22243))))};
        Method method = Class.forName(Wg.Zd("\t=\u001b~c36%2$z\u0007_>k|\u0018,\u0001n5oa", (short) (C1580rY.Xd() ^ (-10223)), (short) (C1580rY.Xd() ^ (-18878)))).getMethod(Qg.kd("ughirrbnM_\\]`lZf", (short) (C1607wl.Xd() ^ 29659), (short) (C1607wl.Xd() ^ 1862)), Class.forName(C1561oA.Xd("DRIXVQM\u0018N[[bT^e 5fdW[[ZmoNbadiwgu", (short) (ZN.Xd() ^ 19850))), Class.forName(Wg.vd("/=0?A<4~9FBI?IL\u0007\u0007-0\"07\u0006*2;)7", (short) (Od.Xd() ^ (-18888)))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
            this.registered = true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void unregisterReceiver() throws Throwable {
        if (this.registered) {
            Context context = this.context;
            BroadcastReceiver broadcastReceiver = this.powerStatusReceiver;
            Class<?> cls = Class.forName(hg.Vd("1=2?;4.v+649)16n\u0003.,1!3.", (short) (C1499aX.Xd() ^ (-13799)), (short) (C1499aX.Xd() ^ (-22664))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1580rY.Xd() ^ (-22009));
            int[] iArr = new int["v\u0003w\u0005\u0001ys<p{y~nv{4Gvrcec`qqN`]^am[g".length()];
            QB qb = new QB("v\u0003w\u0005\u0001ys<p{y~nv{4Gvrcec`qqN`]^am[g");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {broadcastReceiver};
            short sXd2 = (short) (Od.Xd() ^ (-9977));
            int[] iArr2 = new int["c]^RY\\ce[iFZ]`aoCQ".length()];
            QB qb2 = new QB("c]^RY\\ce[iFZ]`aoCQ");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
                this.registered = false;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public void activity() throws Throwable {
        cancelCallback();
        if (this.onBattery) {
            Handler handler = this.handler;
            Runnable runnable = this.callback;
            Class<?> cls = Class.forName(C1561oA.Yd("\u0007\u0015\f\u001b\u0019\u0014\u0010Z\u001d\"]x\u0013!\u0018!\u001b)", (short) (OY.Xd() ^ 20027)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1499aX.Xd() ^ (-12086));
            short sXd2 = (short) (C1499aX.Xd() ^ (-5384));
            int[] iArr = new int["( 6\"o/%3-t\u001a>89-/:4".length()];
            QB qb = new QB("( 6\"o/%3-t\u001a>89-/:4");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Long.TYPE;
            Object[] objArr = {runnable, 300000L};
            Method method = cls.getMethod(Jg.Wd("_}A}L!gW/\\Z", (short) (OY.Xd() ^ 31074), (short) (OY.Xd() ^ 32231)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public void cancel() throws Throwable {
        cancelCallback();
        unregisterReceiver();
    }

    public void start() throws Throwable {
        registerReceiver();
        activity();
    }
}
