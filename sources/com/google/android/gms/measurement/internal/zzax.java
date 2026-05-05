package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.measurement.internal.zzje;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzax {
    private static final zzax zza = new zzax(null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zzje.zza, zzjh> zzf;

    zzax(Boolean bool, int i2) {
        this((Boolean) null, i2, (Boolean) null, (String) null);
    }

    zzax(Boolean bool, int i2, Boolean bool2, String str) {
        EnumMap<zzje.zza, zzjh> enumMap = new EnumMap<>(zzje.zza.class);
        this.zzf = enumMap;
        enumMap.put(zzje.zza.AD_USER_DATA, zzje.zza(bool));
        this.zzb = i2;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    private zzax(EnumMap<zzje.zza, zzjh> enumMap, int i2, Boolean bool, String str) {
        EnumMap<zzje.zza, zzjh> enumMap2 = new EnumMap<>(zzje.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i2;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    public static zzax zza(Bundle bundle, int i2) {
        if (bundle == null) {
            return new zzax(null, i2);
        }
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            enumMap.put(zzaVar, zzje.zza(bundle.getString(zzaVar.zze)));
        }
        return new zzax((EnumMap<zzje.zza, zzjh>) enumMap, i2, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    static zzax zza(zzjh zzjhVar, int i2) {
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        enumMap.put(zzje.zza.AD_USER_DATA, zzjhVar);
        return new zzax((EnumMap<zzje.zza, zzjh>) enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzax zza(String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] strArrSplit = str.split(Global.COLON);
        int i2 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        zzje.zza[] zzaVarArrZza = zzjg.DMA.zza();
        int length = zzaVarArrZza.length;
        int i3 = 1;
        int i4 = 0;
        while (i4 < length) {
            enumMap.put(zzaVarArrZza[i4], zzje.zza(strArrSplit[i3].charAt(0)));
            i4++;
            i3++;
        }
        return new zzax((EnumMap<zzje.zza, zzjh>) enumMap, i2, (Boolean) null, (String) null);
    }

    public static Boolean zza(Bundle bundle) {
        zzjh zzjhVarZza;
        if (bundle == null || (zzjhVarZza = zzje.zza(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i2 = zzba.zza[zzjhVarZza.ordinal()];
        if (i2 != 3) {
            return i2 != 4 ? null : true;
        }
        return false;
    }

    private final String zzh() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            sb.append(Global.COLON);
            sb.append(zzje.zza(this.zzf.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzax)) {
            return false;
        }
        zzax zzaxVar = (zzax) obj;
        if (this.zzc.equalsIgnoreCase(zzaxVar.zzc) && Objects.equals(this.zzd, zzaxVar.zzd)) {
            return Objects.equals(this.zze, zzaxVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.zzd;
        int i2 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.zze;
        return this.zzc.hashCode() + (i2 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder("source=").append(zzje.zza(this.zzb));
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            sbAppend.append(",");
            sbAppend.append(zzaVar.zze);
            sbAppend.append("=");
            zzjh zzjhVar = this.zzf.get(zzaVar);
            if (zzjhVar == null) {
                sbAppend.append("uninitialized");
            } else {
                int i2 = zzba.zza[zzjhVar.ordinal()];
                if (i2 == 1) {
                    sbAppend.append("uninitialized");
                } else if (i2 == 2) {
                    sbAppend.append("eu_consent_policy");
                } else if (i2 == 3) {
                    sbAppend.append("denied");
                } else if (i2 == 4) {
                    sbAppend.append("granted");
                }
            }
        }
        if (this.zzd != null) {
            sbAppend.append(",isDmaRegion=").append(this.zzd);
        }
        if (this.zze != null) {
            sbAppend.append(",cpsDisplayStr=").append(this.zze);
        }
        return sbAppend.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        Iterator it = this.zzf.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strZzb = zzje.zzb((zzjh) entry.getValue());
            if (strZzb != null) {
                bundle.putString(((zzje.zza) entry.getKey()).zze, strZzb);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final zzjh zzc() {
        zzjh zzjhVar = this.zzf.get(zzje.zza.AD_USER_DATA);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        Iterator<zzjh> it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }
}
