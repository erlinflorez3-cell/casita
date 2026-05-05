package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
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
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u0012\u007fјnjO0L͜P.`Y2şs{B-cҕyCIX\"Ԃ*\t]Xo˧vJh\u000fKƤ\u000e\u0016\u0007o4կ]xs\u0012\u00172HoG3[vE9fu>\u000562*8\u007f\u0006\t\u001a8P\u0018͌\u0003CY\u0018\u001a0Fq@7#˟5\u001a@\u0005\u0007>\u000f\"tg|;xpk@G#1prR5gH|{\u0016vX5\u0017\u000faL6\u0007[}33_\u001b\u0007\u0001`o\u0007MwU\u0005\u0017.W/W{o6\u0007\tD\u00199Y%]!3#)\u001a~\u001a5CO\u0012P\u0001\u00126}\u0013{;C4\u0012\u0014/`.[#\u0017\f\u001c=\rr\u0002O\u0017&'`\u000e\u000by6E*079?3f\u007fhk\u001d\\?\u0014\u0005;'S\u0005|+sT<q[?\u001d\u0016_Ci@kM~\u000egC\u0006\u0004\u001fi2.\u00128_\u007f]\u0005A2%/O[g6g\u0010J^R{\u000f\u0005\u000f}\u0004m`NX\"\u001d\u001dg.\u0017\u0014rD\u0013\u000e2t\u001dv:'e\u001c\u0003\f.\f!&twj(U\u0014\\W\u0001i\u0019V\u000e\u000e39~7\bw22 WlJMQ\u0012\u0015\u0012V\u0005\u001aW<\u0011\f\tjP[$Z\u000b1R6Vt(w*\\\u00150[oM\u000b44Z69b\u001bǽ\u00118jA+\b\u0010^v\u0016\u0017Ta+3m2|!\u0001~e!yu\u0014a2\rb2-\bkc5V[0rL~9\u0006E\u000eFlѨPGZ\n^-c\u001a8\u0016H>q1CП\u001d\u0019Y6\u00103]L!l\u0002Q /\u0013|(\u0018kr<\u0003 p\u0001.pj\u0011i\u00033Rzl|;\b+\u001a@\u0006â~GqqSyLh\u000b\u0003\bA~<\u000b\u000b7\u001eS\b &\u000b=ECU&F{\"9-a\f\n6RB\u0001\u001dG\re21\u0014\u001a}hi]`BhMg\u0007V\"Ru3FVt\u0010\bp+z1{VO\b\tVfR;3\fl\u001f,;w\u001d\u007f\u0003)}\"L.\u000e5$G\f\u001avCS\u0018}Wuu\u0006K\u000b\u0014\u0011$Z\u001b\n1\u0007\u0012J>vݯYť\r4\u001eu\u001e8O>ى\ta"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;K=\u001c\u001fgaF\\", "", "Ada6T3Bh\u0019\f\tF6{\u00196e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "5dc X9BO \u0003\u0010^9\u000bp9d\u0010/{", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011w\u0018;\u0007,5gG\u000e7z\u001a*TGPkA,|r`I\u000ec\u0002", "3mR<W,\u001b]#\u0006zZ5\\\u0010/m\u007f1\u000b", "", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "7mS2k", "", "D`[BX", "", "3mR<W,\u001bg(~Ze,\u0005\t8t", "", "3mR<W,\u001cV\u0015\fZe,\u0005\t8t", "", "3mR<W,\u001d]){\u0002^\f\u0004\t7e\t7", "", "3mR<W,\u001fZ#z\n>3|\u0011/n\u000f", "", "3mR<W,\"\\ \u0003\u0004^\f\u0004\t7e\t7", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#])5w\u0015.Z\u0019", "3mR<W,\"\\(^\u0002^4|\u0012>", "3mR<W,%]\"\u0001Ze,\u0005\t8t", "", "3mR<W,'c \u0006v[3|v/r\u0004$\u0003D\u0016\u0013\u0014NomCv-5b\r", "\"", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000b.RX;cV{P] Z\u001bR'\u0014\tn=3rN@hu,V\u00067o\u0005!\u0012\u001d9ty0e\u001dC\t\u0015wU~OKUpu\u0011HAk,.u\\\"\\8IyWb", "3mR<W,,S&\u0003ve0\u0012\u0005,l\u007f\b\u0003@\t\u0017 V", "3mR<W,,V#\f\n>3|\u0011/n\u000f", "", "3mR<W,,b&\u0003\u0004`\f\u0004\t7e\t7", "", "3mS g9NQ(\u000f\b^", "Ag^B_+\u001e\\\u0017\ty^\f\u0004\t7e\t7Z@\u0002\u0013'N~", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface CompositeEncoder {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @ExperimentalSerializationApi
        public static boolean shouldEncodeElementDefault(CompositeEncoder compositeEncoder, SerialDescriptor descriptor, int i2) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return true;
        }
    }

    void encodeBooleanElement(SerialDescriptor serialDescriptor, int i2, boolean z2);

    void encodeByteElement(SerialDescriptor serialDescriptor, int i2, byte b2);

    void encodeCharElement(SerialDescriptor serialDescriptor, int i2, char c2);

    void encodeDoubleElement(SerialDescriptor serialDescriptor, int i2, double d2);

    void encodeFloatElement(SerialDescriptor serialDescriptor, int i2, float f2);

    Encoder encodeInlineElement(SerialDescriptor serialDescriptor, int i2);

    void encodeIntElement(SerialDescriptor serialDescriptor, int i2, int i3);

    void encodeLongElement(SerialDescriptor serialDescriptor, int i2, long j2);

    @ExperimentalSerializationApi
    <T> void encodeNullableSerializableElement(SerialDescriptor serialDescriptor, int i2, SerializationStrategy<? super T> serializationStrategy, T t2);

    <T> void encodeSerializableElement(SerialDescriptor serialDescriptor, int i2, SerializationStrategy<? super T> serializationStrategy, T t2);

    void encodeShortElement(SerialDescriptor serialDescriptor, int i2, short s2);

    void encodeStringElement(SerialDescriptor serialDescriptor, int i2, String str);

    void endStructure(SerialDescriptor serialDescriptor);

    SerializersModule getSerializersModule();

    @ExperimentalSerializationApi
    boolean shouldEncodeElementDefault(SerialDescriptor serialDescriptor, int i2);
}
