package com.incode.welcome_sdk.ui.geolocation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.util.Strings;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.d.m;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.GeolocationResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.geolocation.GeolocationContract;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog;
import com.incode.welcome_sdk.views.IncodeButton;
import io.sentry.protocol.SentryStackFrame;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class GeolocationActivity extends BaseActivity implements GeolocationContract.View, PermissionsMandatoryContract.View {

    /* JADX INFO: renamed from: c */
    public static final Companion f14242c = new Companion(null);

    /* JADX INFO: renamed from: g */
    private static int f14243g = 0;

    /* JADX INFO: renamed from: k */
    private static int f14244k = 0;

    /* JADX INFO: renamed from: m */
    private static int f14245m = 1;

    /* JADX INFO: renamed from: n */
    private static int f14246n = 1;

    /* JADX INFO: renamed from: b */
    private boolean f14247b;

    /* JADX INFO: renamed from: d */
    private m f14248d;

    /* JADX INFO: renamed from: e */
    @Inject
    public GeolocationPresenter f14249e;

    /* JADX INFO: renamed from: h */
    private boolean f14251h;

    /* JADX INFO: renamed from: j */
    private boolean f14253j;

    /* JADX INFO: renamed from: i */
    private final ScreenName f14252i = ScreenName.GEOLOCATION;

    /* JADX INFO: renamed from: f */
    private final Modules f14250f = Modules.GEOLOCATION;

    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V */
    public static /* synthetic */ void m8466instrumented$0$safeOnCreate$LandroidosBundleV(GeolocationActivity geolocationActivity, View view) {
        Callback.onClick_enter(view);
        try {
            d(geolocationActivity, view);
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
            String strKd = Qg.kd("q^$aE", (short) (ZN.Xd() ^ ((1634014691 ^ 1190404607) ^ 663832699)), (short) (ZN.Xd() ^ ((1294298012 ^ 1211214930) ^ 85259201)));
            String strVd = hg.Vd("\u001d\n", (short) (Od.Xd() ^ ((1008701404 ^ 1947084519) ^ (-1209110520))), (short) (Od.Xd() ^ (1907910896 ^ (-1907911263))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("\u0002n4qU", (short) (C1607wl.Xd() ^ (1862420393 ^ 1862423685)));
                short sXd = (short) (C1580rY.Xd() ^ ((1797300436 ^ 1341961359) ^ (-618425950)));
                int[] iArr = new int["m[".length()];
                QB qb = new QB("m[");
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
                    String strYd = C1561oA.Yd("8'n.\u0014", (short) (Od.Xd() ^ ((228580814 ^ 357689138) ^ (-416168895))));
                    String strQd = Xg.qd("\u0002w", (short) (Od.Xd() ^ (1370397220 ^ (-1370416690))), (short) (Od.Xd() ^ ((16792693 ^ 9369404) ^ (-26116475))));
                    try {
                        Class<?> cls3 = Class.forName(strYd);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Class<?> cls4 = Class.forName(Jg.Wd("\u0014y=D\u000e", (short) (C1633zX.Xd() ^ (29226463 ^ (-29221332))), (short) (C1633zX.Xd() ^ ((1956572374 ^ 685185379) ^ (-1548338812)))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd2 = (short) (ZN.Xd() ^ (1684126106 ^ 1684132409));
                        short sXd3 = (short) (ZN.Xd() ^ ((1249178428 ^ 1593104948) ^ 343949970));
                        int[] iArr2 = new int["W ".length()];
                        QB qb2 = new QB("W ");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                            i3++;
                        }
                        Method declaredMethod = cls4.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("\u0002\u0004\u001b\u0019\u0015Z", (short) (C1607wl.Xd() ^ (1235635058 ^ 1235635559)), (short) (C1607wl.Xd() ^ ((144249366 ^ 487494296) ^ 362280089)))};
                                Method method = Class.forName(Ig.wd("S\tpc?\f\u0017\u0001zkhP\u000ei{Z'e\f&\\/A", (short) (OY.Xd() ^ ((1886691259 ^ 1419110686) ^ 618733822)))).getMethod(C1561oA.Qd("\r\n\u0018u\u001b\u0014\u0014\u0004\u000bo\u0001\r\u0010\u0002z{", (short) (C1633zX.Xd() ^ ((1926690896 ^ 1167850583) ^ (-927815711)))), Class.forName(EO.Od("\\+yF\u0005\u0019$R\u000f3PY'\"tU", (short) (C1607wl.Xd() ^ ((740532713 ^ 93410343) ^ 699590123)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("fU\u001d\\B", (short) (FB.Xd() ^ ((386211210 ^ 29337069) ^ 381339143)), (short) (FB.Xd() ^ (436053970 ^ 436054990)));
                                    String strOd = C1561oA.od("\u001a\u000e", (short) (ZN.Xd() ^ ((1294787027 ^ 893546330) ^ 2020517955)));
                                    try {
                                        Class<?> cls5 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls5.getField(strOd) : cls5.getDeclaredField(strOd);
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
                    short sXd4 = (short) (C1580rY.Xd() ^ (1413181452 ^ (-1413158379)));
                    int[] iArr3 = new int["5$k+\u0011".length()];
                    QB qb3 = new QB("5$k+\u0011");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd4 + sXd4) + i4));
                        i4++;
                    }
                    String str2 = new String(iArr3, 0, i4);
                    String strZd2 = Wg.Zd("I9", (short) (Od.Xd() ^ ((1992428866 ^ 434811647) ^ (-1864928114))), (short) (Od.Xd() ^ ((1088854389 ^ 1224463747) ^ (-136150042))));
                    try {
                        Class<?> cls6 = Class.forName(str2);
                        Field field5 = 0 != 0 ? cls6.getField(strZd2) : cls6.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        short sXd5 = (short) (ZN.Xd() ^ ((2007419977 ^ 2043397154) ^ 242034373));
                        int[] iArr4 = new int["xg/nT".length()];
                        QB qb4 = new QB("xg/nT");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 + i5));
                            i5++;
                        }
                        String str3 = new String(iArr4, 0, i5);
                        String strVd2 = Wg.vd("i_", (short) (C1607wl.Xd() ^ ((1461823985 ^ 233384420) ^ 1523110858)));
                        try {
                            Class<?> cls7 = Class.forName(str3);
                            Field field6 = 0 != 0 ? cls7.getField(strVd2) : cls7.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i6 = (1203019971 ^ 528724209) ^ 1480003705;
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

    public final GeolocationPresenter getMPresenter() {
        int i2 = 2 % 2;
        int i3 = f14243g;
        int i4 = i3 + 59;
        f14245m = i4 % 128;
        int i5 = i4 % 2;
        GeolocationPresenter geolocationPresenter = this.f14249e;
        if (geolocationPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i6 = i3 + 3;
        f14245m = i6 % 128;
        int i7 = i6 % 2;
        return geolocationPresenter;
    }

    public final void setMPresenter(GeolocationPresenter geolocationPresenter) {
        int i2 = 2 % 2;
        int i3 = f14243g + 53;
        f14245m = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(geolocationPresenter, "");
            this.f14249e = geolocationPresenter;
        } else {
            Intrinsics.checkNotNullParameter(geolocationPresenter, "");
            this.f14249e = geolocationPresenter;
            int i4 = 33 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f14245m + 23;
        f14243g = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f14252i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f14245m + 93;
        int i4 = i3 % 128;
        f14243g = i4;
        int i5 = i3 % 2;
        Modules modules = this.f14250f;
        int i6 = i4 + 27;
        f14245m = i6 % 128;
        if (i6 % 2 != 0) {
            return modules;
        }
        throw null;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: c */
        private static int f14254c = 1;

        /* JADX INFO: renamed from: d */
        private static int f14255d = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) GeolocationActivity.class);
            CX.ud();
            context.startActivity(intent);
            int i3 = f14254c + 107;
            f14255d = i3 % 128;
            int i4 = i3 % 2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        private static int f14256b = 0;

        /* JADX INFO: renamed from: e */
        private static int f14257e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f14256b + 99;
            f14257e = i3 % 128;
            int i4 = i3 % 2;
            a();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void a() {
            int i2 = 2 % 2;
            int i3 = f14256b + 89;
            f14257e = i3 % 128;
            int i4 = i3 % 2;
            GeolocationActivity.this.getMPresenter().getUserLocation();
            int i5 = f14257e + 51;
            f14256b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 35 / 0;
            }
        }

        b() {
            super(0);
        }
    }

    private static final void d(GeolocationActivity geolocationActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f14243g + 51;
        f14245m = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(geolocationActivity, "");
            geolocationActivity.d();
            throw null;
        }
        Intrinsics.checkNotNullParameter(geolocationActivity, "");
        geolocationActivity.d();
        int i4 = f14243g + 17;
        f14245m = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        m mVarB = m.b(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(mVarB, "");
        this.f14248d = mVarB;
        m mVar = null;
        if (mVarB == null) {
            int i3 = f14245m + 89;
            f14243g = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            mVarB = null;
        }
        setContentView(mVarB.e());
        DaggerGeolocationComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent()).geolocationPresenterModule(new GeolocationPresenterModule(this)).build().inject(this);
        getMPresenter().onCreate();
        m mVar2 = this.f14248d;
        if (mVar2 == null) {
            int i4 = f14245m + 79;
            f14243g = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = f14243g + 83;
            f14245m = i6 % 128;
            int i7 = i6 % 2;
        } else {
            mVar = mVar2;
        }
        mVar.f7269e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GeolocationActivity.m8466instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        setNoNetworkSnackbarRetryAction(new b());
        int i8 = f14245m + 47;
        f14243g = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 46 / 0;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onStart() {
        int i2 = 2 % 2;
        int i3 = f14245m + 5;
        f14243g = i3 % 128;
        int i4 = i3 % 2;
        super.onStart();
        getMPresenter().onStart();
        int i5 = f14245m + 75;
        f14243g = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f14243g + 31;
        f14245m = i3 % 128;
        int i4 = i3 % 2;
        getMPresenter().onDestroy();
        super.safeOnDestroy();
        int i5 = f14245m + 49;
        f14243g = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f14245m + 25;
        f14243g = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
        } else {
            Intrinsics.checkNotNullParameter(bundle, "");
        }
        super.onSaveInstanceState(bundle);
        this.f14247b = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 1001) {
            int i4 = f14243g;
            int i5 = i4 + 93;
            f14245m = i5 % 128;
            if (i5 % 2 != 0 ? iArr[0] == 0 : iArr[0] == 0) {
                int i6 = i4 + 45;
                f14245m = i6 % 128;
                int i7 = i6 % 2;
                getMPresenter().onPermissionsGranted();
                return;
            }
            if (Build.VERSION.SDK_INT < 31) {
                b();
                return;
            }
            if (iArr[1] != 0 || !(!this.f14251h)) {
                b();
                return;
            }
            int i8 = f14243g + 75;
            f14245m = i8 % 128;
            if (i8 % 2 == 0) {
                requestPermissions();
                this.f14251h = true;
            } else {
                requestPermissions();
                this.f14251h = true;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    protected final void onResumeFragments() {
        int i2 = 2 % 2;
        int i3 = f14243g + 101;
        f14245m = i3 % 128;
        int i4 = i3 % 2;
        super.onResumeFragments();
        if (this.f14253j) {
            int i5 = f14243g + 105;
            f14245m = i5 % 128;
            int i6 = i5 % 2;
            e();
            this.f14253j = false;
        }
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.View
    public final void showWaitingForLocation() {
        int i2 = 2 % 2;
        m mVar = this.f14248d;
        m mVar2 = null;
        if (mVar == null) {
            int i3 = f14243g + 73;
            f14245m = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            mVar = null;
        }
        mVar.f7268d.setVisibility(0);
        m mVar3 = this.f14248d;
        if (mVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            mVar2 = mVar3;
        }
        mVar2.f7269e.setEnabled(false);
        int i4 = f14245m + 25;
        f14243g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.View
    public final void showCurrentLocation(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        m mVar = null;
        if (Strings.isEmptyOrWhitespace(str)) {
            m mVar2 = this.f14248d;
            if (mVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                mVar2 = null;
            }
            mVar2.f7268d.setVisibility(0);
            m mVar3 = this.f14248d;
            if (mVar3 == null) {
                int i3 = f14243g + 43;
                f14245m = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                mVar = mVar3;
            }
            mVar.f7269e.setEnabled(false);
            int i4 = f14243g + 83;
            f14245m = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        m mVar4 = this.f14248d;
        if (mVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            mVar4 = null;
        }
        mVar4.f7268d.setVisibility(8);
        m mVar5 = this.f14248d;
        if (mVar5 == null) {
            int i6 = f14243g + 17;
            f14245m = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            mVar5 = null;
        }
        mVar5.f7269e.setEnabled(true);
        c();
        m mVar6 = this.f14248d;
        if (mVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            mVar = mVar6;
        }
        mVar.f7272h.setText(str);
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.View
    public final void showLocationDisabled() {
        int i2 = 2 % 2;
        int i3 = f14245m + 123;
        f14243g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            m mVar = this.f14248d;
            if (mVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                mVar = null;
            }
            mVar.f7266b.setVisibility(0);
            m mVar2 = this.f14248d;
            if (mVar2 == null) {
                int i4 = f14245m + 5;
                f14243g = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                mVar2 = null;
            }
            mVar2.f7265a.setVisibility(4);
            m mVar3 = this.f14248d;
            if (mVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                mVar3 = null;
            }
            mVar3.f7267c.setImageResource(R.drawable.onboard_sdk_ic_location_disabled);
            int i6 = f14243g + 75;
            f14245m = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.View
    public final void showLocationUnavailable() {
        int i2 = 2 % 2;
        m mVar = this.f14248d;
        m mVar2 = null;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f14245m + 103;
            f14243g = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 4;
            }
            mVar = null;
        }
        mVar.f7268d.setVisibility(8);
        m mVar3 = this.f14248d;
        if (mVar3 == null) {
            int i5 = f14243g + 51;
            f14245m = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = f14243g + 95;
            f14245m = i7 % 128;
            int i8 = i7 % 2;
            mVar3 = null;
        }
        mVar3.f7269e.setEnabled(true);
        showLocationDisabled();
        m mVar4 = this.f14248d;
        if (mVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            mVar2 = mVar4;
        }
        mVar2.f7274j.setText(R.string.onboard_sdk_location_unavailable);
        int i9 = f14243g + 125;
        f14245m = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x001b  */
    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onServerResponse(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.geolocation.GeolocationActivity.f14245m
            int r1 = r0 + 45
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.geolocation.GeolocationActivity.f14243g = r0
            int r1 = r1 % r3
            java.lang.String r2 = ""
            if (r1 == 0) goto L44
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            com.incode.welcome_sdk.d.m r1 = r4.f14248d
            r0 = 58
            int r0 = r0 / 0
            if (r1 != 0) goto L1f
        L1b:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r1 = 0
        L1f:
            com.incode.welcome_sdk.views.IncodeTextView r0 = r1.f7272h
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r1 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r0)
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == r0) goto L34
            r4.showCurrentLocation(r5)
        L34:
            int r0 = com.incode.welcome_sdk.ui.geolocation.GeolocationActivity.f14245m
            int r1 = r0 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.geolocation.GeolocationActivity.f14243g = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L43
            r0 = 25
            int r0 = r0 / 0
        L43:
            return
        L44:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            com.incode.welcome_sdk.d.m r1 = r4.f14248d
            if (r1 != 0) goto L1f
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.geolocation.GeolocationActivity.onServerResponse(java.lang.String):void");
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.View
    public final boolean checkLocationPermissions() {
        int i2 = 2 % 2;
        int i3 = f14245m + 89;
        f14243g = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (Build.VERSION.SDK_INT < 31) {
            if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                return false;
            }
            int i5 = f14243g;
            int i6 = i5 + 29;
            f14245m = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 109;
            f14245m = i8 % 128;
            if (i8 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        int i9 = f14243g + 89;
        f14245m = i9 % 128;
        int i10 = i9 % 2;
        GeolocationActivity geolocationActivity = this;
        if (ContextCompat.checkSelfPermission(geolocationActivity, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            int i11 = f14245m + 11;
            f14243g = i11 % 128;
            int i12 = i11 % 2;
            if (ContextCompat.checkSelfPermission(geolocationActivity, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                int i13 = f14243g + 109;
                f14245m = i13 % 128;
                if (i13 % 2 != 0) {
                    return true;
                }
                throw null;
            }
        }
        return false;
    }

    @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationContract.View
    public final void requestPermissions() {
        String[] strArr;
        int i2 = 2 % 2;
        int i3 = f14243g + 89;
        f14245m = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT < 31) {
            strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION"};
        } else {
            int i5 = f14243g + 45;
            f14245m = i5 % 128;
            if (i5 % 2 == 0) {
                strArr = new String[4];
                strArr[0] = "android.permission.ACCESS_FINE_LOCATION";
                strArr[1] = "android.permission.ACCESS_COARSE_LOCATION";
            } else {
                strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            }
        }
        ActivityCompat.requestPermissions(this, strArr, 1001);
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, com.incode.welcome_sdk.ui.BaseView
    public final void closeScreen() {
        int i2 = 2 % 2;
        int i3 = f14243g + 45;
        f14245m = i3 % 128;
        int i4 = i3 % 2;
        finish();
        int i5 = f14245m + 103;
        f14243g = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public final void onBtnOpenSettingsClicked() throws Exception {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, getPackageName(), null));
        CX.ud();
        startActivity(intent);
        int i3 = f14243g + 105;
        f14245m = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 9 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public final void onPermissionMandatoryDialogClosed(Exception exc) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        getMPresenter().publishResult(new GeolocationResult(ResultCode.ERROR, exc, null, 0.0d, 0.0d, 28, null));
        int i3 = f14245m + 109;
        f14243g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 82 / 0;
        }
    }

    public static final void a(GeolocationActivity geolocationActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(geolocationActivity, "");
        geolocationActivity.getMPresenter().publishResult(new GeolocationResult(ResultCode.USER_CANCELLED, null, null, 0.0d, 0.0d, 30, null));
        int i4 = f14245m + 11;
        f14243g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f14245m + 87;
        f14243g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationActivity$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    GeolocationActivity.a(this.f$0, dialogInterface, i4);
                }
            });
            int i4 = f14243g + 61;
            f14245m = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.geolocation.GeolocationActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i42) {
                GeolocationActivity.a(this.f$0, dialogInterface, i42);
            }
        });
        obj.hashCode();
        throw null;
    }

    private final void b() {
        int i2 = 2 % 2;
        if (!isFinishing()) {
            int i3 = f14245m + 35;
            f14243g = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!this.f14247b) {
                e();
                int i4 = f14245m + 87;
                f14243g = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        this.f14253j = true;
    }

    private final void e() {
        int i2 = 2 % 2;
        int i3 = f14243g + 93;
        f14245m = i3 % 128;
        int i4 = i3 % 2;
        PermissionsMandatoryDialog.newInstance(R.drawable.onboard_sdk_location_permission_image, R.string.onboard_sdk_dialog_location_permissions_mandatory_title, R.string.onboard_sdk_dialog_location_permissions_mandatory_subtitle, "android.permission.ACCESS_FINE_LOCATION", getModule(), getRepo()).show(getSupportFragmentManager(), PermissionsMandatoryDialog.TAG);
        int i5 = f14243g + 17;
        f14245m = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void c() {
        int i2 = 2 % 2;
        m mVar = this.f14248d;
        m mVar2 = null;
        if (mVar == null) {
            int i3 = f14243g + 95;
            f14245m = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            mVar = null;
        }
        mVar.f7266b.setVisibility(4);
        m mVar3 = this.f14248d;
        if (mVar3 == null) {
            int i5 = f14245m + 1;
            f14243g = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            mVar3 = null;
        }
        mVar3.f7265a.setVisibility(0);
        m mVar4 = this.f14248d;
        if (mVar4 == null) {
            int i6 = f14243g + 105;
            f14245m = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i8 = f14245m + 35;
            f14243g = i8 % 128;
            int i9 = i8 % 2;
        } else {
            mVar2 = mVar4;
        }
        mVar2.f7267c.setImageResource(R.drawable.onboard_sdk_ic_location_enabled);
    }

    private final void d() {
        int i2 = 2 % 2;
        m mVar = this.f14248d;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f14245m + 3;
            f14243g = i3 % 128;
            int i4 = i3 % 2;
            mVar = null;
        }
        IncodeButton incodeButton = mVar.f7269e;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        getMPresenter().onContinue();
        int i5 = f14245m + 5;
        f14243g = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static {
        int i2 = f14246n + 23;
        f14244k = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context) {
        int i2 = 2 % 2;
        int i3 = f14243g + 69;
        f14245m = i3 % 128;
        int i4 = i3 % 2;
        f14242c.start(context);
        if (i4 == 0) {
            int i5 = 41 / 0;
        }
    }
}
