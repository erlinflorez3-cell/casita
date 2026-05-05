package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\r.4ߚ\u007f\u0007tpA0JoP.`\\2\u000fq}:Śa:ڎs;\u0004\u0019>?\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019/Y[~] \u0013JB\u001eDݯQoK?){D\u001282P9@ە\u0002b1V\u001e\u000fzqNRܼ1\twHa%M3\u001fXĦ?h&,l\u007fNdԟ\u001dc@/1\u0003\u0002B|(\u00106\u0003M\u001bHl';y\u0012$1@E9-%\u0002\bMҿZ\b\u0014M\u0003U\u0005\u00179W1W\u0007o8n~B\u0014q͔\u000e&y4p\u001dQ\u000f\u0011m̚N,R^#@w)~Sʴ\u0003^\u001a5JF-Hi>\u0012\nχtՂDV\nމZ\u0002\u0001hD\u001fu\u0014A/Q\u001b\u0015V\u0018?oד9߉\t\u0013&ŀ\u0019p'db\u00181))T\u0010Q_RvA\u001fݘ\fՒAs\f͏z\u00040\u000f>SĲ3\u0012"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C~!>q\u001f.:CG{4,$>", "", "Bh\\2f;:[$", "", "@d`BX:M0#}\u000f", "", "@dc?l\nHc\"\u000e", "", "uI;7T=:\u001d z\u0004`uj\u0018<i\t*Q$D\b", "5dc\u001fX8NS'\u000eWh+\u0011", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001fX;Kgv\t\u000bg;", "u(8", "5dc!\\4>a(z\u0003i", "u(9", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigOfflineRequest {

    @SerializedName(alternate = {}, value = "\u0019\u000b\u0016\u0019\b\u0015\u0015a\u000e\u0002\u0016")
    @InterfaceC1492Gx
    private final String requestBody;

    @SerializedName(alternate = {}, value = "\u0019\u000b\u0019\u0016\u001cd\u0010\u0015\r\u0012")
    @InterfaceC1492Gx
    private final int retryCount;

    @SerializedName(alternate = {}, value = "\u001b\u000f\u0012\t\u0016\u0016\u0002\r\u000f")
    @InterfaceC1492Gx
    private final long timestamp;

    public StatsigOfflineRequest(long j2, String requestBody, int i2) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        this.timestamp = j2;
        this.requestBody = requestBody;
        this.retryCount = i2;
    }

    public /* synthetic */ StatsigOfflineRequest(long j2, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, str, (i3 & 4) != 0 ? 0 : i2);
    }

    public static /* synthetic */ StatsigOfflineRequest copy$default(StatsigOfflineRequest statsigOfflineRequest, long j2, String str, int i2, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            j2 = statsigOfflineRequest.timestamp;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            str = statsigOfflineRequest.requestBody;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            i2 = statsigOfflineRequest.retryCount;
        }
        return statsigOfflineRequest.copy(j2, str, i2);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.requestBody;
    }

    public final int component3() {
        return this.retryCount;
    }

    public final StatsigOfflineRequest copy(long j2, String requestBody, int i2) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new StatsigOfflineRequest(j2, requestBody, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsigOfflineRequest)) {
            return false;
        }
        StatsigOfflineRequest statsigOfflineRequest = (StatsigOfflineRequest) obj;
        return this.timestamp == statsigOfflineRequest.timestamp && Intrinsics.areEqual(this.requestBody, statsigOfflineRequest.requestBody) && this.retryCount == statsigOfflineRequest.retryCount;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((Long.hashCode(this.timestamp) * 31) + this.requestBody.hashCode()) * 31) + Integer.hashCode(this.retryCount);
    }

    public String toString() {
        return "StatsigOfflineRequest(timestamp=" + this.timestamp + ", requestBody=" + this.requestBody + ", retryCount=" + this.retryCount + ')';
    }
}
