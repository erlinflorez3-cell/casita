package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.Jg;
import yg.Od;
import yg.Xg;

/* JADX INFO: loaded from: classes9.dex */
public final class zzbe {
    private final Context zza;

    public zzbe(Context context) {
        this.zza = context;
    }

    private final SharedPreferences zze() throws Throwable {
        Context context = this.zza;
        Object[] objArr = {C1561oA.yd("tqg\u0001cpth[pnkamYdbhjX\\]Q\\ZaSaVJV", (short) (Od.Xd() ^ (-2199))), 0};
        Method method = Class.forName(C1561oA.Yd("\u000f\u001d\u0014#!\u001c\u0018b\u0019&&-\u001f)0j\u0001..5';8", (short) (C1580rY.Xd() ^ (-16508)))).getMethod(Jg.Wd("$\u0013R$q[\u001f\u0003,\t[Azj*\u000eAfY\u001a", (short) (C1607wl.Xd() ^ 8960), (short) (C1607wl.Xd() ^ 19291)), Class.forName(Xg.qd("vn\u0005p>}s\u0002{Ci\f\u000b\u0003\t\u0003", (short) (C1580rY.Xd() ^ (-19723)), (short) (C1580rY.Xd() ^ (-22188)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return (SharedPreferences) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final Set zza() {
        Set<String> hashSet;
        synchronized (zzbe.class) {
            try {
                hashSet = zze().getStringSet("modules_to_uninstall_if_emulated", new HashSet());
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
            if (hashSet == null) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }

    public final void zzb() {
        synchronized (zzbe.class) {
            zze().edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    final void zzc(Collection collection) {
        synchronized (zzbe.class) {
            HashSet hashSet = new HashSet(zza());
            Iterator it = collection.iterator();
            boolean zAdd = false;
            while (it.hasNext()) {
                zAdd |= hashSet.add((String) it.next());
            }
            if (zAdd) {
                try {
                    zze().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }

    final void zzd(Collection collection) {
        synchronized (zzbe.class) {
            Set<String> setZza = zza();
            HashSet hashSet = new HashSet();
            boolean z2 = false;
            for (String str : setZza) {
                if (collection.contains(str)) {
                    z2 = true;
                } else {
                    hashSet.add(str);
                }
            }
            if (z2) {
                try {
                    zze().edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
    }
}
