package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
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
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0007nʑA0RnP\u008cZS8\u0012sڔ<$i.yّCU(\u0002*\tUNog\u0005JbŏK\u000f\u0014\u001c\u0001̓4Ic}e\u0012\u00152JoM:UoC9htD\r(݅*8\b\u0011\tɝ2H\u001e͌\u0003ŏQĉ\u0012Fϋ!:\u0001\f\u000e\n \u0012ĂB \u000f\u001e%u\\;`l\f@_'\u0011pZNUgv\u0011\u0016\u001bT]?\r%gN/N>M\u0015S]I\u001b\u001biM\u000eWqk\u000b\u0019+52as\u0006B\u001f\u0014\\#9\\%]!,\r\t_g$'Y]*_\u0019$6\u0007\u0013{;B4\u0012\u00147`.[+\u0017\f\u001cE\rr\u0002S\u0017\u0016'P\u000e\u000fy6E+079@3f\u007fv\u0002-\u0017E\n\u001b%\u001eQ\u0007\u001f%i[&`C.\u001b\f\u001a?_WUH|\u0010\nA{\u000b\tb0BJD\u0010\u0006=\u0015).E+}o\u00021/\u0006\u001aHrm'\tnoki\u0001c\u000767$EF!\f\tJ\u0015\tyWlXZ.\u00140\u001d\u0015\f&+ \u000b}l%3\u0017fO\u0017\t1a.\u001c30~7\bpBޤYߍb9=ȡ{\u0012gU\u0005\u0018͜@\u0003"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001bP~\u000eI\u007f!<#f*!xu7KM:kAs", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#Y\u001dE|#*KR\u001bt2(\u0014hn\u000f", "u(E", "Ada6T3Bh\u0019\f\tF6{\u00196e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "5dc X9BO \u0003\u0010^9\u000bp9d\u0010/{", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011w\u0018;\u0007,5gG\u000e7z\u001a*TGPkA,|r`I\u000ec\u0002", "3mR<W,\u001b]#\u0006zZ5", "", "D`[BX", "", "3mR<W,\u001bg(~", "", "3mR<W,\u001cV\u0015\f", "", "3mR<W,\u001d]){\u0002^", "", "3mR<W,\u001e\\)\u0007", "3md:7,LQ&\u0003\u0006m6\n", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "7mS2k", "", "3mR<W,\u001fZ#z\n", "", "3mR<W,\"\\(", "3mR<W,%]\"\u0001", "", "3mR<W,'c \u0006", "3mR<W,,V#\f\n", "", "3mR<W,,b&\u0003\u0004`", "", "3mR<W,/O \u000fz", "", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NoOpEncoder extends AbstractEncoder {
    public static final NoOpEncoder INSTANCE = new NoOpEncoder();
    private static final SerializersModule serializersModule = SerializersModuleBuildersKt.EmptySerializersModule();

    private NoOpEncoder() {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean z2) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b2) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeChar(char c2) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double d2) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeEnum(SerialDescriptor enumDescriptor, int i2) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float f2) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeInt(int i2) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeLong(long j2) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeShort(short s2) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeValue(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public SerializersModule getSerializersModule() {
        return serializersModule;
    }
}
