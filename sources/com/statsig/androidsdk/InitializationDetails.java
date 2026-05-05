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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\r+4ߚ\u007f\u0007|jA0JwP.`Y2şs{B0cҕw٘Akڼ.\"7N\u000f\u0007wrXZ#C=\u0007&|x.aU'`\"\u00178B}CKO\u0006<geҽ:\u0005.8j?\b\u0018\u0019\u001aXIVΓ{\fR\u001a&H@\u001f=\u0019ӏNM# \u001bV\"\u0017\u001d\u000bl\u0015ɫI5\u0005HE;\u0003\u0018ĩ~-e0\u000bM%F\u0003(=|g\u001e9BO5C(\u0004\u000b\rRiC\u001bA\b<3mmޗ*\u0012\u0005eMp\u007fB\u0018[U\u001bu\u000b(r\u0004\u007f_R̃,\u0018jYi&(&\u0015Bɵ;L\u0015\u0014B`.[6-۳\r\u0004\u0011\u0001SXP0_x\u00049e\rЕ1ő77Aӕ~SgB'VW}\u000b\u0016,-Q\r/_l\u0010v\u0014IY.UoU\u0017\u05c8Tݳ\u000eeEЧ\u001crh\r8\u0010PI\u0006<\n\u001f~339s9Q$\"\u0006\u0007H>Ѐ\u0011¾l_qɭ`B(}$GJ\u000b\u0012kRvʶom"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013\u001cFq 7,CJg8%#>", "", "2ta.g0H\\", "", "AtR0X:L", "", "4`X9h9>2\u0019\u000evb3\u000b", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIkr~\u0011lh9\u0006G5R\u0006+CSRA\\?rK\u001f\u001cc\u001cN\u0001", "uII\u0019V6F\u001d'\u000evm:\u0001\u000bxa\t'\tJ\u0005\u0016%FuW \u007f)D]y';\u0003\u0016\u001bMQFu=,\u0015'B5\u000bj,MZ0K[R(cV\b=\u0001\u0012h\u0019X4\u001b\u0005/\u0005\u0015", "5dc\u0011h9:b\u001d\t\u0004", "u(9", "Adc\u0011h9:b\u001d\t\u0004", "uI\u0018#", "5dc\u0013T0Ec&~Y^;x\r6s", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9qEz49U\u0005$Lm\u0003.[NEtB\u001eSI]=\u000ec+2\u007f+VPJ3`gr*\u0014 e\u0018W9\rZ", "Adc\u0013T0Ec&~Y^;x\r6s", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011S\u0017@\u0006)1`\u000257Z\u0016<XMDy4\\ude@\u0007b\u0010Wz6KHU0qR_=\"\u001dd\u0017\\+bHJ", "5dc h*<S'\r", "u(I", "Adc h*<S'\r", "uY\u0018#", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class InitializationDetails {

    @SerializedName(alternate = {}, value = "\u000b\u001b\u0017\u0005\u0017\u000b\u0010\u000e")
    @InterfaceC1492Gx
    private long duration;

    @SerializedName(alternate = {}, value = "\r\u0007\u000e\u0010\u0018\u0014\u0006c\u0004\u0012}\u0005\u0007\r")
    @InterfaceC1492Gx
    private InitializeResponse.FailedInitializeResponse failureDetails;

    @SerializedName(alternate = {}, value = "\u001a\u001b\b\u0007\b\u0015\u0014")
    @InterfaceC1492Gx
    private boolean success;

    public InitializationDetails(long j2, boolean z2, InitializeResponse.FailedInitializeResponse failedInitializeResponse) {
        this.duration = j2;
        this.success = z2;
        this.failureDetails = failedInitializeResponse;
    }

    public /* synthetic */ InitializationDetails(long j2, boolean z2, InitializeResponse.FailedInitializeResponse failedInitializeResponse, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, z2, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : failedInitializeResponse);
    }

    public static /* synthetic */ InitializationDetails copy$default(InitializationDetails initializationDetails, long j2, boolean z2, InitializeResponse.FailedInitializeResponse failedInitializeResponse, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j2 = initializationDetails.duration;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = initializationDetails.success;
        }
        if ((i2 & 4) != 0) {
            failedInitializeResponse = initializationDetails.failureDetails;
        }
        return initializationDetails.copy(j2, z2, failedInitializeResponse);
    }

    public final long component1() {
        return this.duration;
    }

    public final boolean component2() {
        return this.success;
    }

    public final InitializeResponse.FailedInitializeResponse component3() {
        return this.failureDetails;
    }

    public final InitializationDetails copy(long j2, boolean z2, InitializeResponse.FailedInitializeResponse failedInitializeResponse) {
        return new InitializationDetails(j2, z2, failedInitializeResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationDetails)) {
            return false;
        }
        InitializationDetails initializationDetails = (InitializationDetails) obj;
        return this.duration == initializationDetails.duration && this.success == initializationDetails.success && Intrinsics.areEqual(this.failureDetails, initializationDetails.failureDetails);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final InitializeResponse.FailedInitializeResponse getFailureDetails() {
        return this.failureDetails;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.duration) * 31;
        boolean z2 = this.success;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (iHashCode + r02) * 31;
        InitializeResponse.FailedInitializeResponse failedInitializeResponse = this.failureDetails;
        return i2 + (failedInitializeResponse == null ? 0 : failedInitializeResponse.hashCode());
    }

    public final void setDuration(long j2) {
        this.duration = j2;
    }

    public final void setFailureDetails(InitializeResponse.FailedInitializeResponse failedInitializeResponse) {
        this.failureDetails = failedInitializeResponse;
    }

    public final void setSuccess(boolean z2) {
        this.success = z2;
    }

    public String toString() {
        return "InitializationDetails(duration=" + this.duration + ", success=" + this.success + ", failureDetails=" + this.failureDetails + ')';
    }
}
