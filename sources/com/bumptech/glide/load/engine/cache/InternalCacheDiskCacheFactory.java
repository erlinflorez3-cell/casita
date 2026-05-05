package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.C1626yg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalCacheDiskCacheFactory extends DiskLruCacheFactory {
    public InternalCacheDiskCacheFactory(Context context) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, 262144000L);
    }

    public InternalCacheDiskCacheFactory(Context context, long j2) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, j2);
    }

    public InternalCacheDiskCacheFactory(final Context context, final String str, long j2) {
        super(new DiskLruCacheFactory.CacheDirectoryGetter() { // from class: com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory.1
            @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
            public File getCacheDirectory() throws Throwable {
                Context context2 = context;
                Object[] objArr = new Object[0];
                Method method = Class.forName(ZO.xd("\tG.9\rLq)X\u00121|\\h\u0004WDi1p\u0005.P", (short) (ZN.Xd() ^ 1988), (short) (ZN.Xd() ^ 14624))).getMethod(C1626yg.Ud("ykqBk\u0005w\np\u001aH", (short) (C1580rY.Xd() ^ (-24981)), (short) (C1580rY.Xd() ^ (-18879))), new Class[0]);
                try {
                    method.setAccessible(true);
                    File file = (File) method.invoke(context2, objArr);
                    if (file == null) {
                        return null;
                    }
                    return str != null ? new File(file, str) : file;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }, j2);
    }
}
