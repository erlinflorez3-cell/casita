package com.incode.welcome_sdk.ui.user_consent;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {UserConsentPresenterModule.class})
public interface UserConsentComponent {
    void inject(UserConsentActivity userConsentActivity);
}
