package com.incode.welcome_sdk.ui.camera.id_validation;

import android.animation.ObjectAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.Slide;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.biocatch.android.commonsdk.configuration.ConfigurationDefaultValue;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.TransitionManagerUtils;
import com.incode.welcome_sdk.commons.ui.BlurTransformation;
import com.incode.welcome_sdk.commons.ui.DotAnimation;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.commons.utils.aj;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.cb;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.DocumentValidationResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.camera.CameraActivity;
import com.incode.welcome_sdk.ui.camera.CameraPreview;
import com.incode.welcome_sdk.ui.camera.CameraPreviewType;
import com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.camera.id_validation.base.IdealEnvironmentTestResult;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationState;
import com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoActivity;
import com.incode.welcome_sdk.ui.user_consent.UserConsentActivity;
import com.transitionseverywhere.Recolor;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import timber.log.Timber;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class ValidationActivity extends BaseValidationActivity implements ValidationContract.View {
    private static int ae = 0;
    private static int ag = 1;
    private ViewGroup A;
    private ViewGroup B;
    private DotAnimation C;
    private ViewGroup D;
    private Button E;
    private TextView F;
    private Button G;
    private View H;
    private ViewGroup I;
    private View J;
    private Button K;
    private ImageView L;
    private TextView M;
    private TextView N;
    private TextView O;
    private TextView P;
    private TextView Q;
    private TextView R;
    private TextView S;
    private ImageView T;
    private TextView U;
    private int V;
    private int W;
    private int X;
    private ProgressBar Y;
    private Animation aa;
    private b ab;
    private Animation ac;

    /* JADX INFO: renamed from: h */
    TextView f11661h;

    /* JADX INFO: renamed from: i */
    protected ValidationPresenter f11662i;

    /* JADX INFO: renamed from: j */
    FrameLayout f11663j;

    /* JADX INFO: renamed from: l */
    CompositeDisposable f11664l;

    /* JADX INFO: renamed from: m */
    Button f11665m;

    /* JADX INFO: renamed from: n */
    private ShimmerFrameLayout f11666n;

    /* JADX INFO: renamed from: o */
    int f11667o;

    /* JADX INFO: renamed from: p */
    private FrameLayout f11668p;

    /* JADX INFO: renamed from: q */
    private ConstraintLayout f11669q;

    /* JADX INFO: renamed from: r */
    private FrameLayout f11670r;

    /* JADX INFO: renamed from: s */
    private ViewGroup f11671s;

    /* JADX INFO: renamed from: t */
    private FrameLayout f11672t;

    /* JADX INFO: renamed from: u */
    private LinearLayout f11673u;

    /* JADX INFO: renamed from: v */
    private boolean f11674v;

    /* JADX INFO: renamed from: w */
    private ImageView f11675w;

    /* JADX INFO: renamed from: x */
    private TextView f11676x;

    /* JADX INFO: renamed from: y */
    private ProgressBar f11677y;

    /* JADX INFO: renamed from: z */
    private ViewGroup f11678z;
    private boolean Z = false;
    private boolean ah = false;
    private Runnable af = new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda12
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.K();
        }
    };

    /* JADX INFO: renamed from: instrumented$0$a$--V */
    public static /* synthetic */ void m8295instrumented$0$a$V(ValidationActivity validationActivity, View view) {
        Callback.onClick_enter(view);
        try {
            validationActivity.c(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$0$b$-II-Ljava-lang-Object-IIII-Ljava-lang-Object- */
    public static /* synthetic */ void m8296instrumented$0$b$IILjavalangObjectIIIILjavalangObject(ValidationActivity validationActivity, Runnable runnable, boolean z2, View view) {
        Callback.onClick_enter(view);
        try {
            validationActivity.e(runnable, z2, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$0$b$-Ljava-lang-Runnable-Z-V */
    public static /* synthetic */ void m8297instrumented$0$b$LjavalangRunnableZV(ValidationActivity validationActivity, Runnable runnable, boolean z2, View view) {
        Callback.onClick_enter(view);
        try {
            validationActivity.d(runnable, z2, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$0$c$-Ljava-lang-Runnable-Z-V */
    public static /* synthetic */ void m8298instrumented$0$c$LjavalangRunnableZV(ValidationActivity validationActivity, Runnable runnable, boolean z2, View view) {
        Callback.onClick_enter(view);
        try {
            validationActivity.a(runnable, z2, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$1$a$--V */
    public static /* synthetic */ void m8299instrumented$1$a$V(ValidationActivity validationActivity, View view) {
        Callback.onClick_enter(view);
        try {
            validationActivity.a(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$1$b$-Ljava-lang-Runnable-Z-V */
    public static /* synthetic */ void m8300instrumented$1$b$LjavalangRunnableZV(ValidationActivity validationActivity, Runnable runnable, boolean z2, View view) {
        Callback.onClick_enter(view);
        try {
            validationActivity.d(runnable, z2, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$1$c$-Ljava-lang-Runnable-Z-V */
    public static /* synthetic */ void m8301instrumented$1$c$LjavalangRunnableZV(ValidationActivity validationActivity, Runnable runnable, boolean z2, View view) {
        Callback.onClick_enter(view);
        try {
            validationActivity.a(runnable, z2, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$2$a$--V */
    public static /* synthetic */ void m8302instrumented$2$a$V(ValidationActivity validationActivity, View view) {
        Callback.onClick_enter(view);
        try {
            validationActivity.e(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$3$a$--V */
    public static /* synthetic */ void m8303instrumented$3$a$V(ValidationActivity validationActivity, View view) {
        Callback.onClick_enter(view);
        try {
            validationActivity.d(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("\u0006r8uY", (short) (Od.Xd() ^ (886256931 ^ (-886275645))), (short) (Od.Xd() ^ ((1532153002 ^ 382577857) ^ (-1302283943))));
            String strVd = hg.Vd("R?", (short) (C1607wl.Xd() ^ ((1762586851 ^ 2062148603) ^ 333919539)), (short) (C1607wl.Xd() ^ (1755947606 ^ 1755965204)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud(")\u0016[\u0019|", (short) (Od.Xd() ^ (1503469674 ^ (-1503464965))));
                String strYd = C1561oA.yd("{g", (short) (Od.Xd() ^ (175082232 ^ (-175094426))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("%\u0014[\u001b\u0001", (short) (Od.Xd() ^ (659302237 ^ (-659316862))));
                    String strQd = Xg.qd("* ", (short) (C1633zX.Xd() ^ (702998127 ^ (-703002331))), (short) (C1633zX.Xd() ^ ((788765834 ^ 495380113) ^ (-847578833))));
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("t\u0013=\u0010\u0013", (short) (C1633zX.Xd() ^ ((737800961 ^ 728152556) ^ (-10442838))), (short) (C1633zX.Xd() ^ (392920289 ^ (-392909815))))).getDeclaredMethod(ZO.xd("UH", (short) (C1633zX.Xd() ^ ((1961105992 ^ 1062386154) ^ (-1270264964))), (short) (C1633zX.Xd() ^ ((479311963 ^ 584000215) ^ (-1046403551)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd = (short) (OY.Xd() ^ (1986459113 ^ 1986454243));
                                short sXd2 = (short) (OY.Xd() ^ (1572310978 ^ 1572308409));
                                int[] iArr = new int["3eS\\YL".length()];
                                QB qb = new QB("3eS\\YL");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                                    i2++;
                                }
                                String str = new String(iArr, 0, i2);
                                Class<?> cls4 = Class.forName(Ig.wd("kU\u001b\u0003\u001dBkRECF,JKWl)m2R\u0001mM", (short) (ZN.Xd() ^ (2011546151 ^ 2011556232))));
                                Class<?>[] clsArr = new Class[1];
                                short sXd3 = (short) (C1499aX.Xd() ^ ((662538345 ^ 1676101347) ^ (-1150990190)));
                                int[] iArr2 = new int["\u0006%h{P[4\u0012IDc'ODUp".length()];
                                QB qb2 = new QB("\u0006%h{P[4\u0012IDc'ODUp");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                                Object[] objArr2 = {str};
                                Method method = cls4.getMethod(C1561oA.Qd("fcqOtmm]dIZfi[TU", (short) (ZN.Xd() ^ (1289471669 ^ 1289470247))), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("TC\u000bJ0", (short) (ZN.Xd() ^ (1900008875 ^ 1900004298)), (short) (ZN.Xd() ^ (1335146248 ^ 1335164148)));
                                    String strOd = C1561oA.od("{o", (short) (Od.Xd() ^ (1442747440 ^ (-1442754882))));
                                    try {
                                        Class<?> cls5 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls5.getField(strOd) : cls5.getDeclaredField(strOd);
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
                    String strKd2 = C1561oA.Kd("\u0019\bO\u000ft", (short) (C1633zX.Xd() ^ (948951990 ^ (-948946912))));
                    String strZd2 = Wg.Zd("#,", (short) (C1633zX.Xd() ^ ((725437988 ^ 1882055303) ^ (-1527839473))), (short) (C1633zX.Xd() ^ ((257125455 ^ 821363953) ^ (-1067847101))));
                    try {
                        Class<?> cls6 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls6.getField(strZd2) : cls6.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("gV\u001e]C", (short) (C1499aX.Xd() ^ ((1767737612 ^ 1325647302) ^ (-643701590))));
                        String strVd2 = Wg.vd("\u000f\u0003", (short) (C1499aX.Xd() ^ ((1762611770 ^ 318532346) ^ (-2079547316))));
                        try {
                            Class<?> cls7 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls7.getField(strVd2) : cls7.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i4 = (1288216668 ^ 1556505292) ^ 269402843;
                        if (x2 > i4 && x2 < displayMetrics.widthPixels - i4 && y2 > i4 && y2 < displayMetrics.heightPixels - i4) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    static /* synthetic */ BaseValidationPresenter b(ValidationActivity validationActivity) {
        int i2 = 2 % 2;
        int i3 = ae + 51;
        ag = i3 % 128;
        int i4 = i3 % 2;
        BaseValidationPresenter baseValidationPresenter = ((BaseValidationActivity) validationActivity).f11735k;
        if (i4 != 0) {
            return baseValidationPresenter;
        }
        throw null;
    }

    static /* synthetic */ CameraPreview c(ValidationActivity validationActivity) {
        int i2 = 2 % 2;
        int i3 = ag + 103;
        ae = i3 % 128;
        int i4 = i3 % 2;
        CameraPreview cameraPreview = ((CameraActivity) validationActivity).f11178d;
        if (i4 != 0) {
            throw null;
        }
        int i5 = ae + 123;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return cameraPreview;
    }

    static /* synthetic */ BaseValidationPresenter d(ValidationActivity validationActivity) {
        int i2 = 2 % 2;
        int i3 = ae + 5;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        BaseValidationPresenter baseValidationPresenter = ((BaseValidationActivity) validationActivity).f11735k;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = ae + 99;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return baseValidationPresenter;
        }
        throw null;
    }

    static /* synthetic */ IncodeWelcomeRepository e(ValidationActivity validationActivity) {
        int i2 = 2 % 2;
        int i3 = ag + 19;
        ae = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository repo = validationActivity.getRepo();
        int i5 = ae + 11;
        ag = i5 % 128;
        int i6 = i5 % 2;
        return repo;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity
    public CameraPreviewType getCameraType() {
        int i2 = 2 % 2;
        int i3 = ag + 73;
        ae = i3 % 128;
        int i4 = i3 % 2;
        CameraPreviewType cameraPreviewType = CameraPreviewType.FULLSCREEN;
        int i5 = ag + 49;
        ae = i5 % 128;
        int i6 = i5 % 2;
        return cameraPreviewType;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public ValidationPhase getValidationPhase() {
        int i2 = 2 % 2;
        int i3 = ae + 83;
        ag = i3 % 128;
        int i4 = i3 % 2;
        ValidationPhase validationPhase = super.getValidationPhase();
        int i5 = ag + 49;
        ae = i5 % 128;
        int i6 = i5 % 2;
        return validationPhase;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public DocumentType getDocumentType() {
        int i2 = 2 % 2;
        int i3 = ae + 71;
        ag = i3 % 128;
        int i4 = i3 % 2;
        DocumentType documentType = super.getDocumentType();
        if (i4 == 0) {
            int i5 = 55 / 0;
        }
        return documentType;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity
    public void setContentView() {
        int i2 = 2 % 2;
        int i3 = ag + 15;
        ae = i3 % 128;
        if (i3 % 2 == 0) {
            setContentView(R.layout.onboard_sdk_activity_fullscreen_camera);
            int i4 = ae + 49;
            ag = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        setContentView(R.layout.onboard_sdk_activity_fullscreen_camera);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ WindowInsetsCompat c(View view, WindowInsetsCompat windowInsetsCompat) {
        int i2 = 2 % 2;
        int i3 = ag + 123;
        ae = i3 % 128;
        int i4 = i3 % 2;
        ViewCompat.dispatchApplyWindowInsets(this.B, windowInsetsCompat);
        ViewCompat.dispatchApplyWindowInsets(this.I, windowInsetsCompat);
        ViewCompat.dispatchApplyWindowInsets(this.f11678z, windowInsetsCompat);
        ViewCompat.dispatchApplyWindowInsets(this.A, windowInsetsCompat);
        int i5 = ae + 73;
        ag = i5 % 128;
        int i6 = i5 % 2;
        return windowInsetsCompat;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) {
        ProgressBar progressBar;
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        c();
        a();
        aj.a(this.O);
        this.f11662i = new ValidationPresenter(this);
        this.ah = getIntent().getBooleanExtra("extraAgeAssuranceUxEnabled", false);
        ((CameraActivity) this).f11177c = 720;
        ((CameraActivity) this).f11181g = 1280;
        this.ab = new b(this);
        this.ac = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.onboard_sdk_scale_in_and_disappear);
        this.aa = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.onboard_sdk_scale_in_and_disappear);
        this.f11664l = new CompositeDisposable();
        ViewCompat.setOnApplyWindowInsetsListener(this.f11669q, new OnApplyWindowInsetsListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda5
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.c(view, windowInsetsCompat);
            }
        });
        b();
        if (isStreamingEnabled() && (progressBar = this.Y) != null) {
            int i3 = ag + 33;
            ae = i3 % 128;
            int i4 = i3 % 2;
            progressBar.setVisibility(0);
            int i5 = ae + 117;
            ag = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private /* synthetic */ void c(View view) {
        int i2 = 2 % 2;
        int i3 = ag + 11;
        ae = i3 % 128;
        int i4 = i3 % 2;
        int iB = UserConsentActivity.Companion.b();
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -1993528107, 1993528123, UserConsentActivity.Companion.b(), iB);
        int i5 = ag + 115;
        ae = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ void a(View view) {
        int i2 = 2 % 2;
        int i3 = ag + 59;
        ae = i3 % 128;
        int i4 = i3 % 2;
        onBtnHelpContinue();
        if (i4 != 0) {
            throw null;
        }
    }

    private /* synthetic */ void d(View view) {
        int i2 = 2 % 2;
        int i3 = ae + 83;
        ag = i3 % 128;
        boolean z2 = false;
        if (i3 % 2 == 0) {
            o(false);
            z2 = true;
        } else {
            o(false);
        }
        b(z2);
        super.onShutterButtonPressed();
    }

    private void a() {
        int i2 = 2 % 2;
        int i3 = ag + 69;
        ae = i3 % 128;
        int i4 = i3 % 2;
        this.E.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda33
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ValidationActivity.m8295instrumented$0$a$V(this.f$0, view);
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ValidationActivity.m8299instrumented$1$a$V(this.f$0, view);
            }
        };
        findViewById(R.id.btnHelpDocumentScanContinue).setOnClickListener(onClickListener);
        findViewById(R.id.btnHelpIdCaptureContinue).setOnClickListener(onClickListener);
        this.G.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ValidationActivity.m8302instrumented$2$a$V(this.f$0, view);
            }
        });
        this.f11665m.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ValidationActivity.m8303instrumented$3$a$V(this.f$0, view);
            }
        });
        int i5 = ae + 95;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void c() {
        int i2 = 2 % 2;
        int i3 = ag + 33;
        ae = i3 % 128;
        int i4 = i3 % 2;
        this.f11666n = (ShimmerFrameLayout) findViewById(R.id.shimmer);
        this.f11671s = (ViewGroup) findViewById(R.id.root);
        this.f11669q = (ConstraintLayout) findViewById(R.id.containerCameraFeedbackAndPhotoReview);
        this.f11661h = (TextView) findViewById(R.id.manualCaptureInstructions);
        this.f11670r = (FrameLayout) findViewById(R.id.overlayContainer);
        this.f11672t = (FrameLayout) findViewById(R.id.overlay);
        this.f11668p = (FrameLayout) findViewById(R.id.previewContainer);
        this.f11676x = (TextView) findViewById(R.id.txtUploadDesc);
        this.f11675w = (ImageView) findViewById(R.id.preview);
        this.f11673u = (LinearLayout) findViewById(R.id.uploadProgressContainer);
        this.f11677y = (ProgressBar) findViewById(R.id.uploadProgress);
        this.D = (ViewGroup) findViewById(R.id.modalScreensContainer);
        this.f11678z = (ViewGroup) findViewById(R.id.idCaptureError);
        this.A = (ViewGroup) findViewById(R.id.passportCaptureError);
        this.B = (ViewGroup) findViewById(R.id.idCaptureHelp);
        this.I = (ViewGroup) findViewById(R.id.documentScanHelp);
        this.E = (Button) findViewById(R.id.btnNeedHelp);
        this.G = (Button) findViewById(R.id.btnHelpManualCapture);
        this.H = findViewById(R.id.layoutTitleContainer);
        this.F = (TextView) findViewById(R.id.txtUploadFailedDesc);
        this.N = (TextView) findViewById(R.id.txtUploadFailedHint);
        this.L = (ImageView) findViewById(R.id.ivTitleIcon);
        this.K = (Button) findViewById(R.id.btnTryAgain);
        this.M = (TextView) findViewById(R.id.tvAttemptsRemaining);
        this.f11663j = (FrameLayout) findViewById(R.id.feedbackContainer);
        this.J = findViewById(R.id.feedbackView);
        this.O = (TextView) findViewById(R.id.feedbackViewMessage);
        this.R = (TextView) findViewById(R.id.tvDocumentIssueSubtext1);
        this.Q = (TextView) findViewById(R.id.tvDocumentIssueSubtext2);
        this.S = (TextView) findViewById(R.id.tvDocumentIssueSubtext3);
        this.P = (TextView) findViewById(R.id.tvDocumentIssueSubtext4);
        this.T = (ImageView) findViewById(R.id.ivCountdown);
        this.U = (TextView) findViewById(R.id.tvCountdown);
        this.Y = (ProgressBar) findViewById(R.id.centralProgressBar);
        this.f11665m = (Button) findViewById(R.id.btnShutter);
        Resources resources = getResources();
        this.X = resources.getDimensionPixelSize(R.dimen.onboard_sdk_photo_preview_margin_horizontal);
        this.V = resources.getDimensionPixelSize(R.dimen.onboard_sdk_photo_preview_frame_thickness);
        this.W = resources.getDimensionPixelSize(R.dimen.onboard_sdk_rounded_rectangle_outer_radius);
        int i5 = ae + 113;
        ag = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ Unit Q() {
        int i2 = 2 % 2;
        int i3 = ae + 97;
        ag = i3 % 128;
        int i4 = i3 % 2;
        this.f11675w.setBackgroundResource(R.drawable.onboard_sdk_bg_border_light);
        onReviewContinueClicked();
        Unit unit = Unit.INSTANCE;
        int i5 = ae + 15;
        ag = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private void b() {
        int i2 = 2 % 2;
        int i3 = ae + 49;
        ag = i3 % 128;
        int i4 = i3 % 2;
        setNoNetworkSnackbarRetryAction(new Function0() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.Q();
            }
        });
        int i5 = ag + 9;
        ae = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private void a(TextView textView, int i2) {
        int i3 = 2 % 2;
        int i4 = ae + 29;
        ag = i4 % 128;
        if (i4 % 2 != 0) {
            if (textView != null && !getString(i2).isEmpty()) {
                int i5 = ag + 109;
                ae = i5 % 128;
                int i6 = i5 % 2;
                textView.setVisibility(0);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity
    public void initValidation() {
        int i2 = 2 % 2;
        int i3 = ae + 109;
        ag = i3 % 128;
        int i4 = i3 % 2;
        super.initValidation();
        initShutterButtonPosition();
        b(true);
    }

    public void initShutterButtonPosition() {
        int i2 = 2 % 2;
        int i3 = ag + 31;
        ae = i3 % 128;
        int i4 = i3 % 2;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f11665m.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = Math.max((((getScreenHeight() - getTriggerRectAbsolute().bottom) * 3) / 4) - (((ViewGroup.LayoutParams) layoutParams).height / 2), 0);
        this.f11665m.setLayoutParams(layoutParams);
        int i5 = ae + 17;
        ag = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onCameraSourceCreated() {
        int i2 = 2 % 2;
        int i3 = ag + 113;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            super.onCameraSourceCreated();
            throw null;
        }
        super.onCameraSourceCreated();
        ProgressBar progressBar = this.Y;
        if (progressBar != null) {
            progressBar.setVisibility(4);
            int i4 = ag + 125;
            ae = i4 % 128;
            int i5 = i4 % 2;
        }
        talkBackAccessibilityText(R.string.onboard_sdk_validation_voice_over_back_camera_started);
        int i6 = ae + 115;
        ag = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 47 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0022  */
    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L4e
            super.onResume()
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$b r0 = r4.ab
            r0.enable()
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r2 = r4.getValidationPhase()
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_DOCUMENT
            r0 = 76
            int r0 = r0 / 0
            if (r2 != r1) goto L3e
        L22:
            android.widget.TextView r1 = r4.R
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_document_scan_help_common_issue_subtext_1
            r4.a(r1, r0)
            android.widget.TextView r1 = r4.Q
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_document_scan_help_common_issue_subtext_2
            r4.a(r1, r0)
            android.widget.TextView r1 = r4.S
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_document_scan_help_common_issue_subtext_3
            r4.a(r1, r0)
            android.widget.TextView r1 = r4.P
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_document_scan_help_common_issue_subtext_4
            r4.a(r1, r0)
        L3e:
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L4d
            r0 = 8
            int r0 = r0 / 0
        L4d:
            return
        L4e:
            super.onResume()
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$b r0 = r4.ab
            r0.enable()
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r1 = r4.getValidationPhase()
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase.SCAN_DOCUMENT
            if (r1 != r0) goto L3e
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0027, code lost:
    
        if (r1 != 4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002b, code lost:
    
        return com.incode.welcome_sdk.ScreenName.VALIDATION;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x003e, code lost:
    
        if (r0 != 4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0043, code lost:
    
        return com.incode.welcome_sdk.ScreenName.DOCUMENT_CAMERA_CAPTURE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.incode.welcome_sdk.ScreenName getScreenName() {
        /*
            r6 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae
            int r1 = r0 + 15
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag = r0
            int r1 = r1 % r3
            r5 = 4
            r4 = 3
            r2 = 1
            if (r1 != 0) goto L2c
            int[] r1 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.AnonymousClass3.f11688d
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = r6.getValidationPhase()
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 87
            int r0 = r0 / 0
            if (r1 == r2) goto L53
            if (r1 == r3) goto L47
            if (r1 == r4) goto L44
            if (r1 == r5) goto L41
        L29:
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.VALIDATION
            return r0
        L2c:
            int[] r1 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.AnonymousClass3.f11688d
            com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r0 = r6.getValidationPhase()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L53
            if (r0 == r3) goto L47
            if (r0 == r4) goto L44
            if (r0 == r5) goto L41
            goto L29
        L41:
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.DOCUMENT_CAMERA_CAPTURE
            return r0
        L44:
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.BACK_ID_CAMERA_CAPTURE
            return r0
        L47:
            com.incode.welcome_sdk.ScreenName r2 = com.incode.welcome_sdk.ScreenName.PASSPORT_CAMERA_CAPTURE
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag = r0
            int r1 = r1 % r3
            return r2
        L53:
            com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.FRONT_ID_CAMERA_CAPTURE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.getScreenName():com.incode.welcome_sdk.ScreenName");
    }

    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = ae + 9;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = Modules.ID;
        if (i4 == 0) {
            int i5 = 83 / 0;
        }
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public boolean isDelayedOnboardingSupported() {
        int i2 = 2 % 2;
        int i3 = ae + 15;
        int i4 = i3 % 128;
        ag = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 107;
        ae = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void initializeUiViews() {
        int i2 = 2 % 2;
        int i3 = ag + 101;
        ae = i3 % 128;
        if (i3 % 2 == 0) {
            super.initializeUiViews();
            int iB = UserConsentActivity.Companion.b();
            b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -1789092191, 1789092196, UserConsentActivity.Companion.b(), iB);
            return;
        }
        super.initializeUiViews();
        int iB2 = UserConsentActivity.Companion.b();
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -1789092191, 1789092196, UserConsentActivity.Companion.b(), iB2);
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = ae + 67;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            this.ab.disable();
            hideFeedback();
            super.onPause();
        } else {
            this.ab.disable();
            hideFeedback();
            super.onPause();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnDestroy() {
        int i2 = 2 % 2;
        DotAnimation dotAnimation = this.C;
        if (dotAnimation != null) {
            int i3 = ae + 105;
            ag = i3 % 128;
            int i4 = i3 % 2;
            dotAnimation.d();
        }
        this.f11662i.onDestroy();
        this.f11664l.clear();
        super.safeOnDestroy();
        int i5 = ae + 117;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
    }

    private void b(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = ae + 101;
        ag = i4 % 128;
        int i5 = i4 % 2;
        if (isPictureProvidedExternally()) {
            return;
        }
        this.E.setEnabled(z2);
        Button button = this.E;
        if (!z2) {
            int i6 = ae + 33;
            ag = i6 % 128;
            int i7 = i6 % 2;
            i2 = 8;
        } else {
            i2 = 0;
        }
        button.setVisibility(i2);
    }

    public void onBtnHelpContinue() {
        int i2 = 2 % 2;
        int i3 = ae + 19;
        ag = i3 % 128;
        int i4 = i3 % 2;
        startValidation();
        h(false);
        b(true);
        c(true);
        int i5 = ag + 65;
        ae = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
    }

    private void c(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ae + 45;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Event event = Event.NEED_HELP_FRONT_ID;
        Event event2 = Event.NEED_HELP_FRONT_SECOND_ID;
        Event event3 = Event.NEED_HELP_BACK_ID;
        Event event4 = Event.NEED_HELP_BACK_SECOND_ID;
        Event event5 = Event.NEED_HELP_DOCUMENT_VALIDATION;
        if (z2) {
            int i5 = ag + 57;
            ae = i5 % 128;
            int i6 = i5 % 2;
            event = Event.CLOSE_NEED_HELP_FRONT_ID;
            event2 = Event.CLOSE_NEED_HELP_FRONT_SECOND_ID;
            event3 = Event.CLOSE_NEED_HELP_BACK_ID;
            event4 = Event.CLOSE_NEED_HELP_BACK_SECOND_ID;
            event5 = Event.CLOSE_NEED_HELP_DOCUMENT_VALIDATION;
        }
        HashMap map = new HashMap();
        map.put(EventValues.SCREEN_NAME.getValue(), getScreenName().name());
        int i7 = AnonymousClass3.f11688d[getValidationPhase().ordinal()];
        Object obj = null;
        if (i7 == 1 || i7 == 2) {
            EventUtils.sendScreenEvent(getRepo(), ScreenName.FRONT_ID_HELP, Modules.ID, z2);
            if (getIdCategory() != IdCategory.FIRST) {
                EventUtils.sendEvent(getRepo(), event2, getModule(), (HashMap<String, Object>) map);
                return;
            }
            int i8 = ae + 65;
            ag = i8 % 128;
            if (i8 % 2 != 0) {
                EventUtils.sendEvent(getRepo(), event, getModule(), (HashMap<String, Object>) map);
                return;
            } else {
                EventUtils.sendEvent(getRepo(), event, getModule(), (HashMap<String, Object>) map);
                obj.hashCode();
                throw null;
            }
        }
        if (i7 != 3) {
            if (i7 == 4) {
                EventUtils.sendScreenEvent(getRepo(), ScreenName.DOCUMENT_HELP, Modules.DOCUMENT_CAPTURE, z2);
                EventUtils.sendEvent(getRepo(), event5, getModule(), (HashMap<String, Object>) map);
                return;
            }
            return;
        }
        EventUtils.sendScreenEvent(getRepo(), ScreenName.BACK_ID_HELP, Modules.ID, z2);
        if (getIdCategory() == IdCategory.FIRST) {
            int i9 = ae + 125;
            ag = i9 % 128;
            if (i9 % 2 != 0) {
                EventUtils.sendEvent(getRepo(), event3, getModule(), (HashMap<String, Object>) map);
                return;
            } else {
                EventUtils.sendEvent(getRepo(), event3, getModule(), (HashMap<String, Object>) map);
                throw null;
            }
        }
        EventUtils.sendEvent(getRepo(), event4, getModule(), (HashMap<String, Object>) map);
    }

    private void d(boolean z2) {
        int i2 = 2 % 2;
        Button button = this.G;
        int i3 = 1;
        if (!z2) {
            int i4 = ag + 83;
            ae = i4 % 128;
            int i5 = i4 % 2;
            i3 = 4;
        } else {
            int i6 = ae + 81;
            ag = i6 % 128;
            if (i6 % 2 != 0) {
                i3 = 0;
            }
        }
        button.setVisibility(i3);
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.camera.RecordableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = 2 % 2;
        int i5 = ae + 89;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            super.onActivityResult(i2, i3, intent);
            this.f11662i.onActivityResult(i2, i3, intent);
        } else {
            super.onActivityResult(i2, i3, intent);
            this.f11662i.onActivityResult(i2, i3, intent);
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public Camera getCamera() {
        int i2 = 2 % 2;
        int i3 = ae + 15;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            Camera camera = ((CameraActivity) this).f11176b;
            throw null;
        }
        Camera camera2 = ((CameraActivity) this).f11176b;
        int i4 = ae + 63;
        ag = i4 % 128;
        if (i4 % 2 != 0) {
            return camera2;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public void setCameraUIVisibility(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ag + 95;
        ae = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        setCameraUIVisibility(z2, null);
        int i5 = ag + 109;
        ae = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void a(Transition.TransitionListener transitionListener, boolean z2) {
        int i2;
        int i3 = 2 % 2;
        Fade fade = new Fade();
        fade.addTarget(this.f11672t);
        fade.setInterpolator(new AccelerateInterpolator());
        if (transitionListener != null) {
            int i4 = ag + 81;
            ae = i4 % 128;
            if (i4 % 2 == 0) {
                fade.addListener(transitionListener);
            } else {
                fade.addListener(transitionListener);
                throw null;
            }
        }
        TransitionManager.beginDelayedTransition(this.f11670r, fade);
        FrameLayout frameLayout = this.f11672t;
        if (z2) {
            int i5 = ag + 109;
            ae = i5 % 128;
            int i6 = i5 % 2;
            i2 = 8;
        } else {
            i2 = 0;
        }
        frameLayout.setVisibility(i2);
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public void setCameraUIVisibility(final boolean z2, final Transition.TransitionListener transitionListener) {
        int i2 = 2 % 2;
        int i3 = ae + 115;
        ag = i3 % 128;
        int i4 = i3 % 2;
        e(z2);
        this.f11671s.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(transitionListener, z2);
            }
        });
        int i5 = ae + 81;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void e(boolean z2) {
        int i2 = 2 % 2;
        ValidationPhase validationPhase = getValidationPhase();
        if (validationPhase == ValidationPhase.SCAN_ID_FRONT || validationPhase == ValidationPhase.SCAN_ID_BACK) {
            setTitleVisible(z2);
            int i3 = ag + 31;
            ae = i3 % 128;
            int i4 = i3 % 2;
        }
        if (((BaseValidationActivity) this).f11735k.isManualCaptureMode()) {
            int i5 = ae + 113;
            ag = i5 % 128;
            if (i5 % 2 != 0) {
                setShutterButtonVisible(z2);
            } else {
                setShutterButtonVisible(z2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        b(z2);
    }

    public /* synthetic */ void K() {
        int i2 = 2 % 2;
        TransitionManager.beginDelayedTransition(this.f11663j, new Fade().addTarget(this.J));
        this.J.setVisibility(8);
        this.Z = false;
        int i3 = ae + 95;
        ag = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001c, code lost:
    
        if (java.util.Objects.equals(getDetectedIdType(), com.incode.welcome_sdk.modules.IdScan.IdType.ID) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x001e, code lost:
    
        showFeedback(com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11700e);
        r1 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae + 1;
        com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002c, code lost:
    
        if ((r1 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0039, code lost:
    
        if (java.util.Objects.equals(getDetectedIdType(), com.incode.welcome_sdk.modules.IdScan.IdType.ID) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004b, code lost:
    
        if (java.util.Objects.equals(getDetectedIdType(), com.incode.welcome_sdk.modules.IdScan.IdType.PASSPORT) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag + 85;
        com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae = r1 % 128;
        r1 = r1 % 2;
        showFeedback(com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11697b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void showCaptureHint() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L2f
            com.incode.welcome_sdk.modules.IdScan$IdType r1 = r3.getDetectedIdType()
            com.incode.welcome_sdk.modules.IdScan$IdType r0 = com.incode.welcome_sdk.modules.IdScan.IdType.ID
            boolean r1 = java.util.Objects.equals(r1, r0)
            r0 = 74
            int r0 = r0 / 0
            if (r1 == 0) goto L41
        L1e:
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11700e
            r3.showFeedback(r0)
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae
            int r1 = r0 + 1
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L3c
            return
        L2f:
            com.incode.welcome_sdk.modules.IdScan$IdType r1 = r3.getDetectedIdType()
            com.incode.welcome_sdk.modules.IdScan$IdType r0 = com.incode.welcome_sdk.modules.IdScan.IdType.ID
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto L41
            goto L1e
        L3c:
            r0 = 0
            r0.hashCode()
            throw r0
        L41:
            com.incode.welcome_sdk.modules.IdScan$IdType r1 = r3.getDetectedIdType()
            com.incode.welcome_sdk.modules.IdScan$IdType r0 = com.incode.welcome_sdk.modules.IdScan.IdType.PASSPORT
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto L5b
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae = r0
            int r1 = r1 % r2
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationFeedback.f11697b
            r3.showFeedback(r0)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.showCaptureHint():void");
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$3 */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a */
        private static int f11686a = 0;

        /* JADX INFO: renamed from: c */
        private static int f11687c = 1;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f11688d;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f11689e;

        static {
            int[] iArr = new int[ValidationState.values().length];
            f11689e = iArr;
            try {
                iArr[ValidationState.f11842b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11689e[ValidationState.M.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11689e[ValidationState.f11863w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11689e[ValidationState.Q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11689e[ValidationState.f11854n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11689e[ValidationState.f11858r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11689e[ValidationState.f11860t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11689e[ValidationState.f11841a.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11689e[ValidationState.C.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11689e[ValidationState.f11845e.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11689e[ValidationState.f11844d.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11689e[ValidationState.B.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11689e[ValidationState.N.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11689e[ValidationState.R.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11689e[ValidationState.f11843c.ordinal()] = 15;
                int i2 = f11686a + 93;
                f11687c = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11689e[ValidationState.f11853m.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11689e[ValidationState.f11846f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11689e[ValidationState.f11852l.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f11689e[ValidationState.f11847g.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11689e[ValidationState.f11864x.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11689e[ValidationState.f11848h.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f11689e[ValidationState.f11849i.ordinal()] = 22;
                int i4 = f11686a + 11;
                f11687c = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f11689e[ValidationState.f11850j.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f11689e[ValidationState.f11865y.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f11689e[ValidationState.D.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f11689e[ValidationState.H.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f11689e[ValidationState.G.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f11689e[ValidationState.F.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f11689e[ValidationState.f11861u.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f11689e[ValidationState.I.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f11689e[ValidationState.E.ordinal()] = 31;
                int i7 = f11687c + 11;
                f11686a = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f11689e[ValidationState.f11866z.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f11689e[ValidationState.A.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f11689e[ValidationState.K.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f11689e[ValidationState.J.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f11689e[ValidationState.P.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f11689e[ValidationState.U.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f11689e[ValidationState.T.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f11689e[ValidationState.ab.ordinal()] = 39;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f11689e[ValidationState.W.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f11689e[ValidationState.V.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f11689e[ValidationState.X.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f11689e[ValidationState.aa.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f11689e[ValidationState.f11862v.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f11689e[ValidationState.f11856p.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f11689e[ValidationState.f11857q.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f11689e[ValidationState.f11855o.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f11689e[ValidationState.f11851k.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            int[] iArr2 = new int[ValidationPhase.values().length];
            f11688d = iArr2;
            try {
                iArr2[ValidationPhase.SCAN_ID_FRONT.ordinal()] = 1;
                int i11 = f11687c + 115;
                f11686a = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 2 % 2;
                }
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f11688d[ValidationPhase.SCAN_PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f11688d[ValidationPhase.SCAN_ID_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f11688d[ValidationPhase.SCAN_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused52) {
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void onValidationStateChanged(ValidationState validationState) {
        int i2 = 2 % 2;
        Timber.d("onValidationStateChanged called, idValidationState: %s, validationPhase: %s, autocaptureUXMode: %s", validationState, getValidationPhase(), getAutocaptureUXMode());
        super.onValidationStateChanged(validationState);
        Object obj = null;
        switch (AnonymousClass3.f11689e[validationState.ordinal()]) {
            case 5:
                if (!Objects.equals(getDetectedIdType(), IdScan.IdType.ID)) {
                    if (Objects.equals(getDetectedIdType(), IdScan.IdType.PASSPORT)) {
                        showFeedback(ValidationFeedback.f11706k);
                        return;
                    }
                    return;
                } else {
                    int i3 = ag + 43;
                    ae = i3 % 128;
                    if (i3 % 2 == 0) {
                        showFeedback(ValidationFeedback.f11701f);
                        return;
                    } else {
                        showFeedback(ValidationFeedback.f11701f);
                        throw null;
                    }
                }
            case 6:
                if (!(!Objects.equals(getDetectedIdType(), IdScan.IdType.ID))) {
                    showFeedback(ValidationFeedback.f11707l);
                    return;
                } else {
                    if (Objects.equals(getDetectedIdType(), IdScan.IdType.PASSPORT)) {
                        showFeedback(ValidationFeedback.f11708m);
                        return;
                    }
                    return;
                }
            case 7:
                if (!Objects.equals(getDetectedIdType(), IdScan.IdType.ID)) {
                    if (Objects.equals(getDetectedIdType(), IdScan.IdType.PASSPORT)) {
                        showFeedback(ValidationFeedback.f11715t);
                        return;
                    }
                    return;
                }
                int i4 = ae + 21;
                ag = i4 % 128;
                if (i4 % 2 != 0) {
                    showFeedback(ValidationFeedback.f11709n);
                    return;
                } else {
                    showFeedback(ValidationFeedback.f11709n);
                    int i5 = 76 / 0;
                    return;
                }
            case 8:
                setTitleTextAndVisibility(R.string.onboard_sdk_validation_show_front_secondary_text);
                b(false);
                return;
            case 9:
                setTitleTextAndVisibility(R.string.onboard_sdk_validation_show_back_secondary_text);
                b(false);
                return;
            case 10:
                b(false);
                return;
            case 11:
            case 12:
            case 13:
            case 14:
                this.f11676x.setText(R.string.onboard_sdk_validation_on_server_in_progress);
                talkBackAccessibilityText(R.string.onboard_sdk_validation_on_server_in_progress);
                return;
            case 15:
                b(s(), R.string.onboard_sdk_validation_front_id_validated);
                return;
            case 16:
                b(R.string.onboard_sdk_validation_glare_detected, R.string.onboard_sdk_validation_glare_detected_hint, f());
                return;
            case 17:
                b(R.string.onboard_sdk_validation_sharpness_failed, R.string.onboard_sdk_validation_sharpness_failed_hint, f());
                return;
            case 18:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_shadow_failed), f()}, 880488357, -880488343, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 19:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_front_id_no_face), f()}, 880488357, -880488343, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 20:
                b(R.string.onboard_sdk_validation_id_readability_failed, R.string.onboard_sdk_validation_id_readability_failed_hint, f());
                return;
            case 21:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_classification_failed), l()}, 880488357, -880488343, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 22:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_capture_failed_title), f()}, 880488357, -880488343, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 23:
                boolean z2 = ((BaseValidationActivity) this).f11735k.getIdScanResult().skipBackIdCapture;
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_classification_failed), false, true, g(z2), Boolean.valueOf(z2)}, 577077712, -577077694, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 24:
                showFeedback(ValidationFeedback.f11702g);
                return;
            case 25:
                showFeedback(ValidationFeedback.f11704i);
                return;
            case 26:
                b(R.string.onboard_sdk_validation_glare_detected, R.string.onboard_sdk_validation_glare_detected_hint, (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -450650438, 450650455, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b()));
                return;
            case 27:
                b(R.string.onboard_sdk_validation_sharpness_failed, R.string.onboard_sdk_validation_sharpness_failed_hint, (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -450650438, 450650455, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b()));
                return;
            case 28:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_shadow_failed), (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -450650438, 450650455, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b())}, 880488357, -880488343, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 29:
                b(R.string.onboard_sdk_validation_id_readability_failed, R.string.onboard_sdk_validation_id_readability_failed_hint, (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -450650438, 450650455, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b()));
                return;
            case 30:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_classification_failed), (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, 1166246283, -1166246279, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b())}, 880488357, -880488343, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 31:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_capture_failed_title), (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -450650438, 450650455, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b())}, 880488357, -880488343, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 32:
                b(y(), R.string.onboard_sdk_validation_back_id_validated);
                return;
            case 33:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_classification_failed), false, true, o(), true}, 577077712, -577077694, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 34:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_no_document_detected_title), (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, 1619484215, -1619484206, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b())}, 880488357, -880488343, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 35:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_no_document_detected_title), false, false, r(), true}, 577077712, -577077694, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 36:
                b(v(), R.string.onboard_sdk_validation_passport_validated);
                int i6 = ag + 103;
                ae = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            case 37:
                b(R.string.onboard_sdk_validation_glare_detected, R.string.onboard_sdk_validation_glare_detected_hint, l());
                return;
            case 38:
                b(R.string.onboard_sdk_validation_passport_sharpness_failed, R.string.onboard_sdk_validation_passport_sharpness_failed_hint, l());
                return;
            case 39:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_shadow_failed), l()}, 880488357, -880488343, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 40:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_passport_classification_failed), q()}, 880488357, -880488343, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 41:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_passport_classification_failed), false, true, t(), true}, 577077712, -577077694, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 42:
                b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(R.string.onboard_sdk_validation_capture_failed_title), q()}, 880488357, -880488343, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                return;
            case 43:
                b(R.string.onboard_sdk_validation_id_readability_failed, R.string.onboard_sdk_validation_id_readability_failed_hint, q());
                return;
            case 44:
                e(R.string.onboard_sdk_validation_id_type_unacceptable, R.string.onboard_sdk_validation_id_type_unacceptable_hint, false, true, true, l(), false);
                int i7 = ag + 23;
                ae = i7 % 128;
                int i8 = i7 % 2;
                return;
            case 45:
                b(R.string.onboard_sdk_validation_wrong_side_id, R.string.onboard_sdk_validation_wrong_side_front_id_hint, (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, 472256922, -472256912, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b()));
                return;
            case 46:
                b(R.string.onboard_sdk_validation_wrong_side_id, R.string.onboard_sdk_validation_wrong_side_back_id_hint, (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, 472256922, -472256912, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b()));
                return;
            case 47:
                talkBackAccessibilityText(R.string.onboard_sdk_validation_voice_over_id_too_far);
                return;
            case 48:
                talkBackAccessibilityText(R.string.onboard_sdk_validation_voice_over_id_too_close);
                return;
            default:
                return;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity
    public IdealEnvironmentTestResult evaluateFrameForIdealCaptureEnvironmentTest(int i2) throws Exception {
        int i3 = 2 % 2;
        int i4 = ag + 87;
        ae = i4 % 128;
        int i5 = i4 % 2;
        if (i2 < 0) {
            return new IdealEnvironmentTestResult(i2, null, null);
        }
        byte[] lastCompleteFrameBytes = ((CameraActivity) this).f11178d.getLastCompleteFrameBytes();
        if (lastCompleteFrameBytes == null) {
            IdealEnvironmentTestResult idealEnvironmentTestResult = new IdealEnvironmentTestResult(-2, null, null);
            int i6 = ae + 61;
            ag = i6 % 128;
            int i7 = i6 % 2;
            return idealEnvironmentTestResult;
        }
        Bitmap singlePreviewFrameSynchronous = ((CameraActivity) this).f11178d.getSinglePreviewFrameSynchronous(lastCompleteFrameBytes);
        BaseValidationPresenter.IdValidationResult idValidationResult = ((BaseValidationActivity) this).f11735k.getIdValidationResult(singlePreviewFrameSynchronous, false);
        if (((BaseValidationActivity) this).f11735k.isManualCaptureMode()) {
            return new IdealEnvironmentTestResult(b(idValidationResult), singlePreviewFrameSynchronous, g());
        }
        return new IdealEnvironmentTestResult(c(idValidationResult), singlePreviewFrameSynchronous, g());
    }

    private static int c(BaseValidationPresenter.IdValidationResult idValidationResult) {
        int i2 = 2 % 2;
        int i3 = ag + 15;
        ae = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("Current Frame Validation State: %s", idValidationResult.f11784a);
        if (idValidationResult.f11784a != null) {
            Timber.d("Ideal ID capture environment found!", new Object[0]);
            return 0;
        }
        int i5 = ae + 5;
        ag = i5 % 128;
        return i5 % 2 == 0 ? 105 : -2;
    }

    private int b(BaseValidationPresenter.IdValidationResult idValidationResult) {
        int i2 = 2 % 2;
        ValidationState validationState = ((BaseValidationActivity) this).f11735k.f11760h.f11784a;
        Timber.d("Current Frame Validation State: %s, Previous Frame Validation State: %s", idValidationResult.f11784a, validationState);
        if (d(idValidationResult.f11784a)) {
            int i3 = ag + 1;
            ae = i3 % 128;
            if (i3 % 2 != 0) {
                d(validationState);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (d(validationState)) {
                return -2;
            }
        }
        Timber.d("Ideal ID capture environment found!", new Object[0]);
        int i4 = ae + 109;
        ag = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    private static boolean d(ValidationState validationState) {
        int i2 = 2 % 2;
        if (validationState != null && validationState != ValidationState.f11855o && validationState != ValidationState.f11851k) {
            int i3 = ag + 13;
            ae = i3 % 128;
            int i4 = i3 % 2;
            if (validationState != ValidationState.f11858r && validationState != ValidationState.f11860t && validationState != ValidationState.f11865y && validationState != ValidationState.D) {
                return false;
            }
        }
        int i5 = ae + 43;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return true;
    }

    private String g() {
        int i2 = 2 % 2;
        int i3 = ag + 17;
        ae = i3 % 128;
        int i4 = i3 % 2;
        if (getDocumentType() != DocumentType.BACK_ID) {
            return cb.f9641c.name();
        }
        int i5 = ae + 75;
        ag = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            cb.f9640b.name();
            obj.hashCode();
            throw null;
        }
        String strName = cb.f9640b.name();
        int i6 = ae + 39;
        ag = i6 % 128;
        if (i6 % 2 != 0) {
            return strName;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void showAutocaptureUI(long j2) {
        int i2 = 2 % 2;
        super.showAutocaptureUI(j2);
        if (!(getAutocaptureUXMode() instanceof IdScan.AutocaptureUXMode.Countdown)) {
            showFeedback(ValidationFeedback.f11705j);
            int i3 = ae + 99;
            ag = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = ag + 65;
        ae = i5 % 128;
        if (i5 % 2 == 0) {
            e(j2);
        } else {
            e(j2);
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void hideAutocaptureUI() {
        int i2 = 2 % 2;
        int i3 = ag + 97;
        ae = i3 % 128;
        int i4 = i3 % 2;
        super.hideAutocaptureUI();
        if (getAutocaptureUXMode() instanceof IdScan.AutocaptureUXMode.Countdown) {
            h();
            int i5 = ae + 9;
            ag = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 68 / 0;
                return;
            }
            return;
        }
        hideFeedback();
    }

    public /* synthetic */ void o(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 65;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.d("* ANIMATION BEGINNING", new Object[1]);
        } else {
            Timber.d("* ANIMATION BEGINNING", new Object[0]);
        }
        c(ExifInterface.GPS_MEASUREMENT_3D);
        a(true);
        int i4 = ae + 83;
        ag = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
    }

    public /* synthetic */ void n(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        ae = i3 % 128;
        int i4 = i3 % 2;
        i();
        int i5 = ag + 71;
        ae = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ void f(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 19;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            j();
            c(ExifInterface.GPS_MEASUREMENT_2D);
            int i4 = 28 / 0;
        } else {
            j();
            c(ExifInterface.GPS_MEASUREMENT_2D);
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        ValidationActivity validationActivity = (ValidationActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = ag + 43;
        ae = i3 % 128;
        int i4 = i3 % 2;
        validationActivity.i();
        if (i4 == 0) {
            return null;
        }
        throw null;
    }

    public /* synthetic */ void h(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 39;
        ae = i3 % 128;
        int i4 = i3 % 2;
        j();
        c("1");
        int i5 = ag + 25;
        ae = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ void g(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ae + 103;
        ag = i3 % 128;
        int i4 = i3 % 2;
        i();
        if (i4 == 0) {
            throw null;
        }
        int i5 = ag + 11;
        ae = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void i(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 17;
        ae = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("* ANIMATION END", new Object[0]);
        int i5 = ae + 33;
        ag = i5 % 128;
        int i6 = i5 % 2;
    }

    private void e(long j2) {
        int i2 = 2 % 2;
        int i3 = ag + 33;
        ae = i3 % 128;
        int i4 = i3 % 2;
        hideFeedback();
        talkBackAccessibilityText(R.string.onboard_sdk_validation_voice_over_autocapture_capturing);
        long j3 = j2 / 6;
        Timber.d("Step delay: %s", Long.valueOf(j3));
        this.f11664l.add(Observable.timer(0L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda14
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.o((Long) obj);
            }
        }).delay(j3, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda15
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.n((Long) obj);
            }
        }).delay(j3, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda16
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.f((Long) obj);
            }
        }).delay(j3, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda17
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.j((Long) obj);
            }
        }).delay(j3, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda18
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.h((Long) obj);
            }
        }).delay(j3, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda19
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.g((Long) obj);
            }
        }).delay(j3, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda20
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                ValidationActivity.i((Long) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda21
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Timber.e((Throwable) obj);
            }
        }));
        int i5 = ae + 3;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
    }

    private void h() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = ag + 85;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            z2 = true;
            Timber.d("Hide countdown animation", new Object[1]);
        } else {
            z2 = false;
            Timber.d("Hide countdown animation", new Object[0]);
        }
        a(z2);
        j();
    }

    private void i() {
        int i2 = 2 % 2;
        int i3 = ae + 79;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            this.T.startAnimation(this.ac);
            this.U.startAnimation(this.aa);
            int i4 = 25 / 0;
        } else {
            this.T.startAnimation(this.ac);
            this.U.startAnimation(this.aa);
        }
    }

    private void c(String str) {
        int i2 = 2 % 2;
        int i3 = ae + 87;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            talkBackAccessibilityText(str);
            this.U.setText(str);
        } else {
            talkBackAccessibilityText(str);
            this.U.setText(str);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(boolean r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r3 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag
            int r1 = r3 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae = r0
            int r1 = r1 % r4
            r2 = 0
            if (r1 == 0) goto L2f
            r0 = 33
            int r0 = r0 / r2
            if (r6 == 0) goto L32
        L14:
            int r1 = r3 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae = r0
            int r1 = r1 % r4
        L1b:
            android.widget.ImageView r0 = r5.T
            r0.setVisibility(r2)
            android.widget.TextView r0 = r5.U
            r0.setVisibility(r2)
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag
            int r1 = r0 + 45
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae = r0
            int r1 = r1 % r4
            return
        L2f:
            if (r6 == 0) goto L32
            goto L14
        L32:
            int r1 = r3 + 95
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae = r0
            int r1 = r1 % r4
            r2 = 4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.a(boolean):void");
    }

    private void j() {
        int i2 = 2 % 2;
        int i3 = ae + 73;
        ag = i3 % 128;
        int i4 = i3 % 2;
        this.T.clearAnimation();
        this.U.clearAnimation();
        int i5 = ae + 7;
        ag = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void enteredManualCaptureMode() {
        int i2 = 2 % 2;
        int i3 = ae + 13;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            super.enteredManualCaptureMode();
            Timber.d("enteredManualCaptureMode called", new Object[1]);
        } else {
            super.enteredManualCaptureMode();
            Timber.d("enteredManualCaptureMode called", new Object[0]);
        }
        hideFeedback();
        x();
        A();
    }

    private Runnable g(final boolean z2) {
        int i2 = 2 % 2;
        int i3 = ae + 39;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Runnable runnable = new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.l(z2);
            }
        };
        int i5 = ag + 83;
        ae = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return runnable;
    }

    public /* synthetic */ void l(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ae;
        int i4 = i3 + 83;
        ag = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (!z2) {
            int i5 = i3 + 23;
            ag = i5 % 128;
            int i6 = i5 % 2;
            u();
            removePreview();
            int i7 = ag + 71;
            ae = i7 % 128;
            int i8 = i7 % 2;
        } else {
            this.C.d();
        }
        skipCurrentValidationPhase();
    }

    private Runnable f() {
        Runnable runnable;
        int i2 = 2 % 2;
        int i3 = ae + 55;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            runnable = new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.J();
                }
            };
            int i4 = 4 / 0;
        } else {
            runnable = new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.J();
                }
            };
        }
        int i5 = ae + 43;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return runnable;
        }
        throw null;
    }

    public /* synthetic */ void J() {
        int i2 = 2 % 2;
        int i3 = ag + 75;
        ae = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            u();
            removePreview();
            int i4 = ae + 103;
            ag = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        u();
        removePreview();
        throw null;
    }

    private Runnable l() {
        int i2 = 2 % 2;
        int i3 = ag + 19;
        ae = i3 % 128;
        int i4 = i3 % 2;
        Runnable runnableF = f();
        int i5 = ag + 53;
        ae = i5 % 128;
        int i6 = i5 % 2;
        return runnableF;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        ValidationActivity validationActivity = (ValidationActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = ae + 43;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            return validationActivity.f();
        }
        validationActivity.f();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object o(Object[] objArr) {
        final ValidationActivity validationActivity = (ValidationActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = ae + 11;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            return new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.L();
                }
            };
        }
        new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.L();
            }
        };
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void L() {
        int i2 = 2 % 2;
        int i3 = ae + 73;
        ag = i3 % 128;
        int i4 = i3 % 2;
        u();
        removePreview();
        int i5 = ag + 37;
        ae = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ValidationActivity validationActivity = (ValidationActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = ae + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            int iB = UserConsentActivity.Companion.b();
            return (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{validationActivity}, -450650438, 450650455, UserConsentActivity.Companion.b(), iB);
        }
        int iB2 = UserConsentActivity.Companion.b();
        throw null;
    }

    private Runnable o() {
        int i2 = 2 % 2;
        int i3 = ae + 91;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Runnable runnable = new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.N();
            }
        };
        int i5 = ae + 13;
        ag = i5 % 128;
        int i6 = i5 % 2;
        return runnable;
    }

    public /* synthetic */ void N() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = ae + 91;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            removePreview();
            z2 = true;
        } else {
            removePreview();
            z2 = false;
        }
        b(z2);
        skipCurrentValidationPhase();
    }

    private Runnable t() {
        int i2 = 2 % 2;
        int i3 = ag + 3;
        ae = i3 % 128;
        int i4 = i3 % 2;
        Runnable runnable = new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.M();
            }
        };
        int i5 = ag + 29;
        ae = i5 % 128;
        if (i5 % 2 == 0) {
            return runnable;
        }
        throw null;
    }

    private Runnable r() {
        int i2 = 2 % 2;
        int i3 = ag + 37;
        ae = i3 % 128;
        if (i3 % 2 == 0) {
            return new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.H();
                }
            };
        }
        new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.H();
            }
        };
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void H() {
        int i2 = 2 % 2;
        onDocumentValidationCompleted(new DocumentValidationResult(ResultCode.ERROR));
        int i3 = ag + 53;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 88 / 0;
        }
    }

    private Runnable q() {
        int i2 = 2 % 2;
        int i3 = ae + 89;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            return new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda41
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.F();
                }
            };
        }
        new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.F();
            }
        };
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        ValidationActivity validationActivity = (ValidationActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = ag + 19;
        ae = i3 % 128;
        if (i3 % 2 == 0) {
            validationActivity.u();
            validationActivity.removePreview();
            return null;
        }
        validationActivity.u();
        validationActivity.removePreview();
        throw null;
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        final ValidationActivity validationActivity = (ValidationActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = ag + 99;
        ae = i3 % 128;
        int i4 = i3 % 2;
        Runnable runnable = new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.I();
            }
        };
        int i5 = ae + 69;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return runnable;
    }

    public /* synthetic */ void I() {
        int i2 = 2 % 2;
        int i3 = ae + 15;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            scanAgainDocument();
            u();
            int i4 = 16 / 0;
        } else {
            scanAgainDocument();
            u();
        }
    }

    private void b(int i2, int i3, Runnable runnable) {
        int i4 = 2 % 2;
        int i5 = ag + 21;
        ae = i5 % 128;
        if (i5 % 2 != 0) {
            e(i2, i3, true, true, false, runnable, false);
        } else {
            e(i2, i3, true, false, true, runnable, false);
        }
        int i6 = ae + 27;
        ag = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object n(Object[] objArr) {
        ValidationActivity validationActivity = (ValidationActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        Runnable runnable = (Runnable) objArr[4];
        boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
        int i2 = 2 % 2;
        int i3 = ag + 101;
        ae = i3 % 128;
        int i4 = i3 % 2;
        validationActivity.e(iIntValue, -1, zBooleanValue, false, zBooleanValue2, runnable, zBooleanValue3);
        int i5 = ag + 75;
        ae = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return null;
    }

    public /* synthetic */ Long d(int i2, boolean z2, int i3, Long l2) throws Exception {
        int i4;
        int i5 = 2 % 2;
        ObjectAnimator.ofFloat(this.f11675w, "translationX", 0.0f, 25.0f, -25.0f, 25.0f, -25.0f, 15.0f, -15.0f, 6.0f, -6.0f, 0.0f).setDuration(1000L).start();
        if (i2 != -1) {
            int i6 = ag + 115;
            ae = i6 % 128;
            if (i6 % 2 != 0) {
                this.F.setText(i2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.F.setText(i2);
            ImageView imageView = this.L;
            if (z2) {
                int i7 = ag + 35;
                ae = i7 % 128;
                if (i7 % 2 != 0) {
                    i4 = R.drawable.onboard_sdk_ic_fail;
                    int i8 = 41 / 0;
                } else {
                    i4 = R.drawable.onboard_sdk_ic_fail;
                }
            } else {
                i4 = R.drawable.onboard_sdk_id_verification_referred;
            }
            imageView.setImageResource(i4);
            this.H.setVisibility(0);
            talkBackAccessibilityText(i2);
            int i9 = ae + 67;
            ag = i9 % 128;
            int i10 = i9 % 2;
        }
        if (i3 != -1) {
            int i11 = ag + 53;
            ae = i11 % 128;
            if (i11 % 2 != 0) {
                this.N.setText(i3);
                this.N.setVisibility(1);
            } else {
                this.N.setText(i3);
                this.N.setVisibility(0);
            }
        }
        return l2;
    }

    public static /* synthetic */ ObservableSource d(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 67;
        ae = i3 % 128;
        int i4 = i3 % 2;
        Observable<Long> observableTimer = Observable.timer(1000L, TimeUnit.MILLISECONDS);
        int i5 = ae + 19;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return observableTimer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object j(Object[] objArr) {
        ValidationActivity validationActivity = (ValidationActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        Runnable runnable = (Runnable) objArr[3];
        boolean zBooleanValue3 = ((Boolean) objArr[4]).booleanValue();
        int i2 = 2 % 2;
        int i3 = ae + 45;
        ag = i3 % 128;
        int i4 = i3 % 2;
        validationActivity.c(zBooleanValue, zBooleanValue2, runnable, zBooleanValue3);
        int i5 = ag + 47;
        ae = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 71;
        ae = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void a(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = ae + 111;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th, "Couldn't wait for anims", new Object[0]);
        int i5 = ag + 17;
        ae = i5 % 128;
        int i6 = i5 % 2;
    }

    private void e(final int i2, final int i3, final boolean z2, final boolean z3, final boolean z4, final Runnable runnable, final boolean z5) {
        int i4 = 2 % 2;
        Timber.d("animateIdValidationError called", new Object[0]);
        this.C.d();
        TransitionManager.beginDelayedTransition(this.f11668p, new Recolor().setDuration(1000L));
        if (z4) {
            int i5 = ag + 103;
            ae = i5 % 128;
            int i6 = i5 % 2;
            this.f11675w.setBackgroundResource(R.drawable.onboard_sdk_bg_border_fail);
        } else {
            this.f11675w.setBackgroundResource(R.drawable.onboard_sdk_bg_border_referred);
        }
        Observable.timer(750L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda28
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d(i2, z4, i3, (Long) obj);
            }
        }).observeOn(Schedulers.io()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda29
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ValidationActivity.d((Long) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doOnTerminate(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda30
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.f$0.b(z2, z3, runnable, z5);
            }
        }).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda31
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                ValidationActivity.b((Long) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda32
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                ValidationActivity.a((Throwable) obj);
            }
        });
        int i7 = ag + 69;
        ae = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ void a(Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = ae + 107;
        ag = i3 % 128;
        int i4 = i3 % 2;
        runnable.run();
        int i5 = ag + 11;
        ae = i5 % 128;
        int i6 = i5 % 2;
    }

    private void c(boolean z2, boolean z3, final Runnable runnable, boolean z4) {
        Event event;
        Modules modules;
        int i2 = 2 % 2;
        int i3 = ag + 87;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = AnonymousClass3.f11688d[getValidationPhase().ordinal()];
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = AnonymousClass3.f11688d[getValidationPhase().ordinal()];
        if (i5 == 1 || i5 == 2) {
            event = Event.FRONT_ID_ATTEMPT_FAILED;
            modules = Modules.ID;
        } else if (i5 != 3) {
            event = Event.DOCUMENT_ATTEMPT_FAILED;
            modules = Modules.DOCUMENT_CAPTURE;
        } else {
            event = Event.BACK_ID_ATTEMPT_FAILED;
            modules = Modules.ID;
            int i6 = ag + 57;
            ae = i6 % 128;
            int i7 = i6 % 2;
        }
        EventUtils.sendEvent(getRepo(), event, modules, getScreenName());
        Runnable runnable2 = new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ValidationActivity.a(runnable);
            }
        };
        TransitionManager.beginDelayedTransition(this.f11668p);
        this.f11673u.setVisibility(8);
        if (z3) {
            int i8 = ae + 81;
            ag = i8 % 128;
            int i9 = i8 % 2;
            this.K.setText(R.string.onboard_sdk_validation_btn_use_another_id);
            int i10 = ae + 19;
            ag = i10 % 128;
            int i11 = i10 % 2;
        } else if (z2) {
            this.K.setText(R.string.onboard_sdk_validation_btn_retake_photo);
        } else {
            this.K.setText(R.string.onboard_sdk_validation_btn_continue);
        }
        int i12 = AnonymousClass3.f11688d[getValidationPhase().ordinal()];
        if (i12 == 1 || i12 == 2 || i12 == 3) {
            if (!z2) {
                c(runnable2, z4);
                return;
            }
            b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, runnable2, Boolean.valueOf(z4)}, -1705806607, 1705806608, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
            return;
        }
        if (i12 != 4) {
            return;
        }
        b(runnable2, z4);
        int i13 = ae + 91;
        ag = i13 % 128;
        int i14 = i13 % 2;
    }

    private void h(boolean z2) {
        boolean z3;
        int i2 = 2 % 2;
        if (z2) {
            z3 = false;
        } else {
            int i3 = ag + 1;
            ae = i3 % 128;
            int i4 = i3 % 2;
            z3 = true;
        }
        o(z3);
        if (!z2) {
            int i5 = ag + 61;
            ae = i5 % 128;
            int i6 = i5 % 2;
            A();
        }
        TransitionManagerUtils.beginDelayedTransition(this.D, isAccessibilityTalkBackActive());
        if (getValidationPhase() != ValidationPhase.SCAN_DOCUMENT) {
            this.B.setVisibility(z2 ? 0 : 8);
            return;
        }
        ViewGroup viewGroup = this.I;
        if (z2) {
            int i7 = ae + 121;
            ag = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i = 8;
        }
        viewGroup.setVisibility(i);
        int i9 = ag + 51;
        ae = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    private /* synthetic */ void e(Runnable runnable, boolean z2, View view) {
        int i2 = 2 % 2;
        int i3 = ae + 5;
        ag = i3 % 128;
        int i4 = i3 % 2;
        e(runnable, z2);
        if (z2) {
            return;
        }
        this.H.setVisibility(8);
        this.N.setVisibility(8);
        f(false);
        j(false);
        int i5 = ae + 31;
        ag = i5 % 128;
        int i6 = i5 % 2;
    }

    private void f(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        Button button = this.K;
        if (z2) {
            int i4 = ae + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            ag = i4 % 128;
            int i5 = i4 % 2;
            i2 = 0;
        } else {
            int i6 = ag + 71;
            ae = i6 % 128;
            int i7 = i6 % 2;
            i2 = 8;
        }
        button.setVisibility(i2);
        int i8 = ag + 79;
        ae = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void j(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = ag + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i5 = i4 % 128;
        ae = i5;
        int i6 = i4 % 2;
        TextView textView = this.M;
        if (z2) {
            int i7 = i5 + 43;
            ag = i7 % 128;
            int i8 = i7 % 2;
            i2 = 0;
        } else {
            i2 = 4;
        }
        textView.setVisibility(i2);
    }

    private static /* synthetic */ Object m(Object[] objArr) {
        ValidationActivity validationActivity = (ValidationActivity) objArr[0];
        Runnable runnable = (Runnable) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i2 = 2 % 2;
        int i3 = ae + 79;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            validationActivity.e(runnable, zBooleanValue);
            int i4 = 11 / 0;
            if (zBooleanValue) {
                return null;
            }
        } else {
            validationActivity.e(runnable, zBooleanValue);
            if (zBooleanValue) {
                return null;
            }
        }
        validationActivity.H.setVisibility(8);
        validationActivity.N.setVisibility(8);
        validationActivity.f(false);
        int i5 = ag + 93;
        ae = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private void b(final Runnable runnable, final boolean z2) {
        Button button;
        View.OnClickListener onClickListener;
        int i2 = 2 % 2;
        int i3 = ag + 105;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            f(true);
            button = this.K;
            onClickListener = new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ValidationActivity.m8300instrumented$1$b$LjavalangRunnableZV(this.f$0, runnable, z2, view);
                }
            };
        } else {
            f(true);
            button = this.K;
            onClickListener = new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda48
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ValidationActivity.m8297instrumented$0$b$LjavalangRunnableZV(this.f$0, runnable, z2, view);
                }
            };
        }
        button.setOnClickListener(onClickListener);
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        ValidationActivity validationActivity = (ValidationActivity) objArr[0];
        Runnable runnable = (Runnable) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i2 = 2 % 2;
        validationActivity.e(runnable, zBooleanValue);
        if (!zBooleanValue) {
            int i3 = ag + 97;
            ae = i3 % 128;
            int i4 = i3 % 2;
            validationActivity.H.setVisibility(8);
            validationActivity.N.setVisibility(8);
            validationActivity.f(false);
        }
        int i5 = ae + 3;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return null;
    }

    private void c(final Runnable runnable, final boolean z2) {
        Button button;
        View.OnClickListener onClickListener;
        int i2 = 2 % 2;
        int i3 = ae + 17;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            f(true);
            button = this.K;
            onClickListener = new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ValidationActivity.m8301instrumented$1$c$LjavalangRunnableZV(this.f$0, runnable, z2, view);
                }
            };
        } else {
            f(true);
            button = this.K;
            onClickListener = new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda34
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ValidationActivity.m8298instrumented$0$c$LjavalangRunnableZV(this.f$0, runnable, z2, view);
                }
            };
        }
        button.setOnClickListener(onClickListener);
        int i4 = ae + 109;
        ag = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    public /* synthetic */ void E() {
        int i2 = 2 % 2;
        int i3 = ae + 33;
        ag = i3 % 128;
        int i4 = i3 % 2;
        startValidation();
        b(true);
        setCameraUIVisibility(true);
        A();
        int i5 = ae + 29;
        ag = i5 % 128;
        int i6 = i5 % 2;
    }

    private void e(Runnable runnable, boolean z2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = ae + 55;
        ag = i4 % 128;
        int i5 = i4 % 2;
        if (!z2) {
            if (AnonymousClass3.f11688d[getValidationPhase().ordinal()] != 3) {
                setTitleTextAndVisibility(R.string.onboard_sdk_validation_show_front);
                i2 = ae + 11;
                ag = i2 % 128;
            } else {
                setTitleTextAndVisibility(R.string.onboard_sdk_validation_show_back);
                i2 = ag + 125;
                ae = i2 % 128;
            }
            int i6 = i2 % 2;
            reconfigureCamera(((CameraActivity) this).f11179e, new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.E();
                }
            });
        }
        runnable.run();
    }

    public /* synthetic */ Long e(Long l2) throws Exception {
        int i2 = 2 % 2;
        TransitionManager.beginDelayedTransition(this.f11668p, new Recolor().setDuration(750L));
        this.f11675w.setBackgroundResource(R.drawable.onboard_sdk_bg_border_light);
        int i3 = ag + 47;
        ae = i3 % 128;
        int i4 = i3 % 2;
        return l2;
    }

    public static /* synthetic */ ObservableSource c(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 107;
        ae = i3 % 128;
        int i4 = i3 % 2;
        Observable<Long> observableTimer = Observable.timer(750L, TimeUnit.MILLISECONDS);
        int i5 = ag + 39;
        ae = i5 % 128;
        int i6 = i5 % 2;
        return observableTimer;
    }

    public static /* synthetic */ void a(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 87;
        ae = i3 % 128;
        int i4 = i3 % 2;
    }

    private void b(Action action, int i2) {
        int i3 = 2 % 2;
        this.C.d();
        this.f11676x.setText(i2);
        talkBackAccessibilityText(i2);
        TransitionManager.beginDelayedTransition(this.f11668p, new Recolor().setDuration(750L));
        this.f11675w.setBackgroundResource(R.drawable.onboard_sdk_bg_border_success);
        Observable.timer(500L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda37
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e((Long) obj);
            }
        }).observeOn(Schedulers.io()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda38
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ValidationActivity.c((Long) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doOnTerminate(action).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda39
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                ValidationActivity.a((Long) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda40
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                ValidationActivity.e((Throwable) obj);
            }
        });
        int i4 = ae + 107;
        ag = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Action s() {
        int i2 = 2 % 2;
        int i3 = ae + 67;
        ag = i3 % 128;
        int i4 = i3 % 2;
        Action action = new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda24
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.f$0.G();
            }
        };
        int i5 = ag + 121;
        ae = i5 % 128;
        int i6 = i5 % 2;
        return action;
    }

    public /* synthetic */ void G() throws Exception {
        int i2 = 2 % 2;
        int i3 = ae + 43;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            removePreview();
            u();
            int i4 = ae + 81;
            ag = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 0;
                return;
            }
            return;
        }
        removePreview();
        u();
        throw null;
    }

    private static Action y() {
        int i2 = 2 % 2;
        int i3 = ag + 57;
        ae = i3 % 128;
        int i4 = i3 % 2;
        Action action = new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda25
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                ValidationActivity.z();
            }
        };
        int i5 = ag + 21;
        ae = i5 % 128;
        int i6 = i5 % 2;
        return action;
    }

    public static /* synthetic */ void z() throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 117;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static Action v() {
        Action action;
        int i2 = 2 % 2;
        int i3 = ag + 85;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            action = new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda36
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    ValidationActivity.C();
                }
            };
            int i4 = 98 / 0;
        } else {
            action = new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda36
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    ValidationActivity.C();
                }
            };
        }
        int i5 = ag + 15;
        ae = i5 % 128;
        if (i5 % 2 == 0) {
            return action;
        }
        throw null;
    }

    public static /* synthetic */ void C() throws Exception {
        int i2 = 2 % 2;
        int i3 = ae + 15;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 34 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public void scanAgainFront() {
        int i2 = 2 % 2;
        int i3 = ag + 7;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            removePreview();
            setValidationPhase(ValidationPhase.SCAN_ID_FRONT);
            setCameraUIVisibility(false);
        } else {
            removePreview();
            setValidationPhase(ValidationPhase.SCAN_ID_FRONT);
            setCameraUIVisibility(true);
        }
        b(true);
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public void scanAgainBack() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = ag + 91;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            removePreview();
            setValidationPhase(ValidationPhase.SCAN_ID_BACK);
            z2 = false;
        } else {
            removePreview();
            setValidationPhase(ValidationPhase.SCAN_ID_BACK);
            z2 = true;
        }
        setCameraUIVisibility(z2);
        b(z2);
        int i4 = ag + 111;
        ae = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public void scanAgainPassport() {
        int i2 = 2 % 2;
        int i3 = ag + 67;
        ae = i3 % 128;
        int i4 = i3 % 2;
        removePreview();
        setValidationPhase(ValidationPhase.SCAN_PASSPORT);
        setCameraUIVisibility(true);
        b(true);
        int i5 = ae + 31;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public void scanAgainDocument() {
        int i2 = 2 % 2;
        if (!isPictureProvidedExternally()) {
            removePreview();
            setShutterButtonVisible(true);
            setValidationPhase(ValidationPhase.SCAN_DOCUMENT);
            setCameraUIVisibility(true);
            b(true);
            return;
        }
        int i3 = ae + 39;
        ag = i3 % 128;
        int i4 = i3 % 2;
        onBackButtonPressed();
        int i5 = ag + 47;
        ae = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
    }

    private void u() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = ae + 97;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11673u.setVisibility(32);
            this.C.d();
            z2 = false;
        } else {
            this.f11673u.setVisibility(8);
            this.C.d();
            z2 = true;
        }
        setCameraUIVisibility(z2);
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public void onReviewContinueClicked() {
        int i2 = 2 % 2;
        Object obj = null;
        if (!IncodeWelcome.getInstance().isCaptureOnlyMode()) {
            if (IncodeWelcome.getInstance().isDelayedMode()) {
                int i3 = ag + 109;
                ae = i3 % 128;
                if (i3 % 2 == 0) {
                    super.proceedDelayedScanResult();
                    return;
                } else {
                    super.proceedDelayedScanResult();
                    throw null;
                }
            }
            super.uploadSavedScan();
            return;
        }
        int i4 = ae + 107;
        ag = i4 % 128;
        if (i4 % 2 != 0) {
            super.proceedCaptureOnlyIdScanResult();
        } else {
            super.proceedCaptureOnlyIdScanResult();
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$2 */
    final class AnonymousClass2 implements Transition.TransitionListener {

        /* JADX INFO: renamed from: b */
        private static int f11683b = 1;

        /* JADX INFO: renamed from: e */
        private static int f11684e = 0;

        AnonymousClass2() {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            int i2 = 2 % 2;
            int i3 = f11683b + 37;
            f11684e = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ void d(java.lang.Integer r8) throws java.lang.Exception {
            /*
                r7 = this;
                r4 = 2
                int r0 = r4 % r4
                int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.AnonymousClass2.f11683b
                int r1 = r0 + 33
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.AnonymousClass2.f11684e = r0
                int r1 = r1 % r4
                r6 = 4
                r5 = -1
                r3 = -3
                r2 = 0
                if (r1 == 0) goto L35
                int r1 = r8.intValue()
                int r0 = r2 / r2
                if (r1 == r3) goto L4a
                if (r1 == r5) goto L42
                if (r1 == r4) goto L42
                if (r1 == r6) goto L4a
            L20:
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.this
                com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.b(r0)
                r0.onIdealCaptureEnvironmentFound()
                int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.AnonymousClass2.f11684e
                int r1 = r0 + 11
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.AnonymousClass2.f11683b = r0
                int r1 = r1 % r4
                if (r1 == 0) goto L52
                return
            L35:
                int r0 = r8.intValue()
                if (r0 == r3) goto L4a
                if (r0 == r5) goto L42
                if (r0 == r4) goto L42
                if (r0 == r6) goto L4a
                goto L20
            L42:
                java.lang.String r1 = "Not all tests for ideal device environment are supported!"
                java.lang.Object[] r0 = new java.lang.Object[r2]
                timber.log.Timber.w(r1, r0)
                goto L20
            L4a:
                java.lang.String r1 = "Ideal device environment test partially incomplete!"
                java.lang.Object[] r0 = new java.lang.Object[r2]
                timber.log.Timber.w(r1, r0)
                goto L20
            L52:
                r0 = 0
                r0.hashCode()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.AnonymousClass2.d(java.lang.Integer):void");
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            int i2 = 2 % 2;
            int i3 = f11683b + 87;
            f11684e = i3 % 128;
            int i4 = i3 % 2;
            if (ValidationPhase.SCAN_DOCUMENT != ValidationActivity.this.getValidationPhase()) {
                int i5 = f11684e + 65;
                f11683b = i5 % 128;
                int i6 = i5 % 2;
                ValidationActivity.this.f11664l.add(ValidationActivity.d(ValidationActivity.this).getIdealCaptureEnvironmentTestSingle().subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$2$$ExternalSyntheticLambda0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) throws Exception {
                        this.f$0.d((Integer) obj);
                    }
                }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$2$$ExternalSyntheticLambda1
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        Timber.e((Throwable) obj);
                    }
                }));
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            int i2 = 2 % 2;
            int i3 = f11683b + 45;
            f11684e = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            int i2 = 2 % 2;
            int i3 = f11683b + 71;
            f11684e = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 43 / 0;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            int i2 = 2 % 2;
            int i3 = f11684e + 27;
            f11683b = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void onImageTaken(Bitmap bitmap) {
        int i2 = 2 % 2;
        setCameraUIVisibility(false, new AnonymousClass2());
        hideFeedback();
        stopValidation();
        flashPreview(bitmap);
        talkBackAccessibilityText(R.string.onboard_sdk_validation_voice_over_autocapture_success);
        super.onImageTaken(bitmap);
        int i3 = ag + 47;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        ValidationActivity validationActivity = (ValidationActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = ag + 21;
        ae = i3 % 128;
        int i4 = i3 % 2;
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(validationActivity, validationActivity.f11675w, "review_image_transition").toBundle();
        int i5 = ae + 73;
        ag = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return bundle;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void onUploadStarted(ValidationPhase validationPhase) {
        int i2 = 2 % 2;
        int i3 = ag + 19;
        ae = i3 % 128;
        int i4 = i3 % 2;
        b(false);
        setUploadProgressVisible(true);
        int i5 = ae + 113;
        ag = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setUploadProgressVisible(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = ag;
        int i5 = i4 + 99;
        ae = i5 % 128;
        int i6 = i5 % 2;
        LinearLayout linearLayout = this.f11673u;
        if (z2) {
            int i7 = i4 + 61;
            ae = i7 % 128;
            i2 = i7 % 2 != 0 ? 1 : 0;
        } else {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        this.f11674v = z2;
    }

    public boolean isUploadProgressVisible() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = ag + 33;
        int i4 = i3 % 128;
        ae = i4;
        if (i3 % 2 != 0) {
            z2 = this.f11674v;
            int i5 = 12 / 0;
        } else {
            z2 = this.f11674v;
        }
        int i6 = i4 + 115;
        ag = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] r8) {
        /*
            r7 = 0
            r3 = r8[r7]
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity r3 = (com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity) r3
            r4 = 1
            r0 = r8[r4]
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae
            int r1 = r0 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag = r0
            int r1 = r1 % r5
            r2 = 0
            if (r1 == 0) goto L51
            android.widget.ProgressBar r0 = r3.f11677y
            com.incode.welcome_sdk.commons.ui.ProgressBarAnimation.setProgressAnimated(r0, r6)
            boolean r0 = r3.isUploadProgressVisible()
            if (r0 == 0) goto L47
            r0 = 50
            if (r6 < r0) goto L47
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ag
            int r1 = r0 + 41
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.ae = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L48
            com.incode.welcome_sdk.commons.ui.DotAnimation r0 = r3.C
            boolean r1 = r0.a()
            r0 = 31
            int r0 = r0 / r7
            if (r1 == r4) goto L47
        L42:
            com.incode.welcome_sdk.commons.ui.DotAnimation r0 = r3.C
            r0.b()
        L47:
            return r2
        L48:
            com.incode.welcome_sdk.commons.ui.DotAnimation r0 = r3.C
            boolean r0 = r0.a()
            if (r0 != 0) goto L47
            goto L42
        L51:
            android.widget.ProgressBar r0 = r3.f11677y
            com.incode.welcome_sdk.commons.ui.ProgressBarAnimation.setProgressAnimated(r0, r6)
            r3.isUploadProgressVisible()
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.e(java.lang.Object[]):java.lang.Object");
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void setUploadProgress(final int i2) {
        int i3 = 2 % 2;
        int i4 = ae + 19;
        ag = i4 % 128;
        if (i4 % 2 == 0) {
            runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda46
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.d(i2);
                }
            });
            int i5 = 6 / 0;
        } else {
            runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda46
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.d(i2);
                }
            });
        }
        int i6 = ae + 67;
        ag = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 47 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public void showFeedback(ValidationFeedback validationFeedback) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = ag + 57;
        ae = i3 % 128;
        int i4 = i3 % 2;
        if (this.Z && validationFeedback.isCancelable()) {
            return;
        }
        if (validationFeedback.isCancelable()) {
            int i5 = ag + 3;
            ae = i5 % 128;
            int i6 = i5 % 2;
            z2 = false;
        } else {
            int i7 = ae + 97;
            ag = i7 % 128;
            int i8 = i7 % 2;
            z2 = true;
        }
        this.Z = z2;
        this.J.removeCallbacks(this.af);
        TransitionManager.endTransitions(this.f11663j);
        aj.e(this.O);
        TransitionManager.beginDelayedTransition(this.f11663j, new Fade().addTarget(this.J));
        this.O.setText(getString(validationFeedback.getMessageResId()));
        this.O.setCompoundDrawablesWithIntrinsicBounds(0, validationFeedback.getDrawableResId(), 0, 0);
        this.J.setVisibility(0);
        if (!validationFeedback.isPersistent()) {
            this.J.postDelayed(this.af, validationFeedback.getDelayMillis());
        }
        talkBackAccessibilityText(validationFeedback.getVoiceOverMessageResId());
        int i9 = ae + 75;
        ag = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$1 */
    final class AnonymousClass1 implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        private static int f11679a = 1;

        /* JADX INFO: renamed from: e */
        private static int f11680e = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Animation f11682d;

        AnonymousClass1(Animation animation) {
            animation = animation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            int i2 = 2 % 2;
            int i3 = f11680e + 113;
            f11679a = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            int i2 = 2 % 2;
            int i3 = f11680e + 33;
            f11679a = i3 % 128;
            if (i3 % 2 == 0) {
                ValidationActivity.this.f11661h.startAnimation(animation);
                ValidationActivity.this.f11661h.setVisibility(1);
            } else {
                ValidationActivity.this.f11661h.startAnimation(animation);
                ValidationActivity.this.f11661h.setVisibility(0);
            }
            int i4 = f11679a + 1;
            f11680e = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            int i2 = 2 % 2;
            int i3 = f11680e + 95;
            f11679a = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private void x() {
        int i2 = 2 % 2;
        Timber.d("showManualCapture called", new Object[0]);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.onboard_sdk_slide_up_overshoot);
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.1

            /* JADX INFO: renamed from: a */
            private static int f11679a = 1;

            /* JADX INFO: renamed from: e */
            private static int f11680e = 0;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ Animation f11682d;

            AnonymousClass1(Animation animation) {
                animation = animation;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                int i22 = 2 % 2;
                int i3 = f11680e + 113;
                f11679a = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                int i22 = 2 % 2;
                int i3 = f11680e + 33;
                f11679a = i3 % 128;
                if (i3 % 2 == 0) {
                    ValidationActivity.this.f11661h.startAnimation(animation);
                    ValidationActivity.this.f11661h.setVisibility(1);
                } else {
                    ValidationActivity.this.f11661h.startAnimation(animation);
                    ValidationActivity.this.f11661h.setVisibility(0);
                }
                int i4 = f11679a + 1;
                f11680e = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                int i22 = 2 % 2;
                int i3 = f11680e + 95;
                f11679a = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        this.f11665m.startAnimation(animationLoadAnimation);
        this.f11665m.setVisibility(0);
        o(true);
        int i3 = ag + 121;
        ae = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* synthetic */ void B() {
        int i2 = 2 % 2;
        int i3 = ag + 107;
        ae = i3 % 128;
        int i4 = i3 % 2;
        talkBackAccessibilityText(R.string.onboard_sdk_validation_voice_over_enter_manual_mode);
        int i5 = ae + 55;
        ag = i5 % 128;
        int i6 = i5 % 2;
    }

    private void A() {
        int i2 = 2 % 2;
        int i3 = ag + 107;
        ae = i3 % 128;
        int i4 = i3 % 2;
        if (isAccessibilityTalkBackActive() && ((BaseValidationActivity) this).f11735k.isManualCaptureMode()) {
            if (!this.f11665m.isAccessibilityFocused()) {
                this.f11665m.sendAccessibilityEvent(8);
                int i5 = ae + 25;
                ag = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 % 4;
                }
            }
            new Handler().postDelayed(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.B();
                }
            }, ConfigurationDefaultValue.MotionPaddingAroundTouchMSec);
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public void hideFeedback() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = ag + 3;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            this.J.removeCallbacks(this.af);
            this.J.post(this.af);
            z2 = true;
        } else {
            this.J.removeCallbacks(this.af);
            this.J.post(this.af);
            z2 = false;
        }
        this.Z = z2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        ValidationActivity validationActivity = (ValidationActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = ae + 31;
        ag = i3 % 128;
        int i4 = i3 % 2;
        if (zBooleanValue) {
            TransitionManager.beginDelayedTransition(validationActivity.f11668p, new Slide(48));
        }
        validationActivity.f11668p.setVisibility(8);
        validationActivity.f11675w.setBackgroundResource(R.drawable.onboard_sdk_bg_border_light);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) validationActivity.f11675w.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).width = -1;
        ((ViewGroup.LayoutParams) layoutParams).height = -1;
        validationActivity.f11675w.setLayoutParams(layoutParams);
        validationActivity.f11675w.invalidate();
        int i5 = ae + 1;
        ag = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$4 */
    final class AnonymousClass4 implements RequestListener<Drawable> {

        /* JADX INFO: renamed from: c */
        private static int f11690c = 0;

        /* JADX INFO: renamed from: e */
        private static int f11691e = 1;

        AnonymousClass4() {
        }

        @Override // com.bumptech.glide.request.RequestListener
        public final /* synthetic */ boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z2) {
            int i2 = 2 % 2;
            int i3 = f11690c + 97;
            f11691e = i3 % 128;
            int i4 = i3 % 2;
            boolean zC = c(drawable);
            int i5 = f11691e + 57;
            f11690c = i5 % 128;
            if (i5 % 2 == 0) {
                return zC;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // com.bumptech.glide.request.RequestListener
        public final boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z2) {
            int i2 = 2 % 2;
            int i3 = f11690c;
            int i4 = i3 + 85;
            f11691e = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 27;
            f11691e = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        private boolean c(Drawable drawable) {
            int i2 = 2 % 2;
            int i3 = f11691e + 115;
            f11690c = i3 % 128;
            if (i3 % 2 != 0) {
                ValidationActivity.this.f11662i.saveRoundedImage(ValidationActivity.e(ValidationActivity.this).getImagesDirectory(), ValidationActivity.this.getDocumentType(), ((BitmapDrawable) drawable).getBitmap());
                return true;
            }
            ValidationActivity.this.f11662i.saveRoundedImage(ValidationActivity.e(ValidationActivity.this).getImagesDirectory(), ValidationActivity.this.getDocumentType(), ((BitmapDrawable) drawable).getBitmap());
            return false;
        }
    }

    public /* synthetic */ void b(int i2, int i3) {
        int i4 = 2 % 2;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(1200L);
        changeBounds.addTarget(this.f11675w);
        changeBounds.setInterpolator(new AnticipateOvershootInterpolator(0.9f));
        TransitionManager.beginDelayedTransition(this.f11668p, changeBounds);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f11675w.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).width = i2;
        ((ViewGroup.LayoutParams) layoutParams).height = i3;
        this.f11675w.setLayoutParams(layoutParams);
        this.f11666n.startShimmer();
        int i5 = ag + 103;
        ae = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ void e(final int i2, final int i3) {
        int i4 = 2 % 2;
        int i5 = ae + 17;
        ag = i5 % 128;
        int i6 = i5 % 2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f11675w.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).width = getTriggerRectAbsolute().width();
        ((ViewGroup.LayoutParams) layoutParams).height = getTriggerRectAbsolute().height();
        this.f11675w.setLayoutParams(layoutParams);
        this.f11668p.setVisibility(0);
        this.f11675w.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda47
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(i2, i3);
            }
        });
        int i7 = ae + 51;
        ag = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public void flashPreview(Bitmap bitmap) {
        boolean z2;
        float width;
        int i2 = 2 % 2;
        int i3 = ag + 51;
        ae = i3 % 128;
        int i4 = i3 % 2;
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, false}, -1541598646, 1541598649, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
        if (bitmap == null || bitmap.getHeight() == 0 || bitmap.getWidth() == 0) {
            z2 = false;
        } else {
            int i5 = ag + 67;
            ae = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 2;
            }
            z2 = true;
        }
        float width2 = z2 ? bitmap.getWidth() / bitmap.getHeight() : 0.75f;
        int screenWidth = getScreenWidth() - ((this.X * 2) + (this.V * 2));
        if (width2 < 0.75f) {
            int i7 = ag + 105;
            ae = i7 % 128;
            int i8 = i7 % 2;
            screenWidth = (int) (screenWidth * (width2 / 0.75f));
        }
        if (z2) {
            int i9 = ae + 3;
            ag = i9 % 128;
            width = i9 % 2 == 0 ? bitmap.getWidth() + screenWidth : bitmap.getWidth() / screenWidth;
        } else {
            width = 1.0f;
        }
        int i10 = this.W;
        int i11 = this.V;
        int i12 = (int) ((i10 - i11) * width);
        final int i13 = (i11 * 2) + screenWidth;
        final int i14 = ((int) (screenWidth / width2)) + (i11 * 2);
        Glide.with((FragmentActivity) this).load(bitmap).skipMemoryCache(true).transform(this.ah ? new MultiTransformation(new BlurTransformation(getContext()), new RoundedCorners(Math.max(i12, 1))) : new MultiTransformation(new RoundedCorners(Math.max(i12, 1)))).addListener(new RequestListener<Drawable>() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.4

            /* JADX INFO: renamed from: c */
            private static int f11690c = 0;

            /* JADX INFO: renamed from: e */
            private static int f11691e = 1;

            AnonymousClass4() {
            }

            @Override // com.bumptech.glide.request.RequestListener
            public final /* synthetic */ boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z22) {
                int i22 = 2 % 2;
                int i32 = f11690c + 97;
                f11691e = i32 % 128;
                int i42 = i32 % 2;
                boolean zC = c(drawable);
                int i52 = f11691e + 57;
                f11690c = i52 % 128;
                if (i52 % 2 == 0) {
                    return zC;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public final boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z22) {
                int i22 = 2 % 2;
                int i32 = f11690c;
                int i42 = i32 + 85;
                f11691e = i42 % 128;
                int i52 = i42 % 2;
                int i62 = i32 + 27;
                f11691e = i62 % 128;
                int i72 = i62 % 2;
                return false;
            }

            private boolean c(Drawable drawable) {
                int i22 = 2 % 2;
                int i32 = f11691e + 115;
                f11690c = i32 % 128;
                if (i32 % 2 != 0) {
                    ValidationActivity.this.f11662i.saveRoundedImage(ValidationActivity.e(ValidationActivity.this).getImagesDirectory(), ValidationActivity.this.getDocumentType(), ((BitmapDrawable) drawable).getBitmap());
                    return true;
                }
                ValidationActivity.this.f11662i.saveRoundedImage(ValidationActivity.e(ValidationActivity.this).getImagesDirectory(), ValidationActivity.this.getDocumentType(), ((BitmapDrawable) drawable).getBitmap());
                return false;
            }
        }).into(this.f11675w);
        this.f11675w.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e(i13, i14);
            }
        });
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.View
    public void removePreview() {
        int i2 = 2 % 2;
        int i3 = ae + 41;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            int iB = UserConsentActivity.Companion.b();
            b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, true}, -1541598646, 1541598649, UserConsentActivity.Companion.b(), iB);
            return;
        }
        int iB2 = UserConsentActivity.Companion.b();
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, true}, -1541598646, 1541598649, UserConsentActivity.Companion.b(), iB2);
    }

    public /* synthetic */ void D() throws Exception {
        int i2 = 2 % 2;
        int i3 = ae + 111;
        ag = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11662i.waitUntilRoundedImageSaved();
            int i4 = 65 / 0;
        } else {
            this.f11662i.waitUntilRoundedImageSaved();
        }
        int i5 = ag + 51;
        ae = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ void a(DocumentType documentType) throws Exception {
        int i2 = 2 % 2;
        int i3 = ag + 7;
        ae = i3 % 128;
        if (i3 % 2 != 0) {
            int iB = UserConsentActivity.Companion.b();
            ReviewPhotoActivity.startForResult(this, documentType, (Bundle) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -568400011, 568400022, UserConsentActivity.Companion.b(), iB));
            int i4 = 52 / 0;
        } else {
            int iB2 = UserConsentActivity.Companion.b();
            ReviewPhotoActivity.startForResult(this, documentType, (Bundle) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -568400011, 568400022, UserConsentActivity.Companion.b(), iB2));
        }
        int i5 = ag + 81;
        ae = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void showReviewActivity(final DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = ae + 13;
        ag = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11664l.add(Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    this.f$0.D();
                }
            }).subscribeOn(Schedulers.io()).delay(1000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda4
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    this.f$0.a(documentType);
                }
            }));
        } else {
            this.f11664l.add(Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    this.f$0.D();
                }
            }).subscribeOn(Schedulers.io()).delay(1000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda4
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    this.f$0.a(documentType);
                }
            }));
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void showNoNetworkSnackbar() {
        int i2 = 2 % 2;
        int i3 = ag + 27;
        ae = i3 % 128;
        int i4 = i3 % 2;
        this.f11675w.setBackgroundResource(R.drawable.onboard_sdk_bg_border_fail);
        showNoNetworkMessage();
        int i5 = ae + 27;
        ag = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.BaseActivity
    public void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = ae + 9;
        ag = i3 % 128;
        int i4 = i3 % 2;
        if (this.B.getVisibility() == 0 || this.I.getVisibility() == 0) {
            onBtnHelpContinue();
            return;
        }
        super.onBackButtonPressed();
        int i5 = ag + 69;
        ae = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.BaseActivity, com.incode.welcome_sdk.ui.BaseView
    public void closeScreen() {
        int i2 = 2 % 2;
        int i3 = ae + 121;
        ag = i3 % 128;
        int i4 = i3 % 2;
        super.closeScreen();
        int i5 = ag + 123;
        ae = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void setShutterButtonVisible(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = ae;
        int i5 = i4 + 71;
        ag = i5 % 128;
        int i6 = i5 % 2;
        Button button = this.f11665m;
        if (z2) {
            int i7 = i4 + 61;
            ag = i7 % 128;
            i2 = i7 % 2 == 0 ? 1 : 0;
        } else {
            i2 = 8;
        }
        button.setVisibility(i2);
        if (!z2 && this.f11661h.getVisibility() == 0) {
            this.f11661h.setVisibility(8);
        }
        if (z2) {
            int i8 = ae + 11;
            ag = i8 % 128;
            int i9 = i8 % 2;
            o(true);
        }
    }

    private void o(boolean z2) {
        int i2 = 2 % 2;
        int i3 = ag + 115;
        ae = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11665m.setEnabled(z2);
            return;
        }
        this.f11665m.setEnabled(z2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onDetectionResult(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        int i3 = ag + 85;
        ae = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    class b extends OrientationEventListener {

        /* JADX INFO: renamed from: a */
        private static int f11693a = 1;

        /* JADX INFO: renamed from: c */
        private static int f11694c = 0;

        public b(Context context) {
            super(context);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0026  */
        @Override // android.view.OrientationEventListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onOrientationChanged(int r7) {
            /*
                r6 = this;
                r2 = 2
                int r0 = r2 % r2
                r0 = -1
                if (r7 != r0) goto L7
                return
            L7:
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.this
                int r0 = r0.f11667o
                int r4 = com.incode.welcome_sdk.commons.utils.ab.e(r7, r0)
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.this
                com.incode.welcome_sdk.ui.camera.CameraPreview r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.c(r0)
                if (r0 == 0) goto L59
                r5 = 270(0x10e, float:3.78E-43)
                if (r4 == r5) goto L26
                int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.b.f11693a
                int r1 = r0 + 89
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.b.f11694c = r0
                int r1 = r1 % r2
                if (r4 != 0) goto L59
            L26:
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.this
                int r0 = r0.f11667o
                if (r0 == r4) goto L59
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                java.lang.Object[] r1 = new java.lang.Object[]{r0}
                java.lang.String r0 = "onOrientationChanged, newOrientation %s"
                timber.log.Timber.d(r0, r1)
                java.lang.String r3 = "rotation"
                if (r4 != r5) goto L63
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.this
                android.widget.FrameLayout r1 = r0.f11663j
                float[] r0 = new float[r2]
                r0 = {x007e: FILL_ARRAY_DATA , data: [0, 1119092736} // fill-array
                android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r3, r0)
                android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
                r0.<init>()
                r0.play(r1)
                r0.start()
            L55:
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.this
                r0.f11667o = r4
            L59:
                int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.b.f11693a
                int r1 = r0 + 5
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.b.f11694c = r0
                int r1 = r1 % r2
                return
            L63:
                if (r4 != 0) goto L55
                com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity r0 = com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.this
                android.widget.FrameLayout r1 = r0.f11663j
                float[] r0 = new float[r2]
                r0 = {x0086: FILL_ARRAY_DATA , data: [1119092736, 0} // fill-array
                android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r3, r0)
                android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
                r0.<init>()
                r0.play(r1)
                r0.start()
                goto L55
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity.b.onOrientationChanged(int):void");
        }
    }

    public static /* synthetic */ Object b(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = (~(i8 | i7)) | i5;
        int i10 = ~i5;
        int i11 = ~(i8 | i10);
        int i12 = ~i7;
        int i13 = i11 | (~(i10 | i12));
        int i14 = (~(i7 | i10)) | (~(i8 | i12));
        int i15 = i4 + i5 + i2 + (417615942 * i3) + (566850886 * i6);
        int i16 = i15 * i15;
        int i17 = ((-370608051) * i4) + 147849216 + ((-2147356519) * i5) + (i9 * 1776748468) + (i13 * 1776748468) + (1776748468 * i14) + (1406140416 * i2) + ((-354418688) * i3) + ((-85983232) * i6) + ((-608960512) * i16);
        int i18 = (i4 * (-1357469509)) + 140661806 + (i5 * (-1357469617)) + (i9 * 108) + (i13 * 108) + (i14 * 108) + ((-1357469401) * i2) + (1137340586 * i3) + (304092074 * i6) + (i16 * 1282146304);
        int frontIdScanAttemptsRemaining = 0;
        switch (i17 + (i18 * i18 * 1158414336)) {
            case 1:
                final ValidationActivity validationActivity = (ValidationActivity) objArr[0];
                final Runnable runnable = (Runnable) objArr[1];
                final boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i19 = 2 % 2;
                int i20 = ag + 95;
                ae = i20 % 128;
                int i21 = i20 % 2;
                ValidationPhase validationPhase = validationActivity.getValidationPhase();
                if (validationPhase == ValidationPhase.SCAN_DOCUMENT) {
                    return null;
                }
                int i22 = AnonymousClass3.f11688d[validationPhase.ordinal()];
                if (i22 == 1 || i22 == 2) {
                    frontIdScanAttemptsRemaining = ((BaseValidationActivity) validationActivity).f11735k.getFrontIdScanAttemptsRemaining();
                } else if (i22 == 3) {
                    frontIdScanAttemptsRemaining = ((BaseValidationActivity) validationActivity).f11735k.getBackIdScanAttemptsRemaining();
                    int i23 = ae + 105;
                    ag = i23 % 128;
                    int i24 = i23 % 2;
                }
                validationActivity.f(true);
                if (!IncodeWelcome.getInstance().isCaptureOnlyMode()) {
                    validationActivity.M.setText(validationActivity.getResources().getQuantityString(R.plurals.onboard_sdk_validation_attempts_remaining, frontIdScanAttemptsRemaining, Integer.valueOf(frontIdScanAttemptsRemaining)));
                    validationActivity.j(true);
                }
                validationActivity.K.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity$$ExternalSyntheticLambda13
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ValidationActivity.m8296instrumented$0$b$IILjavalangObjectIIIILjavalangObject(this.f$0, runnable, zBooleanValue, view);
                    }
                });
                return null;
            case 2:
                return e(objArr);
            case 3:
                return a(objArr);
            case 4:
                return b(objArr);
            case 5:
                ValidationActivity validationActivity2 = (ValidationActivity) objArr[0];
                int i25 = 2 % 2;
                int i26 = ag + 43;
                ae = i26 % 128;
                for (int i27 = i26 % 2 == 0 ? 0 : 1; i27 < validationActivity2.f11668p.getChildCount(); i27++) {
                    int i28 = ae + 125;
                    ag = i28 % 128;
                    int i29 = i28 % 2;
                    if (validationActivity2.f11668p.getChildAt(i27) instanceof DotAnimation) {
                        return null;
                    }
                }
                validationActivity2.C = new DotAnimation(validationActivity2);
                int screenDensity = (int) (validationActivity2.getScreenDensity() * 20.0f);
                validationActivity2.C.setPadding(screenDensity, screenDensity, screenDensity, screenDensity);
                validationActivity2.f11668p.addView(validationActivity2.C, validationActivity2.f11675w.getLayoutParams());
                return null;
            case 6:
                Throwable th = (Throwable) objArr[0];
                int i30 = 2 % 2;
                int i31 = ae + 3;
                ag = i31 % 128;
                if (i31 % 2 == 0) {
                    Timber.e(th, "Couldn't wait for anims", new Object[0]);
                    return null;
                }
                Timber.e(th, "Couldn't wait for anims", new Object[0]);
                return null;
            case 7:
                return d(objArr);
            case 8:
                return h(objArr);
            case 9:
                return f(objArr);
            case 10:
                return g(objArr);
            case 11:
                return i(objArr);
            case 12:
                ValidationActivity validationActivity3 = (ValidationActivity) objArr[0];
                int i32 = 2 % 2;
                int i33 = ae + 45;
                ag = i33 % 128;
                int i34 = i33 % 2;
                validationActivity3.removePreview();
                validationActivity3.b(false);
                validationActivity3.skipCurrentValidationPhase();
                int i35 = ag + 117;
                ae = i35 % 128;
                int i36 = i35 % 2;
                return null;
            case 13:
                ValidationActivity validationActivity4 = (ValidationActivity) objArr[0];
                int i37 = 2 % 2;
                int i38 = ag + 109;
                ae = i38 % 128;
                if (i38 % 2 != 0) {
                    super.userSelectedManualCapture();
                    validationActivity4.h(true);
                    validationActivity4.b(false);
                    return null;
                }
                super.userSelectedManualCapture();
                validationActivity4.h(false);
                validationActivity4.b(true);
                return null;
            case 14:
                ValidationActivity validationActivity5 = (ValidationActivity) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                Runnable runnable2 = (Runnable) objArr[2];
                int i39 = 2 % 2;
                int i40 = ae + 19;
                ag = i40 % 128;
                if (i40 % 2 == 0) {
                    b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{validationActivity5, Integer.valueOf(iIntValue), true, true, runnable2, false}, 577077712, -577077694, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                } else {
                    b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{validationActivity5, Integer.valueOf(iIntValue), true, true, runnable2, false}, 577077712, -577077694, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
                }
                int i41 = ag + 75;
                ae = i41 % 128;
                int i42 = i41 % 2;
                return null;
            case 15:
                return j(objArr);
            case 16:
                ValidationActivity validationActivity6 = (ValidationActivity) objArr[0];
                int i43 = 2 % 2;
                int i44 = ag + 25;
                ae = i44 % 128;
                if (i44 % 2 != 0) {
                    validationActivity6.b(true);
                    validationActivity6.stopValidation();
                    validationActivity6.d(validationActivity6.isIdAutoCaptureEnabled());
                    validationActivity6.h(true);
                    validationActivity6.c(true);
                } else {
                    validationActivity6.b(false);
                    validationActivity6.stopValidation();
                    validationActivity6.d(validationActivity6.isIdAutoCaptureEnabled());
                    validationActivity6.h(true);
                    validationActivity6.c(false);
                }
                int i45 = ag + 29;
                ae = i45 % 128;
                int i46 = i45 % 2;
                return null;
            case 17:
                return o(objArr);
            case 18:
                return n(objArr);
            case 19:
                return m(objArr);
            default:
                return c(objArr);
        }
    }

    private /* synthetic */ void e(View view) {
        int iB = UserConsentActivity.Companion.b();
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, view}, 1851798599, -1851798586, UserConsentActivity.Companion.b(), iB);
    }

    public /* synthetic */ void j(Long l2) throws Exception {
        int iB = UserConsentActivity.Companion.b();
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, l2}, -1618572675, 1618572675, UserConsentActivity.Companion.b(), iB);
    }

    public /* synthetic */ void M() {
        int iB = UserConsentActivity.Companion.b();
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, 641307147, -641307135, UserConsentActivity.Companion.b(), iB);
    }

    public /* synthetic */ void F() {
        int iB = UserConsentActivity.Companion.b();
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -93875755, 93875762, UserConsentActivity.Companion.b(), iB);
    }

    public /* synthetic */ void b(boolean z2, boolean z3, Runnable runnable, boolean z4) throws Exception {
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Boolean.valueOf(z2), Boolean.valueOf(z3), runnable, Boolean.valueOf(z4)}, 2144161946, -2144161931, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
    }

    private /* synthetic */ void d(Runnable runnable, boolean z2, View view) {
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, runnable, Boolean.valueOf(z2), view}, 1412798287, -1412798268, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
    }

    private /* synthetic */ void a(Runnable runnable, boolean z2, View view) {
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, runnable, Boolean.valueOf(z2), view}, -470433642, 470433650, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
    }

    public static /* synthetic */ void e(Throwable th) throws Exception {
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{th}, 1740681148, -1740681142, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
    }

    public /* synthetic */ void d(int i2) {
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(i2)}, 1193128770, -1193128768, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
    }

    private void i(boolean z2) {
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Boolean.valueOf(z2)}, -1541598646, 1541598649, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
    }

    private Bundle w() {
        int iB = UserConsentActivity.Companion.b();
        return (Bundle) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -568400011, 568400022, UserConsentActivity.Companion.b(), iB);
    }

    private void a(Runnable runnable, boolean z2) {
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, runnable, Boolean.valueOf(z2)}, -1705806607, 1705806608, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
    }

    private void d(int i2, boolean z2, boolean z3, Runnable runnable, boolean z4) {
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(i2), Boolean.valueOf(z2), Boolean.valueOf(z3), runnable, Boolean.valueOf(z4)}, 577077712, -577077694, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
    }

    private void d(int i2, Runnable runnable) {
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this, Integer.valueOf(i2), runnable}, 880488357, -880488343, UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b());
    }

    private Runnable p() {
        int iB = UserConsentActivity.Companion.b();
        return (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, 1619484215, -1619484206, UserConsentActivity.Companion.b(), iB);
    }

    private Runnable n() {
        int iB = UserConsentActivity.Companion.b();
        return (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, 1166246283, -1166246279, UserConsentActivity.Companion.b(), iB);
    }

    private Runnable k() {
        int iB = UserConsentActivity.Companion.b();
        return (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -450650438, 450650455, UserConsentActivity.Companion.b(), iB);
    }

    private Runnable m() {
        int iB = UserConsentActivity.Companion.b();
        return (Runnable) b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, 472256922, -472256912, UserConsentActivity.Companion.b(), iB);
    }

    private void d() {
        int iB = UserConsentActivity.Companion.b();
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -1993528107, 1993528123, UserConsentActivity.Companion.b(), iB);
    }

    private void e() {
        int iB = UserConsentActivity.Companion.b();
        b(UserConsentActivity.Companion.b(), UserConsentActivity.Companion.b(), new Object[]{this}, -1789092191, 1789092196, UserConsentActivity.Companion.b(), iB);
    }
}
