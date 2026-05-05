package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class dh {
    static final Type[] I = new Type[0];

    static final class Code implements Serializable, GenericArrayType {
        private final Type Code;

        public Code(Type type) {
            this.Code = dh.I(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && dh.Code(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.Code;
        }

        public final int hashCode() {
            return this.Code.hashCode();
        }

        public final String toString() {
            return new StringBuilder().append(dh.Z(this.Code)).append("[]").toString();
        }
    }

    static final class I implements Serializable, WildcardType {
        private final Type B;
        private final Type I;

        public I(Type[] typeArr, Type[] typeArr2) {
            dp.V(typeArr2.length <= 1);
            dp.V(typeArr.length == 1);
            if (typeArr2.length != 1) {
                dp.Code(typeArr[0]);
                dh.Code(typeArr[0]);
                this.I = null;
                this.B = dh.I(typeArr[0]);
                return;
            }
            dp.Code(typeArr2[0]);
            dh.Code(typeArr2[0]);
            dp.V(typeArr[0] == Object.class);
            this.I = dh.I(typeArr2[0]);
            this.B = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && dh.Code(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.I;
            return type != null ? new Type[]{type} : dh.I;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.B};
        }

        public final int hashCode() {
            Type type = this.I;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.B.hashCode() + 31);
        }

        public final String toString() {
            return this.I != null ? new StringBuilder("? super ").append(dh.Z(this.I)).toString() : this.B == Object.class ? Global.QUESTION : new StringBuilder("? extends ").append(dh.Z(this.B)).toString();
        }
    }

    static final class Z implements Serializable, ParameterizedType {
        private final Type[] Code;
        private final Type I;
        private final Type Z;

        public Z(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                boolean z3 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z3) {
                    z2 = false;
                }
                dp.V(z2);
            }
            this.I = type == null ? null : dh.I(type);
            this.Z = dh.I(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.Code = typeArr2;
            int length = typeArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                dp.Code(this.Code[i2]);
                dh.Code(this.Code[i2]);
                Type[] typeArr3 = this.Code;
                typeArr3[i2] = dh.I(typeArr3[i2]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && dh.Code(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.Code.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.I;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.Z;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.Code) ^ this.Z.hashCode()) ^ dh.I((Object) this.I);
        }

        public final String toString() {
            int length = this.Code.length;
            if (length == 0) {
                return dh.Z(this.Z);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(dh.Z(this.Z)).append("<").append(dh.Z(this.Code[0]));
            for (int i2 = 1; i2 < length; i2++) {
                sb.append(", ").append(dh.Z(this.Code[i2]));
            }
            return sb.append(">").toString();
        }
    }

    public static Type B(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type B(Type type, Class<?> cls) {
        Type typeI = I(type, cls, Collection.class);
        if (typeI instanceof WildcardType) {
            typeI = ((WildcardType) typeI).getUpperBounds()[0];
        }
        return typeI instanceof ParameterizedType ? ((ParameterizedType) typeI).getActualTypeArguments()[0] : Object.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0022 A[LOOP:2: B:54:0x0022->B:63:0x003c, LOOP_START, PHI: r5
  0x0022: PHI (r5v2 java.lang.Class<?>) = (r5v1 java.lang.Class<?>), (r5v3 java.lang.Class<?>) binds: [B:53:0x0020, B:63:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type B(java.lang.reflect.Type r4, java.lang.Class<?> r5, java.lang.Class<?> r6) {
        /*
        L0:
            if (r6 != r5) goto L3
            return r4
        L3:
            boolean r0 = r6.isInterface()
            if (r0 == 0) goto L1c
            java.lang.Class[] r3 = r5.getInterfaces()
            int r2 = r3.length
            r1 = 0
        Lf:
            if (r1 >= r2) goto L1c
            r0 = r3[r1]
            if (r0 != r6) goto L3e
            java.lang.reflect.Type[] r0 = r5.getGenericInterfaces()
            r0 = r0[r1]
            return r0
        L1c:
            boolean r0 = r5.isInterface()
            if (r0 != 0) goto L51
        L22:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r5 == r0) goto L51
            java.lang.Class r1 = r5.getSuperclass()
            if (r1 != r6) goto L31
            java.lang.reflect.Type r0 = r5.getGenericSuperclass()
            return r0
        L31:
            boolean r0 = r6.isAssignableFrom(r1)
            if (r0 == 0) goto L3c
            java.lang.reflect.Type r4 = r5.getGenericSuperclass()
            goto L4c
        L3c:
            r5 = r1
            goto L22
        L3e:
            boolean r0 = r6.isAssignableFrom(r0)
            if (r0 == 0) goto L4e
            java.lang.reflect.Type[] r0 = r5.getGenericInterfaces()
            r4 = r0[r1]
            r1 = r3[r1]
        L4c:
            r5 = r1
            goto L0
        L4e:
            int r1 = r1 + 1
            goto Lf
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.dh.B(java.lang.reflect.Type, java.lang.Class, java.lang.Class):java.lang.reflect.Type");
    }

    public static Type B(Type type, Class<?> cls, Type type2) {
        return Code(type, cls, type2, new HashSet());
    }

    private static GenericArrayType C(Type type) {
        return new Code(type);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type Code(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.dh.Code(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    static void Code(Type type) {
        dp.V(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static boolean Code(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                return I(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            if (!(type instanceof GenericArrayType)) {
                if (type instanceof WildcardType) {
                    if (!(type2 instanceof WildcardType)) {
                        return false;
                    }
                    WildcardType wildcardType = (WildcardType) type;
                    WildcardType wildcardType2 = (WildcardType) type2;
                    return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                }
                if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            type = ((GenericArrayType) type).getGenericComponentType();
            type2 = ((GenericArrayType) type2).getGenericComponentType();
        }
        return true;
    }

    static int I(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static Type I(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            boolean zIsArray = cls.isArray();
            Type code = cls;
            if (zIsArray) {
                code = new Code(I((Type) cls.getComponentType()));
            }
            return code;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new Z(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new Code(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new I(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    private static Type I(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        dp.V(cls2.isAssignableFrom(cls));
        return B(type, cls, B(type, cls, cls2));
    }

    private static boolean I(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Class<?> V(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                dp.V(rawType instanceof Class);
                return (Class) rawType;
            }
            if (type instanceof GenericArrayType) {
                return Array.newInstance(V(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (!(type instanceof WildcardType)) {
                throw new IllegalArgumentException(new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <").append(type).append("> is of type ").append(type == null ? "null" : type.getClass().getName()).toString());
            }
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        return (Class) type;
    }

    public static Type[] V(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeI = I(type, cls, Map.class);
        return typeI instanceof ParameterizedType ? ((ParameterizedType) typeI).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static String Z(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
