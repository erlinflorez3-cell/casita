package com.incode.welcome_sdk.ui.camera.id_validation;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.d.x;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.IdProcessResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveContract;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
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
public final class ReferredToExecutiveActivity extends BaseActivity implements ReferredToExecutiveContract.View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f11606c = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f11607h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f11608i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f11609j = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f11610n = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Inject
    public ReferredToExecutivePresenter f11611b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x f11613e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f11612d = LazyKt.lazy(new d());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScreenName f11615g = ScreenName.ID_SUMMARY;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Modules f11614f = Modules.ID;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8268instrumented$0$safeOnCreate$LandroidosBundleV(ReferredToExecutiveActivity referredToExecutiveActivity, View view) {
        Callback.onClick_enter(view);
        try {
            e(referredToExecutiveActivity, view);
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
            String strKd = Qg.kd("\u0007s9vZ", (short) (C1607wl.Xd() ^ ((1575393944 ^ 2017668979) ^ 631612312)), (short) (C1607wl.Xd() ^ (1185718370 ^ 1185735076)));
            String strVd = hg.Vd("I6", (short) (C1499aX.Xd() ^ ((263558581 ^ 1746842831) ^ (-1739272088))), (short) (C1499aX.Xd() ^ ((2051143613 ^ 269149209) ^ (-1783320276))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("fS\u0019V:", (short) (ZN.Xd() ^ ((933507277 ^ 495025279) ^ 707071579)));
                String strYd = C1561oA.yd("5!", (short) (OY.Xd() ^ (1193819674 ^ 1193820833)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("P?\u0007F,", (short) (C1633zX.Xd() ^ ((1248841134 ^ 1169993670) ^ (-265500036))));
                    String strQd = Xg.qd("ka", (short) (C1633zX.Xd() ^ ((301973509 ^ 877820631) ^ (-632159455))), (short) (C1633zX.Xd() ^ ((1678623582 ^ 1389067217) ^ (-918993418))));
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
                        Method declaredMethod = Class.forName(Jg.Wd("\u0001If8o", (short) (C1633zX.Xd() ^ ((1698938921 ^ 699424203) ^ (-1291046091))), (short) (C1633zX.Xd() ^ (446132270 ^ (-446109170))))).getDeclaredMethod(ZO.xd("ID", (short) (FB.Xd() ^ (1167609365 ^ 1167620893)), (short) (FB.Xd() ^ ((1048596305 ^ 855632121) ^ 209711529))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("\u001bcw\u0001Pi", (short) (C1633zX.Xd() ^ (1156211500 ^ (-1156212339))), (short) (C1633zX.Xd() ^ (1352496791 ^ (-1352499162))));
                                Class<?> cls4 = Class.forName(Ig.wd("E~`aC\u0018)\u0011\u000f}tFh}mF\u0013SwHr;W", (short) (C1633zX.Xd() ^ ((1224451801 ^ 1785817777) ^ (-579518314)))));
                                Class<?>[] clsArr = {Class.forName(EO.Od("Im'8\u0018\u000bQa|\u0006#h\u0015\u0010\u0003$", (short) (FB.Xd() ^ ((113375208 ^ 1225114612) ^ 1338267544))))};
                                Object[] objArr2 = {strUd2};
                                short sXd = (short) (FB.Xd() ^ ((1832007043 ^ 2086851046) ^ 290513481));
                                int[] iArr = new int["\u000f\f\u001aw\u001d\u0016\u0016\u0006\rq\u0003\u000f\u0012\u0004|}".length()];
                                QB qb = new QB("\u000f\f\u001aw\u001d\u0016\u0016\u0006\rq\u0003\u000f\u0012\u0004|}");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                                    i2++;
                                }
                                Method method = cls4.getMethod(new String(iArr, 0, i2), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("[J\u0012Q7", (short) (Od.Xd() ^ ((1623212619 ^ 1560539328) ^ (-1036250014))), (short) (Od.Xd() ^ ((292654714 ^ 649334124) ^ (-935701897))));
                                    String strOd = C1561oA.od("XL", (short) (C1633zX.Xd() ^ (722935941 ^ (-722954165))));
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
                    String strKd2 = C1561oA.Kd("$\u0013Z\u001a\u007f", (short) (C1633zX.Xd() ^ (1395763344 ^ (-1395753938))));
                    short sXd2 = (short) (Od.Xd() ^ (1938100683 ^ (-1938106140)));
                    short sXd3 = (short) (Od.Xd() ^ (629457009 ^ (-629466458)));
                    int[] iArr2 = new int["9D".length()];
                    QB qb2 = new QB("9D");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    String str = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls6 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls6.getField(str) : cls6.getDeclaredField(str);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("_N\u0016U;", (short) (C1580rY.Xd() ^ ((513764821 ^ 1398589112) ^ (-1304681195))));
                        String strVd2 = Wg.vd("j^", (short) (Od.Xd() ^ (730650232 ^ (-730637981))));
                        try {
                            Class<?> cls7 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls7.getField(strVd2) : cls7.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i4 = 1348150732 ^ 1348150663;
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

    public final ReferredToExecutivePresenter getMPresenter() {
        int i2 = 2 % 2;
        int i3 = f11607h + 121;
        f11608i = i3 % 128;
        int i4 = i3 % 2;
        ReferredToExecutivePresenter referredToExecutivePresenter = this.f11611b;
        if (referredToExecutivePresenter != null) {
            return referredToExecutivePresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = f11608i + 45;
        f11607h = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void setMPresenter(ReferredToExecutivePresenter referredToExecutivePresenter) {
        int i2 = 2 % 2;
        int i3 = f11608i + 9;
        f11607h = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(referredToExecutivePresenter, "");
            this.f11611b = referredToExecutivePresenter;
        } else {
            Intrinsics.checkNotNullParameter(referredToExecutivePresenter, "");
            this.f11611b = referredToExecutivePresenter;
            throw null;
        }
    }

    static final class d extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11618a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11619c = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Integer invoke() {
            int i2 = 2 % 2;
            int i3 = f11619c + 41;
            f11618a = i3 % 128;
            if (i3 % 2 == 0) {
                d();
                throw null;
            }
            Integer numD = d();
            int i4 = f11619c + 41;
            f11618a = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return numD;
        }

        private Integer d() {
            int i2 = 2 % 2;
            int i3 = f11618a + 97;
            f11619c = i3 % 128;
            int i4 = i3 % 2;
            Resources resources = ReferredToExecutiveActivity.this.getResources();
            if (i4 == 0) {
                return Integer.valueOf((int) resources.getDimension(R.dimen.onboard_sdk_photo_preview_frame_thickness));
            }
            Integer.valueOf((int) resources.getDimension(R.dimen.onboard_sdk_photo_preview_frame_thickness));
            throw null;
        }

        d() {
            super(0);
        }
    }

    private final int a() {
        int i2 = 2 % 2;
        int i3 = f11608i + 99;
        f11607h = i3 % 128;
        if (i3 % 2 == 0) {
            ((Number) this.f11612d.getValue()).intValue();
            throw null;
        }
        int iIntValue = ((Number) this.f11612d.getValue()).intValue();
        int i4 = f11607h + 81;
        f11608i = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f11607h + 29;
        f11608i = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f11615g;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        Modules modules;
        int i2 = 2 % 2;
        int i3 = f11607h + 97;
        int i4 = i3 % 128;
        f11608i = i4;
        if (i3 % 2 != 0) {
            modules = this.f11614f;
            int i5 = 2 / 0;
        } else {
            modules = this.f11614f;
        }
        int i6 = i4 + 121;
        f11607h = i6 % 128;
        if (i6 % 2 != 0) {
            return modules;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void e(ReferredToExecutiveActivity referredToExecutiveActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f11607h + 45;
        f11608i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(referredToExecutiveActivity, "");
        Intrinsics.checkNotNull(view);
        ViewExtensionsKt.preventDoubleClick(view);
        referredToExecutiveActivity.setResult(-1);
        referredToExecutiveActivity.closeScreen();
        int i5 = f11608i + 71;
        f11607h = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f11608i + 89;
        f11607h = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnCreate(bundle);
        x xVarD = x.d(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(xVarD, "");
        this.f11613e = xVarD;
        x xVar = null;
        if (xVarD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            xVarD = null;
        }
        setContentView(xVarD.d());
        DaggerReferredToExecutiveComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent()).referredToExecutivePresenterModule(new ReferredToExecutivePresenterModule(this)).build().inject(this);
        getMPresenter().init();
        x xVar2 = this.f11613e;
        if (xVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f11608i + 75;
            f11607h = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 5;
            }
        } else {
            xVar = xVar2;
        }
        xVar.f7396a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReferredToExecutiveActivity.m8268instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void showResults(com.incode.welcome_sdk.modules.IdScan.IdType r11) throws java.lang.Throwable {
        /*
            r10 = this;
            r9 = 2
            int r0 = r9 % r9
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity.f11607h
            int r1 = r0 + 117
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity.f11608i = r0
            int r1 = r1 % r9
            r8 = 0
            r6 = 0
            java.lang.String r7 = ""
            if (r1 == 0) goto L9e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r7)
            com.incode.welcome_sdk.d.x r4 = r10.f11613e
            r0 = 41
            int r0 = r0 / r6
            if (r4 != 0) goto L20
        L1c:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            r4 = r8
        L20:
            android.widget.FrameLayout r0 = r4.f7397b
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r6)
            android.widget.FrameLayout r0 = r4.f7397b
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.transition.TransitionManager.beginDelayedTransition(r0)
            android.widget.ImageView r5 = r4.f7402g
            int r3 = r10.a()
            int r2 = r10.a()
            int r1 = r10.a()
            int r0 = r10.a()
            r5.setPadding(r3, r2, r1, r0)
            android.widget.LinearLayout r0 = r4.f7399d
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r7)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r5 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r5
            int r3 = r10.a()
            int r2 = r10.a()
            int r1 = r10.a()
            int r0 = r10.a()
            r5.setMargins(r3, r2, r1, r0)
            android.widget.LinearLayout r0 = r4.f7399d
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
            r0.setLayoutParams(r5)
            r10.e(r4, r11)
            com.incode.welcome_sdk.modules.IdScan$IdType r0 = com.incode.welcome_sdk.modules.IdScan.IdType.PASSPORT
            if (r11 == r0) goto L7d
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity.f11608i
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity.f11607h = r0
            int r1 = r1 % r9
            if (r1 != 0) goto L9c
        L7d:
            r10.c(r4, r6)
            com.incode.welcome_sdk.modules.IdScan$IdType r0 = com.incode.welcome_sdk.modules.IdScan.IdType.PASSPORT
            if (r11 == r0) goto L9b
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity.f11608i
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity.f11607h = r0
            int r1 = r1 % r9
            if (r1 == 0) goto La7
            r10.c(r4, r11)
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity.f11607h
            int r1 = r0 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity.f11608i = r0
            int r1 = r1 % r9
        L9b:
            return
        L9c:
            r6 = 1
            goto L7d
        L9e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r7)
            com.incode.welcome_sdk.d.x r4 = r10.f11613e
            if (r4 != 0) goto L20
            goto L1c
        La7:
            r10.c(r4, r11)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity.showResults(com.incode.welcome_sdk.modules.IdScan$IdType):void");
    }

    private final void e(x xVar, IdScan.IdType idType) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        int i4 = f11607h + 121;
        f11608i = i4 % 128;
        int i5 = i4 % 2;
        x xVar2 = null;
        if (getMPresenter().getFrontIdResult() != 0) {
            xVar.f7402g.setBackgroundResource(R.drawable.onboard_sdk_bg_border_fail);
            xVar.f7404i.setImageResource(R.drawable.onboard_sdk_results_status_fail);
            if (idType == IdScan.IdType.PASSPORT) {
                i2 = R.string.onboard_sdk_validation_passport_scan_failure;
            } else {
                i2 = R.string.onboard_sdk_validation_front_id_scan_failure;
            }
            xVar.f7405j.setText(i2);
        } else {
            int i6 = f11607h + 9;
            f11608i = i6 % 128;
            if (i6 % 2 == 0) {
                xVar.f7402g.setBackgroundResource(R.drawable.onboard_sdk_bg_border_success);
                xVar.f7404i.setImageResource(R.drawable.onboard_sdk_results_status_ok);
                xVar.f7405j.setText(R.string.onboard_sdk_validation_front_id_scan_success);
            } else {
                xVar.f7402g.setBackgroundResource(R.drawable.onboard_sdk_bg_border_success);
                xVar.f7404i.setImageResource(R.drawable.onboard_sdk_results_status_ok);
                xVar.f7405j.setText(R.string.onboard_sdk_validation_front_id_scan_success);
                xVar2.hashCode();
                throw null;
            }
        }
        IdScan.ScanStep scanStep = IdScan.ScanStep.FRONT;
        x xVar3 = this.f11613e;
        if (xVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            xVar2 = xVar3;
        }
        ImageView imageView = xVar2.f7402g;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        c(idType, scanStep, imageView);
    }

    private final void c(x xVar, IdScan.IdType idType) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f11608i + 23;
        f11607h = i3 % 128;
        int i4 = i3 % 2;
        if (getMPresenter().getBackIdResult() != 0) {
            xVar.f7400e.setBackgroundResource(R.drawable.onboard_sdk_bg_border_fail);
            xVar.f7403h.setImageResource(R.drawable.onboard_sdk_results_status_fail);
            xVar.f7401f.setText(R.string.onboard_sdk_validation_back_id_scan_failure);
        } else {
            int i5 = f11607h + 55;
            f11608i = i5 % 128;
            int i6 = i5 % 2;
            xVar.f7400e.setBackgroundResource(R.drawable.onboard_sdk_bg_border_success);
            xVar.f7403h.setImageResource(R.drawable.onboard_sdk_results_status_ok);
            xVar.f7401f.setText(R.string.onboard_sdk_validation_back_id_scan_success);
        }
        IdScan.ScanStep scanStep = IdScan.ScanStep.BACK;
        ImageView imageView = xVar.f7400e;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        c(idType, scanStep, imageView);
    }

    private final void c(x xVar, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f11608i + 35;
        f11607h = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(xVar.f7400e, "");
            throw null;
        }
        ImageView imageView = xVar.f7400e;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        int i4 = 0;
        imageView.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = xVar.f7398c;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        LinearLayout linearLayout2 = linearLayout;
        if (z2) {
            int i5 = f11607h + 87;
            f11608i = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i4 = 8;
        }
        linearLayout2.setVisibility(i4);
        if (z2) {
            int i7 = f11608i + 125;
            f11607h = i7 % 128;
            int i8 = i7 % 2;
            xVar.f7400e.setPadding(a(), a(), a(), a());
            ViewGroup.LayoutParams layoutParams = xVar.f7398c.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(a(), a(), a(), a());
            xVar.f7398c.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ImageView imageView, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f11607h + 57;
        f11608i = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(imageView, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.LayoutParams) layoutParams2).width = i2;
        ((ViewGroup.LayoutParams) layoutParams2).height = i3;
        imageView.setLayoutParams(layoutParams2);
        int i7 = f11608i + 63;
        f11607h = i7 % 128;
        int i8 = i7 % 2;
    }

    private final void c(IdScan.IdType idType, IdScan.ScanStep scanStep, final ImageView imageView) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f11607h + 89;
        f11608i = i3 % 128;
        if (i3 % 2 != 0) {
            getMPresenter().getImageFile(idType, scanStep).exists();
            bitmapFromFile.hashCode();
            throw null;
        }
        File imageFile = getMPresenter().getImageFile(idType, scanStep);
        bitmapFromFile = imageFile.exists() ? BitmapUtils.getBitmapFromFile(imageFile) : null;
        if (bitmapFromFile == null) {
            int i4 = f11608i + 7;
            f11607h = i4 % 128;
            int i5 = i4 % 2;
            b(imageView);
            return;
        }
        if (bitmapFromFile.getHeight() > bitmapFromFile.getWidth()) {
            int i6 = f11608i + 85;
            f11607h = i6 % 128;
            int i7 = i6 % 2;
            bitmapFromFile = BitmapUtils.rotateBitmap(bitmapFromFile, 90.0f);
        }
        if (bitmapFromFile == null) {
            return;
        }
        float width = bitmapFromFile.getWidth() / bitmapFromFile.getHeight();
        int screenWidth = (getScreenWidth() - (((int) getResources().getDimension(R.dimen.onboard_sdk_photo_preview_margin_horizontal)) * 2)) - (a() * 2);
        if (width < 0.75f) {
            screenWidth = (int) (screenWidth * (width / 0.75f));
        }
        int i8 = (int) (screenWidth / width);
        final int iA = screenWidth + (a() * 2);
        final int iA2 = (a() * 2) + i8;
        Glide.with((FragmentActivity) this).load(bitmapFromFile).transform(new RoundedCorners(Math.max((int) (((int) getResources().getDimension(R.dimen.onboard_sdk_rounded_rectangle_inner_radius)) * (bitmapFromFile.getHeight() / i8)), 1))).into(imageView);
        imageView.post(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ReferredToExecutiveActivity.e(imageView, iA, iA2);
            }
        });
    }

    private final void b(ImageView imageView) {
        int i2 = 2 % 2;
        int i3 = f11607h + 39;
        f11608i = i3 % 128;
        int i4 = i3 % 2;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart((int) getResources().getDimension(R.dimen.onboard_sdk_photo_preview_margin_horizontal));
        layoutParams2.setMarginEnd((int) getResources().getDimension(R.dimen.onboard_sdk_photo_preview_margin_horizontal));
        imageView.setLayoutParams(layoutParams2);
        int i5 = f11607h + 91;
        f11608i = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, com.incode.welcome_sdk.ui.BaseView
    public final void closeScreen() {
        int i2 = 2 % 2;
        int i3 = f11608i + 101;
        f11607h = i3 % 128;
        if (i3 % 2 == 0) {
            finish();
            int i4 = 30 / 0;
        } else {
            finish();
        }
        int i5 = f11607h + 65;
        f11608i = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ReferredToExecutiveActivity referredToExecutiveActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(referredToExecutiveActivity, "");
        IncodeWelcome.Companion.getInstance().getIdProcessBus().onNext(new IdProcessResult(ResultCode.USER_CANCELLED, null, 2, null));
        referredToExecutiveActivity.finish();
        int i4 = f11608i + 77;
        f11607h = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f11607h + 41;
        f11608i = i3 % 128;
        if (i3 % 2 != 0) {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ReferredToExecutiveActivity.c(this.f$0, dialogInterface, i4);
                }
            });
            int i4 = 44 / 0;
        } else {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveActivity$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i42) {
                    ReferredToExecutiveActivity.c(this.f$0, dialogInterface, i42);
                }
            });
        }
        int i5 = f11608i + 99;
        f11607h = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11616b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11617e = 1;

        private Companion() {
        }

        @JvmStatic
        public final void startForResult(Activity activity) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            Intent intent = new Intent(activity, (Class<?>) ReferredToExecutiveActivity.class);
            CX.ud();
            activity.startActivityForResult(intent, 1);
            int i3 = f11617e + 25;
            f11616b = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f11610n + 77;
        f11609j = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final void startForResult(Activity activity) {
        int i2 = 2 % 2;
        int i3 = f11607h + 123;
        f11608i = i3 % 128;
        if (i3 % 2 != 0) {
            f11606c.startForResult(activity);
            int i4 = 9 / 0;
        } else {
            f11606c.startForResult(activity);
        }
        int i5 = f11608i + 19;
        f11607h = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
