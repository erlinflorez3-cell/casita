package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jA0ZeP\u008cZS@\u000fsڔ<$i'yCQU\"Ԃ*\t]No˧vJh\u0017KƤ\u000e\u0016\u0007p4I[{e\u0012\u001d9JģG3coE9ft>\u000562*8\u007f\u0007\u0017ɝZH>u;N[\u0010 0XphQҫQ\u0005(\u0013N\\.\u000e6\\\u0016\\fLzlR/Q\u0013\u001aF\\8w0+_=Jb:%v\u00100q@\u007f;#9k\u00035`\"SKE\u007fR\u001dhU5qI<]Dn\u0018\u0014C9\u0016\r&\t4s\u001dQ\u000f$W/]|cP<B(~\n(T\u0004<\u001em\\v3(\u0003 \u000ea\u00129g\tn\u0010|Z\u007f)of\u001b3\u001fK+g5\u0017Uo[1Ne\u00145\u0011,>\u0019nOs\u001b\u000e1%)V\u0010U_T)='R`Բ?ъ\bpj̣z\u0014>L\u00183*\u0017\u0017\u0017\u0004>2ހ%\u074co\u0002Pֳ8\u0003\u0013h\u0001S\u0018[\u001fؚ$å\u001a72\u009e\\fRn\u001dk~_/\u008f\u001dܖ T\u000fâX\u001f.\\\u0010<O1fʝQŹmjUΪܬ)P"}, d2 = {"\u001anZ6bu h\u001d\nhh<\n\u0007/;", "\u001anZ6bu,])\fx^\u0002", "And?V,", "uK^8\\6\bA#\u000f\b\\,RL ", "1qR", "\u001aiPCTuNb\u001d\u0006Ds0\bR\rR]uH\u0016", "\u001anZ6buB\\(~\bg(\u0004R\rR]uH\u0016", "7mU9T;>`", "\u001aiPCTuNb\u001d\u0006Ds0\bR\u0013n\u0001/wO\u0001$l", "\u001anZ6bu\"\\\u001a\u0006vm,\n^", "7mU9T;>`\u0007\t\u000bk*|", "\u001anZ6bu\"\\\u001a\u0006vm,\nv9u\r&{\u0016", "AdRA\\6G", "", "\u001anZ6bu+S\u0015\u0006Wn-}\t<e~\u0016\u0006P\u000e\u0015\u0017\u001d", "1gT0^\fJc\u0015\u0006", "", "<`\\2", "", "3w_2V;>R", "", "/bcBT3", "1k^@X", "1n]@h4>6\u0019zy^9", "1n]@h4>B&z~e,\n", "@dP1", "", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "CoS.g,\u001c`\u0017", "0tU3X9", "=eU@X;", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class GzipSource implements Source {
    private final CRC32 crc;
    private final Inflater inflater;
    private final InflaterSource inflaterSource;
    private byte section;
    private final RealBufferedSource source;

    public GzipSource(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        RealBufferedSource realBufferedSource = new RealBufferedSource(source);
        this.source = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new InflaterSource((BufferedSource) realBufferedSource, inflater);
        this.crc = new CRC32();
    }

    private final void checkEqual(String str, int i2, int i3) throws IOException {
        if (i3 != i2) {
            throw new IOException(str + ": actual 0x" + StringsKt.padStart(SegmentedByteString.toHexString(i3), 8, '0') + " != expected 0x" + StringsKt.padStart(SegmentedByteString.toHexString(i2), 8, '0'));
        }
    }

    private final void consumeHeader() throws IOException {
        this.source.require(10L);
        byte b2 = this.source.bufferField.getByte(3L);
        int i2 = b2 >> 1;
        boolean z2 = (i2 + 1) - (i2 | 1) == 1;
        if (z2) {
            updateCrc(this.source.bufferField, 0L, 10L);
        }
        checkEqual("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((b2 >> 2) & 1) == 1) {
            this.source.require(2L);
            if (z2) {
                updateCrc(this.source.bufferField, 0L, 2L);
            }
            short shortLe = this.source.bufferField.readShortLe();
            long j2 = (shortLe + 65535) - (shortLe | 65535);
            this.source.require(j2);
            if (z2) {
                updateCrc(this.source.bufferField, 0L, j2);
            }
            this.source.skip(j2);
        }
        int i3 = b2 >> 3;
        if ((i3 + 1) - (i3 | 1) == 1) {
            long jIndexOf = this.source.indexOf((byte) 0);
            if (jIndexOf == -1) {
                throw new EOFException();
            }
            if (z2) {
                updateCrc(this.source.bufferField, 0L, jIndexOf + 1);
            }
            this.source.skip(jIndexOf + 1);
        }
        if (((b2 >> 4) & 1) == 1) {
            long jIndexOf2 = this.source.indexOf((byte) 0);
            if (jIndexOf2 == -1) {
                throw new EOFException();
            }
            if (z2) {
                updateCrc(this.source.bufferField, 0L, jIndexOf2 + 1);
            }
            this.source.skip(jIndexOf2 + 1);
        }
        if (z2) {
            checkEqual("FHCRC", this.source.readShortLe(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    private final void consumeTrailer() throws IOException {
        checkEqual("CRC", this.source.readIntLe(), (int) this.crc.getValue());
        checkEqual("ISIZE", this.source.readIntLe(), (int) this.inflater.getBytesWritten());
    }

    private final void updateCrc(Buffer buffer, long j2, long j3) {
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        while (j2 >= segment.limit - segment.pos) {
            j2 -= (long) (segment.limit - segment.pos);
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        }
        while (j3 > 0) {
            int i2 = (int) (((long) segment.pos) + j2);
            int iMin = (int) Math.min(segment.limit - i2, j3);
            this.crc.update(segment.data, i2, iMin);
            j3 -= (long) iMin;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j2 = 0;
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    @Override // okio.Source
    public long read(Buffer sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        if (this.section == 0) {
            consumeHeader();
            this.section = (byte) 1;
        }
        if (this.section == 1) {
            long size = sink.size();
            long j3 = this.inflaterSource.read(sink, j2);
            if (j3 != -1) {
                updateCrc(sink, size, j3);
                return j3;
            }
            this.section = (byte) 2;
        }
        if (this.section == 2) {
            consumeTrailer();
            this.section = (byte) 3;
            if (!this.source.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }
}
