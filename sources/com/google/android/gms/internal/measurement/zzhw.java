package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhw implements zzhb {
    private static final Map<String, zzhw> zza = new ArrayMap();
    private final SharedPreferences zzb;
    private final Runnable zzc;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzd;
    private final Object zze;
    private volatile Map<String, ?> zzf;
    private final List<zzgz> zzg;

    private zzhw(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.zzhv
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.zza.zza(sharedPreferences2, str);
            }
        };
        this.zzd = onSharedPreferenceChangeListener;
        this.zze = new Object();
        this.zzg = new ArrayList();
        this.zzb = sharedPreferences;
        this.zzc = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static SharedPreferences zza(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        short sXd = (short) (OY.Xd() ^ 22135);
        short sXd2 = (short) (OY.Xd() ^ 7710);
        int[] iArr = new int["\u0007n\u00173\u0012JR=j\u0014xf".length()];
        QB qb = new QB("\u0007n\u00173\u0012JR=j\u0014xf");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        try {
            if (!str.startsWith(new String(iArr, 0, i2))) {
                return zzcu.zza(context, str, 0, zzcq.zza);
            }
            if (zzgs.zza()) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Xd("\f\u001a\u0011 \u001e\u0019\u0015_\u0016##*\u001c&-g}++2$85", (short) (C1580rY.Xd() ^ (-22929)))).getMethod(Wg.vd("\u0015#\u0019\u0014*\u001a{\u001c0\"\u001f \u000e//3\u0007\u0004\u0018\b\nw\u001c\u0016\u001c\n\u0013\u0010p\u001c\u001e#v\t\b", (short) (C1580rY.Xd() ^ (-11217))), new Class[0]);
                try {
                    method.setAccessible(true);
                    context = (Context) method.invoke(context, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return zzcu.zza(context, str.substring(12), 0, zzcq.zza);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static zzhw zza(Context context, String str, Runnable runnable) {
        zzhw zzhwVar;
        if (!((!zzgs.zza() || str.startsWith("direct_boot:")) ? true : zzgs.zzb(context))) {
            return null;
        }
        synchronized (zzhw.class) {
            Map<String, zzhw> map = zza;
            zzhwVar = map.get(str);
            if (zzhwVar == null) {
                zzhwVar = new zzhw(zza(context, str), runnable);
                map.put(str, zzhwVar);
            }
        }
        return zzhwVar;
    }

    static synchronized void zza() {
        for (zzhw zzhwVar : zza.values()) {
            zzhwVar.zzb.unregisterOnSharedPreferenceChangeListener(zzhwVar.zzd);
        }
        zza.clear();
    }

    @Override // com.google.android.gms.internal.measurement.zzhb
    public final Object zza(String str) {
        Map<String, ?> all = this.zzf;
        if (all == null) {
            synchronized (this.zze) {
                all = this.zzf;
                if (all == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        all = this.zzb.getAll();
                        this.zzf = all;
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (all != null) {
            return all.get(str);
        }
        return null;
    }

    final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zze) {
            this.zzf = null;
            this.zzc.run();
        }
        synchronized (this) {
            Iterator<zzgz> it = this.zzg.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}
