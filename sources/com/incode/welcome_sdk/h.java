package com.incode.welcome_sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.incode.welcome_sdk.m;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.BaseResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends BaseActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f10302d = new e(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f10303f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f10304g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f10305h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f10306j = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Modules f10309e = Modules.TRANSITION_SCREEN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScreenName f10308c = ScreenName.TRANSITION_LOADER;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineScope f10307b = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            short sXd = (short) (C1580rY.Xd() ^ ((1762565009 ^ 767824128) ^ (-1154134268)));
            short sXd2 = (short) (C1580rY.Xd() ^ ((1746538885 ^ 1760479882) ^ (-16030447)));
            int[] iArr = new int["wf.mS".length()];
            QB qb = new QB("wf.mS");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strOd = C1561oA.od("\u000bw", (short) (OY.Xd() ^ (635351375 ^ 635369328)));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strKd = C1561oA.Kd("!\u0010W\u0017|", (short) (C1633zX.Xd() ^ ((1331578521 ^ 276675566) ^ (-1596165989))));
                String strZd = Wg.Zd("\u0003f", (short) (C1499aX.Xd() ^ (700166552 ^ (-700167865))), (short) (C1499aX.Xd() ^ ((389406167 ^ 95712453) ^ (-310488001))));
                try {
                    Class<?> cls2 = Class.forName(strKd);
                    Field field2 = 0 != 0 ? cls2.getField(strZd) : cls2.getDeclaredField(strZd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strXd = C1561oA.Xd("~m5tZ", (short) (C1580rY.Xd() ^ (678735763 ^ (-678743451))));
                    String strVd = Wg.vd("\u0018\u000e", (short) (OY.Xd() ^ ((1790848776 ^ 1872676073) ^ 86027696)));
                    try {
                        Class<?> cls3 = Class.forName(strXd);
                        Field field3 = 0 != 0 ? cls3.getField(strVd) : cls3.getDeclaredField(strVd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd3 = (short) (C1580rY.Xd() ^ (893714627 ^ (-893731672)));
                        short sXd4 = (short) (C1580rY.Xd() ^ ((622932157 ^ 869745446) ^ (-385234218)));
                        int[] iArr2 = new int["\u0012~D\u000em".length()];
                        QB qb2 = new QB("\u0012~D\u000em");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(((sXd3 + i3) + xuXd2.CK(iKK2)) - sXd4);
                            i3++;
                        }
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(hg.Vd("NY", (short) (OY.Xd() ^ (1118351402 ^ 1118369179)), (short) (OY.Xd() ^ ((1224479821 ^ 531001565) ^ 1465531165))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1561oA.ud("8)-\",3", (short) (FB.Xd() ^ (935612735 ^ 935617669)))};
                                Method method = Class.forName(C1561oA.yd(" .%4*%!k\u001a''.\u0018\")c\u0012??F0DA", (short) (FB.Xd() ^ (1324893216 ^ 1324884543)))).getMethod(Xg.qd("HGW7^Y[MV=P^cWRU", (short) (Od.Xd() ^ (2067671352 ^ (-2067674171))), (short) (Od.Xd() ^ (140243001 ^ (-140232688)))), Class.forName(C1561oA.Yd("\u001e\u0016,\u0018e%\u001b)#j\u001132*0*", (short) (C1633zX.Xd() ^ (160060715 ^ (-160069279))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd5 = (short) (ZN.Xd() ^ (144659797 ^ 144666697));
                                    short sXd6 = (short) (ZN.Xd() ^ ((946786135 ^ 195050625) ^ 869172946));
                                    int[] iArr3 = new int["\u001e!L\u0011z".length()];
                                    QB qb3 = new QB("\u001e!L\u0011z");
                                    int i4 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd6) ^ sXd5));
                                        i4++;
                                    }
                                    String str2 = new String(iArr3, 0, i4);
                                    String strXd2 = ZO.xd("0\u0013", (short) (C1607wl.Xd() ^ (649166917 ^ 649180063)), (short) (C1607wl.Xd() ^ (295844294 ^ 295830097)));
                                    try {
                                        Class<?> cls4 = Class.forName(str2);
                                        Field field4 = 0 != 0 ? cls4.getField(strXd2) : cls4.getDeclaredField(strXd2);
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
                    String strUd = C1626yg.Ud("\u0004I(sG", (short) (OY.Xd() ^ ((1492676431 ^ 1009831146) ^ 1690879062)), (short) (OY.Xd() ^ (986017038 ^ 986011400)));
                    String strWd = Ig.wd("R\u0012", (short) (C1633zX.Xd() ^ ((329483981 ^ 2108545397) ^ (-1846424906))));
                    try {
                        Class<?> cls5 = Class.forName(strUd);
                        Field field5 = 0 != 0 ? cls5.getField(strWd) : cls5.getDeclaredField(strWd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strOd2 = EO.Od("R\nbI7", (short) (FB.Xd() ^ ((96185485 ^ 1253354958) ^ 1326400137)));
                        String strQd = C1561oA.Qd("_S", (short) (FB.Xd() ^ ((2146074401 ^ 1656903601) ^ 489176900)));
                        try {
                            Class<?> cls6 = Class.forName(strOd2);
                            Field field6 = 0 != 0 ? cls6.getField(strQd) : cls6.getDeclaredField(strQd);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i5 = (1949869899 ^ 1823060236) ^ 412161548;
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
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f10306j + 23;
        int i4 = i3 % 128;
        f10305h = i4;
        int i5 = i3 % 2;
        Modules modules = this.f10309e;
        int i6 = i4 + 99;
        f10306j = i6 % 128;
        int i7 = i6 % 2;
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f10306j;
        int i4 = i3 + 25;
        f10305h = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f10308c;
        int i6 = i3 + 79;
        f10305h = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    static final class c extends Lambda implements Function0<BaseResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10310a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f10311b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10312c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10313d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10314e = 0;

        private static BaseResult d() {
            int i2 = 2 % 2;
            b bVar = new b();
            int i3 = f10312c + 53;
            f10313d = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ BaseResult invoke() {
            BaseResult baseResultD;
            int i2 = 2 % 2;
            int i3 = f10312c + 13;
            f10313d = i3 % 128;
            if (i3 % 2 != 0) {
                baseResultD = d();
                int i4 = 5 / 0;
            } else {
                baseResultD = d();
            }
            int i5 = f10313d + 47;
            f10312c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 57 / 0;
            }
            return baseResultD;
        }

        static {
            int i2 = f10314e + 73;
            f10310a = i2 % 128;
            int i3 = i2 % 2;
        }

        c() {
            super(0);
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final BaseActivity.Config getConfig() {
        int i2 = 2 % 2;
        int i3 = f10305h + 61;
        f10306j = i3 % 128;
        int i4 = i3 % 2;
        BaseActivity.Config configCopy$default = BaseActivity.Config.copy$default(super.getConfig(), false, false, false, false, c.f10311b, 15, null);
        int i5 = f10305h + 25;
        f10306j = i5 % 128;
        if (i5 % 2 == 0) {
            return configCopy$default;
        }
        throw null;
    }

    static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10315b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10316e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10318c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10316e + 121;
            f10315b = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f10318c;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                m mVar = m.f10422b;
                StateFlow<m.e> stateFlowB = m.b();
                Lifecycle lifecycle = h.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "");
                Flow flowFlowWithLifecycle$default = FlowExtKt.flowWithLifecycle$default(stateFlowB, lifecycle, null, 2, null);
                final h hVar = h.this;
                this.f10318c = 1;
                if (flowFlowWithLifecycle$default.collect(new FlowCollector() { // from class: com.incode.welcome_sdk.h.d.5

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f10319c = 0;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static int f10320e = 1;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        int i6 = 2 % 2;
                        int i7 = f10320e + 105;
                        f10319c = i7 % 128;
                        m.e eVar = (m.e) obj2;
                        if (i7 % 2 == 0) {
                            return d(eVar);
                        }
                        d(eVar);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    private Object d(final m.e eVar) {
                        int i6 = 2 % 2;
                        if (eVar.d()) {
                            if (eVar.e() != null) {
                                hVar.showNoNetworkMessage(new Function0<Unit>() { // from class: com.incode.welcome_sdk.h.d.5.4

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    private static int f10322b = 0;

                                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                                    private static int f10323d = 1;

                                    @Override // kotlin.jvm.functions.Function0
                                    public final /* synthetic */ Unit invoke() {
                                        int i7 = 2 % 2;
                                        int i8 = f10322b + 67;
                                        f10323d = i8 % 128;
                                        int i9 = i8 % 2;
                                        c();
                                        if (i9 == 0) {
                                            Unit unit = Unit.INSTANCE;
                                            throw null;
                                        }
                                        Unit unit2 = Unit.INSTANCE;
                                        int i10 = f10323d + 123;
                                        f10322b = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            return unit2;
                                        }
                                        throw null;
                                    }

                                    private void c() {
                                        int i7 = 2 % 2;
                                        int i8 = f10323d + 27;
                                        f10322b = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            eVar.e().invoke();
                                            int i9 = 59 / 0;
                                        } else {
                                            eVar.e().invoke();
                                        }
                                    }

                                    {
                                        super(0);
                                    }
                                });
                            }
                        } else {
                            hVar.finish();
                            int i7 = f10319c + 57;
                            f10320e = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i9 = f10320e + 51;
                        f10319c = i9 % 128;
                        int i10 = i9 % 2;
                        return unit;
                    }
                }, this) == coroutine_suspended) {
                    int i6 = f10315b + 115;
                    f10316e = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 41 / 0;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10315b + 43;
            f10316e = i3 % 128;
            int i4 = i3 % 2;
            Object objA = a(coroutineScope, continuation);
            int i5 = f10315b + 123;
            f10316e = i5 % 128;
            if (i5 % 2 == 0) {
                return objA;
            }
            throw null;
        }

        private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10316e + 81;
            f10315b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f10316e + 43;
            f10315b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 35 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            d dVar = h.this.new d(continuation);
            int i3 = f10316e + 17;
            f10315b = i3 % 128;
            int i4 = i3 % 2;
            return dVar;
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        setContentView(R.layout.onboard_sdk_activity_transition);
        BuildersKt__Builders_commonKt.launch$default(this.f10307b, null, null, new d(null), 3, null);
        int i3 = f10305h + 27;
        f10306j = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f10306j + 113;
        f10305h = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnDestroy();
        CoroutineScopeKt.cancel$default(this.f10307b, null, 1, null);
        int i5 = f10305h + 31;
        f10306j = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10325d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10326e = 0;

        private e() {
        }

        @JvmStatic
        public static void c(Context context) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) h.class);
            CX.ud();
            context.startActivity(intent);
            int i3 = f10326e + 17;
            f10325d = i3 % 128;
            int i4 = i3 % 2;
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    public static final class b extends BaseResult {
        public b() {
            super(ResultCode.USER_CANCELLED, null, null, 6, null);
        }
    }

    static {
        int i2 = f10304g + 11;
        f10303f = i2 % 128;
        int i3 = i2 % 2;
    }
}
