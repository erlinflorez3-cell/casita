package com.incode.welcome_sdk.data.local.db.c.a;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface ac {
    Completable a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar);

    Completable d();

    Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> e(long j2);

    Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a>> e();

    Single<Long> e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar);
}
