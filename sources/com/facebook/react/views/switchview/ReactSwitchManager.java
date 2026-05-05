package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.AndroidSwitchManagerDelegate;
import com.facebook.react.viewmanagers.AndroidSwitchManagerInterface;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
public class ReactSwitchManager extends SimpleViewManager<ReactSwitch> implements AndroidSwitchManagerInterface<ReactSwitch> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new CompoundButton.OnCheckedChangeListener() { // from class: com.facebook.react.views.switchview.ReactSwitchManager.1
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            ReactContext reactContext = (ReactContext) compoundButton.getContext();
            int id = compoundButton.getId();
            UIManagerHelper.getEventDispatcherForReactTag(reactContext, id).dispatchEvent(new ReactSwitchEvent(UIManagerHelper.getSurfaceId(reactContext), id, z2));
        }
    };
    public static final String REACT_CLASS = "AndroidSwitch";
    private final ViewManagerDelegate<ReactSwitch> mDelegate = new AndroidSwitchManagerDelegate(this);

    static class ReactSwitchShadowNode extends LayoutShadowNode implements YogaMeasureFunction {
        private int mHeight;
        private boolean mMeasured;
        private int mWidth;

        private ReactSwitchShadowNode() {
            initMeasureFunction();
        }

        private void initMeasureFunction() {
            setMeasureFunction(this);
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f2, YogaMeasureMode yogaMeasureMode, float f3, YogaMeasureMode yogaMeasureMode2) {
            if (!this.mMeasured) {
                ReactSwitch reactSwitch = new ReactSwitch(getThemedContext());
                reactSwitch.setShowText(false);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                reactSwitch.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                this.mWidth = reactSwitch.getMeasuredWidth();
                this.mHeight = reactSwitch.getMeasuredHeight();
                this.mMeasured = true;
            }
            return YogaMeasureOutput.make(this.mWidth, this.mHeight);
        }
    }

    private static void setValueInternal(ReactSwitch reactSwitch, boolean z2) throws Throwable {
        reactSwitch.setOnCheckedChangeListener(null);
        reactSwitch.setOn(z2);
        reactSwitch.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext themedReactContext, ReactSwitch reactSwitch) {
        reactSwitch.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSwitchShadowNode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ReactSwitch createViewInstance(ThemedReactContext themedReactContext) {
        ReactSwitch reactSwitch = new ReactSwitch(themedReactContext);
        reactSwitch.setShowText(false);
        return reactSwitch;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<ReactSwitch> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ReactSwitchShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, YogaMeasureMode yogaMeasureMode, float f3, YogaMeasureMode yogaMeasureMode2, float[] fArr) {
        ReactSwitch reactSwitch = new ReactSwitch(context);
        reactSwitch.setShowText(false);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        reactSwitch.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return YogaMeasureOutput.make(PixelUtil.toDIPFromPixel(reactSwitch.getMeasuredWidth()), PixelUtil.toDIPFromPixel(reactSwitch.getMeasuredHeight()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactSwitch reactSwitch, String str, ReadableArray readableArray) throws Throwable {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            boolean z2 = false;
            if (readableArray != null && readableArray.getBoolean(0)) {
                z2 = true;
            }
            setValueInternal(reactSwitch, z2);
        }
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = false, name = "\u0005Xrz}4\u0013|")
    public void setDisabled(ReactSwitch reactSwitch, boolean z2) {
        reactSwitch.setEnabled(!z2);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultBoolean = true, name = "\u0006]`{\b-\u0012")
    public void setEnabled(ReactSwitch reactSwitch, boolean z2) {
        reactSwitch.setEnabled(z2);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    public void setNativeValue(ReactSwitch reactSwitch, boolean z2) throws Throwable {
        setValueInternal(reactSwitch, z2);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]")
    public void setOn(ReactSwitch reactSwitch, boolean z2) throws Throwable {
        setValueInternal(reactSwitch, z2);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0015Wt\u0007}\u000b\u001d\u0005eH")
    public void setThumbColor(ReactSwitch reactSwitch, Integer num) {
        reactSwitch.setThumbColor(num);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0015Wt\u0007}\u001c\u0017\u0007j\u0019?\"pq")
    public void setThumbTintColor(ReactSwitch reactSwitch, Integer num) {
        setThumbColor(reactSwitch, num);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0015a`|\u0007\u000b\u001d\u0005eH\u0016%sE\\I\u001e\n")
    public void setTrackColorForFalse(ReactSwitch reactSwitch, Integer num) {
        reactSwitch.setTrackColorForFalse(num);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0015a`|\u0007\u000b\u001d\u0005eH\u0016%sSmR\u0010")
    public void setTrackColorForTrue(ReactSwitch reactSwitch, Integer num) {
        reactSwitch.setTrackColorForTrue(num);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0015a`|\u0007\u001c\u0017\u0007j\u0019?\"pq")
    public void setTrackTintColor(ReactSwitch reactSwitch, Integer num) {
        reactSwitch.setTrackColor(num);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Pk\u000f\u0001")
    public void setValue(ReactSwitch reactSwitch, boolean z2) throws Throwable {
        setValueInternal(reactSwitch, z2);
    }
}
