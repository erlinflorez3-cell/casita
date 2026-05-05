package com.incode.welcome_sdk.data.e;

import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7665a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7666d = 1;

    @Provides
    public final b c() {
        int i2 = 2 % 2;
        b bVar = new b();
        int i3 = f7665a + 61;
        f7666d = i3 % 128;
        int i4 = i3 % 2;
        return bVar;
    }

    @Provides
    public final f d(b bVar) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bVar, "");
        f fVar = new f(bVar);
        int i3 = f7666d + 17;
        f7665a = i3 % 128;
        int i4 = i3 % 2;
        return fVar;
    }
}
