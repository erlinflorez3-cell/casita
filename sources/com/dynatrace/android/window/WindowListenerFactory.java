package com.dynatrace.android.window;

import android.view.Window;

/* JADX INFO: loaded from: classes3.dex */
public interface WindowListenerFactory {
    OnKeyEventListener generateOnKeyEventListener();

    OnTouchEventListener generateOnTouchEventListener(Window window);
}
