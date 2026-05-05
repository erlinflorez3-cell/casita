package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.UIntArray;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nj?3LeV.Zݷ2\u000f\u0002{<řc$\u007fICU }*\t]WogtJb\u000bY\u000f\u000e\u0016~s2ֱU\u000fزB\u0015BD\u007f?aM\u001e<ir\u00058\u0015 `$H{\u0015\u0001H*X\u0012\u0007zqN:\u0013pEv:ň\u0011M\u0013\u001eZ\u001cL%\u0019\u001e\u000bg\u0015H֘kҗǶ.\"ʾhBĚ+a6\u0003[\u0014\u000fz5\u0015\u000faL4p;C\u001f=S1\u0012\u0003_M\u000fWqk\u0012\u0019+59as\u00069\t\u0004\"$CO;m98%0_q$'YX\u0014O^ @w)\u000f=@\u0012\"\u001e'v.]\u001et\u001d&3#\u007f\u001aR҉\u0001]݆~zˋ:\u0019+\u0016AB\u00022tiy;G[_{3\rd5Ҡm ǵS\u000e\u05ce\u0019\u001dZ\u0011_K\u001aWKcf\n\b@\u0016\u0004\u001fbH<̯/FƂ.{ 2\u0019+SiVٳ kȸHQov\u000b\u007fpVoʏdn!v\u0016=AÇ\u0010x"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#m\u0004@|q;Z?OY4+\u0019dh=\u001cc9$", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "\u001aj^A_0G\u001d\tb\u0004m\b\n\u0016+yU", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#h-;u\u001a=QT;GA+\u0011|O9\u0014g(Uz<GY$", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#m\u0004@|q;Z?OHD\"\u001cgaF\\", "u(E", "3l_Al", "3l_Als\u0006V\u0004Pfr.", "u(J\u0016", "@dP183>[\u0019\b\n", "", "2dR<W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;J4\u001c\u001fgaF\\", "7mS2k", "", "0tX9W,K", "1gT0^\u0010GR\u0019\u0012", "", "EqXAX\nH\\(~\u0004m", "3mR<W,K", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;K=\u001c\u001fgaF\\", "1n]AX5M", "Ahi2", "EqXAX\nH\\(~\u0004msZs6HR)_", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Gx\fFu)>[G}Au!8[GJk\u0014'\u0013r`9\u00149\"2Zj8", "1n[9X*MW#\bhbA|", "1n[9X*MW#\bhbA|Pva\u0005\u001cC\u0014\\", "uZ8u<", "Bn1B\\3=S&", "Bn1B\\3=S&FBZ1pP\u0003A", "uZ8u?2Hb \u0003\u0004qu\u000b\t<i{/\u007fU|&\u001bQxW@\u007f45f\u0007\u001c>7\u0006\u0012VR\u0017xA\u001a)Eq=\u000eb,[L", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@ExperimentalSerializationApi
public final class UIntArraySerializer extends PrimitiveArraySerializer<UInt, UIntArray, UIntArrayBuilder> implements KSerializer<UIntArray> {
    public static final UIntArraySerializer INSTANCE = new UIntArraySerializer();

    private UIntArraySerializer() {
        super(BuiltinSerializersKt.serializer(UInt.Companion));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m10594collectionSizeajY9A(((UIntArray) obj).m9144unboximpl());
    }

    /* JADX INFO: renamed from: collectionSize--ajY-9A */
    protected int m10594collectionSizeajY9A(int[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UIntArray.m9136getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ UIntArray empty() {
        return UIntArray.m9128boximpl(m10595emptyhP7Qyg());
    }

    /* JADX INFO: renamed from: empty--hP7Qyg */
    protected int[] m10595emptyhP7Qyg() {
        return UIntArray.m9129constructorimpl(0);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder decoder, int i2, UIntArrayBuilder builder, boolean z2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m10592appendWZ4Q5Ns$kotlinx_serialization_core(UInt.m9075constructorimpl(decoder.decodeInlineElement(getDescriptor(), i2).decodeInt()));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m10596toBuilderajY9A(((UIntArray) obj).m9144unboximpl());
    }

    /* JADX INFO: renamed from: toBuilder--ajY-9A */
    protected UIntArrayBuilder m10596toBuilderajY9A(int[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new UIntArrayBuilder(toBuilder, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, UIntArray uIntArray, int i2) {
        m10597writeContentCPlH8fI(compositeEncoder, uIntArray.m9144unboximpl(), i2);
    }

    /* JADX INFO: renamed from: writeContent-CPlH8fI */
    protected void m10597writeContentCPlH8fI(CompositeEncoder encoder, int[] content, int i2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i3 = 0; i3 < i2; i3++) {
            encoder.encodeInlineElement(getDescriptor(), i3).encodeInt(UIntArray.m9135getpVg5ArA(content, i3));
        }
    }
}
