package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.NoOpEncoder;
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
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\f6B\u0015\"4ߚ\u007f\u0007tjAӄLeV7ZS0\u000fs{B*cҕyCIX\"}(\tWNuqvJ`\u000bK\u000f\u0014\u001a\u0001j2L]xk\u0017\u00172HsG3[vE9fv>\u0005.݅*\u0600\u0002\u0005\u0017\u001a2H\u0016w\u0003CY\u0014\u001a0FpBR\u001bY\r\u001a\u0018\bDE\u0017Ȧ\rg|5xl\f:o&ɨmB\\((>\u000bO%F\u0003'=zo!C@e9[9\u001c\u0011\u0015Ws?1E\"A\u0013o?'YQ:k~t\u000e\u001d-+}\u0013\u000ev4_\u001dQ\u000f\u0010W/]mcP<3(~\n\u0014T\u0004<\u000eoV<92f6\u0014cx\u0001ZXP0k\t\u0014C}D%=\u007fa1i\u001ftTy;GRg\u007f\u0013\u00176#/yQ_b\u0015x\u0015Ia@_?`X=vT:]Kt\u001cp\u0011\u0012p\u0018xc\u000e@\u0014\u0011\\\u001dU;i<;!\u001a\u0006xHu\u0001\u001d`\u0017^\u001aVVG:nDGr\u0017\u001al\\d3q\u0001Xf3)MJgM\u0012P/.p\u0010<O+@R]k\u0002j{a:)=pOY\u001dv>[GeK5\u007fvXw`\f,?jj5\\tEk\f\t`X&@R\u0003\u0010&\u0007\u000bbT)@U\n\u001cb2a\u001dj,`\u0003LFq\u0001\u0017irh>\n\u001bGl\u0011w<\r\t/V\rt}n\u0011IZ\u0016'6u]_O1&\u0004(\u00198\u000b&\u001f~\"\u0004wkZQdlD\u0001\u0006\u007f.\u001d29\u007fH\u0006!\u001d\u001aA20,uP\u0001hiM@+A\u0011B#I\u0005Fg6i!0nmbO\u0003\u001bRzl|;\b\u0013\u000bBoT\u0018_c\u0003\u0011\fBWy\u001bYjY~\u0011M;,C\u0019oP\u0003e1Q*5\u0016&\u0018_\u0019og\u0002o\\\u0005\u0013\u00134{}\u0004Zn^}ppu2i>y]\rE:$\u001b#\t\\3\u0014\u0016c!4;9xErsn8{\u000f_\u0002t\u0011D\r\u001fa\f>!v\u00164\\\u007fryQ ,^q+Wa\u001c%{\u0011c\\9P/\u0010\u0011֊?\u0013:\u001ckE\u0007[p\fH\u0006\"\u001cfEIl\u001d<7/d6J.#Idk\u0016\u0010A$t\u0007?\u001d@I\f=l\r\u001b\u001d#j߃\t`S\tia\u000f('3L~U3\u000bևTx_g@\u0004k\u001d7\u001f\u001bS\rp=+r_i%6~\u0019\u0011U_SIHZ2nYqyv$8^!cVɓ\u001f9_9(\u0005>\t#U\u0013T\u0015z mjNPTE\u000fE*J6'\u000bGU#sp0dN&;s\u001e\u000f!\\)5\u0017-gT\"E\u0006cX\u0006WxA?{\u0006Yk\u0002\u0016'8'2#gp *t9u\u001bh\u001c\"\u001ap\u0005!\u0013~$42X~\u000b\n\\\u0013fS\u0010:\u001a\u0013\r\b4\u0006/p?+\u001b\frOv\u007f\"c\u001b\t5iS\u0011tbny\u001d3\u0001!\u0017*e.A\\!N÷WR"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#Y\u001dE|#*KR\u001bt2(\u0014hn\u000f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#])5w\u0015.Z\u0019", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0017Pm\u0018;z.7#[*?x <QR;K=\u001c\u001fgaF\\", "u(E", "0dV6a\u001aM`)|\nn9|", "2db0e0Ib#\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "3mR<W,\u001b]#\u0006zZ5", "", "D`[BX", "", "3mR<W,\u001b]#\u0006zZ5\\\u0010/m\u007f1\u000b", "7mS2k", "", "3mR<W,\u001bg(~", "", "3mR<W,\u001bg(~Ze,\u0005\t8t", "3mR<W,\u001cV\u0015\f", "", "3mR<W,\u001cV\u0015\fZe,\u0005\t8t", "3mR<W,\u001d]){\u0002^", "", "3mR<W,\u001d]){\u0002^\f\u0004\t7e\t7", "3mR<W,\u001eZ\u0019\u0007zg;", "3mR<W,\u001e\\)\u0007", "3md:7,LQ&\u0003\u0006m6\n", "3mR<W,\u001fZ#z\n", "", "3mR<W,\u001fZ#z\n>3|\u0011/n\u000f", "3mR<W,\"\\ \u0003\u0004^", "3mR<W,\"\\ \u0003\u0004^\f\u0004\t7e\t7", "3mR<W,\"\\(", "3mR<W,\"\\(^\u0002^4|\u0012>", "3mR<W,%]\"\u0001", "", "3mR<W,%]\"\u0001Ze,\u0005\t8t", "3mR<W,'c \u0006", "3mR<W,'c \u0006v[3|v/r\u0004$\u0003D\u0016\u0013\u0014NomCv-5b\r", "\"", "", "Ada6T3Bh\u0019\f", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `Fo\u001c:\u0004)@h\b-E7\u0004.ZG7r\u0013\u001e#fn=\u0012r6[L\u000b.RX;cV{P] Z\u001bR'\u0014\tn=3rN@hu,V\u00067o\u0005!\u0012\u001d9ty0e\u001dC\t\u0015wU~OKUpu\u0011HAk,.u\\\"\\8IyWb", "3mR<W,,S&\u0003ve0\u0012\u0005,l\u007f\b\u0003@\t\u0017 V", "3mR<W,,V#\f\n", "", "3mR<W,,V#\f\n>3|\u0011/n\u000f", "3mR<W,,b&\u0003\u0004`", "", "3mR<W,,b&\u0003\u0004`\f\u0004\t7e\t7", "3mR<W,/O \u000fz", "3mS g9NQ(\u000f\b^", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@ExperimentalSerializationApi
public abstract class AbstractEncoder implements Encoder, CompositeEncoder {
    @Override // kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginCollection(SerialDescriptor serialDescriptor, int i2) {
        return Encoder.DefaultImpls.beginCollection(this, serialDescriptor, i2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean z2) {
        encodeValue(Boolean.valueOf(z2));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeBooleanElement(SerialDescriptor descriptor, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i2)) {
            encodeBoolean(z2);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b2) {
        encodeValue(Byte.valueOf(b2));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeByteElement(SerialDescriptor descriptor, int i2, byte b2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i2)) {
            encodeByte(b2);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeChar(char c2) {
        encodeValue(Character.valueOf(c2));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeCharElement(SerialDescriptor descriptor, int i2, char c2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i2)) {
            encodeChar(c2);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double d2) {
        encodeValue(Double.valueOf(d2));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeDoubleElement(SerialDescriptor descriptor, int i2, double d2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i2)) {
            encodeDouble(d2);
        }
    }

