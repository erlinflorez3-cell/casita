package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0006ELc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JfP.`S2şs{J$c$wCCU(\u0004*\tUQog|Sb\u000bI\u0010\u000e\u0016\u000fj4I[{e\u0012%2JoU3UoS9hҚ<46݅J:\u007fڎ\u000f\u0019RJ\u0016u\tCs\u000e\u00180Nqjd\u001dO\u0015\u001aX\u0005N\"\u0011\u001e#g^8Xl$;]%C|HP7i>\u007fe\u0013VV7\r-ѭL/Ë;5#*\u001c.\u0015\\s?1J\"A\u0013t?'YV$[Df\u0018\u0014K+\u007f\u0011k\u0002>\\3a\u0011\u00105<gcy`T*Þ~{\u001bNL9\u0014:`.[%\u0017\f\u001c?\rr\u0002M\u0001\u0006lV\u0018z\u0010FG)\u000eAC9Qf\u0002eI.f7*\u001bS0ţ\u0005n/r\u001d)n-3T&\\aUNV`N8smq\u0012\fz\u0002`\u0003v[Ĭ3{\u001fJ_DExQ#Ov*Hzg'\tn|ki\u0001Xp&|4O*?ȱ!f\u0081\tk^s)<\u001fS4T5\u0005^˝\"Ϣ{@9'\u0016V]q:|[`\"+?hGY%\u0088<[\u0010ӗ5̳Uc\u0018Рׯu\u0015_]\u0005ۜ\\\n"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#[*>t\u0016,\\GEt\u001b\"\u001bhO9\u0014g(Uz<GY$", "\u0013kT:X5M", "\u0011n[9X*MW#\b", "\u0010tX9W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#Y\u001dE|#*KR\u0019u;%\u0015fp=\u0011l\u001aN\u0004+CSRA\\_H", "3kT:X5MA\u0019\f~Z3\u0001\u001e/r", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `-]\u000eIz!<]\u0013 DCY\u001f", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "5dc\u0011X:<`\u001d\n\nh9", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011n\u000eJt29d\r*D{_\u001cMP?g;|\u0015v_F\u000bn;X\u0004|", "@dP143E", "", "2dR<W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;J4\u001c\u001fgaF\\", "0tX9W,K", "AsP?g\u0010GR\u0019\u0012", "", "Ahi2", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G}Au!8[GJk\u0013\u001e\u0013r`9\u00149\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001ph\u001d2", "@dP183>[\u0019\b\n", "7mS2k", "1gT0^\u0010GR\u0019\u0012", "", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G}Au!8[GJk\u0013\u001e\u0013r`9\u00149\u00105{#XH\u00183X[t\u0007}\u000f_\u000eL:by\u001d2", "Ada6T3Bh\u0019", "3mR<W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#])5w\u0015.Z\u0019", "D`[BX", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G\u007f@k -MP\u0011R9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016c", "7mb2e;", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00114", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#[*>t\u0016,\\GEt\"\u001e\"l]@\u000bx,[L", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#h-;u\u001a=QT;GA+\u0011|O9\u0014g(Uz<GY$", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#j 8m#.VA;GA+\u0011|O9\u0014g(Uz<GY$", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class CollectionLikeSerializer<Element, Collection, Builder> extends AbstractCollectionSerializer<Element, Collection, Builder> {
    private final KSerializer<Element> elementSerializer;

    private CollectionLikeSerializer(KSerializer<Element> kSerializer) {
        super(null);
        this.elementSerializer = kSerializer;
    }

    public /* synthetic */ CollectionLikeSerializer(KSerializer kSerializer, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public abstract SerialDescriptor getDescriptor();

    protected abstract void insert(Builder builder, int i2, Element element);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    protected final void readAll(CompositeDecoder decoder, Builder builder, int i2, int i3) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (i3 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i4 = 0; i4 < i3; i4++) {
            readElement(decoder, i2 + i4, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    protected void readElement(CompositeDecoder decoder, int i2, Builder builder, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        insert(builder, i2, CompositeDecoder.DefaultImpls.decodeSerializableElement$default(decoder, getDescriptor(), i2, this.elementSerializer, null, 8, null));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iCollectionSize = collectionSize(collection);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginCollection = encoder.beginCollection(descriptor, iCollectionSize);
        Iterator<Element> itCollectionIterator = collectionIterator(collection);
        for (int i2 = 0; i2 < iCollectionSize; i2++) {
            compositeEncoderBeginCollection.encodeSerializableElement(getDescriptor(), i2, this.elementSerializer, itCollectionIterator.next());
        }
        compositeEncoderBeginCollection.endStructure(descriptor);
    }
}
