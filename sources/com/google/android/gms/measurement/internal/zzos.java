package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.core.app.NotificationCompat;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import androidx.webkit.ProxyConfig;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
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
import yg.InterfaceC1492Gx;
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
public final class zzos extends zzjd {
    private static final String[] zza = {"firebase_", "google_", "ga_"};
    private static final String[] zzb = {"_err"};
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private MeasurementManagerFutures zzf;
    private Boolean zzg;
    private Integer zzh;

    zzos(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzh = null;
        this.zzd = new AtomicLong(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Object r25, android.os.Bundle r26, java.util.List<java.lang.String> r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzos.zza(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public static long zza(long j2, long j3) {
        return (j2 + (j3 * StatsigLoggerKt.FLUSH_TIMER_MS)) / CalendarModelKt.MillisecondsIn24Hours;
    }

    public static long zza(zzbe zzbeVar) {
        long length = 0;
        if (zzbeVar == null) {
            return 0L;
        }
        Iterator<String> it = zzbeVar.iterator();
        while (it.hasNext()) {
            Object objZzc = zzbeVar.zzc(it.next());
            if (objZzc instanceof Parcelable[]) {
                length += (long) ((Parcelable[]) objZzc).length;
            }
        }
        return length;
    }

    static long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i2 = 0;
        Preconditions.checkState(bArr.length > 0);
        long j2 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j2 += (((long) bArr[length]) & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    public static Bundle zza(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        if (parcelableArr[i2] instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static Bundle zza(List<zzon> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzon zzonVar : list) {
            if (zzonVar.zzd != null) {
                bundle.putString(zzonVar.zza, zzonVar.zzd);
            } else if (zzonVar.zzc != null) {
                bundle.putLong(zzonVar.zza, zzonVar.zzc.longValue());
            } else if (zzonVar.zzf != null) {
                bundle.putDouble(zzonVar.zza, zzonVar.zzf.doubleValue());
            }
        }
        return bundle;
    }

    private final Object zza(int i2, Object obj, boolean z2, boolean z3, String str) {
        Bundle bundleZza;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zza(String.valueOf(obj), i2, z2);
        }
        if (!z3 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (bundleZza = zza((Bundle) parcelable, (String) null)) != null && !bundleZza.isEmpty()) {
                arrayList.add(bundleZza);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static String zza(String str, int i2, boolean z2) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (!z2) {
            return null;
        }
        return str.substring(0, str.offsetByCodePoints(0, i2)) + "...";
    }

    private static void zza(Bundle bundle, int i2, String str, Object obj) {
        if (zzb(bundle, i2)) {
            bundle.putString("_ev", zza(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if (obj != null) {
                    if ((obj instanceof String) || (obj instanceof CharSequence)) {
                        bundle.putLong("_el", String.valueOf(obj).length());
                    }
                }
            }
        }
    }

    public static void zza(zzlk zzlkVar, Bundle bundle, boolean z2) {
        if (bundle == null || zzlkVar == null || (bundle.containsKey("_sc") && !z2)) {
            if (bundle != null && zzlkVar == null && z2) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        if (zzlkVar.zza != null) {
            bundle.putString("_sn", zzlkVar.zza);
        } else {
            bundle.remove("_sn");
        }
        if (zzlkVar.zzb != null) {
            bundle.putString("_sc", zzlkVar.zzb);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", zzlkVar.zzc);
    }

    public static void zza(zzor zzorVar, int i2, String str, String str2, int i3) {
        zza(zzorVar, (String) null, i2, str, str2, i3);
    }

    static void zza(zzor zzorVar, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        zzb(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        zzorVar.zza(str, "_err", bundle);
    }

    private final void zza(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z2) {
        int iZzl;
        int iZza;
        if (bundle == null) {
            return;
        }
        int i2 = zze().zzq().zza(231100000, true) ? 35 : 0;
        int i3 = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                iZzl = !z2 ? zzl(str4) : 0;
                if (iZzl == 0) {
                    iZzl = zzk(str4);
                }
            } else {
                iZzl = 0;
            }
            if (iZzl != 0) {
                zza(bundle, iZzl, str4, iZzl == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (zza(bundle.get(str4))) {
                    zzj().zzv().zza("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                    iZza = 22;
                } else {
                    iZza = zza(str, str2, str4, bundle.get(str4), bundle, list, z2, false);
                }
                if (iZza != 0 && !"_ev".equals(str4)) {
                    zza(bundle, iZza, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (zzh(str4) && !zza(str4, zzjk.zzd)) {
                    i3++;
                    if (!zza(231100000, true)) {
                        zzj().zzm().zza("Item array not supported on client's version of Google Play Services (Android Only)", zzi().zza(str2), zzi().zza(bundle));
                        zzb(bundle, 23);
                        bundle.remove(str4);
                    } else if (i3 > i2) {
                        zzj().zzm().zza("Item can't contain more than " + i2 + " item-scoped custom params", zzi().zza(str2), zzi().zza(bundle));
                        zzb(bundle, 28);
                        bundle.remove(str4);
                    }
                }
            }
        }
    }

    static boolean zza(Context context) throws Throwable {
        Preconditions.checkNotNull(context);
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("\u0018$\u0019&\"\u001b\u0015]\u0012\u001d\u001b \u0010\u0018\u001dUi\u0015\u0013\u0018\b\u001a\u0015", (short) (FB.Xd() ^ 11123))).getMethod(Qg.kd("&#1\f\u001c\u001d$\u0019\u001e\u001b\u0002\u0015!\u0013\u0018\u0015!", (short) (ZN.Xd() ^ 25604), (short) (ZN.Xd() ^ 32146)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                if (packageManager == null) {
                    return false;
                }
                ComponentName componentName = new ComponentName(context, hg.Vd("Zeb\"Za`W[S\u001bMYN[WPJ\u0013KPU\u000fMD?PQM?F=EJ\u0003\u0015CB\u001e50AB>07.6;\u0018*'(+7%1", (short) (C1580rY.Xd() ^ (-463)), (short) (C1580rY.Xd() ^ (-3397))));
                Class<?> cls = Class.forName(C1561oA.ud("\u0015!\u0016#\u001f\u0018\u0012Z\u000f\u001a\u0018\u001d\r\u0015\u001aR\u0014\u0010Op\u0001\u0002\t}\u0003\u007ffy\u0006w|y\u0006", (short) (ZN.Xd() ^ 14669)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.yd("^jcppig0hsuznv\u007f8P{|~\u0001~x\u0001\nbx\u0004~", (short) (ZN.Xd() ^ 881)));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {componentName, 0};
                Method method2 = cls.getMethod(C1561oA.Yd(" \u001f/\u000e\"!$)7'5\r3,6", (short) (OY.Xd() ^ 13992)), clsArr);
                try {
                    method2.setAccessible(true);
                    ActivityInfo activityInfo = (ActivityInfo) method2.invoke(packageManager, objArr2);
                    if (activityInfo != null && activityInfo.enabled) {
                        return true;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean zza(Context context, boolean z2) {
        Preconditions.checkNotNull(context);
        return zzc(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    static boolean zza(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean zza(Bundle bundle, int i2) {
        int i3 = 0;
        if (bundle.size() <= i2) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i3++;
            if (i3 > i2) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean zza(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean zza(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean zza(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static byte[] zza(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList<Bundle> zzb(List<zzae> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzae zzaeVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzaeVar.zza);
            bundle.putString("origin", zzaeVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzaeVar.zzd);
            bundle.putString("name", zzaeVar.zzc.zza);
            zzjf.zza(bundle, Preconditions.checkNotNull(zzaeVar.zzc.zza()));
            bundle.putBoolean("active", zzaeVar.zze);
            if (zzaeVar.zzf != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzaeVar.zzf);
            }
            if (zzaeVar.zzg != null) {
                zzbf zzbfVar = zzaeVar.zzg;
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzbfVar.zza);
                if (zzbfVar.zzb != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzbfVar.zzb.zzb());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzaeVar.zzh);
            if (zzaeVar.zzi != null) {
                zzbf zzbfVar2 = zzaeVar.zzi;
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzbfVar2.zza);
                if (zzbfVar2.zzb != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzbfVar2.zzb.zzb());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzaeVar.zzc.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzaeVar.zzj);
            if (zzaeVar.zzk != null) {
                zzbf zzbfVar3 = zzaeVar.zzk;
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzbfVar3.zza);
                if (zzbfVar3.zzb != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzbfVar3.zzb.zzb());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean zzb(Context context, String str) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 30010);
        short sXd2 = (short) (C1607wl.Xd() ^ 30768);
        int[] iArr = new int["/;+0^Udb]Y\u0016;][ob(L;@netrmi2JE^]".length()];
        QB qb = new QB("/;+0^Udb]Y\u0016;][ob(L;@netrmi2JE^]");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        X500Principal x500Principal = new X500Principal(new String(iArr, 0, i2));
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                return true;
            }
            Signature signature = packageInfo.signatures[0];
            String strWd = Jg.Wd("p^\r p", (short) (OY.Xd() ^ 27431), (short) (OY.Xd() ^ 2764));
            Class<?> cls = Class.forName(ZO.xd("cA@)\u001fsr\u0004bb:;\u0002\u0018\u0018\u0016Lq:ee@dk\"\n\fYi_2I>F0h7", (short) (C1607wl.Xd() ^ 22324), (short) (C1607wl.Xd() ^ 16228)));
            Class<?>[] clsArr = new Class[1];
            short sXd3 = (short) (FB.Xd() ^ 29815);
            short sXd4 = (short) (FB.Xd() ^ 4597);
            int[] iArr2 = new int["tS\u0012\u0017kAIvc\u0006D}f\u0015}o".length()];
            QB qb2 = new QB("tS\u0012\u0017kAIvc\u0006D}f\u0015}o");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = {strWd};
            Method declaredMethod = cls.getDeclaredMethod(Ig.wd("\u0013KJxzKzdO\u0016\u001c", (short) (FB.Xd() ^ 12892)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                short sXd5 = (short) (C1499aX.Xd() ^ (-13184));
                int[] iArr3 = new int[">}`0\u0014\u0006 N?\\M~N\u0001\u00126\u0010\u0004\u00067\u0018y*#>9Q\fQPY\u00179l\u00027d".length()];
                QB qb3 = new QB(">}`0\u0014\u0006 N?\\M~N\u0001\u00126\u0010\u0004\u00067\u0018y*#>9Q\fQPY\u00179l\u00027d");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i4)) + xuXd3.CK(iKK3));
                    i4++;
                }
                Class<?> cls2 = Class.forName(new String(iArr3, 0, i4));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(C1561oA.Qd("\f\u0002\u0016\u007fK\u0006\u000bHb\u0007\b\f\ng\b\u0005vq|", (short) (C1607wl.Xd() ^ 9682)));
                Object[] objArr2 = {byteArrayInputStream};
                Method method = cls2.getMethod(C1593ug.zd("vu\u007fw\u0006u\n{Z}\f\u000f\u0005\u0003\u0007\u0002\u0001\u0015\u0007", (short) (C1633zX.Xd() ^ (-10410)), (short) (C1633zX.Xd() ^ (-18341))), clsArr2);
                try {
                    method.setAccessible(true);
                    X509Certificate x509Certificate = (X509Certificate) ((Certificate) method.invoke(certificateFactory, objArr2));
                    short sXd6 = (short) (OY.Xd() ^ 3149);
                    int[] iArr4 = new int["\u000e\u0004\u0018\u0002M\u0012\u0003\u007f\u0011\r\u0003\r\u0011Dxy\u0006\u0007?hD>FOp|}qmohewg".length()];
                    QB qb4 = new QB("\u000e\u0004\u0018\u0002M\u0012\u0003\u007f\u0011\r\u0003\r\u0011Dxy\u0006\u0007?hD>FOp|}qmohewg");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(sXd6 + sXd6 + i5 + xuXd4.CK(iKK4));
                        i5++;
                    }
                    Class<?> cls3 = Class.forName(new String(iArr4, 0, i5));
                    Object[] objArr3 = new Object[0];
                    Method method2 = cls3.getMethod(C1561oA.Kd("\f\u000b\u001bz\u001e\f\u0015\u0011\u0010\"\u0007d`a\u0003&\u001e$\u001a!)\u001b'", (short) (Od.Xd() ^ (-26920))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        return ((X500Principal) method2.invoke(x509Certificate, objArr3)).equals(x500Principal);
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
            zzgq zzgqVarZzg = zzj().zzg();
            short sXd7 = (short) (Od.Xd() ^ (-17192));
            short sXd8 = (short) (Od.Xd() ^ (-30508));
            int[] iArr5 = new int["ql1a\"\u0011Q4M\tv9\u001c5\u0017f:+td(F".length()];
            QB qb5 = new QB("ql1a\"\u0011Q4M\tv9\u001c5\u0017f:+td(F");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK(((i6 * sXd8) ^ sXd7) + xuXd5.CK(iKK5));
                i6++;
            }
            zzgqVarZzg.zza(new String(iArr5, 0, i6), e5);
            return true;
        } catch (CertificateException e6) {
            zzj().zzg().zza(C1561oA.Xd("g\u0016\u0017\u0015\u0019G\u0018\f\u001f\r\u0016\u001c\u0018\u001e\u0018Q\u0016\u0019'* \u001e\"\u001d\u001c0\"", (short) (C1633zX.Xd() ^ (-16096))), e6);
            return true;
        }
    }

    private static boolean zzb(Bundle bundle, int i2) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i2);
        return true;
    }

    static Bundle[] zzb(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static int zzc() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    private static boolean zzc(Context context, String str) throws Throwable {
        try {
            Class<?> cls = Class.forName(Wg.vd("XfYhb]U bokr`jm(*WSZH\\U", (short) (C1633zX.Xd() ^ (-25662))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-22208));
            short sXd2 = (short) (Od.Xd() ^ (-4264));
            int[] iArr = new int["\\YgBRSZOTQ8KWINKW".length()];
            QB qb = new QB("\\YgBRSZOTQ8KWINKW");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                if (packageManager == null) {
                    return false;
                }
                ComponentName componentName = new ComponentName(context, str);
                Class<?> cls2 = Class.forName(hg.Vd("MYN[WPJ\u0013GRPUEMR\u000bLH\b)9:A6;8\u001f2>052>", (short) (ZN.Xd() ^ 26399), (short) (ZN.Xd() ^ 31769)));
                Class<?>[] clsArr2 = new Class[2];
                clsArr2[0] = Class.forName(C1561oA.ud("LXMZVOI\u0012FQOTDLQ\n\u001eIFHFD:BG 2=4", (short) (Od.Xd() ^ (-11312))));
                clsArr2[1] = Integer.TYPE;
                Object[] objArr2 = {componentName, 0};
                Method method2 = cls2.getMethod(C1561oA.yd("\u001c\u0019'\u0005\u0016\"%\u0017\u0010\u0011s\u0018\u000f\u0017", (short) (C1499aX.Xd() ^ (-26045))), clsArr2);
                try {
                    method2.setAccessible(true);
                    ServiceInfo serviceInfo = (ServiceInfo) method2.invoke(packageManager, objArr2);
                    if (serviceInfo != null && serviceInfo.enabled) {
                        return true;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean zzd(String str) {
        return zze(zzbh.zzbd.zza(null), str);
    }

    private static boolean zze(String str, String str2) {
        return str.equals(ProxyConfig.MATCH_ALL_SCHEMES) || Arrays.asList(str.split(",")).contains(str2);
    }

    static boolean zzf(String str) {
        return zze(zzbh.zzca.zza(null), str);
    }

    static boolean zzg(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(Global.UNDERSCORE);
    }

    static boolean zzh(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean zzj(String str) {
        for (String str2 : zzb) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int zzk(String str) {
        if (!zzb("event param", str)) {
            return 3;
        }
        if (zza("event param", (String[]) null, str)) {
            return !zza("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private final int zzl(String str) {
        if (!zzc("event param", str)) {
            return 3;
        }
        if (zza("event param", (String[]) null, str)) {
            return !zza("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static int zzm(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    private static boolean zzn(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static MessageDigest zzu() {
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

    /* JADX WARN: Removed duplicated region for block: B:49:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzy() {
        /*
            r6 = this;
            java.lang.Boolean r0 = r6.zzg
            if (r0 != 0) goto L5e
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures r0 = r6.zzo()
            r5 = 0
            if (r0 != 0) goto Lc
            return r5
        Lc:
            com.google.common.util.concurrent.ListenableFuture r3 = r0.getMeasurementApiStatusAsync()
            r4 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L34 java.util.concurrent.ExecutionException -> L36 java.util.concurrent.CancellationException -> L38 java.util.concurrent.TimeoutException -> L3a
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r3 = r3.get(r0, r2)     // Catch: java.lang.InterruptedException -> L34 java.util.concurrent.ExecutionException -> L36 java.util.concurrent.CancellationException -> L38 java.util.concurrent.TimeoutException -> L3a
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.InterruptedException -> L34 java.util.concurrent.ExecutionException -> L36 java.util.concurrent.CancellationException -> L38 java.util.concurrent.TimeoutException -> L3a
            if (r3 == 0) goto L1e
            goto L20
        L1e:
            r0 = r5
            goto L27
        L20:
            int r1 = r3.intValue()     // Catch: java.lang.InterruptedException -> L2e java.util.concurrent.ExecutionException -> L30 java.util.concurrent.CancellationException -> L32 java.util.concurrent.TimeoutException -> L3d
            r0 = 1
            if (r1 != r0) goto L1e
        L27:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.InterruptedException -> L2e java.util.concurrent.ExecutionException -> L30 java.util.concurrent.CancellationException -> L32 java.util.concurrent.TimeoutException -> L3d
            r6.zzg = r0     // Catch: java.lang.InterruptedException -> L2e java.util.concurrent.ExecutionException -> L30 java.util.concurrent.CancellationException -> L32 java.util.concurrent.TimeoutException -> L3d
            goto L51
        L2e:
            r2 = move-exception
            goto L3e
        L30:
            r2 = move-exception
            goto L3e
        L32:
            r2 = move-exception
            goto L3e
        L34:
            r2 = move-exception
            goto L3b
        L36:
            r2 = move-exception
            goto L3b
        L38:
            r2 = move-exception
            goto L3b
        L3a:
            r2 = move-exception
        L3b:
            r3 = r4
            goto L3e
        L3d:
            r2 = move-exception
        L3e:
            com.google.android.gms.measurement.internal.zzgo r0 = r6.zzj()
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzu()
            java.lang.String r0 = "Measurement manager api exception"
            r1.zza(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r6.zzg = r0
        L51:
            com.google.android.gms.measurement.internal.zzgo r0 = r6.zzj()
            com.google.android.gms.measurement.internal.zzgq r1 = r0.zzp()
            java.lang.String r0 = "Measurement manager api status result"
            r1.zza(r0, r3)
        L5e:
            java.lang.Boolean r0 = r6.zzg
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzos.zzy():boolean");
    }

    public final int zza(int i2) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(zza(), 12451000);
    }

    final int zza(String str) {
        if (!zzb(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (zza(NotificationCompat.CATEGORY_EVENT, zzji.zza, zzji.zzb, str)) {
            return !zza(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
        }
        return 13;
    }

    final int zza(String str, Object obj) {
        return "_ldl".equals(str) ? zza("user property referrer", str, zzm(str), obj) : zza("user property", str, zzm(str), obj) ? 0 : 7;
    }

    final long zza(Context context, String str) throws Throwable {
        zzt();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("~\r\u0004\u0013\u0011\f\bR\t\u0016\u0016\u001d\u000f\u0019 Zp\u001e\u001e%\u0017+(", (short) (OY.Xd() ^ 25141))).getMethod(Xg.qd(">=M*<?H?FE.CQELKY", (short) (OY.Xd() ^ 8646), (short) (OY.Xd() ^ 14021)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            MessageDigest messageDigestZzu = zzu();
            if (messageDigestZzu == null) {
                zzj().zzg().zza(Jg.Wd("\u001e;\u0004_:\u001a+/xFrS%\u0015\u0005`\u0014?O71t\u0002uM\u0014", (short) (ZN.Xd() ^ 19072), (short) (ZN.Xd() ^ 3387)));
                return -1L;
            }
            if (packageManager != null) {
                try {
                    if (!zzb(context, str)) {
                        PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(context);
                        Context contextZza = zza();
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(ZO.xd("h\u001fA\bN4\u0019y\u0010+\u001fa8~;!GAnx\u0016\u001c ", (short) (OY.Xd() ^ 7475), (short) (OY.Xd() ^ 27897))).getMethod(C1626yg.Ud("`9o\u0005Xk\u0001\fY%'M{i", (short) (C1633zX.Xd() ^ (-30633)), (short) (C1633zX.Xd() ^ (-23759))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            PackageInfo packageInfo = packageManagerWrapperPackageManager.getPackageInfo((String) method2.invoke(contextZza, objArr2), 64);
                            if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                                return zza(messageDigestZzu.digest(packageInfo.signatures[0].toByteArray()));
                            }
                            zzj().zzu().zza(Ig.wd("aEy\b\t\b:\u0013]$m\u000en\u0010+\u0003<Ys~EuJT", (short) (C1580rY.Xd() ^ (-12749))));
                            return -1L;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    zzj().zzg().zza(EO.Od("\u0005h4\u0016tPd8J\u000b\u000fnxKJ78j-]\u001a9", (short) (ZN.Xd() ^ 3087)), e3);
                }
            }
            return 0L;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    final Bundle zza(Uri uri, boolean z2) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z2 ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z2 || TextUtils.isEmpty(queryParameter5)) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z2 && !TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (z2 && !TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString(FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString(FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString(FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            zzj().zzu().zza("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    final Bundle zza(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objZzb = zzb(str2, bundle.get(str2));
                if (objZzb == null) {
                    zzj().zzv().zza("Param value can't be null", zzi().zzb(str2));
                } else {
                    zza(bundle2, str2, objZzb);
                }
            }
        }
        return bundle2;
    }

    final Bundle zza(String str, String str2, Bundle bundle, List<String> list, boolean z2) {
        int iZzl;
        zzos zzosVar = this;
        boolean zZza = zza(str2, zzji.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int iZzc = zze().zzc();
        int i2 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iZzl = !z2 ? zzosVar.zzl(str3) : 0;
                if (iZzl == 0) {
                    iZzl = zzosVar.zzk(str3);
                }
            } else {
                iZzl = 0;
            }
            if (iZzl != 0) {
                zza(bundle2, iZzl, str3, iZzl == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iZza = zza(str, str2, str3, bundle.get(str3), bundle2, list, z2, zZza);
                if (iZza == 17) {
                    zza(bundle2, iZza, str3, (Object) false);
                } else if (iZza != 0 && !"_ev".equals(str3)) {
                    zza(bundle2, iZza, iZza == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (zzh(str3) && (i2 = i2 + 1) > iZzc) {
                    zzj().zzm().zza("Event can't contain more than " + iZzc + " params", zzi().zza(str2), zzi().zza(bundle));
                    zzb(bundle2, 5);
                    bundle2.remove(str3);
                }
            }
            zzosVar = this;
        }
        return bundle2;
    }

    final zzbf zza(String str, String str2, Bundle bundle, String str3, long j2, boolean z2, boolean z3) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zza(str2) != 0) {
            zzj().zzg().zza("Invalid conditional property event name", zzi().zzc(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleZza = zza(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z2) {
            bundleZza = zza(bundleZza, str);
        }
        Preconditions.checkNotNull(bundleZza);
        return new zzbf(str2, new zzbe(bundleZza), str3, j2);
    }

    public final URL zza(long j2, String str, String str2, long j3, String str3) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j2), Integer.valueOf(zzg())), str2, str, Long.valueOf(j3));
            if (str.equals(zze().zzp())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            zzj().zzg().zza("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    final void zza(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            zzj().zzu().zza("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    final void zza(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                zzq().zza(bundle, str, bundle2.get(str));
            }
        }
    }

    final void zza(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            zzj().zzv().zza("Not putting event parameter. Invalid value type. name, type", zzi().zzb(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning int value to wrapper", e2);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning long value to wrapper", e2);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, Bundle bundle) {
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning bundle value to wrapper", e2);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning string value to wrapper", e2);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning bundle list to wrapper", e2);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z2);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning boolean value to wrapper", e2);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzdoVar.zza(bundle);
        } catch (RemoteException e2) {
            this.zzu.zzj().zzu().zza("Error returning byte array to wrapper", e2);
        }
    }

    final void zza(zzgs zzgsVar, int i2) {
        int i3 = 0;
        for (String str : new TreeSet(zzgsVar.zzc.keySet())) {
            if (zzh(str) && (i3 = i3 + 1) > i2) {
                zzj().zzm().zza("Event can't contain more than " + i2 + " params", zzi().zza(zzgsVar.zza), zzi().zza(zzgsVar.zzc));
                zzb(zzgsVar.zzc, 5);
                zzgsVar.zzc.remove(str);
            }
        }
    }

    final void zza(Parcelable[] parcelableArr, int i2) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i3 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (zzh(str) && !zza(str, zzjk.zzd) && (i3 = i3 + 1) > i2) {
                    zzj().zzm().zza("Param can't contain more than " + i2 + " item-scoped custom parameters", zzi().zzb(str), zzi().zza(bundle));
                    zzb(bundle, 28);
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean zza(int i2, boolean z2) {
        Boolean boolZzab = this.zzu.zzr().zzab();
        if (zzg() < i2 / 1000) {
            return (boolZzab == null || boolZzab.booleanValue()) ? false : true;
        }
        return true;
    }

    final boolean zza(String str, double d2) throws Throwable {
        try {
            Context contextZza = zza();
            String strQd = C1561oA.Qd("=DC:>6}0<.8D>2+:s)))'32$\"j  \u001f)$ $ a#$\u0016\u0016\"", (short) (C1499aX.Xd() ^ (-4787)));
            short sXd = (short) (C1633zX.Xd() ^ (-25506));
            short sXd2 = (short) (C1633zX.Xd() ^ (-23152));
            int[] iArr = new int["^lcrpkg2huu|nx\u007f:P}}\u0005v\u000b\b".length()];
            QB qb = new QB("^lcrpkg2huu|nx\u007f:P}}\u0005v\u000b\b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.od("\u000b\u0001\u0015~J\b{\b\u007fEi\n\u0007|\u0001x", (short) (C1499aX.Xd() ^ (-12755))));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {strQd, 0};
            Method method = cls.getMethod(C1561oA.Kd("\u0010\u000f\u001f~\u0015\u000f!\u0015\u0015\u0002%\u0019\u001b\u001b)\u001d'\u001d /", (short) (C1580rY.Xd() ^ (-13775))), clsArr);
            try {
                method.setAccessible(true);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(contextZza, objArr)).edit();
                editorEdit.putString(Wg.Zd("@4\u001d\u0019}kYG", (short) (Od.Xd() ^ (-21773)), (short) (Od.Xd() ^ (-21167))), str);
                editorEdit.putLong(C1561oA.Xd("aW\\UdfTae", (short) (C1607wl.Xd() ^ 24203)), Double.doubleToRawLongBits(d2));
                return editorEdit.commit();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (RuntimeException e3) {
            zzj().zzg().zza(Wg.vd("A[bd\\Z\u0015hr\"qeqqfo_\n-MMKWVXV\u00114TS]\fg\u0004\b\u0004E6z\r\u0007\b\u0012\u0015\t\u000e\f", (short) (C1580rY.Xd() ^ (-31159))), e3);
            return false;
        }
    }

    final boolean zza(String str, int i2, String str2) {
        if (str2 == null) {
            zzj().zzm().zza("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        }
        zzj().zzm().zza("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
        return false;
    }

    final boolean zza(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzn(str)) {
                return true;
            }
            if (this.zzu.zzae()) {
                zzj().zzm().zza("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzgo.zza(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.zzu.zzae()) {
                zzj().zzm().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (zzn(str2)) {
            return true;
        }
        zzj().zzm().zza("Invalid admob_app_id. Analytics disabled.", zzgo.zza(str2));
        return false;
    }

    final boolean zza(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i2) {
                zzj().zzv().zza("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    final boolean zza(String str, String[] strArr, String str2) {
        return zza(str, strArr, (String[]) null, str2);
    }

    final boolean zza(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            zzj().zzm().zza("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        for (String str3 : zza) {
            if (str2.startsWith(str3)) {
                zzj().zzm().zza("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zza(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zza(str2, strArr2)) {
            return true;
        }
        zzj().zzm().zza("Name is reserved. Type, name", str, str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    protected final void zzaa() throws Throwable {
        zzt();
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Qg.kd("_UiS\u001fcTQb^T^b\u0016:KHYUG3AMBLI", (short) (C1580rY.Xd() ^ (-30124)), (short) (C1580rY.Xd() ^ (-25878)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            long jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                jNextLong = secureRandom.nextLong();
                if (jNextLong == 0) {
                    zzj().zzu().zza(hg.Vd("=[OQW\u0003HBLKGKCz<:;BuICr$2>3=:k19;g9'3(2/`)#", (short) (Od.Xd() ^ (-15641)), (short) (Od.Xd() ^ (-15293))));
                }
            }
            this.zzd.set(jNextLong);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    final int zzb(String str) {
        if (!zzb("user property", str)) {
            return 6;
        }
        if (zza("user property", zzjj.zza, str)) {
            return !zza("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    final Object zzb(String str, Object obj) {
        if ("_ev".equals(str)) {
            return zza(zze().zzb((String) null, false), obj, true, true, (String) null);
        }
        return zza(zzg(str) ? zze().zzb((String) null, false) : zze().zza((String) null, false), obj, false, true, (String) null);
    }

    final boolean zzb(String str, String str2) {
        if (str2 == null) {
            zzj().zzm().zza("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().zzm().zza("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            zzj().zzm().zza("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzj().zzm().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final long zzc(String str) throws Throwable {
        Object obj;
        Context contextZza = zza();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u000b\u0016\u0014\u0019\t\u0011\u0016Nb\u000e\f\u0011\u0001\u0013\u000e", (short) (C1580rY.Xd() ^ (-29841)))).getMethod(C1561oA.yd("\u000b\b\u001at\t\n\u0015\n\u0013\u0010z\u000e\u001e\u0010\u0019\u0016\u0006", (short) (Od.Xd() ^ (-9020))), new Class[0]);
        try {
            method.setAccessible(true);
            if (((PackageManager) method.invoke(contextZza, objArr)) == null) {
                return 0L;
            }
            int iIntValue = 0;
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(zza()).getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    String strYd = C1561oA.Yd("|\u000b\u0002\u0011\u000f\n\u0006P\u0007\u0014\u0014\u001b\r\u0017\u001eX\u001c\u001a[o !\u001e\u001c\u0017\u0016* ''\u0003)\",", (short) (C1607wl.Xd() ^ 7860));
                    String strQd = Xg.qd("5#5+*:\u001a,4 0>@7>>", (short) (C1607wl.Xd() ^ 5404), (short) (C1607wl.Xd() ^ 5714));
                    try {
                        Class<?> cls = Class.forName(strYd);
                        Field field = 1 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
                        field.setAccessible(true);
                        obj = field.get(applicationInfo);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    iIntValue = ((Integer) obj).intValue();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                zzj().zzo().zza(Jg.Wd("\\\u000e0Xf\u0011+?\u00041<b\u0001\u001acNQy\u001d6]=.E&\rX}\u0014kZ\u0002\u00133No\u0005a?Z\u000btrX\u00040;il", (short) (ZN.Xd() ^ 13318), (short) (ZN.Xd() ^ 7761)), str);
            }
            return iIntValue;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    final Object zzc(String str, Object obj) {
        return "_ldl".equals(str) ? zza(zzm(str), obj, true, false, (String) null) : zza(zzm(str), obj, false, false, (String) null);
    }

    final boolean zzc(String str, String str2) {
        if (str2 == null) {
            zzj().zzm().zza("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().zzm().zza("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            zzj().zzm().zza("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzj().zzm().zza("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    final boolean zzd(String str, String str2) {
        if (zzpu.zza() && zze().zza(zzbh.zzby) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return zze().zzo().equals(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    final boolean zze(String str) {
        zzt();
        if (Wrappers.packageManager(zza()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzj().zzc().zza("Permission not granted", str);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @InterfaceC1492Gx
    @EnsuresNonNull({"\u007f.a\u0003\\kV!Y\u0018+\n-=`"})
    public final int zzg() {
        if (this.zzh == null) {
            this.zzh = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(zza()) / 1000);
        }
        return this.zzh.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    protected final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    public final boolean zzi(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Context contextZza = zza();
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("q\b8)Fa:f\u000f\u0018cG@+R4~3\u0004IU`\u0007", (short) (C1499aX.Xd() ^ (-22531)), (short) (C1499aX.Xd() ^ (-26889)))).getMethod(C1626yg.Ud("Larm>AR\u007fwTr\u0007\"B}1I", (short) (Od.Xd() ^ (-24851)), (short) (Od.Xd() ^ (-455))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(contextZza, objArr);
            Intent intent = new Intent(Ig.wd("@$gNR~.\u007f\u0010QY,\u0006\u0012Si6-z\tLP*\u0019:\u0011", (short) (OY.Xd() ^ 20802)), Uri.parse(str));
            Class<?> cls = Class.forName(EO.Od(")fJ5a(K\u001d\u0011\u000e\u0007r\u000e\u0015GcRYBP F<.r!'\u0010'Hv\u0017D", (short) (C1607wl.Xd() ^ 18622)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1633zX.Xd() ^ (-14755));
            int[] iArr = new int["iujwslf/cnlqain'AejZbg".length()];
            QB qb = new QB("iujwslf/cnlqain'AejZbg");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Integer.TYPE;
            Object[] objArr2 = {intent, 0};
            Method method2 = cls.getMethod(C1593ug.zd("\u0014\u0019\n\u0018 p\u0017\u001e\u0010\u001a!n\u0012$\u001a(\u001c(\u001e\u001b*", (short) (C1580rY.Xd() ^ (-3585)), (short) (C1580rY.Xd() ^ (-1975))), clsArr);
            try {
                method2.setAccessible(true);
                List list = (List) method2.invoke(packageManager, objArr2);
                return (list == null || list.isEmpty()) ? false : true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    final long zzm() {
        zzt();
        if (!zzd(this.zzu.zzh().zzad())) {
            return 0L;
        }
        long j2 = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : zzc() < zzbh.zzax.zza(null).intValue() ? 16L : 0L;
        if (!zze("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j2 |= 2;
        }
        if (j2 == 0 && !zzy()) {
            j2 |= 64;
        }
        if (j2 == 0) {
            return 1L;
        }
        return j2;
    }

    public final long zzn() {
        long andIncrement;
        long j2;
        if (this.zzd.get() != 0) {
            synchronized (this.zzd) {
                this.zzd.compareAndSet(-1L, 1L);
                andIncrement = this.zzd.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zzd) {
            long jNextLong = new Random(System.nanoTime() ^ zzb().currentTimeMillis()).nextLong();
            int i2 = this.zze + 1;
            this.zze = i2;
            j2 = jNextLong + ((long) i2);
        }
        return j2;
    }

    final MeasurementManagerFutures zzo() {
        if (this.zzf == null) {
            this.zzf = MeasurementManagerFutures.from(zza());
        }
        return this.zzf;
    }

    final String zzp() throws Throwable {
        byte[] bArr = new byte[16];
        SecureRandom secureRandomZzv = zzv();
        Object[] objArr = {bArr};
        Method method = Class.forName(C1561oA.od("7-A+v;,):6,6:m\u0012# 1-\u001f\u000b\u0019%\u001a$!", (short) (C1499aX.Xd() ^ (-7928)))).getMethod(C1561oA.Kd(";3GD\u0013KG9H", (short) (C1580rY.Xd() ^ (-21949))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandomZzv, objArr);
            Locale locale = Locale.US;
            Object[] objArr2 = {new BigInteger(1, bArr)};
            short sXd = (short) (FB.Xd() ^ 31060);
            short sXd2 = (short) (FB.Xd() ^ 8013);
            int[] iArr = new int["\u0011I'\u0002#".length()];
            QB qb = new QB("\u0011I'\u0002#");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            return String.format(locale, new String(iArr, 0, i2), objArr2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @InterfaceC1492Gx
    @EnsuresNonNull({"\u007f.a\u0003\\}K\u0019x%\u001eh%<V?t"})
    final SecureRandom zzv() {
        zzt();
        if (this.zzc == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1561oA.Xd("\u0017\u000f%\u0011^%\u0018\u0017*( ,2g\u000e! 31%\u0013#1(43", (short) (OY.Xd() ^ 8371))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.zzc = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return this.zzc;
    }

    final boolean zzw() {
        zzt();
        return zzm() == 1;
    }

    public final boolean zzx() throws Throwable {
        try {
            Context contextZza = zza();
            short sXd = (short) (FB.Xd() ^ 678);
            int[] iArr = new int["o}p\u007f\u0002|t?ivryoy|7a\u000f\u000b\u0012\b\u001c\u0015".length()];
            QB qb = new QB("o}p\u007f\u0002|t?ivryoy|7a\u000f\u000b\u0012\b\u001c\u0015");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (FB.Xd() ^ 26836);
            short sXd3 = (short) (FB.Xd() ^ 21450);
            int[] iArr2 = new int["dao=eYjiAcTVVb".length()];
            QB qb2 = new QB("dao=eYjiAcTVVb");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                ((ClassLoader) method.invoke(contextZza, objArr)).loadClass(hg.Vd("u\u0001}=u|{rvn6mowiecte-pbijn^[fd[]Z 7YaSOM^O;MTUYI&QOFHE", (short) (C1633zX.Xd() ^ (-23014)), (short) (C1633zX.Xd() ^ (-26288))));
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
