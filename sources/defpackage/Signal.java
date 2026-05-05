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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000b<H\u0007Ӭ4\u0012\u0006\u0013nj?1LeV7ZS0\u0011s{B+cҕyCQU\"Ԃ*\teNogt\\b\u000bQƤ\u000e\u0016~mBկs#\u000e\u001e\u001f4Rom\u074c]qM9\u000ftd\u0004X1Lxo\u0015\u0007 *V\u0011\u000fzqM\u001c\u00186@~=j\r{\t*\u0018\f>.\u00066\\\u0016PFNr]H5;\u0003\u0018F^-e0\u000bT%F\u0003/\u001d|g\u001e9IO5C'c\t\rRiI\u001b? ?\u0015n-'9T\fWd`\u0010\u001a\u001b+]\u0019urTi\u0015Yf\f59geaO<7\b\u0001\u0002\rJ\u0014&\u0006UYͶ1\u001cl\u001a\u001cF=xach\u0002\rBF\u0010*G%I\u00183YAKl_\u0007S\u001bd6*+S̫#It/\u0003l\u000e\u000f\u0017ah@W?yX=vRPm\u0006b\u0012\u001az\u0002Xʶ`M\u0006/\n\u0012F\u0017S9\f?)!y\u0005`D\u0016z5fnSwW`@PpF=0\t\u001a`\\d3o\u0001Z^,\u001fT4T5\u00068\u0019&\\\u0006E9%>P\u007fnoj[g\"%]hg_tk\u001cbQ^a=\u0002i\u0016a`\u0003,?jo5`lBa\u001ar^>!`W\u001b\u0016}{R^$\u0013`PB0B-I\u0019\u000b\u0017~\u0007t՛CҴ\rebӐ(\u0001ZG2\u0018:8\u0003\f\u0019P\u000bt&kO̪.ʬd(5ۋi7\u001f<c99H\u000b(\u001f~\"\u0002}k#܉N̡\u001a{]ݨ8\u0018 Q_D\u000e'\u001d\u0005A201{PIϔS̊\u0016-\u0003۠\u0012\u0011A\u0002<~X~~3xjxW\u000b\u001bxԶ`ѓ'\u000elр\u0012cL\u0015U~%\u001fiGar1[rR\u000fِ\u0007ȷ\"+\tǻ:~;IQ<m*\u0006\u001eG\u0015\u0010_ s\u0005ӨdϪ*zmֽDe\u001c\rpf.FICaY-FX(CßD\u05f8n}\u0010ȷ!6\u0013QV\\5\u0005dDe\u000b]\u000b\u001d\u000b\u0003ހrÆ_@\u001b̊\u001664~8\u0014\u0014\u0014\"l[''L\u0002v$q\"Ŕ\rΊ\u0013\u0010\u0013֊Ip\u0018=KBݱ[\u000e"}, d2 = {"\u001aRX4a(E)", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "<t\\/X9", "", "<`\\2", "", "1nS2", "1nS2R5:[\u0019", "6`b,f,GR\u0019\f", "", "Ad]1X98c\u001d}", "Ad]1X98^\u001d}", "6`b,Y(NZ(xv]+\n\t=s", "4`d9g&:R\u0018\fzl:", "", "4`d9g&:R\u001ezx^5\f\u00037e\u000f$z<\u0010\u0013", "\u001aLT:b9R2)\u0007\u00064", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q$g\u001c\u0013XkWCr.7#k/Dq\u001f0#8\u001fO)\u0003{PaA\u0011p@-\u0007/R\"56bV|\u0007p&i\u000e<:\u001a\tbCy25", "5dc\u001bh4;S&", "u(8", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010b+>", "5dc\u0010b+>M\"z\u0003^", "5dc\u0015T:8a\u0019\by^9", "u(I", "5dc X5=S&x\u000bb+", "5dc X5=S&x\u0006b+", "5dc\u0015T:8T\u0015\u000f\u0002m&x\b.r\u007f6\n", "5dc\u0013T<Eb\u0013zy]9|\u0017=", "u(9", "5dc\u0013T<Eb\u0013zyc(z\t8ty0{O|\u0016\u0013Vk", "u(;\u001aX4H`-]\u000bf7R", "<df\u000fh0ER\u0019\f", "3pd._:", "=sW2e", "", "6`b566=S", "BnBAe0GU", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class Signal extends Message {
    public static final ProtoAdapter<Signal> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLsy\u0001``", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 2, tag = 3)
    @InterfaceC1492Gx
    private final int code;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "y\u0007|~h|\n\u0003", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 3, tag = 4)
    @InterfaceC1492Gx
    private final String code_name;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "|x\u000e\u0006\u000f\\\u0001\u0002\u0011\u0005\u0014\u0015", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 8, tag = 9)
    @InterfaceC1492Gx
    private final long fault_address;

    @WireField(adapter = "Xqz}\u0002\nU\b\u0001\u00058W[Yin`n", declaredName = "", jsonName = "|x\u000e\u0006\u000f\\\u0001\b\u007f\u0003\u0006\u0010\u0017p\n\u001a\b\f\n\u001e\f", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 9, tag = 10)
    @InterfaceC1492Gx
    private final MemoryDump fault_adjacent_metadata;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLlz{y", declaredName = "", jsonName = "~x\f_{\u0011\t\u0012_\u0004\u0005\u0014\b\u0017\u0018", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 7, tag = 8)
    @InterfaceC1492Gx
    private final boolean has_fault_address;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLlz{y", declaredName = "", jsonName = "~x\fl\u007f\n\u0001\u0003\u0011", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 4, tag = 5)
    @InterfaceC1492Gx
    private final boolean has_sender;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final String name;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLsy\u0001``", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final int number;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLsy\u0001``", declaredName = "", jsonName = "\n|\u0007}\u007f\u000el\u0007\u0003", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 6, tag = 7)
    @InterfaceC1492Gx
    private final int sender_pid;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLsy\u0001``", declaredName = "", jsonName = "\n|\u0007}\u007f\u000eq\u0007\u0003", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 5, tag = 6)
    @InterfaceC1492Gx
    private final int sender_uid;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aRX4a(E\u0012v\t\u0003i(\u0006\r9nU", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aRX4a(E)", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Signal.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Signal>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: Signal$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Signal decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                String strDecode = "";
                long jLongValue = 0;
                MemoryDump memoryDumpDecode = null;
                int iIntValue2 = 0;
                boolean zBooleanValue = false;
                int iIntValue3 = 0;
                int iIntValue4 = 0;
                boolean zBooleanValue2 = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Signal(iIntValue, strDecode, iIntValue2, strDecode2, zBooleanValue, iIntValue3, iIntValue4, zBooleanValue2, jLongValue, memoryDumpDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 2:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 4:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 6:
                            iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 7:
                            iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 8:
                            zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 9:
                            jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                            break;
                        case 10:
                            memoryDumpDecode = MemoryDump.ADAPTER.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Signal value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getNumber() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getNumber()));
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getName());
                }
                if (value.getCode() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getCode()));
                }
                if (!Intrinsics.areEqual(value.getCode_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getCode_name());
                }
                if (value.getHas_sender()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getHas_sender()));
                }
                if (value.getSender_uid() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getSender_uid()));
                }
                if (value.getSender_pid() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, Integer.valueOf(value.getSender_pid()));
                }
                if (value.getHas_fault_address()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getHas_fault_address()));
                }
                if (value.getFault_address() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 9, Long.valueOf(value.getFault_address()));
                }
                if (value.getFault_adjacent_metadata() != null) {
                    MemoryDump.ADAPTER.encodeWithTag(writer, 10, value.getFault_adjacent_metadata());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Signal value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFault_adjacent_metadata() != null) {
                    MemoryDump.ADAPTER.encodeWithTag(writer, 10, value.getFault_adjacent_metadata());
                }
                if (value.getFault_address() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 9, Long.valueOf(value.getFault_address()));
                }
                if (value.getHas_fault_address()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getHas_fault_address()));
                }
                if (value.getSender_pid() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, Integer.valueOf(value.getSender_pid()));
                }
                if (value.getSender_uid() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getSender_uid()));
                }
                if (value.getHas_sender()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getHas_sender()));
                }
                if (!Intrinsics.areEqual(value.getCode_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getCode_name());
                }
                if (value.getCode() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getCode()));
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getName());
                }
                if (value.getNumber() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getNumber()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Signal value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getNumber() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getNumber()));
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                }
                if (value.getCode() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getCode()));
                }
                if (!Intrinsics.areEqual(value.getCode_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCode_name());
                }
                if (value.getHas_sender()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getHas_sender()));
                }
                if (value.getSender_uid() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getSender_uid()));
                }
                if (value.getSender_pid() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getSender_pid()));
                }
                if (value.getHas_fault_address()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getHas_fault_address()));
                }
                if (value.getFault_address() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(9, Long.valueOf(value.getFault_address()));
                }
                return value.getFault_adjacent_metadata() != null ? size + MemoryDump.ADAPTER.encodedSizeWithTag(10, value.getFault_adjacent_metadata()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Signal redact(Signal value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MemoryDump fault_adjacent_metadata = value.getFault_adjacent_metadata();
                return Signal.copy$default(value, 0, null, 0, null, false, 0, 0, false, 0L, fault_adjacent_metadata != null ? MemoryDump.ADAPTER.redact(fault_adjacent_metadata) : null, ByteString.EMPTY, FrameMetricsAggregator.EVERY_DURATION, null);
            }
        };
    }

    public Signal() {
        this(0, null, 0, null, false, 0, 0, false, 0L, null, null, 2047, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Signal(int i2, String name, int i3, String code_name, boolean z2, int i4, int i5, boolean z3, long j2, MemoryDump memoryDump, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code_name, "code_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.number = i2;
        this.name = name;
        this.code = i3;
        this.code_name = code_name;
        this.has_sender = z2;
        this.sender_uid = i4;
        this.sender_pid = i5;
        this.has_fault_address = z3;
        this.fault_address = j2;
        this.fault_adjacent_metadata = memoryDump;
    }

    public /* synthetic */ Signal(int i2, String str, int i3, String str2, boolean z2, int i4, int i5, boolean z3, long j2, MemoryDump memoryDump, ByteString byteString, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 + 1) - (i6 | 1) != 0 ? 0 : i2, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? 0 : i3, (-1) - (((-1) - i6) | ((-1) - 8)) == 0 ? str2 : "", (i6 + 16) - (i6 | 16) != 0 ? false : z2, (i6 + 32) - (i6 | 32) != 0 ? 0 : i4, (i6 + 64) - (i6 | 64) != 0 ? 0 : i5, (-1) - (((-1) - i6) | ((-1) - 128)) == 0 ? z3 : false, (-1) - (((-1) - i6) | ((-1) - 256)) != 0 ? 0L : j2, (i6 + 512) - (i6 | 512) != 0 ? null : memoryDump, (i6 + 1024) - (i6 | 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public static /* synthetic */ Signal copy$default(Signal signal, int i2, String str, int i3, String str2, boolean z2, int i4, int i5, boolean z3, long j2, MemoryDump memoryDump, ByteString byteString, int i6, Object obj) {
        if ((i6 + 1) - (1 | i6) != 0) {
            i2 = signal.number;
        }
        if ((i6 + 2) - (2 | i6) != 0) {
            str = signal.name;
        }
        if ((4 & i6) != 0) {
            i3 = signal.code;
        }
        if ((i6 + 8) - (8 | i6) != 0) {
            str2 = signal.code_name;
        }
        if ((16 & i6) != 0) {
            z2 = signal.has_sender;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 32)) != 0) {
            i4 = signal.sender_uid;
        }
        if ((i6 + 64) - (64 | i6) != 0) {
            i5 = signal.sender_pid;
        }
        if ((128 & i6) != 0) {
            z3 = signal.has_fault_address;
        }
        if ((256 & i6) != 0) {
            j2 = signal.fault_address;
        }
        if ((i6 + 512) - (512 | i6) != 0) {
            memoryDump = signal.fault_adjacent_metadata;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 1024)) != 0) {
            byteString = signal.unknownFields();
        }
        return signal.copy(i2, str, i3, str2, z2, i4, i5, z3, j2, memoryDump, byteString);
    }

    public final Signal copy(int i2, String name, int i3, String code_name, boolean z2, int i4, int i5, boolean z3, long j2, MemoryDump memoryDump, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code_name, "code_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Signal(i2, name, i3, code_name, z2, i4, i5, z3, j2, memoryDump, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Signal)) {
            return false;
        }
        Signal signal = (Signal) obj;
        return Intrinsics.areEqual(unknownFields(), signal.unknownFields()) && this.number == signal.number && Intrinsics.areEqual(this.name, signal.name) && this.code == signal.code && Intrinsics.areEqual(this.code_name, signal.code_name) && this.has_sender == signal.has_sender && this.sender_uid == signal.sender_uid && this.sender_pid == signal.sender_pid && this.has_fault_address == signal.has_fault_address && this.fault_address == signal.fault_address && Intrinsics.areEqual(this.fault_adjacent_metadata, signal.fault_adjacent_metadata);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getCode_name() {
        return this.code_name;
    }

    public final long getFault_address() {
        return this.fault_address;
    }

    public final MemoryDump getFault_adjacent_metadata() {
        return this.fault_adjacent_metadata;
    }

    public final boolean getHas_fault_address() {
        return this.has_fault_address;
    }

    public final boolean getHas_sender() {
        return this.has_sender;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumber() {
        return this.number;
    }

    public final int getSender_pid() {
        return this.sender_pid;
    }

    public final int getSender_uid() {
        return this.sender_uid;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((((((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.number)) * 37) + this.name.hashCode()) * 37) + Integer.hashCode(this.code)) * 37) + this.code_name.hashCode()) * 37) + Boolean.hashCode(this.has_sender)) * 37) + Integer.hashCode(this.sender_uid)) * 37) + Integer.hashCode(this.sender_pid)) * 37) + Boolean.hashCode(this.has_fault_address)) * 37) + Long.hashCode(this.fault_address)) * 37;
        MemoryDump memoryDump = this.fault_adjacent_metadata;
        int iHashCode2 = iHashCode + (memoryDump != null ? memoryDump.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m15newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m15newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("number=" + this.number);
        arrayList2.add("name=" + Internal.sanitize(this.name));
        arrayList2.add("code=" + this.code);
        arrayList2.add("code_name=" + Internal.sanitize(this.code_name));
        arrayList2.add("has_sender=" + this.has_sender);
        arrayList2.add("sender_uid=" + this.sender_uid);
        arrayList2.add("sender_pid=" + this.sender_pid);
        arrayList2.add("has_fault_address=" + this.has_fault_address);
        arrayList2.add("fault_address=" + this.fault_address);
        if (this.fault_adjacent_metadata != null) {
            arrayList2.add("fault_adjacent_metadata=" + this.fault_adjacent_metadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Signal{", "}", 0, null, null, 56, null);
    }
}
