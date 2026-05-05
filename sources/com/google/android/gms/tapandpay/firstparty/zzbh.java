package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();
    final long zza;
    final BigDecimal zzb;
    final String zzc;
    final long zzd;
    final int zze;

    public zzbh(long j2, BigDecimal bigDecimal, String str, long j3, int i2) {
        this.zza = j2;
        this.zzb = bigDecimal;
        this.zzc = str;
        this.zzd = j3;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbh) {
            zzbh zzbhVar = (zzbh) obj;
            if (this.zza == zzbhVar.zza && Objects.equal(this.zzb, zzbhVar.zzb) && Objects.equal(this.zzc, zzbhVar.zzc) && this.zzd == zzbhVar.zzd && this.zze == zzbhVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), this.zzb, this.zzc, Long.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("transactionId", Long.valueOf(this.zza)).add("amount", this.zzb).add(FirebaseAnalytics.Param.CURRENCY, this.zzc).add("transactionTimeMillis", Long.valueOf(this.zzd)).add("type", Integer.valueOf(this.zze)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeBigDecimal(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
