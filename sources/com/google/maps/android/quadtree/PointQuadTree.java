package com.google.maps.android.quadtree;

import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree.Item;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class PointQuadTree<T extends Item> {
    private static final int MAX_DEPTH = 40;
    private static final int MAX_ELEMENTS = 50;
    private final Bounds mBounds;
    private List<PointQuadTree<T>> mChildren;
    private final int mDepth;
    private Set<T> mItems;

    public interface Item {
        Point getPoint();
    }

    public PointQuadTree(double d2, double d3, double d4, double d5) {
        this(new Bounds(d2, d3, d4, d5));
    }

    private PointQuadTree(double d2, double d3, double d4, double d5, int i2) {
        this(new Bounds(d2, d3, d4, d5), i2);
    }

    public PointQuadTree(Bounds bounds) {
        this(bounds, 0);
    }

    private PointQuadTree(Bounds bounds, int i2) {
        this.mChildren = null;
        this.mBounds = bounds;
        this.mDepth = i2;
    }

    private void insert(double d2, double d3, T t2) {
        if (this.mChildren == null) {
            if (this.mItems == null) {
                this.mItems = new LinkedHashSet();
            }
            this.mItems.add(t2);
            if (this.mItems.size() <= 50 || this.mDepth >= 40) {
                return;
            }
            split();
            return;
        }
        if (d3 < this.mBounds.midY) {
            if (d2 < this.mBounds.midX) {
                this.mChildren.get(0).insert(d2, d3, t2);
                return;
            } else {
                this.mChildren.get(1).insert(d2, d3, t2);
                return;
            }
        }
        if (d2 < this.mBounds.midX) {
            this.mChildren.get(2).insert(d2, d3, t2);
        } else {
            this.mChildren.get(3).insert(d2, d3, t2);
        }
    }

    private boolean remove(double d2, double d3, T t2) {
        if (this.mChildren != null) {
            return d3 < this.mBounds.midY ? d2 < this.mBounds.midX ? this.mChildren.get(0).remove(d2, d3, t2) : this.mChildren.get(1).remove(d2, d3, t2) : d2 < this.mBounds.midX ? this.mChildren.get(2).remove(d2, d3, t2) : this.mChildren.get(3).remove(d2, d3, t2);
        }
        Set<T> set = this.mItems;
        if (set == null) {
            return false;
        }
        return set.remove(t2);
    }

    private void search(Bounds bounds, Collection<T> collection) {
        if (this.mBounds.intersects(bounds)) {
            List<PointQuadTree<T>> list = this.mChildren;
            if (list != null) {
                Iterator<PointQuadTree<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().search(bounds, collection);
                }
            } else if (this.mItems != null) {
                if (bounds.contains(this.mBounds)) {
                    collection.addAll(this.mItems);
                    return;
                }
                for (T t2 : this.mItems) {
                    if (bounds.contains(t2.getPoint())) {
                        collection.add(t2);
                    }
                }
            }
        }
    }

    private void split() {
        ArrayList arrayList = new ArrayList(4);
        this.mChildren = arrayList;
        arrayList.add(new PointQuadTree(this.mBounds.minX, this.mBounds.midX, this.mBounds.minY, this.mBounds.midY, this.mDepth + 1));
        this.mChildren.add(new PointQuadTree<>(this.mBounds.midX, this.mBounds.maxX, this.mBounds.minY, this.mBounds.midY, this.mDepth + 1));
        this.mChildren.add(new PointQuadTree<>(this.mBounds.minX, this.mBounds.midX, this.mBounds.midY, this.mBounds.maxY, this.mDepth + 1));
        this.mChildren.add(new PointQuadTree<>(this.mBounds.midX, this.mBounds.maxX, this.mBounds.midY, this.mBounds.maxY, this.mDepth + 1));
        Set<T> set = this.mItems;
        this.mItems = null;
        for (T t2 : set) {
            insert(t2.getPoint().f3534x, t2.getPoint().f3535y, t2);
        }
    }

    public void add(T t2) {
        Point point = t2.getPoint();
        if (this.mBounds.contains(point.f3534x, point.f3535y)) {
            insert(point.f3534x, point.f3535y, t2);
        }
    }

    public void clear() {
        this.mChildren = null;
        Set<T> set = this.mItems;
        if (set != null) {
            set.clear();
        }
    }

    public boolean remove(T t2) {
        Point point = t2.getPoint();
        if (this.mBounds.contains(point.f3534x, point.f3535y)) {
            return remove(point.f3534x, point.f3535y, t2);
        }
        return false;
    }

    public Collection<T> search(Bounds bounds) {
        ArrayList arrayList = new ArrayList();
        search(bounds, arrayList);
        return arrayList;
    }
}
