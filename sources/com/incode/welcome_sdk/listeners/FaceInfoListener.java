package com.incode.welcome_sdk.listeners;

import com.incode.welcome_sdk.data.local.FaceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface FaceInfoListener {
    void onError(Throwable th);

    void onGetFacesCompleted(List<FaceInfo> list);
}
