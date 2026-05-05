package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public class CreatePushProvisionSessionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreatePushProvisionSessionRequest> CREATOR = new zzb();
    private final String zza;

    public static class Builder {
        private String zza;

        public CreatePushProvisionSessionRequest build() {
            return new CreatePushProvisionSessionRequest(this.zza);
        }

        public Builder setIntegratorId(String str) {
            this.zza = str;
            return this;
        }
    }

    CreatePushProvisionSessionRequest(String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
