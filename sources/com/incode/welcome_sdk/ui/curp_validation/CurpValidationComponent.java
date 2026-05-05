package com.incode.welcome_sdk.ui.curp_validation;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {CurpValidationModule.class})
public interface CurpValidationComponent {
    void inject(CurpValidationActivity curpValidationActivity);
}
