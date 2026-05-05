package com.google.android.gms.common.wrappers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.core.util.Pair;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
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

/* JADX INFO: loaded from: classes8.dex */
public class PackageManagerWrapper {
    protected final Context zza;

    public PackageManagerWrapper(Context context) {
        this.zza = context;
    }

    public int checkCallingOrSelfPermission(String str) throws Throwable {
        Context context = this.zza;
        Object[] objArr = {str};
        Method method = Class.forName(C1561oA.Qd("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b", (short) (C1607wl.Xd() ^ 30023))).getMethod(C1561oA.od("uyuryPmwvrvnUwWhngPdpjenmbge", (short) (OY.Xd() ^ 142)), Class.forName(C1593ug.zd("\u001e\u0016,\u0018e%\u001b)#j\u001132*0*", (short) (C1580rY.Xd() ^ (-25629)), (short) (C1580rY.Xd() ^ (-185)))));
        try {
            method.setAccessible(true);
            return ((Integer) method.invoke(context, objArr)).intValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public int checkPermission(String str, String str2) throws Throwable {
        Context context = this.zza;
        short sXd = (short) (C1580rY.Xd() ^ (-7764));
        int[] iArr = new int["%3*972.x/<<C5?F\u0001\u0017DDK=QN".length()];
        QB qb = new QB("%3*972.x/<<C5?F\u0001\u0017DDK=QN");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd("|UM\u0004wfE#3\bWS;\u0012tZk", (short) (ZN.Xd() ^ 25152), (short) (ZN.Xd() ^ 5218)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = {str, str2};
            Method method2 = Class.forName(C1561oA.Xd(" .%42-)s*77>0:A{?=~\"47@7>=&;I=DCQ", (short) (Od.Xd() ^ (-5740)))).getMethod(hg.Vd("NRNKR6JVPKTSHMK", (short) (C1580rY.Xd() ^ (-4028)), (short) (C1580rY.Xd() ^ (-4532))), Class.forName(Wg.vd("MC[E\u0015RJVR\u0018@`aW_W", (short) (ZN.Xd() ^ 26654))), Class.forName(Qg.kd("G=Q;\u0007D8D<\u0002&FC9=5", (short) (C1499aX.Xd() ^ (-14727)), (short) (C1499aX.Xd() ^ (-18499)))));
            try {
                method2.setAccessible(true);
                return ((Integer) method2.invoke(packageManager, objArr2)).intValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public ApplicationInfo getApplicationInfo(String str, int i2) throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("JVKXTMG\u0010DOMRBJO\b\u001cGEJ:LG", (short) (C1499aX.Xd() ^ (-10341)))).getMethod(C1561oA.yd("0/;\u0018.16-('\f!3'*)+", (short) (C1580rY.Xd() ^ (-773))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            short sXd = (short) (C1499aX.Xd() ^ (-3233));
            int[] iArr = new int["\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u0010\u001d\u001d$\u0016 'a%#d\b\u001a\u001d&\u001d$#\f!/#*)7".length()];
            QB qb = new QB("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u0010\u001d\u001d$\u0016 'a%#d\b\u001a\u001d&\u001d$#\f!/#*)7");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Class<?>[] clsArr = {Class.forName(Xg.qd("E=S?\rLBPJ\u00128ZYQWQ", (short) (C1580rY.Xd() ^ (-4083)), (short) (C1580rY.Xd() ^ (-25722)))), Integer.TYPE};
            Object[] objArr2 = {str, Integer.valueOf(i2)};
            short sXd2 = (short) (OY.Xd() ^ 22958);
            short sXd3 = (short) (OY.Xd() ^ 25639);
            int[] iArr2 = new int["Qj`\u001f7*O5\u001dtw\u001c\tz8QrX".length()];
            QB qb2 = new QB("Qj`\u001f7*O5\u001dtw\u001c\tz8QrX");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd3) ^ sXd2));
                i4++;
            }
            Method method2 = cls.getMethod(new String(iArr2, 0, i4), clsArr);
            try {
                method2.setAccessible(true);
                return (ApplicationInfo) method2.invoke(packageManager, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public CharSequence getApplicationLabel(String str) throws Throwable {
        Context context = this.zza;
        Class<?> cls = Class.forName(ZO.xd("G\u0014~k)^uK(N\"ivqp<&\u00042V\u007fX:", (short) (OY.Xd() ^ 15125), (short) (OY.Xd() ^ 7478)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 13568);
        short sXd2 = (short) (OY.Xd() ^ 20967);
        int[] iArr = new int["\u001e,\u0007@dQ&\u001aIG/\u001eSZ&\u001aZ".length()];
        QB qb = new QB("\u001e,\u0007@dQ&\u001aIG/\u001eSZ&\u001aZ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            short sXd3 = (short) (Od.Xd() ^ (-9953));
            int[] iArr2 = new int["G-/VIvgv\u0002\u001b\u001aD\u0007\u0014\u0014lMqF\u0006<!\u0011".length()];
            QB qb2 = new QB("G-/VIvgv\u0002\u001b\u001aD\u0007\u0014\u0014lMqF\u0006<!\u0011");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                i3++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(EO.Od("\t96m}M}z@> \u001aRCE%_", (short) (C1607wl.Xd() ^ 9886)), new Class[0]);
            try {
                method2.setAccessible(true);
                PackageManager packageManager2 = (PackageManager) method2.invoke(context, objArr2);
                short sXd4 = (short) (C1633zX.Xd() ^ (-24249));
                int[] iArr3 = new int["[g\\ie^X!U`^cS[`\u0019ZV\u00167GHODIF-@L>C@L".length()];
                QB qb3 = new QB("[g\\ie^X!U`^cS[`\u0019ZV\u00167GHODIF-@L>C@L");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                    i4++;
                }
                Object[] objArr3 = {str, 0};
                Method method3 = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.od(" \u001d+v%$\u001f\u001b\u0014\u0011#\u0017\u001c\u001as\u0018\u000f\u0017", (short) (C1607wl.Xd() ^ 12741)), Class.forName(C1593ug.zd("SKaM\u001bZP^X Fhg_e_", (short) (OY.Xd() ^ 17873), (short) (OY.Xd() ^ 20872))), Integer.TYPE);
                try {
                    method3.setAccessible(true);
                    ApplicationInfo applicationInfo = (ApplicationInfo) method3.invoke(packageManager2, objArr3);
                    short sXd5 = (short) (C1607wl.Xd() ^ 20893);
                    int[] iArr4 = new int["z\t\u007f\u000f\r\b\u0004N\u0005\u0012\u0012\u0019\u000b\u0015\u001cV\u001a\u0018Y|\u000f\u0012\u001b\u0012\u0019\u0018\u0001\u0016$\u0018\u001f\u001e,".length()];
                    QB qb4 = new QB("z\t\u007f\u000f\r\b\u0004N\u0005\u0012\u0012\u0019\u000b\u0015\u001cV\u001a\u0018Y|\u000f\u0012\u001b\u0012\u0019\u0018\u0001\u0016$\u0018\u001f\u001e,");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd5 + sXd5) + i5));
                        i5++;
                    }
                    Object[] objArr4 = {applicationInfo};
                    Method method4 = Class.forName(new String(iArr4, 0, i5)).getMethod(C1561oA.Xd("\u0015\u0014$q\"# \u001e\u0019\u0018,\"))\b\u001e $,", (short) (ZN.Xd() ^ 2127)), Class.forName(Wg.Zd("ZFX\u0006\u001f4O4\n1Lq~#I\u001e\u0001\u0019u(s\u000fk\u0003\u001e6fy\u001d:2q\u000b.", (short) (C1580rY.Xd() ^ (-31673)), (short) (C1580rY.Xd() ^ (-23391)))));
                    try {
                        method4.setAccessible(true);
                        return (CharSequence) method4.invoke(packageManager, objArr4);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
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

    public Pair<CharSequence, Drawable> getApplicationLabelAndIcon(String str) throws Throwable {
        Context context = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("w\u0004|\n\u0002zxAq|~\u0004ow\u00019i\u0015\u0017\u001c\b\u001a\u0019", (short) (OY.Xd() ^ 9082))).getMethod(Qg.kd("+(6\u0011!\")\u001e# \u0007\u001a&\u0018\u001d\u001a&", (short) (C1607wl.Xd() ^ 24259), (short) (C1607wl.Xd() ^ 23936)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = {str, 0};
            Method method2 = Class.forName(hg.Vd("\u0001\r\u0002\u000f\u000b\u0004}Fz\u0006\u0004\tx\u0001\u0006>\u007f{;\\lmtinkReqcheq", (short) (Od.Xd() ^ (-19191)), (short) (Od.Xd() ^ (-18516)))).getMethod(C1561oA.yd("\t\b\u0014a\u000e\u000f\b\u0006|{\f\u0002\u0005\u0005\\\u0003\u0018\"", (short) (FB.Xd() ^ 14301)), Class.forName(C1561oA.ud("\t~\u0013|H\u0006y\u0006}Cg\b\u0005z~v", (short) (ZN.Xd() ^ 30755))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(packageManager, objArr2);
                Context context2 = this.zza;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.Yd("JXO^\\WS\u001eTaahZdk&<iipbvs", (short) (C1580rY.Xd() ^ (-29973)))).getMethod(Xg.qd("10@\u001d/2;298!6D8?>L", (short) (C1499aX.Xd() ^ (-16600)), (short) (C1499aX.Xd() ^ (-24524))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    PackageManager packageManager2 = (PackageManager) method3.invoke(context2, objArr3);
                    Object[] objArr4 = {applicationInfo};
                    Method method4 = Class.forName(Jg.Wd("r\u0018D'ZM\u001f]),a}##Aq\t~wp6N\r{\u0018\t'T\u0018_\u001c\u0013u", (short) (C1607wl.Xd() ^ 17595), (short) (C1607wl.Xd() ^ 3882))).getMethod(C1626yg.Ud("*\u0005y\u001c%\u0013(\n\u0019\u0018\u0018>%\u0002]UU;4", (short) (C1633zX.Xd() ^ (-34)), (short) (C1633zX.Xd() ^ (-8561))), Class.forName(ZO.xd("u2\u0014y'wwxY\u0014gPp\u000f\u00048@`<ga'ZUgB\u0017Er\u0003==Vs", (short) (C1607wl.Xd() ^ 4308), (short) (C1607wl.Xd() ^ 1290))));
                    try {
                        method4.setAccessible(true);
                        CharSequence charSequence = (CharSequence) method4.invoke(packageManager2, objArr4);
                        Context context3 = this.zza;
                        Class<?> cls = Class.forName(Ig.wd("7\u0015ZGQ\u00163\u0003\u0011ojT\u001a\u001b~\u001dt!v\u0013l9a", (short) (C1499aX.Xd() ^ (-13120))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr5 = new Object[0];
                        short sXd = (short) (C1607wl.Xd() ^ 21388);
                        int[] iArr = new int["8e#\"S\u000br`\u000eK5g \u00193J\u0015".length()];
                        QB qb = new QB("8e#\"S\u000br`\u000eK5g \u00193J\u0015");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                            i2++;
                        }
                        Method method5 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                        try {
                            method5.setAccessible(true);
                            PackageManager packageManager3 = (PackageManager) method5.invoke(context3, objArr5);
                            Object[] objArr6 = {applicationInfo};
                            Method method6 = Class.forName(C1561oA.Qd("R^S`\\UO\u0018LWUZJRW\u0010QM\r.>?F;@=$7C5:7C", (short) (FB.Xd() ^ 6698))).getMethod(C1561oA.od("\u0007\u0004\u0012]\f\u000b\u0006\u0002zw\n}\u0003\u0001Zs~|", (short) (FB.Xd() ^ 23025)), Class.forName(C1593ug.zd("\u000e\u001c\u0013\" \u001b\u0017a\u0018%%,\u001e(/i-+l\u000112/-(';188\u0014:3=", (short) (OY.Xd() ^ 13406), (short) (OY.Xd() ^ 24355))));
                            try {
                                method6.setAccessible(true);
                                return Pair.create(charSequence, (Drawable) method6.invoke(packageManager3, objArr6));
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }

    public PackageInfo getPackageInfo(String str, int i2) throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        short sXd = (short) (C1607wl.Xd() ^ 27837);
        int[] iArr = new int["1?6EC>:\u0005;HHOAKR\r#PPWI]Z".length()];
        QB qb = new QB("1?6EC>:\u0005;HHOAKR\r#PPWI]Z");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Wg.Zd(")Nnt5\u001cr4\u000bK\u0003c\u001fulxQ", (short) (ZN.Xd() ^ 5660), (short) (ZN.Xd() ^ 11143)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Class<?> cls = Class.forName(C1561oA.Xd("bpgvtok6lyy\u0001r|\u0004>\u0002\u007fAdvy\u0003y\u0001\u007fh}\f\u007f\u0007\u0006\u0014", (short) (C1580rY.Xd() ^ (-23166))));
            Class<?>[] clsArr = {Class.forName(Wg.vd("6,@*u3'3+p\u001552(,$", (short) (C1499aX.Xd() ^ (-18148)))), Integer.TYPE};
            Object[] objArr2 = {str, Integer.valueOf(i2)};
            Method method2 = cls.getMethod(Qg.kd("ebpK[\\cX]Z=aX`", (short) (ZN.Xd() ^ 19691), (short) (ZN.Xd() ^ 10559)), clsArr);
            try {
                method2.setAccessible(true);
                return (PackageInfo) method2.invoke(packageManager, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public String[] getPackagesForUid(int i2) throws Throwable {
        Context context = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("\n\u0016\u000b\u0018\u0014\r\u0007O\u0004\u000f\r\u0012\u0002\n\u000fG[\u0007\u0005\ny\f\u0007", (short) (C1607wl.Xd() ^ 30229), (short) (C1607wl.Xd() ^ 25229))).getMethod(C1561oA.ud("A>L'78?496\u001d0<.30<", (short) (Od.Xd() ^ (-14146))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Class<?> cls = Class.forName(C1561oA.yd("\u001e*#0(!\u001fg\u0018#%*\u0016\u001e'_=9|\u001e*+6+,)\u0014'/!*'O", (short) (OY.Xd() ^ 32293)));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr2 = {Integer.valueOf(i2)};
            Method method2 = cls.getMethod(C1561oA.Yd("ZYiFX[d[bapDnrVkg", (short) (OY.Xd() ^ 1903)), clsArr);
            try {
                method2.setAccessible(true);
                return (String[]) method2.invoke(packageManager, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public boolean isCallerInstantApp() throws Throwable {
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zza);
        }
        if (!PlatformVersion.isAtLeastO()) {
            return false;
        }
        Context context = this.zza;
        Class<?> cls = Class.forName(Xg.qd("\\japnie0fsszlv}8N{{\u0003t\t\u0006", (short) (ZN.Xd() ^ 31104), (short) (ZN.Xd() ^ 13343)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 30709);
        short sXd2 = (short) (FB.Xd() ^ 19207);
        int[] iArr = new int["_RE\u0015\n\u0004pZE7\u0007\u0010\u0001gQG9".length()];
        QB qb = new QB("_RE\u0015\n\u0004pZE7\u0007\u0010\u0001gQG9");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            int callingUid = Binder.getCallingUid();
            Class<?> cls2 = Class.forName(ZO.xd("xdRH@\u0002[@\r\u000288Kd&B~C\u0016\u001aW\u001dF\u001a?Hz\u0012\nf6ks", (short) (Od.Xd() ^ (-13002)), (short) (Od.Xd() ^ (-16071))));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr2 = {Integer.valueOf(callingUid)};
            Method method2 = cls2.getMethod(C1626yg.Ud("{c\u0017\u0015\u0011\u001b\u0012>\u007f\u0013M\u007fg", (short) (C1499aX.Xd() ^ (-25854)), (short) (C1499aX.Xd() ^ (-28450))), clsArr2);
            try {
                method2.setAccessible(true);
                String str = (String) method2.invoke(packageManager, objArr2);
                if (str == null) {
                    return false;
                }
                Context context2 = this.zza;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(Ig.wd("\u001av~$y'u7\u0012MJv\u001502\u0011}\u0010Vd\u001by\u0010", (short) (C1633zX.Xd() ^ (-7672)))).getMethod(EO.Od("Ht45H\u007faQ~>*V\u000f\n\u0002\u001be", (short) (C1499aX.Xd() ^ (-31622))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    PackageManager packageManager2 = (PackageManager) method3.invoke(context2, objArr3);
                    Class<?> cls3 = Class.forName(C1561oA.Qd("EQFSOHB\u000b?JHM=EJ\u0003D@\u007f!129.30\u0017*6(-*6", (short) (C1580rY.Xd() ^ (-27136))));
                    Class<?>[] clsArr3 = new Class[1];
                    short sXd3 = (short) (Od.Xd() ^ (-27101));
                    short sXd4 = (short) (Od.Xd() ^ (-11046));
                    int[] iArr2 = new int["vn\u0005p>}s\u0002{Ci\f\u000b\u0003\t\u0003".length()];
                    QB qb2 = new QB("vn\u0005p>}s\u0002{Ci\f\u000b\u0003\t\u0003");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                        i3++;
                    }
                    clsArr3[0] = Class.forName(new String(iArr2, 0, i3));
                    Object[] objArr4 = {str};
                    Method method4 = cls3.getMethod(C1561oA.od("aj?cggS_d0^]", (short) (C1580rY.Xd() ^ (-21919))), clsArr3);
                    try {
                        method4.setAccessible(true);
                        return ((Boolean) method4.invoke(packageManager2, objArr4)).booleanValue();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
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

    public final boolean zza(int i2, String str) throws Throwable {
        try {
            Context context = this.zza;
            String strKd = C1561oA.Kd("\u000f\u001f  \"&", (short) (C1499aX.Xd() ^ (-2412)));
            Class<?> cls = Class.forName(Wg.Zd("\u0002'v|O\"\u00176CiA\u001d\u0006hEve\n~_(1\u0005", (short) (FB.Xd() ^ 10492), (short) (FB.Xd() ^ 19069)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.Xd("me{g5tjxr:`\u0003\u0002y\u007fy", (short) (Od.Xd() ^ (-2194))));
            Object[] objArr = {strKd};
            Method method = cls.getMethod(Wg.vd("[ZfFidbTY@O]^RIL", (short) (ZN.Xd() ^ 7089)), clsArr);
            try {
                method.setAccessible(true);
                AppOpsManager appOpsManager = (AppOpsManager) method.invoke(context, objArr);
                if (appOpsManager == null) {
                    throw new NullPointerException(Qg.kd("\u0005\u0010\u000e\u0013\u0003\u0015\u0010H\u0001}\fi\u000f\b\bw~ct\u0001\u0004uno1Kvtyi{v/AON\\KKMXK<HK=67\u001a\u0010Xa\rZ`VU", (short) (Od.Xd() ^ (-28252)), (short) (Od.Xd() ^ (-14557))));
                }
                appOpsManager.checkPackage(i2, str);
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (SecurityException unused) {
            return false;
        }
    }
}
