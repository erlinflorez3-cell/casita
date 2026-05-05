package com.google.android.gms.location;

import android.location.Location;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class GeofencingEvent {
    private final int zza;
    private final int zzb;
    private final List zzc;
    private final Location zzd;

    private GeofencingEvent(int i2, int i3, List list, Location location) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = list;
        this.zzd = location;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.location.GeofencingEvent fromIntent(android.content.Intent r12) {
        /*
            r11 = 0
            if (r12 != 0) goto L4
        L3:
            return r11
        L4:
            java.lang.String r0 = "gms_error_code"
            r9 = -1
            int r8 = r12.getIntExtra(r0, r9)
            java.lang.String r0 = "com.google.android.location.intent.extra.transition"
            int r7 = r12.getIntExtra(r0, r9)
            if (r7 != r9) goto L64
        L13:
            r7 = r9
        L14:
            java.lang.String r0 = "com.google.android.location.intent.extra.geofence_list"
            java.io.Serializable r10 = r12.getSerializableExtra(r0)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L31
            r6 = r11
        L1f:
            java.lang.String r0 = "com.google.android.location.intent.extra.triggering_location"
            android.os.Parcelable r1 = r12.getParcelableExtra(r0)
            android.location.Location r1 = (android.location.Location) r1
            if (r6 != 0) goto L2b
            if (r8 == r9) goto L3
        L2b:
            com.google.android.gms.location.GeofencingEvent r0 = new com.google.android.gms.location.GeofencingEvent
            r0.<init>(r8, r7, r6, r1)
            return r0
        L31:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r0 = r10.size()
            r6.<init>(r0)
            int r5 = r10.size()
            r4 = 0
            r3 = r4
        L40:
            if (r3 >= r5) goto L1f
            java.lang.Object r2 = r10.get(r3)
            byte[] r2 = (byte[]) r2
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r0 = r2.length
            r1.unmarshall(r2, r4, r0)
            r1.setDataPosition(r4)
            android.os.Parcelable$Creator<com.google.android.gms.internal.location.zzek> r0 = com.google.android.gms.internal.location.zzek.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r1)
            com.google.android.gms.internal.location.zzek r0 = (com.google.android.gms.internal.location.zzek) r0
            r1.recycle()
            r6.add(r0)
            int r3 = r3 + 1
            goto L40
        L64:
            r0 = 1
            if (r7 == r0) goto L14
            r0 = 2
            if (r7 == r0) goto L14
            r0 = 4
            if (r7 != r0) goto L13
            r7 = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.GeofencingEvent.fromIntent(android.content.Intent):com.google.android.gms.location.GeofencingEvent");
    }

    public int getErrorCode() {
        return this.zza;
    }

    public int getGeofenceTransition() {
        return this.zzb;
    }

    public List<Geofence> getTriggeringGeofences() {
        return this.zzc;
    }

    public Location getTriggeringLocation() {
        return this.zzd;
    }

    public boolean hasError() {
        return this.zza != -1;
    }
}
