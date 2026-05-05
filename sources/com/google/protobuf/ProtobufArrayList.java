package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final Object[] EMPTY_ARRAY;
    private static final ProtobufArrayList<Object> EMPTY_LIST;
    private E[] array;
    private int size;

    static {
        Object[] objArr = new Object[0];
        EMPTY_ARRAY = objArr;
        EMPTY_LIST = new ProtobufArrayList<>(objArr, 0, false);
    }

    ProtobufArrayList() {
        this(EMPTY_ARRAY, 0, true);
    }

    private ProtobufArrayList(E[] array, int size, boolean isMutable) {
        super(isMutable);
        this.array = array;
        this.size = size;
    }

    private static <E> E[] createArray(int i2) {
        return (E[]) new Object[i2];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private static int growSize(int previousSize) {
        return Math.max(((previousSize * 3) / 2) + 1, 10);
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        return "Index:" + index + ", Size:" + this.size;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        int i3;
        ensureIsMutable();
        if (i2 < 0 || i2 > (i3 = this.size)) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i2));
        }
        E[] eArr = this.array;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) createArray(growSize(eArr.length));
            System.arraycopy(this.array, 0, eArr2, 0, i2);
            System.arraycopy(this.array, i2, eArr2, i2 + 1, this.size - i2);
            this.array = eArr2;
        }
        this.array[i2] = e2;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        ensureIsMutable();
        int i2 = this.size;
        E[] eArr = this.array;
        if (i2 == eArr.length) {
            this.array = (E[]) Arrays.copyOf(this.array, growSize(eArr.length));
        }
        E[] eArr2 = this.array;
        int i3 = this.size;
        this.size = i3 + 1;
        eArr2[i3] = e2;
        this.modCount++;
        return true;
    }

    void ensureCapacity(int i2) {
        E[] eArr = this.array;
        if (i2 <= eArr.length) {
            return;
        }
        if (eArr.length == 0) {
            this.array = (E[]) new Object[Math.max(i2, 10)];
            return;
        }
        int length = eArr.length;
        while (length < i2) {
            length = growSize(length);
        }
        this.array = (E[]) Arrays.copyOf(this.array, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public ProtobufArrayList<E> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.size) {
            return new ProtobufArrayList<>(capacity == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, capacity), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        E[] eArr = this.array;
        E e2 = eArr[index];
        if (index < this.size - 1) {
            System.arraycopy(eArr, index + 1, eArr, index, (r2 - index) - 1);
        }
        this.size--;
        this.modCount++;
        return e2;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        E[] eArr = this.array;
        E e2 = eArr[index];
        eArr[index] = element;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }
}
