package io.sentry.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class Objects {
    private Objects() {
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static <T> T requireNonNull(T t2, String str) {
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException(str);
    }
}
