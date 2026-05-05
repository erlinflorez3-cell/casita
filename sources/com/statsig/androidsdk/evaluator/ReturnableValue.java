package com.statsig.androidsdk.evaluator;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@JsonAdapter(CustomSerializer.class)
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\r.4ߚ\u007f\u0007t\rA0JtP.`Y2\u000fq|:śa:ڎs;\u0004\u00196!\"\u0010\u007fwotJh\u000b[\u0011\u001c\u0015'k<O[xk\u0014'2prOGSoK=x\u0003F\u000702P;\n\u0007\u0011\u001aXG&u)Hƚ\u0010\u0012>F9H`\u001be\u00070\u00114?fӼ\u001f֔kNDP5dH>;\u0003\u0018E\u0015В`x\u0012[\u001d^b7\u000f\u0007aL.P9E\u0015SR\u0019\u0006\u0001`\u0006ƨ@:w\u0013y?'Yɞ$_<X\u000e\u0014--e\f\fsVb\u000bQn\u000e?+}f{d\u0014(\u0006~\u0014\u001bL\u0006\u001e\u0006UK>/*f6\rIs!X\u0007ї\u0001ެF\u007f\ts~(3\u0013K+g\u001c\u0017WoO1PMz3\fdƗ\u00027'ii&b+\u001a\u0003v\u001a8_VUH|! ǴlLwp\u001aB\u0004^JFÒzaA%%O]O\"OlɘLLov\u0013i\u0001UoYVHr\f$;B\u0017\u001c\\Td3n`Vh,?L2S5\u0003ݔ\u0017&dɼT#+\u001a\\Z9xxOu\nS2Ϭ;_v\u0088&Y?jABɊg*"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi$m%>ZL7h;\u001e\u0006dhI\u00079", "", "0n^9X(GD\u0015\u0006\u000b^", "", "@`f\u0017f6G", "", ";`_#T3NS", "", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g%we@PK(YLj8", "5dc\u000fb6ES\u0015\bkZ3\r\t", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "5dc\u001aT7/O \u000fz", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc\u001fT>#a#\b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g%we@PK(YLj.JX4&`\u00029# ^\u0010\u0018'\u0016\u0004fK(mR6%Q,Z}Bx|\u001b \u001b~WpQf\u001dPu\u0012|A\u001adMi_O", "3pd._:", "=sW2e", "5dc#T3NS", "6`b566=S", "", "BnBAe0GU", "\u0011tbAb4,S&\u0003ve0\u0012\t<", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class ReturnableValue {
    private final Boolean booleanValue;
    private final Map<String, Object> mapValue;
    private final String rawJson;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:%c$\bCC٥ Ԃ8ޛ\u007fTwi~J\t\u000bq\u000e6\u001c\tl<I\u0004x\f\u0013O5Բs?AO8aGc\r63 b(F}\u001d\u00030)v\u0015'\u0001QQ$\u0014F?\u001fA\u0003\u0013[\r2\u0014\u001c=N\ndp0rDR\u0005]h4S\twMf)u/+M=Lb3%xw\u001dYGg;#-k\u0005\u001dQ\nLISѥA\u0013"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi$m%>ZL7h;\u001e\u0006dhI\u0007\"\n^\u00056QT<,iVnD\u0018'Z\u001b$", "\u001ab^:\".H]\u001b\u0006z(.\u000b\u00138/d6\u0006I_\u0017%G|\u00128})JY\u000bu", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`G\u0001\nC\u0007!Dc\u000bi$m%>ZL7h;\u001e\u0006dhI\u00079", "\u001ab^:\".H]\u001b\u0006z(.\u000b\u00138/d6\u0006In\u0017$Kk\u0015@\f%B/", "u(E", "2db2e0:Z\u001d\u0014z", "8r^;", "\u001ab^:\".H]\u001b\u0006z(.\u000b\u00138/d6\u0006I`\u001e\u0017Oo\u0017KL", "Bx_2B--", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqjT\f\u0017l", "1n]AX?M", "\u001ab^:\".H]\u001b\u0006z(.\u000b\u00138/d6\u0006I_\u0017%G|\u00128})JU\r$Avs8VR;~Cs", "Ada6T3Bh\u0019", "AqR", "Bx_2B-,`\u0017", "\u001ab^:\".H]\u001b\u0006z(.\u000b\u00138/d6\u0006In\u0017$Kk\u0015@\f!D]\b)\u0015w\u001f=MVJA", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class CustomSerializer implements JsonDeserializer<ReturnableValue>, JsonSerializer<ReturnableValue> {
        @Override // com.google.gson.JsonDeserializer
        public ReturnableValue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            if (jsonElement == null) {
                return new ReturnableValue(null, null, null, 7, null);
            }
            if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isBoolean()) {
                Boolean boolValueOf = Boolean.valueOf(jsonElement.getAsJsonPrimitive().getAsBoolean());
                String string = jsonElement.toString();
                Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
                return new ReturnableValue(boolValueOf, string, null);
            }
            if (!jsonElement.isJsonObject()) {
                return new ReturnableValue(null, null, null, 7, null);
            }
            Map mapEmptyMap = jsonDeserializationContext == null ? null : (Map) jsonDeserializationContext.deserialize(jsonElement.getAsJsonObject(), Map.class);
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            String string2 = jsonElement.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "json.toString()");
            return new ReturnableValue(null, string2, mapEmptyMap);
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(ReturnableValue returnableValue, Type type, JsonSerializationContext jsonSerializationContext) {
            if (returnableValue == null) {
                JsonNull INSTANCE = JsonNull.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
                return INSTANCE;
            }
            JsonElement string = JsonParser.parseString(returnableValue.getRawJson());
            Intrinsics.checkNotNullExpressionValue(string, "parseString(src.rawJson)");
            return string;
        }
    }

    public ReturnableValue() {
        this(null, null, null, 7, null);
    }

    public ReturnableValue(Boolean bool, String rawJson, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(rawJson, "rawJson");
        this.booleanValue = bool;
        this.rawJson = rawJson;
        this.mapValue = map;
    }

    public /* synthetic */ ReturnableValue(Boolean bool, String str, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : bool, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? "null" : str, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnableValue copy$default(ReturnableValue returnableValue, Boolean bool, String str, Map map, int i2, Object obj) {
        if ((1 & i2) != 0) {
            bool = returnableValue.booleanValue;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str = returnableValue.rawJson;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            map = returnableValue.mapValue;
        }
        return returnableValue.copy(bool, str, map);
    }

    public final Boolean component1() {
        return this.booleanValue;
    }

    public final String component2() {
        return this.rawJson;
    }

    public final Map<String, Object> component3() {
        return this.mapValue;
    }

    public final ReturnableValue copy(Boolean bool, String rawJson, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(rawJson, "rawJson");
        return new ReturnableValue(bool, rawJson, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReturnableValue)) {
            return false;
        }
        ReturnableValue returnableValue = (ReturnableValue) obj;
        return Intrinsics.areEqual(this.booleanValue, returnableValue.booleanValue) && Intrinsics.areEqual(this.rawJson, returnableValue.rawJson) && Intrinsics.areEqual(this.mapValue, returnableValue.mapValue);
    }

    public final Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public final Map<String, Object> getMapValue() {
        return this.mapValue;
    }

    public final String getRawJson() {
        return this.rawJson;
    }

    public final Object getValue() {
        Boolean bool = this.booleanValue;
        if (bool != null) {
            return bool;
        }
        Map<String, Object> map = this.mapValue;
        if (map != null) {
            return map;
        }
        return null;
    }

    public int hashCode() {
        Boolean bool = this.booleanValue;
        int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + this.rawJson.hashCode()) * 31;
        Map<String, Object> map = this.mapValue;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "ReturnableValue(booleanValue=" + this.booleanValue + ", rawJson=" + this.rawJson + ", mapValue=" + this.mapValue + ')';
    }
}
