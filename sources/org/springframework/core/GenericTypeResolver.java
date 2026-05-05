package org.springframework.core;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import org.springframework.util.Assert;
import org.springframework.util.ConcurrentReferenceHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GenericTypeResolver {
    private static final Map<Class, Map<TypeVariable, Type>> typeVariableCache = new ConcurrentReferenceHashMap();

    private static Class<?>[] doResolveTypeArguments(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        while (cls2 != null) {
            if (cls3.isInterface()) {
                for (Type type : cls2.getGenericInterfaces()) {
                    Class<?>[] clsArrDoResolveTypeArguments = doResolveTypeArguments(cls, type, cls3);
                    if (clsArrDoResolveTypeArguments != null) {
                        return clsArrDoResolveTypeArguments;
                    }
                }
            } else {
                try {
                    Class<?>[] clsArrDoResolveTypeArguments2 = doResolveTypeArguments(cls, cls2.getGenericSuperclass(), cls3);
                    if (clsArrDoResolveTypeArguments2 != null) {
                        return clsArrDoResolveTypeArguments2;
                    }
                } catch (MalformedParameterizedTypeException unused) {
                }
            }
            cls2 = cls2.getSuperclass();
        }
        return null;
    }

    private static Class<?>[] doResolveTypeArguments(Class<?> cls, Type type, Class<?> cls2) {
        if (!(type instanceof ParameterizedType)) {
            if (type == null) {
                return null;
            }
            Class<?> cls3 = (Class) type;
            if (cls2.isAssignableFrom(cls3)) {
                return doResolveTypeArguments(cls, cls3, cls2);
            }
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!cls2.equals(rawType)) {
            Class<?> cls4 = (Class) rawType;
            if (cls2.isAssignableFrom(cls4)) {
                return doResolveTypeArguments(cls, cls4, cls2);
            }
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Class<?>[] clsArr = new Class[actualTypeArguments.length];
        for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
            clsArr[i2] = extractClass(cls, actualTypeArguments[i2]);
        }
        return clsArr;
    }

    static Type extractBoundForTypeVariable(TypeVariable typeVariable) {
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length == 0) {
            return Object.class;
        }
        Type type = bounds[0];
        return type instanceof TypeVariable ? extractBoundForTypeVariable((TypeVariable) type) : type;
    }

    private static Class<?> extractClass(Class<?> cls, Type type) {
        if (type instanceof ParameterizedType) {
            return extractClass(cls, ((ParameterizedType) type).getRawType());
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(extractClass(cls, ((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            Type type2 = getTypeVariableMap(cls).get(typeVariable);
            if (type2 != null) {
                return extractClass(cls, type2);
            }
            type = extractBoundForTypeVariable(typeVariable);
            if (type instanceof ParameterizedType) {
                return extractClass(cls, ((ParameterizedType) type).getRawType());
            }
        }
        return type instanceof Class ? (Class) type : Object.class;
    }

    private static void extractTypeVariablesFromGenericInterfaces(Type[] typeArr, Map<TypeVariable, Type> map) {
        for (Type type : typeArr) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                populateTypeMapFromParameterizedType(parameterizedType, map);
                if (parameterizedType.getRawType() instanceof Class) {
                    extractTypeVariablesFromGenericInterfaces(((Class) parameterizedType.getRawType()).getGenericInterfaces(), map);
                }
            } else if (type instanceof Class) {
                extractTypeVariablesFromGenericInterfaces(((Class) type).getGenericInterfaces(), map);
            }
        }
    }

    static Type getRawType(Type type, Map<TypeVariable, Type> map) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            Type type2 = map.get(typeVariable);
            type = type2 == null ? extractBoundForTypeVariable(typeVariable) : type2;
        }
        return type instanceof ParameterizedType ? ((ParameterizedType) type).getRawType() : type;
    }

    public static Type getTargetType(MethodParameter methodParameter) {
        Assert.notNull(methodParameter, "MethodParameter must not be null");
        return methodParameter.getConstructor() != null ? methodParameter.getConstructor().getGenericParameterTypes()[methodParameter.getParameterIndex()] : methodParameter.getParameterIndex() >= 0 ? methodParameter.getMethod().getGenericParameterTypes()[methodParameter.getParameterIndex()] : methodParameter.getMethod().getGenericReturnType();
    }

    public static Map<TypeVariable, Type> getTypeVariableMap(Class<?> cls) {
        Map<TypeVariable, Type> map = typeVariableCache.get(cls);
        if (map == null) {
            map = new HashMap<>();
            extractTypeVariablesFromGenericInterfaces(cls.getGenericInterfaces(), map);
            for (Class<?> superclass = cls; superclass.getSuperclass() != null && !Object.class.equals(superclass.getSuperclass()); superclass = superclass.getSuperclass()) {
                try {
                    Type genericSuperclass = superclass.getGenericSuperclass();
                    if (genericSuperclass instanceof ParameterizedType) {
                        populateTypeMapFromParameterizedType((ParameterizedType) genericSuperclass, map);
                    }
                    extractTypeVariablesFromGenericInterfaces(superclass.getSuperclass().getGenericInterfaces(), map);
                } catch (MalformedParameterizedTypeException unused) {
                }
            }
            for (Class<?> enclosingClass = cls; enclosingClass.isMemberClass(); enclosingClass = enclosingClass.getEnclosingClass()) {
                try {
                    Type genericSuperclass2 = enclosingClass.getGenericSuperclass();
                    if (genericSuperclass2 instanceof ParameterizedType) {
                        populateTypeMapFromParameterizedType((ParameterizedType) genericSuperclass2, map);
                    }
                } catch (MalformedParameterizedTypeException unused2) {
                }
            }
            typeVariableCache.put(cls, map);
        }
        return map;
    }

    private static void populateTypeMapFromParameterizedType(ParameterizedType parameterizedType, Map<TypeVariable, Type> map) {
        if (parameterizedType.getRawType() instanceof Class) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            TypeVariable[] typeParameters = ((Class) parameterizedType.getRawType()).getTypeParameters();
            for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                Type type = actualTypeArguments[i2];
                TypeVariable typeVariable = typeParameters[i2];
                if (type instanceof Class) {
                    map.put(typeVariable, type);
                } else if (type instanceof GenericArrayType) {
                    map.put(typeVariable, type);
                } else if (type instanceof ParameterizedType) {
                    map.put(typeVariable, type);
                } else if (type instanceof TypeVariable) {
                    TypeVariable typeVariable2 = (TypeVariable) type;
                    Type typeExtractBoundForTypeVariable = map.get(typeVariable2);
                    if (typeExtractBoundForTypeVariable == null) {
                        typeExtractBoundForTypeVariable = extractBoundForTypeVariable(typeVariable2);
                    }
                    map.put(typeVariable, typeExtractBoundForTypeVariable);
                }
            }
        }
    }

    public static Class<?> resolveParameterType(MethodParameter methodParameter, Class<?> cls) {
        Type targetType = getTargetType(methodParameter);
        Assert.notNull(cls, "Class must not be null");
        Map<TypeVariable, Type> typeVariableMap = getTypeVariableMap(cls);
        Type rawType = getRawType(targetType, typeVariableMap);
        Class<?> parameterType = rawType instanceof Class ? (Class) rawType : methodParameter.getParameterType();
        methodParameter.setParameterType(parameterType);
        methodParameter.typeVariableMap = typeVariableMap;
        return parameterType;
    }

    public static Class<?> resolveReturnType(Method method, Class<?> cls) {
        Assert.notNull(method, "Method must not be null");
        Type genericReturnType = method.getGenericReturnType();
        Assert.notNull(cls, "Class must not be null");
        Type rawType = getRawType(genericReturnType, getTypeVariableMap(cls));
        return rawType instanceof Class ? (Class) rawType : method.getReturnType();
    }

    public static Class<?> resolveReturnTypeArgument(Method method, Class<?> cls) {
        Assert.notNull(method, "method must not be null");
        Class<?> returnType = method.getReturnType();
        Type genericReturnType = method.getGenericReturnType();
        if (returnType.equals(cls)) {
            if (!(genericReturnType instanceof ParameterizedType)) {
                return null;
            }
            Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
            if (!(type instanceof WildcardType)) {
                return (Class) type;
            }
        }
        return resolveTypeArgument(returnType, cls);
    }

    @Deprecated
    public static Class<?> resolveReturnTypeForGenericMethod(Method method, Object[] objArr) {
        Assert.notNull(method, "Method must not be null");
        Assert.notNull(objArr, "Argument array must not be null");
        TypeVariable<Method>[] typeParameters = method.getTypeParameters();
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        if (typeParameters.length == 0) {
            return method.getReturnType();
        }
        if (objArr.length < genericParameterTypes.length) {
            return null;
        }
        int length = typeParameters.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (typeParameters[i2].equals(genericReturnType)) {
                for (int i3 = 0; i3 < genericParameterTypes.length; i3++) {
                    Type type = genericParameterTypes[i3];
                    if (type.equals(genericReturnType)) {
                        return objArr[i3].getClass();
                    }
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        for (Type type2 : actualTypeArguments) {
                            if (type2.equals(genericReturnType)) {
                                Object obj = objArr[i3];
                                return obj instanceof Class ? (Class) obj : method.getReturnType();
                            }
                        }
                    }
                }
            } else {
                i2++;
            }
        }
        return method.getReturnType();
    }

    public static Class<?> resolveType(Type type, Map<TypeVariable, Type> map) {
        Object rawType = getRawType(type, map);
        if (rawType instanceof GenericArrayType) {
            rawType = Array.newInstance(resolveType(((GenericArrayType) rawType).getGenericComponentType(), map), 0).getClass();
        }
        return rawType instanceof Class ? (Class) rawType : Object.class;
    }

    public static Class<?> resolveTypeArgument(Class<?> cls, Class<?> cls2) {
        Class<?>[] clsArrResolveTypeArguments = resolveTypeArguments(cls, cls2);
        if (clsArrResolveTypeArguments == null) {
            return null;
        }
        if (clsArrResolveTypeArguments.length == 1) {
            return clsArrResolveTypeArguments[0];
        }
        throw new IllegalArgumentException("Expected 1 type argument on generic interface [" + cls2.getName() + "] but found " + clsArrResolveTypeArguments.length);
    }

    public static Class<?>[] resolveTypeArguments(Class<?> cls, Class<?> cls2) {
        return doResolveTypeArguments(cls, cls, cls2);
    }
}
