package okhttp3.internal.ws;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.net.HttpHeaders;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.WebSocketReader;
import okio.BufferedSink;
import okio.BufferedSource;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĽ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8D{H6ɟ[*%k\u0004é,[2xKП]\u001a\u0014\"\u0011OThonXc\u0013¼\u0017\u0006,xr,OV\u0001] \u001b:Bu@;M\u0006=A`\u0003Ȃ\r 8\"@y\u001b\u0001\"*N\u0010~zYK\u0014۵8@~@Z\rS\b\"\u0012\u001c>(ҵ&\\}N>ԟt]P/+ɅqBd'gܞ\u0005M\u001bF\\'\u0013vi\u001eA@?5\u001b&[\u0003\u001dRcΪ\u000b?\b=\rh-,3I\nW>X\u0006\u0014\u001d+e\rer<\\\rQf&=˃mB{P<'(z*\rt\u0007kd\u0007)\u0010mWv\f\u001c4\rr\u0002B`\u0006lE\u0018z\u0010:')\u000e8C9IlaeI f7*\r\u001d\"1\n\u0007!\n^\u001ef#&lyg0\u007fLML\\\u0017q=\u001c\u000eͲf\u00028\u0012x[\u000e_\u0014\u0011\\HU;ik;!\u001a\fxHu*\u001d`\u0017\b2XVu:nDhp\u001dTwR\u001b\u001dk~\u0006\t0\u001f\u00054T568\u0019.\u0016\u0010>7$>\t\u0016ŖȬnMcEmGtsqn\u001a\u001e\b=lpMQ\u00123\u0012X\u0005RW>x\u0004\u0007|\tgTxjd:2vz@{\n\u0002f\fAUow*rD3/[C^3\"P\u0001\u0015\t\u000ed1\u001c\r\u0015K$1\u001bTx\u0017Bh\\\u001f20\u0013Wo\u0015`P^qYC]>YP.\u001d|\u0002M/y\u000e~\u007fN]K\u001bN>i\ng.\u001ag\u0003_A!+\u0017)`\u0018]IZ\u001b}Q{;o~\u000bB';\u0017_0\u001ex:D`\u0019{\u007fX%_\u000f^!F8h\u000e8yF)]*hSiL\u0014\u000b\u0003\bm~<\u000bP7\u001eS\u001766EC;\u000e?\u001dD)D3#.ui\u001eL@vW4\u00033\u001c,\u0012G f_,J;fg \u0013\u000702<\u001bBv\u001c(\fPWL\raf\bx9bF\u001e#/,v70\u001b?n[h18\u0002B\u007fw*\"SF\u001alb=\u0011{].\u00026Oj0b\u000f8.D5|84=Ny h\u0017\u0003\u001esF:\bO+\u000bJ\\<4ZmN\u000b\fbwZ(z.V\u0010\u0013%}ZsilThAjd\u001d\u001d`spQ.\u000fK'3L\u0017{EM\u0004T)Gc`\u0011\u0004!\u0017p\u0003O-\u0005U/R+Q\u001bV{G\u000b\u000eaQp\u001a62jqqyG$8F.eM&sQQ?o=ѪͿ\u000fUj(-\u0002 AjNPZEғէ\u0012<\u0010jS#]O\bb[\\vweO`\u0001gP7\u0016$|\u0012Vqґ\u0012\u05f91=Qݝd5\nhk=\u0014\u0007N2}\u05f7\u0001ֈ`W\u0016ўZi)M.qDrXƄ\u001fц$\u00046\u05fdE\u0001\u00189 8e\u0001a\u000eiȈeŸ{!Hӏ{x\u0014Vch'\u001a:\u061co߾Y\u000b\u000bϟ\u0002b\b\u0004EPK\u001f}Ӑ0 \\ZBÎ$2f\u0016\u0018\u0014C,uߏ\nԖ-\u0016Wɪ\u0001rqfi%{AyCy7@T.}M\u0015$\u001e\u0001ė*נ?VU˾5\u0015jyZW<hAۭpé\u0010)\u001cΙOVl-+6\\qLz\u0006б%۵_\rO֜W\u0010SL>!_V\u0016א9כ\u000fo0ϓa\u000fHk\r\u007fXL_ۅ\u0002\u05ff0-N§\u000e,5v<st\u00056KsVp\"\u0003ֹ\u0010Ŕ3Z@Ԍ\u000fh(;SQaKo։\rͤ<\u0006wޞiAxXk%X\tSӘ\u000fק}1s\u009fDE\u0001CG\u0011\u0006\u001a\u0006\b\u0012çAְP'\u0014\u058b6V\ro{V=\u0005\u0003ݼA¹\"y]ʮP\u0018-H<\b\f\".[\b\u05fd6ن`@^؛(\u00104ONnrF\u001eؠ\u0005ݨ\u000e,qѢDpi\bLA)7oܕJЃ1l\u000fŵ\u001et\b2\\\rs7\u000eʗ\u0012Ԡ7\u0017\u0005Ә \u007fNSatc.\u000b\u0007\u0013ͫ\u007f̿>2i\u058cJSN\u0004B\u0006[=+ĠvݺqQgݐ\t \u001b9\u001cyGQ\u000f-7ߺ$ĔOvN՝-\u0007[oz\rV\u000eR\u000e\u0005˺\u0018ƨ\n\u00166Ѓǯ\u0006`"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nm\u0017\u0013Na\u000e9d/3_}/\r", "\u001anZ5g;I!bpz[\u001a\u0007\u00075e\u000f}", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nr\u0017\u00145y\fBv4\"Yy\u001f7zT\u000fZ?Ck\u0012\u001a\u001co^5\u0005i\u0002", "B`b8E<G\\\u0019\f", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004\rGv\u001f.Z\u0019", "=qX4\\5:Z\u0006~\u0007n,\u000b\u0018", "\u001anZ5g;I!bkzj<|\u0017>;", ":hbAX5>`", "\u001anZ5g;I!bpz[\u001a\u0007\u00075e\u000f\u000f\u007fN\u0010\u0017 G|c", "@`]1b4", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9mU", ">h]4<5MS&\u0010ve\u0014\u0001\u00106i\u000e", "", "3wc2a:B]\"\r", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nr\u0017\u00145y\fBv4\u0015l\r @{\u001a8VQ\u0011", ";h]6`<F2\u0019\u007f\u0002Z;|v3z\u007f", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n\u0015'T|\u000eE\u0006n$U\f&$}\u001f7MP\u0011R>$\u0018wpDT-\u0019N\u00037GZ]\u0002C\\x@#!e[\u0018\u001d\r\u0002GK\"tDF\u0006\f:X\u0002Dh\u000ea|\u00131{l\ff\u001fK\u0001^b=2gPa5^.KKe9s\u0017-f`CI$!z\u0015\"2b<SmS\u000e`\\wmgVx\u000eG$G{_PN}+!8\u0018", "/vP6g0GU\u0004\t\u0004`", "", "1`[9", "\u001anZ5g;I!b\\ve3R", "3m`BX<>Rv\u0006\u0005l,", "4`X9X+", "9dh", "", "5dc\u0019\\:MS\"~\b\u001d6\u0003\f>t\u000b", "u(;<^/Mb$LDP,yv9c\u0006(\u000b'\u0005%&Gx\u000eIL", ";db@T.>/\"}Xe6\u000b\t\u001bu\u007f8{", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CD\u007f4\f@V", "", "<`\\2", ">n]4D<>c\u0019", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "?tTBX\u001aBh\u0019", "@dP1X9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nr\u0017\u00145y\fBv4\"Yy\u001f7zk", "@dR2\\=>Rv\u0006\u0005l,Z\u0013.e", "", "@dR2\\=>Rv\u0006\u0005l,i\t+s\n1", "@dR2\\=>R\u0004\u0003\u0004`\n\u0007\u00198t", "@dR2\\=>R\u0004\t\u0004`\n\u0007\u00198t", "Ad]AC0GUv\t\u000bg;", "Asa2T4L", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nm\u0017\u0013Na\u000e9d/3_}/u[%;M?Cy\n", "B`b8D<>c\u0019", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004\fGm&.#", "EqXAX9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nr\u0017\u00145y\fBv4'f\u0002/7zk", "EqXAX9-O'\u0005", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004u", "/vP6g\u001b>`!\u0003\u0004Z;\u0001\u00138", "", "Bh\\2b<M", "Bh\\2H5Bb", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "1`]0X3", "1gT0^\u001cIU&zy^\u001a\r\u0007-e\u000e6", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "3wR5T5@S", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0005HW\u0001\u001c@o\u0016\u0004", "1gT0^\u001cIU&zy^\u001a\r\u0007-e\u000e6:J\u0007\u001a&Vz", "1k^@X", "1nS2", "@dP@b5", "1`]0X3\u001aT(~\b<3\u0007\u0017/M\u0004/\u0003D\u000f", "1n];X*M", "1kX2a;", "\u001anZ5g;I!bh\u0001A;\f\u0014\rl\u0004(\u0005OV", "4`X9J,;A#|\u0001^;", ExifInterface.GPS_MEASUREMENT_3D, "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "7mXAE,:R\u0019\fVg+n\u00163t\u007f5", ":n^=E,:R\u0019\f", "=mA2T+\u001cZ#\rz", "=mA2T+&S'\rv`,", "BdgA", "0xc2f", "=mA2T+)W\"\u0001", ">`h9b(=", "=mA2T+)]\"\u0001", ">n]4", ">q^0X:L<\u0019\u0012\n?9x\u0011/", "@d`BX:M", "@t]$e0MS&", "Ad]1", "2`c.", "4na:T;(^\u0017\ty^", "BdP?76P\\", "EqXAX\u0016GSy\fvf,", "EqXAX\u0016GSy\fvf,;\u00135h\u000f7\u0007", "EqXAX\u0017B\\\u001b_\bZ4|", "EqXAX\u0017B\\\u001b_\bZ4|G9k\u00037\u000bK", "7rE._0=", "\u0011k^@X", "\u0011n\\=T5B]\"", "\u001bdb@T.>", "!sa2T4L", "%qXAX9-O'\u0005", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<ByteString> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;
    public static final Companion Companion = new Companion(null);
    private static final List<Protocol> ONLY_HTTP1 = CollectionsKt.listOf(Protocol.HTTP_1_1);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\f8é6B\u0015\"4ߚ\u007f\u0007tqA0JkN\u008chݷZ\u000f\u001aztAk(\u007fCSUH~2\u000f]P\u007fi\u0005I\t\u000eS\u0013\u0014\u001a\u0011jZNǤ|] \u0015\u0003Q}CKM\u001eB˃dz>ӌ84(?\b\rQ)8H(v)Dƚ\u0010\u00188ϋ\t<X\u0016[\u000fj#\u0014@8\u00034[\u0016QɇLreŽG%\ttPZϴc="}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nm\u0017\u0013Na\u000e9d/3_}/uK\u001d8[C\u0011", "", "1nS2", "", "@dP@b5", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "1`]0X3\u001aT(~\b<3\u0007\u0017/M\u0004/\u0003D\u000f", "", "uH;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}`\u0004q", "5dc\u0010T5<S Z{m,\nf6o\u000e(cD\b\u001e\u001bU", "u(9", "5dc\u0010b+>", "u(8", "5dc\u001fX(L]\"", "u(;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final ByteString reason;

        public Close(int i2, ByteString byteString, long j2) {
            this.code = i2;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j2;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final ByteString getReason() {
            return this.reason;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005#4\u0012\u0006%njO0L͜N\u0093Siճ?k*3d`*qٴ?U(}r\u0015]O\u007fg\u001dL1Œ\u0016Ǉ\n\u0016\u0001̓|Uc{u\u0012=4\u0019Ī\u0012ݯQoEʠ1\u0001D\t82P:PڑSʀ.H\u0018͌KUY\u0011*6PrJR;T3 hâ@ŋ\u0005\u001edɡߗ:P"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nm\u0017\u0013Na\u000e9d/3_}/uK 6X?Do>'j", "", "u(E", "\u0011@=\u00108\u00138/ymZK&Zo\u0019S_\"c$g}z5", "", "\u0012D5\u000eH\u0013-M\u0001bcB\u0014lp)D_\tb\u001cov\u00115S\u0003\u001c", "\u001b@G,D\u001c\u001eCxxhB!\\", "\u001dM;&R\u000f-B\u0004J", "", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\u0015\"4\u0012}\u000blʑOӄtev-\u0013f:\u0013y{L$\n%\u0002GIW2}P\fҊRgur\u001bi\u0019E'\u0006D{̶0O]ތu\u0014\u00157Pu\u0010B[oU9\u000fuȥ\t&:ĲP{\u000b\b(2У\u0014\u007f"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nm\u0017\u0013Na\u000e9d/3_}/uU\u0016<[?=k\n", "", "4na:T;(^\u0017\ty^", "", "2`c.", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "uH;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}?1", "5dc\u0011T;:", "u(;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}", "5dc\u0013b9FO(h\u0006\\6{\t", "u(8", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Message {
        private final ByteString data;
        private final int formatOpcode;

        public Message(int i2, ByteString data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.formatOpcode = i2;
            this.data = data;
        }

        public final ByteString getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007|jA0JkNRhݷZ\u000f\u001azt?k(\u007fCSUH~2\r]P\u007fg\u001dMj\u000fQ\u0013\u001e\u0016'o߽MU\u0007cb\u001e@B\b?aNڱA?hҚN\u0007&90@J\u0014\u000f\u001eBH>{ټGQ\u0014۵HBvC`\u0017\u001e\u0014(\u0014\u001e>N\u0004ɉ`mVȤ`ncE=/ɮmO"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nm\u0017\u0013Na\u000e9d/3_}/u[%;M?Cy\n", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "1kX2a;", "", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "uY;<^0H\u001du\u000f{_,\n\t.S\n8\t>\u0001l}Qu\u0012F@\u0002EZ~ Dm\u0015\u001cQLAAw\u000f", "5dc\u0010_0>\\(", "u(I", "5dc \\5D", "u(;<^0H\u001du\u000f{_,\n\t.S\u00041\u0002\u0016", "5dc b<KQ\u0019", "u(;<^0H\u001du\u000f{_,\n\t.S\n8\t>\u0001l", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final BufferedSink sink;
        private final BufferedSource source;

        public Streams(boolean z2, BufferedSource source, BufferedSink sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.client = z2;
            this.source = source;
            this.sink = sink;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final BufferedSink getSink() {
            return this.sink;
        }

        public final BufferedSource getSource() {
            return this.source;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00126Ȑ\u0005ӯ.(Մ7f\u00198pGͿL.`Sr\u0015y|L$\n&8WшY\u001d"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nm\u0017\u0013Na\u000e9d/3_}/u_#2\\CHZ0,\u001b>", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004u", "uK^8[;M^fH~g;|\u00168a\u0007q\u000eNJ\u0004\u0017Cv\u007f<s\u0013?W\u0004 FCY\u001f", "@t]\u001ca*>", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e2) {
                RealWebSocket.this.failWebSocket(e2, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request originalRequest, WebSocketListener listener, Random random, long j2, WebSocketExtensions webSocketExtensions, long j3) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = j2;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j3;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!Intrinsics.areEqual("GET", originalRequest.method())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.method()).toString());
        }
        ByteString.Companion companion = ByteString.Companion;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.INSTANCE;
        this.key = ByteString.Companion.of$default(companion, bArr, 0, 0, 3, null).base64();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.unknownValues && webSocketExtensions.clientMaxWindowBits == null) {
            return webSocketExtensions.serverMaxWindowBits == null || new IntRange(8, 15).contains(webSocketExtensions.serverMaxWindowBits.intValue());
        }
        return false;
    }

    private final void runWriter() {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        Task task = this.writerTask;
        if (task != null) {
            TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
        }
    }

    private final synchronized boolean send(ByteString byteString, int i2) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + ((long) byteString.size()) > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += (long) byteString.size();
            this.messageAndCloseQueue.add(new Message(i2, byteString));
            runWriter();
            return true;
        }
        return false;
    }

    public final void awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(j2, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        Intrinsics.checkNotNull(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + TokenParser.SP + response.message() + '\'');
        }
        String strHeader$default = Response.header$default(response, "Connection", null, 2, null);
        if (!StringsKt.equals("Upgrade", strHeader$default, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strHeader$default + '\'');
        }
        String strHeader$default2 = Response.header$default(response, "Upgrade", null, 2, null);
        if (!StringsKt.equals("websocket", strHeader$default2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strHeader$default2 + '\'');
        }
        String strHeader$default3 = Response.header$default(response, HttpHeaders.SEC_WEBSOCKET_ACCEPT, null, 2, null);
        String strBase64 = ByteString.Companion.encodeUtf8(this.key + WebSocketProtocol.ACCEPT_MAGIC).sha1().base64();
        if (!Intrinsics.areEqual(strBase64, strHeader$default3)) {
            throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strBase64 + "' but was '" + strHeader$default3 + '\'');
        }
        if (exchange == null) {
            throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
        }
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i2, String str) {
        return close(i2, str, 60000L);
    }

    public final synchronized boolean close(int i2, String str, long j2) {
        ByteString byteStringEncodeUtf8;
        WebSocketProtocol.INSTANCE.validateCloseCode(i2);
        if (str != null) {
            byteStringEncodeUtf8 = ByteString.Companion.encodeUtf8(str);
            if (byteStringEncodeUtf8.size() > 123) {
                throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
            }
        } else {
            byteStringEncodeUtf8 = null;
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(i2, byteStringEncodeUtf8, j2));
            runWriter();
            return true;
        }
        return false;
    }

    public final void connect(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        if (this.originalRequest.header(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS) != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient okHttpClientBuild = client.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request requestBuild = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header(HttpHeaders.SEC_WEBSOCKET_KEY, this.key).header(HttpHeaders.SEC_WEBSOCKET_VERSION, "13").header(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS, "permessage-deflate").build();
        RealCall realCall = new RealCall(okHttpClientBuild, requestBuild, true);
        this.call = realCall;
        Intrinsics.checkNotNull(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e2) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e2, "e");
                RealWebSocket.this.failWebSocket(e2, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                Exchange exchange = response.exchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    Intrinsics.checkNotNull(exchange);
                    Streams streamsNewWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions webSocketExtensions = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.this.extensions = webSocketExtensions;
                    if (!RealWebSocket.this.isValid(webSocketExtensions)) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            realWebSocket.messageAndCloseQueue.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + requestBuild.url().redact(), streamsNewWebSocketStreams);
                        RealWebSocket.this.getListener$okhttp().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e2) {
                        RealWebSocket.this.failWebSocket(e2, null);
                    }
                } catch (IOException e3) {
                    RealWebSocket.this.failWebSocket(e3, response);
                    Util.closeQuietly(response);
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                }
            }
        });
    }

    public final void failWebSocket(Exception e2, Response response) {
        Intrinsics.checkNotNullParameter(e2, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            Unit unit = Unit.INSTANCE;
            try {
                this.listener.onFailure(this, e2, response);
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            } catch (Throwable th) {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
                throw th;
            }
        }
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(String name, Streams streams) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.extensions;
        Intrinsics.checkNotNull(webSocketExtensions);
        synchronized (this) {
            this.name = name;
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            if (this.pingIntervalMillis != 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(this.pingIntervalMillis);
                final String str = name + " ping";
                this.taskQueue.schedule(new Task(str) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.writePingFrame$okhttp();
                        return nanos;
                    }
                }, nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            Unit unit = Unit.INSTANCE;
        }
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i2, String reason) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (i2 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new IllegalStateException("already closed".toString());
            }
            this.receivedCloseCode = i2;
            this.receivedCloseReason = reason;
            streams = null;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                Streams streams2 = this.streams;
                this.streams = null;
                webSocketReader = this.reader;
                this.reader = null;
                webSocketWriter = this.writer;
                this.writer = null;
                this.taskQueue.shutdown();
                streams = streams2;
            } else {
                webSocketReader = null;
                webSocketWriter = null;
            }
            Unit unit = Unit.INSTANCE;
        }
        try {
            this.listener.onClosing(this, i2, reason);
            if (streams != null) {
                this.listener.onClosed(this, i2, reason);
            }
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.closeQuietly(webSocketWriter);
            }
        } catch (Throwable th) {
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.closeQuietly(webSocketWriter);
            }
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            return true;
        }
        return false;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e2) {
            failWebSocket(e2, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return send(ByteString.Companion.encodeUtf8(text), 1);
    }

    @Override // okhttp3.WebSocket
    public boolean send(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return send(bytes, 2);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() throws IOException {
        String str;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        int i2;
        Streams streams;
        synchronized (this) {
            if (this.failed) {
                return false;
            }
            WebSocketWriter webSocketWriter2 = this.writer;
            ByteString byteStringPoll = this.pongQueue.poll();
            final boolean z2 = true;
            Object obj = null;
            if (byteStringPoll == null) {
                Object objPoll = this.messageAndCloseQueue.poll();
                if (objPoll instanceof Close) {
                    i2 = this.receivedCloseCode;
                    str = this.receivedCloseReason;
                    if (i2 != -1) {
                        streams = this.streams;
                        this.streams = null;
                        webSocketReader = this.reader;
                        this.reader = null;
                        webSocketWriter = this.writer;
                        this.writer = null;
                        this.taskQueue.shutdown();
                    } else {
                        long cancelAfterCloseMillis = ((Close) objPoll).getCancelAfterCloseMillis();
                        TaskQueue taskQueue = this.taskQueue;
                        final String str2 = this.name + " cancel";
                        taskQueue.schedule(new Task(str2, z2) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                this.cancel();
                                return -1L;
                            }
                        }, TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                        streams = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                    }
                } else {
                    if (objPoll == null) {
                        return false;
                    }
                    str = null;
                    webSocketReader = null;
                    webSocketWriter = null;
                    i2 = -1;
                    streams = null;
                }
                obj = objPoll;
            } else {
                str = null;
                webSocketReader = null;
                webSocketWriter = null;
                i2 = -1;
                streams = null;
            }
            Unit unit = Unit.INSTANCE;
            try {
                if (byteStringPoll != null) {
                    Intrinsics.checkNotNull(webSocketWriter2);
                    webSocketWriter2.writePong(byteStringPoll);
                } else if (obj instanceof Message) {
                    Message message = (Message) obj;
                    Intrinsics.checkNotNull(webSocketWriter2);
                    webSocketWriter2.writeMessageFrame(message.getFormatOpcode(), message.getData());
                    synchronized (this) {
                        this.queueSize -= (long) message.getData().size();
                        Unit unit2 = Unit.INSTANCE;
                    }
                } else {
                    if (!(obj instanceof Close)) {
                        throw new AssertionError();
                    }
                    Close close = (Close) obj;
                    Intrinsics.checkNotNull(webSocketWriter2);
                    webSocketWriter2.writeClose(close.getCode(), close.getReason());
                    if (streams != null) {
                        Intrinsics.checkNotNull(str);
                        this.listener.onClosed(this, i2, str);
                    }
                }
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
                return true;
            } catch (Throwable th) {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
                throw th;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            if (webSocketWriter == null) {
                return;
            }
            int i2 = this.awaitingPong ? this.sentPingCount : -1;
            this.sentPingCount++;
            this.awaitingPong = true;
            Unit unit = Unit.INSTANCE;
            if (i2 != -1) {
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i2 - 1) + " successful ping/pongs)"), null);
                return;
            }
            try {
                webSocketWriter.writePing(ByteString.EMPTY);
            } catch (IOException e2) {
                failWebSocket(e2, null);
            }
        }
    }
}
