package com.appsflyer;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.Jg;
import yg.OY;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) throws Throwable {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("\b1As\u0013)F,\f4Mw\u000b0X.m6Oy\r<Z", (short) (C1499aX.Xd() ^ (-26289)), (short) (C1499aX.Xd() ^ (-2515)))).getMethod(ZO.xd("\u007f\"A@dsW\b^+\u0005O2`\u0011\",s\u0001,&", (short) (OY.Xd() ^ 20493), (short) (OY.Xd() ^ 2861)), new Class[0]);
        try {
            method.setAccessible(true);
            appsFlyerLib.updateServerUninstallToken((Context) method.invoke(this, objArr), str);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
