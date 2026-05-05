package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactlessSetupItem extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ContactlessSetupItem> CREATOR = new zzm();
    final int zza;
    final int zzb;

    public ContactlessSetupItem(int i2, int i3) {
        this.zza = i2;
        this.zzb = i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContactlessSetupItem) {
            ContactlessSetupItem contactlessSetupItem = (ContactlessSetupItem) obj;
            if (this.zza == contactlessSetupItem.zza && this.zzb == contactlessSetupItem.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("type", Integer.valueOf(this.zza)).add("status", Integer.valueOf(this.zzb)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
