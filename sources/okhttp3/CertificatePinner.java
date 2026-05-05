package okhttp3;

import androidx.webkit.ProxyConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZN;
import yg.ZO;
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
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLш|\u0004O&8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?4LeV.Zݷ2\u000fy\b<řc$\bCCU(\u001c*\teNogtJb\u000bQ\u001e\u000e\u0016\u000fj4I[xe\u0012\u001d;JoE4UoK?ht<\t6݅@X*\u0005/\u0019bI/\u0017\u001c\u0004j\u0012۵@J~:j\u0013]\u0007*\u00124@N\u0002.dmNDK\u0005_P.Q\u0007ݦFN5dx$[\u0017^TU\u0018'e,7X7c\"Uc\u0011\u0015jgO\u000bOwM\u0007x'U<w\u0004\u0006E\u001fÜЏ\u0019+U\u001f&\u001a4f\u001dQ\u000f\u0017W/]ocP<5(\u000b\n T\f\u001e\n-G>-H{6\"St!h\u0007UؿbB\u000e\u0011*P%/\u00183YDKj_mS\u0019|D,\u000f\u001b1;\u0007~#kT<uC+\u001d\t_Hi@k`~\u0010gV\u0006\u0006\u0007a0)JΙGHA\n+F\u001d59k9Q#\u001a\u0012xHu\u0003\u001d`\u0017`2XV[:nDSp\u001dTmR\u0002\u001dk~ӹ\t0\u001fP4T5\u0002Nʶء`wB?u$\\R\u0001k\u0001L\f\u000e{ÅhƠ]tsލo;d9CX4%oR\u000f\u001aO>r\u0005\u0007hpT۱^b0ίJJp\u0018\u0006\u0005ΒR."}, d2 = {"\u001anZ5g;I!b\\zk;\u0001\n3c{7{+\u0005  G|c", "", ">h]@", "", "\u001anZ5g;I!b\\zk;\u0001\n3c{7{+\u0005  G|L'z.\u000b", "1daA\\-BQ\u0015\u000ez</x\r8C\u0007(wI\u0001$", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI7\u0003NJt\u0017T~\u0012=z#1h}}:i\u001a7+J;g=\u001e\">", "uKY.i(\bc(\u0003\u0002(\u001a|\u0018\u0005L\n.~O\u0010\"d\u0011s\u0017Kv2>U\u0005iFt$w+CHz8\u001f\u0019f]H\u0007A/Jz0%SN(eR\u007f\u0013W\u0003", "5dc\u0010X9MW\u001a\u0003xZ;|f2a\u00041YG\u0001\u0013 G|LF|(Dh\t", "u(;<^/Mb$LDb5\f\t<n{/EO\b%`%o\u001bKz&9Wy/7K\u0019*QL\u0019r4\u001a\u001ehn\u000f", "5dc\u001d\\5L", "u(;7T=:\u001d)\u000e~euj\t>;", "1gT0^", "", "6nbAa(FS", "", "1kT.a,=>\u0019~\b<,\n\u00183f\u0004&wO\u0001%wP", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E3Paj%o\u001bKz&9Wy/7C", "1gT0^jHY\u001c\u000e\ni", ">dT?6,Kb\u001d\u007f~\\(\f\t=", "", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E\u001e\u0001$&Kp\u0012:r45/", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u001c<t5B]\r4\u0001k\u0016;\\\r\u0019kA-\u0019ie7\u0003r,$:\u0018", "3pd._:", "", "=sW2e", "4h]1@(MQ\u001c\u0003\u0004`\u0017\u0001\u0012=", "6`b566=S", "", "Ehc56,Kb\u001d\u007f~\\(\f\t\rh{,\u0005\u001e\b\u0017\u0013Po\u001b", "Ehc56,Kb\u001d\u007f~\\(\f\t\rh{,\u0005\u001e\b\u0017\u0013Po\u001bz\u0001+8h\r+", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "\u001eh]", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>*6B\u0015\"4\u0012}\tnjG<LeV=ZS0\u000fs{J$cҕ\bّkUH|b\fҊRgun\u0013\u007f\u0019I'\u0006Dю\u001b0W\\\u0011]@\u0017bR}@KU\u007fA?_\u000563(`+Xy3\tʀ.H\u001e\u0001CGY\u0017*0n|\u000bg\u001bN\u001d \"\bN /!\u000biߑ:NtҗR1)\u0007wGĠ+l"}, d2 = {"\u001anZ5g;I!b\\zk;\u0001\n3c{7{+\u0005  G|L\u0019\u0007)<X}-\r", "", "u(E", ">h]@", "", "\u001anZ5g;I!b\\zk;\u0001\n3c{7{+\u0005  G|L'z.\u000b", "5dc\u001d\\5L", "u(;7T=:\u001d)\u000e~euc\r=tU", "/cS", ">`cAX9G", "", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u0011*Eq7-$s/\u0003dc9]z(KJJ;\\=vF\u001d\u0012gL+;\u0011\fXA1D", "0tX9W", "\u001anZ5g;I!b\\zk;\u0001\n3c{7{+\u0005  G|c", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String pattern, String... pins) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pins, "pins");
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(CollectionsKt.toSet(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјnjO0L͜P.hS2\u000f\u0002{<$a$w٘<kڼ.\"7N\u000flmnН^\u000bQ\u000fN$\u0007mDI\u0004|\u000e\u0016\u001d7Zom9\u0014t\u0006Cn{N\u0005N:J8(\u000eG\u001frR\u001e\u0001\u0013Cy\u0014:0ny\u0001W][\u0013\u001b*\u0006l\"7\"3ɩPɇLleŽǫ'\u000e"}, d2 = {"\u001anZ5g;I!b\\zk;\u0001\n3c{7{+\u0005  G|L\u001a\u0001-@U\u0007$Avk", "", "u(E", "\u0012D5\u000eH\u0013-", "\u001anZ5g;I!b\\zk;\u0001\n3c{7{+\u0005  G|c", ">h]", "", "1daA\\-BQ\u0015\u000ez", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E\u001e\u0001$&Kp\u0012:r45/", "AgP};(LV", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E3Paj%o\u001bKz&9Wy/7C", "AgP~(|!O'\u0002", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final String pin(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + sha256Hash((X509Certificate) certificate).base64();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        @JvmStatic
        public final ByteString sha1Hash(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
        }

        @JvmStatic
        public final ByteString sha256Hash(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4C\u0007\"B\u0012\u007f\u0007loA0RnP.XS2\u000fy\u0002<$a$yCQU\"}(\u000beȞ\u0018g\u001dI\u001b\u001eS\u0013\u0014\u0016\u0011jZJe|k\u0014'2ppУ7M}@\u0002q\u0003B\u001d `/h\u007f\u0013\u000f2,^\u000f%y\nƎ\fZ6N\u007fRR;]K.Z\u0012L1\u0019\u001e\u000bt~:V~u:]6KuPb?_^\n}\u0011Ti?\r%bf1NMM\u0015STI\u001b#jM\u0007Wqk\nص+-3ɞ\fY<^\u000e\u001be:]\u0015urT]ԇUf\u0014ʬCQiT^\u0018x\u0007\t{%<2\u000fΝ+N6Ʀ2h\u000e\u0019A~ɪWW"}, d2 = {"\u001anZ5g;I!b\\zk;\u0001\n3c{7{+\u0005  G|L'z.\u000b", "", ">`cAX9G", "", ">h]", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "6`b5", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "5dc\u0015T:A", "u(;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}", "6`b543@]&\u0003\na4", "5dc\u0015T:A/ \u0001\u0005k0\f\f7", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001dT;MS&\b", "3pd._:", "", "=sW2e", "6`b566=S", "", ";`c0[,L1\u0019\f\nb-\u0001\u0007+t\u007f", "1daA\\-BQ\u0015\u000ez", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E3Paj%o\u001bKz&9Wy/7C", ";`c0[,L6#\r\ng(\u0005\t", "6nbAa(FS", "BnBAe0GU", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Pin {
        private final ByteString hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String pattern, String pin) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pin, "pin");
            if ((!StringsKt.startsWith$default(pattern, "*.", false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) pattern, ProxyConfig.MATCH_ALL_SCHEMES, 1, false, 4, (Object) null) != -1) && ((!StringsKt.startsWith$default(pattern, "**.", false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) pattern, ProxyConfig.MATCH_ALL_SCHEMES, 2, false, 4, (Object) null) != -1) && StringsKt.indexOf$default((CharSequence) pattern, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null) != -1)) {
                throw new IllegalArgumentException(("Unexpected pattern: " + pattern).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(pattern);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("Invalid pattern: " + pattern);
            }
            this.pattern = canonicalHost;
            if (StringsKt.startsWith$default(pin, "sha1/", false, 2, (Object) null)) {
                this.hashAlgorithm = "sha1";
                ByteString.Companion companion = ByteString.Companion;
                String strSubstring = pin.substring(5);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                ByteString byteStringDecodeBase64 = companion.decodeBase64(strSubstring);
                if (byteStringDecodeBase64 == null) {
                    throw new IllegalArgumentException("Invalid pin hash: " + pin);
                }
                this.hash = byteStringDecodeBase64;
                return;
            }
            if (!StringsKt.startsWith$default(pin, "sha256/", false, 2, (Object) null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + pin);
            }
            this.hashAlgorithm = "sha256";
            ByteString.Companion companion2 = ByteString.Companion;
            String strSubstring2 = pin.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            ByteString byteStringDecodeBase642 = companion2.decodeBase64(strSubstring2);
            if (byteStringDecodeBase642 == null) {
                throw new IllegalArgumentException("Invalid pin hash: " + pin);
            }
            this.hash = byteStringDecodeBase642;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return Intrinsics.areEqual(this.pattern, pin.pattern) && Intrinsics.areEqual(this.hashAlgorithm, pin.hashAlgorithm) && Intrinsics.areEqual(this.hash, pin.hash);
        }

        public final ByteString getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            String str = this.hashAlgorithm;
            if (Intrinsics.areEqual(str, "sha256")) {
                return Intrinsics.areEqual(this.hash, CertificatePinner.Companion.sha256Hash(certificate));
            }
            if (Intrinsics.areEqual(str, "sha1")) {
                return Intrinsics.areEqual(this.hash, CertificatePinner.Companion.sha1Hash(certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String hostname) {
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            if (StringsKt.startsWith$default(this.pattern, "**.", false, 2, (Object) null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                if (!StringsKt.regionMatches$default(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, (Object) null)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!StringsKt.startsWith$default(this.pattern, "*.", false, 2, (Object) null)) {
                    return Intrinsics.areEqual(hostname, this.pattern);
                }
                int length3 = this.pattern.length() - 1;
                int length4 = hostname.length() - length3;
                if (!StringsKt.regionMatches$default(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, (Object) null) || StringsKt.lastIndexOf$default((CharSequence) hostname, '.', length4 - 1, false, 4, (Object) null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.base64();
        }
    }

    public CertificatePinner(Set<Pin> pins, CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i2 + 2) - (i2 | 2) != 0 ? null : certificateChainCleaner);
    }

    @JvmStatic
    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    @JvmStatic
    public static final ByteString sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    @JvmStatic
    public static final ByteString sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(final String hostname, final List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner.check.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends X509Certificate> invoke() {
                List<Certificate> listClean;
                CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
                if (certificateChainCleaner$okhttp == null || (listClean = certificateChainCleaner$okhttp.clean(peerCertificates, hostname)) == null) {
                    listClean = peerCertificates;
                }
                List<Certificate> list = listClean;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Certificate certificate : list) {
                    Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    @Deprecated(message = "5K\fArw\u001a[\u0018^1\u000fXTG.hU\u00172D+\u000fZ{Iy2A\t6ovS0\u00029e{M\u000f;\u0001", replaceWith = @ReplaceWith(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    @InterfaceC1492Gx
    public final void check(String hostname, Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        check(hostname, ArraysKt.toList(peerCertificates));
    }

    public final void check$okhttp(String str, Function0<? extends List<? extends X509Certificate>> function0) throws Throwable {
        String strXd;
        Intrinsics.checkNotNullParameter(str, hg.Vd("Y_bb[MXO", (short) (C1633zX.Xd() ^ (-23852)), (short) (C1633zX.Xd() ^ (-31095))));
        Intrinsics.checkNotNullParameter(function0, C1561oA.ud("\u001c$\u001c\u0017#\u0019\u0017\u0002\u0016\u0015!p\u0012\u001e\u001f\u0013\u000f\u0011\n\u0007\u0019\t\u0016g\u000f", (short) (C1499aX.Xd() ^ (-18810))));
        List<Pin> listFindMatchingPins = findMatchingPins(str);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = function0.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            ByteString byteStringSha256Hash = null;
            ByteString byteStringSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (Intrinsics.areEqual(hashAlgorithm, C1561oA.yd("$\u001a\u0010aac", (short) (OY.Xd() ^ 17534)))) {
                    if (byteStringSha256Hash == null) {
                        byteStringSha256Hash = Companion.sha256Hash(x509Certificate);
                    }
                    if (Intrinsics.areEqual(pin.getHash(), byteStringSha256Hash)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.areEqual(hashAlgorithm, C1561oA.Yd("\u001d\u0013\r]", (short) (C1580rY.Xd() ^ (-3742))))) {
                        throw new AssertionError(Xg.qd("ICILHIIMPBB~HBUK%QMVZR^SY'\u000e", (short) (FB.Xd() ^ 8756), (short) (FB.Xd() ^ 30509)) + pin.getHashAlgorithm());
                    }
                    if (byteStringSha1Hash == null) {
                        byteStringSha1Hash = Companion.sha1Hash(x509Certificate);
                    }
                    if (Intrinsics.areEqual(pin.getHash(), byteStringSha1Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder(Jg.Wd("d\"H\b\u001e62I\t7Ayk\u007f>[7Wi_G]_\u0004J^n+1^\u001cM`y\"\u0011q\r\u00158j\u0001\u001f\u001b2brJ\u0007)A\u0007%\u000e", (short) (C1633zX.Xd() ^ (-23835)), (short) (C1633zX.Xd() ^ (-5299))));
        Iterator<? extends X509Certificate> it = listInvoke.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strXd = ZO.xd("L\u0019\\(w", (short) (OY.Xd() ^ 20967), (short) (OY.Xd() ^ 28959));
            if (!zHasNext) {
                break;
            }
            X509Certificate next = it.next();
            sb.append(strXd);
            sb.append(Companion.pin(next));
            sb.append(C1626yg.Ud("\u0006M", (short) (OY.Xd() ^ 14940), (short) (OY.Xd() ^ 20309)));
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("\rSv\u0001NG\u0015z^ZS\u0001W\u0012GrG+<.L\u000f.\u0018 )\r9\u0010d:\"\t[", (short) (C1499aX.Xd() ^ (-3291)))).getMethod(EO.Od("4y\u0019\u0019e\u0010mj\u0018V\"P", (short) (OY.Xd() ^ 26864)), new Class[0]);
            try {
                method.setAccessible(true);
                sb.append(((Principal) method.invoke(next, objArr)).getName());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        sb.append(C1561oA.Qd("\u001f43bz~}sq,no{|plngdvfs\u001fdln\u001b", (short) (C1633zX.Xd() ^ (-32631))));
        sb.append(str);
        sb.append(C1593ug.zd("N", (short) (ZN.Xd() ^ 19458), (short) (ZN.Xd() ^ 16459)));
        for (Pin pin2 : listFindMatchingPins) {
            sb.append(strXd);
            sb.append(pin2);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, C1561oA.od(".NKAE=\u0017I<>55Auuy,:94@m'9,.%%1~ 0$)'`d*$\u0007'$\u001a\u001e\u0016UU", (short) (C1607wl.Xd() ^ 30046)));
        throw new SSLPeerUnverifiedException(string);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (Intrinsics.areEqual(certificatePinner.pins, this.pins) && Intrinsics.areEqual(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set<Pin> set = this.pins;
        ArrayList arrayListEmptyList = CollectionsKt.emptyList();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (arrayListEmptyList.isEmpty()) {
                    arrayListEmptyList = new ArrayList();
                }
                Intrinsics.checkNotNull(arrayListEmptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                TypeIntrinsics.asMutableList(arrayListEmptyList).add(obj);
            }
        }
        return arrayListEmptyList;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }
}
