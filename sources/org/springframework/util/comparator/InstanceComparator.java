package org.springframework.util.comparator;

import java.util.Comparator;
import org.springframework.util.Assert;

/* JADX INFO: loaded from: classes2.dex */
public class InstanceComparator<T> implements Comparator<T> {
    private final Class<?>[] instanceOrder;

    public InstanceComparator(Class<?>... clsArr) {
        Assert.notNull(clsArr, "'instanceOrder' must not be null");
        this.instanceOrder = clsArr;
    }

    private int getOrder(T t2) {
        if (t2 != null) {
            int i2 = 0;
            while (true) {
                Class<?>[] clsArr = this.instanceOrder;
                if (i2 >= clsArr.length) {
                    break;
                }
                if (clsArr[i2].isInstance(t2)) {
                    return i2;
                }
                i2++;
            }
        }
        return this.instanceOrder.length;
    }

    @Override // java.util.Comparator
    public int compare(T t2, T t3) {
        int order = getOrder(t2);
        int order2 = getOrder(t3);
        if (order < order2) {
            return -1;
        }
        return order == order2 ? 0 : 1;
    }
}
