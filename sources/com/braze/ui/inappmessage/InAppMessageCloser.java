package com.braze.ui.inappmessage;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class InAppMessageCloser {
    private final IInAppMessageViewWrapper mInAppMessageViewWrapper;

    public InAppMessageCloser(IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        this.mInAppMessageViewWrapper = iInAppMessageViewWrapper;
    }

    public void close(boolean z2) {
        this.mInAppMessageViewWrapper.getInAppMessage().setAnimateOut(z2);
        this.mInAppMessageViewWrapper.close();
    }
}
