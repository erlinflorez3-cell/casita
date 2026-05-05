package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import com.dynatrace.android.callback.OkCallback;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class zzui {
    private static final MediaType zzb = MediaType.parse("application/json; charset=utf-8");
    public final zzuj zza;
    private final zzun zze;
    private final OkHttpClient zzc = new OkHttpClient.Builder().connectTimeout(10000, TimeUnit.MILLISECONDS).readTimeout(10000, TimeUnit.MILLISECONDS).writeTimeout(10000, TimeUnit.MILLISECONDS).build();
    private zzuq zzd = null;
    private final String zzf = "https://firebaseinstallations.googleapis.com/v1";

    public zzui(zzuj zzujVar, zzun zzunVar) {
        this.zza = zzujVar;
        this.zze = zzunVar;
    }

    private static long zze(long j2, String str) {
        return j2 + (Long.parseLong(str.replaceFirst("s$", "")) * 1000);
    }

    private final String zzf(Headers headers, String str, String str2, zzum zzumVar, zzum zzumVar2) throws Exception {
        String strString;
        ResponseBody responseBodyBody;
        try {
            Response responseExecute = OkCallback.execute(this.zzc.newCall(new Request.Builder().headers(headers).url(str).post(RequestBody.create(zzb, str2)).build()));
            int iCode = responseExecute.code();
            zzumVar2.zzf(iCode);
            if (iCode < 200 || iCode >= 300) {
                String str3 = "Got HTTP status " + iCode + " from HTTPS POST request to <" + str + ">";
                try {
                    responseBodyBody = responseExecute.body();
                } catch (IOException unused) {
                    strString = "<none>";
                }
                try {
                    strString = responseBodyBody.string();
                    if (responseBodyBody != null) {
                        responseBodyBody.close();
                    }
                    "HTTP Response Body:\n".concat(String.valueOf(strString));
                    zzumVar2.zzd(zzsw.RPC_ERROR);
                    zzumVar.zzb(zzsw.RPC_ERROR);
                    return null;
                } finally {
                }
            }
            try {
                responseBodyBody = responseExecute.body();
                try {
                    String strString2 = responseBodyBody.string();
                    if (responseBodyBody != null) {
                        responseBodyBody.close();
                    }
                    return strString2;
                } finally {
                    if (responseBodyBody != null) {
                        try {
                            responseBodyBody.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                }
            } catch (IOException e2) {
                String str4 = "Error retrieving response body from HTTPS POST request to <" + str + ">";
                zzumVar2.zzd(zzsw.RPC_ERROR);
                zzumVar.zzb(zzsw.RPC_ERROR);
                return null;
            }
        } catch (IOException e3) {
            String str5 = "Connection error (or timeout) sending HTTPS POST request to <" + str + ">";
            zzumVar2.zzd(zzsw.NO_CONNECTION);
            zzumVar.zzb(zzsw.NO_CONNECTION);
            return null;
        }
    }

    public final zzuq zza() {
        return this.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzui] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzui] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    final /* synthetic */ boolean zzb(zzuf zzufVar, zzum zzumVar) throws Exception {
        zzui zzuiVar;
        zzuf zzufVar2;
        String strZze;
        String strZze2;
        String strZze3;
        long jZze;
        boolean z2;
        ?? r3;
        String str = String.format("%s/projects/%s/installations", this.zzf, this.zza.zzc());
        Headers headersBuild = new Headers.Builder().add("x-goog-api-key", this.zza.zza()).build();
        String strZza = zzufVar.zza();
        ?? Zzb = this.zza.zzb();
        String str2 = String.format("{fid: '%s', appId: '%s', authVersion: '%s', sdkVersion: '%s'}", strZza, Zzb, "FIS_v2", "o:a:mlkit:1.0.0");
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzum zzumVar2 = new zzum();
        zzumVar2.zzg();
        String strZzf = zzf(headersBuild, str, str2, zzumVar, zzumVar2);
        zzumVar2.zze();
        try {
            if (strZzf != null) {
                try {
                    try {
                        try {
                            zzck zzckVarZzb = zzcm.zzb(strZzf).zzb();
                            try {
                                String strZze4 = zzckVarZzb.zzc("name").zze();
                                zzufVar2 = new zzuf(zzckVarZzb.zzc("fid").zze());
                                strZze = zzckVarZzb.zzc("refreshToken").zze();
                                zzck zzckVarZza = zzckVarZzb.zza("authToken");
                                try {
                                    strZze2 = zzckVarZza.zzc("token").zze();
                                    strZze3 = zzckVarZza.zzc("expiresIn").zze();
                                    jZze = zze(jCurrentTimeMillis, strZze3);
                                } catch (ClassCastException | IllegalStateException | NullPointerException e2) {
                                    zzuiVar = this;
                                }
                                try {
                                    String str3 = "installation name: " + strZze4;
                                    String str4 = "fid: " + zzufVar2.zza();
                                    String str5 = "refresh_token: " + strZze;
                                    String str6 = "auth token: " + String.valueOf(zzckVarZza);
                                    String str7 = "auth token expires in: " + strZze3;
                                    String str8 = "auth token expiry: " + jZze;
                                    zzuiVar = this;
                                } catch (ClassCastException e3) {
                                    zzuiVar = this;
                                    String str9 = "Error traversing JSON object returned from url <" + str + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzckVarZzb.toString();
                                    zzumVar2.zzd(zzsw.RPC_RETURNED_INVALID_RESULT);
                                    zzumVar.zzb(zzsw.RPC_RETURNED_INVALID_RESULT);
                                    Zzb = zzuiVar;
                                    z2 = false;
                                    r3 = Zzb;
                                    r3.zze.zza(zzpb.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzumVar2);
                                    return z2;
                                } catch (IllegalStateException e4) {
                                    zzuiVar = this;
                                    String str92 = "Error traversing JSON object returned from url <" + str + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzckVarZzb.toString();
                                    zzumVar2.zzd(zzsw.RPC_RETURNED_INVALID_RESULT);
                                    zzumVar.zzb(zzsw.RPC_RETURNED_INVALID_RESULT);
                                    Zzb = zzuiVar;
                                    z2 = false;
                                    r3 = Zzb;
                                    r3.zze.zza(zzpb.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzumVar2);
                                    return z2;
                                } catch (NullPointerException e5) {
                                    zzuiVar = this;
                                    String str922 = "Error traversing JSON object returned from url <" + str + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzckVarZzb.toString();
                                    zzumVar2.zzd(zzsw.RPC_RETURNED_INVALID_RESULT);
                                    zzumVar.zzb(zzsw.RPC_RETURNED_INVALID_RESULT);
                                    Zzb = zzuiVar;
                                    z2 = false;
                                    r3 = Zzb;
                                    r3.zze.zza(zzpb.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzumVar2);
                                    return z2;
                                }
                            } catch (ClassCastException e6) {
                            } catch (IllegalStateException e7) {
                            } catch (NullPointerException e8) {
                            }
                            try {
                                zzuiVar.zzd = new zzuq(zzufVar2, strZze, strZze2, jZze);
                                z2 = true;
                                r3 = zzuiVar;
                            } catch (ClassCastException e9) {
                                String str9222 = "Error traversing JSON object returned from url <" + str + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzckVarZzb.toString();
                                zzumVar2.zzd(zzsw.RPC_RETURNED_INVALID_RESULT);
                                zzumVar.zzb(zzsw.RPC_RETURNED_INVALID_RESULT);
                                Zzb = zzuiVar;
                                z2 = false;
                                r3 = Zzb;
                            } catch (IllegalStateException e10) {
                                String str92222 = "Error traversing JSON object returned from url <" + str + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzckVarZzb.toString();
                                zzumVar2.zzd(zzsw.RPC_RETURNED_INVALID_RESULT);
                                zzumVar.zzb(zzsw.RPC_RETURNED_INVALID_RESULT);
                                Zzb = zzuiVar;
                                z2 = false;
                                r3 = Zzb;
                            } catch (NullPointerException e11) {
                                String str922222 = "Error traversing JSON object returned from url <" + str + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzckVarZzb.toString();
                                zzumVar2.zzd(zzsw.RPC_RETURNED_INVALID_RESULT);
                                zzumVar.zzb(zzsw.RPC_RETURNED_INVALID_RESULT);
                                Zzb = zzuiVar;
                                z2 = false;
                                r3 = Zzb;
                            }
                        } catch (zzco | IllegalStateException | NullPointerException e12) {
                            Zzb = this;
                            String str10 = "Error parsing JSON object returned from <" + str + ">:\n" + strZzf;
                            zzumVar2.zzd(zzsw.RPC_RETURNED_MALFORMED_RESULT);
                            zzumVar.zzb(zzsw.RPC_RETURNED_MALFORMED_RESULT);
                        }
                        r3.zze.zza(zzpb.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzumVar2);
                        return z2;
                    } catch (Throwable th) {
                        th = th;
                        Zzb.zze.zza(zzpb.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzumVar2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Zzb = this;
                    Zzb.zze.zza(zzpb.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzumVar2);
                    throw th;
                }
            }
            Zzb = this;
            z2 = false;
            r3 = Zzb;
            r3.zze.zza(zzpb.INSTALLATION_ID_FIS_CREATE_INSTALLATION, zzumVar2);
            return z2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean zzc(final zzum zzumVar) throws InterruptedException {
        if (this.zzd == null) {
            return false;
        }
        boolean zZza = zzwj.zza(new zzwi() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzug
            @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzwi
            public final boolean zza() {
                return this.zza.zzd(zzumVar);
            }
        });
        if (!zZza) {
            zzumVar.zzc(zzsw.RPC_EXPONENTIAL_BACKOFF_FAILED);
        }
        return zZza;
    }

    public final boolean zzd(zzum zzumVar) throws Exception {
        String str = String.format("%s/projects/%s/installations/%s/authTokens:generate", this.zzf, this.zza.zzc(), this.zzd.zzb().zza());
        Headers headersBuild = new Headers.Builder().add("authorization", "FIS_v2 ".concat(String.valueOf(this.zzd.zzc()))).add("x-goog-api-key", this.zza.zza()).build();
        String str2 = String.format("{installation:{sdkVersion:'%s'}}", "o:a:mlkit:1.0.0");
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzum zzumVar2 = new zzum();
        zzumVar2.zzg();
        String strZzf = zzf(headersBuild, str, str2, zzumVar, zzumVar2);
        zzumVar2.zze();
        boolean z2 = false;
        if (strZzf != null) {
            try {
                try {
                    zzck zzckVarZzb = zzcm.zzb(strZzf).zzb();
                    try {
                        String strZze = zzckVarZzb.zzc("token").zze();
                        String strZze2 = zzckVarZzb.zzc("expiresIn").zze();
                        long jZze = zze(jCurrentTimeMillis, strZze2);
                        String str3 = "refreshed auth token: " + strZze;
                        String str4 = "auth token expires in: " + strZze2;
                        String str5 = "auth token expiry: " + jZze;
                        this.zzd = new zzuq(this.zzd.zzb(), this.zzd.zzc(), strZze, jZze);
                        z2 = true;
                    } catch (ClassCastException | IllegalStateException | NullPointerException e2) {
                        zzumVar2.zzd(zzsw.RPC_RETURNED_INVALID_RESULT);
                        zzumVar.zzb(zzsw.RPC_RETURNED_INVALID_RESULT);
                        String str6 = "Error traversing JSON object returned from <" + str + ">:\nraw json:\n" + strZzf + "\nparsed json:\n" + zzckVarZzb.toString();
                    }
                } catch (zzco e3) {
                    String str7 = "Error parsing JSON object returned from <" + str + ">:\n" + strZzf;
                    zzumVar2.zzd(zzsw.RPC_RETURNED_MALFORMED_RESULT);
                    zzumVar.zzb(zzsw.RPC_RETURNED_MALFORMED_RESULT);
                }
            } finally {
                this.zze.zza(zzpb.INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN, zzumVar2);
            }
        }
        return z2;
    }
}
