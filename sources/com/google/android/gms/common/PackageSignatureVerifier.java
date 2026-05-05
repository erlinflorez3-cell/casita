package com.google.android.gms.common;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public class PackageSignatureVerifier {
    static volatile zzab zza = null;
    private static zzac zzb = null;

    private static zzac zza(Context context) {
        zzac zzacVar;
        synchronized (PackageSignatureVerifier.class) {
            if (zzb == null) {
                zzb = new zzac(context);
            }
            zzacVar = zzb;
        }
        return zzacVar;
    }

    public PackageVerificationResult queryPackageSignatureVerified(Context context, String str) {
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        if (!zzn.zzf()) {
            throw new zzad();
        }
        String strConcat = String.valueOf(str).concat(true != zHonorsDebugCertificates ? "-0" : "-1");
        if (zza != null && zza.zza.equals(strConcat)) {
            return zza.zzb;
        }
        zza(context);
        zzw zzwVarZzc = zzn.zzc(str, zHonorsDebugCertificates, false, false);
        if (zzwVarZzc.zza) {
            zza = new zzab(strConcat, PackageVerificationResult.zzd(str, zzwVarZzc.zzd));
            return zza.zzb;
        }
        Preconditions.checkNotNull(zzwVarZzc.zzb);
        return PackageVerificationResult.zza(str, zzwVarZzc.zzb, zzwVarZzc.zzc);
    }

    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(Context context, String str) {
        try {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzb();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (SecurityException e2) {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            return packageVerificationResultQueryPackageSignatureVerified2.zzc() ? packageVerificationResultQueryPackageSignatureVerified2 : packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}
