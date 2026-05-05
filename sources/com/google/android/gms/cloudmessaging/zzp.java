package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
final class zzp implements ServiceConnection {
    int zza = 0;
    final Messenger zzb;
    zzq zzc;
    final Queue zzd;
    final SparseArray zze;
    final /* synthetic */ zzv zzf;

    /* synthetic */ zzp(zzv zzvVar, zzo zzoVar) throws Throwable {
        this.zzf = zzvVar;
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(EO.Od("N-1gG\u00170\u000b\u0014u4.\u001d%wH3", (short) (C1499aX.Xd() ^ (-1006)))).getDeclaredMethod(C1561oA.Qd("sp~ViptQsrrfr", (short) (FB.Xd() ^ 10456)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf((Looper) declaredMethod.invoke(null, objArr), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    int i2 = message.arg1;
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String str = "Received response to request: " + i2;
                    }
                    zzp zzpVar = this.zza;
                    synchronized (zzpVar) {
                        zzs zzsVar = (zzs) zzpVar.zze.get(i2);
                        if (zzsVar == null) {
                            String str2 = "Received response for unknown request: " + i2;
                            return true;
                        }
                        zzpVar.zze.remove(i2);
                        zzpVar.zzf();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            zzsVar.zzc(new zzt(4, "Not supported by GmsCore", null));
                            return true;
                        }
                        zzsVar.zza(data);
                        return true;
                    }
                }
            }));
            this.zzd = new ArrayDeque();
            this.zze = new SparseArray();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
        }
        this.zzf.zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzp zzpVar = this.zza;
                IBinder iBinder2 = iBinder;
                synchronized (zzpVar) {
                    if (iBinder2 == null) {
                        zzpVar.zza(0, "Null service connection");
                        return;
                    }
                    try {
                        zzpVar.zzc = new zzq(iBinder2);
                        zzpVar.zza = 2;
                        zzpVar.zzc();
                    } catch (RemoteException e2) {
                        zzpVar.zza(0, e2.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
        }
        this.zzf.zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(2, "Service disconnected");
            }
        });
    }

    final synchronized void zza(int i2, String str) {
        zzb(i2, str, null);
    }

    final synchronized void zzb(int i2, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            "Disconnected: ".concat(String.valueOf(str));
        }
        int i3 = this.zza;
        if (i3 == 0) {
            throw new IllegalStateException();
        }
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return;
            }
            this.zza = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
        }
        this.zza = 4;
        ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
        zzt zztVar = new zzt(i2, str, th);
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzs) it.next()).zzc(zztVar);
        }
        this.zzd.clear();
        for (int i4 = 0; i4 < this.zze.size(); i4++) {
            ((zzs) this.zze.valueAt(i4)).zzc(zztVar);
        }
        this.zze.clear();
    }

    final void zzc() {
        this.zzf.zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                final zzs zzsVar;
                while (true) {
                    final zzp zzpVar = this.zza;
                    synchronized (zzpVar) {
                        if (zzpVar.zza != 2) {
                            return;
                        }
                        if (zzpVar.zzd.isEmpty()) {
                            zzpVar.zzf();
                            return;
                        } else {
                            zzsVar = (zzs) zzpVar.zzd.poll();
                            zzpVar.zze.put(zzsVar.zza, zzsVar);
                            zzpVar.zzf.zzc.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzn
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzpVar.zze(zzsVar.zza);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable(C1561oA.ud("Xo|{ltliuKqcBjfain", (short) (C1499aX.Xd() ^ (-5151))), 3)) {
                        String strValueOf = String.valueOf(String.valueOf(zzsVar));
                        String strYd = C1561oA.yd("\r *!\u001f%\u001fX", (short) (C1633zX.Xd() ^ (-5601)));
                        C1561oA.Yd("Yr\u0002\u0003u\u007fyx\u0007^\u0007z[\u0006\u0004\u0001\u000b\u0012", (short) (OY.Xd() ^ 26));
                        strYd.concat(strValueOf);
                    }
                    zzv zzvVar = zzpVar.zzf;
                    Messenger messenger = zzpVar.zzb;
                    int i2 = zzsVar.zzc;
                    Context context = zzvVar.zzb;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i2;
                    messageObtain.arg1 = zzsVar.zza;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(Xg.qd("SSK>Ib", (short) (C1499aX.Xd() ^ (-5670)), (short) (C1499aX.Xd() ^ (-27019))), zzsVar.zzb());
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Jg.Wd("uu\u00031ISeP ]r\u001a&?\\6f\u0003\u0019@Ko\u0002", (short) (C1633zX.Xd() ^ (-31586)), (short) (C1633zX.Xd() ^ (-30347)))).getMethod(ZO.xd("GW\u0003Y<'n\u0013k8Q{\u007f%", (short) (C1633zX.Xd() ^ (-3774)), (short) (C1633zX.Xd() ^ (-18749))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        String str = (String) method.invoke(context, objArr);
                        short sXd = (short) (Od.Xd() ^ (-21201));
                        short sXd2 = (short) (Od.Xd() ^ (-8785));
                        int[] iArr = new int["\u00150I".length()];
                        QB qb = new QB("\u00150I");
                        int i3 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
                            i3++;
                        }
                        bundle.putString(new String(iArr, 0, i3), str);
                        bundle.putBundle(Ig.wd("w.-x", (short) (FB.Xd() ^ 17161)), zzsVar.zzd);
                        messageObtain.setData(bundle);
                        try {
                            zzpVar.zzc.zza(messageObtain);
                        } catch (RemoteException e2) {
                            zzpVar.zza(2, e2.getMessage());
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            }
        });
    }

    final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    final synchronized void zze(int i2) {
        zzs zzsVar = (zzs) this.zze.get(i2);
        if (zzsVar != null) {
            String str = "Timing out request: " + i2;
            this.zze.remove(i2);
            zzsVar.zzc(new zzt(3, "Timed out waiting for response", null));
            zzf();
        }
    }

    final synchronized void zzf() {
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
            }
            this.zza = 3;
            ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
        }
    }

    final synchronized boolean zzg(zzs zzsVar) {
        int i2 = this.zza;
        if (i2 != 0) {
            if (i2 == 1) {
                this.zzd.add(zzsVar);
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            this.zzd.add(zzsVar);
            zzc();
            return true;
        }
        this.zzd.add(zzsVar);
        Preconditions.checkState(this.zza == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
        }
        this.zza = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService(this.zzf.zzb, intent, this, 1)) {
                this.zzf.zzc.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzd();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                zza(0, "Unable to bind to service");
            }
        } catch (SecurityException e2) {
            zzb(0, "Unable to bind to service", e2);
        }
        return true;
    }
}
