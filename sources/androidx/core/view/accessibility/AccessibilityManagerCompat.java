package androidx.core.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.ReplaceWith;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
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

/* JADX INFO: loaded from: classes4.dex */
public final class AccessibilityManagerCompat {

    @Deprecated
    public interface AccessibilityStateChangeListener {
        @Deprecated
        void onAccessibilityStateChanged(boolean z2);
    }

    @Deprecated
    public static abstract class AccessibilityStateChangeListenerCompat implements AccessibilityStateChangeListener {
    }

    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean z2);
    }

    @Deprecated
    public static boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityStateChangeListener accessibilityStateChangeListener) throws Throwable {
        if (accessibilityStateChangeListener == null) {
            return false;
        }
        Object[] objArr = {new AccessibilityStateChangeListenerWrapper(accessibilityStateChangeListener)};
        Method method = Class.forName(C1561oA.ud("$0%2.'!i1#\u001e/d\u0017\u0018\u0017\u0018%$\u0019\u0011\u0017\u0019\u0015\u001f#Vh\n\t\n\u0017\u0016\u000b\u0003\t\u000b\u0007\u0011\u0015gz\u0007x}z\u0007", (short) (OY.Xd() ^ 3672))).getMethod(C1561oA.Yd("]ab@cdgvwnhptr~\u0005_\u0002o\u0004uTzt\u0003|{c\u0002\r\u000f\u0001\u000b\u0003\u0011", (short) (C1580rY.Xd() ^ (-1564))), Class.forName(C1561oA.yd("\u007f\u000e\u0001\u0010\n\u0005|G\u001d\u0011\n\u001dP\u0005\u0004\u0005\u0014# \u0017\r\u0015\u0015\u0013+1bv\u0016\u0017\u0016%2)\u001f''%-3\u0014)3'*)3e\u0010303>?2,@D>JL'E3RD\u001fE;I?>2PWYGQES", (short) (FB.Xd() ^ 1141))));
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Deprecated
    public static boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityStateChangeListener accessibilityStateChangeListener) throws Throwable {
        if (accessibilityStateChangeListener == null) {
            return false;
        }
        Object[] objArr = {new AccessibilityStateChangeListenerWrapper(accessibilityStateChangeListener)};
        Method method = Class.forName(C1561oA.Kd("\r\u001b\u0012!\u001f\u001a\u0016`*\u001e\u001b.e\u001a\u001d\u001e!01(\"*.,8>s\b+,/>?608<:FL!6D8?>L", (short) (FB.Xd() ^ 28131))).getMethod(C1561oA.Xd("7+47?/\f/03BC:4<@>JP+M;OA F@NHG/MXZLVN\\", (short) (C1633zX.Xd() ^ (-16186))), Class.forName(Wg.Zd("B}oqVL;p)\u001a\u007f\b4]\n\bysgY:54'\u0018\u001bA\u0005\u001b\u000f~\u0003xXGL=&-*\"*3\u0016\n\u0002\u0005$7K935aMD-&#\"\u000b`yRQ@LgRU<8\u000b\u0014\u0016\u0013gd[^", (short) (C1633zX.Xd() ^ (-10680)), (short) (C1633zX.Xd() ^ (-15102)))));
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static class AccessibilityStateChangeListenerWrapper implements AccessibilityManager.AccessibilityStateChangeListener {
        AccessibilityStateChangeListener mListener;

        AccessibilityStateChangeListenerWrapper(AccessibilityStateChangeListener accessibilityStateChangeListener) {
            this.mListener = accessibilityStateChangeListener;
        }

        public int hashCode() {
            return this.mListener.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityStateChangeListenerWrapper) {
                return this.mListener.equals(((AccessibilityStateChangeListenerWrapper) obj).mListener);
            }
            return false;
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z2) {
            this.mListener.onAccessibilityStateChanged(z2);
        }
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0011+%\u0014\u0005eo\u0017?B>~^GD \u0017{aK$+\u0016VQU7\u001c \u0007qxj\u0018d_O9\u001f\u001do\u007f\u0006t\u0014K", imports = {})
    @Deprecated
    public static List<AccessibilityServiceInfo> getInstalledAccessibilityServiceList(AccessibilityManager accessibilityManager) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("&z~4i!o91G=qS\u00153Tsg@>uE\"#|}\u0011|dS)\u001aiF\bQ+\f\u0010+\u0003o'@LV\t", (short) (FB.Xd() ^ 28139))).getMethod(C1561oA.Qd(":7E\u0019=AA-76.,\b)()65*\"(*&04\r\u001e*-\u001f\u0018\u0019~\u001b$$", (short) (Od.Xd() ^ (-8080))), new Class[0]);
        try {
            method.setAccessible(true);
            return (List) method.invoke(accessibilityManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0011+%\u0014\u0005eo\u0017?B>z^52+\u0010s=JF-&dGD7& \u000f\u0002WV7uV<5\b!\u0017\u000b:fQ\bs\\V,1\u0006\u001b\u0006g4\u0014}oz\u001d", imports = {})
    @Deprecated
    public static List<AccessibilityServiceInfo> getEnabledAccessibilityServiceList(AccessibilityManager accessibilityManager, int i2) throws Throwable {
        Class<?> cls = Class.forName(C1626yg.Ud("9Bq#-/4\u0012;\u0007\r\u001fK%i.Pnyq6l\u0001S\u007fS\u007f54\u0015~t'?D9 m(s][\"M\u0001X&", (short) (ZN.Xd() ^ 31092), (short) (ZN.Xd() ^ 18102)));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        short sXd = (short) (FB.Xd() ^ 24278);
        int[] iArr = new int["1\u0001]\u0016_\u000e#d\u0007uL8\n\u001a\u007fa/\u0012`\u001cR%\bYI\"\bb\u0005\u0017\u0010M\u0002+".length()];
        QB qb = new QB("1\u0001]\u0016_\u000e#d\u0007uL8\n\u001a\u007fa/\u0012`\u001cR%\bYI\"\bb\u0005\u0017\u0010M\u0002+");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            return (List) method.invoke(accessibilityManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0011+%\u0014\u0005eo\u0017AP\u001e%e78\u0004#\u007fhVU)'ZMP\u0013(\u0018|tiUl(", imports = {})
    @Deprecated
    public static boolean isTouchExplorationEnabled(AccessibilityManager accessibilityManager) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("hvm|zuq<\u0006yv\nAuxy|\f\r\u0004}\u0006\n\b\u0014\u001aOc\u0007\b\u000b\u001a\u001b\u0012\f\u0014\u0018\u0016\"(|\u0012 \u0014\u001b\u001a(", (short) (C1580rY.Xd() ^ (-4968)), (short) (C1580rY.Xd() ^ (-6912)))).getMethod(C1561oA.od("OX8RWDH$VMHJL:L@EC\u0019A33<42", (short) (C1607wl.Xd() ^ 25456)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0011+%\u0014\u0005eo\u00179A.\n_I3'o\blSR:\u0014eGQ<\r+{|i4-`[@5\b!\u0017\u000bwnQ\u00157f^<:\u0017\u0010zt\u0017", imports = {})
    @Deprecated
    public static boolean addTouchExplorationStateChangeListener(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) throws Throwable {
        Object[] objArr = {new TouchExplorationStateChangeListenerWrapper(touchExplorationStateChangeListener)};
        Method method = Class.forName(Xg.qd("n|s\u0003\u0001{wB\f\u007f|\u0010G{~\u007f\u0003\u0012\u0013\n\u0004\f\u0010\u000e\u001a Ui\r\u000e\u0011 !\u0018\u0012\u001a\u001e\u001c(.\u0003\u0018&\u001a! .", (short) (ZN.Xd() ^ 9511), (short) (ZN.Xd() ^ 25788))).getMethod(ZO.xd("\u0003^\\Y f\u000fCH\u000b`[(\u0011P@\u0019\u0012\u0010~wR\u001c36>;TF7\u0014-\u0007Dx1#;", (short) (C1580rY.Xd() ^ (-8362)), (short) (C1580rY.Xd() ^ (-25766))), Class.forName(Jg.Wd("B^3P\u001ev\u0001+BD!qG[\u001cK\u001ej\u001aP\u0018N\u0012m\u0018]p\u0013\u0006dud38\u0012XyW\"UyM\t<\u0012>\f\u001dkG-)~;|U!2\u0016DuK\u0011>sToB\u0004\u0010tNy2\u0011\u0006r]l=\u0017\u001c\t", (short) (FB.Xd() ^ 25467), (short) (FB.Xd() ^ 26009))));
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u0011+%\u0014\u0005eo\u0017JB7%f9$. rd,[8\u001f`PCB#&\t[xR9d0A1*\u001f\tb{s`\b}_gp2\u001b\u0015\ng\\\r\u000f1", imports = {})
    @Deprecated
    public static boolean removeTouchExplorationStateChangeListener(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) throws Throwable {
        TouchExplorationStateChangeListenerWrapper touchExplorationStateChangeListenerWrapper = new TouchExplorationStateChangeListenerWrapper(touchExplorationStateChangeListener);
        short sXd = (short) (FB.Xd() ^ 27194);
        int[] iArr = new int["N\\O^XSK\u0016k_Xk\u001fSRSBQNE;CCAY_\u0011%DEDS@7-553;A\"7A587A".length()];
        QB qb = new QB("N\\O^XSK\u0016k_Xk\u001fSRSBQNE;CCAY_\u0011%DEDS@7-553;A\"7A587A");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {touchExplorationStateChangeListenerWrapper};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("\r~\u0006\u0007\rzh\u0003\btxT\u0007}xz|j|pusWwcueBf^jb_EajjZbXd", (short) (FB.Xd() ^ 5561), (short) (FB.Xd() ^ 11241)), Class.forName(Qg.kd("\u001f+ -)\"\u001cd,\u001e\u0019*_\u0012\u0013\u0012\u0013 \u001f\u0014\f\u0012\u0014\u0010\u001a\u001eQc\u0005\u0004\u0005\u0012\u0011\u0006}\u0004\u0006\u0002\f\u0010bu\u0002sxu\u00022a{\u0001mqM\u007fvqsucuinlPp\\n^;_Wc[X>ZccS[Q]", (short) (C1633zX.Xd() ^ (-14919)), (short) (C1633zX.Xd() ^ (-21323)))));
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean isRequestFromAccessibilityTool(AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.isRequestFromAccessibilityTool(accessibilityManager);
        }
        return true;
    }

    private static final class TouchExplorationStateChangeListenerWrapper implements AccessibilityManager.TouchExplorationStateChangeListener {
        final TouchExplorationStateChangeListener mListener;

        TouchExplorationStateChangeListenerWrapper(TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            this.mListener = touchExplorationStateChangeListener;
        }

        public int hashCode() {
            return this.mListener.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TouchExplorationStateChangeListenerWrapper) {
                return this.mListener.equals(((TouchExplorationStateChangeListenerWrapper) obj).mListener);
            }
            return false;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z2) {
            this.mListener.onTouchExplorationStateChanged(z2);
        }
    }

    private AccessibilityManagerCompat() {
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static boolean isRequestFromAccessibilityTool(AccessibilityManager accessibilityManager) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("v\u0003w\u0005\u0001ys<\u0004up\u00027ijijwvkcikgqu);\\[\\ih]U[]Ycg:MYKPMY", (short) (C1633zX.Xd() ^ (-31727)), (short) (C1633zX.Xd() ^ (-17888)))).getMethod(hg.Vd("V_=OZ]LYY*UQN!BABONC;AC?IM'A@<", (short) (ZN.Xd() ^ 24222), (short) (ZN.Xd() ^ 23398)), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
