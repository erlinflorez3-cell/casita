package com.appsflyer;

import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFh1ySDK;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLc\u0003\u0010Iي8\u000bDB\u0007\"2\u0012\u007f\u0007tnA0JfP.`\\2\u000fq\b<$i*yCA^ ԉ(\u001fѧ~g\u0016m\u000b\u007f\u001bG\u001d\u0007.x\u0019,YY\u0007`*\u000f`D\u007fCAQ\b=g`\u0005:\u0013&J\"f~ڱ\u0005\u001c0O\u001e~CNY\u0016*0nyĐV\u000fS\u000f(\u001dNL.\r6\\\u0016N|էmҺ>1)\u000fwO\u00175m>\u0015M;H\u001bݓ\u000ețe 1NED]3a\u0013\u001fR\n?IԒrݘ\tj-79V<eDi\u0018\u0014C0\u0016֜^ę*^\u000bbn\u001eoa]vcP<ߊ(\u0001\u0002\rJ\u0005&\u0006UH^3 f\u0016\u0011Kt!UpV\b^P\u0004\u0013ad\u0017U\u00069+G!~Q\u0010@_ؓ6߉\t\u000f$6\u000f\u0003isb$x\u0015I](W?fX?^M8X\u0004Ѿ\u0005Ͳf\u00040\u001a>^H=\n*F\u0017SO\"ߔ\"\u074co\u0004N]u\u0011Mmvn\u0002RvIhnގ;,\u000f'hO-\u0013yllXZ\u0011\u0014ʔSΘ\u0002\n\u0019<j\u0005\r93\u0014fO\u0017i!R4܋'çjAapq\u0012eVv5;oq\u001d2j\u0005\u0017W<\u0011\u0007\u000fk\u0019͵\u000eȺ`2*4Nm\u001e\u0017\u0014FT,!A\u0010\n*5D1G\\KMY٤D˩\u0001\u0013g\\n\u0011\rqK&\t\u000b2\u0002Y\u0019^b\to\u0016}\u007f1Sʨ$έE[=\u001b,[0\u000bL~)*\r\u0006"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bF['h@\u0012\u0017 Wol8\u0006!\u000b", "", "", ";n]2g0SO(\u0003\u0005g\u0015|\u0018Ao\r.", "\u001ab^:\"(I^'\u007f\u0002r,\nR\u0017e~,wO\u0005! 0o\u001dN\u00012;/", ";dS6T;B]\"gzm>\u0007\u00165", "1ta?X5<g|\r\u0005-xHZ\ro~(", "", "@de2a<>", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`Cz\u0019Jw,IY\u000bi\u001fm\u00152IR?u=\u0007\u0015wsC\u0014i\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bc\u001d2", "", "/qT\u000e_3\u001fW\u0019\u0006yl\u001dx\u00103d", "u(I", "1n\\=b5>\\(J", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(K", "u(;0b4\bO$\n\t_3\u0011\t</g(zD|&\u001bQxv<\u00067?f\u0004u", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "u(3", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`Cz\u0019Jw,IY\u000bi\u001fm\u00152IR?u=\u0007\u0015wsC\u0014i\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bc\u001d(\"xL\u0001\u001b\u00137W\u0003B|\u0001\u0019_i\u0016Fo/V!G\u0003%u %wB/", "=sW2e", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "\u000fE01E,OS\"\u000fz=(\f\u0005", "BnBAe0GU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "\u001ab^:\"(I^'\u007f\u0002r,\nR\u0017e~,wO\u0005! 0o\u001dN\u00012;/", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "\u0012", "5dc\u001fX=>\\)~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFAdRevenueData {
    private final String currencyIso4217Code;
    private final MediationNetwork mediationNetwork;
    private final String monetizationNetwork;
    private final double revenue;

    public AFAdRevenueData(String str, MediationNetwork mediationNetwork, String str2, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mediationNetwork, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.monetizationNetwork = str;
        this.mediationNetwork = mediationNetwork;
        this.currencyIso4217Code = str2;
        this.revenue = d2;
    }

    private final boolean AFAdRevenueData() {
        try {
            Currency.getInstance(this.currencyIso4217Code);
            return true;
        } catch (Throwable unused) {
            AFh1ySDK.w$default(AFLogger.INSTANCE, AFg1cSDK.AD_REVENUE, "Currency is not ISO 4217 currency code", false, 4, null);
            return false;
        }
    }

    public static /* synthetic */ AFAdRevenueData copy$default(AFAdRevenueData aFAdRevenueData, String str, MediationNetwork mediationNetwork, String str2, double d2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = aFAdRevenueData.monetizationNetwork;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            mediationNetwork = aFAdRevenueData.mediationNetwork;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            str2 = aFAdRevenueData.currencyIso4217Code;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            d2 = aFAdRevenueData.revenue;
        }
        return aFAdRevenueData.copy(str, mediationNetwork, str2, d2);
    }

    public final boolean areAllFieldsValid() {
        return !StringsKt.isBlank(this.monetizationNetwork) && AFAdRevenueData();
    }

    public final String component1() {
        return this.monetizationNetwork;
    }

    public final MediationNetwork component2() {
        return this.mediationNetwork;
    }

    public final String component3() {
        return this.currencyIso4217Code;
    }

    public final double component4() {
        return this.revenue;
    }

    public final AFAdRevenueData copy(String str, MediationNetwork mediationNetwork, String str2, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mediationNetwork, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AFAdRevenueData(str, mediationNetwork, str2, d2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFAdRevenueData)) {
            return false;
        }
        AFAdRevenueData aFAdRevenueData = (AFAdRevenueData) obj;
        return Intrinsics.areEqual(this.monetizationNetwork, aFAdRevenueData.monetizationNetwork) && this.mediationNetwork == aFAdRevenueData.mediationNetwork && Intrinsics.areEqual(this.currencyIso4217Code, aFAdRevenueData.currencyIso4217Code) && Double.compare(this.revenue, aFAdRevenueData.revenue) == 0;
    }

    public final String getCurrencyIso4217Code() {
        return this.currencyIso4217Code;
    }

    public final MediationNetwork getMediationNetwork() {
        return this.mediationNetwork;
    }

    public final String getMonetizationNetwork() {
        return this.monetizationNetwork;
    }

    public final double getRevenue() {
        return this.revenue;
    }

    public final int hashCode() {
        return (((((this.monetizationNetwork.hashCode() * 31) + this.mediationNetwork.hashCode()) * 31) + this.currencyIso4217Code.hashCode()) * 31) + Double.hashCode(this.revenue);
    }

    public final String toString() {
        return "AFAdRevenueData(monetizationNetwork=" + this.monetizationNetwork + ", mediationNetwork=" + this.mediationNetwork + ", currencyIso4217Code=" + this.currencyIso4217Code + ", revenue=" + this.revenue + ")";
    }
}
