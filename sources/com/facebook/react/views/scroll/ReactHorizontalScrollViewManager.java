package com.facebook.react.views.scroll;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
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
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0001-\"/+$\u001e\u0001')\u001f/#!&\u0012\u001c\u0002\u0011\u001f\u001b\u0017\u0016~\u0011\f\u001d")
public class ReactHorizontalScrollViewManager extends ViewGroupManager<ReactHorizontalScrollView> implements ReactScrollViewCommandHelper.ScrollCommandHandler<ReactHorizontalScrollView> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private FpsListener mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    public ReactHorizontalScrollViewManager(FpsListener fpsListener) {
        this.mFpsListener = fpsListener;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactHorizontalScrollView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactHorizontalScrollView(themedReactContext, this.mFpsListener);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void flashScrollIndicators(ReactHorizontalScrollView reactHorizontalScrollView) {
        reactHorizontalScrollView.flashScrollIndicators();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactHorizontalScrollView reactHorizontalScrollView, int i2, ReadableArray readableArray) {
        ReactScrollViewCommandHelper.receiveCommand(this, reactHorizontalScrollView, i2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactHorizontalScrollView reactHorizontalScrollView, String str, ReadableArray readableArray) {
        ReactScrollViewCommandHelper.receiveCommand(this, reactHorizontalScrollView, str, readableArray);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollTo(ReactHorizontalScrollView reactHorizontalScrollView, ReactScrollViewCommandHelper.ScrollToCommandData scrollToCommandData) {
        reactHorizontalScrollView.abortAnimation();
        if (scrollToCommandData.mAnimated) {
            reactHorizontalScrollView.reactSmoothScrollTo(scrollToCommandData.mDestX, scrollToCommandData.mDestY);
        } else {
            reactHorizontalScrollView.scrollTo(scrollToCommandData.mDestX, scrollToCommandData.mDestY);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewCommandHelper.ScrollCommandHandler
    public void scrollToEnd(ReactHorizontalScrollView reactHorizontalScrollView, ReactScrollViewCommandHelper.ScrollToEndCommandData scrollToEndCommandData) {
        View childAt = reactHorizontalScrollView.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on HorizontalScrollView without child");
        }
        int width = childAt.getWidth() + reactHorizontalScrollView.getPaddingRight();
        reactHorizontalScrollView.abortAnimation();
        if (scrollToEndCommandData.mAnimated) {
            reactHorizontalScrollView.reactSmoothScrollTo(width, reactHorizontalScrollView.getScrollY());
        } else {
            reactHorizontalScrollView.scrollTo(width, reactHorizontalScrollView.getScrollY());
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBackgroundColor(ReactHorizontalScrollView reactHorizontalScrollView, int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBackgroundColor(reactHorizontalScrollView, Integer.valueOf(i2));
        } else {
            super.setBackgroundColor(reactHorizontalScrollView, i2);
        }
    }

    @ReactPropGroup(customType = "\u0014?;=?", names = {"t\u0003\u0007y{\n[\t\u0007\u000b\u000f", "t\u0003\u0007y{\nd~\u0001\u0010_\r\u000b\u000f\u0013", "t\u0003\u0007y{\nj\u0003\u0002\u0004\u0011`\u000e\f\u0010\u0014", "t\u0003\u0007y{\nl\t\u000b^\f\n\u000e\u0012", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000ba\u000f\r\u0011\u0015"})
    @InterfaceC1492Gx
    public void setBorderColor(ReactHorizontalScrollView reactHorizontalScrollView, int i2, Integer num) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderColor(reactHorizontalScrollView, LogicalEdge.ALL, num);
        } else {
            reactHorizontalScrollView.setBorderColor(SPACING_TYPES[i2], num);
        }
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", defaultFloat = Float.NaN, names = {"t\u0003\u0007y{\njz~\u0005\u0012\u0011", "t\u0003\u0007y{\nl\t\u000bg\u0002\u0004\u0013q\u0002\u0006\f\u0019\u0018", "t\u0003\u0007y{\nl\t\u000bm\u0006\u0005\u0007\u0014r\u0003\u0007\r\u001a\u0019", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bp\t\b\n\u0017u\u0006\n\u0010\u001d\u001c", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bj\u0005\u0007\u0016t\u0005\t\u000f\u001c\u001b"})
    @InterfaceC1492Gx
    public void setBorderRadius(ReactHorizontalScrollView reactHorizontalScrollView, int i2, float f2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderRadius(reactHorizontalScrollView, BorderRadiusProp.values()[i2], Float.isNaN(f2) ? null : new LengthPercentage(f2, LengthPercentageType.POINT));
            return;
        }
        if (!Float.isNaN(f2)) {
            f2 = PixelUtil.toPixelFromDIP(f2);
        }
        if (i2 == 0) {
            reactHorizontalScrollView.setBorderRadius(f2);
        } else {
            reactHorizontalScrollView.setBorderRadius(f2, i2 - 1);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:\u0001\roB5")
    public void setBorderStyle(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderStyle(reactHorizontalScrollView, str == null ? null : BorderStyle.fromString(str));
        } else {
            reactHorizontalScrollView.setBorderStyle(str);
        }
    }

    @ReactPropGroup(customType = "0/333-@6=';?5)\"!", defaultFloat = Float.NaN, names = {"t\u0003\u0007y{\no\u0003~\u0010\u0005", "t\u0003\u0007y{\nd~\u0001\u0010s\u0007\u0003\u0014\t", "t\u0003\u0007y{\nj\u0003\u0002\u0004\u0011t\b\u0004\u0015\n", "t\u0003\u0007y{\nl\t\u000br\u0006\u0002\u0013\b", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bu\t\u0005\u0016\u000b"})
    @InterfaceC1492Gx
    public void setBorderWidth(ReactHorizontalScrollView reactHorizontalScrollView, int i2, float f2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderWidth(reactHorizontalScrollView, LogicalEdge.values()[i2], Float.valueOf(f2));
            return;
        }
        if (!Float.isNaN(f2)) {
            f2 = PixelUtil.toPixelFromDIP(f2);
        }
        reactHorizontalScrollView.setBorderWidth(SPACING_TYPES[i2], f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", defaultInt = 0, name = "\u0006]c_\u00054\u001a[eB?(")
    public void setBottomFillColor(ReactHorizontalScrollView reactHorizontalScrollView, int i2) {
        reactHorizontalScrollView.setEndFillColor(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "!\u0001{/KgNA~", name = "\u0003^wl\u0004)\u0012\bm")
    public void setBoxShadow(ReactHorizontalScrollView reactHorizontalScrollView, ReadableArray readableArray) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBoxShadow(reactHorizontalScrollView, readableArray);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004^m\u000e\u00016\"g\\<C\u001bu")
    public void setContentOffset(ReactHorizontalScrollView reactHorizontalScrollView, ReadableMap readableMap) {
        if (readableMap != null) {
            reactHorizontalScrollView.scrollTo((int) PixelUtil.toPixelFromDIP(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) PixelUtil.toPixelFromDIP(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
        } else {
            reactHorizontalScrollView.scrollTo(0, 0);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Tb~\b- yj??$S`oB")
    public void setDecelerationRate(ReactHorizontalScrollView reactHorizontalScrollView, float f2) {
        reactHorizontalScrollView.setDecelerationRate(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xrz}4\u0013adJ5(w`g*\u001a\u0012Q\u0016[0\u0016")
    public void setDisableIntervalMomentum(ReactHorizontalScrollView reactHorizontalScrollView, boolean z2) {
        reactHorizontalScrollView.setDisableIntervalMomentum(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0006]`{\b-\u0001\u0012d9\u001f$TbmL\u0017\u0011")
    public void setEnableSyncOnScroll(ReactHorizontalScrollView reactHorizontalScrollView, boolean z2) {
        reactHorizontalScrollView.setEnableSyncOnScroll(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Pc\u0003\n/r|];\u001c\u001bofoE")
    public void setFadingEdgeLength(ReactHorizontalScrollView reactHorizontalScrollView, int i2) {
        if (i2 > 0) {
            reactHorizontalScrollView.setHorizontalFadingEdgeEnabled(true);
            reactHorizontalScrollView.setFadingEdgeLength(i2);
        } else {
            reactHorizontalScrollView.setHorizontalFadingEdgeEnabled(false);
            reactHorizontalScrollView.setFadingEdgeLength(0);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\t^q\u0003\u00167\u001c\rWB")
    public void setHorizontal(ReactHorizontalScrollView reactHorizontalScrollView, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePh\b\u0010)\u0017\u0007L?C\u001fck` \u001a\u0013`\rU/x\u0014wM6``-")
    public void setMaintainVisibleContentPosition(ReactHorizontalScrollView reactHorizontalScrollView, ReadableMap readableMap) {
        if (readableMap != null) {
            reactHorizontalScrollView.setMaintainVisibleContentPosition(MaintainVisibleScrollPositionHelper.Config.fromReadableMap(readableMap));
        } else {
            reactHorizontalScrollView.setMaintainVisibleContentPosition(null);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fTr\u000e\u0001,\u0001{hE<\"Fm\\?\u0017\nP")
    public void setNestedScrollEnabled(ReactHorizontalScrollView reactHorizontalScrollView, boolean z2) {
        ViewCompat.setNestedScrollingEnabled(reactHorizontalScrollView, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010ed\fn+ \bbB\u001d%ed")
    public void setOverScrollMode(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setOverScrollMode(ReactScrollViewHelper.parseOverScrollMode(str));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010ed\f\u00024\u001d\u0010")
    public void setOverflow(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setOverflow(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011Pf\u0003\n/r\u0007W8<\u001be")
    public void setPagingEnabled(ReactHorizontalScrollView reactHorizontalScrollView, boolean z2) {
        reactHorizontalScrollView.setPagingEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011Tq\r\u0005;\"}dJ#\u0019sngI\r\u0006^")
    public void setPersistentScrollbar(ReactHorizontalScrollView reactHorizontalScrollView, boolean z2) {
        reactHorizontalScrollView.setScrollbarFadingEnabled(!z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
    public void setPointerEvents(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setPointerEvents(PointerEvents.parsePointerEvents(str));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tl\t\u0012-p\u0005_F@\u001beRp?!\u000eQ\u001fZ")
    public void setRemoveClippedSubviews(ReactHorizontalScrollView reactHorizontalScrollView, boolean z2) {
        reactHorizontalScrollView.setRemoveClippedSubviews(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = true, name = "\u0014Rq\t\b4r\u0007W8<\u001be")
    public void setScrollEnabled(ReactHorizontalScrollView reactHorizontalScrollView, boolean z2) {
        reactHorizontalScrollView.setScrollEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Rq\t\b4r\u000f[DD\niqjQ\u001f\u0011Q")
    public void setScrollEventThrottle(ReactHorizontalScrollView reactHorizontalScrollView, int i2) {
        reactHorizontalScrollView.setScrollEventThrottle(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Rq\t\b4}}h<$\u0017h")
    public void setScrollPerfTag(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setScrollPerfTag(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Tm}h7\u001b}dJE#Fu`K\u001f\u0018")
    public void setSendMomentumEvents(ReactHorizontalScrollView reactHorizontalScrollView, boolean z2) {
        reactHorizontalScrollView.setSendMomentumEvents(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = true, name = "\u0014Wn\u0011\u000f\u0010\u001d\u000b_P?$u`g0\u000e\u0017[\u0014S\u0004\u0017\tmG#k`1")
    public void setShowsHorizontalScrollIndicator(ReactHorizontalScrollView reactHorizontalScrollView, boolean z2) {
        reactHorizontalScrollView.setHorizontalScrollBarEnabled(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014]`\no7n\u0005_=>#fmo")
    public void setSnapToAlignment(ReactHorizontalScrollView reactHorizontalScrollView, String str) {
        reactHorizontalScrollView.setSnapToAlignment(ReactScrollViewHelper.parseSnapToAlignment(str));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014]`\no7r\u0007Z")
    public void setSnapToEnd(ReactHorizontalScrollView reactHorizontalScrollView, boolean z2) {
        reactHorizontalScrollView.setSnapToEnd(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014]`\no7v\u0007j;B,bk")
    public void setSnapToInterval(ReactHorizontalScrollView reactHorizontalScrollView, float f2) {
        reactHorizontalScrollView.setSnapInterval((int) (f2 * PixelUtil.getDisplayMetricDensity()));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014]`\no7|~\\I5*t")
    public void setSnapToOffsets(ReactHorizontalScrollView reactHorizontalScrollView, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            reactHorizontalScrollView.setSnapOffsets(null);
            return;
        }
        float displayMetricDensity = PixelUtil.getDisplayMetricDensity();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i2) * ((double) displayMetricDensity))));
        }
        reactHorizontalScrollView.setSnapOffsets(arrayList);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014]`\no7\u0001\rWHD")
    public void setSnapToStart(ReactHorizontalScrollView reactHorizontalScrollView, boolean z2) {
        reactHorizontalScrollView.setSnapToStart(z2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactHorizontalScrollView reactHorizontalScrollView, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        reactHorizontalScrollView.setStateWrapper(stateWrapper);
        return null;
    }
}
