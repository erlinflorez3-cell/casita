package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PushTokenizeResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PushTokenizeResult> CREATOR = new zzq();
    final int zza;
    final int zzb;
    final List zzc;

    public static class Builder {
        private int zza;
        private int zzb;
        private List zzc;

        public PushTokenizeResult build() {
            return new PushTokenizeResult(this.zza, this.zzb, this.zzc);
        }

        public Builder setCardStatus(int i2) {
            this.zza = i2;
            return this;
        }

        public Builder setTokenizationOutcomes(List<TokenizationOutcome> list) {
            this.zzc = list;
            return this;
        }

        public Builder setVirtualCardsStatus(int i2) {
            this.zzb = i2;
            return this;
        }
    }

    PushTokenizeResult(int i2, int i3, List list) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = list;
    }

    public boolean getCardResult() {
        return this.zza == 0;
    }

    public int getCardStatus() {
        return this.zza;
    }

    public List<TokenizationOutcome> getTokenizationOutcomes() {
        return this.zzc;
    }

    public boolean getVirtualCardsResult() {
        return this.zzb == 0;
    }

    public int getVirtualCardsStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
