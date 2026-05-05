package fr.antelop.sdk.util;

import fr.antelop.sdk.AntelopError;

/* JADX INFO: loaded from: classes5.dex */
public interface OperationCallback<T> {
    void onError(AntelopError antelopError);

    void onSuccess(T t2);
}
