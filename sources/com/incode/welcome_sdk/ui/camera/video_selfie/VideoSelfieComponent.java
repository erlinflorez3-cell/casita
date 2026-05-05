package com.incode.welcome_sdk.ui.camera.video_selfie;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {VideoSelfiePresenterModule.class})
public interface VideoSelfieComponent {
    void inject(VideoSelfieActivity videoSelfieActivity);
}
