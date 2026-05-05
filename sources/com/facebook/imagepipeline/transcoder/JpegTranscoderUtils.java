package com.facebook.imagepipeline.transcoder;

import android.graphics.Matrix;
import com.facebook.common.internal.ImmutableList;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005#4\u0012\u000e\u0007nj?7LeV3Zݷ2\u000f\u0002{<$a&yCQU\"}(\tWN}gvJ`\fK\u000f\u0014\u001f\u0001̓4Ikxe\u0012\u0015:HŪ?Iݹ =g_5;\u000b ݨ&8\b\u0005I(8U(v)E{\u0010 >XphTSRM: \u0015V /.\rm\\G`ns9]53mPa?_^~}\u0011Th?\r%cd0\tEC*=S1\t\u0003_M\u0019Wqk\u001c/'oAW\fo6\u0007\u0002D\u00199h%]!@\r\t_v$'Yf*P\u0019$6\u0013\u0013{;>4\u0012\u0014@`.[4\u0017\f\u001cI\rr\u0002W\u0017\u0007'j\u000e\u0017y6E'079R3f\u007f{k\u001f\\H\u0014\u0007#\u001dQ\u0013\u001f%ij&`C2\u0005{_Ni@kf\u0015\u000f\"U{#\td\u0018)2Pw\u0004=\u0012).E<g_G<9k0b\u000bl?\u0015n\nkkhGnB\u001f\u001aEL!\f\tF+\u00054^b{D\u0011{:\u0005\u000b\f,+ \u000by\u0003&m\u001e\\t\u0001i\u0019k\u000e\u000e3U~7\bp2\u0013 OlZMQ\u0012\u0012\u0012V\u0005<W<\u0011\u0015\tjP|$Z\u000b8h7\u0019~\u001ex\u0014D|\u000eI6\u0016ڬnٜ07!¢%J\t!PAM\u0015m^\u0001\u0010-V\nɷUȐ(t\u0011ɖ!x~t\u007f\u0007Y6\rh@4iSK\u0018TWPjb\u0003Y\u000bUͦ\u0002ěkLOƂ=\"\u0004]\u0014 D\u001c\u0010֞\u0002ˮ\u0017\u000f\u0007ǻ\u0003\u000e;Ndr\u0014S$Ƀyϸ\u0001y\u0017\u00909:u\u0012\u0003pZbA߁\"ݚ\u001b\"~ܥC/\u0016o\u0018y\u0010HQù6ӝ\u000f[FδC\u000fgHf8+\u0007uǎw˽s\"\u0005ކԯGQ"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017(Fk6\r\"djG\u0005m+N\u0004\u0017VPU:2", "", "u(E", "\u0012D5\u000eH\u0013-M}iZ@&hx\u000bLc\u0017o", "", "5dc\u00118\r\u001aC\u007fmtC\u0017\\j)Qo\u0004b$o\u000bUCx\u0017F\u0006!D]\b)E", "\u0014T;\u0019R\u0019(C\u0002]", "\u0017ME\u0012E\u001b\u001e2\u0013^mB\rvr\u001cI_\u0011j\u001coz\u00010]", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n\u0019a\u00060Fi\u00135M*?yCs", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\u001b@G,D\u001c\u001a:|mn", "\u001b@G,F\n\u001a:xxcN\u0014\\u\u000bTi\u0015", "\u001bH=,D\u001c\u001a:|mn", "\u001bH=,F\n\u001a:xxcN\u0014\\u\u000bTi\u0015", "!B0\u00198&\u001d3\u0002hbB\u0015Xw\u0019R", "1`[0h3:b\u0019]\u0005p5\u000b\u00057p\u0007(dP\t\u0017$C~\u0018I", "2nf;f(F^ ~gZ;\u0001\u0013", "2dc2e4B\\\u0019kzl0\u0012\t\u001ca\u000f,\u0006", "", "@db6m,(^(\u0003\u0005g:", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z\u0016<QX;U?-\u0019rjG\\", "EhSA[", "6dX4[;", "3wc?T*M=&\u0003zg;x\u00183o\t\t\tJ\t~\u0017Vk\r8\u0006!", "3mR<W,=7!z|^", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "5dc\u0013b9<S\u0006\t\nZ;|\b\u0013n\u0011(\tO\u0001\u0016vZs\u000f&\u0004)5b\r\u001cFq 7", "@nc.g0H\\\u0003\n\nb6\u0006\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z =IR?u=\b weC\u0010q\u0002", "5dc\u001fb;:b\u001d\t\u0004:5~\u0010/", "5dc b-Me\u0015\fzG<\u0005\t<a\u000f2\t", "@db6m0GUx\bv[3|\b", "", "5dc!e(Ga\u001a\t\bf(\f\r9ng$\u000bM\u0005*", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "5dc!e(Ga\u001a\t\bf(\f\r9ng$\u000bM\u0005*wTy\u0016 \u007f65f\r 6M)2N", "=qX2a;:b\u001d\t\u0004", "7r4E\\-(`\u001d~\u0004m(\f\r9n[/\u0003J\u0013\u0017\u0016", "3wX3B9BS\"\u000evm0\u0007\u0012", "7rA<g(MW#\bVg.\u0004\t\u000bl\u00072\u000e@\u007f", "2dV?X,L", "@nd;W\u0015N[\u0019\fvm6\n", ";`g\u001fT;B]", "@nd;W\u001cI4&zxm0\u0007\u0012", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JpegTranscoderUtils {
    public static final int DEFAULT_JPEG_QUALITY = 85;
    private static final int FULL_ROUND = 360;
    public static final JpegTranscoderUtils INSTANCE = new JpegTranscoderUtils();
    public static final ImmutableList<Integer> INVERTED_EXIF_ORIENTATIONS;
    public static final int MAX_QUALITY = 100;
    public static final int MAX_SCALE_NUMERATOR = 16;
    public static final int MIN_QUALITY = 0;
    public static final int MIN_SCALE_NUMERATOR = 1;
    public static final int SCALE_DENOMINATOR = 8;

    static {
        ImmutableList<Integer> immutableListOf = ImmutableList.of((Object[]) new Integer[]{2, 7, 4, 5});
        Intrinsics.checkNotNullExpressionValue(immutableListOf, "of(\n          ExifInterf…ce.ORIENTATION_TRANSPOSE)");
        INVERTED_EXIF_ORIENTATIONS = immutableListOf;
    }

    private JpegTranscoderUtils() {
    }

    @JvmStatic
    public static final int calculateDownsampleNumerator(int i2) {
        return Math.max(1, 8 / i2);
    }

    @JvmStatic
    public static final float determineResizeRatio(ResizeOptions resizeOptions, int i2, int i3) {
        if (resizeOptions == null) {
            return 1.0f;
        }
        float f2 = i2;
        float f3 = i3;
        float fMax = Math.max(resizeOptions.width / f2, resizeOptions.height / f3);
        if (f2 * fMax > resizeOptions.maxBitmapSize) {
            fMax = resizeOptions.maxBitmapSize / f2;
        }
        return f3 * fMax > resizeOptions.maxBitmapSize ? resizeOptions.maxBitmapSize / f3 : fMax;
    }

    private final int extractOrientationFromMetadata(EncodedImage encodedImage) {
        int rotationAngle = encodedImage.getRotationAngle();
        if (rotationAngle == 90 || rotationAngle == 180 || rotationAngle == 270) {
            return encodedImage.getRotationAngle();
        }
        return 0;
    }

    public static /* synthetic */ void getDEFAULT_JPEG_QUALITY$annotations() {
    }

    @JvmStatic
    public static final int getForceRotatedInvertedExifOrientation(RotationOptions rotationOptions, EncodedImage encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int exifOrientation = encodedImage.getExifOrientation();
        ImmutableList<Integer> immutableList = INVERTED_EXIF_ORIENTATIONS;
        int iIndexOf = immutableList.indexOf(Integer.valueOf(exifOrientation));
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations".toString());
        }
        Integer num = immutableList.get((iIndexOf + ((!rotationOptions.useImageMetadata() ? rotationOptions.getForcedAngle() : 0) / 90)) % immutableList.size());
        Intrinsics.checkNotNullExpressionValue(num, "INVERTED_EXIF_ORIENTATIO…D_EXIF_ORIENTATIONS.size]");
        return num.intValue();
    }

    @JvmStatic
    public static final int getRotationAngle(RotationOptions rotationOptions, EncodedImage encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!rotationOptions.rotationEnabled()) {
            return 0;
        }
        int iExtractOrientationFromMetadata = INSTANCE.extractOrientationFromMetadata(encodedImage);
        return rotationOptions.useImageMetadata() ? iExtractOrientationFromMetadata : (iExtractOrientationFromMetadata + rotationOptions.getForcedAngle()) % 360;
    }

    @JvmStatic
    public static final int getSoftwareNumerator(RotationOptions rotationOptions, ResizeOptions resizeOptions, EncodedImage encodedImage, boolean z2) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!z2 || resizeOptions == null) {
            return 8;
        }
        int rotationAngle = getRotationAngle(rotationOptions, encodedImage);
        int forceRotatedInvertedExifOrientation = INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.getExifOrientation())) ? getForceRotatedInvertedExifOrientation(rotationOptions, encodedImage) : 0;
        boolean z3 = rotationAngle == 90 || rotationAngle == 270 || forceRotatedInvertedExifOrientation == 5 || forceRotatedInvertedExifOrientation == 7;
        int iRoundNumerator = roundNumerator(determineResizeRatio(resizeOptions, z3 ? encodedImage.getHeight() : encodedImage.getWidth(), z3 ? encodedImage.getWidth() : encodedImage.getHeight()), resizeOptions.roundUpFraction);
        if (iRoundNumerator > 8) {
            return 8;
        }
        if (iRoundNumerator < 1) {
            return 1;
        }
        return iRoundNumerator;
    }

    @JvmStatic
    public static final Matrix getTransformationMatrix(EncodedImage encodedImage, RotationOptions rotationOptions) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        if (INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.getExifOrientation()))) {
            return INSTANCE.getTransformationMatrixFromInvertedExif(getForceRotatedInvertedExifOrientation(rotationOptions, encodedImage));
        }
        int rotationAngle = getRotationAngle(rotationOptions, encodedImage);
        if (rotationAngle == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(rotationAngle);
        return matrix;
    }

    private final Matrix getTransformationMatrixFromInvertedExif(int i2) {
        Matrix matrix = new Matrix();
        if (i2 == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i2 == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i2 == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else {
            if (i2 != 5) {
                return null;
            }
            matrix.setRotate(90.0f);
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    @JvmStatic
    public static final boolean isExifOrientationAllowed(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    @JvmStatic
    public static final boolean isRotationAngleAllowed(int i2) {
        return i2 >= 0 && i2 <= 270 && i2 % 90 == 0;
    }

    @JvmStatic
    public static final int roundNumerator(float f2, float f3) {
        return (int) (f3 + (f2 * 8));
    }
}
