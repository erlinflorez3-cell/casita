package com.transmit.authentication.network.completereg;

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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4I\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004Ne\u001e\f\"!O|hwrX\\#C=\u0007Ȁ|j:L\u001e\u007fk\u0019'2pp\u0006ޓN8DGh\r63!xŹ9B \u000f#BH>͌+IQ\f 0XphS=S\u000b\u001a \bV /\u001f#ʨM~YzgR/Q\u000e\u001aH\\3w2\u0013L;E\u001bݢ\u000e?h,8X7c#kڜ\u0002OYiN\u001b? >K٩&w:Wuo6\u0007\u0001Џ\u00191WՕut,`\u0013V1\u001b5+gcyQˎ,}\u0003Ԉ%>\n\u0014\u0014,χ2="}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PR\u001a;v)2\\K3`PX=(og\u000eM+\u0016\u0014]=+[DE*\u00125W\u0002\u0011", "", "1kX2a;\u001dO(z_L\u0016e", "", "/sc2f;:b\u001d\t\u0004H)\u0002\t-t", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "5dc\u000eg;>a(z\nb6\u0006r,j\u007f&\u000b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010_0>\\(]vm(av\u0019N", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class TSRegPublicKeyCredentialResponse {
    private final String attestationObject;
    private final String clientDataJSON;

    public TSRegPublicKeyCredentialResponse(String clientDataJSON, String attestationObject) {
        Intrinsics.checkNotNullParameter(clientDataJSON, "clientDataJSON");
        Intrinsics.checkNotNullParameter(attestationObject, "attestationObject");
        this.clientDataJSON = clientDataJSON;
        this.attestationObject = attestationObject;
    }

    public static /* synthetic */ TSRegPublicKeyCredentialResponse copy$default(TSRegPublicKeyCredentialResponse tSRegPublicKeyCredentialResponse, String str, String str2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = tSRegPublicKeyCredentialResponse.clientDataJSON;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            str2 = tSRegPublicKeyCredentialResponse.attestationObject;
        }
        return tSRegPublicKeyCredentialResponse.copy(str, str2);
    }

    public final String component1() {
        return this.clientDataJSON;
    }

    public final String component2() {
        return this.attestationObject;
    }

    public final TSRegPublicKeyCredentialResponse copy(String clientDataJSON, String attestationObject) {
        Intrinsics.checkNotNullParameter(clientDataJSON, "clientDataJSON");
        Intrinsics.checkNotNullParameter(attestationObject, "attestationObject");
        return new TSRegPublicKeyCredentialResponse(clientDataJSON, attestationObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TSRegPublicKeyCredentialResponse)) {
            return false;
        }
        TSRegPublicKeyCredentialResponse tSRegPublicKeyCredentialResponse = (TSRegPublicKeyCredentialResponse) obj;
        return Intrinsics.areEqual(this.clientDataJSON, tSRegPublicKeyCredentialResponse.clientDataJSON) && Intrinsics.areEqual(this.attestationObject, tSRegPublicKeyCredentialResponse.attestationObject);
    }

    public final String getAttestationObject() {
        return this.attestationObject;
    }

    public final String getClientDataJSON() {
        return this.clientDataJSON;
    }

    public int hashCode() {
        return (this.clientDataJSON.hashCode() * 31) + this.attestationObject.hashCode();
    }

    public String toString() {
        return "TSRegPublicKeyCredentialResponse(clientDataJSON=" + this.clientDataJSON + ", attestationObject=" + this.attestationObject + ")";
    }
}
