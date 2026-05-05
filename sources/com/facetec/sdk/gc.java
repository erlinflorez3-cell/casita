package com.facetec.sdk;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class gc {
    private Proxy B;
    private fc I;
    private InetSocketAddress V;

    public gc(fc fcVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (fcVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.I = fcVar;
        this.B = proxy;
        this.V = inetSocketAddress;
    }

    public final fc Code() {
        return this.I;
    }

    public final Proxy I() {
        return this.B;
    }

    public final InetSocketAddress V() {
        return this.V;
    }

    public final boolean Z() {
        return this.I.V != null && this.B.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return gcVar.I.equals(this.I) && gcVar.B.equals(this.B) && gcVar.V.equals(this.V);
    }

    public final int hashCode() {
        return ((((this.I.hashCode() + 527) * 31) + this.B.hashCode()) * 31) + this.V.hashCode();
    }

    public final String toString() {
        return new StringBuilder("Route{").append(this.V).append("}").toString();
    }
}
