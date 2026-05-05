package com.facetec.sdk;

import androidx.compose.animation.core.AnimationKt;
import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class hy extends im {
    private static final long B;

    @Nullable
    static hy I = null;
    private static final long Z;
    private long C;

    @Nullable
    private hy L;
    private boolean V;

    static final class Code extends Thread {
        Code() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
        
            r1.Z();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.facetec.sdk.hy> r2 = com.facetec.sdk.hy.class
                monitor-enter(r2)     // Catch: java.lang.InterruptedException -> L0
                com.facetec.sdk.hy r1 = com.facetec.sdk.hy.B()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                com.facetec.sdk.hy r0 = com.facetec.sdk.hy.I     // Catch: java.lang.Throwable -> L19
                if (r1 != r0) goto L14
                r0 = 0
                com.facetec.sdk.hy.I = r0     // Catch: java.lang.Throwable -> L19
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
                goto L1c
            L14:
                monitor-exit(r2)     // Catch: java.lang.InterruptedException -> L0
                r1.Z()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.InterruptedException -> L0
                throw r0     // Catch: java.lang.InterruptedException -> L0
            L1c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.hy.Code.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        Z = millis;
        B = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    static hy B() throws InterruptedException {
        hy hyVar = I.L;
        if (hyVar == null) {
            long jNanoTime = System.nanoTime();
            hy.class.wait(Z);
            if (I.L != null || System.nanoTime() - jNanoTime < B) {
                return null;
            }
            return I;
        }
        long jV = hyVar.V(System.nanoTime());
        if (jV > 0) {
            long j2 = jV / AnimationKt.MillisToNanos;
            hy.class.wait(j2, (int) (jV - (AnimationKt.MillisToNanos * j2)));
            return null;
        }
        I.L = hyVar.L;
        hyVar.L = null;
        return hyVar;
    }

    private static synchronized boolean B(hy hyVar) {
        hy hyVar2 = I;
        while (hyVar2 != null) {
            hy hyVar3 = hyVar2.L;
            if (hyVar3 == hyVar) {
                hyVar2.L = hyVar.L;
                hyVar.L = null;
                return false;
            }
            hyVar2 = hyVar3;
        }
        return true;
    }

    private static synchronized void Code(hy hyVar, long j2, boolean z2) {
        if (I == null) {
            I = new hy();
            new Code().start();
        }
        long jNanoTime = System.nanoTime();
        if (j2 != 0 && z2) {
            hyVar.C = Math.min(j2, hyVar.b_() - jNanoTime) + jNanoTime;
        } else if (j2 != 0) {
            hyVar.C = j2 + jNanoTime;
        } else {
            if (!z2) {
                throw new AssertionError();
            }
            hyVar.C = hyVar.b_();
        }
        long jV = hyVar.V(jNanoTime);
        hy hyVar2 = I;
        while (true) {
            hy hyVar3 = hyVar2.L;
            if (hyVar3 == null || jV < hyVar3.V(jNanoTime)) {
                break;
            } else {
                hyVar2 = hyVar2.L;
            }
        }
        hyVar.L = hyVar2.L;
        hyVar2.L = hyVar;
        if (hyVar2 == I) {
            hy.class.notify();
        }
    }

    private long V(long j2) {
        return this.C - j2;
    }

    final IOException B(IOException iOException) throws IOException {
        return !V() ? iOException : V(iOException);
    }

    public final void Code() {
        if (this.V) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jA_ = a_();
        boolean zD_ = d_();
        if (jA_ != 0 || zD_) {
            this.V = true;
            Code(this, jA_, zD_);
        }
    }

    final void I(boolean z2) throws IOException {
        if (V() && z2) {
            throw V((IOException) null);
        }
    }

    protected IOException V(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final boolean V() {
        if (!this.V) {
            return false;
        }
        this.V = false;
        return B(this);
    }

    protected void Z() {
    }
}
