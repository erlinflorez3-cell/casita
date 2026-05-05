package okhttp3.internal.connection;

import androidx.exifinterface.media.ExifInterface;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

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
@Metadata(bv = {}, d1 = {"Яų\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfr96DmH<X[ճ\u0017k\nS,[:qK;k\u001a\u0006\"\u000fRVg}nRҙ\u0013C%\u0006\u001eюr,W\\\u0001]\u0018\u0012:B}H;MuCA`\u000b6\rړ:\"Ny\r\u0001 /P\u0010\rzKK\u0012\u00128@\u0007:Z\rS\u0005\"\u0012\u0014>(\u0001$\\oNLHt]@4+\u0003\u007fBVϋg0\u0013M\u0015FZ'\u0015vw\u001e3@=5\u001d%i\u0003\u000fRaA\u000b?\b=\rh-'3I\nW>X\u0006\u0019\u001d+e\reö.\\\u0013oh\f--WcaP\u0016ߊ\u007fz\u0012\rD\u0004\u0014\u0006/HD-\"Ǒ\u0010\u000eItzSFT\n^X\u007f\u0003a<\u0017-\u007fI+A\u001blTi;'Z?{\u000b\u00104ŀ\u001fhQ[\u0003\r\u0011\u0015IT0P+\u0012SML\\\u000bq=\u001c\u0006\u0001f\u0010-\u001c0u\u0004\u009e\u007f\u0011<\u001cm;il;!\u001a6\u0011Zu,\u001d`\u0017n\u001aVVv:nDnZ\r\u001aj\\d3|\u0017T!h\u001f\u00064T528\u0017.\u0016\u0010<O,@R]#\u0002j{d:)=\"OY\u001dr>[G\u001bK5\u007fj@e`4,?j}5\\t\u0001k\f\t\u001cX&@\t\u0003\u0010&=\rq\u001aUJ? Pd0?\\t\u0015vGNFOB!_\tl@\u0003by<\u0003\u0018k;էɹT\\v80\u001fWu\u0015`PaqUCR>UPod\u00011A\u0017s.N\u0018PU\u000b\u0005\u0016$\u0015,$$ZQQ]~Y\u000fG7@LEEz'\u0016U[]?z+FU;1\\uU\u0003pZ\u0015\u001bN]\u000e/\"%e#'\u0016\u001f\u0018y\u0010M+Kq\u0010#[lP#\u0007gzf8+DO\"3A\b\"+vsCoE$F,1+`\f9 2\b\u001d'&#l40qQ\bb\u007fdb?F\u001aq~lqTp\u0011x`j&?\t\t|\u0013A\u001aYd\u001f&~MSU\f9\u001f,;%\u0007_H^\b}bz\u0010.\u0002\u007f\u0016\u0014\rJU\u0015[\u0012\u007fm\u001c\u000b\r\u000fXO\"\u000b*r5\u0012dE.fod\u001f/4\u0005^J\nFpXT\tRhrфޭ\u000fCZ>N3\tU^_=2bF\u0002\u0012n\u000e\u0003P\rbV]xMp#:\u0001-\u0013I\u001d'\u000fw܊֪JT5>z\rax!\u001b\u0019j/j3\b\\Tg6ps\u000fh]]q(2:\u0012\u000bAm\u001a4<<&\\5BF{\u007fܱμcv6@Shr1|v@J\u0003R0\u000e\u0017z+s\u0003߽۪\u000f\u0019UY8m;jfwew`݅ӢH)\rsEnT:E\u0006ca\u0004Ɩހ\u0018'\u0002@\u001cQ\fq8 U8%%jB&f8pK>$].b0uYdh\u0012<8\rr8b8:]pK\u0002AN \u007f@'NJCl4f\u0012|A\u0010qo{n\u0004\u000fIzyj\b_EPK$WW<\u0005p`J\u0013c \u0007\u0015.m[&g<\u0016\u0012A\u0010}\n/\u00054]i\u007fC/\u001a^\u00125>\u000f6}M\u0001<\u0004rb6\tSV{Y\u0015\rj#ZW<\u00161(-z\u001a\u001e,|->%%[QTi6d]kI#iK_`5\u000fuO4\u0019ITU\u001aeyQ Ĭz\u0011\t33\u0001\u000e0Z\t!\u0007>ƫ9ĘX=\"ś*?{l\u001b2[MHH\u0018.!\u000e?:\tBNGѱ\u001e\"CǛKC\u001f\u001d\u000f\"\t\u0015}\b15\u0019Sƽ)0\tε\u0019\u000fE\b?z\u000b\u0002E\u0003;1%nIh=ձ1̂iL/ڄRsX\u0011eel\u000e\u0010? ˂Qɭ}UH\u0094Z728\u001euQ\u0015\u001cʺT\u008dchHѲ\fY\n<8M\u000fF)_z\u0012D\u001c:\u00040s\u0013v\u0018r\u0018ʰ\u0016ԯHBB/r#Sj9\u0006\u0019b%EBReѫ5ط\u001b|\u0018ށBX9h\u000bM]w4ٱ\u001fű\bF:݃N{M`gG&/\u0018uq\r;{_\u0003(:(\f;(Nٝ^ϵ\u0004`%ȁwY\u0005kN^\u000fLo\taٽ\u001bľb.JԽ[\u0012$U`\u00170\u0005!ߺ!Θ7G{ݝ\u0018\u001ed~9\u001d?_{̸'ڃnGGޟBpKaK\u000b\u001cQ/˃qۇ\ta)ɿ|-\u001b)xUNI\\i(V)\u0014\u001cr|J&C'r~ҕ<߳4P\u0007ߠ\u0014k\u000fK7?k\u0014\u0014%\tĒCׄh\u00113ŋ(|`\u0006;/\u000f\u00011A\u0018Ë\u001fȝ\"SAާs\u007f\u001bcV{6c ʓ\t̚M\u0010\u000bʱŗ%*"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=s", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0002\"oB-\u0015qaF\\", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1Q", "1n];X*MW#\beh6\u0004", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=\t\u001frh\u000f", "@ndAX", "\u001anZ5g;I!bk\u0005n;|^", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n \u0017E~\u0012F\u007fn\"Yy'\u0015w\u001f7MAJo>'\u007frk@\\J6Ty6VW\u001cuI\\\u0003L\u0014g\u001e~", "/k[<V(MW#\bab4\u0001\u0018", "", "1`[9f", "", "\u001aiPCTuEO\"\u0001Dk,}R\u001ce\u0001(\t@\n\u0015\u0017\u001d", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}3t\u001d\u0004", "5dc\u0010T3Ea", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0010b5GS\u0017\u000e~h5g\u00139l", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~F}\u001c>K 7VC9z8(\u001eSkC\u000e9", "6`]1f/:Y\u0019", "\u001anZ5g;I!bavg+\u000b\f+k\u007f}", "6sc=%\nH\\\"~xm0\u0007\u0012", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0019", "7c[24;'a", "", "5dc\u0016W3>/(g\t\u001d6\u0003\f>t\u000b", "u(9", "Adc\u0016W3>/(g\t\u001d6\u0003\f>t\u000b", "uI\u0018#", "7r<B_;B^ ~\u000e^+", "", "7r<B_;B^ ~\u000e^+;\u00135h\u000f7\u0007", "u(I", "<n2<T3>a\u0017~y<6\u0006\u0012/c\u000f,\u0006I\u000f", "<n=2j\fQQ\u001cz\u0004`,\u000b", "5dc\u001bb\u0015>ex\u0012xa(\u0006\u000b/s", "Adc\u001bb\u0015>ex\u0012xa(\u0006\u000b/s", "uY\u0018#", ">q^Ab*HZ", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "@`f b*DS(", "\u001aiPCTuGS(Hhh*\u0003\t>;", "@dUBf,=A(\fzZ4Z\u0013?n\u000f", "@ndAX\r:W \u000f\b^\n\u0007\u00198t", "5dc\u001fb<MSyz~e<\n\t\ro\u00101\u000b~\u000b\u001d\u001aV~\u0019", "u(8", "Adc\u001fb<MSyz~e<\n\t\ro\u00101\u000b~\u000b\u001d\u001aV~\u0019", "uH\u0018#", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "AnR8X;", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "AtR0X:L1#\u000f\u0004m", "1`]0X3", "", "1daA\\-BQ\u0015\u000ezL<\b\u00149r\u000f\u000b\u0006N\u0010", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "1n];X*M", "1n];X*MB\u001d\u0007zh<\f", "@dP1G0FS#\u000f\n", "EqXAX\u001bB[\u0019\t\u000bm", ">h]4<5MS&\u0010ve\u0014\u0001\u00106i\u000e", "1n];X*MW#\bg^;\n\u001d\u000fn{%\u0003@\u007f", "1`[9", "\u001anZ5g;I!b\\ve3R", "3uT;g\u0013Ba(~\u0004^9", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000el", "1n];X*M4\u0015\u0003\u0002^+", "1kX2a;", "\u001anZ5g;I!bh\u0001A;\f\u0014\rl\u0004(\u0005OV", "4`X9X++])\u000ez", "4`X9h9>", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "1n];X*M4\u0015\u0003\u0002^+;\u00135h\u000f7\u0007", "1n];X*MA#|\u0001^;", "1n];X*MB \r", "1n];X*MW#\bhi,zv/l\u007f&\u000bJ\u000e", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0003?b\u0007 5|\u001a8V1Fk2\f\u0015oa7\u0016m9$", "1n];X*MB)\b\u0004^3", "1qT.g,-c\"\bze", "\u001anZ5g;I!bkzj<|\u0017>;", "Bt];X3+S%\u000fzl;", "1qT.g,-c\"\bze\u0019|\u0015?e\u000e7", "3rc.U3Ba\u001ci\bh;\u0007\u00079l", "7mR?X4>\\(l\u000b\\*|\u0017=C\n8\u0005O", "7mR?X4>\\(l\u000b\\*|\u0017=C\n8\u0005O?!\u001dJ~\u001dG", "7r49\\.BP ~", "/cS?X:L", "\u001anZ5g;I!bZy]9|\u0017=;", "@ndAX:", "", "7r49\\.BP ~9h2\u007f\u0018>p", "7r72T3MV-", "2n4Eg,Ga\u001d\u0010z</|\u00075s", "<df\u0010b+>Q", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\f`vZm\u00118\u007f'57\b\u001f7kk", "1gP6a", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\f`\u0004Gk\u0015 \u007f45f{ B| ;+F7o=s", "<df\u0010b+>QW\t\u0001a;\f\u0014", "<df$X),]\u0017\u0005zm\u001a\f\u0016/a\b6", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nm\u0017\u0013Na\u000e9d/3_}/u[%;M?Cy\n", "3wR5T5@S", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0005HW\u0001\u001c@o\u0016\u0004", "<df$X),]\u0017\u0005zm\u001a\f\u0016/a\b6:J\u0007\u001a&Vz", "<n2<T3>a\u0017~y<6\u0006\u0012/c\u000f,\u0006I\u000fU!Mr\u001dK\u0002", "<n=2j\fQQ\u001cz\u0004`,\u000bG9k\u00037\u000bK", "=mB2g;B\\\u001b\r", "1n];X*MW#\b", "AdcA\\5@a", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`5o\u001dKz.7gS", "=mBAe,:[", "Asa2T4", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0013Df}\u001c?C", "@ndAX\u0014:b\u0017\u0002zl\b\u0006\u001d", "1`]1\\+:b\u0019\r", "AsP?g\u000fMb$K", "At_=b9Ma\t\f\u0002", "BnBAe0GU", "", "BqP0^\r:W \u000f\b^", ExifInterface.GPS_MEASUREMENT_3D, "BqP0^\r:W \u000f\b^j\u0007\u000f2t\u000f3", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    private final List<Reference<RealCall>> calls;
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private BufferedSink sink;
    private Socket socket;
    private BufferedSource source;
    private int successCount;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u0018\u007fјnjG<L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNogtJ`ŖD%إFx\u0019+\nZ~]ܫ\u00132Po\bW[vU9\u000f|f\t.;:8(\u000f1\u001e8S(v)O{\u0010 =Xph`=Q\u0013)*\u0006l\"Q*jhf6vn4ž\u0002ݭ\u0007iJ÷wk>\u007fe\rtX}˜IҐ\"+Hʺ\u0006!3X\u001b\u0007\u0001a\u0016Ť\u0012џA\u0005pѧݹ/Y"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=\\rriD\u0003l0X\u007f|", "", "u(E", "\u0017C;\u0012R\n(<\u0002^XM\u0010fq)H_\u0004b/c\u000b\u00110]", "", "\u001b@G,G\u001c'<xet:\u001bkh\u0017Pn\u0016", "", "\u001cO4,G\u000f+=\u000bxlB\u001b_\u0003\u0018Uf\u000f", "", "<df!X:M1#\b\u0004^*\f\r9n", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=s", "1n];X*MW#\beh6\u0004", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=\t\u001frh\u000f", "@ndAX", "\u001anZ5g;I!bk\u0005n;|^", "AnR8X;", "\u001aiPCTuGS(Hhh*\u0003\t>;", "7c[24;'a", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RealConnection newTestConnection(RealConnectionPool connectionPool, Route route, Socket socket, long j2) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(socket, "socket");
            RealConnection realConnection = new RealConnection(connectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNs$okhttp(j2);
            return realConnection;
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.RealConnection$connectTls$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,\b\bDZc|İOيH\u0011>D\u000f\"Z\u0012&\u0006-r˱4DkI"}, d2 = {"\n`]<a@F])\rS", "", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E\u001e\u0001$&Kp\u0012:r45/", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<List<? extends Certificate>> {
        final /* synthetic */ Address $address;
        final /* synthetic */ Handshake $unverifiedHandshake;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Handshake handshake, Address address) {
            super(0);
            handshake = handshake;
            address = address;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            CertificateChainCleaner certificateChainCleaner$okhttp = certificatePinner.getCertificateChainCleaner$okhttp();
            Intrinsics.checkNotNull(certificateChainCleaner$okhttp);
            return certificateChainCleaner$okhttp.clean(handshake.peerCertificates(), address.url().host());
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.RealConnection$connectTls$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,\b\bDZc|İOيH\u0011>D\u000f\"Z\u0012&\u0006-r˱4DkI"}, d2 = {"\n`]<a@F])\rS", "", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E3Paj%o\u001bKz&9Wy/7C", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<List<? extends X509Certificate>> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends X509Certificate> invoke() {
            Handshake handshake = RealConnection.this.handshake;
            Intrinsics.checkNotNull(handshake);
            List<Certificate> listPeerCertificates = handshake.peerCertificates();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPeerCertificates, 10));
            for (Certificate certificate : listPeerCertificates) {
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public RealConnection(RealConnectionPool connectionPool, Route route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.connectionPool = connectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake) {
        List<Certificate> listPeerCertificates = handshake.peerCertificates();
        if (listPeerCertificates.isEmpty()) {
            return false;
        }
        OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
        String strHost = httpUrl.host();
        Certificate certificate = listPeerCertificates.get(0);
        Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        return okHostnameVerifier.verify(strHost, (X509Certificate) certificate);
    }

    private final void connectSocket(int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Socket socketCreateSocket;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        int i4 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i4 == 1 || i4 == 2) {
            socketCreateSocket = address.socketFactory().createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.rawSocket = socketCreateSocket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        socketCreateSocket.setSoTimeout(i3);
        try {
            Platform.Companion.get().connectSocket(socketCreateSocket, this.route.socketAddress(), i2);
            try {
                this.source = Okio.buffer(Okio.source(socketCreateSocket));
                this.sink = Okio.buffer(Okio.sink(socketCreateSocket));
            } catch (NullPointerException e2) {
                if (Intrinsics.areEqual(e2.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void connectTls(ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        String strQd = Xg.qd("byz{|}~\u007f\u0001\u0002\u0003\u0004\u0005\u0006\u0007d1Y^`[O\\U\u0011", (short) (ZN.Xd() ^ 21035), (short) (ZN.Xd() ^ 531));
        String strWd = Jg.Wd("\n#\u001b1A\t\t3b", (short) (C1633zX.Xd() ^ (-15397)), (short) (C1633zX.Xd() ^ (-2413)));
        Address address = this.route.address();
        SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
        SSLSocket sSLSocket = null;
        try {
            Intrinsics.checkNotNull(sslSocketFactory);
            Socket socketCreateSocket = sslSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            short sXd = (short) (ZN.Xd() ^ 13764);
            short sXd2 = (short) (ZN.Xd() ^ 13915);
            int[] iArr = new int["9$\u0019i\"dc<-W\u001c\u0002U{\u0001\u0006Q!^\u0018e~3#G\u0012V\nJYj<|E^Y}3lOds|~exV\u0007p@^p{TO\u0013\tkrS".length()];
            QB qb = new QB("9$\u0019i\"dc<-W\u001c\u0002U{\u0001\u0006Q!^\u0018e~3#G\u0012V\nJYj<|E^Y}3lOds|~exV\u0007p@^p{TO\u0013\tkrS");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Intrinsics.checkNotNull(socketCreateSocket, new String(iArr, 0, i2));
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecConfigureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                if (connectionSpecConfigureSecureSocket.supportsTlsExtensions()) {
                    Platform.Companion.get().configureTlsExtensions(sSLSocket2, address.url().host(), address.protocols());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.Companion;
                Intrinsics.checkNotNullExpressionValue(session, C1626yg.Ud("\t1,\u000eza|<\u0016E(4%2EA", (short) (FB.Xd() ^ 29640), (short) (FB.Xd() ^ 12399)));
                Handshake handshake = companion.get(session);
                HostnameVerifier hostnameVerifier = address.hostnameVerifier();
                Intrinsics.checkNotNull(hostnameVerifier);
                if (hostnameVerifier.verify(address.url().host(), session)) {
                    CertificatePinner certificatePinner = address.certificatePinner();
                    Intrinsics.checkNotNull(certificatePinner);
                    this.handshake = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new Function0<List<? extends Certificate>>() { // from class: okhttp3.internal.connection.RealConnection.connectTls.1
                        final /* synthetic */ Address $address;
                        final /* synthetic */ Handshake $unverifiedHandshake;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Handshake handshake2, Address address2) {
                            super(0);
                            handshake = handshake2;
                            address = address2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final List<? extends Certificate> invoke() {
                            CertificateChainCleaner certificateChainCleaner$okhttp = certificatePinner.getCertificateChainCleaner$okhttp();
                            Intrinsics.checkNotNull(certificateChainCleaner$okhttp);
                            return certificateChainCleaner$okhttp.clean(handshake.peerCertificates(), address.url().host());
                        }
                    });
                    certificatePinner.check$okhttp(address2.url().host(), new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.internal.connection.RealConnection.connectTls.2
                        AnonymousClass2() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final List<? extends X509Certificate> invoke() {
                            Handshake handshake2 = RealConnection.this.handshake;
                            Intrinsics.checkNotNull(handshake2);
                            List<Certificate> listPeerCertificates = handshake2.peerCertificates();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPeerCertificates, 10));
                            for (Certificate certificate : listPeerCertificates) {
                                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                arrayList.add((X509Certificate) certificate);
                            }
                            return arrayList;
                        }
                    });
                    String selectedProtocol = connectionSpecConfigureSecureSocket.supportsTlsExtensions() ? Platform.Companion.get().getSelectedProtocol(sSLSocket2) : null;
                    this.socket = sSLSocket2;
                    this.source = Okio.buffer(Okio.source(sSLSocket2));
                    this.sink = Okio.buffer(Okio.sink(sSLSocket2));
                    this.protocol = selectedProtocol != null ? Protocol.Companion.get(selectedProtocol) : Protocol.HTTP_1_1;
                    Platform.Companion.get().afterHandshake(sSLSocket2);
                    return;
                }
                List<Certificate> listPeerCertificates = handshake2.peerCertificates();
                if (listPeerCertificates.isEmpty()) {
                    throw new SSLPeerUnverifiedException(strWd + address2.url().host() + C1561oA.Xd("T$&,X0 .&$(%%aj24e*-;>42610D6E{", (short) (C1580rY.Xd() ^ (-4147))));
                }
                Certificate certificate = listPeerCertificates.get(0);
                Intrinsics.checkNotNull(certificate, Ig.wd("\u000bDk\n;)I|5\u0019\u001a) \u001bc\f,N\u000674y\u0016^(\t(4\u0003jLd\u000ftq+vc=bO1$.{\u0018=\u000f&H#\f\u007fR*d\u000f\fXeY\u001bsa,\u000fW\u0017\u0005\u0012h", (short) (C1499aX.Xd() ^ (-26384))));
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sbAppend = new StringBuilder(strQd).append(address2.url().host());
                short sXd3 = (short) (OY.Xd() ^ 29256);
                int[] iArr2 = new int["qhYE\n=>m3rqM\u0017|FA}\u0002<\"`\u000bbhWQ2jN{pSe\nu<_\u0004\u0012\u0007\f h\u007fY\u0018C".length()];
                QB qb2 = new QB("qhYE\n=>m3rqM\u0017|FA}\u0002<\"`\u000bbhWQ2jN{pSe\nu<_\u0004\u0012\u0007\f h\u007fY\u0018C");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                    i3++;
                }
                StringBuilder sbAppend2 = sbAppend.append(new String(iArr2, 0, i3)).append(CertificatePinner.Companion.pin(x509Certificate));
                short sXd4 = (short) (FB.Xd() ^ 24371);
                int[] iArr3 = new int["g|{zyxwvutsrqpoKmlkj\u000e\u0017\u0002f".length()];
                QB qb3 = new QB("g|{zyxwvutsrqpoKmlkj\u000e\u0017\u0002f");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                    i4++;
                }
                StringBuilder sbAppend3 = sbAppend2.append(new String(iArr3, 0, i4));
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1593ug.zd("<4J6\u0004J=<OMEQW\rCFTW\u0012=\u001b\u0017!,O]`VTXSRfX", (short) (C1607wl.Xd() ^ 27328), (short) (C1607wl.Xd() ^ 6262))).getMethod(C1561oA.od("IFT2S?F@=M\u001c%", (short) (Od.Xd() ^ (-791))), new Class[0]);
                try {
                    method.setAccessible(true);
                    StringBuilder sbAppend4 = sbAppend3.append(((Principal) method.invoke(x509Certificate, objArr)).getName());
                    short sXd5 = (short) (Od.Xd() ^ (-14971));
                    int[] iArr4 = new int["s\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018u\u001a\u001b\u001c\u001dqtbkgfxFr{Vjwp\u007fG.".length()];
                    QB qb4 = new QB("s\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018u\u001a\u001b\u001c\u001dqtbkgfxFr{Vjwp\u007fG.");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd5 + sXd5) + i5));
                        i5++;
                    }
                    throw new SSLPeerUnverifiedException(StringsKt.trimMargin$default(sbAppend4.append(new String(iArr4, 0, i5)).append(OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate)).append(Wg.Zd("i[v\n'B]p\n-@]p\u0014'", (short) (C1607wl.Xd() ^ 7513), (short) (C1607wl.Xd() ^ 19705))).toString(), null, 1, null));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.Companion.get().afterHandshake(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util.closeQuietly((Socket) sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void connectTunnel(int i2, int i3, int i4, Call call, EventListener eventListener) throws IOException {
        Request requestCreateTunnelRequest = createTunnelRequest();
        HttpUrl httpUrlUrl = requestCreateTunnelRequest.url();
        for (int i5 = 0; i5 < 21; i5++) {
            connectSocket(i2, i3, call, eventListener);
            requestCreateTunnelRequest = createTunnel(i3, i4, requestCreateTunnelRequest, httpUrlUrl);
            if (requestCreateTunnelRequest == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                Util.closeQuietly(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
        }
    }

    private final Request createTunnel(int i2, int i3, Request request, HttpUrl httpUrl) throws IOException {
        Response responseBuild;
        String str = "CONNECT " + Util.toHostHeader(httpUrl, true) + " HTTP/1.1";
        do {
            BufferedSource bufferedSource = this.source;
            Intrinsics.checkNotNull(bufferedSource);
            BufferedSink bufferedSink = this.sink;
            Intrinsics.checkNotNull(bufferedSink);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSource, bufferedSink);
            bufferedSource.timeout().timeout(i2, TimeUnit.MILLISECONDS);
            bufferedSink.timeout().timeout(i3, TimeUnit.MILLISECONDS);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseHeaders);
            responseBuild = responseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(responseBuild);
            int iCode = responseBuild.code();
            if (iCode == 200) {
                if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iCode != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + responseBuild.code());
            }
            request = this.route.address().proxyAuthenticator().authenticate(this.route, responseBuild);
            if (request == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
        } while (!StringsKt.equals("close", Response.header$default(responseBuild, "Connection", null, 2, null), true));
        return request;
    }

    private final Request createTunnelRequest() throws IOException {
        Request requestBuild = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Util.userAgent).build();
        Request requestAuthenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(requestBuild).protocol(Protocol.HTTP_1_1).code(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return requestAuthenticate == null ? requestBuild : requestAuthenticate;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i2, Call call, EventListener eventListener) throws Throwable {
        if (this.route.address().sslSocketFactory() != null) {
            eventListener.secureConnectStart(call);
            connectTls(connectionSpecSelector);
            eventListener.secureConnectEnd(call, this.handshake);
            if (this.protocol == Protocol.HTTP_2) {
                startHttp2(i2);
                return;
            }
            return;
        }
        if (!this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
        } else {
            this.socket = this.rawSocket;
            this.protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            startHttp2(i2);
        }
    }

    private final boolean routeMatchesAny(List<Route> list) {
        List<Route> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Route route : list2) {
            if (route.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT && Intrinsics.areEqual(this.route.socketAddress(), route.socketAddress())) {
                return true;
            }
        }
        return false;
    }

    private final void startHttp2(int i2) throws IOException {
        Socket socket = this.socket;
        Intrinsics.checkNotNull(socket);
        BufferedSource bufferedSource = this.source;
        Intrinsics.checkNotNull(bufferedSource);
        BufferedSink bufferedSink = this.sink;
        Intrinsics.checkNotNull(bufferedSink);
        socket.setSoTimeout(0);
        Http2Connection http2ConnectionBuild = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), bufferedSource, bufferedSink).listener(this).pingIntervalMillis(i2).build();
        this.http2Connection = http2ConnectionBuild;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(http2ConnectionBuild, false, null, 3, null);
    }

    private final boolean supportsUrl(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        HttpUrl httpUrlUrl = this.route.address().url();
        if (httpUrl.port() != httpUrlUrl.port()) {
            return false;
        }
        if (Intrinsics.areEqual(httpUrl.host(), httpUrlUrl.host())) {
            return true;
        }
        if (this.noCoalescedConnections || (handshake = this.handshake) == null) {
            return false;
        }
        Intrinsics.checkNotNull(handshake);
        return certificateSupportHost(httpUrl, handshake);
    }

    public final void cancel() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            Util.closeQuietly(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0104 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void connect(int r14, int r15, int r16, int r17, boolean r18, okhttp3.Call r19, okhttp3.EventListener r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void connectFailed$okhttp(OkHttpClient client, Route failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.proxy().type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.address();
            address.proxySelector().connectFailed(address.url().uri(), failedRoute.proxy().address(), failure);
        }
        client.getRouteDatabase().failed(failedRoute);
    }

    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    @Override // okhttp3.Connection
    public Handshake handshake() {
        return this.handshake;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    public final boolean isEligible$okhttp(Address address, List<Route> list) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.url().host(), route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            CertificatePinner certificatePinner = address.certificatePinner();
            Intrinsics.checkNotNull(certificatePinner);
            String strHost = address.url().host();
            Handshake handshake = handshake();
            Intrinsics.checkNotNull(handshake);
            certificatePinner.check(strHost, handshake.peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean isHealthy(boolean z2) {
        long j2;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.socket;
        Intrinsics.checkNotNull(socket2);
        BufferedSource bufferedSource = this.source;
        Intrinsics.checkNotNull(bufferedSource);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return http2Connection.isHealthy(jNanoTime);
        }
        synchronized (this) {
            j2 = jNanoTime - this.idleAtNs;
        }
        if (j2 < IDLE_CONNECTION_HEALTHY_NS || !z2) {
            return true;
        }
        return Util.isHealthy(socket2, bufferedSource);
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient client, RealInterceptorChain chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.socket;
        Intrinsics.checkNotNull(socket);
        BufferedSource bufferedSource = this.source;
        Intrinsics.checkNotNull(bufferedSource);
        BufferedSink bufferedSink = this.sink;
        Intrinsics.checkNotNull(bufferedSink);
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        socket.setSoTimeout(chain.readTimeoutMillis());
        bufferedSource.timeout().timeout(chain.getReadTimeoutMillis$okhttp(), TimeUnit.MILLISECONDS);
        bufferedSink.timeout().timeout(chain.getWriteTimeoutMillis$okhttp(), TimeUnit.MILLISECONDS);
        return new Http1ExchangeCodec(client, this, bufferedSource, bufferedSink);
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(final Exchange exchange) throws SocketException {
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Socket socket = this.socket;
        Intrinsics.checkNotNull(socket);
        final BufferedSource bufferedSource = this.source;
        Intrinsics.checkNotNull(bufferedSource);
        final BufferedSink bufferedSink = this.sink;
        Intrinsics.checkNotNull(bufferedSink);
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new RealWebSocket.Streams(bufferedSource, bufferedSink) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(Http2Connection connection, Settings settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    public Protocol protocol() {
        Protocol protocol = this.protocol;
        Intrinsics.checkNotNull(protocol);
        return protocol;
    }

    @Override // okhttp3.Connection
    public Route route() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long j2) {
        this.idleAtNs = j2;
    }

    public final void setNoNewExchanges(boolean z2) {
        this.noNewExchanges = z2;
    }

    public final void setRouteFailureCount$okhttp(int i2) {
        this.routeFailureCount = i2;
    }

    @Override // okhttp3.Connection
    public Socket socket() {
        Socket socket = this.socket;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    public String toString() {
        Object objCipherSuite;
        StringBuilder sbAppend = new StringBuilder("Connection{").append(this.route.address().url().host()).append(AbstractJsonLexerKt.COLON).append(this.route.address().url().port()).append(", proxy=").append(this.route.proxy()).append(" hostAddress=").append(this.route.socketAddress()).append(" cipherSuite=");
        Handshake handshake = this.handshake;
        if (handshake == null || (objCipherSuite = handshake.cipherSuite()) == null) {
            objCipherSuite = "none";
        }
        return sbAppend.append(objCipherSuite).append(" protocol=").append(this.protocol).append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public final synchronized void trackFailure$okhttp(RealCall call, IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "call");
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                int i2 = this.refusedStreamCount + 1;
                this.refusedStreamCount = i2;
                if (i2 > 1) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !call.isCanceled()) {
                this.noNewExchanges = true;
                this.routeFailureCount++;
            }
        } else if (!isMultiplexed$okhttp() || (iOException instanceof ConnectionShutdownException)) {
            this.noNewExchanges = true;
            if (this.successCount == 0) {
                if (iOException != null) {
                    connectFailed$okhttp(call.getClient(), this.route, iOException);
                }
                this.routeFailureCount++;
            }
        }
    }
}
