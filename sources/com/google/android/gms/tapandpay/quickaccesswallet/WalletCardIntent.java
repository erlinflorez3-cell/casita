package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class WalletCardIntent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletCardIntent> CREATOR = new zzf();
    private String zza;
    private String zzb;
    private WalletCardIntentExtra[] zzc;

    public static final class Builder {
        private final WalletCardIntent zza;

        public Builder() {
            this.zza = new WalletCardIntent(null);
        }

        public Builder(WalletCardIntent walletCardIntent) {
            WalletCardIntent walletCardIntent2 = new WalletCardIntent(null);
            this.zza = walletCardIntent2;
            walletCardIntent2.zzb(walletCardIntent.zza());
            walletCardIntent2.zzd(walletCardIntent.zzc());
            walletCardIntent2.zzf(walletCardIntent.zze());
        }

        public WalletCardIntent build() {
            return this.zza;
        }

        public Builder setAction(String str) {
            this.zza.zzd(str);
            return this;
        }

        public Builder setClassName(String str) {
            this.zza.zzb(str);
            return this;
        }

        public Builder setExtras(WalletCardIntentExtra[] walletCardIntentExtraArr) {
            this.zza.zzf(walletCardIntentExtraArr);
            return this;
        }
    }

    private WalletCardIntent() {
        throw null;
    }

    WalletCardIntent(String str, String str2, WalletCardIntentExtra[] walletCardIntentExtraArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = walletCardIntentExtraArr;
    }

    /* synthetic */ WalletCardIntent(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletCardIntent) {
            WalletCardIntent walletCardIntent = (WalletCardIntent) obj;
            if (Objects.equal(this.zza, walletCardIntent.zza) && Objects.equal(this.zzb, walletCardIntent.zzb) && Arrays.equals(this.zzc, walletCardIntent.zzc)) {
                return true;
            }
        }
        return false;
    }

    public String getAction() {
        return this.zzb;
    }

    public String getClassName() {
        return this.zza;
    }

    public WalletCardIntentExtra[] getExtras() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getClassName(), false);
        SafeParcelWriter.writeString(parcel, 2, getAction(), false);
        SafeParcelWriter.writeTypedArray(parcel, 3, getExtras(), i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final /* synthetic */ String zza() {
        return this.zza;
    }

    final /* synthetic */ void zzb(String str) {
        this.zza = str;
    }

    final /* synthetic */ String zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzd(String str) {
        this.zzb = str;
    }

    final /* synthetic */ WalletCardIntentExtra[] zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzf(WalletCardIntentExtra[] walletCardIntentExtraArr) {
        this.zzc = walletCardIntentExtraArr;
    }
}
