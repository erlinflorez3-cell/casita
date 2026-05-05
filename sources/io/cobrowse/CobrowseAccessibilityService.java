package io.cobrowse;

import android.accessibilityservice.AccessibilityService;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import io.cobrowse.CobrowseService;
import io.cobrowse.ui.CobrowseAccessibilitySetup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class CobrowseAccessibilityService extends AccessibilityService {
    private ControlInjectorAccessibility controlInjector;
    private String currentShownAppId;
    private FullDeviceOverlayAccessibility overlayInjector;

    interface AccessibilityInjector {
        void onDestroy();
    }

    public static boolean isEnabled(Context context) throws Throwable {
        PackageInfo packageInfo;
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("ESFUOJB\rO\\X_MWZ\u00157d`gUib", (short) (C1580rY.Xd() ^ (-5512)))).getMethod(Qg.kd(";8F!129.30\u0017*6(-*6", (short) (OY.Xd() ^ 6404), (short) (OY.Xd() ^ 14220)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls = Class.forName(hg.Vd("=I>KG@:\u00037B@E5=Bz\u000f:8=-?:", (short) (C1633zX.Xd() ^ (-24802)), (short) (C1633zX.Xd() ^ (-8201))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (ZN.Xd() ^ 14293);
                int[] iArr = new int["0-;\u0016&'.#(%\r\u001f*!".length()];
                QB qb = new QB("0-;\u0016&'.#(%\r\u001f*!");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    Class<?> cls2 = Class.forName(C1561oA.yd("\u0011\u001d\u0012\u001f#\u001c\u0016^\u000b\u0016\u0014\u0019\u0011\u0019\u001eV\u0010\fKl\u0005\u0006\r\u0002~{bu\n{\u0001}\u0002", (short) (C1580rY.Xd() ^ (-19814))));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(C1561oA.Yd("7/E1~>4B<\u0004*LKCIC", (short) (FB.Xd() ^ 17451)));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 4};
                    Method method3 = cls2.getMethod(Xg.qd("\u001d\u001c,\t\u001b\u001e'\u001e%$\t/(2", (short) (C1580rY.Xd() ^ (-526)), (short) (C1580rY.Xd() ^ (-16301))), clsArr2);
                    try {
                        method3.setAccessible(true);
                        packageInfo = (PackageInfo) method3.invoke(packageManager, objArr3);
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
            ZO.xd("|f\u000b;wR ]\u001b\u0014", (short) (C1633zX.Xd() ^ (-17247)), (short) (C1633zX.Xd() ^ (-7462)));
            C1626yg.Ud("\",]\u0002IhY\u001f-9J{\u0002fU~(x\u001df't\u0015Qdy@\"kV7\u0017}U\u0002", (short) (C1499aX.Xd() ^ (-25632)), (short) (C1499aX.Xd() ^ (-8615)));
        }
        if (packageInfo.services == null) {
            return false;
        }
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (CobrowseAccessibilityService.class.getName().equals(serviceInfo.name)) {
                if (serviceInfo.isEnabled()) {
                    return Jg.Wd("Qm\u001b\u0007;eX@y~C\u001dP\u000b\u0002\u0016\u0014\"\u001a\rJ~i,{%E/k\u0013\t)\u001fIeX\r9-GCm\u007f^\u0018", (short) (OY.Xd() ^ 11725), (short) (OY.Xd() ^ 18404)).equals(serviceInfo.permission);
                }
                return false;
            }
        }
        return false;
    }

    public static boolean isRunning(Context context) throws Throwable {
        ComponentName componentName = new ComponentName(context, (Class<?>) CobrowseAccessibilityService.class);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("\u0012n\u0003,y?\"+>IRn18.\u0001aw^)W\u0012s", (short) (FB.Xd() ^ 24573))).getMethod(EO.Od("s!TI(kS\u0017rzp(dT\u007f2EZ", (short) (FB.Xd() ^ 3456)), new Class[0]);
        try {
            method.setAccessible(true);
            String string = Settings.Secure.getString((ContentResolver) method.invoke(context, objArr), C1561oA.Qd("\u0014\u001c\u000e\u000e\u0017\u000f\r\u0007\b\t\b\t\u0016\u0015\n\u0002\b\n\u0006\u0010\u0014x\f|\t\f}vw\u0005", (short) (C1607wl.Xd() ^ 32667)));
            if (string == null) {
                return false;
            }
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(AbstractJsonLexerKt.COLON);
            simpleStringSplitter.setString(string);
            while (simpleStringSplitter.hasNext()) {
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(simpleStringSplitter.next());
                if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.equals(componentName)) {
                    return true;
                }
            }
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void showSetup(Context context) throws Exception {
        boolean zIsEnabled = isEnabled(context);
        C1593ug.zd("e\u0013\u0007\u0018\u0016\u001f\u001c\u000fJ\r\u0010\u0011\u0014#$\u001b\u0015\u001d!\u001f+1X- .3'\"%`+6c*4(*5//k.<3oCGAB>D>", (short) (OY.Xd() ^ 17816), (short) (OY.Xd() ^ 15811));
        C1561oA.od("\u0013>0?;B=.\u0011\u0016", (short) (C1499aX.Xd() ^ (-21309)));
        if (!zIsEnabled || isRunning(context)) {
            return;
        }
        C1561oA.Kd("n\u001c\u0010!\u001f(%\u0018S\u0016\u0019\u001a\u001d,-$\u001e&*(4:a6)7<0+.i4?l3=13>88t8LLxHJP|PTNOKQK\u0013\u0006@W^\nYQRR\u000fd`\u0012XbVXc]\u0019co*", (short) (C1499aX.Xd() ^ (-23759)));
        Intent intent = new Intent(context, (Class<?>) CobrowseAccessibilitySetup.class);
        intent.addFlags(268435456);
        CX.ud();
        short sXd = (short) (C1607wl.Xd() ^ 8091);
        short sXd2 = (short) (C1607wl.Xd() ^ 4852);
        int[] iArr = new int["\bd+\bd/x#(\u0003R8wQu~do>\u0015TH\u0014".length()];
        QB qb = new QB("\bd+\bd/x#(\u0003R8wQu~do>\u0015TH\u0014");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {intent};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd("..\u001a*+v\u0018(,8*48", (short) (FB.Xd() ^ 16731)), Class.forName(C1561oA.Xd("\u0010\u001e\u0015$\"\u001d\u0019c\u001a''. *1k\b.5'18", (short) (OY.Xd() ^ 2895))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void updateShownAppId(String str) {
        if (this.currentShownAppId == null && str.equals("com.android.settings")) {
            try {
                CobrowseIO.instance().launchApp();
            } catch (Throwable th) {
                String str2 = "CobrowseAccessibilityService failed to launch app: " + th.getMessage();
            }
        }
        this.currentShownAppId = str;
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32 && accessibilityEvent.getPackageName() != null) {
            updateShownAppId(accessibilityEvent.getPackageName().toString());
        }
        try {
            ControlInjectorAccessibility controlInjectorAccessibility = this.controlInjector;
            if (controlInjectorAccessibility != null) {
                controlInjectorAccessibility.onAccessibilityEvent(accessibilityEvent);
            }
        } catch (Throwable th) {
            String str = "CobrowseAccessibilityService error processing event" + th.getMessage();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.currentShownAppId = null;
        FullDeviceOverlayAccessibility fullDeviceOverlayAccessibility = this.overlayInjector;
        if (fullDeviceOverlayAccessibility != null) {
            try {
                fullDeviceOverlayAccessibility.onDestroy();
            } catch (Throwable th) {
                String str = "CobrowseAccessibilityService error destroying injector" + th.getMessage();
            }
            this.overlayInjector = null;
        }
        ControlInjectorAccessibility controlInjectorAccessibility = this.controlInjector;
        if (controlInjectorAccessibility != null) {
            try {
                controlInjectorAccessibility.onDestroy();
                sendStateUpdate(false);
            } catch (Throwable th2) {
                String str2 = "CobrowseAccessibilityService error destroying injector" + th2.getMessage();
            }
            this.controlInjector = null;
        }
        super.onDestroy();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onInterrupt() {
    }

    @Override // android.accessibilityservice.AccessibilityService
    protected void onServiceConnected() {
        super.onServiceConnected();
        this.currentShownAppId = null;
        sendStateUpdate(true);
        try {
            AccessibilityNodeInfo rootInActiveWindow = getRootInActiveWindow();
            if (rootInActiveWindow != null && rootInActiveWindow.getPackageName() != null) {
                updateShownAppId(rootInActiveWindow.getPackageName().toString());
            }
        } catch (Exception e2) {
            String str = "Failed to invoke getRootInActiveWindow: " + e2.getMessage();
        }
        if (this.overlayInjector == null) {
            try {
                this.overlayInjector = new FullDeviceOverlayAccessibility(this);
            } catch (Throwable th) {
                String str2 = "CobrowseAccessibilityService error creating injector" + th.getMessage();
            }
        }
        if (this.controlInjector != null) {
            return;
        }
        try {
            this.controlInjector = new ControlInjectorAccessibility(this);
        } catch (Throwable th2) {
            String str3 = "CobrowseAccessibilityService error creating injector" + th2.getMessage();
        }
    }

    void sendStateUpdate(boolean z2) {
        Intent intent = new Intent(this, (Class<?>) CobrowseService.Receiver.class);
        intent.setAction("io.cobrowse.ACCESSIBILITY_UPDATED");
        intent.putExtra("running", z2);
        sendBroadcast(intent);
    }
}
