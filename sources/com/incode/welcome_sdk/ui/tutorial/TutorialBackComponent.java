package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {TutorialPresenterModule.class})
public interface TutorialBackComponent {
    void inject(TutorialBackActivity tutorialBackActivity);
}
