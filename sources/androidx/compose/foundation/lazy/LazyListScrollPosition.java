package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: LazyListScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lrA0ZeP.XX2\u000fy{<$a%yCQU\"}(\nWN}gvϺ`ŏYƤ6\u0016'il`e~c\u0012\u001d2Zom4]uC9nvN\u0005N3ŕ<y\u0013\u0004b>V'\u000fzqc<\u0016>G\t:\u0001\u000e}\t(%\u001e>N\u0002frugNH\u001buj31\n\u0002B|(\u00104\u000b`%F\u0003(Sv**9ZO5C=\u0004\u0007\u0015ms?1[:I\u0013\u0006?'Ya$[Dk\u0018\u0014C,\u0018#k\u0011>\\3R\u0011\u00105Jgcyp>,\u0006\u0002\u0014\rj\u0005T\u000bwT<12f6\u0013\nς~ՂDP\nމ\u0013)\thN\u0017S\u0001c/G!~Q\u0010<O\u0013u@[ڃ̣#ъr1cV\u0014l#(lyW9_I]JT\u0014gH>\u0012~p\u001a,\u001a/u~\u0006Ɉ\u001dѧ\u001b%?ك\n2/z\u001aHrwЛ\tfpׅ\u0002TNQ0\u0001f`8\u001c$Zre5o^Zp,?NR\u0019E>^ʽ؍\\ʟ@1-\u0012Tevv\u0003Oc\u001e38\u00079_\u0004y\u0019Č=\u007f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"\u001c\"rh@qm:R\u0006+QU$", "", "7mXA\\(E7\"}zq", "", "7mXA\\(EA\u0017\f\u0005e3f\n0s\u007f7", "uH8uI", "6`S\u0013\\9Lb\u0002\t\n>4\b\u0018CL{<\u0006P\u0010", "", "\nrTA \u0006\u0017", "7mS2k", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "7mS2kj=S ~|Z;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0004@|\u0004=IR;A", ":`bA>5He\"_~k:\fl>e\b\u000e{T", "<dP?X:M@\u0015\b|^\u001a\f\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;7v#TL\\;IN{?\u0014\u007fi\n]+b", "5dc\u001bX(KS'\u000egZ5~\t\u001dt{7{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u0010GH[,ja_9\u001d\u0014Z{]'\u001c\u0005/", "Aba<_3(T\u001a\rzm", "5dc V9HZ h{_:|\u0018", "Adc V9HZ h{_:|\u0018", "Aba<_3(T\u001a\rzmj{\t6e\u0002$\u000b@", "@d`BX:M>#\r~m0\u0007\u0012\u000bn~\t\u0006M\u0003\u0017&.k\u001cK\\.?k\u0007\u00067\u0002", "", "CoS.g,", "CoS.g,\u001f`#\u0007b^(\u000b\u0019<el(\nP\b&", ";dP@h9>@\u0019\r\u000be;", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001c\u001e\u0011vqF\u0007P,\\\u0007.V\"", "CoS.g,,Q&\t\u0002e\u0016}\n=e\u000f", "CoS.g,,Q&\t\u0002e\u0017\u0007\u00173t\u00042\u0005$\u0002\u0006\u001aGP\u0012I\u00054\u0019h}()i$\u0016WT;j", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u0018-\u0015pLF\u0011t0Mv4\u001d", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyListScrollPosition {
    public static final int $stable = 8;
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyListScrollPosition() {
        int i2 = 0;
        this(i2, i2, 3, null);
    }

    public LazyListScrollPosition(int i2, int i3) {
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(i3);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i2, 30, 100);
    }

    public /* synthetic */ LazyListScrollPosition(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i4) | ((-1) - 1)) != 0 ? 0 : i2, (i4 + 2) - (i4 | 2) != 0 ? 0 : i3);
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    public final void setIndex(int i2) {
        this.index$delegate.setIntValue(i2);
    }

    private final void setScrollOffset(int i2) {
        this.scrollOffset$delegate.setIntValue(i2);
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final void updateFromMeasureResult(LazyListMeasureResult lazyListMeasureResult) {
        LazyListMeasuredItem firstVisibleItem = lazyListMeasureResult.getFirstVisibleItem();
        this.lastKnownFirstItemKey = firstVisibleItem != null ? firstVisibleItem.getKey() : null;
        if (this.hadFirstNotEmptyLayout || lazyListMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = lazyListMeasureResult.getFirstVisibleItemScrollOffset();
            if (firstVisibleItemScrollOffset < 0.0f) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleItemScrollOffset + ')').toString());
            }
            LazyListMeasuredItem firstVisibleItem2 = lazyListMeasureResult.getFirstVisibleItem();
            update(firstVisibleItem2 != null ? firstVisibleItem2.getIndex() : 0, firstVisibleItemScrollOffset);
        }
    }

    public final void updateScrollOffset(int i2) {
        if (i2 < 0.0f) {
            throw new IllegalStateException(("scrollOffset should be non-negative (" + i2 + ')').toString());
        }
        setScrollOffset(i2);
    }

    public final void requestPositionAndForgetLastKnownKey(int i2, int i3) {
        update(i2, i3);
        this.lastKnownFirstItemKey = null;
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(LazyListItemProvider lazyListItemProvider, int i2) {
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, this.lastKnownFirstItemKey, i2);
        if (i2 != iFindIndexByKey) {
            setIndex(iFindIndexByKey);
            this.nearestRangeState.update(i2);
        }
        return iFindIndexByKey;
    }

    private final void update(int i2, int i3) {
        if (i2 < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i2 + ')').toString());
        }
        setIndex(i2);
        this.nearestRangeState.update(i2);
        setScrollOffset(i3);
    }
}
