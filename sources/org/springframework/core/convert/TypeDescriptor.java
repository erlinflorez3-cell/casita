package org.springframework.core.convert;

import com.dynatrace.android.agent.Global;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.core.MethodParameter;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;
import org.springframework.util.ObjectUtils;
import yg.Kl;

/* JADX INFO: loaded from: classes2.dex */
public class TypeDescriptor implements Serializable {
    static final Annotation[] EMPTY_ANNOTATION_ARRAY = new Annotation[0];
    private static final Map<Class<?>, TypeDescriptor> typeDescriptorCache;
    private final Annotation[] annotations;
    private final TypeDescriptor elementTypeDescriptor;
    private final TypeDescriptor mapKeyTypeDescriptor;
    private final TypeDescriptor mapValueTypeDescriptor;
    private final Class<?> type;

    static {
        HashMap map = new HashMap();
        typeDescriptorCache = map;
        map.put(Boolean.TYPE, new TypeDescriptor((Class<?>) Boolean.TYPE));
        map.put(Boolean.class, new TypeDescriptor((Class<?>) Boolean.class));
        map.put(Byte.TYPE, new TypeDescriptor((Class<?>) Byte.TYPE));
        map.put(Byte.class, new TypeDescriptor((Class<?>) Byte.class));
        map.put(Character.TYPE, new TypeDescriptor((Class<?>) Character.TYPE));
        map.put(Character.class, new TypeDescriptor((Class<?>) Character.class));
        map.put(Short.TYPE, new TypeDescriptor((Class<?>) Short.TYPE));
        map.put(Short.class, new TypeDescriptor((Class<?>) Short.class));
        map.put(Integer.TYPE, new TypeDescriptor((Class<?>) Integer.TYPE));
        map.put(Integer.class, new TypeDescriptor((Class<?>) Integer.class));
        map.put(Long.TYPE, new TypeDescriptor((Class<?>) Long.TYPE));
        map.put(Long.class, new TypeDescriptor((Class<?>) Long.class));
        map.put(Float.TYPE, new TypeDescriptor((Class<?>) Float.TYPE));
        map.put(Float.class, new TypeDescriptor((Class<?>) Float.class));
        map.put(Double.TYPE, new TypeDescriptor((Class<?>) Double.TYPE));
        map.put(Double.class, new TypeDescriptor((Class<?>) Double.class));
        map.put(String.class, new TypeDescriptor((Class<?>) String.class));
    }

    private TypeDescriptor(Class<?> cls) {
        this(new ClassDescriptor(cls));
    }

    private TypeDescriptor(Class<?> cls, TypeDescriptor typeDescriptor) {
        this(cls, typeDescriptor, null, null, EMPTY_ANNOTATION_ARRAY);
    }

    private TypeDescriptor(Class<?> cls, TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2) {
        this(cls, null, typeDescriptor, typeDescriptor2, EMPTY_ANNOTATION_ARRAY);
    }

    private TypeDescriptor(Class<?> cls, TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2, TypeDescriptor typeDescriptor3, Annotation[] annotationArr) {
        this.type = cls;
        this.elementTypeDescriptor = typeDescriptor;
        this.mapKeyTypeDescriptor = typeDescriptor2;
        this.mapValueTypeDescriptor = typeDescriptor3;
        this.annotations = annotationArr;
    }

    public TypeDescriptor(Field field) {
        this(new FieldDescriptor(field));
    }

    public TypeDescriptor(MethodParameter methodParameter) {
        this(new ParameterDescriptor(methodParameter));
    }

    TypeDescriptor(AbstractDescriptor abstractDescriptor) {
        this.type = abstractDescriptor.getType();
        this.elementTypeDescriptor = abstractDescriptor.getElementTypeDescriptor();
        this.mapKeyTypeDescriptor = abstractDescriptor.getMapKeyTypeDescriptor();
        this.mapValueTypeDescriptor = abstractDescriptor.getMapValueTypeDescriptor();
        this.annotations = abstractDescriptor.getAnnotations();
    }

    public TypeDescriptor(Property property) {
        this(new BeanPropertyDescriptor(property));
    }

