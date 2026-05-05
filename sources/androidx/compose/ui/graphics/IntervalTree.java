package androidx.compose.ui.graphics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.ClosedFloatingPointRange;
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
/* JADX INFO: compiled from: IntervalTree.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&˛\bDRш|\u0004G\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0LeN.ZS8\u000fsڔ<$i)yCAX\"}0\u0012WNmgvJp\u000bKƤ\u000e\u0016\u000fj4կ]xk1\u00172HpG3coE9ft>\u0005.X*8\u007f\r\u0007\u001f@Ϻ8x\u0001ŏY\u000bB0nprR4uE\u001dŪ\n>.\u0002f\u007fuVNH\u001bfj31\r\u0002B|2\u00104\u000bY%F\u00032=|o+CBM4KǬ٨\u0007\u0007`i\b\u0007M\u0001U\u0005\u00170o:W\u0004o6\u0007\u0011D\u00199a%]!1#ӫQ)!5;gcya>2\u0006\u000e\u0014\u0013L\u0006\u001e\u0006US\\A`ǘ\bVO\u0003\bkF`\u0004nB6Э\u0010LG)\u000e=C9Iq\u0002gA\u0019\\C\u0014\u0005;)k\u0019|6sZ\u001eb%\u001b\u000bȭ\u007fG\u0002JK[f\u0010i?}\u0004\u001fm0>LhU\u0017G\b!6'+G]I#Wǽ0^r\u007f'\tnrki\u0001Sp(t\u0016E6!\f\tO\u0015\u0017qPbqD\u001d]$d\r\u000e\n# \u0013ɼj7S(\u0017\u0004v\u0001\u0003Ym\u001255v9in\"ލ\u0006O\rKe[q#yX\u0007\u0016O<\u0011\u0010\u0007zre\u0012ZjA:>Xr }\fF^\fIԵm\bJLti'v-H1'rE\u000b\u0013wZ\u0017\u001b/Z9$\u0011u<t7\f\u0001r~\u000b\u007f\u000bY4\rf2/QQkӧTk2jD|Q\u0010-\u0010Fùm֙KLr3>\n\n:.\u001agZ_G!\"\u0017/B\u0004=Ez}\u0014e}(5\u0016\u0015\f\u001fCx4w\nzpbߌ\u0019`_V'\"%g!?Nۮ\u0006\u05fbeF\u0001d,g\u0019yVU\u0003\u000biB^:\r\u0005UǇS\u0017\u001eACލ-\f<+6\u0010\u0014]\u001e\u0012gw\u0003F\u007fr\u00116t\u001cֽZy\\˸b\u001au@\\PI\b\bn02\u000f\u001bLvmH\u000eR\u000bD\riǥoЬ7V\u0001e\u0019R\u0016f55=~d\u007fR\u001d\u001e\u0001\u00054o,\u0004C4ж\rƹk\u0011\u0016ku\u0013\u0006K\u000b\u0014z\u001d\u0018/\u0014;\u001d\u0015lC0Xgb?ݵ4\u058c^6\nSp+T\tR=\\J\u0016/[^\u0018\t`\u0001\u0010Ho\u000fMϨpƽ\u0002V^j\u0007^nR3c\u0016f1,\u0011~EɼL֭\f̐\u0011֪JT7Ѳ\u00031a!!?z[\u000fpS.\u0015ZI\u001d8X7Պs؏qNjF\u0014S9w\u001ar\\>(~-BNÇgܱoeMѭ`κYdVІG(tYf,W\u0002K\u0003\u001e>\u001a\u000fAÿ}ΓF۱/ٮRw?Ƒ\u05f7\u0005@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125<P;k\n", "\"", "", "u(E", "@n^A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125<P;kr\u0007\u001fga\u000f", "AsP0^", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "Bda:\\5:b#\f", "/cS\u0016a;>`*z\u0002", "", "AsP?g", "", "3mS", "2`c.", "uE5\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\b", "1kT.e", "1n]AT0Ga", "", "D`[BX", "7mc2e=:Z", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?a\u001e!C~\u0012Ex\u0010?]\u0007/$i\u001f0M\u0019", "4h]190Ka(h\f^9\u0004\u0005:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125#", "4h]1B=>` z\u0006l", "", "@dbB_;L", "4na\u0012T*A", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "4na\u0012T*A\u0012)\u0003t`9x\u00142i}6uM\u0001\u001e\u0017C}\u000e", "7sT?T;H`", "", ">kd@4:LW\u001b\b", "@dQ._(GQ\u0019", "B`a4X;", "@nc.g,%S\u001a\u000e", "<nS2", "@nc.g,+W\u001b\u0002\n", "CoS.g,']\u0018~YZ;x", "\u001cnS2", "\"qT266E]&", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IntervalTree<T> {
    private IntervalTree<T>.Node root;
    private final ArrayList<IntervalTree<T>.Node> stack;
    private final IntervalTree<T>.Node terminator;

    /* JADX INFO: compiled from: IntervalTree.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0006Gً/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wEшY\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125<P;kr\r\"ha\u0017\u0011j6[L", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", " dS", "\u0010kP0^", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum TreeColor {
        Red,
        Black
    }

    public IntervalTree() {
        IntervalTree<T>.Node node = new Node(Float.MAX_VALUE, Float.MIN_VALUE, null, TreeColor.Black);
        this.terminator = node;
        this.root = node;
        this.stack = new ArrayList<>();
    }

    public final void clear() {
        this.root = this.terminator;
    }

    public final Interval<T> findFirstOverlap(ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        return findFirstOverlap(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
    }

    public static /* synthetic */ Interval findFirstOverlap$default(IntervalTree intervalTree, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = f2;
        }
        return intervalTree.findFirstOverlap(f2, f3);
    }

    public final Interval<T> findFirstOverlap(float f2, float f3) {
        if (this.root != this.terminator && this.root != this.terminator) {
            ArrayList arrayList = this.stack;
            arrayList.add(this.root);
            while (arrayList.size() > 0) {
                Node node = (Node) CollectionsKt.removeLast(arrayList);
                if (node.overlaps(f2, f3)) {
                    return node;
                }
                if (node.getLeft() != this.terminator && node.getLeft().getMax() >= f2) {
                    arrayList.add(node.getLeft());
                }
                if (node.getRight() != this.terminator && node.getRight().getMin() <= f3) {
                    arrayList.add(node.getRight());
                }
            }
            arrayList.clear();
        }
        Interval<T> interval = (Interval<T>) IntervalTreeKt.getEmptyInterval();
        Intrinsics.checkNotNull(interval, "null cannot be cast to non-null type androidx.compose.ui.graphics.Interval<T of androidx.compose.ui.graphics.IntervalTree>");
        return interval;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, ClosedFloatingPointRange closedFloatingPointRange, List list, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(closedFloatingPointRange, list);
    }

    public final List<Interval<T>> findOverlaps(ClosedFloatingPointRange<Float> closedFloatingPointRange, List<Interval<T>> list) {
        return findOverlaps(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, float f2, float f3, List list, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = f2;
        }
        if ((i2 & 4) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(f2, f3, list);
    }

    public final void forEach$ui_graphics_release(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super Interval<T>, Unit> function1) {
        float fFloatValue = closedFloatingPointRange.getStart().floatValue();
        float fFloatValue2 = closedFloatingPointRange.getEndInclusive().floatValue();
        if (this.root != this.terminator) {
            ArrayList arrayList = this.stack;
            arrayList.add(this.root);
            while (arrayList.size() > 0) {
                Node node = (Node) CollectionsKt.removeLast(arrayList);
                if (node.overlaps(fFloatValue, fFloatValue2)) {
                    function1.invoke(node);
                }
                if (node.getLeft() != this.terminator && node.getLeft().getMax() >= fFloatValue) {
                    arrayList.add(node.getLeft());
                }
                if (node.getRight() != this.terminator && node.getRight().getMin() <= fFloatValue2) {
                    arrayList.add(node.getRight());
                }
            }
            arrayList.clear();
        }
    }

    public static /* synthetic */ void forEach$ui_graphics_release$default(IntervalTree intervalTree, float f2, float f3, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = f2;
        }
        if (intervalTree.root != intervalTree.terminator) {
            ArrayList arrayList = intervalTree.stack;
            arrayList.add(intervalTree.root);
            while (arrayList.size() > 0) {
                Node node = (Node) CollectionsKt.removeLast(arrayList);
                if (node.overlaps(f2, f3)) {
                    function1.invoke(node);
                }
                if (node.getLeft() != intervalTree.terminator && node.getLeft().getMax() >= f2) {
                    arrayList.add(node.getLeft());
                }
                if (node.getRight() != intervalTree.terminator && node.getRight().getMin() <= f3) {
                    arrayList.add(node.getRight());
                }
            }
            arrayList.clear();
        }
    }

    public final void forEach$ui_graphics_release(float f2, float f3, Function1<? super Interval<T>, Unit> function1) {
        if (this.root != this.terminator) {
            ArrayList arrayList = this.stack;
            arrayList.add(this.root);
            while (arrayList.size() > 0) {
                Node node = (Node) CollectionsKt.removeLast(arrayList);
                if (node.overlaps(f2, f3)) {
                    function1.invoke(node);
                }
                if (node.getLeft() != this.terminator && node.getLeft().getMax() >= f2) {
                    arrayList.add(node.getLeft());
                }
                if (node.getRight() != this.terminator && node.getRight().getMin() <= f3) {
                    arrayList.add(node.getRight());
                }
            }
            arrayList.clear();
        }
    }

    public final boolean contains(float f2) {
        return findFirstOverlap(f2, f2) != IntervalTreeKt.getEmptyInterval();
    }

    public final boolean contains(ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        return findFirstOverlap(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue()) != IntervalTreeKt.getEmptyInterval();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.IntervalTree$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: IntervalTree.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я#\u001d̉=!,\u0010\bDZc|İI\u0006F\u000b6B\u0015\"4\u0012}\nnjG9L͜p-ɟY2%ӆ,@4c4wS=e\u001a4̝7O|f0uXb#C=\u000f\\ѥjtVcyu\u0018\u001f4Rou\u074c{o\u0004ʷ`EX\u0013!J,f{U\u0007*,X\u0010-ٙqNbۼ<ϮtFZ҈e\u0007 \u0016\u0014C@\u0003$buUɍLv"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EB\u000e\u0013\"Js\fJ@\t>h}-Hi\u001d\u001dZC;*8-\u0015u]H\u0011pj\u001a", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125#", "<dgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125<P;kr\u0007\u001fga\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125<P;k\n", "5dc\u001bX?M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#a)Fm#?IJ*x4\u001eSQk8\u00079", "Adc\u001bX?M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0007/7z'*T2Hk4\\}r`9\\'\u001d", "6`b\u001bX?M", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<Interval<T>>, KMappedMarker {
        private IntervalTree<T>.Node next;
        final /* synthetic */ IntervalTree<T> this$0;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1(IntervalTree<T> intervalTree) {
            this.this$0 = intervalTree;
            this.next = ((IntervalTree) intervalTree).root.lowestNode();
        }

        public final IntervalTree<T>.Node getNext() {
            return this.next;
        }

        public final void setNext(IntervalTree<T>.Node node) {
            this.next = node;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != ((IntervalTree) this.this$0).terminator;
        }

        @Override // java.util.Iterator
        public Interval<T> next() {
            IntervalTree<T>.Node node = this.next;
            this.next = node.next();
            return node;
        }
    }

    public final Iterator<Interval<T>> iterator() {
        return new AnonymousClass1(this);
    }

    public final void plusAssign(Interval<T> interval) {
        addInterval(interval.getStart(), interval.getEnd(), interval.getData());
    }

    public final void addInterval(float f2, float f3, T t2) {
        IntervalTree<T>.Node node = new Node(f2, f3, t2, TreeColor.Red);
        IntervalTree<T>.Node node2 = this.terminator;
        for (IntervalTree<T>.Node left = this.root; left != this.terminator; left = node.getStart() <= left.getStart() ? left.getLeft() : left.getRight()) {
            node2 = left;
        }
        node.setParent(node2);
        if (node2 == this.terminator) {
            this.root = node;
        } else if (node.getStart() <= node2.getStart()) {
            node2.setLeft(node);
        } else {
            node2.setRight(node);
        }
        updateNodeData(node);
        rebalance(node);
    }

    private final void rebalance(IntervalTree<T>.Node node) {
        while (node != this.root && node.getParent().getColor() == TreeColor.Red) {
            IntervalTree<T>.Node parent = node.getParent().getParent();
            if (node.getParent() == parent.getLeft()) {
                IntervalTree<T>.Node right = parent.getRight();
                if (right.getColor() == TreeColor.Red) {
                    right.setColor(TreeColor.Black);
                    node.getParent().setColor(TreeColor.Black);
                    parent.setColor(TreeColor.Red);
                    node = parent;
                } else {
                    if (node == node.getParent().getRight()) {
                        node = node.getParent();
                        rotateLeft(node);
                    }
                    node.getParent().setColor(TreeColor.Black);
                    parent.setColor(TreeColor.Red);
                    rotateRight(parent);
                }
            } else {
                IntervalTree<T>.Node left = parent.getLeft();
                if (left.getColor() == TreeColor.Red) {
                    left.setColor(TreeColor.Black);
                    node.getParent().setColor(TreeColor.Black);
                    parent.setColor(TreeColor.Red);
                    node = parent;
                } else {
                    if (node == node.getParent().getLeft()) {
                        node = node.getParent();
                        rotateRight(node);
                    }
                    node.getParent().setColor(TreeColor.Black);
                    parent.setColor(TreeColor.Red);
                    rotateLeft(parent);
                }
            }
        }
        this.root.setColor(TreeColor.Black);
    }

    private final void rotateLeft(IntervalTree<T>.Node node) {
        IntervalTree<T>.Node right = node.getRight();
        node.setRight(right.getLeft());
        if (right.getLeft() != this.terminator) {
            right.getLeft().setParent(node);
        }
        right.setParent(node.getParent());
        if (node.getParent() == this.terminator) {
            this.root = right;
        } else if (node.getParent().getLeft() == node) {
            node.getParent().setLeft(right);
        } else {
            node.getParent().setRight(right);
        }
        right.setLeft(node);
        node.setParent(right);
        updateNodeData(node);
    }

    private final void rotateRight(IntervalTree<T>.Node node) {
        IntervalTree<T>.Node left = node.getLeft();
        node.setLeft(left.getRight());
        if (left.getRight() != this.terminator) {
            left.getRight().setParent(node);
        }
        left.setParent(node.getParent());
        if (node.getParent() == this.terminator) {
            this.root = left;
        } else if (node.getParent().getRight() == node) {
            node.getParent().setRight(left);
        } else {
            node.getParent().setLeft(left);
        }
        left.setRight(node);
        node.setParent(left);
        updateNodeData(node);
    }

    private final void updateNodeData(IntervalTree<T>.Node node) {
        while (node != this.terminator) {
            node.setMin(Math.min(node.getStart(), Math.min(node.getLeft().getMin(), node.getRight().getMin())));
            node.setMax(Math.max(node.getEnd(), Math.max(node.getLeft().getMax(), node.getRight().getMax())));
            node = node.getParent();
        }
    }

    /* JADX INFO: compiled from: IntervalTree.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4C\u0007\"B\u0012\u007f\u0007lnA0ZeP.Xf0Šm\u0012éTa4sS;\fڼ,!It^kunbZ9D\u001f\n$z\u0003,wV\tc \u0012JD\u0006>iݹ\u007fAGd\r63%ݨ&8\b\u000bI(8g(\u0001)ŏ\u001c\u0012\"2Pppĥ;YM( &V*/Ȧ-m^8Xl\u0014Ž]/S\u0002PR?_^\u0002$μRù+\u0019~ѭ6-F>C\u001dEU\t\u0010`e\u0010%M|U\u000f\u0017ѧw1Yug6\u000fÜB!\u0002̄\u0019ǁv2dӤib\u001249]\u0004MV\u001d6\bK\u0014\u001bM\u001c\u000e4(\u001f͚9բj\u0014\u0016ޗ\rtYR^\u0015~D\u0006\u000foKg=\u000eIC9Ig(ĬGϭRC\u0004˜% )\u0018|4{V\u0014x#0%\u001a_JiJkʰ\u001f\u0010i?}\u0004'ç06ZΉSĬ3\b\u0019ф/'=uG1Am\bcRwG'n\u0005ks\u0001̲\u0011(~\u0018G*?ȱ\tP;ʔwÏXd4Ҋe\u001eZ$\f\u00163\"b\u0016J1٠\u0014o"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125<P;kr\u0007\u001fga\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125#", "AsP?g", "", "3mS", "2`c.", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125<P;kr\r\"ha\u0017\u0011j6[L", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0007/7z'*T2Hk4suIH>\u0003t(\u0018}#PN\u0018\u0016YWr;#gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005x\u0005U\u0018\u001b1usFT\u001e\u0011]\u001e\u0005A6yB`N\u0007GA\u0004Q7d\f='cDGyWb", "5dc\u0010b3H`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#a)Fm#?IJ*x4\u001eSWn9\u0007A6U\u00014\u001d", "Adc\u0010b3H`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0007/7z'*T2Hk4\\\u0004ua9dm3X\u0004|\u000b=", ":dUA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125<P;k\n", "5dc\u0019X-M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#a)Fm#?IJ*x4\u001eSQk8\u00079", "Adc\u0019X-M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0007/7z'*T2Hk4\\}r`9\\'\u001d", ";`g", "5dc\u001aT?", "u(5", "Adc\u001aT?", "uE\u0018#", ";h]", "5dc\u001a\\5", "Adc\u001a\\5", ">`a2a;", "5dc\u001dT9>\\(", "Adc\u001dT9>\\(", "@hV5g", "5dc\u001f\\.Ab", "Adc\u001f\\.Ab", ":nf2f;']\u0018~", "<dgA", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class Node extends Interval<T> {
        private TreeColor color;
        private IntervalTree<T>.Node left;
        private float max;
        private float min;
        private IntervalTree<T>.Node parent;
        private IntervalTree<T>.Node right;

        public Node(float f2, float f3, T t2, TreeColor treeColor) {
            super(f2, f3, t2);
            this.color = treeColor;
            this.min = f2;
            this.max = f3;
            this.left = IntervalTree.this.terminator;
            this.right = IntervalTree.this.terminator;
            this.parent = IntervalTree.this.terminator;
        }

        public final TreeColor getColor() {
            return this.color;
        }

        public final void setColor(TreeColor treeColor) {
            this.color = treeColor;
        }

        public final float getMin() {
            return this.min;
        }

        public final void setMin(float f2) {
            this.min = f2;
        }

        public final float getMax() {
            return this.max;
        }

        public final void setMax(float f2) {
            this.max = f2;
        }

        public final IntervalTree<T>.Node getLeft() {
            return this.left;
        }

        public final void setLeft(IntervalTree<T>.Node node) {
            this.left = node;
        }

        public final IntervalTree<T>.Node getRight() {
            return this.right;
        }

        public final void setRight(IntervalTree<T>.Node node) {
            this.right = node;
        }

        public final IntervalTree<T>.Node getParent() {
            return this.parent;
        }

        public final void setParent(IntervalTree<T>.Node node) {
            this.parent = node;
        }

        public final IntervalTree<T>.Node lowestNode() {
            Node node = this;
            while (node.left != ((IntervalTree) IntervalTree.this).terminator) {
                node = node.left;
            }
            return node;
        }

        public final IntervalTree<T>.Node next() {
            if (this.right != ((IntervalTree) IntervalTree.this).terminator) {
                return this.right.lowestNode();
            }
            IntervalTree<T>.Node node = this.parent;
            Node node2 = this;
            while (node != ((IntervalTree) IntervalTree.this).terminator && node2 == node.right) {
                node2 = node;
                node = node.parent;
            }
            return node;
        }
    }

    public final List<Interval<T>> findOverlaps(float f2, float f3, List<Interval<T>> list) {
        if (this.root != this.terminator) {
            ArrayList arrayList = this.stack;
            arrayList.add(this.root);
            while (arrayList.size() > 0) {
                Node node = (Node) CollectionsKt.removeLast(arrayList);
                if (node.overlaps(f2, f3)) {
                    list.add(node);
                }
                if (node.getLeft() != this.terminator && node.getLeft().getMax() >= f2) {
                    arrayList.add(node.getLeft());
                }
                if (node.getRight() != this.terminator && node.getRight().getMin() <= f3) {
                    arrayList.add(node.getRight());
                }
            }
            arrayList.clear();
        }
        return list;
    }
}
