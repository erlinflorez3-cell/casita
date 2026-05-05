package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import com.statsig.androidsdk.InitializeResponse;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tvAӄLeV5ZS0&s{B-c$wCCU(\u0004*\tUNm˫t`ҙ;C=\u0005V z0WU\u0011]@\u0010BF}AKM\u001e@Id\u0003:\u001d `'H\u0002\u000b\u0001(0`\u0012\ryqRë\u00160Nx\u0003Y\u001bg\u001d\u001a@\u0007\u0005ů\u0002fcuiNH\u001b`\u0001ȉ$KpPj?_^\u0002\u0014ϼG\u001d5\u001b\u0014y A?e<[ȳTΫ\u000bRiIKu\u007f[\u001dhUݐ[OyWDX\u0018\u0014C,\u007f\u0013cr4^\u001dQ\u000f\u000fW1UcYT&(&\u007f,\u0015B\u0004\u001c\f?JD,HmNՋ2ϢvSNoJoP \u0013ad8U\u0006AMQ\u001d|P\u0010:_آ8D\f\u001bA;\u0001\u001dE\"ہ\r)\u001c)y\u0010Q_V\u0007ؗG\u001f*gC\u0006\u0006\u0007a01:4\u0006\u0004\u0006ɍ\u001dѧ\u001b3?[G09m\bQRq\u0017\u0007fsau#dN$\u0007\u0016e-?\u0010\u0019H;ʕwÏXd4Ҋe\u001eZ\u0015\f\u00173\"b\bJ2u,\\S\u0001i\u0019R\u0014\u000ec3=ƅeˇo\u001a_ުv5;cq#\u0002T|(MQ3!ffZS:[\u0013,`6\u001fТ\u001cȑ\u007fPVۼ+4E\b*KL3\u001ft#aҺ\"h"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%k\f?vz", "", "D`[BX:", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIkr\f%f_9\u0015q-^}\u000bPP]0XYvR\u0014~Z\u001cY5\u0016\u0013Y\u0017", "AsX0^@.a\u0019\fZq7|\u00163m\u007f1\u000bN", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\u0012:|9%g}-\u0017\u0001!.ZGCk=-#>", "CrT?;(LV", "", "3uP9h(MW#\bib4|", "", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011S\u0017@\u0006)1`\u000257Z\u0016<XMDy4\\\u0003x_7\u0007q:O\u0007.+UR;`NyA)\u0012G\u000e\\6\u0017\u000egAyUBA'Q:X}Jv\u0005\u000e_\n>i}LZ\u000fUx\u001b?/8lD_siUARB=o\fl!d:C3\"G\u007f da*S\u0003O\u001at\u001cgvtK\"|\u000e\u000bCilB\u000fvQEvp\u0006U\u0005yguI", "5dc\u0012i(Ec\u0015\u000e~h5k\r7e", "u(;7T=:\u001d z\u0004`uc\u00138gU", "Adc\u0012i(Ec\u0015\u000e~h5k\r7e", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;C\u0019", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "5dc g0<Y-n\t^9\\\u001c:e\r,\u0004@\n&%", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9{Kz#;mm.7zuAXCHo<\u001e\u001ewo\u000f", "Adc g0<Y-n\t^9\\\u001c:e\r,\u0004@\n&%", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d@t+II\f DM)9MP?s4'$v7|w", "5dc\"f,K6\u0015\r}", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\"f,K6\u0015\r}", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc#T3NS'", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9qEz49U\u0005$Lm\u0003.[NEtB\u001eSVq7\u0005c:\\w7N0W0kVnD\u0018'ZzN9\u0018\u000fbO$D", "Adc#T3NS'", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011S\u0017@\u0006)1`\u000257Z\u0016<XMDy4\\\u0003x_7\u0007q:O\u0007.+UR;`NyA)\u0012G\u000e\\6\u0017\u000egAy25", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011S\u0017@\u0006)1`\u000257Z\u0016<XMDy4\\\u0003x_7\u0007q:O\u0007.+UR;`NyA)\u0012G\u000e\\6\u0017\u000egAyUBA'Q:X}Jv\u0005\u000e_\n>i}LZ\u000fUx\u001b?/8lD_siUARB=o\fl!d:C3\"G\u007f da*S\u0003O\u001at\u001cgvtK\"|\u000e\u000bCilB\u000fvQEvp\u0006U\u0005ygu?r5|v\u0012C&Er\tM1\u0014G]\u0006\u001f0[O&,\u007f\u001a\u000f=NcK", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
final class Cache {

