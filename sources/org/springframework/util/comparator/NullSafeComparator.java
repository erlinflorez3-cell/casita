package org.springframework.util.comparator;

import java.util.Comparator;
import org.springframework.util.Assert;

/* JADX INFO: loaded from: classes2.dex */
public class NullSafeComparator<T> implements Comparator<T> {
    private final Comparator<T> nonNullComparator;
    private final boolean nullsLow;
    public static final NullSafeComparator NULLS_LOW = new NullSafeComparator(true);
    public static final NullSafeComparator NULLS_HIGH = new NullSafeComparator(false);

    public NullSafeComparator(Comparator<T> comparator, boolean z2) {
        Assert.notNull(comparator, "The non-null comparator is required");
        this.nonNullComparator = comparator;
        this.nullsLow = z2;
    }

    private NullSafeComparator(boolean z2) {
        this.nonNullComparator = new ComparableComparator();
        this.nullsLow = z2;
    }

    @Override // java.util.Comparator
    public int compare(T t2, T t3) {
        if (t2 == t3) {
            return 0;
        }
        return t2 == null ? this.nullsLow ? -1 : 1 : t3 == null ? this.nullsLow ? 1 : -1 : this.nonNullComparator.compare(t2, t3);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullSafeComparator)) {
            return false;
        }
        NullSafeComparator nullSafeComparator = (NullSafeComparator) obj;
        return this.nonNullComparator.equals(nullSafeComparator.nonNullComparator) && this.nullsLow == nullSafeComparator.nullsLow;
    }

    public int hashCode() {
        return (this.nullsLow ? -1 : 1) * this.nonNullComparator.hashCode();
    }

    public String toString() {
        return "NullSafeComparator: non-null comparator [" + this.nonNullComparator + "]; " + (this.nullsLow ? "nulls low" : "nulls high");
    }
}
