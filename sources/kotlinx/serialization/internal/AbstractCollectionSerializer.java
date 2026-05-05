package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0006ELc\u000b\u0004I\u00066\u000e6B\u0015\"4\u0012}\nnjG0Le^.Zݷ2\u000fy\u0002<$a'yCI^\"}(\fWN}gvJ`\u0010K\u000f\u0014<\u0001j2L]xs\u0012\u00172XoG\u074cS%Sʠ\tv<ӌ.1J:\u007f\u0004\u000f\u001aRJ\u0016v\tD{\u0012\"2Pp\u0001R;OE\u001f\u0018\b̧$\u0001,_0YDL\u0005]p/i%ݦFN5dx\u0010[\u0013^T]\f'e,2X7c\u001dkgΫ\u000bRiHK\\\u007fG\u001dh]&[M\u0002^NX.\u001cE1]\u0018ut<[;P'\u0011ˏ/OqW\u001996\u0005\u0013{;J4\u0012\u0014.`.[)\u0017\f\u001c7\rr\n@\u0001\u0006lR\u0018z\u0010GG)\u000eEC9Iw\u0018\u0004ޅ\u001dNE\u000fM:,7\u0019nOi\u0005\u0012n\u001c3T&`aUNR`N8jmq\u0012tz\u0002`\u0004`M\u0006/\n'F\u0017SN\"[؝%k\u0010`\r\u0003\u0005\u001exh\u0002z\u0003LN)\u0007\u0016e99\u0010hH|\u0005\"P\u001bX¯\u0015M*nO\u0019\u0016.8\\&JQ)\u001ejgh\u0018\b}a\u0018CGfmX5\u0010ް[9lR}`q0yR%%g<\u0019\u0005\u001f\t͞W\fh}p9@j\u0003\u0010&\nlNB\u0013bC\u007f.L,_*#7Ƞ\u0007\u001ePdE\u001em~\u0001\u0016\u000fVC$9ǭR\u001a1\u0001\u0007[7\u0012ς|I:#)1;hi5G7}\"\u001f3CEȷ\u0003s\u000eh0[Ut\u0005\u0016,U$ L\u0019\u007fsȠA\u0013\u001d(qA\u0010W]L)dyMH'A\u001fɍ\u0013;vWԙ\u0007j\u001cXߵnw"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#Y\u001dE|#*KR\u0019u;%\u0015fp=\u0011l\u001aN\u0004+CSRA\\_H", "\u0013kT:X5M", "\u0011n[9X*MW#\b", "\u0010tX9W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "u(E", "0tX9W,K", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "2db2e0:Z\u001d\u0014z", "2dR<W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#\\ 5w\u0015.Z\u0019", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G~7k -MP\u0011/\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(", ";da4X", ">qTC\\6Na", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G~7k -MP\u0011R9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016YB\u0010#VWU'\u0016\u0007#+!sD5.]", "@dP143E", "", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;J4\u001c\u001fgaF\\", "AsP?g\u0010GR\u0019\u0012", "", "Ahi2", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G}Au!8[GJk\u0013\u001e\u0013r`9\u00149\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001ph\u001d2", "@dP183>[\u0019\b\n", "7mS2k", "1gT0^\u0010GR\u0019\u0012", "", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G}Au!8[GJk\u0013\u001e\u0013r`9\u00149\u00105{#XH\u00183X[t\u0007}\u000f_\u000eL:by\u001d2", "@dP1F0SS", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G}Au!8[GJk\u0013\u001e\u0013r`9\u00149\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001Ph", "Ada6T3Bh\u0019", "3mR<W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#])5w\u0015.Z\u0019", "D`[BX", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G\u007f@k -MP\u0011R9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016c", "0tX9W,KA\u001d\u0014z", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "1gT0^\n:^\u0015|~m@", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_\u0004q", "1n[9X*MW#\b^m,\n\u0005>o\r", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u001eKz,~=\r Di%8Z\u0019", "1n[9X*MW#\bhbA|", "Bn1B\\3=S&", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "BnA2f<Eb", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#[*>t\u0016,\\GEt\u001b\"\u001bhO9\u0014g(Uz<GY$", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#e\u001cBT\u001a4M1;x8\u001a\u001clv9\u00149", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@InternalSerializationApi
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements KSerializer<Collection> {
    private AbstractCollectionSerializer() {
    }

    public /* synthetic */ AbstractCollectionSerializer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void readElement$default(AbstractCollectionSerializer abstractCollectionSerializer, CompositeDecoder compositeDecoder, int i2, Object obj, boolean z2, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            z2 = true;
        }
        abstractCollectionSerializer.readElement(compositeDecoder, i2, obj, z2);
    }

    private final int readSize(CompositeDecoder compositeDecoder, Builder builder) {
        int iDecodeCollectionSize = compositeDecoder.decodeCollectionSize(getDescriptor());
        checkCapacity(builder, iDecodeCollectionSize);
        return iDecodeCollectionSize;
    }

    protected abstract Builder builder();

    protected abstract int builderSize(Builder builder);

    protected abstract void checkCapacity(Builder builder, int i2);

    protected abstract Iterator<Element> collectionIterator(Collection collection);

    protected abstract int collectionSize(Collection collection);

    @Override // kotlinx.serialization.DeserializationStrategy
    public Collection deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return merge(decoder, null);
    }

    @InternalSerializationApi
    public final Collection merge(Decoder decoder, Collection collection) {
        Builder builder;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (collection == null || (builder = toBuilder(collection)) == null) {
            builder = builder();
        }
        int iBuilderSize = builderSize(builder);
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(getDescriptor());
        if (!compositeDecoderBeginStructure.decodeSequentially()) {
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                readElement$default(this, compositeDecoderBeginStructure, iBuilderSize + iDecodeElementIndex, builder, false, 8, null);
            }
        } else {
            readAll(compositeDecoderBeginStructure, builder, iBuilderSize, readSize(compositeDecoderBeginStructure, builder));
        }
        compositeDecoderBeginStructure.endStructure(getDescriptor());
        return toResult(builder);
    }

    protected abstract void readAll(CompositeDecoder compositeDecoder, Builder builder, int i2, int i3);

    protected abstract void readElement(CompositeDecoder compositeDecoder, int i2, Builder builder, boolean z2);

    @Override // kotlinx.serialization.SerializationStrategy
    public abstract void serialize(Encoder encoder, Collection collection);

    protected abstract Builder toBuilder(Collection collection);

    protected abstract Collection toResult(Builder builder);
}
