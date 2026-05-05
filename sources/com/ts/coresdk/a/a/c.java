package com.ts.coresdk.a.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Interceptor {
    private final Context cu;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.cu = context;
    }

    private final boolean A() throws Throwable {
        Context context = this.cu;
        Object[] objArr = {C1561oA.Qd("\b\u0013\u0011\u0010\u0006\u0003\u0013\u0007\u0013\u0005\u000f\u0013", (short) (FB.Xd() ^ 20672))};
        Method method = Class.forName(C1593ug.zd("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u0010\u001d\u001d$\u0016 'aw%%,\u001e2/", (short) (C1607wl.Xd() ^ 21914), (short) (C1607wl.Xd() ^ 30288))).getMethod(C1561oA.Kd("zy\ni\u0011\f\u000e\u007f\to\u0003\u0011\u0016\n\u0005\b", (short) (C1607wl.Xd() ^ 28182)), Class.forName(C1561oA.od("\u0010\u0006\u001a\u0004O\r\u0001\r\u0005Jn\u000f\f\u0002\u0006}", (short) (C1580rY.Xd() ^ (-19316)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke);
            ConnectivityManager connectivityManager = (ConnectivityManager) objInvoke;
            return a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final boolean a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(4) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
        }
        return false;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        if (!A()) {
            throw new com.ts.coresdk.a.a();
        }
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "");
        Response responseProceed = chain.proceed(builderNewBuilder.build());
        Intrinsics.checkNotNullExpressionValue(responseProceed, "");
        return responseProceed;
    }
}
