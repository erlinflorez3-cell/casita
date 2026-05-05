package com.npmdavi.davinotification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.BrazePushReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class MyBrazeBroadcastReceiver extends BrazePushReceiver {
    private static final String TAG = "com.npmdavi.davinotification.MyBrazeBroadcastReceiver";

    private void sendEventReceiverMaster(String str, HashMap<String, Object> map) {
        try {
            new NotificationReceiver().sendEventToJS(str, map);
        } catch (Exception e2) {
            String str2 = TAG;
            String str3 = "Error al enviar evento a Receiver: " + e2.getMessage();
        }
    }

    private void sendEventToStorageMaster(Context context, String str, HashMap<String, Object> map) throws Throwable {
        try {
            new NotificationReceiver().saveEventToStorage(context, str, map);
        } catch (Exception e2) {
            String str2 = TAG;
            String str3 = "Error al enviar evento a Receiver: " + e2.getMessage();
        }
    }

    @Override // com.braze.push.BrazePushReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras = intent.getExtras();
        String action = intent.getAction();
        HashMap<String, Object> map = new HashMap<>();
        map.put(Constant.NOTIFICATION_DETAILS_ACTION, action);
        map.put("title", intent.getStringExtra("t"));
        map.put("message", intent.getStringExtra("a"));
        map.put("data", new HashMap());
        map.put(Constant.NOTIFICATION_DETAILS_BY, Constant.BRAZE);
        map.put(Constant.NOTIFICATION_DETAILS_ID_NOTIFICATION, String.valueOf(extras.getLong("braze_push_received_timestamp")));
        map.put(Constant.NOTIFICATION_DETAILS_LOG, new ArrayList(Arrays.asList(action)));
        if ("com.braze.push.intent.NOTIFICATION_RECEIVED".equals(action)) {
            String str = TAG;
            sendEventReceiverMaster(Constant.EVENTPUSH_ON_MESSAGE_RECEIVED, map);
            sendEventToStorageMaster(context, Constant.EVENTPUSH_ON_MESSAGE_RECEIVED, map);
        } else if ("com.braze.push.intent.NOTIFICATION_OPENED".equals(action)) {
            sendEventReceiverMaster(Constant.EVENTPUSH_ON_MESSAGE_OPENED, map);
            sendEventToStorageMaster(context, Constant.EVENTPUSH_ON_MESSAGE_OPENED, map);
            BrazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, intent);
        } else if (!"com.braze.push.intent.NOTIFICATION_DELETED".equals(action)) {
            String str2 = TAG;
            String.format("Ignoring intent with unsupported action %s", action);
        } else {
            String str3 = TAG;
            sendEventReceiverMaster(Constant.EVENTPUSH_ON_MESSAGE_DISMISSED, map);
            sendEventToStorageMaster(context, Constant.EVENTPUSH_ON_MESSAGE_DISMISSED, map);
        }
    }
}
