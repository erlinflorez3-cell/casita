package cz.msebera.android.httpclient.conn.ssl;

import cz.msebera.android.httpclient.HttpHost;
import cz.msebera.android.httpclient.conn.socket.LayeredConnectionSocketFactory;
import cz.msebera.android.httpclient.conn.util.PublicSuffixMatcherLoader;
import cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import cz.msebera.android.httpclient.protocol.HttpContext;
import cz.msebera.android.httpclient.util.Args;
import cz.msebera.android.httpclient.util.TextUtils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.security.auth.x500.X500Principal;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class SSLConnectionSocketFactory implements LayeredConnectionSocketFactory {
    public static final String SSL = "SSL";
    public static final String SSLV2 = "SSLv2";
    public static final String TAG = "SSLConnSockFact";
    public static final String TLS = "TLS";
    private final HostnameVerifier hostnameVerifier;
    public HttpClientAndroidLog log;
    private final javax.net.ssl.SSLSocketFactory socketfactory;
    private final String[] supportedCipherSuites;
    private final String[] supportedProtocols;

    @Deprecated
    public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = AllowAllHostnameVerifier.INSTANCE;

    @Deprecated
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = BrowserCompatHostnameVerifier.INSTANCE;

    @Deprecated
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = StrictHostnameVerifier.INSTANCE;
    private static final String WEAK_KEY_EXCHANGES = "^(TLS|SSL)_(NULL|ECDH_anon|DH_anon|DH_anon_EXPORT|DHE_RSA_EXPORT|DHE_DSS_EXPORT|DSS_EXPORT|DH_DSS_EXPORT|DH_RSA_EXPORT|RSA_EXPORT|KRB5_EXPORT)_(.*)";
    private static final String WEAK_CIPHERS = "^(TLS|SSL)_(.*)_WITH_(NULL|DES_CBC|DES40_CBC|DES_CBC_40|3DES_EDE_CBC|RC4_128|RC4_40|RC2_CBC_40)_(.*)";
    private static final List<Pattern> WEAK_CIPHER_SUITE_PATTERNS = Collections.unmodifiableList(Arrays.asList(Pattern.compile(WEAK_KEY_EXCHANGES, 2), Pattern.compile(WEAK_CIPHERS, 2)));

    public SSLConnectionSocketFactory(SSLContext sSLContext) {
        this(sSLContext, getDefaultHostnameVerifier());
    }

    @Deprecated
    public SSLConnectionSocketFactory(SSLContext sSLContext, X509HostnameVerifier x509HostnameVerifier) {
        this(((SSLContext) Args.notNull(sSLContext, "SSL context")).getSocketFactory(), (String[]) null, (String[]) null, x509HostnameVerifier);
    }

    public SSLConnectionSocketFactory(SSLContext sSLContext, HostnameVerifier hostnameVerifier) {
        this(((SSLContext) Args.notNull(sSLContext, "SSL context")).getSocketFactory(), (String[]) null, (String[]) null, hostnameVerifier);
    }

    @Deprecated
    public SSLConnectionSocketFactory(SSLContext sSLContext, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this(((SSLContext) Args.notNull(sSLContext, "SSL context")).getSocketFactory(), strArr, strArr2, x509HostnameVerifier);
    }

    public SSLConnectionSocketFactory(SSLContext sSLContext, String[] strArr, String[] strArr2, HostnameVerifier hostnameVerifier) {
        this(((SSLContext) Args.notNull(sSLContext, "SSL context")).getSocketFactory(), strArr, strArr2, hostnameVerifier);
    }

    @Deprecated
    public SSLConnectionSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLSocketFactory, (String[]) null, (String[]) null, x509HostnameVerifier);
    }

    public SSLConnectionSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        this(sSLSocketFactory, (String[]) null, (String[]) null, hostnameVerifier);
    }

    @Deprecated
    public SSLConnectionSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLSocketFactory, strArr, strArr2, (HostnameVerifier) x509HostnameVerifier);
    }

    public SSLConnectionSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, HostnameVerifier hostnameVerifier) {
        this.log = new HttpClientAndroidLog(getClass());
        this.socketfactory = (javax.net.ssl.SSLSocketFactory) Args.notNull(sSLSocketFactory, "SSL socket factory");
        this.supportedProtocols = strArr;
        this.supportedCipherSuites = strArr2;
        this.hostnameVerifier = hostnameVerifier == null ? getDefaultHostnameVerifier() : hostnameVerifier;
    }

    public static HostnameVerifier getDefaultHostnameVerifier() {
        return new DefaultHostnameVerifier(PublicSuffixMatcherLoader.getDefault());
    }

    public static SSLConnectionSocketFactory getSocketFactory() throws SSLInitializationException {
        return new SSLConnectionSocketFactory(cz.msebera.android.httpclient.ssl.SSLContexts.createDefault(), getDefaultHostnameVerifier());
    }

    public static SSLConnectionSocketFactory getSystemSocketFactory() throws SSLInitializationException {
        return new SSLConnectionSocketFactory((javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault(), split(System.getProperty("https.protocols")), split(System.getProperty("https.cipherSuites")), getDefaultHostnameVerifier());
    }

    static boolean isWeakCipherSuite(String str) {
        Iterator<Pattern> it = WEAK_CIPHER_SUITE_PATTERNS.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private static String[] split(String str) {
        if (TextUtils.isBlank(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    private void verifyHostname(SSLSocket sSLSocket, String str) throws Throwable {
        String strOd = C1561oA.od("Q!\u0015\u0014 L\u001c\u001d\u0013\u0017\u000b\u0010\u0016\u0006\u0010\\A", (short) (C1633zX.Xd() ^ (-27581)));
        short sXd = (short) (C1580rY.Xd() ^ (-11128));
        int[] iArr = new int["qA9<EKA:N@@|AHPIGU\u0004X[P\\N$\u000b".length()];
        QB qb = new QB("qA9<EKA:N@@|AHPIGU\u0004X[P\\N$\u000b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        String strZd = Wg.Zd("SP*bmj\u0001\u0011\u0007-0b]fW\u0002\u0011k)\u000enz", (short) (C1499aX.Xd() ^ (-31363)), (short) (C1499aX.Xd() ^ (-5831)));
        try {
            SSLSession session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.getInputStream().available();
                session = sSLSocket.getSession();
                if (session == null) {
                    sSLSocket.startHandshake();
                    session = sSLSocket.getSession();
                }
            }
            if (session == null) {
                throw new SSLHandshakeException(C1593ug.zd("de_4\t{\u000b\f\u0003\n\n<\f\u000e\u0014@\u0003\u0019\u0005\u000e\u0012\b\n\u0015\u000f", (short) (FB.Xd() ^ 20505), (short) (FB.Xd() ^ 17571)));
            }
            if (this.log.isDebugEnabled()) {
                this.log.debug(C1561oA.Xd("2EDWUI\u0005YL[\\SZZ\rSbdRT_]h^\\\\", (short) (ZN.Xd() ^ 30397)));
                this.log.debug(strZd + session.getProtocol());
                this.log.debug(str2 + session.getCipherSuite());
                try {
                    X509Certificate x509Certificate = (X509Certificate) session.getPeerCertificates()[0];
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Wg.vd("91C/\u0001G65LJ>JT\n<?14j\u0016wsy\u0005,:9/15,+cU", (short) (ZN.Xd() ^ 24477))).getMethod(Qg.kd("0-;\u0019:&-'$4\u0017rlk\u000b,\"&\u001a\u001f%\u0015\u001f", (short) (C1633zX.Xd() ^ (-5333)), (short) (C1633zX.Xd() ^ (-17790))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        this.log.debug(strOd + ((X500Principal) method.invoke(x509Certificate, objArr)).toString());
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(hg.Vd("PFZD\u0010TEBSOEOS\u0007;<HI\u0002+\u0007\u0001\t\u00123?@402+(:*", (short) (C1580rY.Xd() ^ (-16930)), (short) (C1580rY.Xd() ^ (-28798)))).getMethod(C1561oA.ud("GDR0Q=D>;K\u0017AH8D?1C7C1\u0019+6-:", (short) (FB.Xd() ^ 3949)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            Collection<List> collection = (Collection) method2.invoke(x509Certificate, objArr2);
                            if (collection != null) {
                                ArrayList arrayList = new ArrayList();
                                for (List list : collection) {
                                    if (!list.isEmpty()) {
                                        arrayList.add((String) list.get(1));
                                    }
                                }
                                HttpClientAndroidLog httpClientAndroidLog = this.log;
                                StringBuilder sb = new StringBuilder();
                                short sXd2 = (short) (C1580rY.Xd() ^ (-1));
                                int[] iArr2 = new int["f8*+5c\".3%/,\u001c0\"0\u001cW#\u0017 \u0019$kN".length()];
                                QB qb2 = new QB("f8*+5c\".3%/,\u001c0\"0\u001cW#\u0017 \u0019$kN");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                                    i3++;
                                }
                                httpClientAndroidLog.debug(sb.append(new String(iArr2, 0, i3)).append(arrayList).toString());
                            }
                            Class<?> cls = Class.forName(C1561oA.Yd("ph~j8~qp\u0004\u0002y\u0006\fAwz\t\fFqOKU`\u0004\u0012\u0015\u000b\t\r\b\u0007\u001b\r", (short) (ZN.Xd() ^ 27691)));
                            Class<?>[] clsArr = new Class[0];
                            Object[] objArr3 = new Object[0];
                            short sXd3 = (short) (Od.Xd() ^ (-172));
                            short sXd4 = (short) (Od.Xd() ^ (-24451));
                            int[] iArr3 = new int["/.>\u0014?@C4B)\u0007\u0003\u0004%H@F<CK=I".length()];
                            QB qb3 = new QB("/.>\u0014?@C4B)\u0007\u0003\u0004%H@F<CK=I");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                                i4++;
                            }
                            Method method3 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                            try {
                                method3.setAccessible(true);
                                this.log.debug(Jg.Wd("Q>?\u001bT\u0018\u001c%=\u0003\u0011\u0012\u001eWu`r\u001cA", (short) (ZN.Xd() ^ 13158), (short) (ZN.Xd() ^ 27001)) + ((X500Principal) method3.invoke(x509Certificate, objArr3)).toString());
                                Class<?> cls2 = Class.forName(ZO.xd("-J<*b)c\u0014\r2:XgI\u0003k[\u0004\u0002\u001cy7q?\u001c\\-\u001el\u0002ocbM", (short) (C1580rY.Xd() ^ (-3859)), (short) (C1580rY.Xd() ^ (-16355))));
                                Class<?>[] clsArr2 = new Class[0];
                                Object[] objArr4 = new Object[0];
                                short sXd5 = (short) (C1607wl.Xd() ^ 15127);
                                short sXd6 = (short) (C1607wl.Xd() ^ 31971);
                                int[] iArr4 = new int[")X BC\u0016\u000bzj\u001ft_G+f \u000f}\u0018\bpD\u0005Yx".length()];
                                QB qb4 = new QB(")X BC\u0016\u000bzj\u001ft_G+f \u000f}\u0018\bpD\u0005Yx");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i5 * sXd6))) + xuXd4.CK(iKK4));
                                    i5++;
                                }
                                Method method4 = cls2.getMethod(new String(iArr4, 0, i5), clsArr2);
                                try {
                                    method4.setAccessible(true);
                                    Collection<List> collection2 = (Collection) method4.invoke(x509Certificate, objArr4);
                                    if (collection2 != null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (List list2 : collection2) {
                                            if (!list2.isEmpty()) {
                                                arrayList2.add((String) list2.get(1));
                                            }
                                        }
                                        HttpClientAndroidLog httpClientAndroidLog2 = this.log;
                                        StringBuilder sb2 = new StringBuilder();
                                        short sXd7 = (short) (C1499aX.Xd() ^ (-16287));
                                        int[] iArr5 = new int["_y\u0012>o*\u0017\r'68O-'\"W\u0013\u000eUDKj`PK\u0012Z".length()];
                                        QB qb5 = new QB("_y\u0012>o*\u0017\r'68O-'\"W\u0013\u000eUDKj`PK\u0012Z");
                                        int i6 = 0;
                                        while (qb5.YK()) {
                                            int iKK5 = qb5.KK();
                                            Xu xuXd5 = Xu.Xd(iKK5);
                                            iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd7 + i6)));
                                            i6++;
                                        }
                                        httpClientAndroidLog2.debug(sb2.append(new String(iArr5, 0, i6)).append(arrayList2).toString());
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                } catch (Exception unused) {
                }
            }
            if (this.hostnameVerifier.verify(str, session)) {
                return;
            }
            throw new SSLPeerUnverifiedException(EO.Od("~i\u000b/m'\bl%fW2'<FQ3", (short) (ZN.Xd() ^ 2761)) + str + C1561oA.Qd("!\u0002EODQK\u0003OyF9K9=s4@Jo>4l@3/h;<(/)&6`!+2\".)\u001b-!-\u001bT\"\u0014\u001f\u0016#hM", (short) (ZN.Xd() ^ 10613)) + DefaultHostnameVerifier.getSubjectAltNames((X509Certificate) session.getPeerCertificates()[0]));
        } catch (IOException e6) {
            try {
                sSLSocket.close();
            } catch (Exception unused2) {
            }
            throw e6;
        }
    }

    @Override // cz.msebera.android.httpclient.conn.socket.ConnectionSocketFactory
    public Socket connectSocket(int i2, Socket socket, HttpHost httpHost, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpContext httpContext) throws Throwable {
        Args.notNull(httpHost, "HTTP host");
        Args.notNull(inetSocketAddress, "Remote address");
        if (socket == null) {
            socket = createSocket(httpContext);
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        if (i2 > 0) {
            try {
                if (socket.getSoTimeout() == 0) {
                    socket.setSoTimeout(i2);
                }
            } catch (IOException e2) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
                throw e2;
            }
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Connecting socket to " + inetSocketAddress + " with timeout " + i2);
        }
        socket.connect(inetSocketAddress, i2);
        if (!(socket instanceof SSLSocket)) {
            return createLayeredSocket(socket, httpHost.getHostName(), inetSocketAddress.getPort(), httpContext);
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        this.log.debug("Starting handshake");
        sSLSocket.startHandshake();
        verifyHostname(sSLSocket, httpHost.getHostName());
        return socket;
    }

    @Override // cz.msebera.android.httpclient.conn.socket.LayeredConnectionSocketFactory
    public Socket createLayeredSocket(Socket socket, String str, int i2, HttpContext httpContext) throws Throwable {
        SSLSocket sSLSocket = (SSLSocket) this.socketfactory.createSocket(socket, str, i2, true);
        String[] strArr = this.supportedProtocols;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        } else {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            ArrayList arrayList = new ArrayList(enabledProtocols.length);
            for (String str2 : enabledProtocols) {
                if (!str2.startsWith("SSL")) {
                    arrayList.add(str2);
                }
            }
            if (!arrayList.isEmpty()) {
                sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        }
        String[] strArr2 = this.supportedCipherSuites;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        } else {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList2 = new ArrayList(enabledCipherSuites.length);
            for (String str3 : enabledCipherSuites) {
                if (!isWeakCipherSuite(str3)) {
                    arrayList2.add(str3);
                }
            }
            if (!arrayList2.isEmpty()) {
                sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Enabled protocols: " + Arrays.asList(sSLSocket.getEnabledProtocols()));
            this.log.debug("Enabled cipher suites:" + Arrays.asList(sSLSocket.getEnabledCipherSuites()));
        }
        prepareSocket(sSLSocket);
        if (this.log.isDebugEnabled()) {
            this.log.debug("Enabling SNI for " + str);
        }
        try {
            sSLSocket.getClass().getMethod("setHostname", String.class).invoke(sSLSocket, str);
        } catch (Exception e2) {
            if (this.log.isDebugEnabled()) {
                this.log.debug("SNI configuration failed", e2);
            }
        }
        this.log.debug("Starting handshake");
        sSLSocket.startHandshake();
        verifyHostname(sSLSocket, str);
        return sSLSocket;
    }

    @Override // cz.msebera.android.httpclient.conn.socket.ConnectionSocketFactory
    public Socket createSocket(HttpContext httpContext) throws IOException {
        return SocketFactory.getDefault().createSocket();
    }

    protected void prepareSocket(SSLSocket sSLSocket) throws IOException {
    }
}
