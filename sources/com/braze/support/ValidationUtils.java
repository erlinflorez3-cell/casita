package com.braze.support;

import bo.app.ei0;
import bo.app.fi0;
import bo.app.gi0;
import bo.app.hi0;
import bo.app.ii0;
import bo.app.ji0;
import bo.app.ki0;
import bo.app.li0;
import bo.app.mi0;
import bo.app.ni0;
import bo.app.oi0;
import bo.app.pi0;
import bo.app.vb0;
import com.braze.support.BrazeLogger;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.codec.language.bm.Rule;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLc\u0003\u0010Iي8\u000b<K\u0007\"2\u0019\u007f\u0007|jAӄLeV4Zݷ2\u000f\u0002{<$a,yCIY\"}(\u000bWNu\bvJ`\rK\u000f\u001c\u0016\u0001j2Q[ߔ](ƁbB\u001e>sTu=˃dv<3.]jO\b\b\u0019\u001aXJ@|\tDc\u000e(/np\u0001WҫQ\u0007 \u0015\u0014Bh\u0018,b\u007fNdJ\u001dcH4;\u0005\u007fA|'&5ƊQ\u000fLZ5\u0011?x,3X7c\u0015UY\u0011\u000ej]U\u0002mq\u0004\nص+)1Q\u0002`~\u0014\u000e&-+}\u000f\u000ex4f\u001dSv\u000bU+\u007fiY[&*\u000ey*\rl\n\u001c\u0013?JD,Hr8\u0012A\u0004\u000bSn^2bP\u0011\u0013ad'k\u0005Ĵ/;!x_t\u00048\\L\u0014\u0005; S\u0007|5sV$_C\u001b\u0005{_Bi@kX\u0015\u000fՒAo\n\u0006p\u0018r%>`\u0018/*\u0013^\u001d3Ns;9 \u001a\u0002xJu\u000f\u001db~R\u0018R\u000fE̱r\u0018=C\u0017&#ar#\u0004P\u0003Z\\\u0015[8l\u0007,#C$j\u0015T!S+\u0015TŹmlS{\u0018D\u007f\u0002Ez\u0007q\u001eYI^a5\u007f\u0004Fe؏z\u001eG>h&f\tZU\u0012}jLrDV\u0011(w*i\u0005\fiԸAۇ 843\u001f\u0003#oS6Pi\u0015\t\u000eh\u001f\u0014UԦ\u0006ʗ\u0007s,v\u000f)^\u0006\u0001qm#WWMr0YYQc>\\Ux־6č'\u000b\u0007u\u0006sus\u0018^zC\u000eU*.L\u001e\u0010֞\u0002ˮ\u0017\u0013\u0007+8/;nʌv\u0015"}, d2 = {"\u001ab^:\")KO.~Dl<\b\u00149r\u000fql<\b\u001b\u0016C~\u0012F\u007f\u0015D]\u0005.\r", "", "", "3lP6_\b=R&~\tl", "", "7rE._0=3!z~e\b{\b<e\u000e6", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?5", ">g^;X\u0015N[\u0016~\b", "7rE._0=>\u001c\t\u0004^\u0015\r\u0011,e\r", "4hT9W", "3mbBe,\u001b`\u0015\u0014z?0|\u0010.L\u007f1}O\u0004", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", ">q^1h*M7\u0018", "1ta?X5<gv\ty^", "\u001aiPCTuFO(\u0002D;0~g/c\u00040wGV", ">qX0X", "", "?tP;g0Mg", "\u001aa^{T7I\u001d*{E4", "AdaCX9\u001c]\"\u007f~`\u001a\f\u0013<a\u0002(fM\u000b(\u001bFo\u001b", "7rE._0=:#\u0001en9z\f+s\u007f\f\u0005K\u0011&", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}&\u0011wd\u0003cg.-v%KTJ326Y:\u001e[V\u0019Yt\u001e\u0002$\u0017gc", "3uT;g\u0015:[\u0019", "7rE._0=:#\u0001Xn:\f\u00137E\u0011(\u0005Od \"W~", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b=\u000b`\u0013RzWMso\u000b\u001dr", "1`\\=T0@\\|}", ">`V2<+", "7rE._0=>)\r}L;\u0007\u0016CC\u0007,yFd \"W~", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okqB", "", ":`c6g<=S", ":n]4\\;NR\u0019", "7rE._0=:#|vm0\u0007\u0012", "uC3uM", "", "$@;\u00167&\u001cC\u0006kZG\np\u0003\rO^\bi", "\u001aiPCTuNb\u001d\u0006DL,\f^", "5dc#4\u0013\"2\u0013\\jK\u0019\\q\rYy\u0006e\u001f`\u0005", "u(;7T=:\u001d)\u000e~euj\t>;", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "\u0013L0\u0016?&\u001a2wkZL\u001avu\u000fG_\u001b", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "\u0013L0\u0016?&\u001a2wkZL\u001avp\u000bXy\u000f[)b\u0006y", "\u0017", "5dc\u0012@\b\":\u0013ZY=\u0019\\v\u001d_g\u0004n:gv\u007f)^pzr.>c\r\u001cFq 7[", "u(E", "\u001eG>\u001b8&'C\u0001[ZK&ih\u0011Er", "\u0010Q0'8&,B\u0006bc@&dd\"_f\bd\"oy", "\nh]6g\u0005", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class ValidationUtils {
    public static final int BRAZE_STRING_MAX_LENGTH = 255;
    public static final int EMAIL_ADDRESS_MAX_LENGTH = 255;
    public static final ValidationUtils INSTANCE = new ValidationUtils();
    private static final Set<String> VALID_CURRENCY_CODES = SetsKt.setOf((Object[]) new String[]{"AED", "AFN", Rule.ALL, "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL"});
    private static final Regex EMAIL_ADDRESS_REGEX = new Regex(".+@.+\\..+");
    private static final Regex PHONE_NUMBER_REGEX = new Regex("^[0-9 .\\(\\)\\+\\-]+$");

    private ValidationUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object, java.lang.String] */
    @JvmStatic
    public static final String ensureBrazeFieldLength(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return "";
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? string = StringsKt.trim((CharSequence) str).toString();
        objectRef.element = string;
        if (string.length() > 255) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ei0(objectRef), 6, (Object) null);
            ?? Substring = ((String) objectRef.element).substring(0, 255);
            Intrinsics.checkNotNullExpressionValue(Substring, "this as java.lang.String…ing(startIndex, endIndex)");
            objectRef.element = Substring;
        }
        return (String) objectRef.element;
    }

    public static /* synthetic */ void getEMAIL_ADDRESS_MAX_LENGTH$annotations() {
    }

    @JvmStatic
    public static final boolean isValidEmailAddress(String str) {
        if (str == null || str.length() == 0 || str.length() > 255) {
            return false;
        }
        return EMAIL_ADDRESS_REGEX.matches(str);
    }

    @JvmStatic
    public static final boolean isValidLocation(double d2, double d3) {
        return d2 < 90.0d && d2 > -90.0d && d3 < 180.0d && d3 > -180.0d;
    }

    @JvmStatic
    public static final boolean isValidLogCustomEventInput(String str, vb0 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) fi0.f674a, 6, (Object) null);
            return false;
        }
        if (!serverConfigStorageProvider.b().contains(str)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new gi0(str), 6, (Object) null);
        return false;
    }

    @JvmStatic
    public static final boolean isValidLogPurchaseInput(String str, String str2, BigDecimal bigDecimal, int i2, vb0 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) hi0.f834a, 6, (Object) null);
            return false;
        }
        if (serverConfigStorageProvider.c().contains(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ii0(str), 6, (Object) null);
            return false;
        }
        if (str2 == null || StringsKt.isBlank(str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) ji0.f1017a, 6, (Object) null);
            return false;
        }
        Set<String> set = VALID_CURRENCY_CODES;
        String string = StringsKt.trim((CharSequence) str2).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = string.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (!set.contains(upperCase)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ki0(str2), 6, (Object) null);
            return false;
        }
        if (bigDecimal == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) li0.f1199a, 6, (Object) null);
            return false;
        }
        if (i2 <= 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mi0(i2), 6, (Object) null);
            return false;
        }
        if (i2 <= 100) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ni0(i2), 6, (Object) null);
        return false;
    }

    @JvmStatic
    public static final boolean isValidPhoneNumber(String str) {
        return str != null && PHONE_NUMBER_REGEX.matches(str);
    }

    @JvmStatic
    public static final boolean isValidPushStoryClickInput(String str, String str2) {
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) oi0.f1448a, 6, (Object) null);
            return false;
        }
        if (str2 != null && !StringsKt.isBlank(str2)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) pi0.f1520a, 6, (Object) null);
        return false;
    }

    public final Set<String> getVALID_CURRENCY_CODES() {
        return VALID_CURRENCY_CODES;
    }
}
