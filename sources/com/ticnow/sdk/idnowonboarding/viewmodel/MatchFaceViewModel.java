package com.ticnow.sdk.idnowonboarding.viewmodel;

import androidx.lifecycle.ViewModel;
import com.facetec.sdk.FaceTecIDScanResult;
import com.facetec.sdk.FaceTecSessionResult;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.Processor;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я>\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005%4\u0012\u000e\u0007nj?3Le^.ZS0\u0012s{J$c$wFCU0}*\tUQog\u0005Jb\u000bI\u0012\u001cǝ)jZH\u0016{ٕ\u0016\u000f@B@WAN\b=gbKȉ1ڶ6.@ц\u001d\u0003 -V\u0014\u0017|IP\u001a\u0018\u0001Z~Aj\u000fc\u0004H\u001a\\̋,Ә\"hoޮNJrfH9C\u0005oM\\30J\u000bZ%Hj&;\u00058ӣ7Ë;A\u001dǬk\u0005\raiO#AwN\u0013zwA9\\\fYLW.(kۇ[ոa~.ؘ\u001dSf!5AoeQg\u001c@H\u0013\n&T\u0004< }ΥZǉ\u001er\u0010ԄKvxnNl\"`H\u001d\t\u007f\u0007/3\u001fK+g;=Ϧ\u000eޅ\u001dZ?ަ\u001d\u000f$D\u000f\u0011A]Z1n9úX\u001d"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u000f$7\u007f\u001e8LCB5\u001c\u001a$fd\u001a\u0003a,?z'Y4X+\\YH", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "u(E", "4`R2<4:U\u0019ivm/", "", "5dc\u0013T*>7!z|^\u0017x\u00182", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0013T*>7!z|^\u0017x\u00182", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ":`c2f;)`#|zl:\u0007\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pHHL,&]\u007fG\u0012\u0012h\u001cX8\u001bNDN.lDE-\u00129\u001f", "5dc\u0019T;>a(i\bh*|\u0017=o\r", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fiE|\u00169[\rEt1(\u0011u`=\u0010e:]v2U\u0016O(ZR<H!\u001cX\u000e\\9\u0017\u0012g\u000b\u000f{N5\u001f\u0016:S\u000f\u0011", "Adc\u0019T;>a(i\bh*|\u0017=o\r", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G.Fm!<\u0017MDh>\u001a\"geB\tq;N\u00025\u0011MJ*\\\u001c}J\u001e\u0010Z\u001c\\5\u001a\u0013#,1xB7-\u00166VW~Y", ":`c2f;3]#\u0007^=\u001az\u00058R\u007f6\fG\u0010", "\u001ab^:\"-:Q\u0019\u000ez\\u\u000b\b5/`$y@o\u0017\u0015+N{:r.\"Y\f0>|k", "5dc\u0019T;>a(s\u0005h4`g\u001dc{1h@\u000f'\u001eV", "u(;0b4\bT\u0015|zm,zR=d\u0006q\\<~\u0017\u0006Gmq\u001bd#1bj E}\u001d=#", "Adc\u0019T;>a(s\u0005h4`g\u001dc{1h@\u000f'\u001eV", "uKR<`u?O\u0017~\n^*F\u0017.kI\tw>\u0001\u0006\u0017ESl*t!>F}.Gt%\u0004\u00114", ":`c2f;3]#\u0007h^:\u000b\r9nl(\nP\b&", "\u001ab^:\"-:Q\u0019\u000ez\\u\u000b\b5/`$y@o\u0017\u00155o\u001cJz/>F}.Gt%\u0004", "5dc\u0019T;>a(s\u0005h4j\t=s\u00042\u0005-\u0001%'N~", "u(;0b4\bT\u0015|zm,zR=d\u0006q\\<~\u0017\u0006Gm{<\u000539c\u0007\r7{&5\\\u0019", "Adc\u0019T;>a(s\u0005h4j\t=s\u00042\u0005-\u0001%'N~", "uKR<`u?O\u0017~\n^*F\u0017.kI\tw>\u0001\u0006\u0017E]\u000eJ\u0005)?bj E}\u001d=#\u0007,", "=mQ<T9=W\"\u0001Xh5}\r1u\r$\u000bD\u000b ", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKMDl8 ^L@\"\u0011u\u0016Ws1CYM0eTPG\u001d\u0013^\u0010^8\t\u0014]K-D", "5dc\u001ca)HO&}~g.Z\u00138f\u0004*\fM|&\u001bQx", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9u=\u001f\u0019j+\u001deL6``0DVJ9[V{?q\u001cc\u000fR-\u001d\u0012UP(xM\r", "Adc\u001ca)HO&}~g.Z\u00138f\u0004*\fM|&\u001bQx", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AEt5\"\u00172E\u0018om>8\u007f$QH[+`[t\u001b\u001e\u001b[\u0012P;\u001a\u0001hE.w\u001az\u0010", "AsT=C(KO!\r", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005K=+\u001foh$\u0003r/$", "5dc g,I>\u0015\fvf:", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_7WB;y}}\u001euk@\u000eN(]y|", "Adc g,I>\u0015\fvf:", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7\u001f8LCI5\u0014'\"rh@q_;QLj8", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class MatchFaceViewModel extends ViewModel {
    public String faceImagePath;
    private Processor latestProcessor;
    private FaceTecIDScanResult latestZoomIDScanResult;
    private FaceTecSessionResult latestZoomSessionResult;
    public IDNowOnboardingConfiguration onboardingConfiguration;
    public EnrollPath stepParams;

    public final String getFaceImagePath() {
        String str = this.faceImagePath;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("faceImagePath");
        }
        return str;
    }

    public final Processor getLatestProcessor() {
        return this.latestProcessor;
    }

    public final FaceTecIDScanResult getLatestZoomIDScanResult() {
        return this.latestZoomIDScanResult;
    }

    public final FaceTecSessionResult getLatestZoomSessionResult() {
        return this.latestZoomSessionResult;
    }

    public final IDNowOnboardingConfiguration getOnboardingConfiguration() {
        IDNowOnboardingConfiguration iDNowOnboardingConfiguration = this.onboardingConfiguration;
        if (iDNowOnboardingConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
        }
        return iDNowOnboardingConfiguration;
    }

    public final EnrollPath getStepParams() {
        EnrollPath enrollPath = this.stepParams;
        if (enrollPath == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stepParams");
        }
        return enrollPath;
    }

    public final void setFaceImagePath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.faceImagePath = str;
    }

    public final void setLatestProcessor(Processor processor) {
        this.latestProcessor = processor;
    }

    public final void setLatestZoomIDScanResult(FaceTecIDScanResult faceTecIDScanResult) {
        this.latestZoomIDScanResult = faceTecIDScanResult;
    }

    public final void setLatestZoomSessionResult(FaceTecSessionResult faceTecSessionResult) {
        this.latestZoomSessionResult = faceTecSessionResult;
    }

    public final void setOnboardingConfiguration(IDNowOnboardingConfiguration iDNowOnboardingConfiguration) {
        Intrinsics.checkParameterIsNotNull(iDNowOnboardingConfiguration, "<set-?>");
        this.onboardingConfiguration = iDNowOnboardingConfiguration;
    }

    public final void setStepParams(EnrollPath enrollPath) {
        Intrinsics.checkParameterIsNotNull(enrollPath, "<set-?>");
        this.stepParams = enrollPath;
    }
}
