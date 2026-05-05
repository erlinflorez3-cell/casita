package kotlin.text;

import com.dynatrace.android.agent.Global;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!,s\bDRn|İI\u0006>\u00116B\u0005$4\u0012\u0006\u0014nʑA0ZeP.XT2\u000f\u0002{<$q$yCAX\"}8\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4կm\fk܈'2png3{om=nuN\u0005N4h؈\u007f\u001d\u0012(-`\u0012\ryqJ4\u0012^@7?ň\u0011M\u0013\u001e*?L%\u0019 rf|5hxcŽ=)+oRP7_v\u0003{\u0014nTU\r'q,3XCE\u00175S1\u0006b]O\u0003\u0006wk\u000e/ѯ-ɛH֕ɱ:X\u000e\u001e-X]\u0018ut<[3P\t\fU+\u007f{Y\\&<\b~\u0002ȞL\u0004<\u0005UU\u00175*j\u000eԄCt!R\u001f^Hc۰\u0004zoE/6\u000eCC;1e\u007f`c\u0019|7B\nڟ\"#\u000fr9\u0015b\u001fx\u00171S&PQ]F׀VT2_Mo\u0014p)\bX\u000bXG./,!<\u001f=Ck;3!\u001a\u0001XFwvKf\u0017\\0ɵNڐ!Âގ;*\u0017\u0016rqr\u0017\u0004RjWZ\u0010u\u001c\u0003\u0007. !,t\fL%+ī^O\u0017h\u0019ZF\u001253lŽin\u001a\r6G%8̳Uc\u001epj\u001e\"RTb3l\u000fB\u0002\f\u000bl6*JTz\u0012\b{rM\u001c\u0015B? 0b5wǑbŢGґٿFA\u0003\u001ew\u0002v#\u0017Ta:+iRt9\u0011^d\t{wzY,+_2/QQc/T^h׃:ţ\"Ȕҋw\u007fM~dUZ\u0005.{e}0\u0016H8\u007fHe\u0013=~Ǿ2\u00075HRȃ\u0016\u007fLɥ+\u0015"}, d2 = {"3kT:X5M/(", "", "", "7mS2k", "", ";`g", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001d3tAr61#\u0005\u001c@o_\fP?Hg2-\u0015u7", ";`g\u000fl", Global.BLANK, "", "Ad[2V;H`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u0014F\u0006,9bG%Hu_/]L9z8(\u001ev+\u001a\u0017l*]z1P\u0018$oCWnN\u0010[a\nW-Vb\\=1jBF\u001f\u0015\u0002", ";`g$\\;A", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dV\u00138\b!~i\r$>7s8UN7x0-\u001fu7|mh(_rpNHW.&0u9!\u000eX\u001dN8b", ";h]", ";h]\u000fl", ";h]$\\;A", "At\\\u001cY", "\u001aiPCTuFO(\u0002D;0~g/c\u00040wGV", "At\\\u001cY\tBUw~xb4x\u0010", "\u001aiPCTuFO(\u0002D;0~l8t\u007f*{MV", "At\\\u001cY\tBU|\b\n^.|\u0016", "BnB<e;>R\u0007~\n", "\u001aiPCTuNb\u001d\u0006DL6\n\u0018/dm(\u000b\u0016", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{@0B=v\u001a:7-1)4\u000b3")
class StringsKt___StringsJvmKt extends StringsKt__StringsKt {
    private static final char elementAt(CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.charAt(i2);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ Character max(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.maxOrNull(charSequence);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    @Deprecated(message = "\u0018Y\u0001t~u-9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        ?? it = new IntRange(1, lastIndex).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ Character maxWith(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return StringsKt.maxWithOrNull(charSequence, comparator);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ Character min(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.minOrNull(charSequence);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    @Deprecated(message = "\u0018Y\u0001t~}#9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(CharSequence charSequence, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = selector.invoke(Character.valueOf(cCharAt));
        ?? it = new IntRange(1, lastIndex).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            R rInvoke2 = selector.invoke(Character.valueOf(cCharAt2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                cCharAt = cCharAt2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ Character minWith(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return StringsKt.minWithOrNull(charSequence, comparator);
    }

    private static final BigDecimal sumOfBigDecimal(CharSequence charSequence, Function1<? super Character, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Character.valueOf(charSequence.charAt(i2))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final BigInteger sumOfBigInteger(CharSequence charSequence, Function1<? super Character, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Character.valueOf(charSequence.charAt(i2))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final SortedSet<Character> toSortedSet(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (SortedSet) StringsKt.toCollection(charSequence, new TreeSet());
    }
}
