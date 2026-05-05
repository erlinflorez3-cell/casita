package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes8.dex */
public final class zzje {
    public static final zzje zza = new zzje(null, null, 100);
    private final EnumMap<zza, zzjh> zzb;
    private final int zzc;

    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    public zzje(Boolean bool, Boolean bool2, int i2) {
        EnumMap<zza, zzjh> enumMap = new EnumMap<>(zza.class);
        this.zzb = enumMap;
        enumMap.put(zza.AD_STORAGE, zza((Boolean) null));
        enumMap.put(zza.ANALYTICS_STORAGE, zza((Boolean) null));
        this.zzc = i2;
    }

    private zzje(EnumMap<zza, zzjh> enumMap, int i2) {
        EnumMap<zza, zzjh> enumMap2 = new EnumMap<>(zza.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i2;
    }

    static char zza(zzjh zzjhVar) {
        if (zzjhVar == null) {
            return Soundex.SILENT_MARKER;
        }
        int iOrdinal = zzjhVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal == 2) {
            return '0';
        }
        if (iOrdinal != 3) {
            return Soundex.SILENT_MARKER;
        }
        return '1';
    }

    public static zzje zza(Bundle bundle, int i2) {
        if (bundle == null) {
            return new zzje(null, null, i2);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            enumMap.put(zzaVar, zza(bundle.getString(zzaVar.zze)));
        }
        return new zzje(enumMap, i2);
    }

