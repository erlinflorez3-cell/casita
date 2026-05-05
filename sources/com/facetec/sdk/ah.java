package com.facetec.sdk;

/* JADX INFO: loaded from: classes3.dex */
enum ah {
    ZOOM_CLOSE,
    ZOOM_FAR,
    PROCESSING_COMPLETE_TIMED_OUT,
    PROCESSING_COMPLETE_SUCCESS,
    PROCESSING_COMPLETE_RETRY,
    PROCESSING_COMPLETE_STILL_COMPUTING;

    final boolean B() {
        return this == PROCESSING_COMPLETE_RETRY || this == PROCESSING_COMPLETE_SUCCESS;
    }
}
