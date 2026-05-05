package yg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UB {
    public static List<String> Kd() throws Throwable {
        Object obj;
        Object obj2;
        Class<?> cls = Class.forName(Qg.kd("#\u0010U\u001f~", (short) (C1580rY.Xd() ^ ((1830945653 ^ 589234060) ^ (-1312612314))), (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ 1134260958))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (OY.Xd() ^ (-69954255)));
        short sXd2 = (short) (C1499aX.Xd() ^ (1216376050 ^ (-1216370621)));
        int[] iArr = new int["\u0002\r".length()];
        QB qb = new QB("\u0002\r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            Context context = (Context) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = new Object[0];
            Method method = Class.forName(C1561oA.ud("v\u0003w\u0005\u0001ys<p{y~nv{4Hsqvfxs", (short) (Od.Xd() ^ ((576530872 ^ 2013184486) ^ (-1436781358))))).getMethod(C1561oA.yd("\u001e\u001d)\u0006\u0014\u0017\u001c\u0013\u0016\u0015z\u000f\u0018\u0011", (short) (Od.Xd() ^ (867821754 ^ (-867803391)))), new Class[0]);
            try {
                method.setAccessible(true);
                String str = (String) method.invoke(context, objArr2);
                short sXd3 = (short) (OY.Xd() ^ (1498495309 ^ 1498499865));
                int[] iArr2 = new int["\u0014\u0003J\u0016w".length()];
                QB qb2 = new QB("\u0014\u0003J\u0016w");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                    i3++;
                }
                Object[] objArr3 = new Object[0];
                Method declaredMethod2 = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(Xg.qd("\u001b(", (short) (FB.Xd() ^ (10415633 ^ 10409129)), (short) (FB.Xd() ^ (1462296194 ^ 1462294545))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    Context context2 = (Context) declaredMethod2.invoke(null, objArr3);
                    Class<?> cls2 = Class.forName(Jg.Wd("T\u0011\u00163ClvS\u0018Sazz3L\u00159\u0019'<<\u0003\u000e", (short) (FB.Xd() ^ ((1050318661 ^ 1263872668) ^ 1976544539)), (short) (FB.Xd() ^ ((52167410 ^ 674659135) ^ 724185314))));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr4 = new Object[0];
                    short sXd4 = (short) (C1607wl.Xd() ^ (1887439637 ^ 1887447676));
                    short sXd5 = (short) (C1607wl.Xd() ^ ((17816679 ^ 514822967) ^ 530597475));
                    int[] iArr3 = new int["\u0001M,B\u0013\u001b%0j\u001b:1\n\u001f1\u001f2".length()];
                    QB qb3 = new QB("\u0001M,B\u0013\u001b%0j\u001b:1\n\u001f1\u001f2");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                        i4++;
                    }
                    Method method2 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                    try {
                        method2.setAccessible(true);
                        PackageManager packageManager = (PackageManager) method2.invoke(context2, objArr4);
                        ArrayList arrayList = new ArrayList();
                        try {
                            Class<?> cls3 = Class.forName(C1626yg.Ud("I\u0015\u001b%Zi\u0019^;\u000fc%<B4]om\u001c>8\u001a>\u0002qWFf?G;:|", (short) (Od.Xd() ^ ((525328638 ^ 535551542) ^ (-10751289))), (short) (Od.Xd() ^ (1722154563 ^ (-1722124616)))));
                            Class<?>[] clsArr3 = new Class[(619065981 ^ 133142148) ^ 587834619];
                            short sXd6 = (short) (C1580rY.Xd() ^ ((1582484832 ^ 1255235268) ^ (-344166720)));
                            int[] iArr4 = new int["\u001d^\u0002!5.r\u0001\"-LsBG\u0014/".length()];
                            QB qb4 = new QB("\u001d^\u0002!5.r\u0001\"-LsBG\u0014/");
                            int i5 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd6 + i5)));
                                i5++;
                            }
                            clsArr3[0] = Class.forName(new String(iArr4, 0, i5));
                            clsArr3[1] = Integer.TYPE;
                            Object[] objArr5 = new Object[(1980044024 ^ 75393868) ^ 1920694710];
                            objArr5[0] = str;
                            objArr5[1] = 0;
                            Method method3 = cls3.getMethod(EO.Od("\u001eK>l~4F\u0005\"\u000e\u0019u+.\u0007\u0014AN", (short) (C1633zX.Xd() ^ (816687509 ^ (-816685991)))), clsArr3);
                            try {
                                method3.setAccessible(true);
                                ApplicationInfo applicationInfo = (ApplicationInfo) method3.invoke(packageManager, objArr5);
                                short sXd7 = (short) (OY.Xd() ^ (1111115147 ^ 1111129330));
                                int[] iArr5 = new int["\u0003\u000f\u0004\u0011\r\u0006\u007fH|\b\u0006\u000bz\u0003\b@\u0002}=O}|wsli{otrLpgo".length()];
                                QB qb5 = new QB("\u0003\u000f\u0004\u0011\r\u0006\u007fH|\b\u0006\u000bz\u0003\b@\u0002}=O}|wsli{otrLpgo");
                                int i6 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i6] = xuXd5.fK(sXd7 + sXd7 + sXd7 + i6 + xuXd5.CK(iKK5));
                                    i6++;
                                }
                                String str2 = new String(iArr5, 0, i6);
                                String strZd = C1593ug.zd("7=+64/ =DB47\u0017=G", (short) (OY.Xd() ^ (1973731408 ^ 1973737675)), (short) (OY.Xd() ^ ((2077601364 ^ 1993859688) ^ 218259762)));
                                try {
                                    Class<?> cls4 = Class.forName(str2);
                                    Field field = 1 != 0 ? cls4.getField(strZd) : cls4.getDeclaredField(strZd);
                                    field.setAccessible(true);
                                    obj = field.get(applicationInfo);
                                } catch (Throwable th) {
                                    obj = null;
                                }
                                arrayList.add((String) obj);
                                String strOd = C1561oA.od("*6+84-'o$/-2\"*/g)%dv%$\u001f\u001b\u0014\u0011#\u0017\u001c\u001as\u0018\u000f\u0017", (short) (FB.Xd() ^ (1739979249 ^ 1739949559)));
                                String strKd = C1561oA.Kd("31.,8\u0015;)42-\u001e;B@25\u0015;EG", (short) (C1499aX.Xd() ^ (1339457951 ^ (-1339489319))));
                                try {
                                    Class<?> cls5 = Class.forName(strOd);
                                    Field field2 = 1 != 0 ? cls5.getField(strKd) : cls5.getDeclaredField(strKd);
                                    field2.setAccessible(true);
                                    obj2 = field2.get(applicationInfo);
                                } catch (Throwable th2) {
                                    obj2 = null;
                                }
                                arrayList.addAll(Arrays.asList((String[]) obj2));
                                return arrayList;
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (Throwable th3) {
                            return arrayList;
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
    }

    public static ApplicationInfo Xd() throws Throwable {
        int iXd = C1607wl.Xd() ^ (-1849957334);
        int iXd2 = C1633zX.Xd();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.Zd("v\u0007mjM", (short) (iXd2 ^ (1993156024 ^ (-1993176092))), (short) (C1633zX.Xd() ^ iXd))).getDeclaredMethod(C1561oA.Xd("8E", (short) (OY.Xd() ^ ((1294600232 ^ 384689717) ^ 1539807658))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Context context = (Context) declaredMethod.invoke(null, objArr);
            int iXd3 = C1499aX.Xd();
            Object[] objArr2 = new Object[0];
            Method method = Class.forName(Wg.vd("'5,;1,(r!..5\u001f)0j\u0019FFM7KH", (short) (iXd3 ^ ((891321559 ^ 395936328) ^ (-582584864))))).getMethod(Qg.kd("\"\u001f-\b\u0018\u0019 \u0015\u001a\u0017}\u0011\u001d\u000f\u0014\u0011\u001d", (short) (C1633zX.Xd() ^ ((1495757915 ^ 2130547524) ^ (-668661847))), (short) (C1633zX.Xd() ^ ((863979992 ^ 1119351646) ^ (-1908974338)))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr2);
                short sXd = (short) (OY.Xd() ^ ((306315768 ^ 1028216683) ^ 789279890));
                int iXd4 = OY.Xd();
                Object[] objArr3 = new Object[0];
                Method method2 = Class.forName(hg.Vd("\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0012\u0017\u0007\u0019\u0014", sXd, (short) (iXd4 ^ (1735858658 ^ 1735857397)))).getMethod(C1561oA.ud("SP^9IJQFKH0BMD", (short) (OY.Xd() ^ ((1080156594 ^ 638766760) ^ 1718814371))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr3);
                    try {
                        Class<?> cls = Class.forName(C1561oA.yd("\u000f\u001d\u0014#\u0019\u0014\u0010Z\u0019&&-\u0017!(b\u000e\fMpz}\u0007}\r\ft\n\u0010\u0004\u000b\n\u007f", (short) (C1633zX.Xd() ^ (1198552197 ^ (-1198549766)))));
                        Class<?>[] clsArr = new Class[581430998 ^ 581430996];
                        clsArr[0] = Class.forName(C1561oA.Yd("{s\nuC\u0003x\u0007\u0001Hn\u0011\u0010\b\u000e\b", (short) (C1499aX.Xd() ^ ((722179878 ^ 12763858) ^ (-734595424)))));
                        clsArr[1] = Integer.TYPE;
                        Object[] objArr4 = new Object[30231125 ^ 30231127];
                        objArr4[0] = str;
                        objArr4[1] = 128;
                        Method method3 = cls.getMethod(Xg.qd("dcsAqromhg{qxxTzs}", (short) (OY.Xd() ^ (1328537812 ^ 1328527054)), (short) (OY.Xd() ^ (985910659 ^ 985917063))), clsArr);
                        try {
                            method3.setAccessible(true);
                            return (ApplicationInfo) method3.invoke(packageManager, objArr4);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        return null;
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
    }
}
