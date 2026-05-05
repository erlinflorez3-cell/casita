package com.incode.welcome_sdk.ui.camera.id_validation;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.d.l;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.camera.CameraPreviewType;
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
public class DocumentValidationActivity extends ValidationActivity {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f11565n = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f11566t = 1;

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("\u0012~D\u0002e", (short) (C1580rY.Xd() ^ (2142671002 ^ (-2142688876))), (short) (C1580rY.Xd() ^ ((1896860331 ^ 543501627) ^ (-1365951045))));
            String strVd = hg.Vd("\ry", (short) (FB.Xd() ^ ((584637418 ^ 566108970) ^ 57062608)), (short) (FB.Xd() ^ (308372838 ^ 308370842)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("Q>\u0004A%", (short) (C1633zX.Xd() ^ (1171037785 ^ (-1171031112))));
                String strYd = C1561oA.yd("hV", (short) (OY.Xd() ^ (820102983 ^ 820090641)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    short sXd = (short) (C1580rY.Xd() ^ ((1126186749 ^ 1407860667) ^ (-281704310)));
                    int[] iArr = new int["RA\tH.".length()];
                    QB qb = new QB("RA\tH.");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    String strQd = Xg.qd("KA", (short) (ZN.Xd() ^ ((1212474775 ^ 594674957) ^ 1798737667)), (short) (ZN.Xd() ^ ((168707531 ^ 600769154) ^ 700545555)));
                    try {
                        Class<?> cls3 = Class.forName(str);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("\u0019dWbm", (short) (Od.Xd() ^ ((596562688 ^ 175908893) ^ (-703767682))), (short) (Od.Xd() ^ (693249642 ^ (-693248692))))).getDeclaredMethod(ZO.xd("\u0016H", (short) (C1580rY.Xd() ^ ((1605613770 ^ 1404053594) ^ (-201565560))), (short) (C1580rY.Xd() ^ (517432341 ^ (-517434906)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strUd2 = C1626yg.Ud("zO\u000125V", (short) (ZN.Xd() ^ ((270836140 ^ 1864506233) ^ 2131151239)), (short) (ZN.Xd() ^ (1227248669 ^ 1227230330)));
                                Class<?> cls4 = Class.forName(Ig.wd("o%I\u0007\u001bp?hg\u0003{\f.Ec~Ky ^\tC\u001d", (short) (OY.Xd() ^ (1211414763 ^ 1211427798))));
                                Class<?>[] clsArr = new Class[1];
                                short sXd2 = (short) (ZN.Xd() ^ (463252195 ^ 463250280));
                                int[] iArr2 = new int["\u0015f}\u0005I,\t~*\u0011\u000f\u0014aL? ".length()];
                                QB qb2 = new QB("\u0015f}\u0005I,\t~*\u0011\u000f\u0014aL? ");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                                Object[] objArr2 = {strUd2};
                                short sXd3 = (short) (C1607wl.Xd() ^ ((1503338286 ^ 1958889412) ^ 760808852));
                                int[] iArr3 = new int[" \u001d+\t.''\u0017\u001e\u0003\u0014 #\u0015\u000e\u000f".length()];
                                QB qb3 = new QB(" \u001d+\t.''\u0017\u001e\u0003\u0014 #\u0015\u000e\u000f");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                Method method = cls4.getMethod(new String(iArr3, 0, i4), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("1 g'\r", (short) (C1607wl.Xd() ^ ((1505341945 ^ 1946215777) ^ 767126396)), (short) (C1607wl.Xd() ^ ((1599298435 ^ 268805311) ^ 1331097338)));
                                    String strOd = C1561oA.od("/#", (short) (FB.Xd() ^ (1727066433 ^ 1727061097)));
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
                    String strKd2 = C1561oA.Kd("8'n.\u0014", (short) (FB.Xd() ^ (1528090347 ^ 1528096851)));
                    String strZd2 = Wg.Zd("\u0006%", (short) (C1499aX.Xd() ^ ((521579021 ^ 1406507926) ^ (-1287852777))), (short) (C1499aX.Xd() ^ (407992894 ^ (-407977789))));
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
                        String strXd = C1561oA.Xd("8'n.\u0014", (short) (FB.Xd() ^ ((1748043648 ^ 1552505316) ^ 884497590)));
                        short sXd4 = (short) (C1607wl.Xd() ^ (1493393068 ^ 1493370165));
                        int[] iArr4 = new int["\u001b\u0011".length()];
                        QB qb4 = new QB("\u001b\u0011");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK((sXd4 ^ i5) + xuXd4.CK(iKK4));
                            i5++;
                        }
                        String str2 = new String(iArr4, 0, i5);
                        try {
                            Class<?> cls7 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls7.getField(str2) : cls7.getDeclaredField(str2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i6 = 291721165 ^ 291721094;
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

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity, com.incode.welcome_sdk.ui.camera.CameraActivity
    public void setContentView() {
        int i2 = 2 % 2;
        int i3 = f11566t + 107;
        f11565n = i3 % 128;
        int i4 = i3 % 2;
        setContentView(l.b(getLayoutInflater()).b());
        int i5 = f11565n + 17;
        f11566t = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity, com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity, com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f11566t + 83;
        f11565n = i4 % 128;
        if (i4 % 2 != 0) {
            super.safeOnCreate(bundle);
            setUseHeightPaddingFactor(false);
            setMaxPictureSizeHeight(27993);
            i2 = 25517;
        } else {
            super.safeOnCreate(bundle);
            setUseHeightPaddingFactor(false);
            setMaxPictureSizeHeight(3000);
            i2 = 2000;
        }
        setMinPictureSizeHeight(i2);
        setIgnorePictureSize(true);
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity, com.incode.welcome_sdk.ui.camera.CameraActivity
    public CameraPreviewType getCameraType() {
        int i2 = 2 % 2;
        int i3 = f11565n + 125;
        f11566t = i3 % 128;
        int i4 = i3 % 2;
        CameraPreviewType cameraPreviewType = CameraPreviewType.FIXED_WIDTH;
        int i5 = f11565n + 73;
        f11566t = i5 % 128;
        int i6 = i5 % 2;
        return cameraPreviewType;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity
    public void initShutterButtonPosition() {
        int i2 = 2 % 2;
        int i3 = f11566t + 41;
        f11565n = i3 % 128;
        int i4 = i3 % 2;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ValidationActivity) this).f11665m.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = Math.max((((getScreenHeight() - ((int) ((getScreenWidth() / 720.0f) * 1280.0f))) / 2) - ((ViewGroup.LayoutParams) layoutParams).height) / 2, 0);
        ((ValidationActivity) this).f11665m.setLayoutParams(layoutParams);
        int i5 = f11565n + 47;
        f11566t = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity, com.incode.welcome_sdk.ui.BaseView
    public ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f11565n + 9;
        f11566t = i3 % 128;
        if (i3 % 2 == 0) {
            ScreenName screenName = ScreenName.DOCUMENT_CAMERA_CAPTURE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ScreenName screenName2 = ScreenName.DOCUMENT_CAMERA_CAPTURE;
        int i4 = f11565n + 55;
        f11566t = i4 % 128;
        int i5 = i4 % 2;
        return screenName2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity, com.incode.welcome_sdk.ui.BaseView
    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f11566t + 67;
        f11565n = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = Modules.DOCUMENT_CAPTURE;
        int i5 = f11566t + 3;
        f11565n = i5 % 128;
        int i6 = i5 % 2;
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public void onPermissionMandatoryDialogClosed(Exception exc) {
        int i2 = 2 % 2;
        int i3 = f11566t + 103;
        f11565n = i3 % 128;
        if (i3 % 2 != 0) {
            handlePermissionDenied(exc);
            int i4 = 69 / 0;
        } else {
            handlePermissionDenied(exc);
        }
        int i5 = f11565n + 109;
        f11566t = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
    }
}
