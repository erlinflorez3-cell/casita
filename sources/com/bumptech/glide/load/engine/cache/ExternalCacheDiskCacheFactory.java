package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.Od;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ExternalCacheDiskCacheFactory extends DiskLruCacheFactory {
    public ExternalCacheDiskCacheFactory(Context context) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, DiskCache.Factory.DEFAULT_DISK_CACHE_SIZE);
    }

    public ExternalCacheDiskCacheFactory(Context context, int i2) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, i2);
    }

    public ExternalCacheDiskCacheFactory(final Context context, final String str, int i2) {
        super(new DiskLruCacheFactory.CacheDirectoryGetter() { // from class: com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory.1
            @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
            public File getCacheDirectory() throws Throwable {
                Context context2 = context;
                Object[] objArr = new Object[0];
                Method method = Class.forName(hg.Vd("GSHUQJD\rALJO?GL\u0005\u0019DBG7ID", (short) (Od.Xd() ^ (-26551)), (short) (Od.Xd() ^ (-3261)))).getMethod(C1561oA.ud(" \u001d+z-(\u0018$\u001f\u0011\u001bp\u000e\u000f\u0013\u000fl\u0011\u0019", (short) (C1580rY.Xd() ^ (-22434))), new Class[0]);
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
        }, i2);
    }
}
