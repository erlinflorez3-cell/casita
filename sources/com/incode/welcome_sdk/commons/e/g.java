package com.incode.welcome_sdk.commons.e;

import com.incode.welcome_sdk.commons.RecogManager;
import dagger.Module;
import dagger.Provides;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4917a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4918b = 0;

    @Provides
    final com.incode.welcome_sdk.commons.c.c.b c(RecogManager recogManager) {
        int i2 = 2 % 2;
        com.incode.welcome_sdk.commons.c.c.b bVar = new com.incode.welcome_sdk.commons.c.c.b(recogManager);
        int i3 = f4918b + 71;
        f4917a = i3 % 128;
        if (i3 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    @Provides
    final com.incode.welcome_sdk.commons.c.c.d e(RecogManager recogManager) {
        int i2 = 2 % 2;
        com.incode.welcome_sdk.commons.c.c.d dVar = new com.incode.welcome_sdk.commons.c.c.d(recogManager);
        int i3 = f4917a + 81;
        f4918b = i3 % 128;
        int i4 = i3 % 2;
        return dVar;
    }
}
