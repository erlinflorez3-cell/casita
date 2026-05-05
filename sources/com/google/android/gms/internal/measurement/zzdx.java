package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdy;

/* JADX INFO: loaded from: classes8.dex */
final class zzdx extends zzdy.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzdy zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdx(zzdy zzdyVar, String str, String str2, Context context, Bundle bundle) {
        super(zzdyVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
        this.zzg = zzdyVar;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0082: IGET (r0 I:com.google.android.gms.internal.measurement.zzdy) = (r5 I:com.google.android.gms.internal.measurement.zzdx) com.google.android.gms.internal.measurement.zzdx.zzg com.google.android.gms.internal.measurement.zzdy, block:B:18:0x0082 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.measurement.zzdx] */
    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws Throwable {
        ?? r5;
        String str;
        String str2;
        String str3;
        try {
            if (this.zzg.zzc(this.zzc, this.zzd)) {
                str3 = this.zzd;
                str2 = this.zzc;
                str = this.zzg.zzc;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.zze);
            zzdy zzdyVar = this.zzg;
            zzdyVar.zzj = zzdyVar.zza(this.zze, true);
            if (this.zzg.zzj == null) {
                String unused = this.zzg.zzc;
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(this.zze, ModuleDescriptor.MODULE_ID);
            ((zzdj) Preconditions.checkNotNull(this.zzg.zzj)).initialize(ObjectWrapper.wrap(this.zze), new zzdw(106000L, Math.max(localVersion, r1), DynamiteModule.getRemoteVersion(this.zze, ModuleDescriptor.MODULE_ID) < localVersion, str, str2, str3, this.zzf, com.google.android.gms.measurement.internal.zzhs.zza(this.zze)), this.zza);
        } catch (Exception e2) {
            r5.zzg.zza(e2, true, false);
        }
    }
}
