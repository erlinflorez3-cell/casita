package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new zzbe();
    private int zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private String zzh;

    private zzbd() {
    }

    zzbd(int i2, String str, String str2, String str3, String str4, int i3, int i4, String str5) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = i3;
        this.zzg = i4;
        this.zzh = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbd) {
            zzbd zzbdVar = (zzbd) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzbdVar.zza)) && Objects.equal(this.zzb, zzbdVar.zzb) && Objects.equal(this.zzc, zzbdVar.zzc) && Objects.equal(this.zzd, zzbdVar.zzd) && Objects.equal(this.zze, zzbdVar.zze) && Objects.equal(Integer.valueOf(this.zzf), Integer.valueOf(zzbdVar.zzf)) && Objects.equal(Integer.valueOf(this.zzg), Integer.valueOf(zzbdVar.zzg)) && Objects.equal(this.zzh, zzbdVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd, this.zze, Integer.valueOf(this.zzf), Integer.valueOf(this.zzg), this.zzh);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
