package com.facetec.sdk;

import com.facetec.sdk.cf;
import com.facetec.sdk.hc;
import io.sentry.ProfilingTraceData;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes3.dex */
public final class hk {

    /* JADX INFO: renamed from: a */
    private static /* synthetic */ boolean f3256a = true;
    long B;
    private hc.B C;
    final Z Code;
    final V D;
    gx F;
    final int I;
    final V L;
    private final Deque<fr> S;
    long V = 0;
    final he Z;

    /* JADX INFO: renamed from: d */
    private boolean f3257d;

    /* JADX INFO: renamed from: e */
    private final I f3258e;

    final class I implements cf.I {
        private static /* synthetic */ boolean C = true;
        boolean B;
        private final long Code;
        boolean Z;
        private final ie I = new ie();
        private final ie V = new ie();

        I(long j2) {
            this.Code = j2;
        }

        private void S(long j2) {
            if (!C && Thread.holdsLock(hk.this)) {
                throw new AssertionError();
            }
            hk.this.Z.B(j2);
        }

        final void I(cf.I i2, long j2) throws IOException {
            boolean z2;
            boolean z3;
            if (!C && Thread.holdsLock(hk.this)) {
                throw new AssertionError();
            }
            while (j2 > 0) {
                synchronized (hk.this) {
                    z2 = this.B;
                    z3 = this.V.h() + j2 > this.Code;
                }
                if (z3) {
                    i2.V(j2);
                    hk.this.I(gx.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z2) {
                    i2.V(j2);
                    return;
                }
                long jV = i2.V(this.I, j2);
                if (jV == -1) {
                    throw new EOFException();
                }
                j2 -= jV;
                synchronized (hk.this) {
                    boolean z4 = this.V.h() == 0;
                    this.V.V(this.I);
                    if (z4) {
                        hk.this.notifyAll();
                    }
                }
            }
        }

        @Override // com.facetec.sdk.cf.I
        public final im S() {
            return hk.this.D;
        }

        @Override // com.facetec.sdk.cf.I
        public final long V(ie ieVar, long j2) throws IOException {
            gx gxVar;
            long jV;
            fr frVar;
            hc.B b2;
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
            }
            while (true) {
                synchronized (hk.this) {
                    hk.this.D.Code();
                    try {
                        gxVar = hk.this.F != null ? hk.this.F : null;
                        if (this.Z) {
                            throw new IOException("stream closed");
                        }
                        if (hk.this.S.isEmpty() || hk.this.C == null) {
                            if (this.V.h() > 0) {
                                ie ieVar2 = this.V;
                                jV = ieVar2.V(ieVar, Math.min(j2, ieVar2.h()));
                                hk.this.V += jV;
                                if (gxVar == null && hk.this.V >= hk.this.Z.L.Code() / 2) {
                                    hk.this.Z.Z(hk.this.I, hk.this.V);
                                    hk.this.V = 0L;
                                }
                            } else if (this.B || gxVar != null) {
                                jV = -1;
                            } else {
                                hk.this.F();
                            }
                            frVar = null;
                            b2 = null;
                        } else {
                            frVar = (fr) hk.this.S.removeFirst();
                            b2 = hk.this.C;
                            jV = -1;
                        }
                        if (frVar == null || b2 == null) {
                            break;
                        }
                    } finally {
                        hk.this.D.I();
                    }
                }
            }
            if (jV != -1) {
                S(jV);
                return jV;
            }
            if (gxVar == null) {
                return -1L;
            }
            throw new hp(gxVar);
        }

