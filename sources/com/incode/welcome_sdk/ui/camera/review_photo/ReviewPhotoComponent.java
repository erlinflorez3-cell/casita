package com.incode.welcome_sdk.ui.camera.review_photo;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {ReviewPhotoPresenterModule.class})
public interface ReviewPhotoComponent {
    void inject(ReviewPhotoActivity reviewPhotoActivity);
}
