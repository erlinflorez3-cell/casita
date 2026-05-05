package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public int zza;
    public String zzb;
    public String zzc;
    public int zzd;
    public Point[] zze;
    public zzn zzf;
    public zzq zzg;
    public zzr zzh;
    public zzt zzi;
    public zzs zzj;
    public zzo zzk;
    public zzk zzl;
    public zzl zzm;
    public zzm zzn;
    public byte[] zzo;
    public boolean zzp;
    public double zzq;

    public zzu() {
    }

    public zzu(int i2, String str, String str2, int i3, Point[] pointArr, zzn zznVar, zzq zzqVar, zzr zzrVar, zzt zztVar, zzs zzsVar, zzo zzoVar, zzk zzkVar, zzl zzlVar, zzm zzmVar, byte[] bArr, boolean z2, double d2) {
        this.zza = i2;
        this.zzb = str;
        this.zzo = bArr;
        this.zzc = str2;
        this.zzd = i3;
        this.zze = pointArr;
        this.zzp = z2;
        this.zzq = d2;
        this.zzf = zznVar;
        this.zzg = zzqVar;
        this.zzh = zzrVar;
        this.zzi = zztVar;
        this.zzj = zzsVar;
        this.zzk = zzoVar;
        this.zzl = zzkVar;
        this.zzm = zzlVar;
        this.zzn = zzmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.zze, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzl, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzn, i2, false);
        SafeParcelWriter.writeByteArray(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.writeDouble(parcel, 18, this.zzq);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
