package com.facetec.sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.facetec.sdk.ad;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
final class ca implements SensorEventListener {
    private Timer Code;
    private boolean F;
    private Sensor I;
    private int L;
    private boolean S;
    private Timer V;
    private final SensorManager Z;
    private WeakReference<Z> B = new WeakReference<>(null);
    private WeakReference<ad> D = new WeakReference<>(null);

    interface Z {
        void Code();
    }

    ca(Context context) throws Throwable {
        String strOd = C1561oA.od("\u0012\u0003\u000b\u000f\n\f", (short) (C1607wl.Xd() ^ 21300));
        short sXd = (short) (C1580rY.Xd() ^ (-19044));
        int[] iArr = new int["Xf]ljea,boovhry4Jww~p\u0005\u0002".length()];
        QB qb = new QB("Xf]ljea,boovhry4Jww~p\u0005\u0002");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(Wg.Zd("\u001bH\u0015>B8C\u000e@5\u0018R\u000f3w)", (short) (FB.Xd() ^ 20159), (short) (FB.Xd() ^ 31248)))};
        Object[] objArr = {strOd};
        short sXd2 = (short) (OY.Xd() ^ 21206);
        int[] iArr2 = new int["[ZjJqln`iPcqvjeh".length()];
        QB qb2 = new QB("[ZjJqln`iPcqvjeh");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            SensorManager sensorManager = (SensorManager) method.invoke(context, objArr);
            this.Z = sensorManager;
            this.I = sensorManager.getDefaultSensor(5);
            this.S = false;
            this.F = false;
            this.L = 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void B() {
        Timer timer = this.Code;
        if (timer != null) {
            timer.cancel();
            this.Code = null;
        }
    }

    private synchronized void Code() {
        if (this.Code == null) {
            Timer timer = new Timer();
            this.Code = timer;
            try {
                timer.schedule(new TimerTask() { // from class: com.facetec.sdk.ca.2
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        Z z2 = (Z) ca.this.B.get();
                        if (z2 != null) {
                            z2.Code();
                            ca.this.Z();
                        }
                    }
                }, 200L);
            } catch (IllegalStateException unused) {
            }
        }
    }

    static /* synthetic */ void V(ca caVar) {
        ad.I iV;
        caVar.L++;
        ad adVar = caVar.D.get();
        if (adVar != null) {
            boolean z2 = caVar.F;
            if ((z2 && (!z2 || caVar.L <= 1)) || (iV = adVar.V()) == null || iV.Z == null) {
                return;
            }
            byte[] bArr = iV.Z;
            int i2 = iV.V * iV.B;
            int i3 = i2 / 4;
            float f2 = 0.0f;
            int i4 = 0;
            for (int i5 = 1; i5 <= i2; i5 += 4) {
                i4 += (-1) - (((-1) - bArr[i5 - 1]) | ((-1) - 255));
                if (i5 % 8421504 == 0) {
                    f2 += i4 / i3;
                    i4 = 0;
                }
            }
            if (((int) (f2 + (i4 / i3))) < 75.0f) {
                caVar.Code();
            } else {
                caVar.B();
            }
        }
    }

    final synchronized void V(Z z2, ad adVar) {
        this.B = new WeakReference<>(z2);
        this.D = new WeakReference<>(adVar);
        if (this.I != null) {
            Handler handler = new Handler();
            Runnable runnable = new Runnable() { // from class: com.facetec.sdk.ca.5
                @Override // java.lang.Runnable
                public final void run() {
                    ca.this.Z.registerListener(this, ca.this.I, 0);
                }
            };
            Class<?> cls = Class.forName(Wg.vd("<J=LFA9\u0004BG~\u001a0>1:0>", (short) (OY.Xd() ^ 27017)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1580rY.Xd() ^ (-15144));
            short sXd2 = (short) (C1580rY.Xd() ^ (-21844));
            int[] iArr = new int["#\u0019-\u0017b \u0014 \u0018]\u0001#\u001b\u001a\f\f\u0015\r".length()];
            QB qb = new QB("#\u0019-\u0017b \u0014 \u0018]\u0001#\u001b\u001a\f\f\u0015\r");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Long.TYPE;
            Object[] objArr = {runnable, 50L};
            Method method = cls.getMethod(yg.hg.Vd("ywzzIioczec", (short) (C1580rY.Xd() ^ (-20946)), (short) (C1580rY.Xd() ^ (-625))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
                this.F = true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        TimerTask timerTask = new TimerTask() { // from class: com.facetec.sdk.ca.3
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                ca.V(ca.this);
            }
        };
        Timer timer = new Timer();
        this.V = timer;
        try {
            timer.scheduleAtFixedRate(timerTask, 500L, 1000L);
        } catch (IllegalStateException unused) {
        }
    }

    final void Z() {
        this.S = true;
        final Sensor sensor = this.I;
        if (sensor != null) {
            this.I = null;
            ax.Code(new Runnable() { // from class: com.facetec.sdk.ca.4
                @Override // java.lang.Runnable
                public final void run() {
                    ca.this.Z.unregisterListener(ca.this, sensor);
                }
            });
        }
        B();
        Timer timer = this.V;
        if (timer != null) {
            timer.cancel();
            this.V = null;
        }
        WeakReference<Z> weakReference = this.B;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.S) {
            return;
        }
        this.L = 0;
        if (sensorEvent.values[0] < 3.0f) {
            Code();
        } else {
            B();
        }
    }
}
