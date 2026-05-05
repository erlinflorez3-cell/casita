package com.facebook.react.uimanager.events;

import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.common.ViewUtil;

/* JADX INFO: loaded from: classes3.dex */
class ReactEventEmitter implements RCTModernEventEmitter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ReactEventEmitter";
    private final ReactApplicationContext mReactContext;
    private RCTModernEventEmitter mFabricEventEmitter = null;
    private RCTEventEmitter mDefaultEventEmitter = null;

    public ReactEventEmitter(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
    }

    private RCTEventEmitter getDefaultEventEmitter() {
        if (this.mDefaultEventEmitter == null) {
            if (this.mReactContext.hasActiveReactInstance()) {
                this.mDefaultEventEmitter = (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter from Context, no active Catalyst instance!"));
            }
        }
        return this.mDefaultEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i2, int i3, String str, WritableMap writableMap) {
        receiveEvent(i2, i3, str, false, 0, writableMap, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i2, int i3, String str, boolean z2, int i4, WritableMap writableMap, int i5) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int uIManagerType = ViewUtil.getUIManagerType(i3, i2);
        if (uIManagerType == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            rCTModernEventEmitter.receiveEvent(i2, i3, str, z2, i4, writableMap, i5);
            return;
        }
        if (uIManagerType != 1) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot find EventEmitter for receiveEvent: SurfaceId[" + i2 + "] ReactTag[" + i3 + "] UIManagerType[" + uIManagerType + "] EventName[" + str + "]"));
            return;
        }
        RCTEventEmitter defaultEventEmitter = getDefaultEventEmitter();
        if (defaultEventEmitter != null) {
            defaultEventEmitter.receiveEvent(i3, str, writableMap);
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i2, String str, WritableMap writableMap) {
        receiveEvent(-1, i2, str, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(TouchEvent touchEvent) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int viewTag = touchEvent.getViewTag();
        int uIManagerType = ViewUtil.getUIManagerType(touchEvent.getViewTag(), touchEvent.getSurfaceId());
        if (uIManagerType == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            TouchesHelper.sendTouchEvent(rCTModernEventEmitter, touchEvent);
        } else if (uIManagerType != 1 || getDefaultEventEmitter() == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot find EventEmitter for receivedTouches: ReactTag[" + viewTag + "] UIManagerType[" + uIManagerType + "] EventName[" + touchEvent.getEventName() + "]"));
        } else {
            TouchesHelper.sendTouchesLegacy(this.mDefaultEventEmitter, touchEvent);
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        Assertions.assertCondition(writableArray.size() > 0);
        if (ViewUtil.getUIManagerType(writableArray.getMap(0).getInt("target")) != 1 || getDefaultEventEmitter() == null) {
            return;
        }
        this.mDefaultEventEmitter.receiveTouches(str, writableArray, writableArray2);
    }

    public void register(int i2, RCTEventEmitter rCTEventEmitter) {
        this.mDefaultEventEmitter = rCTEventEmitter;
    }

    public void register(int i2, RCTModernEventEmitter rCTModernEventEmitter) {
        this.mFabricEventEmitter = rCTModernEventEmitter;
    }

    public void unregister(int i2) {
        if (i2 == 1) {
            this.mDefaultEventEmitter = null;
        } else {
            this.mFabricEventEmitter = null;
        }
    }
}
