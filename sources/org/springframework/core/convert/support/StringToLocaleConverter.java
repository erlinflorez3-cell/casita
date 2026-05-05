package org.springframework.core.convert.support;

import java.util.Locale;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
final class StringToLocaleConverter implements Converter<String, Locale> {
    StringToLocaleConverter() {
    }

    @Override // org.springframework.core.convert.converter.Converter
    public Locale convert(String str) {
        return StringUtils.parseLocaleString(str);
    }
}
