package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: loaded from: classes5.dex */
public class BroadcastReceiverConnectivityReceiver extends ConnectivityReceiver {
    public static final String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    private final ConnectivityBroadcastReceiver mConnectivityBroadcastReceiver;

    private class ConnectivityBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private ConnectivityBroadcastReceiver() {
            this.isRegistered = false;
        }

        public boolean isRegistered() {
            return this.isRegistered;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null || !action.equals(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION)) {
                return;
            }
            BroadcastReceiverConnectivityReceiver.this.updateAndSendConnectionType();
        }

        public void setRegistered(boolean z2) {
            this.isRegistered = z2;
        }
    }

    public BroadcastReceiverConnectivityReceiver(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mConnectivityBroadcastReceiver = new ConnectivityBroadcastReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049 A[Catch: SecurityException -> 0x0022, TryCatch #0 {SecurityException -> 0x0022, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0017, B:26:0x003d, B:27:0x0040, B:28:0x0043, B:29:0x0046, B:31:0x0050, B:30:0x0049, B:7:0x0014), top: B:33:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateAndSendConnectionType() {
        /*
            r6 = this;
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.UNKNOWN
            r4 = 0
            r3 = 0
            android.net.ConnectivityManager r0 = r6.getConnectivityManager()     // Catch: java.lang.SecurityException -> L22
            android.net.NetworkInfo r2 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L22
            if (r2 == 0) goto L14
            boolean r0 = r2.isConnected()     // Catch: java.lang.SecurityException -> L22
            if (r0 != 0) goto L17
        L14:
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.NONE     // Catch: java.lang.SecurityException -> L22
            goto L39
        L17:
            boolean r3 = r2.isConnected()     // Catch: java.lang.SecurityException -> L22
            int r1 = r2.getType()     // Catch: java.lang.SecurityException -> L22
            if (r1 == 0) goto L49
            goto L25
        L22:
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.UNKNOWN
            goto L39
        L25:
            r0 = 1
            if (r1 == r0) goto L50
            r0 = 4
            if (r1 == r0) goto L49
            r0 = 9
            if (r1 == r0) goto L46
            r0 = 17
            if (r1 == r0) goto L43
            r0 = 6
            if (r1 == r0) goto L40
            r0 = 7
            if (r1 == r0) goto L3d
        L39:
            r6.updateConnectivity(r5, r4, r3)
            return
        L3d:
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.BLUETOOTH     // Catch: java.lang.SecurityException -> L22
            goto L39
        L40:
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.WIMAX     // Catch: java.lang.SecurityException -> L22
            goto L39
        L43:
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.VPN     // Catch: java.lang.SecurityException -> L22
            goto L39
        L46:
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.ETHERNET     // Catch: java.lang.SecurityException -> L22
            goto L39
        L49:
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.CELLULAR     // Catch: java.lang.SecurityException -> L22
            com.reactnativecommunity.netinfo.types.CellularGeneration r4 = com.reactnativecommunity.netinfo.types.CellularGeneration.fromNetworkInfo(r2)     // Catch: java.lang.SecurityException -> L22
            goto L39
        L50:
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.WIFI     // Catch: java.lang.SecurityException -> L22
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver.updateAndSendConnectionType():void");
    }

    @Override // com.reactnativecommunity.netinfo.ConnectivityReceiver
    public void register() throws Throwable {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(CONNECTIVITY_ACTION);
        NetInfoUtils.compatRegisterReceiver(getReactContext(), this.mConnectivityBroadcastReceiver, intentFilter, false);
        this.mConnectivityBroadcastReceiver.setRegistered(true);
        updateAndSendConnectionType();
    }

    @Override // com.reactnativecommunity.netinfo.ConnectivityReceiver
    public void unregister() {
        if (this.mConnectivityBroadcastReceiver.isRegistered()) {
            getReactContext().unregisterReceiver(this.mConnectivityBroadcastReceiver);
            this.mConnectivityBroadcastReceiver.setRegistered(false);
        }
    }
}