    public static zzje zza(zzjh zzjhVar, zzjh zzjhVar2, int i2) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put(zza.AD_STORAGE, zzjhVar);
        enumMap.put(zza.ANALYTICS_STORAGE, zzjhVar2);
        return new zzje(enumMap, -10);
    }

    public static zzje zza(String str, int i2) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] zzaVarArrZza = zzjg.STORAGE.zza();
        for (int i3 = 0; i3 < zzaVarArrZza.length; i3++) {
            zza zzaVar = zzaVarArrZza[i3];
            int i4 = i3 + 2;
            if (i4 < str.length()) {
                enumMap.put(zzaVar, zza(str.charAt(i4)));
            } else {
                enumMap.put(zzaVar, zzjh.UNINITIALIZED);
            }
        }
        return new zzje(enumMap, i2);
    }

    static zzjh zza(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? zzjh.UNINITIALIZED : zzjh.GRANTED : zzjh.DENIED : zzjh.POLICY;
    }

    static zzjh zza(Boolean bool) {
        return bool == null ? zzjh.UNINITIALIZED : bool.booleanValue() ? zzjh.GRANTED : zzjh.DENIED;
    }

    static zzjh zza(String str) {
        return str == null ? zzjh.UNINITIALIZED : str.equals("granted") ? zzjh.GRANTED : str.equals("denied") ? zzjh.DENIED : zzjh.UNINITIALIZED;
    }

    static String zza(int i2) {
        return i2 != -30 ? i2 != -20 ? i2 != -10 ? i2 != 0 ? i2 != 30 ? i2 != 90 ? i2 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static String zza(Bundle bundle) {
        String string;
        zza[] zzaVarArr = zzjg.STORAGE.zzd;
        int length = zzaVarArr.length;
        int i2 = 0;
        while (true) {
            Boolean bool = null;
            if (i2 >= length) {
                return null;
            }
            zza zzaVar = zzaVarArr[i2];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string != null) {
                    if (string.equals("granted")) {
                        bool = Boolean.TRUE;
                    } else if (string.equals("denied")) {
                        bool = Boolean.FALSE;
                    }
                }
                if (bool == null) {
                    return string;
                }
            }
            i2++;
        }
    }

    public static boolean zza(int i2, int i3) {
        if (i2 == -20 && i3 == -30) {
            return true;
        }
        return (i2 == -30 && i3 == -20) || i2 == i3 || i2 < i3;
    }

    public static zzje zzb(String str) {
        return zza(str, 100);
    }

    static String zzb(zzjh zzjhVar) {
        int iOrdinal = zzjhVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzje)) {
            return false;
        }
        zzje zzjeVar = (zzje) obj;
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            if (this.zzb.get(zzaVar) != zzjeVar.zzb.get(zzaVar)) {
                return false;
            }
        }
        return this.zzc == zzjeVar.zzc;
    }

    public final int hashCode() {
        int iHashCode = this.zzc * 17;
        Iterator<zzjh> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder("source=").append(zza(this.zzc));
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            sbAppend.append(",");
            sbAppend.append(zzaVar.zze);
            sbAppend.append("=");
            zzjh zzjhVar = this.zzb.get(zzaVar);
            if (zzjhVar == null) {
                zzjhVar = zzjh.UNINITIALIZED;
            }
            sbAppend.append(zzjhVar);
        }
        return sbAppend.toString();
    }

    public final int zza() {
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzje zza(com.google.android.gms.measurement.internal.zzje r9) {
        /*
            r8 = this;
            java.util.EnumMap r5 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzje$zza> r0 = com.google.android.gms.measurement.internal.zzje.zza.class
            r5.<init>(r0)
            com.google.android.gms.measurement.internal.zzjg r0 = com.google.android.gms.measurement.internal.zzjg.STORAGE
            com.google.android.gms.measurement.internal.zzje$zza[] r7 = com.google.android.gms.measurement.internal.zzjg.zza(r0)
            int r6 = r7.length
            r4 = 0
        Lf:
            if (r4 >= r6) goto L53
            r3 = r7[r4]
            java.util.EnumMap<com.google.android.gms.measurement.internal.zzje$zza, com.google.android.gms.measurement.internal.zzjh> r0 = r8.zzb
            java.lang.Object r2 = r0.get(r3)
            com.google.android.gms.measurement.internal.zzjh r2 = (com.google.android.gms.measurement.internal.zzjh) r2
            java.util.EnumMap<com.google.android.gms.measurement.internal.zzje$zza, com.google.android.gms.measurement.internal.zzjh> r0 = r9.zzb
            java.lang.Object r1 = r0.get(r3)
            com.google.android.gms.measurement.internal.zzjh r1 = (com.google.android.gms.measurement.internal.zzjh) r1
            if (r2 != 0) goto L2e
        L25:
            r2 = r1
        L26:
            if (r2 == 0) goto L2b
            r5.put(r3, r2)
        L2b:
            int r4 = r4 + 1
            goto Lf
        L2e:
            if (r1 != 0) goto L31
            goto L26
        L31:
            com.google.android.gms.measurement.internal.zzjh r0 = com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED
            if (r2 != r0) goto L36
            goto L25
        L36:
            com.google.android.gms.measurement.internal.zzjh r0 = com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED
            if (r1 != r0) goto L3b
            goto L26
        L3b:
            com.google.android.gms.measurement.internal.zzjh r0 = com.google.android.gms.measurement.internal.zzjh.POLICY
            if (r2 != r0) goto L40
            goto L25
        L40:
            com.google.android.gms.measurement.internal.zzjh r0 = com.google.android.gms.measurement.internal.zzjh.POLICY
            if (r1 != r0) goto L45
            goto L26
        L45:
            com.google.android.gms.measurement.internal.zzjh r0 = com.google.android.gms.measurement.internal.zzjh.DENIED
            if (r2 == r0) goto L4d
            com.google.android.gms.measurement.internal.zzjh r0 = com.google.android.gms.measurement.internal.zzjh.DENIED
            if (r1 != r0) goto L50
        L4d:
            com.google.android.gms.measurement.internal.zzjh r2 = com.google.android.gms.measurement.internal.zzjh.DENIED
            goto L26
        L50:
            com.google.android.gms.measurement.internal.zzjh r2 = com.google.android.gms.measurement.internal.zzjh.GRANTED
            goto L26
        L53:
            com.google.android.gms.measurement.internal.zzje r1 = new com.google.android.gms.measurement.internal.zzje
            r0 = 100
            r1.<init>(r5, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzje.zza(com.google.android.gms.measurement.internal.zzje):com.google.android.gms.measurement.internal.zzje");
    }

    public final boolean zza(zza zzaVar) {
        return this.zzb.get(zzaVar) != zzjh.DENIED;
    }

    public final boolean zza(zzje zzjeVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            if (!zzjeVar.zza(zzaVar) && zza(zzaVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        Iterator it = this.zzb.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strZzb = zzb((zzjh) entry.getValue());
            if (strZzb != null) {
                bundle.putString(((zza) entry.getKey()).zze, strZzb);
            }
        }
        return bundle;
    }

    public final zzje zzb(zzje zzjeVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzjg.STORAGE.zzd) {
            zzjh zzjhVar = this.zzb.get(zzaVar);
            if (zzjhVar == zzjh.UNINITIALIZED) {
                zzjhVar = zzjeVar.zzb.get(zzaVar);
            }
            if (zzjhVar != null) {
                enumMap.put(zzaVar, zzjhVar);
            }
        }
        return new zzje(enumMap, this.zzc);
    }

    public final boolean zzb(zzje zzjeVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zzjh zzjhVar = this.zzb.get(zzaVar);
            zzjh zzjhVar2 = zzjeVar.zzb.get(zzaVar);
            if (zzjhVar == zzjh.DENIED && zzjhVar2 != zzjh.DENIED) {
                return true;
            }
        }
        return false;
    }

    public final zzjh zzc() {
        zzjh zzjhVar = this.zzb.get(zza.AD_STORAGE);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    public final boolean zzc(zzje zzjeVar) {
        return zzb(zzjeVar, (zza[]) this.zzb.keySet().toArray(new zza[0]));
    }

    public final zzjh zzd() {
        zzjh zzjhVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zze() {
        /*
            r7 = this;
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "G1"
            r6.<init>(r0)
            com.google.android.gms.measurement.internal.zzjg r0 = com.google.android.gms.measurement.internal.zzjg.STORAGE
            com.google.android.gms.measurement.internal.zzje$zza[] r5 = r0.zza()
            int r4 = r5.length
            r3 = 0
        Lf:
            if (r3 >= r4) goto L3a
            r1 = r5[r3]
            java.util.EnumMap<com.google.android.gms.measurement.internal.zzje$zza, com.google.android.gms.measurement.internal.zzjh> r0 = r7.zzb
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.measurement.internal.zzjh r0 = (com.google.android.gms.measurement.internal.zzjh) r0
            r2 = 45
            if (r0 == 0) goto L2e
            int r1 = r0.ordinal()
            if (r1 == 0) goto L2e
            r0 = 1
            if (r1 == r0) goto L37
            r0 = 2
            if (r1 == r0) goto L34
            r0 = 3
            if (r1 == r0) goto L37
        L2e:
            r6.append(r2)
            int r3 = r3 + 1
            goto Lf
        L34:
            r2 = 48
            goto L2e
        L37:
            r2 = 49
            goto L2e
        L3a:
            java.lang.String r0 = r6.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzje.zze():java.lang.String");
    }

    public final String zzf() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzjg.STORAGE.zza()) {
            sb.append(zza(this.zzb.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean zzg() {
        return zza(zza.AD_STORAGE);
    }

    public final boolean zzh() {
        return zza(zza.ANALYTICS_STORAGE);
    }

    public final boolean zzi() {
        Iterator<zzjh> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }
}
