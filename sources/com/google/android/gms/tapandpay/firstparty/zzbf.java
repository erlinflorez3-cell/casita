package com.google.android.gms.tapandpay.firstparty;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbg();
    private int zza;
    private String zzb;
    private String zzc;
    private zzbd zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private zzan zzi;

    private zzbf() {
    }

    zzbf(int i2, String str, String str2, IBinder iBinder, zzbd zzbdVar, String str3, String str4, String str5, String str6) {
        zzan zzanVar;
        if (iBinder == null) {
            zzanVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.firstparty.IRenderCallback");
            zzanVar = iInterfaceQueryLocalInterface instanceof zzan ? (zzan) iInterfaceQueryLocalInterface : new zzan(iBinder);
        }
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzi = zzanVar;
        this.zzd = zzbdVar;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbf) {
            zzbf zzbfVar = (zzbf) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzbfVar.zza)) && Objects.equal(this.zzb, zzbfVar.zzb) && Objects.equal(this.zzc, zzbfVar.zzc) && Objects.equal(this.zzi, zzbfVar.zzi) && Objects.equal(this.zzd, zzbfVar.zzd) && Objects.equal(this.zze, zzbfVar.zze) && Objects.equal(this.zzf, zzbfVar.zzf) && Objects.equal(this.zzg, zzbfVar.zzg) && Objects.equal(this.zzh, zzbfVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzi, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        zzan zzanVar = this.zzi;
        SafeParcelWriter.writeIBinder(parcel, 5, zzanVar == null ? null : zzanVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzd, i2, false);
        SafeParcelWriter.writeString(parcel, 7, this.zze, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
