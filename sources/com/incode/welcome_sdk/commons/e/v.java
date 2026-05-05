package com.incode.welcome_sdk.commons.e;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

/* JADX INFO: loaded from: classes5.dex */
@Module
public class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4986b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4987e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4988c;

    public v(boolean z2) {
        this.f4988c = z2;
    }

    @Provides
    public com.incode.welcome_sdk.data.remote.h a(@Named("smileToOnboardServiceSecured") com.incode.welcome_sdk.data.remote.e.c cVar, @Named("videoConferenceServiceSecured") com.incode.welcome_sdk.data.remote.e.a aVar, @Named("smileToOnboardServiceUnsecured") com.incode.welcome_sdk.data.remote.e.c cVar2, @Named("videoConferenceServiceUnsecured") com.incode.welcome_sdk.data.remote.e.a aVar2) {
        int i2 = 2 % 2;
        com.incode.welcome_sdk.data.remote.h hVar = new com.incode.welcome_sdk.data.remote.h(cVar, aVar, cVar2, aVar2, this.f4988c);
        int i3 = f4987e + 73;
        f4986b = i3 % 128;
        int i4 = i3 % 2;
        return hVar;
    }
}
