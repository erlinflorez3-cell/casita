package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGFeFloodManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeFloodManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeFloodManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "floodColor":
                ((RNSVGFeFloodManagerInterface) ((BaseViewManager) this.mViewManager)).setFloodColor(t2, new DynamicFromObject(obj));
                break;
            case "height":
                ((RNSVGFeFloodManagerInterface) ((BaseViewManager) this.mViewManager)).setHeight(t2, new DynamicFromObject(obj));
                break;
            case "floodOpacity":
                ((RNSVGFeFloodManagerInterface) ((BaseViewManager) this.mViewManager)).setFloodOpacity(t2, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "result":
                ((RNSVGFeFloodManagerInterface) ((BaseViewManager) this.mViewManager)).setResult(t2, obj == null ? null : (String) obj);
                break;
            case "x":
                ((RNSVGFeFloodManagerInterface) ((BaseViewManager) this.mViewManager)).setX(t2, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFeFloodManagerInterface) ((BaseViewManager) this.mViewManager)).setY(t2, new DynamicFromObject(obj));
                break;
            case "width":
                ((RNSVGFeFloodManagerInterface) ((BaseViewManager) this.mViewManager)).setWidth(t2, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}
