package com.incode.welcome_sdk.ui.dynamic_forms;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.theme.g;
import com.incode.welcome_sdk.modules.DynamicForms;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt;
import com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.androidx.compose.ViewModelInternalsKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicFormsActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f13248b = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f13249f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f13250g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f13251i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f13252j = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DynamicFormsViewModel f13256h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Modules f13253c = Modules.DYNAMIC_FORMS;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScreenName f13255e = ScreenName.DYNAMIC_FORMS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f13254d = LazyKt.lazy(new a());

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("kX\u001e[?", (short) (C1607wl.Xd() ^ ((579605342 ^ 1591350697) ^ 2086036510)), (short) (C1607wl.Xd() ^ ((1792380142 ^ 856980832) ^ 1505873508)));
            String strVd = hg.Vd("7$", (short) (C1580rY.Xd() ^ (1846042907 ^ (-1846043940))), (short) (C1580rY.Xd() ^ ((2144617088 ^ 1617228560) ^ (-531689200))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd = (short) (C1607wl.Xd() ^ (999740882 ^ 999736182));
                int[] iArr = new int["p]#`D".length()];
                QB qb = new QB("p]#`D");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strYd = C1561oA.yd("\rx", (short) (C1499aX.Xd() ^ (271231768 ^ (-271235629))));
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("\u0015\u0004K\u000bp", (short) (C1607wl.Xd() ^ (2089164888 ^ 2089169541)));
                    String strQd = Xg.qd("i_", (short) (Od.Xd() ^ (1384256564 ^ (-1384253268))), (short) (Od.Xd() ^ ((100768617 ^ 1620455933) ^ (-1721230272))));
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd2 = (short) (C1580rY.Xd() ^ (1428392755 ^ (-1428415711)));
                        short sXd3 = (short) (C1580rY.Xd() ^ (2133334122 ^ (-2133350142)));
                        int[] iArr2 = new int["f%0OX".length()];
                        QB qb2 = new QB("f%0OX");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                            i3++;
                        }
                        Class<?> cls4 = Class.forName(new String(iArr2, 0, i3));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd4 = (short) (ZN.Xd() ^ (1528077940 ^ 1528090499));
                        short sXd5 = (short) (ZN.Xd() ^ ((1900632977 ^ 331479746) ^ 1653138273));
                        int[] iArr3 = new int["?U".length()];
                        QB qb3 = new QB("?U");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                            i4++;
                        }
                        Method declaredMethod = cls4.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd6 = (short) (C1580rY.Xd() ^ (120492730 ^ (-120518736)));
                                short sXd7 = (short) (C1580rY.Xd() ^ (798689285 ^ (-798715617)));
                                int[] iArr4 = new int["\"|ym~\t".length()];
                                QB qb4 = new QB("\"|ym~\t");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i5 * sXd7))) + xuXd4.CK(iKK4));
                                    i5++;
                                }
                                String str2 = new String(iArr4, 0, i5);
                                Class<?> cls5 = Class.forName(Ig.wd("w-\u0011\u0016\u00115\u0012B0ri\u00189>^8s@uAjX\u0001", (short) (C1607wl.Xd() ^ ((1786630117 ^ 585031363) ^ 1218660609))));
                                Class<?>[] clsArr2 = {Class.forName(EO.Od("S\u001d\u007fF\u0003n\f@\u0019n\u000eU\u001f\u0014\u0005\u001f", (short) (FB.Xd() ^ ((661937739 ^ 1537596536) ^ 2094125644))))};
                                Object[] objArr2 = {str2};
                                short sXd8 = (short) (FB.Xd() ^ (1710737257 ^ 1710730178));
                                int[] iArr5 = new int["\n\u0007\u0015r\u0018\u0011\u0011\u0001\bl}\n\r~wx".length()];
                                QB qb5 = new QB("\n\u0007\u0015r\u0018\u0011\u0011\u0001\bl}\n\r~wx");
                                int i6 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i6] = xuXd5.fK(sXd8 + sXd8 + sXd8 + i6 + xuXd5.CK(iKK5));
                                    i6++;
                                }
                                Method method = cls5.getMethod(new String(iArr5, 0, i6), clsArr2);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd9 = (short) (OY.Xd() ^ ((1137081965 ^ 997166624) ^ 2024385690));
                                    short sXd10 = (short) (OY.Xd() ^ (206894914 ^ 206883079));
                                    int[] iArr6 = new int["}l4sY".length()];
                                    QB qb6 = new QB("}l4sY");
                                    int i7 = 0;
                                    while (qb6.YK()) {
                                        int iKK6 = qb6.KK();
                                        Xu xuXd6 = Xu.Xd(iKK6);
                                        iArr6[i7] = xuXd6.fK((xuXd6.CK(iKK6) - (sXd9 + i7)) - sXd10);
                                        i7++;
                                    }
                                    String str3 = new String(iArr6, 0, i7);
                                    String strOd = C1561oA.od("<0", (short) (C1607wl.Xd() ^ ((1448765548 ^ 191367460) ^ 1563587678)));
                                    try {
                                        Class<?> cls6 = Class.forName(str3);
                                        Field field4 = 0 != 0 ? cls6.getField(strOd) : cls6.getDeclaredField(strOd);
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
                    String strKd2 = C1561oA.Kd("~m5tZ", (short) (ZN.Xd() ^ (597801122 ^ 597795887)));
                    String strZd = Wg.Zd("y$", (short) (OY.Xd() ^ (397392637 ^ 397394203)), (short) (OY.Xd() ^ (575248710 ^ 575268629)));
                    try {
                        Class<?> cls7 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls7.getField(strZd) : cls7.getDeclaredField(strZd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("o^&eK", (short) (C1499aX.Xd() ^ ((1486606806 ^ 568019878) ^ (-2034278873))));
                        short sXd11 = (short) (C1607wl.Xd() ^ (1954341443 ^ 1954335167));
                        int[] iArr7 = new int["XL".length()];
                        QB qb7 = new QB("XL");
                        int i8 = 0;
                        while (qb7.YK()) {
                            int iKK7 = qb7.KK();
                            Xu xuXd7 = Xu.Xd(iKK7);
                            iArr7[i8] = xuXd7.fK((sXd11 ^ i8) + xuXd7.CK(iKK7));
                            i8++;
                        }
                        String str4 = new String(iArr7, 0, i8);
                        try {
                            Class<?> cls8 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls8.getField(str4) : cls8.getDeclaredField(str4);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i9 = (183465160 ^ 1292147801) ^ 1206642906;
                        if (x2 > i9 && x2 < displayMetrics.widthPixels - i9 && y2 > i9 && y2 < displayMetrics.heightPixels - i9) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static final /* synthetic */ DynamicForms access$getDynamicForms(DynamicFormsActivity dynamicFormsActivity) {
        int i2 = 2 % 2;
        int i3 = f13252j + 125;
        f13250g = i3 % 128;
        if (i3 % 2 == 0) {
            return dynamicFormsActivity.a();
        }
        dynamicFormsActivity.a();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ DynamicFormsViewModel access$getViewModel$p(DynamicFormsActivity dynamicFormsActivity) {
        int i2 = 2 % 2;
        int i3 = f13250g + 93;
        int i4 = i3 % 128;
        f13252j = i4;
        int i5 = i3 % 2;
        DynamicFormsViewModel dynamicFormsViewModel = dynamicFormsActivity.f13256h;
        int i6 = i4 + 13;
        f13250g = i6 % 128;
        int i7 = i6 % 2;
        return dynamicFormsViewModel;
    }

    public static final /* synthetic */ void access$setViewModel$p(DynamicFormsActivity dynamicFormsActivity, DynamicFormsViewModel dynamicFormsViewModel) {
        int i2 = 2 % 2;
        int i3 = f13252j + 115;
        int i4 = i3 % 128;
        f13250g = i4;
        int i5 = i3 % 2;
        Object obj = null;
        dynamicFormsActivity.f13256h = dynamicFormsViewModel;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 81;
        f13252j = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13257b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13258e = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, DynamicForms dynamicForms) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(dynamicForms, "");
            Intent intent = new Intent(context, (Class<?>) DynamicFormsActivity.class);
            intent.putExtra("extraDynamicForms", dynamicForms);
            CX.ud();
            context.startActivity(intent);
            int i3 = f13258e + 63;
            f13257b = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f13252j + 123;
        int i4 = i3 % 128;
        f13250g = i4;
        int i5 = i3 % 2;
        Modules modules = this.f13253c;
        int i6 = i4 + 31;
        f13252j = i6 % 128;
        if (i6 % 2 != 0) {
            return modules;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f13252j;
        int i4 = i3 + 105;
        f13250g = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ScreenName screenName = this.f13255e;
        int i5 = i3 + 25;
        f13250g = i5 % 128;
        int i6 = i5 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final BaseActivity.Config getConfig() {
        int i2;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3 = 2 % 2;
        int i4 = f13250g + 15;
        f13252j = i4 % 128;
        int i5 = i4 % 2;
        BaseActivity.Config config = super.getConfig();
        if (i5 == 0) {
            i2 = 127;
            obj = null;
            z2 = true;
            z3 = true;
            z4 = true;
            z5 = true;
        } else {
            i2 = 23;
            obj = null;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        BaseActivity.Config configCopy$default = BaseActivity.Config.copy$default(config, z2, z3, z4, z5, null, i2, obj);
        int i6 = f13250g + 85;
        f13252j = i6 % 128;
        int i7 = i6 % 2;
        return configCopy$default;
    }

    static final class a extends Lambda implements Function0<DynamicForms> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13259a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13260e = 0;

        private DynamicForms b() {
            Intent intent;
            Parcelable parcelable;
            int i2 = 2 % 2;
            int i3 = f13259a + 71;
            f13260e = i3 % 128;
            if (i3 % 2 == 0) {
                intent = DynamicFormsActivity.this.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "");
                if (Build.VERSION.SDK_INT < 33) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("extraDynamicForms");
                    if (!(parcelableExtra instanceof DynamicForms)) {
                        int i4 = f13260e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                        f13259a = i4 % 128;
                        int i5 = i4 % 2;
                        parcelableExtra = null;
                    }
                    parcelable = (DynamicForms) parcelableExtra;
                }
                return (DynamicForms) parcelable;
            }
            intent = DynamicFormsActivity.this.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "");
            parcelable = (Parcelable) intent.getParcelableExtra("extraDynamicForms", DynamicForms.class);
            return (DynamicForms) parcelable;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ DynamicForms invoke() {
            int i2 = 2 % 2;
            int i3 = f13260e + 53;
            f13259a = i3 % 128;
            int i4 = i3 % 2;
            DynamicForms dynamicFormsB = b();
            int i5 = f13259a + 123;
            f13260e = i5 % 128;
            int i6 = i5 % 2;
            return dynamicFormsB;
        }

        a() {
            super(0);
        }
    }

    private final DynamicForms a() {
        int i2 = 2 % 2;
        int i3 = f13252j + 5;
        f13250g = i3 % 128;
        int i4 = i3 % 2;
        DynamicForms dynamicForms = (DynamicForms) this.f13254d.getValue();
        if (i4 == 0) {
            return dynamicForms;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13262a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13263c = 1;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13262a + 87;
            f13263c = i3 % 128;
            int i4 = i3 % 2;
            b(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f13263c + 99;
            f13262a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private void b(Composer composer, int i2) {
            int i3 = 2 % 2;
            int i4 = f13263c;
            int i5 = i4 + 117;
            f13262a = i5 % 128;
            int i6 = i5 % 2;
            if ((i2 & 11) == 2) {
                int i7 = i4 + 123;
                f13262a = i7 % 128;
                if (i7 % 2 == 0) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                } else {
                    composer.getSkipping();
                    throw null;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-478183934, i2, -1, "com.incode.welcome_sdk.ui.dynamic_forms.DynamicFormsActivity.safeOnCreate.<anonymous> (DynamicFormsActivity.kt:42)");
            }
            Koin koin = DynamicFormsActivity.this.getKoin();
            final DynamicFormsActivity dynamicFormsActivity = DynamicFormsActivity.this;
            KoinApplicationKt.KoinContext(koin, ComposableLambdaKt.composableLambda(composer, -602756248, true, new Function2<Composer, Integer, Unit>() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.DynamicFormsActivity.e.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f13265a = 1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f13266d = 0;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    int i8 = 2 % 2;
                    int i9 = f13266d + 55;
                    f13265a = i9 % 128;
                    int i10 = i9 % 2;
                    c(composer2, num.intValue());
                    Unit unit = Unit.INSTANCE;
                    if (i10 == 0) {
                        int i11 = 95 / 0;
                    }
                    return unit;
                }

                private void c(Composer composer2, int i8) {
                    int i9 = 2 % 2;
                    int i10 = f13265a + 105;
                    f13266d = i10 % 128;
                    if (i10 % 2 == 0 && (i8 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        int i11 = f13265a + 39;
                        f13266d = i11 % 128;
                        int i12 = i11 % 2;
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        int i13 = f13265a + 51;
                        f13266d = i13 % 128;
                        int i14 = i13 % 2;
                        ComposerKt.traceEventStart(-602756248, i8, -1, "com.incode.welcome_sdk.ui.dynamic_forms.DynamicFormsActivity.safeOnCreate.<anonymous>.<anonymous> (DynamicFormsActivity.kt:43)");
                    }
                    g gVar = g.f5647e;
                    final DynamicFormsActivity dynamicFormsActivity2 = dynamicFormsActivity;
                    gVar.d(ComposableLambdaKt.composableLambda(composer2, -1199141621, true, new Function2<Composer, Integer, Unit>() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.DynamicFormsActivity.e.1.4

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static int f13268b = 1;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static int f13269d = 0;

                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            int i15 = 2 % 2;
                            int i16 = f13268b + 73;
                            f13269d = i16 % 128;
                            int i17 = i16 % 2;
                            b(composer3, num.intValue());
                            Unit unit = Unit.INSTANCE;
                            int i18 = f13268b + 93;
                            f13269d = i18 % 128;
                            if (i18 % 2 == 0) {
                                return unit;
                            }
                            throw null;
                        }

                        private void b(Composer composer3, int i15) {
                            int i16 = 2 % 2;
                            if ((i15 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            Object obj = null;
                            if (ComposerKt.isTraceInProgress()) {
                                int i17 = f13269d + 107;
                                f13268b = i17 % 128;
                                if (i17 % 2 == 0) {
                                    ComposerKt.traceEventStart(-1199141621, i15, -1, "com.incode.welcome_sdk.ui.dynamic_forms.DynamicFormsActivity.safeOnCreate.<anonymous>.<anonymous>.<anonymous> (DynamicFormsActivity.kt:44)");
                                    throw null;
                                }
                                ComposerKt.traceEventStart(-1199141621, i15, -1, "com.incode.welcome_sdk.ui.dynamic_forms.DynamicFormsActivity.safeOnCreate.<anonymous>.<anonymous>.<anonymous> (DynamicFormsActivity.kt:44)");
                            }
                            DynamicFormsActivity dynamicFormsActivity3 = dynamicFormsActivity2;
                            final DynamicFormsActivity dynamicFormsActivity4 = dynamicFormsActivity2;
                            Function0<ParametersHolder> function0 = new Function0<ParametersHolder>() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.DynamicFormsActivity.e.1.4.5

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                private static int f13271c = 0;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                private static int f13272d = 1;

                                private ParametersHolder d() {
                                    int i18 = 2 % 2;
                                    int i19 = f13271c + 87;
                                    f13272d = i19 % 128;
                                    if (i19 % 2 != 0) {
                                        return ParametersHolderKt.parametersOf(DynamicFormsActivity.access$getDynamicForms(dynamicFormsActivity4), dynamicFormsActivity4);
                                    }
                                    Object[] objArr = new Object[4];
                                    objArr[1] = DynamicFormsActivity.access$getDynamicForms(dynamicFormsActivity4);
                                    objArr[1] = dynamicFormsActivity4;
                                    return ParametersHolderKt.parametersOf(objArr);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final /* synthetic */ ParametersHolder invoke() {
                                    int i18 = 2 % 2;
                                    int i19 = f13272d + 65;
                                    f13271c = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        return d();
                                    }
                                    d();
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }

                                {
                                    super(0);
                                }
                            };
                            composer3.startReplaceableGroup(-1614864554);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer3, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                            }
                            ViewModel viewModelResolveViewModel = GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(DynamicFormsViewModel.class), current.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(current, composer3, 8), null, KoinApplicationKt.currentKoinScope(composer3, 0), function0);
                            composer3.endReplaceableGroup();
                            DynamicFormsActivity.access$setViewModel$p(dynamicFormsActivity3, (DynamicFormsViewModel) viewModelResolveViewModel);
                            DynamicFormsViewModel dynamicFormsViewModelAccess$getViewModel$p = DynamicFormsActivity.access$getViewModel$p(dynamicFormsActivity2);
                            if (dynamicFormsViewModelAccess$getViewModel$p == null) {
                                int i18 = f13269d + 45;
                                f13268b = i18 % 128;
                                if (i18 % 2 == 0) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    int i19 = 82 / 0;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                dynamicFormsViewModelAccess$getViewModel$p = null;
                            }
                            DynamicFormsContainerScreenKt.DynamicFormsContainerScreen(dynamicFormsViewModelAccess$getViewModel$p, dynamicFormsActivity2, composer3, 72);
                            if (ComposerKt.isTraceInProgress()) {
                                int i20 = f13268b + 103;
                                f13269d = i20 % 128;
                                if (i20 % 2 == 0) {
                                    ComposerKt.traceEventEnd();
                                } else {
                                    ComposerKt.traceEventEnd();
                                    obj.hashCode();
                                    throw null;
                                }
                            }
                        }

                        {
                            super(2);
                        }
                    }), composer2, 54);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                {
                    super(2);
                }
            }), composer, 56, 0);
            if (!ComposerKt.isTraceInProgress()) {
                return;
            }
            int i8 = f13263c + 19;
            f13262a = i8 % 128;
            if (i8 % 2 != 0) {
                ComposerKt.traceEventEnd();
                int i9 = 18 / 0;
            } else {
                ComposerKt.traceEventEnd();
            }
        }

        e() {
            super(2);
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        super.setContent(null, ComposableLambdaKt.composableLambdaInstance(-478183934, true, new e()));
        int i3 = f13252j + 13;
        f13250g = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void publishUserCancelled() {
        int i2 = 2 % 2;
        int i3 = f13250g + 57;
        f13252j = i3 % 128;
        int i4 = i3 % 2;
        super.publishUserCancelled();
        DynamicFormsViewModel dynamicFormsViewModel = this.f13256h;
        if (dynamicFormsViewModel == null) {
            int i5 = f13252j + 41;
            f13250g = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            dynamicFormsViewModel = null;
        }
        dynamicFormsViewModel.onUserCancelled();
    }

    static {
        int i2 = f13249f + 125;
        f13251i = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
    }

    @JvmStatic
    public static final void start(Context context, DynamicForms dynamicForms) {
        int i2 = 2 % 2;
        int i3 = f13250g + 121;
        f13252j = i3 % 128;
        int i4 = i3 % 2;
        f13248b.start(context, dynamicForms);
        int i5 = f13250g + 81;
        f13252j = i5 % 128;
        int i6 = i5 % 2;
    }
}
