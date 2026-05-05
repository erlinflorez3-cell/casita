package com.google.android.gms.tapandpay.issuer;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IPushTokenizeResponseCallbacks extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.tapandpay.zzb implements IPushTokenizeResponseCallbacks {

        public static class Proxy extends com.google.android.gms.internal.tapandpay.zza implements IPushTokenizeResponseCallbacks {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks");
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks
            public void onError(int i2) throws RemoteException {
                Parcel parcelZza = zza();
                parcelZza.writeInt(i2);
                zzc(4, parcelZza);
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks
            public void onPaymentCredentialsResponse(GeneratePaymentCredentialsResponse generatePaymentCredentialsResponse) throws RemoteException {
                Parcel parcelZza = zza();
                com.google.android.gms.internal.tapandpay.zzc.zzc(parcelZza, generatePaymentCredentialsResponse);
                zzc(3, parcelZza);
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks
            public void onWalletAvailableResponse(boolean z2) throws RemoteException {
                Parcel parcelZza = zza();
                int i2 = com.google.android.gms.internal.tapandpay.zzc.zza;
                parcelZza.writeInt(z2 ? 1 : 0);
                zzc(2, parcelZza);
            }
        }

        public Stub() {
            super("com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks");
        }

        public static IPushTokenizeResponseCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks");
            return iInterfaceQueryLocalInterface instanceof IPushTokenizeResponseCallbacks ? (IPushTokenizeResponseCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.tapandpay.zzb
        protected boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 2) {
                boolean zZza = com.google.android.gms.internal.tapandpay.zzc.zza(parcel);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                onWalletAvailableResponse(zZza);
                return true;
            }
            if (i2 == 3) {
                GeneratePaymentCredentialsResponse generatePaymentCredentialsResponse = (GeneratePaymentCredentialsResponse) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, GeneratePaymentCredentialsResponse.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                onPaymentCredentialsResponse(generatePaymentCredentialsResponse);
                return true;
            }
            if (i2 != 4) {
                return false;
            }
            int i4 = parcel.readInt();
            com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
            onError(i4);
            return true;
        }
    }

    void onError(int i2) throws RemoteException;

    void onPaymentCredentialsResponse(GeneratePaymentCredentialsResponse generatePaymentCredentialsResponse) throws RemoteException;

    void onWalletAvailableResponse(boolean z2) throws RemoteException;
}