    public static TypeDescriptor array(TypeDescriptor typeDescriptor) {
        if (typeDescriptor == null) {
            return null;
        }
        return new TypeDescriptor(Array.newInstance(typeDescriptor.getType(), 0).getClass(), typeDescriptor, null, null, typeDescriptor.getAnnotations());
    }

    private void assertCollectionOrArray() {
        if (!isCollection() && !isArray()) {
            throw new IllegalStateException("Not a java.util.Collection or Array");
        }
    }

    private void assertMap() {
        if (!isMap()) {
            throw new IllegalStateException("Not a java.util.Map");
        }
    }

    public static TypeDescriptor collection(Class<?> cls, TypeDescriptor typeDescriptor) {
        if (Collection.class.isAssignableFrom(cls)) {
            return new TypeDescriptor(cls, typeDescriptor);
        }
        throw new IllegalArgumentException("collectionType must be a java.util.Collection");
    }

    public static TypeDescriptor forObject(Object obj) {
        if (obj != null) {
            return valueOf(obj.getClass());
        }
        return null;
    }

    private boolean isNestedAssignable(TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2) {
        if (typeDescriptor == null || typeDescriptor2 == null) {
            return true;
        }
        return typeDescriptor.isAssignableTo(typeDescriptor2);
    }

    public static TypeDescriptor map(Class<?> cls, TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2) {
        if (Map.class.isAssignableFrom(cls)) {
            return new TypeDescriptor(cls, typeDescriptor, typeDescriptor2);
        }
        throw new IllegalArgumentException("mapType must be a java.util.Map");
    }

    private TypeDescriptor narrow(Object obj, TypeDescriptor typeDescriptor) {
        if (typeDescriptor != null) {
            return typeDescriptor.narrow(obj);
        }
        if (obj != null) {
            return new TypeDescriptor(obj.getClass(), null, null, null, this.annotations);
        }
        return null;
    }

    public static TypeDescriptor nested(Field field, int i2) {
        return nested(new FieldDescriptor(field), i2);
    }

    public static TypeDescriptor nested(MethodParameter methodParameter, int i2) {
        if (methodParameter.getNestingLevel() == 1) {
            return nested(new ParameterDescriptor(methodParameter), i2);
        }
        throw new IllegalArgumentException("methodParameter nesting level must be 1: use the nestingLevel parameter to specify the desired nestingLevel for nested type traversal");
    }

