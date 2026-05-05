package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherProvider;

/* JADX INFO: loaded from: classes3.dex */
public class UIManagerHelper {
    public static final int PADDING_BOTTOM_INDEX = 3;
    public static final int PADDING_END_INDEX = 1;
    public static final int PADDING_START_INDEX = 0;
    public static final int PADDING_TOP_INDEX = 2;
    private static final String TAG = "com.facebook.react.uimanager.UIManagerHelper";

    public static float[] getDefaultTextInputPadding(Context context) {
        EditText editText = new EditText(context);
        return new float[]{PixelUtil.toDIPFromPixel(ViewCompat.getPaddingStart(editText)), PixelUtil.toDIPFromPixel(ViewCompat.getPaddingEnd(editText)), PixelUtil.toDIPFromPixel(editText.getPaddingTop()), PixelUtil.toDIPFromPixel(editText.getPaddingBottom())};
    }

    public static EventDispatcher getEventDispatcher(ReactContext reactContext, int i2) {
        if (reactContext.isBridgeless()) {
            boolean z2 = reactContext instanceof ThemedReactContext;
            Object reactApplicationContext = reactContext;
            if (z2) {
                reactApplicationContext = ((ThemedReactContext) reactContext).getReactApplicationContext();
            }
            return ((EventDispatcherProvider) reactApplicationContext).getEventDispatcher();
        }
        UIManager uIManager = getUIManager(reactContext, i2, false);
        if (uIManager == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Unable to find UIManager for UIManagerType " + i2));
            return null;
        }
        EventDispatcher eventDispatcher = uIManager.getEventDispatcher();
        if (eventDispatcher == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot get EventDispatcher for UIManagerType " + i2));
        }
        return eventDispatcher;
    }

    public static EventDispatcher getEventDispatcherForReactTag(ReactContext reactContext, int i2) {
        EventDispatcher eventDispatcher = getEventDispatcher(reactContext, ViewUtil.getUIManagerType(i2));
        if (eventDispatcher == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot get EventDispatcher for reactTag " + i2));
        }
        return eventDispatcher;
    }

    public static ReactContext getReactContext(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    public static int getSurfaceId(Context context) {
        if (context instanceof ThemedReactContext) {
            return ((ThemedReactContext) context).getSurfaceId();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getSurfaceId(View view) {
        if (view instanceof ReactRoot) {
            ReactRoot reactRoot = (ReactRoot) view;
            if (reactRoot.getUIManagerType() == 2) {
                return reactRoot.getRootViewTag();
            }
            return -1;
        }
        int id = view.getId();
        if (ViewUtil.getUIManagerType(id) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof ThemedReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int surfaceId = getSurfaceId(context);
        if (surfaceId == -1) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Fabric View [" + id + "] does not have SurfaceId associated with it"));
        }
        return surfaceId;
    }

    public static UIManager getUIManager(ReactContext reactContext, int i2) {
        return getUIManager(reactContext, i2, true);
    }

    private static UIManager getUIManager(ReactContext reactContext, int i2, boolean z2) {
        if (reactContext.isBridgeless()) {
            UIManager fabricUIManager = reactContext.getFabricUIManager();
            if (fabricUIManager != null) {
                return fabricUIManager;
            }
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet."));
            return null;
        }
        if (!reactContext.hasCatalystInstance()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        }
        if (!reactContext.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
            if (z2) {
                return null;
            }
        }
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        try {
            return i2 == 2 ? reactContext.getFabricUIManager() : (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        } catch (IllegalArgumentException unused) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get UIManager for UIManagerType: " + i2));
            return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        }
    }

    public static UIManager getUIManagerForReactTag(ReactContext reactContext, int i2) {
        return getUIManager(reactContext, ViewUtil.getUIManagerType(i2));
    }
}
