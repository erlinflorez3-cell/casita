package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
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
/* JADX INFO: compiled from: PagerScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r'4ߚ\u007f\u0007|jA0JrP.`\\2\u000fq{<$q$yCAX\"}0\tWNmhvJp\u000bK\u000f\f\u001c\u0001jBI]ތc܈%˰rom2\u000e\u000fM?ftD\u000582P9\n\u000b\u0007\u001a8J(v)F[\u0010 4XphWҫQ\u0005(\u0018NJ.\u001e6\\\u0016lfLz|R/Q\u00042V\\Gw0+N=JbH%v\u0010@[DEX-%\u0002\u0004Ofic\u001b? [5l5JCI\"Xf\\\u000e9-+}\u0010&\t4\u0003\u001dQ\u000f*W/]\u000bcP<)(~\n2T\u0004<\tmHv9(\u000f \u000ea\u0013#WNu\u001a^p\u0003CmD@=\u007faIi\u001ft{y;Gy\b%\u0013\r6#/oQ_b\u0015x\u0015IU.\u0016o\u0012\u0017ׇʿN̆]Mu\u0006vn\u00107\u001c2M\b=\u000510\u001d/Ef\nL/m\u001aHrj'\tnoki\u0001Kvf-V\u000eѮ\u00ad\fʑHt\rmVff?)O\"b\u0015\r(\u0015&l\u0006Mq1\u001ebgh\u0018\u007f$έ\u0016ɻ3f?ժ?y\u001cmQ`I4\u007fbfУ^λ\u0018?DϵUgtYk\f\tt͈&8PК(y\u0002]\\&cAMu44Z6Ǭ`\u001bPґ6DG\u0018\u0017{˜l<"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)iA(\u001coLC\u0015g;R\u00010\u001d", "", "1ta?X5M>\u0015\u0001z", "", "1ta?X5M>\u0015\u0001zH-}\u0017/t`5w>\u0010\u001b!P", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)z0-\u0015>", "uH5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\t\u001c9m#w8?=kA\f$dp9\\'\u001d", "\nrTA \u0006\u0017", "5dc\u0010h9KS\"\u000eeZ.|", "u(8", "Adc\u0010h9KS\"\u000eeZ.|", "uH\u0018#", "1ta?X5M>\u0015\u0001z\u001d+|\u0010/g{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0004@|\u0004=IR;A", "5dc\u0010h9KS\"\u000eeZ.|r0f\u000e(\u000b!\u000e\u0013\u0015Vs\u0018E", "u(5", "Adc\u0010h9KS\"\u000eeZ.|r0f\u000e(\u000b!\u000e\u0013\u0015Vs\u0018E", "uE\u0018#", "1ta?X5M>\u0015\u0001zH-}\u0017/t`5w>\u0010\u001b!P.\r<}%7U\r ", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "6`S\u0013\\9Lb\u0002\t\n>4\b\u0018CL{<\u0006P\u0010", "", ":`bA>5He\"\\\u000bk9|\u0012>P{*{&\u0001+", "<dP?X:M@\u0015\b|^\u001a\f\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;7v#TL\\;IN{?\u0014\u007fi\n]+b", "5dc\u001bX(KS'\u000egZ5~\t\u001dt{7{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u0010GH[,ja_9\u001d\u0014Z{]'\u001c\u0005/", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~dy\"7z_\u0019IE;x\"-\u0011wa\u000f", "/o_9l\u001a<`#\u0006\u0002=,\u0004\u0018+", "", "2d[AT", ";`c0[\u0017:U\u0019p~m/b\tC", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP\"gI2{duC\u0017r\u0010]v/2YX=`QrJi", "7mS2k", "@d`BX:M>#\r~m0\u0007\u0012\u000bn~\t\u0006M\u0003\u0017&.k\u001cK\\.?k\u0007\u00067\u0002", "=eU@X;\u001f`\u0015|\nb6\u0006", "CoS.g,", ">`V2", "CoS.g,\u001cc&\fzg;g\u00051ei)|N\u0001&wTk\fKz/>", "CoS.g,\u001f`#\u0007b^(\u000b\u0019<el(\nP\b&", ";dP@h9>@\u0019\r\u000be;", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP#k0,%ua&\u0007q<U\u0006|", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PagerScrollPosition {
    public static final int $stable = 8;
    private final MutableIntState currentPage$delegate;
    private final MutableFloatState currentPageOffsetFraction$delegate;
    private boolean hadFirstNotEmptyLayout;
    private Object lastKnownCurrentPageKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final PagerState state;

    public PagerScrollPosition(int i2, float f2, PagerState pagerState) {
        this.state = pagerState;
        this.currentPage$delegate = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.currentPageOffsetFraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i2, 30, 100);
    }

    public /* synthetic */ PagerScrollPosition(int i2, float f2, PagerState pagerState, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (1 | i3) != 0 ? 0 : i2, (i3 & 2) != 0 ? 0.0f : f2, pagerState);
    }

    public final PagerState getState() {
        return this.state;
    }

    private final void setCurrentPage(int i2) {
        this.currentPage$delegate.setIntValue(i2);
    }

    public final int getCurrentPage() {
        return this.currentPage$delegate.getIntValue();
    }

    private final void setCurrentPageOffsetFraction(float f2) {
        this.currentPageOffsetFraction$delegate.setFloatValue(f2);
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction$delegate.getFloatValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final void updateFromMeasureResult(PagerMeasureResult pagerMeasureResult) {
        MeasuredPage currentPage = pagerMeasureResult.getCurrentPage();
        this.lastKnownCurrentPageKey = currentPage != null ? currentPage.getKey() : null;
        if (this.hadFirstNotEmptyLayout || !pagerMeasureResult.getVisiblePagesInfo().isEmpty()) {
            this.hadFirstNotEmptyLayout = true;
            MeasuredPage currentPage2 = pagerMeasureResult.getCurrentPage();
            update(currentPage2 != null ? currentPage2.getIndex() : 0, pagerMeasureResult.getCurrentPageOffsetFraction());
        }
    }

    public final void requestPositionAndForgetLastKnownKey(int i2, float f2) {
        update(i2, f2);
        this.lastKnownCurrentPageKey = null;
    }

    public final int matchPageWithKey(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2) {
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(pagerLazyLayoutItemProvider, this.lastKnownCurrentPageKey, i2);
        if (i2 != iFindIndexByKey) {
            setCurrentPage(iFindIndexByKey);
            this.nearestRangeState.update(i2);
        }
        return iFindIndexByKey;
    }

    private final void update(int i2, float f2) {
        setCurrentPage(i2);
        this.nearestRangeState.update(i2);
        setCurrentPageOffsetFraction(f2);
    }

    public final void updateCurrentPageOffsetFraction(float f2) {
        setCurrentPageOffsetFraction(f2);
    }

    public final void applyScrollDelta(int i2) {
        setCurrentPageOffsetFraction(getCurrentPageOffsetFraction() + (this.state.getPageSizeWithSpacing$foundation_release() == 0 ? 0.0f : i2 / this.state.getPageSizeWithSpacing$foundation_release()));
    }
}
