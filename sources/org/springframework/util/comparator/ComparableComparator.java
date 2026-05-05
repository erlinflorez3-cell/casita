package org.springframework.util.comparator;

import java.lang.Comparable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class ComparableComparator<T extends Comparable<T>> implements Comparator<T> {
    public static final ComparableComparator INSTANCE = new ComparableComparator();

    @Override // java.util.Comparator
    public int compare(T t2, T t3) {
        return t2.compareTo(t3);
    }
}
