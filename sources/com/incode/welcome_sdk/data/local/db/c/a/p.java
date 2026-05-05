package com.incode.welcome_sdk.data.local.db.c.a;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface p {
    Completable b();

    Maybe<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j>> b(long j2);

    Completable c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar);

    Maybe<Long> c(long j2, String str);
}
