package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: LazyGridMeasuredItem.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<H\u0007Ӭ4\u0012\u0006јnʑA0RnP.XU2\u000f\u0002{<$a%yCIs\"}8\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4կ]xs\u0012\u00172H\u0011G3coE9fy>\u0005.2*8\u007f\n\t\u001a@H\u0018v\u0001IS\f(0Hp@S\u0013˟\u001b܅B\u0006l\u001f1\u001e\u000bg\u000fȸG|aH0;\u0003\u0018D^+m3\u0015M;Jd+\u001b{y\u001eYFG9#,k\u00035TkC\u0011G\n=3j7+9R\fWd^\u0010\u0018#5g\r\f}6`\u0013]x\fU-_gY]&(&|\f\u0017J\u0012&\f7J>-Hv6\u001dCx\u0001dXP0pR\u0006\ttN\u0019;~a/I%teyA)PG{3ټL8\u0011r/ql\u000e\u000f,+X\u0006iIQn?XR\u0018rUm2rĊ\u0006*\u0012J\u0010\f=>).Ehg_Gg9k0J\r\u0003\u0005Jxh\u0002{\u0003LN#\u0007\u0016e,O ˧Cc̆j¬Ԝ\\.\u0017\u0014*\u001cO\u000e\u0016[8^\u000e;O)@R]i\u0002j{_P9wrE#\u0007k<\u001bibA\u007fic>-\u001b\u001d\"\fTb3\u001c\u0017FaYr\\V$bLx^\u0010{rP<\u0017@\u000f\n\u001cb.a\u001dje`\u0003LD\b\u0011Q\u0014h5(~\u0003vT\u0007wq\r\t/R\rt}6\u0011IZ~\u0011&;\u0011i5G(\u0006&v\u0005\u0015#5\u0001$\u0004U dGznFyc\u00188\u0016H;\u001a;Kd'~Wu21Su\u000be\u007fOZP\tO\u0012\u000fizVg6|!<n>b[d\u00192v\rt3\nt\u007f(ctO\u000eύZ¤ZŬϗv\u0005_\u0012\\\u000fM\u0011-+=\u0001\u001e$Sމ/ϡ+\u001d\u001eߐdA#uuo\u007f0\nb=ծ#zZϽe݁sbYϡ\u0003GFUq~l$zК\u0005\u074cLj\u007f٤\u0013%B)KHof!ZFh#/,hE|cߵbݍ>\u0019wϘL0eG\u0002aN.lY=\u0011{j>Ʊoү[֥Ϡ\u000e\tν\u007f9v\u0012*^8X]\u0002\u0017PV\b&IY=x\u0004j\rzҠ.ѧ\f\u0011Kҍ\u0002\b\u0016\u001d\u000ei0\u001e%9ZsiXոX~dƇ`\u0007fin?z\u0013\r\u0010K\u001e'7\bܡoܑX5kѢ\u0019U#.)\t \u0011t*CD\u0003?qϐZ܁\u000fKeŝa\u0004<\tUO>}}\u000fP\u0018+!\u0019ɇ\u001dʦU\u0017gڻH`\u0011|rq5\t ~jNP+UҪ~ɽ@\u0010\u0017ԥ1Qx\u0018pK\u001dZ\u0006A[\u001a/\"\u001b͋\tѼ\u0001cNɑ}\u0012CVUI\u0019\u0016}ضcĺ?}\u0010¶p6\u0012\u001f9\\\u0006\u0010ҁ\u000ec#ŭ.s\u001c\u000e\u0010'cb.0FJ#t`ګ\n˩S\b;ø+`_\u0019\u0006?\u001139\u001b\u001eByjOƀoؼgn]̃Sr?\u0006\u0012n[Rsԗ3Ӱ2\u0013`Ŕ\u000b)aPp\u0011.\u001akӈ+߱\fn1ցgen\"yu{\u000f1ay]2U>\u00076}M\f&\b8o@\u0015ih\f\u000f;ԎhإAĠҋ]i܍h|\u0014)\"\u001e\u0017JdF!T\u0017\u0005,rG=)!k\rup5\u0013\u001cÕ(Ж5RG\u05cd\bD\u0019&@v?\u0005p7Kʫ,ш\rv\u0018i2dTr\u000e&5b<m\u0013\t|ɗGђF\b4ֶ^-=\u0013P l^J IlKAG\u0013?e\u000fۤ{߁\u001d;r\u070ek'0:\u000b\u001f]Y\bk\u0004:\"rIܣ1ߢnߦ̩e:ć9mT'\u001a#}L\u0005\nqv_s:bMEL{,˅\u0002ˌ#*,Ԗ\u000e%\u0006\u0003?fzsjQns\u0006\u0016|Ĥ8͍Cìڒkwݨ\u000e.q\u0018\u0002\u0006,wB\u007f\u0013\u0014GFf*[~=\u0006$ˋ{߃H\u0011]\u0016=N\u0014i\u0004-\u000b:gqn-qr{?\u0013\u001e\u0013ͫu̿>6y8\u007frN\u001bإ\u00066\u001aWiç\u0007\u001cPg\u0010>1Խ\u0011["}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F0],d(", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c42\u007f(Q\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,[6\u0002=\u001cg", "7mS2k", "", "9dh", "", "7rE2e;BQ\u0015\u0006", "", "1q^@f\bQW'l~s,", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "@de2e:>:\u0015\u0013\u0005n;", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", ">kP0X(;Z\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "DhbBT3(T\u001a\rzm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "1n]AX5MB-\nz", "/mX:T;H`", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!g", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ":`]2", "AoP;", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q5dz\f.k\u0017;\u0004/9X\u0011i5w\u001e9WQ;5D\"^xj=\u0016-\u0013J\u000b1W[-0iRpL\u0018\u001ccc2\u000fs\nUR 8TF#\u000fu0\u0006IwVp|\u00131{l\f]\fP{^_>.hDh5`CJDo4h\u000brfZDB/\u001e\u007f\u0019diZ>\u0013zO v\\\u00031nC.\u000f\u0002+:\u0002eVT9<8\n;\u0006G\u0010\u0002\"A<\u0004+|\t\r822s\u000fX=|\"B_\u001b6kH+/\u007fA$G\u0015g~{>\u001bq\u001bhQlb6-)ltAR\u0018\u0015l$k3pi\u000e\u001fN\u0013DI|jj7", "\nrTA \u0006\u0017", "1n[B`5", "5dc\u0010b3N[\"", "u(8", "5dc\u0010b5Lb&z~g;\u000bP7s_\rw\u001f\u0007", "u(9", "\u0018", "5dc\u0010b5MS\"\u000eir7|", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u0010e6Lat\u0012~l\u001a\u0001\u001e/", "5dc\u0016a+>f", "u(I", "5dc\u0018X@", "5dc\u0019T5>", ";`X;4?Ba\u007fz\u000fh<\fv3z\u007f", ";`X;4?Ba\u0007\u0003\u0010^", "5dc\u001aT0G/,\u0003\tL0\u0012\t", ";`X;4?Ba\u0007\u0003\u0010^\u001e\u0001\u00182S\u000b$yD\n\u0019%", "5dc\u001aT0G/,\u0003\tL0\u0012\t!i\u000f+iK|\u0015\u001bPq\u001c", ";`g\u001aT0G/,\u0003\tH-}\u0017/t", ";h]\u001aT0G/,\u0003\tH-}\u0017/t", "<n] V9HZ zwe,`\u0018/m", "5dc\u001bb5,Q&\t\u0002e(y\u0010/I\u000f(\u0004", "Adc\u001bb5,Q&\t\u0002e(y\u0010/I\u000f(\u0004", "uY\u0018#", "=eU@X;", "5dc\u001cY-LS(F\u0004H*zP+c", ">kP0X(;Z\u0019\rXh<\u0006\u0018", "5dc\u001d_(<S\u0015{\u0002^:Z\u0013?n\u000f", "@nf", "5dc\u001fb>", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "5dc c(G", ";`X;4?Ba", "5dc\u001aT0G/,\u0003\t&s~\u001dCY\\6", "uI\u0018\u0016", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0010<U{ 3j\u001d.#\u0007\u001f", "/o_9l\u001a<`#\u0006\u0002=,\u0004\u0018+", "", "2d[AT", "5dc\u001cY-LS(", "5dc\u001cY-LS(FWc6LX64", "uH\u0018\u0017", "5dc\u001dT9>\\(]vm(", ">kP0X", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", ">nb6g0H\\", ";`X;4?Ba\u0003\u007f{l,\f", "1q^@f\bQW'h{_:|\u0018", ":`h<h;0W\u0018\u000e}", ":`h<h;!S\u001d\u0001}m", "CoS.g,&O\u001d\bVq0\u000bo+y\n8\u000b.\u0005,\u0017", "1n_F", ";`X;4?Ba\u0001z\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "1n_F z-c\u001cL\u0001>", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuzR", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private int column;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final int span;
    private final long visualOffset;

    public /* synthetic */ LazyGridMeasuredItem(int i2, Object obj, boolean z2, int i3, int i4, boolean z3, LayoutDirection layoutDirection, int i5, int i6, List list, long j2, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, obj, z2, i3, i4, z3, layoutDirection, i5, i6, list, j2, obj2, lazyLayoutItemAnimator, j3, i7, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i2, Object obj, boolean z2, int i3, int i4, boolean z3, LayoutDirection layoutDirection, int i5, int i6, List<? extends Placeable> list, long j2, Object obj2, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, long j3, int i7, int i8) {
        long jIntSize;
        this.index = i2;
        this.key = obj;
        this.isVertical = z2;
        this.crossAxisSize = i3;
        this.reverseLayout = z3;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i5;
        this.afterContentPadding = i6;
        this.placeables = list;
        this.visualOffset = j2;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j3;
        this.lane = i7;
        this.span = i8;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Placeable placeable = (Placeable) list.get(i9);
            iMax = Math.max(iMax, isVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(iMax + i4, 0);
        if (isVertical()) {
            jIntSize = IntSizeKt.IntSize(this.crossAxisSize, iMax);
        } else {
            jIntSize = IntSizeKt.IntSize(iMax, this.crossAxisSize);
        }
        this.size = jIntSize;
        this.offset = IntOffset.Companion.m6776getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.isVertical;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public long mo1129getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getParentData(int i2) {
        return this.placeables.get(i2).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo1155getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac */
    public long mo1154getOffsetnOccac() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getOffset-Bjo55l4 */
    public long mo1130getOffsetBjo55l4(int i2) {
        return mo1154getOffsetnOccac();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z2) {
        this.nonScrollableItem = z2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int i2, int i3, int i4, int i5) {
        position(i2, i3, i4, i5, -1, -1);
    }

    public final void position(int i2, int i3, int i4, int i5, int i6, int i7) {
        long jIntOffset;
        this.mainAxisLayoutSize = isVertical() ? i5 : i4;
        if (!isVertical()) {
            i4 = i5;
        }
        if (isVertical() && this.layoutDirection == LayoutDirection.Rtl) {
            i3 = (i4 - i3) - this.crossAxisSize;
        }
        if (isVertical()) {
            jIntOffset = IntOffsetKt.IntOffset(i3, i2);
        } else {
            jIntOffset = IntOffsetKt.IntOffset(i2, i3);
        }
        this.offset = jIntOffset;
        this.row = i6;
        this.column = i7;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void updateMainAxisLayoutSize(int i2) {
        this.mainAxisLayoutSize = i2;
        this.maxMainAxisOffset = i2 + this.afterContentPadding;
    }

    public final void applyScrollDelta(int i2) {
        if (getNonScrollableItem()) {
            return;
        }
        long jMo1154getOffsetnOccac = mo1154getOffsetnOccac();
        int iM6766getXimpl = isVertical() ? IntOffset.m6766getXimpl(jMo1154getOffsetnOccac) : IntOffset.m6766getXimpl(jMo1154getOffsetnOccac) + i2;
        boolean zIsVertical = isVertical();
        int iM6767getYimpl = IntOffset.m6767getYimpl(jMo1154getOffsetnOccac);
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

    public final void place(Placeable.PlacementScope placementScope) {
        GraphicsLayer layer;
        int iM6767getYimpl;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int placeablesCount = getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            Placeable placeable = this.placeables.get(i2);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i3 = this.maxMainAxisOffset;
            long jMo1154getOffsetnOccac = mo1154getOffsetnOccac();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i2);
            if (animation != null) {
                long jM6770plusqkQi6aY = IntOffset.m6770plusqkQi6aY(jMo1154getOffsetnOccac, animation.m1177getPlacementDeltanOccac());
                if ((m1161getMainAxisgyyYBs(jMo1154getOffsetnOccac) <= mainAxisSize && m1161getMainAxisgyyYBs(jM6770plusqkQi6aY) <= mainAxisSize) || (m1161getMainAxisgyyYBs(jMo1154getOffsetnOccac) >= i3 && m1161getMainAxisgyyYBs(jM6770plusqkQi6aY) >= i3)) {
                    animation.cancelPlacementAnimation();
                }
                layer = animation.getLayer();
                jMo1154getOffsetnOccac = jM6770plusqkQi6aY;
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                int iM6766getXimpl = isVertical() ? IntOffset.m6766getXimpl(jMo1154getOffsetnOccac) : (this.mainAxisLayoutSize - IntOffset.m6766getXimpl(jMo1154getOffsetnOccac)) - getMainAxisSize(placeable);
                if (isVertical()) {
                    iM6767getYimpl = (this.mainAxisLayoutSize - IntOffset.m6767getYimpl(jMo1154getOffsetnOccac)) - getMainAxisSize(placeable);
                } else {
                    iM6767getYimpl = IntOffset.m6767getYimpl(jMo1154getOffsetnOccac);
                }
                jMo1154getOffsetnOccac = IntOffsetKt.IntOffset(iM6766getXimpl, iM6767getYimpl);
            }
            long jM6770plusqkQi6aY2 = IntOffset.m6770plusqkQi6aY(jMo1154getOffsetnOccac, this.visualOffset);
            if (animation != null) {
                animation.m1179setFinalOffsetgyyYBs(jM6770plusqkQi6aY2);
            }
            if (isVertical()) {
                if (layer != null) {
                    Placeable.PlacementScope.m5583placeWithLayeraW9wM$default(placementScope, placeable, jM6770plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
                } else {
                    Placeable.PlacementScope.m5582placeWithLayeraW9wM$default(placementScope, placeable, jM6770plusqkQi6aY2, 0.0f, (Function1) null, 6, (Object) null);
                }
            } else if (layer != null) {
                Placeable.PlacementScope.m5581placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM6770plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m5580placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM6770plusqkQi6aY2, 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m1161getMainAxisgyyYBs(long j2) {
        return isVertical() ? IntOffset.m6767getYimpl(j2) : IntOffset.m6766getXimpl(j2);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return isVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m1160copy4Tuh3kE(long j2, Function1<? super Integer, Integer> function1) {
        int iM6766getXimpl = isVertical() ? IntOffset.m6766getXimpl(j2) : function1.invoke(Integer.valueOf(IntOffset.m6766getXimpl(j2))).intValue();
        boolean zIsVertical = isVertical();
        int iM6767getYimpl = IntOffset.m6767getYimpl(j2);
        if (zIsVertical) {
            iM6767getYimpl = function1.invoke(Integer.valueOf(iM6767getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM6766getXimpl, iM6767getYimpl);
    }
}
