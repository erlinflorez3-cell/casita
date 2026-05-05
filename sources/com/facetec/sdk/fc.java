package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import com.facetec.sdk.fp;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class fc {
    private fp B;

    @Nullable
    private Proxy C;
    private fk Code;
    private ProxySelector D;
    private List<fh> F;
    private ez I;
    private List<fx> L;

    @Nullable
    private HostnameVerifier S;

    @Nullable
    final SSLSocketFactory V;
    private SocketFactory Z;

    /* JADX INFO: renamed from: d */
    @Nullable
    private fi f3156d;

    public fc(String str, int i2, fk fkVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable fi fiVar, ez ezVar, @Nullable Proxy proxy, List<fx> list, List<fh> list2, ProxySelector proxySelector) {
        fp.I i3 = new fp.I();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            i3.Z = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(str2)));
            }
            i3.Z = "https";
        }
        fp.I iV = i3.V(str);
        if (i2 <= 0 || i2 > 65535) {
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i2)));
        }
        iV.B = i2;
        this.B = iV.I();
        if (fkVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.Code = fkVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.Z = socketFactory;
        if (ezVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.I = ezVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.L = gg.Code(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.F = gg.Code(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.D = proxySelector;
        this.C = proxy;
        this.V = sSLSocketFactory;
        this.S = hostnameVerifier;
        this.f3156d = fiVar;
    }

    public final ez B() {
        return this.I;
    }

    @Nullable
    public final SSLSocketFactory C() {
        return this.V;
    }

    public final fk Code() {
        return this.Code;
    }

    @Nullable
    public final Proxy D() {
        return this.C;
    }

    @Nullable
    public final HostnameVerifier F() {
        return this.S;
    }

    public final List<fx> I() {
        return this.L;
    }

    public final ProxySelector L() {
        return this.D;
    }

    public final List<fh> S() {
        return this.F;
    }

    public final SocketFactory V() {
        return this.Z;
    }

    public final fp Z() {
        return this.B;
    }

    final boolean Z(fc fcVar) {
        return this.Code.equals(fcVar.Code) && this.I.equals(fcVar.I) && this.L.equals(fcVar.L) && this.F.equals(fcVar.F) && this.D.equals(fcVar.D) && gg.V(this.C, fcVar.C) && gg.V(this.V, fcVar.V) && gg.V(this.S, fcVar.S) && gg.V(this.f3156d, fcVar.f3156d) && Z().F() == fcVar.Z().F();
    }

    @Nullable
    public final fi d() {
        return this.f3156d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        return this.B.equals(fcVar.B) && Z(fcVar);
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.B.hashCode() + 527) * 31) + this.Code.hashCode()) * 31) + this.I.hashCode()) * 31) + this.L.hashCode()) * 31) + this.F.hashCode()) * 31) + this.D.hashCode()) * 31;
        Proxy proxy = this.C;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.V;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.S;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        fi fiVar = this.f3156d;
        return iHashCode4 + (fiVar != null ? fiVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder("Address{").append(this.B.D()).append(Global.COLON).append(this.B.F());
        if (this.C != null) {
            sbAppend.append(", proxy=").append(this.C);
        } else {
            sbAppend.append(", proxySelector=").append(this.D);
        }
        sbAppend.append("}");
        return sbAppend.toString();
    }
}
