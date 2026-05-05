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
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007fјnjO0L͜P.`Y2\u000fq{<$i$yّCU(\u0007*ޛWNujvϺb\u000bQ\u0019\u000eǝ\u0001j:M]xc\u0014\u00172PtG3SpE9n{>\u0005&5*8\u0010\u0005\t\u001a0I\u0018v\tKSÈ\u001a0N|Bĥ\u00132\u001b܅B\u0006l\u001fI4jkf6vq\u000e>=)\u001bipUWc>\u0005e\rt]m!?o,5X7c\u001aUW\u0011\rj[m\n\u0006\u0016\u0006\u0013v2?+w\u007f\b:f\r,\u0015Y]S\u0002;4j\u0014i`:3[SqXh\u000eV\bA UJ\u0012\u001f\u001e'v:]\u001et\u0015&3#\u0005\u001ad\u0019\u0010lU\u0018z\u0010BG)\u000e@C9Iz\u0018\u0006\u0004/\\L\u0014\u0005;*S\u0005|7sT<gE\u001fb\u000fi1\u007fI\u0004l\u0017\u0018gU\u0006\u0004\u001fn2.\u0012=_\u007f]\u0015WR_3EuQ#Oǽ2LRm\u000f\u0005\u000fo\u001a\u000e\u001bVN=\u0007\u0016e69\u0010hQ|\u0005\u001aY\u001b|t\u001f[8l\u0007,\u0014C$j\u0005T!S-\u0015s1oxku\nS;-L\"ty-o9\r?{v,=or\u000f\u0014mH\u0003\u000b^٨Pt4Z\u000b'R<V\r(}\fF^\fYSm\u0015L::>1^+GI?\tVҴ\r_h\rX&bX<\u0003\u00180\u0015\u000b\u0007ˆj\u0012 q\u0007kD\u0003p$=A\u0018VGI\u0006&vA\u0015#M :\u0014ěkLUp5$\u0004{\u0014 D&iU=J+\u000f-Px&uSZ\u001b}Q{\u001eW~\u000b\u0007';\u0017W.,;\u0001:`\u0003J}UmȘx݈v' f\u0006{oIےK\u000e"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#])5w\u0015.Z\u0019", "", "Ada6T3Bh\u0019\f\tF6{\u00196e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "5dc X9BO \u0003\u0010^9\u000bp9d\u0010/{", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011w\u0018;\u0007,5gG\u000e7z\u001a*TGPkA,|r`I\u000ec\u0002", "0dV6a\nHZ ~xm0\u0007\u0012", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;K=\u001c\u001fgaF\\", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "1n[9X*MW#\bhbA|", "", "0dV6a\u001aM`)|\nn9|", "3mR<W,\u001b]#\u0006zZ5", "", "D`[BX", "", "3mR<W,\u001bg(~", "", "3mR<W,\u001cV\u0015\f", "", "3mR<W,\u001d]){\u0002^", "", "3mR<W,\u001e\\)\u0007", "3md:7,LQ&\u0003\u0006m6\n", "7mS2k", "3mR<W,\u001fZ#z\n", "", "3mR<W,\"\\ \u0003\u0004^", "3mR<W,\"\\(", "3mR<W,%]\"\u0001", "", "3mR<W,'](g\u000be3d\u0005<k", "3mR<W,'c \u0006", "3mR<W,'c \u0006v[3|v/r\u0004$\u0003D\u0016\u0013\u0014No~8}55", "\"", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `5o\u001b@r,9ny/;w\u001f\u001c\\P7z4 )>H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g\u001e~", "3mR<W,,S&\u0003ve0\u0012\u0005,l\u007f\u0019wG\u0011\u0017", "3mR<W,,V#\f\n", "", "3mR<W,,b&\u0003\u0004`", "", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Encoder {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static CompositeEncoder beginCollection(Encoder encoder, SerialDescriptor descriptor, int i2) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return encoder.beginStructure(descriptor);
        }

        @ExperimentalSerializationApi
        public static void encodeNotNullMark(Encoder encoder) {
        }

        @ExperimentalSerializationApi
        public static <T> void encodeNullableSerializableValue(Encoder encoder, SerializationStrategy<? super T> serializer, T t2) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            if (serializer.getDescriptor().isNullable()) {
                encoder.encodeSerializableValue(serializer, t2);
            } else if (t2 == null) {
                encoder.encodeNull();
            } else {
                encoder.encodeNotNullMark();
                encoder.encodeSerializableValue(serializer, t2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void encodeSerializableValue(Encoder encoder, SerializationStrategy<? super T> serializer, T t2) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            serializer.serialize(encoder, t2);
        }
    }

    CompositeEncoder beginCollection(SerialDescriptor serialDescriptor, int i2);

    CompositeEncoder beginStructure(SerialDescriptor serialDescriptor);

    void encodeBoolean(boolean z2);

    void encodeByte(byte b2);

    void encodeChar(char c2);

    void encodeDouble(double d2);

    void encodeEnum(SerialDescriptor serialDescriptor, int i2);

    void encodeFloat(float f2);

    Encoder encodeInline(SerialDescriptor serialDescriptor);

    void encodeInt(int i2);

    void encodeLong(long j2);

    @ExperimentalSerializationApi
    void encodeNotNullMark();

    @ExperimentalSerializationApi
    void encodeNull();

    @ExperimentalSerializationApi
    <T> void encodeNullableSerializableValue(SerializationStrategy<? super T> serializationStrategy, T t2);

    <T> void encodeSerializableValue(SerializationStrategy<? super T> serializationStrategy, T t2);

    void encodeShort(short s2);

    void encodeString(String str);

    SerializersModule getSerializersModule();
}
