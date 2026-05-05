package com.incode.welcome_sdk.ui.camera.id_validation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.modules.ProcessId;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdContract;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
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
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class ProcessIdActivity extends BaseActivity implements ProcessIdContract.View {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f11567d = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f11568f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f11569g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f11570h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f11571j = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScreenName f11572b = ScreenName.ID_PROCESS;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Modules f11573c = Modules.PROCESS_ID;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProcessIdPresenter f11574e;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("lY\u001f\\@", (short) (ZN.Xd() ^ (1225594952 ^ 1225601531)), (short) (ZN.Xd() ^ (127694565 ^ 127690801)));
            String strVd = hg.Vd("/\u001c", (short) (C1633zX.Xd() ^ ((1971415610 ^ 1860608093) ^ (-459769103))), (short) (C1633zX.Xd() ^ ((755430234 ^ 2015184343) ^ (-1427897857))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("G4y7\u001b", (short) (C1499aX.Xd() ^ (2103443732 ^ (-2103466035))));
                String strYd = C1561oA.yd(")\u0017", (short) (C1580rY.Xd() ^ (395711030 ^ (-395708057))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("9(o/\u0015", (short) (C1499aX.Xd() ^ ((484866045 ^ 1012388308) ^ (-548509407))));
                    short sXd = (short) (C1580rY.Xd() ^ ((491539129 ^ 97857419) ^ (-412709519)));
                    short sXd2 = (short) (C1580rY.Xd() ^ ((733727463 ^ 281858671) ^ (-997673542)));
                    int[] iArr = new int["7-".length()];
                    QB qb = new QB("7-");
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
                        Method declaredMethod = Class.forName(Jg.Wd("5@^7o", (short) (C1633zX.Xd() ^ (1829937780 ^ (-1829958028))), (short) (C1633zX.Xd() ^ (1932276638 ^ (-1932288437))))).getDeclaredMethod(ZO.xd("k)", (short) (OY.Xd() ^ ((530796680 ^ 2056111916) ^ 1697565862)), (short) (OY.Xd() ^ (2127677378 ^ 2127680997))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("\u0014!8Hy\u0005", (short) (FB.Xd() ^ (1826217829 ^ 1826197415)), (short) (FB.Xd() ^ (566951724 ^ 566928202)))};
                                Method method = Class.forName(Ig.wd("P/Am9mBz\\+\u00120q\u0007^0 H\u001e:gQe", (short) (FB.Xd() ^ ((939340858 ^ 101689064) ^ 837994983)))).getMethod(C1561oA.Qd("WTb@e^^NU:KWZLEF", (short) (ZN.Xd() ^ ((862284531 ^ 1731401582) ^ 1414923189))), Class.forName(EO.Od("\u0003,o~[N#)H?f&NKTg", (short) (Od.Xd() ^ ((706777162 ^ 1541613444) ^ (-1908662803))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd3 = (short) (Od.Xd() ^ (1696084052 ^ (-1696092654)));
                                    short sXd4 = (short) (Od.Xd() ^ ((1012567869 ^ 873618537) ^ (-138990255)));
                                    int[] iArr2 = new int["G6}=#".length()];
                                    QB qb2 = new QB("G6}=#");
                                    int i3 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                                        i3++;
                                    }
                                    String str2 = new String(iArr2, 0, i3);
                                    String strOd = C1561oA.od("K?", (short) (C1580rY.Xd() ^ ((377878370 ^ 279439781) ^ (-102913289))));
                                    try {
                                        Class<?> cls4 = Class.forName(str2);
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
                    String strKd2 = C1561oA.Kd("zi1pV", (short) (FB.Xd() ^ ((286070664 ^ 2111284716) ^ 1826278989)));
                    String strZd = Wg.Zd("fU", (short) (FB.Xd() ^ (1722374654 ^ 1722357004)), (short) (FB.Xd() ^ ((4599250 ^ 1258244335) ^ 1253662575)));
                    try {
                        Class<?> cls5 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls5.getField(strZd) : cls5.getDeclaredField(strZd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("\u0011\u007fG\u0007l", (short) (Od.Xd() ^ ((39972627 ^ 2103151875) ^ (-2134523793))));
                        String strVd2 = Wg.vd("wm", (short) (OY.Xd() ^ (1777243228 ^ 1777249213)));
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
                        int i4 = (634858371 ^ 586175871) ^ 120028855;
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

    public final ProcessIdPresenter getPresenter() {
        int i2 = 2 % 2;
        ProcessIdPresenter processIdPresenter = this.f11574e;
        if (processIdPresenter != null) {
            int i3 = f11571j + 43;
            f11570h = i3 % 128;
            if (i3 % 2 == 0) {
                return processIdPresenter;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = f11570h + 101;
        f11571j = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setPresenter(ProcessIdPresenter processIdPresenter) {
        int i2 = 2 % 2;
        int i3 = f11570h + 77;
        f11571j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(processIdPresenter, "");
            this.f11574e = processIdPresenter;
            throw null;
        }
        Intrinsics.checkNotNullParameter(processIdPresenter, "");
        this.f11574e = processIdPresenter;
        int i4 = f11571j + 65;
        f11570h = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f11571j + 107;
        f11570h = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f11572b;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f11570h + 33;
        f11571j = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f11573c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11577b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11578e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ IdCategory f11579a;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f11577b + 43;
            f11578e = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            d();
            if (i4 == 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i5 = f11577b + 25;
            f11578e = i5 % 128;
            if (i5 % 2 != 0) {
                return unit2;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[PHI: r3
  0x0030: PHI (r3v1 com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter) = 
  (r3v0 com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter)
  (r3v4 com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter)
 binds: [B:10:0x002d, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x001e A[PHI: r3
  0x001e: PHI (r3v3 com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter) = 
  (r3v0 com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter)
  (r3v4 com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter)
 binds: [B:10:0x002d, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void d() {
            /*
                r6 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdActivity.b.f11578e
                int r1 = r0 + 113
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdActivity.b.f11577b = r0
                int r1 = r1 % r5
                r4 = 0
                if (r1 == 0) goto L23
                com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdActivity r0 = com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdActivity.this
                com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter r3 = r0.getPresenter()
                com.incode.welcome_sdk.IdCategory r2 = r6.f11579a
                com.incode.welcome_sdk.IdCategory r1 = com.incode.welcome_sdk.IdCategory.SECOND
                r0 = 74
                int r0 = r0 / r4
                if (r2 != r1) goto L30
            L1e:
                r4 = 1
            L1f:
                r3.processId(r4)
                return
            L23:
                com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdActivity r0 = com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdActivity.this
                com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdPresenter r3 = r0.getPresenter()
                com.incode.welcome_sdk.IdCategory r1 = r6.f11579a
                com.incode.welcome_sdk.IdCategory r0 = com.incode.welcome_sdk.IdCategory.SECOND
                if (r1 != r0) goto L30
                goto L1e
            L30:
                int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdActivity.b.f11577b
                int r1 = r0 + 47
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdActivity.b.f11578e = r0
                int r1 = r1 % r5
                if (r1 != 0) goto L1f
                r0 = 4
                int r0 = r0 % 5
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdActivity.b.d():void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(IdCategory idCategory) {
            super(0);
            this.f11579a = idCategory;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        setContentView(R.layout.onboard_sdk_activity_process_id);
        setPresenter(new ProcessIdPresenter(getRepo(), this));
        IdCategory idCategory = (IdCategory) getIntent().getSerializableExtra("extraIdCategory");
        boolean z2 = true;
        getPresenter().setEnableIdSummaryScreen(getIntent().getBooleanExtra("extraIdSummaryScreen", true));
        ProcessIdPresenter presenter = getPresenter();
        if (idCategory == IdCategory.SECOND) {
            int i3 = f11570h + 107;
            f11571j = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = f11570h + 91;
            f11571j = i5 % 128;
            int i6 = i5 % 2;
            z2 = false;
        }
        presenter.processId(z2);
        setNoNetworkSnackbarRetryAction(new b(idCategory));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = 2 % 2;
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1) {
            int i5 = f11571j + 25;
            f11570h = i5 % 128;
            int i6 = i5 % 2;
            getPresenter().publishResult();
        }
        int i7 = f11571j + 19;
        f11570h = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final boolean isScreenCloseable() {
        int i2 = 2 % 2;
        int i3 = f11571j + 79;
        int i4 = i3 % 128;
        f11570h = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 3;
        f11571j = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 11 / 0;
        }
        return false;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, com.incode.welcome_sdk.ui.BaseView
    public final void closeScreen() {
        int i2 = 2 % 2;
        int i3 = f11571j + 71;
        f11570h = i3 % 128;
        if (i3 % 2 != 0) {
            finish();
            int i4 = 85 / 0;
        } else {
            finish();
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11575b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11576d = 1;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, ProcessId processId) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(processId, "");
            Intent intent = new Intent(context, (Class<?>) ProcessIdActivity.class);
            intent.putExtra("extraIdSummaryScreen", processId.isEnabledIdSummaryScreen());
            intent.putExtra("extraIdCategory", processId.getIdCategory());
            CX.ud();
            context.startActivity(intent);
            int i3 = f11575b + 115;
            f11576d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 19 / 0;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f11569g + 79;
        f11568f = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, ProcessId processId) {
        int i2 = 2 % 2;
        int i3 = f11571j + 113;
        f11570h = i3 % 128;
        int i4 = i3 % 2;
        f11567d.start(context, processId);
        int i5 = f11570h + 37;
        f11571j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
    }
}
