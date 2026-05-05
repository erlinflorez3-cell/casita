package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.ExifOrientationStream;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class ThumbFetcher implements DataFetcher<InputStream> {
    private static final String TAG = "MediaStoreThumbFetcher";
    private InputStream inputStream;
    private final Uri mediaStoreImageUri;
    private final ThumbnailStreamOpener opener;

    static class ImageThumbnailQuery implements ThumbnailQuery {
        private static final String[] PATH_PROJECTION = {"_data"};
        private static final String PATH_SELECTION = "kind = 1 AND image_id = ?";
        private final ContentResolver contentResolver;

        ImageThumbnailQuery(ContentResolver contentResolver) {
            this.contentResolver = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.ThumbnailQuery
        public Cursor query(Uri uri) {
            return this.contentResolver.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, PATH_PROJECTION, PATH_SELECTION, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class VideoThumbnailQuery implements ThumbnailQuery {
        private static final String[] PATH_PROJECTION = {"_data"};
        private static final String PATH_SELECTION = "kind = 1 AND video_id = ?";
        private final ContentResolver contentResolver;

        VideoThumbnailQuery(ContentResolver contentResolver) {
            this.contentResolver = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.ThumbnailQuery
        public Cursor query(Uri uri) {
            return this.contentResolver.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, PATH_PROJECTION, PATH_SELECTION, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    ThumbFetcher(Uri uri, ThumbnailStreamOpener thumbnailStreamOpener) {
        this.mediaStoreImageUri = uri;
        this.opener = thumbnailStreamOpener;
    }

    private static ThumbFetcher build(Context context, Uri uri, ThumbnailQuery thumbnailQuery) throws Throwable {
        ArrayPool arrayPool = Glide.get(context).getArrayPool();
        List<ImageHeaderParser> imageHeaderParsers = Glide.get(context).getRegistry().getImageHeaderParsers();
        Class<?> cls = Class.forName(C1626yg.Ud("\u0016j&\u0010\u0013Vwg=\u0015G'\u0018\u0013#0J+\u0016iU'9", (short) (OY.Xd() ^ 23510), (short) (OY.Xd() ^ 31435)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-30530));
        int[] iArr = new int["\r]>h\fNtlK%\u0001uQOH8nu".length()];
        QB qb = new QB("\r]>h\fNtlK%\u0001uQOH8nu");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return new ThumbFetcher(uri, new ThumbnailStreamOpener(imageHeaderParsers, thumbnailQuery, arrayPool, (ContentResolver) method.invoke(context, objArr)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static ThumbFetcher buildImageFetcher(Context context, Uri uri) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("9u\u000e@^\r_*\u0002>3c\u0003\u000e\u0014s=o\nu*\u000bZ", (short) (FB.Xd() ^ 24900))).getMethod(C1561oA.Qd("\u0018\u0015#p\u001c\u001a\u001f\u000f\u0017\u001cx\u000b\u0018\u0013\u000f\u0018\u0006\u0012", (short) (FB.Xd() ^ 27222)), new Class[0]);
        try {
            method.setAccessible(true);
            return build(context, uri, new ImageThumbnailQuery((ContentResolver) method.invoke(context, objArr)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static ThumbFetcher buildVideoFetcher(Context context, Uri uri) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("DRIXVQM\u0018N[[bT^e 6ccj\\pm", (short) (ZN.Xd() ^ 22081), (short) (ZN.Xd() ^ 17431))).getMethod(C1561oA.od("DAO\u001dHFK;CH%7D?;D2>", (short) (Od.Xd() ^ (-32644))), new Class[0]);
        try {
            method.setAccessible(true);
            return build(context, uri, new VideoThumbnailQuery((ContentResolver) method.invoke(context, objArr)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private InputStream openThumbInputStream() throws Throwable {
        InputStream inputStreamOpen = this.opener.open(this.mediaStoreImageUri);
        int orientation = inputStreamOpen != null ? this.opener.getOrientation(this.mediaStoreImageUri) : -1;
        return orientation != -1 ? new ExifOrientationStream(inputStreamOpen, orientation) : inputStreamOpen;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void loadData(Priority priority, DataFetcher.DataCallback<? super InputStream> dataCallback) throws Throwable {
        try {
            InputStream inputStreamOpenThumbInputStream = openThumbInputStream();
            this.inputStream = inputStreamOpenThumbInputStream;
            dataCallback.onDataReady(inputStreamOpenThumbInputStream);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable(TAG, 3)) {
            }
            dataCallback.onLoadFailed(e2);
        }
    }
}
