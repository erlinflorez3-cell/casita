package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class OptionsContainer<T> {
    private final Class<T> clazz;

    private OptionsContainer(Class<T> cls) {
        this.clazz = cls;
    }

    public static <T> OptionsContainer<T> create(Class<T> cls) {
        return new OptionsContainer<>(cls);
    }

    public T createInstance() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        return this.clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
}
