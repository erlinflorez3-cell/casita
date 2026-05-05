package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzrk extends zzqz {
    private static final Map zzb;
    private final String zzc;

    static {
        HashMap map = new HashMap();
        map.put("charAt", new zzmm());
        map.put("concat", new zzmn());
        map.put("hasOwnProperty", zzlx.zza);
        map.put("indexOf", new zzmo());
        map.put("lastIndexOf", new zzmp());
        map.put("match", new zzmq());
        map.put("replace", new zzmr());
        map.put("search", new zzms());
        map.put("slice", new zzmt());
        map.put("split", new zzmu());
        map.put("substring", new zzmv());
        map.put("toLocaleLowerCase", new zzmw());
        map.put("toLocaleUpperCase", new zzmx());
        map.put("toLowerCase", new zzmy());
        map.put("toUpperCase", new zzna());
        map.put("toString", new zzmz());
        map.put("trim", new zznb());
        zzb = Collections.unmodifiableMap(map);
    }

    public zzrk(String str) {
        Preconditions.checkNotNull(str);
        this.zzc = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzrk) {
            return this.zzc.equals(((zzrk) obj).zzc);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    /* JADX INFO: renamed from: toString */
    public final String zzc() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final zzjw zza(String str) {
        if (zzg(str)) {
            return (zzjw) zzb.get(str);
        }
        throw new IllegalStateException("Native Method " + str + " is not defined for type ListWrapper.");
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final /* synthetic */ Object zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final Iterator zze() {
        return new zzrj(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final zzqz zzi(int i2) {
        return (i2 < 0 || i2 >= this.zzc.length()) ? zzrd.zze : new zzrk(String.valueOf(this.zzc.charAt(i2)));
    }

    public final String zzk() {
        return this.zzc;
    }
}
