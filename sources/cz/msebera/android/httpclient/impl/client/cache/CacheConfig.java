package cz.msebera.android.httpclient.impl.client.cache;

import cz.msebera.android.httpclient.util.Args;

/* JADX INFO: loaded from: classes5.dex */
public class CacheConfig implements Cloneable {
    public static final CacheConfig DEFAULT = new Builder().build();
    public static final boolean DEFAULT_303_CACHING_ENABLED = false;
    public static final int DEFAULT_ASYNCHRONOUS_WORKERS_CORE = 1;
    public static final int DEFAULT_ASYNCHRONOUS_WORKERS_MAX = 1;
    public static final int DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS = 60;
    public static final boolean DEFAULT_HEURISTIC_CACHING_ENABLED = false;
    public static final float DEFAULT_HEURISTIC_COEFFICIENT = 0.1f;
    public static final long DEFAULT_HEURISTIC_LIFETIME = 0;
    public static final int DEFAULT_MAX_CACHE_ENTRIES = 1000;
    public static final int DEFAULT_MAX_OBJECT_SIZE_BYTES = 8192;
    public static final int DEFAULT_MAX_UPDATE_RETRIES = 1;
    public static final int DEFAULT_REVALIDATION_QUEUE_SIZE = 100;
    public static final boolean DEFAULT_WEAK_ETAG_ON_PUTDELETE_ALLOWED = false;
    private final boolean allow303Caching;
    private int asynchronousWorkerIdleLifetimeSecs;
    private int asynchronousWorkersCore;
    private int asynchronousWorkersMax;
    private boolean heuristicCachingEnabled;
    private float heuristicCoefficient;
    private long heuristicDefaultLifetime;
    private boolean isSharedCache;
    private int maxCacheEntries;
    private long maxObjectSize;
    private int maxUpdateRetries;
    private boolean neverCacheHTTP10ResponsesWithQuery;
    private int revalidationQueueSize;
    private final boolean weakETagOnPutDeleteAllowed;

    public static class Builder {
        private boolean neverCacheHTTP10ResponsesWithQuery;
        private long maxObjectSize = 8192;
        private int maxCacheEntries = 1000;
        private int maxUpdateRetries = 1;
        private boolean allow303Caching = false;
        private boolean weakETagOnPutDeleteAllowed = false;
        private boolean heuristicCachingEnabled = false;
        private float heuristicCoefficient = 0.1f;
        private long heuristicDefaultLifetime = 0;
        private boolean isSharedCache = true;
        private int asynchronousWorkersMax = 1;
        private int asynchronousWorkersCore = 1;
        private int asynchronousWorkerIdleLifetimeSecs = 60;
        private int revalidationQueueSize = 100;

        Builder() {
        }

        public CacheConfig build() {
            return new CacheConfig(this.maxObjectSize, this.maxCacheEntries, this.maxUpdateRetries, this.allow303Caching, this.weakETagOnPutDeleteAllowed, this.heuristicCachingEnabled, this.heuristicCoefficient, this.heuristicDefaultLifetime, this.isSharedCache, this.asynchronousWorkersMax, this.asynchronousWorkersCore, this.asynchronousWorkerIdleLifetimeSecs, this.revalidationQueueSize, this.neverCacheHTTP10ResponsesWithQuery);
        }

        public Builder setAllow303Caching(boolean z2) {
            this.allow303Caching = z2;
            return this;
        }

        public Builder setAsynchronousWorkerIdleLifetimeSecs(int i2) {
            this.asynchronousWorkerIdleLifetimeSecs = i2;
            return this;
        }

        public Builder setAsynchronousWorkersCore(int i2) {
            this.asynchronousWorkersCore = i2;
            return this;
        }

        public Builder setAsynchronousWorkersMax(int i2) {
            this.asynchronousWorkersMax = i2;
            return this;
        }

        public Builder setHeuristicCachingEnabled(boolean z2) {
            this.heuristicCachingEnabled = z2;
            return this;
        }

        public Builder setHeuristicCoefficient(float f2) {
            this.heuristicCoefficient = f2;
            return this;
        }

