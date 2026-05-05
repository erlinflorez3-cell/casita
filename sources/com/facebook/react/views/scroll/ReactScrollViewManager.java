package com.facebook.react.views.scroll;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.views.scroll.MaintainVisibleScrollPositionHelper;
import com.facebook.react.views.scroll.ReactScrollViewCommandHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0012\u0002\u0012\u0010\u001f-)%$\r\u001f\u001a+")
public class ReactScrollViewManager extends ViewGroupManager<ReactScrollView> implements ReactScrollViewCommandHelper.ScrollCommandHandler<ReactScrollView> {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private FpsListener mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public ReactScrollViewManager(FpsListener fpsListener) {
        this.mFpsListener = fpsListener;
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), MapBuilder.of("registrationName", "onScroll")).put(ScrollEventType.getJSEventName(ScrollEventType.BEGIN_DRAG), MapBuilder.of("registrationName", "onScrollBeginDrag")).put(ScrollEventType.getJSEventName(ScrollEventType.END_DRAG), MapBuilder.of("registrationName", "onScrollEndDrag")).put(ScrollEventType.getJSEventName(ScrollEventType.MOMENTUM_BEGIN), MapBuilder.of("registrationName", "onMomentumScrollBegin")).put(ScrollEventType.getJSEventName(ScrollEventType.MOMENTUM_END), MapBuilder.of("registrationName", "onMomentumScrollEnd")).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactScrollView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactScrollView(themedReactContext, this.mFpsListener);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void flashScrollIndicators(ReactScrollView reactScrollView) {
        reactScrollView.flashScrollIndicators();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return ReactScrollViewCommandHelper.getCommandsMap();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactScrollView reactScrollView, int i2, ReadableArray readableArray) {
        ReactScrollViewCommandHelper.receiveCommand(this, reactScrollView, i2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactScrollView reactScrollView, String str, ReadableArray readableArray) {
        ReactScrollViewCommandHelper.receiveCommand(this, reactScrollView, str, readableArray);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollTo(ReactScrollView reactScrollView, ReactScrollViewCommandHelper.ScrollToCommandData scrollToCommandData) {
        reactScrollView.abortAnimation();
        if (scrollToCommandData.mAnimated) {
            reactScrollView.reactSmoothScrollTo(scrollToCommandData.mDestX, scrollToCommandData.mDestY);
        } else {
            reactScrollView.scrollTo(scrollToCommandData.mDestX, scrollToCommandData.mDestY);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollToEnd(ReactScrollView reactScrollView, ReactScrollViewCommandHelper.ScrollToEndCommandData scrollToEndCommandData) {
        View childAt = reactScrollView.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
        int height = childAt.getHeight() + reactScrollView.getPaddingBottom();
        reactScrollView.abortAnimation();
        if (scrollToEndCommandData.mAnimated) {
            reactScrollView.reactSmoothScrollTo(reactScrollView.getScrollX(), height);
        } else {
            reactScrollView.scrollTo(reactScrollView.getScrollX(), height);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBackgroundColor(ReactScrollView reactScrollView, int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBackgroundColor(reactScrollView, Integer.valueOf(i2));
        } else {
            super.setBackgroundColor(reactScrollView, i2);
        }
    }

    @ReactPropGroup(customType = "\u0014?;=?", names = {"t\u0003\u0007y{\n[\t\u0007\u000b\u000f", "t\u0003\u0007y{\nd~\u0001\u0010_\r\u000b\u000f\u0013", "t\u0003\u0007y{\nj\u0003\u0002\u0004\u0011`\u000e\f\u0010\u0014", "t\u0003\u0007y{\nl\t\u000b^\f\n\u000e\u0012", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000ba\u000f\r\u0011\u0015"})
    @InterfaceC1492Gx
    public void setBorderColor(ReactScrollView reactScrollView, int i2, Integer num) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderColor(reactScrollView, LogicalEdge.ALL, num);
        } else {
            reactScrollView.setBorderColor(SPACING_TYPES[i2], num);
        }
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", defaultFloat = Float.NaN, names = {"t\u0003\u0007y{\njz~\u0005\u0012\u0011", "t\u0003\u0007y{\nl\t\u000bg\u0002\u0004\u0013q\u0002\u0006\f\u0019\u0018", "t\u0003\u0007y{\nl\t\u000bm\u0006\u0005\u0007\u0014r\u0003\u0007\r\u001a\u0019", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bp\t\b\n\u0017u\u0006\n\u0010\u001d\u001c", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bj\u0005\u0007\u0016t\u0005\t\u000f\u001c\u001b"})
    @InterfaceC1492Gx
    public void setBorderRadius(ReactScrollView reactScrollView, int i2, float f2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderRadius(reactScrollView, BorderRadiusProp.values()[i2], Float.isNaN(f2) ? null : new LengthPercentage(f2, LengthPercentageType.POINT));
            return;
        }
        if (!Float.isNaN(f2)) {
            f2 = PixelUtil.toPixelFromDIP(f2);
        }
        if (i2 == 0) {
            reactScrollView.setBorderRadius(f2);
        } else {
            reactScrollView.setBorderRadius(f2, i2 - 1);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:\u0001\roB5")
    public void setBorderStyle(ReactScrollView reactScrollView, String str) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderStyle(reactScrollView, str == null ? null : BorderStyle.fromString(str));
        } else {
            reactScrollView.setBorderStyle(str);
        }
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", defaultFloat = Float.NaN, names = {"t\u0003\u0007y{\no\u0003~\u0010\u0005", "t\u0003\u0007y{\nd~\u0001\u0010s\u0007\u0003\u0014\t", "t\u0003\u0007y{\nj\u0003\u0002\u0004\u0011t\b\u0004\u0015\n", "t\u0003\u0007y{\nl\t\u000br\u0006\u0002\u0013\b", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bu\t\u0005\u0016\u000b"})
    @InterfaceC1492Gx
    public void setBorderWidth(ReactScrollView reactScrollView, int i2, float f2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderWidth(reactScrollView, LogicalEdge.values()[i2], Float.valueOf(f2));
            return;
        }
        if (!Float.isNaN(f2)) {
            f2 = PixelUtil.toPixelFromDIP(f2);
        }
        reactScrollView.setBorderWidth(SPACING_TYPES[i2], f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", defaultInt = 0, name = "\u0006]c_\u00054\u001a[eB?(")
    public void setBottomFillColor(ReactScrollView reactScrollView, int i2) {
        reactScrollView.setEndFillColor(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "!\u0001{/KgNA~", name = "\u0003^wl\u0004)\u0012\bm")
    public void setBoxShadow(ReactScrollView reactScrollView, ReadableArray readableArray) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBoxShadow(reactScrollView, readableArray);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "/\u0001lJW", name = "\u0004^m\u000e\u00016\"g\\<C\u001bu")
    public void setContentOffset(ReactScrollView reactScrollView, ReadableMap readableMap) {
        reactScrollView.setContentOffset(readableMap);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Tb~\b- yj??$S`oB")
    public void setDecelerationRate(ReactScrollView reactScrollView, float f2) {
        reactScrollView.setDecelerationRate(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xrz}4\u0013adJ5(w`g*\u001a\u0012Q\u0016[0\u0016")
    public void setDisableIntervalMomentum(ReactScrollView reactScrollView, boolean z2) {
        reactScrollView.setDisableIntervalMomentum(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0006]`{\b-\u0001\u0012d9\u001f$TbmL\u0017\u0011")
    public void setEnableSyncOnScroll(ReactScrollView reactScrollView, boolean z2) {
        reactScrollView.setEnableSyncOnScroll(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Pc\u0003\n/r|];\u001c\u001bofoE")
    public void setFadingEdgeLength(ReactScrollView reactScrollView, int i2) {
        if (i2 > 0) {
            reactScrollView.setVerticalFadingEdgeEnabled(true);
            reactScrollView.setFadingEdgeLength(i2);
        } else {
            reactScrollView.setVerticalFadingEdgeEnabled(false);
            reactScrollView.setFadingEdgeLength(0);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\t^q\u0003\u00167\u001c\rWB")
    public void setHorizontal(ReactScrollView reactScrollView, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\nbH\b\u0012- \r[:&\u001fssp>\u0017\u000ef\rK\u0007\u0012\u0018x")
    public void setIsInvertedVirtualizedList(ReactScrollView reactScrollView, boolean z2) {
        if (z2) {
            reactScrollView.setVerticalScrollbarPosition(1);
        } else {
            reactScrollView.setVerticalScrollbarPosition(0);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePh\b\u0010)\u0017\u0007L?C\u001fck` \u001a\u0013`\rU/x\u0014wM6``-")
    public void setMaintainVisibleContentPosition(ReactScrollView reactScrollView, ReadableMap readableMap) {
        if (readableMap != null) {
            reactScrollView.setMaintainVisibleContentPosition(MaintainVisibleScrollPositionHelper.Config.fromReadableMap(readableMap));
        } else {
            reactScrollView.setMaintainVisibleContentPosition(null);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fTr\u000e\u0001,\u0001{hE<\"Fm\\?\u0017\nP")
    public void setNestedScrollEnabled(ReactScrollView reactScrollView, boolean z2) {
        ViewCompat.setNestedScrollingEnabled(reactScrollView, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010ed\fn+ \bbB\u001d%ed")
    public void setOverScrollMode(ReactScrollView reactScrollView, String str) {
        reactScrollView.setOverScrollMode(ReactScrollViewHelper.parseOverScrollMode(str));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010ed\f\u00024\u001d\u0010")
    public void setOverflow(ReactScrollView reactScrollView, String str) {
        reactScrollView.setOverflow(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011Pf\u0003\n/r\u0007W8<\u001be")
    public void setPagingEnabled(ReactScrollView reactScrollView, boolean z2) {
        reactScrollView.setPagingEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011Tq\r\u0005;\"}dJ#\u0019sngI\r\u0006^")
    public void setPersistentScrollbar(ReactScrollView reactScrollView, boolean z2) {
        reactScrollView.setScrollbarFadingEnabled(!z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
    public void setPointerEvents(ReactScrollView reactScrollView, String str) {
        reactScrollView.setPointerEvents(PointerEvents.parsePointerEvents(str));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tl\t\u0012-p\u0005_F@\u001beRp?!\u000eQ\u001fZ")
    public void setRemoveClippedSubviews(ReactScrollView reactScrollView, boolean z2) {
        reactScrollView.setRemoveClippedSubviews(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = true, name = "\u0014Rq\t\b4r\u0007W8<\u001be")
    public void setScrollEnabled(ReactScrollView reactScrollView, boolean z2) {
        reactScrollView.setScrollEnabled(z2);
        reactScrollView.setFocusable(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Rq\t\b4r\u000f[DD\niqjQ\u001f\u0011Q")
    public void setScrollEventThrottle(ReactScrollView reactScrollView, int i2) {
        reactScrollView.setScrollEventThrottle(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Rq\t\b4}}h<$\u0017h")
    public void setScrollPerfTag(ReactScrollView reactScrollView, String str) {
        reactScrollView.setScrollPerfTag(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Tm}h7\u001b}dJE#Fu`K\u001f\u0018")
    public void setSendMomentumEvents(ReactScrollView reactScrollView, boolean z2) {
        reactScrollView.setSendMomentumEvents(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = true, name = "\u0014Wn\u0011\u000f\u001e\u0013\u000bj?3\u0017mR^O\u001a\u0011XpU\u001f\u0012\beX1i")
    public void setShowsVerticalScrollIndicator(ReactScrollView reactScrollView, boolean z2) {
        reactScrollView.setVerticalScrollBarEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014]`\no7n\u0005_=>#fmo")
    public void setSnapToAlignment(ReactScrollView reactScrollView, String str) {
        reactScrollView.setSnapToAlignment(ReactScrollViewHelper.parseSnapToAlignment(str));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014]`\no7r\u0007Z")
    public void setSnapToEnd(ReactScrollView reactScrollView, boolean z2) {
        reactScrollView.setSnapToEnd(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014]`\no7v\u0007j;B,bk")
    public void setSnapToInterval(ReactScrollView reactScrollView, float f2) {
        reactScrollView.setSnapInterval((int) (f2 * PixelUtil.getDisplayMetricDensity()));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014]`\no7|~\\I5*t")
    public void setSnapToOffsets(ReactScrollView reactScrollView, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            reactScrollView.setSnapOffsets(null);
            return;
        }
        float displayMetricDensity = PixelUtil.getDisplayMetricDensity();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i2) * ((double) displayMetricDensity))));
        }
        reactScrollView.setSnapOffsets(arrayList);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014]`\no7\u0001\rWHD")
    public void setSnapToStart(ReactScrollView reactScrollView, boolean z2) {
        reactScrollView.setSnapToStart(z2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactScrollView reactScrollView, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        reactScrollView.setStateWrapper(stateWrapper);
        return null;
    }
}
