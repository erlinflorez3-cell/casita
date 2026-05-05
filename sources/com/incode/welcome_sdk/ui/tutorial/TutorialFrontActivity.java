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
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.LayoutUtils;
import com.incode.welcome_sdk.d.af;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase;
import com.incode.welcome_sdk.ui.tutorial.TutorialContract;
import com.incode.welcome_sdk.ui.tutorial.adapters.TutorialFrontAdapter;
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

/* JADX INFO: loaded from: classes5.dex */
public class TutorialFrontActivity extends BaseActivity implements TutorialContract.View {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f17821r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f17822s = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Inject
    TutorialFrontPresenter f17823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class<? extends BaseValidationActivity> f17824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    TutorialFrontAdapter f17825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    af f17826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IdCategory f17827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IdScan.AutocaptureUXMode f17828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ValidationPhase f17829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f17835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private IdScan.ScanStep f17836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f17837p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17838q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17839t;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8579instrumented$1$safeOnCreate$LandroidosBundleV(TutorialFrontActivity tutorialFrontActivity, View view) {
        Callback.onClick_enter(view);
        try {
            tutorialFrontActivity.e(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8580instrumented$2$safeOnCreate$LandroidosBundleV(TutorialFrontActivity tutorialFrontActivity, View view) {
        Callback.onClick_enter(view);
        try {
            tutorialFrontActivity.d(view);
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
            String strKd = Qg.kd("`M\u0013P4", (short) (OY.Xd() ^ (907309826 ^ 907298168)), (short) (OY.Xd() ^ ((1703920677 ^ 836244727) ^ 1415022349)));
            short sXd = (short) (ZN.Xd() ^ (289858370 ^ 289847860));
            short sXd2 = (short) (ZN.Xd() ^ (704482284 ^ 704485730));
            int[] iArr = new int["H5".length()];
            QB qb = new QB("H5");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("$\u0011V\u0014w", (short) (OY.Xd() ^ (801257916 ^ 801246607)));
                String strYd = C1561oA.yd("\u0018\u0006", (short) (FB.Xd() ^ ((1038386143 ^ 1613384834) ^ 1573826154)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("4#j*\u0010", (short) (OY.Xd() ^ (1886682994 ^ 1886653303)));
                    String strQd = Xg.qd("\u0016\f", (short) (FB.Xd() ^ (68047957 ^ 68038006)), (short) (FB.Xd() ^ (593826166 ^ 593835076)));
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
                        Method declaredMethod = Class.forName(Jg.Wd("\u0012\u001e\u0003po", (short) (C1499aX.Xd() ^ (952701471 ^ (-952697123))), (short) (C1499aX.Xd() ^ ((873937342 ^ 108221465) ^ (-845443592))))).getDeclaredMethod(ZO.xd("-D", (short) (ZN.Xd() ^ ((880542246 ^ 612215167) ^ 268560752)), (short) (ZN.Xd() ^ (529775743 ^ 529781919))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("g0L\\$b", (short) (Od.Xd() ^ ((1325682109 ^ 926824211) ^ (-2017079362))), (short) (Od.Xd() ^ (390396866 ^ (-390378206))));
                                short sXd3 = (short) (FB.Xd() ^ ((541479476 ^ 1329932509) ^ 1862488108));
                                int[] iArr2 = new int["d \u0014y&{\u0013knV\u0005#DYQ#r3hd\u0012[o".length()];
                                QB qb2 = new QB("d \u0014y&{\u0013knV\u0005#DYQ#r3hd\u0012[o");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                                    i3++;
                                }
                                Class<?> cls4 = Class.forName(new String(iArr2, 0, i3));
                                Class<?>[] clsArr = {Class.forName(EO.Od("h\u0010\u0013equ\u0017+{\u0006-(q^wJ", (short) (C1580rY.Xd() ^ ((990675320 ^ 1933190240) ^ (-1211559877)))))};
                                Object[] objArr2 = {strUd2};
                                short sXd4 = (short) (OY.Xd() ^ (694087832 ^ 694062676));
                                int[] iArr3 = new int["1.<\u001a?88(/\u0014%14&\u001f ".length()];
                                QB qb3 = new QB("1.<\u001a?88(/\u0014%14&\u001f ");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                Method method = cls4.getMethod(new String(iArr3, 0, i4), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("o^&eK", (short) (C1633zX.Xd() ^ (422153310 ^ (-422174026))), (short) (C1633zX.Xd() ^ ((1318745718 ^ 2041054382) ^ (-926041041))));
                                    short sXd5 = (short) (C1499aX.Xd() ^ ((615285138 ^ 1154960020) ^ (-1618727630)));
                                    int[] iArr4 = new int["@4".length()];
                                    QB qb4 = new QB("@4");
                                    int i5 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i5] = xuXd4.fK(sXd5 + sXd5 + i5 + xuXd4.CK(iKK4));
                                        i5++;
                                    }
                                    String str2 = new String(iArr4, 0, i5);
                                    try {
                                        Class<?> cls5 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls5.getField(str2) : cls5.getDeclaredField(str2);
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
                    String strKd2 = C1561oA.Kd("eT\u001c[A", (short) (Od.Xd() ^ ((803103686 ^ 703401777) ^ (-104016705))));
                    short sXd6 = (short) (FB.Xd() ^ (506314263 ^ 506310011));
                    short sXd7 = (short) (FB.Xd() ^ ((1936999343 ^ 1381957627) ^ 556465856));
                    int[] iArr5 = new int["\u0016G".length()];
                    QB qb5 = new QB("\u0016G");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK(((i6 * sXd7) ^ sXd6) + xuXd5.CK(iKK5));
                        i6++;
                    }
                    String str3 = new String(iArr5, 0, i6);
                    try {
                        Class<?> cls6 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls6.getField(str3) : cls6.getDeclaredField(str3);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("\u0007u=|b", (short) (FB.Xd() ^ ((1095874272 ^ 567719856) ^ 1619481844)));
                        String strVd = Wg.vd("bV", (short) (C1499aX.Xd() ^ (1537991301 ^ (-1537994529))));
                        try {
                            Class<?> cls7 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls7.getField(strVd) : cls7.getDeclaredField(strVd);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i7 = 1789078935 ^ 1789079004;
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        int i2 = 2 % 2;
        int i3 = f17822s + 51;
        f17821r = i3 % 128;
        if (i3 % 2 != 0) {
            LayoutUtils.equalizeWidths(this.f17826e.f6841d, this.f17826e.f6842e);
        } else {
            LayoutUtils.equalizeWidths(this.f17826e.f6841d, this.f17826e.f6842e);
        }
        LayoutUtils.setFixedWidth(this.f17826e.f6842e);
        int i4 = f17821r + 75;
        f17822s = i4 % 128;
        int i5 = i4 % 2;
    }

    private /* synthetic */ void e(View view) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17821r + 115;
        f17822s = i3 % 128;
        int i4 = i3 % 2;
        d();
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f17821r + 101;
        f17822s = i5 % 128;
        int i6 = i5 % 2;
    }

    private /* synthetic */ void d(View view) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17821r + 19;
        f17822s = i3 % 128;
        int i4 = i3 % 2;
        a();
        if (i4 == 0) {
            int i5 = 74 / 0;
        }
        int i6 = f17821r + 37;
        f17822s = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 13 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        af afVarC = af.c(getLayoutInflater());
        this.f17826e = afVarC;
        setContentView(afVarC.b());
        DaggerTutorialFrontComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.getInstance().getIncodeWelcomeRepositoryComponent()).tutorialPresenterModule(new TutorialPresenterModule(this)).build().inject(this);
        this.f17826e.f6841d.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialFrontActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        });
        this.f17827f = (IdCategory) getIntent().getSerializableExtra("extraIdCategory");
        this.f17830i = getIntent().getBooleanExtra("extraEnableFrontShownAsBackCheck", false);
        this.f17831j = getIntent().getBooleanExtra("extraEnableBackShownAsFrontCheck", false);
        this.f17828g = (IdScan.AutocaptureUXMode) getIntent().getParcelableExtra("extraAutoCaptureUXMode");
        this.f17836o = (IdScan.ScanStep) getIntent().getSerializableExtra("extraScanStep");
        this.f17832k = getIntent().getBooleanExtra("showIdOverlay", false);
        this.f17833l = getIntent().getIntExtra("extraAutoCaptureTimeout", 25);
        this.f17834m = getIntent().getIntExtra("extraAutoCaptureNoIdTimeout", 60);
        this.f17835n = getIntent().getIntExtra("extraCaptureAttempts", 3);
        this.f17839t = getIntent().getBooleanExtra("extraStreamAudioEnabled", false);
        this.f17838q = getIntent().getBooleanExtra("extraAgeAssuranceUxEnabled", false);
        EventUtils.sendTutorialShownEvent(getRepo(), this, this.f17827f);
        this.f17825d = new TutorialFrontAdapter(getSupportFragmentManager(), this.f17838q);
        this.f17826e.f6839b.setAdapter(this.f17825d);
        this.f17826e.f6839b.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialFrontActivity.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f17840b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f17841d = 1;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i3, float f2, int i4) {
                int i5 = 2 % 2;
                int i6 = f17841d + 3;
                f17840b = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 0;
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i3) {
                Callback.onPageSelected_enter(i3);
                try {
                    int i4 = 2 % 2;
                    int i5 = f17841d + 27;
                    f17840b = i5 % 128;
                    int i6 = i5 % 2;
                    if (i3 != TutorialFrontActivity.this.f17825d.getCount() - 1) {
                        TutorialFrontActivity.this.f17826e.f6842e.setText(R.string.onboard_sdk_btn_next);
                        return;
                    }
                    int i7 = f17840b + 19;
                    f17841d = i7 % 128;
                    if (i7 % 2 != 0) {
                        TutorialFrontActivity.this.f17826e.f6842e.setText(R.string.onboard_sdk_btn_start);
                        return;
                    }
                    TutorialFrontActivity.this.f17826e.f6842e.setText(R.string.onboard_sdk_btn_start);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } finally {
                    Callback.onPageSelected_exit();
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i3) {
                int i4 = 2 % 2;
                int i5 = f17840b + 89;
                f17841d = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        Class<? extends BaseValidationActivity> cls = (Class) getIntent().getSerializableExtra("extraValidationClass");
        this.f17824c = cls;
        if (cls == null) {
            int i3 = f17822s + 9;
            f17821r = i3 % 128;
            int i4 = i3 % 2;
            this.f17824c = ValidationActivity.class;
        }
        this.f17829h = (ValidationPhase) getIntent().getSerializableExtra("extraIdValidationPhase");
        this.f17826e.f6841d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialFrontActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialFrontActivity.m8579instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        this.f17826e.f6842e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialFrontActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialFrontActivity.m8580instrumented$2$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        int i5 = f17821r + 53;
        f17822s = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        int i2 = 2 % 2;
        int i3 = f17821r + 45;
        f17822s = i3 % 128;
        int i4 = i3 % 2;
        super.onStart();
        if (this.f17837p) {
            return;
        }
        int i5 = f17822s + 19;
        f17821r = i5 % 128;
        int i6 = i5 % 2;
        this.f17837p = true;
        talkBackAccessibilityText(R.string.onboard_sdk_tutorial_front_voice_over);
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f17821r + 101;
        f17822s = i3 % 128;
        int i4 = i3 % 2;
        if (this.f17827f != IdCategory.FIRST) {
            ScreenName screenName = ScreenName.TUTORIAL_FRONT_SECOND_ID;
            int i5 = f17822s + 9;
            f17821r = i5 % 128;
            int i6 = i5 % 2;
            return screenName;
        }
        ScreenName screenName2 = ScreenName.FRONT_ID_CAPTURE_TUTORIAL;
        int i7 = f17822s + 87;
        f17821r = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 69 / 0;
        }
        return screenName2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f17821r + 43;
        f17822s = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = Modules.ID;
        if (i4 == 0) {
            int i5 = 89 / 0;
        }
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public boolean isDelayedOnboardingSupported() {
        int i2 = 2 % 2;
        int i3 = f17821r + 121;
        int i4 = i3 % 128;
        f17822s = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 105;
        f17821r = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private void a() throws Exception {
        int i2 = 2 % 2;
        int currentItem = this.f17826e.f6839b.getCurrentItem();
        if (currentItem != this.f17825d.getCount() - 1) {
            this.f17826e.f6839b.setCurrentItem(currentItem + 1);
            int i3 = f17821r + 71;
            f17822s = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i4 = f17822s + 47;
        f17821r = i4 % 128;
        int i5 = i4 % 2;
        b(true);
        EventUtils.sendContinueEvent(getRepo(), this);
    }

    private void d() throws Exception {
        int i2 = 2 % 2;
        int i3 = f17821r + 19;
        f17822s = i3 % 128;
        int i4 = i3 % 2;
        b(true);
        EventUtils.sendContinueEvent(getRepo(), this);
        int i5 = f17822s + 19;
        f17821r = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(DialogInterface dialogInterface, int i2) throws Exception {
        int i3 = 2 % 2;
        int i4 = f17821r + 93;
        f17822s = i4 % 128;
        if (i4 % 2 == 0) {
            b(true);
        } else {
            b(false);
        }
        int i5 = f17822s + 71;
        f17821r = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f17821r + 113;
        f17822s = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            int currentItem = this.f17826e.f6839b.getCurrentItem();
            if (currentItem == 0) {
                handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialFrontActivity$$ExternalSyntheticLambda0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) throws Exception {
                        this.f$0.d(dialogInterface, i4);
                    }
                });
                int i4 = f17821r + 97;
                f17822s = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.f17826e.f6839b.setCurrentItem(currentItem - 1);
            return;
        }
        this.f17826e.f6839b.getCurrentItem();
        throw null;
    }

    private void b(boolean z2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17821r + 123;
        f17822s = i3 % 128;
        int i4 = i3 % 2;
        b();
        if (!z2) {
            this.f17823b.submitCancelledResult();
            return;
        }
        Intent intent = new Intent(this, this.f17824c);
        ValidationPhase validationPhase = this.f17829h;
        if (validationPhase != null) {
            int i5 = f17822s + 7;
            f17821r = i5 % 128;
            if (i5 % 2 != 0) {
                intent.putExtra("extraIdValidationPhase", validationPhase);
                int i6 = 43 / 0;
            } else {
                intent.putExtra("extraIdValidationPhase", validationPhase);
            }
        }
        intent.putExtra("extraIdCategory", this.f17827f);
        intent.putExtra("extraEnableFrontShownAsBackCheck", this.f17830i);
        intent.putExtra("extraEnableBackShownAsFrontCheck", this.f17831j);
        intent.putExtra("extraAutoCaptureUXMode", this.f17828g);
        intent.putExtra("extraScanStep", this.f17836o);
        intent.putExtra("showIdOverlay", this.f17832k);
        intent.putExtra("extraAutoCaptureTimeout", this.f17833l);
        intent.putExtra("extraAutoCaptureNoIdTimeout", this.f17834m);
        intent.putExtra("extraCaptureAttempts", this.f17835n);
        intent.putExtra("extraStreamAudioEnabled", this.f17839t);
        intent.putExtra("extraAgeAssuranceUxEnabled", this.f17838q);
        CX.ud();
        startActivity(intent);
        finish();
        int i7 = f17821r + 117;
        f17822s = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void b() {
        int i2 = 2 % 2;
        int i3 = f17822s + 79;
        f17821r = i3 % 128;
        if (i3 % 2 != 0) {
            this.f17826e.f6842e.setEnabled(true);
        } else {
            this.f17826e.f6842e.setEnabled(false);
        }
        this.f17826e.f6841d.setEnabled(false);
        int i4 = f17822s + 77;
        f17821r = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
