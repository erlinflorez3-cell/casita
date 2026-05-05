package com.incode.welcome_sdk.commons.e;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class al {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4884d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4885e = 1;

    @Provides
    @Named("smileToOnboardServiceSecured")
    public final com.incode.welcome_sdk.data.remote.e.c e(@Named("securedRetrofit") Retrofit retrofit) {
        int i2 = 2 % 2;
        int i3 = f4885e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f4884d = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.c cVar = (com.incode.welcome_sdk.data.remote.e.c) retrofit.create(com.incode.welcome_sdk.data.remote.e.c.class);
        int i5 = f4885e + 89;
        f4884d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return cVar;
    }

    @Provides
    @Named("videoConferenceServiceSecured")
    public final com.incode.welcome_sdk.data.remote.e.a d(@Named("securedRetrofit") Retrofit retrofit) {
        int i2 = 2 % 2;
        int i3 = f4884d + 121;
        f4885e = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.a aVar = (com.incode.welcome_sdk.data.remote.e.a) retrofit.create(com.incode.welcome_sdk.data.remote.e.a.class);
        if (i4 != 0) {
            return aVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Named("smileToOnboardServiceUnsecured")
    public final com.incode.welcome_sdk.data.remote.e.c b(@Named("unsecuredRetrofit") Retrofit retrofit) {
        int i2 = 2 % 2;
        int i3 = f4884d + 123;
        f4885e = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.c cVar = (com.incode.welcome_sdk.data.remote.e.c) retrofit.create(com.incode.welcome_sdk.data.remote.e.c.class);
        int i5 = f4884d + 71;
        f4885e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return cVar;
    }

    @Provides
    @Named("videoConferenceServiceUnsecured")
    public final com.incode.welcome_sdk.data.remote.e.a a(@Named("unsecuredRetrofit") Retrofit retrofit) {
        int i2 = 2 % 2;
        int i3 = f4884d + 63;
        f4885e = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.a aVar = (com.incode.welcome_sdk.data.remote.e.a) retrofit.create(com.incode.welcome_sdk.data.remote.e.a.class);
        if (i4 != 0) {
            return aVar;
        }
        throw null;
    }
}
