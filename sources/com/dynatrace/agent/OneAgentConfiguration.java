package com.dynatrace.agent;

import com.dynatrace.agent.common.InstrumentationFlavor;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4C\u0007\":\u001b\u007f\u0007llA0RkP\u008cZS@\u000fs{:@aҜwYП\u0006\u001a,!I\u001d^kunbZ9D\u001f\n$z\u0003,wV\ta \u0012JB\u001e@CQ}AQ`#;\u0015$@(Py3\u0006*.V\u0017\u000fzqP\u001c\u0016>H\t:\u0001\u0012]\t(\u001b\u001e>N\u000b.`uYNH\u001biƠ3%\tvP\\of>\u0019e\rtUm̠w*%9]O5C&\u001aϏ\b\u001bbM!Wqk\u0006/Ү(sP\u0002vNX.\u0019[܇PUd\u0001Ft\u0005\u007feR˳,\u0018jYq&(&\u007fBɥ=L\u0015\u0014I`.[\u001f-ۣ\u000f{{\u0001vXP0h\tɜ{*=%I\u00183YEaǟR*\u001d'sO{3ټN)\u0007n/[l\u000e\u000f\u0016KZ}Q?SX=vO:_Cm\u0012sz\u0002X\u0005`M\u0006/\n\u0015F\u0017S<\f?)!y\b`D\u0016{5fnSwY`@PsF=0\t\u001ab\\d3p\u0001Z^,\u001fV4T5\b8\u0019&\\\u0006G9%>Z\u0016Ɲh3^k0=/\u0015<\nty5o;t2cP*\u009ab\u001b}\"gTb3b-ΒRTajQ:2vkVɅz\u0015]\u001a\u0013J? \u001dٜ07!¢-J\t-PQM\u0018m\\\u0001\u0010-Uտ(\tq˅\r\u000b\u0007aj\u0001@v\u0007LD|\u000f#έEW=ӧ>W(zB\rs\u0016\rw\u0018G\u0016QܤPr\u001e߯m}&)(M\">K\u0019'~W7ī1KTǩ}SS'5\u000fM\t\u001dB\u0001.\u0016\rϡt2hʄbQZ-0\u000b/\u00021\u0010|\u007f(fâ~MkҺ#]D`\u0001\u0017*K\\A\u0015\u0005M(ݵ\u0005u*ĜM/I?+/H#= y]\u0018{Ц}h\u0017ծ\rg\nFq1̚f{"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0003?b~$9}#*\\GEt\n", "", "Dda@\\6G", "", "/o_9\\*:b\u001d\t\u0004B+", "0dP0b5.` ", "/o_9\\*:b\u001d\t\u0004F6\u0006\r>o\r,\u0005B", "", "/bc6i0Mg\u0001\t\u0004b;\u0007\u00163n\u0002", "<`c6i,\u001c`\u0015\r}K,\b\u0013<t\u00041}", "/ma\u001fX7H`(\u0003\u0004`", "3uT;g\u001bA`#\u000e\ne0\u0006\u000b\u0016i\b,\u000b", "", "7mbAe<FS\"\u000evm0\u0007\u0012\u0010l{9\u0006M", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006Z.Ch\u000b0?m\u001f=IR?u=~\u001cdrC\u00149", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001dAC!Q6Y;\u001e\u001a$\rb4\t\u0014f=\"n\u000e3!\b5XK9r\t\u0014 \u0017~NyPe\u001dW\u0002\u0015~P%wJchZN=Vl7:OP", "5dc#X9LW#\b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u000ec7EW\u0017z\nb6\u0006l.", "5dc\u000fX(<]\"n\be", "5dc\u000ec7EW\u0017z\nb6\u0006p9n\u00047\u0006M\u0005 \u0019", "u(I", "5dc\u000eV;Bd\u001d\u000e\u000fF6\u0006\r>o\r,\u0005B", "5dc\u001bT;Bd\u0019\\\bZ:\u007fu/p\n5\u000bD\n\u0019", "5dc\u000ea9+S$\t\bm0\u0006\u000b", "5dc\u0012i,Gb\b\u0002\bh;\f\u00103n\u0002\u000f\u007fH\u0005&", "u(8", "5dc\u0016a:M`)\u0007zg;x\u00183o\t\t\u0003<\u0012!$", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016F\u007fn\u0019b\f/D}\u001e.VR7z8(\u001eIh5\u0018m9$", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneAgentConfiguration {
    private final boolean activityMonitoring;
    private final boolean anrReporting;
    private final String applicationId;
    private final boolean applicationMonitoring;
    private final String beaconUrl;
    private final int eventThrottlingLimit;
    private final InstrumentationFlavor instrumentationFlavor;
    private final boolean nativeCrashReporting;
    private final String version;

    public OneAgentConfiguration(String version, String applicationId, String beaconUrl, boolean z2, boolean z3, boolean z4, boolean z5, int i2, InstrumentationFlavor instrumentationFlavor) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        Intrinsics.checkNotNullParameter(instrumentationFlavor, "instrumentationFlavor");
        this.version = version;
        this.applicationId = applicationId;
        this.beaconUrl = beaconUrl;
        this.applicationMonitoring = z2;
        this.activityMonitoring = z3;
        this.nativeCrashReporting = z4;
        this.anrReporting = z5;
        this.eventThrottlingLimit = i2;
        this.instrumentationFlavor = instrumentationFlavor;
    }

    public static /* synthetic */ OneAgentConfiguration copy$default(OneAgentConfiguration oneAgentConfiguration, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, boolean z5, int i2, InstrumentationFlavor instrumentationFlavor, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            str = oneAgentConfiguration.version;
        }
        if ((i3 + 2) - (2 | i3) != 0) {
            str2 = oneAgentConfiguration.applicationId;
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            str3 = oneAgentConfiguration.beaconUrl;
        }
        if ((8 & i3) != 0) {
            z2 = oneAgentConfiguration.applicationMonitoring;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            z3 = oneAgentConfiguration.activityMonitoring;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            z4 = oneAgentConfiguration.nativeCrashReporting;
        }
        if ((i3 + 64) - (64 | i3) != 0) {
            z5 = oneAgentConfiguration.anrReporting;
        }
        if ((i3 + 128) - (128 | i3) != 0) {
            i2 = oneAgentConfiguration.eventThrottlingLimit;
        }
        if ((i3 & 256) != 0) {
            instrumentationFlavor = oneAgentConfiguration.instrumentationFlavor;
        }
        return oneAgentConfiguration.copy(str, str2, str3, z2, z3, z4, z5, i2, instrumentationFlavor);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.applicationId;
    }

    public final String component3() {
        return this.beaconUrl;
    }

    public final boolean component4() {
        return this.applicationMonitoring;
    }

    public final boolean component5() {
        return this.activityMonitoring;
    }

    public final boolean component6() {
        return this.nativeCrashReporting;
    }

    public final boolean component7() {
        return this.anrReporting;
    }

    public final int component8() {
        return this.eventThrottlingLimit;
    }

    public final InstrumentationFlavor component9() {
        return this.instrumentationFlavor;
    }

    public final OneAgentConfiguration copy(String version, String applicationId, String beaconUrl, boolean z2, boolean z3, boolean z4, boolean z5, int i2, InstrumentationFlavor instrumentationFlavor) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        Intrinsics.checkNotNullParameter(instrumentationFlavor, "instrumentationFlavor");
        return new OneAgentConfiguration(version, applicationId, beaconUrl, z2, z3, z4, z5, i2, instrumentationFlavor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneAgentConfiguration)) {
            return false;
        }
        OneAgentConfiguration oneAgentConfiguration = (OneAgentConfiguration) obj;
        return Intrinsics.areEqual(this.version, oneAgentConfiguration.version) && Intrinsics.areEqual(this.applicationId, oneAgentConfiguration.applicationId) && Intrinsics.areEqual(this.beaconUrl, oneAgentConfiguration.beaconUrl) && this.applicationMonitoring == oneAgentConfiguration.applicationMonitoring && this.activityMonitoring == oneAgentConfiguration.activityMonitoring && this.nativeCrashReporting == oneAgentConfiguration.nativeCrashReporting && this.anrReporting == oneAgentConfiguration.anrReporting && this.eventThrottlingLimit == oneAgentConfiguration.eventThrottlingLimit && this.instrumentationFlavor == oneAgentConfiguration.instrumentationFlavor;
    }

    public final boolean getActivityMonitoring() {
        return this.activityMonitoring;
    }

    public final boolean getAnrReporting() {
        return this.anrReporting;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final boolean getApplicationMonitoring() {
        return this.applicationMonitoring;
    }

    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    public final int getEventThrottlingLimit() {
        return this.eventThrottlingLimit;
    }

    public final InstrumentationFlavor getInstrumentationFlavor() {
        return this.instrumentationFlavor;
    }

    public final boolean getNativeCrashReporting() {
        return this.nativeCrashReporting;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((this.version.hashCode() * 31) + this.applicationId.hashCode()) * 31) + this.beaconUrl.hashCode()) * 31) + Boolean.hashCode(this.applicationMonitoring)) * 31) + Boolean.hashCode(this.activityMonitoring)) * 31) + Boolean.hashCode(this.nativeCrashReporting)) * 31) + Boolean.hashCode(this.anrReporting)) * 31) + Integer.hashCode(this.eventThrottlingLimit)) * 31) + this.instrumentationFlavor.hashCode();
    }

    public String toString() {
        return "OneAgentConfiguration(version=" + this.version + ", applicationId=" + this.applicationId + ", beaconUrl=" + this.beaconUrl + ", applicationMonitoring=" + this.applicationMonitoring + ", activityMonitoring=" + this.activityMonitoring + ", nativeCrashReporting=" + this.nativeCrashReporting + ", anrReporting=" + this.anrReporting + ", eventThrottlingLimit=" + this.eventThrottlingLimit + ", instrumentationFlavor=" + this.instrumentationFlavor + ')';
    }
}
