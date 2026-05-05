package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.reflect.Field;
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
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf = null;
    private static zzp zzk = null;
    private static zzq zzl = null;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader = null;
    }

    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzo zzoVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzo zzoVar) {
            super(str, th);
        }
    }

    public interface VersionPolicy {

        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z2) throws LoadingException;
        }

        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.lang.String] */
    public static int getLocalVersion(Context context, String str) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 11466);
        short sXd2 = (short) (FB.Xd() ^ 28510);
        String str2 = new int["F\u0016\u0019&@Foj`\u001d0[`c".length()];
        QB qb = new QB("F\u0016\u0019&@Foj`\u001d0[`c");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            str2[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        new String((int[]) str2, 0, i2);
        String strXd = ZO.xd("\u0014\u001cx]\u0019}lq\r\u0006q\u000fP\r,\u0013:>ljB0", (short) (C1580rY.Xd() ^ (-31740)), (short) (C1580rY.Xd() ^ (-14789)));
        String strUd = C1626yg.Ud("B\u0017TcrA\u0005$\u0003\u0017:WE)4%:%%\u0005\u0013[fpK\u0001e .S\u0019?{\b\fN{+<@a\u001e>l", (short) (C1607wl.Xd() ^ 28040), (short) (C1607wl.Xd() ^ 11466));
        try {
            str2 = str;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("S\t/b5\u000bW~}+&PVg{\u0019a&J&`-\u0005", (short) (C1607wl.Xd() ^ 23950))).getMethod(EO.Od("e4\u0013=.[y y\u0019(=\u000f\u000e\\,xz5}9", (short) (OY.Xd() ^ 29028)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                Class<?> cls = Class.forName(C1561oA.Qd("NZO\\XQK\u0014HSQVFNS\f KIN>PK", (short) (ZN.Xd() ^ 16043)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd3 = (short) (C1499aX.Xd() ^ (-12976));
                short sXd4 = (short) (C1499aX.Xd() ^ (-23321));
                int[] iArr = new int["TSc3]SfgAeX\\^l".length()];
                QB qb2 = new QB("TSc3]SfgAeX\\^l");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                    i3++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i3), clsArr);
                try {
                    method2.setAccessible(true);
                    ClassLoader classLoader = (ClassLoader) method2.invoke(context2, objArr2);
                    StringBuilder sb = new StringBuilder(strUd);
                    sb.append((String) str2);
                    sb.append(C1561oA.od("Ig\t|\r\u0003zXx\u0006t\u0003x~\u0002{}", (short) (C1633zX.Xd() ^ (-4594))));
                    Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
                    Field declaredField = clsLoadClass.getDeclaredField(C1561oA.Kd("+.$6.(C.*", (short) (OY.Xd() ^ OlympusCameraSettingsMakernoteDirectory.TagRollAngle)));
                    Field declaredField2 = clsLoadClass.getDeclaredField(Wg.Zd("`!~\rtZmQ#-\u0017y@,", (short) (C1633zX.Xd() ^ (-22450)), (short) (C1633zX.Xd() ^ (-23206))));
                    if (Objects.equal(declaredField.get(null), str2)) {
                        return declaredField2.getInt(null);
                    }
                    String strValueOf = String.valueOf(declaredField.get(null));
                    StringBuilder sb2 = new StringBuilder(strXd);
                    sb2.append(strValueOf);
                    sb2.append(C1561oA.Xd("(\"gmit.|)wl\u0001pv/u\n\u0003xw\n{{8\u0003~;C", (short) (FB.Xd() ^ 26072)));
                    sb2.append((String) str2);
                    sb2.append(Wg.vd("L", (short) (C1580rY.Xd() ^ (-21334))));
                    sb2.toString();
                    return 0;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (ClassNotFoundException unused) {
            String str3 = hg.Vd(":\\OLV\tUVJZPH\u0002EERAOEKNHJv9A5FEp6>@l", (short) (C1580rY.Xd() ^ (-28343)), (short) (C1580rY.Xd() ^ (-30855))) + str2 + C1561oA.ud("5\u0003\u0003\u00071v~\u0004{p9", (short) (C1633zX.Xd() ^ (-22598)));
            return 0;
        } catch (Exception e4) {
            Qg.kd("\u001e8?A97qE?n:<-/i67+;1)b&&3\"0&,/)+W\u001a\"\u0016'&kP", (short) (Od.Xd() ^ (-25436)), (short) (Od.Xd() ^ (-9362))).concat(String.valueOf(e4.getMessage()));
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:268:0x01c0 A[Catch: all -> 0x0682, TryCatch #4 {all -> 0x0682, blocks: (B:250:0x0159, B:252:0x0170, B:254:0x018d, B:256:0x01a1, B:260:0x01b2, B:265:0x01ba, B:268:0x01c0, B:271:0x01ca, B:394:0x0542, B:395:0x0563, B:397:0x0565, B:399:0x0567, B:400:0x0583, B:402:0x0585, B:404:0x05b8, B:406:0x05cc), top: B:450:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x05e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context r22, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r23, java.lang.String r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.load(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x02f4  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.database.Cursor] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:319:0x03c7 -> B:337:0x024c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:320:0x03c9 -> B:337:0x024c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.content.Context r15, java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x02e3: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:279:0x02e3 */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int zzb(android.content.Context r17, java.lang.String r18, boolean r19, boolean r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzq zzqVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
            }
            zzl = zzqVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzm zzmVar = (zzm) zzg.get();
        if (zzmVar == null || zzmVar.zza != null) {
            return false;
        }
        zzmVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) throws Throwable {
        Object obj;
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(zzf)) {
            return true;
        }
        Boolean bool = zzf;
        Jg.Wd("#!\nAAx\bl\u00186^s^\u0014", (short) (ZN.Xd() ^ 25301), (short) (ZN.Xd() ^ 1283));
        boolean zBooleanValue = false;
        if (bool == null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("3s\u001cWX\u0014=\u000bm/5@f\u0016\bB1q8o1\u000f]", (short) (FB.Xd() ^ 28159), (short) (FB.Xd() ^ 13051))).getMethod(C1626yg.Ud("\u0018]!)*[Q\u0001!}MYa\u007fp+f", (short) (C1580rY.Xd() ^ (-32269)), (short) (C1580rY.Xd() ^ (-6005))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                int i2 = true != PlatformVersion.isAtLeastQ() ? 0 : 268435456;
                String strWd = Ig.wd("uZ(F\u0015Pj\u0010V!m|_U9\u0012_ZyI\u0011p~.5Nt\u000fZ[", (short) (Od.Xd() ^ (-16323)));
                short sXd = (short) (C1607wl.Xd() ^ 19661);
                int[] iArr = new int["4w\u00129`\u0010`$|6-[{\t\rmenIU)uUI\"uB'w_; \u000f".length()];
                QB qb = new QB("4w\u00129`\u0010`$|6-[{\t\rmenIU)uUI\"uB'w_; \u000f");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i3));
                Class<?>[] clsArr = {Class.forName(C1561oA.Qd("4*>(s1%1)n\u001330&*\"", (short) (Od.Xd() ^ (-2273)))), Integer.TYPE};
                Object[] objArr2 = {strWd, Integer.valueOf(i2)};
                Method method2 = cls.getMethod(C1593ug.zd("\"\u0016%\" +\u001by''. *1\u000e1/7+')7", (short) (C1633zX.Xd() ^ (-12830)), (short) (C1633zX.Xd() ^ (-3378))), clsArr);
                try {
                    method2.setAccessible(true);
                    ProviderInfo providerInfo = (ProviderInfo) method2.invoke(packageManager, objArr2);
                    if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfo != null) {
                        short sXd2 = (short) (Od.Xd() ^ (-13042));
                        int[] iArr2 = new int["EPM\rELKBF>\u00068D9FB;5}6;@".length()];
                        QB qb2 = new QB("EPM\rELKBF>\u00068D9FB;5}6;@");
                        int i4 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i4] = xuXd2.fK(sXd2 + sXd2 + i4 + xuXd2.CK(iKK2));
                            i4++;
                        }
                        if (new String(iArr2, 0, i4).equals(providerInfo.packageName)) {
                            zBooleanValue = true;
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    zzf = boolValueOf;
                    zBooleanValue = boolValueOf.booleanValue();
                    if (zBooleanValue && providerInfo.applicationInfo != null) {
                        ApplicationInfo applicationInfo = providerInfo.applicationInfo;
                        short sXd3 = (short) (C1499aX.Xd() ^ (-13941));
                        int[] iArr3 = new int["w\u0006|\f\n\u0005\u0001K\u0002\u000f\u000f\u0016\b\u0012\u0019S\u0017\u0015Vj\u001b\u001c\u0019\u0017\u0012\u0011%\u001b\"\"}$\u001d'".length()];
                        QB qb3 = new QB("w\u0006|\f\n\u0005\u0001K\u0002\u000f\u000f\u0016\b\u0012\u0019S\u0017\u0015Vj\u001b\u001c\u0019\u0017\u0012\u0011%\u001b\"\"}$\u001d'");
                        int i5 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd3 + sXd3) + i5));
                            i5++;
                        }
                        String str = new String(iArr3, 0, i5);
                        String strZd = Wg.Zd("Vo7\u0010/", (short) (C1607wl.Xd() ^ 7593), (short) (C1607wl.Xd() ^ 22617));
                        try {
                            Class<?> cls2 = Class.forName(str);
                            Field field = 1 != 0 ? cls2.getField(strZd) : cls2.getDeclaredField(strZd);
                            field.setAccessible(true);
                            obj = field.get(applicationInfo);
                        } catch (Throwable th) {
                            obj = null;
                        }
                        if ((-1) - (((-1) - ((Integer) obj).intValue()) | ((-1) - 129)) == 0) {
                            C1561oA.Xd("\u001577v>E@B4=};@5<;v\u001fFM\u001eKOC~!1-\u000f\u0004KUYKRXR\fC\u001f", (short) (C1499aX.Xd() ^ (-15619)));
                            zzd = true;
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (!zBooleanValue) {
            Wg.vd("#IR>B@<x)PW(MQE\u0001+;7\u0019\u0006YMVagY\u0015Z^QU#)#\\\u001a +\u001a$/))k", (short) (OY.Xd() ^ 11699));
        }
        return zBooleanValue;
    }

    private static zzp zzg(Context context) {
        zzp zzpVar;
        String strKd = Qg.kd("Qkrtlj%xr\"mo`b\u001dE?sgYd_iY?aRTT`\rR]YV\b.SX'RTF\u001a~", (short) (C1607wl.Xd() ^ 6546), (short) (C1607wl.Xd() ^ 31305));
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = zzk;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                Object[] objArr = {hg.Vd("6A>}6=<37/v)5*73,&n',1", (short) (C1633zX.Xd() ^ (-28672)), (short) (C1633zX.Xd() ^ (-4848))), 3};
                Method method = Class.forName(C1561oA.ud("3?4A=60x-86;+38p\u00050.3#50", (short) (C1633zX.Xd() ^ (-29493)))).getMethod(C1561oA.Yd("\n\u001a\u000e\u000b\u001f\u0011|\u000f\u0012\u001b\u0012\u0019\u0018v$$+\u001d1.", (short) (Od.Xd() ^ (-6040))), Class.forName(C1561oA.yd("\u0019\u000f'\u0011X\u0016\u000e\u001a\u001ec\f,%\u001b#\u001b", (short) (C1499aX.Xd() ^ (-7335)))), Integer.TYPE);
                try {
                    method.setAccessible(true);
                    Context context2 = (Context) method.invoke(context, objArr);
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Xg.qd(",:1@>95\u007f6CCJ<FM\b\u001eKKRDXU", (short) (OY.Xd() ^ 19198), (short) (OY.Xd() ^ 29233))).getMethod(Jg.Wd("E5:Ej\u000e\u001dX*\u007fm)$T", (short) (C1580rY.Xd() ^ (-18622)), (short) (C1580rY.Xd() ^ (-14418))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        IBinder iBinder = (IBinder) ((ClassLoader) method2.invoke(context2, objArr2)).loadClass(ZO.xd(")\u007fVmt?4\u000fCfs\u001dWa|T\u0013TL\u0012\n\u001e\u0013zQy\u00032\tpY5\u001ak'Z~7'OjKn\u0019\u0001\u0006u+\u0015QrG\u007f\u0003`\u00119\u0012[", (short) (OY.Xd() ^ 23240), (short) (OY.Xd() ^ 8512))).newInstance();
                        if (iBinder == null) {
                            zzpVar = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(C1626yg.Ud("0\u000e\\]R\f;g\u0014:(]\u0018>\u001c\u001bn\u0018*r^/_yb Q*>R7\u0001*$?N\u000bO\u001c{F4@B\u0019c9", (short) (OY.Xd() ^ 2366), (short) (OY.Xd() ^ 14263)));
                            zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder);
                        }
                        if (zzpVar != null) {
                            zzk = zzpVar;
                            return zzpVar;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                Ig.wd("?/P`2q^%R\u0016\u000b<\u0005q", (short) (FB.Xd() ^ 31585));
                String str = strKd + e4.getMessage();
            }
            return null;
        }
    }

    public Context getModuleContext() {
        return this.zzj;
    }

    public IBinder instantiate(String str) throws LoadingException {
        try {
            Context context = this.zzj;
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("{1U\u000b\u000ff5^c\u0003{$`wiD\u0017Y\u0010.^)?", (short) (OY.Xd() ^ 22584))).getMethod(C1561oA.Qd("\u0002~\rZ\u0003v\b\u0007^\u0001qss\u007f", (short) (C1607wl.Xd() ^ 9476)), new Class[0]);
            try {
                method.setAccessible(true);
                return (IBinder) ((ClassLoader) method.invoke(context, objArr)).loadClass(str).newInstance();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e3) {
            String strValueOf = String.valueOf(str);
            short sXd = (short) (Od.Xd() ^ (-2058));
            short sXd2 = (short) (Od.Xd() ^ (-3827));
            int[] iArr = new int["Vr{\u007fyy6\f\b9\u0004\n\u0010\u0012\u007f\u000e\u0015\u000b\u0004\u0018\nE\u0014\u0017\r\u001f\u0017\u0011L\u0011\u001b\u0011$%lS".length()];
            QB qb = new QB("Vr{\u007fyy6\f\b9\u0004\n\u0010\u0012\u007f\u000e\u0015\u000b\u0004\u0018\nE\u0014\u0017\r\u001f\u0017\u0011L\u0011\u001b\u0011$%lS");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            throw new LoadingException(new String(iArr, 0, i2).concat(strValueOf), e3, null);
        }
    }
}
