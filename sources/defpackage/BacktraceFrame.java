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
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000b<I\u0007\"2\u0013\u007f\u0007tvA0JhP.hS2\u000fq\b<$i-yّCU(Ԃ*ޛWNumvJ`\rYƤ$8)v<Kex\f܈\u001f4Rom3{nu8\u00035\u0016\u0015&8\"Fz\u001d\u0001H,X\u0016|zQN$\u0012^B\u0001@X\r[\t2\u00124@0\u0007$\\uSNH\u001bcJ5)\u0003wIf'\u000e2\rS\u0013Fb/%v\u0010$;F=5#.k\u00035TkE\t?\u007fG\u001dhU-;OyWDc\u0018\u0014C7̠\u0011_x3j\u0013\u001af\u001a@CO\u0012K\u0017#p\t\t\u0016%<2)6-VJE\u001c|\u0007<P;ɘS\tV\u0010|Z\u007f)\u0001|+m\u0006AKQ\u001b\u0015W(Oa-E\u001d\u001d\rLŀ1t'[b\u000fx\u0015IV(W7QN@`N8[ms\npp\u0006B\u0004^I05\u0002\u0011<\u001c=7\n?S'q\u0002VK\u007fv3b\u0019YoRVH:nD=Z\u000f\u0012ZRm\u001dk~V\t2\u0017M*^\u001f}6\u0019Pb}</0(N}t:~[^\"%]hm]E\u0090\u0010Ć=d;̐ie\u0016p`\u0007dSJe\u001dX\u0015D\n\u00101٪*ϒ6Nrݘ\u0010}J_\u001a#\u0003S\u007f L,_\u001b\u0013\u0019\u001fҙ նE\u0003\u0011ݠrj\u0016\u0011bCt\u0017w)\r\t/V\u0013tFΧzͅ0\u0003hõECWH':&6v;\u0015#5\u0001*\u0004\u001eэNܤPr\u001e߯m}&+(I\"CK\u001b'~W881\u001cɫtϯUS\u001a\u05fd\u0013~\u007f%I|~{\u0016s\t,\u000fl\u0001S+ϧ$Ցbx+Ψ|\u0002\u007fxT\u000b\u0018wb\u0015s>wx9]\u0013҆:٫\t%&ݒ\u0019q(\u0015CAϧ+@"}, d2 = {"\u001aAP0^;KO\u0017~[k(\u0005\t\u0005", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "@d[,c*", "", ">b", "Ao", "4t]0g0H\\\u0013\bvf,", "", "4t]0g0H\\\u0013\t{_:|\u0018", "4h[2R5:[\u0019", "4h[2R4:^\u0013\t{_:|\u0018", "0tX9W&BR", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uI9\u0017?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV{}Lk\u001f8@,1b\u007fi%|#2VE\u0011P\u001b#\u0011y]\u0003\u000e_5P@\u0015VYR5^(YG\u001a\u0016dW+?\u001c\u0005GP1rM9tK\u001d", "5dc\u001fX38^\u0017", "u(9", "5dc\u001dV", "5dc c", "5dc\u0013h5<b\u001d\t\u0004X5x\u0011/", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0013h5<b\u001d\t\u0004X6}\n=e\u000f", "5dc\u0013\\3>M\"z\u0003^", "5dc\u0013\\3>M!z\u0006X6}\n=e\u000f", "5dc\u000fh0ER\u0013\u0003y", "<df\u000fh0ER\u0019\f", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class BacktraceFrame extends Message {
    public static final ProtoAdapter<BacktraceFrame> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "x\r\u0002\u0006~d\u0001", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 7, tag = 8)
    @InterfaceC1492Gx
    private final String build_id;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "|\u0001\u0005~g|\rl\u0005\u0006\u0014\u0007\u0017", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 6, tag = 7)
    @InterfaceC1492Gx
    private final long file_map_offset;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "|\u0001\u0005~h|\n\u0003", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 5, tag = 6)
    @InterfaceC1492Gx
    private final String file_name;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "|\r\u0007|\u000f\u0005\f\fl\u0001\u000e\u0007", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 3, tag = 4)
    @InterfaceC1492Gx
    private final String function_name;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "|\r\u0007|\u000f\u0005\f\fm\u0006\u0007\u0015\b\u0018", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 4, tag = 5)
    @InterfaceC1492Gx
    private final long function_offset;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final long pc;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "\t|\u0005i}", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final long rel_pc;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 2, tag = 3)
    @InterfaceC1492Gx
    private final long sp;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aAP0^;KO\u0017~[k(\u0005\tmC\n0\u0007<\n\u001b!PE", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aAP0^;KO\u0017~[k(\u0005\t\u0005", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BacktraceFrame.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BacktraceFrame>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: BacktraceFrame$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BacktraceFrame decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                String strDecode = "";
                long jLongValue2 = 0;
                long jLongValue3 = 0;
                long jLongValue4 = 0;
                long jLongValue5 = 0;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BacktraceFrame(jLongValue, jLongValue2, jLongValue3, strDecode, jLongValue4, strDecode2, jLongValue5, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            jLongValue4 = ProtoAdapter.UINT64.decode(reader).longValue();
                            break;
                        case 6:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            jLongValue5 = ProtoAdapter.UINT64.decode(reader).longValue();
                            break;
                        case 8:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BacktraceFrame value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getRel_pc() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getRel_pc()));
                }
                if (value.getPc() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getPc()));
                }
                if (value.getSp() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getSp()));
                }
                if (!Intrinsics.areEqual(value.getFunction_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getFunction_name());
                }
                if (value.getFunction_offset() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 5, Long.valueOf(value.getFunction_offset()));
                }
                if (!Intrinsics.areEqual(value.getFile_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, value.getFile_name());
                }
                if (value.getFile_map_offset() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 7, Long.valueOf(value.getFile_map_offset()));
                }
                if (!Intrinsics.areEqual(value.getBuild_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getBuild_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BacktraceFrame value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getBuild_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getBuild_id());
                }
                if (value.getFile_map_offset() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 7, Long.valueOf(value.getFile_map_offset()));
                }
                if (!Intrinsics.areEqual(value.getFile_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, value.getFile_name());
                }
                if (value.getFunction_offset() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 5, Long.valueOf(value.getFunction_offset()));
                }
                if (!Intrinsics.areEqual(value.getFunction_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getFunction_name());
                }
                if (value.getSp() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getSp()));
                }
                if (value.getPc() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getPc()));
                }
                if (value.getRel_pc() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getRel_pc()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BacktraceFrame value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getRel_pc() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(value.getRel_pc()));
                }
                if (value.getPc() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getPc()));
                }
                if (value.getSp() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getSp()));
                }
                if (!Intrinsics.areEqual(value.getFunction_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getFunction_name());
                }
                if (value.getFunction_offset() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(5, Long.valueOf(value.getFunction_offset()));
                }
                if (!Intrinsics.areEqual(value.getFile_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getFile_name());
                }
                if (value.getFile_map_offset() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(7, Long.valueOf(value.getFile_map_offset()));
                }
                return !Intrinsics.areEqual(value.getBuild_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getBuild_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BacktraceFrame redact(BacktraceFrame value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BacktraceFrame.copy$default(value, 0L, 0L, 0L, null, 0L, null, 0L, null, ByteString.EMPTY, 255, null);
            }
        };
    }

    public BacktraceFrame() {
        this(0L, 0L, 0L, null, 0L, null, 0L, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BacktraceFrame(long j2, long j3, long j4, String function_name, long j5, String file_name, long j6, String build_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(function_name, "function_name");
        Intrinsics.checkNotNullParameter(file_name, "file_name");
        Intrinsics.checkNotNullParameter(build_id, "build_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rel_pc = j2;
        this.pc = j3;
        this.sp = j4;
        this.function_name = function_name;
        this.function_offset = j5;
        this.file_name = file_name;
        this.file_map_offset = j6;
        this.build_id = build_id;
    }

    public /* synthetic */ BacktraceFrame(long j2, long j3, long j4, String str, long j5, String str2, long j6, String str3, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? 0L : j2, (i2 & 2) != 0 ? 0L : j3, (i2 + 4) - (i2 | 4) != 0 ? 0L : j4, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? "" : str, (i2 & 16) != 0 ? 0L : j5, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? "" : str2, (-1) - (((-1) - i2) | ((-1) - 64)) == 0 ? j6 : 0L, (-1) - (((-1) - i2) | ((-1) - 128)) == 0 ? str3 : "", (i2 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public static /* synthetic */ BacktraceFrame copy$default(BacktraceFrame backtraceFrame, long j2, long j3, long j4, String str, long j5, String str2, long j6, String str3, ByteString byteString, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            j2 = backtraceFrame.rel_pc;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j3 = backtraceFrame.pc;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            j4 = backtraceFrame.sp;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            str = backtraceFrame.function_name;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            j5 = backtraceFrame.function_offset;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            str2 = backtraceFrame.file_name;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            j6 = backtraceFrame.file_map_offset;
        }
        if ((i2 & 128) != 0) {
            str3 = backtraceFrame.build_id;
        }
        if ((i2 & 256) != 0) {
            byteString = backtraceFrame.unknownFields();
        }
        return backtraceFrame.copy(j2, j3, j4, str, j5, str2, j6, str3, byteString);
    }

    public final BacktraceFrame copy(long j2, long j3, long j4, String function_name, long j5, String file_name, long j6, String build_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(function_name, "function_name");
        Intrinsics.checkNotNullParameter(file_name, "file_name");
        Intrinsics.checkNotNullParameter(build_id, "build_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BacktraceFrame(j2, j3, j4, function_name, j5, file_name, j6, build_id, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BacktraceFrame)) {
            return false;
        }
        BacktraceFrame backtraceFrame = (BacktraceFrame) obj;
        return Intrinsics.areEqual(unknownFields(), backtraceFrame.unknownFields()) && this.rel_pc == backtraceFrame.rel_pc && this.pc == backtraceFrame.pc && this.sp == backtraceFrame.sp && Intrinsics.areEqual(this.function_name, backtraceFrame.function_name) && this.function_offset == backtraceFrame.function_offset && Intrinsics.areEqual(this.file_name, backtraceFrame.file_name) && this.file_map_offset == backtraceFrame.file_map_offset && Intrinsics.areEqual(this.build_id, backtraceFrame.build_id);
    }

    public final String getBuild_id() {
        return this.build_id;
    }

    public final long getFile_map_offset() {
        return this.file_map_offset;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final String getFunction_name() {
        return this.function_name;
    }

    public final long getFunction_offset() {
        return this.function_offset;
    }

    public final long getPc() {
        return this.pc;
    }

    public final long getRel_pc() {
        return this.rel_pc;
    }

    public final long getSp() {
        return this.sp;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((((((((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.rel_pc)) * 37) + Long.hashCode(this.pc)) * 37) + Long.hashCode(this.sp)) * 37) + this.function_name.hashCode()) * 37) + Long.hashCode(this.function_offset)) * 37) + this.file_name.hashCode()) * 37) + Long.hashCode(this.file_map_offset)) * 37) + this.build_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m1newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m1newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("rel_pc=" + this.rel_pc);
        arrayList2.add("pc=" + this.pc);
        arrayList2.add("sp=" + this.sp);
        arrayList2.add("function_name=" + Internal.sanitize(this.function_name));
        arrayList2.add("function_offset=" + this.function_offset);
        arrayList2.add("file_name=" + Internal.sanitize(this.file_name));
        arrayList2.add("file_map_offset=" + this.file_map_offset);
        arrayList2.add("build_id=" + Internal.sanitize(this.build_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "BacktraceFrame{", "}", 0, null, null, 56, null);
    }
}
