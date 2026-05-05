package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class WalletCardIntentExtra extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletCardIntentExtra> CREATOR = new zzg();
    private String zza;
    private int zzb;
    private String zzc;
    private byte[] zzd;
    private boolean zze;
    private int zzf;
    private long zzg;

    public static final class Builder {
        private final WalletCardIntentExtra zza;

        public Builder() {
            this.zza = new WalletCardIntentExtra(null);
        }

        public Builder(WalletCardIntentExtra walletCardIntentExtra) {
            WalletCardIntentExtra walletCardIntentExtra2 = new WalletCardIntentExtra(null);
            this.zza = walletCardIntentExtra2;
            walletCardIntentExtra2.zzb(walletCardIntentExtra.zza());
            walletCardIntentExtra2.zzd(walletCardIntentExtra.zzc());
            walletCardIntentExtra2.zzf(walletCardIntentExtra.zze());
            walletCardIntentExtra2.zzh(walletCardIntentExtra.zzg());
            walletCardIntentExtra2.zzj(walletCardIntentExtra.zzi());
            walletCardIntentExtra2.zzl(walletCardIntentExtra.zzk());
            walletCardIntentExtra2.zzn(walletCardIntentExtra.zzm());
        }

        public WalletCardIntentExtra build() {
            return this.zza;
        }

        public Builder setKey(String str) {
            this.zza.zzb(str);
            return this;
        }

        public Builder setValueBoolean(boolean z2) {
            this.zza.zzj(z2);
            return this;
        }

        public Builder setValueBytes(byte[] bArr) {
            this.zza.zzh(bArr);
            return this;
        }

        public Builder setValueInt(int i2) {
            this.zza.zzl(i2);
            return this;
        }

        public Builder setValueLong(long j2) {
            this.zza.zzn(j2);
            return this;
        }

        public Builder setValueString(String str) {
            this.zza.zzf(str);
            return this;
        }

        public Builder setValueType(int i2) {
            this.zza.zzd(i2);
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ValueType {
        public static final int BOOLEAN = 3;
        public static final int BYTES = 2;
        public static final int INT = 4;
        public static final int LONG = 5;
        public static final int STRING = 1;
        public static final int VALUE_TYPE_UNKNOWN = 0;
    }

    private WalletCardIntentExtra() {
        throw null;
    }

    WalletCardIntentExtra(String str, int i2, String str2, byte[] bArr, boolean z2, int i3, long j2) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = z2;
        this.zzf = i3;
        this.zzg = j2;
    }

    /* synthetic */ WalletCardIntentExtra(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletCardIntentExtra) {
            WalletCardIntentExtra walletCardIntentExtra = (WalletCardIntentExtra) obj;
            if (Objects.equal(this.zza, walletCardIntentExtra.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(walletCardIntentExtra.zzb)) && Objects.equal(this.zzc, walletCardIntentExtra.zzc) && Arrays.equals(this.zzd, walletCardIntentExtra.zzd) && Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(walletCardIntentExtra.zze)) && Objects.equal(Integer.valueOf(this.zzf), Integer.valueOf(walletCardIntentExtra.zzf)) && Objects.equal(Long.valueOf(this.zzg), Long.valueOf(walletCardIntentExtra.zzg))) {
                return true;
            }
        }
        return false;
    }

    public String getKey() {
        return this.zza;
    }

    public boolean getValueBoolean() {
        return this.zze;
    }

    public byte[] getValueBytes() {
        return this.zzd;
    }

    public int getValueInt() {
        return this.zzf;
    }

    public long getValueLong() {
        return this.zzg;
    }

    public String getValueString() {
        return this.zzc;
    }

    public int getValueType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), this.zzc, Integer.valueOf(Arrays.hashCode(this.zzd)), Boolean.valueOf(this.zze), Integer.valueOf(this.zzf), Long.valueOf(this.zzg));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getKey(), false);
        SafeParcelWriter.writeInt(parcel, 2, getValueType());
        SafeParcelWriter.writeString(parcel, 3, getValueString(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getValueBytes(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, getValueBoolean());
        SafeParcelWriter.writeInt(parcel, 6, getValueInt());
        SafeParcelWriter.writeLong(parcel, 7, getValueLong());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final /* synthetic */ String zza() {
        return this.zza;
    }

    final /* synthetic */ void zzb(String str) {
        this.zza = str;
    }

    final /* synthetic */ int zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzd(int i2) {
        this.zzb = i2;
    }

    final /* synthetic */ String zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzf(String str) {
        this.zzc = str;
    }

    final /* synthetic */ byte[] zzg() {
        return this.zzd;
    }

    final /* synthetic */ void zzh(byte[] bArr) {
        this.zzd = bArr;
    }

    final /* synthetic */ boolean zzi() {
        return this.zze;
    }

    final /* synthetic */ void zzj(boolean z2) {
        this.zze = z2;
    }

    final /* synthetic */ int zzk() {
        return this.zzf;
    }

    final /* synthetic */ void zzl(int i2) {
        this.zzf = i2;
    }

    final /* synthetic */ long zzm() {
        return this.zzg;
    }

    final /* synthetic */ void zzn(long j2) {
        this.zzg = j2;
    }
}
