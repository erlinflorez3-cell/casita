package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzm();
    private static final String zza = "PatternItem";
    private final int zzb;
    private final Float zzc;

    public PatternItem(int i2, Float f2) {
        boolean z2 = true;
        if (i2 != 1 && (f2 == null || f2.floatValue() < 0.0f)) {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Invalid PatternItem: type=" + i2 + " length=" + f2);
        this.zzb = i2;
        this.zzc = f2;
    }

    static List zza(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PatternItem dash = (PatternItem) it.next();
            if (dash == null) {
                dash = null;
            } else {
                int i2 = dash.zzb;
                if (i2 == 0) {
                    Preconditions.checkState(dash.zzc != null, "length must not be null.");
                    dash = new Dash(dash.zzc.floatValue());
                } else if (i2 == 1) {
                    dash = new Dot();
                } else if (i2 != 2) {
                    String str = zza;
                    String str2 = "Unknown PatternItem type: " + i2;
                } else {
                    Preconditions.checkState(dash.zzc != null, "length must not be null.");
                    dash = new Gap(dash.zzc.floatValue());
                }
            }
            arrayList.add(dash);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.zzb == patternItem.zzb && Objects.equal(this.zzc, patternItem.zzc);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc);
    }

    public String toString() {
        return "[PatternItem: type=" + this.zzb + " length=" + this.zzc + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i3);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
