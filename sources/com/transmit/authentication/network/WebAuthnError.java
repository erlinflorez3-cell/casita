package com.transmit.authentication.network;

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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4I\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004Ne\u001e\f\"!O|hwrX\\#C=\u0007Ȁ|j:L\u001e\u007fk\u0019'2pp\u0006ޓN8DGh\r63!xŹ9B \u000f#BH>͌+IQ\f 0XphS=S\u000b\u001a \bV /\u001f#ʨM~YzgR/Q\u000e\u001aH\\3w2\u0013L;E\u001bݢ\u000e?h,8X7c#kڜ\u0002OYiN\u001b? >K٩&w:Wso6\u0007\u0001Џ\u00191WՕut,`\u0013V1\u001b5-gcyQˎ,}\u0003Ԉ%>\n\u0014\u0014,χ2="}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_ M@\u0017{C!\u001eHnF\u0011p\u0002", "", "3qa<e&<]\u0018~", "", ";db@T.>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "5dc\u0012e9H`\u0013|\u0005],", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001aX:LO\u001b~", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class WebAuthnError {
    private final String error_code;
    private final String message;

    public WebAuthnError(String error_code, String message) {
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.error_code = error_code;
        this.message = message;
    }

    public static /* synthetic */ WebAuthnError copy$default(WebAuthnError webAuthnError, String str, String str2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = webAuthnError.error_code;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            str2 = webAuthnError.message;
        }
        return webAuthnError.copy(str, str2);
    }

    public final String component1() {
        return this.error_code;
    }

    public final String component2() {
        return this.message;
    }

    public final WebAuthnError copy(String error_code, String message) {
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(message, "message");
        return new WebAuthnError(error_code, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebAuthnError)) {
            return false;
        }
        WebAuthnError webAuthnError = (WebAuthnError) obj;
        return Intrinsics.areEqual(this.error_code, webAuthnError.error_code) && Intrinsics.areEqual(this.message, webAuthnError.message);
    }

    public final String getError_code() {
        return this.error_code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.error_code.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        return "WebAuthnError(error_code=" + this.error_code + ", message=" + this.message + ")";
    }
}