        @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() throws IOException {
            long jH;
            ArrayList arrayList;
            hc.B b2;
            synchronized (hk.this) {
                this.Z = true;
                jH = this.V.h();
                this.V.m();
                if (hk.this.S.isEmpty() || hk.this.C == null) {
                    arrayList = null;
                    b2 = null;
                } else {
                    arrayList = new ArrayList(hk.this.S);
                    hk.this.S.clear();
                    b2 = hk.this.C;
                }
                hk.this.notifyAll();
            }
            if (jH > 0) {
                S(jH);
            }
            hk.this.L();
            if (b2 != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    class V extends hy {
        V() {
        }

        public final void I() throws IOException {
            if (V()) {
                throw V((IOException) null);
            }
        }

        @Override // com.facetec.sdk.hy
        protected final IOException V(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.facetec.sdk.hy
        protected final void Z() {
            hk.this.I(gx.CANCEL);
        }
    }

    final class Z implements cf.I {
        private static /* synthetic */ boolean V = true;
        boolean B;
        boolean Code;
        private final ie I = new ie();

        Z() {
        }

        private void V(boolean z2) throws IOException {
            long jMin;
            synchronized (hk.this) {
                hk.this.L.Code();
                while (hk.this.B <= 0 && !this.B && !this.Code && hk.this.F == null) {
                    try {
                        hk.this.F();
                    } finally {
                    }
                }
                hk.this.L.I();
                hk.this.S();
                jMin = Math.min(hk.this.B, this.I.h());
                hk.this.B -= jMin;
            }
            hk.this.L.Code();
            try {
                hk.this.Z.Code(hk.this.I, z2 && jMin == this.I.h(), this.I, jMin);
            } finally {
            }
        }

        @Override // com.facetec.sdk.cf.I
        public final im S() {
            return hk.this.L;
        }

        @Override // com.facetec.sdk.cf.I
        public final void Z(ie ieVar, long j2) throws IOException {
            if (!V && Thread.holdsLock(hk.this)) {
                throw new AssertionError();
            }
            this.I.Z(ieVar, j2);
            while (this.I.h() >= Http2Stream.EMIT_BUFFER_SIZE) {
                V(false);
            }
        }

        @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() throws IOException {
            if (!V && Thread.holdsLock(hk.this)) {
                throw new AssertionError();
            }
            synchronized (hk.this) {
                if (this.Code) {
                    return;
                }
                if (!hk.this.Code.B) {
                    if (this.I.h() > 0) {
                        while (this.I.h() > 0) {
                            V(true);
                        }
                    } else {
                        hk.this.Z.Code(hk.this.I, true, null, 0L);
                    }
                }
                synchronized (hk.this) {
                    this.Code = true;
                }
                hk.this.Z.Code();
                hk.this.L();
            }
        }

        @Override // com.facetec.sdk.cf.I, java.io.Flushable
        public final void flush() throws IOException {
            if (!V && Thread.holdsLock(hk.this)) {
                throw new AssertionError();
            }
            synchronized (hk.this) {
                hk.this.S();
            }
            while (this.I.h() > 0) {
                V(false);
                hk.this.Z.Code();
            }
        }
    }

    hk(int i2, he heVar, boolean z2, boolean z3, @Nullable fr frVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.S = arrayDeque;
        this.D = new V();
        this.L = new V();
        this.F = null;
        if (heVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.I = i2;
        this.Z = heVar;
        this.B = heVar.f3248c.Code();
        I i3 = new I(heVar.L.Code());
        this.f3258e = i3;
        Z z4 = new Z();
        this.Code = z4;
        i3.B = z3;
        z4.B = z2;
        if (frVar != null) {
            arrayDeque.add(frVar);
        }
        if (Code() && frVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!Code() && frVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private boolean Code(gx gxVar) {
        if (!f3256a && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.F != null) {
                return false;
            }
            if (this.f3258e.B && this.Code.B) {
                return false;
            }
            this.F = gxVar;
            notifyAll();
            this.Z.B(this.I);
            return true;
        }
    }

    public final synchronized fr B() throws IOException {
        this.D.Code();
        while (this.S.isEmpty() && this.F == null) {
            try {
                F();
            } catch (Throwable th) {
                this.D.I();
                throw th;
            }
        }
        this.D.I();
        if (this.S.isEmpty()) {
            throw new hp(this.F);
        }
        return this.S.removeFirst();
    }

    final void B(List<hc> list) {
        boolean Z2;
        if (!f3256a && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f3257d = true;
            this.S.add(gg.Z(list));
            Z2 = Z();
            notifyAll();
        }
        if (Z2) {
            return;
        }
        this.Z.B(this.I);
    }

    public final cf.I C() {
        synchronized (this) {
            if (!this.f3257d && !Code()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.Code;
    }

    public final boolean Code() {
        int i2 = this.I;
        return this.Z.Z == ((i2 + 1) - (i2 | 1) == 1);
    }

    final void D() {
        boolean Z2;
        if (!f3256a && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f3258e.B = true;
            Z2 = Z();
            notifyAll();
        }
        if (Z2) {
            return;
        }
        this.Z.B(this.I);
    }

    final void F() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final int I() {
        return this.I;
    }

    final void I(cf.I i2, int i3) throws IOException {
        if (!f3256a && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f3258e.I(i2, i3);
    }

    public final void I(gx gxVar) {
        if (Code(gxVar)) {
            this.Z.V(this.I, gxVar);
        }
    }

    final void L() throws IOException {
        boolean z2;
        boolean Z2;
        if (!f3256a && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            z2 = !this.f3258e.B && this.f3258e.Z && (this.Code.B || this.Code.Code);
            Z2 = Z();
        }
        if (z2) {
            V(gx.CANCEL);
        } else {
            if (Z2) {
                return;
            }
            this.Z.B(this.I);
        }
    }

    final void S() throws IOException {
        if (this.Code.Code) {
            throw new IOException("stream closed");
        }
        if (this.Code.B) {
            throw new IOException("stream finished");
        }
        if (this.F != null) {
            throw new hp(this.F);
        }
    }

    public final cf.I V() {
        return this.f3258e;
    }

    public final void V(gx gxVar) throws IOException {
        if (Code(gxVar)) {
            this.Z.B(this.I, gxVar);
        }
    }

    final void Z(long j2) {
        this.B += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    final synchronized void Z(gx gxVar) {
        if (this.F == null) {
            this.F = gxVar;
            notifyAll();
        }
    }

    public final synchronized boolean Z() {
        if (this.F != null) {
            return false;
        }
        if ((this.f3258e.B || this.f3258e.Z) && (this.Code.B || this.Code.Code)) {
            if (this.f3257d) {
                return false;
            }
        }
        return true;
    }
}
