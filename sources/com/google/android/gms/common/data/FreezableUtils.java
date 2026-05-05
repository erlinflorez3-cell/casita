package com.google.android.gms.common.data;

import com.facebook.common.internal.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        ImmutableList immutableList = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            immutableList.add(arrayList.get(i2).freeze());
        }
        return immutableList;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        ImmutableList immutableList = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e2 : eArr) {
            immutableList.add(e2.freeze());
        }
        return immutableList;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        ImmutableList immutableList = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            immutableList.add(it.next().freeze());
        }
        return immutableList;
    }
}
