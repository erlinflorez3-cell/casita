package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d̉=!,r\bӵLc\u0003!Iي8\u000b<Q\u0007Ӭ4\u0012\u0006!njO0L͜P.`o2şs{B?cҕyCQU\"}(\tWNu\u0007vϺb\u000bQ\u000f\u000e\u0016~m4Ikxe\u0012\u00152JoM9UoCBx Dӌ82P7\u001a\u0007\u0007ɝ8H8~\u000bGQÈ\"0\u0007phS=Y\u0013\u001c*\u000eN$\u0007\u001dlg\u00156voҺ>/1\u0007\u0002f\\ϋw0+L-HZ܋\u001bv\n&;D=ߎ%%\u001a\u00035S\fI\u0011A\nC\u0015j7'qI\"\\N|\u000eϬ-+}\f}t,ؘ\u0013Q\t\u00147/UҪ[PT(&{,\u0017J\u0006&\f7J>-`f6\u0014K\u0011\u0001ZXV\u0012`R\u007fAad\u001fE\u00029ٿG\u001b\u000fWq=)N}{3\u0012dŀ\u0019&/dl\u000e\u000f\u0014;V}\u0383?QhCXP\u001aY\u0004m2z\u0013\u00128\u000fHS\u00101\f\u0011t\u001759k9Q \u001a\u000exHu\u0004\u001d`\u0017R0R͕D\"t$Oa\u0017\u0015rD\u0013\u0004\fRZА:\u0011u\"d\t\u000e\bY \u000b\u0007l13\u001bf[xkzM$\n51v7\bm\u001a\u001a\b=l@MQ\u0012\u000f(Rλ\u0018?Bp\u001d~tRk\f\tmH$8ʋx\u0010 \u0004TR\u0012ƎB?8\u001cb-a\u001dj'`\u0003dB\bҙ\u0011ރ^h\u001e\u0012l_2\u0013\u0002$#\u001a!Rbʙ}g!Q<\u0001fõ=A\u00185G'\u0006,v6\u0015)\u0017\u0001\u0004\u007f\u000egzJ\u0013̆\u001e\u0091Y{.*2`_?U\u0013=\u0010I4\bΏSL\u001bmaQ\u0018\u05fd\u000b|@\u000fii^q\u0016l\t2plZO\u001b\u0017P{%и+ \f\u000e\nyF)X\u0004V\u0011ϵLI\u001b\u000bi@T˻\r\u0005e\u001eS\u0002 ,\u000b7EI7\u001f&wZ/Cg$ɘwF p$>t\u0014\u0015Le\u001c˱pQ\u0006:K<Oʲ\u000f>h$\u001b\u0004rLx\n BO4SΑPыhpdKe7=\u0013~\u0007Z\u001e\u0011Xaƥ!o&<>c0ϒS}Z^q&AWai\u0006s[^\u001bJU\n9~w\u07b3\u001aεA dkz0>\u001b\f\u0018dR[d\u000bµ\u0017$\\4L\f\u0011͏diL\u0010)\u0001vi\u001d\u0019JH\u0004=f\u000e\u001bx\u000b[\u000fλh]\b/?\u0019~=D>z;̍\u0013mn\\?g8ܬc\u001dO\u001b\u0019P/p3-\\ZI\u001d8XG\u000bsc\n̺\nN/U?\u0006k\u001e\u000bX\u001f\u0003܈P\u0018ê=Q\u0017v\u001f8n\u000f[c^d=\u0012\u0015S~&7\u0011\u0013|T<Pۏ\u0011ĢSr}zEp\\\u000eOC`\u00017F/܍\u001a|\fL+/\u00165s=wyD+\npk;,\"fñ-ؗx!jr&\u0012\u0018y3:Dp6d\bƁ!PH\f>NzҚ\u001a.N6}\u0003c\u000e!`qs\b%F&;lLBykǰ\u000eczg\u0007y\u0019\u001f~1\u0005x\u000f/Vȿ\u0017'u6#\\`ϐ!SfX?\u0001D\u001f4!N\u000er+ O*h\u001fpg\u007f\u001bGGkX`Q2Xʴ\f\u001f\"}\u0014.Zӏ%;\u001dMle9fzDo\u0014nl8d;\fW\u001a\u0015+Vz)\u0013bE\u0013%jӵE\u0019۵_\rMw/\fUM, AR\u0006\u001be3;y6x)\tJd\u0005\u007fpB7zFפ2EnbY2'\b#\u000ef\t\u0379YE`H\u0018.!\u000eW/\tBPNj%4Ga5Q\u0019W\u0001%:\u0016o5\u0018cvi{3F\u0019|/\f_{7ˉHs_x31\u001foaW\u0015JUEsW?\u0018\u0012gZ~\u0014cf\u0011q,w4s*\u0012pN\u001d\"\u001fj$&w)ǇS1p0o^PV:W25p;˷H#U\u000b\u0011\u0011\u0018K\u0002\u001a\nc\"aTC\u0001߭'Df0=n\u0017E\u0014h(\u001a\u000b\u0012Ә\u00187\u001d$AN%\u001d(O8@KKxى=\\\u0006B#u\u0014:xad\t\u000eEĐ.\u0006;0l\u0001x\f\u0006Su\u000f~\u0012-\u000f\n֓?R\t\u0006p\u001f('\u0012vtE#}³Eb\u0019^'OlPZ\f9\u000560Nǆ\u0010}rh%\u00179ʺ\u0004A\u000e\u0012\u0005|Q)\u001f]=\u000e5kpFOU8Xk<ߵ\u000fmX\\M\nj'm!ycK\u0017\u0006ӭ9.o^N\u001e0Ӆ\u0016\u000e\fdv\u0011t\u0003R*\u00066@2`~!C\f\u00064CKw-e-1\u00039a۩\u001f+__~V[ƪ=xH\u0003>BI\u001d\u0019 k?B%\u0004\rw>*\u000etuc\u001f\u0006I>\u0002\u0002Q'ǒ\u0014?ĪEKrm\u000eG)[E}\u001c m$4\u0014Tlu\u0015\u0002\u00142a\u0013L|VWP\u0012Æ\u0017~jx1\u0013t:-,:[\u0381K\u00069h,7K_\u0007,\\z9W]u\u00146uqvt MU-\u0006\u0019l0 \u001d{wm6\u0007Q\u000bW^\u0019]ڴN\u0013* -(q{\u000f)^&\u0006s{u\f`p\u0013i420t{\u0003f\u0013=\u0012JT[z<~O,\u001ayHr\tfqvBVb܍0'<lь\u001d&"}, d2 = {"/cS\u000e_3", "", "\"", "", "3kT:X5Ma", "", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl\r.t\nMrn<U\u0007\"\u0001W\u00133MAJAw\u0013", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "1n]CX9MB#e~l;`\n\u0018o\u000f\u0006\u0006G\b\u0017\u0015Vs\u0018E", "", "4h[AX9\"\\\u0004\u0006v\\,", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ">qT1\\*:b\u0019kzl<\u0004\u0018\u001eol(\u0004J\u0012\u0017", "4h[AX9\"\\\u0004\u0006v\\,;f9l\u0007(yO\u0005! UU\u001d6p\rEhy\u001d>ms8TJ;iC\"\u001fqo\u001f\u0016", "", ";h]Bf\bLa\u001d\u0001\u0004", "", "3kT:X5M", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011/%", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl\r.t\nMrn<U\u0007\"\u0001W\u00133MAJAw\u000f", ">kd@4:LW\u001b\b", "@d\\<i,", "\u001aj^A_0G\u001d\u001d\b\n^9\u0006\u00056/i1\u0003Td \"W~|P\u0002%C/", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011/)", "7mS2k", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;ckbE|(\u0013\u0011v\nExn\u001fV\u0003 5|k", "@d\\<i,\u001aZ ", "@d\\<i,\u001fW&\r\n", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u000f\u0001<\u0012\u0013`Nk\u0017>@\u000f2^}\u001eFC", "@d\\<i,\u001fW&\r\nH9e\u00196l", "@d\\<i,%O'\u000e", "@d\\<i,%O'\u000edk\u0015\r\u00106", "@dc.\\5\u001aZ ", "@dc.\\5'](\u0002~g.", "@dc.\\5'](\u0002~g.;f9l\u0007(yO\u0005! UU\u001d6p\rEhy\u001d>ms8TJ;iC\"\u001fqo\u001f\u0016", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\u0003.*)!\u001e.\"'%)\u007f(")
public class CollectionsKt__MutableCollectionsKt extends CollectionsKt__MutableCollectionsJVMKt {
    public static final <T> boolean addAll(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }

    public static final <T> boolean addAll(Collection<? super T> collection, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends T> it = elements.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }

    public static final <T> boolean addAll(Collection<? super T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.addAll(ArraysKt.asList(elements));
    }

    public static final <T> Collection<T> convertToListIfNotCollection(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = CollectionsKt.toList(iterable);
        }
        return (Collection) iterable;
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1, boolean z2) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue() == z2) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.IntIterator] */
    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(List<T> list, Function1<? super T, Boolean> function1, boolean z2) {
        if (!(list instanceof RandomAccess)) {
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return filterInPlace$CollectionsKt__MutableCollectionsKt(TypeIntrinsics.asMutableIterable(list), function1, z2);
        }
        ?? it = new IntRange(0, CollectionsKt.getLastIndex(list)).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            T t2 = list.get(iNextInt);
            if (function1.invoke(t2).booleanValue() != z2) {
                if (i2 != iNextInt) {
                    list.set(i2, t2);
                }
                i2++;
            }
        }
        if (i2 >= list.size()) {
            return false;
        }
        int lastIndex = CollectionsKt.getLastIndex(list);
        if (i2 > lastIndex) {
            return true;
        }
        while (true) {
            list.remove(lastIndex);
            if (lastIndex == i2) {
                return true;
            }
            lastIndex--;
        }
    }

    private static final <T> void minusAssign(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        CollectionsKt.removeAll(collection, elements);
    }

    private static final <T> void minusAssign(Collection<? super T> collection, T t2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        collection.remove(t2);
    }

    private static final <T> void minusAssign(Collection<? super T> collection, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        CollectionsKt.removeAll(collection, elements);
    }

    private static final <T> void minusAssign(Collection<? super T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        CollectionsKt.removeAll(collection, elements);
    }

    private static final <T> void plusAssign(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        CollectionsKt.addAll(collection, elements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void plusAssign(Collection<? super T> collection, T t2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        collection.add(t2);
    }

    private static final <T> void plusAssign(Collection<? super T> collection, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        CollectionsKt.addAll(collection, elements);
    }

    private static final <T> void plusAssign(Collection<? super T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        CollectionsKt.addAll(collection, elements);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001t\u0004y\"fnL\t\u000f\u0018\u001e:RadQf\u000ev\u001ff{Gr8", replaceWith = @ReplaceWith(expression = "removeAt(index)", imports = {}))
    @InterfaceC1492Gx
    private static final <T> T remove(List<T> list, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.remove(i2);
    }

    private static final <T> boolean remove(Collection<? extends T> collection, T t2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return TypeIntrinsics.asMutableCollection(collection).remove(t2);
    }

    public static final <T> boolean removeAll(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((Iterable) iterable, (Function1) predicate, true);
    }

    public static final <T> boolean removeAll(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.removeAll(CollectionsKt.convertToListIfNotCollection(elements));
    }

    private static final <T> boolean removeAll(Collection<? extends T> collection, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return TypeIntrinsics.asMutableCollection(collection).removeAll(elements);
    }

    public static final <T> boolean removeAll(Collection<? super T> collection, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = SequencesKt.toList(elements);
        return !list.isEmpty() && collection.removeAll(list);
    }

    public static final <T> boolean removeAll(Collection<? super T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return !(elements.length == 0) && collection.removeAll(ArraysKt.asList(elements));
    }

    public static final <T> boolean removeAll(List<T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((List) list, (Function1) predicate, true);
    }

    public static final <T> T removeFirst(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static final <T> T removeFirstOrNull(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static final <T> T removeLast(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(CollectionsKt.getLastIndex(list));
    }

    public static final <T> T removeLastOrNull(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(CollectionsKt.getLastIndex(list));
    }

    public static final <T> boolean retainAll(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((Iterable) iterable, (Function1) predicate, false);
    }

    public static final <T> boolean retainAll(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.retainAll(CollectionsKt.convertToListIfNotCollection(elements));
    }

    private static final <T> boolean retainAll(Collection<? extends T> collection, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return TypeIntrinsics.asMutableCollection(collection).retainAll(elements);
    }

    public static final <T> boolean retainAll(Collection<? super T> collection, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = SequencesKt.toList(elements);
        return !list.isEmpty() ? collection.retainAll(list) : retainNothing$CollectionsKt__MutableCollectionsKt(collection);
    }

    public static final <T> boolean retainAll(Collection<? super T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return !(elements.length == 0) ? collection.retainAll(ArraysKt.asList(elements)) : retainNothing$CollectionsKt__MutableCollectionsKt(collection);
    }

    public static final <T> boolean retainAll(List<T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((List) list, (Function1) predicate, false);
    }

    private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(Collection<?> collection) {
        boolean z2 = !collection.isEmpty();
        collection.clear();
        return z2;
    }
}
