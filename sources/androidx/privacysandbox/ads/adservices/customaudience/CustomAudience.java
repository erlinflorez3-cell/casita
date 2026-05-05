package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdData;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import java.time.Instant;
import java.util.List;
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
/* JADX INFO: compiled from: CustomAudience.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0JeP.`q2\u000f\u0002{<řc$\bCCU }*\teNo˧vJp\u000bK\u000f\f&\u0001j:R]xc\u0012\u00172PuG3SpSʠ\u0011td\u0004X1Jx[\u0015\u0005(*`\u0010%{SO\u001a\u0014H@\u001f=b\u0011[\t2\u00124C0\u0005,b\u007fNdM|gH6;\tyD^'\u000e9+U\u001dNZ'\u001b\u0001y A?e@%-Y\u0003\u0015^sA\u0019> H\u0015p-'9V\fYLW.\"%3U\rk\u0002>^\u001bP\u000f\u001cˏ/Oq\\\u0019\u001f6\u001a\u0013{;_4\u0014\u0014K`0C\u0019\u0015\u0007Tޮt;YNu\u001a^p&Au~\u001d3'K+g\u001e-e2L'XO}\u001b\fL.ъr'c٪&b\u001b-b\u000b\"F_GUN^\fi=\u001c\r\u001fj͆.\n8Ϛ\u00181\u0002%<,uFi?;!\u001a\u0007ҩHm~ݓxjY\u007f`_\u00111|\u0016O*7\rʑHj\rߘhV^D\u001fflc\u0015\u0002 \u0013Naʟ@'-īfQn\u0004xd.\u001b3;~9om\u001a\u0019Ć=d;̐ie\u0016|`\ndNJd\u001dX\u0015Eΐ\u0010`d̥:4N\u0007\u001e\u0015LU\\\u001b+4UpJDϜ5\u001fdé`\u0005$`O\u001cYphu(\u0001j2R\u0011Ȑ(z\u0011ɖh^v\u0010u\u001a͋0&"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011*^:k\\z\u0019$\u0011^\u000eW)\rZ", "", "0th2e", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006R,Ly\u000bFLW;`Sv=!g", "<`\\2", "", "2`X9l\u001cIR\u0015\u000ezN9\u0001", "\u001a`]1e6BRb\bzmul\u00163;", "0hS1\\5@:#\u0001~\\\u001c\n\r", "/cb", "", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006B(]r|", "/bc6i(MW#\bib4|", "\u001aiPCTuMW!~DB5\u000b\u0018+n\u000f}", "3w_6e(MW#\bib4|", "CrT?50=R\u001d\b|L0~\u0012+l\u000e", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006Q,Uv%VPX5JVtF\u0010\u0019hc", "Bqd@g,=0\u001d}yb5~v3g\t$\u0003N", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011;[<jar<p\u0016Y\rR4\u000fcUP D", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005i>&\u001drj\u0003bb\u001bNt*+KN5kVsA\u0014\u001f0tS'\u001e\u0001#H wF\u0001\r\u00179M\u000b=>g\b\u001f\rBttA \u0019G\t^eN->-UhxTKIasm\fnfLG>yzv\u0015,d\u001a>\u0019\u007fZZYV\bv=.\u001evI \b|_NE99E\u00036\u001bT\u000bMx7T\u0006'><\b<*\u007fH\u000eYv\u0014GmN{(e@40:;&\tVpy}:\f|-]\u0011\r_?Dbadq\u0012\u000b\u0006k\u0017hFe]\u0001E\u001c\u0004HQw\u001f0\u0010ZAIy\u001c\t\u00053qoR1\u001fV\n\u0016wRwF\r\f\u0002s\" -)\u0007d\u001cl;[5a!\u0005q7\t\u0006l\r\u0011oVYiJ\u0001[d\u0001(4x\u001f\u0013\u001fCYK\u0001Z?\u007f\u000f\u001a4\n\t~fbvR\bE\u0013$\u0002AX7fi1icb\u001en+)", "5dc\u000eV;Bd\u0015\u000e~h5k\r7e", "u(;7T=:\u001d(\u0003\u0003^u`\u0012=t{1\u000b\u0016", "5dc\u000eW:", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u000f\\+=W\"\u0001ah.\u0001\u0007\u001fr\u0004", "u(;.a+K]\u001d}Dg,\fR\u001fr\u0004}", "5dc\u000fh@>`", "u(;.a+K]\u001d}\u000e(7\n\r@a}<\n<\n\u0016\u0014Q\u0003W8u3~U|.7z'2KCI52(\u001dpkBP?+=v%J0M,eav>\u0018\u0012gc", "5dc\u0011T0Eg\t\nyZ;|x<i", "5dc\u0012k7B`\u0015\u000e~h5k\r7e", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!e<Lb\u0019}Wb+{\r8gm,}I|\u001e%", "u(;.a+K]\u001d}\u000e(7\n\r@a}<\n<\n\u0016\u0014Q\u0003W8u3~U|.7z'2KCI52.#wkA\u0003s+Rv0EL\u0018\u001bib\u0001L\u0014\u00117\u0012M*\u0011\u000e[  }@\r", "5dc\"f,K0\u001d}yb5~v3g\t$\u0003N", "u(;.a+K]\u001d}\u000e(7\n\r@a}<\n<\n\u0016\u0014Q\u0003W8u3~U|.7z'2KCI52(\u001dpkBP?+<v.GJ]0f[`A\u0016\u001bV\u0015\\\u0001", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0010tX9W,K", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CustomAudience {
    private final Instant activationTime;
    private final List<AdData> ads;
    private final Uri biddingLogicUri;
    private final AdTechIdentifier buyer;
    private final Uri dailyUpdateUri;
    private final Instant expirationTime;
    private final String name;
    private final TrustedBiddingData trustedBiddingSignals;
    private final AdSelectionSignals userBiddingSignals;

    public CustomAudience(AdTechIdentifier buyer, String name, Uri dailyUpdateUri, Uri biddingLogicUri, List<AdData> ads, Instant instant, Instant instant2, AdSelectionSignals adSelectionSignals, TrustedBiddingData trustedBiddingData) {
        Intrinsics.checkNotNullParameter(buyer, "buyer");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dailyUpdateUri, "dailyUpdateUri");
        Intrinsics.checkNotNullParameter(biddingLogicUri, "biddingLogicUri");
        Intrinsics.checkNotNullParameter(ads, "ads");
        this.buyer = buyer;
        this.name = name;
        this.dailyUpdateUri = dailyUpdateUri;
        this.biddingLogicUri = biddingLogicUri;
        this.ads = ads;
        this.activationTime = instant;
        this.expirationTime = instant2;
        this.userBiddingSignals = adSelectionSignals;
        this.trustedBiddingSignals = trustedBiddingData;
    }

    public /* synthetic */ CustomAudience(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, AdSelectionSignals adSelectionSignals, TrustedBiddingData trustedBiddingData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(adTechIdentifier, str, uri, uri2, list, (i2 & 32) != 0 ? null : instant, (i2 + 64) - (i2 | 64) != 0 ? null : instant2, (-1) - (((-1) - i2) | ((-1) - 128)) != 0 ? null : adSelectionSignals, (i2 & 256) == 0 ? trustedBiddingData : null);
    }

    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    public final String getName() {
        return this.name;
    }

    public final Uri getDailyUpdateUri() {
        return this.dailyUpdateUri;
    }

    public final Uri getBiddingLogicUri() {
        return this.biddingLogicUri;
    }

    public final List<AdData> getAds() {
        return this.ads;
    }

    public final Instant getActivationTime() {
        return this.activationTime;
    }

    public final Instant getExpirationTime() {
        return this.expirationTime;
    }

    public final AdSelectionSignals getUserBiddingSignals() {
        return this.userBiddingSignals;
    }

    public final TrustedBiddingData getTrustedBiddingSignals() {
        return this.trustedBiddingSignals;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAudience)) {
            return false;
        }
        CustomAudience customAudience = (CustomAudience) obj;
        return Intrinsics.areEqual(this.buyer, customAudience.buyer) && Intrinsics.areEqual(this.name, customAudience.name) && Intrinsics.areEqual(this.activationTime, customAudience.activationTime) && Intrinsics.areEqual(this.expirationTime, customAudience.expirationTime) && Intrinsics.areEqual(this.dailyUpdateUri, customAudience.dailyUpdateUri) && Intrinsics.areEqual(this.userBiddingSignals, customAudience.userBiddingSignals) && Intrinsics.areEqual(this.trustedBiddingSignals, customAudience.trustedBiddingSignals) && Intrinsics.areEqual(this.ads, customAudience.ads);
    }

    public int hashCode() {
        int iHashCode = ((this.buyer.hashCode() * 31) + this.name.hashCode()) * 31;
        Instant instant = this.activationTime;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.expirationTime;
        int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.dailyUpdateUri.hashCode()) * 31;
        AdSelectionSignals adSelectionSignals = this.userBiddingSignals;
        int iHashCode4 = (iHashCode3 + (adSelectionSignals != null ? adSelectionSignals.hashCode() : 0)) * 31;
        TrustedBiddingData trustedBiddingData = this.trustedBiddingSignals;
        return ((((iHashCode4 + (trustedBiddingData != null ? trustedBiddingData.hashCode() : 0)) * 31) + this.biddingLogicUri.hashCode()) * 31) + this.ads.hashCode();
    }

    public String toString() {
        return "CustomAudience: buyer=" + this.biddingLogicUri + ", activationTime=" + this.activationTime + ", expirationTime=" + this.expirationTime + ", dailyUpdateUri=" + this.dailyUpdateUri + ", userBiddingSignals=" + this.userBiddingSignals + ", trustedBiddingSignals=" + this.trustedBiddingSignals + ", biddingLogicUri=" + this.biddingLogicUri + ", ads=" + this.ads;
    }

    /* JADX INFO: compiled from: CustomAudience.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0JeP.`q2\u000f\u0002{<$a$yCQU\"}(\tWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xc\u001b%˰rom2\u000e!M=ntN\u0005N32<\b\u0007\u0019\u001aXK z\tGc\f@5PtHX%M3\u001f\"\u0010L'\u0019$li^6vu\fBǥ'\u0003wL\u0017+mB\u0015M;Y\u001d3\u001b\u000by\u001eY¨g9#0k\u00035^$Q\u0011T\n=3ؒW19P\f]FZ\u0010\u0014C4}\u0015&~4r\u001dQ\u000fϯW/]icP<-@\u0007\n$T\u0004<ͺWL<-2f6\u000f{\u0001\u0001kXP0މr\u0004\teN\u0017S\u0005{7G4~Q\u0010ݢIRE\t\u001d\rL/Iz/ul\u000e\u000fٽKX\u0006SIQn@\u0011Z\u0018tUm2͏\u0013\u00068 HG.>D\u001d<4=7\nݽS%y\u0012`D\u0016\bUnv^\u0002T^?Pzlն6Á\u0010ZLߟU}^[p2!O,T5\u00076\u001bvς\u0004˶%%\u0018ʚ twpe]8*\u0006όC֍rk\u0016ã\njA5ic>b)Λ ͖@b\r֚7Na\u0010r\\V'\tʎvݻ{{L\u0088\\!@L\n\u001eJ+_%3ìTҴ\"BIґYkhj(~\u00036zѳu˨x\t\tˆ-~}u\u0011KB{\u000f1\u0004ێ]ڤ\u001d&]Ȩ9B\u000b3\u001f\u0001\n~ux#܄X̡\u001au]ݨ¶\u001a8"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011*^:k\\z\u0019$\u0011^\u000eW)\rC6Q(uC7,]", "", "0th2e", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006R,Ly\u000bFLW;`Sv=!g", "<`\\2", "", "2`X9l\u001cIR\u0015\u000ezN9\u0001", "\u001a`]1e6BRb\bzmul\u00163;", "0hS1\\5@:#\u0001~\\\u001c\n\r", "/cb", "", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006B(]r|", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005i>&\u001drj\u0003bb\u001bNt*+KN5kVsA\u0014\u001f0tS'\u001e\u0001#H wF\u0001\r\u00179M\u000b=>g\b\u001f\rBttA \u0019G\t^eN->-UhxTKIasm\fnfLG>yzv\u0015,d\u001a>\u0019\u007fZZYV\bv=\u000b\n", "/bc6i(MW#\bib4|", "\u001aiPCTuMW!~DB5\u000b\u0018+n\u000f}", "3w_6e(MW#\bib4|", "Bqd@g,=0\u001d}yb5~g+t{", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011;[<jar<p\u0016Y\rR4\u000fcUP D", "CrT?50=R\u001d\b|L0~\u0012+l\u000e", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9u<&\u001fq+\u0015\u0006Q,Uv%VPX5JVtF\u0010\u0019hc", "0tX9W", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\r9{B-\u001fp]I\u0006g,Wt'\u0011*^:k\\z\u0019$\u0011^\u000eW)\rZ", "Adc\u000eV;Bd\u0015\u000e~h5k\r7e", "Adc\u000eW:", "Adc\u000f\\+=W\"\u0001ah.\u0001\u0007\u001fr\u0004", "Adc\u000fh@>`", "Adc\u0011T0Eg\t\nyZ;|x<i", "Adc\u0012k7B`\u0015\u000e~h5k\r7e", "Adc\u001bT4>", "Adc!e<Lb\u0019}Wb+{\r8g^$\u000b<", "Bqd@g,=0\u001d}yb5~v3g\t$\u0003N", "Adc\"f,K0\u001d}yb5~v3g\t$\u0003N", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private Instant activationTime;
        private List<AdData> ads;
        private Uri biddingLogicUri;
        private AdTechIdentifier buyer;
        private Uri dailyUpdateUri;
        private Instant expirationTime;
        private String name;
        private TrustedBiddingData trustedBiddingData;
        private AdSelectionSignals userBiddingSignals;

        public Builder(AdTechIdentifier buyer, String name, Uri dailyUpdateUri, Uri biddingLogicUri, List<AdData> ads) {
            Intrinsics.checkNotNullParameter(buyer, "buyer");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(dailyUpdateUri, "dailyUpdateUri");
            Intrinsics.checkNotNullParameter(biddingLogicUri, "biddingLogicUri");
            Intrinsics.checkNotNullParameter(ads, "ads");
            this.buyer = buyer;
            this.name = name;
            this.dailyUpdateUri = dailyUpdateUri;
            this.biddingLogicUri = biddingLogicUri;
            this.ads = ads;
        }

        public final Builder setBuyer(AdTechIdentifier buyer) {
            Intrinsics.checkNotNullParameter(buyer, "buyer");
            this.buyer = buyer;
            return this;
        }

        public final Builder setName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            return this;
        }

        public final Builder setActivationTime(Instant activationTime) {
            Intrinsics.checkNotNullParameter(activationTime, "activationTime");
            this.activationTime = activationTime;
            return this;
        }

        public final Builder setExpirationTime(Instant expirationTime) {
            Intrinsics.checkNotNullParameter(expirationTime, "expirationTime");
            this.expirationTime = expirationTime;
            return this;
        }

        public final Builder setDailyUpdateUri(Uri dailyUpdateUri) {
            Intrinsics.checkNotNullParameter(dailyUpdateUri, "dailyUpdateUri");
            this.dailyUpdateUri = dailyUpdateUri;
            return this;
        }

        public final Builder setUserBiddingSignals(AdSelectionSignals userBiddingSignals) {
            Intrinsics.checkNotNullParameter(userBiddingSignals, "userBiddingSignals");
            this.userBiddingSignals = userBiddingSignals;
            return this;
        }

        public final Builder setTrustedBiddingData(TrustedBiddingData trustedBiddingSignals) {
            Intrinsics.checkNotNullParameter(trustedBiddingSignals, "trustedBiddingSignals");
            this.trustedBiddingData = trustedBiddingSignals;
            return this;
        }

        public final Builder setBiddingLogicUri(Uri biddingLogicUri) {
            Intrinsics.checkNotNullParameter(biddingLogicUri, "biddingLogicUri");
            this.biddingLogicUri = biddingLogicUri;
            return this;
        }

        public final Builder setAds(List<AdData> ads) {
            Intrinsics.checkNotNullParameter(ads, "ads");
            this.ads = ads;
            return this;
        }

        public final CustomAudience build() {
            return new CustomAudience(this.buyer, this.name, this.dailyUpdateUri, this.biddingLogicUri, this.ads, this.activationTime, this.expirationTime, this.userBiddingSignals, this.trustedBiddingData);
        }
    }
}
