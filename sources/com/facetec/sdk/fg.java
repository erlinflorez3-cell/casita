package com.facetec.sdk;

import androidx.compose.animation.core.AnimationKt;
import com.facetec.sdk.gn;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class fg {
    private static final Executor Code = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), gg.V("OkHttp ConnectionPool", true));
    private static /* synthetic */ boolean L = true;
    private final Runnable B;
    private boolean C;
    private final Deque<gm> D;
    final gi I;
    private final int V;
    private final long Z;

    /* JADX INFO: renamed from: com.facetec.sdk.fg$4 */
    final class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (true) {
                long jB = fg.this.B(System.nanoTime());
                if (jB == -1) {
                    return;
                }
                if (jB > 0) {
                    long j2 = jB / AnimationKt.MillisToNanos;
                    long j3 = jB - (AnimationKt.MillisToNanos * j2);
                    synchronized (fg.this) {
                        try {
                            fg.this.wait(j2, (int) j3);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public fg() {
        this(TimeUnit.MINUTES);
    }

    private fg(TimeUnit timeUnit) {
        this.B = new Runnable() { // from class: com.facetec.sdk.fg.4
            AnonymousClass4() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    long jB = fg.this.B(System.nanoTime());
                    if (jB == -1) {
                        return;
                    }
                    if (jB > 0) {
                        long j2 = jB / AnimationKt.MillisToNanos;
                        long j3 = jB - (AnimationKt.MillisToNanos * j2);
                        synchronized (fg.this) {
                            try {
                                fg.this.wait(j2, (int) j3);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        };
        this.D = new ArrayDeque();
        this.I = new gi();
        this.V = 5;
        this.Z = timeUnit.toNanos(5L);
    }

    final long B(long j2) {
        int size;
        synchronized (this) {
            gm gmVar = null;
            long j3 = Long.MIN_VALUE;
            int i2 = 0;
            int i3 = 0;
            for (gm gmVar2 : this.D) {
                List<Reference<gn>> list = gmVar2.I;
                int i4 = 0;
                while (true) {
                    if (i4 >= list.size()) {
                        size = list.size();
                        break;
                    }
                    Reference<gn> reference = list.get(i4);
                    if (reference.get() == null) {
                        hv.B().Code(new StringBuilder("A connection to ").append(gmVar2.i().Code().Z()).append(" was leaked. Did you forget to close a response body?").toString(), ((gn.V) reference).I);
                        list.remove(i4);
                        gmVar2.V = true;
                        if (list.isEmpty()) {
                            gmVar2.Code = j2 - this.Z;
                            size = 0;
                            break;
                        }
                    } else {
                        i4++;
                    }
                }
                if (size > 0) {
                    i3++;
                } else {
                    i2++;
                    long j4 = j2 - gmVar2.Code;
                    if (j4 > j3) {
                        gmVar = gmVar2;
                        j3 = j4;
                    }
                }
            }
            long j5 = this.Z;
            if (j3 >= j5 || i2 > this.V) {
                this.D.remove(gmVar);
                gg.V(gmVar.h());
                return 0L;
            }
            if (i2 > 0) {
                return j5 - j3;
            }
            if (i3 > 0) {
                return j5;
            }
            this.C = false;
            return -1L;
        }
    }

    @Nullable
    final gm Code(fc fcVar, gn gnVar, gc gcVar) {
        if (!L && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (gm gmVar : this.D) {
            if (gmVar.Code(fcVar, gcVar)) {
                gnVar.Z(gmVar);
                return gmVar;
            }
        }
        return null;
    }

    @Nullable
    final Socket Code(fc fcVar, gn gnVar) {
        if (!L && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (gm gmVar : this.D) {
            if (gmVar.Code(fcVar, null) && gmVar.o() && gmVar != gnVar.I()) {
                return gnVar.V(gmVar);
            }
        }
        return null;
    }

    final boolean I(gm gmVar) {
        if (!L && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (gmVar.V || this.V == 0) {
            this.D.remove(gmVar);
            return true;
        }
        notifyAll();
        return false;
    }

    final void V(gm gmVar) {
        if (!L && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.C) {
            this.C = true;
            Code.execute(this.B);
        }
        this.D.add(gmVar);
    }
}
