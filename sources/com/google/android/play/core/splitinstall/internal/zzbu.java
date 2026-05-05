package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.tapandpay.TapAndPayStatusCodes;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
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
public final class zzbu {
    private static final zzu zza = new zzu("PhoneskyVerificationUtils");

    public static boolean zza(Context context) throws Throwable {
        Object obj;
        String strOd = C1561oA.od("4?<{.:/<81+s;)1&*.&", (short) (C1607wl.Xd() ^ 24548));
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Kd("\u001d+\"1/*&p'44;-7>x\u000f<<C5IF", (short) (C1607wl.Xd() ^ 23780))).getMethod(Wg.Zd("w>\u00146\u000eX'o0z%{W\u0013G\fW", (short) (FB.Xd() ^ 23094), (short) (FB.Xd() ^ 24490)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                short sXd = (short) (Od.Xd() ^ (-11978));
                int[] iArr = new int["P^Udb]Y$Zggn`jq,om/RdgpgnmVkymts\u0002".length()];
                QB qb = new QB("P^Udb]Y$Zggn`jq,om/RdgpgnmVkymts\u0002");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[2];
                short sXd2 = (short) (C1633zX.Xd() ^ (-7013));
                int[] iArr2 = new int["\u001a\u0010$\u000eY\u0017\u000b\u0017\u000fTx\u0019\u0016\f\u0010\b".length()];
                QB qb2 = new QB("\u001a\u0010$\u000eY\u0017\u000b\u0017\u000fTx\u0019\u0016\f\u0010\b");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {strOd, 0};
                Method method2 = cls.getMethod(Qg.kd("ur\u0001LzytpifxlqoImdl", (short) (Od.Xd() ^ (-19076)), (short) (Od.Xd() ^ (-27604))), clsArr);
                try {
                    method2.setAccessible(true);
                    ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(packageManager, objArr2);
                    String strVd = hg.Vd("x\u0005y\u0007\u0003{u>r}{\u0001px}6ws3Esrmib_qejhBf]e", (short) (C1499aX.Xd() ^ (-21097)), (short) (C1499aX.Xd() ^ (-27382)));
                    String strUd = C1561oA.ud("\u0018 \u0012\u0012\u001b\u0013\u0011", (short) (C1607wl.Xd() ^ 23526));
                    try {
                        Class<?> cls2 = Class.forName(strVd);
                        Field field = 1 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
                        field.setAccessible(true);
                        obj = field.get(applicationInfo);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        short sXd3 = (short) (C1607wl.Xd() ^ 3154);
                        int[] iArr3 = new int[")7.=;62|#007)3:t\u001bHHOAUR".length()];
                        QB qb3 = new QB(")7.=;62|#007)3:t\u001bHHOAUR");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 ^ i4));
                            i4++;
                        }
                        Class<?> cls3 = Class.forName(new String(iArr3, 0, i4));
                        Object[] objArr3 = new Object[0];
                        Method method3 = cls3.getMethod(C1561oA.Yd("\u0019\u0018(\u0005\u0017\u001a#\u001a! \t\u001e, '&4", (short) (C1607wl.Xd() ^ 1761)), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            PackageManager packageManager2 = (PackageManager) method3.invoke(context, objArr3);
                            Class<?> cls4 = Class.forName(Xg.qd("(6-<:51{2??F8BI\u0004GE\u0007*<?H?FE.CQELKY", (short) (ZN.Xd() ^ 13651), (short) (ZN.Xd() ^ 14612)));
                            Class<?>[] clsArr2 = new Class[2];
                            short sXd4 = (short) (FB.Xd() ^ TapAndPayStatusCodes.TAP_AND_PAY_UNAVAILABLE);
                            short sXd5 = (short) (FB.Xd() ^ 9815);
                            int[] iArr4 = new int[")\u0012b5\u0016N\u000fN_QhFk^\u0018x".length()];
                            QB qb4 = new QB(")\u0012b5\u0016N\u000fN_QhFk^\u0018x");
                            int i5 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((i5 * sXd5) ^ sXd4));
                                i5++;
                            }
                            clsArr2[0] = Class.forName(new String(iArr4, 0, i5));
                            clsArr2[1] = Integer.TYPE;
                            Object[] objArr4 = {strOd, 64};
                            Method method4 = cls4.getMethod(ZO.xd("j{+?tPQ\u0019vM\u0001mc\u0015", (short) (FB.Xd() ^ 27465), (short) (FB.Xd() ^ 25606)), clsArr2);
                            try {
                                method4.setAccessible(true);
                                Signature[] signatureArr = ((PackageInfo) method4.invoke(packageManager2, objArr4)).signatures;
                                if (signatureArr == null || (signatureArr.length) == 0) {
                                    zza.zze(C1593ug.zd("/HPPHWP_\u0007XJMVMTS\u000fYd\u0012aci\u0016ja`h``\u001d+, qqvwnhs\u0002)}pxs;q\u0006z~\b4\u0006wz\u0004z\u0002\u0001J=a\u000f\u0016\u000e\u0007C\u0013\u0015\u001bG\u001f\u000f\u001d\u0015\u0013'\\", (short) (C1580rY.Xd() ^ (-5706)), (short) (C1580rY.Xd() ^ (-28438))), new Object[0]);
                                } else {
                                    for (Signature signature : signatureArr) {
                                        String strZza = zzbt.zza(signature.toByteArray());
                                        short sXd6 = (short) (C1607wl.Xd() ^ 24398);
                                        short sXd7 = (short) (C1607wl.Xd() ^ 27978);
                                        int[] iArr5 = new int["[3Q`!&\u0017)\u00139\u0016\u0007R\bW\\]\u0001]<Dl;rC0\u00029P\u001a+\u001a.B^Hs(\u0018Dz$T".length()];
                                        QB qb5 = new QB("[3Q`!&\u0017)\u00139\u0016\u0007R\bW\\]\u0001]<Dl;rC0\u00029P\u001a+\u001a.B^Hs(\u0018Dz$T");
                                        int i6 = 0;
                                        while (qb5.YK()) {
                                            int iKK5 = qb5.KK();
                                            Xu xuXd5 = Xu.Xd(iKK5);
                                            iArr5[i6] = xuXd5.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i6 * sXd7))) + xuXd5.CK(iKK5));
                                            i6++;
                                        }
                                        if (new String(iArr5, 0, i6).equals(strZza)) {
                                            return true;
                                        }
                                        String str = Build.TAGS;
                                        short sXd8 = (short) (ZN.Xd() ^ TypedValues.TransitionType.TYPE_FROM);
                                        int[] iArr6 = new int["+\u007f\u001d\u0001]#\u0019X".length()];
                                        QB qb6 = new QB("+\u007f\u001d\u0001]#\u0019X");
                                        int i7 = 0;
                                        while (qb6.YK()) {
                                            int iKK6 = qb6.KK();
                                            Xu xuXd6 = Xu.Xd(iKK6);
                                            iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ (sXd8 + i7)));
                                            i7++;
                                        }
                                        if (str.contains(new String(iArr6, 0, i7)) || Build.TAGS.contains(EO.Od("3SE,7;W|J", (short) (C1499aX.Xd() ^ (-18833))))) {
                                            short sXd9 = (short) (C1607wl.Xd() ^ 26722);
                                            int[] iArr7 = new int["3CAb ?,\u0018Z,OM\u0013>+CJH-FQL!\u0017D'\u0005\u0013\u007f3%/\u0014\u001d\u001c({*-6p*\u0003".length()];
                                            QB qb7 = new QB("3CAb ?,\u0018Z,OM\u0013>+CJH-FQL!\u0017D'\u0005\u0013\u007f3%/\u0014\u001d\u001c({*-6p*\u0003");
                                            int i8 = 0;
                                            while (qb7.YK()) {
                                                int iKK7 = qb7.KK();
                                                Xu xuXd7 = Xu.Xd(iKK7);
                                                iArr7[i8] = xuXd7.fK(sXd9 + sXd9 + sXd9 + i8 + xuXd7.CK(iKK7));
                                                i8++;
                                            }
                                            if (new String(iArr7, 0, i8).equals(strZza)) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
