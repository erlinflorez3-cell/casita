package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManager;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ReanimatedUIImplementation extends UIImplementation {
    public ReanimatedUIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, int i2) {
        super(reactApplicationContext, viewManagerRegistry, new UIViewOperationQueue(reactApplicationContext, new ReanimatedNativeHierarchyManager(viewManagerRegistry, reactApplicationContext), i2), eventDispatcher);
    }

    public ReanimatedUIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, EventDispatcher eventDispatcher, int i2) {
        this(reactApplicationContext, new ViewManagerRegistry(viewManagerResolver), eventDispatcher, i2);
    }

    public ReanimatedUIImplementation(ReactApplicationContext reactApplicationContext, List<ViewManager> list, EventDispatcher eventDispatcher, int i2) {
        this(reactApplicationContext, new ViewManagerRegistry(list), eventDispatcher, i2);
    }

    @Override // com.facebook.react.uimanager.UIImplementation
    public void manageChildren(int i2, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) throws Throwable {
        super.manageChildren(i2, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }
}
