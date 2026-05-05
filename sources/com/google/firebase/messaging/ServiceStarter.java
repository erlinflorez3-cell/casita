package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Queue;
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

/* JADX INFO: loaded from: classes7.dex */
public class ServiceStarter {
    static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    static final int ERROR_ILLEGAL_STATE_EXCEPTION = 402;
    static final int ERROR_ILLEGAL_STATE_EXCEPTION_FALLBACK_TO_BIND = 403;
    static final int ERROR_NOT_FOUND = 404;
    static final int ERROR_SECURITY_EXCEPTION = 401;
    public static final int ERROR_UNKNOWN = 500;
    private static final String EXTRA_WRAPPED_INTENT = "wrapped_intent";
    private static final String PERMISSIONS_MISSING_HINT = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    public static final int SUCCESS = -1;
    private static ServiceStarter instance = null;
    private String firebaseMessagingServiceClassName = null;
    private Boolean hasWakeLockPermission = null;
    private Boolean hasAccessNetworkStatePermission = null;
    private final Queue<Intent> messagingEvents = new ArrayDeque();

    private ServiceStarter() {
    }

    private int doStartService(Context context, Intent intent) throws Exception {
        ComponentName componentNameStartWakefulService;
        String strResolveServiceClassName = resolveServiceClassName(context, intent);
        short sXd = (short) (OY.Xd() ^ 9131);
        short sXd2 = (short) (OY.Xd() ^ 10991);
        int[] iArr = new int["`)\u0004ib90wsE$OR\u001d/mm".length()];
        QB qb = new QB("`)\u0004ib90wsE$OR\u001d/mm");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        if (strResolveServiceClassName != null) {
            if (Log.isLoggable(str, 3)) {
                String str2 = C1626yg.Ud("NDp\njb)Q`X\"&\tF?K\u0005\r\u001dhBGVC~K\f`\u0003|U\u001dkO]xvI\u001aVv,", (short) (C1607wl.Xd() ^ 21156), (short) (C1607wl.Xd() ^ 32043)) + strResolveServiceClassName;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("\u0007hj'\u00026\u0003C!cZh*?\u001fxd\u0001F\u0003,\n\"", (short) (FB.Xd() ^ 32566))).getMethod(EO.Od("\u0013Yxvq \u000evZ(\u000b\u0004[Q", (short) (C1607wl.Xd() ^ 26086)), new Class[0]);
            try {
                method.setAccessible(true);
                intent.setClassName((String) method.invoke(context, objArr), strResolveServiceClassName);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        try {
            if (hasWakeLockPermission(context)) {
                componentNameStartWakefulService = WakeLockHolder.startWakefulService(context, intent);
            } else {
                CX.ud();
                Class<?> cls = Class.forName(C1561oA.Qd("/;0=92,t)427'/4l\u0001,*/\u001f1,", (short) (Od.Xd() ^ (-27909))));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1593ug.zd("]kbqojf1gtt{mw~9U{\u0003t~\u0006", (short) (C1499aX.Xd() ^ (-19043)), (short) (C1499aX.Xd() ^ (-27272))));
                Object[] objArr2 = {intent};
                Method method2 = cls.getMethod(C1561oA.od("\u0002\u0002m}~\\my|ngh", (short) (C1633zX.Xd() ^ (-21311))), clsArr);
                try {
                    method2.setAccessible(true);
                    componentNameStartWakefulService = (ComponentName) method2.invoke(context, objArr2);
                    C1561oA.Kd("\u000b(34+1+d=(3.i7;09n@6D@=HI@GG\u0006zOBPUIDG\u0003WYGY\\\tWLe\rPT\u0010UW_Un[[", (short) (OY.Xd() ^ 28518));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            if (componentNameStartWakefulService != null) {
                return -1;
            }
            Wg.Zd("Fx=@H7\u0017\tSWVU\u001f\tpsE:K\b\u000e\u0010\ng`\u001eB1qa\u00069DGaK\u0005[jW+.\u0011Z\u0005pFS\u001fO$iT /\u001aI\u0004^P", (short) (C1580rY.Xd() ^ (-29490)), (short) (C1580rY.Xd() ^ (-22934)));
            return 404;
        } catch (IllegalStateException e4) {
            short sXd3 = (short) (C1580rY.Xd() ^ (-7176));
            int[] iArr2 = new int["o\f\u0015\u0019\u0013\u0013O%!R')\u0017),X- .3'\"%`9+-1+f17i--096B@GA8\u000fu".length()];
            QB qb2 = new QB("o\f\u0015\u0019\u0013\u0013O%!R')\u0017),X- .3'\"%`9+-1+f17i--096B@GA8\u000fu");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                i3++;
            }
            String str3 = new String(iArr2, 0, i3) + e4;
            return 402;
        } catch (SecurityException e5) {
            Wg.vd("j\u0019\u0016\u0014\u0014B\u0017\t\u0017\u001b\u0011L\u000e\u0010\u0014\u0012,\u001c&\u001e \u001aO%&$[*\u001f.+\u001alk#xp\"shr.~q{\u0001pkz_\u0002\tv\u0001\u0004", (short) (FB.Xd() ^ 28650));
            return 401;
        }
    }

    static synchronized ServiceStarter getInstance() {
        if (instance == null) {
            instance = new ServiceStarter();
        }
        return instance;
    }

    private synchronized String resolveServiceClassName(Context context, Intent intent) {
        String strKd = Qg.kd("f\u0013\u0012\u000e\u0010<\u000e\u007f\r\b\u0004\r~\u0003z2\u0006q\u0002ur\u0001+sw|lty$vgsvhab(\u001bmdagf^bZ\u0012T\\Pa`ZLWN\bLTKSUEFMDLQ\nz,>KFBK97qD5AD6/0i@):\u007fd", (short) (C1633zX.Xd() ^ (-4039)), (short) (C1633zX.Xd() ^ (-12130)));
        synchronized (this) {
            String str = this.firebaseMessagingServiceClassName;
            if (str != null) {
                return str;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("o{p}yrl5itrwgot-Aljo_ql", (short) (FB.Xd() ^ 16694), (short) (FB.Xd() ^ 26190))).getMethod(C1561oA.ud("\\YgBRSZOTQ8KWINKW", (short) (ZN.Xd() ^ 11285)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls = Class.forName(C1561oA.yd("Xf]lb]Y$R__fPZa\u001cWU\u0017:DGPGFE.CI=DCI", (short) (C1580rY.Xd() ^ (-26723))));
                Class<?>[] clsArr = {Class.forName(C1561oA.Yd("r\u0001w\u0007\u0005\u007f{F|\n\n\u0011\u0003\r\u0014Nj\u0011\u0018\n\u0014\u001b", (short) (Od.Xd() ^ (-27547)))), Integer.TYPE};
                Object[] objArr2 = {intent, 0};
                short sXd = (short) (ZN.Xd() ^ 16143);
                short sXd2 = (short) (ZN.Xd() ^ 5556);
                int[] iArr = new int["ZN]ZXcSBUch\\WZ".length()];
                QB qb = new QB("ZN]ZXcSBUch\\WZ");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    ResolveInfo resolveInfo = (ResolveInfo) method2.invoke(packageManager, objArr2);
                    if (resolveInfo == null || resolveInfo.serviceInfo == null) {
                        C1561oA.od("w\u001a\"\u0014\u0010\u000e\u001f\u0010v\u000e\u001b\u001a\u0007\f\r\u0011\t", (short) (FB.Xd() ^ 29916));
                        C1561oA.Kd("2NW[UU\u0012gc\u0015h\\khfqa\u001dr`rhgw$nt{mw~+\u007fr\u0001\u0006ytw?4\t\u0002\u0001\t\n\u0004\n\u0004=\u0002\f\u0002\u0015\u0016\u0012\u0006\u0013\fG\u000e\u0018\u0011\u001b\u001f\u0011\u0014\u001d\u0016 '", (short) (C1580rY.Xd() ^ (-10986)));
                        return null;
                    }
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(Jg.Wd("W\u00199u=S\tP.\rP\u0011 3gG\u001f\u0002C}x*^", (short) (C1607wl.Xd() ^ 21938), (short) (C1607wl.Xd() ^ 23359))).getMethod(ZO.xd("\u0012\u0005\u0010Y\\hN\u0005\u0007\u001a\u0015io;", (short) (FB.Xd() ^ 32698), (short) (FB.Xd() ^ 91)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        if (!((String) method3.invoke(context, objArr3)).equals(serviceInfo.packageName) || serviceInfo.name == null) {
                            C1561oA.Qd("Jltfb`qbI`mlY^_c[", (short) (C1499aX.Xd() ^ (-30358)));
                            String str2 = strKd + serviceInfo.packageName + C1593ug.zd("D", (short) (ZN.Xd() ^ 32417), (short) (ZN.Xd() ^ 3499)) + serviceInfo.name;
                            return null;
                        }
                        if (serviceInfo.name.startsWith(C1626yg.Ud("z", (short) (C1580rY.Xd() ^ (-31334)), (short) (C1580rY.Xd() ^ (-3068))))) {
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr4 = new Object[0];
                            Method method4 = Class.forName(Ig.wd("h$Lu\"GbSB>;#ILNm&p'a{jP", (short) (ZN.Xd() ^ 27180))).getMethod(EO.Od("\f\\mq\u0003Y5\fTfE~YS", (short) (Od.Xd() ^ (-21830))), new Class[0]);
                            try {
                                method4.setAccessible(true);
                                this.firebaseMessagingServiceClassName = sb.append((String) method4.invoke(context, objArr4)).append(serviceInfo.name).toString();
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } else {
                            this.firebaseMessagingServiceClassName = serviceInfo.name;
                        }
                        return this.firebaseMessagingServiceClassName;
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
    }

    public static void setForTesting(ServiceStarter serviceStarter) {
        instance = serviceStarter;
    }

    Intent getMessagingEvent() {
        return this.messagingEvents.poll();
    }

    boolean hasAccessNetworkStatePermission(Context context) throws Throwable {
        if (this.hasAccessNetworkStatePermission == null) {
            Object[] objArr = {Wg.Zd("+%\u0005\u0001hN1g\u0014vnU90\u001a}mY\u0001\u007flZFA91\u000bohX8'\f\rjU-,\t", (short) (C1607wl.Xd() ^ 12134), (short) (C1607wl.Xd() ^ 13302))};
            Method method = Class.forName(C1561oA.Xd("\u001d+\"1/*&p'44;-7>x\u000f<<C5IF", (short) (C1499aX.Xd() ^ (-2637)))).getMethod(Qg.kd("dhdah?\\feae]DfFW]V?S_YT]\\QVT", (short) (C1633zX.Xd() ^ (-2228)), (short) (C1633zX.Xd() ^ (-20281))), Class.forName(Wg.vd("\u0012\n\u001c\bY\u0019\u000b\u0019\u0007Np\u0013\u0016\u000e\u0010\n", (short) (C1499aX.Xd() ^ (-11863)))));
            try {
                method.setAccessible(true);
                this.hasAccessNetworkStatePermission = Boolean.valueOf(((Integer) method.invoke(context, objArr)).intValue() == 0);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (!this.hasWakeLockPermission.booleanValue() && Log.isLoggable(hg.Vd("e\b\u0010\u0002}{\r}d{\t\btyz~v", (short) (ZN.Xd() ^ 31199), (short) (ZN.Xd() ^ IDStepResponseCodes.STEP_LAUNCH_REQUEST)), 3)) {
            C1561oA.ud("o\u000b\u0014\u0013\b\f\u0004;j~\u000b\u0005\u007f\t\b|\u0002\u007fJ/o{p}yrl5vjvpktshmk*<=<=JITB8FH?A9L??+=-\u0007ZMMV\u0002THNSI@zHHJD7A@Lq35n7;/7?--+e'=b6)%^+\u001e*$ \u001e++U\"\u0019%\u0019\u0016\"ZM\u000f!\u001fI\u0016\t E\u0013\t\b\u0006\u0006\u0004>\u0012\f;|~8\u0005w\u0004\nt~}\n/oqppn)|v&~sxt!m`lfb`mm", (short) (C1633zX.Xd() ^ (-19125)));
        }
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    boolean hasWakeLockPermission(Context context) throws Throwable {
        if (this.hasWakeLockPermission == null) {
            short sXd = (short) (C1580rY.Xd() ^ (-27313));
            int[] iArr = new int["\u000f\u001d\u0010\u001f\u0019\u0014\fV\u0016\f\u0016\u0012\u000b\u0016\u0013\n--i\u0014z\u0006|\u0018\u0002\u0006v\u007f".length()];
            QB qb = new QB("\u000f\u001d\u0010\u001f\u0019\u0014\fV\u0016\f\u0016\u0012\u000b\u0016\u0013\n--i\u0014z\u0006|\u0018\u0002\u0006v\u007f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            short sXd2 = (short) (FB.Xd() ^ 17754);
            int[] iArr2 = new int["\u001d+\"1/*&p'44;-7>x\u000f<<C5IF".length()];
            QB qb2 = new QB("\u001d+\"1/*&p'44;-7>x\u000f<<C5IF");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                i3++;
            }
            Object[] objArr = {str};
            Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Jg.Wd("Px\f-eo\u0015tSSp,C\u001b#\b\u000f,l&b\u0010Tq\u0010J&'", (short) (OY.Xd() ^ 9085), (short) (OY.Xd() ^ 23661)), Class.forName(Xg.qd("+#9%r2(60w\u001e@?7=7", (short) (C1499aX.Xd() ^ (-14526)), (short) (C1499aX.Xd() ^ (-28043)))));
            try {
                method.setAccessible(true);
                this.hasWakeLockPermission = Boolean.valueOf(((Integer) method.invoke(context, objArr)).intValue() == 0);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (!this.hasWakeLockPermission.booleanValue() && Log.isLoggable(ZO.xd("\u0001K?)\u0010\u0016m!\u0007uAQ%I\u000bw;", (short) (Od.Xd() ^ (-24165)), (short) (Od.Xd() ^ (-10008))), 3)) {
            short sXd3 = (short) (C1580rY.Xd() ^ (-29023));
            short sXd4 = (short) (C1580rY.Xd() ^ (-12367));
            int[] iArr3 = new int["5\n\u0005\n!q~)>J\u0018b05qz\u001eQ0\u0007$p\u0002xVFZi_*H=~Q\u0001TK9\u0019ciSr,\u0010!$Za\u0006s>\u001eq+G*@\f\u007fT9WHd\u0019>\u0011Y>bu\t\u001e\u0011\u001axH;=<SS\u001e}5B\u001e\u0005-m+CxhwPE'\u0012\u0003Y;w\"s\u0003JU*\u0016'^\u0015d^^'`\u0002t .ci6Qu[]\u0007s7\u001eO\u001bjW7e!\u001f#jlnV\u0001a{=\u000fE7op!M".length()];
            QB qb3 = new QB("5\n\u0005\n!q~)>J\u0018b05qz\u001eQ0\u0007$p\u0002xVFZi_*H=~Q\u0001TK9\u0019ciSr,\u0010!$Za\u0006s>\u001eq+G*@\f\u007fT9WHd\u0019>\u0011Y>bu\t\u001e\u0011\u001axH;=<SS\u001e}5B\u001e\u0005-m+CxhwPE'\u0012\u0003Y;w\"s\u0003JU*\u0016'^\u0015d^^'`\u0002t .ci6Qu[]\u0007s7\u001eO\u001bjW7e!\u001f#jlnV\u0001a{=\u000fE7op!M");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i4 * sXd4))) + xuXd3.CK(iKK3));
                i4++;
            }
            new String(iArr3, 0, i4);
        }
        return this.hasWakeLockPermission.booleanValue();
    }

    public int startMessagingService(Context context, Intent intent) throws Throwable {
        if (Log.isLoggable(Ig.wd("2}5[0\u000bl>o\u001b#)H\\v]\u000e", (short) (FB.Xd() ^ 9702)), 3)) {
            short sXd = (short) (C1607wl.Xd() ^ 30470);
            int[] iArr = new int["\u0005oj#} \tq\tA-\u001cj[1\u0016".length()];
            QB qb = new QB("\u0005oj#} \tq\tA-\u001cj[1\u0016");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            new String(iArr, 0, i2);
        }
        this.messagingEvents.offer(intent);
        Intent intent2 = new Intent(C1561oA.Qd("Q\\Y\u0019QXWNRJ\u0012IKSEA?PA\t'\u001e+*\u0017\u001c\u001d!\u00190\u0015%\u0013\u001b ", (short) (Od.Xd() ^ (-21549))));
        Class<?> cls = Class.forName(C1593ug.zd("?MDSQLH\u0013IVV]OY`\u001b1^^eWkh", (short) (C1499aX.Xd() ^ (-4580)), (short) (C1499aX.Xd() ^ (-10866))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (OY.Xd() ^ 916);
        int[] iArr2 = new int["A>L'78?496\u001e0;2".length()];
        QB qb2 = new QB("A>L'78?496\u001e0;2");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            intent2.setPackage((String) method.invoke(context, objArr));
            return doStartService(context, intent2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
