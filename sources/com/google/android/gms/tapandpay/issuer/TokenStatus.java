package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class TokenStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenStatus> CREATOR = new zzx();
    final String zza;
    final int zzb;
    final boolean zzc;

    public TokenStatus(String str, int i2, boolean z2) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = z2;
    }

    public int getTokenState() {
        return this.zzb;
    }

    public boolean isSelected() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
