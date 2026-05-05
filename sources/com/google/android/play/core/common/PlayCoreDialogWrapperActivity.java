package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
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

/* JADX INFO: loaded from: classes9.dex */
public class PlayCoreDialogWrapperActivity extends Activity {
    private ResultReceiver zza;

    private final void zza() {
        ResultReceiver resultReceiver = this.zza;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
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
            String strXd = ZO.xd("RK-s,", (short) (C1633zX.Xd() ^ (729930567 ^ (-729910791))), (short) (C1633zX.Xd() ^ ((1873690887 ^ 1215787430) ^ (-668563998))));
            String strUd = C1626yg.Ud("rD", (short) (ZN.Xd() ^ ((1032671398 ^ 1464828024) ^ 1791163126)), (short) (ZN.Xd() ^ (1073700807 ^ 1073702533)));
            try {
                Class<?> cls = Class.forName(strXd);
                Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strWd = Ig.wd("(F~!\\", (short) (ZN.Xd() ^ (434386494 ^ 434394657)));
                String strOd = EO.Od(":N", (short) (OY.Xd() ^ (834989802 ^ 834972231)));
                try {
                    Class<?> cls2 = Class.forName(strWd);
                    Field field2 = 0 != 0 ? cls2.getField(strOd) : cls2.getDeclaredField(strOd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strQd = C1561oA.Qd("P=\u0003@$", (short) (Od.Xd() ^ (415831892 ^ (-415828403))));
                    String strZd = C1593ug.zd("si", (short) (C1633zX.Xd() ^ ((332987463 ^ 306022318) ^ (-31810398))), (short) (C1633zX.Xd() ^ ((1077476197 ^ 1399543237) ^ (-324241402))));
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
                        Method declaredMethod = Class.forName(C1561oA.od("S@\u0006O/", (short) (C1580rY.Xd() ^ ((2075912018 ^ 2046789722) ^ (-38037186))))).getDeclaredMethod(C1561oA.Kd("\"/", (short) (OY.Xd() ^ (1513603901 ^ 1513606926))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strZd2 = Wg.Zd("W9j[\u0017z", (short) (C1580rY.Xd() ^ ((1291116792 ^ 324716957) ^ (-1605261360))), (short) (C1580rY.Xd() ^ (938534805 ^ (-938537531))));
                                Class<?> cls4 = Class.forName(C1561oA.Xd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o\u000633:,@=", (short) (C1580rY.Xd() ^ ((469307852 ^ 2000096276) ^ (-1825455750)))));
                                Class<?>[] clsArr = new Class[1];
                                short sXd = (short) (Od.Xd() ^ (727416169 ^ (-727393077)));
                                int[] iArr = new int["\u0007~\u0015\u0001N\u000e\u0004\u0012{Ci\f\u000b\u0003\t\u0003".length()];
                                QB qb = new QB("\u0007~\u0015\u0001N\u000e\u0004\u0012{Ci\f\u000b\u0003\t\u0003");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                                    i2++;
                                }
                                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                                Object[] objArr2 = {strZd2};
                                Method method = cls4.getMethod(Qg.kd("\"\u001f-\u000b0))\u0019 \u0005\u0016\"%\u0017\u0010\u0011", (short) (Od.Xd() ^ ((1659781165 ^ 744099660) ^ (-1320446443))), (short) (Od.Xd() ^ ((2003088304 ^ 1323615403) ^ (-964713669)))), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strVd = hg.Vd("-\u001a_\u001d\u0001", (short) (ZN.Xd() ^ (1674032242 ^ 1674042957)), (short) (ZN.Xd() ^ ((1428634076 ^ 1664787056) ^ 907920717)));
                                    short sXd2 = (short) (C1607wl.Xd() ^ ((872973375 ^ 1748057777) ^ 1547300577));
                                    int[] iArr2 = new int["*\u001e".length()];
                                    QB qb2 = new QB("*\u001e");
                                    int i3 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
                                        i3++;
                                    }
                                    String str = new String(iArr2, 0, i3);
                                    try {
                                        Class<?> cls5 = Class.forName(strVd);
                                        Field field4 = 0 != 0 ? cls5.getField(str) : cls5.getDeclaredField(str);
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
                    String strYd = C1561oA.yd("l[#bH", (short) (C1607wl.Xd() ^ (1898965173 ^ 1898958439)));
                    String strYd2 = C1561oA.Yd("si", (short) (FB.Xd() ^ (1200294808 ^ 1200295336)));
                    try {
                        Class<?> cls6 = Class.forName(strYd);
                        Field field5 = 0 != 0 ? cls6.getField(strYd2) : cls6.getDeclaredField(strYd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strQd2 = Xg.qd("\u0013\u0002I\tn", (short) (C1580rY.Xd() ^ (1333090685 ^ (-1333091989))), (short) (C1580rY.Xd() ^ (52912355 ^ (-52917004))));
                        String strWd2 = Jg.Wd("{D", (short) (C1580rY.Xd() ^ (1541096794 ^ (-1541088357))), (short) (C1580rY.Xd() ^ ((504764585 ^ 930367401) ^ (-694297114))));
                        try {
                            Class<?> cls7 = Class.forName(strQd2);
                            Field field6 = 0 != 0 ? cls7.getField(strWd2) : cls7.getDeclaredField(strWd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i4 = (1192703333 ^ 1724013217) ^ 567635855;
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

    @Override // android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 0 && (resultReceiver = this.zza) != null) {
            if (i3 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i3 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.zza = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.zza = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        PendingIntent pendingIntent = extras != null ? (PendingIntent) extras.get("confirmation_intent") : null;
        if (extras == null || pendingIntent == null) {
            zza();
            finish();
        } else {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                zza();
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.zza);
    }
}
