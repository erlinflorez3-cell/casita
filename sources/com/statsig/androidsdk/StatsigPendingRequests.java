package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import java.util.List;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O$8\u000bDB\u0007\"2\u0016\u007f\u0007tsA0JeP.`Y2şs{B0cҕwْAkڼ.\"7N\u000fxwxXZ#I\u001f\b&x\u0019.wVޯa\u0012\u001d5\u000b|M9euM;ptd\u0007N3hهzM\u0018(1`\u0010%ٙsW\u0012\u0012>@\t@b\u000f]\u0005H\u00144?fӼ\u001d%x\\>`l\fC_)\u0011sZP=^^{\u0014ЌG\u001d.\u001b\u0002y\u001eYL}¤\u0014mZ\u0011\u0014j[m\u0011\u0006ғ<U\u00035'CO\u0004YFX.\u0016C,\u0006\u00114þ(ػ\tWhϯ?-UgYU˔,\u0007"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7D})6q\u001f0:CG{4,$v7", "", "@d`BX:Ma", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C~!>q\u001f.:CG{4,$>", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u001fX8NS'\u000e\t", "u(;7T=:\u001d)\u000e~euc\r=tU", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigPendingRequests {

    @SerializedName(alternate = {}, value = "\u0019\u000b\u0016\u0019\b\u0015\u0015\u0013")
    @InterfaceC1492Gx
    private final List<StatsigOfflineRequest> requests;

    public StatsigPendingRequests(List<StatsigOfflineRequest> requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.requests = requests;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatsigPendingRequests copy$default(StatsigPendingRequests statsigPendingRequests, List list, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            list = statsigPendingRequests.requests;
        }
        return statsigPendingRequests.copy(list);
    }

    public final List<StatsigOfflineRequest> component1() {
        return this.requests;
    }

    public final StatsigPendingRequests copy(List<StatsigOfflineRequest> requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        return new StatsigPendingRequests(requests);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StatsigPendingRequests) && Intrinsics.areEqual(this.requests, ((StatsigPendingRequests) obj).requests);
    }

    public final List<StatsigOfflineRequest> getRequests() {
        return this.requests;
    }

    public int hashCode() {
        return this.requests.hashCode();
    }

    public String toString() {
        return "StatsigPendingRequests(requests=" + this.requests + ')';
    }
}
