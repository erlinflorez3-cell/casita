package com.incode.welcome_sdk.ui.ekyc;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.extensions.o;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.commons.utils.i;
import com.incode.welcome_sdk.d.j;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.EKYC;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.EKYCResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.dynamic_forms.view.components.IncodeTextFieldKt;
import com.incode.welcome_sdk.ui.ekyc.EKYCContract;
import com.incode.welcome_sdk.views.IncodeFormItem;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import yg.C1499aX;
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
public final class EKYCActivity extends BaseActivity implements EKYCContract.View {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f14130d = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f14131k = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f14132m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f14133n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f14134o = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f14138f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<IncodeFormItem> f14140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, String> f14141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, String> f14142j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScreenName f14137e = ScreenName.EKYC_INPUT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Modules f14136c = Modules.EXTERNAL_VERIFICATION;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f14135b = LazyKt.lazy(new b());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set<IncodeFormItem> f14139g = new LinkedHashSet();

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | (~(i8 | i2)) | (~(i9 | i2));
        int i11 = ~i2;
        int i12 = (~(i11 | i6)) | (~(i9 | i6));
        int i13 = ~(i9 | i8 | i11);
        int i14 = i2 + i6 + i5 + ((-2109949842) * i7) + (2078889904 * i3);
        int i15 = i14 * i14;
        int i16 = ((-1963971821) * i2) + 932184064 + (61854959 * i6) + (1134570258 * i10) + (i12 * (-1134570258)) + ((-1134570258) * i13) + (1196425216 * i5) + (610271232 * i7) + (922746880 * i3) + (671350784 * i15);
        int i17 = (i2 * (-573803825)) + 196542130 + (i6 * (-573802789)) + (i10 * (-518)) + (i12 * 518) + (i13 * 518) + (i5 * (-573803307)) + (i7 * (-843101306)) + (i3 * (-1524517520)) + (i15 * 458489856);
        int i18 = i16 + (i17 * i17 * 64749568);
        if (i18 != 1) {
            if (i18 != 2) {
                return i18 != 3 ? a(objArr) : d(objArr);
            }
            EKYCActivity eKYCActivity = (EKYCActivity) objArr[0];
            ((Number) objArr[2]).intValue();
            int i19 = 2 % 2;
            Intrinsics.checkNotNullParameter(eKYCActivity, "");
            eKYCActivity.a().publishResult(IncodeWelcome.Companion.getInstance().getEkycBus(), new EKYCResult(ResultCode.USER_CANCELLED, null, 2, null));
            int i20 = f14131k + 113;
            f14132m = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        EKYCActivity eKYCActivity2 = (EKYCActivity) objArr[0];
        int i22 = 2 % 2;
        int i23 = f14131k + 17;
        f14132m = i23 % 128;
        int i24 = i23 % 2;
        for (IncodeFormItem incodeFormItem : eKYCActivity2.f14139g) {
            if (incodeFormItem.isValidString()) {
                int i25 = f14132m + 109;
                f14131k = i25 % 128;
                int i26 = i25 % 2;
                incodeFormItem.removeError();
            } else {
                IncodeFormItem.showErrorMessage$default(incodeFormItem, null, 1, null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$g$-Lcom-incode-welcome_sdk-d-j--V, reason: not valid java name */
    public static /* synthetic */ void m8460instrumented$0$g$Lcomincodewelcome_sdkdjV(EKYCActivity eKYCActivity, j jVar, View view) {
        Callback.onClick_enter(view);
        try {
            d(eKYCActivity, jVar, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$g$-Lcom-incode-welcome_sdk-d-j--V, reason: not valid java name */
    public static /* synthetic */ void m8461instrumented$1$g$Lcomincodewelcome_sdkdjV(EKYCActivity eKYCActivity, j jVar, View view) {
        Callback.onClick_enter(view);
        try {
            d(eKYCActivity, jVar, view);
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
            String strKd = Qg.kd("'\u0014Y\u0017z", (short) (C1580rY.Xd() ^ ((1772603573 ^ 279309497) ^ (-2030200745))), (short) (C1580rY.Xd() ^ (423612124 ^ (-423608998))));
            String strVd = hg.Vd(">+", (short) (C1607wl.Xd() ^ (1544132648 ^ 1544126598)), (short) (C1607wl.Xd() ^ ((320137926 ^ 175032130) ^ 427451052)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("\"\u000fT\u0012u", (short) (C1633zX.Xd() ^ ((974026258 ^ 26861592) ^ (-999797353))));
                String strYd = C1561oA.yd("4 ", (short) (FB.Xd() ^ ((1579913894 ^ 734905461) ^ 1978008229)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd(" \u000fV\u0016{", (short) (C1580rY.Xd() ^ ((259090151 ^ 1195153799) ^ (-1213049804))));
                    String strQd = Xg.qd("rh", (short) (C1633zX.Xd() ^ (757641096 ^ (-757643120))), (short) (C1633zX.Xd() ^ (1382222031 ^ (-1382233453))));
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd = (short) (C1580rY.Xd() ^ (1261610553 ^ (-1261619168)));
                        short sXd2 = (short) (C1580rY.Xd() ^ (435473217 ^ (-435460143)));
                        int[] iArr = new int["_VBmk".length()];
                        QB qb = new QB("_VBmk");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                            i2++;
                        }
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(ZO.xd("B.", (short) (Od.Xd() ^ (2035782719 ^ (-2035789790))), (short) (Od.Xd() ^ (896980680 ^ (-896976509)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("\u0012T/\u000b\bQ", (short) (FB.Xd() ^ (1414370114 ^ 1414373956)), (short) (FB.Xd() ^ ((1768013204 ^ 502674075) ^ 1956115688)))};
                                Method method = Class.forName(Ig.wd("\u001f\u0006I/t\"9\")tu] /5X5K\"o\"|N", (short) (C1499aX.Xd() ^ (101786927 ^ (-101805014))))).getMethod(C1561oA.Qd("sp~\\\u0002zzjqVgsvhab", (short) (FB.Xd() ^ ((1759164370 ^ 431699468) ^ 1902246463))), Class.forName(EO.Od("r:!gc_t!U\f/2_`\u000e$", (short) (C1633zX.Xd() ^ (515505775 ^ (-515474195))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("eT\u001c[A", (short) (ZN.Xd() ^ (726751832 ^ 726753361)), (short) (ZN.Xd() ^ ((210896681 ^ 773666628) ^ 579825338)));
                                    short sXd3 = (short) (C1499aX.Xd() ^ (679872775 ^ (-679902994)));
                                    int[] iArr2 = new int["!\u0015".length()];
                                    QB qb2 = new QB("!\u0015");
                                    int i3 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                                        i3++;
                                    }
                                    String str = new String(iArr2, 0, i3);
                                    try {
                                        Class<?> cls4 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls4.getField(str) : cls4.getDeclaredField(str);
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
                    String strKd2 = C1561oA.Kd("/\u001ee%\u000b", (short) (FB.Xd() ^ ((1592699015 ^ 1557171322) ^ 37622505)));
                    String strZd2 = Wg.Zd("\n`", (short) (Od.Xd() ^ ((1312196502 ^ 80265808) ^ (-1258179955))), (short) (Od.Xd() ^ (1628607436 ^ (-1628612595))));
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
                        short sXd4 = (short) (C1633zX.Xd() ^ ((2097283843 ^ 711534058) ^ (-1466644613)));
                        int[] iArr3 = new int["I8\u007f?%".length()];
                        QB qb3 = new QB("I8\u007f?%");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i4));
                            i4++;
                        }
                        String str2 = new String(iArr3, 0, i4);
                        short sXd5 = (short) (C1499aX.Xd() ^ ((551923418 ^ 173339588) ^ (-716249696)));
                        int[] iArr4 = new int["\\P".length()];
                        QB qb4 = new QB("\\P");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK((sXd5 ^ i5) + xuXd4.CK(iKK4));
                            i5++;
                        }
                        String str3 = new String(iArr4, 0, i5);
                        try {
                            Class<?> cls6 = Class.forName(str2);
                            Field field6 = 0 != 0 ? cls6.getField(str3) : cls6.getDeclaredField(str3);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i6 = 495862022 ^ 495862093;
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

    public static final /* synthetic */ IncodeWelcomeRepository access$getRepo(EKYCActivity eKYCActivity) {
        int i2 = 2 % 2;
        int i3 = f14132m + 103;
        f14131k = i3 % 128;
        if (i3 % 2 != 0) {
            return eKYCActivity.getRepo();
        }
        eKYCActivity.getRepo();
        throw null;
    }

    public static final /* synthetic */ void access$handleBrazilSelection(EKYCActivity eKYCActivity, j jVar) {
        int i2 = 2 % 2;
        int i3 = f14132m + 117;
        f14131k = i3 % 128;
        int i4 = i3 % 2;
        int iB = IncodeTextFieldKt.b.b();
        int iB2 = IncodeTextFieldKt.b.b();
        e(-1266882465, IncodeTextFieldKt.b.b(), iB, iB2, new Object[]{eKYCActivity, jVar}, 1266882465, IncodeTextFieldKt.b.b());
        int i5 = f14132m + 51;
        f14131k = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$handleUSASelection(EKYCActivity eKYCActivity, j jVar) {
        int i2 = 2 % 2;
        int i3 = f14132m + 115;
        f14131k = i3 % 128;
        int i4 = i3 % 2;
        eKYCActivity.a(jVar);
        if (i4 == 0) {
            int i5 = 15 / 0;
        }
        int i6 = f14132m + 61;
        f14131k = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$showNecessaryFormItems(EKYCActivity eKYCActivity) {
        int i2 = 2 % 2;
        int i3 = f14132m + 73;
        f14131k = i3 % 128;
        int i4 = i3 % 2;
        eKYCActivity.e();
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14143a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14144c = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, EKYC ekyc) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(ekyc, "");
            Intent intent = new Intent(context, (Class<?>) EKYCActivity.class);
            intent.putExtra("argVerifyName", ekyc.getVerifyName());
            intent.putExtra("argVerifyEmail", ekyc.getVerifyEmail());
            intent.putExtra("argVerifyAddress", ekyc.getVerifyAddress());
            intent.putExtra("argVerifyPhone", ekyc.getVerifyPhone());
            intent.putExtra("argVerifyTaxId", ekyc.getVerifyTaxId());
            intent.putExtra("argVerifyDateOfBirth", ekyc.getVerifyDateOfBirth());
            intent.putExtra("argVerifyNationality", ekyc.getVerifyNationality());
            intent.putExtra("argFullNameSource", ekyc.getNameSource().ordinal());
            intent.putExtra("argEmailSource", ekyc.getEmailSource().ordinal());
            intent.putExtra("argAddressSource", ekyc.getAddressSource().ordinal());
            intent.putExtra("argPhoneSource", ekyc.getPhoneSource().ordinal());
            intent.putExtra("argTaxIdSource", ekyc.getTaxIdSource().ordinal());
            intent.putExtra("argDateOfBirthSource", ekyc.getDateOfBirthSource().ordinal());
            intent.putExtra("argNationalitySource", ekyc.getNationalitySource().ordinal());
            CX.ud();
            context.startActivity(intent);
            int i3 = f14144c + 103;
            f14143a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 28 / 0;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f14131k + 95;
        int i4 = i3 % 128;
        f14132m = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ScreenName screenName = this.f14137e;
        int i5 = i4 + 53;
        f14131k = i5 % 128;
        int i6 = i5 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f14131k + 99;
        f14132m = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = this.f14136c;
        if (i4 != 0) {
            int i5 = 1 / 0;
        }
        return modules;
    }

    static final class b extends Lambda implements Function0<EKYCPresenter> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14152a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14153e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ EKYCPresenter invoke() {
            int i2 = 2 % 2;
            int i3 = f14152a + 95;
            f14153e = i3 % 128;
            int i4 = i3 % 2;
            EKYCPresenter eKYCPresenterE = e();
            int i5 = f14152a + 57;
            f14153e = i5 % 128;
            int i6 = i5 % 2;
            return eKYCPresenterE;
        }

        private EKYCPresenter e() {
            int i2 = 2 % 2;
            EKYCActivity eKYCActivity = EKYCActivity.this;
            EKYCPresenter eKYCPresenter = new EKYCPresenter(eKYCActivity, EKYCActivity.access$getRepo(eKYCActivity));
            int i3 = f14152a + 47;
            f14153e = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 52 / 0;
            }
            return eKYCPresenter;
        }

        b() {
            super(0);
        }
    }

    private final EKYCPresenter a() {
        EKYCPresenter eKYCPresenter;
        int i2 = 2 % 2;
        int i3 = f14132m + 93;
        f14131k = i3 % 128;
        if (i3 % 2 == 0) {
            eKYCPresenter = (EKYCPresenter) this.f14135b.getValue();
            int i4 = 47 / 0;
        } else {
            eKYCPresenter = (EKYCPresenter) this.f14135b.getValue();
        }
        int i5 = f14132m + 9;
        f14131k = i5 % 128;
        int i6 = i5 % 2;
        return eKYCPresenter;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        j jVarC = j.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(jVarC, "");
        this.f14138f = jVarC;
        d();
        j jVar = this.f14138f;
        if (jVar == null) {
            int i3 = f14131k + 1;
            f14132m = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f14131k + 17;
            f14132m = i5 % 128;
            int i6 = i5 % 2;
            jVar = null;
        }
        setContentView(jVar.b());
        b(jVar);
        c(jVar);
        d(jVar);
        int iB = IncodeTextFieldKt.b.b();
        int iB2 = IncodeTextFieldKt.b.b();
        int iB3 = IncodeTextFieldKt.b.b();
        e(-801019738, IncodeTextFieldKt.b.b(), iB, iB2, new Object[]{this, jVar}, 801019741, iB3);
        g(jVar);
        e();
        f(jVar);
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f14132m + 83;
        f14131k = i3 % 128;
        int i4 = i3 % 2;
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.ekyc.EKYCActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                EKYCActivity.e(this.f$0, dialogInterface, i5);
            }
        });
        int i5 = f14131k + 71;
        f14132m = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.ekyc.EKYCContract.View
    public final void showLoading() {
        int i2 = 2 % 2;
        int i3 = f14131k;
        int i4 = i3 + 101;
        f14132m = i4 % 128;
        int i5 = i4 % 2;
        j jVar = this.f14138f;
        if (jVar == null) {
            int i6 = i3 + 47;
            f14132m = i6 % 128;
            jVar = null;
            if (i6 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = 91 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        }
        jVar.f7243n.setVisibility(0);
        int i8 = f14131k + 91;
        f14132m = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    @Override // com.incode.welcome_sdk.ui.ekyc.EKYCContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void showResult(boolean r8) {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r2 = com.incode.welcome_sdk.ui.ekyc.EKYCActivity.f14132m
            int r1 = r2 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.ekyc.EKYCActivity.f14131k = r0
            int r1 = r1 % r6
            java.lang.String r5 = ""
            r3 = 0
            if (r1 != 0) goto L5a
            com.incode.welcome_sdk.d.j r4 = r7.f14138f
            r0 = 59
            int r0 = r0 / r3
            if (r4 != 0) goto L23
        L18:
            int r1 = r2 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.ekyc.EKYCActivity.f14131k = r0
            int r1 = r1 % r6
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r4 = 0
        L23:
            android.widget.LinearLayout r1 = r4.f7243n
            r0 = 4
            r1.setVisibility(r0)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r4.f7249t
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            android.view.View r2 = (android.view.View) r2
            r0 = 1
            r1 = 8
            if (r8 == r0) goto L58
            r0 = r1
        L36:
            r2.setVisibility(r0)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r4.f7242m
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            android.view.View r2 = (android.view.View) r2
            if (r8 != 0) goto L56
            int r0 = com.incode.welcome_sdk.ui.ekyc.EKYCActivity.f14132m
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.ekyc.EKYCActivity.f14131k = r0
            int r1 = r1 % r6
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.ekyc.EKYCActivity.f14132m = r0
            int r1 = r1 % r6
        L52:
            r2.setVisibility(r3)
            return
        L56:
            r3 = r1
            goto L52
        L58:
            r0 = r3
            goto L36
        L5a:
            com.incode.welcome_sdk.d.j r4 = r7.f14138f
            if (r4 != 0) goto L23
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.ekyc.EKYCActivity.showResult(boolean):void");
    }

    private final void d() {
        int i2 = 2 % 2;
        int i3 = f14132m + 43;
        f14131k = i3 % 128;
        int i4 = i3 % 2;
        String[] stringArray = getResources().getStringArray(R.array.onboard_sdk_ekyc_countries);
        Intrinsics.checkNotNullExpressionValue(stringArray, "");
        this.f14142j = MapsKt.toMap(ArraysKt.zip(stringArray, CollectionsKt.listOf((Object[]) new String[]{"US", "BR"})));
        String[] stringArray2 = getResources().getStringArray(R.array.onboard_sdk_ekyc_brazil_nationalities);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "");
        this.f14141i = MapsKt.toMap(ArraysKt.zip(stringArray2, CollectionsKt.listOf((Object[]) new String[]{"brazilian", "naturalizedBrazilian", "foreigner", "brazilianBornAbroad"})));
        int i5 = f14132m + 83;
        f14131k = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final void b(j jVar) {
        int i2 = 2 % 2;
        int i3 = f14132m + 123;
        f14131k = i3 % 128;
        int i4 = i3 % 2;
        IncodeFormItem incodeFormItem = jVar.f7237h;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem, "");
        IncodeFormItem incodeFormItem2 = jVar.f7241l;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem2, "");
        IncodeFormItem incodeFormItem3 = jVar.f7244o;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem3, "");
        IncodeFormItem incodeFormItem4 = jVar.f7238i;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem4, "");
        IncodeFormItem incodeFormItem5 = jVar.f7239j;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem5, "");
        IncodeFormItem incodeFormItem6 = jVar.f7236g;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem6, "");
        IncodeFormItem incodeFormItem7 = jVar.f7231b;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem7, "");
        IncodeFormItem incodeFormItem8 = jVar.f7233d;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem8, "");
        IncodeFormItem incodeFormItem9 = jVar.f7235f;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem9, "");
        IncodeFormItem incodeFormItem10 = jVar.f7234e;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem10, "");
        IncodeFormItem incodeFormItem11 = jVar.f7240k;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem11, "");
        IncodeFormItem incodeFormItem12 = jVar.f7232c;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem12, "");
        IncodeFormItem incodeFormItem13 = jVar.f7246q;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem13, "");
        this.f14140h = CollectionsKt.listOf((Object[]) new IncodeFormItem[]{incodeFormItem, incodeFormItem2, incodeFormItem3, incodeFormItem4, incodeFormItem5, incodeFormItem6, incodeFormItem7, incodeFormItem8, incodeFormItem9, incodeFormItem10, incodeFormItem11, incodeFormItem12, incodeFormItem13});
        int i5 = f14131k + 67;
        f14132m = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean d(String str) {
        int i2 = 2 % 2;
        int i3 = f14132m + 65;
        f14131k = i3 % 128;
        int i4 = i3 % 2;
        boolean booleanExtra = getIntent().getBooleanExtra(str, false);
        int i5 = f14131k + 75;
        f14132m = i5 % 128;
        if (i5 % 2 == 0) {
            return booleanExtra;
        }
        throw null;
    }

    private final void c(j jVar) {
        int i2 = 2 % 2;
        Set<IncodeFormItem> set = this.f14139g;
        IncodeFormItem incodeFormItem = jVar.f7233d;
        Intrinsics.checkNotNullExpressionValue(incodeFormItem, "");
        set.add(incodeFormItem);
        Object obj = null;
        if (d("argVerifyName")) {
            int i3 = f14132m + 41;
            f14131k = i3 % 128;
            if (i3 % 2 == 0) {
                IncodeFormItem incodeFormItem2 = jVar.f7237h;
                Intrinsics.checkNotNullExpressionValue(incodeFormItem2, "");
                set.add(incodeFormItem2);
                IncodeFormItem incodeFormItem3 = jVar.f7241l;
                Intrinsics.checkNotNullExpressionValue(incodeFormItem3, "");
                set.add(incodeFormItem3);
                obj.hashCode();
                throw null;
            }
            IncodeFormItem incodeFormItem4 = jVar.f7237h;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem4, "");
            set.add(incodeFormItem4);
            IncodeFormItem incodeFormItem5 = jVar.f7241l;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem5, "");
            set.add(incodeFormItem5);
        }
        if (d("argVerifyEmail")) {
            IncodeFormItem incodeFormItem6 = jVar.f7234e;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem6, "");
            set.add(incodeFormItem6);
        }
        if (d("argVerifyAddress")) {
            int i4 = f14131k + 87;
            f14132m = i4 % 128;
            int i5 = i4 % 2;
            IncodeFormItem incodeFormItem7 = jVar.f7244o;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem7, "");
            set.add(incodeFormItem7);
            IncodeFormItem incodeFormItem8 = jVar.f7238i;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem8, "");
            set.add(incodeFormItem8);
            IncodeFormItem incodeFormItem9 = jVar.f7239j;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem9, "");
            set.add(incodeFormItem9);
            IncodeFormItem incodeFormItem10 = jVar.f7236g;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem10, "");
            set.add(incodeFormItem10);
            IncodeFormItem incodeFormItem11 = jVar.f7231b;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem11, "");
            set.add(incodeFormItem11);
        }
        if (d("argVerifyPhone")) {
            int i6 = f14132m + 95;
            f14131k = i6 % 128;
            if (i6 % 2 == 0) {
                jVar.f7235f.setText("+");
                IncodeFormItem incodeFormItem12 = jVar.f7235f;
                Intrinsics.checkNotNullExpressionValue(incodeFormItem12, "");
                set.add(incodeFormItem12);
                throw null;
            }
            jVar.f7235f.setText("+");
            IncodeFormItem incodeFormItem13 = jVar.f7235f;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem13, "");
            set.add(incodeFormItem13);
        }
        if (d("argVerifyTaxId")) {
            int i7 = f14131k + 105;
            f14132m = i7 % 128;
            if (i7 % 2 != 0) {
                IncodeFormItem incodeFormItem14 = jVar.f7240k;
                Intrinsics.checkNotNullExpressionValue(incodeFormItem14, "");
                set.add(incodeFormItem14);
                throw null;
            }
            IncodeFormItem incodeFormItem15 = jVar.f7240k;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem15, "");
            set.add(incodeFormItem15);
        }
        if (d("argVerifyDateOfBirth")) {
            int i8 = f14131k + 55;
            f14132m = i8 % 128;
            int i9 = i8 % 2;
            IncodeFormItem incodeFormItem16 = jVar.f7232c;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem16, "");
            set.add(incodeFormItem16);
        }
    }

    private static void d(j jVar) {
        int i2 = 2 % 2;
        int i3 = f14132m + 59;
        f14131k = i3 % 128;
        int i4 = i3 % 2;
        jVar.f7233d.setFieldType(IncodeFormItem.a.f18160m);
        jVar.f7237h.setFieldType(IncodeFormItem.a.f18153e);
        jVar.f7241l.setFieldType(IncodeFormItem.a.f18153e);
        jVar.f7244o.setFieldType(IncodeFormItem.a.f18152d);
        jVar.f7238i.setFieldType(IncodeFormItem.a.f18151c);
        jVar.f7239j.setFieldType(IncodeFormItem.a.f18155g);
        jVar.f7236g.setFieldType(IncodeFormItem.a.f18162o);
        jVar.f7235f.setFieldType(IncodeFormItem.a.f18154f);
        jVar.f7234e.setFieldType(IncodeFormItem.a.f18158j);
        jVar.f7240k.setFieldType(IncodeFormItem.a.f18157i);
        jVar.f7246q.setFieldType(IncodeFormItem.a.f18160m);
        int i5 = f14131k + 35;
        f14132m = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        EKYCActivity eKYCActivity = (EKYCActivity) objArr[0];
        j jVar = (j) objArr[1];
        int i2 = 2 % 2;
        IncodeFormItem incodeFormItem = jVar.f7240k;
        String string = eKYCActivity.getString(R.string.onboard_sdk_ekyc_tax_id_form_br_error_message);
        Intrinsics.checkNotNullExpressionValue(string, "");
        incodeFormItem.updateErrorMessage(string);
        String string2 = eKYCActivity.getString(R.string.onboard_sdk_ekyc_tax_id_form_br_title);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        incodeFormItem.updateTitleText(string2);
        incodeFormItem.setFieldType(IncodeFormItem.a.f18159l);
        jVar.f7239j.setFieldType(IncodeFormItem.a.f18156h);
        Set<IncodeFormItem> set = eKYCActivity.f14139g;
        if (eKYCActivity.d("argVerifyNationality")) {
            int i3 = f14131k + 17;
            f14132m = i3 % 128;
            int i4 = i3 % 2;
            IncodeFormItem incodeFormItem2 = jVar.f7246q;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem2, "");
            set.add(incodeFormItem2);
        }
        set.remove(jVar.f7234e);
        set.remove(jVar.f7235f);
        int i5 = f14131k + 1;
        f14132m = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return null;
    }

    private final void a(j jVar) {
        int i2 = 2 % 2;
        int i3 = f14131k + 65;
        f14132m = i3 % 128;
        int i4 = i3 % 2;
        IncodeFormItem incodeFormItem = jVar.f7240k;
        String string = getString(R.string.onboard_sdk_ekyc_tax_id_form_us_error_message);
        Intrinsics.checkNotNullExpressionValue(string, "");
        incodeFormItem.updateErrorMessage(string);
        IncodeFormItem incodeFormItem2 = jVar.f7240k;
        String string2 = getString(R.string.onboard_sdk_ekyc_tax_id_form_us_title);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        incodeFormItem2.updateTitleText(string2);
        jVar.f7240k.setFieldType(IncodeFormItem.a.f18157i);
        jVar.f7239j.setFieldType(IncodeFormItem.a.f18155g);
        if (d("argVerifyEmail")) {
            int i5 = f14131k + 83;
            f14132m = i5 % 128;
            int i6 = i5 % 2;
            Set<IncodeFormItem> set = this.f14139g;
            IncodeFormItem incodeFormItem3 = jVar.f7234e;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem3, "");
            set.add(incodeFormItem3);
        }
        if (d("argVerifyPhone")) {
            Set<IncodeFormItem> set2 = this.f14139g;
            IncodeFormItem incodeFormItem4 = jVar.f7235f;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem4, "");
            set2.add(incodeFormItem4);
            int i7 = f14132m + 35;
            f14131k = i7 % 128;
            int i8 = i7 % 2;
        }
        this.f14139g.remove(jVar.f7246q);
    }

    static final class a extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14148b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14149c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ j f14150a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f14148b + 67;
            f14149c = i3 % 128;
            int i4 = i3 % 2;
            a(str);
            Unit unit = Unit.INSTANCE;
            int i5 = f14148b + 115;
            f14149c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(String str) {
            int i2 = 2 % 2;
            int i3 = f14149c + 101;
            f14148b = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.areEqual(str, "BR");
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.areEqual(str, "BR")) {
                int i4 = f14149c + 95;
                f14148b = i4 % 128;
                if (i4 % 2 == 0) {
                    EKYCActivity.access$handleBrazilSelection(EKYCActivity.this, this.f14150a);
                    throw null;
                }
                EKYCActivity.access$handleBrazilSelection(EKYCActivity.this, this.f14150a);
            } else if (Intrinsics.areEqual(str, "US")) {
                EKYCActivity.access$handleUSASelection(EKYCActivity.this, this.f14150a);
                int i5 = f14149c + 125;
                f14148b = i5 % 128;
                int i6 = i5 % 2;
            }
            EKYCActivity.access$showNecessaryFormItems(EKYCActivity.this);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(1);
            this.f14150a = jVar;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        EKYCActivity eKYCActivity = (EKYCActivity) objArr[0];
        j jVar = (j) objArr[1];
        int i2 = 2 % 2;
        IncodeFormItem incodeFormItem = jVar.f7233d;
        String[] stringArray = eKYCActivity.getResources().getStringArray(R.array.onboard_sdk_ekyc_countries);
        Intrinsics.checkNotNullExpressionValue(stringArray, "");
        String string = eKYCActivity.getString(R.string.onboard_sdk_ekyc_country_form_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        incodeFormItem.useAsSelector(stringArray, new String[]{"US", "BR"}, string, eKYCActivity.new a(jVar));
        jVar.f7233d.selectFirstOption();
        jVar.f7232c.useAsDatePicker();
        IncodeFormItem incodeFormItem2 = jVar.f7246q;
        String[] stringArray2 = eKYCActivity.getResources().getStringArray(R.array.onboard_sdk_ekyc_brazil_nationalities);
        String string2 = eKYCActivity.getString(R.string.onboard_sdk_ekyc_nationality_form_title);
        Intrinsics.checkNotNull(incodeFormItem2);
        Intrinsics.checkNotNull(stringArray2);
        Intrinsics.checkNotNull(string2);
        IncodeFormItem.useAsSelector$default(incodeFormItem2, stringArray2, new String[]{"brazilian", "naturalizedBrazilian", "foreigner", "brazilianBornAbroad"}, string2, null, 8, null);
        int i3 = f14131k + 99;
        f14132m = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final void d(EKYCActivity eKYCActivity, j jVar, View view) throws IOException {
        String text;
        Intrinsics.checkNotNullParameter(eKYCActivity, "");
        Intrinsics.checkNotNullParameter(jVar, "");
        if (eKYCActivity.c()) {
            String text2 = jVar.f7237h.getText();
            String text3 = jVar.f7241l.getText();
            String text4 = jVar.f7244o.getText();
            String text5 = jVar.f7238i.getText();
            String text6 = jVar.f7239j.getText();
            String text7 = jVar.f7236g.getText();
            String text8 = jVar.f7231b.getText();
            String strA = eKYCActivity.a(jVar.f7233d.getSpinnerSelectedItem());
            String strSanitizePhoneNumber = StringUtils.INSTANCE.sanitizePhoneNumber(jVar.f7235f.getText());
            String text9 = jVar.f7234e.getText();
            if (jVar.f7240k.getFiledType() == IncodeFormItem.a.f18159l) {
                text = StringUtils.removeSpecialCharactersFromCPF(jVar.f7240k.getText());
            } else {
                text = jVar.f7240k.getText();
            }
            EKYCForm eKYCForm = new EKYCForm(text2, text3, text4, text5, text6, text7, text8, strA, strSanitizePhoneNumber, text9, text, jVar.f7232c.getText(), eKYCActivity.e(jVar.f7246q.getSpinnerSelectedItem()));
            EventUtils.sendScreenOpened(eKYCActivity.getRepo(), ScreenName.EKYC_PROGRESS, Modules.EXTERNAL_VERIFICATION);
            eKYCActivity.a().processEkycForm(eKYCForm);
            Intrinsics.checkNotNull(view);
            ViewExtensionsKt.hideKeyboard(view);
            return;
        }
        int iB = IncodeTextFieldKt.b.b();
        int iB2 = IncodeTextFieldKt.b.b();
        int iB3 = IncodeTextFieldKt.b.b();
        e(1297705242, IncodeTextFieldKt.b.b(), iB, iB2, new Object[]{eKYCActivity}, -1297705241, iB3);
    }

    private final void g(final j jVar) {
        int i2 = 2 % 2;
        int i3 = f14131k + 73;
        f14132m = i3 % 128;
        if (i3 % 2 != 0) {
            jVar.f7230a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.ekyc.EKYCActivity$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EKYCActivity.m8461instrumented$1$g$Lcomincodewelcome_sdkdjV(this.f$0, jVar, view);
                }
            });
            int i4 = 24 / 0;
        } else {
            jVar.f7230a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.ekyc.EKYCActivity$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EKYCActivity.m8460instrumented$0$g$Lcomincodewelcome_sdkdjV(this.f$0, jVar, view);
                }
            });
        }
    }

    private final void e() {
        int i2;
        int i3 = 2 % 2;
        List<IncodeFormItem> list = this.f14140h;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        int i4 = f14131k + 51;
        f14132m = i4 % 128;
        int i5 = i4 % 2;
        for (IncodeFormItem incodeFormItem : list) {
            if (!(!this.f14139g.contains(r1))) {
                int i6 = f14131k + 41;
                f14132m = i6 % 128;
                int i7 = i6 % 2;
                i2 = 0;
            } else {
                i2 = 8;
            }
            incodeFormItem.setVisibility(i2);
        }
    }

    private final boolean c() {
        int i2 = 2 % 2;
        int i3 = f14131k + 81;
        f14132m = i3 % 128;
        if (i3 % 2 == 0) {
            Set<IncodeFormItem> set = this.f14139g;
            if ((set instanceof Collection) && set.isEmpty()) {
                return true;
            }
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (!((IncodeFormItem) it.next()).isValidString()) {
                    int i4 = f14131k + 103;
                    f14132m = i4 % 128;
                    return i4 % 2 != 0;
                }
            }
            return true;
        }
        boolean z2 = this.f14139g instanceof Collection;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String a(String str) {
        int i2 = 2 % 2;
        int i3 = f14131k;
        int i4 = i3 + 77;
        f14132m = i4 % 128;
        Map<String, String> map = null;
        if (i4 % 2 != 0) {
            map.hashCode();
            throw null;
        }
        Map<String, String> map2 = this.f14142j;
        if (map2 == null) {
            int i5 = i3 + 5;
            f14132m = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            map = map2;
        }
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        int i7 = f14131k + 107;
        f14132m = i7 % 128;
        int i8 = i7 % 2;
        return "";
    }

    private final String e(String str) {
        int i2 = 2 % 2;
        int i3 = f14132m + 75;
        f14131k = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = this.f14141i;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f14132m + 79;
            f14131k = i5 % 128;
            int i6 = i5 % 2;
            map = null;
        }
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        int i7 = f14131k + 11;
        f14132m = i7 % 128;
        int i8 = i7 % 2;
        return "";
    }

    static final class c extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14155a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14156e = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ IncodeFormItem f14157c;

        private void b(String str) {
            int i2 = 2 % 2;
            int i3 = f14156e + 125;
            f14155a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                this.f14157c.setText(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            this.f14157c.setText(str);
            int i4 = f14156e + 101;
            f14155a = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f14155a + 59;
            f14156e = i3 % 128;
            int i4 = i3 % 2;
            b(str);
            Unit unit = Unit.INSTANCE;
            int i5 = f14156e + 121;
            f14155a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(IncodeFormItem incodeFormItem) {
            super(1);
            this.f14157c = incodeFormItem;
        }
    }

    private static void d(IncodeFormItem incodeFormItem, String str) {
        int i2 = 2 % 2;
        o.a(str, new c(incodeFormItem));
        int i3 = f14131k + 105;
        f14132m = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final void f(j jVar) {
        String strE;
        int i2 = 2 % 2;
        if (WhenMappings.f14145c[b("argFullNameSource").ordinal()] == 1) {
            IncodeFormItem incodeFormItem = jVar.f7237h;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem, "");
            d(incodeFormItem, getRepo().getFirstName());
            IncodeFormItem incodeFormItem2 = jVar.f7241l;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem2, "");
            String lastName = getRepo().getLastName();
            if (lastName == null) {
                int i3 = f14131k + 67;
                f14132m = i3 % 128;
                int i4 = i3 % 2;
                lastName = "";
            }
            String middleName = getRepo().getMiddleName();
            if (middleName == null) {
                int i5 = f14131k;
                int i6 = i5 + 79;
                f14132m = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 69;
                f14132m = i8 % 128;
                int i9 = i8 % 2;
                middleName = "";
            }
            d(incodeFormItem2, StringsKt.trim((CharSequence) (lastName + Global.BLANK + middleName)).toString());
            int i10 = f14132m + 5;
            f14131k = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = WhenMappings.f14145c[b("argAddressSource").ordinal()];
        if (i12 == 1) {
            IncodeFormItem incodeFormItem3 = jVar.f7244o;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem3, "");
            d(incodeFormItem3, getRepo().getStreet());
            IncodeFormItem incodeFormItem4 = jVar.f7238i;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem4, "");
            d(incodeFormItem4, getRepo().getHouseNumber());
            IncodeFormItem incodeFormItem5 = jVar.f7239j;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem5, "");
            d(incodeFormItem5, getRepo().getPostalCode());
            IncodeFormItem incodeFormItem6 = jVar.f7236g;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem6, "");
            d(incodeFormItem6, getRepo().getState());
            IncodeFormItem incodeFormItem7 = jVar.f7231b;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem7, "");
            d(incodeFormItem7, getRepo().getCity());
        } else if (i12 == 2) {
            IncodeFormItem incodeFormItem8 = jVar.f7244o;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem8, "");
            d(incodeFormItem8, getRepo().getPoaStreet());
            IncodeFormItem incodeFormItem9 = jVar.f7239j;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem9, "");
            d(incodeFormItem9, getRepo().getPoaPostalCode());
            IncodeFormItem incodeFormItem10 = jVar.f7236g;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem10, "");
            d(incodeFormItem10, getRepo().getPoaState());
            IncodeFormItem incodeFormItem11 = jVar.f7231b;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem11, "");
            d(incodeFormItem11, getRepo().getPoaCity());
        }
        if (WhenMappings.f14145c[b("argDateOfBirthSource").ordinal()] == 1) {
            IncodeFormItem incodeFormItem12 = jVar.f7232c;
            Intrinsics.checkNotNullExpressionValue(incodeFormItem12, "");
            String birthDate = getRepo().getBirthDate();
            if (birthDate != null) {
                int i13 = f14132m + 67;
                f14131k = i13 % 128;
                int i14 = i13 % 2;
                strE = i.e(Long.parseLong(birthDate));
            } else {
                strE = null;
            }
            d(incodeFormItem12, strE);
        }
    }

    private final EKYC.DataInputSource b(String str) {
        int i2 = 2 % 2;
        int i3 = f14131k + 57;
        f14132m = i3 % 128;
        if (i3 % 2 != 0) {
            EKYC.DataInputSource dataInputSource = EKYC.DataInputSource.values()[getIntent().getIntExtra(str, EKYC.DataInputSource.USER_INPUT.ordinal())];
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EKYC.DataInputSource dataInputSource2 = EKYC.DataInputSource.values()[getIntent().getIntExtra(str, EKYC.DataInputSource.USER_INPUT.ordinal())];
        int i4 = f14132m + 89;
        f14131k = i4 % 128;
        int i5 = i4 % 2;
        return dataInputSource2;
    }

    static {
        int i2 = f14133n + 51;
        f14134o = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, EKYC ekyc) {
        int i2 = 2 % 2;
        int i3 = f14131k + 95;
        f14132m = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            f14130d.start(context, ekyc);
            obj.hashCode();
            throw null;
        }
        f14130d.start(context, ekyc);
        int i4 = f14132m + 35;
        f14131k = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(EKYCActivity eKYCActivity, DialogInterface dialogInterface, int i2) {
        Object[] objArr = {eKYCActivity, dialogInterface, Integer.valueOf(i2)};
        e(428381170, IncodeTextFieldKt.b.b(), IncodeTextFieldKt.b.b(), IncodeTextFieldKt.b.b(), objArr, -428381168, IncodeTextFieldKt.b.b());
    }

    private final void b() {
        int iB = IncodeTextFieldKt.b.b();
        int iB2 = IncodeTextFieldKt.b.b();
        int iB3 = IncodeTextFieldKt.b.b();
        e(1297705242, IncodeTextFieldKt.b.b(), iB, iB2, new Object[]{this}, -1297705241, iB3);
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f14145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14146d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14147e = 0;

        static {
            int[] iArr = new int[EKYC.DataInputSource.values().length];
            try {
                iArr[EKYC.DataInputSource.DOCUMENT.ordinal()] = 1;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EKYC.DataInputSource.PROOF_OF_ADDRESS.ordinal()] = 2;
                int i3 = f14146d + 69;
                f14147e = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14145c = iArr;
            int i6 = f14146d + 53;
            f14147e = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private final void h(j jVar) {
        int iB = IncodeTextFieldKt.b.b();
        int iB2 = IncodeTextFieldKt.b.b();
        int iB3 = IncodeTextFieldKt.b.b();
        e(-801019738, IncodeTextFieldKt.b.b(), iB, iB2, new Object[]{this, jVar}, 801019741, iB3);
    }

    private final void e(j jVar) {
        int iB = IncodeTextFieldKt.b.b();
        int iB2 = IncodeTextFieldKt.b.b();
        int iB3 = IncodeTextFieldKt.b.b();
        e(-1266882465, IncodeTextFieldKt.b.b(), iB, iB2, new Object[]{this, jVar}, 1266882465, iB3);
    }
}
