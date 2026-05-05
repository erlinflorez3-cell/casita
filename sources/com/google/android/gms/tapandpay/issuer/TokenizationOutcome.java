package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class TokenizationOutcome extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenizationOutcome> CREATOR = new zzy();
    final int zza;
    final String zzb;
    final String zzc;
    final String zzd;

    public static class Builder {
        private int zza;
        private String zzb;
        private String zzc;
        private String zzd;

        public TokenizationOutcome build() {
            return new TokenizationOutcome(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public Builder setAuxIssuerTokenId(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setIssuerTokenId(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setTokenStatus(int i2) {
            this.zza = i2;
            return this;
        }

        public Builder setWalletId(String str) {
            this.zzd = str;
            return this;
        }
    }

    TokenizationOutcome(int i2, String str, String str2, String str3) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    public String getAuxIssuerTokenId() {
        return this.zzc;
    }

    public String getIssuerTokenId() {
        return this.zzb;
    }

    public boolean getTokenResult() {
        return this.zza == 0;
    }

    public int getTokenStatus() {
        return this.zza;
    }

    public String getWalletId() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
