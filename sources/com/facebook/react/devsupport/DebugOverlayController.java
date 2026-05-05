package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
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
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
class DebugOverlayController {
    private FrameLayout mFPSDebugViewContainer;
    private final ReactContext mReactContext;
    private final WindowManager mWindowManager;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DebugOverlayController$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ boolean val$fpsDebugViewVisible;

        AnonymousClass1(boolean z2) {
            z = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!z || DebugOverlayController.this.mFPSDebugViewContainer != null) {
                if (z || DebugOverlayController.this.mFPSDebugViewContainer == null) {
                    return;
                }
                DebugOverlayController.this.mFPSDebugViewContainer.removeAllViews();
                DebugOverlayController.this.mWindowManager.removeView(DebugOverlayController.this.mFPSDebugViewContainer);
                DebugOverlayController.this.mFPSDebugViewContainer = null;
                return;
            }
            if (!DebugOverlayController.permissionCheck(DebugOverlayController.this.mReactContext)) {
                FLog.d(ReactConstants.TAG, "Wait for overlay permission to be set");
                return;
            }
            DebugOverlayController.this.mFPSDebugViewContainer = new FpsView(DebugOverlayController.this.mReactContext);
            DebugOverlayController.this.mWindowManager.addView(DebugOverlayController.this.mFPSDebugViewContainer, new WindowManager.LayoutParams(-1, -1, WindowOverlayCompat.TYPE_SYSTEM_OVERLAY, 24, -3));
        }
    }

    public DebugOverlayController(ReactContext reactContext) {
        this.mReactContext = reactContext;
        this.mWindowManager = (WindowManager) reactContext.getSystemService("window");
    }

    private static boolean canHandleIntent(Context context, Intent intent) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("\n\u0018\u000f\u001e\u001c\u0017\u0013]\u0014!!(\u001a$+e{))0\"63", (short) (FB.Xd() ^ 15888), (short) (FB.Xd() ^ 20754))).getMethod(Jg.Wd("VL/Z\u001f|X>\u0018i\rpQ\u0018\u001agH", (short) (OY.Xd() ^ 32489), (short) (OY.Xd() ^ 5479)), new Class[0]);
        try {
            method.setAccessible(true);
            return intent.resolveActivity((PackageManager) method.invoke(context, objArr)) != null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static boolean hasPermission(Context context, String str) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("<+pI46j\tp\u0007l\"+4\r aMZ\u0006\nu,", (short) (ZN.Xd() ^ 8430), (short) (ZN.Xd() ^ 18507))).getMethod(C1626yg.Ud("\u001dm[2!pD{4.\u0001'tEk\\\u001e", (short) (Od.Xd() ^ (-2018)), (short) (Od.Xd() ^ (-15465))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Ig.wd("\u001aa\b4vC\u00180\u0006twY~\b\u0014*q.c0a\u001fn", (short) (C1580rY.Xd() ^ (-1031)))).getMethod(EO.Od("vBUW\u001bqK$l\rm%\u007f{", (short) (FB.Xd() ^ 27548)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str2 = (String) method2.invoke(context, objArr2);
                    short sXd = (short) (FB.Xd() ^ 15887);
                    int[] iArr = new int["BNCPLE?\b<GEJ:BG\u007fA=|\u001e./6+0-\u0014'3%*'3".length()];
                    QB qb = new QB("BNCPLE?\b<GEJ:BG\u007fA=|\u001e./6+0-\u0014'3%*'3");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i2));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1593ug.zd("\u0011\t\u001f\u000bX\u0018\u000e\u001c\u0016]\u0004&%\u001d#\u001d", (short) (FB.Xd() ^ 7494), (short) (FB.Xd() ^ 26893)));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str2, 4096};
                    Method method3 = cls.getMethod(C1561oA.od("\n\u0007\u0015o\u007f\u0001\b|\u0002~a\u0006|\u0005", (short) (Od.Xd() ^ (-17724))), clsArr);
                    try {
                        method3.setAccessible(true);
                        PackageInfo packageInfo = (PackageInfo) method3.invoke(packageManager, objArr3);
                        if (packageInfo.requestedPermissions != null) {
                            String[] strArr = packageInfo.requestedPermissions;
                            for (String str3 : strArr) {
                                if (str3.equals(str)) {
                                    return true;
                                }
                            }
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            FLog.e(C1561oA.Kd("bvsv\tcw\f\u0002\u0010\u007f", (short) (Od.Xd() ^ (-31859))), Wg.Zd("dS\u0011\u0004Do\u0019ON\u000f\u0006\u0016*\u001fWW\u0014a\\\u0001\u0004FL\u001bIA\u0007^b&NY\\&p", (short) (OY.Xd() ^ 29185), (short) (OY.Xd() ^ 28517)), e5);
        }
        return false;
    }

    public static boolean permissionCheck(Context context) {
        return Settings.canDrawOverlays(context);
    }

    public static void requestPermission(Context context) throws Exception {
        if (Settings.canDrawOverlays(context)) {
            return;
        }
        short sXd = (short) (C1607wl.Xd() ^ 5639);
        int[] iArr = new int["YKNWNUT*".length()];
        QB qb = new QB("YKNWNUT*");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        StringBuilder sb = new StringBuilder(new String(iArr, 0, i2));
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("M[N]_ZR\u001dGTPWMWZ\u0015\u001fLHOEYR", (short) (C1607wl.Xd() ^ 29983))).getMethod(Qg.kd("*'5\u0010 !(\u001d\"\u001f\u0007\u0019$\u001b", (short) (C1499aX.Xd() ^ (-12942)), (short) (C1499aX.Xd() ^ (-9238))), new Class[0]);
        try {
            method.setAccessible(true);
            Intent intent = new Intent(hg.Vd("#/$1-& h-\u001e,+\u001f#\u001b&_\u0012\u0013#\u0017\u001c\u001aXviugli\u0003qweqj^uzj^jd_hg\\a_", (short) (C1633zX.Xd() ^ (-15606)), (short) (C1633zX.Xd() ^ (-14652))), Uri.parse(sb.append((String) method.invoke(context, objArr)).toString()));
            intent.setFlags(268435456);
            FLog.w(C1561oA.ud("VhcdtM_qeq_", (short) (Od.Xd() ^ (-24506))), C1561oA.yd("\u0019A1?:0Ip2(62/:;2IIO|LDEEErHDu9=x\u0011\u001d\r\u001b\"\u0014\u0014P\u000b\u0011C\u0014\u0018\u000b\r\u001bY!+/]1%\"\u0015'S#\u0017+!/n*l|}\u0002/\u0005p\"uys&pv9~\u0001\u0013=\f\u000f\u0005v", (short) (OY.Xd() ^ 26368)));
            if (canHandleIntent(context, intent)) {
                CX.ud();
                short sXd2 = (short) (C1607wl.Xd() ^ 25399);
                int[] iArr2 = new int["SaXge`\\']jjqcmt/Erryk\u007f|".length()];
                QB qb2 = new QB("SaXge`\\']jjqcmt/Erryk\u007f|");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = {Class.forName(Xg.qd("\u000e\u001c\u0013\" \u001b\u0017a\u0018%%,\u001e(/i\u0006,3%/6", (short) (C1580rY.Xd() ^ (-28022)), (short) (C1580rY.Xd() ^ (-9182))))};
                Object[] objArr2 = {intent};
                short sXd3 = (short) (C1499aX.Xd() ^ (-6107));
                short sXd4 = (short) (C1499aX.Xd() ^ (-12973));
                int[] iArr3 = new int[" 6SPzs\u0006?`i\t@1".length()];
                QB qb3 = new QB(" 6SPzs\u0006?`i\t@1");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd4) ^ sXd3));
                    i4++;
                }
                Method method2 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                try {
                    method2.setAccessible(true);
                    method2.invoke(context, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void setFpsDebugViewVisible(boolean z2) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DebugOverlayController.1
            final /* synthetic */ boolean val$fpsDebugViewVisible;

            AnonymousClass1(boolean z22) {
                z = z22;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!z || DebugOverlayController.this.mFPSDebugViewContainer != null) {
                    if (z || DebugOverlayController.this.mFPSDebugViewContainer == null) {
                        return;
                    }
                    DebugOverlayController.this.mFPSDebugViewContainer.removeAllViews();
                    DebugOverlayController.this.mWindowManager.removeView(DebugOverlayController.this.mFPSDebugViewContainer);
                    DebugOverlayController.this.mFPSDebugViewContainer = null;
                    return;
                }
                if (!DebugOverlayController.permissionCheck(DebugOverlayController.this.mReactContext)) {
                    FLog.d(ReactConstants.TAG, "Wait for overlay permission to be set");
                    return;
                }
                DebugOverlayController.this.mFPSDebugViewContainer = new FpsView(DebugOverlayController.this.mReactContext);
                DebugOverlayController.this.mWindowManager.addView(DebugOverlayController.this.mFPSDebugViewContainer, new WindowManager.LayoutParams(-1, -1, WindowOverlayCompat.TYPE_SYSTEM_OVERLAY, 24, -3));
            }
        });
    }
}
