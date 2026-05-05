package com.facebook.infer.annotation;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class Assertions {
    public static void assertCondition(boolean z2) {
        if (!z2) {
            throw new AssertionError();
        }
    }

    public static void assertCondition(boolean z2, String str) {
        if (!z2) {
            throw new AssertionError(str);
        }
    }

    public static <T> T assertGet(int i2, List<T> list) {
        assertCondition(i2 >= 0 && i2 < list.size(), "Index not in bound");
        return (T) assertNotNull(list.get(i2), "Null value");
    }

    public static <K, V> V assertGet(K k2, Map<K, V> map) {
        assertCondition(map.containsKey(k2), "Key not found");
        return (V) assertNotNull(map.get(k2), "Null value");
    }

    public static <T> T assertNotNull(@Nullable T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new AssertionError();
    }

    public static <T> T assertNotNull(@Nullable T t2, String str) {
        if (t2 != null) {
            return t2;
        }
        throw new AssertionError(str);
    }

    public static AssertionError assertUnreachable() {
        throw new AssertionError();
    }

    public static AssertionError assertUnreachable(Exception exc) {
        throw new AssertionError(exc);
    }

    public static AssertionError assertUnreachable(String str) {
        throw new AssertionError(str);
    }

    public static void assumeCondition(boolean z2) {
    }

    public static void assumeCondition(boolean z2, String str) {
    }

    public static <T> T assumeNotNull(@Nullable T t2) {
        return t2;
    }

    public static <T> T assumeNotNull(@Nullable T t2, String str) {
        return t2;
    }

    public static <T> T nullsafeFIXME(@Nullable T t2, String str) {
        return t2;
    }
}
