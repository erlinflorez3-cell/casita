package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\rD4\u0012}\bnjG?LeN.ZS8\u0018s{:Nc$\u007fICU }(ޜUdʴ\u0018nxYKĐ\u000e\u0016\u001a\u0007jDI\u0004ym\"\u001d4Z{O5]ok:pvF\u0005N1P;\n\u000b\u0007\u001a8L(v)D[\u0014\u00180NuRT#L3\u001b\" D \u000f$t{^DXxm<?#1jRP7_^}{\u0010\\SU\u0014\u0007{$+N?M)5a\u0013\u0013b]O\u0003mrM\u0007x'U,wvm5\u0007\u0007$\u001b1O\u001bf\u000b&\u000b\u000faf\u0012'9Z{K~\u00188}\u0001{\u001bH\u001c\u000e41X63\u001at\u0015&5\u000bq\u0002A`\u0010dB\u000e\ty>''\u00103Y:1e\u007fhK!T7\n\u0014% 9\u007f\u001d+kh\u0014`#+l\u0006a3a@kI^\fi=\u001c\u0005\u0007a0-˙4G\u000e@D\u0018<<=7\n:iݰlJQR\u000e\u000f\u0007vg\u0002j\u0019\u0379Aj\u0003$^B\u0011\u001c\\Td3lfS\u00073Wܺ\u001dΤ\u000b}\u0016(hj\u0006d9'&M}r0ӛNύ\u000e%=\u0005\u007fn|\u0015&eI`C5\u007fd cbvB@Ra3[-\u0382TTmjR:>Xl w*E^\u000e#2mpJ7rׂ\u001a%\u001cV.6Bo}Oާ[1\u0019\r\u0001K&\u0019hRuOʝQ%\u0011}\u0015\u0011]<\u000bp.=Ca5G'e$x4+$5\u0002\n~un\u0013݈M̡\u001auc\u001dh6(giCM!\u001f\u000b94\u0012-sM\u0003gaM@()\u007f\u0010\u000eiot՝\tϡt,n\f\u0013VbF:v\r|iϯeH\u0001ov\u0013G\u0012^Qм?\u0012y\u0011\u000bTNf\u0007Kɛ\u001fm̻n0/M-qگM\u001c}\u0014=\u0015y]\u0018p^\fh\u000f4v}\u0010<e&o\u0011Rm4K8wX-AR*r\u0003PL\u0003w6C9<\u00133VF|rl7{\f_\u0018l\u0007:\u0013\tjkH#{\u000e6>_XtS\u007f$^q&?Pif\u001ct{v\u0011J\u001d\u0012#\u0010A|\"(M\"fW\u0011\n@\b\u0004\u0018dBie\u001b;7+d2B\b\u0019Lli4\u001a+\u0006L_\u001d\"JB\"E\u0007\u0014Zxjb`\u0005\u000fO\u0011)0\u0001\r\u001cK \u000f4_\u0006\u001eTZ/q@\u0019[-\u000b+j}\u007f|$YK\u0005A!(f\u0010#GsBw\ff\u0018M){{\b\u001aH\u001a\r\u001dp\u0019+;a\u0011\u000ewF]9X+Ͷcʝ\u0016f`\u0002j:\r/\u0015\u000ej\u0014?\u0011'\u0005\u000bqx,zM>͖Db\b%zA\u0007:4*́\u001au\rCeUI\u0019\u0015mڊV$Q\f\u00158\"=\u0003#\"\u0013[dѦ\fܤ\u001f@\u001eފ.d\b\u001b!cp\"<X\rz\u001a0\u00186}\u0003I\u0001Ae\u0010oN̂BӲ/t\u000eBY~\u0011\fi\u0001q\u0004&!\u0011kIX\u0010m[QS\r}ӕ0 \\`BÎk\"^(\u000e'e:-? bW\u001a\u0006g?ҼmϪ_\u00133Ԛ\u0004,g:>jn\u0012-\u0006\u000e\u0004X^^\u0019\u0012۶O̡h\u000fd֬ZY\u0014jx@5\t\u001a4,|-R\u0015\u0015i̒Hޔ\"j7Ю1!a\u0018UxW\u0018SI>!_Su\u001f\u000e׀\rÃ,|\u0019ܛRdz\u00198UY\u0015\u000ewD;VVM\u001aUZ4ot\u0003TL[7p\u000bb\u0015dĹ1և<&Fю2\u001eAkA\\i%\u000f\u0019P\u0006\u001e\bO9AܖUК.\u0007\u0005ӕ%A\u007fMyMDO\u00012G\u0011\u0006\u001a\u0006pq)\f֕Nۡ\u0010\nmJ\rl{X\u0015~:g\u0006o,\u007fmT\u0010\u0018/04\b\u0006#.FAJ:_\u000bA\u0005vm\u0003T1lr\u001bôIـ|{\u0012,w:\ffa\u0002BbK>'LV>=z\u0017Q]j\n\u000br\u000eU\u0016G\u000f4*a\u001a\u0013\u000f}xv/ פOҰ`eD\u0013\u0002&R4gY\bh\u0011y8\bE\u001edezj\u001cRo\u0012H\u0012;\f2zgV7ڃb\u0099\u001c-SĴ^8b\u001d[\\Ǽ\u000fy"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`#Zq\u001b\u000b.1a\u0002\u001e\u0015w\u001f/QE\u0011", "", "<`\\2", "", "D`[BX", "", "@t[2<\u000b", "5q^Bc\u0015:[\u0019", "AdR<a+:`-^\u000ei6\u000b\u0019<e\u000e", "", "CmS2_,@O(~yL,z\u00138d{5\u0010 \u0014\"!U\u007f\u001b<\u0005", "7r32i0<Suz\t^+", "", "7rD@X9\"\\x\u0012\u0006^9\u0001\u0011/n\u000f", "7r4Ec,KW!~\u0004m\bz\u00183v\u007f", "/k[<V(MS\u0018^\u000ei,\n\r7e\t7d<\t\u0017", "3w_9\\*Bb\u0004z\bZ4|\u0018/r\u000e", "@t[2C(La\u0019}", ">`a.`,MS&k\u000be,`g=", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001dU\tu\u001er\u0012?I\rBg= ^VpF\u000bl.$],C]JucN{?]\u007fi\u001bR4\u000fZO()jU3h\u0018;M\t\u0005P|\u0017k\u0004\u001colSRYW\t\u0019|\u000b\u0011dQ/Tn<(J^;`Uf\u0019e<\u0004\u0012#~\u001d$j&$p\u0001O\"n\u001c\u0001cpIbhG1Bv]\u001c,tQMpp&G\u0005y[\u000fb~2t)\r\n\u0011;`\u0016G1(Mb\u007f^\u0014XL|i'", "5dc\u000e_3HQ\u0015\u000ez]\f\u0010\u0014/r\u00040{I\u0010\u007f\u0013Oo", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0012k7EW\u0017\u0003\nI(\n\u00057e\u000f(\tN", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "5dc\u0014e6N^\u0002z\u0003^", "u(I", "5dc\u001bT4>", "5dc\u001dT9:[\u0019\u000ezk\u0019\r\u0010/I^6", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc\u001fh3>7w", "5dc\u001fh3>>\u0015\r\t^+", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "5dc X*H\\\u0018z\br\f\u0010\u00149s\u00105{N", "u(J\u0019](OOb\u000f\nb3Fp+pU", ")KY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005", "5dc\"a+>Z\u0019\u0001vm,{v/c\n1z<\u000e+vZz\u0018J\u000725g", "5dc#T3NS", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JG", "1n\\=b5>\\(JH", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001dU\tu\u001er\u0012?I\rBg= ^VpF\u000bl.$],C]JucN{?]\u007fi\u001bR4\u000fZO()jU3h\u0018;M\t\u0005P|\u0017k\u0004\u001colSRYW\t\u0019|\u000b\u0011dQ/Tn<(J^;`Uf\u0019e<\u0004\u0012#~\u001d$j&$p\u0001O\"n\u001c\u0001cpIbhG1Bv]\u001c,tQMpp&G\u0005y[\u000fb~2t)\r\n\u0011;`\u0016G1(Mb\u007f^\u0014XL|i\u001d:\u001dG\u0015q\u0005hM\u001cl!+\u0004\u0017aB;\u001ddsbNXbHz:Ij[\t;PcHRp\u0019)\u001c", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class APIDynamicConfig {

    @SerializedName(alternate = {}, value = "\b\u0012\u0011\u0013\u0006\u0003\u0015\u0005\u0003|\u0002\u0014\u000b~\u000b\u0001\u0004z\u0003\bq\u007fq|s")
    @InterfaceC1492Gx
    private final String allocatedExperimentName;

    @SerializedName(alternate = {}, value = "\f\u001e\u0015\u0010\f\u0005\n\u0014}\u000e}\u000e{\u0007}\f{\b\b")
    @InterfaceC1492Gx
    private final String[] explicitParameters;

    @SerializedName(alternate = {}, value = "\u000e\u0018\u0014\u0019\u0013\u0001\u000f\u0001\f\u0003")
    @InterfaceC1492Gx
    private final String groupName;

    @SerializedName(alternate = {}, value = "\u0010\u0019\u0004\b\b\u0018\n\u0003\u0004|~|\u000e~|")
    @InterfaceC1492Gx
    private final boolean isDeviceBased;

    @SerializedName(alternate = {}, value = "\u0010\u0019\u0004\t\u001b\u0012\u0006\u0012\b\u000b\u0002\n\u000fxyz\u000b~\u000bx")
    @InterfaceC1492Gx
    private final boolean isExperimentActive;

    @SerializedName(alternate = {}, value = "\u0010\u0019\u0004\u0019\u0016\u0007\u0013~\b\f{\u0001\u0013\n}\n\u007f\u0003y\u0002\u0007")
    @InterfaceC1492Gx
    private final boolean isUserInExperiment;

    @SerializedName(alternate = {}, value = "\u0015\u0007\u0012\t")
    @InterfaceC1492Gx
    private final String name;

    @SerializedName(alternate = {}, value = "\u0017\u0007\u0017\u0005\u0010\u0007\u0015\u0005\u0011|\u000f\u0011\u0007~w\u0001z\t")
    @InterfaceC1492Gx
    private final Map<String, String> parameterRuleIDs;

    @SerializedName(alternate = {}, value = "\u0019\u001b\u0011\t\u0002\u000b\u0005")
    @InterfaceC1492Gx
    private final String ruleID;

    @SerializedName(alternate = {}, value = "\u0017\u0007\u0018\u0017\b\u0006")
    @InterfaceC1492Gx
    private final Boolean rulePassed;

    @SerializedName(alternate = {}, value = "\u001a\u000b\b\u0013\u0011\u0006\u0002\u0012\u0018|\u0002\u0014\u000b\t\f\r\tz\b")
    @InterfaceC1492Gx
    private final Map<String, String>[] secondaryExposures;

    @SerializedName(alternate = {}, value = "\u001c\u0014\t\t\u000f\u0007\b\u0001\u0013\u0003\u0001z\u000e~{\u0007\u0005yu\u0006\fpu\b~|\u007f\u0001|n{")
    @InterfaceC1492Gx
    private final Map<String, String>[] undelegatedSecondaryExposures;

    @SerializedName(alternate = {}, value = "\u001d\u0007\u0011\u0019\b")
    @InterfaceC1492Gx
    private final Map<String, Object> value;

    public APIDynamicConfig(String name, Map<String, ? extends Object> value, String ruleID, String str, Map<String, String>[] mapArr, Map<String, String>[] mapArr2, boolean z2, boolean z3, boolean z4, String str2, String[] strArr, Boolean bool, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(ruleID, "ruleID");
        this.name = name;
        this.value = value;
        this.ruleID = ruleID;
        this.groupName = str;
        this.secondaryExposures = mapArr;
        this.undelegatedSecondaryExposures = mapArr2;
        this.isDeviceBased = z2;
        this.isUserInExperiment = z3;
        this.isExperimentActive = z4;
        this.allocatedExperimentName = str2;
        this.explicitParameters = strArr;
        this.rulePassed = bool;
        this.parameterRuleIDs = map;
    }

    public /* synthetic */ APIDynamicConfig(String str, Map map, String str2, String str3, Map[] mapArr, Map[] mapArr2, boolean z2, boolean z3, boolean z4, String str4, String[] strArr, Boolean bool, Map map2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : str3, (i2 + 16) - (i2 | 16) != 0 ? new Map[0] : mapArr, (i2 + 32) - (i2 | 32) != 0 ? new Map[0] : mapArr2, (i2 + 64) - (i2 | 64) != 0 ? false : z2, (-1) - (((-1) - i2) | ((-1) - 128)) != 0 ? false : z3, (i2 & 256) != 0 ? false : z4, (i2 + 512) - (i2 | 512) != 0 ? null : str4, (i2 & 1024) != 0 ? new String[0] : strArr, (i2 + 2048) - (i2 | 2048) != 0 ? null : bool, (i2 & 4096) == 0 ? map2 : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APIDynamicConfig copy$default(APIDynamicConfig aPIDynamicConfig, String str, Map map, String str2, String str3, Map[] mapArr, Map[] mapArr2, boolean z2, boolean z3, boolean z4, String str4, String[] strArr, Boolean bool, Map map2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = aPIDynamicConfig.name;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            map = aPIDynamicConfig.value;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            str2 = aPIDynamicConfig.ruleID;
        }
        if ((i2 & 8) != 0) {
            str3 = aPIDynamicConfig.groupName;
        }
        if ((i2 & 16) != 0) {
            mapArr = aPIDynamicConfig.secondaryExposures;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            mapArr2 = aPIDynamicConfig.undelegatedSecondaryExposures;
        }
        if ((i2 & 64) != 0) {
            z2 = aPIDynamicConfig.isDeviceBased;
        }
        if ((i2 & 128) != 0) {
            z3 = aPIDynamicConfig.isUserInExperiment;
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            z4 = aPIDynamicConfig.isExperimentActive;
        }
        if ((i2 + 512) - (i2 | 512) != 0) {
            str4 = aPIDynamicConfig.allocatedExperimentName;
        }
        if ((i2 + 1024) - (i2 | 1024) != 0) {
            strArr = aPIDynamicConfig.explicitParameters;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2048)) != 0) {
            bool = aPIDynamicConfig.rulePassed;
        }
        if ((i2 & 4096) != 0) {
            map2 = aPIDynamicConfig.parameterRuleIDs;
        }
        return aPIDynamicConfig.copy(str, map, str2, str3, mapArr, mapArr2, z2, z3, z4, str4, strArr, bool, map2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component10() {
        return this.allocatedExperimentName;
    }

    public final String[] component11() {
        return this.explicitParameters;
    }

    public final Boolean component12() {
        return this.rulePassed;
    }

    public final Map<String, String> component13() {
        return this.parameterRuleIDs;
    }

    public final Map<String, Object> component2() {
        return this.value;
    }

    public final String component3() {
        return this.ruleID;
    }

    public final String component4() {
        return this.groupName;
    }

    public final Map<String, String>[] component5() {
        return this.secondaryExposures;
    }

    public final Map<String, String>[] component6() {
        return this.undelegatedSecondaryExposures;
    }

    public final boolean component7() {
        return this.isDeviceBased;
    }

    public final boolean component8() {
        return this.isUserInExperiment;
    }

    public final boolean component9() {
        return this.isExperimentActive;
    }

    public final APIDynamicConfig copy(String name, Map<String, ? extends Object> value, String ruleID, String str, Map<String, String>[] mapArr, Map<String, String>[] mapArr2, boolean z2, boolean z3, boolean z4, String str2, String[] strArr, Boolean bool, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(ruleID, "ruleID");
        return new APIDynamicConfig(name, value, ruleID, str, mapArr, mapArr2, z2, z3, z4, str2, strArr, bool, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIDynamicConfig)) {
            return false;
        }
        APIDynamicConfig aPIDynamicConfig = (APIDynamicConfig) obj;
        return Intrinsics.areEqual(this.name, aPIDynamicConfig.name) && Intrinsics.areEqual(this.value, aPIDynamicConfig.value) && Intrinsics.areEqual(this.ruleID, aPIDynamicConfig.ruleID) && Intrinsics.areEqual(this.groupName, aPIDynamicConfig.groupName) && Intrinsics.areEqual(this.secondaryExposures, aPIDynamicConfig.secondaryExposures) && Intrinsics.areEqual(this.undelegatedSecondaryExposures, aPIDynamicConfig.undelegatedSecondaryExposures) && this.isDeviceBased == aPIDynamicConfig.isDeviceBased && this.isUserInExperiment == aPIDynamicConfig.isUserInExperiment && this.isExperimentActive == aPIDynamicConfig.isExperimentActive && Intrinsics.areEqual(this.allocatedExperimentName, aPIDynamicConfig.allocatedExperimentName) && Intrinsics.areEqual(this.explicitParameters, aPIDynamicConfig.explicitParameters) && Intrinsics.areEqual(this.rulePassed, aPIDynamicConfig.rulePassed) && Intrinsics.areEqual(this.parameterRuleIDs, aPIDynamicConfig.parameterRuleIDs);
    }

    public final String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }

    public final String[] getExplicitParameters() {
        return this.explicitParameters;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getParameterRuleIDs() {
        return this.parameterRuleIDs;
    }

    public final String getRuleID() {
        return this.ruleID;
    }

    public final Boolean getRulePassed() {
        return this.rulePassed;
    }

    public final Map<String, String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final Map<String, String>[] getUndelegatedSecondaryExposures() {
        return this.undelegatedSecondaryExposures;
    }

    public final Map<String, Object> getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + this.value.hashCode()) * 31) + this.ruleID.hashCode()) * 31;
        String str = this.groupName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String>[] mapArr = this.secondaryExposures;
        int iHashCode3 = (iHashCode2 + (mapArr == null ? 0 : Arrays.hashCode(mapArr))) * 31;
        Map<String, String>[] mapArr2 = this.undelegatedSecondaryExposures;
        int iHashCode4 = (iHashCode3 + (mapArr2 == null ? 0 : Arrays.hashCode(mapArr2))) * 31;
        boolean z2 = this.isDeviceBased;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (iHashCode4 + r02) * 31;
        boolean z3 = this.isUserInExperiment;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        int i3 = (i2 + r03) * 31;
        boolean z4 = this.isExperimentActive;
        int i4 = (i3 + (z4 ? 1 : z4)) * 31;
        String str2 = this.allocatedExperimentName;
        int iHashCode5 = (i4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String[] strArr = this.explicitParameters;
        int iHashCode6 = (iHashCode5 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        Boolean bool = this.rulePassed;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, String> map = this.parameterRuleIDs;
        return iHashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isDeviceBased() {
        return this.isDeviceBased;
    }

    public final boolean isExperimentActive() {
        return this.isExperimentActive;
    }

    public final boolean isUserInExperiment() {
        return this.isUserInExperiment;
    }

    public String toString() {
        return "APIDynamicConfig(name=" + this.name + ", value=" + this.value + ", ruleID=" + this.ruleID + ", groupName=" + ((Object) this.groupName) + ", secondaryExposures=" + Arrays.toString(this.secondaryExposures) + ", undelegatedSecondaryExposures=" + Arrays.toString(this.undelegatedSecondaryExposures) + ", isDeviceBased=" + this.isDeviceBased + ", isUserInExperiment=" + this.isUserInExperiment + ", isExperimentActive=" + this.isExperimentActive + ", allocatedExperimentName=" + ((Object) this.allocatedExperimentName) + ", explicitParameters=" + Arrays.toString(this.explicitParameters) + ", rulePassed=" + this.rulePassed + ", parameterRuleIDs=" + this.parameterRuleIDs + ')';
    }
}
