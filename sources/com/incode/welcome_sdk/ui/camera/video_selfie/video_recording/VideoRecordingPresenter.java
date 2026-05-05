package com.incode.welcome_sdk.ui.camera.video_selfie.video_recording;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.media.MediaRecorder;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.c.a.e.e;
import com.c.a.h;
import com.dynatrace.android.agent.AdkSettings;
import com.google.common.base.Ascii;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.welcome_sdk.CameraFacing;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.RecogManager;
import com.incode.welcome_sdk.commons.c.c.b;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.AudioNotMatchedException;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.FacesNotMatchedException;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.MaxVideoLengthReachedException;
import com.incode.welcome_sdk.commons.utils.an;
import com.incode.welcome_sdk.commons.utils.f;
import com.incode.welcome_sdk.commons.utils.l;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.VideoSelfieLocalQuestion;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.bk;
import com.incode.welcome_sdk.data.remote.beans.bp;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.VideoSelfie;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.VideoSelfieResult;
import com.incode.welcome_sdk.ui.camera.CameraPresenter;
import com.incode.welcome_sdk.ui.camera.video_selfie.ScanResult;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState;
import com.incode.welcome_sdk.ui.camera.video_selfie.VoiceConsentFaceRecognitionState;
import com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId;
import com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Done$$ExternalSyntheticLambda1;
import com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId;
import com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep;
import com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport;
import com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie;
import com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.VoiceConsent;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.DaggerVideoRecordingComponent;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.ReplaySubject;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class VideoRecordingPresenter extends CameraPresenter implements VideoRecordingContract.Presenter {
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static char aj = 0;
    private static char ak = 0;
    private static char am = 0;
    private static int an = 0;
    private static char ap = 0;
    private static int ar = 0;
    private boolean A;
    private boolean B;
    private boolean C;
    private final int D;
    private boolean E;
    private boolean F;
    private final int G;
    private boolean H;
    private boolean I;
    private ArrayList<VideoSelfieLocalQuestion> J;
    private int K;
    private final int L;
    private boolean M;
    private final int N;
    private boolean O;
    private final int P;
    private String Q;
    private boolean R;
    private VoiceConsentFaceRecognitionState S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private int Z;
    private boolean aa;
    private boolean ab;
    private MediaRecorder ac;
    private int ad;
    private final ArrayList<Long> ae;
    private final ArrayList<Long> af;
    private final ArrayList<Long> ag;
    private final ReplaySubject<List<bk>> ah;
    private final ReplaySubject<String> ai;
    private boolean al;

    /* JADX INFO: renamed from: h */
    private final Observable<IdCaptureKitAndroid> f12547h;

    /* JADX INFO: renamed from: j */
    private final VideoRecordingContract.View f12548j;

    /* JADX INFO: renamed from: k */
    private final b f12549k;

    /* JADX INFO: renamed from: l */
    private final CompositeDisposable f12550l;

    /* JADX INFO: renamed from: m */
    private final CompositeDisposable f12551m;

    /* JADX INFO: renamed from: n */
    private final CompositeDisposable f12552n;

    /* JADX INFO: renamed from: o */
    private final IncodeWelcomeRepository f12553o;

    /* JADX INFO: renamed from: p */
    private boolean f12554p;

    /* JADX INFO: renamed from: q */
    private final RecogManager f12555q;

    /* JADX INFO: renamed from: r */
    private List<IScanStep> f12556r;

    /* JADX INFO: renamed from: s */
    private IScanStep f12557s;

    /* JADX INFO: renamed from: t */
    private int f12558t;

    /* JADX INFO: renamed from: u */
    private boolean f12559u;

    /* JADX INFO: renamed from: v */
    private boolean f12560v;

    /* JADX INFO: renamed from: w */
    private boolean f12561w;

    /* JADX INFO: renamed from: x */
    private VideoSelfie.SelfieMode f12562x;

    /* JADX INFO: renamed from: y */
    private Runnable f12563y;

    /* JADX INFO: renamed from: z */
    private boolean f12564z;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r9, byte r10, byte r11) {
        /*
            byte[] r8 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.$$c
            int r0 = r9 * 5
            int r7 = r0 + 105
            int r0 = r10 * 3
            int r6 = r0 + 1
            int r0 = r11 * 4
            int r0 = 3 - r0
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L2b
            r1 = r0
            r3 = r4
        L15:
            int r0 = -r0
            int r7 = r7 + r0
            r0 = r1
            r2 = r3
        L19:
            int r1 = r0 + 1
            int r3 = r2 + 1
            byte r0 = (byte) r7
            r5[r2] = r0
            if (r3 != r6) goto L28
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L28:
            r0 = r8[r1]
            goto L15
        L2b:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.$$e(short, byte, byte):java.lang.String");
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i6;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = i3 | i10;
        int i12 = (~(i8 | i3)) | i10 | (~(i9 | i3));
        int i13 = ~((~i3) | i6 | i2);
        int i14 = i6 + i2 + i5 + ((-2027816600) * i7) + ((-1234684791) * i4);
        int i15 = i14 * i14;
        int i16 = (i6 * (-132237830)) + 1711013888 + ((-132237830) * i2) + (i11 * 228444679) + (228444679 * i12) + ((-228444679) * i13) + (96206848 * i5) + (811597824 * i7) + (1100742656 * i4) + (1751056384 * i15);
        int i17 = ((i6 * 572746074) - 905264446) + (i2 * 572746074) + (i11 * (-489)) + (i12 * (-489)) + (i13 * 489) + (i5 * 572745585) + (i7 * 982511336) + (i4 * (-774025351)) + (i15 * 1257177088);
        switch (i16 + (i17 * i17 * 1874919424)) {
            case 1:
                VideoRecordingPresenter videoRecordingPresenter = (VideoRecordingPresenter) objArr[0];
                Runnable runnable = (Runnable) objArr[1];
                Bitmap bitmap = (Bitmap) objArr[2];
                int i18 = 2 % 2;
                int i19 = ar + 39;
                an = i19 % 128;
                int i20 = i19 % 2;
                Observable<ScanResult> observableFindAndProcess = videoRecordingPresenter.f12557s.findAndProcess(bitmap, videoRecordingPresenter.f12548j.getPositionConstraint(), runnable);
                int i21 = an + 89;
                ar = i21 % 128;
                int i22 = i21 % 2;
                return observableFindAndProcess;
            case 2:
                return d(objArr);
            case 3:
                VideoRecordingPresenter videoRecordingPresenter2 = (VideoRecordingPresenter) objArr[0];
                int i23 = 2 % 2;
                int i24 = ar + 115;
                an = i24 % 128;
                if (i24 % 2 != 0) {
                    int i25 = videoRecordingPresenter2.Z % 0;
                    videoRecordingPresenter2.Z = i25;
                    b(1964737557, DaggerVideoRecordingComponent.b.d(), DaggerVideoRecordingComponent.b.d(), DaggerVideoRecordingComponent.b.d(), -1964737555, new Object[]{videoRecordingPresenter2, Integer.valueOf(i25)}, DaggerVideoRecordingComponent.b.d());
                    return null;
                }
                int i26 = videoRecordingPresenter2.Z + 1;
                videoRecordingPresenter2.Z = i26;
                b(1964737557, DaggerVideoRecordingComponent.b.d(), DaggerVideoRecordingComponent.b.d(), DaggerVideoRecordingComponent.b.d(), -1964737555, new Object[]{videoRecordingPresenter2, Integer.valueOf(i26)}, DaggerVideoRecordingComponent.b.d());
                return null;
            case 4:
                return a(objArr);
            case 5:
                VideoRecordingPresenter videoRecordingPresenter3 = (VideoRecordingPresenter) objArr[0];
                int i27 = 2 % 2;
                videoRecordingPresenter3.publishResult(new VideoSelfieResult(ResultCode.EMULATOR_DETECTED));
                int i28 = an + 75;
                ar = i28 % 128;
                int i29 = i28 % 2;
                return null;
            case 6:
                return b(objArr);
            case 7:
                VideoRecordingPresenter videoRecordingPresenter4 = (VideoRecordingPresenter) objArr[0];
                Runnable runnable2 = (Runnable) objArr[1];
                ScanResult scanResult = (ScanResult) objArr[2];
                int i30 = 2 % 2;
                int i31 = ar + 15;
                int i32 = i31 % 128;
                an = i32;
                int i33 = i31 % 2;
                if (videoRecordingPresenter4.f12557s instanceof VoiceConsent) {
                    int i34 = i32 + 47;
                    ar = i34 % 128;
                    int i35 = i34 % 2;
                    b(-40266684, DaggerVideoRecordingComponent.b.d(), DaggerVideoRecordingComponent.b.d(), DaggerVideoRecordingComponent.b.d(), 40266692, new Object[]{videoRecordingPresenter4, scanResult}, DaggerVideoRecordingComponent.b.d());
                } else {
                    videoRecordingPresenter4.c(scanResult);
                }
                runnable2.run();
                return scanResult;
            case 8:
                return c(objArr);
            default:
                VideoRecordingPresenter videoRecordingPresenter5 = (VideoRecordingPresenter) objArr[0];
                VoiceConsent voiceConsent = (VoiceConsent) objArr[1];
                Throwable th = (Throwable) objArr[2];
                int i36 = 2 % 2;
                int i37 = ar + 87;
                an = i37 % 128;
                if (i37 % 2 != 0) {
                    Timber.e(th);
                    voiceConsent.setProcessing(true);
                } else {
                    Timber.e(th);
                    voiceConsent.setProcessing(false);
                }
                videoRecordingPresenter5.a(th);
                int i38 = ar + 121;
                an = i38 % 128;
                int i39 = i38 % 2;
                return null;
        }
    }

    static void init$0() {
        $$c = new byte[]{70, -123, Ascii.CR, 112};
        $$d = 19;
    }

    private static void ao(String str, int i2, Object[] objArr) throws Throwable {
        Object obj;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 79;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
            if (str2 != null) {
                char[] charArray = str2.toCharArray();
                int i6 = $10 + 7;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                obj = charArray;
            } else {
                obj = str2;
            }
        } else {
            if (str2 != null) {
                char[] charArray2 = str2.toCharArray();
                int i62 = $10 + 7;
                $11 = i62 % 128;
                int i72 = i62 % 2;
                obj = charArray2;
            }
            obj = str2;
        }
        char[] cArr = (char[]) obj;
        h hVar = new h();
        char[] cArr2 = new char[cArr.length];
        hVar.f2753d = 0;
        char[] cArr3 = new char[2];
        while (hVar.f2753d < cArr.length) {
            cArr3[0] = cArr[hVar.f2753d];
            cArr3[1] = cArr[hVar.f2753d + 1];
            int i8 = 58224;
            for (int i9 = 0; i9 < 16; i9++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i8) ^ ((c3 << 4) + ((char) (((long) aj) ^ (-995256607575678378L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(ap)};
                    Object objC = e.c(1785266233);
                    if (objC == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objC = e.e((char) ExpandableListView.getPackedPositionType(0L), Color.red(0) + 18, 600 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1794310720, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) ak) ^ (-995256607575678378L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(am)};
                    Object objC2 = e.c(1785266233);
                    if (objC2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objC2 = e.e((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 600 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1794310720, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[hVar.f2753d] = cArr3[0];
            cArr2[hVar.f2753d + 1] = cArr3[1];
            Object[] objArr4 = {hVar, hVar};
            Object objC3 = e.c(-1055823967);
            if (objC3 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18;
                int gidForName = Process.getGidForName("") + 676;
                byte b6 = (byte) ($$d & 5);
                byte b7 = (byte) (b6 - 1);
                objC3 = e.e(defaultSize, i10, gidForName, -1047829032, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objC3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    @Inject
    public VideoRecordingPresenter(IncodeWelcomeRepository incodeWelcomeRepository, Observable<IdCaptureKitAndroid> observable, b bVar, VideoRecordingContract.View view, RecogManager recogManager) {
        super(view, incodeWelcomeRepository);
        this.f12562x = VideoSelfie.SelfieMode.SELFIE_MATCH;
        this.D = CameraFacing.FRONT.getCameraFacing();
        this.G = CameraFacing.BACK.getCameraFacing();
        this.L = CameraFacing.BACK.getCameraFacing();
        this.N = CameraFacing.FRONT.getCameraFacing();
        this.P = CameraFacing.FRONT.getCameraFacing();
        this.T = 300;
        this.Z = 0;
        this.Y = 0;
        this.af = new ArrayList<>();
        this.ag = new ArrayList<>();
        this.ae = new ArrayList<>();
        this.ad = 0;
        this.ah = ReplaySubject.create();
        this.ai = ReplaySubject.create();
        this.f12553o = incodeWelcomeRepository;
        this.f12547h = observable;
        this.f12549k = bVar;
        this.f12548j = view;
        this.f12555q = recogManager;
        this.f12552n = new CompositeDisposable();
        this.f12551m = new CompositeDisposable();
        this.f12550l = new CompositeDisposable();
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        b(1982917314, iD, DaggerVideoRecordingComponent.b.d(), iD2, -1982917308, new Object[]{this}, iD3);
        this.al = IncodeWelcome.getInstance().isCaptureOnlyMode();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(boolean r7, boolean r8, com.incode.welcome_sdk.modules.VideoSelfie.SelfieMode r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, int r19, java.util.ArrayList<com.incode.welcome_sdk.data.local.VideoSelfieLocalQuestion> r20, boolean r21, boolean r22, java.lang.String r23, boolean r24, int r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30) {
        /*
            r6 = this;
            r3 = r6
            r5 = 2
            int r0 = r5 % r5
            int r4 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r4 + 25
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r5
            r3.f12561w = r7
            r3.f12560v = r8
            r3.f12562x = r9
            r3.B = r10
            r3.A = r11
            r3.f12564z = r12
            r3.C = r13
            r3.E = r14
            r3.H = r15
            r0 = r16
            r3.F = r0
            r0 = r17
            r3.I = r0
            r0 = r18
            r3.M = r0
            r0 = r19
            r3.K = r0
            r0 = r20
            r3.J = r0
            r0 = r21
            r3.O = r0
            r2 = 0
            if (r8 == 0) goto L46
            int r1 = r4 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r5
            r0 = 1
            r1 = r22
            if (r1 == r0) goto L47
        L46:
            r0 = r2
        L47:
            r3.R = r0
            r0 = r23
            r3.Q = r0
            r0 = r24
            r3.U = r0
            r0 = r25
            r3.T = r0
            r0 = r26
            r3.V = r0
            r0 = r27
            r3.X = r0
            r0 = r28
            r3.W = r0
            r0 = r29
            r3.aa = r0
            r0 = r30
            r3.ab = r0
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r3.f12553o
            com.incode.welcome_sdk.commons.utils.l.e(r0)
            boolean r0 = r3.al
            if (r0 == 0) goto L73
            return
        L73:
            r6.downloadQuestionsAndVoiceConsentText(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.onCreate(boolean, boolean, com.incode.welcome_sdk.modules.VideoSelfie$SelfieMode, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, java.util.ArrayList, boolean, boolean, java.lang.String, boolean, int, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0018  */
    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r1 = r1 % r2
            r0 = 1
            if (r1 == 0) goto L33
            super.onResume()
            r3.f12559u = r0
            java.lang.Runnable r0 = r3.f12563y
            if (r0 == 0) goto L29
        L18:
            java.lang.Runnable r0 = r3.f12563y
            r0.run()
            r0 = 0
            r3.f12563y = r0
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r0 + 119
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r2
        L29:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r0 + 37
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r2
            return
        L33:
            super.onResume()
            r3.f12559u = r0
            java.lang.Runnable r0 = r3.f12563y
            if (r0 == 0) goto L29
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.onResume():void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = ar + 111;
        int i4 = i3 % 128;
        an = i4;
        int i5 = i3 % 2;
        this.f12559u = false;
        if (this.f12554p) {
            int i6 = i4 + 97;
            ar = i6 % 128;
            int i7 = i6 % 2;
            this.f12563y = new VideoRecordingPresenter$$ExternalSyntheticLambda18(this);
        }
        super.onPause();
        int i8 = ar + 103;
        an = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 63 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0052  */
    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void prepareVideoSelfieSteps() {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.prepareVideoSelfieSteps():void");
    }

    private List<IScanStep> c() {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (this.f12553o.getIdType(IdCategory.FIRST) == IdScan.IdType.PASSPORT) {
            arrayList.add(new Passport(this.f12548j, this.f12553o, this.f12547h, getDetectionScheduler()));
            int i3 = an + 27;
            ar = i3 % 128;
            int i4 = i3 % 2;
        } else {
            arrayList.add(new FrontId(this.f12548j, this.f12553o, this.f12547h, this.F, this.G, getDetectionScheduler(), this.V, this.X));
            arrayList.add(new BackId(this.f12548j, this.f12553o, this.f12547h, this.I, this.L, getDetectionScheduler(), this.W, this.aa));
        }
        return arrayList;
    }

    private List<IScanStep> a() {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Selfie(this.f12548j, this, this.f12553o, this.f12549k, this.B, this.A, this.f12564z, this.C, this.E, this.R, this.f12562x, this.D, this.f12555q));
        int i3 = an + 31;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 83 / 0;
        }
        return arrayList;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public void start() {
        int i2 = 2 % 2;
        int i3 = ar + 55;
        an = i3 % 128;
        int i4 = i3 % 2;
        this.f12554p = true;
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        b(421697556, iD, DaggerVideoRecordingComponent.b.d(), iD2, -421697552, new Object[]{this}, iD3);
        int i5 = ar + 53;
        an = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public boolean isStarted() {
        int i2 = 2 % 2;
        int i3 = ar + 21;
        int i4 = i3 % 128;
        an = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.f12554p;
        int i5 = i4 + 5;
        ar = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        VideoRecordingPresenter videoRecordingPresenter = (VideoRecordingPresenter) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        int i3 = ar + 13;
        an = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (iIntValue >= videoRecordingPresenter.T) {
                videoRecordingPresenter.f12551m.clear();
                videoRecordingPresenter.f12548j.onError(new MaxVideoLengthReachedException());
                int i4 = an + 87;
                ar = i4 % 128;
                int i5 = i4 % 2;
            }
            return null;
        }
        int i6 = videoRecordingPresenter.T;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public boolean skipProcessingFrame() {
        int i2 = 2 % 2;
        IScanStep iScanStep = this.f12557s;
        if (iScanStep == null) {
            return true;
        }
        if (iScanStep.processesFrames()) {
            return false;
        }
        if (this.f12557s.isComplete()) {
            h();
            int i3 = ar + 45;
            an = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = an + 19;
        ar = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onCameraSizeParamsChanged(int i2, int i3, int i4, int i5, f.c cVar, int i6) {
        int i7 = 2 % 2;
        int i8 = an + 103;
        ar = i8 % 128;
        if (i8 % 2 == 0) {
            super.onCameraSizeParamsChanged(i2, i3, i4, i5, cVar, i6);
            int i9 = 22 / 0;
        } else {
            super.onCameraSizeParamsChanged(i2, i3, i4, i5, cVar, i6);
        }
        int i10 = ar + 87;
        an = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public Observable<Object> processPreviewFrame(Observable<Bitmap> observable, final Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = an + 27;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 40 / 0;
            return observable.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda21
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.b(runnable, (Bitmap) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda22
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.b(runnable, (ScanResult) obj);
                }
            });
        }
        return observable.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda21
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b(runnable, (Bitmap) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda22
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b(runnable, (ScanResult) obj);
            }
        });
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        VideoRecordingPresenter videoRecordingPresenter = (VideoRecordingPresenter) objArr[0];
        ScanResult scanResult = (ScanResult) objArr[1];
        int i2 = 2 % 2;
        if (videoRecordingPresenter.R) {
            int i3 = an + 105;
            ar = i3 % 128;
            int i4 = i3 % 2;
            if (videoRecordingPresenter.S == VoiceConsentFaceRecognitionState.f12225c) {
                int i5 = an + 73;
                ar = i5 % 128;
                if (i5 % 2 == 0) {
                    ScanResult scanResult2 = ScanResult.FINISHED_WITH_ERROR;
                    throw null;
                }
                if (scanResult == ScanResult.FINISHED_WITH_ERROR) {
                    int i6 = an + 49;
                    ar = i6 % 128;
                    int i7 = i6 % 2;
                    videoRecordingPresenter.g();
                }
            }
        }
        return null;
    }

    private void c(ScanResult scanResult) {
        int i2 = 2 % 2;
        int i3 = an + 45;
        ar = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass3.f12565a[scanResult.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                f();
                return;
            } else {
                if (i5 != 3) {
                    return;
                }
                enableProcessing(false);
                return;
            }
        }
        h();
        int i6 = ar + 29;
        an = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public void onDetectionError(Throwable th) {
        int i2 = 2 % 2;
        int i3 = ar + 107;
        an = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th);
        int i5 = ar + 53;
        an = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0025  */
    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBackPressed() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep r2 = r4.f12557s
            boolean r0 = r2 instanceof com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Selfie
            if (r0 != 0) goto L25
            boolean r0 = r2 instanceof com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Passport
            if (r0 != 0) goto L25
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r0 + 9
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L41
            boolean r1 = r2 instanceof com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId
            r0 = 62
            int r0 = r0 / 0
            r0 = 1
            if (r1 == r0) goto L25
        L21:
            boolean r0 = r2 instanceof com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.BackId
            if (r0 == 0) goto L37
        L25:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r4.f12553o
            r2.logProcessingEvents(r0)
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L37
            int r0 = r3 / 4
        L37:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r1 = r1 % r3
            return
        L41:
            boolean r0 = r2 instanceof com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.FrontId
            if (r0 != 0) goto L25
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.onBackPressed():void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public void publishResult(VideoSelfieResult videoSelfieResult) {
        int i2 = 2 % 2;
        int i3 = ar + 73;
        an = i3 % 128;
        if (i3 % 2 == 0) {
            publishResult(IncodeWelcome.getInstance().getVideoSelfieBus(), videoSelfieResult);
            int i4 = an + 25;
            ar = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        publishResult(IncodeWelcome.getInstance().getVideoSelfieBus(), videoSelfieResult);
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public void setMinFaceWidth(float f2) {
        int i2 = 2 % 2;
        IScanStep iScanStep = this.f12557s;
        if (!(iScanStep instanceof Selfie)) {
            if (iScanStep instanceof VoiceConsent) {
                int i3 = an + 77;
                ar = i3 % 128;
                int i4 = i3 % 2;
                ((VoiceConsent) iScanStep).setMinFaceWidth(f2);
            }
            int i5 = an + 67;
            ar = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = ar + 113;
        an = i7 % 128;
        int i8 = i7 % 2;
        ((Selfie) iScanStep).setMinFaceWidth(f2);
    }

    private void c(List<IScanStep> list) {
        int i2 = 2 % 2;
        int i3 = ar + 97;
        an = i3 % 128;
        if (i3 % 2 == 0) {
            this.f12556r = list;
            this.f12557s = e();
            int i4 = ar + 49;
            an = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.f12556r = list;
        this.f12557s = e();
        throw null;
    }

    private IScanStep e() {
        int i2 = 2 % 2;
        int i3 = ar + 17;
        an = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (this.f12557s == null) {
                this.f12558t = 0;
            } else {
                this.f12558t++;
            }
            if (this.f12558t >= this.f12556r.size()) {
                int i4 = an + 67;
                ar = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            return this.f12556r.get(this.f12558t);
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public IScanStep getPreviousStep() {
        int i2 = 2 % 2;
        int i3 = ar;
        int i4 = i3 + 3;
        an = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            int i5 = this.f12558t;
            if (i5 <= 0) {
                int i6 = i3 + 57;
                an = i6 % 128;
                if (i6 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            return this.f12556r.get(i5 - 1);
        }
        throw null;
    }

    public /* synthetic */ void t() {
        int i2 = 2 % 2;
        int i3 = an + 15;
        ar = i3 % 128;
        int i4 = i3 % 2;
        IScanStep iScanStepE = e();
        this.f12557s = iScanStepE;
        Object obj = null;
        if (iScanStepE instanceof VoiceConsent) {
            int i5 = an + 77;
            ar = i5 % 128;
            if (i5 % 2 != 0) {
                n();
                o();
                tagRecordingSegmentROIStart();
            } else {
                n();
                o();
                tagRecordingSegmentROIStart();
                obj.hashCode();
                throw null;
            }
        }
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        b(421697556, iD, DaggerVideoRecordingComponent.b.d(), iD2, -421697552, new Object[]{this}, iD3);
        int i6 = an + 31;
        ar = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public void b() {
        int i2 = 2 % 2;
        if (this.f12554p) {
            int i3 = an;
            int i4 = i3 + 47;
            ar = i4 % 128;
            int i5 = i4 % 2;
            if (!this.f12559u) {
                int i6 = i3 + 25;
                ar = i6 % 128;
                int i7 = i6 % 2;
                d();
                return;
            }
        }
        e(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.t();
            }
        });
        int i8 = ar + 85;
        an = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public Point getDesiredPreviewSize(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ar + 115;
        an = i3 % 128;
        if (i3 % 2 != 0) {
            this.f12557s.getDesiredPreviewSize(z2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Point desiredPreviewSize = this.f12557s.getDesiredPreviewSize(z2);
        int i4 = an + 115;
        ar = i4 % 128;
        int i5 = i4 % 2;
        return desiredPreviewSize;
    }

    private void e(Runnable runnable) {
        int i2 = 2 % 2;
        IScanStep iScanStep = this.f12557s;
        Object obj = null;
        if (iScanStep == null) {
            runnable.run();
            int i3 = ar + 111;
            an = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = an + 73;
        ar = i4 % 128;
        if (i4 % 2 != 0) {
            iScanStep.cleanup(runnable);
        } else {
            iScanStep.cleanup(runnable);
            obj.hashCode();
            throw null;
        }
    }

    private void d() {
        int i2 = 2 % 2;
        int i3 = ar + 103;
        an = i3 % 128;
        int i4 = i3 % 2;
        this.f12563y = new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        };
        int i5 = ar + 83;
        an = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private void i() {
        int i2 = 2 % 2;
        int i3 = an + 39;
        ar = i3 % 128;
        if (i3 % 2 != 0) {
            IScanStep iScanStep = this.f12557s;
            if (iScanStep != null) {
                iScanStep.cleanup(new VideoRecordingPresenter$$ExternalSyntheticLambda18(this));
                int i4 = ar + 3;
                an = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        throw null;
    }

    public /* synthetic */ void d(Long l2) throws Exception {
        int i2 = 2 % 2;
        if (((VoiceConsent) this.f12557s).isProcessingInProgress()) {
            return;
        }
        int i3 = an + 111;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12223a);
            throw null;
        }
        setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12223a);
        int i4 = ar + 1;
        an = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ void r() {
        int i2 = 2 % 2;
        int i3 = ar + 107;
        an = i3 % 128;
        int i4 = i3 % 2;
        this.f12557s.start();
        Object obj = null;
        if ((this.f12557s instanceof VoiceConsent) && !(!this.R)) {
            this.f12552n.add(Single.timer(2000L, TimeUnit.MILLISECONDS).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) throws Exception {
                    this.f$0.d((Long) obj2);
                }
            }));
            int i5 = an + 77;
            ar = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        enableProcessing(true);
        int i6 = an + 35;
        ar = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0019, code lost:
    
        if (r3.f12557s != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0021, code lost:
    
        if (r3.f12557s.isSkipped() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0023, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar + 65;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r1 % 128;
        r1 = r1 % 2;
        r3.b();
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an + 105;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0038, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        if (r3.f12557s != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003e, code lost:
    
        r3.f12548j.reconfigureCamera(r3.f12557s.getCameraFacing(), new com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda4(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        r3.f12548j.setBackgroundFullscreenOverlayVisible(true);
        r3.n();
        r3.f12548j.stopVideoRecording();
        r3.f12548j.done();
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an + 55;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        if ((r1 % 2) == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object a(java.lang.Object[] r6) {
        /*
            r5 = 0
            r3 = r6[r5]
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter r3 = (com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter) r3
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r1 = r1 % r2
            r4 = 0
            if (r1 == 0) goto L39
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep r1 = r3.f12557s
            r0 = 12
            int r0 = r0 / r5
            if (r1 == 0) goto L4f
        L1b:
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep r0 = r3.f12557s
            boolean r0 = r0.isSkipped()
            if (r0 == 0) goto L3e
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r1 = r1 % r2
            r3.b()
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r2
            return r4
        L39:
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep r0 = r3.f12557s
            if (r0 == 0) goto L4f
            goto L1b
        L3e:
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r2 = r3.f12548j
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep r0 = r3.f12557s
            int r1 = r0.getCameraFacing()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda4 r0 = new com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda4
            r0.<init>()
            r2.reconfigureCamera(r1, r0)
            return r4
        L4f:
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r1 = r3.f12548j
            r0 = 1
            r1.setBackgroundFullscreenOverlayVisible(r0)
            r3.n()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r3.f12548j
            r0.stopVideoRecording()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r3.f12548j
            r0.done()
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r0 + 55
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L6e
            return r4
        L6e:
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.a(java.lang.Object[]):java.lang.Object");
    }

    private void h() {
        int i2 = 2 % 2;
        int i3 = ar + 73;
        an = i3 % 128;
        int i4 = i3 % 2;
        a(false);
        int i5 = ar + 71;
        an = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0019, code lost:
    
        if (r5 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001b, code lost:
    
        r2 = r4.f12557s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x001f, code lost:
    
        if ((r2 instanceof com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Done) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0021, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar + 61;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        if (r4.al == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002f, code lost:
    
        r2.showWinState();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0032, code lost:
    
        m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        if (r5 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an + 25;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r1 % 128;
        r1 = r1 % 2;
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(boolean r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r0 + 125
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r3
            r0 = 0
            if (r1 != 0) goto L36
            r4.enableProcessing(r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep r1 = r4.f12557s
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r4.f12553o
            r1.logServerEventSuccess(r0)
            if (r5 != 0) goto L42
        L1b:
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep r2 = r4.f12557s
            boolean r0 = r2 instanceof com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.Done
            if (r0 == 0) goto L2f
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r1 = r1 % r3
            boolean r1 = r4.al
            r0 = 1
            if (r1 == r0) goto L32
        L2f:
            r2.showWinState()
        L32:
            r4.m()
            return
        L36:
            r4.enableProcessing(r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps.IScanStep r1 = r4.f12557s
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r4.f12553o
            r1.logServerEventSuccess(r0)
            if (r5 == 0) goto L1b
        L42:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r0 + 25
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r3
            r4.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.a(boolean):void");
    }

    private void f() {
        int i2 = 2 % 2;
        int i3 = an + 107;
        ar = i3 % 128;
        int i4 = i3 % 2;
        enableProcessing(false);
        this.f12557s.showDoneStateWithError();
        m();
        int i5 = ar + 5;
        an = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
    }

    private void g() {
        int i2 = 2 % 2;
        enableProcessing(false);
        n();
        this.f12548j.stopVideoRecording();
        this.f12548j.onVoiceConsentTotalFailure(new FacesNotMatchedException());
        int i3 = ar + 51;
        an = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* synthetic */ void a(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ar + 3;
        an = i3 % 128;
        int i4 = i3 % 2;
        b();
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = an + 49;
        ar = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
    }

    private void m() {
        int i2 = 2 % 2;
        int i3 = an + 75;
        ar = i3 % 128;
        int i4 = i3 % 2;
        this.f12552n.add(Observable.timer(2000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.a((Long) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda12
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Timber.e((Throwable) obj);
            }
        }));
        int i5 = ar + 123;
        an = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0020  */
    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar
            int r1 = r0 + 73
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L32
            io.reactivex.disposables.CompositeDisposable r0 = r3.f12552n
            r0.clear()
            io.reactivex.disposables.CompositeDisposable r0 = r3.f12551m
            r0.clear()
            boolean r1 = r3.U
            r0 = 88
            int r0 = r0 / 0
            if (r1 != 0) goto L2c
        L20:
            r3.n()
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r2
        L2c:
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r3.f12548j
            r0.stopVideoRecording()
            return
        L32:
            io.reactivex.disposables.CompositeDisposable r0 = r3.f12552n
            r0.clear()
            io.reactivex.disposables.CompositeDisposable r0 = r3.f12551m
            r0.clear()
            boolean r1 = r3.U
            r0 = 1
            if (r1 == r0) goto L2c
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.onDestroy():void");
    }

    public String getAudioRecordingFileName(int i2) {
        int i3 = 2 % 2;
        String string = new StringBuilder().append(this.f12553o.getImagesDirectory().getPath()).append(String.format(Locale.US, "/%d.mp4", Integer.valueOf(i2))).toString();
        int i4 = an + 39;
        ar = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void o() {
        /*
            r11 = this;
            r10 = 2
            int r0 = r10 % r10
            android.media.MediaRecorder r0 = new android.media.MediaRecorder
            r0.<init>()
            r11.ac = r0
            r5 = 1
            r0.setAudioSource(r5)
            android.media.MediaRecorder r0 = r11.ac
            r4 = 0
            r0.setOutputFormat(r4)
            android.media.MediaRecorder r1 = r11.ac
            int r0 = r11.Y
            java.lang.String r0 = r11.getAudioRecordingFileName(r0)
            r1.setOutputFile(r0)
            android.media.MediaRecorder r1 = r11.ac
            r0 = 3
            r1.setAudioEncoder(r0)
            r3 = 300(0x12c, float:4.2E-43)
            r2 = 1000(0x3e8, float:1.401E-42)
            r1 = 50
            r0 = 100
            int[] r9 = new int[]{r1, r0, r3, r2}
            r6 = r4
            r7 = r6
        L33:
            r3 = 4
            android.media.MediaRecorder r0 = r11.ac     // Catch: java.lang.Exception -> L45
            r0.prepare()     // Catch: java.lang.Exception -> L45
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r0 + 41
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r10
            r7 = r4
            r8 = r7
            goto L6f
        L45:
            r2 = move-exception
            goto L49
        L47:
            r2 = move-exception
            r7 = r5
        L49:
            java.lang.String r1 = "Failed to prepare MediaRecorder for audio recording"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            timber.log.Timber.e(r2, r1, r0)
            int r2 = r6 + 1
            r0 = r9[r6]     // Catch: java.lang.InterruptedException -> L59
            long r0 = (long) r0     // Catch: java.lang.InterruptedException -> L59
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L59
            goto L5d
        L59:
            r0 = move-exception
            r0.printStackTrace()
        L5d:
            r6 = r2
            goto L62
        L5f:
            if (r7 < r3) goto L6f
        L61:
            r7 = r5
        L62:
            if (r7 != 0) goto L6e
            int r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar
            int r1 = r1 + r5
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r1 = r1 % r10
            if (r6 < r3) goto L33
        L6e:
            return
        L6f:
            android.media.MediaRecorder r0 = r11.ac     // Catch: java.lang.Exception -> L78
            r0.start()     // Catch: java.lang.Exception -> L78
            r11.l()     // Catch: java.lang.Exception -> L78
            goto L95
        L78:
            r2 = move-exception
            java.lang.String r1 = "Start failed, startRecordingCount: %s"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L47
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L47
            timber.log.Timber.e(r2, r1, r0)     // Catch: java.lang.Exception -> L47
            int r2 = r7 + 1
            r0 = r9[r7]     // Catch: java.lang.Exception -> L47 java.lang.InterruptedException -> L8f
            long r0 = (long) r0     // Catch: java.lang.Exception -> L47 java.lang.InterruptedException -> L8f
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L47 java.lang.InterruptedException -> L8f
            goto L93
        L8f:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Exception -> L47
        L93:
            r7 = r2
            goto L96
        L95:
            r8 = r5
        L96:
            if (r8 != 0) goto L61
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar
            int r1 = r0 + 25
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r1 = r1 % r10
            if (r1 == 0) goto La6
            r0 = 77
            goto La9
        La6:
            if (r7 < r3) goto L6f
            goto L61
        La9:
            int r0 = r0 / r4
            goto L5f
        Lab:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.o():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r0 = r0 + 1
            int r2 = r0 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r2
            int r0 = r0 % r3
            if (r0 != 0) goto L20
            android.media.MediaRecorder r1 = r4.ac
            r0 = 3
            int r0 = r0 / 0
            if (r1 == 0) goto L6b
        L15:
            int r1 = r2 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 == 0) goto L25
            goto L30
        L20:
            android.media.MediaRecorder r0 = r4.ac
            if (r0 == 0) goto L6b
            goto L15
        L25:
            android.media.MediaRecorder r0 = r4.ac     // Catch: java.lang.RuntimeException -> L3b java.lang.Throwable -> L57
            r0.stop()     // Catch: java.lang.RuntimeException -> L3b java.lang.Throwable -> L57
            io.reactivex.disposables.CompositeDisposable r0 = r4.f12550l     // Catch: java.lang.RuntimeException -> L3b java.lang.Throwable -> L57
            r0.clear()     // Catch: java.lang.RuntimeException -> L3b java.lang.Throwable -> L57
            goto L4f
        L30:
            android.media.MediaRecorder r0 = r4.ac     // Catch: java.lang.RuntimeException -> L3b java.lang.Throwable -> L57
            r0.stop()     // Catch: java.lang.RuntimeException -> L3b java.lang.Throwable -> L57
            io.reactivex.disposables.CompositeDisposable r0 = r4.f12550l     // Catch: java.lang.RuntimeException -> L3b java.lang.Throwable -> L57
            r0.clear()     // Catch: java.lang.RuntimeException -> L3b java.lang.Throwable -> L57
            goto L60
        L3b:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L57
            int r0 = r4.Y     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r4.getAudioRecordingFileName(r0)     // Catch: java.lang.Throwable -> L57
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L57
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L4f
            r1.delete()     // Catch: java.lang.Throwable -> L57
        L4f:
            android.media.MediaRecorder r0 = r4.ac
            r0.release()
            r4.ac = r2
            goto L6b
        L57:
            r1 = move-exception
            android.media.MediaRecorder r0 = r4.ac
            r0.release()
            r4.ac = r2
            throw r1
        L60:
            android.media.MediaRecorder r0 = r4.ac
            r0.release()
            r4.ac = r2
            r0 = 71
            int r0 = r0 / 0
        L6b:
            r4.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.n():void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public void restartAudioRecording() {
        int i2 = 2 % 2;
        int i3 = ar + 89;
        an = i3 % 128;
        if (i3 % 2 == 0) {
            n();
            o();
        } else {
            n();
            o();
            throw null;
        }
    }

    private void l() {
        int i2 = 2 % 2;
        int i3 = ar + 55;
        an = i3 % 128;
        if (i3 % 2 == 0) {
            this.af.add(Long.valueOf(System.currentTimeMillis()));
            int i4 = an + 85;
            ar = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 51 / 0;
                return;
            }
            return;
        }
        this.af.add(Long.valueOf(System.currentTimeMillis()));
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public void tagRecordingSegmentROIStart() {
        int i2 = 2 % 2;
        int i3 = ar + 55;
        an = i3 % 128;
        int i4 = i3 % 2;
        this.ag.add(Long.valueOf(System.currentTimeMillis()));
        int i5 = an + 3;
        ar = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private void k() {
        int i2;
        int i3 = 2 % 2;
        int i4 = ar + 105;
        an = i4 % 128;
        if (i4 % 2 != 0) {
            this.ae.add(Long.valueOf(System.currentTimeMillis()));
            i2 = this.Y % 0;
        } else {
            this.ae.add(Long.valueOf(System.currentTimeMillis()));
            i2 = this.Y + 1;
        }
        this.Y = i2;
        int i5 = an + 7;
        ar = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public void onTapWhenDoneButtonClicked() {
        int i2 = 2 % 2;
        setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState.f12227e);
        if (this.R) {
            IScanStep iScanStep = this.f12557s;
            if (iScanStep instanceof VoiceConsent) {
                int i3 = ar + 113;
                an = i3 % 128;
                int i4 = i3 % 2;
                VoiceConsent voiceConsent = (VoiceConsent) iScanStep;
                if (voiceConsent.isSubmitVoiceConsentAudioAllowed()) {
                    this.f12548j.continueWithVoiceConsentAnswerProcess();
                    return;
                }
                Object[] objArr = {this, voiceConsent.lastFrameNotMatched()};
                b(-40266684, DaggerVideoRecordingComponent.b.d(), DaggerVideoRecordingComponent.b.d(), DaggerVideoRecordingComponent.b.d(), 40266692, objArr, DaggerVideoRecordingComponent.b.d());
                return;
            }
            return;
        }
        int i5 = ar + 73;
        an = i5 % 128;
        if (i5 % 2 == 0) {
            this.f12548j.continueWithVoiceConsentAnswerProcess();
        } else {
            this.f12548j.continueWithVoiceConsentAnswerProcess();
            throw null;
        }
    }

    public /* synthetic */ void a(File file) throws Exception {
        int i2 = 2 % 2;
        l lVar = l.f6529e;
        File imagesDirectory = this.f12553o.getImagesDirectory();
        Object[] objArr = new Object[1];
        ao("\ue4e0ⴳ펌半텑\ue271떠\ue907", (ViewConfiguration.getTouchSlop() >> 8) + 8, objArr);
        l.c(file, new File(imagesDirectory, ((String) objArr[0]).intern()));
        h();
        int i3 = an + 107;
        ar = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* synthetic */ ObservableSource e(File file) throws Exception {
        int i2 = 2 % 2;
        l lVar = l.f6529e;
        File imagesDirectory = this.f12553o.getImagesDirectory();
        Object[] objArr = new Object[1];
        ao("\ue4e0ⴳ펌半텑\ue271떠\ue907", 7 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        l.c(file, new File(imagesDirectory, ((String) objArr[0]).intern()));
        Observable<ResponseSuccess> observableSubscribeOn = this.f12553o.addSpeech(file).subscribeOn(Schedulers.io());
        int i3 = an + 47;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return observableSubscribeOn;
    }

    public /* synthetic */ void a(VoiceConsent voiceConsent, ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        Timber.d("Voice consent success: %s", Boolean.valueOf(responseSuccess.isSuccess()));
        Object obj = null;
        if (!responseSuccess.isSuccess()) {
            voiceConsent.setProcessing(false);
            a(new AudioNotMatchedException());
            int i3 = an + 75;
            ar = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = an + 1;
        ar = i4 % 128;
        if (i4 % 2 != 0) {
            h();
        } else {
            h();
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ void e(VoiceConsent voiceConsent, Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = an + 81;
        ar = i3 % 128;
        int i4 = i3 % 2;
        if (th instanceof NoConnectivityException) {
            Timber.e(th, "No network error for voice consent", new Object[0]);
            this.f12548j.showNoNetworkMessage(VideoSelfieScanState.f12204j);
            int i5 = an + 53;
            ar = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        voiceConsent.setProcessing(false);
        a(th);
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public void onVoiceConsentContinueClicked() {
        int i2 = 2 % 2;
        int i3 = ar + 125;
        an = i3 % 128;
        int i4 = i3 % 2;
        final VoiceConsent voiceConsent = (VoiceConsent) this.f12557s;
        voiceConsent.setProcessing(true);
        if (!this.al) {
            this.f12552n.add(q().flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda7
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e((File) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda8
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.a(voiceConsent, (ResponseSuccess) obj);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda9
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.e(voiceConsent, (Throwable) obj);
                }
            }));
            int i5 = an + 99;
            ar = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = an + 51;
        ar = i7 % 128;
        if (i7 % 2 != 0) {
            this.f12552n.add(q().subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.a((File) obj);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b(voiceConsent, (Throwable) obj);
                }
            }));
        } else {
            this.f12552n.add(q().subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.a((File) obj);
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b(voiceConsent, (Throwable) obj);
                }
            }));
            int i8 = 80 / 0;
        }
    }

    private Observable<File> q() {
        Observable<Long> observableDoOnNext;
        Function function;
        int i2 = 2 % 2;
        int i3 = an + 57;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            observableDoOnNext = Observable.timer(0L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda19
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b((Long) obj);
                }
            });
            function = new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda20
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.c((Long) obj);
                }
            };
        } else {
            observableDoOnNext = Observable.timer(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda19
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.b((Long) obj);
                }
            });
            function = new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda20
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.c((Long) obj);
                }
            };
        }
        Observable map = observableDoOnNext.map(function);
        int i4 = an + 41;
        ar = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return map;
    }

    public /* synthetic */ void b(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = an + 63;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            n();
            o();
            int i4 = 87 / 0;
        } else {
            n();
            o();
        }
        int i5 = ar + 115;
        an = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ File c(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ar + 121;
        an = i3 % 128;
        int i4 = i3 % 2;
        File fileC = c(this.ae.size() - 1);
        int i5 = an + 9;
        ar = i5 % 128;
        int i6 = i5 % 2;
        return fileC;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public void onSpeechToTextTryAgainClicked() {
        int i2 = 2 % 2;
        int i3 = an + 59;
        ar = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            i();
            tagRecordingSegmentROIStart();
            int i4 = an + 35;
            ar = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        i();
        tagRecordingSegmentROIStart();
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public void onContinueClicked() {
        int i2 = 2 % 2;
        int i3 = an + 41;
        ar = i3 % 128;
        int i4 = i3 % 2;
        this.f12557s.onContinueClicked();
        if (this.f12557s.isComplete()) {
            int i5 = an + 17;
            ar = i5 % 128;
            int i6 = i5 % 2;
            a(true);
        }
    }

    public VoiceConsentFaceRecognitionState getVoiceConsentFaceRecognitionState() {
        int i2 = 2 % 2;
        int i3 = an + 111;
        int i4 = i3 % 128;
        ar = i4;
        int i5 = i3 % 2;
        VoiceConsentFaceRecognitionState voiceConsentFaceRecognitionState = this.S;
        int i6 = i4 + 11;
        an = i6 % 128;
        int i7 = i6 % 2;
        return voiceConsentFaceRecognitionState;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$3 */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f12565a;

        /* JADX INFO: renamed from: b */
        private static int f12566b = 0;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f12567c;

        /* JADX INFO: renamed from: e */
        private static int f12568e = 1;

        static {
            int[] iArr = new int[VoiceConsentFaceRecognitionState.values().length];
            f12567c = iArr;
            try {
                iArr[VoiceConsentFaceRecognitionState.f12223a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12567c[VoiceConsentFaceRecognitionState.f12226d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12567c[VoiceConsentFaceRecognitionState.f12227e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12567c[VoiceConsentFaceRecognitionState.f12225c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ScanResult.valuesCustom().length];
            f12565a = iArr2;
            try {
                iArr2[ScanResult.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12565a[ScanResult.FINISHED_WITH_ERROR.ordinal()] = 2;
                int i2 = f12568e + 3;
                f12566b = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 / 4;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12565a[ScanResult.ERROR.ordinal()] = 3;
                int i5 = f12568e + 97;
                f12566b = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public void setVoiceConsentFaceRecognitionState(VoiceConsentFaceRecognitionState voiceConsentFaceRecognitionState) {
        int i2 = 2 % 2;
        Timber.d("VoiceConsent state %s", voiceConsentFaceRecognitionState);
        this.S = voiceConsentFaceRecognitionState;
        int i3 = AnonymousClass3.f12567c[voiceConsentFaceRecognitionState.ordinal()];
        Object obj = null;
        if (i3 == 1 || i3 == 2) {
            enableProcessing(true);
            int i4 = an + 97;
            ar = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i3 == 3 || i3 == 4) {
            enableProcessing(false);
        }
        int i5 = ar + 107;
        an = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0013, code lost:
    
        if (r1 == 5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:
    
        b(r4);
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an + 57;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0021, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        if (r1 == 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        r3.f12548j.showTextToSpeechInstructions();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0031, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.Throwable r4) {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar
            int r1 = r0 + 99
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L22
            int r1 = r3.ad
            r3.ad = r1
            r0 = 5
            if (r1 != r0) goto L2c
        L15:
            r3.b(r4)
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r2
            return
        L22:
            int r0 = r3.ad
            int r1 = r0 + 1
            r3.ad = r1
            r0 = 3
            if (r1 != r0) goto L2c
            goto L15
        L2c:
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r3.f12548j
            r0.showTextToSpeechInstructions()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.a(java.lang.Throwable):void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public void onVoiceConsentDialogTryAgain() {
        int i2 = 2 % 2;
        int i3 = an + 59;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            this.ad = 0;
        } else {
            int i4 = this.ad + 1;
            this.ad = i4;
            if (i4 == 3) {
                b(new AudioNotMatchedException());
                return;
            }
        }
        restartAudioRecording();
        onSpeechToTextTryAgainClicked();
        int i5 = ar + 7;
        an = i5 % 128;
        int i6 = i5 % 2;
    }

    private void b(Throwable th) {
        int i2 = 2 % 2;
        int i3 = ar + 105;
        an = i3 % 128;
        int i4 = i3 % 2;
        n();
        this.f12548j.stopVideoRecording();
        this.f12548j.onVoiceConsentTotalFailure(th);
        int i5 = an + 81;
        ar = i5 % 128;
        int i6 = i5 % 2;
    }

    private File c(int i2) {
        int i3 = 2 % 2;
        long jLongValue = this.ag.get(i2).longValue() - this.af.get(i2).longValue();
        long jLongValue2 = this.ae.get(i2).longValue() - this.af.get(i2).longValue();
        String audioRecordingFileName = getAudioRecordingFileName(i2);
        String string = new StringBuilder().append(this.f12553o.getImagesDirectory().getPath()).append(RemoteSettings.FORWARD_SLASH_STRING).append(i2).append("audio.mp4").toString();
        an anVar = an.f6429c;
        Timber.d("Trim audio success: %s", Boolean.valueOf(an.b(audioRecordingFileName, string, jLongValue, jLongValue2, "audio")));
        File file = new File(string);
        int i4 = ar + 31;
        an = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return file;
    }

    public /* synthetic */ void d(Throwable th) throws Exception {
        int i2 = 2 % 2;
        publishResult(new VideoSelfieResult(ResultCode.EMULATOR_DETECTED));
        int i3 = ar + 31;
        an = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 39 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r5) {
        /*
            r3 = 0
            r4 = r5[r3]
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter r4 = (com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter) r4
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar = r0
            int r1 = r1 % r2
            r5 = 0
            if (r1 != 0) goto L22
            com.incode.welcome_sdk.IncodeWelcome r0 = com.incode.welcome_sdk.IncodeWelcome.getInstance()
            boolean r1 = r0.isTestMode()
            r0 = 8
            int r0 = r0 / r3
            if (r1 != 0) goto L2c
        L21:
            return r5
        L22:
            com.incode.welcome_sdk.IncodeWelcome r0 = com.incode.welcome_sdk.IncodeWelcome.getInstance()
            boolean r0 = r0.isTestMode()
            if (r0 == 0) goto L21
        L2c:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar
            int r3 = r0 + 29
            int r0 = r3 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r3 = r3 % r2
            r1 = 2000(0x7d0, double:9.88E-321)
            if (r3 != 0) goto L5b
            io.reactivex.disposables.CompositeDisposable r3 = r4.f12552n
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Observable r1 = io.reactivex.Observable.timer(r1, r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r2 = r1.observeOn(r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda14 r1 = new com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda14
            r1.<init>()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda15 r0 = new com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda15
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r2.subscribe(r1, r0)
            r3.add(r0)
            goto L21
        L5b:
            io.reactivex.disposables.CompositeDisposable r3 = r4.f12552n
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Observable r1 = io.reactivex.Observable.timer(r1, r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r2 = r1.observeOn(r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda14 r1 = new com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda14
            r1.<init>()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda15 r0 = new com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda15
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r2.subscribe(r1, r0)
            r3.add(r0)
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.b(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ SingleSource c(File file, Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = an + 29;
        ar = i3 % 128;
        if (i3 % 2 != 0) {
            return Single.just(file);
        }
        Single.just(file);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0014, code lost:
    
        if (r4.al != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0016, code lost:
    
        r4.f12548j.showAllDone();
        r2 = io.reactivex.Single.timer(1000, java.util.concurrent.TimeUnit.MILLISECONDS).flatMap(new com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda3(r5));
        r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar + 91;
        com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r4.al != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        return io.reactivex.Single.just(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ io.reactivex.SingleSource b(final java.io.File r5) throws java.lang.Exception {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L36
            boolean r1 = r4.al
            r0 = 40
            int r0 = r0 / 0
            if (r1 == 0) goto L3b
        L16:
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract$View r0 = r4.f12548j
            r0.showAllDone()
            r1 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Single r1 = io.reactivex.Single.timer(r1, r0)
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda3 r0 = new com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda3
            r0.<init>()
            io.reactivex.Single r2 = r1.flatMap(r0)
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.ar
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.an = r0
            int r1 = r1 % r3
            return r2
        L36:
            boolean r0 = r4.al
            if (r0 == 0) goto L3b
            goto L16
        L3b:
            io.reactivex.Single r0 = io.reactivex.Single.just(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter.b(java.io.File):io.reactivex.SingleSource");
    }

    public /* synthetic */ void d(VideoSelfieResult videoSelfieResult, File file) throws Exception {
        int i2 = 2 % 2;
        this.f12548j.onCompletedConcatAudioVideo(new VideoSelfieResult(videoSelfieResult.resultCode, videoSelfieResult.error));
        int i3 = ar + 29;
        an = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 10 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract.Presenter
    public void concatAudioVideo(final VideoSelfieResult videoSelfieResult) {
        int i2 = 2 % 2;
        int i3 = ar + 61;
        an = i3 % 128;
        int i4 = i3 % 2;
        this.f12548j.showProcessingUi();
        CompositeDisposable compositeDisposable = this.f12552n;
        Single<R> singleFlatMap = an.c(this.f12553o).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b((File) obj);
            }
        });
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.d(videoSelfieResult, (File) obj);
            }
        };
        VideoRecordingContract.View view = this.f12548j;
        Objects.requireNonNull(view);
        compositeDisposable.add(singleFlatMap.subscribe(consumer, new Done$$ExternalSyntheticLambda1(view)));
        int i5 = ar + 71;
        an = i5 % 128;
        int i6 = i5 % 2;
    }

    public void proceedOnError(VideoSelfieResult videoSelfieResult) {
        int i2 = 2 % 2;
        this.f12548j.onCompletedConcatAudioVideo(new VideoSelfieResult(videoSelfieResult.resultCode, videoSelfieResult.error));
        int i3 = ar + 35;
        an = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
    }

    public /* synthetic */ void b(boolean z2, List list) throws Exception {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        String strD = "";
        while (it.hasNext()) {
            bk bkVar = (bk) it.next();
            if (AdkSettings.PLATFORM_TYPE_MOBILE.equals(bkVar.b())) {
                int i3 = ar + 69;
                an = i3 % 128;
                if (i3 % 2 != 0) {
                    strD = bkVar.d();
                    int i4 = 44 / 0;
                } else {
                    strD = bkVar.d();
                }
            } else {
                arrayList.add(bkVar);
            }
        }
        this.ah.onNext(arrayList);
        this.ai.onNext(strD);
        if (!z2) {
            return;
        }
        int i5 = an + 27;
        ar = i5 % 128;
        if (i5 % 2 != 0) {
            start();
        } else {
            start();
            int i6 = 54 / 0;
        }
    }

    public /* synthetic */ void e(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = ar + 63;
        int i4 = i3 % 128;
        an = i4;
        int i5 = i3 % 2;
        if (th instanceof NoConnectivityException) {
            int i6 = i4 + 41;
            ar = i6 % 128;
            if (i6 % 2 != 0) {
                this.f12548j.showNoNetworkMessage(VideoSelfieScanState.f12196b);
                return;
            }
            this.f12548j.showNoNetworkMessage(VideoSelfieScanState.f12196b);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void downloadQuestionsAndVoiceConsentText(final boolean z2) {
        int i2 = 2 % 2;
        int i3 = an + 73;
        ar = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.U) {
            return;
        }
        this.f12552n.add(this.f12553o.getQuestionAndAnswer(this.K, true).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda23
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return ((bp) obj2).c();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda24
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                this.f$0.b(z2, (List) obj2);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) throws Exception {
                this.f$0.e((Throwable) obj2);
            }
        }));
        int i4 = an + 21;
        ar = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        an = 0;
        ar = 1;
        ak = (char) 61626;
        am = (char) 30239;
        aj = (char) 60118;
        ap = (char) 5292;
    }

    public /* synthetic */ void h(Long l2) throws Exception {
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        b(1595787768, iD, DaggerVideoRecordingComponent.b.d(), iD2, -1595787765, new Object[]{this, l2}, iD3);
    }

    public /* synthetic */ ObservableSource b(Runnable runnable, Bitmap bitmap) throws Exception {
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        return (ObservableSource) b(-968831031, iD, DaggerVideoRecordingComponent.b.d(), iD2, 968831032, new Object[]{this, runnable, bitmap}, iD3);
    }

    public /* synthetic */ Object b(Runnable runnable, ScanResult scanResult) throws Exception {
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        return b(98270106, iD, DaggerVideoRecordingComponent.b.d(), iD2, -98270099, new Object[]{this, runnable, scanResult}, iD3);
    }

    public /* synthetic */ void b(VoiceConsent voiceConsent, Throwable th) throws Exception {
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        b(1105650790, iD, DaggerVideoRecordingComponent.b.d(), iD2, -1105650790, new Object[]{this, voiceConsent, th}, iD3);
    }

    public /* synthetic */ void e(Long l2) throws Exception {
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        b(1552485321, iD, DaggerVideoRecordingComponent.b.d(), iD2, -1552485316, new Object[]{this, l2}, iD3);
    }

    private void p() {
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        b(1982917314, iD, DaggerVideoRecordingComponent.b.d(), iD2, -1982917308, new Object[]{this}, iD3);
    }

    public void j() {
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        b(421697556, iD, DaggerVideoRecordingComponent.b.d(), iD2, -421697552, new Object[]{this}, iD3);
    }

    private void a(ScanResult scanResult) {
        int iD = DaggerVideoRecordingComponent.b.d();
        int iD2 = DaggerVideoRecordingComponent.b.d();
        int iD3 = DaggerVideoRecordingComponent.b.d();
        b(-40266684, iD, DaggerVideoRecordingComponent.b.d(), iD2, 40266692, new Object[]{this, scanResult}, iD3);
    }

    private void e(int i2) {
        Object[] objArr = {this, Integer.valueOf(i2)};
        b(1964737557, DaggerVideoRecordingComponent.b.d(), DaggerVideoRecordingComponent.b.d(), DaggerVideoRecordingComponent.b.d(), -1964737555, objArr, DaggerVideoRecordingComponent.b.d());
    }
}
