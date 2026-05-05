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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4O\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004`e\u001e\f\"!O|hwrX\\#C=\u0007&|x/aU'^\"\u0015@F\bAIL\u001e>˃dtD\nh90C\u0012\u0005/\u001bpс\u0011?\u0002QW$\u0012^A7ĴSUT\u0013'*\u0006l!Gɭ]0WDV\u0005_P.Q\u00040ŰOo\u0011>\fe\rtÖW\u0013|a,+X7c\u0016UY\t\u0007`]W\u0003mrm\u000bn'5.as\u00067\t\b\u001a\u00159S%_\t%\u000b\u0006\u0018ԧ\u000bo<]scP<9(\u0001\n\u001fT\u0006$\u0005UGtǽ\u001b/\u000f\u001cF\rr\u0002T\u0017ٳ]\u000b\u0007\tvN\u0017S\u0001yۖ8ku_cS\u0019|8߉\t\u0013&ŀ\u0019p'ab\u00151$)T\u0010Q_R͘ANVˣq?s\f~iR9\u00123_\u007f]| 2\u001d-ڛs;)*y\t\u0019Uuz\u001db~R\u0018S͕D(vݫO,\u000f\u0016hK\u0087\t\u0002"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015dqH\n-\u001b<a7DSR*BR\u0007\u001b!\u0012Y\u000eW:\u0011\u0001`.$|OA(\u0016,\u001f", "", "1kX2a;\u001dO(z_L\u0016e", "", "/tc5X5MW\u0017z\nh9[\u0005>a", "AhV;T;N`\u0019", "CrT?;(GR ~", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCy25", "5dc\u000eh;AS\"\u000e~\\(\f\u0013<D{7w", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010_0>\\(]vm(av\u0019N", "5dc \\.GO(\u000f\b^", "5dc\"f,K6\u0015\bye,", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class TSPublicKeyCredentialResponse {
    private final String authenticatorData;
    private final String clientDataJSON;
    private final String signature;
    private final String userHandle;

    public TSPublicKeyCredentialResponse(String clientDataJSON, String authenticatorData, String signature, String str) {
        Intrinsics.checkNotNullParameter(clientDataJSON, "clientDataJSON");
        Intrinsics.checkNotNullParameter(authenticatorData, "authenticatorData");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.clientDataJSON = clientDataJSON;
        this.authenticatorData = authenticatorData;
        this.signature = signature;
        this.userHandle = str;
    }

    public static /* synthetic */ TSPublicKeyCredentialResponse copy$default(TSPublicKeyCredentialResponse tSPublicKeyCredentialResponse, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = tSPublicKeyCredentialResponse.clientDataJSON;
        }
        if ((2 & i2) != 0) {
            str2 = tSPublicKeyCredentialResponse.authenticatorData;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str3 = tSPublicKeyCredentialResponse.signature;
        }
        if ((i2 & 8) != 0) {
            str4 = tSPublicKeyCredentialResponse.userHandle;
        }
        return tSPublicKeyCredentialResponse.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.clientDataJSON;
    }

    public final String component2() {
        return this.authenticatorData;
    }

    public final String component3() {
        return this.signature;
    }

    public final String component4() {
        return this.userHandle;
    }

    public final TSPublicKeyCredentialResponse copy(String clientDataJSON, String authenticatorData, String signature, String str) {
        Intrinsics.checkNotNullParameter(clientDataJSON, "clientDataJSON");
        Intrinsics.checkNotNullParameter(authenticatorData, "authenticatorData");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new TSPublicKeyCredentialResponse(clientDataJSON, authenticatorData, signature, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TSPublicKeyCredentialResponse)) {
            return false;
        }
        TSPublicKeyCredentialResponse tSPublicKeyCredentialResponse = (TSPublicKeyCredentialResponse) obj;
        return Intrinsics.areEqual(this.clientDataJSON, tSPublicKeyCredentialResponse.clientDataJSON) && Intrinsics.areEqual(this.authenticatorData, tSPublicKeyCredentialResponse.authenticatorData) && Intrinsics.areEqual(this.signature, tSPublicKeyCredentialResponse.signature) && Intrinsics.areEqual(this.userHandle, tSPublicKeyCredentialResponse.userHandle);
    }

    public final String getAuthenticatorData() {
        return this.authenticatorData;
    }

    public final String getClientDataJSON() {
        return this.clientDataJSON;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getUserHandle() {
        return this.userHandle;
    }

    public int hashCode() {
        int iHashCode = ((((this.clientDataJSON.hashCode() * 31) + this.authenticatorData.hashCode()) * 31) + this.signature.hashCode()) * 31;
        String str = this.userHandle;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TSPublicKeyCredentialResponse(clientDataJSON=" + this.clientDataJSON + ", authenticatorData=" + this.authenticatorData + ", signature=" + this.signature + ", userHandle=" + this.userHandle + ")";
    }
}
