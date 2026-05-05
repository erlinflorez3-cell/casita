package com.facebook.react.views.text;

import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
public class ReactRawTextShadowNode extends ReactShadowNodeImpl {

    @VisibleForTesting
    public static final String PROP_TEXT = "text";
    private String mText = null;

    public String getText() {
        return this.mText;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return true;
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Tw\u000e")
    public void setText(String str) {
        this.mText = str;
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public String toString() {
        return getViewClass() + " [text: " + this.mText + "]";
    }
}
