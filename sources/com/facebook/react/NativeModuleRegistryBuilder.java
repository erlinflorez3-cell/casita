package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class NativeModuleRegistryBuilder {
    private final Map<String, ModuleHolder> mModules = new HashMap();
    private final ReactApplicationContext mReactApplicationContext;

    public NativeModuleRegistryBuilder(ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    public NativeModuleRegistry build() {
        return new NativeModuleRegistry(this.mReactApplicationContext, this.mModules);
    }

    public void processPackage(ReactPackage reactPackage) {
        for (ModuleHolder moduleHolder : reactPackage instanceof LazyReactPackage ? ((LazyReactPackage) reactPackage).getNativeModuleIterator(this.mReactApplicationContext) : reactPackage instanceof BaseReactPackage ? ((BaseReactPackage) reactPackage).getNativeModuleIterator(this.mReactApplicationContext) : ReactPackageHelper.getNativeModuleIterator(reactPackage, this.mReactApplicationContext)) {
            String name = moduleHolder.getName();
            if (this.mModules.containsKey(name)) {
                ModuleHolder moduleHolder2 = this.mModules.get(name);
                if (!moduleHolder.getCanOverrideExistingModule()) {
                    throw new IllegalStateException("Native module " + name + " tried to override " + moduleHolder2.getClassName() + ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                }
                this.mModules.remove(moduleHolder2);
            }
            this.mModules.put(name, moduleHolder);
        }
    }
}
