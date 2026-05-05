package com.incode.welcome_sdk.ui.delayed_onboarding;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.d.h;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.views.IncodeButton;
import io.reactivex.subjects.PublishSubject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class DelayedOnboardingIntroActivity extends BaseActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f13212f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f13213h = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f13217e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Modules f13216d = Modules.UNDEFINED;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScreenName f13215c = ScreenName.UNUSED;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f13214b = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8439instrumented$0$safeOnCreate$LandroidosBundleV(DelayedOnboardingIntroActivity delayedOnboardingIntroActivity, View view) {
        Callback.onClick_enter(view);
        try {
            d(delayedOnboardingIntroActivity, view);
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
            String strKd = Qg.kd("*\u0017\\\u001a}", (short) (OY.Xd() ^ ((442439092 ^ 1797352430) ^ 1904104192)), (short) (OY.Xd() ^ (913311842 ^ 913320272)));
            String strVd = hg.Vd("lY", (short) (C1607wl.Xd() ^ ((596276341 ^ 1443985624) ^ 1973099381)), (short) (C1607wl.Xd() ^ ((268407271 ^ 1673421034) ^ 1816235126)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("\"\u000fT\u0012u", (short) (C1580rY.Xd() ^ (127898286 ^ (-127904072))));
                String strYd = C1561oA.yd("r^", (short) (OY.Xd() ^ ((364731039 ^ 969924186) ^ 745723496)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("D3z: ", (short) (C1499aX.Xd() ^ ((1796993978 ^ 1220043001) ^ (-597919119))));
                    short sXd = (short) (C1499aX.Xd() ^ (2103058312 ^ (-2103079690)));
                    short sXd2 = (short) (C1499aX.Xd() ^ ((936514892 ^ 1758441695) ^ (-1595789225)));
                    int[] iArr = new int["VL".length()];
                    QB qb = new QB("VL");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(str) : cls3.getDeclaredField(str);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd3 = (short) (C1607wl.Xd() ^ ((1142965445 ^ 1851378487) ^ 712628676));
                        short sXd4 = (short) (C1607wl.Xd() ^ ((1737127576 ^ 444617844) ^ 2097837833));
                        int[] iArr2 = new int["rBVz)".length()];
                        QB qb2 = new QB("rBVz)");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                            i3++;
                        }
                        Class<?> cls4 = Class.forName(new String(iArr2, 0, i3));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd5 = (short) (OY.Xd() ^ ((1730413064 ^ 1850444203) ^ 158318992));
                        short sXd6 = (short) (OY.Xd() ^ (2028997998 ^ 2029013907));
                        int[] iArr3 = new int[":2".length()];
                        QB qb3 = new QB(":2");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd6) + sXd5)));
                            i4++;
                        }
                        Method declaredMethod = cls4.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd7 = (short) (Od.Xd() ^ (295466782 ^ (-295442170)));
                                short sXd8 = (short) (Od.Xd() ^ (694158054 ^ (-694157776)));
                                int[] iArr4 = new int["4\"V\u001c7`".length()];
                                QB qb4 = new QB("4\"V\u001c7`");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + (i5 * sXd8))) + xuXd4.CK(iKK4));
                                    i5++;
                                }
                                String str2 = new String(iArr4, 0, i5);
                                short sXd9 = (short) (FB.Xd() ^ ((1556433983 ^ 233327350) ^ 1361934584));
                                int[] iArr5 = new int["\u0006mo\u0018\u000b'\bH\"\\[\u0006'$$}m\u0002Gw-\u0003#".length()];
                                QB qb5 = new QB("\u0006mo\u0018\u000b'\bH\"\\[\u0006'$$}m\u0002Gw-\u0003#");
                                int i6 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd9 + i6)));
                                    i6++;
                                }
                                Object[] objArr2 = {str2};
                                Method method = Class.forName(new String(iArr5, 0, i6)).getMethod(C1561oA.Qd("]ZhFkddT[@Q]`RKL", (short) (C1633zX.Xd() ^ ((2097438519 ^ 1316558305) ^ (-863855197)))), Class.forName(EO.Od("L\f3A\u0006\u0002VK\u007fe\tLyz7\u000f", (short) (ZN.Xd() ^ ((276590256 ^ 458308969) ^ 187512688)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("bQ\u0019X>", (short) (Od.Xd() ^ (75826119 ^ (-75854336))), (short) (Od.Xd() ^ ((1051807459 ^ 1007219334) ^ (-45733869))));
                                    String strOd = C1561oA.od("+\u001f", (short) (Od.Xd() ^ (1834095676 ^ (-1834105998))));
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
                    String strKd2 = C1561oA.Kd("^M\u0015T:", (short) (OY.Xd() ^ ((1070133911 ^ 1198318855) ^ 2024031119)));
                    String strZd2 = Wg.Zd("Up", (short) (Od.Xd() ^ (1805218074 ^ (-1805200413))), (short) (Od.Xd() ^ ((883881888 ^ 1763982080) ^ (-1569359975))));
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
                        short sXd10 = (short) (OY.Xd() ^ ((2035200394 ^ 811550114) ^ 1225912377));
                        int[] iArr6 = new int["\r{C\u0003h".length()];
                        QB qb6 = new QB("\r{C\u0003h");
                        int i7 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (sXd10 + i7));
                            i7++;
                        }
                        String str3 = new String(iArr6, 0, i7);
                        String strVd2 = Wg.vd("H<", (short) (OY.Xd() ^ (646480904 ^ 646485650)));
                        try {
                            Class<?> cls7 = Class.forName(str3);
                            Field field6 = 0 != 0 ? cls7.getField(strVd2) : cls7.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i8 = 194320473 ^ 194320402;
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

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f13213h + 53;
        f13212f = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = this.f13216d;
        if (i4 != 0) {
            int i5 = 68 / 0;
        }
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f13212f + 115;
        int i4 = i3 % 128;
        f13213h = i4;
        int i5 = i3 % 2;
        ScreenName screenName = this.f13215c;
        int i6 = i4 + 15;
        f13212f = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final boolean isForceShowBackButton() {
        int i2 = 2 % 2;
        int i3 = f13213h + 5;
        int i4 = i3 % 128;
        f13212f = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f13214b;
        int i6 = i4 + 91;
        f13213h = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    private static final void d(DelayedOnboardingIntroActivity delayedOnboardingIntroActivity, View view) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(delayedOnboardingIntroActivity, "");
        h hVar = delayedOnboardingIntroActivity.f13217e;
        Object obj = null;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            hVar = null;
        }
        IncodeButton incodeButton = hVar.f7218e;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        PublishSubject<Boolean> delayedOnboardingIntroScreenBus = IncodeWelcome.Companion.getInstance().getDelayedOnboardingIntroScreenBus();
        if (delayedOnboardingIntroScreenBus != null) {
            int i3 = f13212f + 27;
            f13213h = i3 % 128;
            if (i3 % 2 == 0) {
                delayedOnboardingIntroScreenBus.onNext(Boolean.TRUE);
                obj.hashCode();
                throw null;
            }
            delayedOnboardingIntroScreenBus.onNext(Boolean.TRUE);
        } else {
            int i4 = f13213h + 65;
            f13212f = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 4;
            }
        }
        delayedOnboardingIntroActivity.finish();
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f13212f + 19;
        f13213h = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnCreate(bundle);
        h hVarE = h.e(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(hVarE, "");
        this.f13217e = hVarE;
        h hVar = null;
        if (hVarE == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            hVarE = null;
        }
        setContentView(hVarE.b());
        h hVar2 = this.f13217e;
        if (hVar2 == null) {
            int i5 = f13212f + 21;
            f13213h = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = f13213h + 81;
            f13212f = i7 % 128;
            int i8 = i7 % 2;
        } else {
            hVar = hVar2;
        }
        hVar.f7218e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.delayed_onboarding.DelayedOnboardingIntroActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DelayedOnboardingIntroActivity.m8439instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void publishUserCancelled() {
        int i2 = 2 % 2;
        int i3 = f13212f + 97;
        f13213h = i3 % 128;
        if (i3 % 2 != 0) {
            IncodeWelcome.Companion.getInstance().getDelayedOnboardingIntroScreenBus().onNext(Boolean.FALSE);
        } else {
            IncodeWelcome.Companion.getInstance().getDelayedOnboardingIntroScreenBus().onNext(Boolean.FALSE);
            throw null;
        }
    }
}
