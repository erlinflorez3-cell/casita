package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.CX;
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

/* JADX INFO: loaded from: classes3.dex */
public final class FaceTecSessionActivity extends o {
    static FaceTecFaceScanProcessor B = null;
    static FaceTecIDScanProcessor D = null;

    public static void createAndLaunchSession(Context context, FaceTecFaceScanProcessor faceTecFaceScanProcessor) throws Exception {
        createAndLaunchSession(context, faceTecFaceScanProcessor, null, "");
    }

    public static void createAndLaunchSession(Context context, FaceTecFaceScanProcessor faceTecFaceScanProcessor, FaceTecIDScanProcessor faceTecIDScanProcessor) throws Exception {
        createAndLaunchSession(context, faceTecFaceScanProcessor, faceTecIDScanProcessor, "");
    }

    public static void createAndLaunchSession(Context context, FaceTecFaceScanProcessor faceTecFaceScanProcessor, FaceTecIDScanProcessor faceTecIDScanProcessor, String str) throws Exception {
        Intent intent = new Intent(context, (Class<?>) FaceTecSessionActivity.class);
        if (str != null) {
            intent.putExtra("zoom.serverSessionToken", str);
        }
        n.B(context);
        B = faceTecFaceScanProcessor;
        D = faceTecIDScanProcessor;
        CX.ud();
        ((Activity) context).startActivityForResult(intent, 1002);
    }

    public static void createAndLaunchSession(Context context, FaceTecFaceScanProcessor faceTecFaceScanProcessor, String str) throws Exception {
        createAndLaunchSession(context, faceTecFaceScanProcessor, null, str);
    }

    public static FaceTecIDScanResult getIDScanResultFromActivityResult(Intent intent) {
        if (intent != null) {
            return (FaceTecIDScanResult) intent.getParcelableExtra(FaceTecSDK.EXTRA_ID_SCAN_RESULTS);
        }
        return null;
    }

