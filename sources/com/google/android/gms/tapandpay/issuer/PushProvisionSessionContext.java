package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class PushProvisionSessionContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PushProvisionSessionContext> CREATOR = new zzl();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public PushProvisionSessionContext(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public String getDeviceId() {
        return this.zzb;
    }

    public String getServerSessionId() {
        return this.zza;
    }

    public String getWalletId() {
        return this.zzc;
    }

    public String toString() {
        return String.format("PushProvisionSessionContext{serverSessionId=%s, deviceId=%s, walletId=%s}", this.zza, this.zzb, this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getServerSessionId(), false);
        SafeParcelWriter.writeString(parcel, 2, getDeviceId(), false);
        SafeParcelWriter.writeString(parcel, 3, getWalletId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
