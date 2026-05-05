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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000b<H\u0007Ӭ4\u0012\u0006\u0013nj?0LeV5Zݷ2\u000f\u0002{<$a-yCI^\"Ԃ*\t]ȞogtMpŏa*6\"\tl<I\u0004ތm\u0014\u001f2pom2\u0006nXy\u0018\u0005<\u000b @#Py3\u0003*0N\u0010\u0005}[K:\u0016@Fv:`\u0012e\u0005H\u0016\u0016D&\u0001,b\u007fNdO|c@/1\u000b\u0002B|0ۢ4~S\u0017T_o\u0013\u0005t6+n7{*md\u0011\u001bj[m\u0018owK\u001b\u0001)=*w\u000b\u001e̓XH\u001a#Cg\r\ftlpMWn%?+}g\u0012dV^\u0006\u0015\u0014\rjǉ>\f-H<.2f6\u0010czxSNS\u001a^p\u0004+g<\u00173\u0005K+g\u001f\u0017Wg;'TO{3\u0014N)\u0007n/cl\u000e\u000f\u001ekh\u0006RIQn?~R`Է?ъ\bvj̣B\u00066S\u000e<L%<\u001a=7\n=Y%BȽJזk|\r\u009b\u0001Uo`VOr\u0003$<B\t:^zh[ߠRԜ\\2\u0019۳4V\r\u000e\u0016\"pp\u0006B9%>U\u0006l@ҜOύ\u000e+7ωO[t|\u001ciߓbO"}, d2 = {"\u001aE3\b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "4c", "", ">`c5", "", "=v]2e", "B`V", "", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00042*Eq8(^EuH\u0007Q;[z0I\"\u0012\u001d", "5dc\u0013W", "u(8", "5dc\u001dT;A", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001cj5>`", "5dc!T.", "u(9", "<df\u000fh0ER\u0019\f", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class FD extends Message {
    public static final ProtoAdapter<FD> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLsy\u0001``", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final int fd;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 2, tag = 3)
    @InterfaceC1492Gx
    private final String owner;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final String path;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002dc", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 3, tag = 4)
    @InterfaceC1492Gx
    private final long tag;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aE3p66F^\u0015\b~h5R", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aE3\b", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FD.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FD>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: FD$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FD decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                String strDecode = "";
                long jLongValue = 0;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FD(iIntValue, strDecode, strDecode2, jLongValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 4) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FD value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getFd() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getFd()));
                }
                if (!Intrinsics.areEqual(value.getPath(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getPath());
                }
                if (!Intrinsics.areEqual(value.getOwner(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getOwner());
                }
                if (value.getTag() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 4, Long.valueOf(value.getTag()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FD value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTag() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 4, Long.valueOf(value.getTag()));
                }
                if (!Intrinsics.areEqual(value.getOwner(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getOwner());
                }
                if (!Intrinsics.areEqual(value.getPath(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getPath());
                }
                if (value.getFd() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getFd()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FD value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getFd() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getFd()));
                }
                if (!Intrinsics.areEqual(value.getPath(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPath());
                }
                if (!Intrinsics.areEqual(value.getOwner(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getOwner());
                }
                return value.getTag() != 0 ? size + ProtoAdapter.UINT64.encodedSizeWithTag(4, Long.valueOf(value.getTag())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FD redact(FD value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FD.copy$default(value, 0, null, null, 0L, ByteString.EMPTY, 15, null);
            }
        };
    }

    public FD() {
        this(0, null, null, 0L, null, 31, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FD(int i2, String path, String owner, long j2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.fd = i2;
        this.path = path;
        this.owner = owner;
        this.tag = j2;
    }

    public /* synthetic */ FD(int i2, String str, String str2, long j2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 0 : i2, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? "" : str, (4 & i3) == 0 ? str2 : "", (-1) - (((-1) - i3) | ((-1) - 8)) != 0 ? 0L : j2, (i3 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public static /* synthetic */ FD copy$default(FD fd, int i2, String str, String str2, long j2, ByteString byteString, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            i2 = fd.fd;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            str = fd.path;
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            str2 = fd.owner;
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            j2 = fd.tag;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            byteString = fd.unknownFields();
        }
        return fd.copy(i2, str, str2, j2, byteString);
    }

    public final FD copy(int i2, String path, String owner, long j2, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FD(i2, path, owner, j2, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FD)) {
            return false;
        }
        FD fd = (FD) obj;
        return Intrinsics.areEqual(unknownFields(), fd.unknownFields()) && this.fd == fd.fd && Intrinsics.areEqual(this.path, fd.path) && Intrinsics.areEqual(this.owner, fd.owner) && this.tag == fd.tag;
    }

    public final int getFd() {
        return this.fd;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getTag() {
        return this.tag;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.fd)) * 37) + this.path.hashCode()) * 37) + this.owner.hashCode()) * 37) + Long.hashCode(this.tag);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m7newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m7newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("fd=" + this.fd);
        arrayList2.add("path=" + Internal.sanitize(this.path));
        arrayList2.add("owner=" + Internal.sanitize(this.owner));
        arrayList2.add("tag=" + this.tag);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FD{", "}", 0, null, null, 56, null);
    }
}
