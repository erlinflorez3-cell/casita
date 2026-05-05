package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class NonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_MAX_DISTANCE_AT_ZOOM = 100;
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);
    private int mMaxDistance = 100;
    private final Collection<QuadItem<T>> mItems = new LinkedHashSet();
    private final PointQuadTree<QuadItem<T>> mQuadTree = new PointQuadTree<>(0.0d, 1.0d, 0.0d, 1.0d);

    protected static class QuadItem<T extends ClusterItem> implements PointQuadTree.Item, Cluster<T> {
        private final T mClusterItem;
        private final Point mPoint;
        private final LatLng mPosition;
        private Set<T> singletonSet;

        private QuadItem(T t2) {
            this.mClusterItem = t2;
            LatLng position = t2.getPosition();
            this.mPosition = position;
            this.mPoint = NonHierarchicalDistanceBasedAlgorithm.PROJECTION.toPoint(position);
            this.singletonSet = Collections.singleton(t2);
        }

        /* synthetic */ QuadItem(ClusterItem clusterItem, AnonymousClass1 anonymousClass1) {
            this(clusterItem);
        }

        public boolean equals(Object obj) {
            if (obj instanceof QuadItem) {
                return ((QuadItem) obj).mClusterItem.equals(this.mClusterItem);
            }
            return false;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public Set<T> getItems() {
            return this.singletonSet;
        }

        @Override // com.google.maps.android.quadtree.PointQuadTree.Item
        public Point getPoint() {
            return this.mPoint;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public LatLng getPosition() {
            return this.mPosition;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.mClusterItem.hashCode();
        }
    }

    private Bounds createBoundsFromSpan(Point point, double d2) {
        double d3 = d2 / 2.0d;
        return new Bounds(point.f3534x - d3, point.f3534x + d3, point.f3535y - d3, point.f3535y + d3);
    }

    private double distanceSquared(Point point, Point point2) {
        return ((point.f3534x - point2.f3534x) * (point.f3534x - point2.f3534x)) + ((point.f3535y - point2.f3535y) * (point.f3535y - point2.f3535y));
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t2) {
        boolean zAdd;
        QuadItem<T> quadItem = new QuadItem<>(t2);
        synchronized (this.mQuadTree) {
            zAdd = this.mItems.add(quadItem);
            if (zAdd) {
                this.mQuadTree.add(quadItem);
            }
        }
        return zAdd;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (addItem(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        synchronized (this.mQuadTree) {
            this.mItems.clear();
            this.mQuadTree.clear();
        }
    }

    protected Collection<QuadItem<T>> getClusteringItems(PointQuadTree<QuadItem<T>> pointQuadTree, float f2) {
        return this.mItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f2) {
        double dPow = (((double) this.mMaxDistance) / Math.pow(2.0d, (int) f2)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        synchronized (this.mQuadTree) {
            for (QuadItem<T> quadItem : getClusteringItems(this.mQuadTree, f2)) {
                if (!hashSet.contains(quadItem)) {
                    Collection<T> collectionSearch = this.mQuadTree.search(createBoundsFromSpan(quadItem.getPoint(), dPow));
                    if (collectionSearch.size() == 1) {
                        hashSet2.add(quadItem);
                        hashSet.add(quadItem);
                        map.put(quadItem, Double.valueOf(0.0d));
                    } else {
                        StaticCluster staticCluster = new StaticCluster(((QuadItem) quadItem).mClusterItem.getPosition());
                        hashSet2.add(staticCluster);
                        for (T t2 : collectionSearch) {
                            Double d2 = (Double) map.get(t2);
                            double dDistanceSquared = distanceSquared(t2.getPoint(), quadItem.getPoint());
                            if (d2 == null) {
                                map.put(t2, Double.valueOf(dDistanceSquared));
                                staticCluster.add(t2.mClusterItem);
                                map2.put(t2, staticCluster);
                            } else if (d2.doubleValue() >= dDistanceSquared) {
                                ((StaticCluster) map2.get(t2)).remove(t2.mClusterItem);
                                map.put(t2, Double.valueOf(dDistanceSquared));
                                staticCluster.add(t2.mClusterItem);
                                map2.put(t2, staticCluster);
                            }
                        }
                        hashSet.addAll(collectionSearch);
                    }
                }
            }
        }
        return hashSet2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.mQuadTree) {
            Iterator<QuadItem<T>> it = this.mItems.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((QuadItem) it.next()).mClusterItem);
            }
        }
        return linkedHashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mMaxDistance;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t2) {
        boolean zRemove;
        QuadItem quadItem = new QuadItem(t2);
        synchronized (this.mQuadTree) {
            zRemove = this.mItems.remove(quadItem);
            if (zRemove) {
                this.mQuadTree.remove(quadItem);
            }
        }
        return zRemove;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        boolean z2;
        synchronized (this.mQuadTree) {
            Iterator<T> it = collection.iterator();
            z2 = false;
            while (it.hasNext()) {
                QuadItem quadItem = new QuadItem(it.next());
                if (this.mItems.remove(quadItem)) {
                    this.mQuadTree.remove(quadItem);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i2) {
        this.mMaxDistance = i2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t2) {
        boolean zRemoveItem;
        synchronized (this.mQuadTree) {
            zRemoveItem = removeItem(t2);
            if (zRemoveItem) {
                zRemoveItem = addItem(t2);
            }
        }
        return zRemoveItem;
    }
}
