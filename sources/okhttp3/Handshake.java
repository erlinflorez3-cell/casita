package okhttp3;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.security.auth.x500.X500Principal;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.Util;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007t\tA0ZeP\u008cZS@\u000fs{:&c$\bCCU \u0003*\t]ZogtLb\u000bQ\u0018\u000e\u0016~j4Ic~e\u0012\u00158Xģ]W}ok8\u0019sZEW8ĲH}\u0013\u00012*v\u0011\u0007~QM$\u0012^C\u0001D`\u0011e\u000b*\u0014\u0016>N\u0007Law^DO\u0005iJ73\tyD^'\u000e6+R;Nù+\r\u0005jf6N9M\u0015SVI\fқ_?\tW:N\u0013\u0002?'Yc$]Ds\u0018\u0016+*}\f$č&%\u000b_|$'Yl*_\u0019\u001f6{\u0013\u0002\u001d>\u0014\u000e4-v3s\u001fǴ\f\u000e9\u0013;`N\\\u001a`X~)n|\u001cӾ\u000431Xcw_pS\u001f^9\f\u0005;$Q\u00065&ƟX\u000ef5ca\u0006cISV<v[P^ǀq\u0004v\u0004J5\u00120_\u007f]|W3ϲ)7a[k'y%`D\u0016\fKt9dwT`@PqL<Ҋ\r\u0012bե|\u0007qRbb|([ l\r\u000e\n# \u000b}j&[\u0015ʽSnqҔe_\u0010)=q\bj|w&YO]aB\b)ߧeV\u000f\u0016EHp\u0013)\u0006Pb$`l*22vp>|2\n%܃Ɠ2Ɛu&<.7)j&`\u0005$QO\bYphz(\u0001j2R\u0010 iڲ\r\u0005h^v\u0002u\u0007\u001a=\u000b`:-oRk\u001ełY(pؔ\u0015%\r~\u0002\u0013\u0018}Z[dlD\u000b}{N\u001cPy(Ȁ?т\u0013\u0003A4\bCScȒiv"}, d2 = {"\u001anZ5g;I!bavg+\u000b\f+k\u007f}", "", "Bkb#X9LW#\b", "\u001anZ5g;I!bm\u0002l\u001d|\u0016=i\n1Q", "1h_5X9,c\u001d\u000ez", "\u001anZ5g;I!b\\~i/|\u0016\u001du\u00047{\u0016", ":nR._\n>`(\u0003{b*x\u0018/s", "", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E\u001e\u0001$&Kp\u0012:r45/", ">dT?6,Kb\u001d\u007f~\\(\f\t=F\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uK^8[;M^fHie:m\t<s\u00042\u0005\u0016g!\u001dJ~\u001dGDn\u0013]\t#7z\u0004>QR;A\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002CX|L\u001b\u0016cWS<\u0015NZQ-lS;)\u0011:\u0013bKq~\u001b\u001a\u0018>5F\u0006G", "u(;<^/Mb$LD<0\b\f/rm8\u007fO\u0001l", "u(;7T=:\u001d)\u000e~euc\r=tU", ":nR._\u0017KW\"|~i(\u0004", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R\u001ar\u00041yD\f\u0013\u001e\u001d", "u(;7T=:\u001d'~xn9\u0001\u0018C/j5\u007fI~\u001b\"Cvc", ">dT?6,Kb\u001d\u007f~\\(\f\t=", ">dT?6,Kb\u001d\u007f~\\(\f\t=$~(\u0003@\u0003\u0013&G", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", ">dT?C9B\\\u0017\u0003\u0006Z3", "u(;<^/Mb$LDM3\u000by/r\u000e,\u0006IV", "<`\\2", "", "5dc\u001bT4>", "uKY.i(\ba\u0019|\u000bk0\f\u001dxc\u007f5\u000b\n^\u0017$Vs\u000f@t!DYSc\u001er\u0012?I\rBg= ^VpF\u000bl.$", "zcT=e,<O(~yX*\u0001\u00142e\r\u0016\fD\u0010\u0017", "3pd._:", "", "=sW2e", "6`b566=S", "", "zcT=e,<O(~yX3\u0007\u0007+l](\tO\u0005\u0018\u001bEk\u001d<\u0005", "zcT=e,<O(~yX3\u0007\u0007+lj5\u007fI~\u001b\"Cv", "zcT=e,<O(~yX7|\t<C\u007f5\u000bD\u0002\u001b\u0015C~\u000eJ", "zcT=e,<O(~yX7|\t<P\r,\u0005>\u0005\"\u0013N", "zcT=e,<O(~yX;\u0004\u0017 e\r6\u007fJ\n", "BnBAe0GU", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Handshake {
    public static final Companion Companion = new Companion(null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final Lazy peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fsڔ<$iByCQU\"}(\nWNuvvJ`\u000bIƫ\u0007,ю\u001b,wT9b\u0018\u000f̓FoM3\u0016\u0003K:xtd\u0007P60;\u0012\u0005/\u001epMǘzzIPTD>A\t:\u0001\u000f}\t(\u0018\u001e>N\bN`uVNH\u001bfj91\r\u0002H^)o0+Y;Q\u00051\u001b\u0004y$;BG5C1\u0002\u000eMW$N\u0011M\n=3jO'YM:\\͏\\\u007f\u001a\u0016sn\u001bl\u000b,l\u0007a`:3YZ\fU`\u0012.v\u000b{;H\u001a\r47\u000f.ǉ\u001ef\u0016\u001f߀x\u0005"}, d2 = {"\u001anZ5g;I!bavg+\u000b\f+k\u007ffYJ\t\"\u0013Ps\u0018EL", "", "u(E", "5dc", "\u001anZ5g;I!bavg+\u000b\f+k\u007f}", "Ar[ X:LW#\b", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016{N\u000f\u001b!PE", "zcT=e,<O(~yX.|\u0018", "Bkb#X9LW#\b", "\u001anZ5g;I!bm\u0002l\u001d|\u0016=i\n1Q", "1h_5X9,c\u001d\u000ez", "\u001anZ5g;I!b\\~i/|\u0016\u001du\u00047{\u0016", ">dT?6,Kb\u001d\u007f~\\(\f\t=", "", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E\u001e\u0001$&Kp\u0012:r45/", ":nR._\n>`(\u0003{b*x\u0018/s", "6`]1f/:Y\u0019", "Bn8:`<MO\u0016\u0006zE0\u000b\u0018", "", "uZ;7T=:\u001d'~xn9\u0001\u0018C/}(\tOJt\u0017T~\u0012=z#1h}uzT\u001b*^?\u0005{C\"\u001c2H=\u0015r\u0002", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt.emptyList();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "sslSession.handshake()", imports = {}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_get */
        public final Handshake m10707deprecated_get(SSLSession sslSession) throws IOException {
            Intrinsics.checkNotNullParameter(sslSession, "sslSession");
            return get(sslSession);
        }

        @JvmStatic
        public final Handshake get(SSLSession sSLSession) throws IOException {
            final List<Certificate> listEmptyList;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            CipherSuite cipherSuiteForJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionForJavaName = TlsVersion.Companion.forJavaName(protocol);
            try {
                listEmptyList = toImmutableList(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return new Handshake(tlsVersionForJavaName, cipherSuiteForJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Function0<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends Certificate> invoke() {
                    return listEmptyList;
                }
            });
        }

        @JvmStatic
        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> peerCertificates, List<? extends Certificate> localCertificates) {
            Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
            Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
            Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
            Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
            final List immutableList = Util.toImmutableList(peerCertificates);
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(localCertificates), new Function0<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$get$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends Certificate> invoke() {
                    return immutableList;
                }
            });
        }
    }

    /* JADX INFO: renamed from: okhttp3.Handshake$peerCertificates$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,\b\bDZc|İOيH\u0011>D\u000f\"Z\u0012&\u0006-r˱4DkI"}, d2 = {"\n`]<a@F])\rS", "", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E\u001e\u0001$&Kp\u0012:r45/", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<List<? extends Certificate>> {
        final /* synthetic */ Function0<List<Certificate>> $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function0<? extends List<? extends Certificate>> function0) {
            super(0);
            function0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            try {
                return function0.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt.emptyList();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> localCertificates, Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = localCertificates;
        this.peerCertificates$delegate = LazyKt.lazy(new Function0<List<? extends Certificate>>() { // from class: okhttp3.Handshake.peerCertificates.2
            final /* synthetic */ Function0<List<Certificate>> $peerCertificatesFn;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function0<? extends List<? extends Certificate>> peerCertificatesFn2) {
                super(0);
                function0 = peerCertificatesFn2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                try {
                    return function0.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return CollectionsKt.emptyList();
                }
            }
        });
    }

    @JvmStatic
    public static final Handshake get(SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    @JvmStatic
    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }

    private final String getName(Certificate certificate) throws Throwable {
        if (certificate instanceof X509Certificate) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Kd("zr\ttB\t{z\u000e\f\u0004\u0010\u0016K\u0002\u0005\u0013\u0016P{YU_j\u000e\u001c\u001f\u0015\u0013\u0017\u0012\u0011%\u0017", (short) (Od.Xd() ^ (-17310)))).getMethod(Wg.Zd("8\u007fz\u0002\u0012'\u0017\u0003&(;2", (short) (OY.Xd() ^ 11785), (short) (OY.Xd() ^ 10203)), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Principal) method.invoke(x509Certificate, objArr)).toString();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Class<?> cls = Class.forName(C1561oA.Xd("qi\u007fk9\u007frq\u0005\u0003z\u0007\rBx{\n\rG]\u0001\u000f\u0012\b\u0006\n\u0005\u0004\u0018\n", (short) (C1607wl.Xd() ^ 23209)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd = (short) (C1580rY.Xd() ^ (-17225));
        int[] iArr = new int["a^pOwme".length()];
        QB qb = new QB("a^pOwme");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method2.setAccessible(true);
            String str = (String) method2.invoke(certificate, objArr2);
            short sXd2 = (short) (C1499aX.Xd() ^ (-26254));
            short sXd3 = (short) (C1499aX.Xd() ^ (-7690));
            int[] iArr2 = new int["ae[O".length()];
            QB qb2 = new QB("ae[O");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                i3++;
            }
            Intrinsics.checkNotNullExpressionValue(str, new String(iArr2, 0, i3));
            return str;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "cipherSuite", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_cipherSuite */
    public final CipherSuite m10701deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "localCertificates", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_localCertificates */
    public final List<Certificate> m10702deprecated_localCertificates() {
        return this.localCertificates;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "localPrincipal", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_localPrincipal */
    public final Principal m10703deprecated_localPrincipal() {
        return localPrincipal();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "peerCertificates", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_peerCertificates */
    public final List<Certificate> m10704deprecated_peerCertificates() {
        return peerCertificates();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "peerPrincipal", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_peerPrincipal */
    public final Principal m10705deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "tlsVersion", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_tlsVersion */
    public final TlsVersion m10706deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.tlsVersion == this.tlsVersion && Intrinsics.areEqual(handshake.cipherSuite, this.cipherSuite) && Intrinsics.areEqual(handshake.peerCertificates(), peerCertificates()) && Intrinsics.areEqual(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() throws Throwable {
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) this.localCertificates);
        X500Principal x500Principal = null;
        X509Certificate x509Certificate = objFirstOrNull instanceof X509Certificate ? (X509Certificate) objFirstOrNull : null;
        if (x509Certificate != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("dZnX$hYVgcYcg\u001bOP\\]\u0016?\u001b\u0015\u001d&GSTHDF?<N>", (short) (OY.Xd() ^ 17419), (short) (OY.Xd() ^ 21049))).getMethod(C1561oA.ud("VSa?`LSMJZ=\u0019\u0013\u00121RHL@EK;E", (short) (OY.Xd() ^ 16201)), new Class[0]);
            try {
                method.setAccessible(true);
                x500Principal = (X500Principal) method.invoke(x509Certificate, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return x500Principal;
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    public final Principal peerPrincipal() throws Throwable {
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) peerCertificates());
        X500Principal x500Principal = null;
        X509Certificate x509Certificate = objFirstOrNull instanceof X509Certificate ? (X509Certificate) objFirstOrNull : null;
        if (x509Certificate != null) {
            short sXd = (short) (ZN.Xd() ^ 7727);
            int[] iArr = new int["\f\u0002\u0016\u007fK\u0010\u0001}\u000f\u000b\u0001\u000b\u000fBvw\u0004\u0005=fB<DMnz{okmfc6&".length()];
            QB qb = new QB("\f\u0002\u0016\u007fK\u0010\u0001}\u000f\u000b\u0001\u000b\u000fBvw\u0004\u0005=fB<DMnz{okmfc6&");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Yd("cbrRuclhgy^<89Z}u{qx\u0001r~", (short) (C1499aX.Xd() ^ (-9101))), new Class[0]);
            try {
                method.setAccessible(true);
                x500Principal = (X500Principal) method.invoke(x509Certificate, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return x500Principal;
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        List<Certificate> listPeerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPeerCertificates, 10));
        Iterator<T> it = listPeerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        StringBuilder sbAppend = new StringBuilder("Handshake{tlsVersion=").append(this.tlsVersion).append(" cipherSuite=").append(this.cipherSuite).append(" peerCertificates=").append(arrayList.toString()).append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        return sbAppend.append(arrayList2).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
