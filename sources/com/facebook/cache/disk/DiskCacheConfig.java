package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.NoOpCacheErrorLogger;
import com.facebook.cache.common.NoOpCacheEventListener;
import com.facebook.common.disk.DiskTrimmableRegistry;
import com.facebook.common.disk.NoOpDiskTrimmableRegistry;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.Suppliers;
import io.sentry.SentryReplayEvent;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class DiskCacheConfig {
    private final String mBaseDirectoryName;
    private final Supplier<File> mBaseDirectoryPathSupplier;
    private final CacheErrorLogger mCacheErrorLogger;
    private final CacheEventListener mCacheEventListener;

    @Nullable
    private final Context mContext;
    private final long mDefaultSizeLimit;
    private final DiskTrimmableRegistry mDiskTrimmableRegistry;
    private final EntryEvictionComparatorSupplier mEntryEvictionComparatorSupplier;
    private final boolean mIndexPopulateAtStartupEnabled;
    private final long mLowDiskSpaceSizeLimit;
    private final long mMinimumSizeLimit;
    private final int mVersion;

    public static class Builder {
        private String mBaseDirectoryName;

        @Nullable
        private Supplier<File> mBaseDirectoryPathSupplier;

        @Nullable
        private CacheErrorLogger mCacheErrorLogger;

        @Nullable
        private CacheEventListener mCacheEventListener;

        @Nullable
        private final Context mContext;

        @Nullable
        private DiskTrimmableRegistry mDiskTrimmableRegistry;
        private EntryEvictionComparatorSupplier mEntryEvictionComparatorSupplier;
        private boolean mIndexPopulateAtStartupEnabled;
        private long mMaxCacheSize;
        private long mMaxCacheSizeOnLowDiskSpace;
        private long mMaxCacheSizeOnVeryLowDiskSpace;
        private int mVersion;

        private Builder(@Nullable Context context) {
            this.mVersion = 1;
            this.mBaseDirectoryName = "image_cache";
            this.mMaxCacheSize = 41943040L;
            this.mMaxCacheSizeOnLowDiskSpace = SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE;
            this.mMaxCacheSizeOnVeryLowDiskSpace = 2097152L;
            this.mEntryEvictionComparatorSupplier = new DefaultEntryEvictionComparatorSupplier();
            this.mContext = context;
        }

        public DiskCacheConfig build() {
            return new DiskCacheConfig(this);
        }

        public Builder setBaseDirectoryName(String str) {
            this.mBaseDirectoryName = str;
            return this;
        }

        public Builder setBaseDirectoryPath(File file) {
            this.mBaseDirectoryPathSupplier = Suppliers.of(file);
            return this;
        }

        public Builder setBaseDirectoryPathSupplier(Supplier<File> supplier) {
            this.mBaseDirectoryPathSupplier = supplier;
            return this;
        }

        public Builder setCacheErrorLogger(CacheErrorLogger cacheErrorLogger) {
            this.mCacheErrorLogger = cacheErrorLogger;
            return this;
        }

        public Builder setCacheEventListener(CacheEventListener cacheEventListener) {
            this.mCacheEventListener = cacheEventListener;
            return this;
        }

        public Builder setDiskTrimmableRegistry(DiskTrimmableRegistry diskTrimmableRegistry) {
            this.mDiskTrimmableRegistry = diskTrimmableRegistry;
            return this;
        }

        public Builder setEntryEvictionComparatorSupplier(EntryEvictionComparatorSupplier entryEvictionComparatorSupplier) {
            this.mEntryEvictionComparatorSupplier = entryEvictionComparatorSupplier;
            return this;
        }

        public Builder setIndexPopulateAtStartupEnabled(boolean z2) {
            this.mIndexPopulateAtStartupEnabled = z2;
            return this;
        }

        public Builder setMaxCacheSize(long j2) {
            this.mMaxCacheSize = j2;
            return this;
        }

        public Builder setMaxCacheSizeOnLowDiskSpace(long j2) {
            this.mMaxCacheSizeOnLowDiskSpace = j2;
            return this;
        }

        public Builder setMaxCacheSizeOnVeryLowDiskSpace(long j2) {
            this.mMaxCacheSizeOnVeryLowDiskSpace = j2;
            return this;
        }

        public Builder setVersion(int i2) {
            this.mVersion = i2;
            return this;
        }
    }

    protected DiskCacheConfig(Builder builder) {
        Context context = builder.mContext;
        this.mContext = context;
        Preconditions.checkState((builder.mBaseDirectoryPathSupplier == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (builder.mBaseDirectoryPathSupplier == null && context != null) {
            builder.mBaseDirectoryPathSupplier = new Supplier<File>() { // from class: com.facebook.cache.disk.DiskCacheConfig.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.facebook.common.internal.Supplier
                public File get() throws Throwable {
                    Preconditions.checkNotNull(DiskCacheConfig.this.mContext);
                    Context context2 = DiskCacheConfig.this.mContext;
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Jg.Wd("=\u0013Xj7|x\u0018\r%s<=\u0010U#xp\u007fK\f+e", (short) (Od.Xd() ^ (-19249)), (short) (Od.Xd() ^ (-21058)))).getMethod(ZO.xd("FNY\u0012\u0010l$\u0018w\u0015C`ei\u0018Q3m\u00144M", (short) (OY.Xd() ^ 30646), (short) (OY.Xd() ^ 1373)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        Context context3 = (Context) method.invoke(context2, objArr);
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(C1626yg.Ud("g8xf@q9\u0012!\u0004\u007fu086\u0019\u001a\u0013n7+mH", (short) (C1607wl.Xd() ^ 8525), (short) (C1607wl.Xd() ^ 16362))).getMethod(Ig.wd("y@\u001fS\u0007D[\u0016\u001eEJ", (short) (FB.Xd() ^ 14679)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            return (File) method2.invoke(context3, objArr2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            };
        }
        this.mVersion = builder.mVersion;
        this.mBaseDirectoryName = (String) Preconditions.checkNotNull(builder.mBaseDirectoryName);
        this.mBaseDirectoryPathSupplier = (Supplier) Preconditions.checkNotNull(builder.mBaseDirectoryPathSupplier);
        this.mDefaultSizeLimit = builder.mMaxCacheSize;
        this.mLowDiskSpaceSizeLimit = builder.mMaxCacheSizeOnLowDiskSpace;
        this.mMinimumSizeLimit = builder.mMaxCacheSizeOnVeryLowDiskSpace;
        this.mEntryEvictionComparatorSupplier = (EntryEvictionComparatorSupplier) Preconditions.checkNotNull(builder.mEntryEvictionComparatorSupplier);
        this.mCacheErrorLogger = builder.mCacheErrorLogger == null ? NoOpCacheErrorLogger.getInstance() : builder.mCacheErrorLogger;
        this.mCacheEventListener = builder.mCacheEventListener == null ? NoOpCacheEventListener.getInstance() : builder.mCacheEventListener;
        this.mDiskTrimmableRegistry = builder.mDiskTrimmableRegistry == null ? NoOpDiskTrimmableRegistry.getInstance() : builder.mDiskTrimmableRegistry;
        this.mIndexPopulateAtStartupEnabled = builder.mIndexPopulateAtStartupEnabled;
    }

    public static Builder newBuilder(@Nullable Context context) {
        return new Builder(context);
    }

    public String getBaseDirectoryName() {
        return this.mBaseDirectoryName;
    }

    public Supplier<File> getBaseDirectoryPathSupplier() {
        return this.mBaseDirectoryPathSupplier;
    }

    public CacheErrorLogger getCacheErrorLogger() {
        return this.mCacheErrorLogger;
    }

    public CacheEventListener getCacheEventListener() {
        return this.mCacheEventListener;
    }

    @Nullable
    public Context getContext() {
        return this.mContext;
    }

    public long getDefaultSizeLimit() {
        return this.mDefaultSizeLimit;
    }

    public DiskTrimmableRegistry getDiskTrimmableRegistry() {
        return this.mDiskTrimmableRegistry;
    }

    public EntryEvictionComparatorSupplier getEntryEvictionComparatorSupplier() {
        return this.mEntryEvictionComparatorSupplier;
    }

    public boolean getIndexPopulateAtStartupEnabled() {
        return this.mIndexPopulateAtStartupEnabled;
    }

    public long getLowDiskSpaceSizeLimit() {
        return this.mLowDiskSpaceSizeLimit;
    }

    public long getMinimumSizeLimit() {
        return this.mMinimumSizeLimit;
    }

    public int getVersion() {
        return this.mVersion;
    }
}
