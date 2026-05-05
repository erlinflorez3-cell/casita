package okhttp3.internal.http;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okio.Sink;
import okio.Source;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u0012\u007fјnjO0L͜P.hS2şs{B+c$wDCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001j:R]xc\u0012\u00172XoG3SpC\u001evҚT\u001fP2P72\u0004\u001bb0V\u0014\u000fzqPR6xV~@j\r{\fJ\u0016\u0014F8\u0001Le\u0018RDR\u0005]h:i'2H\\3w0+RSj\u001d-\u001b\u0004y\u001eYE}Y]3a\u0011\u001fR\nN3C\u007fM\u001dhU8qm<gDj\u0018\u0016+*} \u000ev4p\u001dQ\u000f!mO\u0018qYf&(&\u0006,\u0011J\u0014&\u0006UYtQbl\u0016%Kt!k\u0007tJlP\u0019\u0013ad\u001cU\u0004A3Q\u001b\u0015Z(_i^E{\u001d\rL$W\u0380#ƟX\u0012x\u0017!V\u0006TšU["}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\f`vZm\u00118\u007f'57\b\u001f7kk", "", "1n];X*MW#\b", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=s", "5dc\u0010b5GS\u0017\u000e~h5", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~F}\u001c>K 7VC9z8(\u001e>", "1`]0X3", "", "1qT.g,+S%\u000fzl;Y\u0013.y", "\u001anZ6bu,W\"\u0005P", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "1n]AX5M:\u0019\b|m/", "", "4h]6f/+S%\u000fzl;", "4kd@[\u0019>_)~\tm", "=oT;E,L^#\b\t^\t\u0007\bCS\n8\t>\u0001", "\u001anZ6bu,])\fx^\u0002", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "@dP1E,L^#\b\t^\u000f|\u0005.e\r6", "\u001anZ5g;I!bkzl7\u0007\u0012=e>\u0005\fD\b\u0016\u0017TE", "3w_2V;\u001c]\"\u000e~g<|", "", "@d_<e;>Rv\t\u0004m,\u0006\u0018\u0016e\t*\u000bC", "BqP6_,Ka", "\u001anZ5g;I!bazZ+|\u0016=;", "EqXAX\u0019>_)~\tm\u000f|\u0005.e\r6", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface ExchangeCodec {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\f`vZm\u00118\u007f'57\b\u001f7kT\fWKFg=\"\u001fq7", "", "u(E", "\u0012HB\u00104\u0019\u001dM\u0007mg>\bd\u0003\u001eIg\be0o\u0011~+Vt d", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }

    void cancel();

    Sink createRequestBody(Request request, long j2) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    RealConnection getConnection();

    Source openResponseBodySource(Response response) throws IOException;

    Response.Builder readResponseHeaders(boolean z2) throws IOException;

    long reportedContentLength(Response response) throws IOException;

    Headers trailers() throws IOException;

    void writeRequestHeaders(Request request) throws IOException;
}
