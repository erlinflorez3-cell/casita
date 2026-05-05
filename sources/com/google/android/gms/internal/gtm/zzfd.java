package com.google.android.gms.internal.gtm;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfd extends zzbu {
    private static zzfd zza = null;

    public zzfd(zzbx zzbxVar) {
        super(zzbxVar);
    }

    public static zzfd zza() {
        return zza;
    }

    protected static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        boolean z2 = obj instanceof Long;
        String str = Global.HYPHEN;
        if (!z2) {
            return obj instanceof Boolean ? obj.toString() : obj instanceof Throwable ? obj.getClass().getCanonicalName() : Global.HYPHEN;
        }
        Long l2 = (Long) obj;
        if (Math.abs(l2.longValue()) < 100) {
            return obj.toString();
        }
        char cCharAt = obj.toString().charAt(0);
        String strValueOf = String.valueOf(Math.abs(l2.longValue()));
        StringBuilder sb = new StringBuilder();
        if (cCharAt != '-') {
            str = "";
        }
        sb.append(str);
        sb.append(Math.round(Math.pow(10.0d, strValueOf.length() - 1)));
        sb.append("...");
        sb.append(str);
        sb.append(Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d));
        return sb.toString();
    }

    public final void zzb(zzez zzezVar, String str) {
        zzR("Discarding hit. ".concat(str), zzezVar != null ? zzezVar.toString() : "no hit data");
    }

    public final void zzc(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        zzR("Discarding hit. ".concat(str), sb.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        synchronized (zzfd.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i2, String str, Object obj, Object obj2, Object obj3) {
        char c2;
        Preconditions.checkNotNull(str);
        if (zzw().zzb()) {
            zzw();
            c2 = 'C';
        } else {
            zzw();
            c2 = 'c';
        }
        String strSubstring = ExifInterface.GPS_MEASUREMENT_3D + "01VDIWEA?".charAt(i2) + c2 + zzbv.zza + Global.COLON + zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
        if (strSubstring.length() > 1024) {
            strSubstring = strSubstring.substring(0, 1024);
        }
        zzfj zzfjVarZzp = zzt().zzp();
        if (zzfjVarZzp != null) {
            zzfjVarZzp.zze().zzc(strSubstring);
        }
    }
}
