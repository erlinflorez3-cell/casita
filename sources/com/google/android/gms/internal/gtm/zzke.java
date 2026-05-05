package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzke extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        boolean z2;
        Preconditions.checkNotNull(zzqzVarArr);
        int length = zzqzVarArr.length;
        if (length == 1) {
            z2 = true;
        } else if (length == 2) {
            length = 2;
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrg);
        List<zzqz> listZzk = ((zzrg) zzqzVarArr[0]).zzk();
        zzqz zzqzVar = length < 2 ? zzrd.zze : zzqzVarArr[1];
        String strZzd = zzqzVar == zzrd.zze ? "," : zzjx.zzd(zzqzVar);
        ArrayList arrayList = new ArrayList();
        for (zzqz zzqzVar2 : listZzk) {
            if (zzqzVar2 == zzrd.zzd || zzqzVar2 == zzrd.zze) {
                arrayList.add("");
            } else {
                arrayList.add(zzjx.zzd(zzqzVar2));
            }
        }
        return new zzrk(TextUtils.join(strZzd, arrayList));
    }
}
