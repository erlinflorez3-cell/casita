package com.google.android.gms.internal.flags;

import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes8.dex */
public class zzc {
    private static final ClassLoader zzd = zzc.class.getClassLoader();

    private zzc() {
    }

    public static void writeBoolean(Parcel parcel, boolean z2) {
        parcel.writeInt(z2 ? 1 : 0);
    }

    public static void zza(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static boolean zza(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
