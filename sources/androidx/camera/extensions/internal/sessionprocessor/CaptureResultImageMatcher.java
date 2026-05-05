package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class CaptureResultImageMatcher {
    private static final int INVALID_TIMESTAMP = -1;
    ImageReferenceListener mImageReferenceListener;
    private final Object mLock = new Object();
    private final LongSparseArray<List<TotalCaptureResult>> mPendingCaptureResults = new LongSparseArray<>();
    Map<TotalCaptureResult, Integer> mCaptureStageIdMap = new HashMap();
    private final LongSparseArray<List<ImageReference>> mPendingImages = new LongSparseArray<>();

    interface ImageReferenceListener {
        void onImageReferenceIncoming(ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i2);
    }

    CaptureResultImageMatcher() {
    }

    void clear() {
        synchronized (this.mLock) {
            this.mPendingCaptureResults.clear();
            for (int i2 = 0; i2 < this.mPendingImages.size(); i2++) {
                Iterator<ImageReference> it = this.mPendingImages.get(this.mPendingImages.keyAt(i2)).iterator();
                while (it.hasNext()) {
                    it.next().decrement();
                }
            }
            this.mPendingImages.clear();
            this.mCaptureStageIdMap.clear();
        }
    }

    void setImageReferenceListener(ImageReferenceListener imageReferenceListener) {
        synchronized (this.mLock) {
            this.mImageReferenceListener = imageReferenceListener;
        }
    }

    void clearImageReferenceListener() {
        synchronized (this.mLock) {
            this.mImageReferenceListener = null;
        }
    }

    void imageIncoming(ImageReference imageReference) {
        synchronized (this.mLock) {
            addToList(this.mPendingImages, imageReference.get().getTimestamp(), imageReference);
        }
        matchImages();
    }

    private <T> void addToList(LongSparseArray<List<T>> longSparseArray, long j2, T t2) {
        List<T> arrayList = longSparseArray.get(j2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            longSparseArray.put(j2, arrayList);
        }
        arrayList.add(t2);
    }

    private <T> void removeFromList(LongSparseArray<List<T>> longSparseArray, long j2, T t2) {
        List<T> list = longSparseArray.get(j2);
        if (list != null) {
            list.remove(t2);
            if (list.isEmpty()) {
                longSparseArray.remove(j2);
            }
        }
    }

    void captureResultIncoming(TotalCaptureResult totalCaptureResult) {
        captureResultIncoming(totalCaptureResult, 0);
    }

    void captureResultIncoming(TotalCaptureResult totalCaptureResult, int i2) {
        synchronized (this.mLock) {
            long timeStampFromCaptureResult = getTimeStampFromCaptureResult(totalCaptureResult);
            if (timeStampFromCaptureResult == -1) {
                return;
            }
            addToList(this.mPendingCaptureResults, timeStampFromCaptureResult, totalCaptureResult);
            this.mCaptureStageIdMap.put(totalCaptureResult, Integer.valueOf(i2));
            matchImages();
        }
    }

    private long getTimeStampFromCaptureResult(TotalCaptureResult totalCaptureResult) {
        Long l2 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l2 != null) {
            return l2.longValue();
        }
        return -1L;
    }

    private void notifyImage(ImageReference imageReference, TotalCaptureResult totalCaptureResult) {
        ImageReferenceListener imageReferenceListener;
        Integer num;
        synchronized (this.mLock) {
            imageReferenceListener = this.mImageReferenceListener;
            if (imageReferenceListener != null) {
                num = this.mCaptureStageIdMap.get(totalCaptureResult);
            } else {
                imageReference.decrement();
                imageReferenceListener = null;
                num = null;
            }
        }
        if (imageReferenceListener != null) {
            imageReferenceListener.onImageReferenceIncoming(imageReference, totalCaptureResult, num.intValue());
        }
    }

    private void removeStaleData() {
        synchronized (this.mLock) {
            if (this.mPendingImages.size() == 0 || this.mPendingCaptureResults.size() == 0) {
                return;
            }
            Long lValueOf = Long.valueOf(this.mPendingImages.keyAt(0));
            Long lValueOf2 = Long.valueOf(this.mPendingCaptureResults.keyAt(0));
            Preconditions.checkArgument(!lValueOf2.equals(lValueOf));
            if (lValueOf2.longValue() > lValueOf.longValue()) {
                for (int size = this.mPendingImages.size() - 1; size >= 0; size--) {
                    if (this.mPendingImages.keyAt(size) < lValueOf2.longValue()) {
                        Iterator<ImageReference> it = this.mPendingImages.valueAt(size).iterator();
                        while (it.hasNext()) {
                            it.next().decrement();
                        }
                        this.mPendingImages.removeAt(size);
                    }
                }
            } else {
                for (int size2 = this.mPendingCaptureResults.size() - 1; size2 >= 0; size2--) {
                    if (this.mPendingCaptureResults.keyAt(size2) < lValueOf.longValue()) {
                        this.mPendingCaptureResults.removeAt(size2);
                    }
                }
            }
        }
    }

    private void matchImages() {
        TotalCaptureResult totalCaptureResult;
        ImageReference imageReference;
        synchronized (this.mLock) {
            int size = this.mPendingCaptureResults.size() - 1;
            while (true) {
                if (size >= 0) {
                    List<TotalCaptureResult> listValueAt = this.mPendingCaptureResults.valueAt(size);
                    if (!listValueAt.isEmpty()) {
                        totalCaptureResult = listValueAt.get(0);
                        long timeStampFromCaptureResult = getTimeStampFromCaptureResult(totalCaptureResult);
                        Preconditions.checkState(timeStampFromCaptureResult == this.mPendingCaptureResults.keyAt(size));
                        List<ImageReference> list = this.mPendingImages.get(timeStampFromCaptureResult);
                        if (list != null && !list.isEmpty()) {
                            imageReference = list.get(0);
                            removeFromList(this.mPendingImages, timeStampFromCaptureResult, imageReference);
                            listValueAt.remove(totalCaptureResult);
                            if (listValueAt.isEmpty()) {
                                this.mPendingCaptureResults.removeAt(size);
                            }
                        }
                    }
                    size--;
                } else {
                    totalCaptureResult = null;
                    imageReference = null;
                    break;
                }
            }
            removeStaleData();
        }
        if (imageReference == null || totalCaptureResult == null) {
            return;
        }
        notifyImage(imageReference, totalCaptureResult);
    }
}
