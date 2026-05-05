package okhttp3;

import com.dynatrace.android.callback.OkCallback;
import io.sentry.ProfilingTraceData;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
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
@Metadata(bv = {}, d1 = {"Яŵ\u0014D57\u001eq\u007fR\\kt\u001aA\u000e0!.J~(,\u001aw\u001dfr96DmHDR[*\u0015k\u00044:[,qI;]\u001a\f(\u0011OTgon`Z\u0013C\u0015\u0006\u001ex\u0001,QU~^\u001a\u000fHBw?9Mw=G~|6\u001b :\">y\r\u00010*P\u0010|zKK\"\u00128@v:Z\rc\u0005\"\u0012\f>(\u00014\\oN<Ht]H8+\u0003oCV'u0\u0005M\u0013F\\'#viӜ3@E<\u001d%Y\u0005\u000fRq?\u000bӊy=\u001bh/'1J{WLX\b\u0014\u001b-W\rsr.\\\u000bRh\f=+WcQP\u0016(\u000ez\u0004\rB\u0006\u0016\u0006=H6- w\u0010\u000eItzԟHP\u0018^Jȕ\u0003aL\u0017-Į;+O\u001bnQgC!NE{\r\r$%\u0007\u00037żr\u0006\u0011\u0015IS(Q_Qp=vOBY4eDuh\u0016ò\b0U\u0002o\t\u0017ф')E^Q#OoɘLDu{MkvY\u0002RvGhsގ;*\u000f]#Qr\u000e\u0004RjWZ\u001b\u0014!Τ\u000b}\u000eehg\u0006H9%>[\u0016mȬnMc]m:tIqn\u001a!\u001e>ӷ75W8Xl`\f,?joK]ڋFS\u00120%30H`j>\u000fBI«\u0010\u00138\u0016:-BEI\u001fl\u0017X\u0003L]o\u0017Od˖l\u0010\u0005,{/\u0011\u0007<t7\u001f\u0017aʼsg~\"t\bnBEA\u007fV_+Ɓ&h:Vk\u0012\r\u0017\u0018G\u0016p\u000eQ̡\u001au[Vh!(_i/k:U\u0004Ȟ6\u00023!\u0015}sze\u0012U%C~ӛ?h4DPu~Xxjxy\u001b\u001cȔz^x\u0001Po\u000e'yF)u*Yߏ_>OQKjJ~P\u0003\u0015!.%/!P\u0017{2ϡ+\u001d\u001cW\\@#\u0017uo\u007f0\nb=W#\u007fJ1І\u001aoh2&8I\u001aaY-Bh85\u0011P+\u0003w6&98\u001b\u0018`A\u0013V\u001dL\u0016!=d~\u0007Zt!Zi\u001f+o,\u001a^c8\\[}BH\n9YXa\u001e\u0006myiQO؝\u000e\u000b\u0002\u001c7#*t8\\gd\u001904,FP\b@ك\t<\u000f\u0010|9JA#Ejh4JA\u0005ʮc\u000f\u001d\u001f\u000b~I\u0013&T'c\u001dMϖdEf\u000fr\f\rLK\u001e'sw\n֪JT5Rz\fa]!\u001b\u0019\\Ekު/DZ)c3fB#E\fm\u0010\u0007\u0530\bG/^4z\u001a~0|K\n^ ʦU\u0011ehxi\u0019\u001f|N\u0013AXkŽR\"/qC\u0003\u001c0\"\u000f9\u000e\u0016r8m;\u001afweP`\u0006ӢH)\r\u0002MtT!E\u0006c4s\u000fހ\u0018-\u0004ߺk=\u0004\u000e.(w\u0017\u0003*tY$e8gQ\u007fϦu\u001cjկ!\u0015V)\u00129\u001b\u0006\u0001\u0016F\bd\\8xě\u0017daŕ\u0010#F39zVUYw\u0011\fyk\u0012~\fPөj7^ҳ\u0007/V,\u00178\u001e?!jr:?fV\u001eӜ\u0004\u001a\u001dұ78\u000et7$ tv\u0006\u0004O\n\u001aat֗.g9Èj \u00044\b\u0004T;b>-;\u0005dt*Ԛ`rJĠ&`p>r\r\\@\"\u0016\u0017Nn\u0013#4t\u000eL~e|ق#a\u0015ӑx\t\n^WBqB`\\37`)&m϶\u0015\tBŇ\r\u00020_\u0017\u0012Px:M^Tk;]\u001fޡqj\u000b\u0379cG>b\u0016Na\u001f\u001fRr8Nb\u0013_̄?W;߿1\u0013\u00078F+@\u0018'[\u0003Q\u0002L`FϘ\u0005\u0013GƗIm@\u001aE\u001bs@\u001d\u00193W\u0015e[zְP-\u0014\u058b}L\u0005vq\u0002_r:uMEL$\f\u0006·\u000e%,ڎ\u001ew),S\\\u0019;m\nXV\"\u0006:kń:tLì_n~!\u0018[:/\u0002\u0015sgDC\u000b\u0014GulDc2خISpݟ#F\u0013u\"S_\u00177e/|>\u0003(\u0006\u0557MxUҍt_BE\u00028\u000bIok\u0012MP[:\u0006[C\u0003}!0ҦUe\u0018ؾ*\u000f\u00139\u0006M#q\u000e\u00175\u0018UX-\fր`~Uکz\rFE2l~Y\u001aB\u001e\u001c>J'\u0002,\u0003\u000f/Ix˝wGÖn}'T\u001fwu\u00193!\u0003IUT \u0013s~ߵ\u000fsRկMgb>c\\\u001cu9Q\u0018jY5}\u001cð\u001e0`ƙ&Gj\u0005\u001eLIU6+H0^\u000f5 \u05cfa\u0007$\u05fbUW\u001b#\rq3Hi%)+ed%\u0018ї'3\u0001ߏ\u001b\u0012GY!\u0019ndGs;s;[tAţ`O]ޮ\u0006K\u0016Douq>\u0014\u0002GAy0ʂiE!ًW\u0001\u0012d5iV$2)\u007f\u0013\u0018UX%̿P<^ʷ`M_Wt\u000b;\u001e\t>$.:\u0003\fKܖ\n\u0015z\u001e;\u0005m\f|<~U_Q\u0001zX0FјvʡQE3ܲiO??)c}lJ4Ӑ`^F܂o(F`\u0010(m9oJ`+F\u0016\u00043$0ԷXf\u0019מLm63\bCڹh7"}, d2 = {"\u001anZ5g;I!bh\u0001A;\f\u0014\rl\u0004(\u0005OV", "", "\u001anZ5g;I!b\\ve3;i+c\u000f2\tTV", "\u001anZ5g;I!bpz[\u001a\u0007\u00075e\u000ff\\<~&!T\u0004c", "u(E", "0tX9W,K", "\u001anZ5g;I!bh\u0001A;\f\u0014\rl\u0004(\u0005O?s'Kv\r<\u0004z", "uK^8[;M^fHdd\u000f\f\u0018:C\u0007,{I\u0010UsWs\u0015;v2\u000b\u001dn", "/tc5X5MW\u0017z\nh9", "\u001anZ5g;I!bZ\u000bm/|\u0012>i}$\u000bJ\u000el", "u(;<^/Mb$LD:<\f\f/n\u000f,y<\u0010!$\u001d", "1`R5X", "\u001anZ5g;I!b\\v\\/|^", "u(;<^/Mb$LD<(z\f/;", "1`[9G0FS#\u000f\nF0\u0004\u00103s", "", "u(8", "1daA\\-BQ\u0015\u000ez</x\r8C\u0007(wI\u0001$", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI7\u0003NJt\u0017T~\u0012=z#1h}}:i\u001a7+J;g=\u001e\">", "u(;<^/Mb$LDb5\f\t<n{/EO\b%`%o\u001bKz&9Wy/7K\u0019*QL\u0019r4\u001a\u001ehn\u000f", "1daA\\-BQ\u0015\u000ezI0\u0006\u0012/r", "\u001anZ5g;I!b\\zk;\u0001\n3c{7{+\u0005  G|c", "u(;<^/Mb$LD<,\n\u00183f\u0004&wO\u0001\u0002\u001bPx\u000eIL", "1n];X*MB\u001d\u0007zh<\fp3l\u0007,\n", "1n];X*MW#\beh6\u0004", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1fJ\u000b\u001el", "u(;<^/Mb$LD<6\u0006\u0012/c\u000f,\u0006Ik!!NE", "1n];X*MW#\bhi,z\u0017", "", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1iK\u0001\u0015l", "u(;7T=:\u001d)\u000e~euc\r=tU", "1n^8\\,#O&", "\u001anZ5g;I!b\\\u0005h2\u0001\t\u0014a\r}", "u(;<^/Mb$LD<6\u0007\u000f3ed$\t\u0016", "2hb=T;<V\u0019\f", "\u001anZ5g;I!b]~l7x\u0018-h\u007f5Q", "u(;<^/Mb$LD=0\u000b\u0014+t}+{MV", "2mb", "\u001anZ5g;I!b]\u0004l\u0002", "u(;<^/Mb$LD=5\u000b^", "3uT;g\u0013Ba(~\u0004^9]\u0005-t\n5\u0010", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000eUwCm\u001dF\u00049\u000b", "u(;<^/Mb$LD>=|\u0012>L\u00046\u000b@\n\u0017$\u0006P\n:\u0006/BmS", "4n[9b>+S\u0018\u0003\b^*\f\u0017", "", "u(I", "4n[9b>,a kz]0\n\t-t\u000e", "6nbAa(FS\n~\bb-\u0001\t<", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u0012o\u000e7\u0005<\t\u0017\bG|\u0012=z%B/", "u(;7T=:fb\bzmu\u000b\u00176/b2\nO\n\u0013\u001fG`\u000eIz&9Y\u000bu", "7mc2e*>^(\t\bl", "\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t\u0016", ";h]$X),]\u0017\u0005zm\u0014|\u0017=a\u0002(jJ^!\u001fR|\u000eJ\u0005", "", "u(9", "<dcDb9D7\"\u000ezk*|\u0014>o\r6", ">h]4<5MS&\u0010ve\u0014\u0001\u00106i\u000e", ">q^Ab*HZ'", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", ">q^El", "\u001aiPCTuGS(Hek6\u0010\u001d\u0005", "u(;7T=:\u001d\"~\n(\u0017\n\u0013ByU", ">q^El\bNb\u001c~\u0004m0z\u0005>o\r", ">q^El\u001a>Z\u0019|\nh9", "\u001aiPCTuGS(Hek6\u0010\u001d\u001de\u0007(yO\u000b$l", "u(;7T=:\u001d\"~\n(\u0017\n\u0013Bym(\u0003@~&!TE", "@dP1G0FS#\u000f\nF0\u0004\u00103s", "@dc?l\u0016G1#\b\u0004^*\f\r9n`$\u007fG\u0011$\u0017", "@ndAX\u000b:b\u0015{vl,", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0012?i\r \u0016i%*J?Ik\n", "5dc\u001fb<MSwz\nZ)x\u0017/", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~F\b0Fmt*\\?8gB\u001ej", "AnR8X;\u001fO\u0017\u000e\u0005k@", "\u001aiPCT?\b\\\u0019\u000eDL6z\u000f/t`$yO\u000b$+\u001d", "u(;7T=:fb\bzmuj\u0013-k\u007f7\\<~&!T\u0004c", "Ar[ b*DS(_v\\;\u0007\u0016C", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&(k\fK\u00012I/", "u(;7T=:fb\bzmu\u000b\u00176/m\u0016b.\u000b\u0015\u001dG~n8t4?f\u0012u", "Ar[ b*DS(_v\\;\u0007\u0016CO\r\u0011\fG\b", "EqXAX\u001bB[\u0019\t\u000bm\u0014\u0001\u00106i\u000e", "F4\u001f\u0006G9Na(fvg(~\t<", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\"5J{jM\u0011%&/k\u00178x%B/", "u(;7T=:fb\bzmu\u000b\u00176/rwF\u0014o$'U~u8\u007f!7Y\u000bu", "zcT=e,<O(~yX(\r\u00182e\t7\u007f>|&!T", "zcT=e,<O(~yX*x\u00072e", "zcT=e,<O(~yX*x\u00106T\u00040{J\u0011&~Kv\u0015@\u0005", "zcT=e,<O(~yX*|\u0016>i\u0001,y<\u0010\u0017\u0002Kx\u0017<\u0004", "zcT=e,<O(~yX*\u0007\u00128e}7jD\t\u0017!W~u@},9g", "zcT=e,<O(~yX*\u0007\u00128e}7\u007fJ\n\u0002!Qv", "zcT=e,<O(~yX*\u0007\u00128e}7\u007fJ\n\u0005\"Gm\u001c", "zcT=e,<O(~yX*\u0007\u00135i\u007f\rwM", "zcT=e,<O(~yX+\u0001\u0017:a\u000f&~@\u000e", "zcT=e,<O(~yX+\u0006\u0017", "zcT=e,<O(~yX,\u000e\t8tf,\nO\u0001 \u0017TP\n:\u0006/Bm", "zcT=e,<O(~yX-\u0007\u00106o\u0012\u0015{?\u0005$\u0017E~\u001c", "zcT=e,<O(~yX-\u0007\u00106o\u0012\u0016\nGm\u0017\u0016K|\u000e:\u00063", "zcT=e,<O(~yX/\u0007\u0017>n{0{1\u0001$\u001bHs\u000eI", "zcT=e,<O(~yX0\u0006\u0018/r}(\u0007O\u000b$%", "zcT=e,<O(~yX5|\u0018Ao\r._I\u0010\u0017$Eo\u0019K\u00012C", "<df\u000fh0ER\u0019\f", "<df\u0010T3E", "\u001anZ5g;I!b\\ve3R", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "<df$X),]\u0017\u0005zm", "\u001anZ5g;I!bpz[\u001a\u0007\u00075e\u000f}", ":hbAX5>`", "\u001anZ5g;I!bpz[\u001a\u0007\u00075e\u000f\u000f\u007fN\u0010\u0017 G|c", "zcT=e,<O(~yX7\u0001\u00121I\t7{M\u0012\u0013\u001e/s\u0015Cz3", "zcT=e,<O(~yX7\n\u0013>o}2\u0003N", "zcT=e,<O(~yX7\n\u0013By", "zcT=e,<O(~yX7\n\u0013By[8\u000bC\u0001 &Km\nK\u00012", "zcT=e,<O(~yX7\n\u0013Bym(\u0003@~&!T", "zcT=e,<O(~yX9|\u0005.T\u00040{J\u0011&~Kv\u0015@\u0005", "zcT=e,<O(~yX9|\u0018<yi1YJ\n \u0017E~\u0012F\u007f\u00061]\u00050Dm", "zcT=e,<O(~yX:\u0007\u00075e\u000f\tw>\u0010!$[", "zcT=e,<O(~yX:\u000b\u0010\u001do}.{Oa\u0013\u0015Vy\u001bP", "Dda6Y@\u001cZ\u001d~\u0004m\u001a\f\u0005>e", "", "zcT=e,<O(~yX>\n\r>en,\u0004@\u000b'&/s\u0015Cz3", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;
    public static final Companion Companion = new Companion(null);
    private static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яſ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H\u007f*,(w\u000ffp<8D{H6RY-\u0017k\n:,[*tK;k\u001a\u0006\"\u000fRVg}nRZ\u0011I\u0017\u0006,xr,OX\u0001] -:B\u0006?;Mu@A`\u000b6\r 8%@y\u001b\u0001\"*N\u0013~zYK\u0014\u00126Cx:h\rU\u0005 \u0015\u000e>.\n&\\mT>H\u0003]B/)\u0006qB\\Fg0\u0013M\u0015FZ'\u0015vo%3@==\u001d%i\u0003\u000fRa@\u000b?\b=\rh--3I\nW>X\u0006\u001d\u001d+e\rer,_\rQv\f/+UfSP$(\u007fz\u0002\u0013D\u0004$\u0006/H41\"f\u001e\u000e;t\tSHP\u0018^J\u007f\u0001a>\u0017;\u007f;+?\u001fnQw;!N={\r\r4#\t͙)[j\u000eh\u0015!X\u000e\u0383aQn<\t[\u0010gMq\u0012pz\u0002X\u0005ΥK\u007f=}Q1ϲ)7i<k^yɔG\\g%ݓ\u0011\u0011Yk`͒?:\u0010&L:\u001c:ʐC\u0081\txVԜW<\u0019SɠS\u0017\u0001\u000e\u0019FϤvL$5\u0011|ўg\u0018ҵL$܋+ĽeŽ֍rl\u0014Ċ8'ACɀb(a\u0001ΘDDJН\u0004pfp/T\u0018j͎!JH\u0019ݘ($JP\u001aƮ1W\u0013,I<DGÄ\u0014Ƞ\u0007+H˩{\u0019g`Ӵ\u000f\u000fW9*)Ȓ#\u0005\f\u0011Q\u000bʿn\u0016֏HrʑfŮ,ۋپ9\u001a,ƈ!1B\u000bɦ\u0006\u0017s.ø\u0018QUƪk.u\u0004Wh\"(=i/kП?\u000376\u001a-sQ;j_̒\u0011?z+zWIv8\u007f\b\u0019ѱ\\fxTgV-!%i;3\u0016t\u0018y\u0010¿+MqӦ\ns?wά\u0002 A\u0017O\u000b\u00157\u001eS˚ '\u000b\u07b4,['Kt(\u001a=ׁ`uj\u001eгx+\u001b4\u0011}\u0004ZϣFspmu2iU\u0012i\r`:$\u001b×rNx͗\u0007Z\nb٬2\u000fF-\bdZe\u000b]̎\u0017\f:ަon[hq \u0004Bˌ^BtqΏ\u0013'O36eS\u0016ƚ\u001eOj0b\u000f81DC|=4=N݈\bl\u0017[\u001ey(8Q;\u00112j5l@:n \u000bqҍ\u001a\n\u001e-\u0018F\u000eB_>P,SV<֊)`d\u0001\u001d`s\u001ai6\u000f='3L֭e5\u0013,^T]#z\u0010a©\b3j}ƫ\u0017+9؍SQ\u001cV¡\u007fSQk\ba\u0002dߤw-{0\b\ff]E)Pb39\u007fΙ\u0010z>)#U\u0013\u001a-\u0004 7jNPĖ/\u007f\u000bʍ;\"\u000f9d\u0018~}6EL|ߗgG(T/DW[T\u0007q 33\u00167==wFB\u0002Dda\u0019\u0016\bNéW\t\u0003֙[o\u000e\u0015h&%Hy\n\u001cr\u0004\u0019\u0013~{2\t\u0013\u0005\u0001oF\bdО29\u0010ծ]ql&̧?m05\u001dP1\u0001x8ɨ\u001dh|Ϟ\n\u001bf_5*t;ȏ\u001c!({݈\u0012!lHyk \u0007ҹ0\u001e#\u000f7<\u0018d9\u0010}M\u0017\u001d4]iyC/\u001aˋ\u00127>?6\u007f5x$qr`6\bSV{˾\u0015\rj_ZW<c34rj$)BΙ/Ll\u0007+4tift=31\u001f\nƬwf\u0015˃Da'OܽQ\u0006 \u007fI\u0019k@v?ܛjg\u0003˂)Z\t!^\u00182;ĤSU\u001bUۂ#6r\u0011ͺJ]8p݊\\\u0016\u001cĲ.r8N\n%)*ԧPKAGֆ1\u001bFۗn\u001f\u001acւP\u001c68ʾ{\u0019\rmƗaqHޟ6\u000b$]ݺna\\/T3̕dd':\u058b\u0016P\r߭bn\u0010\u0010σHeK,ÐTX\u00018ڄ#l\u0017\u0004\u0094~]1v߫\u0010bNҞro\u0005TŎ55Ik_zՃr\",\u0018Ѣ$iiɓ3YzBwtD8̤k\u001fF{˸x[\\\u001bI,7=\u000b\u007fؕ#ϧ\u0014[y˟CKxS=c}>\u0019{\u0012C\u0003{D\u0004_Bo)48h˨oènyY̙(:\u0018\u0019\u001b\u0011\u00183Xn\u000eom05[\u000fFdmO\u0091MǶ\u000fL\u0017ěv0H\u001e\u0019\u001960N+\u0010\u0013\u001bz#)KI\n@u)-»-ͻ\u0015g-̵=ip_Mn\u0012ZCSA&>bfQ}\\3rwʀpƶ\u0019\frݜFI\\\\(Ix\b\u0014eri`\\\u0007f@m^A\u0007ɰ\u000b\u0082Gi\tߵ7?[8s\u0012Rd=\u007fr&{Oe\u0014jUQSOߐ\u000fߓE%\u001bǺ6U?Y1\u001c-3D%\u0016\u0007\u001as\u000b\u0019a\u0016\u0013cZ!]3m[\u0018ٜxʂiK!ًW\u0001\u0012N5S&\u0015*\u0013uD:&0\u0012\u001bLd\n\u007fڰWá\u0015rJب'|z@<AXW\fs\u0014H34Csw@ZgGĥSۅn\b2ڜ\bhz\u0014[\u0001Kw\u001fz?/a{]\u001e,n\u007f\u001c/Ƅ#Ѝ*L\u001b˫2\u001f,\"\n\nI2\u001d\u0018q1;\fb%)Yb1\u0007ٚ\u0006ܛjpF͔V>N3'.o\u007f!\u001aR,Yx~\u0013Y\u0010\u00118\u0003ȰBƕn%\tͻcc\u001d`E\u0012\u0017%m\u0002Hq2:a.=GxQdÏmߢ\u0019\beեN\u000fu}\u000bb%@lE\u0012<Ue>W\u0004/`\u001b1ݱ(\u07b2^3uș ,\u0014a\u000b[LpY*_No\u000brX;$*Cg9u|A]oھ\nȲQ^\u0003ьp^+\u000b\n5o*PYMloRRيcƖS@eϰA\u007foW.m\f\u0014\nEX\u0006 \u0002ptu4]y\u0017Yj5o\\`ާ+Ά\f\u001b/ܝ`6P\u00170RQ'D}bf\u001d\n{ߐq\u05eb3\u0001}ʴJoDZtp\b6G%crOc;\u0018\n\u000e[K}~Y1<ulΛ[ٜq\u0002cʕl\u00188q}3Q\u0012yLisg\u0012\u0016OLmPzupjӴWӼ\u001efn\u05f9\u0005xVP\u001e-6\u000f\u001auLey;N\u0018w`\u0016\u0005\u0012ˁ|Ǜ;]Mژ#F\u0017\u001cn9^\u0014\u0015=fo^5\u0010zcf0\u0015g<OܫWѧ_\u0010oЇi$m@y!O\f}\u0010D\u0018PMG\t\fP\rF>ϩ\u0015Ր'\u001a/Ӌg\nw-@Z}\\&-i\u001d^etǞO%A58\u0005֗\u0003݆\u001bM\u001dͽBH(ŁBsf\b\b<ɖ:k8$\u0005\tʍms^=/,և iԴ+י\u00124\u0010ؓ\r_:Ѣt\u000fΆG3\u0010 ä-\u0016ê\u00046j\u0013Ġ\tY2mؙooݧ\u0004ҥbR\rʘ=%.ӯ\u00176߆k3s\u001bܤ!Qדuk\u000e\u0017\u0080\u001ba(\u001f,\u007fȜypĝ\u001c٣Y Gԁ+fdݰ~/ϋ/Pw\u000f۟K{ߣ-;\u000bxð](O M4̴\u0004ĔI6\u0018ʟj>\u001aߌ[R:{+J݉\r,4zD@ҬmH\u001erg,ßu)װ\u001eī8~=үX91ŏ\u007f4ބ\u007f)'c˽\u0013LϻT܊d\u0014nyVمB\rsʉmϥ\u0007"}, d2 = {"\u001anZ5g;I!bh\u0001A;\f\u0014\rl\u0004(\u0005O?s'Kv\r<\u0004z", "", "=j7Ag7\u001cZ\u001d~\u0004m", "\u001anZ5g;I!bh\u0001A;\f\u0014\rl\u0004(\u0005OV", "uK^8[;M^fHdd\u000f\f\u0018:C\u0007,{I\u0010lZ8", "u(E", "/tc5X5MW\u0017z\nh9", "\u001anZ5g;I!bZ\u000bm/|\u0012>i}$\u000bJ\u000el", "5dc\u000eh;AS\"\u000e~\\(\f\u0013<$\n.~O\u0010\"", "u(;<^/Mb$LD:<\f\f/n\u000f,y<\u0010!$\u001d", "Adc\u000eh;AS\"\u000e~\\(\f\u0013<$\n.~O\u0010\"", "uK^8[;M^fHVn;\u007f\t8t\u0004&wO\u000b$l\u000b`", "1`R5X", "\u001anZ5g;I!b\\v\\/|^", "5dc\u0010T*ASW\t\u0001a;\f\u0014", "u(;<^/Mb$LD<(z\f/;", "Adc\u0010T*ASW\t\u0001a;\f\u0014", "uK^8[;M^fHXZ*\u007f\t\u0005)p", "1`[9G0FS#\u000f\n", "", "5dc\u0010T3EB\u001d\u0007zh<\fG9k\u00037\u000bK", "u(8", "Adc\u0010T3EB\u001d\u0007zh<\fG9k\u00037\u000bK", "uH\u0018#", "1daA\\-BQ\u0015\u000ez</x\r8C\u0007(wI\u0001$", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI7\u0003NJt\u0017T~\u0012=z#1h}}:i\u001a7+J;g=\u001e\">", "5dc\u0010X9MW\u001a\u0003xZ;|f2a\u00041YG\u0001\u0013 G|LF|(Dh\t", "u(;<^/Mb$LDb5\f\t<n{/EO\b%`%o\u001bKz&9Wy/7K\u0019*QL\u0019r4\u001a\u001ehn\u000f", "Adc\u0010X9MW\u001a\u0003xZ;|f2a\u00041YG\u0001\u0013 G|LF|(Dh\t", "uK^8[;M^fH~g;|\u00168a\u0007q\u000bG\u000f`tG|\u001d@w)3U\r \u0015p\u00122V!Bk0'\u0015u7|w", "1daA\\-BQ\u0015\u000ezI0\u0006\u0012/r", "\u001anZ5g;I!b\\zk;\u0001\n3c{7{+\u0005  G|c", "5dc\u0010X9MW\u001a\u0003xZ;|s3n\t(\t~\u000b\u001d\u001aV~\u0019", "u(;<^/Mb$LD<,\n\u00183f\u0004&wO\u0001\u0002\u001bPx\u000eIL", "Adc\u0010X9MW\u001a\u0003xZ;|s3n\t(\t~\u000b\u001d\u001aV~\u0019", "uK^8[;M^fHX^9\f\r0i}$\u000b@k\u001b Po\u001b\u0012:\u0016", "1n];X*MB\u001d\u0007zh<\f", "5dc\u0010b5GS\u0017\u000eib4|\u0013?t>2\u0002C\u0010&\"", "Adc\u0010b5GS\u0017\u000eib4|\u0013?t>2\u0002C\u0010&\"", "1n];X*MW#\beh6\u0004", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1fJ\u000b\u001el", "5dc\u0010b5GS\u0017\u000e~h5g\u00139l>2\u0002C\u0010&\"", "u(;<^/Mb$LD<6\u0006\u0012/c\u000f,\u0006Ik!!NE", "Adc\u0010b5GS\u0017\u000e~h5g\u00139l>2\u0002C\u0010&\"", "uK^8[;M^fHXh5\u0006\t-t\u00042\u0005+\u000b!\u001e\u001d3~", "1n];X*MW#\bhi,z\u0017", "", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1iK\u0001\u0015l", "5dc\u0010b5GS\u0017\u000e~h5j\u0014/c\u000ef\u0006F\u0004&&R", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u0010b5GS\u0017\u000e~h5j\u0014/c\u000ef\u0006F\u0004&&R", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "1n^8\\,#O&", "\u001anZ5g;I!b\\\u0005h2\u0001\t\u0014a\r}", "5dc\u0010b6DW\u0019cvkj\u0007\u000f2t\u000f3", "u(;<^/Mb$LD<6\u0007\u000f3ed$\t\u0016", "Adc\u0010b6DW\u0019cvkj\u0007\u000f2t\u000f3", "uK^8[;M^fHXh6\u0003\r/J{5Q\u0004q", "2hb=T;<V\u0019\f", "\u001anZ5g;I!b]~l7x\u0018-h\u007f5Q", "5dc\u0011\\:IO(|}^9;\u00135h\u000f7\u0007", "u(;<^/Mb$LD=0\u000b\u0014+t}+{MV", "Adc\u0011\\:IO(|}^9;\u00135h\u000f7\u0007", "uK^8[;M^fHYb:\b\u0005>c\u0003(\t\u0016D\b", "2mb", "\u001anZ5g;I!b]\u0004l\u0002", "5dc\u0011a:|]\u001f\u0002\nm7", "u(;<^/Mb$LD=5\u000b^", "Adc\u0011a:|]\u001f\u0002\nm7", "uK^8[;M^fHYg:RL ", "3uT;g\u0013Ba(~\u0004^9]\u0005-t\n5\u0010", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000eUwCm\u001dF\u00049\u000b", "5dc\u0012i,Gb\u007f\u0003\tm,\u0006\t<F{&\u000bJ\u000e+UQu\u0011K\u00060", "u(;<^/Mb$LD>=|\u0012>L\u00046\u000b@\n\u0017$\u0006P\n:\u0006/BmS", "Adc\u0012i,Gb\u007f\u0003\tm,\u0006\t<F{&\u000bJ\u000e+UQu\u0011K\u00060", "uK^8[;M^fHZo,\u0006\u0018\u0016i\u000e7{I\u0001$U(k\fK\u00012I/A\u0011", "4n[9b>+S\u0018\u0003\b^*\f\u0017", "", "5dc\u0013b3E]+kz]0\n\t-t\u000ef\u0006F\u0004&&R", "u(I", "Adc\u0013b3E]+kz]0\n\t-t\u000ef\u0006F\u0004&&R", "uY\u0018#", "4n[9b>,a kz]0\n\t-t\u000e", "5dc\u0013b3E]+l\te\u0019|\b3r\u007f&\u000bN?!\u001dJ~\u001dG", "Adc\u0013b3E]+l\te\u0019|\b3r\u007f&\u000bN?!\u001dJ~\u001dG", "6nbAa(FS\n~\bb-\u0001\t<", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u0012o\u000e7\u0005<\t\u0017\bG|\u0012=z%B/", "5dc\u0015b:M\\\u0015\u0007zO,\n\r0i\u007f5:J\u0007\u001a&Vz", "u(;7T=:fb\bzmu\u000b\u00176/b2\nO\n\u0013\u001fG`\u000eIz&9Y\u000bu", "Adc\u0015b:M\\\u0015\u0007zO,\n\r0i\u007f5:J\u0007\u001a&Vz", "uKY.i(Q\u001d\"~\n(:\u000b\u0010xH\n6\u000bI|\u001f\u00178o\u001b@w)5fSc(", "7mc2e*>^(\t\bl", "", "\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t\u0016", "5dc\u0016a;>`\u0017~\u0006m6\n\u0017mo\u0006+\u000bO\f", ";h]$X),]\u0017\u0005zm\u0014|\u0017=a\u0002(jJ^!\u001fR|\u000eJ\u0005", "", "5dc\u001a\\50S\u0016l\u0005\\2|\u0018\u0017e\u000e6wB\u0001\u0006!%y\u0016G\u0004%Cg<*=p%=X", "u(9", "Adc\u001a\\50S\u0016l\u0005\\2|\u0018\u0017e\u000e6wB\u0001\u0006!%y\u0016G\u0004%Cg<*=p%=X", "uI\u0018#", "<dcDb9D7\"\u000ezk*|\u0014>o\r6", "5dc\u001bX;P]&\u0005^g;|\u0016-e\u000b7\u0006M\u000fU!Mr\u001dK\u0002", ">h]4<5MS&\u0010ve", "5dc\u001d\\5@7\"\u000ezk=x\u0010mo\u0006+\u000bO\f", "Adc\u001d\\5@7\"\u000ezk=x\u0010mo\u0006+\u000bO\f", ">q^Ab*HZ'", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "5dc\u001de6M]\u0017\t\u0002lj\u0007\u000f2t\u000f3", "Adc\u001de6M]\u0017\t\u0002lj\u0007\u000f2t\u000f3", ">q^El", "\u001aiPCTuGS(Hek6\u0010\u001d\u0005", "5dc\u001de6QgW\t\u0001a;\f\u0014", "u(;7T=:\u001d\"~\n(\u0017\n\u0013ByU", "Adc\u001de6QgW\t\u0001a;\f\u0014", "uKY.i(\b\\\u0019\u000eDI9\u0007\u001cC;C\u0019", ">q^El\bNb\u001c~\u0004m0z\u0005>o\r", "5dc\u001de6Qgt\u000f\na,\u0006\u00183c{7\u0006M?!\u001dJ~\u001dG", "Adc\u001de6Qgt\u000f\na,\u0006\u00183c{7\u0006M?!\u001dJ~\u001dG", ">q^El\u001a>Z\u0019|\nh9", "\u001aiPCTuGS(Hek6\u0010\u001d\u001de\u0007(yO\u000b$l", "5dc\u001de6Qg\u0007~\u0002^*\f\u0013<$\n.~O\u0010\"", "u(;7T=:\u001d\"~\n(\u0017\n\u0013Bym(\u0003@~&!TE", "Adc\u001de6Qg\u0007~\u0002^*\f\u0013<$\n.~O\u0010\"", "uKY.i(\b\\\u0019\u000eDI9\u0007\u001cCS\u007f/{>\u0010!$\u001d3~", "@dP1G0FS#\u000f\n", "5dc\u001fX(=B\u001d\u0007zh<\fG9k\u00037\u000bK", "Adc\u001fX(=B\u001d\u0007zh<\fG9k\u00037\u000bK", "@dc?l\u0016G1#\b\u0004^*\f\r9n`$\u007fG\u0011$\u0017", "5dc\u001fX;Kg\u0003\bXh5\u0006\t-t\u00042\u0005!|\u001b\u001eW|\u000ez\u0001+8h\r+", "Adc\u001fX;Kg\u0003\bXh5\u0006\t-t\u00042\u0005!|\u001b\u001eW|\u000ez\u0001+8h\r+", "@ndAX\u000b:b\u0015{vl,", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0012?i\r \u0016i%*J?Ik\n", "5dc\u001fb<MSwz\nZ)x\u0017/$\n.~O\u0010\"", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~F\b0Fmt*\\?8gB\u001ej", "Adc\u001fb<MSwz\nZ)x\u0017/$\n.~O\u0010\"", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n \u0017E~\u0012F\u007fn\"c\u000e/7L\u0012=I@7y4sXY", "AnR8X;\u001fO\u0017\u000e\u0005k@", "\u001aiPCT?\b\\\u0019\u000eDL6z\u000f/t`$yO\u000b$+\u001d", "5dc b*DS(_v\\;\u0007\u0016C$\n.~O\u0010\"", "u(;7T=:fb\bzmuj\u0013-k\u007f7\\<~&!T\u0004c", "Adc b*DS(_v\\;\u0007\u0016C$\n.~O\u0010\"", "uKY.i(Q\u001d\"~\n(\u001a\u0007\u00075e\u000f\tw>\u0010!$[EQ-", "Ar[ b*DS(_v\\;\u0007\u0016CO\r\u0011\fG\b", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&(k\fK\u00012I/", "5dc f3,]\u0017\u0005zm\rx\u0007>o\r<eMi'\u001eN.\u0018By4Dd", "u(;7T=:fb\bzmu\u000b\u00176/m\u0016b.\u000b\u0015\u001dG~n8t4?f\u0012u", "Adc f3,]\u0017\u0005zm\rx\u0007>o\r<eMi'\u001eN.\u0018By4Dd", "uKY.i(Q\u001d\"~\n(:\u000b\u0010xSm\u000fiJ~\u001d\u0017VP\n:\u0006/BmSc(", "EqXAX\u001bB[\u0019\t\u000bm", "5dc$e0MS\b\u0003\u0003^6\r\u0018mo\u0006+\u000bO\f", "Adc$e0MS\b\u0003\u0003^6\r\u0018mo\u0006+\u000bO\f", "F4\u001f\u0006G9Na(fvg(~\t<O\r\u0011\fG\b", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\"5J{jM\u0011%&/k\u00178x%B/", "5dc%(v\u0012B&\u000f\tm\u0014x\u0012+g\u007f5eMi'\u001eN.\u0018By4Dd", "u(;7T=:fb\bzmu\u000b\u00176/rwF\u0014o$'U~u8\u007f!7Y\u000bu", "Adc%(v\u0012B&\u000f\tm\u0014x\u0012+g\u007f5eMi'\u001eN.\u0018By4Dd", "uKY.i(Q\u001d\"~\n(:\u000b\u0010xXOrO/\u000e'%VW\nEr'5fSc(", "/cS\u0016a;>`\u0017~\u0006m6\n", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t~^\u001a\u0013Kxc", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1gP6a", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "z`S1<5MS&|zi;\u0007\u0016", "7mc2e*>^(\t\b", "/cS\u001bX;P]&\u0005^g;|\u0016-e\u000b7\u0006M", "z`S1A,Me#\f\u0001B5\f\t<c\u007f3\u000bJ\u000e", "0tX9W", "2ta.g0H\\", "\u001aiPCTuMW!~D=<\n\u0005>i\n1Q", "Bh\\2b<M", "CmXA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "3uT;g\u0013Ba(~\u0004^9", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000el", "4n[9b>)`#\u000e\u0005\\6\u0004u/d\u00045{>\u0010%", "0xc2f", "7mc2e=:Z", "Ar[ b*DS(_v\\;\u0007\u0016C", "Bqd@g\u0014:\\\u0015\u0001zk", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private RouteDatabase routeDatabase;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            this.authenticator = Authenticator.NONE;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = Authenticator.NONE;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.socketFactory = socketFactory;
            this.connectionSpecs = OkHttpClient.Companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = OkHttpClient.Companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            CollectionsKt.addAll(this.interceptors, okHttpClient.interceptors());
            CollectionsKt.addAll(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }

        /* JADX INFO: renamed from: -addInterceptor */
        public final Builder m10770addInterceptor(final Function1<? super Interceptor.Chain, Response> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return addInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    Intrinsics.checkNotNullParameter(chain, "chain");
                    return block.invoke(chain);
                }
            });
        }

        /* JADX INFO: renamed from: -addNetworkInterceptor */
        public final Builder m10771addNetworkInterceptor(final Function1<? super Interceptor.Chain, Response> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return addNetworkInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    Intrinsics.checkNotNullParameter(chain, "chain");
                    return block.invoke(chain);
                }
            });
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        public final Builder authenticator(Authenticator authenticator) {
            Intrinsics.checkNotNullParameter(authenticator, "authenticator");
            this.authenticator = authenticator;
            return this;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public final Builder cache(Cache cache) {
            this.cache = cache;
            return this;
        }

        public final Builder callTimeout(long j2, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.callTimeout = Util.checkDuration(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, j2, unit);
            return this;
        }

        public final Builder callTimeout(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner) {
            Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
            if (!Intrinsics.areEqual(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        public final Builder connectTimeout(long j2, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.connectTimeout = Util.checkDuration(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, j2, unit);
            return this;
        }

        public final Builder connectTimeout(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder connectionPool(ConnectionPool connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> connectionSpecs) {
            Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
            if (!Intrinsics.areEqual(connectionSpecs, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = Util.toImmutableList(connectionSpecs);
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar) {
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        public final Builder dispatcher(Dispatcher dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            this.dispatcher = dispatcher;
            return this;
        }

        public final Builder dns(Dns dns) {
            Intrinsics.checkNotNullParameter(dns, "dns");
            if (!Intrinsics.areEqual(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final Builder eventListener(EventListener eventListener) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            this.eventListenerFactory = Util.asFactory(eventListener);
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory eventListenerFactory) {
            Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        public final Builder followRedirects(boolean z2) {
            this.followRedirects = z2;
            return this;
        }

        public final Builder followSslRedirects(boolean z2) {
            this.followSslRedirects = z2;
            return this;
        }

        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        public final Dns getDns$okhttp() {
            return this.dns;
        }

        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        public final RouteDatabase getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!Intrinsics.areEqual(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final Builder minWebSocketMessageToCompress(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + j2).toString());
            }
            this.minWebSocketMessageToCompress = j2;
            return this;
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final Builder pingInterval(long j2, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.pingInterval = Util.checkDuration("interval", j2, unit);
            return this;
        }

        public final Builder pingInterval(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder protocols(List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            List mutableList = CollectionsKt.toMutableList((Collection) protocols);
            if (!mutableList.contains(Protocol.H2_PRIOR_KNOWLEDGE) && !mutableList.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            }
            if (mutableList.contains(Protocol.H2_PRIOR_KNOWLEDGE) && mutableList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
            }
            if (mutableList.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
            }
            Intrinsics.checkNotNull(mutableList, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (mutableList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            mutableList.remove(Protocol.SPDY_3);
            if (!Intrinsics.areEqual(mutableList, this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(mutableList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            this.protocols = listUnmodifiableList;
            return this;
        }

        public final Builder proxy(Proxy proxy) {
            if (!Intrinsics.areEqual(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        public final Builder proxyAuthenticator(Authenticator proxyAuthenticator) {
            Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
            if (!Intrinsics.areEqual(proxyAuthenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector) {
            Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
            if (!Intrinsics.areEqual(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        public final Builder readTimeout(long j2, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.readTimeout = Util.checkDuration(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, j2, unit);
            return this;
        }

        public final Builder readTimeout(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean z2) {
            this.retryOnConnectionFailure = z2;
            return this;
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator) {
            Intrinsics.checkNotNullParameter(authenticator, "<set-?>");
            this.authenticator = authenticator;
        }

        public final void setCache$okhttp(Cache cache) {
            this.cache = cache;
        }

        public final void setCallTimeout$okhttp(int i2) {
            this.callTimeout = i2;
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner) {
            Intrinsics.checkNotNullParameter(certificatePinner, "<set-?>");
            this.certificatePinner = certificatePinner;
        }

        public final void setConnectTimeout$okhttp(int i2) {
            this.connectTimeout = i2;
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "<set-?>");
            this.connectionPool = connectionPool;
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar) {
            Intrinsics.checkNotNullParameter(cookieJar, "<set-?>");
            this.cookieJar = cookieJar;
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "<set-?>");
            this.dispatcher = dispatcher;
        }

        public final void setDns$okhttp(Dns dns) {
            Intrinsics.checkNotNullParameter(dns, "<set-?>");
            this.dns = dns;
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
            Intrinsics.checkNotNullParameter(factory, "<set-?>");
            this.eventListenerFactory = factory;
        }

        public final void setFollowRedirects$okhttp(boolean z2) {
            this.followRedirects = z2;
        }

        public final void setFollowSslRedirects$okhttp(boolean z2) {
            this.followSslRedirects = z2;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "<set-?>");
            this.hostnameVerifier = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j2) {
            this.minWebSocketMessageToCompress = j2;
        }

        public final void setPingInterval$okhttp(int i2) {
            this.pingInterval = i2;
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.protocols = list;
        }

        public final void setProxy$okhttp(Proxy proxy) {
            this.proxy = proxy;
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator) {
            Intrinsics.checkNotNullParameter(authenticator, "<set-?>");
            this.proxyAuthenticator = authenticator;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void setReadTimeout$okhttp(int i2) {
            this.readTimeout = i2;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z2) {
            this.retryOnConnectionFailure = z2;
        }

        public final void setRouteDatabase$okhttp(RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory) {
            Intrinsics.checkNotNullParameter(socketFactory, "<set-?>");
            this.socketFactory = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i2) {
            this.writeTimeout = i2;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final Builder socketFactory(SocketFactory socketFactory) {
            Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
            }
            if (!Intrinsics.areEqual(socketFactory, this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001t\u0006|\u001a\u0017kZ4m_\u00187Sp2\n*\u0019w\u001ek6U\u0005o`\u00013gl\fxJNp(:I!8J&i\fzaP\u001d\u000b>2F'\u001f[\u0001E)w;\u0007\u0005Y")
        @InterfaceC1492Gx
        public final Builder sslSocketFactory(SSLSocketFactory sslSocketFactory) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            if (!Intrinsics.areEqual(sslSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            X509TrustManager x509TrustManagerTrustManager = Platform.Companion.get().trustManager(sslSocketFactory);
            if (x509TrustManagerTrustManager == null) {
                throw new IllegalStateException("Unable to extract the trust manager on " + Platform.Companion.get() + ", sslSocketFactory is " + sslSocketFactory.getClass());
            }
            this.x509TrustManagerOrNull = x509TrustManagerTrustManager;
            Platform platform = Platform.Companion.get();
            X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            Intrinsics.checkNotNull(x509TrustManager);
            this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (!Intrinsics.areEqual(sslSocketFactory, this.sslSocketFactoryOrNull) || !Intrinsics.areEqual(trustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.Companion.get(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        public final Builder writeTimeout(long j2, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.writeTimeout = Util.checkDuration(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, j2, unit);
            return this;
        }

        public final Builder writeTimeout(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>)6B\u0015\"4\u0012}\bnjO0LeN.Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t fuh\u0007Pj\rS\u000f4\u0019'l\u0003հWޯa\u0018\u0017˰ZqE7[t\u000eQnzN\u000b0428(\f/\u001c\u0001ϻ\u0012ͯ~ISÈ*2FxHWұQ\u000e"}, d2 = {"\u001anZ5g;I!bh\u0001A;\f\u0014\rl\u0004(\u0005O?t!Oz\nEz/>/", "", "u(E", "\u0012D5\u000eH\u0013-MvhcG\fZw\u0013Oh\"i+`t\u0005", "", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1iK\u0001\u0015l", "5dc\u00118\r\u001aC\u007fmt<\u0016eq\u000fCn\fe)z\u0005\u0002'M{z\u0001+8h\r+", "u(;7T=:\u001d)\u000e~euc\r=tU", "\u0012D5\u000eH\u0013-M\u0004kdM\u0016Zr\u0016S", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "5dc\u00118\r\u001aC\u007fmtI\u0019fw\u0019Ci\u000fi~\u000b\u001d\u001aV~\u0019", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }

    public OkHttpClient(Builder builder) {
        NullProxySelector proxySelector$okhttp;
        OkCallback.newInstance_start(builder);
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.dispatcher = builder.getDispatcher$okhttp();
        this.connectionPool = builder.getConnectionPool$okhttp();
        this.interceptors = Util.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure$okhttp();
        this.authenticator = builder.getAuthenticator$okhttp();
        this.followRedirects = builder.getFollowRedirects$okhttp();
        this.followSslRedirects = builder.getFollowSslRedirects$okhttp();
        this.cookieJar = builder.getCookieJar$okhttp();
        this.cache = builder.getCache$okhttp();
        this.dns = builder.getDns$okhttp();
        this.proxy = builder.getProxy$okhttp();
        if (builder.getProxy$okhttp() != null) {
            proxySelector$okhttp = NullProxySelector.INSTANCE;
        } else {
            proxySelector$okhttp = builder.getProxySelector$okhttp();
            proxySelector$okhttp = proxySelector$okhttp == null ? ProxySelector.getDefault() : proxySelector$okhttp;
            if (proxySelector$okhttp == null) {
                proxySelector$okhttp = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector$okhttp;
        this.proxyAuthenticator = builder.getProxyAuthenticator$okhttp();
        this.socketFactory = builder.getSocketFactory$okhttp();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier$okhttp();
        this.callTimeoutMillis = builder.getCallTimeout$okhttp();
        this.connectTimeoutMillis = builder.getConnectTimeout$okhttp();
        this.readTimeoutMillis = builder.getReadTimeout$okhttp();
        this.writeTimeoutMillis = builder.getWriteTimeout$okhttp();
        this.pingIntervalMillis = builder.getPingInterval$okhttp();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress$okhttp();
        RouteDatabase routeDatabase$okhttp = builder.getRouteDatabase$okhttp();
        this.routeDatabase = routeDatabase$okhttp == null ? new RouteDatabase() : routeDatabase$okhttp;
        List<ConnectionSpec> list = connectionSpecs$okhttp;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).isTls()) {
                    if (builder.getSslSocketFactoryOrNull$okhttp() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull$okhttp();
                        CertificateChainCleaner certificateChainCleaner$okhttp = builder.getCertificateChainCleaner$okhttp();
                        Intrinsics.checkNotNull(certificateChainCleaner$okhttp);
                        this.certificateChainCleaner = certificateChainCleaner$okhttp;
                        X509TrustManager x509TrustManagerOrNull$okhttp = builder.getX509TrustManagerOrNull$okhttp();
                        Intrinsics.checkNotNull(x509TrustManagerOrNull$okhttp);
                        this.x509TrustManager = x509TrustManagerOrNull$okhttp;
                        CertificatePinner certificatePinner$okhttp = builder.getCertificatePinner$okhttp();
                        Intrinsics.checkNotNull(certificateChainCleaner$okhttp);
                        this.certificatePinner = certificatePinner$okhttp.withCertificateChainCleaner$okhttp(certificateChainCleaner$okhttp);
                    } else {
                        X509TrustManager x509TrustManagerPlatformTrustManager = Platform.Companion.get().platformTrustManager();
                        this.x509TrustManager = x509TrustManagerPlatformTrustManager;
                        Platform platform = Platform.Companion.get();
                        Intrinsics.checkNotNull(x509TrustManagerPlatformTrustManager);
                        this.sslSocketFactoryOrNull = platform.newSslSocketFactory(x509TrustManagerPlatformTrustManager);
                        CertificateChainCleaner.Companion companion = CertificateChainCleaner.Companion;
                        Intrinsics.checkNotNull(x509TrustManagerPlatformTrustManager);
                        CertificateChainCleaner certificateChainCleaner = companion.get(x509TrustManagerPlatformTrustManager);
                        this.certificateChainCleaner = certificateChainCleaner;
                        CertificatePinner certificatePinner$okhttp2 = builder.getCertificatePinner$okhttp();
                        Intrinsics.checkNotNull(certificateChainCleaner);
                        this.certificatePinner = certificatePinner$okhttp2.withCertificateChainCleaner$okhttp(certificateChainCleaner);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        }
        verifyClientState();
    }

    private final void verifyClientState() {
        List<Interceptor> list = this.interceptors;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        List<Interceptor> list2 = this.networkInterceptors;
        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<ConnectionSpec> list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).isTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!Intrinsics.areEqual(this.certificatePinner, CertificatePinner.DEFAULT)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "authenticator", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_authenticator */
    public final Authenticator m10744deprecated_authenticator() {
        return this.authenticator;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "cache", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_cache */
    public final Cache m10745deprecated_cache() {
        return this.cache;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "callTimeoutMillis", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_callTimeoutMillis */
    public final int m10746deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_certificatePinner */
    public final CertificatePinner m10747deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "connectTimeoutMillis", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_connectTimeoutMillis */
    public final int m10748deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "connectionPool", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_connectionPool */
    public final ConnectionPool m10749deprecated_connectionPool() {
        return this.connectionPool;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_connectionSpecs */
    public final List<ConnectionSpec> m10750deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "cookieJar", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_cookieJar */
    public final CookieJar m10751deprecated_cookieJar() {
        return this.cookieJar;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "dispatcher", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_dispatcher */
    public final Dispatcher m10752deprecated_dispatcher() {
        return this.dispatcher;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "dns", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_dns */
    public final Dns m10753deprecated_dns() {
        return this.dns;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "eventListenerFactory", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_eventListenerFactory */
    public final EventListener.Factory m10754deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "followRedirects", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_followRedirects */
    public final boolean m10755deprecated_followRedirects() {
        return this.followRedirects;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "followSslRedirects", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_followSslRedirects */
    public final boolean m10756deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier */
    public final HostnameVerifier m10757deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "interceptors", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_interceptors */
    public final List<Interceptor> m10758deprecated_interceptors() {
        return this.interceptors;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "networkInterceptors", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_networkInterceptors */
    public final List<Interceptor> m10759deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "pingIntervalMillis", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_pingIntervalMillis */
    public final int m10760deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "protocols", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_protocols */
    public final List<Protocol> m10761deprecated_protocols() {
        return this.protocols;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_proxy */
    public final Proxy m10762deprecated_proxy() {
        return this.proxy;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator */
    public final Authenticator m10763deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_proxySelector */
    public final ProxySelector m10764deprecated_proxySelector() {
        return this.proxySelector;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "readTimeoutMillis", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_readTimeoutMillis */
    public final int m10765deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "retryOnConnectionFailure", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_retryOnConnectionFailure */
    public final boolean m10766deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_socketFactory */
    public final SocketFactory m10767deprecated_socketFactory() {
        return this.socketFactory;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory */
    public final SSLSocketFactory m10768deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "writeTimeoutMillis", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_writeTimeoutMillis */
    public final int m10769deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public Object clone() {
        return super.clone();
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    public WebSocket newWebSocket(Request request, WebSocketListener listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }
}
