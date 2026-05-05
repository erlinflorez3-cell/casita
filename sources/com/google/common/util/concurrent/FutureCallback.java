package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public interface FutureCallback<V> {
    void onFailure(Throwable t2);

    void onSuccess(@ParametricNullness V result);
}
