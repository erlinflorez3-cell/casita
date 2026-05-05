package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.drew.metadata.exif.makernotes.SanyoMakernoteDirectory;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public class SplitInstallHelper {
    private static final com.google.android.play.core.splitinstall.internal.zzu zza = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallHelper");

    private SplitInstallHelper() {
    }

    public static void loadLibrary(Context context, String str) throws UnsatisfiedLinkError {
        Object obj;
        synchronized (zzn.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e2) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1593ug.zd("FTKZXSO\u001aP]]dV`g\"8eel^ro", (short) (ZN.Xd() ^ SanyoMakernoteDirectory.TAG_LIGHT_SOURCE_SPECIAL), (short) (ZN.Xd() ^ 11432))).getMethod(C1561oA.od("C@N\u001aHGB>74F:?=\u0017;2:", (short) (C1633zX.Xd() ^ (-29528))), new Class[0]);
                try {
                    method.setAccessible(true);
                    ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
                    short sXd = (short) (C1607wl.Xd() ^ 8833);
                    int[] iArr = new int["^lcrpkg2huu|nx\u007f:}{=Q\u0002\u0003\u007f}xw\f\u0002\t\td\u000b\u0004\u000e".length()];
                    QB qb = new QB("^lcrpkg2huu|nx\u007f:}{=Q\u0002\u0003\u007f}xw\f\u0002\t\td\u000b\u0004\u000e");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                        i2++;
                    }
                    String str2 = new String(iArr, 0, i2);
                    String strZd = Wg.Zd("WZ\u001d\"\"\"7aFd\u0005( uK?", (short) (ZN.Xd() ^ 22451), (short) (ZN.Xd() ^ 10936));
                    try {
                        Class<?> cls = Class.forName(str2);
                        Field field = 1 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
                        field.setAccessible(true);
                        obj = field.get(applicationInfo);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    String strMapLibraryName = System.mapLibraryName(str);
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) obj);
                    short sXd2 = (short) (ZN.Xd() ^ 27008);
                    int[] iArr2 = new int["O".length()];
                    QB qb2 = new QB("O");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                        i3++;
                    }
                    sb.append(new String(iArr2, 0, i3));
                    sb.append(strMapLibraryName);
                    String string = sb.toString();
                    if (!new File(string).exists()) {
                        throw e2;
                    }
                    System.load(string);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }
    }

    public static void updateAppInfo(Context context) throws Throwable {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        com.google.android.play.core.splitinstall.internal.zzu zzuVar = zza;
        zzuVar.zzd(Wg.vd("\u001c;CDFLB{EKRPFZFL9KJSNUP.caPTXWfh", (short) (FB.Xd() ^ 27182)), new Object[0]);
        try {
            Class<?> cls = Class.forName(Qg.kd("<H=JF?9\u00024BA}\u00101A5A3=A\u001b.7)$&", (short) (C1633zX.Xd() ^ (-22810)), (short) (C1633zX.Xd() ^ (-16526))));
            short sXd = (short) (C1499aX.Xd() ^ (-2003));
            short sXd2 = (short) (C1499aX.Xd() ^ (-17602));
            int[] iArr = new int["EVRQCKP\u001c=MAM?IM':C502".length()];
            QB qb = new QB("EVRQCKP\u001c=MAM?IM':C502");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField(C1561oA.ud(">\u0011?>!4=/*,", (short) (Od.Xd() ^ (-29012))));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            Method method2 = obj.getClass().getMethod(C1561oA.yd("IOZXJ^NT=OR[RYX6geX\\\\[np", (short) (C1580rY.Xd() ^ (-5759))), Integer.TYPE, String[].class);
            String[] strArr = new String[1];
            Object[] objArr = new Object[0];
            Method method3 = Class.forName(C1561oA.Yd("\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^t\"\")\u001b/,", (short) (ZN.Xd() ^ 4056))).getMethod(Xg.qd("JIY6HKTKRQ;O\\U", (short) (ZN.Xd() ^ 11542), (short) (ZN.Xd() ^ 13027)), new Class[0]);
            try {
                method3.setAccessible(true);
                strArr[0] = (String) method3.invoke(context, objArr);
                method2.invoke(obj, 3, strArr);
                zzuVar.zzd(Jg.Wd("Uh\u0005\u0019#\u0017c=R\u0012_e\n-\u0003\u007f\"Yq<Sn|\u0002\u000f\u0016I^-S\u0006", (short) (ZN.Xd() ^ 10030), (short) (ZN.Xd() ^ 14569)), new Object[0]);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            com.google.android.play.core.splitinstall.internal.zzu zzuVar2 = zza;
            Object[] objArr2 = new Object[0];
            short sXd3 = (short) (FB.Xd() ^ 14314);
            short sXd4 = (short) (FB.Xd() ^ 14472);
            int[] iArr2 = new int["a\u0019'6\f7L3+*]\u0018\u0018\u0019\t!\u0013^i\u001b\u001ew^F;\u00030_eTq\u007fL\u001d/\u000bW{*\u00049c5K}\nS\u000bN\u001a\u0017\u00012".length()];
            QB qb2 = new QB("a\u0019'6\f7L3+*]\u0018\u0018\u0019\t!\u0013^i\u001b\u001ew^F;\u00030_eTq\u007fL\u001d/\u000bW{*\u00049c5K}\nS\u000bN\u001a\u0017\u00012");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                i3++;
            }
            zzuVar2.zzc(e3, new String(iArr2, 0, i3), objArr2);
        }
    }
}
