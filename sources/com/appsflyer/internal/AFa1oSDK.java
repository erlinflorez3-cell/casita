package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLc\u0003\rIي8\u000bDB\u0007\"2\u0015\u007f\u0007tpA0JeP.`_2\u000fq\u0003:Ša:ڎs;\u0004\u0019>=\u0019UTguobZ9C\u001f\u000e\u001cxx/aW\u000f\\@\u0011̓FqE7[t\u0006QnzN\u0005N2R>\b\u0006\u0019\u001c@G>uAƦLë\u00162FvHYU[\u0013#*\u0006l(Gɽ[ʄR8NukDw1\u0011uZNUjvƿLϘJV-\u0019\u0005nn?NGM\u0017;R1\t\t`\u0016ũAџA\tp)-9W\u0003(Nf\u000e,\u0015YOCbI̮^ԇUj\u0014)1`q]h\u0010.\u000b\t\u0010"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\n\b\u0001\u0013\u0014?S", "", "", ">/", "\u001ab^:\"(I^'\u007f\u0002r,\nR.e\u007f3\u0003D\n\u001d`&o\u000eG])>_S", ">0", "\nh]6g\u0005", "uY;0b4\bO$\n\t_3\u0011\t</~({K\b\u001b M9l<v0\u001c]\u0007&\r1\u0007", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "\u001ab^:\"(I^'\u007f\u0002r,\nR.e\u007f3\u0003D\n\u001d`&o\u000eG])>_S", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "(", "\u000fE01E,OS\"\u000fz=(\f\u0005", "u(I"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFa1oSDK {
    private final boolean getCurrencyIso4217Code;
    public final DeepLink getMonetizationNetwork;

    public AFa1oSDK() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public AFa1oSDK(boolean z2, DeepLink deepLink) {
        this.getCurrencyIso4217Code = z2;
        this.getMonetizationNetwork = deepLink;
    }

    public /* synthetic */ AFa1oSDK(boolean z2, DeepLink deepLink, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? true : z2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : deepLink);
    }

    public final boolean AFAdRevenueData() {
        return this.getCurrencyIso4217Code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFa1oSDK)) {
            return false;
        }
        AFa1oSDK aFa1oSDK = (AFa1oSDK) obj;
        return this.getCurrencyIso4217Code == aFa1oSDK.getCurrencyIso4217Code && Intrinsics.areEqual(this.getMonetizationNetwork, aFa1oSDK.getMonetizationNetwork);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z2 = this.getCurrencyIso4217Code;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = r02 * 31;
        DeepLink deepLink = this.getMonetizationNetwork;
        return i2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    public final String toString() {
        return "DdlResponse(secondPing=" + this.getCurrencyIso4217Code + ", deepLink=" + this.getMonetizationNetwork + ")";
    }
}
