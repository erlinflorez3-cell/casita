package com.statsig.androidsdk.evaluator;

import com.google.gson.annotations.SerializedName;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r&4ߚ\u007f\u0007|jA0JfP.`q2\u000f\u0002{<$a&yCI^\"}(&WNumvJ`\u000bIƥ\f,ю\u001b,wT9=\"\u0013@B\b?aN\u007fAGb\r63#B&F}\u001d\u0001H/X\u0014\u0005\u0001[K:\u0013@F~Aj\u000fc\u0004H\u0013\u0016H.\t6bwPFH\u001bgh83\u0007wMf'\u000e1\rQ\u001bRl';wq$9MO7+$\u0002\u0004\u0017XiM\u001bA\b<3wҊ++W\u0004 =f ,\u0015YPSǥsnj\u0013rx\u000e=*}r\u0012\u05fb\u000f߭{z\n%\u0005\u000b\u001c(?H\\0`Ș\tV:\u0003\u0016k@~\u0007%ܔ\u0001ChD;=\u007fa,\u007fԜg\u001ajI>f9\u0012\u0004;\u001fiѮoihb4x\u001b+V\bQ_[nF\u000fޗ\u000b\"D{+\tb0+JωHH6\n9F\u0017S8\"߄$it\u0010q\\i\r\u0004\u000fi\u001aצS\u0011=0\u0019.7X\u009e<`Jd\u0013khT\u0007-AS\"T\u0015\u007f \u0013N_(B'%\u001eRgh\u0018o}c\u0010%=lOY\u001dl>_?^A<ie&`\u0001wDKBb\u0013`~Hc\u000ej\\V,`Q\u001b\u0016}{RY$\u0013`@\"\":,?%t\u0015v\u0004NJG|\u0017lrj&}\u00034T\u000bo$\u0003\u0017\u0019Rro\u001ev?ͩ+ʬd\";l\u001aF'Rm\"\u0017C-)\u0015,\f\u0002]fzF\u0013͕\u0017>\\\nN.\u001ag\u0001u̢\u0012W\u00067b\u001a-sM9УP\u001e,5\u0003\u0015\u007f\u001f=x.\u0016\u0012\u0019ybdA߂Qݚ\u001b(~ܥ\u000b%\u000eu\u000e\f2\\\tT{V!ZlJ)\u00070ߪP̞\u0001\u000b'Ǉ=\u0003u5\u000bI}W5).wB0Ke4ɘqЦ}h\u0017ծ\rg\nAq*@v_cJ;fJ\u0010\u0003\u0015е&к\u0007HP۳\u0010\nH\u001fB!\u0004\\Oo\tVfNA3T֍\tՐ\u0011v^ܪR\u0015u\u0015BB0B\u0002Q\u0016\u0016tBS \u0004W>Ƣoљ`\u0013R\u000f\u0018$\u00143t *Upjeb!04tN:\u0018ݭdƀ@\u000f,҉D>\u000e%Qh:\u001a\u001e|\u0018F\u000e\u0012M6\u0019ǅ=ټ\u0012Z\u0001ִnJ\u000b{S|q>\u000f\u0003'3L}k5[֏Hߟ3i:ܬk\u001f\u000f8xmO|32\\VO\u001aVY7\u000f\u001cؗE͕\u0006<\fڛAoq\u000f\u001aL·\u0001N"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,:SBk\n", "", "<`\\2", "", ">`b@C,KQ\u0019\b\nZ.|", "", "@dcBe5/O \u000fz", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi$m%>ZL7h;\u001e\u0006dhI\u00079", "7c", "A`[A", "1n]1\\;B]\"\r", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,+MDj8-\u0019rj\u000f", "7cCFc,", "5q^Bc\u0015:[\u0019", "1n]3\\.\u001dS ~|Z;|", "7r4Ec,KW!~\u0004m\u000e\n\u0013?p", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}Z'~!\u001f\u0011}\u001d8\u000639[G\u001c@l#8QBIj:g\u0015y]@\u0017_;X\u0004p4L]<i[n:\u001b\u0012K\nU;\rZ@F \u007f@\u0001&\u00045KK)w\u000e\u0010\u001f\u0010\u000bQu>g\f\u0011\u0001\u0011~CrVUfc\u0003I\u0017,g&u\b)-k>Amzu'*>73\u0006\rOZyN\u0003i15(\b<-@CBKA\u0001Q\u0006{#(MEe!?\\}-J\u0014\t0;2.\fGp\u001a\bL\b\"0eC|\r;8$;\u0015jqu@WE)k\u000f\u000e^>\u0007\\V", "5dc\u0010b5=W(\u0003\u0005g:", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0010b5?W\u001b]ze,~\u0005>e", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0014e6N^\u0002z\u0003^", "5dc\u0016W", "5dc\u0016W\u001bR^\u0019", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "5dc\u001bT4>", "5dc\u001dT:L>\u0019\fx^5\f\u00051e", "u(3", "5dc\u001fX;N`\"ove<|", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9\u000eMr,EU\r*D7\u0003.\\SHt0\u001b\u001chR5\u000es,$", "5dc T3M", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}Z'~!\u001f\u0011}\u001d8\u000639[G\u001c@l#8QBIj:g\u0015y]@\u0017_;X\u0004p4L]<i[n:\u001b\u0012K\nU;\rZ@F \u007f@\u0001&\u00045KK)w\u000e\u0010\u001f\u0010\u000bQu>g\f\u0011\u0001\u0011~CrVUfc\u0003I\u0017,g&u\b)-k>Amzu'*>73\u0006\rOZyN\u0003i15(\b<-@CBKA\u0001Q\u0006{#(MEe!?\\}-J\u0014\t0;2.\fGp\u001a\bL\b\"0eC|\r;8$;\u0015jqu@WE)k\u000f\u000e^>\u0007\\LcmPX\u0015l\u0013jCeaJ3[\u0005KSs\u00145E\u0005\f[\u000b\u0011\u0010\u0017 |oV\r\t_\u0001\u0018]T)_f", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class SpecRule {

    @SerializedName(alternate = {}, value = "\n\u0015\u0013\b\f\u0016\n\u000f\r\u0011")
    @InterfaceC1492Gx
    private final List<SpecCondition> conditions;

    @SerializedName(alternate = {}, value = "\n\u0015\u0013\n\f\td\u0005\u000b\u0003\u0004|\u000f~")
    @InterfaceC1492Gx
    private final String configDelegate;

    @SerializedName(alternate = {}, value = "\u000e\u0018\u0014\u0019\u0013o\u0002\r\u0004")
    @InterfaceC1492Gx
    private final String groupName;

    @SerializedName(alternate = {}, value = "\u0010\n")
    @InterfaceC1492Gx
    private final String id;

    @SerializedName(alternate = {}, value = "\u0010\nx\u001d\u0013\u0007")
    @InterfaceC1492Gx
    private final String idType;

    @SerializedName(alternate = {}, value = "\u0010\u0019i\u001c\u0013\u0007\u0013\t\f\u0003\u000b\u0010a\f\b\r\u0007")
    @InterfaceC1492Gx
    private final Boolean isExperimentGroup;

    @SerializedName(alternate = {}, value = "\u0015\u0007\u0012\t")
    @InterfaceC1492Gx
    private final String name;

    @SerializedName(alternate = {}, value = "\u0017\u0007\u0018\u0017r\u0007\u0013\u0003\u0004\f\u0011|\u0002~")
    @InterfaceC1492Gx
    private final double passPercentage;

    @SerializedName(alternate = {}, value = "\u0019\u000b\u0019\u0019\u0015\u0010v\u0001\u000b\u0013\u0002")
    @InterfaceC1492Gx
    private final ReturnableValue returnValue;

    @SerializedName(alternate = {}, value = "\u001a\u0007\u0011\u0018")
    @InterfaceC1492Gx
    private final String salt;

    public SpecRule(String name, double d2, ReturnableValue returnValue, String id, String str, List<SpecCondition> conditions, String idType, String groupName, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(returnValue, "returnValue");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        this.name = name;
        this.passPercentage = d2;
        this.returnValue = returnValue;
        this.id = id;
        this.salt = str;
        this.conditions = conditions;
        this.idType = idType;
        this.groupName = groupName;
        this.configDelegate = str2;
        this.isExperimentGroup = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpecRule copy$default(SpecRule specRule, String str, double d2, ReturnableValue returnableValue, String str2, String str3, List list, String str4, String str5, String str6, Boolean bool, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = specRule.name;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            d2 = specRule.passPercentage;
        }
        if ((4 & i2) != 0) {
            returnableValue = specRule.returnValue;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            str2 = specRule.id;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            str3 = specRule.salt;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            list = specRule.conditions;
        }
        if ((64 & i2) != 0) {
            str4 = specRule.idType;
        }
        if ((i2 + 128) - (128 | i2) != 0) {
            str5 = specRule.groupName;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 256)) != 0) {
            str6 = specRule.configDelegate;
        }
        if ((i2 + 512) - (i2 | 512) != 0) {
            bool = specRule.isExperimentGroup;
        }
        return specRule.copy(str, d2, returnableValue, str2, str3, list, str4, str5, str6, bool);
    }

    public final String component1() {
        return this.name;
    }

    public final Boolean component10() {
        return this.isExperimentGroup;
    }

    public final double component2() {
        return this.passPercentage;
    }

    public final ReturnableValue component3() {
        return this.returnValue;
    }

    public final String component4() {
        return this.id;
    }

    public final String component5() {
        return this.salt;
    }

    public final List<SpecCondition> component6() {
        return this.conditions;
    }

    public final String component7() {
        return this.idType;
    }

    public final String component8() {
        return this.groupName;
    }

    public final String component9() {
        return this.configDelegate;
    }

    public final SpecRule copy(String name, double d2, ReturnableValue returnValue, String id, String str, List<SpecCondition> conditions, String idType, String groupName, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(returnValue, "returnValue");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        return new SpecRule(name, d2, returnValue, id, str, conditions, idType, groupName, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecRule)) {
            return false;
        }
        SpecRule specRule = (SpecRule) obj;
        return Intrinsics.areEqual(this.name, specRule.name) && Intrinsics.areEqual((Object) Double.valueOf(this.passPercentage), (Object) Double.valueOf(specRule.passPercentage)) && Intrinsics.areEqual(this.returnValue, specRule.returnValue) && Intrinsics.areEqual(this.id, specRule.id) && Intrinsics.areEqual(this.salt, specRule.salt) && Intrinsics.areEqual(this.conditions, specRule.conditions) && Intrinsics.areEqual(this.idType, specRule.idType) && Intrinsics.areEqual(this.groupName, specRule.groupName) && Intrinsics.areEqual(this.configDelegate, specRule.configDelegate) && Intrinsics.areEqual(this.isExperimentGroup, specRule.isExperimentGroup);
    }

    public final List<SpecCondition> getConditions() {
        return this.conditions;
    }

    public final String getConfigDelegate() {
        return this.configDelegate;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIdType() {
        return this.idType;
    }

    public final String getName() {
        return this.name;
    }

    public final double getPassPercentage() {
        return this.passPercentage;
    }

    public final ReturnableValue getReturnValue() {
        return this.returnValue;
    }

    public final String getSalt() {
        return this.salt;
    }

    public int hashCode() {
        int iHashCode = ((((((this.name.hashCode() * 31) + Double.hashCode(this.passPercentage)) * 31) + this.returnValue.hashCode()) * 31) + this.id.hashCode()) * 31;
        String str = this.salt;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.conditions.hashCode()) * 31) + this.idType.hashCode()) * 31) + this.groupName.hashCode()) * 31;
        String str2 = this.configDelegate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isExperimentGroup;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isExperimentGroup() {
        return this.isExperimentGroup;
    }

    public String toString() {
        return "SpecRule(name=" + this.name + ", passPercentage=" + this.passPercentage + ", returnValue=" + this.returnValue + ", id=" + this.id + ", salt=" + ((Object) this.salt) + ", conditions=" + this.conditions + ", idType=" + this.idType + ", groupName=" + this.groupName + ", configDelegate=" + ((Object) this.configDelegate) + ", isExperimentGroup=" + this.isExperimentGroup + ')';
    }
}
