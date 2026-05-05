package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я|\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN2ZS@\u000fs{:&c$\bCC٥\"}8\tWȞog\u0005Jb\u000bI\u0011\u000e\u0016\u000fj4I[ye\u0012\u001d>JģG3[\u000eE9vt>\u000562*8\u007f\u0006\t\u001a@H\u0018v\u0001ES\f 7Hp@T\u0015M\u001b\u001a\u001a\u0006D'\t\u001ergV6Nnc^E݊!'rNU^h|\u000bK\u0007Wܮ\u0011vo\u001esVE6-%\u0002\u00057ViB\u001b? A5l5,CI\"]|lH*#2g\r\ftV`\u0013Tx\fU/\u007fgYX&(&\u0001B!\u0005\u0012\u001c\u000f?H\\/Jj\u0016\u0011Kt!W\u0007dJlP\n\u0013ad\u0019U\u0004A.Q\u001b\u0015U(OadE\u0007\u001d\rL%1r/^l\u000e\u000f\u0019KX\u0006]IQnJ\u000fbRgK{\u001cp\u0011\u0004Z\b>J\u0018/*\u0015t+mEiH;!\u001a\u0004xHuy\u001d`\u0017W0f\u0011h0~.7X\u000b<^Rg\u001dk~X\t0\u001f^4T5\u00108\u0017.o\u0010<O9@T]}\u0002lc\\8;uz\u007f\n|\u0003&Wg`c9_f(a\u0001zDCJs\u001dX\u0015T\u0004\u0010ho@\"`\\\u001b\u0016\u0006\u0011\\P\"\u0012`U\" B8I\u0019\u000b\"\u000f\u0017f`O\u0015!_\tj@\u0003b6<\u0003\u0018(%\r\u000fatp\u001ey)M:\u0010x\"[U\u0018Ia<c;\u00014+%7\u0003\u0002\u0003_gzK|p$\u0010m{N1`M\u001aEK/'~W421SO\u000be\u007fQB+\t\u0017\u0012\u000fi\u0004t{P\u0014~IxjxQ\u0005\u001b0yvrQ\f\u0015\u0004\b\u007f^zu\u0003\u0005\u001ai^a}\u0013`LSf\u001fġ#\u001e+$\u001eCCIuY5A.wB1Eekl\b.(f?*\u0003\u0004\u001c,\u001256v\u001a\u0007@`PI\b\u0001n&2o\u001bBvn(\fP/L\raoqs~~PX\u001b6\u000ek5@ޛtVa]A\u0011DHvu8\u001d[}B`s)\u001fPkg\u001cq{`\u0019p'\n9#w\u0003Z2KJnW\u0011\u000b`\n\u0002\u001bNAif5@\u0017OL,j4QW\u001dw\u0014=\u0013\u007fta?\u001b@E\f;\u0005\u0012\u001b\r%lV3xE\u000f#Z\u0005\r\u0012K\u001e'9a\t{Rl/\u0012?Gge\u001f)\u001ag~\u0015'[Hb<3(\u0007\u0005;Iksa\u0002d5\u000e=6y}>P\u0018+\u001fr\u001c)<i\u0011\u000ezvrSkr\u0002|v@h\u0003R0,\u0017z+\u0012l\u000e\u001d61O!\u001c)A\u0015\\\u0006k[\u001a/\u0019t-\u0015\u000f\u0015ct\u001fs\u001a}CK~\u0003\u0014U}\bWI\u0001  N+4x/ho\u000e\u0015\u0017$/\u0003,\u007fLz\u00027\u0015\u0001$\u00121bt!\u000e^\fDW\u001a30\u0019%m4\u0006/w?+\u001b\brOv{\"c\u001bg5iS\u0019tiny\u001d/\u0001!\u0017*e.A\\\u000b>\u001f[8X?\u0006Z)n7DAz)>Q\u0014l~ng[;/_q8\u001cI2h\u001d,Z@\nL8bd-;\u0005Onh\u0017_\u0005B\u0006\u0012%~ܓh4"}, d2 = {"\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000el", "", "u(E", "1`R5X\nH\\\u0018\u0003\nb6\u0006\u00056H\u00047", "", "1`[9", "\u001anZ5g;I!b\\ve3R", "1`R5X++S'\n\u0005g:|", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "1`R5X\u000fBb", "@db=b5LS", "1`R5X\u0014Ba'", "1`[985=", "1`[99(BZ\u0019}", "7nT", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "1`[9F;:`(", "1`]0X3>R", "1n];X*M3\"}", "7mTAF6<Y\u0019\u000eV]+\n\t=s", "\u001aiPCTuGS(H^g,\fv9c\u0006(\u000b\u001c\u007f\u0016$G}\u001c\u0012", ">q^El", "\u001aiPCTuGS(Hek6\u0010\u001d\u0005", ">q^Ab*HZ", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "1n];X*M4\u0015\u0003\u0002^+", "1n];X*MA(z\bm", "1n];X*MW#\bV\\8\r\r<e~", "1n];X*MW#\b", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1Q", "1n];X*MW#\bg^3|\u0005=e~", "2mb\u0012a+", "2n\\.\\5'O!~", "", "7mTA4+=`\u0019\r\tE0\u000b\u0018", "", "\u001aiPCTuGS(H^g,\fd.d\r(\nNV", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001du\u000b3\t@\u000f%\tKv\r:r24gS", "2mb g(Kb", ">q^El\u001a>Z\u0019|\n>5{", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", ">q^E\\,L", ">q^El\u001a>Z\u0019|\nL;x\u0016>", "@d`BX:M0#}\u000f>5{", "0xc266N\\(", "", "@d`BX:M0#}\u000fL;x\u0016>", "@d`BX:M4\u0015\u0003\u0002^+", "@d`BX:M6\u0019zy^9\u000bh8d", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "@d`BX:M6\u0019zy^9\u000bv>a\r7", "@db=b5LSu\tyr\f\u0006\b", "@db=b5LSu\tyr\u001a\f\u0005<t", "@db=b5LSyz~e,{", "@db=b5LS{~v],\n\u0017\u000fn~", "@db=b5LS{~v],\n\u0017\u001dt{5\u000b", "A`c6f-:Q(\u0003\u0005g\rx\r6u\r(", "AdRBe,\u001c]\"\bz\\;\\\u0012.", "6`]1f/:Y\u0019", "\u001anZ5g;I!bavg+\u000b\f+k\u007f}", "AdRBe,\u001c]\"\bz\\;j\u0018+r\u000f", "\u0011n\\=T5B]\"", "\u0014`RAb9R", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\nB%s$ EqYpԊ$\u07beSNo˧ĚN]"}, d2 = {"\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000eUtQw\u00198\u007f)?bS", "", "u(E", "\u001cN=\u0012", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000el", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ}ҿ\u0000iOӄtev-\u001ba8\u000f\u0004{b%\f(\u007fESUH\u0001h-ҐRk"}, d2 = {"\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000eUwCm\u001dF\u00049\u000b", "", "1qT.g,", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000el", "1`[9", "\u001anZ5g;I!b\\ve3R", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void cacheMiss(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callEnd(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callFailed(Call call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void callStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void canceled(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void dnsEnd(Call call, String domainName, List<InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void dnsStart(Call call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl url, List<Proxy> proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void requestBodyEnd(Call call, long j2) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestBodyStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestFailed(Call call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void requestHeadersStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyEnd(Call call, long j2) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseFailed(Call call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void responseHeadersStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void secureConnectStart(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
