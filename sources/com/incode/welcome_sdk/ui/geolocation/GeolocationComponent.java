package com.incode.welcome_sdk.ui.geolocation;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {GeolocationPresenterModule.class})
public interface GeolocationComponent {
    void inject(GeolocationActivity geolocationActivity);
}