    private static TypeDescriptor nested(AbstractDescriptor abstractDescriptor, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            abstractDescriptor = abstractDescriptor.nested();
            if (abstractDescriptor == null) {
                return null;
            }
        }
        return new TypeDescriptor(abstractDescriptor);
    }

    public static TypeDescriptor nested(Property property, int i2) {
        return nested(new BeanPropertyDescriptor(property), i2);
    }

    static Annotation[] nullSafeAnnotations(Annotation[] annotationArr) {
        return annotationArr != null ? annotationArr : EMPTY_ANNOTATION_ARRAY;
    }

    public static TypeDescriptor valueOf(Class<?> cls) {
        TypeDescriptor typeDescriptor = typeDescriptorCache.get(cls);
        return typeDescriptor != null ? typeDescriptor : new TypeDescriptor(cls);
    }

    private String wildcard(TypeDescriptor typeDescriptor) {
        return typeDescriptor != null ? typeDescriptor.toString() : Global.QUESTION;
    }

    public TypeDescriptor elementTypeDescriptor(Object obj) {
        return narrow(obj, getElementTypeDescriptor());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeDescriptor)) {
            return false;
        }
        TypeDescriptor typeDescriptor = (TypeDescriptor) obj;
        if (!ObjectUtils.nullSafeEquals(this.type, typeDescriptor.type)) {
            return false;
        }
        Annotation[] annotationArr = this.annotations;
        if (annotationArr.length != typeDescriptor.annotations.length) {
            return false;
        }
        for (Annotation annotation : annotationArr) {
            if (typeDescriptor.getAnnotation(annotation.annotationType()) == null) {
                return false;
            }
        }
        if (isCollection() || isArray()) {
            return ObjectUtils.nullSafeEquals(this.elementTypeDescriptor, typeDescriptor.elementTypeDescriptor);
        }
        if (isMap()) {
            return ObjectUtils.nullSafeEquals(this.mapKeyTypeDescriptor, typeDescriptor.mapKeyTypeDescriptor) && ObjectUtils.nullSafeEquals(this.mapValueTypeDescriptor, typeDescriptor.mapValueTypeDescriptor);
        }
        return true;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        for (Annotation annotation : this.annotations) {
            T t2 = (T) annotation;
            if (t2.annotationType().equals(cls)) {
                return t2;
            }
        }
        for (Annotation annotation2 : this.annotations) {
            T t3 = (T) Kl.Kd(annotation2.annotationType(), cls);
            if (t3 != null) {
                return t3;
            }
        }
        return null;
    }

    public Annotation[] getAnnotations() {
        return this.annotations;
    }

    @Deprecated
    public Class<?> getElementType() {
        return getElementTypeDescriptor().getType();
    }

    public TypeDescriptor getElementTypeDescriptor() {
        assertCollectionOrArray();
        return this.elementTypeDescriptor;
    }

    @Deprecated
    public Class<?> getMapKeyType() {
        return getMapKeyTypeDescriptor().getType();
    }

    public TypeDescriptor getMapKeyTypeDescriptor() {
        assertMap();
        return this.mapKeyTypeDescriptor;
    }

    public TypeDescriptor getMapKeyTypeDescriptor(Object obj) {
        return narrow(obj, getMapKeyTypeDescriptor());
    }

    @Deprecated
    public Class<?> getMapValueType() {
        return getMapValueTypeDescriptor().getType();
    }

    public TypeDescriptor getMapValueTypeDescriptor() {
        assertMap();
        return this.mapValueTypeDescriptor;
    }

    public TypeDescriptor getMapValueTypeDescriptor(Object obj) {
        return narrow(obj, getMapValueTypeDescriptor());
    }

    public String getName() {
        return ClassUtils.getQualifiedName(getType());
    }

    public Class<?> getObjectType() {
        return ClassUtils.resolvePrimitiveIfNecessary(getType());
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean hasAnnotation(Class<? extends Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    public int hashCode() {
        return getType().hashCode();
    }

    public boolean isArray() {
        return getType().isArray();
    }

    public boolean isAssignableTo(TypeDescriptor typeDescriptor) {
        if (!typeDescriptor.getObjectType().isAssignableFrom(getObjectType())) {
            return false;
        }
        if (isArray() && typeDescriptor.isArray()) {
            return getElementTypeDescriptor().isAssignableTo(typeDescriptor.getElementTypeDescriptor());
        }
        if (isCollection() && typeDescriptor.isCollection()) {
            return isNestedAssignable(getElementTypeDescriptor(), typeDescriptor.getElementTypeDescriptor());
        }
        if (isMap() && typeDescriptor.isMap()) {
            return isNestedAssignable(getMapKeyTypeDescriptor(), typeDescriptor.getMapKeyTypeDescriptor()) && isNestedAssignable(getMapValueTypeDescriptor(), typeDescriptor.getMapValueTypeDescriptor());
        }
        return true;
    }

    public boolean isCollection() {
        return Collection.class.isAssignableFrom(getType());
    }

    public boolean isMap() {
        return Map.class.isAssignableFrom(getType());
    }

    public boolean isPrimitive() {
        return getType().isPrimitive();
    }

    public TypeDescriptor narrow(Object obj) {
        return obj == null ? this : new TypeDescriptor(obj.getClass(), this.elementTypeDescriptor, this.mapKeyTypeDescriptor, this.mapValueTypeDescriptor, this.annotations);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Annotation annotation : this.annotations) {
            sb.append("@").append(annotation.annotationType().getName()).append(TokenParser.SP);
        }
        sb.append(ClassUtils.getQualifiedName(getType()));
        if (isMap()) {
            sb.append("<").append(wildcard(this.mapKeyTypeDescriptor));
            sb.append(", ").append(wildcard(this.mapValueTypeDescriptor)).append(">");
        } else if (isCollection()) {
            sb.append("<").append(wildcard(this.elementTypeDescriptor)).append(">");
        }
        return sb.toString();
    }

    public TypeDescriptor upcast(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        Assert.isAssignable(cls, getType());
        return new TypeDescriptor(cls, this.elementTypeDescriptor, this.mapKeyTypeDescriptor, this.mapValueTypeDescriptor, this.annotations);
    }
}
