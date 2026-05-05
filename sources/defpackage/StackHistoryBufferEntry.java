package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u000enj?0Le^.ZS0\u0016s{B-cҕyCI٥\"Ԃ*\t]To˧vJh\u0017K\u000f\f\u0017\u000f̓Jb\u0006\u0005m\u0014\u001f2pģO5]ok9\u000fsn\u00049rQH\u0002\u000b\u0001(+`\u0012\ryqM\u001c\u00186@~=j\r{\t*\u0018\f>.\u00066\\\u0016RFNr]H5;\u0003\u0018IĚ+a6\u0005[\u0016\u000fZ5\u001c\u000faL+\u0007L}&3c\u001b\u0007\u0001lo\tM\u0004U\u0007~&U>\u0010֬W~^\u000e(-+}\"$\u0007nb\u0013gx\fUB\u0016w\u0014~\u001c@\u0010z*Ȟl\f\u0014\u00065IF/0e6\u0010czxSNS\u001a^p\u0004+g<\u00173\u0005K+g\u001f\u0017Wg;'TO{3\u0014n9\u000fo9]j\r\u000f\u0017QXN\u038b3ҨDCPݐ\"[Cw\u0012{3\u00168\u0007HG.32\u0015\u0005ϗ'ھ_?+ܩ\u0004\u0004NPu\u0004UtvX\u0002RvDXrlջ,Á\u0010`Lߟ\u001dmVbf9ҳQ6"}, d2 = {"\u001aRc.V2!W'\u000e\u0005k@Y\u00190f\u007f5[I\u0010$+\u001d", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "/cS?", "\u001aAP0^;KO\u0017~[k(\u0005\t\u0005", "4o", "", "B`V", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uK1.V2M`\u0015|z?9x\u0011/;d\rbJ\u0007\u001b!\u0011L\"Kv\u0013Df\u0002)9CY\u001f", "5dc\u000eW+K", "u(;\u000fT*Db&zx^\r\n\u00057eU", "5dc\u0013c", "u(9", "5dc!T.", "<df\u000fh0ER\u0019\f", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class StackHistoryBufferEntry extends Message {
    public static final ProtoAdapter<StackHistoryBufferEntry> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "Mmpy\u0004\u0003ruxZ\bw\u0005}<[_]mrdr", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final BacktraceFrame addr;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final long fp;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 2, tag = 3)
    @InterfaceC1492Gx
    private final long tag;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aRc.V2!W'\u000e\u0005k@Y\u00190f\u007f5[I\u0010$+\u0006M\u0018D\u0002!>]\b)\r", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aRc.V2!W'\u000e\u0005k@Y\u00190f\u007f5[I\u0010$+\u001d", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StackHistoryBufferEntry.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StackHistoryBufferEntry>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: StackHistoryBufferEntry$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StackHistoryBufferEntry decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BacktraceFrame backtraceFrameDecode = null;
                long jLongValue = 0;
                long jLongValue2 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StackHistoryBufferEntry(backtraceFrameDecode, jLongValue, jLongValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        backtraceFrameDecode = BacktraceFrame.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                    } else if (iNextTag != 3) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        jLongValue2 = ProtoAdapter.UINT64.decode(reader).longValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StackHistoryBufferEntry value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAddr() != null) {
                    BacktraceFrame.ADAPTER.encodeWithTag(writer, 1, value.getAddr());
                }
                if (value.getFp() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getFp()));
                }
                if (value.getTag() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getTag()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StackHistoryBufferEntry value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTag() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getTag()));
                }
                if (value.getFp() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getFp()));
                }
                if (value.getAddr() != null) {
                    BacktraceFrame.ADAPTER.encodeWithTag(writer, 1, value.getAddr());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StackHistoryBufferEntry value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAddr() != null) {
                    size += BacktraceFrame.ADAPTER.encodedSizeWithTag(1, value.getAddr());
                }
                if (value.getFp() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getFp()));
                }
                return value.getTag() != 0 ? size + ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getTag())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StackHistoryBufferEntry redact(StackHistoryBufferEntry value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BacktraceFrame addr = value.getAddr();
                return StackHistoryBufferEntry.copy$default(value, addr != null ? BacktraceFrame.ADAPTER.redact(addr) : null, 0L, 0L, ByteString.EMPTY, 6, null);
            }
        };
    }

    public StackHistoryBufferEntry() {
        this(null, 0L, 0L, null, 15, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackHistoryBufferEntry(BacktraceFrame backtraceFrame, long j2, long j3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.addr = backtraceFrame;
        this.fp = j2;
        this.tag = j3;
    }

    public /* synthetic */ StackHistoryBufferEntry(BacktraceFrame backtraceFrame, long j2, long j3, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? null : backtraceFrame, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? 0L : j2, (4 & i2) == 0 ? j3 : 0L, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? ByteString.EMPTY : byteString);
    }

    public static /* synthetic */ StackHistoryBufferEntry copy$default(StackHistoryBufferEntry stackHistoryBufferEntry, BacktraceFrame backtraceFrame, long j2, long j3, ByteString byteString, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            backtraceFrame = stackHistoryBufferEntry.addr;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = stackHistoryBufferEntry.fp;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            j3 = stackHistoryBufferEntry.tag;
        }
        if ((i2 & 8) != 0) {
            byteString = stackHistoryBufferEntry.unknownFields();
        }
        return stackHistoryBufferEntry.copy(backtraceFrame, j2, j3, byteString);
    }

    public final StackHistoryBufferEntry copy(BacktraceFrame backtraceFrame, long j2, long j3, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StackHistoryBufferEntry(backtraceFrame, j2, j3, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StackHistoryBufferEntry)) {
            return false;
        }
        StackHistoryBufferEntry stackHistoryBufferEntry = (StackHistoryBufferEntry) obj;
        return Intrinsics.areEqual(unknownFields(), stackHistoryBufferEntry.unknownFields()) && Intrinsics.areEqual(this.addr, stackHistoryBufferEntry.addr) && this.fp == stackHistoryBufferEntry.fp && this.tag == stackHistoryBufferEntry.tag;
    }

    public final BacktraceFrame getAddr() {
        return this.addr;
    }

    public final long getFp() {
        return this.fp;
    }

    public final long getTag() {
        return this.tag;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        BacktraceFrame backtraceFrame = this.addr;
        int iHashCode2 = ((((iHashCode + (backtraceFrame != null ? backtraceFrame.hashCode() : 0)) * 37) + Long.hashCode(this.fp)) * 37) + Long.hashCode(this.tag);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m17newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m17newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.addr != null) {
            arrayList.add("addr=" + this.addr);
        }
        ArrayList arrayList2 = arrayList;
        arrayList2.add("fp=" + this.fp);
        arrayList2.add("tag=" + this.tag);
        return CollectionsKt.joinToString$default(arrayList, ", ", "StackHistoryBufferEntry{", "}", 0, null, null, 56, null);
    }
}
