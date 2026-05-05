package com.incode.welcome_sdk.ui.tutorial;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.viewpager.widget.ViewPager;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.LayoutUtils;
import com.incode.welcome_sdk.d.ai;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase;
import com.incode.welcome_sdk.ui.tutorial.TutorialContract;
import com.incode.welcome_sdk.ui.tutorial.adapters.TutorialPassportAdapter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
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
public class TutorialPassportActivity extends BaseActivity implements TutorialContract.View {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f17853p = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f17854r = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class<? extends BaseValidationActivity> f17855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    TutorialFrontPresenter f17856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    TutorialPassportAdapter f17857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ai f17858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ValidationPhase f17859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IdCategory f17861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private IdScan.AutocaptureUXMode f17863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IdScan.ScanStep f17866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f17867n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f17868o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17869q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f17870s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17871t;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8582instrumented$1$safeOnCreate$LandroidosBundleV(TutorialPassportActivity tutorialPassportActivity, View view) {
        Callback.onClick_enter(view);
        try {
            tutorialPassportActivity.c(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8583instrumented$2$safeOnCreate$LandroidosBundleV(TutorialPassportActivity tutorialPassportActivity, View view) {
        Callback.onClick_enter(view);
        try {
            tutorialPassportActivity.d(view);
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
            String strKd = Qg.kd("eR\u0018U9", (short) (OY.Xd() ^ ((211835907 ^ 715431403) ^ 637829226)), (short) (OY.Xd() ^ (393751862 ^ 393770906)));
            String strVd = hg.Vd("YF", (short) (Od.Xd() ^ ((1553852613 ^ 857810379) ^ (-1874651307))), (short) (Od.Xd() ^ ((1206654238 ^ 1485066406) ^ (-526914155))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("|i/lP", (short) (C1499aX.Xd() ^ (466984306 ^ (-466983769))));
                String strYd = C1561oA.yd("|h", (short) (FB.Xd() ^ ((217347124 ^ 1903891072) ^ 2106550470)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("N=\u0005D*", (short) (FB.Xd() ^ ((92302821 ^ 1750660226) ^ 1842914592)));
                    String strQd = Xg.qd("\u0016\f", (short) (OY.Xd() ^ ((1981137222 ^ 1781003283) ^ 473046224)), (short) (OY.Xd() ^ ((936371354 ^ 1965079537) ^ 1122966515)));
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
                        Method declaredMethod = Class.forName(Jg.Wd("^/E;\u000b", (short) (Od.Xd() ^ ((2020704942 ^ 1140115268) ^ (-998598029))), (short) (Od.Xd() ^ (63152691 ^ (-63144467))))).getDeclaredMethod(ZO.xd("\u0019\u001c", (short) (OY.Xd() ^ ((653676208 ^ 805697639) ^ 385079373)), (short) (OY.Xd() ^ (1174268765 ^ 1174252958))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("Z+\u0005Z#\\", (short) (C1499aX.Xd() ^ ((1497330567 ^ 992928116) ^ (-1645333297))), (short) (C1499aX.Xd() ^ (32918938 ^ (-32930399))))};
                                Method method = Class.forName(Ig.wd("=\u0012\u0018HL\u0001Q\u001aw2-[\u0001\u0012\u0016s[k1\u0001:\u00140", (short) (OY.Xd() ^ (1481746279 ^ 1481753739)))).getMethod(C1561oA.Qd("\u001a\u0017%\u0003(!!\u0011\u0018|\u000e\u001a\u001d\u000f\b\t", (short) (C1633zX.Xd() ^ ((2082728076 ^ 700141824) ^ (-1436066162)))), Class.forName(EO.Od("k\u0010\u0015fux\u0018/~\b1*raxN", (short) (C1580rY.Xd() ^ (1355250074 ^ (-1355244327))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("ZI\u0011P6", (short) (FB.Xd() ^ ((1866706444 ^ 1568833624) ^ 851527682)), (short) (FB.Xd() ^ (813887310 ^ 813876387)));
                                    String strOd = C1561oA.od("0$", (short) (C1580rY.Xd() ^ ((2016803100 ^ 1060157547) ^ (-1191517988))));
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
                    short sXd = (short) (Od.Xd() ^ (582434818 ^ (-582441544)));
                    int[] iArr = new int["#\u0012Y\u0019~".length()];
                    QB qb = new QB("#\u0012Y\u0019~");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    String strZd2 = Wg.Zd("! ", (short) (OY.Xd() ^ ((591224683 ^ 1028852173) ^ 510536873)), (short) (OY.Xd() ^ (1517943682 ^ 1517925719)));
                    try {
                        Class<?> cls5 = Class.forName(str);
                        Field field5 = 0 != 0 ? cls5.getField(strZd2) : cls5.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("\u0011\u007fG\u0007l", (short) (C1499aX.Xd() ^ ((1347632379 ^ 443119261) ^ (-1245338695))));
                        String strVd2 = Wg.vd("\f\u0002", (short) (ZN.Xd() ^ ((983776298 ^ 1618874001) ^ 1524441934)));
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
                        int i3 = (1057054039 ^ 1630912961) ^ 1580506333;
                        if (x2 > i3 && x2 < displayMetrics.widthPixels - i3 && y2 > i3 && y2 < displayMetrics.heightPixels - i3) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        int i2 = 2 % 2;
        int i3 = f17854r + 81;
        f17853p = i3 % 128;
        if (i3 % 2 != 0) {
            View[] viewArr = new View[5];
            viewArr[1] = this.f17858e.f6863a;
            viewArr[0] = this.f17858e.f6866d;
            LayoutUtils.equalizeWidths(viewArr);
        } else {
            LayoutUtils.equalizeWidths(this.f17858e.f6863a, this.f17858e.f6866d);
        }
        LayoutUtils.setFixedWidth(this.f17858e.f6866d);
    }

    private /* synthetic */ void c(View view) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17854r + 63;
        f17853p = i3 % 128;
        int i4 = i3 % 2;
        b();
        int i5 = f17853p + 87;
        f17854r = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private /* synthetic */ void d(View view) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17853p + 7;
        f17854r = i3 % 128;
        int i4 = i3 % 2;
        d();
        int i5 = f17854r + 97;
        f17853p = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        ai aiVarC = ai.c(getLayoutInflater());
        this.f17858e = aiVarC;
        setContentView(aiVarC.d());
        DaggerTutorialPassportComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.getInstance().getIncodeWelcomeRepositoryComponent()).tutorialPresenterModule(new TutorialPresenterModule(this)).build().inject(this);
        this.f17858e.f6863a.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialPassportActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        });
        this.f17861h = (IdCategory) getIntent().getSerializableExtra("extraIdCategory");
        this.f17860g = getIntent().getBooleanExtra("extraEnableFrontShownAsBackCheck", false);
        this.f17862i = getIntent().getBooleanExtra("extraEnableBackShownAsFrontCheck", false);
        this.f17863j = (IdScan.AutocaptureUXMode) getIntent().getParcelableExtra("extraAutoCaptureUXMode");
        this.f17866m = (IdScan.ScanStep) getIntent().getSerializableExtra("extraScanStep");
        this.f17867n = getIntent().getBooleanExtra("showIdOverlay", false);
        this.f17864k = getIntent().getIntExtra("extraAutoCaptureTimeout", 25);
        this.f17868o = getIntent().getIntExtra("extraAutoCaptureNoIdTimeout", 60);
        this.f17865l = getIntent().getIntExtra("extraCaptureAttempts", 3);
        this.f17871t = getIntent().getBooleanExtra("extraStreamAudioEnabled", false);
        this.f17869q = getIntent().getBooleanExtra("extraAgeAssuranceUxEnabled", false);
        EventUtils.sendTutorialShownEvent(getRepo(), this, this.f17861h);
        this.f17857d = new TutorialPassportAdapter(getSupportFragmentManager(), this.f17869q);
        this.f17858e.f6865c.setAdapter(this.f17857d);
        this.f17858e.f6865c.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialPassportActivity.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f17872a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f17873b = 1;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i3, float f2, int i4) {
                int i5 = 2 % 2;
                int i6 = f17872a + 49;
                f17873b = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i3) {
                Callback.onPageSelected_enter(i3);
                try {
                    int i4 = 2 % 2;
                    if (i3 != TutorialPassportActivity.this.f17857d.getCount() - 1) {
                        TutorialPassportActivity.this.f17858e.f6866d.setText(R.string.onboard_sdk_btn_next);
                        int i5 = f17872a + 57;
                        f17873b = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 57 / 0;
                            return;
                        }
                        return;
                    }
                    int i7 = f17872a + 7;
                    f17873b = i7 % 128;
                    if (i7 % 2 != 0) {
                        TutorialPassportActivity.this.f17858e.f6866d.setText(R.string.onboard_sdk_btn_start);
                        return;
                    } else {
                        TutorialPassportActivity.this.f17858e.f6866d.setText(R.string.onboard_sdk_btn_start);
                        int i8 = 95 / 0;
                        return;
                    }
                } finally {
                }
                Callback.onPageSelected_exit();
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i3) {
                int i4 = 2 % 2;
                int i5 = f17873b + 15;
                f17872a = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Class<? extends BaseValidationActivity> cls = (Class) getIntent().getSerializableExtra("extraValidationClass");
        this.f17855b = cls;
        if (cls == null) {
            int i3 = f17853p + 105;
            f17854r = i3 % 128;
            if (i3 % 2 == 0) {
                this.f17855b = ValidationActivity.class;
                int i4 = 21 / 0;
            } else {
                this.f17855b = ValidationActivity.class;
            }
        }
        this.f17859f = (ValidationPhase) getIntent().getSerializableExtra("extraIdValidationPhase");
        this.f17858e.f6863a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialPassportActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialPassportActivity.m8582instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        this.f17858e.f6866d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialPassportActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialPassportActivity.m8583instrumented$2$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        int i5 = f17853p + 75;
        f17854r = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        int i2 = 2 % 2;
        int i3 = f17853p + 79;
        f17854r = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.onStart();
            if (!this.f17870s) {
                this.f17870s = true;
                talkBackAccessibilityText(R.string.onboard_sdk_tutorial_passport_voice_over);
            }
            int i4 = f17853p + 107;
            f17854r = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        super.onStart();
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f17854r + 89;
        f17853p = i3 % 128;
        if (i3 % 2 != 0) {
            IdCategory idCategory = IdCategory.FIRST;
            throw null;
        }
        if (this.f17861h == IdCategory.FIRST) {
            return ScreenName.PASSPORT_CAPTURE_TUTORIAL;
        }
        ScreenName screenName = ScreenName.TUTORIAL_SECOND_PASSPORT;
        int i4 = f17853p + 97;
        f17854r = i4 % 128;
        int i5 = i4 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f17854r + 31;
        f17853p = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = Modules.ID;
        int i5 = f17853p + 59;
        f17854r = i5 % 128;
        int i6 = i5 % 2;
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public boolean isDelayedOnboardingSupported() {
        int i2 = 2 % 2;
        int i3 = f17853p;
        int i4 = i3 + 105;
        f17854r = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 91;
        f17854r = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private void d() throws Exception {
        int currentItem;
        int i2 = 2 % 2;
        int i3 = f17854r + 41;
        f17853p = i3 % 128;
        if (i3 % 2 == 0 ? (currentItem = this.f17858e.f6865c.getCurrentItem()) != this.f17857d.getCount() - 1 : (currentItem = this.f17858e.f6865c.getCurrentItem()) != this.f17857d.getCount() / 0) {
            this.f17858e.f6865c.setCurrentItem(currentItem + 1);
            return;
        }
        int i4 = f17854r + 111;
        f17853p = i4 % 128;
        int i5 = i4 % 2;
        a(true);
        EventUtils.sendContinueEvent(getRepo(), this);
        int i6 = f17854r + 85;
        f17853p = i6 % 128;
        int i7 = i6 % 2;
    }

    private void b() throws Exception {
        int i2 = 2 % 2;
        int i3 = f17854r + 21;
        f17853p = i3 % 128;
        int i4 = i3 % 2;
        a(true);
        EventUtils.sendContinueEvent(getRepo(), this);
        int i5 = f17854r + 101;
        f17853p = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i2) throws Exception {
        int i3 = 2 % 2;
        int i4 = f17854r + 89;
        f17853p = i4 % 128;
        int i5 = i4 % 2;
        a(false);
        int i6 = f17854r + 61;
        f17853p = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f17854r + 67;
        f17853p = i3 % 128;
        int i4 = i3 % 2;
        int currentItem = this.f17858e.f6865c.getCurrentItem();
        if (currentItem != 0) {
            this.f17858e.f6865c.setCurrentItem(currentItem - 1);
            return;
        }
        int i5 = f17853p + 125;
        f17854r = i5 % 128;
        int i6 = i5 % 2;
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialPassportActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) throws Exception {
                this.f$0.c(dialogInterface, i7);
            }
        });
    }

    private void a(boolean z2) throws Exception {
        int i2 = 2 % 2;
        e();
        if (z2) {
            Intent intent = new Intent(this, this.f17855b);
            ValidationPhase validationPhase = this.f17859f;
            Object obj = null;
            if (validationPhase != null) {
                int i3 = f17853p + 41;
                f17854r = i3 % 128;
                if (i3 % 2 != 0) {
                    intent.putExtra("extraIdValidationPhase", validationPhase);
                } else {
                    intent.putExtra("extraIdValidationPhase", validationPhase);
                    obj.hashCode();
                    throw null;
                }
            }
            intent.putExtra("extraIdCategory", this.f17861h);
            intent.putExtra("extraEnableFrontShownAsBackCheck", this.f17860g);
            intent.putExtra("extraEnableBackShownAsFrontCheck", this.f17862i);
            intent.putExtra("extraAutoCaptureUXMode", this.f17863j);
            intent.putExtra("extraScanStep", this.f17866m);
            intent.putExtra("showIdOverlay", this.f17867n);
            intent.putExtra("extraAutoCaptureTimeout", this.f17864k);
            intent.putExtra("extraAutoCaptureNoIdTimeout", this.f17868o);
            intent.putExtra("extraCaptureAttempts", this.f17865l);
            intent.putExtra("extraStreamAudioEnabled", this.f17871t);
            intent.putExtra("extraAgeAssuranceUxEnabled", this.f17869q);
            CX.ud();
            startActivity(intent);
            finish();
            int i4 = f17854r + 31;
            f17853p = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f17856c.submitCancelledResult();
    }

    private void e() {
        int i2 = 2 % 2;
        int i3 = f17854r + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17853p = i3 % 128;
        int i4 = i3 % 2;
        this.f17858e.f6866d.setEnabled(false);
        this.f17858e.f6863a.setEnabled(false);
        int i5 = f17853p + 1;
        f17854r = i5 % 128;
        int i6 = i5 % 2;
    }
}
