package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzrl {
    public static Bundle zza(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof zzrk) {
                bundle.putString((String) entry.getKey(), ((zzrk) entry.getValue()).zzk());
            } else if (entry.getValue() instanceof zzra) {
                bundle.putBoolean((String) entry.getKey(), ((zzra) entry.getValue()).zzi().booleanValue());
            } else if (entry.getValue() instanceof zzrb) {
                bundle.putDouble((String) entry.getKey(), ((zzrb) entry.getValue()).zzi().doubleValue());
            } else {
                if (!(entry.getValue() instanceof zzrh)) {
                    throw new IllegalArgumentException(String.format("Invalid param type for key '%s'. Only boolean, double and string types and maps of thereof are supported.", entry.getKey()));
                }
                bundle.putBundle((String) entry.getKey(), zza(((zzrh) entry.getValue()).zza));
            }
        }
        return bundle;
    }

    public static zzqz zzb(Object obj) {
        if (obj == null) {
            return zzrd.zzd;
        }
        if (obj instanceof zzqz) {
            return (zzqz) obj;
        }
        if (obj instanceof Boolean) {
            return new zzra((Boolean) obj);
        }
        if (obj instanceof Short) {
            return new zzrb(Double.valueOf(((Short) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzrb(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Long) {
            return new zzrb(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new zzrb(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new zzrb((Double) obj);
        }
        if (!(obj instanceof Byte) && !(obj instanceof Character)) {
            if (obj instanceof String) {
                return new zzrk((String) obj);
            }
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(zzb(it.next()));
                }
                return new zzrg(arrayList);
            }
            if (obj instanceof Map) {
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Preconditions.checkArgument(entry.getKey() instanceof String);
                    map.put((String) entry.getKey(), zzb(entry.getValue()));
                }
                return new zzrh(map);
            }
            if (!(obj instanceof Bundle)) {
                throw new UnsupportedOperationException("Type not supported: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
            }
            HashMap map2 = new HashMap();
            Bundle bundle = (Bundle) obj;
            for (String str : bundle.keySet()) {
                map2.put(str, zzb(bundle.get(str)));
            }
            return new zzrh(map2);
        }
        return new zzrk(obj.toString());
    }

    public static zzqz zzc(zzie zzieVar, zzqz zzqzVar) {
        Preconditions.checkNotNull(zzqzVar);
        if (!zzj(zzqzVar) && !(zzqzVar instanceof zzrc) && !(zzqzVar instanceof zzrg) && !(zzqzVar instanceof zzrh)) {
            if (!(zzqzVar instanceof zzri)) {
                throw new UnsupportedOperationException("Attempting to evaluate unknown type");
            }
            zzqzVar = zzd(zzieVar, (zzri) zzqzVar);
        }
        if (zzqzVar == null) {
            throw new IllegalArgumentException("AbstractType evaluated to Java null");
        }
        if (zzqzVar instanceof zzri) {
            throw new IllegalArgumentException("AbstractType evaluated to illegal type Statement.");
        }
        return zzqzVar;
    }

    public static zzqz zzd(zzie zzieVar, zzri zzriVar) {
        String strZzi = zzriVar.zzi();
        List listZzj = zzriVar.zzj();
        zzqz zzqzVarZzb = zzieVar.zzb(strZzi);
        if (zzqzVarZzb == null) {
            throw new UnsupportedOperationException("Function '" + strZzi + "' is not supported");
        }
        if (zzqzVarZzb instanceof zzrc) {
            return ((zzrc) zzqzVarZzb).zzi().zzd(zzieVar, (zzqz[]) listZzj.toArray(new zzqz[listZzj.size()]));
        }
        throw new UnsupportedOperationException("Function '" + strZzi + "' is not a function");
    }

    public static zzqz zze(zzqz zzqzVar) {
        if (!(zzqzVar instanceof zzrh)) {
            return zzqzVar;
        }
        HashSet hashSet = new HashSet();
        Map map = ((zzrh) zzqzVar).zza;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == zzrd.zze) {
                hashSet.add((String) entry.getKey());
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
        return zzqzVar;
    }

    public static zzrd zzf(zzie zzieVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzqz zzqzVar = (zzqz) it.next();
            Preconditions.checkArgument(zzqzVar instanceof zzri);
            zzqz zzqzVarZzc = zzc(zzieVar, zzqzVar);
            if (zzi(zzqzVarZzc)) {
                return (zzrd) zzqzVarZzc;
            }
        }
        return zzrd.zze;
    }

    public static Object zzg(zzqz zzqzVar) {
        if (zzqzVar == null || zzqzVar == zzrd.zzd) {
            return null;
        }
        if (zzqzVar instanceof zzra) {
            return ((zzra) zzqzVar).zzi();
        }
        if (zzqzVar instanceof zzrb) {
            zzrb zzrbVar = (zzrb) zzqzVar;
            double dDoubleValue = zzrbVar.zzi().doubleValue();
            return (Double.isInfinite(dDoubleValue) || dDoubleValue - Math.floor(dDoubleValue) >= 1.0E-5d) ? zzrbVar.zzi().toString() : Integer.valueOf((int) dDoubleValue);
        }
        if (zzqzVar instanceof zzrk) {
            return ((zzrk) zzqzVar).zzk();
        }
        if (zzqzVar instanceof zzrg) {
            ArrayList arrayList = new ArrayList();
            for (zzqz zzqzVar2 : ((zzrg) zzqzVar).zzk()) {
                Object objZzg = zzg(zzqzVar2);
                if (objZzg == null) {
                    zzho.zza(String.format("Failure to convert a list element to object: %s (%s)", zzqzVar2, zzqzVar2.getClass().getCanonicalName()));
                    return null;
                }
                arrayList.add(objZzg);
            }
            return arrayList;
        }
        if (!(zzqzVar instanceof zzrh)) {
            zzho.zza("Converting to Object from unknown abstract type: ".concat(String.valueOf(String.valueOf(zzqzVar.getClass()))));
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry entry : ((zzrh) zzqzVar).zza.entrySet()) {
            Object objZzg2 = zzg((zzqz) entry.getValue());
            if (objZzg2 == null) {
                zzho.zza(String.format("Failure to convert a map's value to object: %s (%s)", entry.getValue(), ((zzqz) entry.getValue()).getClass().getCanonicalName()));
                return null;
            }
            map.put((String) entry.getKey(), objZzg2);
        }
        return map;
    }

    public static Map zzh(Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                map.put(str, zzh((Bundle) obj));
            } else if (obj instanceof List) {
                map.put(str, zzk((List) obj));
            } else {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static boolean zzi(zzqz zzqzVar) {
        if (zzqzVar == zzrd.zzc || zzqzVar == zzrd.zzb) {
            return true;
        }
        return (zzqzVar instanceof zzrd) && ((zzrd) zzqzVar).zzj();
    }

    public static boolean zzj(zzqz zzqzVar) {
        return (zzqzVar instanceof zzra) || (zzqzVar instanceof zzrb) || (zzqzVar instanceof zzrk) || zzqzVar == zzrd.zzd || zzqzVar == zzrd.zze;
    }

    private static List zzk(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Bundle) {
                arrayList.add(zzh((Bundle) obj));
            } else if (obj instanceof List) {
                arrayList.add(zzk((List) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
