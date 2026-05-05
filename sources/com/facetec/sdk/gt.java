package com.facetec.sdk;

import com.facetec.sdk.cf;
import com.facetec.sdk.fo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gt implements fo.Code {
    private final List<fo> B;
    private final cf.I C;
    private final gp Code;
    private final int D;
    private final int F;
    private final gn I;
    private final fv L;
    private final fn S;
    private final gm V;
    private final int Z;

    /* JADX INFO: renamed from: a */
    private final int f3235a;

    /* JADX INFO: renamed from: d */
    private int f3236d;

    public gt(List<fo> list, gn gnVar, gp gpVar, gm gmVar, int i2, fv fvVar, cf.I i3, fn fnVar, int i4, int i5, int i6) {
        this.B = list;
        this.V = gmVar;
        this.I = gnVar;
        this.Code = gpVar;
        this.Z = i2;
        this.L = fvVar;
        this.C = i3;
        this.S = fnVar;
        this.F = i4;
        this.D = i5;
        this.f3235a = i6;
    }

    public final cf.I B() {
        return this.V;
    }

    public final fy B(fv fvVar, gn gnVar, gp gpVar, gm gmVar) throws IOException {
        if (this.Z >= this.B.size()) {
            throw new AssertionError();
        }
        this.f3236d++;
        if (this.Code != null && !this.V.B(fvVar.Code())) {
            throw new IllegalStateException(new StringBuilder("network interceptor ").append(this.B.get(this.Z - 1)).append(" must retain the same host and port").toString());
        }
        if (this.Code != null && this.f3236d > 1) {
            throw new IllegalStateException(new StringBuilder("network interceptor ").append(this.B.get(this.Z - 1)).append(" must call proceed() exactly once").toString());
        }
        gt gtVar = new gt(this.B, gnVar, gpVar, gmVar, this.Z + 1, fvVar, this.C, this.S, this.F, this.D, this.f3235a);
        fo foVar = this.B.get(this.Z);
        fy fyVarV = foVar.V(gtVar);
        if (gpVar != null && this.Z + 1 < this.B.size() && gtVar.f3236d != 1) {
            throw new IllegalStateException(new StringBuilder("network interceptor ").append(foVar).append(" must call proceed() exactly once").toString());
        }
        if (fyVarV == null) {
            throw new NullPointerException(new StringBuilder("interceptor ").append(foVar).append(" returned null").toString());
        }
        if (fyVarV.D() != null) {
            return fyVarV;
        }
        throw new IllegalStateException(new StringBuilder("interceptor ").append(foVar).append(" returned a response with no body").toString());
    }

    @Override // com.facetec.sdk.fo.Code
    public final int Code() {
        return this.D;
    }

    public final gp D() {
        return this.Code;
    }

    public final fn F() {
        return this.S;
    }

    @Override // com.facetec.sdk.fo.Code
    public final fv I() {
        return this.L;
    }

    public final gn L() {
        return this.I;
    }

    public final cf.I S() {
        return this.C;
    }

    @Override // com.facetec.sdk.fo.Code
    public final int V() {
        return this.F;
    }

    @Override // com.facetec.sdk.fo.Code
    public final fy V(fv fvVar) throws IOException {
        return B(fvVar, this.I, this.Code, this.V);
    }

    @Override // com.facetec.sdk.fo.Code
    public final int Z() {
        return this.f3235a;
    }
}
