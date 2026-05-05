package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class GetGlobalActionCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalActionCardsRequest> CREATOR = new zza();
    private int zza;
    private int zzb;
    private int zzc;

    public static final class Builder {
        private final GetGlobalActionCardsRequest zza;

        public Builder() {
            this.zza = new GetGlobalActionCardsRequest(null);
        }

        public Builder(GetGlobalActionCardsRequest getGlobalActionCardsRequest) {
            GetGlobalActionCardsRequest getGlobalActionCardsRequest2 = new GetGlobalActionCardsRequest(null);
            this.zza = getGlobalActionCardsRequest2;
            getGlobalActionCardsRequest2.zzb(getGlobalActionCardsRequest.zza());
            getGlobalActionCardsRequest2.zzd(getGlobalActionCardsRequest.zzc());
            getGlobalActionCardsRequest2.zzf(getGlobalActionCardsRequest.zze());
        }

        public GetGlobalActionCardsRequest build() {
            return this.zza;
        }

        public Builder setCardHeightPx(int i2) {
            this.zza.zzf(i2);
            return this;
        }

        public Builder setCardWidthPx(int i2) {
            this.zza.zzd(i2);
            return this;
        }

        public Builder setMaxCards(int i2) {
            this.zza.zzb(i2);
            return this;
        }
    }

    private GetGlobalActionCardsRequest() {
        throw null;
    }

    GetGlobalActionCardsRequest(int i2, int i3, int i4) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
    }

    /* synthetic */ GetGlobalActionCardsRequest(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsRequest) {
            GetGlobalActionCardsRequest getGlobalActionCardsRequest = (GetGlobalActionCardsRequest) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(getGlobalActionCardsRequest.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(getGlobalActionCardsRequest.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(getGlobalActionCardsRequest.zzc))) {
                return true;
            }
        }
        return false;
    }

    public int getCardHeightPx() {
        return this.zzc;
    }

    public int getCardWidthPx() {
        return this.zzb;
    }

    public int getMaxCards() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getMaxCards());
        SafeParcelWriter.writeInt(parcel, 2, getCardWidthPx());
        SafeParcelWriter.writeInt(parcel, 3, getCardHeightPx());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final /* synthetic */ int zza() {
        return this.zza;
    }

    final /* synthetic */ void zzb(int i2) {
        this.zza = i2;
    }

    final /* synthetic */ int zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzd(int i2) {
        this.zzb = i2;
    }

    final /* synthetic */ int zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzf(int i2) {
        this.zzc = i2;
    }
}
