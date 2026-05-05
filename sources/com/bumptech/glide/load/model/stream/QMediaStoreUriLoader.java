package com.bumptech.glide.load.model.stream;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class QMediaStoreUriLoader<DataT> implements ModelLoader<Uri, DataT> {
    private final Context context;
    private final Class<DataT> dataClass;
    private final ModelLoader<File, DataT> fileDelegate;
    private final ModelLoader<Uri, DataT> uriDelegate;

    private static abstract class Factory<DataT> implements ModelLoaderFactory<Uri, DataT> {
        private final Context context;
        private final Class<DataT> dataClass;

        Factory(Context context, Class<DataT> cls) {
            this.context = context;
            this.dataClass = cls;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader<Uri, DataT> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new QMediaStoreUriLoader(this.context, multiModelLoaderFactory.build(File.class, this.dataClass), multiModelLoaderFactory.build(Uri.class, this.dataClass), this.dataClass);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
        }
    }

    public static final class FileDescriptorFactory extends Factory<ParcelFileDescriptor> {
        public FileDescriptorFactory(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class InputStreamFactory extends Factory<InputStream> {
        public InputStreamFactory(Context context) {
            super(context, InputStream.class);
        }
    }

    private static final class QMediaStoreUriFetcher<DataT> implements DataFetcher<DataT> {
        private static final String[] PROJECTION = {"_data"};
        private final Context context;
        private final Class<DataT> dataClass;
        private volatile DataFetcher<DataT> delegate;
        private final ModelLoader<File, DataT> fileDelegate;
        private final int height;
        private volatile boolean isCancelled;
        private final Options options;
        private final Uri uri;
        private final ModelLoader<Uri, DataT> uriDelegate;
        private final int width;

        QMediaStoreUriFetcher(Context context, ModelLoader<File, DataT> modelLoader, ModelLoader<Uri, DataT> modelLoader2, Uri uri, int i2, int i3, Options options, Class<DataT> cls) throws Throwable {
            short sXd = (short) (Od.Xd() ^ (-15085));
            short sXd2 = (short) (Od.Xd() ^ (-21676));
            int[] iArr = new int["KYP_]XT\u001fUbbi[el'=jjqcwt".length()];
            QB qb = new QB("KYP_]XT\u001fUbbi[el'=jjqcwt");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) + sXd2);
                i4++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i4)).getMethod(Jg.Wd(")b0=+g\"_\u0018R%Z\u001fZmZ\u0018\\\nZ\u0017", (short) (FB.Xd() ^ 12147), (short) (FB.Xd() ^ 3786)), new Class[0]);
            try {
                method.setAccessible(true);
                this.context = (Context) method.invoke(context, objArr);
                this.fileDelegate = modelLoader;
                this.uriDelegate = modelLoader2;
                this.uri = uri;
                this.width = i2;
                this.height = i3;
                this.options = options;
                this.dataClass = cls;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private ModelLoader.LoadData<DataT> buildDelegateData() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.fileDelegate.buildLoadData(queryForFilePath(this.uri), this.width, this.height, this.options);
            }
            return this.uriDelegate.buildLoadData(isAccessMediaLocationGranted() ? MediaStore.setRequireOriginal(this.uri) : this.uri, this.width, this.height, this.options);
        }

        private DataFetcher<DataT> buildDelegateFetcher() throws FileNotFoundException {
            ModelLoader.LoadData<DataT> loadDataBuildDelegateData = buildDelegateData();
            if (loadDataBuildDelegateData != null) {
                return loadDataBuildDelegateData.fetcher;
            }
            return null;
        }

        private boolean isAccessMediaLocationGranted() throws Throwable {
            Context context = this.context;
            Object[] objArr = {ZO.xd("9Q*zO8.bf4\u0003'W\u001a\u0016,>QC\u000e\u001c\"SRX\u001d&I/ab\n\b\u0002qT[R\u0011{", (short) (C1580rY.Xd() ^ (-7516)), (short) (C1580rY.Xd() ^ (-21063)))};
            Method method = Class.forName(C1626yg.Ud("\u000e>@\u0002SBu9bya6 h\rNK+rg@{#", (short) (FB.Xd() ^ 9829), (short) (FB.Xd() ^ 24544))).getMethod(EO.Od(")\u007fJ0hu4b\u0014q\toVHVo3/\u0006", (short) (C1580rY.Xd() ^ (-31957))), Class.forName(Ig.wd("\u0004-.zTVq\u001cZn\u0014\u0019hS1L", (short) (C1580rY.Xd() ^ (-1901)))));
            try {
                method.setAccessible(true);
                return ((Integer) method.invoke(context, objArr)).intValue() == 0;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private File queryForFilePath(Uri uri) throws FileNotFoundException {
            String strQd = C1561oA.Qd("p\u0013\u0015\rF\u0016\u0006\u0018\u000bA\u0018\u0001\u0012=\u0002\t\u000b\u000e\u00127\u007f\u00044\u0001wuyp.\u0001\u0001z|n(muw>#", (short) (FB.Xd() ^ 17577));
            short sXd = (short) (C1607wl.Xd() ^ 9184);
            short sXd2 = (short) (C1607wl.Xd() ^ 26885);
            int[] iArr = new int["8T]a[[\u0018mi\u001bibbha!uwswk'mw~}\u0006-t~\u0003K2".length()];
            QB qb = new QB("8T]a[[\u0018mi\u001bibbha!uwswk'mw~}\u0006-t~\u0003K2");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            Cursor cursor = null;
            try {
                Context context = this.context;
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.od("(4)62+%m\"-+0 (-ey%#(\u0018*%", (short) (FB.Xd() ^ 2110))).getMethod(C1561oA.Kd("JIY)VV]OY`?Sb_]hXf", (short) (C1499aX.Xd() ^ (-22562))), new Class[0]);
                try {
                    method.setAccessible(true);
                    Cursor cursorQuery = ((ContentResolver) method.invoke(context, objArr)).query(uri, PROJECTION, null, null, null);
                    if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                        throw new FileNotFoundException(str + uri);
                    }
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(Wg.Zd("Mi9\u001b\u001b", (short) (ZN.Xd() ^ 12546), (short) (ZN.Xd() ^ 13811))));
                    if (TextUtils.isEmpty(string)) {
                        throw new FileNotFoundException(strQd + uri);
                    }
                    File file = new File(string);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return file;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
            this.isCancelled = true;
            DataFetcher<DataT> dataFetcher = this.delegate;
            if (dataFetcher != null) {
                dataFetcher.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
            DataFetcher<DataT> dataFetcher = this.delegate;
            if (dataFetcher != null) {
                dataFetcher.cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public Class<DataT> getDataClass() {
            return this.dataClass;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(Priority priority, DataFetcher.DataCallback<? super DataT> dataCallback) {
            try {
                DataFetcher<DataT> dataFetcherBuildDelegateFetcher = buildDelegateFetcher();
                if (dataFetcherBuildDelegateFetcher == null) {
                    dataCallback.onLoadFailed(new IllegalArgumentException("Failed to build fetcher for: " + this.uri));
                    return;
                }
                this.delegate = dataFetcherBuildDelegateFetcher;
                if (this.isCancelled) {
                    cancel();
                } else {
                    dataFetcherBuildDelegateFetcher.loadData(priority, dataCallback);
                }
            } catch (FileNotFoundException e2) {
                dataCallback.onLoadFailed(e2);
            }
        }
    }

    QMediaStoreUriLoader(Context context, ModelLoader<File, DataT> modelLoader, ModelLoader<Uri, DataT> modelLoader2, Class<DataT> cls) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("~\r\u0004\u0013\u0011\f\bR\t\u0016\u0016\u001d\u000f\u0019 Zp\u001e\u001e%\u0017+(", (short) (C1633zX.Xd() ^ (-17275)))).getMethod(Wg.vd("}z\tT\u000b\n\u0005\u0001qn\u0001t\u0002\u007fS~\u0015\u001a\n\u001c\u001f", (short) (C1499aX.Xd() ^ (-28104))), new Class[0]);
        try {
            method.setAccessible(true);
            this.context = (Context) method.invoke(context, objArr);
            this.fileDelegate = modelLoader;
            this.uriDelegate = modelLoader2;
            this.dataClass = cls;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<DataT> buildLoadData(Uri uri, int i2, int i3, Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(uri), new QMediaStoreUriFetcher(this.context, this.fileDelegate, this.uriDelegate, uri, i2, i3, options, this.dataClass));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && MediaStoreUtil.isMediaStoreUri(uri);
    }
}
