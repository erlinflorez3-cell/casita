package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmu extends zzjy {
    @Override // com.google.android.gms.internal.gtm.zzjy
    protected final zzqz zza(zzie zzieVar, zzqz... zzqzVarArr) {
        boolean z2;
        Preconditions.checkArgument(true);
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
        Preconditions.checkArgument(zzqzVarArr[0] instanceof zzrk);
        ArrayList arrayList = new ArrayList();
        if (length == 1) {
            arrayList.add(zzqzVarArr[0]);
        } else {
            String strZzk = ((zzrk) zzqzVarArr[0]).zzk();
            String strZzd = zzjx.zzd(zzqzVarArr[1]);
            boolean zIsEmpty = strZzd.isEmpty();
            String[] strArrSplit = strZzk.split(strZzd, true != zIsEmpty ? -1 : 0);
            for (int i2 = (zIsEmpty && strArrSplit.length > 0 && strArrSplit[0].isEmpty()) ? 1 : 0; i2 < strArrSplit.length; i2++) {
                arrayList.add(new zzrk(strArrSplit[i2]));
            }
        }
        return new zzrg(arrayList);
    }
}
