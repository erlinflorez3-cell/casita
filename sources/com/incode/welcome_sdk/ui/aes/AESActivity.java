package com.incode.welcome_sdk.ui.aes;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.extensions.k;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.d.am;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.AESResult;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.aes.AESScreenState;
import com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt;
import com.incode.welcome_sdk.views.IncodeTextView;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Typography;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.RequestBody;
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
public final class AESActivity extends BaseActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f10832d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f10833f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f10834g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f10835h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f10836m = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.incode.welcome_sdk.d.c f10837b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AESViewModel f10840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private DocumentsAdapter f10841j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScreenName f10839e = ScreenName.AES_PRESIGN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Modules f10838c = Modules.AE_SIGNATURE;

    public static /* synthetic */ Object b(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) throws Exception {
        int i8 = i5 | i4 | i6;
        int i9 = (~((~i6) | i4)) | i5;
        int i10 = ~((~i5) | i4);
        int i11 = i5 + i4 + i7 + (1132004924 * i3) + ((-2047965933) * i2);
        int i12 = i11 * i11;
        int i13 = ((1650805025 * i5) - 289800192) + ((-1513965855) * i4) + ((-565098208) * i8) + (i9 * 565098208) + (565098208 * i10) + ((-2079064064) * i7) + (1823473664 * i3) + (830210048 * i2) + ((-1143341056) * i12);
        int i14 = ((i5 * (-767560105)) - 1188649921) + (i4 * (-767559017)) + (i8 * (-544)) + (i9 * 544) + (i10 * 544) + (i7 * (-767559561)) + (i3 * 1544553956) + (i2 * (-1468578859)) + (i12 * (-2108293120));
        if (i13 + (i14 * i14 * (-2075787264)) == 1) {
            return d(objArr);
        }
        AESActivity aESActivity = (AESActivity) objArr[0];
        int i15 = 2 % 2;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("application/pdf");
        CX.ud();
        aESActivity.startActivityForResult(intent, 76);
        int i16 = f10834g + 113;
        f10833f = i16 % 128;
        int i17 = i16 % 2;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$a$-Lcom-incode-welcome_sdk-d-c--V, reason: not valid java name */
    public static /* synthetic */ void m8222instrumented$0$a$Lcomincodewelcome_sdkdcV(AESActivity aESActivity, View view) {
        Callback.onClick_enter(view);
        try {
            a(aESActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$a$-Lcom-incode-welcome_sdk-d-c--V, reason: not valid java name */
    public static /* synthetic */ void m8223instrumented$1$a$Lcomincodewelcome_sdkdcV(AESActivity aESActivity, View view) {
        Callback.onClick_enter(view);
        try {
            e(aESActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$c$--V, reason: not valid java name */
    public static /* synthetic */ void m8224instrumented$1$c$V(AESActivity aESActivity, View view) {
        Callback.onClick_enter(view);
        try {
            d(aESActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$a$-Lcom-incode-welcome_sdk-d-c--V, reason: not valid java name */
    public static /* synthetic */ void m8225instrumented$2$a$Lcomincodewelcome_sdkdcV(AESActivity aESActivity, View view) {
        Callback.onClick_enter(view);
        try {
            c(aESActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$c$--V, reason: not valid java name */
    public static /* synthetic */ void m8226instrumented$2$c$V(AESActivity aESActivity, View view) {
        Callback.onClick_enter(view);
        try {
            b(aESActivity, view);
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
            String strKd = Qg.kd("wd*gK", (short) (C1499aX.Xd() ^ (1094692425 ^ (-1094706718))), (short) (C1499aX.Xd() ^ (1083554265 ^ (-1083557288))));
            String strVd = hg.Vd("F3", (short) (OY.Xd() ^ (847062304 ^ 847080934)), (short) (OY.Xd() ^ (1354728963 ^ 1354751541)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("\u000bw=z^", (short) (C1607wl.Xd() ^ ((1280686062 ^ 1799363231) ^ 655738067)));
                String strYd = C1561oA.yd("%\u0011", (short) (Od.Xd() ^ (1047346170 ^ (-1047335672))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("I8\u007f?%", (short) (C1580rY.Xd() ^ (1923260136 ^ (-1923269797))));
                    String strQd = Xg.qd("\u001b\u0011", (short) (C1633zX.Xd() ^ ((1291670555 ^ 1751933005) ^ (-613506464))), (short) (C1633zX.Xd() ^ ((578643696 ^ 1498651898) ^ (-2066650474))));
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
                        Method declaredMethod = Class.forName(Jg.Wd("I-C}0", (short) (ZN.Xd() ^ (1544481797 ^ 1544469636)), (short) (ZN.Xd() ^ (291260580 ^ 291263884)))).getDeclaredMethod(ZO.xd("_C", (short) (C1607wl.Xd() ^ ((521860378 ^ 1621716764) ^ 2142479600)), (short) (C1607wl.Xd() ^ ((1350844222 ^ 732219021) ^ 2065745184))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("h\tqeIK", (short) (OY.Xd() ^ (303619829 ^ 303609625)), (short) (OY.Xd() ^ (707378549 ^ 707389937)))};
                                Method method = Class.forName(Ig.wd("\u000bi+\u001c\u00073L<B! \nKXPrNnDDu_3", (short) (C1633zX.Xd() ^ ((471416557 ^ 928861435) ^ (-725903628))))).getMethod(C1561oA.Qd("ur\u0001^\u0004||lsXiuxjcd", (short) (FB.Xd() ^ ((646901775 ^ 1963911080) ^ 1400927267))), Class.forName(EO.Od("5[^%\".K_\u0018Nmt\u001e\u0013D\u001f", (short) (C1580rY.Xd() ^ ((1091675373 ^ 319815698) ^ (-1375845286))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("6%l,\u0012", (short) (Od.Xd() ^ ((966582974 ^ 2048108801) ^ (-1133472213))), (short) (Od.Xd() ^ (1668281664 ^ (-1668275977))));
                                    String strOd = C1561oA.od("=1", (short) (Od.Xd() ^ ((1563324945 ^ 796290648) ^ (-1918389117))));
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
                    short sXd = (short) (C1580rY.Xd() ^ ((157654838 ^ 1979287361) ^ (-2090598716)));
                    int[] iArr = new int["SB\nI/".length()];
                    QB qb = new QB("SB\nI/");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    String strZd2 = Wg.Zd("8N", (short) (Od.Xd() ^ (989438741 ^ (-989458940))), (short) (Od.Xd() ^ ((385260435 ^ 474700570) ^ (-180215582))));
                    try {
                        Class<?> cls5 = Class.forName(str);
                        Field field5 = 0 != 0 ? cls5.getField(strZd2) : cls5.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("\u000byA\u0001f", (short) (ZN.Xd() ^ ((1147947550 ^ 349369090) ^ 1354671520)));
                        String strVd2 = Wg.vd("~r", (short) (OY.Xd() ^ (815173778 ^ 815191720)));
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
                        int i3 = 1201558267 ^ 1201558192;
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

    public static final /* synthetic */ com.incode.welcome_sdk.d.c access$getBinding$p(AESActivity aESActivity) {
        int i2 = 2 % 2;
        int i3 = f10833f;
        int i4 = i3 + 81;
        f10834g = i4 % 128;
        int i5 = i4 % 2;
        com.incode.welcome_sdk.d.c cVar = aESActivity.f10837b;
        int i6 = i3 + 7;
        f10834g = i6 % 128;
        int i7 = i6 % 2;
        return cVar;
    }

    public static final /* synthetic */ DocumentsAdapter access$getRvAdapter$p(AESActivity aESActivity) {
        int i2 = 2 % 2;
        int i3 = f10834g + 41;
        int i4 = i3 % 128;
        f10833f = i4;
        int i5 = i3 % 2;
        DocumentsAdapter documentsAdapter = aESActivity.f10841j;
        if (i5 != 0) {
            int i6 = 35 / 0;
        }
        int i7 = i4 + 63;
        f10834g = i7 % 128;
        if (i7 % 2 != 0) {
            return documentsAdapter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AESViewModel access$getViewModel$p(AESActivity aESActivity) {
        int i2 = 2 % 2;
        int i3 = f10833f;
        int i4 = i3 + 85;
        f10834g = i4 % 128;
        int i5 = i4 % 2;
        AESViewModel aESViewModel = aESActivity.f10840i;
        if (i5 == 0) {
            int i6 = 55 / 0;
        }
        int i7 = i3 + 43;
        f10834g = i7 % 128;
        int i8 = i7 % 2;
        return aESViewModel;
    }

    public static final /* synthetic */ void access$updateViewState(AESActivity aESActivity, AESScreenState aESScreenState) throws IOException {
        int i2 = 2 % 2;
        int i3 = f10833f + 39;
        f10834g = i3 % 128;
        int i4 = i3 % 2;
        aESActivity.d(aESScreenState);
        if (i4 == 0) {
            int i5 = 12 / 0;
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10842b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10843c = 1;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, boolean z2, boolean z3) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) AESActivity.class);
            intent.putExtra("extraUploadDocument", z2);
            intent.putExtra("extraDownloadDocument", z3);
            CX.ud();
            context.startActivity(intent);
            int i3 = f10843c + 17;
            f10842b = i3 % 128;
            int i4 = i3 % 2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f10834g;
        int i4 = i3 + 89;
        f10833f = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f10839e;
        int i6 = i3 + 99;
        f10833f = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    public final void setScreenName(ScreenName screenName) {
        int i2 = 2 % 2;
        int i3 = f10834g + 121;
        f10833f = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(screenName, "");
            this.f10839e = screenName;
        } else {
            Intrinsics.checkNotNullParameter(screenName, "");
            this.f10839e = screenName;
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f10833f + 73;
        f10834g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f10838c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class b extends Lambda implements Function1<AESResult, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10847a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10848e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AESResult aESResult) {
            int i2 = 2 % 2;
            int i3 = f10848e + 29;
            f10847a = i3 % 128;
            int i4 = i3 % 2;
            e(aESResult);
            Unit unit = Unit.INSTANCE;
            int i5 = f10847a + 115;
            f10848e = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(com.incode.welcome_sdk.results.AESResult r5) {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.ui.aes.AESActivity.b.f10848e
                int r1 = r0 + 33
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.aes.AESActivity.b.f10847a = r0
                int r1 = r1 % r3
                java.lang.String r2 = ""
                if (r1 == 0) goto L3e
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
                com.incode.welcome_sdk.ui.aes.AESActivity r0 = com.incode.welcome_sdk.ui.aes.AESActivity.this
                com.incode.welcome_sdk.ui.aes.AESViewModel r1 = com.incode.welcome_sdk.ui.aes.AESActivity.access$getViewModel$p(r0)
                r0 = 63
                int r0 = r0 / 0
                if (r1 != 0) goto L2c
            L1f:
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
                int r0 = com.incode.welcome_sdk.ui.aes.AESActivity.b.f10847a
                int r1 = r0 + 31
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.aes.AESActivity.b.f10848e = r0
                int r1 = r1 % r3
                r1 = 0
            L2c:
                com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
                com.incode.welcome_sdk.IncodeWelcome r0 = r0.getInstance()
                io.reactivex.subjects.PublishSubject r0 = r0.getAesBus()
                io.reactivex.subjects.Subject r0 = (io.reactivex.subjects.Subject) r0
                com.incode.welcome_sdk.results.BaseResult r5 = (com.incode.welcome_sdk.results.BaseResult) r5
                r1.publishResult(r0, r5)
                return
            L3e:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
                com.incode.welcome_sdk.ui.aes.AESActivity r0 = com.incode.welcome_sdk.ui.aes.AESActivity.this
                com.incode.welcome_sdk.ui.aes.AESViewModel r1 = com.incode.welcome_sdk.ui.aes.AESActivity.access$getViewModel$p(r0)
                if (r1 != 0) goto L2c
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.aes.AESActivity.b.e(com.incode.welcome_sdk.results.AESResult):void");
        }

        b() {
            super(1);
        }
    }

    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10850c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10851e = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f10853d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10851e + 65;
            f10850c = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f10853d;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                AESViewModel aESViewModelAccess$getViewModel$p = AESActivity.access$getViewModel$p(AESActivity.this);
                if (aESViewModelAccess$getViewModel$p == null) {
                    int i6 = f10850c + 47;
                    f10851e = i6 % 128;
                    if (i6 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i7 = 35 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    aESViewModelAccess$getViewModel$p = null;
                }
                StateFlow<Boolean> moduleResultProcessedState = aESViewModelAccess$getViewModel$p.getModuleResultProcessedState();
                final AESActivity aESActivity = AESActivity.this;
                this.f10853d = 1;
                if (moduleResultProcessedState.collect(new FlowCollector() { // from class: com.incode.welcome_sdk.ui.aes.AESActivity.c.4

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f10854b = 0;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static int f10855e = 1;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        int i8 = 2 % 2;
                        int i9 = f10855e + 9;
                        f10854b = i9 % 128;
                        int i10 = i9 % 2;
                        Object objC = c(((Boolean) obj2).booleanValue());
                        int i11 = f10854b + 105;
                        f10855e = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 23 / 0;
                        }
                        return objC;
                    }

                    private Object c(boolean z2) {
                        int i8 = 2 % 2;
                        int i9 = f10855e + 45;
                        f10854b = i9 % 128;
                        if (i9 % 2 != 0) {
                            throw null;
                        }
                        if (z2) {
                            aESActivity.finish();
                        }
                        Unit unit = Unit.INSTANCE;
                        int i10 = f10854b + 71;
                        f10855e = i10 % 128;
                        int i11 = i10 % 2;
                        return unit;
                    }
                }, this) == coroutine_suspended) {
                    int i8 = f10850c + 87;
                    f10851e = i8 % 128;
                    int i9 = i8 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10851e + 89;
            f10850c = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(coroutineScope, continuation);
            int i5 = f10850c + 115;
            f10851e = i5 % 128;
            if (i5 % 2 != 0) {
                return objE;
            }
            throw null;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10851e + 27;
            f10850c = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return cVar.invokeSuspend(unit);
            }
            cVar.invokeSuspend(unit);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            c cVar = AESActivity.this.new c(continuation);
            int i3 = f10851e + 41;
            f10850c = i3 % 128;
            int i4 = i3 % 2;
            return cVar;
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    @Override // com.incode.welcome_sdk.ui.BaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void safeOnCreate(android.os.Bundle r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.incode.welcome_sdk.ui.aes.AESActivity.f10833f
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.aes.AESActivity.f10834g = r0
            int r1 = r1 % r7
            super.safeOnCreate(r9)
            android.view.LayoutInflater r0 = r8.getLayoutInflater()
            com.incode.welcome_sdk.d.c r0 = com.incode.welcome_sdk.d.c.e(r0)
            java.lang.String r5 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r8.f10837b = r0
            r2 = 0
            if (r0 != 0) goto L25
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r0 = r2
        L25:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.a()
            android.view.View r0 = (android.view.View) r0
            r8.setContentView(r0)
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "extraUploadDocument"
            r6 = 0
            boolean r4 = r1.getBooleanExtra(r0, r6)
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "extraDownloadDocument"
            boolean r3 = r1.getBooleanExtra(r0, r6)
            com.incode.welcome_sdk.ui.aes.AESViewModel$Companion r1 = com.incode.welcome_sdk.ui.aes.AESViewModel.f10945c
            r0 = r8
            androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
            com.incode.welcome_sdk.ui.aes.AESViewModel r0 = r1.get(r0)
            r8.f10840i = r0
            r8.c()
            if (r4 == 0) goto L75
            int r0 = com.incode.welcome_sdk.ui.aes.AESActivity.f10834g
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.aes.AESActivity.f10833f = r0
            int r1 = r1 % r7
            if (r1 == 0) goto La2
            com.incode.welcome_sdk.d.c r1 = r8.f10837b
            r0 = 37
            int r0 = r0 / r6
            if (r1 != 0) goto L72
        L65:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            int r0 = com.incode.welcome_sdk.ui.aes.AESActivity.f10833f
            int r1 = r0 + 111
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.aes.AESActivity.f10834g = r0
            int r1 = r1 % r7
            r1 = r2
        L72:
            r8.a(r1)
        L75:
            r8.b()
            com.incode.welcome_sdk.ui.aes.AESViewModel r1 = r8.f10840i
            if (r1 != 0) goto L80
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r1 = r2
        L80:
            com.incode.welcome_sdk.ui.aes.AESActivity$b r0 = new com.incode.welcome_sdk.ui.aes.AESActivity$b
            r0.<init>()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r1.onViewCreated(r4, r3, r0)
            r0 = r8
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            com.incode.welcome_sdk.ui.aes.AESActivity$c r3 = new com.incode.welcome_sdk.ui.aes.AESActivity$c
            r3.<init>(r2)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r4 = 3
            r5 = 0
            r1 = 0
            r2 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
            return
        La2:
            com.incode.welcome_sdk.d.c r1 = r8.f10837b
            if (r1 != 0) goto L72
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.aes.AESActivity.safeOnCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        Uri data;
        int i4 = 2 % 2;
        int i5 = f10833f + 123;
        f10834g = i5 % 128;
        if (i5 % 2 == 0) {
            super.onActivityResult(i2, i3, intent);
            if (i2 != 99) {
                return;
            }
        } else {
            super.onActivityResult(i2, i3, intent);
            if (i2 != 76) {
                return;
            }
        }
        int i6 = f10833f + 87;
        int i7 = i6 % 128;
        f10834g = i7;
        int i8 = i6 % 2;
        if (i3 == -1) {
            int i9 = i7 + 39;
            f10833f = i9 % 128;
            AESViewModel aESViewModel = null;
            if (i9 % 2 != 0) {
                aESViewModel.hashCode();
                throw null;
            }
            if (intent == null || (data = intent.getData()) == null) {
                return;
            }
            if (!Intrinsics.areEqual(getContentResolver().getType(data), "application/pdf")) {
                Toast.makeText(this, R.string.onboard_sdk_aes_upload_screen_error_file_type, 0).show();
                return;
            }
            int i10 = f10834g + 79;
            f10833f = i10 % 128;
            int i11 = i10 % 2;
            AESViewModel aESViewModel2 = this.f10840i;
            if (aESViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i12 = f10833f + 57;
                f10834g = i12 % 128;
                int i13 = i12 % 2;
            } else {
                aESViewModel = aESViewModel2;
            }
            aESViewModel.onPDFSelected(data);
        }
    }

    static final class e extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10868a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10869e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Integer num) throws Exception {
            int i2 = 2 % 2;
            int i3 = f10869e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f10868a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            b(num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f10869e + 87;
            f10868a = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(int r4) throws java.lang.Exception {
            /*
                r3 = this;
                r2 = 2
                int r0 = r2 % r2
                int r0 = com.incode.welcome_sdk.ui.aes.AESActivity.e.f10868a
                int r1 = r0 + 67
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.aes.AESActivity.e.f10869e = r0
                int r1 = r1 % r2
                if (r1 == 0) goto L4b
                com.incode.welcome_sdk.ui.aes.AESActivity r0 = com.incode.welcome_sdk.ui.aes.AESActivity.this
                com.incode.welcome_sdk.ui.aes.AESViewModel r1 = com.incode.welcome_sdk.ui.aes.AESActivity.access$getViewModel$p(r0)
                r0 = 74
                int r0 = r0 / 0
                if (r1 != 0) goto L29
            L1a:
                int r0 = com.incode.welcome_sdk.ui.aes.AESActivity.e.f10868a
                int r1 = r0 + 13
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.aes.AESActivity.e.f10869e = r0
                int r1 = r1 % r2
                java.lang.String r0 = ""
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r1 = 0
            L29:
                kotlinx.coroutines.flow.StateFlow r0 = r1.getUiState()
                java.lang.Object r0 = r0.getValue()
                com.incode.welcome_sdk.ui.aes.AESUiState r0 = (com.incode.welcome_sdk.ui.aes.AESUiState) r0
                java.util.List r0 = r0.getPdfDocuments()
                java.lang.Object r0 = r0.get(r4)
                com.incode.welcome_sdk.ui.aes.DocumentState r0 = (com.incode.welcome_sdk.ui.aes.DocumentState) r0
                com.incode.welcome_sdk.ui.aes.AESActivity r1 = com.incode.welcome_sdk.ui.aes.AESActivity.this
                com.incode.welcome_sdk.data.remote.beans.i r0 = r0.getDocument()
                java.lang.String r0 = r0.b()
                r1.openPDFDocument(r0)
                return
            L4b:
                com.incode.welcome_sdk.ui.aes.AESActivity r0 = com.incode.welcome_sdk.ui.aes.AESActivity.this
                com.incode.welcome_sdk.ui.aes.AESViewModel r1 = com.incode.welcome_sdk.ui.aes.AESActivity.access$getViewModel$p(r0)
                if (r1 != 0) goto L29
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.aes.AESActivity.e.b(int):void");
        }

        e() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.incode.welcome_sdk.d.c cVar, AESActivity aESActivity, CompoundButton compoundButton, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cVar, "");
        Intrinsics.checkNotNullParameter(aESActivity, "");
        AESViewModel aESViewModel = null;
        if (Intrinsics.areEqual(compoundButton, cVar.f7158c)) {
            int i3 = f10834g + 23;
            f10833f = i3 % 128;
            int i4 = i3 % 2;
            AESViewModel aESViewModel2 = aESActivity.f10840i;
            if (aESViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                aESViewModel = aESViewModel2;
            }
            aESViewModel.onTermsAndConditionsIsChecked(z2);
            return;
        }
        if (Intrinsics.areEqual(compoundButton, cVar.f7157b)) {
            AESViewModel aESViewModel3 = aESActivity.f10840i;
            if (aESViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = f10834g + 77;
                f10833f = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 / 5;
                }
            } else {
                aESViewModel = aESViewModel3;
            }
            aESViewModel.onSignGenerateCertificateIsChecked(z2);
            return;
        }
        if (Intrinsics.areEqual(compoundButton, cVar.f7160e)) {
            int i7 = f10834g;
            int i8 = i7 + 15;
            f10833f = i8 % 128;
            int i9 = i8 % 2;
            AESViewModel aESViewModel4 = aESActivity.f10840i;
            if (aESViewModel4 == null) {
                int i10 = i7 + 45;
                f10833f = i10 % 128;
                if (i10 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i11 = 23 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
            } else {
                aESViewModel = aESViewModel4;
            }
            aESViewModel.onSignLegalBindingIsChecked(z2);
        }
    }

    private static final void d(AESActivity aESActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f10833f + 7;
        f10834g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(aESActivity, "");
        EventUtils.sendScreenClosed(aESActivity.getRepo(), aESActivity.getScreenName(), aESActivity.getModule());
        AESViewModel aESViewModel = aESActivity.f10840i;
        if (aESViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            aESViewModel = null;
        }
        aESViewModel.onContinueButtonClicked();
        int i5 = f10834g + 121;
        f10833f = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void b(AESActivity aESActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f10833f + 89;
        f10834g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(aESActivity, "");
        AESViewModel aESViewModel = aESActivity.f10840i;
        if (aESViewModel == null) {
            int i5 = f10834g + 37;
            f10833f = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = f10833f + 71;
            f10834g = i7 % 128;
            int i8 = i7 % 2;
            aESViewModel = null;
        }
        aESViewModel.onContinueAndFinishButtonClicked();
    }

    private final void c() {
        int i2 = 2 % 2;
        DocumentsAdapter documentsAdapter = null;
        this.f10841j = new DocumentsAdapter(0, new e(), 1, null);
        final com.incode.welcome_sdk.d.c cVar = this.f10837b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            cVar = null;
        }
        cVar.f7165j.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = cVar.f7165j;
        DocumentsAdapter documentsAdapter2 = this.f10841j;
        if (documentsAdapter2 == null) {
            int i3 = f10834g + 97;
            f10833f = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f10834g + 23;
            f10833f = i5 % 128;
            int i6 = i5 % 2;
        } else {
            documentsAdapter = documentsAdapter2;
        }
        recyclerView.setAdapter(documentsAdapter);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: com.incode.welcome_sdk.ui.aes.AESActivity$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                AESActivity.d(cVar, this, compoundButton, z2);
            }
        };
        cVar.f7158c.setOnCheckedChangeListener(onCheckedChangeListener);
        cVar.f7157b.setOnCheckedChangeListener(onCheckedChangeListener);
        cVar.f7160e.setOnCheckedChangeListener(onCheckedChangeListener);
        cVar.f7156a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.aes.AESActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AESActivity.m8224instrumented$1$c$V(this.f$0, view);
            }
        });
        cVar.f7159d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.aes.AESActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AESActivity.m8226instrumented$2$c$V(this.f$0, view);
            }
        });
    }

    private static final void a(AESActivity aESActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f10833f + 63;
        f10834g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(aESActivity, "");
        AESViewModel aESViewModel = aESActivity.f10840i;
        if (aESViewModel == null) {
            int i5 = f10834g + 9;
            f10833f = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            aESViewModel = null;
        }
        aESViewModel.onRemovePDFClicked();
    }

    private static final void e(AESActivity aESActivity, View view) throws Exception {
        int i2 = 2 % 2;
        int i3 = f10834g + 11;
        f10833f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(aESActivity, "");
        Object[] objArr = {aESActivity};
        int iC = FormsYesNoScreenKt.h.c();
        int iC2 = FormsYesNoScreenKt.h.c();
        b(objArr, FormsYesNoScreenKt.h.c(), FormsYesNoScreenKt.h.c(), -155028886, 155028886, iC, iC2);
        int i5 = f10833f + 107;
        f10834g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        AESActivity aESActivity = (AESActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = f10833f + 105;
        f10834g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(aESActivity, "");
        AESViewModel aESViewModel = aESActivity.f10840i;
        if (aESViewModel == null) {
            int i5 = f10833f + 7;
            f10834g = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = f10834g + 19;
            f10833f = i6 % 128;
            int i7 = i6 % 2;
            aESViewModel = null;
        }
        aESViewModel.onAESUploadContinueBtnClicked();
        return null;
    }

    private final void a(com.incode.welcome_sdk.d.c cVar) {
        int i2 = 2 % 2;
        int i3 = f10834g + 9;
        f10833f = i3 % 128;
        int i4 = i3 % 2;
        IncodeTextView incodeTextView = cVar.f7170o.f6890e;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        k.c(incodeTextView, R.string.onboard_sdk_aes_upload_screen_add_document_label);
        IncodeTextView incodeTextView2 = cVar.f7170o.f6895j;
        Intrinsics.checkNotNullExpressionValue(incodeTextView2, "");
        k.c(incodeTextView2, R.string.onboard_sdk_aes_upload_screen_remove_label);
        cVar.f7170o.f6895j.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.aes.AESActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AESActivity.m8222instrumented$0$a$Lcomincodewelcome_sdkdcV(this.f$0, view);
            }
        });
        cVar.f7170o.f6890e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.aes.AESActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AESActivity.m8223instrumented$1$a$Lcomincodewelcome_sdkdcV(this.f$0, view);
            }
        });
        cVar.f7170o.f6887b.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.aes.AESActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AESActivity.m8225instrumented$2$a$Lcomincodewelcome_sdkdcV(this.f$0, view);
            }
        });
        int i5 = f10834g + 47;
        f10833f = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10857d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10858e = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10860c;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.aes.AESActivity$d$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f10861d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f10862e = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ AESActivity f10863a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f10864b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = f10861d + 121;
                f10862e = i3 % 128;
                int i4 = i3 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.f10864b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AESViewModel aESViewModelAccess$getViewModel$p = AESActivity.access$getViewModel$p(this.f10863a);
                    if (aESViewModelAccess$getViewModel$p == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        aESViewModelAccess$getViewModel$p = null;
                    }
                    StateFlow<AESUiState> uiState = aESViewModelAccess$getViewModel$p.getUiState();
                    final AESActivity aESActivity = this.f10863a;
                    this.f10864b = 1;
                    if (uiState.collect(new FlowCollector() { // from class: com.incode.welcome_sdk.ui.aes.AESActivity.d.3.3

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static int f10865d = 0;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static int f10866e = 1;

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final /* synthetic */ Object emit(Object obj2, Continuation continuation) throws IOException {
                            int i6 = 2 % 2;
                            int i7 = f10866e + 35;
                            f10865d = i7 % 128;
                            int i8 = i7 % 2;
                            Object objE = e((AESUiState) obj2);
                            int i9 = f10866e + 27;
                            f10865d = i9 % 128;
                            if (i9 % 2 == 0) {
                                return objE;
                            }
                            throw null;
                        }

                        private Object e(AESUiState aESUiState) throws IOException {
                            int i6 = 2 % 2;
                            AESActivity.access$updateViewState(aESActivity, aESUiState.getAesScreenState());
                            DocumentsAdapter documentsAdapterAccess$getRvAdapter$p = AESActivity.access$getRvAdapter$p(aESActivity);
                            if (documentsAdapterAccess$getRvAdapter$p == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                documentsAdapterAccess$getRvAdapter$p = null;
                            }
                            documentsAdapterAccess$getRvAdapter$p.updatedNumberOfDocs(aESUiState.getPdfDocuments().size());
                            com.incode.welcome_sdk.d.c cVarAccess$getBinding$p = AESActivity.access$getBinding$p(aESActivity);
                            if (cVarAccess$getBinding$p == null) {
                                int i7 = f10866e + 95;
                                f10865d = i7 % 128;
                                int i8 = i7 % 2;
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                cVarAccess$getBinding$p = null;
                            }
                            cVarAccess$getBinding$p.f7156a.setEnabled(aESUiState.isContinueButtonEnabled());
                            com.incode.welcome_sdk.d.c cVarAccess$getBinding$p2 = AESActivity.access$getBinding$p(aESActivity);
                            if (cVarAccess$getBinding$p2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                cVarAccess$getBinding$p2 = null;
                            }
                            cVarAccess$getBinding$p2.f7170o.f6887b.setEnabled(aESUiState.isAesUploadContinueBtnEnabled());
                            Unit unit = Unit.INSTANCE;
                            int i9 = f10865d + 33;
                            f10866e = i9 % 128;
                            if (i9 % 2 != 0) {
                                return unit;
                            }
                            throw null;
                        }
                    }, this) == coroutine_suspended) {
                        int i6 = f10861d + 113;
                        f10862e = i6 % 128;
                        if (i6 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f10861d + 75;
                f10862e = i3 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i3 % 2 == 0) {
                    return d(coroutineScope2, continuation2);
                }
                d(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f10862e + 41;
                f10861d = i3 % 128;
                int i4 = i3 % 2;
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    return anonymousClass3.invokeSuspend(unit);
                }
                anonymousClass3.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f10863a, continuation);
                int i3 = f10862e + 99;
                f10861d = i3 % 128;
                int i4 = i3 % 2;
                return anonymousClass3;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AESActivity aESActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.f10863a = aESActivity;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10858e + 35;
            f10857d = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f10860c;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f10860c = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(AESActivity.this, Lifecycle.State.STARTED, new AnonymousClass3(AESActivity.this, null), this) == coroutine_suspended) {
                    int i6 = f10857d + 93;
                    f10858e = i6 % 128;
                    int i7 = i6 % 2;
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
            int i3 = f10858e + 87;
            f10857d = i3 % 128;
            int i4 = i3 % 2;
            Object objB = b(coroutineScope, continuation);
            int i5 = f10858e + 111;
            f10857d = i5 % 128;
            int i6 = i5 % 2;
            return objB;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10858e + 23;
            f10857d = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f10857d + 29;
            f10858e = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            d dVar = AESActivity.this.new d(continuation);
            int i3 = f10858e + 79;
            f10857d = i3 % 128;
            int i4 = i3 % 2;
            return dVar;
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }
    }

    private final void b() {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(null), 3, null);
        int i3 = f10834g + 77;
        f10833f = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10844b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10845e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f10845e + 89;
            f10844b = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void c() {
            int i2 = 2 % 2;
            int i3 = f10845e + 27;
            f10844b = i3 % 128;
            int i4 = i3 % 2;
            AESViewModel aESViewModelAccess$getViewModel$p = AESActivity.access$getViewModel$p(AESActivity.this);
            if (aESViewModelAccess$getViewModel$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = f10845e + 37;
                f10844b = i5 % 128;
                int i6 = i5 % 2;
                aESViewModelAccess$getViewModel$p = null;
            }
            aESViewModelAccess$getViewModel$p.retryLastNetworkCall();
        }

        a() {
            super(0);
        }
    }

    private final void d(AESScreenState aESScreenState) throws IOException {
        boolean zAreEqual;
        int i2 = 2 % 2;
        int i3 = f10834g + 41;
        f10833f = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.d.c cVar = this.f10837b;
        AESViewModel aESViewModel = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            cVar = null;
        }
        ConstraintLayout constraintLayout = cVar.f7162g;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ViewExtensionsKt.visible$default(constraintLayout, false, 0, 2, null);
        if (Intrinsics.areEqual(aESScreenState, AESScreenState.GeneratingUploadLink.f10886a) ? true : Intrinsics.areEqual(aESScreenState, AESScreenState.UploadingDocument.f10916a)) {
            int i5 = f10834g + 89;
            f10833f = i5 % 128;
            int i6 = i5 % 2;
            zAreEqual = true;
        } else {
            zAreEqual = Intrinsics.areEqual(aESScreenState, AESScreenState.UploadingSuccess.f10923b);
        }
        if ((zAreEqual ? true : Intrinsics.areEqual(aESScreenState, AESScreenState.FetchingUnsignedDocuments.f10880b) ? Typography.dollar : 'a') != 'a') {
            int i7 = f10834g + 11;
            f10833f = i7 % 128;
            if ((i7 % 2 == 0 ? '&' : ')') != '&') {
                ConstraintLayout constraintLayout2 = cVar.f7170o.f6888c;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                ViewExtensionsKt.visible$default(constraintLayout2, true, 0, 2, null);
                LinearLayout linearLayout = cVar.f7163h;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                ViewExtensionsKt.visible$default(linearLayout, true, 1, 5, null);
                return;
            }
            ConstraintLayout constraintLayout3 = cVar.f7170o.f6888c;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            ViewExtensionsKt.visible$default(constraintLayout3, false, 0, 2, null);
            LinearLayout linearLayout2 = cVar.f7163h;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            ViewExtensionsKt.visible$default(linearLayout2, true, 0, 2, null);
            return;
        }
        if (Intrinsics.areEqual(aESScreenState, AESScreenState.SigningDocument.f10903e)) {
            LinearLayout linearLayout3 = cVar.f7163h;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            ViewExtensionsKt.visible$default(linearLayout3, true, 0, 2, null);
            IncodeTextView incodeTextView = cVar.f7167l;
            Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
            ViewExtensionsKt.visible$default(incodeTextView, true, 0, 2, null);
            return;
        }
        if ((Intrinsics.areEqual(aESScreenState, AESScreenState.UnsignedDocumentsFetched.f10910b) ? '6' : 'D') == '6') {
            int i8 = f10833f + 25;
            f10834g = i8 % 128;
            if (i8 % 2 == 0) {
                LinearLayout linearLayout4 = cVar.f7163h;
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                ViewExtensionsKt.visible$default(linearLayout4, false, 0, 4, null);
                ScrollView scrollView = cVar.f7161f;
                Intrinsics.checkNotNullExpressionValue(scrollView, "");
                ViewExtensionsKt.visible$default(scrollView, true, 1, 5, null);
                return;
            }
            LinearLayout linearLayout5 = cVar.f7163h;
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
            ViewExtensionsKt.visible$default(linearLayout5, false, 0, 2, null);
            ScrollView scrollView2 = cVar.f7161f;
            Intrinsics.checkNotNullExpressionValue(scrollView2, "");
            ViewExtensionsKt.visible$default(scrollView2, true, 0, 2, null);
            return;
        }
        if (Intrinsics.areEqual(aESScreenState, AESScreenState.SigningSuccess.f10909d)) {
            int i9 = f10833f + 13;
            f10834g = i9 % 128;
            int i10 = i9 % 2;
            LinearLayout linearLayout6 = cVar.f7163h;
            Intrinsics.checkNotNullExpressionValue(linearLayout6, "");
            ViewExtensionsKt.visible$default(linearLayout6, false, 0, 2, null);
            AESViewModel aESViewModel2 = this.f10840i;
            if (aESViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                aESViewModel2 = null;
            }
            if (aESViewModel2.getUiState().getValue().getDownloadDocument()) {
                setScreenName(ScreenName.AES_SIGNED);
                EventUtils.sendScreenOpened(getRepo(), getScreenName(), getModule());
                e();
                return;
            } else {
                setScreenName(ScreenName.AES_SUCCESS);
                EventUtils.sendScreenOpened(getRepo(), getScreenName(), getModule());
                ConstraintLayout constraintLayout4 = cVar.f7164i;
                Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
                ViewExtensionsKt.visible$default(constraintLayout4, true, 0, 2, null);
                return;
            }
        }
        if ((Intrinsics.areEqual(aESScreenState, AESScreenState.FetchingUnsignedDocumentsFailed.f10884c) ? true : Intrinsics.areEqual(aESScreenState, AESScreenState.SigningFailed.f10906c) ? true : Intrinsics.areEqual(aESScreenState, AESScreenState.FetchingSignedDocumentsFailed.f10878c) ? true : Intrinsics.areEqual(aESScreenState, AESScreenState.GeneratingUploadLinkFailed.f10889b) ? true : Intrinsics.areEqual(aESScreenState, AESScreenState.UploadingFailed.f10921e) ? '5' : '`') != '`') {
            setScreenName(ScreenName.AES_FAILED);
            EventUtils.sendScreenOpened(getRepo(), getScreenName(), getModule());
            LinearLayout linearLayout7 = cVar.f7163h;
            Intrinsics.checkNotNullExpressionValue(linearLayout7, "");
            ViewExtensionsKt.visible$default(linearLayout7, false, 0, 2, null);
            ConstraintLayout constraintLayout5 = cVar.f7162g;
            Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
            ViewExtensionsKt.visible$default(constraintLayout5, true, 0, 2, null);
            return;
        }
        if (aESScreenState instanceof AESScreenState.NoInternetConnection) {
            showNoNetworkMessage(new a());
            return;
        }
        if (Intrinsics.areEqual(aESScreenState, AESScreenState.FetchingSignedDocuments.f10876e)) {
            setScreenName(ScreenName.AES_CONFIRMED_SIGNATURE_DETAILS);
            EventUtils.sendScreenOpened(getRepo(), getScreenName(), getModule());
            LinearLayout linearLayout8 = cVar.f7163h;
            Intrinsics.checkNotNullExpressionValue(linearLayout8, "");
            ViewExtensionsKt.visible$default(linearLayout8, true, 0, 2, null);
            return;
        }
        if (Intrinsics.areEqual(aESScreenState, AESScreenState.SignedDocumentsFetched.f10898b)) {
            LinearLayout linearLayout9 = cVar.f7163h;
            Intrinsics.checkNotNullExpressionValue(linearLayout9, "");
            ViewExtensionsKt.visible$default(linearLayout9, false, 0, 2, null);
            return;
        }
        if (!Intrinsics.areEqual(aESScreenState, AESScreenState.UploadDocument.f10915e)) {
            if ((Intrinsics.areEqual(aESScreenState, AESScreenState.GeneratingUploadLinkSuccess.f10893c) ? '/' : '\b') != '/') {
                if (!(!Intrinsics.areEqual(aESScreenState, AESScreenState.EmptyState.f10871b))) {
                    LinearLayout linearLayout10 = cVar.f7163h;
                    Intrinsics.checkNotNullExpressionValue(linearLayout10, "");
                    ViewExtensionsKt.visible$default(linearLayout10, false, 0, 2, null);
                    ConstraintLayout constraintLayout6 = cVar.f7162g;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout6, "");
                    ViewExtensionsKt.visible$default(constraintLayout6, true, 0, 2, null);
                    ScrollView scrollView3 = cVar.f7161f;
                    Intrinsics.checkNotNullExpressionValue(scrollView3, "");
                    ViewExtensionsKt.visible$default(scrollView3, false, 0, 2, null);
                    ConstraintLayout constraintLayout7 = cVar.f7170o.f6888c;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout7, "");
                    ViewExtensionsKt.visible$default(constraintLayout7, false, 0, 2, null);
                    return;
                }
                return;
            }
            AESViewModel aESViewModel3 = this.f10840i;
            if (aESViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                aESViewModel3 = null;
            }
            if (!(aESViewModel3.getUiState().getValue().getRequestBody() == null)) {
                return;
            }
            int i11 = f10834g + 13;
            f10833f = i11 % 128;
            int i12 = i11 % 2;
            ContentResolver contentResolver = getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "");
            AESViewModel aESViewModel4 = this.f10840i;
            if (aESViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                aESViewModel4 = null;
            }
            RequestBody requestBodyB = com.incode.welcome_sdk.commons.utils.c.b(contentResolver, aESViewModel4.getUiState().getValue().getPdfToUpload());
            if (requestBodyB != null) {
                int i13 = f10834g + 111;
                f10833f = i13 % 128;
                int i14 = i13 % 2;
                AESViewModel aESViewModel5 = this.f10840i;
                if (aESViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    aESViewModel = aESViewModel5;
                }
                aESViewModel.onUploadRequestBodyBuilt(requestBodyB);
                return;
            }
            return;
        }
        ScrollView scrollView4 = cVar.f7161f;
        Intrinsics.checkNotNullExpressionValue(scrollView4, "");
        ViewExtensionsKt.visible$default(scrollView4, false, 0, 2, null);
        am amVar = cVar.f7170o;
        ConstraintLayout constraintLayout8 = amVar.f6888c;
        Intrinsics.checkNotNullExpressionValue(constraintLayout8, "");
        ViewExtensionsKt.visible$default(constraintLayout8, true, 0, 2, null);
        AESViewModel aESViewModel6 = this.f10840i;
        if (aESViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            aESViewModel6 = null;
        }
        if (!aESViewModel6.getUiState().getValue().isAesUploadContinueBtnEnabled()) {
            amVar.f6886a.setText(getString(R.string.onboard_sdk_aes_upload_screen_empty_label));
            amVar.f6886a.setAlpha(0.5f);
            ImageView imageView = amVar.f6889d;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            ViewExtensionsKt.visible$default(imageView, false, 0, 2, null);
            IncodeTextView incodeTextView2 = amVar.f6890e;
            Intrinsics.checkNotNullExpressionValue(incodeTextView2, "");
            ViewExtensionsKt.visible$default(incodeTextView2, true, 0, 2, null);
            IncodeTextView incodeTextView3 = amVar.f6895j;
            Intrinsics.checkNotNullExpressionValue(incodeTextView3, "");
            ViewExtensionsKt.visible$default(incodeTextView3, false, 0, 2, null);
            return;
        }
        int i15 = f10833f + 47;
        f10834g = i15 % 128;
        int i16 = i15 % 2;
        IncodeTextView incodeTextView4 = amVar.f6886a;
        ContentResolver contentResolver2 = getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver2, "");
        AESViewModel aESViewModel7 = this.f10840i;
        if (aESViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            aESViewModel7 = null;
        }
        incodeTextView4.setText(com.incode.welcome_sdk.commons.utils.c.d(contentResolver2, aESViewModel7.getUiState().getValue().getPdfToUpload()));
        amVar.f6886a.setAlpha(1.0f);
        ImageView imageView2 = amVar.f6889d;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        ViewExtensionsKt.visible$default(imageView2, true, 0, 2, null);
        IncodeTextView incodeTextView5 = amVar.f6890e;
        Intrinsics.checkNotNullExpressionValue(incodeTextView5, "");
        ViewExtensionsKt.visible$default(incodeTextView5, false, 0, 2, null);
        IncodeTextView incodeTextView6 = amVar.f6895j;
        Intrinsics.checkNotNullExpressionValue(incodeTextView6, "");
        ViewExtensionsKt.visible$default(incodeTextView6, true, 0, 2, null);
    }

    private final void e() {
        int i2 = 2 % 2;
        int i3 = f10833f + 89;
        f10834g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        com.incode.welcome_sdk.d.c cVar = this.f10837b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            cVar = null;
        }
        Button button = cVar.f7159d;
        Intrinsics.checkNotNullExpressionValue(button, "");
        ViewExtensionsKt.visible$default(button, true, 0, 2, null);
        Button button2 = cVar.f7156a;
        Intrinsics.checkNotNullExpressionValue(button2, "");
        ViewExtensionsKt.visible$default(button2, false, 0, 2, null);
        cVar.f7169n.setText(getString(R.string.onboard_sdk_aes_confirmed_signature_title));
        cVar.f7166k.setText(getString(R.string.onboard_sdk_aes_confirmed_signature_documents_list_title));
        cVar.f7158c.setAlpha(0.5f);
        cVar.f7157b.setAlpha(0.5f);
        cVar.f7160e.setAlpha(0.5f);
        int i4 = f10833f + 123;
        f10834g = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void openPDFDocument(String str) throws Exception {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(str), "application/pdf");
        intent.setFlags(1);
        if (intent.resolveActivity(getPackageManager()) == null) {
            Toast.makeText(this, R.string.onboard_sdk_aes_open_pdf_error, 1).show();
            return;
        }
        int i3 = f10834g + 111;
        f10833f = i3 % 128;
        int i4 = i3 % 2;
        CX.ud();
        startActivity(intent);
        int i5 = f10834g + 93;
        f10833f = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f10832d = new Companion(defaultConstructorMarker);
        int i2 = f10836m + 101;
        f10835h = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @JvmStatic
    public static final void start(Context context, boolean z2, boolean z3) {
        int i2 = 2 % 2;
        int i3 = f10833f + 35;
        f10834g = i3 % 128;
        int i4 = i3 % 2;
        f10832d.start(context, z2, z3);
        if (i4 == 0) {
            throw null;
        }
    }

    private static final void c(AESActivity aESActivity, View view) throws Exception {
        Object[] objArr = {aESActivity, view};
        int iC = FormsYesNoScreenKt.h.c();
        int iC2 = FormsYesNoScreenKt.h.c();
        b(objArr, FormsYesNoScreenKt.h.c(), FormsYesNoScreenKt.h.c(), -1797627958, 1797627959, iC, iC2);
    }

    private final void a() throws Exception {
        int iC = FormsYesNoScreenKt.h.c();
        int iC2 = FormsYesNoScreenKt.h.c();
        b(new Object[]{this}, FormsYesNoScreenKt.h.c(), FormsYesNoScreenKt.h.c(), -155028886, 155028886, iC, iC2);
    }
}
