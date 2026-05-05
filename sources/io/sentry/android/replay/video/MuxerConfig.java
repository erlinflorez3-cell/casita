package io.sentry.android.replay.video;

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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\tnjG<LeNAZS8\u0018s{:&aҗwYП\u0006\u001a,!I\u0005^kunbZ9D\u001f\n$z\u0003,wX\ta \u0013JB\u001eBCQ}BQ`#9\u0015$@(Py3\u0004*0N\u0010\u0005\u0002[K:\u001aضDpH[UT\u00130*\u0006l!Gɭ]0UD_\u0005]h2iʌj\u000bU5wH|{\u0010\rĝ(U}o7C@e8[ȳTK\u000e`uW\u0003mt\u0004ޢio.9d\fWd`Fг\u0016s\u0013\u001by\u000b&\u000bӤ\u0002f\u0012'9O{K~\u000fX}\u0001{\u001b>\u001c\u000e4*x43\u001at\f&3#u\u0004FV\u0002lG\u0018z\u00109G+\u000639?3f\u007fdk\u001fT7\n\f%\u001eQ\t5ŖZ\u001d\u001fn23T&oaWN\\`P XklJΦcJ1\u0012P_\u007f]~Wқ\u0016m>iZ;!\u001a\n\u000f؊fG\u0014nnki\u0001Kغ&t\u001eճB\u000b\u0012dRoUz^Tp,?NɟX\r\u0006ܱ+\"b\u0004J.u\u001f\\T\u0001i\u0019Pύ\u000e+7ωO[ty\u001cb\nmA<ic>i؏z\u001aGֺz\u0007^uPc\\rj,:2vmfǵ\bΌR\u0018\u001bԵWs\"E:<9^\u001bZ\u00111\u0013Y\u000b\u000bwZ\u0017\u0013Uԥ?ʗ\u0007u,ڏ!\u0003Vp~z\bzOA\u000bsĞ1c"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@u%?#e0Jm#\fWL<o6s", "", "4h[2", "\u001aiPCTuB]b_~e,R", "@dR<e+B\\\u001bp~];\u007f", "", "@dR<e+B\\\u001bazb.\u007f\u0018", "4qP:X\u0019:b\u0019", "0hc\u001fT;>", ";h\\2G@IS", "", "uKY.i(\bW#H[b3|^\u0013Ic\fbE|(\u0013\u0011v\nExn#h\u000b$@okq>", "5dc\u000f\\;+O(~", "u(8", "5dc\u0013\\3>", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "5dc\u0013e(FS\u0006z\n^", "5dc\u001a\\4>B-\nz", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001fX*H`\u0018\u0003\u0004`\u000f|\r1h\u000f", "Adc\u001fX*H`\u0018\u0003\u0004`\u000f|\r1h\u000f", "uH\u0018#", "5dc\u001fX*H`\u0018\u0003\u0004`\u001e\u0001\b>h", "Adc\u001fX*H`\u0018\u0003\u0004`\u001e\u0001\b>h", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MuxerConfig {
    private final int bitRate;
    private final File file;
    private final int frameRate;
    private final String mimeType;
    private int recordingHeight;
    private int recordingWidth;

    public MuxerConfig(File file, int i2, int i3, int i4, int i5, String mimeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.file = file;
        this.recordingWidth = i2;
        this.recordingHeight = i3;
        this.frameRate = i4;
        this.bitRate = i5;
        this.mimeType = mimeType;
    }

    public /* synthetic */ MuxerConfig(File file, int i2, int i3, int i4, int i5, String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i2, i3, i4, i5, (-1) - (((-1) - i6) | ((-1) - 32)) != 0 ? "video/avc" : str);
    }

    public static /* synthetic */ MuxerConfig copy$default(MuxerConfig muxerConfig, File file, int i2, int i3, int i4, int i5, String str, int i6, Object obj) {
        if ((i6 + 1) - (1 | i6) != 0) {
            file = muxerConfig.file;
        }
        if ((2 & i6) != 0) {
            i2 = muxerConfig.recordingWidth;
        }
        if ((i6 + 4) - (4 | i6) != 0) {
            i3 = muxerConfig.recordingHeight;
        }
        if ((8 & i6) != 0) {
            i4 = muxerConfig.frameRate;
        }
        if ((i6 + 16) - (16 | i6) != 0) {
            i5 = muxerConfig.bitRate;
        }
        if ((i6 & 32) != 0) {
            str = muxerConfig.mimeType;
        }
        return muxerConfig.copy(file, i2, i3, i4, i5, str);
    }

    public final File component1() {
        return this.file;
    }

    public final int component2() {
        return this.recordingWidth;
    }

    public final int component3() {
        return this.recordingHeight;
    }

    public final int component4() {
        return this.frameRate;
    }

    public final int component5() {
        return this.bitRate;
    }

    public final String component6() {
        return this.mimeType;
    }

    public final MuxerConfig copy(File file, int i2, int i3, int i4, int i5, String mimeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new MuxerConfig(file, i2, i3, i4, i5, mimeType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MuxerConfig)) {
            return false;
        }
        MuxerConfig muxerConfig = (MuxerConfig) obj;
        return Intrinsics.areEqual(this.file, muxerConfig.file) && this.recordingWidth == muxerConfig.recordingWidth && this.recordingHeight == muxerConfig.recordingHeight && this.frameRate == muxerConfig.frameRate && this.bitRate == muxerConfig.bitRate && Intrinsics.areEqual(this.mimeType, muxerConfig.mimeType);
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final File getFile() {
        return this.file;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public int hashCode() {
        return (((((((((this.file.hashCode() * 31) + Integer.hashCode(this.recordingWidth)) * 31) + Integer.hashCode(this.recordingHeight)) * 31) + Integer.hashCode(this.frameRate)) * 31) + Integer.hashCode(this.bitRate)) * 31) + this.mimeType.hashCode();
    }

    public final void setRecordingHeight(int i2) {
        this.recordingHeight = i2;
    }

    public final void setRecordingWidth(int i2) {
        this.recordingWidth = i2;
    }

    public String toString() {
        return "MuxerConfig(file=" + this.file + ", recordingWidth=" + this.recordingWidth + ", recordingHeight=" + this.recordingHeight + ", frameRate=" + this.frameRate + ", bitRate=" + this.bitRate + ", mimeType=" + this.mimeType + ')';
    }
}
