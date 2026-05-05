package com.facetec.sdk;

import com.facetec.sdk.cf;
import com.facetec.sdk.hl;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class he implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ExecutorService f3244d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), gg.V("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static /* synthetic */ boolean f3245m = true;
    int B;
    int C;
    final hi D;
    long F;
    final V I;
    boolean S;
    final String V;
    final boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f3246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set<Integer> f3247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final hm f3248c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final hj f3249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f3250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f3251g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Socket f3253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ExecutorService f3254j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private B f3255o;
    final Map<Integer, hk> Code = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f3252h = 0;
    hm L = new hm();

    class B extends gf implements hl.Z {
        private hl V;

        B(hl hlVar) {
            super("OkHttp %s", he.this.V);
            this.V = hlVar;
        }

        @Override // com.facetec.sdk.hl.Z
        public final void B(int i2, gx gxVar) {
            if (he.Code(i2)) {
                he.this.C(i2);
                return;
            }
            hk hkVarB = he.this.B(i2);
            if (hkVarB != null) {
                hkVarB.Z(gxVar);
            }
        }

        @Override // com.facetec.sdk.hl.Z
        public final void B(int i2, ib ibVar) {
            hk[] hkVarArr;
            ibVar.S();
            synchronized (he.this) {
                hkVarArr = (hk[]) he.this.Code.values().toArray(new hk[he.this.Code.size()]);
                he.this.S = true;
            }
            for (hk hkVar : hkVarArr) {
                if (hkVar.I() > i2 && hkVar.Code()) {
                    hkVar.Z(gx.REFUSED_STREAM);
                    he.this.B(hkVar.I());
                }
            }
        }

        @Override // com.facetec.sdk.hl.Z
        public final void B(final hm hmVar) {
            int i2;
            hk[] hkVarArr;
            long j2;
            synchronized (he.this) {
                int iCode = he.this.f3248c.Code();
                hm hmVar2 = he.this.f3248c;
                for (int i3 = 0; i3 < 10; i3++) {
                    if (hmVar.B(i3)) {
                        hmVar2.I(i3, hmVar.I(i3));
                    }
                }
                try {
                    he.this.f3250f.execute(new gf("OkHttp %s ACK Settings", new Object[]{he.this.V}) { // from class: com.facetec.sdk.he.B.2
                        @Override // com.facetec.sdk.gf
                        public final void Z() {
                            try {
                                he.this.f3249e.Code(hmVar);
                            } catch (IOException unused) {
                                he.this.D();
                            }
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
                int iCode2 = he.this.f3248c.Code();
                hkVarArr = null;
                if (iCode2 == -1 || iCode2 == iCode) {
                    j2 = 0;
                } else {
                    j2 = iCode2 - iCode;
                    if (!he.this.f3246a) {
                        he.this.f3246a = true;
                    }
                    if (!he.this.Code.isEmpty()) {
                        hkVarArr = (hk[]) he.this.Code.values().toArray(new hk[he.this.Code.size()]);
                    }
                }
                he.f3244d.execute(new gf("OkHttp %s settings", he.this.V) { // from class: com.facetec.sdk.he.B.1
                    @Override // com.facetec.sdk.gf
                    public final void Z() {
                        he.this.I.I(he.this);
                    }
                });
            }
            if (hkVarArr == null || j2 == 0) {
                return;
            }
            for (hk hkVar : hkVarArr) {
                synchronized (hkVar) {
                    hkVar.Z(j2);
                }
            }
        }

        @Override // com.facetec.sdk.hl.Z
        public final void B(boolean z2, int i2, List<hc> list) {
            if (he.Code(i2)) {
                he.this.V(i2);
                return;
            }
            synchronized (he.this) {
                hk hkVarZ = he.this.Z(i2);
                if (hkVarZ != null) {
                    hkVarZ.B(list);
                    if (z2) {
                        hkVarZ.D();
                        return;
                    }
                    return;
                }
                if (he.this.S) {
                    return;
                }
                if (i2 <= he.this.B) {
                    return;
                }
                if (i2 % 2 == he.this.C % 2) {
                    return;
                }
                final hk hkVar = new hk(i2, he.this, false, z2, gg.Z(list));
                he.this.B = i2;
                he.this.Code.put(Integer.valueOf(i2), hkVar);
                he.f3244d.execute(new gf("OkHttp %s stream %d", new Object[]{he.this.V, Integer.valueOf(i2)}) { // from class: com.facetec.sdk.he.B.3
                    @Override // com.facetec.sdk.gf
                    public final void Z() {
                        try {
                            he.this.I.V(hkVar);
                        } catch (IOException e2) {
                            hv.B().Code(4, new StringBuilder("Http2Connection.Listener failure for ").append(he.this.V).toString(), e2);
                            try {
                                hkVar.V(gx.PROTOCOL_ERROR);
                            } catch (IOException unused) {
                            }
                        }
                    }
                });
            }
        }

        @Override // com.facetec.sdk.hl.Z
        public final void Code(int i2, long j2) {
            if (i2 == 0) {
                synchronized (he.this) {
                    he.this.F += j2;
                    he.this.notifyAll();
                }
                return;
            }
            hk hkVarZ = he.this.Z(i2);
            if (hkVarZ != null) {
                synchronized (hkVarZ) {
                    hkVarZ.Z(j2);
                }
            }
        }

        @Override // com.facetec.sdk.hl.Z
        public final void I(int i2, List<hc> list) {
            he.this.I(i2);
        }

        @Override // com.facetec.sdk.hl.Z
        public final void V(boolean z2, int i2, int i3) {
            if (!z2) {
                try {
                    he.this.f3250f.execute(he.this.new Z(true, i2, i3));
                } catch (RejectedExecutionException unused) {
                }
            } else {
                synchronized (he.this) {
                    he.V(he.this);
                    he.this.notifyAll();
                }
            }
        }

        @Override // com.facetec.sdk.hl.Z
        public final void V(boolean z2, int i2, cf.I i3, int i4) throws IOException {
            if (he.Code(i2)) {
                he.this.Code(i2, i3, i4);
                return;
            }
            hk hkVarZ = he.this.Z(i2);
            if (hkVarZ == null) {
                he.this.V(i2, gx.PROTOCOL_ERROR);
                long j2 = i4;
                he.this.B(j2);
                i3.V(j2);
                return;
            }
            hkVarZ.I(i3, i4);
            if (z2) {
                hkVarZ.D();
            }
        }

        @Override // com.facetec.sdk.gf
        protected final void Z() {
            gx gxVar;
            he heVar;
            gx gxVar2 = gx.INTERNAL_ERROR;
            gx gxVar3 = gx.INTERNAL_ERROR;
            try {
                try {
                    try {
                        this.V.B(this);
                        while (this.V.Z(false, this)) {
                        }
                        gxVar2 = gx.NO_ERROR;
                        gxVar = gx.CANCEL;
                        heVar = he.this;
                    } catch (Throwable th) {
                        try {
                            he.this.Code(gxVar2, gxVar3);
                        } catch (IOException unused) {
                        }
                        gg.B(this.V);
                        throw th;
                    }
                } catch (IOException unused2) {
                    gxVar2 = gx.PROTOCOL_ERROR;
                    gxVar = gx.PROTOCOL_ERROR;
                    heVar = he.this;
                }
                heVar.Code(gxVar2, gxVar);
            } catch (IOException unused3) {
            }
            gg.B(this.V);
        }
    }

    public static class I {
        Socket B;
        cf.I Code;
        int F;
        cf.I V;
        String Z;
        V I = V.Z;
        hi C = hi.B;
        boolean D = true;

        public final I B(int i2) {
            this.F = i2;
            return this;
        }

        public final he Code() {
            return new he(this);
        }

        public final I V(V v2) {
            this.I = v2;
            return this;
        }

        public final I Z(Socket socket, String str, cf.I i2, cf.I i3) {
            this.B = socket;
            this.Z = str;
            this.V = i2;
            this.Code = i3;
            return this;
        }
    }

    public static abstract class V {
        public static final V Z = new V() { // from class: com.facetec.sdk.he.V.4
            @Override // com.facetec.sdk.he.V
            public final void V(hk hkVar) throws IOException {
                hkVar.V(gx.REFUSED_STREAM);
            }
        };

        public void I(he heVar) {
        }

        public abstract void V(hk hkVar) throws IOException;
    }

    final class Z extends gf {
        private int B;
        private boolean V;
        private int Z;

        Z(boolean z2, int i2, int i3) {
            super("OkHttp %s ping %08x%08x", he.this.V, Integer.valueOf(i2), Integer.valueOf(i3));
            this.V = z2;
            this.Z = i2;
            this.B = i3;
        }

        @Override // com.facetec.sdk.gf
        public final void Z() {
            he.this.Code(this.V, this.Z, this.B);
        }
    }

    he(I i2) {
        hm hmVar = new hm();
        this.f3248c = hmVar;
        this.f3246a = false;
        this.f3247b = new LinkedHashSet();
        this.D = i2.C;
        boolean z2 = i2.D;
        this.Z = z2;
        this.I = i2.I;
        this.C = i2.D ? 1 : 2;
        if (i2.D) {
            this.C += 2;
        }
        if (i2.D) {
            this.L.I(7, 16777216);
        }
        String str = i2.Z;
        this.V = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, gg.V(gg.Code("OkHttp %s Writer", str), false));
        this.f3250f = scheduledThreadPoolExecutor;
        if (i2.F != 0) {
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new Z(false, 0, 0), i2.F, i2.F, TimeUnit.MILLISECONDS);
        }
        this.f3254j = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), gg.V(gg.Code("OkHttp %s Push Observer", str), true));
        hmVar.I(7, 65535);
        hmVar.I(5, 16384);
        this.F = hmVar.Code();
        this.f3253i = i2.B;
        this.f3249e = new hj(i2.Code, z2);
        this.f3255o = new B(new hl(i2.V, z2));
    }

    private hk B(List<hc> list, boolean z2) throws IOException {
        int i2;
        hk hkVar;
        boolean z3;
        boolean z4 = !z2;
        synchronized (this.f3249e) {
            synchronized (this) {
                if (this.C > 1073741823) {
                    Code(gx.REFUSED_STREAM);
                }
                if (this.S) {
                    throw new gz();
                }
                i2 = this.C;
                this.C = i2 + 2;
                hkVar = new hk(i2, this, z4, false, null);
                z3 = !z2 || this.F == 0 || hkVar.B == 0;
                if (hkVar.Z()) {
                    this.Code.put(Integer.valueOf(i2), hkVar);
                }
            }
            this.f3249e.B(z4, i2, list);
        }
        if (z3) {
            this.f3249e.I();
        }
        return hkVar;
    }

    private void Code(gx gxVar) throws IOException {
        synchronized (this.f3249e) {
            synchronized (this) {
                if (this.S) {
                    return;
                }
                this.S = true;
                this.f3249e.V(this.B, gxVar, gg.B);
            }
        }
    }

    static boolean Code(int i2) {
        return i2 != 0 && (i2 + 1) - (i2 | 1) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        try {
            gx gxVar = gx.PROTOCOL_ERROR;
            Code(gxVar, gxVar);
        } catch (IOException unused) {
        }
    }

    static /* synthetic */ boolean V(he heVar) {
        heVar.f3251g = false;
        return false;
    }

    private synchronized void Z(gf gfVar) {
        if (!Z()) {
            this.f3254j.execute(gfVar);
        }
    }

    public final synchronized int B() {
        return this.f3248c.B();
    }

    final synchronized hk B(int i2) {
        hk hkVarRemove;
        hkVarRemove = this.Code.remove(Integer.valueOf(i2));
        notifyAll();
        return hkVarRemove;
    }

    final void B(int i2, gx gxVar) throws IOException {
        this.f3249e.I(i2, gxVar);
    }

    final synchronized void B(long j2) {
        long j3 = this.f3252h + j2;
        this.f3252h = j3;
        if (j3 >= this.L.Code() / 2) {
            Z(0, this.f3252h);
            this.f3252h = 0L;
        }
    }

    final void C(final int i2) {
        Z(new gf("OkHttp %s Push Reset[%s]", new Object[]{this.V, Integer.valueOf(i2)}) { // from class: com.facetec.sdk.he.8
            @Override // com.facetec.sdk.gf
            public final void Z() {
                synchronized (he.this) {
                    he.this.f3247b.remove(Integer.valueOf(i2));
                }
            }
        });
    }

    public final void Code() throws IOException {
        this.f3249e.I();
    }

    final void Code(final int i2, cf.I i3, final int i4) throws IOException {
        final ie ieVar = new ie();
        long j2 = i4;
        i3.Z(j2);
        i3.V(ieVar, j2);
        if (ieVar.h() != j2) {
            throw new IOException(new StringBuilder().append(ieVar.h()).append(" != ").append(i4).toString());
        }
        Z(new gf("OkHttp %s Push Data[%s]", new Object[]{this.V, Integer.valueOf(i2)}) { // from class: com.facetec.sdk.he.4
            @Override // com.facetec.sdk.gf
            public final void Z() {
                try {
                    he.this.D.B(ieVar, i4);
                    he.this.f3249e.I(i2, gx.CANCEL);
                    synchronized (he.this) {
                        he.this.f3247b.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused) {
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r5 = java.lang.Math.min((int) java.lang.Math.min(r12, r0), r8.f3249e.V());
        r0 = r5;
        r8.F -= r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Code(int r9, boolean r10, com.facetec.sdk.ie r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r6 = 0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            r4 = 0
            if (r0 != 0) goto Ld
            com.facetec.sdk.hj r0 = r8.f3249e
            r0.I(r10, r9, r11, r4)
            return
        Ld:
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r0 = r8.F     // Catch: java.lang.InterruptedException -> L57 java.lang.Throwable -> L64
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L28
            java.util.Map<java.lang.Integer, com.facetec.sdk.hk> r1 = r8.Code     // Catch: java.lang.InterruptedException -> L57 java.lang.Throwable -> L64
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.InterruptedException -> L57 java.lang.Throwable -> L64
            boolean r0 = r1.containsKey(r0)     // Catch: java.lang.InterruptedException -> L57 java.lang.Throwable -> L64
            if (r0 == 0) goto L4e
            r8.wait()     // Catch: java.lang.InterruptedException -> L57 java.lang.Throwable -> L64
            goto L12
        L28:
            long r0 = java.lang.Math.min(r12, r0)     // Catch: java.lang.Throwable -> L64
            int r2 = (int) r0     // Catch: java.lang.Throwable -> L64
            com.facetec.sdk.hj r0 = r8.f3249e     // Catch: java.lang.Throwable -> L64
            int r0 = r0.V()     // Catch: java.lang.Throwable -> L64
            int r5 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L64
            long r2 = r8.F     // Catch: java.lang.Throwable -> L64
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L64
            long r2 = r2 - r0
            r8.F = r2     // Catch: java.lang.Throwable -> L64
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L64
            long r12 = r12 - r0
            com.facetec.sdk.hj r1 = r8.f3249e
            if (r10 == 0) goto L4c
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L4c
            r0 = 1
        L48:
            r1.I(r0, r9, r11, r5)
            goto Ld
        L4c:
            r0 = r4
            goto L48
        L4e:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.InterruptedException -> L57 java.lang.Throwable -> L64
            java.lang.String r0 = "stream closed"
            r1.<init>(r0)     // Catch: java.lang.InterruptedException -> L57 java.lang.Throwable -> L64
            throw r1     // Catch: java.lang.InterruptedException -> L57 java.lang.Throwable -> L64
        L57:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L64
            r0.interrupt()     // Catch: java.lang.Throwable -> L64
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L64
            r0.<init>()     // Catch: java.lang.Throwable -> L64
            throw r0     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.he.Code(int, boolean, com.facetec.sdk.ie, long):void");
    }

    final void Code(gx gxVar, gx gxVar2) throws IOException {
        if (!f3245m && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        hk[] hkVarArr = null;
        try {
            Code(gxVar);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.Code.isEmpty()) {
                hkVarArr = (hk[]) this.Code.values().toArray(new hk[this.Code.size()]);
                this.Code.clear();
            }
        }
        if (hkVarArr != null) {
            for (hk hkVar : hkVarArr) {
                try {
                    hkVar.V(gxVar2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.f3249e.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.f3253i.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.f3250f.shutdown();
        this.f3254j.shutdown();
        if (e != null) {
            throw e;
        }
    }

    final void Code(boolean z2, int i2, int i3) {
        boolean z3;
        if (!z2) {
            synchronized (this) {
                z3 = this.f3251g;
                this.f3251g = true;
            }
            if (z3) {
                D();
                return;
            }
        }
        try {
            this.f3249e.Z(z2, i2, i3);
        } catch (IOException unused) {
            D();
        }
    }

    public final hk I(List<hc> list, boolean z2) throws IOException {
        return B(list, z2);
    }

    final void I(final int i2) {
        synchronized (this) {
            if (this.f3247b.contains(Integer.valueOf(i2))) {
                V(i2, gx.PROTOCOL_ERROR);
                return;
            }
            this.f3247b.add(Integer.valueOf(i2));
            try {
                Z(new gf("OkHttp %s Push Request[%s]", new Object[]{this.V, Integer.valueOf(i2)}) { // from class: com.facetec.sdk.he.2
                    @Override // com.facetec.sdk.gf
                    public final void Z() {
                        try {
                            he.this.f3249e.I(i2, gx.CANCEL);
                            synchronized (he.this) {
                                he.this.f3247b.remove(Integer.valueOf(i2));
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public final void V() throws IOException {
        this.f3249e.Code();
        this.f3249e.V(this.L);
        if (this.L.Code() != 65535) {
            this.f3249e.Code(0, r1 - 65535);
        }
        new Thread(this.f3255o).start();
    }

    final void V(final int i2) {
        try {
            Z(new gf("OkHttp %s Push Headers[%s]", new Object[]{this.V, Integer.valueOf(i2)}) { // from class: com.facetec.sdk.he.5
                @Override // com.facetec.sdk.gf
                public final void Z() {
                    try {
                        he.this.f3249e.I(i2, gx.CANCEL);
                        synchronized (he.this) {
                            he.this.f3247b.remove(Integer.valueOf(i2));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    final void V(final int i2, final gx gxVar) {
        try {
            this.f3250f.execute(new gf("OkHttp %s stream %d", new Object[]{this.V, Integer.valueOf(i2)}) { // from class: com.facetec.sdk.he.1
                @Override // com.facetec.sdk.gf
                public final void Z() {
                    try {
                        he.this.B(i2, gxVar);
                    } catch (IOException unused) {
                        he.this.D();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    final synchronized hk Z(int i2) {
        return this.Code.get(Integer.valueOf(i2));
    }

    final void Z(final int i2, final long j2) {
        try {
            this.f3250f.execute(new gf("OkHttp Window Update %s stream %d", new Object[]{this.V, Integer.valueOf(i2)}) { // from class: com.facetec.sdk.he.3
                @Override // com.facetec.sdk.gf
                public final void Z() {
                    try {
                        he.this.f3249e.Code(i2, j2);
                    } catch (IOException unused) {
                        he.this.D();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public final synchronized boolean Z() {
        return this.S;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Code(gx.NO_ERROR, gx.CANCEL);
    }
}
