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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000bDB\u0007\"2\u0019\u007f\u0007tsAӄLeV\u008cZݷ2\u000fy\u0002<řc$\u007fOCU ~8ޛmb\u0018s~Lj\u000bqƤ\u0016\u0018\tjZI\u0004w\u0016\u0011#re\u007fE9M}>Q`#8\u0015&8\"F|\u001d\u0001H,X\u0016|zQO$\u0012^B¤>T\u0013R\u0013 Z\fL*\u0019\u001e\u000bg\u0015K\u0011}kEG#1urT5lH~c\ftbm˰v*$9OO5C5\u001a\u0017OXiP\u001b? OK|oI9\\\fWdݙ0\u001a\u001b+]\u000eurT^5Wf\f5.gcyR>.}z\n\u0011T\u0004<\bw\\<.2f6\u0010ixIԧBг\u0006dJȕ\u0013c<\u001e3\b\u0004?G\u001e~Q\u0010=OR\u000eޮ\u0007ڟ\")\t͙9]Z\u0017n\u001dúX\r"}, d2 = {"\u001aBa.f/\u001dS(z~e\u0002", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "<`\\2", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "2`c.R", "CmZ;b>G4\u001d~\u0002]:", "\nh]6g\u0005", "uK^8\\6\b0-\u000ezL;\n\r8gU\u000f\u0006F\u0005!`$\u0004\u001d<d4B]\u0007\"\rT 4QM\u0005HH-\u0015VpF\u000bl.$:\u0018", "5dc\u001bT4>", "u(;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}", "5dc\u0011T;:M", "<df\u000fh0ER\u0019\f", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CrashDetail extends Message {
    public static final ProtoAdapter<CrashDetail> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLl\u0005\u0001r\u0002", declaredName = "84F2", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final ByteString data_;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLl\u0005\u0001r\u0002", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final ByteString name;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aBa.f/\u001dS(z~ejZ\u00137p{1\u007fJ\nl", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aBa.f/\u001dS(z~e\u0002", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CrashDetail.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CrashDetail>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: CrashDetail$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CrashDetail decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteStringDecode = ByteString.EMPTY;
                ByteString byteStringDecode2 = ByteString.EMPTY;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CrashDetail(byteStringDecode, byteStringDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CrashDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getName(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getName());
                }
                if (!Intrinsics.areEqual(value.getData_(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getData_());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CrashDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getData_(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getData_());
                }
                if (Intrinsics.areEqual(value.getName(), ByteString.EMPTY)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getName());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CrashDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getName(), ByteString.EMPTY)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getName());
                }
                return !Intrinsics.areEqual(value.getData_(), ByteString.EMPTY) ? size + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getData_()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CrashDetail redact(CrashDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CrashDetail.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    public CrashDetail() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashDetail(ByteString name, ByteString data_, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data_, "data_");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name = name;
        this.data_ = data_;
    }

    public /* synthetic */ CrashDetail(ByteString byteString, ByteString byteString2, ByteString byteString3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? ByteString.EMPTY : byteString, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? ByteString.EMPTY : byteString2, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? ByteString.EMPTY : byteString3);
    }

    public static /* synthetic */ CrashDetail copy$default(CrashDetail crashDetail, ByteString byteString, ByteString byteString2, ByteString byteString3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            byteString = crashDetail.name;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            byteString2 = crashDetail.data_;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            byteString3 = crashDetail.unknownFields();
        }
        return crashDetail.copy(byteString, byteString2, byteString3);
    }

    public final CrashDetail copy(ByteString name, ByteString data_, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(data_, "data_");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CrashDetail(name, data_, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashDetail)) {
            return false;
        }
        CrashDetail crashDetail = (CrashDetail) obj;
        return Intrinsics.areEqual(unknownFields(), crashDetail.unknownFields()) && Intrinsics.areEqual(this.name, crashDetail.name) && Intrinsics.areEqual(this.data_, crashDetail.data_);
    }

    public final ByteString getData_() {
        return this.data_;
    }

    public final ByteString getName() {
        return this.name;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.data_.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m6newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m6newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("name=" + this.name);
        arrayList2.add("data_=" + this.data_);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CrashDetail{", "}", 0, null, null, 56, null);
    }
}
