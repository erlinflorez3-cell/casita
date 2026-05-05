package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.util.Pair;
import com.braze.models.FeatureFlag;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.CX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public class RNCWebViewModuleImpl implements ActivityEventListener {
    public static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
    public static final String NAME = "RNCWebViewModule";
    public static final int PICKER = 1;
    public static final int PICKER_LEGACY = 3;
    protected static final ShouldOverrideUrlLoadingLock shouldOverrideUrlLoadingLock = new ShouldOverrideUrlLoadingLock();
    private final ReactApplicationContext mContext;
    private DownloadManager.Request mDownloadRequest;
    private ValueCallback<Uri[]> mFilePathCallback;
    private ValueCallback<Uri> mFilePathCallbackLegacy;
    private File mOutputImage;
    private File mOutputVideo;

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebViewModuleImpl$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$reactnativecommunity$webview$RNCWebViewModuleImpl$MimeType;

        static {
            int[] iArr = new int[MimeType.values().length];
            $SwitchMap$com$reactnativecommunity$webview$RNCWebViewModuleImpl$MimeType = iArr;
            try {
                iArr[MimeType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$reactnativecommunity$webview$RNCWebViewModuleImpl$MimeType[MimeType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum MimeType {
        DEFAULT("*/*"),
        IMAGE(FeatureFlag.PROPERTIES_TYPE_IMAGE),
        VIDEO(RRWebVideoEvent.EVENT_TAG);

        private final String value;

        MimeType(String str) {
            this.value = str;
        }
    }

    protected static class ShouldOverrideUrlLoadingLock {
        private double nextLockIdentifier = 1.0d;
        private final HashMap<Double, AtomicReference<ShouldOverrideCallbackState>> shouldOverrideLocks = new HashMap<>();

        protected enum ShouldOverrideCallbackState {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        protected ShouldOverrideUrlLoadingLock() {
        }

        public synchronized AtomicReference<ShouldOverrideCallbackState> getLock(Double d2) {
            return this.shouldOverrideLocks.get(d2);
        }

        public synchronized Pair<Double, AtomicReference<ShouldOverrideCallbackState>> getNewLock() {
            double d2;
            AtomicReference<ShouldOverrideCallbackState> atomicReference;
            d2 = this.nextLockIdentifier;
            this.nextLockIdentifier = 1.0d + d2;
            atomicReference = new AtomicReference<>(ShouldOverrideCallbackState.UNDECIDED);
            this.shouldOverrideLocks.put(Double.valueOf(d2), atomicReference);
            return new Pair<>(Double.valueOf(d2), atomicReference);
        }

        public synchronized void removeLock(Double d2) {
            this.shouldOverrideLocks.remove(d2);
        }
    }

    public RNCWebViewModuleImpl(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(MimeType.IMAGE.value));
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, MimeType.DEFAULT.value).booleanValue() || arrayContainsString(acceptedMimeType, MimeType.IMAGE.value).booleanValue());
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(MimeType.VIDEO.value));
    }

    private Boolean acceptsVideo(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, MimeType.DEFAULT.value).booleanValue() || arrayContainsString(acceptedMimeType, MimeType.VIDEO.value).booleanValue());
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (noAcceptTypesSet(strArr).booleanValue()) {
            return new String[]{MimeType.DEFAULT.value};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (str.matches("\\.\\w+")) {
                String mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(".", ""));
                if (mimeTypeFromExtension != null) {
                    strArr2[i2] = mimeTypeFromExtension;
                } else {
                    strArr2[i2] = str;
                }
            } else {
                strArr2[i2] = str;
            }
        }
        return strArr2;
    }

    private Intent getFileChooserIntent(String str) {
        String mimeTypeFromExtension = str.isEmpty() ? MimeType.DEFAULT.value : str;
        if (str.matches("\\.\\w+")) {
            mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(mimeTypeFromExtension);
        return intent;
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z2) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(MimeType.DEFAULT.value);
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z2);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private PermissionAwareActivity getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = this.mContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof PermissionAwareActivity) {
            return (PermissionAwareActivity) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    private PermissionListener getWebviewFileDownloaderPermissionListener(final String str, final String str2) {
        return new PermissionListener() { // from class: com.reactnativecommunity.webview.RNCWebViewModuleImpl.1
            @Override // com.facebook.react.modules.core.PermissionListener
            public boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
                if (i2 != 1) {
                    return false;
                }
                if (iArr.length <= 0 || iArr[0] != 0) {
                    Toast.makeText(RNCWebViewModuleImpl.this.mContext, str2, 1).show();
                } else if (RNCWebViewModuleImpl.this.mDownloadRequest != null) {
                    RNCWebViewModuleImpl.this.downloadFile(str);
                }
                return true;
            }
        };
    }

    private Boolean noAcceptTypesSet(String[] strArr) {
        String str;
        boolean z2 = true;
        if (strArr.length != 0 && (strArr.length != 1 || (str = strArr[0]) == null || str.length() != 0)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public void downloadFile(String str) {
        try {
            ((DownloadManager) this.mContext.getSystemService("download")).enqueue(this.mDownloadRequest);
            Toast.makeText(this.mContext, str, 1).show();
        } catch (IllegalArgumentException | SecurityException e2) {
        }
    }

    public File getCapturedFile(MimeType mimeType) throws IOException {
        String str;
        String str2;
        int i2 = AnonymousClass2.$SwitchMap$com$reactnativecommunity$webview$RNCWebViewModuleImpl$MimeType[mimeType.ordinal()];
        if (i2 == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (i2 != 2) {
            str = "";
            str2 = "";
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        String str5 = str + String.valueOf(System.currentTimeMillis()) + str2;
        return File.createTempFile(str, str2, this.mContext.getExternalFilesDir(null));
    }

    public Uri getOutputUri(File file) {
        return FileProvider.getUriForFile(this.mContext, this.mContext.getPackageName() + ".fileprovider", file);
    }

    public Intent getPhotoIntent() {
        Intent intent;
        Uri outputUri;
        try {
            File capturedFile = getCapturedFile(MimeType.IMAGE);
            this.mOutputImage = capturedFile;
            outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        } catch (IOException | IllegalArgumentException e2) {
            e = e2;
            intent = null;
        }
        try {
            intent.putExtra("output", outputUri);
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
        } catch (IllegalArgumentException e4) {
            e = e4;
            e.printStackTrace();
        }
        return intent;
    }

    public Uri[] getSelectedFiles(Intent intent, int i2) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() == null) {
            if (intent.getData() == null || i2 != -1) {
                return null;
            }
            return WebChromeClient.FileChooserParams.parseResult(i2, intent);
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i3 = 0; i3 < itemCount; i3++) {
            uriArr[i3] = intent.getClipData().getItemAt(i3).getUri();
        }
        return uriArr;
    }

    public Intent getVideoIntent() {
        Intent intent;
        Uri outputUri;
        try {
            File capturedFile = getCapturedFile(MimeType.VIDEO);
            this.mOutputVideo = capturedFile;
            outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } catch (IOException | IllegalArgumentException e2) {
            e = e2;
            intent = null;
        }
        try {
            intent.putExtra("output", outputUri);
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
        } catch (IllegalArgumentException e4) {
            e = e4;
            e.printStackTrace();
        }
        return intent;
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        Activity currentActivity = this.mContext.getCurrentActivity();
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        boolean z2 = ContextCompat.checkSelfPermission(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z2) {
            getPermissionAwareActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, getWebviewFileDownloaderPermissionListener(str, str2));
        }
        return z2;
    }

    public boolean isFileUploadSupported() {
        return true;
    }

    protected boolean needsCameraPermission() throws Throwable {
        String strQd = C1561oA.Qd("\u000f\u001b\u0010\u001d\u0019\u0012\fT\u0016\n\u0016\u0010\u000b\u0014\u0013\b\r\u000bI]Ze\\hV", (short) (C1499aX.Xd() ^ (-27984)));
        Activity currentActivity = this.mContext.getCurrentActivity();
        PackageManager packageManager = currentActivity.getPackageManager();
        try {
            Context applicationContext = currentActivity.getApplicationContext();
            short sXd = (short) (C1499aX.Xd() ^ (-14213));
            short sXd2 = (short) (C1499aX.Xd() ^ (-3639));
            int[] iArr = new int["\u0014\"\u0019(&!\u001dg\u001e++2$.5o\u000633:,@=".length()];
            QB qb = new QB("\u0014\"\u0019(&!\u001dg\u001e++2$.5o\u000633:,@=");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = cls.getMethod(C1561oA.od(",)7\u0012\"#*\u001f$!\t\u001b&\u001d", (short) (C1499aX.Xd() ^ (-26669))), new Class[0]);
            try {
                method.setAccessible(true);
                String str = (String) method.invoke(applicationContext, objArr);
                Class<?> cls2 = Class.forName(C1561oA.Kd("\u001f-$31,(r)66=/9@z><}!36?6=<%:H<CBP", (short) (OY.Xd() ^ 32263)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(Wg.Zd(";~c:T~C:\u00046+6\u0004F9~", (short) (C1633zX.Xd() ^ (-31819)), (short) (C1633zX.Xd() ^ (-32658))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {str, 4096};
                Method method2 = cls2.getMethod(C1561oA.Xd("yx\tewz\u0004z\u0002\u0001e\f\u0005\u000f", (short) (Od.Xd() ^ (-32208))), clsArr);
                try {
                    method2.setAccessible(true);
                    return Arrays.asList(((PackageInfo) method2.invoke(packageManager, objArr2)).requestedPermissions).contains(strQd) && ContextCompat.checkSelfPermission(currentActivity, strQd) != 0;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i2, int i3, Intent intent) {
        if (this.mFilePathCallback == null && this.mFilePathCallbackLegacy == null) {
            return;
        }
        File file = this.mOutputImage;
        boolean z2 = file != null && file.length() > 0;
        File file2 = this.mOutputVideo;
        boolean z3 = file2 != null && file2.length() > 0;
        if (i2 != 1) {
            if (i2 == 3) {
                if (i3 != -1) {
                    this.mFilePathCallbackLegacy.onReceiveValue(null);
                } else if (z2) {
                    this.mFilePathCallbackLegacy.onReceiveValue(getOutputUri(this.mOutputImage));
                } else if (z3) {
                    this.mFilePathCallbackLegacy.onReceiveValue(getOutputUri(this.mOutputVideo));
                } else {
                    this.mFilePathCallbackLegacy.onReceiveValue(intent.getData());
                }
            }
        } else if (i3 != -1) {
            ValueCallback<Uri[]> valueCallback = this.mFilePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else if (z2) {
            this.mFilePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.mOutputImage)});
        } else if (z3) {
            this.mFilePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.mOutputVideo)});
        } else {
            this.mFilePathCallback.onReceiveValue(getSelectedFiles(intent, i3));
        }
        File file3 = this.mOutputImage;
        if (file3 != null && !z2) {
            file3.delete();
        }
        File file4 = this.mOutputVideo;
        if (file4 != null && !z3) {
            file4.delete();
        }
        this.mFilePathCallback = null;
        this.mFilePathCallbackLegacy = null;
        this.mOutputImage = null;
        this.mOutputVideo = null;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.mDownloadRequest = request;
    }

    public void shouldStartLoadWithLockIdentifier(boolean z2, double d2) {
        AtomicReference<ShouldOverrideUrlLoadingLock.ShouldOverrideCallbackState> lock = shouldOverrideUrlLoadingLock.getLock(Double.valueOf(d2));
        if (lock != null) {
            synchronized (lock) {
                lock.set(z2 ? ShouldOverrideUrlLoadingLock.ShouldOverrideCallbackState.DO_NOT_OVERRIDE : ShouldOverrideUrlLoadingLock.ShouldOverrideCallbackState.SHOULD_OVERRIDE);
                lock.notify();
            }
        }
    }

    public void startPhotoPickerIntent(String str, ValueCallback<Uri> valueCallback) throws Exception {
        Intent videoIntent;
        Intent photoIntent;
        this.mFilePathCallbackLegacy = valueCallback;
        Activity currentActivity = this.mContext.getCurrentActivity();
        Intent intentCreateChooser = Intent.createChooser(getFileChooserIntent(str), "");
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
            arrayList.add(photoIntent);
        }
        if (acceptsVideo(str).booleanValue() && (videoIntent = getVideoIntent()) != null) {
            arrayList.add(videoIntent);
        }
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intentCreateChooser.resolveActivity(currentActivity.getPackageManager()) != null) {
            CX.ud();
            currentActivity.startActivityForResult(intentCreateChooser, 3);
        }
    }

    public boolean startPhotoPickerIntent(String[] strArr, boolean z2, ValueCallback<Uri[]> valueCallback, boolean z3) throws Exception {
        Intent videoIntent;
        this.mFilePathCallback = valueCallback;
        Activity currentActivity = this.mContext.getCurrentActivity();
        ArrayList arrayList = new ArrayList();
        Intent photoIntent = null;
        if (!needsCameraPermission()) {
            if (acceptsImages(strArr).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
                arrayList.add(photoIntent);
            }
            if (acceptsVideo(strArr).booleanValue() && (videoIntent = getVideoIntent()) != null) {
                arrayList.add(videoIntent);
            }
        }
        Intent intent = new Intent("android.intent.action.CHOOSER");
        if (!z3) {
            intent.putExtra("android.intent.extra.INTENT", getFileChooserIntent(strArr, z2));
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            photoIntent = intent;
        }
        if (photoIntent != null && photoIntent.resolveActivity(currentActivity.getPackageManager()) != null) {
            CX.ud();
            currentActivity.startActivityForResult(photoIntent, 1);
        }
        return true;
    }
}
