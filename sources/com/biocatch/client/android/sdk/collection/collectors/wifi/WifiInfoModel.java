package com.biocatch.client.android.sdk.collection.collectors.wifi;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import kotlin.Metadata;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r)4\u0012}\u0007njG<LeN9ZS@\u000fsڔ:řqҕ\"CiTZ72\r]N\u007fg\u001dKj\u000fQ\u0011\u001e\u0016'm<Mc|u\u0012=5RuM8eqS8\u000fzF\u000b.9::\u0010\u0004/ :N\u001e~\u0013Ea\u000b@6Ϯt:`\u0016\u0016\u000b(%\u001e>N\u0015dp8_DO\u0005_P.Q\tݦFT/ڿH~S\u0017T_w\u001c\u0005a6+n8߱\u0019+[Έ\u001fTaK\u0011LBL\u0013j?'YLָ[<`Ü,\u00171]\u001blC7j\rib\"&YUӍOV\u0016ߊ\u0010|\u0002\u001dJ\u000f^\u00175MF/0e6\u0014\u07baxx[óh\u0004dS\u000e\u00062E%)\u00183Y<ӸjWiݢ1P=\u000e\u0013\u001c̽'\u0016"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011^R-`\u001cdA\u0015\u0016>\u0017O5t\u000fXA+D", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]AX?M7w", "", "3uT;g\u0010\u001d", "", "Bh\\2f;:[$", "ArX1", "", "0rb6W", "7o", "uH9\u0017?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019\"p0/\u00112h5\u0010eu<\u00064KUP\u0002 C", "5dc\u000ff:BR", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010b5MS,\u000e^=", "u(8", "5dc\u0012i,Gb|]", "u(9", "5dc\u0016c", "5dc f0=", "5dc!\\4>a(z\u0003i", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WifiInfoModel extends CollectionItem {
    private final String bssid;
    private final int contextID;
    private final long eventID;
    private final String ip;
    private final String ssid;
    private final long timestamp;

    public WifiInfoModel(int i2, long j2, long j3, String str, String str2, String str3) {
        this.contextID = i2;
        this.eventID = j2;
        this.timestamp = j3;
        this.ssid = str;
        this.bssid = str2;
        this.ip = str3;
    }

    public final String getBssid() {
        return this.bssid;
    }

    public final int getContextID() {
        return this.contextID;
    }

    public final long getEventID() {
        return this.eventID;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getSsid() {
        return this.ssid;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.contextID);
        jSONArray.put(this.eventID);
        jSONArray.put(this.timestamp);
        jSONArray.put(this.ssid);
        jSONArray.put(this.bssid);
        jSONArray.put(this.ip);
        return jSONArray;
    }
}
