package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.ProductData;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import io.sentry.ProfilingTraceData;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
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
public class MessagingAnalytics {
    private static final int DEFAULT_PRODUCT_ID = 111881503;
    private static final String DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_PREF = "export_to_big_query";
    private static final String FCM_PREFERENCES = "com.google.firebase.messaging";
    private static final String MANIFEST_DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_ENABLED = "delivery_metrics_exported_to_big_query_enabled";
    private static final String REENGAGEMENT_MEDIUM = "notification";
    private static final String REENGAGEMENT_SOURCE = "Firebase";

    static boolean deliveryMetricsExportToBigQueryEnabled() throws Throwable {
        String strWd = Jg.Wd("\u0012\"\u0010|p\u000f\u0004yGdC:'E/&\u0002/\u0011p^\trR9c_*\u00013\"\u000fn(\u001brN|R?8RB4\u0014\"", (short) (Od.Xd() ^ (-28044)), (short) (Od.Xd() ^ (-11443)));
        try {
            FirebaseApp.getInstance();
            Context applicationContext = FirebaseApp.getInstance().getApplicationContext();
            Object[] objArr = {ZO.xd("omn\u0017oXV\u0019\u001d-%cE2/)t`\u000fdT<\u000f=\u000eGBh?", (short) (C1499aX.Xd() ^ (-28880)), (short) (C1499aX.Xd() ^ (-24745))), 0};
            Method method = Class.forName(C1626yg.Ud("r9/Hf\u0017(V[^+^'^dK[>$EB\u001cs", (short) (ZN.Xd() ^ 17456), (short) (ZN.Xd() ^ 28162))).getMethod(EO.Od("G\u0017g*Om'I{G?\\-\u001e;S\"|F`", (short) (C1580rY.Xd() ^ (-13910))), Class.forName(Ig.wd("V&KO\u0002sFA{?h*}t_s", (short) (C1580rY.Xd() ^ (-17751)))), Integer.TYPE);
            try {
                method.setAccessible(true);
                SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(applicationContext, objArr);
                String strQd = C1561oA.Qd("Ug^\\^_I]WFHNKBSVEQW", (short) (OY.Xd() ^ 1750));
                if (sharedPreferences.contains(strQd)) {
                    return sharedPreferences.getBoolean(strQd, false);
                }
                try {
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1593ug.zd("\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB", (short) (FB.Xd() ^ 5614), (short) (FB.Xd() ^ 21338))).getMethod(C1561oA.od("KHV1ABI>C@':F8=:F", (short) (C1607wl.Xd() ^ 13412)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        PackageManager packageManager = (PackageManager) method2.invoke(applicationContext, objArr2);
                        if (packageManager != null) {
                            Object[] objArr3 = new Object[0];
                            Method method3 = Class.forName(C1561oA.Kd(".<3B@;7\u00028EEL>HO\n MMTFZW", (short) (FB.Xd() ^ 500))).getMethod(Wg.Zd("9ko\u007f\u0005;8b\\\u000fl44`", (short) (C1633zX.Xd() ^ (-29643)), (short) (C1633zX.Xd() ^ (-27761))), new Class[0]);
                            try {
                                method3.setAccessible(true);
                                String str = (String) method3.invoke(applicationContext, objArr3);
                                Class<?> cls = Class.forName(C1561oA.Xd(">LCRPKG\u0012HUU\\NX_\u001a][\u001d@RU^U\\[DYg[bao", (short) (C1499aX.Xd() ^ (-21345))));
                                Class<?>[] clsArr = new Class[2];
                                short sXd = (short) (OY.Xd() ^ 29643);
                                int[] iArr = new int["OG]I\u000fNDRD\f2TKCIC".length()];
                                QB qb = new QB("OG]I\u000fNDRD\f2TKCIC");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                                    i2++;
                                }
                                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                                clsArr[1] = Integer.TYPE;
                                Object[] objArr4 = {str, 128};
                                Method method4 = cls.getMethod(Qg.kd("\u001f\u001c*u$#\u001e\u001a\u0013\u0010\"\u0016\u001b\u0019r\u0017\u000e\u0016", (short) (FB.Xd() ^ 16368), (short) (FB.Xd() ^ 1787)), clsArr);
                                try {
                                    method4.setAccessible(true);
                                    ApplicationInfo applicationInfo = (ApplicationInfo) method4.invoke(packageManager, objArr4);
                                    if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey(strWd)) {
                                        return applicationInfo.metaData.getBoolean(strWd, false);
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return false;
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (IllegalStateException unused2) {
            hg.Vd("\u00102:,(&7(\u000f&32\u001f$%)!", (short) (C1633zX.Xd() ^ (-31730)), (short) (C1633zX.Xd() ^ (-5109)));
            C1561oA.ud("\u001fAI;75F7\u0012@?m5->i77;e'),0(_(,&0$\u001b%!1\u001b\u0019aRu\u0016&\u0018\u0011\u0012K\u0018\u0013\u0010\u0010\u001bE\u0007\tB\u000b\u000f?\u0003\u0007\u000f\u0001}\u000e8y\u0006\u0005\t3\u007f\u0001tt<-_vsy(l~usuvjnf\u001eaagco]io\u0015aXfcYRa\r`Z\n+QN\u00066YHTZ", (short) (ZN.Xd() ^ 7185));
            return false;
        }
    }

    static MessagingClientEvent eventToProto(MessagingClientEvent.Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        MessagingClientEvent.Builder priority = MessagingClientEvent.newBuilder().setTtl(getTtl(extras)).setEvent(event).setInstanceId(getInstanceId(extras)).setPackageName(getPackageName()).setSdkPlatform(MessagingClientEvent.SDKPlatform.ANDROID).setMessageType(getMessageTypeForFirelog(extras)).setPriority(getMessagePriorityForFirelog(extras));
        String messageId = getMessageId(extras);
        if (messageId != null) {
            priority.setMessageId(messageId);
        }
        String topic = getTopic(extras);
        if (topic != null) {
            priority.setTopic(topic);
        }
        String collapseKey = getCollapseKey(extras);
        if (collapseKey != null) {
            priority.setCollapseKey(collapseKey);
        }
        String messageLabel = getMessageLabel(extras);
        if (messageLabel != null) {
            priority.setAnalyticsLabel(messageLabel);
        }
        String composerLabel = getComposerLabel(extras);
        if (composerLabel != null) {
            priority.setComposerLabel(composerLabel);
        }
        long projectNumber = getProjectNumber(extras);
        if (projectNumber > 0) {
            priority.setProjectNumber(projectNumber);
        }
        return priority.build();
    }

    static String getCollapseKey(Bundle bundle) {
        return bundle.getString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    static String getComposerId(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.COMPOSER_ID);
    }

    static String getComposerLabel(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.COMPOSER_LABEL);
    }

    static String getInstanceId(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.TO);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(FirebaseInstallations.getInstance(FirebaseApp.getInstance()).getId());
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    static String getMessageChannel(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_CHANNEL);
    }

    static String getMessageId(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.MSGID);
        return string == null ? bundle.getString(Constants.MessagePayloadKeys.MSGID_SERVER) : string;
    }

    static String getMessageLabel(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_LABEL);
    }

    private static int getMessagePriority(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return ProfilingTraceData.TRUNCATION_REASON_NORMAL.equals(str) ? 2 : 0;
    }

    static int getMessagePriorityForFirelog(Bundle bundle) {
        int priority = getPriority(bundle);
        if (priority == 2) {
            return 5;
        }
        return priority == 1 ? 10 : 0;
    }

    static String getMessageTime(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_TIMESTAMP);
    }

    static MessagingClientEvent.MessageType getMessageTypeForFirelog(Bundle bundle) {
        return (bundle == null || !NotificationParams.isNotification(bundle)) ? MessagingClientEvent.MessageType.DATA_MESSAGE : MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
    }

    static String getMessageTypeForScion(Bundle bundle) {
        return (bundle == null || !NotificationParams.isNotification(bundle)) ? "data" : "display";
    }

    static String getPackageName() throws Throwable {
        Context applicationContext = FirebaseApp.getInstance().getApplicationContext();
        short sXd = (short) (Od.Xd() ^ (-11298));
        int[] iArr = new int["|\t}\u000b\u000f\b\u0002Jv\u0002\u007f\u0005|\u0005\nBn\u001a\u0018\u001d\u0015'\"".length()];
        QB qb = new QB("|\t}\u000b\u000f\b\u0002Jv\u0002\u007f\u0005|\u0005\nBn\u001a\u0018\u001d\u0015'\"");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Yd("\u0012\u0011!}\u0010\u0013\u001c\u0013\u001a\u0019\u0003\u0017$\u001d", (short) (OY.Xd() ^ 12404)), new Class[0]);
        try {
            method.setAccessible(true);
            return (String) method.invoke(applicationContext, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static int getPriority(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (string == null) {
            if ("1".equals(bundle.getString(Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            string = bundle.getString(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return getMessagePriority(string);
    }

    static long getProjectNumber(Bundle bundle) {
        if (bundle.containsKey(Constants.MessagePayloadKeys.SENDER_ID)) {
            try {
                return Long.parseLong(bundle.getString(Constants.MessagePayloadKeys.SENDER_ID));
            } catch (NumberFormatException e2) {
            }
        }
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            try {
                return Long.parseLong(gcmSenderId);
            } catch (NumberFormatException e3) {
            }
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (applicationId.startsWith("1:")) {
            String[] strArrSplit = applicationId.split(Global.COLON);
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
            }
        } else {
            try {
                return Long.parseLong(applicationId);
            } catch (NumberFormatException e5) {
            }
        }
        return 0L;
    }

    static String getTopic(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static int getTtl(Bundle bundle) {
        Object obj = bundle.get(Constants.MessagePayloadKeys.TTL);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String str = "Invalid TTL: " + obj;
            return 0;
        }
    }

    static String getUseDeviceTime(Bundle bundle) {
        if (bundle.containsKey(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME)) {
            return bundle.getString(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME);
        }
        return null;
    }

    private static boolean isDirectBootMessage(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    public static void logNotificationDismiss(Intent intent) {
        logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_DISMISS, intent.getExtras());
    }

    public static void logNotificationForeground(Intent intent) {
        logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND, intent.getExtras());
    }

    public static void logNotificationOpen(Bundle bundle) {
        setUserPropertyIfRequired(bundle);
        logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_OPEN, bundle);
    }

    public static void logNotificationReceived(Intent intent) {
        if (shouldUploadScionMetrics(intent)) {
            logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE, intent.getExtras());
        }
        if (shouldUploadFirelogAnalytics(intent)) {
            logToFirelog(MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.getTransportFactory());
        }
    }

    private static void logToFirelog(MessagingClientEvent.Event event, Intent intent, TransportFactory transportFactory) {
        MessagingClientEvent messagingClientEventEventToProto;
        if (transportFactory == null || (messagingClientEventEventToProto = eventToProto(event, intent)) == null) {
            return;
        }
        try {
            transportFactory.getTransport(Constants.FirelogAnalytics.FCM_LOG_SOURCE, MessagingClientEventExtension.class, Encoding.of("proto"), new Transformer() { // from class: com.google.firebase.messaging.MessagingAnalytics$$ExternalSyntheticLambda0
                @Override // com.google.android.datatransport.Transformer
                public final Object apply(Object obj) {
                    return ((MessagingClientEventExtension) obj).toByteArray();
                }
            }).send(Event.ofData(MessagingClientEventExtension.newBuilder().setMessagingClientEvent(messagingClientEventEventToProto).build(), ProductData.withProductId(Integer.valueOf(intent.getIntExtra(Constants.MessagePayloadKeys.PRODUCT_ID, DEFAULT_PRODUCT_ID)))));
        } catch (RuntimeException e2) {
        }
    }

    static void logToScion(String str, Bundle bundle) {
        try {
            FirebaseApp.getInstance();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String composerId = getComposerId(bundle);
            if (composerId != null) {
                bundle2.putString("_nmid", composerId);
            }
            String composerLabel = getComposerLabel(bundle);
            if (composerLabel != null) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_NAME, composerLabel);
            }
            String messageLabel = getMessageLabel(bundle);
            if (!TextUtils.isEmpty(messageLabel)) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_LABEL, messageLabel);
            }
            String messageChannel = getMessageChannel(bundle);
            if (!TextUtils.isEmpty(messageChannel)) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_CHANNEL, messageChannel);
            }
            String topic = getTopic(bundle);
            if (topic != null) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_TOPIC, topic);
            }
            String messageTime = getMessageTime(bundle);
            if (messageTime != null) {
                try {
                    bundle2.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_TIME, Integer.parseInt(messageTime));
                } catch (NumberFormatException e2) {
                }
            }
            String useDeviceTime = getUseDeviceTime(bundle);
            if (useDeviceTime != null) {
                try {
                    bundle2.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_DEVICE_TIME, Integer.parseInt(useDeviceTime));
                } catch (NumberFormatException e3) {
                }
            }
            String messageTypeForScion = getMessageTypeForScion(bundle);
            if (Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE.equals(str) || Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND.equals(str)) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_TYPE, messageTypeForScion);
            }
            if (Log.isLoggable(Constants.TAG, 3)) {
                String str2 = "Logging to scion event=" + str + " scionPayload=" + bundle2;
            }
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
            if (analyticsConnector != null) {
                analyticsConnector.logEvent("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused) {
        }
    }

    static void setDeliveryMetricsExportToBigQuery(boolean z2) throws Throwable {
        Context applicationContext = FirebaseApp.getInstance().getApplicationContext();
        String strQd = Xg.qd("o|{=w\u0001\u0002z\u0001zD}\u0002\f\u007f}}\u0011\u0004M\u000e\u0007\u0016\u0017\u0006\r\u0010\u0016\u0010", (short) (OY.Xd() ^ 16162), (short) (OY.Xd() ^ 28296));
        short sXd = (short) (OY.Xd() ^ 21533);
        short sXd2 = (short) (OY.Xd() ^ 18080);
        int[] iArr = new int["\u0012QM\u000f\u0016EBC~0Eqy%@$<\u001f'_V\u001d#".length()];
        QB qb = new QB("\u0012QM\u000f\u0016EBC~0Eqy%@$<\u001f'_V\u001d#");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(ZO.xd("TS}\f\b:\u0002\u000fkfL\u0010yCf\u0006", (short) (C1580rY.Xd() ^ (-22270)), (short) (C1580rY.Xd() ^ (-13344)))), Integer.TYPE};
        Object[] objArr = {strQd, 0};
        short sXd3 = (short) (ZN.Xd() ^ 1187);
        short sXd4 = (short) (ZN.Xd() ^ 6274);
        int[] iArr2 = new int["Va}\n,=\noU\"FXN\u001fa\u0017y\fr\u0019".length()];
        QB qb2 = new QB("Va}\n,=\noU\"FXN\u001fa\u0017y\fr\u0019");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            ((SharedPreferences) method.invoke(applicationContext, objArr)).edit().putBoolean(Ig.wd("\tu;\u0017\u0012FI~J\u000f\u0014xGEG6lwW", (short) (ZN.Xd() ^ 601)), z2).apply();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void setUserPropertyIfRequired(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString(Constants.AnalyticsKeys.TRACK_CONVERSIONS))) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                return;
            } else {
                return;
            }
        }
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
        if (Log.isLoggable(Constants.TAG, 3)) {
        }
        if (analyticsConnector != null) {
            String string = bundle.getString(Constants.AnalyticsKeys.COMPOSER_ID);
            analyticsConnector.setUserProperty("fcm", Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION, string);
            Bundle bundle2 = new Bundle();
            bundle2.putString("source", REENGAGEMENT_SOURCE);
            bundle2.putString("medium", REENGAGEMENT_MEDIUM);
            bundle2.putString("campaign", string);
            analyticsConnector.logEvent("fcm", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle2);
        }
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent) {
        if (intent == null || isDirectBootMessage(intent)) {
            return false;
        }
        return deliveryMetricsExportToBigQueryEnabled();
    }

    public static boolean shouldUploadScionMetrics(Intent intent) {
        if (intent == null || isDirectBootMessage(intent)) {
            return false;
        }
        return shouldUploadScionMetrics(intent.getExtras());
    }

    public static boolean shouldUploadScionMetrics(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(Constants.AnalyticsKeys.ENABLED));
    }
}
