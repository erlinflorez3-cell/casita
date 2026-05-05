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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r+4\u0012}\bnjG?LeVPZS0$s{B*c$wCA٦ \u0014̝9O|f(DZ^\u0019C'\u0006Dyz2OU\u0007_*\u000f`E\u007fE9M}AQ`#7\u0015(8\"F~\u001d\u00030)v\u0011\u0007\u0015IK\u001a\u0018HT\u0001Hb\u0019]\u0007*\u00124?0\u0003.\\\u0016OdP\u0003\\h63\u000boB\\0w2\u0013L;Gù+\r\u0005kf2NLM\u0015STIߞS$F\u0011U\n=3kmޗ,\u0012zeMp\u007fB\u0016q̈́\u000e&{4t\u001dSv\u000bU,\u0016ӱL\u0019.6\u0011\u0013\u0010\u001dJ\u0014\u001a\u0016)X.[\u001bv\n\u001e3#s\u0002Hf\u0001\rIFѴbي\u001b%\u000eDsB)\u0001icQ\u0018|8Ḅ\u000ef\u0004\u000f\n9[\u0003ו\u0011\u001b!T\u0006QIQn>xT\u0010YKo\u001cp\u0011\u0005Z\n6G\u000e3\u0014\u0011\\\u0018U?a91&\u0004\u0004^C\u0016w5znSwX`T2|&C:\u000b\u001cZre\u0015m`T\u0007-?U2S5\u00058\u001b&\\\u0006E9'&M}i0ӛLύ\u000e%=\u0003\u007fj|\t&Wgac;_\u0002(chuB>\u0003ь\u0006!mPr$Z\u000bHhŌG3\u0017\u0006\u001d\\N:\u0014xǄplJ:61^+G1\u001fxESȉa˖l\u0016\u0007ԞK&\tt2\u0001Y\u0017^e\tq}ww-3dxΒCپ9\u001f.Ş:j:\n1\u0013O\b\u000eG\u007fLuM#\u001aLɥ}°\u001a A֗G?\u0019\u001d\r5\u0003\u0016;Idr\u0014R\u0004\u0016}ϝ~ɍ\u0013Ap֫\u007f\np\u007f:l;t]Z/6\u0007l\u0003/\u0018f\u0010y\u0010G\u000bIsT9\\lQ\t\u0002\bC\u0005<SĆ!Ǫ)\tw\"\u000bGEE--$\tdC#cui\u001e10feնvФ\b2kܞ\bdWp@OΘM{"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`#Zq\u001dv!Di\u000b \u0019i%.#", "", "<`\\2", "", "D`[BX", "", "@t[2<\u000b", "5q^Bc\u0015:[\u0019", "AdR<a+:`-^\u000ei6\u000b\u0019<e\u000e", "", "", "7cCFc,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"D\u0013aN\u00049]\"i\u0012Utt\u0001d\u0017\u000bs@H\u001bQ3E\u000b=2n\u001b#\u0012>lF\u0006G", "5dc\u0014e6N^\u0002z\u0003^", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0016W\u001bR^\u0019", "5dc\u001bT4>", "5dc\u001fh3>7w", "5dc X*H\\\u0018z\br\f\u0010\u00149s\u00105{N", "u(J\u0019](OOb\u000f\nb3Fp+pU", ")KY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005", "5dc#T3NS", "u(I", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"D\u0013aN\u00049]\"i\u0012Utt\u0001d\u0017\u000bs@H\u001bQ3E\u000b=2n\u001b#\u0012>lF\u0006=\u000eQ\u0002^\u0004P%wT]aCCJDo4h\u000bm\u001cb\u0004\u0016\u000fwR\u0019\u0017w`;\n]O r(", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class APIFeatureGate {

    @SerializedName(alternate = {}, value = "\u000e\u0018\u0014\u0019\u0013\u0001\u000f\u0001\f\u0003")
    @InterfaceC1492Gx
    private final String groupName;

    @SerializedName(alternate = {}, value = "\u0010\n\u0004\u0018\u001c\u0012\u0006")
    @InterfaceC1492Gx
    private final String idType;

    @SerializedName(alternate = {}, value = "\u0015\u0007\u0012\t")
    @InterfaceC1492Gx
    private final String name;

    @SerializedName(alternate = {}, value = "\u0019\u001b\u0011\t\u0002\u000b\u0005")
    @InterfaceC1492Gx
    private final String ruleID;

    @SerializedName(alternate = {}, value = "\u001a\u000b\b\u0013\u0011\u0006\u0002\u0012\u0018|\u0002\u0014\u000b\t\f\r\tz\b")
    @InterfaceC1492Gx
    private final Map<String, String>[] secondaryExposures;

    @SerializedName(alternate = {}, value = "\u001d\u0007\u0011\u0019\b")
    @InterfaceC1492Gx
    private final boolean value;

    public APIFeatureGate(String name, boolean z2, String ruleID, String str, Map<String, String>[] mapArr, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ruleID, "ruleID");
        this.name = name;
        this.value = z2;
        this.ruleID = ruleID;
        this.groupName = str;
        this.secondaryExposures = mapArr;
        this.idType = str2;
    }

    public /* synthetic */ APIFeatureGate(String str, boolean z2, String str2, String str3, Map[] mapArr, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? false : z2, (i2 + 4) - (4 | i2) != 0 ? "" : str2, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : str3, (i2 + 16) - (16 | i2) != 0 ? new Map[0] : mapArr, (i2 + 32) - (i2 | 32) == 0 ? str4 : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APIFeatureGate copy$default(APIFeatureGate aPIFeatureGate, String str, boolean z2, String str2, String str3, Map[] mapArr, String str4, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = aPIFeatureGate.name;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = aPIFeatureGate.value;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            str2 = aPIFeatureGate.ruleID;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            str3 = aPIFeatureGate.groupName;
        }
        if ((16 & i2) != 0) {
            mapArr = aPIFeatureGate.secondaryExposures;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            str4 = aPIFeatureGate.idType;
        }
        return aPIFeatureGate.copy(str, z2, str2, str3, mapArr, str4);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
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

    public final String component6() {
        return this.idType;
    }

    public final APIFeatureGate copy(String name, boolean z2, String ruleID, String str, Map<String, String>[] mapArr, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ruleID, "ruleID");
        return new APIFeatureGate(name, z2, ruleID, str, mapArr, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIFeatureGate)) {
            return false;
        }
        APIFeatureGate aPIFeatureGate = (APIFeatureGate) obj;
        return Intrinsics.areEqual(this.name, aPIFeatureGate.name) && this.value == aPIFeatureGate.value && Intrinsics.areEqual(this.ruleID, aPIFeatureGate.ruleID) && Intrinsics.areEqual(this.groupName, aPIFeatureGate.groupName) && Intrinsics.areEqual(this.secondaryExposures, aPIFeatureGate.secondaryExposures) && Intrinsics.areEqual(this.idType, aPIFeatureGate.idType);
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getIdType() {
        return this.idType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRuleID() {
        return this.ruleID;
    }

    public final Map<String, String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        boolean z2 = this.value;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int iHashCode2 = (((iHashCode + r02) * 31) + this.ruleID.hashCode()) * 31;
        String str = this.groupName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String>[] mapArr = this.secondaryExposures;
        int iHashCode4 = (iHashCode3 + (mapArr == null ? 0 : Arrays.hashCode(mapArr))) * 31;
        String str2 = this.idType;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "APIFeatureGate(name=" + this.name + ", value=" + this.value + ", ruleID=" + this.ruleID + ", groupName=" + ((Object) this.groupName) + ", secondaryExposures=" + Arrays.toString(this.secondaryExposures) + ", idType=" + ((Object) this.idType) + ')';
    }
}
