package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.tapandpay.TapAndPayStatusCodes;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
public final class zzqf implements Runnable {
    private final Context zza;
    private final zzpk zzb;
    private final zzqe zzc;
    private final zzpt zzd;
    private final zzqb zze;

    public zzqf(Context context, zzpt zzptVar, zzpk zzpkVar) {
        zzqe zzqeVar = new zzqe();
        zzqb zzqbVar = new zzqb();
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzb = (zzpk) Preconditions.checkNotNull(zzpkVar);
        this.zzd = zzptVar;
        this.zzc = zzqeVar;
        this.zze = zzqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InputStream inputStreamZza;
        String strWd = Ig.wd("]", (short) (FB.Xd() ^ 25749));
        String strOd = EO.Od("%b\"GX(\u0007:\u001cLKp(oo9\u0013#JgSa~\u0002\t\u0012@\u000fq`>'\u007f\u001ax5%\u0004\u0017\u0010\nt!2\u0003e\u000el*\u0014\u0010&P\u000em$\u0006-z\u001ft\u0017V\u001aG", (short) (C1607wl.Xd() ^ 1006));
        short sXd = (short) (C1607wl.Xd() ^ 28023);
        int[] iArr = new int["I_mofh`@bSUUa(\r1]\\XZ\u0007]MIQ\u0002MO@BFJByK=JEJF67p6A=:k@<5\u0002f".length()];
        QB qb = new QB("I_mofh`@bSUUa(\r1]\\XZ\u0007]MIQ\u0002MO@BFJByK=JEJF67p6A=:k@<5\u0002f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strZd = C1593ug.zd("5M]aZ^X:^QUWe.\u0015;ijhl\u001bsecm mqdhntn({o~{\u0003\u0001ru1x\u0003\u00075\f\n\u0005S:", (short) (C1580rY.Xd() ^ (-4086)), (short) (C1580rY.Xd() ^ (-9035)));
        String strOd2 = C1561oA.od("OesulnfFhY[[g.\u0013@`\u0010SOaM\u000baJ[\u0007XJXUKFVDB|BMIFwK>:s:;G5=mB>7\u0004h", (short) (OY.Xd() ^ TapAndPayStatusCodes.TAP_AND_PAY_PAYMENT_CREDENTIALS_DELIVERY_TIMEOUT));
        short sXd2 = (short) (Od.Xd() ^ (-31960));
        int[] iArr2 = new int["%I<@FLF\u007fSGVSZXJM\tP][Z\u000e".length()];
        QB qb2 = new QB("%I<@FLF\u007fSGVSZXJM\tP][Z\u000e");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        if (zza(Wg.Zd("\u0002\u0007SXl^0pI\u0016\u001a,\u001f\u0001w\u001e\u0003xPZ>;C?\u001a(/", (short) (OY.Xd() ^ 4420), (short) (OY.Xd() ^ 12385)))) {
            short sXd3 = (short) (C1633zX.Xd() ^ (-28808));
            int[] iArr3 = new int["\u0005\u0013\n\u0019\u000f\n\u0006P\f\u0002\u0010\f\u0001\f\r\u0004##cwrsv\u0006~\f{s{\u007fx|\u000f$\u0019\u001b\u0001\u0015\u0007".length()];
            QB qb3 = new QB("\u0005\u0013\n\u0019\u000f\n\u0006P\f\u0002\u0010\f\u0001\f\r\u0004##cwrsv\u0006~\f{s{\u007fx|\u000f$\u0019\u001b\u0001\u0015\u0007");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((sXd3 ^ i4) + xuXd3.CK(iKK3));
                i4++;
            }
            if (zza(new String(iArr3, 0, i4))) {
                Context context = this.zza;
                String strVd = hg.Vd("\u0017\" \u001f\u0015\u0012\"\u0016\"\u0014\u001e\"", (short) (C1499aX.Xd() ^ (-20155)), (short) (C1499aX.Xd() ^ (-29239)));
                Class<?> cls = Class.forName(C1561oA.ud("%1&3/(\"j\u001f*(-\u001d%*bv\" %\u0015'\"", (short) (C1499aX.Xd() ^ (-32149))));
                Class<?>[] clsArr = new Class[1];
                short sXd4 = (short) (C1580rY.Xd() ^ (-31692));
                int[] iArr4 = new int["!\u0017/\u0019`\u001e\u0016\"&k\u00144-#+#".length()];
                QB qb4 = new QB("!\u0017/\u0019`\u001e\u0016\"&k\u00144-#+#");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd4 ^ i5));
                    i5++;
                }
                clsArr[0] = Class.forName(new String(iArr4, 0, i5));
                Object[] objArr = {strVd};
                Method method = cls.getMethod(C1561oA.Yd("$#3\u0013:57)2\u0019,:?3.1", (short) (FB.Xd() ^ 24646)), clsArr);
                try {
                    method.setAccessible(true);
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) method.invoke(context, objArr)).getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        zzho.zzd(Xg.qd(",N<NQGMG\u0001VR\u0004QUHL\t\\P_\\caSV\u0012Yfdc\u0017F^nrkoi-", (short) (Od.Xd() ^ (-29301)), (short) (Od.Xd() ^ (-18379))));
                        zzqc zzqcVar = new zzqc();
                        try {
                            String strZza = this.zze.zza(this.zzd.zza());
                            zzho.zzd(str2 + strZza);
                            try {
                                inputStreamZza = zzqcVar.zza(strZza);
                            } catch (zzqh unused) {
                                zzho.zza(strZd + strZza);
                                this.zzb.zzb(3, 0);
                                inputStreamZza = null;
                            } catch (FileNotFoundException unused2) {
                                zzho.zza(strOd2 + strZza);
                                this.zzb.zzb(2, 0);
                                zzqcVar.zzb();
                                return;
                            } catch (IOException e2) {
                                zzho.zzb(str + strZza + strWd + e2.getMessage(), e2);
                                this.zzb.zzb(1, 0);
                                zzqcVar.zzb();
                                return;
                            }
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                IOUtils.copyStream(inputStreamZza, byteArrayOutputStream);
                                this.zzb.zzc(byteArrayOutputStream.toByteArray());
                                zzqcVar.zzb();
                                return;
                            } catch (IOException e3) {
                                zzho.zzb(strOd + strZza + strWd + e3.getMessage(), e3);
                                this.zzb.zzb(2, 0);
                                zzqcVar.zzb();
                                return;
                            }
                        } catch (Throwable th) {
                            zzqcVar.zzb();
                            throw th;
                        }
                    }
                    zzho.zze(Jg.Wd("k>jaTK\nih\n:e/\u0016\u00121+$TI8klzE K\u000b\u0007t-\u001a\r", (short) (C1499aX.Xd() ^ (-23219)), (short) (C1499aX.Xd() ^ (-9959))));
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } else {
                zzho.zza(Qg.kd("\u001d8A@591h)5*73,&n0$0*%.-\"'%cuvuv\u0004\u0003\u000e{q\u007f\u0002xzr\u0006xxdvfN?n\n\u0002|\u000e~8xzy4\bzv0u}yxz\u0002rvn&iifnbr`rfki\u001amg\u0017odie\u00122^S`\\UO7JVPLJWW\u0010YMK\u0018|\u0018PM>K\u0004F:F@;DC8=;k,8-:6/)}1#.%{_\u001e*\u001f,(!\u001bc%\u0019%\u001f\u001a#\"\u0017\u001c\u001aXjkjkxw\u0003pftvmogzmmYk[74BP", (short) (C1580rY.Xd() ^ (-28651)), (short) (C1580rY.Xd() ^ (-6914))));
            }
        } else {
            zzho.zza(C1561oA.Xd("g\u0005\u0010\u0011\b\u000e\bA\u0004\u0012\t\u0018\u0016\u0011\rW\u001b\u0011\u001f\u001b\u0018#$\u001b\"\"b~\u0005\f}\f\t\u0001\u0011k^\u0010-'$7*e(,-i?42m5?=>BK>D>w=?>H>P@TJQQ\u0004YU\u0007aX_]\f.\\Sb`[WAVd`^^mo*ukk:!>xwjy4xn|xu\u0001\u0002x\u007f\u007f2t\u0003y\t\u0007\u0002}T\n}\u000b\u0004\\B\u0003\u0011\b\u0017\u0015\u0010\fV\u001a\u0010\u001e\u001a\u0017\"#\u001a!!a}\u0004\u000b|\u000b\b\u007f\u0010^]m}", (short) (FB.Xd() ^ 8527)));
        }
        this.zzb.zzb(0, 0);
    }

    final boolean zza(String str) throws Throwable {
        Context context = this.zza;
        Class<?> cls = Class.forName(ZO.xd("\u00135W\tS56 g/%R\u001fe\u0012w\u001alhg\u0006CB", (short) (OY.Xd() ^ 10501), (short) (OY.Xd() ^ 4594)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-10877));
        short sXd2 = (short) (Od.Xd() ^ (-9038));
        int[] iArr = new int["2\u0001#&6vu\u0011b*PnP'-8@".length()];
        QB qb = new QB("2\u0001#&6vu\u0011b*PnP'-8@");
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
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Ig.wd("iJL\u0004 U&eD\u0002x\u000bMbB\u001b\b dd\u000fg\u0004", (short) (C1607wl.Xd() ^ 12959))).getMethod(EO.Od("p4\u0017Y\u0015CU&v\u0007o\u001fym", (short) (C1633zX.Xd() ^ (-8858))), new Class[0]);
            try {
                method2.setAccessible(true);
                String str2 = (String) method2.invoke(context, objArr2);
                short sXd3 = (short) (ZN.Xd() ^ 27449);
                int[] iArr2 = new int["\u007f\f\u0001\u000e\n\u0003|Ey\u0005\u0003\bw\u007f\u0005=~z:[klshmjQdpbgdp".length()];
                QB qb2 = new QB("\u007f\f\u0001\u000e\n\u0003|Ey\u0005\u0003\bw\u007f\u0005=~z:[klshmjQdpbgdp");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr2 = new Class[2];
                clsArr2[0] = Class.forName(C1593ug.zd("\"\u001a0\u001ci)\u001f-'n\u001576.4.", (short) (OY.Xd() ^ 8423), (short) (OY.Xd() ^ 30385)));
                short sXd4 = (short) (C1607wl.Xd() ^ 19745);
                int[] iArr3 = new int["uk\u007fi5rfrj0Ttqgkc".length()];
                QB qb3 = new QB("uk\u007fi5rfrj0Ttqgkc");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                    i4++;
                }
                clsArr2[1] = Class.forName(new String(iArr3, 0, i4));
                Object[] objArr3 = {str, str2};
                short sXd5 = (short) (C1499aX.Xd() ^ (-1597));
                int[] iArr4 = new int["IOMLU;Q_[Xcd[bb".length()];
                QB qb4 = new QB("IOMLU;Q_[Xcd[bb");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd5 + sXd5) + i5));
                    i5++;
                }
                Method method3 = cls2.getMethod(new String(iArr4, 0, i5), clsArr2);
                try {
                    method3.setAccessible(true);
                    return ((Integer) method3.invoke(packageManager, objArr3)).intValue() == 0;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
