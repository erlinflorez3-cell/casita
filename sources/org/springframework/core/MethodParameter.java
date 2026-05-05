package org.springframework.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import org.springframework.util.Assert;
import yg.Kl;

/* JADX INFO: loaded from: classes2.dex */
public class MethodParameter {
    private final Constructor<?> constructor;
    private Type genericParameterType;
    private final Method method;
    private int nestingLevel;
    private Annotation[] parameterAnnotations;
    private final int parameterIndex;
    private String parameterName;
    private ParameterNameDiscoverer parameterNameDiscoverer;
    private Class<?> parameterType;
    Map<Integer, Integer> typeIndexesPerLevel;
    Map<TypeVariable, Type> typeVariableMap;

    public MethodParameter(Constructor<?> constructor, int i2) {
        this(constructor, i2, 1);
    }

    public MethodParameter(Constructor<?> constructor, int i2, int i3) {
        this.nestingLevel = 1;
        Assert.notNull(constructor, "Constructor must not be null");
        this.constructor = constructor;
        this.parameterIndex = i2;
        this.nestingLevel = i3;
        this.method = null;
    }

    public MethodParameter(Method method, int i2) {
        this(method, i2, 1);
    }

    public MethodParameter(Method method, int i2, int i3) {
        this.nestingLevel = 1;
        Assert.notNull(method, "Method must not be null");
        this.method = method;
        this.parameterIndex = i2;
        this.nestingLevel = i3;
        this.constructor = null;
    }

    public MethodParameter(MethodParameter methodParameter) {
        this.nestingLevel = 1;
        Assert.notNull(methodParameter, "Original must not be null");
        this.method = methodParameter.method;
        this.constructor = methodParameter.constructor;
        this.parameterIndex = methodParameter.parameterIndex;
        this.parameterType = methodParameter.parameterType;
        this.genericParameterType = methodParameter.genericParameterType;
        this.parameterAnnotations = methodParameter.parameterAnnotations;
        this.parameterNameDiscoverer = methodParameter.parameterNameDiscoverer;
        this.parameterName = methodParameter.parameterName;
        this.nestingLevel = methodParameter.nestingLevel;
        this.typeIndexesPerLevel = methodParameter.typeIndexesPerLevel;
        this.typeVariableMap = methodParameter.typeVariableMap;
    }

    public static MethodParameter forMethodOrConstructor(Object obj, int i2) {
        if (obj instanceof Method) {
            return new MethodParameter((Method) obj, i2);
        }
        if (obj instanceof Constructor) {
            return new MethodParameter((Constructor<?>) obj, i2);
        }
        throw new IllegalArgumentException("Given object [" + obj + "] is neither a Method nor a Constructor");
    }

    private AnnotatedElement getAnnotatedElement() {
        Method method = this.method;
        return method != null ? method : this.constructor;
    }

    private Member getMember() {
        Member member = this.method;
        if (member == null) {
            member = this.constructor;
        }
        return member;
    }

    private Map<Integer, Integer> getTypeIndexesPerLevel() {
        if (this.typeIndexesPerLevel == null) {
            this.typeIndexesPerLevel = new HashMap(4);
        }
        return this.typeIndexesPerLevel;
    }

