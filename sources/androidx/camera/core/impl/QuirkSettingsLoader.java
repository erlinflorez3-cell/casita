package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import androidx.arch.core.util.Function;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.QuirkSettings;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
public class QuirkSettingsLoader implements Function<Context, QuirkSettings> {
    public static final String KEY_DEFAULT_QUIRK_ENABLED = "androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED";
    public static final String KEY_QUIRK_FORCE_DISABLED = "androidx.camera.core.quirks.FORCE_DISABLED";
    public static final String KEY_QUIRK_FORCE_ENABLED = "androidx.camera.core.quirks.FORCE_ENABLED";
    private static final String TAG = "QuirkSettingsLoader";

    @Override // androidx.arch.core.util.Function
    public QuirkSettings apply(Context context) throws Throwable {
        short sXd = (short) (OY.Xd() ^ 20782);
        short sXd2 = (short) (OY.Xd() ^ 9420);
        int[] iArr = new int["Y|owoVguthldoGiZ\\\\h".length()];
        QB qb = new QB("Y|owoVguthldoGiZ\\\\h");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("lxmzvoi2fqotdlq*>igl\\ni", (short) (Od.Xd() ^ (-15100)))).getMethod(C1561oA.yd("cbrOadmdkjShvjqp^", (short) (C1580rY.Xd() ^ (-12719))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            try {
                ComponentName componentName = new ComponentName(context, (Class<?>) MetadataHolderService.class);
                short sXd3 = (short) (OY.Xd() ^ 8586);
                int[] iArr2 = new int["\u0002\u0010\u0007\u0016\u0014\u000f\u000bU\f\u0019\u0019 \u0012\u001c#]!\u001f`\u0004\u0016\u0019\"\u0019 \u001f\b\u001d+\u001f&%3".length()];
                QB qb2 = new QB("\u0002\u0010\u0007\u0016\u0014\u000f\u000bU\f\u0019\u0019 \u0012\u001c#]!\u001f`\u0004\u0016\u0019\"\u0019 \u001f\b\u001d+\u001f&%3");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = new Class[2];
                short sXd4 = (short) (C1607wl.Xd() ^ 28856);
                short sXd5 = (short) (C1607wl.Xd() ^ 16658);
                int[] iArr3 = new int["\u001d+\"1/*&p'44;-7>x\u000f<;???7AH#7D=".length()];
                QB qb3 = new QB("\u001d+\"1/*&p'44;-7>x\u000f<;???7AH#7D=");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) + sXd5);
                    i4++;
                }
                clsArr[0] = Class.forName(new String(iArr3, 0, i4));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {componentName, Integer.valueOf(OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE)};
                Method method2 = cls.getMethod(Jg.Wd("C+x\u0014d^\u00010h7x9q%", (short) (C1607wl.Xd() ^ 17521), (short) (C1607wl.Xd() ^ 12060)), clsArr);
                try {
                    method2.setAccessible(true);
                    Bundle bundle = ((ServiceInfo) method2.invoke(packageManager, objArr2)).metaData;
                    if (bundle == null) {
                        Logger.w(str, ZO.xd("I!\r\u0014\u0018$$p;v-%D~+fQ/\u007f\r\u001dnx\u0010i\u0017+x<Mo{P~\u0004Wa", (short) (Od.Xd() ^ (-26315)), (short) (Od.Xd() ^ (-28679))));
                        return null;
                    }
                    return buildQuirkSettings(context, bundle);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                short sXd6 = (short) (C1580rY.Xd() ^ (-24253));
                short sXd7 = (short) (C1580rY.Xd() ^ (-14048));
                int[] iArr4 = new int["`-\u0014w4h)G\u0019W{I\u0019]\u0005~f]\u001bE\u001a2KoP8\u001aU\"W\u0014.+<UfVw2\u0014\u0014=\u001d\\I\u00109{F".length()];
                QB qb4 = new QB("`-\u0014w4h)G\u0019W{I\u0019]\u0005~f]\u001bE\u001a2KoP8\u001aU\"W\u0014.+<UfVw2\u0014\u0014=\u001d\\I\u00109{F");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i5 * sXd7))) + xuXd4.CK(iKK4));
                    i5++;
                }
                Logger.d(str, new String(iArr4, 0, i5));
                return null;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static QuirkSettings buildQuirkSettings(Context context, Bundle bundle) throws Throwable {
        boolean z2 = bundle.getBoolean(KEY_DEFAULT_QUIRK_ENABLED, true);
        String[] strArrLoadQuirks = loadQuirks(context, bundle, KEY_QUIRK_FORCE_ENABLED);
        String[] strArrLoadQuirks2 = loadQuirks(context, bundle, KEY_QUIRK_FORCE_DISABLED);
        Logger.d(TAG, "Loaded quirk settings from metadata:");
        Logger.d(TAG, "  KEY_DEFAULT_QUIRK_ENABLED = " + z2);
        Logger.d(TAG, "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrLoadQuirks));
        Logger.d(TAG, "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrLoadQuirks2));
        return new QuirkSettings.Builder().setEnabledWhenDeviceHasQuirk(z2).forceEnableQuirks(resolveQuirkNames(strArrLoadQuirks)).forceDisableQuirks(resolveQuirkNames(strArrLoadQuirks2)).build();
    }

    private static String[] loadQuirks(Context context, Bundle bundle, String str) throws Throwable {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i2 = bundle.getInt(str, -1);
        String strKd = C1561oA.Kd("MrgqkTgwxntn{Uylpr\u0001", (short) (FB.Xd() ^ 4919));
        if (i2 == -1) {
            short sXd = (short) (OY.Xd() ^ 17587);
            short sXd2 = (short) (OY.Xd() ^ 30171);
            int[] iArr = new int["]\u001aG1fJ)Z\u0003S-Ft[ *\u001e^\u0003+\u007fpf\fNbK\u0005v\u001fs".length()];
            QB qb = new QB("]\u001aG1fJ)Z\u0003S-Ft[ *\u001e^\u0003+\u007fpf\fNbK\u0005v\u001fs");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i3++;
            }
            Logger.w(strKd, new String(iArr, 0, i3) + str);
            return new String[0];
        }
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("bpgvtok6lyy\u0001r|\u0004>T\u0002\u0002\tz\u000f\f", (short) (C1580rY.Xd() ^ (-8715)))).getMethod(Wg.vd("}|\tg\u007f\u000f\b\u000f\u0001rq\u0001", (short) (C1580rY.Xd() ^ (-24012))), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Resources) method.invoke(context, objArr)).getStringArray(i2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Resources.NotFoundException e3) {
            Logger.w(strKd, Qg.kd("\r0#+#V\u0019!\u0015&%P\u001e\u0010\u001b\u0012\u001fJ\u001c\u000e\u001b\u0016\u001b\u0017\u0007\bA\u000f\u000f\u0013=\u0003\u000b\u0010\b|Q6", (short) (C1633zX.Xd() ^ (-24515)), (short) (C1633zX.Xd() ^ (-6681))) + i2, e3);
            return new String[0];
        }
    }

    private static Set<Class<? extends Quirk>> resolveQuirkNames(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<? extends Quirk> clsResolveQuirkName = resolveQuirkName(str);
            if (clsResolveQuirkName != null) {
                hashSet.add(clsResolveQuirkName);
            }
        }
        return hashSet;
    }

    private static Class<? extends Quirk> resolveQuirkName(String str) {
        try {
            Class cls = Class.forName(str);
            if (Quirk.class.isAssignableFrom(cls)) {
                return cls;
            }
            Logger.w(TAG, str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e2) {
            Logger.w(TAG, "Class not found: " + str, e2);
            return null;
        }
    }

    public static class MetadataHolderService extends Service {
        private MetadataHolderService() {
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }
}
