package com.facetec.sdk;

import androidx.core.app.NotificationCompat;
import com.facetec.sdk.cf;
import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class fu implements cf.I {
    final fv B;
    private boolean C;
    final hy Code;
    final ft I;

    @Nullable
    private fn L;
    final hb V;
    final boolean Z;

    final class Z extends gf {
        private static /* synthetic */ boolean I = true;
        private final cf.I B;

        Z(cf.I i2) {
            super("OkHttp %s", fu.this.h());
            this.B = i2;
        }

        final String I() {
            return fu.this.B.Code().D();
        }

        @Override // com.facetec.sdk.gf
        protected final void Z() {
            fu.this.Code.Code();
            boolean z2 = false;
            try {
                try {
                    fy fyVarF = fu.this.f();
                    z2 = true;
                    try {
                        if (fu.this.V.B()) {
                            cf.I i2 = this.B;
                            new IOException("Canceled");
                            i2.Z();
                        } else {
                            this.B.B(fyVarF);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        IOException iOExceptionI = fu.this.I(e);
                        if (z2) {
                            hv hvVarB = hv.B();
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            fu fuVar = fu.this;
                            hvVarB.Code(4, sb.append(new StringBuilder().append(fuVar.i() ? "canceled " : "").append(fuVar.Z ? "web socket" : NotificationCompat.CATEGORY_CALL).append(" to ").append(fuVar.h()).toString()).toString(), iOExceptionI);
                        } else {
                            fn unused = fu.this.L;
                            this.B.Z();
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } finally {
                fu.this.I.f().B(this);
            }
        }

        final void Z(ExecutorService executorService) {
            if (!I && Thread.holdsLock(fu.this.I.f())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    new InterruptedIOException("executor rejected").initCause(e2);
                    fn unused = fu.this.L;
                    this.B.Z();
                    fu.this.I.f().B(this);
                }
            } catch (Throwable th) {
                fu.this.I.f().B(this);
                throw th;
            }
        }
    }

    private fu(ft ftVar, fv fvVar, boolean z2) {
        this.I = ftVar;
        this.B = fvVar;
        this.Z = z2;
        this.V = new hb(ftVar);
        hy hyVar = new hy() { // from class: com.facetec.sdk.fu.3
            @Override // com.facetec.sdk.hy
            protected final void Z() {
                fu.this.V.V();
            }
        };
        this.Code = hyVar;
        hyVar.B(ftVar.L, TimeUnit.MILLISECONDS);
    }

    static fu Z(ft ftVar, fv fvVar, boolean z2) {
        fu fuVar = new fu(ftVar, fvVar, z2);
        fuVar.L = ftVar.Code.Code();
        return fuVar;
    }

    @Nullable
    final IOException I(@Nullable IOException iOException) {
        if (!this.Code.V()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // com.facetec.sdk.cf.I
    public final void Z(cf.I i2) {
        synchronized (this) {
            if (this.C) {
                throw new IllegalStateException("Already Executed");
            }
            this.C = true;
        }
        this.V.Z(hv.B().B("response.body().close()"));
        this.I.f().Z(new Z(i2));
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return Z(this.I, this.B, this.Z);
    }

    final fy f() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.I.V);
        arrayList.add(this.V);
        arrayList.add(new gr(this.I.B()));
        ft ftVar = this.I;
        arrayList.add(new gd(ftVar.F != null ? ftVar.F.Z : ftVar.S));
        arrayList.add(new gk(this.I));
        if (!this.Z) {
            arrayList.addAll(this.I.B);
        }
        arrayList.add(new go(this.Z));
        return new gt(arrayList, null, null, null, 0, this.B, this, this.L, this.I.C, this.I.D, this.I.f3178e).V(this.B);
    }

    final String h() {
        return this.B.Code().d();
    }

    public final boolean i() {
        return this.V.B();
    }
}
