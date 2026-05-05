package com.cleafy.mobile.detection.agent.configuration;

import androidx.compose.ui.layout.LayoutKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLc\u0003\u0010I\u00066\f6B\r+4ߚ\u007f\u0007|jAӄLe^.ZS0\u0013s{J$c$wDCU(}*\tU[}˧\u001fJ\t\n\u0004\t\u0016\u001a\u0007kDI\u0004xm\u0016\u001d4Zom3]uC9nwN\u0005N22>\u007f\u0005\u000f\u001fBH>z\u000bIQ\f 7XphX\u001dS\u000b\u001a \u000fV /&lmT6Vvu:]'\u0013oHN5jH|{\u0011VZ-\r\u0005m6+n;E\u001b+S\u0011\u0014j[m\u0007OwC\u0005v5?+wwg<^\u007f\"%CO;lę*^\u000bbn\u001eg\u001dUq[V\u0014(\u0006\u000f\u0014\rj\u0017\u001e\n5]F-Hf\u0018\u0012A\u000b\u000bSnP\u0012bP\u0017\u0013ad\u00175\u0004ACQ\u001b\u0015Uq?'gO{3\u0013.'\u000f\t9[\u0003\u0016p\u0019)o\u0010Q_UPAVj\"Ykq\u0014tp\u001fB\u0004^K\u00103\n/F\u0017S;k=1@\u0004\u0002vHwz\u0013\u0001\u0001S\u0018a͕D$t'EKÇ\u0010|"}, d2 = {"\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPA3Nr([*X5]VtM!\u000ei\u0012X4b", "", "", "/oX\u0012a+I]\u001d\b\n", "/o_9\\*:b\u001d\t\u0004A6\u000b\u00188a\b(", "7mc2Z9:b\u001d\t\u0004M6\u0003\t8", "", "7r32Y(NZ(^\u0004Z)\u0004\t.", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBP?<]\u0001/C[R*L]q9#\u00126\u0017J2!\u0013]Oy", "/tc<`(MW\u0017n\u0006](\f\t\u000bn{/\u0010N\u0005%", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPC4^}#VV[\u000b\\O\u0003?o\u001bV\u0015b9\u0011\u0013/", "3ld9T;H`w~wn.X\u0012+l\u00146\u007fN", "7r?.V2:U\u0019Z\u0004Z3\u0011\u00173s_1w=\b\u0017\u0016", "7r4Eg,GR\u0019}eZ*\u0003\u00051ec1|J\u000e\u001f\u0013Vs\u0018E", "7rB2a:Bb\u001d\u0010zB+|\u0012>i\u0001,{M^!\u001eNo\fKz/>9\u0007\u001c4t\u0016-", "7r7.f/,S\"\r~m0\u000e\t\u0013d\u007f1\u000bD\u0002\u001b\u0017T}", "7r09_6PC\"\u000e\bn:\f\t.C\u007f5\u000bD\u0002\u001b\u0015C~\u000eJ", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPA3Nr([+N;\\P\u0002G! 8\u0018W,\u0011\u0007iN }HA(]", "2dc2V;H`'\\\u0005g-\u0001\u000b?r{7\u007fJ\n", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001dA5*fZ<;\u001b\u0012V\u000fbt\u0015\u000fVE+n\u000e6\u001f\u0017,G\u0011?r\nU\u0012\u00105s\u007f\fT\u001aPz\u0019wQ6dU]i\u0003\u0011\u001dUq4l\bn!Z*E#\u0010\u0001\u0019vqL5\u001e\nW\u001fH9wqo\u0011\u0017\u00028 ?\u0002%NOlYCtp\u001eK\u000bw\u0010A\\~4>)\u000643E.\u0003Up\u0019B`\t\"(kE1/\u007f\u001c\u001bOR_\u0005vKlh\u001cq\nik18-siq\u001e\u0004{R\fP\u001c_i\t\u0001P\r>Ep)pN\t?_\u0001\u0015R\u0006$|eGR\u001f^\nclF\"h L\u0001p!\u001d2\u0018Mf\u000bw.i@\u0017p\u0010h4\r\u00108C$pF\u001fwX\u00019ax%:z!V\u001dBOF\u007f(\u0007`", "", "2t\\:l", ">@_685=^#\u0003\u0004m", ">@_=_0<O(\u0003\u0005g\u000f\u0007\u0017>n{0{", ">H]AX.KO(\u0003\u0005g\u001b\u0007\u000f/n", ">Hb\u0011X-:c \u000eZg(y\u0010/d", ">@dAb4:b\u001d|ji+x\u0018/A\t$\u0003T\u000f\u001b%", ">D\\B_(M]&]z[<~d8a\u0007<\nD\u000f", ">Hb\u001dT*DO\u001b~Vg(\u0004\u001d=i\u000e\b\u0005<}\u001e\u0017F", ">Hb\u0012k;>\\\u0018~yI(z\u000f+g\u007f\f\u0005A\u000b$\u001fC~\u0012F\u007f", ">Hb X5LW(\u0003\f^\u0010{\t8t\u0004)\u007f@\u000et!Nv\u000e:\u0006)?b])3j\u001d.L", ">Hb\u0015T:AA\u0019\b\tb;\u0001\u001a/I~(\u0005O\u0005\u0018\u001bG|\u001c", ">Hb\u000e_3He\t\b\nk<\u000b\u0018/d](\tO\u0005\u0018\u001bEk\u001d<\u0005", ">CTAX*M]&\rXh5}\r1u\r$\u000bD\u000b ", "uKZ<g3B\\bn\u0004b;Ro4a\u0011$EG| \u0019\u0011]\u001dIz.7/d%3~\u0012wT?Dm}\f$ueB\t9\u0013Sr8C\u0016U(eT<+#\u001f^\u0017P\u0001\u0002kWK,8B>\u001f\u0004-]KCr}\u0010\u001d\u000e~ipQV\u000eV}\u001f~\u000b%jFbnCEKNc.f\u001cl\u0019k>D-]M)*rX*\u0019\u007fQ\u0001}Quvg#\"v?8Lqi\u001c,m_D>%&Kwx&{`~(x4\u0004})6s\u0005Iv\u001cHgB\u0011.\\J6o4F\u001c@Oe\u0006y:\u001dl)jQmjE8\u0015top'\u000f\u0004m\u00197>]f\u0015EV\u0014\u0014>d\n\u001c;e@e\u0002^\u0007\u000e$if]\r#^}\u001ewDk^\u0011\u0012\u0003d' 8\u001f\u0007U\u0011h3n\u0001K\u001d\u0012i<\u000e\ff?$tR\u00197)y[Sp8\u0015x I\u001fBUI\u00050Mx\u0011\u001a6\u0011\u0018z,wsKOy\u0004", "/fT;g&KS ~vl,"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CleafyConfiguration {

    /* JADX INFO: renamed from: m */
    public static final AutomaticUpdateAnalysis f2787m = AutomaticUpdateAnalysis.NONE;

    /* JADX INFO: renamed from: n */
    public static final EmulatorDebugAnalysis f2788n = EmulatorDebugAnalysis.NONE;

    /* JADX INFO: renamed from: a */
    public final String f2789a;

    /* JADX INFO: renamed from: b */
    public final String f2790b;

    /* JADX INFO: renamed from: c */
    public final String f2791c;

    /* JADX INFO: renamed from: d */
    public final boolean f2792d;

    /* JADX INFO: renamed from: e */
    public final AutomaticUpdateAnalysis f2793e;

    /* JADX INFO: renamed from: f */
    public final EmulatorDebugAnalysis f2794f;

    /* JADX INFO: renamed from: g */
    public final boolean f2795g;

    /* JADX INFO: renamed from: h */
    public final boolean f2796h;

    /* JADX INFO: renamed from: i */
    public final boolean f2797i;

    /* JADX INFO: renamed from: j */
    public final boolean f2798j;

    /* JADX INFO: renamed from: k */
    public final boolean f2799k;

    /* JADX INFO: renamed from: l */
    public final CleafyDetectorsConfiguration f2800l;

    public CleafyConfiguration(String str, String str2, String str3, boolean z2, AutomaticUpdateAnalysis automaticUpdateAnalysis, EmulatorDebugAnalysis emulatorDebugAnalysis, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, CleafyDetectorsConfiguration cleafyDetectorsConfiguration) {
        this.f2789a = str;
        this.f2790b = str2;
        this.f2791c = str3;
        this.f2792d = z2;
        this.f2793e = automaticUpdateAnalysis;
        this.f2794f = emulatorDebugAnalysis;
        this.f2795g = z3;
        this.f2796h = z4;
        this.f2797i = z5;
        this.f2798j = z6;
        this.f2799k = z7;
        this.f2800l = cleafyDetectorsConfiguration;
    }

    public /* synthetic */ CleafyConfiguration(String str, String str2, String str3, boolean z2, AutomaticUpdateAnalysis automaticUpdateAnalysis, EmulatorDebugAnalysis emulatorDebugAnalysis, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, CleafyDetectorsConfiguration cleafyDetectorsConfiguration, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 + 4) - (i2 | 4) != 0 ? "" : str3, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? true : z2, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? f2787m : automaticUpdateAnalysis, (i2 + 32) - (i2 | 32) != 0 ? f2788n : emulatorDebugAnalysis, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? true : z3, (i2 + 128) - (i2 | 128) != 0 ? false : z4, (i2 & 256) == 0 ? z5 : true, (-1) - (((-1) - i2) | ((-1) - 512)) != 0 ? false : z6, (-1) - (((-1) - i2) | ((-1) - 1024)) == 0 ? z7 : false, (i2 + 2048) - (i2 | 2048) != 0 ? new CleafyDetectorsConfiguration(false, false, null, false, false, false, false, false, false, false, false, false, false, false, false, LayoutKt.LargeDimension, null) : cleafyDetectorsConfiguration);
    }

    public CleafyConfiguration(Unit unit, String str, String str2, String str3, boolean z2, AutomaticUpdateAnalysis automaticUpdateAnalysis, EmulatorDebugAnalysis emulatorDebugAnalysis, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, CleafyDetectorsConfiguration cleafyDetectorsConfiguration) {
        this(str, str2, str3, z2, automaticUpdateAnalysis, emulatorDebugAnalysis, z3, z4, z5, z6, z7, cleafyDetectorsConfiguration);
    }

    public /* synthetic */ CleafyConfiguration(Unit unit, String str, String str2, String str3, boolean z2, AutomaticUpdateAnalysis automaticUpdateAnalysis, EmulatorDebugAnalysis emulatorDebugAnalysis, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, CleafyDetectorsConfiguration cleafyDetectorsConfiguration, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Unit.INSTANCE : unit, str, str2, str3, z2, automaticUpdateAnalysis, emulatorDebugAnalysis, z3, z4, z5, z6, z7, cleafyDetectorsConfiguration);
    }
}
