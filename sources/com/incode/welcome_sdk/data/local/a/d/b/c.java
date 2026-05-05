package com.incode.welcome_sdk.data.local.a.d.b;

import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.autofill.HintConstants;
import com.c.a.g;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.local.a.d.b.c;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.j;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.k;
import com.incode.welcome_sdk.results.IdProcessResult;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.sentry.protocol.Geo;
import io.sentry.protocol.SentryThread;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b */
    private static char[] f7733b = null;

    /* JADX INFO: renamed from: c */
    private static int f7734c = 0;

    /* JADX INFO: renamed from: d */
    private static int f7735d = 0;

    /* JADX INFO: renamed from: e */
    private static long f7736e = 0;

    /* JADX INFO: renamed from: a */
    private final DelayedOnboardingDatabase f7737a;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x001f -> B:17:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            int r7 = 116 - r7
            int r0 = r8 + 4
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r5 = com.incode.welcome_sdk.data.local.a.d.b.c.$$a
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L26
            r7 = r6
            r1 = r0
            r2 = r3
        L12:
            int r7 = r7 + r0
            r0 = r1
        L14:
            byte r1 = (byte) r7
            r4[r2] = r1
            if (r2 != r6) goto L1f
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L1f:
            int r2 = r2 + 1
            int r1 = r0 + 1
            r0 = r5[r1]
            goto L12
        L26:
            r2 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.a.d.b.c.$$c(byte, int, byte):java.lang.String");
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i5;
        int i10 = (~i4) | i9;
        int i11 = ~(i4 | i9);
        int i12 = i5 + i6 + i2 + ((-714989572) * i3) + (1142003473 * i7);
        int i13 = i12 * i12;
        int i14 = (((-190873766) * i5) - 1983905792) + (1136689320 * i6) + (i8 * (-1483702105)) + (1483702105 * i10) + ((-1483702105) * i11) + ((-1674575872) * i2) + ((-1891631104) * i3) + ((-1355808768) * i7) + ((-1882259456) * i13);
        int i15 = (i5 * (-1158907614)) + 1427560840 + (i6 * (-1158905656)) + (i8 * 979) + (i10 * (-979)) + (i11 * 979) + (i2 * (-1158906635)) + (i3 * 1387703340) + (i7 * 1202573125) + (i13 * (-451215360));
        return i14 + ((i15 * i15) * (-310837248)) != 1 ? c(objArr) : e(objArr);
    }

    static void init$0() {
        $$a = new byte[]{102, -25, -78, -11};
        $$b = 77;
    }

    @Inject
    public c(DelayedOnboardingDatabase delayedOnboardingDatabase) {
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        this.f7737a = delayedOnboardingDatabase;
    }

    public static final /* synthetic */ Completable b(c cVar, j jVar) {
        int i2 = 2 % 2;
        int i3 = f7735d + 79;
        f7734c = i3 % 128;
        if (i3 % 2 != 0) {
            return cVar.c(jVar);
        }
        cVar.c(jVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f7734c;
        int i4 = i3 + 21;
        f7735d = i4 % 128;
        int i5 = i4 % 2;
        DelayedOnboardingDatabase delayedOnboardingDatabase = cVar.f7737a;
        int i6 = i3 + 65;
        f7735d = i6 % 128;
        if (i6 % 2 == 0) {
            return delayedOnboardingDatabase;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> d(long j2) {
        int i2 = 2 % 2;
        int i3 = f7734c + 27;
        f7735d = i3 % 128;
        int i4 = i3 % 2;
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> maybeB = this.f7737a.h().b(j2);
        int i5 = f7735d + 83;
        f7734c = i5 % 128;
        int i6 = i5 % 2;
        return maybeB;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.d.b.c$c */
    static final class C0223c extends Lambda implements Function3<Long, String, Long, Triple<? extends Long, ? extends String, ? extends Long>> {

        /* JADX INFO: renamed from: a */
        private static int f7745a = 1;

        /* JADX INFO: renamed from: b */
        private static int f7746b = 1;

        /* JADX INFO: renamed from: c */
        private static int f7747c = 0;

        /* JADX INFO: renamed from: d */
        public static final C0223c f7748d = new C0223c();

        /* JADX INFO: renamed from: e */
        private static int f7749e = 0;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Triple<? extends Long, ? extends String, ? extends Long> invoke(Long l2, String str, Long l3) {
            int i2 = 2 % 2;
            int i3 = f7746b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f7747c = i3 % 128;
            int i4 = i3 % 2;
            Triple<Long, String, Long> tripleD = d(l2, str, l3);
            int i5 = f7746b + 41;
            f7747c = i5 % 128;
            int i6 = i5 % 2;
            return tripleD;
        }

        private static Triple<Long, String, Long> d(Long l2, String str, Long l3) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(l3, "");
            Triple<Long, String, Long> triple = new Triple<>(l2, str, l3);
            int i3 = f7747c + 85;
            f7746b = i3 % 128;
            int i4 = i3 % 2;
            return triple;
        }

        static {
            int i2 = f7749e + 95;
            f7745a = i2 % 128;
            int i3 = i2 % 2;
        }

        C0223c() {
            super(3);
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        c cVar = (c) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Single<Long> singleE = cVar.f7737a.h().e(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b(0L, false, false));
        Single<String> singleD = cVar.d(k.f8925e.b());
        Single<Long> singleC = cVar.f7737a.b().c(jLongValue);
        final C0223c c0223c = C0223c.f7748d;
        Single singleZip = Single.zip(singleE, singleD, singleC, new io.reactivex.functions.Function3() { // from class: com.incode.welcome_sdk.data.local.a.d.b.c$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function3
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return c.c(c0223c, obj, obj2, obj3);
            }
        });
        final a aVar = new a(iIntValue, cVar);
        Completable completableFlatMapCompletable = singleZip.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.b.c$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.c(aVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f7735d + 87;
        f7734c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
        return completableFlatMapCompletable;
    }

    public static final Triple c(Function3 function3, Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = f7735d + 57;
        f7734c = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function3, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            Intrinsics.checkNotNullParameter(obj3, "");
            return (Triple) function3.invoke(obj, obj2, obj3);
        }
        Intrinsics.checkNotNullParameter(function3, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        int i4 = 14 / 0;
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    static final class a extends Lambda implements Function1<Triple<? extends Long, ? extends String, ? extends Long>, CompletableSource> {

        /* JADX INFO: renamed from: a */
        private static int f7738a = 0;

        /* JADX INFO: renamed from: d */
        private static int f7739d = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ int f7740b;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ c f7741e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Triple<? extends Long, ? extends String, ? extends Long> triple) {
            int i2 = 2 % 2;
            int i3 = f7738a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f7739d = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceB = b(triple);
            int i5 = f7738a + 33;
            f7739d = i5 % 128;
            int i6 = i5 % 2;
            return completableSourceB;
        }

        private CompletableSource b(Triple<Long, String, Long> triple) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(triple, "");
            Long first = triple.getFirst();
            Intrinsics.checkNotNullExpressionValue(first, "");
            long jLongValue = first.longValue();
            String second = triple.getSecond();
            Intrinsics.checkNotNullExpressionValue(second, "");
            Long third = triple.getThird();
            Intrinsics.checkNotNullExpressionValue(third, "");
            Completable completableB = c.b(this.f7741e, new j(0L, third.longValue(), second, jLongValue, this.f7740b));
            int i3 = f7738a + 69;
            f7739d = i3 % 128;
            int i4 = i3 % 2;
            return completableB;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i2, c cVar) {
            super(1);
            this.f7740b = i2;
            this.f7741e = cVar;
        }
    }

    public static final CompletableSource c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7734c + 113;
        f7735d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7734c + 23;
        f7735d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return completableSource;
    }

    static final class b extends Lambda implements Function1<Long, MaybeSource<? extends Long>> {

        /* JADX INFO: renamed from: a */
        private static int f7742a = 1;

        /* JADX INFO: renamed from: b */
        private static int f7743b = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends Long> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7743b + 91;
            f7742a = i3 % 128;
            Long l3 = l2;
            if (i3 % 2 != 0) {
                return b(l3);
            }
            b(l3);
            throw null;
        }

        private MaybeSource<? extends Long> b(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7743b + 123;
            f7742a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Object[] objArr = {c.this};
            Maybe<Long> maybeC = ((DelayedOnboardingDatabase) c.b(IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), objArr, 578806068, -578806067, IncodeWelcome.cm.d())).d().c(l2.longValue(), k.f8925e.b());
            int i5 = f7742a + 61;
            f7743b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 50 / 0;
            }
            return maybeC;
        }

        b() {
            super(1);
        }
    }

    public final Completable c(long j2) {
        int i2 = 2 % 2;
        Single<Long> singleC = this.f7737a.b().c(j2);
        final b bVar = new b();
        Maybe<R> maybeFlatMapMaybe = singleC.flatMapMaybe(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.b.c$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.a(bVar, obj);
            }
        });
        final e eVar = new e();
        Maybe maybeFlatMap = maybeFlatMapMaybe.flatMap(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.b.c$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.d(eVar, obj);
            }
        });
        final d dVar = new d();
        Completable completableFlatMapCompletable = maybeFlatMap.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.b.c$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.b(dVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f7734c + 121;
        f7735d = i3 % 128;
        int i4 = i3 % 2;
        return completableFlatMapCompletable;
    }

    public static final MaybeSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7734c + 53;
        f7735d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i5 = f7735d + 87;
        f7734c = i5 % 128;
        int i6 = i5 % 2;
        return maybeSource;
    }

    static final class e extends Lambda implements Function1<Long, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b>> {

        /* JADX INFO: renamed from: a */
        private static int f7753a = 1;

        /* JADX INFO: renamed from: b */
        private static int f7754b = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7753a + 61;
            f7754b = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> maybeSourceB = b(l2);
            int i5 = f7753a + 117;
            f7754b = i5 % 128;
            int i6 = i5 % 2;
            return maybeSourceB;
        }

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> b(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7753a + 7;
            f7754b = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(l2, "");
                Object[] objArr = {c.this};
                ((DelayedOnboardingDatabase) c.b(IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), objArr, 578806068, -578806067, IncodeWelcome.cm.d())).h().b(l2.longValue());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(l2, "");
            Object[] objArr2 = {c.this};
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> maybeB = ((DelayedOnboardingDatabase) c.b(IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), objArr2, 578806068, -578806067, IncodeWelcome.cm.d())).h().b(l2.longValue());
            int i4 = f7754b + 19;
            f7753a = i4 % 128;
            int i5 = i4 % 2;
            return maybeB;
        }

        e() {
            super(1);
        }
    }

    public static final MaybeSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7734c + 61;
        f7735d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i5 = f7735d + 39;
        f7734c = i5 % 128;
        int i6 = i5 % 2;
        return maybeSource;
    }

    static final class d extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b, CompletableSource> {

        /* JADX INFO: renamed from: a */
        private static int f7750a = 0;

        /* JADX INFO: renamed from: d */
        private static int f7751d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
            int i2 = 2 % 2;
            int i3 = f7750a + 115;
            f7751d = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceD = d(bVar);
            int i5 = f7751d + 19;
            f7750a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 32 / 0;
            }
            return completableSourceD;
        }

        private CompletableSource d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
            int i2 = 2 % 2;
            int i3 = f7750a + 17;
            f7751d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(bVar, "");
            bVar.c();
            Object[] objArr = {c.this};
            Completable completableA = ((DelayedOnboardingDatabase) c.b(IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), objArr, 578806068, -578806067, IncodeWelcome.cm.d())).h().a(bVar);
            int i5 = f7751d + 111;
            f7750a = i5 % 128;
            int i6 = i5 % 2;
            return completableA;
        }

        d() {
            super(1);
        }
    }

    public static final CompletableSource b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7735d + 27;
        f7734c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7735d + 75;
        f7734c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return completableSource;
    }

    public final Completable c(IdProcessResult idProcessResult, long j2) throws Throwable {
        Map mapMapOf;
        LinkedHashMap linkedHashMapEmptyMap;
        Map<String, Object> extendedOcrJsonData;
        Set<Map.Entry<String, Object>> setEntrySet;
        Intrinsics.checkNotNullParameter(idProcessResult, "");
        IncodeWelcome.OCRData ocrData = idProcessResult.getOcrData();
        if (ocrData == null) {
            mapMapOf = null;
        } else {
            Pair[] pairArr = new Pair[27];
            pairArr[0] = TuplesKt.to("birthDate", ocrData.getBirthDate());
            pairArr[1] = TuplesKt.to("fullName", ocrData.getFullName());
            pairArr[2] = TuplesKt.to("firstName", ocrData.getFirstName());
            pairArr[3] = TuplesKt.to("middleName", ocrData.getMiddleName());
            pairArr[4] = TuplesKt.to("lastName", ocrData.getLastName());
            Object[] objArr = new Object[1];
            f(MotionEvent.axisFromString("") + 1, View.MeasureSpec.getMode(0) + 7, (char) View.combineMeasuredStates(0, 0), objArr);
            pairArr[5] = TuplesKt.to(((String) objArr[0]).intern(), ocrData.getAddress());
            pairArr[6] = TuplesKt.to(HintConstants.AUTOFILL_HINT_GENDER, ocrData.getGender());
            pairArr[7] = TuplesKt.to("registrationDate", String.valueOf(ocrData.getRegistrationDate()));
            pairArr[8] = TuplesKt.to("issueDate", String.valueOf(ocrData.getIssueDate()));
            pairArr[9] = TuplesKt.to("expirationDate", String.valueOf(ocrData.getExpirationDate()));
            pairArr[10] = TuplesKt.to("claveDeElector", ocrData.getClaveDeElector());
            pairArr[11] = TuplesKt.to("curp", ocrData.getCurp());
            pairArr[12] = TuplesKt.to("numeroEmisionCredencial", ocrData.getNumeroEmisionCredencial());
            pairArr[13] = TuplesKt.to("cic", ocrData.getCic());
            pairArr[14] = TuplesKt.to(OptionalModuleUtils.OCR, ocrData.getOcr());
            pairArr[15] = TuplesKt.to("notExtracted", String.valueOf(ocrData.getNotExtracted()));
            pairArr[16] = TuplesKt.to("issuingCountry", ocrData.getIssuingCountry());
            IncodeWelcome.AddressFields addressFields = ocrData.getAddressFields();
            pairArr[17] = TuplesKt.to("street", addressFields != null ? addressFields.getStreet() : null);
            IncodeWelcome.AddressFields addressFields2 = ocrData.getAddressFields();
            pairArr[18] = TuplesKt.to("colony", addressFields2 != null ? addressFields2.getColony() : null);
            IncodeWelcome.AddressFields addressFields3 = ocrData.getAddressFields();
            pairArr[19] = TuplesKt.to(HintConstants.AUTOFILL_HINT_POSTAL_CODE, addressFields3 != null ? addressFields3.getPostalCode() : null);
            IncodeWelcome.AddressFields addressFields4 = ocrData.getAddressFields();
            pairArr[20] = TuplesKt.to(Geo.JsonKeys.CITY, addressFields4 != null ? addressFields4.getCity() : null);
            IncodeWelcome.AddressFields addressFields5 = ocrData.getAddressFields();
            pairArr[21] = TuplesKt.to(SentryThread.JsonKeys.STATE, addressFields5 != null ? addressFields5.getState() : null);
            IncodeWelcome.AddressFields addressFieldsFromStatement = ocrData.getAddressFieldsFromStatement();
            pairArr[22] = TuplesKt.to("streetFromStatement", addressFieldsFromStatement != null ? addressFieldsFromStatement.getStreet() : null);
            IncodeWelcome.AddressFields addressFieldsFromStatement2 = ocrData.getAddressFieldsFromStatement();
            pairArr[23] = TuplesKt.to("colonyFromStatement", addressFieldsFromStatement2 != null ? addressFieldsFromStatement2.getColony() : null);
            IncodeWelcome.AddressFields addressFieldsFromStatement3 = ocrData.getAddressFieldsFromStatement();
            pairArr[24] = TuplesKt.to("postalCodeFromStatement", addressFieldsFromStatement3 != null ? addressFieldsFromStatement3.getPostalCode() : null);
            IncodeWelcome.AddressFields addressFieldsFromStatement4 = ocrData.getAddressFieldsFromStatement();
            pairArr[25] = TuplesKt.to("cityFromStatement", addressFieldsFromStatement4 != null ? addressFieldsFromStatement4.getCity() : null);
            IncodeWelcome.AddressFields addressFieldsFromStatement5 = ocrData.getAddressFieldsFromStatement();
            pairArr[26] = TuplesKt.to("stateFromStatement", addressFieldsFromStatement5 != null ? addressFieldsFromStatement5.getState() : null);
            mapMapOf = MapsKt.mapOf(pairArr);
        }
        IncodeWelcome.OCRData ocrData2 = idProcessResult.getOcrData();
        if (ocrData2 == null || (extendedOcrJsonData = ocrData2.getExtendedOcrJsonData()) == null || (setEntrySet = extendedOcrJsonData.entrySet()) == null) {
            linkedHashMapEmptyMap = MapsKt.emptyMap();
        } else {
            Set<Map.Entry<String, Object>> set = setEntrySet;
            linkedHashMapEmptyMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Pair pair = TuplesKt.to(str, value != null ? value.toString() : null);
                linkedHashMapEmptyMap.put(pair.getFirst(), pair.getSecond());
            }
        }
        String strName = idProcessResult.resultCode.name();
        Throwable th = idProcessResult.error;
        Single<Long> singleA = this.f7737a.i().a(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.d(j2, mapMapOf, linkedHashMapEmptyMap, strName, th != null ? th.toString() : null));
        final f fVar = new f(j2);
        Completable completableFlatMapCompletable = singleA.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.b.c$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.e(fVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        return completableFlatMapCompletable;
    }

    static final class f extends Lambda implements Function1<Long, CompletableSource> {

        /* JADX INFO: renamed from: a */
        private static int f7756a = 0;

        /* JADX INFO: renamed from: b */
        private static int f7757b = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ long f7758c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7756a + 87;
            f7757b = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceB = b(l2);
            int i5 = f7757b + 95;
            f7756a = i5 % 128;
            int i6 = i5 % 2;
            return completableSourceB;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.d.b.c$f$1 */
        static final class AnonymousClass1 extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b, CompletableSource> {

            /* JADX INFO: renamed from: a */
            private static int f7760a = 1;

            /* JADX INFO: renamed from: e */
            private static int f7761e = 0;

            private CompletableSource c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
                int i2 = 2 % 2;
                int i3 = f7761e + 81;
                f7760a = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(bVar, "");
                Object[] objArr = {cVar};
                Completable completableA = ((DelayedOnboardingDatabase) c.b(IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), objArr, 578806068, -578806067, IncodeWelcome.cm.d())).h().a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b.d(bVar));
                int i5 = f7761e + 115;
                f7760a = i5 % 128;
                if (i5 % 2 != 0) {
                    return completableA;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
                int i2 = 2 % 2;
                int i3 = f7761e + 121;
                f7760a = i3 % 128;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar2 = bVar;
                if (i3 % 2 != 0) {
                    return c(bVar2);
                }
                c(bVar2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass1() {
                super(1);
            }
        }

        private CompletableSource b(Long l2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Object[] objArr = {c.this};
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> maybeB = ((DelayedOnboardingDatabase) c.b(IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), objArr, 578806068, -578806067, IncodeWelcome.cm.d())).h().b(this.f7758c);
            final AnonymousClass1 anonymousClass1 = new Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b, CompletableSource>() { // from class: com.incode.welcome_sdk.data.local.a.d.b.c.f.1

                /* JADX INFO: renamed from: a */
                private static int f7760a = 1;

                /* JADX INFO: renamed from: e */
                private static int f7761e = 0;

                private CompletableSource c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
                    int i22 = 2 % 2;
                    int i3 = f7761e + 81;
                    f7760a = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.checkNotNullParameter(bVar, "");
                    Object[] objArr2 = {cVar};
                    Completable completableA = ((DelayedOnboardingDatabase) c.b(IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), objArr2, 578806068, -578806067, IncodeWelcome.cm.d())).h().a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b.d(bVar));
                    int i5 = f7761e + 115;
                    f7760a = i5 % 128;
                    if (i5 % 2 != 0) {
                        return completableA;
                    }
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
                    int i22 = 2 % 2;
                    int i3 = f7761e + 121;
                    f7760a = i3 % 128;
                    com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar2 = bVar;
                    if (i3 % 2 != 0) {
                        return c(bVar2);
                    }
                    c(bVar2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                AnonymousClass1() {
                    super(1);
                }
            };
            Completable completableFlatMapCompletable = maybeB.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.b.c$f$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return c.f.d(anonymousClass1, obj);
                }
            });
            int i3 = f7757b + 123;
            f7756a = i3 % 128;
            int i4 = i3 % 2;
            return completableFlatMapCompletable;
        }

        public static final CompletableSource d(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f7757b + 31;
            f7756a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
            int i4 = f7757b + 3;
            f7756a = i4 % 128;
            if (i4 % 2 == 0) {
                return completableSource;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j2) {
            super(1);
            this.f7758c = j2;
        }
    }

    public static final CompletableSource e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7735d + 57;
        f7734c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7735d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7734c = i5 % 128;
        int i6 = i5 % 2;
        return completableSource;
    }

    private static void f(int i2, int i3, char c2, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        g gVar = new g();
        long[] jArr = new long[i3];
        gVar.f2752c = 0;
        while (gVar.f2752c < i3) {
            int i5 = gVar.f2752c;
            try {
                Object[] objArr2 = {Integer.valueOf(f7733b[i2 + i5])};
                Object objC = com.c.a.e.e.c(-542847437);
                if (objC == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 3);
                    objC = com.c.a.e.e.e((char) View.MeasureSpec.getSize(0), Process.getGidForName("") + 20, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1028, -549532598, false, $$c(b2, b3, (byte) (b3 - 4)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objC).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f7736e), Integer.valueOf(c2)};
                Object objC2 = com.c.a.e.e.c(1506450485);
                if (objC2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 2);
                    objC2 = com.c.a.e.e.e((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 60521), 20 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 923, 1498455628, false, $$c(b4, b5, (byte) (b5 - 3)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objC2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {gVar, gVar};
                Object objC3 = com.c.a.e.e.c(-364489268);
                if (objC3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objC3 = com.c.a.e.e.e((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 9087), KeyEvent.normalizeMetaState(0) + 19, 242 - KeyEvent.normalizeMetaState(0), -354658379, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        gVar.f2752c = 0;
        while (gVar.f2752c < i3) {
            int i6 = $10 + 37;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr[gVar.f2752c] = (char) jArr[gVar.f2752c];
                Object[] objArr5 = {gVar, gVar};
                Object objC4 = com.c.a.e.e.c(-364489268);
                if (objC4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objC4 = com.c.a.e.e.e((char) (TextUtils.indexOf("", "") + 9087), 18 - TextUtils.lastIndexOf("", '0'), 242 - TextUtils.indexOf("", "", 0, 0), -354658379, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC4).invoke(null, objArr5);
                int i7 = 57 / 0;
            } else {
                cArr[gVar.f2752c] = (char) jArr[gVar.f2752c];
                Object[] objArr6 = {gVar, gVar};
                Object objC5 = com.c.a.e.e.c(-364489268);
                if (objC5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objC5 = com.c.a.e.e.e((char) (9087 - (ViewConfiguration.getEdgeSlop() >> 16)), ExpandableListView.getPackedPositionType(0L) + 19, 242 - TextUtils.getCapsMode("", 0, 0), -354658379, false, $$c(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC5).invoke(null, objArr6);
            }
            int i8 = $11 + 79;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 / 2;
            }
        }
        objArr[0] = new String(cArr);
    }

    private final Single<String> d(String str) {
        int i2 = 2 % 2;
        int i3 = f7734c + 33;
        f7735d = i3 % 128;
        int i4 = i3 % 2;
        Single<String> single = this.f7737a.c().e(str).toSingle();
        Intrinsics.checkNotNullExpressionValue(single, "");
        int i5 = f7735d + 51;
        f7734c = i5 % 128;
        int i6 = i5 % 2;
        return single;
    }

    private final Completable c(j jVar) {
        int i2 = 2 % 2;
        int i3 = f7735d + 71;
        f7734c = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = this.f7737a.d().c(jVar);
        int i5 = f7735d + 67;
        f7734c = i5 % 128;
        if (i5 % 2 != 0) {
            return completableC;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f7735d = 0;
        f7734c = 1;
        f7733b = new char[]{25233, 41597, 58182, 8249, 24881, 42510, 59381};
        f7736e = -2083031829510249959L;
    }

    public static final /* synthetic */ DelayedOnboardingDatabase a(c cVar) {
        int iD = IncodeWelcome.cm.d();
        return (DelayedOnboardingDatabase) b(IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), iD, new Object[]{cVar}, 578806068, -578806067, IncodeWelcome.cm.d());
    }

    public final Completable d(long j2, int i2) {
        Object[] objArr = {this, Long.valueOf(j2), Integer.valueOf(i2)};
        return (Completable) b(IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), objArr, 1711722001, -1711722001, IncodeWelcome.cm.d());
    }
}
