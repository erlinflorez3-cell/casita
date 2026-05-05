package com.incode.welcome_sdk.ui.government_validation;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {GovernmentValidationPresenterModule.class})
public interface GovernmentValidationComponent {
    void inject(GovernmentValidationActivity governmentValidationActivity);
}
