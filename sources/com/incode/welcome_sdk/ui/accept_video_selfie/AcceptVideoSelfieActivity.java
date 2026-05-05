package com.incode.welcome_sdk.ui.accept_video_selfie;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.d.b;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.AcceptVideoSelfieResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class AcceptVideoSelfieActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10827c = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f10828g = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f10831e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScreenName f10830d = ScreenName.ACCEPT_VIDEO_SELFIE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Modules f10829b = Modules.ACCEPT_VIDEO_SELFIE;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8219instrumented$0$safeOnCreate$LandroidosBundleV(AcceptVideoSelfieActivity acceptVideoSelfieActivity, View view) {
        Callback.onClick_enter(view);
        try {
            c(acceptVideoSelfieActivity, view);
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
            short sXd = (short) (C1607wl.Xd() ^ (1971217426 ^ 1971200906));
            short sXd2 = (short) (C1607wl.Xd() ^ ((1902450593 ^ 117470114) ^ 1986354839));
            int[] iArr = new int["/\u001ca\u001f\u0003".length()];
            QB qb = new QB("/\u001ca\u001f\u0003");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strVd = hg.Vd("\u0006r", (short) (Od.Xd() ^ ((992829779 ^ 1247184272) ^ (-1903944779))), (short) (Od.Xd() ^ (1785781201 ^ (-1785775603))));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("D1v4\u0018", (short) (OY.Xd() ^ ((17650112 ^ 2075299542) ^ 2059371760)));
                short sXd3 = (short) (OY.Xd() ^ ((2012277484 ^ 895714913) ^ 1116961091));
                int[] iArr2 = new int["XF".length()];
                QB qb2 = new QB("XF");
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
                    String strYd = C1561oA.Yd("+\u001aa!\u0007", (short) (OY.Xd() ^ ((1971426770 ^ 477571999) ^ 1777786898)));
                    short sXd4 = (short) (C1633zX.Xd() ^ ((611455353 ^ 1802675321) ^ (-1325447262)));
                    short sXd5 = (short) (C1633zX.Xd() ^ ((1352413149 ^ 36993936) ^ (-1386761146)));
                    int[] iArr3 = new int["si".length()];
                    QB qb3 = new QB("si");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) + sXd5);
                        i4++;
                    }
                    String str3 = new String(iArr3, 0, i4);
                    try {
                        Class<?> cls3 = Class.forName(strYd);
                        Field field3 = 0 != 0 ? cls3.getField(str3) : cls3.getDeclaredField(str3);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("_F\u0014c9", (short) (C1607wl.Xd() ^ ((1855385708 ^ 1702001214) ^ 199543478)), (short) (C1607wl.Xd() ^ ((1015544375 ^ 968582162) ^ 87858971)))).getDeclaredMethod(ZO.xd("\u001b\u000e", (short) (ZN.Xd() ^ (1415358184 ^ 1415369269)), (short) (ZN.Xd() ^ (1951729495 ^ 1951750978))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd6 = (short) (OY.Xd() ^ (351345603 ^ 351358920));
                                short sXd7 = (short) (OY.Xd() ^ (986751552 ^ 986746551));
                                int[] iArr4 = new int[";w\u0006k\bJ".length()];
                                QB qb4 = new QB(";w\u0006k\bJ");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i5 * sXd7))) + xuXd4.CK(iKK4));
                                    i5++;
                                }
                                Object[] objArr2 = {new String(iArr4, 0, i5)};
                                Method method = Class.forName(Ig.wd("/\u0011V?a\u001e?\u000f\u0019gbP\u000e\u0017\u000b)\u0005\u0019n\u001fT1Y", (short) (FB.Xd() ^ (111300170 ^ 111292498)))).getMethod(C1561oA.Qd("\u001b\u0018&\u0004)\"\"\u0012\u0019}\u000f\u001b\u001e\u0010\t\n", (short) (Od.Xd() ^ ((1425738732 ^ 1905031337) ^ (-628575919)))), Class.forName(EO.Od("\u000b1t\u0003PT9\u000e^$K\u000bTAZl", (short) (C1607wl.Xd() ^ (192921105 ^ 192930713)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("\u0003q9x^", (short) (C1633zX.Xd() ^ (1421485446 ^ (-1421508017))), (short) (C1633zX.Xd() ^ ((150144662 ^ 505374937) ^ (-384580562))));
                                    String strOd = C1561oA.od("\u0015\t", (short) (C1580rY.Xd() ^ ((76864595 ^ 897025284) ^ (-836964077))));
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
                    String strKd = C1561oA.Kd("^M\u0015T:", (short) (C1633zX.Xd() ^ (750234972 ^ (-750238009))));
                    String strZd2 = Wg.Zd("5Y", (short) (C1607wl.Xd() ^ ((1696386743 ^ 437438513) ^ 2131635227)), (short) (C1607wl.Xd() ^ (242133557 ^ 242127691)));
                    try {
                        Class<?> cls5 = Class.forName(strKd);
                        Field field5 = 0 != 0 ? cls5.getField(strZd2) : cls5.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("M<\u0004C)", (short) (C1580rY.Xd() ^ ((1160820596 ^ 289802256) ^ (-1417078593))));
                        String strVd2 = Wg.vd("\u0004w", (short) (FB.Xd() ^ ((1858697835 ^ 452580797) ^ 1949365351)));
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
                        int i6 = 1359049973 ^ 1359049918;
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

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f10827c + 19;
        f10828g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f10830d;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f10828g + 47;
        f10827c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f10829b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void c(AcceptVideoSelfieActivity acceptVideoSelfieActivity, View view) {
        int i2 = 2 % 2;
        int i3 = f10828g + 97;
        f10827c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(acceptVideoSelfieActivity, "");
        Intrinsics.checkNotNull(view);
        ViewExtensionsKt.preventDoubleClick(view);
        acceptVideoSelfieActivity.c();
        int i5 = f10828g + 31;
        f10827c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f10828g + 37;
        f10827c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.safeOnCreate(bundle);
            b bVarC = b.c(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(bVarC, "");
            this.f10831e = bVarC;
            throw null;
        }
        super.safeOnCreate(bundle);
        b bVarC2 = b.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bVarC2, "");
        this.f10831e = bVarC2;
        if (bVarC2 == null) {
            int i4 = f10827c + 63;
            f10828g = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 21 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            bVarC2 = null;
        }
        setContentView(bVarC2.e());
        b bVar = this.f10831e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bVar = null;
        }
        bVar.f6995c.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.accept_video_selfie.AcceptVideoSelfieActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AcceptVideoSelfieActivity.m8219instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
        int i6 = f10828g + 95;
        f10827c = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        IncodeWelcome.Companion.getInstance().getAcceptVideoSelfieBus().onNext(new AcceptVideoSelfieResult(ResultCode.USER_CANCELLED));
        super.onBackButtonPressed();
        int i3 = f10827c + 33;
        f10828g = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void c() {
        int i2 = 2 % 2;
        IncodeWelcome.Companion.getInstance().getAcceptVideoSelfieBus().onNext(new AcceptVideoSelfieResult(ResultCode.SUCCESS));
        finish();
        int i3 = f10827c + 113;
        f10828g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
