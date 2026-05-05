package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();
    final String zza;
    final String zzb;
    final String zzc;
    final String zzd;
    final String zze;
    final String zzf;
    final String zzg;
    final String zzh;
    final String zzi;
    final String zzj;
    final String zzk;
    final String zzl;
    final String zzm;
    final long zzn;
    final String zzo;
    final String zzp;
    final String zzq;
    final String zzr;
    final String zzs;
    final String zzt;
    final String zzu;
    final int zzv;

    zzau(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j2, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i2) {
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
        this.zzm = str13;
        this.zzn = j2;
        this.zzo = str14;
        this.zzp = str15;
        this.zzq = str16;
        this.zzr = str17;
        this.zzs = str18;
        this.zzt = str19;
        this.zzu = str20;
        this.zzv = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzau) {
            zzau zzauVar = (zzau) obj;
            if (Objects.equal(this.zza, zzauVar.zza) && Objects.equal(this.zzb, zzauVar.zzb) && Objects.equal(this.zzc, zzauVar.zzc) && Objects.equal(this.zzd, zzauVar.zzd) && Objects.equal(this.zze, zzauVar.zze) && Objects.equal(this.zzf, zzauVar.zzf) && Objects.equal(this.zzg, zzauVar.zzg) && Objects.equal(this.zzh, zzauVar.zzh) && Objects.equal(this.zzi, zzauVar.zzi) && Objects.equal(this.zzj, zzauVar.zzj) && Objects.equal(this.zzk, zzauVar.zzk) && Objects.equal(this.zzl, zzauVar.zzl) && Objects.equal(this.zzm, zzauVar.zzm) && this.zzn == zzauVar.zzn && Objects.equal(this.zzo, zzauVar.zzo) && Objects.equal(this.zzp, zzauVar.zzp) && Objects.equal(this.zzq, zzauVar.zzq) && Objects.equal(this.zzr, zzauVar.zzr) && Objects.equal(this.zzs, zzauVar.zzs) && Objects.equal(this.zzt, zzauVar.zzt) && Objects.equal(this.zzu, zzauVar.zzu) && Objects.equal(Integer.valueOf(this.zzv), Integer.valueOf(zzauVar.zzv))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, Long.valueOf(this.zzn), this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, Integer.valueOf(this.zzv));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("issuerName", this.zza).add("issuerPhoneNumber", this.zzb).add("appLogoUrl", this.zzc).add("appName", this.zzd).add("appDeveloperName", this.zze).add("appPackageName", this.zzf).add("privacyNoticeUrl", this.zzg).add("termsAndConditionsUrl", this.zzh).add("productShortName", this.zzi).add("appAction", this.zzj).add("appIntentExtraMessage", this.zzk).add("issuerMessageHeadline", this.zzl).add("issuerMessageBody", this.zzm).add("issuerMessageExpiryTimestampMillis", Long.valueOf(this.zzn)).add("issuerMessageLinkPackageName", this.zzo).add("issuerMessageLinkAction", this.zzp).add("issuerMessageLinkExtraText", this.zzq).add("issuerMessageLinkUrl", this.zzr).add("issuerMessageLinkText", this.zzs).add("issuerWebLinkUrl", this.zzt).add("issuerWebLinkText", this.zzu).add("issuerMessageType", Integer.valueOf(this.zzv)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
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
        SafeParcelWriter.writeString(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeLong(parcel, 15, this.zzn);
        SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzp, false);
        SafeParcelWriter.writeString(parcel, 18, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 20, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 21, this.zzs, false);
        SafeParcelWriter.writeString(parcel, 22, this.zzt, false);
        SafeParcelWriter.writeString(parcel, 23, this.zzu, false);
        SafeParcelWriter.writeInt(parcel, 24, this.zzv);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
