package com.incode.welcome_sdk.ui.camera.video_selfie.video_upload;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {VideoUploadPresenterModule.class})
public interface VideoUploadComponent {
    void inject(VideoUploadFragment videoUploadFragment);
}
