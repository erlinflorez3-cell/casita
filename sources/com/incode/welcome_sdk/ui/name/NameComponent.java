package com.incode.welcome_sdk.ui.name;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {NamePresenterModule.class})
public interface NameComponent {
    void inject(NameActivity nameActivity);
}
