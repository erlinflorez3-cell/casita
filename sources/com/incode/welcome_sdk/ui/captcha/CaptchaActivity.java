package com.incode.welcome_sdk.ui.captcha;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.extensions.k;
import com.incode.welcome_sdk.commons.ui.otp.OTPListener;
import com.incode.welcome_sdk.commons.ui.otp.OtpTextView;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.d.i;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.ar;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.CaptchaResult;
import com.incode.welcome_sdk.results.DynamicFormQuestionnaireModel;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter_Factory;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeTextView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptchaActivity extends BaseActivity {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f12818h = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f12819l = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CountDownTimer f12820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12821c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f12823e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CaptchaActivity$countDownTimerImpl$1 f12827j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CompositeDisposable f12822d = new CompositeDisposable();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScreenName f12824f = ScreenName.OTP;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Modules f12825g = Modules.OTP;

    public static /* synthetic */ Object e(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~(i2 | i7);
        int i9 = (~i5) | (~i7);
        int i10 = (~i9) | i2;
        int i11 = (~(i7 | i5)) | (~((~i2) | i5)) | (~(i9 | i2));
        int i12 = i5 + i2 + i4 + ((-101282902) * i6) + ((-829309908) * i3);
        int i13 = i12 * i12;
        int i14 = ((i5 * 42798203) - 224002048) + (42798203 * i2) + ((-1233194106) * i8) + (1828579084 * i10) + (1233194106 * i11) + ((-1190395904) * i4) + (1710751744 * i6) + ((-1643118592) * i3) + ((-1134166016) * i13);
        int i15 = (i5 * 1745018779) + 1790267665 + (i2 * 1745018779) + (i8 * (-58)) + (i10 * (-116)) + (i11 * 58) + (i4 * 1745018721) + (i6 * (-1587019414)) + (i3 * (-1871011668)) + (i13 * 1017511936);
        int i16 = i14 + (i15 * i15 * (-1139146752));
        if (i16 != 1) {
            return i16 != 2 ? b(objArr) : a(objArr);
        }
        CaptchaActivity captchaActivity = (CaptchaActivity) objArr[0];
        int i17 = 2 % 2;
        int i18 = f12819l + 73;
        f12818h = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(captchaActivity, "");
        i iVar = captchaActivity.f12823e;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i20 = f12818h + 95;
            f12819l = i20 % 128;
            int i21 = i20 % 2;
            iVar = null;
        }
        IncodeButton incodeButton = iVar.f7223c;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        captchaActivity.d();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8427instrumented$0$safeOnCreate$LandroidosBundleV(CaptchaActivity captchaActivity, View view) {
        Callback.onClick_enter(view);
        try {
            b(captchaActivity, view);
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
            String strKd = Qg.kd("`M\u0013P4", (short) (FB.Xd() ^ (685809655 ^ 685807732)), (short) (FB.Xd() ^ (315909947 ^ 315912827)));
            String strVd = hg.Vd(")\u0016", (short) (C1499aX.Xd() ^ ((1032024771 ^ 220926139) ^ (-816319944))), (short) (C1499aX.Xd() ^ ((1740136946 ^ 1436177449) ^ (-841091473))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("4!f$\b", (short) (FB.Xd() ^ ((2036655928 ^ 1362643939) ^ 677164721)));
                String strYd = C1561oA.yd(",\u001a", (short) (C1633zX.Xd() ^ ((933594726 ^ 1485547874) ^ (-1865301109))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("q`(gM", (short) (C1580rY.Xd() ^ ((1349359973 ^ 1906572026) ^ (-567163190))));
                    String strQd = Xg.qd("\u0004y", (short) (ZN.Xd() ^ (874593685 ^ 874597210)), (short) (ZN.Xd() ^ (613164234 ^ 613168487)));
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
                        Method declaredMethod = Class.forName(Jg.Wd("E2n6\r", (short) (OY.Xd() ^ ((1906331097 ^ 59365593) ^ 1915339492)), (short) (OY.Xd() ^ (1069462262 ^ 1069451388)))).getDeclaredMethod(ZO.xd("S\u0011", (short) (C1633zX.Xd() ^ ((1700350295 ^ 1001118236) ^ (-1592971985))), (short) (C1633zX.Xd() ^ (2095651334 ^ (-2095667482)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud(";`OTSD", (short) (OY.Xd() ^ ((1213613997 ^ 693350219) ^ 1627765223)), (short) (OY.Xd() ^ ((624830639 ^ 661382942) ^ 39178194)))};
                                Method method = Class.forName(Ig.wd("\u0019w{-z(z,3RSw:I\u001f\u0002^\u0001Wq$\u0013!", (short) (ZN.Xd() ^ (1906847720 ^ 1906845649)))).getMethod(C1561oA.Qd("[XfDibbRY>O[^PIJ", (short) (OY.Xd() ^ ((1502985419 ^ 551749841) ^ 2037828449))), Class.forName(EO.Od("\u00139|\u0007DP)}60O\u0013<1b|", (short) (C1607wl.Xd() ^ (1849120484 ^ 1849118442)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd = (short) (OY.Xd() ^ (327836651 ^ 327814825));
                                    short sXd2 = (short) (OY.Xd() ^ ((1986646037 ^ 438885155) ^ 1816220854));
                                    int[] iArr = new int["\tw?~d".length()];
                                    QB qb = new QB("\tw?~d");
                                    int i2 = 0;
                                    while (qb.YK()) {
                                        int iKK = qb.KK();
                                        Xu xuXd = Xu.Xd(iKK);
                                        iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                                        i2++;
                                    }
                                    String str = new String(iArr, 0, i2);
                                    String strOd = C1561oA.od("k_", (short) (C1633zX.Xd() ^ ((1928382710 ^ 362702524) ^ (-1735296027))));
                                    try {
                                        Class<?> cls4 = Class.forName(str);
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
                    short sXd3 = (short) (OY.Xd() ^ ((658559322 ^ 2051682331) ^ 1560979099));
                    int[] iArr2 = new int["\u001d\fS\u0013x".length()];
                    QB qb2 = new QB("\u001d\fS\u0013x");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    String strZd = Wg.Zd("'>", (short) (FB.Xd() ^ (795011508 ^ 794989338)), (short) (FB.Xd() ^ (528268935 ^ 528272032)));
                    try {
                        Class<?> cls5 = Class.forName(str2);
                        Field field5 = 0 != 0 ? cls5.getField(strZd) : cls5.getDeclaredField(strZd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        short sXd4 = (short) (C1499aX.Xd() ^ (30067089 ^ (-30055286)));
                        int[] iArr3 = new int["]L\u0014S9".length()];
                        QB qb3 = new QB("]L\u0014S9");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i4));
                            i4++;
                        }
                        String str3 = new String(iArr3, 0, i4);
                        String strVd2 = Wg.vd("+\u001f", (short) (FB.Xd() ^ ((1966547078 ^ 1370108040) ^ 614299659)));
                        try {
                            Class<?> cls6 = Class.forName(str3);
                            Field field6 = 0 != 0 ? cls6.getField(strVd2) : cls6.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i5 = (564226920 ^ 1735367955) ^ 1187968560;
                        if (x2 > i5 && x2 < displayMetrics.widthPixels - i5 && y2 > i5 && y2 < displayMetrics.heightPixels - i5) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.incode.welcome_sdk.ui.captcha.CaptchaActivity$countDownTimerImpl$1] */
    public CaptchaActivity() {
        final long millis = TimeUnit.SECONDS.toMillis(30L);
        this.f12827j = new CountDownTimer(millis) { // from class: com.incode.welcome_sdk.ui.captcha.CaptchaActivity$countDownTimerImpl$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f12838a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f12839c = 1;

            @Override // android.os.CountDownTimer
            public final void onTick(long j2) {
                int i2 = 2 % 2;
                long j3 = (j2 / 1000) + 1;
                i iVar = null;
                if (j3 == 5) {
                    int i3 = f12839c + 57;
                    f12838a = i3 % 128;
                    int i4 = i3 % 2;
                    i iVarAccess$getBinding$p = CaptchaActivity.access$getBinding$p(this.f12840b);
                    if (iVarAccess$getBinding$p == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        iVarAccess$getBinding$p = null;
                    }
                    IncodeTextView incodeTextView = iVarAccess$getBinding$p.f7228i;
                    Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
                    k.d(incodeTextView, R.color.onboard_sdk_state_destructive);
                }
                i iVarAccess$getBinding$p2 = CaptchaActivity.access$getBinding$p(this.f12840b);
                if (iVarAccess$getBinding$p2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    iVar = iVarAccess$getBinding$p2;
                }
                int i5 = (int) j3;
                iVar.f7228i.setText(this.f12840b.getResources().getQuantityString(R.plurals.onboard_sdk_captcha_x_seconds_left, i5, Integer.valueOf(i5)));
                int i6 = f12839c + 35;
                f12838a = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                int i2 = 2 % 2;
                int i3 = f12838a + 77;
                f12839c = i3 % 128;
                i iVar = null;
                if (i3 % 2 != 0) {
                    CaptchaActivity.access$generateCode(this.f12840b);
                    i iVarAccess$getBinding$p = CaptchaActivity.access$getBinding$p(this.f12840b);
                    if (iVarAccess$getBinding$p == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i4 = f12839c + 55;
                        f12838a = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        iVar = iVarAccess$getBinding$p;
                    }
                    iVar.f7224d.c();
                    return;
                }
                CaptchaActivity.access$generateCode(this.f12840b);
                CaptchaActivity.access$getBinding$p(this.f12840b);
                iVar.hashCode();
                throw null;
            }
        };
    }

    public static final /* synthetic */ void access$generateCode(CaptchaActivity captchaActivity) {
        int i2 = 2 % 2;
        int i3 = f12819l + 121;
        f12818h = i3 % 128;
        int i4 = i3 % 2;
        captchaActivity.c();
        int i5 = f12818h + 105;
        f12819l = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ i access$getBinding$p(CaptchaActivity captchaActivity) {
        int i2 = 2 % 2;
        int i3 = f12819l;
        int i4 = i3 + 121;
        f12818h = i4 % 128;
        int i5 = i4 % 2;
        i iVar = captchaActivity.f12823e;
        int i6 = i3 + 111;
        f12818h = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 69 / 0;
        }
        return iVar;
    }

    public static final /* synthetic */ boolean access$getHasSubmissionFailed$p(CaptchaActivity captchaActivity) {
        int i2 = 2 % 2;
        int i3 = f12819l + 73;
        int i4 = i3 % 128;
        f12818h = i4;
        int i5 = i3 % 2;
        boolean z2 = captchaActivity.f12826i;
        int i6 = i4 + 19;
        f12819l = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public static final /* synthetic */ int access$getRetryCount$p(CaptchaActivity captchaActivity) {
        int i2 = 2 % 2;
        int i3 = f12818h + 105;
        int i4 = i3 % 128;
        f12819l = i4;
        int i5 = i3 % 2;
        int i6 = captchaActivity.f12821c;
        if (i5 == 0) {
            int i7 = 75 / 0;
        }
        int i8 = i4 + 93;
        f12818h = i8 % 128;
        int i9 = i8 % 2;
        return i6;
    }

    public static final /* synthetic */ CountDownTimer access$getTimer$p(CaptchaActivity captchaActivity) {
        int i2 = 2 % 2;
        int i3 = f12818h + 77;
        int i4 = i3 % 128;
        f12819l = i4;
        int i5 = i3 % 2;
        CountDownTimer countDownTimer = captchaActivity.f12820b;
        int i6 = i4 + 63;
        f12818h = i6 % 128;
        if (i6 % 2 == 0) {
            return countDownTimer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$goToNextStep(CaptchaActivity captchaActivity, String str) {
        int i2 = 2 % 2;
        int i3 = f12818h + 69;
        f12819l = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {captchaActivity, str};
        int iC = DynamicFormQuestionnaireModel.AnswerModel.c();
        e(-1480134183, DynamicFormQuestionnaireModel.AnswerModel.c(), objArr, DynamicFormQuestionnaireModel.AnswerModel.c(), 1480134183, DynamicFormQuestionnaireModel.AnswerModel.c(), iC);
        int i5 = f12819l + 85;
        f12818h = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$initUI(CaptchaActivity captchaActivity, String str) {
        int i2 = 2 % 2;
        int i3 = f12818h + 31;
        f12819l = i3 % 128;
        int i4 = i3 % 2;
        captchaActivity.a(str);
        int i5 = f12818h + 35;
        f12819l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
    }

    public static final /* synthetic */ void access$onError(CaptchaActivity captchaActivity, Throwable th) {
        int i2 = 2 % 2;
        int i3 = f12819l + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12818h = i3 % 128;
        int i4 = i3 % 2;
        captchaActivity.d(th);
        int i5 = f12819l + 37;
        f12818h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
    }

    public static final /* synthetic */ void access$onSubmissionError(CaptchaActivity captchaActivity) {
        int i2 = 2 % 2;
        int i3 = f12819l + 43;
        f12818h = i3 % 128;
        int i4 = i3 % 2;
        captchaActivity.e();
        if (i4 != 0) {
            int i5 = 7 / 0;
        }
    }

    public static final /* synthetic */ void access$regenerateCode(CaptchaActivity captchaActivity) {
        int i2 = 2 % 2;
        int i3 = f12819l + 47;
        f12818h = i3 % 128;
        int i4 = i3 % 2;
        captchaActivity.b();
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setHasSubmissionFailed$p(CaptchaActivity captchaActivity, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f12819l;
        int i4 = i3 + 105;
        f12818h = i4 % 128;
        int i5 = i4 % 2;
        captchaActivity.f12826i = z2;
        int i6 = i3 + 25;
        f12818h = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$setRetryCount$p(CaptchaActivity captchaActivity, int i2) {
        int i3 = 2 % 2;
        int i4 = f12819l + 123;
        int i5 = i4 % 128;
        f12818h = i5;
        int i6 = i4 % 2;
        captchaActivity.f12821c = i2;
        if (i6 != 0) {
            int i7 = 5 / 0;
        }
        int i8 = i5 + 43;
        f12819l = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f12819l;
        int i4 = i3 + 93;
        f12818h = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f12824f;
        int i6 = i3 + 83;
        f12818h = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f12818h + 17;
        int i4 = i3 % 128;
        f12819l = i4;
        int i5 = i3 % 2;
        Modules modules = this.f12825g;
        int i6 = i4 + 33;
        f12818h = i6 % 128;
        if (i6 % 2 == 0) {
            return modules;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f12819l + 111;
        f12818h = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnCreate(bundle);
        i iVarC = i.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(iVarC, "");
        this.f12823e = iVarC;
        Object obj = null;
        if (iVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVarC = null;
        }
        setContentView(iVarC.a());
        EventUtils.sendEvent(getRepo(), Event.START_OTP, getModule());
        i iVar = this.f12823e;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar = null;
        }
        iVar.f7224d.requestFocus();
        i iVar2 = this.f12823e;
        if (iVar2 == null) {
            int i5 = f12819l + 11;
            f12818h = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar2 = null;
        }
        iVar2.f7223c.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.captcha.CaptchaActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CaptchaActivity.m8427instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        this.f12820b = this.f12827j;
        int i7 = f12819l + 101;
        f12818h = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int i2 = 2 % 2;
        int i3 = f12819l + 105;
        f12818h = i3 % 128;
        int i4 = i3 % 2;
        super.onResume();
        c();
        i iVar = this.f12823e;
        if (iVar == null) {
            int i5 = f12818h + 5;
            f12819l = i5 % 128;
            iVar = null;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
                iVar.hashCode();
                throw null;
            }
        }
        iVar.f7222b.setVisibility(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.f12819l
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.captcha.CaptchaActivity.f12818h = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L2b
            android.os.CountDownTimer r1 = r3.f12820b
            r0 = 1
            int r0 = r0 / 0
            if (r1 != 0) goto L24
        L15:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            int r0 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.f12818h
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.captcha.CaptchaActivity.f12819l = r0
            int r1 = r1 % r2
            r1 = 0
        L24:
            r1.cancel()
            super.onPause()
            return
        L2b:
            android.os.CountDownTimer r1 = r3.f12820b
            if (r1 != 0) goto L24
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.captcha.CaptchaActivity.onPause():void");
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f12818h + 7;
        f12819l = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f12822d.dispose();
            super.safeOnDestroy();
            int i4 = f12818h + 115;
            f12819l = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.f12822d.dispose();
        super.safeOnDestroy();
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(CaptchaActivity captchaActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(captchaActivity, "");
        captchaActivity.hideKeyboard();
        IncodeWelcome.Companion.getInstance().getCaptchaBus().onNext(new CaptchaResult(ResultCode.USER_CANCELLED, null, null, 6, null));
        captchaActivity.finish();
        int i4 = f12818h + 21;
        f12819l = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f12819l + 111;
        f12818h = i3 % 128;
        if (i3 % 2 == 0) {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.captcha.CaptchaActivity$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    CaptchaActivity.b(this.f$0, dialogInterface, i4);
                }
            });
            int i4 = f12818h + 33;
            f12819l = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 36 / 0;
                return;
            }
            return;
        }
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.captcha.CaptchaActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i42) {
                CaptchaActivity.b(this.f$0, dialogInterface, i42);
            }
        });
        throw null;
    }

    static final class a extends Lambda implements Function1<ResponseSuccess, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12828a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12829d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ String f12831e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f12829d + 39;
            f12828a = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f12828a + 49;
            f12829d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 29 / 0;
            }
            return unit;
        }

        private void b() {
            int i2 = 2 % 2;
            int i3 = f12828a + 49;
            f12829d = i3 % 128;
            if (i3 % 2 == 0) {
                CaptchaActivity.access$goToNextStep(CaptchaActivity.this, this.f12831e);
                int i4 = 11 / 0;
            } else {
                CaptchaActivity.access$goToNextStep(CaptchaActivity.this, this.f12831e);
            }
            int i5 = f12828a + 15;
            f12829d = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f12831e = str;
        }
    }

    static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12832a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12833e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12833e + 51;
            f12832a = i3 % 128;
            int i4 = i3 % 2;
            b(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f12832a + 125;
            f12833e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        
            com.incode.welcome_sdk.ui.captcha.CaptchaActivity.access$onError(r3.f12834d, r4);
            r1 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.b.f12833e + 115;
            com.incode.welcome_sdk.ui.captcha.CaptchaActivity.b.f12832a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        
            if ((r1 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        
            if (com.incode.welcome_sdk.ui.captcha.CaptchaActivity.access$getRetryCount$p(r3.f12834d) < 2) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
        
            r1 = r3.f12834d;
            com.incode.welcome_sdk.ui.captcha.CaptchaActivity.access$setRetryCount$p(r1, com.incode.welcome_sdk.ui.captcha.CaptchaActivity.access$getRetryCount$p(r1) + 1);
            com.incode.welcome_sdk.ui.captcha.CaptchaActivity.access$regenerateCode(r3.f12834d);
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
        
            if (com.incode.welcome_sdk.ui.captcha.CaptchaActivity.access$getRetryCount$p(r3.f12834d) < 2) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(java.lang.Throwable r4) {
            /*
                r3 = this;
                r2 = 2
                int r0 = r2 % r2
                int r0 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.b.f12833e
                int r1 = r0 + 47
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.captcha.CaptchaActivity.b.f12832a = r0
                int r1 = r1 % r2
                java.lang.String r0 = ""
                if (r1 != 0) goto L31
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                timber.log.Timber$Forest r0 = timber.log.Timber.Forest
                r0.e(r4)
                com.incode.welcome_sdk.ui.captcha.CaptchaActivity r0 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.this
                int r0 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.access$getRetryCount$p(r0)
                if (r0 >= r2) goto L42
            L20:
                com.incode.welcome_sdk.ui.captcha.CaptchaActivity r1 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.this
                int r0 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.access$getRetryCount$p(r1)
                int r0 = r0 + 1
                com.incode.welcome_sdk.ui.captcha.CaptchaActivity.access$setRetryCount$p(r1, r0)
                com.incode.welcome_sdk.ui.captcha.CaptchaActivity r0 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.this
                com.incode.welcome_sdk.ui.captcha.CaptchaActivity.access$regenerateCode(r0)
                return
            L31:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                timber.log.Timber$Forest r0 = timber.log.Timber.Forest
                r0.e(r4)
                com.incode.welcome_sdk.ui.captcha.CaptchaActivity r0 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.this
                int r0 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.access$getRetryCount$p(r0)
                if (r0 >= r2) goto L42
                goto L20
            L42:
                com.incode.welcome_sdk.ui.captcha.CaptchaActivity r0 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.this
                com.incode.welcome_sdk.ui.captcha.CaptchaActivity.access$onError(r0, r4)
                int r0 = com.incode.welcome_sdk.ui.captcha.CaptchaActivity.b.f12833e
                int r1 = r0 + 115
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.captcha.CaptchaActivity.b.f12832a = r0
                int r1 = r1 % r2
                if (r1 == 0) goto L53
                return
            L53:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.captcha.CaptchaActivity.b.b(java.lang.Throwable):void");
        }

        b() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12819l + 59;
        f12818h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12818h + 29;
        f12819l = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12819l + 101;
        f12818h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12819l + 115;
        f12818h = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final void d() {
        int i2 = 2 % 2;
        i iVar = this.f12823e;
        CountDownTimer countDownTimer = null;
        if (iVar == null) {
            int i3 = f12818h + 5;
            f12819l = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                countDownTimer.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f12818h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f12819l = i4 % 128;
            int i5 = i4 % 2;
            iVar = null;
        }
        String str = (String) OtpTextView.a(-53302256, BaseValidationPresenter_Factory.e(), new Object[]{iVar.f7224d}, BaseValidationPresenter_Factory.e(), BaseValidationPresenter_Factory.e(), BaseValidationPresenter_Factory.e(), 53302256);
        i iVar2 = this.f12823e;
        if (iVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar2 = null;
        }
        iVar2.f7221a.setVisibility(0);
        i iVar3 = this.f12823e;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar3 = null;
        }
        iVar3.f7225e.setVisibility(4);
        i iVar4 = this.f12823e;
        if (iVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar4 = null;
        }
        iVar4.f7223c.setEnabled(false);
        i iVar5 = this.f12823e;
        if (iVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar5 = null;
        }
        IncodeTextView incodeTextView = iVar5.f7228i;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        k.d(incodeTextView, R.color.onboard_sdk_LabelBig_TextColor);
        i iVar6 = this.f12823e;
        if (iVar6 == null) {
            int i6 = f12819l + 107;
            f12818h = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar6 = null;
        }
        iVar6.f7228i.setText(R.string.onboard_sdk_captcha_generating_code);
        CountDownTimer countDownTimer2 = this.f12820b;
        if (countDownTimer2 == null) {
            int i7 = f12818h + 83;
            f12819l = i7 % 128;
            if (i7 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i8 = 50 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else {
            countDownTimer = countDownTimer2;
        }
        countDownTimer.cancel();
        CompositeDisposable compositeDisposable = this.f12822d;
        Observable<ResponseSuccess> observableObserveOn = getRepo().verifyInterviewCode(str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final a aVar = new a(str);
        Consumer<? super ResponseSuccess> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.captcha.CaptchaActivity$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CaptchaActivity.c(aVar, obj);
            }
        };
        final b bVar = new b();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.captcha.CaptchaActivity$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CaptchaActivity.d(bVar, obj);
            }
        }));
    }

    static final class c extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12835b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12836e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12836e + 87;
            f12835b = i3 % 128;
            int i4 = i3 % 2;
            a(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void a(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12835b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f12836e = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(th, "");
                Timber.Forest.e(th);
                CaptchaActivity.access$onError(CaptchaActivity.this, th);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(th, "");
            Timber.Forest.e(th);
            CaptchaActivity.access$onError(CaptchaActivity.this, th);
            int i4 = f12836e + 125;
            f12835b = i4 % 128;
            int i5 = i4 % 2;
        }

        c() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<ar, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12844b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12845c = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ar arVar) {
            int i2 = 2 % 2;
            int i3 = f12844b + 123;
            f12845c = i3 % 128;
            int i4 = i3 % 2;
            d(arVar);
            Unit unit = Unit.INSTANCE;
            int i5 = f12845c + 103;
            f12844b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(ar arVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(arVar, "");
            CaptchaActivity captchaActivity = CaptchaActivity.this;
            String strC = arVar.c();
            Intrinsics.checkNotNullExpressionValue(strC, "");
            CaptchaActivity.access$initUI(captchaActivity, strC);
            i iVarAccess$getBinding$p = CaptchaActivity.access$getBinding$p(CaptchaActivity.this);
            CountDownTimer countDownTimer = null;
            if (iVarAccess$getBinding$p == null) {
                int i3 = f12844b + 11;
                f12845c = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                iVarAccess$getBinding$p = null;
            }
            IncodeTextView incodeTextView = iVarAccess$getBinding$p.f7228i;
            Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
            k.d(incodeTextView, R.color.onboard_sdk_LabelBig_TextColor);
            CountDownTimer countDownTimerAccess$getTimer$p = CaptchaActivity.access$getTimer$p(CaptchaActivity.this);
            if (countDownTimerAccess$getTimer$p == null) {
                int i4 = f12845c + 59;
                f12844b = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    countDownTimer.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                countDownTimer = countDownTimerAccess$getTimer$p;
            }
            countDownTimer.start();
        }

        e() {
            super(1);
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f12818h + 99;
        f12819l = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f12818h + 17;
        f12819l = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12819l + 35;
        f12818h = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 93 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        }
        int i5 = f12818h + 83;
        f12819l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
    }

    private final void c() {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f12822d;
        Observable<ar> observableObserveOn = getRepo().generateInterviewCode().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final e eVar = new e();
        Consumer<? super ar> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.captcha.CaptchaActivity$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CaptchaActivity.e(eVar, obj);
            }
        };
        final c cVar = new c();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.captcha.CaptchaActivity$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CaptchaActivity.b(cVar, obj);
            }
        }));
        int i3 = f12819l + 39;
        f12818h = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 71 / 0;
        }
    }

    private final void a(String str) {
        int i2 = 2 % 2;
        i iVar = this.f12823e;
        i iVar2 = null;
        if (iVar == null) {
            int i3 = f12818h + 7;
            f12819l = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f12819l + 91;
            f12818h = i5 % 128;
            int i6 = i5 % 2;
            iVar = null;
        }
        iVar.f7225e.setText(str);
        i iVar3 = this.f12823e;
        if (iVar3 == null) {
            int i7 = f12819l + 53;
            f12818h = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar3 = null;
        }
        iVar3.f7221a.setVisibility(8);
        i iVar4 = this.f12823e;
        if (iVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar4 = null;
        }
        iVar4.f7225e.setVisibility(0);
        i iVar5 = this.f12823e;
        if (iVar5 == null) {
            int i9 = f12819l + 3;
            f12818h = i9 % 128;
            int i10 = i9 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            iVar2 = iVar5;
        }
        iVar2.f7224d.setOtpListener(new OTPListener() { // from class: com.incode.welcome_sdk.ui.captcha.CaptchaActivity$initUI$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f12850b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f12851c = 1;

            /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
            @Override // com.incode.welcome_sdk.commons.ui.otp.OTPListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onInteractionListener() {
                /*
                    Method dump skipped, instruction units count: 235
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.captcha.CaptchaActivity$initUI$1.onInteractionListener():void");
            }

            @Override // com.incode.welcome_sdk.commons.ui.otp.OTPListener
            public final void onOTPComplete(String str2) {
                int i11 = 2 % 2;
                int i12 = f12851c + 99;
                f12850b = i12 % 128;
                int i13 = i12 % 2;
                Intrinsics.checkNotNullParameter(str2, "");
                this.f12852d.hideKeyboard();
                int i14 = f12850b + 97;
                f12851c = i14 % 128;
                int i15 = i14 % 2;
            }
        });
    }

    static final class d extends Lambda implements Function1<ar, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12841c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12842e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ar arVar) {
            int i2 = 2 % 2;
            int i3 = f12842e + 79;
            f12841c = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            d(arVar);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f12842e + 87;
            f12841c = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        private void d(ar arVar) {
            int i2 = 2 % 2;
            int i3 = f12842e + 33;
            f12841c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(arVar, "");
            i iVarAccess$getBinding$p = CaptchaActivity.access$getBinding$p(CaptchaActivity.this);
            i iVar = null;
            if (iVarAccess$getBinding$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = f12841c + 97;
                f12842e = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 4;
                }
                iVarAccess$getBinding$p = null;
            }
            iVarAccess$getBinding$p.f7225e.setText(arVar.c());
            i iVarAccess$getBinding$p2 = CaptchaActivity.access$getBinding$p(CaptchaActivity.this);
            if (iVarAccess$getBinding$p2 == null) {
                int i7 = f12842e + 107;
                f12841c = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                iVar = iVarAccess$getBinding$p2;
            }
            iVar.f7222b.setText(R.string.onboard_sdk_captcha_incorect_code);
            CaptchaActivity.access$onSubmissionError(CaptchaActivity.this);
        }

        d() {
            super(1);
        }
    }

    static final class h extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12847c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12848e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12848e + 89;
            f12847c = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f12847c + 87;
            f12848e = i3 % 128;
            i iVar = null;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                Timber.Forest.e(th);
                CaptchaActivity.access$getBinding$p(CaptchaActivity.this);
                throw null;
            }
            Intrinsics.checkNotNullParameter(th, "");
            Timber.Forest.e(th);
            i iVarAccess$getBinding$p = CaptchaActivity.access$getBinding$p(CaptchaActivity.this);
            if (iVarAccess$getBinding$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = f12847c + 47;
                f12848e = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iVar = iVarAccess$getBinding$p;
            }
            iVar.f7222b.setText(R.string.onboard_sdk_captcha_general_error);
            CaptchaActivity.access$onSubmissionError(CaptchaActivity.this);
        }

        h() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12819l + 93;
        f12818h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f12818h + 113;
        f12819l = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f12819l + 29;
        f12818h = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private final void b() {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f12822d;
        Observable<ar> observableObserveOn = getRepo().generateInterviewCode().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final d dVar = new d();
        Consumer<? super ar> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.captcha.CaptchaActivity$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CaptchaActivity.a(dVar, obj);
            }
        };
        final h hVar = new h();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.captcha.CaptchaActivity$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CaptchaActivity.j(hVar, obj);
            }
        }));
        int i3 = f12818h + 73;
        f12819l = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private final void e() {
        int i2 = 2 % 2;
        int i3 = f12819l;
        int i4 = i3 + 13;
        f12818h = i4 % 128;
        CountDownTimer countDownTimer = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        i iVar = this.f12823e;
        if (iVar == null) {
            int i5 = i3 + 85;
            f12818h = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar = null;
        }
        iVar.f7222b.setVisibility(0);
        i iVar2 = this.f12823e;
        if (iVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar2 = null;
        }
        iVar2.f7221a.setVisibility(8);
        i iVar3 = this.f12823e;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar3 = null;
        }
        iVar3.f7225e.setVisibility(0);
        i iVar4 = this.f12823e;
        if (iVar4 == null) {
            int i7 = f12818h + 25;
            f12819l = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            iVar4 = null;
        }
        iVar4.f7224d.c();
        this.f12826i = true;
        CountDownTimer countDownTimer2 = this.f12820b;
        if (countDownTimer2 == null) {
            int i9 = f12819l + 71;
            f12818h = i9 % 128;
            int i10 = i9 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            countDownTimer = countDownTimer2;
        }
        countDownTimer.start();
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        CaptchaActivity captchaActivity = (CaptchaActivity) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        captchaActivity.hideKeyboard();
        IncodeWelcome.Companion.getInstance().getCaptchaBus().onNext(new CaptchaResult(ResultCode.SUCCESS, null, str, 2, null));
        captchaActivity.finish();
        int i3 = f12818h + 111;
        f12819l = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void d(Throwable th) {
        int i2 = 2 % 2;
        hideKeyboard();
        IncodeWelcome.Companion.getInstance().getCaptchaBus().onNext(new CaptchaResult(ResultCode.ERROR, th, null, 4, null));
        finish();
        int i3 = f12818h + 111;
        f12819l = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        Object[] objArr = {function1, obj};
        int iC = DynamicFormQuestionnaireModel.AnswerModel.c();
        e(1522612751, DynamicFormQuestionnaireModel.AnswerModel.c(), objArr, DynamicFormQuestionnaireModel.AnswerModel.c(), -1522612749, DynamicFormQuestionnaireModel.AnswerModel.c(), iC);
    }

    private static final void b(CaptchaActivity captchaActivity, View view) {
        Object[] objArr = {captchaActivity, view};
        int iC = DynamicFormQuestionnaireModel.AnswerModel.c();
        e(-2131245117, DynamicFormQuestionnaireModel.AnswerModel.c(), objArr, DynamicFormQuestionnaireModel.AnswerModel.c(), 2131245118, DynamicFormQuestionnaireModel.AnswerModel.c(), iC);
    }

    private final void d(String str) {
        int iC = DynamicFormQuestionnaireModel.AnswerModel.c();
        int iC2 = DynamicFormQuestionnaireModel.AnswerModel.c();
        int iC3 = DynamicFormQuestionnaireModel.AnswerModel.c();
        e(-1480134183, DynamicFormQuestionnaireModel.AnswerModel.c(), new Object[]{this, str}, iC2, 1480134183, iC3, iC);
    }
}
