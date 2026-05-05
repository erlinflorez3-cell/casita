package com.incode.welcome_sdk.data.local.a.d.e;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.autofill.HintConstants;
import com.c.a.m;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.firebase.messaging.Constants;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.incode.welcome_sdk.data.local.a.d.e.c;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import com.incode.welcome_sdk.data.local.db.c.a.f;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.j;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.k;
import com.incode.welcome_sdk.data.remote.beans.IResponseDocumentScan;
import com.incode.welcome_sdk.data.remote.beans.ResponseMedicalDoc;
import com.incode.welcome_sdk.data.remote.beans.ResponseOCRData;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.bw;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.tutorial.DaggerIDTypeChooserComponent;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.sentry.protocol.Geo;
import io.sentry.protocol.SentryThread;
import java.io.File;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f7831a = 0;

    /* JADX INFO: renamed from: c */
    private static long f7832c = 0;

    /* JADX INFO: renamed from: d */
    private static int f7833d = 0;

    /* JADX INFO: renamed from: e */
    private final DelayedOnboardingDatabase f7834e;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, short r10, int r11) {
        /*
            int r0 = r11 * 3
            int r8 = r0 + 4
            byte[] r7 = com.incode.welcome_sdk.data.local.a.d.e.c.$$a
            int r0 = r10 * 3
            int r6 = 1 - r0
            int r0 = r9 * 3
            int r0 = 115 - r0
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r7 != 0) goto L2a
            r1 = r8
            r3 = r4
        L15:
            int r0 = -r0
            int r8 = r8 + r0
            int r1 = r1 + 1
            r2 = r3
        L1a:
            byte r0 = (byte) r8
            int r3 = r2 + 1
            r5[r2] = r0
            if (r3 != r6) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r0 = r7[r1]
            goto L15
        L2a:
            r2 = r4
            r1 = r8
            r8 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.a.d.e.c.$$c(short, short, int):java.lang.String");
    }

    public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        Set<Map.Entry<String, Object>> setEntrySet;
        String string;
        int i8 = ~i4;
        int i9 = ~i7;
        int i10 = (~((~i6) | i9)) | i8;
        int i11 = i4 | i9;
        int i12 = (~(i6 | i8 | i9)) | (~(i7 | i4));
        int i13 = i7 + i4 + i2 + (2049387148 * i3) + ((-609071723) * i5);
        int i14 = i13 * i13;
        int i15 = ((1483459036 * i7) - 1284505600) + (2005429323 * i4) + (i10 * 1605645861) + (1083675574 * i11) + (1605645861 * i12) + ((-1205862400) * i2) + ((-243269632) * i3) + ((-895483904) * i5) + ((-1334837248) * i14);
        int i16 = ((i7 * 335895516) - 1139737737) + (i4 * 335898315) + (i10 * 933) + (i11 * (-1866)) + (i12 * 933) + (i2 * 335896449) + (i3 * (-616405876)) + (i5 * 126640917) + (i14 * 2020605952);
        int i17 = i15 + (i16 * i16 * (-544210944));
        if (i17 == 1) {
            return b(objArr);
        }
        if (i17 != 2) {
            return e(objArr);
        }
        ResponseOCRData responseOCRData = (ResponseOCRData) objArr[0];
        int i18 = 2 % 2;
        int i19 = f7831a + 107;
        f7833d = i19 % 128;
        int i20 = i19 % 2;
        Map<String, Object> extendedOcrJsonData = responseOCRData.getExtendedOcrJsonData();
        if (extendedOcrJsonData == null || (setEntrySet = extendedOcrJsonData.entrySet()) == null) {
            return MapsKt.emptyMap();
        }
        Set<Map.Entry<String, Object>> set = setEntrySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            Pair pair = TuplesKt.to(str, string);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        int i21 = f7833d + 49;
        f7831a = i21 % 128;
        int i22 = i21 % 2;
        return linkedHashMap;
    }

    static void init$0() {
        $$a = new byte[]{104, 119, -28, 53};
        $$b = 17;
    }

    @Inject
    public c(DelayedOnboardingDatabase delayedOnboardingDatabase) {
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        this.f7834e = delayedOnboardingDatabase;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        c cVar = (c) objArr[0];
        j jVar = (j) objArr[1];
        int i2 = 2 % 2;
        int i3 = f7833d + 69;
        f7831a = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = cVar.c(jVar);
        if (i4 == 0) {
            int i5 = 21 / 0;
        }
        int i6 = f7833d + 85;
        f7831a = i6 % 128;
        int i7 = i6 % 2;
        return completableC;
    }

    public final DelayedOnboardingDatabase d() {
        int i2 = 2 % 2;
        int i3 = f7833d + 25;
        f7831a = i3 % 128;
        int i4 = i3 % 2;
        DelayedOnboardingDatabase delayedOnboardingDatabase = this.f7834e;
        if (i4 == 0) {
            int i5 = 95 / 0;
        }
        return delayedOnboardingDatabase;
    }

    public final Completable c(long j2, int i2) {
        int i3 = 2 % 2;
        Single<Long> singleD = this.f7834e.g().d(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d(0L, null, null, null, false, false));
        Single<String> singleC = c(k.f8921a.b());
        Single<Long> singleC2 = this.f7834e.b().c(j2);
        final C0226c c0226c = C0226c.f7844d;
        Single singleZip = Single.zip(singleD, singleC, singleC2, new Function3() { // from class: com.incode.welcome_sdk.data.local.a.d.e.c$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function3
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return c.e(c0226c, obj, obj2, obj3);
            }
        });
        final d dVar = new d(i2, this);
        Completable completableFlatMapCompletable = singleZip.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.e.c$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.b(dVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i4 = f7831a + 31;
        f7833d = i4 % 128;
        int i5 = i4 % 2;
        return completableFlatMapCompletable;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.d.e.c$c */
    /* synthetic */ class C0226c extends FunctionReferenceImpl implements kotlin.jvm.functions.Function3<Long, String, Long, Triple<? extends Long, ? extends String, ? extends Long>> {

        /* JADX INFO: renamed from: a */
        private static int f7841a = 1;

        /* JADX INFO: renamed from: b */
        private static int f7842b = 0;

        /* JADX INFO: renamed from: c */
        private static int f7843c = 0;

        /* JADX INFO: renamed from: d */
        public static final C0226c f7844d = new C0226c();

        /* JADX INFO: renamed from: e */
        private static int f7845e = 1;

        private static Triple<Long, String, Long> a(long j2, String str, long j3) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Triple<Long, String, Long> triple = new Triple<>(Long.valueOf(j2), str, Long.valueOf(j3));
            int i3 = f7845e + 63;
            f7842b = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 17 / 0;
            }
            return triple;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Triple<? extends Long, ? extends String, ? extends Long> invoke(Long l2, String str, Long l3) {
            int i2 = 2 % 2;
            int i3 = f7842b + 49;
            f7845e = i3 % 128;
            Long l4 = l2;
            if (i3 % 2 != 0) {
                return a(l4.longValue(), str, l3.longValue());
            }
            a(l4.longValue(), str, l3.longValue());
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f7841a + 93;
            f7843c = i2 % 128;
            int i3 = i2 % 2;
        }

        C0226c() {
            super(3, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }
    }

    static final class d extends Lambda implements Function1<Triple<? extends Long, ? extends String, ? extends Long>, CompletableSource> {

        /* JADX INFO: renamed from: d */
        private static int f7846d = 0;

        /* JADX INFO: renamed from: e */
        private static int f7847e = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ int f7848b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ c f7849c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Triple<? extends Long, ? extends String, ? extends Long> triple) {
            int i2 = 2 % 2;
            int i3 = f7847e + 11;
            f7846d = i3 % 128;
            Triple<? extends Long, ? extends String, ? extends Long> triple2 = triple;
            if (i3 % 2 != 0) {
                a(triple2);
                throw null;
            }
            CompletableSource completableSourceA = a(triple2);
            int i4 = f7846d + 73;
            f7847e = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return completableSourceA;
        }

        private CompletableSource a(Triple<Long, String, Long> triple) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(triple, "");
            long jLongValue = triple.component1().longValue();
            Completable completable = (Completable) c.e(DaggerIDTypeChooserComponent.d.b(), DaggerIDTypeChooserComponent.d.b(), new Object[]{this.f7849c, new j(0L, triple.component3().longValue(), triple.component2(), jLongValue, this.f7848b)}, -153932983, DaggerIDTypeChooserComponent.d.b(), DaggerIDTypeChooserComponent.d.b(), 153932983);
            int i3 = f7846d + 111;
            f7847e = i3 % 128;
            int i4 = i3 % 2;
            return completable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i2, c cVar) {
            super(1);
            this.f7848b = i2;
            this.f7849c = cVar;
        }
    }

    public static final Triple e(kotlin.jvm.functions.Function3 function3, Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = f7831a + 85;
        f7833d = i3 % 128;
        if (i3 % 2 == 0) {
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
        int i4 = 28 / 0;
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    public static final CompletableSource b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7831a + 21;
        f7833d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7831a + 13;
        f7833d = i5 % 128;
        if (i5 % 2 == 0) {
            return completableSource;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static final class b extends Lambda implements Function1<Long, MaybeSource<? extends Long>> {

        /* JADX INFO: renamed from: b */
        private static int f7838b = 1;

        /* JADX INFO: renamed from: e */
        private static int f7839e = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ DelayedOnboardingDatabase f7840d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends Long> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7838b + 35;
            f7839e = i3 % 128;
            Long l3 = l2;
            if (i3 % 2 != 0) {
                e(l3);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            MaybeSource<? extends Long> maybeSourceE = e(l3);
            int i4 = f7838b + 83;
            f7839e = i4 % 128;
            int i5 = i4 % 2;
            return maybeSourceE;
        }

        private MaybeSource<? extends Long> e(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7839e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f7838b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Maybe<Long> maybeC = this.f7840d.d().c(l2.longValue(), k.f8921a.b());
            int i5 = f7838b + 11;
            f7839e = i5 % 128;
            if (i5 % 2 == 0) {
                return maybeC;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DelayedOnboardingDatabase delayedOnboardingDatabase) {
            super(1);
            this.f7840d = delayedOnboardingDatabase;
        }
    }

    public static final MaybeSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7831a + 69;
        f7833d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (MaybeSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    static final class e extends Lambda implements Function1<Long, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d>> {

        /* JADX INFO: renamed from: c */
        private static int f7850c = 1;

        /* JADX INFO: renamed from: e */
        private static int f7851e = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ DelayedOnboardingDatabase f7852a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7850c + 65;
            f7851e = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> maybeSourceD = d(l2);
            int i5 = f7851e + 99;
            f7850c = i5 % 128;
            if (i5 % 2 != 0) {
                return maybeSourceD;
            }
            throw null;
        }

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> d(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7851e + 45;
            f7850c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> maybeB = this.f7852a.g().b(l2.longValue());
            int i5 = f7850c + 61;
            f7851e = i5 % 128;
            if (i5 % 2 == 0) {
                return maybeB;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(DelayedOnboardingDatabase delayedOnboardingDatabase) {
            super(1);
            this.f7852a = delayedOnboardingDatabase;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f7831a + 43;
        f7833d = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i4 = f7833d + 103;
        f7831a = i4 % 128;
        if (i4 % 2 != 0) {
            return maybeSource;
        }
        obj2.hashCode();
        throw null;
    }

    static final class g extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d, CompletableSource> {

        /* JADX INFO: renamed from: e */
        private static int f7853e = 0;

        /* JADX INFO: renamed from: g */
        private static int f7854g = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ File f7855a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ DelayedOnboardingDatabase f7856b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ DocumentType f7857c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ String f7858d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
            int i2 = 2 % 2;
            int i3 = f7853e + 51;
            f7854g = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceD = d(dVar);
            if (i4 == 0) {
                int i5 = 50 / 0;
            }
            return completableSourceD;
        }

        private CompletableSource d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
            int i2 = 2 % 2;
            int i3 = f7853e + 81;
            f7854g = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(dVar, "");
            Completable completableC = this.f7856b.g().c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.d(dVar, 0L, this.f7855a.getAbsolutePath(), this.f7857c, this.f7858d, true, false, 33));
            int i5 = f7853e + 111;
            f7854g = i5 % 128;
            if (i5 % 2 != 0) {
                return completableC;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(DelayedOnboardingDatabase delayedOnboardingDatabase, File file, DocumentType documentType, String str) {
            super(1);
            this.f7856b = delayedOnboardingDatabase;
            this.f7855a = file;
            this.f7857c = documentType;
            this.f7858d = str;
        }
    }

    public static final CompletableSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7833d + 59;
        f7831a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7833d + 1;
        f7831a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return completableSource;
    }

    public final Completable b(long j2, File file, DocumentType documentType, String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(documentType, "");
        Intrinsics.checkNotNullParameter(str, "");
        DelayedOnboardingDatabase delayedOnboardingDatabase = this.f7834e;
        Single<Long> singleC = delayedOnboardingDatabase.b().c(j2);
        final b bVar = new b(delayedOnboardingDatabase);
        Maybe<R> maybeFlatMapMaybe = singleC.flatMapMaybe(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.e.c$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.a(bVar, obj);
            }
        });
        final e eVar = new e(delayedOnboardingDatabase);
        Maybe maybeFlatMap = maybeFlatMapMaybe.flatMap(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.e.c$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.c(eVar, obj);
            }
        });
        final g gVar = new g(delayedOnboardingDatabase, file, documentType, str);
        Completable completableFlatMapCompletable = maybeFlatMap.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.e.c$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.d(gVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f7831a + 39;
        f7833d = i3 % 128;
        int i4 = i3 % 2;
        return completableFlatMapCompletable;
    }

    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> c(long j2) {
        int i2 = 2 % 2;
        int i3 = f7831a + 85;
        f7833d = i3 % 128;
        int i4 = i3 % 2;
        f fVarG = this.f7834e.g();
        if (i4 == 0) {
            return fVarG.b(j2);
        }
        fVarG.b(j2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Completable c(long j2, DocumentType documentType, bw bwVar) throws Throwable {
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.c cVar;
        String message;
        String simpleName;
        Intrinsics.checkNotNullParameter(bwVar, "");
        if (bwVar.a() != null) {
            Pair<ResponseSuccess, IResponseDocumentScan> pairA = bwVar.a();
            ResponseSuccess responseSuccessComponent1 = pairA.component1();
            IResponseDocumentScan iResponseDocumentScanComponent2 = pairA.component2();
            Map<String, String> mapEmptyMap = MapsKt.emptyMap();
            Map mapEmptyMap2 = MapsKt.emptyMap();
            if (!responseSuccessComponent1.isSuccess()) {
                simpleName = Reflection.getOrCreateKotlinClass(com.incode.welcome_sdk.data.remote.b.d.class).getSimpleName();
            } else {
                int i2 = documentType == null ? -1 : a.f7835a[documentType.ordinal()];
                if (i2 == 1) {
                    Intrinsics.checkNotNull(iResponseDocumentScanComponent2, "");
                    ResponseOCRData responseOCRData = (ResponseOCRData) iResponseDocumentScanComponent2;
                    mapEmptyMap2 = (Map) e(DaggerIDTypeChooserComponent.d.b(), DaggerIDTypeChooserComponent.d.b(), new Object[]{responseOCRData}, 1991993631, DaggerIDTypeChooserComponent.d.b(), DaggerIDTypeChooserComponent.d.b(), -1991993629);
                    mapEmptyMap = a(responseOCRData);
                } else if (i2 == 2) {
                    Intrinsics.checkNotNull(iResponseDocumentScanComponent2, "");
                    mapEmptyMap = d((ResponseMedicalDoc) iResponseDocumentScanComponent2);
                } else {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                simpleName = "";
            }
            cVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.c(0L, j2, responseSuccessComponent1.isSuccess(), documentType, mapEmptyMap, mapEmptyMap2, simpleName);
        } else {
            Throwable thD = bwVar.d();
            if (thD == null || (message = thD.getMessage()) == null) {
                message = "";
            }
            cVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.c(j2, documentType, message);
        }
        Single<Long> singleA = this.f7834e.k().a(cVar);
        final i iVar = new i(j2);
        Completable completableFlatMapCompletable = singleA.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.e.c$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.e(iVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        return completableFlatMapCompletable;
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $11 + 15;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            char[] charArray = str2.toCharArray();
            int i5 = $10 + 101;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            obj = charArray;
        } else {
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        m mVar = new m();
        mVar.f2778b = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        mVar.f2779e = 0;
        while (mVar.f2779e < cArr.length) {
            int i7 = mVar.f2779e;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[mVar.f2779e]), mVar, mVar};
                Object objC = com.c.a.e.e.c(-1726804722);
                if (objC == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 18;
                    int i8 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 883;
                    byte b2 = (byte) ($$b & 7);
                    byte b3 = (byte) (b2 - 1);
                    objC = com.c.a.e.e.e(keyRepeatTimeout, iIndexOf, i8, -1719070857, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objC).invoke(null, objArr2)).longValue() ^ (f7832c ^ (-7382027491817826291L));
                Object[] objArr3 = {mVar, mVar};
                Object objC2 = com.c.a.e.e.c(1025650959);
                if (objC2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objC2 = com.c.a.e.e.e((char) (ImageFormat.getBitsPerPixel(0) + 1), 20 - View.MeasureSpec.getSize(0), 988 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1035481974, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        mVar.f2779e = 0;
        int i9 = $10 + 101;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        while (mVar.f2779e < cArr.length) {
            int i11 = $10 + 85;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr2[mVar.f2779e] = (char) jArr[mVar.f2779e];
                Object[] objArr4 = {mVar, mVar};
                Object objC3 = com.c.a.e.e.c(1025650959);
                if (objC3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objC3 = com.c.a.e.e.e((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 20 - View.MeasureSpec.getMode(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 988, 1035481974, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objC3).invoke(null, objArr4);
                int i12 = 3 / 0;
            } else {
                cArr2[mVar.f2779e] = (char) jArr[mVar.f2779e];
                Object[] objArr5 = {mVar, mVar};
                Object objC4 = com.c.a.e.e.c(1025650959);
                if (objC4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objC4 = com.c.a.e.e.e((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 20 - TextUtils.getOffsetBefore("", 0), Color.argb(0, 0, 0, 0) + 988, 1035481974, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objC4).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    static final class i extends Lambda implements Function1<Long, CompletableSource> {

        /* JADX INFO: renamed from: b */
        private static int f7859b = 0;

        /* JADX INFO: renamed from: d */
        private static int f7860d = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ long f7862e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7860d + 15;
            f7859b = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceE = e(l2);
            if (i4 != 0) {
                int i5 = 79 / 0;
            }
            int i6 = f7860d + 37;
            f7859b = i6 % 128;
            int i7 = i6 % 2;
            return completableSourceE;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.d.e.c$i$1 */
        static final class AnonymousClass1 extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d, CompletableSource> {

            /* JADX INFO: renamed from: a */
            private static int f7863a = 0;

            /* JADX INFO: renamed from: d */
            private static int f7864d = 1;

            private CompletableSource d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
                f fVarG;
                boolean z2;
                int i2;
                long j2;
                String str;
                DocumentType documentType;
                String str2;
                boolean z3;
                int i3 = 2 % 2;
                int i4 = f7864d + 99;
                f7863a = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(dVar, "");
                    fVarG = cVar.d().g();
                    z2 = false;
                    i2 = 115;
                    j2 = 1;
                    str = null;
                    documentType = null;
                    str2 = null;
                    z3 = true;
                } else {
                    Intrinsics.checkNotNullParameter(dVar, "");
                    fVarG = cVar.d().g();
                    z2 = true;
                    i2 = 31;
                    j2 = 0;
                    str = null;
                    documentType = null;
                    str2 = null;
                    z3 = false;
                }
                return fVarG.c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.d(dVar, j2, str, documentType, str2, z3, z2, i2));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
                int i2 = 2 % 2;
                int i3 = f7864d + 87;
                f7863a = i3 % 128;
                int i4 = i3 % 2;
                CompletableSource completableSourceD = d(dVar);
                int i5 = f7863a + 33;
                f7864d = i5 % 128;
                int i6 = i5 % 2;
                return completableSourceD;
            }

            AnonymousClass1() {
                super(1);
            }
        }

        public static final CompletableSource b(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f7859b + 85;
            f7860d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                return (CompletableSource) function1.invoke(obj);
            }
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }

        private CompletableSource e(Long l2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> maybeB = c.this.d().g().b(this.f7862e);
            final AnonymousClass1 anonymousClass1 = new Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d, CompletableSource>() { // from class: com.incode.welcome_sdk.data.local.a.d.e.c.i.1

                /* JADX INFO: renamed from: a */
                private static int f7863a = 0;

                /* JADX INFO: renamed from: d */
                private static int f7864d = 1;

                private CompletableSource d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
                    f fVarG;
                    boolean z2;
                    int i22;
                    long j2;
                    String str;
                    DocumentType documentType;
                    String str2;
                    boolean z3;
                    int i3 = 2 % 2;
                    int i4 = f7864d + 99;
                    f7863a = i4 % 128;
                    if (i4 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(dVar, "");
                        fVarG = cVar.d().g();
                        z2 = false;
                        i22 = 115;
                        j2 = 1;
                        str = null;
                        documentType = null;
                        str2 = null;
                        z3 = true;
                    } else {
                        Intrinsics.checkNotNullParameter(dVar, "");
                        fVarG = cVar.d().g();
                        z2 = true;
                        i22 = 31;
                        j2 = 0;
                        str = null;
                        documentType = null;
                        str2 = null;
                        z3 = false;
                    }
                    return fVarG.c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.d(dVar, j2, str, documentType, str2, z3, z2, i22));
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
                    int i22 = 2 % 2;
                    int i3 = f7864d + 87;
                    f7863a = i3 % 128;
                    int i4 = i3 % 2;
                    CompletableSource completableSourceD = d(dVar);
                    int i5 = f7863a + 33;
                    f7864d = i5 % 128;
                    int i6 = i5 % 2;
                    return completableSourceD;
                }

                AnonymousClass1() {
                    super(1);
                }
            };
            Completable completableFlatMapCompletable = maybeB.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.e.c$i$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return c.i.b(anonymousClass1, obj);
                }
            });
            int i3 = f7860d + 99;
            f7859b = i3 % 128;
            int i4 = i3 % 2;
            return completableFlatMapCompletable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j2) {
            super(1);
            this.f7862e = j2;
        }
    }

    public static final CompletableSource e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7831a + 79;
        f7833d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7833d + 47;
        f7831a = i5 % 128;
        int i6 = i5 % 2;
        return completableSource;
    }

    private static Map<String, String> d(ResponseMedicalDoc responseMedicalDoc) {
        int i2 = 2 % 2;
        int i3 = f7833d + 63;
        f7831a = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.to(Constants.MessagePayloadKeys.RAW_DATA, responseMedicalDoc.getRawData()), TuplesKt.to("member", responseMedicalDoc.getMember()), TuplesKt.to("memberId", responseMedicalDoc.getMemberId()), TuplesKt.to("provider", responseMedicalDoc.getProvider()), TuplesKt.to("copayEr", responseMedicalDoc.getCopayEr()), TuplesKt.to("copayOv", responseMedicalDoc.getCopayOv()), TuplesKt.to("rxBin", responseMedicalDoc.getRxBin()), TuplesKt.to("rxPcn", responseMedicalDoc.getRxPcn()));
        int i5 = f7831a + 121;
        f7833d = i5 % 128;
        int i6 = i5 % 2;
        return mapMapOf;
    }

    private static Map<String, String> a(ResponseOCRData responseOCRData) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7833d + 75;
        f7831a = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f("鿺㨢푅湾ࢊꊹ糆", View.combineMeasuredStates(0, 0) + 42461, objArr);
        Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.to("birthDate", responseOCRData.getBirthDate()), TuplesKt.to("fullName", responseOCRData.getFullName()), TuplesKt.to("firstName", responseOCRData.getFirstName()), TuplesKt.to("middleName", responseOCRData.getMiddleName()), TuplesKt.to("lastName", responseOCRData.getLastName()), TuplesKt.to(((String) objArr[0]).intern(), responseOCRData.getAddress()), TuplesKt.to(HintConstants.AUTOFILL_HINT_GENDER, responseOCRData.getGender()), TuplesKt.to("registrationDate", String.valueOf(responseOCRData.getRegistrationDate())), TuplesKt.to("issueDate", String.valueOf(responseOCRData.getIssueDate())), TuplesKt.to("expirationDate", String.valueOf(responseOCRData.getExpirationDate())), TuplesKt.to("claveDeElector", responseOCRData.getClaveDeElector()), TuplesKt.to("curp", responseOCRData.getCurp()), TuplesKt.to("numeroEmisionCredencial", responseOCRData.getNumeroEmisionCredencial()), TuplesKt.to("cic", responseOCRData.getCic()), TuplesKt.to(OptionalModuleUtils.OCR, responseOCRData.getOcr()), TuplesKt.to("notExtracted", String.valueOf(responseOCRData.getNotExtracted())), TuplesKt.to("issuingCountry", responseOCRData.getIssuingCountry()), TuplesKt.to("street", responseOCRData.getAddressFields().c()), TuplesKt.to("colony", responseOCRData.getAddressFields().e()), TuplesKt.to(HintConstants.AUTOFILL_HINT_POSTAL_CODE, responseOCRData.getAddressFields().d()), TuplesKt.to(Geo.JsonKeys.CITY, responseOCRData.getAddressFields().a()), TuplesKt.to(SentryThread.JsonKeys.STATE, responseOCRData.getAddressFields().b()), TuplesKt.to("streetFromStatement", responseOCRData.getAddressFieldsFromStatement().c()), TuplesKt.to("colonyFromStatement", responseOCRData.getAddressFieldsFromStatement().e()), TuplesKt.to("postalCodeFromStatement", responseOCRData.getAddressFieldsFromStatement().d()), TuplesKt.to("cityFromStatement", responseOCRData.getAddressFieldsFromStatement().a()), TuplesKt.to("stateFromStatement", responseOCRData.getAddressFieldsFromStatement().b()));
        int i5 = f7833d + 69;
        f7831a = i5 % 128;
        int i6 = i5 % 2;
        return mapMapOf;
    }

    private final Single<String> c(String str) {
        int i2 = 2 % 2;
        int i3 = f7831a + 71;
        f7833d = i3 % 128;
        int i4 = i3 % 2;
        Single<String> single = this.f7834e.c().e(str).toSingle();
        Intrinsics.checkNotNullExpressionValue(single, "");
        int i5 = f7833d + 65;
        f7831a = i5 % 128;
        int i6 = i5 % 2;
        return single;
    }

    private final Completable c(j jVar) {
        int i2 = 2 % 2;
        int i3 = f7831a + 1;
        f7833d = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7834e.d().c(jVar);
            throw null;
        }
        Completable completableC = this.f7834e.d().c(jVar);
        int i4 = f7833d + 87;
        f7831a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return completableC;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f7833d = 0;
        f7831a = 1;
        f7832c = -8594475251175569514L;
    }

    public static final /* synthetic */ Completable b(c cVar, j jVar) {
        return (Completable) e(DaggerIDTypeChooserComponent.d.b(), DaggerIDTypeChooserComponent.d.b(), new Object[]{cVar, jVar}, -153932983, DaggerIDTypeChooserComponent.d.b(), DaggerIDTypeChooserComponent.d.b(), 153932983);
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7835a;

        /* JADX INFO: renamed from: c */
        private static int f7836c = 1;

        /* JADX INFO: renamed from: e */
        private static int f7837e = 0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.ADDRESS_STATEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.MEDICAL_DOC.ordinal()] = 2;
                int i2 = f7836c + 69;
                f7837e = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7835a = iArr;
            int i5 = f7836c + 121;
            f7837e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 57 / 0;
            }
        }
    }

    public static final MaybeSource c(Function1 function1, Object obj) {
        return (MaybeSource) e(DaggerIDTypeChooserComponent.d.b(), DaggerIDTypeChooserComponent.d.b(), new Object[]{function1, obj}, 1432404533, DaggerIDTypeChooserComponent.d.b(), DaggerIDTypeChooserComponent.d.b(), -1432404532);
    }

    private static Map<String, String> d(ResponseOCRData responseOCRData) {
        int iB = DaggerIDTypeChooserComponent.d.b();
        return (Map) e(DaggerIDTypeChooserComponent.d.b(), DaggerIDTypeChooserComponent.d.b(), new Object[]{responseOCRData}, 1991993631, DaggerIDTypeChooserComponent.d.b(), iB, -1991993629);
    }
}
