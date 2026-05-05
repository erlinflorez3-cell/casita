package com.incode.welcome_sdk.ui.email_address;

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
import com.incode.welcome_sdk.data.remote.beans.t;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.EmailAddressResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.BaseFragmentActivity;
import com.incode.welcome_sdk.ui.email_address.EmailAddressFragment;
import com.incode.welcome_sdk.ui.phone_number.OtpFragment;
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
public final class EmailAddressActivity extends BaseFragmentActivity implements EmailAddressFragment.Listener, OtpFragment.Listener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f14183c = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f14184f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f14185g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f14186h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f14187i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScreenName f14189d = ScreenName.EMAIL_INPUT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Modules f14188b = Modules.EMAIL;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BaseActivity.Config f14190e = BaseActivity.Config.copy$default(super.getConfig(), false, false, false, false, null, 27, null);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("]J\u0010M1", (short) (Od.Xd() ^ ((1926683652 ^ 1759151325) ^ (-436995361))), (short) (Od.Xd() ^ ((748903965 ^ 220058235) ^ (-566136066))));
            String strVd = hg.Vd("\u0004p", (short) (C1607wl.Xd() ^ ((21775659 ^ 601517267) ^ 580280675)), (short) (C1607wl.Xd() ^ ((1648548674 ^ 1894241986) ^ 312826410)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd = (short) (OY.Xd() ^ (445769102 ^ 445764979));
                int[] iArr = new int["s`&cG".length()];
                QB qb = new QB("s`&cG");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                short sXd2 = (short) (Od.Xd() ^ (1550472597 ^ (-1550459841)));
                int[] iArr2 = new int["3\u001f".length()];
                QB qb2 = new QB("3\u001f");
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
                    String strYd = C1561oA.Yd("o^&eK", (short) (C1607wl.Xd() ^ (401756356 ^ 401746509)));
                    String strQd = Xg.qd(" \u0016", (short) (C1580rY.Xd() ^ ((2101150903 ^ 1946183335) ^ (-155000217))), (short) (C1580rY.Xd() ^ (1515386450 ^ (-1515374138))));
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
                        Method declaredMethod = Class.forName(Jg.Wd("\u0012~%]\u001e", (short) (C1633zX.Xd() ^ (647474944 ^ (-647469276))), (short) (C1633zX.Xd() ^ ((800163973 ^ 79819128) ^ (-728761512))))).getDeclaredMethod(ZO.xd("r\u0010", (short) (C1633zX.Xd() ^ (1819288840 ^ (-1819293592))), (short) (C1633zX.Xd() ^ ((1382731254 ^ 569003831) ^ (-1937812541)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("@\b\u0017}s\u0013", (short) (Od.Xd() ^ (1686110656 ^ (-1686140280))), (short) (Od.Xd() ^ ((384344759 ^ 1853248147) ^ (-2023666461))))};
                                Method method = Class.forName(Ig.wd("O\u00157^A\u000f\u007fnYCB,N[\f%e\u001aN>t)\u0019", (short) (C1633zX.Xd() ^ (1751849728 ^ (-1751856751))))).getMethod(C1561oA.Qd("PM[9^WWGN3DPSE>?", (short) (FB.Xd() ^ (772853227 ^ 772845250))), Class.forName(EO.Od("Kqh7\u0014\b\u0015a}D_j\u0018\u0011\u0006d", (short) (ZN.Xd() ^ ((269492100 ^ 439234736) ^ 171840899)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("\u000byA\u0001f", (short) (C1580rY.Xd() ^ ((1559388435 ^ 995378304) ^ (-1738959745))), (short) (C1580rY.Xd() ^ (708593378 ^ (-708583706))));
                                    short sXd3 = (short) (OY.Xd() ^ ((1499536145 ^ 1898174475) ^ 675466765));
                                    int[] iArr3 = new int["YM".length()];
                                    QB qb3 = new QB("YM");
                                    int i4 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
                                        i4++;
                                    }
                                    String str3 = new String(iArr3, 0, i4);
                                    try {
                                        Class<?> cls4 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls4.getField(str3) : cls4.getDeclaredField(str3);
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
                    String strKd2 = C1561oA.Kd("$\u0013Z\u001a\u007f", (short) (FB.Xd() ^ ((1081583490 ^ 1871136132) ^ 804302895)));
                    String strZd2 = Wg.Zd("ND", (short) (FB.Xd() ^ (176107942 ^ 176102029)), (short) (FB.Xd() ^ ((1302246727 ^ 1582200986) ^ 332438623)));
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
                        String strXd = C1561oA.Xd("I8\u007f?%", (short) (C1607wl.Xd() ^ (377884863 ^ 377909903)));
                        String strVd2 = Wg.vd("\u0015\u000b", (short) (C1499aX.Xd() ^ ((1506048623 ^ 1831708676) ^ (-887719170))));
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
                        int i5 = 506048198 ^ 506048141;
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

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f14186h;
        int i4 = i3 + 101;
        f14185g = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f14189d;
        int i6 = i3 + 113;
        f14185g = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f14186h;
        int i4 = i3 + 5;
        f14185g = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Modules modules = this.f14188b;
        int i5 = i3 + 7;
        f14185g = i5 % 128;
        int i6 = i5 % 2;
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragmentActivity, com.incode.welcome_sdk.ui.BaseActivity
    public final BaseActivity.Config getConfig() {
        int i2 = 2 % 2;
        int i3 = f14185g + 123;
        int i4 = i3 % 128;
        f14186h = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BaseActivity.Config config = this.f14190e;
        int i5 = i4 + 83;
        f14185g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return config;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragmentActivity
    public final FragmentWithListener<?> getFirstFragment() {
        int i2 = 2 % 2;
        int i3 = f14185g + 85;
        f14186h = i3 % 128;
        int i4 = i3 % 2;
        return EmailAddressFragment.f14193e.newInstance(getIntent().getBooleanExtra("extraOtpVerificationEnabled", false));
    }

    @Override // com.incode.welcome_sdk.ui.email_address.EmailAddressFragment.Listener
    public final void onEmailProvidedOtpRequired(String str) throws Exception {
        EmailAddressActivity emailAddressActivity;
        OtpFragment otpFragmentNewInstance;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f14186h + 83;
        f14185g = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            emailAddressActivity = this;
            otpFragmentNewInstance = OtpFragment.f16890e.newInstance(t.f10059d, str);
            z2 = true;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            emailAddressActivity = this;
            otpFragmentNewInstance = OtpFragment.f16890e.newInstance(t.f10059d, str);
            z2 = false;
        }
        BaseActivity.showFragment$default(emailAddressActivity, otpFragmentNewInstance, z2, 2, null);
    }

    @Override // com.incode.welcome_sdk.ui.phone_number.OtpFragment.Listener
    public final void onChangeInputClick() throws Exception {
        int i2 = 2 % 2;
        int i3 = f14185g + 101;
        f14186h = i3 % 128;
        if (i3 % 2 == 0) {
            if (getSupportFragmentManager().getBackStackEntryCount() <= 0) {
                return;
            }
        } else if (getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            return;
        }
        int i4 = f14186h + 23;
        f14185g = i4 % 128;
        int i5 = i4 % 2;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        CX.ud();
        supportFragmentManager.popBackStack();
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void publishUserCancelled() {
        int i2 = 2 % 2;
        super.publishUserCancelled();
        IncodeWelcome.Companion.getInstance().getEmailAddressBus().onNext(new EmailAddressResult(ResultCode.USER_CANCELLED, null, null, 6, null));
        int i3 = f14186h + 5;
        f14185g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14191d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14192e = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, boolean z2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) EmailAddressActivity.class);
            intent.putExtra("extraOtpVerificationEnabled", z2);
            CX.ud();
            context.startActivity(intent);
            int i3 = f14192e + 45;
            f14191d = i3 % 128;
            int i4 = i3 % 2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f14184f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14187i = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f14186h + 25;
        f14185g = i3 % 128;
        if (i3 % 2 != 0) {
            f14183c.start(context, z2);
            throw null;
        }
        f14183c.start(context, z2);
        int i4 = f14186h + 95;
        f14185g = i4 % 128;
        int i5 = i4 % 2;
    }
}
