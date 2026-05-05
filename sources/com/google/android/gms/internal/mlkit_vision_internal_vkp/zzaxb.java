package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.android.callback.Callback;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
final class zzaxb implements zzawz {
    static final String zza;
    private final String zzb = zza;
    private final String zzc = "https://mobilemlaccelerationcompatibility.googleapis.com";

    static {
        Object[] objArr = {C1561oA.ud("\u001f\u001fz\u000e~\"$s\u000e\rmis\nb\u001b\u0015M\u0015t\t\bZ\bYif?_G\u0006\u0003}=_]zw9", (short) (OY.Xd() ^ 21106)), 3};
        Method declaredMethod = Class.forName(C1561oA.yd("UcZigb^)qqgk.CcvI\u001b\u001a", (short) (C1580rY.Xd() ^ (-5615)))).getDeclaredMethod(Xg.qd("tvu\u0003xz", (short) (C1607wl.Xd() ^ 9265), (short) (C1607wl.Xd() ^ 25023)), Class.forName(C1561oA.Yd("#\u001b1\u001dj* .(o\u001687/5/", (short) (C1499aX.Xd() ^ (-5707)))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = {Jg.Wd("aja\u0003r\u0005jqf8v-|\u000enN`u)\u0007\u001b=<R/T\f6|<G>;='\u000f\u0005|6", (short) (C1607wl.Xd() ^ 29428), (short) (C1607wl.Xd() ^ 8146)), 3};
            Method declaredMethod2 = Class.forName(ZO.xd("B\u0001O_h6\u00070i#\u000eo\u001by\u001bf&H\u0013", (short) (ZN.Xd() ^ 12339), (short) (ZN.Xd() ^ 26454))).getDeclaredMethod(Ig.wd("\u000e@j sP", (short) (C1499aX.Xd() ^ (-3655))), Class.forName(C1626yg.Ud("Zd\u001f9N\u0006\u0014(\u0003FXc`\u0005IP", (short) (FB.Xd() ^ 28342), (short) (FB.Xd() ^ 18901))), Integer.TYPE);
            try {
                declaredMethod2.setAccessible(true);
                byte[] bArr2 = (byte[]) declaredMethod2.invoke(null, objArr2);
                byte[] bArr3 = new byte[bArr.length];
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
                }
                Object[] objArr3 = {bArr3, 3};
                Method declaredMethod3 = Class.forName(EO.Od("\n>h\u001c\u0004[0Cfvk\u000b\u001c<Ar\nr*", (short) (C1499aX.Xd() ^ (-2947)))).getDeclaredMethod(C1561oA.Qd("\u0013\u001b\u000f\u001a\u000e\u000e{\u0016x\u0019\u0016\f\u0010\b", (short) (C1633zX.Xd() ^ (-16015))), byte[].class, Integer.TYPE);
                try {
                    declaredMethod3.setAccessible(true);
                    zza = (String) declaredMethod3.invoke(null, objArr3);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzawz
    public final zzbhx zza(zzaws zzawsVar, zzaxc zzaxcVar, String str, String str2, String str3, int i2) throws Exception {
        String str4 = this.zzb;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(this.zzc + "/v1/advisor?alt=PROTO").openConnection();
                Callback.openConnection(uRLConnectionOpenConnection);
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuf");
                httpURLConnection.setRequestProperty("Content-Type", "application/json; utf-8");
                httpURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
                httpURLConnection.setRequestProperty("X-Goog-Api-Key", str4);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("installation_id", zzaxcVar.zza());
                    jSONObject.put(EventKeys.CLIENT, "MLKIT");
                    jSONObject.put("client_library", str);
                    jSONObject.put("client_library_version", str2);
                    JSONObject jSONObjectPut = new JSONObject().put("client_info", jSONObject);
                    zzbyv zzbyvVarZza = zzawsVar.zza();
                    zzbyy zzbyyVarZzg = zzbyvVarZza.zzg();
                    zzbys zzbysVarZzc = zzbyvVarZza.zzc();
                    JSONObject jSONObjectPut2 = jSONObjectPut.put("android_info", new JSONObject().put("product", new JSONObject().put(Device.TYPE, zzbyyVarZzg.zzh()).put("product", zzbyyVarZzg.zzk()).put(Device.JsonKeys.MODEL, zzbyyVarZzg.zzj()).put(Device.JsonKeys.MANUFACTURER, zzbyyVarZzg.zzi()).put(Device.JsonKeys.BRAND, zzbyyVarZzg.zzg())).put(OperatingSystem.JsonKeys.BUILD, new JSONObject().put("os_version", zzbysVarZzc.zzj()).put(App.JsonKeys.BUILD_TYPE, zzbysVarZzc.zzi()).put("preview_sdk", zzbysVarZzc.zzc()).put(ProfilingTraceData.JsonKeys.BUILD_ID, zzbysVarZzc.zzh())).put("soc", zzbyvVarZza.zzh()));
                    zzbze zzbzeVarZzb = zzawsVar.zzb();
                    JSONArray jSONArray = new JSONArray();
                    for (zzbzb zzbzbVar : zzbzeVarZzb.zzf()) {
                        jSONArray.put(new JSONObject().put(Device.TYPE, zzbzbVar.zzg()).put("version", zzbzbVar.zzh()).put("feature_level", zzbzbVar.zzc()));
                    }
                    JSONObject jSONObjectPut3 = jSONObjectPut2.put("nnapi_info", new JSONObject().put("nnapi_driver_versions", jSONArray)).put("model_namespace", "com.google.perception");
                    OutputStream outputStream = Callback.getOutputStream(httpURLConnection);
                    try {
                        byte[] bytes = jSONObjectPut3.toString().getBytes(StandardCharsets.UTF_8);
                        outputStream.write(bytes, 0, bytes.length);
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        try {
                            Callback.connect(httpURLConnection);
                            if (Callback.getResponseCode(httpURLConnection) != 200) {
                                throw new zzaxa(zzags.RPC_ERROR, String.format("Error response (%d: '%s') from MlGoldblumServer", Integer.valueOf(Callback.getResponseCode(httpURLConnection)), Callback.getResponseMessage(httpURLConnection)));
                            }
                            String headerField = Callback.getHeaderField(httpURLConnection, "Content-Type");
                            if (headerField == null || !zzkb.zza(headerField, "application/x-protobuf")) {
                                throw new zzaxa(zzags.RPC_RETURNED_MALFORMED_RESULT, "Invalid response from MlGoldblum, expected proto buf but got ".concat(String.valueOf(headerField)));
                            }
                            try {
                                return zzbyp.zzf(Callback.getInputStream(httpURLConnection), zzbdv.zza()).zzc();
                            } catch (IOException e2) {
                                throw new zzaxa(zzags.RPC_RETURNED_MALFORMED_RESULT, "Error while reading response from MlGoldblum", e2);
                            }
                        } catch (IOException e3) {
                            throw new zzaxa(zzags.NO_CONNECTION, "Error while requesting allowlist to MlGoldblum", e3);
                        }
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException | JSONException e4) {
                    throw new zzaxa(zzags.RPC_CLIENT_ERROR, "Error creating request", e4);
                }
            } catch (IOException e5) {
                throw new zzaxa(zzags.RPC_CLIENT_ERROR, "Error while building allowlist request to MlGoldblum", e5);
            }
        } catch (IOException e6) {
            throw new zzaxa(zzags.RPC_CLIENT_ERROR, "Invalid URL built while trying to connect to MlGoldblum", e6);
        }
    }
}
