package com.facebook.imagepipeline.transcoder;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import com.facebook.common.logging.FLog;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.OutputStream;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\r(4\u0012}\u0007njG<LeN0ZS@\u000fsڔ<$q$yّCU0}*\tUNog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4կ]xs\u0012\u00172HpG3coE9fuLӌ>OR8(\u00049\u0019G\t#\u0007~QK$\u0012^A\u0001>`\u000fe\u0005H\u0015ĂB \u000f\"%\n\\?`l\f;_'\u0011sZNUj`\u0003[\u0019^V=\f%nN1NEM\u0017;R1\u0016\u0019o\b\u0011M\u0002U\u0005\u0017(W/W\u0005o6\u0007\u0012Z)so\u001bp\u000b&\u000b\b\u0002d\u001a1CO\u0012V\u0001\u00126\u0004\u0013{;I4\u0014\u00145`0C\u0019\u0015\u0017T3=@aTh\u0002\rW0~o@/%.>[=)|iai0~=\n\u0011% 9\u007f\u001d.\fZ\u001cn-\u001djv\u007f@\u0002FK`f\fo<\u001c\u0016!h\u0010C\u001c2]~]~A4%?O]O\"O\u0007H\\זkv\u0013|9ewW`@Ptl֊lÁ\u0010`Lߟ\u001dmV[f4aY*V\u001f}6\u0016vςy˶%%\u0018ʚ twje]8&\u0006ό9֍rk\u0016ãߓbQ"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u00171?s?%\u0015Li5\tc\u001b[r0UJX+\\_H", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017'Cg6\u001e\u0004u]B\u0015a6Mv4\u001d", "@db6m0GUx\bv[3|\b", "", ";`g\u000f\\;FO$l~s,", "", "uY8uI", "7cT;g0?W\u0019\f", "", "5dc\u0016W,Gb\u001d\u007f~^9", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1`]\u001fX:Bh\u0019", "3mR<W,=7!z|^", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "@nc.g0H\\\u0003\n\nb6\u0006\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z =IR?u=\b weC\u0010q\u0002", "@db6m,(^(\u0003\u0005g:", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z\u0016<QX;U?-\u0019rjG\\", "1`]!e(Ga\u0017\ty^", "7lP4X\rH`!z\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\u0004", "5dc T4IZ\u0019l~s,", "BqP;f*HR\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017'Cg6\u001e\u0004u]B\u0015a6Mv\u0014GZ^3k(", "=tc=h;,b&~vf", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "=tc=h;\u001f]&\u0007vm", "?tP9\\;R", "1n[<e\u001aIO\u0017~", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$\u0005Rk\f<L", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@)=U\u007f \u0001M\u001f,WB;j\u0018&\u0011ja\u000fmh(_rpKV\u0018\u0016la}M#\u007fi\u001bN'\u0015Z@?.v\u000e8\u001b\u0006,F\fEnJ\u0010\u001e\n7j{Fa\u0010N}\u001eu\u000b'rNai\u0003\u0011.Oq&s\u0010i&FEI(\u001ez'pON8\u0012ET\rpRvqqMb~@ @mfJPo\\@}'hI\u0006\u007f\u001a<a>\u0018t;\bI* o\u0014Oq!L4_\u00136d\u000b(\"4<\u0010IUi?pF\nj\u001fb\u0012\u001bj1@bIm_J\u000fgg$c1p5g<N\u0017:\u0013v\u00110HH&d\t\u0015\u000b\u00071CLEL\u001aa\u000b\u001eo\u000e$l\r\u000e\u0006j\u0016*wsG`\u0019u\u0018j3K\u0013^,\u001f\n\u0006a\r\u0016lF\u0010jU|a!s,2z\u0011T%>KCz[C9\u001f#0\n\u0019|'riOC\u001a\u001b!'=HE^i=\tqR\"\u0006gF,&<\u0007", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SimpleImageTranscoder implements ImageTranscoder {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SimpleImageTranscoder";
    private final String identifier = TAG;
    private final int maxBitmapSize;
    private final boolean resizingEnabled;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjO0L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u0019]Q\u007fg\u001dN\u000b\u0011Q\u0014\u001e\u0018\u000fiZO\u001cx.\u001e\u001d3Zom5$ڑ\u0010˃dt>ӌڼ6)"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u00171?s?%\u0015Li5\tc\u001b[r0UJX+\\_1\u001b\u001e\u001ae\nW/\u0017\u000e/", "", "u(E", "\"@6", "", "5dc\u001ch;Ic(_\u0005k4x\u0018", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018D\u000225g\f\u0001Az\u001e*\\\u0019", "4na:T;", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\u0004", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap.CompressFormat getOutputFormat(ImageFormat imageFormat) {
            if (imageFormat != null && imageFormat != DefaultImageFormats.JPEG) {
                return imageFormat == DefaultImageFormats.PNG ? Bitmap.CompressFormat.PNG : DefaultImageFormats.isStaticWebpFormat(imageFormat) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
            }
            return Bitmap.CompressFormat.JPEG;
        }
    }

    public SimpleImageTranscoder(boolean z2, int i2) {
        this.resizingEnabled = z2;
        this.maxBitmapSize = i2;
    }

    private final int getSampleSize(EncodedImage encodedImage, RotationOptions rotationOptions, ResizeOptions resizeOptions) {
        if (this.resizingEnabled) {
            return DownsampleUtil.determineSampleSize(rotationOptions, resizeOptions, encodedImage, this.maxBitmapSize);
        }
        return 1;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public boolean canResize(EncodedImage encodedImage, RotationOptions rotationOptions, ResizeOptions resizeOptions) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.Companion.autoRotate();
        }
        return this.resizingEnabled && DownsampleUtil.determineSampleSize(rotationOptions, resizeOptions, encodedImage, this.maxBitmapSize) > 1;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public boolean canTranscode(ImageFormat imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == DefaultImageFormats.HEIF || imageFormat == DefaultImageFormats.JPEG;
    }

    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public String getIdentifier() {
        return this.identifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.graphics.BitmapFactory$Options] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.graphics.Bitmap] */
    @Override // com.facebook.imagepipeline.transcoder.ImageTranscoder
    public ImageTranscodeResult transcode(EncodedImage encodedImage, OutputStream outputStream, RotationOptions rotationOptions, ResizeOptions resizeOptions, ImageFormat imageFormat, Integer num, ColorSpace colorSpace) throws Throwable {
        SimpleImageTranscoder simpleImageTranscoder;
        Bitmap bitmap;
        ImageTranscodeResult imageTranscodeResult;
        RotationOptions rotationOptionsAutoRotate = rotationOptions;
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        if (num == null) {
            num = 85;
        }
        if (rotationOptionsAutoRotate == null) {
            rotationOptionsAutoRotate = RotationOptions.Companion.autoRotate();
            simpleImageTranscoder = this;
        } else {
            simpleImageTranscoder = this;
        }
        int sampleSize = simpleImageTranscoder.getSampleSize(encodedImage, rotationOptionsAutoRotate, resizeOptions);
        Bitmap options = new BitmapFactory.Options();
        ((BitmapFactory.Options) options).inSampleSize = sampleSize;
        if (colorSpace != null) {
            ((BitmapFactory.Options) options).inPreferredColorSpace = colorSpace;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.getInputStream(), null, options);
            if (bitmapDecodeStream == null) {
                FLog.e(TAG, "Couldn't decode the EncodedImage InputStream ! ");
                return new ImageTranscodeResult(2);
            }
            Matrix transformationMatrix = JpegTranscoderUtils.getTransformationMatrix(encodedImage, rotationOptionsAutoRotate);
            try {
                if (transformationMatrix != null) {
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), transformationMatrix, false);
                        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …x,\n                false)");
                        bitmap = bitmapCreateBitmap;
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        bitmap = bitmapDecodeStream;
                        FLog.e(TAG, "Out-Of-Memory during transcode", e);
                        imageTranscodeResult = new ImageTranscodeResult(2);
                        options = bitmap;
                        options.recycle();
                        bitmapDecodeStream.recycle();
                        return imageTranscodeResult;
                    } catch (Throwable th) {
                        th = th;
                        options = bitmapDecodeStream;
                        options.recycle();
                        bitmapDecodeStream.recycle();
                        throw th;
                    }
                } else {
                    bitmap = bitmapDecodeStream;
                }
                try {
                    bitmap.compress(Companion.getOutputFormat(imageFormat), num.intValue(), outputStream);
                    imageTranscodeResult = new ImageTranscodeResult(sampleSize > 1 ? 0 : 1);
                    options = bitmap;
                } catch (OutOfMemoryError e3) {
                    e = e3;
                    FLog.e(TAG, "Out-Of-Memory during transcode", e);
                    imageTranscodeResult = new ImageTranscodeResult(2);
                    options = bitmap;
                }
                options.recycle();
                bitmapDecodeStream.recycle();
                return imageTranscodeResult;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (OutOfMemoryError e4) {
            FLog.e(TAG, "Out-Of-Memory during transcode", e4);
            return new ImageTranscodeResult(2);
        }
    }
}
