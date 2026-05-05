package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import com.drew.metadata.exif.makernotes.CasioType2MakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
final class zzvu {
    private static final Pattern zza = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final Context zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzwd zzf;

    public zzvu(Context context, String str, String str2, String str3, long j2, long j3, zzwd zzwdVar) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = str2;
        Matcher matcher = zza.matcher(str);
        this.zze = matcher.matches() ? matcher.group(1) : null;
        this.zzf = zzwdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r10v34, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v83, types: [com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzum] */
    /* JADX WARN: Type inference failed for: r1v86, types: [com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzum] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvs] */
    final zzvv zza(HttpURLConnection httpURLConnection, String str, String str2, Map map, String str3, Map map2, Date date, String str4, String str5, zzum zzumVar) throws Throwable {
        InputStream errorStream;
        zzvv zzvvVarZzc;
        JSONObject jSONObject;
        Context context;
        Object[] objArr;
        Method method;
        short sXd = (short) (C1607wl.Xd() ^ 9076);
        short sXd2 = (short) (C1607wl.Xd() ^ 27093);
        int[] iArr = new int["=OVW[K\u0005GRPGIF\u0018|@DM<GED:7G75".length()];
        QB qb = new QB("=OVW[K\u0005GRPGIF\u0018|@DM<GED:7G75");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        new String(iArr, 0, i2);
        C1561oA.ud("9KRSWG\u0001CNLCEB\u0014x<@I8CA@63C7;3xwv", (short) (FB.Xd() ^ 25394));
        String strYd = C1561oA.yd("~|~\u001c\"~\u0015\u001c\u0019\u001d\u0011m\u0015\u0013\u000e\u0010)\u0007)7!%", (short) (Od.Xd() ^ (-6888)));
        String strYd2 = C1561oA.Yd("f\u0014\u001b\u0013\fH\u0018\u001a L\u0015\u0014$P\u0018\u001c\"\u001c\u001b)(+#)0\\& 3)a)37e7),5,32\bn", (short) (C1499aX.Xd() ^ (-27406)));
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout((int) TimeUnit.SECONDS.toMillis(5L));
        httpURLConnection.setReadTimeout((int) TimeUnit.SECONDS.toMillis(5L));
        String strBytesToStringUppercase = null;
        httpURLConnection.setRequestProperty(Xg.qd("n\rTv\u0019\u0019\u0011Yz\u0010$\u0014\u001a", (short) (OY.Xd() ^ 26559), (short) (OY.Xd() ^ 2169)), null);
        httpURLConnection.setRequestProperty(Jg.Wd("\u0012f\u0002)*\"j\u007f.'k\r(<", (short) (FB.Xd() ^ 12043), (short) (FB.Xd() ^ 30467)), this.zzd);
        Context context2 = this.zzb;
        String strXd = ZO.xd("_W[TYS|\u0011le\u0007A\t1\u001b.\u0017", (short) (C1607wl.Xd() ^ 29804), (short) (C1607wl.Xd() ^ 31611));
        Object[] objArr2 = new Object[0];
        Method method2 = Class.forName(C1626yg.Ud("A\u001d\u0014BMk\u0013\n\u00194(T\u0010x-5~Q6G\fH\u0019", (short) (C1580rY.Xd() ^ (-21407)), (short) (C1580rY.Xd() ^ (-28839)))).getMethod(Ig.wd("\tP/q\u0001EosN\u0013wnG?", (short) (Od.Xd() ^ (-4482))), new Class[0]);
        try {
            method2.setAccessible(true);
            httpURLConnection.setRequestProperty(strXd, (String) method2.invoke(context2, objArr2));
            try {
                Context context3 = this.zzb;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(EO.Od(")\u0007J9e\u001c+-\u0011\u0012\u000br\u000e%7S\u0005/\u0007Ds_u", (short) (FB.Xd() ^ 30427))).getMethod(C1561oA.Qd("*'5\u0010 !(\u001d\"\u001f\u0007\u0019$\u001b", (short) (C1607wl.Xd() ^ 30795)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context3, (String) method3.invoke(context3, objArr3));
                    if (packageCertificateHashBytes == null) {
                        Context context4 = this.zzb;
                        short sXd3 = (short) (OY.Xd() ^ 7457);
                        short sXd4 = (short) (OY.Xd() ^ 11011);
                        int[] iArr2 = new int["\n\u0018\u000f\u001e\u001c\u0017\u0013]\u0014!!(\u001a$+e{))0\"63".length()];
                        QB qb2 = new QB("\n\u0018\u000f\u001e\u001c\u0017\u0013]\u0014!!(\u001a$+e{))0\"63");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                            i3++;
                        }
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.od("YVd?OPWLQN6HSJ", (short) (FB.Xd() ^ 18697)), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            String str6 = strYd2 + ((String) method4.invoke(context4, objArr4));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } else {
                        strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (PackageManager.NameNotFoundException e4) {
                Context context5 = this.zzb;
                Object[] objArr5 = new Object[0];
                Method method5 = Class.forName(C1561oA.Kd("_mdsqlh3ivv}oy\u0001;Q~~\u0006w\f\t", (short) (Od.Xd() ^ (-18708)))).getMethod(Wg.Zd("?;F \u001d\u001d!\u0005\u0007\u0003Whp\u0018", (short) (C1580rY.Xd() ^ (-10207)), (short) (C1580rY.Xd() ^ (-13660))), new Class[0]);
                try {
                    method5.setAccessible(true);
                    String strValueOf = String.valueOf((String) method5.invoke(context5, objArr5));
                    short sXd5 = (short) (FB.Xd() ^ 13335);
                    int[] iArr3 = new int["*L}RUDJ\u0003TFIRIPO%\f".length()];
                    QB qb3 = new QB("*L}RUDJ\u0003TFIRIPO%\f");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd5 + i4));
                        i4++;
                    }
                    new String(iArr3, 0, i4).concat(strValueOf);
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            }
            short sXd6 = (short) (ZN.Xd() ^ 15869);
            int[] iArr4 = new int["E\u001b,ZUd^YY#6Ykn".length()];
            QB qb4 = new QB("E\u001b,ZUd^YY#6Ykn");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((sXd6 ^ i5) + xuXd4.CK(iKK4));
                i5++;
            }
            httpURLConnection.setRequestProperty(new String(iArr4, 0, i5), strBytesToStringUppercase);
            String strKd = Qg.kd("|Pi\u0011\u0010\u0007\u000b\u0003Ib`^EZw\u0004Aew\u0006\u0003\t", (short) (C1499aX.Xd() ^ (-31227)), (short) (C1499aX.Xd() ^ (-15235)));
            short sXd7 = (short) (OY.Xd() ^ 22564);
            short sXd8 = (short) (OY.Xd() ^ 8480);
            int[] iArr5 = new int["nYf".length()];
            QB qb5 = new QB("nYf");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK(sXd7 + i6 + xuXd5.CK(iKK5) + sXd8);
                i6++;
            }
            httpURLConnection.setRequestProperty(strKd, new String(iArr5, 0, i6));
            String strUd = C1561oA.ud("w#!&\u0016\u001e#Z\u0001%\u001b\u000f", (short) (OY.Xd() ^ 23927));
            String strYd3 = C1561oA.yd("\u0007\u0017\u0014\u0011\u000b\u0006\u0001\u0015\u0007\u000e\nK\u0004\u000e\u0007\u0007", (short) (C1499aX.Xd() ^ (-9230)));
            httpURLConnection.setRequestProperty(strUd, strYd3);
            httpURLConnection.setRequestProperty(C1561oA.Yd("x\u001c\u001d ,1", (short) (ZN.Xd() ^ 32660)), strYd3);
            for (Map.Entry entry : ((zzat) map2).entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            boolean zIsLoggable = Log.isLoggable(strYd, 3);
            String strQd = Xg.qd("\u0016|", (short) (OY.Xd() ^ 3712), (short) (OY.Xd() ^ 2430));
            if (zIsLoggable) {
                for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getRequestProperties().entrySet()) {
                    String key = entry2.getKey();
                    if (!zza.zza(key).contains(Jg.Wd("\u000b\u0019D^\u0011Y ", (short) (OY.Xd() ^ 22018), (short) (OY.Xd() ^ 767)))) {
                        String strZza = zza.zza(key);
                        short sXd9 = (short) (Od.Xd() ^ (-24065));
                        short sXd10 = (short) (Od.Xd() ^ (-25796));
                        int[] iArr6 = new int["wD-\u0019}8,+\u001c%5b".length()];
                        QB qb6 = new QB("wD-\u0019}8,+\u001c%5b");
                        int i7 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((i7 * sXd10) + sXd9)));
                            i7++;
                        }
                        if (!strZza.contains(new String(iArr6, 0, i7))) {
                            Iterator<String> it = entry2.getValue().iterator();
                            while (it.hasNext()) {
                                String str7 = C1626yg.Ud("\u0013Q\u0003%\u007fz9K~\u0014\u001d)FAkK\"}`\u0018L", (short) (OY.Xd() ^ 2750), (short) (OY.Xd() ^ 2066)) + key + strQd + it.next();
                            }
                        }
                    }
                }
            }
            HashMap map3 = new HashMap();
            if (str == null) {
                throw new zzwb(Qg.kd("\u00142@.2h.(/1)'{`\u0006(0\"\u001e\u001c-\u001eW $((\u0014 \u0014\u0015N\u0017\u0011K\u0014\u001dH\u0016\u001c\u0012\u0011Q", (short) (OY.Xd() ^ 15569), (short) (OY.Xd() ^ 27725)));
            }
            map3.put(Ig.wd("\u0010g5}yJokR\u0017\u0013`M", (short) (C1499aX.Xd() ^ (-14591))), str);
            String strOd = EO.Od("Z\u0013\u0001B0\u0002'$oYU\u001b`NuTz\n", (short) (Od.Xd() ^ (-1359)));
            map3.put(strOd, str2);
            map3.put(C1561oA.Qd("8FE\u001d7", (short) (ZN.Xd() ^ 20005)), this.zzc);
            Context context6 = this.zzb;
            Object[] objArr6 = new Object[0];
            Method method6 = Class.forName(C1593ug.zd("z\t\u007f\u000f\r\b\u0004N\u0005\u0012\u0012\u0019\u000b\u0015\u001cVl\u001a\u001a!\u0013'$", (short) (C1580rY.Xd() ^ (-9096)), (short) (C1580rY.Xd() ^ (-21474)))).getMethod(C1561oA.od("~{\nfx\u0006\u0001\u0006\u0002qr\u007f", (short) (C1607wl.Xd() ^ Mp4VideoDirectory.TAG_OPCOLOR)), new Class[0]);
            try {
                method6.setAccessible(true);
                Locale locale = ((Resources) method6.invoke(context6, objArr6)).getConfiguration().locale;
                map3.put(C1561oA.Kd("!.5/65=\b5+-", (short) (FB.Xd() ^ 9723)), locale.getCountry());
                map3.put(Wg.Zd("\n|\u001a0/06aP\u0019\u0007\u0005", (short) (C1607wl.Xd() ^ 1516), (short) (C1607wl.Xd() ^ 16823)), locale.toString());
                map3.put(C1561oA.Xd("<9/C6@D@*:HJAHH", (short) (FB.Xd() ^ 7764)), Integer.toString(Build.VERSION.SDK_INT));
                map3.put(Wg.vd("<07.&:<2", (short) (ZN.Xd() ^ 21166)), TimeZone.getDefault().getID());
                try {
                    context = this.zzb;
                    short sXd11 = (short) (ZN.Xd() ^ 15403);
                    short sXd12 = (short) (ZN.Xd() ^ CasioType2MakernoteDirectory.TAG_BESTSHOT_MODE);
                    int[] iArr7 = new int["\u0016\"\u0017$ \u0019\u0013[\u0010\u001b\u0019\u001e\u000e\u0016\u001bSg\u0013\u0011\u0016\u0006\u0018\u0013".length()];
                    QB qb7 = new QB("\u0016\"\u0017$ \u0019\u0013[\u0010\u001b\u0019\u001e\u000e\u0016\u001bSg\u0013\u0011\u0016\u0006\u0018\u0013");
                    int i8 = 0;
                    while (qb7.YK()) {
                        int iKK7 = qb7.KK();
                        Xu xuXd7 = Xu.Xd(iKK7);
                        iArr7[i8] = xuXd7.fK(((sXd11 + i8) + xuXd7.CK(iKK7)) - sXd12);
                        i8++;
                    }
                    Class<?> cls = Class.forName(new String(iArr7, 0, i8));
                    Class<?>[] clsArr = new Class[0];
                    objArr = new Object[0];
                    short sXd13 = (short) (C1633zX.Xd() ^ (-9347));
                    short sXd14 = (short) (C1633zX.Xd() ^ (-9453));
                    int[] iArr8 = new int["TQ_:JKRGLI0COAFCO".length()];
                    QB qb8 = new QB("TQ_:JKRGLI0COAFCO");
                    int i9 = 0;
                    while (qb8.YK()) {
                        int iKK8 = qb8.KK();
                        Xu xuXd8 = Xu.Xd(iKK8);
                        iArr8[i9] = xuXd8.fK(sXd13 + i9 + xuXd8.CK(iKK8) + sXd14);
                        i9++;
                    }
                    method = cls.getMethod(new String(iArr8, 0, i9), clsArr);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    Context context7 = this.zzb;
                    Object[] objArr7 = new Object[0];
                    Method method7 = Class.forName(C1561oA.ud("\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0012\u0017\u0007\u0019\u0014", (short) (Od.Xd() ^ (-29363)))).getMethod(C1561oA.yd("\u000f\f\u001at\r\u000e\u0015\n\u0017\u0014{\u000e!\u0018", (short) (C1633zX.Xd() ^ (-1368))), new Class[0]);
                    try {
                        method7.setAccessible(true);
                        String str8 = (String) method7.invoke(context7, objArr7);
                        Class<?> cls2 = Class.forName(C1561oA.Yd("\u0004\u0012\t\u0018\u0016\u0011\rW\u000e\u001b\u001b\"\u0014\u001e%_#!b\u0006\u0018\u001b$\u001b\"!\n\u001f-!('5", (short) (FB.Xd() ^ 7110)));
                        Class<?>[] clsArr2 = new Class[2];
                        clsArr2[0] = Class.forName(Xg.qd("ldzf4siwq9_\u0002\u0001x~x", (short) (ZN.Xd() ^ 24938), (short) (ZN.Xd() ^ 22517)));
                        clsArr2[1] = Integer.TYPE;
                        Object[] objArr8 = {str8, 0};
                        short sXd15 = (short) (ZN.Xd() ^ 28763);
                        short sXd16 = (short) (ZN.Xd() ^ 25320);
                        int[] iArr9 = new int["1>\u0001n/B|\u0004:K`\u0018A]".length()];
                        QB qb9 = new QB("1>\u0001n/B|\u0004:K`\u0018A]");
                        int i10 = 0;
                        while (qb9.YK()) {
                            int iKK9 = qb9.KK();
                            Xu xuXd9 = Xu.Xd(iKK9);
                            iArr9[i10] = xuXd9.fK(xuXd9.CK(iKK9) - ((i10 * sXd16) ^ sXd15));
                            i10++;
                        }
                        Method method8 = cls2.getMethod(new String(iArr9, 0, i10), clsArr2);
                        try {
                            method8.setAccessible(true);
                            PackageInfo packageInfo = (PackageInfo) method8.invoke(packageManager, objArr8);
                            String str9 = packageInfo != null ? packageInfo.versionName : null;
                            String str10 = String.format(ZO.xd("\u0015\u0016\bJ\u000eU<*\r\u0014J", (short) (C1607wl.Xd() ^ 19819), (short) (C1607wl.Xd() ^ 2324)), str9, str5);
                            C1626yg.Ud("u]|70fZ\f\u001ex\n\u001d<", (short) (FB.Xd() ^ 23987), (short) (FB.Xd() ^ 12809)).concat(String.valueOf(str10));
                            map3.put(Ig.wd("F\u007f,C8p\u0018;z[", (short) (C1580rY.Xd() ^ (-22340))), str10);
                            Context context8 = this.zzb;
                            String strOd2 = EO.Od("d\u001eoY)l\u0001+mWK", (short) (Od.Xd() ^ (-5539)));
                            Object[] objArr9 = new Object[0];
                            Method method9 = Class.forName(C1561oA.Qd(":F;HD=7\u007f4?=B2:?w\f75:*<7", (short) (OY.Xd() ^ 12532))).getMethod(C1593ug.zd("\n\t\u0019u\b\u000b\u0014\u000b\u0012\u0011z\u000f\u001c\u0015", (short) (C1607wl.Xd() ^ 31351), (short) (C1607wl.Xd() ^ 23126)), new Class[0]);
                            try {
                                method9.setAccessible(true);
                                map3.put(strOd2, (String) method9.invoke(context8, objArr9));
                                map3.put(C1561oA.od("N>D.<HH=B@", (short) (C1607wl.Xd() ^ 14884)), C1561oA.Kd("\u000bV~X\r\r\r\f\u0018^VTWVY", (short) (FB.Xd() ^ 28542)));
                                map3.put(Wg.Zd("+k\u0014L\f4^\u0006H_Ko*=\r<r\u0015U$Nw8", (short) (ZN.Xd() ^ 10099), (short) (ZN.Xd() ^ 30252)), new JSONObject(map));
                                JSONObject jSONObject2 = new JSONObject(map3);
                                if (Log.isLoggable(strYd, 3)) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    Iterator<String> itKeys = jSONObject2.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        try {
                                            jSONObject3.put(next, jSONObject2.get(next));
                                        } catch (JSONException e6) {
                                            throw new IllegalStateException(C1561oA.Xd("\u0005zt\u0001\u0002\u0006\u000f[\t\u000b\u0015f\u0011\u000e\u000eo\u0004\r\t\b\u001a`G\f\u0019\u0019\u000f\" !\u0015\u001f&R!**\u0018,\"))z", (short) (FB.Xd() ^ 15833)), e6);
                                        }
                                    }
                                    jSONObject3.remove(strOd);
                                    Wg.vd("}\u000b\b\u0005Q\u0005\u0015\"#\u0014\u001f!Il\u0017\r\u001f`C", (short) (FB.Xd() ^ 11122)).concat(jSONObject3.toString());
                                }
                                byte[] bytes = jSONObject2.toString().getBytes(StandardCharsets.UTF_8);
                                zzum zzumVar2 = new zzum();
                                zzumVar2.zzg();
                                Qg.kd("i\u0007\u0015\u0014\b\f\u0004;\r~\u0006\u0007\u000bz4v\u0002\u007fvxu", (short) (C1633zX.Xd() ^ (-31290)), (short) (C1633zX.Xd() ^ (-5937)));
                                try {
                                    String strValueOf2 = String.valueOf(httpURLConnection);
                                    ?? Vd = hg.Vd("\f754*'7+/'x]", (short) (C1499aX.Xd() ^ (-31130)), (short) (C1499aX.Xd() ^ (-23265)));
                                    Vd.concat(String.valueOf(strValueOf2));
                                    try {
                                        Vd = zzumVar;
                                        httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Callback.getOutputStream(httpURLConnection));
                                        bufferedOutputStream.write(bytes);
                                        bufferedOutputStream.flush();
                                        bufferedOutputStream.close();
                                        Callback.connect(httpURLConnection);
                                        int responseCode = Callback.getResponseCode(httpURLConnection);
                                        try {
                                            zzumVar2.zzf(responseCode);
                                            StringBuilder sb = new StringBuilder();
                                            short sXd17 = (short) (Od.Xd() ^ (-26340));
                                            int[] iArr10 = new int["n\u0001\b\t\r|6x\u0004\u0002xzwI.t{\u007f*{mzvtrvg!cnbb\u001c".length()];
                                            QB qb10 = new QB("n\u0001\b\t\r|6x\u0004\u0002xzwI.t{\u007f*{mzvtrvg!cnbb\u001c");
                                            int i11 = 0;
                                            while (qb10.YK()) {
                                                int iKK10 = qb10.KK();
                                                Xu xuXd10 = Xu.Xd(iKK10);
                                                iArr10[i11] = xuXd10.fK(sXd17 + i11 + xuXd10.CK(iKK10));
                                                i11++;
                                            }
                                            sb.append(new String(iArr10, 0, i11));
                                            sb.append(responseCode);
                                            sb.toString();
                                            short sXd18 = (short) (Od.Xd() ^ (-17091));
                                            int[] iArr11 = new int["\u0004\u0011\u0012\u000f_\u0013'6$$$*\u001dX\u0002 -13A\np".length()];
                                            QB qb11 = new QB("\u0004\u0011\u0012\u000f_\u0013'6$$$*\u001dX\u0002 -13A\np");
                                            int i12 = 0;
                                            while (qb11.YK()) {
                                                int iKK11 = qb11.KK();
                                                Xu xuXd11 = Xu.Xd(iKK11);
                                                iArr11[i12] = xuXd11.fK(xuXd11.CK(iKK11) - (sXd18 ^ i12));
                                                i12++;
                                            }
                                            String str11 = new String(iArr11, 0, i12);
                                            if (responseCode != 200) {
                                                zzumVar2.zzd(zzsw.RPC_ERROR);
                                                Vd.zzb(zzsw.RPC_ERROR);
                                                if (Log.isLoggable(strYd, 4)) {
                                                    for (Map.Entry<String, List<String>> entry3 : Callback.getHeaderFields(httpURLConnection).entrySet()) {
                                                        for (String str12 : entry3.getValue()) {
                                                            String str13 = str11 + entry3.getKey() + strQd + str12;
                                                        }
                                                    }
                                                }
                                                if (Log.isLoggable(strYd, 5) && (errorStream = Callback.getErrorStream(httpURLConnection)) != null) {
                                                    Scanner scannerUseDelimiter = new Scanner(errorStream).useDelimiter(C1561oA.Kd("aG", (short) (C1607wl.Xd() ^ 6773)));
                                                    if (scannerUseDelimiter.hasNext()) {
                                                        Wg.Zd("iV7\u0014{\u0002\u0010p~\u0003pd>=p\u0016\u001b(N", (short) (C1499aX.Xd() ^ (-25281)), (short) (C1499aX.Xd() ^ (-21339))).concat(String.valueOf(scannerUseDelimiter.next()));
                                                    }
                                                }
                                                try {
                                                    throw new zzwg(responseCode, Callback.getResponseMessage(httpURLConnection));
                                                } catch (IOException e7) {
                                                    throw new zzwg(responseCode, C1561oA.Xd("{&4537e9-*.4:4m\u0017$%\"rF:IGGGM@\u001a", (short) (OY.Xd() ^ 15550)), e7);
                                                }
                                            }
                                            if (Log.isLoggable(strYd, 3)) {
                                                for (Map.Entry<String, List<String>> entry4 : Callback.getHeaderFields(httpURLConnection).entrySet()) {
                                                    for (String str14 : entry4.getValue()) {
                                                        String str15 = str11 + entry4.getKey() + strQd + str14;
                                                    }
                                                }
                                            }
                                            String headerField = Callback.getHeaderField(httpURLConnection, C1561oA.Yd("5ESZ", (short) (ZN.Xd() ^ 27146)));
                                            try {
                                                try {
                                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Callback.getInputStream((URLConnection) httpURLConnection), StandardCharsets.UTF_8));
                                                    StringBuilder sb2 = new StringBuilder();
                                                    while (true) {
                                                        int i13 = bufferedReader.read();
                                                        if (i13 == -1) {
                                                            break;
                                                        }
                                                        sb2.append((char) i13);
                                                    }
                                                    JSONObject jSONObject4 = new JSONObject(sb2.toString());
                                                    StringBuilder sb3 = new StringBuilder();
                                                    short sXd19 = (short) (OY.Xd() ^ 6729);
                                                    short sXd20 = (short) (OY.Xd() ^ 25420);
                                                    int[] iArr12 = new int["\u001c09<B4o4AA:>=\u0011w@IO{OCRPPPVI\u0005+;IP$\u000b".length()];
                                                    QB qb12 = new QB("\u001c09<B4o4AA:>=\u0011w@IO{OCRPPPVI\u0005+;IP$\u000b");
                                                    int i14 = 0;
                                                    while (qb12.YK()) {
                                                        int iKK12 = qb12.KK();
                                                        Xu xuXd12 = Xu.Xd(iKK12);
                                                        iArr12[i14] = xuXd12.fK((xuXd12.CK(iKK12) - (sXd19 + i14)) + sXd20);
                                                        i14++;
                                                    }
                                                    sb3.append(new String(iArr12, 0, i14));
                                                    sb3.append(headerField);
                                                    sb3.toString();
                                                    String string = jSONObject4.toString();
                                                    ?? sb4 = new StringBuilder();
                                                    sb4.append(Jg.Wd("+Q.\u0004]#q\nj-y\u0011b\nC_<EEl3\u0016'yM&\\F\u007f", (short) (C1580rY.Xd() ^ (-2111)), (short) (C1580rY.Xd() ^ (-16485))));
                                                    sb4.append(string);
                                                    sb4.toString();
                                                    try {
                                                        sb4 = date;
                                                    } catch (JSONException unused2) {
                                                    }
                                                    if (jSONObject4.get(ZO.xd("V!HAv", (short) (ZN.Xd() ^ 12986), (short) (ZN.Xd() ^ 16906))).equals(C1626yg.Ud("njaPR`\u001bg\u000e", (short) (C1607wl.Xd() ^ 14204), (short) (C1607wl.Xd() ^ 14802)))) {
                                                        zzvvVarZzc = zzvv.zzb(sb4);
                                                        return zzvvVarZzc;
                                                    }
                                                    try {
                                                        JSONArray jSONArray = null;
                                                        ?? zzvsVar = new zzvs(null);
                                                        zzvsVar.zzc(sb4);
                                                        short sXd21 = (short) (OY.Xd() ^ 27967);
                                                        int[] iArr13 = new int["\nJ\u0003\u0018\u007fWA".length()];
                                                        QB qb13 = new QB("\nJ\u0003\u0018\u007fWA");
                                                        int i15 = 0;
                                                        while (qb13.YK()) {
                                                            int iKK13 = qb13.KK();
                                                            Xu xuXd13 = Xu.Xd(iKK13);
                                                            iArr13[i15] = xuXd13.fK(xuXd13.CK(iKK13) - (C1561oA.Xd[i15 % C1561oA.Xd.length] ^ (sXd21 + i15)));
                                                            i15++;
                                                        }
                                                        try {
                                                            jSONObject = jSONObject4.getJSONObject(new String(iArr13, 0, i15));
                                                        } catch (JSONException unused3) {
                                                            jSONObject = null;
                                                        }
                                                        if (jSONObject != null) {
                                                            zzvsVar.zza(jSONObject);
                                                        }
                                                        try {
                                                            jSONArray = jSONObject4.getJSONArray(EO.Od("oKUm\"V:\u001a^\u0014a%b\\\u0013h4.{}7\u0015", (short) (C1499aX.Xd() ^ (-14155))));
                                                        } catch (JSONException unused4) {
                                                        }
                                                        if (jSONArray != null) {
                                                            zzvsVar.zzb(jSONArray);
                                                        }
                                                        zzvvVarZzc = zzvv.zzc(zzvsVar.zzd(), headerField);
                                                        return zzvvVarZzc;
                                                    } catch (JSONException e8) {
                                                        zzumVar2.zzd(zzsw.RPC_RETURNED_INVALID_RESULT);
                                                        Vd.zzb(zzsw.RPC_RETURNED_INVALID_RESULT);
                                                        short sXd22 = (short) (OY.Xd() ^ 6755);
                                                        int[] iArr14 = new int["5SaOS\nOIPRJH\u001d\u0002GESAE{M?LHFDH9r5@E;2l::>h*,e5%55&$l".length()];
                                                        QB qb14 = new QB("5SaOS\nOIPRJH\u001d\u0002GESAE{M?LHFDH9r5@E;2l::>h*,e5%55&$l");
                                                        int i16 = 0;
                                                        while (qb14.YK()) {
                                                            int iKK14 = qb14.KK();
                                                            Xu xuXd14 = Xu.Xd(iKK14);
                                                            iArr14[i16] = xuXd14.fK(sXd22 + sXd22 + sXd22 + i16 + xuXd14.CK(iKK14));
                                                            i16++;
                                                        }
                                                        throw new zzwb(new String(iArr14, 0, i16), e8);
                                                    }
                                                } catch (JSONException e9) {
                                                    zzumVar2.zzd(zzsw.RPC_RETURNED_MALFORMED_RESULT);
                                                    Vd.zzb(zzsw.RPC_RETURNED_MALFORMED_RESULT);
                                                    short sXd23 = (short) (OY.Xd() ^ 32212);
                                                    int[] iArr15 = new int["t! \u001c\u001eJ\u001a\n\u001a\u001a\u000f\u0013\u000bB\u0016\t\u0005>\u0011\u0002\u000e\u0011~\u000b7\u0006\u000b\t\u0004\b\u0006".length()];
                                                    QB qb15 = new QB("t! \u001c\u001eJ\u001a\n\u001a\u001a\u000f\u0013\u000bB\u0016\t\u0005>\u0011\u0002\u000e\u0011~\u000b7\u0006\u000b\t\u0004\b\u0006");
                                                    int i17 = 0;
                                                    while (qb15.YK()) {
                                                        int iKK15 = qb15.KK();
                                                        Xu xuXd15 = Xu.Xd(iKK15);
                                                        iArr15[i17] = xuXd15.fK(sXd23 + sXd23 + i17 + xuXd15.CK(iKK15));
                                                        i17++;
                                                    }
                                                    throw new zzwb(new String(iArr15, 0, i17), e9);
                                                }
                                            } catch (IOException e10) {
                                                zzumVar2.zzd(zzsw.RPC_ERROR);
                                                Vd.zzb(zzsw.RPC_ERROR);
                                                throw new zzwb(C1593ug.zd("I^\\\u0018\\fdakr\u001fhbf#es&lz{y},\u0005vx|v2vu\u0002\u0003\u0001\u0007\u0001:\u0010\u0005\u0003>\u0002\u0002\u0005\u000e\t\u0013\nG", (short) (C1633zX.Xd() ^ (-18967)), (short) (C1633zX.Xd() ^ (-160))), e10);
                                            }
                                        } finally {
                                            httpURLConnection.disconnect();
                                        }
                                    } catch (IOException e11) {
                                        zzumVar2.zzd(zzsw.NO_CONNECTION);
                                        Vd.zzb(zzsw.NO_CONNECTION);
                                        throw new zzwb(Wg.vd("?mnlp\u001fcppqihzpvp*\u007f{-", (short) (C1580rY.Xd() ^ (-22242))).concat(String.valueOf(String.valueOf(httpURLConnection))), e11);
                                    }
                                } finally {
                                    zzumVar2.zze();
                                    this.zzf.zzd(zzumVar2);
                                }
                            } catch (InvocationTargetException e12) {
                                throw e12.getCause();
                            }
                        } catch (InvocationTargetException e13) {
                            throw e13.getCause();
                        }
                    } catch (InvocationTargetException e14) {
                        throw e14.getCause();
                    }
                } catch (InvocationTargetException e15) {
                    throw e15.getCause();
                }
            } catch (InvocationTargetException e16) {
                throw e16.getCause();
            }
        } catch (InvocationTargetException e17) {
            throw e17.getCause();
        }
    }

    public final HttpURLConnection zzb() throws zzwc {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", this.zze, "firebase")).openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            return (HttpURLConnection) uRLConnectionOpenConnection;
        } catch (IOException e2) {
            throw new zzwc(e2.getMessage());
        }
    }
}
