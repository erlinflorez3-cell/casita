package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes8.dex */
public final class zztw implements zztj {
    private final zzob zza;
    private zzsj zzb = new zzsj();
    private final int zzc;

    private zztw(zzob zzobVar, int i2) {
        this.zza = zzobVar;
        zzuf.zza();
        this.zzc = i2;
    }

    public static zztj zzf(zzob zzobVar) {
        return new zztw(zzobVar, 0);
    }

    public static zztj zzg(zzob zzobVar, int i2) {
        return new zztw(zzobVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztj
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztj
    public final zztj zzb(zzoa zzoaVar) {
        this.zza.zzf(zzoaVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztj
    public final zztj zzc(zzsj zzsjVar) {
        this.zzb = zzsjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztj
    public final String zzd() {
        String strZzk;
        zzsl zzslVarZzg = this.zza.zzk().zzg();
        return (zzslVarZzg == null || (strZzk = zzslVarZzg.zzk()) == null || strZzk.isEmpty()) ? "NA" : (String) Preconditions.checkNotNull(zzslVarZzg.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztj
    public final byte[] zze(int i2, boolean z2) {
        this.zzb.zzf(Boolean.valueOf(1 == (i2 ^ 1)));
        this.zzb.zze(false);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzuf.zza();
            if (i2 == 0) {
                return new JsonDataEncoderBuilder().configureWith(zzlv.zza).ignoreNullValues(true).build().encode(this.zza.zzk()).getBytes("utf-8");
            }
            zzod zzodVarZzk = this.zza.zzk();
            zzcg zzcgVar = new zzcg();
            zzlv.zza.configure(zzcgVar);
            return zzcgVar.zza().zza(zzodVarZzk);
        } catch (UnsupportedEncodingException e2) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e2);
        }
    }
}
