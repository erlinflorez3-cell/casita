package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.core.util.ObjectsCompat;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
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
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private String mAuthority;
    private PathStrategy mLocalPathStrategy;
    private final Object mLock;
    private final int mResourceId;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File(RemoteSettings.FORWARD_SLASH_STRING);
    private static final HashMap<String, PathStrategy> sCache = new HashMap<>();

    interface PathStrategy {
        File getFileForUri(Uri uri);

        Uri getUriForFile(File file);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    public FileProvider() {
        this(0);
    }

    protected FileProvider(int i2) {
        this.mLock = new Object();
        this.mResourceId = i2;
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return getPathStrategy(context, str, 0).getUriForFile(file);
    }

    public static Uri getUriForFile(Context context, String str, File file, String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }

    private static PathStrategy getPathStrategy(Context context, String str, int i2) {
        PathStrategy pathStrategy;
        HashMap<String, PathStrategy> map = sCache;
        synchronized (map) {
            pathStrategy = map.get(str);
            if (pathStrategy == null) {
                try {
                    pathStrategy = parsePathStrategy(context, str, i2);
                    map.put(str, pathStrategy);
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (XmlPullParserException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return pathStrategy;
    }

    static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, ProviderInfo providerInfo, int i2) throws Throwable {
        if (providerInfo == null) {
            short sXd = (short) (FB.Xd() ^ 27923);
            short sXd2 = (short) (FB.Xd() ^ 143);
            int[] iArr = new int["g_>e\u0013C2M\u0011O5u\u001a&w'P}\u0007O+9[;J7=k\"\u001c\"&!\u0006\u000e=tU-\u0017kyjW\\:TF2.\u000bc".length()];
            QB qb = new QB("g_>e\u0013C2M\u0011O5u\u001a&w'P}\u0007O+9[;J7=k\"\u001c\"&!\u0006\u000e=tU-\u0017kyjW\\:TF2.\u000bc");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                i3++;
            }
            throw new IllegalArgumentException(new String(iArr, 0, i3) + str);
        }
        Bundle bundle = providerInfo.metaData;
        String strYd = C1561oA.yd("ftgvpkc.psklhlk&[__Ypba_cWOQ[iWIynv", (short) (ZN.Xd() ^ 17534));
        if (bundle == null && i2 != 0) {
            providerInfo.metaData = new Bundle(1);
            providerInfo.metaData.putInt(strYd, i2);
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("KYP_]XT\u001fUbbi[el'=jjqcwt", (short) (ZN.Xd() ^ 9374))).getMethod(Xg.qd("\"!1\u000e #,#*)\u0012'5)0/=", (short) (C1580rY.Xd() ^ (-15911)), (short) (C1580rY.Xd() ^ (-30228))), new Class[0]);
        try {
            method.setAccessible(true);
            XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData((PackageManager) method.invoke(context, objArr), strYd);
            if (xmlResourceParserLoadXmlMetaData != null) {
                return xmlResourceParserLoadXmlMetaData;
            }
            throw new IllegalArgumentException(Jg.Wd("\u0013R\u000e3\u0012JhRAox\f2\u0002~{NQ\u0002%m\u0006)w\u001b?\u0018\u0013Z^\u0002\u0014d|\u000b-Gey@|v\u0013\u0003]'[Y0\r;S\n", (short) (C1499aX.Xd() ^ (-32648)), (short) (C1499aX.Xd() ^ (-1399))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static PathStrategy parsePathStrategy(Context context, String str, int i2) throws Throwable {
        SimplePathStrategy simplePathStrategy = new SimplePathStrategy(str);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("`g$SoJ>T_X\tq@uO>.\u0003[9I\u0002\u0002", (short) (C1499aX.Xd() ^ (-2253)), (short) (C1499aX.Xd() ^ (-21728)))).getMethod(Ig.wd("\\%@M$q_#\u0003\u0002a\"\u0001o_|Q", (short) (C1607wl.Xd() ^ 16535)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            short sXd = (short) (C1580rY.Xd() ^ (-9880));
            int[] iArr = new int["\u0004Y#\u0017\rDYL=+*\f,A}V^C]\u0006R\"FBS\f\u0017x\u000e4Da\t".length()];
            QB qb = new QB("\u0004Y#\u0017\rDYL=+*\f,A}V^C]\u0006R\"FBS\f\u0017x\u000e4Da\t");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Class<?>[] clsArr = new Class[2];
            short sXd2 = (short) (FB.Xd() ^ 18606);
            int[] iArr2 = new int["$\u001a.\u0018c!\u0015!\u0019^\u0003# \u0016\u001a\u0012".length()];
            QB qb2 = new QB("$\u001a.\u0018c!\u0015!\u0019^\u0003# \u0016\u001a\u0012");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i4 + xuXd2.CK(iKK2));
                i4++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i4));
            clsArr[1] = Integer.TYPE;
            Object[] objArr2 = {str, 128};
            Method method2 = cls.getMethod(C1593ug.zd("$\u0018'$\"-\u001d{))0\",3\u0010319-)+9", (short) (OY.Xd() ^ 10346), (short) (OY.Xd() ^ 1467)), clsArr);
            try {
                method2.setAccessible(true);
                XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, (ProviderInfo) method2.invoke(packageManager, objArr2), i2);
                while (true) {
                    int next = fileProviderPathsMetaData.next();
                    if (next == 1) {
                        return simplePathStrategy;
                    }
                    if (next == 2) {
                        String name = fileProviderPathsMetaData.getName();
                        File externalStorageDirectory = null;
                        String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, C1561oA.od("!\u0013\u001e\u0015", (short) (C1580rY.Xd() ^ (-30014))));
                        String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, C1561oA.Kd("bTh]", (short) (C1607wl.Xd() ^ 7090)));
                        short sXd3 = (short) (Od.Xd() ^ (-24404));
                        short sXd4 = (short) (Od.Xd() ^ (-9705));
                        int[] iArr3 = new int["\u000f=\u001fu\u001cO\"\u0007h".length()];
                        QB qb3 = new QB("\u000f=\u001fu\u001cO\"\u0007h");
                        int i5 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i5] = xuXd3.fK(((i5 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
                            i5++;
                        }
                        if (new String(iArr3, 0, i5).equals(name)) {
                            externalStorageDirectory = DEVICE_ROOT;
                        } else if (C1561oA.Xd("imqkz5yk\u007ft", (short) (Od.Xd() ^ (-18712))).equals(name)) {
                            Object[] objArr3 = new Object[0];
                            Method method3 = Class.forName(Wg.vd("\u0014 \u0015\"&\u001f\u0019a\u000e\u0019\u0017\u001c\u0014\u001c!Y\u00061/4,>9", (short) (C1499aX.Xd() ^ (-23368)))).getMethod(Qg.kd("JGU&HJBO\u001fCK", (short) (C1499aX.Xd() ^ (-31246)), (short) (C1499aX.Xd() ^ (-19149))), new Class[0]);
                            try {
                                method3.setAccessible(true);
                                externalStorageDirectory = (File) method3.invoke(context, objArr3);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } else if (hg.Vd("ursws:|l~q", (short) (C1580rY.Xd() ^ (-12870)), (short) (C1580rY.Xd() ^ (-2584))).equals(name)) {
                            Object[] objArr4 = new Object[0];
                            Method method4 = Class.forName(C1561oA.ud(".:/<81+s(316&.3k\u007f+).\u001e0+", (short) (C1580rY.Xd() ^ (-17552)))).getMethod(C1561oA.yd("jiuEhkmk?ek", (short) (C1607wl.Xd() ^ 16384)), new Class[0]);
                            try {
                                method4.setAccessible(true);
                                externalStorageDirectory = (File) method4.invoke(context, objArr4);
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        } else if (C1561oA.Yd("aurdroco1ug{p", (short) (FB.Xd() ^ 12632)).equals(name)) {
                            externalStorageDirectory = Environment.getExternalStorageDirectory();
                        } else if (Xg.qd("(<9+96*6w26:4C}B4H=", (short) (C1499aX.Xd() ^ (-30236)), (short) (C1499aX.Xd() ^ (-15033))).equals(name)) {
                            File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(context, null);
                            if (externalFilesDirs.length > 0) {
                                externalStorageDirectory = externalFilesDirs[0];
                            }
                        } else if (Jg.Wd("7pt;\u000fr3\u0005\u001dI}GZ]-f\u001dx:", (short) (Od.Xd() ^ (-24269)), (short) (Od.Xd() ^ (-15869))).equals(name)) {
                            File[] externalCacheDirs = ContextCompat.getExternalCacheDirs(context);
                            if (externalCacheDirs.length > 0) {
                                externalStorageDirectory = externalCacheDirs[0];
                            }
                        } else if (ZO.xd("XD[f)x8\u0014\u0018: e\u001c4wo\u0017z\u007f", (short) (C1499aX.Xd() ^ (-3081)), (short) (C1499aX.Xd() ^ (-20008))).equals(name)) {
                            File[] externalMediaDirs = Api21Impl.getExternalMediaDirs(context);
                            if (externalMediaDirs.length > 0) {
                                externalStorageDirectory = externalMediaDirs[0];
                            }
                        }
                        if (externalStorageDirectory != null) {
                            simplePathStrategy.addRoot(attributeValue, buildPath(externalStorageDirectory, attributeValue2));
                        }
                    }
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private static int modeToMode(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                return 704643072;
            }
            if ("rw".equals(str)) {
                return 939524096;
            }
            if ("rwt".equals(str)) {
                return 1006632960;
            }
            throw new IllegalArgumentException("Invalid mode: " + str);
        }
        return 738197504;
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static String[] copyOf(String[] strArr, int i2) {
        String[] strArr2 = new String[i2];
        System.arraycopy(strArr, 0, strArr2, 0, i2);
        return strArr2;
    }

    private static Object[] copyOf(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String removeTrailingSlash(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        if (providerInfo.authority == null || providerInfo.authority.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str = providerInfo.authority.split(Global.SEMICOLON)[0];
        synchronized (this.mLock) {
            this.mAuthority = str;
        }
        HashMap<String, PathStrategy> map = sCache;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        File fileForUri = getLocalPathStrategy().getFileForUri(uri);
        String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i3 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i2 = i3 + 1;
                objArr[i3] = queryParameter == null ? fileForUri.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i2 = i3 + 1;
                objArr[i3] = Long.valueOf(fileForUri.length());
            }
            i3 = i2;
        }
        String[] strArrCopyOf = copyOf(strArr3, i3);
        Object[] objArrCopyOf = copyOf(objArr, i3);
        MatrixCursor matrixCursor = new MatrixCursor(strArrCopyOf, 1);
        matrixCursor.addRow(objArrCopyOf);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileForUri = getLocalPathStrategy().getFileForUri(uri);
        int iLastIndexOf = fileForUri.getName().lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileForUri.getName().substring(iLastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return getLocalPathStrategy().getFileForUri(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(getLocalPathStrategy().getFileForUri(uri), modeToMode(str));
    }

    private PathStrategy getLocalPathStrategy() {
        PathStrategy pathStrategy;
        synchronized (this.mLock) {
            ObjectsCompat.requireNonNull(this.mAuthority, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            if (this.mLocalPathStrategy == null) {
                this.mLocalPathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);
            }
            pathStrategy = this.mLocalPathStrategy;
        }
        return pathStrategy;
    }

    static class SimplePathStrategy implements PathStrategy {
        private final String mAuthority;
        private final HashMap<String, File> mRoots = new HashMap<>();

        SimplePathStrategy(String str) {
            this.mAuthority = str;
        }

        void addRoot(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.mRoots.put(str, file.getCanonicalFile());
            } catch (IOException e2) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e2);
            }
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public Uri getUriForFile(File file) {
            String strSubstring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.mRoots.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (belongsToRoot(canonicalPath, path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                if (path2.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                    strSubstring = canonicalPath.substring(path2.length());
                } else {
                    strSubstring = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority(this.mAuthority).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(strSubstring, RemoteSettings.FORWARD_SLASH_STRING)).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public File getFileForUri(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Unable to find path from root: " + uri);
            }
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.mRoots.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (belongsToRoot(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        private boolean belongsToRoot(String str, String str2) {
            return FileProvider.removeTrailingSlash(str).startsWith(FileProvider.removeTrailingSlash(str2) + '/');
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static File[] getExternalMediaDirs(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("7C8EA:4|1<:?/7<t\t427'94", (short) (C1607wl.Xd() ^ 5594), (short) (C1607wl.Xd() ^ 32537))).getMethod(C1561oA.ud("=:H\u0018JE5A<.8\u0018/-1(\n.66", (short) (C1607wl.Xd() ^ 5104)), new Class[0]);
            try {
                method.setAccessible(true);
                return (File[]) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
