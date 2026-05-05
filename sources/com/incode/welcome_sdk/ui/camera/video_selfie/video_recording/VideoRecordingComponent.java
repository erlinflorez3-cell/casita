package com.incode.welcome_sdk.ui.camera.video_selfie.video_recording;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {VideoRecordingPresenterModule.class})
public interface VideoRecordingComponent {
    void inject(VideoRecordingFragment videoRecordingFragment);
}
