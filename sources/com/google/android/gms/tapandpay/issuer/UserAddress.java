package com.google.android.gms.tapandpay.issuer;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new zzaa();
    String zza;
    String zzb;
    String zzc;
    String zzd;
    String zze;
    String zzf;
    String zzg;
    String zzh;
    String zzi;
    String zzj;
    String zzk;
    String zzl;
    boolean zzm;
    String zzn;
    String zzo;

    public static class Builder {
        private String zza;
        private String zzb;
        private String zzc;
        private String zzd;
        private String zze;
        private String zzf;
        private String zzg;
        private String zzh;

        public UserAddress build() {
            return new UserAddress(this.zza, this.zzb, this.zzc, null, null, null, this.zzd, this.zze, this.zzf, this.zzg, null, this.zzh, false, null, null);
        }

        public Builder setAddress1(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setAddress2(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setAdministrativeArea(String str) {
            this.zzd = str;
            return this;
        }

        public Builder setCountryCode(String str) {
            this.zzf = str;
            return this;
        }

        public Builder setLocality(String str) {
            this.zze = str;
            return this;
        }

        public Builder setName(String str) {
            this.zza = str;
            return this;
        }

        public Builder setPhoneNumber(String str) {
            this.zzh = str;
            return this;
        }

        public Builder setPostalCode(String str) {
            this.zzg = str;
            return this;
        }
    }

    UserAddress() {
    }

    UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z2, String str13, String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = z2;
        this.zzn = str13;
        this.zzo = str14;
    }

    public static UserAddress fromIntent(Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS")) {
            return null;
        }
        return (UserAddress) intent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (obj instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) obj;
            if (Objects.equal(this.zza, userAddress.zza) && Objects.equal(this.zzb, userAddress.zzb) && Objects.equal(this.zzc, userAddress.zzc) && Objects.equal(this.zzd, userAddress.zzd) && Objects.equal(this.zze, userAddress.zze) && Objects.equal(this.zzf, userAddress.zzf) && Objects.equal(this.zzg, userAddress.zzg) && Objects.equal(this.zzh, userAddress.zzh) && Objects.equal(this.zzi, userAddress.zzi) && Objects.equal(this.zzj, userAddress.zzj) && Objects.equal(this.zzk, userAddress.zzk) && Objects.equal(this.zzl, userAddress.zzl) && this.zzm == userAddress.zzm && Objects.equal(this.zzn, userAddress.zzn) && Objects.equal(this.zzo, userAddress.zzo)) {
                return true;
            }
        }
        return false;
    }

    public String getAddress1() {
        return this.zzb;
    }

    public String getAddress2() {
        return this.zzc;
    }

    public String getAddress3() {
        return this.zzd;
    }

    public String getAddress4() {
        return this.zze;
    }

    public String getAddress5() {
        return this.zzf;
    }

    public String getAdministrativeArea() {
        return this.zzg;
    }

    public String getCompanyName() {
        return this.zzn;
    }

    public String getCountryCode() {
        return this.zzi;
    }

    public String getEmailAddress() {
        return this.zzo;
    }

    public String getLocality() {
        return this.zzh;
    }

    public String getName() {
        return this.zza;
    }

    public String getPhoneNumber() {
        return this.zzl;
    }

    public String getPostalCode() {
        return this.zzj;
    }

    public String getSortingCode() {
        return this.zzk;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, Boolean.valueOf(this.zzm), this.zzn, this.zzo);
    }

    public boolean isPostBox() {
        return this.zzm;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.zza).add("address1", this.zzb).add("address2", this.zzc).add("address3", this.zzd).add("address4", this.zze).add("address5", this.zzf).add("administrativeArea", this.zzg).add("locality", this.zzh).add("countryCode", this.zzi).add(HintConstants.AUTOFILL_HINT_POSTAL_CODE, this.zzj).add("sortingCode", this.zzk).add(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, this.zzl).add("isPostBox", Boolean.valueOf(this.zzm)).add("companyName", this.zzn).add(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, this.zzo).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
