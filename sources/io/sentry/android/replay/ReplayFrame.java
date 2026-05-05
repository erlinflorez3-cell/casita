package io.sentry.android.replay;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r)4ߚ\u007f\u0007tvA0JoP.`\\2\u000fq{<$i*yCAU ԃ(\u001fѧ~g\u0016m\u000by\u001bG\u001d\u0006.x\u0019-YY\u0007_*\u000f`E\u007fG9M}AQb\u000b53%ݨ&8\b\u000bI!8U(v)D\u0012ď\u0013xG~Hj\r{\b`Ǝ\u0007\u0007)\u000f-tid5vq$Ǆ0k*wRf'\u000eܞ-S\u0013Fb'%v\u0010\u001f[F=5#'k\u00035U\fG\t?\u007fA\u001dj=&YN:ʕ5!\u0011\"&CO;o#,j\u0018ib\"&YN*\u05f6QV/\u0006\u000f\u0014\rj\u0019Tϑ&\u00115;0~\b<8;ʘR\u0011a\u0010bZ\u0002\u0011`d\u001cӾ\u000493ݍ3hWhI!\u001fF\n\u0005%\u001eQ\u0002ͼ%a\\וx\u0017!]\u0006[\u0002`N?`N8\\ǀq\nxç\u001a,\n;U\f¤\u007f("}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m^-3u\u0016\u0004", "", "Aba2X5LV#\u000e", "\u001aiPCTuB]b_~e,R", "Bh\\2f;:[$", "", "Aba2X5", "", "uKY.i(\bW#H[b3|^\u0014L\u0005$\r<J\u001e\u0013PqW*\u000629b\u007fuz^", "5dc V9>S\"", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc V9>S\"\r}h;", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "5dc!\\4>a(z\u0003i", "u(9", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ReplayFrame {
    private final String screen;
    private final File screenshot;
    private final long timestamp;

    public ReplayFrame(File screenshot, long j2, String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.screenshot = screenshot;
        this.timestamp = j2;
        this.screen = str;
    }

    public /* synthetic */ ReplayFrame(File file, long j2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, j2, (i2 & 4) != 0 ? null : str);
    }

    public static /* synthetic */ ReplayFrame copy$default(ReplayFrame replayFrame, File file, long j2, String str, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            file = replayFrame.screenshot;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = replayFrame.timestamp;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str = replayFrame.screen;
        }
        return replayFrame.copy(file, j2, str);
    }

    public final File component1() {
        return this.screenshot;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final String component3() {
        return this.screen;
    }

    public final ReplayFrame copy(File screenshot, long j2, String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        return new ReplayFrame(screenshot, j2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplayFrame)) {
            return false;
        }
        ReplayFrame replayFrame = (ReplayFrame) obj;
        return Intrinsics.areEqual(this.screenshot, replayFrame.screenshot) && this.timestamp == replayFrame.timestamp && Intrinsics.areEqual(this.screen, replayFrame.screen);
    }

    public final String getScreen() {
        return this.screen;
    }

    public final File getScreenshot() {
        return this.screenshot;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((this.screenshot.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31;
        String str = this.screen;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReplayFrame(screenshot=" + this.screenshot + ", timestamp=" + this.timestamp + ", screen=" + this.screen + ')';
    }
}
