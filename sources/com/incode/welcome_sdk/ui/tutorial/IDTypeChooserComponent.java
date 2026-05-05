package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {IDTypeChooserPresenterModule.class})
public interface IDTypeChooserComponent {
    void inject(IDTypeChooserActivity iDTypeChooserActivity);
}
