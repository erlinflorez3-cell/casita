package com.incode.welcome_sdk.ui.camera.videostreaming;

import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.n;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.modules.Modules;
import com.opentok.android.OpentokError;
import com.opentok.android.Publisher;
import com.opentok.android.PublisherKit;
import com.opentok.android.Stream;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class PublisherWrapper implements PublisherKit.PublisherListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f12738g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f12739h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OpenTokSessionWrapper f12740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BehaviorSubject<Unit> f12741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BehaviorSubject<Boolean> f12742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final VideoStreamingManager f12743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Publisher f12744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BehaviorSubject<Unit> f12745f;

    public PublisherWrapper(VideoStreamingManager videoStreamingManager, Publisher publisher, OpenTokSessionWrapper openTokSessionWrapper) {
        Intrinsics.checkNotNullParameter(videoStreamingManager, "");
        Intrinsics.checkNotNullParameter(publisher, "");
        Intrinsics.checkNotNullParameter(openTokSessionWrapper, "");
        this.f12743d = videoStreamingManager;
        this.f12744e = publisher;
        this.f12740a = openTokSessionWrapper;
        BehaviorSubject<Boolean> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "");
        this.f12742c = behaviorSubjectCreate;
        BehaviorSubject<Unit> behaviorSubjectCreate2 = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate2, "");
        this.f12741b = behaviorSubjectCreate2;
        BehaviorSubject<Unit> behaviorSubjectCreate3 = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate3, "");
        this.f12745f = behaviorSubjectCreate3;
        final Function1<Boolean, ObservableSource<? extends Boolean>> function1 = new Function1<Boolean, ObservableSource<? extends Boolean>>() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper.4

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f12751a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f12752b = 0;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ ObservableSource<? extends Boolean> invoke(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = f12752b + 47;
                f12751a = i3 % 128;
                Boolean bool2 = bool;
                if (i3 % 2 == 0) {
                    e(bool2);
                    throw null;
                }
                ObservableSource<? extends Boolean> observableSourceE = e(bool2);
                int i4 = f12752b + 15;
                f12751a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 15 / 0;
                }
                return observableSourceE;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private io.reactivex.ObservableSource<? extends java.lang.Boolean> e(java.lang.Boolean r5) {
                /*
                    r4 = this;
                    r3 = 2
                    int r0 = r3 % r3
                    int r0 = com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper.AnonymousClass4.f12752b
                    int r1 = r0 + 115
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper.AnonymousClass4.f12751a = r0
                    int r1 = r1 % r3
                    java.lang.String r0 = ""
                    if (r1 != 0) goto L3f
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    boolean r1 = r5.booleanValue()
                    r0 = 78
                    int r0 = r0 / 0
                    if (r1 == 0) goto L49
                L1d:
                    com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper r0 = com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper.this
                    io.reactivex.Completable r0 = com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper.access$startRecordingApiCall(r0)
                    io.reactivex.Completable r1 = r0.onErrorComplete()
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    io.reactivex.Observable r0 = io.reactivex.Observable.just(r0)
                    io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0
                    io.reactivex.Observable r2 = r1.andThen(r0)
                L33:
                    io.reactivex.ObservableSource r2 = (io.reactivex.ObservableSource) r2
                    int r0 = com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper.AnonymousClass4.f12752b
                    int r1 = r0 + 51
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper.AnonymousClass4.f12751a = r0
                    int r1 = r1 % r3
                    return r2
                L3f:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    boolean r0 = r5.booleanValue()
                    if (r0 == 0) goto L49
                    goto L1d
                L49:
                    com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper r0 = com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper.this
                    io.reactivex.Completable r0 = com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper.access$stopRecordingApiCall(r0)
                    io.reactivex.Completable r1 = r0.onErrorComplete()
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    io.reactivex.Observable r0 = io.reactivex.Observable.just(r0)
                    io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0
                    io.reactivex.Observable r2 = r1.andThen(r0)
                    goto L33
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper.AnonymousClass4.e(java.lang.Boolean):io.reactivex.ObservableSource");
            }

            {
                super(1);
            }
        };
        Observable observableSubscribeOn = behaviorSubjectCreate.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return PublisherWrapper.d(function1, obj);
            }
        }).subscribeOn(Schedulers.io());
        final AnonymousClass2 anonymousClass2 = new Function1<Boolean, Boolean>() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f12746a = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f12748c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f12749d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f12750e = 0;

            private static Boolean d(Boolean bool) {
                boolean z2;
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(bool, "");
                if (bool.booleanValue()) {
                    z2 = false;
                } else {
                    int i3 = f12748c;
                    int i4 = i3 + 51;
                    f12750e = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 99;
                    f12750e = i6 % 128;
                    int i7 = i6 % 2;
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Boolean invoke(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = f12750e + 43;
                f12748c = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolD = d(bool);
                if (i4 == 0) {
                    int i5 = 16 / 0;
                }
                return boolD;
            }

            static {
                int i2 = f12746a + 111;
                f12749d = i2 % 128;
                int i3 = i2 % 2;
            }
        };
        observableSubscribeOn.takeUntil(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return PublisherWrapper.c(anonymousClass2, obj);
            }
        }).subscribe();
        publisher.setPublisherListener(this);
    }

    public static final /* synthetic */ OpenTokSessionWrapper access$getOpenTokSessionWrapper$p(PublisherWrapper publisherWrapper) {
        int i2 = 2 % 2;
        int i3 = f12738g;
        int i4 = i3 + 55;
        f12739h = i4 % 128;
        int i5 = i4 % 2;
        OpenTokSessionWrapper openTokSessionWrapper = publisherWrapper.f12740a;
        int i6 = i3 + 53;
        f12739h = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 95 / 0;
        }
        return openTokSessionWrapper;
    }

    public static final /* synthetic */ BehaviorSubject access$getStopStreamApiCalledSubject$p(PublisherWrapper publisherWrapper) {
        int i2 = 2 % 2;
        int i3 = f12739h + 21;
        int i4 = i3 % 128;
        f12738g = i4;
        int i5 = i3 % 2;
        BehaviorSubject<Unit> behaviorSubject = publisherWrapper.f12745f;
        int i6 = i4 + 123;
        f12739h = i6 % 128;
        if (i6 % 2 == 0) {
            return behaviorSubject;
        }
        throw null;
    }

    public static final /* synthetic */ Completable access$startRecordingApiCall(PublisherWrapper publisherWrapper) {
        int i2 = 2 % 2;
        int i3 = f12738g + 107;
        f12739h = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            publisherWrapper.d();
            throw null;
        }
        Completable completableD = publisherWrapper.d();
        int i4 = f12739h + 11;
        f12738g = i4 % 128;
        if (i4 % 2 != 0) {
            return completableD;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Completable access$stopRecordingApiCall(PublisherWrapper publisherWrapper) {
        int i2 = 2 % 2;
        int i3 = f12739h + 23;
        f12738g = i3 % 128;
        int i4 = i3 % 2;
        Completable completableB = publisherWrapper.b();
        int i5 = f12738g + 31;
        f12739h = i5 % 128;
        if (i5 % 2 == 0) {
            return completableB;
        }
        throw null;
    }

    public final VideoStreamingManager getVideoStreamingManager() {
        int i2 = 2 % 2;
        int i3 = f12739h;
        int i4 = i3 + 55;
        f12738g = i4 % 128;
        int i5 = i4 % 2;
        VideoStreamingManager videoStreamingManager = this.f12743d;
        int i6 = i3 + 3;
        f12738g = i6 % 128;
        int i7 = i6 % 2;
        return videoStreamingManager;
    }

    public final Publisher getPublisher() {
        int i2 = 2 % 2;
        int i3 = f12738g;
        int i4 = i3 + 13;
        f12739h = i4 % 128;
        int i5 = i4 % 2;
        Publisher publisher = this.f12744e;
        int i6 = i3 + 103;
        f12739h = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 36 / 0;
        }
        return publisher;
    }

    public final Completable getStartStreamApiCalledCompletable() {
        int i2 = 2 % 2;
        int i3 = f12738g + 75;
        f12739h = i3 % 128;
        int i4 = i3 % 2;
        Completable completableIgnoreElements = this.f12741b.hide().ignoreElements();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "");
        int i5 = f12739h + 75;
        f12738g = i5 % 128;
        if (i5 % 2 != 0) {
            return completableIgnoreElements;
        }
        throw null;
    }

    public final Completable getStopStreamApiCalledCompletable() {
        int i2 = 2 % 2;
        int i3 = f12739h + 51;
        f12738g = i3 % 128;
        int i4 = i3 % 2;
        Completable completableIgnoreElements = this.f12745f.hide().ignoreElements();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "");
        int i5 = f12738g + 51;
        f12739h = i5 % 128;
        int i6 = i5 % 2;
        return completableIgnoreElements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12738g + 61;
        f12739h = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (ObservableSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        int i4 = 59 / 0;
        return (ObservableSource) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12739h + 121;
        f12738g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i5 = f12738g + 87;
        f12739h = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    static final class d extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12757c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12758e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12757c + 113;
            f12758e = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12757c + 53;
            f12758e = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th, "Error starting streaming for module: " + PublisherWrapper.access$getOpenTokSessionWrapper$p(PublisherWrapper.this).getModule(), new Object[0]);
            Intrinsics.checkNotNull(th);
            EventUtils.sendEvent(PublisherWrapper.this.getVideoStreamingManager().getRepository(), Event.ERROR, (Modules) null, n.a(th));
            int i5 = f12757c + 111;
            f12758e = i5 % 128;
            int i6 = i5 % 2;
        }

        d() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12738g + 77;
        f12739h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12738g + 67;
        f12739h = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(PublisherWrapper publisherWrapper) {
        int i2 = 2 % 2;
        int i3 = f12739h + 83;
        f12738g = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(publisherWrapper, "");
            Timber.Forest.d("startStreamApiCalledSubject called.", new Object[0]);
        } else {
            Intrinsics.checkNotNullParameter(publisherWrapper, "");
            Timber.Forest.d("startStreamApiCalledSubject called.", new Object[0]);
        }
        publisherWrapper.f12741b.onComplete();
    }

    private final Completable d() {
        int i2 = 2 % 2;
        Completable completableSubscribeOn = this.f12743d.startOpenTokStreamRecording(this.f12740a.getVideoRecordingId(), this.f12740a.getModule()).subscribeOn(Schedulers.io());
        final d dVar = new d();
        Completable completableDoFinally = completableSubscribeOn.doOnError(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PublisherWrapper.e(dVar, obj);
            }
        }).doFinally(new Action() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Action
            public final void run() {
                PublisherWrapper.b(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoFinally, "");
        int i3 = f12739h + 67;
        f12738g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return completableDoFinally;
    }

    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12754a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12755e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f12754a + 115;
            f12755e = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            a();
            if (i4 == 0) {
                Unit unit = Unit.INSTANCE;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i5 = f12754a + 79;
            f12755e = i5 % 128;
            if (i5 % 2 != 0) {
                return unit2;
            }
            throw null;
        }

        private void a() {
            int i2 = 2 % 2;
            int i3 = f12755e + 51;
            f12754a = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.d("stopStreamApiCalledSubject called.", new Object[0]);
            PublisherWrapper.access$getStopStreamApiCalledSubject$p(PublisherWrapper.this).onComplete();
            int i5 = f12754a + 57;
            f12755e = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        b() {
            super(0);
        }
    }

    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12760c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12761d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12761d + 115;
            f12760c = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f12761d + 7;
            f12760c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 52 / 0;
            }
            return unit;
        }

        private void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12760c + 65;
            f12761d = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th, "Error stopping streaming for module: " + PublisherWrapper.access$getOpenTokSessionWrapper$p(PublisherWrapper.this).getModule(), new Object[0]);
            Intrinsics.checkNotNull(th);
            EventUtils.sendEvent(PublisherWrapper.this.getVideoStreamingManager().getRepository(), Event.ERROR, (Modules) null, n.a(th));
            int i5 = f12761d + 95;
            f12760c = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        e() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12739h + 33;
        f12738g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12738g + 55;
        f12739h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
    }

    private final Completable b() {
        int i2 = 2 % 2;
        Completable completableSubscribeOn = this.f12743d.stopOpenTokStreamRecording(this.f12740a.getVideoRecordingId(), new b()).subscribeOn(Schedulers.io());
        final e eVar = new e();
        Completable completableDoOnError = completableSubscribeOn.doOnError(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PublisherWrapper.a(eVar, obj);
            }
        });
        int i3 = f12739h + 57;
        f12738g = i3 % 128;
        if (i3 % 2 != 0) {
            return completableDoOnError;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onStreamCreated(PublisherKit publisherKit, Stream stream) {
        int i2 = 2 % 2;
        int i3 = f12738g + 43;
        f12739h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(publisherKit, "");
        Intrinsics.checkNotNullParameter(stream, "");
        Timber.Forest.d("Stream " + stream.getStreamId() + " created, videoWidth: " + stream.getVideoWidth() + ", videoHeight: " + stream.getVideoHeight(), new Object[0]);
        this.f12740a.getOpenTokEventListener().strStreamPublisherCreated(publisherKit.getSession(), stream);
        this.f12742c.onNext(Boolean.TRUE);
        int i5 = f12739h + 99;
        f12738g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void onStreamDestroyed(PublisherKit publisherKit, Stream stream) {
        int i2 = 2 % 2;
        int i3 = f12739h + 39;
        f12738g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(publisherKit, "");
        Intrinsics.checkNotNullParameter(stream, "");
        Timber.Forest.d("Stream " + stream.getStreamId() + " destroyed", new Object[0]);
        this.f12740a.getOpenTokEventListener().strStreamPublisherDestroyed(stream);
        this.f12742c.onNext(Boolean.FALSE);
        int i5 = f12739h + 111;
        f12738g = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onError(PublisherKit publisherKit, OpentokError opentokError) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(publisherKit, "");
        Intrinsics.checkNotNullParameter(opentokError, "");
        Exception exc = new Exception("OpenTok error occurred, error code: " + opentokError.getErrorCode());
        this.f12740a.getOpenTokEventListener().strStreamPublisherDidFailWithError(publisherKit.getSession(), publisherKit.getStream(), opentokError);
        this.f12742c.onComplete();
        Timber.Forest.e(exc);
        this.f12741b.onComplete();
        this.f12745f.onComplete();
        int i3 = f12739h + 9;
        f12738g = i3 % 128;
        int i4 = i3 % 2;
    }
}
