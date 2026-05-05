package com.incode.welcome_sdk.data.local.db.c;

import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface a {
    Completable a(com.incode.welcome_sdk.data.local.d dVar);

    Single<List<com.incode.welcome_sdk.data.local.d>> b(List<? extends com.incode.welcome_sdk.data.local.h> list);

    Completable d(com.incode.welcome_sdk.data.local.d dVar);

    Single<List<com.incode.welcome_sdk.data.local.d>> e(List<? extends com.incode.welcome_sdk.data.local.h> list, List<Long> list2);
}
