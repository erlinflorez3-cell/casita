package com.incode.welcome_sdk.ui.camera.id_validation;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {ProcessIdPresenterModule.class})
public interface ProcessIdComponent {
    void inject(ProcessIdActivity processIdActivity);
}
