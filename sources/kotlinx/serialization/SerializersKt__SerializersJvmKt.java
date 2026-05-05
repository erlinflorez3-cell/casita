package kotlinx.serialization;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d̉=!4i\bDRш|İI\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007njO0L͜P.`\\2\u000fq{<$q$yCAX\"}0'WNmk\u0007\\hŏ[\u0015\u0016\u0018\tjZI\u0004w\u000e\u0016\u001d3Zom5e\u0004K<x|F\u000702P8\u0010\u0004/\u0019ZL\u001ew\u0013Cy\u000e*WNtRZ\u001dO\u0015\u001a@\u0006T\u001f/\u001d\u0005g|;xpk;G#1orR5fH|{\u0015\rTܮ\u0011vg'CSE?-)c\u0003\rS\nJ+? ?KhҊ++O\u007fo{f\r,\u001d;Q\u001d]94r\u0004\u007f_,-1ՒqYx\u000eVw#{;A4\u0018\u00146`4=\u001cv\bTA#}\u0004R^\u0012vP\u0010\u0005q>')\u00105A8If\u007f`i*\u00157߉\t\r$5\u0019\u0005/żl\u0014p\u0017+T&Q_Ph=vS:]Kn\u001cp\u0011\u0004B->Z\u00187\f\u0013>\u0017S7q8Q \u0014\u0002vI\u0018z\u0013a\u0001S\u0018TxF(n$>B\t:b\u000bdʰoPZlD)[\u001fl\u000f\u000e\n# \u000bwR S\u000fvO\u0017n\u001bQk\u000b=/\u00159q\u001ay#oAn5EQ\u0012\u0010wQ%\u0013g<\u0011\n\tnPT$^l((3vu@{\nKf\fA:\u0006qʬ8,7/Ë\u0019_"}, d2 = {"Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "", "Bx_2", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqjT\f\u0017l", "Ada6T3Bh\u0019\fdk\u0015\r\u00106", "5d]2e0</&\fvr\u001a|\u00163a\u0007,\u0011@\u000e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fq]@\n\u0017$KmiI\u0004!IH\u0012+7C", "4`X9B5&W'\r~g.k\u001d:e[5}.\u0001$\u001bCv\u0012Qv2", "", "5d]2e0</&\fvr\u001a|\u00163a\u0007,\u0011@\u000eU\u0005G|\u00128})JY\u000b.\u001d|\u0010(;CHo0%\u0019}aF\u0015H=V\\6", ">qTAg@\u001cZ\u0015\r\t", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", ">qTAg@\u001cZ\u0015\r\t\u001d\u001a|\u00163a\u0007,\u0011@\u000e%|Vi\b*v29U\u0005$Lm#<2TCQC", "@dU9X*MW*~dk\n\u0007\u0012>e\u00137\f<\b", "\"", "8B[.f:", "Bx_249@c!~\u0004m:j\t<i{/\u007fU\u0001$%", "", "@dU9X*MW*~dk\n\u0007\u0012>e\u00137\f<\bU\u0005G|\u00128})JY\u000b.\u001d|\u0010(;CHo0%\u0019}aF\u0015H=V\\6", "Ada6T3Bh\u0019\fWr\u0011x\u001a+T\u00143{$\t\"\u001e", "Ada6T3Bh\u0019\fWr\u0011x\u001a+T\u00143{$\t\"\u001e\u0006]\u000eIz!<]\u0013 D{{=G=)kA\"\u0011oeN\u0007p:3\b/-[", "Bx_2F,KW\u0015\u0006~s,\n", "Bx_2F,KW\u0015\u0006~s,\nG\u001de\r,wG\u0005,\u0017T}sKp\u001f#Y\u000b$3t\u001aCMPIPE&zw", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 5, mv = {1, 8, 0}, pn = "", xi = 48, xs = ">AE<8<Ez>/;1(2.>$6*/-l\u0010!-#\u001a$ 0\u001a&&|%")
final /* synthetic */ class SerializersKt__SerializersJvmKt {
    private static final KSerializer<Object> genericArraySerializer$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, GenericArrayType genericArrayType, boolean z2) {
        KSerializer<Object> kSerializerSerializerOrNull;
        KClass kotlinClass;
        Type eType = genericArrayType.getGenericComponentType();
        if (eType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) eType).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "it.upperBounds");
            eType = (Type) ArraysKt.first(upperBounds);
        }
        Intrinsics.checkNotNullExpressionValue(eType, "eType");
        if (z2) {
            kSerializerSerializerOrNull = SerializersKt.serializer(serializersModule, eType);
        } else {
            kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, eType);
            if (kSerializerSerializerOrNull == null) {
                return null;
            }
        }
        if (eType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) eType).getRawType();
            Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            kotlinClass = JvmClassMappingKt.getKotlinClass((Class) rawType);
        } else {
            if (!(eType instanceof KClass)) {
                throw new IllegalStateException("unsupported type in GenericArray: " + Reflection.getOrCreateKotlinClass(eType.getClass()));
            }
            kotlinClass = (KClass) eType;
        }
        Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<Object> kSerializerArraySerializer = BuiltinSerializersKt.ArraySerializer(kotlinClass, kSerializerSerializerOrNull);
        Intrinsics.checkNotNull(kSerializerArraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializerArraySerializer;
    }

    private static final Class<?> prettyClass$SerializersKt__SerializersJvmKt(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Intrinsics.checkNotNullExpressionValue(rawType, "it.rawType");
            return prettyClass$SerializersKt__SerializersJvmKt(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "it.upperBounds");
            Object objFirst = ArraysKt.first(upperBounds);
            Intrinsics.checkNotNullExpressionValue(objFirst, "it.upperBounds.first()");
            return prettyClass$SerializersKt__SerializersJvmKt((Type) objFirst);
        }
        if (!(type instanceof GenericArrayType)) {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.getOrCreateKotlinClass(type.getClass()));
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        Intrinsics.checkNotNullExpressionValue(genericComponentType, "it.genericComponentType");
        return prettyClass$SerializersKt__SerializersJvmKt(genericComponentType);
    }

    private static final <T> KSerializer<T> reflectiveOrContextual$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, Class<T> cls, List<? extends KSerializer<Object>> list) throws IllegalAccessException, InvocationTargetException {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer<T> kSerializerConstructSerializerForGivenTypeArgs = PlatformKt.constructSerializerForGivenTypeArgs(cls, (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerConstructSerializerForGivenTypeArgs != null) {
            return kSerializerConstructSerializerForGivenTypeArgs;
        }
        KClass<T> kotlinClass = JvmClassMappingKt.getKotlinClass(cls);
        KSerializer<T> kSerializerBuiltinSerializerOrNull = PrimitivesKt.builtinSerializerOrNull(kotlinClass);
        return kSerializerBuiltinSerializerOrNull == null ? serializersModule.getContextual(kotlinClass, list) : kSerializerBuiltinSerializerOrNull;
    }

    public static final KSerializer<Object> serializer(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, Type type) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer<Object> kSerializerSerializerByJavaTypeImpl$SerializersKt__SerializersJvmKt = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, true);
        if (kSerializerSerializerByJavaTypeImpl$SerializersKt__SerializersJvmKt != null) {
            return kSerializerSerializerByJavaTypeImpl$SerializersKt__SerializersJvmKt;
        }
        PlatformKt.serializerNotRegistered(prettyClass$SerializersKt__SerializersJvmKt(type));
        throw new KotlinNothingValueException();
    }

    private static final KSerializer<Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, Type type, boolean z2) {
        ArrayList arrayList;
        if (type instanceof GenericArrayType) {
            return genericArraySerializer$SerializersKt__SerializersJvmKt(serializersModule, (GenericArrayType) type, z2);
        }
        if (type instanceof Class) {
            return typeSerializer$SerializersKt__SerializersJvmKt(serializersModule, (Class) type, z2);
        }
        if (!(type instanceof ParameterizedType)) {
            if (!(type instanceof WildcardType)) {
                throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.getOrCreateKotlinClass(type.getClass()));
            }
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "type.upperBounds");
            Object objFirst = ArraysKt.first(upperBounds);
            Intrinsics.checkNotNullExpressionValue(objFirst, "type.upperBounds.first()");
            return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(serializersModule, (Type) objFirst, false, 2, null);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) rawType;
        Type[] args = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(args, "args");
        if (z2) {
            arrayList = new ArrayList(args.length);
            for (Type it : args) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                arrayList.add(SerializersKt.serializer(serializersModule, it));
            }
        } else {
            arrayList = new ArrayList(args.length);
            for (Type it2 : args) {
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                KSerializer<Object> kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, it2);
                if (kSerializerSerializerOrNull == null) {
                    return null;
                }
                arrayList.add(kSerializerSerializerOrNull);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (Set.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerSetSerializer = BuiltinSerializersKt.SetSerializer((KSerializer) arrayList2.get(0));
            Intrinsics.checkNotNull(kSerializerSetSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerSetSerializer;
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerListSerializer = BuiltinSerializersKt.ListSerializer((KSerializer) arrayList2.get(0));
            Intrinsics.checkNotNull(kSerializerListSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerListSerializer;
        }
        if (Map.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerMapSerializer = BuiltinSerializersKt.MapSerializer((KSerializer) arrayList2.get(0), (KSerializer) arrayList2.get(1));
            Intrinsics.checkNotNull(kSerializerMapSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerMapSerializer;
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerMapEntrySerializer = BuiltinSerializersKt.MapEntrySerializer((KSerializer) arrayList2.get(0), (KSerializer) arrayList2.get(1));
            Intrinsics.checkNotNull(kSerializerMapEntrySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerMapEntrySerializer;
        }
        if (Pair.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerPairSerializer = BuiltinSerializersKt.PairSerializer((KSerializer) arrayList2.get(0), (KSerializer) arrayList2.get(1));
            Intrinsics.checkNotNull(kSerializerPairSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerPairSerializer;
        }
        if (Triple.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerTripleSerializer = BuiltinSerializersKt.TripleSerializer((KSerializer) arrayList2.get(0), (KSerializer) arrayList2.get(1), (KSerializer) arrayList2.get(2));
            Intrinsics.checkNotNull(kSerializerTripleSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerTripleSerializer;
        }
        ArrayList<KSerializer> arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        for (KSerializer kSerializer : arrayList3) {
            Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList4.add(kSerializer);
        }
        return reflectiveOrContextual$SerializersKt__SerializersJvmKt(serializersModule, cls, arrayList4);
    }

    static /* synthetic */ KSerializer serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(SerializersModule serializersModule, Type type, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = true;
        }
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, z2);
    }

    public static final KSerializer<Object> serializerOrNull(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, Type type) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, false);
    }

    private static final KSerializer<Object> typeSerializer$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, Class<?> cls, boolean z2) {
        KSerializer<Object> kSerializerSerializerOrNull;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return reflectiveOrContextual$SerializersKt__SerializersJvmKt(serializersModule, cls, CollectionsKt.emptyList());
        }
        Class<?> componentType = cls.getComponentType();
        Intrinsics.checkNotNullExpressionValue(componentType, "type.componentType");
        if (z2) {
            kSerializerSerializerOrNull = SerializersKt.serializer(serializersModule, componentType);
        } else {
            kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, componentType);
            if (kSerializerSerializerOrNull == null) {
                return null;
            }
        }
        KClass kotlinClass = JvmClassMappingKt.getKotlinClass(componentType);
        Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<Object> kSerializerArraySerializer = BuiltinSerializersKt.ArraySerializer(kotlinClass, kSerializerSerializerOrNull);
        Intrinsics.checkNotNull(kSerializerArraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializerArraySerializer;
    }
}
