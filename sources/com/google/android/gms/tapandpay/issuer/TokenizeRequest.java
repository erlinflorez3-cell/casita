package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public class TokenizeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenizeRequest> CREATOR = new zzz();
    final int zza;
    final String zzb;
    final String zzc;
    final int zzd;
    final String zze;

    public static class Builder {
        private int zza;
        private String zzb;
        private String zzc;
        private int zzd;
        private String zze;

        public TokenizeRequest build() {
            return new TokenizeRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public Builder setCardDisplayName(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setCardNetwork(int i2) {
            this.zzd = i2;
            return this;
        }

        public Builder setIssuerTokenId(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setTokenServiceProvider(int i2) {
            this.zza = i2;
            return this;
        }

        public Builder setWalletId(String str) {
            this.zze = str;
            return this;
        }
    }

    TokenizeRequest(int i2, String str, String str2, int i3, String str3) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i3;
        this.zze = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
