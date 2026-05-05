package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();
    private static final String zza = "Cap";
    private final int zzb;
    private final BitmapDescriptor zzc;
    private final Float zzd;

    protected Cap(int i2) {
        this(i2, (BitmapDescriptor) null, (Float) null);
    }

    Cap(int i2, IBinder iBinder, Float f2) {
        this(i2, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f2);
    }

    private Cap(int i2, BitmapDescriptor bitmapDescriptor, Float f2) {
        boolean z2 = f2 != null && f2.floatValue() > 0.0f;
        if (i2 == 3) {
            z = bitmapDescriptor != null && z2;
            i2 = 3;
        }
        Preconditions.checkArgument(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i2), bitmapDescriptor, f2));
        this.zzb = i2;
        this.zzc = bitmapDescriptor;
        this.zzd = f2;
    }

    protected Cap(BitmapDescriptor bitmapDescriptor, float f2) {
        this(3, bitmapDescriptor, Float.valueOf(f2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.zzb == cap.zzb && Objects.equal(this.zzc, cap.zzc) && Objects.equal(this.zzd, cap.zzd);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public String toString() {
        return "[Cap: type=" + this.zzb + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i3);
        BitmapDescriptor bitmapDescriptor = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final Cap zza() {
        int i2 = this.zzb;
        if (i2 == 0) {
            return new ButtCap();
        }
        if (i2 == 1) {
            return new SquareCap();
        }
        if (i2 == 2) {
            return new RoundCap();
        }
        if (i2 == 3) {
            Preconditions.checkState(this.zzc != null, "bitmapDescriptor must not be null");
            Preconditions.checkState(this.zzd != null, "bitmapRefWidth must not be null");
            return new CustomCap(this.zzc, this.zzd.floatValue());
        }
        String str = zza;
        String str2 = "Unknown Cap type: " + i2;
        return this;
    }
}
