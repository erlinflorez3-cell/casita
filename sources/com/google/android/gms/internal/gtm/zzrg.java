package com.google.android.gms.internal.gtm;

import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzrg extends zzqz {
    private static final Map zzb;
    private final ArrayList zzc;

    static {
        HashMap map = new HashMap();
        map.put("concat", new zzjz());
        map.put("every", new zzka());
        map.put(ViewProps.FILTER, new zzkb());
        map.put("forEach", new zzkc());
        map.put("indexOf", new zzkd());
        map.put("hasOwnProperty", zzlx.zza);
        map.put("join", new zzke());
        map.put("lastIndexOf", new zzkf());
        map.put("map", new zzkg());
        map.put("pop", new zzkh());
        map.put("push", new zzki());
        map.put("reduce", new zzkj());
        map.put("reduceRight", new zzkk());
        map.put("reverse", new zzkl());
        map.put("shift", new zzkm());
        map.put("slice", new zzkn());
        map.put("some", new zzko());
        map.put(Constants.SORT, new zzks());
        map.put("splice", new zzkt());
        map.put("toString", new zzmz());
        map.put("unshift", new zzku());
        zzb = Collections.unmodifiableMap(map);
    }

    public zzrg(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = new ArrayList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzrg) {
            ArrayList arrayList = ((zzrg) obj).zzc;
            if (this.zzc.size() == arrayList.size()) {
                boolean zEquals = true;
                for (int i2 = 0; i2 < this.zzc.size(); i2++) {
                    zEquals = this.zzc.get(i2) == null ? arrayList.get(i2) == null : ((zzqz) this.zzc.get(i2)).equals(arrayList.get(i2));
                    if (!zEquals) {
                        break;
                    }
                }
                return zEquals;
            }
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
        return new zzrf(this, new zzre(this), super.zzd());
    }

    @Override // com.google.android.gms.internal.gtm.zzqz
    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final zzqz zzi(int i2) {
        if (i2 < 0 || i2 >= this.zzc.size()) {
            return zzrd.zze;
        }
        zzqz zzqzVar = (zzqz) this.zzc.get(i2);
        return zzqzVar == null ? zzrd.zze : zzqzVar;
    }

    public final List zzk() {
        return this.zzc;
    }

    public final void zzl(int i2, zzqz zzqzVar) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 >= this.zzc.size()) {
            zzm(i2 + 1);
        }
        this.zzc.set(i2, zzqzVar);
    }

    public final void zzm(int i2) {
        Preconditions.checkArgument(i2 >= 0, "Invalid array length");
        if (this.zzc.size() == i2) {
            return;
        }
        if (this.zzc.size() >= i2) {
            ArrayList arrayList = this.zzc;
            arrayList.subList(i2, arrayList.size()).clear();
            return;
        }
        this.zzc.ensureCapacity(i2);
        for (int size = this.zzc.size(); size < i2; size++) {
            this.zzc.add(null);
        }
    }

    public final boolean zzn(int i2) {
        return i2 >= 0 && i2 < this.zzc.size() && this.zzc.get(i2) != null;
    }
}
