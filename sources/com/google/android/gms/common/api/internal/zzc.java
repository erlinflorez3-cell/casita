package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.common.zzh;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import yg.C1561oA;
import yg.OY;
import yg.Wg;

/* JADX INFO: loaded from: classes8.dex */
final class zzc {
    private final Map zza = Collections.synchronizedMap(new ArrayMap());
    private int zzb = 0;
    private Bundle zzc;

    zzc() {
    }

    final LifecycleCallback zzc(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.zza.get(str));
    }

    final void zzd(String str, LifecycleCallback lifecycleCallback) throws Throwable {
        if (this.zza.containsKey(str)) {
            throw new IllegalArgumentException(Wg.Zd("&\u0010\u000f\n\u000b+\u0019\u001c\u001aaaikmnkw\u0016p^KK\u0006TE6r", (short) (OY.Xd() ^ 12509), (short) (OY.Xd() ^ 12230)) + str + C1561oA.Xd("^!-4(%)?f)-.00lB>oE:<Gt<I9@G@JQ\f", (short) (OY.Xd() ^ 18423)));
        }
        this.zza.put(str, lifecycleCallback);
        if (this.zzb > 0) {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.od("lxmzvoi2ru/Lnmmam", (short) (OY.Xd() ^ 27292))).getDeclaredMethod(C1561oA.Kd("10@\u001a/8>\u001dABD:H", (short) (OY.Xd() ^ 10093)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                new zzh((Looper) declaredMethod.invoke(null, objArr)).post(new zzb(this, lifecycleCallback, str));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    final void zze(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    final void zzf(int i2, int i3, Intent intent) {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i2, i3, intent);
        }
    }

    final void zzg(Bundle bundle) {
        this.zzb = 1;
        this.zzc = bundle;
        for (Map.Entry entry : this.zza.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void zzh() {
        this.zzb = 5;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    final void zzi() {
        this.zzb = 3;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    final void zzj(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.zza.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void zzk() {
        this.zzb = 2;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    final void zzl() {
        this.zzb = 4;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }

    final boolean zzm() {
        return this.zzb > 0;
    }

    final boolean zzn() {
        return this.zzb >= 2;
    }
}
