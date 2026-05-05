package com.npmdavi.davinotification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.braze.Braze;
import com.braze.push.BrazeFirebaseMessagingService;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
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
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String CHANNEL_ID = "DaviNotificationChannel";
    private static final String TAG = "PushNotificationModule";
    private static ReactApplicationContext reactContext = null;

    private Bitmap getBitmapFromUrl(String str) {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDoInput(true);
            Callback.connect(httpURLConnection);
            return BitmapFactory.decodeStream(Callback.getInputStream(httpURLConnection));
        } catch (Exception e2) {
            String str2 = "Error al obtener la imagen: " + e2.getMessage();
            return null;
        }
    }

    private void handleBrazeMessage(RemoteMessage remoteMessage) {
    }

    private void handleRegularMessage(RemoteMessage remoteMessage) throws Throwable {
        try {
            Map<String, String> data = remoteMessage.getData();
            String str = remoteMessage.getFrom() + Global.UNDERSCORE + System.currentTimeMillis();
            Boolean boolValueOf = Boolean.valueOf(remoteMessage.getNotification() != null);
            String title = boolValueOf.booleanValue() ? remoteMessage.getNotification().getTitle() : data.get("title");
            String body = boolValueOf.booleanValue() ? remoteMessage.getNotification().getBody() : data.get("message");
            Uri imageUrl = boolValueOf.booleanValue() ? remoteMessage.getNotification().getImageUrl() : null;
            if (imageUrl == null) {
                imageUrl = data.get("imageUrl") != null ? Uri.parse(data.get("imageUrl")) : null;
            }
            if (title == null) {
                title = "Notificación";
            }
            if (body == null) {
                body = "Sin descripción";
            }
            showNotification(title, body, imageUrl != null ? imageUrl : null, data, reactContext == null ? data.get("channelId") : NotificationChannelModule.getChannelId(), "pushListener", str);
            sendEventToJS(title, body, data, "pushListener", str);
        } catch (Exception e2) {
            String str2 = "Error al manejar mensaje regular: " + e2.getMessage();
        }
    }

    private void sendEventToJS(String str, String str2, Map<String, String> map, String str3, String str4) {
        try {
            Intent intent = new Intent(this, (Class<?>) NotificationReceiver.class);
            intent.setAction(Constant.PUSH_LISTENER_NOTIFICATION_RECEIVED);
            intent.putExtra("title", str);
            intent.putExtra("message", str2);
            intent.putExtra(Constant.NOTIFICATION_DETAILS_BY, str3);
            intent.putExtra(Constant.NOTIFICATION_DETAILS_ID_NOTIFICATION, str4);
            intent.putExtra("data", new HashMap(map));
            sendBroadcast(intent);
        } catch (Exception e2) {
            String str5 = "Error al enviar evento a JS: " + e2.getMessage();
        }
    }

    public static void setReactApplicationContext(ReactApplicationContext reactApplicationContext) {
        reactContext = reactApplicationContext;
        NotificationReceiver.setReactContext(reactApplicationContext);
    }

    private void showNotification(String str, String str2, Uri uri, Map<String, String> map, String str3, String str4, String str5) throws Throwable {
        StringBuilder sbAppend = new StringBuilder(EO.Od(",\u001d5OO{jy\u0004\"'<hw'\u0006L>ҏgm\u001e", (short) (C1607wl.Xd() ^ 18627))).append(str);
        String strQd = C1561oA.Qd("pc", (short) (C1499aX.Xd() ^ (-15643)));
        sbAppend.append(strQd).append(str2).append(strQd).append(uri).append(strQd).append(map).append(strQd).append(str3).append(strQd).append(str4).append(strQd).append(str5).toString();
        C1593ug.zd(" FE;\"DJ@>B=<PFMM-PFXPJ", (short) (C1633zX.Xd() ^ (-25038)), (short) (C1633zX.Xd() ^ (-30354)));
        NotificationManager notificationManager = (NotificationManager) getSystemService(C1561oA.od("&&*\u001e\u001a\u001c\u0015\u0012$\u0018\u001d\u001b", (short) (C1580rY.Xd() ^ (-25824))));
        short sXd = (short) (ZN.Xd() ^ 10839);
        int[] iArr = new int["e\b\n\u0006\u001b\u0013\u001cH\u000b\u001b\u001cL\u0011\u0017\u0011\u001f \u0018 ".length()];
        QB qb = new QB("e\b\n\u0006\u001b\u0013\u001cH\u000b\u001b\u001cL\u0011\u0017\u0011\u001f \u0018 ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        notificationManager.createNotificationChannel(new NotificationChannel(str3, new String(iArr, 0, i2), 4));
        int identifier = getResources().getIdentifier(C1561oA.Xd("&!\u001e.06,*.)(<299+.>?", (short) (FB.Xd() ^ 32164)), Wg.Zd("\r#Kj\u001aC", (short) (C1633zX.Xd() ^ (-12808)), (short) (C1633zX.Xd() ^ (-30130))), getPackageName());
        Resources resources = getResources();
        String strVd = Wg.vd("4A?C?", (short) (OY.Xd() ^ 755));
        String packageName = getPackageName();
        short sXd2 = (short) (C1580rY.Xd() ^ (-1046));
        short sXd3 = (short) (C1580rY.Xd() ^ (-25277));
        int[] iArr2 = new int["VWMPCSY\"MIKM".length()];
        QB qb2 = new QB("VWMPCSY\"MIKM");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        int color = getResources().getColor(resources.getIdentifier(new String(iArr2, 0, i3), strVd, packageName), null);
        Bitmap bitmapFromUrl = getBitmapFromUrl(uri != null ? uri.toString() : null);
        String str6 = map.get(hg.Vd(":&6*'5\u0010 !(\u001d\"\u001f\u0007\u0019$\u001b", (short) (FB.Xd() ^ 11656), (short) (FB.Xd() ^ 28943)));
        PackageManager packageManager = getPackageManager();
        short sXd4 = (short) (ZN.Xd() ^ 4753);
        int[] iArr3 = new int["'3(51*$l!,*/\u001f',d&\"a\u0003\u0013\u0014\u001b\u0010\u0015\u0012x\f\u0018\n\u000f\f\u0018".length()];
        QB qb3 = new QB("'3(51*$l!,*/\u001f',d&\"a\u0003\u0013\u0014\u001b\u0010\u0015\u0012x\f\u0018\n\u000f\f\u0018");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3));
            i4++;
        }
        Object[] objArr = {str6};
        Method method = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.Yd("VUe>TicY_Agn`jqDnrQcfofml", (short) (C1580rY.Xd() ^ (-7845))), Class.forName(C1561oA.yd("QG_I\u0019VNZF\f4TUKSK", (short) (OY.Xd() ^ 16017))));
        try {
            method.setAccessible(true);
            Intent intent = (Intent) method.invoke(packageManager, objArr);
            String strQd2 = Xg.qd("DBVD", (short) (Od.Xd() ^ (-2457)), (short) (Od.Xd() ^ (-14406)));
            String strWd = Jg.Wd("yReF\u0015I@\u0013F\u0004`U\u0005a", (short) (C1607wl.Xd() ^ 10435), (short) (C1607wl.Xd() ^ 20060));
            String strXd = ZO.xd("\f*", (short) (ZN.Xd() ^ 16474), (short) (ZN.Xd() ^ 6289));
            String strUd = C1626yg.Ud("\u001f\u000f(-,V}", (short) (ZN.Xd() ^ 20790), (short) (ZN.Xd() ^ 22773));
            String strWd2 = Ig.wd("5\u0005a6^", (short) (C1580rY.Xd() ^ (-6330)));
            if (intent != null) {
                intent.setFlags(537001984);
                intent.putExtra(EO.Od("\u0018|{\u0016^$\u0011n\u001eQ$\u0006hQ5\u001c", (short) (ZN.Xd() ^ 27531)), true);
                HashMap map2 = new HashMap();
                map2.put(strWd2, str);
                map2.put(strUd, str2);
                map2.put(strXd, str4);
                map2.put(strWd, str5);
                map2.put(strQd2, new HashMap(map));
                intent.putExtra(C1561oA.Qd("//3'#%\u001e\u001b-!&$x\u0015'\u0013", (short) (ZN.Xd() ^ 11392)), new HashMap(map2));
            } else {
                String str7 = C1593ug.zd("Gi\u001bob\u001edndqqxwؼ'tj*l|ywrqt{ى\u00035y\u0007\u00079\u007f\b<\u000e\u007f\u0011\u0016\u0007\u0017\t^E", (short) (C1580rY.Xd() ^ (-14817)), (short) (C1580rY.Xd() ^ (-29136))) + str6;
            }
            PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, intent, 201326592);
            Intent intent2 = new Intent(this, (Class<?>) NotificationReceiver.class);
            intent2.setAction(C1561oA.od("4?<{;<8.*>0s)%9+//3'#%\u001e\u001b-!&$b\u0002\u0002\u0006yuwpm\u007fsxv\u0007jnwpktsdb", (short) (C1580rY.Xd() ^ (-7385))));
            intent2.putExtra(strWd2, str);
            intent2.putExtra(strUd, str2);
            intent2.putExtra(strXd, str4);
            intent2.putExtra(strWd, str5);
            intent2.putExtra(strQd2, new HashMap(map));
            NotificationCompat.Builder priority = new NotificationCompat.Builder(this, str3).setContentTitle(str).setContentText(str2).setSmallIcon(identifier).setColor(color).setAutoCancel(true).setContentIntent(activity).setDeleteIntent(PendingIntent.getBroadcast(this, 0, intent2, 201326592)).setPriority(1);
            if (bitmapFromUrl != null) {
                priority.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmapFromUrl));
            }
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            priority.addExtras(bundle);
            notificationManager.notify(str5.hashCode(), priority.build());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) throws Throwable {
        super.onMessageReceived(remoteMessage);
        try {
            if (BrazeFirebaseMessagingService.handleBrazeRemoteMessage(this, remoteMessage)) {
                handleBrazeMessage(remoteMessage);
            } else {
                handleRegularMessage(remoteMessage);
            }
        } catch (Exception e2) {
            String str = "Error al recibir mensaje: " + e2.getMessage();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        String str2 = "Token actualizado: " + str;
        Braze.getInstance(reactContext).setRegisteredPushToken(str);
        try {
            ReactApplicationContext reactApplicationContext = reactContext;
            if (reactApplicationContext != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onNewToken", str);
            }
        } catch (Exception e2) {
        }
    }
}
