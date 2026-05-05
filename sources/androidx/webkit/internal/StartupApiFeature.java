package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import androidx.webkit.WebViewCompat;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StartupApiFeature {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String METADATA_HOLDER_SERVICE_NAME = "org.chromium.android_webview.services.StartupFeatureMetadataHolder";
    private static final Set<StartupApiFeature> sValues = new HashSet();
    private final String mInternalFeatureValue;
    private final String mPublicFeatureValue;

    public abstract boolean isSupportedByFramework();

    StartupApiFeature(String str, String str2) {
        this.mPublicFeatureValue = str;
        this.mInternalFeatureValue = str2;
        sValues.add(this);
    }

    public String getPublicFeatureName() {
        return this.mPublicFeatureValue;
    }

    public boolean isSupported(Context context) {
        return isSupportedByFramework() || isSupportedByWebView(context);
    }

    public boolean isSupportedByWebView(Context context) throws Throwable {
        Bundle metaDataFromWebViewManifestOrNull = getMetaDataFromWebViewManifestOrNull(context);
        if (metaDataFromWebViewManifestOrNull == null) {
            return false;
        }
        return metaDataFromWebViewManifestOrNull.containsKey(this.mInternalFeatureValue);
    }

    public static Set<StartupApiFeature> values() {
        return Collections.unmodifiableSet(sValues);
    }

    private static Bundle getMetaDataFromWebViewManifestOrNull(Context context) throws Throwable {
        PackageInfo currentWebViewPackage = WebViewCompat.getCurrentWebViewPackage(context);
        if (currentWebViewPackage == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(currentWebViewPackage.packageName, Ig.wd("-hKjg?eb\u0012-;UG\u0001\u000e-bi\u001b\u001eZ\u001a\u001e3Lc\u0001b\u001b\u0012 Vnz>\n5\f8C,\u0015L_[IQ&\u000bc@nr:v3<\u0017wn9>\u0013pI>", (short) (C1580rY.Xd() ^ (-21928))));
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager.ComponentInfoFlags componentInfoFlagsOf = ApiHelperForTiramisu.of(640L);
            try {
                Class<?> cls = Class.forName(EO.Od("s8R}&U\"e>{r\u001d=JN/y6O;nP ", (short) (C1633zX.Xd() ^ (-19364))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (C1633zX.Xd() ^ (-11882));
                int[] iArr = new int["\u000f\f\u001at\u0005\u0006\r\u0002\u0007\u0004j}\n{\u0001}\n".length()];
                QB qb = new QB("\u000f\f\u001at\u0005\u0006\r\u0002\u0007\u0004j}\n{\u0001}\n");
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
                    return ApiHelperForTiramisu.getServiceInfo((PackageManager) method.invoke(context, objArr), componentName, componentInfoFlagsOf).metaData;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        try {
            return getServiceInfo(context, componentName, OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE).metaData;
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    private static ServiceInfo getServiceInfo(Context context, ComponentName componentName, int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("=KBQOJF\u0011GTT[MW^\u0019/\\\\cUif", (short) (C1580rY.Xd() ^ (-81)), (short) (C1580rY.Xd() ^ (-15129)))).getMethod(C1561oA.od(" \u001d+\u0006\u0016\u0017\u001e\u0013\u0018\u0015{\u000f\u001b\r\u0012\u000f\u001b", (short) (Od.Xd() ^ (-15337))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Class<?> cls = Class.forName(C1561oA.Kd("\"0'64/+u,99@2<C}A?\u0001$69B9@?(=K?FES", (short) (Od.Xd() ^ (-12222))));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1499aX.Xd() ^ (-6425));
            short sXd2 = (short) (C1499aX.Xd() ^ (-21669));
            int[] iArr = new int["X\u0016Lv4R\u000ewa&A\b\u0019f\rz0\u0015Or.U\u0005*p~2~\u0013".length()];
            QB qb = new QB("X\u0016Lv4R\u000ewa&A\b\u0019f\rz0\u0015Or.U\u0005*p~2~\u0013");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i3));
            clsArr[1] = Integer.TYPE;
            Object[] objArr2 = {componentName, Integer.valueOf(i2)};
            short sXd3 = (short) (OY.Xd() ^ 21525);
            int[] iArr2 = new int[" \u001f/\u000f\"05)$'\f2+5".length()];
            QB qb2 = new QB(" \u001f/\u000f\"05)$'\f2+5");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i4));
                i4++;
            }
            Method method2 = cls.getMethod(new String(iArr2, 0, i4), clsArr);
            try {
                method2.setAccessible(true);
                return (ServiceInfo) method2.invoke(packageManager, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static class P extends StartupApiFeature {
        P(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.StartupApiFeature
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class NoFramework extends StartupApiFeature {
        @Override // androidx.webkit.internal.StartupApiFeature
        public final boolean isSupportedByFramework() {
            return false;
        }

        NoFramework(String str, String str2) {
            super(str, str2);
        }
    }
}
