package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.facebook.imageutils.JfifUtil;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzac();
    private static final Integer zza = Integer.valueOf(Color.argb(255, 236, 233, JfifUtil.MARKER_APP1));
    private Boolean zzb;
    private Boolean zzc;
    private int zzd;
    private CameraPosition zze;
    private Boolean zzf;
    private Boolean zzg;
    private Boolean zzh;
    private Boolean zzi;
    private Boolean zzj;
    private Boolean zzk;
    private Boolean zzl;
    private Boolean zzm;
    private Boolean zzn;
    private Float zzo;
    private Float zzp;
    private LatLngBounds zzq;
    private Boolean zzr;
    private Integer zzs;
    private String zzt;

    public GoogleMapOptions() {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
    }

    GoogleMapOptions(byte b2, byte b3, int i2, CameraPosition cameraPosition, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, byte b12, Float f2, Float f3, LatLngBounds latLngBounds, byte b13, Integer num, String str) {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzb = com.google.android.gms.maps.internal.zza.zzb(b2);
        this.zzc = com.google.android.gms.maps.internal.zza.zzb(b3);
        this.zzd = i2;
        this.zze = cameraPosition;
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b4);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b5);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b6);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b7);
        this.zzj = com.google.android.gms.maps.internal.zza.zzb(b8);
        this.zzk = com.google.android.gms.maps.internal.zza.zzb(b9);
        this.zzl = com.google.android.gms.maps.internal.zza.zzb(b10);
        this.zzm = com.google.android.gms.maps.internal.zza.zzb(b11);
        this.zzn = com.google.android.gms.maps.internal.zza.zzb(b12);
        this.zzo = f2;
        this.zzp = f3;
        this.zzq = latLngBounds;
        this.zzr = com.google.android.gms.maps.internal.zza.zzb(b13);
        this.zzs = num;
        this.zzt = str;
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) throws Throwable {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("e|N /\u001a\u0006>N.5\u0017[z:e\u0010QH\u0004Dc|", (short) (ZN.Xd() ^ 23629), (short) (ZN.Xd() ^ 3338))).getMethod(C1626yg.Ud("5<L\u0017\t\u0005Z\u001d\u000eP$C", (short) (C1633zX.Xd() ^ (-6704)), (short) (C1633zX.Xd() ^ (-24324))), new Class[0]);
        try {
            method.setAccessible(true);
            TypedArray typedArrayObtainAttributes = ((Resources) method.invoke(context, objArr)).obtainAttributes(attributeSet, R.styleable.MapAttrs);
            GoogleMapOptions googleMapOptions = new GoogleMapOptions();
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_mapType)) {
                googleMapOptions.mapType(typedArrayObtainAttributes.getInt(R.styleable.MapAttrs_mapType, -1));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_zOrderOnTop)) {
                googleMapOptions.zOrderOnTop(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_zOrderOnTop, false));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_useViewLifecycle)) {
                googleMapOptions.useViewLifecycleInFragment(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_useViewLifecycle, false));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_uiCompass)) {
                googleMapOptions.compassEnabled(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_uiCompass, true));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_uiRotateGestures)) {
                googleMapOptions.rotateGesturesEnabled(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_uiRotateGestures, true));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
                googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_uiScrollGestures)) {
                googleMapOptions.scrollGesturesEnabled(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_uiScrollGestures, true));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_uiTiltGestures)) {
                googleMapOptions.tiltGesturesEnabled(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_uiTiltGestures, true));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_uiZoomGestures)) {
                googleMapOptions.zoomGesturesEnabled(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_uiZoomGestures, true));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_uiZoomControls)) {
                googleMapOptions.zoomControlsEnabled(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_uiZoomControls, true));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_liteMode)) {
                googleMapOptions.liteMode(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_liteMode, false));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_uiMapToolbar)) {
                googleMapOptions.mapToolbarEnabled(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_uiMapToolbar, true));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_ambientEnabled)) {
                googleMapOptions.ambientEnabled(typedArrayObtainAttributes.getBoolean(R.styleable.MapAttrs_ambientEnabled, false));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraMinZoomPreference)) {
                googleMapOptions.minZoomPreference(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraMinZoomPreference)) {
                googleMapOptions.maxZoomPreference(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_backgroundColor)) {
                googleMapOptions.backgroundColor(Integer.valueOf(typedArrayObtainAttributes.getColor(R.styleable.MapAttrs_backgroundColor, zza.intValue())));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_mapId) && (string = typedArrayObtainAttributes.getString(R.styleable.MapAttrs_mapId)) != null && !string.isEmpty()) {
                googleMapOptions.mapId(string);
            }
            googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
            googleMapOptions.camera(zza(context, attributeSet));
            typedArrayObtainAttributes.recycle();
            return googleMapOptions;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static CameraPosition zza(Context context, AttributeSet attributeSet) throws Throwable {
        if (context == null || attributeSet == null) {
            return null;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("}2\u0016\u0019\u000ebmWU6/z\u001d42\rY\f2\r7u\f", (short) (OY.Xd() ^ 31325))).getMethod(EO.Od("V&\u0003A5\u007f\u0010NyOK;", (short) (C1499aX.Xd() ^ (-18684))), new Class[0]);
        try {
            method.setAccessible(true);
            TypedArray typedArrayObtainAttributes = ((Resources) method.invoke(context, objArr)).obtainAttributes(attributeSet, R.styleable.MapAttrs);
            LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLat) ? typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraTargetLat, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLng) ? typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraTargetLng, 0.0f) : 0.0f);
            CameraPosition.Builder builder = CameraPosition.builder();
            builder.target(latLng);
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraZoom)) {
                builder.zoom(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraZoom, 0.0f));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraBearing)) {
                builder.bearing(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraBearing, 0.0f));
            }
            if (typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraTilt)) {
                builder.tilt(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraTilt, 0.0f));
            }
            typedArrayObtainAttributes.recycle();
            return builder.build();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static LatLngBounds zzb(Context context, AttributeSet attributeSet) throws Throwable {
        if (context == null || attributeSet == null) {
            return null;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("\u0013\u001f\u0014!\u001d\u0016\u0010X\r\u0018\u0016\u001b\u000b\u0013\u0018Pd\u0010\u000e\u0013\u0003\u0015\u0010", (short) (C1499aX.Xd() ^ (-3932)))).getMethod(C1593ug.zd("wv\u0007ey\t\u0006\r\u000b|\u007f\u000f", (short) (C1633zX.Xd() ^ (-32409)), (short) (C1633zX.Xd() ^ (-11195))), new Class[0]);
        try {
            method.setAccessible(true);
            TypedArray typedArrayObtainAttributes = ((Resources) method.invoke(context, objArr)).obtainAttributes(attributeSet, R.styleable.MapAttrs);
            Float fValueOf = typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
            Float fValueOf2 = typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
            Float fValueOf3 = typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
            Float fValueOf4 = typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
            typedArrayObtainAttributes.recycle();
            if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
                return null;
            }
            return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public GoogleMapOptions ambientEnabled(boolean z2) {
        this.zzn = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions backgroundColor(Integer num) {
        this.zzs = num;
        return this;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.zze = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z2) {
        this.zzg = Boolean.valueOf(z2);
        return this;
    }

    public Boolean getAmbientEnabled() {
        return this.zzn;
    }

    public Integer getBackgroundColor() {
        return this.zzs;
    }

    public CameraPosition getCamera() {
        return this.zze;
    }

    public Boolean getCompassEnabled() {
        return this.zzg;
    }

    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzq;
    }

    public Boolean getLiteMode() {
        return this.zzl;
    }

    public String getMapId() {
        return this.zzt;
    }

    public Boolean getMapToolbarEnabled() {
        return this.zzm;
    }

    public int getMapType() {
        return this.zzd;
    }

    public Float getMaxZoomPreference() {
        return this.zzp;
    }

    public Float getMinZoomPreference() {
        return this.zzo;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.zzk;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.zzh;
    }

    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzr;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.zzj;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzc;
    }

    public Boolean getZOrderOnTop() {
        return this.zzb;
    }

    public Boolean getZoomControlsEnabled() {
        return this.zzf;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzi;
    }

    public GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.zzq = latLngBounds;
        return this;
    }

    public GoogleMapOptions liteMode(boolean z2) {
        this.zzl = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions mapId(String str) {
        this.zzt = str;
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z2) {
        this.zzm = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions mapType(int i2) {
        this.zzd = i2;
        return this;
    }

    public GoogleMapOptions maxZoomPreference(float f2) {
        this.zzp = Float.valueOf(f2);
        return this;
    }

    public GoogleMapOptions minZoomPreference(float f2) {
        this.zzo = Float.valueOf(f2);
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z2) {
        this.zzk = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z2) {
        this.zzh = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z2) {
        this.zzr = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z2) {
        this.zzj = Boolean.valueOf(z2);
        return this;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.zzd)).add("LiteMode", this.zzl).add("Camera", this.zze).add("CompassEnabled", this.zzg).add("ZoomControlsEnabled", this.zzf).add("ScrollGesturesEnabled", this.zzh).add("ZoomGesturesEnabled", this.zzi).add("TiltGesturesEnabled", this.zzj).add("RotateGesturesEnabled", this.zzk).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzr).add("MapToolbarEnabled", this.zzm).add("AmbientEnabled", this.zzn).add("MinZoomPreference", this.zzo).add("MaxZoomPreference", this.zzp).add("BackgroundColor", this.zzs).add("LatLngBoundsForCameraTarget", this.zzq).add("ZOrderOnTop", this.zzb).add("UseViewLifecycleInFragment", this.zzc).toString();
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z2) {
        this.zzc = Boolean.valueOf(z2);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(this.zzb));
        SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(this.zzc));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i2, false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzj));
        SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(this.zzk));
        SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(this.zzl));
        SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(this.zzm));
        SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(this.zzn));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i2, false);
        SafeParcelWriter.writeByte(parcel, 19, com.google.android.gms.maps.internal.zza.zza(this.zzr));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public GoogleMapOptions zOrderOnTop(boolean z2) {
        this.zzb = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z2) {
        this.zzf = Boolean.valueOf(z2);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z2) {
        this.zzi = Boolean.valueOf(z2);
        return this;
    }
}
