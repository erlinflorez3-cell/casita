package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.getface.controllers.IDGetFaceController;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public class ProviderInstaller {
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzb = new Object();
    private static Method zzc = null;
    private static boolean zzd = false;

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i2, Intent intent);

        void onProviderInstalled();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0132 A[Catch: all -> 0x0281, TryCatch #0 {, blocks: (B:8:0x004e, B:10:0x0053, B:11:0x006b, B:13:0x0071, B:14:0x008b, B:18:0x00d6, B:19:0x00f4, B:21:0x00fa, B:22:0x011d, B:23:0x0126, B:25:0x0128, B:48:0x0242, B:49:0x0253, B:51:0x0255, B:52:0x0280, B:28:0x0132, B:30:0x0138, B:31:0x018e, B:33:0x0194, B:34:0x01ae, B:35:0x01b9, B:36:0x01c0, B:38:0x01e0, B:39:0x01e4, B:41:0x01e6, B:42:0x0216, B:44:0x021c, B:45:0x0235, B:16:0x009b), top: B:56:0x004e, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0242 A[Catch: all -> 0x0281, TryCatch #0 {, blocks: (B:8:0x004e, B:10:0x0053, B:11:0x006b, B:13:0x0071, B:14:0x008b, B:18:0x00d6, B:19:0x00f4, B:21:0x00fa, B:22:0x011d, B:23:0x0126, B:25:0x0128, B:48:0x0242, B:49:0x0253, B:51:0x0255, B:52:0x0280, B:28:0x0132, B:30:0x0138, B:31:0x018e, B:33:0x0194, B:34:0x01ae, B:35:0x01b9, B:36:0x01c0, B:38:0x01e0, B:39:0x01e4, B:41:0x01e6, B:42:0x0216, B:44:0x021c, B:45:0x0235, B:16:0x009b), top: B:56:0x004e, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0255 A[Catch: all -> 0x0281, TryCatch #0 {, blocks: (B:8:0x004e, B:10:0x0053, B:11:0x006b, B:13:0x0071, B:14:0x008b, B:18:0x00d6, B:19:0x00f4, B:21:0x00fa, B:22:0x011d, B:23:0x0126, B:25:0x0128, B:48:0x0242, B:49:0x0253, B:51:0x0255, B:52:0x0280, B:28:0x0132, B:30:0x0138, B:31:0x018e, B:33:0x0194, B:34:0x01ae, B:35:0x01b9, B:36:0x01c0, B:38:0x01e0, B:39:0x01e4, B:41:0x01e6, B:42:0x0216, B:44:0x021c, B:45:0x0235, B:16:0x009b), top: B:56:0x004e, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void installIfNeeded(android.content.Context r19) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.security.ProviderInstaller.installIfNeeded(android.content.Context):void");
    }

    public static void installIfNeededAsync(Context context, ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new zza(context, providerInstallListener).execute(new Void[0]);
    }

    private static void zzb(Context context, Context context2, String str) throws Throwable {
        try {
            if (zzc == null) {
                Class<?>[] clsArr = {Context.class};
                String strVd = Wg.vd("rx~qwzWz\u0001\t|xr\u0001", (short) (C1607wl.Xd() ^ 3681));
                Class<?> cls = Class.forName(Qg.kd("\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u000b\u0016\u0014\u0019\t\u0011\u0016Nb\u000e\f\u0011\u0001\u0013\u000e", (short) (C1580rY.Xd() ^ (-4884)), (short) (C1580rY.Xd() ^ (-513))));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (C1607wl.Xd() ^ IDGetFaceController.FACE_DATA_RESULT_MAX_LOCAL_REINTENTS);
                short sXd2 = (short) (C1607wl.Xd() ^ 16159);
                int[] iArr = new int["\u0013\u0010\u001ek\u0014\b\u0019\u0018o\u0012\u0003\u0005\u0005\u0011".length()];
                QB qb = new QB("\u0013\u0010\u001ek\u0014\b\u0019\u0018o\u0012\u0003\u0005\u0005\u0011");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr2);
                try {
                    method.setAccessible(true);
                    zzc = ((ClassLoader) method.invoke(context, objArr)).loadClass(str).getMethod(strVd, clsArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            zzc.invoke(null, context);
        } catch (Exception e3) {
            Throwable cause = e3.getCause();
            if (Log.isLoggable(C1561oA.ud("9ZV\\NHHT*NRR>HG?K", (short) (OY.Xd() ^ 15937)), 6)) {
                C1561oA.yd("\b$)-++c99j17AC-9>r@CEM=9?M\u0012x", (short) (FB.Xd() ^ 20593)).concat(String.valueOf(cause == null ? e3.toString() : cause.toString()));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
