package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveArrayBuilder;
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
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0006ELc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP.XW2\u000f\u0002{<$a&yCIU\"}8\tWȞog|PbŏK\u000f\u0014\u001f\u0001j2J]xs\u0012\u00172HpG3coE9fz>\u0005.X*8\u007f\n\u00079@Ϻ8x\u0001ŏY\u000b:2FoHR5Y\u000b\u001a \u0007f&\u0011 lg\u00156vn\u000eL?%\u0013i\tM7a@|\u0014\rVV7\r=bL.\u0001J;Ֆ5]\u0011\u000bjaO\u0005Oqsݛ\u0017,ݳ/I\u0002]~c\u000e\u001f-+\u0006\r$t͉`\u0005_lT89\\{K\u0007\rX{\t\n%<2\u001dΝ+H<=bq\u0016\u001fKt)R\u0007rؿbB\u000e\r*a%8\u00183YMKj_oS\u0019|L,\t\u001b4;\u0001\u001d8\fX\u001ck-\u001b\u000bw\u00025_XUH|# _ъ\bpp\u001cr\u001d>b\u0018/*%^\u001b3Ss9Q>\u001c\u0006Vb\u007fv;_ĈWi`g\tE|6O*7 \u000bHr!\u0004P\u0003y\\\u0015[>l\u00074\u0007C$j\u001bT!S'\u0015qŹmj[\u0002R4=\fOY\u001d\u00036Wo^y7Ʉg\u0010ox?+Mcz\u0005\u0007zjSBZ\r,0U`j>\u000fBF«\u0010\u0013@g:1BUI\u001fl\u0017X\u0003TՓo'1_\u0011gV\u0001Ձ7$\u0011\u0015l\u0014\u0017-h\\\u001f\u0004\u0010x\u007f,-d0CYQc0VY0\u0016L|YȔEuõKgZu\u0015{$%m{V\u0015B9\b/\u0004\u0015ä\u0003)@2}TZy}Q{\u001aؠ~\u0003\u0002ҸSj4p\u0016tҚ0\u0012"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#h-;u\u001a=QT;GA+\u0011|O9\u0014g(Uz<GY$", "\u0013kT:X5M", "\u000fqa.l", "\u0010tX9W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#h-;u\u001a=QT;GA+\u0011|>I\u000bj+N\u0004|", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#[*>t\u0016,\\GEt\u001b\"\u001bhO9\u0014g(Uz<GY$", ">qX:\\;Bd\u0019lzk0x\u00103z\u007f5", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `-]\u000eIz!<]\u0013 DCY\u001f", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "5dc\u0011X:<`\u001d\n\nh9", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011n\u000eJt29d\r*D{_\u001cMP?g;|\u0015v_F\u000bn;X\u0004|", "0tX9W,K", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011s\u0017Kv2>U\u0005i\"z\u001a6QR?|4y\"u]Mcs0Uu'T\"", "2db2e0:Z\u001d\u0014z", "2dR<W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#\\ 5w\u0015.Z\u0019", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G~7k -MP\u0011/\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(", "3l_Al", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "@dP183>[\u0019\b\n", "", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;J4\u001c\u001fgaF\\", "7mS2k", "", "1gT0^\u0010GR\u0019\u0012", "", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G}Au!8[GJk\u0013\u001e\u0013r`9\u00149\u00105|1VSR5o\u001c\u0001=!\u0016V\u0015R@\t\u0014]K-8H@.\b9R}B2k\u0019\u001a\u00169ytSVkT\u0007\u0011\n\u001e9lMX_\u0007\u001d6\tS", "Ada6T3Bh\u0019", "3mR<W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#])5w\u0015.Z\u0019", "D`[BX", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G\u007f@k -MP\u0011R9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016c", "EqXAX\nH\\(~\u0004m", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;K=\u001c\u001fgaF\\", "1n]AX5M", "Ahi2", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G}Au!8[GJk\u0014'\u0013r`9\u00149\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001pHJ", "0tX9W,KA\u001d\u0014z", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Kx\u001d<\u0004.1`G\u000bDq\u001e2\\GLk\u0010+\"du\u0016\u0017g3Mv4\u001d\u00102", "1gT0^\n:^\u0015|~m@", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Kx\u001d<\u0004.1`G\u000bDq\u001e2\\GLk\u0010+\"du\u0016\u0017g3Mv4\u001d0\u0012\u001d", "1n[9X*MW#\b^m,\n\u0005>o\r", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u001eKz,~=\r Di%8Z\u0019", "7mb2e;", "3kT:X5M", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Kx\u001d<\u0004.1`G\u000bDq\u001e2\\GLk\u0010+\"du\u0016\u0017g3Mv4\u001d051Xcn\u0007\u001b\u000ec\u0010\u0018\u0015\n\nY?3D\b(", "BnA2f<Eb", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Kx\u001d<\u0004.1`G\u000bDq\u001e2\\GLk\u0010+\"du\u0016\u0017g3Mv4\u001d\u001051Xcn\u0007\u001b\u000ec\u0010\u0018\u0015\n\nY?3D", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class PrimitiveArraySerializer<Element, Array, Builder extends PrimitiveArrayBuilder<Array>> extends CollectionLikeSerializer<Element, Array, Builder> {
    private final SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveArraySerializer(KSerializer<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.descriptor = new PrimitiveArrayDescriptor(primitiveSerializer.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Builder builder() {
        return toBuilder(empty());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int builderSize(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return builder.getPosition$kotlinx_serialization_core();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void checkCapacity(Builder builder, int i2) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.ensureCapacity$kotlinx_serialization_core(i2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    protected final Iterator<Element> collectionIterator(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.DeserializationStrategy
    public final Array deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return merge(decoder, null);
    }

    protected abstract Array empty();

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public final void insert(Builder builder, int i2, Element element) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    protected abstract void readElement(CompositeDecoder compositeDecoder, int i2, Builder builder, boolean z2);

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Array array) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iCollectionSize = collectionSize(array);
        SerialDescriptor serialDescriptor = this.descriptor;
        CompositeEncoder compositeEncoderBeginCollection = encoder.beginCollection(serialDescriptor, iCollectionSize);
        writeContent(compositeEncoderBeginCollection, array, iCollectionSize);
        compositeEncoderBeginCollection.endStructure(serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Array toResult(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return (Array) builder.build$kotlinx_serialization_core();
    }

    protected abstract void writeContent(CompositeEncoder compositeEncoder, Array array, int i2);
}
