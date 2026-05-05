package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
public class RNSVGFeCompositeManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeCompositeManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeCompositeManagerDelegate(BaseViewManager baseViewManager) {
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
            case 120:
                if (str.equals("x")) {
                    b2 = 2;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b2 = 3;
                }
                break;
            case 3366:
                if (str.equals("k1")) {
                    b2 = 4;
                }
                break;
            case 3367:
                if (str.equals("k2")) {
                    b2 = 5;
                }
                break;
            case 3368:
                if (str.equals("k3")) {
                    b2 = 6;
                }
                break;
            case 3369:
                if (str.equals("k4")) {
                    b2 = 7;
                }
                break;
            case 104364:
                if (str.equals("in1")) {
                    b2 = 8;
                }
                break;
            case 104365:
                if (str.equals("in2")) {
                    b2 = 9;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b2 = 10;
                }
                break;
            case 1662708749:
                if (str.equals("operator1")) {
                    b2 = Ascii.VT;
                }
                break;
        }
        switch (b2) {
            case 0:
                ((RNSVGFeCompositeManagerInterface) ((BaseViewManager) this.mViewManager)).setHeight(t2, new DynamicFromObject(obj));
                break;
            case 1:
                ((RNSVGFeCompositeManagerInterface) ((BaseViewManager) this.mViewManager)).setResult(t2, obj != null ? (String) obj : null);
                break;
            case 2:
                ((RNSVGFeCompositeManagerInterface) ((BaseViewManager) this.mViewManager)).setX(t2, new DynamicFromObject(obj));
                break;
            case 3:
                ((RNSVGFeCompositeManagerInterface) ((BaseViewManager) this.mViewManager)).setY(t2, new DynamicFromObject(obj));
                break;
            case 4:
                ((RNSVGFeCompositeManagerInterface) ((BaseViewManager) this.mViewManager)).setK1(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 5:
                ((RNSVGFeCompositeManagerInterface) ((BaseViewManager) this.mViewManager)).setK2(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 6:
                ((RNSVGFeCompositeManagerInterface) ((BaseViewManager) this.mViewManager)).setK3(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 7:
                ((RNSVGFeCompositeManagerInterface) ((BaseViewManager) this.mViewManager)).setK4(t2, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 8:
                ((RNSVGFeCompositeManagerInterface) ((BaseViewManager) this.mViewManager)).setIn1(t2, obj != null ? (String) obj : null);
                break;
            case 9:
                ((RNSVGFeCompositeManagerInterface) ((BaseViewManager) this.mViewManager)).setIn2(t2, obj != null ? (String) obj : null);
                break;
            case 10:
                ((RNSVGFeCompositeManagerInterface) ((BaseViewManager) this.mViewManager)).setWidth(t2, new DynamicFromObject(obj));
                break;
            case 11:
                ((RNSVGFeCompositeManagerInterface) ((BaseViewManager) this.mViewManager)).setOperator1(t2, (String) obj);
                break;
            default:
                super.setProperty(t2, str, obj);
                break;
        }
    }
}
