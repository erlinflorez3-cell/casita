package com.transmit.authentication.network.startregister;

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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r(4\u0012}\u000enjG9LeN0Xݾ0%ӆ,4RZd\u0005S?c\u001a\u0016\"7P^kupbZ9FǇ\n\u0016\u0007ntPc\u0002u\u0012=3\tŪ@{T}GQ`#9Kۚ3jS\b\u0010\u0019\u001aXϺ@|\u0001CY\f*0nqjX\u0013M\u0013\u001c*\u0006l#Gɭ[0_DT\u0005]h<S\twPf)u/+LSіUo\u0014\u0005p6+n:{֭$\u001c\n\u0015bs?1@8ތ\u0004965-as\u00069ݼ\u0004\u001a\u001dۀg\u000fcw4bU`n\f?+}dׂT\u00140»\u0013}\u0013C\u0012\u0016Σ+Y"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu@v$#\\]/e0\u007f=\u0013|V\u001bJ3\u001bZ", "", "Bx_2", "", "/kV", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "5dc\u000e_.", "u(8", "5dc!l7>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class WebAuthnCredParams {
    private final int alg;
    private final String type;

    public WebAuthnCredParams(String type, int i2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.alg = i2;
    }

    public static /* synthetic */ WebAuthnCredParams copy$default(WebAuthnCredParams webAuthnCredParams, String str, int i2, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            str = webAuthnCredParams.type;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = webAuthnCredParams.alg;
        }
        return webAuthnCredParams.copy(str, i2);
    }

    public final String component1() {
        return this.type;
    }

    public final int component2() {
        return this.alg;
    }

    public final WebAuthnCredParams copy(String type, int i2) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new WebAuthnCredParams(type, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebAuthnCredParams)) {
            return false;
        }
        WebAuthnCredParams webAuthnCredParams = (WebAuthnCredParams) obj;
        return Intrinsics.areEqual(this.type, webAuthnCredParams.type) && this.alg == webAuthnCredParams.alg;
    }

    public final int getAlg() {
        return this.alg;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + Integer.hashCode(this.alg);
    }

    public String toString() {
        return "WebAuthnCredParams(type=" + this.type + ", alg=" + this.alg + ")";
    }
}
