package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<H\u0007Ӭ4\u0012\u0006јnʑA0R\u0004P.hS2şs{B-c$wHCU0}*ޛWN}gvJ`&K\u000f\u001c\u0016\u0001j2L]xs\u0012\u00172HtG3[oE9fy>\u000562*\u0600\u0002\u0005\u0017\u001a2H\u0016z\u0003CY\u0018\u001a0FqBR#M\r\u001a\u0018\u0007DĨ\u0017Ȧ\rg|5xl\f:o\u0015\u0013mPO?_^~]\u0011TW?\r%e.5N<M\u001b5U\u0013\u0007\u0001bm\tOuK\r\u0001'U4Ywe@p\u007fB\u0017;S\u001bh\u000b&\u000b\u0007ad\u001a3CO\u0012M`\u00126\u0005\u0013{;>\u0014\u0012\u00145`.[\u001cv\u000e\u001cB\rti?~\u0006nL\u000e\u000by<''\u00103YݍIwaeI+f7*\u0018ڟ\"#\u000f\u0003igbLx\u0015I\u0014(U?\u0012X=vPRtK/\u001cp\u00113Z\b>H\u0018/*\u0013t+ğ6Z߶\"ܩȠ\u0006JJ*\u0005H)xa.jJV!\u001d\u001ag.\u0017\rrD\u0013\u00072d\u001dl:Ve\u001c\u0003F.\f!ftwjhU\u0014\\\u0018\u0001i\u0019\u0017&&3y~7\b.\u001c\u0012esv3cS\u0014\u0014o\u001e\u000f\u0014m>\u0013\tf\u000bZS:\\%N0|`j>7,H\\1+2msL8:}1\\CJ3\"P\u000f\u0015\t\u000e\\\u0019\u0014\r#K$1kj\tQ\u0007^,\to\u0016I\u0010@El0~YQcXVY0\rL|Q\tG\u001d\u000e\u001a\u007fLu}\u0015\u0016$\u0007,0$mQ]??#\u000f-+B\u0004=Ezt\u0014&\u0014ȿ-ю{Ȫӛ?j4=\u0016AA8nxbO\u0003\u0019xԱ`ѓ'\blрJsT\u000b_id\rk>wͿ1j\u0013ҁ:٫\t\u001f&ݒQ{0\nM-q)sȹyӄ3\u0015iӠ:\n<\fz\u000fT\b<ה.ќ\u0015˱ΞP\\щ?@QY\rU:&r\u0018P^;\f\u0016Q!6#2vE;ݼXиQ\u00117̎~\t2%~o,I!\n\u00164\\aͫwI\u0006жvE+,[o8\u007f{Lt\u000bx\u0011`α}ϥr\u0018$ܻ8X]\u007f\u0017LV\u0006&>Y;\u0011\u000e\u0013ʖ&Ҭ0B\u0010Ձ[Vo\u000e\u001e\u0019P^m./2p|\u0012٠\u001a֭|h^ޠ\u001dbK\u007f/H!\u0001\u0015S,\u001a\u0006C\u0013p^T]g\t݃U\u009b\r!rʪ\u0017h+MRm\n-6c\u0019\u000bs_\u001a͉\u0004\u0530\bM1Ԗ\u0004q\u0012[&\u0019mN&?QQ?aMѭjκYdVІG!twf\"W\u00011Aɽ@\u000e'\r\u001fu\u0001\f3<Zu\u00107q\u001cݨ\u001bJ1܍$~in)IVG;fajB)R\u0090Uȯ\u0002\u000e(é?\u0006zKjs^r\u0018\t3:Dslȋ\u000eƤ\u0017P(Ɍ~V\u0003\u001f\".68&ב?ě\u0017^aŕH9NTCl4K\"Ь\u0005Ơgxkߛm\r\t\u0015?t\u001ap3\u007f+*wq<EpZhB\u0004$fA\u0018\u0014CW]\u0007^Ԋ5\u05faNɪإojϪ_\u00153/yAy36\u0006,\u0014o\f\u0004\tBZ8\u0017KV{E\u0013\u000f3֯DŃ\u0012^r۪5\u0007\u001a],|-J\u0015ei̡Hޔ\"hG9\u001fTi)\u0018z\u0015:]ITX\bĳAن6ָҜn'϶\u0015\u000bBb\u0003\u0017BD\u000f+\u000e}|?T`U\u001aU[zݽf݁*QMЯZ\n2J\u001c-\u007fpFZV\\H\u001ecQarOQẄ́:۰s\u000b17p\raaz\u0018\u000b(%?(3\u0014:\">)ݏ/e\u0378\u001d˓j?=7kt5I֎eS\u0007PiȠ+\u0010+Q5K=ÂY\u0018"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA#RS7']", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Yq]+\u0015hbB.D", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,[6\u0002=\u001cg", "7mS2k", "", "9dh", "", ">kP0X(;Z\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "7rE2e;BQ\u0015\u0006", "", "AoP0\\5@", ":`]2", "AoP;", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "1n]AX5MB-\nz", "/mX:T;H`", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!g", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u001eKz,~@\u0002.FC\u000b\u00121'\u001fO\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ-S\u0012Dg|\u001b\u001a\u0018>4w>k$\u0011\u0001\u0011\nK9w\u0010@[\u000f[(Av4t\u001bC,\\B\u0016-\u0018y\u0015*r]\u0004nbY\u001b\u0002Y}p1L*\u0003\u0002(G|[SNk\\\u0006S' G\f~!\u0010b}9\u0004:\u001429@qlGt\u001e>kNX\u001d", "5dc\u0010b5Lb&z~g;\u000bP7s_\rw\u001f\u0007", "u(9", "\u0018", "5dc\u0010b5MS\"\u000eir7|", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1q^@f\bQW'l~s,", "5dc\u0010e6Lat\u0012~l\u001a\u0001\u001e/", "u(8", "5dc\u0016a+>f", "u(I", "7rE6f0;Z\u0019", "Adc#\\:BP ~", "uY\u0018#", "5dc\u0018X@", "5dc\u0019T5>", ";`X;4?Ba\u007fz\u000fh<\fv3z\u007f", ";`X;4?Ba\u0003\u007f{l,\f", "5dc\u001aT0G/,\u0003\tH-}\u0017/t", ";`X;4?Ba\u0007\u0003\u0010^", "5dc\u001aT0G/,\u0003\tL0\u0012\t", ";`X;4?Ba\u0007\u0003\u0010^\u001e\u0001\u00182S\u000b$yD\n\u0019%", "5dc\u001aT0G/,\u0003\tL0\u0012\t!i\u000f+iK|\u0015\u001bPq\u001c", ";`g\u001aT0G/,\u0003\tH-}\u0017/t", ";h]\u001aT0G/,\u0003\tH-}\u0017/t", "<n] V9HZ zwe,`\u0018/m", "5dc\u001bb5,Q&\t\u0002e(y\u0010/I\u000f(\u0004", "Adc\u001bb5,Q&\t\u0002e(y\u0010/I\u000f(\u0004", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "=eU@X;", "5dc\u001cY-LS(F\u0004H*zP+c", ">kP0X(;Z\u0019\rXh<\u0006\u0018", "5dc\u001d_(<S\u0015{\u0002^:Z\u0013?n\u000f", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "5dc c(G", ";`X;4?Ba", "5dc\u001aT0G/,\u0003\t&s~\u001dCY\\6", "uI\u0018\u0016", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0010<U{ 3j\u001d.#\u0007\u001f", "/o_9l\u001a<`#\u0006\u0002=,\u0004\u0018+", "", "2d[AT", "5dc\u001cY-LS(", "5dc\u001cY-LS(FWc6LX64", "uH\u0018\u0017", "5dc\u001dT9>\\(]vm(", ">kP0X", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "1n]AX?M", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA\u0002xMF\u001f\u001b;\u001f", ">nb6g0H\\", "1q^@f\bQW'", "1q^@f\bQW'h{_:|\u0018", ":`h<h;0W\u0018\u000e}", ":`h<h;!S\u001d\u0001}m", "BnBAe0GU", "", "CoS.g,&O\u001d\bVq0\u000bo+y\n8\u000b.\u0005,\u0017", "1n_F", ";`X;4?Ba\u0001z\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "1n_F z-c\u001cL\u0001>", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuzR", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;
    private final Object key;
    private final int lane;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final long size;
    private final int span;

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i2, Object obj, List list, boolean z2, int i3, int i4, int i5, int i6, int i7, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, obj, list, z2, i3, i4, i5, i6, i7, obj2, lazyLayoutItemAnimator, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasuredItem(int i2, Object obj, List<? extends Placeable> list, boolean z2, int i3, int i4, int i5, int i6, int i7, Object obj2, LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> lazyLayoutItemAnimator, long j2) {
        Integer numValueOf;
        long jIntSize;
        this.index = i2;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z2;
        this.lane = i4;
        this.span = i5;
        this.beforeContentPadding = i6;
        this.afterContentPadding = i7;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j2;
        int i8 = 1;
        this.isVisible = true;
        Integer numValueOf2 = null;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            numValueOf = Integer.valueOf(isVertical() ? placeable.getHeight() : placeable.getWidth());
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                int i9 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i9);
                    Integer numValueOf3 = Integer.valueOf(isVertical() ? placeable2.getHeight() : placeable2.getWidth());
                    numValueOf = numValueOf3.compareTo(numValueOf) > 0 ? numValueOf3 : numValueOf;
                    if (i9 == lastIndex) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
        Integer num = numValueOf;
        int iIntValue = num != null ? num.intValue() : 0;
        this.mainAxisSize = iIntValue;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(iIntValue + i3, 0);
        List<Placeable> list2 = this.placeables;
        if (!list2.isEmpty()) {
            Placeable placeable3 = list2.get(0);
            numValueOf2 = Integer.valueOf(isVertical() ? placeable3.getWidth() : placeable3.getHeight());
            int lastIndex2 = CollectionsKt.getLastIndex(list2);
            if (1 <= lastIndex2) {
                while (true) {
                    Placeable placeable4 = list2.get(i8);
                    Integer numValueOf4 = Integer.valueOf(isVertical() ? placeable4.getWidth() : placeable4.getHeight());
                    numValueOf2 = numValueOf4.compareTo(numValueOf2) > 0 ? numValueOf4 : numValueOf2;
                    if (i8 == lastIndex2) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        }
        Integer num2 = numValueOf2;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        this.crossAxisSize = iIntValue2;
        this.mainAxisLayoutSize = -1;
        if (isVertical()) {
            jIntSize = IntSizeKt.IntSize(iIntValue2, this.mainAxisSize);
        } else {
            jIntSize = IntSizeKt.IntSize(this.mainAxisSize, iIntValue2);
        }
        this.size = jIntSize;
        this.offset = IntOffset.Companion.m6776getZeronOccac();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public long mo1129getConstraintsmsEJaDk() {
        return this.constraints;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setVisible(boolean z2) {
        this.isVisible = z2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getParentData(int i2) {
        return this.placeables.get(i2).getParentData();
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z2) {
        this.nonScrollableItem = z2;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo1218getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac */
    public long mo1217getOffsetnOccac() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getOffset-Bjo55l4 */
    public long mo1130getOffsetBjo55l4(int i2) {
        return mo1217getOffsetnOccac();
    }

    public final void position(int i2, int i3, int i4) {
        long jIntOffset;
        this.mainAxisLayoutSize = i4;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = i4 + this.afterContentPadding;
        if (isVertical()) {
            jIntOffset = IntOffsetKt.IntOffset(i3, i2);
        } else {
            jIntOffset = IntOffsetKt.IntOffset(i2, i3);
        }
        this.offset = jIntOffset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int i2, int i3, int i4, int i5) {
        if (isVertical()) {
            i4 = i5;
        }
        position(i2, i3, i4);
    }

    public final int getMainAxisOffset() {
        return !isVertical() ? IntOffset.m6766getXimpl(mo1217getOffsetnOccac()) : IntOffset.m6767getYimpl(mo1217getOffsetnOccac());
    }

    public final void place(Placeable.PlacementScope placementScope, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        GraphicsLayer layer;
        int iM6766getXimpl;
        int iM6767getYimpl;
        if (this.mainAxisLayoutSize == -1) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable = list.get(i2);
            int height = this.minMainAxisOffset - (isVertical() ? placeable.getHeight() : placeable.getWidth());
            int i3 = this.maxMainAxisOffset;
            long jMo1217getOffsetnOccac = mo1217getOffsetnOccac();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i2);
            if (animation != null) {
                long jM6770plusqkQi6aY = IntOffset.m6770plusqkQi6aY(jMo1217getOffsetnOccac, animation.m1177getPlacementDeltanOccac());
                if ((m1235getMainAxisgyyYBs(jMo1217getOffsetnOccac) <= height && m1235getMainAxisgyyYBs(jM6770plusqkQi6aY) <= height) || (m1235getMainAxisgyyYBs(jMo1217getOffsetnOccac) >= i3 && m1235getMainAxisgyyYBs(jM6770plusqkQi6aY) >= i3)) {
                    animation.cancelPlacementAnimation();
                }
                layer = animation.getLayer();
                jMo1217getOffsetnOccac = jM6770plusqkQi6aY;
            } else {
                layer = null;
            }
            if (lazyStaggeredGridMeasureContext.getReverseLayout()) {
                if (isVertical()) {
                    iM6766getXimpl = IntOffset.m6766getXimpl(jMo1217getOffsetnOccac);
                } else {
                    iM6766getXimpl = (this.mainAxisLayoutSize - IntOffset.m6766getXimpl(jMo1217getOffsetnOccac)) - (isVertical() ? placeable.getHeight() : placeable.getWidth());
                }
                if (!isVertical()) {
                    iM6767getYimpl = IntOffset.m6767getYimpl(jMo1217getOffsetnOccac);
                } else {
                    iM6767getYimpl = (this.mainAxisLayoutSize - IntOffset.m6767getYimpl(jMo1217getOffsetnOccac)) - (isVertical() ? placeable.getHeight() : placeable.getWidth());
                }
                jMo1217getOffsetnOccac = IntOffsetKt.IntOffset(iM6766getXimpl, iM6767getYimpl);
            }
            long jM6770plusqkQi6aY2 = IntOffset.m6770plusqkQi6aY(jMo1217getOffsetnOccac, lazyStaggeredGridMeasureContext.m1222getContentOffsetnOccac());
            if (animation != null) {
                animation.m1179setFinalOffsetgyyYBs(jM6770plusqkQi6aY2);
            }
            if (layer != null) {
                Placeable.PlacementScope.m5581placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM6770plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m5580placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM6770plusqkQi6aY2, 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    public final void updateMainAxisLayoutSize(int i2) {
        this.mainAxisLayoutSize = i2;
        this.maxMainAxisOffset = i2 + this.afterContentPadding;
    }

    public final void applyScrollDelta(int i2) {
        if (getNonScrollableItem()) {
            return;
        }
        long jMo1217getOffsetnOccac = mo1217getOffsetnOccac();
        int iM6766getXimpl = isVertical() ? IntOffset.m6766getXimpl(jMo1217getOffsetnOccac) : IntOffset.m6766getXimpl(jMo1217getOffsetnOccac) + i2;
        boolean zIsVertical = isVertical();
        int iM6767getYimpl = IntOffset.m6767getYimpl(jMo1217getOffsetnOccac);
        if (zIsVertical) {
            iM6767getYimpl += i2;
        }
        this.offset = IntOffsetKt.IntOffset(iM6766getXimpl, iM6767getYimpl);
        int placeablesCount = getPlaceablesCount();
        for (int i3 = 0; i3 < placeablesCount; i3++) {
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i3);
            if (animation != null) {
                long jM1178getRawOffsetnOccac = animation.m1178getRawOffsetnOccac();
                int iM6766getXimpl2 = isVertical() ? IntOffset.m6766getXimpl(jM1178getRawOffsetnOccac) : Integer.valueOf(IntOffset.m6766getXimpl(jM1178getRawOffsetnOccac) + i2).intValue();
                boolean zIsVertical2 = isVertical();
                int iM6767getYimpl2 = IntOffset.m6767getYimpl(jM1178getRawOffsetnOccac);
                if (zIsVertical2) {
                    iM6767getYimpl2 += i2;
                }
                animation.m1181setRawOffsetgyyYBs(IntOffsetKt.IntOffset(iM6766getXimpl2, iM6767getYimpl2));
            }
        }
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m1235getMainAxisgyyYBs(long j2) {
        return isVertical() ? IntOffset.m6767getYimpl(j2) : IntOffset.m6766getXimpl(j2);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return isVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m1234copy4Tuh3kE(long j2, Function1<? super Integer, Integer> function1) {
        int iM6766getXimpl = isVertical() ? IntOffset.m6766getXimpl(j2) : function1.invoke(Integer.valueOf(IntOffset.m6766getXimpl(j2))).intValue();
        boolean zIsVertical = isVertical();
        int iM6767getYimpl = IntOffset.m6767getYimpl(j2);
        if (zIsVertical) {
            iM6767getYimpl = function1.invoke(Integer.valueOf(iM6767getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM6766getXimpl, iM6767getYimpl);
    }

    public String toString() {
        return super.toString();
    }
}
