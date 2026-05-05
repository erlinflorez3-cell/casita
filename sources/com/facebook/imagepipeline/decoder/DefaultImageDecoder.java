package com.facebook.imagepipeline.decoder;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.Suppliers;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.imagepipeline.transformation.CircularTransformation;
import com.facebook.imagepipeline.transformation.TransformationUtils;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultImageDecoder implements ImageDecoder {

    @Nullable
    private final ImageDecoder mAnimatedGifDecoder;

    @Nullable
    private final ImageDecoder mAnimatedWebPDecoder;

    @Nullable
    private final Map<ImageFormat, ImageDecoder> mCustomDecoders;
    private final ImageDecoder mDefaultDecoder;
    private final Supplier<Boolean> mEnableEncodedImageColorSpaceUsage;
    private final PlatformDecoder mPlatformDecoder;

    public DefaultImageDecoder(@Nullable ImageDecoder imageDecoder, @Nullable ImageDecoder imageDecoder2, PlatformDecoder platformDecoder) {
        this(imageDecoder, imageDecoder2, platformDecoder, null);
    }

    public DefaultImageDecoder(@Nullable ImageDecoder imageDecoder, @Nullable ImageDecoder imageDecoder2, PlatformDecoder platformDecoder, @Nullable Map<ImageFormat, ImageDecoder> map) {
        this.mDefaultDecoder = new ImageDecoder() { // from class: com.facebook.imagepipeline.decoder.DefaultImageDecoder.1
            @Override // com.facebook.imagepipeline.decoder.ImageDecoder
            @Nullable
            public CloseableImage decode(EncodedImage encodedImage, int i2, QualityInfo qualityInfo, ImageDecodeOptions imageDecodeOptions) {
                ImageFormat imageFormat = encodedImage.getImageFormat();
                ColorSpace colorSpace = (((Boolean) DefaultImageDecoder.this.mEnableEncodedImageColorSpaceUsage.get()).booleanValue() && imageDecodeOptions.colorSpace == null) ? encodedImage.getColorSpace() : imageDecodeOptions.colorSpace;
                if (imageFormat == DefaultImageFormats.JPEG) {
                    return DefaultImageDecoder.this.decodeJpeg(encodedImage, i2, qualityInfo, imageDecodeOptions, colorSpace);
                }
                if (imageFormat == DefaultImageFormats.GIF) {
                    return DefaultImageDecoder.this.decodeGif(encodedImage, i2, qualityInfo, imageDecodeOptions);
                }
                if (imageFormat == DefaultImageFormats.WEBP_ANIMATED) {
                    return DefaultImageDecoder.this.decodeAnimatedWebp(encodedImage, i2, qualityInfo, imageDecodeOptions);
                }
                if (imageFormat != ImageFormat.UNKNOWN) {
                    return DefaultImageDecoder.this.decodeStaticImage(encodedImage, imageDecodeOptions);
                }
                throw new DecodeException("unknown image format", encodedImage);
            }
        };
        this.mAnimatedGifDecoder = imageDecoder;
        this.mAnimatedWebPDecoder = imageDecoder2;
        this.mPlatformDecoder = platformDecoder;
        this.mCustomDecoders = map;
        this.mEnableEncodedImageColorSpaceUsage = Suppliers.BOOLEAN_FALSE;
    }

    public DefaultImageDecoder(@Nullable ImageDecoder imageDecoder, @Nullable ImageDecoder imageDecoder2, PlatformDecoder platformDecoder, @Nullable Map<ImageFormat, ImageDecoder> map, Supplier<Boolean> supplier) {
        this.mDefaultDecoder = new ImageDecoder() { // from class: com.facebook.imagepipeline.decoder.DefaultImageDecoder.1
            @Override // com.facebook.imagepipeline.decoder.ImageDecoder
            @Nullable
            public CloseableImage decode(EncodedImage encodedImage, int i2, QualityInfo qualityInfo, ImageDecodeOptions imageDecodeOptions) {
                ImageFormat imageFormat = encodedImage.getImageFormat();
                ColorSpace colorSpace = (((Boolean) DefaultImageDecoder.this.mEnableEncodedImageColorSpaceUsage.get()).booleanValue() && imageDecodeOptions.colorSpace == null) ? encodedImage.getColorSpace() : imageDecodeOptions.colorSpace;
                if (imageFormat == DefaultImageFormats.JPEG) {
                    return DefaultImageDecoder.this.decodeJpeg(encodedImage, i2, qualityInfo, imageDecodeOptions, colorSpace);
                }
                if (imageFormat == DefaultImageFormats.GIF) {
                    return DefaultImageDecoder.this.decodeGif(encodedImage, i2, qualityInfo, imageDecodeOptions);
                }
                if (imageFormat == DefaultImageFormats.WEBP_ANIMATED) {
                    return DefaultImageDecoder.this.decodeAnimatedWebp(encodedImage, i2, qualityInfo, imageDecodeOptions);
                }
                if (imageFormat != ImageFormat.UNKNOWN) {
                    return DefaultImageDecoder.this.decodeStaticImage(encodedImage, imageDecodeOptions);
                }
                throw new DecodeException("unknown image format", encodedImage);
            }
        };
        this.mAnimatedGifDecoder = imageDecoder;
        this.mAnimatedWebPDecoder = imageDecoder2;
        this.mPlatformDecoder = platformDecoder;
        this.mCustomDecoders = map;
        this.mEnableEncodedImageColorSpaceUsage = supplier;
    }

    @Override // com.facebook.imagepipeline.decoder.ImageDecoder
    @Nullable
    public CloseableImage decode(EncodedImage encodedImage, int i2, QualityInfo qualityInfo, ImageDecodeOptions imageDecodeOptions) {
        InputStream inputStream;
        ImageDecoder imageDecoder;
        if (imageDecodeOptions.customImageDecoder != null) {
            return imageDecodeOptions.customImageDecoder.decode(encodedImage, i2, qualityInfo, imageDecodeOptions);
        }
        ImageFormat imageFormat = encodedImage.getImageFormat();
        if ((imageFormat == null || imageFormat == ImageFormat.UNKNOWN) && (inputStream = encodedImage.getInputStream()) != null) {
            imageFormat = ImageFormatChecker.getImageFormat_WrapIOException(inputStream);
            encodedImage.setImageFormat(imageFormat);
        }
        Map<ImageFormat, ImageDecoder> map = this.mCustomDecoders;
        return (map == null || (imageDecoder = map.get(imageFormat)) == null) ? this.mDefaultDecoder.decode(encodedImage, i2, qualityInfo, imageDecodeOptions) : imageDecoder.decode(encodedImage, i2, qualityInfo, imageDecodeOptions);
    }

    @Nullable
    public CloseableImage decodeAnimatedWebp(EncodedImage encodedImage, int i2, QualityInfo qualityInfo, ImageDecodeOptions imageDecodeOptions) {
        ImageDecoder imageDecoder;
        return (imageDecodeOptions.forceStaticImage || (imageDecoder = this.mAnimatedWebPDecoder) == null) ? decodeStaticImage(encodedImage, imageDecodeOptions) : imageDecoder.decode(encodedImage, i2, qualityInfo, imageDecodeOptions);
    }

    @Nullable
    public CloseableImage decodeGif(EncodedImage encodedImage, int i2, QualityInfo qualityInfo, ImageDecodeOptions imageDecodeOptions) {
        ImageDecoder imageDecoder;
        if (encodedImage.getWidth() == -1 || encodedImage.getHeight() == -1) {
            throw new DecodeException("image width or height is incorrect", encodedImage);
        }
        return (imageDecodeOptions.forceStaticImage || (imageDecoder = this.mAnimatedGifDecoder) == null) ? decodeStaticImage(encodedImage, imageDecodeOptions) : imageDecoder.decode(encodedImage, i2, qualityInfo, imageDecodeOptions);
    }

    public CloseableStaticBitmap decodeJpeg(EncodedImage encodedImage, int i2, QualityInfo qualityInfo, ImageDecodeOptions imageDecodeOptions, @Nullable ColorSpace colorSpace) {
        CloseableReference<Bitmap> closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace = this.mPlatformDecoder.decodeJPEGFromEncodedImageWithColorSpace(encodedImage, imageDecodeOptions.bitmapConfig, null, i2, colorSpace);
        try {
            boolean zMaybeApplyTransformation = TransformationUtils.maybeApplyTransformation(imageDecodeOptions.bitmapTransformation, closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace);
            Preconditions.checkNotNull(closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace);
            CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace, qualityInfo, encodedImage.getRotationAngle(), encodedImage.getExifOrientation());
            closeableStaticBitmapOf.putExtra("is_rounded", Boolean.valueOf(zMaybeApplyTransformation && (imageDecodeOptions.bitmapTransformation instanceof CircularTransformation)));
            return closeableStaticBitmapOf;
        } finally {
            CloseableReference.closeSafely(closeableReferenceDecodeJPEGFromEncodedImageWithColorSpace);
        }
    }

    public CloseableStaticBitmap decodeStaticImage(EncodedImage encodedImage, ImageDecodeOptions imageDecodeOptions) {
        CloseableReference<Bitmap> closeableReferenceDecodeFromEncodedImageWithColorSpace = this.mPlatformDecoder.decodeFromEncodedImageWithColorSpace(encodedImage, imageDecodeOptions.bitmapConfig, null, imageDecodeOptions.colorSpace);
        try {
            boolean zMaybeApplyTransformation = TransformationUtils.maybeApplyTransformation(imageDecodeOptions.bitmapTransformation, closeableReferenceDecodeFromEncodedImageWithColorSpace);
            Preconditions.checkNotNull(closeableReferenceDecodeFromEncodedImageWithColorSpace);
            CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(closeableReferenceDecodeFromEncodedImageWithColorSpace, ImmutableQualityInfo.FULL_QUALITY, encodedImage.getRotationAngle(), encodedImage.getExifOrientation());
            closeableStaticBitmapOf.putExtra("is_rounded", Boolean.valueOf(zMaybeApplyTransformation && (imageDecodeOptions.bitmapTransformation instanceof CircularTransformation)));
            return closeableStaticBitmapOf;
        } finally {
            CloseableReference.closeSafely(closeableReferenceDecodeFromEncodedImageWithColorSpace);
        }
    }
}
