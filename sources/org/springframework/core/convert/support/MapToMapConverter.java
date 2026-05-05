package org.springframework.core.convert.support;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.springframework.core.CollectionFactory;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;
import org.springframework.core.convert.converter.GenericConverter;

/* JADX INFO: loaded from: classes2.dex */
final class MapToMapConverter implements ConditionalGenericConverter {
    private final ConversionService conversionService;

    private static class MapEntry {
        private final Object key;
        private final Object value;

        public MapEntry(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }

        public void addToMap(Map<Object, Object> map) {
            map.put(this.key, this.value);
        }
    }

    public MapToMapConverter(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    private boolean canConvertKey(TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2) {
        return ConversionUtils.canConvertElements(typeDescriptor.getMapKeyTypeDescriptor(), typeDescriptor2.getMapKeyTypeDescriptor(), this.conversionService);
    }

    private boolean canConvertValue(TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2) {
        return ConversionUtils.canConvertElements(typeDescriptor.getMapValueTypeDescriptor(), typeDescriptor2.getMapValueTypeDescriptor(), this.conversionService);
    }

    private Object convertKey(Object obj, TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2) {
        return typeDescriptor2 == null ? obj : this.conversionService.convert(obj, typeDescriptor.getMapKeyTypeDescriptor(obj), typeDescriptor2);
    }

    private Object convertValue(Object obj, TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2) {
        return typeDescriptor2 == null ? obj : this.conversionService.convert(obj, typeDescriptor.getMapValueTypeDescriptor(obj), typeDescriptor2);
    }

    @Override // org.springframework.core.convert.converter.GenericConverter
    public Object convert(Object obj, TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2) {
        if (obj == null) {
            return null;
        }
        boolean zIsInstance = typeDescriptor2.getType().isInstance(obj);
        boolean z2 = !zIsInstance;
        Map map = (Map) obj;
        if (zIsInstance && map.isEmpty()) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object objConvertKey = convertKey(key, typeDescriptor, typeDescriptor2.getMapKeyTypeDescriptor());
            Object objConvertValue = convertValue(value, typeDescriptor, typeDescriptor2.getMapValueTypeDescriptor());
            arrayList.add(new MapEntry(objConvertKey, objConvertValue));
            if (key != objConvertKey || value != objConvertValue) {
                z2 = true;
            }
        }
        if (!z2) {
            return map;
        }
        Map<Object, Object> mapCreateMap = CollectionFactory.createMap(typeDescriptor2.getType(), map.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((MapEntry) it.next()).addToMap(mapCreateMap);
        }
        return mapCreateMap;
    }

    @Override // org.springframework.core.convert.converter.GenericConverter
    public Set<GenericConverter.ConvertiblePair> getConvertibleTypes() {
        return Collections.singleton(new GenericConverter.ConvertiblePair(Map.class, Map.class));
    }

    @Override // org.springframework.core.convert.converter.ConditionalConverter
    public boolean matches(TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2) {
        return canConvertKey(typeDescriptor, typeDescriptor2) && canConvertValue(typeDescriptor, typeDescriptor2);
    }
}
