package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class QuickAccessWalletConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuickAccessWalletConfig> CREATOR = new zzd();
    private int zza;
    private int zzb;
    private int zzc;
    private String[] zzd;

    public static final class Builder {
        private final QuickAccessWalletConfig zza;

        public Builder() {
            this.zza = new QuickAccessWalletConfig(null);
        }

        public Builder(QuickAccessWalletConfig quickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig2 = new QuickAccessWalletConfig(null);
            this.zza = quickAccessWalletConfig2;
            quickAccessWalletConfig2.zzb(quickAccessWalletConfig.zza());
            quickAccessWalletConfig2.zzd(quickAccessWalletConfig.zzc());
            quickAccessWalletConfig2.zzf(quickAccessWalletConfig.zze());
            quickAccessWalletConfig2.zzh(quickAccessWalletConfig.zzg());
        }

        public QuickAccessWalletConfig build() {
            return this.zza;
        }

        public Builder setCardHeightPx(int i2) {
            this.zza.zzd(i2);
            return this;
        }

        public Builder setCardWidthPx(int i2) {
            this.zza.zzb(i2);
            return this;
        }

        public Builder setCurrentWalletCardIds(String[] strArr) {
            this.zza.zzh(strArr);
            return this;
        }

        public Builder setMaxCards(int i2) {
            this.zza.zzf(i2);
            return this;
        }
    }

    private QuickAccessWalletConfig() {
        throw null;
    }

    QuickAccessWalletConfig(int i2, int i3, int i4, String[] strArr) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = strArr;
    }

    /* synthetic */ QuickAccessWalletConfig(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(quickAccessWalletConfig.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(quickAccessWalletConfig.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(quickAccessWalletConfig.zzc)) && Arrays.equals(this.zzd, quickAccessWalletConfig.zzd)) {
                return true;
            }
        }
        return false;
    }

    public int getCardHeightPx() {
        return this.zzb;
    }

    public int getCardWidthPx() {
        return this.zza;
    }

    public String[] getCurrentWalletCardIds() {
        return this.zzd;
    }

    public int getMaxCards() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(Arrays.hashCode(this.zzd)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getCardWidthPx());
        SafeParcelWriter.writeInt(parcel, 2, getCardHeightPx());
        SafeParcelWriter.writeInt(parcel, 3, getMaxCards());
        SafeParcelWriter.writeStringArray(parcel, 5, getCurrentWalletCardIds(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final /* synthetic */ int zza() {
        return this.zza;
    }

    final /* synthetic */ void zzb(int i2) {
        this.zza = i2;
    }

    final /* synthetic */ int zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzd(int i2) {
        this.zzb = i2;
    }

    final /* synthetic */ int zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzf(int i2) {
        this.zzc = i2;
    }

    final /* synthetic */ String[] zzg() {
        return this.zzd;
    }

    final /* synthetic */ void zzh(String[] strArr) {
        this.zzd = strArr;
    }
}
