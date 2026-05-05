package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import javax.annotation.Nullable;
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
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class GoogleSignatureVerifier {

    @Nullable
    private static GoogleSignatureVerifier zza = null;

    @Nullable
    private static volatile Set zzb = null;

    @Nullable
    private static volatile Set zzc = null;
    private final Context zzd;
    private volatile String zze;

    public GoogleSignatureVerifier(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od(".\u000eU@\\\u0013.\u0018\btqYx\f*\u0002[uM\u007f+\u0007%", (short) (FB.Xd() ^ 6234))).getMethod(C1561oA.Qd("}z\tT\u0003\u0002|xqn\u0001tywKvtyi{v", (short) (ZN.Xd() ^ 7080)), new Class[0]);
        try {
            method.setAccessible(true);
            this.zzd = (Context) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (zza == null) {
                zzn.zze(context);
                zza = new GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    @Nullable
    static final zzj zza(PackageInfo packageInfo, zzj... zzjVarArr) {
        if (packageInfo.signatures != null && packageInfo.signatures.length == 1) {
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < zzjVarArr.length; i2++) {
                if (zzjVarArr[i2].equals(zzkVar)) {
                    return zzjVarArr[i2];
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzb(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zzb(android.content.pm.PackageInfo, boolean):boolean");
    }

    private final zzw zzc(@Nullable String str, boolean z2, boolean z3) throws Throwable {
        zzw zzwVarZzc;
        Object obj;
        String strXd = C1561oA.Xd("!)!\"V($!", (short) (Od.Xd() ^ (-16626)));
        if (str == null) {
            return zzw.zzc(strXd);
        }
        if (str.equals(this.zze)) {
            return zzw.zzb();
        }
        if (zzn.zzg()) {
            zzwVarZzc = zzn.zzb(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd), false, false);
        } else {
            try {
                Context context = this.zzd;
                Object[] objArr = new Object[0];
                Method method = Class.forName(Wg.vd("\u0001\u000f\u0006\u0015\u000b\u0006\u0002L\u000b\u0018\u0018\u001f\t\u0013\u001aTR\u007f\u007f\u0007p\u0005\u0002", (short) (C1580rY.Xd() ^ (-7894)))).getMethod(Qg.kd("IFT/?@G<A>%8D6;8D", (short) (OY.Xd() ^ OlympusMakernoteDirectory.TAG_AF_RESULT), (short) (OY.Xd() ^ 24157)), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    Class<?> cls = Class.forName(hg.Vd("IUJWSLF\u000fCNLQAIN\u0007HD\u0004%56=274\u001b.:,1.:", (short) (FB.Xd() ^ 20065), (short) (FB.Xd() ^ 25300)));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1561oA.ud("J@T>\nG;G?\u0005)IF<@8", (short) (C1580rY.Xd() ^ (-19394))));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr2 = {str, 64};
                    Method method2 = cls.getMethod(C1561oA.yd("ZWe@XY`Ub_Bfem", (short) (ZN.Xd() ^ 10547)), clsArr);
                    try {
                        method2.setAccessible(true);
                        PackageInfo packageInfo = (PackageInfo) method2.invoke(packageManager, objArr2);
                        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd);
                        if (packageInfo == null) {
                            zzwVarZzc = zzw.zzc(strXd);
                        } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                            short sXd = (short) (C1580rY.Xd() ^ (-29316));
                            short sXd2 = (short) (C1580rY.Xd() ^ (-27036));
                            int[] iArr = new int["_0yWF\u000bn;\u007f3J\u0003&0\r{Ac\u0011+".length()];
                            QB qb = new QB("_0yWF\u000bn;\u007f3J\u0003&0\r{Ac\u0011+");
                            int i2 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                                i2++;
                            }
                            zzwVarZzc = zzw.zzc(new String(iArr, 0, i2));
                        } else {
                            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            zzwVarZzc = zzn.zza(str2, zzkVar, zHonorsDebugCertificates, false);
                            if (zzwVarZzc.zza && packageInfo.applicationInfo != null) {
                                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                                String strYd = C1561oA.Yd("8F=LJEA\fBOOVHRY\u0014WU\u0017+[\\YWRQe[bb>d]g", (short) (Od.Xd() ^ (-5991)));
                                String strQd = Xg.qd("^e[bo", (short) (C1607wl.Xd() ^ 6219), (short) (C1607wl.Xd() ^ 5759));
                                try {
                                    Class<?> cls2 = Class.forName(strYd);
                                    Field field = 1 != 0 ? cls2.getField(strQd) : cls2.getDeclaredField(strQd);
                                    field.setAccessible(true);
                                    obj = field.get(applicationInfo);
                                } catch (Throwable th) {
                                    obj = null;
                                }
                                if ((((Integer) obj).intValue() & 2) != 0 && zzn.zza(str2, zzkVar, false, true).zza) {
                                    zzwVarZzc = zzw.zzc(Jg.Wd("C\u001cj;|6\u0006^>\u0011z+O.|2w#/.\u0002l\u001e#:!r_\u00022\t=nY\u007fV", (short) (C1499aX.Xd() ^ (-24576)), (short) (C1499aX.Xd() ^ (-3186))));
                                }
                            }
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (PackageManager.NameNotFoundException e4) {
                short sXd3 = (short) (FB.Xd() ^ 1869);
                short sXd4 = (short) (FB.Xd() ^ 5285);
                int[] iArr2 = new int["M\b6*pA5".length()];
                QB qb2 = new QB("M\b6*pA5");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                    i3++;
                }
                return zzw.zzd(new String(iArr2, 0, i3).concat(str), e4);
            }
        }
        if (zzwVarZzc.zza) {
            this.zze = str;
        }
        return zzwVarZzc;
    }

    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        return zzb(packageInfo, true) && GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd);
    }

    public boolean isPackageGoogleSigned(@Nullable String str) throws Throwable {
        zzw zzwVarZzc = zzc(str, false, false);
        zzwVarZzc.zze();
        return zzwVarZzc.zza;
    }

    public boolean isUidGoogleSigned(int i2) throws Throwable {
        zzw zzwVarZzc;
        int length;
        Context context = this.zzd;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("\u0018t<.s)<= \u0010\u0015t3F 7$B\u0019r!\u0014]", (short) (Od.Xd() ^ (-3406)))).getMethod(EO.Od("2jg X\u001fWM*hRD\u001c\u0005?\u0018Q", (short) (Od.Xd() ^ (-4297))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Class<?> cls = Class.forName(C1561oA.Qd("/;0=92,t)427'/4l.*i\u000b\u001b\u001c#\u0018\u001d\u001a\u0001\u0014 \u0012\u0017\u0014 ", (short) (C1633zX.Xd() ^ (-2539))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr2 = {Integer.valueOf(i2)};
            Method method2 = cls.getMethod(C1593ug.zd("\u000f\u000e\u001ez\r\u0010\u0019\u0010\u0017\u0016%x#'\u000b \u001c", (short) (C1499aX.Xd() ^ (-20408)), (short) (C1499aX.Xd() ^ (-369))), clsArr);
            try {
                method2.setAccessible(true);
                String[] strArr = (String[]) method2.invoke(packageManager, objArr2);
                if (strArr != null && (length = strArr.length) != 0) {
                    zzwVarZzc = null;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            Preconditions.checkNotNull(zzwVarZzc);
                            break;
                        }
                        zzwVarZzc = zzc(strArr[i3], false, false);
                        if (zzwVarZzc.zza) {
                            break;
                        }
                        i3++;
                    }
                } else {
                    short sXd = (short) (FB.Xd() ^ 22702);
                    int[] iArr = new int["TT\u0004SMHS".length()];
                    QB qb = new QB("TT\u0004SMHS");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK(sXd + sXd + i4 + xuXd.CK(iKK));
                        i4++;
                    }
                    zzwVarZzc = zzw.zzc(new String(iArr, 0, i4));
                }
                zzwVarZzc.zze();
                return zzwVarZzc.zza;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
