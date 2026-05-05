package okhttp3;

import com.dynatrace.android.agent.Global;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http1.HeadersReader;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG<LeN/ZS8\u0018sڔ<$q$yّCU0}*\tUOog|PbŏK\u000f\u0014\u0016\u0001̓4Ic\u007fe\u0012\u00152JoU3UoC;vҚT\u001fP2P72\u0006\u001b5F\t\u001d|\u000fSO\u001a\u0012H@\u001f;ň\u0011M\u0013\u001cR\u0019N$\u000f!tg|:Xpk?G#1oŌR'm7ES\u001bYl';\u000b(2sNEJ-%\u0002\u00197ViV\u001b? SKho-9a\fYLW.-e<]\u0012urTb;Vԃ\u0010-3Ւ{MV\u00136\u007fK\b\u001bE\u001c\u000e41\u001f͖9բj\b\u0016ޗE~aKh\u0002\rNVаcي\u001b%\bđ{K)sigQ\u0018|EL\u0005;̔yЪzĲ_T\u0016֫e'b\u0007i1\u007fL\u0014ʳP̆]=uՎAn\u0010:\u001c0u\n\u0006Ɉ\u001dѧ\u001b%?ك\n//|\u001aHryMݖlĈWiZ̲\u0011.|\u0019O*7\u00101ըfʰoP\\Аµ\u0015j"}, d2 = {"\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0015{<\u007f\u0017$\u001d", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "uK^8[;M^fHg^:\b\u00138s\u007f\u0005\u0006?\u0015lZ8", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "0nd;W(Kg", "", "uK^8\\6\b0)\u007f{^9|\b\u001do\u00105y@V}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019~\\", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1k^@X+", "", "1q[37(LVwz\ta\t\u0007\u00198d{5\u0010", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "1ta?X5M>\u0015\f\n", "\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0015{<\u007f\u0017$\u0006Z\nI\u0006\u0013?i\u000b\u001e7C", "2`b57(LVu\t\u000bg+x\u0016C", "<n<<e,)O&\u000e\t", ">`aA66N\\(", "", "1k^@X", "", "1ta?X5M>\u0015\f\n;@\f\t=R\u007f0wD\n\u001b I", "", ";`g\u001fX:NZ(", "<dgAC(Kb", "\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0015{<\u007f\u0017$\u0006Z\nI\u0006z", "\u0011n\\=T5B]\"", "\u001e`aA", "\u001e`aAF6N`\u0017~", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Options afterBoundaryOptions = Options.Companion.of(ByteString.Companion.encodeUtf8("\r\n"), ByteString.Companion.encodeUtf8("--"), ByteString.Companion.encodeUtf8(Global.BLANK), ByteString.Companion.encodeUtf8("\t"));
    private final String boundary;
    private boolean closed;
    private final ByteString crlfDashDashBoundary;
    private PartSource currentPart;
    private final ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final BufferedSource source;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0015{<\u007f\u0017$\u0006M\u0018D\u0002!>]\b)\r", "", "u(E", "/ec2e\tHc\"}vk@f\u0014>i\n1\n", "\u001anZ6bu(^(\u0003\u0005g:R", "5dc\u000eY;>`u\t\u000bg+x\u0016CO\u000b7\u007fJ\n%", "u(;<^0H\u001d\u0003\n\nb6\u0006\u0017\u0005", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Options getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\tnjG0L͜^\u008c\u0003SX\u000e,\u000fD(i$\nCiV*\u00020\u000bgN\u0016jĔNZ\u0019GW\r$\u007f\u0003,w]?ى\u0011_CPqW3{rs>žx<\rړJ$>{\u0013\u0006j;V\u0010\u000fzqLB\u0017ضDvBĥ%O\u000b\u001a \f̭$\n"}, d2 = {"\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0015{<\u007f\u0017$\u0006Z\nI\u0006z", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=;", "0nSF", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "uK^8[;M^fH]^({\t<sU\u000f\u0006F\u0005!`$\u007f\u000f=v25Xk*Gz\u0014.#\u0007,", "u(;<^0H\u001du\u000f{_,\n\t.S\n8\t>\u0001l", "u(;<^/Mb$LDA,x\b/r\u000e}", "1k^@X", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Part implements Closeable {
        private final BufferedSource body;
        private final Headers headers;

        public Part(Headers headers, BufferedSource body) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(body, "body");
            this.headers = headers;
            this.body = body;
        }

        public final BufferedSource body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0012\u007fјnjG7L͜P.hS2\u000fq{:Ŝ]:ڎs;\u0004\u0019>%\u07beSNug7Ph\u000e[\u000f4\u001a?~t_c}u\u0012=8rsM:eokA\u0011xD\u000e82P>@\u0019I 8I(v)E\u0012 b<NqRR;O[܈\u0014ĂB \tȦ֚kX"}, d2 = {"\u001anZ5g;I!bf\u000be;\u0001\u0014+r\u000f\u0015{<\u007f\u0017$\u0006Z\nI\u0006\u0013?i\u000b\u001e7C", "\u001anZ6bu,])\fx^\u0002", "uK^8[;M^fHbn3\f\r:a\r7h@|\u0016\u0017TEQ-", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "1k^@X", "", "@dP1", "", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class PartSource implements Source {
        private final Timeout timeout = new Timeout();

        public PartSource() {
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // okio.Source
        public long read(Buffer sink, long j2) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j2 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            if (!Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed".toString());
            }
            Timeout timeout = MultipartReader.this.source.timeout();
            Timeout timeout2 = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long jTimeoutNanos = timeout.timeoutNanos();
            timeout.timeout(Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos()), TimeUnit.NANOSECONDS);
            if (!timeout.hasDeadline()) {
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j2);
                    return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining);
                } finally {
                    timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout2.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j2);
                return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining2);
            } finally {
                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(ResponseBody response) throws IOException {
        String strParameter;
        Intrinsics.checkNotNullParameter(response, "response");
        BufferedSource bufferedSourceSource = response.source();
        MediaType mediaTypeContentType = response.contentType();
        if (mediaTypeContentType == null || (strParameter = mediaTypeContentType.parameter("boundary")) == null) {
            throw new ProtocolException("expected the Content-Type to have a boundary parameter");
        }
        this(bufferedSourceSource, strParameter);
    }

    public MultipartReader(BufferedSource source, String boundary) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new Buffer().writeUtf8("--").writeUtf8(boundary).readByteString();
        this.crlfDashDashBoundary = new Buffer().writeUtf8("\r\n--").writeUtf8(boundary).readByteString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j2) throws IOException {
        this.source.require(this.crlfDashDashBoundary.size());
        long jIndexOf = this.source.getBuffer().indexOf(this.crlfDashDashBoundary);
        return jIndexOf == -1 ? Math.min(j2, (this.source.getBuffer().size() - ((long) this.crlfDashDashBoundary.size())) + 1) : Math.min(j2, jIndexOf);
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.rangeEquals(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.size());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(8192L);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(jCurrentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.size());
        }
        boolean z2 = false;
        while (true) {
            int iSelect = this.source.select(afterBoundaryOptions);
            if (iSelect == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iSelect == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, Okio.buffer(partSource));
            }
            if (iSelect == 1) {
                if (z2) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iSelect == 2 || iSelect == 3) {
                z2 = true;
            }
        }
    }
}
