package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
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
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{B-c$wDCU0}*ޛWN}gvϺb\u000bQ\u000f\u000eǝ\u0001jBI]ތe\u0012%2JģG3[vE9fu>\u000562*\u0600\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f\u00181HpPR\u0015M\u000b\u001b(ß\\F1\u001e\u000bf\u00075n-\u0001J31\u0003\u0002B|(o4\u000bO%F\u0003*\u001dzo\"C@e:%)a\t\u001fR\nFƄCqK\r1-5<as\u0006H\u001f\u0014\\+9b%]!:\r\t_u$'Ye\u0014O^%@w)\u0014SPL\u0014\u0014@`.[,-\u001cV9\u0003\rk@~\u0014%VH\toQ/%.O[=)\u0004iai7\u0015KD\u0015\u001b=;\u0003\u0005 \nt>d#<lw\u007f;\u0018T\u0006V\\,q=\u001c\u001c!f\u0010G\u001c0u\u001eu\u0010Y4%HO[gGg\u007fJVR\r\u000f\u0005\u000fz\u0004m`]X\"\u001d,}>Y\u0018hM|\u0005\u001aZ+Г8ҭQ\u001c\\͵N\u0014!$twj&{ĮPћlirܔ.\u001c31~7\bqBޤYߍb9=ȡ{\u0012g]\u0005 \u0010Hp\u000bpfpZbȚ^͈&2PК`\u0004\nQf\fA@\u0016ڧ\u001eٜ01!¢eV\u0011-ZC\u0013\b\u000ej?ɰ\u000bՁ7$\u000bǭˮx0"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0005HW\u0001\u001c@o\u0016\fWB;i\n", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\f`vZm\u00118\u007f'57\b\u001f7kk", "1kX2a;", "\u001anZ5g;I!bh\u0001A;\f\u0014\rl\u0004(\u0005OV", "1n];X*MW#\b", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=s", "1gP6a", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\f`\u0004Gk\u0015 \u007f45f{ B| ;+F7o=s", "6sc=%\nH\\\"~xm0\u0007\u0012", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0019", "uK^8[;M^fHdd\u000f\f\u0018:C\u0007,{I\u0010l}Qu\u0011K\u00060\u0003#\u0002)Fm#7IJ\u0005i>'\u001eh_H\u000bm5\u0018c'CS,6e[r;#\u0016d\u0017$\u0012\u0017\u000b\\P3y\u0012\u0001#\u0011;I\u000fDd\bU\u0019\u001dDu:/V\fN]\u001e\u0005A6fFdn\u0004T\u001fH^.maF'b=I3\u001f?b\u001fq_.\u0017\u0005O\u0018<U\tvr\u0014b]G3I:9PNxU:\u0004+)TQ;\u0003", "1`]0X3>R", "", "5dc\u0010b5GS\u0017\u000e~h5", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~F}\u001c>K 7VC9z8(\u001e>", ">q^Ab*HZ", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "Asa2T4", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0013Df}\u001c?C", "1`]0X3", "", "1qT.g,+S%\u000fzl;Y\u0013.y", "\u001anZ6bu,W\"\u0005P", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "1n]AX5M:\u0019\b|m/", "", "4h]6f/+S%\u000fzl;", "4kd@[\u0019>_)~\tm", "=oT;E,L^#\b\t^\t\u0007\bCS\n8\t>\u0001", "\u001anZ6bu,])\fx^\u0002", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "@dP1E,L^#\b\t^\u000f|\u0005.e\r6", "\u001anZ5g;I!bkzl7\u0007\u0012=e>\u0005\fD\b\u0016\u0017TE", "3w_2V;\u001c]\"\u000e~g<|", "@d_<e;>Rv\t\u0004m,\u0006\u0018\u0016e\t*\u000bC", "BqP6_,Ka", "\u001anZ5g;I!bazZ+|\u0016=;", "EqXAX\u0019>_)~\tm\u000f|\u0005.e\r6", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Http2ExchangeCodec implements ExchangeCodec {
    private static final String ENCODING = "encoding";
    private volatile boolean canceled;
    private final RealInterceptorChain chain;
    private final RealConnection connection;
    private final Http2Connection http2Connection;
    private final Protocol protocol;
    private volatile Http2Stream stream;
    public static final Companion Companion = new Companion(null);
    private static final String CONNECTION = "connection";
    private static final String HOST = "host";
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";
    private static final String TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String UPGRADE = "upgrade";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, "encoding", UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, "encoding", UPGRADE);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#4\u0012\u0006%nj?5Le^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWȞog\u0005JbŏIƫ\u0007,ю\u001b,wT9b\u0018\u000f̓FoM3\u0016\u0002KFxzF\u000702PF(\u000b1\u001e8W(v)S\u0014  AXphd=Q\u0013-*\u0006l41\"j|f6v\u0003.F=$\u001bipP}ۂ\u0003ƊQ\rNÖw\u0019\u0005d6+n9\fՙw٨\u0007\u0007Z¹\u0010\u000fMuU\u0005\u0017)}ǥ\u001cָ[6`Üd'9T%c\u0003(l\u0005\u007fb:-\u0002ՕeׂT\u000e0»K\u000e\u001bC\u001c\u0014\u0016)X.[\u001c\u0015\u000edޚvɤW@X\u061c/N\u000e\u0003y6E'VĔ}ݰ\u001ffYĥ\f%\\@\u0014\u0005; yЪAĲ_T\u0016֫e'b\u0002i1\u007fB\u0014ʳ!̆]=uՎAn\u00105\u001c0u\u0002\u0006Ɉcѧ\u001b%?ك\n//w\u001aHriMݖ3ĈWiZ̲ـ&\u0006"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0005HW\u0001\u001c@o\u0016\fWB;ir{\u001fpl5\u0010g6WL", "", "u(E", "\u0011N=\u001b8\n-7\u0003g", "", "\u0013M2\u001c7\u0010'5", "\u0016NB!", "\u0016SC\u001dRx8A~beI\f[\u0003\u001cEk\u0018[.o\u0011y'Kl\u001cc\u0013", "", "\u0016SC\u001dRx8A~beI\f[\u0003\u001cEm\u0013e)nv\u0011*Oi\u001bV\u0012#", "\u0019D4\u001dR\b%7\n^", "\u001eQ>%L&\u001c=\u0002gZ<\u001b`r\u0018", "\"D", "\"Q0\u001bF\r\u001e@\u0013^c<\u0016[l\u0018G", "#O6\u001f4\u000b\u001e", "6sc=%\u000f>O\u0018~\bl\u0013\u0001\u0017>", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "@dP1;;M^eazZ+|\u0016=L\u00046\u000b", "\u001anZ5g;I!bkzl7\u0007\u0012=e>\u0005\fD\b\u0016\u0017TE", "6dP1X9\u001bZ#|\u0001", "\u001anZ5g;I!bazZ+|\u0016=;", ">q^Ab*HZ", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Header> http2HeadersList(Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Headers headers = request.headers();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
            arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.url())));
            String strHeader = request.header("Host");
            if (strHeader != null) {
                arrayList.add(new Header(Header.TARGET_AUTHORITY, strHeader));
            }
            arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strName = headers.name(i2);
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = strName.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, Http2ExchangeCodec.TE) && Intrinsics.areEqual(headers.value(i2), "trailers"))) {
                    arrayList.add(new Header(lowerCase, headers.value(i2)));
                }
            }
            return arrayList;
        }

        public final Response.Builder readHttp2HeadersList(Headers headerBlock, Protocol protocol) throws IOException {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headerBlock.size();
            StatusLine statusLine = null;
            for (int i2 = 0; i2 < size; i2++) {
                String strName = headerBlock.name(i2);
                String strValue = headerBlock.value(i2);
                if (Intrinsics.areEqual(strName, Header.RESPONSE_STATUS_UTF8)) {
                    statusLine = StatusLine.Companion.parse("HTTP/1.1 " + strValue);
                } else if (!Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(strName)) {
                    builder.addLenient$okhttp(strName, strValue);
                }
            }
            if (statusLine != null) {
                return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public Http2ExchangeCodec(OkHttpClient client, RealConnection connection, RealInterceptorChain chain, Http2Connection http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.connection = connection;
        this.chain = chain;
        this.http2Connection = http2Connection;
        this.protocol = client.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE) ? Protocol.H2_PRIOR_KNOWLEDGE : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Sink createRequestBody(Request request, long j2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Http2Stream http2Stream = this.stream;
        Intrinsics.checkNotNull(http2Stream);
        return http2Stream.getSink();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() throws IOException {
        Http2Stream http2Stream = this.stream;
        Intrinsics.checkNotNull(http2Stream);
        http2Stream.getSink().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        this.http2Connection.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Source openResponseBodySource(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Http2Stream http2Stream = this.stream;
        Intrinsics.checkNotNull(http2Stream);
        return http2Stream.getSource$okhttp();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z2) throws IOException {
        Http2Stream http2Stream = this.stream;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        Response.Builder http2HeadersList = Companion.readHttp2HeadersList(http2Stream.takeHeaders(), this.protocol);
        if (z2 && http2HeadersList.getCode$okhttp() == 100) {
            return null;
        }
        return http2HeadersList;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (HttpHeaders.promisesBody(response)) {
            return Util.headersContentLength(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        Http2Stream http2Stream = this.stream;
        Intrinsics.checkNotNull(http2Stream);
        return http2Stream.trailers();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.newStream(Companion.http2HeadersList(request), request.body() != null);
        if (this.canceled) {
            Http2Stream http2Stream = this.stream;
            Intrinsics.checkNotNull(http2Stream);
            http2Stream.closeLater(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream2 = this.stream;
        Intrinsics.checkNotNull(http2Stream2);
        http2Stream2.readTimeout().timeout(this.chain.getReadTimeoutMillis$okhttp(), TimeUnit.MILLISECONDS);
        Http2Stream http2Stream3 = this.stream;
        Intrinsics.checkNotNull(http2Stream3);
        http2Stream3.writeTimeout().timeout(this.chain.getWriteTimeoutMillis$okhttp(), TimeUnit.MILLISECONDS);
    }
}
