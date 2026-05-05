package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.Arrays;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public final class zzf {
    private final String zza;
    private final zzd zzb;
    private zzd zzc;

    /* synthetic */ zzf(String str, zze zzeVar) {
        zzd zzdVar = new zzd();
        this.zzb = zzdVar;
        this.zzc = zzdVar;
        str.getClass();
        this.zza = str;
    }

    private final zzf zze(String str, Object obj) {
        zzc zzcVar = new zzc(null);
        this.zzc.zzc = zzcVar;
        this.zzc = zzcVar;
        zzcVar.zzb = obj;
        zzcVar.zza = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        zzd zzdVar = this.zzb.zzc;
        String str = "";
        while (zzdVar != null) {
            Object obj = zzdVar.zzb;
            sb.append(str);
            String str2 = zzdVar.zza;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzdVar = zzdVar.zzc;
            str = ", ";
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final zzf zza(String str, float f2) {
        zze("classificationConfidenceThreshold", String.valueOf(f2));
        return this;
    }

    public final zzf zzb(String str, int i2) {
        zze(str, String.valueOf(i2));
        return this;
    }

    public final zzf zzc(String str, @CheckForNull Object obj) {
        zzd zzdVar = new zzd();
        this.zzc.zzc = zzdVar;
        this.zzc = zzdVar;
        zzdVar.zzb = obj;
        zzdVar.zza = str;
        return this;
    }

    public final zzf zzd(String str, boolean z2) {
        zze(str, String.valueOf(z2));
        return this;
    }
}
