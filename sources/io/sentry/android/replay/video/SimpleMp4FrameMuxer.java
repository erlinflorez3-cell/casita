package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r'4\u0012}\u0007njG7LeN.ZS@\u000fsڔ<$i-yّCU(\u0004*\tUPog|JbŏK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00153JoU3UڎC>vҚf\u0005N1bK\n\t\u000f\u001aBH>w\u000bGY\u000e*0nsĐV\r[\tb\u0018\u0014M8\u0001Lb.b~NzmR/Q\u000e0V\u0017=mA\u0015M;X\u0005+\u001b\ny\u001eYTg9#:k\u00035h\"SKE\u007fT\u001dhU9q]<eDp\u0018\u0014C=\u007f\u0011k\f>\\3k' w7]hcP<.N߁\bɁ@\u0004\u0016ͺwT<42f6\u0014\nςtՂDP\nމ\u0013\f\tiN\u0017S\t\nڂ;ӸjQiݢiZE\u0006\u001d\rL.W͜-ƟX\u000ehٽk`\u0006]IQnJ\u001fݓ\u0016ՒAm\f͏3\u000e8\u0012HG.<R\u0080:ϲ)7cݽأ%\u0007"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@u%?#k$?x\u001d.5N\nLA\u001a\u001dhII\u001ac9$", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@u%?#k$?x\u001d..P7s4\u0006%{aF\\", ">`c5", "", "4ob", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}\\\u0004q", "4h]._\u001dBR\u0019\tib4|", "", "4qP:X\u000bN`\u0015\u000e~h5l\u0017/c", ";tg2e", "\u001a`]1e6BRb\u0007z]0xR\u0017e~,w(\u0011*\u0017TE", "AsP?g,=", "", "DhS2b\rKO!~\t", "", "DhS2b\u001bKO\u0017\u0005^g+|\u001c", "5dc#\\+>]\b\u0003\u0003^", "7rBAT9MS\u0018", ";tg#\\+>]y\fvf,", "", "3mR<W,=2\u0015\u000ev", "\u001aiPCTuGW#HWr;|e?f\u0001(\t\u0016", "0tU3X9\"\\\u001a\t", "\u001a`]1e6BRb\u0007z]0xR\u0017e~,w\u001e\u000b\u0016\u0017E.jLw&5fa)8wk", "@d[2T:>", "AsP?g", "DhS2b\rH`!z\n", "\u001a`]1e6BRb\u0007z]0xR\u0017e~,w!\u000b$\u001fC~c", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SimpleMp4FrameMuxer implements SimpleFrameMuxer {
    public static final int $stable = 8;
    private long finalVideoTime;
    private final long frameDurationUsec;
    private final MediaMuxer muxer;
    private boolean started;
    private int videoFrames;
    private int videoTrackIndex;

    public SimpleMp4FrameMuxer(String path, float f2) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.frameDurationUsec = (long) (TimeUnit.SECONDS.toMicros(1L) / f2);
        this.muxer = new MediaMuxer(path, 0);
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public long getVideoTime() {
        if (this.videoFrames == 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(this.finalVideoTime + this.frameDurationUsec, TimeUnit.MICROSECONDS);
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public boolean isStarted() {
        return this.started;
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public void muxVideoFrame(ByteBuffer encodedData, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(encodedData, "encodedData");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        long j2 = this.frameDurationUsec;
        int i2 = this.videoFrames;
        this.videoFrames = i2 + 1;
        long j3 = j2 * ((long) i2);
        this.finalVideoTime = j3;
        bufferInfo.presentationTimeUs = j3;
        this.muxer.writeSampleData(this.videoTrackIndex, encodedData, bufferInfo);
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public void release() {
        this.muxer.stop();
        this.muxer.release();
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public void start(MediaFormat videoFormat) {
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        this.videoTrackIndex = this.muxer.addTrack(videoFormat);
        this.muxer.start();
        this.started = true;
    }
}
