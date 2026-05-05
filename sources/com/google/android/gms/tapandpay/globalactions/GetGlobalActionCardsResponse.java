package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class GetGlobalActionCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalActionCardsResponse> CREATOR = new zzb();
    private GlobalActionCard[] zza;
    private int zzb;

    public static final class Builder {
        private final GetGlobalActionCardsResponse zza;

        public Builder() {
            this.zza = new GetGlobalActionCardsResponse(null);
        }

        public Builder(GetGlobalActionCardsResponse getGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse2 = new GetGlobalActionCardsResponse(null);
            this.zza = getGlobalActionCardsResponse2;
            getGlobalActionCardsResponse2.zzb(getGlobalActionCardsResponse.zza());
            getGlobalActionCardsResponse2.zzd(getGlobalActionCardsResponse.zzc());
        }

        public GetGlobalActionCardsResponse build() {
            return this.zza;
        }

        public Builder setCards(GlobalActionCard[] globalActionCardArr) {
            this.zza.zzb(globalActionCardArr);
            return this;
        }

        public Builder setSelectedIndex(int i2) {
            this.zza.zzd(i2);
            return this;
        }
    }

    private GetGlobalActionCardsResponse() {
        throw null;
    }

    /* synthetic */ GetGlobalActionCardsResponse(byte[] bArr) {
    }

    GetGlobalActionCardsResponse(GlobalActionCard[] globalActionCardArr, int i2) {
        this.zza = globalActionCardArr;
        this.zzb = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) obj;
            if (Arrays.equals(this.zza, getGlobalActionCardsResponse.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(getGlobalActionCardsResponse.zzb))) {
                return true;
            }
        }
        return false;
    }

    public GlobalActionCard[] getCards() {
        return this.zza;
    }

    public int getSelectedIndex() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 1, getCards(), i2, false);
        SafeParcelWriter.writeInt(parcel, 2, getSelectedIndex());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final /* synthetic */ GlobalActionCard[] zza() {
        return this.zza;
    }

    final /* synthetic */ void zzb(GlobalActionCard[] globalActionCardArr) {
        this.zza = globalActionCardArr;
    }

    final /* synthetic */ int zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzd(int i2) {
        this.zzb = i2;
    }
}
