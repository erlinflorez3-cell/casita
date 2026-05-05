package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    final boolean zza;
    final int zzb;
    final int zzc;
    final int zzd;
    final boolean zze;

    zzaq(boolean z2, int i2, int i3, int i4, boolean z3) {
        this.zza = z2;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = z3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaq) {
            zzaq zzaqVar = (zzaq) obj;
            if (this.zza == zzaqVar.zza && this.zzb == zzaqVar.zzb && this.zzd == zzaqVar.zzd && this.zzc == zzaqVar.zzc && this.zze == zzaqVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Boolean.valueOf(this.zze));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("requireCdcvmPassing", Boolean.valueOf(this.zza)).add("cdcvmExpirationInSecs", Integer.valueOf(this.zzb)).add("unlockedTapLimit", Integer.valueOf(this.zzc)).add("cdcvmTapLimit", Integer.valueOf(this.zzd)).add("prioritizeOnlinePinOverCdcvm", Boolean.valueOf(this.zze)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
