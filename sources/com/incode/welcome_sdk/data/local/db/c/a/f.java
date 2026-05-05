package com.incode.welcome_sdk.data.local.db.c.a;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface f {
    Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> b(long j2);

    Completable c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar);

    Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d>> c();

    Single<Long> d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar);
}
