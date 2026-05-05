package com.biocatch.client.android.sdk.collection.collectors.clipboard;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r)4\u0012}\u0007njO0LeN.ZS8\u001bs{:.c$\bCC٥ Ԃ8ޛ\u007fN\u0016f/\u007fj\u000fQ\u000f\u001e\u0016'k<Mczu\u0012=5RsM7eok<pxD\n82P>\n\t\u000f!BH>w\u000bIY\u0014*2Voh[ҫQ\u0005(\u001cND.\u00166\\\u0016d|\\=lH/;\u0003\u0018CĚ+e8ŧe\u000fL_5\u0019Gp,-X7c\u0018ȏW\t\u000fѸsA\tL\u007fKUw5,CI\"]͏\\\u0006\u001cƃCQ\u0013l\u00016-\u0014_g$'YPӍOV\u0016ߊ\u0010|\u0002\u001eJ\u0010^\u00175PF/0e6\u0017\u07baxx[óh\u0004dT\u000e\u000e2E%)\u00183Y<ӸjWiݢ1P=\u0010\u0013\u001b̽'\u0018"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JU0gO|9!\u0011$kU/\u0018\u0002c=1m$H\u001f\u0011;1\f:h\ba", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]AX?M7w", "", "3uT;g\u0010\u001d", "", "Bh\\2f;:[$", "3uT;g\u001bR^\u0019", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JU0gO|9!\u0011$kU/\u0018djA-}3K*\b\u0002", "6`b5", "BdgA", "", "uH9\u0017?*H[b{~h*x\u0018-hI&\u0003D\u0001 &\u0011k\u0017;\u0004/9XG.6s_,WJBk2-\u0019rj\u0003\u0005m3Uv%VV[:&PyA\u001f\u000fd\n[*Vb`E/NU7(\u0017\u001b]\r;>dr\u001b\nFf:IR\u0019IC\u0003\u0005N-qH/#j", "5dc\u0010b5MS,\u000e^=", "u(8", "5dc\u0012i,Gb|]", "u(9", "5dc\u0012i,Gb\b\u0013\u0006^", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 5TC9z8(\u001e2_C\u000ej,L\u00061TZ\u0018*cV}:\u001e\u000eg\r\u0018\t\u0014\td!5nMF\u000e\u001c7IW", "5dc\u0015T:A", "5dc!X?M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!\\4>a(z\u0003i", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ClipboardEventModel extends CollectionItem {
    private final int contextID;
    private final long eventID;
    private final ClipEventType eventType;
    private final int hash;
    private final String text;
    private final long timestamp;

    public ClipboardEventModel(int i2, long j2, long j3, ClipEventType eventType, int i3, String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.contextID = i2;
        this.eventID = j2;
        this.timestamp = j3;
        this.eventType = eventType;
        this.hash = i3;
        this.text = str;
    }

    public final int getContextID() {
        return this.contextID;
    }

    public final long getEventID() {
        return this.eventID;
    }

    public final ClipEventType getEventType() {
        return this.eventType;
    }

    public final int getHash() {
        return this.hash;
    }

    public final String getText() {
        return this.text;
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
        jSONArray.put(this.eventType.ordinal());
        jSONArray.put(this.hash);
        jSONArray.put(clearNull(this.text));
        return jSONArray;
    }
}
