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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007f\u0007lvA0RnP.XS2\u000fy\u0002<$a$w٘Akڼ.\"7N\u000f\u000bwrXZ#C=\u0007&|x.aU'^\"\u0013@E\b?aQ\u007fAGe\r63!ݨ&8\b\u000bI!8U(v)D\u0012ď\u0013xG~Hj\r{\u0006`Ǝ\u0007\u0007'\u000f-tg|:\u000fȔ^\u000361\u0013\u0002B|(&ݥ}\u0016<Te?\r%ѭN1F7C\u0015=S1\b\u0003aE\u0003MsU\u0005\u0017(W1Ose9p\u007fB\u0019[U\u0013]\u0001+t\u0005\u007faR˳*\u0018tYb&(&\u000e,\u0013J\u0018&\b=G\\,`Ȩ\tV:\u0003\bk@~\u0018%ܤ~ChD.=\u007fa,\u007fԬe\"pI\u0019f7*\u0006ڟ\")\t͙9]Z\u0015n\u001dkc\u0006SIQn>˓R\u0010aƝ\u0006\u0006vk\u00102T?U\u0003G{?2ϲ)=cݽ;#q\fVO8\u0006\u0013e\u0001S\u0018S͕D(vݫO,\u000f\u0018hL\u0087\t\u0004"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PR\u001a;v)2\\K3`PX=(og\u000eM+\u0016\u0014]=+D", "", "7c", "", "@`f\u0016W", "@db=b5LS", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PR\u001a;v)2\\K3`PX=(og\u000eM+\u0016\u0014]=+[DE*\u00125W\u0002\u0011", "Bx_2", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015KMC5C+\u0011qoA\u000bruJ\u00076JLW;`PnL\u0018\u001ccWW+\u001c\u0017cN*8BA'\u00133I\u0011;u\u0001\u000e_|#WpDA D\u0001\u0019s')|$f_xGJTf&kx_+gDC2\u0014G\u007f da*S\u0003O\u001at\u001cgvtK\"|\u000eg/", "5dc\u0016W", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001fT>\"R", "5dc\u001fX:I]\"\rz", "u(;0b4\bb&z\u0004l4\u0001\u0018xa\u00107~@\n&\u001bEk\u001d@\u0001.~b}/Iw#4\u0017AEs?%\u0015waF\u0007eu=d\u0014GN9<YYv;y\u0012nk[+\f\u0005bP(jK$\u001f\u00167S\u000bIhV", "5dc!l7>", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class TSRegPublicKeyCredential {
    private final String id;
    private final String rawId;
    private final TSRegPublicKeyCredentialResponse response;
    private final String type;

    public TSRegPublicKeyCredential(String id, String rawId, TSRegPublicKeyCredentialResponse response, String type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(rawId, "rawId");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.rawId = rawId;
        this.response = response;
        this.type = type;
    }

    public static /* synthetic */ TSRegPublicKeyCredential copy$default(TSRegPublicKeyCredential tSRegPublicKeyCredential, String str, String str2, TSRegPublicKeyCredentialResponse tSRegPublicKeyCredentialResponse, String str3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = tSRegPublicKeyCredential.id;
        }
        if ((2 & i2) != 0) {
            str2 = tSRegPublicKeyCredential.rawId;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            tSRegPublicKeyCredentialResponse = tSRegPublicKeyCredential.response;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            str3 = tSRegPublicKeyCredential.type;
        }
        return tSRegPublicKeyCredential.copy(str, str2, tSRegPublicKeyCredentialResponse, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.rawId;
    }

    public final TSRegPublicKeyCredentialResponse component3() {
        return this.response;
    }

    public final String component4() {
        return this.type;
    }

    public final TSRegPublicKeyCredential copy(String id, String rawId, TSRegPublicKeyCredentialResponse response, String type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(rawId, "rawId");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(type, "type");
        return new TSRegPublicKeyCredential(id, rawId, response, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TSRegPublicKeyCredential)) {
            return false;
        }
        TSRegPublicKeyCredential tSRegPublicKeyCredential = (TSRegPublicKeyCredential) obj;
        return Intrinsics.areEqual(this.id, tSRegPublicKeyCredential.id) && Intrinsics.areEqual(this.rawId, tSRegPublicKeyCredential.rawId) && Intrinsics.areEqual(this.response, tSRegPublicKeyCredential.response) && Intrinsics.areEqual(this.type, tSRegPublicKeyCredential.type);
    }

    public final String getId() {
        return this.id;
    }

    public final String getRawId() {
        return this.rawId;
    }

    public final TSRegPublicKeyCredentialResponse getResponse() {
        return this.response;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.rawId.hashCode()) * 31) + this.response.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "TSRegPublicKeyCredential(id=" + this.id + ", rawId=" + this.rawId + ", response=" + this.response + ", type=" + this.type + ")";
    }
}
