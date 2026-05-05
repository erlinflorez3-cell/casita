package com.facebook.react.views.view;

import android.graphics.Rect;
import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import java.util.ArrayList;
import java.util.Map;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0012\u0002\u0012\u0013% 1")
public class ReactViewManager extends ReactClippingViewManager<ReactViewGroup> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";

    @VisibleForTesting
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5, 9, 10, 11};

    /* JADX INFO: renamed from: com.facebook.react.views.view.ReactViewManager$1 */
    class AnonymousClass1 implements View.OnClickListener {
        final /* synthetic */ ReactViewGroup val$view;

        AnonymousClass1(ReactViewGroup reactViewGroup) {
            reactViewGroup = reactViewGroup;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) reactViewGroup.getContext(), reactViewGroup.getId());
                if (eventDispatcherForReactTag == null) {
                    return;
                }
                eventDispatcherForReactTag.dispatchEvent(new ViewGroupClickEvent(UIManagerHelper.getSurfaceId(reactViewGroup.getContext()), reactViewGroup.getId()));
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.view.ReactViewManager$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ReactViewManager() {
        setupViewRecycling();
    }

    private void handleHotspotUpdate(ReactViewGroup reactViewGroup, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        reactViewGroup.drawableHotspotChanged(PixelUtil.toPixelFromDIP(readableArray.getDouble(0)), PixelUtil.toPixelFromDIP(readableArray.getDouble(1)));
    }

    private void handleSetPressed(ReactViewGroup reactViewGroup, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        }
        reactViewGroup.setPressed(readableArray.getBoolean(0));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactViewGroup(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.of(HOTSPOT_UPDATE_KEY, 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTView";
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = -1, name = "\u000fTw\u000ea7\u0011\u000ei\u001a?-o")
    public void nextFocusDown(ReactViewGroup reactViewGroup, int i2) {
        reactViewGroup.setNextFocusDownId(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = -1, name = "\u000fTw\u000ea7\u0011\u000ei\u001c?(x`mA")
    public void nextFocusForward(ReactViewGroup reactViewGroup, int i2) {
        reactViewGroup.setNextFocusForwardId(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = -1, name = "\u000fTw\u000ea7\u0011\u000ei\"5\u001cu")
    public void nextFocusLeft(ReactViewGroup reactViewGroup, int i2) {
        reactViewGroup.setNextFocusLeftId(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = -1, name = "\u000fTw\u000ea7\u0011\u000ei(9\u001dis")
    public void nextFocusRight(ReactViewGroup reactViewGroup, int i2) {
        reactViewGroup.setNextFocusRightId(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = -1, name = "\u000fTw\u000ea7\u0011\u000ei+@")
    public void nextFocusUp(ReactViewGroup reactViewGroup, int i2) {
        reactViewGroup.setNextFocusUpId(i2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public ReactViewGroup prepareToRecycleView(ThemedReactContext themedReactContext, ReactViewGroup reactViewGroup) {
        ReactViewGroup reactViewGroup2 = (ReactViewGroup) super.prepareToRecycleView(themedReactContext, reactViewGroup);
        if (reactViewGroup2 != null) {
            reactViewGroup2.recycleView();
        }
        return reactViewGroup;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactViewGroup reactViewGroup, int i2, ReadableArray readableArray) {
        if (i2 == 1) {
            handleHotspotUpdate(reactViewGroup, readableArray);
        } else {
            if (i2 != 2) {
                return;
            }
            handleSetPressed(reactViewGroup, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactViewGroup reactViewGroup, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setPressed")) {
            handleSetPressed(reactViewGroup, readableArray);
        } else if (str.equals(HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(reactViewGroup, readableArray);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017zb;")
    public void setAccessible(ReactViewGroup reactViewGroup, boolean z2) {
        reactViewGroup.setFocusable(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003Pb\u0005\u0002)\u0011}L?C\u001fchgF\u001f\u001e")
    public void setBackfaceVisibility(ReactViewGroup reactViewGroup, String str) {
        reactViewGroup.setBackfaceVisibility(str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBackgroundColor(ReactViewGroup reactViewGroup, int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBackgroundColor(reactViewGroup, Integer.valueOf(i2));
        } else {
            super.setBackgroundColor(reactViewGroup, i2);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "!rfGJxYGu\u000bm8Yak", name = "\u0006go~\u000e1\u001b}dJ1\"`a\\@\u0016\f^\u0017\\)\rmqE)\\")
    public void setBackgroundImage(ReactViewGroup reactViewGroup, ReadableArray readableArray) {
        if (ViewUtil.getUIManagerType(reactViewGroup) == 2) {
            if (readableArray == null || readableArray.size() <= 0) {
                reactViewGroup.setBackgroundImage(null);
                return;
            }
            ArrayList arrayList = new ArrayList(readableArray.size());
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                arrayList.add(new BackgroundImageLayer(readableArray.getMap(i2)));
            }
            reactViewGroup.setBackgroundImage(arrayList);
        }
    }

    @ReactPropGroup(customType = "\u0014?;=?", names = {"t\u0003\u0007y{\n[\t\u0007\u000b\u000f", "t\u0003\u0007y{\nd~\u0001\u0010_\r\u000b\u000f\u0013", "t\u0003\u0007y{\nj\u0003\u0002\u0004\u0011`\u000e\f\u0010\u0014", "t\u0003\u0007y{\nl\t\u000b^\f\n\u000e\u0012", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000ba\u000f\r\u0011\u0015", "t\u0003\u0007y{\nk\u000e{\u000e\u0011`\u000e\f\u0010\u0014", "t\u0003\u0007y{\n]\b~^\f\n\u000e\u0012", "t\u0003\u0007y{\nZ\u0006\n~\b`\u000e\f\u0010\u0014", "t\u0003\u0007y{\nZ\u0006\n~\bb\r\u0004c\u0011\u000f\u0013\u0017", "t\u0003\u0007y{\nZ\u0006\n~\bp\u0013\u0001\u0013\u0016e\u0013\u0011\u0015\u0019"})
    @InterfaceC1492Gx
    public void setBorderColor(ReactViewGroup reactViewGroup, int i2, Integer num) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderColor(reactViewGroup, LogicalEdge.fromSpacingType(SPACING_TYPES[i2]), num);
        } else {
            reactViewGroup.setBorderColor(SPACING_TYPES[i2], num);
        }
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(ReactViewGroup reactViewGroup, int i2, float f2) {
        setBorderRadius(reactViewGroup, i2, new DynamicFromObject(Float.valueOf(f2)));
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"t\u0003\u0007y{\njz~\u0005\u0012\u0011", "t\u0003\u0007y{\nl\t\u000bg\u0002\u0004\u0013q\u0002\u0006\f\u0019\u0018", "t\u0003\u0007y{\nl\t\u000bm\u0006\u0005\u0007\u0014r\u0003\u0007\r\u001a\u0019", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bp\t\b\n\u0017u\u0006\n\u0010\u001d\u001c", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bj\u0005\u0007\u0016t\u0005\t\u000f\u001c\u001b", "t\u0003\u0007y{\nl\t\u000bn\u0011~\u0011\u0014r\u0003\u0007\r\u001a\u0019", "t\u0003\u0007y{\nl\t\u000b`\u000b\u0002p\u0001\u0005\u000b\u0018\u0017", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bq\u0014\u0002\u0014\u0017u\u0006\n\u0010\u001d\u001c", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bc\u000e\u0005s\u0004\b\u000e\u001b\u001a", "t\u0003\u0007y{\n]\b~`\u000b\u0002p\u0001\u0005\u000b\u0018\u0017", "t\u0003\u0007y{\n]\b~n\u0011~\u0011\u0014r\u0003\u0007\r\u001a\u0019", "t\u0003\u0007y{\nk\u000e{\u000e\u0011b\r\u0004r\u0003\u0007\r\u001a\u0019", "t\u0003\u0007y{\nk\u000e{\u000e\u0011p\u0013\u0001\u0013\u0016t\u0005\t\u000f\u001c\u001b"})
    @InterfaceC1492Gx
    public void setBorderRadius(ReactViewGroup reactViewGroup, int i2, Dynamic dynamic) {
        LengthPercentage fromDynamic = LengthPercentage.setFromDynamic(dynamic);
        if (ViewUtil.getUIManagerType(reactViewGroup) != 2 && fromDynamic != null && fromDynamic.getType() == LengthPercentageType.PERCENT) {
            fromDynamic = null;
        }
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderRadius(reactViewGroup, BorderRadiusProp.values()[i2], fromDynamic);
        } else {
            reactViewGroup.setBorderRadius(BorderRadiusProp.values()[i2], fromDynamic);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:\u0001\roB5")
    public void setBorderStyle(ReactViewGroup reactViewGroup, String str) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderStyle(reactViewGroup, str == null ? null : BorderStyle.fromString(str));
        } else {
            reactViewGroup.setBorderStyle(str);
        }
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", defaultFloat = Float.NaN, names = {"t\u0003\u0007y{\no\u0003~\u0010\u0005", "t\u0003\u0007y{\nd~\u0001\u0010s\u0007\u0003\u0014\t", "t\u0003\u0007y{\nj\u0003\u0002\u0004\u0011t\b\u0004\u0015\n", "t\u0003\u0007y{\nl\t\u000br\u0006\u0002\u0013\b", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bu\t\u0005\u0016\u000b", "t\u0003\u0007y{\nk\u000e{\u000e\u0011t\b\u0004\u0015\n", "t\u0003\u0007y{\n]\b~r\u0006\u0002\u0013\b"})
    @InterfaceC1492Gx
    public void setBorderWidth(ReactViewGroup reactViewGroup, int i2, float f2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderWidth(reactViewGroup, LogicalEdge.values()[i2], Float.valueOf(f2));
            return;
        }
        if (!Float.isNaN(f2) && f2 < 0.0f) {
            f2 = Float.NaN;
        }
        if (!Float.isNaN(f2)) {
            f2 = PixelUtil.toPixelFromDIP(f2);
        }
        reactViewGroup.setBorderWidth(SPACING_TYPES[i2], f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "!\u0001{/KgNA~", name = "\u0003^wl\u0004)\u0012\bm")
    public void setBoxShadow(ReactViewGroup reactViewGroup, ReadableArray readableArray) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBoxShadow(reactViewGroup, readableArray);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004^k\u0006|8!yXB5")
    public void setCollapsable(ReactViewGroup reactViewGroup, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004^k\u0006|8!yXB5xihgA\u001d\nZ")
    public void setCollapsableChildren(ReactViewGroup reactViewGroup, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^b\u000f\u000f)\u0010\u0005[")
    public void setFocusable(ReactViewGroup reactViewGroup, boolean z2) {
        if (z2) {
            reactViewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.views.view.ReactViewManager.1
                final /* synthetic */ ReactViewGroup val$view;

                AnonymousClass1(ReactViewGroup reactViewGroup2) {
                    reactViewGroup = reactViewGroup2;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) reactViewGroup.getContext(), reactViewGroup.getId());
                        if (eventDispatcherForReactTag == null) {
                            return;
                        }
                        eventDispatcherForReactTag.dispatchEvent(new ViewGroupClickEvent(UIManagerHelper.getSurfaceId(reactViewGroup.getContext()), reactViewGroup.getId()));
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
            reactViewGroup2.setFocusable(true);
        } else {
            reactViewGroup2.setOnClickListener(null);
            reactViewGroup2.setClickable(false);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tXsl\b7\u001e")
    public void setHitSlop(ReactViewGroup reactViewGroup, Dynamic dynamic) {
        int i2 = AnonymousClass2.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
        if (i2 == 1) {
            ReadableMap readableMapAsMap = dynamic.asMap();
            reactViewGroup.setHitSlopRect(new Rect(readableMapAsMap.hasKey("left") ? (int) PixelUtil.toPixelFromDIP(readableMapAsMap.getDouble("left")) : 0, readableMapAsMap.hasKey("top") ? (int) PixelUtil.toPixelFromDIP(readableMapAsMap.getDouble("top")) : 0, readableMapAsMap.hasKey(ViewProps.RIGHT) ? (int) PixelUtil.toPixelFromDIP(readableMapAsMap.getDouble(ViewProps.RIGHT)) : 0, readableMapAsMap.hasKey(ViewProps.BOTTOM) ? (int) PixelUtil.toPixelFromDIP(readableMapAsMap.getDouble(ViewProps.BOTTOM)) : 0));
        } else if (i2 == 2) {
            int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(dynamic.asDouble());
            reactViewGroup.setHitSlopRect(new Rect(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP));
        } else {
            if (i2 != 3) {
                FLog.w(ReactConstants.TAG, "Invalid type for 'hitSlop' value " + dynamic.getType());
            }
            reactViewGroup.setHitSlopRect(null);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPs\u0003\u0012-oyYA7(ptiAk\u0013P\u001aV$\r")
    public void setNativeBackground(ReactViewGroup reactViewGroup, ReadableMap readableMap) {
        reactViewGroup.setTranslucentBackgroundDrawable(readableMap == null ? null : ReactDrawableHelper.createDrawableFromJSDescription(reactViewGroup.getContext(), readableMap));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPs\u0003\u0012-s\bh;7(ptiAk\u0013P\u001aV$\r")
    public void setNativeForeground(ReactViewGroup reactViewGroup, ReadableMap readableMap) {
        reactViewGroup.setForeground(readableMap == null ? null : ReactDrawableHelper.createDrawableFromJSDescription(reactViewGroup.getContext(), readableMap));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fTd}\u000f\u0017\u0014~i9B\u001bfm<I\u001b\rMjV(\u0019\u0014wM6`_&")
    public void setNeedsOffscreenAlphaCompositing(ReactViewGroup reactViewGroup, boolean z2) {
        reactViewGroup.setNeedsOffscreenAlphaCompositing(z2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setOpacity(ReactViewGroup reactViewGroup, float f2) {
        reactViewGroup.setOpacityIfPossible(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010ed\f\u00024\u001d\u0010")
    public void setOverflow(ReactViewGroup reactViewGroup, String str) {
        reactViewGroup.setOverflow(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
    public void setPointerEvents(ReactViewGroup reactViewGroup, String str) {
        reactViewGroup.setPointerEvents(PointerEvents.parsePointerEvents(str));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tPrmq\u0018 }\\;B(fcAL\u000e\u001a_")
    public void setTVPreferredFocus(ReactViewGroup reactViewGroup, boolean z2) {
        if (z2) {
            reactViewGroup.setFocusable(true);
            reactViewGroup.setFocusableInTouchMode(true);
            reactViewGroup.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransformProperty(ReactViewGroup reactViewGroup, ReadableArray readableArray, ReadableArray readableArray2) {
        super.setTransformProperty(reactViewGroup, readableArray, readableArray2);
        reactViewGroup.setBackfaceVisibilityDependantOpacity();
    }
}
