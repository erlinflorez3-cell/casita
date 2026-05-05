package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfu;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class zzfu<M extends zzfu<M>> extends zzfz {
    protected zzfw zzrj;

    @Override // com.google.android.gms.internal.clearcut.zzfz
    public void zza(zzfs zzfsVar) throws IOException {
        if (this.zzrj == null) {
            return;
        }
        for (int i2 = 0; i2 < this.zzrj.size(); i2++) {
            this.zzrj.zzaq(i2).zza(zzfsVar);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz
    protected int zzen() {
        if (this.zzrj != null) {
            for (int i2 = 0; i2 < this.zzrj.size(); i2++) {
                this.zzrj.zzaq(i2).zzen();
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzeo, reason: merged with bridge method [inline-methods] */
    public M clone() throws CloneNotSupportedException {
        M m2 = (M) super.clone();
        zzfy.zza(this, m2);
        return m2;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzep */
    public /* synthetic */ zzfz clone() throws CloneNotSupportedException {
        return (zzfu) clone();
    }
}
