package com.google.android.gms.internal.gtm;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzgd implements zzgf {
    final /* synthetic */ zzgg zza;

    zzgd(zzgg zzggVar) {
        this.zza = zzggVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzgf
    public final AdvertisingIdClient.Info zza() {
        AdvertisingIdClient.Info advertisingIdInfo = null;
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zza.zzj);
            return advertisingIdInfo;
        } catch (GooglePlayServicesNotAvailableException e2) {
            this.zza.zze = false;
            zzho.zzf("GooglePlayServicesNotAvailableException getting Advertising Id Info", e2);
            return advertisingIdInfo;
        } catch (GooglePlayServicesRepairableException e3) {
            zzho.zzf("GooglePlayServicesRepairableException getting Advertising Id Info", e3);
            return advertisingIdInfo;
        } catch (IOException e4) {
            zzho.zzf("IOException getting Ad Id Info", e4);
            return advertisingIdInfo;
        } catch (IllegalStateException e5) {
            zzho.zzf("IllegalStateException getting Advertising Id Info", e5);
            return advertisingIdInfo;
        } catch (Exception e6) {
            zzho.zzf("Unknown exception. Could not get the Advertising Id Info.", e6);
            return advertisingIdInfo;
        }
    }
}
