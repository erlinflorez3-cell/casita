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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000b<I\u0007\"2\u0013\u007f\u0007t\tA0ZeP.XT2\u000f\u0002{<$a.yCI^\"Ԃ*\t]Ȟo˧vJh\u0011KƤ\u000e\u0016\u0007v4I[ys܈-Rr{O5]okʠpvF\u0005N2P72\u0004!Z\u0002X\u0016|zQL$\u0012^B\u0001@X\r[\b2\u00124@0\u0007$\\uRNH\u001b_J;)\u0003wGf-o2\rM;M\u0003-\u001d|g\u001e9HO5C'c\u000f\rRiH\u001bE\u0002?\u0015hU.YO\u0004]<X\u000e\u001e-+}\u0018ǁv(b\u0011_mT-9e{K~\u000en\rC\r\u001bS\u001c\u000e4?x4;3~\n$2#\r\u001aĊPJdP\u001b\u0013ad3k\u0014{1G8~Q\u0010Y_b\u007fR\u0013,6#/͙QaZ\u000en\u00163T&SaWF=VQ\"Yko4vh\u00028\bHG.1,\u001d4\u00173<s?3#{\u0002vK\u0016|5fnSwZ`@PpFC0\t\u001ac\\j\u0015m`T\u00073?SLZ\r}\u0016\u001d8\\&Gq9\u001eOgh\u0018l\u0004a`ɠ1Ϭ;_v\u0088&Y?lAD\"w\u001edjvBArf[֢h͞W\u0012b٢@$8Xx\u001fH\u0010RR$\u0013`A( \u000bρ3Ǭ`\u001bPґ6DG\u000e\u0017n+|\u001e\u0007l3R\u0005 (Kկ\u0003˩`vwΟ\u0011K2\u000fn1}[_:1,e$x4+*5\u0005*\u0004\u001eэNܤPr\u001e߯m}&)(M\"IK\u001c'\u000594\u0012-sS!k\bQh\u0605|܃}\u0015CÜFi\u000e\u007f~@ߵnk"}, d2 = {"\u001aGT.c\u0016;X\u0019|\n4", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "/cS?X:L", "", "Ahi2", "/k[<V(MW#\btm0{", "/k[<V(MW#\bt[(z\u000f>r{&{", "", "\u001aAP0^;KO\u0017~[k(\u0005\t\u0005", "2dP9_6<O(\u0003\u0005g&\f\r.", "2dP9_6<O(\u0003\u0005g&y\u0005-k\u000f5w>\u0001", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uI9\u0017?1:d\u0015H\u000bm0\u0004R\u0016i\u000e7Q%g\u001c\u0013XkWL\u0006)<#d$E|k\u0015WI?u}z)wa'\u0016p0Wx|\u000b=", "5dc\u000eW+KS'\r", "u(9", "5dc \\A>", "5dc\u000e_3HQ\u0015\u000e~h5v\u00183d", "5dc\u0011X(EZ#|vm0\u0007\u0012)t\u0004'", "5dc\u000e_3HQ\u0015\u000e~h5v\u0006+c\u00067\t<~\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0011X(EZ#|vm0\u0007\u0012)b{&\u0002O\u000e\u0013\u0015G", "<df\u000fh0ER\u0019\f", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class HeapObject extends Message {
    public static final ProtoAdapter<HeapObject> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final long address;

    @WireField(adapter = "Mmpy\u0004\u0003ruxZ\bw\u0005}<[_]mrdr", declaredName = "", jsonName = "w\u0004\u0005\t}|\u0011\u0007\u000e\u000eb\u0003\u0006\u000f\u0019\u0018\b\u000b\u000e", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 3, tag = 4)
    @InterfaceC1492Gx
    private final List<BacktraceFrame> allocation_backtrace;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "w\u0004\u0005\t}|\u0011\u0007\u000e\u000et\u000b\u0007", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 2, tag = 3)
    @InterfaceC1492Gx
    private final long allocation_tid;

    @WireField(adapter = "Mmpy\u0004\u0003ruxZ\bw\u0005}<[_]mrdr", declaredName = "", jsonName = "z|y\u0006\u0007\u000b\u007f~\u0013\t\u0010\u0010d\u0005\b\u0011\u001b\u001a\n\r\u0010", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 5, tag = 6)
    @InterfaceC1492Gx
    private final List<BacktraceFrame> deallocation_backtrace;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "z|y\u0006\u0007\u000b\u007f~\u0013\t\u0010\u0010v\r\t", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 4, tag = 5)
    @InterfaceC1492Gx
    private final long deallocation_tid;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final long size;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aGT.c\u0016;X\u0019|\n\u001d\n\u0007\u0011:a\t,\u0006IV", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aGT.c\u0016;X\u0019|\n4", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HeapObject.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<HeapObject>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: HeapObject$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public HeapObject decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                long jLongValue2 = 0;
                long jLongValue3 = 0;
                long jLongValue4 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new HeapObject(jLongValue, jLongValue2, jLongValue3, arrayList, jLongValue4, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
                            arrayList.add(BacktraceFrame.ADAPTER.decode(reader));
                            break;
                        case 5:
                            jLongValue4 = ProtoAdapter.UINT64.decode(reader).longValue();
                            break;
                        case 6:
                            arrayList2.add(BacktraceFrame.ADAPTER.decode(reader));
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HeapObject value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAddress() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getAddress()));
                }
                if (value.getSize() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getSize()));
                }
                if (value.getAllocation_tid() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getAllocation_tid()));
                }
                BacktraceFrame.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getAllocation_backtrace());
                if (value.getDeallocation_tid() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 5, Long.valueOf(value.getDeallocation_tid()));
                }
                BacktraceFrame.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.getDeallocation_backtrace());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HeapObject value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BacktraceFrame.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.getDeallocation_backtrace());
                if (value.getDeallocation_tid() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 5, Long.valueOf(value.getDeallocation_tid()));
                }
                BacktraceFrame.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getAllocation_backtrace());
                if (value.getAllocation_tid() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getAllocation_tid()));
                }
                if (value.getSize() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getSize()));
                }
                if (value.getAddress() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getAddress()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HeapObject value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAddress() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(value.getAddress()));
                }
                if (value.getSize() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getSize()));
                }
                if (value.getAllocation_tid() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getAllocation_tid()));
                }
                int iEncodedSizeWithTag = size + BacktraceFrame.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getAllocation_backtrace());
                if (value.getDeallocation_tid() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.UINT64.encodedSizeWithTag(5, Long.valueOf(value.getDeallocation_tid()));
                }
                return iEncodedSizeWithTag + BacktraceFrame.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getDeallocation_backtrace());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HeapObject redact(HeapObject value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return HeapObject.copy$default(value, 0L, 0L, 0L, Internal.m8724redactElements(value.getAllocation_backtrace(), BacktraceFrame.ADAPTER), 0L, Internal.m8724redactElements(value.getDeallocation_backtrace(), BacktraceFrame.ADAPTER), ByteString.EMPTY, 23, null);
            }
        };
    }

    public HeapObject() {
        this(0L, 0L, 0L, null, 0L, null, null, 127, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeapObject(long j2, long j3, long j4, List<BacktraceFrame> allocation_backtrace, long j5, List<BacktraceFrame> deallocation_backtrace, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(allocation_backtrace, "allocation_backtrace");
        Intrinsics.checkNotNullParameter(deallocation_backtrace, "deallocation_backtrace");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.address = j2;
        this.size = j3;
        this.allocation_tid = j4;
        this.deallocation_tid = j5;
        this.allocation_backtrace = Internal.immutableCopyOf("allocation_backtrace", allocation_backtrace);
        this.deallocation_backtrace = Internal.immutableCopyOf("deallocation_backtrace", deallocation_backtrace);
    }

    public /* synthetic */ HeapObject(long j2, long j3, long j4, List list, long j5, List list2, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? 0L : j2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? 0L : j3, (i2 + 4) - (i2 | 4) != 0 ? 0L : j4, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? CollectionsKt.emptyList() : list, (-1) - (((-1) - i2) | ((-1) - 16)) == 0 ? j5 : 0L, (i2 + 32) - (i2 | 32) != 0 ? CollectionsKt.emptyList() : list2, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeapObject copy$default(HeapObject heapObject, long j2, long j3, long j4, List list, long j5, List list2, ByteString byteString, int i2, Object obj) {
        if ((1 & i2) != 0) {
            j2 = heapObject.address;
        }
        if ((2 & i2) != 0) {
            j3 = heapObject.size;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            j4 = heapObject.allocation_tid;
        }
        if ((8 & i2) != 0) {
            list = heapObject.allocation_backtrace;
        }
        if ((16 & i2) != 0) {
            j5 = heapObject.deallocation_tid;
        }
        if ((32 & i2) != 0) {
            list2 = heapObject.deallocation_backtrace;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            byteString = heapObject.unknownFields();
        }
        return heapObject.copy(j2, j3, j4, list, j5, list2, byteString);
    }

    public final HeapObject copy(long j2, long j3, long j4, List<BacktraceFrame> allocation_backtrace, long j5, List<BacktraceFrame> deallocation_backtrace, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(allocation_backtrace, "allocation_backtrace");
        Intrinsics.checkNotNullParameter(deallocation_backtrace, "deallocation_backtrace");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new HeapObject(j2, j3, j4, allocation_backtrace, j5, deallocation_backtrace, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeapObject)) {
            return false;
        }
        HeapObject heapObject = (HeapObject) obj;
        return Intrinsics.areEqual(unknownFields(), heapObject.unknownFields()) && this.address == heapObject.address && this.size == heapObject.size && this.allocation_tid == heapObject.allocation_tid && Intrinsics.areEqual(this.allocation_backtrace, heapObject.allocation_backtrace) && this.deallocation_tid == heapObject.deallocation_tid && Intrinsics.areEqual(this.deallocation_backtrace, heapObject.deallocation_backtrace);
    }

    public final long getAddress() {
        return this.address;
    }

    public final List<BacktraceFrame> getAllocation_backtrace() {
        return this.allocation_backtrace;
    }

    public final long getAllocation_tid() {
        return this.allocation_tid;
    }

    public final List<BacktraceFrame> getDeallocation_backtrace() {
        return this.deallocation_backtrace;
    }

    public final long getDeallocation_tid() {
        return this.deallocation_tid;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.address)) * 37) + Long.hashCode(this.size)) * 37) + Long.hashCode(this.allocation_tid)) * 37) + this.allocation_backtrace.hashCode()) * 37) + Long.hashCode(this.deallocation_tid)) * 37) + this.deallocation_backtrace.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder */
    public /* synthetic */ Void m8newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("address=" + this.address);
        arrayList2.add("size=" + this.size);
        arrayList2.add("allocation_tid=" + this.allocation_tid);
        if (!this.allocation_backtrace.isEmpty()) {
            arrayList2.add("allocation_backtrace=" + this.allocation_backtrace);
        }
        arrayList2.add("deallocation_tid=" + this.deallocation_tid);
        if (!this.deallocation_backtrace.isEmpty()) {
            arrayList2.add("deallocation_backtrace=" + this.deallocation_backtrace);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HeapObject{", "}", 0, null, null, 56, null);
    }
}
