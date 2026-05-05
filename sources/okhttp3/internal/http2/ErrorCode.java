package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\f8\u000b4S\u0005ӳ+(Մ%y\u001b?@FuH\\ɟ\u0002)Gj\u000ft1a$\u0002GIU2}P\nҊRgup\u001bi\u0019C'\u0006Dy̶0O]ތu\u0014\u00155Ps(3St&9fz\u001f\u0005&9\u000b8\u007f\ri\u001a0Qxv\u0001M4\f\u0018;)p@^uM\u000b'z\u0006D.i\u001ebv76N|F:54kiH`ϴcD"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`'|\u001bF\u0004\u0003?X}u", "", "6sc=66=S", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc\u0015g;I1#}z", "u(8", "\u001cNN\u0012E\u0019(@", "\u001eQ>!B\n(:\u0013^gK\u0016i", "\u0017MC\u0012E\u0015\u001a:\u0013^gK\u0016i", "\u0014K>$R\n(<\bkdE&\\u\u001cOl", "!DC!<\u0015 A\u0013m^F\ffx\u001e", "!SA\u00124\u001481\u007fhh>\u000b", "\u0014Q0\u001a8&,7\u000e^t>\u0019ir\u001c", " D5\"F\f\u001dM\u0007mg>\bd", "\u0011@=\u00108\u0013", "\u0011N<\u001dE\f,A|hcX\fiu\u0019R", "\u0011N=\u001b8\n-MxkgH\u0019", "\u0013M7\u000eA\n\u001eM\rhjK&Zd\u0016M", "\u0017M0\u00118\u0018./\b^tL\fZx\u001cIn\u001c", "\u0016SC\u001dRw8\u001f\u0013kZJ\u001c`u\u000fD", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public static final Companion Companion = new Companion(null);
    private final int httpCode;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013َ\u001a}"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`'|\u001bF\u0004\u0003?X}^\u0015w\u001e9IL?u=s", "", "u(E", "4q^:;;M^e", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`'|\u001bF\u0004\u0003?X}u", "1nS2", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorCode fromHttp2(int i2) {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (errorCode.getHttpCode() == i2) {
                    return errorCode;
                }
            }
            return null;
        }
    }

    ErrorCode(int i2) {
        this.httpCode = i2;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
