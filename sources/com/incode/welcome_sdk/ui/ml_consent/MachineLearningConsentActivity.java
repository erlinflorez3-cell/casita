package com.incode.welcome_sdk.ui.ml_consent;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.d.p;
import com.incode.welcome_sdk.modules.MachineLearningConsent;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.MachineLearningConsentResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentContract;
import com.incode.welcome_sdk.views.IncodeButton;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
public final class MachineLearningConsentActivity extends BaseActivity implements MachineLearningConsentContract.View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f16394c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f16395h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f16396i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f16397j = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f16398o = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f16399b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Inject
    public MachineLearningConsentPresenter f16400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f16401e = LazyKt.lazy(new b());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScreenName f16402f = ScreenName.MACHINE_LEARNING_CONSENT;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Modules f16403g = Modules.ML_CONSENT;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8506instrumented$0$safeOnCreate$LandroidosBundleV(MachineLearningConsentActivity machineLearningConsentActivity, View view) {
        Callback.onClick_enter(view);
        try {
            a(machineLearningConsentActivity, view);
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
            String strKd = Qg.kd("*\u0017\\\u001a}", (short) (C1580rY.Xd() ^ ((1996031778 ^ 1299887250) ^ (-998485268))), (short) (C1580rY.Xd() ^ (474947460 ^ (-474964146))));
            String strVd = hg.Vd("G4", (short) (C1499aX.Xd() ^ (331394554 ^ (-331406927))), (short) (C1499aX.Xd() ^ (695376341 ^ (-695379950))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("H5z8\u001c", (short) (C1580rY.Xd() ^ (385697166 ^ (-385684921))));
                String strYd = C1561oA.yd("dP", (short) (C1499aX.Xd() ^ ((1489820542 ^ 588509892) ^ (-2078227115))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    short sXd = (short) (C1633zX.Xd() ^ (1223843243 ^ (-1223851577)));
                    int[] iArr = new int[" \u000fV\u0016{".length()];
                    QB qb = new QB(" \u000fV\u0016{");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    String strQd = Xg.qd("<2", (short) (C1633zX.Xd() ^ (571456559 ^ (-571441345))), (short) (C1633zX.Xd() ^ (1833411089 ^ (-1833413316))));
                    try {
                        Class<?> cls3 = Class.forName(str);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("\u0006n8uY", (short) (ZN.Xd() ^ (1873325212 ^ 1873317988)), (short) (ZN.Xd() ^ (1727892074 ^ 1727890185)))).getDeclaredMethod(ZO.xd("kK", (short) (Od.Xd() ^ (19931372 ^ (-19943836))), (short) (Od.Xd() ^ ((1265724076 ^ 1632436830) ^ (-708577599)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("W\u000fDe\u001a\\", (short) (C1633zX.Xd() ^ (1015590933 ^ (-1015583920))), (short) (C1633zX.Xd() ^ (1362731206 ^ (-1362731356))))};
                                Method method = Class.forName(Ig.wd("C)1ZOlOx_\u001b @fa{R+E\f6hGe", (short) (Od.Xd() ^ ((973782894 ^ 1255794389) ^ (-1892885202))))).getMethod(C1561oA.Qd("\r\n\u0018u\u001b\u0014\u0014\u0004\u000bo\u0001\r\u0010\u0002z{", (short) (FB.Xd() ^ (507068643 ^ 507069719))), Class.forName(EO.Od("g\u0011T^j\u0007O4|Fe)rwXr", (short) (FB.Xd() ^ ((1369140485 ^ 201432711) ^ 1570433889)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("\u0005s;z`", (short) (FB.Xd() ^ ((937236523 ^ 343163981) ^ 598278222)), (short) (FB.Xd() ^ ((1306628738 ^ 1352227537) ^ 494451762)));
                                    String strOd = C1561oA.od("}q", (short) (C1499aX.Xd() ^ ((739557581 ^ 1794593190) ^ (-1189336522))));
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
                    String strKd2 = C1561oA.Kd("|k3rX", (short) (C1499aX.Xd() ^ ((1684911381 ^ 1726717324) ^ (-42345571))));
                    String strZd2 = Wg.Zd("\u00061", (short) (OY.Xd() ^ ((1528875856 ^ 849580382) ^ 1770218223)), (short) (OY.Xd() ^ ((1081359204 ^ 421423344) ^ 1500151420)));
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
                        short sXd2 = (short) (OY.Xd() ^ (1193371494 ^ 1193354617));
                        int[] iArr2 = new int["\bv>}c".length()];
                        QB qb2 = new QB("\bv>}c");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                            i3++;
                        }
                        String str2 = new String(iArr2, 0, i3);
                        String strVd2 = Wg.vd("J>", (short) (C1633zX.Xd() ^ ((1188257107 ^ 340536842) ^ (-1386165518))));
                        try {
                            Class<?> cls6 = Class.forName(str2);
                            Field field6 = 0 != 0 ? cls6.getField(strVd2) : cls6.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i4 = (463592138 ^ 1160017203) ^ 1585819570;
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16404a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16405b = 1;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, MachineLearningConsent.ConsentType consentType) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(consentType, "");
            Intent intent = new Intent(context, (Class<?>) MachineLearningConsentActivity.class);
            intent.putExtra("extraConsentType", consentType);
            CX.ud();
            context.startActivity(intent);
            int i3 = f16405b + 75;
            f16404a = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final MachineLearningConsentPresenter getPresenter() {
        int i2 = 2 % 2;
        int i3 = f16397j + 97;
        f16395h = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        MachineLearningConsentPresenter machineLearningConsentPresenter = this.f16400d;
        if (machineLearningConsentPresenter != null) {
            return machineLearningConsentPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = f16397j + 29;
        f16395h = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setPresenter(MachineLearningConsentPresenter machineLearningConsentPresenter) {
        int i2 = 2 % 2;
        int i3 = f16395h + 15;
        f16397j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(machineLearningConsentPresenter, "");
        this.f16400d = machineLearningConsentPresenter;
        int i5 = f16397j + 71;
        f16395h = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class b extends Lambda implements Function0<MachineLearningConsent.ConsentType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16406a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16407d = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ MachineLearningConsent.ConsentType invoke() {
            int i2 = 2 % 2;
            int i3 = f16406a + 121;
            f16407d = i3 % 128;
            int i4 = i3 % 2;
            MachineLearningConsent.ConsentType consentTypeB = b();
            int i5 = f16407d + 125;
            f16406a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 77 / 0;
            }
            return consentTypeB;
        }

        private MachineLearningConsent.ConsentType b() {
            int i2 = 2 % 2;
            int i3 = f16407d + 63;
            f16406a = i3 % 128;
            int i4 = i3 % 2;
            MachineLearningConsent.ConsentType serializableExtra = MachineLearningConsentActivity.this.getIntent().getSerializableExtra("extraConsentType");
            if (serializableExtra == null) {
                int i5 = f16406a + 85;
                f16407d = i5 % 128;
                int i6 = i5 % 2;
                serializableExtra = MachineLearningConsent.ConsentType.US;
            }
            Intrinsics.checkNotNull(serializableExtra, "");
            MachineLearningConsent.ConsentType consentType = (MachineLearningConsent.ConsentType) serializableExtra;
            int i7 = f16407d + 29;
            f16406a = i7 % 128;
            int i8 = i7 % 2;
            return consentType;
        }

        b() {
            super(0);
        }
    }

    private final MachineLearningConsent.ConsentType b() {
        int i2 = 2 % 2;
        int i3 = f16397j + 99;
        f16395h = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        MachineLearningConsent.ConsentType consentType = (MachineLearningConsent.ConsentType) this.f16401e.getValue();
        int i4 = f16395h + 93;
        f16397j = i4 % 128;
        if (i4 % 2 == 0) {
            return consentType;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f16397j;
        int i4 = i3 + 49;
        f16395h = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f16402f;
        int i6 = i3 + 27;
        f16395h = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f16397j + 85;
        int i4 = i3 % 128;
        f16395h = i4;
        int i5 = i3 % 2;
        Modules modules = this.f16403g;
        int i6 = i4 + 13;
        f16397j = i6 % 128;
        if (i6 % 2 == 0) {
            return modules;
        }
        throw null;
    }

    private static final void a(MachineLearningConsentActivity machineLearningConsentActivity, View view) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(machineLearningConsentActivity, "");
        p pVar = machineLearningConsentActivity.f16399b;
        p pVar2 = null;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pVar = null;
        }
        IncodeButton incodeButton = pVar.f7311a;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        MachineLearningConsentPresenter presenter = machineLearningConsentActivity.getPresenter();
        p pVar3 = machineLearningConsentActivity.f16399b;
        if (pVar3 == null) {
            int i3 = f16395h + 27;
            f16397j = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            pVar2 = pVar3;
        }
        presenter.submitConsent(pVar2.f7314d.isChecked());
        int i5 = f16395h + 43;
        f16397j = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        String upperCase;
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        p pVarD = p.d(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(pVarD, "");
        this.f16399b = pVarD;
        p pVar = null;
        if (pVarD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pVarD = null;
        }
        setContentView(pVarD.e());
        DaggerMachineLearningConsentComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent()).machineLearningConsentPresenterModule(new MachineLearningConsentPresenterModule(this)).build().inject(this);
        if (b() != MachineLearningConsent.ConsentType.US) {
            String string = Locale.getDefault().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            upperCase = string.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        } else {
            int i3 = f16395h + 23;
            f16397j = i3 % 128;
            if (i3 % 2 != 0) {
                pVar.hashCode();
                throw null;
            }
            upperCase = "EN_US";
        }
        getPresenter().getConsent(b().getType(), upperCase, "ML");
        p pVar2 = this.f16399b;
        if (pVar2 == null) {
            int i4 = f16397j + 125;
            f16395h = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            pVar = pVar2;
        }
        pVar.f7311a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MachineLearningConsentActivity.m8506instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
    }

    @Override // com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentContract.View
    public final void showConsent(String str, String str2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        p pVar = this.f16399b;
        p pVar2 = null;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pVar = null;
        }
        pVar.f7313c.setText(str);
        p pVar3 = this.f16399b;
        if (pVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f16397j + 77;
            f16395h = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 2;
            }
            pVar3 = null;
        }
        pVar3.f7312b.setText(StringUtils.INSTANCE.fromHtml(str2));
        p pVar4 = this.f16399b;
        if (pVar4 == null) {
            int i5 = f16395h + 123;
            f16397j = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = f16395h + 99;
            f16397j = i7 % 128;
            int i8 = i7 % 2;
            pVar4 = null;
        }
        Linkify.addLinks(pVar4.f7312b, 1);
        p pVar5 = this.f16399b;
        if (pVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            pVar2 = pVar5;
        }
        pVar2.f7312b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MachineLearningConsentActivity machineLearningConsentActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(machineLearningConsentActivity, "");
        machineLearningConsentActivity.getPresenter().publishResult(new MachineLearningConsentResult(ResultCode.USER_CANCELLED, null, false, 6, null));
        int i4 = f16397j + 31;
        f16395h = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f16395h + 115;
        f16397j = i3 % 128;
        int i4 = i3 % 2;
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                MachineLearningConsentActivity.e(this.f$0, dialogInterface, i5);
            }
        });
        int i5 = f16397j + 23;
        f16395h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, com.incode.welcome_sdk.ui.BaseView
    public final void closeScreen() {
        int i2 = 2 % 2;
        int i3 = f16395h + 5;
        f16397j = i3 % 128;
        if (i3 % 2 == 0) {
            finish();
            return;
        }
        finish();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f16394c = new Companion(defaultConstructorMarker);
        int i2 = f16396i + 111;
        f16398o = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @JvmStatic
    public static final void start(Context context, MachineLearningConsent.ConsentType consentType) {
        int i2 = 2 % 2;
        int i3 = f16395h + 125;
        f16397j = i3 % 128;
        int i4 = i3 % 2;
        f16394c.start(context, consentType);
        if (i4 != 0) {
            int i5 = 64 / 0;
        }
    }
}