        public Builder setHeuristicDefaultLifetime(long j2) {
            this.heuristicDefaultLifetime = j2;
            return this;
        }

        public Builder setMaxCacheEntries(int i2) {
            this.maxCacheEntries = i2;
            return this;
        }

        public Builder setMaxObjectSize(long j2) {
            this.maxObjectSize = j2;
            return this;
        }

        public Builder setMaxUpdateRetries(int i2) {
            this.maxUpdateRetries = i2;
            return this;
        }

        public Builder setNeverCacheHTTP10ResponsesWithQueryString(boolean z2) {
            this.neverCacheHTTP10ResponsesWithQuery = z2;
            return this;
        }

        public Builder setRevalidationQueueSize(int i2) {
            this.revalidationQueueSize = i2;
            return this;
        }

        public Builder setSharedCache(boolean z2) {
            this.isSharedCache = z2;
            return this;
        }

        public Builder setWeakETagOnPutDeleteAllowed(boolean z2) {
            this.weakETagOnPutDeleteAllowed = z2;
            return this;
        }
    }

    @Deprecated
    public CacheConfig() {
        this.maxObjectSize = 8192L;
        this.maxCacheEntries = 1000;
        this.maxUpdateRetries = 1;
        this.allow303Caching = false;
        this.weakETagOnPutDeleteAllowed = false;
        this.heuristicCachingEnabled = false;
        this.heuristicCoefficient = 0.1f;
        this.heuristicDefaultLifetime = 0L;
        this.isSharedCache = true;
        this.asynchronousWorkersMax = 1;
        this.asynchronousWorkersCore = 1;
        this.asynchronousWorkerIdleLifetimeSecs = 60;
        this.revalidationQueueSize = 100;
    }

    CacheConfig(long j2, int i2, int i3, boolean z2, boolean z3, boolean z4, float f2, long j3, boolean z5, int i4, int i5, int i6, int i7, boolean z6) {
        this.maxObjectSize = j2;
        this.maxCacheEntries = i2;
        this.maxUpdateRetries = i3;
        this.allow303Caching = z2;
        this.weakETagOnPutDeleteAllowed = z3;
        this.heuristicCachingEnabled = z4;
        this.heuristicCoefficient = f2;
        this.heuristicDefaultLifetime = j3;
        this.isSharedCache = z5;
        this.asynchronousWorkersMax = i4;
        this.asynchronousWorkersCore = i5;
        this.asynchronousWorkerIdleLifetimeSecs = i6;
        this.revalidationQueueSize = i7;
    }

    public static Builder copy(CacheConfig cacheConfig) {
        Args.notNull(cacheConfig, "Cache config");
        return new Builder().setMaxObjectSize(cacheConfig.getMaxObjectSize()).setMaxCacheEntries(cacheConfig.getMaxCacheEntries()).setMaxUpdateRetries(cacheConfig.getMaxUpdateRetries()).setHeuristicCachingEnabled(cacheConfig.isHeuristicCachingEnabled()).setHeuristicCoefficient(cacheConfig.getHeuristicCoefficient()).setHeuristicDefaultLifetime(cacheConfig.getHeuristicDefaultLifetime()).setSharedCache(cacheConfig.isSharedCache()).setAsynchronousWorkersMax(cacheConfig.getAsynchronousWorkersMax()).setAsynchronousWorkersCore(cacheConfig.getAsynchronousWorkersCore()).setAsynchronousWorkerIdleLifetimeSecs(cacheConfig.getAsynchronousWorkerIdleLifetimeSecs()).setRevalidationQueueSize(cacheConfig.getRevalidationQueueSize()).setNeverCacheHTTP10ResponsesWithQueryString(cacheConfig.isNeverCacheHTTP10ResponsesWithQuery());
    }

