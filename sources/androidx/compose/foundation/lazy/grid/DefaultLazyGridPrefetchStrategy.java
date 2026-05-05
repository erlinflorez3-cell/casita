package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: LazyGridPrefetchStrategy.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\"B\u0012\u007f\u0007|jA0JeP.`\\2şs{B$c$\bCCU }*\teNo˧vJh\u0010KƤ\u000e\u0016\u000fj4I[xc\u0013%˰rom2\u000e|M?ftD\u000582P9ѩ\t\u0001(,\u0011\"\u0005\u0004[K:\u001cX@\u001fE\u0003\u0011[\u00112\u00124?f\u0015fvu[NH\u001bgb/Q\u0011\u001aF\\6w0+]=Jb8%v\u00100qT\u007fG#8k\u00035\\\u0004?1M\"A\u0013y?'Y[:k\u0007j\u000e\u0017-1_\u000fmrTa3U7ϲ)˦ScSִ^4\u0006\u0001\u0014\rj\u0005dͽ3ρ2-\"ǑX\u001aAt\u000bSnQXތDȸ~a>Ѝu\fA2Q\u001b\u0015Y8ݥ%\u05ee;{\rټ̽'\u0015"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017\";l0.\u001cwH5\u001cw\u000e[z&2YN-\\ap@\u0002!g\n]+\u000f\u0019/", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`$\u0014c-N\u0006%J:]9Xar?(g", "<dbAX+)`\u0019\u007fzm*\u007fl>e\b\u0006\u0006P\n&", "", "uH\u0018#", "1ta?X5M:\u001d\bzI9|\n/t}+^<\n\u0016\u001eG}", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u0012\u0019x[+\u000e\u0005h?'Q@@\u001e\u000f,\u001f", ":h]2G6)`\u0019\u007fzm*\u007f", "E`b V9HZ \u0003\u0004`\r\u0007\u0016Aa\r'", "", "=m=2f;>R\u0004\fz_,\f\u00072", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005T4,$h`$\u0014c-N\u0006%J:L6gRH", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7I\t'{S", "=mB0e6EZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`$\u0014c-N\u0006%J:L6gRH", "2d[AT", "", ":`h<h;\"\\\u001a\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l` \u0003w6^\u0006\u000bPMX\u0002", "=mE6f0;Z\u0019b\n^4\u000bx:d{7{?", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DefaultLazyGridPrefetchStrategy implements LazyGridPrefetchStrategy {
    private final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;
    private int lineToPrefetch;
    private final int nestedPrefetchItemCount;
    private boolean wasScrollingForward;

    public DefaultLazyGridPrefetchStrategy() {
        this(0, 1, null);
    }

    public DefaultLazyGridPrefetchStrategy(int i2) {
        this.nestedPrefetchItemCount = i2;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new MutableVector<>(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
    }

    public /* synthetic */ DefaultLazyGridPrefetchStrategy(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 2 : i2);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onScroll(LazyGridPrefetchScope lazyGridPrefetchScope, float f2, LazyGridLayoutInfo lazyGridLayoutInfo) {
        int row;
        int index;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector;
        int size;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector2;
        int size2;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector3;
        int size3;
        if (!lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            int i2 = 0;
            boolean z2 = f2 < 0.0f;
            if (z2) {
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.last((List) lazyGridLayoutInfo.getVisibleItemsInfo());
                row = (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
                index = ((LazyGridItemInfo) CollectionsKt.last((List) lazyGridLayoutInfo.getVisibleItemsInfo())).getIndex() + 1;
            } else {
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.first((List) lazyGridLayoutInfo.getVisibleItemsInfo());
                row = (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
                index = ((LazyGridItemInfo) CollectionsKt.first((List) lazyGridLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
            }
            if (index >= 0 && index < lazyGridLayoutInfo.getTotalItemsCount()) {
                if (row != this.lineToPrefetch && row >= 0) {
                    if (this.wasScrollingForward != z2 && (size3 = (mutableVector3 = this.currentLinePrefetchHandles).getSize()) > 0) {
                        LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector3.getContent();
                        int i3 = 0;
                        do {
                            content[i3].cancel();
                            i3++;
                        } while (i3 < size3);
                    }
                    this.wasScrollingForward = z2;
                    this.lineToPrefetch = row;
                    this.currentLinePrefetchHandles.clear();
                    MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector4 = this.currentLinePrefetchHandles;
                    mutableVector4.addAll(mutableVector4.getSize(), (List<? extends LazyLayoutPrefetchState.PrefetchHandle>) lazyGridPrefetchScope.scheduleLinePrefetch(row));
                }
                if (!z2) {
                    if (lazyGridLayoutInfo.getViewportStartOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis((LazyGridItemInfo) CollectionsKt.first((List) lazyGridLayoutInfo.getVisibleItemsInfo()), lazyGridLayoutInfo.getOrientation()) >= f2 || (size = (mutableVector = this.currentLinePrefetchHandles).getSize()) <= 0) {
                        return;
                    }
                    LazyLayoutPrefetchState.PrefetchHandle[] content2 = mutableVector.getContent();
                    do {
                        content2[i2].markAsUrgent();
                        i2++;
                    } while (i2 < size);
                    return;
                }
                LazyGridItemInfo lazyGridItemInfo3 = (LazyGridItemInfo) CollectionsKt.last((List) lazyGridLayoutInfo.getVisibleItemsInfo());
                if (((LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo3, lazyGridLayoutInfo.getOrientation()) + LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo3, lazyGridLayoutInfo.getOrientation())) + lazyGridLayoutInfo.getMainAxisItemSpacing()) - lazyGridLayoutInfo.getViewportEndOffset() >= (-f2) || (size2 = (mutableVector2 = this.currentLinePrefetchHandles).getSize()) <= 0) {
                    return;
                }
                LazyLayoutPrefetchState.PrefetchHandle[] content3 = mutableVector2.getContent();
                do {
                    content3[i2].markAsUrgent();
                    i2++;
                } while (i2 < size2);
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onVisibleItemsUpdated(LazyGridPrefetchScope lazyGridPrefetchScope, LazyGridLayoutInfo lazyGridLayoutInfo) {
        int row;
        if (this.lineToPrefetch == -1 || lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        if (this.wasScrollingForward) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.last((List) lazyGridLayoutInfo.getVisibleItemsInfo());
            row = (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.first((List) lazyGridLayoutInfo.getVisibleItemsInfo());
            row = (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
        }
        if (this.lineToPrefetch != row) {
            this.lineToPrefetch = -1;
            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
            int size = mutableVector.getSize();
            if (size > 0) {
                LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    content[i2].cancel();
                    i2++;
                } while (i2 < size);
            }
            this.currentLinePrefetchHandles.clear();
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i2) {
        int i3 = this.nestedPrefetchItemCount;
        for (int i4 = 0; i4 < i3; i4++) {
            nestedPrefetchScope.schedulePrefetch(i2 + i4);
        }
    }
}
