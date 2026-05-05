package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
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

/* JADX INFO: loaded from: classes9.dex */
public final class zzw {
    private static final zzi zza = new zzi("PhoneskyVerificationUtils");

    public static boolean zza(Context context) throws Throwable {
        Object obj;
        String strVd = hg.Vd(".I=Ty,LFH:sC34;052k4=h66:d*27/$l", (short) (OY.Xd() ^ 12164), (short) (OY.Xd() ^ 569));
        String strUd = C1561oA.ud("`kh(Zf[hd]W gU]RVZR", (short) (ZN.Xd() ^ 26914));
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("%3*972.x/<<C5?F\u0001v$$+\u001d1.", (short) (C1633zX.Xd() ^ (-32165)))).getMethod(C1561oA.Yd("\u0003\u0002\u0012n\u0001\u0004\r\u0004\u000b\nr\b\u0016\n\u0011\u0010\u001e", (short) (FB.Xd() ^ 280)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls = Class.forName(Xg.qd("Zh_nlgc.dqqxjt{6yw9\\nqzqxw`u\u0004w~}\f", (short) (C1607wl.Xd() ^ 24028), (short) (C1607wl.Xd() ^ 976)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(Jg.Wd("kN4/L\u001a_|bx.\u001f.t\nR", (short) (OY.Xd() ^ 24775), (short) (OY.Xd() ^ 26394)));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {strUd, 0};
                Method method2 = cls.getMethod(ZO.xd("n\u0016\u0005NP$\u0017Y(\n5\u0002J\u001b\u0013/d8", (short) (C1580rY.Xd() ^ (-6388)), (short) (C1580rY.Xd() ^ (-6954))), clsArr);
                try {
                    method2.setAccessible(true);
                    ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(packageManager, objArr2);
                    String strUd2 = C1626yg.Ud(">\u0015\u00111a> -/d#\u0018n@y\u0001V\u0012a\"GP \t\\od|\u001a0\u0018R]\u000f", (short) (FB.Xd() ^ 14099), (short) (FB.Xd() ^ 22824));
                    short sXd = (short) (C1580rY.Xd() ^ (-4157));
                    int[] iArr = new int["\u0010s2\u0012\u0002\u001d>".length()];
                    QB qb = new QB("\u0010s2\u0012\u0002\u001d>");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    try {
                        Class<?> cls2 = Class.forName(strUd2);
                        Field field = 1 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                        field.setAccessible(true);
                        obj = field.get(applicationInfo);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        short sXd2 = (short) (C1633zX.Xd() ^ (-11621));
                        int[] iArr2 = new int["6B7D@93{0;9>.6;s\b316&83".length()];
                        QB qb2 = new QB("6B7D@93{0;9>.6;s\b316&83");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                            i3++;
                        }
                        try {
                            Class<?> cls3 = Class.forName(new String(iArr2, 0, i3));
                            Class<?>[] clsArr2 = new Class[0];
                            Object[] objArr3 = new Object[0];
                            short sXd3 = (short) (ZN.Xd() ^ 18434);
                            short sXd4 = (short) (ZN.Xd() ^ 31528);
                            int[] iArr3 = new int[".-=\u001a,/8/65\u001e3A5<;I".length()];
                            QB qb3 = new QB(".-=\u001a,/8/65\u001e3A5<;I");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) - sXd4);
                                i4++;
                            }
                            Method method3 = cls3.getMethod(new String(iArr3, 0, i4), clsArr2);
                            try {
                                method3.setAccessible(true);
                                PackageManager packageManager2 = (PackageManager) method3.invoke(context, objArr3);
                                Class<?> cls4 = Class.forName(C1561oA.od("4@5B>71y.97<,49q3/n\u0010 !(\u001d\"\u001f\u0006\u0019%\u0017\u001c\u0019%", (short) (FB.Xd() ^ 8128)));
                                Class<?>[] clsArr3 = new Class[2];
                                clsArr3[0] = Class.forName(C1561oA.Kd("ZRhT\"aWe_'Monflf", (short) (ZN.Xd() ^ 23000)));
                                clsArr3[1] = Integer.TYPE;
                                Object[] objArr4 = {strUd, 64};
                                Method method4 = cls4.getMethod(Wg.Zd("s\u0001l*/\u0013X0,\u000bL2\u001f\n", (short) (OY.Xd() ^ 7077), (short) (OY.Xd() ^ 31237)), clsArr3);
                                try {
                                    method4.setAccessible(true);
                                    Signature[] signatureArr = ((PackageInfo) method4.invoke(packageManager2, objArr4)).signatures;
                                    if (signatureArr == null || (signatureArr.length) == 0) {
                                        zza.zzd(C1561oA.Yd("\u0005\"\u00181X\r/+/#^0\"%.%,+f1<i9;AmB98@88t\u0003\u0004wIINOF@KY\u0001UHPK\u0013I]RV_\f]OR[RYX\"\u00159fme^\u001bjlr\u001fvftlj~4", (short) (C1499aX.Xd() ^ (-14651))), new Object[0]);
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        for (Signature signature : signatureArr) {
                                            String strZza = zzv.zza(signature.toByteArray());
                                            arrayList.add(strZza);
                                            if (C1561oA.Xd("r\fm1\u0016o\u0006\u0012\r'82>~\u001eD\u001d?6&\u001b\u0006\u0005I\u007f#\n\u0006\u001c<\u0006,\u001d% R@Y\u0012I\u0015\u00182", (short) (OY.Xd() ^ 20165)).equals(strZza)) {
                                                return true;
                                            }
                                            if ((Build.TAGS.contains(Wg.vd("\u0019\u001b-d$\u001f4/", (short) (C1580rY.Xd() ^ (-6706)))) || Build.TAGS.contains(Qg.kd("\u0002q~~6sl\u007fx", (short) (C1499aX.Xd() ^ (-6315)), (short) (C1499aX.Xd() ^ (-879))))) && hg.Vd("\u001b+)J\b'\u0014\u007fB\u001475z&\u0013+20\u0015.94\t~,\u000flzg\u001b\r\u0017{\u0005\u0004\u0010c\u0012\u0015\u001eX\u0012j", (short) (C1580rY.Xd() ^ (-617)), (short) (C1580rY.Xd() ^ (-9918))).equals(strZza)) {
                                                return true;
                                            }
                                        }
                                        zzi zziVar = zza;
                                        StringBuilder sb = new StringBuilder();
                                        Iterator it = arrayList.iterator();
                                        if (it.hasNext()) {
                                            while (true) {
                                                sb.append((CharSequence) it.next());
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                sb.append((CharSequence) C1561oA.ud("dW", (short) (C1607wl.Xd() ^ 31272)));
                                            }
                                        }
                                        Object[] objArr5 = {sb.toString()};
                                        short sXd5 = (short) (FB.Xd() ^ 19929);
                                        int[] iArr4 = new int["\u0001\u001e\u0010)T\t'#\u001b\u000fF\u0018\u000e\u0011\u0016\r('^#*877X\u001b)\u001d\\,*00\bo{}y@3Nx{up-~s\u0006\u0015\u0004?\u0018\u000e\u0004UMO6z\u0002\u0010\u000f\u000f*\u0011I\u0014gR ".length()];
                                        QB qb4 = new QB("\u0001\u001e\u0010)T\t'#\u001b\u000fF\u0018\u000e\u0011\u0016\r('^#*877X\u001b)\u001d\\,*00\bo{}y@3Nx{up-~s\u0006\u0015\u0004?\u0018\u000e\u0004UMO6z\u0002\u0010\u000f\u000f*\u0011I\u0014gR ");
                                        int i5 = 0;
                                        while (qb4.YK()) {
                                            int iKK4 = qb4.KK();
                                            Xu xuXd4 = Xu.Xd(iKK4);
                                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 ^ i5));
                                            i5++;
                                        }
                                        zziVar.zzd(String.format(new String(iArr4, 0, i5), objArr5), new Object[0]);
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            zza.zzd(strVd, new Object[0]);
                        }
                    } else {
                        zza.zzd(EO.Od("-{bW|\rNI'Z\u0013E\u0005\u0011\u0011e\u0010\u001c\u000f%i>deZ(\f>%vP", (short) (OY.Xd() ^ 32649)), new Object[0]);
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            zza.zzd(strVd, new Object[0]);
        }
        return false;
    }
}
