package com.google.android.gms.internal.vision;

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
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbq implements zzay {
    private static final Map<String, zzbq> zza = new ArrayMap();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;
    private final Object zzd;
    private volatile Map<String, ?> zze;
    private final List<zzaz> zzf;

    private zzbq(SharedPreferences sharedPreferences) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.vision.zzbt
            private final zzbq zza;

            {
                this.zza = this;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.zza.zza(sharedPreferences2, str);
            }
        };
        this.zzc = onSharedPreferenceChangeListener;
        this.zzd = new Object();
        this.zzf = new ArrayList();
        this.zzb = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    static zzbq zza(Context context, String str) {
        zzbq zzbqVar;
        if (!((!zzas.zza() || str.startsWith("direct_boot:")) ? true : zzas.zza(context))) {
            return null;
        }
        synchronized (zzbq.class) {
            Map<String, zzbq> map = zza;
            zzbqVar = map.get(str);
            if (zzbqVar == null) {
                zzbqVar = new zzbq(zzb(context, str));
                map.put(str, zzbqVar);
            }
        }
        return zzbqVar;
    }

    static synchronized void zza() {
        for (zzbq zzbqVar : zza.values()) {
            zzbqVar.zzb.unregisterOnSharedPreferenceChangeListener(zzbqVar.zzc);
        }
        zza.clear();
    }

    private static SharedPreferences zzb(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        short sXd = (short) (C1499aX.Xd() ^ (-16699));
        int[] iArr = new int["Z`j^]o[_mnt;".length()];
        QB qb = new QB("Z`j^]o[_mnt;");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        try {
            if (!str.startsWith(new String(iArr, 0, i2))) {
                short sXd2 = (short) (OY.Xd() ^ 20758);
                int[] iArr2 = new int["{\n\u0001\u0010\u000e\t\u0005O\u0006\u0013\u0013\u001a\f\u0016\u001dWm\u001b\u001b\"\u0014(%".length()];
                QB qb2 = new QB("{\n\u0001\u0010\u000e\t\u0005O\u0006\u0013\u0013\u001a\f\u0016\u001dWm\u001b\u001b\"\u0014(%");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(Xg.qd("\u0011\t\u001f\u000bX\u0018\u000e\u001c\u0016]\u0004&%\u001d#\u001d", (short) (Od.Xd() ^ (-14798)), (short) (Od.Xd() ^ (-4954))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr = {str, 0};
                Method method = cls.getMethod(Jg.Wd("P\u001bYf+$$Fs^1\u0013C@| \u0018\f<y", (short) (Od.Xd() ^ (-18214)), (short) (Od.Xd() ^ (-10071))), clsArr);
                try {
                    method.setAccessible(true);
                    return (SharedPreferences) method.invoke(context, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            if (zzas.zza()) {
                Class<?> cls2 = Class.forName(Wg.vd("\u0016$\u001b* \u001b\u0017a\u0010\u001d\u001d$\u000e\u0018\u001fY\b55<&:7", (short) (OY.Xd() ^ 13115)));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd3 = (short) (Od.Xd() ^ (-6954));
                short sXd4 = (short) (Od.Xd() ^ (-20232));
                int[] iArr3 = new int["t\u0003to\u0002qOo\u007fqjkUvrvfcscaOoikY^[8cafVhc".length()];
                QB qb3 = new QB("t\u0003to\u0002qOo\u007fqjkUvrvfcscaOoikY^[8cafVhc");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(((sXd3 + i4) + xuXd3.CK(iKK3)) - sXd4);
                    i4++;
                }
                Method method2 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    method2.setAccessible(true);
                    context = (Context) method2.invoke(context, objArr2);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            String strSubstring = str.substring(12);
            Class<?> cls3 = Class.forName(hg.Vd("\u0007\u0013\b\u0015\u0011\n\u0004L\u0001\f\n\u000f~\u0007\fDX\u0004\u0002\u0007v\t\u0004", (short) (Od.Xd() ^ (-28218)), (short) (Od.Xd() ^ (-9868))));
            Class<?>[] clsArr3 = new Class[2];
            clsArr3[0] = Class.forName(C1561oA.ud("_UiS\u001f\\P\\T\u001a>^[QUM", (short) (OY.Xd() ^ 9543)));
            clsArr3[1] = Integer.TYPE;
            Object[] objArr3 = {strSubstring, 0};
            Method method3 = cls3.getMethod(C1561oA.yd("\u0017\u0016\"\u0002\u001c\u0016$\u0018\fx\u0018\f\u0012\u0012\u001c\u0010\u000e\u0004\u0003\u0012", (short) (C1580rY.Xd() ^ (-7813))), clsArr3);
            try {
                method3.setAccessible(true);
                return (SharedPreferences) method3.invoke(context, objArr3);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } finally {
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    @Override // com.google.android.gms.internal.vision.zzay
    public final Object zza(String str) {
        Map<String, ?> all = this.zze;
        if (all == null) {
            synchronized (this.zzd) {
                all = this.zze;
                if (all == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        all = this.zzb.getAll();
                        this.zze = all;
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
        synchronized (this.zzd) {
            this.zze = null;
            zzbi.zza();
        }
        synchronized (this) {
            Iterator<zzaz> it = this.zzf.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}
