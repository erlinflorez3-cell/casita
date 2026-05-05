package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r(4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ic\u0017e\u0012%2JģG3coEʠhtL\u0005(2(A\u0002\u0005\u0017\u001a2H\u0016y\u0003CY\u0015\u001a0F}Pĥ=M3\u0019R}N$\u000f\u001etg|7Xpk<G#1lRR5cH|{\u0012VX5\u0013\u000faL2P=C\u001d=U\u0019\u0006\u0001dO\tM{U\u0007~&U6YyeBp\u0002*\u0014Y\\\u001da\u00014t\u0005\u007fo\u001c-9_{Mf\rV\t\u000b\u0006\u001bN\u001c\u0014\u0016)X.[.\u0015\u001b\u001e=\u0003\bkF`\u0004nB.\u0011\u0010I')\u000eJC9I~Ђe;'g\u007f\t\u0013\u00196%\u0017mOh\u001b\u0013\u05ce\u0019\u001bZ\u001e\u001aB_UUN^\fi=\u001c\u001a\u001fuH/˙4G\u0006VD\u001c<\u001b=7\n>i&Ƞ\u0006HJ\u0010?\u0016n\u0012ki\u0001rp(|AO,\u001f\u000b\tC+ʤk\u0019gfX)MJ~7\u0002\u0016@8\\&˓gطŎROn\u00183Sk9=/\u0015: \u00034\u001beCv5KP\u0012\u001b(Wλ\u0018?B\u0013MitTk\u0012j^8\"`\\\u0019#>\u0001ΌR\f\u0019c\b~*DD3/[CYI#նE|\u000f\u0012#s\u001e\rl3R\u00120)ڲ\r\u0001V\u00109zu\u0010a,+xh2ۮU5\u001fZ\u001e-v:\u0015#5\u0006:\u0005ěkLM\u00025#\u0004]\u0014\",\u0019gZuBт\u0013~/hJ3S\u0004\u000be\u007fNX;C\b\b2Sh\\\fNoҔ0`p\u0003 g%.\u000f`\t\"6q6~ӶJ\u0001Oϊl\raJW\rSpJcP\u0003\u0015!.%/\u0006P\u0010krϡ+#\u001eߐ,1\u001bvk\u0005@?\bf'&#j:1І\u001aujГu4A<WuOQ0.\u0005\u0005XG\u0019\u0003>Gީ8\u0013;ǥYfv`Fj[F\fx\u001f2\u001drf[h'\u001e\u0011jsʡ.yK͟,`I7\u001fh$z{}c^!I=\u001bA\u0001ϥr\u0018$ܻ8X]r\u0017NV\u0005&DY;\u0011\u0014r\u000eӺ82Dފ#EZw\u0014/K\u0011Tv'\u0017`Z*@ټ\u0012Z\u0001ִnJ\u000bwS\u0001q;\u000f\u0005'3L\u007fk6ܭqL\\Џ{4\u0007Y+*k}]\u0007~'AC\u0003BQ-\u0092\u0005\u0011M؏[K\b>\u0012iy~y\u0013$8F!S\bɓ\u001f?YΙwx6\u0002\u0019z͍R\u001e"}, d2 = {"\u001anZ5g;I!bZy]9|\u0017=;", "", "CqX\u0015b:M", "", "CqX\u001db9M", "", "2mb", "\u001anZ5g;I!b]\u0004l\u0002", "AnR8X;\u001fO\u0017\u000e\u0005k@", "\u001aiPCT?\b\\\u0019\u000eDL6z\u000f/t`$yO\u000b$+\u001d", "Ar[ b*DS(_v\\;\u0007\u0016C", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&(k\fK\u00012I/", "6nbAa(FS\n~\bb-\u0001\t<", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u0012o\u000e7\u0005<\t\u0017\bG|\u0012=z%B/", "1daA\\-BQ\u0015\u000ezI0\u0006\u0012/r", "\u001anZ5g;I!b\\zk;\u0001\n3c{7{+\u0005  G|c", ">q^El\bNb\u001c~\u0004m0z\u0005>o\r", "\u001anZ5g;I!bZ\u000bm/|\u0012>i}$\u000bJ\u000el", ">q^El", "\u001aiPCTuGS(Hek6\u0010\u001d\u0005", ">q^Ab*HZ'", "", "\u001anZ5g;I!bi\bh;\u0007\u00079lU", "1n];X*MW#\bhi,z\u0017", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1iK\u0001\u0015l", ">q^El\u001a>Z\u0019|\nh9", "\u001aiPCTuGS(Hek6\u0010\u001d\u001de\u0007(yO\u000b$l", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u000b\u001d\u001aV~\u0019\n@\u0004>gS\u0007<i'*`\rDkCg\u0003r_?\u0007r\rJt6QYb\u0002CWnN\u0010%$\u0017N:V\u0013gHm\\2\u001e\r\u0012*O\u0002JI|\n%\u0018B~F)[\fXu(?J)w\u0010gm\u0001\u0011$Op9m\bg\u001dM:G(\u0015u\u0019(>78\u0010~b } CEgT(~9(<ijF0s^Et4t2\u0006}\u0015Ag\u007fx>\t\u0014C-6m\u0014Oe\u0014Mh\u0006j\u0013a=8\"\u007fE\u0013N\u0015N\u0003vQ\">\u0006f\u0004\u001f^~A(il-/\u0013\u0015llB:]p|\u0001b\u0015BP9{+T\u000e\u0018B~\u0011\u001a\u0003mveX\r\u0006a\u000b-\u00052\"f\u0011\u0001\u0012p%qq\u0007", "u(;<^/Mb$LD<,\n\u00183f\u0004&wO\u0001\u0002\u001bPx\u000eIL", "u(;7T=:\u001d)\u000e~euc\r=tU", "u(;<^/Mb$LD=5\u000b^", "u(;7T=:fb\bzmu\u000b\u00176/b2\nO\n\u0013\u001fG`\u000eIz&9Y\u000bu", "u(;7T=:\u001d\"~\n(\u0017\n\u0013ByU", "u(;<^/Mb$LD:<\f\f/n\u000f,y<\u0010!$\u001d", "u(;7T=:\u001d\"~\n(\u0017\n\u0013Bym(\u0003@~&!TE", "u(;7T=:fb\bzmuj\u0013-k\u007f7\\<~&!T\u0004c", "u(;7T=:fb\bzmu\u000b\u00176/m\u0016b.\u000b\u0015\u001dG~n8t4?f\u0012u", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "u(;<^/Mb$LDA;\f\u0014\u001fr\u0007}", "zcT=e,<O(~yX*|\u0016>i\u0001,y<\u0010\u0017\u0002Kx\u0017<\u0004", "zcT=e,<O(~yX*\u0007\u00128e}7\u007fJ\n\u0005\"Gm\u001c", "zcT=e,<O(~yX+\u0006\u0017", "3pd._:", "", "=sW2e", "3pd._:']\"a\u0005l;", "BgPA", "3pd._:']\"a\u0005l;;\u00135h\u000f7\u0007", "6`b566=S", "zcT=e,<O(~yX/\u0007\u0017>n{0{1\u0001$\u001bHs\u000eI", "zcT=e,<O(~yX7\n\u0013>o}2\u0003N", "zcT=e,<O(~yX7\n\u0013By", "zcT=e,<O(~yX7\n\u0013By[8\u000bC\u0001 &Km\nK\u00012", "zcT=e,<O(~yX7\n\u0013Bym(\u0003@~&!T", "zcT=e,<O(~yX:\u0007\u00075e\u000f\tw>\u0010!$[", "zcT=e,<O(~yX:\u000b\u0010\u001do}.{Oa\u0013\u0015Vy\u001bP", "BnBAe0GU", "zcT=e,<O(~yX<\n\u0010", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Address {
    private final CertificatePinner certificatePinner;
    private final List<ConnectionSpec> connectionSpecs;
    private final Dns dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final HttpUrl url;

    public Address(String uriHost, int i2, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, Proxy proxy, List<? extends Protocol> protocols, List<ConnectionSpec> connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = proxyAuthenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(uriHost).port(i2).build();
        this.protocols = Util.toImmutableList(protocols);
        this.connectionSpecs = Util.toImmutableList(connectionSpecs);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_certificatePinner */
    public final CertificatePinner m10660deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_connectionSpecs */
    public final List<ConnectionSpec> m10661deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "dns", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_dns */
    public final Dns m10662deprecated_dns() {
        return this.dns;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier */
    public final HostnameVerifier m10663deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "protocols", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_protocols */
    public final List<Protocol> m10664deprecated_protocols() {
        return this.protocols;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_proxy */
    public final Proxy m10665deprecated_proxy() {
        return this.proxy;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator */
    public final Authenticator m10666deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_proxySelector */
    public final ProxySelector m10667deprecated_proxySelector() {
        return this.proxySelector;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_socketFactory */
    public final SocketFactory m10668deprecated_socketFactory() {
        return this.socketFactory;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory */
    public final SSLSocketFactory m10669deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_url */
    public final HttpUrl m10670deprecated_url() {
        return this.url;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (Intrinsics.areEqual(this.url, address.url) && equalsNonHost$okhttp(address)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equalsNonHost$okhttp(Address that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.dns, that.dns) && Intrinsics.areEqual(this.proxyAuthenticator, that.proxyAuthenticator) && Intrinsics.areEqual(this.protocols, that.protocols) && Intrinsics.areEqual(this.connectionSpecs, that.connectionSpecs) && Intrinsics.areEqual(this.proxySelector, that.proxySelector) && Intrinsics.areEqual(this.proxy, that.proxy) && Intrinsics.areEqual(this.sslSocketFactory, that.sslSocketFactory) && Intrinsics.areEqual(this.hostnameVerifier, that.hostnameVerifier) && Intrinsics.areEqual(this.certificatePinner, that.certificatePinner) && this.url.port() == that.url.port();
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sbAppend = new StringBuilder("Address{").append(this.url.host()).append(AbstractJsonLexerKt.COLON).append(this.url.port()).append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder("proxySelector=");
            obj = this.proxySelector;
        }
        return sbAppend.append(sb.append(obj).toString()).append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public final HttpUrl url() {
        return this.url;
    }
}
