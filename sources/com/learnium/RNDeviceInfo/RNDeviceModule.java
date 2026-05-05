package com.learnium.RNDeviceInfo;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.webkit.WebSettings;
import androidx.autofill.HintConstants;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.learnium.RNDeviceInfo.resolver.DeviceIdResolver;
import com.learnium.RNDeviceInfo.resolver.DeviceTypeResolver;
import io.cobrowse.CobrowseIO;
import io.sentry.protocol.Device;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nonnull;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
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

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0012\r\u0002\"2$\u001d\u001e\u0001%\u001c$")
public class RNDeviceModule extends ReactContextBaseJavaModule {
    private static String BATTERY_LEVEL = "batteryLevel";
    private static String BATTERY_STATE = "batteryState";
    private static String LOW_POWER_MODE = "lowPowerMode";
    public static final String NAME = "RNDeviceInfo";
    private final DeviceIdResolver deviceIdResolver;
    private final DeviceTypeResolver deviceTypeResolver;
    private BroadcastReceiver headphoneConnectionReceiver;
    private RNInstallReferrerClient installReferrerClient;
    private double mLastBatteryLevel;
    private String mLastBatteryState;
    private boolean mLastPowerSaveState;
    private BroadcastReceiver receiver;

    public RNDeviceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mLastBatteryLevel = -1.0d;
        this.mLastBatteryState = "";
        this.mLastPowerSaveState = false;
        this.deviceTypeResolver = new DeviceTypeResolver(reactApplicationContext);
        this.deviceIdResolver = new DeviceIdResolver(reactApplicationContext);
        this.installReferrerClient = new RNInstallReferrerClient(reactApplicationContext.getBaseContext());
    }

    private long getBlockSize(StatFs statFs, Boolean bool) {
        return bool.booleanValue() ? statFs.getBlockSizeLong() : statFs.getBlockSize();
    }

    private BigInteger getDirTotalCapacity(StatFs statFs) {
        return BigInteger.valueOf(statFs.getBlockCountLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong()));
    }

    private PackageInfo getPackageInfo() throws Exception {
        PackageManager packageManager = getReactApplicationContext().getPackageManager();
        Object[] objArr = {getReactApplicationContext().getPackageName(), 0};
        Method method = Class.forName(Wg.vd("P^Q`ZUM\u0018JWSZHRU\u0010om+N\\_d[^]BWaUXWA", (short) (C1607wl.Xd() ^ 3083))).getMethod(hg.Vd("(%3\u000e\u001e\u001f&\u001b \u001d\u007f$\u001b#", (short) (ZN.Xd() ^ 8064), (short) (ZN.Xd() ^ 7089)), Class.forName(Qg.kd("E;O9\u0005B6B:\u007f$DA7;3", (short) (FB.Xd() ^ 11898), (short) (FB.Xd() ^ 3664))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return (PackageInfo) method.invoke(packageManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap getPowerStateFromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        int intExtra3 = intent.getIntExtra("plugged", -1);
        int intExtra4 = intent.getIntExtra("status", -1);
        float f2 = intExtra / intExtra2;
        String str = intExtra3 == 0 ? "unplugged" : intExtra4 == 2 ? Device.JsonKeys.CHARGING : intExtra4 == 5 ? "full" : "unknown";
        boolean zIsPowerSaveMode = ((PowerManager) getReactApplicationContext().getSystemService("power")).isPowerSaveMode();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(BATTERY_STATE, str);
        writableMapCreateMap.putDouble(BATTERY_LEVEL, f2);
        writableMapCreateMap.putBoolean(LOW_POWER_MODE, zIsPowerSaveMode);
        return writableMapCreateMap;
    }

    private long getTotalAvailableBlocks(StatFs statFs, Boolean bool) {
        return bool.booleanValue() ? statFs.getAvailableBlocksLong() : statFs.getAvailableBlocks();
    }

    private WifiInfo getWifiInfo() throws Throwable {
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        Object[] objArr = {C1561oA.ud("\u0017\b\u0004\u0006", (short) (OY.Xd() ^ 14088))};
        Method method = Class.forName(C1561oA.yd("Q_Rac^V!KXT[Q[^\u0019Cplsi}v", (short) (C1633zX.Xd() ^ (-5695)))).getMethod(Xg.qd(":9I)PKM?H/BPUIDG", (short) (C1633zX.Xd() ^ (-19919)), (short) (C1633zX.Xd() ^ (-6476))), Class.forName(C1561oA.Yd("sk\u0002m;zp~x@f\t\b\u007f\u0006\u007f", (short) (C1499aX.Xd() ^ (-3645)))));
        try {
            method.setAccessible(true);
            WifiManager wifiManager = (WifiManager) method.invoke(applicationContext, objArr);
            if (wifiManager != null) {
                return wifiManager.getConnectionInfo();
            }
            return null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void initializeHeadphoneConnectionReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        this.headphoneConnectionReceiver = new BroadcastReceiver() { // from class: com.learnium.RNDeviceInfo.RNDeviceModule.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                boolean zIsHeadphonesConnectedSync = RNDeviceModule.this.isHeadphonesConnectedSync();
                RNDeviceModule rNDeviceModule = RNDeviceModule.this;
                rNDeviceModule.sendEvent(rNDeviceModule.getReactApplicationContext(), "RNDeviceInfo_headphoneConnectionDidChange", Boolean.valueOf(zIsHeadphonesConnectedSync));
            }
        };
        getReactApplicationContext().registerReceiver(this.headphoneConnectionReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, Object obj) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void getAndroidId(Promise promise) {
        promise.resolve(getAndroidIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getAndroidIdSync() {
        return getUniqueIdSync();
    }

    @ReactMethod
    public void getApiLevel(Promise promise) {
        promise.resolve(Integer.valueOf(getApiLevelSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public int getApiLevelSync() {
        return Build.VERSION.SDK_INT;
    }

    @ReactMethod
    public void getAvailableLocationProviders(Promise promise) {
        promise.resolve(getAvailableLocationProvidersSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getAvailableLocationProvidersSync() {
        LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService(FirebaseAnalytics.Param.LOCATION);
        WritableMap writableMapCreateMap = Arguments.createMap();
        try {
            for (String str : locationManager.getProviders(false)) {
                writableMapCreateMap.putBoolean(str, locationManager.isProviderEnabled(str));
            }
        } catch (Exception unused) {
            System.err.println("Unable to get location providers. LocationManager was null");
        }
        return writableMapCreateMap;
    }

    @ReactMethod
    public void getBaseOs(Promise promise) {
        promise.resolve(getBaseOsSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBaseOsSync() {
        return Build.VERSION.BASE_OS;
    }

    @ReactMethod
    public void getBatteryLevel(Promise promise) {
        promise.resolve(Double.valueOf(getBatteryLevelSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getBatteryLevelSync() {
        WritableMap powerStateFromIntent = getPowerStateFromIntent(getReactApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        if (powerStateFromIntent == null) {
            return 0.0d;
        }
        return powerStateFromIntent.getDouble(BATTERY_LEVEL);
    }

    @ReactMethod
    public void getBootloader(Promise promise) {
        promise.resolve(getBootloaderSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBootloaderSync() {
        return Build.BOOTLOADER;
    }

    @ReactMethod
    public void getBuildId(Promise promise) {
        promise.resolve(getBuildIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBuildIdSync() {
        return Build.ID;
    }

    @ReactMethod
    public void getCarrier(Promise promise) {
        promise.resolve(getCarrierSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCarrierSync() {
        TelephonyManager telephonyManager = (TelephonyManager) getReactApplicationContext().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        System.err.println("Unable to get network operator name. TelephonyManager was null");
        return "unknown";
    }

    @ReactMethod
    public void getCodename(Promise promise) {
        promise.resolve(getCodenameSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCodenameSync() {
        return Build.VERSION.CODENAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        String str;
        String string;
        String string2;
        try {
            str = getPackageInfo().versionName;
            string = Integer.toString(getPackageInfo().versionCode);
            string2 = getReactApplicationContext().getApplicationInfo().loadLabel(getReactApplicationContext().getPackageManager()).toString();
        } catch (Exception unused) {
            str = "unknown";
            string = "unknown";
            string2 = string;
        }
        HashMap map = new HashMap();
        map.put("uniqueId", getUniqueIdSync());
        map.put("deviceId", Build.BOARD);
        map.put("bundleId", getReactApplicationContext().getPackageName());
        map.put("systemName", EventMetricsAggregator.OS_NAME);
        map.put("systemVersion", Build.VERSION.RELEASE);
        map.put("appVersion", str);
        map.put("buildNumber", string);
        map.put("isTablet", Boolean.valueOf(this.deviceTypeResolver.isTablet()));
        map.put("appName", string2);
        map.put(Device.JsonKeys.BRAND, Build.BRAND);
        map.put(Device.JsonKeys.MODEL, Build.MODEL);
        map.put("deviceType", this.deviceTypeResolver.getDeviceType().getValue());
        return map;
    }

    @ReactMethod
    public void getDevice(Promise promise) {
        promise.resolve(getDeviceSync());
    }

    @ReactMethod
    public void getDeviceName(Promise promise) {
        promise.resolve(getDeviceNameSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDeviceNameSync() {
        try {
            String string = Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "bluetooth_name");
            if (string != null) {
                return string;
            }
            String string2 = Settings.Global.getString(getReactApplicationContext().getContentResolver(), CobrowseIO.DEVICE_NAME_KEY);
            return string2 != null ? string2 : "unknown";
        } catch (Exception unused) {
            return "unknown";
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDeviceSync() {
        return Build.DEVICE;
    }

    @ReactMethod
    public void getDisplay(Promise promise) {
        promise.resolve(getDisplaySync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDisplaySync() {
        return Build.DISPLAY;
    }

    @ReactMethod
    public void getFingerprint(Promise promise) {
        promise.resolve(getFingerprintSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getFingerprintSync() {
        return Build.FINGERPRINT;
    }

    @ReactMethod
    public void getFirstInstallTime(Promise promise) {
        promise.resolve(Double.valueOf(getFirstInstallTimeSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFirstInstallTimeSync() {
        try {
            return getPackageInfo().firstInstallTime;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getFontScale(Promise promise) {
        promise.resolve(Float.valueOf(getFontScaleSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public float getFontScaleSync() {
        return getReactApplicationContext().getResources().getConfiguration().fontScale;
    }

    @ReactMethod
    public void getFreeDiskStorage(Promise promise) {
        promise.resolve(Double.valueOf(getFreeDiskStorageSync()));
    }

    @ReactMethod
    public void getFreeDiskStorageOld(Promise promise) {
        promise.resolve(Double.valueOf(getFreeDiskStorageOldSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFreeDiskStorageOldSync() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            return BigInteger.valueOf(statFs.getAvailableBlocksLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFreeDiskStorageSync() {
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            return BigInteger.valueOf(getTotalAvailableBlocks(statFs, true)).multiply(BigInteger.valueOf(getBlockSize(statFs, true))).doubleValue() + BigInteger.valueOf(getTotalAvailableBlocks(statFs2, true)).multiply(BigInteger.valueOf(getBlockSize(statFs2, true))).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getHardware(Promise promise) {
        promise.resolve(getHardwareSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getHardwareSync() {
        return Build.HARDWARE;
    }

    @ReactMethod
    public void getHost(Promise promise) {
        promise.resolve(getHostSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getHostSync() {
        return Build.HOST;
    }

    @ReactMethod
    public void getIncremental(Promise promise) {
        promise.resolve(getIncrementalSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getIncrementalSync() {
        return Build.VERSION.INCREMENTAL;
    }

    @ReactMethod
    public void getInstallReferrer(Promise promise) {
        promise.resolve(getInstallReferrerSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstallReferrerSync() {
        return getReactApplicationContext().getSharedPreferences("react-native-device-info", 0).getString("installReferrer", "unknown");
    }

    @ReactMethod
    public void getInstallerPackageName(Promise promise) {
        promise.resolve(getInstallerPackageNameSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstallerPackageNameSync() throws Throwable {
        String packageName = getReactApplicationContext().getPackageName();
        PackageManager packageManager = getReactApplicationContext().getPackageManager();
        Object[] objArr = {packageName};
        Method method = Class.forName(Jg.Wd("DZhKT#\u00164}^u0-\u000b)7}/\b~\u001crsBX++o\rTr\u0019v", (short) (C1633zX.Xd() ^ (-28410)), (short) (C1633zX.Xd() ^ (-21386)))).getMethod(C1626yg.Ud("<\u0016d\u0005Ee\b0Q\u0014\u0006@Q\u0017\u000fo.4B_LjA", (short) (C1499aX.Xd() ^ (-9177)), (short) (C1499aX.Xd() ^ (-4707))), Class.forName(ZO.xd("omzV/Y7\u0001\u000b~QdD\u000eE\u001a", (short) (FB.Xd() ^ 30567), (short) (FB.Xd() ^ 11254))));
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(packageManager, objArr);
            if (str != null) {
                return str;
            }
            short sXd = (short) (C1580rY.Xd() ^ (-17653));
            int[] iArr = new int["\u0003R\u001d{$_\u0007".length()];
            QB qb = new QB("\u0003R\u001d{$_\u0007");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            return new String(iArr, 0, i2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void getInstanceId(Promise promise) {
        promise.resolve(getInstanceIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstanceIdSync() {
        return this.deviceIdResolver.getInstanceIdSync();
    }

    @ReactMethod
    public void getIpAddress(Promise promise) {
        promise.resolve(getIpAddressSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getIpAddressSync() {
        try {
            return InetAddress.getByAddress(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(getWifiInfo().getIpAddress()).array()).getHostAddress();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    @ReactMethod
    public void getLastUpdateTime(Promise promise) {
        promise.resolve(Double.valueOf(getLastUpdateTimeSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getLastUpdateTimeSync() {
        try {
            return getPackageInfo().lastUpdateTime;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getMacAddress(Promise promise) {
        promise.resolve(getMacAddressSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getMacAddressSync() throws Throwable {
        WifiInfo wifiInfo = getWifiInfo();
        String macAddress = wifiInfo != null ? wifiInfo.getMacAddress() : "";
        if (getReactApplicationContext().checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            try {
                for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                        byte[] hardwareAddress = networkInterface.getHardwareAddress();
                        if (hardwareAddress == null) {
                            macAddress = "";
                        } else {
                            StringBuilder sb = new StringBuilder();
                            for (byte b2 : hardwareAddress) {
                                sb.append(String.format("%02X:", Byte.valueOf(b2)));
                            }
                            if (sb.length() > 0) {
                                sb.deleteCharAt(sb.length() - 1);
                            }
                            macAddress = sb.toString();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return macAddress;
    }

    @ReactMethod
    public void getMaxMemory(Promise promise) {
        promise.resolve(Double.valueOf(getMaxMemorySync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getMaxMemorySync() {
        return Runtime.getRuntime().maxMemory();
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getPhoneNumber(Promise promise) {
        promise.resolve(getPhoneNumberSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getPhoneNumberSync() {
        if (getReactApplicationContext() == null) {
            return "unknown";
        }
        if (getReactApplicationContext().checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") != 0 && getReactApplicationContext().checkCallingOrSelfPermission("android.permission.READ_SMS") != 0 && getReactApplicationContext().checkCallingOrSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
            return "unknown";
        }
        TelephonyManager telephonyManager = (TelephonyManager) getReactApplicationContext().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager == null) {
            System.err.println("Unable to getPhoneNumber. TelephonyManager was null");
            return "unknown";
        }
        try {
            return telephonyManager.getLine1Number();
        } catch (SecurityException e2) {
            System.err.println("getLine1Number called with permission, but threw anyway: " + e2.getMessage());
            return "unknown";
        }
    }

    @ReactMethod
    public void getPowerState(Promise promise) {
        promise.resolve(getPowerStateSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPowerStateSync() {
        return getPowerStateFromIntent(getReactApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
    }

    @ReactMethod
    public void getPreviewSdkInt(Promise promise) {
        promise.resolve(getPreviewSdkIntSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getPreviewSdkIntSync() {
        return Integer.toString(Build.VERSION.PREVIEW_SDK_INT);
    }

    @ReactMethod
    public void getProduct(Promise promise) {
        promise.resolve(getProductSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getProductSync() {
        return Build.PRODUCT;
    }

    @ReactMethod
    public void getSecurityPatch(Promise promise) {
        promise.resolve(getSecurityPatchSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSecurityPatchSync() {
        return Build.VERSION.SECURITY_PATCH;
    }

    @ReactMethod
    public void getSerialNumber(Promise promise) {
        promise.resolve(getSerialNumberSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSerialNumberSync() {
        try {
            return Build.getSerial();
        } catch (Exception e2) {
            System.err.println("getSerialNumber failed, it probably should not be used: " + e2.getMessage());
            return "unknown";
        }
    }

    @ReactMethod
    public void getSupported32BitAbis(Promise promise) {
        promise.resolve(getSupported32BitAbisSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupported32BitAbisSync() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (String str : Build.SUPPORTED_32_BIT_ABIS) {
            writableNativeArray.pushString(str);
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void getSupported64BitAbis(Promise promise) {
        promise.resolve(getSupported64BitAbisSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupported64BitAbisSync() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (String str : Build.SUPPORTED_64_BIT_ABIS) {
            writableNativeArray.pushString(str);
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void getSupportedAbis(Promise promise) {
        promise.resolve(getSupportedAbisSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupportedAbisSync() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (String str : Build.SUPPORTED_ABIS) {
            writableNativeArray.pushString(str);
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void getSystemAvailableFeatures(Promise promise) {
        promise.resolve(getSystemAvailableFeaturesSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSystemAvailableFeaturesSync() throws Throwable {
        PackageManager packageManager = getReactApplicationContext().getPackageManager();
        short sXd = (short) (C1607wl.Xd() ^ 18625);
        int[] iArr = new int["< \u001aAXwX\ft\u001euc# 4V]FQ=\u0011]MA\n\u000eZ\u001f\u0010WC(\u0007".length()];
        QB qb = new QB("< \u001aAXwX\ft\u001euc# 4V]FQ=\u0011]MA\n\u000eZ\u001f\u0010WC(\u0007");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("\u0014\u0011\u001f|\"\u001b\u001b\u000b\u0012d\u0019\u0003\n\f\u007f\u007f\t\u0001`~y\f\f\by\u0007", (short) (ZN.Xd() ^ 20757)), new Class[0]);
        try {
            method.setAccessible(true);
            FeatureInfo[] featureInfoArr = (FeatureInfo[]) method.invoke(packageManager, objArr);
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (FeatureInfo featureInfo : featureInfoArr) {
                if (featureInfo.name != null) {
                    writableArrayCreateArray.pushString(featureInfo.name);
                }
            }
            return writableArrayCreateArray;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void getSystemManufacturer(Promise promise) {
        promise.resolve(getSystemManufacturerSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSystemManufacturerSync() {
        return Build.MANUFACTURER;
    }

    @ReactMethod
    public void getTags(Promise promise) {
        promise.resolve(getTagsSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTagsSync() {
        return Build.TAGS;
    }

    @ReactMethod
    public void getTotalDiskCapacity(Promise promise) {
        promise.resolve(Double.valueOf(getTotalDiskCapacitySync()));
    }

    @ReactMethod
    public void getTotalDiskCapacityOld(Promise promise) {
        promise.resolve(Double.valueOf(getTotalDiskCapacityOldSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @Deprecated
    public double getTotalDiskCapacityOldSync() {
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            return BigInteger.valueOf(statFs.getBlockCount()).multiply(BigInteger.valueOf(statFs.getBlockSize())).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalDiskCapacitySync() {
        try {
            return getDirTotalCapacity(new StatFs(Environment.getRootDirectory().getAbsolutePath())).add(getDirTotalCapacity(new StatFs(Environment.getDataDirectory().getAbsolutePath()))).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getTotalMemory(Promise promise) {
        promise.resolve(Double.valueOf(getTotalMemorySync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalMemorySync() {
        ActivityManager activityManager = (ActivityManager) getReactApplicationContext().getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        System.err.println("Unable to getMemoryInfo. ActivityManager was null");
        return -1.0d;
    }

    @ReactMethod
    public void getType(Promise promise) {
        promise.resolve(getTypeSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTypeSync() {
        return Build.TYPE;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getUniqueIdSync() {
        return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
    }

    @ReactMethod
    public void getUsedMemory(Promise promise) {
        promise.resolve(Double.valueOf(getUsedMemorySync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getUsedMemorySync() {
        ActivityManager activityManager = (ActivityManager) getReactApplicationContext().getSystemService("activity");
        if (activityManager == null) {
            System.err.println("Unable to getProcessMemoryInfo. ActivityManager was null");
            return -1.0d;
        }
        Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
        if (processMemoryInfo.length == 1) {
            return ((double) processMemoryInfo[0].getTotalPss()) * 1024.0d;
        }
        System.err.println("Unable to getProcessMemoryInfo. getProcessMemoryInfo did not return any info for the PID");
        return -1.0d;
    }

    @ReactMethod
    public void getUserAgent(Promise promise) {
        promise.resolve(getUserAgentSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getUserAgentSync() {
        try {
            return WebSettings.getDefaultUserAgent(getReactApplicationContext());
        } catch (RuntimeException unused) {
            return System.getProperty("http.agent");
        }
    }

    @ReactMethod
    public void hasGms(Promise promise) {
        promise.resolve(Boolean.valueOf(hasGmsSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasGmsSync() {
        try {
            Object objInvoke = Class.forName("com.google.android.gms.common.GoogleApiAvailability").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            return ((Integer) objInvoke.getClass().getMethod("isGooglePlayServicesAvailable", Context.class).invoke(objInvoke, getReactApplicationContext())).intValue() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    @ReactMethod
    public void hasHms(Promise promise) {
        promise.resolve(Boolean.valueOf(hasHmsSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasHmsSync() {
        try {
            Object objInvoke = Class.forName("com.huawei.hms.api.HuaweiApiAvailability").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            return ((Integer) objInvoke.getClass().getMethod("isHuaweiMobileServicesAvailable", Context.class).invoke(objInvoke, getReactApplicationContext())).intValue() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    @ReactMethod
    public void hasSystemFeature(String str, Promise promise) {
        promise.resolve(Boolean.valueOf(hasSystemFeatureSync(str)));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasSystemFeatureSync(String str) throws Throwable {
        if (str == null || str.equals("")) {
            return false;
        }
        PackageManager packageManager = getReactApplicationContext().getPackageManager();
        Object[] objArr = {str};
        Method method = Class.forName(C1593ug.zd("P^Udb]Y$Zggn`jq,om/RdgpgnmVkymts\u0002", (short) (OY.Xd() ^ 31675), (short) (OY.Xd() ^ 8503))).getMethod(C1561oA.Kd("\u001a\u0014'\b/*,\u001e'\u0001!\u001e242&", (short) (ZN.Xd() ^ 6650)), Class.forName(C1561oA.od("\f\u0002\u0016\u007fK\t|\t\u0001Fj\u000b\b}\u0002y", (short) (ZN.Xd() ^ 22830))));
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(packageManager, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        this.receiver = new BroadcastReceiver() { // from class: com.learnium.RNDeviceInfo.RNDeviceModule.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                WritableMap powerStateFromIntent = RNDeviceModule.this.getPowerStateFromIntent(intent);
                if (powerStateFromIntent == null) {
                    return;
                }
                String string = powerStateFromIntent.getString(RNDeviceModule.BATTERY_STATE);
                Double dValueOf = Double.valueOf(powerStateFromIntent.getDouble(RNDeviceModule.BATTERY_LEVEL));
                Boolean boolValueOf = Boolean.valueOf(powerStateFromIntent.getBoolean(RNDeviceModule.LOW_POWER_MODE));
                if (!RNDeviceModule.this.mLastBatteryState.equalsIgnoreCase(string) || RNDeviceModule.this.mLastPowerSaveState != boolValueOf.booleanValue()) {
                    RNDeviceModule rNDeviceModule = RNDeviceModule.this;
                    rNDeviceModule.sendEvent(rNDeviceModule.getReactApplicationContext(), "RNDeviceInfo_powerStateDidChange", string);
                    RNDeviceModule.this.mLastBatteryState = string;
                    RNDeviceModule.this.mLastPowerSaveState = boolValueOf.booleanValue();
                }
                if (RNDeviceModule.this.mLastBatteryLevel != dValueOf.doubleValue()) {
                    RNDeviceModule rNDeviceModule2 = RNDeviceModule.this;
                    rNDeviceModule2.sendEvent(rNDeviceModule2.getReactApplicationContext(), "RNDeviceInfo_batteryLevelDidChange", dValueOf);
                    if (dValueOf.doubleValue() <= 0.15d) {
                        RNDeviceModule rNDeviceModule3 = RNDeviceModule.this;
                        rNDeviceModule3.sendEvent(rNDeviceModule3.getReactApplicationContext(), "RNDeviceInfo_batteryLevelIsLow", dValueOf);
                    }
                    RNDeviceModule.this.mLastBatteryLevel = dValueOf.doubleValue();
                }
            }
        };
        getReactApplicationContext().registerReceiver(this.receiver, intentFilter);
        initializeHeadphoneConnectionReceiver();
    }

    @ReactMethod
    public void isAirplaneMode(Promise promise) {
        promise.resolve(Boolean.valueOf(isAirplaneModeSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isAirplaneModeSync() {
        return Settings.Global.getInt(getReactApplicationContext().getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    @ReactMethod
    public void isBatteryCharging(Promise promise) {
        promise.resolve(Boolean.valueOf(isBatteryChargingSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isBatteryChargingSync() {
        Intent intentRegisterReceiver = getReactApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return (intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : 0) == 2;
    }

    @ReactMethod
    public void isCameraPresent(Promise promise) {
        promise.resolve(Boolean.valueOf(isCameraPresentSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isCameraPresentSync() {
        try {
            return ((CameraManager) getReactApplicationContext().getSystemService("camera")).getCameraIdList().length > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    @ReactMethod
    public void isEmulator(Promise promise) {
        promise.resolve(Boolean.valueOf(isEmulatorSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isEmulatorSync() {
        return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.toLowerCase(Locale.ROOT).contains("droid4x") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu") || Build.HARDWARE.contains("vbox86") || Build.PRODUCT.contains("sdk") || Build.PRODUCT.contains("google_sdk") || Build.PRODUCT.contains("sdk_google") || Build.PRODUCT.contains("sdk_x86") || Build.PRODUCT.contains("vbox86p") || Build.PRODUCT.contains("emulator") || Build.PRODUCT.contains(Device.JsonKeys.SIMULATOR) || Build.BOARD.toLowerCase(Locale.ROOT).contains("nox") || Build.BOOTLOADER.toLowerCase(Locale.ROOT).contains("nox") || Build.HARDWARE.toLowerCase(Locale.ROOT).contains("nox") || Build.PRODUCT.toLowerCase(Locale.ROOT).contains("nox") || Build.SERIAL.toLowerCase(Locale.ROOT).contains("nox") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic"));
    }

    @ReactMethod
    public void isHeadphonesConnected(Promise promise) {
        promise.resolve(Boolean.valueOf(isHeadphonesConnectedSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isHeadphonesConnectedSync() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService("audio");
        return audioManager.isWiredHeadsetOn() || audioManager.isBluetoothA2dpOn();
    }

    @ReactMethod
    public void isLocationEnabled(Promise promise) {
        promise.resolve(Boolean.valueOf(isLocationEnabledSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isLocationEnabledSync() throws Throwable {
        boolean zIsLocationEnabled = false;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                zIsLocationEnabled = ((LocationManager) getReactApplicationContext().getSystemService(Wg.Zd("\u000fT07pdR\\", (short) (Od.Xd() ^ (-9191)), (short) (Od.Xd() ^ (-54))))).isLocationEnabled();
                return zIsLocationEnabled;
            } catch (Exception unused) {
                System.err.println(C1561oA.Xd("a{oq|v2\b\u00045z|\r~\r\t\u0006\f\u0004?\n\bB\u0010\u0014\t\b\u001c\u0012\u0019\u0019K\u0012\u001c\u0010\u0012\u001d\u0017\u0017aT\u0002&\u001b\u001a.$++\u000b .\")(6d=(;h8@89", (short) (C1633zX.Xd() ^ (-7104))));
                return zIsLocationEnabled;
            }
        }
        ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
        String strVd = Wg.vd("-/&#1%.,\u0018%*\u001e\u001a", (short) (OY.Xd() ^ 13994));
        Class<?> cls = Class.forName(Qg.kd("\u0003\u000f\u0004\u0011\r\u0006\u007fH\n\u000b\u0007\r~xx\u0005?ct\u0003\u0002uyq|,Zkhyug", (short) (C1633zX.Xd() ^ (-26065)), (short) (C1633zX.Xd() ^ (-32742))));
        Class<?>[] clsArr = {Class.forName(hg.Vd("\t\u0015\n\u0017\u0013\f\u0006N\u0003\u000e\f\u0011\u0001\t\u000eFZ\u0006\u0004\tx\u0001\u0006bt\u0002|x\u0002o{", (short) (ZN.Xd() ^ 27870), (short) (ZN.Xd() ^ 4437))), Class.forName(C1561oA.ud("B8L6\u0002?3?7|!A>480", (short) (C1580rY.Xd() ^ (-26673)))), Integer.TYPE};
        Object[] objArr = {contentResolver, strVd, 0};
        short sXd = (short) (FB.Xd() ^ 30471);
        int[] iArr = new int["LK[1OV".length()];
        QB qb = new QB("LK[1OV");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(null, objArr)).intValue() != 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void isPinOrFingerprintSet(Promise promise) {
        promise.resolve(Boolean.valueOf(isPinOrFingerprintSetSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPinOrFingerprintSetSync() {
        KeyguardManager keyguardManager = (KeyguardManager) getReactApplicationContext().getSystemService("keyguard");
        if (keyguardManager != null) {
            return keyguardManager.isKeyguardSecure();
        }
        System.err.println("Unable to determine keyguard status. KeyguardManager was null");
        return false;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        getReactApplicationContext().unregisterReceiver(this.receiver);
        getReactApplicationContext().unregisterReceiver(this.headphoneConnectionReceiver);
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
