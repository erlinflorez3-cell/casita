package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.vision.Frame;

/* JADX INFO: loaded from: classes8.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzv();
    public int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    public int zze;

    public zzs() {
    }

    public zzs(int i2, int i3, int i4, long j2, int i5) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = j2;
        this.zze = i5;
    }

    public static zzs zza(Frame frame) {
        zzs zzsVar = new zzs();
        zzsVar.zza = frame.getMetadata().getWidth();
        zzsVar.zzb = frame.getMetadata().getHeight();
        zzsVar.zze = frame.getMetadata().getRotation();
        zzsVar.zzc = frame.getMetadata().getId();
        zzsVar.zzd = frame.getMetadata().getTimestampMillis();
        return zzsVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
