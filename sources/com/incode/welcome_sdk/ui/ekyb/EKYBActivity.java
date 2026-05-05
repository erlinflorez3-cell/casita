package com.incode.welcome_sdk.ui.ekyb;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.extensions.b;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.d.f;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.EKYB;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.EKYBResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.ekyb.EKYBContract;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel;
import com.incode.welcome_sdk.views.IncodeFormItem;
import com.incode.welcome_sdk.views.IncodeTextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
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
public final class EKYBActivity extends BaseActivity implements EKYBContract.View {

    /* JADX INFO: renamed from: c */
    public static final Companion f14081c = new Companion(null);

    /* JADX INFO: renamed from: g */
    private static int f14082g = 1;

    /* JADX INFO: renamed from: h */
    private static int f14083h = 0;

    /* JADX INFO: renamed from: j */
    private static int f14084j = 0;

    /* JADX INFO: renamed from: l */
    private static int f14085l = 1;

    /* JADX INFO: renamed from: f */
    private f f14089f;

    /* JADX INFO: renamed from: b */
    private ScreenName f14086b = ScreenName.EKYB_INPUT;

    /* JADX INFO: renamed from: d */
    private final Modules f14087d = Modules.EKYB;

    /* JADX INFO: renamed from: e */
    private String f14088e = "";

