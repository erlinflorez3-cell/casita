package com.incode.welcome_sdk.commons;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.k;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.ReplaySubject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a */
    private static int f5298a = 0;

    /* JADX INFO: renamed from: b */
    private static int f5299b = 0;

    /* JADX INFO: renamed from: c */
    private static int f5300c = 1;

    /* JADX INFO: renamed from: d */
    public static final m f5301d = new m();

    /* JADX INFO: renamed from: e */
    private static ReplaySubject<k> f5302e = null;

    /* JADX INFO: renamed from: h */
    private static int f5303h = 1;

    private m() {
    }

    public static final /* synthetic */ ReplaySubject c() {
        int i2 = 2 % 2;
        int i3 = f5298a + 81;
        int i4 = i3 % 128;
        f5300c = i4;
        int i5 = i3 % 2;
        ReplaySubject<k> replaySubject = f5302e;
        int i6 = i4 + 85;
        f5298a = i6 % 128;
        if (i6 % 2 == 0) {
            return replaySubject;
        }
        throw null;
    }

    static {
        ReplaySubject<k> replaySubjectCreate = ReplaySubject.create();
        Intrinsics.checkNotNullExpressionValue(replaySubjectCreate, "");
        f5302e = replaySubjectCreate;
        int i2 = f5299b + 61;
        f5303h = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void a() {
        int i2 = 2 % 2;
        int i3 = f5300c + 111;
        f5298a = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.Forest.d("Clear called.", new Object[1]);
        } else {
            Timber.Forest.d("Clear called.", new Object[0]);
        }
        f5302e.onComplete();
        ReplaySubject<k> replaySubjectCreate = ReplaySubject.create();
        Intrinsics.checkNotNullExpressionValue(replaySubjectCreate, "");
        f5302e = replaySubjectCreate;
        int i4 = f5300c + 17;
        f5298a = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Completable e(List list) {
        int i2 = 2 % 2;
        int i3 = f5298a + 125;
        f5300c = i3 % 128;
        int i4 = i3 % 2;
        Scheduler schedulerIo = Schedulers.io();
        Intrinsics.checkNotNullExpressionValue(schedulerIo, "");
        Completable completableB = b(list, schedulerIo);
        int i5 = f5300c + 17;
        f5298a = i5 % 128;
        int i6 = i5 % 2;
        return completableB;
    }

    static final class e extends Lambda implements Function1<Boolean, CompletableSource> {

        /* JADX INFO: renamed from: b */
        private static int f5309b = 1;

        /* JADX INFO: renamed from: d */
        private static int f5310d = 0;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ com.incode.welcome_sdk.modules.g f5311e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f5310d + 47;
            f5309b = i3 % 128;
            Boolean bool2 = bool;
            if (i3 % 2 != 0) {
                return d(bool2);
            }
            d(bool2);
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        
            if (r8.booleanValue() != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        
            timber.log.Timber.Forest.d("Waiting for upload to start for module: " + r7.f5311e, new java.lang.Object[0]);
            r2 = com.incode.welcome_sdk.commons.m.c().contains(new com.incode.welcome_sdk.commons.k.d(r7.f5311e));
            r1 = new com.incode.welcome_sdk.commons.m.e.AnonymousClass5();
            r2 = r2.doOnSuccess(new com.incode.welcome_sdk.commons.m$e$$ExternalSyntheticLambda0(r1)).ignoreElement().onErrorComplete();
            r1 = com.incode.welcome_sdk.commons.m.e.f5309b + 43;
            com.incode.welcome_sdk.commons.m.e.f5310d = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
        
            if (r8.booleanValue() != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
        
            r2 = io.reactivex.Completable.complete();
            r1 = com.incode.welcome_sdk.commons.m.e.f5309b + 65;
            com.incode.welcome_sdk.commons.m.e.f5310d = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
        
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private io.reactivex.CompletableSource d(java.lang.Boolean r8) {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.m.e.d(java.lang.Boolean):io.reactivex.CompletableSource");
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.m$e$5 */
        static final class AnonymousClass5 extends Lambda implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: a */
            private static int f5312a = 0;

            /* JADX INFO: renamed from: b */
            private static int f5313b = 1;

            private void d() {
                int i2 = 2 % 2;
                int i3 = f5313b + 69;
                f5312a = i3 % 128;
                int i4 = i3 % 2;
                Timber.Forest.d("Video recording upload started for: " + gVar, new Object[0]);
                int i5 = f5312a + 99;
                f5313b = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = f5312a + 107;
                f5313b = i3 % 128;
                int i4 = i3 % 2;
                d();
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    throw null;
                }
                int i5 = f5312a + 57;
                f5313b = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            AnonymousClass5() {
                super(1);
            }
        }

        public static final void d(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f5309b + 93;
            f5310d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i5 = f5309b + 107;
            f5310d = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.incode.welcome_sdk.modules.g gVar) {
            super(1);
            this.f5311e = gVar;
        }
    }

    public static final CompletableSource c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5300c + 61;
        f5298a = i3 % 128;
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
        int i4 = f5300c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f5298a = i4 % 128;
        if (i4 % 2 == 0) {
            return completableSource;
        }
        obj2.hashCode();
        throw null;
    }

    private static Completable b(List<? extends com.incode.welcome_sdk.modules.g> list, Scheduler scheduler) {
        int i2 = 2 % 2;
        int i3 = f5300c + 87;
        f5298a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(scheduler, "");
        if (!f5302e.hasValue()) {
            int i5 = f5298a + 81;
            f5300c = i5 % 128;
            if (i5 % 2 == 0) {
                Timber.Forest.d("No pending video recording. Exit early.", new Object[1]);
            } else {
                Timber.Forest.d("No pending video recording. Exit early.", new Object[0]);
            }
            Completable completableComplete = Completable.complete();
            Intrinsics.checkNotNullExpressionValue(completableComplete, "");
            return completableComplete;
        }
        List<? extends com.incode.welcome_sdk.modules.g> list2 = list;
        Timber.Forest.d("awaitVideoUploadForModule called for: " + CollectionsKt.joinToString$default(list2, null, null, null, 0, null, null, 63, null), new Object[0]);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.incode.welcome_sdk.modules.g gVar : list2) {
            Object[] values = f5302e.getValues();
            Intrinsics.checkNotNullExpressionValue(values, "");
            Single singleJust = Single.just(Boolean.valueOf(ArraysKt.contains((k.e[]) values, new k.e(gVar))));
            final e eVar = new e(gVar);
            arrayList.add(singleJust.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.commons.m$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return m.c(eVar, obj);
                }
            }));
        }
        Completable completableTimeout = Completable.merge(arrayList).timeout(5L, TimeUnit.SECONDS, scheduler);
        final a aVar = a.f5307d;
        Completable completableOnErrorComplete = completableTimeout.doOnError(new Consumer() { // from class: com.incode.welcome_sdk.commons.m$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                m.d(aVar, obj);
            }
        }).onErrorComplete();
        Intrinsics.checkNotNullExpressionValue(completableOnErrorComplete, "");
        int i6 = f5300c + 53;
        f5298a = i6 % 128;
        int i7 = i6 % 2;
        return completableOnErrorComplete;
    }

    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f5304a = 0;

        /* JADX INFO: renamed from: b */
        private static int f5305b = 0;

        /* JADX INFO: renamed from: c */
        private static int f5306c = 1;

        /* JADX INFO: renamed from: d */
        public static final a f5307d = new a();

        /* JADX INFO: renamed from: e */
        private static int f5308e = 1;

        private static void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f5308e + 5;
            f5305b = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest.e(th, "Error while awaiting for upload start status.", new Object[0]);
            } else {
                Timber.Forest.e(th, "Error while awaiting for upload start status.", new Object[0]);
            }
            int i4 = f5305b + 49;
            f5308e = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f5305b + 125;
            f5308e = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f5308e + 83;
            f5305b = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f5304a + 73;
            f5306c = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        a() {
            super(1);
        }
    }

    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5300c + 107;
        f5298a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f5300c + 51;
        f5298a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @JvmStatic
    public static final void b(k kVar) {
        int i2 = 2 % 2;
        int i3 = f5300c + 117;
        f5298a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(kVar, "");
            Timber.Forest.d("publishVideoRecordingStatus: " + kVar, new Object[1]);
        } else {
            Intrinsics.checkNotNullParameter(kVar, "");
            Timber.Forest.d("publishVideoRecordingStatus: " + kVar, new Object[0]);
        }
        f5302e.onNext(kVar);
    }
}
