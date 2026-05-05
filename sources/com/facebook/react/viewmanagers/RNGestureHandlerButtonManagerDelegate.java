package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNGestureHandlerButtonManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNGestureHandlerButtonManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNGestureHandlerButtonManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "rippleRadius":
                ((RNGestureHandlerButtonManagerInterface) ((BaseViewManager) this.mViewManager)).setRippleRadius(t2, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "enabled":
                ((RNGestureHandlerButtonManagerInterface) ((BaseViewManager) this.mViewManager)).setEnabled(t2, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "rippleColor":
                ((RNGestureHandlerButtonManagerInterface) ((BaseViewManager) this.mViewManager)).setRippleColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case "borderColor":
                ((RNGestureHandlerButtonManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderColor(t2, ColorPropConverter.getColor(obj, t2.getContext()));
                break;
            case "borderStyle":
                ((RNGestureHandlerButtonManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderStyle(t2, obj == null ? "solid" : (String) obj);
                break;
            case "borderWidth":
                ((RNGestureHandlerButtonManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderWidth(t2, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case "touchSoundDisabled":
                ((RNGestureHandlerButtonManagerInterface) ((BaseViewManager) this.mViewManager)).setTouchSoundDisabled(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "exclusive":
                ((RNGestureHandlerButtonManagerInterface) ((BaseViewManager) this.mViewManager)).setExclusive(t2, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "borderless":
                ((RNGestureHandlerButtonManagerInterface) ((BaseViewManager) this.mViewManager)).setBorderless(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "foreground":
                ((RNGestureHandlerButtonManagerInterface) ((BaseViewManager) this.mViewManager)).setForeground(t2, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}
