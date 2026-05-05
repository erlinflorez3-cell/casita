package com.incode.welcome_sdk.ui.video_conference;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {VideoConferencePresenterModule.class})
public interface VideoConferenceComponent {
    void inject(VideoConferenceActivity videoConferenceActivity);
}
