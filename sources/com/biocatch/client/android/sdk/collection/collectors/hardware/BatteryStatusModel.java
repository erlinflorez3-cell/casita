package com.biocatch.client.android.sdk.collection.collectors.hardware;

import com.biocatch.client.android.sdk.collection.StaticCollectionItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r)4\u0012}\u0007njG5L͜P.`\\2şs{J$c$wMCU0}*ޛUȞ}˧\u001fJ\t\n\u0004B\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom6]sK=xtd\b060=\u0012\u0005/ :L\u001e}\u0013Cy\u0014\"4NyRR;Wŋ\u001e\u0012\u0014Ih\u0007,r\u007fNd_3q\u000b>1\b\u0002B|-ۢ4\u0003Uε^V-\u0019\u0005nn:N7M\u0015STΫ\u000bXcΪ\u001bAwK\u0013ww69K\fWd[ÿ\u0018\u001b3˽%_x6j\u0016\"o\u001a.CO\u0012Sח\u0012.\u007f\u07be\u0014\u000fB\u000b\u001c\u0018wW<62f6\u0018\u07baxx[óh\u0004dU\u000e\u000f2E%)\u00183Y<ӸjWiݢ1P=\u0011\u0013\u001e̽'\u0019"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[7\n]:\r\u0012m/3jSG-o6H\u0002B>", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003w]H\u000ba\nX}.GJ]0f[VL\u0014\u001a0", "1n]AX?M7w", "", "3uT;g\u0010\u001d", "", "Bh\\2f;:[$", "1gP?Z,%S*~\u0002", "", "7r25T9@W\"\u0001", "", ">nf2e\u001aHc&|z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011OJ9[dnJ\u0014[E\u0018`+\u001arcQ1lD\r", "uH9\u00179!%Q#\u0007D[0\u0007\u0007+t}+E>\b\u001b\u0017P~W8\u007f$Bc\u0002\u001f\u0001{\u00154\u0017AEr;\u001e\u0013weC\u0010-*X}.GJ]6i`<@\u0010\u001fY J8\rNDK6nQ%)\u00189G\u0002\u0011,q", "5dc\u0010[(KU\u0019ezo,\u0004", "u(5", "5dc\u0010b5MS,\u000e^=", "u(8", "5dc\u0012i,Gb|]", "u(9", "u(I", "5dc\u001db>>`\u0007\t\u000bk*|", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 5TC9z8(\u001e2_C\u000ej,L\u00061TZ\u0018/X_qO\u0010\u001fZW95\u001f\u0005f/.~Q5\u001f]", "5dc!\\4>a(z\u0003i", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class BatteryStatusModel extends StaticCollectionItem {
    private final float chargeLevel;
    private final int contextID;
    private final long eventID;
    private final boolean isCharging;
    private final PowerSource powerSource;
    private final long timestamp;

    public BatteryStatusModel(int i2, long j2, long j3, float f2, boolean z2, PowerSource powerSource) {
        Intrinsics.checkNotNullParameter(powerSource, "powerSource");
        this.contextID = i2;
        this.eventID = j2;
        this.timestamp = j3;
        this.chargeLevel = f2;
        this.isCharging = z2;
        this.powerSource = powerSource;
    }

    public final float getChargeLevel() {
        return this.chargeLevel;
    }

    public final int getContextID() {
        return this.contextID;
    }

    public final long getEventID() {
        return this.eventID;
    }

    public final PowerSource getPowerSource() {
        return this.powerSource;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean isCharging() {
        return this.isCharging;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.contextID);
        jSONArray.put(this.eventID);
        jSONArray.put(this.timestamp);
        jSONArray.put(this.chargeLevel);
        jSONArray.put(this.isCharging);
        jSONArray.put(this.powerSource.ordinal());
        return jSONArray;
    }
}
