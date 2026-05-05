package com.incode.welcome_sdk.data.local.db.c;

import com.incode.welcome_sdk.data.local.i;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface c {
    Single<Long> a(i iVar);

    Completable b();

    Single<List<i>> c();
}
