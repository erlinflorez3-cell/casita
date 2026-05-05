package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1499aX;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Od;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public abstract class GmsClientSupervisor {
    static HandlerThread zza = null;
    private static final Object zzb = new Object();
    private static int zzc = 9;
    private static zzs zzd = null;
    private static Executor zze = null;
    private static boolean zzf = false;

    public static int getDefaultBindFlags() {
        return 4225;
    }

    public static GmsClientSupervisor getInstance(Context context) {
        Looper looper;
        synchronized (zzb) {
            if (zzd == null) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(ZO.xd("C(._6y2tu'J\u001a\u001dAhf\u0012A#~%\u0010\u001c", (short) (C1499aX.Xd() ^ (-6126)), (short) (C1499aX.Xd() ^ (-31321)))).getMethod(C1626yg.Ud("y\u0004Wi.\u0006\u0016\u0015\tcQ\u0004\r@\u0013l\u0018*u\ty", (short) (C1607wl.Xd() ^ 20326), (short) (C1607wl.Xd() ^ 14984)), new Class[0]);
                try {
                    method.setAccessible(true);
                    Context context2 = (Context) method.invoke(context, objArr);
                    if (zzf) {
                        looper = getOrStartHandlerThread().getLooper();
                    } else {
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(Ig.wd("tGO\u0001\u0017L\u0017`?\u000b\b0Vi;\u001a\u0003%kE\u007fn\u0005", (short) (C1633zX.Xd() ^ (-753)))).getMethod(EO.Od("\u0001(ef\u0003g@~p\u0005\u007f\u0017n", (short) (Od.Xd() ^ (-2907))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            looper = (Looper) method2.invoke(context, objArr2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    zzd = new zzs(context2, looper, zze);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }
        return zzd;
    }

    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", zzc);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    public static HandlerThread getOrStartHandlerThread(int i2) {
        synchronized (zzb) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", i2);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    public static void setDefaultBindExecutor(Executor executor) {
        synchronized (zzb) {
            zzs zzsVar = zzd;
            if (zzsVar != null) {
                zzsVar.zzi(executor);
            }
            zze = executor;
        }
    }

    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int i2) {
        synchronized (zzb) {
            if (zza != null) {
                return false;
            }
            zzc = i2;
            return true;
        }
    }

    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzb) {
            zzs zzsVar = zzd;
            if (zzsVar != null && !zzf) {
                zzsVar.zzj(getOrStartHandlerThread().getLooper());
            }
            zzf = true;
        }
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return zza(new zzo(componentName, 4225), serviceConnection, str, null).isSuccess();
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return zza(new zzo(componentName, 4225), serviceConnection, str, executor).isSuccess();
    }

    public boolean bindService(String str, ServiceConnection serviceConnection, String str2) {
        return zza(new zzo(str, 4225, false), serviceConnection, str2, null).isSuccess();
    }

    public void unbindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        zzb(new zzo(componentName, 4225), serviceConnection, str);
    }

    public void unbindService(String str, ServiceConnection serviceConnection, String str2) {
        zzb(new zzo(str, 4225, false), serviceConnection, str2);
    }

    protected abstract ConnectionResult zza(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor);

    protected abstract void zzb(zzo zzoVar, ServiceConnection serviceConnection, String str);

    public final void zzc(String str, String str2, int i2, ServiceConnection serviceConnection, String str3, boolean z2) {
        zzb(new zzo(str, str2, 4225, z2), serviceConnection, str3);
    }
}
