package com.google.android.gms.internal.gtm;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqb {
    private final String zza = "https://www.google-analytics.com";

    private static final String zzb(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException unused) {
            zzho.zza("Cannot encode the string: ".concat(String.valueOf(str)));
            return "";
        }
    }

    public final String zza(zzph zzphVar) {
        String string;
        if (zzphVar.zzg()) {
            string = zzphVar.zza();
        } else if (zzphVar == null) {
            string = "";
        } else {
            String strTrim = !zzphVar.zze().trim().isEmpty() ? zzphVar.zze().trim() : "-1";
            StringBuilder sb = new StringBuilder();
            if (zzphVar.zzf() != null) {
                sb.append(zzphVar.zzf());
            } else {
                sb.append("id");
            }
            sb.append("=");
            sb.append(zzb(zzphVar.zzb()));
            sb.append("&pv=");
            sb.append(zzb(strTrim));
            sb.append("&rv=5.0");
            if (zzphVar.zzg()) {
                sb.append("&gtm_debug=x");
            }
            string = sb.toString();
        }
        return this.zza + "/gtm/android?" + string;
    }
}
