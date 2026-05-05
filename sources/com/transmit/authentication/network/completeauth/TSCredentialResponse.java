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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4O\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004`e \f\"!Qdf\u0016oZ^\u0019E'\u0006Dyz0WX\u0011]@\u0010BF}CKM\u001e>˃dtD\nh;0C\u0012\u0007\u0017\u0019XIVΓ{\fR\u001a\u001eH@\u001f;\u0019ӏNM! \u0013V /\u001f#ʨO~OzkR/Q\u00040ŰOo\u0011>\fe\rtÖW\u0015|a,+X9K\u0014ST3\rX[M\u0005Wqk\u0006\u0019--+Wvo6\u0007\u0001D\u001b1O\u001ba\u000b&\u000b\u0006\u0018ԧ\u000bo<]scP<9(\u0001\n\u001fT\u0006$\u0005UGtǽ\u001b/\u000f\u001cF\rr\u0002T\u0017ٳ]\u000b\u0007\tvN\u0017S\u0001yۖ8kw_aS\u001bd6*\u0006ڟ\")\t͙9]Z\u0014n\u001ckc\u0006UIQn>˓R\u0010aƝ\u0006\u0006vj\u00101T?U\u0002G{?/ϲ)=cݽ;#q\u000bVK8\u0006\u0013c\u0001S\u0018S͕D(vݫO,\u000f\u0016hK\u0087\t\u0002"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015dqH\n-\u001b<T4GKN5kVnD\u0001\u0012h\u0019X4\u001b\u0005/", "", "1qT1X5MW\u0015\u0006tb+", "", ">tQ9\\*8Y\u0019\u0013", "@dV6f;>`\u0019}tZ;", ":`bAR<LS\u0018", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCy25", "5dc\u0010e,=S\"\u000e~Z3v\r.", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0019T:MM)\rz]", "5dc\u001dh)EW\u0017x\u0001^@", "5dc\u001fX.Ba(~\b^+v\u0005>", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class TSCredentialResponse {
    private final String credential_id;
    private final String last_used;
    private final String public_key;
    private final String registered_at;

    public TSCredentialResponse(String str, String public_key, String registered_at, String last_used) {
        Intrinsics.checkNotNullParameter(public_key, "public_key");
        Intrinsics.checkNotNullParameter(registered_at, "registered_at");
        Intrinsics.checkNotNullParameter(last_used, "last_used");
        this.credential_id = str;
        this.public_key = public_key;
        this.registered_at = registered_at;
        this.last_used = last_used;
    }

    public static /* synthetic */ TSCredentialResponse copy$default(TSCredentialResponse tSCredentialResponse, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = tSCredentialResponse.credential_id;
        }
        if ((2 & i2) != 0) {
            str2 = tSCredentialResponse.public_key;
        }
        if ((4 & i2) != 0) {
            str3 = tSCredentialResponse.registered_at;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            str4 = tSCredentialResponse.last_used;
        }
        return tSCredentialResponse.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.credential_id;
    }

    public final String component2() {
        return this.public_key;
    }

    public final String component3() {
        return this.registered_at;
    }

    public final String component4() {
        return this.last_used;
    }

    public final TSCredentialResponse copy(String str, String public_key, String registered_at, String last_used) {
        Intrinsics.checkNotNullParameter(public_key, "public_key");
        Intrinsics.checkNotNullParameter(registered_at, "registered_at");
        Intrinsics.checkNotNullParameter(last_used, "last_used");
        return new TSCredentialResponse(str, public_key, registered_at, last_used);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TSCredentialResponse)) {
            return false;
        }
        TSCredentialResponse tSCredentialResponse = (TSCredentialResponse) obj;
        return Intrinsics.areEqual(this.credential_id, tSCredentialResponse.credential_id) && Intrinsics.areEqual(this.public_key, tSCredentialResponse.public_key) && Intrinsics.areEqual(this.registered_at, tSCredentialResponse.registered_at) && Intrinsics.areEqual(this.last_used, tSCredentialResponse.last_used);
    }

    public final String getCredential_id() {
        return this.credential_id;
    }

    public final String getLast_used() {
        return this.last_used;
    }

    public final String getPublic_key() {
        return this.public_key;
    }

    public final String getRegistered_at() {
        return this.registered_at;
    }

    public int hashCode() {
        String str = this.credential_id;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.public_key.hashCode()) * 31) + this.registered_at.hashCode()) * 31) + this.last_used.hashCode();
    }

    public String toString() {
        return "TSCredentialResponse(credential_id=" + this.credential_id + ", public_key=" + this.public_key + ", registered_at=" + this.registered_at + ", last_used=" + this.last_used + ")";
    }
}
