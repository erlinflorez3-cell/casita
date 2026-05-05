package com.incode.welcome_sdk.data.local.db.c.a;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;

/* JADX INFO: loaded from: classes5.dex */
public interface u {
    Completable a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar);

    Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> b(long j2);

    Completable d();

    Single<Long> e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar);
}
