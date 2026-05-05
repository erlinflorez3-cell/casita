package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzaw;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcq extends zzav implements zzcr {
    public zzcq() {
        super("com.google.android.gms.tagmanager.ITagManagerApi");
    }

    public static zzcr asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerApi");
        return iInterfaceQueryLocalInterface instanceof zzcr ? (zzcr) iInterfaceQueryLocalInterface : new zzcp(iBinder);
    }

    @Override // com.google.android.gms.internal.gtm.zzav
    protected final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzco zzcmVar;
        zzco zzcmVar2;
        zzcf zzcdVar = null;
        if (i2 == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzcmVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                zzcmVar = iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(strongBinder);
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                zzcdVar = iInterfaceQueryLocalInterface2 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface2 : new zzcd(strongBinder2);
            }
            zzaw.zzc(parcel);
            initialize(iObjectWrapperAsInterface, zzcmVar, zzcdVar);
        } else if (i2 == 2) {
            Intent intent = (Intent) zzaw.zza(parcel, Intent.CREATOR);
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaw.zzc(parcel);
            preview(intent, iObjectWrapperAsInterface2);
        } else {
            if (i2 != 3) {
                return false;
            }
            Intent intent2 = (Intent) zzaw.zza(parcel, Intent.CREATOR);
            IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 == null) {
                zzcmVar2 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                zzcmVar2 = iInterfaceQueryLocalInterface3 instanceof zzco ? (zzco) iInterfaceQueryLocalInterface3 : new zzcm(strongBinder3);
            }
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                zzcdVar = iInterfaceQueryLocalInterface4 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface4 : new zzcd(strongBinder4);
            }
            zzaw.zzc(parcel);
            previewIntent(intent2, iObjectWrapperAsInterface3, iObjectWrapperAsInterface4, zzcmVar2, zzcdVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
