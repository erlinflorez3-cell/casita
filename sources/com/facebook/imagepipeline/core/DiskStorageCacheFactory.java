package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.cache.disk.DiskStorage;
import com.facebook.cache.disk.DiskStorageCache;
import com.facebook.cache.disk.FileCache;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import yg.C1561oA;
import yg.C1580rY;
import yg.EO;

/* JADX INFO: loaded from: classes3.dex */
public class DiskStorageCacheFactory implements FileCacheFactory {
    private DiskStorageFactory mDiskStorageFactory;

    public DiskStorageCacheFactory(DiskStorageFactory diskStorageFactory) {
        this.mDiskStorageFactory = diskStorageFactory;
    }

    public static DiskStorageCache buildDiskStorageCache(DiskCacheConfig diskCacheConfig, DiskStorage diskStorage) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(EO.Od("\f[r}R>!~4*0$r[{`&|O\u001f\u001c|\u0018\u000bL\\?sR'", (short) (C1580rY.Xd() ^ (-3558)))).getDeclaredMethod(C1561oA.Qd("\u000e\u0004\u0015o\u0005\t\u0001\u0005|j}\u0007xsuU\bsp\u0002\u007fy{", (short) (C1580rY.Xd() ^ (-2428))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            return buildDiskStorageCache(diskCacheConfig, diskStorage, (ExecutorService) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static DiskStorageCache buildDiskStorageCache(DiskCacheConfig diskCacheConfig, DiskStorage diskStorage, Executor executor) {
        return new DiskStorageCache(diskStorage, diskCacheConfig.getEntryEvictionComparatorSupplier(), new DiskStorageCache.Params(diskCacheConfig.getMinimumSizeLimit(), diskCacheConfig.getLowDiskSpaceSizeLimit(), diskCacheConfig.getDefaultSizeLimit()), diskCacheConfig.getCacheEventListener(), diskCacheConfig.getCacheErrorLogger(), diskCacheConfig.getDiskTrimmableRegistry(), executor, diskCacheConfig.getIndexPopulateAtStartupEnabled());
    }

    @Override // com.facebook.imagepipeline.core.FileCacheFactory
    public FileCache get(DiskCacheConfig diskCacheConfig) {
        return buildDiskStorageCache(diskCacheConfig, this.mDiskStorageFactory.get(diskCacheConfig));
    }
}
