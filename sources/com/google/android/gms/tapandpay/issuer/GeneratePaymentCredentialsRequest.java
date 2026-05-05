package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public class GeneratePaymentCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeneratePaymentCredentialsRequest> CREATOR = new zzd();
    final String zza;
    final String zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;

    public static class Builder {
        private String zza;
        private String zzb;
        private String zzc;
        private String zzd;
        private boolean zze;
        private boolean zzf;

        public GeneratePaymentCredentialsRequest build() {
            return new GeneratePaymentCredentialsRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
        }

        public Builder setAuxiliaryOpaquePaymentCardRequested(boolean z2) {
            this.zzf = z2;
            return this;
        }

        public Builder setGoogleOpaquePaymentCardRequested(boolean z2) {
            this.zze = z2;
            return this;
        }

        public Builder setServerSessionId(String str) {
            this.zzd = str;
            return this;
        }

        public Builder setStableHardwareId(String str) {
            this.zza = str;
            return this;
        }

        public Builder setTokenRequestorId(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setWalletId(String str) {
            this.zzb = str;
            return this;
        }
    }

    GeneratePaymentCredentialsRequest(String str, String str2, String str3, String str4, boolean z2, boolean z3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = z2;
        this.zzf = z3;
    }

    public boolean getAuxiliaryOpaquePaymentCardRequested() {
        return this.zzf;
    }

    public boolean getGoogleOpaquePaymentCardRequested() {
        return this.zze;
    }

    public String getServerSessionId() {
        return this.zzd;
    }

    public String getStableHardwareId() {
        return this.zza;
    }

    public String getTokenRequestorId() {
        return this.zzc;
    }

    public String getWalletId() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
