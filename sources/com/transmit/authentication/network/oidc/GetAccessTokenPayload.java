package com.transmit.authentication.network.oidc;

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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4R\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004je\u001e\f\"!O|hwrX\\#C=\u0007&|x/aU'^\"\u0015@F\bAIL\u001e>If\u0003;\u001d\"H!fzڱ\u0005\u001a8NX}\tPc\f@1\u0007È;\u001b\u0014[\u00132\u00124?fӼ\u001f%n\\E`l\f;uޑ\u00042K\\7w2\u0013L;G\u001bݒ\u000e?j,<X9K\u0014STIߞS$|\u0011Q\n=3ؒW-1I\u0002WNX.\u0015E1U\rkt>\\3R\u0011\u0012-+]fcP<)(\u0003\u0002\rJ\b&\b=G\\.Jn\u000e\u000eAy\u000bUVO0_\tɜy*G%8\u00183YMKl_vS\u001bd6*\u0004Sͫ$Iu/ql\u000e\u000f,aǯv\u001a8_XUH|\u000b ǴlT\u007fp\u0002B\u0004^HĬ3\u0002\u0019ф/'=bG+qz\u0010J\\g%\u0006¾lYqɭ`B(w$?z\u001a\u001a^\\f\u001bj~Uг0\u0017Uȼl\t\u0004\u0012!(-\u0007J$=\u0010|PŹmpUΪ\"'5qEa?|\u001c\\Q`I4\u007fdߧeX~ܝW>h\u0011fnͤW%"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_8QB95\u0016\u001e$D_7\u0007q:=\u0001-GU9(pY|9\u0013g", "", "1kX2a;8W\u0018", "", "1kX2a;8a\u0019|\b^;", "5qP;g&Mg$~", "1nS2", "@dS6e,<b\u0013\u000f\bb", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCyUI30\u0004uP}DjJy%\u001b9sr\u0018\u001a\u0001", "5dc\u0010_0>\\(x~]", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010_0>\\(x\t^*\n\t>", "5dc\u0010b+>", "5dc\u0014e(Gb\u0013\u000e\u000fi,", "5dc\u001fX+B`\u0019|\nX<\n\r", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class GetAccessTokenPayload {
    private final String client_id;
    private final String client_secret;
    private final String code;
    private final String grant_type;
    private final String redirect_uri;

    public GetAccessTokenPayload(String client_id, String client_secret, String grant_type, String str, String str2) {
        Intrinsics.checkNotNullParameter(client_id, "client_id");
        Intrinsics.checkNotNullParameter(client_secret, "client_secret");
        Intrinsics.checkNotNullParameter(grant_type, "grant_type");
        this.client_id = client_id;
        this.client_secret = client_secret;
        this.grant_type = grant_type;
        this.code = str;
        this.redirect_uri = str2;
    }

    public static /* synthetic */ GetAccessTokenPayload copy$default(GetAccessTokenPayload getAccessTokenPayload, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            str = getAccessTokenPayload.client_id;
        }
        if ((2 & i2) != 0) {
            str2 = getAccessTokenPayload.client_secret;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            str3 = getAccessTokenPayload.grant_type;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            str4 = getAccessTokenPayload.code;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            str5 = getAccessTokenPayload.redirect_uri;
        }
        return getAccessTokenPayload.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.client_id;
    }

    public final String component2() {
        return this.client_secret;
    }

    public final String component3() {
        return this.grant_type;
    }

    public final String component4() {
        return this.code;
    }

    public final String component5() {
        return this.redirect_uri;
    }

    public final GetAccessTokenPayload copy(String client_id, String client_secret, String grant_type, String str, String str2) {
        Intrinsics.checkNotNullParameter(client_id, "client_id");
        Intrinsics.checkNotNullParameter(client_secret, "client_secret");
        Intrinsics.checkNotNullParameter(grant_type, "grant_type");
        return new GetAccessTokenPayload(client_id, client_secret, grant_type, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAccessTokenPayload)) {
            return false;
        }
        GetAccessTokenPayload getAccessTokenPayload = (GetAccessTokenPayload) obj;
        return Intrinsics.areEqual(this.client_id, getAccessTokenPayload.client_id) && Intrinsics.areEqual(this.client_secret, getAccessTokenPayload.client_secret) && Intrinsics.areEqual(this.grant_type, getAccessTokenPayload.grant_type) && Intrinsics.areEqual(this.code, getAccessTokenPayload.code) && Intrinsics.areEqual(this.redirect_uri, getAccessTokenPayload.redirect_uri);
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public final String getClient_secret() {
        return this.client_secret;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getGrant_type() {
        return this.grant_type;
    }

    public final String getRedirect_uri() {
        return this.redirect_uri;
    }

    public int hashCode() {
        int iHashCode = ((((this.client_id.hashCode() * 31) + this.client_secret.hashCode()) * 31) + this.grant_type.hashCode()) * 31;
        String str = this.code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redirect_uri;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GetAccessTokenPayload(client_id=" + this.client_id + ", client_secret=" + this.client_secret + ", grant_type=" + this.grant_type + ", code=" + this.code + ", redirect_uri=" + this.redirect_uri + ")";
    }
}
