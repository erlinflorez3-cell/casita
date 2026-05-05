package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLc\u0003\u000bIي8\u000b<G\u0007Ӭ4\u0012\u0006%njG<L͜P.`Y2\u000fq~<$i-yCAd Ԃ8ޛ\u007fN\u0016f/\f`\u0010S\u0013\u0014\u0017\u0011jZIe~c\u0012\u001d5Zom5]{C9nzN\u000b0428(\n/\u001e:L\u001e~\u0013Cy\u0013\"4NyRR;R\u0015\u001e \u0010V /#֔kP<Szi\u0003G1\u0011\u0002B|4\u00106\u000bN%Hj&;u(ӳ+Ë;7\u001b3a\u0012O_iO\u001b? DK|Ҋ+-O\u0004eG)\u000f\")CO;j)kػ\tUx\u000e-=]v\u001cb\u001c?\u0010z*\u0012r\td\u0382)ρ21\"h\u000e#A\u000bCeNb\u001a^p\u00071e\rЕ'ő7/A\u001dlioTi`E\u0014\u001d\rL%7rwƄV\u05f8d\u0019#V}e?k\u0011OVc\"Ykr:u9̫,˙4K\b1\u0002,<-uOiV;'{\u0004XD\u0016{3d\u001fW@ɵJغ&r\u001e90\u001b\u001av\u0015v\u0013\u0007hT\u0007,GQrΉ\tą\f\u0017(^}S/C"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0012\b\n\u0013\u0014?S", "", "", ">/", "", ">0", "", "", ">1", "", ">2", ">3", ">4", "\nh]6g\u0005", "uI5\u0019](OOb\u000f\nb3Fo3s\u000f}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"\u0012\u001d", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "6`b566=S", "u(8", "\u000fE01E,OS\"\u000fz=(\f\u0005", "u(I", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u001fX=>\\)~", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "\u0017", "\u0014", "1n\\=b5>\\(M", "\u001aiPCTuNb\u001d\u0006DE0\u000b\u0018\u0005", "1n\\=b5>\\(J", "\u0018"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFi1xSDK {
    public List<String> AFAdRevenueData;
    public final String component4;
    public final String getCurrencyIso4217Code;
    public final float getMediationNetwork;
    public final int getMonetizationNetwork;
    public long getRevenue;

    public AFi1xSDK(long j2, float f2, List<String> list, int i2, String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getRevenue = j2;
        this.getMediationNetwork = f2;
        this.AFAdRevenueData = list;
        this.getMonetizationNetwork = i2;
        this.getCurrencyIso4217Code = str;
        this.component4 = str2;
    }

    public final boolean AFAdRevenueData() {
        return TimeUnit.SECONDS.toMillis(this.getRevenue) > AFa1ySDK.getRevenue().getMonetizationNetwork().component3().getCurrencyIso4217Code();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFi1xSDK aFi1xSDK = (AFi1xSDK) obj;
        return this.getRevenue == aFi1xSDK.getRevenue && this.getMediationNetwork == aFi1xSDK.getMediationNetwork && Intrinsics.areEqual(this.AFAdRevenueData, aFi1xSDK.AFAdRevenueData) && this.getMonetizationNetwork == aFi1xSDK.getMonetizationNetwork && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1xSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.component4, aFi1xSDK.component4);
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.getRevenue) * 31) + Float.hashCode(this.getMediationNetwork)) * 31) + this.AFAdRevenueData.hashCode()) * 31) + this.getMonetizationNetwork) * 31) + this.getCurrencyIso4217Code.hashCode()) * 31) + this.component4.hashCode();
    }
}
