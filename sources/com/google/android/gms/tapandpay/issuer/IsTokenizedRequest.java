package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public class IsTokenizedRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsTokenizedRequest> CREATOR = new zzj();
    final String zza;
    final int zzb;
    final int zzc;
    final String zzd;
    final String zze;

    public static class Builder {
        String zza;
        private String zzb;
        private int zzc;
        private int zzd;
        private String zze;

        public IsTokenizedRequest build() {
            return new IsTokenizedRequest(this.zzb, this.zzc, this.zzd, this.zze, this.zza);
        }

        public Builder setIdentifier(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setIssuerName(String str) {
            this.zze = str;
            return this;
        }

        public Builder setNetwork(int i2) {
            this.zzc = i2;
            return this;
        }

        public Builder setTokenServiceProvider(int i2) {
            this.zzd = i2;
            return this;
        }

        public Builder setWalletId(String str) {
            this.zza = str;
            return this;
        }
    }

    IsTokenizedRequest(String str, int i2, int i3, String str2, String str3) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = str2;
        this.zze = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
