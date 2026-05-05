package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class TypeResolver {
    private final TypeTable typeTable;

    /* JADX INFO: renamed from: com.google.common.reflect.TypeResolver$1 */
    class AnonymousClass1 extends TypeVisitor {
        final /* synthetic */ Map val$mappings;
        final /* synthetic */ Type val$to;

        AnonymousClass1(final Map val$mappings, final Type val$to) {
            val$mappings = val$mappings;
            val$to = val$to;
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitClass(Class<?> fromClass) {
            if (!(val$to instanceof WildcardType)) {
                throw new IllegalArgumentException("No type mapping from " + fromClass + " to " + val$to);
            }
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitGenericArrayType(GenericArrayType fromArrayType) {
            Type type = val$to;
            if (type instanceof WildcardType) {
                return;
            }
            Type componentType = Types.getComponentType(type);
            Preconditions.checkArgument(componentType != null, "%s is not an array type.", val$to);
            TypeResolver.populateTypeMappings(val$mappings, fromArrayType.getGenericComponentType(), componentType);
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitParameterizedType(ParameterizedType fromParameterizedType) {
            Type type = val$to;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType = (ParameterizedType) TypeResolver.expectArgument(ParameterizedType.class, type);
            if (fromParameterizedType.getOwnerType() != null && parameterizedType.getOwnerType() != null) {
                TypeResolver.populateTypeMappings(val$mappings, fromParameterizedType.getOwnerType(), parameterizedType.getOwnerType());
            }
            Preconditions.checkArgument(fromParameterizedType.getRawType().equals(parameterizedType.getRawType()), "Inconsistent raw type: %s vs. %s", fromParameterizedType, val$to);
            Type[] actualTypeArguments = fromParameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
            Preconditions.checkArgument(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", fromParameterizedType, parameterizedType);
            for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                TypeResolver.populateTypeMappings(val$mappings, actualTypeArguments[i2], actualTypeArguments2[i2]);
            }
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitTypeVariable(TypeVariable<?> typeVariable) {
            val$mappings.put(new TypeVariableKey(typeVariable), val$to);
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitWildcardType(WildcardType fromWildcardType) {
            Type type = val$to;
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] upperBounds = fromWildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType.getUpperBounds();
                Type[] lowerBounds = fromWildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType.getLowerBounds();
                Preconditions.checkArgument(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", fromWildcardType, val$to);
                for (int i2 = 0; i2 < upperBounds.length; i2++) {
                    TypeResolver.populateTypeMappings(val$mappings, upperBounds[i2], upperBounds2[i2]);
                }
                for (int i3 = 0; i3 < lowerBounds.length; i3++) {
                    TypeResolver.populateTypeMappings(val$mappings, lowerBounds[i3], lowerBounds2[i3]);
                }
            }
        }
    }

    private static final class TypeMappingIntrospector extends TypeVisitor {
        private final Map<TypeVariableKey, Type> mappings = Maps.newHashMap();

        private TypeMappingIntrospector() {
        }

        static ImmutableMap<TypeVariableKey, Type> getTypeMappings(Type contextType) {
            Preconditions.checkNotNull(contextType);
            TypeMappingIntrospector typeMappingIntrospector = new TypeMappingIntrospector();
            typeMappingIntrospector.visit(contextType);
            return ImmutableMap.copyOf((Map) typeMappingIntrospector.mappings);
        }

        private void map(TypeVariableKey var, Type arg) {
            if (this.mappings.containsKey(var)) {
                return;
            }
            Type type = arg;
            while (type != null) {
                if (var.equalsType(type)) {
                    while (arg != null) {
                        arg = this.mappings.remove(TypeVariableKey.forLookup(arg));
                    }
                    return;
                }
                type = this.mappings.get(TypeVariableKey.forLookup(type));
            }
            this.mappings.put(var, arg);
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitClass(Class<?> clazz) {
            visit(clazz.getGenericSuperclass());
            visit(clazz.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitParameterizedType(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Preconditions.checkState(typeParameters.length == actualTypeArguments.length);
            for (int i2 = 0; i2 < typeParameters.length; i2++) {
                map(new TypeVariableKey(typeParameters[i2]), actualTypeArguments[i2]);
            }
            visit(cls);
            visit(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitTypeVariable(TypeVariable<?> t2) {
            visit(t2.getBounds());
        }

        @Override // com.google.common.reflect.TypeVisitor
        void visitWildcardType(WildcardType t2) {
            visit(t2.getUpperBounds());
        }
    }

    private static class TypeTable {
        private final ImmutableMap<TypeVariableKey, Type> map;

        /* JADX INFO: renamed from: com.google.common.reflect.TypeResolver$TypeTable$1 */
        class AnonymousClass1 extends TypeTable {
            final /* synthetic */ TypeTable val$unguarded;
            final /* synthetic */ TypeVariable val$var;

            AnonymousClass1(final TypeTable this$0, final TypeVariable val$var, final TypeTable val$unguarded) {
                val$var = val$var;
                val$unguarded = val$unguarded;
            }

            @Override // com.google.common.reflect.TypeResolver.TypeTable
            public Type resolveInternal(TypeVariable<?> intermediateVar, TypeTable forDependent) {
                return intermediateVar.getGenericDeclaration().equals(val$var.getGenericDeclaration()) ? intermediateVar : val$unguarded.resolveInternal(intermediateVar, forDependent);
            }
        }

        TypeTable() {
            this.map = ImmutableMap.of();
        }

        private TypeTable(ImmutableMap<TypeVariableKey, Type> map) {
            this.map = map;
        }

        final Type resolve(TypeVariable<?> var) {
            return resolveInternal(var, new TypeTable(this) { // from class: com.google.common.reflect.TypeResolver.TypeTable.1
                final /* synthetic */ TypeTable val$unguarded;
                final /* synthetic */ TypeVariable val$var;

                AnonymousClass1(TypeTable this, TypeVariable var2, TypeTable this) {
                    val$var = var2;
                    val$unguarded = this;
                }

                @Override // com.google.common.reflect.TypeResolver.TypeTable
                public Type resolveInternal(TypeVariable<?> intermediateVar, TypeTable forDependent) {
                    return intermediateVar.getGenericDeclaration().equals(val$var.getGenericDeclaration()) ? intermediateVar : val$unguarded.resolveInternal(intermediateVar, forDependent);
                }
            });
        }

        Type resolveInternal(TypeVariable<?> var, TypeTable forDependants) {
            Type type = this.map.get(new TypeVariableKey(var));
            if (type != null) {
                return new TypeResolver(forDependants).resolveType(type);
            }
            Type[] bounds = var.getBounds();
            if (bounds.length == 0) {
                return var;
            }
            Type[] typeArrResolveTypes = new TypeResolver(forDependants).resolveTypes(bounds);
            return (Types.NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY && Arrays.equals(bounds, typeArrResolveTypes)) ? var : Types.newArtificialTypeVariable(var.getGenericDeclaration(), var.getName(), typeArrResolveTypes);
        }

        final TypeTable where(Map<TypeVariableKey, ? extends Type> mappings) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            builder.putAll(this.map);
            for (Map.Entry<TypeVariableKey, ? extends Type> entry : mappings.entrySet()) {
                TypeVariableKey key = entry.getKey();
                Type value = entry.getValue();
                Preconditions.checkArgument(!key.equalsType(value), "Type variable %s bound to itself", key);
                builder.put(key, value);
            }
            return new TypeTable(builder.buildOrThrow());
        }
    }

    static final class TypeVariableKey {
        private final TypeVariable<?> var;

        TypeVariableKey(TypeVariable<?> var) {
            this.var = (TypeVariable) Preconditions.checkNotNull(var);
        }

        private boolean equalsTypeVariable(TypeVariable<?> that) {
            return this.var.getGenericDeclaration().equals(that.getGenericDeclaration()) && this.var.getName().equals(that.getName());
        }

        @CheckForNull
        static TypeVariableKey forLookup(Type t2) {
            if (t2 instanceof TypeVariable) {
                return new TypeVariableKey((TypeVariable) t2);
            }
            return null;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof TypeVariableKey) {
                return equalsTypeVariable(((TypeVariableKey) obj).var);
            }
            return false;
        }

        boolean equalsType(Type type) {
            if (type instanceof TypeVariable) {
                return equalsTypeVariable((TypeVariable) type);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.var.getGenericDeclaration(), this.var.getName());
        }

        public String toString() {
            return this.var.toString();
        }
    }

    private static class WildcardCapturer {
        static final WildcardCapturer INSTANCE = new WildcardCapturer();
        private final AtomicInteger id;

        /* JADX INFO: renamed from: com.google.common.reflect.TypeResolver$WildcardCapturer$1 */
        class AnonymousClass1 extends WildcardCapturer {
            final /* synthetic */ TypeVariable val$typeParam;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(final WildcardCapturer this$0, AtomicInteger id, final TypeVariable val$typeParam) {
                super(id);
                val$typeParam = val$typeParam;
            }

            @Override // com.google.common.reflect.TypeResolver.WildcardCapturer
            TypeVariable<?> captureAsTypeVariable(Type[] upperBounds) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(upperBounds));
                linkedHashSet.addAll(Arrays.asList(val$typeParam.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.captureAsTypeVariable((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        private WildcardCapturer() {
            this(new AtomicInteger());
        }

        private WildcardCapturer(AtomicInteger id) {
            this.id = id;
        }

        /* synthetic */ WildcardCapturer(AtomicInteger atomicInteger, AnonymousClass1 anonymousClass1) {
            this(atomicInteger);
        }

        @CheckForNull
        private Type captureNullable(@CheckForNull Type type) {
            if (type == null) {
                return null;
            }
            return capture(type);
        }

        private WildcardCapturer forTypeVariable(TypeVariable<?> typeParam) {
            return new WildcardCapturer(this, this.id) { // from class: com.google.common.reflect.TypeResolver.WildcardCapturer.1
                final /* synthetic */ TypeVariable val$typeParam;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(WildcardCapturer this, AtomicInteger id, TypeVariable typeParam2) {
                    super(id);
                    val$typeParam = typeParam2;
                }

                @Override // com.google.common.reflect.TypeResolver.WildcardCapturer
                TypeVariable<?> captureAsTypeVariable(Type[] upperBounds) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(upperBounds));
                    linkedHashSet.addAll(Arrays.asList(val$typeParam.getBounds()));
                    if (linkedHashSet.size() > 1) {
                        linkedHashSet.remove(Object.class);
                    }
                    return super.captureAsTypeVariable((Type[]) linkedHashSet.toArray(new Type[0]));
                }
            };
        }

        private WildcardCapturer notForTypeVariable() {
            return new WildcardCapturer(this.id);
        }

        final Type capture(Type type) {
            Preconditions.checkNotNull(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Types.newArrayType(notForTypeVariable().capture(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof ParameterizedType)) {
                if (!(type instanceof WildcardType)) {
                    throw new AssertionError("must have been one of the known types");
                }
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? captureAsTypeVariable(wildcardType.getUpperBounds()) : type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable<?>[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                actualTypeArguments[i2] = forTypeVariable(typeParameters[i2]).capture(actualTypeArguments[i2]);
            }
            return Types.newParameterizedTypeWithOwner(notForTypeVariable().captureNullable(parameterizedType.getOwnerType()), cls, actualTypeArguments);
        }

        TypeVariable<?> captureAsTypeVariable(Type[] upperBounds) {
            return Types.newArtificialTypeVariable(WildcardCapturer.class, "capture#" + this.id.incrementAndGet() + "-of ? extends " + Joiner.on(Typography.amp).join(upperBounds), upperBounds);
        }
    }

    public TypeResolver() {
        this.typeTable = new TypeTable();
    }

    private TypeResolver(TypeTable typeTable) {
        this.typeTable = typeTable;
    }

    /* synthetic */ TypeResolver(TypeTable typeTable, AnonymousClass1 anonymousClass1) {
        this(typeTable);
    }

    static TypeResolver covariantly(Type contextType) {
        return new TypeResolver().where(TypeMappingIntrospector.getTypeMappings(contextType));
    }

    public static <T> T expectArgument(Class<T> type, Object arg) {
        try {
            return type.cast(arg);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(arg + " is not a " + type.getSimpleName());
        }
    }

    static TypeResolver invariantly(Type contextType) {
        return new TypeResolver().where(TypeMappingIntrospector.getTypeMappings(WildcardCapturer.INSTANCE.capture(contextType)));
    }

    public static void populateTypeMappings(Map<TypeVariableKey, Type> mappings, Type from, Type to) {
        if (from.equals(to)) {
            return;
        }
        new TypeVisitor() { // from class: com.google.common.reflect.TypeResolver.1
            final /* synthetic */ Map val$mappings;
            final /* synthetic */ Type val$to;

            AnonymousClass1(Map mappings2, Type to2) {
                val$mappings = mappings2;
                val$to = to2;
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitClass(Class<?> fromClass) {
                if (!(val$to instanceof WildcardType)) {
                    throw new IllegalArgumentException("No type mapping from " + fromClass + " to " + val$to);
                }
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitGenericArrayType(GenericArrayType fromArrayType) {
                Type type = val$to;
                if (type instanceof WildcardType) {
                    return;
                }
                Type componentType = Types.getComponentType(type);
                Preconditions.checkArgument(componentType != null, "%s is not an array type.", val$to);
                TypeResolver.populateTypeMappings(val$mappings, fromArrayType.getGenericComponentType(), componentType);
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitParameterizedType(ParameterizedType fromParameterizedType) {
                Type type = val$to;
                if (type instanceof WildcardType) {
                    return;
                }
                ParameterizedType parameterizedType = (ParameterizedType) TypeResolver.expectArgument(ParameterizedType.class, type);
                if (fromParameterizedType.getOwnerType() != null && parameterizedType.getOwnerType() != null) {
                    TypeResolver.populateTypeMappings(val$mappings, fromParameterizedType.getOwnerType(), parameterizedType.getOwnerType());
                }
                Preconditions.checkArgument(fromParameterizedType.getRawType().equals(parameterizedType.getRawType()), "Inconsistent raw type: %s vs. %s", fromParameterizedType, val$to);
                Type[] actualTypeArguments = fromParameterizedType.getActualTypeArguments();
                Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                Preconditions.checkArgument(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", fromParameterizedType, parameterizedType);
                for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                    TypeResolver.populateTypeMappings(val$mappings, actualTypeArguments[i2], actualTypeArguments2[i2]);
                }
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitTypeVariable(TypeVariable<?> typeVariable) {
                val$mappings.put(new TypeVariableKey(typeVariable), val$to);
            }

            @Override // com.google.common.reflect.TypeVisitor
            void visitWildcardType(WildcardType fromWildcardType) {
                Type type = val$to;
                if (type instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    Type[] upperBounds = fromWildcardType.getUpperBounds();
                    Type[] upperBounds2 = wildcardType.getUpperBounds();
                    Type[] lowerBounds = fromWildcardType.getLowerBounds();
                    Type[] lowerBounds2 = wildcardType.getLowerBounds();
                    Preconditions.checkArgument(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", fromWildcardType, val$to);
                    for (int i2 = 0; i2 < upperBounds.length; i2++) {
                        TypeResolver.populateTypeMappings(val$mappings, upperBounds[i2], upperBounds2[i2]);
                    }
                    for (int i3 = 0; i3 < lowerBounds.length; i3++) {
                        TypeResolver.populateTypeMappings(val$mappings, lowerBounds[i3], lowerBounds2[i3]);
                    }
                }
            }
        }.visit(from);
    }

    private Type resolveGenericArrayType(GenericArrayType type) {
        return Types.newArrayType(resolveType(type.getGenericComponentType()));
    }

    private ParameterizedType resolveParameterizedType(ParameterizedType type) {
        Type ownerType = type.getOwnerType();
        return Types.newParameterizedTypeWithOwner(ownerType == null ? null : resolveType(ownerType), (Class) resolveType(type.getRawType()), resolveTypes(type.getActualTypeArguments()));
    }

    public Type[] resolveTypes(Type[] types) {
        Type[] typeArr = new Type[types.length];
        for (int i2 = 0; i2 < types.length; i2++) {
            typeArr[i2] = resolveType(types[i2]);
        }
        return typeArr;
    }

    private WildcardType resolveWildcardType(WildcardType type) {
        return new Types.WildcardTypeImpl(resolveTypes(type.getLowerBounds()), resolveTypes(type.getUpperBounds()));
    }

    public Type resolveType(Type type) {
        Preconditions.checkNotNull(type);
        return type instanceof TypeVariable ? this.typeTable.resolve((TypeVariable) type) : type instanceof ParameterizedType ? resolveParameterizedType((ParameterizedType) type) : type instanceof GenericArrayType ? resolveGenericArrayType((GenericArrayType) type) : type instanceof WildcardType ? resolveWildcardType((WildcardType) type) : type;
    }

    Type[] resolveTypesInPlace(Type[] types) {
        for (int i2 = 0; i2 < types.length; i2++) {
            types[i2] = resolveType(types[i2]);
        }
        return types;
    }

    public TypeResolver where(Type formal, Type actual) {
        HashMap mapNewHashMap = Maps.newHashMap();
        populateTypeMappings(mapNewHashMap, (Type) Preconditions.checkNotNull(formal), (Type) Preconditions.checkNotNull(actual));
        return where(mapNewHashMap);
    }

    TypeResolver where(Map<TypeVariableKey, ? extends Type> mappings) {
        return new TypeResolver(this.typeTable.where(mappings));
    }
}
