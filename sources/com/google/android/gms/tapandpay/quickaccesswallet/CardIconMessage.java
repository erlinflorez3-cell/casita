package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class CardIconMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardIconMessage> CREATOR = new zza();
    private int[] zza;
    private int zzb;
    private String zzc;

    public static final class Builder {
        private final CardIconMessage zza;

        public Builder() {
            this.zza = new CardIconMessage(null);
        }

        public Builder(CardIconMessage cardIconMessage) {
            CardIconMessage cardIconMessage2 = new CardIconMessage(null);
            this.zza = cardIconMessage2;
            cardIconMessage2.zzb(cardIconMessage.zza());
            cardIconMessage2.zzd(cardIconMessage.zzc());
            cardIconMessage2.zzf(cardIconMessage.zze());
        }

        public CardIconMessage build() {
            return this.zza;
        }

        public Builder setConditions(int[] iArr) {
            this.zza.zzb(iArr);
            return this;
        }

        public Builder setIcon(int i2) {
            this.zza.zzd(i2);
            return this;
        }

        public Builder setMessage(String str) {
            this.zza.zzf(str);
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Condition {
        public static final int NFC_OFF = 3;
        public static final int NFC_ON = 2;
        public static final int PHONE_LOCKED = 4;
        public static final int TRUE = 1;
        public static final int UNKNOWN_CONDITION = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Icon {
        public static final int LOCK = 4;
        public static final int NFC = 2;
        public static final int NFC_DISABLED = 3;
        public static final int NONE = 1;
        public static final int UNKNOWN_ICON = 0;
    }

    private CardIconMessage() {
        throw null;
    }

    /* synthetic */ CardIconMessage(byte[] bArr) {
    }

    CardIconMessage(int[] iArr, int i2, String str) {
        this.zza = iArr;
        this.zzb = i2;
        this.zzc = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardIconMessage) {
            CardIconMessage cardIconMessage = (CardIconMessage) obj;
            if (Arrays.equals(this.zza, cardIconMessage.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(cardIconMessage.zzb)) && Objects.equal(this.zzc, cardIconMessage.zzc)) {
                return true;
            }
        }
        return false;
    }

    public int[] getConditions() {
        return this.zza;
    }

    public int getIcon() {
        return this.zzb;
    }

    public String getMessage() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb), this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntArray(parcel, 1, getConditions(), false);
        SafeParcelWriter.writeInt(parcel, 2, getIcon());
        SafeParcelWriter.writeString(parcel, 3, getMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final /* synthetic */ int[] zza() {
        return this.zza;
    }

    final /* synthetic */ void zzb(int[] iArr) {
        this.zza = iArr;
    }

    final /* synthetic */ int zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzd(int i2) {
        this.zzb = i2;
    }

    final /* synthetic */ String zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzf(String str) {
        this.zzc = str;
    }
}
