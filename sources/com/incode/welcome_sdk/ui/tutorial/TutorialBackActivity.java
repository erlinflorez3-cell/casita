package com.incode.welcome_sdk.ui.tutorial;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.ui.IncodeLottieAnimationView;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.d.ab;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase;
import com.incode.welcome_sdk.ui.tutorial.TutorialContract;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
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

/* JADX INFO: loaded from: classes5.dex */
public class TutorialBackActivity extends BaseActivity implements TutorialContract.View {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f17771q = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f17772t = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Inject
    TutorialBackPresenter f17773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ab f17774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animation f17775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IdCategory f17776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ValidationPhase f17777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IdScan.AutocaptureUXMode f17779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Class<? extends BaseValidationActivity> f17781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17782k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17784m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IdScan.ScanStep f17785n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f17786o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f17787p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f17788r = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8572instrumented$1$safeOnCreate$LandroidosBundleV(TutorialBackActivity tutorialBackActivity, View view) {
        Callback.onClick_enter(view);
        try {
            tutorialBackActivity.e(view);
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
            String strKd = Qg.kd("/\u001ca\u001f\u0003", (short) (ZN.Xd() ^ ((54063627 ^ 702108480) ^ 719444976)), (short) (ZN.Xd() ^ (628172872 ^ 628185300)));
            short sXd = (short) (C1499aX.Xd() ^ ((1266982585 ^ 2050007433) ^ (-833886417)));
            short sXd2 = (short) (C1499aX.Xd() ^ (1104525429 ^ (-1104522766)));
            int[] iArr = new int["1\u001e".length()];
            QB qb = new QB("1\u001e");
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
                String strUd = C1561oA.ud("\u0014\u0001F\u0004g", (short) (OY.Xd() ^ ((2019157119 ^ 464523295) ^ 1676267907)));
                String strYd = C1561oA.yd("0\u001c", (short) (ZN.Xd() ^ ((522893194 ^ 1478019373) ^ 1194465360)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("\u000byA\u0001f", (short) (ZN.Xd() ^ (1387709470 ^ 1387692752)));
                    String strQd = Xg.qd("\u0013\t", (short) (Od.Xd() ^ ((1982203264 ^ 1153427851) ^ (-848940626))), (short) (Od.Xd() ^ (1054414044 ^ (-1054440875))));
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
                        Method declaredMethod = Class.forName(Jg.Wd("&-\u0007l`", (short) (OY.Xd() ^ ((1557095091 ^ 1279841976) ^ 277318495)), (short) (OY.Xd() ^ ((901961449 ^ 1417984966) ^ 1631999437)))).getDeclaredMethod(ZO.xd("Pb", (short) (OY.Xd() ^ (696079293 ^ 696074897)), (short) (OY.Xd() ^ (178088069 ^ 178067154))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("\rl\u001eL(j", (short) (Od.Xd() ^ ((1664173108 ^ 281772144) ^ (-1945807050))), (short) (Od.Xd() ^ ((1301579642 ^ 240265669) ^ (-1137088959))))};
                                Method method = Class.forName(Ig.wd("\u0012Nv\u001cy\u001f>/\u001e\u0006\u0003n\u0015\u0018Ji\"X\u000f|\u0017q[", (short) (C1499aX.Xd() ^ (1679651361 ^ (-1679637743))))).getMethod(C1561oA.Qd("'$2\u00105..\u001e%\n\u001b'*\u001c\u0015\u0016", (short) (Od.Xd() ^ ((1723642007 ^ 1911756364) ^ (-391107549)))), Class.forName(EO.Od("b\nCO}\u0002\\;\b[\u0019b\u0010z\u001e>", (short) (Od.Xd() ^ (914407830 ^ (-914395696))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("P?\u0007F,", (short) (C1633zX.Xd() ^ ((930431355 ^ 951132183) ^ (-264513986))), (short) (C1633zX.Xd() ^ ((1179464869 ^ 1813367195) ^ (-710473092))));
                                    String strOd = C1561oA.od("nb", (short) (C1633zX.Xd() ^ (1559221821 ^ (-1559219401))));
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
                    String strKd2 = C1561oA.Kd("_N\u0016U;", (short) (FB.Xd() ^ ((1593002078 ^ 898447064) ^ 1803449756)));
                    String strZd2 = Wg.Zd("\n/", (short) (FB.Xd() ^ (1478540442 ^ 1478547686)), (short) (FB.Xd() ^ ((1778087060 ^ 910065152) ^ 1606750431)));
                    try {
                        Class<?> cls5 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls5.getField(strZd2) : cls5.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("{j2qW", (short) (C1499aX.Xd() ^ ((403139094 ^ 1994890644) ^ (-1860208833))));
                        String strVd = Wg.vd("'\u001d", (short) (C1499aX.Xd() ^ (400198892 ^ (-400206523))));
                        try {
                            Class<?> cls6 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls6.getField(strVd) : cls6.getDeclaredField(strVd);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i3 = (728584593 ^ 468500645) ^ 813797759;
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

    private /* synthetic */ void e(View view) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17772t + 123;
        f17771q = i3 % 128;
        int i4 = i3 % 2;
        e();
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        ab abVarD = ab.d(getLayoutInflater());
        this.f17774c = abVarD;
        setContentView(abVarD.a());
        DaggerTutorialBackComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.getInstance().getIncodeWelcomeRepositoryComponent()).tutorialPresenterModule(new TutorialPresenterModule(this)).build().inject(this);
        this.f17776e = (IdCategory) getIntent().getSerializableExtra("extraIdCategory");
        this.f17778g = getIntent().getBooleanExtra("extraEnableFrontShownAsBackCheck", false);
        this.f17780i = getIntent().getBooleanExtra("extraEnableBackShownAsFrontCheck", false);
        this.f17781j = (Class) getIntent().getSerializableExtra("extraValidationClass");
        this.f17779h = (IdScan.AutocaptureUXMode) getIntent().getParcelableExtra("extraAutoCaptureUXMode");
        this.f17785n = (IdScan.ScanStep) getIntent().getSerializableExtra("extraScanStep");
        this.f17782k = getIntent().getIntExtra("extraAutoCaptureTimeout", 25);
        this.f17784m = getIntent().getIntExtra("extraAutoCaptureNoIdTimeout", 60);
        this.f17783l = getIntent().getIntExtra("extraCaptureAttempts", 3);
        this.f17786o = getIntent().getBooleanExtra("extraStreamAudioEnabled", false);
        this.f17787p = getIntent().getBooleanExtra("extraAgeAssuranceUxEnabled", false);
        Object obj = null;
        if (this.f17781j == null) {
            int i3 = f17772t + 93;
            f17771q = i3 % 128;
            if (i3 % 2 == 0) {
                this.f17781j = ValidationActivity.class;
                obj.hashCode();
                throw null;
            }
            this.f17781j = ValidationActivity.class;
        }
        this.f17777f = (ValidationPhase) getIntent().getSerializableExtra("extraIdValidationPhase");
        EventUtils.sendTutorialShownEvent(getRepo(), this, this.f17776e);
        String string = getString(R.string.onboard_sdk_tutorial_back_title_highlighted_part);
        String string2 = getString(R.string.onboard_sdk_tutorial_back_title);
        int iIndexOf = string2.indexOf(string);
        int length = string.length();
        SpannableString spannableString = new SpannableString(string2);
        if (iIndexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.onboard_sdk_colorPrimary)), iIndexOf, length + iIndexOf, 33);
        }
        this.f17774c.f6795d.setText(spannableString);
        this.f17775d = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.onboard_sdk_slide_up);
        if (IncodeWelcome.getInstance().getInternalConfig().isWaitForIdTutorials()) {
            this.f17774c.f6796e.setOnLottieAnimationEndListener(new IncodeLottieAnimationView.LottieAnimationEndListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialBackActivity$$ExternalSyntheticLambda0
                @Override // com.incode.welcome_sdk.commons.ui.IncodeLottieAnimationView.LottieAnimationEndListener
                public final void onLottieAnimationEnd() {
                    this.f$0.d();
                }
            });
        } else {
            d();
            int i4 = f17772t + 21;
            f17771q = i4 % 128;
            int i5 = i4 % 2;
        }
        this.f17774c.f6794c.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialBackActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialBackActivity.m8572instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        int i6 = f17771q + 105;
        f17772t = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        int i2 = 2 % 2;
        int i3 = f17771q + 123;
        f17772t = i3 % 128;
        if (i3 % 2 == 0) {
            super.onStart();
            if (!this.f17788r) {
                this.f17788r = true;
                talkBackAccessibilityText(R.string.onboard_sdk_tutorial_back_voice_over);
            }
            int i4 = f17771q + 93;
            f17772t = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        super.onStart();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public ScreenName getScreenName() {
        int i2 = 2 % 2;
        if (this.f17776e != IdCategory.FIRST) {
            ScreenName screenName = ScreenName.TUTORIAL_BACK_SECOND_ID;
            int i3 = f17772t + 61;
            f17771q = i3 % 128;
            int i4 = i3 % 2;
            return screenName;
        }
        ScreenName screenName2 = ScreenName.BACK_ID_CAPTURE_TUTORIAL;
        int i5 = f17772t + 41;
        f17771q = i5 % 128;
        if (i5 % 2 != 0) {
            return screenName2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f17771q + 19;
        f17772t = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = Modules.ID;
        int i5 = f17772t + 105;
        f17771q = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public boolean isDelayedOnboardingSupported() {
        int i2 = 2 % 2;
        int i3 = f17772t + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f17771q = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 39;
        f17772t = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int i2 = 2 % 2;
        if (ViewKt.isVisible(this.f17774c.f6794c)) {
            return;
        }
        int i3 = f17771q + 33;
        f17772t = i3 % 128;
        int i4 = i3 % 2;
        this.f17774c.f6794c.startAnimation(this.f17775d);
        this.f17774c.f6794c.setVisibility(0);
        int i5 = f17772t + 93;
        f17771q = i5 % 128;
        int i6 = i5 % 2;
    }

    private void e() throws Exception {
        int i2 = 2 % 2;
        int i3 = f17772t + 51;
        f17771q = i3 % 128;
        int i4 = i3 % 2;
        a(true);
        EventUtils.sendContinueEvent(getRepo(), this);
        int i5 = f17771q + 95;
        f17772t = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i2) throws Exception {
        int i3 = 2 % 2;
        int i4 = f17772t + 109;
        f17771q = i4 % 128;
        a(i4 % 2 == 0);
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f17771q + 11;
        f17772t = i3 % 128;
        int i4 = i3 % 2;
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialBackActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) throws Exception {
                this.f$0.c(dialogInterface, i5);
            }
        });
        int i5 = f17772t + 17;
        f17771q = i5 % 128;
        int i6 = i5 % 2;
    }

    private void a(boolean z2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17772t + 45;
        f17771q = i3 % 128;
        if (i3 % 2 != 0) {
            a();
            if (z2) {
                Intent intent = new Intent(this, this.f17781j);
                ValidationPhase validationPhase = this.f17777f;
                if (validationPhase != null) {
                    int i4 = f17771q + 47;
                    f17772t = i4 % 128;
                    if (i4 % 2 != 0) {
                        intent.putExtra("extraIdValidationPhase", validationPhase);
                        int i5 = 25 / 0;
                    } else {
                        intent.putExtra("extraIdValidationPhase", validationPhase);
                    }
                }
                intent.putExtra("extraIdCategory", this.f17776e);
                intent.putExtra("extraEnableFrontShownAsBackCheck", this.f17778g);
                intent.putExtra("extraEnableBackShownAsFrontCheck", this.f17780i);
                intent.putExtra("extraAutoCaptureUXMode", this.f17779h);
                intent.putExtra("extraScanStep", this.f17785n);
                intent.putExtra("extraAutoCaptureTimeout", this.f17782k);
                intent.putExtra("extraAutoCaptureNoIdTimeout", this.f17784m);
                intent.putExtra("extraCaptureAttempts", this.f17783l);
                intent.putExtra("extraStreamAudioEnabled", this.f17786o);
                intent.putExtra("extraAgeAssuranceUxEnabled", this.f17787p);
                CX.ud();
                startActivity(intent);
                finish();
                return;
            }
            this.f17773b.submitCancelledResult();
            int i6 = f17771q + 29;
            f17772t = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        a();
        throw null;
    }

    private void a() {
        int i2 = 2 % 2;
        int i3 = f17771q + 101;
        f17772t = i3 % 128;
        int i4 = i3 % 2;
        this.f17774c.f6794c.setEnabled(false);
        int i5 = f17772t + 123;
        f17771q = i5 % 128;
        int i6 = i5 % 2;
    }
}
