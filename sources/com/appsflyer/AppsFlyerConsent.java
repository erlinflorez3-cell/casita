package com.appsflyer;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLc\u0003\rI\u00066\u00196B\r(4\u0012}\u0007njG<LeN3Xݾ0%ӆ\u001aOT[Rp{:pZ5(\u000e_Vmg|Kr\rY\u000e4\u0016\tr2Iczu\u0014%1poO;SoK<xvL\u0004N22@\u007f\u0005\u000f\u001eBJ&u)Cƚ\u0010\u00146E~@\u001b\u001d[\f2\u0014\u001c=N\u0001dֹhߑ:JrdH7k\u0013wKf)u/+MSчUܮ\u0011xg'9H\u007fE#/k\u0005\u001dQ\n?IԒrݘ\tj-19Q<gDc\u0018\u0016+*}\r$ľ'ػ\tSf\u001753\u0018\"Y\\&(&\u07be,\u0015B\u0004\u001c\u0007?JD,Hf8\u00169t\u0001UXR\u0018]p\u007f+i<\u00173\u0003K-O\u001a\u0015Q\u0012C\u001fNE\u007f\u001d\u000f4\"/ngǄS\u05f8d\u0017!`\u0006^yiNL`N8Yms\u0012~z\u0004@\u0003^FFÒ| 2\u0019+FiIk/y\u0014`D\u0016\bKògרmTNR0\u0002^E8\u001e$ZrxK¯OԜ\\.\u0017b*jW\u0018\u0016\u00178^\u000e;O%FS&ŞkҷQg\u0012'5jEp\u0007m\u0014oGf\u0004O_f(chuB?rg[֢h͞W\u0016b^.%@_\u0003\u0012}\u0015RV\\-@A\n\u001eJ+_\u0019\u0013\u001a\u001fҙ նE\u0007\u0011a`j\u001e\u0016l5*\u001dw,E#\u000fQtr\u0006f'Ib\u00027ý/ۮU?!([#vK\u0015%\r\u007f\u0002\b"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bp\u000b6\\G\u0015\u0017$%y\u0017Jv.D/", "", "", "7rD@X9,c\u0016\u0004z\\;k\u0013\u0011Dj\u0015", "6`b\u0010b5LS\"\u000e[h9[\u0005>ao6wB\u0001", "6`b\u0010b5LS\"\u000e[h9X\b=P\u007f5\nJ\n\u0013\u001eK\u0005\nKz/>", "6`b\u0010b5LS\"\u000e[h9X\b\u001dt\n5wB\u0001", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q'\u0006\u0013(C9\u00158\u007f'~6\b*>m\u00127#*@gE\u001a^o]B\t-\tX\u0001.GHW\u0002CWnN\u0010[a\nW-VacK+n@@tK\u001d", "1n\\=b5>\\(J", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q'\u0006\u0013(C9\u00158\u007f'~6\b*>m\u00127#*@gE\u001a^o]B\t-\tX\u0001.GHW\u0002CWnN\u0010[a\nW-VacK+n@@tK\u0013G\fC2|\u0017!\u001c6q\u0005BcY#\u0005 \u0004\"0|Ff=\u0004POEk9:", "=sW2e", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "5dc\u0015T:\u001c]\"\rzg;]\u0013<A~\u0016\u000bJ\u000e\u0013\u0019G", "5dc\u0015T:\u001c]\"\rzg;]\u0013<A~6f@\u000e%!Pk\u0015@\f!D]\b)", "5dc\u0015T:\u001c]\"\rzg;]\u0013<D{7w0\u000f\u0013\u0019G", "\u0011n\\=T5B]\""}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AppsFlyerConsent {
    public static final Companion Companion = new Companion(null);
    private final Boolean hasConsentForAdStorage;
    private final Boolean hasConsentForAdsPersonalization;
    private final Boolean hasConsentForDataUsage;
    private final Boolean isUserSubjectToGDPR;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005\"4\u0012\u000e\u0007nj?2JͣIDɟ\u0004*=j<;*[ҸuEAU(~j&]T\u007fg\u001dO\u000b\u000fQ\u0012\u001e\u0016'l\\Mc|u\u0012=4\ttУ7OuCGg=C\u0013(J\"f~K\u0006ʀ.J\u0016~\tL"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bp\u000b6\\G\u0015\u0017$%y\u0017Jv.D\u0018[*?x\u00127QMDA", "", "\nh]6g\u0005", "u(E", "", "6`b\u0010b5LS\"\u000e[h9[\u0005>ao6wB\u0001", "6`b\u0010b5LS\"\u000e[h9X\b=P\u007f5\nJ\n\u0013\u001eK\u0005\nKz/>", "\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bp\u000b6\\G\u0015\u0017$%y\u0017Jv.D/", "4na\u00147\u0017+C'~\b", "uYIu?*H[bz\u0006i:}\u0010Ce\rqWK\f%wN\u0004\u000eIT/>g})FC", "4na\u001bb5 2\u0004kjl,\n", "u(;0b4\bO$\n\t_3\u0011\t</[3\u0007Na\u001e+G|kF\u007f35b\ru"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU>Y#D\u0006^vSu7k(awG\r`qKK!Gy\u0015eZ\r6j]>yMFQ\u0015U*S\u001ewH\u000b\u0002\u001a=", replaceWith = @ReplaceWith(expression = "AppsFlyerConsent()", imports = {}))
        @JvmStatic
        @InterfaceC1492Gx
        public final AppsFlyerConsent forGDPRUser(boolean z2, boolean z3) {
            return new AppsFlyerConsent(Boolean.TRUE, Boolean.valueOf(z2), Boolean.valueOf(z3), null, 8, null);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU>Y#D\u0006^vSu7k(awG\r`qKK!Gy\u0015eZ\r6j]>yMFQ\u0015U*S\u001ewH\u000b\u0002\u001a=", replaceWith = @ReplaceWith(expression = "AppsFlyerConsent()", imports = {}))
        @JvmStatic
        @InterfaceC1492Gx
        public final AppsFlyerConsent forNonGDPRUser() {
            return new AppsFlyerConsent(Boolean.FALSE, null, null, null, 8, null);
        }
    }

    public AppsFlyerConsent() {
        this(null, null, null, null, 15, null);
    }

    public AppsFlyerConsent(Boolean bool) {
        this(bool, null, null, null, 14, null);
    }

    public AppsFlyerConsent(Boolean bool, Boolean bool2) {
        this(bool, bool2, null, null, 12, null);
    }

    public AppsFlyerConsent(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, null, 8, null);
    }

    public AppsFlyerConsent(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.isUserSubjectToGDPR = bool;
        this.hasConsentForDataUsage = bool2;
        this.hasConsentForAdsPersonalization = bool3;
        this.hasConsentForAdStorage = bool4;
    }

    public /* synthetic */ AppsFlyerConsent(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? null : bool, (i2 + 2) - (2 | i2) != 0 ? null : bool2, (4 & i2) != 0 ? null : bool3, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : bool4);
    }

    public static /* synthetic */ AppsFlyerConsent copy$default(AppsFlyerConsent appsFlyerConsent, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            bool = appsFlyerConsent.isUserSubjectToGDPR;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            bool2 = appsFlyerConsent.hasConsentForDataUsage;
        }
        if ((4 & i2) != 0) {
            bool3 = appsFlyerConsent.hasConsentForAdsPersonalization;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            bool4 = appsFlyerConsent.hasConsentForAdStorage;
        }
        return appsFlyerConsent.copy(bool, bool2, bool3, bool4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU>Y#D\u0006^vSu7k(awG\r`qKK!Gy\u0015eZ\r6j]>yMFQ\u0015U*S\u001ewH\u000b\u0002\u001a=", replaceWith = @ReplaceWith(expression = "AppsFlyerConsent()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final AppsFlyerConsent forGDPRUser(boolean z2, boolean z3) {
        return Companion.forGDPRUser(z2, z3);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0007K\fGvw\u0016k]Kg\u000eY#/S\u001cb^tU>Y#D\u0006^vSu7k(awG\r`qKK!Gy\u0015eZ\r6j]>yMFQ\u0015U*S\u001ewH\u000b\u0002\u001a=", replaceWith = @ReplaceWith(expression = "AppsFlyerConsent()", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final AppsFlyerConsent forNonGDPRUser() {
        return Companion.forNonGDPRUser();
    }

    public final Boolean component1() {
        return this.isUserSubjectToGDPR;
    }

    public final Boolean component2() {
        return this.hasConsentForDataUsage;
    }

    public final Boolean component3() {
        return this.hasConsentForAdsPersonalization;
    }

    public final Boolean component4() {
        return this.hasConsentForAdStorage;
    }

    public final AppsFlyerConsent copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new AppsFlyerConsent(bool, bool2, bool3, bool4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsFlyerConsent)) {
            return false;
        }
        AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) obj;
        return Intrinsics.areEqual(this.isUserSubjectToGDPR, appsFlyerConsent.isUserSubjectToGDPR) && Intrinsics.areEqual(this.hasConsentForDataUsage, appsFlyerConsent.hasConsentForDataUsage) && Intrinsics.areEqual(this.hasConsentForAdsPersonalization, appsFlyerConsent.hasConsentForAdsPersonalization) && Intrinsics.areEqual(this.hasConsentForAdStorage, appsFlyerConsent.hasConsentForAdStorage);
    }

    public final Boolean getHasConsentForAdStorage() {
        return this.hasConsentForAdStorage;
    }

    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    public final int hashCode() {
        Boolean bool = this.isUserSubjectToGDPR;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasConsentForDataUsage;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasConsentForAdsPersonalization;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasConsentForAdStorage;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final Boolean isUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    public final String toString() {
        return "AppsFlyerConsent(isUserSubjectToGDPR=" + this.isUserSubjectToGDPR + ", hasConsentForDataUsage=" + this.hasConsentForDataUsage + ", hasConsentForAdsPersonalization=" + this.hasConsentForAdsPersonalization + ", hasConsentForAdStorage=" + this.hasConsentForAdStorage + ")";
    }
}
