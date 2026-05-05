package okhttp3.internal.platform;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0012\u007fјnjO0L͜P.`_2şs{BBc$\bCCU0}*\tUNog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00155Xģ]I}ok8\u0019tL\u001c`7(8ѩ\t\u0001(*\u0011;\u0005}[K:\u0016`D~?j\r{\u000bJ\u0018\u0014E8\u00034[\u0016VfWzfR:3\nyG|2ۢ4|S\u0019t^m!?q,8X9K\u0014S[3\u000b``W\u0003mw\u0004\u00191-59as\u0006E\u001f\u0014\\#9_%]!7\r\t_r$'Yb*_\u0019\u00146\f\u0013{;OJ\"N7V@E\u001c|\u0007<F%vaUh\u0002\rSF\u000f2B%&\u00183Y;qƛSň?\u0019Vљߏ\t%"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW\u001a\u0001.CW\u000b4B|\u00015IR<uA&j", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW'}!DZ\b-?C", "u(E", ">q^C\\+>`", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R\u001ar\n9\u007f?\u0001$l", "1n]3\\.N`\u0019m\u0002l\f\u0010\u0018/n\u000e,\u0006I\u000f", "", "Ar[ b*DS(", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&\u001d", "6nbAa(FS", "", ">q^Ab*HZ'", "", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001du\u000b3\t@\u000f%\tKv\r:r24gS", "5dc X3>Q(~yI9\u0007\u00189c\n/", "<df F\u0013\u001c]\"\u000ezq;", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0006\u0006I\u0010\u0017*VE", "<df f3,]\u0017\u0005zm\rx\u0007>o\r<", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&(k\fK\u00012I/", "Bqd@g\u0014:\\\u0015\u0001zk", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\"5J{jM\u0011%&/k\u00178x%B/", ">kPAY6K[\b\f\u000bl;d\u00058a\u0002(\t", "Ar[ b*DS(_v\\;\u0007\u0016C", "\u0011n\\=T5B]\"", "\u0012hb.U3>R{\t\tm5x\u0011/V\u007f5\u007fA\u0005\u0017$", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ConscryptPlatform extends Platform {
    public static final Companion Companion;
    private static final boolean isSupported;
    private final Provider provider;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005#4\u0012\u0006\rnj?1Le^.Zݷ0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N0\b|Nr\u000bq\u00116\u001a\u0007oDI\u0004~\u000e\u0018\u00152PvW3{um?ftD\r82P>B\u000b\u000f#BJ&u)M\u001c\u001b 1XphTҫQ\u000b\"Ň\u001e@&\u0002,_ʊRA"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW\u001a\u0001.CW\u000b4B|\u00015IR<uA&SFkA\u0012_5R\u00010\u001d", "", "u(E", "7rBBc7H`(~y", "", "u(I", "/s;2T:MD\u0019\f\tb6\u0006", ";`Y<e", "", ";h]<e", ">`c0[", "0tX9W\u0010?A)\n\u0006h9\f\t.", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW\u001a\u0001.CW\u000b4B|\u00015IR<uA&j", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ boolean atLeastVersion$default(Companion companion, int i2, int i3, int i4, int i5, Object obj) {
            if ((2 & i5) != 0) {
                i3 = 0;
            }
            if ((i5 & 4) != 0) {
                i4 = 0;
            }
            return companion.atLeastVersion(i2, i3, i4);
        }

        public final boolean atLeastVersion(int i2, int i3, int i4) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i2 ? version.major() > i2 : version.minor() != i3 ? version.minor() > i3 : version.patch() >= i4;
        }

        public final ConscryptPlatform buildIfSupported() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (isSupported()) {
                return new ConscryptPlatform(defaultConstructorMarker);
            }
            return null;
        }

        public final boolean isSupported() {
            return ConscryptPlatform.isSupported;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146Ȑ\u0007\":!\u007f\u0007|jAӄLeV:Zݷ2\u000f\u0002{<$a$wڒ;kڼ.\"7N\u000flmnН^\u000bQ\u000fNG\u0007kDI\u0004z\u000e \u001d5ZyO7SnM9\u000fyL\u0004N6R>\b\u000b\u0019\u001c@G>}+IY\u0014*2Voh[Saŋ\u001e\u0012\u0014Hh\u0019,]\u007fNdJ\u001dcH5;\u0005\u007fA|.\u00106\u000bU%Hj&;\u007fҖ\"6"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\u0003<\u0010\u0018!TwW\u001a\u0001.CW\u000b4B|\u00015IR<uA&SGeG\u0003`3Nu\nQZ]5XZr.\u0014\u001f^\u000fR+\u001aZ", "\u001ana4\"*H\\'|\br7\fR\ro\t6yM\u0015\"&*y\u001cK\u007f!=Yn Dq\u00172MP\u0011", "u(E", "Dda6Y@", "", "1daAf", "", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E3Paj%o\u001bKz&9Wy/7C", "6nbAa(FS", "", "Adb@\\6G", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016{N\u000f\u001b!PE", "uZ;7T=:\u001d'~xn9\u0001\u0018C/}(\tOJ\nf\u0012Ck<\u000449Z\u0002\u001e3|\u0016\u00044H7|0g\u001cdj;PQ;[z0I\"51XcnP]\u001bZ\u001d\u00189\u001b\f#/\u0012U27-\u00160S\u000b\u0011,u", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DisabledHostnameVerifier implements ConscryptHostnameVerifier {
        public static final DisabledHostnameVerifier INSTANCE = new DisabledHostnameVerifier();

        private DisabledHostnameVerifier() {
        }

        public final boolean verify(String str, SSLSession sSLSession) {
            return true;
        }

        public boolean verify(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) {
            return true;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        boolean z2 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (companion.atLeastVersion(2, 1, 0)) {
                    z2 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        isSupported = z2;
    }

    private ConscryptPlatform() {
        Provider providerNewProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(providerNewProvider, "newProvider()");
        this.provider = providerNewProvider;
    }

    public /* synthetic */ ConscryptPlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.configureTlsExtensions(sslSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) Platform.Companion.alpnProtocolNames(protocols).toArray(new String[0]));
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.getSelectedProtocol(sslSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.provider);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.Platform
    public SSLSocketFactory newSslSocketFactory(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContextNewSSLContext = newSSLContext();
        sSLContextNewSSLContext.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager platformTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, DisabledHostnameVerifier.INSTANCE);
                return x509TrustManager;
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        throw new IllegalStateException(sb.append(string).toString().toString());
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return null;
    }
}
