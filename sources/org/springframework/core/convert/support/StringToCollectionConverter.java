package org.springframework.core.convert.support;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import org.springframework.core.CollectionFactory;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.util.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
final class StringToCollectionConverter implements ConditionalGenericConverter {
    private final ConversionService conversionService;

    public StringToCollectionConverter(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override // org.springframework.core.convert.converter.GenericConverter
    public Object convert(Object obj, TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2) {
        if (obj == null) {
            return null;
        }
        String[] strArrCommaDelimitedListToStringArray = StringUtils.commaDelimitedListToStringArray((String) obj);
        Collection collectionCreateCollection = CollectionFactory.createCollection(typeDescriptor2.getType(), strArrCommaDelimitedListToStringArray.length);
        int i2 = 0;
        if (typeDescriptor2.getElementTypeDescriptor() == null) {
            int length = strArrCommaDelimitedListToStringArray.length;
            while (i2 < length) {
                collectionCreateCollection.add(strArrCommaDelimitedListToStringArray[i2].trim());
                i2++;
            }
        } else {
            int length2 = strArrCommaDelimitedListToStringArray.length;
            while (i2 < length2) {
                collectionCreateCollection.add(this.conversionService.convert(strArrCommaDelimitedListToStringArray[i2].trim(), typeDescriptor, typeDescriptor2.getElementTypeDescriptor()));
                i2++;
            }
        }
        return collectionCreateCollection;
    }

    @Override // org.springframework.core.convert.converter.GenericConverter
    public Set<GenericConverter.ConvertiblePair> getConvertibleTypes() {
        return Collections.singleton(new GenericConverter.ConvertiblePair(String.class, Collection.class));
    }

    @Override // org.springframework.core.convert.converter.ConditionalConverter
    public boolean matches(TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2) {
        return typeDescriptor2.getElementTypeDescriptor() == null || this.conversionService.canConvert(typeDescriptor, typeDescriptor2.getElementTypeDescriptor());
    }
}
