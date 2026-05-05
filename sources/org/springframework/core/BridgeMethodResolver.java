package org.springframework.core;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.util.ClassUtils;
import org.springframework.util.ReflectionUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BridgeMethodResolver {
    public static Method findBridgedMethod(Method method) {
        if (method != null && method.isBridge()) {
            ArrayList arrayList = new ArrayList();
            for (Method method2 : ReflectionUtils.getAllDeclaredMethods(method.getDeclaringClass())) {
                if (isBridgedCandidateFor(method2, method)) {
                    arrayList.add(method2);
                }
            }
            if (arrayList.size() == 1) {
                return (Method) arrayList.get(0);
            }
            Method methodSearchCandidates = searchCandidates(arrayList, method);
            if (methodSearchCandidates != null) {
                return methodSearchCandidates;
            }
        }
        return method;
    }

    private static Method findGenericDeclaration(Method method) {
        for (Class<? super Object> superclass = method.getDeclaringClass().getSuperclass(); superclass != null && !Object.class.equals(superclass); superclass = superclass.getSuperclass()) {
            Method methodSearchForMatch = searchForMatch(superclass, method);
            if (methodSearchForMatch != null && !methodSearchForMatch.isBridge()) {
                return methodSearchForMatch;
            }
        }
        for (Class<?> cls : ClassUtils.getAllInterfacesForClass(method.getDeclaringClass())) {
            Method methodSearchForMatch2 = searchForMatch(cls, method);
            if (methodSearchForMatch2 != null && !methodSearchForMatch2.isBridge()) {
                return methodSearchForMatch2;
            }
        }
        return null;
    }

    static boolean isBridgeMethodFor(Method method, Method method2, Map<TypeVariable, Type> map) {
        if (isResolvedTypeMatch(method2, method, map)) {
            return true;
        }
        Method methodFindGenericDeclaration = findGenericDeclaration(method);
        return methodFindGenericDeclaration != null && isResolvedTypeMatch(methodFindGenericDeclaration, method2, map);
    }

    private static boolean isBridgedCandidateFor(Method method, Method method2) {
        return !method.isBridge() && !method.equals(method2) && method.getName().equals(method2.getName()) && method.getParameterTypes().length == method2.getParameterTypes().length;
    }

    private static boolean isResolvedTypeMatch(Method method, Method method2, Map<TypeVariable, Type> map) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Class<?>[] parameterTypes = method2.getParameterTypes();
        if (genericParameterTypes.length != parameterTypes.length) {
            return false;
        }
        for (int i2 = 0; i2 < genericParameterTypes.length; i2++) {
            Type type = genericParameterTypes[i2];
            Class<?> cls = parameterTypes[i2];
            if (cls.isArray()) {
                Type rawType = GenericTypeResolver.getRawType(type, map);
                if (rawType instanceof GenericArrayType) {
                    return cls.getComponentType().equals(GenericTypeResolver.resolveType(((GenericArrayType) rawType).getGenericComponentType(), map));
                }
            }
            if (!cls.equals(GenericTypeResolver.resolveType(type, map))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isVisibilityBridgeMethodPair(Method method, Method method2) {
        if (method == method2) {
            return true;
        }
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes()) && method.getReturnType().equals(method2.getReturnType());
    }

    private static Method searchCandidates(List<Method> list, Method method) {
        if (list.isEmpty()) {
            return null;
        }
        Map<TypeVariable, Type> typeVariableMap = GenericTypeResolver.getTypeVariableMap(method.getDeclaringClass());
        Method method2 = null;
        boolean z2 = true;
        for (Method method3 : list) {
            if (isBridgeMethodFor(method, method3, typeVariableMap)) {
                return method3;
            }
            if (method2 != null) {
                z2 = z2 && Arrays.equals(method3.getGenericParameterTypes(), method2.getGenericParameterTypes());
            }
            method2 = method3;
        }
        if (z2) {
            return list.get(0);
        }
        return null;
    }

    private static Method searchForMatch(Class cls, Method method) {
        return ReflectionUtils.findMethod(cls, method.getName(), method.getParameterTypes());
    }
}
