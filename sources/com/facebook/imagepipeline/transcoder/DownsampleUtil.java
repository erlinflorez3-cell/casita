package com.facebook.imagepipeline.transcoder;

import com.facebook.common.logging.FLog;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":\u0017\u007f\u0007ljA0ZeP\u008cZS@\u000fsڔ<$q$yCA_ Չ\"\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jtic}u\u0012=6rsM9eok@\u0011zD\r8487(\u000e1\u001e8R(v)N\u0012\u0011ZXN|RR;O5\u001e \fV /%\rm\\>`ns9],3mPX?_^\b}\u0011Ta?\r%cd0\tUC#=S1\t\u0003_M\rWqk\u0010\u0019+5:as\u00068\t\u0004\"%CO;_9+%\u001b_q$'YQ\u0014O^\u0014@w)\u0003=@\u0012\u0018\u001e'v9s\u001a/\u0016\u001cE\rr\u0002B\u0001\u0006lU\u0018z\u0010:]*HA9M3f\u007fck\u001d\\J\u0014\u0005;\"i\u00067/ii&`C\u001d\u0005{_Gi@kJ\u0015\u000f*I{\u0005\tb0,ZΉ\u001aĬ3{\u0019фg1E^Q#OoX҉\u0017ϼz\u0005hå\u05eemi"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017\"E}=,\u0011pl@\u0007S;R}|", "", "u(E", "\u0012D5\u000eH\u0013-M\u0007ZbI\u0013\\\u0003\u001dIt\b", "", "\u0017MC\u0012E\u001d\u001a:\u0013kdN\u0015[l\u0018G", "", "2dc2e4B\\\u0019]\u0005p5\u000b\u00057p\u0007(h<\u0010\u001b!", "@nc.g0H\\\u0003\n\nb6\u0006\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z =IR?u=\b weC\u0010q\u0002", "@db6m,(^(\u0003\u0005g:", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z\u0016<QX;U?-\u0019rjG\\", "3mR<W,=7!z|^", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "2dc2e4B\\\u0019lvf7\u0004\t\u001di\u0015(", ";`g\u000f\\;FO$l~s,", "2dc2e4B\\\u0019lvf7\u0004\t\u001di\u0015(`+`x", ">hg2_\u001aBh\u0019", ";`g\u000f\\;FO$l~s,`\u0012\fy\u000f(\n", "5dc\u001fb;:b\u001d\t\u0004:5~\u0010/", "@`c6b\u001bHA\u0015\u0007\u0006e,j\rDe", "@`c6b", "@`c6b\u001bHA\u0015\u0007\u0006e,j\rDed\u0013[\"", "@nd;W\u001bH>#\u0011zk\u0016}wAo", "A`\\=_,,W.~", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DownsampleUtil {
    public static final int DEFAULT_SAMPLE_SIZE = 1;
    public static final DownsampleUtil INSTANCE = new DownsampleUtil();
    private static final float INTERVAL_ROUNDING = 0.33333334f;

    private DownsampleUtil() {
    }

    @JvmStatic
    public static final float determineDownsampleRatio(RotationOptions rotationOptions, ResizeOptions resizeOptions, EncodedImage encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!EncodedImage.isMetaDataAvailable(encodedImage)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (resizeOptions == null || resizeOptions.height <= 0 || resizeOptions.width <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
            return 1.0f;
        }
        int rotationAngle = INSTANCE.getRotationAngle(rotationOptions, encodedImage);
        boolean z2 = rotationAngle == 90 || rotationAngle == 270;
        int height = z2 ? encodedImage.getHeight() : encodedImage.getWidth();
        int width = z2 ? encodedImage.getWidth() : encodedImage.getHeight();
        float f2 = resizeOptions.width / height;
        float f3 = resizeOptions.height / width;
        float fCoerceAtLeast = RangesKt.coerceAtLeast(f2, f3);
        FLog.v("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(resizeOptions.width), Integer.valueOf(resizeOptions.height), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(fCoerceAtLeast));
        return fCoerceAtLeast;
    }

    @JvmStatic
    public static final int determineSampleSize(RotationOptions rotationOptions, ResizeOptions resizeOptions, EncodedImage encodedImage, int i2) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!EncodedImage.isMetaDataAvailable(encodedImage)) {
            return 1;
        }
        float fDetermineDownsampleRatio = determineDownsampleRatio(rotationOptions, resizeOptions, encodedImage);
        int iRatioToSampleSizeJPEG = encodedImage.getImageFormat() == DefaultImageFormats.JPEG ? ratioToSampleSizeJPEG(fDetermineDownsampleRatio) : ratioToSampleSize(fDetermineDownsampleRatio);
        int iMax = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        float f2 = resizeOptions != null ? resizeOptions.maxBitmapSize : i2;
        while (iMax / iRatioToSampleSizeJPEG > f2) {
            iRatioToSampleSizeJPEG = encodedImage.getImageFormat() == DefaultImageFormats.JPEG ? iRatioToSampleSizeJPEG * 2 : iRatioToSampleSizeJPEG + 1;
        }
        return iRatioToSampleSizeJPEG;
    }

    @JvmStatic
    public static final int determineSampleSizeJPEG(EncodedImage encodedImage, int i2, int i3) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int sampleSize = encodedImage.getSampleSize();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * i2) / sampleSize) / sampleSize > i3) {
            sampleSize *= 2;
        }
        return sampleSize;
    }

    private final int getRotationAngle(RotationOptions rotationOptions, EncodedImage encodedImage) {
        if (!rotationOptions.useImageMetadata()) {
            return 0;
        }
        int rotationAngle = encodedImage.getRotationAngle();
        if (rotationAngle == 0 || rotationAngle == 90 || rotationAngle == 180 || rotationAngle == 270) {
            return rotationAngle;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @JvmStatic
    public static final int ratioToSampleSize(float f2) {
        if (f2 > 0.6666667f) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            double d2 = i2;
            if ((1.0d / d2) + ((1.0d / (Math.pow(d2, 2.0d) - d2)) * ((double) INTERVAL_ROUNDING)) <= f2) {
                return i2 - 1;
            }
            i2++;
        }
    }

    @JvmStatic
    public static final int ratioToSampleSizeJPEG(float f2) {
        if (f2 > 0.6666667f) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            int i3 = i2 * 2;
            double d2 = 1.0d / ((double) i3);
            if (d2 + (((double) INTERVAL_ROUNDING) * d2) <= f2) {
                return i2;
            }
            i2 = i3;
        }
    }

    @JvmStatic
    public static final int roundToPowerOfTwo(int i2) {
        int i3 = 1;
        while (i3 < i2) {
            i3 *= 2;
        }
        return i3;
    }
}
