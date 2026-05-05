package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzax implements Map, Serializable {

    @CheckForNull
    private transient zzay zza;

    @CheckForNull
    private transient zzay zzb;

    @CheckForNull
    private transient zzaq zzc;

    zzax() {
    }

    public static zzax zzc(Object obj, Object obj2) {
        zzab.zzb("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
        return zzbp.zzg(1, new Object[]{"optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzbr.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzay zzayVar = this.zzb;
        if (zzayVar != null) {
            return zzayVar;
        }
        zzay zzayVarZze = zze();
        this.zzb = zzayVarZze;
        return zzayVarZze;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzab.zza(size, RRWebVideoEvent.JsonKeys.SIZE);
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z2 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z2 = false;
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    abstract zzaq zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb */
    public final zzaq values() {
        zzaq zzaqVar = this.zzc;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq zzaqVarZza = zza();
        this.zzc = zzaqVarZza;
        return zzaqVarZza;
    }

    abstract zzay zzd();

    abstract zzay zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf */
    public final zzay entrySet() {
        zzay zzayVar = this.zza;
        if (zzayVar != null) {
            return zzayVar;
        }
        zzay zzayVarZzd = zzd();
        this.zza = zzayVarZzd;
        return zzayVarZzd;
    }
}
