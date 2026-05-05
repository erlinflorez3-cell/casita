package okhttp3.internal.connection;

import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
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
@Metadata(bv = {}, d1 = {"Я|\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0011s{J$c$wHCU(\u0007*\tUUog\u0005JbŏK\u000f\u0014\u001d\u0001j2L]xk\u0012\u0017˰JoU3UڎE9vt>\u0005&5*8\u0010\u0005\t\u001a0I\u0018v\u0011CSÈ\u001a0VpBĥ\u0015M\u001b\u001a\u001a\u0006D#\t\u001ergV6NosŽ_#1hzNh\"p ]\u0011TT?\r%b./N9M\u0015SV\u0013\u000b`_W\u0003mvM\tv-?+wzɱ:X\u000e\u001c]`])urly%Yfϯ5HweaO<F(~\n,T\u0004<&WL<N2f6\"cx\u0001uXP0rr\u0004\t\u0005N\u0017k\u001dĴ/9)\u000b\u001aeI>f7*+U21(\u0007!\n|>d#Dlw\u007f[\u0002DKsf\n\bQ6\b~\u000f\u001a*2V\u0010\u0004=)).EK\u007f_GQ9k0n\rk\u00054xh\u0002\u001a\u001bLNS\u0007\u0016ePQ\u0010hv|\u0005\u001av\u001dd:De\u001c\u0003;.\f!UtwjWm\u001e\\\u0007\u0001k\u0001L\fBU3tpqn\u001a\" ElmMQ\u00126\u0012V\u0005IW<\u0011;!jP\u000f$Z\u000bNj@V'(w*j~\u0010!UWqJRr1a`#\u0006\u001b\u001ep\u007fE\rm\u001a\u0001\u0010-z{0\u0011*<t7'\u0001`~\u0019\u007fxwVMr0-YQc\u001a|ş$מ8\u0003+Ȕ\u0017u\u0006PuV\u0018Xz\u001c\u000eU*'l֠;ֺ3=\u001bÁO;@\rEEz~<ʹOɟ+\u0001\u0005Ȫ'=n;u\u0016;\u0003:b\u0003J}Wmǲx݈v)\u0010ۭ\u0018{gU\tW4f\u0019_VI!\b0ߣP̞\u0001\u000b'Ǉ=\u0003u3\u000bG}_52.wBCEek|\b.(vMfKЂ\u0010Нg\u001cw̥i_8QF`*\u0011L:<l1V~)N٥Dީ8\u0011KJG}~m\ti\u0019I\u0016f5@=tdnR\u0013\u001e\u0012rn6͉\u007fʸ\u0002\u001afƹ=\u0013Snu\u0005ߗO "}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0005HW\u0001\u001c@o\u0016\u0004", "", "1`[9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}3t\u001d\u0004", "3uT;g\u0013Ba(~\u0004^9", "\u001anZ5g;I!b^\f^5\fo3s\u000f(\u0005@\u000el", "4h]1X9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0005HW\u0001\u001c@o\u0016\u000fQL:kAs", "1nS2V", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\f`vZm\u00118\u007f'57\b\u001f7kk", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n \u0017E~\u0012F\u007fn\"Yy'\u0015i\u001d5#*Eq7-$s/\u0003ft,W\u0006\u000eKZ],eR\u007f\u0013z\u001c`\u0011]:\u0018R#E-}DD(\u00043\u0013\u007fEq\n\f\u0014\u001d9ty\f6#E|\u0011~C)IJb^yT\u0017,l0g\u001bn(*\u0004>-#q&$dWw\r\u000bb\u001c<2\rejC\"|8\u0002Hl[D\u001b3F", "5dc\u0010T3E\u0012#\u0005}m;\b", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~F}\u001c>K\u00125T\u0019", "1n];X*MW#\b", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u00125U\u0005}Av\u001f.KR?u=s", "5dc\u0010b5GS\u0017\u000e~h5;\u00135h\u000f7\u0007", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~F}\u001c>K 7VC9z8(\u001e>", "5dc\u0012i,Gb\u007f\u0003\tm,\u0006\t<$\n.~O\u0010\"", "u(;<^/Mb$LD>=|\u0012>L\u00046\u000b@\n\u0017$\u001d", "5dc\u0013\\5=S&=\u0005d/\f\u0018:", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b  Gm\u001d@\u0001.~9\u0011\u001e:i\u001f0M$?t3\u001e\">", "\nrTA \u0006\u0017", "", "6`b\u0013T0Ec&~", "5dc\u0015T:\u001fO\u001d\u0006\u000bk,;\u00135h\u000f7\u0007", "u(I", "7r2<T3>a\u0017~y<6\u0006\u0012/c\u000f,\u0006I", "7r2<T3>a\u0017~y<6\u0006\u0012/c\u000f,\u0006I?!\u001dJ~\u001dG", "7r3Bc3>f", "7r3Bc3>fW\t\u0001a;\f\u0014", "0nSF66F^ ~\n^", "\u0013", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "0xc2f\u0019>O\u0018", "", "@db=b5LSw\t\u0004^", "@d`BX:M2#\bz", ExifInterface.GPS_MEASUREMENT_3D, "uII'?1:d\u0015H~hu`r\u000fx}(\u0007O\u0005! \u001d3tAr61#\u0002*\u0001Q\u007f\u000e`A;vC\"\u001fq7", "1`]0X3", "", "1qT.g,+S%\u000fzl;Y\u0013.y", "\u001anZ6bu,W\"\u0005P", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "2t_9X?", "2dc.V/0W(\u0002kb6\u0004\t8c\u007f", "4h]6f/+S%\u000fzl;", "4kd@[\u0019>_)~\tm", "<df$X),]\u0017\u0005zm\u001a\f\u0016/a\b6", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nm\u0017\u0013Na\u000e9d/3_}/u[%;M?Cy\n", "<n=2j\fQQ\u001cz\u0004`,\u000br8C\n1\u0005@~&\u001bQx", "<nA2d<>a([\u0005]@", "=oT;E,L^#\b\t^\t\u0007\bC", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "@dP1E,L^#\b\t^\u000f|\u0005.e\r6", "\u001anZ5g;I!bkzl7\u0007\u0012=e>\u0005\fD\b\u0016\u0017TE", "3w_2V;\u001c]\"\u000e~g<|", "@db=b5LS{~v],\n\u0017\u000fn~", "@db=b5LS{~v],\n\u0017\u001dt{5\u000b", "BqP0^\r:W \u000f\b^", "BqP6_,Ka", "\u001anZ5g;I!bazZ+|\u0016=;", "EdQ b*DS(n\u0006`9x\b/F{,\u0003@\u007f", "EqXAX\u0019>_)~\tm\u000f|\u0005.e\r6", " d`BX:M0#}\u000fL0\u0006\u000f", " db=b5LSu\tyr\u001a\u0007\u0019<c\u007f", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r)4\u0012}\bnjG9LeN.ZS8\u000fs{:$c$\bCCU \u0001*\teNogtJ`ŒE%إFx\u0019+\nh\ta \u000fJB\u001e@CQ}?Q`#9ӯ$20<B\u000b\u000f#BH>\u0001AW\u0014+ ;Xp\u0001^-U\u000b܅ \u0012f\"\u0017\u001d\u000bt~:Vzu:u/IiŌR'm?ES\u001bVl';\u0001(2sVEF-%\u0002\r7ViQ\u001b? P5l5;CI\"Z|lP #0g\r\fu|؛\u0011Ōd\f/˃ oYV&(&\u0002RȡHǬ\u0012\u0006/Ξ~9(n \u000ea{IԢLг\u0006^JȕKmD\u0019=\u007fa.\u0010ӘhЂe;!\u05cb҂\u007f\u001a"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0005HW\u0001\u001c@o\u0016l:CG{4,$Ek8\u001bQ0W||", "\u001anZ6bu\u001f]&\u0011vk+\u0001\u00121S\u00041\u0002\u0016", "2d[2Z(MS", "\u001anZ6bu,W\"\u0005P", "1n]AX5M:\u0019\b|m/", "", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n \u0017E~\u0012F\u007fn\u0015l{#3v\u0018.#*Eq8(^VeB\r9\u0011\u0012g", "0xc2f\u0019>Q\u0019\u0003\f^+", "1k^@X+", "", "1n\\=_,MS\u0018", "1k^@X", "", "1n\\=_,MS", "\u0013", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", ExifInterface.GPS_MEASUREMENT_3D, "uKY.i(\bW#H^H\f\u0010\u0007/p\u000f,\u0006IVZ}Lk\u001f8@)?#a\n\u0017\u0001\u0014.XR?u=s", "4kd@[", "EqXAX", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class RequestBodySink extends ForwardingSink {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, Sink delegate, long j2) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.this$0 = exchange;
            this.contentLength = j2;
        }

        private final <E extends IOException> E complete(E e2) {
            if (this.completed) {
                return e2;
            }
            this.completed = true;
            return (E) this.this$0.bodyComplete(this.bytesReceived, false, true, e2);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j2 = this.contentLength;
            if (j2 != -1 && this.bytesReceived != j2) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer source, long j2) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            long j3 = this.contentLength;
            if (j3 != -1 && this.bytesReceived + j2 > j3) {
                throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + j2));
            }
            try {
                super.write(source, j2);
                this.bytesReceived += j2;
            } catch (IOException e2) {
                throw complete(e2);
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r)4\u0012}\bnjG9LeN/ZS8\u000fs{:$c$\bCCU \u007f*\teNogtJ`ŐE%إFx\u0019+\nh\ta \u000fJB\u001e@CQ}?Q`#9ӯ$20<B\u000b\u000f$BH>\u0002AW\u0014) <Xp\u0001_-U\u000b܅ \u0013f\"\u0017\u001d\u000bu~:V{u:u0ɨmB\\7(F\u000b^%F\u0003*=zo0C@eHE)a\u0017\u001fR\nBISBI\u0013m?'YLJɑBݼ\u0004\u0014\u001dۀ \u0019kx>\\3X7ϲ3˦ScSִ^4\u0006\u0003\u0014\rj\u000bdͽ3ρ2-\"ǑX\u001aAv\u000bSnSXތDȸ~a>Ѝu\fA4Q\u001b\u0015X8ݥ%\u05ee;{\rټ̽'\u0016"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I\n\u0017\u0015Vs\u0018E@\u0005HW\u0001\u001c@o\u0016l:CIv>'#h>C\u0006w\u001aX\u00074EL$", "\u001anZ6bu\u001f]&\u0011vk+\u0001\u00121S\n8\t>\u0001l", "2d[2Z(MS", "\u001anZ6bu,])\fx^\u0002", "1n]AX5M:\u0019\b|m/", "", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n \u0017E~\u0012F\u007fn\u0015l{#3v\u0018.#*Eq8(^VkI\u0014a,$[j8", "0xc2f\u0019>Q\u0019\u0003\f^+", "1k^@X+", "", "1n\\=_,MS\u0018", "7me<^,,b\u0015\f\n>=|\u0012>", "1k^@X", "", "1n\\=_,MS", "\u0013", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", ExifInterface.GPS_MEASUREMENT_3D, "uKY.i(\bW#H^H\f\u0010\u0007/p\u000f,\u0006IVZ}Lk\u001f8@)?#a\n\u0017\u0001\u0014.XR?u=s", "@dP1", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class ResponseBodySource extends ForwardingSource {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, Source delegate, long j2) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.this$0 = exchange;
            this.contentLength = j2;
            this.invokeStartEvent = true;
            if (j2 == 0) {
                complete(null);
            }
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e2) {
                throw complete(e2);
            }
        }

        public final <E extends IOException> E complete(E e2) {
            if (this.completed) {
                return e2;
            }
            this.completed = true;
            if (e2 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
            }
            return (E) this.this$0.bodyComplete(this.bytesReceived, true, false, e2);
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer sink, long j2) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long j3 = delegate().read(sink, j2);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
                }
                if (j3 == -1) {
                    complete(null);
                    return -1L;
                }
                long j4 = this.bytesReceived + j3;
                long j5 = this.contentLength;
                if (j5 != -1 && j4 > j5) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j4);
                }
                this.bytesReceived = j4;
                if (j4 == j5) {
                    complete(null);
                }
                return j3;
            } catch (IOException e2) {
                throw complete(e2);
            }
        }
    }

    public Exchange(RealCall call, EventListener eventListener, ExchangeFinder finder, ExchangeCodec codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
        this.connection = codec.getConnection();
    }

    private final void trackFailure(IOException iOException) {
        this.hasFailure = true;
        this.finder.trackFailure(iOException);
        this.codec.getConnection().trackFailure$okhttp(this.call, iOException);
    }

    public final <E extends IOException> E bodyComplete(long j2, boolean z2, boolean z3, E e2) {
        if (e2 != null) {
            trackFailure(e2);
        }
        if (z3) {
            if (e2 != null) {
                this.eventListener.requestFailed(this.call, e2);
            } else {
                this.eventListener.requestBodyEnd(this.call, j2);
            }
        }
        if (z2) {
            if (e2 != null) {
                this.eventListener.responseFailed(this.call, e2);
            } else {
                this.eventListener.responseBodyEnd(this.call, j2);
            }
        }
        return (E) this.call.messageDone$okhttp(this, z3, z2, e2);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final Sink createRequestBody(Request request, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.isDuplex = z2;
        RequestBody requestBodyBody = request.body();
        Intrinsics.checkNotNull(requestBodyBody);
        long jContentLength = requestBodyBody.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, jContentLength), jContentLength);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e2) {
            this.eventListener.requestFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e2) {
            this.eventListener.requestFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final RealCall getCall$okhttp() {
        return this.call;
    }

    public final RealConnection getConnection$okhttp() {
        return this.connection;
    }

    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final ExchangeFinder getFinder$okhttp() {
        return this.finder;
    }

    public final boolean getHasFailure$okhttp() {
        return this.hasFailure;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !Intrinsics.areEqual(this.finder.getAddress$okhttp().url().host(), this.connection.route().address().url().host());
    }

    public final boolean isDuplex$okhttp() {
        return this.isDuplex;
    }

    public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
        this.call.timeoutEarlyExit();
        return this.codec.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    public final ResponseBody openResponseBody(Response response) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strHeader$default = Response.header$default(response, "Content-Type", null, 2, null);
            long jReportedContentLength = this.codec.reportedContentLength(response);
            return new RealResponseBody(strHeader$default, jReportedContentLength, Okio.buffer(new ResponseBodySource(this, this.codec.openResponseBodySource(response), jReportedContentLength)));
        } catch (IOException e2) {
            this.eventListener.responseFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final Response.Builder readResponseHeaders(boolean z2) throws IOException {
        try {
            Response.Builder responseHeaders = this.codec.readResponseHeaders(z2);
            if (responseHeaders != null) {
                responseHeaders.initExchange$okhttp(this);
            }
            return responseHeaders;
        } catch (IOException e2) {
            this.eventListener.responseFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }

    public final void responseHeadersEnd(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final Headers trailers() throws IOException {
        return this.codec.trailers();
    }

    public final void webSocketUpgradeFailed() {
        bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(Request request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e2) {
            this.eventListener.requestFailed(this.call, e2);
            trackFailure(e2);
            throw e2;
        }
    }
}
