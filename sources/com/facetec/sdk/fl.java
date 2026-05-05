package com.facetec.sdk;

import com.facetec.sdk.fu;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class fl {
    private static /* synthetic */ boolean L = true;

    @Nullable
    private ExecutorService B;

    @Nullable
    private Runnable I;
    private int Code = 64;
    private int V = 5;
    private final Deque<fu.Z> Z = new ArrayDeque();
    private final Deque<fu.Z> F = new ArrayDeque();
    private final Deque<fu> S = new ArrayDeque();

    private int Code(fu.Z z2) {
        int i2 = 0;
        for (fu.Z z3 : this.F) {
            if (!fu.this.Z && z3.I().equals(z2.I())) {
                i2++;
            }
        }
        return i2;
    }

    private synchronized int I() {
        return this.F.size() + this.S.size();
    }

    private boolean V() {
        int i2;
        boolean z2;
        if (!L && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<fu.Z> it = this.Z.iterator();
            while (it.hasNext()) {
                fu.Z next = it.next();
                if (this.F.size() >= this.Code) {
                    break;
                }
                if (Code(next) < this.V) {
                    it.remove();
                    arrayList.add(next);
                    this.F.add(next);
                }
            }
            z2 = I() > 0;
        }
        int size = arrayList.size();
        for (i2 = 0; i2 < size; i2++) {
            ((fu.Z) arrayList.get(i2)).Z(Z());
        }
        return z2;
    }

    private synchronized ExecutorService Z() {
        if (this.B == null) {
            this.B = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), gg.V("OkHttp Dispatcher", false));
        }
        return this.B;
    }

    public final void B() {
        synchronized (this) {
            this.Code = 1;
        }
        V();
    }

    final void B(fu.Z z2) {
        Runnable runnable;
        Deque<fu.Z> deque = this.F;
        synchronized (this) {
            if (!deque.remove(z2)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.I;
        }
        if (V() || runnable == null) {
            return;
        }
        runnable.run();
    }

    final void Z(fu.Z z2) {
        synchronized (this) {
            this.Z.add(z2);
        }
        V();
    }
}
