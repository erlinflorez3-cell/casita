package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public class RequestSelectTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RequestSelectTokenRequest> CREATOR = new zzt();
    final int zza;
    final String zzb;
    final String zzc;

    public static class Builder {
        private int zza;
        private String zzb;
        private String zzc;

        public RequestSelectTokenRequest build() {
            return new RequestSelectTokenRequest(this.zza, this.zzb, this.zzc);
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
            this.zzc = str;
            return this;
        }
    }

    RequestSelectTokenRequest(int i2, String str, String str2) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
