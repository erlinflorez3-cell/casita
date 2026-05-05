package com.cleafy.mobile.detection.agent.configuration.builder;

import com.cleafy.mobile.detection.agent.configuration.CleafyDetectorsConfiguration;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005#4\u0012\u0006\u0013nj?>Le^.ZS0\u0010\u0002ڔd$\n#2HтY\u001c\u0004\"\u0017P\u0017zuqbZ9¼?\n${\u0003,wWޯa\u0014\u00155Ps\bF[tU9\u000fҚf\t.7:8(\u0007в\u001e,N\u0015\u0005~\f^\u001a\u0019H@\u001fí\u0003\u0011[\f2\u00124Dŋ\u0005 bn\\>\u0011\u007fkCG#1݃rR5hH|{\u000fТX)\u0013\u007fo\"sSE?-%\u0002Έ7ViI\u001b? ?ݾl)-5Ww If\u000b,\u0015Y˽=a\u00011t\u0005\u007fbВ+-UnYTV;\u0006\u0007\u0014\rjǉ>\n5TF-Hhڿ\u00125z~aD\u0019\u0015lO\u0018z\u0010اG)\u000e@C9IhЂe=\u001f[E\u007fM ,1\u0019nOż\u0005\u0012n#3T&SśUBCV\\\u000e\"P{\u0013\tb0Ï44U\u000fG{?0ϲ)9aH1%4\u0015VT\u007fv3\u009b\u0019Wwb`@Ppގ;,\u000f\u001chH-\u0018yalXZҊ} b\u0018\u0016\bA\"Ϣ{>'6\u001eR\u0018{w|e]8ɘ_jEk\u0007k<Yߍb5;cq\u0014*e\u0005'W<\u0011ڳ\tjPf$Z\u000b*ϒ6Jp#\u0006\u007f\ra\u001a'J? ʉd0?-t\u0015v\u0005ٿFC\u0003\u001dm^1%\riK$1ǭTx\u0017\u0016h\\\u001fq.ծͅ0~f8;E\u001a@'>m\"\u0017Kč'\t\u0005\f\u000e`ѮPa"}, d2 = {"\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBP`<R}&GY\u0018\ncRn>(pZ\u001dN)\u001c\u000ffO\u0002xM8#\n<V}Jl\u000b\u0015r\u001e9qoBce", "", "\nh]6g\u0005", "u(E", "", "6sc=7,MS\u0017\u000e\u0005k\f\u0006\u0005,l\u007f'", "uY\u0018\u0019V6F\u001d\u0017\u0006zZ-\u0011R7o|,\u0003@J\u0016\u0017Vo\fKz/>#y\"7v%wKMDl8 %u]H\u000bm5\u0018s7KSM,i\u001cPD\u0014\u000e[\"-+\u001c\u0005WP.{R\u0015)\u0011-M\u0004Ku|\u001b\u001a\u0018>G\u0001F]\u000fG\u0007j", "1daA7,MS\u0017\u000e\u0005k\f\u0006\u0005,l\u007f'", "", "1daA7,MS\u0017\u000e\u0005k\f\u0006\b:o\u00041\u000b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011m\u0015<r&I#\u0006*4q\u001d.\u0017B;z4\u001c$lkBP_.N\u007f6\u0011JX5]VtM!\u000ei\u0012X4V\u0002iE+mDDhe3I}<|_\f%\u000e3yzOdmQ\u0003\u0016yC9uBhc\u0004P\u001eUf1c\flr", ";n]6g6KS\u0018Z\u0006i\f\u0006\u0005,l\u007f'", "/bc6i0Mgw~\n^*\f\u0013<E\t$xG\u0001\u0016", "/ce.a*>R{\u000e\ni\n|\u0016>D\u007f7{>\u0010!$'x\n9}%4", "@n^A7,MS\u0017\u000e\u0005k\f\u0006\u0005,l\u007f'", "B`b8<5CS\u0017\u000e~h5\\\u0012+b\u0007(z", ";nR8?6<O(\u0003\u0005g\u000b|\u0018/c\u000f2\t \n\u0013\u0014No\r", "/ce.a*>R\u0001\txd\u0013\u0007\u0007+t\u00042\u0005\u001f\u0001&\u0017E~\u0018IV.1V\u0005 6", "=m2._3\u001dS(~xm6\nh8a|/{?", "6t\\.a\u000b>b\u0019|\nh9\\\u0012+b\u0007(z", "<eR\u0011X;>Q(\t\b>5x\u00066e~", "5ob\u0011X;>Q(\t\b>5x\u00066e~", "3wc2a+>R\u0003\u0010zk3x\u001d\u000ee\u000f(yO\u000b$vPk\u000bCv$", "Do]\u0011X;>Q(\t\b>5x\u00066e~", "Do]\u0011X;>Q(\t\b>5x\u00066e~fwB\u0001 &A|\u000eCv!CY", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPA3Nr([+N;\\P\u0002G! 8\u0018W,\u0011\u0007iN }HA(]", "0tX9W", "u(;0b4\bQ ~v_@F\u00119b\u0004/{\n\u007f\u0017&Gm\u001d@\u0001.~U\u007f @|_,WL<o6.\"dp=\u0011lu,}'CMb\u000b\\ar;#\u001cg\u001c,5\u0016\u0006]C4{@F#\u00125\u001f", "/fT;g&KS ~vl,"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CleafyDetectorsConfigurationBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2829b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2833f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2835h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2838k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2840m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2842o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2830c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2831d = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2834g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2836i = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2839l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2841n = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2843p = true;

    public final CleafyDetectorsConfigurationBuilder activityDetectorEnabled(boolean z2) {
        this.f2832e = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder advancedHttpCertDetectorEnabled(boolean z2) {
        this.f2833f = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder advancedMockLocationDetectorEnabled(boolean z2) {
        this.f2837j = z2;
        return this;
    }

    public final CleafyDetectorsConfiguration build() {
        return new CleafyDetectorsConfiguration(this.f2828a, this.f2829b, this.f2830c, this.f2831d, this.f2832e, this.f2833f, this.f2834g, this.f2835h, this.f2836i, this.f2837j, this.f2838k, this.f2839l, this.f2840m, this.f2841n, this.f2842o, this.f2843p);
    }

    public final CleafyDetectorsConfigurationBuilder certDetectorEnabled(boolean z2) {
        this.f2829b = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder certDetectorEndpoint(String str) {
        this.f2830c = str;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder extendedOverlayDetectorEnabled(boolean z2) {
        this.f2843p = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder gpsDetectorEnabled(boolean z2) {
        this.f2842o = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder httpDetectorEnabled(boolean z2) {
        this.f2828a = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder humanDetectorEnabled(boolean z2) {
        this.f2840m = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder mockLocationDetectorEnabled(boolean z2) {
        this.f2836i = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder monitoredAppEnabled(boolean z2) {
        this.f2831d = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder nfcDetectorEnabled(boolean z2) {
        this.f2841n = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder onCallDetectorEnabled(boolean z2) {
        this.f2839l = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder rootDetectorEnabled(boolean z2) {
        this.f2834g = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder taskInjectionEnabled(boolean z2) {
        this.f2835h = z2;
        return this;
    }

    public final CleafyDetectorsConfigurationBuilder vpnDetectorEnabled$agent_release(boolean z2) {
        this.f2838k = z2;
        return this;
    }
}
