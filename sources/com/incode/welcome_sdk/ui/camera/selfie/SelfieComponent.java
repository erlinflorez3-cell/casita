package com.incode.welcome_sdk.ui.camera.selfie;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {SelfiePresenterModule.class})
public interface SelfieComponent {
    void inject(SelfieActivity selfieActivity);
}
