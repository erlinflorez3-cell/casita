package yg;

import java.util.Iterator;

/* JADX INFO: renamed from: yg.zY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1634zY implements Iterable, Iterator {
    private A[] Kd;
    private int Xd = 0;

    public C1634zY(A[] aArr) {
        this.Kd = null;
        this.Kd = aArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.Xd < this.Kd.length;
    }

    @Override // java.lang.Iterable
    public Iterator<A> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public A next() {
        int i2 = this.Xd;
        this.Xd++;
        return this.Kd[i2];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
