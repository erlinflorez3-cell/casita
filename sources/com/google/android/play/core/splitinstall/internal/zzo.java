package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: loaded from: classes9.dex */
final class zzo extends zzp {
    private final int zza;
    private final long zzb;

    zzo(int i2, long j2) {
        this.zza = i2;
        this.zzb = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzp) {
            zzp zzpVar = (zzp) obj;
            if (this.zza == zzpVar.zza() && this.zzb == zzpVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zza ^ 1000003;
        long j2 = this.zzb;
        return (i2 * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.zza + ", eventTimestamp=" + this.zzb + "}";
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzp
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzp
    public final long zzb() {
        return this.zzb;
    }
}
