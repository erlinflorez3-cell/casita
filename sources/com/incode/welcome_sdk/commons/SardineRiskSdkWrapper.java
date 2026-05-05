package com.incode.welcome_sdk.commons;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.commons.SardineRiskSdkWrapper;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.sardine.ai.mdisdk.MobileIntelligence;
import com.sardine.ai.mdisdk.Options;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class SardineRiskSdkWrapper implements ISardineRiskSdkWrapper {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static final int $stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4601a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f4602b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f4603c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4604d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4605e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f4606j = 0;
    private final Application application;
    private String clientId;
    private String environment;
    private final IncodeWelcomeRepository incodeWelcomeRepository;
    private boolean isInitialized;
    private String parentSessionKey;
    private String userId;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, byte r9, int r10) {
        /*
            byte[] r7 = com.incode.welcome_sdk.commons.SardineRiskSdkWrapper.$$a
            int r0 = r9 * 3
            int r6 = 1 - r0
            int r0 = r8 * 2
            int r5 = r0 + 4
            int r4 = r10 + 102
            byte[] r3 = new byte[r6]
            r2 = 0
            if (r7 != 0) goto L26
            r0 = r6
            r1 = r2
        L13:
            int r4 = r4 + r0
            int r5 = r5 + 1
        L16:
            byte r0 = (byte) r4
            r3[r1] = r0
            int r1 = r1 + 1
            if (r1 != r6) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L23:
            r0 = r7[r5]
            goto L13
        L26:
            r1 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.SardineRiskSdkWrapper.$$c(int, byte, int):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{53, 69, 94, -115};
        $$b = 249;
    }

    public SardineRiskSdkWrapper(Application application, IncodeWelcomeRepository incodeWelcomeRepository) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.application = application;
        this.incodeWelcomeRepository = incodeWelcomeRepository;
    }

    public static final /* synthetic */ void access$conditionallyLog(SardineRiskSdkWrapper sardineRiskSdkWrapper, String str) {
        int i2 = 2 % 2;
        int i3 = f4604d + 7;
        f4601a = i3 % 128;
        int i4 = i3 % 2;
        sardineRiskSdkWrapper.conditionallyLog(str);
        if (i4 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$processConfigurationAndInitIfPossible(SardineRiskSdkWrapper sardineRiskSdkWrapper, Map map) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f4601a + 43;
        f4604d = i3 % 128;
        int i4 = i3 % 2;
        sardineRiskSdkWrapper.processConfigurationAndInitIfPossible(map);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f4601a + 5;
        f4604d = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Application getApplication() {
        int i2 = 2 % 2;
        int i3 = f4601a + 89;
        int i4 = i3 % 128;
        f4604d = i4;
        int i5 = i3 % 2;
        Application application = this.application;
        int i6 = i4 + 107;
        f4601a = i6 % 128;
        if (i6 % 2 == 0) {
            return application;
        }
        throw null;
    }

    public final IncodeWelcomeRepository getIncodeWelcomeRepository() {
        int i2 = 2 % 2;
        int i3 = f4604d;
        int i4 = i3 + 57;
        f4601a = i4 % 128;
        int i5 = i4 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.incodeWelcomeRepository;
        int i6 = i3 + 15;
        f4601a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 6 / 0;
        }
        return incodeWelcomeRepository;
    }

    private final String getGenerateChildSessionKey() {
        int i2 = 2 % 2;
        int i3 = f4604d + 49;
        f4601a = i3 % 128;
        if (i3 % 2 == 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        int i4 = 4 / 0;
        return string2;
    }

    static final class d extends Lambda implements Function1<Boolean, CompletableSource> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f4607a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f4608b = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f4607a + 71;
            f4608b = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceA = a(bool);
            int i5 = f4608b + 21;
            f4607a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 64 / 0;
            }
            return completableSourceA;
        }

        private CompletableSource a(Boolean bool) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(bool, "");
            if (!bool.booleanValue()) {
                Completable completableComplete = Completable.complete();
                int i3 = f4607a + 43;
                f4608b = i3 % 128;
                int i4 = i3 % 2;
                return completableComplete;
            }
            Single<Map<String, Object>> singleObserveOn = SardineRiskSdkWrapper.this.getIncodeWelcomeRepository().getCustomConfig().observeOn(AndroidSchedulers.mainThread());
            final SardineRiskSdkWrapper sardineRiskSdkWrapper = SardineRiskSdkWrapper.this;
            final Function1<Map<String, Object>, Unit> function1 = new Function1<Map<String, Object>, Unit>() { // from class: com.incode.welcome_sdk.commons.SardineRiskSdkWrapper.d.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f4610b = 1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f4611d = 0;

                private void a(Map<String, Object> map) throws Throwable {
                    int i5 = 2 % 2;
                    int i6 = f4610b + 99;
                    f4611d = i6 % 128;
                    int i7 = i6 % 2;
                    SardineRiskSdkWrapper sardineRiskSdkWrapper2 = sardineRiskSdkWrapper;
                    Intrinsics.checkNotNull(map);
                    SardineRiskSdkWrapper.access$processConfigurationAndInitIfPossible(sardineRiskSdkWrapper2, map);
                    int i8 = f4611d + 85;
                    f4610b = i8 % 128;
                    int i9 = i8 % 2;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(Map<String, Object> map) throws Throwable {
                    int i5 = 2 % 2;
                    int i6 = f4611d + 3;
                    f4610b = i6 % 128;
                    int i7 = i6 % 2;
                    a(map);
                    Unit unit = Unit.INSTANCE;
                    int i8 = f4610b + 83;
                    f4611d = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 72 / 0;
                    }
                    return unit;
                }

                {
                    super(1);
                }
            };
            Single<Map<String, Object>> singleDoOnSuccess = singleObserveOn.doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.commons.SardineRiskSdkWrapper$d$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SardineRiskSdkWrapper.d.c(function1, obj);
                }
            });
            final AnonymousClass3 anonymousClass3 = new Function1<Throwable, Unit>() { // from class: com.incode.welcome_sdk.commons.SardineRiskSdkWrapper.d.3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f4613a = 1;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f4614b = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f4615c = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f4617e = 0;

                private static void c(Throwable th) {
                    int i5 = 2 % 2;
                    int i6 = f4615c + 25;
                    f4617e = i6 % 128;
                    if (i6 % 2 != 0) {
                        Timber.Forest.e(th, "Error while fetching custom config for RiskSDK.", new Object[0]);
                    } else {
                        Timber.Forest.e(th, "Error while fetching custom config for RiskSDK.", new Object[0]);
                    }
                    int i7 = f4615c + 87;
                    f4617e = i7 % 128;
                    int i8 = i7 % 2;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(Throwable th) {
                    int i5 = 2 % 2;
                    int i6 = f4615c + 7;
                    f4617e = i6 % 128;
                    int i7 = i6 % 2;
                    c(th);
                    Unit unit = Unit.INSTANCE;
                    int i8 = f4615c + 47;
                    f4617e = i8 % 128;
                    if (i8 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }

                static {
                    int i5 = f4614b + 33;
                    f4613a = i5 % 128;
                    if (i5 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
            Completable completableIgnoreElement = singleDoOnSuccess.doOnError(new Consumer() { // from class: com.incode.welcome_sdk.commons.SardineRiskSdkWrapper$d$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SardineRiskSdkWrapper.d.e(anonymousClass3, obj);
                }
            }).ignoreElement();
            int i5 = f4607a + 63;
            f4608b = i5 % 128;
            if (i5 % 2 == 0) {
                return completableIgnoreElement;
            }
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f4608b + 45;
            f4607a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke(obj);
            } else {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f4607a + 121;
            f4608b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i5 = f4607a + 13;
            f4608b = i5 % 128;
            int i6 = i5 % 2;
        }

        d() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompletableSource downloadConfigAndInitIfAvailable$lambda$0(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4601a + 111;
        f4604d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (CompletableSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.ISardineRiskSdkWrapper
    public final Completable downloadConfigAndInitIfAvailable() {
        int i2 = 2 % 2;
        Single<Boolean> singleVerifyDependencyExists = verifyDependencyExists();
        final d dVar = new d();
        Completable completableFlatMapCompletable = singleVerifyDependencyExists.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.commons.SardineRiskSdkWrapper$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SardineRiskSdkWrapper.downloadConfigAndInitIfAvailable$lambda$0(dVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f4604d + 121;
        f4601a = i3 % 128;
        int i4 = i3 % 2;
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean verifyDependencyExists$lambda$1(SardineRiskSdkWrapper sardineRiskSdkWrapper) {
        int i2 = 2 % 2;
        int i3 = f4604d + 123;
        f4601a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sardineRiskSdkWrapper, "");
        } else {
            Intrinsics.checkNotNullParameter(sardineRiskSdkWrapper, "");
        }
        int i4 = f4604d + 103;
        f4601a = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final Single<Boolean> verifyDependencyExists() {
        int i2 = 2 % 2;
        int i3 = f4604d + 7;
        f4601a = i3 % 128;
        int i4 = i3 % 2;
        Single<Boolean> singleFromCallable = Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.commons.SardineRiskSdkWrapper$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SardineRiskSdkWrapper.verifyDependencyExists$lambda$1(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFromCallable, "");
        int i5 = f4604d + 41;
        f4601a = i5 % 128;
        int i6 = i5 % 2;
        return singleFromCallable;
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 81;
        int i5 = i4 % 128;
        $11 = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (str2 != null) {
            int i6 = i5 + 33;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        com.c.a.m mVar = new com.c.a.m();
        mVar.f2778b = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        mVar.f2779e = 0;
        while (mVar.f2779e < cArr.length) {
            int i7 = $11 + 21;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = mVar.f2779e;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[mVar.f2779e]), mVar, mVar};
                    Object objC = com.c.a.e.e.c(-1726804722);
                    if (objC == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19, 884 - TextUtils.getTrimmedLength(""), -1719070857, false, $$c(b2, b3, (byte) (b3 | 10)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i8] = ((Long) ((Method) objC).invoke(null, objArr2)).longValue() + (f4603c % (-7382027491817826291L));
                    Object[] objArr3 = {mVar, mVar};
                    Object objC2 = com.c.a.e.e.c(1025650959);
                    if (objC2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objC2 = com.c.a.e.e.e((char) TextUtils.getOffsetBefore("", 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 987, 1035481974, false, $$c(b4, b5, (byte) (b5 | Ascii.CR)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i9 = mVar.f2779e;
                Object[] objArr4 = {Integer.valueOf(cArr[mVar.f2779e]), mVar, mVar};
                Object objC3 = com.c.a.e.e.c(-1726804722);
                if (objC3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objC3 = com.c.a.e.e.e((char) (Process.myPid() >> 22), TextUtils.indexOf("", "", 0) + 18, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 885, -1719070857, false, $$c(b6, b7, (byte) (b7 | 10)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i9] = ((Long) ((Method) objC3).invoke(null, objArr4)).longValue() ^ (f4603c ^ (-7382027491817826291L));
                Object[] objArr5 = {mVar, mVar};
                Object objC4 = com.c.a.e.e.c(1025650959);
                if (objC4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objC4 = com.c.a.e.e.e((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20, 987 - TextUtils.indexOf((CharSequence) "", '0', 0), 1035481974, false, $$c(b8, b9, (byte) (b9 | Ascii.CR)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        mVar.f2779e = 0;
        while (mVar.f2779e < cArr.length) {
            cArr2[mVar.f2779e] = (char) jArr[mVar.f2779e];
            Object[] objArr6 = {mVar, mVar};
            Object objC5 = com.c.a.e.e.c(1025650959);
            if (objC5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objC5 = com.c.a.e.e.e((char) KeyEvent.normalizeMetaState(0), 20 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 988, 1035481974, false, $$c(b10, b11, (byte) (b11 | Ascii.CR)), new Class[]{Object.class, Object.class});
            }
            ((Method) objC5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private final void processConfigurationAndInitIfPossible(Map<String, Object> map) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f4601a + 37;
        f4604d = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f("≒鷍崩ᵢ\udcdc鰎屪Ό\udf05齽度Ḁ\ude69馁夳", View.MeasureSpec.getMode(0) + 49069, objArr);
        String str = (String) map.get(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        g(new int[]{0, 17, 189, 0}, false, "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000", objArr2);
        String str2 = (String) map.get(((String) objArr2[0]).intern());
        String str3 = str2;
        if (str3 == null || StringsKt.isBlank(str3)) {
            Object[] objArr3 = new Object[1];
            g(new int[]{17, PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, 0, 0}, false, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", objArr3);
            conditionallyLog(((String) objArr3[0]).intern());
            return;
        }
        String str4 = str;
        if (!(str4 == null || StringsKt.isBlank(str4))) {
            this.parentSessionKey = str2;
            this.clientId = str;
            Object[] objArr4 = new Object[1];
            g(new int[]{239, 18, 0, 0}, true, "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", objArr4);
            String strIntern = (String) map.get(((String) objArr4[0]).intern());
            if (strIntern == null) {
                int i5 = f4604d + 99;
                f4601a = i5 % 128;
                if (i5 % 2 != 0) {
                    Object[] objArr5 = new Object[1];
                    f("≱슐\ue3a8背ꇸ䘍朧ѝ╶얔", 57570 << MotionEvent.axisFromString(""), objArr5);
                    strIntern = ((String) objArr5[0]).intern();
                } else {
                    Object[] objArr6 = new Object[1];
                    f("≱슐\ue3a8背ꇸ䘍朧ѝ╶얔", 57570 - MotionEvent.axisFromString(""), objArr6);
                    strIntern = ((String) objArr6[0]).intern();
                }
            }
            this.environment = strIntern;
            Object[] objArr7 = new Object[1];
            f("≒ዃ䌵뎌\ue0e4텀ƶ瘡Ꝫ韟쐭㕉旡", 12451 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
            this.userId = (String) map.get(((String) objArr7[0]).intern());
            init();
            return;
        }
        int i6 = f4601a + 105;
        f4604d = i6 % 128;
        if (i6 % 2 == 0) {
            Object[] objArr8 = new Object[1];
            g(new int[]{129, 110, 0, 80}, true, "\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", objArr8);
            obj = objArr8[0];
        } else {
            Object[] objArr9 = new Object[1];
            g(new int[]{129, 110, 0, 80}, false, "\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", objArr9);
            obj = objArr9[0];
        }
        conditionallyLog(((String) obj).intern());
    }

    private final void init() throws Throwable {
        int i2 = 2 % 2;
        String generateChildSessionKey = getGenerateChildSessionKey();
        Options.Builder builder = new Options.Builder();
        String str = this.clientId;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        Options.Builder clientID = builder.setClientID(str);
        String str3 = this.parentSessionKey;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f4604d + 5;
            f4601a = i3 % 128;
            int i4 = i3 % 2;
            str3 = null;
        }
        Options.Builder userId = clientID.setParentSessionKey(str3).setSessionKey(generateChildSessionKey).setUserId(this.userId);
        String str4 = this.environment;
        if (str4 == null) {
            int i5 = f4601a + 27;
            f4604d = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str2 = str4;
        }
        Options optionsBuild = userId.setEnvironment(str2).build();
        Intrinsics.checkNotNullExpressionValue(optionsBuild, "");
        MobileIntelligence.init(this.application, optionsBuild);
        String strDumpParamsToString = dumpParamsToString(generateChildSessionKey);
        StringBuilder sb = new StringBuilder(58);
        Object[] objArr = new Object[1];
        f("≓쐻\ueed4邓묞巚䞸湤ჵ㪃\udd5d쟢\ue984遄뫲峼䝘槬Ꮎ㩜\udc14욯\ue94f錝떳屿䘋棠፦㔓\udfd8왯\ue804鋁땴弾䇘殒ሿ㓝\uded7셪", TextUtils.lastIndexOf("", '0') + 58964, objArr);
        conditionallyLog(sb.append(((String) objArr[0]).intern()).append(strDumpParamsToString).toString());
        this.isInitialized = true;
    }

    private final String dumpParamsToString(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f4601a + 21;
        f4604d = i3 % 128;
        if (i3 % 2 != 0) {
            String str2 = this.parentSessionKey;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            }
            String str3 = this.userId;
            String str4 = this.clientId;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str4 = null;
            }
            String str5 = this.environment;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = f4604d + 91;
                f4601a = i4 % 128;
                int i5 = i4 % 2;
                str5 = null;
            }
            StringBuilder sb = new StringBuilder(235);
            Object[] objArr = new Object[1];
            f("∋Ć摯䭔꺽跢\uf0cb퐰㬙Ṿ綧ꂌ蟵\uea86칳\u2d29ဃ矷嫒릗鴷쀒✀ઊ榉䳮돗霼贈\ud94a㲳掘䛁ꨦ褏\uec74팁㛑ᖮ碃屪荗\ue608엢⣾྿獺嘒땱", 9047 - AndroidCharacter.getMirror('0'), objArr);
            StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(str);
            Object[] objArr2 = new Object[1];
            f("∋\uda14퉋쪾싵ﬨ\uf31f\ueb52\ue389鯼逳衦聝료낗ꥻꄣ姡凕䦚䙶總盼溱暐ὃᜍ\u0fddި㱹㐍ⱊ", 63541 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
            StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(str2);
            Object[] objArr3 = new Object[1];
            g(new int[]{257, 22, 0, 0}, true, "\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", objArr3);
            StringBuilder sbAppend3 = sbAppend2.append(((String) objArr3[0]).intern()).append(str3);
            Object[] objArr4 = new Object[1];
            f("∋\uf1b2蔇墘汭Ͼ흓\ueb24뺹刊憟㕰죅鰊끨䟰᭘⺧숹醜ꔴ祪ಙ—", (Process.myPid() >> 22) + 54163, objArr4);
            StringBuilder sbAppend4 = sbAppend3.append(((String) objArr4[0]).intern()).append(str4);
            Object[] objArr5 = new Object[1];
            f("∋梐띃숲ࣥ坔\ue207⣶瞩舘죋ឺꉭ\ue880㟊䈰襧\ud7a9戁ꥍ\uf7bb˩䥒鞈⋭楲럛", 19121 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr5);
            StringBuilder sbAppend5 = sbAppend4.append(((String) objArr5[0]).intern()).append(str5);
            Object[] objArr6 = new Object[1];
            f("≜", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 59011, objArr6);
            return StringsKt.trimMargin$default(sbAppend5.append(((String) objArr6[0]).intern()).toString(), null, 1, null);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
    
        if (r7.isInitialized != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        r1 = new java.lang.Object[1];
        g(new int[]{com.drew.metadata.iptc.IptcDirectory.TAG_DATE_SENT, 54, 176, 11}, true, null, r1);
        conditionallyLog(((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r7.isInitialized != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        com.sardine.ai.mdisdk.MobileIntelligence.updateOptions(new com.sardine.ai.mdisdk.UpdateOptions.Builder().setFlow(r8).build());
        r3 = new java.lang.StringBuilder(63);
        r1 = new java.lang.Object[1];
        g(new int[]{279, 47, 105, 0}, true, "\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", r1);
        conditionallyLog(r3.append(((java.lang.String) r1[0]).intern()).append(r8).toString());
        r1 = com.incode.welcome_sdk.commons.SardineRiskSdkWrapper.f4604d + 77;
        com.incode.welcome_sdk.commons.SardineRiskSdkWrapper.f4601a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0064, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
    
        r0 = 66 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0069, code lost:
    
        return;
     */
    @Override // com.incode.welcome_sdk.commons.ISardineRiskSdkWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void logScreenShown(java.lang.String r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.commons.SardineRiskSdkWrapper.f4604d
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.SardineRiskSdkWrapper.f4601a = r0
            int r1 = r1 % r6
            java.lang.String r0 = ""
            r5 = 1
            r4 = 0
            if (r1 == 0) goto L6a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r1 = r7.isInitialized
            r0 = 39
            int r0 = r0 / r4
            if (r1 == 0) goto L72
        L1c:
            com.sardine.ai.mdisdk.UpdateOptions$Builder r0 = new com.sardine.ai.mdisdk.UpdateOptions$Builder
            r0.<init>()
            com.sardine.ai.mdisdk.UpdateOptions$Builder r0 = r0.setFlow(r8)
            com.sardine.ai.mdisdk.UpdateOptions r0 = r0.build()
            com.sardine.ai.mdisdk.MobileIntelligence.updateOptions(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r0 = 63
            r3.<init>(r0)
            r2 = 47
            r1 = 105(0x69, float:1.47E-43)
            r0 = 279(0x117, float:3.91E-43)
            int[] r2 = new int[]{r0, r2, r1, r4}
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001"
            g(r2, r5, r0, r1)
            r0 = r1[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            r7.conditionallyLog(r0)
            int r0 = com.incode.welcome_sdk.commons.SardineRiskSdkWrapper.f4604d
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.SardineRiskSdkWrapper.f4601a = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L69
            r0 = 66
            int r0 = r0 / r4
        L69:
            return
        L6a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r7.isInitialized
            if (r0 == 0) goto L72
            goto L1c
        L72:
            r3 = 176(0xb0, float:2.47E-43)
            r2 = 11
            r1 = 326(0x146, float:4.57E-43)
            r0 = 54
            int[] r2 = new int[]{r1, r0, r3, r2}
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 0
            g(r2, r5, r0, r1)
            r0 = r1[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r7.conditionallyLog(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.SardineRiskSdkWrapper.logScreenShown(java.lang.String):void");
    }

    public static final class e implements MobileIntelligence.Callback<MobileIntelligence.SubmitResponse> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f4618c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f4619d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ CompletableEmitter f4621e;

        e(CompletableEmitter completableEmitter) {
            this.f4621e = completableEmitter;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            int i2 = 2 % 2;
            int i3 = f4618c + 31;
            f4619d = i3 % 128;
            int i4 = i3 % 2;
            b((MobileIntelligence.SubmitResponse) obj);
            if (i4 == 0) {
                throw null;
            }
        }

        private void b(MobileIntelligence.SubmitResponse submitResponse) {
            int i2 = 2 % 2;
            int i3 = f4619d + 25;
            f4618c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(submitResponse, "");
                SardineRiskSdkWrapper.access$conditionallyLog(SardineRiskSdkWrapper.this, "RiskSDK submit data success.");
                this.f4621e.onComplete();
            } else {
                Intrinsics.checkNotNullParameter(submitResponse, "");
                SardineRiskSdkWrapper.access$conditionallyLog(SardineRiskSdkWrapper.this, "RiskSDK submit data success.");
                this.f4621e.onComplete();
                int i4 = 92 / 0;
            }
        }

        public final void onError(Exception exc) {
            int i2 = 2 % 2;
            int i3 = f4619d + 9;
            f4618c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(exc, "");
            Exception exc2 = exc;
            Timber.Forest.e(exc2, "RiskSDK submit data failed.", new Object[0]);
            this.f4621e.onError(exc2);
            int i5 = f4619d + 93;
            f4618c = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadEvents$lambda$2(SardineRiskSdkWrapper sardineRiskSdkWrapper, CompletableEmitter completableEmitter) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f4601a + 31;
        f4604d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sardineRiskSdkWrapper, "");
            Intrinsics.checkNotNullParameter(completableEmitter, "");
            boolean z2 = sardineRiskSdkWrapper.isInitialized;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sardineRiskSdkWrapper, "");
        Intrinsics.checkNotNullParameter(completableEmitter, "");
        if (sardineRiskSdkWrapper.isInitialized) {
            MobileIntelligence.submitData(sardineRiskSdkWrapper.new e(completableEmitter));
            Object[] objArr = new Object[1];
            g(new int[]{416, 27, 53, 0}, true, "\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", objArr);
            sardineRiskSdkWrapper.conditionallyLog(((String) objArr[0]).intern());
            return;
        }
        Object[] objArr2 = new Object[1];
        g(new int[]{443, 51, 0, 0}, false, "\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", objArr2);
        sardineRiskSdkWrapper.conditionallyLog(((String) objArr2[0]).intern());
        completableEmitter.onComplete();
        int i4 = f4604d + 67;
        f4601a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.commons.ISardineRiskSdkWrapper
    public final Completable uploadEvents() {
        int i2 = 2 % 2;
        int i3 = f4604d + 11;
        f4601a = i3 % 128;
        int i4 = i3 % 2;
        Completable completableCreate = Completable.create(new CompletableOnSubscribe() { // from class: com.incode.welcome_sdk.commons.SardineRiskSdkWrapper$$ExternalSyntheticLambda0
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(CompletableEmitter completableEmitter) throws Throwable {
                SardineRiskSdkWrapper.uploadEvents$lambda$2(this.f$0, completableEmitter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableCreate, "");
        int i5 = f4601a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f4604d = i5 % 128;
        if (i5 % 2 != 0) {
            return completableCreate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void conditionallyLog(String str) {
        int i2 = 2 % 2;
        int i3 = f4601a + 105;
        f4604d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
    }

    private static void g(int[] iArr, boolean z2, String str, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr;
        int length;
        char[] cArr2;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $10 + 77;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        com.c.a.o oVar = new com.c.a.o();
        int i7 = 0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        char[] cArr3 = f4602b;
        if (cArr3 != null) {
            int i12 = $11 + 39;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i13 = 0;
            while (i13 < length) {
                int i14 = $10 + 39;
                $11 = i14 % 128;
                if (i14 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i13])};
                        Object objC = com.c.a.e.e.c(-1916745907);
                        if (objC == null) {
                            byte b2 = (byte) i7;
                            byte b3 = b2;
                            objC = com.c.a.e.e.e((char) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.rgb(i7, i7, i7) + 16777243, 960 - MotionEvent.axisFromString(""), -1923431116, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr2[i13] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i13])};
                    Object objC2 = com.c.a.e.e.c(-1916745907);
                    if (objC2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objC2 = com.c.a.e.e.e((char) Color.alpha(0), View.MeasureSpec.getSize(0) + 27, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 960, -1923431116, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr2[i13] = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
                    i13++;
                }
                i3 = 2;
                i7 = 0;
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i9];
        System.arraycopy(cArr3, i8, cArr4, 0, i9);
        if (bArr != null) {
            int i15 = $11 + 55;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr5 = new char[i9];
            oVar.f2783d = 0;
            char c2 = 0;
            while (oVar.f2783d < i9) {
                if (bArr[oVar.f2783d] == 1) {
                    int i17 = oVar.f2783d;
                    Object[] objArr4 = {Integer.valueOf(cArr4[oVar.f2783d]), Integer.valueOf(c2)};
                    Object objC3 = com.c.a.e.e.c(83881166);
                    if (objC3 == null) {
                        objC3 = com.c.a.e.e.e((char) (60278 - AndroidCharacter.getMirror('0')), 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 34 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 73789111, false, "j", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i17] = ((Character) ((Method) objC3).invoke(null, objArr4)).charValue();
                } else {
                    int i18 = oVar.f2783d;
                    Object[] objArr5 = {Integer.valueOf(cArr4[oVar.f2783d]), Integer.valueOf(c2)};
                    Object objC4 = com.c.a.e.e.c(1697816169);
                    if (objC4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objC4 = com.c.a.e.e.e((char) (60521 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 20 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 922, 1705548816, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i18] = ((Character) ((Method) objC4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr5[oVar.f2783d];
                Object[] objArr6 = {oVar, oVar};
                Object objC5 = com.c.a.e.e.c(-2143286564);
                if (objC5 == null) {
                    objC5 = com.c.a.e.e.e((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 48809), 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 101, -2133194587, false, "h", new Class[]{Object.class, Object.class});
                }
                ((Method) objC5).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i11 > 0) {
            char[] cArr6 = new char[i9];
            System.arraycopy(cArr4, 0, cArr6, 0, i9);
            int i19 = i9 - i11;
            System.arraycopy(cArr6, 0, cArr4, i19, i11);
            System.arraycopy(cArr6, i11, cArr4, 0, i19);
        }
        if (!(!z2)) {
            int i20 = $11 + 7;
            $10 = i20 % 128;
            if (i20 % 2 != 0) {
                cArr = new char[i9];
                i2 = 0;
            } else {
                i2 = 0;
                cArr = new char[i9];
            }
            while (true) {
                oVar.f2783d = i2;
                if (oVar.f2783d >= i9) {
                    break;
                }
                cArr[oVar.f2783d] = cArr4[(i9 - oVar.f2783d) - 1];
                i2 = oVar.f2783d + 1;
            }
            cArr4 = cArr;
        }
        if (i10 > 0) {
            int i21 = $11 + 75;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 0;
            while (true) {
                oVar.f2783d = i23;
                if (oVar.f2783d >= i9) {
                    break;
                }
                cArr4[oVar.f2783d] = (char) (cArr4[oVar.f2783d] - iArr[2]);
                i23 = oVar.f2783d + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void c() {
        f4603c = -307572283374110196L;
        f4602b = new char[]{30928, 31055, 31102, 31088, 31099, 31088, 31102, 31041, 31041, 31089, 31080, 31091, 31089, 31091, 31041, 31053, 31092, 30833, 30722, 30769, 30771, 30782, 30771, 30769, 30724, 30724, 30772, 30763, 30774, 30772, 30774, 30724, 30720, 30775, 30740, 30751, 30774, 30761, 30738, 30747, 30770, 30762, 30761, 30769, 30746, 30748, 30771, 30751, 30817, 30724, 30772, 30763, 30774, 30772, 30774, 30720, 30721, 30774, 30770, 30783, 30768, 30738, 30847, 30816, 30726, 30768, 30779, 30770, 30772, 30746, 30745, 30781, 30782, 30780, 30783, 30749, 30740, 30764, 30762, 30763, 30737, 30748, 30771, 30774, 30774, 30768, 30769, 30769, 30769, 30761, 30770, 30770, 30774, 30772, 30774, 30742, 30847, 30817, 30727, 30770, 30772, 30760, 30772, 30771, 30770, 30747, 30817, 30725, 30774, 30775, 30727, 30739, 30751, 30829, 30748, 30771, 30771, 30774, 30774, 30781, 30782, 30770, 30761, 30773, 30770, 30774, 30772, 30774, 30742, 30826, 30772, 30763, 30774, 30772, 30774, 30720, 30721, 30774, 30770, 30783, 30768, 30738, 30847, 30816, 30726, 30768, 30779, 30770, 30772, 30746, 30745, 30781, 30782, 30780, 30783, 30749, 30740, 30764, 30762, 30763, 30737, 30748, 30771, 30774, 30774, 30768, 30769, 30769, 30769, 30761, 30770, 30770, 30774, 30772, 30774, 30742, 30847, 30817, 30727, 30770, 30772, 30760, 30772, 30771, 30770, 30747, 30817, 30725, 30774, 30775, 30727, 30739, 30751, 30829, 30748, 30771, 30771, 30774, 30774, 30781, 30782, 30770, 30761, 30773, 30770, 30774, 30772, 30774, 30742, 30744, 30722, 30769, 30771, 30782, 30771, 30769, 30732, 30735, 30770, 30783, 30769, 30761, 30726, 30750, 30826, 30751, 30774, 30761, 30738, 30747, 30770, 30762, 30761, 30769, 30746, 30748, 30771, 30751, 30817, 30818, 30761, 30769, 30769, 30773, 30774, 30760, 30773, 30775, 30762, 30721, 30733, 30769, 30771, 30782, 30771, 30769, 30722, 30792, 30837, 30743, 30734, 30725, 30771, 30772, 30764, 30752, 30742, 30840, 30840, 30840, 30840, 30840, 30840, 30840, 30840, 30840, 30840, 30840, 30797, 30748, 30926, 30944, 30858, 30856, 30856, 30952, 30952, 30858, 30870, 30860, 30859, 30860, 30954, 30965, 30863, 30863, 30849, 30956, 30963, 30869, 30857, 30861, 30871, 30867, 30962, 30954, 30849, 30863, 30861, 30863, 30851, 30864, 30875, 30861, 30859, 30867, 30859, 30851, 30955, 30918, 30952, 30956, 30864, 30848, 30863, 30878, 31099, 31049, 31103, 30856, 30883, 30892, 31067, 31043, 31099, 31041, 31066, 30854, 31055, 31046, 31041, 31055, 31055, 31047, 31044, 30856, 31053, 31045, 31049, 31046, 30856, 31046, 31053, 31053, 31098, 31051, 31099, 30856, 31096, 31041, 31043, 31067, 30856, 30854, 31052, 31053, 31090, 31041, 31044, 31049, 31041, 31100, 31041, 31046, 31041, 30856, 31100, 31047, 31046, 30856, 30826, 30770, 30770, 30780, 30746, 30829, 30751, 30739, 30727, 30775, 30774, 30725, 30744, 30737, 30768, 30783, 30777, 30782, 30770, 30781, 30771, 30771, 30744, 30738, 30761, 30774, 30751, 30737, 30774, 30748, 30740, 30774, 30768, 30769, 30780, 30769, 30825, 30758, 30913, 30917, 30969, 30915, 30927, 30766, 30765, 30919, 30919, 30927, 30767, 30759, 30971, 30968, 30916, 30968, 30961, 30758, 30770, 30756, 30936, 30924, 30972, 30971, 30922, 30833, 30725, 30774, 30775, 30727, 30739, 30751, 30829, 30739, 30772, 30770, 30737, 30751, 30774, 30761, 30738, 30748, 30771, 30771, 30774, 30774, 30781, 30782, 30770, 30761, 30775, 30780, 30737, 30847, 30817, 30727, 30770, 30772, 30736, 30738, 30762, 30774, 30773, 30768, 30778, 30782, 30771, 30770, 30747, 30746, 30773, 30773, 30769, 30761, 30763, 30728};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f4605e = 0;
        f4606j = 1;
        f4601a = 0;
        f4604d = 1;
        c();
        $stable = 8;
        int i2 = f4606j + 1;
        f4605e = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
    }
}
