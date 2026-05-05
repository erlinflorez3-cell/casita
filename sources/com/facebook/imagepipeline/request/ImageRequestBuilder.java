package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ImageRequestBuilder {
    private static final Set<String> CUSTOM_NETWORK_SCHEMES = new HashSet();
    private int mDelayMs;

    @Nullable
    private RequestListener mRequestListener;

    @Nullable
    private Uri mSourceUri = null;
    private ImageRequest.RequestLevel mLowestPermittedRequestLevel = ImageRequest.RequestLevel.FULL_FETCH;
    private int mCachesDisabled = 0;

    @Nullable
    private ResizeOptions mResizeOptions = null;

    @Nullable
    private RotationOptions mRotationOptions = null;
    private ImageDecodeOptions mImageDecodeOptions = ImageDecodeOptions.defaults();
    private ImageRequest.CacheChoice mCacheChoice = ImageRequest.CacheChoice.DEFAULT;
    private boolean mProgressiveRenderingEnabled = ImagePipelineConfig.getDefaultImageRequestConfig().isProgressiveRenderingEnabled();
    private boolean mLocalThumbnailPreviewsEnabled = false;
    private boolean mLoadThumbnailOnly = false;
    private Priority mRequestPriority = Priority.HIGH;

    @Nullable
    private Postprocessor mPostprocessor = null;

    @Nullable
    private Boolean mDecodePrefetches = null;

    @Nullable
    private BytesRange mBytesRange = null;

    @Nullable
    private Boolean mResizingAllowedOverride = null;

    @Nullable
    private String mDiskCacheId = null;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private ImageRequestBuilder() {
    }

    public static void addCustomUriNetworkScheme(String str) {
        CUSTOM_NETWORK_SCHEMES.add(str);
    }

    public static ImageRequestBuilder fromRequest(ImageRequest imageRequest) {
        return newBuilderWithSource(imageRequest.getSourceUri()).setImageDecodeOptions(imageRequest.getImageDecodeOptions()).setBytesRange(imageRequest.getBytesRange()).setCacheChoice(imageRequest.getCacheChoice()).setLocalThumbnailPreviewsEnabled(imageRequest.getLocalThumbnailPreviewsEnabled()).setLoadThumbnailOnly(imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()).setLowestPermittedRequestLevel(imageRequest.getLowestPermittedRequestLevel()).setCachesDisabled(imageRequest.getCachesDisabled()).setPostprocessor(imageRequest.getPostprocessor()).setProgressiveRenderingEnabled(imageRequest.getProgressiveRenderingEnabled()).setRequestPriority(imageRequest.getPriority()).setResizeOptions(imageRequest.getResizeOptions()).setRequestListener(imageRequest.getRequestListener()).setRotationOptions(imageRequest.getRotationOptions()).setShouldDecodePrefetches(imageRequest.shouldDecodePrefetches()).setDelayMs(imageRequest.getDelayMs()).setDiskCacheId(imageRequest.getDiskCacheId());
    }

    public static boolean isCustomNetworkUri(@Nullable Uri uri) {
        Set<String> set = CUSTOM_NETWORK_SCHEMES;
        if (set != null && uri != null) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                if (it.next().equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ImageRequestBuilder newBuilderWithResourceId(int i2) {
        return newBuilderWithSource(UriUtil.getUriForResourceId(i2));
    }

    public static ImageRequestBuilder newBuilderWithSource(Uri uri) {
        return new ImageRequestBuilder().setSource(uri);
    }

    private ImageRequestBuilder setCachesDisabled(int i2) {
        this.mCachesDisabled = i2;
        if (this.mCacheChoice != ImageRequest.CacheChoice.DYNAMIC) {
            this.mDiskCacheId = null;
        }
        return this;
    }

    public ImageRequest build() {
        validate();
        return new ImageRequest(this);
    }

    public ImageRequestBuilder disableDiskCache() {
        this.mCachesDisabled |= 48;
        return this;
    }

    public ImageRequestBuilder disableMemoryCache() {
        this.mCachesDisabled = (-1) - (((-1) - this.mCachesDisabled) & ((-1) - 15));
        return this;
    }

    @Nullable
    public BytesRange getBytesRange() {
        return this.mBytesRange;
    }

    public ImageRequest.CacheChoice getCacheChoice() {
        return this.mCacheChoice;
    }

    public int getCachesDisabled() {
        return this.mCachesDisabled;
    }

    public int getDelayMs() {
        return this.mDelayMs;
    }

    @Nullable
    public String getDiskCacheId() {
        return this.mDiskCacheId;
    }

    public ImageDecodeOptions getImageDecodeOptions() {
        return this.mImageDecodeOptions;
    }

    public boolean getLoadThumbnailOnly() {
        return this.mLoadThumbnailOnly;
    }

    public ImageRequest.RequestLevel getLowestPermittedRequestLevel() {
        return this.mLowestPermittedRequestLevel;
    }

    @Nullable
    public Postprocessor getPostprocessor() {
        return this.mPostprocessor;
    }

    @Nullable
    public RequestListener getRequestListener() {
        return this.mRequestListener;
    }

    public Priority getRequestPriority() {
        return this.mRequestPriority;
    }

    @Nullable
    public ResizeOptions getResizeOptions() {
        return this.mResizeOptions;
    }

    @Nullable
    public Boolean getResizingAllowedOverride() {
        return this.mResizingAllowedOverride;
    }

    @Nullable
    public RotationOptions getRotationOptions() {
        return this.mRotationOptions;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public boolean isDiskCacheEnabled() {
        int i2 = this.mCachesDisabled;
        return (i2 + 48) - (i2 | 48) == 0 && (UriUtil.isNetworkUri(this.mSourceUri) || isCustomNetworkUri(this.mSourceUri));
    }

    public boolean isLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    public boolean isMemoryCacheEnabled() {
        return (this.mCachesDisabled & 15) == 0;
    }

    public boolean isProgressiveRenderingEnabled() {
        return this.mProgressiveRenderingEnabled;
    }

    @Deprecated
    public ImageRequestBuilder setAutoRotateEnabled(boolean z2) {
        return z2 ? setRotationOptions(RotationOptions.autoRotate()) : setRotationOptions(RotationOptions.disableRotation());
    }

    public ImageRequestBuilder setBytesRange(@Nullable BytesRange bytesRange) {
        this.mBytesRange = bytesRange;
        return this;
    }

    public ImageRequestBuilder setCacheChoice(ImageRequest.CacheChoice cacheChoice) {
        this.mCacheChoice = cacheChoice;
        return this;
    }

    public ImageRequestBuilder setDelayMs(int i2) {
        this.mDelayMs = i2;
        return this;
    }

    public ImageRequestBuilder setDiskCacheId(@Nullable String str) {
        this.mDiskCacheId = str;
        return this;
    }

    public ImageRequestBuilder setImageDecodeOptions(ImageDecodeOptions imageDecodeOptions) {
        this.mImageDecodeOptions = imageDecodeOptions;
        return this;
    }

    public ImageRequestBuilder setLoadThumbnailOnly(boolean z2) {
        this.mLoadThumbnailOnly = z2;
        return this;
    }

    public ImageRequestBuilder setLocalThumbnailPreviewsEnabled(boolean z2) {
        this.mLocalThumbnailPreviewsEnabled = z2;
        return this;
    }

    public ImageRequestBuilder setLowestPermittedRequestLevel(ImageRequest.RequestLevel requestLevel) {
        this.mLowestPermittedRequestLevel = requestLevel;
        return this;
    }

    public ImageRequestBuilder setPostprocessor(@Nullable Postprocessor postprocessor) {
        this.mPostprocessor = postprocessor;
        return this;
    }

    public ImageRequestBuilder setProgressiveRenderingEnabled(boolean z2) {
        this.mProgressiveRenderingEnabled = z2;
        return this;
    }

    public ImageRequestBuilder setRequestListener(@Nullable RequestListener requestListener) {
        this.mRequestListener = requestListener;
        return this;
    }

    public ImageRequestBuilder setRequestPriority(Priority priority) {
        this.mRequestPriority = priority;
        return this;
    }

    public ImageRequestBuilder setResizeOptions(@Nullable ResizeOptions resizeOptions) {
        this.mResizeOptions = resizeOptions;
        return this;
    }

    public ImageRequestBuilder setResizingAllowedOverride(@Nullable Boolean bool) {
        this.mResizingAllowedOverride = bool;
        return this;
    }

    public ImageRequestBuilder setRotationOptions(@Nullable RotationOptions rotationOptions) {
        this.mRotationOptions = rotationOptions;
        return this;
    }

    public ImageRequestBuilder setShouldDecodePrefetches(@Nullable Boolean bool) {
        this.mDecodePrefetches = bool;
        return this;
    }

    public ImageRequestBuilder setSource(Uri uri) {
        Preconditions.checkNotNull(uri);
        this.mSourceUri = uri;
        return this;
    }

    @Nullable
    public Boolean shouldDecodePrefetches() {
        return this.mDecodePrefetches;
    }

    protected void validate() {
        Uri uri = this.mSourceUri;
        if (uri == null) {
            throw new BuilderException("Source must be set!");
        }
        if (UriUtil.isLocalResourceUri(uri)) {
            if (!this.mSourceUri.isAbsolute()) {
                throw new BuilderException("Resource URI path must be absolute.");
            }
            if (this.mSourceUri.getPath().isEmpty()) {
                throw new BuilderException("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.mSourceUri.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new BuilderException("Resource URI path must be a resource id.");
            }
        }
        if (UriUtil.isLocalAssetUri(this.mSourceUri) && !this.mSourceUri.isAbsolute()) {
            throw new BuilderException("Asset URI path must be absolute.");
        }
        if (this.mCacheChoice == ImageRequest.CacheChoice.DYNAMIC) {
            if (this.mDiskCacheId == null) {
                throw new BuilderException("Disk cache id must be set for dynamic cache choice");
            }
        } else {
            String str = this.mDiskCacheId;
            if (str != null && str.length() != 0) {
                throw new BuilderException("Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC");
            }
        }
    }
}
