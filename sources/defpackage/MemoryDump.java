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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000b<N\u0007\"2\u0012\u007f\u0007tqAӄLe^.Zݷ2\u000f\u0002{<$a0yCI^\"Ԃ*\t]Ȟo˧vJh\u0011K\u000f\f\u0018\u000f̓Jh\u0006\u0005m\u0014\u001f2pģO5]ok9\u000fsn\u0004?reH\u007f\u000b\u0001(+`\u0010%|SQ\u0012\u0012>C\t:\u0001\u000f]\u000b \u0012\u0014B8\u0001LawT<HzcR/Q\nyJT'm8\u0015O#E\u00030\u001d|g\u001e9JO5C,٨\u0007\tXfM\u000f\bwK\u001b\u0001'U+\u0010\t Gf\u0017,\u0015Yg=c\u0001?t\u0007g_:Aqթc\u0014V\u001cC\u0010z*)\u0003\u0018V\f5eF-HhN\"{7\u0001qXP0މr\u0006\u0001aD\u0018=\u007fa-i!lQo>1Ne}5\u0013$#\u000fr9[\u0003\u0013\u0011\u001b!T\u0006WIQnDxV\u0010YKu\u001crx\u0001X\r`M\u0006/\n\u001bF\u0017S>,M1\"\u0004\u0002vF\u001ez[£jרmXPؗ:p\u001cD8\u0017\\nRg\u001dk~V\u000f0gۻ\u001eΤ\u000b\u0004\u0010ʶ8^}K/3`b]l\u0002j{b@)\u0006ϑ9֍rq\u0016ãQ`9E_t`u`|,?ji;\\=̓U۱^b0ίJJp\"\u0006\u000f\u0015d\u001a\u001bJA\b\u001bb5g\u001d3ñJҴ\"HIґ!a`|\u001e\u0014Շ7D"}, d2 = {"\u001aLT:b9R2)\u0007\u00064", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "@dV6f;>`\u0013\bvf,", "", ";`_=\\5@M\"z\u0003^", "0dV6a&:R\u0018\fzl:", "", ";d\\<e@", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "/q\\,`;>M!~\nZ+x\u0018+", "\u001a@a:@\u001b\u001e;\u0019\u000ev](\f\u0005\u0005", "CmZ;b>G4\u001d~\u0002]:", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u00134MAo>gq|p9tr9R\u007f)\u001d3*9d:a\u001d{\u0012i\nM'\u001c\u0001/(.tHAhd@X\u0002)w\u000e\u0010\u001f\u0010\u000b.a", "5dc\u001fX.Ba(~\bX5x\u0011/", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001aT7IW\"\u0001tg(\u0005\t", "5dc\u000fX.B\\\u0013zy]9|\u0017=", "u(9", "5dc\u001aX4H`-", "u(;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}", "5dc\u000ee48[(~tf,\f\u0005.a\u000f$", "u(;\u000ee4&Bxfzm({\u0005>aU", "<df\u000fh0ER\u0019\f", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class MemoryDump extends Message {
    public static final ProtoAdapter<MemoryDump> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "L~z[cU^w\buyw\fy<[_]mrdr", declaredName = "", jsonName = "w\n\u0006f\u000f\u0001i\u0003\u0013\u0001\u0005\u0003\u0017\u0005", keyAdapter = "", oneofName = "6/?-1/C1", schemaIndex = 4, tag = 6)
    @InterfaceC1492Gx
    private final ArmMTEMetadata arm_mte_metadata;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "x|\u007f\u0003\t\\\u0001\u0002\u0011\u0005\u0014\u0015", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 2, tag = 3)
    @InterfaceC1492Gx
    private final long begin_address;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "\u0004x\t\n\u0004\n\u0004k\u007f\r\u0006", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final String mapping_name;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLl\u0005\u0001r\u0002", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 3, tag = 4)
    @InterfaceC1492Gx
    private final ByteString memory;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "\t|\u007f\u0003\u000e\u0010\u0002\u0010l\u0001\u000e\u0007", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final String register_name;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aLT:b9R2)\u0007\u0006\u001d\n\u0007\u0011:a\t,\u0006IV", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aLT:b9R2)\u0007\u00064", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MemoryDump.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MemoryDump>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: MemoryDump$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MemoryDump decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteStringDecode = ByteString.EMPTY;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                long jLongValue = 0;
                ArmMTEMetadata armMTEMetadataDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MemoryDump(strDecode, strDecode2, jLongValue, byteStringDecode, armMTEMetadataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                    } else if (iNextTag == 4) {
                        byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                    } else if (iNextTag != 6) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        armMTEMetadataDecode = ArmMTEMetadata.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MemoryDump value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRegister_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getRegister_name());
                }
                if (!Intrinsics.areEqual(value.getMapping_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getMapping_name());
                }
                if (value.getBegin_address() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getBegin_address()));
                }
                if (!Intrinsics.areEqual(value.getMemory(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.getMemory());
                }
                ArmMTEMetadata.ADAPTER.encodeWithTag(writer, 6, value.getArm_mte_metadata());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MemoryDump value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ArmMTEMetadata.ADAPTER.encodeWithTag(writer, 6, value.getArm_mte_metadata());
                if (!Intrinsics.areEqual(value.getMemory(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.getMemory());
                }
                if (value.getBegin_address() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getBegin_address()));
                }
                if (!Intrinsics.areEqual(value.getMapping_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getMapping_name());
                }
                if (Intrinsics.areEqual(value.getRegister_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getRegister_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MemoryDump value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRegister_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRegister_name());
                }
                if (!Intrinsics.areEqual(value.getMapping_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMapping_name());
                }
                if (value.getBegin_address() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getBegin_address()));
                }
                if (!Intrinsics.areEqual(value.getMemory(), ByteString.EMPTY)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(4, value.getMemory());
                }
                return size + ArmMTEMetadata.ADAPTER.encodedSizeWithTag(6, value.getArm_mte_metadata());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MemoryDump redact(MemoryDump value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ArmMTEMetadata arm_mte_metadata = value.getArm_mte_metadata();
                return MemoryDump.copy$default(value, null, null, 0L, null, arm_mte_metadata != null ? ArmMTEMetadata.ADAPTER.redact(arm_mte_metadata) : null, ByteString.EMPTY, 15, null);
            }
        };
    }

    public MemoryDump() {
        this(null, null, 0L, null, null, null, 63, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryDump(String register_name, String mapping_name, long j2, ByteString memory, ArmMTEMetadata armMTEMetadata, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(register_name, "register_name");
        Intrinsics.checkNotNullParameter(mapping_name, "mapping_name");
        Intrinsics.checkNotNullParameter(memory, "memory");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.register_name = register_name;
        this.mapping_name = mapping_name;
        this.begin_address = j2;
        this.memory = memory;
        this.arm_mte_metadata = armMTEMetadata;
    }

    public /* synthetic */ MemoryDump(String str, String str2, long j2, ByteString byteString, ArmMTEMetadata armMTEMetadata, ByteString byteString2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 + 4) - (i2 | 4) != 0 ? 0L : j2, (i2 + 8) - (i2 | 8) != 0 ? ByteString.EMPTY : byteString, (i2 + 16) - (i2 | 16) != 0 ? null : armMTEMetadata, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? ByteString.EMPTY : byteString2);
    }

    public static /* synthetic */ MemoryDump copy$default(MemoryDump memoryDump, String str, String str2, long j2, ByteString byteString, ArmMTEMetadata armMTEMetadata, ByteString byteString2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = memoryDump.register_name;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            str2 = memoryDump.mapping_name;
        }
        if ((4 & i2) != 0) {
            j2 = memoryDump.begin_address;
        }
        if ((8 & i2) != 0) {
            byteString = memoryDump.memory;
        }
        if ((16 & i2) != 0) {
            armMTEMetadata = memoryDump.arm_mte_metadata;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            byteString2 = memoryDump.unknownFields();
        }
        return memoryDump.copy(str, str2, j2, byteString, armMTEMetadata, byteString2);
    }

    public final MemoryDump copy(String register_name, String mapping_name, long j2, ByteString memory, ArmMTEMetadata armMTEMetadata, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(register_name, "register_name");
        Intrinsics.checkNotNullParameter(mapping_name, "mapping_name");
        Intrinsics.checkNotNullParameter(memory, "memory");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MemoryDump(register_name, mapping_name, j2, memory, armMTEMetadata, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemoryDump)) {
            return false;
        }
        MemoryDump memoryDump = (MemoryDump) obj;
        return Intrinsics.areEqual(unknownFields(), memoryDump.unknownFields()) && Intrinsics.areEqual(this.register_name, memoryDump.register_name) && Intrinsics.areEqual(this.mapping_name, memoryDump.mapping_name) && this.begin_address == memoryDump.begin_address && Intrinsics.areEqual(this.memory, memoryDump.memory) && Intrinsics.areEqual(this.arm_mte_metadata, memoryDump.arm_mte_metadata);
    }

    public final ArmMTEMetadata getArm_mte_metadata() {
        return this.arm_mte_metadata;
    }

    public final long getBegin_address() {
        return this.begin_address;
    }

    public final String getMapping_name() {
        return this.mapping_name;
    }

    public final ByteString getMemory() {
        return this.memory;
    }

    public final String getRegister_name() {
        return this.register_name;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.register_name.hashCode()) * 37) + this.mapping_name.hashCode()) * 37) + Long.hashCode(this.begin_address)) * 37) + this.memory.hashCode()) * 37;
        ArmMTEMetadata armMTEMetadata = this.arm_mte_metadata;
        int iHashCode2 = iHashCode + (armMTEMetadata != null ? armMTEMetadata.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m11newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m11newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("register_name=" + Internal.sanitize(this.register_name));
        arrayList2.add("mapping_name=" + Internal.sanitize(this.mapping_name));
        arrayList2.add("begin_address=" + this.begin_address);
        arrayList2.add("memory=" + this.memory);
        if (this.arm_mte_metadata != null) {
            arrayList2.add("arm_mte_metadata=" + this.arm_mte_metadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MemoryDump{", "}", 0, null, null, 56, null);
    }
}
