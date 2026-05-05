package com.facetec.sdk;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class fe {
    private final int B;
    private final int C;
    private final int Code;
    private final int D;
    private final boolean F;
    private final boolean I;
    private final boolean L;
    private final boolean S;
    private final boolean V;
    private final boolean Z;

    /* JADX INFO: renamed from: a */
    private final boolean f3157a;

    /* JADX INFO: renamed from: c */
    private final boolean f3158c;

    /* JADX INFO: renamed from: e */
    @Nullable
    private String f3159e;

    public static final class Code {
        boolean D;
        boolean I;
        boolean L;
        boolean S;
        boolean V;
        int B = -1;
        int Z = -1;
        int Code = -1;

        public final fe I() {
            return new fe(this);
        }
    }

    static {
        Code code = new Code();
        code.I = true;
        code.I();
        Code code2 = new Code();
        code2.L = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        code2.Z = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        code2.I();
    }

    fe(Code code) {
        this.V = code.I;
        this.Z = code.V;
        this.B = code.B;
        this.Code = -1;
        this.I = false;
        this.L = false;
        this.F = false;
        this.D = code.Z;
        this.C = code.Code;
        this.S = code.L;
        this.f3157a = code.S;
        this.f3158c = code.D;
    }

    private fe(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, @Nullable String str) {
        this.V = z2;
        this.Z = z3;
        this.B = i2;
        this.Code = i3;
        this.I = z4;
        this.L = z5;
        this.F = z6;
        this.D = i4;
        this.C = i5;
        this.S = z7;
        this.f3157a = z8;
        this.f3158c = z9;
        this.f3159e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facetec.sdk.fe Z(com.facetec.sdk.fr r21) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.fe.Z(com.facetec.sdk.fr):com.facetec.sdk.fe");
    }

    public final boolean B() {
        return this.I;
    }

    public final int C() {
        return this.C;
    }

    public final boolean Code() {
        return this.L;
    }

    public final boolean D() {
        return this.F;
    }

    public final int F() {
        return this.D;
    }

    public final int I() {
        return this.B;
    }

    public final boolean S() {
        return this.S;
    }

    public final boolean V() {
        return this.Z;
    }

    public final boolean Z() {
        return this.V;
    }

    public final String toString() {
        String string;
        String str = this.f3159e;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.V) {
            sb.append("no-cache, ");
        }
        if (this.Z) {
            sb.append("no-store, ");
        }
        if (this.B != -1) {
            sb.append("max-age=").append(this.B).append(", ");
        }
        if (this.Code != -1) {
            sb.append("s-maxage=").append(this.Code).append(", ");
        }
        if (this.I) {
            sb.append("private, ");
        }
        if (this.L) {
            sb.append("public, ");
        }
        if (this.F) {
            sb.append("must-revalidate, ");
        }
        if (this.D != -1) {
            sb.append("max-stale=").append(this.D).append(", ");
        }
        if (this.C != -1) {
            sb.append("min-fresh=").append(this.C).append(", ");
        }
        if (this.S) {
            sb.append("only-if-cached, ");
        }
        if (this.f3157a) {
            sb.append("no-transform, ");
        }
        if (this.f3158c) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            string = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            string = sb.toString();
        }
        this.f3159e = string;
        return string;
    }
}
