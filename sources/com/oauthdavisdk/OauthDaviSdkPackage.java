package com.oauthdavisdk;

import androidx.multidex.MultiDexApplication;
import com.dynatrace.android.callback.Callback;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class OauthDaviSdkPackage extends MultiDexApplication implements ReactPackage {
    @Override // androidx.multidex.MultiDexApplication, android.app.Application
    public /* synthetic */ void onCreate() {
        Callback.onCreate(this);
        super.onCreate();
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new OauthDaviSdkModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
