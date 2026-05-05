package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.Typography;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
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
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&˛\bDRш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jAӄLeV=Zݷ2\u000f\u0002{<řc$\u007f\\CU ~*\t]logtKb\u000bQ1\u000eǝ\u0001jBI]xc\u0016\u00172XoG\u074cUoS9hҚ>\u000562*\u0600\u0002\u0005\u0017\u001a2H\u0016w\u0001HaÈ:6F\u0081HQ5M3\u001aB\fN\"\u0011\u001e#f|7\tBcI?'\u0011kZNUb@\u0007[\u0011^Z7\u000f\u0007aTѨn<E'3Y\u001b\u0015beO\u000bOuC\u0004x']Ǣwx\u0006=h\u0012\"\u001dC]\u001dg\u0003.l\tW_\u001c'aՒ\u0012T~\u00158\u0002\t\u0006%B\u0014\u0010\u0016'v9[!Ǵ\f\u000eA\u00013\u0019PT\u0010`Z\u007f)dF!3\u0004K1I\u001dvQ\u0018ݢGSG\u000e\u0013\u001361\u0011x1cd\u0012f\u0014+T.\u0383_VnDX`\u0018aU{\u0014zr\n:\b6F\u0010/2߾\\ S>٦=#/xJhR\u0003\u000f\rpjci\t̲V!\u001d2g.\u0017)rD\u0013#\u001cVbwD\u0013c\u001b\u0003\nD\u001c[Cj\u0013T)5\u0012^O\u001fȉ\u0001L\f*U3tXqn\u001a0\b=lVMQ\u001a߄(fλ\u0018?J\u0007UjtPk\u0012j^8\"`S\u0019\u001fNӾP«\u0010\u0013:ŭB4B0I\u001fl\u0017X\u0003TՓo\u0002_ݷ\\ӳ\u0014\u0005\\՜<\u0005o4\u0003\u001aQxj\u0003\b\u0004\tS<\u0005p&3@a5Oğ\u0004'x>\r+\u0017\u0003y~Wg\u0003܁zuD\t,ݫ\"ک\u001e9Yǽ\u000e,\u001d\u0013A20B{!IϣʽMɟ+\u0005\u0005{\u0015SvG\u007f\np\u0007:w;j]n/6\u0007`\u0003#6g\u0010\u0004qN\u000bKiS\u001b[tδ!\f\bO%˾~ġ#\u001e-˚Ȥ&\""}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005Gk\u0015<u\u0003<U\f.%m#2IJ?\u00014+j", "\"", "", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#Y\u001dE|#*KR&u;2\u001drnD\ng*<v4KHU0qR\u007f\u0013", "Ada6T3'O!~", "", "0`b263:a'", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "AtQ0_(La\u0019\r", "", "AtQ0_(La\u0007~\bb(\u0004\rDe\r6", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "1kP@f\bG\\#\u000evm0\u0007\u0012=", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWIv&<Y{/\u0001Ss5IQIA*\u0005\u001brp@\u000blu[v(NLL;&8PD\u0010 hcD\u0012\u0013\u000fhH(wW\u0001-\b9M}Bl\u0016\b%\u0012?s:(D\u0010T}\u0011|E>hS/U`L=V^sk\bh\u001f&6C-\u001e\u0001\u0015*lZ7SW\\\u001a|auvkQ\"P{\u0015", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWIv&<Y{/\u0001Ss5IQIA*\u0005\u001brp@\u000blu[v(NLL;&8PD\u0010 hcD\u0012\u0013\u000fhH(wW\u0001-\b9M}Bl\u0016\b%\u0012?s:(D\u0010T}\u0011|E>hS/#j", "-`];b;:b\u001d\t\u0004l", "", "5dc\u000fT:>1 z\tl", "u(;8b;EW\"H\b^-\u0004\t-tI\u000eYG|%%\u001d", "1kP@fx,S&\u0003ve0\u0012\t<", "", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "5dc\u0011X:<`\u001d\n\nh9", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011n\u000eJt29d\r*D{_\u001cMP?g;|\u0015v_F\u000bn;X\u0004|", "2db0e0Ib#\f9],\u0004\t1a\u000f(", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "Ada6T3'O!~GL,\n\r+l\u0004={M", "4h]1C6Eg!\t\bi/\u0001\u0007\u001de\r,wG\u0005,\u0017TY\u001b%\u0007,<", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", "2dR<W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;J4\u001c\u001fgaF\\", "9kP@f\u0015:[\u0019", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "3mR<W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#])5w\u0015.Z\u0019", "D`[BX", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G\u007f@k -MP\u0011R9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016YC\u001e!a\u0012W>V\u0013YN(jK;4\u0004;M\fD2n\f#\u00121qtWR\u001fK\u0004\u001ecP6dUYa\u000e\u001d", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@InternalSerializationApi
public final class SealedClassSerializer<T> extends AbstractPolymorphicSerializer<T> {
    private List<? extends Annotation> _annotations;
    private final KClass<T> baseClass;
    private final Map<KClass<? extends T>, KSerializer<? extends T>> class2Serializer;
    private final Lazy descriptor$delegate;
    private final Map<String, KSerializer<? extends T>> serialName2Serializer;

