package okhttp3.internal.http1;

import com.dynatrace.android.agent.Global;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
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
@Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[*\u0015m\u00044:[,ڎK;c#\u0006\"\u000fOVgutRҙ\u0013C%\u0006\u001eюr,_U\u0001ز\u001a\u000fHBw?9Mw=G`|Ȃ\r H\"@y\u000b\u0001\"*V\u0017~zIK\u0014\u0012F@x:X\u000fU\u00050\u0012\u000ē(\u00014\\oN<Mt]P/+\u0003oFV'm<\u0005M\u0013Mj܋+4\u0012\u001eY?o:O`\u0010@E\u0012\u001c\u007f(OwK\u0005\u0001)=*wtg:f\u0002,\u0015YR\u001da\u0001*t\u0005\u007fe\u001c+9U{K~\u0015߭{z\n\u0015\u0005\n\u001c\u001f?H\\G`zP$A\u0010\u000bSnl2bP\u001d\u0013ad,U\u0004AIQ\u001b\u0015p(Oa\\E\u001c\u001d\rL=1r/|l\u000e\u000f7aT@W?tX=vhPm\u0006s\u0012\u0015z\u0002X\u001ev[H5\n6F\u0017SS\"9k/y(`D\u0016\u001e5dv{\u0002Rvihn^E83$Zr\f5o^\u007fp,?lbTO\u0004\u0016?8\\&Xg%XT]\u0016\u0002j{\u0005P%wtE\b\u0007k<~ibAdic>x\u0019\u000b\\OJ\u0013\u001dZ|A\u0002=\u000b`6TJH\u0019\u001e>\u0010\r\\\u001aFJ? ;d0?Ht\u0015v\u001adV\n\t\u0017\u0014rh>\u0019\u0005722\u0002$# IVj\u0003\bg'\\r\u0011)6;vi5G@\u0006&vj\u0015#5\u0012$\u0004U\u001fdGz%^\u0004c58\u0016HS\u00023K0'~WGHA\u0016Z\u0001eiO(&)}Pһ=ÿ2g\u0010ξA>nlbO\u0003\u001axՅ`ѓ'\u000elр\u0012cL\u0004Um%\u0017iIar1e\u0013ҁ:٫\t\u001f&ݒQ~0\nM-q5SZ߳\u00183-ccv}=Jn\u001d,\re23:ܡq͈U]:ծ\tUg\u0003V\"RqYܬJܖ{\bJކ\u0005\u0019AXYd\u001fg\u000fԊ\u0017ɣ\u0002f\u000fԭ]~dmR\u0015\u0006|bA6͋\u007fʸ\u0002\u0014fƹu'[g\u007fm\u001cY\u0005\u000bx$@KRυp݁ A8X]v\u0017FV\n&JY;\u0011\u0013d\tRKb|^ՄEҰm\n(|\u0006Zm'ň6\u0004"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;i\n", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\f`vZm\u00118\u007f'57\b\u001f7kk", "1kX2a;", "\u001anZ5g;I!bh\u0001A;\f\u0014\rl\u0004(\u0005OV", "1n];X*MW#\b", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=s", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "uK^8[;M^fHdd\u000f\f\u0018:C\u0007,{I\u0010l}Qu\u0011K\u00060\u0003#\u0002)Fm#7IJ\u0005i>'\u001eh_H\u000bm5\u0018c'CS,6e[r;#\u0016d\u0017$\u0012\u0017\u000b]KmKT8 \b9I\u0001)r\u0011\u0019\u0014\u000e\u000bQzHZ\u001a\u0011V%vB)uFXM}PG\u001b&\u001b", "5dc\u0010b5GS\u0017\u000e~h5", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~F}\u001c>K 7VC9z8(\u001e>", "6dP1X9L@\u0019zy^9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*o\n;v2CF}\u001c6m#\u0004", "7r29b:>R", "", "u(I", "AsPAX", "", "BqP6_,Ka", "\u001anZ5g;I!bazZ+|\u0016=;", "7r25h5DS\u0018", "\u001anZ5g;I!bkzj<|\u0017>;", "uK^8[;M^fHg^8\r\t=tUkp", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "uK^8[;M^fHg^:\b\u00138s\u007f}?5", "1`]0X3", "", "1qT.g,+S%\u000fzl;Y\u0013.y", "\u001anZ6bu,W\"\u0005P", "@d`BX:M", "1n]AX5M:\u0019\b|m/", "", "2dc.V/-W!~\u0005n;", "Bh\\2b<M", "\u001anZ6bu\u001f]&\u0011vk+\u0001\u00121T\u00040{J\u0011&l", "4h]6f/+S%\u000fzl;", "4kd@[\u0019>_)~\tm", "<df\u0010[<GY\u0019}hb5\u0003", "<df\u0010[<GY\u0019}hh<\n\u0007/", "\u001anZ6bu,])\fx^\u0002", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "<df\u0013\\?>R\u007f~\u0004`;\u007fv9u\r&{", ":d]4g/", "<df\u0018a6P\\\u007f~\u0004`;\u007fv3n\u0006", "<df\"a2G]+\ba^5~\u00182S\n8\t>\u0001", "=oT;E,L^#\b\t^\t\u0007\bCS\n8\t>\u0001", "@db=b5LS", "@dP1E,L^#\b\t^\u000f|\u0005.e\r6", "\u001anZ5g;I!bkzl7\u0007\u0012=e>\u0005\fD\b\u0016\u0017TE", "3w_2V;\u001c]\"\u000e~g<|", "@d_<e;>Rv\t\u0004m,\u0006\u0018\u0016e\t*\u000bC", "AjX=66G\\\u0019|\n;6{\u001d", "EqXAX\u0019>_)~\tm", "6dP1X9L", "@d`BX:M:\u001d\bz", "", "EqXAX\u0019>_)~\tm\u000f|\u0005.e\r6", "\u000fabAe(<b\u0007\t\u000bk*|", "\u0011gd;^,=A\u001d\b\u0001", "\u0011gd;^,=A#\u000f\b\\,", "\u0011n\\=T5B]\"", "\u0014hg2W\u0013>\\\u001b\u000e}L6\r\u0016-e", "\u0019m^Da\u0013>\\\u001b\u000e}L0\u0006\u000f", "#mZ;b>G:\u0019\b|m/j\u0013?r}(", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final BufferedSink sink;
    private final BufferedSource source;
    private int state;
    private Headers trailers;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146B\u0005%4\u0012\u000e\u0007nj?1LeV5Zݷ2\u000f\u0002{<$a$yCIU\"}8\tWȞm̊p`ҙ;C=\u0005V{̶0Icx&(\u001d=Zom?}sKFxtd\u0013P60G\u0012\u0005/&p\\Xz\tSc\f@A\tvHY%M3,X\u001a\u000f8\u000f\u001ftg|8\u001fǒiƠ3/\u000b݃ZP-b>\u0001m\u000fLY5\u0013Gs,2X7c\u001d{ي\u0005\u07baVaGšWsC\u000ev1ݹ/\\"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;iry\u0012vpF\u0003a;<\u00017TJN\u0002", "\u001anZ6bu,])\fx^\u0002", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"b\u0011R\u001dK\u0002p\u0015l{#3v\u0018.+M:k2sXY", "1k^@X+", "", "5dc\u0010_6LS\u0018", "u(I", "Adc\u0010_6LS\u0018", "uY\u0018#", "Bh\\2b<M", "\u001anZ6bu\u001f]&\u0011vk+\u0001\u00121T\u00040{J\u0011&l", "5dc!\\4>])\u000e", "u(;<^0H\u001dy\t\bp(\n\b3n\u0002\u0017\u007fH\u0001!'VE", "@dP1", "", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "@db=b5LSu\tyr\n\u0007\u0011:l\u007f7{", "", "\u001anZ6bu-W!~\u0005n;R", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private abstract class AbstractSource implements Source {
        private boolean closed;
        private final ForwardingTimeout timeout;

        public AbstractSource() {
            this.timeout = new ForwardingTimeout(Http1ExchangeCodec.this.source.timeout());
        }

        protected final boolean getClosed() {
            return this.closed;
        }

        protected final ForwardingTimeout getTimeout() {
            return this.timeout;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j2) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return Http1ExchangeCodec.this.source.read(sink, j2);
            } catch (IOException e2) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e2;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.state != 5) {
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
            }
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 6;
        }

        protected final void setClosed(boolean z2) {
            this.closed = z2;
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјnjG0L͜P.hS2\u000fq{<$q$yّCU(\u0005*ޛUȡi}ñzZ9BO\tȀ|j:I\u001e~k\u0017'2pu\u0006G\u0016uK@xtd\u000bfFj>\b\b\u0019\u001aXPV\u000bCYY\u0015*0nvjV\u001bW\u001d\u001a@\u0011n$\u000f*tg|C\u000f\u0001.F=$\u001bipP}ۂ<ƊQ\rNÖw\u0019\u0005d6+n;\fՙ'٨\u0007\u0007Z¹ϓ\u0007M"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;ir{\u0018xj?\u0007b\u001aR\u007f-\u001d", "\u001anZ6bu,W\"\u0005P", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"b\u0011R\u001dK\u0002p\u0015l{#3v\u0018.+M:k2sXY", "1k^@X+", "", "Bh\\2b<M", "\u001anZ6bu\u001f]&\u0011vk+\u0001\u00121T\u00040{J\u0011&l", "1k^@X", "", "4kd@[", "\u001anZ6bu-W!~\u0005n;R", "EqXAX", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class ChunkedSink implements Sink {
        private boolean closed;
        private final ForwardingTimeout timeout;

        public ChunkedSink() {
            this.timeout = new ForwardingTimeout(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.writeUtf8("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j2) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            if (j2 == 0) {
                return;
            }
            Http1ExchangeCodec.this.sink.writeHexadecimalUnsignedLong(j2);
            Http1ExchangeCodec.this.sink.writeUtf8("\r\n");
            Http1ExchangeCodec.this.sink.write(source, j2);
            Http1ExchangeCodec.this.sink.writeUtf8("\r\n");
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007tqAӄLeV7Zݷ2\u000fy{<$a$yCQU\"}(\nUȡi}ñz^9B_\u0006Dx+7YY\u0007^*\u000f`DņC3[r\u0006?n|N\u0005N;hLB\u001b\u000f$BH>{+GY\u0017*0n|jV\u001bZ\u001d\u001a@\u000b\u00054I$juf6vu$:\u007f/\u0011mZNUd\u0007ŪYϘJT/˙Gm,1X7c\u001c{و\u000f\u07baV[Gš\u0010}K\u0006\u0001'U- ֘Y͏\\\u007f\u001cƃ۩S\u001c"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;ir{\u0018xj?\u0007b\u001aX\u00074EL$", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;iry\u0012vpF\u0003a;<\u00017TJN\u0002", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;i\n", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"b\u0011R\u001dK\u0002p\u0015l{#3v\u0018.+M:k2s{rg<\u0016r7\u001c@\nV[Y\u001ciYH\u0001\u0005", "0xc2f\u0019>[\u0015\u0003\u0004b5~l8C\u00038\u0005F", "", "6`b\u001ab9>1\u001c\u000f\u0004d:", "", "1k^@X", "", "@dP1", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "@dP16/N\\\u001fl~s,", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.this$0 = http1ExchangeCodec;
            this.url = url;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.readUtf8LineStrict();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.readHexadecimalUnsignedLong();
                String string = StringsKt.trim((CharSequence) this.this$0.source.readUtf8LineStrict()).toString();
                if (this.bytesRemainingInChunk < 0 || (string.length() > 0 && !StringsKt.startsWith$default(string, Global.SEMICOLON, false, 2, (Object) null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                    http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                    OkHttpClient okHttpClient = this.this$0.client;
                    Intrinsics.checkNotNull(okHttpClient);
                    CookieJar cookieJar = okHttpClient.cookieJar();
                    HttpUrl httpUrl = this.url;
                    Headers headers = this.this$0.trailers;
                    Intrinsics.checkNotNull(headers);
                    HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
                    responseBodyComplete();
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(Buffer sink, long j2) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j2 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j3 = this.bytesRemainingInChunk;
            if (j3 == 0 || j3 == -1) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long j4 = super.read(sink, Math.min(j2, this.bytesRemainingInChunk));
            if (j4 != -1) {
                this.bytesRemainingInChunk -= j4;
                return j4;
            }
            this.this$0.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            responseBodyComplete();
            throw protocolException;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u0018\u007f\u0007lo?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>˪AН^\u000bKƤV\"\u0007mDI\u0004|4܋a̓FoG\u074c\u001e{K>xtd\tv݈tأ}\u0005\tɝzT\u001e|\u0013Cy\u0010hؖ\u0013¤>R\u0015˟U& \rV /\"3ɤ!ɇLleŽ\u007f/\u0011qZNUc\u0007Ū ϘJT/˙Gm,4X7c\u0019{وU\u07baV[Gš\u0010}K\u000f\u0001'U/ ֘*͏\\\u007f\u001cƃ۩S\u0018"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;ir{\u001fpl5\u0010g6WL", "", "u(E", "\u001cNN\u0010;\u001c'9\u0013rZM", "", "!S0!8&\u001c:\u0003lZ=", "", "!S0!8&\"2\u007f^", "!S0!8&(>xgtK\fhx\u000fSn\"X*_\u000b", "!S0!8&(>xgtK\fjs\u0019Nm\bu\u001dju\u000b", "!S0!8&+3t]^G\u000evu\u000fSj\u0012d.`\u0011s1N\u0002", "!S0!8&+3t]tK\fjs\u0019Nm\bu#`ru'\\{", "!S0!8&0@|m^G\u000evu\u000fQo\bi/zs\u0001&c", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<I\u0007\"2\u0012\u007f\u0007tjA0JeP.hS2\u000fq{:Ŝ]:ڎs?\u0004\u0019N\"7O\u000frwrX[#C=\bȀ|j:L\u001e~k\u0016'2pt\u0006G\u0016\u0006K?xtd\u0007P60?\u0012\u0005/\"ZL\u001e\u007f\u0013Cy\u000eXD\u0011|HS%M3\u001châJŋ\u0005\u001edɡߗ:R"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;ir~\u0019{a8mc5P\u0006*5V^9ZRH", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;iry\u0012vpF\u0003a;<\u00017TJN\u0002", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;i\n", "0xc2f\u0019>[\u0015\u0003\u0004b5~", "", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"b\u0011R\u001dK\u0002p\u0015l{#3v\u0018.+M:k2sy,R", "1k^@X", "", "@dP1", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j2) {
            super();
            this.bytesRemaining = j2;
            if (j2 == 0) {
                responseBodyComplete();
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(Buffer sink, long j2) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j2 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.bytesRemaining;
            if (j3 == 0) {
                return -1L;
            }
            long j4 = super.read(sink, Math.min(j3, j2));
            if (j4 == -1) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            long j5 = this.bytesRemaining - j4;
            this.bytesRemaining = j5;
            if (j5 == 0) {
                responseBodyComplete();
            }
            return j4;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјnjG0L͜P.hS2\u000fq{<$q$yّCU(\u0005*ޛUȡi}ñzZ9BO\tȀ|j:I\u001e~k\u0017'2pu\u0006G\u0016uK@xtd\u000bfFj>\b\b\u0019\u001aXPV\u000bCYY\u0015*0nvjV\u001bW\u001d\u001a@\u0011n$\u000f*tg|C\u000f\u0001.F=$\u001bipP}ۂ<ƊQ\rNÖw\u0019\u0005d6+n;\fՙ'٨\u0007\u0007Z¹ϓ\u0007M"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;ir\u0004\u001ersBmc5P\u0006*5PW22", "\u001anZ6bu,W\"\u0005P", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"b\u0011R\u001dK\u0002p\u0015l{#3v\u0018.+M:k2sXY", "1k^@X+", "", "Bh\\2b<M", "\u001anZ6bu\u001f]&\u0011vk+\u0001\u00121T\u00040{J\u0011&l", "1k^@X", "", "4kd@[", "\u001anZ6bu-W!~\u0005n;R", "EqXAX", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class KnownLengthSink implements Sink {
        private boolean closed;
        private final ForwardingTimeout timeout;

        public KnownLengthSink() {
            this.timeout = new ForwardingTimeout(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.timeout;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j2) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            Util.checkOffsetAndCount(source.size(), 0L, j2);
            Http1ExchangeCodec.this.sink.write(source, j2);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r+4ߚ\u007f\u0007tjAӄLeV5Zݷ2\u000f\u0002{<$a$wٔ=kڼ.&7N\u001fg\u0016n\u000b]ŲG\u000f\u0014\u0017Ap:Mmx\f\u0017UF\u000b\u0006M9eok@\u0011xD\r82PA*\t\u000f$BH>}AW\u001c\u0018 2XphUcˢ\u0011ܨ\u0016\u0006FĨӞ\"g"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;ir\u000e\u001enjC\u0019l\u0013N\u007f)VO<6l_p=i", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;iry\u0012vpF\u0003a;<\u00017TJN\u0002", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fb`*~\u001dGB\u0005HW\u0001\u001c@o\u0016\fWB;i\n", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"b\u0011R\u001dK\u0002p\u0015l{#3v\u0018.+M:k2sXY", "7m_Bg\fQV\u0015\u000f\tm,{", "", "1k^@X", "", "@dP1", "", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public long read(Buffer sink, long j2) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j2 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long j3 = super.read(sink, j2);
            if (j3 != -1) {
                return j3;
            }
            this.inputExhausted = true;
            responseBodyComplete();
            return -1L;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection connection, BufferedSource source, BufferedSink sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.client = okHttpClient;
        this.connection = connection;
        this.source = source;
        this.sink = sink;
        this.headersReader = new HeadersReader(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(ForwardingTimeout forwardingTimeout) {
        Timeout timeoutDelegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        timeoutDelegate.clearDeadline();
        timeoutDelegate.clearTimeout();
    }

    private final boolean isChunked(Request request) {
        return StringsKt.equals(HTTP.CHUNK_CODING, request.header("Transfer-Encoding"), true);
    }

    private final boolean isChunked(Response response) {
        return StringsKt.equals(HTTP.CHUNK_CODING, Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
    }

    private final Sink newChunkedSink() {
        if (this.state != 1) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 2;
        return new ChunkedSink();
    }

    private final Source newChunkedSource(HttpUrl httpUrl) {
        if (this.state != 4) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        return new ChunkedSource(this, httpUrl);
    }

    private final Source newFixedLengthSource(long j2) {
        if (this.state != 4) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        return new FixedLengthSource(j2);
    }

    private final Sink newKnownLengthSink() {
        if (this.state != 1) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 2;
        return new KnownLengthSink();
    }

    private final Source newUnknownLengthSource() {
        if (this.state != 4) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        getConnection().noNewExchanges$okhttp();
        return new UnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Sink createRequestBody(Request request, long j2) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j2 != -1) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Source openResponseBodySource(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long jHeadersContentLength = Util.headersContentLength(response);
        return jHeadersContentLength != -1 ? newFixedLengthSource(jHeadersContentLength) : newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z2) {
        int i2 = this.state;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            StatusLine statusLine = StatusLine.Companion.parse(this.headersReader.readLine());
            Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
            if (z2 && statusLine.code == 100) {
                return null;
            }
            if (statusLine.code == 100) {
                this.state = 3;
                return builderHeaders;
            }
            int i3 = statusLine.code;
            if (102 > i3 || i3 >= 200) {
                this.state = 4;
                return builderHeaders;
            }
            this.state = 3;
            return builderHeaders;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on " + getConnection().route().address().url().redact(), e2);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return -1L;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long jHeadersContentLength = Util.headersContentLength(response);
        if (jHeadersContentLength == -1) {
            return;
        }
        Source sourceNewFixedLengthSource = newFixedLengthSource(jHeadersContentLength);
        Util.skipAll(sourceNewFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        sourceNewFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (this.state != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        Headers headers = this.trailers;
        return headers == null ? Util.EMPTY_HEADERS : headers;
    }

    public final void writeRequest(Headers headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.state != 0) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.sink.writeUtf8(headers.name(i2)).writeUtf8(": ").writeUtf8(headers.value(i2)).writeUtf8("\r\n");
        }
        this.sink.writeUtf8("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }
}
