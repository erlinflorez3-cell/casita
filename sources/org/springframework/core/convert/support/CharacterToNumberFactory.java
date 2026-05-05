package org.springframework.core.convert.support;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.util.NumberUtils;

/* JADX INFO: loaded from: classes2.dex */
final class CharacterToNumberFactory implements ConverterFactory<Character, Number> {

    private static final class CharacterToNumber<T extends Number> implements Converter<Character, T> {
        private final Class<T> targetType;

        public CharacterToNumber(Class<T> cls) {
            this.targetType = cls;
        }

        @Override // org.springframework.core.convert.converter.Converter
        public T convert(Character ch) {
            return (T) NumberUtils.convertNumberToTargetClass(Short.valueOf((short) ch.charValue()), this.targetType);
        }
    }

    CharacterToNumberFactory() {
    }

    @Override // org.springframework.core.convert.converter.ConverterFactory
    public <T extends Number> Converter<Character, T> getConverter(Class<T> cls) {
        return new CharacterToNumber(cls);
    }
}
