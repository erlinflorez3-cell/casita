package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import okhttp3.internal.http2.Header;

/* JADX INFO: loaded from: classes3.dex */
public final class hc {
    public final ib F;
    public final ib L;
    final int S;
    public static final ib V = ib.V(Global.COLON);
    public static final ib I = ib.V(Header.RESPONSE_STATUS_UTF8);
    public static final ib B = ib.V(Header.TARGET_METHOD_UTF8);
    public static final ib Z = ib.V(Header.TARGET_PATH_UTF8);
    public static final ib Code = ib.V(Header.TARGET_SCHEME_UTF8);
    public static final ib D = ib.V(Header.TARGET_AUTHORITY_UTF8);

    interface B {
    }

    public hc(ib ibVar, ib ibVar2) {
        this.L = ibVar;
        this.F = ibVar2;
        this.S = ibVar.S() + 32 + ibVar2.S();
    }

    public hc(ib ibVar, String str) {
        this(ibVar, ib.V(str));
    }

    public hc(String str, String str2) {
        this(ib.V(str), ib.V(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hc) {
            hc hcVar = (hc) obj;
            if (this.L.equals(hcVar.L) && this.F.equals(hcVar.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.L.hashCode() + 527) * 31) + this.F.hashCode();
    }

    public final String toString() {
        return gg.Code("%s: %s", this.L.Z(), this.F.Z());
    }
}
