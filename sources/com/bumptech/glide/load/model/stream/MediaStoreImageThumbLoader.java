package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.OY;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class MediaStoreImageThumbLoader implements ModelLoader<Uri, InputStream> {
    private final Context context;

    public static class Factory implements ModelLoaderFactory<Uri, InputStream> {
        private final Context context;

        public Factory(Context context) {
            this.context = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader<Uri, InputStream> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreImageThumbLoader(this.context);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public MediaStoreImageThumbLoader(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("%1&3/(\"j\u001f*(-\u001d%*bv\" %\u0015'\"", (short) (ZN.Xd() ^ 4961), (short) (ZN.Xd() ^ 24572))).getMethod(C1561oA.ud("\f\t\u0017b\u0011\u0010\u000b\u0007\u007f|\u000f\u0003\b\u0006Y\u0005\u0003\bw\n\u0005", (short) (OY.Xd() ^ 7750)), new Class[0]);
        try {
            method.setAccessible(true);
            this.context = (Context) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<InputStream> buildLoadData(Uri uri, int i2, int i3, Options options) {
        if (MediaStoreUtil.isThumbnailSize(i2, i3)) {
            return new ModelLoader.LoadData<>(new ObjectKey(uri), ThumbFetcher.buildImageFetcher(this.context, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(Uri uri) {
        return MediaStoreUtil.isMediaStoreImageUri(uri);
    }
}
