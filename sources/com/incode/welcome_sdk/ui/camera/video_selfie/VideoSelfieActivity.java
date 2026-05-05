package com.incode.welcome_sdk.ui.camera.video_selfie;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.PermissionsDeniedException;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.d.al;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.modules.VideoSelfie;
import com.incode.welcome_sdk.results.BaseResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.VideoSelfieResult;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.BaseFragmentActivity;
import com.incode.welcome_sdk.ui.camera.CameraFragment;
import com.incode.welcome_sdk.ui.camera.review_photo.DaggerReviewPhotoComponent;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieContract;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgress;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItem;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.sentry.protocol.SentryStackFrame;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfieActivity extends BaseFragmentActivity implements CameraFragment.CameraFragmentInterface, VideoSelfieContract.View, VideoRecordingFragment.VideoSelfieProgressListener, VideoUploadFragment.VideoUploadFragmentInterface, PermissionsMandatoryContract.View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f12160b = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f12161l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f12162m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f12163n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f12164o = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Inject
    public VideoSelfiePresenter f12167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private VideoSelfieProgressAdapter f12168f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private al f12170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private VideoSelfieResult f12172j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScreenName f12166d = ScreenName.VIDEO_SELFIE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Modules f12165c = Modules.VIDEO_ONBOARDING;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CompositeDisposable f12169g = new CompositeDisposable();

    public static /* synthetic */ Object c(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | (~(i8 | i7)) | (~(i9 | i7));
        int i11 = ~(i2 | i8);
        int i12 = i7 | i11 | (~(i9 | i5));
        int i13 = i7 + i5 + i4 + (1997535707 * i3) + (1930545336 * i6);
        int i14 = i13 * i13;
        int i15 = ((-1352905585) * i7) + 1468203008 + ((-417352845) * i5) + (i10 * 1679707278) + (1679707278 * i11) + ((-1679707278) * i12) + (1262354432 * i4) + ((-1408630784) * i3) + ((-2070937600) * i6) + (392888320 * i14);
        int i16 = (i7 * (-2054695253)) + 138751921 + (i5 * (-2054693473)) + (i10 * (-890)) + (i11 * (-890)) + (i12 * 890) + (i4 * (-2054694363)) + (i3 * 1502648999) + (i6 * 931574424) + (i14 * (-2139684864));
        int i17 = i15 + (i16 * i16 * (-174260224));
        if (i17 == 1) {
            return d(objArr);
        }
        if (i17 == 2) {
            return a(objArr);
        }
        VideoSelfieActivity videoSelfieActivity = (VideoSelfieActivity) objArr[0];
        int i18 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        IdScan.IdType idType = videoSelfieActivity.getRepo().getIdType(IdCategory.FIRST);
        arrayList.add(new VideoSelfieProgress(new VideoSelfieProgressItem(VideoSelfieScanState.f12199e, null, 2, null), false, 2, null));
        if (idType == IdScan.IdType.PASSPORT) {
            return arrayList;
        }
        arrayList.add(new VideoSelfieProgress(new VideoSelfieProgressItem(VideoSelfieScanState.f12195a, null, 2, null), false, 2, null));
        int i19 = f12163n + 33;
        f12162m = i19 % 128;
        int i20 = i19 % 2;
        return arrayList;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("\u001f\fQ\u000fr", (short) (ZN.Xd() ^ ((188941707 ^ 1092635677) ^ 1248030335)), (short) (ZN.Xd() ^ (1225479467 ^ 1225469630)));
            String strVd = hg.Vd("1\u001e", (short) (FB.Xd() ^ (1340241952 ^ 1340222382)), (short) (FB.Xd() ^ ((298643108 ^ 522413102) ^ 250587990)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("#\u0010U\u0013v", (short) (C1607wl.Xd() ^ ((451200233 ^ 1249880410) ^ 1352344777)));
                String strYd = C1561oA.yd("\u0012}", (short) (C1607wl.Xd() ^ (1416583436 ^ 1416568377)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    short sXd = (short) (C1607wl.Xd() ^ (1686901590 ^ 1686923259));
                    int[] iArr = new int["P?\u0007F,".length()];
                    QB qb = new QB("P?\u0007F,");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    short sXd2 = (short) (OY.Xd() ^ ((1217171834 ^ 520938730) ^ 1468026447));
                    short sXd3 = (short) (OY.Xd() ^ (1426403819 ^ 1426416636));
                    int[] iArr2 = new int["WM".length()];
                    QB qb2 = new QB("WM");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls3 = Class.forName(str);
                        Field field3 = 0 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("W<&p\u0015", (short) (C1499aX.Xd() ^ (1239828436 ^ (-1239825135))), (short) (C1499aX.Xd() ^ ((644075121 ^ 901443174) ^ (-332990130))))).getDeclaredMethod(ZO.xd(",?", (short) (Od.Xd() ^ ((2073628267 ^ 1010295341) ^ (-1202620352))), (short) (Od.Xd() ^ (172507336 ^ (-172500342)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("P,\u001a\u0015e\"", (short) (Od.Xd() ^ ((2047922921 ^ 554729835) ^ (-1526745797))), (short) (Od.Xd() ^ ((1151568507 ^ 491317393) ^ (-1508583523))));
                                short sXd4 = (short) (C1633zX.Xd() ^ ((1652382924 ^ 1063809913) ^ (-1561664601)));
                                int[] iArr3 = new int["k)Mz'tK\\C?@(JYOr/m$b\u0015_1".length()];
                                QB qb3 = new QB("k)Mz'tK\\C?@(JYOr/m$b\u0015_1");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd4 + i4)));
                                    i4++;
                                }
                                Object[] objArr2 = {strUd2};
                                Method method = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.Qd("\u0015\u0012 }#\u001c\u001c\f\u0013w\t\u0015\u0018\n\u0003\u0004", (short) (OY.Xd() ^ ((1727312876 ^ 619440033) ^ 1109345044))), Class.forName(EO.Od("c\u0005\f^r~\u007fDh#FErcpG", (short) (ZN.Xd() ^ ((1007373545 ^ 734292103) ^ 399451227)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd(":)p0\u0016", (short) (ZN.Xd() ^ (2026413222 ^ 2026420288)), (short) (ZN.Xd() ^ (1007362406 ^ 1007378530)));
                                    String strOd = C1561oA.od("ui", (short) (Od.Xd() ^ (131097786 ^ (-131083561))));
                                    try {
                                        Class<?> cls4 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls4.getField(strOd) : cls4.getDeclaredField(strOd);
                                        field4.setAccessible(true);
                                        field4.set(null, windowManager);
                                    } catch (Throwable th4) {
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    short sXd5 = (short) (C1499aX.Xd() ^ (1432940975 ^ (-1432918803)));
                    int[] iArr4 = new int["\r{C\u0003h".length()];
                    QB qb4 = new QB("\r{C\u0003h");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd5 + sXd5) + i5));
                        i5++;
                    }
                    String str3 = new String(iArr4, 0, i5);
                    short sXd6 = (short) (FB.Xd() ^ (633525370 ^ 633515341));
                    short sXd7 = (short) (FB.Xd() ^ ((507112313 ^ 1603679122) ^ 1102031881));
                    int[] iArr5 = new int["?s".length()];
                    QB qb5 = new QB("?s");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK(((i6 * sXd7) ^ sXd6) + xuXd5.CK(iKK5));
                        i6++;
                    }
                    String str4 = new String(iArr5, 0, i6);
                    try {
                        Class<?> cls5 = Class.forName(str3);
                        Field field5 = 0 != 0 ? cls5.getField(str4) : cls5.getDeclaredField(str4);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("\u0004r:y_", (short) (Od.Xd() ^ ((1400592489 ^ 574284547) ^ (-1900138824))));
                        String strVd2 = Wg.vd(")\u001d", (short) (C1633zX.Xd() ^ (2038876719 ^ (-2038857972))));
                        try {
                            Class<?> cls6 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls6.getField(strVd2) : cls6.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i7 = (297369823 ^ 1897244889) ^ 1621895245;
                        if (x2 > i7 && x2 < displayMetrics.widthPixels - i7 && y2 > i7 && y2 < displayMetrics.heightPixels - i7) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static final /* synthetic */ VideoSelfieResult access$getErrorResult$p(VideoSelfieActivity videoSelfieActivity) {
        int i2 = 2 % 2;
        int i3 = f12163n;
        int i4 = i3 + 37;
        f12162m = i4 % 128;
        int i5 = i4 % 2;
        VideoSelfieResult videoSelfieResult = videoSelfieActivity.f12172j;
        int i6 = i3 + 67;
        f12162m = i6 % 128;
        int i7 = i6 % 2;
        return videoSelfieResult;
    }

    public static final /* synthetic */ void access$publishResult(VideoSelfieActivity videoSelfieActivity, VideoSelfieResult videoSelfieResult) {
        int i2 = 2 % 2;
        int i3 = f12162m + 83;
        f12163n = i3 % 128;
        int i4 = i3 % 2;
        videoSelfieActivity.b(videoSelfieResult);
        int i5 = f12162m + 17;
        f12163n = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12173b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12174e = 1;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, VideoSelfie videoSelfie) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(videoSelfie, "");
            Intent intent = new Intent(context, (Class<?>) VideoSelfieActivity.class);
            intent.putExtra("extraMinVideoLengthRequired", videoSelfie.isMinVideoLengthRequired());
            intent.putExtra("extraVideoSelfieMode", videoSelfie.getSelfieMode());
            intent.putExtra("extraLivenessEnabled", videoSelfie.isLivenessEnabled());
            intent.putExtra("extraClosedEyesCheckEnabled", videoSelfie.isClosedEyesCheckEnabled());
            intent.putExtra("extraHeadCoverCheckEnabled", videoSelfie.isHeadCoverCheckEnabled());
            intent.putExtra("extraLensesCheckEnabled", videoSelfie.isLensesCheckEnabled());
            intent.putExtra("extraMaskCheckEnabled", videoSelfie.isMaskCheckEnabled());
            intent.putExtra("extraSelfieScanEnabled", videoSelfie.isSelfieScanEnabled());
            intent.putExtra("extraIdScanEnabled", videoSelfie.isIdScanEnabled());
            intent.putExtra("extraEnableBackShownAsFrontCheck", videoSelfie.isEnableBackShownAsFrontCheck());
            intent.putExtra("extraEnableFrontShownAsBackCheck", videoSelfie.isEnableFrontShownAsBackCheck());
            intent.putExtra("extraRandomQuestionsEnabled", videoSelfie.isRandomQuestionsEnabled());
            intent.putExtra("extraRandomQuestionsCount", videoSelfie.getRandomQuestionsCount());
            intent.putParcelableArrayListExtra("extraLocalRandomQuestions", new ArrayList<>(videoSelfie.getLocalRandomQuestions()));
            intent.putExtra("extraVoiceConsentEnabled", videoSelfie.isVoiceConsentEnabled());
            intent.putExtra("extraVoiceConsentFaceRecognitionEnabled", videoSelfie.isVoiceConsentFaceRecognitionEnabled());
            intent.putExtra("extraLocalConsentText", videoSelfie.getLocalConsentText());
            intent.putExtra("extraMaxVideoLength", videoSelfie.getMaxVideoLength());
            intent.putExtra("extraIsAudioDisabled", videoSelfie.isDisableAudio());
            intent.putExtra("extraLogoResId", videoSelfie.getLogoResId());
            intent.putExtra("extraFrontIdComparisonEnabled", videoSelfie.isFrontIdComparisonEnabled());
            intent.putExtra("extraFrontIdOcrComparisonEnabled", videoSelfie.isFrontIdOcrComparisonEnabled());
            intent.putExtra("extraBackIdComparisonEnabled", videoSelfie.isBackIdComparisonEnabled());
            intent.putExtra("extraBackIdOcrComparisonEnabled", videoSelfie.isBackIdOcrComparisonEnabled());
            intent.putExtra("extraShowSelfieFirstEnabled", videoSelfie.showSelfieStepFirst());
            CX.ud();
            context.startActivity(intent);
            int i3 = f12173b + 43;
            f12174e = i3 % 128;
            int i4 = i3 % 2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f12163n;
        int i4 = i3 + 31;
        f12162m = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f12166d;
        int i6 = i3 + 83;
        f12162m = i6 % 128;
        if (i6 % 2 != 0) {
            return screenName;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f12163n + 89;
        f12162m = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f12165c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragmentActivity
    public final FragmentWithListener<?> getFirstFragment() {
        int i2 = 2 % 2;
        VideoRecordingFragment videoRecordingFragment = new VideoRecordingFragment();
        int i3 = f12162m + 95;
        f12163n = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
        return videoRecordingFragment;
    }

    public final al getBinding() {
        int i2 = 2 % 2;
        int i3 = f12163n + 97;
        f12162m = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        al alVar = this.f12170h;
        if (alVar != null) {
            return alVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = f12162m + 57;
        f12163n = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setBinding(al alVar) {
        int i2 = 2 % 2;
        int i3 = f12163n + 59;
        f12162m = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(alVar, "");
            this.f12170h = alVar;
        } else {
            Intrinsics.checkNotNullParameter(alVar, "");
            this.f12170h = alVar;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final VideoSelfiePresenter getPresenter() {
        int i2 = 2 % 2;
        int i3 = f12162m + 123;
        f12163n = i3 % 128;
        int i4 = i3 % 2;
        VideoSelfiePresenter videoSelfiePresenter = this.f12167e;
        if (videoSelfiePresenter != null) {
            return videoSelfiePresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = f12163n + 3;
        f12162m = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void setPresenter(VideoSelfiePresenter videoSelfiePresenter) {
        int i2 = 2 % 2;
        int i3 = f12163n + 39;
        f12162m = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoSelfiePresenter, "");
            this.f12167e = videoSelfiePresenter;
        } else {
            Intrinsics.checkNotNullParameter(videoSelfiePresenter, "");
            this.f12167e = videoSelfiePresenter;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragmentActivity, com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) throws Exception {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        al alVarE = al.e(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(alVarE, "");
        setBinding(alVarE);
        setContentView(getBinding().d());
        DaggerVideoSelfieComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent()).videoSelfiePresenterModule(new VideoSelfiePresenterModule(this)).build().inject(this);
        this.f12171i = getIntent().getBooleanExtra("extraIsAudioDisabled", false);
        a(b(getIntent().getBooleanExtra("extraSelfieScanEnabled", false), getIntent().getBooleanExtra("extraIdScanEnabled", false), getIntent().getBooleanExtra("extraRandomQuestionsEnabled", false), getIntent().getBooleanExtra("extraVoiceConsentEnabled", false), this.f12171i, getIntent().getBooleanExtra("extraShowSelfieFirstEnabled", false)));
        int i3 = f12163n + 63;
        f12162m = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 35 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragmentActivity
    public final void prepareFirstFragment() {
        int i2 = 2 % 2;
        int i3 = f12162m + 105;
        f12163n = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(VideoSelfieActivity videoSelfieActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieActivity, "");
        Fragment currentFragment = videoSelfieActivity.getCurrentFragment();
        if (currentFragment instanceof VideoRecordingFragment) {
            ((VideoRecordingFragment) currentFragment).onBackPressed();
            int i4 = f12163n + 101;
            f12162m = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        videoSelfieActivity.sendScreenClosedEvent(ScreenName.VIDEO_SELFIE_VIDEO_UPLOAD);
        videoSelfieActivity.getPresenter().publishResult(new VideoSelfieResult(ResultCode.USER_CANCELLED, null, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        int i6 = f12163n + 3;
        f12162m = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        Fragment currentFragment;
        VideoSelfieActivity videoSelfieActivity = (VideoSelfieActivity) objArr[0];
        ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = f12162m + 109;
        f12163n = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoSelfieActivity, "");
            currentFragment = videoSelfieActivity.getCurrentFragment();
            int i4 = 96 / 0;
            if (!(currentFragment instanceof VideoRecordingFragment)) {
                return null;
            }
        } else {
            Intrinsics.checkNotNullParameter(videoSelfieActivity, "");
            currentFragment = videoSelfieActivity.getCurrentFragment();
            if (!(currentFragment instanceof VideoRecordingFragment)) {
                return null;
            }
        }
        ((VideoRecordingFragment) currentFragment).checkCameraPermissions();
        int i5 = f12162m + 59;
        f12163n = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    @Deprecated(message = "Deprecated in Java")
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f12162m + 103;
        f12163n = i3 % 128;
        int i4 = i3 % 2;
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                VideoSelfieActivity.d(this.f$0, dialogInterface, i5);
            }
        }, new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                VideoSelfieActivity.b(this.f$0, dialogInterface, i5);
            }
        });
        int i5 = f12162m + 41;
        f12163n = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void a(List<VideoSelfieProgress> list) {
        int i2 = 2 % 2;
        al binding = getBinding();
        VideoSelfieActivity videoSelfieActivity = this;
        VideoSelfieProgressAdapter videoSelfieProgressAdapter = new VideoSelfieProgressAdapter(videoSelfieActivity, list);
        this.f12168f = videoSelfieProgressAdapter;
        videoSelfieProgressAdapter.notifyItemRangeChanged(0, list.size());
        RecyclerView recyclerView = binding.f6882d;
        VideoSelfieProgressAdapter videoSelfieProgressAdapter2 = this.f12168f;
        if (videoSelfieProgressAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f12163n + 123;
            f12162m = i3 % 128;
            int i4 = i3 % 2;
            videoSelfieProgressAdapter2 = null;
        }
        recyclerView.setAdapter(videoSelfieProgressAdapter2);
        binding.f6882d.setLayoutManager(new LinearLayoutManager(videoSelfieActivity, 0, false));
        onStartVsProgressStep(VideoSelfieScanState.f12196b);
    }

    private final List<VideoSelfieProgress> b(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        List listEmptyList;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoSelfieProgress(new VideoSelfieProgressItem(VideoSelfieScanState.f12196b, null, 2, null), false, 2, null));
        if (z3) {
            listEmptyList = (List) c(new Object[]{this}, DaggerReviewPhotoComponent.Builder.a(), DaggerReviewPhotoComponent.Builder.a(), DaggerReviewPhotoComponent.Builder.a(), 329101473, DaggerReviewPhotoComponent.Builder.a(), -329101473);
        } else {
            listEmptyList = CollectionsKt.emptyList();
            int i3 = f12162m + 45;
            f12163n = i3 % 128;
            int i4 = i3 % 2;
        }
        List<VideoSelfieProgress> listA = z2 ? a() : CollectionsKt.emptyList();
        if (z7) {
            arrayList.addAll(listA);
            arrayList.addAll(listEmptyList);
        } else {
            arrayList.addAll(listEmptyList);
            arrayList.addAll(listA);
        }
        if (z4 && !z6) {
            arrayList.add(new VideoSelfieProgress(new VideoSelfieProgressItem(VideoSelfieScanState.f12203i, null, 2, null), false, 2, null));
        }
        if (z5) {
            int i5 = f12162m + 13;
            f12163n = i5 % 128;
            int i6 = i5 % 2;
            if (!z6) {
                arrayList.add(new VideoSelfieProgress(new VideoSelfieProgressItem(VideoSelfieScanState.f12204j, null, 2, null), false, 2, null));
            }
        }
        int i7 = f12162m + 69;
        f12163n = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 9 / 0;
        }
        return arrayList;
    }

    private static List<VideoSelfieProgress> a() {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoSelfieProgress(new VideoSelfieProgressItem(VideoSelfieScanState.f12197c, null, 2, null), false, 2, null));
        int i3 = f12162m + 85;
        f12163n = i3 % 128;
        int i4 = i3 % 2;
        return arrayList;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.VideoSelfieProgressListener
    public final void onStartVsProgressStep(VideoSelfieScanState videoSelfieScanState) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieScanState, "");
        VideoSelfieProgressAdapter videoSelfieProgressAdapter = this.f12168f;
        if (videoSelfieProgressAdapter == null) {
            int i3 = f12163n + 15;
            f12162m = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            videoSelfieProgressAdapter = null;
        }
        videoSelfieProgressAdapter.startVideoSelfieProgressStep(videoSelfieScanState);
        int i5 = f12163n + 113;
        f12162m = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingFragment.VideoSelfieProgressListener
    public final void onFinishVsProgressStep(VideoSelfieScanState videoSelfieScanState) {
        int i2 = 2 % 2;
        int i3 = f12162m + 31;
        f12163n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieScanState, "");
        VideoSelfieProgressAdapter videoSelfieProgressAdapter = this.f12168f;
        if (videoSelfieProgressAdapter == null) {
            int i5 = f12162m + 15;
            f12163n = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            videoSelfieProgressAdapter = null;
        }
        videoSelfieProgressAdapter.finishVideoSelfieProgressStep(videoSelfieScanState);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d A[PHI: r4
  0x001d: PHI (r4v2 com.incode.welcome_sdk.d.al) = (r4v0 com.incode.welcome_sdk.d.al), (r4v3 com.incode.welcome_sdk.d.al) binds: [B:22:0x0091, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d() {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity.f12163n
            int r1 = r0 + 63
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity.f12162m = r0
            int r1 = r1 % r7
            r6 = 0
            r5 = 0
            java.lang.String r3 = ""
            if (r1 != 0) goto L8b
            com.incode.welcome_sdk.d.al r4 = r8.getBinding()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter r1 = r8.f12168f
            r0 = 72
            int r0 = r0 / r5
            if (r1 != 0) goto L21
        L1d:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r1 = r6
        L21:
            boolean r0 = r1.areAllStepsCompleted()
            r2 = 1
            if (r0 == 0) goto L71
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity.f12162m
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity.f12163n = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L66
            com.incode.welcome_sdk.views.IncodeImageView r0 = r4.f6881c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
        L3d:
            com.incode.welcome_sdk.views.IncodeTextView r1 = r4.f6880b
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_validation_success
            java.lang.String r0 = r8.getString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L4a:
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter r0 = r8.f12168f
            if (r0 != 0) goto L64
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L51:
            r6.completeVideoSelfieProgress()
            r8.e()
            r8.c(r2)
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity.f12162m
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity.f12163n = r0
            int r1 = r1 % r7
            return
        L64:
            r6 = r0
            goto L51
        L66:
            com.incode.welcome_sdk.views.IncodeImageView r0 = r4.f6881c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r5)
            goto L3d
        L71:
            com.incode.welcome_sdk.views.IncodeImageView r1 = r4.f6881c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            com.incode.welcome_sdk.views.IncodeTextView r1 = r4.f6880b
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_video_selfie_upload_modules_partially_complete
            java.lang.String r0 = r8.getString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            goto L4a
        L8b:
            com.incode.welcome_sdk.d.al r4 = r8.getBinding()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter r1 = r8.f12168f
            if (r1 != 0) goto L21
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity.d():void");
    }

    private final void e() {
        int i2 = 2 % 2;
        int i3 = f12162m + 31;
        f12163n = i3 % 128;
        int i4 = i3 % 2;
        getBinding().f6879a.setVisibility(0);
        int i5 = f12162m + 113;
        f12163n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
    }

    private final void c(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f12163n + 69;
        f12162m = i4 % 128;
        if (i4 % 2 != 0) {
            ConstraintLayout constraintLayout = getBinding().f6883e;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            ConstraintLayout constraintLayout2 = constraintLayout;
            if (z2) {
                int i5 = f12162m + 109;
                f12163n = i5 % 128;
                int i6 = i5 % 2;
                i2 = 0;
            } else {
                i2 = 8;
            }
            constraintLayout2.setVisibility(i2);
            int i7 = f12163n + 1;
            f12162m = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        Intrinsics.checkNotNullExpressionValue(getBinding().f6883e, "");
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment.CameraFragmentInterface
    public final void onFinishUsingCamera(BaseResult baseResult) throws Exception {
        Throwable th;
        int i2 = 2 % 2;
        if (baseResult != null) {
            int i3 = f12162m + 41;
            f12163n = i3 % 128;
            int i4 = i3 % 2;
            th = baseResult.error;
            int i5 = f12162m + 81;
            f12163n = i5 % 128;
            int i6 = i5 % 2;
        } else {
            th = null;
        }
        if (th instanceof PermissionsDeniedException) {
            int i7 = f12163n + 17;
            f12162m = i7 % 128;
            if (i7 % 2 != 0) {
                Intrinsics.checkNotNull(baseResult, "");
                b((VideoSelfieResult) baseResult);
                return;
            } else {
                Intrinsics.checkNotNull(baseResult, "");
                b((VideoSelfieResult) baseResult);
                throw null;
            }
        }
        if (baseResult == null) {
            BaseActivity.showFragment$default(this, VideoUploadFragment.Companion.newInstance$default(VideoUploadFragment.f12646d, null, 1, null), false, 2, null);
            return;
        }
        if (baseResult.resultCode == ResultCode.USER_CANCELLED) {
            BaseActivity.showFragment$default(this, VideoUploadFragment.f12646d.newInstance(Boolean.TRUE), false, 2, null);
            return;
        }
        if (baseResult.error != null) {
            int i8 = f12163n + 53;
            f12162m = i8 % 128;
            if (i8 % 2 == 0) {
                this.f12172j = (VideoSelfieResult) baseResult;
                c();
                throw null;
            }
            this.f12172j = (VideoSelfieResult) baseResult;
            if (c()) {
                return;
            }
            BaseActivity.showFragment$default(this, VideoUploadFragment.Companion.newInstance$default(VideoUploadFragment.f12646d, null, 1, null), false, 2, null);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment.CameraFragmentInterface
    public final void onFinishConcatAudioVideo(VideoSelfieResult videoSelfieResult) {
        int i2 = 2 % 2;
        int i3 = f12162m + 125;
        f12163n = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoSelfieResult, "");
            b(videoSelfieResult);
            int i4 = 81 / 0;
        } else {
            Intrinsics.checkNotNullParameter(videoSelfieResult, "");
            b(videoSelfieResult);
        }
        int i5 = f12163n + 111;
        f12162m = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.VideoUploadFragmentInterface
    public final void onStartUpload() {
        int i2 = 2 % 2;
        int i3 = f12162m + 35;
        f12163n = i3 % 128;
        if (i3 % 2 != 0) {
            c(true);
        } else {
            c(false);
        }
        int i4 = f12162m + 77;
        f12163n = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
    }

    static final class e extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12177a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12178b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ VideoSelfieResult f12180d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f12178b + 101;
            f12177a = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void b() {
            int i2 = 2 % 2;
            int i3 = f12177a + 67;
            f12178b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                if (VideoSelfieActivity.access$getErrorResult$p(VideoSelfieActivity.this) != null) {
                    VideoSelfieActivity videoSelfieActivity = VideoSelfieActivity.this;
                    VideoSelfieResult videoSelfieResultAccess$getErrorResult$p = VideoSelfieActivity.access$getErrorResult$p(videoSelfieActivity);
                    Intrinsics.checkNotNull(videoSelfieResultAccess$getErrorResult$p);
                    VideoSelfieActivity.access$publishResult(videoSelfieActivity, videoSelfieResultAccess$getErrorResult$p);
                    return;
                }
                VideoSelfieActivity.access$publishResult(VideoSelfieActivity.this, this.f12180d);
                int i4 = f12178b + 47;
                f12177a = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            VideoSelfieActivity.access$getErrorResult$p(VideoSelfieActivity.this);
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(VideoSelfieResult videoSelfieResult) {
            super(1);
            this.f12180d = videoSelfieResult;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12162m + 23;
        f12163n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12163n + 17;
        f12162m = i5 % 128;
        int i6 = i5 % 2;
    }

    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12175b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12176c = 1;

        private void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12175b + 69;
            f12176c = i3 % 128;
            int i4 = i3 % 2;
            ((Timber.Forest) this.receiver).e(th);
            if (i4 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12176c + 57;
            f12175b = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f12176c + 79;
            f12175b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        c(Object obj) {
            super(1, obj, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f12163n + 9;
        f12162m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12163n + 63;
        f12162m = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadFragment.VideoUploadFragmentInterface
    public final void onFinishUpload(VideoSelfieResult videoSelfieResult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieResult, "");
        destroyCurrentFragment(true);
        d();
        CompositeDisposable compositeDisposable = this.f12169g;
        Observable<Long> observableObserveOn = Observable.timer(2000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final e eVar = new e(videoSelfieResult);
        Consumer<? super Long> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoSelfieActivity.a(eVar, obj);
            }
        };
        final c cVar = new c(Timber.Forest);
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieActivity$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoSelfieActivity.e(cVar, obj);
            }
        }));
        int i3 = f12163n + 55;
        f12162m = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraFragment.CameraFragmentInterface
    public final void showPermissionsMandatoryDialog(PermissionsMandatoryDialog permissionsMandatoryDialog) {
        int i2 = 2 % 2;
        int i3 = f12162m + 109;
        f12163n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(permissionsMandatoryDialog, "");
        permissionsMandatoryDialog.show(getSupportFragmentManager(), PermissionsMandatoryDialog.TAG);
        int i5 = f12163n + 33;
        f12162m = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public final void onBtnOpenSettingsClicked() throws Exception {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        Object obj = null;
        intent.setData(Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, getPackageName(), null));
        CX.ud();
        startActivity(intent);
        int i3 = f12163n + 89;
        f12162m = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public final void onPermissionMandatoryDialogClosed(Exception exc) {
        int i2 = 2 % 2;
        int i3 = f12163n + 7;
        f12162m = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(exc, "");
            onBackButtonPressed();
        } else {
            Intrinsics.checkNotNullParameter(exc, "");
            onBackButtonPressed();
            int i4 = 85 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void publishUserCancelled() {
        int i2 = 2 % 2;
        getPresenter().publishResult(new VideoSelfieResult(ResultCode.USER_CANCELLED, null, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        int i3 = f12163n + 19;
        f12162m = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void b(VideoSelfieResult videoSelfieResult) {
        int i2 = 2 % 2;
        int i3 = f12162m + 121;
        f12163n = i3 % 128;
        if (i3 % 2 == 0) {
            getPresenter().publishResult(d(videoSelfieResult));
            int i4 = f12163n + 53;
            f12162m = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        getPresenter().publishResult(d(videoSelfieResult));
        throw null;
    }

    private final VideoSelfieResult d(VideoSelfieResult videoSelfieResult) throws Throwable {
        String strD;
        ResultCode code = videoSelfieResult.getCode();
        Throwable th = videoSelfieResult.error;
        String videoSelfiePath = getRepo().getVideoSelfiePath();
        Intrinsics.checkNotNullExpressionValue(videoSelfiePath, "");
        String strD2 = d(videoSelfiePath);
        if (this.f12171i) {
            strD = null;
        } else {
            String vsAudioPath = getRepo().getVsAudioPath();
            Intrinsics.checkNotNullExpressionValue(vsAudioPath, "");
            strD = d(vsAudioPath);
        }
        String vsSelfiePath = getRepo().getVsSelfiePath();
        Intrinsics.checkNotNullExpressionValue(vsSelfiePath, "");
        String strD3 = d(vsSelfiePath);
        String vsIdFrontPath = getRepo().getVsIdFrontPath();
        Intrinsics.checkNotNullExpressionValue(vsIdFrontPath, "");
        String strD4 = d(vsIdFrontPath);
        String vsIdBackPath = getRepo().getVsIdBackPath();
        Intrinsics.checkNotNullExpressionValue(vsIdBackPath, "");
        String strD5 = d(vsIdBackPath);
        String vsVoiceConsentSelfiePath = getRepo().getVsVoiceConsentSelfiePath();
        Intrinsics.checkNotNullExpressionValue(vsVoiceConsentSelfiePath, "");
        return new VideoSelfieResult(code, th, strD2, strD, strD3, strD4, strD5, null, d(vsVoiceConsentSelfiePath), 128, null);
    }

    private static String d(String str) {
        int i2 = 2 % 2;
        if (!new File(str).exists()) {
            int i3 = f12163n + 123;
            f12162m = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = f12162m + 93;
        f12163n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return str;
    }

    private static boolean c() {
        int i2 = 2 % 2;
        int i3 = f12163n + 83;
        f12162m = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            IncodeWelcome.Companion.getInstance().isCaptureOnlyMode();
            obj.hashCode();
            throw null;
        }
        boolean zIsCaptureOnlyMode = IncodeWelcome.Companion.getInstance().isCaptureOnlyMode();
        int i4 = f12162m + 53;
        f12163n = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsCaptureOnlyMode;
        }
        throw null;
    }

    static {
        int i2 = f12161l + 121;
        f12164o = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, VideoSelfie videoSelfie) {
        int i2 = 2 % 2;
        int i3 = f12162m + 39;
        f12163n = i3 % 128;
        if (i3 % 2 != 0) {
            f12160b.start(context, videoSelfie);
            int i4 = 66 / 0;
        } else {
            f12160b.start(context, videoSelfie);
        }
        int i5 = f12163n + 99;
        f12162m = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        c(new Object[]{function1, obj}, DaggerReviewPhotoComponent.Builder.a(), DaggerReviewPhotoComponent.Builder.a(), DaggerReviewPhotoComponent.Builder.a(), 444933702, DaggerReviewPhotoComponent.Builder.a(), -444933700);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(VideoSelfieActivity videoSelfieActivity, DialogInterface dialogInterface, int i2) {
        c(new Object[]{videoSelfieActivity, dialogInterface, Integer.valueOf(i2)}, DaggerReviewPhotoComponent.Builder.a(), DaggerReviewPhotoComponent.Builder.a(), DaggerReviewPhotoComponent.Builder.a(), 801616072, DaggerReviewPhotoComponent.Builder.a(), -801616071);
    }

    private final List<VideoSelfieProgress> b() {
        return (List) c(new Object[]{this}, DaggerReviewPhotoComponent.Builder.a(), DaggerReviewPhotoComponent.Builder.a(), DaggerReviewPhotoComponent.Builder.a(), 329101473, DaggerReviewPhotoComponent.Builder.a(), -329101473);
    }
}
