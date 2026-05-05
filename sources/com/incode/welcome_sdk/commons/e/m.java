package com.incode.welcome_sdk.commons.e;

import com.incode.welcome_sdk.commons.RecogManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements Factory<com.incode.welcome_sdk.commons.c.c.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4937a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4938b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f4939c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<RecogManager> f4940e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4937a + 35;
        f4938b = i3 % 128;
        if (i3 % 2 != 0) {
            return d();
        }
        d();
        throw null;
    }

    private com.incode.welcome_sdk.commons.c.c.b d() {
        int i2 = 2 % 2;
        throw null;
    }

    public static com.incode.welcome_sdk.commons.c.c.b c(g gVar, RecogManager recogManager) {
        int i2 = 2 % 2;
        int i3 = f4938b + 41;
        f4937a = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.commons.c.c.b bVar = (com.incode.welcome_sdk.commons.c.c.b) Preconditions.checkNotNullFromProvides(gVar.c(recogManager));
        int i5 = f4938b + 17;
        f4937a = i5 % 128;
        int i6 = i5 % 2;
        return bVar;
    }
}
