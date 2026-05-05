package com.cleafy.mobile.detection.agent.configuration.builder;

import androidx.compose.ui.layout.LayoutKt;
import com.cleafy.mobile.detection.agent.configuration.AutomaticUpdateAnalysis;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import com.cleafy.mobile.detection.agent.configuration.CleafyDetectorsConfiguration;
import com.cleafy.mobile.detection.agent.configuration.EmulatorDebugAnalysis;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005$4\u0012\u0006\u0010nj?5Le^.ZS0\u000fs{J$c$wCCU0}*\tUNog\u0005Jb\u000bI\u0010\u001cǝ)jZH\u0016}ٕ\u0016\u00118B}@{`}@Q`#Ȃ5$@%Py3\u0003ʀ.J\u0016y\tG\u0014\u001f 5Xphĥ=Q\u0013\u001f*\u0006l\"Ә\"^mSDL5pH5;\u0003\u0018ĩ~+m6\u0015M;Hù+\u000f|g,/\tJC\u001d=S1ޗ\u0003_M\u000bWqk\fص+)1Q\u0002`~k\u000e\u001e-+}Օ\u000ev4f\u001dQ\u000f\u0013ˏ/QiU^\u0017p\u000b\t\u0007%<2\u05fa6+V9E\u001a\u0015\u000fԧ7vx^NYJqP\f\u0013adЍU\u0004A7Q\u001b\u0015Xň?\u001bTC\n\u000eU11\u000e\u0007!\n٪>d#(lw\u007f8ҨD?N[\u0018b\u0006\u0001\u0012~z\u0002Xʶ`K\u000e=\u0014\u0011\\\u001eÉ;]?1/tJ[Rw\u000f\u0005\u000få\u0004m`XX\"\u001d%֖.\u000b\u0012jRuM~^gp,?۳LX\u0015\u0011 \u0013Nnʟ@#+#\\c1|xcu\nSÄ\u0017;g\u0005\u0004\u000e\u0006Nӷ77Wy\u001ex\u001b\u0002\"XTb3pڋFU\u0012sjBϘ6c"}, d2 = {"\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBP`<R}&GY\u0018\ncRn>(od\u0017O/\u000f\u0015f=3rN@{\u00180P\u0001;uV", "", "\nh]6g\u0005", "u(E", "", "/oX\u0012a+I]\u001d\b\n", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011m\u0015<r&I#\u0006*4q\u001d.\u0017B;z4\u001c$lkBP_.N\u007f6\u0011JX5]VtM!\u000ei\u0012X4V\u0002iE+mDDhe3I}<|^\u0016\u001f\u000f9l\u0001OR\u001fK\u0004\u001eRQ-oEYlO", "/o_9\\*:b\u001d\t\u0004A6\u000b\u00188a\b(", "7mc2Z9:b\u001d\t\u0004M6\u0003\t8", "", "2dU.h3M3\"zwe,{", "uY\u0018\u0019V6F\u001d\u0017\u0006zZ-\u0011R7o|,\u0003@J\u0016\u0017Vo\fKz/>#y\"7v%wKMDl8 %u]H\u000bm5\u0018s7KSM,i\u001cPD\u0014\u000e[\",5\u0016\u0006]C4{@F#\u00125&\u0012?o\u007f\f#c", ">`R8T.>/\"z\u0002r:\u0001\u0017\u000fn{%\u0003@\u007f", "3wc2a+>R\u0004zxd(~\t\u0013n\u00012\tH|&\u001bQx", "1n[9X*MA\u0019\b\tb;\u0001\u001a/I~(\u0005O\u0005\u0018\u001bG|\u001c", "6`b5F,Ga\u001d\u000e~o,`\b/n\u000f,|D\u0001$%", "/k[<j\u001cGb&\u000f\tm,{f/r\u000f,|D~\u0013&G}", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBP?<]\u0001/C[R*L]q9#\u00126\u0017J2!\u0013]Oy", "/tc<`(MW\u0017n\u0006](\f\t\u000bn{/\u0010N\u0005%", "uKR<`u<Z\u0019z{ru\u0005\u0013,i\u0007(E?\u0001&\u0017E~\u0012F\u007fn1[})F7\u00148VD?mD+\u0011weC\u0010-\b^\u00061OH]0ZB}<\u0010!ZiW'\u0014\u0019gE2D\b\u001e\u001d\u00124\u0013\u007fBh|\r*W=tmF]\u0010\u0011x\u0015\u0005A'wJchCCCEk9.\ni&]><4!m(\u001frYw\u0007\fW\u0018qR\u00071EN\u0019v98\u001cwdGIqeIp6#U\u0005T\"6_s+\u0002\u0003", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPC4^}#VV[\u000b\\O\u0003?o\u001bV\u0015b9\u0011\u0013/", "3ld9T;H`w~wn.X\u0012+l\u00146\u007fN", "uKR<`u<Z\u0019z{ru\u0005\u0013,i\u0007(E?\u0001&\u0017E~\u0012F\u007fn1[})F7\u00148VD?mD+\u0011weC\u0010-\fV\u0007.C[X9;RoM\u0016mc\nU?\u001b\tg\u0017gUBA'Q*P\u00027i\u0015U\u001e\u00182nwB \u000fG\t\u0015sP-rO#[{GJT,(n\u0015`!^JG #u#$2M>\u000e\u0003R\u0011\u007f\u001cWngC\u001a\u000f\u0016.Gn_HU|QKx1((\f{\u00191X\u0002\u0001", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPA3Nr([+N;\\P\u0002G! 8\u0018W,\u0011\u0007iN }HA(]", "2dc2V;H`'\\\u0005g-\u0001\u000b?r{7\u007fJ\n", "uKR<`u<Z\u0019z{ru\u0005\u0013,i\u0007(E?\u0001&\u0017E~\u0012F\u007fn1[})F7\u00148VD?mD+\u0011weC\u0010-\nUv#H`-,kRpL\u001e\u001fhkX4\u000e\t[Q1jS;)\u0011\u0002\rh9r\tU\u0014\u00155fqV \u0018Qv\u0019|ArgFh_wVEOks`\u000e_&k\u00048.\u001dr\u001d\u001dx]*\u0019\u007f]\u001a<O\nknF\u0019\b\u0002\u0002EmWGYM_Eu+![\ts!6b}\b\u00051\u000b3*C:", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPA3Nr([*X5]VtM!\u000ei\u0012X4b", "0tX9W", "u(;0b4\bQ ~v_@F\u00119b\u0004/{\n\u007f\u0017&Gm\u001d@\u0001.~U\u007f @|_,WL<o6.\"dp=\u0011lu,}'CMb\nf[sA\u0016\"g\n]/\u0017\u000e/", "/fT;g&KS ~vl,"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CleafyConfigurationBuilder {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2823h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2826k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2816a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2817b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2818c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2819d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AutomaticUpdateAnalysis f2820e = CleafyConfiguration.f2787m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EmulatorDebugAnalysis f2821f = CleafyConfiguration.f2788n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2822g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2824i = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CleafyDetectorsConfiguration f2827l = new CleafyDetectorsConfiguration(false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, LayoutKt.LargeDimension, null);

    public final CleafyConfigurationBuilder allowUntrustedCertificates(boolean z2) {
        this.f2826k = z2;
        return this;
    }

    public final CleafyConfigurationBuilder apiEndpoint(String str) {
        this.f2816a = str;
        return this;
    }

    public final CleafyConfigurationBuilder applicationHostname(String str) {
        this.f2817b = str;
        return this;
    }

    public final CleafyConfigurationBuilder automaticUpdateAnalysis(AutomaticUpdateAnalysis automaticUpdateAnalysis) {
        this.f2820e = automaticUpdateAnalysis;
        return this;
    }

    public final CleafyConfiguration build() {
        return new CleafyConfiguration(this.f2816a, this.f2817b, this.f2818c, this.f2819d, this.f2820e, this.f2821f, this.f2822g, this.f2823h, this.f2824i, this.f2825j, this.f2826k, this.f2827l);
    }

    public final CleafyConfigurationBuilder collectSensitiveIdentifiers(boolean z2) {
        this.f2824i = z2;
        return this;
    }

    public final CleafyConfigurationBuilder defaultEnabled(boolean z2) {
        this.f2819d = z2;
        return this;
    }

    public final CleafyConfigurationBuilder detectorsConfiguration(CleafyDetectorsConfiguration cleafyDetectorsConfiguration) {
        this.f2827l = cleafyDetectorsConfiguration;
        return this;
    }

    public final CleafyConfigurationBuilder emulatorDebugAnalysis(EmulatorDebugAnalysis emulatorDebugAnalysis) {
        this.f2821f = emulatorDebugAnalysis;
        return this;
    }

    public final CleafyConfigurationBuilder extendedPackageInformation(boolean z2) {
        this.f2823h = z2;
        return this;
    }

    public final CleafyConfigurationBuilder hashSensitiveIdentifiers(boolean z2) {
        this.f2825j = z2;
        return this;
    }

    public final CleafyConfigurationBuilder integrationToken(String str) {
        this.f2818c = str;
        return this;
    }

    public final CleafyConfigurationBuilder packageAnalysisEnabled(boolean z2) {
        this.f2822g = z2;
        return this;
    }
}
