package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.Preconditions;
import io.sentry.protocol.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpj {
    public static zzjv zza(Object obj) throws JSONException {
        String string;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            string = jSONObject.getString("name");
            jSONArray = jSONObject.getJSONArray(Message.JsonKeys.PARAMS);
            jSONArray2 = jSONObject.getJSONArray("instructions");
        } else {
            if (!(obj instanceof JSONArray)) {
                throw new IllegalArgumentException("invalid JSON in runtime section");
            }
            JSONArray jSONArray3 = (JSONArray) obj;
            Preconditions.checkArgument(jSONArray3.length() >= 3);
            string = jSONArray3.getString(1);
            JSONArray jSONArray4 = jSONArray3.getJSONArray(2);
            jSONArray = new JSONArray();
            for (int i2 = 1; i2 < jSONArray4.length(); i2++) {
                Preconditions.checkArgument(jSONArray4.get(i2) instanceof String);
                jSONArray.put(jSONArray4.get(i2));
            }
            jSONArray2 = new JSONArray();
            for (int i3 = 3; i3 < jSONArray3.length(); i3++) {
                jSONArray2.put(jSONArray3.get(i3));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            arrayList.add(jSONArray.getString(i4));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
            JSONArray jSONArray5 = jSONArray2.getJSONArray(i5);
            if (jSONArray5.length() != 0) {
                arrayList2.add(zze(jSONArray5));
            }
        }
        return new zzjv(null, string, arrayList, arrayList2);
    }

    static zzqp zzb(JSONArray jSONArray, List list, List list2) throws JSONException, zzpi {
        zzqn zzqnVar = new zzqn();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
            int i3 = 1;
            if (jSONArray2.getString(0).equals("if")) {
                while (i3 < jSONArray2.length()) {
                    zzqnVar.zzc((zzqm) list2.get(jSONArray2.getInt(i3)));
                    i3++;
                }
            } else if (jSONArray2.getString(0).equals("unless")) {
                while (i3 < jSONArray2.length()) {
                    zzqnVar.zzb((zzqm) list2.get(jSONArray2.getInt(i3)));
                    i3++;
                }
            } else if (jSONArray2.getString(0).equals(ProductAction.ACTION_ADD)) {
                while (i3 < jSONArray2.length()) {
                    zzqnVar.zza((zzqm) list.get(jSONArray2.getInt(i3)));
                    i3++;
                }
            } else if (jSONArray2.getString(0).equals("block")) {
                while (i3 < jSONArray2.length()) {
                    zzqnVar.zzd((zzqm) list.get(jSONArray2.getInt(i3)));
                    i3++;
                }
            } else {
                zzf("Unknown Rule property: ".concat(String.valueOf(jSONArray2.getString(0))));
            }
        }
        return zzqnVar.zze();
    }

    static zzqt zzc(Object obj, List list) throws JSONException, zzpi {
        if (!(obj instanceof JSONArray)) {
            if (obj instanceof Boolean) {
                return new zzqt(8, obj);
            }
            if (obj instanceof Integer) {
                return new zzqt(6, obj);
            }
            if (obj instanceof String) {
                return new zzqt(1, obj);
            }
            zzf("Invalid value type: ".concat(String.valueOf(String.valueOf(obj))));
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        String string = jSONArray.getString(0);
        if (string.equals("escape")) {
            zzqt zzqtVarZzc = zzc(jSONArray.get(1), list);
            for (int i2 = 2; i2 < jSONArray.length(); i2++) {
                zzqtVarZzc.zza(jSONArray.getInt(i2));
            }
            return zzqtVarZzc;
        }
        if (string.equals("list")) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 1; i3 < jSONArray.length(); i3++) {
                arrayList.add(zzc(jSONArray.get(i3), list).zzc());
            }
            zzqt zzqtVar = new zzqt(2, arrayList);
            zzqtVar.zzb(true);
            return zzqtVar;
        }
        if (string.equals("map")) {
            HashMap map = new HashMap();
            for (int i4 = 1; i4 < jSONArray.length(); i4 += 2) {
                map.put(zzc(jSONArray.get(i4), list).zzc(), zzc(jSONArray.get(i4 + 1), list).zzc());
            }
            zzqt zzqtVar2 = new zzqt(3, map);
            zzqtVar2.zzb(true);
            return zzqtVar2;
        }
        if (string.equals("macro")) {
            zzqt zzqtVar3 = new zzqt(4, list.get(jSONArray.getInt(1)));
            zzqtVar3.zzb(true);
            return zzqtVar3;
        }
        if (!string.equals("template")) {
            zzf("Invalid value type: ".concat(String.valueOf(String.valueOf(obj))));
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 1; i5 < jSONArray.length(); i5++) {
            arrayList2.add(zzc(jSONArray.get(i5), list).zzc());
        }
        zzqt zzqtVar4 = new zzqt(7, arrayList2);
        zzqtVar4.zzb(true);
        return zzqtVar4;
    }

    static List zzd(JSONArray jSONArray, List list) throws JSONException, zzpi {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            zzqk zzqkVar = new zzqk();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                zzqv zzqvVarZzc = zzc(jSONObject.get(next), list).zzc();
                if ("push_after_evaluate".equals(next)) {
                    zzqkVar.zzb(zzqvVarZzc);
                } else {
                    zzqkVar.zza(next, zzqvVarZzc);
                }
            }
            arrayList.add(zzqkVar.zzc());
        }
        return arrayList;
    }

    private static zzri zze(JSONArray jSONArray) throws JSONException {
        Preconditions.checkArgument(jSONArray.length() > 0);
        String string = jSONArray.getString(0);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() != 0) {
                    arrayList.add(zze(jSONArray2));
                }
            } else if (obj == JSONObject.NULL) {
                arrayList.add(zzrd.zzd);
            } else {
                arrayList.add(zzrl.zzb(obj));
            }
        }
        return new zzri(string, arrayList);
    }

    private static void zzf(String str) throws zzpi {
        zzho.zza(str);
        throw new zzpi(str);
    }
}