    public static FaceTecSessionResult getSessionResultFromActivityResult(Intent intent) {
        if (intent != null) {
            return (FaceTecSessionResult) intent.getParcelableExtra(FaceTecSDK.EXTRA_SESSION_RESULTS);
        }
        return null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            short sXd = (short) (Od.Xd() ^ (1556578811 ^ (-1556596394)));
            int[] iArr = new int["'\u0014Y\u0017z".length()];
            QB qb = new QB("'\u0014Y\u0017z");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strYd = C1561oA.yd("H7", (short) (ZN.Xd() ^ ((754340529 ^ 1419627622) ^ 2020313433)));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strYd) : cls.getDeclaredField(strYd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strYd2 = C1561oA.Yd("WF\u000eM3", (short) (C1580rY.Xd() ^ ((77524870 ^ 1708376242) ^ (-1632437513))));
                String strQd = Xg.qd("\"\u0010", (short) (Od.Xd() ^ (266365993 ^ (-266350040))), (short) (Od.Xd() ^ ((566646956 ^ 133527542) ^ (-640906987))));
                try {
                    Class<?> cls2 = Class.forName(strYd2);
                    Field field2 = 0 != 0 ? cls2.getField(strQd) : cls2.getDeclaredField(strQd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strWd = Jg.Wd("F3\u001f\u001d\u001c", (short) (Od.Xd() ^ ((387758593 ^ 1433999994) ^ (-1113970805))), (short) (Od.Xd() ^ (654911453 ^ (-654932563))));
                    short sXd2 = (short) (FB.Xd() ^ ((1619881278 ^ 1397602440) ^ 868257440));
                    short sXd3 = (short) (FB.Xd() ^ ((839498017 ^ 1616006233) ^ 1381743266));
                    int[] iArr2 = new int["}o".length()];
                    QB qb2 = new QB("}o");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls3 = Class.forName(strWd);
                        Field field3 = 0 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(C1626yg.Ud("@K/#\u0002", (short) (C1607wl.Xd() ^ (1098643941 ^ 1098629941)), (short) (C1607wl.Xd() ^ ((976044073 ^ 1419699634) ^ 1857278757)))).getDeclaredMethod(Ig.wd("zQ", (short) (C1580rY.Xd() ^ ((1601665195 ^ 1904392912) ^ (-787864039)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd4 = (short) (C1607wl.Xd() ^ (1744974019 ^ 1744985282));
                                int[] iArr3 = new int[">\u000b\u0012'j\u0018".length()];
                                QB qb3 = new QB(">\u000b\u0012'j\u0018");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i4)) + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                Object[] objArr2 = {new String(iArr3, 0, i4)};
                                Method method = Class.forName(C1561oA.Qd("BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?", (short) (C1499aX.Xd() ^ (612872541 ^ (-612888097))))).getMethod(C1561oA.od("\u0002~\rj\u0010\t\tx\u007fdu\u0002\u0005vop", (short) (OY.Xd() ^ (1031128775 ^ 1031133926))), Class.forName(C1593ug.zd("vn\u0005p>}s\u0002{Ci\f\u000b\u0003\t\u0003", (short) (FB.Xd() ^ (2006446042 ^ 2006440373)), (short) (FB.Xd() ^ (151920307 ^ 151935403)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strKd = C1561oA.Kd("ra)hN", (short) (OY.Xd() ^ (1751040980 ^ 1751039731)));
                                    String strZd = Wg.Zd("\u001fk", (short) (ZN.Xd() ^ (1103258525 ^ 1103264867)), (short) (ZN.Xd() ^ ((1477203251 ^ 673795275) ^ 1881497153)));
                                    try {
                                        Class<?> cls4 = Class.forName(strKd);
                                        Field field4 = 0 != 0 ? cls4.getField(strZd) : cls4.getDeclaredField(strZd);
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
                    String strXd = C1561oA.Xd("\fzB\u0002g", (short) (Od.Xd() ^ ((1610094141 ^ 80152767) ^ (-1530880207))));
                    String strVd = Wg.vd("qe", (short) (FB.Xd() ^ ((603361992 ^ 1753447211) ^ 1266024410)));
                    try {
                        Class<?> cls5 = Class.forName(strXd);
                        Field field5 = 0 != 0 ? cls5.getField(strVd) : cls5.getDeclaredField(strVd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strKd2 = Qg.kd(".\u001b`\u001e\u0002", (short) (C1580rY.Xd() ^ ((217540909 ^ 1357698104) ^ (-1545317334))), (short) (C1580rY.Xd() ^ ((1911418568 ^ 1971830407) ^ (-74073049))));
                        short sXd5 = (short) (C1499aX.Xd() ^ ((1736297038 ^ 55711478) ^ (-1680859903)));
                        short sXd6 = (short) (C1499aX.Xd() ^ ((1091841281 ^ 482261398) ^ (-1571457730)));
                        int[] iArr4 = new int["-!".length()];
                        QB qb4 = new QB("-!");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(sXd5 + i5 + xuXd4.CK(iKK4) + sXd6);
                            i5++;
                        }
                        String str3 = new String(iArr4, 0, i5);
                        try {
                            Class<?> cls6 = Class.forName(strKd2);
                            Field field6 = 0 != 0 ? cls6.getField(str3) : cls6.getDeclaredField(str3);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i6 = (2111323754 ^ 1786009127) ^ 397174790;
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

    @Override // com.facetec.sdk.o, android.app.Activity
    public final /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.facetec.sdk.g, android.app.Activity, android.content.ComponentCallbacks
    public final /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facetec.sdk.o
    public final /* bridge */ /* synthetic */ void onFlashButtonPressed(View view) {
        super.onFlashButtonPressed(view);
    }

    @Override // com.facetec.sdk.o, android.app.Activity
    public final /* bridge */ /* synthetic */ void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // com.facetec.sdk.o, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public final /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // com.facetec.sdk.o, com.facetec.sdk.g, android.app.Activity, android.view.Window.Callback
    public final /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }
}