    /* JADX INFO: renamed from: i */
    private final Lazy f14090i = LazyKt.lazy(new e());

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8;
        int i9 = ~(i7 | i5);
        int i10 = (~i4) | (~i5);
        int i11 = (~i10) | i7;
        int i12 = (~(i5 | i4)) | (~((~i7) | i4)) | (~(i10 | i7));
        int i13 = i4 + i7 + i3 + ((-101282902) * i6) + ((-829309908) * i2);
        int i14 = i13 * i13;
        int i15 = ((i4 * 42798203) - 224002048) + (42798203 * i7) + ((-1233194106) * i9) + (1828579084 * i11) + (1233194106 * i12) + ((-1190395904) * i3) + (1710751744 * i6) + ((-1643118592) * i2) + ((-1134166016) * i14);
        int i16 = (i4 * 1745018779) + 1790267665 + (i7 * 1745018779) + (i9 * (-58)) + (i11 * (-116)) + (i12 * 58) + (i3 * 1745018721) + (i6 * (-1587019414)) + (i2 * (-1871011668)) + (i14 * 1017511936);
        if (i15 + (i16 * i16 * (-1139146752)) != 1) {
            return e(objArr);
        }
        int i17 = 0;
        f fVar = (f) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i18 = 2 % 2;
        int i19 = f14083h + 115;
        f14082g = i19 % 128;
        int i20 = i19 % 2;
        IncodeFormItem incodeFormItem = fVar.f7188a;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem, "");
        IncodeFormItem incodeFormItem2 = incodeFormItem;
        if (b.d(bundle, "extraShowName")) {
            int i21 = f14083h + 1;
            f14082g = i21 % 128;
            int i22 = i21 % 2;
            i8 = 0;
        } else {
            i8 = 8;
        }
        incodeFormItem2.setVisibility(i8);
        a(fVar, b.d(bundle, "extraShowAddress"));
        IncodeFormItem incodeFormItem3 = fVar.f7195h;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem3, "");
        IncodeFormItem incodeFormItem4 = incodeFormItem3;
        if (!b.d(bundle, "extraShowTaxId")) {
            int i23 = f14082g + 103;
            f14083h = i23 % 128;
            int i24 = i23 % 2;
            i17 = 8;
        }
        incodeFormItem4.setVisibility(i17);
        return null;
    }

    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V */
    public static /* synthetic */ void m8455instrumented$0$safeOnCreate$LandroidosBundleV(EKYBActivity eKYBActivity, f fVar, View view) {
        Callback.onClick_enter(view);
        try {
            e(eKYBActivity, fVar, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V */
    public static /* synthetic */ void m8456instrumented$1$safeOnCreate$LandroidosBundleV(EKYBActivity eKYBActivity, View view) {
        Callback.onClick_enter(view);
        try {
            d(eKYBActivity, view);
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
            String strKd = Qg.kd("mZ ]A", (short) (OY.Xd() ^ (1263275436 ^ 1263281585)), (short) (OY.Xd() ^ (1339880373 ^ 1339874563)));
            short sXd = (short) (C1499aX.Xd() ^ ((775960212 ^ 91648163) ^ (-724982592)));
            short sXd2 = (short) (C1499aX.Xd() ^ (2002955252 ^ (-2002951897)));
            int[] iArr = new int["\u0001m".length()];
            QB qb = new QB("\u0001m");
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
                String strUd = C1561oA.ud("Q>\u0004A%", (short) (C1633zX.Xd() ^ (2114838566 ^ (-2114820988))));
                String strYd = C1561oA.yd("ZH", (short) (C1633zX.Xd() ^ (9357267 ^ (-9343514))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd(")\u0018_\u001f\u0005", (short) (C1580rY.Xd() ^ ((1475329288 ^ 809246703) ^ (-1741933758))));
                    String strQd = Xg.qd("\f\u0002", (short) (Od.Xd() ^ (1761519151 ^ (-1761535652))), (short) (Od.Xd() ^ ((1459409875 ^ 2055990220) ^ (-745999132))));
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
                        Method declaredMethod = Class.forName(Jg.Wd("T|6tG", (short) (C1580rY.Xd() ^ (7913851 ^ (-7915348))), (short) (C1580rY.Xd() ^ ((838855324 ^ 1169175350) ^ (-1951367771))))).getDeclaredMethod(ZO.xd("\r.", (short) (ZN.Xd() ^ (1704386403 ^ 1704380785)), (short) (ZN.Xd() ^ ((1440964621 ^ 138440361) ^ 1570979065))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("f@\b\u0013*+", (short) (C1580rY.Xd() ^ (1563131375 ^ (-1563111371))), (short) (C1580rY.Xd() ^ (1891226503 ^ (-1891217270))));
                                Class<?> cls4 = Class.forName(Ig.wd("?u(VLpW\n{4=]~\u0006,\u007f?yA~,\u0014:", (short) (Od.Xd() ^ (1193175099 ^ (-1193159920)))));
                                Class<?>[] clsArr = new Class[1];
                                short sXd3 = (short) (C1499aX.Xd() ^ (1699777045 ^ (-1699780197)));
                                int[] iArr2 = new int["5fi1%(MZ*1XW \rF\u001a".length()];
                                QB qb2 = new QB("5fi1%(MZ*1XW \rF\u001a");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                                Object[] objArr2 = {strUd2};
                                Method method = cls4.getMethod(C1561oA.Qd("52@\u001eC<<,3\u0018)58*#$", (short) (C1607wl.Xd() ^ ((788699773 ^ 372586412) ^ 959955530))), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("O>\u0006E+", (short) (FB.Xd() ^ ((994540459 ^ 1593827966) ^ 1706605752)), (short) (FB.Xd() ^ (619958223 ^ 619962919)));
                                    String strOd = C1561oA.od("QE", (short) (ZN.Xd() ^ ((203963478 ^ 9479154) ^ 213437027)));
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
                    String strKd2 = C1561oA.Kd("~m5tZ", (short) (OY.Xd() ^ (1016601390 ^ 1016614734)));
                    String strZd2 = Wg.Zd("?\u0006", (short) (FB.Xd() ^ (1409669390 ^ 1409664752)), (short) (FB.Xd() ^ (1727646449 ^ 1727649996)));
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
                        String strXd = C1561oA.Xd("\u0017\u0006M\rr", (short) (ZN.Xd() ^ ((905745711 ^ 398185239) ^ 575098233)));
                        String strVd = Wg.vd("ka", (short) (OY.Xd() ^ (824855294 ^ 824843225)));
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
                        int i4 = 2099686194 ^ 2099686265;
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

        /* JADX INFO: renamed from: a */
        private static int f14091a = 0;

        /* JADX INFO: renamed from: e */
        private static int f14092e = 1;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, EKYB ekyb) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(ekyb, "");
            Intent intent = new Intent(context, (Class<?>) EKYBActivity.class);
            intent.putExtra("extraShowName", ekyb.isShowName());
            intent.putExtra("extraShowAddress", ekyb.isShowAddress());
            intent.putExtra("extraShowTaxId", ekyb.isShowTaxId());
            CX.ud();
            context.startActivity(intent);
            int i3 = f14091a + 109;
            f14092e = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 37 / 0;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ IncodeWelcomeRepository access$getRepo(EKYBActivity eKYBActivity) {
        int i2 = 2 % 2;
        int i3 = f14082g + 35;
        f14083h = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository repo = eKYBActivity.getRepo();
        if (i4 != 0) {
            int i5 = 80 / 0;
        }
        int i6 = f14083h + 125;
        f14082g = i6 % 128;
        int i7 = i6 % 2;
        return repo;
    }

    public static final /* synthetic */ void access$handleBrazilSelection(EKYBActivity eKYBActivity, f fVar) {
        int i2 = 2 % 2;
        int i3 = f14082g + 61;
        f14083h = i3 % 128;
        int i4 = i3 % 2;
        eKYBActivity.a(fVar);
        int i5 = f14083h + 75;
        f14082g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$handleUSASelection(EKYBActivity eKYBActivity, f fVar) {
        int i2 = 2 % 2;
        int i3 = f14083h + 41;
        f14082g = i3 % 128;
        int i4 = i3 % 2;
        eKYBActivity.b(fVar);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setCountryKey$p(EKYBActivity eKYBActivity, String str) {
        int i2 = 2 % 2;
        int i3 = f14083h;
        int i4 = i3 + 47;
        f14082g = i4 % 128;
        int i5 = i4 % 2;
        eKYBActivity.f14088e = str;
        int i6 = i3 + 95;
        f14082g = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f14083h;
        int i4 = i3 + 101;
        f14082g = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f14086b;
        int i6 = i3 + 17;
        f14082g = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    public final void setScreenName(ScreenName screenName) {
        int i2 = 2 % 2;
        int i3 = f14082g + 79;
        f14083h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(screenName, "");
        this.f14086b = screenName;
        int i5 = f14082g + 59;
        f14083h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f14082g + 123;
        int i4 = i3 % 128;
        f14083h = i4;
        int i5 = i3 % 2;
        Modules modules = this.f14087d;
        int i6 = i4 + 1;
        f14082g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 7 / 0;
        }
        return modules;
    }

    public static final class e extends Lambda implements Function0<EKYBPresenter> {

        /* JADX INFO: renamed from: b */
        private static int f14100b = 1;

        /* JADX INFO: renamed from: c */
        public static int f14101c = 0;

        /* JADX INFO: renamed from: d */
        public static int f14102d = 0;

        /* JADX INFO: renamed from: e */
        private static int f14103e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ EKYBPresenter invoke() {
            int i2 = 2 % 2;
            int i3 = f14103e + 105;
            f14100b = i3 % 128;
            int i4 = i3 % 2;
            EKYBPresenter eKYBPresenterD = d();
            int i5 = f14103e + 41;
            f14100b = i5 % 128;
            int i6 = i5 % 2;
            return eKYBPresenterD;
        }

        private EKYBPresenter d() {
            int i2 = 2 % 2;
            EKYBActivity eKYBActivity = EKYBActivity.this;
            EKYBPresenter eKYBPresenter = new EKYBPresenter(eKYBActivity, EKYBActivity.access$getRepo(eKYBActivity));
            int i3 = f14103e + 31;
            f14100b = i3 % 128;
            int i4 = i3 % 2;
            return eKYBPresenter;
        }

        public static int e() {
            int i2 = f14101c;
            int i3 = i2 % 8028386;
            f14101c = i2 + 1;
            if (i3 != 0) {
                return f14102d;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            f14102d = elapsedCpuTime;
            return elapsedCpuTime;
        }

        e() {
            super(0);
        }
    }

    private final EKYBPresenter d() {
        int i2 = 2 % 2;
        int i3 = f14083h + 37;
        f14082g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        EKYBPresenter eKYBPresenter = (EKYBPresenter) this.f14090i.getValue();
        int i4 = f14082g + 65;
        f14083h = i4 % 128;
        if (i4 % 2 == 0) {
            return eKYBPresenter;
        }
        throw null;
    }

    private static final void e(EKYBActivity eKYBActivity, f fVar, View view) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(eKYBActivity, "");
        Intrinsics.checkNotNullParameter(fVar, "");
        if (eKYBActivity.d(fVar)) {
            int i3 = f14082g + 13;
            f14083h = i3 % 128;
            int i4 = i3 % 2;
            eKYBActivity.d().processFormFields(fVar.f7188a.getText(), fVar.f7194g.getText(), fVar.f7193f.getText(), fVar.f7191d.getText(), eKYBActivity.f14088e, fVar.f7189b.getText(), fVar.f7196i.getText(), fVar.f7197j.getText(), fVar.f7195h.getText());
        }
        Intrinsics.checkNotNull(view);
        ViewExtensionsKt.hideKeyboard(view);
        int i5 = f14082g + 53;
        f14083h = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final void d(EKYBActivity eKYBActivity, View view) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f14082g + 113;
        f14083h = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(eKYBActivity, "");
            eKYBActivity.hideResult();
            eKYBActivity.hideProcessing();
            Intrinsics.checkNotNull(view);
            i2 = 10;
        } else {
            Intrinsics.checkNotNullParameter(eKYBActivity, "");
            eKYBActivity.hideResult();
            eKYBActivity.hideProcessing();
            Intrinsics.checkNotNull(view);
            i2 = 8;
        }
        view.setVisibility(i2);
        eKYBActivity.showForm();
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        final f fVarE = f.e(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fVarE, "");
        this.f14089f = fVarE;
        if (fVarE == null) {
            int i3 = f14082g + 47;
            f14083h = i3 % 128;
            fVarE = null;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 19 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        }
        setContentView(fVarE.d());
        int iA = IdCaptureViewModel.ag.AnonymousClass4.a();
        int iA2 = IdCaptureViewModel.ag.AnonymousClass4.a();
        int iA3 = IdCaptureViewModel.ag.AnonymousClass4.a();
        a(IdCaptureViewModel.ag.AnonymousClass4.a(), iA2, 206271691, iA, iA3, -206271691, new Object[]{this, fVarE});
        Object[] objArr = {fVarE, getIntent().getExtras()};
        int iA4 = IdCaptureViewModel.ag.AnonymousClass4.a();
        a(IdCaptureViewModel.ag.AnonymousClass4.a(), IdCaptureViewModel.ag.AnonymousClass4.a(), -1287867798, iA4, IdCaptureViewModel.ag.AnonymousClass4.a(), 1287867799, objArr);
        c(fVarE);
        fVarE.f7190c.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.ekyb.EKYBActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EKYBActivity.m8455instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, fVarE, view);
            }
        });
        fVarE.f7192e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.ekyb.EKYBActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EKYBActivity.m8456instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        int i5 = f14082g + 35;
        f14083h = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.ekyb.EKYBContract.View
    public final void showForm() {
        int i2 = 2 % 2;
        int i3 = f14082g;
        int i4 = i3 + 67;
        f14083h = i4 % 128;
        int i5 = i4 % 2;
        f fVar = this.f14089f;
        if (fVar == null) {
            int i6 = i3 + 15;
            f14083h = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = 43 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            int i8 = f14082g + 103;
            f14083h = i8 % 128;
            int i9 = i8 % 2;
            fVar = null;
        }
        Group group = fVar.f7199l;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        EventUtils.sendScreenOpened(getRepo(), ScreenName.EKYB_INPUT, Modules.EKYB);
    }

    @Override // com.incode.welcome_sdk.ui.ekyb.EKYBContract.View
    public final void hideForm() {
        int i2 = 2 % 2;
        int i3 = f14082g + 75;
        f14083h = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        f fVar = this.f14089f;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fVar = null;
        }
        Group group = fVar.f7199l;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(8);
        int i4 = f14083h + 115;
        f14082g = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.ekyb.EKYBContract.View
    public final void showProcessing() {
        int i2 = 2 % 2;
        int i3 = f14082g + 59;
        f14083h = i3 % 128;
        f fVar = null;
        if (i3 % 2 != 0) {
            fVar.hashCode();
            throw null;
        }
        f fVar2 = this.f14089f;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f14083h + 93;
            f14082g = i4 % 128;
            int i5 = i4 % 2;
        } else {
            fVar = fVar2;
        }
        Group group = fVar.f7200m;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        fVar.f7206s.setText(getString(R.string.onboard_sdk_processing));
        EventUtils.sendScreenOpened(getRepo(), ScreenName.EKYB_PROGRESS, Modules.EKYB);
    }

    @Override // com.incode.welcome_sdk.ui.ekyb.EKYBContract.View
    public final void hideProcessing() {
        int i2 = 2 % 2;
        int i3 = f14082g + 3;
        f14083h = i3 % 128;
        f fVar = null;
        if (i3 % 2 != 0) {
            fVar.hashCode();
            throw null;
        }
        f fVar2 = this.f14089f;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fVar = fVar2;
        }
        Group group = fVar.f7200m;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(8);
        EventUtils.sendScreenClosed(getRepo(), ScreenName.EKYB_PROGRESS, Modules.EKYB);
        int i4 = f14083h + 109;
        f14082g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.ekyb.EKYBContract.View
    public final void showResult(boolean z2) {
        int i2;
        int i3;
        Event event;
        int i4 = 2 % 2;
        int i5 = f14083h + 95;
        f14082g = i5 % 128;
        int i6 = i5 % 2;
        f fVar = this.f14089f;
        Object obj = null;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fVar = null;
        }
        Group group = fVar.f7202o;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        ImageView imageView = fVar.f7198k;
        if (z2) {
            i2 = R.drawable.onboard_sdk_ic_success;
        } else {
            i2 = R.drawable.onboard_sdk_ic_failure;
            int i7 = f14082g + 61;
            f14083h = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 4;
            }
        }
        imageView.setImageResource(i2);
        IncodeTextView incodeTextView = fVar.f7206s;
        if (z2) {
            int i9 = f14083h + 47;
            f14082g = i9 % 128;
            int i10 = i9 % 2;
            i3 = R.string.onboard_sdk_success;
        } else {
            i3 = R.string.onboard_sdk_ekyb_business_failure;
        }
        incodeTextView.setText(getString(i3));
        if (z2) {
            int i11 = f14083h + 67;
            f14082g = i11 % 128;
            if (i11 % 2 == 0) {
                Event event2 = Event.EKYB_SUCCEEDED;
                obj.hashCode();
                throw null;
            }
            event = Event.EKYB_SUCCEEDED;
        } else {
            event = Event.EKYB_FAILED;
        }
        EventUtils.sendEvent(getRepo(), event, getModule(), getScreenName());
    }

    @Override // com.incode.welcome_sdk.ui.ekyb.EKYBContract.View
    public final void hideResult() {
        int i2 = 2 % 2;
        int i3 = f14082g + 39;
        int i4 = i3 % 128;
        f14083h = i4;
        int i5 = i3 % 2;
        f fVar = this.f14089f;
        Object obj = null;
        if (fVar == null) {
            int i6 = i4 + 123;
            f14082g = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            fVar = null;
        }
        Group group = fVar.f7202o;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(8);
        EventUtils.sendScreenClosed(getRepo(), getScreenName(), Modules.EKYB);
        int i7 = f14082g + 35;
        f14083h = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void c(EKYBActivity eKYBActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(eKYBActivity, "");
        eKYBActivity.d().publishResult(IncodeWelcome.Companion.getInstance().getEkybBus(), new EKYBResult(ResultCode.USER_CANCELLED, null, 2, null));
        int i4 = f14083h + 107;
        f14082g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f14082g + 23;
        f14083h = i3 % 128;
        int i4 = i3 % 2;
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.ekyb.EKYBActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                EKYBActivity.c(this.f$0, dialogInterface, i5);
            }
        });
        int i5 = f14083h + 109;
        f14082g = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f14083h + 5;
        f14082g = i3 % 128;
        int i4 = i3 % 2;
        d().onDestroy();
        super.safeOnDestroy();
        int i5 = f14082g + 3;
        f14083h = i5 % 128;
        int i6 = i5 % 2;
    }

    private final boolean e(String str) {
        int i2 = 2 % 2;
        int i3 = f14083h + 117;
        f14082g = i3 % 128;
        int i4 = i3 % 2;
        boolean booleanExtra = getIntent().getBooleanExtra(str, false);
        int i5 = f14082g + 75;
        f14083h = i5 % 128;
        int i6 = i5 % 2;
        return booleanExtra;
    }

    private static void c(f fVar) {
        int i2 = 2 % 2;
        int i3 = f14082g + 75;
        f14083h = i3 % 128;
        int i4 = i3 % 2;
        fVar.f7188a.setFieldType(IncodeFormItem.a.f18150b);
        fVar.f7194g.setFieldType(IncodeFormItem.a.f18151c);
        fVar.f7193f.setFieldType(IncodeFormItem.a.f18152d);
        fVar.f7196i.setFieldType(IncodeFormItem.a.f18162o);
        fVar.f7197j.setFieldType(IncodeFormItem.a.f18155g);
        fVar.f7195h.setFieldType(IncodeFormItem.a.f18157i);
        fVar.f7201n.setFieldType(IncodeFormItem.a.f18160m);
        int i5 = f14083h + 63;
        f14082g = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(f fVar, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        IncodeFormItem incodeFormItem = fVar.f7194g;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem, "");
        incodeFormItem.setVisibility(z2 ? 0 : 8);
        IncodeFormItem incodeFormItem2 = fVar.f7191d;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem2, "");
        IncodeFormItem incodeFormItem3 = incodeFormItem2;
        if (z2) {
            int i7 = f14083h + 63;
            f14082g = i7 % 128;
            int i8 = i7 % 2;
            i2 = 0;
        } else {
            i2 = 8;
        }
        incodeFormItem3.setVisibility(i2);
        IncodeFormItem incodeFormItem4 = fVar.f7193f;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem4, "");
        IncodeFormItem incodeFormItem5 = incodeFormItem4;
        int i9 = 1;
        if (!(!z2)) {
            int i10 = f14083h + 109;
            f14082g = i10 % 128;
            i3 = i10 % 2 == 0 ? 1 : 0;
        } else {
            i3 = 8;
        }
        incodeFormItem5.setVisibility(i3);
        IncodeFormItem incodeFormItem6 = fVar.f7189b;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem6, "");
        IncodeFormItem incodeFormItem7 = incodeFormItem6;
        if (!(!z2)) {
            int i11 = f14083h + 35;
            f14082g = i11 % 128;
            int i12 = i11 % 2;
            i4 = 0;
        } else {
            i4 = 8;
        }
        incodeFormItem7.setVisibility(i4);
        IncodeFormItem incodeFormItem8 = fVar.f7196i;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem8, "");
        IncodeFormItem incodeFormItem9 = incodeFormItem8;
        if (z2) {
            int i13 = f14082g + 95;
            f14083h = i13 % 128;
            if (i13 % 2 == 0) {
                i9 = 0;
            }
        } else {
            i9 = 8;
        }
        incodeFormItem9.setVisibility(i9);
        IncodeFormItem incodeFormItem10 = fVar.f7197j;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem10, "");
        IncodeFormItem incodeFormItem11 = incodeFormItem10;
        if (z2) {
            i5 = 0;
        } else {
            int i14 = f14082g + 105;
            f14083h = i14 % 128;
            int i15 = i14 % 2;
            i5 = 8;
        }
        incodeFormItem11.setVisibility(i5);
        IncodeFormItem incodeFormItem12 = fVar.f7201n;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem12, "");
        incodeFormItem12.setVisibility(z2 ? 0 : 8);
    }

    static final class d extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f14096c = 1;

        /* JADX INFO: renamed from: e */
        private static int f14097e = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ f f14099b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f14096c + 3;
            f14097e = i3 % 128;
            int i4 = i3 % 2;
            c(str);
            Unit unit = Unit.INSTANCE;
            int i5 = f14097e + 73;
            f14096c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c(String str) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.areEqual(str, "US")) {
                EKYBActivity.access$handleUSASelection(EKYBActivity.this, this.f14099b);
                int i3 = f14096c + 23;
                f14097e = i3 % 128;
                int i4 = i3 % 2;
            } else if (Intrinsics.areEqual(str, "BR")) {
                int i5 = f14097e + 45;
                f14096c = i5 % 128;
                if (i5 % 2 == 0) {
                    EKYBActivity.access$handleBrazilSelection(EKYBActivity.this, this.f14099b);
                    int i6 = 51 / 0;
                } else {
                    EKYBActivity.access$handleBrazilSelection(EKYBActivity.this, this.f14099b);
                }
            }
            EKYBActivity.access$setCountryKey$p(EKYBActivity.this, str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.f14099b = fVar;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        EKYBActivity eKYBActivity = (EKYBActivity) objArr[0];
        f fVar = (f) objArr[1];
        int i2 = 2 % 2;
        IncodeFormItem incodeFormItem = fVar.f7201n;
        String[] stringArray = eKYBActivity.getResources().getStringArray(R.array.onboard_sdk_ekyc_countries);
        Intrinsics.checkNotNullExpressionValue(stringArray, "");
        String string = eKYBActivity.getString(R.string.onboard_sdk_ekyb_country);
        Intrinsics.checkNotNullExpressionValue(string, "");
        incodeFormItem.useAsSelector(stringArray, new String[]{"US", "BR"}, string, eKYBActivity.new d(fVar));
        int i3 = f14083h + 31;
        f14082g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void b(f fVar) {
        int i2 = 2 % 2;
        int i3 = f14083h + 5;
        f14082g = i3 % 128;
        int i4 = i3 % 2;
        IncodeFormItem incodeFormItem = fVar.f7195h;
        String string = getString(R.string.onboard_sdk_ekyc_tax_id_form_us_error_message);
        Intrinsics.checkNotNullExpressionValue(string, "");
        incodeFormItem.updateErrorMessage(string);
        String string2 = getString(R.string.onboard_sdk_ekyc_tax_id_form_us_title);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        incodeFormItem.updateTitleText(string2);
        incodeFormItem.setFieldType(IncodeFormItem.a.f18157i);
        fVar.f7197j.setFieldType(IncodeFormItem.a.f18155g);
        int i5 = f14083h + 21;
        f14082g = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void a(f fVar) {
        int i2 = 2 % 2;
        int i3 = f14082g + 57;
        f14083h = i3 % 128;
        int i4 = i3 % 2;
        IncodeFormItem incodeFormItem = fVar.f7195h;
        String string = getString(R.string.onboard_sdk_ekyc_tax_id_form_br_error_message);
        Intrinsics.checkNotNullExpressionValue(string, "");
        incodeFormItem.updateErrorMessage(string);
        String string2 = getString(R.string.onboard_sdk_ekyc_tax_id_form_br_title);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        incodeFormItem.updateTitleText(string2);
        incodeFormItem.setFieldType(IncodeFormItem.a.f18159l);
        fVar.f7197j.setFieldType(IncodeFormItem.a.f18156h);
        int i5 = f14083h + 59;
        f14082g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
    }

    static final class c extends Lambda implements Function1<IncodeFormItem, Unit> {

        /* JADX INFO: renamed from: d */
        private static int f14093d = 1;

        /* JADX INFO: renamed from: e */
        private static int f14094e = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Ref.BooleanRef f14095a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(IncodeFormItem incodeFormItem) {
            int i2 = 2 % 2;
            int i3 = f14093d + 103;
            f14094e = i3 % 128;
            int i4 = i3 % 2;
            a(incodeFormItem);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 85 / 0;
            }
            int i6 = f14093d + 17;
            f14094e = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private void a(IncodeFormItem incodeFormItem) {
            int i2 = 2 % 2;
            int i3 = f14094e + 79;
            f14093d = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(incodeFormItem, "");
                incodeFormItem.isValidString();
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(incodeFormItem, "");
            if (incodeFormItem.isValidString()) {
                incodeFormItem.removeError();
                return;
            }
            this.f14095a.element = false;
            IncodeFormItem.showErrorMessage$default(incodeFormItem, null, 1, null);
            int i4 = f14093d + 45;
            f14094e = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ref.BooleanRef booleanRef) {
            super(1);
            this.f14095a = booleanRef;
        }
    }

    private final boolean d(f fVar) {
        int i2 = 2 % 2;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        c cVar = new c(booleanRef);
        if (e("extraShowName")) {
            int i3 = f14082g + 111;
            f14083h = i3 % 128;
            if (i3 % 2 != 0) {
                IncodeFormItem incodeFormItem = fVar.f7188a;
                Intrinsics.checkNotNullExpressionValue(incodeFormItem, "");
                cVar.invoke(incodeFormItem);
                int i4 = 66 / 0;
            } else {
                IncodeFormItem incodeFormItem2 = fVar.f7188a;
                Intrinsics.checkNotNullExpressionValue(incodeFormItem2, "");
                cVar.invoke(incodeFormItem2);
            }
        }
        if (e("extraShowAddress")) {
            int i5 = f14083h + 65;
            f14082g = i5 % 128;
            int i6 = i5 % 2;
            IncodeFormItem incodeFormItem3 = fVar.f7194g;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem3, "");
            cVar.invoke(incodeFormItem3);
            IncodeFormItem incodeFormItem4 = fVar.f7193f;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem4, "");
            cVar.invoke(incodeFormItem4);
            IncodeFormItem incodeFormItem5 = fVar.f7189b;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem5, "");
            cVar.invoke(incodeFormItem5);
            IncodeFormItem incodeFormItem6 = fVar.f7196i;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem6, "");
            cVar.invoke(incodeFormItem6);
            IncodeFormItem incodeFormItem7 = fVar.f7197j;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem7, "");
            cVar.invoke(incodeFormItem7);
            IncodeFormItem incodeFormItem8 = fVar.f7201n;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem8, "");
            cVar.invoke(incodeFormItem8);
        }
        if (e("extraShowTaxId")) {
            IncodeFormItem incodeFormItem9 = fVar.f7195h;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem9, "");
            cVar.invoke(incodeFormItem9);
        }
        return booleanRef.element;
    }

    static {
        Object obj = null;
        int i2 = f14084j + 73;
        f14085l = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final void start(Context context, EKYB ekyb) {
        int i2 = 2 % 2;
        int i3 = f14082g + 111;
        f14083h = i3 % 128;
        int i4 = i3 % 2;
        f14081c.start(context, ekyb);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void e(f fVar) {
        int iA = IdCaptureViewModel.ag.AnonymousClass4.a();
        int iA2 = IdCaptureViewModel.ag.AnonymousClass4.a();
        int iA3 = IdCaptureViewModel.ag.AnonymousClass4.a();
        a(IdCaptureViewModel.ag.AnonymousClass4.a(), iA2, 206271691, iA, iA3, -206271691, new Object[]{this, fVar});
    }

    private static void c(f fVar, Bundle bundle) {
        int iA = IdCaptureViewModel.ag.AnonymousClass4.a();
        int iA2 = IdCaptureViewModel.ag.AnonymousClass4.a();
        int iA3 = IdCaptureViewModel.ag.AnonymousClass4.a();
        a(IdCaptureViewModel.ag.AnonymousClass4.a(), iA2, -1287867798, iA, iA3, 1287867799, new Object[]{fVar, bundle});
    }
}
