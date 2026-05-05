package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class TokenStatus extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenStatus> CREATOR = new zzbn();
    final zzbl zza;
    final int zzb;
    final boolean zzc;
    final zzbl zzd;

    TokenStatus(zzbl zzblVar, int i2, boolean z2, zzbl zzblVar2) {
        this.zza = zzblVar;
        this.zzb = i2;
        this.zzc = z2;
        this.zzd = zzblVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenStatus) {
            TokenStatus tokenStatus = (TokenStatus) obj;
            if (Objects.equal(this.zza, tokenStatus.zza) && this.zzb == tokenStatus.zzb && this.zzc == tokenStatus.zzc && Objects.equal(this.zzd, tokenStatus.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("tokenReference", this.zza).add("tokenState", Integer.valueOf(this.zzb)).add("isSelected", Boolean.valueOf(this.zzc)).add("auxiliaryTokenReference", this.zzd).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i2, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
