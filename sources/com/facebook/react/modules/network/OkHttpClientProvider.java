package com.facebook.react.modules.network;

import android.content.Context;
import com.valid.communication.helpers.CommunicationConstants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class OkHttpClientProvider {
    private static OkHttpClient sClient = null;
    private static OkHttpClientFactory sFactory = null;

    public static OkHttpClient createClient() {
        OkHttpClientFactory okHttpClientFactory = sFactory;
        return okHttpClientFactory != null ? okHttpClientFactory.createNewNetworkModuleClient() : createClientBuilder().build();
    }

    public static OkHttpClient createClient(Context context) {
        OkHttpClientFactory okHttpClientFactory = sFactory;
        return okHttpClientFactory != null ? okHttpClientFactory.createNewNetworkModuleClient() : createClientBuilder(context).build();
    }

    public static OkHttpClient.Builder createClientBuilder() {
        return new OkHttpClient.Builder().connectTimeout(0L, TimeUnit.MILLISECONDS).readTimeout(0L, TimeUnit.MILLISECONDS).writeTimeout(0L, TimeUnit.MILLISECONDS).cookieJar(new ReactCookieJarContainer());
    }

    public static OkHttpClient.Builder createClientBuilder(Context context) {
        return createClientBuilder(context, CommunicationConstants.MAX_BYTES);
    }

    public static OkHttpClient.Builder createClientBuilder(Context context, int i2) throws Throwable {
        OkHttpClient.Builder builderCreateClientBuilder = createClientBuilder();
        if (i2 == 0) {
            return builderCreateClientBuilder;
        }
        short sXd = (short) (FB.Xd() ^ 2540);
        short sXd2 = (short) (FB.Xd() ^ 18703);
        int[] iArr = new int["*6+84-'o$/-2\"*/g{'%*\u001a,'".length()];
        QB qb = new QB("*6+84-'o$/-2\"*/g{'%*\u001a,'");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(C1561oA.ud(":7E\u00130151\u000f3;", (short) (OY.Xd() ^ 245)), new Class[0]);
        try {
            method.setAccessible(true);
            return builderCreateClientBuilder.cache(new Cache(new File((File) method.invoke(context, objArr), C1561oA.yd("kvup4ifgc_", (short) (C1499aX.Xd() ^ (-31961)))), i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static OkHttpClient getOkHttpClient() {
        if (sClient == null) {
            sClient = createClient();
        }
        return sClient;
    }

    public static void setOkHttpClientFactory(OkHttpClientFactory okHttpClientFactory) {
        sFactory = okHttpClientFactory;
    }
}
