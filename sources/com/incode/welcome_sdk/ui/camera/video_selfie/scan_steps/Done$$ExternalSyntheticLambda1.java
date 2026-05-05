package com.incode.welcome_sdk.ui.camera.video_selfie.scan_steps;

import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract;
import io.reactivex.functions.Consumer;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class Done$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ VideoRecordingContract.View f$0;

    public /* synthetic */ Done$$ExternalSyntheticLambda1(VideoRecordingContract.View view) {
        this.f$0 = view;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        this.f$0.onError((Throwable) obj);
    }
}
