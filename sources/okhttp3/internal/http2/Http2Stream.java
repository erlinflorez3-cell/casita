package okhttp3.internal.http2;

import io.sentry.ProfilingTraceData;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
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
@Metadata(bv = {}, d1 = {"Яđ\u0014D57\u001eq\u007fR܀kŞ\fA\u00146\u0013ǞJ~8,\u001aՄ\u000ffxB8DkH6Ri*\u0017k\u00026,[:qK;[\u001d\u0006\"\u001fOVgmrRZ!C\u0017\u0006\u001c|r,W\\\u0001]\u0018\u0016:B\u0006?;Mu>A`\u000b6\r 8#@y\u001b\u0001\"*N\u0019~zQK\u0014\u00126Jx:h\rUĨ\"\u0012\u001c>(\u00014\\oޮ>H\u0003]B/)\tqB\\Eg0\u0013M\u0015FZ+#Ǹ\u007f{[@e4M'1af3\u001cn\tӊ\u0002A\u0013h?'YJ\u0004[DZ\u0018\u0014C._\u0011kv>\\3Vp\u001051gcyU\u001e.\u0006\u0002\u0014\u000fR\u0003<\u000eόL.;#/\u0014\u001cq\rr\u0002\u007f\u0001\u0006l\u0003\u0018z\u0010W_0\u000etC9I&\u0018ĥޅ\u001dN=>M\u0018,f\u0019nO\u001b\u001bו\u05ce\u0019\u001bZ<\u001aG_\u0006UH|I\nA{J\tb0746U\u0012G}'-E8\u007fsGj9k0Mtk\u0005\u0011xh\u0002v\u0003NN4\u0007\u0018M)7\u001f!D-\u0011y\u0019lXZP} b\u0013\u0016\bA-%\u0004Jj=\u0010|\u000f\u0019mx\u0018u\nS7/;g:\u0004\u000e\u0006\u0006'7C\u001f{\u0010\u0010!?\u0018Mfz\u0005\u00076\u000bg\u001a+t(Pqxn\u001e*\u0014D|]C6MD44Z2ap#\u001c\u001b\u001ep\u0001-\rma\u0001\u0010-\\c(\u0011o<t7\u0006\u0019h~D\u007fxwk-d09YQc&nY0>L|Q\u000fGw\u000e\u0012\u007fLuT5!\u0004,\u0014 DY\u007f֗ȠA\u0013\u0015VqT\u0010\u0006]L!%\u0002W \u0001\u0013\u0003\n\u0011Kh\\C6E!0nnbO\u0003\u001cRzlO;\b\u0013\u0005BeT7_c\u0003Z,MWt\u001bYjQ̞\u0001\u000b'Ǉ=\u0003u,\u000b@}_5).y*.Cn\u0014(FЄ\u0006ˏ\u00132|Ё\u001c.i$}qq_8KFZ*\u0019L4<n\u0019Av}N٥Nީ8\u0019;ǥYfvjFb+1\u0004|\u0015C]|dsR\u0013\u001e\u0003\u000bʠkͫwC\u0006ж/U3*eYwo}K\u000b\u0013x)`Ν}ϥr\u0012$ܻpeeb!04t͛:GCؠ\u001d>\u000f?BH\r\u0017\u0019`li4\u00151Dʮc\u0013/4H\u0011It^c\u0007{nH3e{%Ճ.\u0005\u0017\u00119=\u0007S\u0002'{hl/\u0012S1W+)3j} %c\u0002ף`ۆ\u001f4`۞#GcfW&V\u0006MN{\u0012@.F?\u0015\u001dp9K=_1wv^\u007fI\u0014;̶pʝ\u0016rZƉ:+\u0005#\u000b2\\\f\u00154'uC\u0006pWdR&b\u0014\u001a/ҿ\u001b͉\tѼ\u0001iNɑE\b;YKv;*5*oWi-X NٴZȍ#Ǜ[\u0014nŊu\u001d@F\u007fG3\u0018\u0017Eh$2a\u001bt!˖\u0005û8с\u00069\nՂv[q,/uwMz<ZK\u0017\u001a:gz\u0004\u0007U9$%o-Һz\u0094T)\u0011ްe0\u0019\u0010h^1U&\u0011\u001f&d74XN\b\u0011J@Sq\t\tk}|Ki\u0006ջ6Հ5<Zʴ\u0016!\u007f0\u0012Nt*\u001bvds\u000fz\u0017\u0019\u0005F\u00069/jV˯Kׄ+ِ\u0001\u0005P՝)\u0015:\u0004\u0001KҴ3\u0019"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0013Df}\u001c?C", "", "7c", "", "1n];X*MW#\b", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0003?b\u0007 5|\u001a8V\u0019", "=tc\u0013\\5Ba\u001c~y", "", "7m56a0LV\u0019}", "6dP1X9L", "\u001anZ5g;I!bazZ+|\u0016=;", "uH;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149pK\u00060\u00027\b)@m\u0014=QMDA)\u0013{rg<\u0016r7\u001c@\nGHM,i`H\u0001\u0005", "5dc\u0010b5GS\u0017\u000e~h5", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149pK\u00060\u00027\b)@m\u0014=QMDA", "3qa<e\nHR\u0019", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`'|\u001bF\u0004\u0003?X}u", "5dc\u0012e9H`v\ty^j\u0007\u000f2t\u000f3", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149mI\u0004/B7\b\u001f7C", "Adc\u0012e9H`v\ty^j\u0007\u000f2t\u000f3", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"c\u0011O\u001bI\u00012\u0013c| \r1\u0007", "3qa<e\fQQ\u0019\n\nb6\u0006", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "5dc\u0012e9H`x\u0012x^7\f\r9n>2\u0002C\u0010&\"", "u(;7T=:\u001d\u001d\tDB\u0016\\\u001c-e\u000b7\u007fJ\nl", "Adc\u0012e9H`x\u0012x^7\f\r9n>2\u0002C\u0010&\"", "uKY.i(\bW#H^H\f\u0010\u0007/p\u000f,\u0006IVZ\b", "6`b\u001fX:I]\"\rzA,x\b/r\u000e", "6dP1X9L?)~\u000b^", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CD\u007f4\f@V", "5dc\u0016W", "u(8", "7r;<V(EZ-b\u0004b;\u0001\u0005>e~", "u(I", "7r>=X5", "\nrTA \u0006\u0017", "", "@dP15@MS'Zxd5\u0007\u001b6e~*{?", "5dc\u001fX(=0-\u000ezl\bz\u000f8o\u0012/{?\u0003\u0017\u0016", "u(9", "Adc\u001fX(=0-\u000ezl\bz\u000f8o\u0012/{?\u0003\u0017\u0016\u0006y\u0014?\u00064@", "uI\u0018#", "@dP15@MS'm\u0005m(\u0004", "5dc\u001fX(=0-\u000ezl\u001b\u0007\u0018+l", "Adc\u001fX(=0-\u000ezl\u001b\u0007\u0018+l>2\u0002C\u0010&\"", "@dP1G0FS#\u000f\n", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0013Df}\u001c?,\u0004=ZC7s#\"\u001dhkI\u00169", "5dc\u001fX(=B\u001d\u0007zh<\fG9k\u00037\u000bK", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149pK\u00060\u0002G\r-7i\u001el;RHk0&\u0004li9\u0011s;$", "Ah]8", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0013Df}\u001c?,v;IK?t6\f\u0019qg\u000f", "5dc \\5D\u0012#\u0005}m;\b", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149pK\u00060\u0002G\r-7i\u001el.P7s8'\u0017VeB\r9", "And?V,", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0013Df}\u001c?,v;IK?t6\f\u001fxn7\u00079", "5dc b<KQ\u0019=\u0005d/\f\u0018:", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149pK\u00060\u0002G\r-7i\u001el.P7s8'\u0017VkI\u0014a,$", "EqXAX\tRb\u0019\rbZ?\u0001\u0011?m", "5dc$e0MSu\u0013\n^:d\u0005Bi\b8\u0004", "Adc$e0MSu\u0013\n^:d\u0005Bi\b8\u0004~\u000b\u001d\u001aV~\u0019", "EqXAX\tRb\u0019\rih;x\u0010", "5dc$e0MSu\u0013\n^:k\u0013>a\u0007", "Adc$e0MSu\u0013\n^:k\u0013>a\u0007f\u0006F\u0004&&R", "EqXAX\u001bB[\u0019\t\u000bm", "5dc$e0MS\b\u0003\u0003^6\r\u0018mo\u0006+\u000bO\f", "/cS\u000fl;>a\b\tlk0\f\t!i\t'\u0006R", "", "2d[AT", "1`]0X3,b&~vf\u0010}q/c\u007f6\n<\u000e+", "1`]0X3,b&~vf\u0010}q/c\u007f6\n<\u000e+UQu\u0011K\u00060", "1gT0^\u0016Nb\u0002\t\n<3\u0007\u0017/d", "1gT0^\u0016Nb\u0002\t\n<3\u0007\u0017/d>2\u0002C\u0010&\"", "1k^@X", "@rc g(Mc'\\\u0005],", "1k^@X\u0010Gb\u0019\f\u0004Z3", "1k^@X\u0013:b\u0019\f", "3m`BX<>B&z~e,\n\u0017", "BqP6_,Ka", "5dc \\5D", "\u001anZ6bu,W\"\u0005P", "5dc b<KQ\u0019", "\u001anZ6bu,])\fx^\u0002", "\u001anZ6bu-W!~\u0005n;R", "@dR2\\=>2\u0015\u000ev", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", ":d]4g/", "@dR2\\=>6\u0019zy^9\u000b", "@dR2\\=>@'\u000ehm9|\u00057", "B`Z2;,:R\u0019\f\t", "E`XA96K7#", "E`XA96K7#=\u0005d/\f\u0018:", "EqXAX\u000f>O\u0018~\bl", "@db=b5LS{~v],\n\u0017", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", "4kd@[\u000f>O\u0018~\bl", "\u0011n\\=T5B]\"", "\u0014qP:\\5@A\u001d\b\u0001", "\u0014qP:\\5@A#\u000f\b\\,", "!sa2T4-W!~\u0005n;", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Http2Stream {
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٦lԥ&\tWȞ˝kq"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0013Df}\u001c?,s8UN7t8(\u001e>", "", "u(E", "\u0013L8!R\t.4y^gX\u001a`}\u000f", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004O\u000f8\u000b4I\u0007\"B\u0012\u007fјnjO0LeN1ZS8\u000fs{:&c$\bCCU ~*\t]Uo˧tϻ\\!¼?\u0006Dw+9Y[~] \u000fJB\u001e@ݯQoK;)zD\u001782PK@\u0019I(8\\(v)V{\u0010 EXphSSMM  \u001cV /1#{\u0017<V\u0004u:];I}\u000bd5xH|{ vX5'\u000faL6p;C0=S1#\u0019o\u0010\u001bMtU\u0005\u0017(}ǩUָ[B`Ü,\u00171S\u001bb\u0013(b\u000b_g\\?9O{K~\u000f~Â\u0007ԫ\u0011H\f\u05fa\u001e)N6;\u001f\u0007\n\u0014<\u0003y$L^\fvB.\u00068ت\u0019Ӿ\u000433ݍk\u0001_mS\u001bd6*\u0012c̛/ъr-c٪&b\u001b)b\u0007q3WPKYݹ\u000ev"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0013Df}\u001c?,v;IK?t6\f\u0019qg\u000f", "\u001anZ6bu,W\"\u0005P", "4h]6f/>R", "", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"c\u0011R\u001dK\u0002q#h\u000b 3uk#\u00114", "1k^@X+", "5dc\u0010_6LS\u0018", "u(I", "Adc\u0010_6LS\u0018", "uY\u0018#", "5dc\u0013\\5Ba\u001c~y", "Adc\u0013\\5Ba\u001c~y", "Ad]15<?T\u0019\f", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "BqP6_,Ka", "\u001anZ5g;I!bazZ+|\u0016=;", "5dc!e(BZ\u0019\f\t", "u(;<^/Mb$LDA,x\b/r\u000e}", "Adc!e(BZ\u0019\f\t", "uK^8[;M^fH]^({\t<sUkl", "1k^@X", "", "3lXA99:[\u0019", "=tc\u0013\\5Ba\u001c~yH5c\u0005=t`5wH\u0001", "4kd@[", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "EqXAX", "And?V,", "0xc266N\\(", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class FramingSink implements Sink {
        private boolean closed;
        private boolean finished;
        private final Buffer sendBuffer;
        private Headers trailers;

        public FramingSink(boolean z2) {
            this.finished = z2;
            this.sendBuffer = new Buffer();
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z2);
        }

        private final void emitFrame(boolean z2) throws IOException {
            long jMin;
            boolean z3;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout$okhttp().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } finally {
                        http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                    }
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                jMin = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.size());
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + jMin);
                z3 = z2 && jMin == this.sendBuffer.size();
                Unit unit = Unit.INSTANCE;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z3, this.sendBuffer, jMin);
            } finally {
                http2Stream = Http2Stream.this;
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                boolean z2 = http2Stream2.getErrorCode$okhttp() == null;
                Unit unit = Unit.INSTANCE;
                if (!Http2Stream.this.getSink$okhttp().finished) {
                    boolean z3 = this.sendBuffer.size() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        Intrinsics.checkNotNull(headers);
                        connection.writeHeaders$okhttp(id, z2, Util.toHeaderList(headers));
                    } else if (z3) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(true);
                        }
                    } else if (z2) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                    Unit unit2 = Unit.INSTANCE;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
                Unit unit = Unit.INSTANCE;
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z2) {
            this.closed = z2;
        }

        public final void setFinished(boolean z2) {
            this.finished = z2;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // okio.Sink
        public void write(Buffer source, long j2) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            this.sendBuffer.write(source, j2);
            while (this.sendBuffer.size() >= Http2Stream.EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004O\r8é6B\r+4\u0012}\u000enjO0LeN1ZS@\u000fs{:'c$\u007fCCU \u0001*\teNogtJb\u000bY\u000f\u000e\u0016~j2նW\u000fزB\u000f`A0T9ݹ\u007fAG`\r63!B&F{\u001d\u0001H-Н\u0014v\tG\u0014\u0012 HXphkSaM0  V /\u001f\rk\\Q`l\fG_'\u0011\u0006ZNU`v\u0011\u0016(Tq?\r%zN/NUM\u0015Sr3\u000b`wW\u0003mr\u0004ݛص+'1i<]Dy\u0018\u0014CM\u0016!&\u00014\u007f\u001dQ\u000f%W/]}cP<)>zL%J\t&\u0006UK\u0005Ƨ&Ǵ\f\u001a;ο\u000bUFV\u0010eb\u0002\u0001iD u\u0018A-Q\u001b\u0015T8ݣ%\u05ee;\b\rټ6%\u0007x/bt\u0010f )]H]?QX=vO`Բ?ъ\bpj̣z\u0013>S\u0018/*\u001eѧ\u001b+?كQ%'y\u0010W\u0015v\u0005\u0015xh\u0002vʐLF*Â.90\u001a\u001ai\u0015~\u0013}hVn+?`rΈ\u0013ą\f\u001f(ο\u0010>'9\u001ecojo\u0001[tܬ)S"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0013Df}\u001c?,v;IK?t6\f\u001fxn7\u00079", "\u001anZ6bu,])\fx^\u0002", ";`g\u000fl;>1#\u000f\u0004m", "", "4h]6f/>R", "", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"c\u0011R\u001dK\u0002q#h\u000b 3uk\u0013B\u0007,", "1k^@X+", "5dc\u0010_6LS\u0018=\u0005d/\f\u0018:", "u(I", "Adc\u0010_6LS\u0018=\u0005d/\f\u0018:", "uY\u0018#", "5dc\u0013\\5Ba\u001c~y\u001d6\u0003\f>t\u000b", "Adc\u0013\\5Ba\u001c~y\u001d6\u0003\f>t\u000b", "@dP15<?T\u0019\f", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "5dc\u001fX(=0)\u007f{^9", "u(;<^0H\u001du\u000f{_,\n^", "@dR2\\=>0)\u007f{^9", "5dc\u001fX*>W*~Wn-}\t<", "BqP6_,Ka", "\u001anZ5g;I!bazZ+|\u0016=;", "5dc!e(BZ\u0019\f\t", "u(;<^/Mb$LDA,x\b/r\u000e}", "Adc!e(BZ\u0019\f\t", "uK^8[;M^fH]^({\t<sUkl", "1k^@X", "", "@dP1", "Ah]8", "0xc266N\\(", "@dR2\\=>", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "@dR2\\=>\u0012#\u0005}m;\b", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "CoS.g,\u001c]\"\bz\\;\u0001\u00138F\u00072\u000e\u001e\u000b &Ty\u0015", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class FramingSource implements Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final Buffer receiveBuffer = new Buffer();
        private final Buffer readBuffer = new Buffer();

        public FramingSource(long j2, boolean z2) {
            this.maxByteCount = j2;
            this.finished = z2;
        }

        private final void updateConnectionFlowControl(long j2) {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j2);
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.clear();
                Intrinsics.checkNotNull(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                http2Stream.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final Buffer getReadBuffer() {
            return this.readBuffer;
        }

        public final Buffer getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j2) throws IOException {
            StreamResetException errorException$okhttp;
            boolean z2;
            long j3;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j4 = 0;
            if (j2 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.getReadTimeout$okhttp().enter();
                    try {
                        if (http2Stream.getErrorCode$okhttp() == null || this.finished) {
                            errorException$okhttp = null;
                        } else {
                            errorException$okhttp = http2Stream.getErrorException$okhttp();
                            if (errorException$okhttp == null) {
                                ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                Intrinsics.checkNotNull(errorCode$okhttp);
                                errorException$okhttp = new StreamResetException(errorCode$okhttp);
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        z2 = false;
                        if (this.readBuffer.size() > j4) {
                            Buffer buffer = this.readBuffer;
                            j3 = buffer.read(sink, Math.min(j2, buffer.size()));
                            http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j3);
                            long readBytesTotal = http2Stream.getReadBytesTotal() - http2Stream.getReadBytesAcknowledged();
                            if (errorException$okhttp == null && readBytesTotal >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), readBytesTotal);
                                http2Stream.setReadBytesAcknowledged$okhttp(http2Stream.getReadBytesTotal());
                            }
                        } else {
                            if (!this.finished && errorException$okhttp == null) {
                                http2Stream.waitForIo$okhttp();
                                z2 = true;
                            }
                            j3 = -1;
                        }
                        http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
                if (!z2) {
                    if (j3 != -1) {
                        return j3;
                    }
                    if (errorException$okhttp == null) {
                        return -1L;
                    }
                    throw errorException$okhttp;
                }
                j4 = 0;
            }
        }

        public final void receive$okhttp(BufferedSource source, long j2) throws IOException {
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            long j3 = j2;
            while (j3 > 0) {
                synchronized (Http2Stream.this) {
                    z2 = this.finished;
                    z3 = this.readBuffer.size() + j3 > this.maxByteCount;
                    Unit unit = Unit.INSTANCE;
                }
                if (z3) {
                    source.skip(j3);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z2) {
                    source.skip(j3);
                    return;
                }
                long j4 = source.read(this.receiveBuffer, j3);
                if (j4 == -1) {
                    throw new EOFException();
                }
                j3 -= j4;
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    if (this.closed) {
                        this.receiveBuffer.clear();
                    } else {
                        boolean z4 = this.readBuffer.size() == 0;
                        this.readBuffer.writeAll(this.receiveBuffer);
                        if (z4) {
                            Intrinsics.checkNotNull(http2Stream2, "null cannot be cast to non-null type java.lang.Object");
                            http2Stream2.notifyAll();
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            updateConnectionFlowControl(j2);
        }

        public final void setClosed$okhttp(boolean z2) {
            this.closed = z2;
        }

        public final void setFinished$okhttp(boolean z2) {
            this.finished = z2;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // okio.Source
        public Timeout timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lk?ӅF{߉^R\u0002)Onڷ8$i$:GIV2}P\u000b\u0018^uj\u0007J\t\u000fs\u0015\u0014\u001b\u0011lBH\u0004|$$W8PuW3{q\u0004KƄx="}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0013Df}\u001c?,\u0004=ZC7s#\"\u001dhkI\u00169", "\u001anZ6bu\u001aa-\bxM0\u0005\t9u\u000f}", "uK^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"c\u0011R\u001dK\u0002q#h\u000b 3ukq>", "3wXA45=B\u001c\f\u0005p\u0010}w3m\u007f'eP\u0010", "", "<df!\\4>])\u000eZq*|\u0014>i\n1", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "1`d@X", "Bh\\2W\u0016Nb", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        protected IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        protected void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i2, Http2Connection connection, boolean z2, boolean z3, Headers headers) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.id = i2;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(connection.getOkHttpSettings().getInitialWindowSize(), z3);
        this.sink = new FramingSink(z2);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers == null) {
            if (!isLocallyInitiated()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (isLocallyInitiated()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(headers);
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.source.getFinished$okhttp() && this.sink.getFinished()) {
                return false;
            }
            Unit unit = Unit.INSTANCE;
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j2) {
        this.writeBytesMaximum += j2;
        if (j2 > 0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z2;
        boolean zIsOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z2 = !this.source.getFinished$okhttp() && this.source.getClosed$okhttp() && (this.sink.getFinished() || this.sink.getClosed());
            zIsOpen = isOpen();
            Unit unit = Unit.INSTANCE;
        }
        if (z2) {
            close(ErrorCode.CANCEL, null);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws Throwable {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            Throwable streamResetException = this.errorException;
            if (streamResetException == null) {
                ErrorCode errorCode = this.errorCode;
                Intrinsics.checkNotNull(errorCode);
                streamResetException = new StreamResetException(errorCode);
            }
            throw streamResetException;
        }
    }

    public final void close(ErrorCode rstStatusCode, IOException iOException) throws IOException {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (closeInternal(rstStatusCode, iOException)) {
            this.connection.writeSynReset$okhttp(this.id, rstStatusCode);
        }
    }

    public final void closeLater(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (closeInternal(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.id, errorCode);
        }
    }

    public final void enqueueTrailers(Headers trailers) {
        Intrinsics.checkNotNullParameter(trailers, "trailers");
        synchronized (this) {
            if (this.sink.getFinished()) {
                throw new IllegalStateException("already finished".toString());
            }
            if (trailers.size() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0".toString());
            }
            this.sink.setTrailers(trailers);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    public final Sink getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        return this.sink;
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final Source getSource() {
        return this.source;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        int i2 = this.id;
        return this.connection.getClient$okhttp() == ((i2 + 1) - (i2 | 1) == 1);
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) && (this.sink.getFinished() || this.sink.getClosed())) {
            if (this.hasResponseHeaders) {
                return false;
            }
        }
        return true;
    }

    public final Timeout readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(BufferedSource source, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        this.source.receive$okhttp(source, i2);
    }

    public final void receiveHeaders(Headers headers, boolean z2) {
        boolean zIsOpen;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.hasResponseHeaders && z2) {
                this.source.setTrailers(headers);
            } else {
                this.hasResponseHeaders = true;
                this.headersQueue.add(headers);
            }
            if (z2) {
                this.source.setFinished$okhttp(true);
            }
            zIsOpen = isOpen();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        if (zIsOpen) {
            return;
        }
        this.connection.removeStream$okhttp(this.id);
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j2) {
        this.readBytesAcknowledged = j2;
    }

    public final void setReadBytesTotal$okhttp(long j2) {
        this.readBytesTotal = j2;
    }

    public final void setWriteBytesMaximum$okhttp(long j2) {
        this.writeBytesMaximum = j2;
    }

    public final void setWriteBytesTotal$okhttp(long j2) {
        this.writeBytesTotal = j2;
    }

    public final synchronized Headers takeHeaders() throws IOException {
        Headers headersRemoveFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (this.headersQueue.isEmpty()) {
            Throwable streamResetException = this.errorException;
            if (streamResetException == null) {
                ErrorCode errorCode = this.errorCode;
                Intrinsics.checkNotNull(errorCode);
                streamResetException = new StreamResetException(errorCode);
            }
            throw streamResetException;
        }
        headersRemoveFirst = this.headersQueue.removeFirst();
        Intrinsics.checkNotNullExpressionValue(headersRemoveFirst, "headersQueue.removeFirst()");
        return headersRemoveFirst;
    }

    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (!this.source.getFinished$okhttp() || !this.source.getReceiveBuffer().exhausted() || !this.source.getReadBuffer().exhausted()) {
            if (this.errorCode == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            Throwable streamResetException = this.errorException;
            if (streamResetException == null) {
                ErrorCode errorCode = this.errorCode;
                Intrinsics.checkNotNull(errorCode);
                streamResetException = new StreamResetException(errorCode);
            }
            throw streamResetException;
        }
        trailers = this.source.getTrailers();
        if (trailers == null) {
            trailers = Util.EMPTY_HEADERS;
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> responseHeaders, boolean z2, boolean z3) throws IOException {
        boolean z4;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z2) {
                this.sink.setFinished(true);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (!z3) {
            synchronized (this.connection) {
                z4 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
                Unit unit2 = Unit.INSTANCE;
            }
            z3 = z4;
        }
        this.connection.writeHeaders$okhttp(this.id, z2, responseHeaders);
        if (z3) {
            this.connection.flush();
        }
    }

    public final Timeout writeTimeout() {
        return this.writeTimeout;
    }
}
