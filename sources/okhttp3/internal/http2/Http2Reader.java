package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r+4\u0012}\u0007njO0L͜P.hS2şs{B$c$wDCU0}*\tUOog|Pb\u000bI\u0011\u000e\u0016\u0007\t4Ikxe\u0012\u0015<Xģ]T}ok8\u0019uW'Cr5H}\u0013\u00012*v\u0011\u0007~QM$\u0012^C¤>R\u001bQM  \u000fV /(#{\u0017JVwu:]&3mPZ?_^\u007f}\u0011Ta?\r%of7NFM\u0015S]3\u000b`hW\u0003m\u007f\u0006+v7?+w}\b:f\r,\u0015Y]=a\u00017t\u0005\u007fr<+9b{K~ X{\t\u0010%<2 L'\u0011T;/~\b<=%vaMh\u0002\rP0~oG/%.E[=)yiai+~;\n\u0019%\u001eQ\u00135!$\u0001\u001cv-!dya1\u007fXk_~\u000egN\u0006\u0004\u001ft2.\u0012I_\u007f]\u000eA2%8O[g5Qo\u0010\\\\g%\u0017'h\u001c\u0010`bX\"\u001d g.\u0017\u0019rD\u0013\u0013\u001cTbiD\u0011{.\u0005\u000b\f\u001b+ \u000b\nl%3$fO\u0017{1M&03J~7\bx\u001c\u0012eFv3c_\u0014\u0014oc\u000f\u0014mN\u0013\tfyZS:l\r,0F`j>\nBD\u0017\"!NWqJ>\\5'i-H1,rE\u000b\u001dwZ\u0017\"ET{J\u0011\u0006<t7\u000b\u0001`~|\u007fxw:-d0>YQc+VY0{L|Q\u0019/w\u000e[\u007fLu^3\u0016>{\n=.\u001ag[_A!\u001c\u0017)`\u0010]IZ\u0004}Q{$W~\u000b\r';\u0017@\u0018\fx\u0005D`\u0019\\\u0016T_H\u0005|\u000b#6n0}oS\u0013G\u0012b;_LZ\u000b\u0003\bN~<\u000b\u00187\u001eS\u0013 &\u000bIECU/\\w\\U#\u0001ui\u001e8*f\u001d3\re2:\u0014\u001a}si]`MhMg\u0012V\"R~3FV~\u0010\bp\u001bz\r{nO\u0005\tVfW;3\fs\u001f,;~\u0007_H$\b}b@\u0010.\u0002V\u0016\u0014\rUU\u0015[g\u007fm\u001c]#\u000b\u001b\u001b\u0018\r\u00141\u001d\u0015rܾ\"ݫ[b\u0011ݵV\u007f&;Y;\u0011\u000b\u0013ʂ&Ҭ0<\u0010Ձ\u0014`w\r(z.N6ʘ\u0019ЋFsCٙ^`\u0007\\nH3a\u001cǺ#Ǆ\u0005~\u0017ɼΑ|Y"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u00125U| DC", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "1kX2a;", "", "uK^8\\6\b0)\u007f{^9|\b\u001do\u00105y@V\fZ8", "1n]A\\5NO(\u0003\u0005g", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u00125U| D,s8VR?tD\u001a$lkBtm<[t'\u001d", "6oP0^\u0019>O\u0018~\b", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*z\n:|c\"Yy\u001f7zk", "1k^@X", "", "<dgA99:[\u0019", "@d`B\\9>A\u0019\u000e\nb5~\u0017", "6`]1_,K", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u00125U| D,x*VBBkAs", "@dP166G\\\u0019|\nb6\u0006s<e\u0001$y@", "@dP17(MO", ":d]4g/", "", "4kP4f", "Asa2T4\"R", "@dP1:6\u001ae\u0015\u0013", "@dP1;,:R\u0019\fWe6z\u000f", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", ">`S1\\5@", "@dP1;,:R\u0019\f\t", "@dP1C0GU", "@dP1C9B]&\u0003\nr", "@dP1C<LV\u0004\f\u0005f0\u000b\t", "@dP1E:MA(\fzZ4", "@dP1F,Mb\u001d\b|l", "@dP1J0GR#\u0011ji+x\u0018/", "\u0011n\\=T5B]\"", "\u0011n]A\\5NO(\u0003\u0005g\u001a\u0007\u0019<c\u007f", "\u0016`]1_,K", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final BufferedSource source;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\rnj?2JͣIDɟ\u0004*=j<9*[ҸuCIUb\u001a0\u000egN\u0016m\u001fNh\u0012[\u000f4\u001c)n:Qmx\f\u0018?6PxW3{u\u000eHnuN\u0005N4ŕ<\u007f\rЏ2,N\u0013\u0005~ŸO\u0016"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u00125U| D,s8UN7t8(\u001e>", "", "u(E", ":nV4X9", "\u001aiPCTuNb\u001d\u0006De6~\u000b3n\u0002qbJ\u0003\u0019\u0017TE", "5dc\u0019b.@S&", "u(;7T=:\u001d)\u000e~eu\u0004\u00131g\u00041}\ng!\u0019Io\u001b\u0012", ":d]4g/0W(\u0002\u0005n;g\u0005.d\u00041}", "", ":d]4g/", "4kP4f", ">`S1\\5@", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i2, int i3, int i4) throws IOException {
            if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                i2--;
            }
            if (i4 <= i2) {
                return i2 - i4;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i4 + " > remaining length " + i2);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007f\u0007lyA0ReP\u008cZS8\u0016sڔ<$q$yCAV\"}8\tWȞm˧\u0005Ϻ\u000b\u000bq\u000eF!\tn:Imx\f\u0013Ƥ6B}A{S}RQ`#LK4z8F\u0011\u001d\u0001HBx\u0014\u0005\u0014[K:,`D~Uj\r{\u001d`&ND.\u001d6\\\u0016d|H5cHL;\u0003\u0018`\u0015;0H\u000bP%F\u0003+cǿmӿ/L?ߎ-'Y\b\u0015X{A\tF\u007fEU\u000150CI\"[\rݠ\fЏ\u00197WՕut,f\u0013W\u0001\u000e-6]k\u001ch\u001c4\u0010z*\u0011\u0013ǐ\u001aΝ+T6Ʀ2h\u000e\u001bAz\u0013UF^\u0010f\u0013\u0018\tpN\u0017S\u0004\nچEӸj]iݢ1P=\f\u0013\u0013>%\u0007\u007f/c%\u001an\u00153T&R\b҈BףLN\u0012ԯ\u000e\u0006\u0012\u0003z\u0002X\b\u0007ϡ\f\u009e\u007f\u001d6Ϗ=9aL1'\f\u0004NXu~ݼd\b"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u00125U| D,s8VR?tD\u001a$lkBtm<[t'\u001d", "\u001anZ6bu,])\fx^\u0002", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "uK^8\\6\b0)\u007f{^9|\b\u001do\u00105y@VZ\b", "4kP4f", "", "5dc\u0013_(@a", "u(8", "Adc\u0013_(@a", "uH\u0018#", ":dUA", "5dc\u0019X-M", "Adc\u0019X-M", ":d]4g/", "5dc\u0019X5@b\u001c", "Adc\u0019X5@b\u001c", ">`S1\\5@", "5dc\u001dT+=W\"\u0001", "Adc\u001dT+=W\"\u0001", "Asa2T4\"R", "5dc g9>O!by", "Adc g9>O!by", "1k^@X", "", "@dP1", "", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "@dP166Gb\u001d\b\u000bZ;\u0001\u00138H\u007f$z@\u000e", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ContinuationSource implements Source {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final BufferedSource source;
        private int streamId;

        public ContinuationSource(BufferedSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        private final void readContinuationHeader() throws IOException {
            int i2 = this.streamId;
            int medium = Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            if (Http2Reader.Companion.getLogger().isLoggable(Level.FINE)) {
                Http2Reader.Companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int i3 = (-1) - (((-1) - this.source.readInt()) | ((-1) - Integer.MAX_VALUE));
            this.streamId = i3;
            if (iAnd != 9) {
                throw new IOException(iAnd + " != TYPE_CONTINUATION");
            }
            if (i3 != i2) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j2) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i2 = this.left;
                if (i2 != 0) {
                    long j3 = this.source.read(sink, Math.min(j2, i2));
                    if (j3 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j3;
                    return j3;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((-1) - (((-1) - this.flags) | ((-1) - 4)) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i2) {
            this.flags = i2;
        }

        public final void setLeft(int i2) {
            this.left = i2;
        }

        public final void setLength(int i2) {
            this.length = i2;
        }

        public final void setPadding(int i2) {
            this.padding = i2;
        }

        public final void setStreamId(int i2) {
            this.streamId = i2;
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.source.timeout();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u000eӵLш|\u0004O\u00068\u000b4B\u0007\":\u0018\u007fјnjG<L͜P.hS2\u000fq|<$i+yCAU\"}0\u0012WȞog\u0005Jb\u000bI\u0011\u000e\u0016\u000fj4I[ze\u0012\u001dPJoU3UoCEhtL\u0005(2(9\u007fi\u0017ɝZH>uCIY\f*0nq\u0001vU\u0004\u0013\u001c*\u0006l!1\"jjf6vp\u000e>=(\u001bipTWc>\u0004e\rt\\W\u0011\u0005j6+n=e\u00193]\u001b\u0007\u0001_o\u0007M|U\u0005\u00173mO\u0012\u001aeCp\u007fB\u0016[S\u001bk\u000b&\u000b\u0014\u0002d\u001a*CO\u0012O\u0001\u00126\b\u0013{;M4\u0012\u00149`.[\u001e-,VQ\u0003\u0006k@~\u0003\u000fF\u000e\u000fy6E)079N3f\u007fwk\u001d\\N\u0014\u0005;&i%7Mil&`C\u001c\u0005{_?i@kW~\u000eg@\u0006\u0004\u001ff2.\u0012I_\u007f]\u007fA8%?OaI%1k0dr\u0003=))\u0007a\u0007jHn#\u001f\u001aEH!\f\tS\u0015\tyolXZ\u0015} b'\u0016\bA$#\u001c\u0005G31fO\u0017j\u001bQk\r=/\u0015;\nry0o9\r7eUq3yR%\u0018o@p)pfpbR~%L0W`j>x,H\\\u000f+2muL8:W1\\CL3(Ph\u0015\u000fo\\x\u0010-pa?I\u000el\u000b\u0017)h\\\u001fp\u0018|W/\u0015`P1qUC.>UP~z!k\u001d\r\u001d\u0018G\u0016MwPz@\u000eU*/F\u001eGzG=A:EMz\u0018;qdr\u0014R}\u00165}\u0015y=?\u00192u5\u0003pZl1n\u05cbXE"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u00125U| D,x*VBBkAs", "", "/bZ X;MW\"\u0001\t", "", "/kc2e5:b\u0019lzk=\u0001\u0007/", "Asa2T4\"R", "", "=qX4\\5", "", ">q^Ab*HZ", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "6nbA", ">naA", ";`g\u000eZ,", "", "2`c.", "7m56a0LV\u0019}", "", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", ":d]4g/", "5n0DT@", ":`bA:6HR\u0007\u000e\b^(\u0005l.", "3qa<e\nHR\u0019", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`'|\u001bF\u0004\u0003?X}u", "2dQBZ\u000b:b\u0015", "6dP1X9L", "/rb<V0:b\u0019}hm9|\u00057I~", "6dP1X9\u001bZ#|\u0001", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", ">h]4", "/bZ", ">`h9b(=\u001f", ">`h9b(= ", ">qX<e0Mg", "Asa2T4\u001dS$~\u0004],\u0006\u0007C", "EdX4[;", "3wR9h:Bd\u0019", ">tb5C9H[\u001d\rz", ">q^:\\:>R\u0007\u000e\b^(\u0005l.", "@d`BX:M6\u0019zy^9\u000b", "@rc g9>O!", "AdcA\\5@a", "1kT.e\u0017KS*\u0003\u0005n:", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`5o\u001dKz.7gS", "Eh]1b>.^\u0018z\n^", "Eh]1b>,W.~^g*\n\t7e\t7", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Handler {
        void ackSettings();

        void alternateService(int i2, String str, ByteString byteString, String str2, int i3, long j2);

        void data(boolean z2, int i2, BufferedSource bufferedSource, int i3) throws IOException;

        void goAway(int i2, ErrorCode errorCode, ByteString byteString);

        void headers(boolean z2, int i2, int i3, List<Header> list);

        void ping(boolean z2, int i2, int i3);

        void priority(int i2, int i3, int i4, boolean z2);

        void pushPromise(int i2, int i3, List<Header> list) throws IOException;

        void rstStream(int i2, ErrorCode errorCode);

        void settings(boolean z2, Settings settings);

        void windowUpdate(int i2, long j2);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(BufferedSource source, boolean z2) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.client = z2;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z2 = (i3 + 1) - (1 | i3) != 0;
        if ((i3 + 32) - (32 | i3) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (8 & i3) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.data(z2, i4, this.source, Companion.lengthWithoutPadding(i2, i3, iAnd));
        this.source.skip(iAnd);
    }

    private final void readGoAway(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i2);
        }
        if (i4 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i5 = this.source.readInt();
        int i6 = this.source.readInt();
        int i7 = i2 - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i6);
        if (errorCodeFromHttp2 == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i6);
        }
        ByteString byteString = ByteString.EMPTY;
        if (i7 > 0) {
            byteString = this.source.readByteString(i7);
        }
        handler.goAway(i5, errorCodeFromHttp2, byteString);
    }

    private final List<Header> readHeaderBlock(int i2, int i3, int i4, int i5) throws IOException {
        this.continuation.setLeft(i2);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i3);
        this.continuation.setFlags(i4);
        this.continuation.setStreamId(i5);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = (1 & i3) != 0;
        int iAnd = (8 & i3) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        if ((i3 + 32) - (32 | i3) != 0) {
            readPriority(handler, i4);
            i2 -= 5;
        }
        handler.headers(z2, i4, -1, readHeaderBlock(Companion.lengthWithoutPadding(i2, i3, iAnd), iAnd, i3, i4));
    }

    private final void readPing(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i2);
        }
        if (i4 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((i3 + 1) - (i3 | 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readPriority(Handler handler, int i2) throws IOException {
        int i3 = this.source.readInt();
        handler.priority(i2, (-1) - (((-1) - i3) | ((-1) - Integer.MAX_VALUE)), Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i3) != 0);
    }

    private final void readPriority(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i2 + " != 5");
        }
        if (i4 == 0) {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        readPriority(handler, i4);
    }

    private final void readPushPromise(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (i3 + 8) - (8 | i3) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.pushPromise(i4, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i2 - 4, i3, iAnd), iAnd, i3, i4));
    }

    private final void readRstStream(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i2 + " != 4");
        }
        if (i4 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i5 = this.source.readInt();
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i5);
        if (errorCodeFromHttp2 == null) {
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + i5);
        }
        handler.rstStream(i4, errorCodeFromHttp2);
    }

    private final void readSettings(Handler handler, int i2, int i3, int i4) throws IOException {
        int i5;
        if (i4 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            if (i2 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (i2 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i2);
        }
        Settings settings = new Settings();
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, i2), 6);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int iAnd = Util.and(this.source.readShort(), 65535);
                i5 = this.source.readInt();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd != 4) {
                        if (iAnd == 5 && (i5 < 16384 || i5 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i5 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iAnd = 7;
                    }
                } else if (i5 != 0 && i5 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(iAnd, i5);
                if (first == last) {
                    break;
                } else {
                    first += step;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i5);
        }
        handler.settings(false, settings);
    }

    private final void readWindowUpdate(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i2);
        }
        long jAnd = Util.and(this.source.readInt(), 2147483647L);
        if (jAnd == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(i4, jAnd);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z2, Handler handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.source.require(9L);
            int medium = Util.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + medium);
            }
            int iAnd = Util.and(this.source.readByte(), 255);
            int iAnd2 = Util.and(this.source.readByte(), 255);
            int i2 = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, i2, medium, iAnd, iAnd2));
            }
            if (z2 && iAnd != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(iAnd));
            }
            switch (iAnd) {
                case 0:
                    readData(handler, medium, iAnd2, i2);
                    return true;
                case 1:
                    readHeaders(handler, medium, iAnd2, i2);
                    return true;
                case 2:
                    readPriority(handler, medium, iAnd2, i2);
                    return true;
                case 3:
                    readRstStream(handler, medium, iAnd2, i2);
                    return true;
                case 4:
                    readSettings(handler, medium, iAnd2, i2);
                    return true;
                case 5:
                    readPushPromise(handler, medium, iAnd2, i2);
                    return true;
                case 6:
                    readPing(handler, medium, iAnd2, i2);
                    return true;
                case 7:
                    readGoAway(handler, medium, iAnd2, i2);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, iAnd2, i2);
                    return true;
                default:
                    this.source.skip(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ByteString byteString = this.source.readByteString(Http2.CONNECTION_PREFACE.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + byteString.hex(), new Object[0]));
        }
        if (!Intrinsics.areEqual(Http2.CONNECTION_PREFACE, byteString)) {
            throw new IOException("Expected a connection header but was " + byteString.utf8());
        }
    }
}
