package com.statsig.androidsdk;

import java.util.LinkedHashMap;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>.6B\r.4ߚ\u007f\u0007t\rAӄLeV7ZS0\u000fs{J$cҕwژ;kڼ.\"7N\u000flmnН^\u000bQ\u000fN<\u0007kDWezm\u0012=5RsO5cnk<\u000fvf\u0013.6:B\n\u0005\u0007\u001b:H\u0016w\u0011By\u0011X0\t\u0011HX%M3!B\u0016L(\u0019*li^6vom<?#1hpSWc>\u0006e\rt^ܴ\u0011\u0002"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`$y\u0018K\u00054BU\t\u00113t\u001a-IREx\n", "", "u(E", "5dc\"f,K7\u0018~\u0004m0}\r/r", "", "", "1tbAb4\"2'", "", "7rE._0=", "", "7mXA\\(EW.~kZ3\r\t=", "CrT?", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class BootstrapValidator {
    public static final BootstrapValidator INSTANCE = new BootstrapValidator();

    private BootstrapValidator() {
    }

    private final Map<String, String> getUserIdentifier(Map<?, ?> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map == null) {
            return linkedHashMap;
        }
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (!Intrinsics.areEqual(key, "stableID") && (key instanceof String)) {
                Object value = entry.getValue();
                if (value == null ? true : value instanceof String) {
                    linkedHashMap.put(key, value);
                } else if (value instanceof Map) {
                    linkedHashMap.putAll(getUserIdentifier((Map) value));
                }
            }
        }
        return linkedHashMap;
    }

    public final boolean isValid(Map<String, ? extends Object> initializeValues, StatsigUser user) {
        Intrinsics.checkNotNullParameter(initializeValues, "initializeValues");
        Intrinsics.checkNotNullParameter(user, "user");
        try {
            Object obj = initializeValues.get("evaluated_keys");
            Map<?, ?> map = obj instanceof Map ? (Map) obj : null;
            if (map == null) {
                return true;
            }
            Map<String, String> userIdentifier = getUserIdentifier(user.getCustomIDs());
            if (user.getUserID() != null) {
                userIdentifier.put("userID", user.getUserID());
            }
            return Intrinsics.areEqual(userIdentifier, getUserIdentifier(map));
        } catch (Exception unused) {
            return true;
        }
    }
}
