package org.springframework.core.convert.support;

import java.io.ByteArrayInputStream;
import java.util.Properties;
import org.springframework.core.convert.converter.Converter;

/* JADX INFO: loaded from: classes2.dex */
final class StringToPropertiesConverter implements Converter<String, Properties> {
    StringToPropertiesConverter() {
    }

    @Override // org.springframework.core.convert.converter.Converter
    public Properties convert(String str) {
        try {
            Properties properties = new Properties();
            properties.load(new ByteArrayInputStream(str.getBytes("ISO-8859-1")));
            return properties;
        } catch (Exception e2) {
            throw new IllegalArgumentException("Failed to parse [" + str + "] into Properties", e2);
        }
    }
}
