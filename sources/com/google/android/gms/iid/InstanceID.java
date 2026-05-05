package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import androidx.webkit.ProxyConfig;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
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
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class InstanceID {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_MISSING_INSTANCEID_SERVICE = "MISSING_INSTANCEID_SERVICE";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String ERROR_TIMEOUT = "TIMEOUT";
    private static final zzaj<Boolean> zzbu = zzai.zzy().zzd("gcm_check_for_different_iid_in_token", true);
    private static Map<String, InstanceID> zzbv = new ArrayMap();
    private static final long zzbw = TimeUnit.DAYS.toMillis(7);
    private static zzak zzbx = null;
    private static zzaf zzby = null;
    private static String zzbz = null;
    private String zzca;
    private Context zzl;

    private InstanceID(Context context, String str) throws Throwable {
        this.zzca = "";
        Class<?> cls = Class.forName(Jg.Wd("`\u0007!:kq\u0012cPt{+0dnT~Ciw!=]", (short) (C1580rY.Xd() ^ (-20314)), (short) (C1580rY.Xd() ^ (-10141))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-2296));
        short sXd2 = (short) (Od.Xd() ^ (-26190));
        int[] iArr = new int["\r^;s\u0001+\rv?\u0005\u001ap,)ww^\\c\u001da".length()];
        QB qb = new QB("\r^;s\u0001+\rv?\u0005\u001ap,)ww^\\c\u001da");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this.zzl = (Context) method.invoke(context, objArr);
            this.zzca = str;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Deprecated
    public static InstanceID getInstance(Context context) {
        return getInstance(context, null);
    }

    public static synchronized InstanceID getInstance(Context context, Bundle bundle) {
        InstanceID instanceID;
        String string = bundle == null ? "" : bundle.getString(C1626yg.Ud("[\u0006RNc\u0004L", (short) (C1607wl.Xd() ^ 5594), (short) (C1607wl.Xd() ^ 24502)));
        if (string == null) {
            string = "";
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("\u0004?c\u0012\u000fK*TNvw a`.J\u001aT{y/vT", (short) (OY.Xd() ^ 20346))).getMethod(EO.Od("`4G2<`>&Rr\\7\r}bt91i\u0005D", (short) (ZN.Xd() ^ 32075)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            if (zzbx == null) {
                short sXd = (short) (C1499aX.Xd() ^ (-27895));
                int[] iArr = new int["RvzzfrfgJD".length()];
                QB qb = new QB("RvzzfrfgJD");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                new String(iArr, 0, i2);
                Class<?> cls = Class.forName(C1593ug.zd("x\u0007}\r\u000b\u0006\u0002L\u0003\u0010\u0010\u0017\t\u0013\u001aTj\u0018\u0018\u001f\u0011%\"", (short) (FB.Xd() ^ 6846), (short) (FB.Xd() ^ 14168)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd2 = (short) (Od.Xd() ^ (-1862));
                int[] iArr2 = new int["RO]8HIPEJG/ALC".length()];
                QB qb2 = new QB("RO]8HIPEJG/ALC");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context2, objArr2);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 73);
                    short sXd3 = (short) (ZN.Xd() ^ 19403);
                    int[] iArr3 = new int["\u0018>DF4B8;v!\u001dy. (}HS\u0001FHTWKJI]OO\u0018\r".length()];
                    QB qb3 = new QB("\u0018>DF4B8;v!\u001dy. (}HS\u0001FHTWKJI]OO\u0018\r");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd3 + sXd3) + i4));
                        i4++;
                    }
                    sb.append(new String(iArr3, 0, i4)).append(str).append(Wg.Zd("z]\\pA<EK%3kr\u0015L\u0011r8tS\u001a\u001a_J\u007f\u0010IX\\97zt 0}t\tLV\u0018\u0014\u0013", (short) (ZN.Xd() ^ 28529), (short) (ZN.Xd() ^ AuthApiStatusCodes.AUTH_API_CLIENT_ERROR))).toString();
                    zzbx = new zzak(context2);
                    zzby = new zzaf(context2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            zzbz = Integer.toString(zzg(context2));
            instanceID = zzbv.get(string);
            if (instanceID == null) {
                instanceID = new InstanceID(context2, string);
                zzbv.put(string, instanceID);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
        return instanceID;
    }

    private final KeyPair getKeyPair() {
        return zzbx.zzj(this.zzca).getKeyPair();
    }

    static String zzd(KeyPair keyPair) throws Throwable {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(C1561oA.Xd("\u000f\u0005~o", (short) (ZN.Xd() ^ 32712))).digest(keyPair.getPublic().getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & Ascii.SI) + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            short sXd = (short) (C1580rY.Xd() ^ (-27607));
            int[] iArr = new int["\u0018$\u0019&\"\u001b\u0015]42&(h{\u001a+\f[X".length()];
            QB qb = new QB("\u0018$\u0019&\"\u001b\u0015]42&(h{\u001a+\f[X");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {bArrDigest, 0, 8, 11};
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Qg.kd("08,7++\u00193\u001663)-%", (short) (Od.Xd() ^ (-9317)), (short) (Od.Xd() ^ (-10123))), byte[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (NoSuchAlgorithmException unused) {
            hg.Vd("\u007f$((\u0014 \u0014\u0015wq", (short) (OY.Xd() ^ 12611), (short) (OY.Xd() ^ 1891));
            C1561oA.ud("'?5G>2/?/-g,8735m`$$4&\u001f Y&!*)\u001e\"\u001aQ#\u0015 #\u0016\u001e\u0010\u000eH\t\u0013\r\u0014\u0016\f\u0016\t\r\u0012", (short) (ZN.Xd() ^ 6289));
            return null;
        }
    }

    static int zzg(Context context) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("\u0013!\u0014#\u001d\u0018\u0010Z\r\u001a\u0016\u001d\u000b\u0015\u0018Rd\u0012\u000e\u0015\u0003\u0017\u0010", (short) (ZN.Xd() ^ 6062))).getMethod(C1561oA.Yd("\f\u000b\u001bw\n\r\u0016\r\u0014\u0013{\u0011\u001f\u0013\u001a\u0019'", (short) (C1633zX.Xd() ^ (-912))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                short sXd = (short) (C1607wl.Xd() ^ 7515);
                short sXd2 = (short) (C1607wl.Xd() ^ 25438);
                int[] iArr = new int["\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB".length()];
                QB qb = new QB("\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                    i2++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("Ixx\u0006g\u001b\u0018\u001f6%?Gdm", (short) (C1607wl.Xd() ^ 25642), (short) (C1607wl.Xd() ^ 2718)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    short sXd3 = (short) (C1580rY.Xd() ^ (-29294));
                    short sXd4 = (short) (C1580rY.Xd() ^ (-8615));
                    int[] iArr2 = new int["#.\u0013!ar!D\u0017R9\u0006\bT5\\)x`\tcILpk\u0017\u001bt?|E\t)".length()];
                    QB qb2 = new QB("#.\u0013!ar!D\u0017R9\u0006\bT5\\)x`\tcILpk\u0017\u001bt?|E\t)");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                        i3++;
                    }
                    Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1626yg.Ud("F4\u00067_.T'&Xfk\u007fe:&", (short) (C1499aX.Xd() ^ (-28144)), (short) (C1499aX.Xd() ^ (-3181))));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    Method method3 = cls.getMethod(Ig.wd("_\u0012MR!N|\u0018WG#4]b", (short) (FB.Xd() ^ 25198)), clsArr);
                    try {
                        method3.setAccessible(true);
                        return ((PackageInfo) method3.invoke(packageManager, objArr3)).versionCode;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            String strValueOf = String.valueOf(e5);
            new StringBuilder(String.valueOf(strValueOf).length() + 38).append(EO.Od("^&[k*\r+&X\u0016\u00034h3'\u0012Ef9\u0001n\u0010ju>W\fl/U{S7$9\b`x", (short) (C1499aX.Xd() ^ (-22277)))).append(strValueOf).toString();
            C1561oA.Qd("/SWWCOCD'!", (short) (C1607wl.Xd() ^ 469));
            return 0;
        }
    }

    static String zzh(Context context) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-10269));
        short sXd2 = (short) (C1580rY.Xd() ^ (-24755));
        int[] iArr = new int["s\u0002x\b\u0006\u0001|G}\u000b\u000b\u0012\u0004\u000e\u0015Oe\u0013\u0013\u001a\f \u001d".length()];
        QB qb = new QB("s\u0002x\b\u0006\u0001|G}\u000b\u000b\u0012\u0004\u000e\u0015Oe\u0013\u0013\u001a\f \u001d");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd3 = (short) (C1607wl.Xd() ^ 686);
            int[] iArr2 = new int["96D\u001f/07,1.\u0015(4&+(4".length()];
            QB qb2 = new QB("96D\u001f/07,1.\u0015(4&+(4");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Kd(";I@OMHD\u000fERRYKU\\\u0017-ZZaSgd", (short) (C1633zX.Xd() ^ (-5938)))).getMethod(Wg.Zd("\u0011\u001d\u00142!\nU9&g/\bw^", (short) (C1633zX.Xd() ^ (-30342)), (short) (C1633zX.Xd() ^ (-7023))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    Class<?> cls2 = Class.forName(C1561oA.Xd("|\u000b\u0002\u0011\u000f\n\u0006P\u0007\u0014\u0014\u001b\r\u0017\u001eX\u001c\u001a[~\u0011\u0014\u001d\u0014\u001b\u001a\u0003\u0018&\u001a! .", (short) (C1607wl.Xd() ^ 26357)));
                    Class<?>[] clsArr2 = new Class[2];
                    short sXd4 = (short) (Od.Xd() ^ (-3119));
                    int[] iArr3 = new int["\u0016\f \n]\u001b\u000f\u001b\u000bPt\u0015\u001a\u0010\u0014\f".length()];
                    QB qb3 = new QB("\u0016\f \n]\u001b\u000f\u001b\u000bPt\u0015\u001a\u0010\u0014\f");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((sXd4 ^ i4) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    clsArr2[0] = Class.forName(new String(iArr3, 0, i4));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    Method method3 = cls2.getMethod(Qg.kd("YVd?OPWLQN1ULT", (short) (ZN.Xd() ^ 32403), (short) (ZN.Xd() ^ 24547)), clsArr2);
                    try {
                        method3.setAccessible(true);
                        return ((PackageInfo) method3.invoke(packageManager, objArr3)).versionName;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            String strValueOf = String.valueOf(e5);
            new StringBuilder(String.valueOf(strValueOf).length() + 38).append(hg.Vd("Wm}kw$kcqpdlp6\u001b]Zf\u001ej\u0015Z\\`U\u0010^e[\f[KLSHMJ\u0004", (short) (OY.Xd() ^ 14894), (short) (OY.Xd() ^ 27925))).append(strValueOf).toString();
            C1561oA.ud("RvzzfrfgJD", (short) (FB.Xd() ^ 29066));
            return null;
        }
    }

    public static zzak zzp() {
        return zzbx;
    }

    @Deprecated
    public void deleteInstanceID() throws Throwable {
        zzd(ProxyConfig.MATCH_ALL_SCHEMES, ProxyConfig.MATCH_ALL_SCHEMES, null);
        zzo();
    }

    @Deprecated
    public void deleteToken(String str, String str2) throws Throwable {
        zzd(str, str2, null);
    }

    @Deprecated
    public long getCreationTime() {
        return zzbx.zzj(this.zzca).getCreationTime();
    }

    @Deprecated
    public String getId() {
        return zzd(getKeyPair());
    }

    public String getSubtype() {
        return this.zzca;
    }

    @Deprecated
    public String getToken(String str, String str2) throws IOException {
        return getToken(str, str2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0063  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getToken(java.lang.String r13, java.lang.String r14, android.os.Bundle r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.InstanceID.getToken(java.lang.String, java.lang.String, android.os.Bundle):java.lang.String");
    }

    public final void zzd(String str, String str2, Bundle bundle) throws Throwable {
        short sXd = (short) (OY.Xd() ^ 8216);
        int[] iArr = new int["$hP:o-P\u0019,\u007f@81#8\u000b{".length()];
        QB qb = new QB("$hP:o-P\u0019,\u007f@81#8\u000b{");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(EO.Od("&R\u0006\u0001f3\u001eNDB[x4", (short) (OY.Xd() ^ 24283)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (((Looper) declaredMethod.invoke(null, objArr)) == Looper.myLooper()) {
                short sXd2 = (short) (Od.Xd() ^ (-31638));
                short sXd3 = (short) (Od.Xd() ^ (-9663));
                int[] iArr2 = new int["</6:J>1:,')".length()];
                QB qb2 = new QB("</6:J>1:,')");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                    i3++;
                }
                throw new IOException(new String(iArr2, 0, i3));
            }
            zzbx.zzh(this.zzca, str, str2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString(C1561oA.Qd("N?G<<H", (short) (C1633zX.Xd() ^ (-5323))), str);
            if (str2 != null) {
                bundle.putString(C1593ug.zd("ufsuk", (short) (C1499aX.Xd() ^ (-18682)), (short) (C1499aX.Xd() ^ (-11316))), str2);
            }
            bundle.putString(C1561oA.od("HI5E4B8>A5:8", (short) (FB.Xd() ^ 7391)), str);
            String strKd = C1561oA.Kd("{}\u0006\u007f\u0010\u0002", (short) (C1607wl.Xd() ^ 1223));
            String strZd = Wg.Zd("H", (short) (C1580rY.Xd() ^ (-5628)), (short) (C1580rY.Xd() ^ (-25689)));
            bundle.putString(strKd, strZd);
            short sXd4 = (short) (C1607wl.Xd() ^ 9923);
            int[] iArr3 = new int["\\2jltn~p".length()];
            QB qb3 = new QB("\\2jltn~p");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i4));
                i4++;
            }
            bundle.putString(new String(iArr3, 0, i4), strZd);
            bundle.putString(Wg.vd("MP:MOG9", (short) (C1580rY.Xd() ^ (-17952))), "".equals(this.zzca) ? str : this.zzca);
            if (!"".equals(this.zzca)) {
                str = this.zzca;
            }
            bundle.putString(Qg.kd("\u007fS\u0019\u001a\u0006\u0017\u001b\u0011\u0005", (short) (ZN.Xd() ^ 21708), (short) (ZN.Xd() ^ 18357)), str);
            zzaf.zzi(zzby.zzd(bundle, getKeyPair()));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final String zze(String str, String str2, Bundle bundle) throws IOException {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.zzca) ? str : this.zzca;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        String strZzi = zzaf.zzi(zzby.zzd(bundle, getKeyPair()));
        if (!"RST".equals(strZzi) && !strZzi.startsWith("RST|")) {
            return strZzi;
        }
        InstanceIDListenerService.zzd(this.zzl, zzbx);
        throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
    }

    final void zzo() {
        zzbx.zzk(this.zzca);
    }
}
