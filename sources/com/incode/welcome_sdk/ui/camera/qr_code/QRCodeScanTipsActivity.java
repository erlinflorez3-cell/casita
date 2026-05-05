package com.incode.welcome_sdk.ui.camera.qr_code;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.d.y;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.BaseActivity;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
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
public final class QRCodeScanTipsActivity extends BaseActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11913d = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f11914j = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScreenName f11915b = ScreenName.QR_TUTORIAL;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Modules f11916c = Modules.QR_SCAN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private y f11917e;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8327instrumented$0$safeOnCreate$LandroidosBundleV(QRCodeScanTipsActivity qRCodeScanTipsActivity, View view) {
        Callback.onClick_enter(view);
        try {
            b(qRCodeScanTipsActivity, view);
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
            String strKd = Qg.kd("6#h&\n", (short) (Od.Xd() ^ (365465393 ^ (-365466479))), (short) (Od.Xd() ^ ((1156917623 ^ 1035408207) ^ (-2034392853))));
            String strVd = hg.Vd("\u000bw", (short) (C1580rY.Xd() ^ (348834352 ^ (-348824032))), (short) (C1580rY.Xd() ^ (2108378606 ^ (-2108388051))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("P=\u0003@$", (short) (C1607wl.Xd() ^ (1014656113 ^ 1014649057)));
                short sXd = (short) (Od.Xd() ^ ((1015442064 ^ 1458732111) ^ (-1786005793)));
                int[] iArr = new int["6\"".length()];
                QB qb = new QB("6\"");
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
                    String strYd = C1561oA.Yd("{j2qW", (short) (Od.Xd() ^ (1433013488 ^ (-1433027647))));
                    String strQd = Xg.qd("tj", (short) (Od.Xd() ^ (1770545062 ^ (-1770550516))), (short) (Od.Xd() ^ (333392046 ^ (-333396494))));
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
                        Method declaredMethod = Class.forName(Jg.Wd("\u0003q-xN", (short) (C1633zX.Xd() ^ ((2104739480 ^ 554921962) ^ (-1549834784))), (short) (C1633zX.Xd() ^ (107810457 ^ (-107815866))))).getDeclaredMethod(ZO.xd("7z", (short) (C1580rY.Xd() ^ ((1995948141 ^ 1468699962) ^ (-561840534))), (short) (C1580rY.Xd() ^ (1227107839 ^ (-1227096955)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("B44\u0011#/", (short) (ZN.Xd() ^ ((801563946 ^ 1722971304) ^ 1232380982)), (short) (ZN.Xd() ^ ((1756816669 ^ 699922496) ^ 1090615381)));
                                Class<?> cls4 = Class.forName(Ig.wd("2n\u0015<W-}\u001d\u001cE@nt\u0006\u001a7\u007fHl\rG\u0010k", (short) (ZN.Xd() ^ (1341147596 ^ 1341131368))));
                                Class<?>[] clsArr = {Class.forName(EO.Od("o<!jqTs#R\f5.\u0017\u0006\r\"", (short) (C1499aX.Xd() ^ ((61662003 ^ 126053288) ^ (-70247971)))))};
                                Object[] objArr2 = {strUd2};
                                short sXd2 = (short) (OY.Xd() ^ ((1838910114 ^ 469387755) ^ 1986120983));
                                int[] iArr2 = new int["\u001d\u001a(\u0006+$$\u0014\u001b\u007f\u0011\u001d \u0012\u000b\f".length()];
                                QB qb2 = new QB("\u001d\u001a(\u0006+$$\u0014\u001b\u007f\u0011\u001d \u0012\u000b\f");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                Method method = cls4.getMethod(new String(iArr2, 0, i3), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("YH\u0010O5", (short) (ZN.Xd() ^ ((837368120 ^ 1824368559) ^ 1565840988)), (short) (ZN.Xd() ^ ((1188087461 ^ 1757955969) ^ 773373922)));
                                    String strOd = C1561oA.od("\u001c\u0010", (short) (OY.Xd() ^ ((1493263405 ^ 124805284) ^ 1584489718)));
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
                    String strKd2 = C1561oA.Kd("K:\u0002A'", (short) (C1580rY.Xd() ^ (224289269 ^ (-224294800))));
                    String strZd2 = Wg.Zd("5R", (short) (OY.Xd() ^ ((816553840 ^ 2069371796) ^ 1274264518)), (short) (OY.Xd() ^ ((271645350 ^ 1093215675) ^ 1360629259)));
                    try {
                        Class<?> cls6 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls6.getField(strZd2) : cls6.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("\u0002p8w]", (short) (C1499aX.Xd() ^ (1282068103 ^ (-1282050258))));
                        String strVd2 = Wg.vd(",\"", (short) (C1607wl.Xd() ^ ((738319788 ^ 356936114) ^ 961004211)));
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
                        int i4 = 1792276127 ^ 1792276180;
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

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f11913d;
        int i4 = i3 + 37;
        f11914j = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f11915b;
        int i6 = i3 + 33;
        f11914j = i6 % 128;
        int i7 = i6 % 2;
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f11913d;
        int i4 = i3 + 63;
        f11914j = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Modules modules = this.f11916c;
        int i5 = i3 + 37;
        f11914j = i5 % 128;
        if (i5 % 2 != 0) {
            return modules;
        }
        obj.hashCode();
        throw null;
    }

    private static final void b(QRCodeScanTipsActivity qRCodeScanTipsActivity, View view) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11914j + 49;
        f11913d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(qRCodeScanTipsActivity, "");
        qRCodeScanTipsActivity.d();
        int i5 = f11913d + 65;
        f11914j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        y yVarA = y.a(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(yVarA, "");
        this.f11917e = yVarA;
        y yVar = null;
        if (yVarA == null) {
            int i3 = f11914j + 5;
            f11913d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            yVarA = null;
        }
        setContentView(yVarA.b());
        y yVar2 = this.f11917e;
        if (yVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f11914j + 19;
            f11913d = i4 % 128;
            int i5 = i4 % 2;
        } else {
            yVar = yVar2;
        }
        yVar.f7415d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanTipsActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QRCodeScanTipsActivity.m8327instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, view);
            }
        });
    }

    private final void d() throws Exception {
        int i2 = 2 % 2;
        int i3 = f11914j + 79;
        f11913d = i3 % 128;
        int i4 = i3 % 2;
        y yVar = this.f11917e;
        if (yVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            yVar = null;
        }
        yVar.f7415d.setEnabled(false);
        Intent intent = new Intent(this, (Class<?>) QRCodeScanActivity.class);
        CX.ud();
        startActivity(intent);
        finish();
        int i5 = f11914j + 107;
        f11913d = i5 % 128;
        int i6 = i5 % 2;
    }
}
