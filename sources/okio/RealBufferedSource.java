package okio;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.dynatrace.android.agent.AdkSettings;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Typography;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Яė\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*,(w\u000ffp=8DsQ6ɟ[*\u001dk\u00044*[,qQB]ڼ\u0006\"\u0017RVgmoRZ!C\u0017\u0006\u001cyr,_U\u0001]\u0018\u0012:B}E;Mu>A`\u000b6\r @2@ц\r\u00010*P\u0010|\u0004KK\u001a\u001a8@v:Z\r[\u0011\"Ň\u000e>6\u0001&\\mU>H\u0003]Bǂ+\u0003wĩV'u0\u0005M\u0013G\\'#vi\u001e1@=ߎ+Ǭ\u0004\u00035Q\u001cJ\u0013C\u007f=\u001dhU(ȅMse8!\u0006\"\u0018CO;a9:%\u000b_l$'Y\\*_\u0019\u00146\u0006\u0013{;GJ\"N5V=E\u001a\u0015\u0018>7\u0003\u0004k@~\u0014%VH\u0011oE/%.C[=)wiai+~;\n\u0018%\u001eQ\u001155$r\u001co-\u001b\u0003\b\u00025_QUH|\u001c\nA{\u0017\tb0:44U\u0014G{?>]9\u007fiG29k0Xtk\u0005\u001axh\u0002\u007f\u0019\\\t8|%O*7\u001c\u000bHr\u001a\u0004P\u0003n\\\u0015[/l\u0007,\u0018Y4%\u0006J8=\u0010|_\u0019mxeu\nSE-K\"\u0005y%o9\rCeUq(yR%*o@p\u0018pfpcRn%.0K`j>\u0012BX\u0017\u0012!MWqJ?rEab#d\u001b\u001ep@C\u001d(pv-\u0017Ta/3m2\u0013!\u0001~l!su\u000ea,+vhA\nwC6>UPsd\u00011%\u0017s.W\u0018PUa\u0005\u0016$k,$$9QQ]]C\u0013\rJJ\u0002[e\u0013\u0007._[4?z+\u001a??vQ\u007f\b\u0019\u0015rt3X]v/\"%~#'\u0016\b\u0018y\u0010kA[,r\u0019}VI!#\n@\\[\u0015\u0005MCU\u0005}@\u00155[cW!$\u0019,/C\u0002$}8D\b\u0005'&#u40q9\bb\u007fab?Fjq~l2j\u0001KPV\u0011\u0010\bp\u0019d\u0011AkYd\u001f}~aS5\f\u000f\u001f,;\u0003\u001do\u0003\u0019}'L.\u000eO:WF\"ll=\u0011{x\u0018q{lt\u000bx\u001fP\u001fD7|<4=Nl\u001evQ>\u0014\u001e06oQ\u0013\tJ*<4ZLN\u001f\fZw1(z.V&#_@P SV<a)`dk\u001d`s\u0006g>I\u0015\u001d_6xc>5qTwGc`\u0005\u0004!\u0017<\u0003O-vk?\rZGH@X/\u001b\fq\fO\u0010d\u001cGW\u000e2\u0004T>&,5BF;\u007feYe\u0005`v\u000b\u0004t\u0015x?\u0018t\u0004f\"W\u000fA\u0011VB\u0018A#\u0019}&6vuR\\,OCH4]Xq\u0015\u001a2{FIc69;tajB_Bk\u001cQ\f=8 U:%%jx&f8mK>$).b0AYdh\n<\u0004\rr8dNJ\u0018\u0010A;+^\b\"(%NHCl4R\u0012|A\u0010q'{n\u0004+Izy^\b*ER3\bU\u0004t'!`HMk \u0007GF(]4-r bWF\u007fgv.\u0004O\n\u001dqC48ooHRL\tO}\u0004%BTV%\u0002j\u0016LrHtlpd>bxI|t:9Z\u0011GVlQ+4t\u0013Nh=x1\u001f\nO\u000etO)S\n>#GQ\u0006^W8\u0011 6:9\u0003h'%\n8\u0004!x\u0010i<-\r\u0018k_mmޡqd\u0011l\u0014SF\n ,?\u001bA3hY8>\u000b*bO\u001a9Oa)\u0001C\u0002L\u0004O\u001fC5iSS`G\u0011Q&M|Ikhwmß#\u0006ހq\u0088[pK';jZ-$\u0004kQ\rU4d\u001djDIcIT},ʶ\u0002ˌ#$,ԖF3\u000eOIHXj\u0013D\u0015w.ư2ń:nLì\u0018z\u0007s\",\u0018\u0019*h2ȭ6ф~\u0014!ܒĔ.x"}, d2 = {"\u001anZ6bu+S\u0015\u0006Wn-}\t<e~\u0016\u0006P\u000e\u0015\u0017\u001d", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "And?V,", "\u001anZ6bu,])\fx^\u0002", "uK^8\\6\bA#\u000f\b\\,RL ", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "5dc\u000fh-?S&=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u000fh-?S&", "u(;<^0H\u001du\u000f{_,\n^", "0tU3X9\u001fW\u0019\u0006y", "1k^@X+", "", "1k^@X", "", "3wW.h:MS\u0018", "7mS2k\u0016?", "", AdkSettings.PLATFORM_TYPE_MOBILE, "", "4q^:<5=S,", "Bn8;W,Q", "0xc2f", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "7mS2k\u0016?3 ~\u0003^5\f", "B`a4X;\u001bg(~\t", "7m_Bg\u001aM`\u0019z\u0003", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "7r>=X5", ">dT8", "@`]4X\fJc\u0015\u0006\t", "=eU@X;", "0xc2f\u0016?T'~\n", "", "0xc266N\\(", "@dP1", "Ah]8", "\u001aiPCTuGW#HWr;|e?f\u0001(\t\u0016", "", "@dP143E", "\u001anZ6bu,W\"\u0005P", "@dP15@MS", "@dP15@MSt\f\bZ@", "@dP15@MS\u0007\u000e\bb5~", "@dP17,<W!z\u0002E6\u0006\u000b", "@dP19<EZ-", "@dP1;,QO\u0018~xb4x\u0010\u001fn\u000e,}I\u0001\u0016}Qx\u0010", "@dP1<5M", "@dP1<5M:\u0019", "@dP1?6GU", "@dP1?6GU\u007f~", "@dP1F/H`(", "", "@dP1F/H`(ez", "@dP1F;KW\"\u0001", "", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "@dP1H;?&", "@dP1H;?&v\ty^\u0017\u0007\r8t", "@dP1H;?&\u007f\u0003\u0004^", "@dP1H;?&\u007f\u0003\u0004^\u001a\f\u00163c\u000f", ":h\\6g", "@d`BX:M", "@d`B\\9>", "Ad[2V;", "=oc6b5L", "\u001anZ6bu(^(\u0003\u0005g:R", "\"", "", "\u001anZ6bu-g$~yH7\f\r9n\u000e}", "uK^8\\6\bB-\nz]\u0016\b\u00183o\t6Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "AjX=", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "BnBAe0GU", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RealBufferedSource implements BufferedSource {
    public final Buffer bufferField;
    public boolean closed;
    public final Source source;

    /* JADX INFO: renamed from: okio.RealBufferedSource$inputStream$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я)\u001d̉=!4i\bӵLc\u0003\nIي8\u000b<B\u0007\"2\u0012\u007f\u0007tzA0JfP.`_2ş\u0014zé*c:ڎs;\u0004\u0019F(\u0017Ofg\u0016o\u0011nSI\u001d\b.x\u0019/\u0010iAc \u0013JB\u001e@ya8[Gd\r63!b&F~\u001d\u0001H0x\u0014\u0005\u0002[K:\u0013`D~Bj\r{\u0006`&ND.\n6\\\u0016X|\\ǶaE"}, d2 = {"=jX<\"\u0019>O [\u000b_-|\u0016/dm2\fM~\u0017UKx\u0019L\u0006\u0013Df}\u001c?,a", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "/uP6_(;Z\u0019", "", "1k^@X", "", "@dP1", "2`c.", "", "=eU@X;", "0xc266N\\(", "BnBAe0GU", "", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends InputStream {
        AnonymousClass1() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            if (RealBufferedSource.this.closed) {
                throw new IOException("closed");
            }
            return (int) Math.min(RealBufferedSource.this.bufferField.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            RealBufferedSource.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (RealBufferedSource.this.closed) {
                throw new IOException("closed");
            }
            if (RealBufferedSource.this.bufferField.size() == 0 && RealBufferedSource.this.source.read(RealBufferedSource.this.bufferField, 8192L) == -1) {
                return -1;
            }
            byte b2 = RealBufferedSource.this.bufferField.readByte();
            return (b2 + 255) - (b2 | 255);
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i2, int i3) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (RealBufferedSource.this.closed) {
                throw new IOException("closed");
            }
            SegmentedByteString.checkOffsetAndCount(data.length, i2, i3);
            if (RealBufferedSource.this.bufferField.size() == 0 && RealBufferedSource.this.source.read(RealBufferedSource.this.bufferField, 8192L) == -1) {
                return -1;
            }
            return RealBufferedSource.this.bufferField.read(data, i2, i3);
        }

        public String toString() {
            return RealBufferedSource.this + ".inputStream()";
        }
    }

    public RealBufferedSource(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.bufferField = new Buffer();
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer buffer() {
        return this.bufferField;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        return this.bufferField.exhausted() && this.source.read(this.bufferField, 8192L) == -1;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b2) {
        return indexOf(b2, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b2, long j2) {
        return indexOf(b2, j2, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b2, long j2, long j3) {
        long jMax = j2;
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        if (0 > jMax || jMax > j3) {
            throw new IllegalArgumentException(("fromIndex=" + jMax + " toIndex=" + j3).toString());
        }
        while (jMax < j3) {
            long jIndexOf = this.bufferField.indexOf(b2, jMax, j3);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (size >= j3 || this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, size);
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString bytes, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOf = this.bufferField.indexOf(bytes, j2);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, (size - ((long) bytes.size())) + 1);
        }
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString targetBytes, long j2) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOfElement = this.bufferField.indexOfElement(targetBytes, j2);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, size);
        }
    }

    @Override // okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.RealBufferedSource.inputStream.1
            AnonymousClass1() {
            }

            @Override // java.io.InputStream
            public int available() throws IOException {
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                }
                return (int) Math.min(RealBufferedSource.this.bufferField.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                RealBufferedSource.this.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                }
                if (RealBufferedSource.this.bufferField.size() == 0 && RealBufferedSource.this.source.read(RealBufferedSource.this.bufferField, 8192L) == -1) {
                    return -1;
                }
                byte b2 = RealBufferedSource.this.bufferField.readByte();
                return (b2 + 255) - (b2 | 255);
            }

            @Override // java.io.InputStream
            public int read(byte[] data, int i2, int i3) throws IOException {
                Intrinsics.checkNotNullParameter(data, "data");
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                }
                SegmentedByteString.checkOffsetAndCount(data.length, i2, i3);
                if (RealBufferedSource.this.bufferField.size() == 0 && RealBufferedSource.this.source.read(RealBufferedSource.this.bufferField, 8192L) == -1) {
                    return -1;
                }
                return RealBufferedSource.this.bufferField.read(data, i2, i3);
            }

            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j2, ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(j2, bytes, 0, bytes.size());
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j2, ByteString bytes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 < 0 || i2 < 0 || i3 < 0 || bytes.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            long j3 = ((long) i4) + j2;
            if (!request(1 + j3) || this.bufferField.getByte(j3) != bytes.getByte(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = i3;
        SegmentedByteString.checkOffsetAndCount(sink.length, i2, j2);
        if (this.bufferField.size() == 0) {
            if (i3 == 0) {
                return 0;
            }
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1;
            }
        }
        return this.bufferField.read(sink, i2, (int) Math.min(j2, this.bufferField.size()));
    }

    @Override // okio.Source
    public long read(Buffer sink, long j2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.bufferField.size() == 0) {
            if (j2 == 0) {
                return 0L;
            }
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
        }
        return this.bufferField.read(sink, Math.min(j2, this.bufferField.size()));
    }

    @Override // okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = 0;
        while (this.source.read(this.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j2 += jCompleteSegmentByteCount;
                sink.write(this.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (this.bufferField.size() <= 0) {
            return j2;
        }
        long size = j2 + this.bufferField.size();
        Buffer buffer = this.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    @Override // okio.BufferedSource
    public byte readByte() {
        require(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteArray();
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long j2) {
        require(j2);
        return this.bufferField.readByteArray(j2);
    }

    @Override // okio.BufferedSource
    public ByteString readByteString() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    @Override // okio.BufferedSource
    public ByteString readByteString(long j2) {
        require(j2);
        return this.bufferField.readByteString(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0026, code lost:
    
        if (r6 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0031, code lost:
    
        r2 = new java.lang.StringBuilder("Expected a digit or '-' but was 0x");
        r1 = java.lang.Integer.toString(r8, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0054, code lost:
    
        throw new java.lang.NumberFormatException(r2.append(r1).toString());
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() {
        /*
            r11 = this;
            r4 = 1
            r11.require(r4)
            r9 = 0
            r6 = r9
        L8:
            long r2 = r6 + r4
            boolean r0 = r11.request(r2)
            if (r0 == 0) goto L28
            okio.Buffer r0 = r11.bufferField
            byte r8 = r0.getByte(r6)
            r0 = 48
            if (r8 < r0) goto L1e
            r0 = 57
            if (r8 <= r0) goto L2f
        L1e:
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 != 0) goto L26
            r0 = 45
            if (r8 == r0) goto L2f
        L26:
            if (r1 == 0) goto L31
        L28:
            okio.Buffer r0 = r11.bufferField
            long r0 = r0.readDecimalLong()
            return r0
        L2f:
            r6 = r2
            goto L8
        L31:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected a digit or '-' but was 0x"
            r2.<init>(r0)
            r0 = 16
            int r0 = kotlin.text.CharsKt.checkRadix(r0)
            java.lang.String r1 = java.lang.Integer.toString(r8, r0)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.lang.StringBuilder r0 = r2.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.RealBufferedSource.readDecimalLong():long");
    }

    @Override // okio.BufferedSource
    public void readFully(Buffer sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            require(j2);
            this.bufferField.readFully(sink, j2);
        } catch (EOFException e2) {
            sink.writeAll(this.bufferField);
            throw e2;
        }
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            require(sink.length);
            this.bufferField.readFully(sink);
        } catch (EOFException e2) {
            int i2 = 0;
            while (this.bufferField.size() > 0) {
                Buffer buffer = this.bufferField;
                int i3 = buffer.read(sink, i2, (int) buffer.size());
                if (i3 == -1) {
                    throw new AssertionError();
                }
                i2 += i3;
            }
            throw e2;
        }
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() {
        byte b2;
        require(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!request(i3)) {
                break;
            }
            b2 = this.bufferField.getByte(i2);
            if ((b2 < 48 || b2 > 57) && ((b2 < 97 || b2 > 102) && (b2 < 65 || b2 > 70))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(b2, CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            throw new NumberFormatException(sb.append(string).toString());
        }
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    @Override // okio.BufferedSource
    public int readInt() {
        require(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.BufferedSource
    public int readIntLe() {
        require(4L);
        return this.bufferField.readIntLe();
    }

    @Override // okio.BufferedSource
    public long readLong() {
        require(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.BufferedSource
    public long readLongLe() {
        require(8L);
        return this.bufferField.readLongLe();
    }

    @Override // okio.BufferedSource
    public short readShort() {
        require(2L);
        return this.bufferField.readShort();
    }

    @Override // okio.BufferedSource
    public short readShortLe() {
        require(2L);
        return this.bufferField.readShortLe();
    }

    @Override // okio.BufferedSource
    public String readString(long j2, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        require(j2);
        return this.bufferField.readString(j2, charset);
    }

    @Override // okio.BufferedSource
    public String readString(Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset);
    }

    @Override // okio.BufferedSource
    public String readUtf8() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readUtf8();
    }

    @Override // okio.BufferedSource
    public String readUtf8(long j2) {
        require(j2);
        return this.bufferField.readUtf8(j2);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() {
        require(1L);
        byte b2 = this.bufferField.getByte(0L);
        if ((b2 + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY) - (224 | b2) == 192) {
            require(2L);
        } else if ((b2 & 240) == 224) {
            require(3L);
        } else if ((-1) - (((-1) - b2) | ((-1) - 248)) == 240) {
            require(4L);
        }
        return this.bufferField.readUtf8CodePoint();
    }

    @Override // okio.BufferedSource
    public String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (this.bufferField.size() != 0) {
            return readUtf8(this.bufferField.size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j3);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (j3 < Long.MAX_VALUE && request(j3) && this.bufferField.getByte(j3 - 1) == 13 && request(1 + j3) && this.bufferField.getByte(j3) == 10) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, j3);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = this.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.size(), j2) + " content=" + buffer.readByteString().hex() + Typography.ellipsis);
    }

    @Override // okio.BufferedSource
    public boolean request(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.bufferField.size() < j2) {
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public void require(long j2) {
        if (!request(j2)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int iSelectPrefix = okio.internal.Buffer.selectPrefix(this.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix != -1) {
                    this.bufferField.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                    return iSelectPrefix;
                }
            } else if (this.source.read(this.bufferField, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.BufferedSource
    public <T> T select(TypedOptions<T> options) throws IOException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelect = select(options.getOptions$okio());
        if (iSelect == -1) {
            return null;
        }
        return options.get(iSelect);
    }

    @Override // okio.BufferedSource
    public void skip(long j2) {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, this.bufferField.size());
            this.bufferField.skip(jMin);
            j2 -= jMin;
        }
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }

    public String toString() {
        return "buffer(" + this.source + ')';
    }
}
