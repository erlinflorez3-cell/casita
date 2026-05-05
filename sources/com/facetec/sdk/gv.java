package com.facetec.sdk;

import com.facetec.sdk.cf;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class gv extends ga {
    private final cf.I Code;

    @Nullable
    private final String V;
    private final long Z;

    public gv(@Nullable String str, long j2, cf.I i2) {
        this.V = str;
        this.Z = j2;
        this.Code = i2;
    }

    @Override // com.facetec.sdk.ga
    public final long B() {
        return this.Z;
    }

    @Override // com.facetec.sdk.ga
    public final fw Code() {
        String str = this.V;
        if (str != null) {
            return fw.V(str);
        }
        return null;
    }

    @Override // com.facetec.sdk.ga
    public final cf.I I() {
        return this.Code;
    }
}
