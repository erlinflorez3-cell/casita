package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class ReachableDeviceWalletInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ReachableDeviceWalletInfo> CREATOR = new zzr();
    private String zza;
    private String zzb;

    public static final class Builder {
        private final ReachableDeviceWalletInfo zza;

        public Builder() {
            this.zza = new ReachableDeviceWalletInfo(null);
        }

        public Builder(ReachableDeviceWalletInfo reachableDeviceWalletInfo) {
            ReachableDeviceWalletInfo reachableDeviceWalletInfo2 = new ReachableDeviceWalletInfo(null);
            this.zza = reachableDeviceWalletInfo2;
            reachableDeviceWalletInfo2.zzb(reachableDeviceWalletInfo.zza());
            reachableDeviceWalletInfo2.zzd(reachableDeviceWalletInfo.zzc());
        }

        public ReachableDeviceWalletInfo build() {
            return this.zza;
        }

        public Builder setDisplayName(String str) {
            this.zza.zzd(str);
            return this;
        }

        public Builder setWalletId(String str) {
            this.zza.zzb(str);
            return this;
        }
    }

    private ReachableDeviceWalletInfo() {
        throw null;
    }

    ReachableDeviceWalletInfo(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    /* synthetic */ ReachableDeviceWalletInfo(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReachableDeviceWalletInfo) {
            ReachableDeviceWalletInfo reachableDeviceWalletInfo = (ReachableDeviceWalletInfo) obj;
            if (Objects.equal(this.zza, reachableDeviceWalletInfo.zza) && Objects.equal(this.zzb, reachableDeviceWalletInfo.zzb)) {
                return true;
            }
        }
        return false;
    }

    public String getDisplayName() {
        return this.zzb;
    }

    public String getWalletId() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getWalletId(), false);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
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
}
