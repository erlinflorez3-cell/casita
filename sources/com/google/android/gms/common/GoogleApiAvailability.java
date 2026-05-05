package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.braze.Constants;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import io.sentry.protocol.SentryStackFrame;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
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
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {com.google.android.gms.internal.base.zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private String zac;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final Task zai(HasApiKey hasApiKey, HasApiKey... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zaj().zam(arrayList);
    }

    public Task<Void> checkApiAvailability(GoogleApi<?> googleApi, GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i2 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    public Task<Void> checkApiAvailability(HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i2 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    public Dialog getErrorDialog(Activity activity, int i2, int i3) {
        return getErrorDialog(activity, i2, i3, (DialogInterface.OnCancelListener) null);
    }

    public Dialog getErrorDialog(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i2, zag.zab(activity, getErrorResolutionIntent(activity, i2, "d"), i3), onCancelListener, null);
    }

    public Dialog getErrorDialog(Fragment fragment, int i2, int i3) {
        return getErrorDialog(fragment, i2, i3, (DialogInterface.OnCancelListener) null);
    }

    public Dialog getErrorDialog(Fragment fragment, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) throws Throwable {
        return zaa(fragment.requireContext(), i2, zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i2, "d"), i3), onCancelListener, null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public Intent getErrorResolutionIntent(Context context, int i2, String str) throws Throwable {
        return super.getErrorResolutionIntent(context, i2, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i2, int i3) {
        return super.getErrorResolutionPendingIntent(context, i2, i3);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final String getErrorString(int i2) {
        return super.getErrorString(i2);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ResultIgnorabilityUnspecified
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(Context context, int i2) {
        return super.isGooglePlayServicesAvailable(context, i2);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i2) {
        return super.isUserResolvableError(i2);
    }

    public Task<Void> makeGooglePlayServicesAvailable(Activity activity) {
        int i2 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i2);
        if (iIsGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zacc zaccVarZaa = zacc.zaa(activity);
        zaccVarZaa.zah(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        return zaccVarZaa.zad();
    }

    public void setDefaultNotificationChannelId(Context context, String str) throws Throwable {
        if (PlatformVersion.isAtLeastO()) {
            short sXd = (short) (C1633zX.Xd() ^ (-26967));
            short sXd2 = (short) (C1633zX.Xd() ^ (-27336));
            int[] iArr = new int["|~\u0005zx|wv\u000b\u0001\b\b".length()];
            QB qb = new QB("|~\u0005zx|wv\u000b\u0001\b\b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            String str2 = new String(iArr, 0, i2);
            Class<?> cls = Class.forName(C1561oA.od("frgtpic,`kin^fk$8cafVhc", (short) (OY.Xd() ^ 27025)));
            Class<?>[] clsArr = {Class.forName(C1561oA.Kd("tl\u0003n<{q\u007fyAg\n\t\u0001\u0007\u0001", (short) (OY.Xd() ^ 21284)))};
            Object[] objArr = {str2};
            short sXd3 = (short) (C1607wl.Xd() ^ 29056);
            short sXd4 = (short) (C1607wl.Xd() ^ 9559);
            int[] iArr2 = new int["Gc\u0016O\u0018m\u0012!\b\r| K\u001d9\u001f".length()];
            QB qb2 = new QB("Gc\u0016O\u0018m\u0012!\b\r| K\u001d9\u001f");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd4) ^ sXd3) + xuXd2.CK(iKK2));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                Preconditions.checkNotNull(((NotificationManager) Preconditions.checkNotNull(method.invoke(context, objArr))).getNotificationChannel(str));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i2, int i3) {
        return showErrorDialogFragment(activity, i2, i3, (DialogInterface.OnCancelListener) null);
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i2, i3, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public boolean showErrorDialogFragment(Activity activity, int i2, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher, DialogInterface.OnCancelListener onCancelListener) throws Throwable {
        Dialog dialogZaa = zaa(activity, i2, null, onCancelListener, new zac(this, activity, i2, activityResultLauncher));
        if (dialogZaa == null) {
            return false;
        }
        zad(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public void showErrorNotification(Context context, int i2) throws Throwable {
        zae(context, i2, null, getErrorResolutionPendingIntent(context, i2, 0, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID));
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) throws Throwable {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    final Dialog zaa(Context context, int i2, zag zagVar, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) throws Throwable {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("LZQ`^YU Vccj\\fm(>kkrdxu", (short) (C1580rY.Xd() ^ (-21060)))).getMethod(Wg.vd("EDT5JHQJ", (short) (C1580rY.Xd() ^ (-10554))), new Class[0]);
        try {
            method.setAccessible(true);
            ((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Qg.kd("\u0004\u0010\u0005\u0012\u000e\u0007\u0001I}\t\u0007\f{\u0004\tAU\u0001~\u0004s\u0006\u0001", (short) (OY.Xd() ^ 20167), (short) (OY.Xd() ^ 24930))).getMethod(hg.Vd("\u0006\u0003\u0011m\u007f\r\b\r\txy\u0007", (short) (C1633zX.Xd() ^ (-13209)), (short) (C1633zX.Xd() ^ (-25538))), new Class[0]);
            try {
                method2.setAccessible(true);
                AlertDialog.Builder builder = C1561oA.ud("\u000e!\u001d$\u001bbw\u001c\u0013\u001d\u001f\u0016[m\u0018\u0010\u001c\u001d", (short) (C1499aX.Xd() ^ (-12071))).equals(((Resources) method2.invoke(context, objArr2)).getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
                if (builder == null) {
                    builder = new AlertDialog.Builder(context);
                }
                builder.setMessage(com.google.android.gms.common.internal.zac.zac(context, i2));
                if (onCancelListener != null) {
                    builder.setOnCancelListener(onCancelListener);
                }
                String strZab = com.google.android.gms.common.internal.zac.zab(context, i2);
                DialogInterface.OnClickListener onClickListener2 = zagVar;
                if (strZab != null) {
                    if (zagVar == null) {
                        onClickListener2 = onClickListener;
                    }
                    builder.setPositiveButton(strZab, onClickListener2);
                }
                String strZaf = com.google.android.gms.common.internal.zac.zaf(context, i2);
                if (strZaf != null) {
                    builder.setTitle(strZaf);
                }
                String.format(C1561oA.yd("w(\u0018\u0015%\u001b\u001d\u0017\\\"$\u001d%)\u001eW+55c\b1.'93j\u001c5+@gH;EJ:54C|?Q=BF8:NRLXZ\u0002HS`cP\u001a\t-VVc[VhZa]Bbqphm7\u001ck", (short) (C1633zX.Xd() ^ (-12979))), Integer.valueOf(i2));
                new IllegalArgumentException();
                short sXd = (short) (FB.Xd() ^ 8237);
                int[] iArr = new int["\u007f)*#)#\u007f0*\u00039%.2(*264@F".length()];
                QB qb = new QB("\u007f)*#)#\u007f0*\u00039%.2(*264@F");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
                    i3++;
                }
                new String(iArr, 0, i3);
                return builder.create();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.zac.zac(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        zad(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @ResultIgnorabilityUnspecified
    public final zabx zac(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(SentryStackFrame.JsonKeys.PACKAGE);
        zabx zabxVar = new zabx(zabwVar);
        zao.zaa(context, zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabxVar;
        }
        zabwVar.zaa();
        zabxVar.zab();
        return null;
    }

    final void zad(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void zae(Context context, int i2, String str, PendingIntent pendingIntent) throws Throwable {
        String strVd;
        int i3;
        String.format(Xg.qd("\\cj8|\n\u000e\u0002=_oiAc\u001a\u0006\u000f\u0013\t\u000b\u0013\u0017\u0015!'\\Os!!\"\u001a\u0019+!((\r!03+4}f6od:(/\u0006n>", (short) (C1633zX.Xd() ^ (-16911)), (short) (C1633zX.Xd() ^ (-10468))), Integer.valueOf(i2), null);
        new IllegalArgumentException();
        short sXd = (short) (Od.Xd() ^ (-3492));
        short sXd2 = (short) (Od.Xd() ^ (-22228));
        int[] iArr = new int["\u001e\u0018%\n\u0004iRNL13+(\u0019z\ttdnN`".length()];
        QB qb = new QB("\u001e\u0018%\n\u0004iRNL13+(\u0019z\ttdnN`");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - ((i4 * sXd2) ^ sXd));
            i4++;
        }
        new String(iArr, 0, i4);
        if (i2 == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                ZO.xd("\tu(m@+V\bg\u001exX>.YX-=x\u001fk", (short) (OY.Xd() ^ 29347), (short) (OY.Xd() ^ 29214));
                C1626yg.Ud("6\u0003lFI\u001ae\u001b30Qk,\u001d\u001fM[h&wN\u001e\u001c\u000e\r\u000eP uX`t\u001a\f<u,DW\u001e!A*W\f\u0007x6\u0001]k\u0007@a\u001f\tQ[@+&8/yvhYV_$\u0004jlHQ[)*\u0018eU\u001eKih\n\u0016+_\u000eNV%#\u001a5\u001cUu)pEx5yb\u001ehqKA\u0018Lkpj't\rd\u001f>\u001d_;1\u0003Nops\u0010\u0013\u007f\u0004[\u0012c\n6]r8tV", (short) (OY.Xd() ^ 20182), (short) (OY.Xd() ^ 25922));
                return;
            }
            return;
        }
        String strZae = com.google.android.gms.common.internal.zac.zae(context, i2);
        String strZad = com.google.android.gms.common.internal.zac.zad(context, i2);
        short sXd3 = (short) (FB.Xd() ^ 27390);
        int[] iArr2 = new int[":\u001a\u001eSP\u0016t\u0006\u00150)Y\u001c#\u0001[8^5Cm8\"".length()];
        QB qb2 = new QB(":\u001a\u001eSP\u0016t\u0006\u00150)Y\u001c#\u0001[8^5Cm8\"");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd3 + i5)));
            i5++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr2, 0, i5)).getMethod(EO.Od("&V\u0014\u0012d?\u001fm)^Z\u000b", (short) (C1633zX.Xd() ^ (-20929))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            String strQd = C1561oA.Qd("^^bVRTMJ\\PUS", (short) (Od.Xd() ^ (-19252)));
            Class<?> cls = Class.forName(C1593ug.zd("x\u0007}\r\u000b\u0006\u0002L\u0003\u0010\u0010\u0017\t\u0013\u001aTj\u0018\u0018\u001f\u0011%\"", (short) (C1499aX.Xd() ^ (-31451)), (short) (C1499aX.Xd() ^ (-7561))));
            Class<?>[] clsArr = new Class[1];
            short sXd4 = (short) (C1580rY.Xd() ^ (-11414));
            int[] iArr3 = new int["pfzd0mame+Oolbf^".length()];
            QB qb3 = new QB("pfzd0mame+Oolbf^");
            int i6 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i6] = xuXd3.fK(sXd4 + sXd4 + i6 + xuXd3.CK(iKK3));
                i6++;
            }
            clsArr[0] = Class.forName(new String(iArr3, 0, i6));
            Object[] objArr2 = {strQd};
            Method method2 = cls.getMethod(C1561oA.Kd(";:J*QLN@I0CQVJEH", (short) (C1633zX.Xd() ^ (-12555))), clsArr);
            try {
                method2.setAccessible(true);
                NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(method2.invoke(context, objArr2));
                NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(strZae).setStyle(new NotificationCompat.BigTextStyle().bigText(strZad));
                if (DeviceProperties.isWearable(context)) {
                    Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(Wg.Zd("\u0018SVy\u0004\u000b#sB_g\u0007\u0001\u001b<z-fr.,Nc", (short) (C1607wl.Xd() ^ 13472), (short) (C1607wl.Xd() ^ 11337))).getMethod(C1561oA.Xd("BAQ\u001fOPMKFEYOVV2XQ[", (short) (ZN.Xd() ^ 27486)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        style.setSmallIcon(((ApplicationInfo) method3.invoke(context, objArr3)).icon).setPriority(2);
                        if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                            style.addAction(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), pendingIntent);
                        } else {
                            style.setContentIntent(pendingIntent);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    style.setSmallIcon(android.R.drawable.stat_sys_warning).setTicker(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(strZad);
                }
                if (PlatformVersion.isAtLeastO()) {
                    Preconditions.checkState(PlatformVersion.isAtLeastO());
                    synchronized (zaa) {
                        strVd = this.zac;
                    }
                    if (strVd == null) {
                        strVd = Wg.vd("`ml.`ijcqk5iofusvr=wv}9m\fw\u0001\u0005rt|\u0001\u0007\u0013\u0019", (short) (C1607wl.Xd() ^ 12385));
                        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(strVd);
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(Qg.kd("IUJWSLF\u000fCNLQAIN\u0007\u001bFDI9KF", (short) (OY.Xd() ^ 7543), (short) (OY.Xd() ^ 26300))).getMethod(hg.Vd("HES0BOJOK;<I", (short) (C1633zX.Xd() ^ (-28575)), (short) (C1633zX.Xd() ^ (-4422))), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            String string = ((Resources) method4.invoke(context, objArr4)).getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
                            if (notificationChannel == null) {
                                notificationManager.createNotificationChannel(new NotificationChannel(strVd, string, 4));
                            } else if (!string.contentEquals(notificationChannel.getName())) {
                                notificationChannel.setName(string);
                                notificationManager.createNotificationChannel(notificationChannel);
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    style.setChannelId(strVd);
                }
                Notification notificationBuild = style.build();
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
                    i3 = 10436;
                } else {
                    i3 = 39789;
                }
                notificationManager.notify(i3, notificationBuild);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    final void zaf(Context context) {
        new zad(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean zag(Activity activity, LifecycleFragment lifecycleFragment, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) throws Throwable {
        Dialog dialogZaa = zaa(activity, i2, zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i2, "d"), 2), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        zad(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(Context context, ConnectionResult connectionResult, int i2) throws Throwable {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        int errorCode = connectionResult.getErrorCode();
        Intent intentZaa = GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i2, true);
        int i3 = zap.zaa;
        zae(context, errorCode, null, PendingIntent.getActivity(context, 0, intentZaa, (i3 + 134217728) - (i3 & 134217728)));
        return true;
    }
}
