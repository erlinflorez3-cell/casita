package com.incode.welcome_sdk.ui.ml_consent;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {MachineLearningConsentPresenterModule.class})
public interface MachineLearningConsentComponent {
    void inject(MachineLearningConsentActivity machineLearningConsentActivity);
}
