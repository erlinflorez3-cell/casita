package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectGlobalActionCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SelectGlobalActionCardRequest> CREATOR = new zzd();
    private int zza;
    private String zzb;
    private int zzc;

    public static final class Builder {
        private final SelectGlobalActionCardRequest zza;

        public Builder() {
            this.zza = new SelectGlobalActionCardRequest(null);
        }

        public Builder(SelectGlobalActionCardRequest selectGlobalActionCardRequest) {
            SelectGlobalActionCardRequest selectGlobalActionCardRequest2 = new SelectGlobalActionCardRequest(null);
            this.zza = selectGlobalActionCardRequest2;
            selectGlobalActionCardRequest2.zzb(selectGlobalActionCardRequest.zza());
            selectGlobalActionCardRequest2.zzd(selectGlobalActionCardRequest.zzc());
            selectGlobalActionCardRequest2.zzf(selectGlobalActionCardRequest.zze());
        }

        public SelectGlobalActionCardRequest build() {
            return this.zza;
        }

        public Builder setCardId(String str) {
            this.zza.zzd(str);
            return this;
        }

        public Builder setCardType(int i2) {
            this.zza.zzb(i2);
            return this;
        }

        public Builder setSelectionTimeoutMs(int i2) {
            this.zza.zzf(i2);
            return this;
        }
    }

    private SelectGlobalActionCardRequest() {
        throw null;
    }

    SelectGlobalActionCardRequest(int i2, String str, int i3) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = i3;
    }

    /* synthetic */ SelectGlobalActionCardRequest(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectGlobalActionCardRequest) {
            SelectGlobalActionCardRequest selectGlobalActionCardRequest = (SelectGlobalActionCardRequest) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(selectGlobalActionCardRequest.zza)) && Objects.equal(this.zzb, selectGlobalActionCardRequest.zzb) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(selectGlobalActionCardRequest.zzc))) {
                return true;
            }
        }
        return false;
    }

    public String getCardId() {
        return this.zzb;
    }

    public int getCardType() {
        return this.zza;
    }

    public int getSelectionTimeoutMs() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getCardType());
        SafeParcelWriter.writeString(parcel, 3, getCardId(), false);
        SafeParcelWriter.writeInt(parcel, 4, getSelectionTimeoutMs());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final /* synthetic */ int zza() {
        return this.zza;
    }

    final /* synthetic */ void zzb(int i2) {
        this.zza = i2;
    }

    final /* synthetic */ String zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzd(String str) {
        this.zzb = str;
    }

    final /* synthetic */ int zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzf(int i2) {
        this.zzc = i2;
    }
}
