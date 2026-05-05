package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.Callback;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.core.PermissionListener;

/* JADX INFO: loaded from: classes3.dex */
public class ReactActivityDelegate {
    private final Activity mActivity;
    private final String mMainComponentName;
    private PermissionListener mPermissionListener;
    private Callback mPermissionsCallback;
    private ReactDelegate mReactDelegate;

    /* JADX INFO: renamed from: com.facebook.react.ReactActivityDelegate$1 */
    class AnonymousClass1 extends ReactDelegate {
        AnonymousClass1(Activity activity, ReactNativeHost reactNativeHost, String str, Bundle bundle, boolean z2) {
            super(activity, reactNativeHost, str, bundle, z2);
        }

        @Override // com.facebook.react.ReactDelegate
        protected ReactRootView createRootView() {
            ReactRootView reactRootViewCreateRootView = ReactActivityDelegate.this.createRootView();
            return reactRootViewCreateRootView == null ? super.createRootView() : reactRootViewCreateRootView;
        }
    }

    @Deprecated
    public ReactActivityDelegate(Activity activity, String str) {
        this.mActivity = activity;
        this.mMainComponentName = str;
    }

    public ReactActivityDelegate(ReactActivity reactActivity, String str) {
        this.mActivity = reactActivity;
        this.mMainComponentName = str;
    }

    public /* synthetic */ void lambda$onRequestPermissionsResult$0(int i2, String[] strArr, int[] iArr, Object[] objArr) {
        PermissionListener permissionListener = this.mPermissionListener;
        if (permissionListener == null || !permissionListener.onRequestPermissionsResult(i2, strArr, iArr)) {
            return;
        }
        this.mPermissionListener = null;
    }

    protected Bundle composeLaunchOptions() {
        return getLaunchOptions();
    }

    protected ReactRootView createRootView() {
        return null;
    }

    protected Context getContext() {
        return (Context) Assertions.assertNotNull(this.mActivity);
    }

    protected Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.mMainComponentName;
    }

    protected Activity getPlainActivity() {
        return (Activity) getContext();
    }

    protected ReactDelegate getReactDelegate() {
        return this.mReactDelegate;
    }

    public ReactHost getReactHost() {
        return ((ReactApplication) getPlainActivity().getApplication()).getReactHost();
    }

    public ReactInstanceManager getReactInstanceManager() {
        return this.mReactDelegate.getReactInstanceManager();
    }

    protected ReactNativeHost getReactNativeHost() {
        return ((ReactApplication) getPlainActivity().getApplication()).getReactNativeHost();
    }

    protected boolean isFabricEnabled() {
        return ReactFeatureFlags.enableFabricRenderer;
    }

    protected boolean isWideColorGamutEnabled() {
        return false;
    }

    protected void loadApp(String str) {
        this.mReactDelegate.loadApp(str);
        getPlainActivity().setContentView(this.mReactDelegate.getReactRootView());
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        this.mReactDelegate.onActivityResult(i2, i3, intent, true);
    }

    public boolean onBackPressed() {
        return this.mReactDelegate.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mReactDelegate.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        String mainComponentName = getMainComponentName();
        Bundle bundleComposeLaunchOptions = composeLaunchOptions();
        if (isWideColorGamutEnabled()) {
            this.mActivity.getWindow().setColorMode(1);
        }
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.mReactDelegate = new ReactDelegate(getPlainActivity(), getReactHost(), mainComponentName, bundleComposeLaunchOptions);
        } else {
            this.mReactDelegate = new ReactDelegate(getPlainActivity(), getReactNativeHost(), mainComponentName, bundleComposeLaunchOptions, isFabricEnabled()) { // from class: com.facebook.react.ReactActivityDelegate.1
                AnonymousClass1(Activity activity, ReactNativeHost reactNativeHost, String mainComponentName2, Bundle bundleComposeLaunchOptions2, boolean z2) {
                    super(activity, reactNativeHost, mainComponentName2, bundleComposeLaunchOptions2, z2);
                }

                @Override // com.facebook.react.ReactDelegate
                protected ReactRootView createRootView() {
                    ReactRootView reactRootViewCreateRootView = ReactActivityDelegate.this.createRootView();
                    return reactRootViewCreateRootView == null ? super.createRootView() : reactRootViewCreateRootView;
                }
            };
        }
        if (mainComponentName2 != null) {
            loadApp(mainComponentName2);
        }
    }

    public void onDestroy() {
        this.mReactDelegate.onHostDestroy();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return this.mReactDelegate.onKeyDown(i2, keyEvent);
    }

    public boolean onKeyLongPress(int i2, KeyEvent keyEvent) {
        return this.mReactDelegate.onKeyLongPress(i2);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        return this.mReactDelegate.shouldShowDevMenuOrReload(i2, keyEvent);
    }

    public boolean onNewIntent(Intent intent) {
        return this.mReactDelegate.onNewIntent(intent);
    }

    public void onPause() {
        this.mReactDelegate.onHostPause();
    }

    public void onRequestPermissionsResult(final int i2, final String[] strArr, final int[] iArr) {
        this.mPermissionsCallback = new Callback() { // from class: com.facebook.react.ReactActivityDelegate$$ExternalSyntheticLambda0
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                this.f$0.lambda$onRequestPermissionsResult$0(i2, strArr, iArr, objArr);
            }
        };
    }

    public void onResume() {
        this.mReactDelegate.onHostResume();
        Callback callback = this.mPermissionsCallback;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.mPermissionsCallback = null;
        }
    }

    public void onUserLeaveHint() {
        ReactDelegate reactDelegate = this.mReactDelegate;
        if (reactDelegate != null) {
            reactDelegate.onUserLeaveHint();
        }
    }

    public void onWindowFocusChanged(boolean z2) {
        this.mReactDelegate.onWindowFocusChanged(z2);
    }

    public void requestPermissions(String[] strArr, int i2, PermissionListener permissionListener) {
        this.mPermissionListener = permissionListener;
        getPlainActivity().requestPermissions(strArr, i2);
    }
}
