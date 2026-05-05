package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes3.dex */
class BlobCollector {

    /* JADX INFO: renamed from: com.facebook.react.modules.blob.BlobCollector$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ BlobModule val$blobModule;

        AnonymousClass1(BlobModule blobModule) {
            blobModule = blobModule;
        }

        @Override // java.lang.Runnable
        public void run() {
            JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
            if (javaScriptContextHolder == null || javaScriptContextHolder.get() == 0) {
                return;
            }
            BlobCollector.nativeInstall(blobModule, javaScriptContextHolder.get());
        }
    }

    static {
        SoLoader.loadLibrary("reactnativeblob");
    }

    BlobCollector() {
    }

    static void install(ReactContext reactContext, BlobModule blobModule) {
        reactContext.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.modules.blob.BlobCollector.1
            final /* synthetic */ BlobModule val$blobModule;

            AnonymousClass1(BlobModule blobModule2) {
                blobModule = blobModule2;
            }

            @Override // java.lang.Runnable
            public void run() {
                JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
                if (javaScriptContextHolder == null || javaScriptContextHolder.get() == 0) {
                    return;
                }
                BlobCollector.nativeInstall(blobModule, javaScriptContextHolder.get());
            }
        });
    }

    public static native void nativeInstall(Object obj, long j2);
}
