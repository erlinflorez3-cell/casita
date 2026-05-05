package com.braze.events;

import bo.app.i90;
import bo.app.tg;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLc\u000b\u0004I\u00066\u000b6B\r.4\u0012}\nnjG6LeN/ZS8\u0018s{:)c$\u007fJCU \u0006(ޣUdʴ\u0018nxYKP\u001f\n$~\u0003,wUޯa\u0014\u0015OP\u000e\bA[pU9\u000ft|ԏ!ݨ&:\u007f\u0006\u000f\u001crU\u001ez\u0013Cy\u000fXDϮt<X\u0011[\nb*\u0014E8\u0001Lձ\u0018T<HzcR/Q\u00030ŰMϮc2\u0003T\u001bN\u001d5\u001b\u0001y\u001eYI}¤\u0014ȏW\u0005\r\\iJKW\u007fK\u001dhU4[O\u0002cNZ\u0016\u0013C*\u0016֬^ę*^\u000b_n\u001bw=]icP<(.zRȡ>Ǭ\u0012\n/J43(vX\u001fA\u0007\u000bUVO0axDѐe:/'\u0006D9>ku_uS\u0019|@2Iڟ\"'\u0019p'nb\u00191&)l\u0010SGPnR~\u0013̆]A\u0006\u0006vx\u0010ATAU\u001aG}'-E(m ޠ'%\u0004\u0004N]u{Uqvo\u0002T^?PqL{Ҋ\r\u0010rFj yUԢ\\K"}, d2 = {"\u001ab^:\")KO.~D^=|\u0012>sI\u0005\t<\u0016\u0017\u0005FuiL\u0006(5b\r$5i%2WL\u001bxA(\"Hr9\u0010r\u0002", "", "\u001aa^{T7I\u001d\u001dRE4", "1n\\=b5>\\(J", "u(;/bu:^$H~2vR", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "AcZ\u000eh;A3&\f\u0005k", "1n_F", "uKQ<\"(I^b\u0003N)\u0002@o-o\bqxM|,\u0017\u0011o\u001f<\u007f4C#Z-3\u0003\u0016\u001cLI\u0017{C!\u0015qp=\u0005_;R\u00010'Y[6i2\u0004=\u001d!0", "", "6`b566=S", "u(8", "=sW2e", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "\u001aa^{T7I\u001d\u001dRE4", "5dc\u0012e9H`\u0006~vl6\u0006", "3qa<e\u0019>O'\t\u0004", "5dc\u0012e9H`v\ty^", "3qa<e\nHR\u0019", "", "5dc\u001fX8NS'\u000e^g0\f\r+t\u00042\u0005/\u0005\u001f\u0017", "u(;7T=:\u001d z\u0004`uc\u00138gU", "@d`BX:M7\"\u0003\nb(\f\r9nn,\u0004@", "5dc \\.GO(\u000f\b^", "AhV;T;N`\u0019", "5dc\"f,K7\u0018", "CrT?<+", "\nh]6g\u0005", "uKQ<\"(I^b\u0003N)\u0002@y", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class BrazeSdkAuthenticationErrorEvent {
    private final i90 sdkAuthError;

    public BrazeSdkAuthenticationErrorEvent(i90 sdkAuthError) {
        Intrinsics.checkNotNullParameter(sdkAuthError, "sdkAuthError");
        this.sdkAuthError = sdkAuthError;
    }

    private final i90 component1() {
        return this.sdkAuthError;
    }

    public static /* synthetic */ BrazeSdkAuthenticationErrorEvent copy$default(BrazeSdkAuthenticationErrorEvent brazeSdkAuthenticationErrorEvent, i90 i90Var, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            i90Var = brazeSdkAuthenticationErrorEvent.sdkAuthError;
        }
        return brazeSdkAuthenticationErrorEvent.copy(i90Var);
    }

    public final BrazeSdkAuthenticationErrorEvent copy(i90 sdkAuthError) {
        Intrinsics.checkNotNullParameter(sdkAuthError, "sdkAuthError");
        return new BrazeSdkAuthenticationErrorEvent(sdkAuthError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrazeSdkAuthenticationErrorEvent) && Intrinsics.areEqual(this.sdkAuthError, ((BrazeSdkAuthenticationErrorEvent) obj).sdkAuthError);
    }

    public final int getErrorCode() {
        return this.sdkAuthError.f888b;
    }

    public final String getErrorReason() {
        return this.sdkAuthError.f889c;
    }

    public final Long getRequestInitiationTime() {
        return ((tg) this.sdkAuthError.f887a).f1862d;
    }

    public final String getSignature() {
        return ((tg) this.sdkAuthError.f887a).f1867i;
    }

    public final String getUserId() {
        return ((tg) this.sdkAuthError.f887a).f1860b;
    }

    public int hashCode() {
        return this.sdkAuthError.hashCode();
    }

    public String toString() {
        return this.sdkAuthError.toString();
    }
}
