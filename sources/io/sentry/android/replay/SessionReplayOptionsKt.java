package io.sentry.android.replay;

import io.sentry.SentryReplayOptions;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u0011Nh\r\"D\u0012&\u0006\u000fjg1tiV\u008cjSX\u000e\"Arh2Ҝ}ٴ?_2\u007f(\u000b]Q\bitNh\u0010c5\u0014\u001c\u0011jZH}x\f\u0013?6PģW3{ns~\u001f9\rӓ,ݨ&B\u0012\u0007\u0007!8K0x\u0001KY\u0011ܞ4I"}, d2 = {"D`[BX", "", ";`b843E7!z|^:", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yl(\u0007G|+\u0001R~\u0012F\u007f3\u000b", "5dc\u001aT:D/ \u0006^f(~\t=", "uKX<\":>\\(\f\u000f(\u001a|\u0012>r\u0014\u0015{K\b\u0013+1z\u001d@\u0001.C/A\u0015", "Adc\u001aT:D/ \u0006^f(~\t=", "uKX<\":>\\(\f\u000f(\u001a|\u0012>r\u0014\u0015{K\b\u0013+1z\u001d@\u0001.C/rc(", ";`b843EB\u0019\u0012\n", "5dc\u001aT:D/ \u0006i^?\f", "Adc\u001aT:D/ \u0006i^?\f", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SessionReplayOptionsKt {
    @Deprecated(level = DeprecationLevel.ERROR, message = "\nK\u0010Iv\u0007T`k\u0007=\tc*<^k^\u001d,\t6")
    @InterfaceC1492Gx
    public static final boolean getMaskAllImages(SentryReplayOptions sentryReplayOptions) {
        Intrinsics.checkNotNullParameter(sentryReplayOptions, "<this>");
        throw new IllegalStateException("Getter not supported".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\nK\u0010Iv\u0007T`k\u0007=\tc*<^k^\u001d,\t6")
    @InterfaceC1492Gx
    public static final boolean getMaskAllText(SentryReplayOptions sentryReplayOptions) {
        Intrinsics.checkNotNullParameter(sentryReplayOptions, "<this>");
        throw new IllegalStateException("Getter not supported".toString());
    }

    public static final void setMaskAllImages(SentryReplayOptions sentryReplayOptions, boolean z2) {
        Intrinsics.checkNotNullParameter(sentryReplayOptions, "<this>");
        sentryReplayOptions.setMaskAllImages(z2);
    }

    public static final void setMaskAllText(SentryReplayOptions sentryReplayOptions, boolean z2) {
        Intrinsics.checkNotNullParameter(sentryReplayOptions, "<this>");
        sentryReplayOptions.setMaskAllText(z2);
    }
}
