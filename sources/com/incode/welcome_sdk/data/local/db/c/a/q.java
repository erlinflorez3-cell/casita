package com.incode.welcome_sdk.data.local.db.c.a;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface q {
    Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> b(long j2);

    Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c>> c();

    Single<Long> c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar);

    Completable d();

    Completable e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar);
}
