package com.statsig.androidsdk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007t\tA0JoP.hS2\u000fq\u0007Jř\f$ B{~*\u00020\tgN\u0016h~R`\u000bQ\u0011\u001e\u0018\u000fiZLe\u0007c\u0012\u001d6ZwO5]ok<vsd\nڶ6\"F\u007fM\u0005(H`\u0010%}\u0014e\u001a\u0019HB\u00079\u0001\u0010$į&Ū\nJ(ҵ6^mVDQ\r_@91\u000e:Z\\3w0+PcІ`ܮ\u0011\u0003iӜCB=B#.s\u0005\r`iJSN\u007f=\u001dhU(ȅMy_̬p\u0002\u001a$9_]p\u00017t\t\u007fct'\naӍOV\u0016ߊ\u0010|\u0002 J\r^ 5\\F/0e6\u0011\nφ~ՂD\\\nމZ\u0002\u0001vD E\u00029AG&7koR1PMz3\u0010tŇ\rͼ%g\\וx\u0017!l\u0006ZQSFVVYZyKq\u001cxr\u0004:\u0004^J\u0016.*\u0016\u0005ϖ1ھ_E+ܩ\u0004\u0004N^u\u0012%bnowo͛DA"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`7|\u0015\u001a\u0001.6]\u007fu", "", "3mS=b0Gb", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'x\rG\u0001)>hS", "7m_Bg\bIW", "", "CrT?9(EZ\u0016zxd\u001c\n\u0010=", "", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011O\u0017;\u0002/9b\ru\u001er\u0012?I\rBg= ^VpF\u000bl.$],C]JulavD]x^\u001c]\u0001Pu", "1tbAb4.` ", "5dc\u0010h:M]!n\be", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0010h:M]!n\be", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "2dU.h3MC&\u0006", "5dc\u0011X-:c \u000ejk3", "Adc\u0011X-:c \u000ejk3", "5dc\u0012a+I]\u001d\b\n", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9mEu0?]\u0007/\r", "3mS=b0Gbw\b\tD,\u0011", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'x\rG\u0001)>h\\)ES\u0016B#", "5dc\u0012a+I]\u001d\b\n=5\u000bn/y", "4`[9U(<Y\t\f\u0002", "5dc\u0013T3EP\u0015|\u0001N9\u0004", "Adc\u0013T3EP\u0015|\u0001N9\u0004", "AsPAf0@4\u0015\u0006\u0002[(z\u000f\u001fr\u0007", "5dc g(Ma\u001d\u0001[Z3\u0004\u0006+c\u0006\u0018\tG", "Adc g(Ma\u001d\u0001[Z3\u0004\u0006+c\u0006\u0018\tG", "5dc\"f,K4\u0015\u0006\u0002[(z\u000f\u001fr\u00076", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\"f,K4\u0015\u0006\u0002[(z\u000f\u001fr\u00076", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\"e3", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class UrlConfig {
    private String customUrl;
    private String defaultUrl;
    private final Endpoint endpoint;
    private final String endpointDnsKey;
    private String fallbackUrl;
    private String statsigFallbackUrl;
    private List<String> userFallbackUrls;

    public UrlConfig(Endpoint endpoint, String str, List<String> list) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.endpoint = endpoint;
        this.userFallbackUrls = list;
        String str2 = StatsigNetworkConfigKt.getENDPOINT_DNS_KEY_MAP().get(endpoint);
        this.endpointDnsKey = str2 == null ? "" : str2;
        this.defaultUrl = Intrinsics.stringPlus(StatsigNetworkConfigKt.getNetworkDefault().get(endpoint), endpoint.getValue());
        if (this.customUrl != null || str == null) {
            return;
        }
        String str3 = StringsKt.trimEnd(str, '/') + '/' + endpoint.getValue();
        if (Intrinsics.areEqual(str3, this.defaultUrl)) {
            return;
        }
        this.customUrl = str3;
    }

    public /* synthetic */ UrlConfig(Endpoint endpoint, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(endpoint, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : str, (i2 & 4) != 0 ? null : list);
    }

    public final String getCustomUrl() {
        return this.customUrl;
    }

    public final String getDefaultUrl() {
        return this.defaultUrl;
    }

    public final Endpoint getEndpoint() {
        return this.endpoint;
    }

    public final String getEndpointDnsKey() {
        return this.endpointDnsKey;
    }

    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public final String getStatsigFallbackUrl() {
        return this.statsigFallbackUrl;
    }

    public final String getUrl() {
        String str = this.customUrl;
        return str == null ? this.defaultUrl : str;
    }

    public final List<String> getUserFallbackUrls() {
        return this.userFallbackUrls;
    }

    public final void setCustomUrl(String str) {
        this.customUrl = str;
    }

    public final void setDefaultUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.defaultUrl = str;
    }

    public final void setFallbackUrl(String str) {
        this.fallbackUrl = str;
    }

    public final void setStatsigFallbackUrl(String str) {
        this.statsigFallbackUrl = str;
    }

    public final void setUserFallbackUrls(List<String> list) {
        this.userFallbackUrls = list;
    }
}
