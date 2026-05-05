package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import cl.json.RNSharePackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.airbnb.android.react.lottie.LottiePackage;
import com.appsflyer.reactnative.PCAppsFlyerPackage;
import com.appsflyer.reactnative.RNAppsFlyerPackage;
import com.bitgo.randombytes.RandomBytesPackage;
import com.davipwlsauthenticationlibui.DaviPwlsAuthenticationLibUiPackage;
import com.dynatrace.android.agent.DynatraceReactPackage;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import com.horcrux.svg.SvgPackage;
import com.imagepicker.ImagePickerPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.lewin.qrcode.QRScanReaderPackage;
import com.npmdavi.davicvvdynamiclib.DaviCvvDynamicLibPackage;
import com.npmdavi.davinotification.DaviNotificationPackage;
import com.npmdavi.davishieldcipher.DaviShieldCipherPackage;
import com.npmdavi.davishieldmobile.DaviShieldMobilePackage;
import com.oauthdavisdk.OauthDaviSdkPackage;
import com.ocetnik.timer.BackgroundTimerPackage;
import com.reactnativebiocatch.BiocatchPackage;
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage;
import com.reactnativecommunity.clipboard.ClipboardPackage;
import com.reactnativecommunity.geolocation.GeolocationPackage;
import com.reactnativecommunity.netinfo.NetInfoPackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.reactnativedocumentpicker.RNDocumentPickerPackage;
import com.reactnativeincodesdk.IncodeSdkPackage;
import com.rnbiometrics.ReactNativeBiometricsPackage;
import com.rncamerakit.RNCameraKitPackage;
import com.rnmaps.maps.MapsPackage;
import com.streem.selectcontact.SelectContactPackage;
import com.swmansion.gesturehandler.RNGestureHandlerPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.swmansion.rnscreens.RNScreensPackage;
import com.th3rdwave.safeareacontext.SafeAreaContextPackage;
import com.zoontek.rnpermissions.RNPermissionsPackage;
import fr.bamlab.rnimageresizer.ImageResizerPackage;
import fr.greweb.reactnativeviewshot.RNViewShotPackage;
import io.cobrowse.reactnative.CobrowseIOPackage;
import io.invertase.firebase.analytics.ReactNativeFirebaseAnalyticsPackage;
import io.invertase.firebase.app.ReactNativeFirebaseAppPackage;
import io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsPackage;
import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingPackage;
import java.util.ArrayList;
import java.util.Arrays;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import org.linusu.RNGetRandomValuesPackage;
import org.reactnative.maskedview.RNCMaskedViewPackage;

/* JADX INFO: loaded from: classes3.dex */
public class PackageList {
    private Application application;
    private MainPackageConfig mConfig;
    private ReactNativeHost reactNativeHost;

    public PackageList(Application application) {
        this(application, (MainPackageConfig) null);
    }

    public PackageList(Application application, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = null;
        this.application = application;
        this.mConfig = mainPackageConfig;
    }

    public PackageList(ReactNativeHost reactNativeHost) {
        this(reactNativeHost, (MainPackageConfig) null);
    }

    public PackageList(ReactNativeHost reactNativeHost, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = reactNativeHost;
        this.mConfig = mainPackageConfig;
    }

    private Application getApplication() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        return reactNativeHost == null ? this.application : reactNativeHost.getApplication();
    }

    private Context getApplicationContext() {
        return getApplication().getApplicationContext();
    }

    private ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    private Resources getResources() {
        return getApplication().getResources();
    }

    public ArrayList<ReactPackage> getPackages() {
        return new ArrayList<>(Arrays.asList(new MainReactPackage(this.mConfig), new DynatraceReactPackage(), new IncodeSdkPackage(), new DaviNotificationPackage(), new DaviCvvDynamicLibPackage(), new DaviPwlsAuthenticationLibUiPackage(), new DaviShieldCipherPackage(), new DaviShieldMobilePackage(), new QRScanReaderPackage(), new AsyncStoragePackage(), new ClipboardPackage(), new GeolocationPackage(), new NetInfoPackage(), new ReactNativeFirebaseAnalyticsPackage(), new ReactNativeFirebaseAppPackage(), new ReactNativeFirebaseCrashlyticsPackage(), new ReactNativeFirebaseMessagingPackage(), new RNCMaskedViewPackage(), new CobrowseIOPackage(), new OauthDaviSdkPackage(), new LottiePackage(), new RNAppsFlyerPackage(), new PCAppsFlyerPackage(), new BackgroundTimerPackage(), new BiocatchPackage(), new ReactNativeBiometricsPackage(), new RNCameraKitPackage(), new RNDeviceInfo(), new RNDocumentPickerPackage(), new RNGestureHandlerPackage(), new RNGetRandomValuesPackage(), new ImagePickerPackage(), new ImageResizerPackage(), new LinearGradientPackage(), new MapsPackage(), new RNPermissionsPackage(), new RandomBytesPackage(), new ReanimatedPackage(), new SafeAreaContextPackage(), new RNScreensPackage(), new SelectContactPackage(), new RNSharePackage(), new SplashScreenReactPackage(), new SvgPackage(), new RNViewShotPackage(), new RNCWebViewPackage(), new RNFetchBlobPackage()));
    }
}
