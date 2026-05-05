package com.incode.welcome_sdk;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.n;
import com.incode.welcome_sdk.modules.BaseModule;
import com.incode.welcome_sdk.modules.CombinedConsent;
import com.incode.welcome_sdk.modules.DocumentScan;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.ProcessId;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksActivity;
import com.incode.welcome_sdk.ui.tutorial.DaggerIDTypeChooserComponent;
import com.incode.welcome_sdk.ui.tutorial.TutorialPresenterModule;
import com.incode.welcome_sdk.ui.user_consent.UserConsentActivity;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.msgpack.core.MessagePack;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static final b f4426a;

    /* JADX INFO: renamed from: k */
    private static final Lazy<c> f4427k;

    /* JADX INFO: renamed from: l */
    private static int f4428l = 0;

    /* JADX INFO: renamed from: m */
    private static int f4429m = 0;

    /* JADX INFO: renamed from: o */
    private static int[] f4430o = null;

    /* JADX INFO: renamed from: q */
    private static int f4431q = 0;

    /* JADX INFO: renamed from: t */
    private static int f4432t = 0;

    /* JADX INFO: renamed from: i */
    private long f4440i;

    /* JADX INFO: renamed from: n */
    private volatile int f4442n;

    /* JADX INFO: renamed from: b */
    private final CompositeDisposable f4433b = new CompositeDisposable();

    /* JADX INFO: renamed from: e */
    private final com.incode.welcome_sdk.data.local.a.d.e.c f4436e = IncodeWelcome.Companion.getInstance().getDelayedOnboardingRepositoryComponent().b();

    /* JADX INFO: renamed from: d */
    private final com.incode.welcome_sdk.data.local.a.e f4435d = IncodeWelcome.Companion.getInstance().getDelayedOnboardingRepositoryComponent().a();

    /* JADX INFO: renamed from: c */
    private final com.incode.welcome_sdk.data.local.a.d.c.e f4434c = IncodeWelcome.Companion.getInstance().getDelayedOnboardingRepositoryComponent().d();

    /* JADX INFO: renamed from: f */
    private final com.incode.welcome_sdk.data.local.a.d.b.c f4437f = IncodeWelcome.Companion.getInstance().getDelayedOnboardingRepositoryComponent().c();

    /* JADX INFO: renamed from: h */
    private final com.incode.welcome_sdk.data.local.a.d.f.c f4439h = IncodeWelcome.Companion.getInstance().getDelayedOnboardingRepositoryComponent().e();

    /* JADX INFO: renamed from: j */
    private final com.incode.welcome_sdk.data.local.a.d.a.a f4441j = IncodeWelcome.Companion.getInstance().getDelayedOnboardingRepositoryComponent().i();

    /* JADX INFO: renamed from: g */
    private final com.incode.welcome_sdk.data.local.a.d.d.d f4438g = IncodeWelcome.Companion.getInstance().getDelayedOnboardingRepositoryComponent().h();

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, short r10, byte r11) {
        /*
            int r0 = r9 * 2
            int r9 = r0 + 4
            int r8 = r10 + 98
            byte[] r7 = com.incode.welcome_sdk.c.$$a
            int r0 = r11 * 4
            int r6 = 1 - r0
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L28
            r3 = r4
            r1 = r9
        L13:
            int r9 = r9 + 1
            int r8 = r8 + r1
            r2 = r3
        L17:
            r1 = r8
            byte r0 = (byte) r1
            int r3 = r2 + 1
            r5[r2] = r0
            if (r3 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            r8 = r7[r9]
            goto L13
        L28:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.c.$$c(int, short, byte):java.lang.String");
    }

    public static /* synthetic */ Object d(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        com.incode.welcome_sdk.data.local.a.d.e.c cVar;
        long j2;
        int i8;
        int i9 = ~i5;
        int i10 = ~i6;
        int i11 = (~(i9 | i10 | i4)) | (~(i5 | i6 | i4));
        int i12 = ~i4;
        int i13 = (~(i10 | i5)) | (~(i10 | i12));
        int i14 = (~(i4 | i6)) | (~(i9 | i12));
        int i15 = i5 + i6 + i3 + ((-564018846) * i2) + (483938512 * i7);
        int i16 = i15 * i15;
        int i17 = (1473915126 * i5) + 752877568 + ((-1516524009) * i6) + (996813045 * i11) + (1993626090 * i13) + ((-996813045) * i14) + (477102080 * i3) + (1390411776 * i2) + (452984832 * i7) + ((-1135738880) * i16);
        int i18 = ((i5 * 1456092922) - 824780772) + (i6 * 1456095553) + (i11 * (-877)) + (i13 * (-1754)) + (i14 * 877) + (i3 * 1456093799) + (i2 * 578355822) + (i7 * 1098359728) + (i16 * 1868693504);
        switch (i17 + (i18 * i18 * 2110914560)) {
            case 1:
                return c(objArr);
            case 2:
                return e(objArr);
            case 3:
                return d(objArr);
            case 4:
                c cVar2 = (c) objArr[0];
                int i19 = 2 % 2;
                int i20 = f4428l + 21;
                f4429m = i20 % 128;
                int i21 = i20 % 2;
                com.incode.welcome_sdk.data.local.a.d.b.c cVar3 = cVar2.f4437f;
                long j3 = cVar2.f4440i;
                int i22 = cVar2.f4442n;
                cVar2.f4442n = i22 + 1;
                Completable completable = (Completable) com.incode.welcome_sdk.data.local.a.d.b.c.b(IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), new Object[]{cVar3, Long.valueOf(j3), Integer.valueOf(i22)}, 1711722001, -1711722001, IncodeWelcome.cm.d());
                int i23 = f4428l + 23;
                f4429m = i23 % 128;
                int i24 = i23 % 2;
                return completable;
            case 5:
                return b(objArr);
            case 6:
                final c cVar4 = (c) objArr[0];
                final Bitmap bitmap = (Bitmap) objArr[1];
                Map map = (Map) objArr[2];
                int i25 = 2 % 2;
                Intrinsics.checkNotNullParameter(bitmap, "");
                Single singleFromCallable = Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda14
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return c.d(bitmap, cVar4);
                    }
                });
                final j jVar = cVar4.new j(map);
                Completable completableFlatMapCompletable = singleFromCallable.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda15
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return c.g(jVar, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
                int i26 = f4429m + 71;
                f4428l = i26 % 128;
                int i27 = i26 % 2;
                return completableFlatMapCompletable;
            case 7:
                c cVar5 = (c) objArr[0];
                String str = (String) objArr[1];
                String str2 = (String) objArr[2];
                boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                ValidationPhase validationPhase = (ValidationPhase) objArr[4];
                int i28 = 2 % 2;
                int i29 = f4428l + 75;
                f4429m = i29 % 128;
                int i30 = i29 % 2;
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(validationPhase, "");
                CompositeDisposable compositeDisposable = cVar5.f4433b;
                Completable completableObserveOn = cVar5.f4434c.b(cVar5.f4440i, str, str2, zBooleanValue, validationPhase).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
                Action action = new Action() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda16
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        c.r();
                    }
                };
                final h hVar = h.f4476e;
                compositeDisposable.add(completableObserveOn.subscribe(action, new Consumer() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda17
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        c.j(hVar, obj);
                    }
                }));
                int i31 = f4429m + 29;
                f4428l = i31 % 128;
                int i32 = i31 % 2;
                return null;
            case 8:
                return a(objArr);
            case 9:
                c cVar6 = (c) objArr[0];
                int i33 = 2 % 2;
                int i34 = f4429m + 123;
                f4428l = i34 % 128;
                if (i34 % 2 == 0) {
                    cVar = cVar6.f4436e;
                    j2 = cVar6.f4440i;
                    i8 = cVar6.f4442n;
                    cVar6.f4442n = i8;
                } else {
                    cVar = cVar6.f4436e;
                    j2 = cVar6.f4440i;
                    i8 = cVar6.f4442n;
                    cVar6.f4442n = i8 + 1;
                }
                Completable completableC = cVar.c(j2, i8);
                int i35 = f4429m + 39;
                f4428l = i35 % 128;
                int i36 = i35 % 2;
                return completableC;
            default:
                c cVar7 = (c) objArr[0];
                int i37 = 2 % 2;
                int i38 = f4428l + 15;
                f4429m = i38 % 128;
                int i39 = i38 % 2;
                CompositeDisposable compositeDisposable2 = cVar7.f4433b;
                Completable completableObserveOn2 = cVar7.f4441j.c(cVar7.f4440i).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
                Action action2 = new Action() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda0
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        c.t();
                    }
                };
                final d dVar = d.f4459e;
                compositeDisposable2.add(completableObserveOn2.subscribe(action2, new Consumer() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda11
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        c.c(dVar, obj);
                    }
                }));
                int i40 = f4428l + 109;
                f4429m = i40 % 128;
                int i41 = i40 % 2;
                return null;
        }
    }

    static void init$0() {
        $$a = new byte[]{110, MessagePack.Code.UINT8, MessagePack.Code.NEVER_USED, 68};
        $$b = 139;
    }

    public static final /* synthetic */ com.incode.welcome_sdk.data.local.a.d.f.c a(c cVar) {
        int i2 = 2 % 2;
        int i3 = f4429m;
        int i4 = i3 + 53;
        f4428l = i4 % 128;
        int i5 = i4 % 2;
        com.incode.welcome_sdk.data.local.a.d.f.c cVar2 = cVar.f4439h;
        int i6 = i3 + 85;
        f4428l = i6 % 128;
        int i7 = i6 % 2;
        return cVar2;
    }

    public static final /* synthetic */ Completable a(c cVar, IdScan idScan) {
        int i2 = 2 % 2;
        int i3 = f4428l + 37;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = cVar.c(idScan);
        int i5 = f4429m + 97;
        f4428l = i5 % 128;
        int i6 = i5 % 2;
        return completableC;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        c cVar = (c) objArr[0];
        FlowConfig flowConfig = (FlowConfig) objArr[1];
        int i2 = 2 % 2;
        int i3 = f4429m + 75;
        f4428l = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        cVar.e(flowConfig);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = f4428l + 71;
        f4429m = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ Completable b(c cVar) {
        int i2 = 2 % 2;
        int i3 = f4428l + 55;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        int iB = DaggerIDTypeChooserComponent.d.b();
        int iB2 = DaggerIDTypeChooserComponent.d.b();
        Completable completable = (Completable) d(DaggerIDTypeChooserComponent.d.b(), iB2, new Object[]{cVar}, iB, 1693987541, -1693987532, DaggerIDTypeChooserComponent.d.b());
        int i5 = f4429m + 7;
        f4428l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return completable;
    }

    public static final /* synthetic */ Completable c(c cVar) {
        int i2 = 2 % 2;
        int i3 = f4428l + 109;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cVar};
        int iB = DaggerIDTypeChooserComponent.d.b();
        int iB2 = DaggerIDTypeChooserComponent.d.b();
        int iB3 = DaggerIDTypeChooserComponent.d.b();
        int iB4 = DaggerIDTypeChooserComponent.d.b();
        if (i4 != 0) {
            throw null;
        }
        Completable completable = (Completable) d(iB3, iB2, objArr, iB, -1942771342, 1942771346, iB4);
        int i5 = f4428l + 43;
        f4429m = i5 % 128;
        if (i5 % 2 == 0) {
            return completable;
        }
        throw null;
    }

    public static final /* synthetic */ Completable d(c cVar) {
        int i2 = 2 % 2;
        int i3 = f4428l + 117;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Completable completableO = cVar.o();
        int i5 = f4429m + 9;
        f4428l = i5 % 128;
        if (i5 % 2 != 0) {
            return completableO;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f4428l + 61;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Completable completableL = cVar.l();
        int i5 = f4429m + 73;
        f4428l = i5 % 128;
        if (i5 % 2 != 0) {
            return completableL;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long e(c cVar) {
        int i2 = 2 % 2;
        int i3 = f4428l + 3;
        f4429m = i3 % 128;
        if (i3 % 2 == 0) {
            return cVar.f4440i;
        }
        int i4 = 83 / 0;
        return cVar.f4440i;
    }

    public static final /* synthetic */ void e(c cVar, long j2) {
        int i2 = 2 % 2;
        int i3 = f4429m;
        int i4 = i3 + 35;
        f4428l = i4 % 128;
        int i5 = i4 % 2;
        cVar.f4440i = j2;
        int i6 = i3 + 23;
        f4428l = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ Completable g(c cVar) {
        int i2 = 2 % 2;
        int i3 = f4428l + 89;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cVar};
        int iB = DaggerIDTypeChooserComponent.d.b();
        int iB2 = DaggerIDTypeChooserComponent.d.b();
        int iB3 = DaggerIDTypeChooserComponent.d.b();
        int iB4 = DaggerIDTypeChooserComponent.d.b();
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Completable completable = (Completable) d(iB3, iB2, objArr, iB, -2125465458, 2125465463, iB4);
        int i5 = f4428l + 5;
        f4429m = i5 % 128;
        int i6 = i5 % 2;
        return completable;
    }

    public static final /* synthetic */ Lazy h() {
        int i2 = 2 % 2;
        int i3 = f4429m + 63;
        int i4 = i3 % 128;
        f4428l = i4;
        int i5 = i3 % 2;
        Lazy<c> lazy = f4427k;
        int i6 = i4 + 37;
        f4429m = i6 % 128;
        int i7 = i6 % 2;
        return lazy;
    }

    public static final class b {

        /* JADX INFO: renamed from: c */
        private static int f4448c = 0;

        /* JADX INFO: renamed from: d */
        private static int f4449d = 1;

        private b() {
        }

        public static c d() {
            int i2 = 2 % 2;
            int i3 = f4449d + 93;
            f4448c = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) c.h().getValue();
            if (i4 != 0) {
                int i5 = 9 / 0;
            }
            return cVar;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.c$c */
    static final class C0208c extends Lambda implements Function0<c> {

        /* JADX INFO: renamed from: a */
        private static int f4450a = 0;

        /* JADX INFO: renamed from: b */
        private static int f4451b = 1;

        /* JADX INFO: renamed from: c */
        private static int f4452c = 1;

        /* JADX INFO: renamed from: d */
        private static int f4453d = 0;

        /* JADX INFO: renamed from: e */
        public static final C0208c f4454e = new C0208c();

        private static c e() {
            int i2 = 2 % 2;
            c cVar = new c();
            int i3 = f4452c + 97;
            f4450a = i3 % 128;
            if (i3 % 2 == 0) {
                return cVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ c invoke() {
            int i2 = 2 % 2;
            int i3 = f4450a + 33;
            f4452c = i3 % 128;
            int i4 = i3 % 2;
            c cVarE = e();
            int i5 = f4452c + 55;
            f4450a = i5 % 128;
            int i6 = i5 % 2;
            return cVarE;
        }

        static {
            int i2 = f4453d + 45;
            f4451b = i2 % 128;
            int i3 = i2 % 2;
        }

        C0208c() {
            super(0);
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f4432t = 0;
        f4431q = 1;
        f4429m = 0;
        f4428l = 1;
        i();
        f4426a = new b((byte) 0);
        f4427k = LazyKt.lazy(C0208c.f4454e);
        int i2 = f4432t + 29;
        f4431q = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class i extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f4477a = 1;

        /* JADX INFO: renamed from: c */
        private static int f4478c = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ FlowConfig f4479d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f4477a + 15;
            f4478c = i3 % 128;
            int i4 = i3 % 2;
            c(l2);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        private void c(Long l2) {
            int i2 = 2 % 2;
            int i3 = f4477a + 95;
            f4478c = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest.d("Successfully inserted delayed onboarding into database.", new Object[1]);
            } else {
                Timber.Forest.d("Successfully inserted delayed onboarding into database.", new Object[0]);
            }
            c cVar = c.this;
            Intrinsics.checkNotNull(l2);
            c.e(cVar, l2.longValue());
            c.a(c.this, this.f4479d);
            int i4 = f4478c + 49;
            f4477a = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(FlowConfig flowConfig) {
            super(1);
            this.f4479d = flowConfig;
        }
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4428l + 109;
        f4429m = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f4429m + 109;
        f4428l = i4 % 128;
        int i5 = i4 % 2;
    }

    /* synthetic */ class f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f4465b = 1;

        /* JADX INFO: renamed from: c */
        private static int f4466c = 0;

        private void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4465b + 105;
            f4466c = i3 % 128;
            int i4 = i3 % 2;
            ((Timber.Forest) this.receiver).e(th);
            int i5 = f4465b + 5;
            f4466c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 55 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4465b + 71;
            f4466c = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f4466c + 55;
            f4465b = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        f(Object obj) {
            super(1, obj, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }
    }

    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4429m + 77;
        f4428l = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f4429m + 53;
        f4428l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
    }

    public final void c(SessionConfig sessionConfig, FlowConfig flowConfig) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionConfig, "");
        Intrinsics.checkNotNullParameter(flowConfig, "");
        CompositeDisposable compositeDisposable = this.f4433b;
        Single<Long> singleObserveOn = this.f4435d.c(flowConfig, sessionConfig).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final i iVar = new i(flowConfig);
        Consumer<? super Long> consumer = new Consumer() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.b(iVar, obj);
            }
        };
        final f fVar = new f(Timber.Forest);
        compositeDisposable.add(singleObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.e(fVar, obj);
            }
        }));
        int i3 = f4429m + 49;
        f4428l = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f4443a = 1;

        /* JADX INFO: renamed from: b */
        private static int f4444b = 1;

        /* JADX INFO: renamed from: c */
        private static int f4445c = 0;

        /* JADX INFO: renamed from: d */
        private static int f4446d = 0;

        /* JADX INFO: renamed from: e */
        public static final a f4447e = new a();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4444b + 121;
            f4445c = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4445c + 21;
            f4444b = i3 % 128;
            if (i3 % 2 == 0) {
                Timber.Forest.e(th, "An error occurred while completing Combined Consent module.", new Object[1]);
            } else {
                Timber.Forest.e(th, "An error occurred while completing Combined Consent module.", new Object[0]);
            }
        }

        static {
            int i2 = f4446d + 99;
            f4443a = i2 % 128;
            int i3 = i2 % 2;
        }

        a() {
            super(1);
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f4428l + 27;
        f4429m = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f4428l + 101;
        f4429m = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return null;
    }

    public static final void n() {
        int i2 = 2 % 2;
        int i3 = f4429m + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f4428l = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.d("Combined successfully completed.", new Object[0]);
        int i5 = f4428l + 87;
        f4429m = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
        int i2 = 2 % 2;
        int i3 = f4429m + 113;
        f4428l = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(cVar, "");
        CompositeDisposable compositeDisposable = this.f4433b;
        Completable completableObserveOn = this.f4438g.b(this.f4440i, cVar).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Action action = new Action() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda12
            @Override // io.reactivex.functions.Action
            public final void run() {
                c.n();
            }
        };
        final a aVar = a.f4447e;
        compositeDisposable.add(completableObserveOn.subscribe(action, new Consumer() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda13
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.d(aVar, obj);
            }
        }));
        int i5 = f4429m + 7;
        f4428l = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static final class g extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f4467a = 1;

        /* JADX INFO: renamed from: b */
        private static int f4468b = 0;

        /* JADX INFO: renamed from: c */
        public static final g f4469c = new g();

        /* JADX INFO: renamed from: d */
        private static int f4470d = 0;

        /* JADX INFO: renamed from: e */
        private static int f4471e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4471e + 17;
            f4468b = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4468b + 69;
            f4471e = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th, "An error occurred while completing ProcessId module.", new Object[0]);
            int i5 = f4471e + 111;
            f4468b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 73 / 0;
            }
        }

        static {
            int i2 = f4470d + 35;
            f4467a = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 32 / 0;
            }
        }

        g() {
            super(1);
        }
    }

    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4429m + 125;
        f4428l = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f4429m + 103;
        f4428l = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void q() {
        int i2 = 2 % 2;
        int i3 = f4429m + 31;
        f4428l = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.Forest.d("ProcessId successfully completed.", new Object[1]);
        } else {
            Timber.Forest.d("ProcessId successfully completed.", new Object[0]);
        }
        int i4 = f4428l + 55;
        f4429m = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void b() {
        int i2 = 2 % 2;
        int i3 = f4428l + 125;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        CompositeDisposable compositeDisposable = this.f4433b;
        Completable completableObserveOn = this.f4437f.c(this.f4440i).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Action action = new Action() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Action
            public final void run() {
                c.q();
            }
        };
        final g gVar = g.f4469c;
        compositeDisposable.add(completableObserveOn.subscribe(action, new Consumer() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.a(gVar, obj);
            }
        }));
        int i5 = f4429m + 99;
        f4428l = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class d extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f4455a = 1;

        /* JADX INFO: renamed from: b */
        private static int f4456b = 0;

        /* JADX INFO: renamed from: c */
        private static int f4457c = 1;

        /* JADX INFO: renamed from: d */
        private static int f4458d = 0;

        /* JADX INFO: renamed from: e */
        public static final d f4459e = new d();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4456b + 125;
            f4457c = i3 % 128;
            int i4 = i3 % 2;
            b(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f4457c + 105;
            f4456b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 24 / 0;
            }
            return unit;
        }

        private static void b(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4456b + 117;
            f4457c = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th, "An error occurred while completing FaceMatch module.", new Object[0]);
            int i5 = f4456b + 67;
            f4457c = i5 % 128;
            int i6 = i5 % 2;
        }

        static {
            int i2 = f4458d + 25;
            f4455a = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(1);
        }
    }

    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4428l + 15;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f4429m + 9;
        f4428l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
    }

    public static final void t() {
        int i2 = 2 % 2;
        int i3 = f4428l + 3;
        f4429m = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.Forest.d("FaceMatch successfully completed.", new Object[1]);
        } else {
            Timber.Forest.d("FaceMatch successfully completed.", new Object[0]);
        }
    }

    static final class h extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f4472a = 0;

        /* JADX INFO: renamed from: b */
        private static int f4473b = 1;

        /* JADX INFO: renamed from: c */
        private static int f4474c = 0;

        /* JADX INFO: renamed from: d */
        private static int f4475d = 1;

        /* JADX INFO: renamed from: e */
        public static final h f4476e = new h();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4473b + 95;
            f4474c = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f4473b + 19;
            f4474c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4473b + 5;
            f4474c = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest.e(th, "An error occurred while completing ID Scan module.", new Object[0]);
            } else {
                Timber.Forest.e(th, "An error occurred while completing ID Scan module.", new Object[0]);
            }
            int i4 = f4474c + 25;
            f4473b = i4 % 128;
            int i5 = i4 % 2;
        }

        static {
            int i2 = f4472a + 3;
            f4475d = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        h() {
            super(1);
        }
    }

    public static final void j(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4428l + 81;
        f4429m = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
    }

    public static final void r() {
        int i2 = 2 % 2;
        int i3 = f4428l + 13;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.d("ID Scan successfully completed.", new Object[0]);
        int i5 = f4429m + 21;
        f4428l = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f4460a = 0;

        /* JADX INFO: renamed from: b */
        private static int f4461b = 1;

        /* JADX INFO: renamed from: c */
        private static int f4462c = 0;

        /* JADX INFO: renamed from: d */
        public static final e f4463d = new e();

        /* JADX INFO: renamed from: e */
        private static int f4464e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4462c + 83;
            f4461b = i3 % 128;
            int i4 = i3 % 2;
            a(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f4462c + 107;
            f4461b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void a(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4462c + 99;
            f4461b = i3 % 128;
            if (i3 % 2 == 0) {
                Timber.Forest.e(th, "An error occurred while updating Document Scan module.", new Object[1]);
            } else {
                Timber.Forest.e(th, "An error occurred while updating Document Scan module.", new Object[0]);
            }
            int i4 = f4461b + 59;
            f4462c = i4 % 128;
            int i5 = i4 % 2;
        }

        static {
            int i2 = f4464e + 99;
            f4460a = i2 % 128;
            int i3 = i2 % 2;
        }

        e() {
            super(1);
        }
    }

    public static final void f(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4428l + 47;
        f4429m = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
    }

    public static final void p() {
        int i2 = 2 % 2;
        int i3 = f4428l + 115;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.d("Document Scan successfully completed.", new Object[0]);
        int i5 = f4429m + 97;
        f4428l = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void e(File file, DocumentType documentType, String str) {
        int i2 = 2 % 2;
        int i3 = f4428l + 53;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(documentType, "");
        Intrinsics.checkNotNullParameter(str, "");
        CompositeDisposable compositeDisposable = this.f4433b;
        Completable completableSubscribeOn = this.f4436e.b(this.f4440i, file, documentType, str).subscribeOn(Schedulers.io());
        Action action = new Action() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Action
            public final void run() {
                c.p();
            }
        };
        final e eVar = e.f4463d;
        compositeDisposable.add(completableSubscribeOn.subscribe(action, new Consumer() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.f(eVar, obj);
            }
        }));
        int i5 = f4429m + 33;
        f4428l = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final File d(Bitmap bitmap, c cVar) throws Throwable {
        File fileA;
        int i2;
        int i3 = 2 % 2;
        int i4 = f4429m + 41;
        f4428l = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            Intrinsics.checkNotNullParameter(cVar, "");
            com.incode.welcome_sdk.data.local.a.e eVar = cVar.f4435d;
            Object[] objArr = new Object[1];
            v(new int[]{-1861374067, -462714913, 1237066645, -994582419, -16389037, -96049431, 541010269, 119378144, 1398304321, 324299413}, KeyEvent.normalizeMetaState(0) + 55, objArr);
            fileA = eVar.a(((String) objArr[0]).intern());
            i2 = 93;
        } else {
            Intrinsics.checkNotNullParameter(bitmap, "");
            Intrinsics.checkNotNullParameter(cVar, "");
            com.incode.welcome_sdk.data.local.a.e eVar2 = cVar.f4435d;
            Object[] objArr2 = new Object[1];
            v(new int[]{-1861374067, -462714913, 1237066645, -994582419, -16389037, -96049431, 541010269, 119378144, 1398304321, 324299413}, 17 - KeyEvent.normalizeMetaState(0), objArr2);
            fileA = eVar2.a(((String) objArr2[0]).intern());
            i2 = 100;
        }
        File fileSaveBitmapToFile = BitmapUtils.saveBitmapToFile(bitmap, fileA, i2);
        int i5 = f4429m + 111;
        f4428l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return fileSaveBitmapToFile;
    }

    static final class j extends Lambda implements Function1<File, CompletableSource> {

        /* JADX INFO: renamed from: c */
        private static int f4481c = 0;

        /* JADX INFO: renamed from: d */
        private static int f4482d = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Map<String, Float> f4484e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(File file) {
            int i2 = 2 % 2;
            int i3 = f4481c + 103;
            f4482d = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceD = d(file);
            if (i4 == 0) {
                int i5 = 45 / 0;
            }
            return completableSourceD;
        }

        private CompletableSource d(File file) {
            int i2 = 2 % 2;
            int i3 = f4482d + 37;
            f4481c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(file, "");
            com.incode.welcome_sdk.data.local.a.d.f.c cVarA = c.a(c.this);
            long jE = c.e(c.this);
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "");
            Completable completableB = cVarA.b(jE, absolutePath, this.f4484e);
            int i5 = f4481c + 27;
            f4482d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 38 / 0;
            }
            return completableB;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Map<String, Float> map) {
            super(1);
            this.f4484e = map;
        }
    }

    public static final CompletableSource g(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4428l + 27;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f4428l + 95;
        f4429m = i5 % 128;
        int i6 = i5 % 2;
        return completableSource;
    }

    private static void v(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        com.c.a.e eVar = new com.c.a.e();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f4430o;
        int i4 = 1605946101;
        float f2 = 0.0f;
        int i5 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objC = com.c.a.e.e.c(i4);
                    if (objC == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i7 = 19 - (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1));
                        int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)) + IptcDirectory.TAG_ACTION_ADVISED;
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 + 1);
                        objC = com.c.a.e.e.e(scrollDefaultDelay, i7, i8, 1596115084, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objC).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 1605946101;
                    f2 = 0.0f;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f4430o;
        if (iArr6 != null) {
            int i9 = $11 + 121;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i10])};
                Object objC2 = com.c.a.e.e.c(1605946101);
                if (objC2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objC2 = com.c.a.e.e.e((char) (Process.myTid() >> 22), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, Drawable.resolveOpacity(0, 0) + IptcDirectory.TAG_ACTION_ADVISED, 1596115084, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                }
                iArr2[i10] = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        eVar.f2735a = 0;
        while (eVar.f2735a < iArr.length) {
            int i11 = $10 + 105;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[eVar.f2735a] >> 16);
            cArr[1] = (char) iArr[eVar.f2735a];
            cArr[2] = (char) (iArr[eVar.f2735a + 1] >> 16);
            cArr[3] = (char) iArr[eVar.f2735a + 1];
            eVar.f2736c = (cArr[0] << 16) + cArr[1];
            eVar.f2737d = (cArr[2] << 16) + cArr[3];
            com.c.a.e.b(iArr5);
            int i13 = $11 + 59;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 0;
            while (i15 < 16) {
                eVar.f2736c ^= iArr5[i15];
                Object[] objArr4 = {eVar, Integer.valueOf(com.c.a.e.c(eVar.f2736c)), eVar, eVar};
                Object objC3 = com.c.a.e.e.c(-190252621);
                if (objC3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objC3 = com.c.a.e.e.e((char) Color.green(0), 19 - TextUtils.getTrimmedLength(""), TextUtils.getCapsMode("", 0, 0) + 167, -197985334, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objC3).invoke(null, objArr4)).intValue();
                eVar.f2736c = eVar.f2737d;
                eVar.f2737d = iIntValue;
                i15++;
                int i16 = $10 + 93;
                $11 = i16 % 128;
                int i17 = i16 % 2;
            }
            int i18 = eVar.f2736c;
            eVar.f2736c = eVar.f2737d;
            eVar.f2737d = i18;
            eVar.f2737d ^= iArr5[16];
            eVar.f2736c ^= iArr5[17];
            int i19 = eVar.f2736c;
            int i20 = eVar.f2737d;
            cArr[0] = (char) (eVar.f2736c >>> 16);
            cArr[1] = (char) eVar.f2736c;
            cArr[2] = (char) (eVar.f2737d >>> 16);
            cArr[3] = (char) eVar.f2737d;
            com.c.a.e.b(iArr5);
            cArr2[eVar.f2735a * 2] = cArr[0];
            cArr2[(eVar.f2735a * 2) + 1] = cArr[1];
            cArr2[(eVar.f2735a * 2) + 2] = cArr[2];
            cArr2[(eVar.f2735a * 2) + 3] = cArr[3];
            Object[] objArr5 = {eVar, eVar};
            Object objC4 = com.c.a.e.e.c(-1176571471);
            if (objC4 == null) {
                objC4 = com.c.a.e.e.e((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 42779), Color.argb(0, 0, 0, 0) + 16, (ViewConfiguration.getWindowTouchSlop() >> 8) + 134, -1186663480, false, "a", new Class[]{Object.class, Object.class});
            }
            ((Method) objC4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static final class m extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f4493a = 1;

        /* JADX INFO: renamed from: b */
        private static int f4494b = 0;

        /* JADX INFO: renamed from: c */
        private static int f4495c = 0;

        /* JADX INFO: renamed from: d */
        public static final m f4496d = new m();

        /* JADX INFO: renamed from: e */
        private static int f4497e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4495c + 31;
            f4497e = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f4495c + 57;
            f4497e = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4497e + 69;
            f4495c = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest.e(th, "An error occurred while setting ID Type.", new Object[1]);
            } else {
                Timber.Forest.e(th, "An error occurred while setting ID Type.", new Object[0]);
            }
        }

        static {
            int i2 = f4493a + 97;
            f4494b = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        m() {
            super(1);
        }
    }

    public static final void i(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4428l + 73;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f4429m + 39;
        f4428l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
    }

    public static final void s() {
        int i2 = 2 % 2;
        int i3 = f4428l + 29;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.d("ID Type successfully updated.", new Object[0]);
        int i5 = f4429m + 49;
        f4428l = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void e(IdScan.IdType idType) {
        int i2 = 2 % 2;
        int i3 = f4428l + 45;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(idType, "");
        CompositeDisposable compositeDisposable = this.f4433b;
        Completable completableObserveOn = this.f4434c.a(this.f4440i, idType).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Action action = new Action() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Action
            public final void run() {
                c.s();
            }
        };
        final m mVar = m.f4496d;
        compositeDisposable.add(completableObserveOn.subscribe(action, new Consumer() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.i(mVar, obj);
            }
        }));
        int i5 = f4429m + 3;
        f4428l = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static final class o extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f4498a = 1;

        /* JADX INFO: renamed from: b */
        public static final o f4499b = new o();

        /* JADX INFO: renamed from: c */
        private static int f4500c = 0;

        /* JADX INFO: renamed from: d */
        private static int f4501d = 1;

        /* JADX INFO: renamed from: e */
        private static int f4502e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4501d + 41;
            f4500c = i3 % 128;
            int i4 = i3 % 2;
            b(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f4500c + 87;
            f4501d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static void b(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4501d + 45;
            f4500c = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest.e(th, "An error occurred while completing delayed onboarding.", new Object[1]);
            } else {
                Timber.Forest.e(th, "An error occurred while completing delayed onboarding.", new Object[0]);
            }
            int i4 = f4500c + 41;
            f4501d = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        static {
            int i2 = f4502e + 59;
            f4498a = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        o() {
            super(1);
        }
    }

    public static final void i(c cVar) {
        int i2 = 2 % 2;
        int i3 = f4428l + 101;
        f4429m = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cVar, "");
            cVar.f4433b.clear();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(cVar, "");
        cVar.f4433b.clear();
        int i4 = f4429m + 81;
        f4428l = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void h(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4429m + 77;
        f4428l = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f4428l + 111;
        f4429m = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void w() {
        int i2 = 2 % 2;
        int i3 = f4429m + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f4428l = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.Forest.d("Delayed onboarding successfully completed.", new Object[1]);
        } else {
            Timber.Forest.d("Delayed onboarding successfully completed.", new Object[0]);
        }
    }

    public final void a() {
        int i2 = 2 % 2;
        int i3 = f4429m + 5;
        f4428l = i3 % 128;
        int i4 = i3 % 2;
        CompositeDisposable compositeDisposable = this.f4433b;
        Completable completableDoFinally = this.f4435d.e(this.f4440i).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doFinally(new Action() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda18
            @Override // io.reactivex.functions.Action
            public final void run() {
                c.i(this.f$0);
            }
        });
        Action action = new Action() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda19
            @Override // io.reactivex.functions.Action
            public final void run() {
                c.w();
            }
        };
        final o oVar = o.f4499b;
        compositeDisposable.add(completableDoFinally.subscribe(action, new Consumer() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda20
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.h(oVar, obj);
            }
        }));
        c();
        int i5 = f4428l + 35;
        f4429m = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void c() {
        int i2 = 2 % 2;
        int i3 = f4429m + 27;
        f4428l = i3 % 128;
        int i4 = i3 % 2;
        this.f4442n = 0;
        int i5 = f4429m + 29;
        f4428l = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        c cVar = (c) objArr[0];
        String str = (String) objArr[1];
        n nVar = (n) objArr[2];
        int i2 = 2 % 2;
        int i3 = f4428l + 75;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nVar, "");
        cVar.f4435d.e(str, nVar).subscribeOn(Schedulers.io()).subscribe();
        int i5 = f4428l + 105;
        f4429m = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return null;
    }

    public final Completable e() {
        int i2 = 2 % 2;
        int i3 = f4428l + 111;
        f4429m = i3 % 128;
        if (i3 % 2 != 0) {
            this.f4435d.d();
            throw null;
        }
        Completable completableD = this.f4435d.d();
        int i4 = f4429m + 13;
        f4428l = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return completableD;
    }

    static final class l extends Lambda implements Function1<BaseModule, CompletableSource> {

        /* JADX INFO: renamed from: a */
        private static int f4490a = 0;

        /* JADX INFO: renamed from: c */
        private static int f4491c = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(BaseModule baseModule) {
            int i2 = 2 % 2;
            int i3 = f4491c + 65;
            f4490a = i3 % 128;
            BaseModule baseModule2 = baseModule;
            if (i3 % 2 == 0) {
                return d(baseModule2);
            }
            d(baseModule2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private CompletableSource d(BaseModule baseModule) {
            int i2 = 2 % 2;
            int i3 = f4491c + 31;
            f4490a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(baseModule, "");
            if (baseModule instanceof IdScan) {
                return c.a(c.this, (IdScan) baseModule);
            }
            if (baseModule instanceof ProcessId) {
                return c.c(c.this);
            }
            if (baseModule instanceof DocumentScan) {
                int i5 = f4491c + 35;
                f4490a = i5 % 128;
                int i6 = i5 % 2;
                return c.b(c.this);
            }
            if (baseModule instanceof SelfieScan) {
                int i7 = f4490a + 93;
                f4491c = i7 % 128;
                int i8 = i7 % 2;
                Completable completableD = c.d(c.this);
                int i9 = f4491c + 41;
                f4490a = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 15 / 0;
                }
                return completableD;
            }
            if (baseModule instanceof FaceMatch) {
                Completable completableF = c.f(c.this);
                int i11 = f4490a + 13;
                f4491c = i11 % 128;
                int i12 = i11 % 2;
                return completableF;
            }
            if (!(baseModule instanceof CombinedConsent)) {
                return Completable.complete();
            }
            int i13 = f4490a + 105;
            f4491c = i13 % 128;
            if (i13 % 2 == 0) {
                c.g(c.this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Completable completableG = c.g(c.this);
            int i14 = f4491c + 71;
            f4490a = i14 % 128;
            int i15 = i14 % 2;
            return completableG;
        }

        l() {
            super(1);
        }
    }

    public static final CompletableSource l(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4429m + 123;
        f4428l = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f4429m + 125;
        f4428l = i5 % 128;
        int i6 = i5 % 2;
        return completableSource;
    }

    static final class k extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        public static final k f4485a = new k();

        /* JADX INFO: renamed from: b */
        private static int f4486b = 1;

        /* JADX INFO: renamed from: c */
        private static int f4487c = 0;

        /* JADX INFO: renamed from: d */
        private static int f4488d = 1;

        /* JADX INFO: renamed from: e */
        private static int f4489e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4487c + 29;
            f4488d = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4488d + 27;
            f4487c = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th, "An error occurred while initializing delayed onboarding modules.", new Object[0]);
            int i5 = f4488d + 1;
            f4487c = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        static {
            int i2 = f4489e + 77;
            f4486b = i2 % 128;
            int i3 = i2 % 2;
        }

        k() {
            super(1);
        }
    }

    public static final void k(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4428l + 1;
        f4429m = i3 % 128;
        if (i3 % 2 == 0) {
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

    public static final void u() {
        int i2 = 2 % 2;
        int i3 = f4428l + 109;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.d("Modules successfully initialized", new Object[0]);
        int i5 = f4429m + 51;
        f4428l = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final void e(FlowConfig flowConfig) {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f4433b;
        Observable observableFromIterable = Observable.fromIterable(flowConfig.getAllModules());
        final l lVar = new l();
        Completable completableObserveOn = observableFromIterable.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda21
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.l(lVar, obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Action action = new Action() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Action
            public final void run() {
                c.u();
            }
        };
        final k kVar = k.f4485a;
        compositeDisposable.add(completableObserveOn.subscribe(action, new Consumer() { // from class: com.incode.welcome_sdk.c$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.k(kVar, obj);
            }
        }));
        int i3 = f4429m + 81;
        f4428l = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Completable l() {
        int i2 = 2 % 2;
        int i3 = f4429m + 33;
        f4428l = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.a.a aVar = this.f4441j;
        long j2 = this.f4440i;
        int i5 = this.f4442n;
        this.f4442n = i5 + 1;
        Object[] objArr = {aVar, Long.valueOf(j2), Integer.valueOf(i5)};
        Completable completable = (Completable) com.incode.welcome_sdk.data.local.a.d.a.a.a(VideoSelfieChecksActivity.Companion.c(), objArr, VideoSelfieChecksActivity.Companion.c(), 1468952298, VideoSelfieChecksActivity.Companion.c(), -1468952297, VideoSelfieChecksActivity.Companion.c());
        int i6 = f4429m + 25;
        f4428l = i6 % 128;
        if (i6 % 2 != 0) {
            return completable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Completable c(IdScan idScan) {
        int i2 = 2 % 2;
        int i3 = f4428l + 87;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.c.e eVar = this.f4434c;
        long j2 = this.f4440i;
        IdScan.ScanStep scanStep = idScan.getScanStep();
        int i5 = this.f4442n;
        this.f4442n = i5 + 1;
        Object[] objArr = {eVar, Long.valueOf(j2), scanStep, Integer.valueOf(i5)};
        Completable completable = (Completable) com.incode.welcome_sdk.data.local.a.d.c.e.a(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), objArr, -1363717002, 1363717003);
        int i6 = f4429m + 79;
        f4428l = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 11 / 0;
        }
        return completable;
    }

    private final Completable o() {
        int i2 = 2 % 2;
        int i3 = f4428l + 75;
        f4429m = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.f.c cVar = this.f4439h;
        long j2 = this.f4440i;
        int i5 = this.f4442n;
        this.f4442n = i5 + 1;
        Object[] objArr = {cVar, Long.valueOf(j2), Integer.valueOf(i5)};
        int iB = TutorialPresenterModule.b();
        Completable completable = (Completable) com.incode.welcome_sdk.data.local.a.d.f.c.d(534415830, -534415830, TutorialPresenterModule.b(), objArr, TutorialPresenterModule.b(), iB, TutorialPresenterModule.b());
        int i6 = f4429m + 123;
        f4428l = i6 % 128;
        if (i6 % 2 != 0) {
            return completable;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        com.incode.welcome_sdk.data.local.a.d.d.d dVar;
        long j2;
        int i2;
        c cVar = (c) objArr[0];
        int i3 = 2 % 2;
        int i4 = f4428l + 71;
        f4429m = i4 % 128;
        if (i4 % 2 != 0) {
            dVar = cVar.f4438g;
            j2 = cVar.f4440i;
            i2 = cVar.f4442n;
            cVar.f4442n = i2;
        } else {
            dVar = cVar.f4438g;
            j2 = cVar.f4440i;
            i2 = cVar.f4442n;
            cVar.f4442n = i2 + 1;
        }
        Completable completableA = dVar.a(j2, i2);
        int i5 = f4428l + 93;
        f4429m = i5 % 128;
        if (i5 % 2 == 0) {
            return completableA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Completable g() {
        int i2 = 2 % 2;
        int i3 = f4429m + 69;
        f4428l = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = this.f4435d.c();
        int i5 = f4429m + 59;
        f4428l = i5 % 128;
        int i6 = i5 % 2;
        return completableC;
    }

    static void i() {
        f4430o = new int[]{121974392, -1696533520, 290898605, -1026562695, -1347308406, 1598195749, -1830531634, -1624050316, -56043909, -1332447452, -925691792, -71300893, -1754338280, 723234302, -672335069, -2100149695, 1235254515, -568979415};
    }

    public static final /* synthetic */ Completable f(c cVar) {
        int iB = DaggerIDTypeChooserComponent.d.b();
        int iB2 = DaggerIDTypeChooserComponent.d.b();
        return (Completable) d(DaggerIDTypeChooserComponent.d.b(), iB2, new Object[]{cVar}, iB, 1065640321, -1065640318, DaggerIDTypeChooserComponent.d.b());
    }

    public static final /* synthetic */ void a(c cVar, FlowConfig flowConfig) {
        int iB = DaggerIDTypeChooserComponent.d.b();
        int iB2 = DaggerIDTypeChooserComponent.d.b();
        d(DaggerIDTypeChooserComponent.d.b(), iB2, new Object[]{cVar, flowConfig}, iB, -972798573, 972798581, DaggerIDTypeChooserComponent.d.b());
    }

    public static final c f() {
        int i2 = 2 % 2;
        int i3 = f4429m + 9;
        f4428l = i3 % 128;
        int i4 = i3 % 2;
        c cVarD = b.d();
        int i5 = f4429m + 79;
        f4428l = i5 % 128;
        int i6 = i5 % 2;
        return cVarD;
    }

    public static final void d(Function1 function1, Object obj) {
        int iB = DaggerIDTypeChooserComponent.d.b();
        int iB2 = DaggerIDTypeChooserComponent.d.b();
        d(DaggerIDTypeChooserComponent.d.b(), iB2, new Object[]{function1, obj}, iB, -1969081624, 1969081625, DaggerIDTypeChooserComponent.d.b());
    }

    private final Completable k() {
        int iB = DaggerIDTypeChooserComponent.d.b();
        int iB2 = DaggerIDTypeChooserComponent.d.b();
        return (Completable) d(DaggerIDTypeChooserComponent.d.b(), iB2, new Object[]{this}, iB, -2125465458, 2125465463, DaggerIDTypeChooserComponent.d.b());
    }

    private final Completable m() {
        int iB = DaggerIDTypeChooserComponent.d.b();
        int iB2 = DaggerIDTypeChooserComponent.d.b();
        return (Completable) d(DaggerIDTypeChooserComponent.d.b(), iB2, new Object[]{this}, iB, 1693987541, -1693987532, DaggerIDTypeChooserComponent.d.b());
    }

    private final Completable j() {
        int iB = DaggerIDTypeChooserComponent.d.b();
        int iB2 = DaggerIDTypeChooserComponent.d.b();
        return (Completable) d(DaggerIDTypeChooserComponent.d.b(), iB2, new Object[]{this}, iB, -1942771342, 1942771346, DaggerIDTypeChooserComponent.d.b());
    }

    public final void a(String str, n nVar) {
        int iB = DaggerIDTypeChooserComponent.d.b();
        int iB2 = DaggerIDTypeChooserComponent.d.b();
        d(DaggerIDTypeChooserComponent.d.b(), iB2, new Object[]{this, str, nVar}, iB, 61974809, -61974807, DaggerIDTypeChooserComponent.d.b());
    }

    public final Completable d(Bitmap bitmap, Map<String, Float> map) {
        int iB = DaggerIDTypeChooserComponent.d.b();
        int iB2 = DaggerIDTypeChooserComponent.d.b();
        return (Completable) d(DaggerIDTypeChooserComponent.d.b(), iB2, new Object[]{this, bitmap, map}, iB, -405674536, 405674542, DaggerIDTypeChooserComponent.d.b());
    }

    public final void d(String str, String str2, boolean z2, ValidationPhase validationPhase) {
        Object[] objArr = {this, str, str2, Boolean.valueOf(z2), validationPhase};
        int iB = DaggerIDTypeChooserComponent.d.b();
        d(DaggerIDTypeChooserComponent.d.b(), DaggerIDTypeChooserComponent.d.b(), objArr, iB, 174897518, -174897511, DaggerIDTypeChooserComponent.d.b());
    }

    public final void d() {
        int iB = DaggerIDTypeChooserComponent.d.b();
        int iB2 = DaggerIDTypeChooserComponent.d.b();
        d(DaggerIDTypeChooserComponent.d.b(), iB2, new Object[]{this}, iB, 307241499, -307241499, DaggerIDTypeChooserComponent.d.b());
    }
}
