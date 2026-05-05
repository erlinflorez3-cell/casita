package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\rE4\u0012\u000e\u0007nj?7LeV7ZS0\u000fs{B*c$wCA٨ \u0014̝9O|f(\u0010Z`\u0019C'\b,w\u0019-Ye\u0007_*\u001bBD\u007f?aN\u007f?I`#:3#ݨ&8\b\nI#8R(x\u0011By\rXٚA9M`\u0018e\u0011*\u0014\u0016>N\u0002.^wNdL\u001b`\u0001ȉ$K\u0013PZ?_^ŧ}\u0015LT5\r\u000fc4*n8e'+S\u0011\tjgO\u0005Oqk\u0006x)7+ww\u00069\u001fģ\u0013]<]\u001aurTj5Wn\u001b?-ebyOT xC\u0003\u001bL\u001c\u000e48\u000fΪ,bm\u0016 Kt!T\u0007ѧ\u0001/b\u000e|yB''\u00103Y:+haai\u001d|:2\tc̜%ъr'c٪&b\u001b!b~\"G_@UJd\t\b>$\bGï\u0004ò\b6OĉG}\u00176%.ۄ_L"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&o\u0019Iv#1h}\u001f%|\u001a,SW+y4+t{l9\u0014g4N\u007f6U\"", "", "CrT?<\u000b", "", "3w_2e0FS\"\u000e\t", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`#Zq\u001b\u000b.1a\u0002\u001e\u0015w\u001f/QE\u0011", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001dU\tuz^", "5dc\u0012k7>`\u001d\u0007zg;\u000b", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc\"f,K7w", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
final class DeprecatedStickyUserExperiments {

    @SerializedName(alternate = {}, value = "\u001d\u0007\u0011\u0019\b\u0015")
    @InterfaceC1492Gx
    private final Map<String, APIDynamicConfig> experiments;

    @SerializedName(alternate = {}, value = "\u001c\u0019\n\u0016\u0002\u000b\u0005")
    @InterfaceC1492Gx
    private final String userID;

    public DeprecatedStickyUserExperiments(String str, Map<String, APIDynamicConfig> experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.userID = str;
        this.experiments = experiments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeprecatedStickyUserExperiments copy$default(DeprecatedStickyUserExperiments deprecatedStickyUserExperiments, String str, Map map, int i2, Object obj) {
        if ((1 & i2) != 0) {
            str = deprecatedStickyUserExperiments.userID;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            map = deprecatedStickyUserExperiments.experiments;
        }
        return deprecatedStickyUserExperiments.copy(str, map);
    }

    public final String component1() {
        return this.userID;
    }

    public final Map<String, APIDynamicConfig> component2() {
        return this.experiments;
    }

    public final DeprecatedStickyUserExperiments copy(String str, Map<String, APIDynamicConfig> experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        return new DeprecatedStickyUserExperiments(str, experiments);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeprecatedStickyUserExperiments)) {
            return false;
        }
        DeprecatedStickyUserExperiments deprecatedStickyUserExperiments = (DeprecatedStickyUserExperiments) obj;
        return Intrinsics.areEqual(this.userID, deprecatedStickyUserExperiments.userID) && Intrinsics.areEqual(this.experiments, deprecatedStickyUserExperiments.experiments);
    }

    public final Map<String, APIDynamicConfig> getExperiments() {
        return this.experiments;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        String str = this.userID;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.experiments.hashCode();
    }

    public String toString() {
        return "DeprecatedStickyUserExperiments(userID=" + ((Object) this.userID) + ", experiments=" + this.experiments + ')';
    }
}
