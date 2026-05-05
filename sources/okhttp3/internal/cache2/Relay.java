package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tqAӄLe^.ZS0\u0010s{J$c$wFCU(\u0007*\tUVog|Pb\u000bI\u001b\u000e\u0016\u000fj4I[{e\u0012\u001d2JoE:cڎ[q\u0011td\u0004X2Zq:6\u0007\u001a:N\u001ev\u0013Ea\u000b@1PvHT%O\u001b\u0019@\tN$\u000f\"tg|;Xpk@G#1pRR5gH|{\u0012ТX'\u001b\u007f**9pO5CV\u0004\u0007\u0015\u0005s?1D:A\u0013n?'YP<]D\f\u0018\u0016+*}\u0010&\u00114\u0011\u001dQ\u000f=W/]\u0019cP</(~\n?T\u0004<\u000bWL<c2f6\u0013yt;aN\b\u001a^p1+eDI=\u007fa0\u007f\u001b7`oE1Ne\u0007˿\u0011$+Ч\u0007#a`\u001cme*b\u007fi1\u007fEףLT\u0012ԯUo\n~p\u0011z\u001c>W\u0018/*\"\u0005ϖ1ھ_E+ܩ\u0004\u0004NVu\n%bngwg\u0019Z0n.9@\b:[\u001bߦ\u0011\u07fbT``\u008c)O\"j\u0015\u0015(\u0015&t\u0006Uq4\u001ehgh\u0018{\u0004\"ܦ)3~9_\ty!(El9MQ\u0012\u00178ׯx݀C<jڳ)~Pn$Z\u000bDxüTн\u0014\u0004\u0004ͩf\u000e\u0019OM\u0010<62P'|eb\u0011 ZC\u0013\b\u000e]?ɴ\u000bՁ70\u000bǭ<v\u000f\"^~\u0011qm\u001cWPMo0RYQc$łY(pؔ\u0015%\r%\u0002\r\u0018\u007fZKdlDz,ݯ,ک\u001eEYǽU\u0015\u0015&7A\"/Kt\u0001\u000f\"g Q\u0013~\u0010\u000ei\u0014\u0005ԝ\u0014ϡt8hʄbQZC0$~t)6r/\u0601e\u0001"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017c\u0011\\\u000eCr9\u000b", "", "4h[2", "\u001aiPCTuB]bkvg+\u0007\u0011\u000bc}(\nNa\u001b\u001eGE", "CobAe,:[", "\u001anZ6bu,])\fx^\u0002", "CobAe,:[\u0004\t\t", "", ";dc.W(MO", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "0tU3X9&O,l~s,", "uKY.i(\bW#HgZ5{\u00137A}&{N\u000fw\u001bNoc#\u0001+9cG\u000eA}#,M\u0019 R>$\u0019r+\u0016\u001br,<\u00064KUP\u0002A\u0016c", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "5dc\u000fh-?S&", "u(;<^0H\u001du\u000f{_,\n^", "5dc\u000fh-?S&fvq\u001a\u0001\u001e/", "u(9", "1n\\=_,MS", "", "5dc\u0010b4IZ\u0019\u000ez", "u(I", "Adc\u0010b4IZ\u0019\u000ez", "uY\u0018#", "5dc\u0013\\3>", "u(;7T=:\u001d\u001d\tDK(\u0006\b9m[&y@\u000f%wKv\u000e\u0012", "Adc\u0013\\3>", "uKY.i(\bW#HgZ5{\u00137A}&{N\u000fw\u001bNoc\u007fg", "7r29b:>R", "And?V,\u001c])\b\n", "", "5dc b<KQ\u0019\\\u0005n5\f", "u(8", "Adc b<KQ\u0019\\\u0005n5\f", "uH\u0018#", "5dc\"c:M`\u0019z\u0003", "u(;<^0H\u001d\u0007\t\u000bk*|^", "Adc\"c:M`\u0019z\u0003", "uK^8\\6\bA#\u000f\b\\,RL ", "CobAe,:[u\u000f{_,\n", "5dc\"c:M`\u0019z\u0003;<}\n/r", "5dc\"c:M`\u0019z\u0003I6\u000b", "Adc\"c:M`\u0019z\u0003I6\u000b", "uI\u0018#", "CobAe,:[\u0006~v],\n", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "5dc\"c:M`\u0019z\u0003K,x\b/r", "u(;7T=:\u001d z\u0004`uk\f<e{'Q", "Adc\"c:M`\u0019z\u0003K,x\b/r", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u0016/a~}?1", "1n\\:\\;", "", "CobAe,:[\u0007\u0003\u0010^", "<df b<KQ\u0019", "EqXAX\u000f>O\u0018~\b", ">qT3\\?", ";dc.W(MO\u0007\u0003\u0010^", "EqXAX\u0014>b\u0015}vm(", "\u0011n\\=T5B]\"", " d[.l\u001aHc&|z", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final Buffer buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final ByteString metadata;
    private int sourceCount;
    private Source upstream;
    private final Buffer upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;
    public static final Companion Companion = new Companion(null);
    public static final ByteString PREFIX_CLEAN = ByteString.Companion.encodeUtf8("OkHttp cache v1\n");
    public static final ByteString PREFIX_DIRTY = ByteString.Companion.encodeUtf8("OkHttp DIRTY :(\n");

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\"B\u0012\u007f\u0007ljA0RkP.XS2\u000f\u0002{<řc$\bCC٥\"}8\tWNmitЁ[!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b\u0014M<eokC\u0011xD\u001082PD*\t\u000f'BH>\u0005+GY\u001b*0ntjV\u001b]\u001d\u001a@\b\u0007,\u000f/tg|@xpkEG#1u\u0013Z5`H|{\u000f\u001dÙy˼za&Ѩ\u0011EC\u0018=S1\u000b\t_\u0016ũAџA\u0005pѧw9Wxo6\u0007\u0004J\u0019\u0002̅\u000fǁv&dӤ\"l\u001a-CO\u0012R'ʮzÞ~{\u0015ɝT\u001a\u0014/`.[!=ڟ`\u07baxr[óй\u0006p"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017c\u0011\\\u000eCr9s7\b(Bi\u001f2WL\u0011", "", "u(E", "\u0014H;\u0012R\u000f\u001e/w^gX\u001a`}\u000f", "", "\u001eQ4\u0013<\u001f81\u007f^VG", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\u001eQ4\u0013<\u001f82|kiR", "!ND\u001f6\f84|eZ", "", "!ND\u001f6\f8C\u0004liK\fXp", "3cXA", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017c\u0011\\\u000eCr9\u000b", "4h[2", "\u001aiPCTuB]b_~e,R", "CobAe,:[", "\u001anZ6bu,])\fx^\u0002", ";dc.W(MO", "0tU3X9&O,l~s,", "@dP1", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Relay edit(File file, Source upstream, ByteString metadata, long j2) throws IOException {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(upstream, "upstream");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, j2, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            Intrinsics.checkNotNullParameter(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            Buffer buffer = new Buffer();
            fileOperator.read(0L, buffer, Relay.FILE_HEADER_SIZE);
            if (!Intrinsics.areEqual(buffer.readByteString(Relay.PREFIX_CLEAN.size()), Relay.PREFIX_CLEAN)) {
                throw new IOException("unreadable cache file");
            }
            long j2 = buffer.readLong();
            long j3 = buffer.readLong();
            Buffer buffer2 = new Buffer();
            fileOperator.read(j2 + Relay.FILE_HEADER_SIZE, buffer2, j3);
            return new Relay(randomAccessFile, null, j2, buffer2.readByteString(), 0L, null);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0019\u007fјnjO0L͜P.`S2\u000fq{<$q$yCAU ԃ$\u001fѧ~g\u0016m\u000b]ŲG\u000f\u0014\u0016Ap:Pmx\f\u001aUF\u000b\u0006M<eok=\u0011xD\u000f82PC*\t\u000f&BH>zAW\u0014\u0012 5XphXSaU( \u0007V\"\u0017\u001d\u000bi%ȧTǰa:7݊SuPQ?_^\u0001$θRù+\r~ѭn7N<M\u0015SYYޚTÜC\u0003Gмݞ\tu"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017c\u0011\\\u000eCr9sF}'3\u0002\u00048]P9k\n", "\u001anZ6bu,])\fx^\u0002", "uK^8[;M^fH~g;|\u00168a\u0007qy<~\u001a\u0017\u00149z<}!I/A\u0011", "4h[2B7>`\u0015\u000e\u0005k", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017c\u0011P\u0012Cv\u000f@Y\u000b\u001cFw#\u0004", "And?V,)]'", "", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "1k^@X", "", "@dP1", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class RelaySource implements Source {
        private FileOperator fileOperator;
        private long sourcePos;
        private final Timeout timeout = new Timeout();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            Intrinsics.checkNotNull(file);
            FileChannel channel = file.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (relay.getSourceCount() == 0) {
                    RandomAccessFile file = relay.getFile();
                    relay.setFile(null);
                    randomAccessFile = file;
                }
                Unit unit = Unit.INSTANCE;
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        @Override // okio.Source
        public long read(Buffer sink, long j2) throws IOException {
            char c2;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.fileOperator == null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Relay relay = Relay.this;
            synchronized (relay) {
                while (true) {
                    if (this.sourcePos != relay.getUpstreamPos()) {
                        long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().size();
                        if (this.sourcePos >= upstreamPos) {
                            long jMin = Math.min(j2, relay.getUpstreamPos() - this.sourcePos);
                            relay.getBuffer().copyTo(sink, this.sourcePos - upstreamPos, jMin);
                            this.sourcePos += jMin;
                            return jMin;
                        }
                        c2 = 2;
                    } else if (!relay.getComplete()) {
                        if (relay.getUpstreamReader() == null) {
                            relay.setUpstreamReader(Thread.currentThread());
                            c2 = 1;
                            break;
                        }
                        this.timeout.waitUntilNotified(relay);
                    } else {
                        return -1L;
                    }
                }
                if (c2 == 2) {
                    long jMin2 = Math.min(j2, Relay.this.getUpstreamPos() - this.sourcePos);
                    FileOperator fileOperator = this.fileOperator;
                    Intrinsics.checkNotNull(fileOperator);
                    fileOperator.read(this.sourcePos + Relay.FILE_HEADER_SIZE, sink, jMin2);
                    this.sourcePos += jMin2;
                    return jMin2;
                }
                try {
                    Source upstream = Relay.this.getUpstream();
                    Intrinsics.checkNotNull(upstream);
                    long j3 = upstream.read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                    if (j3 == -1) {
                        Relay relay2 = Relay.this;
                        relay2.commit(relay2.getUpstreamPos());
                        Relay relay3 = Relay.this;
                        synchronized (relay3) {
                            relay3.setUpstreamReader(null);
                            Intrinsics.checkNotNull(relay3, "null cannot be cast to non-null type java.lang.Object");
                            relay3.notifyAll();
                            Unit unit = Unit.INSTANCE;
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j3, j2);
                    Relay.this.getUpstreamBuffer().copyTo(sink, 0L, jMin3);
                    this.sourcePos += jMin3;
                    FileOperator fileOperator2 = this.fileOperator;
                    Intrinsics.checkNotNull(fileOperator2);
                    fileOperator2.write(Relay.this.getUpstreamPos() + Relay.FILE_HEADER_SIZE, Relay.this.getUpstreamBuffer().clone(), j3);
                    Relay relay4 = Relay.this;
                    synchronized (relay4) {
                        relay4.getBuffer().write(relay4.getUpstreamBuffer(), j3);
                        if (relay4.getBuffer().size() > relay4.getBufferMaxSize()) {
                            relay4.getBuffer().skip(relay4.getBuffer().size() - relay4.getBufferMaxSize());
                        }
                        relay4.setUpstreamPos(relay4.getUpstreamPos() + j3);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    Relay relay5 = Relay.this;
                    synchronized (relay5) {
                        relay5.setUpstreamReader(null);
                        Intrinsics.checkNotNull(relay5, "null cannot be cast to non-null type java.lang.Object");
                        relay5.notifyAll();
                        Unit unit3 = Unit.INSTANCE;
                    }
                    return jMin3;
                } catch (Throwable th) {
                    Relay relay6 = Relay.this;
                    synchronized (relay6) {
                        relay6.setUpstreamReader(null);
                        Intrinsics.checkNotNull(relay6, "null cannot be cast to non-null type java.lang.Object");
                        relay6.notifyAll();
                        Unit unit4 = Unit.INSTANCE;
                        throw th;
                    }
                }
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    private Relay(RandomAccessFile randomAccessFile, Source source, long j2, ByteString byteString, long j3) {
        this.file = randomAccessFile;
        this.upstream = source;
        this.upstreamPos = j2;
        this.metadata = byteString;
        this.bufferMaxSize = j3;
        this.upstreamBuffer = new Buffer();
        this.complete = this.upstream == null;
        this.buffer = new Buffer();
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, Source source, long j2, ByteString byteString, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, source, j2, byteString, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(ByteString byteString, long j2, long j3) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(byteString);
        buffer.writeLong(j2);
        buffer.writeLong(j3);
        if (buffer.size() != FILE_HEADER_SIZE) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new FileOperator(channel).write(0L, buffer, FILE_HEADER_SIZE);
    }

    private final void writeMetadata(long j2) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new FileOperator(channel).write(FILE_HEADER_SIZE + j2, buffer, this.metadata.size());
    }

    public final void commit(long j2) throws IOException {
        writeMetadata(j2);
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j2, this.metadata.size());
        RandomAccessFile randomAccessFile2 = this.file;
        Intrinsics.checkNotNull(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            Unit unit = Unit.INSTANCE;
        }
        Source source = this.upstream;
        if (source != null) {
            Util.closeQuietly(source);
        }
        this.upstream = null;
    }

    public final Buffer getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final Source getUpstream() {
        return this.upstream;
    }

    public final Buffer getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final ByteString metadata() {
        return this.metadata;
    }

    public final Source newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z2) {
        this.complete = z2;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i2) {
        this.sourceCount = i2;
    }

    public final void setUpstream(Source source) {
        this.upstream = source;
    }

    public final void setUpstreamPos(long j2) {
        this.upstreamPos = j2;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }
}
