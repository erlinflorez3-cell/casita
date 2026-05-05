package com.statsig.androidsdk.evaluator;

import com.google.gson.annotations.SerializedName;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O$8\u000b<N\u0007Ӭ4\u0012\u0006)nj?7LeV7ZS0\u000fs{B*c$wCA٦ \u0014̝9O|f( Zd\u0019C'\f&zz,wW'^\"+@E\bWCO\u007f=gb\u0005D\u0015,B$Hy3\u0003*,X\u0010%yqO:\u0016ضDpHWUZ\u0013$*\fN\"\u0011\u001e\u000bi|7\u000fȔ^\u0003N1\u000e\u0002Z^)o0+O\u001dTd3\u001dxq\u001eYBG7%%\u0002\u00025V\nCIԑr\u0006>v3?+w֕\bB^\u007f\"\u0015CU\u001d_\u0003&\u000b\u0007\u007fa<E1OqNh&8y\u000b{;>\u0014\u001c\u00163X0=\u001a\u0015\n\u001e5\u0005r\u0002?~\u0006\rFFѴ`~(3\rK+g)\u0017WoJ1PMz3\fdƗ\u00027(id&`C,\u001bʄPyXNO`N8[\u0004Ѿ\u0003A\u000f\u0010-\u001cHW\u0002?{?0'3GgI%1k0JTi\u0007\u0005\u000fg\u0002m\u0001Lv&Eݳ9Ҋ\r\u0012bե|\u0007qVb_|+[\u001cl\r\u000e\n# \u000byj\"[\u0014%рjȬnSe܃=1l?gw±\u0012j"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,8?Hg<\f$rn9\\", "", "B`a4X;\u001a^$bYl", "", "", ">`a.`,MS&\r", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`'Vs\u0015\u0006^!@/A\u0011", "5dc\u001dT9:[\u0019\u000ezk:", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc!T9@S(Z\u0006i\u0010[\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class SpecParamStore {

    @SerializedName(alternate = {}, value = "\u0017\u0007\u0017\u0005\u0010\u0007\u0015\u0005\u0011\u0011")
    @InterfaceC1492Gx
    private final Map<String, Map<String, Object>> parameters;

    @SerializedName(alternate = {}, value = "\u001b\u0007\u0017\u000b\b\u0016a\u0010\u000ff`\u000f")
    @InterfaceC1492Gx
    private final List<String> targetAppIDs;

    /* JADX WARN: Multi-variable type inference failed */
    public SpecParamStore(List<String> targetAppIDs, Map<String, ? extends Map<String, ? extends Object>> parameters) {
        Intrinsics.checkNotNullParameter(targetAppIDs, "targetAppIDs");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.targetAppIDs = targetAppIDs;
        this.parameters = parameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpecParamStore copy$default(SpecParamStore specParamStore, List list, Map map, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            list = specParamStore.targetAppIDs;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            map = specParamStore.parameters;
        }
        return specParamStore.copy(list, map);
    }

    public final List<String> component1() {
        return this.targetAppIDs;
    }

    public final Map<String, Map<String, Object>> component2() {
        return this.parameters;
    }

    public final SpecParamStore copy(List<String> targetAppIDs, Map<String, ? extends Map<String, ? extends Object>> parameters) {
        Intrinsics.checkNotNullParameter(targetAppIDs, "targetAppIDs");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new SpecParamStore(targetAppIDs, parameters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecParamStore)) {
            return false;
        }
        SpecParamStore specParamStore = (SpecParamStore) obj;
        return Intrinsics.areEqual(this.targetAppIDs, specParamStore.targetAppIDs) && Intrinsics.areEqual(this.parameters, specParamStore.parameters);
    }

    public final Map<String, Map<String, Object>> getParameters() {
        return this.parameters;
    }

    public final List<String> getTargetAppIDs() {
        return this.targetAppIDs;
    }

    public int hashCode() {
        return (this.targetAppIDs.hashCode() * 31) + this.parameters.hashCode();
    }

    public String toString() {
        return "SpecParamStore(targetAppIDs=" + this.targetAppIDs + ", parameters=" + this.parameters + ')';
    }
}
