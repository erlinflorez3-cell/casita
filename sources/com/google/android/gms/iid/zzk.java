package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zzk implements ServiceConnection {
    private final Intent zzbp;
    private final ScheduledExecutorService zzbq;
    private final Queue<zzg> zzbr;
    private zzi zzbs;
    private boolean zzbt;
    private final Context zzl;

    public zzk(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("EnhancedIntentService")));
    }

    private zzk(Context context, String str, ScheduledExecutorService scheduledExecutorService) throws Throwable {
        this.zzbr = new ArrayDeque();
        this.zzbt = false;
        Class<?> cls = Class.forName(C1561oA.yd(":H?ND?;\u00064AAH2<C},YY`J^[", (short) (FB.Xd() ^ 31007)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-32337));
        int[] iArr = new int["TSc1ab_]XWkahh>kkrdxu".length()];
        QB qb = new QB("TSc1ab_]XWkahh>kkrdxu");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            this.zzl = context2;
            Intent intent = new Intent(str);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Xg.qd("q\u007fv\u0006\u0004~zE{\t\t\u0010\u0002\f\u0013Mc\u0011\u0011\u0018\n\u001e\u001b", (short) (Od.Xd() ^ (-27497)), (short) (Od.Xd() ^ (-24760)))).getMethod(Jg.Wd("<uOok@tE\u001ex$rk&", (short) (C1580rY.Xd() ^ (-12696)), (short) (C1580rY.Xd() ^ (-10443))), new Class[0]);
            try {
                method2.setAccessible(true);
                this.zzbp = intent.setPackage((String) method2.invoke(context2, objArr2));
                this.zzbq = scheduledExecutorService;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final synchronized void zzm() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
        }
        while (!this.zzbr.isEmpty()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
            }
            zzi zziVar = this.zzbs;
            if (zziVar == null || !zziVar.isBinderAlive()) {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    new StringBuilder(39).append("binder is dead. start connection? ").append(!this.zzbt).toString();
                }
                if (!this.zzbt) {
                    this.zzbt = true;
                    if (ConnectionTracker.getInstance().bindService(this.zzl, this.zzbp, this, 65)) {
                        return;
                    }
                    this.zzbt = false;
                    zzn();
                }
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
            }
            this.zzbs.zzd(this.zzbr.poll());
        }
    }

    private final void zzn() {
        while (!this.zzbr.isEmpty()) {
            this.zzbr.poll().finish();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.zzbt = false;
            this.zzbs = (zzi) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String strValueOf = String.valueOf(componentName);
                new StringBuilder(String.valueOf(strValueOf).length() + 20).append("onServiceConnected: ").append(strValueOf).toString();
            }
            if (iBinder == null) {
                zzn();
            } else {
                zzm();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String strValueOf = String.valueOf(componentName);
            new StringBuilder(String.valueOf(strValueOf).length() + 23).append("onServiceDisconnected: ").append(strValueOf).toString();
        }
        zzm();
    }

    public final synchronized void zzd(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
        }
        this.zzbr.add(new zzg(intent, pendingResult, this.zzbq));
        zzm();
    }
}
