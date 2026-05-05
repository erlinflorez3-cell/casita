package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class ObjectArrays {
    private ObjectArrays() {
    }

    static Object checkElementNotNull(@CheckForNull Object element, int index) {
        if (element != null) {
            return element;
        }
        throw new NullPointerException("at index " + index);
    }

    static Object[] checkElementsNotNull(Object... array) {
        checkElementsNotNull(array, array.length);
        return array;
    }

    static Object[] checkElementsNotNull(Object[] array, int length) {
        for (int i2 = 0; i2 < length; i2++) {
            checkElementNotNull(array[i2], i2);
        }
        return array;
    }

    public static <T> T[] concat(@ParametricNullness T t2, T[] tArr) {
        T[] tArr2 = (T[]) newArray(tArr, tArr.length + 1);
        tArr2[0] = t2;
        System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    public static <T> T[] concat(T[] tArr, @ParametricNullness T t2) {
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t2;
        return tArr2;
    }

    public static <T> T[] concat(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] tArr3 = (T[]) newArray(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    static Object[] copyAsObjectArray(Object[] elements, int offset, int length) {
        Preconditions.checkPositionIndexes(offset, offset + length, elements.length);
        if (length == 0) {
            return new Object[0];
        }
        Object[] objArr = new Object[length];
        System.arraycopy(elements, offset, objArr, 0, length);
        return objArr;
    }

    private static Object[] fillArray(Iterable<?> elements, Object[] array) {
        Iterator<?> it = elements.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            array[i2] = it.next();
            i2++;
        }
        return array;
    }

    public static <T> T[] newArray(Class<T> cls, int i2) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i2));
    }

    public static <T> T[] newArray(T[] tArr, int i2) {
        return (T[]) Platform.newArray(tArr, i2);
    }

    static void swap(Object[] array, int i2, int j2) {
        Object obj = array[i2];
        array[i2] = array[j2];
        array[j2] = obj;
    }

    static Object[] toArrayImpl(Collection<?> c2) {
        return fillArray(c2, new Object[c2.size()]);
    }

    static <T> T[] toArrayImpl(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) newArray(tArr, size);
        }
        fillArray(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    static <T> T[] toArrayImpl(Object[] objArr, int i2, int i3, T[] tArr) {
        Preconditions.checkPositionIndexes(i2, i2 + i3, objArr.length);
        if (tArr.length < i3) {
            tArr = (T[]) newArray(tArr, i3);
        } else if (tArr.length > i3) {
            tArr[i3] = null;
        }
        System.arraycopy(objArr, i2, tArr, 0, i3);
        return tArr;
    }
}
