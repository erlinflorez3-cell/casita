package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: IntSize.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!4i\bDZc|\u0004G\n8\u000b<H\u0007\"2\u0013\u007f\u0007|jA0JiP.hS2\u000fq\u0001L?i)\nCiUJ\u00020\u000fgN\u0016n\u001fNh\u0013[\u000f4\u001d?o߽MU\u0007f*#@L\b?aM\u0018=gk;;Յ\u001f݅ŕ<{\u000b\r(.`-\u0005\b[K:\u0012X@\u001fA\u0003\u0011[\u00132\u00124>fҽ&תfޮɇLncI=3\u001b}P_?_^\u000fu\rtTm\u0012ɱ`ӜҋD9;(3g\u001b\u001b`pW\u0003mqe\u0005\u00172m0˗rɎ͏\\\u0002\u001a+9S%q\u0001=t\u0005\u007fk4'YO*Pح\rߊÞ~}\u0013T\u0012\u0012&CV͓E\u001a\u0015\u000763#r\n\u0005'ؤ`۰\u0004\u0005q8\u001d&\u000e5C;!i_eݥ\u0019S?~\u000bڞ:Q\u007f\u0382%t"}, d2 = {"1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc\u0010X5MS&F\u0005s4\u0012}\u001aI>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "uI\u0018#", "5dc\u0010X5MS&F\u0005s4\u0012}\u001aI", "uI\u0018\u0017", "\u0017mc \\A>", "EhSA[", "", "6dX4[;", "uH8u=", "@nd;W\u001bH7\"\u000ehbA|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "@nd;W\u001bH7\"\u000ehbA|P?v\u0014\u001cYE\u0007", "Bh\\2f", "Ahi2", "Bh\\2fs(\u001e\u001ff\bX*", "uH9u=", "Bn8;g\u0019>Q(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "Bn8;g\u0019>Q(F\u0005s4\u0012}\u001aI", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Wx\u0012K@\t>hj 5|k", "Bn8;g\u001aBh\u0019", "Bn8;g\u001aBh\u0019F\u000bo@pf4k", "BnB6m,", "BnB6m,\u0006].\u0007\u0010S\u0017`", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IntSizeKt {
    /* JADX INFO: renamed from: getCenter-ozmzZPI$annotations */
    public static /* synthetic */ void m6815getCenterozmzZPI$annotations(long j2) {
    }

    public static final long IntSize(int i2, int i3) {
        long j2 = i3;
        return IntSize.m6803constructorimpl((-1) - (((-1) - ((j2 + 4294967295L) - (j2 | 4294967295L))) & ((-1) - (((long) i2) << 32))));
    }

    /* JADX INFO: renamed from: times-O0kMr_c */
    public static final long m6817timesO0kMr_c(int i2, long j2) {
        return IntSize.m6810timesYEO4UFw(j2, i2);
    }

    /* JADX INFO: renamed from: toIntRect-ozmzZPI */
    public static final IntRect m6818toIntRectozmzZPI(long j2) {
        return IntRectKt.m6798IntRectVbeCjmY(IntOffset.Companion.m6776getZeronOccac(), j2);
    }

    /* JADX INFO: renamed from: getCenter-ozmzZPI */
    public static final long m6814getCenterozmzZPI(long j2) {
        return IntOffset.m6760constructorimpl((((j2 << 32) >> 33) & 4294967295L) | ((j2 >> 33) << 32));
    }

    /* JADX INFO: renamed from: toSize-ozmzZPI */
    public static final long m6820toSizeozmzZPI(long j2) {
        return SizeKt.Size(IntSize.m6808getWidthimpl(j2), IntSize.m6807getHeightimpl(j2));
    }

    /* JADX INFO: renamed from: toIntSize-uvyYCjk */
    public static final long m6819toIntSizeuvyYCjk(long j2) {
        int iM4006getWidthimpl = (int) Size.m4006getWidthimpl(j2);
        return IntSize.m6803constructorimpl((-1) - (((-1) - (((long) ((int) Size.m4003getHeightimpl(j2))) & 4294967295L)) & ((-1) - (((long) iM4006getWidthimpl) << 32))));
    }

    /* JADX INFO: renamed from: roundToIntSize-uvyYCjk */
    public static final long m6816roundToIntSizeuvyYCjk(long j2) {
        int iRound = Math.round(Size.m4006getWidthimpl(j2));
        int iRound2 = Math.round(Size.m4003getHeightimpl(j2));
        long j3 = ((long) iRound) << 32;
        long j4 = (-1) - (((-1) - ((long) iRound2)) | ((-1) - 4294967295L));
        return IntSize.m6803constructorimpl((j4 + j3) - (j4 & j3));
    }
}
