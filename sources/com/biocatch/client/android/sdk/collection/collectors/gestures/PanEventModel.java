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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r)4\u0012}\u0007njG5LeN.ZS8\u0013s{:0c$\bCC٥ Ԃ8ޛ\u007fN\u0016f/\u0006j\u000fQ\u000f\u001e\u0016'k<Mczu\u0012=5RsM7eok<pxD\n82P>\n\t\u000f!BH>|\u000bGY\u0014*0nyJV\u001bW\u001d\u001a@\u000f̧$\u0001,g0TD_\u0005]hGi\u0017:Q\\'w0+NϘJZ/˙\u000fc$7ND\u0006$3[\u001b\u0007\u0001dύ\u0007Eyܵ\u001dj-59XDfDb\u0018\u0014C4̠\u0011cz̦t\u0007Wp\u001a6{^qMh\u000eVzߡ\u007f\u0013Dǉ&\b-Y<?ju\u0016\u0012Kt!VĖT\bfۍ\u0018|gI%7PB9>3f\u007fgޅ\u001dT?ަ\u001d\u000f$7\u000f\u0004qjb\u0015x\u0015IZɐU7Y̵UJT gRѐ\b\n"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[E\nW\u000b\u001e\u0005bP\fxC7&]", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]AX?M7w", "", "3uT;g\u0010\u001d", "", "Bh\\2f;:[$", "BqX4Z,KF", "", "BqX4Z,KG", "2hbAT5<S\f", "", "2hbAT5<S\r", "uH9\u00179\r\u001d2\\o", "5dc\u0010b5MS,\u000e^=", "u(8", "5dc\u0011\\:MO\"|zQ", "u(3", "5dc\u0011\\:MO\"|zR", "5dc\u0012i,Gb|]", "u(9", "5dc!\\4>a(z\u0003i", "5dc!e0@U\u0019\fm", "u(5", "5dc!e0@U\u0019\fn", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class PanEventModel extends CollectionItem {
    private final int contextID;
    private final double distanceX;
    private final double distanceY;
    private final long eventID;
    private final long timestamp;
    private final float triggerX;
    private final float triggerY;

    public PanEventModel(int i2, long j2, long j3, float f2, float f3, double d2, double d3) {
        this.contextID = i2;
        this.eventID = j2;
        this.timestamp = j3;
        this.triggerX = f2;
        this.triggerY = f3;
        this.distanceX = d2;
        this.distanceY = d3;
    }

    public final int getContextID() {
        return this.contextID;
    }

    public final double getDistanceX() {
        return this.distanceX;
    }

    public final double getDistanceY() {
        return this.distanceY;
    }

    public final long getEventID() {
        return this.eventID;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getTriggerX() {
        return this.triggerX;
    }

    public final float getTriggerY() {
        return this.triggerY;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.contextID);
        jSONArray.put(this.eventID);
        jSONArray.put(this.timestamp);
        jSONArray.put(this.triggerX);
        jSONArray.put(this.triggerY);
        jSONArray.put(this.distanceX);
        jSONArray.put(this.distanceY);
        return jSONArray;
    }
}
