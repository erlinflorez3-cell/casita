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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":\u0016\u007f\u0007lvA0RnP.XS2\u000fy\u0002<$a$wٓAkڼ.\"7N\u000f\rwtXZ#E%\u0005Dyz0WW\u0011]@\u0010BF}BKM\u001eAId\u0003;\u001d `#أ}\u0005\u000f rQ\u001e\u0004\u0013Ea\u000b@1\u0007È;\u001b\u0014[\u00132\u00124?fӼ\u001f%n\\E`l\f>uޑ\u00042I\\7w0+NSцUo>\u0005r6+nʺe\u001d+S\u0011\u0007j]U\u0002mrm\u000bn'5-as\u00067\t\u0006\u001a\u00159R%]!*\r\u000bW`\u001a,CO\u0012L\u0017˲'@\f\n\u001fT\u0004<\u0019WN<A2h\u001e\ras9նA\u0019\tlW\u0018z\u0010L]Բ~{2G2~Q\u0010<_آ6L\u0016\u001b\u001e;\u0003\u0005 \nU\u05f8d\u001b#Ƙ\u0010S7XNE\u0019]\u0018\\Um2tĊ\u00060\f\u0382_\u00025\u0005\u001f8g4E`Q#OlɘLJoϸ\u001dbn^wZ\u0019O0p.7X\nɔ^Jlʍ\u0004RZd:\u0019ܜ l"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_8QB95\u0016\u001e$D_7\u0007q:=\u0001-GU;,j]|F\"\u00120", "", "/bR2f:8b#\u0005zg", "", "BnZ2a&Mg$~", "3w_6e,LM\u001d\b", "", "Ab^=X", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\r4H7|0g\u001cdj;PQ;[z0I\"\u0012\u001d", "5dc\u000eV*>a'x\nh2|\u0012", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0012k7B`\u0019\rtb5", "u(3", "5dc V6IS", "5dc!b2>\\\u0013\u000e\u000fi,", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class GetAccessTokenResponse {
    private final String access_token;
    private final double expires_in;
    private final String scope;
    private final String token_type;

    public GetAccessTokenResponse(String str, String token_type, double d2, String scope) {
        Intrinsics.checkNotNullParameter(token_type, "token_type");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.access_token = str;
        this.token_type = token_type;
        this.expires_in = d2;
        this.scope = scope;
    }

    public static /* synthetic */ GetAccessTokenResponse copy$default(GetAccessTokenResponse getAccessTokenResponse, String str, String str2, double d2, String str3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            str = getAccessTokenResponse.access_token;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = getAccessTokenResponse.token_type;
        }
        if ((4 & i2) != 0) {
            d2 = getAccessTokenResponse.expires_in;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            str3 = getAccessTokenResponse.scope;
        }
        return getAccessTokenResponse.copy(str, str2, d2, str3);
    }

    public final String component1() {
        return this.access_token;
    }

    public final String component2() {
        return this.token_type;
    }

    public final double component3() {
        return this.expires_in;
    }

    public final String component4() {
        return this.scope;
    }

    public final GetAccessTokenResponse copy(String str, String token_type, double d2, String scope) {
        Intrinsics.checkNotNullParameter(token_type, "token_type");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new GetAccessTokenResponse(str, token_type, d2, scope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAccessTokenResponse)) {
            return false;
        }
        GetAccessTokenResponse getAccessTokenResponse = (GetAccessTokenResponse) obj;
        return Intrinsics.areEqual(this.access_token, getAccessTokenResponse.access_token) && Intrinsics.areEqual(this.token_type, getAccessTokenResponse.token_type) && Intrinsics.areEqual((Object) Double.valueOf(this.expires_in), (Object) Double.valueOf(getAccessTokenResponse.expires_in)) && Intrinsics.areEqual(this.scope, getAccessTokenResponse.scope);
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final double getExpires_in() {
        return this.expires_in;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getToken_type() {
        return this.token_type;
    }

    public int hashCode() {
        String str = this.access_token;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.token_type.hashCode()) * 31) + Double.hashCode(this.expires_in)) * 31) + this.scope.hashCode();
    }

    public String toString() {
        return "GetAccessTokenResponse(access_token=" + this.access_token + ", token_type=" + this.token_type + ", expires_in=" + this.expires_in + ", scope=" + this.scope + ")";
    }
}
