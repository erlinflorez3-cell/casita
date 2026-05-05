package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class TokenInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenInfo> CREATOR = new zzw();
    final String zza;
    final String zzb;
    final String zzc;
    final String zzd;
    final int zze;
    final int zzf;
    final int zzg;
    final boolean zzh;
    final String zzi;
    final String zzj;
    final Integer zzk;
    final Integer zzl;

    TokenInfo(String str, String str2, String str3, String str4, int i2, int i3, int i4, boolean z2, String str5, String str6, Integer num, Integer num2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = i2;
        this.zzf = i3;
        this.zzg = i4;
        this.zzh = z2;
        this.zzi = str5;
        this.zzj = str6;
        this.zzk = num;
        this.zzl = num2;
    }

    public String getDpanLastFour() {
        return this.zzd;
    }

    public String getFpanLastFour() {
        return this.zzc;
    }

    public boolean getIsDefaultToken() {
        return this.zzh;
    }

    public String getIssuerName() {
        return this.zzb;
    }

    public String getIssuerTokenId() {
        return this.zza;
    }

    public int getNetwork() {
        return this.zzf;
    }

    public String getPortfolioName() {
        return this.zzi;
    }

    public int getTokenServiceProvider() {
        return this.zze;
    }

    public int getTokenState() {
        return this.zzg;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeIntegerObject(parcel, 11, this.zzk, false);
        SafeParcelWriter.writeIntegerObject(parcel, 12, this.zzl, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
