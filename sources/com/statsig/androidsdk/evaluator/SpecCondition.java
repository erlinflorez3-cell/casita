package com.statsig.androidsdk.evaluator;

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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4D\u0007\":4\u007f\u0007l{A0RnP.XS2\u000fy\u0002<$a$wْAkڼ.\"7N\u000f/wrXZ#C=\u0007&~x.aW\u000f\\@\u000eBH}BKO\u0006<ga\u0005<\u0013$J$Nx3\u0002*<V\u0015\u000f\tSM\u001c\u0012^A\u0001<b\r{\u00040\u00114D0\u0005,c\u007fNdIǰa:=+KpP`?_^}\u0014ϼG\u001d0\u001b\ny A?e4[ȳTK\u0010`oW\u0005Upk\u0006/Ү(sR\u0002lNZ\u0016\u0013C,\u0016֜^;;j\u001bin\u001c);O\u0012L`\u00108w)z#;2\u0014LϰIv4(} \u000eau9զA\u0019YlZ\u0018z\u0010اG+\u00063993f\u007fbk!T7\n\u0007% 9\u007f\u001d \f\\\u0014`#\u001elyg0\u007fAmPT\ngA\u0006\u0006\u0007a0+4DM\u007f=\u0001)<''G[g$1m\u0012Hrf\r\u0004\u000fn\u0004oXHN)\u0007\u0016e+OɸY\ru\u0013\u0005hT\u0007FAS*o\u001f\u007f\u001e\u0012N[>̪\"m\u0017\\k\u0001i\u0019j$ݚ$wmEw\u0007k<X\u007fԫ2\u0006sq\u0015y`\u0007\u0016O<\u0011\u0006hhRS:Yr'P8~nfǶ}ΌR\u0012\u001bԵWs\"=:;ir#L\u001b X@+\n\u0016^?ɵ\u0001Ձ7*\u000bǭ<v\u000f\f^hA\u0004u\u007fa,+aX1\u0018٣7Ԋ*[*ֻL~)\u0014\r\u007fP]uO_N\u0003\u0015$V2$l֥;ֺ3C\u001bÁ\u0017+8\u0010;Q\u001d\tsSe\u0014=y+xE??ֳiŰnv4ߌ\u0003LUc%2Gr\u0001# d.z\u0018JQúeӝ\u000faFδ\u000b\u0005_M\\Dٱ\t>"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi%x\u0016,+MDj8-\u0019rj\u000f", "", "Bx_2", "", "B`a4X;/O \u000fz", "=oT?T;H`", "4hT9W", "/cS6g0H\\\u0015\u0006kZ3\r\t=", "", "7cCFc,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCyUI30\u0004uY\u0011?oJs\u0012\u0019\u000bQu>g\f\u0011\u0001\u0011~CrVUfc\u0003I\u0017\tS", "5dc\u000eW+Bb\u001d\t\u0004Z3m\u00056u\u007f6", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc\u0013\\,ER", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0016W\u001bR^\u0019", "5dc\u001cc,KO(\t\b", "5dc!T9@S(ove<|", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc!l7>", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class SpecCondition {

    @SerializedName(alternate = {}, value = "\b\n\t\r\u0017\u000b\u0010\u000e\u007f\nr|\u0007\u000f}\u000b")
    @InterfaceC1492Gx
    private final Map<String, Object> additionalValues;

    @SerializedName(alternate = {}, value = "\r\u000f\n\u0010\u0007")
    @InterfaceC1492Gx
    private final String field;

    @SerializedName(alternate = {}, value = "\u0010\nx\u001d\u0013\u0007")
    @InterfaceC1492Gx
    private final String idType;

    @SerializedName(alternate = {}, value = "\u0016\u0016\n\u0016\u0004\u0016\u0010\u0012")
    @InterfaceC1492Gx
    private final String operator;

    @SerializedName(alternate = {}, value = "\u001b\u0007\u0017\u000b\b\u0016v\u0001\u000b\u0013\u0002")
    @InterfaceC1492Gx
    private final Object targetValue;

    @SerializedName(alternate = {}, value = "\u001b\u001f\u0015\t")
    @InterfaceC1492Gx
    private final String type;

    public SpecCondition(String type, Object obj, String str, String str2, Map<String, ? extends Object> map, String idType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(idType, "idType");
        this.type = type;
        this.targetValue = obj;
        this.operator = str;
        this.field = str2;
        this.additionalValues = map;
        this.idType = idType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpecCondition copy$default(SpecCondition specCondition, String str, Object obj, String str2, String str3, Map map, String str4, int i2, Object obj2) {
        if ((1 & i2) != 0) {
            str = specCondition.type;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            obj = specCondition.targetValue;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str2 = specCondition.operator;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            str3 = specCondition.field;
        }
        if ((i2 + 16) - (16 | i2) != 0) {
            map = specCondition.additionalValues;
        }
        if ((i2 & 32) != 0) {
            str4 = specCondition.idType;
        }
        return specCondition.copy(str, obj, str2, str3, map, str4);
    }

    public final String component1() {
        return this.type;
    }

    public final Object component2() {
        return this.targetValue;
    }

    public final String component3() {
        return this.operator;
    }

    public final String component4() {
        return this.field;
    }

    public final Map<String, Object> component5() {
        return this.additionalValues;
    }

    public final String component6() {
        return this.idType;
    }

    public final SpecCondition copy(String type, Object obj, String str, String str2, Map<String, ? extends Object> map, String idType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(idType, "idType");
        return new SpecCondition(type, obj, str, str2, map, idType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecCondition)) {
            return false;
        }
        SpecCondition specCondition = (SpecCondition) obj;
        return Intrinsics.areEqual(this.type, specCondition.type) && Intrinsics.areEqual(this.targetValue, specCondition.targetValue) && Intrinsics.areEqual(this.operator, specCondition.operator) && Intrinsics.areEqual(this.field, specCondition.field) && Intrinsics.areEqual(this.additionalValues, specCondition.additionalValues) && Intrinsics.areEqual(this.idType, specCondition.idType);
    }

    public final Map<String, Object> getAdditionalValues() {
        return this.additionalValues;
    }

    public final String getField() {
        return this.field;
    }

    public final String getIdType() {
        return this.idType;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final Object getTargetValue() {
        return this.targetValue;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Object obj = this.targetValue;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.operator;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.field;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.additionalValues;
        return ((iHashCode4 + (map != null ? map.hashCode() : 0)) * 31) + this.idType.hashCode();
    }

    public String toString() {
        return "SpecCondition(type=" + this.type + ", targetValue=" + this.targetValue + ", operator=" + ((Object) this.operator) + ", field=" + ((Object) this.field) + ", additionalValues=" + this.additionalValues + ", idType=" + this.idType + ')';
    }
}
