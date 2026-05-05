package com.facebook.react.runtime;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.HMRClient;
import com.facebook.react.devsupport.ReactInstanceDevHelper;
import com.facebook.react.devsupport.interfaces.DevSplitBundleCallback;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.Jg;
import yg.OY;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
class BridgelessDevSupportManager extends DevSupportManagerBase {
    private final ReactHostImpl mReactHost;

    /* JADX INFO: renamed from: com.facebook.react.runtime.BridgelessDevSupportManager$1 */
    class AnonymousClass1 implements DevSupportManagerBase.CallbackWithBundleLoader {
        final /* synthetic */ String val$bundlePath;
        final /* synthetic */ DevSplitBundleCallback val$callback;

        /* JADX INFO: renamed from: com.facebook.react.runtime.BridgelessDevSupportManager$1$1 */
        class C01551 implements Continuation<Boolean, Void> {
            C01551() {
            }

            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public Void then(Task<Boolean> task) {
                if (!task.getResult().equals(Boolean.TRUE)) {
                    return null;
                }
                String devServerSplitBundleURL = BridgelessDevSupportManager.this.getDevServerHelper().getDevServerSplitBundleURL(str);
                ReactContext currentReactContext = BridgelessDevSupportManager.this.mReactHost.getCurrentReactContext();
                if (currentReactContext != null) {
                    ((HMRClient) currentReactContext.getJSModule(HMRClient.class)).registerBundle(devServerSplitBundleURL);
                }
                devSplitBundleCallback.onSuccess();
                return null;
            }
        }

        AnonymousClass1(String str, DevSplitBundleCallback devSplitBundleCallback) {
            str = str;
            devSplitBundleCallback = devSplitBundleCallback;
        }

        @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
        public void onError(String str, Throwable th) {
            devSplitBundleCallback.onError(str, th);
        }

