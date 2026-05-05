package defpackage;

import androidx.core.app.FrameMetricsAggregator;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000b<I\u0007\"2\u0013\u007f\u0007tsA0JfP.`_2\u000fq|<$q$yCAd\"}0ޛWȞog|Pb\u000bI\u0011\u001cǝ\u0017\u0010\\Uezm\u0012=˰RqO3{ok8\u0019s[E\nB(>y\u0013\u00022*v\u0012\u0007\u0001IK\u001a\u0015H@\u001f<b\u0013S\u0005(\u0016\u001e>N\u0003.bmNDM\u0005]h53\toB\\.w0+S\u001dLZ'\u001b~y\u001eYFG;\u001b%a\f\u001fR\nI\u0013Ew=\u0013s?'YS\u0004]<X\u000e -+}\u000fmx,\\\u0013^x\fU9յgMV\u001d6\bC\u0002\u001bY\u001c\u000e4'\u000fCu+t&&3#x\u0004F^!vD\u0016y\u0010V]Ӳ\u007f{1G<~Q\u0010]_b\u007f\u0002\u001306#/xgo\u001dvn93T&\u0383aWF=VO\"Yko4vh\u00028\u0007HG.1,\u00174\u00173;s9Q#\u001c\bNDu{\u001d`\u0017Y\u001aXN@0u.7X\u000f<`Jd\u0013shT\u00072AS\"T\u0015\u0007 \u0013Nf(B'%\u001eYgh\u0018t}c\u0010%=rOY\u001dm>]?^ABic>o#\u000b\"@Tb3Z\u001dF*ۖ\\څ,(:ʋ\u0003\u0012}\rR`\\'@B\n\u001cb.g\u001d3ñJҴ\"HIґ!a`{\u001e\u0011%G2\u0007\u0002$#\u000b7T3ʡqς|O4ʉx$3U_Gi:c'\u00014+)=\u0003JÚIѨPMT˾.w[\u0011.,jM_6U\u0013=\u0005_6XΗGʆvkY˧*)\u0001\u0014\b%\f|<o j\u001f2\u0017n!֪VЂ&|fа;\nj\u0018\bw\u0017\u000fUll\u000b\nH\u007fvYʣ>ҡ<\u0003\rȔ6'\u0007\t0\u0017\u0006AQ25\u0016&\u001ee\u00198Өkܓ2\u007fjχ>vk\u001f:}f\u0004p]u2i:\u007f]UО$ٝp\tJו\u0003y\u000e^\u0017F٨7n"}, d2 = {"\u001aLT:b9R;\u0015\n\u0006b5~^", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "0dV6a&:R\u0018\fzl:", "", "3mS,T+=`\u0019\r\t", "=eU@X;", "@dP1", "", "EqXAX", "3wT0h;>", ";`_=\\5@M\"z\u0003^", "", "0tX9W&BR", ":nP1R)BO'", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uI9\u0017M!3:\u001ez\fZu\u0004\u00058gI\u0016\u000bM\u0005 \u0019\u001dV\u00138\b!~`y)97\u0004=ZGDm\n\u0003{rg=\u0011-\tb\u0006'5[[0eTH\u0001\u0005", "5dc\u000fX.B\\\u0013zy]9|\u0017=", "u(9", "5dc\u0012a+8O\u0018}\b^:\u000b", "5dc\u001cY-LS(", "5dc\u001fX(=", "u(I", "5dc$e0MS", "5dc\u0012k,<c(~", "5dc\u001aT7IW\"\u0001tg(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u000fh0ER\u0013\u0003y", "5dc\u0019b(=M\u0016\u0003vl", "<df\u000fh0ER\u0019\f", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class MemoryMapping extends Message {
    public static final ProtoAdapter<MemoryMapping> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "x|\u007f\u0003\t\\\u0001\u0002\u0011\u0005\u0014\u0015", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final long begin_address;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "x\r\u0002\u0006~d\u0001", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 7, tag = 8)
    @InterfaceC1492Gx
    private final String build_id;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "{\u0006|Z~\u007f\u000f\u0003\u0012\u0013", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final long end_address;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLlz{y", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 5, tag = 6)
    @InterfaceC1492Gx
    private final boolean execute;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "\u0003\u0007y}\\\u0005}\u0011", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 8, tag = 9)
    @InterfaceC1492Gx
    private final long load_bias;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "\u0004x\t\n\u0004\n\u0004k\u007f\r\u0006", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 6, tag = 7)
    @InterfaceC1492Gx
    private final String mapping_name;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 2, tag = 3)
    @InterfaceC1492Gx
    private final long offset;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLlz{y", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 3, tag = 4)
    @InterfaceC1492Gx
    private final boolean read;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLlz{y", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 4, tag = 5)
    @InterfaceC1492Gx
    private final boolean write;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aLT:b9R;\u0015\n\u0006b5~G\ro\b3wI\u0005! \u001d", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aLT:b9R;\u0015\n\u0006b5~^", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MemoryMapping.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MemoryMapping>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: MemoryMapping$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MemoryMapping decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                boolean zBooleanValue = false;
                String strDecode = "";
                long jLongValue2 = 0;
                long jLongValue3 = 0;
                long jLongValue4 = 0;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MemoryMapping(jLongValue, jLongValue2, jLongValue3, zBooleanValue, zBooleanValue2, zBooleanValue3, strDecode, strDecode2, jLongValue4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                            break;
                        case 2:
                            jLongValue2 = ProtoAdapter.UINT64.decode(reader).longValue();
                            break;
                        case 3:
                            jLongValue3 = ProtoAdapter.UINT64.decode(reader).longValue();
                            break;
                        case 4:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 5:
                            zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 6:
                            zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 7:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            jLongValue4 = ProtoAdapter.UINT64.decode(reader).longValue();
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MemoryMapping value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBegin_address() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getBegin_address()));
                }
                if (value.getEnd_address() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getEnd_address()));
                }
                if (value.getOffset() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getOffset()));
                }
                if (value.getRead()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getRead()));
                }
                if (value.getWrite()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getWrite()));
                }
                if (value.getExecute()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getExecute()));
                }
                if (!Intrinsics.areEqual(value.getMapping_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, value.getMapping_name());
                }
                if (!Intrinsics.areEqual(value.getBuild_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getBuild_id());
                }
                if (value.getLoad_bias() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 9, Long.valueOf(value.getLoad_bias()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MemoryMapping value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLoad_bias() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 9, Long.valueOf(value.getLoad_bias()));
                }
                if (!Intrinsics.areEqual(value.getBuild_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getBuild_id());
                }
                if (!Intrinsics.areEqual(value.getMapping_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, value.getMapping_name());
                }
                if (value.getExecute()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getExecute()));
                }
                if (value.getWrite()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getWrite()));
                }
                if (value.getRead()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getRead()));
                }
                if (value.getOffset() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getOffset()));
                }
                if (value.getEnd_address() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getEnd_address()));
                }
                if (value.getBegin_address() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getBegin_address()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MemoryMapping value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBegin_address() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(value.getBegin_address()));
                }
                if (value.getEnd_address() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getEnd_address()));
                }
                if (value.getOffset() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getOffset()));
                }
                if (value.getRead()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getRead()));
                }
                if (value.getWrite()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getWrite()));
                }
                if (value.getExecute()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getExecute()));
                }
                if (!Intrinsics.areEqual(value.getMapping_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getMapping_name());
                }
                if (!Intrinsics.areEqual(value.getBuild_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getBuild_id());
                }
                return value.getLoad_bias() != 0 ? size + ProtoAdapter.UINT64.encodedSizeWithTag(9, Long.valueOf(value.getLoad_bias())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MemoryMapping redact(MemoryMapping value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MemoryMapping.copy$default(value, 0L, 0L, 0L, false, false, false, null, null, 0L, ByteString.EMPTY, FrameMetricsAggregator.EVERY_DURATION, null);
            }
        };
    }

    public MemoryMapping() {
        this(0L, 0L, 0L, false, false, false, null, null, 0L, null, 1023, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryMapping(long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, String mapping_name, String build_id, long j5, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(mapping_name, "mapping_name");
        Intrinsics.checkNotNullParameter(build_id, "build_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.begin_address = j2;
        this.end_address = j3;
        this.offset = j4;
        this.read = z2;
        this.write = z3;
        this.execute = z4;
        this.mapping_name = mapping_name;
        this.build_id = build_id;
        this.load_bias = j5;
    }

    public /* synthetic */ MemoryMapping(long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, String str, String str2, long j5, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? 0L : j2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? 0L : j3, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? 0L : j4, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? false : z2, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? false : z3, (i2 + 32) - (i2 | 32) == 0 ? z4 : false, (i2 & 64) != 0 ? "" : str, (-1) - (((-1) - i2) | ((-1) - 128)) == 0 ? str2 : "", (-1) - (((-1) - i2) | ((-1) - 256)) == 0 ? j5 : 0L, (i2 & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    public static /* synthetic */ MemoryMapping copy$default(MemoryMapping memoryMapping, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, String str, String str2, long j5, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = memoryMapping.begin_address;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = memoryMapping.end_address;
        }
        if ((i2 & 4) != 0) {
            j4 = memoryMapping.offset;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            z2 = memoryMapping.read;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            z3 = memoryMapping.write;
        }
        if ((i2 & 32) != 0) {
            z4 = memoryMapping.execute;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            str = memoryMapping.mapping_name;
        }
        if ((i2 + 128) - (i2 | 128) != 0) {
            str2 = memoryMapping.build_id;
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            j5 = memoryMapping.load_bias;
        }
        if ((i2 + 512) - (i2 | 512) != 0) {
            byteString = memoryMapping.unknownFields();
        }
        return memoryMapping.copy(j2, j3, j4, z2, z3, z4, str, str2, j5, byteString);
    }

    public final MemoryMapping copy(long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, String mapping_name, String build_id, long j5, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(mapping_name, "mapping_name");
        Intrinsics.checkNotNullParameter(build_id, "build_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MemoryMapping(j2, j3, j4, z2, z3, z4, mapping_name, build_id, j5, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemoryMapping)) {
            return false;
        }
        MemoryMapping memoryMapping = (MemoryMapping) obj;
        return Intrinsics.areEqual(unknownFields(), memoryMapping.unknownFields()) && this.begin_address == memoryMapping.begin_address && this.end_address == memoryMapping.end_address && this.offset == memoryMapping.offset && this.read == memoryMapping.read && this.write == memoryMapping.write && this.execute == memoryMapping.execute && Intrinsics.areEqual(this.mapping_name, memoryMapping.mapping_name) && Intrinsics.areEqual(this.build_id, memoryMapping.build_id) && this.load_bias == memoryMapping.load_bias;
    }

    public final long getBegin_address() {
        return this.begin_address;
    }

    public final String getBuild_id() {
        return this.build_id;
    }

    public final long getEnd_address() {
        return this.end_address;
    }

    public final boolean getExecute() {
        return this.execute;
    }

    public final long getLoad_bias() {
        return this.load_bias;
    }

    public final String getMapping_name() {
        return this.mapping_name;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final boolean getWrite() {
        return this.write;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((((((((((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.begin_address)) * 37) + Long.hashCode(this.end_address)) * 37) + Long.hashCode(this.offset)) * 37) + Boolean.hashCode(this.read)) * 37) + Boolean.hashCode(this.write)) * 37) + Boolean.hashCode(this.execute)) * 37) + this.mapping_name.hashCode()) * 37) + this.build_id.hashCode()) * 37) + Long.hashCode(this.load_bias);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m13newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m13newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("begin_address=" + this.begin_address);
        arrayList2.add("end_address=" + this.end_address);
        arrayList2.add("offset=" + this.offset);
        arrayList2.add("read=" + this.read);
        arrayList2.add("write=" + this.write);
        arrayList2.add("execute=" + this.execute);
        arrayList2.add("mapping_name=" + Internal.sanitize(this.mapping_name));
        arrayList2.add("build_id=" + Internal.sanitize(this.build_id));
        arrayList2.add("load_bias=" + this.load_bias);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MemoryMapping{", "}", 0, null, null, 56, null);
    }
}
