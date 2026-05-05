package com.davivienda.daviviendaapp.bridges.appToApp;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class AppToAppManager extends ReactContextBaseJavaModule {
    public AppToAppManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return Wg.Zd("8G\u0017:%VU\u0015A5\u0012B\u0018uR", (short) (ZN.Xd() ^ (1180483640 ^ 1180498870)), (short) (ZN.Xd() ^ ((1240495158 ^ 1915427138) ^ 1004227976)));
    }

    @ReactMethod
    public void returnToWalletByResult(String str) {
        Intent intent = new Intent();
        Activity currentActivity = getCurrentActivity();
        intent.putExtra(C1561oA.Xd("\u0018\u0018&$#)#<\u001f/0@#&8.<(<299K?3B@@@F9", (short) (FB.Xd() ^ (FB.Xd() ^ (3541244 ^ 1608076726)))), str);
        currentActivity.setResult(C1607wl.Xd() ^ (-1849955291), intent);
        currentActivity.finish();
    }
}
