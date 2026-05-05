package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzg();
    public static final float NO_DIMENSION = -1.0f;
    private BitmapDescriptor zza;
    private LatLng zzb;
    private float zzc;
    private float zzd;
    private LatLngBounds zze;
    private float zzf;
    private float zzg;
    private boolean zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;

    public GroundOverlayOptions() {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
    }

    GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f2, float f3, LatLngBounds latLngBounds, float f4, float f5, boolean z2, float f6, float f7, float f8, boolean z3) {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
        this.zza = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzb = latLng;
        this.zzc = f2;
        this.zzd = f3;
        this.zze = latLngBounds;
        this.zzf = f4;
        this.zzg = f5;
        this.zzh = z2;
        this.zzi = f6;
        this.zzj = f7;
        this.zzk = f8;
        this.zzl = z3;
    }

    private final GroundOverlayOptions zza(LatLng latLng, float f2, float f3) {
        this.zzb = latLng;
        this.zzc = f2;
        this.zzd = f3;
        return this;
    }

    public GroundOverlayOptions anchor(float f2, float f3) {
        this.zzj = f2;
        this.zzk = f3;
        return this;
    }

    public GroundOverlayOptions bearing(float f2) {
        this.zzf = ((f2 % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public GroundOverlayOptions clickable(boolean z2) {
        this.zzl = z2;
        return this;
    }

    public float getAnchorU() {
        return this.zzj;
    }

    public float getAnchorV() {
        return this.zzk;
    }

    public float getBearing() {
        return this.zzf;
    }

    public LatLngBounds getBounds() {
        return this.zze;
    }

    public float getHeight() {
        return this.zzd;
    }

    public BitmapDescriptor getImage() {
        return this.zza;
    }

    public LatLng getLocation() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzi;
    }

    public float getWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzg;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, "imageDescriptor must not be null");
        this.zza = bitmapDescriptor;
        return this;
    }

    public boolean isClickable() {
        return this.zzl;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    public GroundOverlayOptions position(LatLng latLng, float f2) {
        Preconditions.checkState(this.zze == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f2 >= 0.0f, "Width must be non-negative");
        zza(latLng, f2, -1.0f);
        return this;
    }

    public GroundOverlayOptions position(LatLng latLng, float f2, float f3) {
        Preconditions.checkState(this.zze == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f2 >= 0.0f, "Width must be non-negative");
        Preconditions.checkArgument(f3 >= 0.0f, "Height must be non-negative");
        zza(latLng, f2, f3);
        return this;
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        LatLng latLng = this.zzb;
        Preconditions.checkState(latLng == null, "Position has already been set using position: ".concat(String.valueOf(String.valueOf(latLng))));
        this.zze = latLngBounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f2) {
        boolean z2 = false;
        if (f2 >= 0.0f && f2 <= 1.0f) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Transparency must be in the range [0..1]");
        this.zzi = f2;
        return this;
    }

    public GroundOverlayOptions visible(boolean z2) {
        this.zzh = z2;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zza.zza().asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getLocation(), i2, false);
        SafeParcelWriter.writeFloat(parcel, 4, getWidth());
        SafeParcelWriter.writeFloat(parcel, 5, getHeight());
        SafeParcelWriter.writeParcelable(parcel, 6, getBounds(), i2, false);
        SafeParcelWriter.writeFloat(parcel, 7, getBearing());
        SafeParcelWriter.writeFloat(parcel, 8, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeFloat(parcel, 10, getTransparency());
        SafeParcelWriter.writeFloat(parcel, 11, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 12, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 13, isClickable());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public GroundOverlayOptions zIndex(float f2) {
        this.zzg = f2;
        return this;
    }
}
