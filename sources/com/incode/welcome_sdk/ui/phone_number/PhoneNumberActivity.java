package com.incode.welcome_sdk.ui.phone_number;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.data.remote.beans.t;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.PhoneNumberResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.BaseFragmentActivity;
import com.incode.welcome_sdk.ui.phone_number.OtpFragment;
import com.incode.welcome_sdk.ui.phone_number.PhoneNumberFragment;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
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
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class PhoneNumberActivity extends BaseFragmentActivity implements OtpFragment.Listener, PhoneNumberFragment.Listener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f16967d = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f16968f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f16969g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f16970h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f16971j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScreenName f16972b = ScreenName.PHONE_INPUT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Modules f16973c = Modules.PHONE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BaseActivity.Config f16974e = BaseActivity.Config.copy$default(super.getConfig(), false, false, false, false, null, 27, null);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("Q>\u0004A%", (short) (C1499aX.Xd() ^ (2135352353 ^ (-2135351292))), (short) (C1499aX.Xd() ^ (1616074991 ^ (-1616057723))));
            String strVd = hg.Vd("fS", (short) (C1499aX.Xd() ^ ((1014828246 ^ 87651444) ^ (-960762780))), (short) (C1499aX.Xd() ^ (727353472 ^ (-727380125))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("zg-jN", (short) (C1499aX.Xd() ^ (1099110372 ^ (-1099115314))));
                String strYd = C1561oA.yd("jX", (short) (FB.Xd() ^ ((166349515 ^ 1884356067) ^ 2042285137)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("|k3rX", (short) (C1633zX.Xd() ^ (618074492 ^ (-618088146))));
                    String strQd = Xg.qd("KA", (short) (FB.Xd() ^ (502873367 ^ 502877651)), (short) (FB.Xd() ^ (718364984 ^ 718360597)));
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
                        Method declaredMethod = Class.forName(Jg.Wd("6Z\u0017\"6", (short) (FB.Xd() ^ ((1806014912 ^ 1701728969) ^ 248247980)), (short) (FB.Xd() ^ (657443191 ^ 657437367)))).getDeclaredMethod(ZO.xd("K>", (short) (C1499aX.Xd() ^ ((841207226 ^ 901767998) ^ (-127681101))), (short) (C1499aX.Xd() ^ ((2055225609 ^ 102402488) ^ (-2090511405)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("\u000ehT?0K", (short) (C1499aX.Xd() ^ ((1069013653 ^ 1090272313) ^ (-2135670475))), (short) (C1499aX.Xd() ^ (667147386 ^ (-667152569))));
                                short sXd = (short) (C1580rY.Xd() ^ (265894118 ^ (-265908338)));
                                int[] iArr = new int["%\u000b\u000f9m\u001al\u0017\u001d=>b$3)\rh\u0013jd\u0016\u0006\u0014".length()];
                                QB qb = new QB("%\u000b\u000f9m\u001al\u0017\u001d=>b$3)\rh\u0013jd\u0016\u0006\u0014");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                                    i2++;
                                }
                                Object[] objArr2 = {strUd2};
                                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("khvTyrrbiN_kn`YZ", (short) (C1580rY.Xd() ^ ((551550516 ^ 895761545) ^ (-364614590)))), Class.forName(EO.Od("\u0017@\u0004\u0017C6\u0007\r,7^\u001aB?Xk", (short) (C1499aX.Xd() ^ (1028767969 ^ (-1028775685))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("TC\u000bJ0", (short) (C1499aX.Xd() ^ (318428349 ^ (-318414174))), (short) (C1499aX.Xd() ^ ((1510556610 ^ 794785131) ^ (-1968601104))));
                                    String strOd = C1561oA.od("$\u0018", (short) (FB.Xd() ^ (892769645 ^ 892794514)));
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
                    String strKd2 = C1561oA.Kd("4#j*\u0010", (short) (C1499aX.Xd() ^ (269174209 ^ (-269171258))));
                    String strZd2 = Wg.Zd("\u0006#", (short) (C1580rY.Xd() ^ (1668421502 ^ (-1668427761))), (short) (C1580rY.Xd() ^ ((1752488995 ^ 1426085389) ^ (-1031076751))));
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
                        String strXd = C1561oA.Xd("zi1pV", (short) (C1607wl.Xd() ^ ((732766783 ^ 320855508) ^ 951244220)));
                        String strVd2 = Wg.vd("D8", (short) (FB.Xd() ^ (152088413 ^ 152104996)));
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
                        int i3 = 226540600 ^ 226540659;
                        if (x2 > i3 && x2 < displayMetrics.widthPixels - i3 && y2 > i3 && y2 < displayMetrics.heightPixels - i3) {
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
        int i3 = f16969g + 99;
        f16968f = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f16972b;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f16968f + 9;
        int i4 = i3 % 128;
        f16969g = i4;
        int i5 = i3 % 2;
        Modules modules = this.f16973c;
        int i6 = i4 + 97;
        f16968f = i6 % 128;
        int i7 = i6 % 2;
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragmentActivity, com.incode.welcome_sdk.ui.BaseActivity
    public final BaseActivity.Config getConfig() {
        int i2 = 2 % 2;
        int i3 = f16968f + 75;
        int i4 = i3 % 128;
        f16969g = i4;
        int i5 = i3 % 2;
        BaseActivity.Config config = this.f16974e;
        int i6 = i4 + 43;
        f16968f = i6 % 128;
        if (i6 % 2 == 0) {
            return config;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragmentActivity
    public final FragmentWithListener<?> getFirstFragment() {
        int i2 = 2 % 2;
        int i3 = f16969g + 93;
        f16968f = i3 % 128;
        int i4 = i3 % 2;
        PhoneNumberFragment phoneNumberFragmentNewInstance = PhoneNumberFragment.f16977b.newInstance(getIntent().getBooleanExtra("extraOtpVerificationEnabled", false), getIntent().getIntExtra("extraDefaultRegionPrefix", -1));
        int i5 = f16969g + 31;
        f16968f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return phoneNumberFragmentNewInstance;
    }

    @Override // com.incode.welcome_sdk.ui.phone_number.PhoneNumberFragment.Listener
    public final void onPhoneNumberProvidedOtpRequired(String str) throws Exception {
        int i2 = 2 % 2;
        int i3 = f16969g + 93;
        f16968f = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            BaseActivity.showFragment$default(this, OtpFragment.f16890e.newInstance(t.f10057a, str), false, 5, null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            BaseActivity.showFragment$default(this, OtpFragment.f16890e.newInstance(t.f10057a, str), false, 2, null);
        }
    }

    @Override // com.incode.welcome_sdk.ui.phone_number.OtpFragment.Listener
    public final void onChangeInputClick() throws Exception {
        int i2 = 2 % 2;
        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            int i3 = f16969g + 51;
            f16968f = i3 % 128;
            if (i3 % 2 != 0) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                CX.ud();
                supportFragmentManager.popBackStack();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            CX.ud();
            supportFragmentManager2.popBackStack();
        }
        int i4 = f16969g + 109;
        f16968f = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void publishUserCancelled() {
        int i2 = 2 % 2;
        super.publishUserCancelled();
        IncodeWelcome.Companion.getInstance().getPhoneNumberBus().onNext(new PhoneNumberResult(ResultCode.USER_CANCELLED, null, null, 6, null));
        int i3 = f16969g + 123;
        f16968f = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16975a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16976d = 1;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, boolean z2, int i2) {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) PhoneNumberActivity.class);
            intent.putExtra("extraOtpVerificationEnabled", z2);
            intent.putExtra("extraDefaultRegionPrefix", i2);
            CX.ud();
            context.startActivity(intent);
            int i4 = f16975a + 47;
            f16976d = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f16971j + 113;
        f16970h = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, boolean z2, int i2) {
        int i3 = 2 % 2;
        int i4 = f16969g + 109;
        f16968f = i4 % 128;
        if (i4 % 2 != 0) {
            f16967d.start(context, z2, i2);
            int i5 = 91 / 0;
        } else {
            f16967d.start(context, z2, i2);
        }
        int i6 = f16969g + 19;
        f16968f = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 7 / 0;
        }
    }
}
