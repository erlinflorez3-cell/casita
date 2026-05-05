package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import androidx.core.provider.FontRequest;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import yg.C1561oA;
import yg.C1580rY;
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
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultEmojiCompatConfig {
    private DefaultEmojiCompatConfig() {
    }

    public static FontRequestEmojiCompatConfig create(Context context) {
        return (FontRequestEmojiCompatConfig) new DefaultEmojiCompatConfigFactory(null).create(context);
    }

    public static class DefaultEmojiCompatConfigFactory {
        private static final String DEFAULT_EMOJI_QUERY = "emojicompat-emoji-font";
        private static final String INTENT_LOAD_EMOJI_FONT = "androidx.content.action.LOAD_EMOJI_FONT";
        private static final String TAG = "emoji2.text.DefaultEmojiConfig";
        private final DefaultEmojiCompatConfigHelper mHelper;

        public DefaultEmojiCompatConfigFactory(DefaultEmojiCompatConfigHelper defaultEmojiCompatConfigHelper) {
            this.mHelper = defaultEmojiCompatConfigHelper == null ? getHelperForApi() : defaultEmojiCompatConfigHelper;
        }

        public EmojiCompat.Config create(Context context) {
            return configOrNull(context, queryForDefaultFontRequest(context));
        }

        private EmojiCompat.Config configOrNull(Context context, FontRequest fontRequest) {
            if (fontRequest == null) {
                return null;
            }
            return new FontRequestEmojiCompatConfig(context, fontRequest);
        }

        FontRequest queryForDefaultFontRequest(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("?K@MIB<\u00059DBG7?D|\u0011<:?/A<", (short) (ZN.Xd() ^ 12046))).getMethod(C1561oA.yd("XWgDVYbYPO8M[OVUS", (short) (OY.Xd() ^ 29584)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                short sXd = (short) (FB.Xd() ^ 2836);
                int[] iArr = new int["#58A8?>yH=K?FES\u0002UIV[PZNN\u000b`\\\u000e[_TSgY\u0015[dgcc\u001bblls qtrznjlz".length()];
                QB qb = new QB("#58A8?>yH=K?FES\u0002UIV[PZNN\u000b`\\\u000e[_TSgY\u0015[dgcc\u001bblls qtrznjlz");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                Preconditions.checkNotNull(packageManager, new String(iArr, 0, i2));
                ProviderInfo providerInfoQueryDefaultInstalledContentProvider = queryDefaultInstalledContentProvider(packageManager);
                if (providerInfoQueryDefaultInstalledContentProvider == null) {
                    return null;
                }
                try {
                    return generateFontRequestFrom(providerInfoQueryDefaultInstalledContentProvider, packageManager);
                } catch (PackageManager.NameNotFoundException e2) {
                    short sXd2 = (short) (C1580rY.Xd() ^ (-24603));
                    short sXd3 = (short) (C1580rY.Xd() ^ (-7509));
                    int[] iArr2 = new int["v\u007f\u0003~~HE\r~\u0013\u0010Ja\u0004\u0006\u0002\u0017\u000f\u0018i\u0013\u0016\u0012\u0012l\u001a\u001a\u0013\u0017\u0016".length()];
                    QB qb2 = new QB("v\u007f\u0003~~HE\r~\u0013\u0010Ja\u0004\u0006\u0002\u0017\u000f\u0018i\u0013\u0016\u0012\u0012l\u001a\u001a\u0013\u0017\u0016");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                        i3++;
                    }
                    new String(iArr2, 0, i3);
                    return null;
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        private ProviderInfo queryDefaultInstalledContentProvider(PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.mHelper.queryIntentContentProviders(packageManager, new Intent(INTENT_LOAD_EMOJI_FONT), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfo = this.mHelper.getProviderInfo(it.next());
                if (hasFlagSystem(providerInfo)) {
                    return providerInfo;
                }
            }
            return null;
        }

        private boolean hasFlagSystem(ProviderInfo providerInfo) {
            Object obj;
            if (providerInfo != null && providerInfo.applicationInfo != null) {
                ApplicationInfo applicationInfo = providerInfo.applicationInfo;
                String strKd = Qg.kd("{\b|\n\u0006~xAu\u0001~\u0004s{\u00019zv6HvuplebthmkEi`h", (short) (C1580rY.Xd() ^ (-11568)), (short) (C1580rY.Xd() ^ (-4653)));
                short sXd = (short) (C1633zX.Xd() ^ (-19160));
                short sXd2 = (short) (C1633zX.Xd() ^ (-4897));
                int[] iArr = new int["!&\u001a\u001f*".length()];
                QB qb = new QB("!&\u001a\u001f*");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                try {
                    Class<?> cls = Class.forName(strKd);
                    Field field = 1 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                if ((((Integer) obj).intValue() & 1) == 1) {
                    return true;
                }
            }
            return false;
        }

        private FontRequest generateFontRequestFrom(ProviderInfo providerInfo, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new FontRequest(str, str2, DEFAULT_EMOJI_QUERY, convertToByteArray(this.mHelper.getSigningSignatures(packageManager, str2)));
        }

        private List<List<byte[]>> convertToByteArray(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        private static DefaultEmojiCompatConfigHelper getHelperForApi() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new DefaultEmojiCompatConfigHelper_API28();
            }
            return new DefaultEmojiCompatConfigHelper_API19();
        }
    }

    public static class DefaultEmojiCompatConfigHelper {
        public Signature[] getSigningSignatures(PackageManager packageManager, String str) throws Throwable {
            Object[] objArr = {str, 64};
            Method method = Class.forName(Jg.Wd(">\u001b*\u007f\u0016acFE`9HP+:K\u0017%=hQduCR\"!>%'v\u000e\"", (short) (Od.Xd() ^ (-23123)), (short) (Od.Xd() ^ (-16938)))).getMethod(C1626yg.Ud("\u001c\u0005zB\u0004*,NZ,\u000f~}u", (short) (FB.Xd() ^ 952), (short) (FB.Xd() ^ 6707)), Class.forName(ZO.xd("Jt8U(N\u000bDCzYzefu9", (short) (ZN.Xd() ^ 17815), (short) (ZN.Xd() ^ 29618))), Integer.TYPE);
            try {
                method.setAccessible(true);
                return ((PackageInfo) method.invoke(packageManager, objArr)).signatures;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public List<ResolveInfo> queryIntentContentProviders(PackageManager packageManager, Intent intent, int i2) {
            return Collections.emptyList();
        }

        public ProviderInfo getProviderInfo(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }
    }

    public static class DefaultEmojiCompatConfigHelper_API19 extends DefaultEmojiCompatConfigHelper {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public List<ResolveInfo> queryIntentContentProviders(PackageManager packageManager, Intent intent, int i2) throws Throwable {
            Class<?> cls = Class.forName(Ig.wd("\"^B<i?J+*\u001a\u0013b\u0004\u0019\tb[t[\bQ\n2\u001e`\\d?h\f(F}", (short) (C1633zX.Xd() ^ (-194))));
            Class<?>[] clsArr = {Class.forName(EO.Od("jE\u000b{+yRvr\r\u00102m~f<49\n%\u00051", (short) (C1580rY.Xd() ^ (-21041)))), Integer.TYPE};
            Object[] objArr = {intent, Integer.valueOf(i2)};
            short sXd = (short) (ZN.Xd() ^ 10322);
            int[] iArr = new int["\u0003\u0006t\u0001\u0007Uy~nv{ItrwgotOplrd^^jj".length()];
            QB qb = new QB("\u0003\u0006t\u0001\u0007Uy~nv{ItrwgotOplrd^^jj");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                return (List) method.invoke(packageManager, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public ProviderInfo getProviderInfo(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }
    }

    public static class DefaultEmojiCompatConfigHelper_API28 extends DefaultEmojiCompatConfigHelper_API19 {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public Signature[] getSigningSignatures(PackageManager packageManager, String str) throws Throwable {
            short sXd = (short) (Od.Xd() ^ (-22734));
            short sXd2 = (short) (Od.Xd() ^ (-31024));
            int[] iArr = new int["Zh_nlgc.dqqxjt{6yw9\\nqzqxw`u\u0004w~}\f".length()];
            QB qb = new QB("Zh_nlgc.dqqxjt{6yw9\\nqzqxw`u\u0004w~}\f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[2];
            short sXd3 = (short) (OY.Xd() ^ 4081);
            int[] iArr2 = new int["\u001c\u0012&\u0010[\u0019\r\u0019\u0011Vz\u001b\u0018\u000e\u0012\n".length()];
            QB qb2 = new QB("\u001c\u0012&\u0010[\u0019\r\u0019\u0011Vz\u001b\u0018\u000e\u0012\n");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str, 64};
            Method method = cls.getMethod(C1561oA.Kd(",+;\u0018*-6-43\u0018>7A", (short) (C1633zX.Xd() ^ (-19963))), clsArr);
            try {
                method.setAccessible(true);
                return ((PackageInfo) method.invoke(packageManager, objArr)).signatures;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
