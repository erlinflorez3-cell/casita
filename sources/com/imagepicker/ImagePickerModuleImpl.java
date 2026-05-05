package com.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ExecutorService;
import yg.C1580rY;
import yg.CX;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class ImagePickerModuleImpl implements ActivityEventListener {
    static final String NAME = "ImagePicker";
    public static final int REQUEST_LAUNCH_IMAGE_CAPTURE = 13001;
    public static final int REQUEST_LAUNCH_LIBRARY = 13003;
    public static final int REQUEST_LAUNCH_VIDEO_CAPTURE = 13002;
    Callback callback;
    Uri cameraCaptureURI;
    private Uri fileUri;
    Options options;
    private ReactApplicationContext reactContext;

    public ImagePickerModuleImpl(ReactApplicationContext reactApplicationContext) {
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public /* synthetic */ void lambda$onAssetsObtained$0(List list) {
        try {
            try {
                this.callback.invoke(Utils.getResponseMap(list, this.options, this.reactContext));
            } catch (RuntimeException e2) {
                this.callback.invoke(Utils.getErrorMap(Utils.errOthers, e2.getMessage()));
            }
        } finally {
            this.callback = null;
        }
    }

    public void launchCamera(ReadableMap readableMap, Callback callback) throws Exception {
        Intent intent;
        File fileCreateFile;
        int i2;
        if (!Utils.isCameraAvailable(this.reactContext)) {
            callback.invoke(Utils.getErrorMap(Utils.errCameraUnavailable, null));
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(Utils.getErrorMap(Utils.errOthers, "Activity error"));
            return;
        }
        if (!Utils.isCameraPermissionFulfilled(this.reactContext, currentActivity)) {
            callback.invoke(Utils.getErrorMap(Utils.errOthers, Utils.cameraPermissionDescription));
            return;
        }
        this.callback = callback;
        Options options = new Options(readableMap);
        this.options = options;
        if (options.saveToPhotos.booleanValue() && Build.VERSION.SDK_INT <= 28 && !Utils.hasPermission(currentActivity)) {
            callback.invoke(Utils.getErrorMap(Utils.errPermission, null));
            return;
        }
        if (this.options.mediaType.equals(Utils.mediaTypeVideo)) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.videoQuality", this.options.videoQuality);
            if (this.options.durationLimit > 0) {
                intent.putExtra("android.intent.extra.durationLimit", this.options.durationLimit);
            }
            fileCreateFile = Utils.createFile(this.reactContext, RRWebVideoEvent.REPLAY_CONTAINER);
            this.cameraCaptureURI = Utils.createUri(fileCreateFile, this.reactContext);
            i2 = REQUEST_LAUNCH_VIDEO_CAPTURE;
        } else {
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            fileCreateFile = Utils.createFile(this.reactContext, "jpg");
            this.cameraCaptureURI = Utils.createUri(fileCreateFile, this.reactContext);
            i2 = REQUEST_LAUNCH_IMAGE_CAPTURE;
        }
        if (this.options.useFrontCamera.booleanValue()) {
            Utils.setFrontCamera(intent);
        }
        this.fileUri = Uri.fromFile(fileCreateFile);
        intent.putExtra("output", this.cameraCaptureURI);
        intent.addFlags(3);
        CX.ud();
        try {
            currentActivity.startActivityForResult(intent, i2);
        } catch (ActivityNotFoundException e2) {
            callback.invoke(Utils.getErrorMap(Utils.errOthers, e2.getMessage()));
            this.callback = null;
        }
    }

    public void launchImageLibrary(ReadableMap readableMap, Callback callback) throws Exception {
        Intent intent;
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(Utils.getErrorMap(Utils.errOthers, "Activity error"));
            return;
        }
        this.callback = callback;
        Options options = new Options(readableMap);
        this.options = options;
        int pickImagesMaxLimit = options.selectionLimit;
        boolean z2 = pickImagesMaxLimit == 1;
        boolean zEquals = this.options.mediaType.equals(Utils.mediaTypePhoto);
        boolean zEquals2 = this.options.mediaType.equals(Utils.mediaTypeVideo);
        if (Build.VERSION.SDK_INT >= 33) {
            intent = new Intent("android.provider.action.PICK_IMAGES");
        } else if (z2 && (zEquals || zEquals2)) {
            intent = new Intent("android.intent.action.PICK");
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
        }
        if (!z2) {
            if (Build.VERSION.SDK_INT < 33) {
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            } else if (pickImagesMaxLimit != 1) {
                if (pickImagesMaxLimit == 0) {
                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", pickImagesMaxLimit);
            }
        }
        if (zEquals) {
            intent.setType("image/*");
        } else if (zEquals2) {
            intent.setType("video/*");
        } else if (Build.VERSION.SDK_INT < 33) {
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        }
        CX.ud();
        try {
            currentActivity.startActivityForResult(intent, REQUEST_LAUNCH_LIBRARY);
        } catch (ActivityNotFoundException e2) {
            callback.invoke(Utils.getErrorMap(Utils.errOthers, e2.getMessage()));
            this.callback = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.react.bridge.ActivityEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(android.app.Activity r5, int r6, int r7, android.content.Intent r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = com.imagepicker.Utils.isValidRequestCode(r6)
            if (r0 == 0) goto La
            com.facebook.react.bridge.Callback r0 = r4.callback
            if (r0 != 0) goto Lb
        La:
            return
        Lb:
            r0 = -1
            if (r7 == r0) goto L3c
            r0 = 13001(0x32c9, float:1.8218E-41)
            if (r6 != r0) goto L17
            android.net.Uri r0 = r4.fileUri
            com.imagepicker.Utils.deleteFile(r0)
        L17:
            r3 = 0
            com.facebook.react.bridge.Callback r1 = r4.callback     // Catch: java.lang.RuntimeException -> L26 java.lang.Throwable -> L85
            com.facebook.react.bridge.ReadableMap r0 = com.imagepicker.Utils.getCancelMap()     // Catch: java.lang.RuntimeException -> L26 java.lang.Throwable -> L85
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.RuntimeException -> L26 java.lang.Throwable -> L85
            r1.invoke(r0)     // Catch: java.lang.RuntimeException -> L26 java.lang.Throwable -> L85
            goto L82
        L26:
            r0 = move-exception
            com.facebook.react.bridge.Callback r2 = r4.callback     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = com.imagepicker.Utils.errOthers     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L85
            com.facebook.react.bridge.ReadableMap r0 = com.imagepicker.Utils.getErrorMap(r1, r0)     // Catch: java.lang.Throwable -> L85
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L85
            r2.invoke(r0)     // Catch: java.lang.Throwable -> L85
            r4.callback = r3
        L3c:
            switch(r6) {
                case 13001: goto L40;
                case 13002: goto L5d;
                case 13003: goto L7a;
                default: goto L3f;
            }
        L3f:
            goto La
        L40:
            com.imagepicker.Options r0 = r4.options
            java.lang.Boolean r0 = r0.saveToPhotos
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L53
            android.net.Uri r2 = r4.cameraCaptureURI
            com.facebook.react.bridge.ReactApplicationContext r1 = r4.reactContext
            java.lang.String r0 = "photo"
            com.imagepicker.Utils.saveToPublicDirectory(r2, r1, r0)
        L53:
            android.net.Uri r0 = r4.fileUri
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r4.onAssetsObtained(r0)
            goto La
        L5d:
            com.imagepicker.Options r0 = r4.options
            java.lang.Boolean r0 = r0.saveToPhotos
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
            android.net.Uri r2 = r4.cameraCaptureURI
            com.facebook.react.bridge.ReactApplicationContext r1 = r4.reactContext
            java.lang.String r0 = "video"
            com.imagepicker.Utils.saveToPublicDirectory(r2, r1, r0)
        L70:
            android.net.Uri r0 = r4.fileUri
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r4.onAssetsObtained(r0)
            goto La
        L7a:
            java.util.List r0 = com.imagepicker.Utils.collectUrisFromData(r8)
            r4.onAssetsObtained(r0)
            goto La
        L82:
            r4.callback = r3
            return
        L85:
            r0 = move-exception
            r4.callback = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.imagepicker.ImagePickerModuleImpl.onActivityResult(android.app.Activity, int, int, android.content.Intent):void");
    }

    void onAssetsObtained(final List<Uri> list) throws Throwable {
        Class<?> cls = Class.forName(hg.Vd("\u001a\u0010$\u000eY \u001e\u0012\u0014T\t\u0014\u0012\u0006\u0017\u0013\u0012\u0004\f\u0011I_\u0012}z\f\n\u0004\u0006\u0006", (short) (C1580rY.Xd() ^ (-15642)), (short) (C1580rY.Xd() ^ (-23934))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-21946));
        int[] iArr = new int["C9J%:>6:2 3<.)+\u000b=)&75/1".length()];
        QB qb = new QB("C9J%:>6:2 3<.)+\u000b=)&75/1");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            ((ExecutorService) declaredMethod.invoke(null, objArr)).submit(new Runnable() { // from class: com.imagepicker.ImagePickerModuleImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onAssetsObtained$0(list);
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}
