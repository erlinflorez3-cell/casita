package com.biocatch.client.android.sdk.collection.collectors.gestures;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r)4\u0012}\u0007njG5LeN;ZS@\u000fsڔ:řqҕ\"CiTZ92\r]N\u007fg\u001dKj\u000fQ\u0011\u001e\u0016'm<Mc|u\u0012=5RsM8eok?pxD\f82P>\n\t\u000f\"BH>|\u000bGY\u0015*0nvĐV\r[\u000fb\u0018\u0014S8\u0001Lr.b\u0007Wz]R/Q\u0004ݦFT/ڿH~S\u0018T`w\u001c\u0005c6+n:߱\u0019+[Έ\u001fTaL\u0011MBL\u0013m?'YOָ[<`Ü,\u00171^\u001bmC5j\fi`:-˦SiSִ&*}\f\n\u001d\r\u0013\u001c\n?H\\0բj\u000e\u0016ޗ\rtYR^\u0010/Q\u000e\u0003y6E+ő71Aӕ~SgN'^\b\u000b\u0013\u00166#/tĲ_Z\u0016֫-\u001dZ\f_AҮDT"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[;\u0015R4\u000fdjA-},A\u001e\b3\u001f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]AX?M7w", "", "3uT;g\u0010\u001d", "", "Bh\\2f;:[$", "AsP?g\u001f", "", "AsP?g ", "Dd[<V0Mg\f", "Dd[<V0Mg\r", "uH9\u00179\r\u001f4\\o", "5dc\u0010b5MS,\u000e^=", "u(8", "5dc\u0012i,Gb|]", "u(9", "5dc g(Kb\f", "u(5", "5dc g(Kb\r", "5dc!\\4>a(z\u0003i", "5dc#X3HQ\u001d\u000e\u000fQ", "5dc#X3HQ\u001d\u000e\u000fR", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class FlingEventModel extends CollectionItem {
    private final int contextID;
    private final long eventID;
    private final float startX;
    private final float startY;
    private final long timestamp;
    private final float velocityX;
    private final float velocityY;

    public FlingEventModel(int i2, long j2, long j3, float f2, float f3, float f4, float f5) {
        this.contextID = i2;
        this.eventID = j2;
        this.timestamp = j3;
        this.startX = f2;
        this.startY = f3;
        this.velocityX = f4;
        this.velocityY = f5;
    }

    public final int getContextID() {
        return this.contextID;
    }

    public final long getEventID() {
        return this.eventID;
    }

    public final float getStartX() {
        return this.startX;
    }

    public final float getStartY() {
        return this.startY;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getVelocityX() {
        return this.velocityX;
    }

    public final float getVelocityY() {
        return this.velocityY;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.contextID);
        jSONArray.put(this.eventID);
        jSONArray.put(this.timestamp);
        jSONArray.put(this.startX);
        jSONArray.put(this.startY);
        jSONArray.put(this.velocityX);
        jSONArray.put(this.velocityY);
        return jSONArray;
    }
}
