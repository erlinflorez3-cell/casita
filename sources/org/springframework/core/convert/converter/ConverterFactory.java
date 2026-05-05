package org.springframework.core.convert.converter;

/* JADX INFO: loaded from: classes2.dex */
public interface ConverterFactory<S, R> {
    <T extends R> Converter<S, T> getConverter(Class<T> cls);
}
