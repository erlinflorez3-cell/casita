package com.facebook.imagepipeline.transcoder;

import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.core.NativeCodeSetup;
import com.facebook.imagepipeline.nativecode.NativeImageTranscoderFactory;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r+4\u0012}\u000bnjO0L͜P.hS2\u000fq\u007fJř\f$ B{\u0005*\u00020\tgN\u0016h~Nh\r[\u000f4\u0019\tp:Mmzs\u0011=1RuM8eqS8\u000fuF\t.8:8(\bв\u001e*V\u0017?\u0013QT$\u0014F?\u001fD\u0003\u0011[\u00102\u00124JP\u0005,i\u007fNdK3q\u0003G1\u0011\u0002Dd&\u000e:-Q\u001bQl';\u0003\u0012\"9MO5C(\u001a\u0003OjiN\u001bA\b<3rW+9T\fWdd0\u0018#8g\r\ful\\Min\u001c?-ebyZ>,\u0006\u0006\u0014\rj\u0010>\n5UF-HiN\u000e{\u000b\u0001dXP0hr\u0004\tlN\u0017S\fc/G(~Q\u0010>_N\b\b\u0013\u00136#/qwſV\u05f8d\u0015#ƘHa?VX?^M8Z\u0014Ъ\u0006Ͳf\u00042\u0004>OP;\n\u0011F\u0017S82ހ%\u074co\u0002Pֳ8\u0005\u0013d\u0001U\u007fQv?xÅ\u0018֖.\t\u0014ɮ\u0015p\u0013mhT\u0007/g۶\u001eΤ\u000b}\u0010ʶا`\n"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017+KrC\"xp];\u0007R9J\u007f5EVM,i3n;#\u001cg\"$", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017'Cg6\u001e\u0004u]B\u0015a6Mv4(HL;f_\u0007\u0013", ";`g\u000f\\;FO$l~s,", "", "CrT\u0011b>GA\u0015\u0007\u0006e0\u0006\u000b\u001ca\u000f,\u0006", "", ">qX:T9R7!z|^\u001b\n\u00058s}2z@\u000ew\u0013E~\u0018I\u000b", "7lP4X\u001bKO\"\rxh+|\u0016\u001ey\u000b(", "3mbBe,-`\u0015\b\t\\6{\t<L\u0004%\t<\u000e+}Qk\r<u", "uHI\u0019V6F\u001d\u001azx^)\u0007\u00135/\u00040wB\u0001\"\u001bRo\u0015@\u007f%~h\u000b\u001c@{\u00148LCH5\u0018&\u0011ja(\u0014_5\\t1FL[\rXP\u0002G!&0tS'\u001e\u0001#H wF\u0001\u0003\u0011;I\u0004;uV\u0001Y~", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "1qT.g,\"[\u0015\u0001zM9x\u0012=c\n'{M", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017'Cg6\u001e\u0004u]B\u0015a6Mv4\u001d", "7lP4X\rH`!z\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\u0004", "7rA2f0SW\"\u0001Zg(y\u0010/d", "5dc\u0010h:M]!b\u0003Z.|w<a\t6yJ\u007f\u0017$", "5dc\u0016`(@S\b\fvg:z\u0013.e\r\u001a\u007fO\u0004\u0006+Ro", "5dc\u001bT;Bd\u0019b\u0003Z.|w<a\t6yJ\u007f\u0017$", "5dc \\4IZ\u0019b\u0003Z.|w<a\t6yJ\u007f\u0017$", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MultiImageTranscoderFactory implements ImageTranscoderFactory {
    private final boolean ensureTranscoderLibraryLoaded;
    private final Integer imageTranscoderType;
    private final int maxBitmapSize;
    private final ImageTranscoderFactory primaryImageTranscoderFactory;
    private final boolean useDownSamplingRatio;

    public MultiImageTranscoderFactory(int i2, boolean z2, ImageTranscoderFactory imageTranscoderFactory, Integer num, boolean z3) {
        this.maxBitmapSize = i2;
        this.useDownSamplingRatio = z2;
        this.primaryImageTranscoderFactory = imageTranscoderFactory;
        this.imageTranscoderType = num;
        this.ensureTranscoderLibraryLoaded = z3;
    }

    private final ImageTranscoder getCustomImageTranscoder(ImageFormat imageFormat, boolean z2) {
        ImageTranscoderFactory imageTranscoderFactory = this.primaryImageTranscoderFactory;
        if (imageTranscoderFactory != null) {
            return imageTranscoderFactory.createImageTranscoder(imageFormat, z2);
        }
        return null;
    }

    private final ImageTranscoder getImageTranscoderWithType(ImageFormat imageFormat, boolean z2) {
        Integer num = this.imageTranscoderType;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return getNativeImageTranscoder(imageFormat, z2);
        }
        if (iIntValue == 1) {
            return getSimpleImageTranscoder(imageFormat, z2);
        }
        throw new IllegalArgumentException("Invalid ImageTranscoderType");
    }

    private final ImageTranscoder getNativeImageTranscoder(ImageFormat imageFormat, boolean z2) {
        return NativeImageTranscoderFactory.getNativeImageTranscoderFactory(this.maxBitmapSize, this.useDownSamplingRatio, this.ensureTranscoderLibraryLoaded).createImageTranscoder(imageFormat, z2);
    }

    private final ImageTranscoder getSimpleImageTranscoder(ImageFormat imageFormat, boolean z2) {
        ImageTranscoder imageTranscoderCreateImageTranscoder = new SimpleImageTranscoderFactory(this.maxBitmapSize).createImageTranscoder(imageFormat, z2);
        Intrinsics.checkNotNullExpressionValue(imageTranscoderCreateImageTranscoder, "SimpleImageTranscoderFac…ormat, isResizingEnabled)");
        return imageTranscoderCreateImageTranscoder;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoderFactory
    public ImageTranscoder createImageTranscoder(ImageFormat imageFormat, boolean z2) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        ImageTranscoder customImageTranscoder = getCustomImageTranscoder(imageFormat, z2);
        if (customImageTranscoder == null) {
            customImageTranscoder = getImageTranscoderWithType(imageFormat, z2);
        }
        if (customImageTranscoder == null && NativeCodeSetup.getUseNativeCode()) {
            customImageTranscoder = getNativeImageTranscoder(imageFormat, z2);
        }
        return customImageTranscoder == null ? getSimpleImageTranscoder(imageFormat, z2) : customImageTranscoder;
    }
}
