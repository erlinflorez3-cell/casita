package com.reactnativecommunity.webview;

import android.app.DownloadManager;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0012\r\u0001\u0014!\u001d\u0010\"\u001d.\u0003$\u0018(\u001e\u0016")
public class RNCWebViewModule extends ReactContextBaseJavaModule {
    private final RNCWebViewModuleImpl mRNCWebViewModuleImpl;

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRNCWebViewModuleImpl = new RNCWebViewModuleImpl(reactApplicationContext);
    }

    public void downloadFile(String str) {
        this.mRNCWebViewModuleImpl.downloadFile(str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return RNCWebViewModuleImpl.NAME;
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        return this.mRNCWebViewModuleImpl.grantFileDownloaderPermissions(str, str2);
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        promise.resolve(Boolean.valueOf(this.mRNCWebViewModuleImpl.isFileUploadSupported()));
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.mRNCWebViewModuleImpl.setDownloadRequest(request);
    }

    @ReactMethod
    public void shouldStartLoadWithLockIdentifier(boolean z2, double d2) {
        this.mRNCWebViewModuleImpl.shouldStartLoadWithLockIdentifier(z2, d2);
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) throws Exception {
        this.mRNCWebViewModuleImpl.startPhotoPickerIntent(str, valueCallback);
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z2, boolean z3) {
        return this.mRNCWebViewModuleImpl.startPhotoPickerIntent(strArr, z2, valueCallback, z3);
    }
}
