package com.biocatch.client.android.sdk.backend;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O\"8\u000bDB\u0007Ӭ4\u0012\u0006\u0013nj?7LeV7ZS0\u000fs{B*c$wCA٦ \u0014̝9O|f(\bZd\u0019C'\f&zz,wW'^\"\u0013@E\b?aQڱA9ny~\u0012.<:>\n\u0007\u0011\u001aXJ>wAƖLT\u0019>K\t:\u0001\u0011\u0014ů\u001bZ'L,\u0019\u001e\u000bɡ~BNlk:G)\u0013kRNUa^}}\u0013LT5\u0010\u000faL/\u0007́4]6a\u0010\u001fR\nM3E\u007fL\u001dj=&YH:ʥ7!\u0007\"%CO;n9ͽ[MXn\u001e?+}g\u0012؋\rx\r\t{%B\u0014\u0010\u0016'v0[\u001bǴ\f\u0014;ο\u000bUFV\u0010e\u0013\u000f\tdN\u0017S\u0004Ĵ/?#ƘicA!\\@ߏ\t "}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005J0-\u0011Lp9\u000f9", "", "2`c.", "", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "5q^Bc", "", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl}Lk\u001f8@,1b\u007fi%|#2VE\u0011/%", "5dc\u0011T;:", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "5dc\u0014e6N^", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DataItem {
    private final Collection<CollectionItem> data;
    private final String group;

    /* JADX WARN: Multi-variable type inference failed */
    public DataItem(Collection<? extends CollectionItem> data, String group) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(group, "group");
        this.data = data;
        this.group = group;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataItem copy$default(DataItem dataItem, Collection collection, String str, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            collection = dataItem.data;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str = dataItem.group;
        }
        return dataItem.copy(collection, str);
    }

    public final Collection<CollectionItem> component1() {
        return this.data;
    }

    public final String component2() {
        return this.group;
    }

    public final DataItem copy(Collection<? extends CollectionItem> data, String group) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(group, "group");
        return new DataItem(data, group);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataItem)) {
            return false;
        }
        DataItem dataItem = (DataItem) obj;
        return Intrinsics.areEqual(this.data, dataItem.data) && Intrinsics.areEqual(this.group, dataItem.group);
    }

    public final Collection<CollectionItem> getData() {
        return this.data;
    }

    public final String getGroup() {
        return this.group;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.group.hashCode();
    }

    public String toString() {
        return "DataItem(data=" + this.data + ", group=" + this.group + ')';
    }
}
