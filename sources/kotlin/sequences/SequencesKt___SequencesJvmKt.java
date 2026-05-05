package kotlin.sequences;

import com.dynatrace.android.agent.Global;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d̉=!4i\bDJc|\u0004W\u00068\u000b4B\u0007\":/\u007f\u0007llA0RrP\u008cZS8\u0013sڔ<$i)yCAV\"}8\tWNmhvJp\u000bK\u000f\u001c\u0016\u0001j2L]xs\u0012\u0017˰JoU3UoC9htL\u0005(݅:^\bڎ\u0019 :J vACy\u000b22F\u0081HR5Q\u0015\u001a\u0018\u0007l\u001f1(jhf<Xnm:u#1kZ\u000e5bH|\u0014\u0011fb-˙\u0005eF3P;;Ֆ5SI\u0007\u0001`_\u0005EpK\u0005\u0011+7+Ot\u00065\t\u0004\"\u001bCOSa#0j\u0006if\u001c);O*K~\u0010߭{z\n\u0014T+\u001c\u000e?JD,`o(\u001a9ο\u0001\\hV\u0012`R\u007fAjd!M\u0006C-I\u001b-Z\u0010:_SѼ\u007f\u0005\u001b);\u0018|)sV$_C'|}a3a@kT|\t Bъ\bpp\u000fB\u001b>O\u00181\u0012\u0010\\%M=k;3!\u001a\u0010vC.{ݶdhaxj\u000eN2\u0007\u0018M)O\u0015zFjʍyYtd2\u0010[\u001c|\r\u000e\n# #wj+M\u0016^Qxi1V\f\tU?tHqz{\u0010g9%<ESs\u0010(R%&\u0006ׂhܬW٨͞W\fho@[@\\\u0003\u0012\u000ez\u000bW,\u00158ŭ\u007f%\\2A\u001bl\u0015\u000f\fLAq\u0015\u0017tr| \u0003Z՜4\u00030-#\u001fiXltuΟ\tIr\u0006?9sFپ9\u00194m:\u0010B\u0016;\t\u0015rFP\bXMƂz\u001f\u001e[\f\"&\u001a\u007fZ]G;\u0015\u000f+B\u0002sNzq,V̊\u0016'\t\b\u0012&I\u0002Fi\u001ei\u001f8\tpZQd\u0017P\u0003\rqi\rܐ\u0004yoS\u0013^qm#]TH!\u0011\u0002B^:\r\u0005M,S\u007f6'Ŀ9-Q65[\u0006.G\u0017w\\0xN{hχ4}\u0006\u00102b$o\u000bWm4K8\u0010Y-HJ*|\u0005RH1\u00016A9D\u001bD`Mtrf8\u0014\u0014?\u007fv\u0007r\r\u001fh\"ƭ\u0019\u0383|Үˀc*\u0002V\u0016Ml^=\u0013cR.v\u000eMb֥X\u00182\u0011\f3~\u0012bFNU\bz\u0017E\u001e\b(:Gݥr\u0005\u0003\u0012RJ\u0015D\u0018\u000fIҍy\u0006V\u0004^]&\u0014ł6B\u0002SnAb\u0015tVv\"\u0001GfԠ8\n'\u0015C \t5w\u000e\u001cE\u0005?qC\u0019_-\u000b+j\u0016\bv';D\u0003VI:\u001fۦ\u0011֮\\ŝ͕\u00066\neA!y\f$8F\u001c=D\u001eÇGZ9e\u00072n\u000b\u001cm|c'\"tcf.9\u0001\u000b|TE\u001a\u0011\u001b\u0019}\u0012\u001etsٓTÏ6Ƒױ\u0005\u0017JI\u001f0\u000b\u0005^!=\bE-\u0004R\u00196G\b]ėI\u00070&0)\u0014tge\u0006\u0018\u000f\u0010m\u001dJ\u00168\u001f\u0011\u0001!I^A\u001c4Zv\u0003\nt\u0011dq\"5\bՂlb\u0014}1B7+3\u000fpJ\u0019\u0011\u0018x\u0005w~Y\u0011ӆv1\u001d\u0003\u001dC9%\u0019+Sܘ#X!CojݳX\u0016\b\u0017\u001bӋOd\u0007Ԝ-3"}, d2 = {"4h[AX9\"a|\b\tm(\u0006\u0007/", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", Global.BLANK, "9kP@f", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "4h[AX9\"a|\b\tm(\u0006\u0007/T\n", "\u0011", "", "2dbA\\5:b\u001d\t\u0004", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012]*1jyiG|\u001a5\u0017!Er;\u001e\u0013weC\u00109\u0013Sr8C\u0016U(eT<\u001b\u001b\u000eh\u001c$ns\nUR 8TF#\u000fu'\fBo\u0001\n%\u0012?sF", ";`g", "\"", "", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012:\f:U\u000f\u001c\u0001t\u00127O\r\u0019u<)\u0011u]6\u000ec\u0002", "", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012:\f:U\u000f\u001c\u0001t\u00127O\r\u001auD\u001b\u001ch7", "", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012:\f:U\u000f\u001c\u0001t\u00127O\r\u001cr>\u001a$>", ";`g\u000fl", "Ad[2V;H`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5((6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", ";`g$\\;A", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e\u0012]*1jyiG|\u001a5\u0017!Es?\u001a\"dpC\u00149o5{#XH\u00183X[t\u0007}\u000f_\u000eL:b", ";h]", ";h]\u000fl", ";h]$\\;A", "At\\\u001cY", "\u001aiPCTuFO(\u0002D;0~g/c\u00040wGV", "At\\\u001cY\tBUw~xb4x\u0010", "\u001aiPCTuFO(\u0002D;0~l8t\u007f*{MV", "At\\\u001cY\tBU|\b\n^.|\u0016", "BnB<e;>R\u0007~\n", "\u001aiPCTuNb\u001d\u0006DL6\n\u0018/dm(\u000b\u0016", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{?0;>-5)*7q\u0015&14#+\u001f -\u0004,")
class SequencesKt___SequencesJvmKt extends SequencesKt__SequencesKt {
    public static final <R> Sequence<R> filterIsInstance(Sequence<?> sequence, final Class<R> klass) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Sequence<R> sequenceFilter = SequencesKt.filter(sequence, new Function1<Object, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(klass.isInstance(obj));
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return sequenceFilter;
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(Sequence<?> sequence, C destination, Class<R> klass) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        for (Object obj : sequence) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ Comparable max(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SequencesKt.maxOrNull(sequence);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Double m10251max(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SequencesKt.maxOrNull(sequence);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Float m10252max(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SequencesKt.maxOrNull(sequence);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Deprecated(message = "\u0018Y\u0001t~u-9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(Sequence<? extends T> sequence, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
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
    public static final /* synthetic */ Object maxWith(Sequence sequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return SequencesKt.maxWithOrNull(sequence, comparator);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ Comparable min(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SequencesKt.minOrNull(sequence);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Double m10253min(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SequencesKt.minOrNull(sequence);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Float m10254min(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SequencesKt.minOrNull(sequence);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Deprecated(message = "\u0018Y\u0001t~}#9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(Sequence<? extends T> sequence, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
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
    public static final /* synthetic */ Object minWith(Sequence sequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return SequencesKt.minWithOrNull(sequence, comparator);
    }

    private static final <T> BigDecimal sumOfBigDecimal(Sequence<? extends T> sequence, Function1<? super T, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(it.next()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final <T> BigInteger sumOfBigInteger(Sequence<? extends T> sequence, Function1<? super T, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(it.next()));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (SortedSet) SequencesKt.toCollection(sequence, new TreeSet());
    }

    public static final <T> SortedSet<T> toSortedSet(Sequence<? extends T> sequence, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) SequencesKt.toCollection(sequence, new TreeSet(comparator));
    }
}
