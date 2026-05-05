package com.incode.welcome_sdk.ui.approve;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.FaceInfo;
import com.incode.welcome_sdk.data.remote.beans.ak;
import com.incode.welcome_sdk.data.remote.beans.bf;
import com.incode.welcome_sdk.data.remote.beans.w;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.ApproveResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.SelfieScanResult;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter;
import com.incode.welcome_sdk.views.IncodeButton;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
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
public final class ApproveActivity extends BaseActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f11072d = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f11073k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f11074l = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f11075n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f11076o = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.incode.welcome_sdk.d.a f11078c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11080f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f11084j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f11082h = LazyKt.lazy(i.f11120c);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScreenName f11083i = ScreenName.APPROVE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Modules f11081g = Modules.USER_APPROVAL;

    public static /* synthetic */ Object e(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i7 | i3;
        int i9 = ~i3;
        int i10 = ~i2;
        int i11 = ~(i9 | i10);
        int i12 = ~i7;
        int i13 = i11 | (~(i12 | i2));
        int i14 = ~(i10 | i7);
        int i15 = i13 | i14;
        int i16 = (~(i2 | i12 | i3)) | i14;
        int i17 = i7 + i3 + i6 + (1881146393 * i4) + ((-1035018111) * i5);
        int i18 = i17 * i17;
        int i19 = ((i7 * (-1924067824)) - 304087040) + ((-1924067824) * i3) + (i8 * (-674303503)) + ((-674303503) * i15) + (674303503 * i16) + (1696595968 * i6) + (1612709888 * i4) + ((-182452224) * i5) + ((-1611137024) * i18);
        int i20 = (i7 * (-928100048)) + 945860906 + (i3 * (-928100048)) + (i8 * (-189)) + (i15 * (-189)) + (i16 * 189) + (i6 * (-928100237)) + (i4 * (-1331189957)) + (i5 * 1329932787) + (i18 * 1550319616);
        int i21 = i19 + (i20 * i20 * 1690828800);
        if (i21 == 1) {
            return e(objArr);
        }
        if (i21 == 2) {
            return c(objArr);
        }
        if (i21 != 3) {
            return a(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i22 = 2 % 2;
        int i23 = f11076o + 27;
        f11073k = i23 % 128;
        int i24 = i23 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i25 = f11073k + 121;
        f11076o = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$b$--V, reason: not valid java name */
    public static /* synthetic */ void m8233instrumented$0$b$V(ApproveActivity approveActivity, View view) {
        Callback.onClick_enter(view);
        try {
            d(approveActivity, view);
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
            String strKd = Qg.kd("E2w5\u0019", (short) (ZN.Xd() ^ (1732775770 ^ 1732793262)), (short) (ZN.Xd() ^ (660856569 ^ 660835902)));
            String strVd = hg.Vd("\u0007s", (short) (C1633zX.Xd() ^ (383720703 ^ (-383715850))), (short) (C1633zX.Xd() ^ (768257145 ^ (-768250691))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("Q>\u0004A%", (short) (C1633zX.Xd() ^ (729518674 ^ (-729520546))));
                short sXd = (short) (C1607wl.Xd() ^ (1642573742 ^ 1642571378));
                int[] iArr = new int["2 ".length()];
                QB qb = new QB("2 ");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd = C1561oA.Yd("[J\u0012Q7", (short) (C1607wl.Xd() ^ ((1385997821 ^ 1165230359) ^ 401144037)));
                    String strQd = Xg.qd("uk", (short) (C1499aX.Xd() ^ (1250114939 ^ (-1250114315))), (short) (C1499aX.Xd() ^ ((1996967630 ^ 1573849883) ^ (-717750688))));
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
                        Method declaredMethod = Class.forName(Jg.Wd("\u001buOAU", (short) (C1633zX.Xd() ^ (1883045665 ^ (-1883039410))), (short) (C1633zX.Xd() ^ (1801997717 ^ (-1801978716))))).getDeclaredMethod(ZO.xd("Ws", (short) (FB.Xd() ^ (1333675412 ^ 1333661202)), (short) (FB.Xd() ^ ((936237345 ^ 1262890775) ^ 2089521966))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd2 = (short) (C1607wl.Xd() ^ ((519887955 ^ 1450924988) ^ 1216858153));
                                short sXd3 = (short) (C1607wl.Xd() ^ (374655945 ^ 374659486));
                                int[] iArr2 = new int["L_C\u000f\u0013T".length()];
                                QB qb2 = new QB("L_C\u000f\u0013T");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i3 * sXd3))) + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                Object[] objArr2 = {new String(iArr2, 0, i3)};
                                Method method = Class.forName(Ig.wd("uI]\u0010\u0015Y<N`lu\u0012SZP$\u0004\u0012y\u00041lN", (short) (C1499aX.Xd() ^ ((793175875 ^ 733444416) ^ (-82951071))))).getMethod(C1561oA.Qd("/,:\u0018=66&-\u0012#/2$\u001d\u001e", (short) (C1633zX.Xd() ^ (337956149 ^ (-337955703)))), Class.forName(EO.Od("\b8{\u0002WK \u001d=Cj*SPI[", (short) (Od.Xd() ^ (1992784973 ^ (-1992768178))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("jY!`F", (short) (OY.Xd() ^ ((1352827932 ^ 64640364) ^ 1400422697)), (short) (OY.Xd() ^ (1029531367 ^ 1029527953)));
                                    String strOd = C1561oA.od("{o", (short) (FB.Xd() ^ ((491796519 ^ 1692618098) ^ 2041775655)));
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
                    String strKd2 = C1561oA.Kd("6%l,\u0012", (short) (ZN.Xd() ^ ((2084381317 ^ 827285896) ^ 1299329917)));
                    short sXd4 = (short) (C1633zX.Xd() ^ ((1720224437 ^ 962566301) ^ (-1607933821)));
                    short sXd5 = (short) (C1633zX.Xd() ^ (930248763 ^ (-930246973)));
                    int[] iArr3 = new int[";\t".length()];
                    QB qb3 = new QB(";\t");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((i4 * sXd5) ^ sXd4) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    String str2 = new String(iArr3, 0, i4);
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
                        String strXd = C1561oA.Xd("~m5tZ", (short) (FB.Xd() ^ ((1519760531 ^ 259912527) ^ 1441276575)));
                        String strVd2 = Wg.vd("QE", (short) (OY.Xd() ^ ((1809781816 ^ 1781899005) ^ 32147003)));
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
                        int i5 = (1123906908 ^ 484027910) ^ 1579473681;
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

    public static final /* synthetic */ Observable access$getAndSaveFaceTemplate(ApproveActivity approveActivity, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f11073k + 25;
        f11076o = i3 % 128;
        int i4 = i3 % 2;
        Observable<ak> observableC = approveActivity.c(str, str2);
        if (i4 == 0) {
            int i5 = 93 / 0;
        }
        int i6 = f11073k + 13;
        f11076o = i6 % 128;
        if (i6 % 2 != 0) {
            return observableC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IncodeWelcomeRepository access$getRepo(ApproveActivity approveActivity) {
        int i2 = 2 % 2;
        int i3 = f11076o + 107;
        f11073k = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository repo = approveActivity.getRepo();
        int i5 = f11073k + 109;
        f11076o = i5 % 128;
        int i6 = i5 % 2;
        return repo;
    }

    public static final /* synthetic */ void access$onApproveComplete(ApproveActivity approveActivity, boolean z2, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f11076o + 85;
        f11073k = i3 % 128;
        int i4 = i3 % 2;
        approveActivity.d(z2, str, str2);
        int i5 = f11073k + 23;
        f11076o = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$onProcessFaceComplete(ApproveActivity approveActivity, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f11076o + 89;
        f11073k = i3 % 128;
        int i4 = i3 % 2;
        approveActivity.d(z2);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$publishResult(ApproveActivity approveActivity, boolean z2, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f11076o + 59;
        f11073k = i3 % 128;
        int i4 = i3 % 2;
        approveActivity.b(z2, str, str2);
        if (i4 != 0) {
            throw null;
        }
    }

    static final class i extends Lambda implements Function0<CompositeDisposable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11118a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11119b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f11120c = new i();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11121d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11122e = 0;

        private static CompositeDisposable c() {
            int i2 = 2 % 2;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            int i3 = f11122e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f11121d = i3 % 128;
            int i4 = i3 % 2;
            return compositeDisposable;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ CompositeDisposable invoke() {
            int i2 = 2 % 2;
            int i3 = f11121d + 97;
            f11122e = i3 % 128;
            int i4 = i3 % 2;
            CompositeDisposable compositeDisposableC = c();
            int i5 = f11121d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f11122e = i5 % 128;
            int i6 = i5 % 2;
            return compositeDisposableC;
        }

        static {
            int i2 = f11118a + 65;
            f11119b = i2 % 128;
            int i3 = i2 % 2;
        }

        i() {
            super(0);
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        ApproveActivity approveActivity = (ApproveActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = f11073k + 107;
        f11076o = i3 % 128;
        int i4 = i3 % 2;
        CompositeDisposable compositeDisposable = (CompositeDisposable) approveActivity.f11082h.getValue();
        if (i4 == 0) {
            int i5 = 80 / 0;
        }
        return compositeDisposable;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f11076o;
        int i4 = i3 + 3;
        f11073k = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f11083i;
        int i6 = i3 + 103;
        f11073k = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f11076o + 23;
        int i4 = i3 % 128;
        f11073k = i4;
        int i5 = i3 % 2;
        Modules modules = this.f11081g;
        int i6 = i4 + 23;
        f11076o = i6 % 128;
        int i7 = i6 % 2;
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f11076o + 111;
        f11073k = i4 % 128;
        int i5 = i4 % 2;
        super.safeOnCreate(bundle);
        com.incode.welcome_sdk.d.a aVarC = com.incode.welcome_sdk.d.a.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(aVarC, "");
        this.f11078c = aVarC;
        Object obj = null;
        if (aVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            aVarC = null;
        }
        setContentView(aVarC.f6760b);
        this.f11079e = getIntent().getBooleanExtra("extraShowUi", false);
        com.incode.welcome_sdk.d.a aVar = this.f11078c;
        if (aVar == null) {
            int i6 = f11073k + 123;
            f11076o = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            aVar = null;
        }
        ConstraintLayout constraintLayout = aVar.f6760b;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ConstraintLayout constraintLayout2 = constraintLayout;
        if (this.f11079e) {
            int i7 = f11076o + 93;
            int i8 = i7 % 128;
            f11073k = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 31;
            f11076o = i10 % 128;
            int i11 = i10 % 2;
            i2 = 0;
        } else {
            int i12 = f11073k + 21;
            f11076o = i12 % 128;
            int i13 = i12 % 2;
            i2 = 8;
        }
        constraintLayout2.setVisibility(i2);
        this.f11077b = getIntent().getBooleanExtra("extraSilentFaceMatch", false);
        this.f11080f = getIntent().getBooleanExtra("extraForceApproval", false);
        this.f11084j = getIntent().getStringExtra("extraSelfiePath");
        if (this.f11077b) {
            d();
        } else {
            e();
        }
        if (this.f11079e) {
            int i14 = f11073k + 121;
            f11076o = i14 % 128;
            if (i14 % 2 != 0) {
                b();
            } else {
                b();
                obj.hashCode();
                throw null;
            }
        }
    }

    private static final void d(ApproveActivity approveActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f11073k + 39;
        f11076o = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(approveActivity, "");
            approveActivity.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(approveActivity, "");
        approveActivity.a();
        int i4 = f11073k + 123;
        f11076o = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void b() {
        int i2 = 2 % 2;
        int i3 = f11076o + 29;
        f11073k = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f11084j;
        com.incode.welcome_sdk.d.a aVar = null;
        if (str != null) {
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                com.incode.welcome_sdk.d.a aVar2 = this.f11078c;
                if (aVar2 == null) {
                    int i5 = f11073k + 41;
                    f11076o = i5 % 128;
                    if (i5 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        aVar2 = null;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                }
                aVar2.f6762d.setImageBitmap(bitmapDecodeFile);
            } catch (Exception unused) {
                Timber.Forest.w("Couldn't load selfie crop", new Object[0]);
            }
        }
        com.incode.welcome_sdk.d.a aVar3 = this.f11078c;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            aVar = aVar3;
        }
        aVar.f6763e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.approve.ApproveActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApproveActivity.m8233instrumented$0$b$V(this.f$0, view);
            }
        });
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f11076o + 39;
        f11073k = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnDestroy();
        ((CompositeDisposable) e(new Object[]{this}, ValidatingTaxIdPresenter.a.c(), -1955564162, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), 1955564162)).clear();
        int i5 = f11073k + 13;
        f11076o = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
    }

    static final class f extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11107a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11108c = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11108c + 117;
            f11107a = i3 % 128;
            int i4 = i3 % 2;
            e(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11107a + 91;
            f11108c = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(th, "");
            } else {
                Intrinsics.checkNotNullParameter(th, "");
            }
            ApproveActivity.access$onProcessFaceComplete(ApproveActivity.this, false);
            Timber.Forest.e(th);
        }

        f() {
            super(1);
        }
    }

    static final class h extends Lambda implements Function1<bf, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11115a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11116b = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(bf bfVar) {
            int i2 = 2 % 2;
            int i3 = f11115a + 51;
            f11116b = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 26 / 0;
            }
            int i6 = f11116b + 25;
            f11115a = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private void b() {
            int i2 = 2 % 2;
            int i3 = f11116b + 95;
            f11115a = i3 % 128;
            int i4 = i3 % 2;
            ApproveActivity.access$onProcessFaceComplete(ApproveActivity.this, true);
            int i5 = f11116b + 53;
            f11115a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 96 / 0;
            }
        }

        h() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11076o + 125;
        f11073k = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f11076o + 1;
        f11073k = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void d() {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = (CompositeDisposable) e(new Object[]{this}, ValidatingTaxIdPresenter.a.c(), -1955564162, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), 1955564162);
        Observable<bf> observableObserveOn = getRepo().processFace(false).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final h hVar = new h();
        Consumer<? super bf> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.approve.ApproveActivity$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ApproveActivity.b(hVar, obj);
            }
        };
        final f fVar = new f();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.approve.ApproveActivity$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ApproveActivity.d(fVar, obj);
            }
        }));
        int i3 = f11073k + 93;
        f11076o = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 99 / 0;
        }
    }

    private final void d(boolean z2) {
        int i2 = 2 % 2;
        if (!(!z2)) {
            e();
            int i3 = f11076o + 87;
            f11073k = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Object obj = null;
        d(false, (String) null, (String) null);
        int i5 = f11076o + 115;
        f11073k = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class e extends Lambda implements Function1<w, ObservableSource<? extends ak>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11102a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11103b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f11104c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f11105e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ObservableSource<? extends ak> invoke(w wVar) {
            int i2 = 2 % 2;
            int i3 = f11103b + 97;
            f11102a = i3 % 128;
            int i4 = i3 % 2;
            ObservableSource<? extends ak> observableSourceE = e(wVar);
            int i5 = f11103b + 71;
            f11102a = i5 % 128;
            if (i5 % 2 != 0) {
                return observableSourceE;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private ObservableSource<? extends ak> e(w wVar) {
            int i2 = 2 % 2;
            int i3 = f11103b + 63;
            f11102a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(wVar, "");
                return ApproveActivity.access$getAndSaveFaceTemplate(ApproveActivity.this, wVar.a(), wVar.b());
            }
            Intrinsics.checkNotNullParameter(wVar, "");
            ApproveActivity.access$getAndSaveFaceTemplate(ApproveActivity.this, wVar.a(), wVar.b());
            throw null;
        }

        public static int a() {
            int i2 = f11104c;
            int i3 = i2 % 6284337;
            f11104c = i2 + 1;
            if (i3 != 0) {
                return f11105e;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            f11105e = iFreeMemory;
            return iFreeMemory;
        }

        e() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11076o + 13;
        f11073k = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ObservableSource observableSource = (ObservableSource) function1.invoke(obj);
        int i5 = f11076o + 117;
        f11073k = i5 % 128;
        int i6 = i5 % 2;
        return observableSource;
    }

    /* synthetic */ class d extends FunctionReferenceImpl implements Function2<w, ak, Pair<? extends w, ? extends ak>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11097a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f11098b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11099c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11100d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11101e = 0;

        private static Pair<w, ak> b(w wVar, ak akVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(wVar, "");
            Intrinsics.checkNotNullParameter(akVar, "");
            Pair<w, ak> pair = new Pair<>(wVar, akVar);
            int i3 = f11099c + 55;
            f11097a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 47 / 0;
            }
            return pair;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Pair<? extends w, ? extends ak> invoke(w wVar, ak akVar) {
            int i2 = 2 % 2;
            int i3 = f11097a + 109;
            f11099c = i3 % 128;
            int i4 = i3 % 2;
            Pair<w, ak> pairB = b(wVar, akVar);
            if (i4 != 0) {
                int i5 = 38 / 0;
            }
            int i6 = f11097a + 39;
            f11099c = i6 % 128;
            if (i6 % 2 == 0) {
                return pairB;
            }
            throw null;
        }

        static {
            int i2 = f11100d + 17;
            f11101e = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        d() {
            super(2, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair b(Function2 function2, Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = f11073k + 123;
        f11076o = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Pair pair = (Pair) function2.invoke(obj, obj2);
        int i5 = f11076o + 81;
        f11073k = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    static final class a extends Lambda implements Function1<Pair<? extends w, ? extends ak>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11087a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11088d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Pair<? extends w, ? extends ak> pair) {
            int i2 = 2 % 2;
            int i3 = f11088d + 125;
            f11087a = i3 % 128;
            int i4 = i3 % 2;
            a(pair);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void a(Pair<? extends w, ak> pair) {
            int i2 = 2 % 2;
            int i3 = f11088d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f11087a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(pair, "");
                w first = pair.getFirst();
                ApproveActivity.access$onApproveComplete(ApproveActivity.this, first.c(), first.a(), first.b());
                int i4 = 72 / 0;
            } else {
                Intrinsics.checkNotNullParameter(pair, "");
                w first2 = pair.getFirst();
                ApproveActivity.access$onApproveComplete(ApproveActivity.this, first2.c(), first2.a(), first2.b());
            }
            int i5 = f11088d + 63;
            f11087a = i5 % 128;
            int i6 = i5 % 2;
        }

        a() {
            super(1);
        }
    }

    static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11090b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11091d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11091d + 103;
            f11090b = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            e(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f11090b + 111;
            f11091d = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        private void e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11091d + 73;
            f11090b = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(th, "");
                Timber.Forest.e(th, "Couldn't approve user", new Object[1]);
            } else {
                Intrinsics.checkNotNullParameter(th, "");
                Timber.Forest.e(th, "Couldn't approve user", new Object[0]);
            }
            ApproveActivity.access$onApproveComplete(ApproveActivity.this, false, null, null);
            int i4 = f11091d + 37;
            f11090b = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        b() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11073k + 59;
        f11076o = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 15 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        }
        int i5 = f11073k + 23;
        f11076o = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11073k + 107;
        f11076o = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f11076o + 107;
        f11073k = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void e() {
        String interviewId;
        int i2 = 2 % 2;
        int i3 = f11073k + 45;
        f11076o = i3 % 128;
        int i4 = i3 % 2;
        CompositeDisposable compositeDisposable = (CompositeDisposable) e(new Object[]{this}, ValidatingTaxIdPresenter.a.c(), -1955564162, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), 1955564162);
        IncodeWelcomeRepository repo = getRepo();
        if (!this.f11080f) {
            interviewId = null;
        } else {
            int i5 = f11073k + 41;
            f11076o = i5 % 128;
            int i6 = i5 % 2;
            interviewId = getRepo().getInterviewId();
            int i7 = f11076o + 33;
            f11073k = i7 % 128;
            int i8 = i7 % 2;
        }
        Observable<w> observableApprove = repo.approve(interviewId);
        final e eVar = new e();
        Function<? super w, ? extends ObservableSource<? extends U>> function = new Function() { // from class: com.incode.welcome_sdk.ui.approve.ApproveActivity$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ApproveActivity.c(eVar, obj);
            }
        };
        final d dVar = d.f11098b;
        Observable observableObserveOn = observableApprove.flatMap(function, new BiFunction() { // from class: com.incode.welcome_sdk.ui.approve.ApproveActivity$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ApproveActivity.b(dVar, obj, obj2);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final a aVar = new a();
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.approve.ApproveActivity$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ApproveActivity.a(aVar, obj);
            }
        };
        final b bVar = new b();
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.approve.ApproveActivity$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ApproveActivity.e(bVar, obj);
            }
        }));
    }

    static final class c extends Lambda implements Function1<ak, ObservableSource<? extends ak>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11093d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11094e = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ String f11096c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ ObservableSource<? extends ak> invoke(ak akVar) {
            int i2 = 2 % 2;
            int i3 = f11094e + 41;
            f11093d = i3 % 128;
            int i4 = i3 % 2;
            ObservableSource<? extends ak> observableSourceA = a(akVar);
            if (i4 != 0) {
                int i5 = 28 / 0;
            }
            int i6 = f11093d + 19;
            f11094e = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 45 / 0;
            }
            return observableSourceA;
        }

        private ObservableSource<? extends ak> a(ak akVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(akVar, "");
            Observable observableAndThen = ApproveActivity.access$getRepo(ApproveActivity.this).addFace(new FaceInfo(0L, akVar.d(), akVar.e(), this.f11096c, 1, null)).andThen(Observable.just(akVar));
            int i3 = f11094e + 9;
            f11093d = i3 % 128;
            int i4 = i3 % 2;
            return observableAndThen;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f11096c = str;
        }
    }

    private final Observable<ak> c(String str, String str2) {
        int i2 = 2 % 2;
        Observable<ak> faceTemplate = getRepo().getFaceTemplate(str2, com.incode.welcome_sdk.data.j.f7674c.a(), com.incode.welcome_sdk.data.c.f7613b.b(), null);
        final c cVar = new c(str);
        Observable observableFlatMap = faceTemplate.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.approve.ApproveActivity$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ApproveActivity.j(cVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "");
        int i3 = f11073k + 109;
        f11076o = i3 % 128;
        if (i3 % 2 != 0) {
            return observableFlatMap;
        }
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        ObservableSource observableSource;
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f11076o + 51;
        f11073k = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            observableSource = (ObservableSource) function1.invoke(obj);
            int i4 = 38 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            observableSource = (ObservableSource) function1.invoke(obj);
        }
        int i5 = f11076o + 121;
        f11073k = i5 % 128;
        int i6 = i5 % 2;
        return observableSource;
    }

    static final class g extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11110a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11111b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ String f11113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ String f11114e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f11110a + 37;
            f11111b = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 81 / 0;
            }
            int i6 = f11111b + 63;
            f11110a = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private void c() {
            int i2 = 2 % 2;
            int i3 = f11110a + 15;
            f11111b = i3 % 128;
            int i4 = i3 % 2;
            ApproveActivity.access$publishResult(ApproveActivity.this, true, this.f11114e, this.f11113d);
            int i5 = f11111b + 15;
            f11110a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2) {
            super(1);
            this.f11114e = str;
            this.f11113d = str2;
        }
    }

    static final class j extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11123b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11124e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11124e + 13;
            f11123b = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f11123b + 97;
            f11124e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 62 / 0;
            }
            return unit;
        }

        private void b() {
            ApproveActivity approveActivity;
            boolean z2;
            int i2 = 2 % 2;
            int i3 = f11124e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f11123b = i3 % 128;
            if (i3 % 2 == 0) {
                approveActivity = ApproveActivity.this;
                z2 = true;
            } else {
                approveActivity = ApproveActivity.this;
                z2 = false;
            }
            ApproveActivity.access$publishResult(approveActivity, z2, null, null);
            int i4 = f11123b + 49;
            f11124e = i4 % 128;
            int i5 = i4 % 2;
        }

        j() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11073k + 57;
        f11076o = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 2 / 0;
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f11076o + 33;
        f11073k = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f11073k + 59;
        f11076o = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void d(boolean z2, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f11076o + 73;
        f11073k = i3 % 128;
        com.incode.welcome_sdk.d.a aVar = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (!this.f11079e) {
            b(z2, str, str2);
            return;
        }
        com.incode.welcome_sdk.d.a aVar2 = this.f11078c;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            aVar2 = null;
        }
        aVar2.f6761c.setVisibility(0);
        com.incode.welcome_sdk.d.a aVar3 = this.f11078c;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            aVar3 = null;
        }
        aVar3.f6759a.setVisibility(0);
        if (z2) {
            int i4 = f11076o + 87;
            f11073k = i4 % 128;
            int i5 = i4 % 2;
            com.incode.welcome_sdk.d.a aVar4 = this.f11078c;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                aVar4 = null;
            }
            aVar4.f6761c.setBackgroundColor(ContextCompat.getColor(this, R.color.onboard_sdk_state_success));
            com.incode.welcome_sdk.d.a aVar5 = this.f11078c;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                aVar5 = null;
            }
            aVar5.f6759a.setImageResource(R.drawable.onboard_sdk_check);
            com.incode.welcome_sdk.d.a aVar6 = this.f11078c;
            if (aVar6 == null) {
                int i6 = f11076o + 23;
                f11073k = i6 % 128;
                if (i6 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i7 = 5 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
            } else {
                aVar = aVar6;
            }
            aVar.f6765j.setText(R.string.onboard_sdk_approve_success);
            int i8 = f11076o + 107;
            f11073k = i8 % 128;
            int i9 = i8 % 2;
        } else {
            com.incode.welcome_sdk.d.a aVar7 = this.f11078c;
            if (aVar7 == null) {
                int i10 = f11076o + 9;
                f11073k = i10 % 128;
                if (i10 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                aVar7 = null;
            }
            aVar7.f6763e.setVisibility(0);
            com.incode.welcome_sdk.d.a aVar8 = this.f11078c;
            if (aVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                aVar8 = null;
            }
            aVar8.f6761c.setBackgroundColor(ContextCompat.getColor(this, R.color.onboard_sdk_BackgroundDark));
            com.incode.welcome_sdk.d.a aVar9 = this.f11078c;
            if (aVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                aVar9 = null;
            }
            aVar9.f6759a.setImageResource(R.drawable.onboard_sdk_denied);
            com.incode.welcome_sdk.d.a aVar10 = this.f11078c;
            if (aVar10 == null) {
                int i11 = f11076o + 117;
                f11073k = i11 % 128;
                int i12 = i11 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                aVar = aVar10;
            }
            aVar.f6765j.setText(R.string.onboard_sdk_approve_fail);
        }
        if (z2) {
            CompositeDisposable compositeDisposable = (CompositeDisposable) e(new Object[]{this}, ValidatingTaxIdPresenter.a.c(), -1955564162, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), 1955564162);
            Observable<Long> observableTimer = Observable.timer(1L, TimeUnit.SECONDS, AndroidSchedulers.mainThread());
            final g gVar = new g(str, str2);
            Consumer<? super Long> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.approve.ApproveActivity$$ExternalSyntheticLambda6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ApproveActivity.f(gVar, obj);
                }
            };
            final j jVar = new j();
            compositeDisposable.add(observableTimer.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.approve.ApproveActivity$$ExternalSyntheticLambda7
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ApproveActivity.g(jVar, obj);
                }
            }));
        }
    }

    private final void a() {
        int i2 = 2 % 2;
        com.incode.welcome_sdk.d.a aVar = this.f11078c;
        if (aVar == null) {
            int i3 = f11076o + 87;
            f11073k = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 33 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            int i5 = f11073k + 69;
            f11076o = i5 % 128;
            int i6 = i5 % 2;
            aVar = null;
        }
        IncodeButton incodeButton = aVar.f6763e;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        b(false, (String) null, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ApproveActivity approveActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = f11076o + 93;
        f11073k = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(approveActivity, "");
        Object obj = null;
        approveActivity.b(false, (String) null, (String) null);
        int i6 = f11073k + 59;
        f11076o = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f11076o + 19;
        f11073k = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.approve.ApproveActivity$$ExternalSyntheticLambda10
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ApproveActivity.b(this.f$0, dialogInterface, i4);
                }
            });
            int i4 = f11073k + 29;
            f11076o = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.approve.ApproveActivity$$ExternalSyntheticLambda10
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i42) {
                ApproveActivity.b(this.f$0, dialogInterface, i42);
            }
        });
        throw null;
    }

    private final void b(boolean z2, String str, String str2) {
        int i2 = 2 % 2;
        IncodeWelcome.Companion.getInstance().getApproveBus().onNext(new ApproveResult(ResultCode.SUCCESS, z2, str, str2));
        finish();
        int i3 = f11073k + 113;
        f11076o = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11085a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11086c = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, boolean z2, boolean z3, boolean z4, SelfieScanResult selfieScanResult) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) ApproveActivity.class);
            intent.putExtra("extraShowUi", z2);
            intent.putExtra("extraSilentFaceMatch", z3);
            intent.putExtra("extraForceApproval", z4);
            if (selfieScanResult != null) {
                int i3 = f11085a + 47;
                f11086c = i3 % 128;
                int i4 = i3 % 2;
                intent.putExtra("extraSelfiePath", selfieScanResult.croppedSelfieImgPath);
            }
            CX.ud();
            context.startActivity(intent);
            int i5 = f11085a + 115;
            f11086c = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f11075n + 41;
        f11074l = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, boolean z2, boolean z3, boolean z4, SelfieScanResult selfieScanResult) {
        int i2 = 2 % 2;
        int i3 = f11073k + 21;
        f11076o = i3 % 128;
        if (i3 % 2 == 0) {
            f11072d.start(context, z2, z3, z4, selfieScanResult);
            int i4 = 96 / 0;
        } else {
            f11072d.start(context, z2, z3, z4, selfieScanResult);
        }
        int i5 = f11073k + 57;
        f11076o = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function1 function1, Object obj) {
        e(new Object[]{function1, obj}, ValidatingTaxIdPresenter.a.c(), 1573695273, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), -1573695271);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource j(Function1 function1, Object obj) {
        return (ObservableSource) e(new Object[]{function1, obj}, ValidatingTaxIdPresenter.a.c(), -2109864663, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), 2109864664);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, Object obj) {
        e(new Object[]{function1, obj}, ValidatingTaxIdPresenter.a.c(), 169759934, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), -169759931);
    }

    private final CompositeDisposable c() {
        return (CompositeDisposable) e(new Object[]{this}, ValidatingTaxIdPresenter.a.c(), -1955564162, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), 1955564162);
    }
}
