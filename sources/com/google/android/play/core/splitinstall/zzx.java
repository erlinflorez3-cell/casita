package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public final class zzx extends com.google.android.play.core.splitinstall.internal.zzs {
    private static zzx zzc = null;
    private final Handler zzd;
    private final zzg zze;
    private final Set zzf;

    public zzx(Context context, zzg zzgVar) throws Throwable {
        super(new com.google.android.play.core.splitinstall.internal.zzu(Ig.wd("\u0015\u0003Z2jy=p\u001e\n|X\t2.\bST\"h\u0005jHD+\n$V", (short) (C1633zX.Xd() ^ (-10515)))), new IntentFilter(EO.Od("X7\u0007'0eq9\n\u0016\\.\u000bz\u0011+zgx\u0003:z!QB\u0003'?:\u0011*Ej\u0017M\u00108]vko\u001a-\u0002:(0oL:%\u0017X\\\u0018\u0018fm\u001d\u001c5#OF\ne!\\7\u0017z5D\u001e2?u%IZ|1", (short) (C1633zX.Xd() ^ (-24570)))), context);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Qd("T`Ub^WQ\u001aZ]\u00174VUUIU", (short) (Od.Xd() ^ (-9361)))).getDeclaredMethod(C1593ug.zd("KJZ4IRX7[\\^Tb", (short) (OY.Xd() ^ 22628), (short) (OY.Xd() ^ 31653)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.zzd = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.zzf = new LinkedHashSet();
            this.zze = zzgVar;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static synchronized zzx zzg(Context context) {
        if (zzc == null) {
            zzc = new zzx(context, zzo.INSTANCE);
        }
        return zzc;
    }

    static /* bridge */ /* synthetic */ void zzh(zzx zzxVar, SplitInstallSessionState splitInstallSessionState, int i2, int i3) throws Throwable {
        Handler handler = zzxVar.zzd;
        Object[] objArr = {new zzw(zzxVar, splitInstallSessionState, i2, i3)};
        Method method = Class.forName(C1561oA.od("JVKXTMG\u0010PS\r&>J?F>J", (short) (ZN.Xd() ^ OlympusMakernoteDirectory.TAG_INTERNAL_FLASH_AE1_0))).getMethod(Wg.Zd("bYWP", (short) (C1580rY.Xd() ^ (-6042)), (short) (C1580rY.Xd() ^ (-30039))), Class.forName(C1561oA.Kd("~v\rxF\u0006{\n\u0004Kp\u0015\u000f\u0010\u0004\u0006\u0011\u000b", (short) (OY.Xd() ^ 28118))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzs
    protected final void zza(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        SplitInstallSessionState splitInstallSessionStateZzd = SplitInstallSessionState.zzd(bundleExtra);
        this.zza.zza("ListenerRegistryBroadcastReceiver.onReceive: %s", splitInstallSessionStateZzd);
        zzh zzhVarZza = this.zze.zza();
        if (splitInstallSessionStateZzd.status() != 3 || zzhVarZza == null) {
            zzk(splitInstallSessionStateZzd);
        } else {
            zzhVarZza.zzd(splitInstallSessionStateZzd.zzc(), new zzv(this, splitInstallSessionStateZzd, intent, context));
        }
    }

    final synchronized void zzi(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzf.add(splitInstallStateUpdatedListener);
    }

    final synchronized void zzj(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzf.remove(splitInstallStateUpdatedListener);
    }

    public final synchronized void zzk(SplitInstallSessionState splitInstallSessionState) {
        Iterator it = new LinkedHashSet(this.zzf).iterator();
        while (it.hasNext()) {
            ((SplitInstallStateUpdatedListener) it.next()).onStateUpdate(splitInstallSessionState);
        }
        super.zze(splitInstallSessionState);
    }
}