    public SealedClassSerializer(final String serialName, KClass<T> baseClass, KClass<? extends T>[] subclasses, KSerializer<? extends T>[] subclassSerializers) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        this.baseClass = baseClass;
        this._annotations = CollectionsKt.emptyList();
        this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<SerialDescriptor>() { // from class: kotlinx.serialization.SealedClassSerializer$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final SerialDescriptor invoke() {
                final SealedClassSerializer<T> sealedClassSerializer = this;
                return SerialDescriptorsKt.buildSerialDescriptor(serialName, PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], new Function1<ClassSerialDescriptorBuilder, Unit>() { // from class: kotlinx.serialization.SealedClassSerializer$descriptor$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
                        invoke2(classSerialDescriptorBuilder);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ClassSerialDescriptorBuilder buildSerialDescriptor) {
                        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "type", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
                        final SealedClassSerializer<T> sealedClassSerializer2 = sealedClassSerializer;
                        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "value", SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Sealed<" + sealedClassSerializer.getBaseClass().getSimpleName() + Typography.greater, SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], new Function1<ClassSerialDescriptorBuilder, Unit>() { // from class: kotlinx.serialization.SealedClassSerializer$descriptor$2$1$elementDescriptor$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
                                invoke2(classSerialDescriptorBuilder);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ClassSerialDescriptorBuilder buildSerialDescriptor2) {
                                Intrinsics.checkNotNullParameter(buildSerialDescriptor2, "$this$buildSerialDescriptor");
                                for (Map.Entry entry : ((SealedClassSerializer) sealedClassSerializer2).serialName2Serializer.entrySet()) {
                                    ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor2, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor(), null, false, 12, null);
                                }
                            }
                        }), null, false, 12, null);
                        buildSerialDescriptor.setAnnotations(((SealedClassSerializer) sealedClassSerializer)._annotations);
                    }
                });
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + getBaseClass().getSimpleName() + " should be marked @Serializable");
        }
        Map<KClass<? extends T>, KSerializer<? extends T>> map = MapsKt.toMap(ArraysKt.zip(subclasses, subclassSerializers));
        this.class2Serializer = map;
        final Set<Map.Entry<KClass<? extends T>, KSerializer<? extends T>>> setEntrySet = map.entrySet();
        Grouping<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String> grouping = new Grouping<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String>() { // from class: kotlinx.serialization.SealedClassSerializer$special$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public String keyOf(Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> entry) {
                return entry.getValue().getDescriptor().getSerialName();
            }

            @Override // kotlin.collections.Grouping
            public Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> sourceIterator() {
                return setEntrySet.iterator();
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> itSourceIterator = grouping.sourceIterator();
        while (itSourceIterator.hasNext()) {
            Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> next = itSourceIterator.next();
            String strKeyOf = grouping.keyOf(next);
            Object obj = linkedHashMap.get(strKeyOf);
            if (obj == null) {
                linkedHashMap.containsKey(strKeyOf);
            }
            Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> entry = next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = strKeyOf;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + getBaseClass() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strKeyOf, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.serialName2Serializer = linkedHashMap2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer(String serialName, KClass<T> baseClass, KClass<? extends T>[] subclasses, KSerializer<? extends T>[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this._annotations = ArraysKt.asList(classAnnotations);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public DeserializationStrategy<T> findPolymorphicSerializerOrNull(CompositeDecoder decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        KSerializer<? extends T> kSerializer = this.serialName2Serializer.get(str);
        return kSerializer != null ? kSerializer : super.findPolymorphicSerializerOrNull(decoder, str);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(Encoder encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer<? extends T> kSerializer = this.class2Serializer.get(Reflection.getOrCreateKotlinClass(value.getClass()));
        KSerializer<? extends T> kSerializerFindPolymorphicSerializerOrNull = kSerializer != null ? kSerializer : super.findPolymorphicSerializerOrNull(encoder, value);
        if (kSerializerFindPolymorphicSerializerOrNull != null) {
            return kSerializerFindPolymorphicSerializerOrNull;
        }
        return null;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public KClass<T> getBaseClass() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }
}
