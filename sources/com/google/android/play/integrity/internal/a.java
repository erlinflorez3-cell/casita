package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes9.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f3456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3457b;

    protected a(IBinder iBinder, String str) {
        this.f3456a = iBinder;
        this.f3457b = str;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f3457b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3456a;
    }

    protected final void b(int i2, Parcel parcel) throws RemoteException {
        try {
            this.f3456a.transact(i2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
