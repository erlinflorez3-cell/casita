package okhttp3.internal.platform;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okio.Buffer;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яv\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$c$wCCU(\n*ޛWNu\u0006vJp\u000bK\u000f\u001c\u0016\u0001j2I]xs\u0012\u0017˰JoU3UڎE9nz>\u0005&5*8\b\u000e\t\u001a0J\u0018v\tDS\f\u00181HpPR\u0015˟\r\u001a(\u0006F \u0007!b{dȤf\u001a\u000e:]\";ho\u000f*ۢ4|[\r\u000fb5\u000e\u000faL-p;C\u0018=S1\u000b\u0019o\b\u0011MvU\u0005\u0017-W/Wzo6\u0007\bZ)s]\u001bf\u000b&\u000b\u000f\u0002d\u001a.CO\u0012S\u0017\"p#\t\u0007%<2\u00106+V1E\u001a\u0015\f>9\u0003~kBf\u0001\rO0\noD/0\u0010:;>IvЂe;\u001f_e\u000bK!fA\u000f\u00019[\u0003\u0010\u0011\u0019)g\u0010Q_epAVc\"Yk\u00044tp\u0019B\u0004^_FCD\u0015<0=7\nFk1y\u001c`F}u3m\u0019WwU`@Pr\\Kr\u0019\u001au\\f\u001bj~S\t0\u001fi4T5\u000bN'hj\u0006Y9%>l\u007flwve]82uz\u007f}|\u000b&Wg`c9_\u0004(a\u0001\u0004DEBb\u0013y~B\u0002$\u000bd.\"@j\u0003\u0012\u000ezrqR'zW\u007f@L,_\u001b\r\u0019V#6Bo\n9eh\u000e(\u0001j2R\u000208=\u000f\u000fvtp\u001e\u000f?]t\u000bnJEA\u007f^I*c)\u00014++M\u0013<\u0006U\u0012dGzt\\\n\u001e\u0002.A29\u007f<\u0004'W\u000f79\u001a/[K!m\u0002Q S\u0013|(8\u0002|הk6"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW'}!DZ\b-?C", "", "u(E", "/ec2e\u000f:\\\u0018\r}Z2|", "", "Ar[ b*DS(", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&\u001d", "0tX9W\n>`(\u0003{b*x\u0018/C\u0003$\u007fI^\u001e\u0017Cx\u000eI", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI7\u0003NJt\u0017T~\u0012=z#1h}}:i\u001a7+J;g=\u001e\">", "Bqd@g\u0014:\\\u0015\u0001zk", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\"5J{jM\u0011%&/k\u00178x%B/", "0tX9W\u001bKc'\u000egh6\fl8d\u007f;", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI7\u0003NJ\u0006$W}\u001d)\u0001/D=\u0007\u001f7\u0001k", "1n]3\\.N`\u0019m\u0002l\f\u0010\u0018/n\u000e,\u0006I\u000f", "6nbAa(FS", "", ">q^Ab*HZ'", "", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001du\u000b3\t@\u000f%\tKv\r:r24gS", "1n];X*MA#|\u0001^;", "AnR8X;", "\u001aiPCTuGS(Hhh*\u0003\t>;", "/cS?X:L", "\u001aiPCTuGS(H^g,\fv9c\u0006(\u000b\u001c\u007f\u0016$G}\u001c\u0012", "1n];X*MB\u001d\u0007zh<\f", "", "5dc\u001de,?W,", "5dc X3>Q(~yI9\u0007\u00189c\n/", "5dc g(<Y\b\fv\\,]\u0013<C\u00072\n@|\u0014\u001eG", "1k^@X9", "7r29X(Kb\u0019\u0012\nM9x\n0i}\u0013{M\t\u001b&Vo\r", "", ":nV", ";db@T.>", ":de2_", "B", "", ":nV\u0010_6LS\u0015{\u0002^\u0013|\u00055", "AsP0^\u001bKO\u0017~", "<df F\u0013\u001c]\"\u000ezq;", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0006\u0006I\u0010\u0017*VE", "<df f3,]\u0017\u0005zm\rx\u0007>o\r<", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&(k\fK\u00012I/", ">kPAY6K[\b\f\u000bl;d\u00058a\u0002(\t", "BnBAe0GU", "Ar[ b*DS(_v\\;\u0007\u0016C", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class Platform {
    public static final Companion Companion;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger;
    private static volatile Platform platform = null;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u0006\u0010nj?3Le^.ZS0\u000fs{J$cҕyCIs\"}0\u0015WȞog\u0005JbŏK\u000f\u0014&\u0001j2L]xk\u0012\u0017˰HĪ@Iݹ =g_5;\u000b ݨ&8\b\u0005I28W(|\u000bE[\f@An\u0001j\\\u001b_\u001d \"\bN /1\u000bw\u0017HV\u0001u:]83sP`?e@~]\rtgU\u001d?g,AX7c#kSK\r`rW\u0003m\u007f\u0004\u00051-5Cas\u0006D\u001f\u007f\\\u001b9h%]!4#\n\u001an\u001aACO\u0012f\u0001\u0014.w\t\t%<2\u001cV3V/E\u001a\u0015\ndޞGɤW@X\u061c/N\u000e}y6E'VĘ}ݰ\u001ffYĥ\f(\\;\u0014\u0005;#YEͼ%_l\u0010f\u0019)ZHc?XX=vS@\u001a\u0014Ъ\u0006Ͳf\u0006B\u00066N\u000e5L#<\u001f=7\n>YaBȸJזkz\u001dbn[wX\u0019R0w.7X\u000eB\u001b\u001bߢ\u0007\u07fbTXp.\u0017V*ZW\u0012\u0016\u001d8d\u0016HI'&M}s\u0018u$έ\fɻ3f?ժ?w\u001cdQ^aC(Ҳ\u001cуVv\u001c̳ףf!"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW'}!DZ\b-?,s8UN7t8(\u001e>", "", "u(E", "\u0017M5\u001c", "", "%@A\u001b", "7r0;W9HW\u0018", "", "u(I", "7r1<h5<gvz\tm3|s<e\u0001(\tM\u0001\u0016", "7r2<a:<`-\n\nI9|\n/r\r(z", "7r>=X5#A\u0007^ek,}\t<r\u007f'", ":nV4X9", "\u001aiPCTuNb\u001d\u0006De6~\u000b3n\u0002qbJ\u0003\u0019\u0017TE", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", ">kPAY6K[", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW'}!DZ\b-?C", "/k_;C9Hb#|\u0005e\u0015x\u0011/s", "", "", ">q^Ab*HZ'", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "1n]0T;%S\"\u0001\na\u0017\n\t0i\u0013(z", "", "4h]145=`#\u0003yI3x\u00180o\r0", "4h]1==F> z\n_6\n\u0011", "4h]1C3:b\u001a\t\bf", "5dc", "@db2g\rH`\b~\tm:", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Platform findAndroidPlatform() {
            AndroidLog.INSTANCE.enable();
            Platform platformBuildIfSupported = Android10Platform.Companion.buildIfSupported();
            if (platformBuildIfSupported != null) {
                return platformBuildIfSupported;
            }
            Platform platformBuildIfSupported2 = AndroidPlatform.Companion.buildIfSupported();
            Intrinsics.checkNotNull(platformBuildIfSupported2);
            return platformBuildIfSupported2;
        }

        private final Platform findJvmPlatform() {
            OpenJSSEPlatform openJSSEPlatformBuildIfSupported;
            BouncyCastlePlatform bouncyCastlePlatformBuildIfSupported;
            ConscryptPlatform conscryptPlatformBuildIfSupported;
            if (isConscryptPreferred() && (conscryptPlatformBuildIfSupported = ConscryptPlatform.Companion.buildIfSupported()) != null) {
                return conscryptPlatformBuildIfSupported;
            }
            if (isBouncyCastlePreferred() && (bouncyCastlePlatformBuildIfSupported = BouncyCastlePlatform.Companion.buildIfSupported()) != null) {
                return bouncyCastlePlatformBuildIfSupported;
            }
            if (isOpenJSSEPreferred() && (openJSSEPlatformBuildIfSupported = OpenJSSEPlatform.Companion.buildIfSupported()) != null) {
                return openJSSEPlatformBuildIfSupported;
            }
            Jdk9Platform jdk9PlatformBuildIfSupported = Jdk9Platform.Companion.buildIfSupported();
            if (jdk9PlatformBuildIfSupported != null) {
                return jdk9PlatformBuildIfSupported;
            }
            Platform platformBuildIfSupported = Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
            return platformBuildIfSupported != null ? platformBuildIfSupported : new Platform();
        }

        public final Platform findPlatform() {
            return isAndroid() ? findAndroidPlatform() : findJvmPlatform();
        }

        private final boolean isBouncyCastlePreferred() {
            return Intrinsics.areEqual(BouncyCastleProvider.PROVIDER_NAME, Security.getProviders()[0].getName());
        }

        private final boolean isConscryptPreferred() {
            return Intrinsics.areEqual("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean isOpenJSSEPreferred() {
            return Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName());
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
        }

        public final List<String> alpnProtocolNames(List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((Protocol) it.next()).toString());
            }
            return arrayList3;
        }

        public final byte[] concatLengthPrefixed(List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : alpnProtocolNames(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        @JvmStatic
        public final Platform get() {
            return Platform.platform;
        }

        public final boolean isAndroid() {
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
        }

        public final void resetForTests(Platform platform) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Platform.platform = platform;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        platform = companion.findPlatform();
        logger = Logger.getLogger(OkHttpClient.class.getName());
    }

    @JvmStatic
    public static final Platform get() {
        return Companion.get();
    }

    public static /* synthetic */ void log$default(Platform platform2, String str, int i2, Throwable th, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i3 & 2) != 0) {
            i2 = 4;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            th = null;
        }
        platform2.log(str, i2, th);
    }

    public void afterHandshake(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new BasicCertificateChainCleaner(buildTrustRootIndex(trustManager));
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void connectSocket(Socket socket, InetSocketAddress address, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i2);
    }

    public final String getPrefix() {
        return "OkHttp";
    }

    public String getSelectedProtocol(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public Object getStackTraceForCloseable(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void log(String message, int i2, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        logger.log(i2 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void logCloseableLeak(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        log(message, 5, (Throwable) obj);
    }

    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory newSslSocketFactory(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextNewSSLContext = newSSLContext();
            sSLContextNewSSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: " + e2, e2);
        }
    }

    public X509TrustManager platformTrustManager() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        throw new IllegalStateException(sb.append(string).toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        try {
            Class<?> sslContextClass = Class.forName("sun.security.ssl.SSLContextImpl");
            Intrinsics.checkNotNullExpressionValue(sslContextClass, "sslContextClass");
            Object fieldOrNull = Util.readFieldOrNull(sslSocketFactory, sslContextClass, "context");
            if (fieldOrNull == null) {
                return null;
            }
            return (X509TrustManager) Util.readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e2) {
            if (Intrinsics.areEqual(e2.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                return null;
            }
            throw e2;
        }
    }
}
