package com.incode.welcome_sdk.ui.tutorial;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.incode.welcome_sdk.DisplayMode;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.theme.h;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.selfie.SelfieActivity;
import com.incode.welcome_sdk.ui.tutorial.view.SelfieTutorialScreenKt;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialSelfieV2Activity extends BaseActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17913d = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f17914g = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SelfieActivity.SelfieScanModeExtended f17916c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScreenName f17917e = ScreenName.SELFIE_CAPTURE_TUTORIAL;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BaseActivity.Config f17915b = BaseActivity.Config.copy$default(super.getConfig(), true, false, false, false, null, 22, null);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            short sXd = (short) (ZN.Xd() ^ (383377842 ^ 383381404));
            short sXd2 = (short) (ZN.Xd() ^ ((1601373013 ^ 460546858) ^ 1140872855));
            int[] iArr = new int["aN\u0014Q5".length()];
            QB qb = new QB("aN\u0014Q5");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strVd = hg.Vd("9&", (short) (Od.Xd() ^ ((1084269265 ^ 861247232) ^ (-1945446767))), (short) (Od.Xd() ^ (15960885 ^ (-15969215))));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("\\I\u000fL0", (short) (Od.Xd() ^ ((1002209895 ^ 1950759635) ^ (-1341826608))));
                String strYd = C1561oA.yd("\u000fz", (short) (FB.Xd() ^ (323555433 ^ 323560199)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("9(o/\u0015", (short) (Od.Xd() ^ (1089721532 ^ (-1089714464))));
                    String strQd = Xg.qd("\u0011\u0007", (short) (C1607wl.Xd() ^ ((349638848 ^ 816585429) ^ 612064975)), (short) (C1607wl.Xd() ^ ((1209173535 ^ 1233163764) ^ 26365694)));
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Class<?> cls4 = Class.forName(Jg.Wd("\u001c\nWkS", (short) (Od.Xd() ^ (74965157 ^ (-74955313))), (short) (Od.Xd() ^ (376406669 ^ (-376429698)))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd3 = (short) (C1607wl.Xd() ^ (73533746 ^ 73534862));
                        short sXd4 = (short) (C1607wl.Xd() ^ ((721674232 ^ 1805845872) ^ 1084293116));
                        int[] iArr2 = new int["m?".length()];
                        QB qb2 = new QB("m?");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                            i3++;
                        }
                        Method declaredMethod = cls4.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("@>JVk\u0013", (short) (C1633zX.Xd() ^ (1139455832 ^ (-1139466773))), (short) (C1633zX.Xd() ^ ((510643242 ^ 964589357) ^ (-655471577))))};
                                Method method = Class.forName(Ig.wd("'\u0006\f7j(\u0005\u0014\u001f@;e$-1\u000ej\u0013gc\u001a\u000bn", (short) (FB.Xd() ^ ((217857030 ^ 1895381318) ^ 2080708152)))).getMethod(C1561oA.Qd("olzX}vvfmRcord]^", (short) (FB.Xd() ^ (444941919 ^ 444940691))), Class.forName(EO.Od("\u000b2;\u007fMi|\u000b_c\t\nWZU.", (short) (C1580rY.Xd() ^ ((305735567 ^ 1164931703) ^ (-1465284328))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("\u0004r:y_", (short) (C1633zX.Xd() ^ ((958675135 ^ 487590621) ^ (-607397515))), (short) (C1633zX.Xd() ^ ((1592670668 ^ 489838641) ^ (-1138497131))));
                                    String strOd = C1561oA.od("eY", (short) (C1633zX.Xd() ^ ((104517279 ^ 1455018339) ^ (-1350792738))));
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
                    short sXd5 = (short) (C1580rY.Xd() ^ (1834035084 ^ (-1834041864)));
                    int[] iArr3 = new int["m\\$cI".length()];
                    QB qb3 = new QB("m\\$cI");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd5 + sXd5) + i4));
                        i4++;
                    }
                    String str2 = new String(iArr3, 0, i4);
                    short sXd6 = (short) (FB.Xd() ^ ((149874286 ^ 1923210171) ^ 2052029705));
                    short sXd7 = (short) (FB.Xd() ^ ((1650918361 ^ 503634238) ^ 2086920196));
                    int[] iArr4 = new int[" /".length()];
                    QB qb4 = new QB(" /");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(((i5 * sXd7) ^ sXd6) + xuXd4.CK(iKK4));
                        i5++;
                    }
                    String str3 = new String(iArr4, 0, i5);
                    try {
                        Class<?> cls6 = Class.forName(str2);
                        Field field5 = 0 != 0 ? cls6.getField(str3) : cls6.getDeclaredField(str3);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        short sXd8 = (short) (C1633zX.Xd() ^ (166844704 ^ (-166833099)));
                        int[] iArr5 = new int["\u0006t<{a".length()];
                        QB qb5 = new QB("\u0006t<{a");
                        int i6 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (sXd8 + i6));
                            i6++;
                        }
                        String str4 = new String(iArr5, 0, i6);
                        short sXd9 = (short) (FB.Xd() ^ ((1321411563 ^ 1249929469) ^ 71508624));
                        int[] iArr6 = new int["-#".length()];
                        QB qb6 = new QB("-#");
                        int i7 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i7] = xuXd6.fK((sXd9 ^ i7) + xuXd6.CK(iKK6));
                            i7++;
                        }
                        String str5 = new String(iArr6, 0, i7);
                        try {
                            Class<?> cls7 = Class.forName(str4);
                            Field field6 = 0 != 0 ? cls7.getField(str5) : cls7.getDeclaredField(str5);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i8 = (180521183 ^ 520299918) ^ 365014298;
                        if (x2 > i8 && x2 < displayMetrics.widthPixels - i8 && y2 > i8 && y2 < displayMetrics.heightPixels - i8) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static final /* synthetic */ IncodeWelcome access$getIncodeWelcome(TutorialSelfieV2Activity tutorialSelfieV2Activity) {
        int i2 = 2 % 2;
        int i3 = f17914g + 53;
        f17913d = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome incodeWelcome = tutorialSelfieV2Activity.getIncodeWelcome();
        if (i4 != 0) {
            int i5 = 41 / 0;
        }
        int i6 = f17913d + 43;
        f17914g = i6 % 128;
        int i7 = i6 % 2;
        return incodeWelcome;
    }

    public static final /* synthetic */ void access$onBtnFinishTutorialClicked(TutorialSelfieV2Activity tutorialSelfieV2Activity) {
        int i2 = 2 % 2;
        int i3 = f17914g + 65;
        f17913d = i3 % 128;
        int i4 = i3 % 2;
        tutorialSelfieV2Activity.b();
        if (i4 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f17913d + 125;
        int i4 = i3 % 128;
        f17914g = i4;
        int i5 = i3 % 2;
        ScreenName screenName = this.f17917e;
        int i6 = i4 + 15;
        f17913d = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2;
        int i3 = 2 % 2;
        SelfieActivity.SelfieScanModeExtended selfieScanModeExtended = this.f17916c;
        if (selfieScanModeExtended == null) {
            i2 = -1;
        } else {
            i2 = WhenMappings.f17918a[selfieScanModeExtended.ordinal()];
            int i4 = f17913d + 33;
            f17914g = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!(i2 == 1)) {
            return Modules.SELFIE;
        }
        int i6 = f17913d + 109;
        f17914g = i6 % 128;
        if (i6 % 2 != 0) {
            return Modules.AUTHENTICATION;
        }
        Modules modules = Modules.AUTHENTICATION;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final BaseActivity.Config getConfig() {
        int i2 = 2 % 2;
        int i3 = f17913d + 39;
        int i4 = i3 % 128;
        f17914g = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BaseActivity.Config config = this.f17915b;
        int i5 = i4 + 51;
        f17913d = i5 % 128;
        int i6 = i5 % 2;
        return config;
    }

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17921b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17922e = 1;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17921b + 113;
            f17922e = i3 % 128;
            int i4 = i3 % 2;
            c(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f17922e + 19;
            f17921b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c(Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f17922e + 33;
            f17921b = i4 % 128;
            int i5 = i4 % 2;
            if ((i2 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                int i6 = f17921b + 33;
                f17922e = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1688360477, i2, -1, "com.incode.welcome_sdk.ui.tutorial.TutorialSelfieV2Activity.safeOnCreate.<anonymous> (TutorialSelfieV2Activity.kt:39)");
            }
            h hVar = h.f5694b;
            DisplayMode displayMode = DisplayMode.LIGHT;
            final TutorialSelfieV2Activity tutorialSelfieV2Activity = TutorialSelfieV2Activity.this;
            hVar.d(displayMode, ComposableLambdaKt.composableLambda(composer, -764896588, true, new Function2<Composer, Integer, Unit>() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialSelfieV2Activity.c.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f17924b = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f17925c = 0;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    int i8 = 2 % 2;
                    int i9 = f17925c + 95;
                    f17924b = i9 % 128;
                    int i10 = i9 % 2;
                    a(composer2, num.intValue());
                    Unit unit = Unit.INSTANCE;
                    int i11 = f17925c + 41;
                    f17924b = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 5 / 0;
                    }
                    return unit;
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.tutorial.TutorialSelfieV2Activity$c$2$4, reason: invalid class name */
                /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function0<Unit> {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f17927d = 0;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static int f17928e = 1;

                    private void e() {
                        int i2 = 2 % 2;
                        int i3 = f17927d + 117;
                        f17928e = i3 % 128;
                        if (i3 % 2 == 0) {
                            TutorialSelfieV2Activity.access$onBtnFinishTutorialClicked((TutorialSelfieV2Activity) this.receiver);
                            throw null;
                        }
                        TutorialSelfieV2Activity.access$onBtnFinishTutorialClicked((TutorialSelfieV2Activity) this.receiver);
                        int i4 = f17927d + 27;
                        f17928e = i4 % 128;
                        int i5 = i4 % 2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Unit invoke() {
                        int i2 = 2 % 2;
                        int i3 = f17928e + 19;
                        f17927d = i3 % 128;
                        int i4 = i3 % 2;
                        e();
                        Unit unit = Unit.INSTANCE;
                        int i5 = f17927d + 19;
                        f17928e = i5 % 128;
                        int i6 = i5 % 2;
                        return unit;
                    }

                    AnonymousClass4(Object obj) {
                        super(0, obj, TutorialSelfieV2Activity.class, "onBtnFinishTutorialClicked", "onBtnFinishTutorialClicked()V", 0);
                    }
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.tutorial.TutorialSelfieV2Activity$c$2$5, reason: invalid class name */
                /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function0<Unit> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f17929c = 0;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f17930d = 1;

                    private void a() {
                        int i2 = 2 % 2;
                        int i3 = f17929c + 55;
                        f17930d = i3 % 128;
                        int i4 = i3 % 2;
                        ((TutorialSelfieV2Activity) this.receiver).onBackButtonPressed();
                        if (i4 == 0) {
                            int i5 = 4 / 0;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Unit invoke() {
                        int i2 = 2 % 2;
                        int i3 = f17930d + 75;
                        f17929c = i3 % 128;
                        int i4 = i3 % 2;
                        a();
                        Unit unit = Unit.INSTANCE;
                        int i5 = f17930d + 87;
                        f17929c = i5 % 128;
                        if (i5 % 2 == 0) {
                            return unit;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    AnonymousClass5(Object obj) {
                        super(0, obj, TutorialSelfieV2Activity.class, "onBackButtonPressed", "onBackButtonPressed()V", 0);
                    }
                }

                private void a(Composer composer2, int i8) {
                    AnonymousClass5 anonymousClass5;
                    int i9 = 2 % 2;
                    if ((i8 & 11) == 2) {
                        int i10 = f17925c + 93;
                        f17924b = i10 % 128;
                        int i11 = i10 % 2;
                        if (composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            int i12 = f17924b + 53;
                            f17925c = i12 % 128;
                            int i13 = i12 % 2;
                            return;
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-764896588, i8, -1, "com.incode.welcome_sdk.ui.tutorial.TutorialSelfieV2Activity.safeOnCreate.<anonymous>.<anonymous> (TutorialSelfieV2Activity.kt:40)");
                    }
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(tutorialSelfieV2Activity);
                    if (tutorialSelfieV2Activity.shouldShowCloseButton()) {
                        anonymousClass5 = new AnonymousClass5(tutorialSelfieV2Activity);
                    } else {
                        int i14 = f17924b + 57;
                        f17925c = i14 % 128;
                        int i15 = i14 % 2;
                        anonymousClass5 = null;
                    }
                    SelfieTutorialScreenKt.SelfieTutorialScreen(anonymousClass4, anonymousClass5, TutorialSelfieV2Activity.access$getIncodeWelcome(tutorialSelfieV2Activity).getInternalConfig().getUxConfig().getShowFooter(), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                {
                    super(2);
                }
            }), composer, 438, 0);
            if (!(!ComposerKt.isTraceInProgress())) {
                int i8 = f17922e + 75;
                f17921b = i8 % 128;
                if (i8 % 2 == 0) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                ComposerKt.traceEventEnd();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        c() {
            super(2);
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        SelfieActivity.SelfieScanModeExtended selfieScanModeExtended;
        int i2 = 2 % 2;
        int i3 = f17913d + 89;
        f17914g = i3 % 128;
        if (i3 % 2 != 0) {
            super.safeOnCreate(bundle);
            Serializable serializableExtra = getIntent().getSerializableExtra("extraMode");
            if (serializableExtra instanceof SelfieActivity.SelfieScanModeExtended) {
                selfieScanModeExtended = (SelfieActivity.SelfieScanModeExtended) serializableExtra;
                int i4 = f17913d + 23;
                f17914g = i4 % 128;
                int i5 = i4 % 2;
            } else {
                selfieScanModeExtended = null;
            }
            this.f17916c = selfieScanModeExtended;
            EventUtils.sendTutorialShownEvent$default(getRepo(), this, null, 4, null);
            super.setContent(null, ComposableLambdaKt.composableLambdaInstance(1688360477, true, new c()));
            return;
        }
        super.safeOnCreate(bundle);
        boolean z2 = getIntent().getSerializableExtra("extraMode") instanceof SelfieActivity.SelfieScanModeExtended;
        throw null;
    }

    private final void b() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f17914g + 49;
        f17913d = i3 % 128;
        if (i3 % 2 != 0) {
            EventUtils.sendContinueEvent(getRepo(), this);
            z2 = false;
        } else {
            EventUtils.sendContinueEvent(getRepo(), this);
            z2 = true;
        }
        a(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TutorialSelfieV2Activity tutorialSelfieV2Activity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = f17914g + 81;
        f17913d = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(tutorialSelfieV2Activity, "");
        tutorialSelfieV2Activity.a(false);
        int i6 = f17914g + 101;
        f17913d = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f17913d + 23;
        f17914g = i3 % 128;
        if (i3 % 2 == 0) {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialSelfieV2Activity$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    TutorialSelfieV2Activity.b(this.f$0, dialogInterface, i4);
                }
            });
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.tutorial.TutorialSelfieV2Activity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                TutorialSelfieV2Activity.b(this.f$0, dialogInterface, i4);
            }
        });
        int i4 = f17913d + 121;
        f17914g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
    }

    private final void a(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17913d + 35;
        f17914g = i3 % 128;
        if (i3 % 2 == 0) {
            IncodeWelcome.Companion.getInstance().getSelfieTipsBus().onNext(Boolean.valueOf(z2));
            finish();
            int i4 = 61 / 0;
        } else {
            IncodeWelcome.Companion.getInstance().getSelfieTipsBus().onNext(Boolean.valueOf(z2));
            finish();
        }
        int i5 = f17913d + 79;
        f17914g = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17919b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17920e = 0;

        static {
            int[] iArr = new int[SelfieActivity.SelfieScanModeExtended.valuesCustom().length];
            try {
                iArr[SelfieActivity.SelfieScanModeExtended.FACE_AUTHENTICATION.ordinal()] = 1;
                int i2 = f17920e + 15;
                f17919b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 / 4;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            f17918a = iArr;
            int i5 = f17920e + 31;
            f17919b = i5 % 128;
            int i6 = i5 % 2;
        }
    }
}
