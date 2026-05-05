package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.Density;
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
/* JADX INFO: compiled from: LazyListMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\rnʑA0RnP\u008cZS8\u0014s{:&c$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u00144\u0001j2L]xs\u0012\u00172HsG3[\u0012E9vt>\u0005&R*8\u0010\u0005\t\u001a@H\u0018v\tCS\f(0Hp@V\u0015M\u001b\u001a\u001a\u0006D)\u0007Ȧrɡ~6vk\u000e:]#CݡA^-m1\u0015O#E\u0003)\u001dzo!C@e9%)a\b\u001fR\nE\u0013C\u007fD\u001dhU/;M\u0002`NX.\u0014%/]\u0017urTd\u0015Un\u0017?+}i[T\u001c4\u0010z*\u001aL\b\u001c\u0014?H\\<*j\u0016\u001eKt!dPZ\u0010pZ\u0006\u000bcF\u0017S\u0002a>I\u001ftey;GRG\u007f\u0013\"6#/r1_b$x\u0015IX\bU?hX=vT\u001a]K\u0006\u001cp\u0011\u001b:\b>a\u0018/*\u0015>\u001b3Rs9Q%Ƞ\u0006HR\u0004?\fn>ki\u0001\u000f\u0007̥m^K8_$Zrj5o^,p,?QLX\u0015V \u0013NbHN/?(N}l@ҫOύ\u000e+7ωO[t\t\u001cu\nzATio cbvB`Ld\u0015X\u0015F\u0002,1ٹ+ϒ6L\u0003\u0012}\u001eRq\\%@c\n\u001cb0gm3ĀJҴ\"FY~\u000f\u0005h\u0007`\u000ebY<\u0003\u0018*+MɹT`\tqm WTMx02YQc\u001f|ť.מ8\t+Ȕ\u0017u\u0006putgNr@\u0004\u0001L7$*QQ]NҘ\u000eȯɴ1\u0001βITze_{*)\u0001)\b<\f\u0001<n j\u001f47ʋVׅX#*Ԯvt)7r0\u001acL,U\u0016%\u001aiJar1f\u0084R>\u0005þ7 +4}VMD;Q?\u001dD\u0007ӄ3\u001biӠ\u0002q4/pEv\u0006s\u0005De,n\u0011SЄ6A@Ծq\u0001DY2%SZVm\u0010\bp\r\u000bن?ȈEpxމPO\u0011h\f\u0005'.\u0013+d\u0017\u000b#}:L.\u000e.Jʬ\u0001љbG=\u0013S\u0011u\f>]j&b\u000f8\u000fRϙp݁ C(݈od\u000fn\u0014\u0012hHOSz\u0005j\"zҠ.ѧ\f\u0011Kҍ\u0002\b\u0016:\u000e\u00070\u001e%=Zsi\\ոX~dƇ`\u0007f\u0007nIz\u0013\r&K\u001e';\bܡoܑX5kѢ\u0019U#K)\u0013 $thCWd;+(\u0007F\u001bGmCwHL\u0003umԹoo\u0012\u007fNQsÄ\u001bê=U)a|xlT&s\\n\u000f\u0012\u0015ZƬ&/\u0007ғ\u0015\u0010BT\u001d;ia\u0001\u0006z-zRN̖Eױ\u0005\u001dL͈\u001f\u000e\u0003/T9}\u0018CBUI\u0019\u0018}يYĺ?\u0004\u0010¶8)\nA/z(&tWu\u001bhd(j9ֆ\u000b\u0088O܀˅-Iƶv\u000eF\n<\u001f\u0010`R%lm\u0004wOD}߳nތFQpǍ\"er4|s[\u001btCn\u007f~/`\u001d7){Ai͔\\ϳ\u0015Y(ǅ)\u0002\u001af4q\u0007\u0018p|(O\u0012lGոRܣ\u0011/Gm06?Nܿ\u001e\u0007'|{ĄF\u0003'\u001d;\\ļhb"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001c\u001e\u0011vqF\u0007P,\\\u0007.V\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001b\u001a)rqHjl-XL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001c\u001e\u0011vqF\u0007b\u0010]v/\u001d", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7S}5\u0006G\b\u0001\u0018H}\u000eK", "", "1`] V9HZ _\u0005k>x\u0016.", "", "1n]@h4>R\u0007|\bh3\u0004", "", ";dP@h9>@\u0019\r\u000be;", "Aba<_3\u001bO\u0017\u0005Vf6\r\u0012>", "@d\\2T:N`\u0019gz^+|\b", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1gX9W\nH\\'\u000e\bZ0\u0006\u0018=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "Dhb6U3>7(~\u0003l\u0010\u0006\n9", "", "DhTDc6Kb\u0007\u000evk;f\n0s\u007f7", "DhTDc6Kbx\byH-}\u0017/t", "Bnc._\u0010MS!\rXh<\u0006\u0018", "@de2e:>:\u0015\u0013\u0005n;", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", ";`X;4?Ba|\u000ezf\u001a\b\u0005-i\t*", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\u0006\u0015doI\u0014c+2\u0006'O\"2!=9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013\t7|\u000b\u001c%W\u001djlPf\u001dGf\u0015\u0004Q0w\u001c:T`MKTi.m\u001f)\u001bfGD4#u\"\u001bv\u001a\f\u0014\t]!\u0002V\u0003gUE#\u00068y%idERyY;\bp\u001dU\u0004\u0003\u001c@X>;xv\u0014=.E.cKp&Bm\rj\u0011CF#72\u0006#NOj?SB\u001cwtEkqW\u001c-\"drmL\u000e\u001a'\u0015e=li\u000f7\u001c\u0007HYx\u0014#U\u0003LdC\u0017\t\u00153}rIQd>\u000e\u001epM1[ \u0007\rom\u007f\u0012|Cc\u001eo.h\u0001R$\u00112<\u0015\u000bYP\u001elOYLKsWgv3\u0014\u0003\u001aW0@[:\u0006\\PW\f#:\u0001\u0018T`d", "5dc\u000eY;>`v\t\u0004m,\u0006\u0018\u001aa~'\u007fI\u0003", "u(8", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", "u(;7T=:\u001d)\u000e~eud\u0005:;", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "5dc\u000fX-H`\u0019\\\u0005g;|\u0012>P{'zD\n\u0019", "1`] V9HZ [v\\2\u000f\u0005<d", "5dc\u0010T5,Q&\t\u0002e\tx\u00075w{5z", "u(I", "5dc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "Adc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "uY\u0018#", "5dc\u0010[0ERv\t\u0004l;\n\u00053n\u000f6CH\u000fv{CN\u0014", "u(9", "\u0018", "5dc\u0010b5Lc!~yL*\n\u00136l", "u(5", "Adc\u0010b5Lc!~yL*\n\u00136l", "uE\u0018#", "5dc\u0010b9Hc(\u0003\u0004^\u001az\u0013:e", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.5G{*Bmk", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0013t\u007f0", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7|*bW\"oB-|h]G\u0017p,MZ6GT$", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0013t\u007f0i>\u000e!\u001eNY\u000f=\u0005%D", "Adc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0013t\u007f0i>\u000e!\u001eNY\u000f=\u0005%D", "uH\u0018#", "6dX4[;", "5dc\u0015X0@V(", "5dc\u001aT0G/,\u0003\tB;|\u0011\u001dp{&\u007fI\u0003", "5dc\u001ce0>\\(z\nb6\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r%x8\u001e\u001ew]H\u000bm5$", "5dc\u001fX4>O'\u000f\b^\u0015|\t.e~", "5dc\u001fX=>`'~aZ@\u0007\u0019>", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001fh3>`'", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "5dc V9HZ [v\\2X\u00119u\t7", "5dc!b;:Z|\u000ezf:Z\u0013?n\u000f", "5dc#\\,P^#\f\n>5{r0f\u000e(\u000b", "DhTDc6Kb\u0007\u0003\u0010^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc#\\,P^#\f\nL0\u0012\tvY|<\u0004'M\u0019", "5dc#\\,P^#\f\nL;x\u0016>O\u0001)\n@\u0010", "5dc#\\:BP ~^m,\u0005\u0017\u0013n\u00012", "u(;7T=:\u001d)\u000e~euc\r=tU", "EhSA[", "5dc$\\+MV", ">kP0X\nAW }\b^5", "Bqh!b\bI^ \u0013h\\9\u0007\u00106W\u00047~J\u0011&\u0004Gw\u000e8\u00055BY", "2d[AT", "CoS.g,\u001a\\\u001d\u0007vm0\u0007\u0012=", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private boolean canScrollForward;
    private final long childConstraints;
    private float consumedScroll;
    private final CoroutineScope coroutineScope;
    private final Density density;
    private final LazyListMeasuredItem firstVisibleItem;
    private int firstVisibleItemScrollOffset;
    private final int mainAxisItemSpacing;
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<LazyListMeasuredItem> visibleItemsInfo;

    public /* synthetic */ LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i2, boolean z2, float f2, MeasureResult measureResult, float f3, boolean z3, CoroutineScope coroutineScope, Density density, long j2, List list, int i3, int i4, int i5, boolean z4, Orientation orientation, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyListMeasuredItem, i2, z2, f2, measureResult, f3, z3, coroutineScope, density, j2, list, i3, i4, i5, z4, orientation, i6, i7);
    }

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

    private LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i2, boolean z2, float f2, MeasureResult measureResult, float f3, boolean z3, CoroutineScope coroutineScope, Density density, long j2, List<LazyListMeasuredItem> list, int i3, int i4, int i5, boolean z4, Orientation orientation, int i6, int i7) {
        this.firstVisibleItem = lazyListMeasuredItem;
        this.firstVisibleItemScrollOffset = i2;
        this.canScrollForward = z2;
        this.consumedScroll = f2;
        this.scrollBackAmount = f3;
        this.remeasureNeeded = z3;
        this.coroutineScope = coroutineScope;
        this.density = density;
        this.childConstraints = j2;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i3;
        this.viewportEndOffset = i4;
        this.totalItemsCount = i5;
        this.reverseLayout = z4;
        this.orientation = orientation;
        this.afterContentPadding = i6;
        this.mainAxisItemSpacing = i7;
        this.$$delegate_0 = measureResult;
    }

    public final LazyListMeasuredItem getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    public final void setFirstVisibleItemScrollOffset(int i2) {
        this.firstVisibleItemScrollOffset = i2;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final void setCanScrollForward(boolean z2) {
        this.canScrollForward = z2;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final void setConsumedScroll(float f2) {
        this.consumedScroll = f2;
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m1126getChildConstraintsmsEJaDk() {
        return this.childConstraints;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public List<LazyListMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final boolean getCanScrollBackward() {
        LazyListMeasuredItem lazyListMeasuredItem = this.firstVisibleItem;
        return ((lazyListMeasuredItem != null ? lazyListMeasuredItem.getIndex() : 0) == 0 && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public long mo1123getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int i2, boolean z2) {
        LazyListMeasuredItem lazyListMeasuredItem;
        boolean z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        if (!this.remeasureNeeded && !getVisibleItemsInfo().isEmpty() && (lazyListMeasuredItem = this.firstVisibleItem) != null) {
            int mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
            int i3 = this.firstVisibleItemScrollOffset - i2;
            if (i3 >= 0 && i3 < mainAxisSizeWithSpacings) {
                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) CollectionsKt.first((List) getVisibleItemsInfo());
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) CollectionsKt.last((List) getVisibleItemsInfo());
                if (!lazyListMeasuredItem2.getNonScrollableItem() && !lazyListMeasuredItem3.getNonScrollableItem() && (i2 >= 0 ? Math.min(getViewportStartOffset() - lazyListMeasuredItem2.getOffset(), getViewportEndOffset() - lazyListMeasuredItem3.getOffset()) > i2 : Math.min((lazyListMeasuredItem2.getOffset() + lazyListMeasuredItem2.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (lazyListMeasuredItem3.getOffset() + lazyListMeasuredItem3.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-i2))) {
                    this.firstVisibleItemScrollOffset -= i2;
                    List<LazyListMeasuredItem> visibleItemsInfo = getVisibleItemsInfo();
                    int size = visibleItemsInfo.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        visibleItemsInfo.get(i4).applyScrollDelta(i2, z2);
                    }
                    this.consumedScroll = i2;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    if (!this.canScrollForward && i2 > 0) {
                        this.canScrollForward = true;
                    }
                }
            }
        }
        return z3;
    }
}
