package com.google.android.gms.tapandpay.issuer;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.Jg;
import yg.OY;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class PushTokenizeCallbacks extends IPushTokenizeRequestCallbacks.Stub {
    private final int[] zza;
    private final Executor zzb;
    private final WalletAvailabilityChecker zzc;
    private final PaymentCredentialsGenerator zzd;

    private PushTokenizeCallbacks(int[] iArr, Executor executor, WalletAvailabilityChecker walletAvailabilityChecker, PaymentCredentialsGenerator paymentCredentialsGenerator) {
        this.zza = iArr;
        this.zzb = executor;
        this.zzc = walletAvailabilityChecker;
        this.zzd = paymentCredentialsGenerator;
    }

    public static PushTokenizeCallbacks tryCreate(Executor executor, WalletAvailabilityChecker walletAvailabilityChecker, PaymentCredentialsGenerator paymentCredentialsGenerator, CobadgedTokenInfo cobadgedTokenInfo) throws Throwable {
        if (walletAvailabilityChecker == null && paymentCredentialsGenerator == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (walletAvailabilityChecker != null) {
            arrayList.add(1);
        }
        if (paymentCredentialsGenerator != null) {
            arrayList.add(2);
            if (paymentCredentialsGenerator.getGoogleOpaquePaymentCardSupported()) {
                arrayList.add(3);
            }
            if (cobadgedTokenInfo != null && paymentCredentialsGenerator.getAuxiliaryOpaquePaymentCardSupported()) {
                arrayList.add(4);
            }
        }
        Object[] array = arrayList.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        if (executor == null) {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(Jg.Wd("Lv3p\u001b\u0019;1wPBB\b\u0012\u0013g\b*\u0017u^HA\\\u001e\nK\u0006m\"", (short) (OY.Xd() ^ 16931), (short) (OY.Xd() ^ 7284))).getDeclaredMethod(ZO.xd("\u0003o\u000f[l]>\u000f\t@KZL\fN\u0004\u0015{W\u0007\u000e8!", (short) (C1499aX.Xd() ^ (-29174)), (short) (C1499aX.Xd() ^ (-10302))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                executor = (ExecutorService) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return new PushTokenizeCallbacks(iArr, executor, walletAvailabilityChecker, paymentCredentialsGenerator);
    }

    private static void zzc(IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks, int i2) {
        try {
            iPushTokenizeResponseCallbacks.onError(i2);
        } catch (RemoteException e2) {
        }
    }

    @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks
    public void generatePaymentCredentials(final GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest, final IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.tapandpay.issuer.zzm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(generatePaymentCredentialsRequest, iPushTokenizeResponseCallbacks);
            }
        });
    }

    public int[] getSupportedCallbackRequestTypes() {
        return this.zza;
    }

    @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks
    public void isWalletAvailable(final String str, final IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.tapandpay.issuer.zzn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza(str, iPushTokenizeResponseCallbacks);
            }
        });
    }

    final /* synthetic */ void zza(String str, IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) {
        WalletAvailabilityChecker walletAvailabilityChecker = this.zzc;
        Preconditions.checkNotNull(walletAvailabilityChecker);
        try {
            iPushTokenizeResponseCallbacks.onWalletAvailableResponse(walletAvailabilityChecker.isAvailable(str).get(10L, TimeUnit.SECONDS).booleanValue());
        } catch (Exception unused) {
            zzc(iPushTokenizeResponseCallbacks, 0);
        }
    }

    final /* synthetic */ void zzb(GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest, IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) {
        PaymentCredentialsGenerator paymentCredentialsGenerator = this.zzd;
        Preconditions.checkNotNull(paymentCredentialsGenerator);
        try {
            iPushTokenizeResponseCallbacks.onPaymentCredentialsResponse(paymentCredentialsGenerator.generate(generatePaymentCredentialsRequest).get(10L, TimeUnit.SECONDS));
        } catch (ExecutionException e2) {
            zzc(iPushTokenizeResponseCallbacks, e2.getCause() instanceof GeneratePaymentCredentialsException ? ((GeneratePaymentCredentialsException) e2.getCause()).errorCode : 0);
        } catch (Exception unused) {
            zzc(iPushTokenizeResponseCallbacks, 0);
        }
    }
}
