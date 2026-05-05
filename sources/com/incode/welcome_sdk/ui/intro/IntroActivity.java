package com.incode.welcome_sdk.ui.intro;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.ui.checkbox.CheckboxRecyclerViewAdapter;
import com.incode.welcome_sdk.commons.ui.checkbox.CheckboxRecyclerViewClickListener;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.d.s;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.modules.IntroChecks;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.views.IncodeButton;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
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

/* JADX INFO: loaded from: classes5.dex */
public final class IntroActivity extends BaseActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f16366e = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f16367i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f16368j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f16369k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f16370l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean[] f16372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s f16373d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16374f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScreenName f16376h = ScreenName.INTRO;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Modules f16375g = Modules.INTRO;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8505instrumented$1$safeOnCreate$LandroidosBundleV(IntroActivity introActivity, View view) {
        Callback.onClick_enter(view);
        try {
            e(introActivity, view);
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
            String strKd = Qg.kd("\fx>{_", (short) (ZN.Xd() ^ (1159109836 ^ 1159110213)), (short) (ZN.Xd() ^ (897565687 ^ 897554345)));
            short sXd = (short) (C1499aX.Xd() ^ (1743540423 ^ (-1743544897)));
            short sXd2 = (short) (C1499aX.Xd() ^ ((745925485 ^ 546916246) ^ (-216831026)));
            int[] iArr = new int["\u001c\t".length()];
            QB qb = new QB("\u001c\t");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("+\u0018]\u001b~", (short) (ZN.Xd() ^ ((1183580613 ^ 853570374) ^ 1953249190)));
                short sXd3 = (short) (FB.Xd() ^ (307655524 ^ 307628969));
                int[] iArr2 = new int["&\u0014".length()];
                QB qb2 = new QB("&\u0014");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(str2) : cls2.getDeclaredField(str2);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd = C1561oA.Yd("&\u0015\\\u001c\u0002", (short) (C1499aX.Xd() ^ (244975858 ^ (-245005297))));
                    String strQd = Xg.qd("\u0003x", (short) (C1499aX.Xd() ^ ((1794668732 ^ 2135751983) ^ (-364174448))), (short) (C1499aX.Xd() ^ ((394180459 ^ 1349289709) ^ (-1192383684))));
                    try {
                        Class<?> cls3 = Class.forName(strYd);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd4 = (short) (Od.Xd() ^ (1931428349 ^ (-1931412948)));
                        short sXd5 = (short) (Od.Xd() ^ (62345200 ^ (-62332996)));
                        int[] iArr3 = new int["]\\4\u0010:".length()];
                        QB qb3 = new QB("]\\4\u0010:");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd5) ^ sXd4));
                            i4++;
                        }
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(new String(iArr3, 0, i4)).getDeclaredMethod(ZO.xd("A9", (short) (OY.Xd() ^ (1496993479 ^ 1497002068)), (short) (OY.Xd() ^ (1110255228 ^ 1110249900))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("\n\u0001J\u0015@@", (short) (Od.Xd() ^ ((1969246437 ^ 1392022033) ^ (-664316979))), (short) (Od.Xd() ^ (1918910629 ^ (-1918917226))));
                                Class<?> cls4 = Class.forName(Ig.wd("M#7h=\u0003ev\n%.J\r\u0014\u001alMkR,Z%\u0007", (short) (C1580rY.Xd() ^ ((181394918 ^ 668943077) ^ (-756057556)))));
                                Class<?>[] clsArr = new Class[1];
                                short sXd6 = (short) (FB.Xd() ^ ((1436008621 ^ 928743564) ^ 1657552861));
                                int[] iArr4 = new int["\tPgyUi2\u001f[E`(unc\u0002".length()];
                                QB qb4 = new QB("\tPgyUi2\u001f[E`(unc\u0002");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + i5)) + xuXd4.CK(iKK4));
                                    i5++;
                                }
                                clsArr[0] = Class.forName(new String(iArr4, 0, i5));
                                Object[] objArr2 = {strUd2};
                                Method method = cls4.getMethod(C1561oA.Qd("TQ_=b[[KR7HTWIBC", (short) (C1499aX.Xd() ^ (1536808111 ^ (-1536801793)))), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd7 = (short) (Od.Xd() ^ ((746220150 ^ 1169266093) ^ (-1774953724)));
                                    short sXd8 = (short) (Od.Xd() ^ ((1870051892 ^ 1551381701) ^ (-856616513)));
                                    int[] iArr5 = new int["\u0017\u0006M\rr".length()];
                                    QB qb5 = new QB("\u0017\u0006M\rr");
                                    int i6 = 0;
                                    while (qb5.YK()) {
                                        int iKK5 = qb5.KK();
                                        Xu xuXd5 = Xu.Xd(iKK5);
                                        iArr5[i6] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd7 + i6)) - sXd8);
                                        i6++;
                                    }
                                    String str3 = new String(iArr5, 0, i6);
                                    String strOd = C1561oA.od("\u0005x", (short) (ZN.Xd() ^ (1363470621 ^ 1363454426)));
                                    try {
                                        Class<?> cls5 = Class.forName(str3);
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
                    short sXd9 = (short) (ZN.Xd() ^ ((2018699980 ^ 840168889) ^ 1245776642));
                    int[] iArr6 = new int["3\"i)\u000f".length()];
                    QB qb6 = new QB("3\"i)\u000f");
                    int i7 = 0;
                    while (qb6.YK()) {
                        int iKK6 = qb6.KK();
                        Xu xuXd6 = Xu.Xd(iKK6);
                        iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - ((sXd9 + sXd9) + i7));
                        i7++;
                    }
                    String str4 = new String(iArr6, 0, i7);
                    String strZd = Wg.Zd("\u001b3", (short) (C1580rY.Xd() ^ (186214278 ^ (-186214841))), (short) (C1580rY.Xd() ^ (1604485506 ^ (-1604494696))));
                    try {
                        Class<?> cls6 = Class.forName(str4);
                        Field field5 = 0 != 0 ? cls6.getField(strZd) : cls6.getDeclaredField(strZd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("wf.mS", (short) (FB.Xd() ^ (825022449 ^ 825031604)));
                        String strVd = Wg.vd("j^", (short) (C1633zX.Xd() ^ ((1157539729 ^ 494965917) ^ (-1501461269))));
                        try {
                            Class<?> cls7 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls7.getField(strVd) : cls7.getDeclaredField(strVd);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i8 = 1899953844 ^ 1899953919;
                        if (x2 > i8 && x2 < displayMetrics.widthPixels - i8 && y2 > i8 && y2 < displayMetrics.heightPixels - i8) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static final /* synthetic */ int access$getItemPadding$p(IntroActivity introActivity) {
        int i2 = 2 % 2;
        int i3 = f16367i + 51;
        f16368j = i3 % 128;
        int i4 = i3 % 2;
        int i5 = introActivity.f16371b;
        if (i4 == 0) {
            return i5;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f16368j;
        int i4 = i3 + 125;
        f16367i = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f16376h;
        int i6 = i3 + 15;
        f16367i = i6 % 128;
        if (i6 % 2 != 0) {
            return screenName;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f16367i;
        int i4 = i3 + 111;
        f16368j = i4 % 128;
        int i5 = i4 % 2;
        Modules modules = this.f16375g;
        int i6 = i3 + 125;
        f16368j = i6 % 128;
        int i7 = i6 % 2;
        return modules;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(IntroActivity introActivity, View view, int i2) {
        boolean z2;
        int i3 = 2 % 2;
        int i4 = f16367i + 101;
        f16368j = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(introActivity, "");
        boolean[] zArr = introActivity.f16372c;
        s sVar = null;
        if (zArr == null) {
            int i6 = f16367i + 33;
            f16368j = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            zArr = null;
        }
        boolean[] zArr2 = introActivity.f16372c;
        if (zArr2 == null) {
            int i8 = f16367i + 83;
            f16368j = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            zArr2 = null;
        }
        boolean z3 = true;
        if (zArr2[i2]) {
            int i10 = f16367i + 89;
            f16368j = i10 % 128;
            int i11 = i10 % 2;
            z2 = false;
        } else {
            z2 = true;
        }
        zArr[i2] = z2;
        s sVar2 = introActivity.f16373d;
        if (sVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            sVar = sVar2;
        }
        IncodeButton incodeButton = sVar.f7328a;
        if (!introActivity.f16374f && !introActivity.c()) {
            z3 = false;
        }
        incodeButton.setEnabled(z3);
    }

    private static final void e(IntroActivity introActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f16367i + 111;
        f16368j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(introActivity, "");
        introActivity.d();
        int i5 = f16367i + 109;
        f16368j = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f16368j + 125;
        f16367i = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnCreate(bundle);
        s sVarB = s.b(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(sVarB, "");
        this.f16373d = sVarB;
        s sVar = null;
        if (sVarB == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            sVarB = null;
        }
        setContentView(sVarB.e());
        EventUtils.sendEvent(getRepo(), Event.INTRO, getModule());
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("extraIntroChecks");
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        boolean[] zArr = new boolean[arrayList.size()];
        this.f16372c = zArr;
        Arrays.fill(zArr, false);
        int size = arrayList.size();
        final String[] strArr = new String[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr[i5] = getResources().getString(((IntroChecks) arrayList.get(i5)).getIntroCheckResId());
        }
        this.f16371b = getResources().getDimensionPixelSize(R.dimen.onboard_sdk_user_consent_list_item_top_padding);
        s sVar2 = this.f16373d;
        if (sVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            sVar2 = null;
        }
        sVar2.f7332e.setHasFixedSize(true);
        s sVar3 = this.f16373d;
        if (sVar3 == null) {
            int i6 = f16367i + 51;
            f16368j = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            sVar3 = null;
        }
        sVar3.f7332e.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.incode.welcome_sdk.ui.intro.IntroActivity.safeOnCreate.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f16379c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f16380d = 1;

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int i8 = 2 % 2;
                Intrinsics.checkNotNullParameter(rect, "");
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(recyclerView, "");
                Intrinsics.checkNotNullParameter(state, "");
                super.getItemOffsets(rect, view, recyclerView, state);
                rect.top = IntroActivity.access$getItemPadding$p(IntroActivity.this);
                if (recyclerView.getChildAdapterPosition(view) == strArr.length - 1) {
                    int i9 = f16379c + 61;
                    f16380d = i9 % 128;
                    if (i9 % 2 == 0) {
                        rect.bottom = IntroActivity.access$getItemPadding$p(IntroActivity.this);
                        int i10 = 86 / 0;
                    } else {
                        rect.bottom = IntroActivity.access$getItemPadding$p(IntroActivity.this);
                    }
                    int i11 = f16379c + 1;
                    f16380d = i11 % 128;
                    int i12 = i11 % 2;
                }
                int i13 = f16380d + 107;
                f16379c = i13 % 128;
                int i14 = i13 % 2;
            }
        });
        s sVar4 = this.f16373d;
        if (sVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i8 = f16367i + 83;
            f16368j = i8 % 128;
            int i9 = i8 % 2;
            sVar4 = null;
        }
        sVar4.f7332e.setAdapter(new CheckboxRecyclerViewAdapter(strArr, new CheckboxRecyclerViewClickListener() { // from class: com.incode.welcome_sdk.ui.intro.IntroActivity$$ExternalSyntheticLambda0
            @Override // com.incode.welcome_sdk.commons.ui.checkbox.CheckboxRecyclerViewClickListener
            public final void onClick(View view, int i10) {
                IntroActivity.c(this.f$0, view, i10);
            }
        }));
        this.f16374f = IncodeWelcome.Companion.getInstance().getInternalConfig().isIntroAllowContinueWithoutConsent();
        s sVar5 = this.f16373d;
        if (sVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            sVar5 = null;
        }
        sVar5.f7328a.setEnabled(this.f16374f);
        s sVar6 = this.f16373d;
        if (sVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            sVar = sVar6;
        }
        sVar.f7328a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.intro.IntroActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntroActivity.m8505instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
    }

    private final boolean c() {
        int i2 = 2 % 2;
        int i3 = f16368j + 21;
        f16367i = i3 % 128;
        int i4 = i3 % 2;
        boolean[] zArr = this.f16372c;
        Object obj = null;
        if (zArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f16368j + 27;
            f16367i = i5 % 128;
            int i6 = i5 % 2;
            zArr = null;
        }
        for (boolean z2 : zArr) {
            if (!z2) {
                int i7 = f16367i + 123;
                f16368j = i7 % 128;
                if (i7 % 2 == 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
        }
        return true;
    }

    private final void d() {
        int i2 = 2 % 2;
        int i3 = f16367i;
        int i4 = i3 + 57;
        f16368j = i4 % 128;
        s sVar = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        s sVar2 = this.f16373d;
        if (sVar2 == null) {
            int i5 = i3 + 103;
            f16368j = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = 4 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else {
            sVar = sVar2;
        }
        IncodeButton incodeButton = sVar.f7328a;
        Intrinsics.checkNotNullExpressionValue(incodeButton, "");
        ViewExtensionsKt.preventDoubleClick(incodeButton);
        EventUtils.sendContinueEvent(getRepo(), this);
        b();
    }

    private final void b() {
        int i2 = 2 % 2;
        int i3 = f16368j + 123;
        f16367i = i3 % 128;
        if (i3 % 2 != 0) {
            IncodeWelcome.Companion.getInstance().getIntroBus().onNext(ResultCode.SUCCESS);
            finish();
        } else {
            IncodeWelcome.Companion.getInstance().getIntroBus().onNext(ResultCode.SUCCESS);
            finish();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(IntroActivity introActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = f16368j + 25;
        f16367i = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(introActivity, "");
        EventUtils.sendEvent(introActivity.getRepo(), Event.CLOSE_INTRO, introActivity.getModule());
        IncodeWelcome.Companion.getInstance().getIntroBus().onNext(ResultCode.USER_CANCELLED);
        introActivity.finish();
        int i6 = f16367i + 15;
        f16368j = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f16367i + 15;
        f16368j = i3 % 128;
        int i4 = i3 % 2;
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.intro.IntroActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                IntroActivity.e(this.f$0, dialogInterface, i5);
            }
        });
        int i5 = f16367i + 125;
        f16368j = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16377c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16378e = 0;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, ArrayList<IntroChecks> arrayList) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intent intent = new Intent(context, (Class<?>) IntroActivity.class);
            intent.putExtra("extraIntroChecks", arrayList);
            CX.ud();
            context.startActivity(intent);
            int i3 = f16378e + 1;
            f16377c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 64 / 0;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f16370l + 75;
        f16369k = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, ArrayList<IntroChecks> arrayList) {
        int i2 = 2 % 2;
        int i3 = f16367i + 117;
        f16368j = i3 % 128;
        int i4 = i3 % 2;
        f16366e.start(context, arrayList);
        int i5 = f16368j + 77;
        f16367i = i5 % 128;
        int i6 = i5 % 2;
    }
}
