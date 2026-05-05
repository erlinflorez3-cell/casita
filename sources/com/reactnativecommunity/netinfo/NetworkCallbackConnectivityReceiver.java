package com.reactnativecommunity.netinfo;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class NetworkCallbackConnectivityReceiver extends ConnectivityReceiver {
    private static final int DELAY_MS = 250;
    private NetworkCapabilities mCapabilities;
    private Network mNetwork;
    private final ConnectivityNetworkCallback mNetworkCallback;

    private class ConnectivityNetworkCallback extends ConnectivityManager.NetworkCallback {
        private ConnectivityNetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) throws Throwable {
            NetworkCallbackConnectivityReceiver.this.mNetwork = network;
            NetworkCallbackConnectivityReceiver.this.asyncUpdateAndSend(250);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            NetworkCallbackConnectivityReceiver.this.mNetwork = network;
            NetworkCallbackConnectivityReceiver.this.mCapabilities = networkCapabilities;
            NetworkCallbackConnectivityReceiver.this.updateAndSend();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) throws Throwable {
            if (NetworkCallbackConnectivityReceiver.this.mNetwork != null) {
                NetworkCallbackConnectivityReceiver.this.mNetwork = network;
            }
            NetworkCallbackConnectivityReceiver.this.asyncUpdateAndSend(250);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i2) {
            NetworkCallbackConnectivityReceiver.this.mNetwork = network;
            NetworkCallbackConnectivityReceiver.this.updateAndSend();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            NetworkCallbackConnectivityReceiver.this.mNetwork = null;
            NetworkCallbackConnectivityReceiver.this.mCapabilities = null;
            NetworkCallbackConnectivityReceiver.this.updateAndSend();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            NetworkCallbackConnectivityReceiver.this.mNetwork = null;
            NetworkCallbackConnectivityReceiver.this.mCapabilities = null;
            NetworkCallbackConnectivityReceiver.this.updateAndSend();
        }
    }

    public NetworkCallbackConnectivityReceiver(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mNetwork = null;
        this.mCapabilities = null;
        this.mNetworkCallback = new ConnectivityNetworkCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void asyncUpdateAndSend(int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Jg.Wd(".=,WMl`G\u0002\u000b^y6;UGm", (short) (ZN.Xd() ^ 25085), (short) (ZN.Xd() ^ PanasonicMakernoteDirectory.TAG_BURST_SPEED))).getDeclaredMethod(ZO.xd("\u0012\u001an\u007f$\u001as|\u007f%\u001fK:", (short) (C1499aX.Xd() ^ (-3521)), (short) (C1499aX.Xd() ^ (-28853))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Runnable runnable = new Runnable() { // from class: com.reactnativecommunity.netinfo.NetworkCallbackConnectivityReceiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$asyncUpdateAndSend$0();
                }
            };
            Class<?> cls = Class.forName(C1626yg.Ud("MwK>\fZ9c\u0001\"EF;\b\u00196Nm", (short) (C1607wl.Xd() ^ 8441), (short) (C1607wl.Xd() ^ 32141)));
            Class<?>[] clsArr = {Class.forName(Ig.wd("|+ryVo<\u001a_j\u0015\u00127AH(h{", (short) (ZN.Xd() ^ 16999))), Long.TYPE};
            Object[] objArr2 = {runnable, Long.valueOf(i2)};
            Method method = cls.getMethod(EO.Od("\u0019f~\u001a[)\u007f\u0004g# ", (short) (OY.Xd() ^ 8149)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$asyncUpdateAndSend$0() {
        try {
            this.mCapabilities = getConnectivityManager().getNetworkCapabilities(this.mNetwork);
            updateAndSend();
        } catch (SecurityException unused) {
        }
    }

    @Override // com.reactnativecommunity.netinfo.ConnectivityReceiver
    public void register() throws Throwable {
        try {
            this.mNetwork = getConnectivityManager().getActiveNetwork();
            asyncUpdateAndSend(0);
            getConnectivityManager().registerDefaultNetworkCallback(this.mNetworkCallback);
        } catch (SecurityException unused) {
        }
    }

    @Override // com.reactnativecommunity.netinfo.ConnectivityReceiver
    public void unregister() {
        try {
            getConnectivityManager().unregisterNetworkCallback(this.mNetworkCallback);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void updateAndSend() {
        /*
            r10 = this;
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.UNKNOWN
            android.net.Network r6 = r10.mNetwork
            android.net.NetworkCapabilities r7 = r10.mCapabilities
            r4 = 0
            r3 = 0
            if (r7 == 0) goto L46
            r0 = 2
            boolean r0 = r7.hasTransport(r0)
            r8 = 4
            r2 = 1
            if (r0 == 0) goto L18
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.BLUETOOTH
        L15:
            if (r6 == 0) goto L49
            goto L3d
        L18:
            boolean r0 = r7.hasTransport(r3)
            if (r0 == 0) goto L21
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.CELLULAR
            goto L15
        L21:
            r0 = 3
            boolean r0 = r7.hasTransport(r0)
            if (r0 == 0) goto L2b
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.ETHERNET
            goto L15
        L2b:
            boolean r0 = r7.hasTransport(r2)
            if (r0 == 0) goto L34
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.WIFI
            goto L15
        L34:
            boolean r0 = r7.hasTransport(r8)
            if (r0 == 0) goto L15
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.VPN
            goto L15
        L3d:
            android.net.ConnectivityManager r0 = r10.getConnectivityManager()     // Catch: java.lang.SecurityException -> L49
            android.net.NetworkInfo r9 = r0.getNetworkInfo(r6)     // Catch: java.lang.SecurityException -> L49
            goto L4a
        L46:
            com.reactnativecommunity.netinfo.types.ConnectionType r5 = com.reactnativecommunity.netinfo.types.ConnectionType.NONE
            goto L85
        L49:
            r9 = r4
        L4a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L8d
            r0 = 21
            boolean r1 = r7.hasCapability(r0)
            r1 = r1 ^ r2
        L57:
            r0 = 12
            boolean r0 = r7.hasCapability(r0)
            if (r0 == 0) goto L8b
            r0 = 16
            boolean r0 = r7.hasCapability(r0)
            if (r0 == 0) goto L8b
            if (r1 != 0) goto L8b
            r1 = r2
        L6a:
            boolean r0 = r7.hasTransport(r8)
            if (r0 == 0) goto L89
            if (r1 == 0) goto L79
            int r0 = r7.getLinkDownstreamBandwidthKbps()
            if (r0 == 0) goto L79
            r3 = r2
        L79:
            if (r6 == 0) goto L85
            com.reactnativecommunity.netinfo.types.ConnectionType r0 = com.reactnativecommunity.netinfo.types.ConnectionType.CELLULAR
            if (r5 != r0) goto L85
            if (r3 == 0) goto L85
            com.reactnativecommunity.netinfo.types.CellularGeneration r4 = com.reactnativecommunity.netinfo.types.CellularGeneration.fromNetworkInfo(r9)
        L85:
            r10.updateConnectivity(r5, r4, r3)
            return
        L89:
            r3 = r1
            goto L79
        L8b:
            r1 = r3
            goto L6a
        L8d:
            if (r6 == 0) goto L9f
            if (r9 == 0) goto L9f
            android.net.NetworkInfo$DetailedState r1 = r9.getDetailedState()
            android.net.NetworkInfo$DetailedState r0 = android.net.NetworkInfo.DetailedState.CONNECTED
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L9f
            r1 = r2
            goto L57
        L9f:
            r1 = r3
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.netinfo.NetworkCallbackConnectivityReceiver.updateAndSend():void");
    }
}
