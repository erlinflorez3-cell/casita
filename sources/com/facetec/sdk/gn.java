package com.facetec.sdk;

import com.facetec.sdk.cf;
import com.facetec.sdk.fo;
import com.facetec.sdk.gq;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gn {

    /* JADX INFO: renamed from: b */
    private static /* synthetic */ boolean f3231b = true;
    private gq.Code B;
    private final gq C;
    private cf.I Code;
    private int D;
    private gm F;
    private fc I;
    private final Object L;
    private fn S;
    private gc V;
    private final fg Z;

    /* JADX INFO: renamed from: a */
    private gp f3232a;

    /* JADX INFO: renamed from: c */
    private boolean f3233c;

    /* JADX INFO: renamed from: e */
    private boolean f3234e;

    public static final class V extends WeakReference<gn> {
        public final Object I;

        V(gn gnVar, Object obj) {
            super(gnVar);
            this.I = obj;
        }
    }

    public gn(fg fgVar, fc fcVar, cf.I i2, fn fnVar, Object obj) {
        this.Z = fgVar;
        this.I = fcVar;
        this.Code = i2;
        this.S = fnVar;
        this.C = new gq(fcVar, S());
        this.L = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.Socket B(boolean r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = com.facetec.sdk.gn.f3231b
            if (r0 != 0) goto Lc
            com.facetec.sdk.fg r0 = r4.Z
            boolean r0 = java.lang.Thread.holdsLock(r0)
            if (r0 == 0) goto L5b
        Lc:
            r3 = 0
            if (r7 == 0) goto L11
            r4.f3232a = r3
        L11:
            r1 = 1
            if (r6 == 0) goto L16
            r4.f3233c = r1
        L16:
            com.facetec.sdk.gm r0 = r4.F
            if (r0 == 0) goto L58
            if (r5 == 0) goto L1e
            r0.V = r1
        L1e:
            com.facetec.sdk.gp r0 = r4.f3232a
            if (r0 != 0) goto L58
            boolean r0 = r4.f3233c
            if (r0 != 0) goto L2c
            com.facetec.sdk.gm r0 = r4.F
            boolean r0 = r0.V
            if (r0 == 0) goto L58
        L2c:
            com.facetec.sdk.gm r0 = r4.F
            r4.Code(r0)
            com.facetec.sdk.gm r0 = r4.F
            java.util.List<java.lang.ref.Reference<com.facetec.sdk.gn>> r0 = r0.I
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L59
            com.facetec.sdk.gm r2 = r4.F
            long r0 = java.lang.System.nanoTime()
            r2.Code = r0
            com.facetec.sdk.ge r2 = com.facetec.sdk.ge.Code
            com.facetec.sdk.fg r1 = r4.Z
            com.facetec.sdk.gm r0 = r4.F
            boolean r0 = r2.V(r1, r0)
            if (r0 == 0) goto L59
            com.facetec.sdk.gm r0 = r4.F
            java.net.Socket r0 = r0.h()
        L55:
            r4.F = r3
            r3 = r0
        L58:
            return r3
        L59:
            r0 = r3
            goto L55
        L5b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.gn.B(boolean, boolean, boolean):java.net.Socket");
    }

    private gm Code(int i2, int i3, int i4, int i5, boolean z2) throws Throwable {
        boolean z3;
        Socket socketZ;
        Socket socketB;
        gm gmVar;
        boolean z4;
        gc gcVarB;
        boolean z5;
        gq.Code code;
        synchronized (this.Z) {
            if (this.f3233c) {
                throw new IllegalStateException("released");
            }
            if (this.f3232a != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f3234e) {
                throw new IOException("Canceled");
            }
            if (!f3231b && !Thread.holdsLock(this.Z)) {
                throw new AssertionError();
            }
            gm gmVar2 = this.F;
            z3 = true;
            socketZ = null;
            socketB = (gmVar2 == null || !gmVar2.V) ? null : B(false, false, true);
            gmVar = this.F;
            if (gmVar == null) {
                gmVar = null;
            }
            if (gmVar == null) {
                ge.Code.Code(this.Z, this.I, this, null);
                gm gmVar3 = this.F;
                if (gmVar3 != null) {
                    z4 = true;
                    gmVar = gmVar3;
                } else {
                    gcVarB = this.V;
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            gcVarB = null;
        }
        gg.V(socketB);
        if (gmVar != null) {
            return gmVar;
        }
        if (gcVarB != null || ((code = this.B) != null && code.I())) {
            z5 = false;
        } else {
            this.B = this.C.I();
            z5 = true;
        }
        synchronized (this.Z) {
            if (this.f3234e) {
                throw new IOException("Canceled");
            }
            if (z5) {
                List<gc> listCode = this.B.Code();
                int size = listCode.size();
                for (int i6 = 0; i6 < size; i6++) {
                    gc gcVar = listCode.get(i6);
                    ge.Code.Code(this.Z, this.I, this, gcVar);
                    gm gmVar4 = this.F;
                    if (gmVar4 != null) {
                        this.V = gcVar;
                        gmVar = gmVar4;
                        break;
                    }
                }
                z3 = z4;
            } else {
                z3 = z4;
            }
            if (!z3) {
                if (gcVarB == null) {
                    gcVarB = this.B.B();
                }
                this.V = gcVarB;
                this.D = 0;
                gmVar = new gm(this.Z, gcVarB);
                Z(gmVar);
            }
        }
        if (z3) {
            return gmVar;
        }
        gmVar.V(i2, i3, i4, i5, z2);
        S().I(gmVar.i());
        synchronized (this.Z) {
            ge.Code.Z(this.Z, gmVar);
            if (gmVar.o()) {
                socketZ = ge.Code.Z(this.Z, this.I, this);
                gmVar = this.F;
            }
        }
        gg.V(socketZ);
        return gmVar;
    }

    private void Code(gm gmVar) {
        int size = gmVar.I.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (gmVar.I.get(i2).get() == this) {
                gmVar.I.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private gi S() {
        return ge.Code.B(this.Z);
    }

    private gm Z(int i2, int i3, int i4, int i5, boolean z2, boolean z3) throws Throwable {
        while (true) {
            gm gmVarCode = Code(i2, i3, i4, i5, z2);
            synchronized (this.Z) {
                if (gmVarCode.B == 0) {
                    return gmVarCode;
                }
                if (gmVarCode.Code(z3)) {
                    return gmVarCode;
                }
                B();
            }
        }
    }

    public final void B() {
        Socket socketB;
        synchronized (this.Z) {
            socketB = B(true, false, false);
        }
        gg.V(socketB);
    }

    public final void C() {
        gp gpVar;
        gm gmVar;
        synchronized (this.Z) {
            this.f3234e = true;
            gpVar = this.f3232a;
            gmVar = this.F;
        }
        if (gpVar != null) {
            gpVar.B();
        } else if (gmVar != null) {
            gmVar.f();
        }
    }

    public final gp Code() {
        gp gpVar;
        synchronized (this.Z) {
            gpVar = this.f3232a;
        }
        return gpVar;
    }

    public final boolean F() {
        if (this.V != null) {
            return true;
        }
        gq.Code code = this.B;
        return (code != null && code.I()) || this.C.B();
    }

    public final synchronized gm I() {
        return this.F;
    }

    public final gp V(ft ftVar, fo.Code code, boolean z2) {
        try {
            gp gpVarV = Z(code.V(), code.Code(), code.Z(), ftVar.Z(), ftVar.a(), z2).V(ftVar, code, this);
            synchronized (this.Z) {
                this.f3232a = gpVarV;
            }
            return gpVarV;
        } catch (IOException e2) {
            throw new gj(e2);
        }
    }

    public final Socket V(gm gmVar) {
        if (!f3231b && !Thread.holdsLock(this.Z)) {
            throw new AssertionError();
        }
        if (this.f3232a != null || this.F.I.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<gn> reference = this.F.I.get(0);
        Socket socketB = B(true, false, false);
        this.F = gmVar;
        gmVar.I.add(reference);
        return socketB;
    }

    public final void V() {
        gm gmVar;
        Socket socketB;
        synchronized (this.Z) {
            gmVar = this.F;
            socketB = B(false, true, false);
            if (this.F != null) {
                gmVar = null;
            }
        }
        gg.V(socketB);
        if (gmVar != null) {
            ge.Code.B(this.Code, null);
        }
    }

    public final void V(boolean z2, gp gpVar, IOException iOException) {
        Socket socketB;
        boolean z3;
        synchronized (this.Z) {
            if (gpVar != null) {
                if (gpVar == this.f3232a) {
                    if (!z2) {
                        this.F.B++;
                    }
                    socketB = B(z2, false, true);
                    z3 = this.f3233c;
                }
            }
            throw new IllegalStateException(new StringBuilder("expected ").append(this.f3232a).append(" but was ").append(gpVar).toString());
        }
        gg.V(socketB);
        if (iOException != null) {
            ge.Code.B(this.Code, iOException);
        } else if (z3) {
            ge.Code.B(this.Code, null);
        }
    }

    public final gc Z() {
        return this.V;
    }

    public final void Z(gm gmVar) {
        if (!f3231b && !Thread.holdsLock(this.Z)) {
            throw new AssertionError();
        }
        if (this.F != null) {
            throw new IllegalStateException();
        }
        this.F = gmVar;
        gmVar.I.add(new V(this, this.L));
    }

    public final void Z(IOException iOException) {
        boolean z2;
        Socket socketB;
        synchronized (this.Z) {
            if (iOException instanceof hp) {
                gx gxVar = ((hp) iOException).I;
                if (gxVar == gx.REFUSED_STREAM) {
                    int i2 = this.D + 1;
                    this.D = i2;
                    if (i2 > 1) {
                        this.V = null;
                        z2 = true;
                        socketB = B(z2, false, true);
                    }
                } else if (gxVar != gx.CANCEL) {
                    this.V = null;
                    z2 = true;
                    socketB = B(z2, false, true);
                }
                z2 = false;
                socketB = B(z2, false, true);
            } else {
                gm gmVar = this.F;
                if (gmVar != null && (!gmVar.o() || (iOException instanceof gz))) {
                    if (this.F.B == 0) {
                        gc gcVar = this.V;
                        if (gcVar != null && iOException != null) {
                            this.C.I(gcVar, iOException);
                        }
                        this.V = null;
                    }
                    z2 = true;
                    socketB = B(z2, false, true);
                }
                z2 = false;
                socketB = B(z2, false, true);
            }
        }
        gg.V(socketB);
    }

    public final String toString() {
        gm gmVarI = I();
        return gmVarI != null ? gmVarI.toString() : this.I.toString();
    }
}
