package com.biocatch.client.android.sdk.backend.communication;

import com.biocatch.android.commonsdk.wrappers.JsonFactory;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007f\u0007ljA0ZeP\u008cZS8\u001bs{:&aҕ\bّkUH|b\u0014_Rug\u0007J\t\fß\u0013\u0006$z3]WX\u0011]@\u0013RDuЀAR AGf\r63'b&F\u0002\u001d\u0001H3x\u0016\u0005\u0005[M\"\u0011vE!>`\u0018e\u0005H\u001bĂB \u000f*-s\\6`l\f;\u0006ݍ\u0005ݦFN/ڿ݇\u0001Z"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011>^7A`|Fo\u001de\u000eW*\r\u0012/", "", "8r^;9(<b#\f\u000f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0010-3x!.ZQ\u0005PB(\u001eI]7\u0016m9bL", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G2Di!9MPI5\u0019,\u001fqB5\u0005r6[\u000b|\u000b=", "/o_2a+\u001dO(z", "", "\"", "/fV?X.:b\u0019}YZ;x", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "4hT9W\u0015:[\u0019", "", "4hT9W\u001d:Z)~", "4hT9W\u000eK])\n", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019\"p0/\u00112h5\u0010eu8s,GJ]\u0002CWnN\u0010[a\nW-VrhN(wF\rbx", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WupJsonAppender {
    private final JsonFactory jsonFactory;

    public WupJsonAppender(JsonFactory jsonFactory) {
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        this.jsonFactory = jsonFactory;
    }

    public final <T> void appendData(JSONObject aggregatedData, String fieldName, T t2, String fieldGroup) throws JSONException {
        Intrinsics.checkNotNullParameter(aggregatedData, "aggregatedData");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Intrinsics.checkNotNullParameter(fieldGroup, "fieldGroup");
        if (t2 == null) {
            return;
        }
        if (!aggregatedData.has(fieldGroup)) {
            aggregatedData.put(fieldGroup, this.jsonFactory.createJArray());
        }
        JSONArray jSONArrayCreateJArray = this.jsonFactory.createJArray();
        jSONArrayCreateJArray.put(fieldName);
        jSONArrayCreateJArray.put(t2);
        aggregatedData.accumulate(fieldGroup, jSONArrayCreateJArray);
    }
}
