package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import java.util.List;
import java.util.Map;
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
/* JADX INFO: compiled from: AdSelectionConfig.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007t\tAӄLe^.ZS0\u000fs{BFc$wPCU(\u0007*\tUNog|PbŏK\u000f\u0014\"\u0001̓Bկ\u0006x\f\u0011O\u007fRsM3eok:pxD\u000782P;\n\u000f\u000f\u001eBN x\u000bCy\r@5PtHX%M3!\"\nL(\u0019\u001e\u000bn^FVuuF?%\u0013ipO7a@|{\u0014t^7\u0011\u0005l6+n:߱\u0019%a\u000fOciX\u001b? W5n5BCK\nVdWFЃ\u0015sU\u001by\u000b&\u000b\"\u0018tT-9m{K~-n\fK\u000b\u001bB\u001c\u000e4.ρ23\"Ǒ \u00109\u0002\u0001a\u0011e\u0010bZ\u0006\u000bcF\u0017S\u0001a0ݰ\u001flYĥS\u001bTF\n\u0015]-1\u0003\u0007!\nW\u05f8d\u001b#Ƙ\u0010S7bNO\u0019i\u0018bUy\u0014rr\u0002X\u0005@I\u0010/*\u0018\\!É;aA\u05fa9m\b[R{G\u0014nhki\u0001Iغ&t\u001eճB\u000b\u0012oRzUz^\\p,?TɟX\r\u0006ܱ+\"b\u000fJ/u\u001f\\Z\u0001i\u0019Pύ\u000e+7ωO[t\u0004\u001ciߓbS"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r7jB\u001e\u001ch_H\u000bm5\u0018R&5LU,ZavG\u001dod\u0017O/\u000fZ", "", "Ad[9X9", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006R,Ly\u000bFLW;`Sv=!g", "2dR6f0H\\\u007f\t|b*l\u00163", "\u001a`]1e6BRb\bzmul\u00163;", "1tbAb4\u001ac\u0018\u0003zg*|e?y\u007f5\n", "", "/cB2_,<b\u001d\t\u0004L0~\u0012+l\u000e", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006Q,Uv%VPX5JVtF\u0010\u0019hc", "Ad[9X9,W\u001b\bve:", ">da\u000fh@>`\u0007\u0003|g(\u0004\u0017", "", "Bqd@g,=A\u0017\t\bb5~v3g\t$\u0003Np$\u001b", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005i>&\u001drj\u0003bb\u001bNt*+KN5kVsA\u0014\u001f0tJ4\f\u0012cE#8M7.Q\u001cV\u0006\u0011O\u0006\b'\n~z\u007fF]Y.}#\u0005\u0017\u0010dOXl\u0004K@X,5q\u0010p\u0019ZNH \u001dp\u0016%{\u001a*\t\n\u001d\rq`ytxK\u0017zFm<wcNOx\u001f\u0018s\u0015\u001fR{u!6b}\u0019x/\r01D:kGp\u0017Kh|\u0014?&L4*G8\u0011SY_~k;\u0018{h]\u0007\u001c,10'ertL\r\u0007k`Y?ig\u000b@\u001ca=7o\u001c'D\u000eFe\u0003\u0003\r\t-ilW\u0019\u0002Y|+l\u000e2n\u0015\nLN\u0014'\u0004|9b\u000eu4c6\u0017\u001c\tw\u0002{\t]\u0019Xa", "5dc\u000eW\u001a>Z\u0019|\nb6\u0006v3g\t$\u0003N", "u(;.a+K]\u001d}\u000e(7\n\r@a}<\n<\n\u0016\u0014Q\u0003W8u3~U|.7z'2KCI52(\u001dpkBP?+<v.GJ]0f[`A\u0016\u001bV\u0015\\\u0001", "5dc\u0010h:M]!Z\u000b]0|\u0012-e\\8\u0010@\u000e%", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0011X*Ba\u001d\t\u0004E6~\r-U\r,", "u(;.a+K]\u001d}Dg,\fR\u001fr\u0004}", "5dc\u001dX9\u001bc-~\bL0~\u0012+l\u000e", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc X3ES&", "u(;.a+K]\u001d}\u000e(7\n\r@a}<\n<\n\u0016\u0014Q\u0003W8u3~U|.7z'2KCI52(\u001dpkBP?+=v%J0M,eav>\u0018\u0012gc", "5dc X3ES&l~`5x\u0010=", "5dc!e<Lb\u0019}h\\6\n\r8gm,}I|\u001e%7|\u0012", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AdSelectionConfig {
    private final AdSelectionSignals adSelectionSignals;
    private final List<AdTechIdentifier> customAudienceBuyers;
    private final Uri decisionLogicUri;
    private final Map<AdTechIdentifier, AdSelectionSignals> perBuyerSignals;
    private final AdTechIdentifier seller;
    private final AdSelectionSignals sellerSignals;
    private final Uri trustedScoringSignalsUri;

    public AdSelectionConfig(AdTechIdentifier seller, Uri decisionLogicUri, List<AdTechIdentifier> customAudienceBuyers, AdSelectionSignals adSelectionSignals, AdSelectionSignals sellerSignals, Map<AdTechIdentifier, AdSelectionSignals> perBuyerSignals, Uri trustedScoringSignalsUri) {
        Intrinsics.checkNotNullParameter(seller, "seller");
        Intrinsics.checkNotNullParameter(decisionLogicUri, "decisionLogicUri");
        Intrinsics.checkNotNullParameter(customAudienceBuyers, "customAudienceBuyers");
        Intrinsics.checkNotNullParameter(adSelectionSignals, "adSelectionSignals");
        Intrinsics.checkNotNullParameter(sellerSignals, "sellerSignals");
        Intrinsics.checkNotNullParameter(perBuyerSignals, "perBuyerSignals");
        Intrinsics.checkNotNullParameter(trustedScoringSignalsUri, "trustedScoringSignalsUri");
        this.seller = seller;
        this.decisionLogicUri = decisionLogicUri;
        this.customAudienceBuyers = customAudienceBuyers;
        this.adSelectionSignals = adSelectionSignals;
        this.sellerSignals = sellerSignals;
        this.perBuyerSignals = perBuyerSignals;
        this.trustedScoringSignalsUri = trustedScoringSignalsUri;
    }

    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    public final Uri getDecisionLogicUri() {
        return this.decisionLogicUri;
    }

    public final List<AdTechIdentifier> getCustomAudienceBuyers() {
        return this.customAudienceBuyers;
    }

    public final AdSelectionSignals getAdSelectionSignals() {
        return this.adSelectionSignals;
    }

    public final AdSelectionSignals getSellerSignals() {
        return this.sellerSignals;
    }

    public final Map<AdTechIdentifier, AdSelectionSignals> getPerBuyerSignals() {
        return this.perBuyerSignals;
    }

    public final Uri getTrustedScoringSignalsUri() {
        return this.trustedScoringSignalsUri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionConfig)) {
            return false;
        }
        AdSelectionConfig adSelectionConfig = (AdSelectionConfig) obj;
        return Intrinsics.areEqual(this.seller, adSelectionConfig.seller) && Intrinsics.areEqual(this.decisionLogicUri, adSelectionConfig.decisionLogicUri) && Intrinsics.areEqual(this.customAudienceBuyers, adSelectionConfig.customAudienceBuyers) && Intrinsics.areEqual(this.adSelectionSignals, adSelectionConfig.adSelectionSignals) && Intrinsics.areEqual(this.sellerSignals, adSelectionConfig.sellerSignals) && Intrinsics.areEqual(this.perBuyerSignals, adSelectionConfig.perBuyerSignals) && Intrinsics.areEqual(this.trustedScoringSignalsUri, adSelectionConfig.trustedScoringSignalsUri);
    }

    public int hashCode() {
        return (((((((((((this.seller.hashCode() * 31) + this.decisionLogicUri.hashCode()) * 31) + this.customAudienceBuyers.hashCode()) * 31) + this.adSelectionSignals.hashCode()) * 31) + this.sellerSignals.hashCode()) * 31) + this.perBuyerSignals.hashCode()) * 31) + this.trustedScoringSignalsUri.hashCode();
    }

    public String toString() {
        return "AdSelectionConfig: seller=" + this.seller + ", decisionLogicUri='" + this.decisionLogicUri + "', customAudienceBuyers=" + this.customAudienceBuyers + ", adSelectionSignals=" + this.adSelectionSignals + ", sellerSignals=" + this.sellerSignals + ", perBuyerSignals=" + this.perBuyerSignals + ", trustedScoringSignalsUri=" + this.trustedScoringSignalsUri;
    }
}
