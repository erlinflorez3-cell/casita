package com.google.firebase.messaging;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
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

/* JADX INFO: loaded from: classes7.dex */
public final class CommonNotificationBuilder {
    private static final String ACTION_RECEIVER = "com.google.android.c2dm.intent.RECEIVE";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    private static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE = "Misc";
    private static final int ILLEGAL_RESOURCE_ID = 0;
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";
    private static final AtomicInteger requestCodeProvider = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class DisplayNotificationInfo {
        public final int id;
        public final NotificationCompat.Builder notificationBuilder;
        public final String tag;

        DisplayNotificationInfo(NotificationCompat.Builder builder, String str, int i2) {
            this.notificationBuilder = builder;
            this.tag = str;
            this.id = i2;
        }
    }

    private CommonNotificationBuilder() {
    }

    private static PendingIntent createContentIntent(Context context, NotificationParams notificationParams, String str, PackageManager packageManager) throws Throwable {
        Intent intentCreateTargetIntent = createTargetIntent(str, notificationParams, packageManager);
        if (intentCreateTargetIntent == null) {
            return null;
        }
        intentCreateTargetIntent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        intentCreateTargetIntent.putExtras(notificationParams.paramsWithReservedKeysRemoved());
        if (shouldUploadMetrics(notificationParams)) {
            intentCreateTargetIntent.putExtra(Constants.MessageNotificationKeys.ANALYTICS_DATA, notificationParams.paramsForAnalyticsIntent());
        }
        return PendingIntent.getActivity(context, generatePendingIntentRequestCode(), intentCreateTargetIntent, getPendingIntentFlags(1073741824));
    }

    private static PendingIntent createDeleteIntent(Context context, Context context2, NotificationParams notificationParams) {
        if (shouldUploadMetrics(notificationParams)) {
            return createMessagingPendingIntent(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(notificationParams.paramsForAnalyticsIntent()));
        }
        return null;
    }

