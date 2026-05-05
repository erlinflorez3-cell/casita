package com.incode.welcome_sdk.ui.government_validation;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.MaxVideoLengthReachedException;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.d.k;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.GovernmentValidationResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.government_validation.GovernmentValidationContract;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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
public final class GovernmentValidationActivity extends BaseActivity implements GovernmentValidationContract.View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f14422f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f14423h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f14424j = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f14425o = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    public GovernmentValidationPresenter f14427c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f14429e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14430g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CompositeDisposable f14428d = new CompositeDisposable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScreenName f14426b = ScreenName.GOVERNMENT_VALIDATION;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Modules f14431i = Modules.GOVT_VALIDATION;

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~((~i4) | i7 | i2);
        int i9 = ~((~i7) | i4);
        int i10 = ~i2;
        int i11 = i9 | (~(i10 | i4));
        int i12 = ~(i10 | i7);
        int i13 = i4 + i7 + i3 + ((-1568348280) * i6) + (1617068012 * i5);
        int i14 = i13 * i13;
        int i15 = (((-430874860) * i4) - 739508224) + (1544986862 * i7) + (i8 * 987930861) + ((-987930861) * i11) + (987930861 * i12) + (557056000 * i3) + ((-1885339648) * i6) + (1743781888 * i5) + (858456064 * i14);
        int i16 = (i4 * (-973781596)) + 539565670 + (i7 * (-973779706)) + (i8 * 945) + (i11 * (-945)) + (i12 * 945) + (i3 * (-973780651)) + (i6 * 424585256) + (i5 * 537576796) + (i14 * 1078394880);
        return i15 + ((i16 * i16) * 192741376) != 1 ? a(objArr) : e(objArr);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("\u0012~D\u0002e", (short) (C1607wl.Xd() ^ ((1570393984 ^ 2096029236) ^ 561298773)), (short) (C1607wl.Xd() ^ (123739142 ^ 123732837)));
            String strVd = hg.Vd("{h", (short) (C1580rY.Xd() ^ (286745066 ^ (-286724509))), (short) (C1580rY.Xd() ^ ((1978933326 ^ 246442682) ^ (-2068082576))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd = (short) (C1607wl.Xd() ^ (947160029 ^ 947176275));
                int[] iArr = new int["}j0mQ".length()];
                QB qb = new QB("}j0mQ");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strYd = C1561oA.yd(",\u001a", (short) (C1607wl.Xd() ^ (1372299778 ^ 1372305916)));
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("UD\fK1", (short) (C1633zX.Xd() ^ (833015890 ^ (-833004066))));
                    String strQd = Xg.qd("H>", (short) (ZN.Xd() ^ ((517747717 ^ 679622188) ^ 912152486)), (short) (ZN.Xd() ^ ((247662755 ^ 886661299) ^ 974784443)));
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
                        Method declaredMethod = Class.forName(Jg.Wd("L\u0010\u0011V\u0013", (short) (OY.Xd() ^ (641415843 ^ 641415947)), (short) (OY.Xd() ^ ((1194909136 ^ 368528427) ^ 1389358334)))).getDeclaredMethod(ZO.xd("D)", (short) (C1633zX.Xd() ^ (656734505 ^ (-656731541))), (short) (C1633zX.Xd() ^ ((1729345952 ^ 1895770531) ^ (-401394463)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("g\u0019\u000fg\r=", (short) (OY.Xd() ^ (2040951879 ^ 2040929386)), (short) (OY.Xd() ^ (1813547133 ^ 1813576343)))};
                                Method method = Class.forName(Ig.wd("\u0007Dj\u001f\nF+;A_b\u0005JC_5-a\u0007r$aA", (short) (C1633zX.Xd() ^ ((1974056389 ^ 1265101344) ^ (-1053716930))))).getMethod(C1561oA.Qd("b_mKpiiY`EVbeWPQ", (short) (C1580rY.Xd() ^ ((1555333028 ^ 1771213648) ^ (-891733960)))), Class.forName(EO.Od("%C\t\u00190<\u0013q*\"C\u0005.%4P", (short) (C1580rY.Xd() ^ ((1199068950 ^ 1765467776) ^ (-776127261))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd2 = (short) (C1580rY.Xd() ^ ((524380586 ^ 956733719) ^ (-642227807)));
                                    short sXd3 = (short) (C1580rY.Xd() ^ (1288455157 ^ (-1288463313)));
                                    int[] iArr2 = new int["\u0013\u0002I\tn".length()];
                                    QB qb2 = new QB("\u0013\u0002I\tn");
                                    int i3 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                                        i3++;
                                    }
                                    String str2 = new String(iArr2, 0, i3);
                                    String strOd = C1561oA.od("'\u001b", (short) (C1580rY.Xd() ^ (1938927026 ^ (-1938926548))));
                                    try {
                                        Class<?> cls4 = Class.forName(str2);
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
                    String strKd2 = C1561oA.Kd("D3z: ", (short) (FB.Xd() ^ ((1271761719 ^ 683902590) ^ 1661887198)));
                    String strZd = Wg.Zd("X\u0005", (short) (ZN.Xd() ^ ((860168433 ^ 2085591212) ^ 1326112242)), (short) (ZN.Xd() ^ (2036536610 ^ 2036538245)));
                    try {
                        Class<?> cls5 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls5.getField(strZd) : cls5.getDeclaredField(strZd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("n]%dJ", (short) (FB.Xd() ^ (1879271252 ^ 1879251253)));
                        String strVd2 = Wg.vd("C7", (short) (C1633zX.Xd() ^ (910222845 ^ (-910225796))));
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
                        int i4 = 1137034414 ^ 1137034469;
                        if (x2 > i4 && x2 < displayMetrics.widthPixels - i4 && y2 > i4 && y2 < displayMetrics.heightPixels - i4) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static final /* synthetic */ void access$updateIcon(GovernmentValidationActivity governmentValidationActivity, int i2) {
        int i3 = 2 % 2;
        int i4 = f14422f + 41;
        f14424j = i4 % 128;
        int i5 = i4 % 2;
        governmentValidationActivity.b(i2);
        int i6 = f14422f + 93;
        f14424j = i6 % 128;
        int i7 = i6 % 2;
    }

    public final GovernmentValidationPresenter getMPresenter() {
        int i2 = 2 % 2;
        int i3 = f14422f + 3;
        f14424j = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        GovernmentValidationPresenter governmentValidationPresenter = this.f14427c;
        if (governmentValidationPresenter != null) {
            return governmentValidationPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = f14424j + 19;
        f14422f = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setMPresenter(GovernmentValidationPresenter governmentValidationPresenter) {
        int i2 = 2 % 2;
        int i3 = f14424j + 81;
        f14422f = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(governmentValidationPresenter, "");
            this.f14427c = governmentValidationPresenter;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(governmentValidationPresenter, "");
        this.f14427c = governmentValidationPresenter;
        int i4 = f14424j + 113;
        f14422f = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f14424j;
        int i4 = i3 + 67;
        f14422f = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f14426b;
        int i6 = i3 + 65;
        f14422f = i6 % 128;
        if (i6 % 2 == 0) {
            return screenName;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f14424j + 3;
        f14422f = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = this.f14431i;
        if (i4 != 0) {
            int i5 = 46 / 0;
        }
        return modules;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f14432c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f14433e = 0;

        private Companion() {
        }

        public static int c() {
            int i2 = f14432c;
            int i3 = i2 % 5957380;
            f14432c = i2 + 1;
            if (i3 != 0) {
                return f14433e;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            f14433e = iElapsedRealtime;
            return iElapsedRealtime;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class g extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14456c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14457e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f14456c + 33;
            f14457e = i3 % 128;
            int i4 = i3 % 2;
            a();
            Unit unit = Unit.INSTANCE;
            int i5 = f14457e + 45;
            f14456c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 62 / 0;
            }
            return unit;
        }

        private void a() {
            int i2 = 2 % 2;
            int i3 = f14456c + 85;
            f14457e = i3 % 128;
            int i4 = i3 % 2;
            GovernmentValidationActivity.this.getMPresenter().validate();
            int i5 = f14456c + 37;
            f14457e = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        g() {
            super(0);
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        k kVarB = k.b(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(kVarB, "");
        this.f14429e = kVarB;
        k kVar = null;
        if (kVarB == null) {
            int i3 = f14424j + 79;
            f14422f = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            kVarB = null;
        }
        setContentView(kVarB.a());
        DaggerGovernmentValidationComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent()).governmentValidationPresenterModule(new GovernmentValidationPresenterModule(this)).build().inject(this);
        boolean booleanExtra = getIntent().getBooleanExtra("extraSkipAnimation", false);
        this.f14430g = booleanExtra;
        if (!booleanExtra) {
            k kVar2 = this.f14429e;
            if (kVar2 != null) {
                kVar = kVar2;
            } else {
                int i5 = f14422f + 109;
                f14424j = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ImageView imageView = kVar.f7255a;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            ImageView imageView2 = imageView;
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.verticalBias = 0.35f;
                imageView2.setLayoutParams(layoutParams2);
                kVar.f7259e.setText(R.string.onboard_sdk_ine_validation_in_progress);
                ImageView imageView3 = kVar.f7256b;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(0);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        c();
        getMPresenter().validate();
        setNoNetworkSnackbarRetryAction(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(GovernmentValidationActivity governmentValidationActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(governmentValidationActivity, "");
        governmentValidationActivity.getMPresenter().publishResult(new GovernmentValidationResult(ResultCode.USER_CANCELLED, null, false, 2, null));
        int i4 = f14424j + 81;
        f14422f = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    @Deprecated(message = "Deprecated in Java")
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f14424j + 87;
        f14422f = i3 % 128;
        if (i3 % 2 == 0) {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.government_validation.GovernmentValidationActivity$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    GovernmentValidationActivity.b(this.f$0, dialogInterface, i4);
                }
            });
            int i4 = f14424j + 37;
            f14422f = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 51 / 0;
                return;
            }
            return;
        }
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.government_validation.GovernmentValidationActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i42) {
                GovernmentValidationActivity.b(this.f$0, dialogInterface, i42);
            }
        });
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final boolean isScreenCloseable() {
        int i2 = 2 % 2;
        int i3 = f14424j;
        int i4 = i3 + 121;
        f14422f = i4 % 128;
        boolean z2 = i4 % 2 != 0;
        int i5 = i3 + 111;
        f14422f = i5 % 128;
        if (i5 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    private final void c() {
        int i2 = 2 % 2;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.onboard_sdk_rotate);
        animationLoadAnimation.setFillAfter(true);
        animationLoadAnimation.setInterpolator(new LinearInterpolator());
        k kVar = this.f14429e;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f14424j + 93;
            f14422f = i3 % 128;
            int i4 = i3 % 2;
            kVar = null;
        }
        kVar.f7255a.startAnimation(animationLoadAnimation);
        int i5 = f14424j + 53;
        f14422f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
    }

    private final void a() {
        int i2 = 2 % 2;
        int i3 = f14422f;
        int i4 = i3 + 7;
        f14424j = i4 % 128;
        int i5 = i4 % 2;
        k kVar = this.f14429e;
        if (kVar == null) {
            int i6 = i3 + 87;
            f14424j = i6 % 128;
            int i7 = i6 % 2;
            kVar = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i7 == 0) {
                throw null;
            }
        }
        kVar.f7255a.clearAnimation();
    }

    private final void d(int i2) {
        int i3 = 2 % 2;
        if (!this.f14430g) {
            e(i2);
            int i4 = f14424j + 51;
            f14422f = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
                return;
            }
            return;
        }
        int i6 = f14424j + 25;
        f14422f = i6 % 128;
        if (i6 % 2 == 0) {
            getMPresenter().publishSuccessResult(Integer.valueOf(i2));
            return;
        }
        getMPresenter().publishSuccessResult(Integer.valueOf(i2));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class d extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14444c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14445d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f14447e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f14445d + 105;
            f14444c = i3 % 128;
            int i4 = i3 % 2;
            e();
            Unit unit = Unit.INSTANCE;
            int i5 = f14444c + 103;
            f14445d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e() {
            int i2 = 2 % 2;
            int i3 = f14444c + 77;
            f14445d = i3 % 128;
            int i4 = i3 % 2;
            GovernmentValidationActivity.access$updateIcon(GovernmentValidationActivity.this, this.f14447e);
            int i5 = f14445d + 39;
            f14444c = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i2) {
            super(1);
            this.f14447e = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14422f + 49;
        f14424j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f14424j + 73;
        f14422f = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14437b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14438e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14437b + 1;
            f14438e = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f14437b + 67;
            f14438e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c(Throwable th) {
            int i2 = 2 % 2;
            GovernmentValidationActivity.this.getMPresenter().publishResult(new GovernmentValidationResult(ResultCode.ERROR, th, false, 4, null));
            int i3 = f14437b + 77;
            f14438e = i3 % 128;
            int i4 = i3 % 2;
        }

        b() {
            super(1);
        }
    }

    static final class c extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14440a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14441b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f14442c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f14441b + 89;
            f14440a = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            a();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f14440a + 45;
            f14441b = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private void a() {
            int i2 = 2 % 2;
            int i3 = f14441b + 125;
            f14440a = i3 % 128;
            int i4 = i3 % 2;
            GovernmentValidationActivity.this.getMPresenter().publishSuccessResult(Integer.valueOf(this.f14442c));
            int i5 = f14441b + 55;
            f14440a = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i2) {
            super(1);
            this.f14442c = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14424j + 19;
        f14422f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f14424j + 47;
        f14422f = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14424j + 1;
        f14422f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f14422f + 21;
        f14424j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
    }

    private final void e(int i2) {
        int i3 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f14428d;
        Observable<Long> observableObserveOn = Observable.timer(2L, TimeUnit.SECONDS).subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread());
        final d dVar = new d(i2);
        Observable<Long> observableDelay = observableObserveOn.doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.government_validation.GovernmentValidationActivity$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GovernmentValidationActivity.c(dVar, obj);
            }
        }).delay(2L, TimeUnit.SECONDS);
        final c cVar = new c(i2);
        Consumer<? super Long> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.government_validation.GovernmentValidationActivity$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GovernmentValidationActivity.b(cVar, obj);
            }
        };
        final b bVar = new b();
        compositeDisposable.add(observableDelay.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.government_validation.GovernmentValidationActivity$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GovernmentValidationActivity.e(bVar, obj);
            }
        }));
        int i4 = f14424j + 115;
        f14422f = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }

    private final void b(int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = f14422f + 113;
        f14424j = i6 % 128;
        int i7 = i6 % 2;
        a();
        if (i2 == -1 || i2 == 0) {
            EventUtils.sendEvent(getRepo(), Event.GOVERNMENT_VALIDATION_SUCCEEDED, getModule(), getScreenName());
        } else {
            EventUtils.sendEvent(getRepo(), Event.GOVERNMENT_VALIDATION_FAILED, getModule(), getScreenName());
        }
        switch (i2) {
            case -2:
                i3 = R.drawable.onboard_sdk_ine_error;
                i4 = R.string.onboard_sdk_no_internet_connection;
                int i8 = f14424j + 117;
                f14422f = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 3 % 3;
                }
                break;
            case -1:
                i3 = R.drawable.onboard_sdk_ic_success;
                i4 = R.string.onboard_sdk_ine_validation_async;
                break;
            case 0:
                i3 = R.drawable.onboard_sdk_ic_success;
                i4 = R.string.onboard_sdk_ine_validation_success;
                break;
            case 1:
                i3 = R.drawable.onboard_sdk_ic_failure;
                i4 = R.string.onboard_sdk_ine_validation_failure;
                break;
            case 2:
                i3 = R.drawable.onboard_sdk_ine_error;
                i4 = R.string.onboard_sdk_ine_validation_connection_error;
                break;
            case 3:
                i3 = R.drawable.onboard_sdk_ine_error;
                i4 = R.string.onboard_sdk_ine_validation_ine_infrastructure_error;
                break;
            case 4:
                i3 = R.drawable.onboard_sdk_ine_error;
                i4 = R.string.onboard_sdk_ine_validation_module_not_supported_error;
                break;
            case 5:
                i3 = R.drawable.onboard_sdk_ine_error;
                i4 = R.string.onboard_sdk_ine_validation_missing_document_identifier_error;
                break;
            case 6:
                i3 = R.drawable.onboard_sdk_ine_error;
                i4 = R.string.onboard_sdk_ine_validation_missing_selfie_error;
                break;
            case 7:
                i3 = R.drawable.onboard_sdk_ine_error;
                i4 = R.string.onboard_sdk_ine_validation_user_not_found_error;
                break;
            case 8:
                i3 = R.drawable.onboard_sdk_ine_error;
                i4 = R.string.onboard_sdk_ine_validation_user_not_in_database;
                break;
            case 9:
                i3 = R.drawable.onboard_sdk_ine_error;
                i4 = R.string.onboard_sdk_ine_validation_insufficient_lookup_data;
                break;
            default:
                i3 = R.drawable.onboard_sdk_ic_failure;
                i4 = R.string.onboard_sdk_ine_validation_failure;
                break;
        }
        k kVar = this.f14429e;
        k kVar2 = null;
        if (kVar == null) {
            int i10 = f14424j + 95;
            f14422f = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                kVar2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            kVar = null;
        }
        kVar.f7255a.setImageResource(i3);
        k kVar3 = this.f14429e;
        if (kVar3 == null) {
            int i11 = f14424j + 23;
            f14422f = i11 % 128;
            int i12 = i11 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            kVar2 = kVar3;
        }
        kVar2.f7259e.setText(i4);
    }

    @Override // com.incode.welcome_sdk.ui.government_validation.GovernmentValidationContract.View
    public final void onIdentityVerified() {
        int i2 = 2 % 2;
        int i3 = f14422f + 99;
        f14424j = i3 % 128;
        int i4 = i3 % 2;
        d(0);
        int i5 = f14422f + 31;
        f14424j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.government_validation.GovernmentValidationContract.View
    public final void onIdentityNotVerified() {
        int i2 = 2 % 2;
        int i3 = f14424j + 31;
        f14422f = i3 % 128;
        int i4 = i3 % 2;
        d(1);
        int i5 = f14424j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14422f = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.government_validation.GovernmentValidationContract.View
    public final void onGovernmentValidationError(int i2) {
        int i3 = 2 % 2;
        int i4 = f14424j + 73;
        f14422f = i4 % 128;
        int i5 = i4 % 2;
        switch (i2) {
            case 97:
            case 98:
            case 99:
                Timber.Forest.d("Gov't validation returned statusCode " + i2 + ". Skipping the result UI.", new Object[0]);
                break;
            default:
                b(i2);
                int i6 = f14424j + 45;
                f14422f = i6 % 128;
                int i7 = i6 % 2;
                break;
        }
        c(i2);
    }

    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14434b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14435d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14435d + 39;
            f14434b = i3 % 128;
            int i4 = i3 % 2;
            a(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f14435d + 53;
            f14434b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Throwable th) {
            int i2 = 2 % 2;
            GovernmentValidationActivity.this.getMPresenter().publishResult(new GovernmentValidationResult(ResultCode.ERROR, th, false, 4, null));
            int i3 = f14435d + 85;
            f14434b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 75 / 0;
            }
        }

        a() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14448d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14449e = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f14451b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f14448d + 15;
            f14449e = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f14449e + 95;
            f14448d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c() {
            int i2 = 2 % 2;
            int i3 = f14449e + 81;
            f14448d = i3 % 128;
            if (i3 % 2 != 0) {
                GovernmentValidationActivity.this.getMPresenter().publishSuccessResult(Integer.valueOf(this.f14451b));
                int i4 = 60 / 0;
            } else {
                GovernmentValidationActivity.this.getMPresenter().publishSuccessResult(Integer.valueOf(this.f14451b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i2) {
            super(1);
            this.f14451b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14424j + 9;
        f14422f = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f14424j + 49;
        f14422f = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f14424j + 13;
        f14422f = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            return null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        throw null;
    }

    private final void c(int i2) {
        int i3 = 2 % 2;
        int i4 = f14424j + 69;
        f14422f = i4 % 128;
        if (i4 % 2 == 0) {
            if (!(!this.f14430g)) {
                getMPresenter().publishSuccessResult(Integer.valueOf(i2));
                int i5 = f14424j + 53;
                f14422f = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                return;
            }
            CompositeDisposable compositeDisposable = this.f14428d;
            Observable<Long> observableTimer = Observable.timer(2L, TimeUnit.SECONDS);
            final e eVar = new e(i2);
            Consumer<? super Long> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.government_validation.GovernmentValidationActivity$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    GovernmentValidationActivity.d(eVar, obj);
                }
            };
            final a aVar = new a();
            compositeDisposable.add(observableTimer.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.government_validation.GovernmentValidationActivity$$ExternalSyntheticLambda4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    GovernmentValidationActivity.a(aVar, obj);
                }
            }));
            return;
        }
        throw null;
    }

    static final class f extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14452b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14453e = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Throwable f14454c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14452b + 5;
            f14453e = i3 % 128;
            int i4 = i3 % 2;
            e();
            Unit unit = Unit.INSTANCE;
            int i5 = f14453e + 125;
            f14452b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 23 / 0;
            }
            return unit;
        }

        private void e() {
            int i2 = 2 % 2;
            GovernmentValidationActivity.this.getMPresenter().publishResult(new GovernmentValidationResult(ResultCode.ERROR, this.f14454c, false, 4, null));
            int i3 = f14452b + 73;
            f14453e = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Throwable th) {
            super(1);
            this.f14454c = th;
        }
    }

    static final class i extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14459c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14460d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Throwable f14461a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f14460d + 71;
            f14459c = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 78 / 0;
            }
            int i6 = f14460d + 101;
            f14459c = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private void c() {
            int i2 = 2 % 2;
            GovernmentValidationActivity.this.getMPresenter().publishResult(new GovernmentValidationResult(ResultCode.ERROR, this.f14461a, false, 4, null));
            int i3 = f14460d + 33;
            f14459c = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Throwable th) {
            super(1);
            this.f14461a = th;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f14422f + 125;
        f14424j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f14422f + 1;
        f14424j = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14422f + 125;
        f14424j = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f14422f + 101;
        f14424j = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.government_validation.GovernmentValidationContract.View
    public final void onError(Throwable th) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        if (com.incode.welcome_sdk.commons.httpinterceptors.e.c(this)) {
            b(1);
            CompositeDisposable compositeDisposable = this.f14428d;
            Observable<Long> observableTimer = Observable.timer(2L, TimeUnit.SECONDS);
            final i iVar = new i(th);
            Consumer<? super Long> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.government_validation.GovernmentValidationActivity$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    GovernmentValidationActivity.g(iVar, obj);
                }
            };
            final f fVar = new f(th);
            compositeDisposable.add(observableTimer.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.government_validation.GovernmentValidationActivity$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    GovernmentValidationActivity.h(fVar, obj);
                }
            }));
            return;
        }
        int i4 = f14422f + 75;
        f14424j = i4 % 128;
        if (i4 % 2 == 0) {
            showNoNetworkMessage();
            i2 = 54;
        } else {
            showNoNetworkMessage();
            i2 = -2;
        }
        b(i2);
        int i5 = f14424j + 37;
        f14422f = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f14424j + 51;
        f14422f = i3 % 128;
        int i4 = i3 % 2;
        this.f14428d.clear();
        getMPresenter().onDestroy();
        super.safeOnDestroy();
        int i5 = f14422f + 91;
        f14424j = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        new Companion(defaultConstructorMarker);
        int i2 = f14423h + 83;
        f14425o = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function1 function1, Object obj) {
        int iB = MaxVideoLengthReachedException.b();
        int iB2 = MaxVideoLengthReachedException.b();
        int iB3 = MaxVideoLengthReachedException.b();
        b(iB, iB2, -856446591, MaxVideoLengthReachedException.b(), iB3, 856446592, new Object[]{function1, obj});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int iB = MaxVideoLengthReachedException.b();
        int iB2 = MaxVideoLengthReachedException.b();
        int iB3 = MaxVideoLengthReachedException.b();
        b(iB, iB2, -1855286562, MaxVideoLengthReachedException.b(), iB3, 1855286562, new Object[]{function1, obj});
    }
}
