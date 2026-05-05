package com.incode.welcome_sdk.data.local.db.c.a;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;

/* JADX INFO: loaded from: classes5.dex */
public interface e {
    Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> a(long j2);

    Single<Long> a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar);

    Completable b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar);

    Completable e();
}
