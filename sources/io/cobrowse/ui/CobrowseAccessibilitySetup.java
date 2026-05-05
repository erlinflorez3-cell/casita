package io.cobrowse.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import io.cobrowse.CobrowseAccessibilityService;
import io.cobrowse.R;
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
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class CobrowseAccessibilitySetup extends Activity {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strXd = ZO.xd("WiRJ[", (short) (C1580rY.Xd() ^ ((475145796 ^ 551796870) ^ (-1018277186))), (short) (C1580rY.Xd() ^ (2001804996 ^ (-2001800856))));
            String strUd = C1626yg.Ud("\u001f.", (short) (ZN.Xd() ^ ((1017719961 ^ 1316425204) ^ 1927160049)), (short) (ZN.Xd() ^ ((1130799793 ^ 987597191) ^ 2042314147)));
            try {
                Class<?> cls = Class.forName(strXd);
                Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strWd = Ig.wd(")g:\u001fa", (short) (C1607wl.Xd() ^ ((159885413 ^ 1015411616) ^ 889331229)));
                String strOd = EO.Od("`'", (short) (FB.Xd() ^ (1606233556 ^ 1606249740)));
                try {
                    Class<?> cls2 = Class.forName(strWd);
                    Field field2 = 0 != 0 ? cls2.getField(strOd) : cls2.getDeclaredField(strOd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strQd = C1561oA.Qd(">+p.\u0012", (short) (C1580rY.Xd() ^ (633844085 ^ (-633851962))));
                    String strZd = C1593ug.zd("{q", (short) (OY.Xd() ^ ((2078214234 ^ 1702361367) ^ 514370104)), (short) (OY.Xd() ^ (211684884 ^ 211683002)));
                    try {
                        Class<?> cls3 = Class.forName(strQd);
                        Field field3 = 0 != 0 ? cls3.getField(strZd) : cls3.getDeclaredField(strZd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(C1561oA.od(",\u0019^(\b", (short) (FB.Xd() ^ ((1905647728 ^ 49659977) ^ 1935699887)))).getDeclaredMethod(C1561oA.Kd("Ta", (short) (C1580rY.Xd() ^ (1043811148 ^ (-1043802205)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {Wg.Zd("+0\u0010)\u000f)", (short) (ZN.Xd() ^ ((1104810510 ^ 1197984901) ^ 113092672)), (short) (ZN.Xd() ^ ((2121544065 ^ 1402320363) ^ 769766164)))};
                                Method method = Class.forName(C1561oA.Xd("/=4CA<8\u00039FFM?IP\u000b!NNUG[X", (short) (C1499aX.Xd() ^ (2064169244 ^ (-2064185867))))).getMethod(Qg.kd("TQ_=b[[KR7HTWIBC", (short) (FB.Xd() ^ ((2110127310 ^ 2018834035) ^ 93406880)), (short) (FB.Xd() ^ ((1577126468 ^ 1915721265) ^ 741271550))), Class.forName(Wg.vd("SI]G\u001bXLXX\u001eBbg]aY", (short) (OY.Xd() ^ ((1001197166 ^ 1477308399) ^ 1671480405)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strVd = hg.Vd("{h.kO", (short) (OY.Xd() ^ ((1053902071 ^ 546067022) ^ 509423429)), (short) (OY.Xd() ^ (1600976204 ^ 1600952479)));
                                    short sXd = (short) (C1633zX.Xd() ^ ((47143705 ^ 1193790216) ^ (-1172896351)));
                                    int[] iArr = new int["WK".length()];
                                    QB qb = new QB("WK");
                                    int i2 = 0;
                                    while (qb.YK()) {
                                        int iKK = qb.KK();
                                        Xu xuXd = Xu.Xd(iKK);
                                        iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                                        i2++;
                                    }
                                    String str = new String(iArr, 0, i2);
                                    try {
                                        Class<?> cls4 = Class.forName(strVd);
                                        Field field4 = 0 != 0 ? cls4.getField(str) : cls4.getDeclaredField(str);
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
                    String strYd = C1561oA.yd("L;~>(", (short) (FB.Xd() ^ ((1592731056 ^ 2033404391) ^ 668747998)));
                    String strYd2 = C1561oA.Yd("\u001c\u0012", (short) (C1607wl.Xd() ^ ((1352730988 ^ 28726444) ^ 1360493269)));
                    try {
                        Class<?> cls5 = Class.forName(strYd);
                        Field field5 = 0 != 0 ? cls5.getField(strYd2) : cls5.getDeclaredField(strYd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strQd2 = Xg.qd("=,s3\u0019", (short) (C1633zX.Xd() ^ (954891248 ^ (-954864189))), (short) (C1633zX.Xd() ^ (1903782376 ^ (-1903768335))));
                        String strWd2 = Jg.Wd("!T", (short) (FB.Xd() ^ (970642183 ^ 970627053)), (short) (FB.Xd() ^ ((1084937537 ^ 1723370430) ^ 638733016)));
                        try {
                            Class<?> cls6 = Class.forName(strQd2);
                            Field field6 = 0 != 0 ? cls6.getField(strWd2) : cls6.getDeclaredField(strWd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i3 = (681442144 ^ 1849751291) ^ 1188892112;
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

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_cobrowse_accessibility_setup);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (CobrowseAccessibilityService.isRunning(this)) {
            finish();
        }
    }

    public void openAccessibilitySettings(View view) throws Exception {
        Intent intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
        intent.addFlags(268435456);
        CX.ud();
        startActivity(intent);
        finish();
    }
}
