package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaStoreFileLoader implements ModelLoader<Uri, File> {
    private final Context context;

    public static final class Factory implements ModelLoaderFactory<Uri, File> {
        private final Context context;

        public Factory(Context context) {
            this.context = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader<Uri, File> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreFileLoader(this.context);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    private static class FilePathFetcher implements DataFetcher<File> {
        private static final String[] PROJECTION = {"_data"};
        private final Context context;
        private final Uri uri;

        FilePathFetcher(Context context, Uri uri) {
            this.context = context;
            this.uri = uri;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public Class<File> getDataClass() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(Priority priority, DataFetcher.DataCallback<? super File> dataCallback) throws Throwable {
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.Zd("S\u00107u\n0[4\"_j\u001fHb\u0018}+\b6lr4`", (short) (C1580rY.Xd() ^ (-29779)), (short) (C1580rY.Xd() ^ (-3516)))).getMethod(C1561oA.Xd("`_o?llseovUixus~n|", (short) (C1633zX.Xd() ^ (-22438))), new Class[0]);
            try {
                method.setAccessible(true);
                Cursor cursorQuery = ((ContentResolver) method.invoke(context, objArr)).query(this.uri, PROJECTION, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(Wg.vd("\r\u0013\r!\u0013", (short) (FB.Xd() ^ 24966)))) : null;
                    } finally {
                        cursorQuery.close();
                    }
                }
                if (TextUtils.isEmpty(string)) {
                    dataCallback.onLoadFailed(new FileNotFoundException(Qg.kd("{\u0016\u001d\u001f\u0017\u0015O#\u001dL\u0012\u0014\u0018\rG\r\u000f\u0011\tB\u0012\u0002\u0014\u0007=\u0003\u000b\rS8", (short) (C1499aX.Xd() ^ (-27215)), (short) (C1499aX.Xd() ^ (-23719))) + this.uri));
                } else {
                    dataCallback.onDataReady(new File(string));
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public MediaStoreFileLoader(Context context) {
        this.context = context;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<File> buildLoadData(Uri uri, int i2, int i3, Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(uri), new FilePathFetcher(this.context, uri));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(Uri uri) {
        return MediaStoreUtil.isMediaStoreUri(uri);
    }
}
