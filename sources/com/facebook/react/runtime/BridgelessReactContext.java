package com.facebook.react.runtime;

import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.JavaScriptModuleRegistry;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.common.annotations.FrameworkAPI;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherProvider;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
class BridgelessReactContext extends ReactApplicationContext implements EventDispatcherProvider {
    private final String TAG;
    private final ReactHostImpl mReactHost;
    private final AtomicReference<String> mSourceURL;

    private static class BridgelessJSModuleInvocationHandler implements InvocationHandler {
        private final Class<? extends JavaScriptModule> mJSModuleInterface;
        private final ReactHostImpl mReactHost;

        public BridgelessJSModuleInvocationHandler(ReactHostImpl reactHostImpl, Class<? extends JavaScriptModule> cls) {
            this.mReactHost = reactHostImpl;
            this.mJSModuleInterface = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            this.mReactHost.callFunctionOnModule(JavaScriptModuleRegistry.getJSModuleName(this.mJSModuleInterface), method.getName(), objArr != null ? Arguments.fromJavaArgs(objArr) : new WritableNativeArray());
            return null;
        }
    }

    BridgelessReactContext(Context context, ReactHostImpl reactHostImpl) {
        super(context);
        this.mSourceURL = new AtomicReference<>();
        this.TAG = getClass().getSimpleName();
        this.mReactHost = reactHostImpl;
        if (ReactNativeFeatureFlags.useFabricInterop()) {
            initializeInteropModules();
        }
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void emitDeviceEvent(String str, @Nullable Object obj) {
        this.mReactHost.callFunctionOnModule("RCTDeviceEventEmitter", "emit", Arguments.fromJavaArgs(new Object[]{str, obj}));
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        String str = this.TAG;
        return new BridgelessCatalystInstance(this.mReactHost);
    }

    DefaultHardwareBackBtnHandler getDefaultHardwareBackBtnHandler() {
        return this.mReactHost.getDefaultBackButtonHandler();
    }

    DevSupportManager getDevSupportManager() {
        return this.mReactHost.getDevSupportManager();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherProvider
    public EventDispatcher getEventDispatcher() {
        return this.mReactHost.getEventDispatcher();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public UIManager getFabricUIManager() {
        return this.mReactHost.getUIManager();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.mReactHost.getJSCallInvokerHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        return (this.mInteropModuleRegistry == null || !this.mInteropModuleRegistry.shouldReturnInteropModule(cls)) ? (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new BridgelessJSModuleInvocationHandler(this.mReactHost, cls)) : (T) this.mInteropModuleRegistry.getInteropModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    @FrameworkAPI
    @UnstableReactNativeAPI
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mReactHost.getJavaScriptContextHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        return (T) this.mReactHost.getNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public NativeModule getNativeModule(String str) {
        return this.mReactHost.getNativeModule(str);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection<NativeModule> getNativeModules() {
        return this.mReactHost.getNativeModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public String getSourceURL() {
        return this.mSourceURL.get();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception exc) {
        this.mReactHost.handleHostException(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Deprecated
    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        return this.mReactHost.isInstanceInitialized();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCatalystInstance() {
        return false;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        return this.mReactHost.hasNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.mReactHost.isInstanceInitialized();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return true;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i2, String str, Callback callback) {
        this.mReactHost.registerSegment(i2, str, callback);
    }

    public void setSourceURL(String str) {
        this.mSourceURL.set(str);
    }
}
