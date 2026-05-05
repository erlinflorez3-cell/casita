package org.springframework.core.convert;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Map;
import org.springframework.util.Assert;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractDescriptor {
    private final Class<?> type;

    protected AbstractDescriptor(Class<?> cls) {
        Assert.notNull(cls, "Type must not be null");
        this.type = cls;
    }

    private boolean isArray() {
        return getType().isArray();
    }

    private boolean isCollection() {
        return Collection.class.isAssignableFrom(getType());
    }

    private boolean isMap() {
        return Map.class.isAssignableFrom(getType());
    }

    public abstract Annotation[] getAnnotations();

    public TypeDescriptor getElementTypeDescriptor() {
        if (!isCollection()) {
            if (isArray()) {
                return new TypeDescriptor(nested(getType().getComponentType(), 0));
            }
            return null;
        }
        Class<?> clsResolveCollectionElementType = resolveCollectionElementType();
        if (clsResolveCollectionElementType != null) {
            return new TypeDescriptor(nested(clsResolveCollectionElementType, 0));
        }
        return null;
    }

    public TypeDescriptor getMapKeyTypeDescriptor() {
        Class<?> clsResolveMapKeyType;
        if (!isMap() || (clsResolveMapKeyType = resolveMapKeyType()) == null) {
            return null;
        }
        return new TypeDescriptor(nested(clsResolveMapKeyType, 0));
    }

    public TypeDescriptor getMapValueTypeDescriptor() {
        Class<?> clsResolveMapValueType;
        if (!isMap() || (clsResolveMapValueType = resolveMapValueType()) == null) {
            return null;
        }
        return new TypeDescriptor(nested(clsResolveMapValueType, 1));
    }

    public Class<?> getType() {
        return this.type;
    }

    public AbstractDescriptor nested() {
        if (isCollection()) {
            Class<?> clsResolveCollectionElementType = resolveCollectionElementType();
            if (clsResolveCollectionElementType != null) {
                return nested(clsResolveCollectionElementType, 0);
            }
            return null;
        }
        if (isArray()) {
            return nested(getType().getComponentType(), 0);
        }
        if (!isMap()) {
            if (Object.class.equals(getType())) {
                return this;
            }
            throw new IllegalStateException("Not a collection, array, or map: cannot resolve nested value types");
        }
        Class<?> clsResolveMapValueType = resolveMapValueType();
        if (clsResolveMapValueType != null) {
            return nested(clsResolveMapValueType, 1);
        }
        return null;
    }

    protected abstract AbstractDescriptor nested(Class<?> cls, int i2);

    protected abstract Class<?> resolveCollectionElementType();

    protected abstract Class<?> resolveMapKeyType();

    protected abstract Class<?> resolveMapValueType();
}
