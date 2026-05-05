package kotlinx.serialization.modules;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.ContextualProvider;
import kotlinx.serialization.modules.SerializersModuleCollector;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u0016DLcz\u0004I\u0006>.6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP.`_2\u000f\u0002{<$a$yCQU\"}8\tWȞog\u0005Jb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0012\u00172XoG\u074cUoK9hҚ>\u0005.݅*8\u007f\u0005\t\u001a8f\u0018v\u0001RS\f 9Hp@W#˟5\u001a@\u0005~%\u0007\u001d֔kNDH5cHB;\u0003\u0018V\u0015&(\u007f\u000bb%F\u0003=-|gӜ9W_5C=\u0004\r\u0015ksE\u0013A\u0002=K\u007fU*[v\u0002qN\u0002\u0010/%D_\u0013mv6\\\u000bR\u000f\u001dUFյgUV\u00168}\u0001\u0005\u001d>\n\u0014,CX4=\u001ev\b\u00144#\u0004\u0002F\u0017\u0016'n\u000e\u0010y6E; 91ݍ)}yai1~A\n\u001e%$3\u0003~!\"k<cE%b\u0015i7aBMH\u0015!\bN4\u00189n\u0010H\u001c0u\u0016_\u007f\u001fM/%eo\u0002g/\f\u001aHr}\u0017\u000bfåa\u000bzHn:\u000f\u001c=)\u0017.\u0003D+&\u001cZb{D\u0017]\u001ed\u0007D)A#\r\u0002JE=\u0016^Qxi1o\f\rU9t\\qt{\u0010g9%Ucb*$*\u001e\u0005:W<\u0011\u001bxlHͭ\u001a{\u0005(PJxt\u001e\u001b\u0014J^\u000e#2\u0006\u0013J7\\Z'\u0004-m\u00131RR\u0013\b\u000eaӳ\u0014\tZ;4\to-\u0005\u000b\u0007V\u0003z\u007fq\tQ<~p\"sbg4G1\u0004(/HEl\u0015'\f\u007fu}lMR˾$\u0017}{N.JC_RU\u0019\u001f\u000192HNsO#\r_v*J\u000b\u000e\n\u001e\u0002\n\u05cek\u0012px<fpS_V\u001d(\u001d\t\u0003-\u0018l\u0010{qFAhyS9ilO9\u0017\"\u0010\\c\u0015\u0005M4E\u0007uܲ\u000bVUCU5F\u0002\"R-gmk\u007f.@\u0004=)%\u000f\u0012S{;\u007fuanH:fP˕\u0003H(,|\tHQzy\u000eH/>\u001d=XItrf8\u0014,E|\u0015\u0012Z\u0013!Zif+o,at^rEQ,,^q;1SY܊{\u000fs\\9b?\u0014\u0019\u001fIt\"\u001eM \u001dx\u0011\f`-\u0002ANdKs\u0015KOEҬ0F\u000e\u0013SZo\u000f |\u0006L\u00069'<R{KX\u001eT?}lG3nsfQ.\u000f+'3L&{0M<T\u0004Gc`\u0017s#\u000fƅxp'fSCdZ?\u001a6z)\u000b\f~sS\u0010Y\u001cM9o{oRYF\u007fML&KQW!a\u00070%-\u0004g~n\u0005C~X^$9~A\u001f<M:\u0015\u0011\u0019]\u001f\bb[y\u0015v\u007fs(3/DW\u001d,\u0003i˪)D.5[Uyt\"Z\u0014]c=\u000e\bf7U\u0007%%jq&f8aK@\u001cq$\u000f\u001a\tA}f\u0003~f\u0003s\">\u0018<_\u0006C\u0002\u0019_\bn\b#P'Yp4D\"ИzƠglkߛ&R\u0011kI\u0012\nt=T-\t-N\\\u0016h\bJ<c3h\"\u0016\u0013C-̢:\u0012h1 Uiq\u0001mUa35?s:gA0X\u001f\u0014\u001e(\u000120=,%;\\N\u001dp7^C܃Yеbj0˯E@7!\u0015'Xd!\u0017DFx\u001f\u00132G3/s\u001dGf\b\u0014MY,11X@16`\u0019\u001e._\u0015\u0013:hu^9p\u000bIψiǋ1F\\شjSg4\u0006\u0005\u0013,[IHB\u000e-?\u0011!AjH0@l\u001aJBa9Q\u001d!\u0001\u001b94\u00015\u001bcl(Ɲ'ݜ\u0005|\t\u008d\u0010*?}R\u0018Gx33\u001fo!X\u0015>5Ku`7\u0012\u0012iZ~Sd\u0005\u0012q2Y9U\u001e\u007fVn\u00118!R&\\±%ǪI1Pٌ߫`t"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9cs0Uu'T\"", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9dm3Uv%VV[\u0002", "u(E", "1kP@fx\u001c]\"\u000ezq;\r\u00056P\r2\rD\u007f\u0017$", "", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~7\b)Fm)=]?BVA(&l`9\u00149", ">n[F5(LSe]z_(\r\u0010>D\u007f6{M\u0005\u0013\u001eK\u0005\u000eIa2?j\u0002\u001f7z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1kP@f\u0015:[\u0019", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~D\b'Ku ;XF?i\u0013\u001e#hn=\u0003j0cv42YX=`QrJi", ">n[F5(LSe]z_(\r\u0010>S\u007f5\u007f<\b\u001b,G|xI\u000169X}-", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~D\b'Ku ;XF?i\"\u001e\"l]@\u000bx,[a4Q]R+\\_H", ">n[F5(LSegvf,{v/r\u0004$\u0003D\u0016\u0017$U", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", ">n[F5(LSelzk0x\u00103z\u007f5\n", "0tX9W", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "1n]AX?Mc\u0015\u0006", "", "\"", "", "9B[.f:", ">q^C\\+>`", "", "Bx_249@c!~\u0004m:j\t<i{/\u007fU\u0001$%", "Ada6T3Bh\u0019\f", "7mR9h+>", ";nSB_,", ">n[F`6K^\u001c\u0003x", "\u0010`b2", "!tQ", "0`b263:a'", "/bcBT3\u001cZ\u0015\r\t", "/bcBT3,S&\u0003ve0\u0012\t<", ">n[F`6K^\u001c\u0003x=,}\u0005?l\u000f\u0007{N\u0001$\u001bCv\u0012Qv2", "2dU.h3M2\u0019\rzk0x\u00103z\u007f5fM\u000b(\u001bFo\u001b", ">n[F`6K^\u001c\u0003x=,}\u0005?l\u000f\u0016{M\u0005\u0013\u001eK\u0005\u000eI", "2dU.h3MA\u0019\f~Z3\u0001\u001e/rj5\u0006Q\u0005\u0016\u0017T", "D`[BX", "@dV6f;>`w~{Z<\u0004\u0018\u001ao\u0007<\u0004J\u000e\"\u001aKml<\u0005%B]y';\u0003\u0016;", "/k[<j\u0016OS&\u0011\bb;|", "", "@dV6f;>`w~{Z<\u0004\u0018\u001ao\u0007<\u0004J\u000e\"\u001aKm{<\u0004)1`\u000257z", "@dV6f;>`\u0004\t\u0002r4\u0007\u0016:h\u0004&i@\u000e\u001b\u0013Ns#<\u0004", "1n]0e,MSv\u0006vl:", "1n]0e,MS\u0007~\bb(\u0004\rDe\r", "@dV6f;>`\u0007~\bb(\u0004\rDe\r", "4na\u0010_(La", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SerializersModuleBuilder implements SerializersModuleCollector {
    private final Map<KClass<?>, ContextualProvider> class2ContextualProvider = new HashMap();
    private final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> polyBase2Serializers = new HashMap();
    private final Map<KClass<?>, Function1<?, SerializationStrategy<?>>> polyBase2DefaultSerializerProvider = new HashMap();
    private final Map<KClass<?>, Map<String, KSerializer<?>>> polyBase2NamedSerializers = new HashMap();
    private final Map<KClass<?>, Function1<String, DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider = new HashMap();

    public static /* synthetic */ void registerPolymorphicSerializer$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, KClass kClass2, KSerializer kSerializer, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        serializersModuleBuilder.registerPolymorphicSerializer(kClass, kClass2, kSerializer, z2);
    }

    public static /* synthetic */ void registerSerializer$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, ContextualProvider contextualProvider, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        serializersModuleBuilder.registerSerializer(kClass, contextualProvider, z2);
    }

    public final SerializersModule build() {
        return new SerialModuleImpl(this.class2ContextualProvider, this.polyBase2Serializers, this.polyBase2DefaultSerializerProvider, this.polyBase2NamedSerializers, this.polyBase2DefaultDeserializerProvider);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(KClass<T> kClass, Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        registerSerializer$default(this, kClass, new ContextualProvider.WithTypeArguments(provider), false, 4, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(KClass<T> kClass, KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        registerSerializer$default(this, kClass, new ContextualProvider.Argless(serializer), false, 4, null);
    }

    public final void include(SerializersModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        module.dumpTo(this);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void polymorphic(KClass<Base> baseClass, KClass<Sub> actualClass, KSerializer<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        registerPolymorphicSerializer$default(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nKX\fTq~W\u00042&\u007fUxJ\riwKK]CL\u0017YU\r'\u0018V<rC\u000eQ\u001cV ](\u0006F\u0012z\u0015r\u001b!Q~\u0011i6k\u0001[\u0015Q\u0004B:1KX\u0002", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    @InterfaceC1492Gx
    public <Base> void polymorphicDefault(KClass<Base> kClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> function1) {
        SerializersModuleCollector.DefaultImpls.polymorphicDefault(this, kClass, function1);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultDeserializer(KClass<Base> baseClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, false);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultSerializer(KClass<Base> baseClass, Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, false);
    }

    public final <Base> void registerDefaultPolymorphicDeserializer(KClass<Base> baseClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider, boolean z2) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        Function1<String, DeserializationStrategy<?>> function1 = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        if (function1 != null && !Intrinsics.areEqual(function1, defaultDeserializerProvider) && !z2) {
            throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
        }
        this.polyBase2DefaultDeserializerProvider.put(baseClass, defaultDeserializerProvider);
    }

    public final <Base> void registerDefaultPolymorphicSerializer(KClass<Base> baseClass, Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider, boolean z2) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        Function1<?, SerializationStrategy<?>> function1 = this.polyBase2DefaultSerializerProvider.get(baseClass);
        if (function1 != null && !Intrinsics.areEqual(function1, defaultSerializerProvider) && !z2) {
            throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + function1);
        }
        this.polyBase2DefaultSerializerProvider.put(baseClass, defaultSerializerProvider);
    }

    public final <Base, Sub extends Base> void registerPolymorphicSerializer(KClass<Base> baseClass, KClass<Sub> concreteClass, KSerializer<Sub> concreteSerializer, boolean z2) {
        Object next;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String serialName = concreteSerializer.getDescriptor().getSerialName();
        Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> map = this.polyBase2Serializers;
        Map<KClass<?>, KSerializer<?>> map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(baseClass, map2);
        }
        Map<KClass<?>, KSerializer<?>> map3 = map2;
        KSerializer<?> kSerializer = map3.get(concreteClass);
        Map<KClass<?>, Map<String, KSerializer<?>>> map4 = this.polyBase2NamedSerializers;
        Map<String, KSerializer<?>> map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(baseClass, map5);
        }
        Map<String, KSerializer<?>> map6 = map5;
        if (z2) {
            if (kSerializer != null) {
                map6.remove(kSerializer.getDescriptor().getSerialName());
            }
            map3.put(concreteClass, concreteSerializer);
            map6.put(serialName, concreteSerializer);
            return;
        }
        if (kSerializer != null) {
            if (!Intrinsics.areEqual(kSerializer, concreteSerializer)) {
                throw new SerializerAlreadyRegisteredException(baseClass, concreteClass);
            }
            map6.remove(kSerializer.getDescriptor().getSerialName());
        }
        KSerializer<?> kSerializer2 = map6.get(serialName);
        if (kSerializer2 == null) {
            map3.put(concreteClass, concreteSerializer);
            map6.put(serialName, concreteSerializer);
            return;
        }
        Map<KClass<?>, KSerializer<?>> map7 = this.polyBase2Serializers.get(baseClass);
        Intrinsics.checkNotNull(map7);
        Iterator it = MapsKt.asSequence(map7).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map.Entry) next).getValue() == kSerializer2) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + serialName + "': '" + concreteClass + "' and '" + ((Map.Entry) next) + '\'');
    }

    public final <T> void registerSerializer(KClass<T> forClass, ContextualProvider provider, boolean z2) {
        ContextualProvider contextualProvider;
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (!z2 && (contextualProvider = this.class2ContextualProvider.get(forClass)) != null && !Intrinsics.areEqual(contextualProvider, provider)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
        }
        this.class2ContextualProvider.put(forClass, provider);
    }
}
