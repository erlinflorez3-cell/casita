package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmq extends zzjy {
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
        Matcher matcher = Pattern.compile(length < 2 ? "" : zzjx.zzd(zzqzVarArr[1])).matcher(((zzrk) zzqzVarArr[0]).zzk());
        if (!matcher.find()) {
            return zzrd.zzd;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzrk(matcher.group()));
        return new zzrg(arrayList);
    }
}
