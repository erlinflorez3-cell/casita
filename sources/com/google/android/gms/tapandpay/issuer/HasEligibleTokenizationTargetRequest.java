package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public class HasEligibleTokenizationTargetRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HasEligibleTokenizationTargetRequest> CREATOR = new zzi();
    private final String zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;

    public static class Builder {
        private String zza;
        private int zzb;
        private int zzc;
        private String zzd;

        public HasEligibleTokenizationTargetRequest build() {
            return new HasEligibleTokenizationTargetRequest(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public Builder setIdentifier(String str) {
            this.zza = str;
            return this;
        }

        public Builder setIssuerName(String str) {
            this.zzd = str;
            return this;
        }

        public Builder setNetwork(int i2) {
            this.zzb = i2;
            return this;
        }

        public Builder setTokenServiceProvider(int i2) {
            this.zzc = i2;
            return this;
        }
    }

    HasEligibleTokenizationTargetRequest(String str, int i2, int i3, String str2) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
