package com.incode.welcome_sdk.data.local.a.d.c;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.c.a.n;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import com.incode.welcome_sdk.data.local.db.c.a.q;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.k;
import com.incode.welcome_sdk.data.remote.beans.bc;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter_Factory;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase;
import com.incode.welcome_sdk.ui.user_consent.UserConsentActivity;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f7763a = 0;

    /* JADX INFO: renamed from: d */
    private static int f7764d = 0;

    /* JADX INFO: renamed from: e */
    private static int f7765e = 0;

    /* JADX INFO: renamed from: c */
    private final DelayedOnboardingDatabase f7766c;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, byte r10, int r11) {
        /*
            int r8 = r10 + 69
            int r2 = r11 * 4
            int r1 = 1 - r2
            byte[] r7 = com.incode.welcome_sdk.data.local.a.d.c.e.$$a
            int r0 = r9 * 4
            int r6 = 4 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L2f
            r1 = r6
            r0 = r3
            r2 = r4
        L16:
            int r0 = -r0
            int r6 = r6 + r0
            int r0 = r1 + 1
            r1 = r2
            r8 = r6
            r6 = r0
        L1d:
            byte r0 = (byte) r8
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L2a:
            r0 = r7[r6]
            r1 = r6
            r6 = r8
            goto L16
        L2f:
            r1 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.a.d.c.e.$$c(byte, byte, int):java.lang.String");
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i6;
        int i9 = (~(i8 | i7)) | (~(i8 | i5)) | (~(i7 | i5));
        int i10 = (~(i6 | i5)) | i7;
        int i11 = (~(i5 | i6 | i7)) | (~(i8 | (~i7) | (~i5)));
        int i12 = i6 + i7 + i2 + (862446602 * i3) + (395103901 * i4);
        int i13 = i12 * i12;
        int i14 = (((-1892237052) * i6) - 438566912) + ((-683246085) * i7) + (i9 * 402996989) + ((-805993978) * i10) + (402996989 * i11) + ((-1489240064) * i2) + ((-128450560) * i3) + ((-674496512) * i4) + ((-1108934656) * i13);
        int i15 = (i6 * 1384179468) + 550727958 + (i7 * 1384180977) + (i9 * 503) + (i10 * (-1006)) + (i11 * 503) + (i2 * 1384179971) + (i3 * 1640285726) + (i4 * 120803543) + (i13 * 2025127936);
        int i16 = i14 + (i15 * i15 * (-275709952));
        if (i16 == 1) {
            return a(objArr);
        }
        if (i16 == 2) {
            return b(objArr);
        }
        if (i16 != 3) {
            Function1 function1 = (Function1) objArr[0];
            Object obj = objArr[1];
            int i17 = 2 % 2;
            int i18 = f7764d + 73;
            f7765e = i18 % 128;
            int i19 = i18 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
            int i20 = f7765e + 19;
            f7764d = i20 % 128;
            int i21 = i20 % 2;
            return maybeSource;
        }
        Function1 function12 = (Function1) objArr[0];
        Object obj2 = objArr[1];
        int i22 = 2 % 2;
        int i23 = f7765e + 61;
        f7764d = i23 % 128;
        int i24 = i23 % 2;
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        MaybeSource maybeSource2 = (MaybeSource) function12.invoke(obj2);
        int i25 = f7765e + 67;
        f7764d = i25 % 128;
        int i26 = i25 % 2;
        return maybeSource2;
    }

    static void init$0() {
        $$a = new byte[]{68, 66, 84, 89};
        $$b = 55;
    }

    @Inject
    public e(DelayedOnboardingDatabase delayedOnboardingDatabase) {
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        this.f7766c = delayedOnboardingDatabase;
    }

    public static final /* synthetic */ DelayedOnboardingDatabase a(e eVar) {
        int i2 = 2 % 2;
        int i3 = f7765e;
        int i4 = i3 + 117;
        f7764d = i4 % 128;
        int i5 = i4 % 2;
        DelayedOnboardingDatabase delayedOnboardingDatabase = eVar.f7766c;
        if (i5 == 0) {
            int i6 = 24 / 0;
        }
        int i7 = i3 + 93;
        f7764d = i7 % 128;
        int i8 = i7 % 2;
        return delayedOnboardingDatabase;
    }

    public static final /* synthetic */ Completable a(e eVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar) {
        int i2 = 2 % 2;
        int i3 = f7764d + 31;
        f7765e = i3 % 128;
        int i4 = i3 % 2;
        Completable completableE = eVar.e(jVar);
        int i5 = f7765e + 45;
        f7764d = i5 % 128;
        if (i5 % 2 != 0) {
            return completableE;
        }
        throw null;
    }

    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> d(long j2) {
        int i2 = 2 % 2;
        int i3 = f7764d + 117;
        f7765e = i3 % 128;
        int i4 = i3 % 2;
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> maybeB = this.f7766c.f().b(j2);
        int i5 = f7765e + 39;
        f7764d = i5 % 128;
        int i6 = i5 % 2;
        return maybeB;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.d.c.e$e */
    /* synthetic */ class C0224e extends FunctionReferenceImpl implements Function3<Long, String, Long, Triple<? extends Long, ? extends String, ? extends Long>> {

        /* JADX INFO: renamed from: a */
        private static int f7784a = 0;

        /* JADX INFO: renamed from: b */
        private static int f7785b = 1;

        /* JADX INFO: renamed from: c */
        private static int f7786c = 1;

        /* JADX INFO: renamed from: d */
        public static final C0224e f7787d = new C0224e();

        /* JADX INFO: renamed from: e */
        private static int f7788e = 0;

        private static Triple<Long, String, Long> b(long j2, String str, long j3) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Triple<Long, String, Long> triple = new Triple<>(Long.valueOf(j2), str, Long.valueOf(j3));
            int i3 = f7784a + 5;
            f7786c = i3 % 128;
            int i4 = i3 % 2;
            return triple;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Triple<? extends Long, ? extends String, ? extends Long> invoke(Long l2, String str, Long l3) {
            int i2 = 2 % 2;
            int i3 = f7786c + 21;
            f7784a = i3 % 128;
            Object obj = null;
            Long l4 = l2;
            if (i3 % 2 != 0) {
                b(l4.longValue(), str, l3.longValue());
                obj.hashCode();
                throw null;
            }
            Triple<Long, String, Long> tripleB = b(l4.longValue(), str, l3.longValue());
            int i4 = f7784a + 97;
            f7786c = i4 % 128;
            if (i4 % 2 != 0) {
                return tripleB;
            }
            throw null;
        }

        static {
            int i2 = f7785b + 13;
            f7788e = i2 % 128;
            int i3 = i2 % 2;
        }

        C0224e() {
            super(3, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }
    }

    public static final Triple e(Function3 function3, Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = f7765e + 39;
        f7764d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function3, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        Triple triple = (Triple) function3.invoke(obj, obj2, obj3);
        int i5 = f7764d + 67;
        f7765e = i5 % 128;
        int i6 = i5 % 2;
        return triple;
    }

    static final class b extends Lambda implements Function1<Triple<? extends Long, ? extends String, ? extends Long>, CompletableSource> {

        /* JADX INFO: renamed from: b */
        private static int f7774b = 1;

        /* JADX INFO: renamed from: c */
        private static int f7775c = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ int f7777d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Triple<? extends Long, ? extends String, ? extends Long> triple) {
            int i2 = 2 % 2;
            int i3 = f7774b + 35;
            f7775c = i3 % 128;
            Triple<? extends Long, ? extends String, ? extends Long> triple2 = triple;
            if (i3 % 2 == 0) {
                return a(triple2);
            }
            a(triple2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private CompletableSource a(Triple<Long, String, Long> triple) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(triple, "");
            long jLongValue = triple.component1().longValue();
            String strComponent2 = triple.component2();
            Completable completableA = e.a(e.this, new com.incode.welcome_sdk.data.local.model.delayed_onboarding.j(0L, triple.component3().longValue(), strComponent2, jLongValue, this.f7777d));
            int i3 = f7775c + 27;
            f7774b = i3 % 128;
            int i4 = i3 % 2;
            return completableA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(1);
            this.f7777d = i2;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f7765e + 7;
        f7764d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7764d + 41;
        f7765e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return completableSource;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        String strName;
        e eVar = (e) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        IdScan.ScanStep scanStep = (IdScan.ScanStep) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        q qVarF = eVar.f7766c.f();
        if (scanStep != null) {
            int i3 = f7765e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f7764d = i3 % 128;
            int i4 = i3 % 2;
            strName = scanStep.name();
            int i5 = f7764d + 43;
            f7765e = i5 % 128;
            int i6 = i5 % 2;
        } else {
            strName = null;
        }
        Single<Long> singleC = qVarF.c(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c(0L, null, null, null, false, strName, com.incode.welcome_sdk.data.remote.beans.f.AUTO, false, false));
        Single<String> singleE = eVar.e(k.f8922b.b());
        Single<Long> singleC2 = eVar.f7766c.b().c(jLongValue);
        final C0224e c0224e = C0224e.f7787d;
        Single singleZip = Single.zip(singleC, singleE, singleC2, new io.reactivex.functions.Function3() { // from class: com.incode.welcome_sdk.data.local.a.d.c.e$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Function3
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return e.e(c0224e, obj, obj2, obj3);
            }
        });
        final b bVar = eVar.new b(iIntValue);
        Completable completableFlatMapCompletable = singleZip.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.c.e$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.b(bVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i7 = f7764d + 67;
        f7765e = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 19 / 0;
        }
        return completableFlatMapCompletable;
    }

    static final class c extends Lambda implements Function1<Long, MaybeSource<? extends Long>> {

        /* JADX INFO: renamed from: b */
        private static int f7778b = 1;

        /* JADX INFO: renamed from: d */
        private static int f7779d = 0;

        private MaybeSource<? extends Long> d(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7779d + 79;
            f7778b = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(l2, "");
                return e.a(e.this).d().c(l2.longValue(), k.f8922b.b());
            }
            Intrinsics.checkNotNullParameter(l2, "");
            e.a(e.this).d().c(l2.longValue(), k.f8922b.b());
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends Long> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7779d + 123;
            f7778b = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource<? extends Long> maybeSourceD = d(l2);
            int i5 = f7779d + 21;
            f7778b = i5 % 128;
            int i6 = i5 % 2;
            return maybeSourceD;
        }

        c() {
            super(1);
        }
    }

    static final class d extends Lambda implements Function1<Long, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c>> {

        /* JADX INFO: renamed from: a */
        private static int f7781a = 0;

        /* JADX INFO: renamed from: c */
        private static int f7782c = 1;

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> a(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7782c + 3;
            f7781a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> maybeB = e.a(e.this).f().b(l2.longValue());
            int i5 = f7781a + 59;
            f7782c = i5 % 128;
            int i6 = i5 % 2;
            return maybeB;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7781a + 73;
            f7782c = i3 % 128;
            Long l3 = l2;
            if (i3 % 2 != 0) {
                return a(l3);
            }
            a(l3);
            throw null;
        }

        d() {
            super(1);
        }
    }

    public static final MaybeSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7765e + 9;
        f7764d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (MaybeSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    static final class a extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c, CompletableSource> {

        /* JADX INFO: renamed from: f */
        private static int f7767f = 1;

        /* JADX INFO: renamed from: g */
        private static int f7768g = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ ValidationPhase f7769a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ String f7770b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ String f7771c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ e f7772d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ boolean f7773e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
            int i2 = 2 % 2;
            int i3 = f7768g + 93;
            f7767f = i3 % 128;
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar2 = cVar;
            if (i3 % 2 == 0) {
                a(cVar2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CompletableSource completableSourceA = a(cVar2);
            int i4 = f7768g + 75;
            f7767f = i4 % 128;
            int i5 = i4 % 2;
            return completableSourceA;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private io.reactivex.CompletableSource a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c r20) {
            /*
                r19 = this;
                r3 = r19
                r6 = 2
                int r0 = r6 % r6
                int r0 = com.incode.welcome_sdk.data.local.a.d.c.e.a.f7768g
                int r1 = r0 + 107
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.a.d.c.e.a.f7767f = r0
                int r1 = r1 % r6
                java.lang.String r0 = ""
                r7 = r20
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r1 = r3.f7769a
                com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_ID_FRONT
                r16 = 1
                r5 = 0
                if (r1 == r0) goto L24
                com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r1 = r3.f7769a
                com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_PASSPORT
                if (r1 != r0) goto L8f
            L24:
                r4 = r16
            L26:
                com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r1 = r3.f7769a
                com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_PASSPORT
                if (r1 == r0) goto L40
                int r0 = com.incode.welcome_sdk.data.local.a.d.c.e.a.f7768g
                int r1 = r0 + 23
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.a.d.c.e.a.f7767f = r0
                int r1 = r1 % r6
                if (r1 != 0) goto L85
                com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r2 = r3.f7769a
                com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_ID_BACK
                r0 = 97
                int r0 = r0 / r5
                if (r2 != r1) goto L8c
            L40:
                com.incode.welcome_sdk.data.local.a.d.c.e r0 = r3.f7772d
                com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase r0 = com.incode.welcome_sdk.data.local.a.d.c.e.a(r0)
                com.incode.welcome_sdk.data.local.db.c.a.q r2 = r0.f()
                if (r4 == 0) goto L77
                java.lang.String r10 = r3.f7771c
            L4e:
                if (r4 != 0) goto L72
                int r0 = com.incode.welcome_sdk.data.local.a.d.c.e.a.f7768g
                int r1 = r0 + 27
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.a.d.c.e.a.f7767f = r0
                int r1 = r1 % r6
                java.lang.String r11 = r3.f7771c
            L5b:
                java.lang.String r12 = r3.f7770b
                boolean r13 = r3.f7773e
                r17 = 0
                r18 = 353(0x161, float:4.95E-43)
                r8 = 0
                r14 = 0
                r15 = 0
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c.b(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                io.reactivex.Completable r0 = r2.e(r0)
                io.reactivex.CompletableSource r0 = (io.reactivex.CompletableSource) r0
                return r0
            L72:
                java.lang.String r11 = r7.d()
                goto L5b
            L77:
                java.lang.String r10 = r7.c()
                int r0 = com.incode.welcome_sdk.data.local.a.d.c.e.a.f7768g
                int r1 = r0 + 59
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.a.d.c.e.a.f7767f = r0
                int r1 = r1 % r6
                goto L4e
            L85:
                com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r1 = r3.f7769a
                com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_ID_BACK
                if (r1 != r0) goto L8c
                goto L40
            L8c:
                r16 = r5
                goto L40
            L8f:
                r4 = r5
                goto L26
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.a.d.c.e.a.a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c):io.reactivex.CompletableSource");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ValidationPhase validationPhase, e eVar, String str, String str2, boolean z2) {
            super(1);
            this.f7769a = validationPhase;
            this.f7772d = eVar;
            this.f7771c = str;
            this.f7770b = str2;
            this.f7773e = z2;
        }
    }

    public static final CompletableSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7764d + 37;
        f7765e = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i4 = f7764d + 27;
        f7765e = i4 % 128;
        if (i4 % 2 == 0) {
            return completableSource;
        }
        obj2.hashCode();
        throw null;
    }

    public final Completable b(long j2, String str, String str2, boolean z2, ValidationPhase validationPhase) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(validationPhase, "");
        Single<Long> singleC = this.f7766c.b().c(j2);
        final c cVar = new c();
        Maybe<R> maybeFlatMapMaybe = singleC.flatMapMaybe(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.c.e$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.a(cVar, obj);
            }
        });
        final d dVar = new d();
        Maybe maybeFlatMap = maybeFlatMapMaybe.flatMap(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.c.e$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.c(dVar, obj);
            }
        });
        final a aVar = new a(validationPhase, this, str, str2, z2);
        Completable completableFlatMapCompletable = maybeFlatMap.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.c.e$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.d(aVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f7765e + 41;
        f7764d = i3 % 128;
        if (i3 % 2 != 0) {
            return completableFlatMapCompletable;
        }
        throw null;
    }

    static final class i extends Lambda implements Function1<Long, MaybeSource<? extends Long>> {

        /* JADX INFO: renamed from: d */
        private static int f7795d = 1;

        /* JADX INFO: renamed from: e */
        private static int f7796e = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ DelayedOnboardingDatabase f7797b;

        private MaybeSource<? extends Long> e(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7795d + 75;
            f7796e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Maybe<Long> maybeC = this.f7797b.d().c(l2.longValue(), k.f8922b.b());
            int i5 = f7795d + 125;
            f7796e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 0;
            }
            return maybeC;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends Long> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7796e + 81;
            f7795d = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource<? extends Long> maybeSourceE = e(l2);
            int i5 = f7795d + 17;
            f7796e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 84 / 0;
            }
            return maybeSourceE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(DelayedOnboardingDatabase delayedOnboardingDatabase) {
            super(1);
            this.f7797b = delayedOnboardingDatabase;
        }
    }

    static final class h extends Lambda implements Function1<Long, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c>> {

        /* JADX INFO: renamed from: c */
        private static int f7792c = 1;

        /* JADX INFO: renamed from: d */
        private static int f7793d = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ DelayedOnboardingDatabase f7794b;

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> c(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7792c + 11;
            f7793d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> maybeB = this.f7794b.f().b(l2.longValue());
            int i5 = f7792c + 19;
            f7793d = i5 % 128;
            if (i5 % 2 == 0) {
                return maybeB;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7792c + 95;
            f7793d = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> maybeSourceC = c(l2);
            if (i4 != 0) {
                int i5 = 43 / 0;
            }
            return maybeSourceC;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(DelayedOnboardingDatabase delayedOnboardingDatabase) {
            super(1);
            this.f7794b = delayedOnboardingDatabase;
        }
    }

    public static final MaybeSource e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7765e + 67;
        f7764d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i5 = f7764d + 93;
        f7765e = i5 % 128;
        if (i5 % 2 == 0) {
            return maybeSource;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static final class j extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c, CompletableSource> {

        /* JADX INFO: renamed from: b */
        private static int f7798b = 1;

        /* JADX INFO: renamed from: c */
        private static int f7799c = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ DelayedOnboardingDatabase f7800a;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ IdScan.IdType f7801e;

        private CompletableSource b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
            q qVarF;
            String strName;
            boolean z2;
            int i2;
            long j2;
            String str;
            String str2;
            boolean z3;
            String str3;
            com.incode.welcome_sdk.data.remote.beans.f fVar;
            boolean z4;
            int i3 = 2 % 2;
            int i4 = f7798b + 111;
            f7799c = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cVar, "");
                qVarF = this.f7800a.f();
                strName = this.f7801e.name();
                z2 = true;
                i2 = 12037;
                j2 = 1;
                str = null;
                str2 = null;
                z3 = true;
                str3 = null;
                fVar = null;
                z4 = true;
            } else {
                Intrinsics.checkNotNullParameter(cVar, "");
                qVarF = this.f7800a.f();
                strName = this.f7801e.name();
                z2 = false;
                i2 = 503;
                j2 = 0;
                str = null;
                str2 = null;
                z3 = false;
                str3 = null;
                fVar = null;
                z4 = false;
            }
            Completable completableE = qVarF.e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c.b(cVar, j2, str, str2, strName, z3, str3, fVar, z4, z2, i2));
            int i5 = f7799c + 33;
            f7798b = i5 % 128;
            int i6 = i5 % 2;
            return completableE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
            int i2 = 2 % 2;
            int i3 = f7798b + 109;
            f7799c = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceB = b(cVar);
            int i5 = f7798b + 55;
            f7799c = i5 % 128;
            if (i5 % 2 == 0) {
                return completableSourceB;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(DelayedOnboardingDatabase delayedOnboardingDatabase, IdScan.IdType idType) {
            super(1);
            this.f7800a = delayedOnboardingDatabase;
            this.f7801e = idType;
        }
    }

    public static final CompletableSource g(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7764d + 43;
        f7765e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7765e + 31;
        f7764d = i5 % 128;
        int i6 = i5 % 2;
        return completableSource;
    }

    public final Completable a(long j2, IdScan.IdType idType) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(idType, "");
        DelayedOnboardingDatabase delayedOnboardingDatabase = this.f7766c;
        Single<Long> singleC = delayedOnboardingDatabase.b().c(j2);
        final i iVar = new i(delayedOnboardingDatabase);
        Maybe<R> maybeFlatMapMaybe = singleC.flatMapMaybe(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.c.e$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.e(iVar, obj);
            }
        });
        final h hVar = new h(delayedOnboardingDatabase);
        Maybe maybeFlatMap = maybeFlatMapMaybe.flatMap(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.c.e$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.h(hVar, obj);
            }
        });
        final j jVar = new j(delayedOnboardingDatabase, idType);
        Completable completableFlatMapCompletable = maybeFlatMap.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.c.e$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.g(jVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f7764d + 51;
        f7765e = i3 % 128;
        if (i3 % 2 == 0) {
            return completableFlatMapCompletable;
        }
        throw null;
    }

    static final class f extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c, CompletableSource> {

        /* JADX INFO: renamed from: c */
        private static int f7789c = 0;

        /* JADX INFO: renamed from: d */
        private static int f7790d = 1;

        private CompletableSource d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
            q qVarF;
            boolean z2;
            int i2;
            int i3 = 2 % 2;
            int i4 = f7789c + 11;
            f7790d = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cVar, "");
                qVarF = e.a(e.this).f();
                z2 = true;
                i2 = 25429;
            } else {
                Intrinsics.checkNotNullParameter(cVar, "");
                qVarF = e.a(e.this).f();
                z2 = true;
                i2 = 255;
            }
            Completable completableE = qVarF.e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c.b(cVar, 0L, null, null, null, false, null, null, false, z2, i2));
            int i5 = f7790d + 49;
            f7789c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 93 / 0;
            }
            return completableE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
            int i2 = 2 % 2;
            int i3 = f7789c + 29;
            f7790d = i3 % 128;
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar2 = cVar;
            if (i3 % 2 != 0) {
                return d(cVar2);
            }
            d(cVar2);
            throw null;
        }

        f() {
            super(1);
        }
    }

    public static final CompletableSource c(e eVar, long j2, IdScan.ScanStep scanStep, bc bcVar) {
        int i2 = 2 % 2;
        int i3 = f7765e + 103;
        f7764d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(eVar, "");
        Intrinsics.checkNotNullParameter(scanStep, "");
        Intrinsics.checkNotNullParameter(bcVar, "");
        Completable completableIgnoreElement = eVar.f7766c.j().b(b(j2, scanStep, bcVar)).ignoreElement();
        int i5 = f7764d + 109;
        f7765e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return completableIgnoreElement;
    }

    public static final CompletableSource j(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7765e + 81;
        f7764d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (CompletableSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        int i4 = 94 / 0;
        return (CompletableSource) function1.invoke(obj);
    }

    public final Completable a(final bc bcVar, final long j2, final IdScan.ScanStep scanStep) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bcVar, "");
        Intrinsics.checkNotNullParameter(scanStep, "");
        Completable completableDefer = Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.a.d.c.e$$ExternalSyntheticLambda8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.c(this.f$0, j2, scanStep, bcVar);
            }
        });
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> maybeB = this.f7766c.f().b(j2);
        final f fVar = new f();
        Completable completableAndThen = completableDefer.andThen(maybeB.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.c.e$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.j(fVar, obj);
            }
        }));
        Intrinsics.checkNotNull(completableAndThen);
        int i3 = f7764d + 99;
        f7765e = i3 % 128;
        if (i3 % 2 == 0) {
            return completableAndThen;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.e b(long j2, IdScan.ScanStep scanStep, bc bcVar) throws Throwable {
        String strD = d(bcVar);
        String strName = scanStep.name();
        boolean zD = bcVar.d();
        boolean zE = bcVar.e();
        String str = bcVar.f9398b;
        if (str == null) {
            str = "";
        }
        String strC = bcVar.c();
        if (strC == null) {
            strC = "";
        }
        int iF = bcVar.f();
        String str2 = (String) bc.e(BaseValidationPresenter_Factory.e(), new Object[]{bcVar}, -210598799, BaseValidationPresenter_Factory.e(), BaseValidationPresenter_Factory.e(), 210598801, BaseValidationPresenter_Factory.e());
        if (str2 == null) {
            str2 = "";
        }
        String str3 = strD;
        String str4 = (str3 == null || str3.length() == 0) ? "SUCCESS" : "ERROR";
        String strG = bcVar.g();
        return new com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.e(j2, strName, zD, zE, str, strC, iF, str2, str4, strD, strG != null ? strG : "");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String d(com.incode.welcome_sdk.data.remote.beans.bc r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.a.d.c.e.d(com.incode.welcome_sdk.data.remote.beans.bc):java.lang.String");
    }

    private final Single<String> e(String str) {
        int i2 = 2 % 2;
        int i3 = f7764d + 99;
        f7765e = i3 % 128;
        int i4 = i3 % 2;
        Single<String> single = this.f7766c.c().e(str).toSingle();
        Intrinsics.checkNotNullExpressionValue(single, "");
        int i5 = f7765e + 123;
        f7764d = i5 % 128;
        if (i5 % 2 != 0) {
            return single;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void f(String str, int i2, int i3, boolean z2, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10;
        int i7 = i6 + 97;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        if (str2 != null) {
            int i9 = i6 + 63;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i3];
        nVar.f2781b = 0;
        while (nVar.f2781b < i3) {
            nVar.f2782c = cArr[nVar.f2781b];
            cArr2[nVar.f2781b] = (char) (i4 + nVar.f2782c);
            int i11 = nVar.f2781b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i11]), Integer.valueOf(f7763a)};
                Object objC = com.c.a.e.e.c(2056116162);
                if (objC == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objC = com.c.a.e.e.e((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 20 - KeyEvent.normalizeMetaState(0), View.MeasureSpec.getSize(0) + TypedValues.Custom.TYPE_COLOR, 2048382395, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i11] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objC2 = com.c.a.e.e.c(1507983255);
                if (objC2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objC2 = com.c.a.e.e.e((char) (ViewConfiguration.getTapTimeout() >> 16), 19 - (ViewConfiguration.getTouchSlop() >> 8), MotionEvent.axisFromString("") + 281, 1501298158, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            nVar.f2780a = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - nVar.f2780a, nVar.f2780a);
            System.arraycopy(cArr3, nVar.f2780a, cArr2, 0, i3 - nVar.f2780a);
        }
        if (z2) {
            int i12 = $11 + 103;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i3];
            nVar.f2781b = 0;
            while (nVar.f2781b < i3) {
                cArr4[nVar.f2781b] = cArr2[(i3 - nVar.f2781b) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objC3 = com.c.a.e.e.c(1507983255);
                if (objC3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objC3 = com.c.a.e.e.e((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19, 280 - ((Process.getThreadPriority(0) + 20) >> 6), 1501298158, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private final Completable e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar) {
        int i2 = 2 % 2;
        int i3 = f7764d + 25;
        f7765e = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7766c.d().c(jVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Completable completableC = this.f7766c.d().c(jVar);
        int i4 = f7764d + 59;
        f7765e = i4 % 128;
        int i5 = i4 % 2;
        return completableC;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f7765e = 0;
        f7764d = 1;
        f7763a = 1994499273;
    }

    public static final MaybeSource h(Function1 function1, Object obj) {
        int iB = UserConsentActivity.Companion.b();
        return (MaybeSource) a(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), iB, new Object[]{function1, obj}, -1472855898, 1472855901);
    }

    public static final MaybeSource c(Function1 function1, Object obj) {
        int iB = UserConsentActivity.Companion.b();
        return (MaybeSource) a(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), iB, new Object[]{function1, obj}, -77299351, 77299351);
    }

    public static final CompletableSource b(Function1 function1, Object obj) {
        int iB = UserConsentActivity.Companion.b();
        return (CompletableSource) a(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), iB, new Object[]{function1, obj}, -1622605528, 1622605530);
    }

    public final Completable a(long j2, IdScan.ScanStep scanStep, int i2) {
        Object[] objArr = {this, Long.valueOf(j2), scanStep, Integer.valueOf(i2)};
        return (Completable) a(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), objArr, -1363717002, 1363717003);
    }
}
