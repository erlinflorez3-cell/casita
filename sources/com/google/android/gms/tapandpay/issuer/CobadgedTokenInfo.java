package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class CobadgedTokenInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CobadgedTokenInfo> CREATOR = new zza();
    final int zza;
    final int zzb;
    final boolean zzc;

    public static class Builder {
        private int zza;
        private int zzb;
        private boolean zzc;

        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(byte[] bArr) {
        }

        public CobadgedTokenInfo build() {
            return new CobadgedTokenInfo(this.zza, this.zzb, this.zzc);
        }

        public Builder setAuxiliaryNetwork(int i2) {
            this.zzb = i2;
            return this;
        }

        public Builder setAuxiliaryTokenServiceProvider(int i2) {
            this.zza = i2;
            return this;
        }

        public Builder setPresentAuxiliaryTokenFirst(boolean z2) {
            this.zzc = z2;
            return this;
        }
    }

    CobadgedTokenInfo(int i2, int i3, boolean z2) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = z2;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CobadgedTokenInfo) {
            CobadgedTokenInfo cobadgedTokenInfo = (CobadgedTokenInfo) obj;
            if (this.zza == cobadgedTokenInfo.zza && this.zzb == cobadgedTokenInfo.zzb && this.zzc == cobadgedTokenInfo.zzc) {
                return true;
            }
        }
        return false;
    }

    public int getAuxiliaryNetwork() {
        return this.zzb;
    }

    public int getAuxiliaryTokenServiceProvider() {
        return this.zza;
    }

    public boolean getPresentAuxiliaryTokenFirst() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("auxiliaryTokenServiceProvider", Integer.valueOf(this.zza)).add("auxiliaryNetwork", Integer.valueOf(this.zzb)).add("presentAuxiliaryTokenFirst", Boolean.valueOf(this.zzc)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
