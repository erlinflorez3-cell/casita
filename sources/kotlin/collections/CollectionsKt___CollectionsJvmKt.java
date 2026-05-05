package kotlin.collections;

import com.dynatrace.android.agent.Global;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Яf\u001d̉=!,\b\bӵLc\u0003\u001eIي8\u000bDB\u0007\"2\u0012\u007f\u0007t\bA0JgP.``2şs{B(cҕyCIZ\"}(\nWN}gvJ`\fK\u000f\u001c\u0016\u0001jBI]xc\u0015\u00172PoG3[\u000fEʠhtL\u0005(݅*8\u0010\u0005\t\u001a0H\u0018v\u0011CSÈ*VN\u0081RX\u001dO\u0015\u001aX\u0006l\u001f! bɡ\\6ppm:5$1jrX5aH\u0003]\u000fVTm\r%d6jN;M\u0015kX#\u0015X¹M\bgyM\tnѧ7+\u0010s\u0006<x\u0002\u001a\u00149O5a\u0003&b\u0006\u007fa<+9V{K\u0017\u0013X\u0002\t}%B\u0014\u0010\u0016'\u000f.[\u001dǴ\f\u000eA|\u000bzNY\u001a`X~AkV#+ĮA5a!vSq;_Xe\u0007-\u0013.%\u0011nge\u0003\u000f'\u001aôXw_=iWKQf\fo<\u001c\u0011\u0019h\u0012,\u00140u\r]|W3ϲ)7iG;8y\u000b`F}u3o\u0011YyTX@P}D8p\u000eɔ^Dr\u0015\u0004\u0016biD\u0013c\u001b\u001b\u0011\u001e\n\u0019\u05fej\u0002\\-+\u000f\\O\u0011ozOm\nk/\u0015B\u0002t{\u0010g9%=cR\u0014 od\u000f O>r\u0005\u001fpRU\u001cZ#(PE\u000fТ\u0016ɧzͩ«\u0010\u0013@S\nUBAI\u001br\u0014\u000f\r>DGґ\u0017i\u0003n \u0001d3j\r\u0018%%!\u000fft\u0005\u007fk~̢<|',[X:=)*[Ȩx4C-e\u0017:\u0005ěkLUe\u0005=\u0004o\u0014\",\u0019\u007f[OI\u0019Á\r3Z\b=G\\r,[{\u001dO\u0001\r{\u001f;/8\u0016\t1uݽdjX[l.0\u0011vt9\u0007\u0013\r\"gV|Wc\u0003\u0018\n?\u0010wè]<\\F\u0015\u001c-8=\u0003\u0006!+DUI7\u001f&wB>Cb$nܓ2yp\u001f>:s\u001fDe,n)[}4AͯWc\u001fJ(#z\u0003jNzy\u0018BO4;>pGtrf8\u0014\u0015]~\u0017\u0017:\u001f\tbk<#oD>>a:s\n}Bq\nѡ\u0017µR܊ƽqKj\u001fbH\u0018'\u00143\u0005\u0011bG@X]ł\u0017:.y(8Q;)\u000fj\nTL:R \u001fSXoв zFP\u000e&\u007f:RwAٙ\u001eT?f5`Ke҇d!8\u001a\u0017#A;\u00115_#\u000eHZЏq<)Y-\u000b+j\u0016\t\u0015DCwbY3(\u0007\"+GcŝW\f^\nW+}k6\u0016f\u0019--P*3Ea\u0013ovvh\u001bWtN\u0013\u0018@y\u0019Ƒ(Ə}ғէ\u0012<\u00101#L]\u0013\bb[ony=Ƒ(\u000b?J9\t\u001c|*PI.6E;Oav$)\fW\u001aE\u000e\n0 U'#4#ޮ\u0014ӗ\t܁Ό>\u0016w:z&\u00178h&\u00140Zt9\u0014\\.V[\b֯\u0010\u001d\u0007_{y1@m5\u001b\u0011jQxz\u001ac3m\u001dV#9tVn\u007f~/`\u001dO1{T3Z`ϐ\u001f]H^!\u0002$\u0015l)d\t\u0013A\u001ee{|\u0001oU܀\u001d+uuXx\u001a8b\"\u0004Υ\nuJ43@׀;[UAjԑ\r\u001bAŉ\u0012\u0006"}, d2 = {"4h[AX9\"a|\b\tm(\u0006\u0007/", "", Global.BLANK, "", "9kP@f", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "4h[AX9\"a|\b\tm(\u0006\u0007/T\n", "\u0011", "", "2dbA\\5:b\u001d\t\u0004", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWL\u0006)<#[*>t\u0016,\\GEt\n\u0005\u001adr5Pj(Wxp%SJ:j(6$\u0019\u000ek\n\u0018;\u001c\t`\u000b\u0002xK>\u001f\u0006;M\fD>", ";`g", "\"", "", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016D}\u001cC\u0001\n\u0006}!>[G}Au!*Z?8r4s", "", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016D}\u001cC\u0001\n\u0006}!>[G~A}\u00135M\u0019", "", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016D}\u001cC\u0001\n\u0006}!>[G\u0001>w\u0012=#", ";`g\u000fl", "Ad[2V;H`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001aLj.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017", ";`g$\\;A", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016g\u001c\u0013XkWL\u0006)<#[*?x\u0012;IREx\na{m]J\u0003-3J\u007f)\u00116K1\\P\u0002\u0013", ";h]", ";h]\u000fl", ";h]$\\;A", "@de2e:>", "", "", "At\\\u001cY", "\u001aiPCTuFO(\u0002D;0~g/c\u00040wGV", "At\\\u001cY\tBUw~xb4x\u0010", "\u001aiPCTuFO(\u0002D;0~l8t\u007f*{MV", "At\\\u001cY\tBU|\b\n^.|\u0016", "BnB<e;>R\u0007~\n", "\u001aiPCTuNb\u001d\u0006DL6\n\u0018/dm(\u000b\u0016", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\u0003.*)!\u001e.\"'%)\u007f(")
public class CollectionsKt___CollectionsJvmKt extends CollectionsKt__ReversedViewsKt {
    public static final <R> List<R> filterIsInstance(Iterable<?> iterable, Class<R> klass) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (List) CollectionsKt.filterIsInstanceTo(iterable, new ArrayList(), klass);
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(Iterable<?> iterable, C destination, Class<R> klass) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        for (Object obj : iterable) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ Comparable max(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.maxOrNull(iterable);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: max */
    public static final /* synthetic */ Double m9407max(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.maxOrNull(iterable);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: max */
    public static final /* synthetic */ Float m9408max(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.maxOrNull(iterable);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Deprecated(message = "\u0018Y\u0001t~u-9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ Object maxWith(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt.maxWithOrNull(iterable, comparator);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ Comparable min(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.minOrNull(iterable);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: min */
    public static final /* synthetic */ Double m9409min(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.minOrNull(iterable);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: min */
    public static final /* synthetic */ Float m9410min(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.minOrNull(iterable);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Deprecated(message = "\u0018Y\u0001t~}#9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ Object minWith(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt.minWithOrNull(iterable, comparator);
    }

    public static final <T> void reverse(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Collections.reverse(list);
    }

    private static final <T> BigDecimal sumOfBigDecimal(Iterable<? extends T> iterable, Function1<? super T, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(it.next()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final <T> BigInteger sumOfBigInteger(Iterable<? extends T> iterable, Function1<? super T, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(it.next()));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (SortedSet) CollectionsKt.toCollection(iterable, new TreeSet());
    }

    public static final <T> SortedSet<T> toSortedSet(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) CollectionsKt.toCollection(iterable, new TreeSet(comparator));
    }
}
