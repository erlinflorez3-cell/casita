package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: LazyStaggeredGridScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLш|\u0004O\u00198\u000b4B\u0007\"B\u0012\u007f\u0007tpA0ZeP.XV2\u000fy\u0005<$a/yCQU\"}(\u0013WNugvJ`\fK\u000f\u001c\u0016\u0001j2J]xs\u0012\u0017˰HnU\u074c}ok8!@F\t.2:8(\u0006\u0011\u001e8J(v)D[@ 3X!Jc\u001d\\3\u001fŪ\nH&\u0007.bmUFJrc`73\u0014yQ|,ۢ4\u0007S\u0013VZ-\u0014\u0007c$1f@E\u00175S1\b\u0001_ύ\u0007?\u007fGMv5JCI\"\\f\\\u000e)-+}\u000e$rnr\u0013ux\fU0\u007fgYe&(&{,\u0011J)&\u0006UIt-bz\u00164Kt!zpT\u0010lZ\u007f)ff\u001b3\u001dK+g /goc1Ne#5\u0011,8\u0019nO\\\u0005\u0012n:3T&RwQ\tIVw\"Yk\u00154tp,B\u0004^rH;\n=F\u0017S^\f=1B\u0004\u0002vE0\r\u0013\u000e\u0001S\u0018SxD0\u001d.7X8<^Ry\u001dk~U\u001f1a\n*W\u001f.\u0018$0k&AƼ)\u001aTUxopTm\f+5\r?i\u007f{\u001d\u0006>ӷ7?Wi gX}$ABh+avDc\f\t]V&\tʎlݻ{{L\u0088\\\u001f@J\n\u001cb8\bǌhČL\u0003&Փ\u0012&\u0017mrh>\u0004\u000572\u0010\u0002$#\u000e7\u0015\u001b1FΦսIض\u0001p*/GdC->W(wB\rC\t\u0005\u0005\u000eY8hUa\u0005\u0016$V,$$'QQ]>QOUȂ>ī1KTǩ}SS(5\u0012M\b\u001dS\u00010}\u0007\u0019o\u0003ߏvߝST\u001fǱGm\u0001< d.\u0014ӶJ\u0001Oϊl\raYW\u000fS\u0003JkP|3$N)\u000f|:|c2yk[VNҨٻ\u0015˸ayw0\u007f\u0003\u001d:\rg\nJq&\u0010dW|@M\teg V\"Rm3FVw\u0010\bp\nrM\nǬMяt\\@ԇ#1\u0004\t\u0015Cޡt\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{L8\u0017\f`,.|HF#\u00125\u001f", "", "7mXA\\(E7\"}~\\,\u000b", "", "7mXA\\(E=\u001a\u007f\t^;\u000b", "4h[9<5=W\u0017~\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "B`a4X;\"\\\u0018~\u000e", ":`]266N\\(", "uZ8(<\u0013D](\u0006~gu\u0002\u001a7/\u00018\u0005>\u0010\u001b!P}W\u001d\u0007.3h\u0002*@:kq>", "6`S\u0013\\9Lb\u0002\t\n>4\b\u0018CL{<\u0006P\u0010", "", "\nrTA \u0006\u0017", "7mS2k", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "7mS2kj=S ~|Z;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0004@|\u0004=IR;A", "7mS6V,L", "5dc\u0016a+BQ\u0019\r", "u(J\u0016", ":`bA>5He\"_~k:\fl>e\b\u000e{T", "<dP?X:M@\u0015\b|^\u001a\f\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;7v#TL\\;IN{?\u0014\u007fi\n]+b", "5dc\u001bX(KS'\u000egZ5~\t\u001dt{7{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u0010GH[,ja_9\u001d\u0014Z{]'\u001c\u0005/", "Aba<_3(T\u001a\rzm", "5dc V9HZ h{_:|\u0018", "Adc V9HZ h{_:|\u0018", "Aba<_3(T\u001a\rzmj{\t6e\u0002$\u000b@", "Aba<_3(T\u001a\rzm:", "5dc V9HZ h{_:|\u0018=", "1`[0h3:b\u0019_~k:\fy3s\u0004%\u0003@d \u0016G\u0003", "1`[0h3:b\u0019_~k:\fy3s\u0004%\u0003@n\u0015$Qv\u0015&w&CY\r", "=eU@X;L", "@d`BX:M>#\r~m0\u0007\u0012\u000bn~\t\u0006M\u0003\u0017&.k\u001cK\\.?k\u0007\u00067\u0002", "", "CoS.g,", "CoS.g,\u001f`#\u0007b^(\u000b\u0019<el(\nP\b&", ";dP@h9>@\u0019\r\u000be;", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA\u0011nRG&\u0017\u0002", "CoS.g,,Q&\t\u0002e\u0016}\n=e\u000f", "CoS.g,,Q&\t\u0002e\u0017\u0007\u00173t\u00042\u0005$\u0002\u0006\u001aGP\u0012I\u00054\u0019h}()i$\u0016WT;j", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O7[6mVq=!g", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyStaggeredGridScrollPosition {
    public static final int $stable = 8;
    private final Function2<Integer, Integer, int[]> fillIndices;
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private int[] indices;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;
    private int[] scrollOffsets;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridScrollPosition(int[] iArr, int[] iArr2, Function2<? super Integer, ? super Integer, int[]> function2) {
        this.fillIndices = function2;
        this.indices = iArr;
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleIndex(iArr));
        this.scrollOffsets = iArr2;
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleScrollOffset(iArr, iArr2));
        Integer numMinOrNull = ArraysKt.minOrNull(iArr);
        this.nearestRangeState = new LazyLayoutNearestRangeState(numMinOrNull != null ? numMinOrNull.intValue() : 0, 90, 200);
    }

    public final int[] getIndices() {
        return this.indices;
    }

    private final void setIndex(int i2) {
        this.index$delegate.setIntValue(i2);
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    public final int[] getScrollOffsets() {
        return this.scrollOffsets;
    }

    private final void setScrollOffset(int i2) {
        this.scrollOffset$delegate.setIntValue(i2);
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    private final int calculateFirstVisibleScrollOffset(int[] iArr, int[] iArr2) {
        int iCalculateFirstVisibleIndex = calculateFirstVisibleIndex(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] == iCalculateFirstVisibleIndex) {
                iMin = Math.min(iMin, iArr2[i2]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final void updateFromMeasureResult(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem;
        int iCalculateFirstVisibleIndex = calculateFirstVisibleIndex(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices());
        List<LazyStaggeredGridMeasuredItem> visibleItemsInfo = lazyStaggeredGridMeasureResult.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                lazyStaggeredGridMeasuredItem = null;
                break;
            }
            lazyStaggeredGridMeasuredItem = visibleItemsInfo.get(i2);
            if (lazyStaggeredGridMeasuredItem.getIndex() == iCalculateFirstVisibleIndex) {
                break;
            } else {
                i2++;
            }
        }
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = lazyStaggeredGridMeasuredItem;
        this.lastKnownFirstItemKey = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getKey() : null;
        this.nearestRangeState.update(iCalculateFirstVisibleIndex);
        if (this.hadFirstNotEmptyLayout || lazyStaggeredGridMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                update(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices(), lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
                Unit unit = Unit.INSTANCE;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            }
        }
    }

    public final void updateScrollOffset(int[] iArr) {
        this.scrollOffsets = iArr;
        setScrollOffset(calculateFirstVisibleScrollOffset(this.indices, iArr));
    }

    public final void requestPositionAndForgetLastKnownKey(int i2, int i3) {
        int[] iArrInvoke = this.fillIndices.invoke(Integer.valueOf(i2), Integer.valueOf(this.indices.length));
        int length = iArrInvoke.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = i3;
        }
        update(iArrInvoke, iArr);
        this.nearestRangeState.update(i2);
        this.lastKnownFirstItemKey = null;
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved(LazyLayoutItemProvider lazyLayoutItemProvider, int[] iArr) {
        Object obj = this.lastKnownFirstItemKey;
        Integer orNull = ArraysKt.getOrNull(iArr, 0);
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, obj, orNull != null ? orNull.intValue() : 0);
        if (!ArraysKt.contains(iArr, iFindIndexByKey)) {
            this.nearestRangeState.update(iFindIndexByKey);
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                iArr = this.fillIndices.invoke(Integer.valueOf(iFindIndexByKey), Integer.valueOf(iArr.length));
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                this.indices = iArr;
                setIndex(calculateFirstVisibleIndex(iArr));
            } catch (Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        return iArr;
    }

    private final void update(int[] iArr, int[] iArr2) {
        this.indices = iArr;
        setIndex(calculateFirstVisibleIndex(iArr));
        this.scrollOffsets = iArr2;
        setScrollOffset(calculateFirstVisibleScrollOffset(iArr, iArr2));
    }

    private final int calculateFirstVisibleIndex(int[] iArr) {
        int i2 = Integer.MAX_VALUE;
        for (int i3 : iArr) {
            if (i3 <= 0) {
                return 0;
            }
            if (i2 > i3) {
                i2 = i3;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            return 0;
        }
        return i2;
    }
}
