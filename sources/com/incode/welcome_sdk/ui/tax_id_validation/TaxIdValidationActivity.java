package com.incode.welcome_sdk.ui.tax_id_validation;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.TaxIdValidationResult;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.BaseFragmentActivity;
import com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment;
import com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdContract;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
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
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
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
public final class TaxIdValidationActivity extends BaseFragmentActivity implements EnterTaxIdFragment.Listener, ValidatingTaxIdContract.ValidatingTaxIdView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f17509d = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f17510g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f17511h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f17512i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f17513j = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ValidatingTaxIdFragment f17514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Modules f17515c = Modules.TAX_ID_VALIDATION;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScreenName f17516e = ScreenName.TAX_ID_VALIDATION;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f17517f = LazyKt.lazy(new b());

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("0\u001db \u0004", (short) (Od.Xd() ^ (1116375351 ^ (-1116376327))), (short) (Od.Xd() ^ (1959362182 ^ (-1959338608))));
            String strVd = hg.Vd("\u001e\u000b", (short) (C1580rY.Xd() ^ (142238862 ^ (-142226549))), (short) (C1580rY.Xd() ^ (1904123966 ^ (-1904140829))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd = (short) (FB.Xd() ^ ((44179207 ^ 1641118892) ^ 1668502222));
                int[] iArr = new int["eR\u0018U9".length()];
                QB qb = new QB("eR\u0018U9");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strYd = C1561oA.yd("G5", (short) (C1607wl.Xd() ^ ((1797565345 ^ 184523441) ^ 1641767040)));
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("UD\fK1", (short) (C1580rY.Xd() ^ (993171517 ^ (-993190204))));
                    String strQd = Xg.qd("=3", (short) (C1633zX.Xd() ^ (437461978 ^ (-437483897))), (short) (C1633zX.Xd() ^ ((1194399692 ^ 422164186) ^ (-1578671019))));
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
                        Method declaredMethod = Class.forName(Jg.Wd("Ym]R\u0019", (short) (C1607wl.Xd() ^ (108810289 ^ 108801259)), (short) (C1607wl.Xd() ^ ((2095597946 ^ 550284367) ^ 1545896608)))).getDeclaredMethod(ZO.xd("T:", (short) (C1580rY.Xd() ^ ((2044633164 ^ 1121828444) ^ (-990065285))), (short) (C1580rY.Xd() ^ ((1636934398 ^ 114947604) ^ (-1732794758)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd = C1626yg.Ud("'h*t\u000eF", (short) (C1607wl.Xd() ^ ((1436160582 ^ 281999437) ^ 1163187995)), (short) (C1607wl.Xd() ^ (1247006212 ^ 1247002524)));
                                short sXd2 = (short) (ZN.Xd() ^ (161238809 ^ 161231803));
                                int[] iArr2 = new int["9v\u0019LW\u0015q\u0019\u001410V\u0019\u0016u\u000f_\u00104@v/\u000b".length()];
                                QB qb2 = new QB("9v\u0019LW\u0015q\u0019\u001410V\u0019\u0016u\u000f_\u00104@v/\u000b");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd2 + i3)));
                                    i3++;
                                }
                                Object[] objArr2 = {strUd};
                                Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Qd("\u0005\u0002\u0010m\u0013\f\f{\u0003gx\u0005\byrs", (short) (C1499aX.Xd() ^ ((1863170156 ^ 1782429272) ^ (-87058926)))), Class.forName(EO.Od("]'NXtpA.b\\\u007f?lmyQ", (short) (ZN.Xd() ^ (2086209768 ^ 2086224833)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("\bv>}c", (short) (Od.Xd() ^ (43261511 ^ (-43281749))), (short) (Od.Xd() ^ ((1292246882 ^ 2073532653) ^ (-915534658))));
                                    String strOd = C1561oA.od("_S", (short) (Od.Xd() ^ ((1951771545 ^ 916569021) ^ (-1123292089))));
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
                    short sXd3 = (short) (OY.Xd() ^ (1701850007 ^ 1701848758));
                    int[] iArr3 = new int["#\u0012Y\u0019~".length()];
                    QB qb3 = new QB("#\u0012Y\u0019~");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd3 + sXd3) + i4));
                        i4++;
                    }
                    String str2 = new String(iArr3, 0, i4);
                    String strZd2 = Wg.Zd("05", (short) (C1607wl.Xd() ^ ((1802433148 ^ 1231795410) ^ 570771438)), (short) (C1607wl.Xd() ^ (789499465 ^ 789512007)));
                    try {
                        Class<?> cls5 = Class.forName(str2);
                        Field field5 = 0 != 0 ? cls5.getField(strZd2) : cls5.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("{j2qW", (short) (C1633zX.Xd() ^ (1370789091 ^ (-1370799153))));
                        String strVd2 = Wg.vd("(\u001c", (short) (C1580rY.Xd() ^ ((1608211157 ^ 1248537010) ^ (-363876386))));
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
                        int i5 = (1278385065 ^ 1587418410) ^ 313298632;
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

    public static final /* synthetic */ IncodeWelcomeRepository access$getRepo(TaxIdValidationActivity taxIdValidationActivity) {
        int i2 = 2 % 2;
        int i3 = f17513j + 59;
        f17512i = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository repo = taxIdValidationActivity.getRepo();
        int i5 = f17513j + 29;
        f17512i = i5 % 128;
        int i6 = i5 % 2;
        return repo;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragmentActivity
    public final FragmentWithListener<?> getFirstFragment() {
        int i2 = 2 % 2;
        int i3 = f17513j + 99;
        f17512i = i3 % 128;
        int i4 = i3 % 2;
        EnterTaxIdFragment enterTaxIdFragmentNewInstance = EnterTaxIdFragment.f17496b.newInstance();
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
        return enterTaxIdFragmentNewInstance;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f17513j;
        int i4 = i3 + 121;
        f17512i = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Modules modules = this.f17515c;
        int i5 = i3 + 61;
        f17512i = i5 % 128;
        if (i5 % 2 == 0) {
            return modules;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f17513j + 55;
        int i4 = i3 % 128;
        f17512i = i4;
        int i5 = i3 % 2;
        ScreenName screenName = this.f17516e;
        int i6 = i4 + 57;
        f17513j = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    static final class b extends Lambda implements Function0<ValidatingTaxIdPresenter> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17520c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17521e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ ValidatingTaxIdPresenter invoke() {
            int i2 = 2 % 2;
            int i3 = f17521e + 55;
            f17520c = i3 % 128;
            int i4 = i3 % 2;
            ValidatingTaxIdPresenter validatingTaxIdPresenterB = b();
            int i5 = f17520c + 61;
            f17521e = i5 % 128;
            int i6 = i5 % 2;
            return validatingTaxIdPresenterB;
        }

        private ValidatingTaxIdPresenter b() {
            int i2 = 2 % 2;
            IncodeWelcome companion = IncodeWelcome.Companion.getInstance();
            TaxIdValidationActivity taxIdValidationActivity = TaxIdValidationActivity.this;
            ValidatingTaxIdPresenter validatingTaxIdPresenter = new ValidatingTaxIdPresenter(taxIdValidationActivity, TaxIdValidationActivity.access$getRepo(taxIdValidationActivity), companion.getTaxIdValidationBus(), null, null, 24, null);
            int i3 = f17520c + 89;
            f17521e = i3 % 128;
            if (i3 % 2 == 0) {
                return validatingTaxIdPresenter;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        b() {
            super(0);
        }
    }

    private final ValidatingTaxIdPresenter b() {
        int i2 = 2 % 2;
        int i3 = f17513j + 101;
        f17512i = i3 % 128;
        int i4 = i3 % 2;
        ValidatingTaxIdPresenter validatingTaxIdPresenter = (ValidatingTaxIdPresenter) this.f17517f.getValue();
        if (i4 != 0) {
            int i5 = 87 / 0;
        }
        return validatingTaxIdPresenter;
    }

    @Override // com.incode.welcome_sdk.ui.tax_id_validation.EnterTaxIdFragment.Listener
    public final void onEnterTaxIdContinueClicked(String str) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17512i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17513j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ValidatingTaxIdFragment validatingTaxIdFragmentNewInstance = ValidatingTaxIdFragment.f17524e.newInstance();
        this.f17514b = validatingTaxIdFragmentNewInstance;
        Intrinsics.checkNotNull(validatingTaxIdFragmentNewInstance);
        BaseActivity.showFragment$default(this, validatingTaxIdFragmentNewInstance, false, 2, null);
        b().validateTaxId(str);
        int i5 = f17512i + 77;
        f17513j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdContract.ValidatingTaxIdView
    public final void updateUiState(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17513j + 43;
        f17512i = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            ValidatingTaxIdFragment validatingTaxIdFragment = this.f17514b;
            if (validatingTaxIdFragment != null) {
                validatingTaxIdFragment.updateUiState(z2);
                int i4 = f17513j + 99;
                f17512i = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdContract.ValidatingTaxIdView
    public final void goBackToTaxInputFragment() throws Exception {
        int i2 = 2 % 2;
        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            int i3 = f17513j + 83;
            f17512i = i3 % 128;
            if (i3 % 2 != 0) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                CX.ud();
                supportFragmentManager.popBackStack();
                this.f17514b = null;
                int i4 = 30 / 0;
            } else {
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                CX.ud();
                supportFragmentManager2.popBackStack();
                this.f17514b = null;
            }
        }
        int i5 = f17512i + 39;
        f17513j = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void publishUserCancelled() {
        int i2 = 2 % 2;
        super.publishUserCancelled();
        IncodeWelcome.Companion.getInstance().getTaxIdValidationBus().onNext(new TaxIdValidationResult(ResultCode.USER_CANCELLED, null, false, 6, null));
        int i3 = f17513j + 115;
        f17512i = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 7 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f17512i + 111;
        f17513j = i3 % 128;
        int i4 = i3 % 2;
        b().destroy();
        super.safeOnDestroy();
        int i5 = f17513j + 17;
        f17512i = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17518b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17519e = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) TaxIdValidationActivity.class);
            CX.ud();
            context.startActivity(intent);
            int i3 = f17518b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f17519e = i3 % 128;
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

    static {
        int i2 = f17510g + 47;
        f17511h = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context) {
        int i2 = 2 % 2;
        int i3 = f17513j + 55;
        f17512i = i3 % 128;
        int i4 = i3 % 2;
        f17509d.start(context);
        int i5 = f17513j + 73;
        f17512i = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
