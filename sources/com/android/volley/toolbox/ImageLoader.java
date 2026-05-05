package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class ImageLoader {
    private final ImageCache mCache;
    private final Handler mHandler;
    private final RequestQueue mRequestQueue;
    private Runnable mRunnable;
    private int mBatchResponseDelayMs = 100;
    private final HashMap<String, BatchedImageRequest> mInFlightRequests = new HashMap<>();
    private final HashMap<String, BatchedImageRequest> mBatchedResponses = new HashMap<>();

    private static class BatchedImageRequest {
        private final List<ImageContainer> mContainers;
        private VolleyError mError;
        private final Request<?> mRequest;
        private Bitmap mResponseBitmap;

        public BatchedImageRequest(Request<?> request, ImageContainer imageContainer) {
            ArrayList arrayList = new ArrayList();
            this.mContainers = arrayList;
            this.mRequest = request;
            arrayList.add(imageContainer);
        }

        public void addContainer(ImageContainer imageContainer) {
            this.mContainers.add(imageContainer);
        }

        public VolleyError getError() {
            return this.mError;
        }

        public boolean removeContainerAndCancelIfNecessary(ImageContainer imageContainer) {
            this.mContainers.remove(imageContainer);
            if (this.mContainers.size() != 0) {
                return false;
            }
            this.mRequest.cancel();
            return true;
        }

        public void setError(VolleyError volleyError) {
            this.mError = volleyError;
        }
    }

    public interface ImageCache {
        Bitmap getBitmap(String str);

        void putBitmap(String str, Bitmap bitmap);
    }

    public class ImageContainer {
        private Bitmap mBitmap;
        private final String mCacheKey;
        private final ImageListener mListener;
        private final String mRequestUrl;

        public ImageContainer(Bitmap bitmap, String str, String str2, ImageListener imageListener) {
            this.mBitmap = bitmap;
            this.mRequestUrl = str;
            this.mCacheKey = str2;
            this.mListener = imageListener;
        }

        public void cancelRequest() throws Throwable {
            Threads.throwIfNotOnMainThread();
            if (this.mListener == null) {
                return;
            }
            BatchedImageRequest batchedImageRequest = (BatchedImageRequest) ImageLoader.this.mInFlightRequests.get(this.mCacheKey);
            if (batchedImageRequest != null) {
                if (batchedImageRequest.removeContainerAndCancelIfNecessary(this)) {
                    ImageLoader.this.mInFlightRequests.remove(this.mCacheKey);
                    return;
                }
                return;
            }
            BatchedImageRequest batchedImageRequest2 = (BatchedImageRequest) ImageLoader.this.mBatchedResponses.get(this.mCacheKey);
            if (batchedImageRequest2 != null) {
                batchedImageRequest2.removeContainerAndCancelIfNecessary(this);
                if (batchedImageRequest2.mContainers.size() == 0) {
                    ImageLoader.this.mBatchedResponses.remove(this.mCacheKey);
                }
            }
        }

        public Bitmap getBitmap() {
            return this.mBitmap;
        }

        public String getRequestUrl() {
            return this.mRequestUrl;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface ImageListener extends Response.ErrorListener {
        void onResponse(ImageContainer imageContainer, boolean z2);
    }

    public ImageLoader(RequestQueue requestQueue, ImageCache imageCache) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Xd("\u0001\u000f\u0006\u0015\u0013\u000e\nT\u0017\u001cWv\u001b\u001c\u001e\u0014\"", (short) (C1607wl.Xd() ^ 26994))).getDeclaredMethod(Wg.vd(";8F\u001e18<\u0019KJJ>J", (short) (C1580rY.Xd() ^ (-13815))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.mRequestQueue = requestQueue;
            this.mCache = imageCache;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void batchResponse(String str, BatchedImageRequest batchedImageRequest) throws Throwable {
        this.mBatchedResponses.put(str, batchedImageRequest);
        if (this.mRunnable == null) {
            Runnable runnable = new Runnable() { // from class: com.android.volley.toolbox.ImageLoader.4
                @Override // java.lang.Runnable
                public void run() {
                    for (BatchedImageRequest batchedImageRequest2 : ImageLoader.this.mBatchedResponses.values()) {
                        for (ImageContainer imageContainer : batchedImageRequest2.mContainers) {
                            if (imageContainer.mListener != null) {
                                if (batchedImageRequest2.getError() == null) {
                                    imageContainer.mBitmap = batchedImageRequest2.mResponseBitmap;
                                    imageContainer.mListener.onResponse(imageContainer, false);
                                } else {
                                    imageContainer.mListener.onErrorResponse(batchedImageRequest2.getError());
                                }
                            }
                        }
                    }
                    ImageLoader.this.mBatchedResponses.clear();
                    ImageLoader.this.mRunnable = null;
                }
            };
            this.mRunnable = runnable;
            Handler handler = this.mHandler;
            long j2 = this.mBatchResponseDelayMs;
            Class<?> cls = Class.forName(Qg.kd("z\u0007{\t\u0005}w@\u0001\u0004=Vnzovnz", (short) (C1633zX.Xd() ^ (-8033)), (short) (C1633zX.Xd() ^ (-32540))));
            Class<?>[] clsArr = {Class.forName(hg.Vd("\u0005z\u000fxD\u0002u\u0002y?b\u0005|{mmvn", (short) (ZN.Xd() ^ 30724), (short) (ZN.Xd() ^ 6112))), Long.TYPE};
            Object[] objArr = {runnable, Long.valueOf(j2)};
            Method method = cls.getMethod(C1561oA.ud("SQTT#CI=T?=", (short) (C1633zX.Xd() ^ (-18148))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private static String getCacheKey(String str, int i2, int i3, ImageView.ScaleType scaleType) {
        return new StringBuilder(str.length() + 12).append("#W").append(i2).append("#H").append(i3).append("#S").append(scaleType.ordinal()).append(str).toString();
    }

    public static ImageListener getImageListener(final ImageView imageView, final int i2, final int i3) {
        return new ImageListener() { // from class: com.android.volley.toolbox.ImageLoader.1
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                int i4 = i3;
                if (i4 != 0) {
                    imageView.setImageResource(i4);
                }
            }

            @Override // com.android.volley.toolbox.ImageLoader.ImageListener
            public void onResponse(ImageContainer imageContainer, boolean z2) {
                if (imageContainer.getBitmap() != null) {
                    imageView.setImageBitmap(imageContainer.getBitmap());
                    return;
                }
                int i4 = i2;
                if (i4 != 0) {
                    imageView.setImageResource(i4);
                }
            }
        };
    }

    public ImageContainer get(String str, ImageListener imageListener) {
        return get(str, imageListener, 0, 0);
    }

    public ImageContainer get(String str, ImageListener imageListener, int i2, int i3) {
        return get(str, imageListener, i2, i3, ImageView.ScaleType.CENTER_INSIDE);
    }

    public ImageContainer get(String str, ImageListener imageListener, int i2, int i3, ImageView.ScaleType scaleType) throws Throwable {
        Threads.throwIfNotOnMainThread();
        String cacheKey = getCacheKey(str, i2, i3, scaleType);
        Bitmap bitmap = this.mCache.getBitmap(cacheKey);
        if (bitmap != null) {
            ImageContainer imageContainer = new ImageContainer(bitmap, str, null, null);
            imageListener.onResponse(imageContainer, true);
            return imageContainer;
        }
        ImageContainer imageContainer2 = new ImageContainer(null, str, cacheKey, imageListener);
        imageListener.onResponse(imageContainer2, true);
        BatchedImageRequest batchedImageRequest = this.mInFlightRequests.get(cacheKey);
        if (batchedImageRequest == null) {
            batchedImageRequest = this.mBatchedResponses.get(cacheKey);
        }
        if (batchedImageRequest != null) {
            batchedImageRequest.addContainer(imageContainer2);
            return imageContainer2;
        }
        Request<Bitmap> requestMakeImageRequest = makeImageRequest(str, i2, i3, scaleType, cacheKey);
        this.mRequestQueue.add(requestMakeImageRequest);
        this.mInFlightRequests.put(cacheKey, new BatchedImageRequest(requestMakeImageRequest, imageContainer2));
        return imageContainer2;
    }

    public boolean isCached(String str, int i2, int i3) {
        return isCached(str, i2, i3, ImageView.ScaleType.CENTER_INSIDE);
    }

    public boolean isCached(String str, int i2, int i3, ImageView.ScaleType scaleType) throws Throwable {
        Threads.throwIfNotOnMainThread();
        return this.mCache.getBitmap(getCacheKey(str, i2, i3, scaleType)) != null;
    }

    protected Request<Bitmap> makeImageRequest(String str, int i2, int i3, ImageView.ScaleType scaleType, final String str2) {
        return new ImageRequest(str, new Response.Listener<Bitmap>() { // from class: com.android.volley.toolbox.ImageLoader.2
            @Override // com.android.volley.Response.Listener
            public void onResponse(Bitmap bitmap) throws Throwable {
                ImageLoader.this.onGetImageSuccess(str2, bitmap);
            }
        }, i2, i3, scaleType, Bitmap.Config.RGB_565, new Response.ErrorListener() { // from class: com.android.volley.toolbox.ImageLoader.3
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) throws Throwable {
                ImageLoader.this.onGetImageError(str2, volleyError);
            }
        });
    }

    protected void onGetImageError(String str, VolleyError volleyError) throws Throwable {
        BatchedImageRequest batchedImageRequestRemove = this.mInFlightRequests.remove(str);
        if (batchedImageRequestRemove != null) {
            batchedImageRequestRemove.setError(volleyError);
            batchResponse(str, batchedImageRequestRemove);
        }
    }

    protected void onGetImageSuccess(String str, Bitmap bitmap) throws Throwable {
        this.mCache.putBitmap(str, bitmap);
        BatchedImageRequest batchedImageRequestRemove = this.mInFlightRequests.remove(str);
        if (batchedImageRequestRemove != null) {
            batchedImageRequestRemove.mResponseBitmap = bitmap;
            batchResponse(str, batchedImageRequestRemove);
        }
    }

    public void setBatchedResponseDelay(int i2) {
        this.mBatchResponseDelayMs = i2;
    }
}
