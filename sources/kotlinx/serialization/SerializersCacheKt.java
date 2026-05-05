package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.SerializerCache;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!4i\bDRш|\u0004G\t8\u000bDB\u0007\"2\u0014\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<řc$\bCC٥\"}0'WN}gvJ`\u000b[5\u0014 \u0011t<Mezs\u0011=2Xnm>}yKExzF\u000702P8(\u00121\u001e8V(v)R\u0012È*rN\u0001Rb\u001dY\u0015$\"\nN\"\u0017\u001d\u000bgd5vw\fK_-\u0011uZT7a@|{\rtaW\u0017\u0005s61P9E\u0015Sg1\u001a\u0003_M\u0011Wqk\u0014/ѧ߉*ɞָ[6f\u0015419˽%e\u0003*b\u0004a`:'YN\u001aK'ʯ*Þ~\u0002\u0015ɝ\u0014\u0010\f(V0M6t\u000b&;\u0005vcBf\u0001\rB.y\u00186mӟ\u0002Ĵ/?#ƘacA\u001d\\9\u001c!\u001b#;\t~%aS\u001e`C\u001b\u0003}\b1(̹?˓R\u0010aƝ}\u0006vi\u0010,$LU\bG\u0004!2''MZg#Oq8H\u001bϝxݶdn[֟bJF+|\u0018ն*\u000b\u0014ZJ{ʶof"}, d2 = {"\u001e@A\u000e@\f-@|sZ=&jh\u001cI[\u000f_5`\u0004\u0005AMi\u001aY\u0005", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#h\u001cDi\u001e.\\P?\u00014\u001d\u0003hn=\u0003j0cv4%HL/\\(", "", "5dc\u001d4\u0019\u001a;xmgB!\\g)S_\u0015_\u001cgz\f'\\{6T\u0001\u0013<]^3v\u001f8\\?Jo>'#", "u(E", "\u001e@A\u000e@\f-@|sZ=&jh\u001cI[\u000f_5`\u0004\u0005AMi\u001aY\u0005/Bm\u0007\u001eIr\u0015-", "5dc\u001d4\u0019\u001a;xmgB!\\g)S_\u0015_\u001cgz\f'\\{6T\u0001\u0013<]\u001a ]|\u0015) \"Kr\u001a\u001eqkH\u0003r0X\u007f5", "!DA\u00164\u0013\"HxkhX\nXf\u0012E", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#k Dq\u00125QX;x\u0012\u001a\u0013ka\u000f", "5dc 8\u0019\"/\u007fbo>\u0019j\u0003\rA]\u000b[~|  Q~\nKz/>g", "!DA\u00164\u0013\"HxkhX\nXf\u0012Ey\u0011k'grs.O", "5dc 8\u0019\"/\u007fbo>\u0019j\u0003\rA]\u000b[:i\u0007}.Kj#Vc1b\u0007*Fi%2WLI", "4h]16(<V\u0019}h^9\u0001\u00056i\u0015(\t", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "1kPGm", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "7r=B_3:P ~", "", "4h]1C(KO!~\nk0\u0012\t.C{&~@\u007f\u0005\u0017Ts\nCz:5f", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "Bx_2f", "", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@V", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l.t\nMrnEh\u0002'\u0001T\u001a<\\\u00190/\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SerializersCacheKt {
    private static final SerializerCache<? extends Object> SERIALIZERS_CACHE = CachingKt.createCache(new Function1<KClass<?>, KSerializer<? extends Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$SERIALIZERS_CACHE$1
        @Override // kotlin.jvm.functions.Function1
        public final KSerializer<? extends Object> invoke(KClass<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SerializersKt.serializerOrNull(it);
        }
    });
    private static final SerializerCache<Object> SERIALIZERS_CACHE_NULLABLE = CachingKt.createCache(new Function1<KClass<?>, KSerializer<Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1
        @Override // kotlin.jvm.functions.Function1
        public final KSerializer<Object> invoke(KClass<?> it) {
            KSerializer<Object> nullable;
            Intrinsics.checkNotNullParameter(it, "it");
            KSerializer kSerializerSerializerOrNull = SerializersKt.serializerOrNull(it);
            if (kSerializerSerializerOrNull == null || (nullable = BuiltinSerializersKt.getNullable(kSerializerSerializerOrNull)) == null) {
                return null;
            }
            return nullable;
        }
    });
    private static final ParametrizedSerializerCache<? extends Object> PARAMETRIZED_SERIALIZERS_CACHE = CachingKt.createParametrizedCache(new Function2<KClass<Object>, List<? extends KType>, KSerializer<? extends Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1
        @Override // kotlin.jvm.functions.Function2
        public final KSerializer<? extends Object> invoke(KClass<Object> clazz, List<? extends KType> types) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(types, "types");
            List<KSerializer<Object>> listSerializersForParameters = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
            Intrinsics.checkNotNull(listSerializersForParameters);
            return SerializersKt.parametrizedSerializerOrNull(clazz, types, listSerializersForParameters);
        }
    });
    private static final ParametrizedSerializerCache<Object> PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE = CachingKt.createParametrizedCache(new Function2<KClass<Object>, List<? extends KType>, KSerializer<Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1
        @Override // kotlin.jvm.functions.Function2
        public final KSerializer<Object> invoke(KClass<Object> clazz, List<? extends KType> types) {
            KSerializer<Object> nullable;
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(types, "types");
            List<KSerializer<Object>> listSerializersForParameters = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
            Intrinsics.checkNotNull(listSerializersForParameters);
            KSerializer<? extends Object> kSerializerParametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(clazz, types, listSerializersForParameters);
            if (kSerializerParametrizedSerializerOrNull == null || (nullable = BuiltinSerializersKt.getNullable(kSerializerParametrizedSerializerOrNull)) == null) {
                return null;
            }
            return nullable;
        }
    });

    public static final KSerializer<Object> findCachedSerializer(KClass<Object> clazz, boolean z2) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (z2) {
            return SERIALIZERS_CACHE_NULLABLE.get(clazz);
        }
        KSerializer<? extends Object> kSerializer = SERIALIZERS_CACHE.get(clazz);
        if (kSerializer != null) {
            return kSerializer;
        }
        return null;
    }

    public static final Object findParametrizedCachedSerializer(KClass<Object> clazz, List<? extends KType> types, boolean z2) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        return !z2 ? PARAMETRIZED_SERIALIZERS_CACHE.mo10579getgIAlus(clazz, types) : PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.mo10579getgIAlus(clazz, types);
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    private static /* synthetic */ void getSERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getSERIALIZERS_CACHE_NULLABLE$annotations() {
    }
}
