package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class ServerPushProvisionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ServerPushProvisionRequest> CREATOR = new zzu();
    private final PushProvisionSessionContext zza;
    private final String zzb;
    private final UserAddress zzc;
    private final ExtraOptions zzd;

    public static class Builder {
        private PushProvisionSessionContext zza;
        private String zzb;
        private UserAddress zzc;
        private ExtraOptions zzd;

        public ServerPushProvisionRequest build() {
            return new ServerPushProvisionRequest(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public Builder setDisplayName(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setExtraOptions(ExtraOptions extraOptions) {
            this.zzd = extraOptions;
            return this;
        }

        public Builder setSessionContext(PushProvisionSessionContext pushProvisionSessionContext) {
            this.zza = pushProvisionSessionContext;
            return this;
        }

        public Builder setUserAddress(UserAddress userAddress) {
            this.zzc = userAddress;
            return this;
        }
    }

    public static class ExtraOptions extends AbstractSafeParcelable implements ReflectedParcelable {
        public static final Parcelable.Creator<ExtraOptions> CREATOR = new zzc();
        private boolean zza;
        private boolean zzb;

        public ExtraOptions(boolean z2, boolean z3) {
            this.zza = z2;
            this.zzb = z3;
        }

        public static ExtraOptions defaultOptions() {
            return new ExtraOptions(false, false);
        }

        public boolean getServerSideAddressDeliveryEnabled() {
            return this.zza;
        }

        public boolean getVirtualCardsSetting() {
            return this.zzb;
        }

        public ExtraOptions setServerSideAddressDeliveryEnabled(boolean z2) {
            this.zza = z2;
            return this;
        }

        public ExtraOptions setVirtualCardsSetting(boolean z2) {
            this.zzb = z2;
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, getServerSideAddressDeliveryEnabled());
            SafeParcelWriter.writeBoolean(parcel, 2, getVirtualCardsSetting());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    ServerPushProvisionRequest(PushProvisionSessionContext pushProvisionSessionContext, String str, UserAddress userAddress, ExtraOptions extraOptions) {
        this.zza = pushProvisionSessionContext;
        this.zzb = str;
        this.zzc = userAddress;
        this.zzd = extraOptions;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        PushProvisionSessionContext pushProvisionSessionContext = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, pushProvisionSessionContext, i2, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
