package com.biocatch.client.android.sdk.collection.collectors.simData;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.client.android.sdk.collection.StaticCollectionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\rA4\u0012\u000e\u0007nj?4Le^.ZS0\u0010qڔJř\f$ B{p*\u00020\tgN\u0016h~V`\u000bQ\u0011\u001e\u001c\tl<I\u0004|\f\u0015Ƥ6B}D{X}GQ`#AKړݨ&8\u007f\u0011I 8U(v)N\u0012 bENrRX\u001dO\u0015\u001a@\nl#Ә\"boޮNJrcH6s\u0012wBf'\u000e1ƊQ\u0013NÖ?\u000f|i,4Ñ;C"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]yj\u0015]/z\ta  }@\u001f)\u0007,PW", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003w]H\u000ba\nX}.GJ]0f[VL\u0014\u001a0", "Ah\\!l7>", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0016=?\u0018\u0005/", "Ah\\\u0011T;::\u001d\r\n", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZR4;N\u00029]\u007f^\u0016-'\u001c\u0001AK#nK\r", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016\\0d1nL\u0010[H\u0012V\u001a!\u0010Y\u0017\u000bs@H\u001bQ<X\u0006B2g\u0010$\u001d\u000b.a", "5dc \\4\u001dO(zab:\f", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc \\4-g$~", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 5TC9z8(\u001e2_C\u000ej,L\u00061TZ\u0018:`ZQ9#\u000e${R3{\u0019dAy", "2`c.?0Lb\b\t_l6\u0006d<r{<", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "2`c.?0Lb\b\t_l6\u0006d<r{<:N\u007f\u001d\u0011\u0015i[6A\u001f\t'N\u001aDm\u001d.IQ;", "Bn9 B\u0015\u001a`&z\u000f", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class MultiSimDataModel extends StaticCollectionItem {
    private final List<SimDataModel> simDataList;
    private final SimType simType;

    public MultiSimDataModel(SimType simType, List<SimDataModel> simDataList) {
        Intrinsics.checkNotNullParameter(simType, "simType");
        Intrinsics.checkNotNullParameter(simDataList, "simDataList");
        this.simType = simType;
        this.simDataList = simDataList;
    }

    public /* synthetic */ MultiSimDataModel(SimType simType, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(simType, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? new ArrayList() : list);
    }

    public final JSONArray dataListToJsonArray$sdk_3_3_0_936_release() {
        JSONArray jSONArray = new JSONArray();
        Iterator<SimDataModel> it = this.simDataList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSONArray());
        }
        return jSONArray;
    }

    public final List<SimDataModel> getSimDataList() {
        return this.simDataList;
    }

    public final SimType getSimType() {
        return this.simType;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.simType.getValue());
        jSONArray.put(dataListToJsonArray$sdk_3_3_0_936_release());
        return buildStatic(CollectorID.SimExtData.getStaticFieldName(), jSONArray);
    }
}
