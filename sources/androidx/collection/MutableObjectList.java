package androidx.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&˛\bDZc|İI\u0006>\u00116B\u0005%4\u0012\u000e\u0007nʑA0RnP.XS2\u000fy{<$a&yCQU\"}0\u0018WNmgvJh'K\u000f\u00140\u0001j:g]xs\u0012\u00172HoG3[\u000fE9f~>\u000562*8\u0010\u0005\t\u001a0S&͌#EQÈ /pvJT\u001dMK\u0019@\u0006v!5S\u0013([FNr]H0;\u0003\u0018DĚ+_>\u007f\u0016\u001eT]?\r%kN/NBM\u0015[مΫ\u000bRiKKZ\u007fF\u001dhU4[OyVDf\u0018\u0014C-\u007f\u0011k}>\\;ĩԃ\u0010'9^,]^\u001e@w)\u0006=F\u0012\u001f\u001e-X0=\u001a\u001dڜ<3=\u0005aPh\u0002\rL0\u0005oG/+\u00105;9QƘ\u007fs\u00040\\G\u0014\u0005;(S\u000b|2sZ\u001eb%\u001b\u000bȭ\u007fDҨD=VbRuK}\u001cp\u0011\fZ\n6F\u000e=\u0014\u0011\\\u0019UAiJ;'{\u0004XD\u001eϸ3`1twb`@PxF=0\b\u001ah\\d3m\u0001^f=)S,V\u0017}>ʶNoʟ@!3%\u0017kvy\u0003M\f\u0014U5l6g|\u0004\u000e\u0006;\u000f=Cb{\u0016qT\u0007\u0014uֺ\u0011\u001b!xPc$Z\u000b2R<V{(}\fF^\fIԵm\tdF:A1\\CR3(PR\u0015\u000fo\\x\u00105Ԟa<K{2\u0005!\u0001~f!yu\na2\rb2-wٛc2na0\u0003L\u00033\t\u000fs6ø\u0016d\u000e`5 \u0004p\u0014&&\u001cIQeˋA+G-@\u001fEEz\u007f.][0?z+\u0007??v2\u007f\b\u0019rttxigTE/'b\u0001. d6ט(Æ\u0003ĕgT\u0019{\u0007^\u0001\"q<|E-\u000f-/=\u0007\u007f$\r5cξU\u001d\\ߗ\u0014w*o|\u0002o\\\u0007\u0013\u00194\u0006}\n<e&o\u0019Г\fD\u0002ͶI\"\u0019LA<l1Oxt\u0006\u0019Z\u000fD\u000fCHwЬ\u001fi~Ԏ\u000bɣ\u0002f\u0015MU\u0006dzR\u0013\u001e\u000bd8m;\fI\u000e\u0016nC[ݎ{j.ơm\u0014q\u0019i'\n9\tax -U&fYr\tfү\"0|ה;+\u001aJ(<4ZI8\u0015Qe\u0002\f |\u0010F\u0016ʕEK\tǄ;\u001f\"b\u001btVv\u0012\u0011In,B\u00015۰yͯ\u0001\u00985\u0005{f\u001dDqT\u0019SK\u0016Kt]\u0010~+;Fd9Qι\u0007\u0001QԼ]\f^\u0010X\u001cGWz\u001cy\u001aI0\u0003-D(\u001boܱ?q=ѱ^Sorp|v@s\u0003X0:\u0017\u0001\r\u0010L\nEԥGb9žbυPN\u0006X\f/\u000f9\\)5\u0019-mT,E\fE/MI!̟U\u0013\u001eĞ;F\u001d.B?\u0004#.\ra\u001cw\"c+<&qLȈ0!YЪ LCX\u0017\u000b\n\\\u0015fY\u0010D\u001a\u0019n[{wW̸UD3ݰB\u0014y\u0007-{l\u0012x\u0006\u000f\u0011qIV0ҧ\u0094T\u001d\u00173\u0016@!|r:?]Pb\u001f\u0011,\u001b6!F\b\u0019Ϫ>O,z~\u0010g[;5_u8rI6b \u000e\u001f0ǡ2<\u001d?#_nMln9fzSo\u0014nl8d+׃W'μ\u0003Hl%[FT\u00176d]AI)i\u001e_f\u0017\u0006UI\\ϳ_i\b-EV#oV\u0001A\rHs\r\u0006:D\u0019r6לZE\u000ffK>?YRw\u0015\r4\\]>R\n<\u0011Dı]s\u00013L\u00022\u001cqǛcG\u001f\u0010\u000f#P\u0006\u001e\tص9j_ymW\u000f$\u0019\rm\u0007a\u000bH\u001cO\u000e3@\u001f~Qʰǃ?/;\u0010\\-\u0012-uL\u0005S\na\u001fc<IcOL#\u001cʵ\u0006̢\u001e\u07fbl\u001e\u0004O\u0018E_UZeb?d!o\u0004T,ftJ\"U\u001b\u0011s8.2*\u0002\u0014sabK+\u001e'UV0=n\u0017E\u0004ˈ(\u000b\r$SCO\u000f43c!\u000b!gwP-Yr\u0004ҍ\u000bpڍ\u0017s\u0012NzsD)_@\b467 e{pzoa_Fؾ@#U\u0016\u0006`j`.jM\"5\\\u000fLF^\tMwǓ9WW6l]Z\f9\u0010F8V(\u001a\u0004Zb%\u0013iʺ\"Z\u00100d,9\u001dG\u0603U\f+fxUWU Zm=A\u0016\u0006J\u000f˂,ګ\u0005Ȝ%Kr\\]\u000ex]FG\u0005KJ0^\u0006\u001cx|H>FIT6qH0^R5¦C\u05fc\u0005 7?[\u001as\u0005\u0003vEb|\u0019;9gn\tд9,'\nY\u07b3Më\u0017\u000b&ҍէ2({\u00107ğ,6[ƜY4"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=#", "\u0013", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d#z3D/", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", ":hbA", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=\f-8p4\u001c$OeG\u0016K<]r$NL50jaH", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/cS\u000e_3", "3kT:X5Ma", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D/", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "uHJ\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\f", "", "", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "/r;6f;", "/r<Bg(;Z\u0019e~l;", "", "1kT.e", "3mbBe,\u001cO$zxb;\u0011", ";h]Bf\bLa\u001d\u0001\u0004", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", ">kd@4:LW\u001b\b", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "@d\\<i,+O\"\u0001z", "AsP?g", "3mS", "@dc.\\5\u001aZ ", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "BqX:", ";h]\u0010T7:Q\u001d\u000e\u000f", "\u001btc.U3>=\u0016\u0004z\\;c\r=tc7{M|&!T", "\u001daY2V;%W'\u000ebn;x\u00066ef,\nO", "!tQ\u0019\\:M", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableObjectList<E> extends ObjectList<E> {
    private ObjectListMutableList<E> list;

    public MutableObjectList() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableObjectList(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 16 : i2);
    }

    public MutableObjectList(int i2) {
        super(i2, null);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(E e2) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = e2;
        this._size++;
        return true;
    }

    public final void add(int i2, E e2) {
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        ensureCapacity(this._size + 1);
        Object[] objArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(objArr, objArr, i2 + 1, i2, this._size);
        }
        objArr[i2] = e2;
        this._size++;
    }

    public final boolean addAll(int i2, E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        Object[] objArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(objArr, objArr, elements.length + i2, i2, this._size);
        }
        ArraysKt.copyInto$default(elements, objArr, i2, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final boolean addAll(int i2, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        int i3 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this._size + elements.size());
        Object[] objArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(objArr, objArr, elements.size() + i2, i2, this._size);
        }
        for (Object obj : elements) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            objArr[i3 + i2] = obj;
            i3 = i4;
        }
        this._size += elements.size();
        return true;
    }

    public final boolean addAll(int i2, ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i2 < 0 || i2 > this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + this._size);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this._size + elements._size);
        Object[] objArr = this.content;
        if (i2 != this._size) {
            ArraysKt.copyInto(objArr, objArr, elements._size + i2, i2, this._size);
        }
        ArraysKt.copyInto(elements.content, objArr, i2, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        plusAssign((ObjectList) elements);
        return i2 != this._size;
    }

    public final boolean addAll(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        plusAssign((ScatterSet) elements);
        return i2 != this._size;
    }

    public final boolean addAll(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        plusAssign((Object[]) elements);
        return i2 != this._size;
    }

    public final boolean addAll(List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        plusAssign((List) elements);
        return i2 != this._size;
    }

    public final boolean addAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        plusAssign((Iterable) elements);
        return i2 != this._size;
    }

    public final boolean addAll(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        plusAssign((Sequence) elements);
        return i2 != this._size;
    }

    public final void plusAssign(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements._size);
        ArraysKt.copyInto(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements.getSize());
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = ((~j2) << 7) & j2;
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
                        add(objArr[(i2 << 3) + i4]);
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void plusAssign(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        ensureCapacity(this._size + elements.length);
        ArraysKt.copyInto$default(elements, this.content, this._size, 0, 0, 12, (Object) null);
        this._size += elements.length;
    }

    public final void plusAssign(List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i2 = this._size;
        ensureCapacity(elements.size() + i2);
        Object[] objArr = this.content;
        int size = elements.size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3 + i2] = elements.get(i3);
        }
        this._size += elements.size();
    }

    public final void clear() {
        ArraysKt.fill(this.content, (Object) null, 0, this._size);
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = mutableObjectList._size;
        }
        mutableObjectList.trim(i2);
    }

    public final void trim(int i2) {
        int iMax = Math.max(i2, this._size);
        if (this.content.length > iMax) {
            Object[] objArrCopyOf = Arrays.copyOf(this.content, iMax);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.content = objArrCopyOf;
        }
    }

    public final void ensureCapacity(int i2) {
        Object[] objArr = this.content;
        if (objArr.length < i2) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i2, (objArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.content = objArrCopyOf;
        }
    }

    public final void plusAssign(E e2) {
        add(e2);
    }

    public final void minusAssign(E e2) {
        remove(e2);
    }

    public final boolean remove(E e2) {
        int iIndexOf = indexOf(e2);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final void removeIf(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i2 = this._size;
        Object[] objArr = this.content;
        int i3 = 0;
        IntRange intRangeUntil = RangesKt.until(0, this._size);
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first <= last) {
            while (true) {
                objArr[first - i3] = objArr[first];
                if (predicate.invoke(objArr[first]).booleanValue()) {
                    i3++;
                }
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        ArraysKt.fill(objArr, (Object) null, i2 - i3, i2);
        this._size -= i3;
    }

    public final boolean removeAll(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        for (E e2 : elements) {
            remove(e2);
        }
        return i2 != this._size;
    }

    public final boolean removeAll(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        minusAssign((ObjectList) elements);
        return i2 != this._size;
    }

    public final boolean removeAll(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        minusAssign((ScatterSet) elements);
        return i2 != this._size;
    }

    public final boolean removeAll(List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        minusAssign((List) elements);
        return i2 != this._size;
    }

    public final boolean removeAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        minusAssign((Iterable) elements);
        return i2 != this._size;
    }

    public final boolean removeAll(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        minusAssign((Sequence) elements);
        return i2 != this._size;
    }

    public final void minusAssign(List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i2 = 0; i2 < size; i2++) {
            remove(elements.get(i2));
        }
    }

    public final E removeAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("Index " + i2 + " must be in 0.." + (this._size - 1));
        }
        Object[] objArr = this.content;
        E e2 = (E) objArr[i2];
        if (i2 != this._size - 1) {
            ArraysKt.copyInto(objArr, objArr, i2, i2 + 1, this._size);
        }
        this._size--;
        objArr[this._size] = null;
        return e2;
    }

    public final void removeRange(int i2, int i3) {
        if (i2 < 0 || i2 > this._size || i3 < 0 || i3 > this._size) {
            throw new IndexOutOfBoundsException("Start (" + i2 + ") and end (" + i3 + ") must be in 0.." + this._size);
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("Start (" + i2 + ") is more than end (" + i3 + ')');
        }
        if (i3 != i2) {
            if (i3 < this._size) {
                ArraysKt.copyInto(this.content, this.content, i2, i3, this._size);
            }
            int i4 = this._size - (i3 - i2);
            ArraysKt.fill(this.content, (Object) null, i4, this._size);
            this._size = i4;
        }
    }

    public final boolean retainAll(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        for (int i3 = this._size - 1; -1 < i3; i3--) {
            if (ArraysKt.indexOf(elements, objArr[i3]) < 0) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        for (int i3 = this._size - 1; -1 < i3; i3--) {
            if (!elements.contains(objArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean retainAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        for (int i3 = this._size - 1; -1 < i3; i3--) {
            if (!elements.contains(objArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean retainAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        for (int i3 = this._size - 1; -1 < i3; i3--) {
            if (!CollectionsKt.contains(elements, objArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean retainAll(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        Object[] objArr = this.content;
        for (int i3 = this._size - 1; -1 < i3; i3--) {
            if (!SequencesKt.contains(elements, objArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final E set(int i2, E e2) {
        if (i2 < 0 || i2 >= this._size) {
            throw new IndexOutOfBoundsException("set index " + i2 + " must be between 0 .. " + (this._size - 1));
        }
        Object[] objArr = this.content;
        E e3 = (E) objArr[i2];
        objArr[i2] = e2;
        return e3;
    }

    @Override // androidx.collection.ObjectList
    public List<E> asList() {
        return asMutableList();
    }

    public final List<E> asMutableList() {
        ObjectListMutableList<E> objectListMutableList = this.list;
        if (objectListMutableList == null) {
            objectListMutableList = new ObjectListMutableList<>(this);
            this.list = objectListMutableList;
        }
        return objectListMutableList;
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&˛\bDR\r|İI\u0006>*6Ȑ\u0007\":\u0018\u007f\u0007lkA0ReP.XT2\u000fy\u0005<$a+wCQ٥B\u007f(\b]M\u0018m~Lj\u000b\n\u000e4\u00169\u0004<Scyu\u0018\u001f4Rou2{qM=nwN\u0005N6ŕ<y\u0013\u0006b=V\u0017\u000fzqS<\u0016>I\t:\t\f\u0014\u0019ܨ\u0016\u0006L*I%jrf6vx$Ɣ/k\twOf'\u000e<CaURb5%v\u0018\u001dq¿7߱\u0019%a\u0012OXiO\u001b? AK|o29Z\fWlWF(Ʀ/O\u001bl;,j\u0017i`:+qc,Q^!@w)\u0004SPL!\u0014;`.[\"\u0017\f\u001c<\rr\n?\u0017\u0016ެF\u007f\tk\u0007)3\u0001K1I\u001dvQ\u0018:GP\u000eީ\u0007ڟ\"#\t͙qgb\u0014x\u0015IXNΆ=ҨD=Pݐ̌]R"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=\f+Kz0\u001b\u001chK6\fc*]]+U[2;\\_nL\u001e\u001f0", "\"", "", ":hbA", "", "7mS2k", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;ckl", ">qTC<5=S,", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "6`b\u001bX?M", "", "6`b\u001de,OW#\u000f\t", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "<dgA<5=S,", ">qTC\\6Na", ">qTC\\6Na|\by^?", "@d\\<i,", "Adc", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class MutableObjectListIterator<T> implements ListIterator<T>, KMutableListIterator {
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(List<T> list, int i2) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.prevIndex = i2 - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i2 = this.prevIndex + 1;
            this.prevIndex = i2;
            return list.get(i2);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i2 = this.prevIndex;
            this.prevIndex = i2 - 1;
            return list.get(i2);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator
        public void add(T t2) {
            List<T> list = this.list;
            int i2 = this.prevIndex + 1;
            this.prevIndex = i2;
            list.add(i2, t2);
        }

        @Override // java.util.ListIterator
        public void set(T t2) {
            this.list.set(this.prevIndex, t2);
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&˛\bDR\u0003|İI\u0006F\u000b6B\u0005\"4\u0012\u0006\rnj?1LeV7ZS0\u000fs{B$c$wECU(\u001a*\tUUog|qb\u000bI\u000f\u000e\u0016\u0007\u00144I[\u0001c\u0012%˰jqE2[nm?pvF\u0005f1P8:\u0016\u0011$8I(|\u000bE[\fH/nrĐV\r[\bb%\u0014F8\u0001Le\u0018RDR\u0005]p.i\u0017ݦFN5jx\u0018[\u0015^TU\u0019'e,8X7c\u001aUW\u0011\u0011j[u\u0002\u0006\u0006ݘ\th55se\u0002fNX.\u001dE/]\u001aurTa5[n\u001c?1_e[PD'&\fB!\u0005\u0018\u001c\u0015?H\\6Jp\u0016\u001eKz\u0003UPP8]p\u0011Au~\u001d3\u0012K+g'-e*O'aO{3\u0016N'\u000fx9[\u000b\r'ڔ\u001bƻ{Q?\\\tQVb\"Ykv4zp\u0012B\n@I\u0010/2\u0010\\(kK$M16\u0004\u0002~C\u0018z\u0013m\u0001S\u0018W\u000fخ\"å\u001a78\u001fTmR{\u001dk~Y\t0\u001fW4T=|N'ء`wJ9m\u0016\\h\u0001i\u0019V$\u001em<tQqt{\u0010g9\u00152cl*ߛa\u001b\n\"[Tb3]\u0017Fa\u0016r\\^!x\\н\u0014w\n\\\u0017\u0018!OWw,6<1O[CfI2\u000bU\u000b&w`x\u0012\u000fTi#1\bTx\u0017\u000eh\\\u001ft.\r\u0012?\u000b\u007f:-oZe\u001d4_:hj{i\u001bҋw\u007fUr\u0015[Z\r.u\u0004\u0005P (Ii5M\u0015\u001f~_10>\f`;x_n*'1{*\u0013IuFg6o7@߯nJ]j_6\u0005\u0001\u000b#6m0\u0004oV\u0013MsV\u001b[tH!\u0014 P\u0017T\u000b(7\u001e[\u007f &\u000bBECU\"F{\"9-a\u0014h6Кyˏ\u0013&\u0003\nLHq;\bha_B;nH\b~n&2\u0013\u001bBvo(\fP0L\raM\bxAhFN#5\u000eh\u0017,Co\u0005]\u0011ܧqϻ8.g͈DU\f\u0018vCS\u0016\u0004(>Ʊoљ`\u000fb\u0011\u0010\u0011\n8ߔ\u0016D"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=\f-8p4\u001c$OeG\u0016K<]r$NL50jaH", "\"", "", "=aY2V;%W'\u000e", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=#", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u000f2^}\u001eFT\u001a<\\\u0019~\\", "Ahi2", "", "5dc \\A>", "u(8", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/cS\u000e_3", "3kT:X5Ma", "", "1kT.e", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7r4:c;R", "7sT?T;H`", "", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "@dc.\\5\u001aZ ", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "AtQ\u0019\\:M", "4q^:<5=S,", "Bn8;W,Q", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class ObjectListMutableList<T> implements List<T>, KMutableList {
        private final MutableObjectList<T> objectList;

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        public ObjectListMutableList(MutableObjectList<T> objectList) {
            Intrinsics.checkNotNullParameter(objectList, "objectList");
            this.objectList = objectList;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i2) {
            return removeAt(i2);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.objectList.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int i2) {
            ObjectListKt.checkIndex(this, i2);
            return this.objectList.get(i2);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.objectList.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.objectList.lastIndexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t2) {
            return this.objectList.add(t2);
        }

        @Override // java.util.List
        public void add(int i2, T t2) {
            this.objectList.add(i2, t2);
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.addAll(i2, elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.addAll(elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new MutableObjectListIterator(this, i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.objectList.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.removeAll(elements);
        }

        public T removeAt(int i2) {
            ObjectListKt.checkIndex(this, i2);
            return this.objectList.removeAt(i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.retainAll((Collection<? extends T>) elements);
        }

        @Override // java.util.List
        public T set(int i2, T t2) {
            ObjectListKt.checkIndex(this, i2);
            return this.objectList.set(i2, t2);
        }

        @Override // java.util.List
        public List<T> subList(int i2, int i3) {
            ObjectListMutableList<T> objectListMutableList = this;
            ObjectListKt.checkSubIndex(objectListMutableList, i2, i3);
            return new SubList(objectListMutableList, i2, i3);
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&˛\bDR\u0003|\u0004G\u00068\u000b<H\u0007\"2\u0016\u007f\u0007tsA0JeP.`S2\u000fq}<$i@yCA\\\"}00WNmgvJh4K\u000f\f\u001e~jBկ}zc\u0011\u001d1ruO5]o\u00048\u000ftv&0<09\u0012\u000b\u0011\u001c:HFu)C[\u0010 2XphU\u001dQ\u0013\u001e*\u0006l#Ә\"\\uS~[zfR/Q\r\u001aF\\2w03LSZù+\r\u0005mfFN@M\u0015S`3\u000b`iW\u0003mtm\tv2?+\u007fr\u001eJݼ\u0004\u0014#:\u0018)k\u0003>\\3[\u0011\u001059gcyS>2\u0006\f\u0014\u0013L\u0006\u001e\u0006]G\\?`zP\"A\u0005\u000bSnZ2hP\u0011\u0013gF\u00195\u007fi*g--e*A'aO{3\u001ad7I\u0003/ol\u000e\u000f\u001fKX\u0006\\IQv<\u000fݧ\nՒAm\u0012|+\u00168\u0019HG.9,\u001b<(==k;3!\"\u0001vV.\u000bMtvi\u0002R~?Rr$EB\t:]\u000b߶\u0005\u07fbTTfCY`*l\u001f}6\u0016P`\u0006G9%FM\u0016|ȬnMk#m5tQqn\u001a\u0018\u001eM'@Cl{\u0016qT\u0007\u0014u;\u0011!\u001fٿB\u001c\u001fhy@\"`K\u001b\u0014\u0006\u0007\\NB\u0012xSۇ 4:Jah#f\u001b$RC\r\t\u0016Y\u0017/Eh{8\u0011\b<z\u0019\u0003`\\'n\u0016\u0018y0\u000bn:-oT{-nh0\tL|Q\u0011/w\u000eR\u007fL}K3*\u0091Y{.\"bM_PU\u0013=\tY<\u0010>]R\u0003gaMH&)\u000f@#\u0004{<\n j'+\u0011nX]l\u0017Py%\u0007ן\fd\u000e\u0011*Z\tj{T9enS\u0001\u0014qB^:\r\u0005U\u001dS\u001366EQ;g?\u001dLvD3#oui\u001e1*f\u001d1\re:+*ܵo͈U]@`\u0001eg%V(4n\u0013B~i&\br\rB4KHog!ZFu#/,iM@]|d_R\u0013\u001e\u0001\u000bʠkͫwC\u0006ж/U3\u0012eYwo}K\u0013\nx\u000f`Ν}ϥr\u0012$ܻpheh!04vN\u000b\u0018ݼdƀ@\r<62C\u0016\u0013\u0014`w\b(z.I6ʘ\u0019ЋFsCٙվX\""}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=\f1Kh\u001b\"#w7", "\"", "", ":hbA", "AsP?g", "", "3mS", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\f?1", "Ahi2", "5dc \\A>", "u(8", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/cS\u000e_3", "3kT:X5Ma", "", "1kT.e", "1n]AT0Ga", "1n]AT0Gat\u0006\u0002", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7r4:c;R", "7sT?T;H`", "", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "@dc.\\5\u001aZ ", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "AtQ\u0019\\:M", "4q^:<5=S,", "Bn8;W,Q", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class SubList<T> implements List<T>, KMutableList {
        private int end;
        private final List<T> list;
        private final int start;

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        public SubList(List<T> list, int i2, int i3) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.start = i2;
            this.end = i3;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i2) {
            return removeAt(i2);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (Intrinsics.areEqual(this.list.get(i3), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i2) {
            ObjectListKt.checkIndex(this, i2);
            return this.list.get(i2 + this.start);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (Intrinsics.areEqual(this.list.get(i3), obj)) {
                    return i3 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i2 = this.end - 1;
            int i3 = this.start;
            if (i3 > i2) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.list.get(i2), obj)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t2) {
            List<T> list = this.list;
            int i2 = this.end;
            this.end = i2 + 1;
            list.add(i2, t2);
            return true;
        }

        @Override // java.util.List
        public void add(int i2, T t2) {
            this.list.add(i2 + this.start, t2);
            this.end++;
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.list.addAll(i2 + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i2 = this.end - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    this.list.remove(i2);
                    if (i2 == i3) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new MutableObjectListIterator(this, i2);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (Intrinsics.areEqual(this.list.get(i3), obj)) {
                    this.list.remove(i3);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i2 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i2 != this.end;
        }

        public T removeAt(int i2) {
            ObjectListKt.checkIndex(this, i2);
            this.end--;
            return this.list.remove(i2 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i2 = this.end;
            int i3 = i2 - 1;
            int i4 = this.start;
            if (i4 <= i3) {
                while (true) {
                    if (!elements.contains(this.list.get(i3))) {
                        this.list.remove(i3);
                        this.end--;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3--;
                }
            }
            return i2 != this.end;
        }

        @Override // java.util.List
        public T set(int i2, T t2) {
            ObjectListKt.checkIndex(this, i2);
            return this.list.set(i2 + this.start, t2);
        }

        @Override // java.util.List
        public List<T> subList(int i2, int i3) {
            SubList<T> subList = this;
            ObjectListKt.checkSubIndex(subList, i2, i3);
            return new SubList(subList, i2, i3);
        }
    }

    public final void plusAssign(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void plusAssign(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void minusAssign(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e2 : elements) {
            remove(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.content;
        int i2 = elements._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(objArr[i3]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        remove(objArr[(i2 << 3) + i4]);
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void minusAssign(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }
}
