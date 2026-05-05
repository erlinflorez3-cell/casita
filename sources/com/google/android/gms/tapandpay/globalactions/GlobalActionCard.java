package com.google.android.gms.tapandpay.globalactions;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes8.dex */
public final class GlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalActionCard> CREATOR = new zzc();
    private int zza;
    private String zzb;
    private Bitmap zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private Bitmap zzg;
    private PendingIntent zzh;

    public static final class Builder {
        private final GlobalActionCard zza;

        public Builder() {
            this.zza = new GlobalActionCard(null);
        }

        public Builder(GlobalActionCard globalActionCard) {
            GlobalActionCard globalActionCard2 = new GlobalActionCard(null);
            this.zza = globalActionCard2;
            globalActionCard2.zzb(globalActionCard.zza());
            globalActionCard2.zzd(globalActionCard.zzc());
            globalActionCard2.zzf(globalActionCard.zze());
            globalActionCard2.zzh(globalActionCard.zzg());
            globalActionCard2.zzj(globalActionCard.zzi());
            globalActionCard2.zzl(globalActionCard.zzk());
            globalActionCard2.zzn(globalActionCard.zzm());
            globalActionCard2.zzp(globalActionCard.zzo());
        }

        public GlobalActionCard build() {
            return this.zza;
        }

        public Builder setCardId(String str) {
            this.zza.zzd(str);
            return this;
        }

        public Builder setCardImage(Bitmap bitmap) {
            this.zza.zzf(bitmap);
            return this;
        }

        public Builder setCardType(int i2) {
            this.zza.zzb(i2);
            return this;
        }

        public Builder setContentDescription(String str) {
            this.zza.zzh(str);
            return this;
        }

        public Builder setDeviceLockedMessageText(String str) {
            this.zza.zzl(str);
            return this;
        }

        public Builder setMessageIcon(Bitmap bitmap) {
            this.zza.zzn(bitmap);
            return this;
        }

        public Builder setMessageText(String str) {
            this.zza.zzj(str);
            return this;
        }

        public Builder setPendingIntent(PendingIntent pendingIntent) {
            this.zza.zzp(pendingIntent);
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardType {
        public static final int CAR_KEY = 8;
        public static final int CTA = 3;
        public static final int GLOBAL_ACTIONS_DISMISSED = 4;
        public static final int PASS = 1;
        public static final int PAYMENT = 2;
        public static final int STUDENT_ID = 6;
        public static final int TILE = 9;
        public static final int TRANSIT = 7;
        public static final int UNKNOWN = 0;
        public static final int VALUABLE = 5;
    }

    private GlobalActionCard() {
        throw null;
    }

    GlobalActionCard(int i2, String str, Bitmap bitmap, String str2, String str3, String str4, Bitmap bitmap2, PendingIntent pendingIntent) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = bitmap;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = bitmap2;
        this.zzh = pendingIntent;
    }

    /* synthetic */ GlobalActionCard(byte[] bArr) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalActionCard) {
            GlobalActionCard globalActionCard = (GlobalActionCard) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(globalActionCard.zza)) && Objects.equal(this.zzb, globalActionCard.zzb) && Objects.equal(this.zzc, globalActionCard.zzc) && Objects.equal(this.zzd, globalActionCard.zzd) && Objects.equal(this.zze, globalActionCard.zze) && Objects.equal(this.zzf, globalActionCard.zzf) && Objects.equal(this.zzg, globalActionCard.zzg) && Objects.equal(this.zzh, globalActionCard.zzh)) {
                return true;
            }
        }
        return false;
    }

    public String getCardId() {
        return this.zzb;
    }

    public Bitmap getCardImage() {
        return this.zzc;
    }

    public int getCardType() {
        return this.zza;
    }

    public String getContentDescription() {
        return this.zzd;
    }

    public String getDeviceLockedMessageText() {
        return this.zzf;
    }

    public Bitmap getMessageIcon() {
        return this.zzg;
    }

    public String getMessageText() {
        return this.zze;
    }

    public PendingIntent getPendingIntent() {
        return this.zzh;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getCardType());
        SafeParcelWriter.writeString(parcel, 2, getCardId(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCardImage(), i2, false);
        SafeParcelWriter.writeString(parcel, 4, getContentDescription(), false);
        SafeParcelWriter.writeString(parcel, 5, getMessageText(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getMessageIcon(), i2, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getPendingIntent(), i2, false);
        SafeParcelWriter.writeString(parcel, 8, getDeviceLockedMessageText(), false);
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

    final /* synthetic */ Bitmap zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzf(Bitmap bitmap) {
        this.zzc = bitmap;
    }

    final /* synthetic */ String zzg() {
        return this.zzd;
    }

    final /* synthetic */ void zzh(String str) {
        this.zzd = str;
    }

    final /* synthetic */ String zzi() {
        return this.zze;
    }

    final /* synthetic */ void zzj(String str) {
        this.zze = str;
    }

    final /* synthetic */ String zzk() {
        return this.zzf;
    }

    final /* synthetic */ void zzl(String str) {
        this.zzf = str;
    }

    final /* synthetic */ Bitmap zzm() {
        return this.zzg;
    }

    final /* synthetic */ void zzn(Bitmap bitmap) {
        this.zzg = bitmap;
    }

    final /* synthetic */ PendingIntent zzo() {
        return this.zzh;
    }

    final /* synthetic */ void zzp(PendingIntent pendingIntent) {
        this.zzh = pendingIntent;
    }
}
