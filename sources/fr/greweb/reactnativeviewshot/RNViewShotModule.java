package fr.greweb.reactnativeviewshot;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import fr.greweb.reactnativeviewshot.ViewShot;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class RNViewShotModule extends ReactContextBaseJavaModule {
    public static final String RNVIEW_SHOT = "RNViewShot";
    private static final String TEMP_FILE_PREFIX = "ReactNative-snapshot-image";
    private final Executor executor;
    private final ReactApplicationContext reactContext;

    private static class CleanTask extends GuardedAsyncTask<Void, Void> implements FilenameFilter {
        private final File cacheDir;
        private final File externalCacheDir;

        private CleanTask(ReactContext reactContext) {
            super(reactContext);
            this.cacheDir = reactContext.getCacheDir();
            this.externalCacheDir = reactContext.getExternalCacheDir();
        }

        private void cleanDirectory(File file) {
            File[] fileArrListFiles = file.listFiles(this);
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.delete()) {
                        String str = "deleted file: " + file2.getAbsolutePath();
                    }
                }
            }
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(RNViewShotModule.TEMP_FILE_PREFIX);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            File file = this.cacheDir;
            if (file != null) {
                cleanDirectory(file);
            }
            File file2 = this.externalCacheDir;
            if (file2 != null) {
                cleanDirectory(file2);
            }
        }
    }

    public RNViewShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.executor = Executors.newCachedThreadPool();
        this.reactContext = reactApplicationContext;
    }

    private File createTempFile(Context context, String str, String str2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("}\f\u0003\u0012\u0010\u000b\u0007Q\b\u0015\u0015\u001c\u000e\u0018\u001fYo\u001d\u001d$\u0016*'", (short) (C1499aX.Xd() ^ (-26446)))).getMethod(Xg.qd("po\u007fQ\u0006\u0003t\u0003\u007fs\u007fWvy\u007f}]\u0004\u000e", (short) (C1607wl.Xd() ^ 30003), (short) (C1607wl.Xd() ^ 5371)), new Class[0]);
        try {
            method.setAccessible(true);
            File file = (File) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Jg.Wd("JZ\u000b[#_Uaa8qz6\u0002B>\u001eM\u000fW\u0013h_", (short) (C1580rY.Xd() ^ (-5628)), (short) (C1580rY.Xd() ^ (-20517)))).getMethod(ZO.xd("JCAn:;\u007frcN{", (short) (FB.Xd() ^ 4822), (short) (FB.Xd() ^ 27013)), new Class[0]);
            try {
                method2.setAccessible(true);
                File file2 = (File) method2.invoke(context, objArr2);
                if (file == null && file2 == null) {
                    throw new IOException(C1626yg.Ud("Wf\u001cIli\n\u000b,d\u0016cJs\\\u0006~1EUU\f\"g&@ba", (short) (C1499aX.Xd() ^ (-5060)), (short) (C1499aX.Xd() ^ (-7634))));
                }
                if (file == null || (file2 != null && file.getFreeSpace() <= file2.getFreeSpace())) {
                    file = file2;
                }
                String str3 = Ig.wd(",", (short) (FB.Xd() ^ 15074)) + str;
                return str2 != null ? File.createTempFile(str2, str3, file) : File.createTempFile(EO.Od("j-\u000bq#1\\0GE*[PM@6mh\b949WOgu", (short) (Od.Xd() ^ (-28110))), str3, file);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.facebook.react.bridge.Promise] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.facebook.react.bridge.Promise] */
    @ReactMethod
    public void captureRef(int i2, ReadableMap readableMap, Promise promise) {
        getReactApplicationContext().getResources().getDisplayMetrics();
        String string = readableMap.getString("format");
        int i3 = 0;
        int i4 = "jpg".equals(string) ? 0 : "webm".equals(string) ? 2 : "raw".equals(string) ? -1 : 1;
        double d2 = readableMap.getDouble("quality");
        Integer numValueOf = readableMap.hasKey("width") ? Integer.valueOf(readableMap.getInt("width")) : null;
        Integer numValueOf2 = readableMap.hasKey("height") ? Integer.valueOf(readableMap.getInt("height")) : null;
        String string2 = readableMap.getString("result");
        ?? r3 = "handleGLSurfaceViewOnAndroid";
        try {
            r3 = promise;
            i3 = i2;
            ((UIManagerModule) this.reactContext.getNativeModule(UIManagerModule.class)).addUIBlock(new ViewShot(i3, string, i4, d2, numValueOf, numValueOf2, ViewShot.Results.TEMP_FILE.equals(string2) ? createTempFile(getReactApplicationContext(), string, readableMap.hasKey("fileName") ? readableMap.getString("fileName") : null) : null, string2, Boolean.valueOf(readableMap.getBoolean("snapshotContentContainer")), this.reactContext, getCurrentActivity(), readableMap.hasKey("handleGLSurfaceViewOnAndroid") && readableMap.getBoolean("handleGLSurfaceViewOnAndroid"), r3, this.executor));
        } catch (Throwable th) {
            String str = "Failed to snapshot view tag " + i3;
            r3.reject(ViewShot.ERROR_UNABLE_TO_SNAPSHOT, "Failed to snapshot view tag " + i3);
        }
    }

    @ReactMethod
    public void captureScreen(ReadableMap readableMap, Promise promise) {
        captureRef(-1, readableMap, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return RNVIEW_SHOT;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        new CleanTask(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void releaseCapture(String str) {
        String path = Uri.parse(str).getPath();
        if (path == null) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile.equals(this.reactContext.getExternalCacheDir()) || parentFile.equals(this.reactContext.getCacheDir())) {
                file.delete();
            }
        }
    }
}
