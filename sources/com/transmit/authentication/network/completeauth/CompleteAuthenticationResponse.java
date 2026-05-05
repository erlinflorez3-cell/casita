package com.transmit.authentication.network.completeauth;

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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4\u0012}\u000enjG9LeN.ZS8\u0015s{:$aҝwYП\u0006\u001a,!Id^munb\\!B=\u0007&|x.aU'`ܫ\u00132Ps\b<[xU;vsd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014) ;Xphĥ=U\u000b\u001a \u0006V\"\u0017\u001d\u000bh~<Nlk<G#1l\tľ&(A\u000bY%F\u00034=|o,CBM4C$\u001aϟ\b\u001bbM\u0012Wqk\u0015/Ҿ&sP\u0002hNX.\u0017[ܗN]l\u0001(t\u0005\u007fcВ+1WҪcR\u0014-\u0006\u0001L\u001eJ\u0004&\b=G\\.բj\u000e\u0016ޗ\rtYG^\n\u07b2F\u0012"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015dqH\n-\nX~2NL],8b\u0002@\u0014\u001bi\u0012L'\u001c\tcJ\u0011nRB)\u0011:IW", "", "1qT1X5MW\u0015\u0006", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015dqH\n-\u001b<T4GKN5kVnD\u0001\u0012h\u0019X4\u001b\u0005/", "/tc5R*HR\u0019", "", "uKR<`uM`\u0015\b\tf0\fR+u\u000f+{I\u0010\u001b\u0015C~\u0012F\u007fn>Y\r2Az\u001cwKMCv;\u001e$h]I\u0016fu=d\u0005TLM,eav9\u001b~Z\u001cY5\u0016\u0013Y\u0017\u000bs@H\u001bQ3E\u000b=2n\u001b#\u0012>lF\u0006G", "5dc\u000eh;AM\u0017\ty^", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010e,=S\"\u000e~Z3", "u(;0b4\bb&z\u0004l4\u0001\u0018xa\u00107~@\n&\u001bEk\u001d@\u0001.~b}/Iw#4\u0017AEs?%\u0015wa5\u0017r/\u0018e\u0015%YN+\\[\u0002A\u0010\u0019G\u000e\\6\u0017\u000egAy", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class CompleteAuthenticationResponse {
    private final String auth_code;
    private final TSCredentialResponse credential;

    public CompleteAuthenticationResponse(TSCredentialResponse tSCredentialResponse, String auth_code) {
        Intrinsics.checkNotNullParameter(auth_code, "auth_code");
        this.credential = tSCredentialResponse;
        this.auth_code = auth_code;
    }

    public static /* synthetic */ CompleteAuthenticationResponse copy$default(CompleteAuthenticationResponse completeAuthenticationResponse, TSCredentialResponse tSCredentialResponse, String str, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            tSCredentialResponse = completeAuthenticationResponse.credential;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str = completeAuthenticationResponse.auth_code;
        }
        return completeAuthenticationResponse.copy(tSCredentialResponse, str);
    }

    public final TSCredentialResponse component1() {
        return this.credential;
    }

    public final String component2() {
        return this.auth_code;
    }

    public final CompleteAuthenticationResponse copy(TSCredentialResponse tSCredentialResponse, String auth_code) {
        Intrinsics.checkNotNullParameter(auth_code, "auth_code");
        return new CompleteAuthenticationResponse(tSCredentialResponse, auth_code);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteAuthenticationResponse)) {
            return false;
        }
        CompleteAuthenticationResponse completeAuthenticationResponse = (CompleteAuthenticationResponse) obj;
        return Intrinsics.areEqual(this.credential, completeAuthenticationResponse.credential) && Intrinsics.areEqual(this.auth_code, completeAuthenticationResponse.auth_code);
    }

    public final String getAuth_code() {
        return this.auth_code;
    }

    public final TSCredentialResponse getCredential() {
        return this.credential;
    }

    public int hashCode() {
        TSCredentialResponse tSCredentialResponse = this.credential;
        return ((tSCredentialResponse == null ? 0 : tSCredentialResponse.hashCode()) * 31) + this.auth_code.hashCode();
    }

    public String toString() {
        return "CompleteAuthenticationResponse(credential=" + this.credential + ", auth_code=" + this.auth_code + ")";
    }
}
