package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public class ViewTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ViewTokenRequest> CREATOR = new zzab();
    final String zza;
    final int zzb;
    final String zzc;

    public static class Builder {
        private String zza;
        private int zzb;
        private String zzc;

        public ViewTokenRequest build() {
            return new ViewTokenRequest(this.zza, this.zzb, this.zzc);
        }

        public Builder setIssuerTokenId(String str) {
            this.zza = str;
            return this;
        }

        public Builder setTokenServiceProvider(int i2) {
            this.zzb = i2;
            return this;
        }

        public Builder setWalletId(String str) {
            this.zzc = str;
            return this;
        }
    }

    ViewTokenRequest(String str, int i2, String str2) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
