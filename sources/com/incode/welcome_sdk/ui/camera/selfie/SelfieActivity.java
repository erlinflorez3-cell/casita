package com.incode.welcome_sdk.ui.camera.selfie;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewKt;
import androidx.transition.TransitionInflater;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.biocatch.android.commonsdk.configuration.ConfigurationDefaultValue;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.camera.IncodeCamera;
import com.incode.welcome_sdk.CameraFacing;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.commons.utils.LayoutUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.commons.utils.ai;
import com.incode.welcome_sdk.commons.utils.aj;
import com.incode.welcome_sdk.commons.utils.e;
import com.incode.welcome_sdk.commons.utils.n;
import com.incode.welcome_sdk.commons.utils.p;
import com.incode.welcome_sdk.d.ad;
import com.incode.welcome_sdk.d.z;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.remote.beans.cb;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.incode.welcome_sdk.results.DeviceStats;
import com.incode.welcome_sdk.results.FaceAuthenticationResult;
import com.incode.welcome_sdk.results.FaceLoginResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.SelfieScanResult;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.CameraPreviewType;
import com.incode.welcome_sdk.ui.camera.CameraXActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.IdealEnvironmentTestResult;
import com.incode.welcome_sdk.ui.camera.selfie.SelfieContract;
import com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint;
import com.incode.welcome_sdk.ui.government_validation.GovernmentValidationActivity;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureVersionGate;
import com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.io.Serializable;
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
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class SelfieActivity extends CameraXActivity implements SelfieContract.View {

    /* JADX INFO: renamed from: u */
    private static int f11982u = 0;

    /* JADX INFO: renamed from: w */
    private static int f11983w = 1;

    /* JADX INFO: renamed from: b */
    SelfieScanModeExtended f11984b;

    /* JADX INFO: renamed from: c */
    a f11985c;

    /* JADX INFO: renamed from: d */
    int f11986d;

    /* JADX INFO: renamed from: f */
    private SelfiePresenter f11988f;

    /* JADX INFO: renamed from: h */
    private Disposable f11990h;

    /* JADX INFO: renamed from: i */
    private FaceProcessingUtils.FaceProcessingState f11991i;

    /* JADX INFO: renamed from: j */
    private Disposable f11992j;

    /* JADX INFO: renamed from: k */
    private CompositeDisposable f11993k;

    /* JADX INFO: renamed from: m */
    private CompositeDisposable f11995m;

    /* JADX INFO: renamed from: n */
    private CompositeDisposable f11996n;

    /* JADX INFO: renamed from: o */
    private Vibrator f11997o;

    /* JADX INFO: renamed from: r */
    private int f12000r;

    /* JADX INFO: renamed from: t */
    private boolean f12002t;

    /* JADX INFO: renamed from: e */
    private final PublishSubject<Object> f11987e = PublishSubject.create();

    /* JADX INFO: renamed from: g */
    private FaceProcessingUtils.FaceProcessingState f11989g = FaceProcessingUtils.FaceProcessingState.NO_FACE;

    /* JADX INFO: renamed from: l */
    private SelfieScanResult f11994l = null;

    /* JADX INFO: renamed from: q */
    private boolean f11999q = false;

    /* JADX INFO: renamed from: p */
    private boolean f11998p = false;

    /* JADX INFO: renamed from: s */
    private boolean f12001s = true;

    /* JADX WARN: Removed duplicated region for block: B:91:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object d(int r15, int r16, int r17, int r18, java.lang.Object[] r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.d(int, int, int, int, java.lang.Object[], int, int):java.lang.Object");
    }

    /* JADX INFO: renamed from: instrumented$0$e$-IILcom-incode-welcome_sdk-commons-utils-n$c-IZ-V */
    public static /* synthetic */ void m8340xe1d2daea(SelfieActivity selfieActivity, View view) {
        Callback.onClick_enter(view);
        try {
            selfieActivity.f(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$0$e$-Ljava-lang-Boolean-ZLjava-lang-String-Ljava-lang-String-IIILcom-incode-welcome_sdk-commons-utils-n$c--V */
    public static /* synthetic */ void m8341x4dc03bd(SelfieActivity selfieActivity, boolean z2, Boolean bool, String str, String str2, int i2, View view) {
        Callback.onClick_enter(view);
        try {
            selfieActivity.d(z2, bool, str, str2, i2, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$2$safeOnCreate$-Landroid-os-Bundle--V */
    public static /* synthetic */ void m8342instrumented$2$safeOnCreate$LandroidosBundleV(SelfieActivity selfieActivity, View view) {
        Callback.onClick_enter(view);
        try {
            selfieActivity.j(view);
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
            short sXd = (short) (FB.Xd() ^ (137254029 ^ 137259252));
            short sXd2 = (short) (FB.Xd() ^ ((1085199368 ^ 1176706891) ^ 109961347));
            int[] iArr = new int["\u0006r8uY".length()];
            QB qb = new QB("\u0006r8uY");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strVd = hg.Vd("\u0012~", (short) (OY.Xd() ^ ((2088024628 ^ 1507701676) ^ 631853041)), (short) (OY.Xd() ^ (1538967401 ^ 1538957540)));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("P=\u0003@$", (short) (C1633zX.Xd() ^ ((1613112418 ^ 1809285983) ^ (-200397940))));
                String strYd = C1561oA.yd("2\u001e", (short) (ZN.Xd() ^ (1443648584 ^ 1443657671)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("3\"i)\u000f", (short) (Od.Xd() ^ (1906485907 ^ (-1906498009))));
                    short sXd3 = (short) (FB.Xd() ^ ((811548461 ^ 2128466593) ^ 1317179108));
                    short sXd4 = (short) (FB.Xd() ^ ((1732231696 ^ 291628917) ^ 1985900947));
                    int[] iArr2 = new int["&\u001c".length()];
                    QB qb2 = new QB("&\u001c");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) + sXd4);
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("Z2c\u001bg", (short) (C1607wl.Xd() ^ (1331979486 ^ 1331959706)), (short) (C1607wl.Xd() ^ (1517162898 ^ 1517163916)))).getDeclaredMethod(ZO.xd("\u0015\t", (short) (C1607wl.Xd() ^ ((1659059128 ^ 284370861) ^ 1913678114)), (short) (C1607wl.Xd() ^ ((339990530 ^ 1209976320) ^ 1549625008))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("uX?G*`", (short) (Od.Xd() ^ (1728612749 ^ (-1728621387))), (short) (Od.Xd() ^ (337694173 ^ (-337687233))));
                                Class<?> cls4 = Class.forName(Ig.wd("\u0010Q3'\u0001Nc4\u001aJKo\u0011 F*e\u0018Oy+jx", (short) (Od.Xd() ^ (1139899376 ^ (-1139870244)))));
                                Class<?>[] clsArr = {Class.forName(EO.Od(" GL\u00164?Vm%^\u007f\u0001) /\r", (short) (C1580rY.Xd() ^ (1635409520 ^ (-1635399115)))))};
                                Object[] objArr2 = {strUd2};
                                short sXd5 = (short) (C1633zX.Xd() ^ (676078306 ^ (-676098735)));
                                int[] iArr3 = new int["B?M+PII9@%6BE701".length()];
                                QB qb3 = new QB("B?M+PII9@%6BE701");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(sXd5 + sXd5 + sXd5 + i4 + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                Method method = cls4.getMethod(new String(iArr3, 0, i4), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("\u0003q9x^", (short) (FB.Xd() ^ ((2091076819 ^ 422239282) ^ 1703534367)), (short) (FB.Xd() ^ (68665730 ^ 68659904)));
                                    short sXd6 = (short) (Od.Xd() ^ ((978501881 ^ 1271517739) ^ (-1905987007)));
                                    int[] iArr4 = new int["\r\u0001".length()];
                                    QB qb4 = new QB("\r\u0001");
                                    int i5 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i5] = xuXd4.fK(sXd6 + sXd6 + i5 + xuXd4.CK(iKK4));
                                        i5++;
                                    }
                                    String str3 = new String(iArr4, 0, i5);
                                    try {
                                        Class<?> cls5 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls5.getField(str3) : cls5.getDeclaredField(str3);
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
                    String strKd = C1561oA.Kd("9(o/\u0015", (short) (OY.Xd() ^ (1018449459 ^ 1018451168)));
                    String strZd2 = Wg.Zd("\u0006,", (short) (C1607wl.Xd() ^ ((1135857199 ^ 1497298842) ^ 445463634)), (short) (C1607wl.Xd() ^ (1444558942 ^ 1444562808)));
                    try {
                        Class<?> cls6 = Class.forName(strKd);
                        Field field5 = 0 != 0 ? cls6.getField(strZd2) : cls6.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("9(o/\u0015", (short) (C1580rY.Xd() ^ ((270189880 ^ 1152349765) ^ (-1421203678))));
                        String strVd2 = Wg.vd("zn", (short) (FB.Xd() ^ (1812858482 ^ 1812869507)));
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
                        int i6 = 1129244727 ^ 1129244796;
                        if (x2 > i6 && x2 < displayMetrics.widthPixels - i6 && y2 > i6 && y2 < displayMetrics.heightPixels - i6) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public enum SelfieScanModeExtended {
        ENROLL(SelfieScan.Mode.ENROLL),
        LOGIN(SelfieScan.Mode.LOGIN),
        MASK_CHECK(SelfieScan.Mode.MASK_CHECK),
        FACE_AUTHENTICATION(null);


        /* JADX INFO: renamed from: f */
        private static int f12029f = 1;

        /* JADX INFO: renamed from: g */
        private static int f12030g = 0;

        /* JADX INFO: renamed from: i */
        private static int f12032i = 0;

        /* JADX INFO: renamed from: j */
        private static int f12033j = 1;

        /* JADX INFO: renamed from: a */
        private final SelfieScan.Mode f12034a;

        public static SelfieScanModeExtended valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f12029f + 71;
            f12032i = i3 % 128;
            int i4 = i3 % 2;
            SelfieScanModeExtended selfieScanModeExtended = (SelfieScanModeExtended) Enum.valueOf(SelfieScanModeExtended.class, str);
            if (i4 != 0) {
                int i5 = 81 / 0;
            }
            int i6 = f12029f + 63;
            f12032i = i6 % 128;
            int i7 = i6 % 2;
            return selfieScanModeExtended;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static SelfieScanModeExtended[] valuesCustom() {
            int i2 = 2 % 2;
            int i3 = f12029f + 109;
            f12032i = i3 % 128;
            int i4 = i3 % 2;
            SelfieScanModeExtended[] selfieScanModeExtendedArr = (SelfieScanModeExtended[]) values().clone();
            int i5 = f12029f + 115;
            f12032i = i5 % 128;
            int i6 = i5 % 2;
            return selfieScanModeExtendedArr;
        }

        static {
            Object obj = null;
            int i2 = f12033j + 87;
            f12030g = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        SelfieScanModeExtended(SelfieScan.Mode mode) {
            this.f12034a = mode;
        }

        public final SelfieScan.Mode getMode() {
            int i2 = 2 % 2;
            int i3 = f12032i + 7;
            int i4 = i3 % 128;
            f12029f = i4;
            int i5 = i3 % 2;
            SelfieScan.Mode mode = this.f12034a;
            int i6 = i4 + 77;
            f12032i = i6 % 128;
            if (i6 % 2 == 0) {
                return mode;
            }
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public BaseActivity.Config getConfig() {
        int i2 = 2 % 2;
        BaseActivity.Config config = super.getConfig();
        BaseActivity.Config config2 = new BaseActivity.Config(true, config.getSetDefaultContentView(), config.getSendScreenEvents(), config.getEnableCloseButtonHandling(), config.getEmptyResultIfUserCancels());
        int i3 = f11983w + 75;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        return config2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public int getCameraFacing() {
        int i2 = 2 % 2;
        int i3 = f11983w + 117;
        f11982u = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f12000r;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraXActivity
    public void setContentView() {
        int i2 = 2 % 2;
        int i3 = f11983w + 23;
        f11982u = i3 % 128;
        if (i3 % 2 != 0) {
            IdCaptureVersionGate.useV2();
            throw null;
        }
        if (IdCaptureVersionGate.useV2()) {
            this.f11985c = new a(z.e(getLayoutInflater()));
        } else {
            this.f11985c = new a(ad.c(getLayoutInflater()));
            int i4 = f11983w + 85;
            f11982u = i4 % 128;
            int i5 = i4 % 2;
        }
        setContentView(this.f11985c.b());
    }

    public /* synthetic */ void d(Object obj) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11983w + 115;
        f11982u = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11988f.takePicture();
            throw null;
        }
        this.f11988f.takePicture();
        int i4 = f11982u + 121;
        f11983w = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void d(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11982u + 109;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th, "Take camera picture failed", new Object[0]);
        int i5 = f11983w + 115;
        f11982u = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ void j(View view) {
        int i2 = 2 % 2;
        int i3 = f11983w + 73;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        b();
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        Intent intent = getIntent();
        IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent = IncodeWelcome.getInstance().getIncodeWelcomeRepositoryComponent();
        this.f11988f = new SelfiePresenter(incodeWelcomeRepositoryComponent.getIncodeRepository(), incodeWelcomeRepositoryComponent.getFaceDetector(), incodeWelcomeRepositoryComponent.getRecogManager(), this);
        Serializable serializableExtra = intent.getSerializableExtra("extraMode");
        if (serializableExtra instanceof SelfieScanModeExtended) {
            this.f11984b = (SelfieScanModeExtended) serializableExtra;
        } else if (serializableExtra instanceof SelfieScan.Mode) {
            int i3 = f11982u + 3;
            f11983w = i3 % 128;
            int i4 = i3 % 2;
            this.f11984b = fromSelfieScanMode((SelfieScan.Mode) serializableExtra);
        } else {
            Timber.w("Invalid mode type received: %s", serializableExtra);
            this.f11984b = SelfieScanModeExtended.ENROLL;
        }
        this.f11988f.setMode(this.f11984b);
        this.f11988f.setFaceRecognitionMode((SelfieScan.FaceRecognitionMode) intent.getSerializableExtra("extraFaceRecognitionMode"));
        this.f11988f.setLivenessDetectionMode((SelfieScan.LivenessDetectionMode) intent.getSerializableExtra("extraLivenessDetectionMode"));
        this.f11988f.setFaceAuthMode((SelfieScan.FaceAuthMode) intent.getSerializableExtra("extraFaceAuthMode"));
        this.f11988f.setCustomerUUID(intent.getStringExtra("extraCustomerUUID"));
        this.f11988f.setClosedEyesCheckEnabled(intent.getBooleanExtra("extraClosedEyesCheckEnabled", true));
        this.f11988f.setHeadCoverCheckEnabled(intent.getBooleanExtra("extraHeadCoverCheckEnabled", false));
        this.f11988f.setLensesCheckEnabled(intent.getBooleanExtra("extraLensesCheckEnabled", true));
        this.f11988f.setMaskCheckEnabled(intent.getBooleanExtra("extraMaskCheckEnabled", false));
        this.f11988f.setAllowFaceAuthModeFallback(intent.getBooleanExtra("extraAllowFaceAuthModeFallback", false));
        this.f11988f.setAutoCaptureTimeout(intent.getIntExtra("extraAutoCaptureTimeout", 25));
        this.f11988f.setCaptureAttempts(intent.getIntExtra("extraCaptureAttempts", 3));
        this.f11988f.setAgeAssuranceUXEnabled(intent.getBooleanExtra("extraAgeAssuranceUXEnabled", false));
        this.f11988f.setStreamFramesToken(intent.getStringExtra("extraStreamFramesToken"));
        this.f12000r = intent.getIntExtra("extraCameraFacing", CameraFacing.FRONT.getCameraFacing());
        setStreamFramesEnabled(intent.getBooleanExtra("extraStreamFramesEnabled", false));
        setStreamAudioEnabled(intent.getBooleanExtra("extraStreamAudioEnabled", false));
        setVideoLivenessRecordingEnabledClientSide(intent.getBooleanExtra("extraVideoLivenessRecordingEnabled", false));
        this.f11988f.setStoreLocalAuthenticationEnabled(intent.getBooleanExtra("extraStoreAuthenticationEnabled", false));
        super.safeOnCreate(bundle, this.f11988f);
        this.f11997o = (Vibrator) getSystemService("vibrator");
        aj.a(this.f11985c.f12072b);
        d();
        this.f11995m = new CompositeDisposable();
        this.f11996n = new CompositeDisposable();
        this.f11993k = new CompositeDisposable();
        this.f11995m.add(this.f11987e.throttleFirst(2L, TimeUnit.SECONDS).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda29
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.d(obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda30
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                SelfieActivity.d((Throwable) obj);
            }
        }));
        HashMap map = new HashMap();
        map.put(EventValues.SCREEN_NAME.getValue(), getScreenName().name());
        EventUtils.sendEvent(getRepo(), Event.START_SELFIE, getModule(), (HashMap<String, Object>) map);
        this.f11988f.setIntent(intent);
        this.f11988f.prepare();
        stopFaceDetection();
        onDetectionResult(FaceProcessingUtils.FaceProcessingState.NO_FACE);
        c();
        this.f11985c.f12071a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelfieActivity.m8342instrumented$2$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        Object obj = null;
        if (isVideoStreamingAllowed()) {
            int i5 = f11982u + 89;
            f11983w = i5 % 128;
            if (i5 % 2 == 0) {
                ProgressBar progressBar = this.f11985c.f12075e;
                obj.hashCode();
                throw null;
            }
            if (this.f11985c.f12075e != null) {
                this.f11985c.f12075e.setVisibility(0);
            }
        }
        int i6 = f11982u + 97;
        f11983w = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private void d() {
        int i2 = 2 % 2;
        int intExtra = getIntent().getIntExtra("extraLogoResId", 0);
        boolean z2 = e(this.f11985c.f12086p.getDrawable()) || intExtra != 0;
        if (!(!IdCaptureVersionGate.useV2())) {
            d(GovernmentValidationActivity.Companion.c(), -1057157019, GovernmentValidationActivity.Companion.c(), GovernmentValidationActivity.Companion.c(), new Object[]{this.f11985c.B, Boolean.valueOf(this.f10724a.getInternalConfig().getUxConfig().getShowFooter())}, GovernmentValidationActivity.Companion.c(), 1057157025);
            if (z2) {
                int i3 = f11982u + 47;
                f11983w = i3 % 128;
                int i4 = i3 % 2;
                if (intExtra != 0) {
                    this.f11985c.f12090t.setVisibility(8);
                    Drawable drawable = ResourcesCompat.getDrawable(getResources(), intExtra, getTheme());
                    this.f11985c.f12086p.setImageDrawable(drawable);
                    this.f11985c.f12093w.setImageDrawable(drawable);
                    int i5 = f11982u + 29;
                    f11983w = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        } else {
            boolean zE = e(this.f11985c.f12090t.getDrawable());
            if (z2) {
                this.f11985c.f12090t.setVisibility(8);
                if (intExtra != 0) {
                    int i7 = f11982u + 73;
                    f11983w = i7 % 128;
                    int i8 = i7 % 2;
                    this.f11985c.f12086p.setImageDrawable(ResourcesCompat.getDrawable(getResources(), intExtra, getTheme()));
                }
            } else if (zE) {
                this.f11985c.f12086p.setVisibility(8);
            } else {
                this.f11985c.f12090t.setVisibility(8);
                this.f11985c.f12086p.setVisibility(8);
            }
        }
        if (StringUtils.isBlank(this.f11985c.f12091u.getText())) {
            int i9 = f11983w + 47;
            f11982u = i9 % 128;
            if (i9 % 2 != 0) {
                this.f11985c.f12091u.setVisibility(78);
            } else {
                this.f11985c.f12091u.setVisibility(8);
            }
        }
    }

    private boolean e(Drawable drawable) {
        int i2 = 2 % 2;
        int iConvertPxToDp = (int) LayoutUtils.convertPxToDp(this, drawable.getMinimumWidth());
        int iConvertPxToDp2 = (int) LayoutUtils.convertPxToDp(this, drawable.getMinimumHeight());
        if (iConvertPxToDp <= 1 || iConvertPxToDp2 <= 1) {
            int i3 = f11982u + 45;
            f11983w = i3 % 128;
            if (i3 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = f11983w + 109;
        int i5 = i4 % 128;
        f11982u = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 1;
        f11983w = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 18 / 0;
        }
        return true;
    }

    public /* synthetic */ Unit K() {
        int i2 = 2 % 2;
        int i3 = f11983w + 73;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        this.f11988f.retryProcessingBitmap(true);
        Unit unit = Unit.INSTANCE;
        int i5 = f11983w + 37;
        f11982u = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return unit;
    }

    private void c() {
        int i2 = 2 % 2;
        int i3 = f11983w + 97;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        setNoNetworkSnackbarRetryAction(new Function0() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.K();
            }
        });
        int i5 = f11983w + 67;
        f11982u = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        SelfieActivity selfieActivity = (SelfieActivity) objArr[0];
        SelfieScanResult selfieScanResult = (SelfieScanResult) objArr[1];
        Object obj = objArr[2];
        int i2 = 2 % 2;
        int i3 = f11982u + 21;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        selfieActivity.e(selfieScanResult);
        if (i4 == 0) {
            int i5 = 84 / 0;
        }
        int i6 = f11983w + 19;
        f11982u = i6 % 128;
        Object obj2 = null;
        if (i6 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraXActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int i2 = 2 % 2;
        int i3 = f11983w + 115;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        super.onStart();
        final SelfieScanResult selfieScanResult = this.f11994l;
        if (selfieScanResult != null) {
            setShutterButtonVisible(false);
            this.f11995m.add(Observable.just(new Object()).subscribeOn(Schedulers.io()).delay(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda13
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.e(selfieScanResult, obj);
                }
            }, new SelfieActivity$$ExternalSyntheticLambda22()));
        } else if (!this.f11998p) {
            a(true);
            int i5 = f11982u + 1;
            f11983w = i5 % 128;
            int i6 = i5 % 2;
        } else {
            a(false);
            this.f11988f.retryProcessingBitmap(true);
        }
        if (!(!LayoutUtils.isRunningOnTablet(this))) {
            return;
        }
        int iC = GovernmentValidationActivity.Companion.c();
        d(GovernmentValidationActivity.Companion.c(), 1808051639, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, GovernmentValidationActivity.Companion.c(), -1808051632);
    }

    public SelfieScanModeExtended fromSelfieScanMode(SelfieScan.Mode mode) {
        int i2 = 2 % 2;
        int i3 = f11982u + 79;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        for (SelfieScanModeExtended selfieScanModeExtended : SelfieScanModeExtended.valuesCustom()) {
            if (mode.equals(selfieScanModeExtended.getMode())) {
                int i5 = f11982u + 43;
                f11983w = i5 % 128;
                int i6 = i5 % 2;
                return selfieScanModeExtended;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$2 */
    final class AnonymousClass2 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        private static int f12007a = 0;

        /* JADX INFO: renamed from: c */
        private static int f12008c = 1;

        AnonymousClass2() {
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[PHI: r3
  0x003e: PHI (r3v7 float) = (r3v1 float), (r3v9 float) binds: [B:31:0x010d, B:22:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0111 A[PHI: r3
  0x0111: PHI (r3v2 float) = (r3v1 float), (r3v7 float), (r3v7 float), (r3v9 float) binds: [B:31:0x010d, B:24:0x0048, B:26:0x0050, B:22:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onGlobalLayout() {
            /*
                Method dump skipped, instruction units count: 291
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.AnonymousClass2.onGlobalLayout():void");
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        SelfieActivity selfieActivity = (SelfieActivity) objArr[0];
        int i2 = 2 % 2;
        selfieActivity.f11985c.b().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.2

            /* JADX INFO: renamed from: a */
            private static int f12007a = 0;

            /* JADX INFO: renamed from: c */
            private static int f12008c = 1;

            AnonymousClass2() {
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[PHI: r3
  0x003e: PHI (r3v7 float) = (r3v1 float), (r3v9 float) binds: [B:31:0x010d, B:22:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0111 A[PHI: r3
  0x0111: PHI (r3v2 float) = (r3v1 float), (r3v7 float), (r3v7 float), (r3v9 float) binds: [B:31:0x010d, B:24:0x0048, B:26:0x0050, B:22:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onGlobalLayout() {
                /*
                    Method dump skipped, instruction units count: 291
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.AnonymousClass2.onGlobalLayout():void");
            }
        });
        int i3 = f11983w + 41;
        f11982u = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static void c(int i2, View view, int i3) {
        ViewGroup.LayoutParams layoutParams;
        int i4;
        int i5 = 2 % 2;
        int i6 = f11983w + 95;
        f11982u = i6 % 128;
        if (i6 % 2 != 0) {
            layoutParams = view.getLayoutParams();
            layoutParams.width = i2 + i3;
            i4 = i2 * i3;
        } else {
            layoutParams = view.getLayoutParams();
            i4 = i2 + i3;
            layoutParams.width = i4;
        }
        layoutParams.height = i4;
        view.setLayoutParams(layoutParams);
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        View view = (View) objArr[0];
        View view2 = (View) objArr[1];
        int i2 = 2 % 2;
        int i3 = f11982u + 101;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = iArr[1] + view.getHeight();
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        int i5 = iArr2[1] - height;
        int i6 = f11982u + 5;
        f11983w = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        throw null;
    }

    public /* synthetic */ void c(DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        if (this.f11984b != SelfieScanModeExtended.FACE_AUTHENTICATION) {
            z();
            return;
        }
        int i4 = f11982u + 3;
        f11983w = i4 % 128;
        if (i4 % 2 != 0) {
            C();
            int i5 = f11982u + 67;
            f11983w = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        C();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f11983w + 65;
        f11982u = i3 % 128;
        if (i3 % 2 != 0) {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    this.f$0.c(dialogInterface, i4);
                }
            });
            int i4 = 39 / 0;
        } else {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i42) {
                    this.f$0.c(dialogInterface, i42);
                }
            });
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraXActivity, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onPreviewLayoutChanged(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        super.onPreviewLayoutChanged(i2, i3, i4, i5);
        float width = (int) (i3 * (this.f11985c.f12085o.getWidth() / i2));
        setFacePositionConstraint(new FacePositionConstraint(0.2f, ((r5 - this.f11985c.f12085o.getHeight()) / 2) / width, 0.8f, ((this.f11985c.f12085o.getHeight() + r5) / 2) / width));
        int i7 = f11982u + 37;
        f11983w = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setFacePositionConstraint(FacePositionConstraint facePositionConstraint) {
        int i2 = 2 % 2;
        int i3 = f11982u + 3;
        f11983w = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11988f.setFacePositionConstraint(facePositionConstraint);
        } else {
            this.f11988f.setFacePositionConstraint(facePositionConstraint);
            throw null;
        }
    }

    private void a(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f11983w + 79;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        this.f11985c.f12084n.setVisibility(0);
        if (z2) {
            int i5 = f11982u + 41;
            f11983w = i5 % 128;
            int i6 = i5 % 2;
            getPreviewContainer().setVisibility(0);
        }
        this.f11985c.f12078h.setVisibility(0);
        this.f11985c.f12073c.setVisibility(0);
        this.f11985c.f12074d.setVisibility(4);
        this.f11985c.f12076f.setVisibility(4);
        this.f11985c.f12077g.setVisibility(4);
        Object[] objArr = {this.f11985c.f12080j};
        int iC = GovernmentValidationActivity.Companion.c();
        d(GovernmentValidationActivity.Companion.c(), 2134572886, iC, GovernmentValidationActivity.Companion.c(), objArr, GovernmentValidationActivity.Companion.c(), -2134572872);
        this.f11985c.f12094x.setText(n());
        x();
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraXActivity
    public CameraPreviewType getCameraType() {
        int i2 = 2 % 2;
        int i3 = f11983w + 59;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        CameraPreviewType cameraPreviewType = CameraPreviewType.FIXED_WIDTH;
        int i5 = f11982u + 125;
        f11983w = i5 % 128;
        if (i5 % 2 != 0) {
            return cameraPreviewType;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f11983w + 41;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        ScreenName screenName = ScreenName.SELFIE_CAMERA_CAPTURE;
        int i5 = f11983w + 41;
        f11982u = i5 % 128;
        if (i5 % 2 == 0) {
            return screenName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f11982u + 13;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        if (this.f11984b == SelfieScanModeExtended.FACE_AUTHENTICATION) {
            return Modules.AUTHENTICATION;
        }
        if (this.f11984b == SelfieScanModeExtended.LOGIN) {
            int i5 = f11982u + 39;
            f11983w = i5 % 128;
            if (i5 % 2 != 0) {
                return Modules.LOGIN;
            }
            Modules modules = Modules.LOGIN;
            throw null;
        }
        return Modules.SELFIE;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public boolean isDelayedOnboardingSupported() {
        int i2 = 2 % 2;
        int i3 = f11983w + 47;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void showInfo(int i2) {
        int i3 = 2 % 2;
        int i4 = f11982u + 69;
        f11983w = i4 % 128;
        int i5 = i4 % 2;
        if (this.f11985c.I == null) {
            this.f11985c.f12072b.setText(i2);
            this.f11985c.f12072b.setVisibility(0);
            int i6 = f11982u + 35;
            f11983w = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 27 / 0;
                return;
            }
            return;
        }
        this.f11985c.I.setText(i2);
        this.f11985c.I.setVisibility(0);
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void enteredManualCaptureMode() {
        int i2 = 2 % 2;
        int i3 = f11982u + 41;
        f11983w = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.d("enteredManualCaptureMode called", new Object[0]);
            g();
            y();
            x();
            o();
            Object[] objArr = {this.f11985c.f12080j};
            int iC = GovernmentValidationActivity.Companion.c();
            d(GovernmentValidationActivity.Companion.c(), 2134572886, iC, GovernmentValidationActivity.Companion.c(), objArr, GovernmentValidationActivity.Companion.c(), -2134572872);
            int iC2 = GovernmentValidationActivity.Companion.c();
            int iC3 = GovernmentValidationActivity.Companion.c();
            int iC4 = GovernmentValidationActivity.Companion.c();
            d(iC3, 127570874, iC2, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC4, -127570859);
        } else {
            Timber.d("enteredManualCaptureMode called", new Object[0]);
            g();
            y();
            x();
            o();
            Object[] objArr2 = {this.f11985c.f12080j};
            int iC5 = GovernmentValidationActivity.Companion.c();
            d(GovernmentValidationActivity.Companion.c(), 2134572886, iC5, GovernmentValidationActivity.Companion.c(), objArr2, GovernmentValidationActivity.Companion.c(), -2134572872);
            int iC6 = GovernmentValidationActivity.Companion.c();
            int iC7 = GovernmentValidationActivity.Companion.c();
            int iC8 = GovernmentValidationActivity.Companion.c();
            d(iC7, 127570874, iC6, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC8, -127570859);
        }
        w();
        int i4 = f11983w + 29;
        f11982u = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$1 */
    final class AnonymousClass1 implements Animation.AnimationListener {

        /* JADX INFO: renamed from: d */
        private static int f12003d = 0;

        /* JADX INFO: renamed from: e */
        private static int f12004e = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Animation f12005a;

        AnonymousClass1(Animation animation) {
            animation = animation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            int i2 = 2 % 2;
            int i3 = f12003d + 121;
            f12004e = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            int i2 = 2 % 2;
            int i3 = f12004e + 7;
            f12003d = i3 % 128;
            int i4 = i3 % 2;
            SelfieActivity.this.f11985c.D.startAnimation(animation);
            SelfieActivity.this.f11985c.D.setVisibility(0);
            int i5 = f12003d + 61;
            f12004e = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            int i2 = 2 % 2;
            int i3 = f12003d + 105;
            f12004e = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void setShutterButtonVisible(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f11982u + 105;
        f11983w = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ViewKt.setVisible(this.f11985c.f12071a, z2);
            ViewKt.setVisible(this.f11985c.D, z2);
            int i4 = f11983w + 63;
            f11982u = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        ViewKt.setVisible(this.f11985c.f12071a, z2);
        ViewKt.setVisible(this.f11985c.D, z2);
        throw null;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        SelfieActivity selfieActivity = (SelfieActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = f11982u + 81;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        selfieActivity.f11985c.f12071a.setEnabled(zBooleanValue);
        int i5 = f11983w + 81;
        f11982u = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return null;
    }

    private void b() {
        int i2 = 2 % 2;
        ViewExtensionsKt.preventDoubleClick(this.f11985c.f12071a);
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, 1620470242, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC3, -1620470230);
        showDetectingAnimation();
        this.f11987e.onNext(new Object());
        int i3 = f11983w + 65;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$4 */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a */
        private static int f12016a = 0;

        /* JADX INFO: renamed from: b */
        private static int f12017b = 1;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f12018d;

        static {
            int[] iArr = new int[FaceProcessingUtils.FaceProcessingState.values().length];
            f12018d = iArr;
            try {
                iArr[FaceProcessingUtils.FaceProcessingState.FACE_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.FACE_TILTED_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.FACE_TILTED_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.FACE_ROTATED_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.FACE_ROTATED_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.INSUFFICIENT_FACE_SIZE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.FACE_TOO_CLOSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.BLURRED_CROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.FACE_NOT_IN_CONSTRAINT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.LENSES_DETECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.FACE_MASK_DETECTED.ordinal()] = 11;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.EYES_CLOSED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.HEAD_COVERED.ordinal()] = 13;
                int i3 = f12016a + 57;
                f12017b = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.MULTIPLE_FACES_DETECTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.NO_FACE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.NO_LANDMARKS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.FACE_PROCESSING_STARTED.ordinal()] = 17;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.NOT_READY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.GET_READY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.LOW_IMAGE_QUALITY.ordinal()] = 20;
                int i7 = f12017b + 115;
                f12016a = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f12018d[FaceProcessingUtils.FaceProcessingState.LIGHT_TOO_DARK.ordinal()] = 21;
                int i9 = f12017b + 125;
                f12016a = i9 % 128;
                int i10 = i9 % 2;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onDetectionResult(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2;
        int i3 = 2 % 2;
        Timber.i("onDetectionResult: %s", faceProcessingState);
        this.f11991i = faceProcessingState;
        if (this.f12001s) {
            return;
        }
        switch (AnonymousClass4.f12018d[faceProcessingState.ordinal()]) {
            case 1:
                f();
                g();
                q();
                if (this.f11989g != FaceProcessingUtils.FaceProcessingState.FACE_DETECTED) {
                    x();
                    int iC = GovernmentValidationActivity.Companion.c();
                    int iC2 = GovernmentValidationActivity.Companion.c();
                    int iC3 = GovernmentValidationActivity.Companion.c();
                    d(iC2, 1620470242, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC3, -1620470230);
                    showDetectingAnimation();
                    p.c(this.f11997o, true);
                }
                break;
            case 2:
            case 3:
                g();
                q();
                a(R.string.onboard_sdk_feedback_face_tilted, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_face_tilted);
                i2 = f11983w + 73;
                f11982u = i2 % 128;
                int i4 = i2 % 2;
                break;
            case 4:
                g();
                q();
                a(R.string.onboard_sdk_feedback_face_rotated_left, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_face_rotated_left);
                break;
            case 5:
                g();
                q();
                a(R.string.onboard_sdk_feedback_face_rotated_right, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_face_rotated_right);
                break;
            case 6:
                h();
                g();
                q();
                a(R.string.onboard_sdk_feedback_face_too_far, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_face_too_far);
                break;
            case 7:
                h();
                g();
                q();
                a(R.string.onboard_sdk_feedback_face_too_close, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_face_too_close);
                break;
            case 8:
                if (this.f12002t) {
                    g();
                    q();
                    a(R.string.onboard_sdk_feedback_blurred_crop, false);
                    talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_blurred_crop);
                }
                break;
            case 9:
                h();
                g();
                q();
                a(R.string.onboard_sdk_feedback_align_face, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_align_face);
                break;
            case 10:
                g();
                q();
                a(R.string.onboard_sdk_feedback_remove_lenses, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_remove_lenses);
                break;
            case 11:
                g();
                q();
                a(R.string.onboard_sdk_feedback_face_mask_detected, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_face_mask_detected);
                break;
            case 12:
                g();
                q();
                a(R.string.onboard_sdk_feedback_open_eyes, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_open_eyes);
                break;
            case 13:
                g();
                q();
                a(R.string.onboard_sdk_feedback_remove_head_cover, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_remove_head_cover);
                break;
            case 14:
                g();
                q();
                a(R.string.onboard_sdk_feedback_multiple_faces_detected, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_multiple_faces_detected);
                break;
            case 15:
                if (this.f11989g != FaceProcessingUtils.FaceProcessingState.NO_FACE) {
                    g();
                    o();
                    this.f11985c.f12073c.setVisibility(0);
                    this.f11985c.f12074d.setVisibility(4);
                    q();
                    int iC4 = GovernmentValidationActivity.Companion.c();
                    int iC5 = GovernmentValidationActivity.Companion.c();
                    int iC6 = GovernmentValidationActivity.Companion.c();
                    d(iC5, -1972117918, iC4, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC6, 1972117927);
                }
                break;
            case 16:
                g();
                q();
                a(R.string.onboard_sdk_feedback_align_face, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_align_face);
                break;
            case 17:
                EventUtils.sendEvent(getRepo(), Event.SELFIE_UPLOAD_PROGRESS, getModule(), getScreenName());
                f();
                runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda33
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.k();
                    }
                });
                i2 = f11982u + 81;
                f11983w = i2 % 128;
                int i42 = i2 % 2;
                break;
            case 19:
                q();
                a(R.string.onboard_sdk_face_scan_get_ready, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_face_scan_get_ready);
                p.c(this.f11997o, true);
                showRotatingAnimation(this.f11985c.f12080j, R.drawable.onboard_sdk_get_ready_borders);
                break;
            case 20:
                g();
                q();
                a(R.string.onboard_sdk_face_scan_low_image_quality, false);
                talkBackAccessibilityText(R.string.onboard_sdk_voice_over_face_scan_low_image_quality);
                break;
            case 21:
                if (this.f12002t) {
                    g();
                    q();
                    a(R.string.onboard_sdk_face_scan_warn_selfie_too_dark, false);
                    talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_too_dark);
                }
                break;
        }
        this.f11989g = faceProcessingState;
    }

    public /* synthetic */ void c(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11982u + 43;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        j();
        int i5 = f11983w + 19;
        f11982u = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11983w
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11982u = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L48
            io.reactivex.disposables.CompositeDisposable r0 = r5.f11993k
            int r1 = r0.size()
            r0 = 77
            int r0 = r0 / 0
            if (r1 != 0) goto L38
        L1a:
            io.reactivex.disposables.CompositeDisposable r3 = r5.f11993k
            r1 = 5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.Single r1 = io.reactivex.Single.timer(r1, r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Single r1 = r1.observeOn(r0)
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda32 r0 = new com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda32
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r1.subscribe(r0)
            r3.add(r0)
        L38:
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11982u
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11983w = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L47
            r0 = 30
            int r0 = r0 / 0
        L47:
            return
        L48:
            io.reactivex.disposables.CompositeDisposable r0 = r5.f11993k
            int r0 = r0.size()
            if (r0 != 0) goto L38
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.h():void");
    }

    private void f() {
        int i2 = 2 % 2;
        int i3 = f11983w + 101;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        this.f11993k.clear();
        int i5 = f11983w + 47;
        f11982u = i5 % 128;
        int i6 = i5 % 2;
    }

    private void j() {
        ObjectAnimator objectAnimatorOfFloat;
        int i2 = 2 % 2;
        int i3 = f11983w + 83;
        f11982u = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11985c.f12079i.setAlpha(1.0f);
            this.f11985c.f12079i.setVisibility(0);
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f11985c.f12079i, "alpha", 0.0f, 1.0f);
        } else {
            this.f11985c.f12079i.setAlpha(0.0f);
            this.f11985c.f12079i.setVisibility(0);
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f11985c.f12079i, "alpha", 0.0f, 1.0f);
        }
        objectAnimatorOfFloat.setDuration(500L).start();
        int i4 = f11982u + 67;
        f11983w = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        SelfieActivity selfieActivity = (SelfieActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = f11982u + 53;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        selfieActivity.f11985c.f12079i.setVisibility(4);
        int i5 = f11982u + 113;
        f11983w = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void g() {
        int i2 = 2 % 2;
        int i3 = f11983w + 75;
        f11982u = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.f11985c.f12080j};
            int iC = GovernmentValidationActivity.Companion.c();
            d(GovernmentValidationActivity.Companion.c(), 2134572886, iC, GovernmentValidationActivity.Companion.c(), objArr, GovernmentValidationActivity.Companion.c(), -2134572872);
            this.f11985c.f12073c.setVisibility(0);
            this.f11985c.f12074d.setVisibility(2);
        } else {
            Object[] objArr2 = {this.f11985c.f12080j};
            int iC2 = GovernmentValidationActivity.Companion.c();
            d(GovernmentValidationActivity.Companion.c(), 2134572886, iC2, GovernmentValidationActivity.Companion.c(), objArr2, GovernmentValidationActivity.Companion.c(), -2134572872);
            this.f11985c.f12073c.setVisibility(0);
            this.f11985c.f12074d.setVisibility(4);
        }
        x();
    }

    protected void showDetectingAnimation() {
        int i2 = 2 % 2;
        int i3 = f11983w + 81;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        Timber.i("showDetectionInProgress called", new Object[0]);
        showRotatingAnimation(this.f11985c.f12080j, R.drawable.onboard_sdk_capture_borders);
        int i5 = f11983w + 103;
        f11982u = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void o() {
        int i2 = 2 % 2;
        int i3 = f11983w + 5;
        f11982u = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.i("hideDetectionInProgress called", new Object[0]);
            Object[] objArr = {this.f11985c.f12080j};
            int iC = GovernmentValidationActivity.Companion.c();
            d(GovernmentValidationActivity.Companion.c(), 2134572886, iC, GovernmentValidationActivity.Companion.c(), objArr, GovernmentValidationActivity.Companion.c(), -2134572872);
            return;
        }
        Timber.i("hideDetectionInProgress called", new Object[0]);
        Object[] objArr2 = {this.f11985c.f12080j};
        int iC2 = GovernmentValidationActivity.Companion.c();
        d(GovernmentValidationActivity.Companion.c(), 2134572886, iC2, GovernmentValidationActivity.Companion.c(), objArr2, GovernmentValidationActivity.Companion.c(), -2134572872);
    }

    protected void showRotatingAnimation(View view, int i2) {
        int i3 = 2 % 2;
        Timber.i("showRotatingAnimation called", new Object[0]);
        this.f11985c.f12073c.setVisibility(8);
        ((ImageView) view).setImageResource(i2);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.onboard_sdk_rotate);
        animationLoadAnimation.setFillAfter(true);
        animationLoadAnimation.setInterpolator(new LinearInterpolator());
        view.startAnimation(animationLoadAnimation);
        view.setVisibility(0);
        this.f11985c.f12074d.setVisibility(0);
        int i4 = f11982u + 5;
        f11983w = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
    }

    public void k() {
        int i2 = 2 % 2;
        int i3 = f11982u + 117;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        this.f11998p = true;
        Timber.i("showCameraLid called", new Object[0]);
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, 622576592, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this, false}, iC3, -622576584);
        this.f11985c.f12078h.setVisibility(4);
        int iC4 = GovernmentValidationActivity.Companion.c();
        int iC5 = GovernmentValidationActivity.Companion.c();
        int iC6 = GovernmentValidationActivity.Companion.c();
        d(iC5, -796907118, iC4, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC6, 796907128);
        int i5 = f11982u + 37;
        f11983w = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private int n() {
        int i2 = 2 % 2;
        int i3 = f11982u + 35;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        int processingText = this.f11988f.getProcessingText();
        int i5 = f11982u + 49;
        f11983w = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return processingText;
    }

    private void m() {
        int i2 = 2 % 2;
        int i3 = f11983w + 59;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        Timber.i("hideCameraLid called", new Object[0]);
        this.f11998p = false;
        t();
        this.f11985c.f12094x.setText("");
        int i5 = f11983w + 21;
        f11982u = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ void L() {
        int i2 = 2 % 2;
        int i3 = f11982u + 75;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        this.f11985c.f12084n.setVisibility(4);
        this.f11985c.f12094x.setText(n());
        int i5 = f11983w + 29;
        f11982u = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void d(java.lang.Integer r5) throws java.lang.Exception {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11983w
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11982u = r0
            int r1 = r1 % r3
            int r1 = r5.intValue()
            r0 = -3
            r2 = 0
            if (r1 == r0) goto L33
            r0 = -1
            if (r1 == r0) goto L22
            if (r1 == r3) goto L22
            r0 = 4
            if (r1 == r0) goto L33
        L1c:
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter r0 = r4.f11988f
            r0.onIdealCaptureEnvironmentFound()
            return
        L22:
            java.lang.String r1 = "Not all tests for ideal device environment are supported!"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            timber.log.Timber.w(r1, r0)
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11982u
            int r1 = r0 + 97
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11983w = r0
            int r1 = r1 % r3
            goto L1c
        L33:
            java.lang.String r1 = "Ideal device environment test partially incomplete!"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            timber.log.Timber.w(r1, r0)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.d(java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r5.f11984b == com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.SelfieScanModeExtended.FACE_AUTHENTICATION) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r5.f11984b == com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.SelfieScanModeExtended.FACE_AUTHENTICATION) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        r5.f11988f.onIdealCaptureEnvironmentFound();
        r1 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11983w + 23;
        com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11982u = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object k(java.lang.Object[] r8) {
        /*
            r7 = 0
            r5 = r8[r7]
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity r5 = (com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity) r5
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11982u
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11983w = r0
            int r1 = r1 % r6
            android.view.ViewGroup r1 = r5.getPreviewContainer()
            r0 = 4
            r1.setVisibility(r0)
            com.incode.welcome_sdk.ui.camera.selfie.a r0 = r5.f11985c
            com.incode.welcome_sdk.views.IncodeTextView r3 = r0.f12094x
            int r2 = r5.n()
            int r1 = com.incode.welcome_sdk.R.color.onboard_sdk_TextColorDefault
            r0 = 1
            r5.e(r3, r2, r1, r0)
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$SelfieScanModeExtended r1 = r5.f11984b
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$SelfieScanModeExtended r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.SelfieScanModeExtended.ENROLL
            r4 = 0
            if (r1 == r0) goto L42
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11982u
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11983w = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L64
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$SelfieScanModeExtended r2 = r5.f11984b
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$SelfieScanModeExtended r1 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.SelfieScanModeExtended.FACE_AUTHENTICATION
            r0 = 85
            int r0 = r0 / r7
            if (r2 != r1) goto L6b
        L42:
            io.reactivex.disposables.CompositeDisposable r3 = r5.f11995m
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter r0 = r5.f11988f
            io.reactivex.Single r1 = r0.getIdealCaptureEnvironmentTestSingle()
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.io()
            io.reactivex.Single r2 = r1.subscribeOn(r0)
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda11 r1 = new com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda11
            r1.<init>()
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda22 r0 = new com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda22
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r2.subscribe(r1, r0)
            r3.add(r0)
            return r4
        L64:
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$SelfieScanModeExtended r1 = r5.f11984b
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$SelfieScanModeExtended r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.SelfieScanModeExtended.FACE_AUTHENTICATION
            if (r1 != r0) goto L6b
            goto L42
        L6b:
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter r0 = r5.f11988f
            r0.onIdealCaptureEnvironmentFound()
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11983w
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11982u = r0
            int r1 = r1 % r6
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.k(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        final SelfieActivity selfieActivity = (SelfieActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = f11983w + 31;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr2 = {selfieActivity, false, new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.L();
            }
        }, new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.F();
            }
        }};
        int iC = GovernmentValidationActivity.Companion.c();
        ((Animator) d(GovernmentValidationActivity.Companion.c(), 1896077995, iC, GovernmentValidationActivity.Companion.c(), objArr2, GovernmentValidationActivity.Companion.c(), -1896077984)).start();
        int i5 = f11982u + 39;
        f11983w = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public /* synthetic */ void H() {
        int i2 = 2 % 2;
        int i3 = f11983w + 59;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        getPreviewContainer().setVisibility(0);
        int i5 = f11983w + 77;
        f11982u = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        SelfieActivity selfieActivity = (SelfieActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = f11983w + 111;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        selfieActivity.f11985c.f12084n.setVisibility(0);
        selfieActivity.f11985c.f12078h.setVisibility(0);
        if (selfieActivity.v()) {
            int i5 = f11983w + 117;
            f11982u = i5 % 128;
            int i6 = i5 % 2;
            selfieActivity.startFaceDetection();
            Object[] objArr2 = {selfieActivity, true};
            int iC = GovernmentValidationActivity.Companion.c();
            d(GovernmentValidationActivity.Companion.c(), 622576592, iC, GovernmentValidationActivity.Companion.c(), objArr2, GovernmentValidationActivity.Companion.c(), -622576584);
        }
        int i7 = f11982u + 107;
        f11983w = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private void t() {
        int i2 = 2 % 2;
        int i3 = f11982u + 23;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this, true, new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.H();
            }
        }, new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.G();
            }
        }};
        int iC = GovernmentValidationActivity.Companion.c();
        ((Animator) d(GovernmentValidationActivity.Companion.c(), 1896077995, iC, GovernmentValidationActivity.Companion.c(), objArr, GovernmentValidationActivity.Companion.c(), -1896077984)).start();
        int i5 = f11982u + 53;
        f11983w = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$3 */
    final class AnonymousClass3 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: e */
        private static int f12010e = 0;

        /* JADX INFO: renamed from: j */
        private static int f12011j = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Runnable f12013b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Runnable f12014c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ int f12015d;

        AnonymousClass3(Runnable runnable, int i2, Runnable runnable2) {
            runnable = runnable;
            i = i2;
            runnable = runnable2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i2 = 2 % 2;
            int i3 = f12011j + 19;
            f12010e = i3 % 128;
            int i4 = i3 % 2;
            super.onAnimationStart(animator);
            runnable.run();
            int i5 = f12010e + 21;
            f12011j = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 52 / 0;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i2 = 2 % 2;
            int i3 = f12011j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f12010e = i3 % 128;
            int i4 = i3 % 2;
            super.onAnimationEnd(animator);
            SelfieActivity.this.f11985c.f12084n.setCircleRadius(i);
            runnable.run();
            int i5 = f12011j + 75;
            f12010e = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    private Animator e(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f11982u + 85;
        f11983w = i5 % 128;
        int i6 = i5 % 2;
        ImageView imageView = this.f11985c.f12085o;
        ViewGroup previewContainer = getPreviewContainer();
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(previewContainer, (imageView.getLeft() + (imageView.getWidth() / 2)) - previewContainer.getLeft(), (imageView.getTop() + (imageView.getHeight() / 2)) - previewContainer.getTop(), i2, i3);
        int i7 = f11982u + 15;
        f11983w = i7 % 128;
        int i8 = i7 % 2;
        return animatorCreateCircularReveal;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$5 */
    final class AnonymousClass5 implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        private static int f12019a = 0;

        /* JADX INFO: renamed from: j */
        private static int f12020j = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ int f12021b;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ TextView f12023d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ int f12024e;

        AnonymousClass5(TextView textView, int i2, int i3) {
            textView = textView;
            i = i2;
            i = i3;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            int i2 = 2 % 2;
            int i3 = f12020j + 91;
            f12019a = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            int i2 = 2 % 2;
            int i3 = f12020j + 85;
            f12019a = i3 % 128;
            if (i3 % 2 == 0) {
                SelfieActivity.this.d(textView, i, i);
                int i4 = f12020j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f12019a = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            SelfieActivity.this.d(textView, i, i);
            throw null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            int i2 = 2 % 2;
            int i3 = f12020j + 21;
            f12019a = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    private void b(TextView textView, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f11982u + 65;
        f11983w = i5 % 128;
        int i6 = i5 % 2;
        if (textView.getText() != null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
            animationLoadAnimation.setDuration(50L);
            animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.5

                /* JADX INFO: renamed from: a */
                private static int f12019a = 0;

                /* JADX INFO: renamed from: j */
                private static int f12020j = 1;

                /* JADX INFO: renamed from: b */
                private /* synthetic */ int f12021b;

                /* JADX INFO: renamed from: d */
                private /* synthetic */ TextView f12023d;

                /* JADX INFO: renamed from: e */
                private /* synthetic */ int f12024e;

                AnonymousClass5(TextView textView2, int i22, int i32) {
                    textView = textView2;
                    i = i22;
                    i = i32;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    int i22 = 2 % 2;
                    int i32 = f12020j + 91;
                    f12019a = i32 % 128;
                    int i42 = i32 % 2;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    int i22 = 2 % 2;
                    int i32 = f12020j + 85;
                    f12019a = i32 % 128;
                    if (i32 % 2 == 0) {
                        SelfieActivity.this.d(textView, i, i);
                        int i42 = f12020j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                        f12019a = i42 % 128;
                        int i52 = i42 % 2;
                        return;
                    }
                    SelfieActivity.this.d(textView, i, i);
                    throw null;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                    int i22 = 2 % 2;
                    int i32 = f12020j + 21;
                    f12019a = i32 % 128;
                    if (i32 % 2 != 0) {
                        throw null;
                    }
                }
            });
            textView2.clearAnimation();
            textView2.startAnimation(animationLoadAnimation);
            return;
        }
        d(textView2, i22, i32);
        int i7 = f11983w + 9;
        f11982u = i7 % 128;
        int i8 = i7 % 2;
    }

    void d(TextView textView, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f11983w + 71;
        f11982u = i5 % 128;
        int i6 = i5 % 2;
        e(textView, i2, i3, false);
        int i7 = f11983w + 43;
        f11982u = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void e(TextView textView, int i2, int i3, boolean z2) {
        int i4 = 2 % 2;
        int i5 = f11982u;
        int i6 = i5 + 41;
        f11983w = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        if (z2) {
            int i8 = i5 + 47;
            f11983w = i8 % 128;
            if (i8 % 2 != 0) {
                if (b((View) textView)) {
                    return;
                }
            } else {
                b((View) textView);
                obj.hashCode();
                throw null;
            }
        }
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, 25148005, iC, GovernmentValidationActivity.Companion.c(), new Object[]{textView}, iC3, -25147989);
        textView.setText(i2);
        textView.setTextColor(ResourcesCompat.getColor(getResources(), i3, null));
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        animationLoadAnimation.setDuration(50L);
        textView.clearAnimation();
        textView.startAnimation(animationLoadAnimation);
        talkBackAccessibilityText(i2);
    }

    private static boolean b(View view) {
        int i2 = 2 % 2;
        int i3 = f11982u + 105;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        Object tag = view.getTag();
        if (i4 == 0) {
            int i5 = 9 / 0;
            if (tag != null) {
                return true;
            }
        } else if (tag != null) {
            return true;
        }
        int i6 = f11983w + 23;
        f11982u = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    private static /* synthetic */ Object j(Object[] objArr) {
        int i2 = 2 % 2;
        ((View) objArr[0]).setTag(new Object());
        int i3 = f11982u + 105;
        f11983w = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
        return null;
    }

    private static void d(View view) {
        int i2 = 2 % 2;
        int i3 = f11982u + 41;
        f11983w = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            view.setTag(null);
            int i4 = f11982u + 43;
            f11983w = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        view.setTag(null);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void a(java.lang.Long r6) throws java.lang.Exception {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11983w
            int r3 = r0 + 49
            int r0 = r3 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11982u = r0
            int r3 = r3 % r4
            r0 = 0
            java.lang.String r2 = "timeout show instructions"
            r1 = 1
            if (r3 == 0) goto L30
            java.lang.Object[] r0 = new java.lang.Object[r0]
            timber.log.Timber.d(r2, r0)
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter r0 = r5.f11988f
            boolean r0 = r0.isAgeAssuranceUXEnabled()
            r0 = r0 ^ r1
            if (r0 == r1) goto L3d
        L21:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_feedback_position_your_face_for_age_estimation
        L23:
            r5.a(r0, r1)
            int r0 = com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11983w
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.f11982u = r0
            int r1 = r1 % r4
            return
        L30:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            timber.log.Timber.d(r2, r0)
            com.incode.welcome_sdk.ui.camera.selfie.SelfiePresenter r0 = r5.f11988f
            boolean r0 = r0.isAgeAssuranceUXEnabled()
            if (r0 != 0) goto L21
        L3d:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_feedback_position_your_face
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity.a(java.lang.Long):void");
    }

    public /* synthetic */ void b(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11982u + 21;
        f11983w = i3 % 128;
        this.f12001s = i3 % 2 == 0;
        onDetectionResult(this.f11991i);
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        final SelfieActivity selfieActivity = (SelfieActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = f11983w + 49;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("registerForInitialFeedbackTimeout called", new Object[0]);
        Disposable disposableSubscribe = Observable.timer(1L, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda15
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b((Long) obj);
            }
        }, new SelfieActivity$$ExternalSyntheticLambda22());
        selfieActivity.f11990h = disposableSubscribe;
        selfieActivity.f11996n.add(disposableSubscribe);
        int i5 = f11982u + 121;
        f11983w = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void e(Long l2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11982u + 101;
        f11983w = i3 % 128;
        this.f12002t = i3 % 2 != 0;
    }

    private void p() {
        int i2 = 2 % 2;
        int i3 = f11982u + 113;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("registerForCameraWarmingUpTimeout called", new Object[0]);
        this.f11996n.add(Observable.timer(1000L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.e((Long) obj);
            }
        }, new SelfieActivity$$ExternalSyntheticLambda22()));
        int i5 = f11982u + 55;
        f11983w = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private void q() {
        int i2 = 2 % 2;
        Disposable disposable = this.f11992j;
        if (disposable != null && !disposable.isDisposed()) {
            int i3 = f11982u + 27;
            f11983w = i3 % 128;
            if (i3 % 2 == 0) {
                Timber.d("timeout show instructions cancelled", new Object[1]);
            } else {
                Timber.d("timeout show instructions cancelled", new Object[0]);
            }
            this.f11992j.dispose();
        }
        int i4 = f11983w + 43;
        f11982u = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void a(int i2, boolean z2) {
        int i3 = 2 % 2;
        int i4 = f11983w + 99;
        f11982u = i4 % 128;
        if (i4 % 2 == 0) {
            d(i2, z2, R.color.onboard_sdk_TextColorDefault);
            int i5 = f11983w + 101;
            f11982u = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        d(i2, z2, R.color.onboard_sdk_TextColorDefault);
        throw null;
    }

    private void d(int i2, boolean z2, int i3) {
        int i4 = 2 % 2;
        int i5 = f11982u + 105;
        f11983w = i5 % 128;
        int i6 = i5 % 2;
        if (this.f11999q) {
            return;
        }
        IncodeTextView incodeTextView = this.f11985c.f12072b;
        incodeTextView.setVisibility(!(z2 ^ true) ? 4 : incodeTextView.getVisibility());
        aj.e(incodeTextView);
        incodeTextView.setText(i2);
        if (z2) {
            int i7 = f11983w + 5;
            f11982u = i7 % 128;
            if (i7 % 2 != 0) {
                c((View) incodeTextView);
                int i8 = 42 / 0;
            } else {
                c((View) incodeTextView);
            }
        }
        incodeTextView.setVisibility(0);
        incodeTextView.setTextColor(ResourcesCompat.getColor(getResources(), i3, null));
    }

    private void x() {
        int i2 = 2 % 2;
        int i3 = f11982u + 75;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        this.f11985c.f12072b.setVisibility(4);
        int i5 = f11983w + 45;
        f11982u = i5 % 128;
        int i6 = i5 % 2;
    }

    private void y() {
        int i2 = 2 % 2;
        int i3 = f11983w + 63;
        int i4 = i3 % 128;
        f11982u = i4;
        int i5 = i3 % 2;
        this.f11999q = true;
        int i6 = i4 + 123;
        f11983w = i6 % 128;
        int i7 = i6 % 2;
    }

    private void c(View view) {
        int i2 = 2 % 2;
        int i3 = f11982u + 67;
        f11983w = i3 % 128;
        if (i3 % 2 == 0) {
            TransitionSet transitionSet = (TransitionSet) TransitionInflater.from(this).inflateTransition(R.transition.onboard_sdk_feedback_appear_transition);
            transitionSet.addTarget(view);
            TransitionManager.beginDelayedTransition(this.f11985c.f12083m, transitionSet);
            int i4 = 97 / 0;
        } else {
            TransitionSet transitionSet2 = (TransitionSet) TransitionInflater.from(this).inflateTransition(R.transition.onboard_sdk_feedback_appear_transition);
            transitionSet2.addTarget(view);
            TransitionManager.beginDelayedTransition(this.f11985c.f12083m, transitionSet2);
        }
        int i5 = f11983w + 3;
        f11982u = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraXActivity
    public void onCameraStreamingStartedConditionally() {
        int i2 = 2 % 2;
        int i3 = f11983w + 97;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        super.onCameraStreamingStartedConditionally();
        if (v()) {
            int i5 = f11983w + 87;
            f11982u = i5 % 128;
            int i6 = i5 % 2;
            startFaceDetection();
            int iC = GovernmentValidationActivity.Companion.c();
            int iC2 = GovernmentValidationActivity.Companion.c();
            int iC3 = GovernmentValidationActivity.Companion.c();
            d(iC2, -1972117918, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC3, 1972117927);
            p();
            u();
            if (this.f11985c.f12075e != null) {
                int i7 = f11982u + 63;
                f11983w = i7 % 128;
                int i8 = i7 % 2;
                this.f11985c.f12075e.setVisibility(4);
            }
            talkBackAccessibilityText(R.string.onboard_sdk_voice_over_feedback_camera_activated);
        }
        ImageView imageView = this.f11985c.f12078h;
        IncodeCamera incodeCamera = (IncodeCamera) Objects.requireNonNull(getIncodeCamera());
        final SelfiePresenter selfiePresenter = this.f11988f;
        Objects.requireNonNull(selfiePresenter);
        Object[] objArr = {imageView, incodeCamera, new androidx.core.util.Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda14
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                selfiePresenter.setMinFaceWidth(((Float) obj).floatValue());
            }
        }};
        int iC4 = BaseSignatureFormContract.c();
        int iC5 = BaseSignatureFormContract.c();
        e.c(iC4, BaseSignatureFormContract.c(), BaseSignatureFormContract.c(), 126172003, -126172003, objArr, iC5);
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraXActivity, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onPreviewStarted() {
        int i2 = 2 % 2;
        int i3 = f11982u + 13;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        super.onPreviewStarted();
        a(R.string.onboard_sdk_feedback_align_face, false);
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, -15311873, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC3, 15311873);
        EventUtils.sendCameraOpenedEvent(getRepo(), Event.CAMERA_SELFIE, getModule(), getScreenName(), Integer.valueOf(getNormalizedPreviewWidth()), Integer.valueOf(getNormalizedPreviewHeight()), Boolean.TRUE);
        int i5 = f11983w + 77;
        f11982u = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ void I() {
        int i2 = 2 % 2;
        int i3 = f11983w + 35;
        f11982u = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11985c.f12078h.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.onboard_sdk_selfie_silhouette_narrow));
            this.f11985c.f12079i.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.onboard_sdk_selfie_silhouette_overlay_narrow));
            int i4 = f11983w + 105;
            f11982u = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.f11985c.f12078h.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.onboard_sdk_selfie_silhouette_narrow));
        this.f11985c.f12079i.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.onboard_sdk_selfie_silhouette_overlay_narrow));
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraXActivity
    public void onCameraAngleMeasured(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f11983w + 77;
        f11982u = i3 % 128;
        if (i3 % 2 == 0) {
            super.onCameraAngleMeasured(z2);
            if (z2) {
                runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.I();
                    }
                });
                int i4 = f11983w + 81;
                f11982u = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        super.onCameraAngleMeasured(z2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void u() {
        int i2 = 2 % 2;
        int i3 = f11982u + 69;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
        }
        int i5 = f11982u + 41;
        f11983w = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
    }

    private boolean v() {
        int i2 = 2 % 2;
        if (this.f11994l == null) {
            int i3 = f11983w + 11;
            int i4 = i3 % 128;
            f11982u = i4;
            int i5 = i3 % 2;
            if (!this.f11998p) {
                int i6 = i4 + 85;
                f11983w = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 82 / 0;
                }
                return true;
            }
        }
        int i8 = f11983w + 23;
        f11982u = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public void startFaceDetection() {
        int i2 = 2 % 2;
        int i3 = f11982u + 91;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        this.f11988f.startFaceDetection(true);
    }

    public void stopFaceDetection() {
        int i2 = 2 % 2;
        int i3 = f11982u + 117;
        f11983w = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11988f.stopFaceDetection();
            int i4 = 21 / 0;
        } else {
            this.f11988f.stopFaceDetection();
        }
    }

    public /* synthetic */ void E() {
        int i2 = 2 % 2;
        int i3 = f11982u + 5;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        this.f11985c.f12084n.setVisibility(4);
        this.f11985c.f12094x.setText(n());
        int i5 = f11983w + 21;
        f11982u = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
    }

    public /* synthetic */ void A() {
        int i2 = 2 % 2;
        int i3 = f11983w + 41;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        getPreviewContainer().setVisibility(4);
        e((TextView) this.f11985c.f12094x, n(), R.color.onboard_sdk_TextColorDefault, true);
        int i5 = f11982u + 47;
        f11983w = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ void B() {
        int i2 = 2 % 2;
        int i3 = f11982u + 41;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        this.f11985c.f12078h.setVisibility(4);
        Object[] objArr = {this, false, new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.E();
            }
        }, new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.A();
            }
        }};
        int iC = GovernmentValidationActivity.Companion.c();
        ((Animator) d(GovernmentValidationActivity.Companion.c(), 1896077995, iC, GovernmentValidationActivity.Companion.c(), objArr, GovernmentValidationActivity.Companion.c(), -1896077984)).start();
        int i5 = f11982u + 123;
        f11983w = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraXActivity, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void stopVideoRecording() {
        int i2 = 2 % 2;
        super.stopVideoRecording();
        if (!(!this.f11988f.isManualCaptureMode())) {
            int i3 = f11983w + 55;
            f11982u = i3 % 128;
            if (i3 % 2 != 0) {
                runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda18
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.B();
                    }
                });
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.B();
                }
            });
        }
        int i4 = f11982u + 87;
        f11983w = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void onFaceScanFailed(Throwable th) {
        int i2 = 2 % 2;
        this.f11988f.publishResult(new SelfieScanResult(ResultCode.ERROR, th));
        int i3 = f11983w + 69;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void onSelfieCaptureComplete(String str, String str2) {
        int i2 = 2 % 2;
        c(new DeviceStats(this.f11988f.getMotionStatus()), null, null, -1.0d, null, str, str2, 0, null);
        int i3 = f11983w + 101;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void onEnrollError(int i2, int i3, n.c cVar, int i4, boolean z2) {
        int i5 = 2 % 2;
        int i6 = f11983w + 111;
        f11982u = i6 % 128;
        if (i6 % 2 == 0) {
            EventUtils.sendEvent(getRepo(), Event.SELFIE_ATTEMPT_FAILED, getModule(), getScreenName());
            e(i2, i3, cVar, i4, z2);
            int i7 = f11982u + 113;
            f11983w = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        EventUtils.sendEvent(getRepo(), Event.SELFIE_ATTEMPT_FAILED, getModule(), getScreenName());
        e(i2, i3, cVar, i4, z2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ void f(View view) {
        int i2 = 2 % 2;
        int i3 = f11983w + 95;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        retryCapture();
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void e(int i2, int i3, n.c cVar, int i4, boolean z2) {
        int i5 = 2 % 2;
        stopFaceDetection();
        p.c(this.f11997o, false);
        this.f11985c.f12074d.setVisibility(4);
        q();
        o();
        d(cVar);
        this.f11985c.f12095y.setText(i2);
        this.f11985c.f12096z.setText(i3);
        this.f11985c.f12087q.setVisibility(0);
        this.f11985c.f12092v.setImageResource(!IdCaptureVersionGate.useV2() ? R.drawable.onboard_sdk_selfie_scan_failed : R.drawable.onboard_sdk_selfie_v2_scan_failed);
        if (IdCaptureVersionGate.useV2()) {
            int i6 = f11982u + 33;
            f11983w = i6 % 128;
            if (i6 % 2 == 0) {
                Object[] objArr = {this.f11985c.C, Boolean.valueOf(z2)};
                d(GovernmentValidationActivity.Companion.c(), -1057157019, GovernmentValidationActivity.Companion.c(), GovernmentValidationActivity.Companion.c(), objArr, GovernmentValidationActivity.Companion.c(), 1057157025);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = {this.f11985c.C, Boolean.valueOf(z2)};
            d(GovernmentValidationActivity.Companion.c(), -1057157019, GovernmentValidationActivity.Companion.c(), GovernmentValidationActivity.Companion.c(), objArr2, GovernmentValidationActivity.Companion.c(), 1057157025);
        }
        IncodeTextView incodeTextView = this.f11985c.f12082l;
        if (i4 < 0) {
            incodeTextView.setVisibility(8);
            this.f11985c.f12081k.setVisibility(8);
            return;
        }
        int i7 = f11983w + 45;
        f11982u = i7 % 128;
        int i8 = i7 % 2;
        incodeTextView.setText(getResources().getQuantityString(R.plurals.onboard_sdk_face_scan_attempts_remaining, i4, Integer.valueOf(i4)));
        incodeTextView.setVisibility(0);
        this.f11985c.f12081k.setVisibility(0);
        this.f11985c.f12081k.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelfieActivity.m8340xe1d2daea(this.f$0, view);
            }
        });
        int i9 = f11983w + 87;
        f11982u = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 48 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void retryCapture() {
        int i2 = 2 % 2;
        int i3 = f11982u + 77;
        f11983w = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11985c.f12087q.setVisibility(51);
            m();
            d((View) this.f11985c.f12094x);
            o();
            this.f11985c.f12073c.setVisibility(1);
            w();
            if (!shouldProceedWithVideoLivenessFunction()) {
                return;
            }
        } else {
            this.f11985c.f12087q.setVisibility(8);
            m();
            d((View) this.f11985c.f12094x);
            o();
            this.f11985c.f12073c.setVisibility(0);
            w();
            if (!shouldProceedWithVideoLivenessFunction()) {
                return;
            }
        }
        int i4 = f11982u + 67;
        f11983w = i4 % 128;
        int i5 = i4 % 2;
        restartVideoRecording();
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void onEnrollComplete(double d2, Boolean bool, String str, String str2, int i2, int i3, int i4, n.c cVar) {
        int i5 = 2 % 2;
        boolean zC = c(d2);
        if (!zC) {
            int i6 = f11982u + 51;
            f11983w = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            if (i2 == 0) {
                d(d2, bool, str, str2, i2);
                return;
            }
        }
        e(bool, zC, str, str2, i2, i3, i4, cVar);
        int i7 = f11982u + 113;
        f11983w = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 80 / 0;
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        boolean z2 = false;
        SelfieActivity selfieActivity = (SelfieActivity) objArr[0];
        double dDoubleValue = ((Number) objArr[1]).doubleValue();
        Boolean bool = (Boolean) objArr[2];
        String str = (String) objArr[3];
        String str2 = (String) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i2 = 2 % 2;
        DeviceStats deviceStats = new DeviceStats(selfieActivity.f11988f.getMotionStatus());
        if (dDoubleValue > 0.5d) {
            int i3 = f11983w + 121;
            f11982u = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        }
        selfieActivity.c(deviceStats, null, Boolean.valueOf(z2), -1.0d, bool, str, str2, iIntValue, null);
        int i5 = f11982u + 117;
        f11983w = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private void d(final double d2, final Boolean bool, final String str, final String str2, final int i2) {
        int i3 = 2 % 2;
        this.f11995m.add(Observable.just(new Object()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c(obj);
            }
        }).delay(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda12
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.c(d2, bool, str, str2, i2, obj);
            }
        }, new SelfieActivity$$ExternalSyntheticLambda22()));
        int i4 = f11982u + 9;
        f11983w = i4 % 128;
        int i5 = i4 % 2;
    }

    private /* synthetic */ void d(boolean z2, Boolean bool, String str, String str2, int i2, View view) {
        int i3 = 2 % 2;
        c(new DeviceStats(this.f11988f.getMotionStatus()), Boolean.FALSE, Boolean.valueOf(z2), -1.0d, bool, str, str2, i2, null);
        int i4 = f11982u + 59;
        f11983w = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void e(final Boolean bool, final boolean z2, final String str, final String str2, final int i2, int i3, int i4, n.c cVar) {
        int i5;
        int i6 = 2 % 2;
        int i7 = f11982u + 17;
        f11983w = i7 % 128;
        int i8 = i7 % 2;
        q();
        o();
        EventUtils.sendEvent(getRepo(), Event.SELFIE_ATTEMPT_FAILED, getModule(), getScreenName());
        d(cVar);
        this.f11985c.f12095y.setText(i3);
        this.f11985c.f12096z.setText(i4);
        this.f11985c.f12082l.setVisibility(4);
        if (IdCaptureVersionGate.useV2()) {
            int i9 = f11983w + 17;
            f11982u = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = R.drawable.onboard_sdk_selfie_v2_scan_failed_total;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i5 = R.drawable.onboard_sdk_selfie_v2_scan_failed_total;
        } else {
            i5 = R.drawable.onboard_sdk_selfie_scan_failed_total;
        }
        this.f11985c.f12092v.setImageResource(i5);
        this.f11985c.f12087q.setVisibility(0);
        IncodeButton incodeButton = this.f11985c.f12081k;
        incodeButton.setVisibility(0);
        incodeButton.setText(R.string.onboard_sdk_btn_continue);
        incodeButton.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelfieActivity.m8341x4dc03bd(this.f$0, z2, bool, str, str2, i2, view);
            }
        });
        int i11 = f11983w + 77;
        f11982u = i11 % 128;
        int i12 = i11 % 2;
    }

    public /* synthetic */ FaceAuthenticationResult a(FaceAuthenticationResult faceAuthenticationResult, Object obj) throws Exception {
        int i2 = 2 % 2;
        q();
        o();
        if (!faceAuthenticationResult.isSuccess) {
            int i3 = f11983w + 13;
            f11982u = i3 % 128;
            int i4 = i3 % 2;
            this.f11985c.f12077g.setVisibility(0);
            b(this.f11985c.f12094x, R.string.onboard_sdk_login_failed, R.color.onboard_sdk_state_destructive);
            EventUtils.sendEvent(getRepo(), Event.FACE_AUTHENTICATION_FAILED, getModule(), getScreenName());
        } else {
            this.f11985c.f12076f.setVisibility(0);
            b(this.f11985c.f12094x, R.string.onboard_sdk_login_success, R.color.onboard_sdk_TextColorDefault);
            EventUtils.sendEvent(getRepo(), Event.FACE_AUTHENTICATION_SUCCEEDED, getModule(), getScreenName());
            int i5 = f11982u + 37;
            f11983w = i5 % 128;
            int i6 = i5 % 2;
        }
        return faceAuthenticationResult;
    }

    public /* synthetic */ void b(FaceAuthenticationResult faceAuthenticationResult) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11983w + 35;
        f11982u = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11988f.publishResultOnModuleBus(faceAuthenticationResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.f11988f.publishResultOnModuleBus(faceAuthenticationResult);
        int i4 = f11983w + 75;
        f11982u = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void onFaceAuthenticationComplete(final FaceAuthenticationResult faceAuthenticationResult) {
        int i2 = 2 % 2;
        this.f11995m.add(Observable.just(new Object()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.a(faceAuthenticationResult, obj);
            }
        }).delay(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b((FaceAuthenticationResult) obj);
            }
        }, new SelfieActivity$$ExternalSyntheticLambda22()));
        int i3 = f11982u + 29;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void onFaceAuthenticationError(int i2, int i3, n.c cVar, int i4, boolean z2) {
        int i5 = 2 % 2;
        int i6 = f11982u + 47;
        f11983w = i6 % 128;
        int i7 = i6 % 2;
        EventUtils.sendEvent(getRepo(), Event.FACE_AUTHENTICATION_FAILED, getModule(), getScreenName());
        e(i2, i3, cVar, i4, z2);
        int i8 = f11982u + 69;
        f11983w = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 79 / 0;
        }
    }

    private void b(n.c cVar) {
        int i2 = 2 % 2;
        int i3 = f11983w + 73;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        if (cVar != null) {
            if (cVar.b() == 0) {
                int i5 = f11982u + 81;
                f11983w = i5 % 128;
                int i6 = i5 % 2;
                if (cVar.a() == null) {
                    return;
                }
            }
            int identifier = getResources().getIdentifier(cVar.a(), "raw", getPackageName());
            if (identifier == 0) {
                this.f11985c.f12088r.setAnimationFromUrl(getResources().getString(cVar.b()));
                int i7 = f11983w + 71;
                f11982u = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            this.f11985c.f12088r.setAnimation(identifier);
            int i9 = f11982u + 95;
            f11983w = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 34 / 0;
            }
        }
    }

    private void d(n.c cVar) {
        int i2 = 2 % 2;
        if (cVar != null) {
            int i3 = f11982u + 5;
            f11983w = i3 % 128;
            int i4 = i3 % 2;
            b(cVar);
            this.f11985c.f12088r.resetAnimation();
            this.f11985c.f12088r.setVisibility(0);
        } else {
            this.f11985c.f12088r.setVisibility(8);
            int i5 = f11983w + 115;
            f11982u = i5 % 128;
            int i6 = i5 % 2;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f11985c.f12087q);
        if (this.f11985c.f12088r.getVisibility() == 8) {
            constraintSet.connect(this.f11985c.f12089s.getId(), 3, 0, 3);
            constraintSet.setVerticalBias(this.f11985c.f12089s.getId(), 0.5f);
        } else {
            constraintSet.connect(this.f11985c.f12089s.getId(), 3, this.f11985c.A.getId(), 4);
            constraintSet.setVerticalBias(this.f11985c.f12089s.getId(), 0.1f);
        }
        constraintSet.applyTo(this.f11985c.f12087q);
    }

    private static boolean c(double d2) {
        int i2 = 2 % 2;
        int i3 = f11983w;
        int i4 = i3 + 39;
        f11982u = i4 % 128;
        int i5 = i4 % 2;
        if (d2 == -1.0d) {
            return true;
        }
        int i6 = i3 + 7;
        f11982u = i6 % 128;
        if (i6 % 2 == 0) {
            return d2 >= 0.5d;
        }
        throw null;
    }

    public /* synthetic */ FaceLoginResult e(boolean z2, boolean z3, FaceLoginResult faceLoginResult, Object obj) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11982u + 15;
        f11983w = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            q();
            o();
            if (!z2 || z3) {
                this.f11985c.f12077g.setVisibility(0);
                b(this.f11985c.f12094x, R.string.onboard_sdk_login_failed, R.color.onboard_sdk_state_destructive);
                FaceLoginResult faceLoginResultApplyTransactionId = new FaceLoginResult(z2).applyTransactionId(faceLoginResult.transactionId);
                int i4 = f11982u + 89;
                f11983w = i4 % 128;
                if (i4 % 2 != 0) {
                    return faceLoginResultApplyTransactionId;
                }
                obj2.hashCode();
                throw null;
            }
            this.f11985c.f12076f.setVisibility(0);
            b(this.f11985c.f12094x, R.string.onboard_sdk_login_success, R.color.onboard_sdk_TextColorDefault);
            return faceLoginResult;
        }
        q();
        o();
        throw null;
    }

    public /* synthetic */ void e(boolean z2, boolean z3, Boolean bool, String str, String str2, FaceLoginResult faceLoginResult) throws Exception {
        int i2;
        int i3 = 2 % 2;
        DeviceStats deviceStats = new DeviceStats(this.f11988f.getMotionStatus());
        Boolean boolValueOf = Boolean.valueOf(z2);
        Boolean boolValueOf2 = Boolean.valueOf(z3);
        if (z3) {
            int i4 = f11982u + 69;
            int i5 = i4 % 128;
            f11983w = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 123;
            f11982u = i7 % 128;
            int i8 = i7 % 2;
            i2 = 13;
        } else {
            i2 = 0;
        }
        c(deviceStats, boolValueOf, boolValueOf2, -1.0d, bool, str, str2, i2, faceLoginResult);
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void onLoginComplete(final boolean z2, final boolean z3, final Boolean bool, final String str, final String str2, final FaceLoginResult faceLoginResult) {
        int i2 = 2 % 2;
        this.f11995m.add(Observable.just(new Object()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda24
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e(z2, z3, faceLoginResult, obj);
            }
        }).delay(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda25
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.e(z2, z3, bool, str, str2, (FaceLoginResult) obj);
            }
        }, new SelfieActivity$$ExternalSyntheticLambda22()));
        int i3 = f11982u + 59;
        f11983w = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void onMaskCheckComplete(boolean z2, String str, String str2) {
        int i2 = 2 % 2;
        if (z2) {
            int i3 = f11982u + 23;
            f11983w = i3 % 128;
            int i4 = i3 % 2;
            e(str, str2);
            int i5 = f11982u + 79;
            f11983w = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        c(str, str2);
        int i7 = f11982u + 71;
        f11983w = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ Object b(Object obj) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11983w + 93;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        q();
        this.f11985c.f12076f.setVisibility(0);
        b(this.f11985c.f12094x, R.string.onboard_sdk_mask_check_success, R.color.onboard_sdk_TextColorDefault);
        o();
        int i5 = f11982u + 31;
        f11983w = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    private void e(final String str, final String str2) {
        int i2 = 2 % 2;
        this.f11995m.add(Observable.just(new Object()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda19
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b(obj);
            }
        }).delay(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda20
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b(str, str2, obj);
            }
        }, new SelfieActivity$$ExternalSyntheticLambda22()));
        int i3 = f11983w + 85;
        f11982u = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ Object e(Object obj) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11982u + 97;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        q();
        d(R.string.onboard_sdk_mask_check_failed, false, R.color.onboard_sdk_state_destructive);
        this.f11985c.f12077g.setVisibility(0);
        b(this.f11985c.f12094x, R.string.onboard_sdk_mask_check_failed, R.color.onboard_sdk_state_destructive);
        o();
        int i5 = f11983w + 101;
        f11982u = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public /* synthetic */ void c(String str, String str2, Object obj) throws Exception {
        int i2 = 2 % 2;
        c(new DeviceStats(this.f11988f.getMotionStatus()), null, null, 0.0d, Boolean.FALSE, str, str2, 9, null);
        int i3 = f11983w + 123;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
    }

    private void c(final String str, final String str2) {
        int i2 = 2 % 2;
        this.f11995m.add(Observable.just(new Object()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda16
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e(obj);
            }
        }).delay(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda17
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.c(str, str2, obj);
            }
        }, new SelfieActivity$$ExternalSyntheticLambda22()));
        int i3 = f11983w + 63;
        f11982u = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void a(DeviceStats deviceStats, Boolean bool, Boolean bool2, Boolean bool3, double d2, String str, String str2, int i2, FaceLoginResult faceLoginResult) {
        int i3 = 2 % 2;
        this.f11994l = new SelfieScanResult(ResultCode.SUCCESS, null, deviceStats, -1.0d, bool, -1.0d, bool2, d2, bool3, str, str2, i2, null, null, null, null, faceLoginResult);
        int i4 = f11983w + 39;
        f11982u = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    private void e(SelfieScanResult selfieScanResult) {
        int i2 = 2 % 2;
        int i3 = f11983w + 113;
        f11982u = i3 % 128;
        if (i3 % 2 != 0) {
            c(selfieScanResult.deviceStats, selfieScanResult.isFaceMatched, selfieScanResult.isSpoofAttempt, selfieScanResult.maskConfidence, selfieScanResult.hasFaceMask, selfieScanResult.croppedSelfieImgPath, selfieScanResult.fullFrameSelfieImgPath, selfieScanResult.status, selfieScanResult.faceLoginResult);
            int i4 = 5 / 0;
        } else {
            c(selfieScanResult.deviceStats, selfieScanResult.isFaceMatched, selfieScanResult.isSpoofAttempt, selfieScanResult.maskConfidence, selfieScanResult.hasFaceMask, selfieScanResult.croppedSelfieImgPath, selfieScanResult.fullFrameSelfieImgPath, selfieScanResult.status, selfieScanResult.faceLoginResult);
        }
    }

    private void c(DeviceStats deviceStats, Boolean bool, Boolean bool2, double d2, Boolean bool3, String str, String str2, int i2, FaceLoginResult faceLoginResult) {
        int i3 = 2 % 2;
        if (isActivityRunning()) {
            String base64FromBitmap = BitmapUtils.getBase64FromBitmap(BitmapFactory.decodeFile(str));
            String base64FromBitmap2 = BitmapUtils.getBase64FromBitmap(BitmapFactory.decodeFile(str2));
            SelfieScanResult selfieScanResult = new SelfieScanResult(ResultCode.SUCCESS, null, deviceStats, -1.0d, bool, -1.0d, bool2, d2, bool3, str, str2, i2, BitmapUtils.getEncryptedBase64(base64FromBitmap), base64FromBitmap, BitmapUtils.getEncryptedBase64(base64FromBitmap2), base64FromBitmap2, faceLoginResult);
            IncodeWelcome.getInstance().setSelfieScanResult(selfieScanResult);
            if (!IncodeWelcome.getInstance().isSubmitOnlyMode()) {
                this.f11988f.publishResult(selfieScanResult);
                return;
            }
            int i4 = f11982u + 109;
            f11983w = i4 % 128;
            int i5 = i4 % 2;
            this.f11988f.publishResult(ai.e(faceLoginResult != null ? faceLoginResult.transactionId : null));
            return;
        }
        int i6 = f11983w + 27;
        f11982u = i6 % 128;
        int i7 = i6 % 2;
        a(deviceStats, bool, bool2, bool3, d2, str, str2, i2, faceLoginResult);
    }

    public /* synthetic */ void D() {
        int i2 = 2 % 2;
        int i3 = f11982u + 75;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        talkBackAccessibilityText(R.string.onboard_sdk_voice_over_face_scan_enter_manual_mode);
        int i5 = f11983w + 59;
        f11982u = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void w() {
        View view;
        int i2;
        int i3 = 2 % 2;
        if (isAccessibilityTalkBackActive()) {
            int i4 = f11983w + 97;
            f11982u = i4 % 128;
            if (i4 % 2 != 0) {
                this.f11988f.isManualCaptureMode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.f11988f.isManualCaptureMode()) {
                if (!this.f11985c.f12071a.isAccessibilityFocused()) {
                    int i5 = f11983w + 95;
                    f11982u = i5 % 128;
                    if (i5 % 2 != 0) {
                        view = this.f11985c.f12071a;
                        i2 = 4;
                    } else {
                        view = this.f11985c.f12071a;
                        i2 = 8;
                    }
                    view.sendAccessibilityEvent(i2);
                }
                new Handler().postDelayed(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.D();
                    }
                }, ConfigurationDefaultValue.MotionPaddingAroundTouchMSec);
            }
        }
    }

    private void z() {
        int i2 = 2 % 2;
        this.f11988f.publishResult(new SelfieScanResult(ResultCode.USER_CANCELLED, null, new DeviceStats(this.f11988f.getMotionStatus()), -2.0d, null, -2.0d, null, -2.0d, null, null, null, 9));
        int i3 = f11983w + 63;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
    }

    private void C() {
        int i2 = 2 % 2;
        this.f11988f.publishResultOnModuleBus(new FaceAuthenticationResult(ResultCode.USER_CANCELLED, null, false, null, null, null));
        int i3 = f11983w + 7;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraXActivity
    public void handlePermissionDenied(Exception exc) {
        int i2 = 2 % 2;
        this.f11988f.publishResult(new SelfieScanResult(ResultCode.ERROR, exc));
        int i3 = f11983w + 117;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraXActivity, com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f11982u + 35;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnDestroy();
        q();
        this.f11996n.clear();
        this.f11995m.clear();
        f();
        int i5 = f11983w + 41;
        f11982u = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public boolean isVoiceOverActive() {
        int i2 = 2 % 2;
        int i3 = f11982u + 105;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsAccessibilityTalkBackActive = isAccessibilityTalkBackActive();
        int i5 = f11983w + 13;
        f11982u = i5 % 128;
        if (i5 % 2 == 0) {
            return zIsAccessibilityTalkBackActive;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraXActivity
    public IdealEnvironmentTestResult evaluateFrameForIdealCaptureEnvironmentTest(int i2) {
        int iB;
        int i3 = 2 % 2;
        int i4 = f11983w + 101;
        f11982u = i4 % 128;
        int i5 = i4 % 2;
        if (i2 < 0) {
            return new IdealEnvironmentTestResult(i2, null, null);
        }
        Bitmap lastCompleteFrame = getLastCompleteFrame();
        if (lastCompleteFrame == null) {
            return new IdealEnvironmentTestResult(-2, null, null);
        }
        FaceProcessingUtils.DetectionData detectionData = this.f11988f.getDetectionData();
        FaceProcessingUtils.DetectionData selfieDetectionResultNoConstraints = this.f11988f.getSelfieDetectionResultNoConstraints(lastCompleteFrame, false);
        Timber.d("Previous Frame Validation State: %s", detectionData.detectionResultState);
        Timber.d("Current Frame Validation State: %s", selfieDetectionResultNoConstraints.detectionResultState);
        if (!this.f11988f.isManualCaptureMode()) {
            iB = b(detectionData, selfieDetectionResultNoConstraints);
        } else {
            int i6 = f11982u + 29;
            f11983w = i6 % 128;
            int i7 = i6 % 2;
            iB = d(detectionData, selfieDetectionResultNoConstraints);
            int i8 = f11982u + 41;
            f11983w = i8 % 128;
            int i9 = i8 % 2;
        }
        return new IdealEnvironmentTestResult(iB, lastCompleteFrame, cb.f9643e.name());
    }

    private static int b(FaceProcessingUtils.DetectionData detectionData, FaceProcessingUtils.DetectionData detectionData2) {
        int i2 = 2 % 2;
        int i3 = f11982u + 101;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        if (a(detectionData2.detectionResultState) && !a(detectionData, detectionData2)) {
            int i5 = f11983w + 101;
            f11982u = i5 % 128;
            int i6 = i5 % 2;
            return -2;
        }
        int i7 = f11982u + 91;
        f11983w = i7 % 128;
        if (i7 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private int d(FaceProcessingUtils.DetectionData detectionData, FaceProcessingUtils.DetectionData detectionData2) {
        int i2 = 2 % 2;
        if (!a(detectionData2.detectionResultState)) {
            return 0;
        }
        int i3 = f11983w + 81;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        FaceProcessingUtils.DetectionData selfieDetectionResultNoConstraints = this.f11988f.getSelfieDetectionResultNoConstraints(detectionData.bitmap, false);
        if (selfieDetectionResultNoConstraints.detectionResultState == FaceProcessingUtils.FaceProcessingState.FACE_DETECTED) {
            int i5 = f11982u + 39;
            f11983w = i5 % 128;
            int i6 = i5 % 2;
            if (!a(selfieDetectionResultNoConstraints, detectionData2)) {
                int i7 = f11982u + 55;
                f11983w = i7 % 128;
                int i8 = i7 % 2;
                return -2;
            }
        }
        int i9 = f11983w + 103;
        f11982u = i9 % 128;
        int i10 = i9 % 2;
        return 0;
    }

    private static boolean a(FaceProcessingUtils.DetectionData detectionData, FaceProcessingUtils.DetectionData detectionData2) {
        int i2 = 2 % 2;
        int i3 = f11983w + 125;
        f11982u = i3 % 128;
        int i4 = i3 % 2;
        if ((detectionData2.face.leftEye.x - detectionData2.face.rightEye.x) / (detectionData.face.leftEye.x - detectionData.face.rightEye.x) > 1.4d) {
            int i5 = f11983w + 95;
            f11982u = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = f11983w + 97;
        f11982u = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    private static boolean a(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        int i3 = f11982u + 17;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        if (faceProcessingState == FaceProcessingUtils.FaceProcessingState.FACE_DETECTED) {
            int i5 = f11982u + 51;
            f11983w = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = f11983w + 105;
        f11982u = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieContract.View
    public void showVerifyingTextInCameraLid() {
        int i2 = 2 % 2;
        int i3 = f11982u + 73;
        f11983w = i3 % 128;
        int i4 = i3 % 2;
        this.f11985c.f12094x.setText(R.string.onboard_sdk_selfie_verifying);
        int i5 = f11982u + 59;
        f11983w = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ void e(SelfieScanResult selfieScanResult, Object obj) throws Exception {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, -1301197840, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this, selfieScanResult, obj}, iC3, 1301197843);
    }

    public /* synthetic */ void F() {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, -963284341, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC3, 963284358);
    }

    public /* synthetic */ void G() {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, -1706922314, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC3, 1706922318);
    }

    public /* synthetic */ Object c(Object obj) throws Exception {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        return d(iC2, -1662887956, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this, obj}, iC3, 1662887957);
    }

    public /* synthetic */ void c(double d2, Boolean bool, String str, String str2, int i2, Object obj) throws Exception {
        Object[] objArr = {this, Double.valueOf(d2), bool, str, str2, Integer.valueOf(i2), obj};
        int iC = GovernmentValidationActivity.Companion.c();
        d(GovernmentValidationActivity.Companion.c(), 412323480, iC, GovernmentValidationActivity.Companion.c(), objArr, GovernmentValidationActivity.Companion.c(), -412323475);
    }

    public /* synthetic */ void b(String str, String str2, Object obj) throws Exception {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, 1949952648, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this, str, str2, obj}, iC3, -1949952646);
    }

    private static void b(View view, boolean z2) {
        Object[] objArr = {view, Boolean.valueOf(z2)};
        int iC = GovernmentValidationActivity.Companion.c();
        d(GovernmentValidationActivity.Companion.c(), -1057157019, iC, GovernmentValidationActivity.Companion.c(), objArr, GovernmentValidationActivity.Companion.c(), 1057157025);
    }

    private void s() {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, -15311873, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC3, 15311873);
    }

    private void r() {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, -1972117918, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC3, 1972117927);
    }

    private static void e(View view) {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, 25148005, iC, GovernmentValidationActivity.Companion.c(), new Object[]{view}, iC3, -25147989);
    }

    private Animator b(boolean z2, Runnable runnable, Runnable runnable2) {
        Object[] objArr = {this, Boolean.valueOf(z2), runnable, runnable2};
        int iC = GovernmentValidationActivity.Companion.c();
        return (Animator) d(GovernmentValidationActivity.Companion.c(), 1896077995, iC, GovernmentValidationActivity.Companion.c(), objArr, GovernmentValidationActivity.Companion.c(), -1896077984);
    }

    private void l() {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, -796907118, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC3, 796907128);
    }

    private static void a(View view) {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, 2134572886, iC, GovernmentValidationActivity.Companion.c(), new Object[]{view}, iC3, -2134572872);
    }

    private void i() {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, 1620470242, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC3, -1620470230);
    }

    private void c(boolean z2) {
        Object[] objArr = {this, Boolean.valueOf(z2)};
        int iC = GovernmentValidationActivity.Companion.c();
        d(GovernmentValidationActivity.Companion.c(), 622576592, iC, GovernmentValidationActivity.Companion.c(), objArr, GovernmentValidationActivity.Companion.c(), -622576584);
    }

    private void e() {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, 127570874, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC3, -127570859);
    }

    static int b(View view, View view2) {
        Object[] objArr = {view, view2};
        int iC = GovernmentValidationActivity.Companion.c();
        return ((Integer) d(GovernmentValidationActivity.Companion.c(), -1777731137, iC, GovernmentValidationActivity.Companion.c(), objArr, GovernmentValidationActivity.Companion.c(), 1777731150)).intValue();
    }

    private void a() {
        int iC = GovernmentValidationActivity.Companion.c();
        int iC2 = GovernmentValidationActivity.Companion.c();
        int iC3 = GovernmentValidationActivity.Companion.c();
        d(iC2, 1808051639, iC, GovernmentValidationActivity.Companion.c(), new Object[]{this}, iC3, -1808051632);
    }
}
