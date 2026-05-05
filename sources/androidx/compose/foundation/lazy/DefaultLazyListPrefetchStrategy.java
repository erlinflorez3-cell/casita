package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
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
/* JADX INFO: compiled from: LazyListPrefetchStrategy.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\"B\u0012\u007f\u0007ljA0RnP\u008cZS8\u000fs{J$c$wCCU0}*ޛWNulvϺb\u000bY\u000f\u000e\u0016~j2Jkތ\u000e\u0012=1\u0003|O9SoK9xtd\u0006ڶ6\"F{M\u0013(2`\u0010%\u0004kK:\u001c`D~Ej\r{\u0006`&NX.\r6\\\u0016W^H\u001bjj31\u0011\u0002B|6\u00104\u000b]%F\u00038S\u000b*09RO5C.{\u00035_\fC\u0011O\n=3ym;{W\u0002ZNZ\u0016\u0013C/&\u0558ię*\\\rĩ1\u001850gcyQdߍ\u0004ߡ\u007f\rDǉ^\u00125HF-Hg^ԇ5ϢvSHАRjP\u0006\u0013ad\u001e{ı?ڢ=\u001bnϟŎ?,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u0016m\u0017*]JJR03)OeG\u0016N9Nw'VJQ\u001ak_nL\u0014\u0014nc", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001f+\u0015iaH\u0005f\u001a]\u0004#VLP@2", "<dbAX+)`\u0019\u007fzm*\u007fl>e\b\u0006\u0006P\n&", "", "uH\u0018#", "1ta?X5M>&~{^;z\f\u0012a\t'\u0003@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u0012\u0019x[+\u000e\u0005h?'Q@@\u001e\u000f,\u001f", "7mS2k\u001bH>&~{^;z\f", "E`b V9HZ \u0003\u0004`\r\u0007\u0016Aa\r'", "", "=m=2f;>R\u0004\fz_,\f\u00072", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005T4,$h`$\u0014c-N\u0006%J:L6gRH", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7I\t'{S", "=mB0e6EZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001f+\u0015iaH\u0005f\u001aL\u00012G\"", "2d[AT", "", ":`h<h;\"\\\u001a\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001b\u001a)rqHjl-XL", "=mE6f0;Z\u0019b\n^4\u000bx:d{7{?", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DefaultLazyListPrefetchStrategy implements LazyListPrefetchStrategy {
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private int indexToPrefetch;
    private final int nestedPrefetchItemCount;
    private boolean wasScrollingForward;

    public DefaultLazyListPrefetchStrategy() {
        this(0, 1, null);
    }

    public DefaultLazyListPrefetchStrategy(int i2) {
        this.nestedPrefetchItemCount = i2;
        this.indexToPrefetch = -1;
    }

    public /* synthetic */ DefaultLazyListPrefetchStrategy(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 2 : i2);
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onScroll(LazyListPrefetchScope lazyListPrefetchScope, float f2, LazyListLayoutInfo lazyListLayoutInfo) {
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            boolean z2 = f2 < 0.0f;
            if (z2) {
                index = ((LazyListItemInfo) CollectionsKt.last((List) lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1;
            } else {
                index = ((LazyListItemInfo) CollectionsKt.first((List) lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
            }
            if (index >= 0 && index < lazyListLayoutInfo.getTotalItemsCount()) {
                if (index != this.indexToPrefetch) {
                    if (this.wasScrollingForward != z2 && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                        prefetchHandle3.cancel();
                    }
                    this.wasScrollingForward = z2;
                    this.indexToPrefetch = index;
                    this.currentPrefetchHandle = lazyListPrefetchScope.schedulePrefetch(index);
                }
                if (!z2) {
                    if (lazyListLayoutInfo.getViewportStartOffset() - ((LazyListItemInfo) CollectionsKt.first((List) lazyListLayoutInfo.getVisibleItemsInfo())).getOffset() >= f2 || (prefetchHandle = this.currentPrefetchHandle) == null) {
                        return;
                    }
                    prefetchHandle.markAsUrgent();
                    return;
                }
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.last((List) lazyListLayoutInfo.getVisibleItemsInfo());
                if (((lazyListItemInfo.getOffset() + lazyListItemInfo.getSize()) + lazyListLayoutInfo.getMainAxisItemSpacing()) - lazyListLayoutInfo.getViewportEndOffset() >= (-f2) || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
                    return;
                }
                prefetchHandle2.markAsUrgent();
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onVisibleItemsUpdated(LazyListPrefetchScope lazyListPrefetchScope, LazyListLayoutInfo lazyListLayoutInfo) {
        int index;
        if (this.indexToPrefetch == -1 || lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        if (this.wasScrollingForward) {
            index = ((LazyListItemInfo) CollectionsKt.last((List) lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1;
        } else {
            index = ((LazyListItemInfo) CollectionsKt.first((List) lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
        }
        if (this.indexToPrefetch != index) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i2) {
        int i3 = this.nestedPrefetchItemCount;
        for (int i4 = 0; i4 < i3; i4++) {
            nestedPrefetchScope.schedulePrefetch(i2 + i4);
        }
    }
}
