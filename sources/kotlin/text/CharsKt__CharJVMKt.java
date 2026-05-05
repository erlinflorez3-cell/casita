package kotlin.text;

import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!4i\bDRm|\u0004G\u00078\u000bDB\u0007\"2\u0013\u007f\u0007tpA0JgP.`\\2\u000fq\b<$i0yّCU0}*\tUU\u007fu|Qr\u000bq\u00176\u001a\u0007sDI\u0004\u0001$\u0011'HPyW3{wm=n\u007fN\u0005N2R<\b\u000e\u0019\u001aXPV͌\u0013NY\u0018*0n}bR;MK܍\u0018\u001eI.\u000f6\\\u0016[^H\u001b]\u0001Ǌ)\u001btP]?_^\nu\rtTmˡ|y)9PO5C2{\u00035R\"β\tW|K\u0016\u0001'U8qs\u00066\u001fä\u001a-6]\u001furTi-Q\u000f\fmˋU{V^!@w)\t5<2\u000eLαNF8(z \u000ea\u0002\u001bSnPHޑH\u0018\u0006oK/%.@S9If\u0018ĭA1YE\u0012\u001d\rL0)nO[\u001bםf-&b\u000fi1\u007fMeH|\n ƥs\u001c{p\u001aB\u0004^T(/*\u0011tϗ+OfG<9k0Ulg%\u0005'íY\u0002ZVZ:nDDR\t:Z\\o\u0013\u0007hT\u0007H9MJTMê\u000e+2j\u0013T!S,vO\u0017i\u001bQk'=/\u0015U s\u0004\u0019eXv3cQ\f\u0010\u0010R=ܥETt\u0013x~B\u0002(\u0003\\V\"bLx-\u0010{rlR\u0018JJ\u007f=L,_\u0019\u0005\u0015v\u0003d՛G\u0015\u0014m|\u0001\u0010-T[$1ijڗ\u000f\u0019[j\u0014\bg'IT|\u000f\"sۓWM$4y:hb|K\u0007-sFĀmdRZ\u0012.u\u0004\u0018H\u0016H9\u0018ȅC+!\rNJ\u0002[atr\u0014Q}\u00165\u0018\u0015y=Y/3\u007f\u0013x\u0017D`\u0019JwTE\"=ܭxC\u001brр\u0012atyoc\u0003\u000b\u0012\u0003ϗv\u0007q>T9\u000b\u0007?13\u0004\b\"+9UCU\u001dL<ӄ3\u0019y_ot<\u007f˕\u0013M"}, d2 = {"1`c2Z6Kg", "\u001aj^A_0G\u001d(~\u000emuZ\f+r]$\u000b@\u0003!$[E", "", "5dc\u0010T;>U#\f\u000f", "uB\u0018\u0019^6MZ\u001d\bDm,\u0010\u0018xC\u0003$\t\u001e|&\u0017Iy\u001bPL", "2ha2V;B]\"z\u0002b;\u0011", "\u001aj^A_0G\u001d(~\u000emuZ\f+r^,\t@~&\u001bQx\nCz4I/", "5dc\u0011\\9>Q(\u0003\u0005g(\u0004\r>y", "uB\u0018\u0019^6MZ\u001d\bDm,\u0010\u0018xC\u0003$\t\u001f\u0005$\u0017E~\u0012F\u007f!<]\r4\r", "1gT0^\u0019:R\u001d\u0012", "", "@`S6k", "2hV6g\u0016?", "1gP?", "7r32Y0GS\u0018", "", "7r36Z0M", "7r76Z/,c&\f\u0005`(\f\t", "7r8 B\nH\\(\f\u0005e", "7r81X5MW\u001a\u0003zk\u0010~\u00129r{%\u0003@", "7r9.i(\"R\u0019\b\nb-\u0001\t<P{5\u000b", "7r9.i(\"R\u0019\b\nb-\u0001\t<S\u000f$\tO", "7r;2g;>`", "7r;2g;>`\u0003\fYb.\u0001\u0018", "7r;<j\u001aN`&\t|Z;|", "7r;<j,K1\u0015\rz", "7rC6g3>1\u0015\rz", "7rD=c,K1\u0015\rz", "7rF5\\;>a$zx^", ":nf2e*:a\u0019", "", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", ":nf2e*:a\u0019\\}Z9", "Bhc9X*:a\u0019", "Bhc9X*:a\u0019\\}Z9", "Bn;<j,K1\u0015\rz", "BnC6g3>1\u0015\rz", "BnD=c,K1\u0015\rz", "Co_2e*:a\u0019", "Co_2e*:a\u0019\\}Z9", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{@0B=v\n.&66\r5")
public class CharsKt__CharJVMKt {
    public static final int checkRadix(int i2) {
        if (new IntRange(2, 36).contains(i2)) {
            return i2;
        }
        throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new IntRange(2, 36));
    }

    public static final int digitOf(char c2, int i2) {
        return Character.digit((int) c2, i2);
    }

    public static final CharCategory getCategory(char c2) {
        return CharCategory.Companion.valueOf(Character.getType(c2));
    }

    public static final CharDirectionality getDirectionality(char c2) {
        return CharDirectionality.Companion.valueOf(Character.getDirectionality(c2));
    }

    private static final boolean isDefined(char c2) {
        return Character.isDefined(c2);
    }

    private static final boolean isDigit(char c2) {
        return Character.isDigit(c2);
    }

    private static final boolean isHighSurrogate(char c2) {
        return Character.isHighSurrogate(c2);
    }

    private static final boolean isISOControl(char c2) {
        return Character.isISOControl(c2);
    }

    private static final boolean isIdentifierIgnorable(char c2) {
        return Character.isIdentifierIgnorable(c2);
    }

    private static final boolean isJavaIdentifierPart(char c2) {
        return Character.isJavaIdentifierPart(c2);
    }

    private static final boolean isJavaIdentifierStart(char c2) {
        return Character.isJavaIdentifierStart(c2);
    }

    private static final boolean isLetter(char c2) {
        return Character.isLetter(c2);
    }

    private static final boolean isLetterOrDigit(char c2) {
        return Character.isLetterOrDigit(c2);
    }

    private static final boolean isLowSurrogate(char c2) {
        return Character.isLowSurrogate(c2);
    }

    private static final boolean isLowerCase(char c2) {
        return Character.isLowerCase(c2);
    }

    private static final boolean isTitleCase(char c2) {
        return Character.isTitleCase(c2);
    }

    private static final boolean isUpperCase(char c2) {
        return Character.isUpperCase(c2);
    }

    public static final boolean isWhitespace(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    private static final String lowercase(char c2) {
        String strValueOf = String.valueOf(c2);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String lowercase(char c2, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c2);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final char lowercaseChar(char c2) {
        return Character.toLowerCase(c2);
    }

    public static final String titlecase(char c2, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strUppercase = CharsKt.uppercase(c2, locale);
        if (strUppercase.length() <= 1) {
            String strValueOf = String.valueOf(c2);
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return !Intrinsics.areEqual(strUppercase, upperCase) ? strUppercase : String.valueOf(Character.toTitleCase(c2));
        }
        if (c2 == 329) {
            return strUppercase;
        }
        char cCharAt = strUppercase.charAt(0);
        Intrinsics.checkNotNull(strUppercase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = strUppercase.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    private static final char titlecaseChar(char c2) {
        return Character.toTitleCase(c2);
    }

    @Deprecated(message = "\u0018Y\u0001t}\u0004,\\jJ)\u000eUw4On\u0014Qf\u000ev\u001ff{Gr8", replaceWith = @ReplaceWith(expression = "lowercaseChar()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    private static final char toLowerCase(char c2) {
        return Character.toLowerCase(c2);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0006})c]J)\u000eUw4On\u0014Qf\u000ev\u001ff{Gr8", replaceWith = @ReplaceWith(expression = "titlecaseChar()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    private static final char toTitleCase(char c2) {
        return Character.toTitleCase(c2);
    }

    @Deprecated(message = "\u0018Y\u0001t\u0007\u0005%\\jJ)\u000eUw4On\u0014Qf\u000ev\u001ff{Gr8", replaceWith = @ReplaceWith(expression = "uppercaseChar()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bc@")
    private static final char toUpperCase(char c2) {
        return Character.toUpperCase(c2);
    }

    private static final String uppercase(char c2) {
        String strValueOf = String.valueOf(c2);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final String uppercase(char c2, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c2);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private static final char uppercaseChar(char c2) {
        return Character.toUpperCase(c2);
    }
}
