package com.incode.welcome_sdk.ui.bio_consent;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.d.d;
import com.incode.welcome_sdk.data.remote.beans.z;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.bio_consent.BiometricConsentContract;
import com.incode.welcome_sdk.views.IncodeButton;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
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
public final class BiometricConsentActivity extends BaseActivity implements BiometricConsentContract.View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f11126c = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f11127i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f11128k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f11129n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f11130o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f11131b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Inject
    public BiometricConsentPresenter f11132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScreenName f11133e = ScreenName.MANDATORY_BIOMETRIC_CONSENT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Modules f11134f = Modules.BIOMETRIC_CONSENT;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f11135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f11136h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f11137j;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8236instrumented$1$safeOnCreate$LandroidosBundleV(d dVar, BiometricConsentActivity biometricConsentActivity, View view) {
        Callback.onClick_enter(view);
        try {
            a(dVar, biometricConsentActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8237instrumented$2$safeOnCreate$LandroidosBundleV(d dVar, BiometricConsentActivity biometricConsentActivity, View view) {
        Callback.onClick_enter(view);
        try {
            c(dVar, biometricConsentActivity, view);
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
            String strKd = Qg.kd("TA\u0007D(", (short) (Od.Xd() ^ (1016352468 ^ (-1016348884))), (short) (Od.Xd() ^ (1846519009 ^ (-1846526078))));
            String strVd = hg.Vd("ZG", (short) (C1580rY.Xd() ^ (1281175673 ^ (-1281193594))), (short) (C1580rY.Xd() ^ ((1866836307 ^ 649036810) ^ (-1240102394))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("dQ\u0017T8", (short) (C1633zX.Xd() ^ ((839568860 ^ 2069734887) ^ (-1230443096))));
                String strYd = C1561oA.yd("\u001a\b", (short) (OY.Xd() ^ ((1621957767 ^ 192003134) ^ 1809627059)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("\u001d\fS\u0013x", (short) (C1633zX.Xd() ^ (782929061 ^ (-782927562))));
                    String strQd = Xg.qd("\u001c\u0012", (short) (C1607wl.Xd() ^ (1700764434 ^ 1700777836)), (short) (C1607wl.Xd() ^ (74893544 ^ 74881075)));
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
                        Method declaredMethod = Class.forName(Jg.Wd("f\u007f*`h", (short) (C1580rY.Xd() ^ (675669525 ^ (-675658950))), (short) (C1580rY.Xd() ^ ((1858390280 ^ 833424849) ^ (-1600772998))))).getDeclaredMethod(ZO.xd("'d", (short) (Od.Xd() ^ ((1925341218 ^ 1767057795) ^ (-462489231))), (short) (Od.Xd() ^ ((2056749597 ^ 1226280631) ^ (-864058703)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd = (short) (C1499aX.Xd() ^ ((1915967696 ^ 422622477) ^ (-1795410132)));
                                short sXd2 = (short) (C1499aX.Xd() ^ (1970453013 ^ (-1970460620)));
                                int[] iArr = new int["3x\u007fpv\u000e".length()];
                                QB qb = new QB("3x\u007fpv\u000e");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                                    i2++;
                                }
                                String str = new String(iArr, 0, i2);
                                Class<?> cls4 = Class.forName(Ig.wd("4gOBV+6 \u001e\u000b\bou\t\u001byB\u0005+\u0005?\u000e$", (short) (ZN.Xd() ^ (542056765 ^ 542069113))));
                                Class<?>[] clsArr = {Class.forName(EO.Od("\u001b9\u0001\u00138D\u0005\n.8[\u001bH9Vl", (short) (C1633zX.Xd() ^ (1566567978 ^ (-1566556876)))))};
                                Object[] objArr2 = {str};
                                short sXd3 = (short) (OY.Xd() ^ ((15354854 ^ 730576457) ^ 727825802));
                                int[] iArr2 = new int["HES1VOO?F+<HK=67".length()];
                                QB qb2 = new QB("HES1VOO?F+<HK=67");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                Method method = cls4.getMethod(new String(iArr2, 0, i3), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("\u0005s;z`", (short) (ZN.Xd() ^ (1275931703 ^ 1275931804)), (short) (ZN.Xd() ^ (2016806613 ^ 2016816546)));
                                    String strOd = C1561oA.od("\u001c\u0010", (short) (FB.Xd() ^ (1490922130 ^ 1490922679)));
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
                    String strKd2 = C1561oA.Kd("0\u001ff&\f", (short) (ZN.Xd() ^ (1503684800 ^ 1503669650)));
                    String strZd2 = Wg.Zd("\u0017\u0017", (short) (C1580rY.Xd() ^ (1072785809 ^ (-1072766623))), (short) (C1580rY.Xd() ^ ((1097124980 ^ 744234894) ^ (-1832424979))));
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
                        String strXd = C1561oA.Xd("A0w7\u001d", (short) (Od.Xd() ^ ((194963349 ^ 1376543144) ^ (-1502797385))));
                        String strVd2 = Wg.vd("4(", (short) (OY.Xd() ^ ((1639385563 ^ 54066093) ^ 1653581960)));
                        try {
                            Class<?> cls7 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls7.getField(strVd2) : cls7.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i4 = 233840880 ^ 233840827;
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

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f11129n;
        int i4 = i3 + 7;
        f11127i = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ScreenName screenName = this.f11133e;
        int i5 = i3 + 15;
        f11127i = i5 % 128;
        int i6 = i5 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f11129n;
        int i4 = i3 + 5;
        f11127i = i4 % 128;
        int i5 = i4 % 2;
        Modules modules = this.f11134f;
        int i6 = i3 + 55;
        f11127i = i6 % 128;
        if (i6 % 2 == 0) {
            return modules;
        }
        throw null;
    }

    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f11129n;
        int i4 = i3 + 49;
        f11127i = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f11137j;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i6 = i3 + 69;
        f11127i = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final void setId(String str) {
        int i2 = 2 % 2;
        int i3 = f11127i + 37;
        f11129n = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.f11137j = str;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.f11137j = str;
        int i4 = f11129n + 15;
        f11127i = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final String getTitle() {
        int i2 = 2 % 2;
        int i3 = f11129n + 51;
        f11127i = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f11135g;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = f11129n + 71;
        f11127i = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final void setTitle(String str) {
        int i2 = 2 % 2;
        int i3 = f11129n + 41;
        f11127i = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.f11135g = str;
            int i4 = 9 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.f11135g = str;
        }
        int i5 = f11127i + 21;
        f11129n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
    }

    public final BiometricConsentPresenter getPresenter() {
        int i2 = 2 % 2;
        int i3 = f11127i + 29;
        int i4 = i3 % 128;
        f11129n = i4;
        int i5 = i3 % 2;
        BiometricConsentPresenter biometricConsentPresenter = this.f11132d;
        if (biometricConsentPresenter != null) {
            int i6 = i4 + 113;
            f11127i = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 75 / 0;
            }
            return biometricConsentPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i8 = f11127i + 19;
        f11129n = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void setPresenter(BiometricConsentPresenter biometricConsentPresenter) {
        int i2 = 2 % 2;
        int i3 = f11127i + 31;
        f11129n = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(biometricConsentPresenter, "");
        this.f11132d = biometricConsentPresenter;
        int i5 = f11127i + 47;
        f11129n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BiometricConsentActivity biometricConsentActivity, CheckBox checkBox, CompoundButton compoundButton, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f11129n + 11;
        f11127i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(biometricConsentActivity, "");
        Intrinsics.checkNotNullParameter(checkBox, "");
        d dVar = biometricConsentActivity.f11131b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            dVar = null;
        }
        dVar.f7178b.setEnabled(checkBox.isChecked());
        int i5 = f11129n + 13;
        f11127i = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void a(d dVar, BiometricConsentActivity biometricConsentActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f11129n + 15;
        f11127i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(dVar, "");
        Intrinsics.checkNotNullParameter(biometricConsentActivity, "");
        IncodeButton incodeButton = dVar.f7178b;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        biometricConsentActivity.getPresenter().submitConsent(dVar.f7180d.isChecked(), biometricConsentActivity.getId());
        int i5 = f11129n + 29;
        f11127i = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void c(d dVar, BiometricConsentActivity biometricConsentActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f11129n + 37;
        f11127i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(dVar, "");
        Intrinsics.checkNotNullParameter(biometricConsentActivity, "");
        IncodeButton incodeButton = dVar.f7179c;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        biometricConsentActivity.getPresenter().submitConsent(false, biometricConsentActivity.getId());
        int i5 = f11127i + 1;
        f11129n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    @Override // com.incode.welcome_sdk.ui.BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void safeOnCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.bio_consent.BiometricConsentActivity.safeOnCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(BiometricConsentActivity biometricConsentActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = f11129n + 49;
        f11127i = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(biometricConsentActivity, "");
        biometricConsentActivity.getPresenter().submitConsent(false, biometricConsentActivity.getId());
        int i6 = f11129n + 117;
        f11127i = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    @Deprecated(message = "TODO: Figure out how to use the OnBackInvokedDispatcher once it's stable in androidx.activity")
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f11127i + 5;
        f11129n = i3 % 128;
        if (i3 % 2 == 0) {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.bio_consent.BiometricConsentActivity$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    BiometricConsentActivity.e(this.f$0, dialogInterface, i4);
                }
            });
            int i4 = 96 / 0;
        } else {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.bio_consent.BiometricConsentActivity$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i42) {
                    BiometricConsentActivity.e(this.f$0, dialogInterface, i42);
                }
            });
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, com.incode.welcome_sdk.ui.BaseView
    public final void closeScreen() {
        int i2 = 2 % 2;
        int i3 = f11127i + 115;
        f11129n = i3 % 128;
        int i4 = i3 % 2;
        finish();
        int i5 = f11129n + 123;
        f11127i = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11138b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11139c = 1;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, z zVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(zVar, "");
            Intent intent = new Intent(context, (Class<?>) BiometricConsentActivity.class);
            intent.putExtra("extraId", zVar.c());
            intent.putExtra("extraTitle", zVar.e());
            intent.putExtra("extraText", zVar.a());
            CX.ud();
            context.startActivity(intent);
            int i3 = f11138b + 47;
            f11139c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 42 / 0;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f11130o + 13;
        f11128k = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, z zVar) {
        int i2 = 2 % 2;
        int i3 = f11127i + 63;
        f11129n = i3 % 128;
        int i4 = i3 % 2;
        f11126c.start(context, zVar);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
