package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzd();
    List zza;
    long zzb;
    long zzc;
    int zzd;
    Bundle zze;

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j2, long j3) {
        this(Collections.singletonList(detectedActivity), j2, j3, 0, null);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j2, long j3) {
        this(list, j2, j3, 0, null);
    }

    public ActivityRecognitionResult(List list, long j2, long j3, int i2, Bundle bundle) {
        Preconditions.checkArgument((list == null || list.isEmpty()) ? false : true, "Must have at least 1 detected activity");
        Preconditions.checkArgument(j2 > 0 && j3 > 0, "Must set times");
        this.zza = list;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = i2;
        this.zze = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.location.ActivityRecognitionResult extractResult(android.content.Intent r3) {
        /*
            boolean r0 = hasResult(r3)
            r2 = 0
            if (r0 != 0) goto Lb
        L7:
            r1 = r2
        L8:
            if (r1 == 0) goto L2e
            return r1
        Lb:
            android.os.Bundle r1 = r3.getExtras()
            if (r1 != 0) goto L12
            goto L7
        L12:
            java.lang.String r0 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto L27
            byte[] r1 = (byte[]) r1
            android.os.Parcelable$Creator<com.google.android.gms.location.ActivityRecognitionResult> r0 = com.google.android.gms.location.ActivityRecognitionResult.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(r1, r0)
            com.google.android.gms.location.ActivityRecognitionResult r1 = (com.google.android.gms.location.ActivityRecognitionResult) r1
            goto L8
        L27:
            boolean r0 = r1 instanceof com.google.android.gms.location.ActivityRecognitionResult
            if (r0 == 0) goto L7
            com.google.android.gms.location.ActivityRecognitionResult r1 = (com.google.android.gms.location.ActivityRecognitionResult) r1
            goto L8
        L2e:
            java.util.List r1 = zza(r3)
            if (r1 == 0) goto L3a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L3b
        L3a:
            return r2
        L3b:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.extractResult(android.content.Intent):com.google.android.gms.location.ActivityRecognitionResult");
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List listZza = zza(intent);
        return (listZza == null || listZza.isEmpty()) ? false : true;
    }

    public static List zza(Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return SafeParcelableSerializer.deserializeIterableFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    private static boolean zzb(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!zzb(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i2 = 0; i2 < length; i2++) {
                            if (Objects.equal(Array.get(obj, i2), Array.get(obj2, i2))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.zzb == activityRecognitionResult.zzb && this.zzc == activityRecognitionResult.zzc && this.zzd == activityRecognitionResult.zzd && Objects.equal(this.zza, activityRecognitionResult.zza) && zzb(this.zze, activityRecognitionResult.zze)) {
                return true;
            }
        }
        return false;
    }

    public int getActivityConfidence(int i2) {
        for (DetectedActivity detectedActivity : this.zza) {
            if (detectedActivity.getType() == i2) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.zzc;
    }

    public DetectedActivity getMostProbableActivity() {
        return (DetectedActivity) this.zza.get(0);
    }

    public List<DetectedActivity> getProbableActivities() {
        return this.zza;
    }

    public long getTime() {
        return this.zzb;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zza, this.zze);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.zza);
        long j2 = this.zzb;
        long j3 = this.zzc;
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(j2).length();
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 24 + String.valueOf(j3).length() + 1);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(strValueOf);
        sb.append(", timeMillis=");
        sb.append(j2);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j3);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeBundle(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
