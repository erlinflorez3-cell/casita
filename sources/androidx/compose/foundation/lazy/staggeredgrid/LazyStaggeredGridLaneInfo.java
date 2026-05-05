package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
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
/* JADX INFO: compiled from: LazyStaggeredGridLaneInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":%\u007fјnjO0Le^.Zݷ2\u000fy\u0005<$a%yCIU\"}(\u0019UȞ}˧\rg\u000b\u000bq\u000e>\u0016\u0016\tlLǤ|] \u000fzV}GKM\u001eFid\u0003@\u001d `$h}\u0013\f2*v\u0012?\u0013QW$\u0012^M!>`\u001be\u0005H\u00146D&\u0001,k\u007fNdJ3]\u0003;1\u0013\u0002B|4\u00104\u000b^%F\u0003)U\u000bo0C@e7E)a\r\u001fR\nA3C\u007fH\u001dhU)s]\u0002jNX.\u0016E/]\u0017urT^5Un\u0017?+}e\u0014^\u001c<\u0010|\u0012\fj\b>\n5RF-HhP\u001aA\n\u000bSnR2bP\n\u0013ad\u0019m\u0004AAQ\u001b\u0015S*?'eO{3\u001af9\u000f\u00079[\u0003\u001b\u0011\u0019)^\u0010Q_SpCVg\"[Sl2t+\u00168\u001eHG.<,\u0015<!=7\n;S%y\u001d`D\u0016xMdvo\u0002RvBrz$8B\t:\\\u001bߢ\u0011\u07fbTT`\u008caY*W\u001f}6\u0017vς\u0004˶%%\u0018ʚ zwoec\u001a'?fe`\u001dqdæ;ӷ75Yү߭eq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YtJ4\rhbB.D", "", "u(E", "/mR5b9", "", ":`]2f", "", "AoP;a,=7(~\u0003l", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[N\u000eH\u0007%\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YtJ4\rhbB.-2B\u001b\u00115I\u0001\u001fw\u0001\u0014k", "/rb6Z5>R\b\taZ5|", "", "7sT:<5=S,", "B`a4X;%O\"~", "3mbBe,\u001cO$zxb;\u0011", "", "1`_.V0Mg", "<df\u001cY-LS(", "3mbBe,/O \u0003yB5{\tB", "@d`BX:MS\u0018b\u0004],\u0010", "4h]1A,Qb|\u000ezf\u0010\u0006\b/x", "4h]1C9>d\u001d\t\u000bl\u0010\f\t7I\t'{S", "5dc\u0014T7L", "5dc\u0019T5>", ":nf2e\tHc\"}", "@db2g", "Adc\u0014T7L", "5`_@", "Adc\u0019T5>", ":`]2", "Co_2e\tHc\"}", "\u0011n\\=T5B]\"", "!oP;a,=7(~\u0003", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyStaggeredGridLaneInfo {
    public static final int FullSpan = -2;
    private static final int MaxCapacity = 131072;
    public static final int Unset = -1;
    private int anchor;
    private int[] lanes = new int[16];
    private final ArrayDeque<SpannedItem> spannedItems = new ArrayDeque<>();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: LazyStaggeredGridLaneInfo.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r54\u0012}\rljOӄtev-\u0013f:\u0013y{L$\n%\u0002GIW2}P\fҊRgur\u001br\u0019E'\u0006D{AߡUǤ|i\u001aƁJDuDAS\u0010??g\u0003>U/@\"Py3\u0002ʀ.N\u0018͌\u0013EQ\u0015 :ϴtE"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YtJ4\rhbB.-2B\u001b\u00115I\u0001\u001fw\u0001\u0014k", "", "7mS2k", "", "5`_@", "", "uHJ\u0016\u001c\u001d", "5dc\u0014T7L", "u(J\u0016", "Adc\u0014T7L", "uZ8uI", "5dc\u0016a+>f", "u(8", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class SpannedItem {
        private int[] gaps;
        private final int index;

        public SpannedItem(int i2, int[] iArr) {
            this.index = i2;
            this.gaps = iArr;
        }

        public final int[] getGaps() {
            return this.gaps;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setGaps(int[] iArr) {
            this.gaps = iArr;
        }
    }

    public final void setLane(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative lanes are not supported".toString());
        }
        ensureValidIndex(i2);
        this.lanes[i2 - this.anchor] = i3 + 1;
    }

    public final int getLane(int i2) {
        if (i2 < lowerBound() || i2 >= upperBound()) {
            return -1;
        }
        return this.lanes[i2 - this.anchor] - 1;
    }

    public final boolean assignedToLane(int i2, int i3) {
        int lane = getLane(i2);
        return lane == i3 || lane == -1 || lane == -2;
    }

    public final int upperBound() {
        return this.anchor + this.lanes.length;
    }

    public final int lowerBound() {
        return this.anchor;
    }

    public final void reset() {
        ArraysKt.fill$default(this.lanes, 0, 0, 0, 6, (Object) null);
        this.spannedItems.clear();
    }

    public final int findPreviousItemIndex(int i2, int i3) {
        for (int i4 = i2 - 1; -1 < i4; i4--) {
            if (assignedToLane(i4, i3)) {
                return i4;
            }
        }
        return -1;
    }

    public final int findNextItemIndex(int i2, int i3) {
        int iUpperBound = upperBound();
        for (int i4 = i2 + 1; i4 < iUpperBound; i4++) {
            if (assignedToLane(i4, i3)) {
                return i4;
            }
        }
        return upperBound();
    }

    public final void ensureValidIndex(int i2) {
        int i3 = this.anchor;
        int i4 = i2 - i3;
        if (i4 >= 0 && i4 < 131072) {
            ensureCapacity$default(this, i4 + 1, 0, 2, null);
        } else {
            int iMax = Math.max(i2 - (this.lanes.length / 2), 0);
            this.anchor = iMax;
            int i5 = iMax - i3;
            if (i5 >= 0) {
                int[] iArr = this.lanes;
                if (i5 < iArr.length) {
                    ArraysKt.copyInto(iArr, iArr, 0, i5, iArr.length);
                }
                int[] iArr2 = this.lanes;
                ArraysKt.fill(iArr2, 0, Math.max(0, iArr2.length - i5), this.lanes.length);
            } else {
                int i6 = -i5;
                int[] iArr3 = this.lanes;
                if (iArr3.length + i6 < 131072) {
                    ensureCapacity(iArr3.length + i6 + 1, i6);
                } else {
                    if (i6 < iArr3.length) {
                        ArraysKt.copyInto(iArr3, iArr3, i6, 0, iArr3.length - i6);
                    }
                    int[] iArr4 = this.lanes;
                    ArraysKt.fill(iArr4, 0, 0, Math.min(iArr4.length, i6));
                }
            }
        }
        while (!this.spannedItems.isEmpty() && this.spannedItems.first().getIndex() < lowerBound()) {
            this.spannedItems.removeFirst();
        }
        while (!this.spannedItems.isEmpty() && this.spannedItems.last().getIndex() > upperBound()) {
            this.spannedItems.removeLast();
        }
    }

    public final void setGaps(int i2, int[] iArr) {
        ArrayDeque<SpannedItem> arrayDeque = this.spannedItems;
        final Integer numValueOf = Integer.valueOf(i2);
        int iBinarySearch = CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new Function1<SpannedItem, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem) {
                return Integer.valueOf(ComparisonsKt.compareValues(Integer.valueOf(spannedItem.getIndex()), numValueOf));
            }
        });
        if (iBinarySearch < 0) {
            if (iArr == null) {
                return;
            }
            this.spannedItems.add(-(iBinarySearch + 1), new SpannedItem(i2, iArr));
            return;
        }
        if (iArr == null) {
            this.spannedItems.remove(iBinarySearch);
        } else {
            this.spannedItems.get(iBinarySearch).setGaps(iArr);
        }
    }

    public final int[] getGaps(int i2) {
        ArrayDeque<SpannedItem> arrayDeque = this.spannedItems;
        final Integer numValueOf = Integer.valueOf(i2);
        SpannedItem spannedItem = (SpannedItem) CollectionsKt.getOrNull(this.spannedItems, CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new Function1<SpannedItem, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem2) {
                return Integer.valueOf(ComparisonsKt.compareValues(Integer.valueOf(spannedItem2.getIndex()), numValueOf));
            }
        }));
        if (spannedItem != null) {
            return spannedItem.getGaps();
        }
        return null;
    }

    static /* synthetic */ void ensureCapacity$default(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i2, int i3, int i4, Object obj) {
        if ((i4 + 2) - (i4 | 2) != 0) {
            i3 = 0;
        }
        lazyStaggeredGridLaneInfo.ensureCapacity(i2, i3);
    }

    private final void ensureCapacity(int i2, int i3) {
        if (i2 > 131072) {
            throw new IllegalArgumentException(("Requested item capacity " + i2 + " is larger than max supported: 131072!").toString());
        }
        int[] iArr = this.lanes;
        if (iArr.length < i2) {
            int length = iArr.length;
            while (length < i2) {
                length *= 2;
            }
            this.lanes = ArraysKt.copyInto$default(this.lanes, new int[length], i3, 0, 0, 12, (Object) null);
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridLaneInfo.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԃt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʡ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YtJ4\rhbB.-\"A'\u0013(R\u0006EqV", "", "u(E", "\u0014t[9F7:\\", "", "\u001b`g\u0010T7:Q\u001d\u000e\u000f", "#mb2g", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
