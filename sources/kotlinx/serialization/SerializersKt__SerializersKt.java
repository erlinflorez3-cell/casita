package kotlinx.serialization;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!4i\bӵLc\u0003\u0010Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0RtP.XT2\u000fyڔ<řc$\bCCU ~*\t]logtNb\u000bQ\u0018\u000e\u0016~pD[cތu\u0016\u001f2Hpm2}sK9xtd\u0006f1:V\bڎ\u0019\u001e:H\u0016w)B{\u0010 2XphU=U\u0013\u001e*\nN \u0007\u001f\u000bl\u00155`\"kŽG'\u0013iHOU^`\u0001[\u000f^TU\u0010'i,/X;E\u0015+T1\f\u0003iM\tW{M\u000bx+7+Ot\u00065\u0007\u0007Z\u0014ۣS\rkz>q\u0013Zx\u00127-_c\u0012Z<'\u0018~\u0002ȞJ\u000e$\u0005mΥ4E.t\u0011&;\u0005vcBf\u0001\rM.y\u0012:%1\u00183YF3|_oS#^;\f\u0007#\u001dQ\f\u0005 \nS>d#'lw\u007f>i\u0004KWf\u0014iAs\u0003\u0001b05\u001a/u~W\u0002!0'%efg(Qu\u0010X\\m\u0007\u0007ph\u0002v\u0001Yp4|(O8\u0019\u0016jLt\t{RjWZ\u001c{\u001b\u0003\u0018D\b˙$\\}O9Z\u001ebgrynS\\\u001a%]qMX\u001dj6]I`C5\u007fn>f\u0003\t\"QTp\u0015bvJc\u0010j^>!`S\u0019\u000f&\r\u000bNܟ\u00172E\u00074c:G1d%L\u0013 X@C\u0013\u000eY\t\u0016\u0005ԞA.+iR\u007f1\u0007`^\u0001o.\u0003w+-d0DYQc1lUɋl4\u0003<\u001f=\u0002\u001a_q\\KRk&u\u0004\u00076\u0015H8y5M\u0015\u001f~W=02uV\u0001\u0001iS\")\u000b|(\u001ciy^y\u0016|\t:ptZWd\u001b2xtqQ\u0013\u0013~(r\rک_\u0004b\u0014sDYt\u0013Y\u0003Xf{%%$ݒ\u000fyJ|c8k--\u0018\b\u0014u\u001f\u0010b0tF\u0013p\u0018>zu\u0006<c\\y\u0011P}6AͯWc\u0015=J$\u001b\u0006\tלp\u0010 P\u0012L\u0015CLQf\u0007UfX9.&f5/=tdgR\u0013\u001e\u000bLWmF\fM\u000e\u0018nE;\u0010{^}l\u001cJ\u0005\u000bx\u0012:\u000f\n=\u0007\u0012JJPZe\u007f!04\f^6װ?b\u000bZ!FB:T\u0010\u001bEdiL\u001a\u0011~t^/\u001d8߿\u0002E~\u000e\u0003\u0004\u0005\\X\u0007pE'+X\u0006E\u0014K8\u0007CI\u000f}Jd1y1/^3\bIiw~\u0015([HbE3(\u0007\u000e#ukba\u0012F\u000eW1}o\u007f\u000eN\u0017+(p\u001718\u007f\"\bv^a;_r^||\"hbNP6-\f-\u0012J''\u000bGg9ŷܗ1l"}, d2 = {"<n2<`7BZ\u0019}h^9\u0001\u00056i\u0015(\t", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "4na\u0010_(La", "", ";nSB_,", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "9B[.f:", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "/qV X9BO \u0003\u0010^9\u000b", "", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Oy\rL}%C#k Dq\u00125QX;xB\u0006\u001fgq@\u00079\u0013T\u00016NPWuiRsD\u0014\u0010iW4\t\u0014\u0001gOyd+=)\u00173M\u000bN2\u000f\f#\u00121qtWR\u001fK\u0004\u001e?'\u0017hS][\u0001KVEo\u007f(re'kA>-';'\u001buT*\u0011\u007fh\r\u0002V\u0004p1-\u0007zE(:t_[E|+", "Ada6T3Bh\u0019\f", "\"", "", "Bx_2", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@V", "Ada6T3Bh\u0019\fdk\u0015\r\u00106", "0tX9g0G>\u0015\fvf,\f\u00163z\u007f'i@\u000e\u001b\u0013Ns#<\u0004", "Bx_249@c!~\u0004m:", "", "Ada6T3Bh\u0019\f\t", "0tX9g0G>\u0015\fvf,\f\u00163z\u007f'i@\u000e\u001b\u0013Ns#<\u0004c#Y\u000b$3t\u001aCMPIQC\u0018\u000fVaF\u000b_3R\f'TZ4;", "1n\\=\\3>R\u0004z\bZ4|\u0018<i\u0015(z.\u0001$\u001bCv\u0012Qv2", "1n\\=\\3>R\u0004z\bZ4|\u0018<i\u0015(z.\u0001$\u001bCv\u0012Qv2sG}-;i\u001d2bCHy\u001a-\u000fbO9\u0014g(Uz<GY\\\u0012k", "<t[9T)ES", "Ag^B_+\u001bS\u0002\u000f\u0002e(y\u0010/", "", "<t[9T)ESWlzk0x\u00103z\u007f5\n&\u0010\u0011\u00115o\u001b@r,9n}-ES%", ">`a.`,M`\u001d\u0014z]\u001a|\u00163a\u0007,\u0011@\u000e\u0001$0\u007f\u0015C", "Bx_2f", "Ada6T3Bh\u0019\fWr\u0012k\u001d:ec0\u0007G", "4`X9B5&W'\r~g.k\u001d:e[5}.\u0001$\u001bCv\u0012Qv2", "Ada6T3Bh\u0019\fWr\u0012k\u001d:ec0\u0007G?\u0005\u0017Ts\nCz:5f\f\u0006Fg\u0010\u001cMP?g;\"*hnGlr", "Ada6T3Bh\u0019\f\t?6\ns+r{0{O\u0001$%", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 5, mv = {1, 8, 0}, pn = "", xi = 48, xs = ">AE<8<Ez>/;1(2.>$6*/-l\u0010!-#\u001a$ 0\u001a&&|%")
final /* synthetic */ class SerializersKt__SerializersKt {
    private static final KSerializer<? extends Object> builtinParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> kClass, List<? extends KType> list, List<? extends KSerializer<Object>> list2) {
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            return new ArrayListSerializer(list2.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new HashSetSerializer(list2.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new LinkedHashSetSerializer(list2.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new HashMapSerializer(list2.get(0), list2.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new LinkedHashMapSerializer(list2.get(0), list2.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            return BuiltinSerializersKt.MapEntrySerializer(list2.get(0), list2.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
            return BuiltinSerializersKt.PairSerializer(list2.get(0), list2.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
            return BuiltinSerializersKt.TripleSerializer(list2.get(0), list2.get(1), list2.get(2));
        }
        if (!PlatformKt.isReferenceArray(kClass)) {
            return null;
        }
        KClassifier classifier = list.get(0).getClassifier();
        Intrinsics.checkNotNull(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return BuiltinSerializersKt.ArraySerializer((KClass) classifier, list2.get(0));
    }

    private static final KSerializer<? extends Object> compiledParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> kClass, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return PlatformKt.constructSerializerForGivenTypeArgs(kClass, (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final KSerializer<?> noCompiledSerializer(String forClass) {
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(forClass));
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        KSerializer<?> contextual$default = SerializersModule.getContextual$default(module, kClass, null, 2, null);
        if (contextual$default != null) {
            return contextual$default;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> kClass, KSerializer<?>[] argSerializers) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        KSerializer<?> contextual = module.getContextual(kClass, ArraysKt.asList(argSerializers));
        if (contextual != null) {
            return contextual;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    private static final <T> KSerializer<T> nullable$SerializersKt__SerializersKt(KSerializer<T> kSerializer, boolean z2) {
        if (z2) {
            return BuiltinSerializersKt.getNullable(kSerializer);
        }
        Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }

    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(KClass<Object> kClass, List<? extends KType> types, List<? extends KSerializer<Object>> serializers) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        KSerializer<? extends Object> kSerializerBuiltinParametrizedSerializer$SerializersKt__SerializersKt = builtinParametrizedSerializer$SerializersKt__SerializersKt(kClass, types, serializers);
        return kSerializerBuiltinParametrizedSerializer$SerializersKt__SerializersKt == null ? compiledParametrizedSerializer$SerializersKt__SerializersKt(kClass, serializers) : kSerializerBuiltinParametrizedSerializer$SerializersKt__SerializersKt;
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        KSerializer kSerializerSerializer = SerializersKt.serializer((KType) null);
        Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return kSerializerSerializer;
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializer(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KSerializer<T> kSerializerSerializerOrNull = SerializersKt.serializerOrNull(kClass);
        if (kSerializerSerializerOrNull != null) {
            return kSerializerSerializerOrNull;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    public static final KSerializer<Object> serializer(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule serializersModule) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        KSerializer kSerializerSerializer = SerializersKt.serializer(serializersModule, (KType) null);
        Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return kSerializerSerializer;
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, KType type) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer<Object> kSerializerSerializerByKTypeImpl$SerializersKt__SerializersKt = serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, type, true);
        if (kSerializerSerializerByKTypeImpl$SerializersKt__SerializersKt != null) {
            return kSerializerSerializerByKTypeImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type));
        throw new KotlinNothingValueException();
    }

    private static final KSerializer<Object> serializerByKTypeImpl$SerializersKt__SerializersKt(SerializersModule serializersModule, KType kType, boolean z2) {
        KSerializer<Object> kSerializerFindCachedSerializer;
        KSerializer<? extends Object> kSerializerParametrizedSerializerOrNull;
        KClass<Object> kclass = Platform_commonKt.kclass(kType);
        boolean zIsMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            KType type = ((KTypeProjection) it.next()).getType();
            if (type == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kType).toString());
            }
            arrayList.add(type);
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            kSerializerFindCachedSerializer = SerializersCacheKt.findCachedSerializer(kclass, zIsMarkedNullable);
        } else {
            Object objFindParametrizedCachedSerializer = SerializersCacheKt.findParametrizedCachedSerializer(kclass, arrayList2, zIsMarkedNullable);
            if (z2) {
                if (Result.m8986isFailureimpl(objFindParametrizedCachedSerializer)) {
                    objFindParametrizedCachedSerializer = null;
                }
                kSerializerFindCachedSerializer = (KSerializer) objFindParametrizedCachedSerializer;
            } else {
                if (Result.m8983exceptionOrNullimpl(objFindParametrizedCachedSerializer) != null) {
                    return null;
                }
                kSerializerFindCachedSerializer = (KSerializer) objFindParametrizedCachedSerializer;
            }
        }
        if (kSerializerFindCachedSerializer != null) {
            return kSerializerFindCachedSerializer;
        }
        if (arrayList2.isEmpty()) {
            kSerializerParametrizedSerializerOrNull = SerializersModule.getContextual$default(serializersModule, kclass, null, 2, null);
        } else {
            List<KSerializer<Object>> listSerializersForParameters = SerializersKt.serializersForParameters(serializersModule, arrayList2, z2);
            if (listSerializersForParameters == null) {
                return null;
            }
            kSerializerParametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(kclass, arrayList2, listSerializersForParameters);
            if (kSerializerParametrizedSerializerOrNull == null) {
                kSerializerParametrizedSerializerOrNull = serializersModule.getContextual(kclass, listSerializersForParameters);
            }
        }
        if (kSerializerParametrizedSerializerOrNull != null) {
            return nullable$SerializersKt__SerializersKt(kSerializerParametrizedSerializerOrNull, zIsMarkedNullable);
        }
        return null;
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializerOrNull(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KSerializer<T> kSerializerCompiledSerializerImpl = PlatformKt.compiledSerializerImpl(kClass);
        return kSerializerCompiledSerializerImpl == null ? PrimitivesKt.builtinSerializerOrNull(kClass) : kSerializerCompiledSerializerImpl;
    }

    public static final KSerializer<Object> serializerOrNull(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, KType type) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, type, false);
    }

    public static final List<KSerializer<Object>> serializersForParameters(SerializersModule serializersModule, List<? extends KType> typeArguments, boolean z2) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z2) {
            List<? extends KType> list = typeArguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SerializersKt.serializer(serializersModule, (KType) it.next()));
            }
            return arrayList;
        }
        List<? extends KType> list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            KSerializer<Object> kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, (KType) it2.next());
            if (kSerializerSerializerOrNull == null) {
                return null;
            }
            arrayList2.add(kSerializerSerializerOrNull);
        }
        return arrayList2;
    }
}
