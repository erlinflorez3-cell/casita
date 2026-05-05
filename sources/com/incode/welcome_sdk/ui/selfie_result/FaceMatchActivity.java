package com.incode.welcome_sdk.ui.selfie_result;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.ui.AnimatorListenerWrapper;
import com.incode.welcome_sdk.commons.ui.RoundedCornersFixedWidthSquareImage;
import com.incode.welcome_sdk.d.aa;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.FaceMatchResult;
import com.incode.welcome_sdk.results.SelfieScanResult;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.selfie_result.FaceMatchContract;
import com.incode.welcome_sdk.views.IncodeTextView;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
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
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceMatchActivity extends BaseActivity implements FaceMatchContract.View {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f17333e = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f17334g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f17335h = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f17336k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f17337m = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private aa f17343j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScreenName f17339c = ScreenName.FACE_MATCH;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Modules f17340d = Modules.FACE_MATCH;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f17338b = LazyKt.lazy(new d());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f17342i = LazyKt.lazy(new e());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f17341f = LazyKt.lazy(new a());

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd(";(m+\u000f", (short) (FB.Xd() ^ (2051235837 ^ 2051223465)), (short) (FB.Xd() ^ (843502595 ^ 843492746)));
            String strVd = hg.Vd(">+", (short) (C1607wl.Xd() ^ ((557478362 ^ 1489365426) ^ 2046798389)), (short) (C1607wl.Xd() ^ (1659638819 ^ 1659655859)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("\u001f\fQ\u000fr", (short) (C1580rY.Xd() ^ ((2044362476 ^ 1254855917) ^ (-856803322))));
                short sXd = (short) (C1633zX.Xd() ^ ((2004703401 ^ 1168724156) ^ (-852771872)));
                int[] iArr = new int["\u0007t".length()];
                QB qb = new QB("\u0007t");
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
                    String strYd = C1561oA.Yd("eT\u001c[A", (short) (C1580rY.Xd() ^ (429941408 ^ (-429936485))));
                    String strQd = Xg.qd("E;", (short) (C1607wl.Xd() ^ (638546899 ^ 638540060)), (short) (C1607wl.Xd() ^ (1670186690 ^ 1670213412)));
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
                        Method declaredMethod = Class.forName(Jg.Wd("c\u0019t`\\", (short) (C1633zX.Xd() ^ ((580755083 ^ 21521596) ^ (-601204985))), (short) (C1633zX.Xd() ^ (2082643612 ^ (-2082657582))))).getDeclaredMethod(ZO.xd("\\\f", (short) (OY.Xd() ^ ((584752282 ^ 714553839) ^ 139323621)), (short) (OY.Xd() ^ ((787665941 ^ 982812135) ^ 342247727))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("3{\u0010(L\n", (short) (C1580rY.Xd() ^ ((808455378 ^ 2024902352) ^ (-1216474550))), (short) (C1580rY.Xd() ^ (1498869054 ^ (-1498849166))))};
                                Method method = Class.forName(Ig.wd(":\u0017jTQ\u0017:\u0003\u0016qzV\u0019 \u0006\u0019y \u0004Dq7_", (short) (OY.Xd() ^ (1418191599 ^ 1418190569)))).getMethod(C1561oA.Qd("wt\u0003`\u0006~~nuZkwzlef", (short) (C1499aX.Xd() ^ (1582097915 ^ (-1582076960)))), Class.forName(EO.Od("Dr6A\u0017\u001azH\u0018b\nE\u000ez\u0014'", (short) (C1580rY.Xd() ^ ((1173920716 ^ 1346165309) ^ (-365173278))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("@/v6\u001c", (short) (ZN.Xd() ^ ((1408882535 ^ 338783414) ^ 1204329069)), (short) (ZN.Xd() ^ (645350391 ^ 645354458)));
                                    short sXd2 = (short) (OY.Xd() ^ ((1529840423 ^ 1215411090) ^ 324953944));
                                    int[] iArr2 = new int["fZ".length()];
                                    QB qb2 = new QB("fZ");
                                    int i3 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                                        i3++;
                                    }
                                    String str2 = new String(iArr2, 0, i3);
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
                    short sXd3 = (short) (OY.Xd() ^ ((1246117017 ^ 195643308) ^ 1106208280));
                    int[] iArr3 = new int["[J\u0012Q7".length()];
                    QB qb3 = new QB("[J\u0012Q7");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd3 + sXd3) + i4));
                        i4++;
                    }
                    String str3 = new String(iArr3, 0, i4);
                    short sXd4 = (short) (FB.Xd() ^ ((1726371935 ^ 885979129) ^ 1378395893));
                    short sXd5 = (short) (FB.Xd() ^ ((824472011 ^ 456852494) ^ 706687237));
                    int[] iArr4 = new int["A5".length()];
                    QB qb4 = new QB("A5");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(((i5 * sXd5) ^ sXd4) + xuXd4.CK(iKK4));
                        i5++;
                    }
                    String str4 = new String(iArr4, 0, i5);
                    try {
                        Class<?> cls5 = Class.forName(str3);
                        Field field5 = 0 != 0 ? cls5.getField(str4) : cls5.getDeclaredField(str4);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("6%l,\u0012", (short) (C1607wl.Xd() ^ ((1009948900 ^ 2133654237) ^ 1126053582)));
                        String strVd2 = Wg.vd(".$", (short) (ZN.Xd() ^ (1544839231 ^ 1544835814)));
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
                        int i6 = (326609672 ^ 58200940) ^ 269465647;
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

    public static final /* synthetic */ FaceMatch access$getFaceMatch(FaceMatchActivity faceMatchActivity) {
        int i2 = 2 % 2;
        int i3 = f17335h + 105;
        f17334g = i3 % 128;
        if (i3 % 2 != 0) {
            faceMatchActivity.c();
            throw null;
        }
        FaceMatch faceMatchC = faceMatchActivity.c();
        int i4 = f17335h + 13;
        f17334g = i4 % 128;
        int i5 = i4 % 2;
        return faceMatchC;
    }

    public static final /* synthetic */ IncodeWelcomeRepository access$getRepo(FaceMatchActivity faceMatchActivity) {
        int i2 = 2 % 2;
        int i3 = f17335h + 59;
        f17334g = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository repo = faceMatchActivity.getRepo();
        int i5 = f17334g + 65;
        f17335h = i5 % 128;
        int i6 = i5 % 2;
        return repo;
    }

    public static final /* synthetic */ boolean access$isSpoofAttempt(FaceMatchActivity faceMatchActivity) {
        int i2 = 2 % 2;
        int i3 = f17334g + 49;
        f17335h = i3 % 128;
        int i4 = i3 % 2;
        boolean zB = faceMatchActivity.b();
        if (i4 == 0) {
            int i5 = 76 / 0;
        }
        int i6 = f17334g + 11;
        f17335h = i6 % 128;
        if (i6 % 2 != 0) {
            return zB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f17334g + 79;
        f17335h = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f17339c;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f17334g + 103;
        int i4 = i3 % 128;
        f17335h = i4;
        int i5 = i3 % 2;
        Modules modules = this.f17340d;
        int i6 = i4 + 71;
        f17334g = i6 % 128;
        if (i6 % 2 == 0) {
            return modules;
        }
        throw null;
    }

    static final class d extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17349b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17350c = 1;

        private Boolean a() {
            Intent intent;
            boolean z2;
            int i2 = 2 % 2;
            int i3 = f17349b + 49;
            f17350c = i3 % 128;
            if (i3 % 2 == 0) {
                intent = FaceMatchActivity.this.getIntent();
                z2 = false;
            } else {
                intent = FaceMatchActivity.this.getIntent();
                z2 = true;
            }
            Boolean boolValueOf = Boolean.valueOf(intent.getBooleanExtra("extraSpoofAttempt", z2));
            int i4 = f17349b + 35;
            f17350c = i4 % 128;
            int i5 = i4 % 2;
            return boolValueOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            int i2 = 2 % 2;
            int i3 = f17350c + 45;
            f17349b = i3 % 128;
            int i4 = i3 % 2;
            Boolean boolA = a();
            int i5 = f17349b + 67;
            f17350c = i5 % 128;
            int i6 = i5 % 2;
            return boolA;
        }

        d() {
            super(0);
        }
    }

    private final boolean b() {
        int i2 = 2 % 2;
        int i3 = f17334g + 51;
        f17335h = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = ((Boolean) this.f17338b.getValue()).booleanValue();
        int i5 = f17334g + 67;
        f17335h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return zBooleanValue;
    }

    static final class e extends Lambda implements Function0<FaceMatch> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17352b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17353e = 0;

        private FaceMatch e() {
            int i2 = 2 % 2;
            int i3 = f17353e + 103;
            f17352b = i3 % 128;
            int i4 = i3 % 2;
            Parcelable parcelableExtra = FaceMatchActivity.this.getIntent().getParcelableExtra("extraFaceMatch");
            Intrinsics.checkNotNull(parcelableExtra);
            FaceMatch faceMatch = (FaceMatch) parcelableExtra;
            int i5 = f17353e + 1;
            f17352b = i5 % 128;
            if (i5 % 2 != 0) {
                return faceMatch;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ FaceMatch invoke() {
            int i2 = 2 % 2;
            int i3 = f17353e + 117;
            f17352b = i3 % 128;
            if (i3 % 2 == 0) {
                e();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            FaceMatch faceMatchE = e();
            int i4 = f17352b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f17353e = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
            }
            return faceMatchE;
        }

        e() {
            super(0);
        }
    }

    private final FaceMatch c() {
        int i2 = 2 % 2;
        int i3 = f17335h + 69;
        f17334g = i3 % 128;
        int i4 = i3 % 2;
        FaceMatch faceMatch = (FaceMatch) this.f17342i.getValue();
        int i5 = f17335h + 23;
        f17334g = i5 % 128;
        if (i5 % 2 == 0) {
            return faceMatch;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class a extends Lambda implements Function0<FaceMatchPresenter> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17346b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17347c = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ FaceMatchPresenter invoke() {
            int i2 = 2 % 2;
            int i3 = f17346b + 115;
            f17347c = i3 % 128;
            if (i3 % 2 == 0) {
                b();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            FaceMatchPresenter faceMatchPresenterB = b();
            int i4 = f17346b + 31;
            f17347c = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
            return faceMatchPresenterB;
        }

        private FaceMatchPresenter b() {
            int i2 = 2 % 2;
            IncodeWelcome companion = IncodeWelcome.Companion.getInstance();
            FaceMatchActivity faceMatchActivity = FaceMatchActivity.this;
            FaceMatchPresenter faceMatchPresenter = new FaceMatchPresenter(faceMatchActivity, FaceMatchActivity.access$getRepo(faceMatchActivity), FaceMatchActivity.access$isSpoofAttempt(faceMatchActivity), companion.isSubmitOnlyMode(), companion.isTestMode(), companion.getInternalConfig().isAgeAssuranceUXEnabled(), companion.getFaceMatchBus(), FaceMatchActivity.access$getFaceMatch(faceMatchActivity), null, null, null, 1792, null);
            int i3 = f17346b + 1;
            f17347c = i3 % 128;
            int i4 = i3 % 2;
            return faceMatchPresenter;
        }

        a() {
            super(0);
        }
    }

    private final FaceMatchPresenter e() {
        int i2 = 2 % 2;
        int i3 = f17335h + 109;
        f17334g = i3 % 128;
        int i4 = i3 % 2;
        FaceMatchPresenter faceMatchPresenter = (FaceMatchPresenter) this.f17341f.getValue();
        if (i4 == 0) {
            return faceMatchPresenter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final boolean isScreenCloseable() {
        int i2 = 2 % 2;
        int i3 = f17334g + 31;
        f17335h = i3 % 128;
        return i3 % 2 == 0;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f17334g + 111;
        f17335h = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnCreate(bundle);
        aa aaVarB = aa.b(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(aaVarB, "");
        this.f17343j = aaVarB;
        if (aaVarB == null) {
            int i5 = f17335h + 59;
            f17334g = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            aaVarB = null;
        }
        setContentView(aaVarB.d());
        e().startProcessing();
    }

    @Override // com.incode.welcome_sdk.ui.selfie_result.FaceMatchContract.View
    public final void showProgressWithoutAnimation(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17335h + 83;
        f17334g = i3 % 128;
        int i4 = i3 % 2;
        aa aaVar = this.f17343j;
        if (aaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            aaVar = null;
        }
        LinearLayout linearLayout = aaVar.f6779n;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        ConstraintLayout constraintLayout = aaVar.f6772g;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = aaVar.f6787v.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ((ConstraintLayout.LayoutParams) layoutParams).topToBottom = aaVar.f6789x.getId();
        aaVar.f6787v.requestLayout();
        if (z2) {
            IncodeTextView incodeTextView = aaVar.f6777l;
            Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
            incodeTextView.setVisibility(0);
            int i5 = f17335h + 49;
            f17334g = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.ui.selfie_result.FaceMatchContract.View
    public final void updateViews(FaceMatchContract.ViewState viewState) {
        Unit unit;
        Unit unit2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewState, "");
        aa aaVar = this.f17343j;
        Unit unit3 = null;
        if (aaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            aaVar = null;
        }
        ConstraintLayout constraintLayout = aaVar.f6772g;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        Integer headerText = viewState.getLeft().getHeaderText();
        if (headerText != null) {
            int i3 = f17334g + 85;
            f17335h = i3 % 128;
            int i4 = i3 % 2;
            aaVar.f6774i.setText(headerText.intValue());
        }
        Integer headerText2 = viewState.getRight().getHeaderText();
        if (headerText2 != null) {
            aaVar.f6780o.setText(headerText2.intValue());
        } else {
            int i5 = f17334g + 9;
            f17335h = i5 % 128;
            int i6 = i5 % 2;
        }
        if (viewState.getBottom() == null) {
            int i7 = f17335h + 77;
            f17334g = i7 % 128;
            int i8 = i7 % 2;
            LinearLayout linearLayout = aaVar.f6766a;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
        } else {
            Integer headerText3 = viewState.getBottom().getHeaderText();
            if (headerText3 != null) {
                aaVar.f6770e.setText(headerText3.intValue());
            } else {
                int i9 = f17334g + 85;
                f17335h = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(viewState.getLeft().getPhotoPath());
        if (bitmapDecodeFile != null) {
            int i11 = f17335h + 25;
            f17334g = i11 % 128;
            int i12 = i11 % 2;
            aaVar.f6775j.setImageBitmap(bitmapDecodeFile);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            IncodeTextView incodeTextView = aaVar.f6776k;
            Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
            incodeTextView.setVisibility(0);
        }
        Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(viewState.getRight().getPhotoPath());
        if (bitmapDecodeFile2 != null) {
            aaVar.f6785t.setImageBitmap(bitmapDecodeFile2);
            unit2 = Unit.INSTANCE;
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            int i13 = f17335h + 3;
            f17334g = i13 % 128;
            int i14 = i13 % 2;
            IncodeTextView incodeTextView2 = aaVar.f6781p;
            Intrinsics.checkNotNullExpressionValue(incodeTextView2, "");
            incodeTextView2.setVisibility(0);
        }
        FaceMatchContract.State bottom = viewState.getBottom();
        Bitmap bitmapDecodeFile3 = BitmapFactory.decodeFile(bottom != null ? bottom.getPhotoPath() : null);
        if (bitmapDecodeFile3 != null) {
            int i15 = f17334g + 111;
            f17335h = i15 % 128;
            if (i15 % 2 == 0) {
                aaVar.f6769d.setImageBitmap(bitmapDecodeFile3);
                Unit unit4 = Unit.INSTANCE;
                unit3.hashCode();
                throw null;
            }
            aaVar.f6769d.setImageBitmap(bitmapDecodeFile3);
            unit3 = Unit.INSTANCE;
        }
        if (unit3 == null) {
            IncodeTextView incodeTextView3 = aaVar.f6767b;
            Intrinsics.checkNotNullExpressionValue(incodeTextView3, "");
            incodeTextView3.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(FaceMatchActivity faceMatchActivity, final CompletableEmitter completableEmitter) {
        int i2 = 2 % 2;
        int i3 = f17334g + 121;
        f17335h = i3 % 128;
        aa aaVar = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(faceMatchActivity, "");
            Intrinsics.checkNotNullParameter(completableEmitter, "");
            aa aaVar2 = faceMatchActivity.f17343j;
            throw null;
        }
        Intrinsics.checkNotNullParameter(faceMatchActivity, "");
        Intrinsics.checkNotNullParameter(completableEmitter, "");
        aa aaVar3 = faceMatchActivity.f17343j;
        if (aaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f17334g + 125;
            f17335h = i4 % 128;
            int i5 = i4 % 2;
        } else {
            aaVar = aaVar3;
        }
        int right = aaVar.f6778m.getRight();
        float left = ((right - aaVar.f6778m.getLeft()) / 2) + ((aaVar.f6771f.getLeft() - right) / 2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(aaVar.f6771f, "translationX", -left);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(aaVar.f6778m, "translationX", left);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(aaVar.f6766a, "translationY", faceMatchActivity.d());
        AnimatorSet animatorSet = new AnimatorSet();
        IncodeTextView incodeTextView = aaVar.f6774i;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        IncodeTextView incodeTextView2 = aaVar.f6780o;
        Intrinsics.checkNotNullExpressionValue(incodeTextView2, "");
        IncodeTextView incodeTextView3 = aaVar.f6770e;
        Intrinsics.checkNotNullExpressionValue(incodeTextView3, "");
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat, objectAnimatorOfFloat3, e(incodeTextView), e(incodeTextView2), e(incodeTextView3));
        animatorSet.setDuration(1000L);
        animatorSet.addListener(new AnimatorListenerWrapper() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchActivity$startAnimation$1$1$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f17355b = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f17356e = 1;

            @Override // com.incode.welcome_sdk.commons.ui.AnimatorListenerWrapper, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i6 = 2 % 2;
                int i7 = f17356e + 125;
                f17355b = i7 % 128;
                if (i7 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(animator, "");
                    completableEmitter.onComplete();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(animator, "");
                completableEmitter.onComplete();
                int i8 = f17355b + 49;
                f17356e = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        animatorSet.start();
    }

    @Override // com.incode.welcome_sdk.ui.selfie_result.FaceMatchContract.View
    public final Completable startAnimation() {
        int i2 = 2 % 2;
        int i3 = f17334g + 111;
        f17335h = i3 % 128;
        if (i3 % 2 != 0) {
            Completable completableCreate = Completable.create(new CompletableOnSubscribe() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchActivity$$ExternalSyntheticLambda0
                @Override // io.reactivex.CompletableOnSubscribe
                public final void subscribe(CompletableEmitter completableEmitter) {
                    FaceMatchActivity.c(this.f$0, completableEmitter);
                }
            });
            Intrinsics.checkNotNullExpressionValue(completableCreate, "");
            return completableCreate;
        }
        Intrinsics.checkNotNullExpressionValue(Completable.create(new CompletableOnSubscribe() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchActivity$$ExternalSyntheticLambda0
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(CompletableEmitter completableEmitter) {
                FaceMatchActivity.c(this.f$0, completableEmitter);
            }
        }), "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.selfie_result.FaceMatchContract.View
    public final void showLivenessCheckResult(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17334g + 121;
        f17335h = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (z2) {
            b(R.string.onboard_sdk_recognition_result_liveness_success, R.drawable.onboard_sdk_check_white, R.color.onboard_sdk_state_success);
            return;
        }
        b(R.string.onboard_sdk_recognition_result_liveness_failed, R.drawable.onboard_sdk_x_white, R.color.onboard_sdk_state_destructive);
        int i4 = f17334g + 71;
        f17335h = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void b(int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = f17334g;
        int i7 = i6 + 105;
        f17335h = i7 % 128;
        int i8 = i7 % 2;
        aa aaVar = this.f17343j;
        if (aaVar == null) {
            int i9 = i6 + 95;
            f17335h = i9 % 128;
            aaVar = null;
            if (i9 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
        }
        aaVar.f6784s.setText(i2);
        aaVar.f6784s.setCompoundDrawablesRelativeWithIntrinsicBounds(i3, 0, 0, 0);
        aaVar.f6783r.setBackgroundResource(i4);
    }

    @Override // com.incode.welcome_sdk.ui.selfie_result.FaceMatchContract.View
    public final void showResultSubmitOnlyMode(FaceMatchResult faceMatchResult) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(faceMatchResult, "");
        aa aaVar = this.f17343j;
        Object obj = null;
        if (aaVar == null) {
            int i4 = f17335h + 11;
            f17334g = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            aaVar = null;
        }
        LinearLayout linearLayout = aaVar.f6779n;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        ImageView imageView = aaVar.f6789x;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        ImageView imageView2 = aaVar.f6789x;
        if (faceMatchResult.isFaceMatched) {
            i2 = R.drawable.onboard_sdk_check;
        } else {
            i2 = R.drawable.onboard_sdk_denied;
            int i5 = f17335h + 37;
            f17334g = i5 % 128;
            int i6 = i5 % 2;
        }
        imageView2.setImageResource(i2);
        b(faceMatchResult);
        int i7 = f17335h + 79;
        f17334g = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.selfie_result.FaceMatchContract.View
    public final void showResultAnimationMode(FaceMatchResult faceMatchResult) {
        Pair pair;
        IncodeTextView incodeTextView;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(faceMatchResult, "");
        aa aaVar = this.f17343j;
        if (aaVar == null) {
            int i4 = f17334g + 125;
            f17335h = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            aaVar = null;
        }
        IncodeTextView incodeTextView2 = aaVar.f6776k;
        Intrinsics.checkNotNullExpressionValue(incodeTextView2, "");
        incodeTextView2.setVisibility(4);
        IncodeTextView incodeTextView3 = aaVar.f6781p;
        Intrinsics.checkNotNullExpressionValue(incodeTextView3, "");
        incodeTextView3.setVisibility(4);
        IncodeTextView incodeTextView4 = aaVar.f6767b;
        Intrinsics.checkNotNullExpressionValue(incodeTextView4, "");
        incodeTextView4.setVisibility(4);
        LinearLayout linearLayout = aaVar.f6766a;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (linearLayout.getVisibility() == 0) {
            int i6 = f17335h + 77;
            f17334g = i6 % 128;
            int i7 = i6 % 2;
            pair = TuplesKt.to(aaVar.f6769d, aaVar.f6768c);
            int i8 = f17335h + 89;
            f17334g = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 % 3;
            }
        } else {
            pair = TuplesKt.to(aaVar.f6785t, aaVar.f6782q);
        }
        RoundedCornersFixedWidthSquareImage roundedCornersFixedWidthSquareImage = (RoundedCornersFixedWidthSquareImage) pair.component1();
        ImageView imageView = (ImageView) pair.component2();
        if (faceMatchResult.isFaceMatched) {
            roundedCornersFixedWidthSquareImage.setColorFilter(ContextCompat.getColor(getContext(), R.color.onboard_sdk_face_match_success));
            imageView.setImageResource(R.drawable.onboard_sdk_check);
            incodeTextView = aaVar.f6790y;
            i2 = R.string.onboard_sdk_recognition_result_success;
        } else {
            roundedCornersFixedWidthSquareImage.setColorFilter(ContextCompat.getColor(getContext(), R.color.onboard_sdk_face_match_fail));
            imageView.setImageResource(R.drawable.onboard_sdk_denied);
            aaVar.f6789x.setImageResource(R.drawable.onboard_sdk_denied);
            incodeTextView = aaVar.f6790y;
            if (c().f10542e == FaceMatch.MatchType.ID_SELFIE) {
                i2 = R.string.onboard_sdk_recognition_result_fail_id;
            } else {
                i2 = R.string.onboard_sdk_recognition_result_fail_nfc;
                int i10 = f17334g + 63;
                f17335h = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 5 % 3;
                }
            }
        }
        incodeTextView.setText(i2);
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(0);
        b(faceMatchResult);
    }

    private final void b(FaceMatchResult faceMatchResult) {
        int i2 = 2 % 2;
        Object obj = null;
        if (faceMatchResult != null && faceMatchResult.isExistingUser) {
            int i3 = f17334g + 29;
            f17335h = i3 % 128;
            if (i3 % 2 != 0 && !(!c().f10539a)) {
                int i4 = f17334g + 17;
                f17335h = i4 % 128;
                int i5 = i4 % 2;
                aa aaVar = this.f17343j;
                if (aaVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    aaVar = null;
                }
                Group group = aaVar.f6773h;
                Intrinsics.checkNotNullExpressionValue(group, "");
                group.setVisibility(0);
            }
        }
        int i6 = f17334g + 81;
        f17335h = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static ObjectAnimator e(View view) {
        int i2 = 2 % 2;
        int i3 = f17334g + 15;
        f17335h = i3 % 128;
        if (i3 % 2 != 0) {
            return ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        }
        float[] fArr = new float[5];
        fArr[0] = 2.0f;
        fArr[0] = 1.0f;
        return ObjectAnimator.ofFloat(view, "alpha", fArr);
    }

    private final float d() {
        int i2 = 2 % 2;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        aa aaVar = this.f17343j;
        aa aaVar2 = null;
        if (aaVar == null) {
            int i3 = f17335h + 33;
            f17334g = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                aaVar2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f17334g + 75;
            f17335h = i4 % 128;
            int i5 = i4 % 2;
            aaVar = null;
        }
        aaVar.f6775j.getLocationInWindow(iArr);
        aa aaVar3 = this.f17343j;
        if (aaVar3 == null) {
            int i6 = f17335h + 33;
            f17334g = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                aaVar2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            aaVar2 = aaVar3;
        }
        aaVar2.f6769d.getLocationInWindow(iArr2);
        return iArr[1] - iArr2[1];
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void publishUserCancelled() {
        int i2 = 2 % 2;
        int i3 = f17335h + 5;
        f17334g = i3 % 128;
        int i4 = i3 % 2;
        super.publishUserCancelled();
        e().handleUserCancelled();
        int i5 = f17334g + 9;
        f17335h = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f17334g + 95;
        f17335h = i3 % 128;
        int i4 = i3 % 2;
        e().onDestroy();
        super.safeOnDestroy();
        int i5 = f17335h + 103;
        f17334g = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17344c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17345d = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, FaceMatch faceMatch, SelfieScanResult selfieScanResult) {
            boolean zBooleanValue;
            Boolean bool;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(faceMatch, "");
            Intent intent = new Intent(context, (Class<?>) FaceMatchActivity.class);
            intent.putExtra("extraFaceMatch", faceMatch);
            if (selfieScanResult == null || (bool = selfieScanResult.isSpoofAttempt) == null) {
                zBooleanValue = true;
            } else {
                int i3 = f17344c + 17;
                f17345d = i3 % 128;
                if (i3 % 2 != 0) {
                    zBooleanValue = bool.booleanValue();
                    int i4 = 69 / 0;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
            }
            intent.putExtra("extraSpoofAttempt", zBooleanValue);
            CX.ud();
            context.startActivity(intent);
            int i5 = f17344c + 29;
            f17345d = i5 % 128;
            int i6 = i5 % 2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f17337m + 3;
        f17336k = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, FaceMatch faceMatch, SelfieScanResult selfieScanResult) {
        int i2 = 2 % 2;
        int i3 = f17335h + 11;
        f17334g = i3 % 128;
        if (i3 % 2 != 0) {
            f17333e.start(context, faceMatch, selfieScanResult);
            throw null;
        }
        f17333e.start(context, faceMatch, selfieScanResult);
        int i4 = f17334g + 117;
        f17335h = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
