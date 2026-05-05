package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\":!\u007f\u0007tvA0JfP.`q2\u000f\u0002{<$a&yCQU\"Ԃ*\t]No˧vJp\u000bK\u000f\f\u001a\u0001j:O]xc\u0019%˰`\u0012o3{nu9\u0002\u0017v:&݅2<\b\u0005\u0019\u001aXI z\tEc\f@1P|HU%U\u0015\u001c\"\u0006l%\u0017\u001d\u000bk^BVruB?%\u0013ipS=^^\u0001֔\u0011Fb.U\u0012o.C@eFE)a\u0015\u001fR\nR3C\u007fQ\u001dhU(qɞָ[6^\u0015\\(9W%e\u0003(l\u0005\u007fj\"&YX*Pח\u0012(}\u0011D\u001eJ\u001b&\u0006UI^3(~ \u0010Is!R\u0007Ч\u0002'H\u000e\u0014y6E?FGsE)\u0002iai\u001a~;\n!%\u001eQ\u001477iq&`CÑ\u0005{_Ci@k[~\u000egQ\u0006\u0004\u001fcH*L;U\u0002G{?/]*ھ_9)?4\u0015VR\u007f~\u0015bxS\u0018a^?Pw\\<Ҋ\r\f`c-\u000byplXZ\u0016\u00140%\u001e\f\u0010+(lyL!S\u001adN\u0017r!\u0013ύ\u000e)Gh=a|v^mGaK=ae a\u0001{*>jf[֝h͞W\u000eb\\6.\u0003Yx\u0010\u0010{rOB\u0018\u0558Cw$عD3\u001f\\#US/PC\u0015\t\u000e[\u001f\u0015њX9,Ѱ\u0002&z\u000b\u000f]-\b}u\u0011Q<~p\"[Pg4G/\fgמ8\u0001;\t\u0005\u0002\u000eR8bUR\u0005\u001e\u0006W\f D\u001fOP]AiÄ\u0001Ȟ6\u00045EZ~ϵUp"}, d2 = {"\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1iK\u0001\u0015l", "", "7rC9f", "", "At_=b9Ma\b\u0006\t>?\f\t8s\u00042\u0005N", "1h_5X9,c\u001d\u000ezl\b\u000bv>r\u00041}", "", "", "Bkb#X9LW#\b\t::j\u0018<i\t*", "uYI(?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV\r}Lk\u001f8@,1b\u007fi%|#2VE\u0011/%", "1h_5X9,c\u001d\u000ezl", "", "\u001anZ5g;I!b\\~i/|\u0016\u001du\u00047{\u0016", "u(;7T=:\u001d)\u000e~euc\r=tU", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "u(I", "Bkb#X9LW#\b\t", "\u001anZ5g;I!bm\u0002l\u001d|\u0016=i\n1Q", "/o_9l", "", "Ar[ b*DS(", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&\u001d", "7r5._3;O\u0017\u0005", "/o_9ljHY\u001c\u000e\ni", "zcT=e,<O(~yX*\u0001\u00142e\r\u0016\fD\u0010\u0017%", "3pd._:", "=sW2e", "6`b566=S", "", "7r2<`7:b\u001d{\u0002^", "AnR8X;", "At_=b9MS\u0018l\u0006^*", "zcT=e,<O(~yX:\r\u0014:o\r7\n/\b%vZ~\u000eE\u0005)?b\f", "zcT=e,<O(~yX;\u0004\u0017 e\r6\u007fJ\n%", "BnBAe0GU", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ConnectionSpec {
    private static final CipherSuite[] APPROVED_CIPHER_SUITES;
    public static final ConnectionSpec CLEARTEXT;
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final Companion Companion = new Companion(null);
    public static final ConnectionSpec MODERN_TLS;
    private static final CipherSuite[] RESTRICTED_CIPHER_SUITES;
    public static final ConnectionSpec RESTRICTED_TLS;
    private final String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final String[] tlsVersionsAsString;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007f\u0007ljA0RtP.`_2\u000fq\f<$q$yّCU0}*\tUN}˧\u001fJ\t\n\u0004\u001c\f$\tn:Imx\f\u0013Ƥ6B}AsZuQId\u00039\u001d `&أ}\u0005\u000f\u001frL\u001e\u000e\u0013CyÈZ4N\tRR;˟M\u001e \u001fV /\"%\u0005\\<`l\fŽ_3\u0011oZV7c6{]\rt\\U\u0014\u0017aL3Ë;5#?\u001c \u0015Xs?1ӊ\"M\u0013n?/;MyVFX./C2o\r\f\u000e͉`\u0005_|T59]{K~ʫX{\t\n%<2\u000fL,\u0011K;.~\b<ޗ%\u0003aTh\nnF\u0006yq6E-.:K9InЂe;'h\u007f\u0019\u0013!6#/͙Qkb\"x\u001d+X}PAQnZvU*Yk\u000bձtb\u0010HTRU\u0006G\u0004!0'%ecO\"OrX҇Pϼz\u0013hhavjJF+| W,\u000f\u0017hP5\u001dy^lXZ\u0012$Ƚ`Θ\u0002\u0014\u001b\u05fetyB03 nQnzxO.\"3/~7\boBގcߍb?=ȡ{\u0012gd\u0005$_>h\u0018fh\u0013u\u001ant024Xj>\u007f\u0012C|\u0013iԶKۇ B41'i-J\t3PK\u001d\u000bepv\u001cѠXR"}, d2 = {"\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1iK\u0001\u0015U$\u007f\u0012Cu%B/", "", "Bkb", "", "uY\u0018#", "1n];X*MW#\bhi,z", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1iK\u0001\u0015l", "uK^8[;M^fHXh5\u0006\t-t\u00042\u0005.\f\u0017\u0015\u001d3~", "1h_5X9,c\u001d\u000ezl", "", "", "5dc\u0010\\7AS&l\u000bb;|\u0017mo\u0006+\u000bO\f", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "Adc\u0010\\7AS&l\u000bb;|\u0017mo\u0006+\u000bO\f", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004q", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "At_=b9Ma\b\u0006\t>?\f\t8s\u00042\u0005N", "5dc h7I]&\u000e\tM3\u000bhBt\u007f1\nD\u000b %\u0006y\u0014?\u00064@", "u(I", "Adc h7I]&\u000e\tM3\u000bhBt\u007f1\nD\u000b %\u0006y\u0014?\u00064@", "5dc!_:|]\u001f\u0002\nm7", "Adc!_:|]\u001f\u0002\nm7", "Bkb#X9LW#\b\t", "5dc!_:/S&\r~h5\u000bG9k\u00037\u000bK", "Adc!_:/S&\r~h5\u000bG9k\u00037\u000bK", "/k[\u0012a(;Z\u0019}Xb7\u007f\t<S\u0010,\u000b@\u000f", "/k[\u0012a(;Z\u0019}ie:m\t<s\u00042\u0005N", "0tX9W", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004g!\u001dJ~\u001dGDn\u0013c\u0007)7k%2WL)v4\u001cSEq=\u000eb,[L", "\u001anZ5g;I!b\\~i/|\u0016\u001du\u00047{\u0016", "uZ;<^/Mb$LD<0\b\f/rm8\u007fO\u0001lZ.y\u0014?\u00064@'G}Av\u001f.KR?u=\f h_wcs0Uu'T\"", "\u001anZ5g;I!bm\u0002l\u001d|\u0016=i\n1Q", "uZ;<^/Mb$LDM3\u000by/r\u000e,\u0006IVZ}Qu\u0011K\u00060\u0003#[*@v\u0016,\\GEt\")\u0015f \u0016\u0017g3Mv4\u001d", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private String[] tlsVersions;

        public Builder(ConnectionSpec connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.tls = connectionSpec.isTls();
            this.cipherSuites = connectionSpec.cipherSuitesAsString;
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions();
        }

        public Builder(boolean z2) {
            this.tls = z2;
        }

        public final Builder allEnabledCipherSuites() {
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            this.cipherSuites = null;
            return this;
        }

        public final Builder allEnabledTlsVersions() {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            this.tlsVersions = null;
            return this;
        }

        public final ConnectionSpec build() {
            return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        public final Builder cipherSuites(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            this.cipherSuites = (String[]) cipherSuites.clone();
            return this;
        }

        public final Builder cipherSuites(CipherSuite... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return cipherSuites((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final String[] getCipherSuites$okhttp() {
            return this.cipherSuites;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.supportsTlsExtensions;
        }

        public final boolean getTls$okhttp() {
            return this.tls;
        }

        public final String[] getTlsVersions$okhttp() {
            return this.tlsVersions;
        }

        public final void setCipherSuites$okhttp(String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z2) {
            this.supportsTlsExtensions = z2;
        }

        public final void setTls$okhttp(boolean z2) {
            this.tls = z2;
        }

        public final void setTlsVersions$okhttp(String[] strArr) {
            this.tlsVersions = strArr;
        }

        @Deprecated(message = "6O\n8v4\u0004b@[<\u000b\u0010gy\u001f/\f\n3\u0011(\u007f>i\u0013qy\\\u0003)i|UsP`\u001ciKK]8R\"[O\u000e'\\\bOt}G'\u001cW#V/6(meKtO0P\f\u000ff1\u0016\u000f\u00169(\t\u0001/g7h\u0004Pe!.\u000e%\u0002'E#+>.\u001a\u001fM[ '^R?n\u000eV:Pzjo`6[fB>zdb8W\u0015\u0013\u00124gp+WXi#^#\t<<g\u0002\u000bX'7\u0002(y^\u001ft=Kti\u0018}\u001dW\u007fWn\u0001(cO2L&W(\u001a-%fJ: \u000f")
        @InterfaceC1492Gx
        public final Builder supportsTlsExtensions(boolean z2) {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.supportsTlsExtensions = z2;
            return this;
        }

        public final Builder tlsVersions(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            this.tlsVersions = (String[]) tlsVersions.clone();
            return this;
        }

        public final Builder tlsVersions(TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return tlsVersions((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\u0015\"4\u0012}\u0007njO0LeN1Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t buh\u0007Pj\rS\u000f4\u0019'l\u0003ղWޯa\u0014\u00172Ps\u0010A[tU9\u000fzl\tvݍ$أ}\u0005\tɝzV\u001e}\u0013Cy\u0012H4\u0017\u0089<ň\u0011M\r܅b\u0014L(\u0019\u001e\u000bm\u0005:\u001fǕ_Ơ3#\u000b݃\u0013b5hH\u0003]\u000fVTU\u0010%ctѫB˝9\u0017-S\u0011\u000b#iM\rWqk\u000b\u001f+}ǪKָ[6`ÜЕ\u00196"}, d2 = {"\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1iK\u0001\u0015U%y\u0016Gr.9c\u0007u", "", "u(E", "\u000fO?\u001fB\u001d\u001e2\u0013\\^I\u000f\\u)So\fj n", "", "\u001anZ5g;I!b\\~i/|\u0016\u001du\u00047{\u0016", ")K^8[;M^fHXb7\u007f\t<S\u0010,\u000b@V", "\u0011K4\u000eE\u001b\u001eF\b", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1iK\u0001\u0015l", "\u0011N<\u001d4\u001b\"0\u007f^tM\u0013j", "\u001bN3\u0012E\u00158B\u007fl", " DB!E\u0010\u001cBx]t<\u0010gk\u000fRy\u0016k$ov\u0005", " DB!E\u0010\u001cBx]tM\u0013j", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        CipherSuite[] cipherSuiteArr = {CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256};
        RESTRICTED_CIPHER_SUITES = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        APPROVED_CIPHER_SUITES = cipherSuiteArr2;
        RESTRICTED_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length)).tlsVersions(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2).supportsTlsExtensions(true).build();
        MODERN_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2).supportsTlsExtensions(true).build();
        COMPATIBLE_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(TlsVersion.TLS_1_3, TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new Builder(false).build();
    }

    public ConnectionSpec(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.isTls = z2;
        this.supportsTlsExtensions = z3;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    private final ConnectionSpec supportedSpec(SSLSocket sSLSocket, boolean z2) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = Util.intersect(enabledCipherSuites, this.cipherSuitesAsString, CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = Util.intersect(enabledProtocols, this.tlsVersionsAsString, ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iIndexOf = Util.indexOf(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        if (z2 && iIndexOf != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iIndexOf];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = Util.concat(cipherSuitesIntersection, str);
        }
        Builder builder = new Builder(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        Builder builderCipherSuites = builder.cipherSuites((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return builderCipherSuites.tlsVersions((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).build();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "cipherSuites", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_cipherSuites */
    public final List<CipherSuite> m10687deprecated_cipherSuites() {
        return cipherSuites();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "supportsTlsExtensions", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_supportsTlsExtensions */
    public final boolean m10688deprecated_supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "tlsVersions", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_tlsVersions */
    public final List<TlsVersion> m10689deprecated_tlsVersions() {
        return tlsVersions();
    }

    public final void apply$okhttp(SSLSocket sslSocket, boolean z2) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        ConnectionSpec connectionSpecSupportedSpec = supportedSpec(sslSocket, z2);
        if (connectionSpecSupportedSpec.tlsVersions() != null) {
            sslSocket.setEnabledProtocols(connectionSpecSupportedSpec.tlsVersionsAsString);
        }
        if (connectionSpecSupportedSpec.cipherSuites() != null) {
            sslSocket.setEnabledCipherSuites(connectionSpecSupportedSpec.cipherSuitesAsString);
        }
    }

    public final List<CipherSuite> cipherSuites() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.Companion.forJavaName(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z2 = this.isTls;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z2 != connectionSpec.isTls) {
            return false;
        }
        return !z2 || (Arrays.equals(this.cipherSuitesAsString, connectionSpec.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, connectionSpec.tlsVersionsAsString) && this.supportsTlsExtensions == connectionSpec.supportsTlsExtensions);
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    public final boolean isCompatible(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !Util.hasIntersection(strArr, socket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || Util.hasIntersection(strArr2, socket.getEnabledCipherSuites(), CipherSuite.Companion.getORDER_BY_NAME$okhttp());
    }

    public final boolean isTls() {
        return this.isTls;
    }

    public final boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final List<TlsVersion> tlsVersions() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.Companion.forJavaName(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public String toString() {
        return !this.isTls ? "ConnectionSpec()" : "ConnectionSpec(cipherSuites=" + Objects.toString(cipherSuites(), "[all enabled]") + ", tlsVersions=" + Objects.toString(tlsVersions(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
    }
}
