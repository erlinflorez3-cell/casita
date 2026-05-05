package com.facetec.sdk;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class cv extends cm {
    private final dm<String, cm> Code = new dm<>();

    public final void B(String str, Number number) {
        I(str, number == null ? cs.I : new ct(number));
    }

    public final void I(String str, cm cmVar) {
        dm<String, cm> dmVar = this.Code;
        if (cmVar == null) {
            cmVar = cs.I;
        }
        dmVar.put(str, cmVar);
    }

    public final void Z(String str, String str2) {
        I(str, str2 == null ? cs.I : new ct(str2));
    }

    public final Set<Map.Entry<String, cm>> e() {
        return this.Code.entrySet();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof cv) && ((cv) obj).Code.equals(this.Code);
        }
        return true;
    }

    public final int hashCode() {
        return this.Code.hashCode();
    }
}
