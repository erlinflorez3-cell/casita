package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class SupervisedUserInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SupervisedUserInfo> CREATOR = new zzv();
    final String zza;
    final UserAddress zzb;
    final boolean zzc;

    public static class Builder {
        private String zza;
        private UserAddress zzb;
        private boolean zzc;

        public SupervisedUserInfo build() {
            return new SupervisedUserInfo(this.zza, this.zzb, this.zzc);
        }

        public Builder setParentAddress(UserAddress userAddress) {
            this.zzb = userAddress;
            return this;
        }

        public Builder setSupportsSupervisedDevices(boolean z2) {
            this.zzc = z2;
            return this;
        }

        public Builder setTermsAndConditionsUrl(String str) {
            this.zza = str;
            return this;
        }
    }

    SupervisedUserInfo(String str, UserAddress userAddress, boolean z2) {
        this.zza = str;
        this.zzb = userAddress;
        this.zzc = z2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SupervisedUserInfo) {
            SupervisedUserInfo supervisedUserInfo = (SupervisedUserInfo) obj;
            if (Objects.equal(this.zza, supervisedUserInfo.zza) && Objects.equal(this.zzb, supervisedUserInfo.zzb) && this.zzc == supervisedUserInfo.zzc) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Boolean.valueOf(this.zzc));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("termsAndConditionsUrl", this.zza).add("parentAddress", this.zzb).add("supportsSupervisedDevices", Boolean.valueOf(this.zzc)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i2, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
