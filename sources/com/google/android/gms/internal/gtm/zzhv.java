package com.google.android.gms.internal.gtm;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhv {
    private static zzhv zza = null;
    private volatile int zzd = 1;
    private volatile String zzc = null;
    private volatile String zzb = null;

    zzhv() {
    }

    public static zzhv zza() {
        zzhv zzhvVar;
        synchronized (zzhv.class) {
            if (zza == null) {
                zza = new zzhv();
            }
            zzhvVar = zza;
        }
        return zzhvVar;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzd == 2;
    }

    public final boolean zze(String str) {
        return zzd() && this.zzb.equals(str);
    }

    public final synchronized boolean zzf(String str, Uri uri) {
        try {
            String strDecode = URLDecoder.decode(uri.toString(), "UTF-8");
            if (!strDecode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\S+")) {
                zzho.zze("Bad preview url: ".concat(String.valueOf(strDecode)));
                return false;
            }
            String queryParameter = uri.getQueryParameter("id");
            String queryParameter2 = uri.getQueryParameter("gtm_auth");
            String queryParameter3 = uri.getQueryParameter("gtm_preview");
            if (!str.equals(queryParameter)) {
                zzho.zze("Preview fails (container doesn't match the container specified by the asset)");
                return false;
            }
            if (queryParameter == null || queryParameter.length() <= 0) {
                zzho.zze("Bad preview url: ".concat(String.valueOf(strDecode)));
                return false;
            }
            if (queryParameter3 == null || queryParameter3.length() != 0) {
                if (queryParameter3 == null || queryParameter3.length() <= 0 || queryParameter2 == null || queryParameter2.length() <= 0) {
                    zzho.zze("Bad preview url: ".concat(String.valueOf(strDecode)));
                    return false;
                }
                this.zzd = 2;
                this.zzc = uri.getQuery();
                this.zzb = queryParameter;
            } else {
                if (!queryParameter.equals(this.zzb) || this.zzd == 1) {
                    zzho.zze("Error in exiting preview mode. The container is not in preview.");
                    return false;
                }
                zzho.zzd("Exit preview mode for container: ".concat(String.valueOf(this.zzb)));
                this.zzd = 1;
                this.zzb = null;
                this.zzc = null;
            }
            return true;
        } catch (UnsupportedEncodingException e2) {
            zzho.zze("Error decoding the preview url: ".concat(e2.toString()));
            return false;
        }
    }
}