    public void decreaseNestingLevel() {
        getTypeIndexesPerLevel().remove(Integer.valueOf(this.nestingLevel));
        this.nestingLevel--;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MethodParameter)) {
            return false;
        }
        MethodParameter methodParameter = (MethodParameter) obj;
        return this.parameterIndex == methodParameter.parameterIndex && getMember().equals(methodParameter.getMember());
    }

    public Constructor<?> getConstructor() {
        return this.constructor;
    }

    public Class<?> getDeclaringClass() {
        return getMember().getDeclaringClass();
    }

    public Type getGenericParameterType() {
        if (this.genericParameterType == null) {
            if (this.parameterIndex < 0) {
                Method method = this.method;
                this.genericParameterType = method != null ? method.getGenericReturnType() : null;
            } else {
                Method method2 = this.method;
                this.genericParameterType = method2 != null ? method2.getGenericParameterTypes()[this.parameterIndex] : this.constructor.getGenericParameterTypes()[this.parameterIndex];
            }
        }
        return this.genericParameterType;
    }

    public Method getMethod() {
        return this.method;
    }

    public <T extends Annotation> T getMethodAnnotation(Class<T> cls) {
        return (T) getAnnotatedElement().getAnnotation(cls);
    }

    public Annotation[] getMethodAnnotations() {
        return getAnnotatedElement().getAnnotations();
    }

    public Class<?> getNestedParameterType() {
        if (this.nestingLevel <= 1) {
            return getParameterType();
        }
        Type genericParameterType = getGenericParameterType();
        if (!(genericParameterType instanceof ParameterizedType)) {
            return Object.class;
        }
        Integer typeIndexForCurrentLevel = getTypeIndexForCurrentLevel();
        Type type = ((ParameterizedType) genericParameterType).getActualTypeArguments()[typeIndexForCurrentLevel != null ? typeIndexForCurrentLevel.intValue() : 0];
        if (type instanceof Class) {
            return (Class) type;
        }
        if (!(type instanceof ParameterizedType)) {
            return Object.class;
        }
        Type rawType = ((ParameterizedType) type).getRawType();
        return rawType instanceof Class ? (Class) rawType : Object.class;
    }

    public int getNestingLevel() {
        return this.nestingLevel;
    }

    public <T extends Annotation> T getParameterAnnotation(Class<T> cls) {
        for (Annotation annotation : getParameterAnnotations()) {
            T t2 = (T) annotation;
            if (cls.isInstance(t2)) {
                return t2;
            }
        }
        return null;
    }

    public Annotation[] getParameterAnnotations() {
        if (this.parameterAnnotations == null) {
            Method method = this.method;
            Annotation[][] annotationArrNX = method != null ? Kl.nX(method) : Kl.ZX(this.constructor);
            int i2 = this.parameterIndex;
            if (i2 < 0 || i2 >= annotationArrNX.length) {
                this.parameterAnnotations = new Annotation[0];
            } else {
                this.parameterAnnotations = annotationArrNX[i2];
            }
        }
        return this.parameterAnnotations;
    }

    public int getParameterIndex() {
        return this.parameterIndex;
    }

    public String getParameterName() {
        ParameterNameDiscoverer parameterNameDiscoverer = this.parameterNameDiscoverer;
        if (parameterNameDiscoverer != null) {
            Method method = this.method;
            String[] parameterNames = method != null ? parameterNameDiscoverer.getParameterNames(method) : parameterNameDiscoverer.getParameterNames(this.constructor);
            if (parameterNames != null) {
                this.parameterName = parameterNames[this.parameterIndex];
            }
            this.parameterNameDiscoverer = null;
        }
        return this.parameterName;
    }

    public Class<?> getParameterType() {
        if (this.parameterType == null) {
            if (this.parameterIndex < 0) {
                Method method = this.method;
                this.parameterType = method != null ? method.getReturnType() : null;
            } else {
                Method method2 = this.method;
                this.parameterType = method2 != null ? method2.getParameterTypes()[this.parameterIndex] : this.constructor.getParameterTypes()[this.parameterIndex];
            }
        }
        return this.parameterType;
    }

    public Integer getTypeIndexForCurrentLevel() {
        return getTypeIndexForLevel(this.nestingLevel);
    }

    public Integer getTypeIndexForLevel(int i2) {
        return getTypeIndexesPerLevel().get(Integer.valueOf(i2));
    }

    public <T extends Annotation> boolean hasParameterAnnotation(Class<T> cls) {
        return getParameterAnnotation(cls) != null;
    }

    public boolean hasParameterAnnotations() {
        return getParameterAnnotations().length != 0;
    }

    public int hashCode() {
        return (getMember().hashCode() * 31) + this.parameterIndex;
    }

    public void increaseNestingLevel() {
        this.nestingLevel++;
    }

    public void initParameterNameDiscovery(ParameterNameDiscoverer parameterNameDiscoverer) {
        this.parameterNameDiscoverer = parameterNameDiscoverer;
    }

    void setParameterType(Class<?> cls) {
        this.parameterType = cls;
    }

    public void setTypeIndexForCurrentLevel(int i2) {
        getTypeIndexesPerLevel().put(Integer.valueOf(this.nestingLevel), Integer.valueOf(i2));
    }
}