    private static PendingIntent createMessagingPendingIntent(Context context, Context context2, Intent intent) throws Throwable {
        int iGeneratePendingIntentRequestCode = generatePendingIntentRequestCode();
        short sXd = (short) (C1633zX.Xd() ^ (-21973));
        int[] iArr = new int["1>=~9BC<B<\u0006:H?NLGC\u000eD\u0014GQ\u0013OU\\NX_\u001a?325:H8".length()];
        QB qb = new QB("1>=~9BC<B<\u0006:H?NLGC\u000eD\u0014GQ\u0013OU\\NX_\u001a?325:H8");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Intent intent2 = new Intent(new String(iArr, 0, i2));
        Class<?> cls = Class.forName(Xg.qd("TbYhfa](^kkrdnu0Fsszl\u0001}", (short) (C1607wl.Xd() ^ 4503), (short) (C1607wl.Xd() ^ 25248)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1607wl.Xd() ^ 1816);
        short sXd3 = (short) (C1607wl.Xd() ^ 28506);
        int[] iArr2 = new int["Sy\u0016Zx$9\u0018\u001b\"7SLM".length()];
        QB qb2 = new QB("Sy\u0016Zx$9\u0018\u001b\"7SLM");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            return PendingIntent.getBroadcast(context, iGeneratePendingIntentRequestCode, intent2.setPackage((String) method.invoke(context2, objArr)).putExtra(ZO.xd("o?\u000bS>4]M{D\u0015B\u001be", (short) (C1633zX.Xd() ^ (-2480)), (short) (C1633zX.Xd() ^ (-14160))), intent), getPendingIntentFlags(1073741824));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, Context context2, NotificationParams notificationParams, String str, Bundle bundle) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("T\u00190`<|b\u0003t\u0013+R\u0010\u000e~\u0001H\u0002Xq+tI", (short) (Od.Xd() ^ (-15550)), (short) (Od.Xd() ^ (-11094)))).getMethod(Ig.wd("\u001ba\r\u000fe\"\u0004p#c4_<@", (short) (FB.Xd() ^ 14645)), new Class[0]);
        try {
            method.setAccessible(true);
            String str2 = (String) method.invoke(context2, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(EO.Od("V\u0012,_>}Zu~\u001c3]}z\u001f\u007f:~'\u00037\b(", (short) (C1580rY.Xd() ^ (-19598)))).getMethod(C1561oA.Qd("96D!3@;@<,-:", (short) (Od.Xd() ^ (-26337))), new Class[0]);
            try {
                method2.setAccessible(true);
                Resources resources = (Resources) method2.invoke(context2, objArr2);
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1593ug.zd("%3*972.x/<<C5?F\u0001\u0017DDK=QN", (short) (C1607wl.Xd() ^ 10356), (short) (C1607wl.Xd() ^ 4172))).getMethod(C1561oA.od("85C\u001e./6+0-\u0014'3%*'3", (short) (C1607wl.Xd() ^ 15405)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method3.invoke(context2, objArr3);
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(context2, str);
                    String possiblyLocalizedString = notificationParams.getPossiblyLocalizedString(resources, str2, C1561oA.Kd("SP[\u001d^\u001ff\\ha[", (short) (C1633zX.Xd() ^ (-8916))));
                    if (!TextUtils.isEmpty(possiblyLocalizedString)) {
                        builder.setContentTitle(possiblyLocalizedString);
                    }
                    short sXd = (short) (OY.Xd() ^ 12632);
                    short sXd2 = (short) (OY.Xd() ^ 27531);
                    int[] iArr = new int["CYtiC5\u001bDj\u0012".length()];
                    QB qb = new QB("CYtiC5\u001bDj\u0012");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                        i2++;
                    }
                    String possiblyLocalizedString2 = notificationParams.getPossiblyLocalizedString(resources, str2, new String(iArr, 0, i2));
                    if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
                        builder.setContentText(possiblyLocalizedString2);
                        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(possiblyLocalizedString2));
                    }
                    builder.setSmallIcon(getSmallIcon(packageManager, resources, str2, notificationParams.getString(C1561oA.Xd("OLW\u0019Z\u001bWR__", (short) (C1607wl.Xd() ^ 31176))), bundle));
                    Uri sound = getSound(str2, notificationParams, resources);
                    if (sound != null) {
                        builder.setSound(sound);
                    }
                    builder.setContentIntent(createContentIntent(context, notificationParams, str2, packageManager));
                    PendingIntent pendingIntentCreateDeleteIntent = createDeleteIntent(context, context2, notificationParams);
                    if (pendingIntentCreateDeleteIntent != null) {
                        builder.setDeleteIntent(pendingIntentCreateDeleteIntent);
                    }
                    Integer color = getColor(context2, notificationParams.getString(Wg.vd("\u0017\u0012\u001f^\"`\u0019$$&,", (short) (C1633zX.Xd() ^ (-25979)))), bundle);
                    if (color != null) {
                        builder.setColor(color.intValue());
                    }
                    short sXd3 = (short) (ZN.Xd() ^ 14884);
                    short sXd4 = (short) (ZN.Xd() ^ 4038);
                    int[] iArr2 = new int["#\u001e'f&d))\u001d\u0016\u001d*".length()];
                    QB qb2 = new QB("#\u001e'f&d))\u001d\u0016\u001d*");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(((sXd3 + i3) + xuXd2.CK(iKK2)) - sXd4);
                        i3++;
                    }
                    builder.setAutoCancel(!notificationParams.getBoolean(new String(iArr2, 0, i3)));
                    builder.setLocalOnly(notificationParams.getBoolean(hg.Vd("\f\u0007\u0010O\u000fM\u000b\r\u007f|\u0007x\b\u0006\u0003\u000f", (short) (C1607wl.Xd() ^ 5577), (short) (C1607wl.Xd() ^ 15152))));
                    short sXd5 = (short) (C1580rY.Xd() ^ (-17762));
                    int[] iArr3 = new int["D?H\bG\u0006K?8?8D".length()];
                    QB qb3 = new QB("D?H\bG\u0006K?8?8D");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(sXd5 + i4 + xuXd3.CK(iKK3));
                        i4++;
                    }
                    String string = notificationParams.getString(new String(iArr3, 0, i4));
                    if (string != null) {
                        builder.setTicker(string);
                    }
                    Integer notificationPriority = notificationParams.getNotificationPriority();
                    if (notificationPriority != null) {
                        builder.setPriority(notificationPriority.intValue());
                    }
                    Integer visibility = notificationParams.getVisibility();
                    if (visibility != null) {
                        builder.setVisibility(visibility.intValue());
                    }
                    Integer notificationCount = notificationParams.getNotificationCount();
                    if (notificationCount != null) {
                        builder.setNumber(notificationCount.intValue());
                    }
                    Long l2 = notificationParams.getLong(C1561oA.yd("nir2q0fvt|\u0002k\u007fsvm", (short) (FB.Xd() ^ 16532)));
                    if (l2 != null) {
                        builder.setShowWhen(true);
                        builder.setWhen(l2.longValue());
                    }
                    long[] vibrateTimings = notificationParams.getVibrateTimings();
                    if (vibrateTimings != null) {
                        builder.setVibrate(vibrateTimings);
                    }
                    int[] lightSettings = notificationParams.getLightSettings();
                    if (lightSettings != null) {
                        builder.setLights(lightSettings[0], lightSettings[1], lightSettings[2]);
                    }
                    builder.setDefaults(getConsolidatedDefaults(notificationParams));
                    return new DisplayNotificationInfo(builder, getTag(notificationParams), 0);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    static DisplayNotificationInfo createNotificationInfo(Context context, NotificationParams notificationParams) {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("esjywrn9o||\u0004u\u007f\u0007AW\u0005\u0005\f}\u0012\u000f", (short) (C1580rY.Xd() ^ (-8031)))).getMethod(Xg.qd("xw\bdvy\u0003y\u0001\u007fh}\f\u007f\u0007\u0006\u0014", (short) (C1580rY.Xd() ^ (-3765)), (short) (C1580rY.Xd() ^ (-15218))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Jg.Wd("-0(87/,w71B:=4Lw\u0017ABI<QK", (short) (C1499aX.Xd() ^ (-1302)), (short) (C1499aX.Xd() ^ (-1712)))).getMethod(ZO.xd("E\u001dFP*vv~^X\ta-'", (short) (Od.Xd() ^ (-32543)), (short) (Od.Xd() ^ (-16799))), new Class[0]);
            try {
                method2.setAccessible(true);
                Bundle manifestMetadata = getManifestMetadata(packageManager, (String) method2.invoke(context, objArr2));
                return createNotificationInfo(context, context, notificationParams, getOrCreateChannel(context, notificationParams.getNotificationChannelId(), manifestMetadata), manifestMetadata);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static Intent createTargetIntent(String str, NotificationParams notificationParams, PackageManager packageManager) throws Throwable {
        String string = notificationParams.getString(C1626yg.Ud("\u0013p\u000fSXL\u0016n\u000eS\u0006\u001fO\u0004 9*m", (short) (OY.Xd() ^ 496), (short) (OY.Xd() ^ 18623)));
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent(string);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri link = notificationParams.getLink();
        if (link != null) {
            Intent intent2 = new Intent(Ig.wd("*\t\r;i\u0006l/\u000b@H[\u0015\u0011Z\u0018pc!\u000fNV%\u0018(F", (short) (C1580rY.Xd() ^ (-14240))));
            intent2.setPackage(str);
            intent2.setData(link);
            return intent2;
        }
        Object[] objArr = {str};
        Method method = Class.forName(EO.Od("d\u0018Bu,\u0004Xk|\n\t+k\u0001|U=B<%q!EAr\u000b\u0016W\r\u0013c@'", (short) (C1499aX.Xd() ^ (-29059)))).getMethod(C1593ug.zd("EDT-CXRHN0V]OY`3]a@RU^U\\[", (short) (C1633zX.Xd() ^ (-25034)), (short) (C1633zX.Xd() ^ (-32023))), Class.forName(C1561oA.Qd("E;O9\u0005B6B:\u007f$DA7;3", (short) (C1580rY.Xd() ^ (-5700)))));
        try {
            method.setAccessible(true);
            Intent intent3 = (Intent) method.invoke(packageManager, objArr);
            if (intent3 == null) {
                C1561oA.od("f\t\u0011\u0003~|\u000e~e|\n\tuz{\u007fw", (short) (C1607wl.Xd() ^ 12079));
                short sXd = (short) (C1580rY.Xd() ^ (-27343));
                int[] iArr = new int["m\u0010A\u0004\u0007\u0019\u000f\u001d\u0011\u001d#J\u0012\u001c#\u001d\u0014P&\"S!\u0017,&\u001c\"Z\u001d-.".length()];
                QB qb = new QB("m\u0010A\u0004\u0007\u0019\u000f\u001d\u0011\u001d#J\u0012\u001c#\u001d\u0014P&\"S!\u0017,&\u001c\"Z\u001d-.");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                new String(iArr, 0, i2);
            }
            return intent3;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static int generatePendingIntentRequestCode() {
        return requestCodeProvider.incrementAndGet();
    }

    private static Integer getColor(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                String str2 = "Color is invalid: " + str + ". Notification will use default color.";
            }
        }
        int i2 = bundle.getInt(METADATA_DEFAULT_COLOR, 0);
        if (i2 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(ContextCompat.getColor(context, i2));
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    private static int getConsolidatedDefaults(NotificationParams notificationParams) {
        boolean z2 = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
        ?? r2 = z2;
        if (notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS)) {
            r2 = (z2 ? 1 : 0) | 2;
        }
        return notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS) ? (r2 + 4) - (r2 & 4) : r2;
    }

    private static Bundle getManifestMetadata(PackageManager packageManager, String str) throws Throwable {
        try {
            Class<?> cls = Class.forName(Wg.Zd("5\tlr]>%d\n\u001d\n\u0004bRHw&i\u001821\u001a\u000eyotJRM'\u001d\u0011\n", (short) (C1633zX.Xd() ^ (-15328)), (short) (C1633zX.Xd() ^ (-31755))));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.Xd(">6L8\u0006E;IC\u000b1SRJPJ", (short) (ZN.Xd() ^ 16936)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str, 128};
            Method method = cls.getMethod(Wg.vd("85G\u0013=<;7<9OCDB DGO", (short) (C1580rY.Xd() ^ (-24069))), clsArr);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(packageManager, objArr);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    return applicationInfo.metaData;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (PackageManager.NameNotFoundException e3) {
            String str2 = Qg.kd("R}\u0003xox0|'mjx#qxn\u001f_mlgc\\Yk_db\u0013[_V^(\r", (short) (OY.Xd() ^ 30730), (short) (OY.Xd() ^ 12298)) + e3;
            hg.Vd("$FN@<:K<#:GF389=5", (short) (C1499aX.Xd() ^ (-3354)), (short) (C1499aX.Xd() ^ (-14482)));
        }
        return Bundle.EMPTY;
    }

    public static String getOrCreateChannel(Context context, String str, Bundle bundle) throws Throwable {
        Object obj;
        String strOd;
        short sXd = (short) (C1607wl.Xd() ^ 13556);
        int[] iArr = new int["dpernga*^igl\\di\"6a_dTfa".length()];
        QB qb = new QB("dpernga*^igl\\di\"6a_dTfa");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = cls.getMethod(C1561oA.yd("hgsP^af]`_DYcWZYc", (short) (Od.Xd() ^ (-11093))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                short sXd2 = (short) (C1633zX.Xd() ^ (-22286));
                int[] iArr2 = new int["BPGVTOK\u0016LYY`R\\c\u001e4aahZnk".length()];
                QB qb2 = new QB("BPGVTOK\u0016LYY`R\\c\u001e4aahZnk");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                    i3++;
                }
                Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd3 = (short) (C1607wl.Xd() ^ 10612);
                short sXd4 = (short) (C1607wl.Xd() ^ 18399);
                int[] iArr3 = new int["]\\lI[^g^edNboh".length()];
                QB qb3 = new QB("]\\lI[^g^edNboh");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                    i4++;
                }
                Method method2 = cls2.getMethod(new String(iArr3, 0, i4), clsArr);
                try {
                    method2.setAccessible(true);
                    String str2 = (String) method2.invoke(context, objArr2);
                    Class<?> cls3 = Class.forName(Jg.Wd("R\\wd\u0007]{\"|Wk\u000fb\u0019\u0006Ls{\"`\tw%u!\\j[\fl\u0007$\u0016", (short) (Od.Xd() ^ (-30945)), (short) (Od.Xd() ^ (-15493))));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(ZO.xd(",&\u0015]?\u0011-Z;='\u0005rI\u0012\u0015", (short) (FB.Xd() ^ 4210), (short) (FB.Xd() ^ 4983)));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr3 = {str2, 0};
                    Method method3 = cls3.getMethod(C1626yg.Ud("&B\u0017XPGkm\u0007\u000b\u001c\\/~ \u00179N", (short) (C1633zX.Xd() ^ (-21557)), (short) (C1633zX.Xd() ^ (-10922))), clsArr2);
                    try {
                        method3.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method3.invoke(packageManager, objArr3);
                        String strWd = Ig.wd("f%Mw-yDf`\u0001}&c>`\u0001y\u0001i!\u0015E\u0017\u0014~tf\nyg\u0012\u001cwc", (short) (FB.Xd() ^ 22432));
                        String strOd2 = EO.Od("UxmAH\u001c\u001d8\u0012Ovg\u0017\u0001\u0005l", (short) (OY.Xd() ^ 23883));
                        try {
                            Class<?> cls4 = Class.forName(strWd);
                            Field field = 1 != 0 ? cls4.getField(strOd2) : cls4.getDeclaredField(strOd2);
                            field.setAccessible(true);
                            obj = field.get(applicationInfo);
                        } catch (Throwable th) {
                            obj = null;
                        }
                        if (((Integer) obj).intValue() < 26) {
                            return null;
                        }
                        Object[] objArr4 = {NotificationManager.class};
                        Method method4 = Class.forName(C1561oA.Qd("t\u0001u\u0003~wq:nyw|lty2Fqotdvq", (short) (C1633zX.Xd() ^ (-13495)))).getMethod(C1561oA.od("-*8\u0016;44$+\u0010!-0\"\u001b\u001c", (short) (C1499aX.Xd() ^ (-12185))), Class.forName(C1593ug.zd("80F2\u007f?5C=\u0005\u001bE;NO", (short) (ZN.Xd() ^ 25716), (short) (ZN.Xd() ^ 30478))));
                        try {
                            method4.setAccessible(true);
                            NotificationManager notificationManager = (NotificationManager) method4.invoke(context, objArr4);
                            boolean zIsEmpty = TextUtils.isEmpty(str);
                            short sXd5 = (short) (C1633zX.Xd() ^ (-10126));
                            int[] iArr4 = new int["Imwkii|oXq\u0001\u0002pwz\u0001z".length()];
                            QB qb4 = new QB("Imwkii|oXq\u0001\u0002pwz\u0001z");
                            int i5 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd5 + sXd5) + i5));
                                i5++;
                            }
                            new String(iArr4, 0, i5);
                            if (!zIsEmpty) {
                                if (notificationManager.getNotificationChannel(str) != null) {
                                    return str;
                                }
                                StringBuilder sbAppend = new StringBuilder(Wg.Zd("I\u0012?GLv%J\u0012.\\O\bO\f-\r5Sn) \u000b>v\u000e@xq\u0014g\u0017", (short) (C1580rY.Xd() ^ (-32691)), (short) (C1580rY.Xd() ^ (-9627)))).append(str);
                                short sXd6 = (short) (OY.Xd() ^ 28314);
                                int[] iArr5 = new int["ia+%8e57=i-12<n3C74H::v:RyODB}@PQ\u0010\u00031FTPNN]_\fP]]VZYhfVj`gg&\u001bko\u001ecegcxpy2'~jv\u0001q-\u0006x|}2uy5\f\u000b}}H".length()];
                                QB qb5 = new QB("ia+%8e57=i-12<n3C74H::v:RyODB}@PQ\u0010\u00031FTPNN]_\fP]]VZYhfVj`gg&\u001bko\u001ecegcxpy2'~jv\u0001q-\u0006x|}2uy5\f\u000b}}H");
                                int i6 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (sXd6 + i6));
                                    i6++;
                                }
                                sbAppend.append(new String(iArr5, 0, i6)).toString();
                            }
                            String string = bundle.getString(Wg.vd("*52q*10'+#j\"$,\u001e\u001a8I:\u0002@7DC056:2w--\r\u0007\u001a\u0010\u0017\u0001\u000f\u000f\u0013\u0007\u0003\u0005}z\r\u0001&$\u0014\u0017\u001b\u0013\u001f\u001e\u0014\u001a\f\u0015\u000f", (short) (C1580rY.Xd() ^ (-8271))));
                            if (TextUtils.isEmpty(string)) {
                                hg.Vd("x\u0014\u001d\u001c\u0011\u0015\rDg\b\b\u0002\u0015\u000b\u0012<i\n\u000e\u0002}\u007fxu\b{\u0001~/Qumyxnt'sjxdfbt`\u001efj\u001b;g\\ie^X@S_YUS``\u0019\n-MMGZPW\u0002WAKSB{RCEDv8:sHE64|", (short) (Od.Xd() ^ (-20537)), (short) (Od.Xd() ^ (-25989)));
                            } else {
                                if (notificationManager.getNotificationChannel(string) != null) {
                                    return string;
                                }
                                Qg.kd("Jjnb^`YVh\\a_\u00102VNZYOU\bZKY\u0004LP\u0001!MBOKD>&9E?;9FF~H<:l4,=h66:d&('/_\"0\"\u001d/\u001f\u001dW\u0019/T(\u001b\u0017P\u0011\u001f\u001eZKn\u000f\u000f\t\u001c\u0012\u0019C\u0019\u0003\r\u0015\u0004=\u0014\u0005\u0007\u00068y{5\n\u0007wu>", (short) (ZN.Xd() ^ 8533), (short) (ZN.Xd() ^ 30653));
                            }
                            String strUd = C1561oA.ud("/+4%+%/.#!\")\u001c**.\"\u001e \u0019\u0016(\u001c!\u001f\u000f\u0012\u0016\u000e\u001a\u0019\u000f\u0015", (short) (C1633zX.Xd() ^ (-25501)));
                            if (notificationManager.getNotificationChannel(strUd) == null) {
                                Object[] objArr5 = new Object[0];
                                Method method5 = Class.forName(C1561oA.yd("\u0016$\u0017&(#\u001be\u0010\u001d\u0019 \u0016 #]g\u0015\u0011\u0018\u000e\"\u001b", (short) (OY.Xd() ^ 13394))).getMethod(C1561oA.Yd("`_oNbqnusehw", (short) (C1607wl.Xd() ^ 24150)), new Class[0]);
                                try {
                                    method5.setAccessible(true);
                                    Resources resources = (Resources) method5.invoke(context, objArr5);
                                    String strQd = Xg.qd("VXWOUO", (short) (C1607wl.Xd() ^ 25117), (short) (C1607wl.Xd() ^ 17394));
                                    Object[] objArr6 = new Object[0];
                                    Method method6 = Class.forName(Jg.Wd("pN\u0015o=\bOikH\u0018j,\u0006XbHE\u0015g)\rU", (short) (C1607wl.Xd() ^ 27861), (short) (C1607wl.Xd() ^ 7098))).getMethod(ZO.xd(";0B3\u0015,j\u0003$\u00075>\t\r", (short) (C1499aX.Xd() ^ (-15243)), (short) (C1499aX.Xd() ^ (-25913))), new Class[0]);
                                    try {
                                        method6.setAccessible(true);
                                        String str3 = (String) method6.invoke(context, objArr6);
                                        short sXd7 = (short) (ZN.Xd() ^ 25670);
                                        short sXd8 = (short) (ZN.Xd() ^ 25294);
                                        int[] iArr6 = new int["\r8z K\u0016v'G3\u0017\u00071!Mm5+wq$wHLt\u0011+j\u000f-_\u00077Y\u0016?Fa\b".length()];
                                        QB qb6 = new QB("\r8z K\u0016v'G3\u0017\u00071!Mm5+wq$wHLt\u0011+j\u000f-_\u00077Y\u0016?Fa\b");
                                        int i7 = 0;
                                        while (qb6.YK()) {
                                            int iKK6 = qb6.KK();
                                            Xu xuXd6 = Xu.Xd(iKK6);
                                            iArr6[i7] = xuXd6.fK((C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + (i7 * sXd8))) + xuXd6.CK(iKK6));
                                            i7++;
                                        }
                                        int identifier = resources.getIdentifier(new String(iArr6, 0, i7), strQd, str3);
                                        if (identifier == 0) {
                                            Ig.wd("}m9\u0011\u0006!}\u0011(#!\t6\u001d\u00174\u00113xj!lIX-nL)nQ\u00146cud\u0019@Z@KMs\u0016(\u0003\u0010Gu\u001fEH\u0019yB\u0017)d\u0001 \u001c<(\r\u0014f5\u007f-\f\u0006A~\u0016c;\u0012v\rA$.fd7>S#\f_8vc'\u0011\\s\u001fI*\u0010\u007f\u0001{ H\r", (short) (C1607wl.Xd() ^ 20600));
                                            strOd = EO.Od("]2 m", (short) (C1580rY.Xd() ^ (-25498)));
                                        } else {
                                            Class<?> cls5 = Class.forName(C1561oA.Qd("KWLYUNH\u0011EPNSCKP\t\u001dHFK;MH", (short) (OY.Xd() ^ 14878)));
                                            Class<?>[] clsArr3 = {Integer.TYPE};
                                            Object[] objArr7 = {Integer.valueOf(identifier)};
                                            Method method7 = cls5.getMethod(C1593ug.zd("('7\u001798060", (short) (FB.Xd() ^ 12940), (short) (FB.Xd() ^ 20981)), clsArr3);
                                            try {
                                                method7.setAccessible(true);
                                                strOd = (String) method7.invoke(context, objArr7);
                                            } catch (InvocationTargetException e2) {
                                                throw e2.getCause();
                                            }
                                        }
                                        notificationManager.createNotificationChannel(new NotificationChannel(strUd, strOd, 3));
                                    } catch (InvocationTargetException e3) {
                                        throw e3.getCause();
                                    }
                                } catch (InvocationTargetException e4) {
                                    throw e4.getCause();
                                }
                            }
                            return strUd;
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                } catch (InvocationTargetException e7) {
                    throw e7.getCause();
                }
            } catch (InvocationTargetException e8) {
                throw e8.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int getPendingIntentFlags(int i2) {
        return (-1) - (((-1) - i2) & ((-1) - AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
    }

    private static int getSmallIcon(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) throws Throwable {
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        short sXd = (short) (OY.Xd() ^ 21788);
        int[] iArr = new int["c\u0006\u000e\u007f{y\u000b{by\u0007\u0006rwx|t".length()];
        QB qb = new QB("c\u0006\u000e\u007f{y\u000b{by\u0007\u0006rwx|t");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        new String(iArr, 0, i2);
        if (!zIsEmpty) {
            int identifier = resources.getIdentifier(str2, C1561oA.Kd("\f\u001b\u000b\"\r\u000f\u001a\u0014", (short) (C1607wl.Xd() ^ 30172)), str);
            if (identifier != 0 && isValidIcon(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, Wg.Zd("\u007fwyufP", (short) (Od.Xd() ^ (-15509)), (short) (Od.Xd() ^ (-14961))), str);
            if (identifier2 != 0 && isValidIcon(resources, identifier2)) {
                return identifier2;
            }
            String str3 = C1561oA.Xd("Pkxx+~r\u0002~\u0006\u0004ux4", (short) (OY.Xd() ^ 28796)) + str2 + Wg.vd("X&&*\\\"*//$l]\u001337+\u000f\u0011\n\u0007!\u0015\u001a\u0018P'\u0018\u001a!S(%>w;;C=PFU\u007fHATR\u0011", (short) (FB.Xd() ^ 16991));
        }
        int i3 = bundle.getInt(Qg.kd("Q\\Y\u0019QXWNRJ\u0012IKSEA?PA\tG>KJ7<=A9~444.A7>(66:.*,%\"4(-+\u001b$\u001d(&", (short) (C1580rY.Xd() ^ (-16894)), (short) (C1580rY.Xd() ^ (-24976))), 0);
        if (i3 == 0 || !isValidIcon(resources, i3)) {
            try {
                Class<?> cls = Class.forName(hg.Vd("Q]R_[TN\u0017KVTYIQV\u000fPL\f-=>E:?<#6B496B", (short) (C1607wl.Xd() ^ 15782), (short) (C1607wl.Xd() ^ 24003)));
                Class<?>[] clsArr = new Class[2];
                short sXd2 = (short) (C1607wl.Xd() ^ 22361);
                int[] iArr2 = new int["]SgQ\u001dZNZR\u0018<\\YOSK".length()];
                QB qb2 = new QB("]SgQ\u001dZNZR\u0018<\\YOSK");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(sXd2 + i4 + xuXd2.CK(iKK2));
                    i4++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i4));
                clsArr[1] = Integer.TYPE;
                Object[] objArr = {str, 0};
                Method method = cls.getMethod(C1561oA.yd("54D\u0012:;8698LBAA\u001dCDN", (short) (ZN.Xd() ^ 6772)), clsArr);
                try {
                    method.setAccessible(true);
                    i3 = ((ApplicationInfo) method.invoke(packageManager, objArr)).icon;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (PackageManager.NameNotFoundException e3) {
                String str4 = C1561oA.Yd("R\u007f\u0007~w\u0003<\u000b7\u007f~\u000f;\f\u0015\r?\u0002\u0012\u0013\u0010\u000e\t\b\u001c\u0012\u0019\u0019K\u0016\u001c\u0015\u001fjQ", (short) (FB.Xd() ^ 23726)) + e3;
            }
        }
        return (i3 == 0 || !isValidIcon(resources, i3)) ? android.R.drawable.sym_def_app_icon : i3;
    }

    private static Uri getSound(String str, NotificationParams notificationParams, Resources resources) {
        String soundResourceName = notificationParams.getSoundResourceName();
        if (TextUtils.isEmpty(soundResourceName)) {
            return null;
        }
        return ("default".equals(soundResourceName) || resources.getIdentifier(soundResourceName, "raw", str) == 0) ? RingtoneManager.getDefaultUri(2) : Uri.parse("android.resource://" + str + "/raw/" + soundResourceName);
    }

    private static String getTag(NotificationParams notificationParams) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
        return !TextUtils.isEmpty(string) ? string : "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean isValidIcon(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i2, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            String str = "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i2;
            return false;
        } catch (Resources.NotFoundException unused) {
            String str2 = "Couldn't find resource " + i2 + ", treating it as an invalid icon";
            return false;
        }
    }

    static boolean shouldUploadMetrics(NotificationParams notificationParams) {
        return notificationParams.getBoolean(Constants.AnalyticsKeys.ENABLED);
    }
}
