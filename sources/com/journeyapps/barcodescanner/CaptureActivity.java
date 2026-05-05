package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.google.zxing.client.android.R;
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
import yg.C1633zX;
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
public class CaptureActivity extends Activity {
    private DecoratedBarcodeView barcodeScannerView;
    private CaptureManager capture;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strOd = EO.Od("}$Xv\u0013", (short) (FB.Xd() ^ ((109394748 ^ 2051471681) ^ 2093201032)));
            String strQd = C1561oA.Qd("G4", (short) (C1499aX.Xd() ^ (1787447833 ^ (-1787430506))));
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strZd = C1593ug.zd(".\u001dd$\n", (short) (C1607wl.Xd() ^ (1637973684 ^ 1637948727)), (short) (C1607wl.Xd() ^ (305335020 ^ 305337579)));
                String strOd2 = C1561oA.od("1\u001d", (short) (Od.Xd() ^ ((311700783 ^ 633548183) ^ (-928449475))));
                try {
                    Class<?> cls2 = Class.forName(strZd);
                    Field field2 = 0 != 0 ? cls2.getField(strOd2) : cls2.getDeclaredField(strOd2);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strKd = C1561oA.Kd("\u0003q9x^", (short) (C1607wl.Xd() ^ (1454314347 ^ 1454335433)));
                    String strZd2 = Wg.Zd("XT", (short) (ZN.Xd() ^ ((385817840 ^ 1285487974) ^ 1516356614)), (short) (ZN.Xd() ^ ((1928463409 ^ 1015258286) ^ 1316076928)));
                    try {
                        Class<?> cls3 = Class.forName(strKd);
                        Field field3 = 0 != 0 ? cls3.getField(strZd2) : cls3.getDeclaredField(strZd2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(C1561oA.Xd("\r{C\u000fp", (short) (C1633zX.Xd() ^ ((50243081 ^ 1152730052) ^ (-1179361450))))).getDeclaredMethod(Wg.vd("~\f", (short) (OY.Xd() ^ ((139731360 ^ 1155428087) ^ 1284140982))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {Qg.kd("M>B7AH", (short) (C1499aX.Xd() ^ (824750324 ^ (-824750821))), (short) (C1499aX.Xd() ^ (473821153 ^ (-473806897))))};
                                Method method = Class.forName(hg.Vd("\u0005\u0011\u0006\u0013\u000f\b\u0002J~\n\b\r|\u0005\nBV\u0002\u007f\u0005t\u0007\u0002", (short) (C1580rY.Xd() ^ ((1978498636 ^ 1560123131) ^ (-688957069))), (short) (C1580rY.Xd() ^ ((1446885153 ^ 1793561562) ^ (-1020929332))))).getMethod(C1561oA.yd("41C!JCG72\u0017,8?1./", (short) (C1633zX.Xd() ^ (1555244982 ^ (-1555253820)))), Class.forName(C1561oA.ud("f\\pZ&cWc[!EebX\\T", (short) (OY.Xd() ^ (1576700191 ^ 1576711533)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strYd = C1561oA.Yd("iX _E", (short) (FB.Xd() ^ ((1006051514 ^ 1634476428) ^ 1520126686)));
                                    String strQd2 = Xg.qd("wm", (short) (OY.Xd() ^ ((1939428862 ^ 1325948691) ^ 1016144886)), (short) (OY.Xd() ^ ((96034078 ^ 2109702024) ^ 2013671128)));
                                    try {
                                        Class<?> cls4 = Class.forName(strYd);
                                        Field field4 = 0 != 0 ? cls4.getField(strQd2) : cls4.getDeclaredField(strQd2);
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
                    String strWd = Jg.Wd("\u0015EXYG", (short) (OY.Xd() ^ (2075852379 ^ 2075842539)), (short) (OY.Xd() ^ (260389068 ^ 260405100)));
                    short sXd = (short) (OY.Xd() ^ ((1635663976 ^ 1562785995) ^ 1012415476));
                    short sXd2 = (short) (OY.Xd() ^ (1944866030 ^ 1944862387));
                    int[] iArr = new int["G\u0012".length()];
                    QB qb = new QB("G\u0012");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    try {
                        Class<?> cls5 = Class.forName(strWd);
                        Field field5 = 0 != 0 ? cls5.getField(str) : cls5.getDeclaredField(str);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strUd = C1626yg.Ud("i[JAg", (short) (FB.Xd() ^ (919937931 ^ 919960860)), (short) (FB.Xd() ^ (2114774275 ^ 2114780532)));
                        String strWd2 = Ig.wd("yJ", (short) (Od.Xd() ^ (1582966222 ^ (-1582988878))));
                        try {
                            Class<?> cls6 = Class.forName(strUd);
                            Field field6 = 0 != 0 ? cls6.getField(strWd2) : cls6.getDeclaredField(strWd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i3 = (1189353873 ^ 1527851138) ^ 502608216;
                        if (x2 > i3 && x2 < displayMetrics.widthPixels - i3 && y2 > i3 && y2 < displayMetrics.heightPixels - i3) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected DecoratedBarcodeView initializeContent() {
        setContentView(R.layout.zxing_capture);
        return (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.barcodeScannerView = initializeContent();
        CaptureManager captureManager = new CaptureManager(this, this.barcodeScannerView);
        this.capture = captureManager;
        captureManager.initializeFromIntent(getIntent(), bundle);
        this.capture.decode();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.capture.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return this.barcodeScannerView.onKeyDown(i2, keyEvent) || super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.capture.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.capture.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.capture.onResume();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.capture.onSaveInstanceState(bundle);
    }
}
