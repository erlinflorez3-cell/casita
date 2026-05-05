package com.incode.welcome_sdk.ui.antifraud;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.d.e;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.antifraud.AntifraudContract;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class AntifraudActivity extends BaseActivity implements AntifraudContract.View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f11047c = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f11048f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f11049g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f11050h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f11051j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f11053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AntifraudPresenter f11054e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScreenName f11052b = ScreenName.ANTIFRAUD;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Modules f11055i = Modules.ANTIFRAUD;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("|i/lP", (short) (ZN.Xd() ^ (271485236 ^ 271490649)), (short) (ZN.Xd() ^ (2015816072 ^ 2015802321)));
            String strVd = hg.Vd("@-", (short) (C1580rY.Xd() ^ ((1540839351 ^ 732827221) ^ (-1887010491))), (short) (C1580rY.Xd() ^ (280603956 ^ (-280607829))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("E2w5\u0019", (short) (ZN.Xd() ^ ((1629644983 ^ 1660837448) ^ 64774737)));
                String strYd = C1561oA.yd("(\u0014", (short) (C1607wl.Xd() ^ (213546296 ^ 213522515)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("fU\u001d\\B", (short) (ZN.Xd() ^ ((1465974410 ^ 2015954483) ^ 793371924)));
                    short sXd = (short) (FB.Xd() ^ (1840068368 ^ 1840057006));
                    short sXd2 = (short) (FB.Xd() ^ ((1227108283 ^ 1409068122) ^ 450396317));
                    int[] iArr = new int["yo".length()];
                    QB qb = new QB("yo");
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
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("J>E\u0012;", (short) (C1633zX.Xd() ^ ((195742318 ^ 164565507) ^ (-40231499))), (short) (C1633zX.Xd() ^ (666770448 ^ (-666771285))))).getDeclaredMethod(ZO.xd("Dv", (short) (ZN.Xd() ^ (270131145 ^ 270108580)), (short) (ZN.Xd() ^ ((1072750897 ^ 1785805860) ^ 1434552169))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("(@(\u0013\u0013\f", (short) (FB.Xd() ^ ((481457229 ^ 908525591) ^ 714419991)), (short) (FB.Xd() ^ ((1521785148 ^ 2091500460) ^ 639459423)))};
                                Method method = Class.forName(Ig.wd("{Ce\u0012\u0015Q6NDvu\u001c]ZBD\u0010\\\u0002}/|\\", (short) (FB.Xd() ^ ((1456657262 ^ 319215039) ^ 1171533299)))).getMethod(C1561oA.Qd("\"\u001f-\u000b0))\u0019 \u0005\u0016\"%\u0017\u0010\u0011", (short) (FB.Xd() ^ (1473450129 ^ 1473464196))), Class.forName(EO.Od("&U\u0019 47\u001ci9\u007f'f/\u001c5H", (short) (Od.Xd() ^ ((1398947310 ^ 587563934) ^ (-1885831849))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("xg/nT", (short) (C1580rY.Xd() ^ (482976653 ^ (-482972373))), (short) (C1580rY.Xd() ^ (121020770 ^ (-121041569))));
                                    String strOd = C1561oA.od("nb", (short) (C1607wl.Xd() ^ (132788542 ^ 132806512)));
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
                    String strKd2 = C1561oA.Kd("eT\u001c[A", (short) (ZN.Xd() ^ ((486776522 ^ 1124758461) ^ 1577712292)));
                    short sXd3 = (short) (Od.Xd() ^ (537100197 ^ (-537085091)));
                    short sXd4 = (short) (Od.Xd() ^ (536808722 ^ (-536836569)));
                    int[] iArr2 = new int[" v".length()];
                    QB qb2 = new QB(" v");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(((i3 * sXd4) ^ sXd3) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls5 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls5.getField(str2) : cls5.getDeclaredField(str2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("~m5tZ", (short) (FB.Xd() ^ (690443360 ^ 690442979)));
                        String strVd2 = Wg.vd("\u0004w", (short) (C1607wl.Xd() ^ (1331186658 ^ 1331181110)));
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
                        int i4 = 1326045143 ^ 1326045084;
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

    public static final class Companion {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11056c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11057d = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) AntifraudActivity.class);
            CX.ud();
            context.startActivity(intent);
            int i3 = f11056c + 7;
            f11057d = i3 % 128;
            int i4 = i3 % 2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f11049g + 29;
        f11048f = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f11052b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        Modules modules;
        int i2 = 2 % 2;
        int i3 = f11049g + 59;
        int i4 = i3 % 128;
        f11048f = i4;
        if (i3 % 2 != 0) {
            modules = this.f11055i;
            int i5 = 33 / 0;
        } else {
            modules = this.f11055i;
        }
        int i6 = i4 + 79;
        f11049g = i6 % 128;
        int i7 = i6 % 2;
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        e eVarC = e.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(eVarC, "");
        this.f11053d = eVarC;
        if (eVarC == null) {
            int i3 = f11049g + 39;
            f11048f = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            eVarC = null;
        }
        setContentView(eVarC.b());
        AntifraudPresenter antifraudPresenter = new AntifraudPresenter(getRepo(), this);
        this.f11054e = antifraudPresenter;
        antifraudPresenter.processAntifraud();
        int i5 = f11049g + 89;
        f11048f = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f11049g + 47;
        int i4 = i3 % 128;
        f11048f = i4;
        AntifraudPresenter antifraudPresenter = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        AntifraudPresenter antifraudPresenter2 = this.f11054e;
        if (antifraudPresenter2 != null) {
            antifraudPresenter = antifraudPresenter2;
        } else {
            int i5 = i4 + 75;
            f11049g = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        antifraudPresenter.onDestroy();
        super.safeOnDestroy();
        int i7 = f11049g + 9;
        f11048f = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, com.incode.welcome_sdk.ui.BaseView
    public final void closeScreen() {
        int i2 = 2 % 2;
        int i3 = f11049g + 7;
        f11048f = i3 % 128;
        int i4 = i3 % 2;
        finish();
        int i5 = f11049g + 75;
        f11048f = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final boolean isScreenCloseable() {
        int i2 = 2 % 2;
        int i3 = f11048f + 5;
        int i4 = i3 % 128;
        f11049g = i4;
        boolean z2 = i3 % 2 == 0;
        int i5 = i4 + 113;
        f11048f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return z2;
    }

    static {
        int i2 = f11051j + 117;
        f11050h = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context) {
        int i2 = 2 % 2;
        int i3 = f11048f + 67;
        f11049g = i3 % 128;
        int i4 = i3 % 2;
        f11047c.start(context);
        int i5 = f11049g + 13;
        f11048f = i5 % 128;
        int i6 = i5 % 2;
    }
}
