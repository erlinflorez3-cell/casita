package okhttp3.logging;

import cz.msebera.android.httpclient.message.TokenParser;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
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
@Metadata(bv = {}, d1 = {"Я|\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0019\u007fјnjG0L͜P.hS2şs{J$c$wGCU0}*\tUPog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00154JoU3UoC:htD\u0011(݅*8\b#\t\u001a@H\u0018v\u0001FS\f(0Hp@X\u0015M\u001b\u001a\u001a\u0006D'\t\u001ergV6NmsŽ_#1hzMh =\u0003M\u001dJb'%v\u0010\u001fҋD7C\u0017mi\u0011\fj[m\touK\f\u0001'U3ywe?p\u007fB\u001fqcUs\u00011t\u0005\u007ff<+9V{K~\u0016X{\t\b%<2\u0018L;\u0011<;'~\b<9%vaGh\u0002\rJF\u000f*D%3\u00183Y?Kj_hS\u0019|?B\u0019U41\u0010\u0007!\nZ>d#\"lw\u007f9\u0002DKXf\n\bN4\u00189p\u0010<\u001c0u\u0006_\u007f\u001f5/%ec\u007f7iy\u0010[\\g%\u000b\u0011lapjHn*5*\u007fR\u0017 rD\u0013\u000b\u001cTb_D\u0011{$\u0005\u000b\f\u001d+ \u000b\u000el%3'fO\u0017\u0002\u001bSk#=1|6\b\t2\" ilNMQ\u0012\u0016\u0012V\u0005\u001bW<\u0011\r\tjPh$Z\u000b>R6V\u0002(w*\\~\u0012!KWs23ZKI`#X\u001b\u001epRC\u001d(xv,\u0017Ta*3m2{!\u0001~d!su\u000ea,+vR1OhM\u0019Tmh||\u00131$\u0017s.M\u0018PUS\u0005\u0016$],$$8QQ]\\Y#G?@\"EEzx\u0016U[\u0019?z+\u0002??vL\u007f\b\u0019\u0010rt3n]u/\"%d#'\u0016k\u0018y\u0010N+Kqv#[ll#\rg`f>\r\u0007/\u001eS'\u001eGCIuY5D.wB5Eekp\b.(j?*\u0003\b\u001c,\u001296v\u001ak@cPI\b\u0005n&2\u0016\u001bBv\u000e>\b\u000b-B7KHoj!ZFT#/,n70\u001b\u001cn[h? \bB[w0\u0004E\u000e\u0014\r[S6\u0014g0\u0004{yt\u000bx\u0015:\u000f\n8\u0007\u0012JEPZe\u000e!04 ^J\nQp4T\tR:\\@\u0016\u0012[T\u0018\u000e@~\u000evw\u000fE6\t\b\u0004d\u001c\u0006\u0011\\\u0005N5dSg9*/\u0007UGf\u000fCc\u001dmtZ_g@\bk\u001d7#\u001bS\rv=+re\u007f/pn\u000f>]]qO2:\u0012NAm\u001aw<<&15BFP\u007feYm\u0005fv\u000b\u0004j~h\u0005\u0019~R|*o\u0013C\u0013\u001cs\"\u000f9\u001f\u007fv}iEL|\u007fgG(1/DW\u000bR\u0011,T)e\u001e5[Cyn\".\u0014W\u0002CD\u001ch65=\r!\u000b]>j\u0018d3:DyFf\u0010\u0019+PN\u0015t^=\t\u0018h 6}\bc\u0006!eqk&)p+9x\u001eByr?\u001e,zq*m\u000b1laZ\buEPK\u0011mav)f\u0017R\u0011\u0002&\t\u0015\u000e\u001b-&M>8f7\u001cgc\u0017z2c$%9l\u0004*\u00107`V,\u00057y$\fZZ6SSXc=\u0013H#\u0001\u000be\u001c\u001f\u0003(\u0013z<-\"\u0004\u0017H\r\u0019YH\u0017~,dG7G 2ƯIֿ\u000b\u0004MÒv-?UW\u001be6a£4϶\u0015\u0003BŇ߶\u0004l"}, d2 = {"\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/f2}B\u0005 \u0019'\u0001\u000eE\u0006\f9g\r @m#\u0004", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000el", ":nV4X9", "\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/b7\u000bKg!\u0019Is\u0017>Z.DY\u000b\u001e7x%8Z\u0002\"u6 \u0015u7", "uK^8[;M^fH\u0002h.~\r8gI\u000b\u000bO\f}!Iq\u0012Ex\t>h}-5m!=WPyR> \u0017hn\u000fJT", "AsP?g\u0015L", "", "1`R5X\nH\\\u0018\u0003\nb6\u0006\u00056H\u00047", "", "1`[9", "\u001anZ5g;I!b\\ve3R", "1`R5X++S'\n\u0005g:|", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "1`R5X\u000fBb", "@db=b5LS", "1`R5X\u0014Ba'", "1`[985=", "1`[99(BZ\u0019}", "7nT", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "1`[9F;:`(", "1`]0X3>R", "1n];X*M3\"}", "7mTAF6<Y\u0019\u000eV]+\n\t=s", "\u001aiPCTuGS(H^g,\fv9c\u0006(\u000b\u001c\u007f\u0016$G}\u001c\u0012", ">q^El", "\u001aiPCTuGS(Hek6\u0010\u001d\u0005", ">q^Ab*HZ", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "1n];X*M4\u0015\u0003\u0002^+", "1n];X*MA(z\bm", "1n];X*MW#\bV\\8\r\r<e~", "1n];X*MW#\b", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1Q", "1n];X*MW#\bg^3|\u0005=e~", "2mb\u0012a+", "2n\\.\\5'O!~", "", "7mTA4+=`\u0019\r\tE0\u000b\u0018", "", "\u001aiPCTuGS(H^g,\fd.d\r(\nNV", "2mb g(Kb", ":nV$\\;AB\u001d\u0007z", ";db@T.>", ">q^El\u001a>Z\u0019|\n>5{", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", ">q^E\\,L", ">q^El\u001a>Z\u0019|\nL;x\u0016>", "@d`BX:M0#}\u000f>5{", "0xc266N\\(", "@d`BX:M0#}\u000fL;x\u0016>", "@d`BX:M4\u0015\u0003\u0002^+", "@d`BX:M6\u0019zy^9\u000bh8d", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "@d`BX:M6\u0019zy^9\u000bv>a\r7", "@db=b5LSu\tyr\f\u0006\b", "@db=b5LSu\tyr\u001a\f\u0005<t", "@db=b5LSyz~e,{", "@db=b5LS{~v],\n\u0017\u000fn~", "@db=b5LS{~v],\n\u0017\u001dt{5\u000b", "A`c6f-:Q(\u0003\u0005g\rx\r6u\r(", "AdRBe,\u001c]\"\bz\\;\\\u0012.", "6`]1f/:Y\u0019", "\u001anZ5g;I!bavg+\u000b\f+k\u007f}", "AdRBe,\u001c]\"\bz\\;j\u0018+r\u000f", "\u0014`RAb9R", "=jWAg7\u0006Z#\u0001|b5~P3n\u000f(\t>\u0001\"&Q|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜NBhݷZ\u000f\u001azt3a)\u0002IAU(}:\t}O˗knX\\SQ\u001d\t.x\u00190yY\u0007b*\u000f`H6S\u0004Y}=Q`#7[ږ4ŕ<y\rЏʆ.O"}, d2 = {"\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/f2}B\u0005 \u0019'\u0001\u000eE\u0006\f9g\r @m#l.?9z>+)>", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000eUwCm\u001dF\u00049\u000b", ":nV4X9", "\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/b7\u000bKg!\u0019Is\u0017>Z.DY\u000b\u001e7x%8Z\u0002\"u6 \u0015u7", "uK^8[;M^fH\u0002h.~\r8gI\u000b\u000bO\f}!Iq\u0012Ex\t>h}-5m!=WPyR> \u0017hn\u000fJT", "1qT.g,", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000el", "1`[9", "\u001anZ5g;I!b\\ve3R", "=jWAg7\u0006Z#\u0001|b5~P3n\u000f(\t>\u0001\"&Q|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Factory(HttpLoggingInterceptor.Logger logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.logger = logger;
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }

        @Override // okhttp3.EventListener.Factory
        public EventListener create(Call call) {
            Intrinsics.checkNotNullParameter(call, "call");
            return new LoggingEventListener(this.logger, null);
        }
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger);
    }

    private final void logWithTime(String str) {
        this.logger.log("[" + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs) + " ms] " + str);
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(Call call, Response cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        logWithTime("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.EventListener
    public void cacheHit(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        logWithTime("cacheHit: " + response);
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        logWithTime("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        logWithTime("callEnd");
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        logWithTime("callFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.startNs = System.nanoTime();
        logWithTime("callStart: " + call.request());
    }

    @Override // okhttp3.EventListener
    public void canceled(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        logWithTime("canceled");
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        logWithTime("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        logWithTime("connectFailed: " + protocol + TokenParser.SP + ioe);
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        logWithTime("connectStart: " + inetSocketAddress + TokenParser.SP + proxy);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        logWithTime("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        logWithTime("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String domainName, List<? extends InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        logWithTime("dnsEnd: " + inetAddressList);
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        logWithTime("dnsStart: " + domainName);
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(Call call, HttpUrl url, List<? extends Proxy> proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        logWithTime("proxySelectEnd: " + proxies);
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(Call call, HttpUrl url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        logWithTime("proxySelectStart: " + url);
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j2) {
        Intrinsics.checkNotNullParameter(call, "call");
        logWithTime("requestBodyEnd: byteCount=" + j2);
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        logWithTime("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void requestFailed(Call call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        logWithTime("requestFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        logWithTime("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        logWithTime("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j2) {
        Intrinsics.checkNotNullParameter(call, "call");
        logWithTime("responseBodyEnd: byteCount=" + j2);
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        logWithTime("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void responseFailed(Call call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        logWithTime("responseFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        logWithTime("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        logWithTime("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        logWithTime("satisfactionFailure: " + response);
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
        logWithTime("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        logWithTime("secureConnectStart");
    }
}
