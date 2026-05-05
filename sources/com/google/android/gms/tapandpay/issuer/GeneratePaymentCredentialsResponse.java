package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public class GeneratePaymentCredentialsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeneratePaymentCredentialsResponse> CREATOR = new zze();
    final byte[] zza;
    final byte[] zzb;
    final byte[] zzc;

    public static class Builder {
        byte[] zza;
        byte[] zzb;
        byte[] zzc;

        public GeneratePaymentCredentialsResponse build() {
            return new GeneratePaymentCredentialsResponse(this.zza, this.zzb, this.zzc);
        }

        public Builder setAuxiliaryOpaquePaymentCard(byte[] bArr) {
            this.zzc = bArr;
            return this;
        }

        public Builder setGoogleOpaquePaymentCard(byte[] bArr) {
            this.zzb = bArr;
            return this;
        }

        public Builder setOpaquePaymentCard(byte[] bArr) {
            this.zza = bArr;
            return this;
        }
    }

    GeneratePaymentCredentialsResponse(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.zza = bArr;
        this.zzb = bArr2;
        this.zzc = bArr3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        byte[] bArr = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, bArr, false);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
