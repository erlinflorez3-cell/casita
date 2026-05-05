package com.incode.welcome_sdk.ui.custom_watchlist;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.d.g;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.CustomWatchlistResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistContract;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
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
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomWatchlistActivity extends BaseActivity implements CustomWatchlistContract.View {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f13161e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f13162g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f13163h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f13164j = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f13165m = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f13167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Inject
    public CustomWatchlistPresenter f13168d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CompositeDisposable f13166b = new CompositeDisposable();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScreenName f13170i = ScreenName.CUSTOM_WATCHLIST;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Modules f13169f = Modules.INCODE_WATCHLIST;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("7$i'\u000b", (short) (C1499aX.Xd() ^ (1468139250 ^ (-1468154638))), (short) (C1499aX.Xd() ^ ((2033785180 ^ 798427501) ^ (-1454265094))));
            String strVd = hg.Vd("L9", (short) (Od.Xd() ^ ((953173573 ^ 1593245059) ^ (-1713829700))), (short) (Od.Xd() ^ (1276759251 ^ (-1276752508))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("*\u0017\\\u001a}", (short) (ZN.Xd() ^ (1438114601 ^ 1438097677)));
                String strYd = C1561oA.yd("A-", (short) (C1580rY.Xd() ^ (344102865 ^ (-344127123))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("ra)hN", (short) (ZN.Xd() ^ (740536326 ^ 740548796)));
                    String strQd = Xg.qd("'\u001d", (short) (C1580rY.Xd() ^ (2128469173 ^ (-2128465901))), (short) (C1580rY.Xd() ^ ((1273372989 ^ 873602542) ^ (-2146702958))));
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
                        Method declaredMethod = Class.forName(Jg.Wd("\u007flU\u001a\u001d", (short) (OY.Xd() ^ ((375021243 ^ 1494597768) ^ 1330622563)), (short) (OY.Xd() ^ (611061647 ^ 611058591)))).getDeclaredMethod(ZO.xd("s\u0010", (short) (ZN.Xd() ^ ((1086281406 ^ 958497482) ^ 2040445431)), (short) (ZN.Xd() ^ (272197314 ^ 272174122))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("L4'w]g", (short) (FB.Xd() ^ ((33927933 ^ 1719786961) ^ 1686387908)), (short) (FB.Xd() ^ ((225213408 ^ 737977296) ^ 647013268)))};
                                Method method = Class.forName(Ig.wd("G\u0004,VDh\u0004uc`]Ejmo\u0010G\u0012IC\\L2", (short) (C1580rY.Xd() ^ ((1726780855 ^ 1556237614) ^ (-976152604))))).getMethod(C1561oA.Qd("pm{Y~wwgnSdpse^_", (short) (C1607wl.Xd() ^ ((446706834 ^ 2064484903) ^ 1638789420))), Class.forName(EO.Od("\u00184y\nAM$\u0003;3T\u0016?6e\u0002", (short) (C1580rY.Xd() ^ ((396718709 ^ 690686922) ^ (-1049519926))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("\u001e\rT\u0014y", (short) (Od.Xd() ^ ((527216143 ^ 1118685288) ^ (-1572937574))), (short) (Od.Xd() ^ ((1621208017 ^ 66958402) ^ (-1666999199))));
                                    String strOd = C1561oA.od("2&", (short) (C1499aX.Xd() ^ (1417968379 ^ (-1417940576))));
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
                    String strKd2 = C1561oA.Kd("K:\u0002A'", (short) (C1633zX.Xd() ^ (1868707433 ^ (-1868713969))));
                    String strZd2 = Wg.Zd("E/", (short) (C1499aX.Xd() ^ ((714245947 ^ 1543569253) ^ (-1989294740))), (short) (C1499aX.Xd() ^ (830458335 ^ (-830468271))));
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
                        String strXd = C1561oA.Xd("~m5tZ", (short) (ZN.Xd() ^ (1714160734 ^ 1714190279)));
                        String strVd2 = Wg.vd("A5", (short) (C1607wl.Xd() ^ (1543696279 ^ 1543692203)));
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
                        int i2 = (199705173 ^ 297057438) ^ 441712256;
                        if (x2 > i2 && x2 < displayMetrics.widthPixels - i2 && y2 > i2 && y2 < displayMetrics.heightPixels - i2) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static final class Companion {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13171c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13172e = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) CustomWatchlistActivity.class);
            CX.ud();
            context.startActivity(intent);
            int i3 = f13171c + 67;
            f13172e = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 86 / 0;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final CustomWatchlistPresenter getPresenter() {
        int i2 = 2 % 2;
        int i3 = f13164j + 109;
        f13163h = i3 % 128;
        int i4 = i3 % 2;
        CustomWatchlistPresenter customWatchlistPresenter = this.f13168d;
        if (customWatchlistPresenter != null) {
            return customWatchlistPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = f13163h + 57;
        f13164j = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void setPresenter(CustomWatchlistPresenter customWatchlistPresenter) {
        int i2 = 2 % 2;
        int i3 = f13164j + 37;
        f13163h = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(customWatchlistPresenter, "");
            this.f13168d = customWatchlistPresenter;
        } else {
            Intrinsics.checkNotNullParameter(customWatchlistPresenter, "");
            this.f13168d = customWatchlistPresenter;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f13163h;
        int i4 = i3 + 19;
        f13164j = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f13170i;
        int i6 = i3 + 123;
        f13164j = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f13164j + 25;
        int i4 = i3 % 128;
        f13163h = i4;
        int i5 = i3 % 2;
        Modules modules = this.f13169f;
        int i6 = i4 + 51;
        f13164j = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 14 / 0;
        }
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f13163h + 61;
        f13164j = i3 % 128;
        g gVar = null;
        if (i3 % 2 != 0) {
            super.safeOnCreate(bundle);
            g gVarB = g.b(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(gVarB, "");
            this.f13167c = gVarB;
            if (gVarB == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = f13164j + 103;
                f13163h = i4 % 128;
                int i5 = i4 % 2;
                gVarB = null;
            }
            setContentView(gVarB.e());
            DaggerCustomWatchlistComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent()).customWatchlistPresenterModule(new CustomWatchlistPresenterModule(this)).build().inject(this);
            g gVar2 = this.f13167c;
            if (gVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                gVar2 = null;
            }
            gVar2.f7212b.setImageResource(R.drawable.onboard_sdk_ic_progress);
            g gVar3 = this.f13167c;
            if (gVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                gVar = gVar3;
            }
            gVar.f7213c.setText(getString(R.string.onboard_sdk_custom_watchlist_uploading_information));
            c();
            getPresenter().processCustomWatchlist();
            return;
        }
        super.safeOnCreate(bundle);
        g gVarB2 = g.b(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(gVarB2, "");
        this.f13167c = gVarB2;
        gVar.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f13164j + 101;
        f13163h = i3 % 128;
        int i4 = i3 % 2;
        this.f13166b.clear();
        super.safeOnDestroy();
        int i5 = f13163h + 3;
        f13164j = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final boolean isScreenCloseable() {
        int i2 = 2 % 2;
        int i3 = f13164j + 41;
        int i4 = i3 % 128;
        f13163h = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 9;
        f13164j = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(CustomWatchlistActivity customWatchlistActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(customWatchlistActivity, "");
        customWatchlistActivity.getPresenter().publishResult(new CustomWatchlistResult(ResultCode.USER_CANCELLED, false, 2, null));
        int i4 = f13163h + 61;
        f13164j = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f13164j + 59;
        f13163h = i3 % 128;
        if (i3 % 2 == 0) {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistActivity$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    CustomWatchlistActivity.c(this.f$0, dialogInterface, i4);
                }
            });
            return;
        }
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                CustomWatchlistActivity.c(this.f$0, dialogInterface, i4);
            }
        });
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void c() {
        int i2 = 2 % 2;
        EventUtils.sendScreenOpened(getRepo(), ScreenName.INCODE_WATCHLIST_VALIDATION_PROGRESS, Modules.INCODE_WATCHLIST);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.onboard_sdk_rotate);
        animationLoadAnimation.setFillAfter(true);
        animationLoadAnimation.setInterpolator(new LinearInterpolator());
        g gVar = this.f13167c;
        if (gVar == null) {
            int i3 = f13164j + 107;
            f13163h = i3 % 128;
            gVar = null;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                gVar.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f13164j + 109;
            f13163h = i4 % 128;
            int i5 = i4 % 2;
        }
        gVar.f7212b.startAnimation(animationLoadAnimation);
    }

    private final void d() {
        int i2 = 2 % 2;
        EventUtils.sendScreenClosed(getRepo(), ScreenName.INCODE_WATCHLIST_VALIDATION_PROGRESS, Modules.INCODE_WATCHLIST);
        g gVar = this.f13167c;
        if (gVar == null) {
            int i3 = f13164j + 93;
            f13163h = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f13163h + 125;
            f13164j = i5 % 128;
            int i6 = i5 % 2;
            gVar = null;
        }
        gVar.f7212b.clearAnimation();
    }

    static final class c extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13173a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13174c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ CustomWatchlistResult f13175b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f13174c + 99;
            f13173a = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f13173a + 81;
            f13174c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void c() {
            int i2 = 2 % 2;
            int i3 = f13174c + 49;
            f13173a = i3 % 128;
            if (i3 % 2 != 0) {
                CustomWatchlistActivity.this.getPresenter().publishResult(this.f13175b);
                int i4 = f13174c + 113;
                f13173a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 39 / 0;
                    return;
                }
                return;
            }
            CustomWatchlistActivity.this.getPresenter().publishResult(this.f13175b);
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CustomWatchlistResult customWatchlistResult) {
            super(1);
            this.f13175b = customWatchlistResult;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f13164j + 115;
        f13163h = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f13164j + 57;
        f13163h = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistContract.View
    public final void onCustomWatchlistProcessed(CustomWatchlistResult customWatchlistResult) {
        int i2;
        Event event;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(customWatchlistResult, "");
        d();
        g gVar = this.f13167c;
        g gVar2 = null;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            gVar = null;
        }
        ImageView imageView = gVar.f7212b;
        if (customWatchlistResult.getSuccess()) {
            i2 = R.drawable.onboard_sdk_ic_success;
        } else {
            i2 = R.drawable.onboard_sdk_ic_failure;
            int i4 = f13164j + 95;
            f13163h = i4 % 128;
            int i5 = i4 % 2;
        }
        imageView.setImageResource(i2);
        g gVar3 = this.f13167c;
        if (gVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = f13163h + 115;
            f13164j = i6 % 128;
            int i7 = i6 % 2;
        } else {
            gVar2 = gVar3;
        }
        gVar2.f7213c.setText(!(customWatchlistResult.getSuccess() ^ true) ? getString(R.string.onboard_sdk_custom_watchlist_result_success) : getString(R.string.onboard_sdk_custom_watchlist_result_fail));
        if (customWatchlistResult.getSuccess()) {
            int i8 = f13164j + 115;
            f13163h = i8 % 128;
            int i9 = i8 % 2;
            event = Event.INCODE_WATCHLIST_VALIDATION_SUCCEEDED;
        } else {
            event = Event.INCODE_WATCHLIST_VALIDATION_FAILED;
        }
        EventUtils.sendEvent(getRepo(), event, getModule(), getScreenName());
        CompositeDisposable compositeDisposable = this.f13166b;
        Observable<Long> observableTimer = Observable.timer(2L, TimeUnit.SECONDS);
        final c cVar = new c(customWatchlistResult);
        compositeDisposable.add(observableTimer.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistActivity$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CustomWatchlistActivity.b(cVar, obj);
            }
        }));
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f13161e = new Companion(defaultConstructorMarker);
        int i2 = f13165m + 13;
        f13162g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @JvmStatic
    public static final void start(Context context) {
        int i2 = 2 % 2;
        int i3 = f13163h + 85;
        f13164j = i3 % 128;
        if (i3 % 2 == 0) {
            f13161e.start(context);
            int i4 = 75 / 0;
        } else {
            f13161e.start(context);
        }
        int i5 = f13164j + 107;
        f13163h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
    }
}
