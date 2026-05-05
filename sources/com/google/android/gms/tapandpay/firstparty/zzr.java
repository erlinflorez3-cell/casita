package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    final CardInfo[] zza;
    final AccountInfo zzb;
    final String zzc;
    final String zzd;
    final SparseArray zze;
    final byte[] zzf;

    public zzr(CardInfo[] cardInfoArr, AccountInfo accountInfo, String str, String str2, SparseArray sparseArray, byte[] bArr) {
        this.zza = cardInfoArr;
        this.zzb = accountInfo;
        this.zzc = str;
        this.zzd = str2;
        this.zze = sparseArray;
        this.zzf = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zza, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i2, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeStringSparseArray(parcel, 6, this.zze, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
