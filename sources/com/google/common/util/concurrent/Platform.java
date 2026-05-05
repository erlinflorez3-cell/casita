package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
final class Platform {
    private Platform() {
    }

    static boolean isInstanceOfThrowableClass(@CheckForNull Throwable t2, Class<? extends Throwable> expectedClass) {
        return expectedClass.isInstance(t2);
    }

    static void restoreInterruptIfIsInterruptedException(Throwable t2) {
        Preconditions.checkNotNull(t2);
        if (t2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