    @SerializedName(alternate = {}, value = "\f\u001c\u0006\u0010\u0018\u0003\u0015\t\u000e\fp\u0005\b~")
    @InterfaceC1492Gx
    private Long evaluationTime;

    @SerializedName(alternate = {}, value = "\u001a\u001a\u000e\u0007\u000e\u001bu\u0013\u0004\u0010a\u0014\u000b~\u000b\u0001\u0004z\u0003\b\u0006")
    @InterfaceC1492Gx
    private StickyUserExperiments stickyUserExperiments;

    @SerializedName(alternate = {}, value = "\u001c\u0019\n\u0016j\u0003\u0014\b")
    @InterfaceC1492Gx
    private String userHash;

    @SerializedName(alternate = {}, value = "\u001d\u0007\u0011\u0019\b\u0015")
    @InterfaceC1492Gx
    private InitializeResponse.SuccessfulInitializeResponse values;

    public Cache(InitializeResponse.SuccessfulInitializeResponse values, StickyUserExperiments stickyUserExperiments, String userHash, Long l2) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(stickyUserExperiments, "stickyUserExperiments");
        Intrinsics.checkNotNullParameter(userHash, "userHash");
        this.values = values;
        this.stickyUserExperiments = stickyUserExperiments;
        this.userHash = userHash;
        this.evaluationTime = l2;
    }

    public /* synthetic */ Cache(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, StickyUserExperiments stickyUserExperiments, String str, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(successfulInitializeResponse, stickyUserExperiments, str, (i2 & 8) != 0 ? Long.valueOf(System.currentTimeMillis()) : l2);
    }

    public static /* synthetic */ Cache copy$default(Cache cache, InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, StickyUserExperiments stickyUserExperiments, String str, Long l2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            successfulInitializeResponse = cache.values;
        }
        if ((2 & i2) != 0) {
            stickyUserExperiments = cache.stickyUserExperiments;
        }
        if ((4 & i2) != 0) {
            str = cache.userHash;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            l2 = cache.evaluationTime;
        }
        return cache.copy(successfulInitializeResponse, stickyUserExperiments, str, l2);
    }

    public final InitializeResponse.SuccessfulInitializeResponse component1() {
        return this.values;
    }

    public final StickyUserExperiments component2() {
        return this.stickyUserExperiments;
    }

    public final String component3() {
        return this.userHash;
    }

    public final Long component4() {
        return this.evaluationTime;
    }

    public final Cache copy(InitializeResponse.SuccessfulInitializeResponse values, StickyUserExperiments stickyUserExperiments, String userHash, Long l2) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(stickyUserExperiments, "stickyUserExperiments");
        Intrinsics.checkNotNullParameter(userHash, "userHash");
        return new Cache(values, stickyUserExperiments, userHash, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cache)) {
            return false;
        }
        Cache cache = (Cache) obj;
        return Intrinsics.areEqual(this.values, cache.values) && Intrinsics.areEqual(this.stickyUserExperiments, cache.stickyUserExperiments) && Intrinsics.areEqual(this.userHash, cache.userHash) && Intrinsics.areEqual(this.evaluationTime, cache.evaluationTime);
    }

    public final Long getEvaluationTime() {
        return this.evaluationTime;
    }

    public final StickyUserExperiments getStickyUserExperiments() {
        return this.stickyUserExperiments;
    }

    public final String getUserHash() {
        return this.userHash;
    }

    public final InitializeResponse.SuccessfulInitializeResponse getValues() {
        return this.values;
    }

    public int hashCode() {
        int iHashCode = ((((this.values.hashCode() * 31) + this.stickyUserExperiments.hashCode()) * 31) + this.userHash.hashCode()) * 31;
        Long l2 = this.evaluationTime;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }

    public final void setEvaluationTime(Long l2) {
        this.evaluationTime = l2;
    }

    public final void setStickyUserExperiments(StickyUserExperiments stickyUserExperiments) {
        Intrinsics.checkNotNullParameter(stickyUserExperiments, "<set-?>");
        this.stickyUserExperiments = stickyUserExperiments;
    }

    public final void setUserHash(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userHash = str;
    }

    public final void setValues(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse) {
        Intrinsics.checkNotNullParameter(successfulInitializeResponse, "<set-?>");
        this.values = successfulInitializeResponse;
    }

    public String toString() {
        return "Cache(values=" + this.values + ", stickyUserExperiments=" + this.stickyUserExperiments + ", userHash=" + this.userHash + ", evaluationTime=" + this.evaluationTime + ')';
    }
}
