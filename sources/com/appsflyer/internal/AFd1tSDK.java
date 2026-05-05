package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLc\u0003\u0014Iي8\u000b<d\u0007\":\u001e\u007fјnjG6LeN1ZS@\u000fs{:)aҕ\bّYgJ}P\b\bMy(\u001cZ^\u0019D'\u0006Dxz>WY\u0011k\"\u0011BB\u001eBCO\u007f=gc\u000b53\"B(>y\u0013\u00072*v\u0015ͯ~EQ\u0013 8\t\u0002H[%M3\u001d:\u0006l#G3֔kP<Qzg\u000bG1\u000f\u0002B|2\u0016ES։\u000fТX1\u0015xg*9MO7\u001b3a\u0012WdiP\u001b? @;>}ݧ-ʁw[NZ\u0006 #;"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\b\u0006\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\bu\u0013\u0014?S", "", ">/", "", "", ">0", "", ">1", "\nh]6g\u0005", "uZ1\u0019](OOb\u000f\nb3Fp+pU\f?1", "\u000fE01E,OS\"\u000fz=(\f\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\b{\u0013\u0014?S", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\b{\u0013\u0014?S", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "u(;0b4\bO$\n\t_3\u0011\t</\u00041\u000b@\u000e \u0013N9i\u001dup:G\\\u0006\r", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "\u000fEP}i\u001a\u001d9"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFd1tSDK extends AFc1dSDK {
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);
    public static String getMediationNetwork = "https://%smonitorsdk.%s/remote-debug/exception-manager";
    private final AFd1jSDK getCurrencyIso4217Code;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#2ߡx\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,8\u007fHSUH\u007fX\r\u000eR>˯xН^\u000fK\u0011\f\u0019\u0007n"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\b\u0006\u0013\u0014?<{\u0018ia?;\"!A", "", "\nh]6g\u0005", "u(E", "", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u001fX=>\\)~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1tSDK(byte[] bArr, Map<String, String> map, int i2) {
        super(bArr, map, i2);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getCurrencyIso4217Code = AFd1jSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final String AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AFd1rSDK.getCurrencyIso4217Code(str);
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final String getCurrencyIso4217Code() {
        String str = String.format(getMediationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final AFd1jSDK getMediationNetwork() {
        return this.getCurrencyIso4217Code;
    }
}
