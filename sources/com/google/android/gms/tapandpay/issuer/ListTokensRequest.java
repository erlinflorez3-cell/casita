package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class ListTokensRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ListTokensRequest> CREATOR = new zzk();
    private String zza;

    public static final class Builder {
        private final ListTokensRequest zza;

        public Builder() {
            this.zza = new ListTokensRequest((byte[]) null);
        }

        public Builder(ListTokensRequest listTokensRequest) {
            ListTokensRequest listTokensRequest2 = new ListTokensRequest((byte[]) null);
            this.zza = listTokensRequest2;
            listTokensRequest2.zzb(listTokensRequest.zza());
        }

        public ListTokensRequest build() {
            return this.zza;
        }

        public Builder setWalletId(String str) {
            this.zza.zzb(str);
            return this;
        }
    }

    private ListTokensRequest() {
        throw null;
    }

    ListTokensRequest(String str) {
        this.zza = str;
    }

    /* synthetic */ ListTokensRequest(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListTokensRequest) {
            return Objects.equal(this.zza, ((ListTokensRequest) obj).zza);
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
