package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzov;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes8.dex */
final class zzkz implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzjq zza;

    zzkz(zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    static /* synthetic */ void zza(zzkz zzkzVar, boolean z2, Uri uri, String str, String str2) {
        Bundle bundleZza;
        zzkzVar.zza.zzt();
        try {
            zzos zzosVarZzq = zzkzVar.zza.zzq();
            boolean z3 = zzov.zza() && zzkzVar.zza.zze().zza(zzbh.zzct);
            if (TextUtils.isEmpty(str2)) {
                bundleZza = null;
            } else if (str2.contains("gclid") || ((z3 && str2.contains("gbraid")) || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id"))) {
                bundleZza = zzosVarZzq.zza(Uri.parse("https://google.com/search?" + str2), z3);
                if (bundleZza != null) {
                    bundleZza.putString("_cis", "referrer");
                }
            } else {
                zzosVarZzq.zzj().zzc().zza("Activity created with data 'referrer' without required params");
                bundleZza = null;
            }
            if (z2) {
                Bundle bundleZza2 = zzkzVar.zza.zzq().zza(uri, zzov.zza() && zzkzVar.zza.zze().zza(zzbh.zzct));
                if (bundleZza2 != null) {
                    bundleZza2.putString("_cis", "intent");
                    if (!bundleZza2.containsKey("gclid") && bundleZza != null && bundleZza.containsKey("gclid")) {
                        bundleZza2.putString("_cer", String.format("gclid=%s", bundleZza.getString("gclid")));
                    }
                    zzkzVar.zza.zzc(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleZza2);
                    zzkzVar.zza.zza.zza(str, bundleZza2);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            zzkzVar.zza.zzj().zzc().zza("Activity created with referrer", str2);
            if (zzkzVar.zza.zze().zza(zzbh.zzbq)) {
                if (bundleZza != null) {
                    zzkzVar.zza.zzc(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleZza);
                    zzkzVar.zza.zza.zza(str, bundleZza);
                } else {
                    zzkzVar.zza.zzj().zzc().zza("Referrer does not contain valid parameters", str2);
                }
                zzkzVar.zza.zza("auto", "_ldl", (Object) null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                zzkzVar.zza.zzj().zzc().zza("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                zzkzVar.zza.zza("auto", "_ldl", (Object) str2, true);
            }
        } catch (RuntimeException e2) {
            zzkzVar.zza.zzj().zzg().zza("Throwable caught in handleReferrerForOnActivityCreated", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityCreated(android.app.Activity r8, android.os.Bundle r9) {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zza     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.zzgo r0 = r0.zzj()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzp()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            java.lang.String r0 = "onActivityCreated"
            r1.zza(r0)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            android.content.Intent r2 = r8.getIntent()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            if (r2 != 0) goto L1f
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zza
            com.google.android.gms.measurement.internal.zzlj r0 = r0.zzn()
            r0.zza(r8, r9)
            return
        L1f:
            android.net.Uri r4 = r2.getData()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            if (r4 == 0) goto L2c
            boolean r0 = r4.isHierarchical()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            if (r0 == 0) goto L2c
            goto L44
        L2c:
            android.os.Bundle r1 = r2.getExtras()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            if (r1 == 0) goto L43
            java.lang.String r0 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r0)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            if (r0 != 0) goto L43
            android.net.Uri r4 = android.net.Uri.parse(r1)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            goto L44
        L43:
            r4 = 0
        L44:
            if (r4 == 0) goto L82
            boolean r0 = r4.isHierarchical()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            if (r0 != 0) goto L4d
            goto L82
        L4d:
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zza     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            r0.zzq()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            boolean r0 = com.google.android.gms.measurement.internal.zzos.zza(r2)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            if (r0 == 0) goto L63
            java.lang.String r5 = "gs"
        L5a:
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            if (r9 != 0) goto L68
            goto L66
        L63:
            java.lang.String r5 = "auto"
            goto L5a
        L66:
            r3 = 1
            goto L69
        L68:
            r3 = 0
        L69:
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zza     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.zzhv r0 = r0.zzl()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.zzlc r1 = new com.google.android.gms.measurement.internal.zzlc     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            r0.zzb(r1)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zza
            com.google.android.gms.measurement.internal.zzlj r0 = r0.zzn()
            r0.zza(r8, r9)
            return
        L82:
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zza
            com.google.android.gms.measurement.internal.zzlj r0 = r0.zzn()
            r0.zza(r8, r9)
            return
        L8c:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zza     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.zzgo r0 = r0.zzj()     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzg()     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = "Throwable caught in onActivityCreated"
            r1.zza(r0, r2)     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zza
            com.google.android.gms.measurement.internal.zzlj r0 = r0.zzn()
            r0.zza(r8, r9)
            return
        La6:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzjq r0 = r7.zza
            com.google.android.gms.measurement.internal.zzlj r0 = r0.zzn()
            r0.zza(r8, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkz.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zznb zznbVarZzp = this.zza.zzp();
        zznbVarZzp.zzl().zzb(new zznd(zznbVarZzp, zznbVarZzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zznb zznbVarZzp = this.zza.zzp();
        zznbVarZzp.zzl().zzb(new zzne(zznbVarZzp, zznbVarZzp.zzb().elapsedRealtime()));
        this.zza.zzn().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzn().zzb(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
