package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class GetStableHardwareIdRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetStableHardwareIdRequest> CREATOR = new zzg();
    private String zza;

    public static final class Builder {
        private final GetStableHardwareIdRequest zza;

        public Builder() {
            this.zza = new GetStableHardwareIdRequest((byte[]) null);
        }

        public Builder(GetStableHardwareIdRequest getStableHardwareIdRequest) {
            GetStableHardwareIdRequest getStableHardwareIdRequest2 = new GetStableHardwareIdRequest((byte[]) null);
            this.zza = getStableHardwareIdRequest2;
            getStableHardwareIdRequest2.zzb(getStableHardwareIdRequest.zza());
        }

        public GetStableHardwareIdRequest build() {
            return this.zza;
        }

        public Builder setWalletId(String str) {
            this.zza.zzb(str);
            return this;
        }
    }

    private GetStableHardwareIdRequest() {
        throw null;
    }

    GetStableHardwareIdRequest(String str) {
        this.zza = str;
    }

    /* synthetic */ GetStableHardwareIdRequest(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetStableHardwareIdRequest) {
            return Objects.equal(this.zza, ((GetStableHardwareIdRequest) obj).zza);
        }
        return false;
    }

    public String getWalletId() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getWalletId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final /* synthetic */ String zza() {
        return this.zza;
    }

    final /* synthetic */ void zzb(String str) {
        this.zza = str;
    }
}
