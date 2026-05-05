package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ConfigurationCompat;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
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
public final class zac {
    private static final SimpleArrayMap zaa = new SimpleArrayMap();
    private static Locale zab = null;

    public static String zaa(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("w\u000bJ\u0006G\u001b\u000e\u0003?\u0011\b&Z&_*\u0018N\u0001?F}m", (short) (C1607wl.Xd() ^ 13715), (short) (C1607wl.Xd() ^ 25256))).getMethod(C1626yg.Ud(":)\u001c\bAk8^yx\u001cZ\u0015g", (short) (Od.Xd() ^ (-6216)), (short) (Od.Xd() ^ (-20414))), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(context, objArr);
            try {
                return Wrappers.packageManager(context).getApplicationLabel(str).toString();
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Ig.wd("2\u0012cLV\u001bD\f\u001ehoQ\u0013\u0018\u0010\"\u0002\u0016zKy.V", (short) (C1607wl.Xd() ^ 756))).getMethod(EO.Od("\u001ejItu\"@g@P_tED)r7,", (short) (C1499aX.Xd() ^ (-15552))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str2 = ((ApplicationInfo) method2.invoke(context, objArr2)).name;
                    return TextUtils.isEmpty(str2) ? str : str2;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static String zab(Context context, int i2) {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0012\u0017\u0007\u0019\u0014", (short) (C1499aX.Xd() ^ (-14481)))).getMethod(C1593ug.zd("\u0001\u007f\u0010n\u0003\u0012\u000f\u0016\u0014\u0006\t\u0018", (short) (C1607wl.Xd() ^ 591), (short) (C1607wl.Xd() ^ 1518)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? resources.getString(R.string.ok) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String zac(Context context, int i2) {
        Class<?> cls = Class.forName(C1561oA.od("\u0003\u000f\u0004\u0011\r\u0006\u007fH|\b\u0006\u000bz\u0003\b@T\u007f}\u0003r\u0005\u007f", (short) (C1499aX.Xd() ^ (-6334))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 8943);
        int[] iArr = new int["YXhG[jgnl^ap".length()];
        QB qb = new QB("YXhG[jgnl^ap");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            String strZaa = zaa(context);
            if (i2 == 1) {
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, strZaa);
            }
            if (i2 == 2) {
                return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, strZaa);
            }
            if (i2 == 3) {
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, strZaa);
            }
            if (i2 == 5) {
                return zag(context, hg.Vd("\u001a%\"!\" \u0010\u0017\u001e\u001d\u0014\u0018\u0010\t\u0019\u0014\b\u001f\u0004\u0017\b\u0014\u0017\t\u0002\u0003\u0010z\u0004\b\u000fx\u0003~xrsts~\u0004{\u0001j~n\u0001{", (short) (Od.Xd() ^ (-10955)), (short) (Od.Xd() ^ (-31773))), strZaa);
            }
            if (i2 != 7) {
                if (i2 == 9) {
                    return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, strZaa);
                }
                if (i2 == 20) {
                    return zag(context, Wg.vd("itutywkrmlgkg`tow\u000fw\u000b\u007f\f\u0013\u0005qr\u0004n\u0005v\b\bXNK[OMK[PLFHNFCW[ml", (short) (FB.Xd() ^ 7717)), strZaa);
                }
                switch (i2) {
                    case 16:
                        return zag(context, C1561oA.Xd(":GFGJJ<ENOHNHCURHaH]P^cWRUdQTd^UlfZp\\ei_alfawi}z", (short) (C1607wl.Xd() ^ 14167)), strZaa);
                    case 17:
                        return zag(context, Wg.Zd("7sE(\u0006U*\u0006hH\u0011yM\u0017\f\\-$]R |c*\u0001bD\u0013\u0003E'\u0001M7\u0011eG\u0012\u000ba6\u0014b\\)\fj", (short) (C1499aX.Xd() ^ (-5208)), (short) (C1499aX.Xd() ^ (-30967))), strZaa);
                    case 18:
                        return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, strZaa);
                    default:
                        return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, strZaa);
                }
            }
            short sXd2 = (short) (C1580rY.Xd() ^ (-17659));
            short sXd3 = (short) (C1580rY.Xd() ^ (-732));
            int[] iArr2 = new int["OZWVWUELSRIME>NI=T9L=IL>78E0>4BD;=5(-9846\"6&83".length()];
            QB qb2 = new QB("OZWVWUELSRIME>NI=T9L=IL>78E0>4BD;=5(-9846\"6&83");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(((sXd2 + i4) + xuXd2.CK(iKK2)) - sXd3);
                i4++;
            }
            return zag(context, new String(iArr2, 0, i4), strZaa);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String zad(Context context, int i2) {
        return (i2 == 6 || i2 == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i2);
    }

    public static String zae(Context context, int i2) {
        String strZah = i2 == 6 ? zah(context, C1561oA.ud("T_\\[\\ZJQXWNRJCSNBY>QBNQC<=J5G9FA=EC7<:*<.9</7)'!5)3*\"", (short) (C1499aX.Xd() ^ (-20915)))) : zaf(context, i2);
        if (strZah != null) {
            return strZah;
        }
        Class<?> cls = Class.forName(C1561oA.yd("\u000f\u001d\u0010\u001f!\u001c\u0014^\t\u0016\u0012\u0019\u000f\u0019\u001cV`\u000e\n\u0011\u0007\u001b\u0014", (short) (ZN.Xd() ^ 6058)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-14951));
        int[] iArr = new int[":9I(<KHOM?BQ".length()];
        QB qb = new QB(":9I(<KHOM?BQ");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String zaf(Context context, int i2) {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("KYP_]XT\u001fUbbi[el'=jjqcwt", (short) (FB.Xd() ^ 17432), (short) (FB.Xd() ^ 12197))).getMethod(Jg.Wd("2O\u0002z1JI\u000b\u000bGh\u0012", (short) (C1499aX.Xd() ^ (-19944)), (short) (C1499aX.Xd() ^ (-9974))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            short sXd = (short) (C1633zX.Xd() ^ (-13754));
            short sXd2 = (short) (C1633zX.Xd() ^ (-11859));
            int[] iArr = new int["xLx\b\u0018Mg%z,$E\u001c\u0015s<$p?\u0007\u0006".length()];
            QB qb = new QB("xLx\b\u0018Mg%z,$E\u001c\u0015s<$p?\u0007\u0006");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                i3++;
            }
            new String(iArr, 0, i3);
            switch (i2) {
                case 1:
                    return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
                case 2:
                    return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
                case 3:
                    return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
                case 4:
                case 6:
                case 18:
                    return null;
                case 5:
                    C1561oA.ud("W\u00044|\u0001\bq{wq,lmlw|ty$zct rnb_d`b][\u0016l\\X`\u0011S^\\[QN^RVN\u0014\u00054OGBSD}MNJPB<<u6sI3=93m./.9>6;s", (short) (ZN.Xd() ^ 1156));
                    short sXd3 = (short) (ZN.Xd() ^ 26974);
                    int[] iArr2 = new int["BOJKJJ8AFG<B83A>PiLaP^_SJMXELRWC+)!\u001d\u001c\u001f\u001c),&)\u0015'\u001d%\u001e4".length()];
                    QB qb2 = new QB("BOJKJJ8AFG<B83A>PiLaP^_SJMXELRWC+)!\u001d\u001c\u001f\u001c),&)\u0015'\u001d%\u001e4");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i4));
                        i4++;
                    }
                    return zah(context, new String(iArr2, 0, i4));
                case 7:
                    Qg.kd("\u001f5CE<>6i.:957c2%$510\" hY\t$\u001c\u0017(\u0019R$\u0016$!'L\u001e\u0010\u001b\u001e\r\u001a\u001aD\u0010\u0004\u0016\u0006\u0012L", (short) (ZN.Xd() ^ 32738), (short) (ZN.Xd() ^ 15505));
                    return zah(context, hg.Vd("0;8786&-43*.&\u001f/*\u001e5\u001a-\u001e*-\u001f\u0018\u0019&\u0011\u001f\u0015#%\u001c\u001e\u0016\t\u000e\u001a\u0019\u0015\u0017\u0003\u0017\u000b\u0015\f\u0004", (short) (FB.Xd() ^ 14357), (short) (FB.Xd() ^ 30978)));
                case 8:
                    Wg.vd("m\u0014\u0017\t\u0013\u0010\u007f\f<\u0003\r\u000e\b\f6\u0007\u0018\u0019(&#\u0017\u0013]L}\u0017\u0011\n\u001d\fGwjg#lper\u001ccim\u0018][ku~~xt1w}r||xi}ovR", (short) (ZN.Xd() ^ 23137));
                    return null;
                case 9:
                    C1561oA.Xd("Nwxqwq-^{q\u000b2\u0007y\b\r\u0001{~\u000e;\u0006\u0011>\t\u000f\u0018\u0004\u0010\u000e\nTGk\u000b\u0019\u001a\u001c\"N\"\u0016\u0015\"*\u001a(d", (short) (C1633zX.Xd() ^ (-22166)));
                    return null;
                case 10:
                    Wg.Zd("ZL\fI?\u0011D\b\u0004\u007fsO>\n;7w<jK7\u0004't-mN;#m.l\u0016:Z)Ro#id_R,\u001e\u001a\r^\\\u001aP\"\bUAYM\u0016M!\u000bM\rPE\u0015", (short) (OY.Xd() ^ 18560), (short) (OY.Xd() ^ 1152));
                    return null;
                case 11:
                    C1561oA.Kd("cxv2t\u0005\u0006\u0003\u0001{z\u000f\u0005\f\f>\t\u0014A\u0011\u0013\u0019E\u0013\u0011\f\u000f\u0019\u001f\u0012\u0012N$ Q'\u001c\u001aU,+\u001e,h", (short) (C1607wl.Xd() ^ 8761));
                    return null;
                case 12:
                case 13:
                case 14:
                case 15:
                case 19:
                default:
                    String str = C1626yg.Ud("*\u007f0\u0011\u001doHJ\n\u0011X\u0014`u}K4%]\u001d\"+", (short) (OY.Xd() ^ 8143), (short) (OY.Xd() ^ 11566)) + i2;
                    return null;
                case 16:
                    C1561oA.od(",J@yH>vJ=9r\u0013!\u0019n1<9;97-5:8c<16_ 21!(*-\u001d\u001bU)#R\u0015 \u001e\u001d\u0013\u0010 J\u001e\u0018G\u0010\u0019D\u0012\u0012\u0016@\u0001\u0015~\u0006\b{{\u0005|D", (short) (OY.Xd() ^ 31234));
                    return null;
                case 17:
                    short sXd4 = (short) (C1580rY.Xd() ^ (-24346));
                    int[] iArr3 = new int["y\r\tB\u0015\u0011\u0005\u0002\u0007\u0003\u0005\u007f}8xyx\u0004\t\u0001\u00060r}\u0003xo*ww{&gi#ujgmca\u001cdh'".length()];
                    QB qb3 = new QB("y\r\tB\u0015\u0011\u0005\u0002\u0007\u0003\u0005\u007f}8xyx\u0004\t\u0001\u00060r}\u0003xo*ww{&gi#ujgmca\u001cdh'");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i5 + xuXd3.CK(iKK3));
                        i5++;
                    }
                    new String(iArr3, 0, i5);
                    return zah(context, C1593ug.zd("x\u0006\u0005\u0006\t\tz\u0004\r\u000e\u0007\r\u0007\u0002\u0014\u0011\u0007 \u0007\u001c\u000f\u001d\"\u0016\u0011\u0014#\u0010%\u001c\u001b#\u0015 &\u0018 \u001c%)##\u001f5+70*", (short) (C1607wl.Xd() ^ 14980), (short) (C1607wl.Xd() ^ 32095)));
                case 20:
                    Ig.wd("<!,\n=rWOc (qxln\u0005\n@\n+c2WP y%%u\u001aPz\\9\u001cfE\u001c:\u0006\u000bhY+Hb\u0003+X\u000b\u0013c7\u0014o%e\u0001b[C\u001en\u00150t/l\u0002\u0007jGb\u0011LY\u0005\u0014</", (short) (FB.Xd() ^ 15858));
                    return zah(context, EO.Od("(\fW3m\u00123Z\u001a\n\u0004fK;Pe(:wGpQ{jk&Q\u000b@@~\u001b1AuP`\u007f\u007f\u001f!5_tufu:!\t\u0011f", (short) (OY.Xd() ^ 16802)));
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String zag(Context context, String str, String str2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("1?6EC>:\u0005;HHOAKR\r#PPWI]Z", (short) (ZN.Xd() ^ 21093))).getMethod(Xg.qd("\u001a\u0019)\b\u001c+(/-\u001f\"1", (short) (ZN.Xd() ^ 10932), (short) (ZN.Xd() ^ 12010)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            String strZah = zah(context, str);
            if (strZah == null) {
                strZah = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
            }
            return String.format(resources.getConfiguration().locale, strZah, str2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String zah(Context context, String str) {
        short sXd = (short) (FB.Xd() ^ 16305);
        short sXd2 = (short) (FB.Xd() ^ 14721);
        int[] iArr = new int["k,ZbH1Yua'Zk`w\"}\u0012nil".length()];
        QB qb = new QB("k,ZbH1Yua'Zk`w\"}\u0012nil");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        String strXd = ZO.xd("!W\u0013(\u0013luc,BEpVMf\u0011&U", (short) (C1633zX.Xd() ^ (-4436)), (short) (C1633zX.Xd() ^ (-31235)));
        SimpleArrayMap simpleArrayMap = zaa;
        synchronized (simpleArrayMap) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("\tb\u001f\n\u000e.\u000fEJP'\u0011Ke9\u0007\u001egm\u000fM\u001bP", (short) (C1499aX.Xd() ^ (-27037)), (short) (C1499aX.Xd() ^ (-5003)))).getMethod(Ig.wd("~.yt\u0007pF\u001adf\u0011v", (short) (ZN.Xd() ^ 7846)), new Class[0]);
            try {
                method.setAccessible(true);
                Locale locale = ConfigurationCompat.getLocales(((Resources) method.invoke(context, objArr)).getConfiguration()).get(0);
                if (!locale.equals(zab)) {
                    simpleArrayMap.clear();
                    zab = locale;
                }
                String str3 = (String) simpleArrayMap.get(str);
                if (str3 != null) {
                    return str3;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, EO.Od("=w\u0018*g\u0016", (short) (FB.Xd() ^ 3684)), C1561oA.Qd("s~{;szyptl4frgtpic,din", (short) (C1607wl.Xd() ^ 17954)));
                if (identifier == 0) {
                    C1593ug.zd("\r67060\r=7\u0010F2;?57?CAMS", (short) (C1499aX.Xd() ^ (-9683)), (short) (C1499aX.Xd() ^ (-24480)));
                    String str4 = strXd + str;
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    simpleArrayMap.put(str, string);
                    return string;
                }
                C1561oA.od("\u001bBA8<4\u000f=5\f@*13''-/+59", (short) (ZN.Xd() ^ 749));
                String str5 = str2 + str;
                return null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
