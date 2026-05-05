package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.HttpUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Od;
import yg.Qg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfu {
    public static long zza(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static zzay zzb(zzfd zzfdVar, String str) {
        Preconditions.checkNotNull(zzfdVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            Map<String, String> map = HttpUtils.parse(new URI(Global.QUESTION + str), "UTF-8");
            zzay zzayVar = new zzay();
            zzayVar.zzp(map.get("utm_content"));
            zzayVar.zzu(map.get("utm_medium"));
            zzayVar.zzv(map.get("utm_campaign"));
            zzayVar.zzw(map.get("utm_source"));
            zzayVar.zzt(map.get("utm_term"));
            zzayVar.zzs(map.get("utm_id"));
            zzayVar.zzo(map.get("anid"));
            zzayVar.zzr(map.get("gclid"));
            zzayVar.zzq(map.get("dclid"));
            zzayVar.zzn(map.get(FirebaseAnalytics.Param.ACLID));
            return zzayVar;
        } catch (URISyntaxException e2) {
            zzfdVar.zzR("No valid campaign data found", e2);
            return null;
        }
    }

    public static String zzc(boolean z2) {
        return true != z2 ? AdkSettings.PLATFORM_TYPE_MOBILE : "1";
    }

    public static String zzd(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append(Global.HYPHEN);
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    public static MessageDigest zze(String str) {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static Map zzf(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=", 3);
            int length = strArrSplit.length;
            if (length > 1) {
                map.put(strArrSplit[0], TextUtils.isEmpty(strArrSplit[1]) ? null : strArrSplit[1]);
                if (length == 3 && !TextUtils.isEmpty(strArrSplit[1]) && !map.containsKey(strArrSplit[1])) {
                    map.put(strArrSplit[1], TextUtils.isEmpty(strArrSplit[2]) ? null : strArrSplit[2]);
                }
            } else if (length == 1 && strArrSplit[0].length() != 0) {
                map.put(strArrSplit[0], null);
            }
        }
        return map;
    }

    public static void zzg(Map map, String str, String str2) {
        if (str2 == null || map.containsKey(str)) {
            return;
        }
        map.put(str, str2);
    }

    public static void zzh(Map map, String str, Map map2) {
        zzg(map, str, (String) map2.get(str));
    }

    public static boolean zzi(Context context, String str, boolean z2) throws Throwable {
        ActivityInfo activityInfo;
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("DPERNGA\n>IGL<DI\u0002\u0016A?D4FA", (short) (Od.Xd() ^ (-6565)), (short) (Od.Xd() ^ (-18130)))).getMethod(hg.Vd("{x\u0007aqrynspWjvhmjv", (short) (C1580rY.Xd() ^ (-12350)), (short) (C1580rY.Xd() ^ (-1991))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                ComponentName componentName = new ComponentName(context, str);
                Class<?> cls = Class.forName(C1561oA.ud("6B7D@93{0;9>.6;s51p\u0012\"#*\u001f$!\b\u001b'\u0019\u001e\u001b'", (short) (FB.Xd() ^ 30666)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.yd("\u001e,\u001f.0+#m(518.8;u\u0010=8<@@4>I$4A>", (short) (ZN.Xd() ^ IptcDirectory.TAG_REFERENCE_NUMBER)));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {componentName, 0};
                Method method2 = cls.getMethod(C1561oA.Yd(".-=\u001c0/27E5C\u001bA:D", (short) (FB.Xd() ^ LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE)), clsArr);
                try {
                    method2.setAccessible(true);
                    activityInfo = (ActivityInfo) method2.invoke(packageManager, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return activityInfo != null && activityInfo.enabled && (!z2 || activityInfo.exported);
    }

    public static boolean zzj(double d2, String str) {
        int i2;
        if (d2 > 0.0d && d2 < 100.0d) {
            if (TextUtils.isEmpty(str)) {
                i2 = 1;
            } else {
                i2 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char cCharAt = str.charAt(length);
                    i2 = ((i2 << 6) & 268435455) + cCharAt + (cCharAt << 14);
                    int i3 = 266338304 & i2;
                    if (i3 != 0) {
                        i2 ^= i3 >> 21;
                    }
                }
            }
            if (i2 % 10000 >= d2 * 100.0d) {
                return true;
            }
        }
        return false;
    }
}
