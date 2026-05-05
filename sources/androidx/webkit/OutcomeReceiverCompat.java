package androidx.webkit;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes4.dex */
public interface OutcomeReceiverCompat<T, E extends Throwable> {
    default void onError(E e2) {
    }

    void onResult(T t2);
}
