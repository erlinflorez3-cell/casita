package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();
    final long zza;
    final String zzb;
    final String zzc;
    final String zzd;
    final String zze;

    zzi(long j2, String str, String str2, String str3, String str4) {
        this.zza = j2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzi) {
            zzi zziVar = (zzi) obj;
            if (Objects.equal(Long.valueOf(this.zza), Long.valueOf(zziVar.zza)) && Objects.equal(this.zzb, zziVar.zzb) && Objects.equal(this.zzc, zziVar.zzc) && Objects.equal(this.zzd, zziVar.zzd) && Objects.equal(this.zze, zziVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("expirationTimestamp", Long.valueOf(this.zza)).add("websiteUrl", this.zzb).add("websiteRedirectText", this.zzc).add("legalDisclaimer", this.zzd).add("summary", this.zze).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
