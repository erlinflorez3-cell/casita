package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import io.sentry.ProfilingTraceData;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();
    final boolean zza;
    final boolean zzb;
    final boolean zzc;
    final int zzd;

    public zzaw(boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = z2;
        this.zzb = z3;
        this.zzc = z4;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaw) {
            zzaw zzawVar = (zzaw) obj;
            if (this.zza == zzawVar.zza && this.zzb == zzawVar.zzb && this.zzc == zzawVar.zzc && this.zzd == zzawVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(ProfilingTraceData.JsonKeys.TRANSACTION_LIST, Boolean.valueOf(this.zza)).add("plasticTransactions", Boolean.valueOf(this.zzb)).add("promotions", Boolean.valueOf(this.zzc)).add("bitMask", Integer.valueOf(this.zzd)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
