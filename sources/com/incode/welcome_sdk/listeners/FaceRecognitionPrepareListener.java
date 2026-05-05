package com.incode.welcome_sdk.listeners;

import com.incode.welcome_sdk.commons.exceptions.LibraryDownloadError;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface FaceRecognitionPrepareListener {
    @Deprecated
    void onFaceRecognitionReady();

    @Deprecated
    void onPrepareError(LibraryDownloadError libraryDownloadError);

    @Deprecated
    void onPrepareProgressUpdate(int i2);
}
