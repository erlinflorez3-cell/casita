package com.incode.welcome_sdk.ui.name;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.f;
import com.incode.welcome_sdk.d.r;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.NameResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.name.NameContract;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeEditText;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class NameActivity extends BaseActivity implements NameContract.View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f16453b = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f16454g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f16455h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f16456i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f16457j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    public NamePresenter f16458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f16459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScreenName f16460e = ScreenName.NAME_INPUT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Modules f16461f = Modules.NAME_CAPTURE;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8510instrumented$0$safeOnCreate$LandroidosBundleV(NameActivity nameActivity, View view) {
        Callback.onClick_enter(view);
        try {
            d(nameActivity, view);
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
            String strKd = Qg.kd("\tu;x\\", (short) (ZN.Xd() ^ (187784593 ^ 187772915)), (short) (ZN.Xd() ^ (1703336471 ^ 1703342324)));
            String strVd = hg.Vd("S@", (short) (Od.Xd() ^ (1471865661 ^ (-1471872557))), (short) (Od.Xd() ^ ((735369483 ^ 401571470) ^ (-1010546479))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd = (short) (ZN.Xd() ^ (216079047 ^ 216083237));
                int[] iArr = new int["I6{9\u001d".length()];
                QB qb = new QB("I6{9\u001d");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                short sXd2 = (short) (C1499aX.Xd() ^ (1555427021 ^ (-1555412983)));
                int[] iArr2 = new int["\u001d\u000b".length()];
                QB qb2 = new QB("\u001d\u000b");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 0 != 0 ? cls2.getField(str2) : cls2.getDeclaredField(str2);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd = C1561oA.Yd("\nx@\u007fe", (short) (Od.Xd() ^ ((2095139283 ^ 830627892) ^ (-1298364094))));
                    String strQd = Xg.qd("&\u001c", (short) (C1607wl.Xd() ^ (2060512897 ^ 2060503203)), (short) (C1607wl.Xd() ^ (1579408145 ^ 1579404783)));
                    try {
                        Class<?> cls3 = Class.forName(strYd);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("[&*Qp", (short) (ZN.Xd() ^ ((1282669391 ^ 858300669) ^ 2136702323)), (short) (ZN.Xd() ^ ((597122795 ^ 168558519) ^ 698136262)))).getDeclaredMethod(ZO.xd("\u001e\u001e", (short) (C1580rY.Xd() ^ (699609731 ^ (-699616753))), (short) (C1580rY.Xd() ^ (2036253310 ^ (-2036239724)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd = C1626yg.Ud("8A%]S?", (short) (OY.Xd() ^ ((890860617 ^ 851143394) ^ 128069423)), (short) (OY.Xd() ^ (2035035747 ^ 2035033884)));
                                Class<?> cls4 = Class.forName(Ig.wd("P,4]:\u007fZkz\u0006\u0003+qtfE\u001e8\u000f9\u0014R8", (short) (C1633zX.Xd() ^ ((1008808923 ^ 903299193) ^ (-167135067)))));
                                Class<?>[] clsArr = new Class[1];
                                short sXd3 = (short) (Od.Xd() ^ (1695724065 ^ (-1695722760)));
                                int[] iArr3 = new int["|<!qWCZ\u0019qYz<\u0006|[w".length()];
                                QB qb3 = new QB("|<!qWCZ\u0019qYz<\u0006|[w");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i4)) + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                clsArr[0] = Class.forName(new String(iArr3, 0, i4));
                                Object[] objArr2 = {strUd};
                                Method method = cls4.getMethod(C1561oA.Qd(" \u001d+\t.''\u0017\u001e\u0003\u0014 #\u0015\u000e\u000f", (short) (C1499aX.Xd() ^ (496810440 ^ (-496812893)))), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("%\u0014[\u001b\u0001", (short) (ZN.Xd() ^ (1327105272 ^ 1327105341)), (short) (ZN.Xd() ^ (1307322534 ^ 1307317181)));
                                    String strOd = C1561oA.od("\u0007z", (short) (ZN.Xd() ^ ((1673768303 ^ 1852585087) ^ 229620893)));
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
                    short sXd4 = (short) (C1499aX.Xd() ^ ((2113400872 ^ 1958521808) ^ (-155934025)));
                    int[] iArr4 = new int["I8\u007f?%".length()];
                    QB qb4 = new QB("I8\u007f?%");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd4 + sXd4) + i5));
                        i5++;
                    }
                    String str3 = new String(iArr4, 0, i5);
                    String strZd2 = Wg.Zd("\\>", (short) (FB.Xd() ^ ((1229867250 ^ 2098148832) ^ 876682843)), (short) (FB.Xd() ^ ((1709928541 ^ 905605269) ^ 1343292258)));
                    try {
                        Class<?> cls6 = Class.forName(str3);
                        Field field5 = 0 != 0 ? cls6.getField(strZd2) : cls6.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("7&m-\u0013", (short) (C1607wl.Xd() ^ (1164683014 ^ 1164701928)));
                        String strVd2 = Wg.vd("\r\u0001", (short) (OY.Xd() ^ (219629460 ^ 219613358)));
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
                        int i6 = 858559249 ^ 858559322;
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

    public static final /* synthetic */ r access$getBinding$p(NameActivity nameActivity) {
        int i2 = 2 % 2;
        int i3 = f16456i;
        int i4 = i3 + 53;
        f16455h = i4 % 128;
        int i5 = i4 % 2;
        r rVar = nameActivity.f16459d;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 109;
        f16455h = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 76 / 0;
        }
        return rVar;
    }

    public final NamePresenter getPresenter() {
        int i2 = 2 % 2;
        int i3 = f16455h;
        int i4 = i3 + 37;
        f16456i = i4 % 128;
        int i5 = i4 % 2;
        NamePresenter namePresenter = this.f16458c;
        if (namePresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i6 = i3 + 121;
        f16456i = i6 % 128;
        int i7 = i6 % 2;
        return namePresenter;
    }

    public final void setPresenter(NamePresenter namePresenter) {
        int i2 = 2 % 2;
        int i3 = f16456i + 107;
        f16455h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(namePresenter, "");
        this.f16458c = namePresenter;
        int i5 = f16456i + 35;
        f16455h = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f16456i;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f16455h = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ScreenName screenName = this.f16460e;
        int i5 = i3 + 109;
        f16455h = i5 % 128;
        int i6 = i5 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f16456i + 81;
        f16455h = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = this.f16461f;
        if (i4 == 0) {
            int i5 = 46 / 0;
        }
        return modules;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16462a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16463c = 1;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) NameActivity.class);
            CX.ud();
            context.startActivity(intent);
            int i3 = f16462a + 89;
            f16463c = i3 % 128;
            int i4 = i3 % 2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final void d(NameActivity nameActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f16456i + 57;
        f16455h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(nameActivity, "");
        nameActivity.c();
        int i5 = f16455h + 125;
        f16456i = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(r rVar, NameActivity nameActivity, TextView textView, int i2, KeyEvent keyEvent) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rVar, "");
        Intrinsics.checkNotNullParameter(nameActivity, "");
        if (i2 == 4 && rVar.f7327e.isEnabled()) {
            int i4 = f16456i + 51;
            f16455h = i4 % 128;
            int i5 = i4 % 2;
            nameActivity.c();
            return true;
        }
        int i6 = f16456i + 115;
        f16455h = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        r rVarA = r.a(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(rVarA, "");
        this.f16459d = rVarA;
        final r rVar = null;
        if (rVarA == null) {
            int i3 = f16455h + 125;
            f16456i = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            rVarA = null;
        }
        setContentView(rVarA.e());
        DaggerNameComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent()).namePresenterModule(new NamePresenterModule(this)).build().inject(this);
        r rVar2 = this.f16459d;
        if (rVar2 == null) {
            int i4 = f16455h + 51;
            f16456i = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 75 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else {
            rVar = rVar2;
        }
        rVar.f7327e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.name.NameActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NameActivity.m8510instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        IncodeEditText incodeEditText = rVar.f7326d;
        Intrinsics.checkNotNullExpressionValue(incodeEditText, "");
        incodeEditText.addTextChangedListener(new TextWatcher() { // from class: com.incode.welcome_sdk.ui.name.NameActivity$safeOnCreate$lambda$3$$inlined$doOnTextChanged$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f16464a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f16465d = 0;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int i6 = 2 % 2;
                int i7 = f16464a + 37;
                f16465d = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 22 / 0;
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                int i9 = 2 % 2;
                int i10 = f16464a + 105;
                f16465d = i10 % 128;
                if (i10 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                int i9 = 2 % 2;
                r rVarAccess$getBinding$p = NameActivity.access$getBinding$p(this.f16466c);
                Object obj = null;
                if (rVarAccess$getBinding$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i10 = f16464a + 65;
                    f16465d = i10 % 128;
                    int i11 = i10 % 2;
                    rVarAccess$getBinding$p = null;
                }
                IncodeButton incodeButton = rVarAccess$getBinding$p.f7327e;
                r rVarAccess$getBinding$p2 = NameActivity.access$getBinding$p(this.f16466c);
                if (rVarAccess$getBinding$p2 == null) {
                    int i12 = f16465d + 77;
                    f16464a = i12 % 128;
                    if (i12 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        obj.hashCode();
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    rVarAccess$getBinding$p2 = null;
                }
                IncodeEditText incodeEditText2 = rVarAccess$getBinding$p2.f7326d;
                Intrinsics.checkNotNullExpressionValue(incodeEditText2, "");
                incodeButton.setEnabled(f.d(incodeEditText2));
                int i13 = f16464a + 19;
                f16465d = i13 % 128;
                if (i13 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        rVar.f7326d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.incode.welcome_sdk.ui.name.NameActivity$$ExternalSyntheticLambda1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                return NameActivity.a(rVar, this, textView, i6, keyEvent);
            }
        });
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f16455h + 113;
        f16456i = i3 % 128;
        int i4 = i3 % 2;
        getPresenter().onDestroy();
        super.safeOnDestroy();
        int i5 = f16455h + 89;
        f16456i = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void c() {
        int i2 = 2 % 2;
        NamePresenter presenter = getPresenter();
        r rVar = this.f16459d;
        if (rVar == null) {
            int i3 = f16455h + 51;
            f16456i = i3 % 128;
            int i4 = i3 % 2;
            rVar = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i4 != 0) {
                throw null;
            }
            int i5 = f16456i + 9;
            f16455h = i5 % 128;
            int i6 = i5 % 2;
        }
        presenter.submitName(String.valueOf(rVar.f7326d.getText()));
    }

    @Override // com.incode.welcome_sdk.ui.name.NameContract.View
    public final void enableContinueButton(boolean z2) {
        int i2 = 2 % 2;
        r rVar = this.f16459d;
        if (rVar == null) {
            int i3 = f16455h + 101;
            f16456i = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 63 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            int i5 = f16456i + 117;
            f16455h = i5 % 128;
            int i6 = i5 % 2;
            rVar = null;
        }
        rVar.f7327e.setEnabled(z2);
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void publishUserCancelled() {
        int i2 = 2 % 2;
        super.publishUserCancelled();
        getPresenter().publishResult(new NameResult(ResultCode.USER_CANCELLED, null, null, 6, null));
        int i3 = f16456i + 39;
        f16455h = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i2 = f16457j + 23;
        f16454g = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context) {
        int i2 = 2 % 2;
        int i3 = f16455h + 55;
        f16456i = i3 % 128;
        int i4 = i3 % 2;
        f16453b.start(context);
        int i5 = f16455h + 81;
        f16456i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
    }
}
