package com.incode.welcome_sdk.data.local.a;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.c.a.k;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.incode.welcome_sdk.FlowConfig;
import com.incode.welcome_sdk.SessionConfig;
import com.incode.welcome_sdk.data.local.a.e;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import com.incode.welcome_sdk.data.local.db.c.a.ai;
import com.incode.welcome_sdk.data.local.db.c.a.q;
import com.incode.welcome_sdk.listeners.CommonBaseListener;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel;
import com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: b */
    private static int f7896b = 1;

    /* JADX INFO: renamed from: d */
    private static int f7897d = 0;

    /* JADX INFO: renamed from: a */
    private final Lazy f7898a;

    /* JADX INFO: renamed from: c */
    private final Application f7899c;

    /* JADX INFO: renamed from: e */
    private final DelayedOnboardingDatabase f7900e;

    public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i7;
        int i10 = (~i2) | i9;
        int i11 = i8 | (~i10);
        int i12 = i2 | i9;
        int i13 = ~(i10 | i5);
        int i14 = i7 + i5 + i4 + (1075552530 * i3) + ((-1519595880) * i6);
        int i15 = i14 * i14;
        int i16 = (((-1050772794) * i7) - 1639710720) + ((-2116975300) * i5) + (i11 * (-533101253)) + (533101253 * i12) + ((-533101253) * i13) + ((-1583874048) * i4) + ((-189792256) * i3) + (1111490560 * i6) + (1415839744 * i15);
        int i17 = (i7 * 251836610) + 257048825 + (i5 * 251838484) + (i11 * 937) + (i12 * (-937)) + (i13 * 937) + (i4 * 251837547) + (i3 * 1710852742) + (i6 * (-1855850104)) + (i15 * (-1244921856));
        switch (i16 + (i17 * i17 * (-1300496384))) {
            case 1:
                return b(objArr);
            case 2:
                Function2 function2 = (Function2) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                int i18 = 2 % 2;
                int i19 = f7897d + 83;
                f7896b = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNullParameter(function2, "");
                Intrinsics.checkNotNullParameter(obj, "");
                Intrinsics.checkNotNullParameter(obj2, "");
                Pair pair = (Pair) function2.invoke(obj, obj2);
                int i21 = f7896b + 75;
                f7897d = i21 % 128;
                int i22 = i21 % 2;
                return pair;
            case 3:
                return c(objArr);
            case 4:
                return d(objArr);
            case 5:
                return e(objArr);
            case 6:
                e eVar = (e) objArr[0];
                int i23 = 2 % 2;
                int i24 = f7896b + 45;
                f7897d = i24 % 128;
                int i25 = i24 % 2;
                File file = (File) eVar.f7898a.getValue();
                int i26 = f7896b + 97;
                f7897d = i26 % 128;
                int i27 = i26 % 2;
                return file;
            default:
                return a(objArr);
        }
    }

    @Inject
    public e(DelayedOnboardingDatabase delayedOnboardingDatabase, Application application) {
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        Intrinsics.checkNotNullParameter(application, "");
        this.f7900e = delayedOnboardingDatabase;
        this.f7899c = application;
        this.f7898a = LazyKt.lazy(new a());
    }

    public static final /* synthetic */ Completable a(e eVar, List list) {
        int i2 = 2 % 2;
        int i3 = f7897d + 67;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        int iE = CommonBaseListener.e();
        int iE2 = CommonBaseListener.e();
        Completable completable = (Completable) e(iE, CommonBaseListener.e(), new Object[]{eVar, list}, iE2, -459463658, CommonBaseListener.e(), 459463661);
        int i5 = f7896b + 59;
        f7897d = i5 % 128;
        int i6 = i5 % 2;
        return completable;
    }

    public static final /* synthetic */ Completable b(e eVar, List list) {
        int i2 = 2 % 2;
        int i3 = f7897d + 97;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = eVar.c((List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a>) list);
        int i5 = f7897d + 33;
        f7896b = i5 % 128;
        int i6 = i5 % 2;
        return completableC;
    }

    public static final /* synthetic */ Completable c(e eVar, List list) {
        int i2 = 2 % 2;
        int i3 = f7896b + 87;
        f7897d = i3 % 128;
        int i4 = i3 % 2;
        Completable completableE = eVar.e((List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d>) list);
        int i5 = f7897d + 33;
        f7896b = i5 % 128;
        if (i5 % 2 != 0) {
            return completableE;
        }
        throw null;
    }

    public static final /* synthetic */ DelayedOnboardingDatabase d(e eVar) {
        int i2 = 2 % 2;
        int i3 = f7896b;
        int i4 = i3 + 35;
        f7897d = i4 % 128;
        int i5 = i4 % 2;
        DelayedOnboardingDatabase delayedOnboardingDatabase = eVar.f7900e;
        if (i5 != 0) {
            int i6 = 11 / 0;
        }
        int i7 = i3 + 103;
        f7897d = i7 % 128;
        if (i7 % 2 == 0) {
            return delayedOnboardingDatabase;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Application e(e eVar) {
        int i2 = 2 % 2;
        int i3 = f7897d + 21;
        int i4 = i3 % 128;
        f7896b = i4;
        int i5 = i3 % 2;
        Application application = eVar.f7899c;
        int i6 = i4 + 19;
        f7897d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 66 / 0;
        }
        return application;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        String str = (String) objArr[0];
        int i2 = 2 % 2;
        int i3 = f7897d + 115;
        f7896b = i3 % 128;
        if (i3 % 2 != 0) {
            int iE = CommonBaseListener.e();
            int iE2 = CommonBaseListener.e();
            e(iE, CommonBaseListener.e(), new Object[]{str}, iE2, -418717070, CommonBaseListener.e(), 418717071);
            return null;
        }
        int iE3 = CommonBaseListener.e();
        int iE4 = CommonBaseListener.e();
        e(iE3, CommonBaseListener.e(), new Object[]{str}, iE4, -418717070, CommonBaseListener.e(), 418717071);
        throw null;
    }

    static final class a extends Lambda implements Function0<File> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static long f7901a = 0;

        /* JADX INFO: renamed from: d */
        private static int f7902d = 0;

        /* JADX INFO: renamed from: e */
        private static int f7903e = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0018). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r7, short r8, short r9) {
            /*
                int r2 = r9 * 4
                int r1 = 1 - r2
                int r0 = r7 * 4
                int r7 = 4 - r0
                byte[] r6 = com.incode.welcome_sdk.data.local.a.e.a.$$a
                int r0 = r8 * 2
                int r0 = 119 - r0
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r6 != 0) goto L2c
                r2 = r7
                r0 = r3
                r1 = r4
            L18:
                int r0 = -r0
                int r7 = r7 + r0
                int r2 = r2 + 1
            L1c:
                byte r0 = (byte) r7
                r5[r1] = r0
                if (r1 != r3) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L27:
                int r1 = r1 + 1
                r0 = r6[r2]
                goto L18
            L2c:
                r1 = r4
                r2 = r7
                r7 = r0
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.a.e.a.$$c(byte, short, short):java.lang.String");
        }

        static void init$0() {
            $$a = new byte[]{66, -107, -4, MessagePack.Code.MAP32};
            $$b = 173;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ File invoke() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f7903e + 61;
            f7902d = i3 % 128;
            if (i3 % 2 == 0) {
                e();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            File fileE = e();
            int i4 = f7903e + 101;
            f7902d = i4 % 128;
            int i5 = i4 % 2;
            return fileE;
        }

        private File e() throws Throwable {
            int i2 = 2 % 2;
            File filesDir = e.e(e.this).getFilesDir();
            Object[] objArr = new Object[1];
            c("㎒㵾嫿绣㏛\ue2ef\ue562\ue171䰊拠敁慿찆\ue2e8\ue570\ue173䰂拂散慰찍\ue2f0\ue563\ue16a䰗拻敲", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            File file = new File(filesDir, ((String) objArr[0]).intern());
            if (!file.exists()) {
                int i3 = f7903e + 27;
                f7902d = i3 % 128;
                int i4 = i3 % 2;
                file.mkdirs();
                if (i4 == 0) {
                    int i5 = 12 / 0;
                }
            }
            int i6 = f7902d + 121;
            f7903e = i6 % 128;
            int i7 = i6 % 2;
            return file;
        }

        private static void c(String str, int i2, Object[] objArr) throws Throwable {
            Object obj;
            String str2 = str;
            int i3 = 2 % 2;
            if (str2 != null) {
                char[] charArray = str2.toCharArray();
                int i4 = $11 + 107;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                obj = charArray;
            } else {
                obj = str2;
            }
            k kVar = new k();
            char[] cArrE = k.e(f7901a ^ (-3501477462694648052L), (char[]) obj, i2);
            kVar.f2772b = 4;
            while (kVar.f2772b < cArrE.length) {
                int i6 = $10 + 75;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                kVar.f2773d = kVar.f2772b - 4;
                int i8 = kVar.f2772b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrE[kVar.f2772b] ^ cArrE[kVar.f2772b % 4]), Long.valueOf(kVar.f2773d), Long.valueOf(f7901a)};
                    Object objC = com.c.a.e.e.c(1215460496);
                    if (objC == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e((char) (91 - ImageFormat.getBitsPerPixel(0)), Color.argb(0, 0, 0, 0) + 20, 1107 - TextUtils.getOffsetAfter("", 0), 1223194345, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrE[i8] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objC2 = com.c.a.e.e.c(-727400358);
                    if (objC2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objC2 = com.c.a.e.e.e((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 20 - View.resolveSizeAndState(0, 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1282, -734084573, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrE, 4, cArrE.length - 4);
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f7903e = 0;
            f7902d = 1;
            f7901a = -89272985065195277L;
        }

        a() {
            super(0);
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f7897d + 51;
        f7896b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(eVar, "");
            com.incode.welcome_sdk.commons.utils.l lVar = com.incode.welcome_sdk.commons.utils.l.f6529e;
            int iE = CommonBaseListener.e();
            int iE2 = CommonBaseListener.e();
            lVar.d((File) e(iE, CommonBaseListener.e(), new Object[]{eVar}, iE2, -282945830, CommonBaseListener.e(), 282945836));
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(eVar, "");
        com.incode.welcome_sdk.commons.utils.l lVar2 = com.incode.welcome_sdk.commons.utils.l.f6529e;
        int iE3 = CommonBaseListener.e();
        int iE4 = CommonBaseListener.e();
        lVar2.d((File) e(iE3, CommonBaseListener.e(), new Object[]{eVar}, iE4, -282945830, CommonBaseListener.e(), 282945836));
        Unit unit2 = Unit.INSTANCE;
        int i4 = f7897d + 31;
        f7896b = i4 % 128;
        if (i4 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private final Completable e() {
        int i2 = 2 % 2;
        int i3 = f7897d + 121;
        f7896b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(Completable.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda8
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return e.c(this.f$0);
                }
            }), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Completable completableFromCallable = Completable.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.c(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFromCallable, "");
        int i4 = f7897d + 61;
        f7896b = i4 % 128;
        int i5 = i4 % 2;
        return completableFromCallable;
    }

    public final File a(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        File file = new File(b(), str + Global.HYPHEN + System.currentTimeMillis());
        int i3 = f7897d + 121;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        return file;
    }

    public final void a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.f[] fVarArr) {
        int i2 = 2 % 2;
        int i3 = f7897d + 101;
        f7896b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fVarArr, "");
            this.f7900e.c().a((com.incode.welcome_sdk.data.local.model.delayed_onboarding.f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        } else {
            Intrinsics.checkNotNullParameter(fVarArr, "");
            this.f7900e.c().a((com.incode.welcome_sdk.data.local.model.delayed_onboarding.f[]) Arrays.copyOf(fVarArr, fVarArr.length));
            int i4 = 16 / 0;
        }
    }

    public final Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>> a() {
        int i2 = 2 % 2;
        int i3 = f7897d + 35;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>> singleB = this.f7900e.b().b();
        if (i4 == 0) {
            int i5 = 48 / 0;
        }
        return singleB;
    }

    public final Single<Long> c(FlowConfig flowConfig, SessionConfig sessionConfig) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(flowConfig, "");
        Intrinsics.checkNotNullParameter(sessionConfig, "");
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.c cVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.c(0L, flowConfig.getFlowTag());
        Single<Long> singleB = this.f7900e.a().b(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.n(0L, sessionConfig.getInterviewId(), sessionConfig.getConfigurationId(), sessionConfig.getValidationModuleList(), null, sessionConfig.getQueueName(), sessionConfig.getExternalId(), sessionConfig.getExternalCustomerId(), sessionConfig.getExternalToken(), ""));
        Single<Long> singleC = this.f7900e.e().c(cVar);
        final f fVar = f.f7924e;
        Single singleZip = Single.zip(singleB, singleC, new BiFunction() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return e.d(fVar, obj, obj2);
            }
        });
        final n nVar = n.f7948b;
        Single map = singleZip.map(new Function() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.e(nVar, obj);
            }
        });
        final l lVar = new l(this.f7900e.b());
        Single<Long> singleFlatMap = map.flatMap(new Function() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.a(lVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "");
        int i3 = f7897d + 69;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        return singleFlatMap;
    }

    /* synthetic */ class f extends FunctionReferenceImpl implements Function2<Long, Long, Pair<? extends Long, ? extends Long>> {

        /* JADX INFO: renamed from: a */
        private static int f7920a = 0;

        /* JADX INFO: renamed from: b */
        private static int f7921b = 1;

        /* JADX INFO: renamed from: c */
        private static int f7922c = 1;

        /* JADX INFO: renamed from: d */
        private static int f7923d = 0;

        /* JADX INFO: renamed from: e */
        public static final f f7924e = new f();

        private static Pair<Long, Long> b(long j2, long j3) {
            int i2 = 2 % 2;
            Pair<Long, Long> pair = new Pair<>(Long.valueOf(j2), Long.valueOf(j3));
            int i3 = f7923d + 63;
            f7921b = i3 % 128;
            if (i3 % 2 != 0) {
                return pair;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Pair<? extends Long, ? extends Long> invoke(Long l2, Long l3) {
            int i2 = 2 % 2;
            int i3 = f7921b + 37;
            f7923d = i3 % 128;
            Long l4 = l2;
            if (i3 % 2 == 0) {
                return b(l4.longValue(), l3.longValue());
            }
            b(l4.longValue(), l3.longValue());
            throw null;
        }

        static {
            int i2 = f7920a + 7;
            f7922c = i2 % 128;
            int i3 = i2 % 2;
        }

        f() {
            super(2, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }
    }

    static final class n extends Lambda implements Function1<Pair<? extends Long, ? extends Long>, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> {

        /* JADX INFO: renamed from: a */
        private static int f7947a = 0;

        /* JADX INFO: renamed from: b */
        public static final n f7948b = new n();

        /* JADX INFO: renamed from: c */
        private static int f7949c = 1;

        /* JADX INFO: renamed from: d */
        private static int f7950d = 1;

        /* JADX INFO: renamed from: e */
        private static int f7951e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.d invoke(Pair<? extends Long, ? extends Long> pair) {
            int i2 = 2 % 2;
            int i3 = f7951e + 21;
            f7950d = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVarB = b(pair);
            int i5 = f7951e + 111;
            f7950d = i5 % 128;
            if (i5 % 2 != 0) {
                return dVarB;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static com.incode.welcome_sdk.data.local.model.delayed_onboarding.d b(Pair<Long, Long> pair) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(pair, "");
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d(0L, pair.component1().longValue(), pair.component2().longValue(), false, false, null);
            int i3 = f7951e + 77;
            f7950d = i3 % 128;
            if (i3 % 2 != 0) {
                return dVar;
            }
            throw null;
        }

        static {
            int i2 = f7947a + 47;
            f7949c = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 21 / 0;
            }
        }

        n() {
            super(1);
        }
    }

    public static final com.incode.welcome_sdk.data.local.model.delayed_onboarding.d e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7897d + 25;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.d) function1.invoke(obj);
        int i5 = f7897d + 37;
        f7896b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return dVar;
    }

    /* synthetic */ class l extends FunctionReferenceImpl implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d, Single<Long>> {

        /* JADX INFO: renamed from: b */
        private static int f7945b = 1;

        /* JADX INFO: renamed from: c */
        private static int f7946c = 0;

        private Single<Long> a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
            int i2 = 2 % 2;
            int i3 = f7945b + 111;
            f7946c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(dVar, "");
            Single<Long> singleC = ((com.incode.welcome_sdk.data.local.db.c.a.d) this.receiver).c(dVar);
            int i5 = f7946c + 69;
            f7945b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 16 / 0;
            }
            return singleC;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Single<Long> invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
            int i2 = 2 % 2;
            int i3 = f7945b + 91;
            f7946c = i3 % 128;
            int i4 = i3 % 2;
            Single<Long> singleA = a(dVar);
            if (i4 != 0) {
                int i5 = 39 / 0;
            }
            return singleA;
        }

        l(Object obj) {
            super(1, obj, com.incode.welcome_sdk.data.local.db.c.a.d.class, "insert", "insert(Lcom/incode/welcome_sdk/data/local/model/delayed_onboarding/DelayedOnboardingEntity;)Lio/reactivex/Single;", 0);
        }
    }

    public static final SingleSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7897d + 93;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f7897d + 11;
        f7896b = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    public final Maybe<Pair<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c>> a(long j2, long j3) {
        int i2 = 2 % 2;
        int i3 = f7897d + 63;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e> maybeB = this.f7900e.e().b(j2);
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c> maybeB2 = this.f7900e.a().b(j3);
        final g gVar = g.f7927c;
        Maybe<Pair<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c>> maybeZip = Maybe.zip(maybeB, maybeB2, new BiFunction() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return e.e(gVar, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeZip, "");
        int i5 = f7897d + 87;
        f7896b = i5 % 128;
        if (i5 % 2 != 0) {
            return maybeZip;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* synthetic */ class g extends FunctionReferenceImpl implements Function2<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c, Pair<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, ? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c>> {

        /* JADX INFO: renamed from: a */
        private static int f7925a = 0;

        /* JADX INFO: renamed from: b */
        private static int f7926b = 0;

        /* JADX INFO: renamed from: c */
        public static final g f7927c = new g();

        /* JADX INFO: renamed from: d */
        private static int f7928d = 1;

        /* JADX INFO: renamed from: e */
        private static int f7929e = 1;

        private static Pair<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c> d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e eVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c cVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(eVar, "");
            Intrinsics.checkNotNullParameter(cVar, "");
            Pair<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c> pair = new Pair<>(eVar, cVar);
            int i3 = f7929e + 53;
            f7926b = i3 % 128;
            int i4 = i3 % 2;
            return pair;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Pair<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, ? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c> invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e eVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c cVar) {
            int i2 = 2 % 2;
            int i3 = f7926b + 115;
            f7929e = i3 % 128;
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e eVar2 = eVar;
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c cVar2 = cVar;
            if (i3 % 2 != 0) {
                return d(eVar2, cVar2);
            }
            d(eVar2, cVar2);
            throw null;
        }

        static {
            int i2 = f7925a + 37;
            f7928d = i2 % 128;
            int i3 = i2 % 2;
        }

        g() {
            super(2, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }
    }

    public static final Pair e(Function2 function2, Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = f7896b + 39;
        f7897d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Pair pair = (Pair) function2.invoke(obj, obj2);
        int i5 = f7897d + 111;
        f7896b = i5 % 128;
        if (i5 % 2 != 0) {
            return pair;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Maybe<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j>> d(long j2) {
        int i2 = 2 % 2;
        int i3 = f7897d + 39;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        Maybe<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j>> maybeB = this.f7900e.d().b(j2);
        if (i4 == 0) {
            int i5 = 34 / 0;
        }
        return maybeB;
    }

    static final class j extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d, CompletableSource> {

        /* JADX INFO: renamed from: a */
        private static int f7942a = 1;

        /* JADX INFO: renamed from: d */
        private static int f7943d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
            int i2 = 2 % 2;
            int i3 = f7943d + 89;
            f7942a = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceC = c(dVar);
            if (i4 == 0) {
                int i5 = 77 / 0;
            }
            return completableSourceC;
        }

        private CompletableSource c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
            int i2 = 2 % 2;
            int i3 = f7942a + 47;
            f7943d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(dVar, "");
            com.incode.welcome_sdk.data.local.db.c.a.d dVarB = e.d(e.this).b();
            dVar.d();
            Completable completableA = dVarB.a(dVar);
            int i5 = f7943d + 33;
            f7942a = i5 % 128;
            if (i5 % 2 != 0) {
                return completableA;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        j() {
            super(1);
        }
    }

    public final Completable e(long j2) {
        int i2 = 2 % 2;
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> maybeA = this.f7900e.b().a(j2);
        final j jVar = new j();
        Completable completableFlatMapCompletable = maybeA.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.b(jVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f7897d + 83;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        return completableFlatMapCompletable;
    }

    public static final CompletableSource b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7896b + 45;
        f7897d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7896b + 123;
        f7897d = i5 % 128;
        if (i5 % 2 == 0) {
            return completableSource;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final Completable c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
        int i2 = 2 % 2;
        int i3 = f7896b + 105;
        f7897d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dVar, "");
            com.incode.welcome_sdk.data.local.db.c.a.d dVarB = this.f7900e.b();
            dVar.g();
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.a(-2141955887, 2141955887, IdCaptureViewModel.ai.d(), new Object[]{dVar, "SUCCESS"}, IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d());
            return dVarB.a(dVar);
        }
        Intrinsics.checkNotNullParameter(dVar, "");
        com.incode.welcome_sdk.data.local.db.c.a.d dVarB2 = this.f7900e.b();
        dVar.g();
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.a(-2141955887, 2141955887, IdCaptureViewModel.ai.d(), new Object[]{dVar, "SUCCESS"}, IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d());
        dVarB2.a(dVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Completable e(String str, com.incode.welcome_sdk.data.local.model.delayed_onboarding.n nVar) {
        Completable completableD;
        int i2 = 2 % 2;
        int i3 = f7897d + 7;
        f7896b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(nVar, "");
            ai aiVarA = this.f7900e.a();
            nVar.d(str);
            completableD = aiVarA.d(nVar);
            int i4 = 35 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(nVar, "");
            ai aiVarA2 = this.f7900e.a();
            nVar.d(str);
            completableD = aiVarA2.d(nVar);
        }
        int i5 = f7896b + 11;
        f7897d = i5 % 128;
        int i6 = i5 % 2;
        return completableD;
    }

    public final Completable d() {
        int i2 = 2 % 2;
        int i3 = f7897d + 51;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        Completable completableConcatArray = Completable.concatArray(this.f7900e.b().a(), this.f7900e.a().c(), this.f7900e.e().a(), this.f7900e.d().b(), this.f7900e.f().d(), this.f7900e.j().d(), this.f7900e.h().d(), this.f7900e.i().d(), this.f7900e.l().d(), this.f7900e.m().d(), this.f7900e.n().a(), this.f7900e.o().e(), this.f7900e.r().e(), this.f7900e.t().b(), e());
        Intrinsics.checkNotNullExpressionValue(completableConcatArray, "");
        int i5 = f7896b + 53;
        f7897d = i5 % 128;
        if (i5 % 2 == 0) {
            return completableConcatArray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class c extends Lambda implements Function1<List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a>, CompletableSource> {

        /* JADX INFO: renamed from: b */
        private static int f7908b = 1;

        /* JADX INFO: renamed from: e */
        private static int f7909e = 0;

        private CompletableSource d(List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> list) {
            int i2 = 2 % 2;
            int i3 = f7909e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f7908b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            Completable completableB = e.b(e.this, list);
            int i5 = f7908b + 25;
            f7909e = i5 % 128;
            int i6 = i5 % 2;
            return completableB;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> list) {
            int i2 = 2 % 2;
            int i3 = f7908b + 69;
            f7909e = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceD = d(list);
            if (i4 != 0) {
                int i5 = 32 / 0;
            }
            return completableSourceD;
        }

        c() {
            super(1);
        }
    }

    public static final CompletableSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7897d + 101;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7897d + 3;
        f7896b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return completableSource;
    }

    static final class b extends Lambda implements Function1<List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c>, CompletableSource> {

        /* JADX INFO: renamed from: b */
        private static int f7905b = 1;

        /* JADX INFO: renamed from: e */
        private static int f7906e = 0;

        private CompletableSource d(List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> list) {
            int i2 = 2 % 2;
            int i3 = f7905b + 97;
            f7906e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(list, "");
                return e.a(e.this, list);
            }
            Intrinsics.checkNotNullParameter(list, "");
            int i4 = 87 / 0;
            return e.a(e.this, list);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> list) {
            int i2 = 2 % 2;
            int i3 = f7905b + 43;
            f7906e = i3 % 128;
            List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> list2 = list;
            if (i3 % 2 == 0) {
                return d(list2);
            }
            d(list2);
            throw null;
        }

        b() {
            super(1);
        }
    }

    public static final CompletableSource c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7897d + 1;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7896b + 13;
        f7897d = i5 % 128;
        int i6 = i5 % 2;
        return completableSource;
    }

    static final class d extends Lambda implements Function1<List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d>, CompletableSource> {

        /* JADX INFO: renamed from: d */
        private static int f7911d = 0;

        /* JADX INFO: renamed from: e */
        private static int f7912e = 1;

        private CompletableSource c(List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> list) {
            int i2 = 2 % 2;
            int i3 = f7912e + 13;
            f7911d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            Completable completableC = e.c(e.this, list);
            int i5 = f7912e + 63;
            f7911d = i5 % 128;
            int i6 = i5 % 2;
            return completableC;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> list) {
            int i2 = 2 % 2;
            int i3 = f7912e + 57;
            f7911d = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceC = c(list);
            int i5 = f7911d + 81;
            f7912e = i5 % 128;
            if (i5 % 2 != 0) {
                return completableSourceC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        d() {
            super(1);
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f7897d + 117;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7897d + 109;
        f7896b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return completableSource;
    }

    public final Completable c() {
        int i2 = 2 % 2;
        Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a>> singleE = this.f7900e.l().e();
        final c cVar = new c();
        Completable completableFlatMapCompletable = singleE.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.d(cVar, obj);
            }
        });
        Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c>> singleC = this.f7900e.f().c();
        final b bVar = new b();
        Completable completableAndThen = completableFlatMapCompletable.andThen(singleC.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.c(bVar, obj);
            }
        }));
        Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d>> singleC2 = this.f7900e.g().c();
        final d dVar = new d();
        Completable completableAndThen2 = completableAndThen.andThen(singleC2.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.f(dVar, obj);
            }
        }));
        Intrinsics.checkNotNull(completableAndThen2);
        int i3 = f7896b + 73;
        f7897d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 65 / 0;
        }
        return completableAndThen2;
    }

    static final class i extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c, CompletableSource> {

        /* JADX INFO: renamed from: a */
        private static int f7936a = 0;

        /* JADX INFO: renamed from: e */
        private static int f7937e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
            int i2 = 2 % 2;
            int i3 = f7936a + 95;
            f7937e = i3 % 128;
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar2 = cVar;
            if (i3 % 2 != 0) {
                return e(cVar2);
            }
            e(cVar2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar, e eVar) {
            int i2 = 2 % 2;
            int i3 = f7936a + 11;
            f7937e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(cVar, "");
            Intrinsics.checkNotNullParameter(eVar, "");
            Object[] objArr = {cVar.c()};
            e.e(CommonBaseListener.e(), CommonBaseListener.e(), objArr, CommonBaseListener.e(), -1618644872, CommonBaseListener.e(), 1618644877);
            Object[] objArr2 = {cVar.d()};
            e.e(CommonBaseListener.e(), CommonBaseListener.e(), objArr2, CommonBaseListener.e(), -1618644872, CommonBaseListener.e(), 1618644877);
            int i5 = f7937e + 15;
            f7936a = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.e$i$3 */
        static final class AnonymousClass3 extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c, CompletableSource> {

            /* JADX INFO: renamed from: d */
            private static int f7939d = 0;

            /* JADX INFO: renamed from: e */
            private static int f7940e = 1;

            private CompletableSource c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
                q qVarF;
                boolean z2;
                int i2;
                long j2;
                String str;
                String str2;
                String str3;
                boolean z3;
                int i3 = 2 % 2;
                int i4 = f7939d + 125;
                f7940e = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(cVar, "");
                    qVarF = e.d(eVar).f();
                    z2 = true;
                    i2 = 11453;
                    j2 = 0;
                    str = null;
                    str2 = null;
                    str3 = null;
                    z3 = true;
                } else {
                    Intrinsics.checkNotNullParameter(cVar, "");
                    qVarF = e.d(eVar).f();
                    z2 = false;
                    i2 = 505;
                    j2 = 0;
                    str = null;
                    str2 = null;
                    str3 = null;
                    z3 = false;
                }
                Completable completableE = qVarF.e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c.b(cVar, j2, str, str2, str3, z3, null, null, false, z2, i2));
                int i5 = f7940e + 121;
                f7939d = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 / 0;
                }
                return completableE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
                int i2 = 2 % 2;
                int i3 = f7940e + 13;
                f7939d = i3 % 128;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar2 = cVar;
                if (i3 % 2 != 0) {
                    c(cVar2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CompletableSource completableSourceC = c(cVar2);
                int i4 = f7939d + 85;
                f7940e = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 80 / 0;
                }
                return completableSourceC;
            }

            AnonymousClass3() {
                super(1);
            }
        }

        public static final CompletableSource b(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f7937e + 121;
            f7936a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
            int i5 = f7937e + 59;
            f7936a = i5 % 128;
            if (i5 % 2 == 0) {
                return completableSource;
            }
            throw null;
        }

        private CompletableSource e(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(cVar, "");
            final e eVar = e.this;
            Single singleFromCallable = Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.data.local.a.e$i$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return e.i.d(cVar, eVar);
                }
            });
            final AnonymousClass3 anonymousClass3 = new Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c, CompletableSource>() { // from class: com.incode.welcome_sdk.data.local.a.e.i.3

                /* JADX INFO: renamed from: d */
                private static int f7939d = 0;

                /* JADX INFO: renamed from: e */
                private static int f7940e = 1;

                private CompletableSource c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar2) {
                    q qVarF;
                    boolean z2;
                    int i22;
                    long j2;
                    String str;
                    String str2;
                    String str3;
                    boolean z3;
                    int i3 = 2 % 2;
                    int i4 = f7939d + 125;
                    f7940e = i4 % 128;
                    if (i4 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(cVar2, "");
                        qVarF = e.d(eVar).f();
                        z2 = true;
                        i22 = 11453;
                        j2 = 0;
                        str = null;
                        str2 = null;
                        str3 = null;
                        z3 = true;
                    } else {
                        Intrinsics.checkNotNullParameter(cVar2, "");
                        qVarF = e.d(eVar).f();
                        z2 = false;
                        i22 = 505;
                        j2 = 0;
                        str = null;
                        str2 = null;
                        str3 = null;
                        z3 = false;
                    }
                    Completable completableE = qVarF.e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c.b(cVar2, j2, str, str2, str3, z3, null, null, false, z2, i22));
                    int i5 = f7940e + 121;
                    f7939d = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 5 / 0;
                    }
                    return completableE;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar2) {
                    int i22 = 2 % 2;
                    int i3 = f7940e + 13;
                    f7939d = i3 % 128;
                    com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar22 = cVar2;
                    if (i3 % 2 != 0) {
                        c(cVar22);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CompletableSource completableSourceC = c(cVar22);
                    int i4 = f7939d + 85;
                    f7940e = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 80 / 0;
                    }
                    return completableSourceC;
                }

                AnonymousClass3() {
                    super(1);
                }
            };
            Completable completableFlatMapCompletable = singleFromCallable.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.e$i$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return e.i.b(anonymousClass3, obj);
                }
            });
            int i3 = f7937e + 21;
            f7936a = i3 % 128;
            int i4 = i3 % 2;
            return completableFlatMapCompletable;
        }

        i() {
            super(1);
        }
    }

    public static final CompletableSource g(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7896b + 43;
        f7897d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i4 = f7897d + 71;
        f7896b = i4 % 128;
        int i5 = i4 % 2;
        return completableSource;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        Observable observableFromIterable = Observable.fromIterable((List) objArr[1]);
        final i iVar = eVar.new i();
        Completable completableFlatMapCompletable = observableFromIterable.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.g(iVar, obj);
            }
        });
        int i3 = f7897d + 39;
        f7896b = i3 % 128;
        if (i3 % 2 != 0) {
            return completableFlatMapCompletable;
        }
        throw null;
    }

    static final class h extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a, CompletableSource> {

        /* JADX INFO: renamed from: b */
        private static int f7930b = 0;

        /* JADX INFO: renamed from: e */
        private static int f7931e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
            int i2 = 2 % 2;
            int i3 = f7931e + 17;
            f7930b = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceA = a(aVar);
            int i5 = f7930b + 37;
            f7931e = i5 % 128;
            int i6 = i5 % 2;
            return completableSourceA;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.e$h$1 */
        static final class AnonymousClass1 extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a, CompletableSource> {

            /* JADX INFO: renamed from: c */
            private static int f7933c = 1;

            /* JADX INFO: renamed from: d */
            private static int f7934d = 0;

            private CompletableSource d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
                int i2 = 2 % 2;
                int i3 = f7933c + 63;
                f7934d = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(aVar, "");
                Completable completableA = e.d(eVar).l().a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a.e(aVar, 0L, null, null, null, false, false, 61));
                int i5 = f7934d + 117;
                f7933c = i5 % 128;
                if (i5 % 2 != 0) {
                    return completableA;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
                int i2 = 2 % 2;
                int i3 = f7934d + 65;
                f7933c = i3 % 128;
                int i4 = i3 % 2;
                CompletableSource completableSourceD = d(aVar);
                int i5 = f7933c + 89;
                f7934d = i5 % 128;
                int i6 = i5 % 2;
                return completableSourceD;
            }

            AnonymousClass1() {
                super(1);
            }
        }

        public static final com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar, e eVar) {
            int i2 = 2 % 2;
            int i3 = f7930b + 51;
            f7931e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(aVar, "");
                Intrinsics.checkNotNullParameter(eVar, "");
                int iC = ValidatingTaxIdPresenter.a.c();
                int iC2 = ValidatingTaxIdPresenter.a.c();
                Object[] objArr = {(String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a.d(new Object[]{aVar}, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), iC, -1555909154, iC2, 1555909155)};
                e.e(CommonBaseListener.e(), CommonBaseListener.e(), objArr, CommonBaseListener.e(), -1618644872, CommonBaseListener.e(), 1618644877);
                throw null;
            }
            Intrinsics.checkNotNullParameter(aVar, "");
            Intrinsics.checkNotNullParameter(eVar, "");
            int iC3 = ValidatingTaxIdPresenter.a.c();
            int iC4 = ValidatingTaxIdPresenter.a.c();
            Object[] objArr2 = {(String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a.d(new Object[]{aVar}, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), iC3, -1555909154, iC4, 1555909155)};
            e.e(CommonBaseListener.e(), CommonBaseListener.e(), objArr2, CommonBaseListener.e(), -1618644872, CommonBaseListener.e(), 1618644877);
            int i4 = f7931e + 117;
            f7930b = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 94 / 0;
            }
            return aVar;
        }

        private CompletableSource a(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(aVar, "");
            final e eVar = e.this;
            Single singleFromCallable = Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.data.local.a.e$h$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return e.h.e(aVar, eVar);
                }
            });
            final AnonymousClass1 anonymousClass1 = new Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a, CompletableSource>() { // from class: com.incode.welcome_sdk.data.local.a.e.h.1

                /* JADX INFO: renamed from: c */
                private static int f7933c = 1;

                /* JADX INFO: renamed from: d */
                private static int f7934d = 0;

                private CompletableSource d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar2) {
                    int i22 = 2 % 2;
                    int i3 = f7933c + 63;
                    f7934d = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.checkNotNullParameter(aVar2, "");
                    Completable completableA = e.d(eVar).l().a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a.e(aVar2, 0L, null, null, null, false, false, 61));
                    int i5 = f7934d + 117;
                    f7933c = i5 % 128;
                    if (i5 % 2 != 0) {
                        return completableA;
                    }
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar2) {
                    int i22 = 2 % 2;
                    int i3 = f7934d + 65;
                    f7933c = i3 % 128;
                    int i4 = i3 % 2;
                    CompletableSource completableSourceD = d(aVar2);
                    int i5 = f7933c + 89;
                    f7934d = i5 % 128;
                    int i6 = i5 % 2;
                    return completableSourceD;
                }

                AnonymousClass1() {
                    super(1);
                }
            };
            Completable completableFlatMapCompletable = singleFromCallable.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.e$h$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return e.h.e(anonymousClass1, obj);
                }
            });
            int i3 = f7931e + 67;
            f7930b = i3 % 128;
            int i4 = i3 % 2;
            return completableFlatMapCompletable;
        }

        public static final CompletableSource e(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f7930b + 91;
            f7931e = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                return (CompletableSource) function1.invoke(obj);
            }
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            int i4 = 9 / 0;
            return (CompletableSource) function1.invoke(obj);
        }

        h() {
            super(1);
        }
    }

    public static final CompletableSource h(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7897d + 99;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7897d + 23;
        f7896b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return completableSource;
    }

    private final Completable c(List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> list) {
        int i2 = 2 % 2;
        Observable observableFromIterable = Observable.fromIterable(list);
        final h hVar = new h();
        Completable completableFlatMapCompletable = observableFromIterable.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.h(hVar, obj);
            }
        });
        int i3 = f7896b + 91;
        f7897d = i3 % 128;
        int i4 = i3 % 2;
        return completableFlatMapCompletable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.e$e */
    static final class C0228e extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d, CompletableSource> {

        /* JADX INFO: renamed from: a */
        private static int f7914a = 1;

        /* JADX INFO: renamed from: c */
        private static int f7915c = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
            int i2 = 2 % 2;
            int i3 = f7914a + 1;
            f7915c = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceC = c(dVar);
            int i5 = f7914a + 83;
            f7915c = i5 % 128;
            if (i5 % 2 == 0) {
                return completableSourceC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.e$e$4 */
        static final class AnonymousClass4 extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d, CompletableSource> {

            /* JADX INFO: renamed from: b */
            private static int f7917b = 1;

            /* JADX INFO: renamed from: d */
            private static int f7918d = 0;

            private CompletableSource e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
                com.incode.welcome_sdk.data.local.db.c.a.f fVarG;
                boolean z2;
                int i2;
                long j2;
                int i3 = 2 % 2;
                int i4 = f7918d + 37;
                f7917b = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(dVar, "");
                    fVarG = e.d(eVar).g();
                    z2 = false;
                    i2 = 26;
                    j2 = 1;
                } else {
                    Intrinsics.checkNotNullParameter(dVar, "");
                    fVarG = e.d(eVar).g();
                    z2 = false;
                    i2 = 61;
                    j2 = 0;
                }
                return fVarG.c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.d(dVar, j2, null, null, null, false, z2, i2));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
                int i2 = 2 % 2;
                int i3 = f7917b + 95;
                f7918d = i3 % 128;
                int i4 = i3 % 2;
                CompletableSource completableSourceE = e(dVar);
                int i5 = f7918d + 13;
                f7917b = i5 % 128;
                int i6 = i5 % 2;
                return completableSourceE;
            }

            AnonymousClass4() {
                super(1);
            }
        }

        public static final com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar, e eVar) {
            int i2 = 2 % 2;
            int i3 = f7915c + 115;
            f7914a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(dVar, "");
            Intrinsics.checkNotNullParameter(eVar, "");
            Object[] objArr = {dVar.b()};
            e.e(CommonBaseListener.e(), CommonBaseListener.e(), objArr, CommonBaseListener.e(), -1618644872, CommonBaseListener.e(), 1618644877);
            int i5 = f7915c + 1;
            f7914a = i5 % 128;
            int i6 = i5 % 2;
            return dVar;
        }

        private CompletableSource c(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(dVar, "");
            final e eVar = e.this;
            Single singleFromCallable = Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.data.local.a.e$e$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return e.C0228e.b(dVar, eVar);
                }
            });
            final AnonymousClass4 anonymousClass4 = new Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d, CompletableSource>() { // from class: com.incode.welcome_sdk.data.local.a.e.e.4

                /* JADX INFO: renamed from: b */
                private static int f7917b = 1;

                /* JADX INFO: renamed from: d */
                private static int f7918d = 0;

                private CompletableSource e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar2) {
                    com.incode.welcome_sdk.data.local.db.c.a.f fVarG;
                    boolean z2;
                    int i22;
                    long j2;
                    int i3 = 2 % 2;
                    int i4 = f7918d + 37;
                    f7917b = i4 % 128;
                    if (i4 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(dVar2, "");
                        fVarG = e.d(eVar).g();
                        z2 = false;
                        i22 = 26;
                        j2 = 1;
                    } else {
                        Intrinsics.checkNotNullParameter(dVar2, "");
                        fVarG = e.d(eVar).g();
                        z2 = false;
                        i22 = 61;
                        j2 = 0;
                    }
                    return fVarG.c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.d(dVar2, j2, null, null, null, false, z2, i22));
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar2) {
                    int i22 = 2 % 2;
                    int i3 = f7917b + 95;
                    f7918d = i3 % 128;
                    int i4 = i3 % 2;
                    CompletableSource completableSourceE = e(dVar2);
                    int i5 = f7918d + 13;
                    f7917b = i5 % 128;
                    int i6 = i5 % 2;
                    return completableSourceE;
                }

                AnonymousClass4() {
                    super(1);
                }
            };
            Completable completableFlatMapCompletable = singleFromCallable.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.e$e$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return e.C0228e.c(anonymousClass4, obj);
                }
            });
            int i3 = f7915c + 25;
            f7914a = i3 % 128;
            if (i3 % 2 != 0) {
                return completableFlatMapCompletable;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final CompletableSource c(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f7914a + 43;
            f7915c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
            int i5 = f7915c + 37;
            f7914a = i5 % 128;
            if (i5 % 2 != 0) {
                return completableSource;
            }
            throw null;
        }

        C0228e() {
            super(1);
        }
    }

    public static final CompletableSource j(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7897d + 121;
        f7896b = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i4 = f7896b + 63;
        f7897d = i4 % 128;
        if (i4 % 2 == 0) {
            return completableSource;
        }
        obj2.hashCode();
        throw null;
    }

    private final Completable e(List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> list) {
        int i2 = 2 % 2;
        Observable observableFromIterable = Observable.fromIterable(list);
        final C0228e c0228e = new C0228e();
        Completable completableFlatMapCompletable = observableFromIterable.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.e$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.j(c0228e, obj);
            }
        });
        int i3 = f7897d + 21;
        f7896b = i3 % 128;
        int i4 = i3 % 2;
        return completableFlatMapCompletable;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r6) {
        /*
            r5 = 0
            r4 = r6[r5]
            java.lang.String r4 = (java.lang.String) r4
            r3 = 2
            int r0 = r3 % r3
            r2 = r4
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L21
            int r0 = com.incode.welcome_sdk.data.local.a.e.f7896b
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.a.e.f7897d = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L31
            int r1 = r2.length()
            r0 = 85
            int r0 = r0 / r5
            if (r1 != 0) goto L38
        L21:
            int r0 = com.incode.welcome_sdk.data.local.a.e.f7897d
            int r2 = r0 + 39
            int r0 = r2 % 128
            com.incode.welcome_sdk.data.local.a.e.f7896b = r0
            int r2 = r2 % r3
            r1 = 0
            if (r2 != 0) goto L30
            r0 = 67
            int r0 = r0 / r5
        L30:
            return r1
        L31:
            int r0 = r2.length()
            if (r0 != 0) goto L38
            goto L21
        L38:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            r0.delete()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.a.e.b(java.lang.Object[]):java.lang.Object");
    }

    public static final /* synthetic */ void b(String str) {
        int iE = CommonBaseListener.e();
        int iE2 = CommonBaseListener.e();
        e(iE, CommonBaseListener.e(), new Object[]{str}, iE2, -1618644872, CommonBaseListener.e(), 1618644877);
    }

    public static final CompletableSource f(Function1 function1, Object obj) {
        int iE = CommonBaseListener.e();
        int iE2 = CommonBaseListener.e();
        return (CompletableSource) e(iE, CommonBaseListener.e(), new Object[]{function1, obj}, iE2, 832690495, CommonBaseListener.e(), -832690495);
    }

    public static final Pair d(Function2 function2, Object obj, Object obj2) {
        int iE = CommonBaseListener.e();
        int iE2 = CommonBaseListener.e();
        return (Pair) e(iE, CommonBaseListener.e(), new Object[]{function2, obj, obj2}, iE2, 1761950063, CommonBaseListener.e(), -1761950061);
    }

    public static final Unit c(e eVar) {
        int iE = CommonBaseListener.e();
        int iE2 = CommonBaseListener.e();
        return (Unit) e(iE, CommonBaseListener.e(), new Object[]{eVar}, iE2, -903380786, CommonBaseListener.e(), 903380790);
    }

    private static void e(String str) {
        int iE = CommonBaseListener.e();
        int iE2 = CommonBaseListener.e();
        e(iE, CommonBaseListener.e(), new Object[]{str}, iE2, -418717070, CommonBaseListener.e(), 418717071);
    }

    private final Completable b(List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> list) {
        int iE = CommonBaseListener.e();
        int iE2 = CommonBaseListener.e();
        return (Completable) e(iE, CommonBaseListener.e(), new Object[]{this, list}, iE2, -459463658, CommonBaseListener.e(), 459463661);
    }

    private final File b() {
        int iE = CommonBaseListener.e();
        int iE2 = CommonBaseListener.e();
        return (File) e(iE, CommonBaseListener.e(), new Object[]{this}, iE2, -282945830, CommonBaseListener.e(), 282945836);
    }
}
