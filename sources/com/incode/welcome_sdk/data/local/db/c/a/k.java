package com.incode.welcome_sdk.data.local.db.c.a;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;

/* JADX INFO: loaded from: classes5.dex */
public interface k {
    Completable a();

    Single<Long> b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar);

    Completable d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar);

    Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> d(long j2);
}
