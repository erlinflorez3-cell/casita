package com.ticnow.sdk.idnowonboarding.viewmodel;

import androidx.lifecycle.ViewModel;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я6\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005%4\u0012\u0006\u0010nj?=LeV6ZS0\u0015s{J$c$wFCU0}*\tUQ}˧\u001fJ\t\n\u0004\u0012و\u001axx,\u001ao\u0007^*\u0011HA\u001eA\nހ{ެ=l|Ȃ\u001d\"8%F}%\u0003 /V\u0016G\u0017QR$\u0014F?\u001fB)ҏYŋ\u001e \u000e>.\u000e6^mWDR\r_@:1\u000f:\\\\5w2\u0013L;H+ܒ\u0019țe*3¨O7\u001b4a\u0007'TaO\u0011EBW\u0013y?)AH\"Y\rݠ\fЏ\u00197WՕut,n\u0013U\u0001\u000e->]i\u001cl\u001c<\u0010|\u0012\fj\fd\u03813ρ2;\"f\u0016\u001bKvxhNZ\"`H\u0016\tm\u0007/3\u0017K+g3=Ϧmޅ\u001dZ?ަ\u001d\u000f$<\u000f\tA]Z)n1kl\u0006nIQnU\u001fݗ\u0016ՒAy\f͏z\u00040\">a 1\u00020<3uQiY;#\u0002\u0001ve>Ͽ\u0011¾l_qɭ`B(\u0011$ZJ\u000b\u0012~R\nU\u0006^zp.'LJ{]é\u0014˙$h\u007f˓9'\u0016v]\u0012\nlS\b\u0018Píjc"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u000f$7\u007f\u001e8LCB5%\u001a\u001cl`5\u0016c\u000bWz\u0018KL`\u0014fQrDi", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E1\u0005\u0017)/y\r<}z", "u(E", "0`R8C+?\"dP", "", "5dc\u000fT*D>\u0018\u007fI*}", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT*D>\u0018\u007fI*}", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0`R8E,:R-", "", "5dc\u000fT*D@\u0019zyr", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "Adc\u000fT*D@\u0019zyr", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "2mX\u000fT*D>\u0015\u000e}", "5dc\u0011a0\u001bO\u0017\u0005eZ;\u007f", "Adc\u0011a0\u001bO\u0017\u0005eZ;\u007f", "2mX\u0013e6Gb\u0015\u0006eZ;\u007f", "5dc\u0011a0\u001f`#\b\nZ3g\u0005>h", "Adc\u0011a0\u001f`#\b\nZ3g\u0005>h", "4q^;g\u0019>O\u0018\u0013", "5dc\u0013e6Gb\u0006~v]@", "Adc\u0013e6Gb\u0006~v]@", ":nR._\t:Q\u001fZ\nm,\u0005\u0014>s", "", "5dc\u0019b*:Zuzxd\b\f\u0018/m\u000b7\n", "u(B", "Adc\u0019b*:Zuzxd\b\f\u0018/m\u000b7\n", "uR\u0018#", ":nR._\rK]\"\u000eVm;|\u0011:t\u000e", "5dc\u0019b*:Zy\f\u0005g;X\u0018>e\b3\u000bN", "Adc\u0019b*:Zy\f\u0005g;X\u0018>e\b3\u000bN", "=mQ<T9=W\"\u0001Xh5}\r1u\r$\u000bD\u000b ", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKMDl8 ^L@\"\u0011u\u0016Ws1CYM0eTPG\u001d\u0013^\u0010^8\t\u0014]K-D", "5dc\u001ca)HO&}~g.Z\u00138f\u0004*\fM|&\u001bQx", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9u=\u001f\u0019j+\u001deL6``0DVJ9[V{?q\u001cc\u000fR-\u001d\u0012UP(xM\r", "Adc\u001ca)HO&}~g.Z\u00138f\u0004*\fM|&\u001bQx", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AEt5\"\u00172E\u0018om>8\u007f$QH[+`[t\u001b\u001e\u001b[\u0012P;\u001a\u0001hE.w\u001az\u0010", "AsT=C(KO!\r", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005K=+\u001foh$\u0003r/$", "5dc g,I>\u0015\fvf:", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_7WB;y}}\u001euk@\u000eN(]y|", "Adc g,I>\u0015\fvf:", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7\u001f8LCI5\u0014'\"rh@q_;QLj8", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class ValidateDniViewModel extends ViewModel {
    private String backPdf417;
    private Boolean backReady;
    private String dniBackPath;
    private String dniFrontalPath;
    private Boolean frontReady;
    private short localBackAttempts;
    private short localFrontAttempts;
    private IDNowOnboardingConfiguration onboardingConfiguration;
    private EnrollPath stepParams;

    public final String getBackPdf417() {
        return this.backPdf417;
    }

    public final Boolean getBackReady() {
        return this.backReady;
    }

    public final String getDniBackPath() {
        return this.dniBackPath;
    }

    public final String getDniFrontalPath() {
        return this.dniFrontalPath;
    }

    public final Boolean getFrontReady() {
        return this.frontReady;
    }

    public final short getLocalBackAttempts() {
        return this.localBackAttempts;
    }

    public final short getLocalFrontAttempts() {
        return this.localFrontAttempts;
    }

    public final IDNowOnboardingConfiguration getOnboardingConfiguration() {
        return this.onboardingConfiguration;
    }

    public final EnrollPath getStepParams() {
        return this.stepParams;
    }

    public final void setBackPdf417(String str) {
        this.backPdf417 = str;
    }

    public final void setBackReady(Boolean bool) {
        this.backReady = bool;
    }

    public final void setDniBackPath(String str) {
        this.dniBackPath = str;
    }

    public final void setDniFrontalPath(String str) {
        this.dniFrontalPath = str;
    }

    public final void setFrontReady(Boolean bool) {
        this.frontReady = bool;
    }

    public final void setLocalBackAttempts(short s2) {
        this.localBackAttempts = s2;
    }

    public final void setLocalFrontAttempts(short s2) {
        this.localFrontAttempts = s2;
    }

    public final void setOnboardingConfiguration(IDNowOnboardingConfiguration iDNowOnboardingConfiguration) {
        this.onboardingConfiguration = iDNowOnboardingConfiguration;
    }

    public final void setStepParams(EnrollPath enrollPath) {
        this.stepParams = enrollPath;
    }
}
