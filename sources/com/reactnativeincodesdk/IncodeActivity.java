package com.reactnativeincodesdk;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
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
import yg.Ig;
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
public class IncodeActivity extends AppCompatActivity {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strVd = hg.Vd("0\u001db \u0004", (short) (ZN.Xd() ^ ((931820351 ^ 577698894) ^ 367296971)), (short) (ZN.Xd() ^ (2107700234 ^ 2107676685)));
            String strUd = C1561oA.ud("?,", (short) (ZN.Xd() ^ ((1424659941 ^ 98630433) ^ 1359641428)));
            try {
                Class<?> cls = Class.forName(strVd);
                Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strYd = C1561oA.yd("J9\u0001@\u001e", (short) (OY.Xd() ^ (1979215195 ^ 1979196543)));
                short sXd = (short) (ZN.Xd() ^ (2080700818 ^ 2080690050));
                int[] iArr = new int["M;".length()];
                QB qb = new QB("M;");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                try {
                    Class<?> cls2 = Class.forName(strYd);
                    Field field2 = 0 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strQd = Xg.qd("2!h(\u000e", (short) (ZN.Xd() ^ ((266171819 ^ 1539271329) ^ 1415718036)), (short) (ZN.Xd() ^ (1285181905 ^ 1285186180)));
                    short sXd2 = (short) (C1499aX.Xd() ^ (271793092 ^ (-271810272)));
                    short sXd3 = (short) (C1499aX.Xd() ^ ((679269492 ^ 1777356491) ^ (-1099726944)));
                    int[] iArr2 = new int["<!".length()];
                    QB qb2 = new QB("<!");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls3 = Class.forName(strQd);
                        Field field3 = 0 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd4 = (short) (OY.Xd() ^ (218845004 ^ 218843208));
                        short sXd5 = (short) (OY.Xd() ^ (469338563 ^ 469352266));
                        int[] iArr3 = new int["\u0006\u001a\u0018\u0019\u0016".length()];
                        QB qb3 = new QB("\u0006\u001a\u0018\u0019\u0016");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                            i4++;
                        }
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(new String(iArr3, 0, i4)).getDeclaredMethod(C1626yg.Ud("9k", (short) (OY.Xd() ^ (1795681401 ^ 1795664039)), (short) (OY.Xd() ^ (1490464318 ^ 1490479814))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {Ig.wd("'m~\u0017\u007f*", (short) (C1633zX.Xd() ^ (805959570 ^ (-805930152))))};
                                Method method = Class.forName(EO.Od(" \u0004\n2x\u0017\u007f,\u0018BEgDC]pSi@RzQ3", (short) (C1499aX.Xd() ^ (1410381274 ^ (-1410384372))))).getMethod(C1593ug.zd("wv\u0007f\u000e\t\u000b|\u0006l\u007f\u000e\u0013\u0007\u0002\u0005", (short) (C1580rY.Xd() ^ (1443450735 ^ (-1443433683))), (short) (C1580rY.Xd() ^ (584441357 ^ (-584446166)))), Class.forName(C1561oA.Qd("6,@*u3'3+p\u001552(,$", (short) (Od.Xd() ^ ((1583463417 ^ 1648346990) ^ (-1012816753))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strOd = C1561oA.od(";(m+\u000f", (short) (C1499aX.Xd() ^ (1892960475 ^ (-1892954281))));
                                    String strKd = C1561oA.Kd("G=", (short) (C1607wl.Xd() ^ ((435054630 ^ 1119364039) ^ 1532387174)));
                                    try {
                                        Class<?> cls4 = Class.forName(strOd);
                                        Field field4 = 0 != 0 ? cls4.getField(strKd) : cls4.getDeclaredField(strKd);
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
                    String strZd = Wg.Zd("K\u0007\u0006\u0011V", (short) (C1499aX.Xd() ^ ((1527505987 ^ 909588957) ^ (-1832689782))), (short) (C1499aX.Xd() ^ (629854506 ^ (-629845154))));
                    String strXd = C1561oA.Xd("RH", (short) (C1499aX.Xd() ^ (657883593 ^ (-657903792))));
                    try {
                        Class<?> cls5 = Class.forName(strZd);
                        Field field5 = 0 != 0 ? cls5.getField(strXd) : cls5.getDeclaredField(strXd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strVd2 = Wg.vd("A0w7\u001d", (short) (OY.Xd() ^ ((1407784854 ^ 1854323956) ^ 1030719461)));
                        String strKd2 = Qg.kd("}q", (short) (Od.Xd() ^ (696752247 ^ (-696756205))), (short) (Od.Xd() ^ (698118389 ^ (-698099126))));
                        try {
                            Class<?> cls6 = Class.forName(strVd2);
                            Field field6 = 0 != 0 ? cls6.getField(strKd2) : cls6.getDeclaredField(strKd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i5 = (1938280327 ^ 1286339356) ^ 1059861712;
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
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_incode);
    }
}
