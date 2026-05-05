package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzje;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes8.dex */
final class zzah {
    private final EnumMap<zzje.zza, zzak> zza;

    zzah() {
        this.zza = new EnumMap<>(zzje.zza.class);
    }

    private zzah(EnumMap<zzje.zza, zzak> enumMap) {
        EnumMap<zzje.zza, zzak> enumMap2 = new EnumMap<>(zzje.zza.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static zzah zza(String str) {
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        if (str.length() >= zzje.zza.values().length) {
            int i2 = 0;
            if (str.charAt(0) == '1') {
                zzje.zza[] zzaVarArrValues = zzje.zza.values();
                int length = zzaVarArrValues.length;
                int i3 = 1;
                while (i2 < length) {
                    enumMap.put(zzaVarArrValues[i2], zzak.zza(str.charAt(i3)));
                    i2++;
                    i3++;
                }
                return new zzah(enumMap);
            }
        }
        return new zzah();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (zzje.zza zzaVar : zzje.zza.values()) {
            zzak zzakVar = this.zza.get(zzaVar);
            if (zzakVar == null) {
                zzakVar = zzak.UNSET;
            }
            sb.append(zzakVar.zzl);
        }
        return sb.toString();
    }

    public final zzak zza(zzje.zza zzaVar) {
        zzak zzakVar = this.zza.get(zzaVar);
        return zzakVar == null ? zzak.UNSET : zzakVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.measurement.internal.zzje.zza r3, int r4) {
        /*
            r2 = this;
            com.google.android.gms.measurement.internal.zzak r1 = com.google.android.gms.measurement.internal.zzak.UNSET
            r0 = -30
            if (r4 == r0) goto L23
            r0 = -20
            if (r4 == r0) goto L20
            r0 = -10
            if (r4 == r0) goto L1d
            if (r4 == 0) goto L20
            r0 = 30
            if (r4 == r0) goto L1a
        L14:
            java.util.EnumMap<com.google.android.gms.measurement.internal.zzje$zza, com.google.android.gms.measurement.internal.zzak> r0 = r2.zza
            r0.put(r3, r1)
            return
        L1a:
            com.google.android.gms.measurement.internal.zzak r1 = com.google.android.gms.measurement.internal.zzak.INITIALIZATION
            goto L14
        L1d:
            com.google.android.gms.measurement.internal.zzak r1 = com.google.android.gms.measurement.internal.zzak.MANIFEST
            goto L14
        L20:
            com.google.android.gms.measurement.internal.zzak r1 = com.google.android.gms.measurement.internal.zzak.API
            goto L14
        L23:
            com.google.android.gms.measurement.internal.zzak r1 = com.google.android.gms.measurement.internal.zzak.TCF
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzah.zza(com.google.android.gms.measurement.internal.zzje$zza, int):void");
    }

    public final void zza(zzje.zza zzaVar, zzak zzakVar) {
        this.zza.put(zzaVar, zzakVar);
    }
}
