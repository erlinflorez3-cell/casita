package com.facetec.sdk;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class ef<T> {
    private Type Code;
    private int V;
    private Class<? super T> Z;

    protected ef() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type typeI = dh.I(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.Code = typeI;
        this.Z = (Class<? super T>) dh.V(typeI);
        this.V = this.Code.hashCode();
    }

    private ef(Type type) {
        Type typeI = dh.I((Type) dp.Code(type));
        this.Code = typeI;
        this.Z = (Class<? super T>) dh.V(typeI);
        this.V = this.Code.hashCode();
    }

    public static <T> ef<T> I(Class<T> cls) {
        return new ef<>(cls);
    }

    public static ef<?> V(Type type) {
        return new ef<>(type);
    }

    public final Type V() {
        return this.Code;
    }

    public final Class<? super T> Z() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ef) && dh.Code(this.Code, ((ef) obj).Code);
    }

    public final int hashCode() {
        return this.V;
    }

    public final String toString() {
        return dh.Z(this.Code);
    }
}
