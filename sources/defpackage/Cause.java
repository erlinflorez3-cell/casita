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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000b<N\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XY2\u000fy\u0005<řc$\u007fّC٥\"}0\u000fWNmi\u0005Ϻx!s\u001b\u0016\u0018\tjZկezm\u0012=2pnw2c0bIfz6\u0013!J\"f{\u0015\t *V\u0013\u000f|YJ:\u0016@Fv:`\u0012e\u0005H\u0018ĂB\"\u0007%jo\u0017<Vyu:]#I~\u000b_5mH|{\u001cvZ5\u001d\u000fc4*nH{խ%\u001c\t\u0015ds?1R8QMn5;CI\"Y|lH8#@g\r\föVb\u000bQn\r?+}e{X\u0014(\u0006}\u0014\u000fR\u0003<\nWN4-(k \u000eazCgNQ\u001a^p\u00021e\rЕ'ő71Aӕ~SgD'X\b\u0012\u0013\u00106%\u0017mO_\u000b\u00127څ\u001dƻ{W9҅X?NY\u0018eǆq\u001b"}, d2 = {"\u001aBPBf,\u0014", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "6t\\.a&KS\u0015}v[3|", "", ";d\\<e@8S&\f\u0005k", "\u001aLT:b9R3&\f\u0005k\u0002", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b(\u0001\u001f!T\u0004mI\u0004/B/d*=q w*WJk\"-\"lj;\\'\u001d", "5dc\u0015h4:\\\u0013\fzZ+x\u00066e", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001aX4H`-xzk9\u0007\u0016", "u(;\u001aX4H`-^\bk6\n^", "<df\u000fh0ER\u0019\f", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class Cause extends Message {
    public static final ProtoAdapter<Cause> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "~\r\u0006z\tm\u0002~\u0003\u0001\u0003\u000e\b", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final String human_readable;

    @WireField(adapter = "Xqz}\u0002\nV\u0005\u0006\u0004\b9X\\Zjoao", declaredName = "", jsonName = "\u0004|\u0006\t\r\u0015a\u0010\u0011\u000f\u0013", keyAdapter = "", oneofName = "-/?-6:B", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final MemoryError memory_error;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aBPBf,|1#\u0007\u0006Z5\u0001\u00138;", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aBPBf,\u0014", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Cause.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Cause>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: Cause$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Cause decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                MemoryError memoryErrorDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Cause(strDecode, memoryErrorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        memoryErrorDecode = MemoryError.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Cause value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHuman_readable(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getHuman_readable());
                }
                MemoryError.ADAPTER.encodeWithTag(writer, 2, value.getMemory_error());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Cause value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                MemoryError.ADAPTER.encodeWithTag(writer, 2, value.getMemory_error());
                if (Intrinsics.areEqual(value.getHuman_readable(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getHuman_readable());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Cause value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHuman_readable(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHuman_readable());
                }
                return size + MemoryError.ADAPTER.encodedSizeWithTag(2, value.getMemory_error());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Cause redact(Cause value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MemoryError memory_error = value.getMemory_error();
                return Cause.copy$default(value, null, memory_error != null ? MemoryError.ADAPTER.redact(memory_error) : null, ByteString.EMPTY, 1, null);
            }
        };
    }

    public Cause() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cause(String human_readable, MemoryError memoryError, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(human_readable, "human_readable");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.human_readable = human_readable;
        this.memory_error = memoryError;
    }

    public /* synthetic */ Cause(String str, MemoryError memoryError, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? "" : str, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : memoryError, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? ByteString.EMPTY : byteString);
    }

    public static /* synthetic */ Cause copy$default(Cause cause, String str, MemoryError memoryError, ByteString byteString, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = cause.human_readable;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            memoryError = cause.memory_error;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            byteString = cause.unknownFields();
        }
        return cause.copy(str, memoryError, byteString);
    }

    public final Cause copy(String human_readable, MemoryError memoryError, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(human_readable, "human_readable");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Cause(human_readable, memoryError, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Cause)) {
            return false;
        }
        Cause cause = (Cause) obj;
        return Intrinsics.areEqual(unknownFields(), cause.unknownFields()) && Intrinsics.areEqual(this.human_readable, cause.human_readable) && Intrinsics.areEqual(this.memory_error, cause.memory_error);
    }

    public final String getHuman_readable() {
        return this.human_readable;
    }

    public final MemoryError getMemory_error() {
        return this.memory_error;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.human_readable.hashCode()) * 37;
        MemoryError memoryError = this.memory_error;
        int iHashCode2 = iHashCode + (memoryError != null ? memoryError.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m5newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m5newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("human_readable=" + Internal.sanitize(this.human_readable));
        if (this.memory_error != null) {
            arrayList2.add("memory_error=" + this.memory_error);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Cause{", "}", 0, null, null, 56, null);
    }
}
