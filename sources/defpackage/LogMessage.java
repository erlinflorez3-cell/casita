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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000b<N\u0007Ӭ4\u0012\u0006\rnj?3Le^.ZS0\u0019s{B-cҕyCI٥\"}(\feȞ\u0006\u0005\u001fVj\rS\u000f4ǝ\tl<I\u0004x\f\u0011G1_0\u000bCSu=Ga\r63\"B(>y\u0013\u00042*v\u0014\u0007\u0001IK\u001a\u0017H@\u001f>b\u0013S\u0005(\u0018\u001e>N\u0005.bmNDO\u0005]h13\toB\\/w0+O\u001dLZ'\u001b\u007fy\u001eYJ˝9\u0017+^\u0011\u0013\u001baM\u0018Wqk\u0005/<o<W\no6\u0007\u0017D\u001b9g%_\t%\u000b\u001e\u0018ӷ\fo1]}cP<,>\u000fD\u0013J\u001f&\u0006UJtAb1\u0016*Kt!ԟpV\b^P\u0001\u0013ad\u0019U\u00069+G\u001e~Q\u0010?IT={\u0013\u00126#/rQaZ\u000en\u001b3T&UaWF=VU\"Yko4vh\u00028\fHG.1,\u00174\u00173@s9Q+<\u0016VE\u007fv3b\u001fW@ɵJغ&t\u001eճB\u000b\u0012gRrU\u007f^Wp,?QRX]ê\n˙$b\u007f˓9'\u0016]]x:~[b\"%]jm]E\u0090\u0010Ć=d;̐ie\u0016r`\u0007dSJh\u001dX\u0015F\n\u00101٪*ϒ6Nrݘ\u0010}J`\u001a#\u0003S\u007f#L,_\u001b\u0013\u0019\u001fҙ նE\u0003\u0011ݠrj\u0016\u0012bAt\u0017w,\r\t/R\u0013tFΧzͅ0\u0003hõECWI'4Ƈ&\u0007"}, d2 = {"\u001aK^4@,La\u0015\u0001z4", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "Bh\\2f;:[$", "", ">hS", "", "BhS", ">qX<e0Mg", "B`V", ";db@T.>", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$d}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019\"p0/\u00112h5\u0010eu<\u00064KUP\u0002C\\xA\u001e[7\"]+z\u0014fE-p\u001az\u0010", "5dc!\\4>a(z\u0003i", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001d\\+", "u(8", "5dc!\\+", "5dc\u001de0H`\u001d\u000e\u000f", "5dc!T.", "5dc\u001aX:LO\u001b~", "<df\u000fh0ER\u0019\f", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class LogMessage extends Message {
    public static final ProtoAdapter<LogMessage> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 5, tag = 6)
    @InterfaceC1492Gx
    private final String message;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002aa", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 2)
    @InterfaceC1492Gx
    private final int pid;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002aa", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 3, tag = 4)
    @InterfaceC1492Gx
    private final int priority;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 4, tag = 5)
    @InterfaceC1492Gx
    private final String tag;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002aa", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 2, tag = 3)
    @InterfaceC1492Gx
    private final int tid;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final String timestamp;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aK^4@,La\u0015\u0001z\u001d\n\u0007\u0011:a\t,\u0006IV", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aK^4@,La\u0015\u0001z4", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LogMessage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LogMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: LogMessage$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LogMessage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                String strDecode2 = "";
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LogMessage(strDecode, iIntValue, iIntValue2, iIntValue3, strDecode3, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                            break;
                        case 3:
                            iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                            break;
                        case 4:
                            iIntValue3 = ProtoAdapter.UINT32.decode(reader).intValue();
                            break;
                        case 5:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LogMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getTimestamp());
                }
                if (value.getPid() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getPid()));
                }
                if (value.getTid() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getTid()));
                }
                if (value.getPriority() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getPriority()));
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, value.getTag());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, value.getMessage());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LogMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, value.getTag());
                }
                if (value.getPriority() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getPriority()));
                }
                if (value.getTid() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getTid()));
                }
                if (value.getPid() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getPid()));
                }
                if (Intrinsics.areEqual(value.getTimestamp(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getTimestamp());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LogMessage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTimestamp());
                }
                if (value.getPid() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getPid()));
                }
                if (value.getTid() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getTid()));
                }
                if (value.getPriority() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.getPriority()));
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTag());
                }
                return !Intrinsics.areEqual(value.getMessage(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getMessage()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LogMessage redact(LogMessage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LogMessage.copy$default(value, null, 0, 0, 0, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }

    public LogMessage() {
        this(null, 0, 0, 0, null, null, null, 127, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogMessage(String timestamp, int i2, int i3, int i4, String tag, String message, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.timestamp = timestamp;
        this.pid = i2;
        this.tid = i3;
        this.priority = i4;
        this.tag = tag;
        this.message = message;
    }

    public /* synthetic */ LogMessage(String str, int i2, int i3, int i4, String str2, String str3, ByteString byteString, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 + 1) - (i5 | 1) != 0 ? "" : str, (-1) - (((-1) - i5) | ((-1) - 2)) != 0 ? 0 : i2, (-1) - (((-1) - i5) | ((-1) - 4)) != 0 ? 0 : i3, (-1) - (((-1) - i5) | ((-1) - 8)) == 0 ? i4 : 0, (i5 + 16) - (i5 | 16) != 0 ? "" : str2, (-1) - (((-1) - i5) | ((-1) - 32)) == 0 ? str3 : "", (-1) - (((-1) - i5) | ((-1) - 64)) != 0 ? ByteString.EMPTY : byteString);
    }

    public static /* synthetic */ LogMessage copy$default(LogMessage logMessage, String str, int i2, int i3, int i4, String str2, String str3, ByteString byteString, int i5, Object obj) {
        if ((i5 + 1) - (1 | i5) != 0) {
            str = logMessage.timestamp;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            i2 = logMessage.pid;
        }
        if ((i5 + 4) - (4 | i5) != 0) {
            i3 = logMessage.tid;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 8)) != 0) {
            i4 = logMessage.priority;
        }
        if ((16 & i5) != 0) {
            str2 = logMessage.tag;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 32)) != 0) {
            str3 = logMessage.message;
        }
        if ((i5 + 64) - (i5 | 64) != 0) {
            byteString = logMessage.unknownFields();
        }
        return logMessage.copy(str, i2, i3, i4, str2, str3, byteString);
    }

    public final LogMessage copy(String timestamp, int i2, int i3, int i4, String tag, String message, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LogMessage(timestamp, i2, i3, i4, tag, message, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogMessage)) {
            return false;
        }
        LogMessage logMessage = (LogMessage) obj;
        return Intrinsics.areEqual(unknownFields(), logMessage.unknownFields()) && Intrinsics.areEqual(this.timestamp, logMessage.timestamp) && this.pid == logMessage.pid && this.tid == logMessage.tid && this.priority == logMessage.priority && Intrinsics.areEqual(this.tag, logMessage.tag) && Intrinsics.areEqual(this.message, logMessage.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getPid() {
        return this.pid;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int getTid() {
        return this.tid;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.timestamp.hashCode()) * 37) + Integer.hashCode(this.pid)) * 37) + Integer.hashCode(this.tid)) * 37) + Integer.hashCode(this.priority)) * 37) + this.tag.hashCode()) * 37) + this.message.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m10newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m10newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("timestamp=" + Internal.sanitize(this.timestamp));
        arrayList2.add("pid=" + this.pid);
        arrayList2.add("tid=" + this.tid);
        arrayList2.add("priority=" + this.priority);
        arrayList2.add("tag=" + Internal.sanitize(this.tag));
        arrayList2.add("message=" + Internal.sanitize(this.message));
        return CollectionsKt.joinToString$default(arrayList, ", ", "LogMessage{", "}", 0, null, null, 56, null);
    }
}
