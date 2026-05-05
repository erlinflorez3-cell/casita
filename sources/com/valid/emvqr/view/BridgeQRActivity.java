package com.valid.emvqr.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.valid.emvqr.a4;
import com.valid.emvqr.qb;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.EventBus;
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
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class BridgeQRActivity extends AppCompatActivity {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strWd = Jg.Wd("D|:(\b", (short) (FB.Xd() ^ ((493124992 ^ 1601560899) ^ 1108470504)), (short) (FB.Xd() ^ ((1617106504 ^ 1089090537) ^ 545873959)));
            String strXd = ZO.xd("l\u001a", (short) (C1499aX.Xd() ^ (1866966413 ^ (-1866977867))), (short) (C1499aX.Xd() ^ ((658100101 ^ 1249563756) ^ (-1833125991))));
            try {
                Class<?> cls = Class.forName(strWd);
                Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1626yg.Ud("iVJM\u0003", (short) (OY.Xd() ^ (516980636 ^ 516956847)), (short) (OY.Xd() ^ ((1679669553 ^ 437509030) ^ 2114871742)));
                short sXd = (short) (Od.Xd() ^ (1805517628 ^ (-1805518946)));
                int[] iArr = new int["2V".length()];
                QB qb = new QB("2V");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
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
                    String strOd = EO.Od("j#;a\u001e", (short) (ZN.Xd() ^ ((1292600767 ^ 873340143) ^ 2030410089)));
                    short sXd2 = (short) (C1607wl.Xd() ^ ((450527135 ^ 1984023292) ^ 1822148540));
                    int[] iArr2 = new int["\u0016\n".length()];
                    QB qb2 = new QB("\u0016\n");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls3 = Class.forName(strOd);
                        Field field3 = 0 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Class<?> cls4 = Class.forName(C1593ug.zd("jY!lN", (short) (ZN.Xd() ^ ((648613634 ^ 1965002730) ^ 1404498696)), (short) (ZN.Xd() ^ ((2059465055 ^ 2050626520) ^ 16434403))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd3 = (short) (C1607wl.Xd() ^ ((1522838388 ^ 1960111293) ^ 772827626));
                        int[] iArr3 = new int["lw".length()];
                        QB qb3 = new QB("lw");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
                            i4++;
                        }
                        Method declaredMethod = cls4.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd4 = (short) (C1580rY.Xd() ^ ((550815633 ^ 2138650891) ^ (-1605219416)));
                                int[] iArr4 = new int["\u001c\u000f\u0015\f\u0018!".length()];
                                QB qb4 = new QB("\u001c\u000f\u0015\f\u0018!");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd4 + sXd4) + i5));
                                    i5++;
                                }
                                String str3 = new String(iArr4, 0, i5);
                                short sXd5 = (short) (OY.Xd() ^ ((1172115579 ^ 1477870888) ^ 499900288));
                                short sXd6 = (short) (OY.Xd() ^ (1411605226 ^ 1411603670));
                                int[] iArr5 = new int["!\u0014q[O%\b6W;%\u0013gOK`\\d[5\u0015\u000eu".length()];
                                QB qb5 = new QB("!\u0014q[O%\b6W;%\u0013gOK`\\d[5\u0015\u000eu");
                                int i6 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i6] = xuXd5.fK(((i6 * sXd6) ^ sXd5) + xuXd5.CK(iKK5));
                                    i6++;
                                }
                                Class<?> cls5 = Class.forName(new String(iArr5, 0, i6));
                                Class<?>[] clsArr2 = new Class[1];
                                short sXd7 = (short) (ZN.Xd() ^ ((1206107429 ^ 306025654) ^ 1440618343));
                                int[] iArr6 = new int["nf|h6ukys;a\u0004\u0003z\u0001z".length()];
                                QB qb6 = new QB("nf|h6ukys;a\u0004\u0003z\u0001z");
                                int i7 = 0;
                                while (qb6.YK()) {
                                    int iKK6 = qb6.KK();
                                    Xu xuXd6 = Xu.Xd(iKK6);
                                    iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (sXd7 + i7));
                                    i7++;
                                }
                                clsArr2[0] = Class.forName(new String(iArr6, 0, i7));
                                Object[] objArr2 = {str3};
                                Method method = cls5.getMethod(Wg.vd(".-9\u0019<75'<#2@A5,/", (short) (OY.Xd() ^ ((395831035 ^ 33718000) ^ 362133258))), clsArr2);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd8 = (short) (C1499aX.Xd() ^ ((1819253688 ^ 1024537418) ^ (-1367267878)));
                                    short sXd9 = (short) (C1499aX.Xd() ^ ((494423231 ^ 2139140593) ^ (-1660469394)));
                                    int[] iArr7 = new int["\ry?|`".length()];
                                    QB qb7 = new QB("\ry?|`");
                                    int i8 = 0;
                                    while (qb7.YK()) {
                                        int iKK7 = qb7.KK();
                                        Xu xuXd7 = Xu.Xd(iKK7);
                                        iArr7[i8] = xuXd7.fK(((sXd8 + i8) + xuXd7.CK(iKK7)) - sXd9);
                                        i8++;
                                    }
                                    String str4 = new String(iArr7, 0, i8);
                                    String strVd = hg.Vd("H<", (short) (OY.Xd() ^ ((868014121 ^ 1242382033) ^ 2041680487)), (short) (OY.Xd() ^ (770947286 ^ 770945678)));
                                    try {
                                        Class<?> cls6 = Class.forName(str4);
                                        Field field4 = 0 != 0 ? cls6.getField(strVd) : cls6.getDeclaredField(strVd);
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
                    short sXd10 = (short) (OY.Xd() ^ ((454434633 ^ 1690664086) ^ 2144541626));
                    int[] iArr8 = new int["\nv<y]".length()];
                    QB qb8 = new QB("\nv<y]");
                    int i9 = 0;
                    while (qb8.YK()) {
                        int iKK8 = qb8.KK();
                        Xu xuXd8 = Xu.Xd(iKK8);
                        iArr8[i9] = xuXd8.fK(sXd10 + i9 + xuXd8.CK(iKK8));
                        i9++;
                    }
                    String str5 = new String(iArr8, 0, i9);
                    String strYd = C1561oA.yd("C7", (short) (OY.Xd() ^ (2105828980 ^ 2105817915)));
                    try {
                        Class<?> cls7 = Class.forName(str5);
                        Field field5 = 0 != 0 ? cls7.getField(strYd) : cls7.getDeclaredField(strYd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strYd2 = C1561oA.Yd("`O\u0017V<", (short) (Od.Xd() ^ (381003082 ^ (-381003312))));
                        String strQd = Xg.qd(ExpandedProductParsedResult.POUND, (short) (C1607wl.Xd() ^ ((505569401 ^ 443865682) ^ 72806086)), (short) (C1607wl.Xd() ^ ((2133448917 ^ 1505152159) ^ 647981597)));
                        try {
                            Class<?> cls8 = Class.forName(strYd2);
                            Field field6 = 0 != 0 ? cls8.getField(strQd) : cls8.getDeclaredField(strQd);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i10 = 551865999 ^ 551866052;
                        if (x2 > i10 && x2 < displayMetrics.widthPixels - i10 && y2 > i10 && y2 < displayMetrics.heightPixels - i10) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        IntentResult activityResult = IntentIntegrator.parseActivityResult(i2, i3, intent);
        if (intent != null && activityResult.getContents() != null) {
            EventBus.getDefault().post(activityResult.getContents());
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Exception {
        IntentIntegrator intentIntegrator;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        super.onCreate(bundle);
        int iXd = FB.Xd() ^ 1609504603;
        short sXd = (short) (FB.Xd() ^ (2144949426 ^ 2144938070));
        short sXd2 = (short) (FB.Xd() ^ iXd);
        int[] iArr = new int[RemoteSettings.FORWARD_SLASH_STRING.length()];
        QB qb = new QB(RemoteSettings.FORWARD_SLASH_STRING);
        int i7 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i7] = xuXd.fK(xuXd.CK(iKK) - ((i7 * sXd2) ^ sXd));
            i7++;
        }
        String str2 = new String(iArr, 0, i7);
        int i8 = Integer.parseInt(str2);
        IntentIntegrator intentIntegrator2 = null;
        String strXd = ZO.xd("\u001db", (short) (Od.Xd() ^ (855147492 ^ (-855165548))), (short) (Od.Xd() ^ (1297279462 ^ (-1297271185))));
        if (i8 != 0) {
            i2 = (293313465 ^ 174041637) ^ 455356817;
            str = str2;
            intentIntegrator = null;
        } else {
            intentIntegrator = new IntentIntegrator(this);
            i2 = 10;
            str = strXd;
        }
        if (i2 != 0) {
            intentIntegrator.setDesiredBarcodeFormats(a4.indexOf(1187130253 ^ 1187130248, C1626yg.Ud("{j34\u00182@", (short) (C1580rY.Xd() ^ (449889816 ^ (-449901713))), (short) (C1580rY.Xd() ^ (1362310131 ^ (-1362310488))))));
            str = str2;
            intentIntegrator2 = intentIntegrator;
            i3 = 0;
        } else {
            i3 = i2 + 11;
        }
        if (Integer.parseInt(str) != 0) {
            i4 = i3 + 8;
            strXd = str;
        } else {
            intentIntegrator2.setCameraId(getIntent().getIntExtra(qb.substring(Ig.wd("r<k|<n\t4", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951467066)))), 1), 0));
            i4 = i3 + 15;
        }
        if (i4 != 0) {
            intentIntegrator2.setBeepEnabled(false);
            i5 = 0;
        } else {
            i5 = i4 + 4;
            str2 = strXd;
        }
        if (Integer.parseInt(str2) != 0) {
            i6 = i5 + 12;
        } else {
            intentIntegrator2.setBarcodeImageEnabled(false);
            i6 = i5 + 6;
        }
        if (i6 != 0) {
            intentIntegrator2.setCaptureActivity(CustomizableQRActivity.class);
        } else {
            int i9 = (29730646 ^ 29730638) / 15;
        }
        intentIntegrator2.initiateScan();
    }
}
