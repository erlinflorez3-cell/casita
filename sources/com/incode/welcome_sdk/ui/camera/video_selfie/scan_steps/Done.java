package com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.ReplaySubject;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class Done extends IScanStep<Void, Void> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f12256f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f12257g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CompositeDisposable f12258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ReplaySubject<Object> f12260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final VideoRecordingContract.View f12262e;

    public Done(VideoRecordingContract.View view, boolean z2, boolean z3, int i2) {
        super(i2, view);
        this.f12261d = 30;
        this.f12258a = new CompositeDisposable();
        this.f12260c = ReplaySubject.create();
        this.f12259b = false;
        int i3 = z2 ? 30 : 0;
        this.f12262e = view;
        CompositeDisposable compositeDisposable = this.f12258a;
        Observable<Long> observableObserveOn = Observable.timer(i3, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        Consumer<? super Long> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Done$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.c((Long) obj);
            }
        };
        Objects.requireNonNull(view);
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Done$$ExternalSyntheticLambda1(view)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12256f + 53;
        f12257g = i3 % 128;
        int i4 = i3 % 2;
        this.f12260c.onNext(l2);
        int i5 = f12256f + 7;
        f12257g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean isSkipped() {
        int i2 = 2 % 2;
        int i3 = f12256f;
        int i4 = i3 + 57;
        f12257g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f12259b;
        int i5 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12257g = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Object obj) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12257g;
        int i4 = i3 + 87;
        f12256f = i4 % 128;
        int i5 = i4 % 2;
        this.f12259b = true;
        int i6 = i3 + 81;
        f12256f = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 63 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void start() {
        int i2 = 2 % 2;
        int i3 = f12257g + 91;
        f12256f = i3 % 128;
        if (i3 % 2 != 0) {
            CompositeDisposable compositeDisposable = this.f12258a;
            Observable<Object> observableObserveOn = this.f12260c.observeOn(AndroidSchedulers.mainThread());
            Consumer<? super Object> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Done$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b(obj);
                }
            };
            VideoRecordingContract.View view = this.f12262e;
            Objects.requireNonNull(view);
            compositeDisposable.add(observableObserveOn.subscribe(consumer, new Done$$ExternalSyntheticLambda1(view)));
            this.f12260c.hasValue();
            throw null;
        }
        CompositeDisposable compositeDisposable2 = this.f12258a;
        Observable<Object> observableObserveOn2 = this.f12260c.observeOn(AndroidSchedulers.mainThread());
        Consumer<? super Object> consumer2 = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Done$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b(obj);
            }
        };
        VideoRecordingContract.View view2 = this.f12262e;
        Objects.requireNonNull(view2);
        compositeDisposable2.add(observableObserveOn2.subscribe(consumer2, new Done$$ExternalSyntheticLambda1(view2)));
        if (!this.f12260c.hasValue()) {
            int i4 = f12257g + 79;
            f12256f = i4 % 128;
            int i5 = i4 % 2;
            this.f12262e.setTapToAnswerLayoutVisible(true);
            this.f12262e.setBackgroundFullscreenOverlayVisible(true);
            this.f12262e.showProcessingUi();
        }
        int i6 = f12256f + 67;
        f12257g = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean processesFrames() {
        int i2 = 2 % 2;
        int i3 = f12256f;
        int i4 = i3 + 93;
        f12257g = i4 % 128;
        boolean z2 = i4 % 2 == 0;
        int i5 = i3 + 113;
        f12257g = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean isComplete() {
        int i2 = 2 % 2;
        int i3 = f12256f + 99;
        int i4 = i3 % 128;
        f12257g = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f12259b;
        int i5 = i4 + 59;
        f12256f = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void showWinState() {
        int i2 = 2 % 2;
        int i3 = f12257g + 1;
        f12256f = i3 % 128;
        int i4 = i3 % 2;
        this.f12262e.showAllDone();
        int i5 = f12257g + 9;
        f12256f = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void cleanup(Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f12257g + 15;
        f12256f = i3 % 128;
        if (i3 % 2 == 0) {
            this.f12258a.clear();
            runnable.run();
            int i4 = f12256f + 75;
            f12257g = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.f12258a.clear();
        runnable.run();
        throw null;
    }
}
