package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: LazyGridMeasureResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u0015lrˎ8DsQ6ɟ[*\u001dp\u00044*\\,qY;]ڼ\u0006\"\u001fOVgmnRZ!C\u0017\u0006,xr,OU\u0001] -:B\u0006?;M\u0006=Aś|6\u001b :\">|\r\u00010*P\u0010|~KK\u001a48@\u0007:Z\rS$\"\u0012\u001c>(\u0001,\\oNLHt]@2+\u0003\u007fBV'e9\u0003ձ#Ͽ\u0005';u\u0012\u001eY@w\u0098\u00145Y\u0011\bj]U\u0002msM\tv*?+wwg:f\u0005,\u0015YU\u001da\u0001-t\u0005\u007fh\u001c+9X{K~\u000e8{\t\u0006%<2\u0014\u0016+V9E\u001a\u0015\u0014\u001e7\u0003\u007fk@~\u0010nF\u000e\ny6E)\u0010d9I3\u0014arK(|;߉\t\u0017$5\u0011t'nd\u0010f\u001bAh\beAcPKXZ\u001a[Mm2tr\u0004:\u0004^^.E*&\\(5AiQ;'{\u0004XD\u0016\u00103uxWwl`@Pr&;8$$Zrh\u0015o^pp,?Q,X\u0015\u001b \u0013Nb\b@/C(N}\byn[}\"%]jG]|\r&Wgbۋ9Qq2*Y\u0005mW<\u0011O\u001fٿA\u001c\u0018h7@\"`N\u001b\u0014\u0006W\\N:\u0017\u0003Q\u007f<L,_\u001d3ĀJҴ\"HIґ!a`\f\u001e#%O2(\u00020\u0005\u000b\u0011P\u000b\u0018\u007fi\tIZ\u0001\u000fH\u0004ۢTڤ\u001d*m$n\\\u000bLW\u0011\u0002*_gzK\u0003Al\u0085Wދ$\u001a2;WZK7_\u000e7^\u001a-sR)*˛Q\u0016?|\u0003'\u001di9Fu\r\u0003pZfA߁[ݚ\u001b.~ܥ\u000b%\u000e\u0014\u000e(\u0002H\u0001wq\u0006[sLP\u000b\u0003\bD%̂\tġ#*-˚\b$\u0003g;vG\u001f\u001c,\"depkt\b.(nϪ*zmֽDe\u001c&p\t.AIEaY-Lѐ(r\u000bܩ`l}@PB\u0005\u001eAIYf\u0007UfOߵ3\u0004n߿D\u000fv\u0011iuc\b\f7F_Xw\u001aͦ ڎG1\u0019\u07bdkis*Y\u0001+L\u0015G\u0019:\u0002~ [U \u0005[9ו3Ӓw\u001cNCA#\u0013`Y6BMT\b9G+ɂ\bخ~\u0006Nܪ'\u00198\u0004\u0002_' b\u0017tVv$7ѻbՃ.\u0007\u0007۰K ~w?H>\u0003b?{_\u0011d-\u0018Inˍ\u0003p+=TZ?.8Z\u0007\u0011kqS]\u0012H\u0014U9y{q\u001c8F\u0001-D(\u001bgh?u%E\r\u001cڀhTlɺ*hX\u00130nO\n\u000b\u0018T\n=\u0011ĢSxwۮENT>Eqj\u0013%aA\u0007:\u0003:́\u001dұ\n;5֑al\u001an\n\u0006$`\fP837\u0006\u0005!\u000b!\u001eh\u001a]I\u0005,pDs֒\r\u0013Vk:\u0003!ƪu˹2\fNQ\b\u007f\u0010X/hy\u00079@U/˭\nHSЕ\u0011\fi:q\u0013&\u001d\u0011\u0003IV(r\u0004Ƿ\u001fԷ+S6߾p\\@_aD)#\u000e/-&M:^Ԋ+֤SipҴ\u0004Qa\\9S<Bo\u0002HRLOUNLù,ƍ'ֽπUL̡h\rtnH*\u001c2;:r\u000f$)B\u0001Uĳ`ǚ\u0017:Nݱ6f5\f'C,%Ux\u001f\nUK6!_km0\u000e\u05cf\rÃ,|\u0019ܛRdzU8\u0019Y\u0003\u000e?D-tX\u0014Ժ*ڵ(q|\u0005,$S\\܅\b5\u0019\u0011\u0017˱vf\u001fF\\ ;ՆU\u0010"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'4L\\<caH", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l` \u0003w6^\u0006\u000bPMX\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "4ha@g\u001dBa\u001d{\u0002^\u0013\u0001\u0012/", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F3R5\\(", "4ha@g\u001dBa\u001d{\u0002^\u0013\u0001\u0012/S}5\u0006G\b\u0001\u0018H}\u000eK", "", "1`] V9HZ _\u0005k>x\u0016.", "", "1n]@h4>R\u0007|\bh3\u0004", "", ";dP@h9>@\u0019\r\u000be;", "@d\\2T:N`\u0019gz^+|\b", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "Ak^Af\u0017>`\u007f\u0003\u0004^", ">qT3X;<V|\b{h\u0019|\u0018<i\u007f9{M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ":h]2", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "Dhb6U3>7(~\u0003l\u0010\u0006\n9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F0],d(", "DhTDc6Kb\u0007\u000evk;f\n0s\u007f7", "DhTDc6Kbx\byH-}\u0017/t", "Bnc._\u0010MS!\rXh<\u0006\u0018", "@de2e:>:\u0015\u0013\u0005n;", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", ";`X;4?Ba|\u000ezf\u001a\b\u0005-i\t*", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8nc(\\\u00074GK50eRH!\trA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005x\u0005U\u001d\nIt\u0001Q wGu#\u0006N)UFgo\u0001V\u0017:I0n\u001bf!eM\u0004\"\u001e~#+wT7\n\n\u001dn|_\u0004wvK\"z&\"Hx[\u001c,k^;\u00021#J\u000fA\u0010<`\u007f5\u0003-MD.\u007ft\u000eOva\u001d^\u0002#0kU|\n\u001dB\u001dNRg~6C\u001fphb\u0018\u0017`D5#ns-)\u001f\u0010[&_?j+V\u001eW\u0002OE9%6J\u0006\fB}#\u0018\\\bQI>*\u0017]\u007f'zH!rZ\u0001\rn#&<\u0016\u0007Z\u0019x3^3\\\u0017\u0013q\u0002\u000e{gR%}H\u001e75\u007f_Wx32\b\u0015S*\t/ :C", "5dc\u000eY;>`v\t\u0004m,\u0006\u0018\u001aa~'\u007fI\u0003", "u(8", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", "u(;7T=:\u001d)\u000e~eud\u0005:;", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "5dc\u000fX-H`\u0019\\\u0005g;|\u0012>P{'zD\n\u0019", "1`] V9HZ [v\\2\u000f\u0005<d", "5dc\u0010T5,Q&\t\u0002e\tx\u00075w{5z", "u(I", "5dc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "Adc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "uY\u0018#", "5dc\u0010b5Lc!~yL*\n\u00136l", "u(5", "Adc\u0010b5Lc!~yL*\n\u00136l", "uE\u0018#", "5dc\u0010b9Hc(\u0003\u0004^\u001az\u0013:e", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.5G{*Bmk", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0016i\t(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u0018;QB\u0005R03)Jn=\u0006K,J\u00057TLM\u0013`[r\u0013", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0016i\t(i>\u000e!\u001eNY\u000f=\u0005%D", "Adc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0016i\t(i>\u000e!\u001eNY\u000f=\u0005%D", "uH\u0018#", "6dX4[;", "5dc\u0015X0@V(", "5dc\u001aT0G/,\u0003\tB;|\u0011\u001dp{&\u007fI\u0003", "5dc\u001ce0>\\(z\nb6\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r%x8\u001e\u001ew]H\u000bm5$", "5dc\u001de,?S(|}B5}\u0013\u001ce\u000f5\u007f@\u0012\u0017$", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "5dc\u001fX4>O'\u000f\b^\u0015|\t.e~", "5dc\u001fX=>`'~aZ@\u0007\u0019>", "@t[2e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001fh3>`'", "5dc _6Ma\u0004~\bE0\u0006\t", "5dc!b;:Z|\u000ezf:Z\u0013?n\u000f", "5dc#\\,P^#\f\n>5{r0f\u000e(\u000b", "DhTDc6Kb\u0007\u0003\u0010^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc#\\,P^#\f\nL0\u0012\tvY|<\u0004'M\u0019", "u(9", "5dc#\\,P^#\f\nL;x\u0016>O\u0001)\n@\u0010", "5dc#\\:BP ~^m,\u0005\u0017\u0013n\u00012", "u(;7T=:\u001d)\u000e~euc\r=tU", "EhSA[", "5dc$\\+MV", ">kP0X\nAW }\b^5", "Bqh!b\bI^ \u0013h\\9\u0007\u00106W\u00047~J\u0011&\u0004Gw\u000e8\u00055BY", "2d[AT", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private boolean canScrollForward;
    private float consumedScroll;
    private final CoroutineScope coroutineScope;
    private final Density density;
    private final LazyGridMeasuredLine firstVisibleLine;
    private int firstVisibleLineScrollOffset;
    private final int mainAxisItemSpacing;
    private final Orientation orientation;
    private final Function1<Integer, List<Pair<Integer, Constraints>>> prefetchInfoRetriever;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final int slotsPerLine;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<LazyGridMeasuredItem> visibleItemsInfo;

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

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridMeasureResult(LazyGridMeasuredLine lazyGridMeasuredLine, int i2, boolean z2, float f2, MeasureResult measureResult, boolean z3, CoroutineScope coroutineScope, Density density, int i3, Function1<? super Integer, ? extends List<Pair<Integer, Constraints>>> function1, List<LazyGridMeasuredItem> list, int i4, int i5, int i6, boolean z4, Orientation orientation, int i7, int i8) {
        this.firstVisibleLine = lazyGridMeasuredLine;
        this.firstVisibleLineScrollOffset = i2;
        this.canScrollForward = z2;
        this.consumedScroll = f2;
        this.remeasureNeeded = z3;
        this.coroutineScope = coroutineScope;
        this.density = density;
        this.slotsPerLine = i3;
        this.prefetchInfoRetriever = function1;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i4;
        this.viewportEndOffset = i5;
        this.totalItemsCount = i6;
        this.reverseLayout = z4;
        this.orientation = orientation;
        this.afterContentPadding = i7;
        this.mainAxisItemSpacing = i8;
        this.$$delegate_0 = measureResult;
    }

    public final LazyGridMeasuredLine getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    public final void setFirstVisibleLineScrollOffset(int i2) {
        this.firstVisibleLineScrollOffset = i2;
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

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final Function1<Integer, List<Pair<Integer, Constraints>>> getPrefetchInfoRetriever() {
        return this.prefetchInfoRetriever;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public List<LazyGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final boolean getCanScrollBackward() {
        LazyGridMeasuredLine lazyGridMeasuredLine = this.firstVisibleLine;
        return ((lazyGridMeasuredLine != null ? lazyGridMeasuredLine.getIndex() : 0) == 0 && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public long mo1158getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int i2) {
        LazyGridMeasuredLine lazyGridMeasuredLine;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (!this.remeasureNeeded && !getVisibleItemsInfo().isEmpty() && (lazyGridMeasuredLine = this.firstVisibleLine) != null) {
            int mainAxisSizeWithSpacings = lazyGridMeasuredLine.getMainAxisSizeWithSpacings();
            int i3 = this.firstVisibleLineScrollOffset - i2;
            if (i3 >= 0 && i3 < mainAxisSizeWithSpacings) {
                LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) CollectionsKt.first((List) getVisibleItemsInfo());
                LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) CollectionsKt.last((List) getVisibleItemsInfo());
                if (!lazyGridMeasuredItem.getNonScrollableItem() && !lazyGridMeasuredItem2.getNonScrollableItem() && (i2 >= 0 ? Math.min(getViewportStartOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem, getOrientation()), getViewportEndOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem2, getOrientation())) > i2 : Math.min((LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem, getOrientation()) + lazyGridMeasuredItem.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem2, getOrientation()) + lazyGridMeasuredItem2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-i2))) {
                    this.firstVisibleLineScrollOffset -= i2;
                    List<LazyGridMeasuredItem> visibleItemsInfo = getVisibleItemsInfo();
                    int size = visibleItemsInfo.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        visibleItemsInfo.get(i4).applyScrollDelta(i2);
                    }
                    this.consumedScroll = i2;
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
