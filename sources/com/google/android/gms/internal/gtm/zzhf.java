package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import yg.C1561oA;
import yg.C1580rY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
final class zzhf extends Thread implements zzhd {
    private static zzhf zza = null;
    private final LinkedBlockingQueue zzb;
    private volatile boolean zzc;
    private volatile boolean zzd;
    private volatile zzhg zze;
    private final Context zzf;
    private final Clock zzg;

    private zzhf(Context context) throws Throwable {
        super(C1561oA.Xd("1,@U`TQU", (short) (ZN.Xd() ^ 9929)));
        this.zzb = new LinkedBlockingQueue();
        this.zzc = false;
        this.zzd = false;
        this.zzg = DefaultClock.getInstance();
        if (context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("\u001e,#20+'q(55<.8?yo\u001d\u001d$\u0016*'", (short) (Od.Xd() ^ (-21094)))).getMethod(Qg.kd("KHV\"POJF?<NBGE\u0019DBG7ID", (short) (C1580rY.Xd() ^ (-25876)), (short) (C1580rY.Xd() ^ (-16228))), new Class[0]);
            try {
                method.setAccessible(true);
                this.zzf = (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            this.zzf = null;
        }
        start();
    }

    static zzhf zzd(Context context) {
        if (zza == null) {
            zza = new zzhf(context);
        }
        return zza;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    Runnable runnable = (Runnable) this.zzb.take();
                    if (!this.zzc) {
                        runnable.run();
                    }
                } catch (InterruptedException e2) {
                    zzho.zzc(e2.toString());
                }
            } catch (Exception e3) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                e3.printStackTrace(printStream);
                printStream.flush();
                zzho.zza("Error on Google TagManager Thread: ".concat(new String(byteArrayOutputStream.toByteArray())));
                zzho.zza("Google TagManager is shutting down.");
                this.zzc = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzhd
    public final void zza(Runnable runnable) {
        this.zzb.add(runnable);
    }

    @Override // com.google.android.gms.internal.gtm.zzhd
    public final void zzb(String str, String str2, String str3, Map map, String str4) {
        this.zzb.add(new zzhe(this, this, this.zzg.currentTimeMillis(), str, str2, str3, map, str4));
    }
}
