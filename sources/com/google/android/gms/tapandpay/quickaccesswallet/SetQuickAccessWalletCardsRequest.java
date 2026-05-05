package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class SetQuickAccessWalletCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetQuickAccessWalletCardsRequest> CREATOR = new zze();
    private int zza;
    private Account zzb;
    private QuickAccessWalletCard[] zzc;

    public static final class Builder {
        private final SetQuickAccessWalletCardsRequest zza;

        public Builder() {
            this.zza = new SetQuickAccessWalletCardsRequest(null);
        }

        public Builder(SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest) {
            SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest2 = new SetQuickAccessWalletCardsRequest(null);
            this.zza = setQuickAccessWalletCardsRequest2;
            setQuickAccessWalletCardsRequest2.zzb(setQuickAccessWalletCardsRequest.zza());
            setQuickAccessWalletCardsRequest2.zzd(setQuickAccessWalletCardsRequest.zzc());
            setQuickAccessWalletCardsRequest2.zzf(setQuickAccessWalletCardsRequest.zze());
        }

        public SetQuickAccessWalletCardsRequest build() {
            return this.zza;
        }

        public Builder setAccount(Account account) {
            this.zza.zzd(account);
            return this;
        }

        public Builder setCards(QuickAccessWalletCard[] quickAccessWalletCardArr) {
            this.zza.zzf(quickAccessWalletCardArr);
            return this;
        }

        public Builder setSource(int i2) {
            this.zza.zzb(i2);
            return this;
        }
    }

    private SetQuickAccessWalletCardsRequest() {
        throw null;
    }

    SetQuickAccessWalletCardsRequest(int i2, Account account, QuickAccessWalletCard[] quickAccessWalletCardArr) {
        this.zza = i2;
        this.zzb = account;
        this.zzc = quickAccessWalletCardArr;
    }

    /* synthetic */ SetQuickAccessWalletCardsRequest(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetQuickAccessWalletCardsRequest) {
            SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest = (SetQuickAccessWalletCardsRequest) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(setQuickAccessWalletCardsRequest.zza)) && Objects.equal(this.zzb, setQuickAccessWalletCardsRequest.zzb) && Arrays.equals(this.zzc, setQuickAccessWalletCardsRequest.zzc)) {
                return true;
            }
        }
        return false;
    }

    public Account getAccount() {
        return this.zzb;
    }

    public QuickAccessWalletCard[] getCards() {
        return this.zzc;
    }

    public int getSource() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSource());
        SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i2, false);
        SafeParcelWriter.writeTypedArray(parcel, 3, getCards(), i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final /* synthetic */ int zza() {
        return this.zza;
    }

    final /* synthetic */ void zzb(int i2) {
        this.zza = i2;
    }

    final /* synthetic */ Account zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzd(Account account) {
        this.zzb = account;
    }

    final /* synthetic */ QuickAccessWalletCard[] zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzf(QuickAccessWalletCard[] quickAccessWalletCardArr) {
        this.zzc = quickAccessWalletCardArr;
    }
}
