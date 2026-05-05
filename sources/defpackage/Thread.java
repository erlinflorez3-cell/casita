package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import cz.msebera.android.httpclient.HttpStatus;
import io.sentry.protocol.SentryStackTrace;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000b<H\u0007Ӭ4\u0012\u0006\u0013nʑA0R\u0004P.hS2\u000fq|<$q$yّCU0}*ޛWNunvJ`\u000bK\u000f\u001c\u0016\u0001j2X]xk\u001b\u0017˰JoM\u074cUoC<vҚT/P>2:\n\u0005/ɝ:J v)Cy\u000bJ/j1÷Q\u001dS\u000b\u001a \u0007V / lmT6Vou:]'\u0013uHN5dH\u0003]\u000fVTU\u0014%g.7F7C\u001d=Y\u0013\tb[m\u0007mwM\u0011n'54ayg8h\u007fB\u0019YU\u001dix&j\u000fif\u001c);O\u0012V~\u00148\u0004\u0001{\u001bH\u001c\u0014\u0016)X.['\u0015\u000e\u001e9zraNh\u0002\rQ\u0010\u0001g6%5\u00183YH+lWaI*f7*\u0017ڟ\"%\u0007\u0002/o\u001d\u0014n73T&Qwf\tNVq\"Yk\u00124vp'B\u0006FF.UB\u0094._+E\u0003Q#OmH\\\rm\u0005-xh\u0002m\u0019\\\t̗m$`B\t:ɮtj\u000bk^Up,?OLZ\r}\u0016\u00168\\&@Q1\u0016N]m\u0002p]_\u001a%]me_\u001fw\u0014WGfK;ae a\u0001zBEln\u000bXtKk\u0012j^8\"`L\u0019\u0016(\bJN\u001a\u001dJE\u0002\u001eD,_$\u000b\u001bx\u000f$BO\t!ejj ~\u0003@R\t\u001a*z\t\u000f^tp\u001ev)O2|n2EA\u007fDI,[\"vE\u0015#5\u0011D\u0014UhdGznLy,ݰ\"ک\u001e?YǽU\u0015\u0015\u00147HRASO\u000be\u007fQH+Qۨ{ӛ?n6Ԗ lvCn\u0003\u001bcb%:v\r\u0002Y\f;ш{ӶJ\u0001Oϊl\raWW\rSmJ^P|3.T)Wȃ$Ŀ93Kگ5\u0018}/=/2wwtF\u007fr\u00116t\u0014\u000bZiLs9Л_щ?>Qʲ\u0017@(@z \u0013bx\u007f H\u00196\u001d3vE\u0013v\r<$ߚ1̱j\r4ݸ\tXaX!\rNN<hByS\u007f$^q)?S\nkD\u07b6Mů\u000fP\u0017Ϙ#}7\u000e 9\u000e:daz\u000f@\b\u0004\u0018dLih;@_ӟ6ʙ@\u000e\u0013͏lk\f0\t\u001d\u0017y\u001d#JH\u0004=f\u000e\u0003\u0006\u000b\\~\t7ѬbՃ.\u0007\u0007۰K ~V?\"ְJ\u007f"}, d2 = {"\u001aSW?X(=)", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "7c", "", "<`\\2", "", "@dV6f;>`'", "", "\u001aQT4\\:MS&T", "0`R8g9:Q\u0019x\u0004h;|", "Cma2T+:P ~t^3}\u00030i\u0007(\n", "1ta?X5MM\u0016zxd;\n\u0005-e", "\u001aAP0^;KO\u0017~[k(\u0005\t\u0005", ";d\\<e@8R)\u0007\u0006", "\u001aLT:b9R2)\u0007\u00064", "B`V4X+8O\u0018}\bX*\f\u00166", "", ">`R,X5:P ~yX2|\u001d=", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u001eKz,~@\u0002.FC|3IT75D-\u0019o+ \u000bq;$],C]JulavD]x^\u001c]\u0001s\nUR 8TF#\u000fu0\u0006IwVr\u001b\nFf:Re\u0014NC{yO8>+>F\u0004MEO,\u0007x\u001b_\u000bkG>-\u0016G\\\f", "5dc\u0016W", "u(8", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!T.@S\u0018xv]+\n\u0003-t\r/", "u(9", "5dc\u001dT*8S\"zwe,{\u00035e\u00146", "5dc\u001fX.Ba(~\bl", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u000fT*Db&zx^&\u0006\u0013>e", "5dc\"a9>O\u0018zwe,v\t6fy)\u007fG\u0001%", "5dc\u0010h9KS\"\u000et[(z\u000f>r{&{", "5dc\u001aX4H`-xyn4\b", "<df\u000fh0ER\u0019\f", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class Thread extends Message {
    public static final ProtoAdapter<Thread> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "xx{\u0005\u000f\u000e}\u0001\u0004m\u0010\u0016\b", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 3, tag = 7)
    @InterfaceC1492Gx
    private final List<String> backtrace_note;

    @WireField(adapter = "Mmpy\u0004\u0003ruxZ\bw\u0005}<[_]mrdr", declaredName = "", jsonName = "y\r\u000b\f\u007f\n\u0011_\u007f\u0003\f\u0016\u0015\u0005\b\u000b", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 5, tag = 4)
    @InterfaceC1492Gx
    private final List<BacktraceFrame> current_backtrace;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLsy\u0001``", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final int id;

    @WireField(adapter = "Xqz}\u0002\nU\b\u0001\u00058W[Yin`n", declaredName = "", jsonName = "\u0004|\u0006\t\r\u0015`\u0013\f\u0010", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 6, tag = 5)
    @InterfaceC1492Gx
    private final List<MemoryDump> memory_dump;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final String name;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLsy\u0001cb", declaredName = "", jsonName = "\u0007x{^\t|~\n\u0004\u0004k\u0007\u001c\u0017", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 8, tag = 8)
    @InterfaceC1492Gx
    private final long pac_enabled_keys;

    @WireField(adapter = "]qtw\u0003\u0005v\u00056UYWgl^l", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 2, tag = 3)
    @InterfaceC1492Gx
    private final List<Register> registers;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLsy\u0001cb", declaredName = "", jsonName = "\u000bx\u007f\u0001\u007f\u007f]\u0002\u0003\u0012c\u0016\u0015\u0010", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 7, tag = 6)
    @InterfaceC1492Gx
    private final long tagged_addr_ctrl;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "\f\u0006\u000b~{\u007f}\u007f\u000b\u0005e\u000e\ti\u000e\u0012\f\u001b", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 4, tag = 9)
    @InterfaceC1492Gx
    private final List<String> unreadable_elf_files;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aSW?X(=\u0012v\t\u0003i(\u0006\r9nU", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aSW?X(=)", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Thread.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Thread>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: Thread$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Thread decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                String strDecode = "";
                long jLongValue = 0;
                long jLongValue2 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Thread(iIntValue, strDecode, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, jLongValue, jLongValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 2:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            arrayList.add(Register.ADAPTER.decode(reader));
                            break;
                        case 4:
                            arrayList4.add(BacktraceFrame.ADAPTER.decode(reader));
                            break;
                        case 5:
                            arrayList5.add(MemoryDump.ADAPTER.decode(reader));
                            break;
                        case 6:
                            jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                            break;
                        case 7:
                            arrayList2.add(ProtoAdapter.STRING.decode(reader));
                            break;
                        case 8:
                            jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                            break;
                        case 9:
                            arrayList3.add(ProtoAdapter.STRING.decode(reader));
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Thread value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getId()));
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getName());
                }
                Register.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getRegisters());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 7, value.getBacktrace_note());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 9, value.getUnreadable_elf_files());
                BacktraceFrame.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getCurrent_backtrace());
                MemoryDump.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.getMemory_dump());
                if (value.getTagged_addr_ctrl() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 6, Long.valueOf(value.getTagged_addr_ctrl()));
                }
                if (value.getPac_enabled_keys() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 8, Long.valueOf(value.getPac_enabled_keys()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Thread value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPac_enabled_keys() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 8, Long.valueOf(value.getPac_enabled_keys()));
                }
                if (value.getTagged_addr_ctrl() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 6, Long.valueOf(value.getTagged_addr_ctrl()));
                }
                MemoryDump.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.getMemory_dump());
                BacktraceFrame.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getCurrent_backtrace());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 9, value.getUnreadable_elf_files());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 7, value.getBacktrace_note());
                Register.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getRegisters());
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getName());
                }
                if (value.getId() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getId()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Thread value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getId()));
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                }
                int iEncodedSizeWithTag = size + Register.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getRegisters()) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, value.getBacktrace_note()) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, value.getUnreadable_elf_files()) + BacktraceFrame.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getCurrent_backtrace()) + MemoryDump.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getMemory_dump());
                if (value.getTagged_addr_ctrl() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT64.encodedSizeWithTag(6, Long.valueOf(value.getTagged_addr_ctrl()));
                }
                return value.getPac_enabled_keys() != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT64.encodedSizeWithTag(8, Long.valueOf(value.getPac_enabled_keys())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Thread redact(Thread value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Thread.copy$default(value, 0, null, Internal.m8724redactElements(value.getRegisters(), Register.ADAPTER), null, null, Internal.m8724redactElements(value.getCurrent_backtrace(), BacktraceFrame.ADAPTER), Internal.m8724redactElements(value.getMemory_dump(), MemoryDump.ADAPTER), 0L, 0L, ByteString.EMPTY, HttpStatus.SC_LENGTH_REQUIRED, null);
            }
        };
    }

    public Thread() {
        this(0, null, null, null, null, null, null, 0L, 0L, null, 1023, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Thread(int i2, String name, List<Register> registers, List<String> backtrace_note, List<String> unreadable_elf_files, List<BacktraceFrame> current_backtrace, List<MemoryDump> memory_dump, long j2, long j3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(registers, "registers");
        Intrinsics.checkNotNullParameter(backtrace_note, "backtrace_note");
        Intrinsics.checkNotNullParameter(unreadable_elf_files, "unreadable_elf_files");
        Intrinsics.checkNotNullParameter(current_backtrace, "current_backtrace");
        Intrinsics.checkNotNullParameter(memory_dump, "memory_dump");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = i2;
        this.name = name;
        this.tagged_addr_ctrl = j2;
        this.pac_enabled_keys = j3;
        this.registers = Internal.immutableCopyOf(SentryStackTrace.JsonKeys.REGISTERS, registers);
        this.backtrace_note = Internal.immutableCopyOf("backtrace_note", backtrace_note);
        this.unreadable_elf_files = Internal.immutableCopyOf("unreadable_elf_files", unreadable_elf_files);
        this.current_backtrace = Internal.immutableCopyOf("current_backtrace", current_backtrace);
        this.memory_dump = Internal.immutableCopyOf("memory_dump", memory_dump);
    }

    public /* synthetic */ Thread(int i2, String str, List list, List list2, List list3, List list4, List list5, long j2, long j3, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 0 : i2, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? "" : str, (i3 + 4) - (i3 | 4) != 0 ? CollectionsKt.emptyList() : list, (i3 & 8) != 0 ? CollectionsKt.emptyList() : list2, (i3 & 16) != 0 ? CollectionsKt.emptyList() : list3, (i3 + 32) - (i3 | 32) != 0 ? CollectionsKt.emptyList() : list4, (i3 + 64) - (i3 | 64) != 0 ? CollectionsKt.emptyList() : list5, (i3 & 128) != 0 ? 0L : j2, (i3 + 256) - (i3 | 256) == 0 ? j3 : 0L, (i3 + 512) - (i3 | 512) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Thread copy$default(Thread thread, int i2, String str, List list, List list2, List list3, List list4, List list5, long j2, long j3, ByteString byteString, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            i2 = thread.id;
        }
        if ((i3 + 2) - (2 | i3) != 0) {
            str = thread.name;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            list = thread.registers;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            list2 = thread.backtrace_note;
        }
        if ((i3 + 16) - (16 | i3) != 0) {
            list3 = thread.unreadable_elf_files;
        }
        if ((i3 + 32) - (32 | i3) != 0) {
            list4 = thread.current_backtrace;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            list5 = thread.memory_dump;
        }
        if ((128 & i3) != 0) {
            j2 = thread.tagged_addr_ctrl;
        }
        if ((256 & i3) != 0) {
            j3 = thread.pac_enabled_keys;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 512)) != 0) {
            byteString = thread.unknownFields();
        }
        return thread.copy(i2, str, list, list2, list3, list4, list5, j2, j3, byteString);
    }

    public final Thread copy(int i2, String name, List<Register> registers, List<String> backtrace_note, List<String> unreadable_elf_files, List<BacktraceFrame> current_backtrace, List<MemoryDump> memory_dump, long j2, long j3, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(registers, "registers");
        Intrinsics.checkNotNullParameter(backtrace_note, "backtrace_note");
        Intrinsics.checkNotNullParameter(unreadable_elf_files, "unreadable_elf_files");
        Intrinsics.checkNotNullParameter(current_backtrace, "current_backtrace");
        Intrinsics.checkNotNullParameter(memory_dump, "memory_dump");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Thread(i2, name, registers, backtrace_note, unreadable_elf_files, current_backtrace, memory_dump, j2, j3, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Thread)) {
            return false;
        }
        Thread thread = (Thread) obj;
        return Intrinsics.areEqual(unknownFields(), thread.unknownFields()) && this.id == thread.id && Intrinsics.areEqual(this.name, thread.name) && Intrinsics.areEqual(this.registers, thread.registers) && Intrinsics.areEqual(this.backtrace_note, thread.backtrace_note) && Intrinsics.areEqual(this.unreadable_elf_files, thread.unreadable_elf_files) && Intrinsics.areEqual(this.current_backtrace, thread.current_backtrace) && Intrinsics.areEqual(this.memory_dump, thread.memory_dump) && this.tagged_addr_ctrl == thread.tagged_addr_ctrl && this.pac_enabled_keys == thread.pac_enabled_keys;
    }

    public final List<String> getBacktrace_note() {
        return this.backtrace_note;
    }

    public final List<BacktraceFrame> getCurrent_backtrace() {
        return this.current_backtrace;
    }

    public final int getId() {
        return this.id;
    }

    public final List<MemoryDump> getMemory_dump() {
        return this.memory_dump;
    }

    public final String getName() {
        return this.name;
    }

    public final long getPac_enabled_keys() {
        return this.pac_enabled_keys;
    }

    public final List<Register> getRegisters() {
        return this.registers;
    }

    public final long getTagged_addr_ctrl() {
        return this.tagged_addr_ctrl;
    }

    public final List<String> getUnreadable_elf_files() {
        return this.unreadable_elf_files;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((((((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.id)) * 37) + this.name.hashCode()) * 37) + this.registers.hashCode()) * 37) + this.backtrace_note.hashCode()) * 37) + this.unreadable_elf_files.hashCode()) * 37) + this.current_backtrace.hashCode()) * 37) + this.memory_dump.hashCode()) * 37) + Long.hashCode(this.tagged_addr_ctrl)) * 37) + Long.hashCode(this.pac_enabled_keys);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m18newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m18newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("id=" + this.id);
        arrayList2.add("name=" + Internal.sanitize(this.name));
        if (!this.registers.isEmpty()) {
            arrayList2.add("registers=" + this.registers);
        }
        if (!this.backtrace_note.isEmpty()) {
            arrayList2.add("backtrace_note=" + Internal.sanitize(this.backtrace_note));
        }
        if (!this.unreadable_elf_files.isEmpty()) {
            arrayList2.add("unreadable_elf_files=" + Internal.sanitize(this.unreadable_elf_files));
        }
        if (!this.current_backtrace.isEmpty()) {
            arrayList2.add("current_backtrace=" + this.current_backtrace);
        }
        if (!this.memory_dump.isEmpty()) {
            arrayList2.add("memory_dump=" + this.memory_dump);
        }
        arrayList2.add("tagged_addr_ctrl=" + this.tagged_addr_ctrl);
        arrayList2.add("pac_enabled_keys=" + this.pac_enabled_keys);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Thread{", "}", 0, null, null, 56, null);
    }
}
