package org.springframework.core.convert;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.springframework.core.GenericCollectionTypeResolver;
import yg.Kl;

/* JADX INFO: loaded from: classes2.dex */
class FieldDescriptor extends AbstractDescriptor {
    private final Field field;
    private final int nestingLevel;
    private Map<Integer, Integer> typeIndexesPerLevel;

    private FieldDescriptor(Class<?> cls, Field field, int i2, int i3, Map<Integer, Integer> map) {
        super(cls);
        this.field = field;
        this.nestingLevel = i2;
        this.typeIndexesPerLevel = map;
        map.put(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public FieldDescriptor(Field field) {
        super(field.getType());
        this.field = field;
        this.nestingLevel = 1;
    }

    @Override // org.springframework.core.convert.AbstractDescriptor
    public Annotation[] getAnnotations() {
        return TypeDescriptor.nullSafeAnnotations(Kl.GX(this.field));
    }

    @Override // org.springframework.core.convert.AbstractDescriptor
    protected AbstractDescriptor nested(Class<?> cls, int i2) {
        if (this.typeIndexesPerLevel == null) {
            this.typeIndexesPerLevel = new HashMap(4);
        }
        return new FieldDescriptor(cls, this.field, this.nestingLevel + 1, i2, this.typeIndexesPerLevel);
    }

    @Override // org.springframework.core.convert.AbstractDescriptor
    protected Class<?> resolveCollectionElementType() {
        return GenericCollectionTypeResolver.getCollectionFieldType(this.field, this.nestingLevel, this.typeIndexesPerLevel);
    }

    @Override // org.springframework.core.convert.AbstractDescriptor
    protected Class<?> resolveMapKeyType() {
        return GenericCollectionTypeResolver.getMapKeyFieldType(this.field, this.nestingLevel, this.typeIndexesPerLevel);
    }

    @Override // org.springframework.core.convert.AbstractDescriptor
    protected Class<?> resolveMapValueType() {
        return GenericCollectionTypeResolver.getMapValueFieldType(this.field, this.nestingLevel, this.typeIndexesPerLevel);
    }
}
