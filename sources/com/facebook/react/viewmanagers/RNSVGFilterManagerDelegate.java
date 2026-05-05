package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFilterManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGFilterManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFilterManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFilterManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "primitiveUnits":
                ((RNSVGFilterManagerInterface) ((BaseViewManager) this.mViewManager)).setPrimitiveUnits(t2, (String) obj);
                break;
            case "height":
                ((RNSVGFilterManagerInterface) ((BaseViewManager) this.mViewManager)).setHeight(t2, new DynamicFromObject(obj));
                break;
            case "filterUnits":
                ((RNSVGFilterManagerInterface) ((BaseViewManager) this.mViewManager)).setFilterUnits(t2, (String) obj);
                break;
            case "x":
                ((RNSVGFilterManagerInterface) ((BaseViewManager) this.mViewManager)).setX(t2, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFilterManagerInterface) ((BaseViewManager) this.mViewManager)).setY(t2, new DynamicFromObject(obj));
                break;
            case "name":
                ((RNSVGFilterManagerInterface) ((BaseViewManager) this.mViewManager)).setName(t2, obj == null ? null : (String) obj);
                break;
            case "width":
                ((RNSVGFilterManagerInterface) ((BaseViewManager) this.mViewManager)).setWidth(t2, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}
