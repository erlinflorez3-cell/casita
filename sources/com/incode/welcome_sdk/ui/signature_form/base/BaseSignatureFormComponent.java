package com.incode.welcome_sdk.ui.signature_form.base;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {BaseSignatureFormPresenterModule.class})
public interface BaseSignatureFormComponent {
    void inject(BaseSignatureFormActivity baseSignatureFormActivity);
}
