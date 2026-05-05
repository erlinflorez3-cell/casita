package com.npmdavi.davinotification;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class DaviNotificationPackage implements ReactPackage {
    public DaviNotificationPackage() {
        initialize();
    }

    private void initialize() {
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DaviNotificationModule(reactApplicationContext));
        arrayList.add(new PushNotificationModule(reactApplicationContext));
        arrayList.add(new NotificationChannelModule(reactApplicationContext));
        arrayList.add(new MyBrazeModule(reactApplicationContext));
        arrayList.add(new MyBrazeInappsModule(reactApplicationContext));
        arrayList.add(new NotificationStorageModule(reactApplicationContext));
        arrayList.add(new UserInformationModule(reactApplicationContext));
        MyFirebaseMessagingService.setReactApplicationContext(reactApplicationContext);
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
