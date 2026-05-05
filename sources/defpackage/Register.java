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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000b<N\u0007Ӭ4\u0012\u0006\u000enʑA0ZeP.XY2\u000fy\u0005<řc$\u007fّC٥\"}0\u000fWNmi\u0005Ϻx!s\u001b\u0016\u0018\tjZկezm\u0012=2pnw2c0`Ifz6\u0013!J\"f{\u0015\u0007 *V\u0013\u000fzqO\u001c\u00186@~?j\r{\u000bܨ\u0016\bD'\u000f&%m\\C`l\f:u8KzP\\?_^\f}\u0013Td?\u000f\r`L<\u0007ˑ5]+a\u0015\u001fR\nRIS:C\u0013|?'YK:k~z\u000e)-+}Օ\u000ex,\\\u0013Rx\fU-\u007fiQP\u001c+\u0010z*\u0011l\n\u0014\u00065MF-HlX\"Au\u000bSnR8b\u0019ȝ|ˋ:\u001d-ĮK-?$t[2O'QO{3\u0011T'W͡#ƟX\u0014hٽ3V}\\?]͞A_"}, d2 = {"\u001aQT4\\:MS&T", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "<`\\2", "", "C5#", "", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`'\u000b\u001d\u001bQ9jP\u0006%#h\u000b$@okq>", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\")z", "u(9", "<df\u000fh0ER\u0019\f", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class Register extends Message {
    public static final ProtoAdapter<Register> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final String name;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final long u64;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aQT4\\:MS&=Xh4\b\u00058i\n1Q", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aQT4\\:MS&T", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Register.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Register>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: Register$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Register decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                long jLongValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Register(strDecode, jLongValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Register value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getName());
                }
                if (value.getU64() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getU64()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Register value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getU64() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getU64()));
                }
                if (Intrinsics.areEqual(value.getName(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getName());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Register value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                }
                return value.getU64() != 0 ? size + ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getU64())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Register redact(Register value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Register.copy$default(value, null, 0L, ByteString.EMPTY, 3, null);
            }
        };
    }

    public Register() {
        this(null, 0L, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Register(String name, long j2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name = name;
        this.u64 = j2;
    }

    public /* synthetic */ Register(String str, long j2, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? "" : str, (i2 + 2) - (2 | i2) != 0 ? 0L : j2, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public static /* synthetic */ Register copy$default(Register register, String str, long j2, ByteString byteString, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = register.name;
        }
        if ((2 & i2) != 0) {
            j2 = register.u64;
        }
        if ((i2 & 4) != 0) {
            byteString = register.unknownFields();
        }
        return register.copy(str, j2, byteString);
    }

    public final Register copy(String name, long j2, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Register(name, j2, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Register)) {
            return false;
        }
        Register register = (Register) obj;
        return Intrinsics.areEqual(unknownFields(), register.unknownFields()) && Intrinsics.areEqual(this.name, register.name) && this.u64 == register.u64;
    }

    public final String getName() {
        return this.name;
    }

    public final long getU64() {
        return this.u64;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + Long.hashCode(this.u64);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m14newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m14newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("name=" + Internal.sanitize(this.name));
        arrayList2.add("u64=" + this.u64);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Register{", "}", 0, null, null, 56, null);
    }
}
