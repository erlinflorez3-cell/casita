package com.google.maps.android.clustering.algo;

import androidx.collection.LruCache;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes7.dex */
public class PreCachingAlgorithmDecorator<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private final Algorithm<T> mAlgorithm;
    private final LruCache<Integer, Set<? extends Cluster<T>>> mCache = new LruCache<>(5);
    private final ReadWriteLock mCacheLock = new ReentrantReadWriteLock();
    private final Executor mExecutor = Executors.newCachedThreadPool();

    private class PrecacheRunnable implements Runnable {
        private final int mZoom;

        public PrecacheRunnable(int i2) {
            this.mZoom = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            PreCachingAlgorithmDecorator.this.getClustersInternal(this.mZoom);
        }
    }

    public PreCachingAlgorithmDecorator(Algorithm<T> algorithm) {
        this.mAlgorithm = algorithm;
    }

    private void clearCache() {
        this.mCache.evictAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<? extends Cluster<T>> getClustersInternal(int i2) {
        this.mCacheLock.readLock().lock();
        Set<? extends Cluster<T>> clusters = this.mCache.get(Integer.valueOf(i2));
        this.mCacheLock.readLock().unlock();
        if (clusters == null) {
            this.mCacheLock.writeLock().lock();
            clusters = this.mCache.get(Integer.valueOf(i2));
            if (clusters == null) {
                clusters = this.mAlgorithm.getClusters(i2);
                this.mCache.put(Integer.valueOf(i2), clusters);
            }
            this.mCacheLock.writeLock().unlock();
        }
        return clusters;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t2) {
        boolean zAddItem = this.mAlgorithm.addItem(t2);
        if (zAddItem) {
            clearCache();
        }
        return zAddItem;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        boolean zAddItems = this.mAlgorithm.addItems(collection);
        if (zAddItems) {
            clearCache();
        }
        return zAddItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.mAlgorithm.clearItems();
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f2) {
        int i2 = (int) f2;
        Set<? extends Cluster<T>> clustersInternal = getClustersInternal(i2);
        int i3 = i2 + 1;
        if (this.mCache.get(Integer.valueOf(i3)) == null) {
            this.mExecutor.execute(new PrecacheRunnable(i3));
        }
        int i4 = i2 - 1;
        if (this.mCache.get(Integer.valueOf(i4)) == null) {
            this.mExecutor.execute(new PrecacheRunnable(i4));
        }
        return clustersInternal;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.mAlgorithm.getItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mAlgorithm.getMaxDistanceBetweenClusteredItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t2) {
        boolean zRemoveItem = this.mAlgorithm.removeItem(t2);
        if (zRemoveItem) {
            clearCache();
        }
        return zRemoveItem;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        boolean zRemoveItems = this.mAlgorithm.removeItems(collection);
        if (zRemoveItems) {
            clearCache();
        }
        return zRemoveItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i2) {
        this.mAlgorithm.setMaxDistanceBetweenClusteredItems(i2);
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t2) {
        boolean zUpdateItem = this.mAlgorithm.updateItem(t2);
        if (zUpdateItem) {
            clearCache();
        }
        return zUpdateItem;
    }
}
