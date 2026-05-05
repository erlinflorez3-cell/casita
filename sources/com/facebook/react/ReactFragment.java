package com.facebook.react;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;

/* JADX INFO: loaded from: classes3.dex */
public class ReactFragment extends Fragment implements PermissionAwareActivity {
    protected static final String ARG_COMPONENT_NAME = "arg_component_name";
    protected static final String ARG_FABRIC_ENABLED = "arg_fabric_enabled";
    protected static final String ARG_LAUNCH_OPTIONS = "arg_launch_options";
    private PermissionListener mPermissionListener;
    protected ReactDelegate mReactDelegate;

    public static class Builder {
        String mComponentName = null;
        Bundle mLaunchOptions = null;
        Boolean mFabricEnabled = false;

        public ReactFragment build() {
            return ReactFragment.newInstance(this.mComponentName, this.mLaunchOptions, this.mFabricEnabled);
        }

        public Builder setComponentName(String str) {
            this.mComponentName = str;
            return this;
        }

        public Builder setFabricEnabled(boolean z2) {
            this.mFabricEnabled = Boolean.valueOf(z2);
            return this;
        }

        public Builder setLaunchOptions(Bundle bundle) {
            this.mLaunchOptions = bundle;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ReactFragment newInstance(String str, Bundle bundle, Boolean bool) {
        ReactFragment reactFragment = new ReactFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(ARG_COMPONENT_NAME, str);
        bundle2.putBundle(ARG_LAUNCH_OPTIONS, bundle);
        bundle2.putBoolean(ARG_FABRIC_ENABLED, bool.booleanValue());
        reactFragment.setArguments(bundle2);
        return reactFragment;
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public int checkPermission(String str, int i2, int i3) {
        return getActivity().checkPermission(str, i2, i3);
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public int checkSelfPermission(String str) {
        return getActivity().checkSelfPermission(str);
    }

    protected ReactDelegate getReactDelegate() {
        return this.mReactDelegate;
    }

    protected ReactHost getReactHost() {
        ReactApplication reactApplication = (ReactApplication) getActivity().getApplication();
        if (reactApplication != null) {
            return reactApplication.getReactHost();
        }
        return null;
    }

    protected ReactNativeHost getReactNativeHost() {
        ReactApplication reactApplication = (ReactApplication) getActivity().getApplication();
        if (reactApplication != null) {
            return reactApplication.getReactNativeHost();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.mReactDelegate.onActivityResult(i2, i3, intent, false);
    }

    public boolean onBackPressed() {
        return this.mReactDelegate.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Boolean boolValueOf;
        String string;
        Bundle bundle2;
        super.onCreate(bundle);
        if (getArguments() != null) {
            string = getArguments().getString(ARG_COMPONENT_NAME);
            bundle2 = getArguments().getBundle(ARG_LAUNCH_OPTIONS);
            boolValueOf = Boolean.valueOf(getArguments().getBoolean(ARG_FABRIC_ENABLED));
        } else {
            boolValueOf = null;
            string = null;
            bundle2 = null;
        }
        if (string == null) {
            throw new IllegalStateException("Cannot loadApp if component name is null");
        }
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.mReactDelegate = new ReactDelegate(getActivity(), getReactHost(), string, bundle2);
        } else {
            this.mReactDelegate = new ReactDelegate(getActivity(), getReactNativeHost(), string, bundle2, boolValueOf.booleanValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mReactDelegate.loadApp();
        return this.mReactDelegate.getReactRootView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mReactDelegate.onHostDestroy();
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        return this.mReactDelegate.shouldShowDevMenuOrReload(i2, keyEvent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mReactDelegate.onHostPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        PermissionListener permissionListener = this.mPermissionListener;
        if (permissionListener == null || !permissionListener.onRequestPermissionsResult(i2, strArr, iArr)) {
            return;
        }
        this.mPermissionListener = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mReactDelegate.onHostResume();
    }

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public void requestPermissions(String[] strArr, int i2, PermissionListener permissionListener) {
        this.mPermissionListener = permissionListener;
        requestPermissions(strArr, i2);
    }
}
