package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.KotlinDetector;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import cz.msebera.android.httpclient.message.TokenParser;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
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

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    private static final String ANDROID_INSTALLER = "android-installer";
    private static final String ANDROID_PLATFORM = "android-platform";
    private static final String DEVICE_BRAND = "device-brand";
    private static final String DEVICE_MODEL = "device-model";
    private static final String DEVICE_NAME = "device-name";
    private static final String FIREBASE_ANDROID = "fire-android";
    private static final String FIREBASE_COMMON = "fire-core";
    private static final String KOTLIN = "kotlin";
    private static final String MIN_SDK = "android-min-sdk";
    private static final String TARGET_SDK = "android-target-sdk";

    static /* synthetic */ String lambda$getComponents$0(Context context) throws Throwable {
        Object obj;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("^lcrpkg2huu|nx\u007f:P}}\u0005v\u000b\b", (short) (OY.Xd() ^ 22783), (short) (OY.Xd() ^ 8576))).getMethod(Jg.Wd("P\u0005y /xjQ/\u0007 L4\u001d->\u0018\u001b", (short) (C1580rY.Xd() ^ (-23753)), (short) (C1580rY.Xd() ^ (-1444))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            if (applicationInfo == null) {
                return "";
            }
            String strXd = ZO.xd("^\u001c.obY\u0011\u001c=\u0004two42\\Z\u0018gqHp\u0018\u0016\u0019\u00162&v$,\u0011E\u0003", (short) (OY.Xd() ^ 13673), (short) (OY.Xd() ^ 13111));
            String strUd = C1626yg.Ud("?XLQc\\\tTLaKWa]$D", (short) (C1580rY.Xd() ^ (-6689)), (short) (C1580rY.Xd() ^ (-617)));
            try {
                Class<?> cls = Class.forName(strXd);
                Field field = 1 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            return String.valueOf(((Integer) obj).intValue());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ String lambda$getComponents$1(Context context) throws Throwable {
        Object obj;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("0o\u0012NX|\u001a\nwjaOpu&@{8m\n3\u0011x", (short) (C1580rY.Xd() ^ (-19460)))).getMethod(EO.Od("~V'T\u001cp\u0001\u0016R5>\u0019mn9E\u0012\u001d", (short) (C1607wl.Xd() ^ 31237)), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            if (applicationInfo == null) {
                return "";
            }
            String strQd = C1561oA.Qd("w\u0004x\u0006\u0002zt=q|z\u007fow|5vr2Drqlha^pdigAe\\d", (short) (OY.Xd() ^ 26632));
            String strZd = C1593ug.zd("+(.\u0014&.\u001a*8:188", (short) (Od.Xd() ^ (-5401)), (short) (Od.Xd() ^ (-16204)));
            try {
                Class<?> cls = Class.forName(strQd);
                Field field = 1 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            return String.valueOf(((Integer) obj).intValue());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ String lambda$getComponents$2(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("<H=JF?9\u00026A?D4<Ay\u000e97<,>9", (short) (C1499aX.Xd() ^ (-18791)))).getMethod(C1561oA.Kd("21A\u001e03<3:9\"7E9@?M", (short) (C1499aX.Xd() ^ (-2389))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            String strZd = Wg.Zd("wv]aN:*d\u0014~\u0001gkGL1n'\u001c\tn(cFA,.\u0017\u0011xsc", (short) (C1607wl.Xd() ^ 3313), (short) (C1607wl.Xd() ^ 6842));
            Class<?> cls = Class.forName(C1561oA.Xd("z\t\u007f\u000f\r\b\u0004N\u0005\u0012\u0012\u0019\u000b\u0015\u001cV\u001a\u0018Y|\u000f\u0012\u001b\u0012\u0019\u0018\u0001\u0016$\u0018\u001f\u001e,", (short) (C1499aX.Xd() ^ (-474))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (Od.Xd() ^ (-18594));
            int[] iArr = new int["\u0019\u0011'\u0013X\u0018\u000e\u001c\u001ee\f.%\u001d#\u001d".length()];
            QB qb = new QB("\u0019\u0011'\u0013X\u0018\u000e\u001c\u001ee\f.%\u001d#\u001d");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr2 = {strZd};
            Method method2 = cls.getMethod(Qg.kd("TL]<aZZJQ)GBTTPB", (short) (Od.Xd() ^ (-1047)), (short) (Od.Xd() ^ (-25668))), clsArr);
            try {
                method2.setAccessible(true);
                if (((Boolean) method2.invoke(packageManager, objArr2)).booleanValue()) {
                    return hg.Vd("JK", (short) (C1607wl.Xd() ^ 28414), (short) (C1607wl.Xd() ^ 16568));
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.ud("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ", (short) (C1607wl.Xd() ^ 13842))).getMethod(C1561oA.yd("B?Q,89D9:7\"5=/85]", (short) (C1607wl.Xd() ^ 21911)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    PackageManager packageManager2 = (PackageManager) method3.invoke(context, objArr3);
                    short sXd2 = (short) (Od.Xd() ^ (-22834));
                    int[] iArr2 = new int["drixvqm8sm\u007fr\u0007q\u0004wA\t\u000f\u0007|F\u0011{\u0010\u007f\u0006".length()];
                    QB qb2 = new QB("drixvqm8sm\u007fr\u0007q\u0004wA\t\u000f\u0007|F\u0011{\u0010\u007f\u0006");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                        i3++;
                    }
                    String str = new String(iArr2, 0, i3);
                    Class<?> cls2 = Class.forName(Xg.qd("t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016P\u0014\u0012Sv\t\f\u0015\f\u0013\u0012z\u0010\u001e\u0012\u0019\u0018&", (short) (Od.Xd() ^ (-19205)), (short) (Od.Xd() ^ (-19750))));
                    Class<?>[] clsArr2 = new Class[1];
                    short sXd3 = (short) (C1580rY.Xd() ^ (-3501));
                    short sXd4 = (short) (C1580rY.Xd() ^ (-28451));
                    int[] iArr3 = new int["P6$=bw= I\u0007dT+xM|".length()];
                    QB qb3 = new QB("P6$=bw= I\u0007dT+xM|");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd4) ^ sXd3));
                        i4++;
                    }
                    clsArr2[0] = Class.forName(new String(iArr3, 0, i4));
                    Object[] objArr4 = {str};
                    Method method4 = cls2.getMethod(ZO.xd(" m\u000f\u000b\n5\u001d{3lj\u0002GNg;", (short) (OY.Xd() ^ 21097), (short) (OY.Xd() ^ 1544)), clsArr2);
                    try {
                        method4.setAccessible(true);
                        if (((Boolean) method4.invoke(packageManager2, objArr4)).booleanValue()) {
                            return C1626yg.Ud(">2LDh", (short) (Od.Xd() ^ (-8153)), (short) (Od.Xd() ^ (-23530)));
                        }
                        short sXd5 = (short) (C1580rY.Xd() ^ (-14496));
                        int[] iArr4 = new int["<#'QWsV\u0011f78\\}|#fR|D}/\u001f=".length()];
                        QB qb4 = new QB("<#'QWsV\u0011f78\\}|#fR|D}/\u001f=");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd5 + i5)));
                            i5++;
                        }
                        Object[] objArr5 = new Object[0];
                        Method method5 = Class.forName(new String(iArr4, 0, i5)).getMethod(EO.Od("Qv8<6\u0005XGw*\u0010B}j\u00195v", (short) (ZN.Xd() ^ 13317)), new Class[0]);
                        try {
                            method5.setAccessible(true);
                            PackageManager packageManager3 = (PackageManager) method5.invoke(context, objArr5);
                            Object[] objArr6 = {C1561oA.Qd("\u000e\u001a\u000f\u001c\u0018\u0011\u000bS\r\u0005\u0015\u0006\u0018\u0001\u0011\u0003J\u0010\u0014\n}Ew\u000b\t\u0003\u007f\u0001\u0005x\u0005r", (short) (C1580rY.Xd() ^ (-22580)))};
                            Method method6 = Class.forName(C1593ug.zd("\u007f\u000e\u0005\u0014\u0012\r\tS\n\u0017\u0017\u001e\u0010\u001a![\u001f\u001d^\u0002\u0014\u0017 \u0017\u001e\u001d\u0006\u001b)\u001d$#1", (short) (C1580rY.Xd() ^ (-7564)), (short) (C1580rY.Xd() ^ (-2469)))).getMethod(C1561oA.Kd("qk~_\u0007\u0002\u0004u~Xxu\n\f\n}", (short) (ZN.Xd() ^ 4763)), Class.forName(C1561oA.od("YOcM\u0019VJVN\u00148XUKOG", (short) (C1607wl.Xd() ^ 27278))));
                            try {
                                method6.setAccessible(true);
                                if (((Boolean) method6.invoke(packageManager3, objArr6)).booleanValue()) {
                                    return Wg.Zd("]\u001aA\\", (short) (Od.Xd() ^ (-6795)), (short) (Od.Xd() ^ (-1303)));
                                }
                                Class<?> cls3 = Class.forName(C1561oA.Xd("\u0013!\u0018'% \u001cf\u001d**1#-4n\u0005229+?<", (short) (OY.Xd() ^ 19265)));
                                Class<?>[] clsArr3 = new Class[0];
                                Object[] objArr7 = new Object[0];
                                short sXd6 = (short) (C1499aX.Xd() ^ (-6618));
                                int[] iArr5 = new int["\u001e\u001b-\b\u0014\u0015 \u0015&#\u000e!)\u001b$!\u0019".length()];
                                QB qb5 = new QB("\u001e\u001b-\b\u0014\u0015 \u0015&#\u000e!)\u001b$!\u0019");
                                int i6 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i6] = xuXd5.fK((sXd6 ^ i6) + xuXd5.CK(iKK5));
                                    i6++;
                                }
                                Method method7 = cls3.getMethod(new String(iArr5, 0, i6), clsArr3);
                                try {
                                    method7.setAccessible(true);
                                    PackageManager packageManager4 = (PackageManager) method7.invoke(context, objArr7);
                                    Object[] objArr8 = {Qg.kd("\u000e\u001a\u000f\u001c\u0018\u0011\u000bS\r\u0005\u0015\u0006\u0018\u0001\u0011\u0003J\u0010\u0014\n}E{\u0003vxvuus", (short) (C1633zX.Xd() ^ (-8939)), (short) (C1633zX.Xd() ^ (-13380)))};
                                    Method method8 = Class.forName(hg.Vd("\u001d)\u001e+' \u001ab\u0017\" %\u0015\u001d\"Z\u001c\u0018Wx\t\n\u0011\u0006\u000b\bn\u0002\u000e\u007f\u0005\u0002\u000e", (short) (ZN.Xd() ^ 20861), (short) (ZN.Xd() ^ 15679))).getMethod(C1561oA.yd("pj}^\u0006\u0001\u0003tmGgdxzxl", (short) (C1580rY.Xd() ^ (-15287))), Class.forName(C1561oA.ud("\n\u007f\u0014}I\u0007z\u0007~Dh\t\u0006{\u007fw", (short) (C1499aX.Xd() ^ (-30548)))));
                                    try {
                                        method8.setAccessible(true);
                                        return ((Boolean) method8.invoke(packageManager4, objArr8)).booleanValue() ? C1561oA.Yd("r{quuvxx", (short) (C1633zX.Xd() ^ (-4831))) : "";
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
            } catch (InvocationTargetException e8) {
                throw e8.getCause();
            }
        } catch (InvocationTargetException e9) {
            throw e9.getCause();
        }
    }

    static /* synthetic */ String lambda$getComponents$3(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("p~u\u0005\u0003}yDz\b\b\u000f\u0001\u000b\u0012Lb\u0010\u0010\u0017\t\u001d\u001a", (short) (C1607wl.Xd() ^ 21660), (short) (C1607wl.Xd() ^ 11022))).getMethod(Jg.Wd("K>jb\u0011)n\u0001$X].Xa\u0005\u001fi", (short) (C1499aX.Xd() ^ (-19616)), (short) (C1499aX.Xd() ^ (-26641))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(ZO.xd("cqi{\u0006&i0r:\u0011br&\u000b-)\u0016oBJ4Q", (short) (OY.Xd() ^ 7740), (short) (OY.Xd() ^ 30534))).getMethod(C1626yg.Ud("I\u001c{\u00108k*R\u0014^m:UI", (short) (FB.Xd() ^ 5547), (short) (FB.Xd() ^ 12269)), new Class[0]);
            try {
                method2.setAccessible(true);
                String str = (String) method2.invoke(context, objArr2);
                short sXd = (short) (Od.Xd() ^ (-14260));
                int[] iArr = new int["4{\u001eJ\\)}\u0006knmSt\u0002\u001a<%B9qC\u007f[g2*rQ6\u001ay`?".length()];
                QB qb = new QB("4{\u001eJ\\)}\u0006knmSt\u0002\u001a<%B9qC\u007f[g2*rQ6\u001ay`?");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                Object[] objArr3 = {str};
                Method method3 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("daoCgkkWa`XdAQRYNSP8JUL", (short) (FB.Xd() ^ 10306)), Class.forName(EO.Od("i\u001a\u0011\\qt\u000e#n\nELxafF", (short) (FB.Xd() ^ 720))));
                try {
                    method3.setAccessible(true);
                    String str2 = (String) method3.invoke(packageManager, objArr3);
                    return str2 != null ? safeValue(str2) : "";
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

    private static String safeValue(String str) {
        return str.replace(TokenParser.SP, '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.component());
        arrayList.add(DefaultHeartBeatController.component());
        arrayList.add(LibraryVersionComponent.create(FIREBASE_ANDROID, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.create(FIREBASE_COMMON, BuildConfig.VERSION_NAME));
        arrayList.add(LibraryVersionComponent.create(DEVICE_NAME, safeValue(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.create(DEVICE_MODEL, safeValue(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.create(DEVICE_BRAND, safeValue(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.fromContext(TARGET_SDK, new LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.lambda$getComponents$0((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(MIN_SDK, new LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda1
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.lambda$getComponents$1((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(ANDROID_PLATFORM, new LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda2
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.lambda$getComponents$2((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(ANDROID_INSTALLER, new LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda3
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.lambda$getComponents$3((Context) obj);
            }
        }));
        String strDetectVersion = KotlinDetector.detectVersion();
        if (strDetectVersion != null) {
            arrayList.add(LibraryVersionComponent.create(KOTLIN, strDetectVersion));
        }
        return arrayList;
    }
}
