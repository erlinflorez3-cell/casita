package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.IntervalList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007f\u0007lkA0ZeP.hS2\u000f\u0002{<řc$\u007fbCU \u0001*\t]log\u0005Jb\u000bI\u0017\u000e\u0016\u000fj4I[ze\u0012\u001d2JoE7SڎSʠ\u0011td\u0004X3H_\"E\f*.V\u0010\u000fzqLë\u00160Nr\u0003f\u001bh\u001d \"\bN /1\u000by~:V\tu:]'Ii\u000bZ5|H|{+vX5,\u000faL/\tCC5=S1\u000b\u0003_M$Wqk\t1-5Mas\u0006Y\u001f\u007f\\)9s%]!*\r\t_\u0002$'YS\u0014O^3@w)\u007f]N\u0012\u0011\u001e'v2cZ=ڟ\u0010\u07baxvkBV\u0007lHP\u0017o=/5\u00105;9Io\u007fi$\u001f^9\f\u0005;'\u0002\u000bEĒ]ڍ\u0012`\u001dÑ%\n_<iFMJ^\n\bA\u001c\u0010Gê\u0004ò\b0Oĉ\u007f\b\u001f;/%e_\u0010\u05fd-Ƞ\u0006HLϙG\u0011nhki\u0001I\u0017̑pގ;*\u0011ȱ+Pr\u0013\u0004P\u0003\\\u0003ҍYɟX\u0007\u0006ܱc,j\u0007T!S\u0014%лtȬnMe܃u;tGqn\u001a\u0012.ޭjۋ9Qk߄2d\u0005%WBr\u0007hfpf:l3̨.ĘLj\u0018ǮLf\\!+2muL8:E1\\CLAb\u0019ˍ\tȤcfpɭ\u0017V9:\u0011oDv\u000f\u0018^tA~u\u0012a,+dXqۮU91([<v:ē'0"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0012_55r;Q\\]\u0017i\\\u0004A\u0013\u0012gc", "", "5qX166Gb\u0019\b\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0010r,[\b#N*X5kR{Li", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8jl;N\u00048CS,6earF#g\u001e~", "0tR8X;,W.~", "", "5dc\u000fh*DS(l~s,", "u(8", "0tR8X;L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0012_55r;Q\\]\u0017i\\\u0004A\u0013\u0012gL+;\u000b\u000bYPy", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "1`R5X+\u001bc\u0017\u0005zm", "", "1`R5X+\u001bc\u0017\u0005zm\u0010\u0006\b/x", ":`bA?0GS|\by^?", ":`bA?0GS\u0007\u000evk;`\u0018/mc1z@\u0014", ":`bA?0GS\u0007\u000evk;b\u00129w\t\u0016\u0007<\n", ">qTC\\6Naw~{Z<\u0004\u0018\u001dp{1\n", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", "D`[BX", "Ak^Af\u0017>`\u007f\u0003\u0004^", "5dc _6Ma\u0004~\bE0\u0006\t", "Adc _6Ma\u0004~\bE0\u0006\t", "uH\u0018#", "Bnc._\u001aBh\u0019", "5dc!b;:Z\u0007\u0003\u0010^", "5dc\u0011X-:c \u000ehi(\u0006\u0017", "1ta?X5MA \t\nl\u0017|\u0016\u0016i\t(", "5dc\u0019\\5>1#\b{b.\r\u0016+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0012_55r;Q\\]\u0017i\\\u0004A\u0013\u0012gL5/\u0016\u00057K-oH9/\u0015(X\u0006EqV", ":h]2<5=S,", "5dc\u0019\\5>7\"}zq\u0016}l>e\b", "7sT:<5=S,", "7me._0=O(~XZ*\u007f\t", "", "AoP;B-", ";`g c(G", "\u0010tR8X;", "\u001a`iF:9BR|\u000ezf\u001a\b\u00058S}2\u0007@d\u001f\"N", "\u001ah]266GT\u001d\u0001\u000bk(\f\r9n", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyGridSpanLayoutProvider {
    public static final int $stable = 8;
    private final ArrayList<Bucket> buckets;
    private final List<Integer> cachedBucket;
    private int cachedBucketIndex;
    private final LazyGridIntervalContent gridContent;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private int lastLineStartKnownSpan;
    private List<GridItemSpan> previousDefaultSpans;
    private int slotsPerLine;

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent lazyGridIntervalContent) {
        this.gridContent = lazyGridIntervalContent;
        ArrayList<Bucket> arrayList = new ArrayList<>();
        int i2 = 0;
        arrayList.add(new Bucket(i2, i2, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = CollectionsKt.emptyList();
    }

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r@4\u0012\u000e\u0007nj?4Jj^\u008c\u0003SX\u000e,\u0015D(i$\nCiV*\b0\u000bgTwi~J\t\u000fq\u0012و\u001axx1\u001ad\u0007]*\u000f`CņC9UڎU;fzD\fpG0:\u0012\u000b\u0011\u001c:H>z)Fƚ\u0010\u00188ϋ\t<X\u0015[\u000eܮ\u0016\u0010"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0012_55r;Q\\]\u0017i\\\u0004A\u0013\u0012gL5/\u0016\u00057K-oH9/\u0015(X\u0006EqV", "", "4ha@g\u0010MS!b\u0004],\u0010", "", "AoP;f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", "uH;7T=:\u001d)\u000e~euc\r=tUkl", "5dc\u0013\\9Lb|\u000ezf\u0010\u0006\b/x", "u(8", "5dc c(Ga", "u(;7T=:\u001d)\u000e~euc\r=tU", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class LineConfiguration {
        public static final int $stable = 8;
        private final int firstItemIndex;
        private final List<GridItemSpan> spans;

        public LineConfiguration(int i2, List<GridItemSpan> list) {
            this.firstItemIndex = i2;
            this.spans = list;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final List<GridItemSpan> getSpans() {
            return this.spans;
        }
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((((double) getTotalSize()) * 1.0d) / ((double) this.slotsPerLine))) + 1;
    }

    private final List<GridItemSpan> getDefaultSpans(int i2) {
        if (i2 == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(GridItemSpan.m1137boximpl(LazyGridSpanKt.GridItemSpan(1)));
        }
        ArrayList arrayList2 = arrayList;
        this.previousDefaultSpans = arrayList2;
        return arrayList2;
    }

    public final int getTotalSize() {
        return this.gridContent.getIntervals().getSize();
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final void setSlotsPerLine(int i2) {
        if (i2 != this.slotsPerLine) {
            this.slotsPerLine = i2;
            invalidateCache();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration getLineConfiguration(int r10) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.getLineConfiguration(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    public final int getLineIndexOfItem(final int i2) {
        int i3 = 0;
        if (getTotalSize() <= 0) {
            return 0;
        }
        if (i2 >= getTotalSize()) {
            throw new IllegalArgumentException("ItemIndex > total count".toString());
        }
        if (!this.gridContent.getHasCustomSpans$foundation_release()) {
            return i2 / this.slotsPerLine;
        }
        int iBinarySearch$default = CollectionsKt.binarySearch$default(this.buckets, 0, 0, new Function1<Bucket, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(LazyGridSpanLayoutProvider.Bucket bucket) {
                return Integer.valueOf(bucket.getFirstItemIndex() - i2);
            }
        }, 3, (Object) null);
        int i4 = 2;
        if (iBinarySearch$default < 0) {
            iBinarySearch$default = (-iBinarySearch$default) - 2;
        }
        int bucketSize = getBucketSize() * iBinarySearch$default;
        int firstItemIndex = this.buckets.get(iBinarySearch$default).getFirstItemIndex();
        if (firstItemIndex > i2) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex".toString());
        }
        int i5 = 0;
        while (firstItemIndex < i2) {
            int i6 = firstItemIndex + 1;
            int iSpanOf = spanOf(firstItemIndex, this.slotsPerLine - i5);
            i5 += iSpanOf;
            int i7 = this.slotsPerLine;
            if (i5 >= i7) {
                if (i5 == i7) {
                    bucketSize++;
                    i5 = 0;
                } else {
                    bucketSize++;
                    i5 = iSpanOf;
                }
            }
            if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= this.buckets.size()) {
                this.buckets.add(new Bucket(i6 - (i5 > 0 ? 1 : 0), i3, i4, null));
            }
            firstItemIndex = i6;
        }
        return i5 + spanOf(i2, this.slotsPerLine - i5) > this.slotsPerLine ? bucketSize + 1 : bucketSize;
    }

    public final int spanOf(int i2, int i3) {
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.INSTANCE;
        lazyGridItemSpanScopeImpl.setMaxCurrentLineSpan(i3);
        lazyGridItemSpanScopeImpl.setMaxLineSpan(this.slotsPerLine);
        IntervalList.Interval<LazyGridInterval> interval = this.gridContent.getIntervals().get(i2);
        return GridItemSpan.m1141getCurrentLineSpanimpl(interval.getValue().getSpan().invoke(lazyGridItemSpanScopeImpl, Integer.valueOf(i2 - interval.getStartIndex())).m1144unboximpl());
    }

    private final void invalidateCache() {
        this.buckets.clear();
        int i2 = 0;
        this.buckets.add(new Bucket(i2, i2, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4F\u0005\"Bߚ(\u0007\u0015iyETiV.jSX\u0010{\u0002:$i&\nCiV۟\u0002\"\u0017R\u001fvunbZ9DǇ\n\u001c\u0001̓DK[|k\u0017_APqW3{pެ=f|Ȃ\u001d\"8(F~ڷ\u0005!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0012_55r;Q\\]\u0017i\\\u0004A\u0013\u0012gL+;\u000b\u000bYPy", "", "4ha@g\u0010MS!b\u0004],\u0010", "", "4ha@g\u0010MS!d\u0004h>\u0006v:a\t", "uH8uI", "5dc\u0013\\9Lb|\u000ezf\u0010\u0006\b/x", "u(8", "5dc\u0013\\9Lb|\u000ezf\u0012\u0006\u0013Anm3wI", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class Bucket {
        private final int firstItemIndex;
        private final int firstItemKnownSpan;

        public Bucket(int i2, int i3) {
            this.firstItemIndex = i2;
            this.firstItemKnownSpan = i3;
        }

        public /* synthetic */ Bucket(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, (i4 + 2) - (i4 | 2) != 0 ? 0 : i3);
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }
    }

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005(2\u009cw\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005<i%\nCiWpԙ.\u07beSZo˧\u0007L`\u000eQ\u0013&\u0018~o:O&\u0011k\u0019'2pq\u0016ݣYڱAEhҚN\u0007&:0<\u001a\u0007\u0007#8NǞz\u0005"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0012_55r;Q\\]\u0017i\\\u0004A\u0013\u0012gL5'\"\u0019;N(m(F\u001f\u0010\u001aT}DV~\u0016!\u000e\u0019r{I,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<\u0002#P:L6gRH", "u(E", ";`g\u0010h9KS\"\u000eab5|v:a\t", "", "5dc\u001aT?\u001cc&\fzg;c\r8em3wI", "u(8", "Adc\u001aT?\u001cc&\fzg;c\r8em3wI", "uH\u0018#", ";`g\u0019\\5>A$z\u0004", "5dc\u001aT?%W\"~hi(\u0006", "Adc\u001aT?%W\"~hi(\u0006", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        private static int maxCurrentLineSpan = 0;
        private static int maxLineSpan = 0;

        private LazyGridItemSpanScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxCurrentLineSpan() {
            return maxCurrentLineSpan;
        }

        public void setMaxCurrentLineSpan(int i2) {
            maxCurrentLineSpan = i2;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxLineSpan() {
            return maxLineSpan;
        }

        public void setMaxLineSpan(int i2) {
            maxLineSpan = i2;
        }
    }
}
