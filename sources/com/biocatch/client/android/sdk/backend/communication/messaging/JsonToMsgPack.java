package com.biocatch.client.android.sdk.backend.communication.messaging;

import com.biocatch.client.android.sdk.wrappers.MessagePackFactory;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.msgpack.core.MessageBufferPacker;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\"\u007fјnjO0Le^.Zݷ2\u000fy{<řc$\bCCU \u007f(ޛeȞ\u0018g\u001dI\u001b\u0016S\u0013\u0014\u0016\u0011jZJǤ|] \u0011zN}BKM\u001eAid\u0003;\u001d `(\u0001\u0006\u0013\u00042*v\u0014'~QP$\u0012^G9N`\u0015e\u0005H\u001b6B.\u000b6\\\u0016YfLzbR/Q\t2V\\3w0+V=Jb1%v\u0010)[DE:-%\u0002\nOfiL\u001b? F5l51CI\"bf\\\u000e\"-+}\f.~4\\\u001dQ\u000f\r}ˆQӍOP\u0016ߊä~\u000b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$r\\5\u0016sc)2p/3\u001d\u000e\u0002", "", ";db@T.>>\u0015|\u0001?(z\u00189r\u0014", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u001c\u001e#v];\u0007N(L|\bCJ]6ifH", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iIz\u00129XCHy}\u0006\u0015vo5\tc\u0017Jt-(HL;f_\u0007\u0013W\u0003", "1n]CX9M", "", "2`c.", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", ">`R8=\bK`\u0015\u0013", "", ">`R8X9", "\u001ana4\"4LU$zxduz\u0013<eI\u0010{N\u000f\u0013\u0019GL\u001e=w%BDy\u001e=m#\u0004", ">`R8=\u0016;X\u0019|\n", ">`R8C9B[\u001d\u000e~o,", "D`[BX", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class JsonToMsgPack {
    private final MessagePackFactory messagePackFactory;

    public JsonToMsgPack(MessagePackFactory messagePackFactory) {
        Intrinsics.checkNotNullParameter(messagePackFactory, "messagePackFactory");
        this.messagePackFactory = messagePackFactory;
    }

    public final byte[] convert(JSONArray data) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        MessageBufferPacker messageBufferPackerNewDefaultBufferPacker = this.messagePackFactory.newDefaultBufferPacker();
        packJArray(messageBufferPackerNewDefaultBufferPacker, data);
        messageBufferPackerNewDefaultBufferPacker.close();
        byte[] byteArray = messageBufferPackerNewDefaultBufferPacker.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "packer.toByteArray()");
        return byteArray;
    }

    public final byte[] convert(JSONObject data) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        MessageBufferPacker messageBufferPackerNewDefaultBufferPacker = this.messagePackFactory.newDefaultBufferPacker();
        packJObject(messageBufferPackerNewDefaultBufferPacker, data);
        messageBufferPackerNewDefaultBufferPacker.close();
        byte[] byteArray = messageBufferPackerNewDefaultBufferPacker.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "packer.toByteArray()");
        return byteArray;
    }

    public final void packJArray(MessageBufferPacker packer, JSONArray data) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(packer, "packer");
        Intrinsics.checkNotNullParameter(data, "data");
        packer.packArrayHeader(data.length());
        int length = data.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object objOpt = data.opt(i2);
            if (objOpt instanceof JSONObject) {
                packJObject(packer, (JSONObject) objOpt);
            } else if (objOpt instanceof JSONArray) {
                packJArray(packer, (JSONArray) objOpt);
            } else if (objOpt != null) {
                packPrimitive(packer, objOpt);
            } else {
                packer.packNil();
            }
        }
    }

    public final void packJObject(MessageBufferPacker packer, JSONObject data) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(packer, "packer");
        Intrinsics.checkNotNullParameter(data, "data");
        packer.packMapHeader(data.length());
        Iterator<String> itKeys = data.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            packer.packString(next);
            Object value = data.get(next);
            if (value instanceof JSONArray) {
                packJArray(packer, (JSONArray) value);
            } else if (value instanceof JSONObject) {
                packJObject(packer, (JSONObject) value);
            } else {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                packPrimitive(packer, value);
            }
        }
    }

    public final void packPrimitive(MessageBufferPacker packer, Object value) throws IOException {
        Intrinsics.checkNotNullParameter(packer, "packer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof String) {
            packer.packString((String) value);
            return;
        }
        if (value instanceof Integer) {
            packer.packInt(((Number) value).intValue());
            return;
        }
        if (value instanceof Boolean) {
            packer.packBoolean(((Boolean) value).booleanValue());
        } else if (value instanceof Double) {
            packer.packDouble(((Number) value).doubleValue());
        } else {
            if (!(value instanceof Long)) {
                throw new IOException("Invalid packing value of type " + value.getClass().getName());
            }
            packer.packLong(((Number) value).longValue());
        }
    }
}
