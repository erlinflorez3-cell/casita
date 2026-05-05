package com.braze.models;

import bo.app.px;
import bo.app.qx;
import bo.app.rx;
import bo.app.sx;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r.4\u0012}\bnjG2LeN.ZS8\u0018s{:'c$\u007fJCU \u0003*\t]Ȟogt``\u0010YƤ$D)r<Mezs\u0011=2pnw2|0h?ś\u0005:\u0013?J\"f|\u0015\u0005(M`\u0010%\u0005SO\u001a9H@\u001f:b\u0015S\u0005(<\u001e@6\u007fL_ʄR8N\u0019kgw0\u0011jZNU_v\u0011֔\u0011HZ(\u001bx*39EO7+$\u0002\u00067ViC\u001b? @ݾl)-0Wy Kf\b,\u0017AN;d#*j\ti`:*˦SeQX\u001c1@\u0010\n\u0018T\u0006$\u0005UR^1(j \u000eawɤWBV\rlNH\u0010oC/'\u00162Y9Kj_eS\u0019|:߉\t\u000f$0\u000f|ipb\u001dx\u00171S&TaUNA`N8\\ǀq\u0006vq\u00100LGU\u0011G}'-E5g_G'9k0K\u000blЛ\tbndwd\u0011U0\u0002.9@\b:jth\u0013ohT\u0007/ҭQ\u001eZ\u001a\f\u001a[-j\u000eT!Sī\u0015иŹmlSq\u0018:w\u0006Et\u0007m$Vgvc9_g(a\u0001yDCJy\u001dX\u0015E\u001aێȺ`*(KV\u0005X\r\nbf\fA<ou*8D1G_[ǽҴ\"DG\u0019\u0017|+}\u001e\u001el3R\u0006 (ڲ\r\u000bX^v\u000fu\u0019a.\u0003\u00020O\u0012fC<>UPrj\u0001ɠ\u000b\t{\u0002M\u000bZkdn\u001c\u001bc\"p+(`i/k\u0013E\u0003Ȟ6\f5GR\u001asye\u0014-$\u000b{_UvX\u007f\n\u0001oZc!\u07ba&ܸ\u0019Ȕzhz%\u000e\u000f\u000e\u001ayH\u0001rqvߕ_n"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI\t{<\u0010'$GP\u00158xz", "\u001ab^:\")KO.~Df6{\t6sI\ffP\u0010z VyrJ\u0001.\u000b", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "4na\u0017f6G>)\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "", "9dh", "5dc g9B\\\u001bi\bh7|\u0016>y", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "", "5dc\u001bh4;S&i\bh7|\u0016>y", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~B\u000e(4m#\u0004", "", "5dc\u000fb6ES\u0015\bek6\b\t<t\u0014", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~6\b*>m\u00127#", "5dc\u0017F\u0016'>&\t\u0006^9\f\u001d", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u000b$\u0019\u0011t\u001cF\u007fn\u001aGg\t!j\u001b.KR\u0011", "5dc\u0016`(@S\u0004\f\u0005i,\n\u0018C", "", "5dc!\\4>a(z\u0003i", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~@\b)9C", "5dc!\\4>a(z\u0003i\u0017\n\u0013:e\r7\u0010", "2dT=V6IgWz\u0004]9\u0007\r._\u000e'\u0002:}\u0013%Gi\u001b<}%1g}", "u(;0b4\bP&z\u0010^u\u0005\u0013.e\u00076E!\u0001\u0013&W|\u000e\u001d}!7/", "2dT=V6Ig", "3w_2V;>R\u0004\f\u0005i,\n\u0018CT\u00143{", "", "5dc#T3NSWz\u0004]9\u0007\r._\u000e'\u0002:}\u0013%Gi\u001b<}%1g}", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq4H7|0g\u001cdj;PM)Sv%V\"", "5dc#T3NS", "2nT@>,R3,\u0003\tmjx\u0012.r\n,z:\u000f\u0016\u001dAl\nJv\u001fBY\u0005 3{\u0016", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?5", "2nT@>,R3,\u0003\tm", "7c", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0016W", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "3mP/_,=", "(", "5dc\u0012a(;Z\u0019}", "u(I", ">q^=X9MW\u0019\r", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "5dc\u001de6IS&\u000e~^:", "BqP0^0GU\u0007\u000e\bb5~", "5dc!e(<Y\u001d\b|L;\n\r8g>$\u0005?\u000e!\u001bFi\u001c;|\u001f2U\f 1z\u00165M?Ik", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p'\u000b$\u0019\u0011t\u001cF\u007fn\u001aGg\t!j\u001b.KR\u0011R9\u001a&d+@\u0003l.\u0018d6TPW.2\u0016c", "\u0011n\\=T5B]\"", "0n\u001e.c7\b^,", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class FeatureFlag implements IPutIntoJson<JSONObject> {
    public static final px Companion = new px();
    public static final String ENABLED = "enabled";
    public static final String ID = "id";
    public static final String PROPERTIES = "properties";
    public static final String PROPERTIES_TYPE = "type";
    public static final String PROPERTIES_TYPE_BOOLEAN = "boolean";
    public static final String PROPERTIES_TYPE_DATETIME = "datetime";
    public static final String PROPERTIES_TYPE_IMAGE = "image";
    public static final String PROPERTIES_TYPE_JSON = "jsonobject";
    public static final String PROPERTIES_TYPE_NUMBER = "number";
    public static final String PROPERTIES_TYPE_STRING = "string";
    public static final String PROPERTIES_VALUE = "value";
    public static final String TRACKING_STRING = "fts";
    private final boolean enabled;
    private final String id;
    private final JSONObject properties;
    private final String trackingString;

    public FeatureFlag(String id, boolean z2, JSONObject properties, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.id = id;
        this.enabled = z2;
        this.properties = properties;
        this.trackingString = str;
    }

    public /* synthetic */ FeatureFlag(String str, boolean z2, JSONObject jSONObject, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z2, jSONObject, (i2 + 8) - (i2 | 8) != 0 ? null : str2);
    }

    public final FeatureFlag deepcopy$android_sdk_base_release() {
        return new FeatureFlag(this.id, this.enabled, JsonUtils.deepcopy(this.properties), this.trackingString);
    }

    public final boolean doesKeyExist$android_sdk_base_release(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.properties.has(key)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new qx(key, this), 6, (Object) null);
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("enabled", this.enabled);
            jSONObject.put(PROPERTIES, this.properties);
            jSONObject.put(TRACKING_STRING, this.trackingString);
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) rx.f1713a, 4, (Object) null);
        }
        return jSONObject;
    }

    public final Boolean getBooleanProperty(String key) throws JSONException {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value$android_sdk_base_release = getValue$android_sdk_base_release(key, "boolean");
        if (value$android_sdk_base_release instanceof Boolean) {
            return (Boolean) value$android_sdk_base_release;
        }
        return null;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageProperty(String key) throws JSONException {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value$android_sdk_base_release = getValue$android_sdk_base_release(key, PROPERTIES_TYPE_IMAGE);
        if (value$android_sdk_base_release instanceof String) {
            return (String) value$android_sdk_base_release;
        }
        return null;
    }

    public final JSONObject getJSONProperty(String key) throws JSONException {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value$android_sdk_base_release = getValue$android_sdk_base_release(key, PROPERTIES_TYPE_JSON);
        if (value$android_sdk_base_release instanceof JSONObject) {
            return (JSONObject) value$android_sdk_base_release;
        }
        return null;
    }

    public final Number getNumberProperty(String key) throws JSONException {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value$android_sdk_base_release = getValue$android_sdk_base_release(key, PROPERTIES_TYPE_NUMBER);
        if (value$android_sdk_base_release instanceof Number) {
            return (Number) value$android_sdk_base_release;
        }
        return null;
    }

    public final JSONObject getProperties() {
        return this.properties;
    }

    public final String getStringProperty(String key) throws JSONException {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value$android_sdk_base_release = getValue$android_sdk_base_release(key, "string");
        if (value$android_sdk_base_release instanceof String) {
            return (String) value$android_sdk_base_release;
        }
        return null;
    }

    @Deprecated(message = "\u0018Y\u0001txy)KaT-\u000ed\u00169^L^\u00187\nz k6O|}by%j", replaceWith = @ReplaceWith(expression = "getTimestampProperty(key)", imports = {}))
    @InterfaceC1492Gx
    public final Long getTimestamp(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getTimestampProperty(key);
    }

    public final Long getTimestampProperty(String key) throws JSONException {
        Intrinsics.checkNotNullParameter(key, "key");
        Object value$android_sdk_base_release = getValue$android_sdk_base_release(key, PROPERTIES_TYPE_DATETIME);
        if (value$android_sdk_base_release instanceof Long) {
            return (Long) value$android_sdk_base_release;
        }
        return null;
    }

    public final String getTrackingString$android_sdk_base_release() {
        return this.trackingString;
    }

    public final Object getValue$android_sdk_base_release(String key, String expectedPropertyType) throws JSONException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(expectedPropertyType, "expectedPropertyType");
        if (!doesKeyExist$android_sdk_base_release(key)) {
            return null;
        }
        Object obj = this.properties.get(key);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject = (JSONObject) obj;
        Object obj2 = jSONObject.get("type");
        if (Intrinsics.areEqual(obj2, expectedPropertyType)) {
            return jSONObject.get("value");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new sx(expectedPropertyType, obj2), 6, (Object) null);
        return null;
    }
}
