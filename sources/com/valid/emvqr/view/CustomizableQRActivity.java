package com.valid.emvqr.view;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import com.journeyapps.barcodescanner.CaptureManager;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import com.valid.emvqr.R;
import com.valid.emvqr.tj;
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
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class CustomizableQRActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: e */
    public CaptureManager f18323e;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strOd = EO.Od("Jn\u00196D", (short) (C1499aX.Xd() ^ ((895919169 ^ 1166758733) ^ (-1894631869))));
            short sXd = (short) (C1633zX.Xd() ^ ((1621044965 ^ 1237002044) ^ (-690236660)));
            int[] iArr = new int["\u0013\u007f".length()];
            QB qb = new QB("\u0013\u007f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strZd = C1593ug.zd("(\u0017^\u001e\u0004", (short) (Od.Xd() ^ ((2140440839 ^ 1477240600) ^ (-664297462))), (short) (Od.Xd() ^ ((68555990 ^ 750963672) ^ (-685023659))));
                String strOd2 = C1561oA.od("B.", (short) (C1580rY.Xd() ^ (1376969834 ^ (-1376951160))));
                try {
                    Class<?> cls2 = Class.forName(strZd);
                    Field field2 = 0 != 0 ? cls2.getField(strOd2) : cls2.getDeclaredField(strOd2);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    short sXd2 = (short) (C1607wl.Xd() ^ ((523072677 ^ 2040865714) ^ 1720198162));
                    int[] iArr2 = new int[">-t4\u001a".length()];
                    QB qb2 = new QB(">-t4\u001a");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    String strZd2 = Wg.Zd("\rj", (short) (C1499aX.Xd() ^ (618247447 ^ (-618255967))), (short) (C1499aX.Xd() ^ (893141010 ^ (-893135550))));
                    try {
                        Class<?> cls3 = Class.forName(str2);
                        Field field3 = 0 != 0 ? cls3.getField(strZd2) : cls3.getDeclaredField(strZd2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd3 = (short) (OY.Xd() ^ ((1415008019 ^ 1000632136) ^ 1878220161));
                        int[] iArr3 = new int["\u0018\u0007N\u001a{".length()];
                        QB qb3 = new QB("\u0018\u0007N\u001a{");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i4));
                            i4++;
                        }
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(new String(iArr3, 0, i4)).getDeclaredMethod(Wg.vd("\u0018#", (short) (C1633zX.Xd() ^ (1913596613 ^ (-1913603032)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {Qg.kd("\u0010\u0001\u0005y\u0004\u000b", (short) (C1580rY.Xd() ^ ((727770568 ^ 1260567390) ^ (-1614944021))), (short) (C1580rY.Xd() ^ (174311208 ^ (-174318375))))};
                                Method method = Class.forName(hg.Vd("KWLYUNH\u0011EPNSCKP\t\u001dHFK;MH", (short) (OY.Xd() ^ ((698742898 ^ 431857802) ^ 806907314)), (short) (OY.Xd() ^ (2088798593 ^ 2088808177)))).getMethod(C1561oA.yd("@=K)NGG7>#4@C5./", (short) (ZN.Xd() ^ (200910810 ^ 200924517))), Class.forName(C1561oA.ud("_UiS\u001f\\P\\T\u001a>^[QUM", (short) (C1499aX.Xd() ^ (250673517 ^ (-250659884))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strYd = C1561oA.Yd("C2y9\u001f", (short) (C1580rY.Xd() ^ (1040644126 ^ (-1040639070))));
                                    String strQd = Xg.qd("YO", (short) (C1607wl.Xd() ^ ((2118249192 ^ 737544642) ^ 1438107817)), (short) (C1607wl.Xd() ^ ((314618776 ^ 1675111695) ^ 1897455091)));
                                    try {
                                        Class<?> cls4 = Class.forName(strYd);
                                        Field field4 = 0 != 0 ? cls4.getField(strQd) : cls4.getDeclaredField(strQd);
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
                    String strWd = Jg.Wd("^\ba[d", (short) (C1580rY.Xd() ^ ((510873751 ^ 623124049) ^ (-995573993))), (short) (C1580rY.Xd() ^ ((2058085873 ^ 208206510) ^ (-1992519250))));
                    String strXd = ZO.xd("kA", (short) (Od.Xd() ^ (9269333 ^ (-9241144))), (short) (Od.Xd() ^ ((1267510250 ^ 1598278442) ^ (-349132033))));
                    try {
                        Class<?> cls5 = Class.forName(strWd);
                        Field field5 = 0 != 0 ? cls5.getField(strXd) : cls5.getDeclaredField(strXd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strUd = C1626yg.Ud("\u0015A\t^\u001c", (short) (C1607wl.Xd() ^ ((1228231389 ^ 938531150) ^ 2126872651)), (short) (C1607wl.Xd() ^ ((1950182685 ^ 162567560) ^ 2106427005)));
                        String strWd2 = Ig.wd("$K", (short) (FB.Xd() ^ ((1539472838 ^ 2112294189) ^ 639979983)));
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
                        int i5 = (1355380466 ^ 1788948168) ^ 979916913;
                        if (x2 > i5 && x2 < displayMetrics.widthPixels - i5 && y2 > i5 && y2 < displayMetrics.heightPixels - i5) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        View viewFindViewById;
        int i2;
        DecoratedBarcodeView decoratedBarcodeView;
        ViewfinderView viewFinder;
        int i3;
        int i4;
        CustomizableQRActivity customizableQRActivity;
        Window window;
        int i5;
        int i6;
        CustomizableQRActivity customizableQRActivity2;
        CaptureManager captureManager;
        int i7;
        short sXd = (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (-864701560)));
        int[] iArr = new int["`".length()];
        QB qb = new QB("`");
        int i8 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i8] = xuXd.fK((C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((sXd + sXd) + i8)) + xuXd.CK(iKK));
            i8++;
        }
        String str2 = new String(iArr, 0, i8);
        try {
            super.onCreate(bundle);
            int i9 = Integer.parseInt(str2);
            int i10 = 8;
            String strQd = C1561oA.Qd("69", (short) (Od.Xd() ^ (1301628223 ^ (-1301616753))));
            if (i9 != 0) {
                i10 = (992964222 ^ 147564567) ^ 870631013;
                str = str2;
            } else {
                setContentView(R.layout.activity_scan_qr);
                str = strQd;
            }
            int i11 = 0;
            CaptureManager captureManager2 = null;
            if (i10 != 0) {
                viewFindViewById = findViewById(R.id.zxing_barcode_scanner);
                str = str2;
                i2 = 0;
            } else {
                i2 = i10 + 13;
                viewFindViewById = null;
            }
            if (Integer.parseInt(str) != 0) {
                i3 = i2 + 14;
                decoratedBarcodeView = null;
                viewFinder = null;
            } else {
                decoratedBarcodeView = (DecoratedBarcodeView) viewFindViewById;
                viewFinder = decoratedBarcodeView.getViewFinder();
                i3 = i2 + 14;
                str = strQd;
            }
            if (i3 != 0) {
                viewFinder.setVisibility((2107494211 ^ 1166531320) ^ 941233599);
                customizableQRActivity = this;
                str = str2;
                i4 = 0;
            } else {
                i4 = i3 + 14;
                customizableQRActivity = null;
            }
            if (Integer.parseInt(str) != 0) {
                i5 = i4 + 5;
                i6 = 256;
                window = null;
                strQd = str;
            } else {
                window = customizableQRActivity.getWindow();
                i5 = i4 + 2;
                i6 = 1024;
            }
            if (i5 != 0) {
                window.setFlags(i6, i6);
                captureManager = new CaptureManager(this, decoratedBarcodeView);
                customizableQRActivity2 = this;
            } else {
                i11 = i5 + 8;
                str2 = strQd;
                customizableQRActivity2 = null;
                captureManager = null;
            }
            if (Integer.parseInt(str2) != 0) {
                i7 = i11 + 11;
            } else {
                customizableQRActivity2.f18323e = captureManager;
                captureManager2 = this.f18323e;
                i7 = i11 + 5;
            }
            if (i7 != 0) {
                captureManager2.initializeFromIntent(getIntent(), bundle);
            }
            this.f18323e.decode();
        } catch (tj unused) {
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        try {
            super.onDestroy();
            this.f18323e.onDestroy();
        } catch (tj unused) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        try {
            super.onPause();
            this.f18323e.onPause();
        } catch (tj unused) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        try {
            super.onResume();
            this.f18323e.onResume();
        } catch (tj unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            this.f18323e.onSaveInstanceState(bundle);
        } catch (tj unused) {
        }
    }
}
