package com.incode.welcome_sdk.ui.camera.id_validation.base;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {BaseValidationPresenterModule.class})
public interface BaseValidationComponent {
    void inject(BaseValidationActivity baseValidationActivity);

    void inject(VideoStreamingManager videoStreamingManager);
}
