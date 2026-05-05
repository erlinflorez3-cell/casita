package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import io.sentry.protocol.SentryRuntime;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
final class zzpr implements zzpp {
    zzpr() {
    }

    @Override // com.google.android.gms.internal.gtm.zzpp
    public final zzpv zza(byte[] bArr) throws zzpi {
        zzqs zzqsVarZzc;
        if (bArr == null) {
            throw new zzpi("Cannot parse a null byte[]");
        }
        if (bArr.length == 0) {
            throw new zzpi("Cannot parse a 0 length byte[]");
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(SentryRuntime.TYPE);
            if (jSONArrayOptJSONArray == null) {
                zzqsVarZzc = null;
            } else {
                zzqq zzqqVar = new zzqq();
                Object obj = jSONObject.get("resource");
                if (!(obj instanceof JSONObject)) {
                    throw new zzpi("Resource map not found");
                }
                zzqqVar.zzb(((JSONObject) obj).optString("version"));
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    Object obj2 = jSONArrayOptJSONArray.get(i2);
                    if (!(obj2 instanceof JSONArray) || ((JSONArray) obj2).length() != 0) {
                        zzqqVar.zza(zzpj.zza(obj2));
                    }
                }
                zzqsVarZzc = zzqqVar.zzc();
            }
            if (zzqsVarZzc != null) {
                zzho.zzd("The runtime configuration was successfully parsed from the resource");
            }
            return new zzpv(Status.RESULT_SUCCESS, 0, null, zzqsVarZzc);
        } catch (zzpi unused) {
            throw new zzpi("The resource data is invalid. The runtime  configuration cannot be extracted from the JSON data");
        } catch (JSONException unused2) {
            throw new zzpi("The resource data is corrupted. The runtime configuration cannot be extracted from the JSON data");
        }
    }
}
