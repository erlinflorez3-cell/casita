package org.springframework.util.comparator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.springframework.util.Assert;

/* JADX INFO: loaded from: classes2.dex */
public class CompoundComparator<T> implements Comparator<T>, Serializable {
    private final List<InvertibleComparator<T>> comparators;

    public CompoundComparator() {
        this.comparators = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompoundComparator(Comparator... comparatorArr) {
        Assert.notNull(comparatorArr, "Comparators must not be null");
        this.comparators = new ArrayList(comparatorArr.length);
        for (Comparator comparator : comparatorArr) {
            addComparator(comparator);
        }
    }

    public void addComparator(Comparator<T> comparator) {
        if (comparator instanceof InvertibleComparator) {
            this.comparators.add((InvertibleComparator) comparator);
        } else {
            this.comparators.add(new InvertibleComparator<>(comparator));
        }
    }

    public void addComparator(Comparator<T> comparator, boolean z2) {
        this.comparators.add(new InvertibleComparator<>(comparator, z2));
    }

    @Override // java.util.Comparator
    public int compare(T t2, T t3) {
        Assert.state(this.comparators.size() > 0, "No sort definitions have been added to this CompoundComparator to compare");
        Iterator<InvertibleComparator<T>> it = this.comparators.iterator();
        while (it.hasNext()) {
            int iCompare = it.next().compare(t2, t3);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CompoundComparator) {
            return this.comparators.equals(((CompoundComparator) obj).comparators);
        }
        return false;
    }

    public int getComparatorCount() {
        return this.comparators.size();
    }

    public int hashCode() {
        return this.comparators.hashCode();
    }

    public void invertOrder() {
        Iterator<InvertibleComparator<T>> it = this.comparators.iterator();
        while (it.hasNext()) {
            it.next().invertOrder();
        }
    }

    public void invertOrder(int i2) {
        this.comparators.get(i2).invertOrder();
    }

    public void setAscendingOrder(int i2) {
        this.comparators.get(i2).setAscending(true);
    }

    public void setComparator(int i2, Comparator<T> comparator) {
        if (comparator instanceof InvertibleComparator) {
            this.comparators.set(i2, (InvertibleComparator) comparator);
        } else {
            this.comparators.set(i2, new InvertibleComparator<>(comparator));
        }
    }

    public void setComparator(int i2, Comparator<T> comparator, boolean z2) {
        this.comparators.set(i2, new InvertibleComparator<>(comparator, z2));
    }

    public void setDescendingOrder(int i2) {
        this.comparators.get(i2).setAscending(false);
    }

    public String toString() {
        return "CompoundComparator: " + this.comparators;
    }
}
