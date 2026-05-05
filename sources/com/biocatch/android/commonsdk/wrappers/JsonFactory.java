package com.biocatch.android.commonsdk.wrappers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\u0013nj?0Le^.ZS0\u0011\u0002ڔd$\n#2FтY\u001a\f\"Qc\\h\u007fnx\\;G\u001d\t.x\u0019.yY\u0007a*\u000f`G8SAN\b=gb%:\u0013#J\"f{5\u0005(.`\u0010%|\fa\u001a\u0018H@\u001f<\u0003\u0011[\b2\u00124@P\u0005,`\u007fNdJ3]\u000331\n\u0002B|/(4\u000bV%F\u0003)U\u0003o(C@e7E)a\u000e\u001fR\nDƊC}"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0010-3x!.ZQ\u0005PB(\u001eI]7\u0016m9bL", "", "u(E", "/o_2a+\u001fZ\u0015\u000e\n^5|\b", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "B`a4X;", "And?V,", "", "/o_2a+\u001fZ\u0015\u000e\n^5|\b\u0013n\t(\t", "1qT.g,#/&\fvr", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "1qT.g,#a#\b", ">`a@X\u0011L]\"", "8r^;", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class JsonFactory {
    private final JSONObject appendFlattenedInner(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONArray jSONArrayNames = jSONObject2.names();
        if (jSONArrayNames == null) {
            return jSONObject;
        }
        int length = jSONArrayNames.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArrayNames.getString(i2);
            Object obj = jSONObject2.get(string);
            if (obj instanceof JSONObject) {
                appendFlattenedInner(jSONObject, (JSONObject) obj);
            } else {
                jSONObject.put(string, obj);
            }
        }
        return jSONObject;
    }

    public final JSONObject appendFlattened(JSONObject target, String source) throws JSONException {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(source, "source");
        return appendFlattened(target, parseJson(source));
    }

    public final JSONObject appendFlattened(JSONObject target, JSONObject source) throws JSONException {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(source, "source");
        return appendFlattenedInner(new JSONObject(target.toString()), source);
    }

    public final JSONArray createJArray() {
        return new JSONArray();
    }

    public final JSONObject createJson() {
        return new JSONObject();
    }

    public final JSONObject parseJson(String json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        return new JSONObject(json);
    }
}
