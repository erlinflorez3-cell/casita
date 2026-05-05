package com.incode.welcome_sdk.ui.qes;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
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
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.extensions.k;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.d.am;
import com.incode.welcome_sdk.d.t;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.QESResult;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.qes.QESScreenState;
import com.incode.welcome_sdk.views.IncodeButton;
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
import yg.C1633zX;
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
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class QESActivity extends BaseActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f17024e = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f17025f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f17026h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f17027j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f17028l = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScreenName f17029b = ScreenName.QES_PRESIGN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Modules f17030c = Modules.QE_SIGNATURE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t f17031d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private QESViewModel f17032g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private QESDocumentsAdapter f17033i;

    public static /* synthetic */ Object a(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~i3;
        int i10 = (~(i8 | i5)) | (~(i8 | i9));
        int i11 = ~i5;
        int i12 = (~(i3 | i11 | i2)) | i10;
        int i13 = ~(i9 | i11);
        int i14 = i5 + i2 + i4 + ((-1228711472) * i6) + ((-141981132) * i7);
        int i15 = i14 * i14;
        int i16 = (((-639131287) * i5) - 2072313856) + (1118068377 * i2) + (i12 * (-1268883816)) + ((-1757199664) * i10) + ((-1268883816) * i13) + ((-1908015104) * i4) + ((-287309824) * i6) + ((-1573388288) * i7) + ((-2138374144) * i15);
        int i17 = ((i5 * (-646461497)) - 273503129) + (i2 * (-646460521)) + (i12 * 488) + (i10 * (-976)) + (i13 * 488) + (i4 * (-646461009)) + (i6 * 1623110960) + (i7 * (-2035004020)) + (i15 * 33882112);
        int i18 = i16 + (i17 * i17 * (-1051394048));
        return i18 != 1 ? i18 != 2 ? b(objArr) : c(objArr) : d(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$c$--V, reason: not valid java name */
    public static /* synthetic */ void m8539instrumented$0$c$V(QESActivity qESActivity, View view) {
        Callback.onClick_enter(view);
        try {
            b(qESActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$e$-Ljava-lang-String--V, reason: not valid java name */
    public static /* synthetic */ void m8540instrumented$0$e$LjavalangStringV(QESActivity qESActivity, String str, View view) {
        Callback.onClick_enter(view);
        try {
            e(qESActivity, str, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$b$--V, reason: not valid java name */
    public static /* synthetic */ void m8541instrumented$1$b$V(QESActivity qESActivity, View view) {
        Callback.onClick_enter(view);
        try {
            e(qESActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$c$--V, reason: not valid java name */
    public static /* synthetic */ void m8542instrumented$1$c$V(QESActivity qESActivity, View view) {
        Callback.onClick_enter(view);
        try {
            d(qESActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$e$-Ljava-lang-String--V, reason: not valid java name */
    public static /* synthetic */ void m8543instrumented$1$e$LjavalangStringV(QESActivity qESActivity, View view) {
        Callback.onClick_enter(view);
        try {
            g(qESActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$b$--V, reason: not valid java name */
    public static /* synthetic */ void m8544instrumented$2$b$V(QESActivity qESActivity, View view) {
        Callback.onClick_enter(view);
        try {
            a(qESActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$c$--V, reason: not valid java name */
    public static /* synthetic */ void m8545instrumented$2$c$V(QESActivity qESActivity, View view) {
        Callback.onClick_enter(view);
        try {
            c(qESActivity, view);
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
            String strKd = Qg.kd("cP\u0016S7", (short) (FB.Xd() ^ (2006127163 ^ 2006126691)), (short) (FB.Xd() ^ (409944316 ^ 409929361)));
            String strVd = hg.Vd(" \r", (short) (C1633zX.Xd() ^ (1604872032 ^ (-1604852964))), (short) (C1633zX.Xd() ^ ((1648094882 ^ 2028784983) ^ (-450325320))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd = (short) (ZN.Xd() ^ (1240950726 ^ 1240945444));
                int[] iArr = new int["S@\u0006C'".length()];
                QB qb = new QB("S@\u0006C'");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strYd = C1561oA.yd("hT", (short) (C1633zX.Xd() ^ ((1114289380 ^ 26107389) ^ (-1139076097))));
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("A0w7\u001d", (short) (C1499aX.Xd() ^ ((1920024163 ^ 1830979677) ^ (-525577707))));
                    String strQd = Xg.qd("cY", (short) (Od.Xd() ^ (715317663 ^ (-715292736))), (short) (Od.Xd() ^ (337655915 ^ (-337646053))));
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd2 = (short) (C1580rY.Xd() ^ ((539094284 ^ 336211467) ^ (-875271117)));
                        short sXd3 = (short) (C1580rY.Xd() ^ ((1146808600 ^ 292206340) ^ (-1429230319)));
                        int[] iArr2 = new int["YZ'&\u000e".length()];
                        QB qb2 = new QB("YZ'&\u000e");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                            i3++;
                        }
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(ZO.xd("99", (short) (ZN.Xd() ^ ((1505296392 ^ 319478032) ^ 1253284621)), (short) (ZN.Xd() ^ ((987021805 ^ 886401555) ^ 234999680))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd4 = (short) (ZN.Xd() ^ ((1565919616 ^ 269520029) ^ 1296492803));
                                short sXd5 = (short) (ZN.Xd() ^ (1568348075 ^ 1568356725));
                                int[] iArr3 = new int["M\u001e\u0005Q\n<".length()];
                                QB qb3 = new QB("M\u001e\u0005Q\n<");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i4 * sXd5))) + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                Object[] objArr2 = {new String(iArr3, 0, i4)};
                                Method method = Class.forName(Ig.wd("\u0014go\"v;\u00160>JGo58*\nasKuO\u000ft", (short) (ZN.Xd() ^ ((1617452643 ^ 593800681) ^ 1124900854)))).getMethod(C1561oA.Qd(" \u001d+\t.''\u0017\u001e\u0003\u0014 #\u0015\u000e\u000f", (short) (FB.Xd() ^ (705685358 ^ 705688859))), Class.forName(EO.Od("'e\u000b\u0017.\u001atsK`\u0002\u0007OFU3", (short) (C1499aX.Xd() ^ (98580746 ^ (-98581510))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("I8\u007f?%", (short) (Od.Xd() ^ (1382130951 ^ (-1382125591))), (short) (Od.Xd() ^ ((1658456321 ^ 1826842458) ^ (-238647072))));
                                    String strOd = C1561oA.od("\t|", (short) (FB.Xd() ^ (1767001065 ^ 1767003799)));
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
                    String strKd2 = C1561oA.Kd("K:\u0002A'", (short) (OY.Xd() ^ ((1359581465 ^ 1220376159) ^ 431272196)));
                    short sXd6 = (short) (C1607wl.Xd() ^ (1119622321 ^ 1119624448));
                    short sXd7 = (short) (C1607wl.Xd() ^ (1142597716 ^ 1142615467));
                    int[] iArr4 = new int["O|".length()];
                    QB qb4 = new QB("O|");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(((i5 * sXd7) ^ sXd6) + xuXd4.CK(iKK4));
                        i5++;
                    }
                    String str2 = new String(iArr4, 0, i5);
                    try {
                        Class<?> cls5 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls5.getField(str2) : cls5.getDeclaredField(str2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("XG\u000fN4", (short) (C1499aX.Xd() ^ ((1953511842 ^ 239203089) ^ (-2050067645))));
                        String strVd2 = Wg.vd("\u0010\u0004", (short) (C1607wl.Xd() ^ (1115331388 ^ 1115350756)));
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
                        int i6 = 919284244 ^ 919284319;
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

    public static final /* synthetic */ t access$getBinding$p(QESActivity qESActivity) {
        int i2 = 2 % 2;
        int i3 = f17025f + 59;
        int i4 = i3 % 128;
        f17026h = i4;
        int i5 = i3 % 2;
        Object obj = null;
        t tVar = qESActivity.f17031d;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 67;
        f17025f = i6 % 128;
        if (i6 % 2 != 0) {
            return tVar;
        }
        throw null;
    }

    public static final /* synthetic */ QESDocumentsAdapter access$getRvAdapter$p(QESActivity qESActivity) {
        int i2 = 2 % 2;
        int i3 = f17026h + 49;
        int i4 = i3 % 128;
        f17025f = i4;
        int i5 = i3 % 2;
        QESDocumentsAdapter qESDocumentsAdapter = qESActivity.f17033i;
        int i6 = i4 + 125;
        f17026h = i6 % 128;
        int i7 = i6 % 2;
        return qESDocumentsAdapter;
    }

    public static final /* synthetic */ QESViewModel access$getViewModel$p(QESActivity qESActivity) {
        int i2 = 2 % 2;
        int i3 = f17026h;
        int i4 = i3 + 57;
        f17025f = i4 % 128;
        int i5 = i4 % 2;
        QESViewModel qESViewModel = qESActivity.f17032g;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 81;
        f17025f = i6 % 128;
        int i7 = i6 % 2;
        return qESViewModel;
    }

    public static final /* synthetic */ void access$openPDFDocument(QESActivity qESActivity, String str) {
        int i2 = 2 % 2;
        int i3 = f17026h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17025f = i3 % 128;
        if (i3 % 2 == 0) {
            a(new Object[]{qESActivity, str}, -2143166776, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d(), 2143166777, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d());
            throw null;
        }
        a(new Object[]{qESActivity, str}, -2143166776, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d(), 2143166777, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d());
        int i4 = f17025f + 7;
        f17026h = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
    }

    public static final /* synthetic */ void access$updateViewState(QESActivity qESActivity, QESScreenState qESScreenState) throws IOException {
        int i2 = 2 % 2;
        int i3 = f17025f + 83;
        f17026h = i3 % 128;
        int i4 = i3 % 2;
        qESActivity.a(qESScreenState);
        int i5 = f17026h + 45;
        f17025f = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17034a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17035d = 1;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, boolean z2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) QESActivity.class);
            intent.putExtra("extraDownloadDocument", z2);
            CX.ud();
            context.startActivity(intent);
            int i3 = f17035d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f17034a = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f17026h + 113;
        int i4 = i3 % 128;
        f17025f = i4;
        int i5 = i3 % 2;
        ScreenName screenName = this.f17029b;
        int i6 = i4 + 123;
        f17026h = i6 % 128;
        if (i6 % 2 == 0) {
            return screenName;
        }
        throw null;
    }

    public final void setScreenName(ScreenName screenName) {
        int i2 = 2 % 2;
        int i3 = f17025f + 121;
        f17026h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(screenName, "");
        this.f17029b = screenName;
        int i5 = f17025f + 41;
        f17026h = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f17026h + 121;
        int i4 = i3 % 128;
        f17025f = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        Modules modules = this.f17030c;
        int i5 = i4 + 95;
        f17026h = i5 % 128;
        int i6 = i5 % 2;
        return modules;
    }

    static final class b extends Lambda implements Function1<QESResult, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17039d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17040e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(QESResult qESResult) {
            int i2 = 2 % 2;
            int i3 = f17039d + 7;
            f17040e = i3 % 128;
            int i4 = i3 % 2;
            c(qESResult);
            Unit unit = Unit.INSTANCE;
            int i5 = f17039d + 71;
            f17040e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 90 / 0;
            }
            return unit;
        }

        private void c(QESResult qESResult) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(qESResult, "");
            QESViewModel qESViewModelAccess$getViewModel$p = QESActivity.access$getViewModel$p(QESActivity.this);
            if (qESViewModelAccess$getViewModel$p == null) {
                int i3 = f17039d + 77;
                f17040e = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = f17039d + 99;
                f17040e = i5 % 128;
                int i6 = i5 % 2;
                qESViewModelAccess$getViewModel$p = null;
            }
            qESViewModelAccess$getViewModel$p.publishResult(IncodeWelcome.Companion.getInstance().getQesBus(), qESResult);
        }

        b() {
            super(1);
        }
    }

    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17042c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17043d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f17045e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f17045e;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                QESViewModel qESViewModelAccess$getViewModel$p = QESActivity.access$getViewModel$p(QESActivity.this);
                if (qESViewModelAccess$getViewModel$p == null) {
                    int i4 = f17043d + 23;
                    f17042c = i4 % 128;
                    qESViewModelAccess$getViewModel$p = null;
                    if (i4 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i5 = 37 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                }
                StateFlow<Boolean> moduleResultProcessedState = qESViewModelAccess$getViewModel$p.getModuleResultProcessedState();
                final QESActivity qESActivity = QESActivity.this;
                this.f17045e = 1;
                if (moduleResultProcessedState.collect(new FlowCollector() { // from class: com.incode.welcome_sdk.ui.qes.QESActivity.c.1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f17046b = 0;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f17047c = 1;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        int i6 = 2 % 2;
                        int i7 = f17047c + 13;
                        f17046b = i7 % 128;
                        int i8 = i7 % 2;
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        if (i8 == 0) {
                            return a(zBooleanValue);
                        }
                        a(zBooleanValue);
                        throw null;
                    }

                    private Object a(boolean z2) {
                        int i6 = 2 % 2;
                        int i7 = f17046b + 75;
                        f17047c = i7 % 128;
                        int i8 = i7 % 2;
                        if (z2) {
                            qESActivity.finish();
                        }
                        Unit unit = Unit.INSTANCE;
                        int i9 = f17047c + 31;
                        f17046b = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 29 / 0;
                        }
                        return unit;
                    }
                }, this) == coroutine_suspended) {
                    int i6 = f17042c + 47;
                    int i7 = i6 % 128;
                    f17043d = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 79;
                    f17042c = i9 % 128;
                    int i10 = i9 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17043d + 35;
            f17042c = i3 % 128;
            int i4 = i3 % 2;
            Object objC = c(coroutineScope, continuation);
            int i5 = f17042c + 33;
            f17043d = i5 % 128;
            int i6 = i5 % 2;
            return objC;
        }

        private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17042c + 81;
            f17043d = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f17042c + 69;
            f17043d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 43 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            c cVar = QESActivity.this.new c(continuation);
            int i3 = f17043d + 49;
            f17042c = i3 % 128;
            if (i3 % 2 == 0) {
                return cVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) throws Throwable {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        t tVarA = t.a(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(tVarA, "");
        this.f17031d = tVarA;
        Object obj = null;
        if (tVarA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f17025f + 123;
            f17026h = i3 % 128;
            int i4 = i3 % 2;
            tVarA = null;
        }
        setContentView(tVarA.c());
        boolean booleanExtra = getIntent().getBooleanExtra("extraDownloadDocument", false);
        this.f17032g = QESViewModel.f17145d.get(this);
        b();
        c();
        a();
        QESViewModel qESViewModel = this.f17032g;
        if (qESViewModel == null) {
            int i5 = f17026h + 113;
            f17025f = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = 89 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            qESViewModel = null;
        }
        qESViewModel.onViewCreated(booleanExtra, new b());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(null), 3, null);
        int i7 = f17025f + 111;
        f17026h = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        Uri data;
        int i4 = 2 % 2;
        int i5 = f17025f + 41;
        f17026h = i5 % 128;
        if (i5 % 2 != 0) {
            super.onActivityResult(i2, i3, intent);
            if (i2 != 94) {
                return;
            }
        } else {
            super.onActivityResult(i2, i3, intent);
            if (i2 != 76) {
                return;
            }
        }
        if (i3 == -1) {
            int i6 = f17025f + 41;
            f17026h = i6 % 128;
            int i7 = i6 % 2;
            if (intent == null || (data = intent.getData()) == null) {
                return;
            }
            if (!Intrinsics.areEqual(getContentResolver().getType(data), "application/pdf")) {
                Toast.makeText(this, R.string.onboard_sdk_qes_upload_screen_error_file_type, 0).show();
                int i8 = f17026h + 7;
                f17025f = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            int i10 = f17026h;
            int i11 = i10 + 73;
            f17025f = i11 % 128;
            int i12 = i11 % 2;
            QESViewModel qESViewModel = this.f17032g;
            if (qESViewModel == null) {
                int i13 = i10 + 111;
                f17025f = i13 % 128;
                qESViewModel = null;
                if (i13 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            qESViewModel.onPDFSelected(data);
        }
    }

    static final class a extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17036b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17037c = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Integer num) {
            int i2 = 2 % 2;
            int i3 = f17037c + 89;
            f17036b = i3 % 128;
            int i4 = i3 % 2;
            c(num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f17036b + 39;
            f17037c = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void c(int i2) {
            int i3 = 2 % 2;
            int i4 = f17036b + 1;
            f17037c = i4 % 128;
            int i5 = i4 % 2;
            QESViewModel qESViewModelAccess$getViewModel$p = QESActivity.access$getViewModel$p(QESActivity.this);
            if (qESViewModelAccess$getViewModel$p == null) {
                int i6 = f17037c + 37;
                f17036b = i6 % 128;
                qESViewModelAccess$getViewModel$p = null;
                if (i6 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
            }
            QESActivity.access$openPDFDocument(QESActivity.this, qESViewModelAccess$getViewModel$p.getUiState().getValue().getPdfDocuments().get(i2).getDocument().b());
        }

        a() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(t tVar, QESActivity qESActivity, CompoundButton compoundButton, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(tVar, "");
        Intrinsics.checkNotNullParameter(qESActivity, "");
        QESViewModel qESViewModel = null;
        if (Intrinsics.areEqual(compoundButton, tVar.f7341i)) {
            int i3 = f17026h + 29;
            f17025f = i3 % 128;
            int i4 = i3 % 2;
            QESViewModel qESViewModel2 = qESActivity.f17032g;
            if (qESViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                qESViewModel = qESViewModel2;
            }
            qESViewModel.onTermsAndConditionsIsChecked(z2);
            return;
        }
        if (Intrinsics.areEqual(compoundButton, tVar.f7334b)) {
            int i5 = f17026h + 5;
            f17025f = i5 % 128;
            int i6 = i5 % 2;
            QESViewModel qESViewModel3 = qESActivity.f17032g;
            if (qESViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = f17026h + 89;
                f17025f = i7 % 128;
                int i8 = i7 % 2;
            } else {
                qESViewModel = qESViewModel3;
            }
            qESViewModel.onSignGenerateCertificateIsChecked(z2);
        }
    }

    private static final void e(QESActivity qESActivity, View view) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(qESActivity, "");
        EventUtils.sendScreenClosed(qESActivity.getRepo(), qESActivity.getScreenName(), qESActivity.getModule());
        QESViewModel qESViewModel = qESActivity.f17032g;
        if (qESViewModel == null) {
            int i3 = f17025f + 27;
            f17026h = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f17026h + 49;
            f17025f = i5 % 128;
            int i6 = i5 % 2;
            qESViewModel = null;
        }
        qESViewModel.onContinueButtonClicked();
        int i7 = f17025f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17026h = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static final void a(QESActivity qESActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f17025f + 123;
        f17026h = i3 % 128;
        QESViewModel qESViewModel = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(qESActivity, "");
            QESViewModel qESViewModel2 = qESActivity.f17032g;
            throw null;
        }
        Intrinsics.checkNotNullParameter(qESActivity, "");
        QESViewModel qESViewModel3 = qESActivity.f17032g;
        if (qESViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f17025f + 21;
            f17026h = i4 % 128;
            int i5 = i4 % 2;
        } else {
            qESViewModel = qESViewModel3;
        }
        qESViewModel.onContinueAndFinishButtonClicked();
    }

    private final void b() {
        int i2 = 2 % 2;
        QESDocumentsAdapter qESDocumentsAdapter = null;
        this.f17033i = new QESDocumentsAdapter(0, new a(), 1, null);
        final t tVar = this.f17031d;
        if (tVar == null) {
            int i3 = f17026h + 89;
            f17025f = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                qESDocumentsAdapter.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f17025f + 39;
            f17026h = i4 % 128;
            int i5 = i4 % 2;
            tVar = null;
        }
        QESActivity qESActivity = this;
        tVar.f7339g.setLayoutManager(new LinearLayoutManager(qESActivity));
        RecyclerView recyclerView = tVar.f7339g;
        QESDocumentsAdapter qESDocumentsAdapter2 = this.f17033i;
        if (qESDocumentsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            qESDocumentsAdapter = qESDocumentsAdapter2;
        }
        recyclerView.setAdapter(qESDocumentsAdapter);
        com.incode.welcome_sdk.commons.utils.b bVar = com.incode.welcome_sdk.commons.utils.b.f6439a;
        SpannableString spannableStringC = com.incode.welcome_sdk.commons.utils.b.c(qESActivity, tVar.f7345m.getText().toString());
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: com.incode.welcome_sdk.ui.qes.QESActivity$$ExternalSyntheticLambda5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                QESActivity.a(tVar, this, compoundButton, z2);
            }
        };
        tVar.f7345m.setText(spannableStringC);
        tVar.f7345m.setMovementMethod(LinkMovementMethod.getInstance());
        tVar.f7341i.setOnCheckedChangeListener(onCheckedChangeListener);
        tVar.f7334b.setOnCheckedChangeListener(onCheckedChangeListener);
        tVar.f7333a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.qes.QESActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QESActivity.m8541instrumented$1$b$V(this.f$0, view);
            }
        });
        tVar.f7336d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.qes.QESActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QESActivity.m8544instrumented$2$b$V(this.f$0, view);
            }
        });
    }

    private final void d() throws Exception {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("application/pdf");
        CX.ud();
        startActivityForResult(intent, 76);
        int i3 = f17025f + 45;
        f17026h = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object c(java.lang.Object[] r7) {
        /*
            r6 = 0
            r5 = r7[r6]
            com.incode.welcome_sdk.ui.qes.QESActivity r5 = (com.incode.welcome_sdk.ui.qes.QESActivity) r5
            r0 = 1
            r0 = r7[r0]
            android.view.View r0 = (android.view.View) r0
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.qes.QESActivity.f17026h
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.qes.QESActivity.f17025f = r0
            int r1 = r1 % r4
            r3 = 0
            java.lang.String r2 = ""
            if (r1 != 0) goto L36
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            com.incode.welcome_sdk.ui.qes.QESViewModel r1 = r5.f17032g
            r0 = 83
            int r0 = r0 / r6
            if (r1 != 0) goto L32
        L25:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            int r0 = com.incode.welcome_sdk.ui.qes.QESActivity.f17025f
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.qes.QESActivity.f17026h = r0
            int r1 = r1 % r4
            r1 = r3
        L32:
            r1.onRemovePDFClicked()
            return r3
        L36:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            com.incode.welcome_sdk.ui.qes.QESViewModel r1 = r5.f17032g
            if (r1 != 0) goto L32
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.qes.QESActivity.c(java.lang.Object[]):java.lang.Object");
    }

    private static final void d(QESActivity qESActivity, View view) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17026h + 105;
        f17025f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(qESActivity, "");
        qESActivity.d();
        int i5 = f17025f + 73;
        f17026h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r7) {
        /*
            r0 = 0
            r6 = r7[r0]
            com.incode.welcome_sdk.ui.qes.QESActivity r6 = (com.incode.welcome_sdk.ui.qes.QESActivity) r6
            r0 = 1
            r0 = r7[r0]
            android.view.View r0 = (android.view.View) r0
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.qes.QESActivity.f17026h
            int r1 = r0 + 113
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.qes.QESActivity.f17025f = r0
            int r1 = r1 % r5
            r4 = 0
            r3 = 21
            java.lang.String r2 = ""
            if (r1 != 0) goto L36
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            com.incode.welcome_sdk.ui.qes.QESViewModel r1 = r6.f17032g
            int r0 = r3 / 0
            if (r1 != 0) goto L2a
        L26:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r1 = r4
        L2a:
            r1.onQESUploadContinueBtnClicked()
            int r1 = com.incode.welcome_sdk.ui.qes.QESActivity.f17026h
            int r1 = r1 + r3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.qes.QESActivity.f17025f = r0
            int r1 = r1 % r5
            return r4
        L36:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            com.incode.welcome_sdk.ui.qes.QESViewModel r1 = r6.f17032g
            if (r1 != 0) goto L2a
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.qes.QESActivity.b(java.lang.Object[]):java.lang.Object");
    }

    private final void c() {
        int i2 = 2 % 2;
        int i3 = f17025f + 5;
        f17026h = i3 % 128;
        t tVar = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        t tVar2 = this.f17031d;
        if (tVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f17025f + 73;
            f17026h = i4 % 128;
            int i5 = i4 % 2;
        } else {
            tVar = tVar2;
        }
        IncodeTextView incodeTextView = tVar.f7348p.f6890e;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        k.c(incodeTextView, R.string.onboard_sdk_aes_upload_screen_add_document_label);
        IncodeTextView incodeTextView2 = tVar.f7348p.f6895j;
        Intrinsics.checkNotNullExpressionValue(incodeTextView2, "");
        k.c(incodeTextView2, R.string.onboard_sdk_aes_upload_screen_remove_label);
        tVar.f7348p.f6895j.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.qes.QESActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QESActivity.m8539instrumented$0$c$V(this.f$0, view);
            }
        });
        tVar.f7348p.f6890e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.qes.QESActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QESActivity.m8542instrumented$1$c$V(this.f$0, view);
            }
        });
        tVar.f7348p.f6887b.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.qes.QESActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QESActivity.m8545instrumented$2$c$V(this.f$0, view);
            }
        });
    }

    static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17052b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17053e = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17055c;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.qes.QESActivity$e$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f17056a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f17057c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f17058d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ QESActivity f17059e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = f17057c + 91;
                f17056a = i3 % 128;
                int i4 = i3 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.f17058d;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    QESViewModel qESViewModelAccess$getViewModel$p = QESActivity.access$getViewModel$p(this.f17059e);
                    if (qESViewModelAccess$getViewModel$p == null) {
                        int i6 = f17056a + 55;
                        f17057c = i6 % 128;
                        qESViewModelAccess$getViewModel$p = null;
                        if (i6 % 2 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            qESViewModelAccess$getViewModel$p.hashCode();
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i7 = f17056a + 45;
                        f17057c = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    StateFlow<QESUiState> uiState = qESViewModelAccess$getViewModel$p.getUiState();
                    final QESActivity qESActivity = this.f17059e;
                    this.f17058d = 1;
                    if (uiState.collect(new FlowCollector() { // from class: com.incode.welcome_sdk.ui.qes.QESActivity.e.5.4

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static int f17060b = 1;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static int f17061e = 0;

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final /* synthetic */ Object emit(Object obj2, Continuation continuation) throws IOException {
                            int i9 = 2 % 2;
                            int i10 = f17061e + 89;
                            f17060b = i10 % 128;
                            int i11 = i10 % 2;
                            Object objE = e((QESUiState) obj2);
                            int i12 = f17060b + 105;
                            f17061e = i12 % 128;
                            if (i12 % 2 == 0) {
                                return objE;
                            }
                            throw null;
                        }

                        private Object e(QESUiState qESUiState) throws IOException {
                            int i9 = 2 % 2;
                            QESActivity.access$updateViewState(qESActivity, qESUiState.getQesScreenState());
                            QESDocumentsAdapter qESDocumentsAdapterAccess$getRvAdapter$p = QESActivity.access$getRvAdapter$p(qESActivity);
                            t tVar = null;
                            if (qESDocumentsAdapterAccess$getRvAdapter$p == null) {
                                int i10 = f17060b + 33;
                                f17061e = i10 % 128;
                                int i11 = i10 % 2;
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                qESDocumentsAdapterAccess$getRvAdapter$p = null;
                            }
                            qESDocumentsAdapterAccess$getRvAdapter$p.updateNumberOfDocs(qESUiState.getPdfDocuments().size());
                            t tVarAccess$getBinding$p = QESActivity.access$getBinding$p(qESActivity);
                            if (tVarAccess$getBinding$p == null) {
                                int i12 = f17060b + 13;
                                f17061e = i12 % 128;
                                int i13 = i12 % 2;
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                tVarAccess$getBinding$p = null;
                            }
                            tVarAccess$getBinding$p.f7333a.setEnabled(qESUiState.isContinueButtonEnabled());
                            t tVarAccess$getBinding$p2 = QESActivity.access$getBinding$p(qESActivity);
                            if (tVarAccess$getBinding$p2 == null) {
                                int i14 = f17060b + 11;
                                f17061e = i14 % 128;
                                int i15 = i14 % 2;
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            } else {
                                tVar = tVarAccess$getBinding$p2;
                            }
                            tVar.f7348p.f6887b.setEnabled(qESUiState.isQesUploadContinueBtnEnabled());
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        int i9 = f17056a + 31;
                        f17057c = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 78 / 0;
                        }
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
                int i3 = f17057c + 101;
                f17056a = i3 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i3 % 2 == 0) {
                    return e(coroutineScope2, continuation2);
                }
                e(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f17056a + 115;
                f17057c = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                if (i4 == 0) {
                    int i5 = 0 / 0;
                }
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.f17059e, continuation);
                int i3 = f17057c + 51;
                f17056a = i3 % 128;
                int i4 = i3 % 2;
                return anonymousClass5;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(QESActivity qESActivity, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.f17059e = qESActivity;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f17052b + 47;
            f17053e = i3 % 128;
            if (i3 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f17055c;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f17055c = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(QESActivity.this, Lifecycle.State.STARTED, new AnonymousClass5(QESActivity.this, null), this) == coroutine_suspended) {
                    int i5 = f17053e + 117;
                    f17052b = i5 % 128;
                    int i6 = i5 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17052b + 47;
            f17053e = i3 % 128;
            int i4 = i3 % 2;
            Object objB = b(coroutineScope, continuation);
            int i5 = f17052b + 25;
            f17053e = i5 % 128;
            if (i5 % 2 != 0) {
                return objB;
            }
            throw null;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17053e + 101;
            f17052b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f17053e + 55;
            f17052b = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            e eVar = QESActivity.this.new e(continuation);
            int i3 = f17052b + 69;
            f17053e = i3 % 128;
            if (i3 % 2 != 0) {
                return eVar;
            }
            throw null;
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }
    }

    private final void a() {
        int i2 = 2 % 2;
        Object obj = null;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
        int i3 = f17025f + 81;
        f17026h = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17049c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17050d = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f17050d + 29;
            f17049c = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void b() {
            int i2 = 2 % 2;
            int i3 = f17049c + 77;
            f17050d = i3 % 128;
            QESViewModel qESViewModel = null;
            if (i3 % 2 != 0) {
                QESActivity.access$getViewModel$p(QESActivity.this);
                qESViewModel.hashCode();
                throw null;
            }
            QESViewModel qESViewModelAccess$getViewModel$p = QESActivity.access$getViewModel$p(QESActivity.this);
            if (qESViewModelAccess$getViewModel$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = f17050d + 25;
                f17049c = i4 % 128;
                int i5 = i4 % 2;
            } else {
                qESViewModel = qESViewModelAccess$getViewModel$p;
            }
            qESViewModel.retryLastNetworkCall();
        }

        d() {
            super(0);
        }
    }

    private final void a(QESScreenState qESScreenState) throws IOException {
        boolean zAreEqual;
        boolean zAreEqual2;
        boolean zAreEqual3;
        int i2 = 2 % 2;
        t tVar = this.f17031d;
        QESViewModel qESViewModel = null;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tVar = null;
        }
        ConstraintLayout constraintLayout = tVar.f7338f;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ViewExtensionsKt.visible$default(constraintLayout, false, 0, 2, null);
        if (Intrinsics.areEqual(qESScreenState, QESScreenState.GeneratingUploadLink.f17086a)) {
            int i3 = f17025f + 121;
            f17026h = i3 % 128;
            int i4 = i3 % 2;
            zAreEqual = true;
        } else {
            zAreEqual = Intrinsics.areEqual(qESScreenState, QESScreenState.UploadingDocument.f17118e);
        }
        if (zAreEqual) {
            int i5 = f17026h + 11;
            f17025f = i5 % 128;
            zAreEqual2 = (i5 % 2 == 0 ? (char) 15 : '\b') != 15;
        } else {
            zAreEqual2 = Intrinsics.areEqual(qESScreenState, QESScreenState.UploadingSuccess.f17123c);
        }
        if (zAreEqual2) {
            int i6 = f17025f;
            int i7 = i6 + 51;
            f17026h = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 51;
            f17026h = i9 % 128;
            int i10 = i9 % 2;
            zAreEqual3 = true;
        } else {
            zAreEqual3 = Intrinsics.areEqual(qESScreenState, QESScreenState.FetchingUnsignedDocuments.f17081c);
        }
        if (zAreEqual3) {
            ConstraintLayout constraintLayout2 = tVar.f7348p.f6888c;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            ViewExtensionsKt.visible$default(constraintLayout2, false, 0, 2, null);
            LinearLayout linearLayout = tVar.f7342j;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            ViewExtensionsKt.visible$default(linearLayout, true, 0, 2, null);
            return;
        }
        if (Intrinsics.areEqual(qESScreenState, QESScreenState.SigningDocument.f17101a)) {
            LinearLayout linearLayout2 = tVar.f7342j;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            ViewExtensionsKt.visible$default(linearLayout2, true, 0, 2, null);
            IncodeTextView incodeTextView = tVar.f7349q;
            Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
            ViewExtensionsKt.visible$default(incodeTextView, true, 0, 2, null);
            return;
        }
        if (Intrinsics.areEqual(qESScreenState, QESScreenState.UnsignedDocumentsFetched.f17112e)) {
            LinearLayout linearLayout3 = tVar.f7342j;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            ViewExtensionsKt.visible$default(linearLayout3, false, 0, 2, null);
            ScrollView scrollView = tVar.f7346n;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            ViewExtensionsKt.visible$default(scrollView, true, 0, 2, null);
            return;
        }
        float f2 = 0.5f;
        if (Intrinsics.areEqual(qESScreenState, QESScreenState.SigningSuccess.f17108d)) {
            int i11 = f17025f + 41;
            f17026h = i11 % 128;
            int i12 = i11 % 2;
            LinearLayout linearLayout4 = tVar.f7342j;
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
            ViewExtensionsKt.visible$default(linearLayout4, false, 0, 2, null);
            QESViewModel qESViewModel2 = this.f17032g;
            if (qESViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                qESViewModel2 = null;
            }
            boolean downloadDocument = qESViewModel2.getUiState().getValue().getDownloadDocument();
            ViewGroup.LayoutParams layoutParams = tVar.f7344l.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (downloadDocument) {
                int i13 = f17026h + 107;
                f17025f = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
                f2 = 0.4f;
            }
            layoutParams2.guidePercent = f2;
            tVar.f7344l.setLayoutParams(layoutParams2);
            if (downloadDocument) {
                int i14 = f17026h + 17;
                f17025f = i14 % 128;
                if (i14 % 2 == 0) {
                    setScreenName(ScreenName.QES_SIGNED);
                    EventUtils.sendScreenOpened(getRepo(), getScreenName(), getModule());
                    throw null;
                }
                setScreenName(ScreenName.QES_SIGNED);
                EventUtils.sendScreenOpened(getRepo(), getScreenName(), getModule());
                QESViewModel qESViewModel3 = this.f17032g;
                if (qESViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    qESViewModel = qESViewModel3;
                }
                e(qESViewModel.getUiState().getValue().getDownloadUrl());
                return;
            }
            setScreenName(ScreenName.QES_SUCCESS);
            EventUtils.sendScreenOpened(getRepo(), getScreenName(), getModule());
            ConstraintLayout constraintLayout3 = tVar.f7347o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            ViewExtensionsKt.visible$default(constraintLayout3, true, 0, 2, null);
            IncodeTextView incodeTextView2 = tVar.f7343k;
            Intrinsics.checkNotNullExpressionValue(incodeTextView2, "");
            ViewExtensionsKt.visible$default(incodeTextView2, true, 0, 2, null);
            LinearLayout linearLayout5 = tVar.f7340h;
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
            ViewExtensionsKt.visible$default(linearLayout5, false, 0, 2, null);
            IncodeButton incodeButton = tVar.f7337e;
            Intrinsics.checkNotNullExpressionValue(incodeButton, "");
            ViewExtensionsKt.visible$default(incodeButton, false, 0, 2, null);
            return;
        }
        if (((!Intrinsics.areEqual(qESScreenState, QESScreenState.FetchingUnsignedDocumentsFailed.f17085e) ? Intrinsics.areEqual(qESScreenState, QESScreenState.SigningFailed.f17106d) : true ? ')' : 'K') != 'K' ? true : Intrinsics.areEqual(qESScreenState, QESScreenState.FetchingSignedDocumentsFailed.f17077b) ? true : Intrinsics.areEqual(qESScreenState, QESScreenState.GeneratingUploadLinkFailed.f17091e) ? true : Intrinsics.areEqual(qESScreenState, QESScreenState.UploadingFailed.f17120b) ? '\t' : 'Y') != 'Y') {
            int i15 = f17025f + 49;
            f17026h = i15 % 128;
            int i16 = i15 % 2;
            setScreenName(ScreenName.QES_FAILED);
            EventUtils.sendScreenOpened(getRepo(), getScreenName(), getModule());
            LinearLayout linearLayout6 = tVar.f7342j;
            Intrinsics.checkNotNullExpressionValue(linearLayout6, "");
            ViewExtensionsKt.visible$default(linearLayout6, false, 0, 2, null);
            ConstraintLayout constraintLayout4 = tVar.f7338f;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
            ViewExtensionsKt.visible$default(constraintLayout4, true, 0, 2, null);
            return;
        }
        if (qESScreenState instanceof QESScreenState.NoInternetConnection) {
            showNoNetworkMessage(new d());
            return;
        }
        if (Intrinsics.areEqual(qESScreenState, QESScreenState.FetchingSignedDocuments.f17075c)) {
            int i17 = f17025f + 47;
            f17026h = i17 % 128;
            int i18 = i17 % 2;
            setScreenName(ScreenName.QES_CONFIRMED_SIGNATURE_DETAILS);
            EventUtils.sendScreenOpened(getRepo(), getScreenName(), getModule());
            LinearLayout linearLayout7 = tVar.f7342j;
            Intrinsics.checkNotNullExpressionValue(linearLayout7, "");
            ViewExtensionsKt.visible$default(linearLayout7, true, 0, 2, null);
            return;
        }
        if (Intrinsics.areEqual(qESScreenState, QESScreenState.SignedDocumentsFetched.f17099c)) {
            LinearLayout linearLayout8 = tVar.f7342j;
            Intrinsics.checkNotNullExpressionValue(linearLayout8, "");
            ViewExtensionsKt.visible$default(linearLayout8, false, 0, 2, null);
            return;
        }
        if ((Intrinsics.areEqual(qESScreenState, QESScreenState.UploadDocument.f17113a) ? '4' : (char) 6) != 6) {
            ScrollView scrollView2 = tVar.f7346n;
            Intrinsics.checkNotNullExpressionValue(scrollView2, "");
            ViewExtensionsKt.visible$default(scrollView2, false, 0, 2, null);
            am amVar = tVar.f7348p;
            ConstraintLayout constraintLayout5 = amVar.f6888c;
            Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
            ViewExtensionsKt.visible$default(constraintLayout5, true, 0, 2, null);
            QESViewModel qESViewModel4 = this.f17032g;
            if (qESViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                qESViewModel4 = null;
            }
            if (!qESViewModel4.getUiState().getValue().isQesUploadContinueBtnEnabled()) {
                amVar.f6886a.setText(getString(R.string.onboard_sdk_aes_upload_screen_empty_label));
                amVar.f6886a.setAlpha(0.5f);
                ImageView imageView = amVar.f6889d;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                ViewExtensionsKt.visible$default(imageView, false, 0, 2, null);
                IncodeTextView incodeTextView3 = amVar.f6890e;
                Intrinsics.checkNotNullExpressionValue(incodeTextView3, "");
                ViewExtensionsKt.visible$default(incodeTextView3, true, 0, 2, null);
                IncodeTextView incodeTextView4 = amVar.f6895j;
                Intrinsics.checkNotNullExpressionValue(incodeTextView4, "");
                ViewExtensionsKt.visible$default(incodeTextView4, false, 0, 2, null);
                return;
            }
            IncodeTextView incodeTextView5 = amVar.f6886a;
            ContentResolver contentResolver = getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "");
            QESViewModel qESViewModel5 = this.f17032g;
            if (qESViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                qESViewModel5 = null;
            }
            incodeTextView5.setText(com.incode.welcome_sdk.commons.utils.c.d(contentResolver, qESViewModel5.getUiState().getValue().getPdfToUpload()));
            amVar.f6886a.setAlpha(1.0f);
            ImageView imageView2 = amVar.f6889d;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            ViewExtensionsKt.visible$default(imageView2, true, 0, 2, null);
            IncodeTextView incodeTextView6 = amVar.f6890e;
            Intrinsics.checkNotNullExpressionValue(incodeTextView6, "");
            ViewExtensionsKt.visible$default(incodeTextView6, false, 0, 2, null);
            IncodeTextView incodeTextView7 = amVar.f6895j;
            Intrinsics.checkNotNullExpressionValue(incodeTextView7, "");
            ViewExtensionsKt.visible$default(incodeTextView7, true, 0, 2, null);
            return;
        }
        if (!Intrinsics.areEqual(qESScreenState, QESScreenState.GeneratingUploadLinkSuccess.f17092a)) {
            if (!Intrinsics.areEqual(qESScreenState, QESScreenState.EmptyState.f17072d)) {
                return;
            }
            LinearLayout linearLayout9 = tVar.f7342j;
            Intrinsics.checkNotNullExpressionValue(linearLayout9, "");
            ViewExtensionsKt.visible$default(linearLayout9, false, 0, 2, null);
            ConstraintLayout constraintLayout6 = tVar.f7338f;
            Intrinsics.checkNotNullExpressionValue(constraintLayout6, "");
            ViewExtensionsKt.visible$default(constraintLayout6, true, 0, 2, null);
            ScrollView scrollView3 = tVar.f7346n;
            Intrinsics.checkNotNullExpressionValue(scrollView3, "");
            ViewExtensionsKt.visible$default(scrollView3, false, 0, 2, null);
            ConstraintLayout constraintLayout7 = tVar.f7348p.f6888c;
            Intrinsics.checkNotNullExpressionValue(constraintLayout7, "");
            ViewExtensionsKt.visible$default(constraintLayout7, false, 0, 2, null);
            ConstraintLayout constraintLayout8 = tVar.f7347o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout8, "");
            ViewExtensionsKt.visible$default(constraintLayout8, false, 0, 2, null);
            return;
        }
        QESViewModel qESViewModel6 = this.f17032g;
        if ((qESViewModel6 == null ? 'b' : '4') != '4') {
            Intrinsics.throwUninitializedPropertyAccessException("");
            qESViewModel6 = null;
        }
        if (qESViewModel6.getUiState().getValue().getRequestBody() == null) {
            ContentResolver contentResolver2 = getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver2, "");
            QESViewModel qESViewModel7 = this.f17032g;
            if (qESViewModel7 == null) {
                int i19 = f17025f + 37;
                f17026h = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                qESViewModel7 = null;
            }
            RequestBody requestBodyB = com.incode.welcome_sdk.commons.utils.c.b(contentResolver2, qESViewModel7.getUiState().getValue().getPdfToUpload());
            if (requestBodyB != null) {
                QESViewModel qESViewModel8 = this.f17032g;
                if (qESViewModel8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    qESViewModel = qESViewModel8;
                }
                qESViewModel.onUploadRequestBodyBuilt(requestBodyB);
            }
        }
    }

    private static final void e(QESActivity qESActivity, String str, View view) {
        int i2 = 2 % 2;
        int i3 = f17025f + 105;
        f17026h = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(qESActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            a(new Object[]{qESActivity, str}, -2143166776, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d(), 2143166777, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d());
            throw null;
        }
        Intrinsics.checkNotNullParameter(qESActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        a(new Object[]{qESActivity, str}, -2143166776, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d(), 2143166777, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d());
        int i4 = f17026h + 89;
        f17025f = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void g(QESActivity qESActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f17025f + 33;
        f17026h = i3 % 128;
        QESViewModel qESViewModel = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(qESActivity, "");
            QESViewModel qESViewModel2 = qESActivity.f17032g;
            throw null;
        }
        Intrinsics.checkNotNullParameter(qESActivity, "");
        QESViewModel qESViewModel3 = qESActivity.f17032g;
        if (qESViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f17025f + 5;
            f17026h = i4 % 128;
            int i5 = i4 % 2;
        } else {
            qESViewModel = qESViewModel3;
        }
        qESViewModel.onContinueAndFinishButtonClicked();
    }

    private final void e(final String str) {
        int i2 = 2 % 2;
        int i3 = f17026h + 51;
        f17025f = i3 % 128;
        int i4 = i3 % 2;
        t tVar = this.f17031d;
        Object obj = null;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tVar = null;
        }
        ScrollView scrollView = tVar.f7346n;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        ViewExtensionsKt.visible$default(scrollView, false, 0, 2, null);
        IncodeTextView incodeTextView = tVar.f7343k;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        ViewExtensionsKt.visible$default(incodeTextView, false, 0, 2, null);
        ConstraintLayout constraintLayout = tVar.f7347o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ViewExtensionsKt.visible$default(constraintLayout, true, 0, 2, null);
        LinearLayout linearLayout = tVar.f7340h;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        ViewExtensionsKt.visible$default(linearLayout, true, 0, 2, null);
        tVar.f7335c.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.qes.QESActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QESActivity.m8540instrumented$0$e$LjavalangStringV(this.f$0, str, view);
            }
        });
        IncodeButton incodeButton = tVar.f7337e;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.visible$default(incodeButton, true, 0, 2, null);
        tVar.f7337e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.qes.QESActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QESActivity.m8543instrumented$1$e$LjavalangStringV(this.f$0, view);
            }
        });
        int i5 = f17025f + 109;
        f17026h = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Exception {
        QESActivity qESActivity = (QESActivity) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(str), "application/pdf");
        intent.setFlags(1);
        if (intent.resolveActivity(qESActivity.getPackageManager()) == null) {
            Toast.makeText(qESActivity, R.string.onboard_sdk_qes_open_pdf_error, 1).show();
            return null;
        }
        int i3 = f17025f + 69;
        f17026h = i3 % 128;
        int i4 = i3 % 2;
        CX.ud();
        qESActivity.startActivity(intent);
        int i5 = f17025f + 101;
        f17026h = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static {
        int i2 = f17027j + 111;
        f17028l = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17025f + 37;
        f17026h = i3 % 128;
        int i4 = i3 % 2;
        f17024e.start(context, z2);
        int i5 = f17025f + 29;
        f17026h = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final void c(QESActivity qESActivity, View view) {
        a(new Object[]{qESActivity, view}, -1067495197, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d(), 1067495197, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d());
    }

    private static final void b(QESActivity qESActivity, View view) {
        a(new Object[]{qESActivity, view}, 2140056778, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d(), -2140056776, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d());
    }

    private final void c(String str) {
        a(new Object[]{this, str}, -2143166776, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d(), 2143166777, com.incode.welcome_sdk.commons.utils.t.d(), com.incode.welcome_sdk.commons.utils.t.d());
    }
}
