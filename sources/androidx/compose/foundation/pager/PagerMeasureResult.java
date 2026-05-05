package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: PagerMeasureResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<`\u0007\"B\u0012\u007fјnjG6LeN/ZS@\u000fs{:%c$\u007fLCU \u007f*\t]SogtKb\u000bY\u000f\u000e\u0016~m4Ikxe\u0012\u00154JoMUUoS9ht<&(288\u0002\u0005\u0017\u001a2H\u001ev\u0003Ca\f\u001a0FtBR#M\r\u001a\u0018\u000eDĨ\u0017Ȧ\rg|5xl\f:oފ\u0002yL\\(w6\rO\u001dF\u0003*;xq\"9DO5C*c\u0007\u0015Xs?1D\u0002A\u0013o?'YN\u0004[D`\u0018\u0014C4_\u0011k|>\\3Vp\u001056gcyU\u001e,\u0006\u0007\u0014\rj\u0011\u001e\n5VF-Hk\u0018\u0014A\u0004\u000bUVO0aR\u0006\tqN\u0019;~a.I\u001ftby;G`G\u007f\u0013 6#/s1_b\"x\u0015Ia\bU?fX=vd\u001a]K\u0005\u001cp\u0011\u0002:\b>_\u0018/*\u001e>#+7iR;'{\u0004XD\u0016y3bx_oRVZ:t&9:\t:]rf\u0015o^op,?iɟX\u0007\f%['jOT!SX\u0015яg2v[6\"%]sg]|E&Wgc\u0004G_j(a\u0001{j͊>И\t^n̻k\u000e`z6A\u0003dx0\u0010\bTP\u001c\u0013`a\u0002\u001eD,_\u001e\u000b6\u001fҨ!նE\u0001!a`\f\u001e#%E2(\u0002$#\u000e7%3ʰqς|MD~fH;`\"G'4m\"\u00179Sɔ\tҋw\u0006OхdIR\u0014$\u0015&\u000b.>29\u007f<sWä\u0003-J\u00043nZ\u001d6i[&?z+\u0007e\u0097t\u05cek\u0014rѱDbpu]~7$|\u000b\u0001PXs\u000e\u0015yF)cϭX\u0011cŬat\t\bJ}\t\u000e\u0013/6'\u0017nP\u007fީ1I/ݴ.y\u001a_#\u0013.\u0002}?\u0012b=8KЈ\u0010Нg\"w̥i_8mF|y\u0001DV2\"SWV\u0005\u0010\u000eR\u000bD\raKofވZ>UߒG\u007fl=:DAkiS+u\u000e6>_Xvq\u007fљbI-ݎeUm&{\u0003-\u001cX\u001e\"\r\u00120\u001d\u0015εA&^̰z\u000b6?\u0002I\u0007YIu\u001d<7)\u000bɽHޭ\u000fO\\ȫ\u001e\u0012\u0001:T~/\u00198}\u0002w'\u001eb6tVv\n7ѻcՃ.\u0005\u0017\u00119\\\u0007T\u0002\u0017{Nl/\u0012;Wӌ\u001f͢\u001fpWƫ~'1\u0004byk:f\u0005#E\fH ΐ8\u0086K/u \b\u000e>Y\u000b<\u0013*)?i\u0011\u000e{\u0007ͳ\rڀhTlɺ*hX\u00110HO\n\u000b&T\n=\u0018ĢSxwۮENT;Emj\u0013%PA\u0007:\n:́\u001dұ\n;5֑al\u001ak\n\u0002$`\fM837\u0006\u0005!\u000b\u001f\u001eh\u001a]I\u0003,pD)֒\r\u0013Vi:\u0003!ƪu˹2\fNQ\b}\u0010^/ky\r9@UACހDƑl~\u0012ɨ\u0005et\"\u0019P7Cd\u0005\u0007-~\"_߇Oܻ\u0017^bϐ)U&'\u001f\u001fd-4nN\b\u0011yF$:׃rךN܀ķ*.֗.eI2Xo\fqJ\b\u00124l(C@-\u05fd@Ŝ\rbt܀o\u0010d>6\u0004E$7\u0015\u0015\u0005X`!\u0013bI! ;Ԍ9ق#a\u0015ӑx\t\n\u001aW]qA`\u001537`\u0010FĠy\u05ce\u0007>zv\u0006\u0001P(ۅ\u007fp40LÉYH&a$s\u0004݇*&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP#k0,%ua&\u0007q<U\u0006|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP\"gH(%wEB\bm\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "Dhb6U3>>\u0015\u0001zl\u0010\u0006\n9", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001U\u0016*[SHk3\t\u0011ja\u000f", ">`V2F0SS", "", ">`V2F7:Q\u001d\b|", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "DhTDc6Kb\u0007\u000evk;f\n0s\u007f7", "DhTDc6Kbx\byH-}\u0017/t", "@de2e:>:\u0015\u0013\u0005n;", "", "0dh<a+/W\u0019\u0011\u0006h9\fs+g\u007f\u0006\u0006P\n&", "4ha@g\u001dBa\u001d{\u0002^\u0017x\u000b/", "1ta?X5M>\u0015\u0001z", "1ta?X5M>\u0015\u0001zH-}\u0017/t`5w>\u0010\u001b!P", "", "4ha@g\u001dBa\u001d{\u0002^\u0017x\u000b/S}5\u0006G\b\u0001\u0018H}\u000eK", "1`] V9HZ _\u0005k>x\u0016.", "AmP=C6LW(\u0003\u0005g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e(", ";dP@h9>@\u0019\r\u000be;", "@d\\2T:N`\u0019gz^+|\b", "3wc?T\u0017:U\u0019\rW^-\u0007\u0016/", "3wc?T\u0017:U\u0019\rV_;|\u0016", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\f_'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wNMKt3\u001a$lkBPe,\\\u00067TL\\uF_v=\u001d!V\u001dR5\u0016Z=%\u0019R+3(\u00079S\u0006:{J\n \u0016@t~B \u0011Q\n\u001et=8lPb)\u0005CCEosL\f[+lG:#~m\u001b\u001b>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7\\PUxT8\u0004+)TE\u0003\u000e4X\u0002t\\-\u007fB:Cd\u00046c\u001a>4Yx!C=0%CF\u0017>^-svF\u0019r-aQ\u000flE:\u0018atgR\u0018P_\u0017iDql\u0001E\u001c\u0014GEz +O\u0001\fI\u0003\u0011\u0014q.{iXG%]V\u0001lM!l\u001b\u0007\u0002ya\u001a8\u001eHc\u001dhso;\u0017\u001a\u0005|B\u001c\u000b#+\u0015lV zK_[e\u007f+EN\u00060&/\\8@bRs\u0017_\u001b\u0005\u0019\u000erZn>\u000b2\\54A`\u0002Id=\u001a=:(#v? (@z\u007f\\Mxn\u0007+\u001e}\u001c2Z\u001fjHH\u00117JIX FnKZ\u007fK", "5dc\u000eY;>`v\t\u0004m,\u0006\u0018\u001aa~'\u007fI\u0003", "u(8", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", "u(;7T=:\u001d)\u000e~eud\u0005:;", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "5dc\u000fX-H`\u0019\\\u0005g;|\u0012>P{'zD\n\u0019", "5dc\u000fX@H\\\u0018o~^>\b\u0013<tj$}@^!'P~", "1`] V9HZ [v\\2\u000f\u0005<d", "5dc\u0010T5,Q&\t\u0002e\tx\u00075w{5z", "u(I", "5dc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "Adc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "uY\u0018#", "5dc\u0010b9Hc(\u0003\u0004^\u001az\u0013:e", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.5G{*Bmk", "5dc\u0010h9KS\"\u000eeZ.|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~dy\"7z_\u0016M?I{A\u001e\u0014S];\u00079", "5dc\u0010h9KS\"\u000eeZ.|r0f\u000e(\u000b!\u000e\u0013\u0015Vs\u0018E", "u(5", "Adc\u0010h9KS\"\u000eeZ.|r0f\u000e(\u000b!\u000e\u0013\u0015Vs\u0018E", "uE\u0018#", "5dc\u0012k;KO\u0004z|^:X\n>e\r", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0012k;KO\u0004z|^:Y\t0o\r(", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u001aa\u0002(", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u001aa\u0002(i>\u000e!\u001eNY\u000f=\u0005%D", "Adc\u0013\\9Lb\n\u0003\tb)\u0004\t\u001aa\u0002(i>\u000e!\u001eNY\u000f=\u0005%D", "uH\u0018#", "6dX4[;", "5dc\u0015X0@V(", "5dc\u001ce0>\\(z\nb6\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r%x8\u001e\u001ew]H\u000bm5$", "5dc\u001dT.>A\u001d\u0014z", "5dc\u001dT.>A$zxb5~", "5dc\u001fX4>O'\u000f\b^\u0015|\t.e~", "5dc\u001fX=>`'~aZ@\u0007\u0019>", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001fh3>`'", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "5dc a(I>#\r~m0\u0007\u0012", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\rIt0) lj;PQ5J\u0002\u0012QZR;`\\{\u0013", "5dc#\\,P^#\f\n>5{r0f\u000e(\u000b", "DhTDc6Kb\u0007\u0003\u0010^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc#\\,P^#\f\nL0\u0012\tvY|<\u0004'M\u0019", "u(9", "5dc#\\,P^#\f\nL;x\u0016>O\u0001)\n@\u0010", "5dc#\\:BP ~eZ.|\u0017\u0013n\u00012", "EhSA[", "5dc$\\+MV", ">kP0X\nAW }\b^5", "Bqh!b\bI^ \u0013h\\9\u0007\u00106W\u00047~J\u0011&\u0004Gw\u000e8\u00055BY", "2d[AT", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private final int beyondViewportPageCount;
    private boolean canScrollForward;
    private final CoroutineScope coroutineScope;
    private final MeasuredPage currentPage;
    private float currentPageOffsetFraction;
    private final List<MeasuredPage> extraPagesAfter;
    private final List<MeasuredPage> extraPagesBefore;
    private final MeasuredPage firstVisiblePage;
    private int firstVisiblePageScrollOffset;
    private final Orientation orientation;
    private final int pageSize;
    private final int pageSpacing;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final SnapPosition snapPosition;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<MeasuredPage> visiblePagesInfo;

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.$$delegate_0.getAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.$$delegate_0.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Function1<RulerScope, Unit> getRulers() {
        return this.$$delegate_0.getRulers();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.$$delegate_0.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.$$delegate_0.placeChildren();
    }

    public PagerMeasureResult(List<MeasuredPage> list, int i2, int i3, int i4, Orientation orientation, int i5, int i6, boolean z2, int i7, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f2, int i8, boolean z3, SnapPosition snapPosition, MeasureResult measureResult, boolean z4, List<MeasuredPage> list2, List<MeasuredPage> list3, CoroutineScope coroutineScope) {
        this.visiblePagesInfo = list;
        this.pageSize = i2;
        this.pageSpacing = i3;
        this.afterContentPadding = i4;
        this.orientation = orientation;
        this.viewportStartOffset = i5;
        this.viewportEndOffset = i6;
        this.reverseLayout = z2;
        this.beyondViewportPageCount = i7;
        this.firstVisiblePage = measuredPage;
        this.currentPage = measuredPage2;
        this.currentPageOffsetFraction = f2;
        this.firstVisiblePageScrollOffset = i8;
        this.canScrollForward = z3;
        this.snapPosition = snapPosition;
        this.remeasureNeeded = z4;
        this.extraPagesBefore = list2;
        this.extraPagesAfter = list3;
        this.coroutineScope = coroutineScope;
        this.$$delegate_0 = measureResult;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public List<MeasuredPage> getVisiblePagesInfo() {
        return this.visiblePagesInfo;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeyondViewportPageCount() {
        return this.beyondViewportPageCount;
    }

    public final MeasuredPage getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    public final MeasuredPage getCurrentPage() {
        return this.currentPage;
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    public final void setCurrentPageOffsetFraction(float f2) {
        this.currentPageOffsetFraction = f2;
    }

    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    public final void setFirstVisiblePageScrollOffset(int i2) {
        this.firstVisiblePageScrollOffset = i2;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final void setCanScrollForward(boolean z2) {
        this.canScrollForward = z2;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public SnapPosition getSnapPosition() {
        return this.snapPosition;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    public /* synthetic */ PagerMeasureResult(List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6, boolean z2, int i7, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f2, int i8, boolean z3, SnapPosition snapPosition, MeasureResult measureResult, boolean z4, List list2, List list3, CoroutineScope coroutineScope, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i2, i3, i4, orientation, i5, i6, z2, i7, measuredPage, measuredPage2, f2, i8, z3, snapPosition, measureResult, z4, (-1) - (((-1) - i9) | ((-1) - 131072)) != 0 ? CollectionsKt.emptyList() : list2, (i9 & 262144) != 0 ? CollectionsKt.emptyList() : list3, coroutineScope);
    }

    public final List<MeasuredPage> getExtraPagesBefore() {
        return this.extraPagesBefore;
    }

    public final List<MeasuredPage> getExtraPagesAfter() {
        return this.extraPagesAfter;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public long mo1257getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        MeasuredPage measuredPage = this.firstVisiblePage;
        return ((measuredPage != null ? measuredPage.getIndex() : 0) == 0 && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int i2) {
        int i3;
        int pageSize = getPageSize() + getPageSpacing();
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (!this.remeasureNeeded && !getVisiblePagesInfo().isEmpty() && this.firstVisiblePage != null && (i3 = this.firstVisiblePageScrollOffset - i2) >= 0 && i3 < pageSize) {
            float f2 = pageSize != 0 ? i2 / pageSize : 0.0f;
            float f3 = this.currentPageOffsetFraction - f2;
            if (this.currentPage != null && f3 < 0.5f && f3 > -0.5f) {
                MeasuredPage measuredPage = (MeasuredPage) CollectionsKt.first((List) getVisiblePagesInfo());
                MeasuredPage measuredPage2 = (MeasuredPage) CollectionsKt.last((List) getVisiblePagesInfo());
                if (i2 >= 0 ? Math.min(getViewportStartOffset() - measuredPage.getOffset(), getViewportEndOffset() - measuredPage2.getOffset()) > i2 : Math.min((measuredPage.getOffset() + pageSize) - getViewportStartOffset(), (measuredPage2.getOffset() + pageSize) - getViewportEndOffset()) > (-i2)) {
                    this.currentPageOffsetFraction -= f2;
                    this.firstVisiblePageScrollOffset -= i2;
                    List<MeasuredPage> visiblePagesInfo = getVisiblePagesInfo();
                    int size = visiblePagesInfo.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        visiblePagesInfo.get(i4).applyScrollDelta(i2);
                    }
                    List<MeasuredPage> list = this.extraPagesBefore;
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        list.get(i5).applyScrollDelta(i2);
                    }
                    List<MeasuredPage> list2 = this.extraPagesAfter;
                    int size3 = list2.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        list2.get(i6).applyScrollDelta(i2);
                    }
                    z2 = true;
                    z2 = true;
                    z2 = true;
                    if (!this.canScrollForward && i2 > 0) {
                        this.canScrollForward = true;
                    }
                }
            }
        }
        return z2;
    }
}
