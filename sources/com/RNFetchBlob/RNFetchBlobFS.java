package com.RNFetchBlob;

import android.content.pm.ApplicationInfo;
import android.content.res.AssetFileDescriptor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.RNFetchBlob.Utils.PathResolver;
import com.facebook.common.util.UriUtil;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
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
class RNFetchBlobFS {
    private static HashMap<String, RNFetchBlobFS> fileStreams = new HashMap<>();
    private DeviceEventManagerModule.RCTDeviceEventEmitter emitter;
    private ReactApplicationContext mCtx;
    private String encoding = "base64";
    private OutputStream writeStreamInstance = null;

    /* JADX INFO: renamed from: com.RNFetchBlob.RNFetchBlobFS$1 */
    class AnonymousClass1 extends AsyncTask<String, Integer, Integer> {
        AnonymousClass1() {
        }

        @Override // android.os.AsyncTask
        public Integer doInBackground(String... strArr) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            if (strArr[0] == null) {
                callback.invoke("the path specified for lstat is either `null` or `undefined`.");
                return 0;
            }
            File file = new File(strArr[0]);
            if (!file.exists()) {
                callback.invoke("failed to lstat path `" + strArr[0] + "` because it does not exist or it is not a folder");
                return 0;
            }
            if (file.isDirectory()) {
                for (String str : file.list()) {
                    writableArrayCreateArray.pushMap(RNFetchBlobFS.statFile(file.getPath() + RemoteSettings.FORWARD_SLASH_STRING + str));
                }
            } else {
                writableArrayCreateArray.pushMap(RNFetchBlobFS.statFile(file.getAbsolutePath()));
            }
            callback.invoke(null, writableArrayCreateArray);
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.RNFetchBlob.RNFetchBlobFS$2 */
    class AnonymousClass2 implements MediaScannerConnection.OnScanCompletedListener {
        final /* synthetic */ Callback val$callback;

        AnonymousClass2(Callback callback) {
            callback = callback;
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            callback.invoke(null, true);
        }
    }

    /* JADX INFO: renamed from: com.RNFetchBlob.RNFetchBlobFS$3 */
    class AnonymousClass3 extends AsyncTask<ReadableArray, Integer, Integer> {
        AnonymousClass3() {
        }

