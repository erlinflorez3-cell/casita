package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
final class zabp implements BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ zabq zaa;

    zabp(zabq zabqVar) {
        this.zaa = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() throws Throwable {
        Handler handler = this.zaa.zaa.zar;
        Object[] objArr = {new zabo(this)};
        Method method = Class.forName(ZO.xd("\u0015y b:pD;LS\b/\b\u0005O\u0003\u0019(", (short) (OY.Xd() ^ 6758), (short) (OY.Xd() ^ 24745))).getMethod(Ig.wd("#H~$", (short) (FB.Xd() ^ 9647)), Class.forName(C1626yg.Ud("\f&W|g)}0~H[X\u0019RhF\u00037", (short) (FB.Xd() ^ 32318), (short) (FB.Xd() ^ 2152))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
