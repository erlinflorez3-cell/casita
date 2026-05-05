package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzms extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        boolean z2;
        Preconditions.checkArgument(true);
        int length = zzqzVarArr.length;
        if (length == 1) {
            z2 = true;
        } else if (length == 2) {
            z2 = true;
            length = 2;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        return Pattern.compile(length < 2 ? "" : zzjx.zzd(zzqzVarArr[1])).matcher(((zzrk) zzqzVarArr[0]).zzk()).find() ? new zzrb(Double.valueOf(r1.start())) : new zzrb(Double.valueOf(-1.0d));
    }
}
