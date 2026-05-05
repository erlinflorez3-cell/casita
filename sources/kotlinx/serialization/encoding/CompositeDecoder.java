package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u001b\u007fјnjO0L͜P.`Y2şs{B'cҕyCI_\"}(\tWNukvJ`\u000bK\u000f\u0014\u001b\u0001̓4Ikxe\u0012\u00152JoM:UoC:htL\u0005(2(;\u0002\u0005\u000f\"2Ϻ\u0018v\tOSÈ\u001a0NpBR\u0013M\u000b~(ß\\G1\u001e\u000bf\u00075o5sH3;\u0003\u0018G~+m6\u0015M;M\u0005+\u001b~y\u001eYI}Y];a\r\u001fR\nJ3C\u007fC\u001dhU.[M\u0002_NX.\u001d[O\u0018#k~>\\3^\u0011\u001051gcyW>,\u0006\u0003\u0014\rj\rT*oV<;2f6\u0017cx\u0001YXP0e\t\u0014CwD&=\u007fa;i\u001ftWy;GUg\u007f\u0013\u00156#/wg\u007f\u001d\u001cn&3T&ZaUNC`N8`\u0004\u0012L\u0007p\u0014B\u0004^Z03\n\u0017F\u0017S>\f=1)\u0004\u0002vM.\u001bMvvg\u0002RvURr$=B\t:ath\u0013shT\u00075Wqdj\u0015\u0014 \u0013Ne(@/+(N}o\u001an[e\"%]o}}7\u0002\u001cnQ^aM\u0002g\u001egjvBFlf\u0013`~B\u0002\u0015!\u0001pe@a\u0003\u0012\u000ez\u000bh,\u00198ŭ\u007f6\\,_\u0018\r\u0019V\t6Bo\u00049chp(~\u0003<T\u000fw?\r\u0011\u0011Tlr\u0006f?cZ\u0019\u0011*3A_R1(k!/NCHȷ\u0003s\u000ee0RUk\u0005\u0016$ZB5^UGqG=Y)\u001f+8Ĉ;_|vsWe\u0012U\u0002-}\u001dC\u0001.\u0016\u0011\u001bz:{\u0003P_V'\"=x!?8l\u0006yoc\u0013IySQu\u0005m\u03a2\u0007YJl\u0001\u0013\u0013@6%/\u0012R\u0001C3['K\u001d(\u0018=\u001dy]\u0018xt\u001e+%4\u0018}\u0004Z\bFspWu2i?y]\rF:$\u001b\f\tl3\u0006\u0016g!4;YxErvn8{\u0012u\"7\u0017:\r\tV\n;i̱\u007fӑ2cBuI\u007f\"aǢ)9"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;J4\u001c\u001fgaF\\", "", "Ada6T3Bh\u0019\f\tF6{\u00196e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001fQn\u001eCv3~G}-;i\u001d2bCHy\u001c(\u0014xh9\\", "5dc X9BO \u0003\u0010^9\u000bp9d\u0010/{", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011w\u0018;\u0007,5gG\u000e7z\u001a*TGPkA,|r`I\u000ec\u0002", "2dR<W,\u001b]#\u0006zZ5\\\u0010/m\u007f1\u000b", "", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "7mS2k", "", "2dR<W,\u001bg(~Ze,\u0005\t8t", "", "2dR<W,\u001cV\u0015\fZe,\u0005\t8t", "", "2dR<W,\u001c] \u0006z\\;\u0001\u00138S\u0004={", "2dR<W,\u001d]){\u0002^\f\u0004\t7e\t7", "", "2dR<W,\u001eZ\u0019\u0007zg;`\u0012.e\u0013", "2dR<W,\u001fZ#z\n>3|\u0011/n\u000f", "", "2dR<W,\"\\ \u0003\u0004^\f\u0004\t7e\t7", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#\\ 5w\u0015.Z\u0019", "2dR<W,\"\\(^\u0002^4|\u0012>", "2dR<W,%]\"\u0001Ze,\u0005\t8t", "", "2dR<W,'c \u0006v[3|v/r\u0004$\u0003D\u0016\u0013\u0014NomCv-5b\r", "\"", "2db2e0:Z\u001d\u0014zk", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", ">qTC\\6Na\nz\u0002n,", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000b.RX;cV{P] Z\u001bR'\u0014\tn=3rN@hf,W\u0002Hl|\u0013\u001a#1ytL_}V\u0007\u0011\u0005A+|\u001c@duX=\u000fi&m\u000e)\u0007Y?:\"#G\\\u0002mL?\u0006EZ\r{TCQdL\u0019xGy", "2dR<W,,S%\u000fzg;\u0001\u00056l\u0014", "2dR<W,,S&\u0003ve0\u0012\u0005,l\u007f\b\u0003@\t\u0017 V", "2dR<W,,V#\f\n>3|\u0011/n\u000f", "", "2dR<W,,b&\u0003\u0004`\f\u0004\t7e\t7", "", "3mS g9NQ(\u000f\b^", "", "\u0011n\\=T5B]\"", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface CompositeDecoder {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DECODE_DONE = -1;
    public static final int UNKNOWN_NAME = -3;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈ƪ6F"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;J4\u001c\u001fgaFEA6V\u0002#PPX52", "", "u(E", "\u0012D2\u001c7\f82\u0003gZ", "", "#M:\u001bB\u001e'M\u0002Zb>", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DECODE_DONE = -1;
        public static final int UNKNOWN_NAME = -3;

        private Companion() {
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static int decodeCollectionSize(CompositeDecoder compositeDecoder, SerialDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return -1;
        }

        public static /* synthetic */ Object decodeNullableSerializableElement$default(CompositeDecoder compositeDecoder, SerialDescriptor serialDescriptor, int i2, DeserializationStrategy deserializationStrategy, Object obj, int i3, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeNullableSerializableElement");
            }
            if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                obj = null;
            }
            return compositeDecoder.decodeNullableSerializableElement(serialDescriptor, i2, deserializationStrategy, obj);
        }

        @ExperimentalSerializationApi
        public static boolean decodeSequentially(CompositeDecoder compositeDecoder) {
            return false;
        }

        public static /* synthetic */ Object decodeSerializableElement$default(CompositeDecoder compositeDecoder, SerialDescriptor serialDescriptor, int i2, DeserializationStrategy deserializationStrategy, Object obj, int i3, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i3 & 8) != 0) {
                obj = null;
            }
            return compositeDecoder.decodeSerializableElement(serialDescriptor, i2, deserializationStrategy, obj);
        }
    }

    boolean decodeBooleanElement(SerialDescriptor serialDescriptor, int i2);

    byte decodeByteElement(SerialDescriptor serialDescriptor, int i2);

    char decodeCharElement(SerialDescriptor serialDescriptor, int i2);

    int decodeCollectionSize(SerialDescriptor serialDescriptor);

    double decodeDoubleElement(SerialDescriptor serialDescriptor, int i2);

    int decodeElementIndex(SerialDescriptor serialDescriptor);

    float decodeFloatElement(SerialDescriptor serialDescriptor, int i2);

    Decoder decodeInlineElement(SerialDescriptor serialDescriptor, int i2);

    int decodeIntElement(SerialDescriptor serialDescriptor, int i2);

    long decodeLongElement(SerialDescriptor serialDescriptor, int i2);

    @ExperimentalSerializationApi
    <T> T decodeNullableSerializableElement(SerialDescriptor serialDescriptor, int i2, DeserializationStrategy<? extends T> deserializationStrategy, T t2);

    @ExperimentalSerializationApi
    boolean decodeSequentially();

    <T> T decodeSerializableElement(SerialDescriptor serialDescriptor, int i2, DeserializationStrategy<? extends T> deserializationStrategy, T t2);

    short decodeShortElement(SerialDescriptor serialDescriptor, int i2);

    String decodeStringElement(SerialDescriptor serialDescriptor, int i2);

    void endStructure(SerialDescriptor serialDescriptor);

    SerializersModule getSerializersModule();
}
