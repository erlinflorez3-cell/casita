package com.incode.welcome_sdk.commons.e;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.NetworkUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.data.remote.e;
import dagger.Module;
import dagger.Provides;
import io.reactivex.subjects.PublishSubject;
import io.sentry.HttpStatusCodeRange;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import javax.inject.Named;
import javax.inject.Singleton;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/* JADX INFO: loaded from: classes5.dex */
@Module(includes = {x.class})
public class ad {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f4838b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f4839c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f4840e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f4841f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f4842g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f4843i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4844a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IncodeWelcome.SSLConfig f4845d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r0 = r7 * 5
            int r7 = r0 + 105
            int r0 = r6 * 4
            int r6 = r0 + 4
            int r0 = r8 * 4
            int r5 = 1 - r0
            byte[] r4 = com.incode.welcome_sdk.commons.e.ad.$$a
            byte[] r3 = new byte[r5]
            r2 = 0
            if (r4 != 0) goto L29
            r0 = r7
            r7 = r5
            r1 = r2
        L16:
            int r6 = r6 + 1
            int r7 = r7 + r0
        L19:
            byte r0 = (byte) r7
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r5) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L26:
            r0 = r4[r6]
            goto L16
        L29:
            r1 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.e.ad.$$c(int, int, int):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{111, -109, -75, Ascii.SYN};
        $$b = 75;
    }

    public ad(IncodeWelcome.SSLConfig sSLConfig, boolean z2) {
        this.f4845d = sSLConfig;
        this.f4844a = z2;
    }

    @Provides
    @Singleton
    IncodeWelcome.SSLConfig a() {
        int i2 = 2 % 2;
        int i3 = f4843i + 31;
        f4842g = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome.SSLConfig sSLConfig = this.f4845d;
        if (i4 == 0) {
            int i5 = 14 / 0;
        }
        return sSLConfig;
    }

    @Provides
    @Singleton
    @Named("securedRetrofit")
    Retrofit a(@Named("securedOkHttpClient") OkHttpClient okHttpClient) {
        int i2 = 2 % 2;
        int i3 = f4842g + 113;
        f4843i = i3 % 128;
        int i4 = i3 % 2;
        String str = com.incode.welcome_sdk.commons.c.f4650b;
        if (i4 == 0) {
            return b(okHttpClient, str);
        }
        b(okHttpClient, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    @Named("unsecuredRetrofit")
    Retrofit e(@Named("unsecuredOkHttpClient") OkHttpClient okHttpClient) {
        int i2 = 2 % 2;
        int i3 = f4843i + 107;
        f4842g = i3 % 128;
        int i4 = i3 % 2;
        Retrofit retrofitB = b(okHttpClient, com.incode.welcome_sdk.commons.c.f4650b);
        int i5 = f4843i + 85;
        f4842g = i5 % 128;
        int i6 = i5 % 2;
        return retrofitB;
    }

    @Provides
    @Singleton
    HttpLoggingInterceptor c() {
        int i2 = 2 % 2;
        int i3 = f4842g + 83;
        f4843i = i3 % 128;
        int i4 = i3 % 2;
        HttpLoggingInterceptor httpLoggingInterceptorD = com.incode.welcome_sdk.data.remote.e.e.d();
        int i5 = f4843i + 47;
        f4842g = i5 % 128;
        if (i5 % 2 != 0) {
            return httpLoggingInterceptorD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    PublishSubject<com.incode.welcome_sdk.data.remote.d> d() {
        int i2 = 2 % 2;
        int i3 = f4843i + 123;
        f4842g = i3 % 128;
        if (i3 % 2 != 0) {
            return PublishSubject.create();
        }
        PublishSubject.create();
        throw null;
    }

    @Provides
    @Singleton
    com.incode.welcome_sdk.commons.httpinterceptors.h c(final PublishSubject<com.incode.welcome_sdk.data.remote.d> publishSubject) {
        int i2 = 2 % 2;
        com.incode.welcome_sdk.commons.httpinterceptors.h hVar = new com.incode.welcome_sdk.commons.httpinterceptors.h(new e.InterfaceC0239e() { // from class: com.incode.welcome_sdk.commons.e.ad$$ExternalSyntheticLambda0
            @Override // com.incode.welcome_sdk.data.remote.e.InterfaceC0239e
            public final void onResponseProgress(int i3, long j2, long j3, boolean z2) {
                ad.a(publishSubject, i3, j2, j3, z2);
            }
        });
        int i3 = f4843i + 95;
        f4842g = i3 % 128;
        if (i3 % 2 != 0) {
            return hVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(PublishSubject publishSubject, int i2, long j2, long j3, boolean z2) {
        int i3 = 2 % 2;
        int i4 = f4842g + 49;
        f4843i = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
            if (!publishSubject.hasObservers()) {
                return;
            }
        } else if (!publishSubject.hasObservers()) {
            return;
        }
        publishSubject.onNext(new com.incode.welcome_sdk.data.remote.d(i2, Math.round((j2 * 100.0f) / j3)));
        int i6 = f4843i + 63;
        f4842g = i6 % 128;
        int i7 = i6 % 2;
    }

    private static Retrofit b(OkHttpClient okHttpClient, String str) {
        int i2 = 2 % 2;
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl(StringUtils.addTrailingSlash(str)).addCallAdapterFactory(new com.incode.welcome_sdk.commons.httpinterceptors.o(RxJava2CallAdapterFactory.create())).addConverterFactory(new com.incode.welcome_sdk.commons.utils.x().e()).client(okHttpClient).build();
        int i3 = f4842g + 75;
        f4843i = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 18 / 0;
        }
        return retrofitBuild;
    }

    private static void h(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        com.c.a.h hVar = new com.c.a.h();
        char[] cArr2 = new char[cArr.length];
        hVar.f2753d = 0;
        char[] cArr3 = new char[2];
        while (hVar.f2753d < cArr.length) {
            int i4 = $11 + 53;
            $10 = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[hVar.f2753d];
                cArr3[1] = cArr[hVar.f2753d >> 1];
            } else {
                cArr3[0] = cArr[hVar.f2753d];
                cArr3[1] = cArr[hVar.f2753d + 1];
            }
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $10 + 51;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i5) ^ ((c3 << 4) + ((char) (((long) f4839c) ^ (-995256607575678378L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f4841f)};
                    Object objC = com.c.a.e.e.c(1785266233);
                    if (objC == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e((char) (KeyEvent.getMaxKeyCode() >> 16), 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + HttpStatusCodeRange.DEFAULT_MAX, 1794310720, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) f4840e) ^ (-995256607575678378L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f4838b)};
                    Object objC2 = com.c.a.e.e.c(1785266233);
                    if (objC2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objC2 = com.c.a.e.e.e((char) View.combineMeasuredStates(0, 0), ExpandableListView.getPackedPositionType(0L) + 18, (ViewConfiguration.getPressedStateDuration() >> 16) + 600, 1794310720, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i9 = $10 + 3;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[hVar.f2753d] = cArr3[0];
            cArr2[hVar.f2753d + 1] = cArr3[1];
            Object[] objArr4 = {hVar, hVar};
            Object objC3 = com.c.a.e.e.c(-1055823967);
            if (objC3 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 + 1);
                objC3 = com.c.a.e.e.e((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 675, -1047829032, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objC3).invoke(null, objArr4);
            int i11 = $10 + 81;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    @Provides
    @Singleton
    @Named("securedOkHttpClient")
    OkHttpClient d(com.incode.welcome_sdk.commons.httpinterceptors.h hVar, com.incode.welcome_sdk.commons.httpinterceptors.g gVar, HttpLoggingInterceptor httpLoggingInterceptor, com.incode.welcome_sdk.commons.httpinterceptors.b bVar, com.incode.welcome_sdk.commons.httpinterceptors.e eVar, IncodeWelcome.SSLConfig sSLConfig, com.incode.welcome_sdk.commons.httpinterceptors.n nVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f4842g + 43;
        f4843i = i3 % 128;
        if (i3 % 2 == 0) {
            OkHttpClient.Builder builderE = e(hVar, gVar, httpLoggingInterceptor, bVar, eVar, sSLConfig);
            builderE.addInterceptor(nVar);
            NetworkUtils.enableSSLPinning(builderE, com.incode.welcome_sdk.commons.c.f4650b);
            return builderE.build();
        }
        OkHttpClient.Builder builderE2 = e(hVar, gVar, httpLoggingInterceptor, bVar, eVar, sSLConfig);
        builderE2.addInterceptor(nVar);
        NetworkUtils.enableSSLPinning(builderE2, com.incode.welcome_sdk.commons.c.f4650b);
        builderE2.build();
        throw null;
    }

    @Provides
    @Singleton
    @Named("unsecuredOkHttpClient")
    OkHttpClient e(com.incode.welcome_sdk.commons.httpinterceptors.h hVar, com.incode.welcome_sdk.commons.httpinterceptors.g gVar, HttpLoggingInterceptor httpLoggingInterceptor, com.incode.welcome_sdk.commons.httpinterceptors.b bVar, com.incode.welcome_sdk.commons.httpinterceptors.e eVar, IncodeWelcome.SSLConfig sSLConfig, com.incode.welcome_sdk.commons.httpinterceptors.n nVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f4842g + 61;
        f4843i = i3 % 128;
        int i4 = i3 % 2;
        OkHttpClient.Builder builderE = e(hVar, gVar, httpLoggingInterceptor, bVar, eVar, sSLConfig);
        builderE.addInterceptor(nVar);
        OkHttpClient okHttpClientBuild = builderE.build();
        int i5 = f4842g + 111;
        f4843i = i5 % 128;
        int i6 = i5 % 2;
        return okHttpClientBuild;
    }

    private OkHttpClient.Builder e(com.incode.welcome_sdk.commons.httpinterceptors.h hVar, com.incode.welcome_sdk.commons.httpinterceptors.g gVar, HttpLoggingInterceptor httpLoggingInterceptor, com.incode.welcome_sdk.commons.httpinterceptors.b bVar, com.incode.welcome_sdk.commons.httpinterceptors.e eVar, IncodeWelcome.SSLConfig sSLConfig) throws Throwable {
        int i2 = 2 % 2;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (this.f4844a) {
            int i3 = f4843i + 57;
            f4842g = i3 % 128;
            int i4 = i3 % 2;
            builder.addInterceptor(httpLoggingInterceptor);
        }
        if (sSLConfig != null) {
            Object[] objArr = new Object[1];
            h("㤊뺯蚓欃桗\ue829텩벀㾨鑲퉥쇠ꄙｒ", '=' - AndroidCharacter.getMirror('0'), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            h("㐈呾ﱼ亴\udf00槞檷Ꞿ\ue6caꆭ\uf742\uef52샐偉눰쬷\ue206\udf5e㛂륣ᴑ응柹ꋘൂ谷ằ䢾蒱聺졗츋", 31 - TextUtils.getCapsMode("", 0, 0), objArr2);
            Log.d(strIntern, ((String) objArr2[0]).intern());
            builder.sslSocketFactory(sSLConfig.sslSocketFactory, sSLConfig.trustManager).connectionSpecs(sSLConfig.connectionSpecs);
        } else {
            Object[] objArr3 = new Object[1];
            h("㤊뺯蚓欃桗\ue829텩벀㾨鑲퉥쇠ꄙｒ", 13 - TextUtils.getOffsetAfter("", 0), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            h("㐈呾ﱼ亴\udf00槞檷Ꞿ蟨ֆ濟\ue8feڙ\ua87a梺쀹淫蒶뙈\uec75ﲿ৵㛂륣ᴑ응柹ꋘൂ谷ằ䢾蒱聺졗츋", 35 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr4);
            Log.d(strIntern2, ((String) objArr4[0]).intern());
        }
        OkHttpClient.Builder builderWriteTimeout = builder.addInterceptor(eVar).addInterceptor(bVar).addInterceptor(gVar).addInterceptor(hVar).connectTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS).writeTimeout(30L, TimeUnit.SECONDS);
        int i5 = f4842g + 113;
        f4843i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return builderWriteTimeout;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f4843i = 0;
        f4842g = 1;
        f4840e = (char) 28646;
        f4838b = (char) 19282;
        f4839c = (char) 2385;
        f4841f = (char) 45292;
    }
}
