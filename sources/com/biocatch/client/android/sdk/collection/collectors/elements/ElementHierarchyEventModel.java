package com.biocatch.client.android.sdk.collection.collectors.elements;

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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r.4\u0012}\nnjG7LeN8ZS@\u000fsڔ:řqҕ\"CiTZ=2\r]N\u007fg\u001dKj\u0011Q\u0011\u001e\u0018\u000fiZLe|k\u0016'2ppO7[tU9\u000fuF\u000b.8::\u0010\u0004/\u001d:L\u001e}\u0013Cy\r\"4NxRR;Vŋ\u001e\u0012\u0014Hh\u0007,q\u007fNd^3q\u000b@1\u0005\u0002Dd&\u000e3ƊQ\u0013NÖ?\u000f|l,7\u0011HC\u001b=U\u0019\u0006\u0001^ύ\u0007Eyܵ\u001dj-49UDfDX\u0018\u0014C,̠\u0011cz̦t\u0007Wn\u001a6{^qOh\u000eVxߡ\u007f\u0013Dǉ&\b-X<<ju\u0016\u0013Kt!TĖT\bfۍ\u0018|gG%4PB9A3f\u007fjޅ\u001dT?ަ\u001d\u000f$5\u000f\u0002qjb\u0015x\u0015IUɐU7Y̵UJT\u001egLѐ\b\b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000eh$(nQ3,\u0006/]aLh\n\u001b}\u00184jw\u0018", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]AX?M7w", "", "/bc6i0Mgv\t\u0003i6\u0006\t8th$\u0004@", "", "6`b566=S", ">`a2a;!O'\u0002xh+|", "1kP@f\u0015:[\u0019", "BqPCX9LO b\u0004],\u0010", "Bh\\2f;:[$", "", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q$d}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019\u001fPw\u000f", "5dc\u000eV;Bd\u001d\u000e\u000f<6\u0005\u00149n\u007f1\u000b)|\u001f\u0017", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010_(La\u0002z\u0003^", "5dc\u0010b5MS,\u000e^=", "u(8", "5dc\u0015T:A1#}z", "5dc\u001dT9>\\(avl/z\u0013.e", "5dc!\\4>a(z\u0003i", "u(9", "5dc!e(OS&\rve\u0010\u0006\b/x", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ElementHierarchyEventModel extends CollectionItem {
    private final String activityComponentName;
    private final String className;
    private final int contextID;
    private final int hashCode;
    private final int parentHashcode;
    private final long timestamp;
    private final int traversalIndex;

    public ElementHierarchyEventModel(int i2, String str, int i3, int i4, String str2, int i5, long j2) {
        this.contextID = i2;
        this.activityComponentName = str;
        this.hashCode = i3;
        this.parentHashcode = i4;
        this.className = str2;
        this.traversalIndex = i5;
        this.timestamp = j2;
    }

    public final String getActivityComponentName() {
        return this.activityComponentName;
    }

    public final String getClassName() {
        return this.className;
    }

    public final int getContextID() {
        return this.contextID;
    }

    public final int getHashCode() {
        return this.hashCode;
    }

    public final int getParentHashcode() {
        return this.parentHashcode;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getTraversalIndex() {
        return this.traversalIndex;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.contextID);
        jSONArray.put(this.activityComponentName);
        jSONArray.put(this.hashCode);
        jSONArray.put(this.parentHashcode);
        jSONArray.put(this.className);
        jSONArray.put(this.traversalIndex);
        jSONArray.put(this.timestamp);
        return jSONArray;
    }
}
