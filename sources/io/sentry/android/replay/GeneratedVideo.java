package io.sentry.android.replay;

import java.io.File;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4ߚ\u007f\u0007tqA0JoP.`\\2\u000fq|<$i0yّA٭ \u0014̝9O|f(\nZ^\u0019C'\u0006Dyz0WW\u0011]@\u0012BF}CKM\u001eB˃dtD\u000bh90E\u0012\u0005/\u001bpс\u0011?\u0002QY$\u0012^C7ĴSUT\u0013)*\u0006l%Gɭ]0sDX\u0005]hǂS\toB\\'w0+N=LZ'\u001bxy\u001eYCg;\u001b%a\u0007\u001fR\nDIԑp\u0006\u0016v8?+w\u0006\b<f\u0013,\u0017AN;\\9ͽ]MXn ?+}f\u0012؋\rp~\t\u0011%<2$LЀG~<(j \u000eayɤWFX\u061cvD\u0006\u0002o>g4\u000e5C9IiЂeA!\u05cbO}\u000b\u0016,-Q}/[l\u000e\u000f\u0016ôX}YĸiBCS\\\u0016\u0558A\u0005"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9o<\u007f%BU\r 6^\u001a-MM\u0011", "", "DhS2b", "\u001aiPCTuB]b_~e,R", "4qP:X\nHc\"\u000e", "", "2ta.g0H\\", "", "uKY.i(\bW#H[b3|^\u0013JC\u0019", "5dc\u0011h9:b\u001d\t\u0004", "u(9", "5dc\u0013e(FSv\t\u000bg;", "u(8", "5dc#\\+>]", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class GeneratedVideo {
    public static final int $stable = 8;
    private final long duration;
    private final int frameCount;
    private final File video;

    public GeneratedVideo(File video, int i2, long j2) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.video = video;
        this.frameCount = i2;
        this.duration = j2;
    }

    public static /* synthetic */ GeneratedVideo copy$default(GeneratedVideo generatedVideo, File file, int i2, long j2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            file = generatedVideo.video;
        }
        if ((2 & i3) != 0) {
            i2 = generatedVideo.frameCount;
        }
        if ((i3 & 4) != 0) {
            j2 = generatedVideo.duration;
        }
        return generatedVideo.copy(file, i2, j2);
    }

    public final File component1() {
        return this.video;
    }

    public final int component2() {
        return this.frameCount;
    }

    public final long component3() {
        return this.duration;
    }

    public final GeneratedVideo copy(File video, int i2, long j2) {
        Intrinsics.checkNotNullParameter(video, "video");
        return new GeneratedVideo(video, i2, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneratedVideo)) {
            return false;
        }
        GeneratedVideo generatedVideo = (GeneratedVideo) obj;
        return Intrinsics.areEqual(this.video, generatedVideo.video) && this.frameCount == generatedVideo.frameCount && this.duration == generatedVideo.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    public final File getVideo() {
        return this.video;
    }

    public int hashCode() {
        return (((this.video.hashCode() * 31) + Integer.hashCode(this.frameCount)) * 31) + Long.hashCode(this.duration);
    }

    public String toString() {
        return "GeneratedVideo(video=" + this.video + ", frameCount=" + this.frameCount + ", duration=" + this.duration + ')';
    }
}
