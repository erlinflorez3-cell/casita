package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&˛\bDR\u0003|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007f\u0007|jA0ZeP.XS2\u000fy\u0002<$a$yCId\"}(\nWNupvJ`\u0015K\u000f\u0014\u0016\u0001j2K]xk.\u00172HrG3[\u000eE9f{>\u0005.݅*8\u007f\u000b\t\u001a8o\u0018v\u0001CS\f YHp@f\u0015M\u0013&\u001a\u0006D\"\u0007Ȧrɡl\rpncŽ=\"3oRP7_v{{\rvXU\u000e_a|-p=E\u00175SI\u0006\u0001^o\u0007mu&\u0005G,_+ K\u0018;^\u0014Џ\u0019+]\u0013\u001e\u007f,p\u0015Un\u0013?+}kׂT\u000e6\u0001;G\u0013<\u0014\u0018\u00141`4=\u001cv\bDޗ#}cD^\u000evB.\u0003q:%2\u00183YA+j_oS\u0019|F\f\u0011\u001b.;\t~#kTD֫+\u001a\u0003ȭa=_QUP^\fi=$Վ\u0007a0Ï˙4G\u000eAD$<0=7\nHS%y\u001c`D\u001eϸKtĈWi`c\t=|/O*7(\u000bHr\"\u0004P\u0003`\\\u0015[6l\u00074ܱY4Ϣ{</CXj]\b\u0002j{l:)=\u0004OY\u001ds>aG~K;ae a\tΘB`\u0003vMltak\f\tkX,@h\u0003\u0016\b}TNBƎ``80|P?;t\u0015v\u001fNFO !_\tp@\tbS<\ty&\u0005\t7ˆ\u000b\u0012 k\u0007mD|\u000f*sA\u001aP'Km\"\u0017P-'\u0015\"\f\u007fuo|KZ\u0007.u\fݨf\u0016׀=Q=[[\u0019\rOJ\b=G\\r\u001cʸ{9o\u0001\u000b\"';\u0017J.\b3v:\n\u0003J}p]\"?d\u0001M d.\u0016(ZCYq\u007f#[lX#\u000bghf<\r\u0005%\u001fS(6\"EC;p?\u001dD\u0014D3#\u0010ui\u001e6@bW4\u0003\u0015\u001c,\u00122 f_\u0002J;fQ ~\u000732\u001d\u001bBvy(\u000eP5L\u000fIGo\u00167ޠ8\u0016\u001f=0~\u0007bݸ!ZiW+o,<tʕ*ϵG}\"\u0012\f+\u001f\u0002kg\u001cu\u0012pS]\u001d?#{_vB K:nW\u0019־v\u001a֯\u001c6Oq+\u001bJ@<4ZX8\u000fQw\u0002\u0006>\u00030Jm3/2p{\u0002VVZ\u0007\u0015nH3o\fti7\u000f8'9.zE1;ևt\u000fu҉2If+D3j}\u0007\u0017)9^l9Qι\u001f\u0015խI]Q\u007fJB\u0012\u0004As{q\u001c8NӽK\u007f^/\u0002e\u001f\u001c\u000f6n\red\u0005І%O\u0017V\\?A~)\u0005TPR\u0015\u0019Wgr\u001e~sL\u0017\u000bE\u00032\u0001ESY\u000b\u001a\u0017{FQҎLIϦAIx/o\u0010e\u0014S}6/P1\u0012\u00159bg\u0010v\n\u0014ͩh78*+\u0015\u0017Th :˸zx\u0001'F\bdWHGě\u0017^g\u001f@4NiCl<ל{l\u0007-{l\u0012v\u001c\u000bөj1d-7C^`!'{JC\\h~)SN`A\u0004\"Z>\u001fd\u0010))Xcq/\tk}j=5=\fBgA2b\u001e4Υ(\u0017J>\u001dT#\u0003nMll9`z\u0007o\u000e\rrXh\u0003QA\u0014+\u0007xh\u001f3LL\u0003 t/m؟M|=KnO\u001cEw5g1\u001b[)\u0001J\u000b&ĉ'\u0015\u0011Wzt.2r\r\u0001\u001a\u007f,cõ\u001bً\u001až]${/KBY\u0011PH\u0018.!\u000eGˏ\t8PBjf4;\u007f;q\u001d\u001fN-84wM-}}_\"=2\u0011\u0001\u0011\u000fUx_\u001dh~}\u0007ܯ3\u000f}j \fIsMk\\)\u001c\u0002,\u001b-X\u0004X\u0015`:\u001aeO,KmF\u0010\f/$jV$.FY˜L*m/\t\\\u0002+\u001c&X\u000b5XkMzN\f\nZ\u001b^s5oo>Y\u0001$\u001bT>`˵\u001b\u0012\u001cރtނ\u000fF\u0015E\"J_\u001a7C/\u0005 Q\u0002@aߐ\tL]ۗ4٭\u0015ű\b::݃\u0007\fUTq*4<H\u0015:ÈlҦUc(:\u0018!\u001b\u0019H=`n\u0018`K'}֒\u0003̒:\\\u0001\u0090\u0012n\u0019M'$\r6\u0019Հ\u0017ʲ\u001a.PǆR\nXl-\u0013aOJݠS̫Z{)͘ao3\u0017=ozIOU(ةS8aَDԵZ˥i\\\rǹq]rA-\u007f\u00193d\u001c-ä\u001c\u008f\\\n&Gj_\u001e\\ѶH\u0001"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\f9g\r|Gq\u001d-MP\u0011", "\u0013", "", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9m[&y@\u000f%l", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E-| \u0016Qwi:t%CgS", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK^5DUz'7T\u001a<\\\u0019", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "\u001aj^A_0G\u001d\u001d\tDL,\n\r+l\u0004=w=\b\u0017l", "u(E", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "/qa.l", "", "=eU@X;", ":d]4g/", "7rA2T+(\\ \u0013", "", "0`R8\\5@", "@n^A", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$d\f}My\u001dCz.~W\b'>m\u0014=QMDy}\u001b%lh8\u0007p:\u0018]+U[+<`Yq=!gA\u0014X:\u0014\tb\u000b\"xK>\u001f\u0006;M\fDvJ\t&\u0012<ipOdY.}#\u0005\u001e9lMX_\u0007\u001d\u00056", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "7r43Y,<b\u001d\u0010ze@i\t+di1\u0003T", "u(I", "Ahi2", "5dc \\A>", "u(8", "/cS", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "7mS2k", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/cS\u000e_3", "3kT:X5Ma", "", "/cS\u000e_3\"\\(~\bg(\u0004", "7", "<", "/cS\u000eg\u0010Gb\u0019\f\u0004Z3", "0tX9W", "", "1gT0^\rH`v\t\u0003h+\u0001\n3c{7\u007fJ\n", "1gT0^\u0010L;)\u000ev[3|", "1kT.e", "1n]AX5M3%\u000fve:", "=sW2e", "3mbBe,\u001cO$zxb;\u0011l8t\u007f5\u0005<\b", ";h]\u0010T7:Q\u001d\u000e\u000f", "3mbBe,\u001ef(\fv<(\b\u0005-i\u000f<", "3pd._:", "", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "6`b566=S", "7mS2k\u0016?", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "7mb2e;\u001ab|\b\n^9\u0006\u00056", "7r4:c;R", "7sT?T;H`", "", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "@dV6f;>`\u0001\tyb-\u0001\u0007+t\u00042\u0005", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001ab", "@d\\<i,\u001ab|\b\n^9\u0006\u00056", "@d\\<i,+O\"\u0001zB5\f\t<n{/", "@`]4X\u0016?T'~\n", "@`]4X\u0013>\\\u001b\u000e}", "@dc.\\5\u001aZ ", "@dc.\\5(`\u0006~\u0003h=|d6lc1\u000b@\u000e \u0013N", "@dc.\\5", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "AtQ\u0019\\:M", "4q^:<5=S,", "Bn8;W,Q", "Bn0?e(R", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "\"", "2dbA\\5:b\u001d\t\u0004", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004v}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019", "BnBAe0GU", "", "EqXAX\u0019>^ zx^", "\u0011n\\=T5B]\"", "\u0017sa", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
    private static final Companion Companion = new Companion(null);
    private static final ListBuilder Empty;
    private E[] array;
    private final ListBuilder<E> backing;
    private boolean isReadOnly;
    private int length;
    private int offset;
    private final ListBuilder<E> root;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r!4ߚ}ћg\u0001ˎ`D\u0014GnWY*Ƃo{B$,6\u007fDS[*\u007f2\t}Q\u0016iEϽ\\ŲG\u000f\u000eǝѷn0"}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\f9g\r|Gq\u001d-MPyI>& dj=\u0011l\u0002", "", "u(E", "\u0013l_Al", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\f9g\r|Gq\u001d-MP\u0011", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&˛\bDR\r|İI\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007llA0ReP.XU2\u000fy\u0005<$a+wCQ٥B\u007f(\b]M\u0018m~Lj\u000b\n\u000e4\u00169\u00062]e\u0003k\u0013'8RqO3\u0004nk;pxD\b82P<ѩ\t\u0001(/\u0011#\u0005\u0003[K:\u001b`D~Dj\r\u0004\u0004`&ĂB \u000f)%m\\B`l\fCu#KpP[?_^\u000b\u0014όF\u001d-\u001b\u0006y\u001eYN}I]1a\u0013\u001fR\u0012>Iӡqݘ\th58sO\u0002iNX.\u0018[?\u0018\u0018k\u0006>\\;P' ˏ/Oq\\\u0019\u00146\f\u0013{;@J\"N-VCE\u001a\u0015\u0011TG=\u0006aVh\u0002\rK0~o@/%62qMӸjQoFiZE\u0002\u001d\rL'W͜-ƟX\u000ehٽk`\u0006TIQnA\u001fݓ\u0016ՒAm\f͏3\u000e8\u000bHG.3R\u0080:ϲ)7cݽs3y\u0003`Jwx\u0015`\u001fR\u0018T\u001fؚ$å\u001a72\u009eɚ^["}, d2 = {"\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\f9g\r|Gq\u001d-MPyOC+j", "\u0013", "", ":hbA", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E=\u0011\u001b\u001eFo\u001bJ@\f9g\r|Gq\u001d-MP\u0011", "7mS2k", "", "uKZ<g3B\\b|\u0005e3|\u0007>i\n1\n\n}'\u001bNn\u000eI\u0005n\u001c]\f/\u0014}\u001a5LCHA\u0018a\u0006", "3w_2V;>R\u0001\ty<6\r\u0012>", ":`bA<5=S,", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "1gT0^\rH`v\t\u0003h+\u0001\n3c{7\u007fJ\n", "6`b\u001bX?M", "", "6`b\u001de,OW#\u000f\t", "<dgA", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "<dgA<5=S,", ">qTC\\6Na", ">qTC\\6Na|\by^?", "@d\\<i,", "Adc", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
        private int expectedModCount;
        private int index;
        private int lastIndex;
        private final ListBuilder<E> list;

        public Itr(ListBuilder<E> list, int i2) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i2;
            this.lastIndex = -1;
            this.expectedModCount = list.modCount;
        }

        private final void checkForComodification() {
            if (this.list.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e2) {
            checkForComodification();
            ListBuilder<E> listBuilder = this.list;
            int i2 = this.index;
            this.index = i2 + 1;
            listBuilder.add(i2, e2);
            this.lastIndex = -1;
            this.expectedModCount = this.list.modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((ListBuilder) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            checkForComodification();
            if (this.index >= ((ListBuilder) this.list).length) {
                throw new NoSuchElementException();
            }
            int i2 = this.index;
            this.index = i2 + 1;
            this.lastIndex = i2;
            return (E) ((ListBuilder) this.list).array[((ListBuilder) this.list).offset + this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            checkForComodification();
            int i2 = this.index;
            if (i2 <= 0) {
                throw new NoSuchElementException();
            }
            int i3 = i2 - 1;
            this.index = i3;
            this.lastIndex = i3;
            return (E) ((ListBuilder) this.list).array[((ListBuilder) this.list).offset + this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            checkForComodification();
            int i2 = this.lastIndex;
            if (i2 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.list.remove(i2);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = this.list.modCount;
        }

        @Override // java.util.ListIterator
        public void set(E e2) {
            checkForComodification();
            int i2 = this.lastIndex;
            if (i2 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.list.set(i2, e2);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        Empty = listBuilder;
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i2) {
        this(ListBuilderKt.arrayOfUninitializedElements(i2), 0, 0, false, null, null);
    }

    private ListBuilder(E[] eArr, int i2, int i3, boolean z2, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.array = eArr;
        this.offset = i2;
        this.length = i3;
        this.isReadOnly = z2;
        this.backing = listBuilder;
        this.root = listBuilder2;
        if (listBuilder != null) {
            this.modCount = listBuilder.modCount;
        }
    }

    private final void addAllInternal(int i2, Collection<? extends E> collection, int i3) {
        registerModification();
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.addAllInternal(i2, collection, i3);
            this.array = this.backing.array;
            this.length += i3;
        } else {
            insertAtInternal(i2, i3);
            Iterator<? extends E> it = collection.iterator();
            for (int i4 = 0; i4 < i3; i4++) {
                this.array[i2 + i4] = it.next();
            }
        }
    }

    private final void addAtInternal(int i2, E e2) {
        registerModification();
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder == null) {
            insertAtInternal(i2, 1);
            this.array[i2] = e2;
        } else {
            listBuilder.addAtInternal(i2, e2);
            this.array = this.backing.array;
            this.length++;
        }
    }

    private final void checkForComodification() {
        ListBuilder<E> listBuilder = this.root;
        if (listBuilder != null && listBuilder.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkIsMutable() {
        if (isEffectivelyReadOnly()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> list) {
        return ListBuilderKt.subarrayContentEquals(this.array, this.offset, this.length, list);
    }

    private final void ensureCapacityInternal(int i2) {
        if (i2 < 0) {
            throw new OutOfMemoryError();
        }
        if (i2 > this.array.length) {
            this.array = (E[]) ListBuilderKt.copyOfUninitializedElements(this.array, AbstractList.Companion.newCapacity$kotlin_stdlib(this.array.length, i2));
        }
    }

    private final void ensureExtraCapacity(int i2) {
        ensureCapacityInternal(this.length + i2);
    }

    private final void insertAtInternal(int i2, int i3) {
        ensureExtraCapacity(i3);
        E[] eArr = this.array;
        ArraysKt.copyInto(eArr, eArr, i2 + i3, i2, this.offset + this.length);
        this.length += i3;
    }

    private final boolean isEffectivelyReadOnly() {
        ListBuilder<E> listBuilder;
        return this.isReadOnly || ((listBuilder = this.root) != null && listBuilder.isReadOnly);
    }

    private final void registerModification() {
        this.modCount++;
    }

    private final E removeAtInternal(int i2) {
        registerModification();
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            this.length--;
            return listBuilder.removeAtInternal(i2);
        }
        E[] eArr = this.array;
        E e2 = eArr[i2];
        ArraysKt.copyInto(eArr, eArr, i2, i2 + 1, this.offset + this.length);
        ListBuilderKt.resetAt(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e2;
    }

    private final void removeRangeInternal(int i2, int i3) {
        if (i3 > 0) {
            registerModification();
        }
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.removeRangeInternal(i2, i3);
        } else {
            E[] eArr = this.array;
            ArraysKt.copyInto(eArr, eArr, i2, i2 + i3, this.length);
            E[] eArr2 = this.array;
            int i4 = this.length;
            ListBuilderKt.resetRange(eArr2, i4 - i3, i4);
        }
        this.length -= i3;
    }

    private final int retainOrRemoveAllInternal(int i2, int i3, Collection<? extends E> collection, boolean z2) {
        int iRetainOrRemoveAllInternal;
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            iRetainOrRemoveAllInternal = listBuilder.retainOrRemoveAllInternal(i2, i3, collection, z2);
        } else {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i3) {
                int i6 = i2 + i4;
                if (collection.contains(this.array[i6]) == z2) {
                    E[] eArr = this.array;
                    i4++;
                    eArr[i5 + i2] = eArr[i6];
                    i5++;
                } else {
                    i4++;
                }
            }
            iRetainOrRemoveAllInternal = i3 - i5;
            E[] eArr2 = this.array;
            ArraysKt.copyInto(eArr2, eArr2, i2 + i5, i3 + i2, this.length);
            E[] eArr3 = this.array;
            int i7 = this.length;
            ListBuilderKt.resetRange(eArr3, i7 - iRetainOrRemoveAllInternal, i7);
        }
        if (iRetainOrRemoveAllInternal > 0) {
            registerModification();
        }
        this.length -= iRetainOrRemoveAllInternal;
        return iRetainOrRemoveAllInternal;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (isEffectivelyReadOnly()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        checkIsMutable();
        checkForComodification();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i2, this.length);
        addAtInternal(this.offset + i2, e2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        checkIsMutable();
        checkForComodification();
        addAtInternal(this.offset + this.length, e2);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        checkForComodification();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i2, this.length);
        int size = elements.size();
        addAllInternal(this.offset + i2, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        checkForComodification();
        int size = elements.size();
        addAllInternal(this.offset + this.length, elements, size);
        return size > 0;
    }

    public final List<E> build() {
        if (this.backing != null) {
            throw new IllegalStateException();
        }
        checkIsMutable();
        this.isReadOnly = true;
        return this.length > 0 ? this : Empty;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        checkForComodification();
        removeRangeInternal(this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        checkForComodification();
        return obj == this || ((obj instanceof List) && contentEquals((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        checkForComodification();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i2, this.length);
        return this.array[this.offset + i2];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        checkForComodification();
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        checkForComodification();
        return ListBuilderKt.subarrayContentHashCode(this.array, this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        checkForComodification();
        for (int i2 = 0; i2 < this.length; i2++) {
            if (Intrinsics.areEqual(this.array[this.offset + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        checkForComodification();
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        checkForComodification();
        for (int i2 = this.length - 1; i2 >= 0; i2--) {
            if (Intrinsics.areEqual(this.array[this.offset + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i2) {
        checkForComodification();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i2, this.length);
        return new Itr(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        checkIsMutable();
        checkForComodification();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        checkForComodification();
        return retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i2) {
        checkIsMutable();
        checkForComodification();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i2, this.length);
        return removeAtInternal(this.offset + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        checkForComodification();
        return retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        checkIsMutable();
        checkForComodification();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i2, this.length);
        E[] eArr = this.array;
        int i3 = this.offset;
        E e3 = eArr[i3 + i2];
        eArr[i3 + i2] = e2;
        return e3;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i2, int i3) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, this.length);
        E[] eArr = this.array;
        int i4 = this.offset + i2;
        int i5 = i3 - i2;
        boolean z2 = this.isReadOnly;
        ListBuilder<E> listBuilder = this.root;
        if (listBuilder == null) {
            listBuilder = this;
        }
        return new ListBuilder(eArr, i4, i5, z2, this, listBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        checkForComodification();
        E[] eArr = this.array;
        int i2 = this.offset;
        return ArraysKt.copyOfRange(eArr, i2, this.length + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkForComodification();
        int length = destination.length;
        int i2 = this.length;
        if (length >= i2) {
            E[] eArr = this.array;
            int i3 = this.offset;
            ArraysKt.copyInto(eArr, destination, 0, i3, i2 + i3);
            return (T[]) CollectionsKt.terminateCollectionToArray(this.length, destination);
        }
        E[] eArr2 = this.array;
        int i4 = this.offset;
        T[] tArr = (T[]) Arrays.copyOfRange(eArr2, i4, i2 + i4, destination.getClass());
        Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        checkForComodification();
        return ListBuilderKt.subarrayContentToString(this.array, this.offset, this.length, this);
    }
}