        @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
        public void onSuccess(JSBundleLoader jSBundleLoader) {
            BridgelessDevSupportManager.this.mReactHost.loadBundle(jSBundleLoader).onSuccess(new Continuation<Boolean, Void>() { // from class: com.facebook.react.runtime.BridgelessDevSupportManager.1.1
                C01551() {
                }

                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public Void then(Task<Boolean> task) {
                    if (!task.getResult().equals(Boolean.TRUE)) {
                        return null;
                    }
                    String devServerSplitBundleURL = BridgelessDevSupportManager.this.getDevServerHelper().getDevServerSplitBundleURL(str);
                    ReactContext currentReactContext = BridgelessDevSupportManager.this.mReactHost.getCurrentReactContext();
                    if (currentReactContext != null) {
                        ((HMRClient) currentReactContext.getJSModule(HMRClient.class)).registerBundle(devServerSplitBundleURL);
                    }
                    devSplitBundleCallback.onSuccess();
                    return null;
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.runtime.BridgelessDevSupportManager$2 */
    class AnonymousClass2 implements ReactInstanceDevHelper {
        AnonymousClass2() {
        }

        @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
        public View createRootView(String str) {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null || reactHostImpl.isSurfaceWithModuleNameAttached(str)) {
                return null;
            }
            ReactSurfaceImpl reactSurfaceImplCreateWithView = ReactSurfaceImpl.createWithView(currentActivity, str, new Bundle());
            reactSurfaceImplCreateWithView.attach(reactHostImpl);
            reactSurfaceImplCreateWithView.start();
            return reactSurfaceImplCreateWithView.getView();
        }

        @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
        public void destroyRootView(View view) {
        }

        @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
        public Activity getCurrentActivity() {
            return reactHostImpl.getLastUsedActivity();
        }

        @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
        public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
            throw new IllegalStateException("Not implemented for bridgeless mode");
        }

        @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
        public void onJSBundleLoadedFromServer() {
        }

        @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
        public void onReloadWithJSDebugger(JavaJSExecutor.Factory factory) {
        }

        @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
        public void toggleElementInspector() {
            ReactContext currentReactContext = reactHostImpl.getCurrentReactContext();
            if (currentReactContext != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) currentReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("toggleElementInspector", null);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BridgelessDevSupportManager(ReactHostImpl reactHostImpl, Context context, String str) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("q+,JRx\u0004Y\u001e6`ws\t\u001e\u0004)ak\u0002\u001e>I", (short) (OY.Xd() ^ OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE_START), (short) (OY.Xd() ^ 11912))).getMethod(ZO.xd("f]g\u001a\u0010\u001d_%\u000f3w\u0013\u0015.Q(!\u001f.S4", (short) (C1580rY.Xd() ^ (-17476)), (short) (C1580rY.Xd() ^ (-5029))), new Class[0]);
        try {
            method.setAccessible(true);
            super((Context) method.invoke(context, objArr), createInstanceDevHelper(reactHostImpl), str, true, null, null, 2, null, null, null, null);
            this.mReactHost = reactHostImpl;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static ReactInstanceDevHelper createInstanceDevHelper(ReactHostImpl reactHostImpl) {
        return new ReactInstanceDevHelper() { // from class: com.facebook.react.runtime.BridgelessDevSupportManager.2
            AnonymousClass2() {
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public View createRootView(String str) {
                Activity currentActivity = getCurrentActivity();
                if (currentActivity == null || reactHostImpl.isSurfaceWithModuleNameAttached(str)) {
                    return null;
                }
                ReactSurfaceImpl reactSurfaceImplCreateWithView = ReactSurfaceImpl.createWithView(currentActivity, str, new Bundle());
                reactSurfaceImplCreateWithView.attach(reactHostImpl);
                reactSurfaceImplCreateWithView.start();
                return reactSurfaceImplCreateWithView.getView();
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public void destroyRootView(View view) {
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public Activity getCurrentActivity() {
                return reactHostImpl.getLastUsedActivity();
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
                throw new IllegalStateException("Not implemented for bridgeless mode");
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public void onJSBundleLoadedFromServer() {
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public void onReloadWithJSDebugger(JavaJSExecutor.Factory factory) {
            }

            @Override // com.facebook.react.devsupport.ReactInstanceDevHelper
            public void toggleElementInspector() {
                ReactContext currentReactContext = reactHostImpl.getCurrentReactContext();
                if (currentReactContext != null) {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) currentReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("toggleElementInspector", null);
                }
            }
        };
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerBase
    protected String getUniqueTag() {
        return "Bridgeless";
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void handleReloadJS() {
        UiThreadUtil.assertOnUiThread();
        hideRedboxDialog();
        this.mReactHost.reload("BridgelessDevSupportManager.handleReloadJS()");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void loadSplitBundleFromServer(String str, DevSplitBundleCallback devSplitBundleCallback) {
        fetchSplitBundleAndCreateBundleLoader(str, new DevSupportManagerBase.CallbackWithBundleLoader() { // from class: com.facebook.react.runtime.BridgelessDevSupportManager.1
            final /* synthetic */ String val$bundlePath;
            final /* synthetic */ DevSplitBundleCallback val$callback;

            /* JADX INFO: renamed from: com.facebook.react.runtime.BridgelessDevSupportManager$1$1 */
            class C01551 implements Continuation<Boolean, Void> {
                C01551() {
                }

                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public Void then(Task<Boolean> task) {
                    if (!task.getResult().equals(Boolean.TRUE)) {
                        return null;
                    }
                    String devServerSplitBundleURL = BridgelessDevSupportManager.this.getDevServerHelper().getDevServerSplitBundleURL(str);
                    ReactContext currentReactContext = BridgelessDevSupportManager.this.mReactHost.getCurrentReactContext();
                    if (currentReactContext != null) {
                        ((HMRClient) currentReactContext.getJSModule(HMRClient.class)).registerBundle(devServerSplitBundleURL);
                    }
                    devSplitBundleCallback.onSuccess();
                    return null;
                }
            }

            AnonymousClass1(String str2, DevSplitBundleCallback devSplitBundleCallback2) {
                str = str2;
                devSplitBundleCallback = devSplitBundleCallback2;
            }

            @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
            public void onError(String str2, Throwable th) {
                devSplitBundleCallback.onError(str2, th);
            }

            @Override // com.facebook.react.devsupport.DevSupportManagerBase.CallbackWithBundleLoader
            public void onSuccess(JSBundleLoader jSBundleLoader) {
                BridgelessDevSupportManager.this.mReactHost.loadBundle(jSBundleLoader).onSuccess(new Continuation<Boolean, Void>() { // from class: com.facebook.react.runtime.BridgelessDevSupportManager.1.1
                    C01551() {
                    }

                    @Override // com.facebook.react.runtime.internal.bolts.Continuation
                    public Void then(Task<Boolean> task) {
                        if (!task.getResult().equals(Boolean.TRUE)) {
                            return null;
                        }
                        String devServerSplitBundleURL = BridgelessDevSupportManager.this.getDevServerHelper().getDevServerSplitBundleURL(str);
                        ReactContext currentReactContext = BridgelessDevSupportManager.this.mReactHost.getCurrentReactContext();
                        if (currentReactContext != null) {
                            ((HMRClient) currentReactContext.getJSModule(HMRClient.class)).registerBundle(devServerSplitBundleURL);
                        }
                        devSplitBundleCallback.onSuccess();
                        return null;
                    }
                });
            }
        });
    }
}
