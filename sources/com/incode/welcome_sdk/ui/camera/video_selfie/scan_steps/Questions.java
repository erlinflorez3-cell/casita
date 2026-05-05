package com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.VideoSelfieLocalQuestion;
import com.incode.welcome_sdk.data.remote.beans.bk;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.ReplaySubject;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class Questions extends IScanStep<Void, Void> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f12373l = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f12374n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompositeDisposable f12375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final VideoRecordingContract.View f12377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IncodeWelcomeRepository f12378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<bk> f12379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<VideoSelfieLocalQuestion> f12380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f12382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ReplaySubject<List<bk>> f12383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12384j;

    public Questions(VideoRecordingContract.View view, IncodeWelcomeRepository incodeWelcomeRepository, ReplaySubject<List<bk>> replaySubject, int i2) {
        super(i2, view);
        this.f12375a = new CompositeDisposable();
        this.f12376b = 0;
        this.f12381g = false;
        this.f12384j = false;
        this.f12382h = IncodeWelcome.getInstance().isCaptureOnlyMode();
        this.f12377c = view;
        this.f12378d = incodeWelcomeRepository;
        this.f12383i = replaySubject;
    }

    public Questions(VideoRecordingContract.View view, IncodeWelcomeRepository incodeWelcomeRepository, List<VideoSelfieLocalQuestion> list, int i2) {
        super(i2, view);
        this.f12375a = new CompositeDisposable();
        this.f12376b = 0;
        this.f12381g = false;
        this.f12384j = false;
        this.f12382h = IncodeWelcome.getInstance().isCaptureOnlyMode();
        this.f12377c = view;
        this.f12378d = incodeWelcomeRepository;
        this.f12380f = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(List list) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12373l + 89;
        f12374n = i3 % 128;
        int i4 = i3 % 2;
        this.f12379e = list;
        this.f12377c.hideProcessingUI();
        e();
        int i5 = f12374n + 55;
        f12373l = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void start() {
        int i2 = 2 % 2;
        int i3 = f12374n + 83;
        f12373l = i3 % 128;
        int i4 = i3 % 2;
        this.f12377c.startVideoSelfieProgressStep(VideoSelfieScanState.f12203i);
        EventUtils.sendScreenOpened(this.f12378d, ScreenName.VIDEO_SELFIE_VOICE_QUESTION_X, Modules.VIDEO_ONBOARDING);
        this.f12377c.setBackgroundFullscreenOverlayVisible(true);
        this.f12377c.playWaveformAnimation(true);
        this.f12377c.setTapToAnswerLayoutVisible(true);
        this.f12377c.setTapToAnswerButtonText(R.string.onboard_sdk_video_selfie_tap_to_answer);
        if (this.f12382h) {
            int i5 = f12373l + 37;
            f12374n = i5 % 128;
            int i6 = i5 % 2;
            e();
            int i7 = f12373l + 115;
            f12374n = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.f12383i.hasValue()) {
            int i8 = f12373l + 77;
            f12374n = i8 % 128;
            int i9 = i8 % 2;
            this.f12377c.showProcessingUi();
        }
        CompositeDisposable compositeDisposable = this.f12375a;
        Observable<List<bk>> observableObserveOn = this.f12383i.observeOn(AndroidSchedulers.mainThread());
        Consumer<? super List<bk>> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                this.f$0.d((List) obj2);
            }
        };
        VideoRecordingContract.View view = this.f12377c;
        Objects.requireNonNull(view);
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Done$$ExternalSyntheticLambda1(view)));
    }

    private void e() {
        int i2 = 2 % 2;
        int i3 = f12374n + 43;
        f12373l = i3 % 128;
        int i4 = i3 % 2;
        this.f12377c.setTapToAnswerContentVisible(true);
        onContinueClicked();
        int i5 = f12374n + 53;
        f12373l = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void onContinueClicked() {
        int i2 = 2 % 2;
        int i3 = f12374n + 75;
        f12373l = i3 % 128;
        if (i3 % 2 != 0) {
            g();
            if (this.f12381g) {
                this.f12381g = false;
                this.f12376b++;
                b();
                return;
            }
            if (this.f12382h) {
                int i4 = f12373l + 13;
                f12374n = i4 % 128;
                int i5 = i4 % 2;
                d();
            } else {
                c();
            }
            this.f12381g = true;
            a();
            return;
        }
        g();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void d() {
        int i2 = 2 % 2;
        int i3 = f12373l + 5;
        f12374n = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordingContract.View view = this.f12377c;
        String question = this.f12380f.get(this.f12376b).getQuestion();
        boolean z2 = true;
        if (this.f12376b != this.f12380f.size() - 1) {
            int i5 = f12374n + 61;
            f12373l = i5 % 128;
            int i6 = i5 % 2;
            z2 = false;
        }
        view.showQuestion(question, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c() {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12374n
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12373l = r0
            int r1 = r1 % r6
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r5 = r7.f12377c
            java.util.List<com.incode.welcome_sdk.data.remote.beans.bk> r1 = r7.f12379e
            int r0 = r7.f12376b
            java.lang.Object r0 = r1.get(r0)
            com.incode.welcome_sdk.data.remote.beans.bk r0 = (com.incode.welcome_sdk.data.remote.beans.bk) r0
            java.lang.String r4 = r0.e()
            int r1 = r7.f12376b
            java.util.List<com.incode.welcome_sdk.data.remote.beans.bk> r0 = r7.f12379e
            int r0 = r0.size()
            r3 = 1
            int r0 = r0 - r3
            r2 = 0
            if (r1 != r0) goto L34
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12374n
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12373l = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L35
        L34:
            r3 = r2
        L35:
            r5.showQuestion(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.c():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r4.f12376b < r4.f12380f.size()) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12374n
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12373l = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L43
            r4.a()
            int r0 = r4.f12376b
            r4.d(r0)
            boolean r0 = r4.f12382h
            r2 = 1
            if (r0 == r2) goto L25
            int r1 = r4.f12376b
            java.util.List<com.incode.welcome_sdk.data.remote.beans.bk> r0 = r4.f12379e
            int r0 = r0.size()
            if (r1 < r0) goto L3f
        L25:
            boolean r0 = r4.f12382h
            if (r0 == r2) goto L2c
        L29:
            r4.f12384j = r2
            return
        L2c:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12373l
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12374n = r0
            int r1 = r1 % r3
            int r1 = r4.f12376b
            java.util.List<com.incode.welcome_sdk.data.local.VideoSelfieLocalQuestion> r0 = r4.f12380f
            int r0 = r0.size()
            if (r1 >= r0) goto L29
        L3f:
            r4.onContinueClicked()
            return
        L43:
            r4.a()
            int r0 = r4.f12376b
            r4.d(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12374n
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12373l = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 != 0) goto L5a
            boolean r1 = r4.f12382h
            r0 = 51
            int r0 = r0 / r2
            if (r1 != 0) goto L20
        L16:
            int r1 = r4.f12376b
            java.util.List<com.incode.welcome_sdk.data.remote.beans.bk> r0 = r4.f12379e
            int r0 = r0.size()
            if (r1 >= r0) goto L45
        L20:
            boolean r1 = r4.f12382h
            r0 = 1
            if (r1 == r0) goto L2f
        L25:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12374n
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12373l = r0
            int r1 = r1 % r3
            return
        L2f:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12373l
            int r1 = r0 + 95
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.f12374n = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L4f
            int r1 = r4.f12376b
            java.util.List<com.incode.welcome_sdk.data.local.VideoSelfieLocalQuestion> r0 = r4.f12380f
            int r0 = r0.size()
            int r2 = r2 / r2
            if (r1 < r0) goto L25
        L45:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r2 = r4.f12378d
            com.incode.welcome_sdk.ScreenName r1 = com.incode.welcome_sdk.ScreenName.VIDEO_SELFIE_VOICE_FINAL_QUESTION
            com.incode.welcome_sdk.modules.Modules r0 = com.incode.welcome_sdk.modules.Modules.VIDEO_ONBOARDING
            com.incode.welcome_sdk.commons.utils.EventUtils.sendScreenClosed(r2, r1, r0)
            goto L25
        L4f:
            int r1 = r4.f12376b
            java.util.List<com.incode.welcome_sdk.data.local.VideoSelfieLocalQuestion> r0 = r4.f12380f
            int r0 = r0.size()
            if (r1 < r0) goto L25
            goto L45
        L5a:
            boolean r0 = r4.f12382h
            if (r0 != 0) goto L20
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Questions.a():void");
    }

    private void g() {
        int i2 = 2 % 2;
        if (this.f12381g) {
            int i3 = f12374n + 69;
            f12373l = i3 % 128;
            int i4 = i3 % 2;
            if (this.f12382h || this.f12376b != this.f12379e.size() - 1) {
                if (!this.f12382h) {
                    return;
                }
                int i5 = f12374n + 5;
                f12373l = i5 % 128;
                int i6 = i5 % 2;
                if (this.f12376b != this.f12380f.size() - 1) {
                    return;
                }
            }
            EventUtils.sendScreenOpened(this.f12378d, ScreenName.VIDEO_SELFIE_VOICE_FINAL_QUESTION, Modules.VIDEO_ONBOARDING);
            int i7 = f12373l + 27;
            f12374n = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean processesFrames() {
        int i2 = 2 % 2;
        int i3 = f12374n + 21;
        int i4 = i3 % 128;
        f12373l = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 7;
        f12374n = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 73 / 0;
        }
        return false;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean isComplete() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f12373l + 27;
        int i4 = i3 % 128;
        f12374n = i4;
        if (i3 % 2 != 0) {
            z2 = this.f12384j;
            int i5 = 11 / 0;
        } else {
            z2 = this.f12384j;
        }
        int i6 = i4 + 61;
        f12373l = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void logServerEventSuccess(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f12374n + 47;
        f12373l = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void d(int i2) {
        int i3 = 2 % 2;
        int i4 = f12374n + 11;
        f12373l = i4 % 128;
        if (i4 % 2 != 0) {
            EventUtils.sendVideoSelfieQuestionAnsweredEvent(this.f12378d, i2);
            int i5 = f12373l + 45;
            f12374n = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        EventUtils.sendVideoSelfieQuestionAnsweredEvent(this.f12378d, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void showWinState() {
        int i2 = 2 % 2;
        int i3 = f12373l + 61;
        f12374n = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void cleanup(Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f12373l + 85;
        f12374n = i3 % 128;
        int i4 = i3 % 2;
        this.f12377c.finishVideoSelfieProgressStep(VideoSelfieScanState.f12203i);
        EventUtils.sendScreenClosed(this.f12378d, ScreenName.VIDEO_SELFIE_VOICE_QUESTION_X, Modules.VIDEO_ONBOARDING);
        this.f12377c.setTapToAnswerContentVisible(false);
        this.f12377c.playWaveformAnimation(false);
        this.f12375a.clear();
        runnable.run();
        int i5 = f12373l + 47;
        f12374n = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
