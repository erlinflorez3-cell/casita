package com.google.android.gms.internal.gtm;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzju {
    public static final /* synthetic */ int zza = 0;
    private static final Map zzb;

    static {
        HashMap map = new HashMap();
        map.put(zza.CONTAINS.toString(), new zzjt("contains"));
        map.put(zza.ENDS_WITH.toString(), new zzjt("endsWith"));
        map.put(zza.EQUALS.toString(), new zzjt("equals"));
        map.put(zza.GREATER_EQUALS.toString(), new zzjt("greaterEquals"));
        map.put(zza.GREATER_THAN.toString(), new zzjt("greaterThan"));
        map.put(zza.LESS_EQUALS.toString(), new zzjt("lessEquals"));
        map.put(zza.LESS_THAN.toString(), new zzjt("lessThan"));
        map.put(zza.REGEX.toString(), new zzjt("regex", new String[]{zzb.ARG0.toString(), zzb.ARG1.toString(), zzb.IGNORE_CASE.toString()}));
        map.put(zza.STARTS_WITH.toString(), new zzjt("startsWith"));
        zzb = map;
    }

    public static zzri zza(String str, Map map, zzie zzieVar) {
        Map map2 = zzb;
        if (!map2.containsKey(str)) {
            throw new RuntimeException("Fail to convert " + str + " to the internal representation");
        }
        zzjt zzjtVar = (zzjt) map2.get(str);
        String[] strArrZzb = zzjtVar.zzb();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArrZzb.length; i2++) {
            if (map.containsKey(strArrZzb[i2])) {
                arrayList.add((zzqz) map.get(strArrZzb[i2]));
            } else {
                arrayList.add(zzrd.zze);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new zzrk("gtmUtils"));
        zzri zzriVar = new zzri("15", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(zzriVar);
        arrayList3.add(new zzrk("mobile"));
        zzri zzriVar2 = new zzri("17", arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(zzriVar2);
        arrayList4.add(new zzrk(zzjtVar.zza()));
        arrayList4.add(new zzrg(arrayList));
        return new zzri(ExifInterface.GPS_MEASUREMENT_2D, arrayList4);
    }

    public static String zzb(String str) {
        Map map = zzb;
        if (map.containsKey(str)) {
            return ((zzjt) map.get(str)).zza();
        }
        return null;
    }
}
