package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.appsflyer.AppsFlyerProperties;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import io.sentry.protocol.App;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class zzaf {
    private PendingIntent zzaf;
    private Messenger zzaj;
    private Map<String, Object> zzcz = new ArrayMap();
    private Messenger zzda;
    private MessengerCompat zzdb;
    private Context zzl;
    private static final zzaj<Boolean> zzct = zzai.zzy().zzd("gcm_iid_use_messenger_ipc", true);
    private static String zzcu = null;
    private static boolean zzcv = false;
    private static int zzcw = 0;
    private static int zzcx = 0;
    private static int zzcp = 0;
    private static BroadcastReceiver zzcy = null;

    public zzaf(Context context) {
        this.zzl = context;
    }

    private static void zzd(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message messageObtain = Message.obtain();
            messageObtain.obj = obj2;
            try {
                messenger.send(messageObtain);
            } catch (RemoteException e2) {
                String strValueOf = String.valueOf(e2);
                new StringBuilder(String.valueOf(strValueOf).length() + 24).append("Failed to send response ").append(strValueOf).toString();
            }
        }
    }

    private final void zzd(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.zzcz.get(str);
            this.zzcz.put(str, obj);
            zzd(obj2, obj);
        }
    }

    private static boolean zzd(PackageManager packageManager, String str) throws Throwable {
        Object obj;
        try {
            Class<?> cls = Class.forName(Ig.wd("\u0018Tz.y7\u001c+2ORt;40\u0005+0\u0016~Q|h`X(o/$fV2-", (short) (OY.Xd() ^ 31416)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(EO.Od("\u0012a:\u0005H\\e\nFp\f\u0013`Y.\r", (short) (C1607wl.Xd() ^ 26213)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str, 0};
            short sXd = (short) (Od.Xd() ^ (-15590));
            int[] iArr = new int["jguAonie^[mafd>bYa".length()];
            QB qb = new QB("jguAonie^[mafd>bYa");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(packageManager, objArr);
                zzcu = applicationInfo.packageName;
                String strZd = C1593ug.zd("2@7FD?;\u0006<IIPBLS\u000eQO\u0011%UVSQLK_U\\\\8^Wa", (short) (C1633zX.Xd() ^ (-14308)), (short) (C1633zX.Xd() ^ (-7664)));
                String strOd = C1561oA.od("$\u0017\u0011", (short) (OY.Xd() ^ 9702));
                try {
                    Class<?> cls2 = Class.forName(strZd);
                    Field field = 1 != 0 ? cls2.getField(strOd) : cls2.getDeclaredField(strOd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                zzcx = ((Integer) obj).intValue();
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static boolean zzd(PackageManager packageManager, String str, String str2) throws Throwable {
        String strKd = C1561oA.Kd("Xed&`ijcic-aofusnj5k;nx:}s\u0002}z\u0006\u0007}\u0005\u0005Ek^h_", (short) (OY.Xd() ^ 24591));
        Class<?> cls = Class.forName(Wg.Zd("#Ys\u000b00RB^\u0015\u0018C`n\u0019\\f\nQ\u001a3^\u000b\n\u0018\u001c+ey\u0017!D}", (short) (C1499aX.Xd() ^ (-126)), (short) (C1499aX.Xd() ^ (-13394))));
        Class<?>[] clsArr = new Class[2];
        clsArr[0] = Class.forName(C1561oA.Xd("h`vb0oesm5[}|tzt", (short) (C1499aX.Xd() ^ (-5642))));
        short sXd = (short) (C1607wl.Xd() ^ 31414);
        int[] iArr = new int["* 4\u001eq/#//t\u00199>480".length()];
        QB qb = new QB("* 4\u001eq/#//t\u00199>480");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[1] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strKd, str};
        Method method = cls.getMethod(Qg.kd("\u0015\u0019\u0015\u0012\u0019|\u0011\u001d\u0017\u0012\u001b\u001a\u000f\u0014\u0012", (short) (OY.Xd() ^ 21782), (short) (OY.Xd() ^ 6086)), clsArr);
        try {
            method.setAccessible(true);
            if (((Integer) method.invoke(packageManager, objArr)).intValue() == 0) {
                return zzd(packageManager, str);
            }
            StringBuilder sbAppend = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(str2).length()).append(hg.Vd(",JMLA9B:s@3=927<A>i9)*1&+(a", (short) (OY.Xd() ^ 10708), (short) (OY.Xd() ^ 20635))).append(str);
            short sXd2 = (short) (C1580rY.Xd() ^ (-8605));
            int[] iArr2 = new int["2uurzn~p})".length()];
            QB qb2 = new QB("2uurzn~p})");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            StringBuilder sbAppend2 = sbAppend.append(new String(iArr2, 0, i3)).append(str2);
            short sXd3 = (short) (ZN.Xd() ^ 19539);
            int[] iArr3 = new int["*\u0001q{v|\u0002\u007f2\u0002u\u0002\u0004~\b\u0007\u0004\t\u0007".length()];
            QB qb3 = new QB("*\u0001q{v|\u0002\u007f2\u0002u\u0002\u0004~\b\u0007\u0004\t\u0007");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 ^ i4));
                i4++;
            }
            sbAppend2.append(new String(iArr3, 0, i4)).toString();
            C1561oA.Yd("Bhnp^lbeJF", (short) (FB.Xd() ^ 6409));
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final synchronized void zzg(Intent intent) {
        if (this.zzaf == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.zzaf = PendingIntent.getBroadcast(this.zzl, 0, intent2, 0);
        }
        intent.putExtra(App.TYPE, this.zzaf);
    }

    static String zzi(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE);
        }
        String string = bundle.getString("registration_id");
        if (string == null) {
            string = bundle.getString("unregistered");
        }
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if (string2 != null) {
            throw new IOException(string2);
        }
        String strValueOf = String.valueOf(bundle);
        new StringBuilder(String.valueOf(strValueOf).length() + 29).append("Unexpected response from GCM ").append(strValueOf).toString();
        new Throwable();
        throw new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE);
    }

    private final Bundle zzj(Bundle bundle) throws Throwable {
        Bundle bundleZzk = zzk(bundle);
        if (bundleZzk == null || !bundleZzk.containsKey("google.messenger")) {
            return bundleZzk;
        }
        Bundle bundleZzk2 = zzk(bundle);
        if (bundleZzk2 == null || !bundleZzk2.containsKey("google.messenger")) {
            return bundleZzk2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x063a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.os.Bundle zzk(android.os.Bundle r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzaf.zzk(android.os.Bundle):android.os.Bundle");
    }

    public static boolean zzk(Context context) throws Throwable {
        if (zzcu != null) {
            zzl(context);
        }
        return zzcv;
    }

    public static String zzl(Context context) throws Throwable {
        String str = zzcu;
        if (str != null) {
            return str;
        }
        zzcw = Process.myUid();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("$2%4.)!k.;7>,69su#\u001f&\u0014(!", (short) (C1633zX.Xd() ^ (-12707)))).getMethod(C1561oA.Yd("vu\u0006btw\u0001w~}f{\n}\u0005\u0004\u0012", (short) (Od.Xd() ^ (-23177))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            if (!PlatformVersion.isAtLeastO()) {
                short sXd = (short) (OY.Xd() ^ 10429);
                short sXd2 = (short) (OY.Xd() ^ 25982);
                int[] iArr = new int["\u0007\u0014\u0013T\u000f\u0018\u0019\u0012\u0018\u0012[\u0010\u001e\u0015$\"\u001d\u0019c\u001ai\u001d'h%+2$.5o\u0015\t\f\u000f\u001a\u001c\u000e\u001c".length()];
                QB qb = new QB("\u0007\u0014\u0013T\u000f\u0018\u0019\u0012\u0018\u0012[\u0010\u001e\u0015$\"\u001d\u0019c\u001ai\u001d'h%+2$.5o\u0015\t\f\u000f\u001a\u001c\u000e\u001c");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                    i2++;
                }
                String str2 = new String(iArr, 0, i2);
                Object[] objArr2 = {new Intent(str2), 0};
                Method method2 = Class.forName(Jg.Wd("\u0002,an+d!\n^*h,<d\n#'C#dUt\u001c1vT]\u0011=o5p\u001d", (short) (C1607wl.Xd() ^ 23509), (short) (C1607wl.Xd() ^ 24723))).getMethod(C1626yg.Ud("FQ>R#rv\n\u0014-G\u0010]\u001bG6\n\u0015:", (short) (FB.Xd() ^ 25487), (short) (FB.Xd() ^ 15253)), Class.forName(ZO.xd("\u0019\u0018\u000f/YmI\u0016Sq/)6\b\u000euJ\u001cT6\u0002\u0013", (short) (ZN.Xd() ^ 10745), (short) (ZN.Xd() ^ 27019))), Integer.TYPE);
                try {
                    method2.setAccessible(true);
                    Iterator it = ((List) method2.invoke(packageManager, objArr2)).iterator();
                    while (it.hasNext()) {
                        if (zzd(packageManager, ((ResolveInfo) it.next()).serviceInfo.packageName, str2)) {
                            zzcv = false;
                            return zzcu;
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            String strWd = Ig.wd("b=\r)\"eu%SL\u00130ej ,zt6rM\u001chpN\u001e\u000eZ", (short) (C1633zX.Xd() ^ (-10449)));
            Object[] objArr3 = {new Intent(strWd), 0};
            Method method3 = Class.forName(EO.Od("?|%RO'}\u0007\u0018'$H\t\u001c\u001apXg_\nV\u0004*\u001cMox2quH%\n", (short) (Od.Xd() ^ (-29820)))).getMethod(C1593ug.zd("\u0006\u000b{\n\u0012[\r\u000b}\u0002\u0002\u0001\u0014\u0016t\t\b\u000b\u0010\u001e\u000e\u001c\u001e", (short) (ZN.Xd() ^ 11969), (short) (ZN.Xd() ^ 12756)), Class.forName(C1561oA.Qd("\r\u0019\u000e\u001b\u0017\u0010\nR\u0007\u0012\u0010\u0015\u0005\r\u0012Jd\t\u000e}\u0006\u000b", (short) (Od.Xd() ^ (-7835)))), Integer.TYPE);
            try {
                method3.setAccessible(true);
                Iterator it2 = ((List) method3.invoke(packageManager, objArr3)).iterator();
                while (it2.hasNext()) {
                    if (zzd(packageManager, ((ResolveInfo) it2.next()).activityInfo.packageName, strWd)) {
                        zzcv = true;
                        return zzcu;
                    }
                }
                C1561oA.od("\u00193:<42l@:i;-:51:(a\n\t\u0003]&)+&\u001e%\u001c$)\u0015'\u001b \u001eN\u001e\u000e\u000f\u0016\u000b\u0010\rRE\u000b\u0005\u000f\u000e\n\u000e\u0006=~|}\u0005", (short) (ZN.Xd() ^ 28228));
                C1561oA.Kd("\u0016<BD2@69\u001e\u001a", (short) (Od.Xd() ^ (-10152)));
                short sXd3 = (short) (C1580rY.Xd() ^ (-16625));
                short sXd4 = (short) (C1580rY.Xd() ^ (-15772));
                int[] iArr2 = new int["J\by{\u0004?!(p[3IH\u000e\u001fM\u0007to)\u0001y".length()];
                QB qb2 = new QB("J\by{\u0004?!(p[3IH\u000e\u001fM\u0007to)\u0001y");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((i3 * sXd4) ^ sXd3) + xuXd2.CK(iKK2));
                    i3++;
                }
                if (zzd(packageManager, new String(iArr2, 0, i3))) {
                    zzcv = PlatformVersion.isAtLeastO();
                    return zzcu;
                }
                if (PlatformVersion.isAtLeastLollipop() || !zzd(packageManager, C1561oA.Xd("8ED\u0006@IJCIC\rAOFUSNJ\u0015O\\P", (short) (C1499aX.Xd() ^ (-3732))))) {
                    Wg.vd("9bc\\b\\\u0018If\\u\u001dqdrwkfix&p{)wt\u007f\u0001w}w=qHB68C=xNJ{DCS\u007fUQNISY", (short) (FB.Xd() ^ 6572));
                    return null;
                }
                zzcv = false;
                return zzcu;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private static int zzm(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("LXMZVOI\u0012FQOTDLQ\n\u001eIGL<NI", (short) (Od.Xd() ^ (-18778)), (short) (Od.Xd() ^ (-22148)))).getMethod(hg.Vd("!\u001e,\u0007\u0017\u0018\u001f\u0014\u0019\u0016|\u0010\u001c\u000e\u0013\u0010\u001c", (short) (C1607wl.Xd() ^ 6645), (short) (C1607wl.Xd() ^ 5081)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            try {
                String strZzl = zzl(context);
                Class<?> cls = Class.forName(C1561oA.ud("lxmzvoi2fqotdlq*kg'HXY`UZW>Q]OTQ]", (short) (C1633zX.Xd() ^ (-18473))));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.yd("3)='r0$0(m\u00122/%)!", (short) (FB.Xd() ^ 8988)));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {strZzl, 0};
                short sXd = (short) (C1633zX.Xd() ^ (-28504));
                int[] iArr = new int["UTdASV_V]\\Ag`j".length()];
                QB qb = new QB("UTdASV_V]\\Ag`j");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    return ((PackageInfo) method2.invoke(packageManager, objArr2)).versionCode;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return -1;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static synchronized String zzx() {
        int i2;
        i2 = zzcp;
        zzcp = i2 + 1;
        return Integer.toString(i2);
    }

    final Bundle zzd(Bundle bundle, KeyPair keyPair) throws Throwable {
        int iZzm = zzm(this.zzl);
        bundle.putString("gmsv", Integer.toString(iZzm));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(InstanceID.zzg(this.zzl)));
        bundle.putString("app_ver_name", InstanceID.zzh(this.zzl));
        bundle.putString("cliv", "iid-12451000");
        bundle.putString(AppsFlyerProperties.APP_ID, InstanceID.zzd(keyPair));
        if (iZzm < 12000000 || !zzct.get().booleanValue()) {
            return zzj(bundle);
        }
        try {
            return (Bundle) Tasks.await(new zzr(this.zzl).zzd(1, bundle));
        } catch (InterruptedException | ExecutionException e2) {
            if (Log.isLoggable("InstanceID", 3)) {
                String strValueOf = String.valueOf(e2);
                new StringBuilder(String.valueOf(strValueOf).length() + 22).append("Error making request: ").append(strValueOf).toString();
            }
            if ((e2.getCause() instanceof zzaa) && ((zzaa) e2.getCause()).getErrorCode() == 4) {
                return zzj(bundle);
            }
            return null;
        }
    }

    public final void zze(Message message) {
        if (message != null && (message.obj instanceof Intent)) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof MessengerCompat) {
                    this.zzdb = (MessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    this.zzda = (Messenger) parcelableExtra;
                }
            }
            zzh((Intent) message.obj);
        }
    }

    public final void zzh(Intent intent) {
        if (intent == null) {
            if (Log.isLoggable("InstanceID", 3)) {
                return;
            } else {
                return;
            }
        }
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action) && !"com.google.android.gms.iid.InstanceID".equals(action)) {
            if (Log.isLoggable("InstanceID", 3)) {
                String strValueOf = String.valueOf(intent.getAction());
                if (strValueOf.length() != 0) {
                    "Unexpected response ".concat(strValueOf);
                    return;
                } else {
                    new String("Unexpected response ");
                    return;
                }
            }
            return;
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                Bundle extras = intent.getExtras();
                extras.putString("registration_id", strGroup2);
                zzd(strGroup, (Object) extras);
                return;
            }
            if (Log.isLoggable("InstanceID", 3)) {
                String strValueOf2 = String.valueOf(stringExtra);
                if (strValueOf2.length() != 0) {
                    "Unexpected response string: ".concat(strValueOf2);
                    return;
                } else {
                    new String("Unexpected response string: ");
                    return;
                }
            }
            return;
        }
        String stringExtra2 = intent.getStringExtra("error");
        if (stringExtra2 == null) {
            String strValueOf3 = String.valueOf(intent.getExtras());
            new StringBuilder(String.valueOf(strValueOf3).length() + 49).append("Unexpected response, no error or registration id ").append(strValueOf3).toString();
            return;
        }
        if (Log.isLoggable("InstanceID", 3)) {
            String strValueOf4 = String.valueOf(stringExtra2);
            if (strValueOf4.length() != 0) {
                "Received InstanceID error ".concat(strValueOf4);
            } else {
                new String("Received InstanceID error ");
            }
        }
        String str = null;
        if (stringExtra2.startsWith("|")) {
            String[] strArrSplit = stringExtra2.split("\\|");
            if (!"ID".equals(strArrSplit[1])) {
                String strValueOf5 = String.valueOf(stringExtra2);
                if (strValueOf5.length() != 0) {
                    "Unexpected structured response ".concat(strValueOf5);
                } else {
                    new String("Unexpected structured response ");
                }
            }
            if (strArrSplit.length > 2) {
                str = strArrSplit[2];
                stringExtra2 = strArrSplit[3];
                if (stringExtra2.startsWith(Global.COLON)) {
                    stringExtra2 = stringExtra2.substring(1);
                }
            } else {
                stringExtra2 = "UNKNOWN";
            }
            intent.putExtra("error", stringExtra2);
        }
        if (str != null) {
            zzd(str, (Object) stringExtra2);
            return;
        }
        synchronized (getClass()) {
            for (String str2 : this.zzcz.keySet()) {
                Object obj = this.zzcz.get(str2);
                this.zzcz.put(str2, stringExtra2);
                zzd(obj, stringExtra2);
            }
        }
    }
}
