package org.springframework.core.convert.support;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

/* JADX INFO: loaded from: classes2.dex */
final class StringToEnumConverterFactory implements ConverterFactory<String, Enum> {

    private class StringToEnum<T extends Enum> implements Converter<String, T> {
        private final Class<T> enumType;

        public StringToEnum(Class<T> cls) {
            this.enumType = cls;
        }

        @Override // org.springframework.core.convert.converter.Converter
        public T convert(String str) {
            if (str.length() == 0) {
                return null;
            }
            return (T) Enum.valueOf(this.enumType, str.trim());
        }
    }

    StringToEnumConverterFactory() {
    }

    @Override // org.springframework.core.convert.converter.ConverterFactory
    public <T extends Enum> Converter<String, T> getConverter(Class<T> cls) {
        Class<T> superclass = cls;
        while (superclass != null && !superclass.isEnum()) {
            superclass = superclass.getSuperclass();
        }
        if (superclass != null) {
            return new StringToEnum(superclass);
        }
        throw new IllegalArgumentException("The target type " + cls.getName() + " does not refer to an enum");
    }
}
