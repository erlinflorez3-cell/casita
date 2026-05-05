package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
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
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class TagManagerPreviewActivity extends Activity {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            short sXd = (short) (ZN.Xd() ^ (1954929305 ^ 1954926632));
            short sXd2 = (short) (ZN.Xd() ^ ((962905206 ^ 1455496408) ^ 1873125421));
            int[] iArr = new int["$\u007fIV>".length()];
            QB qb = new QB("$\u007fIV>");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            short sXd3 = (short) (C1499aX.Xd() ^ (1251330345 ^ (-1251328705)));
            short sXd4 = (short) (C1499aX.Xd() ^ ((2040752651 ^ 217603275) ^ (-1968914520)));
            int[] iArr2 = new int["L\n".length()];
            QB qb2 = new QB("L\n");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                i3++;
            }
            String str2 = new String(iArr2, 0, i3);
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1626yg.Ud("X+a\u001aB", (short) (C1580rY.Xd() ^ ((1574328335 ^ 1720279013) ^ (-996093223))), (short) (C1580rY.Xd() ^ ((1881917799 ^ 333669922) ^ (-1674103983))));
                String strWd = Ig.wd("\r*", (short) (C1633zX.Xd() ^ (1736762081 ^ (-1736754267))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strWd) : cls2.getDeclaredField(strWd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strOd = EO.Od(".cy\u001aY", (short) (ZN.Xd() ^ ((1966957417 ^ 320844705) ^ 1713537072)));
                    short sXd5 = (short) (Od.Xd() ^ ((894733839 ^ 1462040418) ^ (-1651519138)));
                    int[] iArr3 = new int["PD".length()];
                    QB qb3 = new QB("PD");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(sXd5 + sXd5 + sXd5 + i4 + xuXd3.CK(iKK3));
                        i4++;
                    }
                    String str3 = new String(iArr3, 0, i4);
                    try {
                        Class<?> cls3 = Class.forName(strOd);
                        Field field3 = 0 != 0 ? cls3.getField(str3) : cls3.getDeclaredField(str3);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(C1593ug.zd("\u007fn6\u0002c", (short) (C1499aX.Xd() ^ (1671881298 ^ (-1671877950))), (short) (C1499aX.Xd() ^ (1917237395 ^ (-1917227467))))).getDeclaredMethod(C1561oA.od("R]", (short) (Od.Xd() ^ (1368172297 ^ (-1368187923)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1561oA.Kd("j]cZfo", (short) (Od.Xd() ^ (1333043259 ^ (-1333038911))))};
                                Method method = Class.forName(Wg.Zd("L3\u001bYHiVPw+\u001cR5e]GN\u00033)L7d", (short) (C1607wl.Xd() ^ ((1971355252 ^ 539873082) ^ 1437439672)), (short) (C1607wl.Xd() ^ (885477883 ^ 885480942)))).getMethod(Wg.vd("EDT4[VXJS:M[`TOR", (short) (C1499aX.Xd() ^ ((1001400032 ^ 377990583) ^ (-758641964)))), Class.forName(C1561oA.Xd("\f\u0004\u001a\u0006S\u0013\t\u0017\u0011X~! \u0018\u001e\u0018", (short) (Od.Xd() ^ (1907061479 ^ (-1907060737))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strKd = Qg.kd("\fx>{_", (short) (FB.Xd() ^ ((156845270 ^ 1840808504) ^ 1692519070)), (short) (FB.Xd() ^ (1628821306 ^ 1628812554)));
                                    String strVd = hg.Vd("D8", (short) (C1633zX.Xd() ^ ((325022159 ^ 1452024521) ^ (-1171464860))), (short) (C1633zX.Xd() ^ (2007131047 ^ (-2007131396))));
                                    try {
                                        Class<?> cls4 = Class.forName(strKd);
                                        Field field4 = 0 != 0 ? cls4.getField(strVd) : cls4.getDeclaredField(strVd);
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
                    short sXd6 = (short) (C1633zX.Xd() ^ ((1756183541 ^ 1237798153) ^ (-560619076)));
                    int[] iArr4 = new int["TA\u0007D(".length()];
                    QB qb4 = new QB("TA\u0007D(");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(sXd6 + i5 + xuXd4.CK(iKK4));
                        i5++;
                    }
                    String str4 = new String(iArr4, 0, i5);
                    String strYd = C1561oA.yd("\r\u0003", (short) (C1607wl.Xd() ^ (2105695978 ^ 2105696072)));
                    try {
                        Class<?> cls5 = Class.forName(str4);
                        Field field5 = 0 != 0 ? cls5.getField(strYd) : cls5.getDeclaredField(strYd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        short sXd7 = (short) (C1633zX.Xd() ^ (1206071496 ^ (-1206067644)));
                        int[] iArr5 = new int["\u0014\u0003J\no".length()];
                        QB qb5 = new QB("\u0014\u0003J\no");
                        int i6 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd7 + sXd7) + sXd7) + i6));
                            i6++;
                        }
                        String str5 = new String(iArr5, 0, i6);
                        String strQd = Xg.qd("}s", (short) (ZN.Xd() ^ ((1971170987 ^ 985045018) ^ 1338705213)), (short) (ZN.Xd() ^ (2010301456 ^ 2010302660)));
                        try {
                            Class<?> cls6 = Class.forName(str5);
                            Field field6 = 0 != 0 ? cls6.getField(strQd) : cls6.getDeclaredField(strQd);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i7 = (630333188 ^ 693991286) ^ 214919225;
                        if (x2 > i7 && x2 < displayMetrics.widthPixels - i7 && y2 > i7 && y2 < displayMetrics.heightPixels - i7) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getData() == null) {
            return;
        }
        zzbo.zzf(getIntent(), this);
    }
}
