package org.springframework.beans;

import java.beans.PropertyChangeEvent;
import org.springframework.util.ClassUtils;

/* JADX INFO: loaded from: classes2.dex */
public class TypeMismatchException extends PropertyAccessException {
    public static final String ERROR_CODE = "typeMismatch";
    private static final long serialVersionUID = 1;
    private Class<?> requiredType;
    private transient Object value;

    public TypeMismatchException(PropertyChangeEvent propertyChangeEvent, Class<?> cls) {
        this(propertyChangeEvent, cls, (Throwable) null);
    }

    public TypeMismatchException(PropertyChangeEvent propertyChangeEvent, Class<?> cls, Throwable th) {
        super(propertyChangeEvent, "Failed to convert property value of type '" + ClassUtils.getDescriptiveType(propertyChangeEvent.getNewValue()) + "'" + (cls != null ? " to required type '" + ClassUtils.getQualifiedName(cls) + "'" : "") + (propertyChangeEvent.getPropertyName() != null ? " for property '" + propertyChangeEvent.getPropertyName() + "'" : ""), th);
        this.value = propertyChangeEvent.getNewValue();
        this.requiredType = cls;
    }

    public TypeMismatchException(Object obj, Class<?> cls) {
        this(obj, cls, (Throwable) null);
    }

    public TypeMismatchException(Object obj, Class<?> cls, Throwable th) {
        super("Failed to convert value of type '" + ClassUtils.getDescriptiveType(obj) + "'" + (cls != null ? " to required type '" + ClassUtils.getQualifiedName(cls) + "'" : ""), th);
        this.value = obj;
        this.requiredType = cls;
    }

    @Override // org.springframework.core.ErrorCoded
    public String getErrorCode() {
        return ERROR_CODE;
    }

    public Class<?> getRequiredType() {
        return this.requiredType;
    }

    @Override // org.springframework.beans.PropertyAccessException
    public Object getValue() {
        return this.value;
    }
}
