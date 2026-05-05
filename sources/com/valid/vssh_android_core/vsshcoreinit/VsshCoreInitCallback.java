package com.valid.vssh_android_core.vsshcoreinit;

import com.valid.vssh_android_core.basecore.BaseVsshCoreCallback;

/* JADX INFO: loaded from: classes5.dex */
public interface VsshCoreInitCallback extends BaseVsshCoreCallback {

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    void initResponse(boolean z2);
}
