package com.google.common.util.concurrent;

import com.google.common.primitives.ImmutableLongArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLongArray longs;

    public AtomicDoubleArray(int length) {
        this.longs = new AtomicLongArray(length);
    }

    public AtomicDoubleArray(double[] array) {
        int length = array.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = Double.doubleToRawLongBits(array[i2]);
        }
        this.longs = new AtomicLongArray(jArr);
    }

    private void readObject(ObjectInputStream s2) throws ClassNotFoundException, IOException {
        s2.defaultReadObject();
        int i2 = s2.readInt();
        ImmutableLongArray.Builder builder = ImmutableLongArray.builder();
        for (int i3 = 0; i3 < i2; i3++) {
            builder.add(Double.doubleToRawLongBits(s2.readDouble()));
        }
        this.longs = new AtomicLongArray(builder.build().toArray());
    }

    private void writeObject(ObjectOutputStream s2) throws IOException {
        s2.defaultWriteObject();
        int length = length();
        s2.writeInt(length);
        for (int i2 = 0; i2 < length; i2++) {
            s2.writeDouble(get(i2));
        }
    }

    public double addAndGet(int i2, double delta) {
        long j2;
        double dLongBitsToDouble;
        do {
            j2 = this.longs.get(i2);
            dLongBitsToDouble = Double.longBitsToDouble(j2) + delta;
        } while (!this.longs.compareAndSet(i2, j2, Double.doubleToRawLongBits(dLongBitsToDouble)));
        return dLongBitsToDouble;
    }

    public final boolean compareAndSet(int i2, double expect, double update) {
        return this.longs.compareAndSet(i2, Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public final double get(int i2) {
        return Double.longBitsToDouble(this.longs.get(i2));
    }

    public final double getAndAdd(int i2, double delta) {
        long j2;
        double dLongBitsToDouble;
        do {
            j2 = this.longs.get(i2);
            dLongBitsToDouble = Double.longBitsToDouble(j2);
        } while (!this.longs.compareAndSet(i2, j2, Double.doubleToRawLongBits(dLongBitsToDouble + delta)));
        return dLongBitsToDouble;
    }

    public final double getAndSet(int i2, double newValue) {
        return Double.longBitsToDouble(this.longs.getAndSet(i2, Double.doubleToRawLongBits(newValue)));
    }

    public final void lazySet(int i2, double newValue) {
        this.longs.lazySet(i2, Double.doubleToRawLongBits(newValue));
    }

    public final int length() {
        return this.longs.length();
    }

    public final void set(int i2, double newValue) {
        this.longs.set(i2, Double.doubleToRawLongBits(newValue));
    }

    public String toString() {
        int length = length();
        int i2 = length - 1;
        if (i2 == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(length * 19);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int i3 = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.longs.get(i3)));
            if (i3 == i2) {
                return sb.append(AbstractJsonLexerKt.END_LIST).toString();
            }
            sb.append(", ");
            i3++;
        }
    }

    public final boolean weakCompareAndSet(int i2, double expect, double update) {
        return this.longs.weakCompareAndSet(i2, Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }
}
