package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
final class zzpq implements zzpp {
    zzpq() {
    }

    @Override // com.google.android.gms.internal.gtm.zzpp
    public final zzpv zza(byte[] bArr) throws zzpi {
        if (bArr == null) {
            throw new zzpi("Cannot parse a null byte[]");
        }
        if (bArr.length == 0) {
            throw new zzpi("Cannot parse a 0 length byte[]");
        }
        try {
            Object obj = new JSONObject(new String(bArr)).get("resource");
            if (!(obj instanceof JSONObject)) {
                throw new zzpi("Resource map not found");
            }
            JSONObject jSONObject = (JSONObject) obj;
            zzqi zzqiVar = new zzqi();
            zzqiVar.zzc(jSONObject.optString("version"));
            JSONArray jSONArray = jSONObject.getJSONArray("macros");
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getJSONObject(i2).getString("instance_name"));
            }
            List listZzd = zzpj.zzd(jSONObject.getJSONArray("tags"), arrayList);
            List listZzd2 = zzpj.zzd(jSONObject.getJSONArray("predicates"), arrayList);
            Iterator it = zzpj.zzd(jSONObject.getJSONArray("macros"), arrayList).iterator();
            while (it.hasNext()) {
                zzqiVar.zza((zzqm) it.next());
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("rules");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                zzqiVar.zzb(zzpj.zzb(jSONArray2.getJSONArray(i3), listZzd, listZzd2));
            }
            zzqj zzqjVarZzd = zzqiVar.zzd();
            zzho.zzd("The container was successfully parsed from the resource");
            return new zzpv(Status.RESULT_SUCCESS, 0, new zzpu(null, null, zzqjVarZzd, 0L), zzps.zzb.zza(bArr).zzc());
        } catch (zzpi unused) {
            throw new zzpi("The resource data is invalid. The container cannot be extracted from the JSON data");
        } catch (JSONException unused2) {
            throw new zzpi("The resource data is corrupted. The container cannot be extracted from the JSON data");
        }
    }
}
