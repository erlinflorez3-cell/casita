package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import com.facetec.sdk.cf;
import com.facetec.sdk.fh;
import com.facetec.sdk.fn;
import com.facetec.sdk.fr;
import com.facetec.sdk.fy;
import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public class ft implements Cloneable {
    static final List<fx> I = gg.Code(fx.HTTP_2, fx.HTTP_1_1);
    static final List<fh> Z = gg.Code(fh.B, fh.Z);
    final List<fo> B;
    final int C;
    final fn.B Code;
    final int D;

    @Nullable
    final fb F;
    final int L;

    @Nullable
    final cf.I S;
    final List<fo> V;

    /* JADX INFO: renamed from: a */
    private List<fx> f3174a;

    /* JADX INFO: renamed from: b */
    private fl f3175b;

    /* JADX INFO: renamed from: c */
    private List<fh> f3176c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private Proxy f3177d;

    /* JADX INFO: renamed from: e */
    final int f3178e;

    /* JADX INFO: renamed from: f */
    private SSLSocketFactory f3179f;

    /* JADX INFO: renamed from: g */
    private SocketFactory f3180g;

    /* JADX INFO: renamed from: h */
    private hx f3181h;

    /* JADX INFO: renamed from: i */
    private ProxySelector f3182i;

    /* JADX INFO: renamed from: j */
    private fm f3183j;

    /* JADX INFO: renamed from: k */
    private HostnameVerifier f3184k;

    /* JADX INFO: renamed from: l */
    private ez f3185l;

    /* JADX INFO: renamed from: m */
    private fg f3186m;

    /* JADX INFO: renamed from: n */
    private ez f3187n;

    /* JADX INFO: renamed from: o */
    private fi f3188o;

    /* JADX INFO: renamed from: p */
    private int f3189p;

    /* JADX INFO: renamed from: q */
    private fk f3190q;

    /* JADX INFO: renamed from: r */
    private boolean f3191r;

    /* JADX INFO: renamed from: s */
    private boolean f3192s;

    /* JADX INFO: renamed from: t */
    private boolean f3193t;

    /* JADX INFO: renamed from: com.facetec.sdk.ft$5 */
    final class AnonymousClass5 extends ge {
        AnonymousClass5() {
        }

        @Override // com.facetec.sdk.ge
        public final int B(fy.B b2) {
            return b2.B;
        }

        @Override // com.facetec.sdk.ge
        public final gi B(fg fgVar) {
            return fgVar.I;
        }

        @Override // com.facetec.sdk.ge
        @Nullable
        public final IOException B(cf.I i2, @Nullable IOException iOException) {
            return ((fu) i2).I(iOException);
        }

        @Override // com.facetec.sdk.ge
        public final gm Code(fg fgVar, fc fcVar, gn gnVar, gc gcVar) {
            return fgVar.Code(fcVar, gnVar, gcVar);
        }

        @Override // com.facetec.sdk.ge
        public final boolean Code(fc fcVar, fc fcVar2) {
            return fcVar.Z(fcVar2);
        }

        @Override // com.facetec.sdk.ge
        public final void I(fh fhVar, SSLSocket sSLSocket, boolean z2) {
            String[] strArrB = fhVar.I != null ? gg.B(ff.Code, sSLSocket.getEnabledCipherSuites(), fhVar.I) : sSLSocket.getEnabledCipherSuites();
            String[] strArrB2 = fhVar.S != null ? gg.B(gg.C, sSLSocket.getEnabledProtocols(), fhVar.S) : sSLSocket.getEnabledProtocols();
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            int I = gg.I(ff.Code, supportedCipherSuites, "TLS_FALLBACK_SCSV");
            if (z2 && I != -1) {
                strArrB = gg.I(strArrB, supportedCipherSuites[I]);
            }
            fh fhVarZ = new fh.I(fhVar).V(strArrB).I(strArrB2).Z();
            if (fhVarZ.S != null) {
                sSLSocket.setEnabledProtocols(fhVarZ.S);
            }
            if (fhVarZ.I != null) {
                sSLSocket.setEnabledCipherSuites(fhVarZ.I);
            }
        }

        @Override // com.facetec.sdk.ge
        public final void V(fr.V v2, String str) {
            int iIndexOf = str.indexOf(Global.COLON, 1);
            if (iIndexOf != -1) {
                v2.B(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
            } else if (str.startsWith(Global.COLON)) {
                v2.B("", str.substring(1));
            } else {
                v2.B("", str);
            }
        }

        @Override // com.facetec.sdk.ge
        public final boolean V(fg fgVar, gm gmVar) {
            return fgVar.I(gmVar);
        }

        @Override // com.facetec.sdk.ge
        public final Socket Z(fg fgVar, fc fcVar, gn gnVar) {
            return fgVar.Code(fcVar, gnVar);
        }

        @Override // com.facetec.sdk.ge
        public final void Z(fg fgVar, gm gmVar) {
            fgVar.V(gmVar);
        }

        @Override // com.facetec.sdk.ge
        public final void Z(fr.V v2, String str, String str2) {
            v2.B(str, str2);
        }
    }

    public static final class Z {

        @Nullable
        Proxy B;

        @Nullable
        fb D;
        ProxySelector L;
        fm S;

        /* JADX INFO: renamed from: a */
        HostnameVerifier f3194a;

        /* JADX INFO: renamed from: b */
        @Nullable
        SSLSocketFactory f3195b;

        /* JADX INFO: renamed from: c */
        @Nullable
        hx f3196c;

        /* JADX INFO: renamed from: d */
        @Nullable
        cf.I f3197d;

        /* JADX INFO: renamed from: e */
        SocketFactory f3198e;

        /* JADX INFO: renamed from: f */
        fg f3199f;

        /* JADX INFO: renamed from: g */
        fi f3200g;

        /* JADX INFO: renamed from: h */
        ez f3201h;

        /* JADX INFO: renamed from: i */
        fk f3202i;

        /* JADX INFO: renamed from: j */
        ez f3203j;

        /* JADX INFO: renamed from: k */
        boolean f3204k;

        /* JADX INFO: renamed from: l */
        boolean f3205l;

        /* JADX INFO: renamed from: m */
        boolean f3206m;

        /* JADX INFO: renamed from: n */
        int f3207n;

        /* JADX INFO: renamed from: o */
        int f3208o;

        /* JADX INFO: renamed from: p */
        int f3209p;

        /* JADX INFO: renamed from: r */
        int f3210r;

        /* JADX INFO: renamed from: s */
        int f3211s;
        final List<fo> V = new ArrayList();
        final List<fo> C = new ArrayList();
        fl I = new fl();
        List<fx> Code = ft.I;
        List<fh> Z = ft.Z;
        fn.B F = fn.Z(fn.Z);

        public Z() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.L = proxySelector;
            if (proxySelector == null) {
                this.L = new hr();
            }
            this.S = fm.B;
            this.f3198e = SocketFactory.getDefault();
            this.f3194a = ia.B;
            this.f3200g = fi.Z;
            this.f3203j = ez.Code;
            this.f3201h = ez.Code;
            this.f3199f = new fg();
            this.f3202i = fk.V;
            this.f3204k = true;
            this.f3206m = true;
            this.f3205l = true;
            this.f3208o = 0;
            this.f3207n = 10000;
            this.f3209p = 10000;
            this.f3211s = 10000;
            this.f3210r = 0;
        }

        public final Z B(TimeUnit timeUnit) {
            this.f3209p = gg.I(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, timeUnit);
            return this;
        }

        public final Z I(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (x509TrustManager == null) {
                throw new NullPointerException("trustManager == null");
            }
            this.f3195b = sSLSocketFactory;
            this.f3196c = hx.V(x509TrustManager);
            return this;
        }

        public final ft I() {
            return new ft(this);
        }

        public final Z V(TimeUnit timeUnit) {
            this.f3211s = gg.I(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, timeUnit);
            return this;
        }

        public final Z Z(TimeUnit timeUnit) {
            this.f3207n = gg.I(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, timeUnit);
            return this;
        }

        public final Z Z(SSLSocketFactory sSLSocketFactory) {
            this.f3195b = sSLSocketFactory;
            this.f3196c = hv.B().V(sSLSocketFactory);
            return this;
        }
    }

    static {
        ge.Code = new ge() { // from class: com.facetec.sdk.ft.5
            AnonymousClass5() {
            }

            @Override // com.facetec.sdk.ge
            public final int B(fy.B b2) {
                return b2.B;
            }

            @Override // com.facetec.sdk.ge
            public final gi B(fg fgVar) {
                return fgVar.I;
            }

            @Override // com.facetec.sdk.ge
            @Nullable
            public final IOException B(cf.I i2, @Nullable IOException iOException) {
                return ((fu) i2).I(iOException);
            }

            @Override // com.facetec.sdk.ge
            public final gm Code(fg fgVar, fc fcVar, gn gnVar, gc gcVar) {
                return fgVar.Code(fcVar, gnVar, gcVar);
            }

            @Override // com.facetec.sdk.ge
            public final boolean Code(fc fcVar, fc fcVar2) {
                return fcVar.Z(fcVar2);
            }

            @Override // com.facetec.sdk.ge
            public final void I(fh fhVar, SSLSocket sSLSocket, boolean z2) {
                String[] strArrB = fhVar.I != null ? gg.B(ff.Code, sSLSocket.getEnabledCipherSuites(), fhVar.I) : sSLSocket.getEnabledCipherSuites();
                String[] strArrB2 = fhVar.S != null ? gg.B(gg.C, sSLSocket.getEnabledProtocols(), fhVar.S) : sSLSocket.getEnabledProtocols();
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int I2 = gg.I(ff.Code, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z2 && I2 != -1) {
                    strArrB = gg.I(strArrB, supportedCipherSuites[I2]);
                }
                fh fhVarZ = new fh.I(fhVar).V(strArrB).I(strArrB2).Z();
                if (fhVarZ.S != null) {
                    sSLSocket.setEnabledProtocols(fhVarZ.S);
                }
                if (fhVarZ.I != null) {
                    sSLSocket.setEnabledCipherSuites(fhVarZ.I);
                }
            }

            @Override // com.facetec.sdk.ge
            public final void V(fr.V v2, String str) {
                int iIndexOf = str.indexOf(Global.COLON, 1);
                if (iIndexOf != -1) {
                    v2.B(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
                } else if (str.startsWith(Global.COLON)) {
                    v2.B("", str.substring(1));
                } else {
                    v2.B("", str);
                }
            }

            @Override // com.facetec.sdk.ge
            public final boolean V(fg fgVar, gm gmVar) {
                return fgVar.I(gmVar);
            }

            @Override // com.facetec.sdk.ge
            public final Socket Z(fg fgVar, fc fcVar, gn gnVar) {
                return fgVar.Code(fcVar, gnVar);
            }

            @Override // com.facetec.sdk.ge
            public final void Z(fg fgVar, gm gmVar) {
                fgVar.V(gmVar);
            }

            @Override // com.facetec.sdk.ge
            public final void Z(fr.V v2, String str, String str2) {
                v2.B(str, str2);
            }
        };
    }

    public ft() {
        this(new Z());
    }

    ft(Z z2) {
        boolean z3;
        this.f3175b = z2.I;
        this.f3177d = z2.B;
        this.f3174a = z2.Code;
        this.f3176c = z2.Z;
        this.V = gg.Code(z2.V);
        this.B = gg.Code(z2.C);
        this.Code = z2.F;
        this.f3182i = z2.L;
        this.f3183j = z2.S;
        this.F = z2.D;
        this.S = z2.f3197d;
        this.f3180g = z2.f3198e;
        Iterator<fh> it = this.f3176c.iterator();
        loop0: while (true) {
            z3 = false;
            while (it.hasNext()) {
                z3 = (z3 || it.next().Code()) ? true : z3;
            }
        }
        if (z2.f3195b == null && z3) {
            X509TrustManager x509TrustManagerV = gg.V();
            this.f3179f = V(x509TrustManagerV);
            this.f3181h = hx.V(x509TrustManagerV);
        } else {
            this.f3179f = z2.f3195b;
            this.f3181h = z2.f3196c;
        }
        if (this.f3179f != null) {
            hv.B().Code(this.f3179f);
        }
        this.f3184k = z2.f3194a;
        this.f3188o = z2.f3200g.V(this.f3181h);
        this.f3185l = z2.f3203j;
        this.f3187n = z2.f3201h;
        this.f3186m = z2.f3199f;
        this.f3190q = z2.f3202i;
        this.f3192s = z2.f3204k;
        this.f3193t = z2.f3206m;
        this.f3191r = z2.f3205l;
        this.L = z2.f3208o;
        this.C = z2.f3207n;
        this.D = z2.f3209p;
        this.f3178e = z2.f3211s;
        this.f3189p = z2.f3210r;
        if (this.V.contains(null)) {
            throw new IllegalStateException(new StringBuilder("Null interceptor: ").append(this.V).toString());
        }
        if (this.B.contains(null)) {
            throw new IllegalStateException(new StringBuilder("Null network interceptor: ").append(this.B).toString());
        }
    }

    private static SSLSocketFactory V(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextV = hv.B().V();
            sSLContextV.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextV.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw gg.I("No System TLS", e2);
        }
    }

    public final fm B() {
        return this.f3183j;
    }

    public final SSLSocketFactory C() {
        return this.f3179f;
    }

    @Nullable
    public final Proxy Code() {
        return this.f3177d;
    }

    public final SocketFactory D() {
        return this.f3180g;
    }

    public final ez F() {
        return this.f3187n;
    }

    public final cf.I I(fv fvVar) {
        return fu.Z(this, fvVar, false);
    }

    public final fk I() {
        return this.f3190q;
    }

    public final fi L() {
        return this.f3188o;
    }

    public final HostnameVerifier S() {
        return this.f3184k;
    }

    public final ProxySelector V() {
        return this.f3182i;
    }

    public final int Z() {
        return this.f3189p;
    }

    public final boolean a() {
        return this.f3191r;
    }

    public final fg b() {
        return this.f3186m;
    }

    public final boolean c() {
        return this.f3193t;
    }

    public final ez d() {
        return this.f3185l;
    }

    public final boolean e() {
        return this.f3192s;
    }

    public final fl f() {
        return this.f3175b;
    }

    public final List<fh> g() {
        return this.f3176c;
    }

    public final List<fx> i() {
        return this.f3174a;
    }
}
