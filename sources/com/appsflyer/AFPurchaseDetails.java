package com.appsflyer;

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
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLc\u000b\u0004Iي8\u000b<N\u0007\"2\u001c\u007f\u0007tsA0JeP.`Y2\u000fq\u0002:Ša:ڎs;\u0004\u0019>?\u0019S\\h\u007fnxZ\u001bG\u001d\t.x\u0019.YY\u0007a*\u000f`DņC5StK?)\u0003D\f82P8@ۖ\u0002ʀ.J\u0016}\tK\u0014\u001a 9XphTŞ\u0006ܨ\u0016\bD)\u000f(%u\\A`l\f<uޒ\u0004ݦFP-j>\u0007\u00169T`?\r%ѭN1F7C\u0016=S1\u0007\u0003aE\u0003MtU\u0005\u0017)W1Ose:p\u007fB\u0017qͅ\fǁv(b\u0011_mT?9_{K~\u001dX}\t\n%>\u001a\r4&\u000fΪ.բj\n\u0014C\u0003\u0004\u001cN^\u0015vB.\r(پ\u0016Ӿ\u000451L)z\u001aoI.f7*\u0007Sͬ\"ъr#ai\u001cje3b{i1\u007fBsM%˫[ǀq\u000exd\b.\u0012F_\u00025\u0013\u001f8g=E^Q#Om8M\u001bϡxݶdr[kXKN8\u0007\u0018=B\u0017\u0016+\\r\u0006\u0004P\u0003Xb\u0016$ɄVΘ\u0002\u0012\u001b\"bxJ:=\u0012Tivq"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bFj8\t>\u0004\u0013%GN\u000eKr)<gS", "", "\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bFj8\t>\u0004\u0013%G^\"Gvz", ">ta0[(LS\b\u0013\u0006^", "", ">ta0[(LS\b\t\u0001^5", ">q^1h*M7\u0018", "\nh]6g\u0005", "uKR<`u:^$\r{e@|\u0016xA`\u0013\fM~\u001a\u0013Uo|P\u0002%\u000b@\u0003\u001cHi_5IL=5\"-\"lj;\\J1J\b#\u0011SJ5^\u001c`L!\u0016c\u0010$n}", "1n\\=b5>\\(J", "u(;0b4\bO$\n\t_3\u0011\t</[\tfP\u000e\u0015\u001aC}\u000e+\u000b05/", "1n\\=b5>\\(K", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(L", "1n_F", "uKR<`u:^$\r{e@|\u0016xA`\u0013\fM~\u001a\u0013Uo|P\u0002%\u000b@\u0003\u001cHi_5IL=5\"-\"lj;\\J1J\b#\u0011SJ5^\u001c`L!\u0016c\u0010$ns\u0003cImjOB-\t3]\u0002H2\\l\u0001\u001eBhs>d\u0010&y$qE0v\u001c", "=sW2e", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u001de6=c\u0017\u000e^]", "5dc\u001dh9<V\u0015\rzM6\u0003\t8", "\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bFj8\t>\u0004\u0013%G^\"Gvz", "5dc\u001dh9<V\u0015\rzM@\b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFPurchaseDetails {
    private final String productId;
    private final String purchaseToken;
    private final AFPurchaseType purchaseType;

    public AFPurchaseDetails(AFPurchaseType aFPurchaseType, String str, String str2) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.purchaseType = aFPurchaseType;
        this.purchaseToken = str;
        this.productId = str2;
    }

    public static /* synthetic */ AFPurchaseDetails copy$default(AFPurchaseDetails aFPurchaseDetails, AFPurchaseType aFPurchaseType, String str, String str2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            aFPurchaseType = aFPurchaseDetails.purchaseType;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str = aFPurchaseDetails.purchaseToken;
        }
        if ((i2 & 4) != 0) {
            str2 = aFPurchaseDetails.productId;
        }
        return aFPurchaseDetails.copy(aFPurchaseType, str, str2);
    }

    public final AFPurchaseType component1() {
        return this.purchaseType;
    }

    public final String component2() {
        return this.purchaseToken;
    }

    public final String component3() {
        return this.productId;
    }

    public final AFPurchaseDetails copy(AFPurchaseType aFPurchaseType, String str, String str2) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AFPurchaseDetails(aFPurchaseType, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFPurchaseDetails)) {
            return false;
        }
        AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) obj;
        return this.purchaseType == aFPurchaseDetails.purchaseType && Intrinsics.areEqual(this.purchaseToken, aFPurchaseDetails.purchaseToken) && Intrinsics.areEqual(this.productId, aFPurchaseDetails.productId);
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final AFPurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final int hashCode() {
        return (((this.purchaseType.hashCode() * 31) + this.purchaseToken.hashCode()) * 31) + this.productId.hashCode();
    }

    public final String toString() {
        return "AFPurchaseDetails(purchaseType=" + this.purchaseType + ", purchaseToken=" + this.purchaseToken + ", productId=" + this.productId + ")";
    }
}
