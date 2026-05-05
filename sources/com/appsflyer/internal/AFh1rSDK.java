package com.appsflyer.internal;

import java.util.HashMap;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLc\u0003\u0010Iي8\u000b<K\u0007\"2\u0016\u007f\u0007t\u000eA0JhP.`Y2\u000fq\n:Ša:ڎs;\u0004\u0019>\u0012\u0019WTguob\\!B=\u0006&\u0001p,WX\u0011_(\u000e`D\u007fG9M}AQb\u000b53\"B*>y\u0013\u00062,^\u000f%|SS\u0012\u0012>F\t<h\f{\u0007*\u001a\f>.\b6^}MdH|e@/1\u000b\u0002Dd&\u000e2\r_\u0013Fb1%\u0003q ;@e5%'c\u00035Q\nHƄCsC\u0010v3oCW\u0001o6\u0007\u0002D\u001b9P%_\t%\u000b\u0004\u0018Է\rˏ/QiX^\u001cp\u0006\t\f%<2\u001dLЀGͶ1\u001cl\u0018\u001cD=\u0001aRh\u0002\rBF҅`ي\u001b'\u0006E9Lk|_wS\u001bd6*\u0005C#a\u0005Eėeڍ\u0012d\u001d\u001dZ\f_F\"VK`f\fo<\u001c\u0004'g@.ZΊQĬ3\u007f\u00190\u001d<Ep\n9/\u0005\u001aJZf%\u0007\u0017m\u0012m)̺J̱r\u001a?,\u000f%h^5\u001byklZB\u0010{\u001e\u000b\f<\fi؆fʟ@%-\u0012Tgv\u0004;ck\u001e=1|6\bp\"\u0012\u0016=5ڰ?Ʉg\u0014iT|*MV3\u001bf\u0003ZU\"Y\u000b*X7\u0007nfǶ\u0006ΌR\u0010\u001b4E\r*N|Q'y-T\u0013 RA+\to\\x\u0010-Sa-9mbx_ɞZʷtsozOI\u000b~rCOpM\u001b<TPjj\u0002a\u000bUͦ\někPONr2\u0004o"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b\u0004\u0013\u0014?S", "", "", ">/", "", ">0", ">1", ">2", ">3", ">4", ">5", "", ">6", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0012c\b'7i\u001f\u00044H7|0g\u001cdj;P@6X}'CU$\u0013aN\u00049]\u0019V\u0017Pti\u000fcH$jM\r\u0006\r(Z}\u0005o|\u0015\u0018W\u0012tzIV\fPO{z=:d\u0010`[\u0003I\u000b3q7h\u0015arC?65\u0010; \u0017qRwf\u0006]\u0018rN\u0003=NL\u0015\f4mN|_M\u000fWQGJj\u0010", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "1n\\=b5>\\(L", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "\u000fE01E,OS\"\u000fz=(\f\u0005", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "5dc\u001fX=>\\)~", "1n\\=b5>\\(K", "1n\\=b5>\\(J", "\u001aiPCTuNb\u001d\u0006DF(\b^", "/qT\u000e_3\u001fW\u0019\u0006yl\u001dx\u00103d"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFh1rSDK {
    public Boolean AFAdRevenueData;
    public Map<String, Object> component1;
    public Boolean component2;
    public String component3;
    public String getCurrencyIso4217Code;
    public Boolean getMediationNetwork;
    public Boolean getMonetizationNetwork;
    public Boolean getRevenue;

    public AFh1rSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    private AFh1rSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getCurrencyIso4217Code = str;
        this.getRevenue = bool;
        this.AFAdRevenueData = bool2;
        this.getMediationNetwork = bool3;
        this.getMonetizationNetwork = bool4;
        this.component3 = str2;
        this.component2 = bool5;
        this.component1 = map;
    }

    public /* synthetic */ AFh1rSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : str, (i2 + 2) - (i2 | 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : bool2, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : bool3, (i2 + 16) - (i2 | 16) != 0 ? null : bool4, (i2 + 32) - (i2 | 32) != 0 ? null : str2, (-1) - (((-1) - i2) | ((-1) - 64)) == 0 ? bool5 : null, (i2 + 128) - (i2 | 128) != 0 ? new HashMap() : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFh1rSDK)) {
            return false;
        }
        AFh1rSDK aFh1rSDK = (AFh1rSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1rSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getRevenue, aFh1rSDK.getRevenue) && Intrinsics.areEqual(this.AFAdRevenueData, aFh1rSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMediationNetwork, aFh1rSDK.getMediationNetwork) && Intrinsics.areEqual(this.getMonetizationNetwork, aFh1rSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.component3, aFh1rSDK.component3) && Intrinsics.areEqual(this.component2, aFh1rSDK.component2) && Intrinsics.areEqual(this.component1, aFh1rSDK.component1);
    }

    public final int hashCode() {
        String str = this.getCurrencyIso4217Code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.getRevenue;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.AFAdRevenueData;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getMediationNetwork;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.getMonetizationNetwork;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.component3;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.component2;
        return ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + this.component1.hashCode();
    }

    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.getCurrencyIso4217Code + ", isLimited=" + this.getRevenue + ", isEnabled=" + this.AFAdRevenueData + ", isGaidWithGps=" + this.getMediationNetwork + ", isGaidWithSamsungCloudDev=" + this.getMonetizationNetwork + ", gaidError=" + this.component3 + ", retry=" + this.component2 + ", metadata=" + this.component1 + ")";
    }
}
