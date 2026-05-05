package com.incode.welcome_sdk.data.local.db.c.a;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface d {
    Completable a();

    Completable a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar);

    Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> a(long j2);

    Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>> b();

    Single<Long> c(long j2);

    Single<Long> c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar);
}
