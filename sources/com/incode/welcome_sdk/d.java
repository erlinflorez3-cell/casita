package com.incode.welcome_sdk;

import com.incode.welcome_sdk.commons.httpinterceptors.o;
import com.incode.welcome_sdk.commons.utils.NetworkUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.commons.utils.x;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f6754a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6755c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6756d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f6757b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f6758e = new x();

    private d(String str, boolean z2) throws Throwable {
        OkHttpClient.Builder builderE = e(z2);
        builderE.build();
        NetworkUtils.enableSSLPinning(builderE, str);
        this.f6757b = (e) c(str, e(z2).build()).create(e.class);
    }

    private static OkHttpClient.Builder e(boolean z2) {
        int i2 = 2 % 2;
        OkHttpClient.Builder builderWriteTimeout = new OkHttpClient.Builder().connectTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS).writeTimeout(30L, TimeUnit.SECONDS);
        if (z2) {
            int i3 = f6756d + 23;
            f6755c = i3 % 128;
            int i4 = i3 % 2;
            builderWriteTimeout.addInterceptor(com.incode.welcome_sdk.data.remote.e.e.d());
            int i5 = f6755c + 49;
            f6756d = i5 % 128;
            int i6 = i5 % 2;
        }
        return builderWriteTimeout;
    }

    private Retrofit c(String str, OkHttpClient okHttpClient) {
        int i2 = 2 % 2;
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl(StringUtils.addTrailingSlash(str)).addCallAdapterFactory(new o(RxJava2CallAdapterFactory.create())).addConverterFactory(this.f6758e.e()).client(okHttpClient).build();
        int i3 = f6756d + 5;
        f6755c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 84 / 0;
        }
        return retrofitBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.incode.welcome_sdk.d c(java.lang.String r4) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.d.f6755c
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.incode.welcome_sdk.d.f6756d = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L2c
            com.incode.welcome_sdk.d r1 = com.incode.welcome_sdk.d.f6754a
            r0 = 98
            int r0 = r0 / 0
            if (r1 != 0) goto L1e
        L16:
            com.incode.welcome_sdk.d r1 = new com.incode.welcome_sdk.d
            r0 = 1
            r1.<init>(r4, r0)
            com.incode.welcome_sdk.d.f6754a = r1
        L1e:
            com.incode.welcome_sdk.d r2 = com.incode.welcome_sdk.d.f6754a
            int r0 = com.incode.welcome_sdk.d.f6756d
            int r1 = r0 + 5
            int r0 = r1 % 128
            com.incode.welcome_sdk.d.f6755c = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L31
            return r2
        L2c:
            com.incode.welcome_sdk.d r0 = com.incode.welcome_sdk.d.f6754a
            if (r0 != 0) goto L1e
            goto L16
        L31:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.d.c(java.lang.String):com.incode.welcome_sdk.d");
    }

    public static d a(String str, boolean z2) {
        int i2 = 2 % 2;
        if (f6754a == null) {
            f6754a = new d(str, z2);
            int i3 = f6756d + 73;
            f6755c = i3 % 128;
            int i4 = i3 % 2;
        }
        d dVar = f6754a;
        int i5 = f6756d + 89;
        f6755c = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    public final Observable<ResponseBody> e(String str) {
        int i2 = 2 % 2;
        int i3 = f6755c + 25;
        f6756d = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseBody> observableB = this.f6757b.b(str, "1.0");
        int i5 = f6756d + 35;
        f6755c = i5 % 128;
        int i6 = i5 % 2;
        return observableB;
    }
}
