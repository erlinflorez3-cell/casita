package com.statsig.androidsdk.evaluator;

import com.google.gson.annotations.SerializedName;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":\u001b\u007f\u0007ljA0ZeP.XS2\u000fy\u001a<$q$yCAY\"}0\u000fWNm\u000ftϻ`!¼?\u0006Dw+ߦHe|k\u0012'2ppO7[qU9\u000fuF\t.5:8(\t\u0011\u001e8M(v)D[\u0010 6XphY\u001dQ\u0013\"*\u0006l$\u0011(jpf<Xnm:].1sRR5kH|{\u000eVX5\u001a\u000faL,PCC#=[\u0013\tb[m\u0004Upk\u000fx-5:aum5\u0007\u0004$#1O\u001bm\u000b.l\u0007a`:(AN\u0012U`\u0016.w\t\r%>\u001a\r49ρ2-(yP\u0015A\u001d\u000bSnQHߐCH\no_/-\u00105;9Igg`i#\u0015Ҡ|M\u001b,M\u0019p7Z\u0003\u0012'ۄ\u001cƻ{Q?n\tLVy\"aMo\u0014p\u0011\u0003@\u0003^QFÂ|Y<%QO]O\"O}HӍEϼz\u0005n\u000f\u001cp`uX\"\u001d\u0017}Ү\nTaR\u0013\u001dk~X\u001fÓ\u0012\u0016#b6\u0016\bA!#˃=i,\u001e~gh\u0018q\u0014ϱ\u000bm6thqn\u001a\u0012\u001e߱_{B_\u0016(gbx$?jm3b-\u0382TTaj[:2vkVȵ|\rU\u001aGJ? \u001dzЀ2aÍ\u0014V86Boґ9e`h\u001e~l3R\u0004\u001a*z\t\u000fRtp\u001eh)O2|n%EA\u007f9I,[\"v9\u0015#5\u007f$\u0006MgZMdlD|\u0006\u0002&\u0016(Ai/k\u0017?\u000b/2\u00106]R\u0003gaM@2)\u0007*\u0015Ah<s j\u001f-\u0011pPOb$:v\rsS\u0016j\u007f\bo^\u0003Wed\u000b\n?_q1clV>|\u0013.6'\u0017nP\u0001e;I'+&\u0010\u001c?\u0017q]\u0018pDx\u0011\u0019V|k\u0004:t.qxP\fD\u0002ζH˕\u0003>0Z5\u0014P\u007f\u0003w6F9:\u001bk`Czo\u00057\u0014¨0Fm\u0015e%p\u0005m\u0001ݻnF;<\u001aBsq~ZۂBu%[Y\u007fm\u001cR\u0013\u000f!\u0602\fν\u007f7vܞ4?&jewYD\u0014{06o?\u0019\t\u0013ʇ&Ҭ0B\u0010Ձ[Vo\u001c\u001e\u0012PZm\u001c/2ptqZd֒zחZN\rݺ]b'B\u000f\u0018_O,\u0007M9\u0015oVT]dH\u007f\u0002'?\u001fAʲ\u0001ݝ)1LǴQ\u001d.r\u000f&\u0016uQX\u001a8\u001aFWq\"sbՌ\u001aԠ!J \u001bGo)a|Ll(&x\\p\u000f\u0012\u0015S\u0005&\u007fͮ|է\u0012B\u0012ۇ#\u001bU\u0012}{}`\\zOCH\u0005MH\u007fܕ\u000eƔgL#Ҏ\u001e73@W\u0002d;\nWk;,\tV$}\u05fcvֈ`]\u0016ў\"_!Z$\u000bf|\u0010\u0012+V0\u0006>J#}88>:&ז5ě\u0017daŕ\u0010#FH9\bVVYm\u0011\n\u0012m\u001ar,̋\u0005Ђ5\\\u0002ҧER#+5f~/fjR\u0019c\"h\u0011.\u0015+%M@>f\u007f։Qʍlvsχs\u000f1RyE2E>T6}Mz,\b\u0001Ĝ*נ?\\U˾|\u000bb\u0011Pp^vx9|v\"(B\u000f5L5ƿ\u0015̭Jz&d=^1!a2U\u0007ԫ\b\u0001"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,#", "", "<`\\2", "", "Bx_2", "7r00g0OS", "", "A`[A", "2dU.h3MD\u0015\u0006\u000b^", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi$m%>ZL7h;\u001e\u0006dhI\u00079", "3mP/_,=", "@t[2f", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,:SBk\n", "7cCFc,", "3mc6g@", "3w_9\\*Bb\u0004z\bZ4|\u0018/r\u000e", "6`b [(KS\u0018ivk(\u0005\u0017", "B`a4X;\u001a^$bYl", "Dda@\\6G", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#4H7|0g\u001cdj;PQ;[z0I\"5*fZ<K#\u000ei\u001cR-V\u0001b@1xH6-\u00072\u0013\u0002Ld\b\u001c\u0012\u001d?w:/V\u001fW\u0007\u001eq>0h7Uf\nG\u0017:I/`\u001d[flI>+]X\u001d)w&\u0015\u000fwd\r<Yupi\u0011\u0007\nE(Go1-Jkf8>.\u001bT}A\u007fAex4v\u0003j9&G`N[v\u001cE(_\u0019:k\u0017\u000e+2M\u000f\tR_~n\bjr)h\b\nk\u000b\u0018\u001eav_\u0012\u001f\u0016a\u001e%\u001cem\u0010\r9\u000b:Zk^.B\bD%]\u001e\u0018\u0007&mr\u001f\u0007\f", "5dc\u0011X-:c \u000ekZ3\r\t", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9\u000eMr,EU\r*D7\u0003.\\SHt0\u001b\u001chR5\u000es,$", "5dc\u0012a(;Z\u0019}", "u(I", "5dc\u0012a;Bb-", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0012k7EW\u0017\u0003\nI(\n\u00057e\u000f(\tN", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0015T:,V\u0015\fz]\u0017x\u0016+m\u000e", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "5dc\u0016W\u001bR^\u0019", "5dc\u001bT4>", "5dc\u001fh3>a", "5dc T3M", "5dc!T9@S(Z\u0006i\u0010[\u0017", "5dc!l7>", "5dc#X9LW#\b", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JG", "1n\\=b5>\\(JH", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#4H7|0g\u001cdj;PQ;[z0I\"5*fZ<K#\u000ei\u001cR-V\u0001b@1xH6-\u00072\u0013\u0002Ld\b\u001c\u0012\u001d?w:/V\u001fW\u0007\u001eq>0h7Uf\nG\u0017:I/`\u001d[flI>+]X\u001d)w&\u0015\u000fwd\r<Yupi\u0011\u0007\nE(Go1-Jkf8>.\u001bT}A\u007fAex4v\u0003j9&G`N[v\u001cE(_\u0019:k\u0017\u000e+2M\u000f\tR_~n\bjr)h\b\nk\u000b\u0018\u001eav_\u0012\u001f\u0016a\u001e%\u001cem\u0010\r9\u000b:Zk^.B\bD%]\u001e\u0018\u0007&mr\u001f\u0007\u0002R\u000b\":R1[ \u0011\u0007ha\u00187\u0015Jc\u0013g8^=\u0017\u0013\u001ad?\u001cwhM\":6\u001bmIH", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class Spec {

    @SerializedName(alternate = {}, value = "\u000b\u000b\u000b\u0005\u0018\u000e\u0015u\u007f\n\u0012\u0001")
    @InterfaceC1492Gx
    private final ReturnableValue defaultValue;

    @SerializedName(alternate = {}, value = "\f\u0014\u0006\u0006\u000f\u0007\u0005")
    @InterfaceC1492Gx
    private final boolean enabled;

    @SerializedName(alternate = {}, value = "\f\u0014\u0019\r\u0017\u001b")
    @InterfaceC1492Gx
    private final String entity;

    @SerializedName(alternate = {}, value = "\f\u001e\u0015\u0010\f\u0005\n\u0014n~\u000f|\b~\r|\t\t")
    @InterfaceC1492Gx
    private final List<String> explicitParameters;

    @SerializedName(alternate = {}, value = "\u000f\u0007\u0018v\u000b\u0003\u0013\u0005\u0003m}\u000e{\u0007\f")
    @InterfaceC1492Gx
    private final Boolean hasSharedParams;

    @SerializedName(alternate = {}, value = "\u0010\nx\u001d\u0013\u0007")
    @InterfaceC1492Gx
    private final String idType;

    @SerializedName(alternate = {}, value = "\u0010\u0019e\u0007\u0017\u000b\u0017\u0005")
    @InterfaceC1492Gx
    private final boolean isActive;

    @SerializedName(alternate = {}, value = "\u0015\u0007\u0012\t")
    @InterfaceC1492Gx
    private final String name;

    @SerializedName(alternate = {}, value = "\u0019\u001b\u0011\t\u0016")
    @InterfaceC1492Gx
    private final List<SpecRule> rules;

    @SerializedName(alternate = {}, value = "\u001a\u0007\u0011\u0018")
    @InterfaceC1492Gx
    private final String salt;

    @SerializedName(alternate = {}, value = "\u001b\u0007\u0017\u000b\b\u0016a\u0010\u000ff`\u000f")
    @InterfaceC1492Gx
    private final List<String> targetAppIDs;

    @SerializedName(alternate = {}, value = "\u001b\u001f\u0015\t")
    @InterfaceC1492Gx
    private final String type;

    @SerializedName(alternate = {}, value = "\u001d\u000b\u0017\u0017\f\u0011\u000f")
    @InterfaceC1492Gx
    private final Integer version;

    public Spec(String name, String type, boolean z2, String salt, ReturnableValue defaultValue, boolean z3, List<SpecRule> rules, String idType, String entity, List<String> list, Boolean bool, List<String> list2, Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(salt, "salt");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.name = name;
        this.type = type;
        this.isActive = z2;
        this.salt = salt;
        this.defaultValue = defaultValue;
        this.enabled = z3;
        this.rules = rules;
        this.idType = idType;
        this.entity = entity;
        this.explicitParameters = list;
        this.hasSharedParams = bool;
        this.targetAppIDs = list2;
        this.version = num;
    }

    public /* synthetic */ Spec(String str, String str2, boolean z2, String str3, ReturnableValue returnableValue, boolean z3, List list, String str4, String str5, List list2, Boolean bool, List list3, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z2, str3, returnableValue, z3, list, str4, str5, list2, bool, (i2 & 2048) != 0 ? null : list3, (i2 & 4096) == 0 ? num : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Spec copy$default(Spec spec, String str, String str2, boolean z2, String str3, ReturnableValue returnableValue, boolean z3, List list, String str4, String str5, List list2, Boolean bool, List list3, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = spec.name;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = spec.type;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            z2 = spec.isActive;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            str3 = spec.salt;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            returnableValue = spec.defaultValue;
        }
        if ((i2 & 32) != 0) {
            z3 = spec.enabled;
        }
        if ((i2 & 64) != 0) {
            list = spec.rules;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            str4 = spec.idType;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            str5 = spec.entity;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
            list2 = spec.explicitParameters;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1024)) != 0) {
            bool = spec.hasSharedParams;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2048)) != 0) {
            list3 = spec.targetAppIDs;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4096)) != 0) {
            num = spec.version;
        }
        return spec.copy(str, str2, z2, str3, returnableValue, z3, list, str4, str5, list2, bool, list3, num);
    }

    public final String component1() {
        return this.name;
    }

    public final List<String> component10() {
        return this.explicitParameters;
    }

    public final Boolean component11() {
        return this.hasSharedParams;
    }

    public final List<String> component12() {
        return this.targetAppIDs;
    }

    public final Integer component13() {
        return this.version;
    }

    public final String component2() {
        return this.type;
    }

    public final boolean component3() {
        return this.isActive;
    }

    public final String component4() {
        return this.salt;
    }

    public final ReturnableValue component5() {
        return this.defaultValue;
    }

    public final boolean component6() {
        return this.enabled;
    }

    public final List<SpecRule> component7() {
        return this.rules;
    }

    public final String component8() {
        return this.idType;
    }

    public final String component9() {
        return this.entity;
    }

    public final Spec copy(String name, String type, boolean z2, String salt, ReturnableValue defaultValue, boolean z3, List<SpecRule> rules, String idType, String entity, List<String> list, Boolean bool, List<String> list2, Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(salt, "salt");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(entity, "entity");
        return new Spec(name, type, z2, salt, defaultValue, z3, rules, idType, entity, list, bool, list2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Spec)) {
            return false;
        }
        Spec spec = (Spec) obj;
        return Intrinsics.areEqual(this.name, spec.name) && Intrinsics.areEqual(this.type, spec.type) && this.isActive == spec.isActive && Intrinsics.areEqual(this.salt, spec.salt) && Intrinsics.areEqual(this.defaultValue, spec.defaultValue) && this.enabled == spec.enabled && Intrinsics.areEqual(this.rules, spec.rules) && Intrinsics.areEqual(this.idType, spec.idType) && Intrinsics.areEqual(this.entity, spec.entity) && Intrinsics.areEqual(this.explicitParameters, spec.explicitParameters) && Intrinsics.areEqual(this.hasSharedParams, spec.hasSharedParams) && Intrinsics.areEqual(this.targetAppIDs, spec.targetAppIDs) && Intrinsics.areEqual(this.version, spec.version);
    }

    public final ReturnableValue getDefaultValue() {
        return this.defaultValue;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getEntity() {
        return this.entity;
    }

    public final List<String> getExplicitParameters() {
        return this.explicitParameters;
    }

    public final Boolean getHasSharedParams() {
        return this.hasSharedParams;
    }

    public final String getIdType() {
        return this.idType;
    }

    public final String getName() {
        return this.name;
    }

    public final List<SpecRule> getRules() {
        return this.rules;
    }

    public final String getSalt() {
        return this.salt;
    }

    public final List<String> getTargetAppIDs() {
        return this.targetAppIDs;
    }

    public final String getType() {
        return this.type;
    }

    public final Integer getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.type.hashCode()) * 31;
        boolean z2 = this.isActive;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int iHashCode2 = (((((iHashCode + r02) * 31) + this.salt.hashCode()) * 31) + this.defaultValue.hashCode()) * 31;
        boolean z3 = this.enabled;
        int iHashCode3 = (((((((iHashCode2 + (z3 ? 1 : z3)) * 31) + this.rules.hashCode()) * 31) + this.idType.hashCode()) * 31) + this.entity.hashCode()) * 31;
        List<String> list = this.explicitParameters;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.hasSharedParams;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list2 = this.targetAppIDs;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.version;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        return "Spec(name=" + this.name + ", type=" + this.type + ", isActive=" + this.isActive + ", salt=" + this.salt + ", defaultValue=" + this.defaultValue + ", enabled=" + this.enabled + ", rules=" + this.rules + ", idType=" + this.idType + ", entity=" + this.entity + ", explicitParameters=" + this.explicitParameters + ", hasSharedParams=" + this.hasSharedParams + ", targetAppIDs=" + this.targetAppIDs + ", version=" + this.version + ')';
    }
}
