package com.incode.welcome_sdk.ui.combined_consent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.DisplayMode;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.n;
import com.incode.welcome_sdk.commons.theme.h;
import com.incode.welcome_sdk.modules.CombinedConsent;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.BaseResult;
import com.incode.welcome_sdk.results.CombinedConsentResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.combined_consent.view.ConsentScreenKt;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import timber.log.Timber;
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
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class CombinedConsentActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f12859b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f12860f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f12861h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f12862i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f12863j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CombinedConsentViewModel f12864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f12865d = LazyKt.lazy(new b());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f12866e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Modules f12867g;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("3 e#\u0007", (short) (C1580rY.Xd() ^ ((62194080 ^ 716775014) ^ (-688653532))), (short) (C1580rY.Xd() ^ (1919858353 ^ (-1919845046))));
            String strVd = hg.Vd("iV", (short) (C1499aX.Xd() ^ (1564623755 ^ (-1564622307))), (short) (C1499aX.Xd() ^ (1224707742 ^ (-1224704523))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("8%j(\f", (short) (OY.Xd() ^ ((1183078578 ^ 1235084205) ^ 253356920)));
                String strYd = C1561oA.yd("]K", (short) (C1607wl.Xd() ^ (1648331921 ^ 1648328941)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("0\u001ff&\f", (short) (C1580rY.Xd() ^ ((1007773047 ^ 401015053) ^ (-737568520))));
                    short sXd = (short) (C1580rY.Xd() ^ ((797202246 ^ 459392156) ^ (-887458267)));
                    short sXd2 = (short) (C1580rY.Xd() ^ ((1290975166 ^ 1940259688) ^ (-1062507491)));
                    int[] iArr = new int["\u0019\u000f".length()];
                    QB qb = new QB("\u0019\u000f");
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
                        Method declaredMethod = Class.forName(Jg.Wd("\u000fbcG\u0014", (short) (C1499aX.Xd() ^ ((781297962 ^ 1786713918) ^ (-1156494012))), (short) (C1499aX.Xd() ^ ((256997294 ^ 1926482040) ^ (-2105705441))))).getDeclaredMethod(ZO.xd("zF", (short) (C1499aX.Xd() ^ ((1000642833 ^ 1491228146) ^ (-1665589193))), (short) (C1499aX.Xd() ^ ((816015920 ^ 909409367) ^ (-110585513)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("T=\u000bT\u000e'", (short) (OY.Xd() ^ (56118042 ^ 56101455)), (short) (OY.Xd() ^ ((2109024569 ^ 421267886) ^ 1688822985)));
                                short sXd3 = (short) (ZN.Xd() ^ (359202331 ^ 359184776));
                                int[] iArr2 = new int["9\u0018]EX\u0006\u0017\u0016pniWu\u000f\u00130\u001d1u\u0006<\u0019p".length()];
                                QB qb2 = new QB("9\u0018]EX\u0006\u0017\u0016pniWu\u000f\u00130\u001d1u\u0006<\u0019p");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                                    i3++;
                                }
                                Object[] objArr2 = {strUd2};
                                Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Qd("DAO-RKK;B'8DG923", (short) (Od.Xd() ^ ((1130472679 ^ 627156902) ^ (-1711291496)))), Class.forName(EO.Od("p\u0010Uag\u0004N=\u0006Ij0y\u0001_{", (short) (OY.Xd() ^ ((43808488 ^ 1805021831) ^ 1762278039)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("}l4sY", (short) (C1633zX.Xd() ^ ((1437623080 ^ 1207334555) ^ (-306594897))), (short) (C1633zX.Xd() ^ ((1446287778 ^ 1095227412) ^ (-393434589))));
                                    short sXd4 = (short) (C1580rY.Xd() ^ (119739223 ^ (-119742679)));
                                    int[] iArr3 = new int["\u0012\u0006".length()];
                                    QB qb3 = new QB("\u0012\u0006");
                                    int i4 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                                        i4++;
                                    }
                                    String str2 = new String(iArr3, 0, i4);
                                    try {
                                        Class<?> cls4 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls4.getField(str2) : cls4.getDeclaredField(str2);
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
                    String strKd2 = C1561oA.Kd("ZI\u0011P6", (short) (Od.Xd() ^ (2131670032 ^ (-2131674062))));
                    String strZd2 = Wg.Zd(";\u001b", (short) (FB.Xd() ^ (1890695410 ^ 1890705123)), (short) (FB.Xd() ^ (282084559 ^ 282080709)));
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
                        short sXd5 = (short) (C1633zX.Xd() ^ ((529916093 ^ 358158173) ^ (-181203134)));
                        int[] iArr4 = new int["[J\u0012Q7".length()];
                        QB qb4 = new QB("[J\u0012Q7");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 + i5));
                            i5++;
                        }
                        String str3 = new String(iArr4, 0, i5);
                        String strVd2 = Wg.vd("C7", (short) (C1607wl.Xd() ^ ((1454171081 ^ 1335304969) ^ 423346450)));
                        try {
                            Class<?> cls6 = Class.forName(str3);
                            Field field6 = 0 != 0 ? cls6.getField(strVd2) : cls6.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i6 = (1083104635 ^ 1387715754) ^ 305660314;
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

    public CombinedConsentActivity() {
        final CombinedConsentActivity combinedConsentActivity = this;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final byte b2 = 0 == true ? 1 : 0;
        this.f12866e = LazyKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<n>() { // from class: com.incode.welcome_sdk.ui.combined_consent.CombinedConsentActivity$special$$inlined$inject$default$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f12890b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f12891d = 1;

            /* JADX WARN: Type inference failed for: r0v15, types: [com.incode.welcome_sdk.commons.n, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9, types: [com.incode.welcome_sdk.commons.n, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final n invoke() {
                int i2 = 2 % 2;
                int i3 = f12890b;
                int i4 = i3 + 61;
                f12891d = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    boolean z2 = combinedConsentActivity instanceof KoinScopeComponent;
                    obj.hashCode();
                    throw null;
                }
                KoinComponent koinComponent = combinedConsentActivity;
                Qualifier qualifier2 = qualifier;
                Function0<? extends ParametersHolder> function0 = b2;
                if (!(koinComponent instanceof KoinScopeComponent)) {
                    return koinComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(n.class), qualifier2, function0);
                }
                int i5 = i3 + 79;
                f12891d = i5 % 128;
                if (i5 % 2 != 0) {
                    return ((KoinScopeComponent) koinComponent).getScope().get(Reflection.getOrCreateKotlinClass(n.class), qualifier2, function0);
                }
                ((KoinScopeComponent) koinComponent).getScope().get(Reflection.getOrCreateKotlinClass(n.class), qualifier2, function0);
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.f12867g = Modules.COMBINED_CONSENT;
    }

    public static final /* synthetic */ CombinedConsent access$getCombinedConsent(CombinedConsentActivity combinedConsentActivity) {
        int i2 = 2 % 2;
        int i3 = f12860f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12861h = i3 % 128;
        int i4 = i3 % 2;
        CombinedConsent combinedConsentA = combinedConsentActivity.a();
        int i5 = f12860f + 77;
        f12861h = i5 % 128;
        if (i5 % 2 != 0) {
            return combinedConsentA;
        }
        throw null;
    }

    public static final /* synthetic */ n access$getScreenNameHolder(CombinedConsentActivity combinedConsentActivity) {
        int i2 = 2 % 2;
        int i3 = f12860f + 81;
        f12861h = i3 % 128;
        if (i3 % 2 == 0) {
            combinedConsentActivity.d();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        n nVarD = combinedConsentActivity.d();
        int i4 = f12860f + 11;
        f12861h = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return nVarD;
    }

    static final class b extends Lambda implements Function0<CombinedConsent> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12875b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12876e = 0;

        private CombinedConsent c() {
            int i2 = 2 % 2;
            int i3 = f12875b + 41;
            f12876e = i3 % 128;
            int i4 = i3 % 2;
            CombinedConsent combinedConsent = (CombinedConsent) CombinedConsentActivity.this.getIntent().getParcelableExtra("extra_combined_consent");
            int i5 = f12875b + 93;
            f12876e = i5 % 128;
            int i6 = i5 % 2;
            return combinedConsent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ CombinedConsent invoke() {
            int i2 = 2 % 2;
            int i3 = f12876e + 41;
            f12875b = i3 % 128;
            if (i3 % 2 != 0) {
                return c();
            }
            c();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        b() {
            super(0);
        }
    }

    private final CombinedConsent a() {
        int i2 = 2 % 2;
        int i3 = f12861h + 59;
        f12860f = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CombinedConsent combinedConsent = (CombinedConsent) this.f12865d.getValue();
        int i4 = f12860f + 55;
        f12861h = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return combinedConsent;
    }

    private final n d() {
        int i2 = 2 % 2;
        int i3 = f12860f + 35;
        f12861h = i3 % 128;
        int i4 = i3 % 2;
        n nVar = (n) this.f12866e.getValue();
        int i5 = f12860f + 109;
        f12861h = i5 % 128;
        if (i5 % 2 != 0) {
            return nVar;
        }
        throw null;
    }

    public final CombinedConsentViewModel getViewModel() {
        int i2 = 2 % 2;
        int i3 = f12860f + 51;
        f12861h = i3 % 128;
        int i4 = i3 % 2;
        CombinedConsentViewModel combinedConsentViewModel = this.f12864c;
        if (combinedConsentViewModel != null) {
            return combinedConsentViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = f12860f + 83;
        f12861h = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final void setViewModel(CombinedConsentViewModel combinedConsentViewModel) {
        int i2 = 2 % 2;
        int i3 = f12861h + 59;
        f12860f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(combinedConsentViewModel, "");
        this.f12864c = combinedConsentViewModel;
        int i5 = f12860f + 65;
        f12861h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f12861h + 41;
        int i4 = i3 % 128;
        f12860f = i4;
        int i5 = i3 % 2;
        Modules modules = this.f12867g;
        int i6 = i4 + 31;
        f12861h = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 70 / 0;
        }
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f12860f + 5;
        f12861h = i3 % 128;
        if (i3 % 2 == 0) {
            d().b().getValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ScreenName value = d().b().getValue();
        int i4 = f12861h + 47;
        f12860f = i4 % 128;
        int i5 = i4 % 2;
        return value;
    }

    static final class a extends Lambda implements Function0<BaseResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12870a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12871b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12872c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12873d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f12874e = new a();

        private static BaseResult e() {
            int i2 = 2 % 2;
            CombinedConsentResult combinedConsentResult = new CombinedConsentResult(ResultCode.USER_CANCELLED, null, false, 6, null);
            int i3 = f12870a + 11;
            f12873d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 61 / 0;
            }
            return combinedConsentResult;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ BaseResult invoke() {
            int i2 = 2 % 2;
            int i3 = f12870a + 43;
            f12873d = i3 % 128;
            int i4 = i3 % 2;
            BaseResult baseResultE = e();
            int i5 = f12870a + 3;
            f12873d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 85 / 0;
            }
            return baseResultE;
        }

        static {
            int i2 = f12871b + 83;
            f12872c = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        a() {
            super(0);
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final BaseActivity.Config getConfig() {
        int i2 = 2 % 2;
        int i3 = f12861h + 1;
        f12860f = i3 % 128;
        int i4 = i3 % 2;
        BaseActivity.Config configCopy$default = BaseActivity.Config.copy$default(super.getConfig(), false, false, false, false, a.f12874e, 15, null);
        int i5 = f12861h + 65;
        f12860f = i5 % 128;
        int i6 = i5 % 2;
        return configCopy$default;
    }

    static final class d extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12887c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12888d = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ ParametersHolder invoke() {
            int i2 = 2 % 2;
            int i3 = f12888d + 43;
            f12887c = i3 % 128;
            int i4 = i3 % 2;
            ParametersHolder parametersHolderA = a();
            int i5 = f12888d + 57;
            f12887c = i5 % 128;
            if (i5 % 2 != 0) {
                return parametersHolderA;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private ParametersHolder a() {
            int i2 = 2 % 2;
            int i3 = f12887c + 59;
            f12888d = i3 % 128;
            if (i3 % 2 == 0) {
                return ParametersHolderKt.parametersOf(CombinedConsentActivity.access$getCombinedConsent(CombinedConsentActivity.this), CombinedConsentActivity.access$getScreenNameHolder(CombinedConsentActivity.this), CombinedConsentActivity.this);
            }
            Object[] objArr = new Object[2];
            objArr[1] = CombinedConsentActivity.access$getCombinedConsent(CombinedConsentActivity.this);
            objArr[1] = CombinedConsentActivity.access$getScreenNameHolder(CombinedConsentActivity.this);
            objArr[3] = CombinedConsentActivity.this;
            return ParametersHolderKt.parametersOf(objArr);
        }

        d() {
            super(0);
        }
    }

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12878a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12879e = 1;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f12878a + 11;
            f12879e = i3 % 128;
            int i4 = i3 % 2;
            b(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f12878a + 63;
            f12879e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 89 / 0;
            }
            return unit;
        }

        private void b(Composer composer, int i2) {
            int i3 = 2 % 2;
            if ((i2 & 11) == 2) {
                int i4 = f12878a + 39;
                f12879e = i4 % 128;
                int i5 = i4 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(860541771, i2, -1, "com.incode.welcome_sdk.ui.combined_consent.CombinedConsentActivity.safeOnCreate.<anonymous> (CombinedConsentActivity.kt:49)");
                int i6 = f12879e + 7;
                f12878a = i6 % 128;
                int i7 = i6 % 2;
            }
            Koin koin = CombinedConsentActivity.this.getKoin();
            final CombinedConsentActivity combinedConsentActivity = CombinedConsentActivity.this;
            KoinApplicationKt.KoinContext(koin, ComposableLambdaKt.composableLambda(composer, 1849514149, true, new Function2<Composer, Integer, Unit>() { // from class: com.incode.welcome_sdk.ui.combined_consent.CombinedConsentActivity.c.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f12881b = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f12882c = 0;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    int i8 = 2 % 2;
                    int i9 = f12882c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f12881b = i9 % 128;
                    int i10 = i9 % 2;
                    d(composer2, num.intValue());
                    Unit unit = Unit.INSTANCE;
                    int i11 = f12881b + 81;
                    f12882c = i11 % 128;
                    if (i11 % 2 == 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private void d(Composer composer2, int i8) {
                    int i9 = 2 % 2;
                    int i10 = f12882c + 63;
                    f12881b = i10 % 128;
                    if (i10 % 2 != 0 ? (i8 & 11) == 2 : (i8 & 118) == 4) {
                        if (!(!composer2.getSkipping())) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1849514149, i8, -1, "com.incode.welcome_sdk.ui.combined_consent.CombinedConsentActivity.safeOnCreate.<anonymous>.<anonymous> (CombinedConsentActivity.kt:50)");
                    }
                    h hVar = h.f5694b;
                    DisplayMode displayMode = DisplayMode.LIGHT;
                    final CombinedConsentActivity combinedConsentActivity2 = combinedConsentActivity;
                    hVar.d(displayMode, ComposableLambdaKt.composableLambda(composer2, -629431634, true, new Function2<Composer, Integer, Unit>() { // from class: com.incode.welcome_sdk.ui.combined_consent.CombinedConsentActivity.c.1.3

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private static int f12884a = 0;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static int f12885d = 1;

                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            int i11 = 2 % 2;
                            int i12 = f12884a + 57;
                            f12885d = i12 % 128;
                            int i13 = i12 % 2;
                            e(composer3, num.intValue());
                            Unit unit = Unit.INSTANCE;
                            if (i13 != 0) {
                                return unit;
                            }
                            throw null;
                        }

                        private void e(Composer composer3, int i11) {
                            int i12 = 2 % 2;
                            if ((i11 & 11) == 2) {
                                int i13 = f12884a + 77;
                                f12885d = i13 % 128;
                                int i14 = i13 % 2;
                                if (composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    int i15 = f12884a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                                    f12885d = i15 % 128;
                                    int i16 = i15 % 2;
                                    return;
                                }
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-629431634, i11, -1, "com.incode.welcome_sdk.ui.combined_consent.CombinedConsentActivity.safeOnCreate.<anonymous>.<anonymous>.<anonymous> (CombinedConsentActivity.kt:51)");
                            }
                            ConsentScreenKt.ConsentScreen(combinedConsentActivity2.getViewModel(), composer3, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        {
                            super(2);
                        }
                    }), composer2, 438, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        int i11 = f12882c + 69;
                        f12881b = i11 % 128;
                        int i12 = i11 % 2;
                    }
                }

                {
                    super(2);
                }
            }), composer, 56, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                int i8 = f12878a + 47;
                f12879e = i8 % 128;
                int i9 = i8 % 2;
            }
        }

        c() {
            super(2);
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        if (a() != null) {
            setViewModel((CombinedConsentViewModel) getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CombinedConsentViewModel.class), null, new d()));
            super.setContent(null, ComposableLambdaKt.composableLambdaInstance(860541771, true, new c()));
            return;
        }
        int i3 = f12861h + 115;
        f12860f = i3 % 128;
        int i4 = i3 % 2;
        Timber.Forest.e("CombinedConsent must not be null.", new Object[0]);
        int i5 = f12861h + 11;
        f12860f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12868c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12869e = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, CombinedConsent combinedConsent) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(combinedConsent, "");
            Intent intent = new Intent(context, (Class<?>) CombinedConsentActivity.class);
            intent.putExtra("extra_combined_consent", combinedConsent);
            CX.ud();
            context.startActivity(intent);
            int i3 = f12869e + 109;
            f12868c = i3 % 128;
            int i4 = i3 % 2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f12859b = new Companion(defaultConstructorMarker);
        int i2 = f12863j + 67;
        f12862i = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @JvmStatic
    public static final void start(Context context, CombinedConsent combinedConsent) {
        int i2 = 2 % 2;
        int i3 = f12861h + 37;
        f12860f = i3 % 128;
        if (i3 % 2 != 0) {
            f12859b.start(context, combinedConsent);
            int i4 = 34 / 0;
        } else {
            f12859b.start(context, combinedConsent);
        }
        int i5 = f12861h + 3;
        f12860f = i5 % 128;
        int i6 = i5 % 2;
    }
}
