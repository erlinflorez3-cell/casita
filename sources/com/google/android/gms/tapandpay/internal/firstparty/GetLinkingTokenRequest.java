package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class GetLinkingTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetLinkingTokenRequest> CREATOR = new zza();
    private String zza;

    private GetLinkingTokenRequest() {
    }

    GetLinkingTokenRequest(String str) {
        this.zza = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetLinkingTokenRequest) {
            return Objects.equal(this.zza, ((GetLinkingTokenRequest) obj).zza);
        }
        return false;
    }

    public String getIntegratorId() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getIntegratorId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
