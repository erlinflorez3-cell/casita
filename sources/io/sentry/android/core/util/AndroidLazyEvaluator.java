package io.sentry.android.core.util;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class AndroidLazyEvaluator<T> {
    private final AndroidEvaluator<T> evaluator;
    private volatile T value = null;

    public interface AndroidEvaluator<T> {
        T evaluate(Context context);
    }

    public AndroidLazyEvaluator(AndroidEvaluator<T> androidEvaluator) {
        this.evaluator = androidEvaluator;
    }

    public T getValue(Context context) {
        if (this.value == null) {
            synchronized (this) {
                if (this.value == null) {
                    this.value = this.evaluator.evaluate(context);
                }
            }
        }
        return this.value;
    }

    public void resetValue() {
        synchronized (this) {
            this.value = null;
        }
    }

    public void setValue(T t2) {
        synchronized (this) {
            this.value = t2;
        }
    }
}
