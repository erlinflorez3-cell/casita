package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class PushTokenizeExtraOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PushTokenizeExtraOptions> CREATOR = new zzo();
    final boolean zza;
    final boolean zzb;
    final String zzc;

    public static class Builder {
        private boolean zza;
        private boolean zzb;
        private String zzc;

        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(byte[] bArr) {
        }

        public PushTokenizeExtraOptions build() {
            return new PushTokenizeExtraOptions(this.zza, this.zzb, this.zzc);
        }

        public Builder setAccountLinkingData(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setEnrollForVirtualCards(boolean z2) {
            this.zzb = z2;
            return this;
        }

        public Builder setIsBounceProvisioned(boolean z2) {
            this.zza = z2;
            return this;
        }
    }

    PushTokenizeExtraOptions(boolean z2, boolean z3, String str) {
        this.zza = z2;
        this.zzb = z3;
        this.zzc = str;
    }

    public static PushTokenizeExtraOptions defaultOptions() {
        return new PushTokenizeExtraOptions(false, false, null);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof PushTokenizeExtraOptions) {
            PushTokenizeExtraOptions pushTokenizeExtraOptions = (PushTokenizeExtraOptions) obj;
            if (this.zza == pushTokenizeExtraOptions.zza && this.zzb == pushTokenizeExtraOptions.zzb && Objects.equal(this.zzc, pushTokenizeExtraOptions.zzc)) {
                return true;
            }
        }
        return false;
    }

    public String getAccountLinkingData() {
        return this.zzc;
    }

    public boolean getEnrollForVirtualCards() {
        return this.zzb;
    }

    public boolean getisBounceProvisioned() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb), this.zzc);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("isBounceProvisioned", Boolean.valueOf(this.zza)).add("enrollForVirtualCards", Boolean.valueOf(this.zzb)).add("accountLinkingData", this.zzc).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        boolean z2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z2);
        SafeParcelWriter.writeBoolean(parcel, 2, getEnrollForVirtualCards());
        SafeParcelWriter.writeString(parcel, 3, getAccountLinkingData(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
