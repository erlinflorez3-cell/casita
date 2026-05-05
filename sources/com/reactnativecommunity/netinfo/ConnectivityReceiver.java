package com.reactnativecommunity.netinfo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativecommunity.netinfo.types.CellularGeneration;
import com.reactnativecommunity.netinfo.types.ConnectionType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ConnectivityReceiver {
    private final ConnectivityManager mConnectivityManager;
    private Boolean mIsInternetReachableOverride;
    private final ReactApplicationContext mReactContext;
    private final TelephonyManager mTelephonyManager;
    private final WifiManager mWifiManager;
    public boolean hasListener = false;

    @Nonnull
    private ConnectionType mConnectionType = ConnectionType.UNKNOWN;

    @Nullable
    private CellularGeneration mCellularGeneration = null;
    private boolean mIsInternetReachable = false;

    ConnectivityReceiver(ReactApplicationContext reactApplicationContext) throws Throwable {
        this.mReactContext = reactApplicationContext;
        short sXd = (short) (C1607wl.Xd() ^ 13552);
        short sXd2 = (short) (C1607wl.Xd() ^ 22211);
        int[] iArr = new int["\\hc$\u001f=+~\u0001Sz|".length()];
        QB qb = new QB("\\hc$\u001f=+~\u0001Sz|");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        this.mConnectivityManager = (ConnectivityManager) reactApplicationContext.getSystemService(new String(iArr, 0, i2));
        Context applicationContext = reactApplicationContext.getApplicationContext();
        short sXd3 = (short) (C1607wl.Xd() ^ 20329);
        short sXd4 = (short) (C1607wl.Xd() ^ 22049);
        int[] iArr2 = new int["e(\fp".length()];
        QB qb2 = new QB("e(\fp");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
            i3++;
        }
        String str = new String(iArr2, 0, i3);
        short sXd5 = (short) (OY.Xd() ^ 25256);
        short sXd6 = (short) (OY.Xd() ^ 2776);
        int[] iArr3 = new int["5^%#.\u00108\u0005C(N(\u0013=\u0010dlisIq.\u0006".length()];
        QB qb3 = new QB("5^%#.\u00108\u0005C(N(\u0013=\u0010dlisIq.\u0006");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i4 * sXd6))) + xuXd3.CK(iKK3));
            i4++;
        }
        Object[] objArr = {str};
        Method method = Class.forName(new String(iArr3, 0, i4)).getMethod(EO.Od("L\u001d}8Nu\u0007G\u001b\u0010 O#\u0010q\u0011", (short) (C1499aX.Xd() ^ (-6239))), Class.forName(Ig.wd("W ENyr9=^g\tN\u0001\u007fRo", (short) (Od.Xd() ^ (-24495)))));
        try {
            method.setAccessible(true);
            this.mWifiManager = (WifiManager) method.invoke(applicationContext, objArr);
            this.mTelephonyManager = (TelephonyManager) reactApplicationContext.getSystemService(C1561oA.Qd("}tzxn", (short) (C1580rY.Xd() ^ (-24742))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private WritableMap createDetailsMap(@Nonnull String str) {
        WritableMap writableMapCreateMap;
        Enumeration<NetworkInterface> networkInterfaces;
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        writableMapCreateMap = Arguments.createMap();
        str.hashCode();
        switch (str) {
            case "ethernet":
                try {
                    networkInterfaces = NetworkInterface.getNetworkInterfaces();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                            writableMapCreateMap.putString("ipAddress", inetAddressNextElement.getHostAddress());
                            writableMapCreateMap.putString("subnet", getSubnet(inetAddressNextElement));
                            return writableMapCreateMap;
                        }
                        return writableMapCreateMap;
                    }
                }
                return writableMapCreateMap;
            case "cellular":
                CellularGeneration cellularGeneration = this.mCellularGeneration;
                if (cellularGeneration != null) {
                    writableMapCreateMap.putString("cellularGeneration", cellularGeneration.label);
                }
                String networkOperatorName = this.mTelephonyManager.getNetworkOperatorName();
                if (networkOperatorName != null) {
                    writableMapCreateMap.putString("carrier", networkOperatorName);
                }
                return writableMapCreateMap;
            case "wifi":
                if (NetInfoUtils.isAccessWifiStatePermissionGranted(getReactContext()) && (wifiManager = this.mWifiManager) != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                    try {
                        String ssid = connectionInfo.getSSID();
                        if (ssid != null && !ssid.contains("<unknown ssid>")) {
                            writableMapCreateMap.putString("ssid", ssid.replace("\"", ""));
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    try {
                        String bssid = connectionInfo.getBSSID();
                        if (bssid != null) {
                            writableMapCreateMap.putString("bssid", bssid);
                        }
                        break;
                    } catch (Exception unused2) {
                    }
                    try {
                        writableMapCreateMap.putInt("strength", WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                        break;
                    } catch (Exception unused3) {
                    }
                    try {
                        writableMapCreateMap.putInt("frequency", connectionInfo.getFrequency());
                        break;
                    } catch (Exception unused4) {
                    }
                    try {
                        byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        NetInfoUtils.reverseByteArray(byteArray);
                        writableMapCreateMap.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
                        break;
                    } catch (Exception unused5) {
                    }
                    try {
                        byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                        NetInfoUtils.reverseByteArray(byteArray2);
                        writableMapCreateMap.putString("subnet", getSubnet(InetAddress.getByAddress(byteArray2)));
                        break;
                    } catch (Exception unused6) {
                    }
                    try {
                        writableMapCreateMap.putInt("linkSpeed", connectionInfo.getLinkSpeed());
                        break;
                    } catch (Exception unused7) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            writableMapCreateMap.putInt("rxLinkSpeed", connectionInfo.getRxLinkSpeedMbps());
                        }
                        break;
                    } catch (Exception unused8) {
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            writableMapCreateMap.putInt("txLinkSpeed", connectionInfo.getTxLinkSpeedMbps());
                        }
                        break;
                    } catch (Exception unused9) {
                    }
                }
                return writableMapCreateMap;
            default:
                return writableMapCreateMap;
        }
    }

    private static String getSubnet(InetAddress inetAddress) throws SocketException {
        short networkPrefixLength;
        Iterator<InterfaceAddress> it = NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses().iterator();
        while (true) {
            if (!it.hasNext()) {
                networkPrefixLength = 0;
                break;
            }
            InterfaceAddress next = it.next();
            if (next.getAddress().getAddress().length == 4) {
                networkPrefixLength = next.getNetworkPrefixLength();
                break;
            }
        }
        int i2 = (-1) << (32 - networkPrefixLength);
        int i3 = i2 >> 16;
        return String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((i2 >> 24) & 255), Integer.valueOf((i3 + 255) - (i3 | 255)), Integer.valueOf((-1) - (((-1) - (i2 >> 8)) | ((-1) - 255))), Integer.valueOf((i2 + 255) - (i2 | 255)));
    }

    public void clearIsInternetReachableOverride() {
        this.mIsInternetReachableOverride = null;
    }

    protected WritableMap createConnectivityEventMap(@Nullable String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        boolean z2 = false;
        if (NetInfoUtils.isAccessWifiStatePermissionGranted(getReactContext())) {
            WifiManager wifiManager = this.mWifiManager;
            writableMapCreateMap.putBoolean("isWifiEnabled", wifiManager != null ? wifiManager.isWifiEnabled() : false);
        }
        writableMapCreateMap.putString("type", str != null ? str : this.mConnectionType.label);
        boolean z3 = (this.mConnectionType.equals(ConnectionType.NONE) || this.mConnectionType.equals(ConnectionType.UNKNOWN)) ? false : true;
        writableMapCreateMap.putBoolean("isConnected", z3);
        if (this.mIsInternetReachable && (str == null || str.equals(this.mConnectionType.label))) {
            z2 = true;
        }
        writableMapCreateMap.putBoolean("isInternetReachable", z2);
        if (str == null) {
            str = this.mConnectionType.label;
        }
        WritableMap writableMapCreateDetailsMap = createDetailsMap(str);
        if (z3) {
            writableMapCreateDetailsMap.putBoolean("isConnectionExpensive", getConnectivityManager() != null ? getConnectivityManager().isActiveNetworkMetered() : true);
        }
        writableMapCreateMap.putMap("details", writableMapCreateDetailsMap);
        return writableMapCreateMap;
    }

    ConnectivityManager getConnectivityManager() {
        return this.mConnectivityManager;
    }

    public void getCurrentState(@Nullable String str, Promise promise) {
        promise.resolve(createConnectivityEventMap(str));
    }

    ReactApplicationContext getReactContext() {
        return this.mReactContext;
    }

    public abstract void register();

    protected void sendConnectivityChangedEvent() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", createConnectivityEventMap(null));
    }

    public void setIsInternetReachableOverride(boolean z2) {
        this.mIsInternetReachableOverride = Boolean.valueOf(z2);
        updateConnectivity(this.mConnectionType, this.mCellularGeneration, this.mIsInternetReachable);
    }

    public abstract void unregister();

    void updateConnectivity(@Nonnull ConnectionType connectionType, @Nullable CellularGeneration cellularGeneration, boolean z2) {
        Boolean bool = this.mIsInternetReachableOverride;
        if (bool != null) {
            z2 = bool.booleanValue();
        }
        boolean z3 = connectionType != this.mConnectionType;
        boolean z4 = cellularGeneration != this.mCellularGeneration;
        boolean z5 = z2 != this.mIsInternetReachable;
        if (z3 || z4 || z5) {
            this.mConnectionType = connectionType;
            this.mCellularGeneration = cellularGeneration;
            this.mIsInternetReachable = z2;
            if (this.hasListener) {
                sendConnectivityChangedEvent();
            }
        }
    }
}
