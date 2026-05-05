package com.appsflyer.internal;

import java.util.Map;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<R\u0007Ӭ4\u0012\u0006)njG<L͜P.`Y2\u000fq~<$q$yCAY\"}0\u0012WNmj\u0005Ϻ\u000b\u000bq\u000eFO~o<Mcyu\u0012=2RsM6eok;p\t<\u0005.8:F\n\u0007\u0011\u001aXM x\u000bCy\u0011(/ntJX\u0013M\u0013\"*\u0006l'Ә\"^mWDR5nH:;\u0003\u0018Gv'\u000e5CbϘJV-\u0018\u0005mnCNIM\u0015S`9\u001c)ÑAƄC{E\u0007n55:au]Ff\u0011d'9_%]!&\u0013\t(Ө\u000eˏ/SkMV\u001e6\u000bK\u0014\u001bG\u001c\u000e4;~C\u0004\u0557)ڿ\u0012=|tYR^\u0017vD\u0006\u0011oMg7\u000eLC9Ik\b7\u0012ϡPѼ\u007f\t% )\u0013|9"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\b|\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\bu\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", ">/", "", ">0", "", "", ">1", "", ">2", "\nh]6g\u0005", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn:B/#8cu-J|3IT75D-\u0019o+!\u0003n\u00022:\u0018", "\u000fE01E,OS\"\u000fz=(\f\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\b{\u0013\u0014?S", "1n\\=b5>\\(M", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\b{\u0013\u0014?S", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "u(;0b4\bO$\n\t_3\u0011\t</\u00041\u000b@\u000e \u0013N9i\u001dup:G\\\u0006\r", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", "", "(", "5dc\u001fX=>\\)~", "u(I", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFd1kSDK extends AFc1dSDK {
    private final AFd1jSDK component4;
    private final boolean getCurrencyIso4217Code;
    public AFc1oSDK getMediationNetwork;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFd1kSDK(AFc1oSDK aFc1oSDK, byte[] bArr) {
        this(aFc1oSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFd1kSDK(AFc1oSDK aFc1oSDK, byte[] bArr, Map<String, String> map, int i2) {
        super(bArr, map, i2);
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMediationNetwork = aFc1oSDK;
        this.component4 = AFd1jSDK.OCTET_STREAM;
    }

    public /* synthetic */ AFd1kSDK(AFc1oSDK aFc1oSDK, byte[] bArr, Map map, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1oSDK, bArr, (i3 + 4) - (4 | i3) != 0 ? null : map, (-1) - (((-1) - i3) | ((-1) - 8)) != 0 ? 2000 : i2);
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final String AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: " + str;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final String getCurrencyIso4217Code() {
        AFj1cSDK aFj1cSDK = new AFj1cSDK(this.getMediationNetwork, null, 2, 0 == true ? 1 : 0);
        return aFj1cSDK.getMediationNetwork(aFj1cSDK.getRevenue.getMediationNetwork(AFj1cSDK.component3));
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFd1jSDK getMediationNetwork() {
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final boolean getRevenue() {
        return this.getCurrencyIso4217Code;
    }
}
