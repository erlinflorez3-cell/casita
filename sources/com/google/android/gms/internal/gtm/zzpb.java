package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpb extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        boolean z2;
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        if (length == 2) {
            z2 = true;
        } else if (length == 3) {
            z2 = true;
            length = 3;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        String strZzd = zzjx.zzd(zzqzVarArr[0]);
        String strZzd2 = zzjx.zzd(zzqzVarArr[1]);
        int i2 = 64;
        if (length >= 3 && "true".equalsIgnoreCase(zzjx.zzd(zzqzVarArr[2]))) {
            i2 = 66;
        }
        try {
            return new zzra(Boolean.valueOf(Pattern.compile(strZzd2, i2).matcher(strZzd).find()));
        } catch (PatternSyntaxException unused) {
            return new zzra(false);
        }
    }
}
