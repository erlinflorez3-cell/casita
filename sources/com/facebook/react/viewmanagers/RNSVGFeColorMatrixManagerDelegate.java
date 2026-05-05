package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGFeColorMatrixManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeColorMatrixManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeColorMatrixManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t2, String str, Object obj) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1221029593:
                if (str.equals("height")) {
                    b2 = 0;
                }
                break;
            case -934426595:
                if (str.equals("result")) {
                    b2 = 1;
                }
                break;
            case -823812830:
                if (str.equals("values")) {
                    b2 = 2;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    b2 = 3;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b2 = 4;
                }
                break;
            case 104364:
                if (str.equals("in1")) {
                    b2 = 5;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    b2 = 6;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b2 = 7;
                }
                break;
        }
        switch (b2) {
            case 0:
                ((RNSVGFeColorMatrixManagerInterface) ((BaseViewManager) this.mViewManager)).setHeight(t2, new DynamicFromObject(obj));
                break;
            case 1:
                ((RNSVGFeColorMatrixManagerInterface) ((BaseViewManager) this.mViewManager)).setResult(t2, obj != null ? (String) obj : null);
                break;
            case 2:
                ((RNSVGFeColorMatrixManagerInterface) ((BaseViewManager) this.mViewManager)).setValues(t2, (ReadableArray) obj);
                break;
            case 3:
                ((RNSVGFeColorMatrixManagerInterface) ((BaseViewManager) this.mViewManager)).setX(t2, new DynamicFromObject(obj));
                break;
            case 4:
                ((RNSVGFeColorMatrixManagerInterface) ((BaseViewManager) this.mViewManager)).setY(t2, new DynamicFromObject(obj));
                break;
            case 5:
                ((RNSVGFeColorMatrixManagerInterface) ((BaseViewManager) this.mViewManager)).setIn1(t2, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGFeColorMatrixManagerInterface) ((BaseViewManager) this.mViewManager)).setType(t2, (String) obj);
                break;
            case 7:
                ((RNSVGFeColorMatrixManagerInterface) ((BaseViewManager) this.mViewManager)).setWidth(t2, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}
