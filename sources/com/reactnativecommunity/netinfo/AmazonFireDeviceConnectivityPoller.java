package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class AmazonFireDeviceConnectivityPoller {
    private static final String ACTION_CONNECTIVITY_CHECK = "com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK";
    private static final String ACTION_INTERNET_DOWN = "com.amazon.tv.networkmonitor.INTERNET_DOWN";
    private static final String ACTION_INTERNET_UP = "com.amazon.tv.networkmonitor.INTERNET_UP";
    private static final long POLLING_INTERVAL_MS = 10000;
    private final ConnectivityChangedCallback callback;
    private final Context context;
    private Handler handler;
    private final Receiver receiver = new Receiver();
    private final Runnable checker = new PollerTask();
    private boolean pollerRunning = false;

    public interface ConnectivityChangedCallback {
        void onAmazonFireDeviceConnectivityChanged(boolean z2);
    }

    private class PollerTask implements Runnable {
        private PollerTask() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (AmazonFireDeviceConnectivityPoller.this.pollerRunning) {
                Intent intent = new Intent(C1561oA.Qd("ali)[fYqec\"gh\u001f^Tbd[]UVWUOYSU\u0010$/-,\"\u001f/#/!+/4\u0017\u001b\u0017\u0014\u001b", (short) (C1607wl.Xd() ^ 29619)));
                Context context = AmazonFireDeviceConnectivityPoller.this.context;
                Object[] objArr = {intent};
                Method method = Class.forName(C1593ug.zd("\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB", (short) (C1633zX.Xd() ^ (-28986)), (short) (C1633zX.Xd() ^ (-2837)))).getMethod(C1561oA.Kd("i\\f]<mk^bbatv", (short) (FB.Xd() ^ 30331)), Class.forName(C1561oA.od("\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011Ic\b\r|\u0005\n", (short) (C1499aX.Xd() ^ (-4883)))));
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                    Handler handler = AmazonFireDeviceConnectivityPoller.this.handler;
                    Object[] objArr2 = {AmazonFireDeviceConnectivityPoller.this.checker, 10000L};
                    Method method2 = Class.forName(Wg.Zd(" \\\fU\fR\t\u0010\u001bJ?\u0015kBr$Z\u0013", (short) (C1499aX.Xd() ^ (-9125)), (short) (C1499aX.Xd() ^ (-3998)))).getMethod(Wg.vd("yyz|Ikoezgc", (short) (C1499aX.Xd() ^ (-13635))), Class.forName(C1561oA.Xd("\u001c\u0014*\u0016c#\u0019'!h\u000e2,-!#.(", (short) (C1633zX.Xd() ^ (-465)))), Long.TYPE);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(handler, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }
    }

    private class Receiver extends BroadcastReceiver {
        private Boolean lastIsConnected;
        boolean registered;

        private Receiver() {
            this.registered = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z2;
            String action = intent == null ? null : intent.getAction();
            if (AmazonFireDeviceConnectivityPoller.ACTION_INTERNET_DOWN.equals(action)) {
                z2 = false;
            } else if (!AmazonFireDeviceConnectivityPoller.ACTION_INTERNET_UP.equals(action)) {
                return;
            } else {
                z2 = true;
            }
            Boolean bool = this.lastIsConnected;
            if (bool == null || bool.booleanValue() != z2) {
                this.lastIsConnected = Boolean.valueOf(z2);
                AmazonFireDeviceConnectivityPoller.this.callback.onAmazonFireDeviceConnectivityChanged(z2);
            }
        }
    }

    AmazonFireDeviceConnectivityPoller(Context context, ConnectivityChangedCallback connectivityChangedCallback) {
        this.context = context;
        this.callback = connectivityChangedCallback;
    }

    private boolean isFireOsDevice() {
        return Build.MANUFACTURER.equals("Amazon") && (Build.MODEL.startsWith("AF") || Build.MODEL.startsWith("KF"));
    }

    private void registerReceiver() throws Throwable {
        if (this.receiver.registered) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_INTERNET_DOWN);
        intentFilter.addAction(ACTION_INTERNET_UP);
        NetInfoUtils.compatRegisterReceiver(this.context, this.receiver, intentFilter, false);
        this.receiver.registered = true;
    }

    private void startPoller() throws Throwable {
        if (this.pollerRunning) {
            return;
        }
        Handler handler = new Handler();
        this.handler = handler;
        this.pollerRunning = true;
        Object[] objArr = {this.checker};
        Method method = Class.forName(Qg.kd("BNCPLE?\bHK\u0005\u001e6B7>6B", (short) (OY.Xd() ^ 23569), (short) (OY.Xd() ^ 28637))).getMethod(C1561oA.ud("\u0018\u0016\u0019\u0019", (short) (ZN.Xd() ^ 26452)), Class.forName(hg.Vd("}s\bq=znzr8[}utffog", (short) (C1633zX.Xd() ^ (-16734)), (short) (C1633zX.Xd() ^ (-22921)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void stopPoller() {
        if (this.pollerRunning) {
            this.pollerRunning = false;
            this.handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
    }

    private void unregisterReceiver() throws Throwable {
        if (this.receiver.registered) {
            Context context = this.context;
            Object[] objArr = {this.receiver};
            Method method = Class.forName(C1561oA.yd("\n\u0016\u000b\u0018\u0014\r\u0007O\u0014\u001f\u001d\"\u0012\u001a\u001fW{'%*\u001a,'", (short) (C1633zX.Xd() ^ (-25748)))).getMethod(Xg.qd("605),/:<.<\u001d1038F6D", (short) (C1580rY.Xd() ^ (-8736)), (short) (C1580rY.Xd() ^ (-1687))), Class.forName(C1561oA.Yd(",:1@>95\u007f6CCJ<FM\b\u001dNL?CCBUW6JILQ_O]", (short) (Od.Xd() ^ (-26244)))));
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
                this.receiver.registered = false;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public void register() {
        if (isFireOsDevice()) {
            registerReceiver();
            startPoller();
        }
    }

    public void unregister() {
        if (isFireOsDevice()) {
            stopPoller();
            unregisterReceiver();
        }
    }
}
