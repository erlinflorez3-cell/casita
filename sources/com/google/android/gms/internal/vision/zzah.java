package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzag();
    public final zzao[] zza;
    public final zzab zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;
    public final int zzg;
    private final zzab zzh;
    private final zzab zzi;
    private final float zzj;
    private final int zzk;

    public zzah(zzao[] zzaoVarArr, zzab zzabVar, zzab zzabVar2, zzab zzabVar3, String str, float f2, String str2, int i2, boolean z2, int i3, int i4) {
        this.zza = zzaoVarArr;
        this.zzb = zzabVar;
        this.zzh = zzabVar2;
        this.zzi = zzabVar3;
        this.zzc = str;
        this.zzj = f2;
        this.zzd = str2;
        this.zzk = i2;
        this.zze = z2;
        this.zzf = i3;
        this.zzg = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zza, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzh, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzi, i2, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzc, false);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzj);
        SafeParcelWriter.writeString(parcel, 8, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zze);
        SafeParcelWriter.writeInt(parcel, 11, this.zzf);
        SafeParcelWriter.writeInt(parcel, 12, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
