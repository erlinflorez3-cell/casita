package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class GetQuickAccessWalletConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetQuickAccessWalletConfigRequest> CREATOR = new zzb();
    private int zza;
    private Account zzb;

    public static final class Builder {
        private final GetQuickAccessWalletConfigRequest zza;

        public Builder() {
            this.zza = new GetQuickAccessWalletConfigRequest(null);
        }

        public Builder(GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest) {
            GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest2 = new GetQuickAccessWalletConfigRequest(null);
            this.zza = getQuickAccessWalletConfigRequest2;
            getQuickAccessWalletConfigRequest2.zzb(getQuickAccessWalletConfigRequest.zza());
            getQuickAccessWalletConfigRequest2.zzd(getQuickAccessWalletConfigRequest.zzc());
        }

        public GetQuickAccessWalletConfigRequest build() {
            return this.zza;
        }

        public Builder setAccount(Account account) {
            this.zza.zzd(account);
            return this;
        }

        public Builder setSource(int i2) {
            this.zza.zzb(i2);
            return this;
        }
    }

    private GetQuickAccessWalletConfigRequest() {
        throw null;
    }

    GetQuickAccessWalletConfigRequest(int i2, Account account) {
        this.zza = i2;
        this.zzb = account;
    }

    /* synthetic */ GetQuickAccessWalletConfigRequest(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetQuickAccessWalletConfigRequest) {
            GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest = (GetQuickAccessWalletConfigRequest) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(getQuickAccessWalletConfigRequest.zza)) && Objects.equal(this.zzb, getQuickAccessWalletConfigRequest.zzb)) {
                return true;
            }
        }
        return false;
    }

    public Account getAccount() {
        return this.zzb;
    }

    public int getSource() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSource());
        SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i2, false);
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
}
