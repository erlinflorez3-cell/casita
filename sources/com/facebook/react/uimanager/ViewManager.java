package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.yoga.YogaMeasureMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ViewManager<T extends View, C extends ReactShadowNode> extends BaseJavaModule {
    private static final String NAME = "ViewManager";
    private HashMap<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mRecyclableViews = null;
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRecyclableViews = null;
    }

    private Stack<T> getRecyclableViewStack(int i2, boolean z2) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (z2 && !map.containsKey(Integer.valueOf(i2))) {
            this.mRecyclableViews.put(Integer.valueOf(i2), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i2));
    }

    protected void addEventEmitters(ThemedReactContext themedReactContext, T t2) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    public T createView(int i2, ThemedReactContext themedReactContext, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper, JSResponderHandler jSResponderHandler) {
        T t2 = (T) createViewInstance(i2, themedReactContext, reactStylesDiffMap, stateWrapper);
        if (t2 instanceof ReactInterceptingViewGroup) {
            ((ReactInterceptingViewGroup) t2).setOnInterceptTouchEventListener(jSResponderHandler);
        }
        return t2;
    }

    protected T createViewInstance(int i2, ThemedReactContext themedReactContext, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        Object objUpdateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(themedReactContext.getSurfaceId(), true);
        T t2 = (recyclableViewStack == null || recyclableViewStack.empty()) ? (T) createViewInstance(themedReactContext) : (T) recycleView(themedReactContext, recyclableViewStack.pop());
        t2.setId(i2);
        addEventEmitters(themedReactContext, t2);
        if (reactStylesDiffMap != null) {
            updateProperties(t2, reactStylesDiffMap);
        }
        if (stateWrapper != null && (objUpdateState = updateState(t2, reactStylesDiffMap, stateWrapper)) != null) {
            updateExtraData(t2, objUpdateState);
        }
        return t2;
    }

    protected abstract T createViewInstance(ThemedReactContext themedReactContext);

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    protected ViewManagerDelegate<T> getDelegate() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return ViewManagerPropertyUpdater.getNativeProps(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, YogaMeasureMode yogaMeasureMode, float f3, YogaMeasureMode yogaMeasureMode2, float[] fArr) {
        return 0L;
    }

    public long measure(Context context, MapBuffer mapBuffer, MapBuffer mapBuffer2, MapBuffer mapBuffer3, float f2, YogaMeasureMode yogaMeasureMode, float f3, YogaMeasureMode yogaMeasureMode2, float[] fArr) {
        return 0L;
    }

    protected void onAfterUpdateTransaction(T t2) {
    }

    public void onDropViewInstance(T t2) {
        View viewPrepareToRecycleView;
        Context context = t2.getContext();
        if (context == null) {
            FLog.e(NAME, "onDropViewInstance: view [" + t2.getId() + "] has a null context");
            return;
        }
        if (!(context instanceof ThemedReactContext)) {
            FLog.e(NAME, "onDropViewInstance: view [" + t2.getId() + "] has a context that is not a ThemedReactContext: " + context);
            return;
        }
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        Stack<T> recyclableViewStack = getRecyclableViewStack(themedReactContext.getSurfaceId(), false);
        if (recyclableViewStack == null || (viewPrepareToRecycleView = prepareToRecycleView(themedReactContext, t2)) == null) {
            return;
        }
        recyclableViewStack.push(viewPrepareToRecycleView);
    }

    public void onSurfaceStopped(int i2) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i2));
        }
    }

    protected abstract T prepareToRecycleView(ThemedReactContext themedReactContext, T t2);

    @Deprecated
    public void receiveCommand(T t2, int i2, ReadableArray readableArray) {
    }

    public void receiveCommand(T t2, String str, ReadableArray readableArray) {
        ViewManagerDelegate<T> delegate = getDelegate();
        if (delegate != null) {
            delegate.receiveCommand(t2, str, readableArray);
        }
    }

    protected T recycleView(ThemedReactContext themedReactContext, T t2) {
        return t2;
    }

    public void setPadding(T t2, int i2, int i3, int i4, int i5) {
    }

    protected void setupViewRecycling() {
        if (ReactNativeFeatureFlags.enableViewRecycling()) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public abstract void updateExtraData(T t2, Object obj);

    public void updateProperties(T t2, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerDelegate<T> delegate = getDelegate();
        if (delegate != null) {
            ViewManagerPropertyUpdater.updateProps(delegate, t2, reactStylesDiffMap);
        } else {
            ViewManagerPropertyUpdater.updateProps(this, t2, reactStylesDiffMap);
        }
        onAfterUpdateTransaction(t2);
    }

    public Object updateState(T t2, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        return null;
    }
}
