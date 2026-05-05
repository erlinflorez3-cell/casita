package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import okio.AsyncTimeout;
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
@Metadata(bv = {}, d1 = {"ЯĮ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ffxB8DkH6Raճ\u0017k\u00026,[:qK;[\u001c\u0006\"\u001fOVgmqRZ!C\u0017\u0006\u001cyr,_U\u0001ز\u001a\u000fHBwЀ;M\u0006=A`z?\r 8$@y\u0013\u0001\"*N\u0010~zYK\u0014\u00126Dx:h\rUĨ\"\u0012\u001c>(\u0001$\\oNLHt]@1+\u0003\u007fBV'e5\u0005M#F\\'\u0013\u007fi\u001e9L?5\u001b%[\u0003\u001dRc?\t?y=\u001bh/'1M\u001cVbnÜD\u0015YNE]U\n\u001d ad\u001a'CO\u0012L`\u00126y\u0013{;?\u0014\u0012\u0014+`.[\u001fǴ\f\u000eAz;_N\u007f\u001a^p0+eD%=\u007fa8\u0002:t\u0003y;_\u0001W\u0004\u000bټ,U)p7Z\u0003A\u0011\u0019)\t\u0010Qw\u0004\u0007=˓R\ngr6\n~\u0019\u001a*2`\u000e\u007fw\u0002\u001fe/%e\f\u007f7iq\u0010\u0001\\g%ݓ'|\u001cw`\u0002X\"\u001dPg.\u0017GrD\u0013A2P\u001df:Ne\u001c\u00037.\f!^twj`k$\u0017cv*\u0003M\f:U3txqn\u001a\u0011\b=luMQ\u0012\u0015*X\u0005WW<\u0011I\u001fz\u000bf\u001a t(Pbxn\u001e>\u0014D|\u0011YԵƐu\u001c:sy$j]`\u0003L\u0007\bґȤcZnYGgAn\u001biR\u00119\u0005^(\to\u0016E\u0010ؓʬd\"3\u000f\u001a;'tm\"\u00179C7O\u0005\u0002O_gzL\u0013\u0001^/cL8\u0016`kq7CП\u001d1Q4\u0018,s\u007f#i_h*')\u0019*\u0013I:Fg6o!0n=bO\u0003\u001cRzl';\b+2@ӓâ~Ii(\u00190\u0007`\u0001Xq>d7+8O$35\b$\u00134[vmݴə{\u00145k*hwGFy\u0011gl۩Ф\b,io8o_8J=NH\bZ\u0005Эٝp\u0003H%3}\u0016\u0004!4;6\u000fU-td\u0016e\u000b]\u0003/\r:8\tV\n\u0019Y\u0004F8<\u000eBsq.\\}Q\u0005)M\u001a\u001a\u000euQŌ\u0019|7\f!z_\"B K\u0001nW);v\u0006֯\u001c6Op+\u000bJj<4Z\u0015N\u000b\u0014bw\r(|\u0016E\u000e\u0017mϫNǠ?V\u0016֊IhdQ\u001d`sewƤ\r϶\u00133&֭\u0006@\u0013m^T]d҅\u0005Y%̿3lU\tt0{dbG3*n\u007f9R\u000eIW\u000eN\u0006](\u001cx.L\u000f\u0095\tܫF\u001e#ʃi\u0013e\u0006>n[ar_|v@x)ƌ$Ĺ\u0003z\u0005ɚ\r$\u001d\u001e1Q\tn\u0011:#Ϝ\u0004̢G&\tҿ\\+\r \u000bsf\u001d3\u001bCC\u000e[x+?{\u0006k\u0012ռ\nÙ$-\fȌ9^]'t$.)H1\n\u0018x\u00017/'܃\u0010̛Ntz˖~\u0016Dl\u001a5\u0018\u0012\rwBկ-͛++tݩ\u0013Wv\u0018\"c\u001b\u0004Eά\rөj1^ҳ?9^>!'{3ìfϳ\u0015S(ǅa\u000f\"\u0019>\u001fd\rԖ-\u0016Wɪ\u0001rqqi0{OyNy3FQL\u001aO\u007f\u0004\u0010BV>\u0014ir\f~;Ӹh\u05cfF]\u0016ߜ\u0003*j\u001a\u001aOd\f\rJv\u0011A7лv$lӵO\u001b%\u0003\u001bo1\u0013\u0012na&O6)̋'σ6\u000bwĉG\u001d\u0011dzt./\u0019տ~Ϩk,5õ%K(Rq$\u001c\u0011YͼMԺ<D\u0010,\u001f;a;hf8>\u000b\u001frԠ]ߥE\u0019\u0019۴ͪ<j"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}3t\u001d\u0004", "\u001anZ5g;I!b\\ve3R", "1kX2a;", "\u001anZ5g;I!bh\u0001A;\f\u0014\rl\u0004(\u0005OV", "=qX4\\5:Z\u0006~\u0007n,\u000b\u0018", "\u001anZ5g;I!bkzj<|\u0017>;", "4na$X),]\u0017\u0005zm", "", "uK^8[;M^fHdd\u000f\f\u0018:C\u0007,{I\u0010l}Qu\u0011K\u00060\u0003#j C}\u0016<\\\u00190/%", "1`[9F;:Q\u001fm\bZ*|", "", "1`]0X3>R", "5dc\u0010_0>\\(", "u(;<^/Mb$LDH2_\u0018>p]/\u007f@\n&l", "\nrTA \u0006\u0017", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=s", "1n];X*MW#\b", "5dc\u0010b5GS\u0017\u000e~h5", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~F}\u001c>K 7VC9z8(\u001e>", "1n];X*MW#\beh6\u0004", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=\t\u001frh\u000f", "1n];X*MW#\bih\nx\u0012-e\u0007", "5dc\u0010b5GS\u0017\u000e~h5k\u0013\ra\t&{G", "Adc\u0010b5GS\u0017\u000e~h5k\u0013\ra\t&{G", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n \u0017E~\u0012F\u007fn\"Yy'\u0015w\u001f7MAJo>'j,R", "3uT;g\u0013Ba(~\u0004^9", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000el", "5dc\u0012i,Gb\u007f\u0003\tm,\u0006\t<$\n.~O\u0010\"", "u(;<^/Mb$LD>=|\u0012>L\u00046\u000b@\n\u0017$\u001d", "3wR5T5@S", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0005HW\u0001\u001c@o\u0016\u0004", "3wR5T5@Sy\u0003\u0004],\n", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0005HW\u0001\u001c@o\u0016\u000fQL:kAs", "3wT0h;>R", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "3w_2V;&]&~Zq*\u007f\u00058g\u007f6", "5dc\u0013b90S\u0016l\u0005\\2|\u0018", "u(I", "7mc2e*>^(\t\bL*\u0007\u0014/d_;yC| \u0019G", "5dc\u0016a;>`\u0017~\u0006m6\nv-o\u000b(z \u0014\u0015\u001aCx\u0010<5/;\\\r/B", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~9\u0011\u001e:i\u001f0M\u0019", "5dc\u001ce0@W\"z\u0002K,\t\u0019/s\u000f", "u(;<^/Mb$LDK,\t\u0019/s\u000f}", "@d`BX:M0#}\u000fH7|\u0012", "@db=b5LSu\tyr\u0016\b\t8", "Bh\\2b<M", "=jWAg7\f\u001d\u001d\b\n^9\u0006\u00056/}2\u0005I\u0001\u0015&Ky\u0017\u0006c%1`[\u001c>tT=QK;uD-S4", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}3t\u001dl\\GCk>.$'-\u000f", "Bh\\2b<M3\u0015\f\u0002r\f\u0010\r>", "/b`B\\9>1#\b\u0004^*\f\r9nh2[Q\u0001 &U", "", "1`[976GS", "\u0013", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", ExifInterface.GPS_MEASUREMENT_3D, "uKY.i(\bW#H^H\f\u0010\u0007/p\u000f,\u0006IVZ}Lk\u001f8@)?#a\n\u0017\u0001\u0014.XR?u=s", "1`[9F;:`(", "1`]0X3", "1k^;X", "1qT.g,\u001aR\u0018\fzl:", "\u001anZ5g;I!bZy]9|\u0017=;", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "3m`BX<>", "@db=b5LSvz\u0002e)x\u00075", "\u001anZ5g;I!b\\ve3y\u0005-kU", "3mc2e\u0015>b+\t\bd\u0010\u0006\u0018/r}(\u0007O\u000b$vZm\u00118\u007f'5", "@d`BX:M", "<df\u0012k*AO\"\u0001z?0\u0006\b/r", "3wT0h;>", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "3wXAA,Me#\f\u0001B5\f\t<c\u007f3\u000bJ\u000ev*Er\nEx%", "1k^@X\fQQ\u001cz\u0004`,", "3wXAA,Me#\f\u0001B5\f\t<c\u007f3\u000bJ\u000ev*Er\nEx%sc\u0004#F|!", "5dc\u001fX:I]\"\rzP0\f\f\u0013n\u000f(\t>\u0001\"&Q|k?r)>", "5dc\u001fX:I]\"\rzP0\f\f\u0013n\u000f(\t>\u0001\"&Q|k?r)>\u0018\b&:|%9", "7mXA8?<V\u0015\b|^", "1gP6a", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\f`\u0004Gk\u0015 \u007f45f{ B| ;+F7o=s", "7mXA8?<V\u0015\b|^j\u0007\u000f2t\u000f3", "7r2.a*>Z\u0019}", "7r4EX*Nb\u0019}", ";db@T.>2#\bz", "@d`BX:M2#\bz", "@db=b5LSw\t\u0004^", ";db@T.>2#\bz\u001d6\u0003\f>t\u000b", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n \u0017E~\u0012F\u007fn\u0015l{#3v\u0018.#80R9\u001a&d+=\u0011-\u00108V:ELY;`\\{\u0013Wx_\n_'V\tc\u000b\bX$J\u001d\b7X\u0006EqV", "<n<<e,\u001ef\u0017\u0002vg.|\u0017", "<n<<e,\u001ef\u0017\u0002vg.|\u0017mo\u0006+\u000bO\f", "@dS.V;>R\t\f\u0002", "", "@dS.V;>R\t\f\u0002\u001d6\u0003\f>t\u000b", "@d[2T:>1#\b\u0004^*\f\r9nh2[Q\u0001 &U", "\u001aiPCTuGS(Hhh*\u0003\t>;", "@d[2T:>1#\b\u0004^*\f\r9nh2[Q\u0001 &U.\u0018By4Dd", "@dc?l\b?b\u0019\f[Z0\u0004\u0019<e", "\u001anZ6bu\u001aa-\bxM0\u0005\t9u\u000f}", "Bh\\2b<M3,\u0003\n", "1`d@X", "Bn;<Z.:P ~hm9\u0001\u00121", "\u000frh;V\n:Z ", "\u0011`[9E,?S&~\u0004\\,", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RealCall implements Call {
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private volatile RealConnection connectionToCancel;
    private final EventListener eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private Exchange interceptorScopedExchange;
    private final Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final AnonymousClass1 timeout;
    private boolean timeoutEarlyExit;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0ZeP.XU2\u000fy\b<$a%yCQU\"}(\nWNugvϺb\u000bY\u000f\u000e\u0016~l2հW\u000fزB\u000f`A0JCQ}=Q`#7ӯ$20:B\u0011\u000f.BH>\f+GY\"*0n\b\u0003b\u001be\u001d\u001a@\u001bn(\u000f7tk|Ȥ\u0019l\f>w)\u0011\u0004ZNUtv\u0011\u001e\u001cTW?\r%eToË;9-'Y\b\u0015X,[\u0011H\n=3pW+9P\fWd`>Tkۇ[ոax.ؘ\u001dSf\u001656 rY\\&(&\b2Qʀ\b\u0012\u001e)N<;)7\u0017\u001cC\rr\u0002Q\u0007FެF\u0004\u0013c<)3\u0013\u00047G\u001b~Q\u0010<o\u05ce9߉\t\r&ŀѐr<"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}3t\u001dl)QOt2{\u0011oh\u000f", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "@db=b5LSvz\u0002e)x\u00075", "\u001anZ5g;I!b\\ve3y\u0005-kU", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n \u0017E~\u0012F\u007fn\"Yy'\u0015i\u001d5#*Eq7-$s/\u0003d_3Us#ER$oM", "1`[9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}3t\u001d\u0004", "5dc\u0010T3E", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~F}\u001c>K\u00125T\u0019", "\nrTA \u0006\u0017", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Q\u001f=ME;x\n", "1`[9f\u0017>`{\t\tm", "5dc\u0010T3Ea\u0004~\bA6\u000b\u0018", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`C~\u0018Dz#~5\r*?q\u0014\u0012VR;m4+j", "6nbA", "", "5dc\u0015b:M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "5dc\u001fX8NS'\u000e", "u(;<^/Mb$LDK,\t\u0019/s\u000f}", "3wT0h;>=\"", "", "3wT0h;H`\u0007~\bo0z\t", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012#Y\u000b1;k\u0016\u0004", "@dd@X\n:Z \re^9_\u0013=t`5\u0006H", "=sW2e", "@t]", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class AsyncCall implements Runnable {
        private volatile AtomicInteger callsPerHost;
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(RealCall realCall, Callback responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.this$0 = realCall;
            this.responseCallback = responseCallback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void executeOn(ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            Dispatcher dispatcher = this.this$0.getClient().dispatcher();
            if (Util.assertionsEnabled && Thread.holdsLock(dispatcher)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    this.this$0.noMoreExchanges$okhttp(interruptedIOException);
                    this.responseCallback.onFailure(this.this$0, interruptedIOException);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th) {
                this.this$0.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        public final RealCall getCall() {
            return this.this$0;
        }

        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(AsyncCall other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dispatcher dispatcher;
            String str = "OkHttp " + this.this$0.redactedUrl$okhttp();
            RealCall realCall = this.this$0;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                try {
                    realCall.timeout.enter();
                    boolean z2 = false;
                    try {
                        z2 = true;
                    } catch (IOException e2) {
                        e = e2;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                        dispatcher = realCall.getClient().dispatcher();
                    } catch (IOException e3) {
                        e = e3;
                        if (z2) {
                            Platform.Companion.get().log("Callback failure for " + realCall.toLoggableString(), 4, e);
                        } else {
                            this.responseCallback.onFailure(realCall, e);
                        }
                        dispatcher = realCall.getClient().dispatcher();
                    } catch (Throwable th2) {
                        th = th2;
                        realCall.cancel();
                        if (!z2) {
                            IOException iOException = new IOException("canceled due to " + th);
                            ExceptionsKt.addSuppressed(iOException, th);
                            this.responseCallback.onFailure(realCall, iOException);
                        }
                        throw th;
                    }
                    dispatcher.finished$okhttp(this);
                } catch (Throwable th3) {
                    realCall.getClient().dispatcher().finished$okhttp(this);
                    throw th3;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\rӬ4\u0012}\tlʑOӄtkX0bSX\u000f\u001azt9k(\u007fDSUH}2\u000f]P\u007fi\u0005I\t\u000eß\u0013\u0006$|;=WW\u0011_(\u000e`EņC9UڎU;fyD\u000bڼ6)"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}3t\u001dl+?Br!\u001e\u0016hn9\u0010a,$", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}3t\u001d\u0004", "@dU2e,Gb", "1`[9F;:Q\u001fm\bZ*|", "", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n \u0017E~\u0012F\u007fn\"Yy'\u0015i\u001d5#*@gE\u001a^o]B\t-\u0016K{'E[$oM", "5dc\u0010T3EA(zxd\u001b\n\u0005-e", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class CallReference extends WeakReference<RealCall> {
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.callStackTrace = obj;
        }

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.connection.RealCall$timeout$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u0004IيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a<ƈo}"}, d2 = {"=jWAg7\f\u001d\u001d\b\n^9\u0006\u00056/}2\u0005I\u0001\u0015&Ky\u0017\u0006c%1`[\u001c>tT=QK;uD-S4", "\u001anZ6bu\u001aa-\bxM0\u0005\t9u\u000f}", "Bh\\2W\u0016Nb", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends AsyncTimeout {
        AnonymousClass1() {
        }

        @Override // okio.AsyncTimeout
        protected void timedOut() {
            RealCall.this.cancel();
        }
    }

    public RealCall(OkHttpClient client, Request originalRequest, boolean z2) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = z2;
        this.connectionPool = client.connectionPool().getDelegate$okhttp();
        this.eventListener = client.eventListenerFactory().create(this);
        AnonymousClass1 anonymousClass1 = new AsyncTimeout() { // from class: okhttp3.internal.connection.RealCall.timeout.1
            AnonymousClass1() {
            }

            @Override // okio.AsyncTimeout
            protected void timedOut() {
                RealCall.this.cancel();
            }
        };
        anonymousClass1.timeout(client.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = anonymousClass1;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
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
    private final <E extends IOException> E callDone(E e2) {
        Socket socketReleaseConnectionNoEvents$okhttp;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (Util.assertionsEnabled && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                socketReleaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
            } else if (socketReleaseConnectionNoEvents$okhttp != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        E e3 = (E) timeoutExit(e2);
        if (e2 != null) {
            Intrinsics.checkNotNull(e3);
            this.eventListener.callFailed(this, e3);
        } else {
            this.eventListener.callEnd(this);
        }
        return e3;
    }

    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    private final Address createAddress(HttpUrl httpUrl) {
        SSLSocketFactory sslSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.isHttps()) {
            sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        } else {
            sslSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sslSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    private final <E extends IOException> E timeoutExit(E e2) {
        if (this.timeoutEarlyExit || !this.timeout.exit()) {
            return e2;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        if (e2 != null) {
            interruptedIOException.initCause(e2);
        }
        return interruptedIOException;
    }

    public final String toLoggableString() {
        return (isCanceled() ? "canceled " : "") + (this.forWebSocket ? "web socket" : NotificationCompat.CATEGORY_CALL) + " to " + redactedUrl$okhttp();
    }

    public final void acquireConnectionNoEvents(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (this.connection != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.connection = connection;
        connection.getCalls().add(new CallReference(this, this.callStackTrace));
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        RealConnection realConnection = this.connectionToCancel;
        if (realConnection != null) {
            realConnection.cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.Call
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // okhttp3.Call
    public void enqueue(Callback responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        callStart();
        this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, responseCallback));
    }

    public final void enterNetworkInterceptorExchange(Request request, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z2) {
            this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(request.url()), this, this.eventListener);
        }
    }

    @Override // okhttp3.Call
    public Response execute() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.timeout.enter();
        callStart();
        try {
            this.client.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            this.client.dispatcher().finished$okhttp(this);
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z2) {
        Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z2 && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    public final RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final Response getResponseWithInterceptorChain$okhttp() throws IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        CollectionsKt.addAll(arrayList2, this.client.interceptors());
        arrayList2.add(new RetryAndFollowUpInterceptor(this.client));
        arrayList2.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList2.add(new CacheInterceptor(this.client.cache()));
        arrayList2.add(ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            CollectionsKt.addAll(arrayList2, this.client.networkInterceptors());
        }
        arrayList2.add(new CallServerInterceptor(this.forWebSocket));
        try {
            try {
                Response responseProceed = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
                if (isCanceled()) {
                    Util.closeQuietly(responseProceed);
                    throw new IOException("Canceled");
                }
                noMoreExchanges$okhttp(null);
                return responseProceed;
            } catch (IOException e2) {
                IOException iOExceptionNoMoreExchanges$okhttp = noMoreExchanges$okhttp(e2);
                Intrinsics.checkNotNull(iOExceptionNoMoreExchanges$okhttp, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionNoMoreExchanges$okhttp;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                noMoreExchanges$okhttp(null);
            }
            throw th;
        }
    }

    public final Exchange initExchange$okhttp(RealInterceptorChain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released".toString());
            }
            if (this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        Intrinsics.checkNotNull(exchangeFinder);
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find(this.client, chain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
            Unit unit2 = Unit.INSTANCE;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return exchange;
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        return this.canceled;
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
        return this.executed.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E messageDone$okhttp(okhttp3.internal.connection.Exchange r6, boolean r7, boolean r8, E r9) {
        /*
            r5 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okhttp3.internal.connection.Exchange r0 = r5.exchange
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
            if (r0 != 0) goto Le
            return r9
        Le:
            monitor-enter(r5)
            r3 = 0
            if (r7 == 0) goto L16
            boolean r0 = r5.requestBodyOpen     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L1c
        L16:
            if (r8 == 0) goto L3f
            boolean r0 = r5.responseBodyOpen     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L3f
        L1c:
            if (r7 == 0) goto L20
            r5.requestBodyOpen = r3     // Catch: java.lang.Throwable -> L57
        L20:
            if (r8 == 0) goto L24
            r5.responseBodyOpen = r3     // Catch: java.lang.Throwable -> L57
        L24:
            boolean r2 = r5.requestBodyOpen     // Catch: java.lang.Throwable -> L57
            r1 = 1
            if (r2 != 0) goto L2e
            boolean r0 = r5.responseBodyOpen     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L2e
            goto L30
        L2e:
            r4 = r3
            goto L31
        L30:
            r4 = r1
        L31:
            if (r2 != 0) goto L3c
            boolean r0 = r5.responseBodyOpen     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L3c
            boolean r0 = r5.expectMoreExchanges     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L3c
            r3 = r1
        L3c:
            r1 = r3
            r3 = r4
            goto L40
        L3f:
            r1 = r3
        L40:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L57
            monitor-exit(r5)
            if (r3 == 0) goto L4f
            r0 = 0
            r5.exchange = r0
            okhttp3.internal.connection.RealConnection r0 = r5.connection
            if (r0 == 0) goto L4f
            r0.incrementSuccessCount$okhttp()
        L4f:
            if (r1 == 0) goto L56
            java.io.IOException r0 = r5.callDone(r9)
            return r0
        L56:
            return r9
        L57:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.messageDone$okhttp(okhttp3.internal.connection.Exchange, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException noMoreExchanges$okhttp(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen) {
                    z2 = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return z2 ? callDone(iOException) : iOException;
    }

    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        Intrinsics.checkNotNull(realConnection);
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        Iterator<Reference<RealCall>> it = calls.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().get(), this)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        calls.remove(i2);
        this.connection = null;
        if (calls.isEmpty()) {
            realConnection.setIdleAtNs$okhttp(System.nanoTime());
            if (this.connectionPool.connectionBecameIdle(realConnection)) {
                return realConnection.socket();
            }
        }
        return null;
    }

    @Override // okhttp3.Call
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        Intrinsics.checkNotNull(exchangeFinder);
        return exchangeFinder.retryAfterFailure();
    }

    public final void setConnectionToCancel(RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    @Override // okhttp3.Call
    public AsyncTimeout timeout() {
        return this.timeout;
    }

    public final void timeoutEarlyExit() {
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.timeoutEarlyExit = true;
        this.timeout.exit();
    }
}
