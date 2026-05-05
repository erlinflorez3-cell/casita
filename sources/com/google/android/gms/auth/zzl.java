package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";
    public static final String[] zza = {"com.google", "com.google.work", "cn.google"};
    public static final String zzb = "androidPackageName";
    private static final ComponentName zzc = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final Logger zzd = zzd.zza("GoogleAuthUtil");

    zzl() {
    }

    public static void clearToken(Context context, String str) throws Throwable {
        zze(context, str, 0L);
    }

    public static List<AccountChangeEvent> getAccountChangeEvents(Context context, int i2, String str) throws Throwable {
        Preconditions.checkNotEmpty(str, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzk(context, 8400000);
        AccountChangeEventsRequest accountChangeEventsRequest = new AccountChangeEventsRequest();
        accountChangeEventsRequest.setAccountName(str);
        accountChangeEventsRequest.setEventIndex(i2);
        zzdc.zzd(context);
        if (zzhw.zzd() && zzp(context)) {
            try {
                AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzi(com.google.android.gms.internal.auth.zzh.zza(context).zzb(accountChangeEventsRequest), "account change events retrieval");
                zzj(accountChangeEventsResponse);
                return accountChangeEventsResponse.getEvents();
            } catch (ApiException e2) {
                zzl(e2, "account change events retrieval");
            }
        }
        return (List) zzh(context, zzc, new zzi(accountChangeEventsRequest), 0L, null);
    }

    public static String getAccountId(Context context, String str) throws Throwable {
        Preconditions.checkNotEmpty(str, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzk(context, 8400000);
        return getToken(context, str, "^^_account_id_^^", new Bundle());
    }

    public static String getToken(Context context, Account account, String str) throws IOException, GoogleAuthException {
        return getToken(context, account, str, new Bundle());
    }

    public static String getToken(Context context, Account account, String str, Bundle bundle) throws IOException, GoogleAuthException {
        zzo(account);
        return zza(context, account, str, bundle, 0L, null).zza();
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2) throws IOException, GoogleAuthException {
        return getToken(context, new Account(str, "com.google"), str2);
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2, Bundle bundle) throws IOException, GoogleAuthException {
        return getToken(context, new Account(str, "com.google"), str2, bundle);
    }

    @Deprecated
    public static void invalidateToken(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    public static Bundle removeAccount(Context context, final Account account) throws Throwable {
        Preconditions.checkNotNull(context);
        zzo(account);
        zzk(context, 8400000);
        zzdc.zzd(context);
        if (zzhw.zze() && zzp(context)) {
            try {
                Bundle bundle = (Bundle) zzi(com.google.android.gms.internal.auth.zzh.zza(context).zzd(account), "account removal");
                zzj(bundle);
                return bundle;
            } catch (ApiException e2) {
                zzl(e2, "account removal");
            }
        }
        return (Bundle) zzh(context, zzc, new zzk() { // from class: com.google.android.gms.auth.zzf
            @Override // com.google.android.gms.auth.zzk
            public final Object zza(IBinder iBinder) throws RemoteException, IOException {
                Bundle bundleZzf = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzf(account);
                if (bundleZzf != null) {
                    return bundleZzf;
                }
                throw new IOException("Service call returned null.");
            }
        }, 0L, null);
    }

    public static Boolean requestGoogleAccountsAccess(Context context) throws Throwable {
        Preconditions.checkNotNull(context);
        zzk(context, 11400000);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("\u001b) /-($n%229+5<v\r::A3GD", (short) (FB.Xd() ^ 24647))).getMethod(Xg.qd("\b\u0007\u0017d\u0015\u0016\u0013\u0011\f\u000b\u001f\u0015\u001c\u001cw\u001e\u0017!", (short) (C1607wl.Xd() ^ 8566), (short) (C1607wl.Xd() ^ 4789)), new Class[0]);
        try {
            method.setAccessible(true);
            String str = ((ApplicationInfo) method.invoke(context, objArr)).packageName;
            zzdc.zzd(context);
            if (zzhw.zze() && zzp(context)) {
                Task taskZze = com.google.android.gms.internal.auth.zzh.zza(context).zze(str);
                String strWd = Jg.Wd("Z\u0012EX\u00113\u0001}\u0013>{\u001dIx\tpEr&A\u0003.my\u007f7lw7c", (short) (Od.Xd() ^ (-21984)), (short) (Od.Xd() ^ (-23133)));
                try {
                    Bundle bundle = (Bundle) zzi(taskZze, strWd);
                    String string = bundle.getString(ZO.xd("4\u0017ypM", (short) (C1499aX.Xd() ^ (-17206)), (short) (C1499aX.Xd() ^ (-22505))));
                    Intent intent = (Intent) bundle.getParcelable(C1626yg.Ud("=\u007f?\u0011U\u001b))FE,N\b&>I\u0004J", (short) (C1633zX.Xd() ^ (-21774)), (short) (C1633zX.Xd() ^ (-29070))));
                    PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(Ig.wd("2bF8O=SwK.Abf\u0006\u0013&bi\u001a\u007fb\u0018\u0017(g", (short) (C1607wl.Xd() ^ 4461)));
                    if (zzby.SUCCESS.equals(zzby.zza(string))) {
                        return true;
                    }
                    zzn(context, EO.Od("|\u0018V\u0002\u0019tA\f_\u0013\t,T*t\u0012Sc\u00042leVZ71\u0014", (short) (C1580rY.Xd() ^ (-1740))), string, intent, pendingIntent);
                    short sXd = (short) (C1607wl.Xd() ^ 16258);
                    int[] iArr = new int["5Y`JTPJ\u0005WWCUE\r}0DJOE<E|Is;3A@4<".length()];
                    QB qb = new QB("5Y`JTPJ\u0005WWCUE\r}0DJOE<E|Is;3A@4<");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    throw new GoogleAuthException(new String(iArr, 0, i2));
                } catch (ApiException e2) {
                    zzl(e2, strWd);
                }
            }
            return (Boolean) zzh(context, zzc, new zzj(str, context), 0L, null);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static TokenData zza(final Context context, final Account account, final String str, Bundle bundle, long j2, Executor executor) throws Throwable {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        Preconditions.checkNotEmpty(str, "Scope cannot be empty or null.");
        zzo(account);
        zzk(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzm(context, bundle2);
        zzdc.zzd(context);
        if (zzhw.zze() && zzp(context)) {
            try {
                Bundle bundle3 = (Bundle) zzi(com.google.android.gms.internal.auth.zzh.zza(context).zzc(account, str, bundle2), "token retrieval");
                zzj(bundle3);
                return zzg(context, "getTokenWithDetails", bundle3);
            } catch (ApiException e2) {
                zzl(e2, "token retrieval");
            }
        }
        return (TokenData) zzh(context, zzc, new zzk() { // from class: com.google.android.gms.auth.zzg
            @Override // com.google.android.gms.auth.zzk
            public final Object zza(IBinder iBinder) {
                return zzl.zzb(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    static /* synthetic */ TokenData zzb(Account account, String str, Bundle bundle, Context context, IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle bundleZze = com.google.android.gms.internal.auth.zze.zzb(iBinder).zze(account, str, bundle);
        if (bundleZze != null) {
            return zzg(context, "getTokenWithDetails", bundleZze);
        }
        throw new IOException("Service call returned null");
    }

    static /* bridge */ /* synthetic */ Object zzc(Object obj) throws IOException {
        zzj(obj);
        return obj;
    }

    public static void zze(Context context, String str, long j2) throws Throwable {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzk(context, 8400000);
        Bundle bundle = new Bundle();
        zzm(context, bundle);
        zzdc.zzd(context);
        if (zzhw.zze() && zzp(context)) {
            com.google.android.gms.internal.auth.zzg zzgVarZza = com.google.android.gms.internal.auth.zzh.zza(context);
            zzbw zzbwVar = new zzbw();
            zzbwVar.zza(str);
            try {
                zzi(zzgVarZza.zza(zzbwVar), "clear token");
                return;
            } catch (ApiException e2) {
                zzl(e2, "clear token");
            }
        }
        zzh(context, zzc, new zzh(str, bundle), 0L, null);
    }

    static void zzf(Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
        try {
            Intent.parseUri(intent.toUri(1), 1);
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    private static TokenData zzg(Context context, String str, Bundle bundle) throws GoogleAuthException, IOException {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        zzn(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new GoogleAuthException("Invalid state. Shouldn't happen");
    }

    private static Object zzh(Context context, ComponentName componentName, zzk zzkVar, long j2, Executor executor) throws IOException, GoogleAuthException {
        BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(context);
        try {
            try {
                if (!gmsClientSupervisor.bindService(componentName, blockingServiceConnection, "GoogleAuthUtil", null)) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return zzkVar.zza(blockingServiceConnection.getService());
                } catch (RemoteException | InterruptedException | TimeoutException e2) {
                    throw new IOException("Error on service connection.", e2);
                }
            } finally {
                gmsClientSupervisor.unbindService(componentName, blockingServiceConnection, "GoogleAuthUtil");
            }
        } catch (SecurityException e3) {
            String.format("SecurityException while bind to auth service: %s", e3.getMessage());
            throw new IOException("SecurityException while binding to Auth service.", e3);
        }
    }

    private static Object zzi(Task task, String str) throws IOException, ApiException {
        try {
            return Tasks.await(task);
        } catch (InterruptedException e2) {
            String str2 = String.format("Interrupted while waiting for the task of %s to finish.", str);
            zzd.w(str2, new Object[0]);
            throw new IOException(str2, e2);
        } catch (CancellationException e3) {
            String str3 = String.format("Canceled while waiting for the task of %s to finish.", str);
            zzd.w(str3, new Object[0]);
            throw new IOException(str3, e3);
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof ApiException) {
                throw ((ApiException) cause);
            }
            String str4 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            zzd.w(str4, new Object[0]);
            throw new IOException(str4, e4);
        }
    }

    private static Object zzj(Object obj) throws IOException {
        if (obj != null) {
            return obj;
        }
        zzd.w("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void zzk(Context context, int i2) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("q\u007fv\u0006\u0004~zE{\t\t\u0010\u0002\f\u0013Mc\u0011\u0011\u0018\n\u001e\u001b", (short) (C1580rY.Xd() ^ (-17473)), (short) (C1580rY.Xd() ^ (-13910)))).getMethod(C1561oA.od("QN\\(VUPLEBTHMK\u001fJHM=OJ", (short) (OY.Xd() ^ 29308)), new Class[0]);
            try {
                method.setAccessible(true);
                GooglePlayServicesUtilLight.ensurePlayServicesAvailable((Context) method.invoke(context, objArr), i2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (GooglePlayServicesIncorrectManifestValueException e3) {
            e = e3;
            throw new GoogleAuthException(e.getMessage(), e);
        } catch (GooglePlayServicesNotAvailableException e4) {
            e = e4;
            throw new GoogleAuthException(e.getMessage(), e);
        } catch (GooglePlayServicesRepairableException e5) {
            throw new GooglePlayServicesAvailabilityException(e5.getConnectionStatusCode(), e5.getMessage(), e5.getIntent());
        }
    }

    private static void zzl(ApiException apiException, String str) {
        zzd.w("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(apiException));
    }

    private static void zzm(Context context, Bundle bundle) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("z\t\u007f\u000f\r\b\u0004N\u0005\u0012\u0012\u0019\u000b\u0015\u001cVl\u001a\u001a!\u0013'$", (short) (C1633zX.Xd() ^ (-20949)))).getMethod(Wg.Zd("*\u000bt$5\u0018rY.\u0007|_8\u001a^f5)", (short) (ZN.Xd() ^ 9203), (short) (ZN.Xd() ^ 14273)), new Class[0]);
        try {
            method.setAccessible(true);
            String str = ((ApplicationInfo) method.invoke(context, objArr)).packageName;
            bundle.putString(C1561oA.Xd("gqolv}Zloxovu_s\u0001y", (short) (C1580rY.Xd() ^ (-27161))), str);
            String str2 = zzb;
            if (TextUtils.isEmpty(bundle.getString(str2))) {
                bundle.putString(str2, str);
            }
            bundle.putLong(Wg.vd("[L\\_MFKDCNPOA>RFgeYlhThiOc[^QJ[V433<", (short) (C1633zX.Xd() ^ (-26407))), SystemClock.elapsedRealtime());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) throws GoogleAuthException, IOException {
        zzby zzbyVarZza = zzby.zza(str2);
        Logger logger = zzd;
        logger.w(String.format("[GoogleAuthUtil] error status:%s with method:%s", zzbyVarZza, str), new Object[0]);
        if (!zzby.BAD_AUTHENTICATION.equals(zzbyVarZza) && !zzby.CAPTCHA.equals(zzbyVarZza) && !zzby.NEED_PERMISSION.equals(zzbyVarZza) && !zzby.NEED_REMOTE_CONSENT.equals(zzbyVarZza) && !zzby.NEEDS_BROWSER.equals(zzbyVarZza) && !zzby.USER_CANCEL.equals(zzbyVarZza) && !zzby.DEVICE_MANAGEMENT_REQUIRED.equals(zzbyVarZza) && !zzby.DM_INTERNAL_ERROR.equals(zzbyVarZza) && !zzby.DM_SYNC_DISABLED.equals(zzbyVarZza) && !zzby.DM_ADMIN_BLOCKED.equals(zzbyVarZza) && !zzby.DM_ADMIN_PENDING_APPROVAL.equals(zzbyVarZza) && !zzby.DM_STALE_SYNC_REQUIRED.equals(zzbyVarZza) && !zzby.DM_DEACTIVATED.equals(zzbyVarZza) && !zzby.DM_REQUIRED.equals(zzbyVarZza) && !zzby.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(zzbyVarZza) && !zzby.DM_SCREENLOCK_REQUIRED.equals(zzbyVarZza)) {
            if (!zzby.NETWORK_ERROR.equals(zzbyVarZza) && !zzby.SERVICE_UNAVAILABLE.equals(zzbyVarZza) && !zzby.INTNERNAL_ERROR.equals(zzbyVarZza) && !zzby.AUTH_SECURITY_ERROR.equals(zzbyVarZza) && !zzby.ACCOUNT_NOT_PRESENT.equals(zzbyVarZza)) {
                throw new GoogleAuthException(str2);
            }
            throw new IOException(str2);
        }
        zzdc.zzd(context);
        if (!zzht.zzc()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.zza(str2, intent, pendingIntent);
        }
        if (GoogleApiAvailability.getInstance().getApkVersion(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            logger.e(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.MAX_VALUE, str, Integer.MAX_VALUE), new Object[0]);
        }
        if (intent == null) {
            logger.e(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    private static void zzo(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = zza;
        for (int i2 = 0; i2 < 3; i2++) {
            if (strArr[i2].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static boolean zzp(Context context) throws Throwable {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 17895000) != 0) {
            return false;
        }
        List listZzq = zzhw.zzb().zzq();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("\u0013\u001f\u0014!\u001d\u0016\u0010X\r\u0018\u0016\u001b\u000b\u0013\u0018Pd\u0010\u000e\u0013\u0003\u0015\u0010", (short) (FB.Xd() ^ 25642), (short) (FB.Xd() ^ 4949))).getMethod(hg.Vd("FCQ\u001dKJEA:7I=B@\u001a>5=", (short) (C1607wl.Xd() ^ IptcDirectory.TAG_CAPTION_WRITER), (short) (C1607wl.Xd() ^ 237)), new Class[0]);
        try {
            method.setAccessible(true);
            String str = ((ApplicationInfo) method.invoke(context, objArr)).packageName;
            Iterator it = listZzq.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(str)) {
                    return false;
                }
            }
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
