package com.incode.welcome_sdk.data.remote.e;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.httpinterceptors.n;
import com.incode.welcome_sdk.commons.utils.NetworkUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.commons.utils.x;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f10138a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.incode.welcome_sdk.commons.httpinterceptors.e f10139b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HttpLoggingInterceptor f10140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f10141d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static IncodeWelcome.SSLConfig f10142e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f10143f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f10144h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f10145i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f10146j = 1;

    private e() {
    }

    @JvmStatic
    public static final void c(com.incode.welcome_sdk.commons.httpinterceptors.e eVar, IncodeWelcome.SSLConfig sSLConfig, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f10144h + 17;
        f10143f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(eVar, "");
        f10139b = eVar;
        f10142e = sSLConfig;
        f10138a = z2;
        int i5 = f10143f + 113;
        f10144h = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static b c() throws Throwable {
        int i2 = 2 % 2;
        OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
        if (NetworkUtils.hasToUseSecuredNetwork()) {
            builderNewBuilder.addInterceptor(new n());
            NetworkUtils.enableSSLPinning(builderNewBuilder, com.incode.welcome_sdk.commons.c.f4650b);
        }
        if (!(!f10138a)) {
            builderNewBuilder.addInterceptor(f10140c);
        }
        IncodeWelcome.SSLConfig sSLConfig = f10142e;
        if (sSLConfig != null) {
            int i3 = f10143f + 31;
            f10144h = i3 % 128;
            int i4 = i3 % 2;
            builderNewBuilder.sslSocketFactory(sSLConfig.sslSocketFactory, sSLConfig.trustManager).connectionSpecs(sSLConfig.connectionSpecs);
        }
        com.incode.welcome_sdk.commons.httpinterceptors.e eVar = f10139b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            eVar = null;
        }
        OkHttpClient okHttpClientBuild = builderNewBuilder.addInterceptor(eVar).addInterceptor(new com.incode.welcome_sdk.commons.httpinterceptors.b()).connectTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS).writeTimeout(30L, TimeUnit.SECONDS).build();
        Retrofit.Builder builder = new Retrofit.Builder();
        String str = com.incode.welcome_sdk.commons.c.f4650b;
        Intrinsics.checkNotNullExpressionValue(str, "");
        Retrofit retrofitBuild = builder.baseUrl(StringUtils.addTrailingSlash(str)).addConverterFactory(new x().e()).client(okHttpClientBuild).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "");
        Object objCreate = retrofitBuild.create(b.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "");
        b bVar = (b) objCreate;
        int i5 = f10143f + 97;
        f10144h = i5 % 128;
        if (i5 % 2 == 0) {
            return bVar;
        }
        throw null;
    }

    static {
        Object obj;
        HttpLoggingInterceptor.Level level;
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: com.incode.welcome_sdk.data.remote.e.e$$ExternalSyntheticLambda0
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public final void log(String str) {
                e.e(str);
            }
        });
        HttpLoggingInterceptor.Level[] levelArrValues = HttpLoggingInterceptor.Level.values();
        int length = levelArrValues.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                int i3 = f10146j + 33;
                f10145i = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                level = null;
                break;
            }
            level = levelArrValues[i2];
            if (Intrinsics.areEqual(level.name(), "BODY")) {
                break;
            }
            i2++;
            int i6 = f10145i + 117;
            f10146j = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        if (level == null) {
            int i9 = f10145i + 71;
            f10146j = i9 % 128;
            if (i9 % 2 == 0) {
                HttpLoggingInterceptor.Level level2 = HttpLoggingInterceptor.Level.BODY;
                obj.hashCode();
                throw null;
            }
            level = HttpLoggingInterceptor.Level.BODY;
        }
        httpLoggingInterceptor.setLevel(level);
        f10140c = httpLoggingInterceptor;
    }

    public static final HttpLoggingInterceptor d() {
        int i2 = 2 % 2;
        int i3 = f10143f;
        int i4 = i3 + 49;
        f10144h = i4 % 128;
        int i5 = i4 % 2;
        HttpLoggingInterceptor httpLoggingInterceptor = f10140c;
        int i6 = i3 + 35;
        f10144h = i6 % 128;
        if (i6 % 2 == 0) {
            return httpLoggingInterceptor;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(String str) {
        int i2 = 2 % 2;
        int i3 = f10143f + 109;
        f10144h = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Timber.Forest.tag("IW-Network").d(str, new Object[1]);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Timber.Forest.tag("IW-Network").d(str, new Object[0]);
        }
        int i4 = f10143f + 87;
        f10144h = i4 % 128;
        int i5 = i4 % 2;
    }
}
