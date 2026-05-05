package com.facebook.fresco.ui.common;

import com.facebook.common.internal.Objects;
import com.facebook.fresco.ui.common.ControllerListener2;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ImagePerfData {
    public static final int UNSET = -1;

    @Nullable
    private final Object mCallerContext;
    private final long mControllerCancelTimeMs;
    private final long mControllerFailureTimeMs;
    private final long mControllerFinalImageSetTimeMs;

    @Nullable
    private final String mControllerId;
    private final long mControllerIntermediateImageSetTimeMs;
    private final long mControllerSubmitTimeMs;

    @Nullable
    private final DimensionsInfo mDimensionsInfo;

    @Nullable
    private final Throwable mErrorThrowable;

    @Nullable
    private ControllerListener2.Extras mExtraData;
    private final long mImageDrawTimeMs;

    @Nullable
    private final Object mImageInfo;

    @Nullable
    private final Object mImageRequest;
    private final long mImageRequestEndTimeMs;
    private final long mImageRequestStartTimeMs;
    private final long mInvisibilityEventTimeMs;
    private final boolean mIsPrefetch;
    private final int mOnScreenHeightPx;
    private final int mOnScreenWidthPx;

    @Nullable
    private final String mRequestId;
    private final long mVisibilityEventTimeMs;
    private final VisibilityState mVisibilityState;

    public ImagePerfData(@Nullable String str, @Nullable String str2, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z2, int i2, int i3, @Nullable Throwable th, VisibilityState visibilityState, long j9, long j10, long j11, @Nullable DimensionsInfo dimensionsInfo, @Nullable ControllerListener2.Extras extras) {
        this.mControllerId = str;
        this.mRequestId = str2;
        this.mImageRequest = obj;
        this.mCallerContext = obj2;
        this.mImageInfo = obj3;
        this.mControllerSubmitTimeMs = j2;
        this.mControllerIntermediateImageSetTimeMs = j3;
        this.mControllerFinalImageSetTimeMs = j4;
        this.mControllerFailureTimeMs = j5;
        this.mControllerCancelTimeMs = j6;
        this.mImageRequestStartTimeMs = j7;
        this.mImageRequestEndTimeMs = j8;
        this.mIsPrefetch = z2;
        this.mOnScreenWidthPx = i2;
        this.mOnScreenHeightPx = i3;
        this.mErrorThrowable = th;
        this.mVisibilityState = visibilityState;
        this.mVisibilityEventTimeMs = j9;
        this.mInvisibilityEventTimeMs = j10;
        this.mImageDrawTimeMs = j11;
        this.mDimensionsInfo = dimensionsInfo;
        this.mExtraData = extras;
    }

    public String createDebugString() {
        return Objects.toStringHelper(this).add("controller ID", this.mControllerId).add("request ID", this.mRequestId).add("controller submit", this.mControllerSubmitTimeMs).add("controller final image", this.mControllerFinalImageSetTimeMs).add("controller failure", this.mControllerFailureTimeMs).add("controller cancel", this.mControllerCancelTimeMs).add("start time", this.mImageRequestStartTimeMs).add("end time", this.mImageRequestEndTimeMs).add("prefetch", this.mIsPrefetch).add("caller context", this.mCallerContext).add("image request", this.mImageRequest).add("image info", this.mImageInfo).add("on-screen width", this.mOnScreenWidthPx).add("on-screen height", this.mOnScreenHeightPx).add("visibility state", this.mVisibilityState).add("visibility event", this.mVisibilityEventTimeMs).add("invisibility event", this.mInvisibilityEventTimeMs).add("image draw event", this.mImageDrawTimeMs).add("dimensions info", this.mDimensionsInfo).add("extra data", this.mExtraData).toString();
    }

    @Nullable
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public long getControllerFailureTimeMs() {
        return this.mControllerFailureTimeMs;
    }

    public long getControllerFinalImageSetTimeMs() {
        return this.mControllerFinalImageSetTimeMs;
    }

    @Nullable
    public String getControllerId() {
        return this.mControllerId;
    }

    public long getControllerIntermediateImageSetTimeMs() {
        return this.mControllerIntermediateImageSetTimeMs;
    }

    public long getControllerSubmitTimeMs() {
        return this.mControllerSubmitTimeMs;
    }

    @Nullable
    public DimensionsInfo getDimensionsInfo() {
        return this.mDimensionsInfo;
    }

    @Nullable
    public Throwable getErrorThrowable() {
        return this.mErrorThrowable;
    }

    @Nullable
    public ControllerListener2.Extras getExtraData() {
        return this.mExtraData;
    }

    public long getFinalImageLoadTimeMs() {
        if (getImageRequestEndTimeMs() == -1 || getImageRequestStartTimeMs() == -1) {
            return -1L;
        }
        return getImageRequestEndTimeMs() - getImageRequestStartTimeMs();
    }

    public long getImageDrawTimeMs() {
        return this.mImageDrawTimeMs;
    }

    @Nullable
    public Object getImageInfo() {
        return this.mImageInfo;
    }

    @Nullable
    public Object getImageRequest() {
        return this.mImageRequest;
    }

    public long getImageRequestEndTimeMs() {
        return this.mImageRequestEndTimeMs;
    }

    public long getImageRequestStartTimeMs() {
        return this.mImageRequestStartTimeMs;
    }

    public long getIntermediateImageLoadTimeMs() {
        return this.mControllerIntermediateImageSetTimeMs;
    }

    public long getInvisibilityEventTimeMs() {
        return this.mInvisibilityEventTimeMs;
    }

    public int getOnScreenHeightPx() {
        return this.mOnScreenHeightPx;
    }

    public int getOnScreenWidthPx() {
        return this.mOnScreenWidthPx;
    }

    @Nullable
    public String getRequestId() {
        return this.mRequestId;
    }

    public long getVisibilityEventTimeMs() {
        return this.mVisibilityEventTimeMs;
    }

    public VisibilityState getVisibilityState() {
        return this.mVisibilityState;
    }

    public boolean isPrefetch() {
        return this.mIsPrefetch;
    }

    public void setExtraData(ControllerListener2.Extras extras) {
        this.mExtraData = extras;
    }
}
