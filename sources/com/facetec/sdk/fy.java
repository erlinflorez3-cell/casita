package com.facetec.sdk;

import com.facetec.sdk.fr;
import java.io.Closeable;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class fy implements Closeable {
    final String B;

    @Nullable
    final fy C;
    final int Code;
    final fr D;

    @Nullable
    final fy F;
    final fv I;

    @Nullable
    final ga L;

    @Nullable
    final fy S;

    @Nullable
    final fs V;
    final fx Z;

    /* JADX INFO: renamed from: b */
    final long f3212b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private volatile fe f3213c;

    /* JADX INFO: renamed from: d */
    final long f3214d;

    public static class B {
        int B;

        @Nullable
        fy C;

        @Nullable
        fv Code;

        @Nullable
        fy D;
        fr.V F;
        String I;

        @Nullable
        ga L;

        @Nullable
        fy S;

        @Nullable
        fs V;

        @Nullable
        fx Z;

        /* JADX INFO: renamed from: c */
        long f3215c;

        /* JADX INFO: renamed from: d */
        long f3216d;

        public B() {
            this.B = -1;
            this.F = new fr.V();
        }

        B(fy fyVar) {
            this.B = -1;
            this.Code = fyVar.I;
            this.Z = fyVar.Z;
            this.B = fyVar.Code;
            this.I = fyVar.B;
            this.V = fyVar.V;
            this.F = fyVar.D.B();
            this.L = fyVar.L;
            this.D = fyVar.S;
            this.C = fyVar.F;
            this.S = fyVar.C;
            this.f3215c = fyVar.f3214d;
            this.f3216d = fyVar.f3212b;
        }

        private static void Code(String str, fy fyVar) {
            if (fyVar.L != null) {
                throw new IllegalArgumentException(new StringBuilder().append(str).append(".body != null").toString());
            }
            if (fyVar.S != null) {
                throw new IllegalArgumentException(new StringBuilder().append(str).append(".networkResponse != null").toString());
            }
            if (fyVar.F != null) {
                throw new IllegalArgumentException(new StringBuilder().append(str).append(".cacheResponse != null").toString());
            }
            if (fyVar.C != null) {
                throw new IllegalArgumentException(new StringBuilder().append(str).append(".priorResponse != null").toString());
            }
        }

        public final B B(long j2) {
            this.f3216d = j2;
            return this;
        }

        public final B B(@Nullable fs fsVar) {
            this.V = fsVar;
            return this;
        }

        public final B B(@Nullable ga gaVar) {
            this.L = gaVar;
            return this;
        }

        public final B Code(fr frVar) {
            this.F = frVar.B();
            return this;
        }

        public final B Code(fv fvVar) {
            this.Code = fvVar;
            return this;
        }

        public final B Code(@Nullable fy fyVar) {
            if (fyVar != null) {
                Code("cacheResponse", fyVar);
            }
            this.C = fyVar;
            return this;
        }

        public final B Code(String str, String str2) {
            this.F.V(str, str2);
            return this;
        }

        public final B I(int i2) {
            this.B = i2;
            return this;
        }

        public final B I(@Nullable fy fyVar) {
            if (fyVar != null && fyVar.L != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.S = fyVar;
            return this;
        }

        public final B I(String str, String str2) {
            this.F.Z(str, str2);
            return this;
        }

        public final B V(long j2) {
            this.f3215c = j2;
            return this;
        }

        public final B V(@Nullable fy fyVar) {
            if (fyVar != null) {
                Code("networkResponse", fyVar);
            }
            this.D = fyVar;
            return this;
        }

        public final fy V() {
            if (this.Code == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.Z == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.B < 0) {
                throw new IllegalStateException(new StringBuilder("code < 0: ").append(this.B).toString());
            }
            if (this.I != null) {
                return new fy(this);
            }
            throw new IllegalStateException("message == null");
        }

        public final B Z(fx fxVar) {
            this.Z = fxVar;
            return this;
        }

        public final B Z(String str) {
            this.I = str;
            return this;
        }
    }

    fy(B b2) {
        this.I = b2.Code;
        this.Z = b2.Z;
        this.Code = b2.B;
        this.B = b2.I;
        this.V = b2.V;
        this.D = b2.F.I();
        this.L = b2.L;
        this.S = b2.D;
        this.F = b2.C;
        this.C = b2.S;
        this.f3214d = b2.f3215c;
        this.f3212b = b2.f3216d;
    }

    @Nullable
    public final fs B() {
        return this.V;
    }

    @Nullable
    public final String B(String str) {
        String strCode = this.D.Code(str);
        if (strCode != null) {
            return strCode;
        }
        return null;
    }

    @Nullable
    public final fy C() {
        return this.C;
    }

    public final fv Code() {
        return this.I;
    }

    @Nullable
    public final ga D() {
        return this.L;
    }

    public final B F() {
        return new B(this);
    }

    public final int I() {
        return this.Code;
    }

    public final fe L() {
        fe feVar = this.f3213c;
        if (feVar != null) {
            return feVar;
        }
        fe feVarZ = fe.Z(this.D);
        this.f3213c = feVarZ;
        return feVarZ;
    }

    public final long S() {
        return this.f3214d;
    }

    public final boolean V() {
        int i2 = this.Code;
        return i2 >= 200 && i2 < 300;
    }

    public final fr Z() {
        return this.D;
    }

    public final long a() {
        return this.f3212b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ga gaVar = this.L;
        if (gaVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        gaVar.close();
    }

    public final String toString() {
        return new StringBuilder("Response{protocol=").append(this.Z).append(", code=").append(this.Code).append(", message=").append(this.B).append(", url=").append(this.I.Code()).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
