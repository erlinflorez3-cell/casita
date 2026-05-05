package com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps;

import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.c.a.e.e;
import com.c.a.i;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.RecogManager;
import com.incode.welcome_sdk.commons.c.c.b;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.ScaleDrawer;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.commons.utils.RecogKitUtils;
import com.incode.welcome_sdk.commons.utils.n;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.TemplateModel;
import com.incode.welcome_sdk.data.local.FaceInfo;
import com.incode.welcome_sdk.data.remote.beans.bf;
import com.incode.welcome_sdk.data.remote.beans.v;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.modules.VideoSelfie;
import com.incode.welcome_sdk.ui.camera.CameraPresenter;
import com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint;
import com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult;
import com.incode.welcome_sdk.ui.camera.video_selfie.Something;
import com.incode.welcome_sdk.ui.camera.video_selfie.UiState;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract;
import com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokEventListener;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class Selfie extends IScanStep<FaceProcessingUtils.DetectionData, FaceProcessingUtils.FaceProcessingState> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f12385p = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static char[] f12386r = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static boolean f12387u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f12388v = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static boolean f12389x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f12390y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IncodeWelcomeRepository f12391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f12392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecogManager f12393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final VideoRecordingContract.View f12394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CameraPresenter f12395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f12396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f12397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f12398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f12399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f12400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f12401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private FaceProcessingUtils.FaceProcessingState f12402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private v f12403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f12404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList<String> f12405o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f12406q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f12407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f12408t;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r0 = r7 * 50
            int r7 = 122 - r0
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r5 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.$$a
            int r0 = r8 * 2
            int r4 = 3 - r0
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r5 != 0) goto L29
            r0 = r6
            r1 = r2
        L15:
            int r0 = -r0
            int r7 = r7 + r0
        L17:
            int r4 = r4 + 1
            byte r0 = (byte) r7
            r3[r1] = r0
            if (r1 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L24:
            r0 = r5[r4]
            int r1 = r1 + 1
            goto L15
        L29:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.$$c(short, short, short):java.lang.String");
    }

    public static /* synthetic */ Object e(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = ~((~i7) | i4);
        int i12 = i10 | i11 | (~(i4 | i5));
        int i13 = (~(i5 | i7)) | (~(i8 | i7));
        int i14 = i9 | i11;
        int i15 = i7 + i4 + i2 + (793188503 * i3) + (2090109681 * i6);
        int i16 = i15 * i15;
        int i17 = (837707615 * i7) + 1286602752 + ((-1676358574) * i4) + (i12 * (-838022063)) + (1676044126 * i13) + ((-838022063) * i14) + ((-838336512) * i2) + (1186463744 * i3) + (1166540800 * i6) + ((-1956446208) * i16);
        int i18 = ((i7 * 1389925299) - 652765764) + (i4 * 1389927018) + (i12 * 573) + (i13 * (-1146)) + (i14 * 573) + (i2 * 1389926445) + (i3 * (-1551828341)) + (i6 * (-2047638435)) + (i16 * 1214709760);
        int i19 = i17 + (i18 * i18 * 445972480);
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? a(objArr) : c(objArr) : b(objArr) : e(objArr);
    }

    static void init$0() {
        $$a = new byte[]{110, 48, -111, -89};
        $$b = 133;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public /* bridge */ /* synthetic */ void addProcessingErrorState(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        int i3 = f12390y + 33;
        f12388v = i3 % 128;
        int i4 = i3 % 2;
        addProcessingErrorState2(faceProcessingState);
        if (i4 == 0) {
            int i5 = 87 / 0;
        }
        int i6 = f12390y + 97;
        f12388v = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public /* synthetic */ void showRealtimeFeedback(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        int i3 = f12388v + 33;
        f12390y = i3 % 128;
        int i4 = i3 % 2;
        showRealtimeFeedback2(faceProcessingState);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Selfie(VideoRecordingContract.View view, CameraPresenter cameraPresenter, IncodeWelcomeRepository incodeWelcomeRepository, b bVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, VideoSelfie.SelfieMode selfieMode, int i2, RecogManager recogManager) {
        super(i2, view);
        this.f12401k = 0;
        this.f12407s = true;
        this.f12394d = view;
        this.f12395e = cameraPresenter;
        this.f12391a = incodeWelcomeRepository;
        this.f12392b = bVar;
        this.f12399i = z2;
        this.f12397g = selfieMode == VideoSelfie.SelfieMode.FACE_MATCH;
        this.f12396f = z3;
        this.f12398h = z4;
        this.f12400j = z5;
        this.f12404n = z6;
        this.f12406q = z7;
        this.f12393c = recogManager;
        this.f12405o = new ArrayList<>();
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void start() {
        int i2 = 2 % 2;
        int i3 = f12390y + 7;
        f12388v = i3 % 128;
        int i4 = i3 % 2;
        this.f12394d.startVideoSelfieProgressStep(VideoSelfieScanState.f12197c);
        this.f12394d.setFeedbackBottomVisible(true);
        this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_video_selfie_feedback_selfie);
        this.f12394d.setSelfieUIVisible(true, null);
        this.f12403m = null;
        int i5 = f12388v + 7;
        f12390y = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean processesFrames() {
        int i2 = 2 % 2;
        int i3 = f12388v + 31;
        f12390y = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public Observable<ScanResult> findAndProcess(Bitmap bitmap, FacePositionConstraint facePositionConstraint, final Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f12388v + 109;
        f12390y = i3 % 128;
        if (i3 % 2 == 0) {
            Something something = (Something) e(new Object[]{this, bitmap, facePositionConstraint}, ScaleDrawer.b(), ScaleDrawer.b(), 796609724, ScaleDrawer.b(), ScaleDrawer.b(), -796609721);
            if (something.f12148d == FaceProcessingUtils.FaceProcessingState.NOT_READY) {
                addProcessingErrorState2((FaceProcessingUtils.FaceProcessingState) something.f12148d);
                showRealtimeFeedback2((FaceProcessingUtils.FaceProcessingState) something.f12148d);
                EventUtils.sendVideoSelfieProcessingEvent(this.f12391a, Event.VIDEO_SELFIE_FACE_ATTEMPT_FAILED, Modules.VIDEO_ONBOARDING, this.f12405o);
                return Observable.just(ScanResult.FINISHED_WITH_ERROR);
            }
            Observable<ScanResult> map = Observable.just(something).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$$ExternalSyntheticLambda8
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.b((Something) obj);
                }
            }).observeOn(this.f12395e.getDetectionScheduler()).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$$ExternalSyntheticLambda9
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return Selfie.c(runnable, (Something) obj);
                }
            }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$$ExternalSyntheticLambda10
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.a((Something) obj);
                }
            }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$$ExternalSyntheticLambda11
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return Selfie.c((ScanResult) obj);
                }
            }).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return Selfie.c(runnable, (ScanResult) obj);
                }
            }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.b((ScanResult) obj);
                }
            });
            int i4 = f12390y + 85;
            f12388v = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return map;
        }
        S s2 = ((Something) e(new Object[]{this, bitmap, facePositionConstraint}, ScaleDrawer.b(), ScaleDrawer.b(), 796609724, ScaleDrawer.b(), ScaleDrawer.b(), -796609721)).f12148d;
        FaceProcessingUtils.FaceProcessingState faceProcessingState = FaceProcessingUtils.FaceProcessingState.NOT_READY;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Something b(Something something) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12390y + 7;
        f12388v = i3 % 128;
        int i4 = i3 % 2;
        addProcessingErrorState2((FaceProcessingUtils.FaceProcessingState) something.f12148d);
        showRealtimeFeedback2((FaceProcessingUtils.FaceProcessingState) something.f12148d);
        int i5 = f12390y + 107;
        f12388v = i5 % 128;
        int i6 = i5 % 2;
        return something;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Runnable runnable, Something something) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12388v + 55;
        f12390y = i3 % 128;
        int i4 = i3 % 2;
        if (something.f12146b == null) {
            runnable.run();
            return false;
        }
        int i5 = f12390y + 75;
        f12388v = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ScanResult a(Something something) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12390y + 3;
        f12388v = i3 % 128;
        int i4 = i3 % 2;
        ScanResult scanResult = (ScanResult) e(new Object[]{this, (FaceProcessingUtils.DetectionData) something.f12147c}, ScaleDrawer.b(), ScaleDrawer.b(), -1223449988, ScaleDrawer.b(), ScaleDrawer.b(), 1223449988);
        int i5 = f12390y + 71;
        f12388v = i5 % 128;
        int i6 = i5 % 2;
        return scanResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ObservableSource c(ScanResult scanResult) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12390y + 85;
        f12388v = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Observable observableJust = Observable.just(scanResult);
            if (scanResult != ScanResult.RETRY) {
                int i4 = f12390y + 15;
                f12388v = i4 % 128;
                if (i4 % 2 != 0) {
                    return observableJust;
                }
                throw null;
            }
            return observableJust.delay(2L, TimeUnit.SECONDS);
        }
        Observable.just(scanResult);
        ScanResult scanResult2 = ScanResult.RETRY;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Runnable runnable, ScanResult scanResult) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12390y + 11;
        f12388v = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (scanResult == ScanResult.RETRY) {
            int i5 = f12388v + 67;
            f12390y = i5 % 128;
            if (i5 % 2 != 0) {
                runnable.run();
                obj.hashCode();
                throw null;
            }
            runnable.run();
        }
        if (scanResult != ScanResult.OK) {
            int i6 = f12388v + 67;
            f12390y = i6 % 128;
            if (i6 % 2 != 0) {
                ScanResult scanResult2 = ScanResult.ERROR;
                obj.hashCode();
                throw null;
            }
            if (scanResult != ScanResult.ERROR && scanResult != ScanResult.FINISHED_WITH_ERROR) {
                return false;
            }
        }
        int i7 = f12388v + 77;
        f12390y = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScanResult b(ScanResult scanResult) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12388v + 87;
        f12390y = i3 % 128;
        int i4 = i3 % 2;
        logProcessingEvents(this.f12391a);
        int i5 = f12388v + 101;
        f12390y = i5 % 128;
        int i6 = i5 % 2;
        return scanResult;
    }

    private static void w(String str, String str2, int[] iArr, int i2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object charArray = str4;
        if (str4 != null) {
            charArray = str4.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        i iVar = new i();
        char[] cArr2 = f12386r;
        float f2 = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objC = e.c(936178174);
                    if (objC == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int jumpTapTimeout = 20 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i5 = 847 - (AudioTrack.getMaxVolume() > f2 ? 1 : (AudioTrack.getMaxVolume() == f2 ? 0 : -1));
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objC = e.e(scrollDefaultDelay, jumpTapTimeout, i5, 928445319, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    i4++;
                    f2 = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $11 + 67;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f12385p)};
        Object objC2 = e.c(-1774242729);
        if (objC2 == null) {
            objC2 = e.e((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35037), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1362, -1767557586, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
        int i8 = 49812;
        if (f12387u) {
            iVar.f2754b = bArr.length;
            char[] cArr4 = new char[iVar.f2754b];
            iVar.f2755c = 0;
            while (iVar.f2755c < iVar.f2754b) {
                int i9 = $11 + 105;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr4[iVar.f2755c] = (char) (cArr2[bArr[iVar.f2754b >> iVar.f2755c] >>> i2] << iIntValue);
                    Object[] objArr4 = {iVar, iVar};
                    Object objC3 = e.c(-1471606930);
                    if (objC3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objC3 = e.e((char) (i8 - TextUtils.lastIndexOf("", '0', 0, 0)), 20 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 1342, -1462563561, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC3).invoke(null, objArr4);
                } else {
                    cArr4[iVar.f2755c] = (char) (cArr2[bArr[(iVar.f2754b - 1) - iVar.f2755c] + i2] - iIntValue);
                    Object[] objArr5 = {iVar, iVar};
                    Object objC4 = e.c(-1471606930);
                    if (objC4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objC4 = e.e((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49813), 19 - TextUtils.indexOf((CharSequence) "", '0'), ExpandableListView.getPackedPositionChild(0L) + 1343, -1462563561, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC4).invoke(null, objArr5);
                }
                i8 = 49812;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f12389x) {
            iVar.f2754b = iArr.length;
            char[] cArr5 = new char[iVar.f2754b];
            iVar.f2755c = 0;
            while (iVar.f2755c < iVar.f2754b) {
                cArr5[iVar.f2755c] = (char) (cArr2[iArr[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
                iVar.f2755c++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i10 = $11 + 45;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        iVar.f2754b = cArr.length;
        char[] cArr6 = new char[iVar.f2754b];
        iVar.f2755c = 0;
        while (iVar.f2755c < iVar.f2754b) {
            int i12 = $10 + 95;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr6[iVar.f2755c] = (char) (cArr2[cArr[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
            Object[] objArr6 = {iVar, iVar};
            Object objC5 = e.c(-1471606930);
            if (objC5 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 + 1);
                objC5 = e.e((char) (49812 - ExpandableListView.getPackedPositionChild(0L)), 20 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), AndroidCharacter.getMirror('0') + 1294, -1462563561, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objC5).invoke(null, objArr6);
            int i14 = $11 + 23;
            $10 = i14 % 128;
            int i15 = i14 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c5, code lost:
    
        if (r4 > 2.0f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        return com.incode.welcome_sdk.ui.camera.video_selfie.Something.empty(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceProcessingState.FACE_ROTATED_RIGHT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00db, code lost:
    
        if (r4 > 0.0f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        return com.incode.welcome_sdk.ui.camera.video_selfie.Something.empty(com.incode.welcome_sdk.commons.utils.FaceProcessingUtils.FaceProcessingState.FACE_ROTATED_LEFT);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object c(java.lang.Object[] r16) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.c(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12409a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12411c = 0;

        static {
            int[] iArr = new int[FaceProcessingUtils.FaceProcessingState.values().length];
            f12410b = iArr;
            try {
                iArr[FaceProcessingUtils.FaceProcessingState.FACE_TILTED_LEFT.ordinal()] = 1;
                int i2 = f12409a + 15;
                f12411c = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.FACE_TILTED_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.FACE_ROTATED_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.FACE_ROTATED_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.INSUFFICIENT_FACE_SIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.FACE_TOO_CLOSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.BLURRED_CROP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.FACE_NOT_IN_CONSTRAINT.ordinal()] = 8;
                int i5 = f12411c + 103;
                f12409a = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.LENSES_DETECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.FACE_MASK_DETECTED.ordinal()] = 10;
                int i8 = f12411c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f12409a = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.EYES_CLOSED.ordinal()] = 11;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.HEAD_COVERED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.MULTIPLE_FACES_DETECTED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.NO_FACE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.NOT_READY.ordinal()] = 15;
                int i11 = 2 % 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12410b[FaceProcessingUtils.FaceProcessingState.LIGHT_TOO_DARK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* JADX INFO: renamed from: showRealtimeFeedback, reason: avoid collision after fix types in other method */
    public void showRealtimeFeedback2(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        int i3 = f12390y + 73;
        f12388v = i3 % 128;
        int i4 = i3 % 2;
        switch (AnonymousClass3.f12410b[faceProcessingState.ordinal()]) {
            case 1:
            case 2:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_face_tilted);
                break;
            case 3:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_face_rotated_left);
                break;
            case 4:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_face_rotated_right);
                int i5 = f12390y + 73;
                f12388v = i5 % 128;
                int i6 = i5 % 2;
                break;
            case 5:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_face_too_far);
                break;
            case 6:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_face_too_close);
                break;
            case 7:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_blurred_crop);
                break;
            case 8:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_align_face);
                break;
            case 9:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_remove_lenses);
                break;
            case 10:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_face_mask_detected);
                break;
            case 11:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_open_eyes);
                break;
            case 12:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_remove_head_cover);
                break;
            case 13:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_multiple_faces_detected);
                break;
            case 14:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_feedback_position_your_face);
                break;
            case 15:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_face_scan_not_operational);
                break;
            case 16:
                this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_face_scan_warn_selfie_too_dark);
                break;
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        final Selfie selfie = (Selfie) objArr[0];
        final FaceProcessingUtils.DetectionData detectionData = (FaceProcessingUtils.DetectionData) objArr[1];
        int i2 = 2 % 2;
        int i3 = f12388v + 43;
        f12390y = i3 % 128;
        int i4 = i3 % 2;
        selfie.f12407s = true;
        if (IncodeWelcome.getInstance().isCaptureOnlyMode()) {
            selfie.f12394d.hideCircleCameraOutline();
        } else {
            int i5 = f12390y + 85;
            f12388v = i5 % 128;
            if (i5 % 2 == 0) {
                selfie.f12394d.setSelfieUIState(UiState.PROCESSING, R.string.onboard_sdk_video_selfie_feedback_selfie_processing);
                int i6 = 34 / 0;
            } else {
                selfie.f12394d.setSelfieUIState(UiState.PROCESSING, R.string.onboard_sdk_video_selfie_feedback_selfie_processing);
            }
        }
        if (selfie.f12397g) {
            int i7 = f12390y + 121;
            f12388v = i7 % 128;
            int i8 = i7 % 2;
            Bitmap bitmap = detectionData.bitmap;
            File imagesDirectory = selfie.f12391a.getImagesDirectory();
            Object[] objArr2 = new Object[1];
            w("\u0082\u0085\u0084\u0083\u0082\u0081", null, null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, objArr2);
            BitmapUtils.saveBitmapToFile(bitmap, imagesDirectory, ((String) objArr2[0]).intern());
        }
        Bitmap bitmap2 = detectionData.bitmap;
        File imagesDirectory2 = selfie.f12391a.getImagesDirectory();
        Object[] objArr3 = new Object[1];
        w("\u0082\u0085\u0084\u0083\u0082\u0081\u0087\u0081\u0086", null, null, View.getDefaultSize(0, 0) + 127, objArr3);
        BitmapUtils.saveBitmapToFile(bitmap2, imagesDirectory2, ((String) objArr3[0]).intern());
        if (IncodeWelcome.getInstance().isCaptureOnlyMode()) {
            selfie.c(detectionData);
            return ScanResult.OK;
        }
        EventUtils.sendVideoSelfieProcessingEvent(selfie.f12391a, Event.VIDEO_SELFIE_FACE_UPLOAD_PROGRESS, Modules.VIDEO_ONBOARDING, selfie.f12405o);
        return (ScanResult) selfie.f12391a.addFaceVideoSelfie(BitmapUtils.getBase64FromBitmap(detectionData.bitmap), FaceProcessingUtils.d(detectionData), selfie.f12397g).onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e((Throwable) obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c((v) obj);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d(detectionData, (ScanResult) obj);
            }
        }).onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.a((Throwable) obj);
            }
        }).blockingFirst();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ v e(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12388v;
        int i4 = i3 + 107;
        f12390y = i4 % 128;
        int i5 = i4 % 2;
        if (th instanceof NoConnectivityException) {
            int i6 = i3 + 1;
            f12390y = i6 % 128;
            int i7 = i6 % 2;
            Timber.e(th, "No network error when adding face", new Object[0]);
            this.f12407s = false;
            this.f12394d.showNoNetworkMessage(VideoSelfieScanState.f12197c);
            this.f12394d.setSelfieUIState(UiState.RETRY, R.string.onboard_sdk_video_selfie_feedback_no_network);
        }
        v vVar = new v();
        Object[] objArr = {vVar, Integer.valueOf(n.b(th))};
        int iD = IdCaptureViewModel.l.d();
        v.d(IdCaptureViewModel.l.d(), objArr, -1826971148, IdCaptureViewModel.l.d(), iD, IdCaptureViewModel.l.d(), 1826971148);
        int i8 = f12388v + 125;
        f12390y = i8 % 128;
        if (i8 % 2 == 0) {
            return vVar;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Selfie selfie = (Selfie) objArr[0];
        FaceProcessingUtils.DetectionData detectionData = (FaceProcessingUtils.DetectionData) objArr[1];
        ScanResult scanResult = (ScanResult) objArr[2];
        int i2 = 2 % 2;
        int i3 = f12388v + 113;
        f12390y = i3 % 128;
        if (i3 % 2 == 0) {
            if (scanResult == ScanResult.OK) {
                selfie.c(detectionData);
                int i4 = f12388v + 75;
                f12390y = i4 % 128;
                int i5 = i4 % 2;
            }
            return scanResult;
        }
        ScanResult scanResult2 = ScanResult.OK;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScanResult a(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12388v + 41;
        f12390y = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th, "Error when adding face", new Object[0]);
        this.f12394d.setSelfieUIState(UiState.ERROR, R.string.onboard_sdk_video_selfie_feedback_selfie_error_continue);
        this.f12394d.onError(th);
        ScanResult scanResult = ScanResult.ERROR;
        int i5 = f12388v + 53;
        f12390y = i5 % 128;
        int i6 = i5 % 2;
        return scanResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ io.reactivex.ObservableSource d(com.incode.welcome_sdk.data.remote.beans.v r7, com.incode.welcome_sdk.data.remote.beans.bf r8) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.d(com.incode.welcome_sdk.data.remote.beans.v, com.incode.welcome_sdk.data.remote.beans.bf):io.reactivex.ObservableSource");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable<ScanResult> c(final v vVar) {
        int i2 = 2 % 2;
        if (!this.f12407s) {
            int i3 = f12388v + 3;
            f12390y = i3 % 128;
            int i4 = i3 % 2;
            return Observable.just(ScanResult.ERROR);
        }
        this.f12403m = vVar;
        if (!this.f12399i) {
            vVar.e(0.0d);
        }
        EventUtils.sendVideoSelfieProcessingEvent(this.f12391a, Event.VIDEO_SELFIE_FACE_UPLOAD_SUCCEEDED, Modules.VIDEO_ONBOARDING, this.f12405o);
        if (com.incode.welcome_sdk.commons.httpinterceptors.e.c(this.f12394d.getContext())) {
            this.f12401k++;
            int i5 = f12388v + 49;
            f12390y = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 4;
            }
        }
        if (this.f12400j && vVar.d()) {
            v.d(IdCaptureViewModel.l.d(), new Object[]{vVar, Integer.valueOf(((Integer) n.a(1463773427, new Object[0], -1463773426, OpenTokEventListener.b(), OpenTokEventListener.b(), OpenTokEventListener.b(), OpenTokEventListener.b())).intValue())}, -1826971148, IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), 1826971148);
        } else {
            Object obj = null;
            if (this.f12404n && vVar.h()) {
                int i7 = f12390y + 17;
                f12388v = i7 % 128;
                if (i7 % 2 == 0) {
                    v.d(IdCaptureViewModel.l.d(), new Object[]{vVar, Integer.valueOf(n.a())}, -1826971148, IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), 1826971148);
                    obj.hashCode();
                    throw null;
                }
                v.d(IdCaptureViewModel.l.d(), new Object[]{vVar, Integer.valueOf(n.a())}, -1826971148, IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), 1826971148);
            } else if (this.f12396f && vVar.g()) {
                int i8 = f12390y + 35;
                f12388v = i8 % 128;
                if (i8 % 2 == 0) {
                    v.d(IdCaptureViewModel.l.d(), new Object[]{vVar, Integer.valueOf(n.b())}, -1826971148, IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), 1826971148);
                    int i9 = 45 / 0;
                } else {
                    v.d(IdCaptureViewModel.l.d(), new Object[]{vVar, Integer.valueOf(n.b())}, -1826971148, IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), 1826971148);
                }
                int i10 = f12390y + 111;
                f12388v = i10 % 128;
                int i11 = i10 % 2;
            } else if (this.f12398h) {
                int iD = IdCaptureViewModel.l.d();
                if (((Boolean) v.d(IdCaptureViewModel.l.d(), new Object[]{vVar}, 112187359, IdCaptureViewModel.l.d(), iD, IdCaptureViewModel.l.d(), -112187358)).booleanValue()) {
                    int i12 = f12390y + 125;
                    f12388v = i12 % 128;
                    if (i12 % 2 == 0) {
                        v.d(IdCaptureViewModel.l.d(), new Object[]{vVar, Integer.valueOf(n.e())}, -1826971148, IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), 1826971148);
                        obj.hashCode();
                        throw null;
                    }
                    v.d(IdCaptureViewModel.l.d(), new Object[]{vVar, Integer.valueOf(n.e())}, -1826971148, IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), IdCaptureViewModel.l.d(), 1826971148);
                }
            }
        }
        if (!((Boolean) e(new Object[]{this, vVar}, ScaleDrawer.b(), ScaleDrawer.b(), 1903499621, ScaleDrawer.b(), ScaleDrawer.b(), -1903499620)).booleanValue()) {
            this.f12394d.setSelfieUIState(UiState.RETRY, n.e(vVar.a()));
            return d();
        }
        int i13 = f12388v + 37;
        f12390y = i13 % 128;
        int i14 = i13 % 2;
        return this.f12391a.processFaceVideoSelfie(this.f12397g).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return this.f$0.d(vVar, (bf) obj2);
            }
        });
    }

    private void c(FaceProcessingUtils.DetectionData detectionData) {
        int i2 = 2 % 2;
        int i3 = f12388v + 103;
        f12390y = i3 % 128;
        int i4 = i3 % 2;
        if (this.f12406q) {
            TemplateModel templateFromDetectionData = RecogKitUtils.getTemplateFromDetectionData(this.f12393c.getRecogKitAndroid(), detectionData);
            RecogKitUtils.trainRecogKitWithFaceInfo(this.f12393c.getRecogKitAndroid(), new FaceInfo(0L, templateFromDetectionData.getTemplateId(), templateFromDetectionData.getTemplate(), ""));
            int i5 = f12390y + 113;
            f12388v = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 3;
            }
        }
    }

    private Observable<ScanResult> d() {
        int i2 = 2 % 2;
        int i3 = f12390y + 65;
        f12388v = i3 % 128;
        int i4 = i3 % 2;
        Observable map = Observable.timer(1000L, TimeUnit.MILLISECONDS).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d((Long) obj);
            }
        });
        int i5 = f12390y + 117;
        f12388v = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScanResult d(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f12388v + 51;
        f12390y = i3 % 128;
        if (i3 % 2 == 0) {
            this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_video_selfie_feedback_selfie);
            return ScanResult.RETRY;
        }
        this.f12394d.setSelfieUIState(UiState.DEFAULT, R.string.onboard_sdk_video_selfie_feedback_selfie);
        ScanResult scanResult = ScanResult.RETRY;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (g(r3) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r7) {
        /*
            r6 = 0
            r5 = r7[r6]
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie r5 = (com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie) r5
            r4 = 1
            r3 = r7[r4]
            com.incode.welcome_sdk.data.remote.beans.v r3 = (com.incode.welcome_sdk.data.remote.beans.v) r3
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.f12388v
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.f12390y = r0
            int r1 = r1 % r2
            boolean r0 = r5.c()
            if (r0 != 0) goto L48
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.f12390y
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.f12388v = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L5b
            boolean r0 = b(r3)
            if (r0 != 0) goto L56
            boolean r0 = a(r3)
            if (r0 != 0) goto L56
            boolean r0 = e(r3)
            if (r0 != 0) goto L56
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.f12388v
            int r1 = r0 + 17
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.f12390y = r0
            int r1 = r1 % r2
            boolean r0 = g(r3)
            if (r0 != 0) goto L56
        L48:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.f12390y
            int r1 = r0 + 117
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.f12388v = r0
            int r1 = r1 % r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L56:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L5b:
            b(r3)
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie.e(java.lang.Object[]):java.lang.Object");
    }

    private boolean c() {
        int i2 = 2 % 2;
        int i3 = f12390y;
        int i4 = i3 + 1;
        f12388v = i4 % 128;
        if (i4 % 2 == 0) {
            if (this.f12401k != 4) {
                return false;
            }
        } else if (this.f12401k != 3) {
            return false;
        }
        int i5 = i3 + 67;
        f12388v = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static boolean b(v vVar) {
        int i2 = 2 % 2;
        int i3 = f12390y;
        int i4 = i3 + 85;
        f12388v = i4 % 128;
        int i5 = i4 % 2;
        if (vVar == null) {
            int i6 = i3 + 89;
            f12388v = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (vVar.a() != ((Integer) n.a(1463773427, new Object[0], -1463773426, OpenTokEventListener.b(), OpenTokEventListener.b(), OpenTokEventListener.b(), OpenTokEventListener.b())).intValue()) {
            return false;
        }
        int i7 = f12388v + 103;
        f12390y = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private static boolean a(v vVar) {
        int i2 = 2 % 2;
        int i3 = f12388v;
        int i4 = i3 + 23;
        f12390y = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (vVar == null) {
            int i5 = i3 + 17;
            f12390y = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (vVar.a() == n.a()) {
            return true;
        }
        int i7 = f12388v + 117;
        f12390y = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 37 / 0;
        }
        return false;
    }

    private static boolean e(v vVar) {
        int i2 = 2 % 2;
        int i3 = f12390y + 15;
        int i4 = i3 % 128;
        f12388v = i4;
        int i5 = i3 % 2;
        if (vVar != null) {
            return vVar.a() == n.e();
        }
        int i6 = i4 + 101;
        f12390y = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    private static boolean g(v vVar) {
        int i2 = 2 % 2;
        int i3 = f12390y + 57;
        f12388v = i3 % 128;
        int i4 = i3 % 2;
        if (vVar.b() != -1.0d) {
            int i5 = f12390y + 55;
            f12388v = i5 % 128;
            int i6 = i5 % 2;
            if (vVar.b() < 0.5d) {
                return false;
            }
        }
        int i7 = f12388v + 57;
        f12390y = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public boolean isComplete() {
        int i2 = 2 % 2;
        int i3 = f12388v + 101;
        int i4 = i3 % 128;
        f12390y = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 53;
        f12388v = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 27 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: addProcessingErrorState, reason: avoid collision after fix types in other method */
    public void addProcessingErrorState2(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        if (faceProcessingState != null && faceProcessingState != this.f12402l) {
            int i3 = f12388v + 23;
            f12390y = i3 % 128;
            if (i3 % 2 != 0) {
                EventUtils.faceProcessingStateToEvent(faceProcessingState);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strFaceProcessingStateToEvent = EventUtils.faceProcessingStateToEvent(faceProcessingState);
            if (strFaceProcessingStateToEvent != null) {
                int i4 = f12390y + 117;
                f12388v = i4 % 128;
                if (i4 % 2 == 0) {
                    this.f12402l = faceProcessingState;
                    this.f12405o.add(strFaceProcessingStateToEvent);
                    int i5 = 1 / 0;
                } else {
                    this.f12402l = faceProcessingState;
                    this.f12405o.add(strFaceProcessingStateToEvent);
                }
            }
        }
        int i6 = f12390y + 101;
        f12388v = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void logServerEventSuccess(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f12390y + 69;
        f12388v = i3 % 128;
        int i4 = i3 % 2;
        EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_SELFIE_MATCHED, Modules.VIDEO_ONBOARDING, this.f12405o);
        int i5 = f12390y + 23;
        f12388v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void logProcessingEvents(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f12388v + 81;
        f12390y = i3 % 128;
        if (i3 % 2 != 0) {
            EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_FACE_PROCESSING_STATES, Modules.VIDEO_ONBOARDING, this.f12405o);
            int i4 = 38 / 0;
        } else {
            EventUtils.sendVideoSelfieProcessingEvent(incodeWelcomeRepository, Event.VIDEO_SELFIE_FACE_PROCESSING_STATES, Modules.VIDEO_ONBOARDING, this.f12405o);
        }
        int i5 = f12390y + 51;
        f12388v = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void showWinState() {
        int i2 = 2 % 2;
        int i3 = f12390y + 91;
        f12388v = i3 % 128;
        int i4 = i3 % 2;
        this.f12394d.setSelfieUIState(UiState.SUCCESS, R.string.onboard_sdk_video_selfie_feedback_selfie_success);
        int i5 = f12390y + 35;
        f12388v = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void showDoneStateWithError() {
        int i2 = 2 % 2;
        int i3 = f12390y + 79;
        f12388v = i3 % 128;
        int i4 = i3 % 2;
        this.f12394d.setFeedbackTopVisible(b(this.f12403m), a(this.f12403m));
        this.f12394d.setSelfieUIState(UiState.ERROR_CONTINUE, R.string.onboard_sdk_video_selfie_feedback_selfie_error_continue);
        int i5 = f12390y + 85;
        f12388v = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep
    public void cleanup(Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f12388v + 37;
        f12390y = i3 % 128;
        int i4 = i3 % 2;
        this.f12394d.finishVideoSelfieProgressStep(VideoSelfieScanState.f12197c);
        this.f12394d.setFeedbackBottomVisible(false);
        this.f12394d.setFeedbackTopVisible(false, false);
        this.f12394d.setSelfieUIVisible(false, runnable);
        this.f12403m = null;
        int i5 = f12390y + 69;
        f12388v = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setMinFaceWidth(float f2) {
        int i2 = 2 % 2;
        int i3 = f12390y;
        int i4 = i3 + 115;
        f12388v = i4 % 128;
        if (i4 % 2 != 0) {
            this.f12408t = f2;
            int i5 = i3 + 75;
            f12388v = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.f12408t = f2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f12390y = 0;
        f12388v = 1;
        f12386r = new char[]{64450, 64432, 64443, 64433, 64444, 64449, 64438};
        f12385p = -1867973801;
        f12389x = true;
        f12387u = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScanResult d(FaceProcessingUtils.DetectionData detectionData, ScanResult scanResult) throws Exception {
        return (ScanResult) e(new Object[]{this, detectionData, scanResult}, ScaleDrawer.b(), ScaleDrawer.b(), 1461688606, ScaleDrawer.b(), ScaleDrawer.b(), -1461688604);
    }

    private boolean d(v vVar) {
        return ((Boolean) e(new Object[]{this, vVar}, ScaleDrawer.b(), ScaleDrawer.b(), 1903499621, ScaleDrawer.b(), ScaleDrawer.b(), -1903499620)).booleanValue();
    }

    private ScanResult d(FaceProcessingUtils.DetectionData detectionData) {
        return (ScanResult) e(new Object[]{this, detectionData}, ScaleDrawer.b(), ScaleDrawer.b(), -1223449988, ScaleDrawer.b(), ScaleDrawer.b(), 1223449988);
    }

    private Something<FaceProcessingUtils.DetectionData, FaceProcessingUtils.FaceProcessingState> b(Bitmap bitmap, FacePositionConstraint facePositionConstraint) {
        return (Something) e(new Object[]{this, bitmap, facePositionConstraint}, ScaleDrawer.b(), ScaleDrawer.b(), 796609724, ScaleDrawer.b(), ScaleDrawer.b(), -796609721);
    }
}
