package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.tracing.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
class FontProvider {
    private static final LruCache<ProviderCacheKey, ProviderInfo> sProviderCache = new LruCache<>(2);
    private static final Comparator<byte[]> sByteArrayComparator = new Comparator() { // from class: androidx.core.provider.FontProvider$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return FontProvider.lambda$static$0((byte[]) obj, (byte[]) obj2);
        }
    };

    private FontProvider() {
    }

    static FontsContractCompat.FontFamilyResult getFontFamilyResult(Context context, List<FontRequest> list, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        short sXd = (short) (C1607wl.Xd() ^ 18686);
        int[] iArr = new int["\u000ffU6C2Uf\u0018\u0002~oU\u000f7+)Z\u0004s\u0004E=7x4-\u0015+]z%".length()];
        QB qb = new QB("\u000ffU6C2Uf\u0018\u0002~oU\u000f7+)Z\u0004s\u0004E=7x4-\u0015+]z%");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Trace.beginSection(new String(iArr, 0, i2));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                FontRequest fontRequest = list.get(i3);
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Qd("8D9FB;5}2=;@08=u\n538(:5", (short) (ZN.Xd() ^ 30939))).getMethod(C1593ug.zd(":9I&8;D;BA*?MAHGU", (short) (ZN.Xd() ^ 26126), (short) (ZN.Xd() ^ 10372)), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.od("CODQMF@\t=HFK;CH\u0001\u0015@>C3E@", (short) (C1499aX.Xd() ^ (-7951)))).getMethod(C1561oA.Kd("|{\fj~\u000e\u000b\u0012\u0010\u0002\u0005\u0014", (short) (OY.Xd() ^ 2859)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        ProviderInfo provider = getProvider(packageManager, fontRequest, (Resources) method2.invoke(context, objArr2));
                        if (provider == null) {
                            return FontsContractCompat.FontFamilyResult.create(1, (FontsContractCompat.FontInfo[]) null);
                        }
                        arrayList.add(query(context, fontRequest, provider.authority, cancellationSignal));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            return FontsContractCompat.FontFamilyResult.create(0, arrayList);
        } finally {
            Trace.endSection();
        }
    }

    private static class ProviderCacheKey {
        String mAuthority;
        List<List<byte[]>> mCertificates;
        String mPackageName;

        ProviderCacheKey(String str, String str2, List<List<byte[]>> list) {
            this.mAuthority = str;
            this.mPackageName = str2;
            this.mCertificates = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderCacheKey)) {
                return false;
            }
            ProviderCacheKey providerCacheKey = (ProviderCacheKey) obj;
            return Objects.equals(this.mAuthority, providerCacheKey.mAuthority) && Objects.equals(this.mPackageName, providerCacheKey.mPackageName) && Objects.equals(this.mCertificates, providerCacheKey.mCertificates);
        }

        public int hashCode() {
            return Objects.hash(this.mAuthority, this.mPackageName, this.mCertificates);
        }
    }

    static void clearProviderCache() {
        sProviderCache.evictAll();
    }

    static ProviderInfo getProvider(PackageManager packageManager, FontRequest fontRequest, Resources resources) throws PackageManager.NameNotFoundException {
        short sXd = (short) (C1607wl.Xd() ^ 16194);
        short sXd2 = (short) (C1607wl.Xd() ^ 4761);
        int[] iArr = new int["T8z>|r\u0003Y!a\u001f2p&C\u007fU\u0017F\fU\u001dV".length()];
        QB qb = new QB("T8z>|r\u0003Y!a\u001f2p&C\u007fU\u0017F\fU\u001dV");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strXd = C1561oA.Xd("Pr$ugjsjqp,s}\u0005~u2y\u0004\b6x\u000e\u000e\u0003\u000b\u000f\u0007\u0013\u0019ZA", (short) (OY.Xd() ^ 7869));
        Trace.beginSection(Wg.vd("[\u0006\u0006\ri\r\u000b\u0013\u0007\u0003\u0005\u0013O\n\t\u0019Uxv~rnp~", (short) (ZN.Xd() ^ 29631)));
        try {
            List<List<byte[]>> certificates = getCertificates(fontRequest, resources);
            ProviderCacheKey providerCacheKey = new ProviderCacheKey(fontRequest.getProviderAuthority(), fontRequest.getProviderPackage(), certificates);
            ProviderInfo providerInfo = sProviderCache.get(providerCacheKey);
            if (providerInfo != null) {
                return providerInfo;
            }
            String providerAuthority = fontRequest.getProviderAuthority();
            Class<?> cls = Class.forName(Qg.kd("\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011I\u000b\u0007Fgwx\u007ftyv]p|nsp|", (short) (C1580rY.Xd() ^ (-7973)), (short) (C1580rY.Xd() ^ (-5352))));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(hg.Vd("SI]G\u0013PDPH\u000e2ROEIA", (short) (C1499aX.Xd() ^ (-15906)), (short) (C1499aX.Xd() ^ (-5211))));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {providerAuthority, 0};
            Method method = cls.getMethod(C1561oA.ud("UGTOKTB\u001fJHM=EJ%FBH:44@", (short) (OY.Xd() ^ 26025)), clsArr);
            try {
                method.setAccessible(true);
                ProviderInfo providerInfo2 = (ProviderInfo) method.invoke(packageManager, objArr);
                if (providerInfo2 == null) {
                    throw new PackageManager.NameNotFoundException(strXd + providerAuthority);
                }
                if (!providerInfo2.packageName.equals(fontRequest.getProviderPackage())) {
                    StringBuilder sbAppend = new StringBuilder(str).append(providerAuthority);
                    short sXd3 = (short) (FB.Xd() ^ 29402);
                    short sXd4 = (short) (FB.Xd() ^ 13779);
                    int[] iArr2 = new int["Q8^]Pg\u001cwmY;5\u001f<\u007f][k.\u001a\u0003\u001a".length()];
                    QB qb2 = new QB("Q8^]Pg\u001cwmY;5\u001f<\u007f][k.\u001a\u0003\u001a");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                        i3++;
                    }
                    throw new PackageManager.NameNotFoundException(sbAppend.append(new String(iArr2, 0, i3)).append(fontRequest.getProviderPackage()).toString());
                }
                String str2 = providerInfo2.packageName;
                Class<?> cls2 = Class.forName(C1561oA.yd("!/\"1+&\u001eh\u001b($+\u0019#&`@>{\u001f-05,/.\u0013(2&)(\u0012", (short) (C1580rY.Xd() ^ (-23601))));
                Class<?>[] clsArr2 = new Class[2];
                clsArr2[0] = Class.forName(C1561oA.Yd("H@VB\u0010OESM\u0015;]\\TZT", (short) (FB.Xd() ^ 14428)));
                clsArr2[1] = Integer.TYPE;
                Object[] objArr2 = {str2, 64};
                Method method2 = cls2.getMethod(Xg.qd("@?O,>AJAHG,RKU", (short) (C1499aX.Xd() ^ (-511)), (short) (C1499aX.Xd() ^ (-1971))), clsArr2);
                try {
                    method2.setAccessible(true);
                    List<byte[]> listConvertToByteArrayList = convertToByteArrayList(((PackageInfo) method2.invoke(packageManager, objArr2)).signatures);
                    Collections.sort(listConvertToByteArrayList, sByteArrayComparator);
                    for (int i4 = 0; i4 < certificates.size(); i4++) {
                        ArrayList arrayList = new ArrayList(certificates.get(i4));
                        Collections.sort(arrayList, sByteArrayComparator);
                        if (equalsByteArrayList(listConvertToByteArrayList, arrayList)) {
                            sProviderCache.put(providerCacheKey, providerInfo2);
                            return providerInfo2;
                        }
                    }
                    Trace.endSection();
                    return null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } finally {
            Trace.endSection();
        }
    }

    static FontsContractCompat.FontInfo[] query(Context context, FontRequest fontRequest, String str, CancellationSignal cancellationSignal) {
        Uri uriWithAppendedId;
        Trace.beginSection("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentQueryWrapper contentQueryWrapperMake = ContentQueryWrapper.make(context, uriBuild);
            Cursor cursorQuery = null;
            try {
                boolean z2 = true;
                String[] strArr = {"_id", FontsContractCompat.Columns.FILE_ID, FontsContractCompat.Columns.TTC_INDEX, FontsContractCompat.Columns.VARIATION_SETTINGS, FontsContractCompat.Columns.WEIGHT, FontsContractCompat.Columns.ITALIC, FontsContractCompat.Columns.RESULT_CODE};
                Trace.beginSection("ContentQueryWrapper.query");
                try {
                    cursorQuery = contentQueryWrapperMake.query(uriBuild, strArr, "query = ?", new String[]{fontRequest.getQuery()}, null, cancellationSignal);
                    try {
                        if (cursorQuery != null && cursorQuery.getCount() > 0) {
                            int columnIndex = cursorQuery.getColumnIndex(FontsContractCompat.Columns.RESULT_CODE);
                            arrayList = new ArrayList();
                            int columnIndex2 = cursorQuery.getColumnIndex("_id");
                            int columnIndex3 = cursorQuery.getColumnIndex(FontsContractCompat.Columns.FILE_ID);
                            int columnIndex4 = cursorQuery.getColumnIndex(FontsContractCompat.Columns.TTC_INDEX);
                            int columnIndex5 = cursorQuery.getColumnIndex(FontsContractCompat.Columns.WEIGHT);
                            int columnIndex6 = cursorQuery.getColumnIndex(FontsContractCompat.Columns.ITALIC);
                            while (cursorQuery.moveToNext()) {
                                int i2 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                                int i3 = columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2));
                                } else {
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                                }
                                int i4 = columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400;
                                if (columnIndex6 == -1 || cursorQuery.getInt(columnIndex6) != z2) {
                                    z2 = false;
                                }
                                arrayList.add(FontsContractCompat.FontInfo.create(uriWithAppendedId, i3, i4, z2, i2));
                                z2 = true;
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        contentQueryWrapperMake.close();
                        return (FontsContractCompat.FontInfo[]) arrayList.toArray(new FontsContractCompat.FontInfo[0]);
                    } catch (Throwable th) {
                        th = th;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        contentQueryWrapperMake.close();
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } finally {
        }
    }

    private static List<List<byte[]>> getCertificates(FontRequest fontRequest, Resources resources) {
        if (fontRequest.getCertificates() != null) {
            return fontRequest.getCertificates();
        }
        return FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
    }

    static /* synthetic */ int lambda$static$0(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            byte b3 = bArr2[i2];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }

    private static boolean equalsByteArrayList(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static List<byte[]> convertToByteArrayList(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private interface ContentQueryWrapper {
        void close();

        Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        static ContentQueryWrapper make(Context context, Uri uri) {
            return new ContentQueryWrapperApi24Impl(context, uri);
        }
    }

    private static class ContentQueryWrapperApi16Impl implements ContentQueryWrapper {
        private final ContentProviderClient mClient;

        ContentQueryWrapperApi16Impl(Context context, Uri uri) throws Throwable {
            Class<?> cls = Class.forName(Jg.Wd("4a}\u001f\u0005\u0012#M\u001aH\u001f9Q|W$O_\u0007\u0010g\u001b.", (short) (FB.Xd() ^ 25482), (short) (FB.Xd() ^ 27624)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-13344));
            short sXd2 = (short) (Od.Xd() ^ (-28872));
            int[] iArr = new int["]P\n\"(Rw9vrH-NA!){.".length()];
            QB qb = new QB("]P\n\"(Rw9vrH-NA!){.");
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
                this.mClient = ((ContentResolver) method.invoke(context, objArr)).acquireUnstableContentProviderClient(uri);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e2) {
                return null;
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
            ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    private static class ContentQueryWrapperApi24Impl implements ContentQueryWrapper {
        private final ContentProviderClient mClient;

        ContentQueryWrapperApi24Impl(Context context, Uri uri) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud(".\u000bF\n\b#E\u000fQHav)o~\u000bT((/Pe?", (short) (C1633zX.Xd() ^ (-11023)), (short) (C1633zX.Xd() ^ (-27758)))).getMethod(Ig.wd("?ro\u0016Z-aA~7\u0015H\u0007\u0007\u001eHa\u0003", (short) (ZN.Xd() ^ 21258)), new Class[0]);
            try {
                method.setAccessible(true);
                this.mClient = ((ContentResolver) method.invoke(context, objArr)).acquireUnstableContentProviderClient(uri);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e2) {
                return null;
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
            ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }
}
