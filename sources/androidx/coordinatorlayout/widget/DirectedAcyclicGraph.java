package androidx.coordinatorlayout.widget;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DirectedAcyclicGraph<T> {
    private final Pools.Pool<ArrayList<T>> mListPool = new Pools.SimplePool(10);
    private final SimpleArrayMap<T, ArrayList<T>> mGraph = new SimpleArrayMap<>();
    private final ArrayList<T> mSortResult = new ArrayList<>();
    private final HashSet<T> mSortTmpMarked = new HashSet<>();

    public void addNode(T t2) {
        if (this.mGraph.containsKey(t2)) {
            return;
        }
        this.mGraph.put(t2, null);
    }

    public boolean contains(T t2) {
        return this.mGraph.containsKey(t2);
    }

    public void addEdge(T t2, T t3) {
        if (!this.mGraph.containsKey(t2) || !this.mGraph.containsKey(t3)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> emptyList = this.mGraph.get(t2);
        if (emptyList == null) {
            emptyList = getEmptyList();
            this.mGraph.put(t2, emptyList);
        }
        emptyList.add(t3);
    }

    public List<T> getIncomingEdges(T t2) {
        ArrayList<T> incomingEdgesInternal = getIncomingEdgesInternal(t2);
        if (incomingEdgesInternal == null) {
            return null;
        }
        return new ArrayList(incomingEdgesInternal);
    }

    ArrayList<T> getIncomingEdgesInternal(T t2) {
        return this.mGraph.get(t2);
    }

    public List<T> getOutgoingEdges(T t2) {
        int size = this.mGraph.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListValueAt = this.mGraph.valueAt(i2);
            if (arrayListValueAt != null && arrayListValueAt.contains(t2)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.mGraph.keyAt(i2));
            }
        }
        return arrayList;
    }

    public boolean hasOutgoingEdges(T t2) {
        int size = this.mGraph.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListValueAt = this.mGraph.valueAt(i2);
            if (arrayListValueAt != null && arrayListValueAt.contains(t2)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        int size = this.mGraph.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListValueAt = this.mGraph.valueAt(i2);
            if (arrayListValueAt != null) {
                poolList(arrayListValueAt);
            }
        }
        this.mGraph.clear();
    }

    public ArrayList<T> getSortedList() {
        this.mSortResult.clear();
        this.mSortTmpMarked.clear();
        int size = this.mGraph.size();
        for (int i2 = 0; i2 < size; i2++) {
            dfs(this.mGraph.keyAt(i2), this.mSortResult, this.mSortTmpMarked);
        }
        return this.mSortResult;
    }

    private void dfs(T t2, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t2)) {
            return;
        }
        if (hashSet.contains(t2)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t2);
        ArrayList<T> arrayList2 = this.mGraph.get(t2);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                dfs(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(t2);
        arrayList.add(t2);
    }

    int size() {
        return this.mGraph.size();
    }

    private ArrayList<T> getEmptyList() {
        ArrayList<T> arrayListAcquire = this.mListPool.acquire();
        return arrayListAcquire == null ? new ArrayList<>() : arrayListAcquire;
    }

    private void poolList(ArrayList<T> arrayList) {
        arrayList.clear();
        this.mListPool.release(arrayList);
    }
}