    public boolean encodeElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeEnum(SerialDescriptor enumDescriptor, int i2) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeValue(Integer.valueOf(i2));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float f2) {
        encodeValue(Float.valueOf(f2));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeFloatElement(SerialDescriptor descriptor, int i2, float f2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i2)) {
            encodeFloat(f2);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder encodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final Encoder encodeInlineElement(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return encodeElement(descriptor, i2) ? encodeInline(descriptor.getElementDescriptor(i2)) : NoOpEncoder.INSTANCE;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeInt(int i2) {
        encodeValue(Integer.valueOf(i2));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeIntElement(SerialDescriptor descriptor, int i2, int i3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i2)) {
            encodeInt(i3);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeLong(long j2) {
        encodeValue(Long.valueOf(j2));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeLongElement(SerialDescriptor descriptor, int i2, long j2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i2)) {
            encodeLong(j2);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @ExperimentalSerializationApi
    public void encodeNotNullMark() {
        Encoder.DefaultImpls.encodeNotNullMark(this);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeNullableSerializableElement(SerialDescriptor descriptor, int i2, SerializationStrategy<? super T> serializer, T t2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (encodeElement(descriptor, i2)) {
            encodeNullableSerializableValue(serializer, t2);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @ExperimentalSerializationApi
    public <T> void encodeNullableSerializableValue(SerializationStrategy<? super T> serializationStrategy, T t2) {
        Encoder.DefaultImpls.encodeNullableSerializableValue(this, serializationStrategy, t2);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeSerializableElement(SerialDescriptor descriptor, int i2, SerializationStrategy<? super T> serializer, T t2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (encodeElement(descriptor, i2)) {
            encodeSerializableValue(serializer, t2);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(SerializationStrategy<? super T> serializationStrategy, T t2) {
        Encoder.DefaultImpls.encodeSerializableValue(this, serializationStrategy, t2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeShort(short s2) {
        encodeValue(Short.valueOf(s2));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeShortElement(SerialDescriptor descriptor, int i2, short s2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, i2)) {
            encodeShort(s2);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        encodeValue(value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeStringElement(SerialDescriptor descriptor, int i2, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (encodeElement(descriptor, i2)) {
            encodeString(value);
        }
    }

    public void encodeValue(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    @ExperimentalSerializationApi
    public boolean shouldEncodeElementDefault(SerialDescriptor serialDescriptor, int i2) {
        return CompositeEncoder.DefaultImpls.shouldEncodeElementDefault(this, serialDescriptor, i2);
    }
}
