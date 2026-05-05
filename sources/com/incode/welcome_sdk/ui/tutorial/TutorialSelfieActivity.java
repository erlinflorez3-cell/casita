package com.incode.welcome_sdk.ui.tutorial;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.ui.IncodeLottieAnimationView;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.d.ah;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity;
import com.incode.welcome_sdk.ui.tutorial.TutorialSelfieContract;
import com.incode.welcome_sdk.views.IncodeButton;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialSelfieActivity extends BaseActivity implements TutorialSelfieContract.View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f17886f = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f17887i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Inject
    public TutorialSelfiePresenter f17888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Animation f17889c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ah f17891e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17893h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SelfieActivity.SelfieScanModeExtended f17894j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BaseActivity.Config f17890d = BaseActivity.Config.copy$default(super.getConfig(), true, false, false, false, null, 30, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScreenName f17892g = ScreenName.SELFIE_CAPTURE_TUTORIAL;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8584instrumented$1$safeOnCreate$LandroidosBundleV(TutorialSelfieActivity tutorialSelfieActivity, View view) {
        Callback.onClick_enter(view);
        try {
            d(tutorialSelfieActivity, view);
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
            short sXd = (short) (C1499aX.Xd() ^ (1404244340 ^ (-1404259329)));
            short sXd2 = (short) (C1499aX.Xd() ^ (1656475119 ^ (-1656481664)));
            int[] iArr = new int["<)n,\u0010".length()];
            QB qb = new QB("<)n,\u0010");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strVd = hg.Vd("~k", (short) (C1633zX.Xd() ^ ((1836088577 ^ 696345639) ^ (-1156670740))), (short) (C1633zX.Xd() ^ (1548218774 ^ (-1548191363))));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("gT\u001aW;", (short) (C1580rY.Xd() ^ (283144410 ^ (-283122780))));
                short sXd3 = (short) (Od.Xd() ^ ((1139178707 ^ 1311277671) ^ (-231655831)));
                int[] iArr2 = new int[":(".length()];
                QB qb2 = new QB(":(");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(str2) : cls2.getDeclaredField(str2);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd = C1561oA.Yd("+\u001aa!\u0007", (short) (OY.Xd() ^ (561709723 ^ 561719894)));
                    String strQd = Xg.qd("-#", (short) (Od.Xd() ^ (1146069665 ^ (-1146068398))), (short) (Od.Xd() ^ ((1753106526 ^ 692568094) ^ (-1094293746))));
                    try {
                        Class<?> cls3 = Class.forName(strYd);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Class<?> cls4 = Class.forName(Jg.Wd("\\I\u0015\u001ei", (short) (FB.Xd() ^ ((1646546562 ^ 1438542143) ^ 932847291)), (short) (FB.Xd() ^ (1298260266 ^ 1298242422))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd4 = (short) (C1607wl.Xd() ^ ((199869771 ^ 68681321) ^ 268320616));
                        short sXd5 = (short) (C1607wl.Xd() ^ (2067822085 ^ 2067812221));
                        int[] iArr3 = new int["\u0018M".length()];
                        QB qb3 = new QB("\u0018M");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                            i4++;
                        }
                        Method declaredMethod = cls4.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd6 = (short) (Od.Xd() ^ (1998239535 ^ (-1998235079)));
                                short sXd7 = (short) (Od.Xd() ^ (1440870217 ^ (-1440843509)));
                                int[] iArr4 = new int["\t30$\tO".length()];
                                QB qb4 = new QB("\t30$\tO");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i5 * sXd7))) + xuXd4.CK(iKK4));
                                    i5++;
                                }
                                String str3 = new String(iArr4, 0, i5);
                                short sXd8 = (short) (Od.Xd() ^ ((39588511 ^ 486460834) ^ (-513985943)));
                                int[] iArr5 = new int["V=?g;W@xN\r\f6WT\rN:R\u0018(Y3W".length()];
                                QB qb5 = new QB("V=?g;W@xN\r\f6WT\rN:R\u0018(Y3W");
                                int i6 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd8 + i6)));
                                    i6++;
                                }
                                Object[] objArr2 = {str3};
                                Method method = Class.forName(new String(iArr5, 0, i6)).getMethod(C1561oA.Qd("# .\f1**\u001a!\u0006\u0017#&\u0018\u0011\u0012", (short) (C1580rY.Xd() ^ (1575595887 ^ (-1575611375)))), Class.forName(EO.Od(",[R\u001e25Nc/J\u0006\r9\"'\u0007", (short) (OY.Xd() ^ (1993905589 ^ 1993900222)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd9 = (short) (C1499aX.Xd() ^ ((499587564 ^ 1004430960) ^ (-639203213)));
                                    short sXd10 = (short) (C1499aX.Xd() ^ ((423803807 ^ 1918605970) ^ (-1796807437)));
                                    int[] iArr6 = new int["*\u0019` \u0006".length()];
                                    QB qb6 = new QB("*\u0019` \u0006");
                                    int i7 = 0;
                                    while (qb6.YK()) {
                                        int iKK6 = qb6.KK();
                                        Xu xuXd6 = Xu.Xd(iKK6);
                                        iArr6[i7] = xuXd6.fK((xuXd6.CK(iKK6) - (sXd9 + i7)) - sXd10);
                                        i7++;
                                    }
                                    String str4 = new String(iArr6, 0, i7);
                                    short sXd11 = (short) (C1633zX.Xd() ^ (2057007220 ^ (-2057010325)));
                                    int[] iArr7 = new int["!\u0015".length()];
                                    QB qb7 = new QB("!\u0015");
                                    int i8 = 0;
                                    while (qb7.YK()) {
                                        int iKK7 = qb7.KK();
                                        Xu xuXd7 = Xu.Xd(iKK7);
                                        iArr7[i8] = xuXd7.fK(sXd11 + sXd11 + i8 + xuXd7.CK(iKK7));
                                        i8++;
                                    }
                                    String str5 = new String(iArr7, 0, i8);
                                    try {
                                        Class<?> cls5 = Class.forName(str4);
                                        Field field4 = 0 != 0 ? cls5.getField(str5) : cls5.getDeclaredField(str5);
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
                    short sXd12 = (short) (Od.Xd() ^ (540021305 ^ (-540043785)));
                    int[] iArr8 = new int["~m5tZ".length()];
                    QB qb8 = new QB("~m5tZ");
                    int i9 = 0;
                    while (qb8.YK()) {
                        int iKK8 = qb8.KK();
                        Xu xuXd8 = Xu.Xd(iKK8);
                        iArr8[i9] = xuXd8.fK(xuXd8.CK(iKK8) - ((sXd12 + sXd12) + i9));
                        i9++;
                    }
                    String str6 = new String(iArr8, 0, i9);
                    String strZd = Wg.Zd(">0", (short) (C1580rY.Xd() ^ (1944680429 ^ (-1944669989))), (short) (C1580rY.Xd() ^ ((823732318 ^ 1203839747) ^ (-1993899138))));
                    try {
                        Class<?> cls6 = Class.forName(str6);
                        Field field5 = 0 != 0 ? cls6.getField(strZd) : cls6.getDeclaredField(strZd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        short sXd13 = (short) (C1499aX.Xd() ^ (139002718 ^ (-139014311)));
                        int[] iArr9 = new int["\u0010~F\u0006k".length()];
                        QB qb9 = new QB("\u0010~F\u0006k");
                        int i10 = 0;
                        while (qb9.YK()) {
                            int iKK9 = qb9.KK();
                            Xu xuXd9 = Xu.Xd(iKK9);
                            iArr9[i10] = xuXd9.fK(xuXd9.CK(iKK9) - (sXd13 + i10));
                            i10++;
                        }
                        String str7 = new String(iArr9, 0, i10);
                        short sXd14 = (short) (FB.Xd() ^ (263174892 ^ 263167157));
                        int[] iArr10 = new int["qe".length()];
                        QB qb10 = new QB("qe");
                        int i11 = 0;
                        while (qb10.YK()) {
                            int iKK10 = qb10.KK();
                            Xu xuXd10 = Xu.Xd(iKK10);
                            iArr10[i11] = xuXd10.fK((sXd14 ^ i11) + xuXd10.CK(iKK10));
                            i11++;
                        }
                        String str8 = new String(iArr10, 0, i11);
                        try {
                            Class<?> cls7 = Class.forName(str7);
                            Field field6 = 0 != 0 ? cls7.getField(str8) : cls7.getDeclaredField(str8);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i12 = 1316599522 ^ 1316599465;
                        if (x2 > i12 && x2 < displayMetrics.widthPixels - i12 && y2 > i12 && y2 < displayMetrics.heightPixels - i12) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final BaseActivity.Config getConfig() {
        int i2 = 2 % 2;
        int i3 = f17887i + 105;
        int i4 = i3 % 128;
        f17886f = i4;
        int i5 = i3 % 2;
        BaseActivity.Config config = this.f17890d;
        int i6 = i4 + 77;
        f17887i = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 37 / 0;
        }
        return config;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        ScreenName screenName;
        int i2 = 2 % 2;
        int i3 = f17886f + 43;
        int i4 = i3 % 128;
        f17887i = i4;
        if (i3 % 2 != 0) {
            screenName = this.f17892g;
            int i5 = 6 / 0;
        } else {
            screenName = this.f17892g;
        }
        int i6 = i4 + 99;
        f17886f = i6 % 128;
        if (i6 % 2 != 0) {
            return screenName;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f17886f;
        int i5 = i4 + 55;
        f17887i = i5 % 128;
        int i6 = i5 % 2;
        SelfieActivity.SelfieScanModeExtended selfieScanModeExtended = this.f17894j;
        if (selfieScanModeExtended == null) {
            int i7 = i4 + 11;
            int i8 = i7 % 128;
            f17887i = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 65;
            f17886f = i10 % 128;
            int i11 = i10 % 2;
            i2 = -1;
        } else {
            i2 = WhenMappings.f17897c[selfieScanModeExtended.ordinal()];
        }
        if (i2 == 1) {
            return Modules.AUTHENTICATION;
        }
        return Modules.SELFIE;
    }

    public final TutorialSelfiePresenter getPresenter() {
        int i2 = 2 % 2;
        int i3 = f17886f;
        int i4 = i3 + 27;
        f17887i = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        TutorialSelfiePresenter tutorialSelfiePresenter = this.f17888b;
        if (tutorialSelfiePresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17887i = i5 % 128;
        int i6 = i5 % 2;
        return tutorialSelfiePresenter;
    }

    public final void setPresenter(TutorialSelfiePresenter tutorialSelfiePresenter) {
        int i2 = 2 % 2;
        int i3 = f17886f + 81;
        f17887i = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tutorialSelfiePresenter, "");
            this.f17888b = tutorialSelfiePresenter;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tutorialSelfiePresenter, "");
        this.f17888b = tutorialSelfiePresenter;
        int i4 = f17887i + 71;
        f17886f = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void d(TutorialSelfieActivity tutorialSelfieActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f17887i + 115;
        f17886f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(tutorialSelfieActivity, "");
        tutorialSelfieActivity.c();
        int i5 = f17887i + 41;
        f17886f = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f17886f + 3;
        f17887i = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnCreate(bundle);
        ah ahVarA = ah.a(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ahVarA, "");
        this.f17891e = ahVarA;
        ah ahVar = null;
        if (ahVarA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            ahVarA = null;
        }
        setContentView(ahVarA.b());
        Serializable serializableExtra = getIntent().getSerializableExtra("extraMode");
        this.f17894j = serializableExtra instanceof SelfieActivity.SelfieScanModeExtended ? (SelfieActivity.SelfieScanModeExtended) serializableExtra : null;
        EventUtils.sendTutorialShownEvent$default(getRepo(), this, null, 4, null);
        DaggerTutorialSelfieComponent.builder().tutorialSelfiePresenterModule(new TutorialSelfiePresenterModule(this)).build().inject(this);
        getPresenter().setupUI(getIntent().getBooleanExtra("extraAgeAssuranceUXEnabled", false));
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.onboard_sdk_slide_up);
        Intrinsics.checkNotNullExpressionValue(animationLoadAnimation, "");
        this.f17889c = animationLoadAnimation;
        if (!IncodeWelcome.Companion.getInstance().getInternalConfig().isWaitForSelfieTutorials()) {
            d();
        } else {
            int i5 = f17887i + 41;
            f17886f = i5 % 128;
            if (i5 % 2 != 0) {
                ah ahVar2 = this.f17891e;
                if (ahVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    ahVar2 = null;
                }
                ahVar2.f6855b.setOnLottieAnimationEndListener(new IncodeLottieAnimationView.LottieAnimationEndListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialSelfieActivity$$ExternalSyntheticLambda0
                    @Override // com.incode.welcome_sdk.commons.ui.IncodeLottieAnimationView.LottieAnimationEndListener
                    public final void onLottieAnimationEnd() {
                        this.f$0.d();
                    }
                });
            } else {
                ahVar.hashCode();
                throw null;
            }
        }
        ah ahVar3 = this.f17891e;
        if (ahVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            ahVar = ahVar3;
        }
        ahVar.f6857d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialSelfieActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialSelfieActivity.m8584instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onStart() {
        int i2 = 2 % 2;
        int i3 = f17886f + 81;
        f17887i = i3 % 128;
        int i4 = i3 % 2;
        super.onStart();
        if (this.f17893h) {
            return;
        }
        int i5 = f17887i + 45;
        f17886f = i5 % 128;
        int i6 = i5 % 2;
        this.f17893h = true;
        talkBackAccessibilityText(R.string.onboard_sdk_tutorial_selfie_animation_content_description);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TutorialSelfieActivity tutorialSelfieActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = f17886f + 57;
        f17887i = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(tutorialSelfieActivity, "");
        tutorialSelfieActivity.d(false);
        int i6 = f17887i + 73;
        f17886f = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 53 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f17886f + 65;
        f17887i = i3 % 128;
        int i4 = i3 % 2;
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialSelfieActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                TutorialSelfieActivity.a(this.f$0, dialogInterface, i5);
            }
        });
        int i5 = f17887i + 109;
        f17886f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final boolean isDelayedOnboardingSupported() {
        int i2 = 2 % 2;
        int i3 = f17887i + 63;
        f17886f = i3 % 128;
        return i3 % 2 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        int i2 = 2 % 2;
        int i3 = f17886f + 57;
        f17887i = i3 % 128;
        int i4 = i3 % 2;
        ah ahVar = this.f17891e;
        ah ahVar2 = null;
        if (ahVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            ahVar = null;
        }
        if (ahVar.f6857d.getVisibility() != 0) {
            ah ahVar3 = this.f17891e;
            if (ahVar3 == null) {
                int i5 = f17886f + 63;
                f17887i = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                ahVar3 = null;
            }
            IncodeButton incodeButton = ahVar3.f6857d;
            Animation animation = this.f17889c;
            if (animation == null) {
                int i7 = f17887i + 19;
                f17886f = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                animation = null;
            }
            incodeButton.startAnimation(animation);
            ah ahVar4 = this.f17891e;
            if (ahVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                ahVar2 = ahVar4;
            }
            ahVar2.f6857d.setVisibility(0);
        }
    }

    private final void c() {
        int i2 = 2 % 2;
        ah ahVar = this.f17891e;
        if (ahVar == null) {
            int i3 = f17886f + 15;
            f17887i = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 90 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ahVar = null;
        }
        ahVar.f6857d.setEnabled(false);
        EventUtils.sendContinueEvent(getRepo(), this);
        d(true);
        int i5 = f17886f + 55;
        f17887i = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.tutorial.TutorialSelfieContract.View
    public final void showAgeAssuranceUI() {
        int i2 = 2 % 2;
        int i3 = f17887i + 117;
        f17886f = i3 % 128;
        ah ahVar = null;
        if (i3 % 2 == 0) {
            ahVar.hashCode();
            throw null;
        }
        ah ahVar2 = this.f17891e;
        if (ahVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            ahVar = ahVar2;
        }
        ahVar.f6859f.setText(R.string.onboard_sdk_age_verification_selfie_title);
        ahVar.f6854a.setText(R.string.onboard_sdk_age_verification_selfie_subtitle);
        ahVar.f6858e.setVisibility(0);
        ahVar.f6856c.setVisibility(0);
        ahVar.f6857d.setText(R.string.onboard_sdk_btn_start);
        int i4 = f17886f + 59;
        f17887i = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.tutorial.TutorialSelfieContract.View
    public final void showTutorialUI() {
        int i2 = 2 % 2;
        int i3 = f17886f + 97;
        f17887i = i3 % 128;
        ah ahVar = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        ah ahVar2 = this.f17891e;
        if (ahVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            ahVar = ahVar2;
        }
        ahVar.f6859f.setText(R.string.onboard_sdk_tutorial_selfie_title);
        ahVar.f6854a.setText(R.string.onboard_sdk_tutorial_selfie_subtitle);
        ahVar.f6858e.setVisibility(8);
        ahVar.f6856c.setVisibility(8);
        ahVar.f6857d.setText(R.string.onboard_sdk_btn_continue);
        int i4 = f17886f + 9;
        f17887i = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void d(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17887i + 59;
        f17886f = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome.Companion.getInstance().getSelfieTipsBus().onNext(Boolean.valueOf(z2));
        finish();
        int i5 = f17887i + 29;
        f17886f = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17895a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17896b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f17897c;

        static {
            int[] iArr = new int[SelfieActivity.SelfieScanModeExtended.valuesCustom().length];
            try {
                iArr[SelfieActivity.SelfieScanModeExtended.FACE_AUTHENTICATION.ordinal()] = 1;
                int i2 = f17896b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f17895a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            f17897c = iArr;
            int i5 = f17895a + 101;
            f17896b = i5 % 128;
            int i6 = i5 % 2;
        }
    }
}
