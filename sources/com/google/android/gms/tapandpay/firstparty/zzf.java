package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    final String zza;
    final byte[] zzb;
    final int zzc;
    final TokenStatus zzd;
    final String zze;
    final zzbo zzf;

    zzf(String str, byte[] bArr, int i2, TokenStatus tokenStatus, String str2, zzbo zzboVar) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = tokenStatus;
        this.zze = str2;
        this.zzf = zzboVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzf) {
            zzf zzfVar = (zzf) obj;
            if (this.zzc == zzfVar.zzc && Objects.equal(this.zza, zzfVar.zza) && Arrays.equals(this.zzb, zzfVar.zzb) && Objects.equal(this.zzd, zzfVar.zzd) && Objects.equal(this.zze, zzfVar.zze) && Objects.equal(this.zzf, zzfVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf);
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("clientTokenId", this.zza);
        byte[] bArr = this.zzb;
        return toStringHelperAdd.add("serverToken", bArr == null ? null : Arrays.toString(bArr)).add("cardNetwork", Integer.valueOf(this.zzc)).add("tokenStatus", this.zzd).add("tokenLastDigits", this.zze).add("transactionInfo", this.zzf).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i2, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
