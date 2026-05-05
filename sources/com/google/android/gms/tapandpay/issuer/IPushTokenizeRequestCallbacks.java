package com.google.android.gms.tapandpay.issuer;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks;

/* JADX INFO: loaded from: classes8.dex */
public interface IPushTokenizeRequestCallbacks extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.tapandpay.zzb implements IPushTokenizeRequestCallbacks {

        public static class Proxy extends com.google.android.gms.internal.tapandpay.zza implements IPushTokenizeRequestCallbacks {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks");
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks
            public void generatePaymentCredentials(GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest, IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) throws RemoteException {
                Parcel parcelZza = zza();
                com.google.android.gms.internal.tapandpay.zzc.zzc(parcelZza, generatePaymentCredentialsRequest);
                com.google.android.gms.internal.tapandpay.zzc.zzd(parcelZza, iPushTokenizeResponseCallbacks);
                zzc(3, parcelZza);
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks
            public void isWalletAvailable(String str, IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) throws RemoteException {
                Parcel parcelZza = zza();
                parcelZza.writeString(str);
                com.google.android.gms.internal.tapandpay.zzc.zzd(parcelZza, iPushTokenizeResponseCallbacks);
                zzc(2, parcelZza);
            }
        }

        public Stub() {
            super("com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks");
        }

        public static IPushTokenizeRequestCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks");
            return iInterfaceQueryLocalInterface instanceof IPushTokenizeRequestCallbacks ? (IPushTokenizeRequestCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.tapandpay.zzb
        protected boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 2) {
                String string = parcel.readString();
                IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacksAsInterface = IPushTokenizeResponseCallbacks.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                isWalletAvailable(string, iPushTokenizeResponseCallbacksAsInterface);
                return true;
            }
            if (i2 != 3) {
                return false;
            }
            GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest = (GeneratePaymentCredentialsRequest) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, GeneratePaymentCredentialsRequest.CREATOR);
            IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacksAsInterface2 = IPushTokenizeResponseCallbacks.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
            generatePaymentCredentials(generatePaymentCredentialsRequest, iPushTokenizeResponseCallbacksAsInterface2);
            return true;
        }
    }

    void generatePaymentCredentials(GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest, IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) throws RemoteException;

    void isWalletAvailable(String str, IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) throws RemoteException;
}
