package com.biocatch.client.android.sdk.collection.collectors.sensors.location;

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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r)4\u0012}\u0007njG4LeN/ZS8\u0014sڔ<$i0yCAb\"}8\tWȞm˧\u0005Ϻ\u000b\u000bq\u000eF[\tn:Imx\f\u0013\u001f6PqW3{rM=nxN\u0005N52<\b\n\u0019\u001aXN z\tJc\f@6PtHZ%M3 \"\nL)\u0019\u001e\u000bq^<Vwu<E\"1uŌR'm=ES\u001bal';\u0013(2{OE=-%\u0002\t\u07baVaGšWsC\u0013v6w:Wso6\u0007\u0001Џ\u00191WՕut,l\u0013b1\u001b5-gcySˎ,}\u0003Ԉ%>\n \u0014:\u0019=;!~\b<9ϢvYHА\u001a`H\u0014\tp\u0007&3\u0005K+g!ƻUgCϊf9\u0002\u001a\u001b-s\u0012|,sV$_C'ƻ{W9҅X?Nd\u0018p\u000e|\u0012yz\u0002X\u000eΥK\u00067Ʌ)0\u001d=Et\n2/o\u001aHrjЛ\tfpׅ\u0002TNZ0\u0002ޔ;G"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u0019d\fJ:\u0011\u000fb\u000b\u000bxB3.\f6RaLh\n\u001b}\u00184jw\u0018", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]AX?M7w", "", "3uT;g\u0010\u001d", "", "Bh\\2f;:[$", ":n]4\\;NR\u0019", "", ":`c6g<=S", "/bRBe(<g", "AoT2W", "", ">q^C\\+>`", "", "uH9\u00177\u000b\u001d4\u007f\u0004vo(F\u0010+n\u0002qiO\u000e\u001b IEQ-", "5dc\u000eV*N`\u0015|\u000f", "u(3", "5dc\u0010b5MS,\u000e^=", "u(8", "5dc\u0012i,Gb|]", "u(9", "5dc\u0019T;Bb)}z", "5dc\u0019b5@W(\u000fy^", "5dc\u001de6OW\u0018~\b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc c,>R", "u(5", "5dc!\\4>a(z\u0003i", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LocationEventModel extends CollectionItem {
    private final double accuracy;
    private final int contextID;
    private final long eventID;
    private final double latitude;
    private final double longitude;
    private final String provider;
    private final float speed;
    private final long timestamp;

    public LocationEventModel(int i2, long j2, long j3, double d2, double d3, double d4, float f2, String str) {
        this.contextID = i2;
        this.eventID = j2;
        this.timestamp = j3;
        this.longitude = d2;
        this.latitude = d3;
        this.accuracy = d4;
        this.speed = f2;
        this.provider = str;
    }

    public final double getAccuracy() {
        return this.accuracy;
    }

    public final int getContextID() {
        return this.contextID;
    }

    public final long getEventID() {
        return this.eventID;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.contextID);
        jSONArray.put(this.eventID);
        jSONArray.put(this.timestamp);
        jSONArray.put(this.longitude);
        jSONArray.put(this.latitude);
        jSONArray.put(this.accuracy);
        jSONArray.put(this.speed);
        jSONArray.put(clearNull(this.provider));
        return jSONArray;
    }
}
