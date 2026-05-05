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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000b<I\u0007Ӭ4\u0012\u0006%njO0L͜P.hS2\u000fq\u0002<$i-yّCU(Ԃ*ޛWNumvϺb\u000bQ\u001b\u000e\u0016~kBկs\u0011\u000e\u001e\u001f4Rom\u074c]qM9\u000ftd\u0004X1:x#\u0015\u0007 *V\u0011\u000fzqM\u001c\u001e6@~=j\u0013]\u0007*\u00124CN\u0005.bmNDN\u0005]h6ݭ\u0007kHV5hx\u0003[\u001b^TU\r=vf<NFM\u0015Sc3\r`lW\u0005Upk\u0017/Ѿ'sO\u0002jNX.([?\u0018\u0013k\b>\\3g' oS]zcP<ߊ(\u0001\u0002\rJ\u0005&\u0006UJ^9 f\u0016\u0011Kz\u0003UPP0cp\u0004+g<\u00173\u0006K+g\"7eo<1Ne};\u0011tň\u0003ͼ%a\\וx\u0017!^\u0006\\\u0002kN@`T\u001a[Mm2u\u0011\u0006`\b\u0007Ϣ\u0002\u009e\u007f\u00176Ϗ=9aE1.Ȧ\u0006a"}, d2 = {"\u001aRc.V2!W'\u000e\u0005k@Y\u00190f\u007f5Q", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "BhS", "", "3mc?\\,L", "", "\u001aRc.V2!W'\u000e\u0005k@Y\u00190f\u007f5[I\u0010$+\u001d", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uI;7T=:\u001d)\u000e~euc\r=tU\u000f\u0006F\u0005!`$\u0004\u001d<d4B]\u0007\"\r1\u0007", "5dc!\\+", "u(9", "5dc\u0012a;KW\u0019\r", "u(;7T=:\u001d)\u000e~euc\r=tU", "<df\u000fh0ER\u0019\f", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class StackHistoryBuffer extends Message {
    public static final ProtoAdapter<StackHistoryBuffer> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "^\u0001nqzXz\u0006\b\u0004\b\u0010Y\u000e\u007f\u0001\u0001\u000fb\r\u0014\u0013\u001bEdhfv{m{", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final List<StackHistoryBufferEntry> entries;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final long tid;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aRc.V2!W'\u000e\u0005k@Y\u00190f\u007f5:\u001e\u000b\u001f\"Cx\u0012F\u007fz", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aRc.V2!W'\u000e\u0005k@Y\u00190f\u007f5Q", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StackHistoryBuffer.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StackHistoryBuffer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: StackHistoryBuffer$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StackHistoryBuffer decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StackHistoryBuffer(jLongValue, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        arrayList.add(StackHistoryBufferEntry.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StackHistoryBuffer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTid() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getTid()));
                }
                StackHistoryBufferEntry.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getEntries());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StackHistoryBuffer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                StackHistoryBufferEntry.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getEntries());
                if (value.getTid() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getTid()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StackHistoryBuffer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTid() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(value.getTid()));
                }
                return size + StackHistoryBufferEntry.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getEntries());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StackHistoryBuffer redact(StackHistoryBuffer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StackHistoryBuffer.copy$default(value, 0L, Internal.m8724redactElements(value.getEntries(), StackHistoryBufferEntry.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }

    public StackHistoryBuffer() {
        this(0L, null, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackHistoryBuffer(long j2, List<StackHistoryBufferEntry> entries, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.tid = j2;
        this.entries = Internal.immutableCopyOf("entries", entries);
    }

    public /* synthetic */ StackHistoryBuffer(long j2, List list, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? 0L : j2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? CollectionsKt.emptyList() : list, (i2 + 4) - (i2 | 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StackHistoryBuffer copy$default(StackHistoryBuffer stackHistoryBuffer, long j2, List list, ByteString byteString, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j2 = stackHistoryBuffer.tid;
        }
        if ((2 & i2) != 0) {
            list = stackHistoryBuffer.entries;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            byteString = stackHistoryBuffer.unknownFields();
        }
        return stackHistoryBuffer.copy(j2, list, byteString);
    }

    public final StackHistoryBuffer copy(long j2, List<StackHistoryBufferEntry> entries, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StackHistoryBuffer(j2, entries, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StackHistoryBuffer)) {
            return false;
        }
        StackHistoryBuffer stackHistoryBuffer = (StackHistoryBuffer) obj;
        return Intrinsics.areEqual(unknownFields(), stackHistoryBuffer.unknownFields()) && this.tid == stackHistoryBuffer.tid && Intrinsics.areEqual(this.entries, stackHistoryBuffer.entries);
    }

    public final List<StackHistoryBufferEntry> getEntries() {
        return this.entries;
    }

    public final long getTid() {
        return this.tid;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Long.hashCode(this.tid)) * 37) + this.entries.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m16newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m16newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("tid=" + this.tid);
        if (!this.entries.isEmpty()) {
            arrayList2.add("entries=" + this.entries);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StackHistoryBuffer{", "}", 0, null, null, 56, null);
    }
}
