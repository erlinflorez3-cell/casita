package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
final class zzab extends zzz<Bundle> {
    zzab(int i2, int i3, Bundle bundle) {
        super(i2, 1, bundle);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.iid.zzz
    final void zzh(Bundle bundle) {
        Object bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bundle2);
            new StringBuilder(String.valueOf(strValueOf).length() + 16 + String.valueOf(strValueOf2).length()).append("Finishing ").append(strValueOf).append(" with ").append(strValueOf2).toString();
        }
        this.zzcq.setResult((T) bundle2);
    }

    @Override // com.google.android.gms.iid.zzz
    final boolean zzw() {
        return false;
    }
}
