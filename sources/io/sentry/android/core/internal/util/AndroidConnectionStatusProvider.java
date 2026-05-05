package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.sentry.IConnectionStatusProvider;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.ContextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public final class AndroidConnectionStatusProvider implements IConnectionStatusProvider {
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private final ILogger logger;
    private final Map<IConnectionStatusProvider.IConnectionStatusObserver, ConnectivityManager.NetworkCallback> registeredCallbacks = new HashMap();

    public AndroidConnectionStatusProvider(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        this.context = ContextUtils.getApplicationContext(context);
        this.logger = iLogger;
        this.buildInfoProvider = buildInfoProvider;
    }

    private static IConnectionStatusProvider.ConnectionStatus getConnectionStatus(Context context, ConnectivityManager connectivityManager, ILogger iLogger) {
        if (!Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return IConnectionStatusProvider.ConnectionStatus.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? IConnectionStatusProvider.ConnectionStatus.CONNECTED : IConnectionStatusProvider.ConnectionStatus.DISCONNECTED;
            }
            iLogger.log(SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return IConnectionStatusProvider.ConnectionStatus.DISCONNECTED;
        } catch (Throwable th) {
            iLogger.log(SentryLevel.WARNING, "Could not retrieve Connection Status", th);
            return IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
        }
    }

    public static String getConnectionType(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) throws Throwable {
        boolean zHasTransport;
        boolean zHasTransport2;
        ConnectivityManager connectivityManager = getConnectivityManager(context, iLogger);
        if (connectivityManager == null) {
            return null;
        }
        boolean z2 = false;
        if (!Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            zHasTransport = true;
            if (buildInfoProvider.getSdkInfoVersion() >= 23) {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.log(SentryLevel.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.log(SentryLevel.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport2 = networkCapabilities.hasTransport(1);
                zHasTransport = networkCapabilities.hasTransport(0);
                z2 = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.log(SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    zHasTransport2 = false;
                } else if (type != 1) {
                    if (type != 9) {
                        zHasTransport2 = false;
                    } else {
                        zHasTransport2 = false;
                        z2 = true;
                    }
                    zHasTransport = zHasTransport2;
                } else {
                    zHasTransport2 = true;
                    zHasTransport = false;
                }
            }
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Failed to retrieve network info", th);
        }
        if (z2) {
            return "ethernet";
        }
        if (zHasTransport2) {
            return "wifi";
        }
        if (zHasTransport) {
            return "cellular";
        }
        return null;
    }

    public static String getConnectionType(NetworkCapabilities networkCapabilities, BuildInfoProvider buildInfoProvider) {
        if (buildInfoProvider.getSdkInfoVersion() < 21) {
            return null;
        }
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    private static ConnectivityManager getConnectivityManager(Context context, ILogger iLogger) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 23122);
        int[] iArr = new int["\u001d(&%\u001b\u0018(\u001c(\u001a$(".length()];
        QB qb = new QB("\u001d(&%\u001b\u0018(\u001c(\u001a$(");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd2 = (short) (FB.Xd() ^ 18663);
        short sXd3 = (short) (FB.Xd() ^ 6562);
        int[] iArr2 = new int["\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u0010\u001d\u001d$\u0016 'aw%%,\u001e2/".length()];
        QB qb2 = new QB("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u0010\u001d\u001d$\u0016 'aw%%,\u001e2/");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        Object[] objArr = {str};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Kd("10@ GBD6?&9GL@;>", (short) (FB.Xd() ^ 11503)), Class.forName(C1561oA.od("G=Q;\u0007D8D<\u0002&FC9=5", (short) (C1580rY.Xd() ^ (-29711)))));
        try {
            method.setAccessible(true);
            ConnectivityManager connectivityManager = (ConnectivityManager) method.invoke(context, objArr);
            if (connectivityManager == null) {
                iLogger.log(SentryLevel.INFO, Wg.Zd("\b7}A={W\u0013#]&vI${/>{P\u0001P&\u0012&1n5+tC\u0001{I\u000e[&%u *:v>\u0006AZ\u0010gk+q2k\u0004Kv\u0015\u0015]", (short) (C1607wl.Xd() ^ 32135), (short) (C1607wl.Xd() ^ 23794)), new Object[0]);
            }
            return connectivityManager;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean registerNetworkCallback(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider, ConnectivityManager.NetworkCallback networkCallback) throws Throwable {
        if (buildInfoProvider.getSdkInfoVersion() < 24) {
            iLogger.log(SentryLevel.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManager = getConnectivityManager(context, iLogger);
        if (connectivityManager == null) {
            return false;
        }
        if (!Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th) {
            iLogger.log(SentryLevel.WARNING, "registerDefaultNetworkCallback failed", th);
            return false;
        }
    }

    public static void unregisterNetworkCallback(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManager;
        if (buildInfoProvider.getSdkInfoVersion() >= 21 && (connectivityManager = getConnectivityManager(context, iLogger)) != null) {
            try {
                connectivityManager.unregisterNetworkCallback(networkCallback);
            } catch (Throwable th) {
                iLogger.log(SentryLevel.WARNING, "unregisterNetworkCallback failed", th);
            }
        }
    }

    @Override // io.sentry.IConnectionStatusProvider
    public boolean addConnectionStatusObserver(final IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver) {
        if (this.buildInfoProvider.getSdkInfoVersion() < 21) {
            this.logger.log(SentryLevel.DEBUG, "addConnectionStatusObserver requires Android 5+.", new Object[0]);
            return false;
        }
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: io.sentry.android.core.internal.util.AndroidConnectionStatusProvider.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                iConnectionStatusObserver.onConnectionStatusChanged(AndroidConnectionStatusProvider.this.getConnectionStatus());
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLosing(Network network, int i2) {
                iConnectionStatusObserver.onConnectionStatusChanged(AndroidConnectionStatusProvider.this.getConnectionStatus());
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                iConnectionStatusObserver.onConnectionStatusChanged(AndroidConnectionStatusProvider.this.getConnectionStatus());
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                iConnectionStatusObserver.onConnectionStatusChanged(AndroidConnectionStatusProvider.this.getConnectionStatus());
            }
        };
        this.registeredCallbacks.put(iConnectionStatusObserver, networkCallback);
        return registerNetworkCallback(this.context, this.logger, this.buildInfoProvider, networkCallback);
    }

    @Override // io.sentry.IConnectionStatusProvider
    public IConnectionStatusProvider.ConnectionStatus getConnectionStatus() throws Throwable {
        ConnectivityManager connectivityManager = getConnectivityManager(this.context, this.logger);
        return connectivityManager == null ? IConnectionStatusProvider.ConnectionStatus.UNKNOWN : getConnectionStatus(this.context, connectivityManager, this.logger);
    }

    @Override // io.sentry.IConnectionStatusProvider
    public String getConnectionType() {
        return getConnectionType(this.context, this.logger, this.buildInfoProvider);
    }

    public Map<IConnectionStatusProvider.IConnectionStatusObserver, ConnectivityManager.NetworkCallback> getRegisteredCallbacks() {
        return this.registeredCallbacks;
    }

    @Override // io.sentry.IConnectionStatusProvider
    public void removeConnectionStatusObserver(IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver) {
        ConnectivityManager.NetworkCallback networkCallbackRemove = this.registeredCallbacks.remove(iConnectionStatusObserver);
        if (networkCallbackRemove != null) {
            unregisterNetworkCallback(this.context, this.logger, this.buildInfoProvider, networkCallbackRemove);
        }
    }
}