        @Override // android.os.AsyncTask
        public Integer doInBackground(ReadableArray... readableArrayArr) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < readableArrayArr[0].size(); i2++) {
                    String string = readableArrayArr[0].getString(i2);
                    File file = new File(string);
                    if (file.exists() && !file.delete()) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.isEmpty()) {
                    callback.invoke(null, true);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to delete: ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next()).append(", ");
                    }
                    callback.invoke(sb.toString());
                }
            } catch (Exception e2) {
                callback.invoke(e2.getLocalizedMessage());
            }
            return Integer.valueOf(readableArrayArr[0].size());
        }
    }

    RNFetchBlobFS(ReactApplicationContext reactApplicationContext) {
        this.mCtx = reactApplicationContext;
        this.emitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    static void closeStream(String str, Callback callback) {
        try {
            OutputStream outputStream = fileStreams.get(str).writeStreamInstance;
            fileStreams.remove(str);
            outputStream.close();
            callback.invoke(new Object[0]);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x00ed A[Catch: Exception -> 0x00f1, TRY_LEAVE, TryCatch #8 {Exception -> 0x00f1, blocks: (B:123:0x00e8, B:125:0x00ed), top: B:135:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void cp(java.lang.String r7, java.lang.String r8, com.facebook.react.bridge.Callback r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.RNFetchBlobFS.cp(java.lang.String, java.lang.String, com.facebook.react.bridge.Callback):void");
    }

    static void createFile(String str, String str2, String str3, Promise promise) {
        try {
            File file = new File(str);
            boolean zCreateNewFile = file.createNewFile();
            if (str3.equals("uri")) {
                File file2 = new File(str2.replace(RNFetchBlobConst.FILE_PREFIX, ""));
                if (!file2.exists()) {
                    promise.reject("ENOENT", "Source file : " + str2 + " does not exist");
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(file2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[10240];
                for (int i2 = fileInputStream.read(bArr); i2 > 0; i2 = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, i2);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else {
                if (!zCreateNewFile) {
                    promise.reject("EEXIST", "File `" + str + "` already exists");
                    return;
                }
                new FileOutputStream(file).write(stringToBytes(str2, str3));
            }
            promise.resolve(str);
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    static void createFileASCII(String str, ReadableArray readableArray, Promise promise) {
        try {
            File file = new File(str);
            if (!file.createNewFile()) {
                promise.reject("EEXIST", "File at path `" + str + "` already exists");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[readableArray.size()];
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                bArr[i2] = (byte) readableArray.getInt(i2);
            }
            fileOutputStream.write(bArr);
            promise.resolve(str);
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    private static void deleteRecursive(File file) throws IOException {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new NullPointerException("Received null trying to list files of directory '" + file + "'");
            }
            for (File file2 : fileArrListFiles) {
                deleteRecursive(file2);
            }
        }
        if (!file.delete()) {
            throw new IOException("Failed to delete '" + file + "'");
        }
    }

    static void df(Callback callback) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("internal_free", String.valueOf(statFs.getFreeBytes()));
        writableMapCreateMap.putString("internal_total", String.valueOf(statFs.getTotalBytes()));
        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
        writableMapCreateMap.putString("external_free", String.valueOf(statFs2.getFreeBytes()));
        writableMapCreateMap.putString("external_total", String.valueOf(statFs2.getTotalBytes()));
        callback.invoke(null, writableMapCreateMap);
    }

    private void emitStreamEvent(String str, String str2, WritableArray writableArray) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(NotificationCompat.CATEGORY_EVENT, str2);
        writableMapCreateMap.putArray(ProductAction.ACTION_DETAIL, writableArray);
        this.emitter.emit(str, writableMapCreateMap);
    }

    private void emitStreamEvent(String str, String str2, String str3) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(NotificationCompat.CATEGORY_EVENT, str2);
        writableMapCreateMap.putString(ProductAction.ACTION_DETAIL, str3);
        this.emitter.emit(str, writableMapCreateMap);
    }

    private void emitStreamEvent(String str, String str2, String str3, String str4) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(NotificationCompat.CATEGORY_EVENT, str2);
        writableMapCreateMap.putString("code", str3);
        writableMapCreateMap.putString(ProductAction.ACTION_DETAIL, str4);
        this.emitter.emit(str, writableMapCreateMap);
    }

    static void exists(String str, Callback callback) {
        if (isAsset(str)) {
            try {
                RNFetchBlob.RCTContext.getAssets().openFd(str.replace(RNFetchBlobConst.FILE_PREFIX_BUNDLE_ASSET, ""));
                callback.invoke(true, false);
                return;
            } catch (IOException unused) {
                callback.invoke(false, false);
                return;
            }
        }
        String strNormalizePath = normalizePath(str);
        if (strNormalizePath == null) {
            callback.invoke(false, false);
            return;
        }
        callback.invoke(Boolean.valueOf(new File(strNormalizePath).exists()), Boolean.valueOf(new File(strNormalizePath).isDirectory()));
    }

    public static void getSDCardApplicationDir(ReactApplicationContext reactApplicationContext, Promise promise) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            promise.reject("RNFetchBlob.getSDCardApplicationDir", "External storage not mounted");
            return;
        }
        try {
            promise.resolve(reactApplicationContext.getExternalFilesDir(null).getParentFile().getAbsolutePath());
        } catch (Exception e2) {
            promise.reject("RNFetchBlob.getSDCardApplicationDir", e2.getLocalizedMessage());
        }
    }

    public static void getSDCardDir(Promise promise) {
        if (Environment.getExternalStorageState().equals("mounted")) {
            promise.resolve(Environment.getExternalStorageDirectory().getAbsolutePath());
        } else {
            promise.reject("RNFetchBlob.getSDCardDir", "External storage not mounted");
        }
    }

    static Map<String, Object> getSystemfolders(ReactApplicationContext reactApplicationContext) {
        Object obj;
        HashMap map = new HashMap();
        String absolutePath = reactApplicationContext.getFilesDir().getAbsolutePath();
        short sXd = (short) (OY.Xd() ^ 14673);
        int[] iArr = new int["a\u000e\u0003\u0016\u000f\b\u0012\u0019i\u0010\u001a".length()];
        QB qb = new QB("a\u000e\u0003\u0016\u000f\b\u0012\u0019i\u0010\u001a");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        map.put(new String(iArr, 0, i2), absolutePath);
        map.put(Wg.vd("NklptRv~", (short) (C1607wl.Xd() ^ 16326)), reactApplicationContext.getCacheDir().getAbsolutePath());
        map.put(Qg.kd("cafi_\u0004\f", (short) (C1580rY.Xd() ^ (-22875)), (short) (C1580rY.Xd() ^ (-10912))), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        map.put(hg.Vd("Rjcssoa?ck", (short) (C1607wl.Xd() ^ 27089), (short) (C1607wl.Xd() ^ 32068)), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        map.put(C1561oA.ud("\u0004+(\u001d\u0016u\u001a\"", (short) (C1607wl.Xd() ^ 25856)), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
        map.put(C1561oA.yd(".Z_WZ^MQ&LR", (short) (C1607wl.Xd() ^ 9376)), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        map.put(C1561oA.Yd("w\u001b#\u0017\u0014s\u001a$", (short) (C1580rY.Xd() ^ (-11784))), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        map.put(Xg.qd("LdjdrnnfFlv", (short) (Od.Xd() ^ (-3359)), (short) (Od.Xd() ^ (-16799))), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
        String externalStorageState = Environment.getExternalStorageState();
        short sXd2 = (short) (C1633zX.Xd() ^ (-3034));
        short sXd3 = (short) (C1633zX.Xd() ^ (-5488));
        int[] iArr2 = new int["<cmgQKN".length()];
        QB qb2 = new QB("<cmgQKN");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
            i3++;
        }
        if (externalStorageState.equals(new String(iArr2, 0, i3))) {
            String absolutePath2 = Environment.getExternalStorageDirectory().getAbsolutePath();
            short sXd4 = (short) (Od.Xd() ^ (-26672));
            short sXd5 = (short) (Od.Xd() ^ (-15040));
            int[] iArr3 = new int["_@]\u0015JD<1\"".length()];
            QB qb3 = new QB("_@]\u0015JD<1\"");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                i4++;
            }
            map.put(new String(iArr3, 0, i4), absolutePath2);
            File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
            String strUd = C1626yg.Ud("\u000bHNg\u0001{\u001f\u001a@x6#-G\u0005R3\u001d/?", (short) (C1499aX.Xd() ^ (-22712)), (short) (C1499aX.Xd() ^ (-1422)));
            if (externalFilesDir != null) {
                map.put(strUd, externalFilesDir.getParentFile().getAbsolutePath());
            } else {
                map.put(strUd, "");
            }
        }
        ApplicationInfo applicationInfo = reactApplicationContext.getApplicationInfo();
        short sXd6 = (short) (C1633zX.Xd() ^ (-17503));
        int[] iArr4 = new int["\rs5!\u00052_.9\u0007\u0006k.;+DR;QJ?\u00050)Gm\u001fBr\u007fz@Ps".length()];
        QB qb4 = new QB("\rs5!\u00052_.9\u0007\u0006k.;+DR;QJ?\u00050)Gm\u001fBr\u007fz@Ps");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd6 + i5)));
            i5++;
        }
        String str = new String(iArr4, 0, i5);
        String strOd = EO.Od("O\"xE \u001b8", (short) (C1499aX.Xd() ^ (-25261)));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 1 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            obj = field.get(applicationInfo);
        } catch (Throwable th) {
            obj = null;
        }
        map.put(C1561oA.Qd("8KRV)[SHOG%IQ", (short) (C1633zX.Xd() ^ (-25421))), (String) obj);
        return map;
    }

    static String getTmpPath(String str) {
        return RNFetchBlob.RCTContext.getFilesDir() + "/RNFetchBlobTmp_" + str;
    }

    static void hash(String str, String str2, Promise promise) {
        try {
            HashMap map = new HashMap();
            map.put("md5", MessageDigestAlgorithms.MD5);
            map.put("sha1", "SHA-1");
            map.put("sha224", "SHA-224");
            map.put("sha256", "SHA-256");
            map.put("sha384", "SHA-384");
            map.put("sha512", "SHA-512");
            if (!map.containsKey(str2)) {
                promise.reject("EINVAL", "Invalid algorithm '" + str2 + "', must be one of md5, sha1, sha224, sha256, sha384, sha512");
                return;
            }
            File file = new File(str);
            if (file.isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory");
                return;
            }
            if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + str + "'");
                return;
            }
            MessageDigest messageDigest = MessageDigest.getInstance((String) map.get(str2));
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[1048576];
            if (file.length() != 0) {
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    } else {
                        messageDigest.update(bArr, 0, i2);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (byte b2 : messageDigest.digest()) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            promise.resolve(sb.toString());
        } catch (Exception e2) {
            e2.printStackTrace();
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    private static InputStream inputStreamFromPath(String str) throws IOException {
        return str.startsWith(RNFetchBlobConst.FILE_PREFIX_BUNDLE_ASSET) ? RNFetchBlob.RCTContext.getAssets().open(str.replace(RNFetchBlobConst.FILE_PREFIX_BUNDLE_ASSET, "")) : new FileInputStream(new File(str));
    }

    static boolean isAsset(String str) {
        return str != null && str.startsWith(RNFetchBlobConst.FILE_PREFIX_BUNDLE_ASSET);
    }

    private static boolean isPathExists(String str) {
        if (!str.startsWith(RNFetchBlobConst.FILE_PREFIX_BUNDLE_ASSET)) {
            return new File(str).exists();
        }
        try {
            RNFetchBlob.RCTContext.getAssets().open(str.replace(RNFetchBlobConst.FILE_PREFIX_BUNDLE_ASSET, ""));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    static void ls(String str, Promise promise) {
        try {
            String strNormalizePath = normalizePath(str);
            File file = new File(strNormalizePath);
            if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + strNormalizePath + "'");
                return;
            }
            if (!file.isDirectory()) {
                promise.reject("ENOTDIR", "Not a directory '" + strNormalizePath + "'");
                return;
            }
            String[] list = new File(strNormalizePath).list();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (String str2 : list) {
                writableArrayCreateArray.pushString(str2);
            }
            promise.resolve(writableArrayCreateArray);
        } catch (Exception e2) {
            e2.printStackTrace();
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    static void lstat(String str, Callback callback) {
        new AsyncTask<String, Integer, Integer>() { // from class: com.RNFetchBlob.RNFetchBlobFS.1
            AnonymousClass1() {
            }

            @Override // android.os.AsyncTask
            public Integer doInBackground(String... strArr) {
                WritableArray writableArrayCreateArray = Arguments.createArray();
                if (strArr[0] == null) {
                    callback.invoke("the path specified for lstat is either `null` or `undefined`.");
                    return 0;
                }
                File file = new File(strArr[0]);
                if (!file.exists()) {
                    callback.invoke("failed to lstat path `" + strArr[0] + "` because it does not exist or it is not a folder");
                    return 0;
                }
                if (file.isDirectory()) {
                    for (String str2 : file.list()) {
                        writableArrayCreateArray.pushMap(RNFetchBlobFS.statFile(file.getPath() + RemoteSettings.FORWARD_SLASH_STRING + str2));
                    }
                } else {
                    writableArrayCreateArray.pushMap(RNFetchBlobFS.statFile(file.getAbsolutePath()));
                }
                callback.invoke(null, writableArrayCreateArray);
                return 0;
            }
        }.execute(normalizePath(str));
    }

    static void mkdir(String str, Promise promise) {
        File file = new File(str);
        if (file.exists()) {
            promise.reject("EEXIST", (file.isDirectory() ? "Folder" : "File") + " '" + str + "' already exists");
            return;
        }
        try {
            if (file.mkdirs()) {
                promise.resolve(true);
            } else {
                promise.reject("EUNSPECIFIED", "mkdir failed to create some or all directories in '" + str + "'");
            }
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    static void mv(String str, String str2, Callback callback) {
        File file = new File(str);
        if (!file.exists()) {
            callback.invoke("Source file at path `" + str + "` does not exist");
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 == -1) {
                    fileInputStream.close();
                    fileOutputStream.flush();
                    file.delete();
                    callback.invoke(new Object[0]);
                    return;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (FileNotFoundException unused) {
            callback.invoke("Source file not found.");
        } catch (Exception e2) {
            callback.invoke(e2.toString());
        }
    }

    static String normalizePath(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("\\w+\\:.*")) {
            return str;
        }
        if (str.startsWith("file://")) {
            return str.replace("file://", "");
        }
        return str.startsWith(RNFetchBlobConst.FILE_PREFIX_BUNDLE_ASSET) ? str : PathResolver.getRealPathFromURI(RNFetchBlob.RCTContext, Uri.parse(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void readFile(java.lang.String r10, java.lang.String r11, com.facebook.react.bridge.Promise r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.RNFetchBlobFS.readFile(java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    static void removeSession(ReadableArray readableArray, Callback callback) {
        new AsyncTask<ReadableArray, Integer, Integer>() { // from class: com.RNFetchBlob.RNFetchBlobFS.3
            AnonymousClass3() {
            }

            @Override // android.os.AsyncTask
            public Integer doInBackground(ReadableArray... readableArrayArr) {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < readableArrayArr[0].size(); i2++) {
                        String string = readableArrayArr[0].getString(i2);
                        File file = new File(string);
                        if (file.exists() && !file.delete()) {
                            arrayList.add(string);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        callback.invoke(null, true);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to delete: ");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            sb.append((String) it.next()).append(", ");
                        }
                        callback.invoke(sb.toString());
                    }
                } catch (Exception e2) {
                    callback.invoke(e2.getLocalizedMessage());
                }
                return Integer.valueOf(readableArrayArr[0].size());
            }
        }.execute(readableArray);
    }

    static void slice(String str, String str2, int i2, int i3, String str3, Promise promise) {
        try {
            String strNormalizePath = normalizePath(str);
            File file = new File(strNormalizePath);
            if (file.isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + strNormalizePath + "' is a directory");
                return;
            }
            if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + strNormalizePath + "'");
                return;
            }
            int length = (int) file.length();
            int iMin = Math.min(length, i3) - i2;
            FileInputStream fileInputStream = new FileInputStream(new File(strNormalizePath));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
            int iSkip = (int) fileInputStream.skip(i2);
            if (iSkip != i2) {
                promise.reject("EUNSPECIFIED", "Skipped " + iSkip + " instead of the specified " + i2 + " bytes, size is " + length);
                return;
            }
            byte[] bArr = new byte[10240];
            int i4 = 0;
            while (i4 < iMin) {
                int i5 = fileInputStream.read(bArr, 0, 10240);
                int i6 = iMin - i4;
                if (i5 <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, Math.min(i6, i5));
                i4 += i5;
            }
            fileInputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            promise.resolve(str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    static void stat(String str, Callback callback) {
        try {
            String strNormalizePath = normalizePath(str);
            WritableMap writableMapStatFile = statFile(strNormalizePath);
            if (writableMapStatFile == null) {
                callback.invoke("failed to stat path `" + strNormalizePath + "` because it does not exist or it is not a folder", null);
            } else {
                callback.invoke(null, writableMapStatFile);
            }
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage());
        }
    }

    static WritableMap statFile(String str) {
        try {
            String strNormalizePath = normalizePath(str);
            WritableMap writableMapCreateMap = Arguments.createMap();
            if (isAsset(strNormalizePath)) {
                String strReplace = strNormalizePath.replace(RNFetchBlobConst.FILE_PREFIX_BUNDLE_ASSET, "");
                AssetFileDescriptor assetFileDescriptorOpenFd = RNFetchBlob.RCTContext.getAssets().openFd(strReplace);
                writableMapCreateMap.putString("filename", strReplace);
                writableMapCreateMap.putString("path", strNormalizePath);
                writableMapCreateMap.putString("type", UriUtil.LOCAL_ASSET_SCHEME);
                writableMapCreateMap.putString(RRWebVideoEvent.JsonKeys.SIZE, String.valueOf(assetFileDescriptorOpenFd.getLength()));
                writableMapCreateMap.putInt("lastModified", 0);
            } else {
                File file = new File(strNormalizePath);
                if (!file.exists()) {
                    return null;
                }
                writableMapCreateMap.putString("filename", file.getName());
                writableMapCreateMap.putString("path", file.getPath());
                writableMapCreateMap.putString("type", file.isDirectory() ? "directory" : "file");
                writableMapCreateMap.putString(RRWebVideoEvent.JsonKeys.SIZE, String.valueOf(file.length()));
                writableMapCreateMap.putString("lastModified", String.valueOf(file.lastModified()));
            }
            return writableMapCreateMap;
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] stringToBytes(String str, String str2) throws Throwable {
        boolean zEqualsIgnoreCase = str2.equalsIgnoreCase(Ig.wd(",iEAW", (short) (Od.Xd() ^ (-16864))));
        short sXd = (short) (OY.Xd() ^ 29885);
        int[] iArr = new int["6^j\",i?7".length()];
        QB qb = new QB("6^j\",i?7");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        String str3 = new String(iArr, 0, i2);
        if (zEqualsIgnoreCase) {
            return str.getBytes(Charset.forName(str3));
        }
        if (!str2.toLowerCase().contains(C1561oA.Qd("xv\bxHE", (short) (C1580rY.Xd() ^ (-13762))))) {
            return str2.equalsIgnoreCase(Wg.Zd("4P-\u001c", (short) (FB.Xd() ^ 22008), (short) (FB.Xd() ^ 17787))) ? str.getBytes(Charset.forName(C1561oA.Xd("\u001c\u001c\u000fv\u0003", (short) (FB.Xd() ^ 85)))) : str.getBytes(Charset.forName(str3));
        }
        Object[] objArr = {str, 2};
        Method declaredMethod = Class.forName(C1593ug.zd("\"0'64/+u>>48z\u00100C6\b\u0007", (short) (C1580rY.Xd() ^ (-8661)), (short) (C1580rY.Xd() ^ (-23544)))).getDeclaredMethod(C1561oA.Kd("uwv\u0004y{", (short) (OY.Xd() ^ 5114)), Class.forName(C1561oA.od("\t~\u0013|H\u0006y\u0006}Cg\b\u0005z~v", (short) (C1607wl.Xd() ^ 18659))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return (byte[]) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void unlink(String str, Callback callback) {
        try {
            deleteRecursive(new File(normalizePath(str)));
            callback.invoke(null, true);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage(), false);
        }
    }

    static void writeArrayChunk(String str, ReadableArray readableArray, Callback callback) {
        try {
            OutputStream outputStream = fileStreams.get(str).writeStreamInstance;
            byte[] bArr = new byte[readableArray.size()];
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                bArr[i2] = (byte) readableArray.getInt(i2);
            }
            outputStream.write(bArr);
            callback.invoke(new Object[0]);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage());
        }
    }

    static void writeChunk(String str, String str2, Callback callback) {
        RNFetchBlobFS rNFetchBlobFS = fileStreams.get(str);
        try {
            rNFetchBlobFS.writeStreamInstance.write(stringToBytes(str2, rNFetchBlobFS.encoding));
            callback.invoke(new Object[0]);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage());
        }
    }

    static void writeFile(String str, ReadableArray readableArray, boolean z2, Promise promise) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    promise.reject("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                    return;
                } else if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, z2);
            try {
                byte[] bArr = new byte[readableArray.size()];
                for (int i2 = 0; i2 < readableArray.size(); i2++) {
                    bArr[i2] = (byte) readableArray.getInt(i2);
                }
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                promise.resolve(Integer.valueOf(readableArray.size()));
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v7 */
    static void writeFile(String str, String str2, String str3, boolean z2, Promise promise) throws Throwable {
        int length;
        ?? r6;
        ?? fileOutputStream;
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    promise.reject("EUNSPECIFIED", "Failed to create parent directory of '" + str + "'");
                    return;
                } else if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            if (str2.equalsIgnoreCase("uri")) {
                String strNormalizePath = normalizePath(str3);
                File file2 = new File(strNormalizePath);
                if (!file2.exists()) {
                    promise.reject("ENOENT", "No such file '" + str + "' ('" + strNormalizePath + "')");
                    return;
                }
                byte[] bArr = new byte[10240];
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        fileOutputStream = new FileOutputStream(file, z2);
                        fileInputStream = null;
                        length = 0;
                        while (true) {
                            try {
                                int i2 = fileInputStream2.read(bArr);
                                if (i2 <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i2);
                                length += i2;
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                r6 = fileOutputStream;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (r6 != 0) {
                                    r6.close();
                                }
                                throw th;
                            }
                        }
                        fileInputStream2.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileInputStream;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r6 = 0;
                }
            } else {
                byte[] bArrStringToBytes = stringToBytes(str3, str2);
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z2);
                try {
                    fileOutputStream2.write(bArrStringToBytes);
                    length = bArrStringToBytes.length;
                    fileOutputStream2.close();
                } finally {
                    fileOutputStream2.close();
                }
            }
            promise.resolve(Integer.valueOf(length));
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created, or it is a directory");
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    void readStream(String str, String str2, int i2, int i3, String str3) throws Throwable {
        String str4 = str;
        String strVd = Wg.vd("\u000f#\u0019\u0010\u0015\u000fS\t()\u0018($k]^", (short) (OY.Xd() ^ 19489));
        String strKd = Qg.kd("qo\u0001qA>", (short) (C1607wl.Xd() ^ 32323), (short) (C1607wl.Xd() ^ 10581));
        String strVd2 = hg.Vd("\u000f\u001b\u001a\u0016\u0018", (short) (C1580rY.Xd() ^ (-18000)), (short) (C1580rY.Xd() ^ (-28280)));
        String strUd = C1561oA.ud("=UXJGRIOIYCA{@H<G;?C;r2", (short) (Od.Xd() ^ (-10815)));
        String strNormalizePath = normalizePath(str4);
        if (strNormalizePath != null) {
            str4 = strNormalizePath;
        }
        try {
            int i4 = str2.equalsIgnoreCase(strKd) ? 4095 : 4096;
            if (i2 > 0) {
                i4 = i2;
            }
            InputStream inputStreamOpenInputStream = (strNormalizePath == null || !str4.startsWith(strVd)) ? strNormalizePath == null ? RNFetchBlob.RCTContext.getContentResolver().openInputStream(Uri.parse(str4)) : new FileInputStream(new File(str4)) : RNFetchBlob.RCTContext.getAssets().open(str4.replace(strVd, ""));
            byte[] bArr = new byte[i4];
            boolean zEqualsIgnoreCase = str2.equalsIgnoreCase(C1561oA.yd("xxk>", (short) (ZN.Xd() ^ 9660)));
            int i5 = -1;
            String strYd = C1561oA.Yd("wu\nw", (short) (ZN.Xd() ^ 18460));
            if (zEqualsIgnoreCase) {
                CharsetEncoder charsetEncoderNewEncoder = Charset.forName(Xg.qd(",,\u001f\u0007\u0013", (short) (C1633zX.Xd() ^ (-4623)), (short) (C1633zX.Xd() ^ (-11015)))).newEncoder();
                while (true) {
                    int i6 = inputStreamOpenInputStream.read(bArr);
                    if (i6 == i5) {
                        break;
                    }
                    charsetEncoderNewEncoder.encode(ByteBuffer.wrap(bArr).asCharBuffer());
                    emitStreamEvent(str3, strYd, new String(bArr, 0, i6));
                    if (i3 > 0) {
                        SystemClock.sleep(i3);
                    }
                    i5 = -1;
                }
            } else if (str2.equalsIgnoreCase(Jg.Wd("\u001b\n'\\q", (short) (C1607wl.Xd() ^ 9622), (short) (C1607wl.Xd() ^ 3753)))) {
                while (true) {
                    int i7 = inputStreamOpenInputStream.read(bArr);
                    if (i7 == -1) {
                        break;
                    }
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    for (int i8 = 0; i8 < i7; i8++) {
                        writableArrayCreateArray.pushInt(bArr[i8]);
                    }
                    emitStreamEvent(str3, strYd, writableArrayCreateArray);
                    if (i3 > 0) {
                        SystemClock.sleep(i3);
                    }
                }
            } else {
                if (!str2.equalsIgnoreCase(strKd)) {
                    emitStreamEvent(str3, strVd2, C1593ug.zd("+06?+7", (short) (Od.Xd() ^ (-11205)), (short) (Od.Xd() ^ (-19469))), strUd + str2 + C1561oA.od("\u0007QD\u0017\u000b\u0011\u0016\f\u0003=~\u0001:\t\u0007|6\u0005z3rsq\u0003sC@k6)h|zk<c.!``q`edZ", (short) (ZN.Xd() ^ 4090)));
                    inputStreamOpenInputStream.close();
                }
                while (true) {
                    int i9 = inputStreamOpenInputStream.read(bArr);
                    if (i9 == -1) {
                        break;
                    }
                    if (i9 < i4) {
                        byte[] bArr2 = new byte[i9];
                        System.arraycopy(bArr, 0, bArr2, 0, i9);
                        Object[] objArr = {bArr2, 2};
                        Method declaredMethod = Class.forName(ZO.xd("uZD\u001bXPD\u001aUc.~gb>9,~%", (short) (C1580rY.Xd() ^ (-10163)), (short) (C1580rY.Xd() ^ (-9942)))).getDeclaredMethod(C1626yg.Ud("\"2o6wiLmS]z\u0002J1", (short) (OY.Xd() ^ 18092), (short) (OY.Xd() ^ 30895)), byte[].class, Integer.TYPE);
                        try {
                            declaredMethod.setAccessible(true);
                            emitStreamEvent(str3, strYd, (String) declaredMethod.invoke(null, objArr));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } else {
                        short sXd = (short) (ZN.Xd() ^ 11557);
                        int[] iArr = new int["^\u0016:w,\u0002Py\u000b\u0019\b\u0015\b*A5^1V".length()];
                        QB qb = new QB("^\u0016:w,\u0002Py\u000b\u0019\b\u0015\b*A5^1V");
                        int i10 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i10] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i10 % C1561oA.Xd.length] ^ (sXd + i10)));
                            i10++;
                        }
                        Class<?> cls = Class.forName(new String(iArr, 0, i10));
                        Class<?>[] clsArr = {byte[].class, Integer.TYPE};
                        Object[] objArr2 = {bArr, 2};
                        short sXd2 = (short) (C1607wl.Xd() ^ 4657);
                        int[] iArr2 = new int["\bh\u001f\f\t.A\u0005\u001b1\u0005\"u`".length()];
                        QB qb2 = new QB("\bh\u001f\f\t.A\u0005\u001b1\u0005\"u`");
                        int i11 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i11] = xuXd2.fK((C1561oA.Xd[i11 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i11)) + xuXd2.CK(iKK2));
                            i11++;
                        }
                        Method declaredMethod2 = cls.getDeclaredMethod(new String(iArr2, 0, i11), clsArr);
                        try {
                            declaredMethod2.setAccessible(true);
                            emitStreamEvent(str3, strYd, (String) declaredMethod2.invoke(null, objArr2));
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    if (i3 > 0) {
                        SystemClock.sleep(i3);
                    }
                }
            }
            short sXd3 = (short) (C1633zX.Xd() ^ (-29202));
            int[] iArr3 = new int["pxm".length()];
            QB qb3 = new QB("pxm");
            int i12 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i12] = xuXd3.fK(sXd3 + sXd3 + sXd3 + i12 + xuXd3.CK(iKK3));
                i12++;
            }
            emitStreamEvent(str3, new String(iArr3, 0, i12), "");
            inputStreamOpenInputStream.close();
        } catch (FileNotFoundException unused) {
            short sXd4 = (short) (ZN.Xd() ^ 8365);
            int[] iArr4 = new int["4V\u0004X_NP\tTXXR\u0012\u001a".length()];
            QB qb4 = new QB("4V\u0004X_NP\tTXXR\u0012\u001a");
            int i13 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i13] = xuXd4.fK((sXd4 ^ i13) + xuXd4.CK(iKK4));
                i13++;
            }
            emitStreamEvent(str3, strVd2, hg.Vd("fnnckp", (short) (C1633zX.Xd() ^ (-2773)), (short) (C1633zX.Xd() ^ (-31446))), new String(iArr4, 0, i13) + str4 + Qg.kd("O", (short) (ZN.Xd() ^ 4839), (short) (ZN.Xd() ^ 20037)));
        } catch (Exception e4) {
            emitStreamEvent(str3, strVd2, C1561oA.Xd("\u007f\u0011\u000b\u0011\u000f\u0005\u0004\u000b\t\r\n\n", (short) (Od.Xd() ^ (-11394))), C1561oA.Kd("^z\u0004\b\u0002\u0002>\u0014\u0010A\u0006\u0013\u0013\u001c\f\u001a\u001dI\u000f\r!\u000fN$ Q", (short) (C1499aX.Xd() ^ (-29299))) + str2 + Wg.Zd("F85~]^\u0014E5Uhzd\u0014\u0001\u001c@!i~[T\u0016D5B``W\u0005sJ@j\\C\u0014\u0012\u0001\b0}\u001aZ\u0015H1\u0018?p*7BRD\u0004x\u0006\u001d\u001b\u0012?.\u0018\t'\u001a*CX\u000emv7Jh\nxiQpi", (short) (C1499aX.Xd() ^ (-20864)), (short) (C1499aX.Xd() ^ (-13081))));
            e4.printStackTrace();
        }
    }

    void scanFile(String[] strArr, String[] strArr2, Callback callback) {
        try {
            MediaScannerConnection.scanFile(this.mCtx, strArr, strArr2, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.RNFetchBlob.RNFetchBlobFS.2
                final /* synthetic */ Callback val$callback;

                AnonymousClass2(Callback callback2) {
                    callback = callback2;
                }

                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str, Uri uri) {
                    callback.invoke(null, true);
                }
            });
        } catch (Exception e2) {
            callback2.invoke(e2.getLocalizedMessage(), null);
        }
    }

    void writeStream(String str, String str2, boolean z2, Callback callback) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (file.exists()) {
                if (file.isDirectory()) {
                    callback.invoke("EISDIR", "Expecting a file but '" + str + "' is a directory");
                    return;
                }
            } else if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                callback.invoke("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                return;
            } else if (!file.createNewFile()) {
                callback.invoke("ENOENT", "File '" + str + "' does not exist and could not be created");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str, z2);
            this.encoding = str2;
            String string = UUID.randomUUID().toString();
            fileStreams.put(string, this);
            this.writeStreamInstance = fileOutputStream;
            callback.invoke(null, null, string);
        } catch (Exception e2) {
            callback.invoke("EUNSPECIFIED", "Failed to create write stream at path `" + str + "`; " + e2.getLocalizedMessage());
        }
    }
}
