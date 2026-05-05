package defpackage;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import defpackage.MemoryError;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:,c$\u007fLC٥\"}0ޛWȞog|PbŏK\u000f\u0014\"\u0001j2Lkތ{-?>RqO3{ڎM;ptd\u0005N1Z9\u0015!\u001eZYX\u0016|zQL$\u0012^B\u0001@X\r[\b2\u00124B0\t$\\uSNJ\u0003\\h53\toB\\.w0+UϘJV-\u0016\u0005kf1NHM\u0015SSI\u001c\u001blM\u0015Wqk\u0018\u0019-5?aum5\u0007\u0015Zƚ+\u0018\u0013k\t>\\3h' o1]{cP<A>\u000fD;J\u001e&\u0006UΞ^3 f\u0016\u000fKt!UpV\b^P\u0003\u0013ad\u001bU\b9+G ~Sw:GTg\u0002\u000b\r,*\u0019nOc%\"n\u00163T&SgU\u0017\u05c8Jݳ\u000e_EЧ\u001crh\r8\u0010\u0001[\u000e2\u0014\u0011\\\u001b[;2ޅ%\u074co\bPֳ\u007fx\u000bmva:hVE:p,6X\u000fB^\u001bߧ\u0007\u07fbTZ`\u008c)O\"c\u0015\u000eݚ\u0017>"}, d2 = {"\u001aLT:b9R3&\f\u0005k\u0002", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "Bn^9", "\u001aLT:b9R3&\f\u0005kjk\u00139lU", "Bx_2", "\u001aLT:b9R3&\f\u0005kjk\u001d:eU", "6dP=", "\u001aGT.c\u0016;X\u0019|\n4", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uK<2`6Kgx\f\bh9;w9o\u0007}b(\u0001\u001f!T\u0004mI\u0004/B\u0018l4Bmk\u00150C7v\u001e\u001b\u001ah_H\\J6Tz1\u0011)b;\\@\u0002J\u0018\u001b\\c\u0012\u001c", "5dc!b6E", "u(;\u001aX4H`-^\bk6\nG\u001eo\n/Q", "5dc!l7>", "u(;\u001aX4H`-^\bk6\nG\u001ey\u000b(Q", "5dc\u0015X(I", "u(;\u0015X(I=\u0016\u0004z\\;R", "<df\u000fh0ER\u0019\f", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n_F", "\u0011n\\=T5B]\"", "\"n^9", "\"x_2", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class MemoryError extends Message {
    public static final ProtoAdapter<MemoryError> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "Sqn~^r{wv\t8W[Yin`n", declaredName = "", jsonName = "", keyAdapter = "", oneofName = "59.-A7>>", schemaIndex = 2, tag = 3)
    @InterfaceC1492Gx
    private final HeapObject heap;

    @WireField(adapter = "Xqz}\u0002\nV\u0005\u0006\u0004\b:k\b\t\u0007>]a_otft", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final Tool tool;

    @WireField(adapter = "Xqz}\u0002\nV\u0005\u0006\u0004\b:k\u0012\n\u007f>]a_otft", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final Type type;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aLT:b9R3&\f\u0005kjZ\u00137p{1\u007fJ\nl", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aLT:b9R3&\f\u0005k\u0002", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLc\u0003\u0012Iي8\u000b<H\u0007\"2\u0018}џ\u0080jOӄbnx.\u0001RZ\u0015{}D$\nҕ CsT#>1\u000fO^kuobZ9EǇ\n\u0018~m:M&\u000bk\u0013'2pq\u0016ݣOڱA?hҚN\u0007&70>b\u0005\u0007!\u0013H\u0016~ڂGU"}, d2 = {"\u001aLT:b9R3&\f\u0005kjk\u00139lU", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017vP\u007f\u0016\u0012", "", "D`[BX", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc#T3NS", "u(8", "\u0015V?,4\u001a\u001a<", "!BD\u0011B", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Tool implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Tool[] $VALUES;
        public static final ProtoAdapter<Tool> ADAPTER;
        public static final Companion Companion;
        public static final Tool GWP_ASAN;
        public static final Tool SCUDO;
        private final int value;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4\u0012}\u0007njG6L͜N\u0093Siճ?k*3db*qٴ?W }0\n\u0018^ul\u0007Lp\nq\u00136\u001a\u0007pDI\u0004\u007f$\u0017_FPqW9]qM9\u000fxd\bV6x؈{ڱ\u0005\u001a2ϺǞz\u0003"}, d2 = {"\u001aLT:b9R3&\f\u0005kjk\u00139l>\u0006\u0006H\f\u0013 Ky\u0017\u0012", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aLT:b9R3&\f\u0005kjk\u00139lU", "4q^:I(Ec\u0019", "D`[BX", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final Tool fromValue(int i2) {
                if (i2 == 0) {
                    return Tool.GWP_ASAN;
                }
                if (i2 != 1) {
                    return null;
                }
                return Tool.SCUDO;
            }
        }

        private static final /* synthetic */ Tool[] $values() {
            return new Tool[]{GWP_ASAN, SCUDO};
        }

        static {
            final Tool tool = new Tool("GWP_ASAN", 0, 0);
            GWP_ASAN = tool;
            SCUDO = new Tool("SCUDO", 1, 1);
            Tool[] toolArr$values = $values();
            $VALUES = toolArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(toolArr$values);
            Companion = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Tool.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Tool>(orCreateKotlinClass, syntax, tool) { // from class: MemoryError$Tool$Companion$ADAPTER$1
                {
                    MemoryError.Tool tool2 = tool;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public MemoryError.Tool fromValue(int i2) {
                    return MemoryError.Tool.Companion.fromValue(i2);
                }
            };
        }

        private Tool(String str, int i2, int i3) {
            this.value = i3;
        }

        @JvmStatic
        public static final Tool fromValue(int i2) {
            return Companion.fromValue(i2);
        }

        public static EnumEntries<Tool> getEntries() {
            return $ENTRIES;
        }

        public static Tool valueOf(String str) {
            return (Tool) Enum.valueOf(Tool.class, str);
        }

        public static Tool[] values() {
            return (Tool[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLc\u0003\u0012Iي8\u000b<H\u0007\"2\u001c}џ\u0080jOӄbrx.\u0001RZ\u0015{}D$\nҕ CsT'>1\u000fO^kuobZ9EǇ\n\u0018~m:M&\u000bk\u0013'2pq\u0016ݣOڱA?hҚN\u0007&70>b\u0005\u0007!\u0013H\u0016~cCQ\u0015z0Fz#R\u0013Xm\u001a\u0018\u0012̭$\u000f"}, d2 = {"\u001aLT:b9R3&\f\u0005kjk\u001d:eU", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017vP\u007f\u0016\u0012", "", "D`[BX", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc#T3NS", "u(8", "#M:\u001bB\u001e'", "#R4,4\r-3\u0006x[K\f\\", "\u0012ND\u000f?\f84\u0006^Z", "\u0017ME\u000e?\u0010\u001dMykZ>", "\u0010T5\u00138\u00198=\n^g?\u0013fz", "\u0010T5\u00138\u00198C\u0002]ZK\rcr!", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final ProtoAdapter<Type> ADAPTER;
        public static final Type BUFFER_OVERFLOW;
        public static final Type BUFFER_UNDERFLOW;
        public static final Companion Companion;
        public static final Type DOUBLE_FREE;
        public static final Type INVALID_FREE;
        public static final Type UNKNOWN;
        public static final Type USE_AFTER_FREE;
        private final int value;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4\u0012}\u0007njG6L͜N\u0093Siճ?k*3db*qٴ?W }0\n\u0018^ul\u0007Lp\nq\u00136\u001a\u0007pDI\u0004\u007f$\u0017_FPqW9]qM9\u000fxd\bV6x؈{ڱ\u0005\u001a2ϺǞz\u0003"}, d2 = {"\u001aLT:b9R3&\f\u0005kjk\u001d:e>\u0006\u0006H\f\u0013 Ky\u0017\u0012", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aLT:b9R3&\f\u0005kjk\u001d:eU", "4q^:I(Ec\u0019", "D`[BX", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final Type fromValue(int i2) {
                if (i2 == 0) {
                    return Type.UNKNOWN;
                }
                if (i2 == 1) {
                    return Type.USE_AFTER_FREE;
                }
                if (i2 == 2) {
                    return Type.DOUBLE_FREE;
                }
                if (i2 == 3) {
                    return Type.INVALID_FREE;
                }
                if (i2 == 4) {
                    return Type.BUFFER_OVERFLOW;
                }
                if (i2 != 5) {
                    return null;
                }
                return Type.BUFFER_UNDERFLOW;
            }
        }

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{UNKNOWN, USE_AFTER_FREE, DOUBLE_FREE, INVALID_FREE, BUFFER_OVERFLOW, BUFFER_UNDERFLOW};
        }

        static {
            final Type type = new Type("UNKNOWN", 0, 0);
            UNKNOWN = type;
            USE_AFTER_FREE = new Type("USE_AFTER_FREE", 1, 1);
            DOUBLE_FREE = new Type("DOUBLE_FREE", 2, 2);
            INVALID_FREE = new Type("INVALID_FREE", 3, 3);
            BUFFER_OVERFLOW = new Type("BUFFER_OVERFLOW", 4, 4);
            BUFFER_UNDERFLOW = new Type("BUFFER_UNDERFLOW", 5, 5);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
            Companion = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type) { // from class: MemoryError$Type$Companion$ADAPTER$1
                {
                    MemoryError.Type type2 = type;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public MemoryError.Type fromValue(int i2) {
                    return MemoryError.Type.Companion.fromValue(i2);
                }
            };
        }

        private Type(String str, int i2, int i3) {
            this.value = i3;
        }

        @JvmStatic
        public static final Type fromValue(int i2) {
            return Companion.fromValue(i2);
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MemoryError.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MemoryError>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: MemoryError$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MemoryError decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MemoryError.Tool toolDecode = MemoryError.Tool.GWP_ASAN;
                MemoryError.Type typeDecode = MemoryError.Type.UNKNOWN;
                long jBeginMessage = reader.beginMessage();
                HeapObject heapObjectDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MemoryError(toolDecode, typeDecode, heapObjectDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            toolDecode = MemoryError.Tool.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            typeDecode = MemoryError.Type.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    } else if (iNextTag != 3) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        heapObjectDecode = HeapObject.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MemoryError value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTool() != MemoryError.Tool.GWP_ASAN) {
                    MemoryError.Tool.ADAPTER.encodeWithTag(writer, 1, value.getTool());
                }
                if (value.getType() != MemoryError.Type.UNKNOWN) {
                    MemoryError.Type.ADAPTER.encodeWithTag(writer, 2, value.getType());
                }
                HeapObject.ADAPTER.encodeWithTag(writer, 3, value.getHeap());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MemoryError value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                HeapObject.ADAPTER.encodeWithTag(writer, 3, value.getHeap());
                if (value.getType() != MemoryError.Type.UNKNOWN) {
                    MemoryError.Type.ADAPTER.encodeWithTag(writer, 2, value.getType());
                }
                if (value.getTool() != MemoryError.Tool.GWP_ASAN) {
                    MemoryError.Tool.ADAPTER.encodeWithTag(writer, 1, value.getTool());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MemoryError value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTool() != MemoryError.Tool.GWP_ASAN) {
                    size += MemoryError.Tool.ADAPTER.encodedSizeWithTag(1, value.getTool());
                }
                if (value.getType() != MemoryError.Type.UNKNOWN) {
                    size += MemoryError.Type.ADAPTER.encodedSizeWithTag(2, value.getType());
                }
                return size + HeapObject.ADAPTER.encodedSizeWithTag(3, value.getHeap());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MemoryError redact(MemoryError value) {
                Intrinsics.checkNotNullParameter(value, "value");
                HeapObject heap = value.getHeap();
                return MemoryError.copy$default(value, null, null, heap != null ? HeapObject.ADAPTER.redact(heap) : null, ByteString.EMPTY, 3, null);
            }
        };
    }

    public MemoryError() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryError(Tool tool, Type type, HeapObject heapObject, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(tool, "tool");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.tool = tool;
        this.type = type;
        this.heap = heapObject;
    }

    public /* synthetic */ MemoryError(Tool tool, Type type, HeapObject heapObject, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i2) != 0 ? Tool.GWP_ASAN : tool, (i2 + 2) - (2 | i2) != 0 ? Type.UNKNOWN : type, (4 & i2) != 0 ? null : heapObject, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public static /* synthetic */ MemoryError copy$default(MemoryError memoryError, Tool tool, Type type, HeapObject heapObject, ByteString byteString, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            tool = memoryError.tool;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            type = memoryError.type;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            heapObject = memoryError.heap;
        }
        if ((i2 & 8) != 0) {
            byteString = memoryError.unknownFields();
        }
        return memoryError.copy(tool, type, heapObject, byteString);
    }

    public final MemoryError copy(Tool tool, Type type, HeapObject heapObject, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(tool, "tool");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MemoryError(tool, type, heapObject, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemoryError)) {
            return false;
        }
        MemoryError memoryError = (MemoryError) obj;
        return Intrinsics.areEqual(unknownFields(), memoryError.unknownFields()) && this.tool == memoryError.tool && this.type == memoryError.type && Intrinsics.areEqual(this.heap, memoryError.heap);
    }

    public final HeapObject getHeap() {
        return this.heap;
    }

    public final Tool getTool() {
        return this.tool;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.tool.hashCode()) * 37) + this.type.hashCode()) * 37;
        HeapObject heapObject = this.heap;
        int iHashCode2 = iHashCode + (heapObject != null ? heapObject.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m12newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m12newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("tool=" + this.tool);
        arrayList2.add("type=" + this.type);
        if (this.heap != null) {
            arrayList2.add("heap=" + this.heap);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MemoryError{", "}", 0, null, null, 56, null);
    }
}
