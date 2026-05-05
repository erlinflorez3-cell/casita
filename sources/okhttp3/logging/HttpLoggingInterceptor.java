package okhttp3.logging;

import com.dynatrace.android.agent.Global;
import cz.msebera.android.httpclient.message.TokenParser;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":2\u007f\u0007tvAӄLe^.ZS0\u0012s{B-cҕyCQU\"}(\tWN}gvϺb\u000bY\u000f\u000eǝ\u0001j:I]ތe\u0012\u001d8JoE7cڎm9\u000fsn\u0005<ObG\u007f\n\u0011 0H\u001ev\u0013Cy\rܘ4@~<\u001b\u001b[\u00112\u00124KP\u0005,j\u007fNdW3]\u0003:1\f\u0002B|.&5ƊQ\rLdo\u001b\u0005r6+nIe\u00193f\u001b\u0007\u0001o\u0006\u0017\b\bK\u001a\u0001'UAyweDp\u007fB$[S\u001bt\u000b&\u000b\u001d\u0018`T39h{K~$X{\t\u0016%<2\u0013N3VIE\u001a\u0015ڜ>7\u0003zk@~\t/T\u000e}y<''\u00103Y>Ij(ĨGϭR7\u0004˜]@1\t\u0007!\n[>d#!lw\u007f8\u0010\u0006\u0014ʷZ̆]IuՎ\td\b3\u0012:g\u00025\u0004\u001f9g1E[Q#OlX҉Fϼz\u0005hå\u05eemp"}, d2 = {"\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/b7\u000bKg!\u0019Is\u0017>Z.DY\u000b\u001e7x%8Z\u0019", "\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t\u0016", ":nV4X9", "\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/b7\u000bKg!\u0019Is\u0017>Z.DY\u000b\u001e7x%8Z\u0002\"u6 \u0015u7", "uK^8[;M^fH\u0002h.~\r8gI\u000b\u000bO\f}!Iq\u0012Ex\t>h}-5m!=WPyR> \u0017hn\u000fJT", "6dP1X9LB#kz](z\u0018", "", "", "\nrTA \u0006\u0017", "\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/b7\u000bKg!\u0019Is\u0017>Z.DY\u000b\u001e7x%8Z\u0002\"kE\u001e\u001c>", ":de2_", "5dc\u0019X=>Z", "u(;<^/Mb$LDe6~\u000b3n\u0002q^O\u0010\"}Qq\u0010@\u007f'\u0019b\r Dk\u00169\\MH*\u001b\u001e&hh\u000f", "uK^8[;M^fH\u0002h.~\r8gI\u000b\u000bO\f}!Iq\u0012Ex\t>h}-5m!=WPyR4/\u0015o7|w", "0nSF;(LC\"\u0005\u0004h>\u0006h8c\n'\u007fI\u0003", "", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=;", "zcT=e,<O(~yX3|\u001a/l", "7mc2e*>^(", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "1gP6a", "\u001anZ5g;I!bb\u0004m,\n\u0007/p\u000f2\t~^\u001a\u0013Kxc", ":nV\u0015X(=S&", "", "7", "", "@dS.V;!S\u0015}zk", "<`\\2", "Adc\u0019X=>Z", "\u001ade2_", "\u001anV4X9", "=jWAg7\u0006Z#\u0001|b5~P3n\u000f(\t>\u0001\"&Q|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\bGّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tUR˝ks"}, d2 = {"\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/b7\u000bKg!\u0019Is\u0017>Z.DY\u000b\u001e7x%8Z\u0002\"kE\u001e\u001c>", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001cN=\u0012", "\u0010@B\u00166", "\u0016D0\u00118\u0019,", "\u0010N3&", "=jWAg7\u0006Z#\u0001|b5~P3n\u000f(\t>\u0001\"&Q|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r.4\u0012}\u0007l˸ˏ/Z͜f2\u0003SX\u000e$z8li2q[;\u0004\u001b.&\u0017Qfg\u0016q\u0011~ŸG\u0014"}, d2 = {"\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/b7\u000bKg!\u0019Is\u0017>Z.DY\u000b\u001e7x%8Z\u0002\"u6 \u0015u7", "", ":nV", "", ";db@T.>", "", "\u0011n\\=T5B]\"", "=jWAg7\u0006Z#\u0001|b5~P3n\u000f(\t>\u0001\"&Q|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Logger {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"2ߡx\u001d߿\u001b9^C\u001eG1\u0013X0\u000fө\u007f42[t\u0003Q<m\u001a,$?S%ʼiĔNZ\u0013¼Ǎ\n\u0015ѷn0"}, d2 = {"\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/b7\u000bKg!\u0019Is\u0017>Z.DY\u000b\u001e7x%8Z\u0002\"u6 \u0015u \u0017\u0011k7J\u007f+QU$", "", "u(E", "\u0012D5\u000eH\u0013-", "\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/b7\u000bKg!\u0019Is\u0017>Z.DY\u000b\u001e7x%8Z\u0002\"u6 \u0015u7", "\u0012dU.h3M:#\u0001|^9", "=jWAg7\u0006Z#\u0001|b5~P3n\u000f(\t>\u0001\"&Q|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\":\u001e\u007fјljOӄtev-\u0013V֖\u0013k\n4li2r[;\u0004\u001c.&\u0017Rfg\u0016r\u0011nŸG\u0014"}, d2 = {"\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/b7\u000bKg!\u0019Is\u0017>Z.DY\u000b\u001e7x%8Z\u0002\"u6 \u0015u \u0017\u0011k7J\u007f+QU\r\u000b\\SnM\u001b!A\u0018P-\r\u0012/", "\u001anZ5g;I!b\u0006\u0005`.\u0001\u00121/b7\u000bKg!\u0019Is\u0017>Z.DY\u000b\u001e7x%8Z\u0002\"u6 \u0015u7", "u(E", ":nV", "", ";db@T.>", "", "=jWAg7\u0006Z#\u0001|b5~P3n\u000f(\t>\u0001\"&Q|"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            private static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    Platform.log$default(Platform.Companion.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this(null, 1, null);
    }

    public HttpLoggingInterceptor(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.headersToRedact = SetsKt.emptySet();
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? Logger.DEFAULT : logger);
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || StringsKt.equals(str, "identity", true) || StringsKt.equals(str, "gzip", true)) ? false : true;
    }

    private final void logHeader(Headers headers, int i2) {
        this.logger.log(headers.name(i2) + ": " + (this.headersToRedact.contains(headers.name(i2)) ? "██" : headers.value(i2)));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\r", replaceWith = @ReplaceWith(expression = "level", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_level */
    public final Level m10794deprecated_level() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        Charset UTF_8;
        Charset UTF_82;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z2 = level == Level.BODY;
        boolean z3 = z2 || level == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        String str = "--> " + request.method() + TokenParser.SP + request.url() + (connection != null ? Global.BLANK + connection.protocol() : "");
        if (!z3 && requestBodyBody != null) {
            str = str + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.logger.log(str);
        if (z3) {
            Headers headers = request.headers();
            if (requestBodyBody != null) {
                MediaType mediaTypeContentType = requestBodyBody.contentType();
                if (mediaTypeContentType != null && headers.get("Content-Type") == null) {
                    this.logger.log("Content-Type: " + mediaTypeContentType);
                }
                if (requestBodyBody.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log("Content-Length: " + requestBodyBody.contentLength());
                }
            }
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                logHeader(headers, i2);
            }
            if (!z2 || requestBodyBody == null) {
                this.logger.log("--> END " + request.method());
            } else if (bodyHasUnknownEncoding(request.headers())) {
                this.logger.log("--> END " + request.method() + " (encoded body omitted)");
            } else if (requestBodyBody.isDuplex()) {
                this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
            } else if (requestBodyBody.isOneShot()) {
                this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
            } else {
                Buffer buffer = new Buffer();
                requestBodyBody.writeTo(buffer);
                MediaType mediaTypeContentType2 = requestBodyBody.contentType();
                if (mediaTypeContentType2 == null || (UTF_82 = mediaTypeContentType2.charset(StandardCharsets.UTF_8)) == null) {
                    UTF_82 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_82, "UTF_8");
                }
                this.logger.log("");
                if (Utf8Kt.isProbablyUtf8(buffer)) {
                    this.logger.log(buffer.readString(UTF_82));
                    this.logger.log("--> END " + request.method() + " (" + requestBodyBody.contentLength() + "-byte body)");
                } else {
                    this.logger.log("--> END " + request.method() + " (binary " + requestBodyBody.contentLength() + "-byte body omitted)");
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            Intrinsics.checkNotNull(responseBodyBody);
            long jContentLength = responseBodyBody.contentLength();
            this.logger.log("<-- " + responseProceed.code() + (responseProceed.message().length() == 0 ? "" : Global.BLANK + responseProceed.message()) + TokenParser.SP + responseProceed.request().url() + " (" + millis + "ms" + (!z3 ? ", " + (jContentLength != -1 ? jContentLength + "-byte" : "unknown-length") + " body" : "") + ')');
            if (z3) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    logHeader(headers2, i3);
                }
                if (!z2 || !HttpHeaders.promisesBody(responseProceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyHasUnknownEncoding(responseProceed.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    BufferedSource bufferedSourceSource = responseBodyBody.source();
                    bufferedSourceSource.request(Long.MAX_VALUE);
                    Buffer buffer2 = bufferedSourceSource.getBuffer();
                    Long l2 = null;
                    if (StringsKt.equals("gzip", headers2.get("Content-Encoding"), true)) {
                        Long lValueOf = Long.valueOf(buffer2.size());
                        GzipSource gzipSource = new GzipSource(buffer2.clone());
                        try {
                            buffer2 = new Buffer();
                            buffer2.writeAll(gzipSource);
                            CloseableKt.closeFinally(gzipSource, null);
                            l2 = lValueOf;
                        } finally {
                        }
                    }
                    MediaType mediaTypeContentType3 = responseBodyBody.contentType();
                    if (mediaTypeContentType3 == null || (UTF_8 = mediaTypeContentType3.charset(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    }
                    if (!Utf8Kt.isProbablyUtf8(buffer2)) {
                        this.logger.log("");
                        this.logger.log("<-- END HTTP (binary " + buffer2.size() + "-byte body omitted)");
                        return responseProceed;
                    }
                    if (jContentLength != 0) {
                        this.logger.log("");
                        this.logger.log(buffer2.clone().readString(UTF_8));
                    }
                    if (l2 != null) {
                        this.logger.log("<-- END HTTP (" + buffer2.size() + "-byte, " + l2 + "-gzipped-byte body)");
                    } else {
                        this.logger.log("<-- END HTTP (" + buffer2.size() + "-byte body)");
                    }
                }
            }
            return responseProceed;
        } catch (Exception e2) {
            this.logger.log("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }

    public final void level(Level level) {
        Intrinsics.checkNotNullParameter(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        TreeSet treeSet = new TreeSet(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        TreeSet treeSet2 = treeSet;
        CollectionsKt.addAll(treeSet2, this.headersToRedact);
        treeSet2.add(name);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.level = level;
        return this;
    }
}
