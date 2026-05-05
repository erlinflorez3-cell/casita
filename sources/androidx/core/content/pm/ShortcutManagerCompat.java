package androidx.core.content.pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutInfoCompatSaver;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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

/* JADX INFO: loaded from: classes4.dex */
public class ShortcutManagerCompat {
    static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
    private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
    public static final String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;
    static final String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final String SHORTCUT_LISTENER_INTENT_FILTER_ACTION = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final String SHORTCUT_LISTENER_META_DATA_KEY = "androidx.core.content.pm.shortcut_listener_impl";
    private static volatile List<ShortcutInfoChangeListener> sShortcutInfoChangeListeners = null;
    private static volatile ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShortcutMatchFlags {
    }

    private ShortcutManagerCompat() {
    }

    public static boolean isRequestPinShortcutSupported(Context context) throws Throwable {
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(C1626yg.Ud("u.`*\nf>\u0018\u0016j\u0004U\u0014BW6e+\\6H\t{", (short) (OY.Xd() ^ 22970), (short) (OY.Xd() ^ 3687))).getMethod(EO.Od("\u001ch\f\t\u0001'ssG\u0001\u0011{O<>\u001e", (short) (FB.Xd() ^ 15502)), Class.forName(Ig.wd("?in?\u0012,;]$o\u000bNo\f ", (short) (C1580rY.Xd() ^ (-14954)))));
        try {
            method.setAccessible(true);
            return ((ShortcutManager) method.invoke(context, objArr)).isRequestPinShortcutSupported();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean requestPinShortcut(Context context, ShortcutInfoCompat shortcutInfoCompat, IntentSender intentSender) throws Throwable {
        if (Build.VERSION.SDK_INT <= 32 && shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            return false;
        }
        short sXd = (short) (OY.Xd() ^ 10730);
        int[] iArr = new int["\u0014 \u0015\"\u001e\u0017\u0011Y\u000e\u0019\u0017\u001c\f\u0014\u0019Qe\u0011\u000f\u0014\u0004\u0016\u0011".length()];
        QB qb = new QB("\u0014 \u0015\"\u001e\u0017\u0011Y\u000e\u0019\u0017\u001c\f\u0014\u0019Qe\u0011\u000f\u0014\u0004\u0016\u0011");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (C1580rY.Xd() ^ (-14305));
        short sXd3 = (short) (C1580rY.Xd() ^ (-18907));
        int[] iArr2 = new int["2*@,y9/=7~\u0015?5HI".length()];
        QB qb2 = new QB("2*@,y9/=7~\u0015?5HI");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {ShortcutManager.class};
        Method method = cls.getMethod(C1561oA.od("\f\t\u0017t\u001a\u0013\u0013\u0003\nn\u007f\f\u000f\u0001yz", (short) (FB.Xd() ^ 9446)), clsArr);
        try {
            method.setAccessible(true);
            return ((ShortcutManager) method.invoke(context, objArr)).requestPinShortcut(shortcutInfoCompat.toShortcutInfo(), intentSender);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.pm.ShortcutManagerCompat$1, reason: invalid class name */
    class AnonymousClass1 extends BroadcastReceiver {
        final /* synthetic */ IntentSender val$callback;

        AnonymousClass1(IntentSender intentSender) {
            this.val$callback = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.val$callback.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    public static Intent createShortcutResultIntent(Context context, ShortcutInfoCompat shortcutInfoCompat) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Xd("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96", (short) (FB.Xd() ^ 1120)));
        Class<?>[] clsArr = {Class.forName(Wg.vd("\u000e\u0004\u0018\u0002M\u000b~\u000b\u0003H\\\u0005x\n\t", (short) (ZN.Xd() ^ 17296)))};
        Object[] objArr = {ShortcutManager.class};
        short sXd = (short) (C1499aX.Xd() ^ (-6651));
        short sXd2 = (short) (C1499aX.Xd() ^ (-30323));
        int[] iArr = new int["\u0003\u007f\u000ek\u0011\n\ny\u0001ev\u0003\u0006wpq".length()];
        QB qb = new QB("\u0003\u007f\u000ek\u0011\n\ny\u0001ev\u0003\u0006wpq");
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
            Intent intentCreateShortcutResultIntent = ((ShortcutManager) method.invoke(context, objArr)).createShortcutResultIntent(shortcutInfoCompat.toShortcutInfo());
            if (intentCreateShortcutResultIntent == null) {
                intentCreateShortcutResultIntent = new Intent();
            }
            return shortcutInfoCompat.addToIntent(intentCreateShortcutResultIntent);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static List<ShortcutInfoCompat> getShortcuts(Context context, int i2) throws Throwable {
        if (Build.VERSION.SDK_INT >= 30) {
            Object[] objArr = {ShortcutManager.class};
            Method method = Class.forName(Wg.vd("6D7FHC;\u00060=9@6@C}\b518.B;", (short) (C1580rY.Xd() ^ (-26204)))).getMethod(hg.Vd("1.<\u001a?88(/\u0014%14&\u001f ", (short) (Od.Xd() ^ (-29044)), (short) (Od.Xd() ^ (-21280))), Class.forName(Qg.kd("wm\u0002k7thtl2Fnbsr", (short) (C1499aX.Xd() ^ (-6399)), (short) (C1499aX.Xd() ^ (-30283)))));
            try {
                method.setAccessible(true);
                return ShortcutInfoCompat.fromShortcuts(context, ((ShortcutManager) method.invoke(context, objArr)).getShortcuts(i2));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Object[] objArr2 = {ShortcutManager.class};
        Method method2 = Class.forName(C1561oA.ud("q}r\u007f{tn7kvtyiqv/Cnlqasn", (short) (C1633zX.Xd() ^ (-16014)))).getMethod(C1561oA.Yd("\"!1\u0011835'0\u0017*8=1,/", (short) (Od.Xd() ^ (-31469))), Class.forName(C1561oA.yd("/%9#v4(44y\u000e62CB", (short) (OY.Xd() ^ 4219))));
        try {
            method2.setAccessible(true);
            ShortcutManager shortcutManager = (ShortcutManager) method2.invoke(context, objArr2);
            ArrayList arrayList = new ArrayList();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                arrayList.addAll(shortcutManager.getManifestShortcuts());
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                arrayList.addAll(shortcutManager.getDynamicShortcuts());
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                arrayList.addAll(shortcutManager.getPinnedShortcuts());
            }
            return ShortcutInfoCompat.fromShortcuts(context, arrayList);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static boolean addDynamicShortcuts(Context context, List<ShortcutInfoCompat> list) throws Throwable {
        List<ShortcutInfoCompat> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            convertUriIconsToBitmapIcons(context, listRemoveShortcutsExcludedFromSurface);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ShortcutInfoCompat> it = listRemoveShortcutsExcludedFromSurface.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toShortcutInfo());
        }
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(C1561oA.od("iujwslf/cnlqain';fdiYkf", (short) (C1580rY.Xd() ^ (-28316)))).getMethod(Wg.Zd("3\r'1#8$`\u0014\u0015rjyHmz", (short) (C1580rY.Xd() ^ (-6921)), (short) (C1580rY.Xd() ^ (-16153))), Class.forName(C1561oA.Kd("ME[G\u0015TJXR\u001a0ZPcd", (short) (OY.Xd() ^ 27521))));
        try {
            method.setAccessible(true);
            if (!((ShortcutManager) method.invoke(context, objArr)).addDynamicShortcuts(arrayList)) {
                return false;
            }
            getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
            Iterator<ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
            while (it2.hasNext()) {
                it2.next().onShortcutAdded(list);
            }
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static int getMaxShortcutCountPerActivity(Context context) throws Throwable {
        Preconditions.checkNotNull(context);
        Class<?> cls = Class.forName(C1561oA.Yd("\"0'64/+u,99@2<C}\u0014AAH:NK", (short) (C1499aX.Xd() ^ (-27204))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1607wl.Xd() ^ 21022);
        short sXd2 = (short) (C1607wl.Xd() ^ 30903);
        int[] iArr = new int["me{g5tjxr:Pzp\u0004\u0005".length()];
        QB qb = new QB("me{g5tjxr:Pzp\u0004\u0005");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {ShortcutManager.class};
        short sXd3 = (short) (FB.Xd() ^ 30618);
        short sXd4 = (short) (FB.Xd() ^ 19008);
        int[] iArr2 = new int["B<i\u0017{S\u00043\n\u000e W~lxT".length()];
        QB qb2 = new QB("B<i\u0017{S\u00043\n\u000e W~lxT");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            return ((ShortcutManager) method.invoke(context, objArr)).getMaxShortcutCountPerActivity();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean isRateLimitingActive(Context context) throws Throwable {
        Preconditions.checkNotNull(context);
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(Xg.qd("KYP_]XT\u001fUbbi[el'=jjqcwt", (short) (FB.Xd() ^ 13816), (short) (FB.Xd() ^ 24779))).getMethod(ZO.xd("\u0015\u000f\u0017_js^\tm~zuM~\u001c_", (short) (C1499aX.Xd() ^ (-25137)), (short) (C1499aX.Xd() ^ (-23363))), Class.forName(Jg.Wd("|'R\u0011u\u00062S$|iJQ;O", (short) (ZN.Xd() ^ 7712), (short) (ZN.Xd() ^ 28029))));
        try {
            method.setAccessible(true);
            return ((ShortcutManager) method.invoke(context, objArr)).isRateLimitingActive();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static int getIconMaxWidth(Context context) throws Throwable {
        Preconditions.checkNotNull(context);
        short sXd = (short) (Od.Xd() ^ (-8898));
        short sXd2 = (short) (Od.Xd() ^ (-7092));
        int[] iArr = new int["gshuqjd-aljo_gl%9dbgWid".length()];
        QB qb = new QB("gshuqjd-aljo_gl%9dbgWid");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.yd("#\"2\u0012946(!\b\u001b).\"\u001d ", (short) (C1607wl.Xd() ^ 578)), Class.forName(C1561oA.ud("KAU?\u000bH<H@\u0006\u001aB6GF", (short) (C1633zX.Xd() ^ (-31573)))));
        try {
            method.setAccessible(true);
            return ((ShortcutManager) method.invoke(context, objArr)).getIconMaxWidth();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static int getIconMaxHeight(Context context) throws Throwable {
        Preconditions.checkNotNull(context);
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(C1561oA.Xd("JXO^\\WS\u001eTaahZdk&<iipbvs", (short) (Od.Xd() ^ (-8315)))).getMethod(Qg.kd("ZWeChaaQX=NZ]OHI", (short) (C1580rY.Xd() ^ (-6785)), (short) (C1580rY.Xd() ^ (-26330))), Class.forName(Wg.vd("80B.w7)7-t\u00071#63", (short) (C1499aX.Xd() ^ (-18275)))));
        try {
            method.setAccessible(true);
            return ((ShortcutManager) method.invoke(context, objArr)).getIconMaxHeight();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void reportShortcutUsed(Context context, String str) throws Throwable {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        short sXd = (short) (FB.Xd() ^ 14714);
        short sXd2 = (short) (FB.Xd() ^ 19164);
        int[] iArr = new int["swVU\u007f`\u0019e:\u000e(\u001c!H{yg.3hKw)".length()];
        QB qb = new QB("swVU\u007f`\u0019e:\u000e(\u001c!H{yg.3hKw)");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("\u0014I\t\u0001\u0012Q@rR5KtD/[x", (short) (Od.Xd() ^ (-185))), Class.forName(Ig.wd("K\u00147J\b\u0001IOpw\u0007:\u007f \b", (short) (C1633zX.Xd() ^ (-18866)))));
        try {
            method.setAccessible(true);
            ((ShortcutManager) method.invoke(context, objArr)).reportShortcutUsed(str);
            Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
            while (it.hasNext()) {
                it.next().onShortcutUsageReported(Collections.singletonList(str));
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean setDynamicShortcuts(Context context, List<ShortcutInfoCompat> list) throws Throwable {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(list);
        List<ShortcutInfoCompat> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        ArrayList arrayList = new ArrayList(listRemoveShortcutsExcludedFromSurface.size());
        Iterator<ShortcutInfoCompat> it = listRemoveShortcutsExcludedFromSurface.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toShortcutInfo());
        }
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(C1561oA.Kd("<JAPNIE\u0010FSSZLV]\u0018.[[bThe", (short) (OY.Xd() ^ 5784))).getMethod(C1561oA.Xd("\u0003\u0002\u0012q\u0019\u0014\u0016\b\u0011w\u000b\u0019\u001e\u0012\r\u0010", (short) (C1580rY.Xd() ^ (-10301))), Class.forName(Wg.Zd("On\u0011 qUV\r\u0017e$Vo\u00073", (short) (ZN.Xd() ^ 22842), (short) (ZN.Xd() ^ 2673))));
        try {
            method.setAccessible(true);
            if (!((ShortcutManager) method.invoke(context, objArr)).setDynamicShortcuts(arrayList)) {
                return false;
            }
            getShortcutInfoSaverInstance(context).removeAllShortcuts();
            getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
            for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
                shortcutInfoChangeListener.onAllShortcutsRemoved();
                shortcutInfoChangeListener.onShortcutAdded(list);
            }
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static List<ShortcutInfoCompat> getDynamicShortcuts(Context context) throws Throwable {
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(ZO.xd("8y\u001fq^\u001dzi\u0017\u0007BUx:S,*}#q\u0005Q ", (short) (C1607wl.Xd() ^ 28163), (short) (C1607wl.Xd() ^ 31317))).getMethod(Ig.wd("G\u0017w.\\\n\u001fGtZj]\u000f\u0014ya", (short) (C1499aX.Xd() ^ (-23281))), Class.forName(C1626yg.Ud("\n@nRbE?:^qcb[NH", (short) (C1499aX.Xd() ^ (-28468)), (short) (C1499aX.Xd() ^ (-5778)))));
        try {
            method.setAccessible(true);
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) method.invoke(context, objArr)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
            while (it.hasNext()) {
                arrayList.add(new ShortcutInfoCompat.Builder(context, it.next()).build());
            }
            return arrayList;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean updateShortcuts(Context context, List<ShortcutInfoCompat> list) throws Throwable {
        List<ShortcutInfoCompat> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            convertUriIconsToBitmapIcons(context, listRemoveShortcutsExcludedFromSurface);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ShortcutInfoCompat> it = listRemoveShortcutsExcludedFromSurface.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toShortcutInfo());
        }
        short sXd = (short) (C1633zX.Xd() ^ (-4041));
        int[] iArr = new int["\f\u0018\r\u001a\u001e\u0017\u0011Y\u0016!\u001f$\u001c$)a})',$61".length()];
        QB qb = new QB("\f\u0018\r\u001a\u001e\u0017\u0011Y\u0016!\u001f$\u001c$)a})',$61");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("^[iGleeU\\AR^aSLM", (short) (Od.Xd() ^ (-31813)), (short) (Od.Xd() ^ (-21085))), Class.forName(Qg.kd("f\\pZ&cWc[!5]Qba", (short) (OY.Xd() ^ 8868), (short) (OY.Xd() ^ 6417))));
        try {
            method.setAccessible(true);
            if (!((ShortcutManager) method.invoke(context, objArr)).updateShortcuts(arrayList)) {
                return false;
            }
            getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
            Iterator<ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
            while (it2.hasNext()) {
                it2.next().onShortcutUpdated(list);
            }
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static boolean convertUriIconToBitmapIcon(Context context, ShortcutInfoCompat shortcutInfoCompat) throws Throwable {
        Bitmap bitmapDecodeStream;
        if (shortcutInfoCompat.mIcon == null) {
            return false;
        }
        int i2 = shortcutInfoCompat.mIcon.mType;
        if (i2 != 6 && i2 != 4) {
            return true;
        }
        InputStream uriInputStream = shortcutInfoCompat.mIcon.getUriInputStream(context);
        if (uriInputStream == null || (bitmapDecodeStream = BitmapFactory.decodeStream(uriInputStream)) == null) {
            return false;
        }
        shortcutInfoCompat.mIcon = i2 == 6 ? IconCompat.createWithAdaptiveBitmap(bitmapDecodeStream) : IconCompat.createWithBitmap(bitmapDecodeStream);
        return true;
    }

    static void convertUriIconsToBitmapIcons(Context context, List<ShortcutInfoCompat> list) {
        for (ShortcutInfoCompat shortcutInfoCompat : new ArrayList(list)) {
            if (!convertUriIconToBitmapIcon(context, shortcutInfoCompat)) {
                list.remove(shortcutInfoCompat);
            }
        }
    }

    public static void disableShortcuts(Context context, List<String> list, CharSequence charSequence) throws Throwable {
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(hg.Vd("\u0006\u0012\u0007\u0014\u0010\t\u0003K\u007f\u000b\t\u000e}\u0006\u000bCW\u0003\u0001\u0006u\b\u0003", (short) (C1580rY.Xd() ^ (-18332)), (short) (C1580rY.Xd() ^ (-28330)))).getMethod(C1561oA.yd("c`rPqjn^qVkwvhef", (short) (C1607wl.Xd() ^ 20783)), Class.forName(C1561oA.ud("[QeO\u001bXLXP\u0016*RFWV", (short) (ZN.Xd() ^ 6709))));
        try {
            method.setAccessible(true);
            ((ShortcutManager) method.invoke(context, objArr)).disableShortcuts(list, charSequence);
            getShortcutInfoSaverInstance(context).removeShortcuts(list);
            Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
            while (it.hasNext()) {
                it.next().onShortcutRemoved(list);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void enableShortcuts(Context context, List<ShortcutInfoCompat> list) throws Throwable {
        List<ShortcutInfoCompat> listRemoveShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfoCompat> it = listRemoveShortcutsExcludedFromSurface.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mId);
        }
        Class<?> cls = Class.forName(C1561oA.Yd("\u0001\u000f\u0006\u0015\u0013\u000e\nT\u000b\u0018\u0018\u001f\u0011\u001b\"\\r  '\u0019-*", (short) (ZN.Xd() ^ 29237)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (ZN.Xd() ^ 14112);
        short sXd2 = (short) (ZN.Xd() ^ 28267);
        int[] iArr = new int["\u0011\t\u001f\u000bX\u0018\u000e\u001c\u0016]s\u001e\u0014'(".length()];
        QB qb = new QB("\u0011\t\u001f\u000bX\u0018\u000e\u001c\u0016]s\u001e\u0014'(");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {ShortcutManager.class};
        Method method = cls.getMethod(Jg.Wd("^Z*\bic#px\u001d+vzJ\u0003\u0005", (short) (C1607wl.Xd() ^ 1170), (short) (C1607wl.Xd() ^ 10890)), clsArr);
        try {
            method.setAccessible(true);
            ((ShortcutManager) method.invoke(context, objArr)).enableShortcuts(arrayList);
            getShortcutInfoSaverInstance(context).addShortcuts(listRemoveShortcutsExcludedFromSurface);
            Iterator<ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
            while (it2.hasNext()) {
                it2.next().onShortcutAdded(list);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void removeDynamicShortcuts(Context context, List<String> list) throws Throwable {
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(C1561oA.ud("{\b|\n\u0006~xAu\u0001~\u0004s{\u00019Mxv{k}x", (short) (Od.Xd() ^ (-6825)))).getMethod(C1561oA.Yd("\u0001\u007f\u0010o\u0017\u0012\u0014\u0006\u000fu\t\u0017\u001c\u0010\u000b\u000e", (short) (FB.Xd() ^ 23367)), Class.forName(C1561oA.yd("1)?+p0&4&m\u0004.\u001c/0", (short) (Od.Xd() ^ (-1991)))));
        try {
            method.setAccessible(true);
            ((ShortcutManager) method.invoke(context, objArr)).removeDynamicShortcuts(list);
            getShortcutInfoSaverInstance(context).removeShortcuts(list);
            Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
            while (it.hasNext()) {
                it.next().onShortcutRemoved(list);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void removeAllDynamicShortcuts(Context context) throws Throwable {
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(Wg.vd("gslyyrp9q|~\u0004w\u007f\tAY\u0005\u0007\f\u007f\u0012\u0011", (short) (C1580rY.Xd() ^ (-18721)))).getMethod(hg.Vd("\u0012\u000f\u001dz \u0019\u0019\t\u0010t\u0006\u0012\u0015\u0007\u007f\u0001", (short) (ZN.Xd() ^ 22571), (short) (ZN.Xd() ^ 1609)), Class.forName(Qg.kd("A7K5\u0001>2>6{\u00108,=<", (short) (FB.Xd() ^ 614), (short) (FB.Xd() ^ 30826))));
        try {
            method.setAccessible(true);
            ((ShortcutManager) method.invoke(context, objArr)).removeAllDynamicShortcuts();
            getShortcutInfoSaverInstance(context).removeAllShortcuts();
            Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
            while (it.hasNext()) {
                it.next().onAllShortcutsRemoved();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void removeLongLivedShortcuts(Context context, List<String> list) throws Throwable {
        if (Build.VERSION.SDK_INT < 30) {
            removeDynamicShortcuts(context, list);
            return;
        }
        Object[] objArr = {ShortcutManager.class};
        Method method = Class.forName(Xg.qd("\u0004\u0012\t\u0018\u0016\u0011\rW\u000e\u001b\u001b\"\u0014\u001e%_u##*\u001c0-", (short) (C1633zX.Xd() ^ (-29313)), (short) (C1633zX.Xd() ^ (-1860)))).getMethod(ZO.xd("[\\>qgJB\u0018C5^Iy\nT\u0019", (short) (C1607wl.Xd() ^ 27047), (short) (C1607wl.Xd() ^ 15154)), Class.forName(Jg.Wd("w\u0019P\u0002xy\u0015L\ftT$[\u0014>", (short) (C1633zX.Xd() ^ (-25292)), (short) (C1633zX.Xd() ^ (-12113)))));
        try {
            method.setAccessible(true);
            ((ShortcutManager) method.invoke(context, objArr)).removeLongLivedShortcuts(list);
            getShortcutInfoSaverInstance(context).removeShortcuts(list);
            Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
            while (it.hasNext()) {
                it.next().onShortcutRemoved(list);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean pushDynamicShortcut(Context context, ShortcutInfoCompat shortcutInfoCompat) throws Throwable {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(shortcutInfoCompat);
        if (Build.VERSION.SDK_INT <= 32 && shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
            while (it.hasNext()) {
                it.next().onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            return true;
        }
        int maxShortcutCountPerActivity = getMaxShortcutCountPerActivity(context);
        if (maxShortcutCountPerActivity == 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT <= 29) {
            convertUriIconToBitmapIcon(context, shortcutInfoCompat);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            short sXd = (short) (OY.Xd() ^ PhotoshopDirectory.TAG_LAYERS_GROUP_INFORMATION);
            int[] iArr = new int["UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR".length()];
            QB qb = new QB("UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {ShortcutManager.class};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od(".+9\u0017<55%,\u0011\".1#\u001c\u001d", (short) (C1633zX.Xd() ^ (-4421))), Class.forName(C1593ug.zd(">6L8\u0006E;IC\u000b!KATU", (short) (Od.Xd() ^ (-22707)), (short) (Od.Xd() ^ (-30131)))));
            try {
                method.setAccessible(true);
                ((ShortcutManager) method.invoke(context, objArr)).pushDynamicShortcut(shortcutInfoCompat.toShortcutInfo());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            Class<?> cls = Class.forName(C1561oA.Kd("{\n\u0001\u0010\u000e\t\u0005O\u0006\u0013\u0013\u001a\f\u0016\u001dWm\u001b\u001b\"\u0014(%", (short) (C1633zX.Xd() ^ (-12376))));
            Class<?>[] clsArr = new Class[1];
            short sXd2 = (short) (C1499aX.Xd() ^ (-26525));
            short sXd3 = (short) (C1499aX.Xd() ^ (-15282));
            int[] iArr2 = new int["Zz5I=!?qqa\u001cn\u000bBk".length()];
            QB qb2 = new QB("Zz5I=!?qqa\u001cn\u000bBk");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr2 = {ShortcutManager.class};
            Method method2 = cls.getMethod(C1561oA.Xd(":9I)PKM?H/BPUIDG", (short) (C1499aX.Xd() ^ (-19952))), clsArr);
            try {
                method2.setAccessible(true);
                ShortcutManager shortcutManager = (ShortcutManager) method2.invoke(context, objArr2);
                if (shortcutManager.isRateLimitingActive()) {
                    return false;
                }
                List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                    shortcutManager.removeDynamicShortcuts(Arrays.asList(Api25Impl.getShortcutInfoWithLowestRank(dynamicShortcuts)));
                }
                shortcutManager.addDynamicShortcuts(Arrays.asList(shortcutInfoCompat.toShortcutInfo()));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        ShortcutInfoCompatSaver<?> shortcutInfoSaverInstance = getShortcutInfoSaverInstance(context);
        try {
            List<ShortcutInfoCompat> shortcuts = shortcutInfoSaverInstance.getShortcuts();
            if (shortcuts.size() >= maxShortcutCountPerActivity) {
                shortcutInfoSaverInstance.removeShortcuts(Arrays.asList(getShortcutInfoCompatWithLowestRank(shortcuts)));
            }
            shortcutInfoSaverInstance.addShortcuts(Arrays.asList(shortcutInfoCompat));
            Iterator<ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
            while (it2.hasNext()) {
                it2.next().onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            return true;
        } catch (Exception unused) {
            Iterator<ShortcutInfoChangeListener> it3 = getShortcutInfoListeners(context).iterator();
            while (it3.hasNext()) {
                it3.next().onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            return false;
        } catch (Throwable th) {
            Iterator<ShortcutInfoChangeListener> it4 = getShortcutInfoListeners(context).iterator();
            while (it4.hasNext()) {
                it4.next().onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            throw th;
        }
    }

    private static String getShortcutInfoCompatWithLowestRank(List<ShortcutInfoCompat> list) {
        int rank = -1;
        String id = null;
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.getRank() > rank) {
                id = shortcutInfoCompat.getId();
                rank = shortcutInfoCompat.getRank();
            }
        }
        return id;
    }

    static void setShortcutInfoCompatSaver(ShortcutInfoCompatSaver<Void> shortcutInfoCompatSaver) {
        sShortcutInfoCompatSaver = shortcutInfoCompatSaver;
    }

    static void setShortcutInfoChangeListeners(List<ShortcutInfoChangeListener> list) {
        sShortcutInfoChangeListeners = list;
    }

    static List<ShortcutInfoChangeListener> getShortcutInfoChangeListeners() {
        return sShortcutInfoChangeListeners;
    }

    private static int getIconDimensionInternal(Context context, boolean z2) throws Throwable {
        String strOd = EO.Od("\n:{\u000b\nY:\u001a", (short) (C1499aX.Xd() ^ (-14884)));
        Class<?> cls = Class.forName(C1561oA.Qd("2>3@<5/w,75:*27o\u0004/-2\"4/", (short) (Od.Xd() ^ (-3027))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1499aX.Xd() ^ (-27922));
        short sXd2 = (short) (C1499aX.Xd() ^ (-14087));
        int[] iArr = new int["7/E1~>4B<\u0004*LKCIC".length()];
        QB qb = new QB("7/E1~>4B<\u0004*LKCIC");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strOd};
        Method method = cls.getMethod(C1561oA.od("\u001d\u001a(\u0006+$$\u0014\u001b\u007f\u0011\u001d \u0012\u000b\f", (short) (C1499aX.Xd() ^ (-13806))), clsArr);
        try {
            method.setAccessible(true);
            ActivityManager activityManager = (ActivityManager) method.invoke(context, objArr);
            int iMax = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Kd("Yg^mkfb-cppwisz5Kxx\u007fq\u0006\u0003", (short) (Od.Xd() ^ (-23220)))).getMethod(Wg.Zd("\u001aF?Q_\u0012y2*IMF", (short) (C1607wl.Xd() ^ 14754), (short) (C1607wl.Xd() ^ 15160)), new Class[0]);
            try {
                method2.setAccessible(true);
                DisplayMetrics displayMetrics = ((Resources) method2.invoke(context, objArr2)).getDisplayMetrics();
                return (int) (iMax * ((z2 ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(Context context) {
        if (sShortcutInfoCompatSaver == null) {
            try {
                sShortcutInfoCompatSaver = (ShortcutInfoCompatSaver) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (sShortcutInfoCompatSaver == null) {
                sShortcutInfoCompatSaver = new ShortcutInfoCompatSaver.NoopImpl();
            }
        }
        return sShortcutInfoCompatSaver;
    }

    private static List<ShortcutInfoChangeListener> getShortcutInfoListeners(Context context) throws Throwable {
        Bundle bundle;
        String string;
        if (sShortcutInfoChangeListeners == null) {
            ArrayList arrayList = new ArrayList();
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("s%3}\\UW,3S\"\u001f\u0014>^]2\u0019=\r{\u001e7", (short) (C1607wl.Xd() ^ 9195), (short) (C1607wl.Xd() ^ 10241))).getMethod(C1626yg.Ud("XW47R;\u001dRS$\tg^s%O\u0002", (short) (FB.Xd() ^ 22240), (short) (FB.Xd() ^ 10415)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                short sXd = (short) (Od.Xd() ^ (-10028));
                int[] iArr = new int["|bf\u0011\u00162\u0015\u001aoiw\u0019<zPf<@y6|\u0013wlA\u000f&w\u0011E\\\u0017ycH\u007fvOK^MC".length()];
                QB qb = new QB("|bf\u0011\u00162\u0015\u001aoiw\u0019<zPf<@y6|\u0013wlA\u000f&w\u0011E\\\u0017ycH\u007fvOK^MC");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                Intent intent = new Intent(new String(iArr, 0, i2));
                short sXd2 = (short) (C1607wl.Xd() ^ 12433);
                int[] iArr2 = new int["=$[EZy\u001d\u000evb7g(#9\u0018r\rSe\u001at\u001b".length()];
                QB qb2 = new QB("=$[EZy\u001d\u000evb7g(#9\u0018r\rSe\u001at\u001b");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
                    i3++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Qd("jguP`ah]b_GYd[", (short) (C1633zX.Xd() ^ (-19094))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    intent.setPackage((String) method2.invoke(context, objArr2));
                    short sXd3 = (short) (ZN.Xd() ^ 10502);
                    short sXd4 = (short) (ZN.Xd() ^ 28351);
                    int[] iArr3 = new int["x\u0007}\r\u000b\u0006\u0002L\u0003\u0010\u0010\u0017\t\u0013\u001aT\u0018\u0016Wz\r\u0010\u0019\u0010\u0017\u0016~\u0014\"\u0016\u001d\u001c*".length()];
                    QB qb3 = new QB("x\u0007}\r\u000b\u0006\u0002L\u0003\u0010\u0010\u0017\t\u0013\u001aT\u0018\u0016Wz\r\u0010\u0019\u0010\u0017\u0016~\u0014\"\u0016\u001d\u001c*");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) - sXd4);
                        i4++;
                    }
                    Object[] objArr3 = {intent, 128};
                    Method method3 = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.Kd("\u001c!\u0012 (x\u001f&\u0018\")v\u001a,\"0$0&#2", (short) (C1607wl.Xd() ^ 18821)), Class.forName(C1561oA.od("~\u000b\u007f\r\t\u0002{Dx\u0004\u0002\u0007v~\u0004<Vz\u007fow|", (short) (ZN.Xd() ^ 20643))), Integer.TYPE);
                    try {
                        method3.setAccessible(true);
                        Iterator it = ((List) method3.invoke(packageManager, objArr3)).iterator();
                        while (it.hasNext()) {
                            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                            if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString(Wg.Zd("gzfZM-\u001e8\u0004\u001fA*rAl^\u0014\u007ffuQpI,\u0003N9&\u001f\u0007k\u0004\u0019i\roOV=,YL/?\u0019\u0002\u0014", (short) (ZN.Xd() ^ 14618), (short) (ZN.Xd() ^ 2964)))) != null) {
                                try {
                                    arrayList.add((ShortcutInfoChangeListener) Class.forName(string, false, ShortcutManagerCompat.class.getClassLoader()).getMethod(C1561oA.Xd("ML\\2X^`N\\RU", (short) (Od.Xd() ^ (-3136))), Context.class).invoke(null, context));
                                } catch (Exception unused) {
                                }
                            }
                        }
                        if (sShortcutInfoChangeListeners == null) {
                            sShortcutInfoChangeListeners = arrayList;
                        }
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
        return sShortcutInfoChangeListeners;
    }

    private static List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface(List<ShortcutInfoCompat> list, int i2) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.isExcludedFromSurfaces(i2)) {
                arrayList.remove(shortcutInfoCompat);
            }
        }
        return arrayList;
    }

    private static class Api25Impl {
        private Api25Impl() {
        }

        static String getShortcutInfoWithLowestRank(List<ShortcutInfo> list) {
            int rank = -1;
            String id = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > rank) {
                    id = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id;
        }
    }
}
