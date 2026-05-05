package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGFeMergeManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeMergeManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeMergeManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "height":
                ((RNSVGFeMergeManagerInterface) ((BaseViewManager) this.mViewManager)).setHeight(t2, new DynamicFromObject(obj));
                break;
            case "result":
                ((RNSVGFeMergeManagerInterface) ((BaseViewManager) this.mViewManager)).setResult(t2, obj == null ? null : (String) obj);
                break;
            case "x":
                ((RNSVGFeMergeManagerInterface) ((BaseViewManager) this.mViewManager)).setX(t2, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFeMergeManagerInterface) ((BaseViewManager) this.mViewManager)).setY(t2, new DynamicFromObject(obj));
                break;
            case "nodes":
                ((RNSVGFeMergeManagerInterface) ((BaseViewManager) this.mViewManager)).setNodes(t2, (ReadableArray) obj);
                break;
            case "width":
                ((RNSVGFeMergeManagerInterface) ((BaseViewManager) this.mViewManager)).setWidth(t2, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}
