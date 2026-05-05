package com.facetec.sdk;

import java.util.Arrays;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class fh {
    public static final fh B;
    private static final ff[] D;
    private static final ff[] L;
    public static final fh Z;
    final boolean Code;

    @Nullable
    final String[] I;

    @Nullable
    final String[] S;
    final boolean V;

    public static final class I {

        @Nullable
        String[] B;

        @Nullable
        String[] Code;
        boolean V;
        boolean Z;

        public I(fh fhVar) {
            this.Z = fhVar.Code;
            this.B = fhVar.I;
            this.Code = fhVar.S;
            this.V = fhVar.V;
        }

        I(boolean z2) {
            this.Z = z2;
        }

        public final I B() {
            if (!this.Z) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.V = true;
            return this;
        }

        public final I I(String... strArr) {
            if (!this.Z) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.Code = (String[]) strArr.clone();
            return this;
        }

        public final I V(String... strArr) {
            if (!this.Z) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.B = (String[]) strArr.clone();
            return this;
        }

        public final I Z(ff... ffVarArr) {
            if (!this.Z) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[ffVarArr.length];
            for (int i2 = 0; i2 < ffVarArr.length; i2++) {
                strArr[i2] = ffVarArr[i2].f3170h;
            }
            return V(strArr);
        }

        public final I Z(fz... fzVarArr) {
            if (!this.Z) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[fzVarArr.length];
            for (int i2 = 0; i2 < fzVarArr.length; i2++) {
                strArr[i2] = fzVarArr[i2].B;
            }
            return I(strArr);
        }

        public final fh Z() {
            return new fh(this);
        }
    }

    static {
        ff[] ffVarArr = {ff.f3161b, ff.f3167i, ff.f3168j, ff.f3166g, ff.f3165f, ff.F, ff.f3160a, ff.C, ff.f3164e, ff.f3162c, ff.f3163d};
        D = ffVarArr;
        ff[] ffVarArr2 = {ff.f3161b, ff.f3167i, ff.f3168j, ff.f3166g, ff.f3165f, ff.F, ff.f3160a, ff.C, ff.f3164e, ff.f3162c, ff.f3163d, ff.L, ff.D, ff.Z, ff.S, ff.B, ff.I, ff.V};
        L = ffVarArr2;
        new I(true).Z(ffVarArr).Z(fz.TLS_1_3, fz.TLS_1_2).B().Z();
        B = new I(true).Z(ffVarArr2).Z(fz.TLS_1_3, fz.TLS_1_2, fz.TLS_1_1, fz.TLS_1_0).B().Z();
        new I(true).Z(ffVarArr2).Z(fz.TLS_1_0).B().Z();
        Z = new I(false).Z();
    }

    fh(I i2) {
        this.Code = i2.Z;
        this.I = i2.B;
        this.S = i2.Code;
        this.V = i2.V;
    }

    public final boolean Code() {
        return this.Code;
    }

    public final boolean V() {
        return this.V;
    }

    public final boolean Z(SSLSocket sSLSocket) {
        if (!this.Code) {
            return false;
        }
        if (this.S == null || gg.V(gg.C, this.S, sSLSocket.getEnabledProtocols())) {
            return this.I == null || gg.V(ff.Code, this.I, sSLSocket.getEnabledCipherSuites());
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof fh)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        fh fhVar = (fh) obj;
        boolean z2 = this.Code;
        if (z2 != fhVar.Code) {
            return false;
        }
        return !z2 || (Arrays.equals(this.I, fhVar.I) && Arrays.equals(this.S, fhVar.S) && this.V == fhVar.V);
    }

    public final int hashCode() {
        if (this.Code) {
            return ((((Arrays.hashCode(this.I) + 527) * 31) + Arrays.hashCode(this.S)) * 31) + (!this.V ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String string;
        if (!this.Code) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.I;
        String string2 = "[all enabled]";
        if (strArr != null) {
            string = (strArr != null ? ff.V(strArr) : null).toString();
        } else {
            string = "[all enabled]";
        }
        String[] strArr2 = this.S;
        if (strArr2 != null) {
            string2 = (strArr2 != null ? fz.B(strArr2) : null).toString();
        }
        return new StringBuilder("ConnectionSpec(cipherSuites=").append(string).append(", tlsVersions=").append(string2).append(", supportsTlsExtensions=").append(this.V).append(")").toString();
    }
}
