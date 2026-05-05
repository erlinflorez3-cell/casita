package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nj?3LeV.Zݷ2\u000f\u0002{<řc$\u007fICU }*\t]WogtJb\u000bY\u000f\u000e\u0016~s2ֱU\u000fزB\u0015BD\u007f?aM\u001e<ir\u00058\u0015 `$H{\u0015\u0001H*X\u0012\u0007zqN:\u0013pEv:ň\u0011M\u0013\u001eZ\u001cL%\u0019\u001e\u000bg\u0015H֘kҗǶ.\"ʾhBĚ+a6\u0003[\u0014\u000fz5\u0015\u000faL4p;C\u001f=S1\u0012\u0003_M\u000fWqk\u0012\u0019+59as\u00069\t\u0004\"$CO;m98%0_q$'YX\u0014O^ @w)\u000f=@\u0012\"\u001e'v.]\u001et\u001d&3#\u007f\u001aR҉\u0001]݆~zˋ:\u0019+\u0016AB\u00022tiy;G[_{3\rd5Ҡm ǵS\u000e\u05ce\u0019\u001dZ\u0011_K\u001aWKcf\n\b@\u0016\u0004\u001fbH<̯/FƂ.{ 2\u0019+SiVٳ kȸHQov\u000b\u007fpVoʏdn!v\u0016=AÇ\u0010x"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#m\u0007Av\u0018\nZP7\u007f\"\u001e\"l]@\u000bx,[L", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "\u001aj^A_0G\u001d\te\u0005g.X\u0016<a\u0014}", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#h-;u\u001a=QT;GA+\u0011|O9\u0014g(Uz<GY$", "\u001aj^A_0G\u001d\te\u0005g.R", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#m\u0007Av\u0018\nZP7\u007f\u0011.\u0019o`9\u00149", "u(E", "3l_Al", "3l_Als2 \u0006\u0004i).", "u(J\u0017", "@dP183>[\u0019\b\n", "", "2dR<W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;J4\u001c\u001fgaF\\", "7mS2k", "", "0tX9W,K", "1gT0^\u0010GR\u0019\u0012", "", "EqXAX\nH\\(~\u0004m", "3mR<W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;K=\u001c\u001fgaF\\", "1n]AX5M", "Ahi2", "EqXAX\nH\\(~\u0004msG\u0015|F\u00068\u0006", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G}Au!8[GJk\u0014'\u0013r`9\u00149\"3Zj8", "1n[9X*MW#\bhbA|", "1n[9X*MW#\bhbA|P\u001bwt\u0015\u0004\f\u0007", "uZ9u<", "Bn1B\\3=S&", "Bn1B\\3=S&Ffp!i\u0011zk", "uZ9u?2Hb \u0003\u0004qu\u000b\t<i{/\u007fU|&\u001bQxW@\u007f45f\u0007\u001c>7\u0006\u0015WL=GA+\u0011|>I\u000bj+N\u0004|", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@ExperimentalSerializationApi
public final class ULongArraySerializer extends PrimitiveArraySerializer<ULong, ULongArray, ULongArrayBuilder> implements KSerializer<ULongArray> {
    public static final ULongArraySerializer INSTANCE = new ULongArraySerializer();

    private ULongArraySerializer() {
        super(BuiltinSerializersKt.serializer(ULong.Companion));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m10602collectionSizeQwZRm1k(((ULongArray) obj).m9223unboximpl());
    }

    /* JADX INFO: renamed from: collectionSize-QwZRm1k */
    protected int m10602collectionSizeQwZRm1k(long[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return ULongArray.m9215getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ ULongArray empty() {
        return ULongArray.m9207boximpl(m10603emptyY2RjT0g());
    }

    /* JADX INFO: renamed from: empty-Y2RjT0g */
    protected long[] m10603emptyY2RjT0g() {
        return ULongArray.m9208constructorimpl(0);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int i2, ULongArrayBuilder builder, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m10600appendVKZWuLQ$kotlinx_serialization_core(ULong.m9154constructorimpl(decoder.decodeInlineElement(getDescriptor(), i2).decodeLong()));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m10604toBuilderQwZRm1k(((ULongArray) obj).m9223unboximpl());
    }

    /* JADX INFO: renamed from: toBuilder-QwZRm1k */
    protected ULongArrayBuilder m10604toBuilderQwZRm1k(long[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new ULongArrayBuilder(toBuilder, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, ULongArray uLongArray, int i2) {
        m10605writeContent0q3Fkuo(compositeEncoder, uLongArray.m9223unboximpl(), i2);
    }

    /* JADX INFO: renamed from: writeContent-0q3Fkuo */
    protected void m10605writeContent0q3Fkuo(CompositeEncoder encoder, long[] content, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.encodeInlineElement(getDescriptor(), i3).encodeLong(ULongArray.m9214getsVKNKU(content, i3));
        }
    }
}
