package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
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
/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000ebLc\u000b\u0004I\u00066\u000b6B\r64ߚ\u007f\u0007tpAӄLeV7ZS0\u0016s{B3c$\u007fّCU }*\t]NogtMb\u000bQ+\u000e\u0016~j4Ikxe\u0012\u00159JoU3UoC9htD\n(2(:\u0002\u0005\u000f@2H\u0016v\u0003CY4\u001a0Fx@ĥ#˟5 \"\bN /\u001e\u000bf\u00076\u0004)\u001e=ǥ'\u0003wC\u0017+mD\u0015M;[\u001d+\u001b\ry\u001eYU\u007fD#<k\u00035Y\fC\u0011W\n=3hmݧ+\u0012\beOp\u007fB\u001c[Y\u001bw\u000b,l\u0007a`:'Yj*_\u0019\u00146\u0014\u0013{;QJ\u000eN:VKE\u001a\u0015&T3иqԟŬO\u0001ެF\u0002\u0001\u0001D7m\u000fALQ\u001b\u0015Q\u0012?'pO{3\u0012dŗ\u00017%iw&`C\"\u001d\u001a_Ui@k]~\u000egb\u0006\u0004\u001fb2.\u0012V_\u007f]\u0003A8%LOaI%1k0]r\u0010?/n\u0012ki\u0001]p&|;O*7\f\u000bHr/\u0004P\u0003\u0004\\\u0015[Bl\u0007,\u000fC*j\u001fT'5\u0012^O\u0017~\u0019u&\u00183[~7\bs\u001c\u0012eQv3cQ*$*X\u0005AW<\u0011\f\u001fz\u000bg\u001a\tt(P9xn\u001e\"\u0014D|7C6M\u001844Z8ai#w\u001b$RC\r\t\u000eZ\u0017@EԵ3l\u0011wU\r\t/U\rt}\u007f\u0011IZ|'6uM_g1,e$x4+#52:\u0014\u0010{Zydr&we{N\u0016Hl\u00023K5'~W7HA\u000eR\u0001\u001aiM@<A|B$I\u001eFg6\u007f!6n!bUd\u00192v\r\bQ0+ч\u007f*p\t~{T9pnM\u0001(q<|8-\t-H=\u0001\u001eM-9;i?\u001dD~D9#\tuo\u007f0\nb=;#\u000eLHqN\bha_B;fI\b}n&2&\u001bBvo(\fPCL\raM\bxAbFO#/,i]\u0530\u0019\u0080Z[Bܤ@\nB2w*\"HTйjǜ)\u0011Uω8\u0006{Qt\u000bx\u0016`Ρ\bϥr\u001e$ܻ8X]j\u00179&u\u001e@OF3!J\u0016<4ZA8\u000fQ`\u0002\u0006>\u007f>\u00176ʬ#ЋFyCٙ&V~jdWUvSp92\u0011\u0003\u001f54wcC3~\u001d\u07bf;ҕ6\u0003[\u001d\u0017.˅O\bn%1c\\<!ϛt/\n՞a\u0001"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9p@\u0006\u00145g\r\r7{&5\\\u0019", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "u(E", "2hbAT5<Sy\f\u0005f\f{\u000b/A\t'_Ig\u0013+G|", "", "6hc\u0011X7MV", "", "Ag^B_+,V\u0015\fzI6\u0001\u0012>e\r\f\u0005K\u0011&\tK~\u0011*z\"<]\u0007\"", "", "5dc [6NZ\u0018l}Z9|s9i\t7{Md \"W~\u007f@\u0006(#]z';v\u0018", "u(I", "Adc [6NZ\u0018l}Z9|s9i\t7{Md \"W~\u007f@\u0006(#]z';v\u0018", "uY\u0018#", "\nrTA \u0006\u0017", "Ahi2", "5dc \\A>", "u(8", "D`[BX:", "", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "/bR2c;!W(\r", "", "1kT.e", "1n]AT0Ga", "3kT:X5M", "1n]AT0Gat\u0006\u0002", "3kT:X5Ma", "", "3mbBe,\u001c]\"\u000evb5|\u0016\u001di\u0015(", "4h]15,Lb{\u0003\n=0\u000b\u0018+n}(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l@\u000541b{ \u0013v\u0015\u0012V*7\u007f4+j", "4h]15,Lb{\u0003\n=0\u000b\u0018+n}(CK\u0010\nrY<\f", "u(9", "5dc", "7mS2k", "6`b\u0015\\;", "6hc", "<nS2", "7r8;?(RS&", "1gX9W\u000fBb\b~\tm", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "6hc\u0016a\u0014B\\\u001d\u0007\u000bf\u001b\u0007\u0019-hn$\tB\u0001&", "2hbAT5<Sy\f\u0005f\f{\u000b/", "", "7mS2k\u0016?", "7r4:c;R", "7r76g\u0010G;\u001d\b~f<\u0005w9u}+j<\u000e\u0019\u0017VL\u000eK\u0006%B", "7sT?T;H`", "", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "@db6m,-]{\u0003\n=,\b\u00182", "AhQ9\\5@6\u001d\u000e\t", "0k^0^", "AoT0h3:b\u001d\u0010zA0\f", "AtQ\u0019\\:M", "4q^:<5=S,", "Bn8;W,Q", "\u0016hc!X:M@\u0019\r\u000be;`\u0018/r{7\u0006M", "!tQ\u0019\\:M", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HitTestResult implements List<Modifier.Node>, KMappedMarker {
    public static final int $stable = 8;
    private int size;
    private Object[] values = new Object[16];
    private long[] distanceFromEdgeAndInLayer = new long[16];
    private int hitDepth = -1;
    private boolean shouldSharePointerInputWithSibling = true;

    /* JADX INFO: renamed from: add */
    public void add2(int i2, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i2, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Modifier.Node remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set */
    public Modifier.Node set2(int i2, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node set(int i2, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return contains((Modifier.Node) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return indexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return lastIndexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.size;
    }

    public final boolean getShouldSharePointerInputWithSibling() {
        return this.shouldSharePointerInputWithSibling;
    }

    public final void setShouldSharePointerInputWithSibling(boolean z2) {
        this.shouldSharePointerInputWithSibling = z2;
    }

    public final boolean hasHit() {
        long jM5657findBestHitDistanceptXAw2c = m5657findBestHitDistanceptXAw2c();
        return DistanceAndInLayer.m5652getDistanceimpl(jM5657findBestHitDistanceptXAw2c) < 0.0f && DistanceAndInLayer.m5654isInLayerimpl(jM5657findBestHitDistanceptXAw2c);
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    private final void resizeToHitDepth() {
        int i2 = this.hitDepth + 1;
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (i2 <= lastIndex) {
            while (true) {
                this.values[i2] = null;
                if (i2 == lastIndex) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.size = this.hitDepth + 1;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f2, boolean z2) {
        if (this.hitDepth == CollectionsKt.getLastIndex(this)) {
            return true;
        }
        return DistanceAndInLayer.m5648compareToS_HNhKs(m5657findBestHitDistanceptXAw2c(), HitTestResultKt.DistanceAndInLayer(f2, z2)) > 0;
    }

    /* JADX INFO: renamed from: findBestHitDistance-ptXAw2c */
    private final long m5657findBestHitDistanceptXAw2c() {
        long jDistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(Float.POSITIVE_INFINITY, false);
        int i2 = this.hitDepth + 1;
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (i2 <= lastIndex) {
            while (true) {
                long jM5649constructorimpl = DistanceAndInLayer.m5649constructorimpl(this.distanceFromEdgeAndInLayer[i2]);
                if (DistanceAndInLayer.m5648compareToS_HNhKs(jM5649constructorimpl, jDistanceAndInLayer) < 0) {
                    jDistanceAndInLayer = jM5649constructorimpl;
                }
                if (DistanceAndInLayer.m5652getDistanceimpl(jDistanceAndInLayer) < 0.0f && DistanceAndInLayer.m5654isInLayerimpl(jDistanceAndInLayer)) {
                    return jDistanceAndInLayer;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return jDistanceAndInLayer;
    }

    public final void hit(Modifier.Node node, boolean z2, Function0<Unit> function0) {
        hitInMinimumTouchTarget(node, -1.0f, z2, function0);
        NodeCoordinator coordinator$ui_release = node.getCoordinator$ui_release();
        if (coordinator$ui_release == null || coordinator$ui_release.shouldSharePointerInputWithSiblings()) {
            return;
        }
        this.shouldSharePointerInputWithSibling = false;
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float f2, boolean z2, Function0<Unit> function0) {
        int i2 = this.hitDepth;
        this.hitDepth = i2 + 1;
        ensureContainerSize();
        Object[] objArr = this.values;
        int i3 = this.hitDepth;
        objArr[i3] = node;
        this.distanceFromEdgeAndInLayer[i3] = HitTestResultKt.DistanceAndInLayer(f2, z2);
        resizeToHitDepth();
        function0.invoke();
        this.hitDepth = i2;
    }

    public final void speculativeHit(Modifier.Node node, float f2, boolean z2, Function0<Unit> function0) {
        HitTestResult hitTestResult = this;
        if (this.hitDepth == CollectionsKt.getLastIndex(hitTestResult)) {
            hitInMinimumTouchTarget(node, f2, z2, function0);
            if (this.hitDepth + 1 == CollectionsKt.getLastIndex(hitTestResult)) {
                resizeToHitDepth();
                return;
            }
            return;
        }
        long jM5657findBestHitDistanceptXAw2c = m5657findBestHitDistanceptXAw2c();
        int i2 = this.hitDepth;
        this.hitDepth = CollectionsKt.getLastIndex(hitTestResult);
        hitInMinimumTouchTarget(node, f2, z2, function0);
        if (this.hitDepth + 1 < CollectionsKt.getLastIndex(hitTestResult) && DistanceAndInLayer.m5648compareToS_HNhKs(jM5657findBestHitDistanceptXAw2c, m5657findBestHitDistanceptXAw2c()) > 0) {
            int i3 = this.hitDepth + 1;
            int i4 = i2 + 1;
            Object[] objArr = this.values;
            ArraysKt.copyInto(objArr, objArr, i4, i3, size());
            long[] jArr = this.distanceFromEdgeAndInLayer;
            ArraysKt.copyInto(jArr, jArr, i4, i3, size());
            this.hitDepth = ((size() + i2) - this.hitDepth) - 1;
        }
        resizeToHitDepth();
        this.hitDepth = i2;
    }

    public final void siblingHits(Function0<Unit> function0) {
        int i2 = this.hitDepth;
        function0.invoke();
        this.hitDepth = i2;
    }

    private final void ensureContainerSize() {
        int i2 = this.hitDepth;
        Object[] objArr = this.values;
        if (i2 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.distanceFromEdgeAndInLayer = jArrCopyOf;
        }
    }

    public boolean contains(Modifier.Node node) {
        return indexOf((Object) node) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public Modifier.Node get(int i2) {
        Object obj = this.values[i2];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) obj;
    }

    public int indexOf(Modifier.Node node) {
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (lastIndex < 0) {
            return -1;
        }
        int i2 = 0;
        while (!Intrinsics.areEqual(this.values[i2], node)) {
            if (i2 == lastIndex) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Modifier.Node> iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    public int lastIndexOf(Modifier.Node node) {
        for (int lastIndex = CollectionsKt.getLastIndex(this); -1 < lastIndex; lastIndex--) {
            if (Intrinsics.areEqual(this.values[lastIndex], node)) {
                return lastIndex;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator(int i2) {
        return new HitTestResultIterator(this, i2, 0, 0, 6, null);
    }

    @Override // java.util.List
    public List<Modifier.Node> subList(int i2, int i3) {
        return new SubList(i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        resizeToHitDepth();
        this.shouldSharePointerInputWithSibling = true;
    }

    /* JADX INFO: compiled from: HitTestResult.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000elLc\u000b\u0004Iي8\u000b<H\u0007\"2\u001a\u007f\u0007tsA0JiN\u008fTiճ?q\f64[Rqq:\u0016;\u000e(\u000fO\\h\u007fnx\\\u001bI\u0015\u0006${\u0003,wW\tc\u0018\u000f@F\b?aOڱA9ny~\f.>:8(\u0012Gɴ*\u0011\u0016\u0005\t[K:\u001fvT9A`\u001ce\u0005H\u0012L̛ I$jwf6vn$Nw)\u0011zZNU_v\u0011\u0016\u0013Tf?\r%cd?\u0011OC\u0016=S1\t)ÀKƄC}Eݛ\u0001)-1Wzw8^\b\"\u001e{^\u001ba\u000b&\u000b\u0007Ōd\u0012/˃geQZ\u001c/H\n\n\u0010T\u0004<\bόL45Կ~\n\u0014>\u0003yՈDc"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9p@\u0006\u00145g\r\r7{&5\\\u0002\u001eoC\r\u0015vp&\u0007q<U\u0006\u000bVL[(k\\\u007f\u0013", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "7mS2k", "", ";h]\u0016a+>f", ";`g\u0016a+>f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001fz4$Y\f/$m$>TR\u0011O\u0018\u0002XY", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "5dc\u001aT?\"\\\u0018~\u000e", "5dc\u001a\\5\"\\\u0018~\u000e", "6`b\u001bX?M", "", "6`b\u001de,OW#\u000f\t", "<dgA", "<dgA<5=S,", ">qTC\\6Na", ">qTC\\6Na|\by^?", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class HitTestResultIterator implements ListIterator<Modifier.Node>, KMappedMarker {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        /* JADX INFO: renamed from: add */
        public void add2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: set */
        public void set2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public HitTestResultIterator(int i2, int i3, int i4) {
            this.index = i2;
            this.minIndex = i3;
            this.maxIndex = i4;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setIndex(int i2) {
            this.index = i2;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 + 1) - (1 | i5) != 0 ? 0 : i2, (-1) - (((-1) - i5) | ((-1) - 2)) != 0 ? 0 : i3, (i5 + 4) - (i5 | 4) != 0 ? hitTestResult.size() : i4);
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Modifier.Node next() {
            Object[] objArr = HitTestResult.this.values;
            int i2 = this.index;
            this.index = i2 + 1;
            Object obj = objArr[i2];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public Modifier.Node previous() {
            Object[] objArr = HitTestResult.this.values;
            int i2 = this.index - 1;
            this.index = i2;
            Object obj = objArr[i2];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }
    }

    /* JADX INFO: compiled from: HitTestResult.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000ebLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0018\u007f\u0007tsA0JfP.`o2\u000fq~<$iJyCAU\"}01WNmitϽ\\!¼?\f&zz,wU'\\R\"BF}@KM\u001e?Id\u00039\u001d `$أ}\u0005\u000f\u001erW\u001e\u0001\u0013Cy\u0017B4N|RR;MKܜ\u0012NR.\u000e6\\\u0016YfRzkR53\u0005yB|'\u000e?CaUUb7%v\u0010\u001e[DEF-%\u0002\u0005Mҏ[\b\u0011M\u0004U\u0005\u0017)W/W\u007fo6\u0007\u007fZ)sU\u001bp\u000b&\u000b\u0010\u0018tT49c{Q`\u00108w){;QJؑ\u0006oV<C2f6\u0010cx\u0001_XP0^\t\u0014CmD.=\u0006C-I\u001b\u0015Q\u0010S_b\u007f\u0010\u0013$6)\u0011p1[\u0003\u000e\u000f-KX\u0006bIQn?\u000fbRuK\u0007\u001cvr\u0004:\u0004^G..,\u0015<1=7\n;S%y\u001d`D\u0016xKt9bwU`@Ppގ;0\u0011ȱrFj\nyV%g:\u0012e\u001c\u0003\tą\f\u0019(ο\u0010>',\u001eT zwre]8'e;\u000eցp«\u0012[Q`9>_i߭en"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9p@\u0006\u00145g\r\r7{&5\\\u0002){1\u0005\u0019vp\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", ";h]\u0016a+>f", "", ";`g\u0016a+>f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001fz4$Y\f/$m$>TR\u0011O\u0018a\u0006", "5dc\u001aT?\"\\\u0018~\u000e", "u(8", "5dc\u001a\\5\"\\\u0018~\u000e", "Ahi2", "5dc \\A>", "1n]AT0Ga", "", "3kT:X5M", "1n]AT0Gat\u0006\u0002", "3kT:X5Ma", "", "5dc", "7mS2k", "7mS2k\u0016?", "7r4:c;R", "7sT?T;H`", "", ":`bA<5=S,h{", ":hbA<;>`\u0015\u000e\u0005k", "", "AtQ\u0019\\:M", "4q^:<5=S,", "Bn8;W,Q", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class SubList implements List<Modifier.Node>, KMappedMarker {
        private final int maxIndex;
        private final int minIndex;

        /* JADX INFO: renamed from: add */
        public void add2(int i2, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i2, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public Modifier.Node remove(int i2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node remove(int i2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: set */
        public Modifier.Node set2(int i2, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node set(int i2, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }

        public SubList(int i2, int i3) {
            this.minIndex = i2;
            this.maxIndex = i3;
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.Node) {
                return contains((Modifier.Node) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return indexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return lastIndexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        public boolean contains(Modifier.Node node) {
            return indexOf((Object) node) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Modifier.Node get(int i2) {
            Object obj = HitTestResult.this.values[i2 + this.minIndex];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        public int indexOf(Modifier.Node node) {
            int i2 = this.minIndex;
            int i3 = this.maxIndex;
            if (i2 > i3) {
                return -1;
            }
            while (!Intrinsics.areEqual(HitTestResult.this.values[i2], node)) {
                if (i2 == i3) {
                    return -1;
                }
                i2++;
            }
            return i2 - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Modifier.Node> iterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i2 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i2, i2, this.maxIndex);
        }

        public int lastIndexOf(Modifier.Node node) {
            int i2 = this.maxIndex;
            int i3 = this.minIndex;
            if (i3 > i2) {
                return -1;
            }
            while (!Intrinsics.areEqual(HitTestResult.this.values[i2], node)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - this.minIndex;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i2 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i2, i2, this.maxIndex);
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator(int i2) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i3 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i2 + i3, i3, this.maxIndex);
        }

        @Override // java.util.List
        public List<Modifier.Node> subList(int i2, int i3) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i4 = this.minIndex;
            return hitTestResult.new SubList(i2 + i4, i4 + i3);
        }
    }
}
