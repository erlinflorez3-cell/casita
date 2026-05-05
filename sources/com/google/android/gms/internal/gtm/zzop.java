package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzop extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        zzqz zzqzVar;
        zzrd zzrdVar;
        zzqz zzqzVar2;
        int i2 = 1;
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        Preconditions.checkArgument(length >= 2);
        zzqz zzqzVar3 = zzqzVarArr[0];
        zzrd zzrdVar2 = zzrd.zze;
        if (zzqzVar3 == zzrdVar2 || zzqzVarArr[1] == zzrdVar2) {
            return zzrdVar2;
        }
        String strZzd = zzjx.zzd(zzqzVar3);
        String strZzd2 = zzjx.zzd(zzqzVarArr[1]);
        int i3 = 64;
        if (length > 2 && (zzqzVar2 = zzqzVarArr[2]) != zzrd.zze && zzjx.zzg(zzqzVar2)) {
            i3 = 66;
        }
        if (length > 3 && (zzqzVar = zzqzVarArr[3]) != (zzrdVar = zzrd.zze)) {
            if (!(zzqzVar instanceof zzrb)) {
                return zzrdVar;
            }
            double dZza = zzjx.zza(zzqzVar);
            if (Double.isInfinite(dZza) || dZza < 0.0d) {
                return zzrd.zze;
            }
            i2 = (int) dZza;
        }
        try {
            Matcher matcher = Pattern.compile(strZzd2, i3).matcher(strZzd);
            String strGroup = null;
            if (matcher.find() && matcher.groupCount() >= i2) {
                strGroup = matcher.group(i2);
            }
            return strGroup == null ? zzrd.zze : new zzrk(strGroup);
        } catch (PatternSyntaxException unused) {
            return zzrd.zze;
        }
    }
}
