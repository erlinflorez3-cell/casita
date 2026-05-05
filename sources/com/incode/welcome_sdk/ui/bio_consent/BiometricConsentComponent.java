package com.incode.welcome_sdk.ui.bio_consent;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {BiometricConsentPresenterModule.class})
public interface BiometricConsentComponent {
    void inject(BiometricConsentActivity biometricConsentActivity);
}
