package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class GetEnvironmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetEnvironmentRequest> CREATOR = new zzf();
    private String zza;

    public static final class Builder {
        private final GetEnvironmentRequest zza;

        public Builder() {
            this.zza = new GetEnvironmentRequest((byte[]) null);
        }

        public Builder(GetEnvironmentRequest getEnvironmentRequest) {
            GetEnvironmentRequest getEnvironmentRequest2 = new GetEnvironmentRequest((byte[]) null);
            this.zza = getEnvironmentRequest2;
            getEnvironmentRequest2.zzb(getEnvironmentRequest.zza());
        }

        public GetEnvironmentRequest build() {
            return this.zza;
        }

        public Builder setWalletId(String str) {
            this.zza.zzb(str);
            return this;
        }
    }

    private GetEnvironmentRequest() {
        throw null;
    }

    GetEnvironmentRequest(String str) {
        this.zza = str;
    }

    /* synthetic */ GetEnvironmentRequest(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetEnvironmentRequest) {
            return Objects.equal(this.zza, ((GetEnvironmentRequest) obj).zza);
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