    public static Builder custom() {
        return new Builder();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CacheConfig m8783clone() throws CloneNotSupportedException {
        return (CacheConfig) super.clone();
    }

    public int getAsynchronousWorkerIdleLifetimeSecs() {
        return this.asynchronousWorkerIdleLifetimeSecs;
    }

    public int getAsynchronousWorkersCore() {
        return this.asynchronousWorkersCore;
    }

    public int getAsynchronousWorkersMax() {
        return this.asynchronousWorkersMax;
    }

    public float getHeuristicCoefficient() {
        return this.heuristicCoefficient;
    }

    public long getHeuristicDefaultLifetime() {
        return this.heuristicDefaultLifetime;
    }

    public int getMaxCacheEntries() {
        return this.maxCacheEntries;
    }

    public long getMaxObjectSize() {
        return this.maxObjectSize;
    }

    @Deprecated
    public int getMaxObjectSizeBytes() {
        long j2 = this.maxObjectSize;
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j2;
    }

    public int getMaxUpdateRetries() {
        return this.maxUpdateRetries;
    }

    public int getRevalidationQueueSize() {
        return this.revalidationQueueSize;
    }

    public boolean is303CachingEnabled() {
        return this.allow303Caching;
    }

    public boolean isHeuristicCachingEnabled() {
        return this.heuristicCachingEnabled;
    }

    public boolean isNeverCacheHTTP10ResponsesWithQuery() {
        return this.neverCacheHTTP10ResponsesWithQuery;
    }

    public boolean isSharedCache() {
        return this.isSharedCache;
    }

    public boolean isWeakETagOnPutDeleteAllowed() {
        return this.weakETagOnPutDeleteAllowed;
    }

    @Deprecated
    public void setAsynchronousWorkerIdleLifetimeSecs(int i2) {
        this.asynchronousWorkerIdleLifetimeSecs = i2;
    }

    @Deprecated
    public void setAsynchronousWorkersCore(int i2) {
        this.asynchronousWorkersCore = i2;
    }

    @Deprecated
    public void setAsynchronousWorkersMax(int i2) {
        this.asynchronousWorkersMax = i2;
    }

    @Deprecated
    public void setHeuristicCachingEnabled(boolean z2) {
        this.heuristicCachingEnabled = z2;
    }

    @Deprecated
    public void setHeuristicCoefficient(float f2) {
        this.heuristicCoefficient = f2;
    }

    @Deprecated
    public void setHeuristicDefaultLifetime(long j2) {
        this.heuristicDefaultLifetime = j2;
    }

    @Deprecated
    public void setMaxCacheEntries(int i2) {
        this.maxCacheEntries = i2;
    }

    @Deprecated
    public void setMaxObjectSize(long j2) {
        this.maxObjectSize = j2;
    }

    @Deprecated
    public void setMaxObjectSizeBytes(int i2) {
        if (i2 > Integer.MAX_VALUE) {
            this.maxObjectSize = 2147483647L;
        } else {
            this.maxObjectSize = i2;
        }
    }

    @Deprecated
    public void setMaxUpdateRetries(int i2) {
        this.maxUpdateRetries = i2;
    }

    @Deprecated
    public void setRevalidationQueueSize(int i2) {
        this.revalidationQueueSize = i2;
    }

    @Deprecated
    public void setSharedCache(boolean z2) {
        this.isSharedCache = z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[maxObjectSize=");
        sb.append(this.maxObjectSize).append(", maxCacheEntries=").append(this.maxCacheEntries).append(", maxUpdateRetries=").append(this.maxUpdateRetries).append(", 303CachingEnabled=").append(this.allow303Caching).append(", weakETagOnPutDeleteAllowed=").append(this.weakETagOnPutDeleteAllowed).append(", heuristicCachingEnabled=").append(this.heuristicCachingEnabled).append(", heuristicCoefficient=").append(this.heuristicCoefficient).append(", heuristicDefaultLifetime=").append(this.heuristicDefaultLifetime).append(", isSharedCache=").append(this.isSharedCache).append(", asynchronousWorkersMax=").append(this.asynchronousWorkersMax).append(", asynchronousWorkersCore=").append(this.asynchronousWorkersCore).append(", asynchronousWorkerIdleLifetimeSecs=").append(this.asynchronousWorkerIdleLifetimeSecs).append(", revalidationQueueSize=").append(this.revalidationQueueSize).append(", neverCacheHTTP10ResponsesWithQuery=").append(this.neverCacheHTTP10ResponsesWithQuery).append("]");
        return sb.toString();
    }
}
