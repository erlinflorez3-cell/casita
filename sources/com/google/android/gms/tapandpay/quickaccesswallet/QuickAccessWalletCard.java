package com.google.android.gms.tapandpay.quickaccesswallet;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class QuickAccessWalletCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuickAccessWalletCard> CREATOR = new zzc();
    private String zza;
    private Bitmap zzb;
    private String zzc;
    private WalletCardIntent[] zzd;
    private CardIconMessage[] zze;
    private long zzf;
    private long zzg;
    private String zzh;

    public static final class Builder {
        private final QuickAccessWalletCard zza;

        public Builder() {
            this.zza = new QuickAccessWalletCard(null);
        }

        public Builder(QuickAccessWalletCard quickAccessWalletCard) {
            QuickAccessWalletCard quickAccessWalletCard2 = new QuickAccessWalletCard(null);
            this.zza = quickAccessWalletCard2;
            quickAccessWalletCard2.zzb(quickAccessWalletCard.zza());
            quickAccessWalletCard2.zzd(quickAccessWalletCard.zzc());
            quickAccessWalletCard2.zzf(quickAccessWalletCard.zze());
            quickAccessWalletCard2.zzh(quickAccessWalletCard.zzg());
            quickAccessWalletCard2.zzj(quickAccessWalletCard.zzi());
            quickAccessWalletCard2.zzl(quickAccessWalletCard.zzk());
            quickAccessWalletCard2.zzn(quickAccessWalletCard.zzm());
            quickAccessWalletCard2.zzp(quickAccessWalletCard.zzo());
        }

        public QuickAccessWalletCard build() {
            return this.zza;
        }

        public Builder setAvailableBalance(String str) {
            this.zza.zzp(str);
            return this;
        }

        public Builder setAvailableTimestamp(long j2) {
            this.zza.zzl(j2);
            return this;
        }

        public Builder setCardId(String str) {
            this.zza.zzb(str);
            return this;
        }

        public Builder setCardImage(Bitmap bitmap) {
            this.zza.zzd(bitmap);
            return this;
        }

        public Builder setContentDescription(String str) {
            this.zza.zzf(str);
            return this;
        }

        public Builder setExpirationTimestamp(long j2) {
            this.zza.zzn(j2);
            return this;
        }

        public Builder setIconMessages(CardIconMessage[] cardIconMessageArr) {
            this.zza.zzj(cardIconMessageArr);
            return this;
        }

        public Builder setIntents(WalletCardIntent[] walletCardIntentArr) {
            this.zza.zzh(walletCardIntentArr);
            return this;
        }
    }

    private QuickAccessWalletCard() {
        throw null;
    }

    QuickAccessWalletCard(String str, Bitmap bitmap, String str2, WalletCardIntent[] walletCardIntentArr, CardIconMessage[] cardIconMessageArr, long j2, long j3, String str3) {
        this.zza = str;
        this.zzb = bitmap;
        this.zzc = str2;
        this.zzd = walletCardIntentArr;
        this.zze = cardIconMessageArr;
        this.zzf = j2;
        this.zzg = j3;
        this.zzh = str3;
    }

    /* synthetic */ QuickAccessWalletCard(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletCard) {
            QuickAccessWalletCard quickAccessWalletCard = (QuickAccessWalletCard) obj;
            if (Objects.equal(this.zza, quickAccessWalletCard.zza) && Objects.equal(this.zzb, quickAccessWalletCard.zzb) && Objects.equal(this.zzc, quickAccessWalletCard.zzc) && Arrays.equals(this.zzd, quickAccessWalletCard.zzd) && Arrays.equals(this.zze, quickAccessWalletCard.zze) && Objects.equal(Long.valueOf(this.zzf), Long.valueOf(quickAccessWalletCard.zzf)) && Objects.equal(Long.valueOf(this.zzg), Long.valueOf(quickAccessWalletCard.zzg)) && Objects.equal(this.zzh, quickAccessWalletCard.zzh)) {
                return true;
            }
        }
        return false;
    }

    public String getAvailableBalance() {
        return this.zzh;
    }

    public long getAvailableTimestamp() {
        return this.zzf;
    }

    public String getCardId() {
        return this.zza;
    }

    public Bitmap getCardImage() {
        return this.zzb;
    }

    public String getContentDescription() {
        return this.zzc;
    }

    public long getExpirationTimestamp() {
        return this.zzg;
    }

    public CardIconMessage[] getIconMessages() {
        return this.zze;
    }

    public WalletCardIntent[] getIntents() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, Integer.valueOf(Arrays.hashCode(this.zzd)), Integer.valueOf(Arrays.hashCode(this.zze)), Long.valueOf(this.zzf), Long.valueOf(this.zzg), this.zzh);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getCardId(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, getCardImage(), i2, false);
        SafeParcelWriter.writeString(parcel, 3, getContentDescription(), false);
        SafeParcelWriter.writeTypedArray(parcel, 4, getIntents(), i2, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, getIconMessages(), i2, false);
        SafeParcelWriter.writeLong(parcel, 6, getAvailableTimestamp());
        SafeParcelWriter.writeLong(parcel, 7, getExpirationTimestamp());
        SafeParcelWriter.writeString(parcel, 8, getAvailableBalance(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final /* synthetic */ String zza() {
        return this.zza;
    }

    final /* synthetic */ void zzb(String str) {
        this.zza = str;
    }

    final /* synthetic */ Bitmap zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzd(Bitmap bitmap) {
        this.zzb = bitmap;
    }

    final /* synthetic */ String zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzf(String str) {
        this.zzc = str;
    }

    final /* synthetic */ WalletCardIntent[] zzg() {
        return this.zzd;
    }

    final /* synthetic */ void zzh(WalletCardIntent[] walletCardIntentArr) {
        this.zzd = walletCardIntentArr;
    }

    final /* synthetic */ CardIconMessage[] zzi() {
        return this.zze;
    }

    final /* synthetic */ void zzj(CardIconMessage[] cardIconMessageArr) {
        this.zze = cardIconMessageArr;
    }

    final /* synthetic */ long zzk() {
        return this.zzf;
    }

    final /* synthetic */ void zzl(long j2) {
        this.zzf = j2;
    }

    final /* synthetic */ long zzm() {
        return this.zzg;
    }

    final /* synthetic */ void zzn(long j2) {
        this.zzg = j2;
    }

    final /* synthetic */ String zzo() {
        return this.zzh;
    }

    final /* synthetic */ void zzp(String str) {
        this.zzh = str;
    }
}
