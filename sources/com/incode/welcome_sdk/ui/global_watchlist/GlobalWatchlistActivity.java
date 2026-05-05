package com.incode.welcome_sdk.ui.global_watchlist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.d.o;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.e;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.GlobalWatchlistResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel;
import com.incode.welcome_sdk.views.IncodeFormItem;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import timber.log.Timber;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
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
public final class GlobalWatchlistActivity extends BaseActivity implements GlobalWatchlistContract.View {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f14369e = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f14370h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f14371i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f14372l = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f14373o = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o f14375c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Modules f14374b = Modules.WATCHLIST;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ScreenName f14376d = ScreenName.GLOBAL_WATCHLIST;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CompositeDisposable f14378g = new CompositeDisposable();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f14379j = LazyKt.lazy(new c());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f14377f = LazyKt.lazy(new b());

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(int r9, int r10, java.lang.Object[] r11, int r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.a(int, int, java.lang.Object[], int, int, int, int):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$j$--V, reason: not valid java name */
    public static /* synthetic */ void m8469instrumented$0$j$V(GlobalWatchlistActivity globalWatchlistActivity, o oVar, View view) {
        Callback.onClick_enter(view);
        try {
            b(globalWatchlistActivity, oVar, view);
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
            String strKd = Qg.kd("S@\u0006C'", (short) (C1633zX.Xd() ^ ((478607666 ^ 1904312148) ^ (-1829229738))), (short) (C1633zX.Xd() ^ ((1346042758 ^ 425335277) ^ (-1231065548))));
            String strVd = hg.Vd("G4", (short) (FB.Xd() ^ (1388789923 ^ 1388779307)), (short) (FB.Xd() ^ (144867817 ^ 144899207)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd = (short) (Od.Xd() ^ ((1624505318 ^ 1333268409) ^ (-799797810)));
                int[] iArr = new int["XE\u000bH,".length()];
                QB qb = new QB("XE\u000bH,");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strYd = C1561oA.yd("q]", (short) (C1633zX.Xd() ^ (855109431 ^ (-855093511))));
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("zi1pV", (short) (C1607wl.Xd() ^ (1578558333 ^ 1578557717)));
                    String strQd = Xg.qd("\u007fu", (short) (Od.Xd() ^ ((328874412 ^ 1153563903) ^ (-1465635850))), (short) (Od.Xd() ^ (1571864788 ^ (-1571863497))));
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
                        Method declaredMethod = Class.forName(Jg.Wd("K\u0014\u0019a~", (short) (OY.Xd() ^ ((1187030580 ^ 1103546567) ^ 117864107)), (short) (OY.Xd() ^ ((1644197035 ^ 1277826177) ^ 774528815)))).getDeclaredMethod(ZO.xd("\u00020", (short) (FB.Xd() ^ (1103248065 ^ 1103242294)), (short) (FB.Xd() ^ (1066754656 ^ 1066744496))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("\u0002w9dI8", (short) (C1499aX.Xd() ^ (882819813 ^ (-882808176))), (short) (C1499aX.Xd() ^ (114328761 ^ (-114335514))))};
                                Method method = Class.forName(Ig.wd("<seZL!6\u0016\u0018v\u001d;]rzK\u001cL\u0001M{4H", (short) (FB.Xd() ^ (448354903 ^ 448341842)))).getMethod(C1561oA.Qd("UR`>c\\\\LS8IUXJCD", (short) (FB.Xd() ^ ((1072747693 ^ 728354613) ^ 345573543))), Class.forName(EO.Od("c\tRVt\u0001CBfZ\u007fAnal\u0005", (short) (FB.Xd() ^ ((860490986 ^ 813107055) ^ 54358947)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("ZI\u0011P6", (short) (C1607wl.Xd() ^ ((1004608248 ^ 1096398892) ^ 2058928228)), (short) (C1607wl.Xd() ^ (1903857102 ^ 1903872501)));
                                    String strOd = C1561oA.od("xl", (short) (ZN.Xd() ^ ((1396525743 ^ 1389721912) ^ 32002534)));
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
                    short sXd2 = (short) (C1633zX.Xd() ^ ((1963386419 ^ 1346009743) ^ (-624739436)));
                    int[] iArr2 = new int["5$k+\u0011".length()];
                    QB qb2 = new QB("5$k+\u0011");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    String strZd2 = Wg.Zd("@\u0016", (short) (Od.Xd() ^ ((383576176 ^ 1189470613) ^ (-1345928763))), (short) (Od.Xd() ^ (759853891 ^ (-759838586))));
                    try {
                        Class<?> cls5 = Class.forName(str2);
                        Field field5 = 0 != 0 ? cls5.getField(strZd2) : cls5.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("m\\$cI", (short) (C1499aX.Xd() ^ ((2108840519 ^ 1234594985) ^ (-874805469))));
                        String strVd2 = Wg.vd("K?", (short) (C1633zX.Xd() ^ ((1420406869 ^ 254558825) ^ (-1535485365))));
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
                        int i4 = (1361791375 ^ 1895874338) ^ 539752166;
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

    public static final /* synthetic */ o access$getBinding$p(GlobalWatchlistActivity globalWatchlistActivity) {
        int i2 = 2 % 2;
        int i3 = f14371i + 121;
        f14370h = i3 % 128;
        int i4 = i3 % 2;
        o oVar = globalWatchlistActivity.f14375c;
        if (i4 != 0) {
            return oVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IncodeWelcomeRepository access$getRepo(GlobalWatchlistActivity globalWatchlistActivity) {
        int i2 = 2 % 2;
        int i3 = f14371i + 113;
        f14370h = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository repo = globalWatchlistActivity.getRepo();
        int i5 = f14371i + 101;
        f14370h = i5 % 128;
        int i6 = i5 % 2;
        return repo;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f14371i;
        int i4 = i3 + 73;
        f14370h = i4 % 128;
        int i5 = i4 % 2;
        Modules modules = this.f14374b;
        int i6 = i3 + 69;
        f14370h = i6 % 128;
        if (i6 % 2 != 0) {
            return modules;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f14370h + 35;
        int i4 = i3 % 128;
        f14371i = i4;
        int i5 = i3 % 2;
        ScreenName screenName = this.f14376d;
        int i6 = i4 + 55;
        f14370h = i6 % 128;
        if (i6 % 2 != 0) {
            return screenName;
        }
        throw null;
    }

    public final void setScreenName(ScreenName screenName) {
        int i2 = 2 % 2;
        int i3 = f14370h + 97;
        f14371i = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(screenName, "");
            this.f14376d = screenName;
            throw null;
        }
        Intrinsics.checkNotNullParameter(screenName, "");
        this.f14376d = screenName;
        int i4 = f14370h + 97;
        f14371i = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static final class c extends Lambda implements Function0<GlobalWatchlistPresenter> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14388d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14389e = 0;

        private GlobalWatchlistPresenter e() {
            int i2 = 2 % 2;
            GlobalWatchlistActivity globalWatchlistActivity = GlobalWatchlistActivity.this;
            GlobalWatchlistPresenter globalWatchlistPresenter = new GlobalWatchlistPresenter(globalWatchlistActivity, GlobalWatchlistActivity.access$getRepo(globalWatchlistActivity));
            int i3 = f14388d + 11;
            f14389e = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 93 / 0;
            }
            return globalWatchlistPresenter;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ GlobalWatchlistPresenter invoke() {
            int i2 = 2 % 2;
            int i3 = f14389e + 57;
            f14388d = i3 % 128;
            if (i3 % 2 != 0) {
                return e();
            }
            e();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        c() {
            super(0);
        }
    }

    private final GlobalWatchlistPresenter b() {
        int i2 = 2 % 2;
        int i3 = f14371i + 93;
        f14370h = i3 % 128;
        int i4 = i3 % 2;
        GlobalWatchlistPresenter globalWatchlistPresenter = (GlobalWatchlistPresenter) this.f14379j.getValue();
        if (i4 != 0) {
            return globalWatchlistPresenter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class b extends Lambda implements Function0<List<? extends IncodeFormItem>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14385a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14386b = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ List<? extends IncodeFormItem> invoke() {
            int i2 = 2 % 2;
            int i3 = f14385a + 49;
            f14386b = i3 % 128;
            int i4 = i3 % 2;
            List<IncodeFormItem> listA = a();
            int i5 = f14386b + 9;
            f14385a = i5 % 128;
            if (i5 % 2 != 0) {
                return listA;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private List<IncodeFormItem> a() {
            int i2 = 2 % 2;
            o oVarAccess$getBinding$p = GlobalWatchlistActivity.access$getBinding$p(GlobalWatchlistActivity.this);
            if (oVarAccess$getBinding$p == null) {
                int i3 = f14385a + 53;
                f14386b = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = f14386b + 35;
                f14385a = i5 % 128;
                int i6 = i5 % 2;
                oVarAccess$getBinding$p = null;
            }
            List<IncodeFormItem> listListOf = CollectionsKt.listOf((Object[]) new IncodeFormItem[]{oVarAccess$getBinding$p.f7297b, oVarAccess$getBinding$p.f7299d, oVarAccess$getBinding$p.f7298c, oVarAccess$getBinding$p.f7296a});
            int i7 = f14385a + 51;
            f14386b = i7 % 128;
            int i8 = i7 % 2;
            return listListOf;
        }

        b() {
            super(0);
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        GlobalWatchlistActivity globalWatchlistActivity = (GlobalWatchlistActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = f14370h + 67;
        f14371i = i3 % 128;
        int i4 = i3 % 2;
        List list = (List) globalWatchlistActivity.f14377f.getValue();
        int i5 = f14371i + 61;
        f14370h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return list;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f14370h + 99;
        f14371i = i3 % 128;
        o oVar = null;
        if (i3 % 2 != 0) {
            super.safeOnCreate(bundle);
            o oVarA = o.a(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(oVarA, "");
            this.f14375c = oVarA;
            oVar.hashCode();
            throw null;
        }
        super.safeOnCreate(bundle);
        o oVarA2 = o.a(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(oVarA2, "");
        this.f14375c = oVarA2;
        if (oVarA2 == null) {
            int i4 = f14371i + 19;
            f14370h = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = f14371i + 125;
            f14370h = i6 % 128;
            int i7 = i6 % 2;
        } else {
            oVar = oVarA2;
        }
        setContentView(oVar.e());
        d();
        int i8 = f14371i + 67;
        f14370h = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 11 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f14370h + 49;
        f14371i = i3 % 128;
        int i4 = i3 % 2;
        this.f14378g.clear();
        super.safeOnDestroy();
        int i5 = f14371i + 23;
        f14370h = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void publishUserCancelled() {
        int i2 = 2 % 2;
        super.publishUserCancelled();
        b().publishResult(new GlobalWatchlistResult(ResultCode.USER_CANCELLED));
        int i3 = f14371i + 23;
        f14370h = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract.View
    public final void hideForm() {
        int i2 = 2 % 2;
        int i3 = f14371i + 81;
        f14370h = i3 % 128;
        o oVar = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        o oVar2 = this.f14375c;
        if (oVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f14371i + 31;
            f14370h = i4 % 128;
            int i5 = i4 % 2;
        } else {
            oVar = oVar2;
        }
        Group group = oVar.f7302g;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(8);
        EventUtils.sendScreenClosed(getRepo(), ScreenName.GLOBAL_WATCHLIST_INPUT, Modules.WATCHLIST);
    }

    @Override // com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract.View
    public final void showProcessing() {
        int i2 = 2 % 2;
        o oVar = this.f14375c;
        if (oVar == null) {
            int i3 = f14371i + 83;
            f14370h = i3 % 128;
            oVar = null;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 21 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        }
        Group group = oVar.f7303h;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        oVar.f7301f.setText(getString(R.string.onboard_sdk_processing));
        EventUtils.sendScreenOpened(getRepo(), ScreenName.GLOBAL_WATCHLIST_PROGRESS, Modules.WATCHLIST);
        int i5 = f14371i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14370h = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract.View
    public final void hideProcessing() {
        int i2 = 2 % 2;
        int i3 = f14370h + 71;
        f14371i = i3 % 128;
        int i4 = i3 % 2;
        o oVar = this.f14375c;
        Object obj = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            oVar = null;
        }
        Group group = oVar.f7303h;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(8);
        EventUtils.sendScreenClosed(getRepo(), ScreenName.GLOBAL_WATCHLIST_PROGRESS, Modules.WATCHLIST);
        int i5 = f14370h + 71;
        f14371i = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract.View
    public final void showResult(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        o oVar = this.f14375c;
        if (oVar == null) {
            int i4 = f14370h + 115;
            f14371i = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            oVar = null;
        }
        Group group = oVar.f7305j;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        ImageView imageView = oVar.f7304i;
        if (z2) {
            int i6 = f14371i + 23;
            f14370h = i6 % 128;
            if (i6 % 2 == 0) {
                i2 = R.drawable.onboard_sdk_ic_success;
                int i7 = 37 / 0;
            } else {
                i2 = R.drawable.onboard_sdk_ic_success;
            }
        } else {
            i2 = R.drawable.onboard_sdk_ic_failure;
        }
        imageView.setImageResource(i2);
        oVar.f7301f.setText(getString(!z2 ? R.string.onboard_sdk_global_watchlist_something_went_wrong : R.string.onboard_sdk_success));
        setScreenName(z2 ? ScreenName.GLOBAL_WATCHLIST_SUCCEEDED : ScreenName.GLOBAL_WATCHLIST_FAILED);
        EventUtils.sendScreenOpened(getRepo(), getScreenName(), Modules.WATCHLIST);
    }

    @Override // com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistContract.View
    public final void hideResult() {
        int i2 = 2 % 2;
        int i3 = f14371i + 117;
        f14370h = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        o oVar = this.f14375c;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            oVar = null;
        }
        Group group = oVar.f7305j;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(8);
        EventUtils.sendScreenClosed(getRepo(), getScreenName(), Modules.WATCHLIST);
        int i4 = f14370h + 9;
        f14371i = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void d() {
        int i2 = 2 % 2;
        if (!i()) {
            int iD = IdCaptureViewModel.ai.d();
            int iD2 = IdCaptureViewModel.ai.d();
            a(IdCaptureViewModel.ai.d(), iD2, new Object[]{this}, IdCaptureViewModel.ai.d(), iD, 1601426974, -1601426974);
            int i3 = f14370h + 9;
            f14371i = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = f14370h + 41;
        f14371i = i5 % 128;
        int i6 = i5 % 2;
        int iD3 = IdCaptureViewModel.ai.d();
        int iD4 = IdCaptureViewModel.ai.d();
        a(IdCaptureViewModel.ai.d(), iD4, new Object[]{this}, IdCaptureViewModel.ai.d(), iD3, 1409817485, -1409817484);
        j();
        int i7 = f14371i + 47;
        f14370h = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static Integer b(String str) {
        int i2 = 2 % 2;
        Integer numValueOf = null;
        try {
            String str2 = (String) CollectionsKt.getOrNull(StringsKt.split$default((CharSequence) str, new String[]{Global.HYPHEN}, false, 0, 6, (Object) null), 0);
            if (str2 != null) {
                int i3 = f14370h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f14371i = i3 % 128;
                int i4 = i3 % 2;
                numValueOf = Integer.valueOf(Integer.parseInt(str2));
            }
        } catch (NumberFormatException unused) {
        }
        int i5 = f14371i + 73;
        f14370h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return numValueOf;
    }

    private static final void b(GlobalWatchlistActivity globalWatchlistActivity, o oVar, View view) {
        int i2 = 2 % 2;
        int i3 = f14370h + 21;
        f14371i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(globalWatchlistActivity, "");
        Intrinsics.checkNotNullParameter(oVar, "");
        if (!globalWatchlistActivity.h()) {
            globalWatchlistActivity.f();
            int i5 = f14370h + 103;
            f14371i = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = f14370h + 37;
        f14371i = i7 % 128;
        int i8 = i7 % 2;
        globalWatchlistActivity.a(oVar.f7297b.getText(), oVar.f7299d.getText(), b(oVar.f7296a.getText()), oVar.f7298c.getSpinnerSelectedItemKey());
        Intrinsics.checkNotNull(view);
        ViewExtensionsKt.hideKeyboard(view);
    }

    private final void j() {
        int i2 = 2 % 2;
        int i3 = f14370h + 15;
        f14371i = i3 % 128;
        int i4 = i3 % 2;
        final o oVar = this.f14375c;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            oVar = null;
        }
        oVar.f7300e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GlobalWatchlistActivity.m8469instrumented$0$j$V(this.f$0, oVar, view);
            }
        });
        int i5 = f14370h + 77;
        f14371i = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r2.length() == 0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean i() {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r6.getRepo()
            java.lang.String r0 = r0.getFirstName()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L17
            int r0 = r0.length()
            if (r0 != 0) goto L74
        L17:
            r0 = r3
        L18:
            if (r0 == r3) goto L1b
        L1a:
            return r4
        L1b:
            int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14371i
            int r1 = r0 + 97
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14370h = r0
            int r1 = r1 % r5
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r6.getRepo()
            java.lang.String r2 = r0.getLastName()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L3f
            int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14371i
            int r1 = r0 + 21
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14370h = r0
            int r1 = r1 % r5
            int r0 = r2.length()
            if (r0 != 0) goto L1a
        L3f:
            int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14370h
            int r1 = r0 + 111
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14371i = r0
            int r1 = r1 % r5
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r0 = r6.getRepo()
            java.lang.String r2 = r0.getBirthDate()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L63
            int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14371i
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14370h = r0
            int r1 = r1 % r5
            int r0 = r2.length()
            if (r0 != 0) goto L1a
        L63:
            int r2 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14371i
            int r1 = r2 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14370h = r0
            int r1 = r1 % r5
            int r1 = r2 + 19
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14370h = r0
            int r1 = r1 % r5
            return r3
        L74:
            r0 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.i():boolean");
    }

    private static /* synthetic */ void c(GlobalWatchlistActivity globalWatchlistActivity, String str, String str2, Integer num) {
        int i2 = 2 % 2;
        int i3 = f14371i + 123;
        f14370h = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        globalWatchlistActivity.a(str, str2, num, (String) null);
        int i5 = f14371i + 57;
        f14370h = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void a(String str, String str2, Integer num, String str3) {
        int i2 = 2 % 2;
        b().submitWatchlist(new GlobalWatchlistModel(str, str2, num, str3));
        int i3 = f14370h + 31;
        f14371i = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void e(o oVar) {
        int i2 = 2 % 2;
        int i3 = f14371i + 95;
        f14370h = i3 % 128;
        if (i3 % 2 != 0) {
            oVar.f7297b.setFieldType(IncodeFormItem.a.f18153e);
            oVar.f7299d.setFieldType(IncodeFormItem.a.f18153e);
            oVar.f7298c.setFieldType(IncodeFormItem.a.f18160m);
        } else {
            oVar.f7297b.setFieldType(IncodeFormItem.a.f18153e);
            oVar.f7299d.setFieldType(IncodeFormItem.a.f18153e);
            oVar.f7298c.setFieldType(IncodeFormItem.a.f18160m);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(GlobalWatchlistActivity globalWatchlistActivity) throws IOException {
        int i2 = 2 % 2;
        int i3 = f14371i + 111;
        f14370h = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(globalWatchlistActivity, "");
            e eVar = e.f8575b;
            e.a(globalWatchlistActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(globalWatchlistActivity, "");
        e eVar2 = e.f8575b;
        List<com.incode.welcome_sdk.data.local.a> listA = e.a(globalWatchlistActivity);
        int i4 = f14370h + 25;
        f14371i = i4 % 128;
        int i5 = i4 % 2;
        return listA;
    }

    static final class a extends Lambda implements Function1<List<? extends com.incode.welcome_sdk.data.local.a>, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14382b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14383c = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(List<? extends com.incode.welcome_sdk.data.local.a> list) {
            int i2 = 2 % 2;
            int i3 = f14382b + 21;
            f14383c = i3 % 128;
            int i4 = i3 % 2;
            e(list);
            Unit unit = Unit.INSTANCE;
            int i5 = f14382b + 17;
            f14383c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 88 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(java.util.List<com.incode.welcome_sdk.data.local.a> r18) {
            /*
                r17 = this;
                r6 = r18
                r9 = 2
                int r0 = r9 % r9
                int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.a.f14382b
                int r1 = r0 + 9
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.a.f14383c = r0
                int r1 = r1 % r9
                r5 = 0
                java.lang.String r3 = ""
                r4 = r17
                if (r1 == 0) goto L6b
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.this
                com.incode.welcome_sdk.d.o r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.access$getBinding$p(r0)
                r1 = 56
                int r1 = r1 / r5
                if (r0 != 0) goto L2f
            L20:
                int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.a.f14383c
                int r1 = r0 + 19
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.a.f14382b = r0
                int r1 = r1 % r9
                r0 = 0
                if (r1 == 0) goto Lc3
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L2f:
                com.incode.welcome_sdk.views.IncodeFormItem r10 = r0.f7298c
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r8 = new java.util.ArrayList
                r7 = 10
                int r0 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r7)
                r8.<init>(r0)
                java.util.Collection r8 = (java.util.Collection) r8
                java.util.Iterator r2 = r6.iterator()
            L4a:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L74
                java.lang.Object r0 = r2.next()
                com.incode.welcome_sdk.data.local.a r0 = (com.incode.welcome_sdk.data.local.a) r0
                java.lang.String r0 = r0.b()
                r8.add(r0)
                int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.a.f14383c
                int r1 = r0 + 71
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.a.f14382b = r0
                int r1 = r1 % r9
                if (r1 != 0) goto L4a
                r0 = 3
                int r0 = r0 % r9
                goto L4a
            L6b:
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.this
                com.incode.welcome_sdk.d.o r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.access$getBinding$p(r0)
                if (r0 != 0) goto L2f
                goto L20
            L74:
                java.util.List r8 = (java.util.List) r8
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.String[] r0 = new java.lang.String[r5]
                java.lang.Object[] r11 = r8.toArray(r0)
                java.lang.String[] r11 = (java.lang.String[]) r11
                java.util.ArrayList r2 = new java.util.ArrayList
                int r0 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r7)
                r2.<init>(r0)
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.Iterator r1 = r6.iterator()
            L8f:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto La3
                java.lang.Object r0 = r1.next()
                com.incode.welcome_sdk.data.local.a r0 = (com.incode.welcome_sdk.data.local.a) r0
                java.lang.String r0 = r0.d()
                r2.add(r0)
                goto L8f
            La3:
                java.util.List r2 = (java.util.List) r2
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.String[] r0 = new java.lang.String[r5]
                java.lang.Object[] r12 = r2.toArray(r0)
                java.lang.String[] r12 = (java.lang.String[]) r12
                com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity r1 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.this
                int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_global_watchlist_country_form_title
                java.lang.String r13 = r1.getString(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r3)
                r15 = 8
                r16 = 0
                r14 = 0
                com.incode.welcome_sdk.views.IncodeFormItem.useAsSelector$default(r10, r11, r12, r13, r14, r15, r16)
                return
            Lc3:
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.a.e(java.util.List):void");
        }

        a() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14371i + 35;
        f14370h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f14371i + 31;
        f14370h = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14391b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14392d = 1;

        private void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14391b + 47;
            f14392d = i3 % 128;
            int i4 = i3 % 2;
            ((Timber.Forest) this.receiver).e(th);
            int i5 = f14392d + 123;
            f14391b = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f14392d + 21;
            f14391b = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f14391b + 27;
            f14392d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        d(Object obj) {
            super(1, obj, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f14371i + 63;
        f14370h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f14371i + 117;
        f14370h = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final void g() {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f14378g;
        Single singleObserveOn = Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return GlobalWatchlistActivity.a(this.f$0);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final a aVar = new a();
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GlobalWatchlistActivity.a(aVar, obj);
            }
        };
        final d dVar = new d(Timber.Forest);
        compositeDisposable.add(singleObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GlobalWatchlistActivity.e(dVar, obj);
            }
        }));
        int i3 = f14370h + 35;
        f14371i = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 59 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean h() {
        /*
            r13 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14371i
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14370h = r0
            int r1 = r1 % r5
            java.lang.Object[] r8 = new java.lang.Object[]{r13}
            int r10 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.d()
            int r7 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.d()
            int r6 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.d()
            int r9 = com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel.ai.d()
            r11 = -4502414(0xffffffffffbb4c72, float:NaN)
            r12 = 4502416(0x44b390, float:6.309229E-39)
            java.lang.Object r2 = a(r6, r7, r8, r9, r10, r11, r12)
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r0 = r2 instanceof java.util.Collection
            r4 = 0
            r3 = 1
            if (r0 == r3) goto L67
        L34:
            java.util.Iterator r2 = r2.iterator()
            int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14371i
            int r1 = r0 + 37
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14370h = r0
            int r1 = r1 % r5
        L41:
            boolean r0 = r2.hasNext()
            r0 = r0 ^ r3
            if (r0 == r3) goto L89
            int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14371i
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14370h = r0
            int r1 = r1 % r5
            java.lang.Object r0 = r2.next()
            com.incode.welcome_sdk.views.IncodeFormItem r0 = (com.incode.welcome_sdk.views.IncodeFormItem) r0
            boolean r0 = r0.isValidString()
            if (r0 != 0) goto L41
            int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14371i
            int r1 = r0 + 21
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14370h = r0
            int r1 = r1 % r5
            return r4
        L67:
            int r0 = com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14371i
            int r1 = r0 + 59
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.f14370h = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L7f
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r1 = r0.isEmpty()
            r0 = 47
            int r0 = r0 / r4
            if (r1 != 0) goto L89
            goto L34
        L7f:
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L89
            goto L34
        L89:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistActivity.h():boolean");
    }

    private final void f() {
        int i2 = 2 % 2;
        int i3 = f14370h + 99;
        f14371i = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            int iD = IdCaptureViewModel.ai.d();
            int iD2 = IdCaptureViewModel.ai.d();
            Iterator it = ((List) a(IdCaptureViewModel.ai.d(), iD2, new Object[]{this}, IdCaptureViewModel.ai.d(), iD, -4502414, 4502416)).iterator();
            while (it.hasNext()) {
                int i4 = f14370h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f14371i = i4 % 128;
                if (i4 % 2 != 0) {
                    ((IncodeFormItem) it.next()).isValidString();
                    obj.hashCode();
                    throw null;
                }
                IncodeFormItem incodeFormItem = (IncodeFormItem) it.next();
                if (incodeFormItem.isValidString()) {
                    incodeFormItem.removeError();
                } else {
                    Intrinsics.checkNotNull(incodeFormItem);
                    IncodeFormItem.showErrorMessage$default(incodeFormItem, null, 1, null);
                }
            }
            return;
        }
        int iD3 = IdCaptureViewModel.ai.d();
        int iD4 = IdCaptureViewModel.ai.d();
        ((List) a(IdCaptureViewModel.ai.d(), iD4, new Object[]{this}, IdCaptureViewModel.ai.d(), iD3, -4502414, 4502416)).iterator();
        throw null;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14380b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14381c = 1;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) GlobalWatchlistActivity.class);
            CX.ud();
            context.startActivity(intent);
            int i3 = f14380b + 9;
            f14381c = i3 % 128;
            int i4 = i3 % 2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f14372l + 85;
        f14373o = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context) {
        int i2 = 2 % 2;
        int i3 = f14370h + 99;
        f14371i = i3 % 128;
        int i4 = i3 % 2;
        f14369e.start(context);
        int i5 = f14371i + 69;
        f14370h = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final void c() {
        int iD = IdCaptureViewModel.ai.d();
        int iD2 = IdCaptureViewModel.ai.d();
        a(IdCaptureViewModel.ai.d(), iD2, new Object[]{this}, IdCaptureViewModel.ai.d(), iD, 1601426974, -1601426974);
    }

    private final void e() {
        int iD = IdCaptureViewModel.ai.d();
        int iD2 = IdCaptureViewModel.ai.d();
        a(IdCaptureViewModel.ai.d(), iD2, new Object[]{this}, IdCaptureViewModel.ai.d(), iD, 1409817485, -1409817484);
    }

    private final List<IncodeFormItem> a() {
        int iD = IdCaptureViewModel.ai.d();
        int iD2 = IdCaptureViewModel.ai.d();
        return (List) a(IdCaptureViewModel.ai.d(), iD2, new Object[]{this}, IdCaptureViewModel.ai.d(), iD, -4502414, 4502416);
    }
}
