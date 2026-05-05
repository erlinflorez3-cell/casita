package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
final class Count implements Serializable {
    private int value;

    Count(int value) {
        this.value = value;
    }

    public void add(int delta) {
        this.value += delta;
    }

    public int addAndGet(int delta) {
        int i2 = this.value + delta;
        this.value = i2;
        return i2;
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof Count) && ((Count) obj).value == this.value;
    }

    public int get() {
        return this.value;
    }

    public int getAndSet(int newValue) {
        int i2 = this.value;
        this.value = newValue;
        return i2;
    }

    public int hashCode() {
        return this.value;
    }

    public void set(int newValue) {
        this.value = newValue;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
